package com.robinhood.android.moneymovement.checkoutflow;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentPreferenceFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.moneymovement.checkoutflow.ComposableSingletons$PaymentPreferenceFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PaymentPreferenceFragment2 {
    public static final PaymentPreferenceFragment2 INSTANCE = new PaymentPreferenceFragment2();
    private static Function2<Composer, Integer, Unit> lambda$567141025 = ComposableLambda3.composableLambdaInstance(567141025, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.moneymovement.checkoutflow.ComposableSingletons$PaymentPreferenceFragmentKt$lambda$567141025$1
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
                ComposerKt.traceEventStart(567141025, i, -1, "com.robinhood.android.moneymovement.checkoutflow.ComposableSingletons$PaymentPreferenceFragmentKt.lambda$567141025.<anonymous> (PaymentPreferenceFragment.kt:189)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-517973842, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9121lambda$517973842 = ComposableLambda3.composableLambdaInstance(-517973842, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.moneymovement.checkoutflow.ComposableSingletons$PaymentPreferenceFragmentKt$lambda$-517973842$1
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
                ComposerKt.traceEventStart(-517973842, i, -1, "com.robinhood.android.moneymovement.checkoutflow.ComposableSingletons$PaymentPreferenceFragmentKt.lambda$-517973842.<anonymous> (PaymentPreferenceFragment.kt:242)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-517973842$lib_money_movements_checkout_flow_externalDebug */
    public final Function2<Composer, Integer, Unit> m2212xd7febb2e() {
        return f9121lambda$517973842;
    }

    /* renamed from: getLambda$567141025$lib_money_movements_checkout_flow_externalDebug */
    public final Function2<Composer, Integer, Unit> m2213xf741452c() {
        return lambda$567141025;
    }
}
