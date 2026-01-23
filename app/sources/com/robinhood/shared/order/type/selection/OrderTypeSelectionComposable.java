package com.robinhood.shared.order.type.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.selection.ComposableSingletons$OrderTypeSelectionComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeSelectionComposable {
    public static final OrderTypeSelectionComposable INSTANCE = new OrderTypeSelectionComposable();

    /* renamed from: lambda$-971561848, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9466lambda$971561848 = ComposableLambda3.composableLambdaInstance(-971561848, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.ComposableSingletons$OrderTypeSelectionComposableKt$lambda$-971561848$1
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
                ComposerKt.traceEventStart(-971561848, i, -1, "com.robinhood.shared.order.type.selection.ComposableSingletons$OrderTypeSelectionComposableKt.lambda$-971561848.<anonymous> (OrderTypeSelectionComposable.kt:64)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$922219123 = ComposableLambda3.composableLambdaInstance(922219123, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.ComposableSingletons$OrderTypeSelectionComposableKt$lambda$922219123$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(922219123, i, -1, "com.robinhood.shared.order.type.selection.ComposableSingletons$OrderTypeSelectionComposableKt.lambda$922219123.<anonymous> (OrderTypeSelectionComposable.kt:120)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$4837169 = ComposableLambda3.composableLambdaInstance(4837169, false, OrderTypeSelectionComposable3.INSTANCE);

    /* renamed from: getLambda$-971561848$lib_order_type_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25578getLambda$971561848$lib_order_type_externalDebug() {
        return f9466lambda$971561848;
    }

    public final Function2<Composer, Integer, Unit> getLambda$4837169$lib_order_type_externalDebug() {
        return lambda$4837169;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$922219123$lib_order_type_externalDebug() {
        return lambda$922219123;
    }
}
