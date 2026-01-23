package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.contributions.ApiIraContributionBottomSheetRequest;
import com.robinhood.android.models.retirement.api.contributions.ApiIraContributionBottomSheetResponse;
import com.robinhood.android.models.retirement.api.contributions.ApiRetirementContributionsResponse;
import com.robinhood.android.models.retirement.dao.RetirementContributionDao;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionViewModel;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedSummaryCardViewModel;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Maybe;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ContributionStore.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001(B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u001a\u001a\u00020\u0010J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u001f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;", "Lcom/robinhood/store/Store;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "contributionDao", "Lcom/robinhood/android/models/retirement/dao/RetirementContributionDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/android/models/retirement/dao/RetirementContributionDao;Lcom/robinhood/store/StoreBundle;)V", "contributionBottomSheetEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/models/retirement/api/contributions/ApiIraContributionBottomSheetRequest;", "Lcom/robinhood/android/models/retirement/api/contributions/ApiIraContributionBottomSheetResponse;", "getContributionBottomSheet", "amountSelected", "", "taxYear", "", "excludeUserContributionsSection", "", "(Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contributionsEndpoint", "Lcom/robinhood/android/models/retirement/api/contributions/ApiRetirementContributionsResponse;", "getContributionsScreenInfo", "Lio/reactivex/Maybe;", "accountNumber", "contributionViewModelEndpoint", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore$GetCombinedContributionViewModelArgs;", "Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionViewModel;", "combinedContributionViewModelQuery", "Lcom/robinhood/android/moria/db/Query;", "streamCombinedContributionViewModel", "Lkotlinx/coroutines/flow/Flow;", "combinedSummaryCardEndpoint", "", "Lcom/robinhood/android/models/retirement/db/RetirementCombinedSummaryCardViewModel;", "combinedSummaryCardViewModelQuery", "getCombinedSummaryCardViewModelQuery", "()Lcom/robinhood/android/moria/db/Query;", "GetCombinedContributionViewModelArgs", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class ContributionStore extends Store {
    private final Query<GetCombinedContributionViewModelArgs, RetirementCombinedContributionViewModel> combinedContributionViewModelQuery;
    private final Endpoint<Unit, RetirementCombinedSummaryCardViewModel> combinedSummaryCardEndpoint;
    private final Query<Unit, RetirementCombinedSummaryCardViewModel> combinedSummaryCardViewModelQuery;
    private final Endpoint<ApiIraContributionBottomSheetRequest, ApiIraContributionBottomSheetResponse> contributionBottomSheetEndpoint;
    private final RetirementContributionDao contributionDao;
    private final Endpoint<GetCombinedContributionViewModelArgs, RetirementCombinedContributionViewModel> contributionViewModelEndpoint;
    private final Endpoint<String, ApiRetirementContributionsResponse> contributionsEndpoint;
    private final RetirementApi retirementApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContributionStore(RetirementApi retirementApi, RetirementContributionDao contributionDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(contributionDao, "contributionDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.retirementApi = retirementApi;
        this.contributionDao = contributionDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.contributionBottomSheetEndpoint = Endpoint.Companion.create$default(companion, new ContributionStore$contributionBottomSheetEndpoint$1(this, null), getLogoutKillswitch(), new ContributionStore$contributionBottomSheetEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.contributionsEndpoint = Endpoint.Companion.create$default(companion, new ContributionStore$contributionsEndpoint$1(this, null), getLogoutKillswitch(), new ContributionStore$contributionsEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        Endpoint<GetCombinedContributionViewModelArgs, RetirementCombinedContributionViewModel> endpointCreate$default = Endpoint.Companion.create$default(companion, new ContributionStore$contributionViewModelEndpoint$1(this, null), getLogoutKillswitch(), new ContributionStore$contributionViewModelEndpoint$2(contributionDao), storeBundle.getClock(), null, 16, null);
        this.contributionViewModelEndpoint = endpointCreate$default;
        Query.Companion companion2 = Query.INSTANCE;
        this.combinedContributionViewModelQuery = Store.create$default(this, companion2, "combinedContributionViewModelQuery", CollectionsKt.listOf(new RefreshEach(new ContributionStore$combinedContributionViewModelQuery$1(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContributionStore.combinedContributionViewModelQuery$lambda$0(this.f$0, (ContributionStore.GetCombinedContributionViewModelArgs) obj);
            }
        }, false, 8, null);
        Endpoint<Unit, RetirementCombinedSummaryCardViewModel> endpointCreate$default2 = Endpoint.Companion.create$default(companion, new ContributionStore$combinedSummaryCardEndpoint$1(this, null), getLogoutKillswitch(), new ContributionStore$combinedSummaryCardEndpoint$2(contributionDao), storeBundle.getClock(), null, 16, null);
        this.combinedSummaryCardEndpoint = endpointCreate$default2;
        this.combinedSummaryCardViewModelQuery = Store.create$default(this, companion2, "combinedSummaryCardQuery", CollectionsKt.listOf(new RefreshEach(new ContributionStore$combinedSummaryCardViewModelQuery$1(endpointCreate$default2))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContributionStore.combinedSummaryCardViewModelQuery$lambda$2(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: ContributionStore.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore$GetCombinedContributionViewModelArgs;", "", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GetCombinedContributionViewModelArgs {
        private final String accountNumber;

        public static /* synthetic */ GetCombinedContributionViewModelArgs copy$default(GetCombinedContributionViewModelArgs getCombinedContributionViewModelArgs, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getCombinedContributionViewModelArgs.accountNumber;
            }
            return getCombinedContributionViewModelArgs.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final GetCombinedContributionViewModelArgs copy(String accountNumber) {
            return new GetCombinedContributionViewModelArgs(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetCombinedContributionViewModelArgs) && Intrinsics.areEqual(this.accountNumber, ((GetCombinedContributionViewModelArgs) other).accountNumber);
        }

        public int hashCode() {
            String str = this.accountNumber;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "GetCombinedContributionViewModelArgs(accountNumber=" + this.accountNumber + ")";
        }

        public GetCombinedContributionViewModelArgs(String str) {
            this.accountNumber = str;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    public final Object getContributionBottomSheet(String str, int i, boolean z, Continuation<? super ApiIraContributionBottomSheetResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.contributionBottomSheetEndpoint, new ApiIraContributionBottomSheetRequest(str, i, z), null, continuation, 2, null);
    }

    /* compiled from: ContributionStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/contributions/ApiRetirementContributionsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore$getContributionsScreenInfo$1", m3645f = "ContributionStore.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore$getContributionsScreenInfo$1 */
    static final class C347071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiRetirementContributionsResponse>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347071(String str, Continuation<? super C347071> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContributionStore.this.new C347071(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiRetirementContributionsResponse> continuation) {
            return ((C347071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Endpoint endpoint = ContributionStore.this.contributionsEndpoint;
            String str = this.$accountNumber;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Maybe<ApiRetirementContributionsResponse> getContributionsScreenInfo(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return RxFactory.DefaultImpls.rxMaybe$default(this, null, new C347071(accountNumber, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: contributionViewModelEndpoint$insertCombinedContributionViewModel */
    public static final /* synthetic */ Object m2648xef2362fb(RetirementContributionDao retirementContributionDao, RetirementCombinedContributionViewModel retirementCombinedContributionViewModel, Continuation continuation) {
        retirementContributionDao.insertCombinedContributionViewModel(retirementCombinedContributionViewModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow combinedContributionViewModelQuery$lambda$0(ContributionStore contributionStore, GetCombinedContributionViewModelArgs getCombinedContributionViewModelArgs) {
        Intrinsics.checkNotNullParameter(getCombinedContributionViewModelArgs, "<destruct>");
        String accountNumber = getCombinedContributionViewModelArgs.getAccountNumber();
        RetirementContributionDao retirementContributionDao = contributionStore.contributionDao;
        if (accountNumber == null) {
            accountNumber = RetirementCombinedContributionViewModel.ACCOUNT_NUMBER_UNSPECIFIED;
        }
        return retirementContributionDao.getCombinedContributionViewModel(accountNumber);
    }

    public final Flow<RetirementCombinedContributionViewModel> streamCombinedContributionViewModel(String accountNumber) {
        return this.combinedContributionViewModelQuery.asFlow(new GetCombinedContributionViewModelArgs(accountNumber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object combinedSummaryCardEndpoint$insertCombinedSummaryCardViewModel(RetirementContributionDao retirementContributionDao, RetirementCombinedSummaryCardViewModel retirementCombinedSummaryCardViewModel, Continuation continuation) {
        retirementContributionDao.insertCombinedSummaryCardViewModel(retirementCombinedSummaryCardViewModel);
        return Unit.INSTANCE;
    }

    public final Query<Unit, RetirementCombinedSummaryCardViewModel> getCombinedSummaryCardViewModelQuery() {
        return this.combinedSummaryCardViewModelQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow combinedSummaryCardViewModelQuery$lambda$2(ContributionStore contributionStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return contributionStore.contributionDao.getCombinedSummaryCardViewModel();
    }
}
