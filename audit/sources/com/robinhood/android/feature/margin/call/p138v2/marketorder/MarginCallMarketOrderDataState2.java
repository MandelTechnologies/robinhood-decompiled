package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallSummaryFromDataResponseDto;

/* compiled from: MarginCallMarketOrderDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState;", "", "<init>", "()V", "Loading", "Error", "Loaded", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState$Error;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState$Loaded;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState$Loading;", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MaintenanceCallDataState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class MarginCallMarketOrderDataState2 {
    public static final int $stable = 0;

    public /* synthetic */ MarginCallMarketOrderDataState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: MarginCallMarketOrderDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState$Loading;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MaintenanceCallDataState$Loading */
    public static final /* data */ class Loading extends MarginCallMarketOrderDataState2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1346135498;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private MarginCallMarketOrderDataState2() {
    }

    /* compiled from: MarginCallMarketOrderDataState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState$Error;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "<init>", "(Ljava/lang/Throwable;)V", "getE", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MaintenanceCallDataState$Error, reason: from toString */
    public static final /* data */ class Error extends MarginCallMarketOrderDataState2 {
        public static final int $stable = 8;
        private final Throwable e;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.e;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getE() {
            return this.e;
        }

        public final Error copy(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return new Error(e);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.e, ((Error) other).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            return "Error(e=" + this.e + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable e) {
            super(null);
            Intrinsics.checkNotNullParameter(e, "e");
            this.e = e;
        }

        public final Throwable getE() {
            return this.e;
        }
    }

    /* compiled from: MarginCallMarketOrderDataState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState$Loaded;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MaintenanceCallDataState;", WebsocketGatewayConstants.DATA_KEY, "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto;", "<init>", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto;)V", "getData", "()Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MaintenanceCallDataState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends MarginCallMarketOrderDataState2 {
        public static final int $stable = 8;
        private final GetMaintenanceCallSummaryFromDataResponseDto data;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, GetMaintenanceCallSummaryFromDataResponseDto getMaintenanceCallSummaryFromDataResponseDto, int i, Object obj) {
            if ((i & 1) != 0) {
                getMaintenanceCallSummaryFromDataResponseDto = loaded.data;
            }
            return loaded.copy(getMaintenanceCallSummaryFromDataResponseDto);
        }

        /* renamed from: component1, reason: from getter */
        public final GetMaintenanceCallSummaryFromDataResponseDto getData() {
            return this.data;
        }

        public final Loaded copy(GetMaintenanceCallSummaryFromDataResponseDto data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Loaded(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.data, ((Loaded) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Loaded(data=" + this.data + ")";
        }

        public final GetMaintenanceCallSummaryFromDataResponseDto getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(GetMaintenanceCallSummaryFromDataResponseDto data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }
    }
}
