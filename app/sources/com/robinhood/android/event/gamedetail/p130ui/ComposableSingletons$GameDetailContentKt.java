package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.eventcontracts.sharedeventui.EventDetailsDisclosure3;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$GameDetailContentKt {
    public static final ComposableSingletons$GameDetailContentKt INSTANCE = new ComposableSingletons$GameDetailContentKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1369788271 = ComposableLambda3.composableLambdaInstance(1369788271, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailContentKt$lambda$1369788271$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope historyPreviewSection, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(historyPreviewSection, "$this$historyPreviewSection");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1369788271, i, -1, "com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailContentKt.lambda$1369788271.<anonymous> (GameDetailContent.kt:86)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, StringResources_androidKt.stringResource(C16283R.string.game_detail_upcoming_activity_header, composer, 0), composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-901874962, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8949lambda$901874962 = ComposableLambda3.composableLambdaInstance(-901874962, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailContentKt$lambda$-901874962$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope historyPreviewSection, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(historyPreviewSection, "$this$historyPreviewSection");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-901874962, i, -1, "com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailContentKt.lambda$-901874962.<anonymous> (GameDetailContent.kt:96)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1930901067 = ComposableLambda3.composableLambdaInstance(1930901067, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailContentKt$lambda$1930901067$1
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
                ComposerKt.traceEventStart(1930901067, i, -1, "com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailContentKt.lambda$1930901067.<anonymous> (GameDetailContent.kt:122)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1169734064, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8948lambda$1169734064 = ComposableLambda3.composableLambdaInstance(-1169734064, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailContentKt$lambda$-1169734064$1
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
                ComposerKt.traceEventStart(-1169734064, i, -1, "com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailContentKt.lambda$-1169734064.<anonymous> (GameDetailContent.kt:253)");
            }
            EventDetailsDisclosure3.EventContractsDisclosure(PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 1, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1169734064$feature_game_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14222getLambda$1169734064$feature_game_detail_externalDebug() {
        return f8948lambda$1169734064;
    }

    /* renamed from: getLambda$-901874962$feature_game_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14223getLambda$901874962$feature_game_detail_externalDebug() {
        return f8949lambda$901874962;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1369788271$feature_game_detail_externalDebug() {
        return lambda$1369788271;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1930901067$feature_game_detail_externalDebug() {
        return lambda$1930901067;
    }
}
