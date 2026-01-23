package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.portfolio.pnl.ProfitAndLossChartStore;
import com.robinhood.android.portfolio.pnl.api.ApiProfitAndLossChart;
import com.robinhood.android.portfolio.pnl.api.ProfitAndLossApi;
import com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan;
import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossChartDao;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChart;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Duration;

/* compiled from: ProfitAndLossChartStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossChartStore;", "Lcom/robinhood/store/Store;", "profitAndLossApi", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossApi;", "profitAndLossChartDao", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossChartDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossApi;Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossChartDao;Lcom/robinhood/store/StoreBundle;)V", "profitAndLossChartEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossChartStore$ProfitAndLossChartRequest;", "Lcom/robinhood/android/portfolio/pnl/api/ApiProfitAndLossChart;", "profitAndLossChartQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;", "streamProfitAndLossChart", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "assetTypes", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "span", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "ProfitAndLossChartRequest", "lib-store-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfitAndLossChartStore extends Store {
    public static final int $stable = 8;
    private final ProfitAndLossApi profitAndLossApi;
    private final ProfitAndLossChartDao profitAndLossChartDao;
    private final Endpoint<ProfitAndLossChartRequest, ApiProfitAndLossChart> profitAndLossChartEndpoint;
    private final Query<ProfitAndLossChartRequest, ProfitAndLossChart> profitAndLossChartQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitAndLossChartStore(ProfitAndLossApi profitAndLossApi, ProfitAndLossChartDao profitAndLossChartDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(profitAndLossApi, "profitAndLossApi");
        Intrinsics.checkNotNullParameter(profitAndLossChartDao, "profitAndLossChartDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.profitAndLossApi = profitAndLossApi;
        this.profitAndLossChartDao = profitAndLossChartDao;
        this.profitAndLossChartEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ProfitAndLossChartStore2(this, null), getLogoutKillswitch(), new ProfitAndLossChartStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.profitAndLossChartQuery = Store.create$default(this, Query.INSTANCE, "profitAndLossChartQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.portfolio.pnl.ProfitAndLossChartStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossChartStore.profitAndLossChartQuery$lambda$0(this.f$0, (ProfitAndLossChartStore.ProfitAndLossChartRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.portfolio.pnl.ProfitAndLossChartStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossChartStore.profitAndLossChartQuery$lambda$1(this.f$0, (ProfitAndLossChartStore.ProfitAndLossChartRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProfitAndLossChartStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossChartStore$ProfitAndLossChartRequest;", "", "accountNumber", "", "assetTypes", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "span", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;)V", "getAccountNumber", "()Ljava/lang/String;", "getAssetTypes", "()Ljava/util/List;", "getSpan", "()Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class ProfitAndLossChartRequest {
        private final String accountNumber;
        private final List<AssetClass> assetTypes;
        private final ProfitAndLossChartSpan span;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProfitAndLossChartRequest copy$default(ProfitAndLossChartRequest profitAndLossChartRequest, String str, List list, ProfitAndLossChartSpan profitAndLossChartSpan, int i, Object obj) {
            if ((i & 1) != 0) {
                str = profitAndLossChartRequest.accountNumber;
            }
            if ((i & 2) != 0) {
                list = profitAndLossChartRequest.assetTypes;
            }
            if ((i & 4) != 0) {
                profitAndLossChartSpan = profitAndLossChartRequest.span;
            }
            return profitAndLossChartRequest.copy(str, list, profitAndLossChartSpan);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final List<AssetClass> component2() {
            return this.assetTypes;
        }

        /* renamed from: component3, reason: from getter */
        public final ProfitAndLossChartSpan getSpan() {
            return this.span;
        }

        public final ProfitAndLossChartRequest copy(String accountNumber, List<? extends AssetClass> assetTypes, ProfitAndLossChartSpan span) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(assetTypes, "assetTypes");
            return new ProfitAndLossChartRequest(accountNumber, assetTypes, span);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfitAndLossChartRequest)) {
                return false;
            }
            ProfitAndLossChartRequest profitAndLossChartRequest = (ProfitAndLossChartRequest) other;
            return Intrinsics.areEqual(this.accountNumber, profitAndLossChartRequest.accountNumber) && Intrinsics.areEqual(this.assetTypes, profitAndLossChartRequest.assetTypes) && this.span == profitAndLossChartRequest.span;
        }

        public int hashCode() {
            int iHashCode = ((this.accountNumber.hashCode() * 31) + this.assetTypes.hashCode()) * 31;
            ProfitAndLossChartSpan profitAndLossChartSpan = this.span;
            return iHashCode + (profitAndLossChartSpan == null ? 0 : profitAndLossChartSpan.hashCode());
        }

        public String toString() {
            return "ProfitAndLossChartRequest(accountNumber=" + this.accountNumber + ", assetTypes=" + this.assetTypes + ", span=" + this.span + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ProfitAndLossChartRequest(String accountNumber, List<? extends AssetClass> assetTypes, ProfitAndLossChartSpan profitAndLossChartSpan) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(assetTypes, "assetTypes");
            this.accountNumber = accountNumber;
            this.assetTypes = assetTypes;
            this.span = profitAndLossChartSpan;
        }

        public /* synthetic */ ProfitAndLossChartRequest(String str, List list, ProfitAndLossChartSpan profitAndLossChartSpan, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i & 4) != 0 ? null : profitAndLossChartSpan);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final List<AssetClass> getAssetTypes() {
            return this.assetTypes;
        }

        public final ProfitAndLossChartSpan getSpan() {
            return this.span;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow profitAndLossChartQuery$lambda$0(ProfitAndLossChartStore profitAndLossChartStore, ProfitAndLossChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Endpoint<ProfitAndLossChartRequest, ApiProfitAndLossChart> endpoint = profitAndLossChartStore.profitAndLossChartEndpoint;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, request, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow profitAndLossChartQuery$lambda$1(ProfitAndLossChartStore profitAndLossChartStore, ProfitAndLossChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return profitAndLossChartStore.profitAndLossChartDao.getProfitAndLossChart(request.getAccountNumber());
    }

    public final Flow<ProfitAndLossChart> streamProfitAndLossChart(String accountNumber, List<? extends AssetClass> assetTypes, ProfitAndLossChartSpan span) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(assetTypes, "assetTypes");
        return this.profitAndLossChartQuery.asFlow(new ProfitAndLossChartRequest(accountNumber, assetTypes, span));
    }
}
