package com.ms.framework.registry;

        import org.springframework.boot.context.properties.ConfigurationProperties;
        import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "registry")
public class RegistryConfig {

    private String servers;

    public void setServers(String servers) {
        this.servers = servers;
    }

    public ServiceRegistry serviceRegistry() {
        return new ServiceRegistryImpl(servers);
    }

}
