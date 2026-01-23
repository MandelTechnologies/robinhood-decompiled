package com.robinhood.android.individualaccounts.onboarding.funding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndividualAccountFundingBottomSheetDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.individualaccounts.onboarding.funding.ComposableSingletons$IndividualAccountFundingBottomSheetDialogFragmentKt$lambda$376891638$1, reason: use source file name */
/* loaded from: classes10.dex */
final class IndividualAccountFundingBottomSheetDialogFragment3 implements Function2<Composer, Integer, Unit> {
    public static final IndividualAccountFundingBottomSheetDialogFragment3 INSTANCE = new IndividualAccountFundingBottomSheetDialogFragment3();

    IndividualAccountFundingBottomSheetDialogFragment3() {
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
            ComposerKt.traceEventStart(376891638, i, -1, "com.robinhood.android.individualaccounts.onboarding.funding.ComposableSingletons$IndividualAccountFundingBottomSheetDialogFragmentKt.lambda$376891638.<anonymous> (IndividualAccountFundingBottomSheetDialogFragment.kt:248)");
        }
        IndividualAccountFundingBottomSheetKey2 individualAccountFundingBottomSheetKey2 = IndividualAccountFundingBottomSheetKey2.ASSETS;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new IndividualAccountFundingBottomSheetDialogFragment4(null);
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2 function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.funding.ComposableSingletons$IndividualAccountFundingBottomSheetDialogFragmentKt$lambda$376891638$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        IndividualAccountFundingBottomSheetDialogFragment6.FundAccountBottomSheetContent("123456", null, individualAccountFundingBottomSheetKey2, function2, (Function0) objRememberedValue2, null, composer, 25014, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
