package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallDataResponseDto;

/* compiled from: MarginCallMarketOrderDataState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;", "", "maintenanceCallDataState", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState;", "nbboSummaryDataState", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryDataState;", "tradeSubmissionState", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState;", "orderStatusPollingState", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderStatusPollingState;", "initialMaintenanceCallState", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "<init>", "(Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState;Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryDataState;Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState;Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderStatusPollingState;Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;)V", "getMaintenanceCallDataState", "()Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState;", "getNbboSummaryDataState", "()Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryDataState;", "getTradeSubmissionState", "()Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState;", "getOrderStatusPollingState", "()Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderStatusPollingState;", "getInitialMaintenanceCallState", "()Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarginCallMarketOrderDataState {
    public static final int $stable = 8;
    private final GetMaintenanceCallDataResponseDto initialMaintenanceCallState;
    private final MarginCallMarketOrderDataState2 maintenanceCallDataState;
    private final MarginCallMarketOrderDataState3 nbboSummaryDataState;
    private final MarginCallMarketOrderDataState4 orderStatusPollingState;
    private final MarginCallMarketOrderDataState5 tradeSubmissionState;

    public MarginCallMarketOrderDataState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MarginCallMarketOrderDataState copy$default(MarginCallMarketOrderDataState marginCallMarketOrderDataState, MarginCallMarketOrderDataState2 marginCallMarketOrderDataState2, MarginCallMarketOrderDataState3 marginCallMarketOrderDataState3, MarginCallMarketOrderDataState5 marginCallMarketOrderDataState5, MarginCallMarketOrderDataState4 marginCallMarketOrderDataState4, GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            marginCallMarketOrderDataState2 = marginCallMarketOrderDataState.maintenanceCallDataState;
        }
        if ((i & 2) != 0) {
            marginCallMarketOrderDataState3 = marginCallMarketOrderDataState.nbboSummaryDataState;
        }
        if ((i & 4) != 0) {
            marginCallMarketOrderDataState5 = marginCallMarketOrderDataState.tradeSubmissionState;
        }
        if ((i & 8) != 0) {
            marginCallMarketOrderDataState4 = marginCallMarketOrderDataState.orderStatusPollingState;
        }
        if ((i & 16) != 0) {
            getMaintenanceCallDataResponseDto = marginCallMarketOrderDataState.initialMaintenanceCallState;
        }
        GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto2 = getMaintenanceCallDataResponseDto;
        MarginCallMarketOrderDataState5 marginCallMarketOrderDataState52 = marginCallMarketOrderDataState5;
        return marginCallMarketOrderDataState.copy(marginCallMarketOrderDataState2, marginCallMarketOrderDataState3, marginCallMarketOrderDataState52, marginCallMarketOrderDataState4, getMaintenanceCallDataResponseDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final MarginCallMarketOrderDataState2 getMaintenanceCallDataState() {
        return this.maintenanceCallDataState;
    }

    /* renamed from: component2, reason: from getter */
    public final MarginCallMarketOrderDataState3 getNbboSummaryDataState() {
        return this.nbboSummaryDataState;
    }

    /* renamed from: component3, reason: from getter */
    public final MarginCallMarketOrderDataState5 getTradeSubmissionState() {
        return this.tradeSubmissionState;
    }

    /* renamed from: component4, reason: from getter */
    public final MarginCallMarketOrderDataState4 getOrderStatusPollingState() {
        return this.orderStatusPollingState;
    }

    /* renamed from: component5, reason: from getter */
    public final GetMaintenanceCallDataResponseDto getInitialMaintenanceCallState() {
        return this.initialMaintenanceCallState;
    }

    public final MarginCallMarketOrderDataState copy(MarginCallMarketOrderDataState2 maintenanceCallDataState, MarginCallMarketOrderDataState3 nbboSummaryDataState, MarginCallMarketOrderDataState5 tradeSubmissionState, MarginCallMarketOrderDataState4 orderStatusPollingState, GetMaintenanceCallDataResponseDto initialMaintenanceCallState) {
        Intrinsics.checkNotNullParameter(maintenanceCallDataState, "maintenanceCallDataState");
        Intrinsics.checkNotNullParameter(tradeSubmissionState, "tradeSubmissionState");
        return new MarginCallMarketOrderDataState(maintenanceCallDataState, nbboSummaryDataState, tradeSubmissionState, orderStatusPollingState, initialMaintenanceCallState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginCallMarketOrderDataState)) {
            return false;
        }
        MarginCallMarketOrderDataState marginCallMarketOrderDataState = (MarginCallMarketOrderDataState) other;
        return Intrinsics.areEqual(this.maintenanceCallDataState, marginCallMarketOrderDataState.maintenanceCallDataState) && Intrinsics.areEqual(this.nbboSummaryDataState, marginCallMarketOrderDataState.nbboSummaryDataState) && Intrinsics.areEqual(this.tradeSubmissionState, marginCallMarketOrderDataState.tradeSubmissionState) && Intrinsics.areEqual(this.orderStatusPollingState, marginCallMarketOrderDataState.orderStatusPollingState) && Intrinsics.areEqual(this.initialMaintenanceCallState, marginCallMarketOrderDataState.initialMaintenanceCallState);
    }

    public int hashCode() {
        int iHashCode = this.maintenanceCallDataState.hashCode() * 31;
        MarginCallMarketOrderDataState3 marginCallMarketOrderDataState3 = this.nbboSummaryDataState;
        int iHashCode2 = (((iHashCode + (marginCallMarketOrderDataState3 == null ? 0 : marginCallMarketOrderDataState3.hashCode())) * 31) + this.tradeSubmissionState.hashCode()) * 31;
        MarginCallMarketOrderDataState4 marginCallMarketOrderDataState4 = this.orderStatusPollingState;
        int iHashCode3 = (iHashCode2 + (marginCallMarketOrderDataState4 == null ? 0 : marginCallMarketOrderDataState4.hashCode())) * 31;
        GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto = this.initialMaintenanceCallState;
        return iHashCode3 + (getMaintenanceCallDataResponseDto != null ? getMaintenanceCallDataResponseDto.hashCode() : 0);
    }

    public String toString() {
        return "MarginCallMarketOrderDataState(maintenanceCallDataState=" + this.maintenanceCallDataState + ", nbboSummaryDataState=" + this.nbboSummaryDataState + ", tradeSubmissionState=" + this.tradeSubmissionState + ", orderStatusPollingState=" + this.orderStatusPollingState + ", initialMaintenanceCallState=" + this.initialMaintenanceCallState + ")";
    }

    public MarginCallMarketOrderDataState(MarginCallMarketOrderDataState2 maintenanceCallDataState, MarginCallMarketOrderDataState3 marginCallMarketOrderDataState3, MarginCallMarketOrderDataState5 tradeSubmissionState, MarginCallMarketOrderDataState4 marginCallMarketOrderDataState4, GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto) {
        Intrinsics.checkNotNullParameter(maintenanceCallDataState, "maintenanceCallDataState");
        Intrinsics.checkNotNullParameter(tradeSubmissionState, "tradeSubmissionState");
        this.maintenanceCallDataState = maintenanceCallDataState;
        this.nbboSummaryDataState = marginCallMarketOrderDataState3;
        this.tradeSubmissionState = tradeSubmissionState;
        this.orderStatusPollingState = marginCallMarketOrderDataState4;
        this.initialMaintenanceCallState = getMaintenanceCallDataResponseDto;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MarginCallMarketOrderDataState(com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState2 r2, com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState3 r3, com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState5 r4, com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState4 r5, microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallDataResponseDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            com.robinhood.android.feature.margin.call.v2.marketorder.MaintenanceCallDataState$Loading r2 = com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState2.Loading.INSTANCE
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L12
            com.robinhood.android.feature.margin.call.v2.marketorder.TradeSubmissionState$NotStarted r4 = com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState5.NotStarted.INSTANCE
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L17
            r5 = r0
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L22
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L28
        L22:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L28:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState.<init>(com.robinhood.android.feature.margin.call.v2.marketorder.MaintenanceCallDataState, com.robinhood.android.feature.margin.call.v2.marketorder.NbboSummaryDataState, com.robinhood.android.feature.margin.call.v2.marketorder.TradeSubmissionState, com.robinhood.android.feature.margin.call.v2.marketorder.OrderStatusPollingState, microgram.contracts.margin.margin_call.proto.v1.GetMaintenanceCallDataResponseDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final MarginCallMarketOrderDataState2 getMaintenanceCallDataState() {
        return this.maintenanceCallDataState;
    }

    public final MarginCallMarketOrderDataState3 getNbboSummaryDataState() {
        return this.nbboSummaryDataState;
    }

    public final MarginCallMarketOrderDataState5 getTradeSubmissionState() {
        return this.tradeSubmissionState;
    }

    public final MarginCallMarketOrderDataState4 getOrderStatusPollingState() {
        return this.orderStatusPollingState;
    }

    public final GetMaintenanceCallDataResponseDto getInitialMaintenanceCallState() {
        return this.initialMaintenanceCallState;
    }
}
