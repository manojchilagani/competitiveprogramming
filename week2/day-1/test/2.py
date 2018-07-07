def ckeck_all_rooms(rooms):
    list_r = [False] * (len(rooms))
    temp = []
    list_r[0] = True

    try:

        for x in rooms[0]:
            temp.append(x)
            list_r[x] = True

        while len(temp) != 0:
            for x in rooms[temp[0]]:
                if x not in temp and list_r[x] is False:
                    temp.append(x)
                list_r[x] = True
            temp.remove(temp[0])

    except:
        return

    for x in list_r:
        if x is False:
            print(False)
            break
    else:
        print(True)
ckeck_all_rooms([[1], [0, 2], [3]])
ckeck_all_rooms([[1, 3], [3, 0, 1], [2], [0]])
ckeck_all_rooms([[1, 2, 3], [0], [0], [0]])
ckeck_all_rooms([[1], [0, 2, 4], [1, 3, 4], [2], [1, 2]])
ckeck_all_rooms([[1], [2, 3], [1, 2], [4], [1], [5]])
ckeck_all_rooms([[1], [2], [3], [4], [2]])
ckeck_all_rooms([[1], [1, 3], [2], [2, 4, 6], [], [1, 2, 3], [1]])

