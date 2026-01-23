package com.plaid.internal;

import android.widget.ProgressBar;
import com.plaid.link.C7279R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.t2 */
/* loaded from: classes16.dex */
public final class C7212t2 extends Lambda implements Function0<ProgressBar> {

    /* renamed from: a */
    public final /* synthetic */ C7239w2 f3215a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7212t2(C7239w2 c7239w2) {
        super(0);
        this.f3215a = c7239w2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProgressBar invoke() {
        return (ProgressBar) this.f3215a.findViewById(C7279R.id.progress_bar);
    }
}
