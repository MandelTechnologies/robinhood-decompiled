package com.robinhood.android.common.history.p082ui.lazyList;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.HistoryRow4;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryPreviewSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.history.ui.lazyList.ComposableSingletons$HistoryPreviewSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class HistoryPreviewSection {
    public static final HistoryPreviewSection INSTANCE = new HistoryPreviewSection();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$120580325 = ComposableLambda3.composableLambdaInstance(120580325, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.lazyList.ComposableSingletons$HistoryPreviewSectionKt$lambda$120580325$1
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
                ComposerKt.traceEventStart(120580325, i, -1, "com.robinhood.android.common.history.ui.lazyList.ComposableSingletons$HistoryPreviewSectionKt.lambda$120580325.<anonymous> (HistoryPreviewSection.kt:40)");
            }
            HistoryRowsKt.DefaultHistoryHeader(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1896893555 = ComposableLambda3.composableLambdaInstance(1896893555, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.lazyList.ComposableSingletons$HistoryPreviewSectionKt$lambda$1896893555$1
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
                ComposerKt.traceEventStart(1896893555, i, -1, "com.robinhood.android.common.history.ui.lazyList.ComposableSingletons$HistoryPreviewSectionKt.lambda$1896893555.<anonymous> (HistoryPreviewSection.kt:49)");
            }
            HistoryRowsKt.DefaultHistoryFooter(null, null, null, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> lambda$1195327807 = ComposableLambda3.composableLambdaInstance(1195327807, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.lazyList.ComposableSingletons$HistoryPreviewSectionKt$lambda$1195327807$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1195327807, i2, -1, "com.robinhood.android.common.history.ui.lazyList.ComposableSingletons$HistoryPreviewSectionKt.lambda$1195327807.<anonymous> (HistoryPreviewSection.kt:141)");
            }
            HistoryRow4.PlaceholderHistoryRow(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> getLambda$1195327807$lib_history_row_externalDebug() {
        return lambda$1195327807;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$120580325$lib_history_row_externalDebug() {
        return lambda$120580325;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1896893555$lib_history_row_externalDebug() {
        return lambda$1896893555;
    }
}
