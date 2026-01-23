package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: MarginInvestingInfoStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "Lcom/robinhood/store/Store;", "marginInvestingApi", "Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;Lcom/robinhood/store/StoreBundle;)V", "flow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore$Params;", "query", "Lcom/robinhood/android/moria/db/Query;", "getMarginInvestingInfo", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollMarginInvestingInfo", "Lkotlinx/coroutines/flow/Flow;", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "Params", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginInvestingInfoStore extends Store {
    private final SharedFlow2<ApiMarginInvestingInfo> flow;
    private final Endpoint<Params, ApiMarginInvestingInfo> getEndpoint;
    private final MarginInvestingApi marginInvestingApi;
    private final Query<Params, ApiMarginInvestingInfo> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginInvestingInfoStore(MarginInvestingApi marginInvestingApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(marginInvestingApi, "marginInvestingApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.marginInvestingApi = marginInvestingApi;
        SharedFlow2<ApiMarginInvestingInfo> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 1, null, 4, null);
        this.flow = sharedFlow2MutableSharedFlow$default;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        MarginInvestingInfoStore2 marginInvestingInfoStore2 = new MarginInvestingInfoStore2(sharedFlow2MutableSharedFlow$default);
        this.getEndpoint = Endpoint.Companion.create$default(companion, new MarginInvestingInfoStore3(this, null), getLogoutKillswitch(), marginInvestingInfoStore2, storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "marginInvestingInfoQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.lib.margin.MarginInvestingInfoStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginInvestingInfoStore.query$lambda$0(this.f$0, (MarginInvestingInfoStore.Params) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.lib.margin.MarginInvestingInfoStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginInvestingInfoStore.query$lambda$1(this.f$0, (MarginInvestingInfoStore.Params) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(MarginInvestingInfoStore marginInvestingInfoStore, Params request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(marginInvestingInfoStore.getEndpoint, request, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(MarginInvestingInfoStore marginInvestingInfoStore, Params it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.asSharedFlow(marginInvestingInfoStore.flow);
    }

    /* compiled from: MarginInvestingInfoStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore$Params;", "", "accountNumber", "", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)V", "getAccountNumber", "()Ljava/lang/String;", "getDisplayCurrency", "()Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Params {
        private final String accountNumber;
        private final DisplayCurrency displayCurrency;

        public static /* synthetic */ Params copy$default(Params params, String str, DisplayCurrency displayCurrency, int i, Object obj) {
            if ((i & 1) != 0) {
                str = params.accountNumber;
            }
            if ((i & 2) != 0) {
                displayCurrency = params.displayCurrency;
            }
            return params.copy(str, displayCurrency);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }

        public final Params copy(String accountNumber, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            return new Params(accountNumber, displayCurrency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Intrinsics.areEqual(this.accountNumber, params.accountNumber) && this.displayCurrency == params.displayCurrency;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.displayCurrency.hashCode();
        }

        public String toString() {
            return "Params(accountNumber=" + this.accountNumber + ", displayCurrency=" + this.displayCurrency + ")";
        }

        public Params(String accountNumber, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            this.accountNumber = accountNumber;
            this.displayCurrency = displayCurrency;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public /* synthetic */ Params(String str, DisplayCurrency displayCurrency, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? DisplayCurrency.USD : displayCurrency);
        }

        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object getMarginInvestingInfo(String str, Continuation<? super ApiMarginInvestingInfo> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getEndpoint, new Params(str, null, 2, 0 == true ? 1 : 0), null, continuation, 2, null);
    }

    public static /* synthetic */ Flow pollMarginInvestingInfo$default(MarginInvestingInfoStore marginInvestingInfoStore, String str, DisplayCurrency displayCurrency, int i, Object obj) {
        if ((i & 2) != 0) {
            displayCurrency = DisplayCurrency.USD;
        }
        return marginInvestingInfoStore.pollMarginInvestingInfo(str, displayCurrency);
    }

    public final Flow<ApiMarginInvestingInfo> pollMarginInvestingInfo(String accountNumber, DisplayCurrency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        return this.query.asFlow(new Params(accountNumber, displayCurrency));
    }
}
