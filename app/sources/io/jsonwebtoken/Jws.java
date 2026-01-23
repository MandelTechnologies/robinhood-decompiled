package io.jsonwebtoken;

/* loaded from: classes14.dex */
public interface Jws<B> extends Jwt<JwsHeader, B> {
    String getSignature();
}
