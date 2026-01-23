package com.robinhood.android.iav.p154ui;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DebugFundYourAccountFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.iav.ui.ComposableSingletons$DebugFundYourAccountFragmentKt$lambda$-1843331102$1, reason: use source file name */
/* loaded from: classes10.dex */
final class DebugFundYourAccountFragment3 implements Function2<Composer, Integer, Unit> {
    public static final DebugFundYourAccountFragment3 INSTANCE = new DebugFundYourAccountFragment3();

    DebugFundYourAccountFragment3() {
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
            ComposerKt.traceEventStart(-1843331102, i, -1, "com.robinhood.android.iav.ui.ComposableSingletons$DebugFundYourAccountFragmentKt.lambda$-1843331102.<anonymous> (DebugFundYourAccountFragment.kt:23)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "Disclosure preview text");
        SpannableString spannableStringValueOf = SpannableString.valueOf(new SpannedString(spannableStringBuilder));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.iav.ui.ComposableSingletons$DebugFundYourAccountFragmentKt$lambda$-1843331102$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        FundYourAccountScreen3.FundYourAccountScreen(spannableStringValueOf, (Function0) objRememberedValue, null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
