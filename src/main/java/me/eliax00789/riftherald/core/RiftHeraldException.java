package me.eliax00789.riftherald.core;

public class RiftHeraldException extends Exception {
    public RiftHeraldException() {
    }
    public RiftHeraldException(String error) {
        super(error);
    }
    public RiftHeraldException(Throwable cause) {
        super(cause);
    }
    public RiftHeraldException(String error, Throwable cause) {
        super(error,cause);
    }
}
