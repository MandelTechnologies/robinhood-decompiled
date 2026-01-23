package com.robinhood.android.isa.contributions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: IsaContributionHub.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.isa.contributions.IsaContributionHubKt$IsaContributionHub$1$3$1$2$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class IsaContributionHub5 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    IsaContributionHub5(Object obj) {
        super(1, obj, IsaContributionHubDuxo.class, "selectTaxYear", "selectTaxYear(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((IsaContributionHubDuxo) this.receiver).selectTaxYear(i);
    }
}
