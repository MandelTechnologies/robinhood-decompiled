package com.robinhood.android.engagement.goldevent.p115ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LiveEventStreamComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$LiveEventStreamComposableKt {
    public static final ComposableSingletons$LiveEventStreamComposableKt INSTANCE = new ComposableSingletons$LiveEventStreamComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1675713165 = ComposableLambda3.composableLambdaInstance(1675713165, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.engagement.goldevent.ui.ComposableSingletons$LiveEventStreamComposableKt$lambda$1675713165$1
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
                ComposerKt.traceEventStart(1675713165, i, -1, "com.robinhood.android.engagement.goldevent.ui.ComposableSingletons$LiveEventStreamComposableKt.lambda$1675713165.<anonymous> (LiveEventStreamComposable.kt:202)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-976541305, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8876lambda$976541305 = ComposableLambda3.composableLambdaInstance(-976541305, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.engagement.goldevent.ui.ComposableSingletons$LiveEventStreamComposableKt$lambda$-976541305$1
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
                ComposerKt.traceEventStart(-976541305, i, -1, "com.robinhood.android.engagement.goldevent.ui.ComposableSingletons$LiveEventStreamComposableKt.lambda$-976541305.<anonymous> (LiveEventStreamComposable.kt:244)");
            }
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), true, null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-976541305$feature_live_event_stream_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13498getLambda$976541305$feature_live_event_stream_externalRelease() {
        return f8876lambda$976541305;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1675713165$feature_live_event_stream_externalRelease() {
        return lambda$1675713165;
    }
}
