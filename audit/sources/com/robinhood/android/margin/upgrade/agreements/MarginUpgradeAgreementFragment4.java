package com.robinhood.android.margin.upgrade.agreements;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: MarginUpgradeAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragment$MarginUpgradeStepComposable$3$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MarginUpgradeAgreementFragment4 extends FunctionReferenceImpl implements Function2<Boolean, UiAgreementWithContent, Job> {
    MarginUpgradeAgreementFragment4(Object obj) {
        super(2, obj, MarginUpgradeAgreementDuxo.class, "enableMarginInvesting", "enableMarginInvesting(ZLcom/robinhood/android/agreements/models/UiAgreementWithContent;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Job invoke(Boolean bool, UiAgreementWithContent uiAgreementWithContent) {
        return invoke(bool.booleanValue(), uiAgreementWithContent);
    }

    public final Job invoke(boolean z, UiAgreementWithContent p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        return ((MarginUpgradeAgreementDuxo) this.receiver).enableMarginInvesting(z, p1);
    }
}
