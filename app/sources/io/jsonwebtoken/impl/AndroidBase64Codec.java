package io.jsonwebtoken.impl;

import io.jsonwebtoken.p476io.Decoders;
import io.jsonwebtoken.p476io.Encoders;

@Deprecated
/* loaded from: classes14.dex */
public class AndroidBase64Codec extends AbstractTextCodec {
    @Override // io.jsonwebtoken.impl.TextCodec
    public String encode(byte[] bArr) {
        return Encoders.BASE64.encode(bArr);
    }

    @Override // io.jsonwebtoken.impl.TextCodec
    public byte[] decode(String str) {
        return Decoders.BASE64.decode(str);
    }
}
