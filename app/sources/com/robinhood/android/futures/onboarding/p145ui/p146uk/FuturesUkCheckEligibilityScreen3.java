package com.robinhood.android.futures.onboarding.p145ui.p146uk;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.futures.onboarding.p145ui.p146uk.FuturesUkCheckEligibilityDuxo5;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesUkCheckEligibilityScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.onboarding.ui.uk.ComposableSingletons$FuturesUkCheckEligibilityScreenKt$lambda$23204597$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesUkCheckEligibilityScreen3 implements Function2<Composer, Integer, Unit> {
    public static final FuturesUkCheckEligibilityScreen3 INSTANCE = new FuturesUkCheckEligibilityScreen3();

    FuturesUkCheckEligibilityScreen3() {
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
            ComposerKt.traceEventStart(23204597, i, -1, "com.robinhood.android.futures.onboarding.ui.uk.ComposableSingletons$FuturesUkCheckEligibilityScreenKt.lambda$23204597.<anonymous> (FuturesUkCheckEligibilityScreen.kt:168)");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        FuturesUkCheckEligibilityDuxo5.Rejected rejected = new FuturesUkCheckEligibilityDuxo5.Rejected(companion.invoke("You didn’t pass the test. But you can learn more about futures trading on our Help Centre article and retry the knowledge test one more time."), companion.invoke("Try again"), companion.invoke("Take this test later"), true);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.uk.ComposableSingletons$FuturesUkCheckEligibilityScreenKt$lambda$23204597$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.uk.ComposableSingletons$FuturesUkCheckEligibilityScreenKt$lambda$23204597$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        FuturesUkCheckEligibilityScreen4.Rejected(rejected, function0, (Function0) objRememberedValue2, null, composer, StringResource.$stable | 432, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
