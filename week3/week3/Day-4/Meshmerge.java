import java.util.Map;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;

public class Solution {
  private static String[] reconstructPath(Map<String, String> previousNodes,
   String startNode, String endNode)
   {
    List<String> reversedShortestPath = new ArrayList<>();
    String currentNode = endNode;
    while (currentNode != null)
    {
       reversedShortestPath.add(currentNode);
       currentNode = previousNodes.get(currentNode);
    }
    Collections.reverse(reversedShortestPath);
    return reversedShortestPath.toArray(new String[reversedShortestPath.size()]);
    }
    public static String[] getPath(Map<String, String[]> graph, String startNode, String endNode)
    {
    if (!graph.containsKey(startNode))
    {
       throw new IllegalArgumentException("Start node not in graph");
    }
   if (!graph.containsKey(endNode))
    {
       throw new IllegalArgumentException("End node not in graph");
    }
    Queue<String> nodesToVisit = new ArrayDeque<>();
    nodesToVisit.add(startNode);
    Map<String, String> howWeReachedNodes = new HashMap<>();
    howWeReachedNodes.put(startNode, null);
    while (!nodesToVisit.isEmpty())
    {
    String currentNode = nodesToVisit.remove();
    if(currentNode.equals(endNode))
    {
        return reconstructPath(howWeReachedNodes, startNode, endNode);
    }
    for(String neighbor : graph.get(currentNode))
    {
    if(!howWeReachedNodes.containsKey(neighbor))
    {
        nodesToVisit.add(neighbor);
        howWeReachedNodes.put(neighbor, currentNode);
    }
    }
    }
    return null;
    }
 