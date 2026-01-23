package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.advisory.dao.ManagedReturnsBreakdownDao;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.models.advisory.p304db.returns.ReturnsBreakdown;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore;
import com.robinhood.utils.datetime.Durations;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: AdvisoryPortfolioBreakdownStore.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0015\u001a\u00020\fJ\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "Lcom/robinhood/store/Store;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "returnsBreakdownDao", "Lcom/robinhood/models/advisory/dao/ManagedReturnsBreakdownDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/models/advisory/dao/ManagedReturnsBreakdownDao;Lcom/robinhood/store/StoreBundle;)V", "managedPortfolioFlow", "", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;", "managedPortfolioEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "managedPortfolioQuery", "Lcom/robinhood/android/moria/db/Query;", "streamManagedPortfolio", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "returnsBreakdownEndpoint", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore$GetReturnsBreakdownArgs;", "Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;", "returnsBreakdownQuery", "streamReturnsBreakdown", "span", "GetReturnsBreakdownArgs", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AdvisoryPortfolioBreakdownStore extends Store {
    private final AdvisoryService advisoryService;
    private final Endpoint<String, ManagedPortfolioSummary> managedPortfolioEndpoint;
    private final Map<String, StateFlow2<ManagedPortfolioSummary>> managedPortfolioFlow;
    private final Query<String, ManagedPortfolioSummary> managedPortfolioQuery;
    private final ManagedReturnsBreakdownDao returnsBreakdownDao;
    private final Endpoint<GetReturnsBreakdownArgs, ReturnsBreakdown> returnsBreakdownEndpoint;
    private final Query<GetReturnsBreakdownArgs, ReturnsBreakdown> returnsBreakdownQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryPortfolioBreakdownStore(AdvisoryService advisoryService, ManagedReturnsBreakdownDao returnsBreakdownDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(returnsBreakdownDao, "returnsBreakdownDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisoryService = advisoryService;
        this.returnsBreakdownDao = returnsBreakdownDao;
        this.managedPortfolioFlow = new LinkedHashMap();
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.managedPortfolioEndpoint = companion.create(new AdvisoryPortfolioBreakdownStore2(this, null), getLogoutKillswitch(), new AdvisoryPortfolioBreakdownStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.FIVE_MINUTES, storeBundle.getClock()));
        Query.Companion companion2 = Query.INSTANCE;
        this.managedPortfolioQuery = Store.create$default(this, companion2, "modelPortfolioQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryPortfolioBreakdownStore.managedPortfolioQuery$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryPortfolioBreakdownStore.managedPortfolioQuery$lambda$2(this.f$0, (String) obj);
            }
        }, false, 8, null);
        AdvisoryPortfolioBreakdownStore4 advisoryPortfolioBreakdownStore4 = new AdvisoryPortfolioBreakdownStore4(returnsBreakdownDao);
        this.returnsBreakdownEndpoint = companion.create(new AdvisoryPortfolioBreakdownStore5(this, null), getLogoutKillswitch(), advisoryPortfolioBreakdownStore4, storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getFIFTEEN_SECONDS(), storeBundle.getClock()));
        this.returnsBreakdownQuery = Store.create$default(this, companion2, "returnsBreakdownQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryPortfolioBreakdownStore.returnsBreakdownQuery$lambda$3(this.f$0, (AdvisoryPortfolioBreakdownStore.GetReturnsBreakdownArgs) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryPortfolioBreakdownStore.returnsBreakdownQuery$lambda$4(this.f$0, (AdvisoryPortfolioBreakdownStore.GetReturnsBreakdownArgs) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow managedPortfolioQuery$lambda$0(AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.poll$default(advisoryPortfolioBreakdownStore.managedPortfolioEndpoint, accountNumber, Durations.FIVE_MINUTES, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow managedPortfolioQuery$lambda$2(AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, StateFlow2<ManagedPortfolioSummary>> map = advisoryPortfolioBreakdownStore.managedPortfolioFlow;
        StateFlow2<ManagedPortfolioSummary> stateFlow2MutableStateFlow = map.get(accountNumber);
        if (stateFlow2MutableStateFlow == null) {
            stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
            map.put(accountNumber, stateFlow2MutableStateFlow);
        }
        return stateFlow2MutableStateFlow;
    }

    public final Flow<ManagedPortfolioSummary> streamManagedPortfolio(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.managedPortfolioQuery.asFlow(accountNumber);
    }

    /* compiled from: AdvisoryPortfolioBreakdownStore.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore$GetReturnsBreakdownArgs;", "", "accountNumber", "", "span", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getSpan", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GetReturnsBreakdownArgs {
        private final String accountNumber;
        private final String span;

        public static /* synthetic */ GetReturnsBreakdownArgs copy$default(GetReturnsBreakdownArgs getReturnsBreakdownArgs, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getReturnsBreakdownArgs.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = getReturnsBreakdownArgs.span;
            }
            return getReturnsBreakdownArgs.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSpan() {
            return this.span;
        }

        public final GetReturnsBreakdownArgs copy(String accountNumber, String span) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(span, "span");
            return new GetReturnsBreakdownArgs(accountNumber, span);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetReturnsBreakdownArgs)) {
                return false;
            }
            GetReturnsBreakdownArgs getReturnsBreakdownArgs = (GetReturnsBreakdownArgs) other;
            return Intrinsics.areEqual(this.accountNumber, getReturnsBreakdownArgs.accountNumber) && Intrinsics.areEqual(this.span, getReturnsBreakdownArgs.span);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.span.hashCode();
        }

        public String toString() {
            return "GetReturnsBreakdownArgs(accountNumber=" + this.accountNumber + ", span=" + this.span + ")";
        }

        public GetReturnsBreakdownArgs(String accountNumber, String span) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(span, "span");
            this.accountNumber = accountNumber;
            this.span = span;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getSpan() {
            return this.span;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object returnsBreakdownEndpoint$insert(ManagedReturnsBreakdownDao managedReturnsBreakdownDao, ReturnsBreakdown returnsBreakdown, Continuation continuation) {
        managedReturnsBreakdownDao.insert(returnsBreakdown);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow returnsBreakdownQuery$lambda$3(AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore, GetReturnsBreakdownArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return Endpoint.DefaultImpls.poll$default(advisoryPortfolioBreakdownStore.returnsBreakdownEndpoint, args, Durations.INSTANCE.getFIFTEEN_SECONDS(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow returnsBreakdownQuery$lambda$4(AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore, GetReturnsBreakdownArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return advisoryPortfolioBreakdownStore.returnsBreakdownDao.streamReturnsBreakdown(args.getAccountNumber(), args.getSpan());
    }

    public final Flow<ReturnsBreakdown> streamReturnsBreakdown(String accountNumber, String span) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(span, "span");
        return this.returnsBreakdownQuery.asFlow(new GetReturnsBreakdownArgs(accountNumber, span));
    }
}
