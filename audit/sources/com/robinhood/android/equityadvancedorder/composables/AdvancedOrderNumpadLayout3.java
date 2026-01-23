package com.robinhood.android.equityadvancedorder.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvancedOrderNumpadLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$AdvancedOrderNumpadLayoutKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AdvancedOrderNumpadLayout3 {
    public static final AdvancedOrderNumpadLayout3 INSTANCE = new AdvancedOrderNumpadLayout3();

    /* renamed from: lambda$-1925191817, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8906lambda$1925191817 = ComposableLambda3.composableLambdaInstance(-1925191817, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$AdvancedOrderNumpadLayoutKt$lambda$-1925191817$1
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
                ComposerKt.traceEventStart(-1925191817, i, -1, "com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$AdvancedOrderNumpadLayoutKt.lambda$-1925191817.<anonymous> (AdvancedOrderNumpadLayout.kt:249)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1925191817$lib_equity_advanced_order_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13765getLambda$1925191817$lib_equity_advanced_order_externalDebug() {
        return f8906lambda$1925191817;
    }
}
