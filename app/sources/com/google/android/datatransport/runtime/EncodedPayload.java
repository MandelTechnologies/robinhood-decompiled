package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class EncodedPayload {
    private final byte[] bytes;

    /* renamed from: encoding, reason: collision with root package name */
    private final Encoding f9814encoding;

    public EncodedPayload(Encoding encoding2, byte[] bArr) {
        if (encoding2 == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f9814encoding = encoding2;
        this.bytes = bArr;
    }

    public Encoding getEncoding() {
        return this.f9814encoding;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (this.f9814encoding.equals(encodedPayload.f9814encoding)) {
            return Arrays.equals(this.bytes, encodedPayload.bytes);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9814encoding.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.bytes);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f9814encoding + ", bytes=[...]}";
    }
}
