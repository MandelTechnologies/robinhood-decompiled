package com.robinhood.android.advisory.onboarding.outro;

import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryPostAgreementsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreenKt$AdvisoryPostAgreementsScreen$2$1$3$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class AdvisoryPostAgreementsScreen3 extends FunctionReferenceImpl implements Function1<IntentKey, Unit> {
    AdvisoryPostAgreementsScreen3(Object obj) {
        super(1, obj, AdvisoryPostAgreementsScreen.class, "onCelebrationCtaClicked", "onCelebrationCtaClicked(Lcom/robinhood/android/navigation/keys/IntentKey;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntentKey intentKey) {
        invoke2(intentKey);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IntentKey p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AdvisoryPostAgreementsScreen) this.receiver).onCelebrationCtaClicked(p0);
    }
}
