package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiSlipHubCard;
import com.robinhood.models.dao.SlipHubCardDao;
import com.robinhood.models.p320db.SlipHubCard;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: SlipHubCardStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00152\u0006\u0010\u0016\u001a\u00020\u000eJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubCardStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "slipHubCardDao", "Lcom/robinhood/models/dao/SlipHubCardDao;", "slipApi", "Lcom/robinhood/api/retrofit/SlipApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/models/dao/SlipHubCardDao;Lcom/robinhood/api/retrofit/SlipApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/ApiSlipHubCard;", "slipHubCardQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/SlipHubCard;", "streamHubCard", "Lio/reactivex/Observable;", "accountNumber", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "refreshAllAccounts", "Lio/reactivex/disposables/Disposable;", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SlipHubCardStore extends Store {
    private final AccountProvider accountProvider;
    private final Endpoint<String, ApiSlipHubCard> endpoint;
    private final Query<String, Optional<SlipHubCard>> slipHubCardQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipHubCardStore(AccountProvider accountProvider, final SlipHubCardDao slipHubCardDao, SlipApi slipApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(slipHubCardDao, "slipHubCardDao");
        Intrinsics.checkNotNullParameter(slipApi, "slipApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        Endpoint<String, ApiSlipHubCard> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SlipHubCardStore2(slipApi, null), getLogoutKillswitch(), new SlipHubCardStore3(slipHubCardDao, null), storeBundle.getClock(), null, 16, null);
        this.endpoint = endpointCreate$default;
        this.slipHubCardQuery = Store.create$default(this, Query.INSTANCE, "querySlipHubCard", CollectionsKt.listOf(new RefreshEach(new SlipHubCardStore5(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubCardStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipHubCardStore.slipHubCardQuery$lambda$0(slipHubCardDao, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow slipHubCardQuery$lambda$0(SlipHubCardDao slipHubCardDao, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Operators.toOptionals(slipHubCardDao.get(accountNumber));
    }

    public final Observable<Optional<SlipHubCard>> streamHubCard(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.slipHubCardQuery.asObservable(accountNumber);
    }

    public static /* synthetic */ Job refresh$default(SlipHubCardStore slipHubCardStore, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return slipHubCardStore.refresh(str, z);
    }

    public final Job refresh(String accountNumber, boolean force) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, accountNumber, force, null, 4, null);
    }

    /* compiled from: SlipHubCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubCardStore$refreshAllAccounts$1", m3645f = "SlipHubCardStore.kt", m3646l = {70, 66}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubCardStore$refreshAllAccounts$1 */
    static final class C347741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends Job>>, Object> {
        final /* synthetic */ boolean $force;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347741(boolean z, Continuation<? super C347741> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C347741 c347741 = SlipHubCardStore.this.new C347741(this.$force, continuation);
            c347741.L$0 = obj;
            return c347741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Job>> continuation) {
            return ((C347741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                Observable<List<String>> observableStreamAllSelfDirectedAccountNumbers = SlipHubCardStore.this.accountProvider.streamAllSelfDirectedAccountNumbers();
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = RxAwait3.awaitFirst(observableStreamAllSelfDirectedAccountNumbers, this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = coroutineScope;
            List list = (List) obj;
            Intrinsics.checkNotNull(list);
            List list2 = list;
            SlipHubCardStore slipHubCardStore = SlipHubCardStore.this;
            boolean z = this.$force;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SlipHubCardStore4(slipHubCardStore, (String) it.next(), z, null), 3, null));
            }
            this.L$0 = null;
            this.label = 2;
            Object objAwaitAll = Await2.awaitAll(arrayList, this);
            return objAwaitAll == coroutine_suspended ? coroutine_suspended : objAwaitAll;
        }
    }

    public static /* synthetic */ Disposable refreshAllAccounts$default(SlipHubCardStore slipHubCardStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return slipHubCardStore.refreshAllAccounts(z);
    }

    public final Disposable refreshAllAccounts(boolean force) {
        return ScopedSubscriptionKt.subscribeIn(RxFactory.DefaultImpls.rxSingle$default(this, null, new C347741(force, null), 1, null), getStoreScope());
    }
}
