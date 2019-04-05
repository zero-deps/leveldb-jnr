# leveldb-jnr

LevelDB JNR adapter for Scala

## Why JNR

### JNR

```
Result "leveldb_put":
  103825.717 ±(99.9%) 1681.125 ops/s [Average]
  (min, avg, max) = (101297.721, 103825.717, 106419.440), stdev = 1868.565
  CI (99.9%): [102144.592, 105506.841] (assumes normal distribution)
# Run complete. Total time: 00:06:43
```

### JNA

```
Result "leveldb_put":
  84374.242 ±(99.9%) 2999.787 ops/s [Average]
  (min, avg, max) = (76000.265, 84374.242, 89268.061), stdev = 3334.255
  CI (99.9%): [81374.455, 87374.029] (assumes normal distribution)
# Run complete. Total time: 00:06:43
```

## Supported platforms

* OS X
* Linux x86/x64
* Windows x86/x64 (backport from [Bitcoin](https://github.com/bitcoin/bitcoin/tree/master/src/leveldb) project)