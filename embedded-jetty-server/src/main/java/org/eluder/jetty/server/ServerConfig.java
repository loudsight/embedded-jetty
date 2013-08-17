package org.eluder.jetty.server;

import org.eclipse.jetty.util.annotation.Name;

public class ServerConfig {

    // Checkstyle OFF: MagicNumber
    private int     port         = 8080;
    private String  contextPath  = "/";
    private String  webApp       = null;

    private int     idleTimeout  = 60 * 60 * 1000;
    private int     soLingerTime = -1;
    private int     minThreads   = 10;
    private int     maxThreads   = 100;
    private boolean plus         = false;
    private boolean classPath    = false;
    // Checkstyle ON: MagicNumber
    
    public int getPort() {
        return port;
    }
    
    public ServerConfig setPort(@Name(value = "port", description = "server port") final int port) {
        this.port = port;
        return this;
    }
    
    public String getContextPath() {
        return contextPath;
    }
    
    public ServerConfig setContextPath(@Name(value = "contextPath", description = "context path") final String contextPath) {
        this.contextPath = contextPath;
        return this;
    }
    
    public String getWebApp() {
        return webApp;
    }
    
    public ServerConfig setWebApp(@Name(value = "webApp", description = "path to web app directory or war / jar") final String webApp) {
        this.webApp = webApp;
        return this;
    }
    
    public int getIdleTimeout() {
        return idleTimeout;
    }
    
    public ServerConfig setIdleTimeout(@Name(value = "idleTimeout", description = "idle timeout in ms") final int idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    
    public int getSoLingerTime() {
        return soLingerTime;
    }
    
    public ServerConfig setSoLingerTime(@Name(value = "soLingerTime", description = "max socket linger time") final int soLingerTime) {
        this.soLingerTime = soLingerTime;
        return this;
    }
    
    public int getMinThreads() {
        return minThreads;
    }
    
    public ServerConfig setMinThreads(@Name(value = "minThreads", description = "min number of threads in pool") final int minThreads) {
        this.minThreads = minThreads;
        return this;
    }
    
    public int getMaxThreads() {
        return maxThreads;
    }
    
    public ServerConfig setMaxThreads(@Name(value = "maxThreads", description = "max number of threads in pool") final int maxThreads) {
        this.maxThreads = maxThreads;
        return this;
    }
    
    public boolean isPlus() {
        return plus;
    }
    
    public ServerConfig setPlus(@Name(value = "plus", description = "use plus configuration") final boolean plus) {
        this.plus = plus;
        return this;
    }
    
    public boolean isClassPath() {
        return classPath;
    }
    
    public ServerConfig setClassPath(@Name(value = "classPath", description = "use classpath annotation scanning") final boolean classPath) {
        this.classPath = classPath;
        return this;
    }
    
    @Override
    public String toString() {
        return new StringBuilder()
            .append(getClass().getSimpleName()).append(" [\n")
            .append("  port = ").append(port).append("\n")
            .append("  contextPath = ").append(contextPath).append("\n")
            .append("  webApp = ").append(webApp).append("\n")
            .append("  idleTimeout = ").append(idleTimeout).append("\n")
            .append("  soLingerTime = ").append(soLingerTime).append("\n")
            .append("  minThreads = ").append(minThreads).append("\n")
            .append("  maxThreads = ").append(maxThreads).append("\n")
            .append("  plus = ").append(plus).append("\n")
            .append("  classPath = ").append(classPath).append("\n")
            .append("]")
            .toString();
    }
}