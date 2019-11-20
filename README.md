[![](https://jitpack.io/v/VeriBlock/alt-integration-proto.svg)](https://jitpack.io/#VeriBlock/alt-integration-proto)

# integration.proto

This repo contains single `proto/integration.proto` file, which is used as input to automatically generate JAR with all protobuf and grpc internals.

Can be easily consumed with jitpack:

https://jitpack.io/#VeriBlock/alt-integration-proto/v1

## Release policy

Only releases may be used in dependent projects. 
Releases are tracked on [releases](https://github.com/VeriBlock/alt-integration-proto/releases) page.

Every new change in the `integration.proto` with following merge to master branch must be accompanied by a github release, with incremental versioning (e.g. v1, v2...). 

# Manual generation

## Preparation

Unzip the protoc binaries according to your OS on the package **protoc/** (to avoid any installation).
You can find other options at <https://github.com/protocolbuffers/protobuf/releases/tag/v3.9.1>

##  Generate Proto classes

#### Java
`$ ./protoc/protoc-3.9.1-?????/bin/protoc -I=proto/ --java_out=java/src/main/java/ integration.proto`

#### C++
`$ ./protoc/protoc-3.9.1-?????/bin/protoc -I=proto --cpp_out=cpp/generated integration.proto`


## Generate GRPC Services

### Java
1) Navigate to <https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.23.0/>
2) Download one. (specific to your OS)
3) Put it to the package lib/.

#### Commands
Generate services: `$ ./protoc/protoc-3.9.1-?????/bin/protoc --plugin=protoc-gen-grpc-java=protoc/protoc-gen-grpc-java-1.23.0-????? --grpc-java_out=java/src/main/java/ --proto_path=proto integration.proto`

### C++
<https://github.com/grpc/grpc/blob/master/examples/cpp/cpptutorial.md>

<https://github.com/grpc/grpc/tree/master/src/cpp>

Build grpc lib: `vcpkg install grpc --triplet x86-windows-static`

#### Commands
Generate services: `$ ./protoc/protoc-3.9.1-?????/bin/protoc --plugin=protoc-gen-grpc=protoc/grpc_cpp_plugin --grpc_out=cpp/generated --proto_path=proto integration.proto`

## Examples

### Java

#### Windows
Generate Proto classes: `.\protoc\protoc-3.9.1-win64\bin\protoc -I=proto\ --java_out=java\src\main\java\ integration.proto`

Generate services : `.\protoc\protoc-3.9.1-win64\bin\protoc --plugin=protoc-gen-grpc-java=protoc\protoc-gen-grpc-java-1.23.0-windows-x86_64.exe --grpc-java_out=java\src\main\java --proto_path=proto integration.proto`

### C++

#### Windows
Generate Proto classes: `.\protoc\protoc-3.9.1-win64\bin\protoc -I=proto\ --cpp_out=cpp\generated integration.proto`

Generate services: `.\protoc\protoc-3.9.1-win64\bin\protoc -I=proto --grpc_out=cpp\generated --plugin=protoc-gen-grpc=protoc\grpc_cpp_plugin.exe integration.proto`

## Building Java library

Prepare Java Jar package: `mvn clean install`

Result Java library is available at: `./java/target/alt-integration-proto-java-?????.jar`