package io.jsonwebtoken.p476io;

import io.jsonwebtoken.lang.Assert;

/* loaded from: classes14.dex */
class Base64Support {
    protected final Base64 base64;

    Base64Support(Base64 base64) {
        Assert.notNull(base64, "Base64 argument cannot be null");
        this.base64 = base64;
    }
}
