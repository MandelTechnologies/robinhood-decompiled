package io.jsonwebtoken.p476io;

import io.jsonwebtoken.lang.Assert;

/* loaded from: classes14.dex */
class Base64Decoder extends Base64Support implements Decoder<String, byte[]> {
    Base64Decoder() {
        super(Base64.DEFAULT);
    }

    Base64Decoder(Base64 base64) {
        super(base64);
    }

    @Override // io.jsonwebtoken.p476io.Decoder
    public byte[] decode(String str) throws DecodingException {
        Assert.notNull(str, "String argument cannot be null");
        return this.base64.decodeFast(str.toCharArray());
    }
}
