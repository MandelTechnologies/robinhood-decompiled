package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.security.SignatureException;

/* loaded from: classes14.dex */
public interface Signer {
    byte[] sign(byte[] bArr) throws SignatureException;
}
