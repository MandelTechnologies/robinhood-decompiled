package com.robinhood.android.advisory.onboarding.outro;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AdvisoryAccountLoadingScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt$AdvisoryLoadingAccountScreen$1$1$1$1 */
/* loaded from: classes7.dex */
/* synthetic */ class C8905xb34c1f1 extends FunctionReferenceImpl implements Function0<Unit> {
    C8905xb34c1f1(Object obj) {
        super(0, obj, AdvisoryPostAgreementsScreen.class, "onCloseClicked", "onCloseClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AdvisoryPostAgreementsScreen) this.receiver).onCloseClicked();
    }
}
