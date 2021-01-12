// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var HelloWorld_service_pb = require('../HelloWorld/service_pb.js');

function serialize_helloworld_Request(arg) {
  if (!(arg instanceof HelloWorld_service_pb.Request)) {
    throw new Error('Expected argument of type helloworld.Request');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_helloworld_Request(buffer_arg) {
  return HelloWorld_service_pb.Request.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_helloworld_Response(arg) {
  if (!(arg instanceof HelloWorld_service_pb.Response)) {
    throw new Error('Expected argument of type helloworld.Response');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_helloworld_Response(buffer_arg) {
  return HelloWorld_service_pb.Response.deserializeBinary(new Uint8Array(buffer_arg));
}


var HelloWorldServiceService = exports.HelloWorldServiceService = {
  helloWorld: {
    path: '/helloworld.HelloWorldService/HelloWorld',
    requestStream: false,
    responseStream: false,
    requestType: HelloWorld_service_pb.Request,
    responseType: HelloWorld_service_pb.Response,
    requestSerialize: serialize_helloworld_Request,
    requestDeserialize: deserialize_helloworld_Request,
    responseSerialize: serialize_helloworld_Response,
    responseDeserialize: deserialize_helloworld_Response,
  },
};

exports.HelloWorldServiceClient = grpc.makeGenericClientConstructor(HelloWorldServiceService);
