package com.plaid.internal;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.U7 */
/* loaded from: classes16.dex */
public final class C5982U7 extends Lambda implements Function0<C6009X7> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC5991V7<AbstractC6037a8> f1755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5982U7(AbstractC5991V7<AbstractC6037a8> abstractC5991V7) {
        super(0);
        this.f1755a = abstractC5991V7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C6009X7 invoke() {
        C6009X7 c6009x7;
        Bundle arguments = this.f1755a.getArguments();
        if (arguments == null || (c6009x7 = (C6009X7) arguments.getParcelable("workflow_pane_id")) == null) {
            throw new RuntimeException("Needs pane id");
        }
        return c6009x7;
    }
}
