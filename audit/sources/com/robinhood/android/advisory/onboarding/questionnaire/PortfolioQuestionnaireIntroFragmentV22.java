package com.robinhood.android.advisory.onboarding.questionnaire;

import com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioQuestionnaireIntroFragmentV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class PortfolioQuestionnaireIntroFragmentV22 extends FunctionReferenceImpl implements Function1<UUID, Unit> {
    PortfolioQuestionnaireIntroFragmentV22(Object obj) {
        super(1, obj, PortfolioQuestionnaireIntroFragmentV2.Callbacks.class, "onQuestionnaireIntroContinueClicked", "onQuestionnaireIntroContinueClicked(Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid) {
        invoke2(uuid);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PortfolioQuestionnaireIntroFragmentV2.Callbacks) this.receiver).onQuestionnaireIntroContinueClicked(p0);
    }
}
