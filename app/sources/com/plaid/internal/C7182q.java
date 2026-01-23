package com.plaid.internal;

/* renamed from: com.plaid.internal.q */
/* loaded from: classes16.dex */
public final class C7182q extends Exception {

    /* renamed from: a */
    public final EnumC5957S0 f3115a;

    public C7182q(EnumC5957S0 enumC5957S0) {
        this.f3115a = enumC5957S0;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder("errorCode=");
        sb.append(this.f3115a);
        if (super.getMessage() == null) {
            str = "";
        } else {
            str = "; " + super.getMessage();
        }
        sb.append(str);
        return sb.toString();
    }

    public C7182q(EnumC5957S0 enumC5957S0, String str) {
        super(str);
        this.f3115a = enumC5957S0;
    }

    public C7182q(EnumC5957S0 enumC5957S0, Exception exc) {
        super(exc);
        this.f3115a = enumC5957S0;
    }
}
