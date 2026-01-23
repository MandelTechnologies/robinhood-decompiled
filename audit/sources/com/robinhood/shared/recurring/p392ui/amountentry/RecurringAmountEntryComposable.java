package com.robinhood.shared.recurring.p392ui.amountentry;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RecurringAmountEntryComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.recurring.ui.amountentry.ComposableSingletons$RecurringAmountEntryComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class RecurringAmountEntryComposable {
    public static final RecurringAmountEntryComposable INSTANCE = new RecurringAmountEntryComposable();

    /* renamed from: lambda$-1701437431, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9474lambda$1701437431 = ComposableLambda3.composableLambdaInstance(-1701437431, false, RecurringAmountEntryComposable3.INSTANCE);

    /* renamed from: lambda$-1198490431, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9473lambda$1198490431 = ComposableLambda3.composableLambdaInstance(-1198490431, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.amountentry.ComposableSingletons$RecurringAmountEntryComposableKt$lambda$-1198490431$1
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
                ComposerKt.traceEventStart(-1198490431, i, -1, "com.robinhood.shared.recurring.ui.amountentry.ComposableSingletons$RecurringAmountEntryComposableKt.lambda$-1198490431.<anonymous> (RecurringAmountEntryComposable.kt:159)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, RecurringAmountEntryComposable.INSTANCE.m25634getLambda$1701437431$lib_recurring_ui_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1198490431$lib_recurring_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25633getLambda$1198490431$lib_recurring_ui_externalDebug() {
        return f9473lambda$1198490431;
    }

    /* renamed from: getLambda$-1701437431$lib_recurring_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25634getLambda$1701437431$lib_recurring_ui_externalDebug() {
        return f9474lambda$1701437431;
    }
}
