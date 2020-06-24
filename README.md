# mimosa-tracing-example
Example using opentracing starter

```sh
# Run server
mvn spring-boot:run

# Call API
curl localhost:8080/hello/my-name -v
```

## OpenTracing Tracer

建議使用 [Jaeger](https://www.jaegertracing.io/docs/1.18/getting-started/) 作為 Tracer 服務
