package com.robinhood.android.common.history.p082ui;

import androidx.compose.foundation.layout.PaddingKt;
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

/* compiled from: HistoryRows.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$HistoryRowsKt {
    public static final ComposableSingletons$HistoryRowsKt INSTANCE = new ComposableSingletons$HistoryRowsKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$345760199 = ComposableLambda3.composableLambdaInstance(345760199, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt$lambda$345760199$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(345760199, i, -1, "com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt.lambda$345760199.<anonymous> (HistoryRows.kt:108)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1027653753 = ComposableLambda3.composableLambdaInstance(1027653753, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt$lambda$1027653753$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1027653753, i, -1, "com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt.lambda$1027653753.<anonymous> (HistoryRows.kt:109)");
            }
            HistoryRowsKt.DefaultHistoryFooter(null, null, null, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1943587714, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8725lambda$1943587714 = ComposableLambda3.composableLambdaInstance(-1943587714, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt$lambda$-1943587714$1
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
                ComposerKt.traceEventStart(-1943587714, i, -1, "com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt.lambda$-1943587714.<anonymous> (HistoryRows.kt:145)");
            }
            Spacer2.Spacer(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1958159836, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8726lambda$1958159836 = ComposableLambda3.composableLambdaInstance(-1958159836, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt$lambda$-1958159836$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1958159836, i, -1, "com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt.lambda$-1958159836.<anonymous> (HistoryRows.kt:159)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-841013674, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8728lambda$841013674 = ComposableLambda3.composableLambdaInstance(-841013674, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt$lambda$-841013674$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-841013674, i, -1, "com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt.lambda$-841013674.<anonymous> (HistoryRows.kt:160)");
            }
            HistoryRowsKt.DefaultHistoryFooter(null, null, null, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1751498213, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8724lambda$1751498213 = ComposableLambda3.composableLambdaInstance(-1751498213, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt$lambda$-1751498213$1
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
                ComposerKt.traceEventStart(-1751498213, i, -1, "com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt.lambda$-1751498213.<anonymous> (HistoryRows.kt:193)");
            }
            Spacer2.Spacer(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1107930705 = ComposableLambda3.composableLambdaInstance(1107930705, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt$lambda$1107930705$1
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
                ComposerKt.traceEventStart(1107930705, i, -1, "com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt.lambda$1107930705.<anonymous> (HistoryRows.kt:215)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-754850941, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8727lambda$754850941 = ComposableLambda3.composableLambdaInstance(-754850941, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt$lambda$-754850941$1
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
                ComposerKt.traceEventStart(-754850941, i, -1, "com.robinhood.android.common.history.ui.ComposableSingletons$HistoryRowsKt.lambda$-754850941.<anonymous> (HistoryRows.kt:216)");
            }
            HistoryRowsKt.DefaultHistoryFooter(null, null, null, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1751498213$lib_history_row_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12222getLambda$1751498213$lib_history_row_externalDebug() {
        return f8724lambda$1751498213;
    }

    /* renamed from: getLambda$-1943587714$lib_history_row_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12223getLambda$1943587714$lib_history_row_externalDebug() {
        return f8725lambda$1943587714;
    }

    /* renamed from: getLambda$-1958159836$lib_history_row_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12224getLambda$1958159836$lib_history_row_externalDebug() {
        return f8726lambda$1958159836;
    }

    /* renamed from: getLambda$-754850941$lib_history_row_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12225getLambda$754850941$lib_history_row_externalDebug() {
        return f8727lambda$754850941;
    }

    /* renamed from: getLambda$-841013674$lib_history_row_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12226getLambda$841013674$lib_history_row_externalDebug() {
        return f8728lambda$841013674;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1027653753$lib_history_row_externalDebug() {
        return lambda$1027653753;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1107930705$lib_history_row_externalDebug() {
        return lambda$1107930705;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$345760199$lib_history_row_externalDebug() {
        return lambda$345760199;
    }
}
