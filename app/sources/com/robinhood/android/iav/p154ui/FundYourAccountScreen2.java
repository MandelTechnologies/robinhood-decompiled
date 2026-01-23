package com.robinhood.android.iav.p154ui;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.iav.C18470R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FundYourAccountScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.iav.ui.ComposableSingletons$FundYourAccountScreenKt$lambda$-992486434$1, reason: use source file name */
/* loaded from: classes10.dex */
final class FundYourAccountScreen2 implements Function2<Composer, Integer, Unit> {
    public static final FundYourAccountScreen2 INSTANCE = new FundYourAccountScreen2();

    FundYourAccountScreen2() {
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
            ComposerKt.traceEventStart(-992486434, i, -1, "com.robinhood.android.iav.ui.ComposableSingletons$FundYourAccountScreenKt.lambda$-992486434.<anonymous> (FundYourAccountScreen.kt:40)");
        }
        composer.startReplaceGroup(-296721399);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) StringResources_androidKt.stringResource(C18470R.string.fund_account_disclosure, composer, 0));
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        composer.endReplaceGroup();
        SpannableString spannableStringValueOf = SpannableString.valueOf(spannedString);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.iav.ui.ComposableSingletons$FundYourAccountScreenKt$lambda$-992486434$1$$ExternalSyntheticLambda0
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
