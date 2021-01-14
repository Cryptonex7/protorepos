var helloworld = require("./HelloWorld/service_pb");
var services = require("./HelloWorld/service_grpc_pb");

var grpc = require("grpc");

function main() {
  var client = new services.HelloWorldServiceClient(
    "localhost:3001",
    grpc.credentials.createInsecure()
  );
  var request = new helloworld.Request();

  client.helloWorld(request, function (err, response) {
    if (err) console.log("Node Client Error:", err);
    else console.log("\n\n => Node Client Message:", response.getMessage());
  });
}
main();
