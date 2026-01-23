package com.robinhood.android.trade.options.profitloss;

import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossChartViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/ChartParams;", "", "params", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "<init>", "(Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;)V", "getParams", "()Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "Loaded", "Failed", "Lcom/robinhood/android/trade/options/profitloss/ChartParams$Failed;", "Lcom/robinhood/android/trade/options/profitloss/ChartParams$Loaded;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class ChartParams {
    public static final int $stable = 8;
    private final ApiOptionsProfitLossChartRequestParams params;

    public /* synthetic */ ChartParams(ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiOptionsProfitLossChartRequestParams);
    }

    private ChartParams(ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams) {
        this.params = apiOptionsProfitLossChartRequestParams;
    }

    public ApiOptionsProfitLossChartRequestParams getParams() {
        return this.params;
    }

    /* compiled from: OptionsProfitLossChartViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/ChartParams$Loaded;", "Lcom/robinhood/android/trade/options/profitloss/ChartParams;", "params", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "<init>", "(Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;)V", "getParams", "()Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends ChartParams {
        public static final int $stable = 8;
        private final ApiOptionsProfitLossChartRequestParams params;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams, int i, Object obj) {
            if ((i & 1) != 0) {
                apiOptionsProfitLossChartRequestParams = loaded.params;
            }
            return loaded.copy(apiOptionsProfitLossChartRequestParams);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiOptionsProfitLossChartRequestParams getParams() {
            return this.params;
        }

        public final Loaded copy(ApiOptionsProfitLossChartRequestParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new Loaded(params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.params, ((Loaded) other).params);
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        public String toString() {
            return "Loaded(params=" + this.params + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(ApiOptionsProfitLossChartRequestParams params) {
            super(params, null);
            Intrinsics.checkNotNullParameter(params, "params");
            this.params = params;
        }

        @Override // com.robinhood.android.trade.options.profitloss.ChartParams
        public ApiOptionsProfitLossChartRequestParams getParams() {
            return this.params;
        }
    }

    /* compiled from: OptionsProfitLossChartViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/ChartParams$Failed;", "Lcom/robinhood/android/trade/options/profitloss/ChartParams;", "params", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "error", "", "<init>", "(Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;Ljava/lang/Throwable;)V", "getParams", "()Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failed extends ChartParams {
        public static final int $stable = 8;
        private final Throwable error;
        private final ApiOptionsProfitLossChartRequestParams params;

        public static /* synthetic */ Failed copy$default(Failed failed, ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                apiOptionsProfitLossChartRequestParams = failed.params;
            }
            if ((i & 2) != 0) {
                th = failed.error;
            }
            return failed.copy(apiOptionsProfitLossChartRequestParams, th);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiOptionsProfitLossChartRequestParams getParams() {
            return this.params;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Failed copy(ApiOptionsProfitLossChartRequestParams params, Throwable error) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failed(params, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.params, failed.params) && Intrinsics.areEqual(this.error, failed.error);
        }

        public int hashCode() {
            return (this.params.hashCode() * 31) + this.error.hashCode();
        }

        public String toString() {
            return "Failed(params=" + this.params + ", error=" + this.error + ")";
        }

        @Override // com.robinhood.android.trade.options.profitloss.ChartParams
        public ApiOptionsProfitLossChartRequestParams getParams() {
            return this.params;
        }

        public final Throwable getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(ApiOptionsProfitLossChartRequestParams params, Throwable error) {
            super(params, null);
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(error, "error");
            this.params = params;
            this.error = error;
        }
    }
}
