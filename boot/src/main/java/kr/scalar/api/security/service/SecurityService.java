package kr.scalar.api.security.service;

public interface SecurityService<T> {
    boolean validate();
    T getData();
}