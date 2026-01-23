package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.dao.RetirementInvestmentAndTradeDao;
import com.robinhood.android.models.retirement.p194db.RetirementInvestmentAndTrade;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementInvestmentAndTradeStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RetirementInvestmentAndTradeStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementInvestmentAndTradeStore;", "Lcom/robinhood/store/Store;", "dao", "Lcom/robinhood/android/models/retirement/dao/RetirementInvestmentAndTradeDao;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/models/retirement/dao/RetirementInvestmentAndTradeDao;Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementInvestmentAndTradeStore$Request;", "Lcom/robinhood/android/models/retirement/db/RetirementInvestmentAndTrade;", "streamInvestmentAndTrade", "Lcom/robinhood/android/moria/db/Query;", "getStreamInvestmentAndTrade", "()Lcom/robinhood/android/moria/db/Query;", "refreshInvestmentAndTrade", "", "request", "Request", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RetirementInvestmentAndTradeStore extends Store {
    private final Endpoint<Request, RetirementInvestmentAndTrade> endpoint;
    private final Query<Request, RetirementInvestmentAndTrade> streamInvestmentAndTrade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementInvestmentAndTradeStore(final RetirementInvestmentAndTradeDao dao, RetirementApi retirementApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RetirementInvestmentAndTradeStore2(retirementApi, null), getLogoutKillswitch(), new RetirementInvestmentAndTradeStore3(dao), storeBundle.getClock(), null, 16, null);
        this.streamInvestmentAndTrade = Store.create$default(this, Query.INSTANCE, "queryRetirementInvestmentAndTrade", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementInvestmentAndTradeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementInvestmentAndTradeStore.streamInvestmentAndTrade$lambda$0(this.f$0, (RetirementInvestmentAndTradeStore.Request) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementInvestmentAndTradeStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementInvestmentAndTradeStore.streamInvestmentAndTrade$lambda$1(dao, (RetirementInvestmentAndTradeStore.Request) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: RetirementInvestmentAndTradeStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementInvestmentAndTradeStore$Request;", "", "accountNumber", "", "isPrivacyEnabled", "", "<init>", "(Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Request {
        private final String accountNumber;
        private final boolean isPrivacyEnabled;

        public static /* synthetic */ Request copy$default(Request request, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.accountNumber;
            }
            if ((i & 2) != 0) {
                z = request.isPrivacyEnabled;
            }
            return request.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPrivacyEnabled() {
            return this.isPrivacyEnabled;
        }

        public final Request copy(String accountNumber, boolean isPrivacyEnabled) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Request(accountNumber, isPrivacyEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.accountNumber, request.accountNumber) && this.isPrivacyEnabled == request.isPrivacyEnabled;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.isPrivacyEnabled);
        }

        public String toString() {
            return "Request(accountNumber=" + this.accountNumber + ", isPrivacyEnabled=" + this.isPrivacyEnabled + ")";
        }

        public Request(String accountNumber, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.isPrivacyEnabled = z;
        }

        public /* synthetic */ Request(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean isPrivacyEnabled() {
            return this.isPrivacyEnabled;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$insert(RetirementInvestmentAndTradeDao retirementInvestmentAndTradeDao, RetirementInvestmentAndTrade retirementInvestmentAndTrade, Continuation continuation) {
        retirementInvestmentAndTradeDao.insert(retirementInvestmentAndTrade);
        return Unit.INSTANCE;
    }

    public final Query<Request, RetirementInvestmentAndTrade> getStreamInvestmentAndTrade() {
        return this.streamInvestmentAndTrade;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamInvestmentAndTrade$lambda$0(RetirementInvestmentAndTradeStore retirementInvestmentAndTradeStore, Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(retirementInvestmentAndTradeStore.endpoint, request, Durations.INSTANCE.getONE_MINUTE(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamInvestmentAndTrade$lambda$1(RetirementInvestmentAndTradeDao retirementInvestmentAndTradeDao, Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return retirementInvestmentAndTradeDao.getRetirementInvestmentAndTrade(request.getAccountNumber());
    }

    public final void refreshInvestmentAndTrade(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Endpoint.DefaultImpls.refresh$default(this.endpoint, request, true, null, 4, null);
    }
}
