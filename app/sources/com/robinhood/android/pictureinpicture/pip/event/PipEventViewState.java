package com.robinhood.android.pictureinpicture.pip.event;

import android.os.Parcelable;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.eventcontracts.sharedeventui.PriceUtils;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartColorOverlay;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelItem;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PipEventViewState.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0015\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\t\u00108\u001a\u00020\u000eHÆ\u0003JW\u00109\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010:\u001a\u00020\u000e2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0 8F¢\u0006\u0006\u001a\u0004\b*\u0010#R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0 8F¢\u0006\u0006\u001a\u0004\b-\u0010#R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0/0 8F¢\u0006\u0006\u001a\u0004\b0\u0010#R\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010\u0012¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/event/PipEventViewState;", "", "contractIds", "Lkotlinx/collections/immutable/ImmutableList;", "Ljava/util/UUID;", "event", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "contractIdToQuotes", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "loading", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/models/event/ui/UiEcEvent;Lkotlinx/collections/immutable/ImmutableMap;Lcom/robinhood/models/serverdriven/experimental/api/Chart;Z)V", "getContractIds", "()Lkotlinx/collections/immutable/ImmutableList;", "getEvent", "()Lcom/robinhood/android/models/event/ui/UiEcEvent;", "getContractIdToQuotes", "()Lkotlinx/collections/immutable/ImmutableMap;", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getLoading", "()Z", "eventName", "", "getEventName", "()Ljava/lang/String;", "contractsForChart", "", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "getContractsForChart", "()Ljava/util/List;", "chartColorOverlay", "Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;", "getChartColorOverlay", "()Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;", "lines", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "getLines", "fills", "Lcom/robinhood/models/serverdriven/experimental/api/ChartFill;", "getFills", "overlays", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getOverlays", "chartLabels", "Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartLabelItem;", "getChartLabels", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class PipEventViewState {
    public static final int $stable = 8;
    private final Chart<Parcelable> chart;
    private final ImmutableMap<UUID, EventQuote> contractIdToQuotes;
    private final ImmutableList<UUID> contractIds;
    private final UiEcEvent event;
    private final boolean loading;

    public static /* synthetic */ PipEventViewState copy$default(PipEventViewState pipEventViewState, ImmutableList immutableList, UiEcEvent uiEcEvent, ImmutableMap immutableMap, Chart chart, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = pipEventViewState.contractIds;
        }
        if ((i & 2) != 0) {
            uiEcEvent = pipEventViewState.event;
        }
        if ((i & 4) != 0) {
            immutableMap = pipEventViewState.contractIdToQuotes;
        }
        if ((i & 8) != 0) {
            chart = pipEventViewState.chart;
        }
        if ((i & 16) != 0) {
            z = pipEventViewState.loading;
        }
        boolean z2 = z;
        ImmutableMap immutableMap2 = immutableMap;
        return pipEventViewState.copy(immutableList, uiEcEvent, immutableMap2, chart, z2);
    }

    public final ImmutableList<UUID> component1() {
        return this.contractIds;
    }

    /* renamed from: component2, reason: from getter */
    public final UiEcEvent getEvent() {
        return this.event;
    }

    public final ImmutableMap<UUID, EventQuote> component3() {
        return this.contractIdToQuotes;
    }

    public final Chart<Parcelable> component4() {
        return this.chart;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final PipEventViewState copy(ImmutableList<UUID> contractIds, UiEcEvent event, ImmutableMap<UUID, EventQuote> contractIdToQuotes, Chart<? extends Parcelable> chart, boolean loading) {
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        Intrinsics.checkNotNullParameter(contractIdToQuotes, "contractIdToQuotes");
        return new PipEventViewState(contractIds, event, contractIdToQuotes, chart, loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PipEventViewState)) {
            return false;
        }
        PipEventViewState pipEventViewState = (PipEventViewState) other;
        return Intrinsics.areEqual(this.contractIds, pipEventViewState.contractIds) && Intrinsics.areEqual(this.event, pipEventViewState.event) && Intrinsics.areEqual(this.contractIdToQuotes, pipEventViewState.contractIdToQuotes) && Intrinsics.areEqual(this.chart, pipEventViewState.chart) && this.loading == pipEventViewState.loading;
    }

    public int hashCode() {
        int iHashCode = this.contractIds.hashCode() * 31;
        UiEcEvent uiEcEvent = this.event;
        int iHashCode2 = (((iHashCode + (uiEcEvent == null ? 0 : uiEcEvent.hashCode())) * 31) + this.contractIdToQuotes.hashCode()) * 31;
        Chart<Parcelable> chart = this.chart;
        return ((iHashCode2 + (chart != null ? chart.hashCode() : 0)) * 31) + Boolean.hashCode(this.loading);
    }

    public String toString() {
        return "PipEventViewState(contractIds=" + this.contractIds + ", event=" + this.event + ", contractIdToQuotes=" + this.contractIdToQuotes + ", chart=" + this.chart + ", loading=" + this.loading + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PipEventViewState(ImmutableList<UUID> contractIds, UiEcEvent uiEcEvent, ImmutableMap<UUID, EventQuote> contractIdToQuotes, Chart<? extends Parcelable> chart, boolean z) {
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        Intrinsics.checkNotNullParameter(contractIdToQuotes, "contractIdToQuotes");
        this.contractIds = contractIds;
        this.event = uiEcEvent;
        this.contractIdToQuotes = contractIdToQuotes;
        this.chart = chart;
        this.loading = z;
    }

    public final ImmutableList<UUID> getContractIds() {
        return this.contractIds;
    }

    public final UiEcEvent getEvent() {
        return this.event;
    }

    public /* synthetic */ PipEventViewState(ImmutableList immutableList, UiEcEvent uiEcEvent, ImmutableMap immutableMap, Chart chart, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, (i & 2) != 0 ? null : uiEcEvent, (i & 4) != 0 ? extensions2.persistentMapOf() : immutableMap, (i & 8) != 0 ? null : chart, (i & 16) != 0 ? false : z);
    }

    public final ImmutableMap<UUID, EventQuote> getContractIdToQuotes() {
        return this.contractIdToQuotes;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final String getEventName() {
        Event event;
        UiEcEvent uiEcEvent = this.event;
        if (uiEcEvent == null || (event = uiEcEvent.getEvent()) == null) {
            return null;
        }
        return event.getName();
    }

    public final List<EventContract> getContractsForChart() {
        ImmutableList<UUID> immutableList = this.contractIds;
        ArrayList arrayList = new ArrayList();
        for (UUID uuid : immutableList) {
            UiEcEvent uiEcEvent = this.event;
            EventContract eventContract = uiEcEvent != null ? uiEcEvent.getContractIdToEventContract().get(uuid) : null;
            if (eventContract != null) {
                arrayList.add(eventContract);
            }
        }
        return arrayList;
    }

    public final EventChartColorOverlay getChartColorOverlay() {
        EventContract eventContract = (EventContract) CollectionsKt.getOrNull(getContractsForChart(), 0);
        DayNightColor dayNightColor = eventContract != null ? DayNightColor2.getDayNightColor(eventContract) : null;
        EventContract eventContract2 = (EventContract) CollectionsKt.getOrNull(getContractsForChart(), 1);
        DayNightColor dayNightColor2 = eventContract2 != null ? DayNightColor2.getDayNightColor(eventContract2) : null;
        EventContract eventContract3 = (EventContract) CollectionsKt.getOrNull(getContractsForChart(), 2);
        DayNightColor dayNightColor3 = eventContract3 != null ? DayNightColor2.getDayNightColor(eventContract3) : null;
        EventContract eventContract4 = (EventContract) CollectionsKt.getOrNull(getContractsForChart(), 3);
        DayNightColor dayNightColor4 = eventContract4 != null ? DayNightColor2.getDayNightColor(eventContract4) : null;
        EventContract eventContract5 = (EventContract) CollectionsKt.getOrNull(getContractsForChart(), 4);
        return new EventChartColorOverlay(dayNightColor, dayNightColor2, dayNightColor3, dayNightColor4, eventContract5 != null ? DayNightColor2.getDayNightColor(eventContract5) : null);
    }

    public final List<Line> getLines() {
        List<Line> lines;
        Chart<Parcelable> chart = this.chart;
        return (chart == null || (lines = chart.getLines()) == null) ? CollectionsKt.emptyList() : lines;
    }

    public final List<ChartFill> getFills() {
        List<ChartFill> fills;
        Chart<Parcelable> chart = this.chart;
        return (chart == null || (fills = chart.getFills()) == null) ? CollectionsKt.emptyList() : fills;
    }

    public final List<UIComponent<Parcelable>> getOverlays() {
        List<UIComponent<ActionT>> overlays;
        Chart<Parcelable> chart = this.chart;
        return (chart == null || (overlays = chart.getOverlays()) == 0) ? CollectionsKt.emptyList() : overlays;
    }

    public final ImmutableList<EventChartLabelItem> getChartLabels() {
        BigDecimal lastTradePrice;
        List<EventContract> contractsForChart = getContractsForChart();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractsForChart, 10));
        for (EventContract eventContract : contractsForChart) {
            DayNightColor dayNightColor = DayNightColor2.getDayNightColor(eventContract);
            String displayShortName = eventContract.getDisplayShortName();
            EventQuote eventQuote = this.contractIdToQuotes.get(eventContract.getContractId());
            arrayList.add(new EventChartLabelItem(dayNightColor, displayShortName, (eventQuote == null || (lastTradePrice = eventQuote.getLastTradePrice()) == null) ? null : PriceUtils.formatEcPrice(lastTradePrice, true)));
        }
        return extensions2.toPersistentList(arrayList);
    }
}
