package com.robinhood.librobinhood.data.store.bonfire.chart;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.charts.models.dao.PortfolioChartDao;
import com.robinhood.android.charts.models.p080db.PortfolioChartModel;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenPortfolioChartStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ServerDrivenPortfolioChartStore.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ2\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016J0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenPortfolioChartStore;", "Lcom/robinhood/store/Store;", "portfolioApi", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "portfolioChartDao", "Lcom/robinhood/android/charts/models/dao/PortfolioChartDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/portfolio/PortfolioApi;Lcom/robinhood/android/charts/models/dao/PortfolioChartDao;Lcom/robinhood/store/StoreBundle;)V", "portfolioChartEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenPortfolioChartStore$Request;", "Lcom/robinhood/android/charts/models/db/PortfolioChartModel;", "portfolioChartQuery", "Lcom/robinhood/android/moria/db/Query;", "refreshPortfolioChart", "Lkotlinx/coroutines/Job;", "accountNumber", "", "spanQueryValue", "isForWidget", "", "isPrivacyEnabled", "force", "getPortfolioChart", "Lio/reactivex/Single;", "Request", "Companion", "lib-store-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class ServerDrivenPortfolioChartStore extends Store {
    public static final String SPAN_QUERY_VALUE_DAY = "day";
    private final PortfolioApi portfolioApi;
    private final PortfolioChartDao portfolioChartDao;
    private final Endpoint<Request, PortfolioChartModel> portfolioChartEndpoint;
    private final Query<Request, PortfolioChartModel> portfolioChartQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerDrivenPortfolioChartStore(PortfolioApi portfolioApi, PortfolioChartDao portfolioChartDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
        Intrinsics.checkNotNullParameter(portfolioChartDao, "portfolioChartDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.portfolioApi = portfolioApi;
        this.portfolioChartDao = portfolioChartDao;
        this.portfolioChartEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ServerDrivenPortfolioChartStore3(this, null), getLogoutKillswitch(), new ServerDrivenPortfolioChartStore4(this, null), storeBundle.getClock(), null, 16, null);
        this.portfolioChartQuery = Store.create$default(this, Query.INSTANCE, "queryPortfolioChart", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenPortfolioChartStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ServerDrivenPortfolioChartStore.portfolioChartQuery$lambda$0(this.f$0, (ServerDrivenPortfolioChartStore.Request) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenPortfolioChartStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ServerDrivenPortfolioChartStore.portfolioChartQuery$lambda$1(this.f$0, (ServerDrivenPortfolioChartStore.Request) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ServerDrivenPortfolioChartStore.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenPortfolioChartStore$Request;", "", "accountNumber", "", "spanQueryValue", "isForWidget", "", "isPrivacyEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getSpanQueryValue", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Request {
        private final String accountNumber;
        private final boolean isForWidget;
        private final boolean isPrivacyEnabled;
        private final String spanQueryValue;

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = request.spanQueryValue;
            }
            if ((i & 4) != 0) {
                z = request.isForWidget;
            }
            if ((i & 8) != 0) {
                z2 = request.isPrivacyEnabled;
            }
            return request.copy(str, str2, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSpanQueryValue() {
            return this.spanQueryValue;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsForWidget() {
            return this.isForWidget;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsPrivacyEnabled() {
            return this.isPrivacyEnabled;
        }

        public final Request copy(String accountNumber, String spanQueryValue, boolean isForWidget, boolean isPrivacyEnabled) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(spanQueryValue, "spanQueryValue");
            return new Request(accountNumber, spanQueryValue, isForWidget, isPrivacyEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.accountNumber, request.accountNumber) && Intrinsics.areEqual(this.spanQueryValue, request.spanQueryValue) && this.isForWidget == request.isForWidget && this.isPrivacyEnabled == request.isPrivacyEnabled;
        }

        public int hashCode() {
            return (((((this.accountNumber.hashCode() * 31) + this.spanQueryValue.hashCode()) * 31) + Boolean.hashCode(this.isForWidget)) * 31) + Boolean.hashCode(this.isPrivacyEnabled);
        }

        public String toString() {
            return "Request(accountNumber=" + this.accountNumber + ", spanQueryValue=" + this.spanQueryValue + ", isForWidget=" + this.isForWidget + ", isPrivacyEnabled=" + this.isPrivacyEnabled + ")";
        }

        public Request(String accountNumber, String spanQueryValue, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(spanQueryValue, "spanQueryValue");
            this.accountNumber = accountNumber;
            this.spanQueryValue = spanQueryValue;
            this.isForWidget = z;
            this.isPrivacyEnabled = z2;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getSpanQueryValue() {
            return this.spanQueryValue;
        }

        public final boolean isForWidget() {
            return this.isForWidget;
        }

        public final boolean isPrivacyEnabled() {
            return this.isPrivacyEnabled;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow portfolioChartQuery$lambda$0(ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore, Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(serverDrivenPortfolioChartStore.portfolioChartEndpoint, request, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow portfolioChartQuery$lambda$1(ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore, Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return serverDrivenPortfolioChartStore.portfolioChartDao.getPortfolioChart(request.getSpanQueryValue(), request.isForWidget());
    }

    public static /* synthetic */ Job refreshPortfolioChart$default(ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return serverDrivenPortfolioChartStore.refreshPortfolioChart(str, str2, z, z2, z3);
    }

    public final Job refreshPortfolioChart(String accountNumber, String spanQueryValue, boolean isForWidget, boolean isPrivacyEnabled, boolean force) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(spanQueryValue, "spanQueryValue");
        return Endpoint.DefaultImpls.refresh$default(this.portfolioChartEndpoint, new Request(accountNumber, spanQueryValue, isForWidget, isPrivacyEnabled), force, null, 4, null);
    }

    public static /* synthetic */ Single getPortfolioChart$default(ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return serverDrivenPortfolioChartStore.getPortfolioChart(str, str2, z, z2);
    }

    public final Single<PortfolioChartModel> getPortfolioChart(String accountNumber, String spanQueryValue, boolean isForWidget, boolean isPrivacyEnabled) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(spanQueryValue, "spanQueryValue");
        Single<PortfolioChartModel> singleFirstOrError = this.portfolioChartQuery.asObservable(new Request(accountNumber, spanQueryValue, isForWidget, isPrivacyEnabled)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        return singleFirstOrError;
    }
}
