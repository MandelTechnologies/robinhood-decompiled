package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5194ba;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.u */
/* loaded from: classes27.dex */
final class C5158u implements InterfaceC5110av {

    /* renamed from: a */
    private Context f799a;

    private C5158u() {
        throw null;
    }

    /* synthetic */ C5158u(C5157t c5157t) {
    }

    @Override // com.google.android.play.core.integrity.InterfaceC5110av
    /* renamed from: b */
    public final InterfaceC5111aw mo875b() {
        C5194ba.m966a(this.f799a, Context.class);
        return new C5160w(this.f799a, null);
    }

    /* renamed from: a */
    public final C5158u m910a(Context context) {
        context.getClass();
        this.f799a = context;
        return this;
    }
}
