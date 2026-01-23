package org.bouncycastle.jcajce.spec;

import java.security.spec.EncodedKeySpec;

/* loaded from: classes25.dex */
public class OpenSSHPrivateKeySpec extends EncodedKeySpec {

    /* renamed from: format, reason: collision with root package name */
    private final String f10847format;

    public OpenSSHPrivateKeySpec(byte[] bArr) {
        String str;
        super(bArr);
        byte b = bArr[0];
        if (b == 48) {
            str = "ASN.1";
        } else {
            if (b != 111) {
                throw new IllegalArgumentException("unknown byte encoding");
            }
            str = "OpenSSH";
        }
        this.f10847format = str;
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return this.f10847format;
    }
}
