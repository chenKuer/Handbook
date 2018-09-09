def latestStudent(records):
    map = collections.defaultdict(list)
    for r in records:
        map[r[0]].append(r[1:])
    mxval = -sys.maxsize-1
    sol = ''
    for k, v in map.items():
        total = 0
        n = len(v)
        for rcd in v:
            std, ct, at = rcd
            time = int(at)-int(ct)
            if time > 0:
                total += time
        avg = total/n
        for rcd in v:
            std, ct, at = rcd
            late = int(at)-int(ct)-avg
            if late > 0 and mxval <= late:
                if mxval == late:
                    if std < sol:
                        sol = std
                else:
                    mxval = late
                    sol = std
    return sol
