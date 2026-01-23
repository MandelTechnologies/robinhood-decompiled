package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2Dao;
import com.robinhood.android.models.portfolio.api.ApiPerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Duration;

/* compiled from: PerformanceChartSettingsV2Store.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001f B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2HelperStore;", "Lcom/robinhood/store/Store;", "portfolioApi", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "chartSettingsDao", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2Dao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/portfolio/PortfolioApi;Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2Dao;Lcom/robinhood/store/StoreBundle;)V", "chartSettingsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2HelperStore$SettingsQueryParams;", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "chartSettingsQuery", "Lcom/robinhood/android/moria/db/Query;", "querySettings", "Lio/reactivex/Observable;", "accountNumber", "", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "querySettings$lib_store_portfolio_externalDebug", "postSettingsEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2HelperStore$SettingsUpdateParams;", "updateSettings", "Lkotlinx/coroutines/Job;", "updateModel", "Lcom/robinhood/android/models/portfolio/api/ApiPerformanceChartSettingsV2;", "updateSettings$lib_store_portfolio_externalDebug", "SettingsQueryParams", "SettingsUpdateParams", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore, reason: use source file name */
/* loaded from: classes13.dex */
public final class PerformanceChartSettingsV2Store2 extends Store {
    private final Endpoint<SettingsQueryParams, PerformanceChartSettingsV2> chartSettingsEndpoint;
    private final Query<SettingsQueryParams, PerformanceChartSettingsV2> chartSettingsQuery;
    private final PostEndpoint<SettingsUpdateParams, PerformanceChartSettingsV2> postSettingsEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceChartSettingsV2Store2(PortfolioApi portfolioApi, final PerformanceChartSettingsV2Dao chartSettingsDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
        Intrinsics.checkNotNullParameter(chartSettingsDao, "chartSettingsDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.chartSettingsEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new PerformanceChartSettingsV2Store3(portfolioApi, null), getLogoutKillswitch(), new PerformanceChartSettingsV2Store4(chartSettingsDao, null), storeBundle.getClock(), null, 16, null);
        this.chartSettingsQuery = Store.create$default(this, Query.INSTANCE, "queryPerformanceChartSettingsV2", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartSettingsV2Store2.chartSettingsQuery$lambda$0(this.f$0, (PerformanceChartSettingsV2Store2.SettingsQueryParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartSettingsV2Store2.chartSettingsQuery$lambda$1(chartSettingsDao, (PerformanceChartSettingsV2Store2.SettingsQueryParams) obj);
            }
        }, false, 8, null);
        this.postSettingsEndpoint = PostEndpoint.INSTANCE.createWithParams(new PerformanceChartSettingsV2Store5(portfolioApi, null), new PerformanceChartSettingsV2Store6(chartSettingsDao, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow chartSettingsQuery$lambda$0(PerformanceChartSettingsV2Store2 performanceChartSettingsV2Store2, SettingsQueryParams it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<SettingsQueryParams, PerformanceChartSettingsV2> endpoint = performanceChartSettingsV2Store2.chartSettingsEndpoint;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow chartSettingsQuery$lambda$1(PerformanceChartSettingsV2Dao performanceChartSettingsV2Dao, SettingsQueryParams request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return performanceChartSettingsV2Dao.streamChartSettings(request.getAccountNumber(), request.getChartType());
    }

    public final Observable<PerformanceChartSettingsV2> querySettings$lib_store_portfolio_externalDebug(String accountNumber, PerformanceChartType chartType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        return this.chartSettingsQuery.asObservable(new SettingsQueryParams(accountNumber, chartType));
    }

    public final Job updateSettings$lib_store_portfolio_externalDebug(String accountNumber, String chartType, ApiPerformanceChartSettingsV2 updateModel) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(updateModel, "updateModel");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new PerformanceChartSettingsV2Store7(this, accountNumber, chartType, updateModel, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PerformanceChartSettingsV2Store.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2HelperStore$SettingsQueryParams;", "", "accountNumber", "", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;)V", "getAccountNumber", "()Ljava/lang/String;", "getChartType", "()Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$SettingsQueryParams, reason: from toString */
    static final /* data */ class SettingsQueryParams {
        private final String accountNumber;
        private final PerformanceChartType chartType;

        public static /* synthetic */ SettingsQueryParams copy$default(SettingsQueryParams settingsQueryParams, String str, PerformanceChartType performanceChartType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = settingsQueryParams.accountNumber;
            }
            if ((i & 2) != 0) {
                performanceChartType = settingsQueryParams.chartType;
            }
            return settingsQueryParams.copy(str, performanceChartType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final PerformanceChartType getChartType() {
            return this.chartType;
        }

        public final SettingsQueryParams copy(String accountNumber, PerformanceChartType chartType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            return new SettingsQueryParams(accountNumber, chartType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsQueryParams)) {
                return false;
            }
            SettingsQueryParams settingsQueryParams = (SettingsQueryParams) other;
            return Intrinsics.areEqual(this.accountNumber, settingsQueryParams.accountNumber) && this.chartType == settingsQueryParams.chartType;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.chartType.hashCode();
        }

        public String toString() {
            return "SettingsQueryParams(accountNumber=" + this.accountNumber + ", chartType=" + this.chartType + ")";
        }

        public SettingsQueryParams(String accountNumber, PerformanceChartType chartType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            this.accountNumber = accountNumber;
            this.chartType = chartType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final PerformanceChartType getChartType() {
            return this.chartType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PerformanceChartSettingsV2Store.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2HelperStore$SettingsUpdateParams;", "", "accountNumber", "", "chartType", "updateModel", "Lcom/robinhood/android/models/portfolio/api/ApiPerformanceChartSettingsV2;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/ApiPerformanceChartSettingsV2;)V", "getAccountNumber", "()Ljava/lang/String;", "getChartType", "getUpdateModel", "()Lcom/robinhood/android/models/portfolio/api/ApiPerformanceChartSettingsV2;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$SettingsUpdateParams, reason: from toString */
    static final /* data */ class SettingsUpdateParams {
        private final String accountNumber;
        private final String chartType;
        private final ApiPerformanceChartSettingsV2 updateModel;

        public static /* synthetic */ SettingsUpdateParams copy$default(SettingsUpdateParams settingsUpdateParams, String str, String str2, ApiPerformanceChartSettingsV2 apiPerformanceChartSettingsV2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = settingsUpdateParams.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = settingsUpdateParams.chartType;
            }
            if ((i & 4) != 0) {
                apiPerformanceChartSettingsV2 = settingsUpdateParams.updateModel;
            }
            return settingsUpdateParams.copy(str, str2, apiPerformanceChartSettingsV2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getChartType() {
            return this.chartType;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiPerformanceChartSettingsV2 getUpdateModel() {
            return this.updateModel;
        }

        public final SettingsUpdateParams copy(String accountNumber, String chartType, ApiPerformanceChartSettingsV2 updateModel) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            Intrinsics.checkNotNullParameter(updateModel, "updateModel");
            return new SettingsUpdateParams(accountNumber, chartType, updateModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsUpdateParams)) {
                return false;
            }
            SettingsUpdateParams settingsUpdateParams = (SettingsUpdateParams) other;
            return Intrinsics.areEqual(this.accountNumber, settingsUpdateParams.accountNumber) && Intrinsics.areEqual(this.chartType, settingsUpdateParams.chartType) && Intrinsics.areEqual(this.updateModel, settingsUpdateParams.updateModel);
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.chartType.hashCode()) * 31) + this.updateModel.hashCode();
        }

        public String toString() {
            return "SettingsUpdateParams(accountNumber=" + this.accountNumber + ", chartType=" + this.chartType + ", updateModel=" + this.updateModel + ")";
        }

        public SettingsUpdateParams(String accountNumber, String chartType, ApiPerformanceChartSettingsV2 updateModel) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            Intrinsics.checkNotNullParameter(updateModel, "updateModel");
            this.accountNumber = accountNumber;
            this.chartType = chartType;
            this.updateModel = updateModel;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getChartType() {
            return this.chartType;
        }

        public final ApiPerformanceChartSettingsV2 getUpdateModel() {
            return this.updateModel;
        }
    }
}
