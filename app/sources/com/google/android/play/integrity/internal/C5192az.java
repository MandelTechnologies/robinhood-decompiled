package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.az */
/* loaded from: classes27.dex */
public final class C5192az implements InterfaceC5191ay {

    /* renamed from: a */
    private final Object f852a;

    private C5192az(Object obj) {
        this.f852a = obj;
    }

    /* renamed from: b */
    public static InterfaceC5191ay m964b(Object obj) {
        if (obj != null) {
            return new C5192az(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5196bd
    /* renamed from: a */
    public final Object mo857a() {
        return this.f852a;
    }
}
