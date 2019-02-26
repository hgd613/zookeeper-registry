# zookeeper-registry
在spring-boot环境下，把service注册到zookeeper上，搭建了三台服务器的zookeeper伪集群
配置文件如下：
config-1:
# The number of milliseconds of each tick
tickTime=2000
initLimit=10
syncLimit=5
dataDir=/home/billjiang/zookeeper/zkServer1
clientPort=2181
#cluster
server.1=127.0.0.1:2888:3888
server.2=127.0.0.1:2889:3889
server.3=127.0.0.1:2890:3890

config-2:
# The number of milliseconds of each tick
tickTime=2000
initLimit=10
syncLimit=5
dataDir=/home/billjiang/zookeeper/zkServer2
clientPort=2182
#cluster
server.1=127.0.0.1:2888:3888
server.2=127.0.0.1:2889:3889
server.3=127.0.0.1:2890:3890

config-3:
# The number of milliseconds of each tick
tickTime=2000
initLimit=10
syncLimit=5
dataDir=/home/billjiang/zookeeper/zkServer3
clientPort=2183
#cluster
server.1=127.0.0.1:2888:3888
server.2=127.0.0.1:2889:3889
server.3=127.0.0.1:2890:3890
