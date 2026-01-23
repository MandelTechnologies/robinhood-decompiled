package com.robinhood.android.optionsupgrade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import options_product.service.JAPendingApplicationResponseMetadataDto;

/* compiled from: OptionOnboardingJAPendingScreenComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingJAPendingScreenComposableKt$lambda$-392851877$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingJAPendingScreenComposable2 implements Function2<Composer, Integer, Unit> {
    public static final OptionOnboardingJAPendingScreenComposable2 INSTANCE = new OptionOnboardingJAPendingScreenComposable2();

    OptionOnboardingJAPendingScreenComposable2() {
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
            ComposerKt.traceEventStart(-392851877, i, -1, "com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingJAPendingScreenComposableKt.lambda$-392851877.<anonymous> (OptionOnboardingJAPendingScreenComposable.kt:156)");
        }
        int i2 = C25121R.drawable.svg_ic_joint_account_pending_screen;
        JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto upgradeTypeInCopyDto = JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto.L0_TO_L2;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingJAPendingScreenComposableKt$lambda$-392851877$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        OptionOnboardingJAPendingScreenComposable3.OptionOnboardingJAPendingScreenComposable(i2, true, upgradeTypeInCopyDto, false, (Function0) objRememberedValue, null, composer, 28080, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
