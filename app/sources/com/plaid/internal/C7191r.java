package com.plaid.internal;

/* renamed from: com.plaid.internal.r */
/* loaded from: classes16.dex */
public final class C7191r extends Exception {

    /* renamed from: a */
    public final EnumC5954R6 f3144a;

    public C7191r(EnumC5954R6 enumC5954R6) {
        super("device descriptor contains an error");
        this.f3144a = enumC5954R6;
    }

    /* renamed from: a */
    public final EnumC5957S0 m1577a() {
        return getCause() instanceof C7182q ? ((C7182q) getCause()).f3115a : EnumC5957S0.GENERIC_UNKNOWN_REASON;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "step=" + this.f3144a + "; " + super.getMessage();
    }

    public C7191r(EnumC5954R6 enumC5954R6, Throwable th) {
        super(th.getMessage(), th);
        this.f3144a = enumC5954R6;
    }
}
