package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5194ba;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.q */
/* loaded from: classes27.dex */
final class C5154q implements InterfaceC5161x {

    /* renamed from: a */
    private Context f793a;

    private C5154q() {
        throw null;
    }

    /* synthetic */ C5154q(C5153p c5153p) {
    }

    @Override // com.google.android.play.core.integrity.InterfaceC5161x
    /* renamed from: b */
    public final C5156s mo908b() {
        C5194ba.m966a(this.f793a, Context.class);
        return new C5156s(this.f793a, null);
    }

    /* renamed from: a */
    public final C5154q m907a(Context context) {
        context.getClass();
        this.f793a = context;
        return this;
    }
}
