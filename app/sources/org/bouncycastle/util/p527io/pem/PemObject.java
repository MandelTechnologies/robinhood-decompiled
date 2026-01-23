package org.bouncycastle.util.p527io.pem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes25.dex */
public class PemObject implements PemObjectGenerator {
    private static final List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());
    private byte[] content;
    private List headers;

    /* renamed from: type, reason: collision with root package name */
    private String f10857type;

    public PemObject(String str, List list, byte[] bArr) {
        this.f10857type = str;
        this.headers = Collections.unmodifiableList(list);
        this.content = bArr;
    }

    public PemObject(String str, byte[] bArr) {
        this(str, EMPTY_LIST, bArr);
    }

    @Override // org.bouncycastle.util.p527io.pem.PemObjectGenerator
    public PemObject generate() throws PemGenerationException {
        return this;
    }

    public byte[] getContent() {
        return this.content;
    }

    public List getHeaders() {
        return this.headers;
    }

    public String getType() {
        return this.f10857type;
    }
}
