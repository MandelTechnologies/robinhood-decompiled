package com.robinhood.android.equitydetail.p123ui.statistics;

import com.robinhood.android.compose.bidask.BidAsk;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.HttpUrl;

/* compiled from: StatisticsSectionViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003Jg\u0010%\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u000eHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionViewState;", "", "dataRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "prospectusUrl", "Lokhttp3/HttpUrl;", "bidAsk", "Lcom/robinhood/android/compose/bidask/BidAsk;", "isInBidAskSdpStatsExperiment", "", "isInGoldRegionGate", "showBidAskDetails", "grossExpenseRatioBannerContent", "", "hasGoldL2UpsellImprovements", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lokhttp3/HttpUrl;Lcom/robinhood/android/compose/bidask/BidAsk;ZZZLjava/lang/String;Z)V", "getDataRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getProspectusUrl", "()Lokhttp3/HttpUrl;", "getBidAsk", "()Lcom/robinhood/android/compose/bidask/BidAsk;", "()Z", "getShowBidAskDetails", "getGrossExpenseRatioBannerContent", "()Ljava/lang/String;", "getHasGoldL2UpsellImprovements", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatisticsSectionViewState {
    public static final int $stable = 8;
    private final BidAsk bidAsk;
    private final ImmutableList<SdpDataRow3> dataRows;
    private final String grossExpenseRatioBannerContent;
    private final boolean hasGoldL2UpsellImprovements;
    private final boolean isInBidAskSdpStatsExperiment;
    private final boolean isInGoldRegionGate;
    private final HttpUrl prospectusUrl;
    private final boolean showBidAskDetails;

    public static /* synthetic */ StatisticsSectionViewState copy$default(StatisticsSectionViewState statisticsSectionViewState, ImmutableList immutableList, HttpUrl httpUrl, BidAsk bidAsk, boolean z, boolean z2, boolean z3, String str, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = statisticsSectionViewState.dataRows;
        }
        if ((i & 2) != 0) {
            httpUrl = statisticsSectionViewState.prospectusUrl;
        }
        if ((i & 4) != 0) {
            bidAsk = statisticsSectionViewState.bidAsk;
        }
        if ((i & 8) != 0) {
            z = statisticsSectionViewState.isInBidAskSdpStatsExperiment;
        }
        if ((i & 16) != 0) {
            z2 = statisticsSectionViewState.isInGoldRegionGate;
        }
        if ((i & 32) != 0) {
            z3 = statisticsSectionViewState.showBidAskDetails;
        }
        if ((i & 64) != 0) {
            str = statisticsSectionViewState.grossExpenseRatioBannerContent;
        }
        if ((i & 128) != 0) {
            z4 = statisticsSectionViewState.hasGoldL2UpsellImprovements;
        }
        String str2 = str;
        boolean z5 = z4;
        boolean z6 = z2;
        boolean z7 = z3;
        return statisticsSectionViewState.copy(immutableList, httpUrl, bidAsk, z, z6, z7, str2, z5);
    }

    public final ImmutableList<SdpDataRow3> component1() {
        return this.dataRows;
    }

    /* renamed from: component2, reason: from getter */
    public final HttpUrl getProspectusUrl() {
        return this.prospectusUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final BidAsk getBidAsk() {
        return this.bidAsk;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsInBidAskSdpStatsExperiment() {
        return this.isInBidAskSdpStatsExperiment;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsInGoldRegionGate() {
        return this.isInGoldRegionGate;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowBidAskDetails() {
        return this.showBidAskDetails;
    }

    /* renamed from: component7, reason: from getter */
    public final String getGrossExpenseRatioBannerContent() {
        return this.grossExpenseRatioBannerContent;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasGoldL2UpsellImprovements() {
        return this.hasGoldL2UpsellImprovements;
    }

    public final StatisticsSectionViewState copy(ImmutableList<? extends SdpDataRow3> dataRows, HttpUrl prospectusUrl, BidAsk bidAsk, boolean isInBidAskSdpStatsExperiment, boolean isInGoldRegionGate, boolean showBidAskDetails, String grossExpenseRatioBannerContent, boolean hasGoldL2UpsellImprovements) {
        return new StatisticsSectionViewState(dataRows, prospectusUrl, bidAsk, isInBidAskSdpStatsExperiment, isInGoldRegionGate, showBidAskDetails, grossExpenseRatioBannerContent, hasGoldL2UpsellImprovements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticsSectionViewState)) {
            return false;
        }
        StatisticsSectionViewState statisticsSectionViewState = (StatisticsSectionViewState) other;
        return Intrinsics.areEqual(this.dataRows, statisticsSectionViewState.dataRows) && Intrinsics.areEqual(this.prospectusUrl, statisticsSectionViewState.prospectusUrl) && Intrinsics.areEqual(this.bidAsk, statisticsSectionViewState.bidAsk) && this.isInBidAskSdpStatsExperiment == statisticsSectionViewState.isInBidAskSdpStatsExperiment && this.isInGoldRegionGate == statisticsSectionViewState.isInGoldRegionGate && this.showBidAskDetails == statisticsSectionViewState.showBidAskDetails && Intrinsics.areEqual(this.grossExpenseRatioBannerContent, statisticsSectionViewState.grossExpenseRatioBannerContent) && this.hasGoldL2UpsellImprovements == statisticsSectionViewState.hasGoldL2UpsellImprovements;
    }

    public int hashCode() {
        ImmutableList<SdpDataRow3> immutableList = this.dataRows;
        int iHashCode = (immutableList == null ? 0 : immutableList.hashCode()) * 31;
        HttpUrl httpUrl = this.prospectusUrl;
        int iHashCode2 = (iHashCode + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31;
        BidAsk bidAsk = this.bidAsk;
        int iHashCode3 = (((((((iHashCode2 + (bidAsk == null ? 0 : bidAsk.hashCode())) * 31) + Boolean.hashCode(this.isInBidAskSdpStatsExperiment)) * 31) + Boolean.hashCode(this.isInGoldRegionGate)) * 31) + Boolean.hashCode(this.showBidAskDetails)) * 31;
        String str = this.grossExpenseRatioBannerContent;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasGoldL2UpsellImprovements);
    }

    public String toString() {
        return "StatisticsSectionViewState(dataRows=" + this.dataRows + ", prospectusUrl=" + this.prospectusUrl + ", bidAsk=" + this.bidAsk + ", isInBidAskSdpStatsExperiment=" + this.isInBidAskSdpStatsExperiment + ", isInGoldRegionGate=" + this.isInGoldRegionGate + ", showBidAskDetails=" + this.showBidAskDetails + ", grossExpenseRatioBannerContent=" + this.grossExpenseRatioBannerContent + ", hasGoldL2UpsellImprovements=" + this.hasGoldL2UpsellImprovements + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StatisticsSectionViewState(ImmutableList<? extends SdpDataRow3> immutableList, HttpUrl httpUrl, BidAsk bidAsk, boolean z, boolean z2, boolean z3, String str, boolean z4) {
        this.dataRows = immutableList;
        this.prospectusUrl = httpUrl;
        this.bidAsk = bidAsk;
        this.isInBidAskSdpStatsExperiment = z;
        this.isInGoldRegionGate = z2;
        this.showBidAskDetails = z3;
        this.grossExpenseRatioBannerContent = str;
        this.hasGoldL2UpsellImprovements = z4;
    }

    public /* synthetic */ StatisticsSectionViewState(ImmutableList immutableList, HttpUrl httpUrl, BidAsk bidAsk, boolean z, boolean z2, boolean z3, String str, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, httpUrl, bidAsk, z, z2, z3, str, (i & 128) != 0 ? false : z4);
    }

    public final ImmutableList<SdpDataRow3> getDataRows() {
        return this.dataRows;
    }

    public final HttpUrl getProspectusUrl() {
        return this.prospectusUrl;
    }

    public final BidAsk getBidAsk() {
        return this.bidAsk;
    }

    public final boolean isInBidAskSdpStatsExperiment() {
        return this.isInBidAskSdpStatsExperiment;
    }

    public final boolean isInGoldRegionGate() {
        return this.isInGoldRegionGate;
    }

    public final boolean getShowBidAskDetails() {
        return this.showBidAskDetails;
    }

    public final String getGrossExpenseRatioBannerContent() {
        return this.grossExpenseRatioBannerContent;
    }

    public final boolean getHasGoldL2UpsellImprovements() {
        return this.hasGoldL2UpsellImprovements;
    }
}
