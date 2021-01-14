package main

import (
	"context"
	"fmt"
	"log"
	"net"

	helloworld "github.com/Cryptonex7/protorepos/repo/go/HelloWorld"
	"google.golang.org/grpc"
)

type server struct {
}

func (*server) HelloWorld(ctx context.Context, request *helloworld.Request) (*helloworld.Response, error) {
	response := &helloworld.Response{
		Message: "Helloworld from GO gRPC",
	}
	return response, nil
}

func main() {
	address := "0.0.0.0:3001"
	lis, err := net.Listen("tcp", address)
	if err != nil {
		log.Fatalf("Error %v", err)
	}
	fmt.Printf("===>>> Server is Listening on %v...", address)

	s := grpc.NewServer()
	helloworld.RegisterHelloWorldServiceServer(s, &server{})

	s.Serve(lis)
}
