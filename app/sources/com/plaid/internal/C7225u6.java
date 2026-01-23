package com.plaid.internal;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.plaid.internal.u6 */
/* loaded from: classes16.dex */
public final class C7225u6 {

    /* renamed from: a */
    public final BufferedInputStream f3236a;

    public C7225u6(InputStream inputStream) {
        this.f3236a = new BufferedInputStream(inputStream);
    }

    /* renamed from: a */
    public final String m1624a() throws IOException {
        int i;
        StringBuilder sb = new StringBuilder();
        while (true) {
            i = this.f3236a.read();
            if (i == -1 || i == 10) {
                break;
            }
            if (i != 13) {
                sb.append((char) i);
            }
        }
        if (i == -1 && sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
