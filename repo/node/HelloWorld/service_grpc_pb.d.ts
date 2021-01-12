// GENERATED CODE -- DO NOT EDIT!

// package: helloworld
// file: HelloWorld/service.proto

import * as HelloWorld_service_pb from "../HelloWorld/service_pb";
import * as grpc from "grpc";

interface IHelloWorldServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  helloWorld: grpc.MethodDefinition<HelloWorld_service_pb.Request, HelloWorld_service_pb.Response>;
}

export const HelloWorldServiceService: IHelloWorldServiceService;

export class HelloWorldServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  helloWorld(argument: HelloWorld_service_pb.Request, callback: grpc.requestCallback<HelloWorld_service_pb.Response>): grpc.ClientUnaryCall;
  helloWorld(argument: HelloWorld_service_pb.Request, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<HelloWorld_service_pb.Response>): grpc.ClientUnaryCall;
  helloWorld(argument: HelloWorld_service_pb.Request, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<HelloWorld_service_pb.Response>): grpc.ClientUnaryCall;
}
