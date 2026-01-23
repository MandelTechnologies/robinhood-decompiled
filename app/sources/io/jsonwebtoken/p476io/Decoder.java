package io.jsonwebtoken.p476io;

/* loaded from: classes14.dex */
public interface Decoder<T, R> {
    R decode(T t) throws DecodingException;
}
