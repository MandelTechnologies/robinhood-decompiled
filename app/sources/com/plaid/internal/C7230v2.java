package com.plaid.internal;

import android.view.View;
import com.plaid.link.C7279R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.v2 */
/* loaded from: classes16.dex */
public final class C7230v2 extends Lambda implements Function0<View> {

    /* renamed from: a */
    public final /* synthetic */ C7239w2 f3240a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7230v2(C7239w2 c7239w2) {
        super(0);
        this.f3240a = c7239w2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.f3240a.findViewById(C7279R.id.retry_container);
    }
}
