package com.robinhood.android.optionschain.sbschain.datepicker;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionSideBySideChainExpDatePicker.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.datepicker.ComposableSingletons$OptionSideBySideChainExpDatePickerKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainExpDatePicker {
    public static final OptionSideBySideChainExpDatePicker INSTANCE = new OptionSideBySideChainExpDatePicker();

    /* renamed from: lambda$-3473887, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9157lambda$3473887 = ComposableLambda3.composableLambdaInstance(-3473887, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.datepicker.ComposableSingletons$OptionSideBySideChainExpDatePickerKt$lambda$-3473887$1
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
                ComposerKt.traceEventStart(-3473887, i, -1, "com.robinhood.android.optionschain.sbschain.datepicker.ComposableSingletons$OptionSideBySideChainExpDatePickerKt.lambda$-3473887.<anonymous> (OptionSideBySideChainExpDatePicker.kt:41)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-3473887$feature_options_chain_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17237getLambda$3473887$feature_options_chain_externalDebug() {
        return f9157lambda$3473887;
    }
}
