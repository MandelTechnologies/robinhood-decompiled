package com.robinhood.android.event.detail.routing;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventDetailInitialLoadingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.routing.ComposableSingletons$EventDetailInitialLoadingComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailInitialLoadingComposable {
    public static final EventDetailInitialLoadingComposable INSTANCE = new EventDetailInitialLoadingComposable();
    private static Function2<Composer, Integer, Unit> lambda$1007268914 = ComposableLambda3.composableLambdaInstance(1007268914, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.routing.ComposableSingletons$EventDetailInitialLoadingComposableKt$lambda$1007268914$1
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
                ComposerKt.traceEventStart(1007268914, i, -1, "com.robinhood.android.event.detail.routing.ComposableSingletons$EventDetailInitialLoadingComposableKt.lambda$1007268914.<anonymous> (EventDetailInitialLoadingComposable.kt:15)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$1028593758 = ComposableLambda3.composableLambdaInstance(1028593758, false, EventDetailInitialLoadingComposable4.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1940668991 = ComposableLambda3.composableLambdaInstance(1940668991, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.routing.ComposableSingletons$EventDetailInitialLoadingComposableKt$lambda$1940668991$1
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
                ComposerKt.traceEventStart(1940668991, i, -1, "com.robinhood.android.event.detail.routing.ComposableSingletons$EventDetailInitialLoadingComposableKt.lambda$1940668991.<anonymous> (EventDetailInitialLoadingComposable.kt:14)");
            }
            EventDetailInitialLoadingComposable eventDetailInitialLoadingComposable = EventDetailInitialLoadingComposable.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(eventDetailInitialLoadingComposable.getLambda$1007268914$feature_event_detail_routing_externalDebug(), null, eventDetailInitialLoadingComposable.getLambda$1028593758$feature_event_detail_routing_externalDebug(), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1000720108, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f8941lambda$1000720108 = ComposableLambda3.composableLambdaInstance(-1000720108, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.routing.ComposableSingletons$EventDetailInitialLoadingComposableKt$lambda$-1000720108$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1000720108, i, -1, "com.robinhood.android.event.detail.routing.ComposableSingletons$EventDetailInitialLoadingComposableKt.lambda$-1000720108.<anonymous> (EventDetailInitialLoadingComposable.kt:27)");
            }
            LoadingScreenComposablesKt.GenericLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), false, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1000720108$feature_event_detail_routing_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m14151getLambda$1000720108$feature_event_detail_routing_externalDebug() {
        return f8941lambda$1000720108;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1007268914$feature_event_detail_routing_externalDebug() {
        return lambda$1007268914;
    }

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$1028593758$feature_event_detail_routing_externalDebug() {
        return lambda$1028593758;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1940668991$feature_event_detail_routing_externalDebug() {
        return lambda$1940668991;
    }
}
