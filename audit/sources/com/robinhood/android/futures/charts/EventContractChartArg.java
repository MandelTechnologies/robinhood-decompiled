package com.robinhood.android.futures.charts;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.futures.charts.contracts.models.EventContractRequest;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.utils.extensions.Uuids;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.p507ui.sdui.SduiColor;

/* compiled from: FuturesChartsServiceManager.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/futures/charts/EventContractChartArg;", "", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "requests", "", "Lcom/robinhood/futures/charts/contracts/models/EventContractRequest;", "fillEntireWidth", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Ljava/util/List;Z)V", "getSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getRequests", "()Ljava/util/List;", "getFillEntireWidth", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventContractChartArg {
    private final boolean fillEntireWidth;
    private final List<EventContractRequest> requests;
    private final DisplaySpan span;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventContractChartArg copy$default(EventContractChartArg eventContractChartArg, DisplaySpan displaySpan, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            displaySpan = eventContractChartArg.span;
        }
        if ((i & 2) != 0) {
            list = eventContractChartArg.requests;
        }
        if ((i & 4) != 0) {
            z = eventContractChartArg.fillEntireWidth;
        }
        return eventContractChartArg.copy(displaySpan, list, z);
    }

    /* renamed from: component1, reason: from getter */
    public final DisplaySpan getSpan() {
        return this.span;
    }

    public final List<EventContractRequest> component2() {
        return this.requests;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFillEntireWidth() {
        return this.fillEntireWidth;
    }

    public final EventContractChartArg copy(DisplaySpan span, List<EventContractRequest> requests, boolean fillEntireWidth) {
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(requests, "requests");
        return new EventContractChartArg(span, requests, fillEntireWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventContractChartArg)) {
            return false;
        }
        EventContractChartArg eventContractChartArg = (EventContractChartArg) other;
        return this.span == eventContractChartArg.span && Intrinsics.areEqual(this.requests, eventContractChartArg.requests) && this.fillEntireWidth == eventContractChartArg.fillEntireWidth;
    }

    public int hashCode() {
        return (((this.span.hashCode() * 31) + this.requests.hashCode()) * 31) + Boolean.hashCode(this.fillEntireWidth);
    }

    public String toString() {
        return "EventContractChartArg(span=" + this.span + ", requests=" + this.requests + ", fillEntireWidth=" + this.fillEntireWidth + ")";
    }

    public EventContractChartArg(DisplaySpan span, List<EventContractRequest> requests, boolean z) {
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.span = span;
        this.requests = requests;
        this.fillEntireWidth = z;
    }

    public final DisplaySpan getSpan() {
        return this.span;
    }

    public final List<EventContractRequest> getRequests() {
        return this.requests;
    }

    public final boolean getFillEntireWidth() {
        return this.fillEntireWidth;
    }

    /* compiled from: FuturesChartsServiceManager.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/charts/EventContractChartArg$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/charts/EventContractChartArg;", "contractIds", "", "Ljava/util/UUID;", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "fillEntireWidth", "", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ EventContractChartArg create$default(Companion companion, List list, DisplaySpan displaySpan, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.create(list, displaySpan, z);
        }

        public final EventContractChartArg create(List<UUID> contractIds, DisplaySpan span, boolean fillEntireWidth) {
            SduiColor sduiColor;
            Intrinsics.checkNotNullParameter(contractIds, "contractIds");
            Intrinsics.checkNotNullParameter(span, "span");
            List<UUID> list = contractIds;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String strSafeToString = Uuids.safeToString((UUID) obj);
                if (i == 0) {
                    sduiColor = SduiColor.f7093C1;
                } else if (i == 1) {
                    sduiColor = SduiColor.f7094C2;
                } else if (i == 2) {
                    sduiColor = SduiColor.f7095C3;
                } else if (i == 3) {
                    sduiColor = SduiColor.f7096C4;
                } else if (i == 4) {
                    sduiColor = SduiColor.f7097C5;
                } else {
                    throw new IllegalStateException("Should only have at most 5 lines for the EC chart.");
                }
                arrayList.add(new EventContractRequest(strSafeToString, sduiColor));
                i = i2;
            }
            return new EventContractChartArg(span, arrayList, fillEntireWidth);
        }
    }
}
