package com.robinhood.android.event.detail.routing;

import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EventDetailInitialLoadingComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"EventDetailInitialLoadingComposable", "", "(Landroidx/compose/runtime/Composer;I)V", "feature-event-detail-routing_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.routing.EventDetailInitialLoadingComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailInitialLoadingComposable6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailInitialLoadingComposable$lambda$0(int i, Composer composer, int i2) {
        EventDetailInitialLoadingComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EventDetailInitialLoadingComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1963541629);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1963541629, i, -1, "com.robinhood.android.event.detail.routing.EventDetailInitialLoadingComposable (EventDetailInitialLoadingComposable.kt:11)");
            }
            EventDetailInitialLoadingComposable eventDetailInitialLoadingComposable = EventDetailInitialLoadingComposable.INSTANCE;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, eventDetailInitialLoadingComposable.getLambda$1940668991$feature_event_detail_routing_externalDebug(), null, null, null, 0, 0L, 0L, null, eventDetailInitialLoadingComposable.m14151getLambda$1000720108$feature_event_detail_routing_externalDebug(), composerStartRestartGroup, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.routing.EventDetailInitialLoadingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailInitialLoadingComposable6.EventDetailInitialLoadingComposable$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
