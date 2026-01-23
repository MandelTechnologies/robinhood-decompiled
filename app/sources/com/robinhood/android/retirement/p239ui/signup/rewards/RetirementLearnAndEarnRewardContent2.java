package com.robinhood.android.retirement.p239ui.signup.rewards;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.models.retirement.api.rewards.ApiRetirementLearnAndEarnRewardResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementLearnAndEarnRewardContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.ui.signup.rewards.ComposableSingletons$RetirementLearnAndEarnRewardContentKt$lambda$1156918631$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementLearnAndEarnRewardContent2 implements Function2<Composer, Integer, Unit> {
    public static final RetirementLearnAndEarnRewardContent2 INSTANCE = new RetirementLearnAndEarnRewardContent2();

    RetirementLearnAndEarnRewardContent2() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1156918631, i, -1, "com.robinhood.android.retirement.ui.signup.rewards.ComposableSingletons$RetirementLearnAndEarnRewardContentKt.lambda$1156918631.<anonymous> (RetirementLearnAndEarnRewardContent.kt:97)");
        }
        ApiRetirementLearnAndEarnRewardResponse result = RetirementLearnAndEarnRewardViewState.INSTANCE.getLoadingMock().getResult();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.retirement.ui.signup.rewards.ComposableSingletons$RetirementLearnAndEarnRewardContentKt$lambda$1156918631$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RetirementLearnAndEarnRewardContent2.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RetirementLearnAndEarnRewardContent3.RewardLoaded(result, (Function1) objRememberedValue, composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
