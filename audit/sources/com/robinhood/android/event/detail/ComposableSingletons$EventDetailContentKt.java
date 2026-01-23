package com.robinhood.android.event.detail;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.eventcontracts.sharedeventui.EventDetailsDisclosure3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventDetailContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$EventDetailContentKt {
    public static final ComposableSingletons$EventDetailContentKt INSTANCE = new ComposableSingletons$EventDetailContentKt();

    /* renamed from: lambda$-1451057705, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8933lambda$1451057705 = ComposableLambda3.composableLambdaInstance(-1451057705, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailContentKt$lambda$-1451057705$1
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
                ComposerKt.traceEventStart(-1451057705, i, -1, "com.robinhood.android.event.detail.ComposableSingletons$EventDetailContentKt.lambda$-1451057705.<anonymous> (EventDetailContent.kt:137)");
            }
            EventDetailContentKt.UpcomingActivityHeader(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1417031766 = ComposableLambda3.composableLambdaInstance(1417031766, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailContentKt$lambda$1417031766$1
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
                ComposerKt.traceEventStart(1417031766, i, -1, "com.robinhood.android.event.detail.ComposableSingletons$EventDetailContentKt.lambda$1417031766.<anonymous> (EventDetailContent.kt:150)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1883120743 = ComposableLambda3.composableLambdaInstance(1883120743, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailContentKt$lambda$1883120743$1
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
                ComposerKt.traceEventStart(1883120743, i, -1, "com.robinhood.android.event.detail.ComposableSingletons$EventDetailContentKt.lambda$1883120743.<anonymous> (EventDetailContent.kt:278)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1746722384 = ComposableLambda3.composableLambdaInstance(1746722384, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailContentKt$lambda$1746722384$1
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
                ComposerKt.traceEventStart(1746722384, i, -1, "com.robinhood.android.event.detail.ComposableSingletons$EventDetailContentKt.lambda$1746722384.<anonymous> (EventDetailContent.kt:302)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$2044416749 = ComposableLambda3.composableLambdaInstance(2044416749, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailContentKt$lambda$2044416749$1
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
                ComposerKt.traceEventStart(2044416749, i, -1, "com.robinhood.android.event.detail.ComposableSingletons$EventDetailContentKt.lambda$2044416749.<anonymous> (EventDetailContent.kt:339)");
            }
            EventDetailsDisclosure3.EventContractsDisclosure(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1451057705$feature_event_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14096getLambda$1451057705$feature_event_detail_externalDebug() {
        return f8933lambda$1451057705;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1417031766$feature_event_detail_externalDebug() {
        return lambda$1417031766;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1746722384$feature_event_detail_externalDebug() {
        return lambda$1746722384;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1883120743$feature_event_detail_externalDebug() {
        return lambda$1883120743;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$2044416749$feature_event_detail_externalDebug() {
        return lambda$2044416749;
    }
}
