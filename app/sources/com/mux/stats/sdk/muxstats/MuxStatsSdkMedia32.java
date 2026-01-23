package com.mux.stats.sdk.muxstats;

import com.mux.stats.sdk.core.events.EventBus;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MuxStatsSdkMedia3.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/AdCollector;", "", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "stateCollector", "Lcom/mux/stats/sdk/core/events/EventBus;", "eventBus", "<init>", "(Lcom/mux/stats/sdk/muxstats/MuxStateCollector;Lcom/mux/stats/sdk/core/events/EventBus;)V", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "Lcom/mux/stats/sdk/core/events/EventBus;", "Companion", "library_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.mux.stats.sdk.muxstats.AdCollector, reason: use source file name */
/* loaded from: classes27.dex */
public final class MuxStatsSdkMedia32 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EventBus eventBus;
    private final MuxStateCollector stateCollector;

    public /* synthetic */ MuxStatsSdkMedia32(MuxStateCollector muxStateCollector, EventBus eventBus, DefaultConstructorMarker defaultConstructorMarker) {
        this(muxStateCollector, eventBus);
    }

    private MuxStatsSdkMedia32(MuxStateCollector muxStateCollector, EventBus eventBus) {
        this.stateCollector = muxStateCollector;
        this.eventBus = eventBus;
    }

    /* compiled from: MuxStatsSdkMedia3.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/AdCollector$Companion;", "", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/mux/stats/sdk/muxstats/AdCollector;", "collector", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "eventBus", "Lcom/mux/stats/sdk/core/events/EventBus;", "create$library_At_latestRelease", "library_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.mux.stats.sdk.muxstats.AdCollector$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ MuxStatsSdkMedia32 create$library_At_latestRelease(MuxStateCollector collector, EventBus eventBus) {
            Intrinsics.checkNotNullParameter(collector, "collector");
            Intrinsics.checkNotNullParameter(eventBus, "eventBus");
            return new MuxStatsSdkMedia32(collector, eventBus, null);
        }
    }
}
