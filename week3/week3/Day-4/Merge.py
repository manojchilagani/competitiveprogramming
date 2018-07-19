def merge_arrays(arr1, arr2):
	merged = []
	while len(arr1) != 0 and len(arr2) != 0:
		if arr1[0] < arr2[0]:
			merged.append(arr1.pop(0))
		else:
			merged.append(arr2.pop(0))
	merged = merged + arr1 + arr2
	return merged