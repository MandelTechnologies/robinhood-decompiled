package com.robinhood.android.mcw.mcwcurrencyconverterreceipt;

import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.mcw.contracts.CurrencyConversionDeeplinkSource;
import com.robinhood.android.mcw.contracts.CurrencyConverterReceiptKey;
import com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptViewState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CurrencyConverterReceiptComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$3$3, reason: use source file name */
/* loaded from: classes8.dex */
final class CurrencyConverterReceiptComposable6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CurrencyConverterReceiptKey $arg;
    final /* synthetic */ ScrollState $contentScrollState;
    final /* synthetic */ float $sheetHeightDp;

    CurrencyConverterReceiptComposable6(CurrencyConverterReceiptKey currencyConverterReceiptKey, ScrollState scrollState, float f) {
        this.$arg = currencyConverterReceiptKey;
        this.$contentScrollState = scrollState;
        this.$sheetHeightDp = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(122342155, i, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposable.<anonymous>.<anonymous> (CurrencyConverterReceiptComposable.kt:388)");
        }
        CurrencyConverterReceiptViewState.Complete completePlaceholder = CurrencyConverterReceiptViewState.Complete.INSTANCE.placeholder();
        CurrencyConversionDeeplinkSource source = this.$arg.getSource();
        ScrollState scrollState = this.$contentScrollState;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$3$3$$ExternalSyntheticLambda0
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
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$3$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$3$3$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        CurrencyConverterReceiptComposable3.CompletedStateContent(completePlaceholder, source, scrollState, function0, function02, (Function0) objRememberedValue3, Background3.m4872backgroundbw27NRU$default(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, this.$sheetHeightDp)), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer, 224256, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
