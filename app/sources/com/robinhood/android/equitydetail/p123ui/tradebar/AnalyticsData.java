package com.robinhood.android.equitydetail.p123ui.tradebar;

import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailTradeBarViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/AnalyticsData;", "", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AnalyticsData {
    public static final int $stable = 8;
    private final Context context;
    private final Screen screen;

    public static /* synthetic */ AnalyticsData copy$default(AnalyticsData analyticsData, Context context, Screen screen, int i, Object obj) {
        if ((i & 1) != 0) {
            context = analyticsData.context;
        }
        if ((i & 2) != 0) {
            screen = analyticsData.screen;
        }
        return analyticsData.copy(context, screen);
    }

    /* renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    public final AnalyticsData copy(Context context, Screen screen) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new AnalyticsData(context, screen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsData)) {
            return false;
        }
        AnalyticsData analyticsData = (AnalyticsData) other;
        return Intrinsics.areEqual(this.context, analyticsData.context) && Intrinsics.areEqual(this.screen, analyticsData.screen);
    }

    public int hashCode() {
        return (this.context.hashCode() * 31) + this.screen.hashCode();
    }

    public String toString() {
        return "AnalyticsData(context=" + this.context + ", screen=" + this.screen + ")";
    }

    public AnalyticsData(Context context, Screen screen) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.context = context;
        this.screen = screen;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Screen getScreen() {
        return this.screen;
    }
}
