package com.robinhood.android.equityadvancedorder;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvancedOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$EquityAdvancedOrderFragmentKt {
    public static final ComposableSingletons$EquityAdvancedOrderFragmentKt INSTANCE = new ComposableSingletons$EquityAdvancedOrderFragmentKt();

    /* renamed from: lambda$-1052008672, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8905lambda$1052008672 = ComposableLambda3.composableLambdaInstance(-1052008672, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.ComposableSingletons$EquityAdvancedOrderFragmentKt$lambda$-1052008672$1
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
                ComposerKt.traceEventStart(-1052008672, i, -1, "com.robinhood.android.equityadvancedorder.ComposableSingletons$EquityAdvancedOrderFragmentKt.lambda$-1052008672.<anonymous> (EquityAdvancedOrderFragment.kt:235)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1639499742 = ComposableLambda3.composableLambdaInstance(1639499742, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.ComposableSingletons$EquityAdvancedOrderFragmentKt$lambda$1639499742$1
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
                ComposerKt.traceEventStart(1639499742, i, -1, "com.robinhood.android.equityadvancedorder.ComposableSingletons$EquityAdvancedOrderFragmentKt.lambda$1639499742.<anonymous> (EquityAdvancedOrderFragment.kt:271)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<Modifier, Composer, Integer, Unit> lambda$521334867 = ComposableLambda3.composableLambdaInstance(521334867, false, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.ComposableSingletons$EquityAdvancedOrderFragmentKt$lambda$521334867$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            invoke(modifier, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Modifier it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(521334867, i, -1, "com.robinhood.android.equityadvancedorder.ComposableSingletons$EquityAdvancedOrderFragmentKt.lambda$521334867.<anonymous> (EquityAdvancedOrderFragment.kt:268)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1052008672$lib_equity_advanced_order_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13724getLambda$1052008672$lib_equity_advanced_order_externalDebug() {
        return f8905lambda$1052008672;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1639499742$lib_equity_advanced_order_externalDebug() {
        return lambda$1639499742;
    }

    public final Function3<Modifier, Composer, Integer, Unit> getLambda$521334867$lib_equity_advanced_order_externalDebug() {
        return lambda$521334867;
    }
}
