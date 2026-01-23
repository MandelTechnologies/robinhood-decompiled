package com.robinhood.android.retirement.match;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MatchAgreementsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.match.MatchAgreementsScreenKt$MainContent$1$3$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class MatchAgreementsScreen7 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    MatchAgreementsScreen7(Object obj) {
        super(1, obj, MatchAgreementsScreen4.class, "onSweepAgreementToggled", "onSweepAgreementToggled(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((MatchAgreementsScreen4) this.receiver).onSweepAgreementToggled(z);
    }
}
