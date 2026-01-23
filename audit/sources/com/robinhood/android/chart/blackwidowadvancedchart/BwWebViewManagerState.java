package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartInstrumentDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BwWebViewManagerState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007\u0082\u0001\b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "", "<init>", "()V", "chartUrl", "", "getChartUrl", "()Ljava/lang/String;", "instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "getInstrument", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "accountNumber", "getAccountNumber", "Error", "Stopped", "WaitingForChartUrl", "InitializingWebView", "InitializingChartApp", "ChartAppInitialized", "StartingChartApp", "ChartAppStarted", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$ChartAppInitialized;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$ChartAppStarted;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$Error;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$InitializingChartApp;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$InitializingWebView;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$StartingChartApp;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$Stopped;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$WaitingForChartUrl;", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class BwWebViewManagerState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final String chartUrl;
    private final SetChartInstrumentDto.InstrumentDto instrument;

    public /* synthetic */ BwWebViewManagerState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BwWebViewManagerState() {
    }

    public String getChartUrl() {
        return this.chartUrl;
    }

    public SetChartInstrumentDto.InstrumentDto getInstrument() {
        return this.instrument;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    /* compiled from: BwWebViewManagerState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$Error;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends BwWebViewManagerState {
        public static final Error INSTANCE = new Error();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 2067773777;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
            super(null);
        }
    }

    /* compiled from: BwWebViewManagerState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$Stopped;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Stopped extends BwWebViewManagerState {
        public static final Stopped INSTANCE = new Stopped();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof Stopped);
        }

        public int hashCode() {
            return -1844589866;
        }

        public String toString() {
            return "Stopped";
        }

        private Stopped() {
            super(null);
        }
    }

    /* compiled from: BwWebViewManagerState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$WaitingForChartUrl;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "accountNumber", "", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;Ljava/lang/String;)V", "getInstrument", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WaitingForChartUrl extends BwWebViewManagerState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final SetChartInstrumentDto.InstrumentDto instrument;

        public static /* synthetic */ WaitingForChartUrl copy$default(WaitingForChartUrl waitingForChartUrl, SetChartInstrumentDto.InstrumentDto instrumentDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                instrumentDto = waitingForChartUrl.instrument;
            }
            if ((i & 2) != 0) {
                str = waitingForChartUrl.accountNumber;
            }
            return waitingForChartUrl.copy(instrumentDto, str);
        }

        /* renamed from: component1, reason: from getter */
        public final SetChartInstrumentDto.InstrumentDto getInstrument() {
            return this.instrument;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final WaitingForChartUrl copy(SetChartInstrumentDto.InstrumentDto instrument, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            return new WaitingForChartUrl(instrument, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitingForChartUrl)) {
                return false;
            }
            WaitingForChartUrl waitingForChartUrl = (WaitingForChartUrl) other;
            return Intrinsics.areEqual(this.instrument, waitingForChartUrl.instrument) && Intrinsics.areEqual(this.accountNumber, waitingForChartUrl.accountNumber);
        }

        public int hashCode() {
            int iHashCode = this.instrument.hashCode() * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "WaitingForChartUrl(instrument=" + this.instrument + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public SetChartInstrumentDto.InstrumentDto getInstrument() {
            return this.instrument;
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitingForChartUrl(SetChartInstrumentDto.InstrumentDto instrument, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.instrument = instrument;
            this.accountNumber = str;
        }
    }

    /* compiled from: BwWebViewManagerState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$InitializingWebView;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "chartUrl", "", "instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "accountNumber", "<init>", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;Ljava/lang/String;)V", "getChartUrl", "()Ljava/lang/String;", "getInstrument", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitializingWebView extends BwWebViewManagerState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final String chartUrl;
        private final SetChartInstrumentDto.InstrumentDto instrument;

        public static /* synthetic */ InitializingWebView copy$default(InitializingWebView initializingWebView, String str, SetChartInstrumentDto.InstrumentDto instrumentDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initializingWebView.chartUrl;
            }
            if ((i & 2) != 0) {
                instrumentDto = initializingWebView.instrument;
            }
            if ((i & 4) != 0) {
                str2 = initializingWebView.accountNumber;
            }
            return initializingWebView.copy(str, instrumentDto, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChartUrl() {
            return this.chartUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final SetChartInstrumentDto.InstrumentDto getInstrument() {
            return this.instrument;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final InitializingWebView copy(String chartUrl, SetChartInstrumentDto.InstrumentDto instrument, String accountNumber) {
            Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
            return new InitializingWebView(chartUrl, instrument, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitializingWebView)) {
                return false;
            }
            InitializingWebView initializingWebView = (InitializingWebView) other;
            return Intrinsics.areEqual(this.chartUrl, initializingWebView.chartUrl) && Intrinsics.areEqual(this.instrument, initializingWebView.instrument) && Intrinsics.areEqual(this.accountNumber, initializingWebView.accountNumber);
        }

        public int hashCode() {
            int iHashCode = this.chartUrl.hashCode() * 31;
            SetChartInstrumentDto.InstrumentDto instrumentDto = this.instrument;
            int iHashCode2 = (iHashCode + (instrumentDto == null ? 0 : instrumentDto.hashCode())) * 31;
            String str = this.accountNumber;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "InitializingWebView(chartUrl=" + this.chartUrl + ", instrument=" + this.instrument + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public String getChartUrl() {
            return this.chartUrl;
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public SetChartInstrumentDto.InstrumentDto getInstrument() {
            return this.instrument;
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitializingWebView(String chartUrl, SetChartInstrumentDto.InstrumentDto instrumentDto, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
            this.chartUrl = chartUrl;
            this.instrument = instrumentDto;
            this.accountNumber = str;
        }
    }

    /* compiled from: BwWebViewManagerState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$InitializingChartApp;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "chartUrl", "", "instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "accountNumber", "<init>", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;Ljava/lang/String;)V", "getChartUrl", "()Ljava/lang/String;", "getInstrument", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitializingChartApp extends BwWebViewManagerState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final String chartUrl;
        private final SetChartInstrumentDto.InstrumentDto instrument;

        public static /* synthetic */ InitializingChartApp copy$default(InitializingChartApp initializingChartApp, String str, SetChartInstrumentDto.InstrumentDto instrumentDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initializingChartApp.chartUrl;
            }
            if ((i & 2) != 0) {
                instrumentDto = initializingChartApp.instrument;
            }
            if ((i & 4) != 0) {
                str2 = initializingChartApp.accountNumber;
            }
            return initializingChartApp.copy(str, instrumentDto, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChartUrl() {
            return this.chartUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final SetChartInstrumentDto.InstrumentDto getInstrument() {
            return this.instrument;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final InitializingChartApp copy(String chartUrl, SetChartInstrumentDto.InstrumentDto instrument, String accountNumber) {
            Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
            return new InitializingChartApp(chartUrl, instrument, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitializingChartApp)) {
                return false;
            }
            InitializingChartApp initializingChartApp = (InitializingChartApp) other;
            return Intrinsics.areEqual(this.chartUrl, initializingChartApp.chartUrl) && Intrinsics.areEqual(this.instrument, initializingChartApp.instrument) && Intrinsics.areEqual(this.accountNumber, initializingChartApp.accountNumber);
        }

        public int hashCode() {
            int iHashCode = this.chartUrl.hashCode() * 31;
            SetChartInstrumentDto.InstrumentDto instrumentDto = this.instrument;
            int iHashCode2 = (iHashCode + (instrumentDto == null ? 0 : instrumentDto.hashCode())) * 31;
            String str = this.accountNumber;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "InitializingChartApp(chartUrl=" + this.chartUrl + ", instrument=" + this.instrument + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public String getChartUrl() {
            return this.chartUrl;
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public SetChartInstrumentDto.InstrumentDto getInstrument() {
            return this.instrument;
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitializingChartApp(String chartUrl, SetChartInstrumentDto.InstrumentDto instrumentDto, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
            this.chartUrl = chartUrl;
            this.instrument = instrumentDto;
            this.accountNumber = str;
        }
    }

    /* compiled from: BwWebViewManagerState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$ChartAppInitialized;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "chartUrl", "", "<init>", "(Ljava/lang/String;)V", "getChartUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChartAppInitialized extends BwWebViewManagerState {
        public static final int $stable = 8;
        private final String chartUrl;

        public static /* synthetic */ ChartAppInitialized copy$default(ChartAppInitialized chartAppInitialized, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chartAppInitialized.chartUrl;
            }
            return chartAppInitialized.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChartUrl() {
            return this.chartUrl;
        }

        public final ChartAppInitialized copy(String chartUrl) {
            Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
            return new ChartAppInitialized(chartUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChartAppInitialized) && Intrinsics.areEqual(this.chartUrl, ((ChartAppInitialized) other).chartUrl);
        }

        public int hashCode() {
            return this.chartUrl.hashCode();
        }

        public String toString() {
            return "ChartAppInitialized(chartUrl=" + this.chartUrl + ")";
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public String getChartUrl() {
            return this.chartUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChartAppInitialized(String chartUrl) {
            super(null);
            Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
            this.chartUrl = chartUrl;
        }
    }

    /* compiled from: BwWebViewManagerState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$StartingChartApp;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "chartUrl", "", "instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "accountNumber", "<init>", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;Ljava/lang/String;)V", "getChartUrl", "()Ljava/lang/String;", "getInstrument", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartingChartApp extends BwWebViewManagerState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final String chartUrl;
        private final SetChartInstrumentDto.InstrumentDto instrument;

        public static /* synthetic */ StartingChartApp copy$default(StartingChartApp startingChartApp, String str, SetChartInstrumentDto.InstrumentDto instrumentDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startingChartApp.chartUrl;
            }
            if ((i & 2) != 0) {
                instrumentDto = startingChartApp.instrument;
            }
            if ((i & 4) != 0) {
                str2 = startingChartApp.accountNumber;
            }
            return startingChartApp.copy(str, instrumentDto, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChartUrl() {
            return this.chartUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final SetChartInstrumentDto.InstrumentDto getInstrument() {
            return this.instrument;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final StartingChartApp copy(String chartUrl, SetChartInstrumentDto.InstrumentDto instrument, String accountNumber) {
            Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            return new StartingChartApp(chartUrl, instrument, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartingChartApp)) {
                return false;
            }
            StartingChartApp startingChartApp = (StartingChartApp) other;
            return Intrinsics.areEqual(this.chartUrl, startingChartApp.chartUrl) && Intrinsics.areEqual(this.instrument, startingChartApp.instrument) && Intrinsics.areEqual(this.accountNumber, startingChartApp.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.chartUrl.hashCode() * 31) + this.instrument.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "StartingChartApp(chartUrl=" + this.chartUrl + ", instrument=" + this.instrument + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public String getChartUrl() {
            return this.chartUrl;
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public SetChartInstrumentDto.InstrumentDto getInstrument() {
            return this.instrument;
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartingChartApp(String chartUrl, SetChartInstrumentDto.InstrumentDto instrument, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.chartUrl = chartUrl;
            this.instrument = instrument;
            this.accountNumber = str;
        }
    }

    /* compiled from: BwWebViewManagerState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState$ChartAppStarted;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "chartUrl", "", "instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "accountNumber", "<init>", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;Ljava/lang/String;)V", "getChartUrl", "()Ljava/lang/String;", "getInstrument", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChartAppStarted extends BwWebViewManagerState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final String chartUrl;
        private final SetChartInstrumentDto.InstrumentDto instrument;

        public static /* synthetic */ ChartAppStarted copy$default(ChartAppStarted chartAppStarted, String str, SetChartInstrumentDto.InstrumentDto instrumentDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chartAppStarted.chartUrl;
            }
            if ((i & 2) != 0) {
                instrumentDto = chartAppStarted.instrument;
            }
            if ((i & 4) != 0) {
                str2 = chartAppStarted.accountNumber;
            }
            return chartAppStarted.copy(str, instrumentDto, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChartUrl() {
            return this.chartUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final SetChartInstrumentDto.InstrumentDto getInstrument() {
            return this.instrument;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ChartAppStarted copy(String chartUrl, SetChartInstrumentDto.InstrumentDto instrument, String accountNumber) {
            Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            return new ChartAppStarted(chartUrl, instrument, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChartAppStarted)) {
                return false;
            }
            ChartAppStarted chartAppStarted = (ChartAppStarted) other;
            return Intrinsics.areEqual(this.chartUrl, chartAppStarted.chartUrl) && Intrinsics.areEqual(this.instrument, chartAppStarted.instrument) && Intrinsics.areEqual(this.accountNumber, chartAppStarted.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.chartUrl.hashCode() * 31) + this.instrument.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ChartAppStarted(chartUrl=" + this.chartUrl + ", instrument=" + this.instrument + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public String getChartUrl() {
            return this.chartUrl;
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public SetChartInstrumentDto.InstrumentDto getInstrument() {
            return this.instrument;
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState
        public String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChartAppStarted(String chartUrl, SetChartInstrumentDto.InstrumentDto instrument, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.chartUrl = chartUrl;
            this.instrument = instrument;
            this.accountNumber = str;
        }
    }
}
