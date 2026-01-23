package com.robinhood.shared.common.earnings;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ChartGroupDto;

/* compiled from: EarningsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/common/earnings/EarningsViewState;", "", "<init>", "()V", "Loading", "LoadedNoEarnings", "Loaded", "Lcom/robinhood/shared/common/earnings/EarningsViewState$Loaded;", "Lcom/robinhood/shared/common/earnings/EarningsViewState$LoadedNoEarnings;", "Lcom/robinhood/shared/common/earnings/EarningsViewState$Loading;", "lib-earnings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public abstract class EarningsViewState {
    public static final int $stable = 0;

    public /* synthetic */ EarningsViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: EarningsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/earnings/EarningsViewState$Loading;", "Lcom/robinhood/shared/common/earnings/EarningsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-earnings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends EarningsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1029241957;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private EarningsViewState() {
    }

    /* compiled from: EarningsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/earnings/EarningsViewState$LoadedNoEarnings;", "Lcom/robinhood/shared/common/earnings/EarningsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-earnings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoadedNoEarnings extends EarningsViewState {
        public static final int $stable = 0;
        public static final LoadedNoEarnings INSTANCE = new LoadedNoEarnings();

        public boolean equals(Object other) {
            return this == other || (other instanceof LoadedNoEarnings);
        }

        public int hashCode() {
            return 1619255280;
        }

        public String toString() {
            return "LoadedNoEarnings";
        }

        private LoadedNoEarnings() {
            super(null);
        }
    }

    /* compiled from: EarningsViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/common/earnings/EarningsViewState$Loaded;", "Lcom/robinhood/shared/common/earnings/EarningsViewState;", "header", "", "estimatedEpsText", "actualEpsText", "epsAvailabilityText", "earningsCall", "Lcom/robinhood/shared/common/earnings/EarningsCall;", "sduiChart", "Lrh_server_driven_ui/v1/ChartGroupDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/common/earnings/EarningsCall;Lrh_server_driven_ui/v1/ChartGroupDto;)V", "getHeader", "()Ljava/lang/String;", "getEstimatedEpsText", "getActualEpsText", "getEpsAvailabilityText", "getEarningsCall", "()Lcom/robinhood/shared/common/earnings/EarningsCall;", "getSduiChart", "()Lrh_server_driven_ui/v1/ChartGroupDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-earnings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends EarningsViewState {
        public static final int $stable = 8;
        private final String actualEpsText;
        private final EarningsCall earningsCall;
        private final String epsAvailabilityText;
        private final String estimatedEpsText;
        private final String header;
        private final ChartGroupDto sduiChart;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, String str3, String str4, EarningsCall earningsCall, ChartGroupDto chartGroupDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.header;
            }
            if ((i & 2) != 0) {
                str2 = loaded.estimatedEpsText;
            }
            if ((i & 4) != 0) {
                str3 = loaded.actualEpsText;
            }
            if ((i & 8) != 0) {
                str4 = loaded.epsAvailabilityText;
            }
            if ((i & 16) != 0) {
                earningsCall = loaded.earningsCall;
            }
            if ((i & 32) != 0) {
                chartGroupDto = loaded.sduiChart;
            }
            EarningsCall earningsCall2 = earningsCall;
            ChartGroupDto chartGroupDto2 = chartGroupDto;
            return loaded.copy(str, str2, str3, str4, earningsCall2, chartGroupDto2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEstimatedEpsText() {
            return this.estimatedEpsText;
        }

        /* renamed from: component3, reason: from getter */
        public final String getActualEpsText() {
            return this.actualEpsText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEpsAvailabilityText() {
            return this.epsAvailabilityText;
        }

        /* renamed from: component5, reason: from getter */
        public final EarningsCall getEarningsCall() {
            return this.earningsCall;
        }

        /* renamed from: component6, reason: from getter */
        public final ChartGroupDto getSduiChart() {
            return this.sduiChart;
        }

        public final Loaded copy(String header, String estimatedEpsText, String actualEpsText, String epsAvailabilityText, EarningsCall earningsCall, ChartGroupDto sduiChart) {
            return new Loaded(header, estimatedEpsText, actualEpsText, epsAvailabilityText, earningsCall, sduiChart);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.header, loaded.header) && Intrinsics.areEqual(this.estimatedEpsText, loaded.estimatedEpsText) && Intrinsics.areEqual(this.actualEpsText, loaded.actualEpsText) && Intrinsics.areEqual(this.epsAvailabilityText, loaded.epsAvailabilityText) && Intrinsics.areEqual(this.earningsCall, loaded.earningsCall) && Intrinsics.areEqual(this.sduiChart, loaded.sduiChart);
        }

        public int hashCode() {
            String str = this.header;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.estimatedEpsText;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.actualEpsText;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.epsAvailabilityText;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            EarningsCall earningsCall = this.earningsCall;
            int iHashCode5 = (iHashCode4 + (earningsCall == null ? 0 : earningsCall.hashCode())) * 31;
            ChartGroupDto chartGroupDto = this.sduiChart;
            return iHashCode5 + (chartGroupDto != null ? chartGroupDto.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(header=" + this.header + ", estimatedEpsText=" + this.estimatedEpsText + ", actualEpsText=" + this.actualEpsText + ", epsAvailabilityText=" + this.epsAvailabilityText + ", earningsCall=" + this.earningsCall + ", sduiChart=" + this.sduiChart + ")";
        }

        public final String getHeader() {
            return this.header;
        }

        public final String getEstimatedEpsText() {
            return this.estimatedEpsText;
        }

        public final String getActualEpsText() {
            return this.actualEpsText;
        }

        public final String getEpsAvailabilityText() {
            return this.epsAvailabilityText;
        }

        public final EarningsCall getEarningsCall() {
            return this.earningsCall;
        }

        public final ChartGroupDto getSduiChart() {
            return this.sduiChart;
        }

        public Loaded(String str, String str2, String str3, String str4, EarningsCall earningsCall, ChartGroupDto chartGroupDto) {
            super(null);
            this.header = str;
            this.estimatedEpsText = str2;
            this.actualEpsText = str3;
            this.epsAvailabilityText = str4;
            this.earningsCall = earningsCall;
            this.sduiChart = chartGroupDto;
        }
    }
}
