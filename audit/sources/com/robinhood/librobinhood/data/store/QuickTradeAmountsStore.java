package com.robinhood.librobinhood.data.store;

import androidx.collection.LruCache;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiQuickTradeAmounts;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QuickTradeAmountsStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017J\u0016\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000fJ\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001c0\u001b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000fJ \u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\u00100\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00100\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/QuickTradeAmountsStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/store/StoreBundle;)V", "inMemoryQuickTradeAmountsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Landroidx/collection/LruCache;", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "Lcom/robinhood/models/api/ApiQuickTradeAmounts;", "quickTradeAmountsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "refreshForAllAccounts", "", "instrumentId", "accountNumbers", "", "refresh", "accountNumber", "stream", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "updateInMemoryCache", "quickTradeAmounts", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class QuickTradeAmountsStore extends Store {
    private final Brokeback brokeback;
    private final BehaviorRelay<LruCache<Tuples2<UUID, String>, ApiQuickTradeAmounts>> inMemoryQuickTradeAmountsRelay;
    private final Endpoint<Tuples2<String, UUID>, ApiQuickTradeAmounts> quickTradeAmountsEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickTradeAmountsStore(AccountProvider accountProvider, Brokeback brokeback, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.brokeback = brokeback;
        BehaviorRelay<LruCache<Tuples2<UUID, String>, ApiQuickTradeAmounts>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(new LruCache(5));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.inMemoryQuickTradeAmountsRelay = behaviorRelayCreateDefault;
        Observable<Optional<String>> observableDistinctUntilChanged = accountProvider.mo22580getActiveAccountNumber().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedSubscriptionKt.subscribeIn(observableDistinctUntilChanged, getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.QuickTradeAmountsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickTradeAmountsStore._init_$lambda$0(this.f$0, (Optional) obj);
            }
        });
        this.quickTradeAmountsEndpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new QuickTradeAmountsStore2(this, null), getLogoutKillswitch(), new QuickTradeAmountsStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(QuickTradeAmountsStore quickTradeAmountsStore, Optional optional) {
        LruCache<Tuples2<UUID, String>, ApiQuickTradeAmounts> value = quickTradeAmountsStore.inMemoryQuickTradeAmountsRelay.getValue();
        if (value != null) {
            value.evictAll();
        }
        return Unit.INSTANCE;
    }

    public final void refreshForAllAccounts(UUID instrumentId, List<String> accountNumbers) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        List<String> list = accountNumbers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(RxFactory.DefaultImpls.rxSingle$default(this, null, new QuickTradeAmountsStore4(this, (String) it.next(), instrumentId, null), 1, null).toMaybe().onErrorComplete());
        }
        Flowable flowableMergeDelayError = Maybe.mergeDelayError(arrayList);
        Intrinsics.checkNotNullExpressionValue(flowableMergeDelayError, "mergeDelayError(...)");
        ScopedSubscriptionKt.subscribeIn(flowableMergeDelayError, getStoreScope());
    }

    /* compiled from: QuickTradeAmountsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiQuickTradeAmounts;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.QuickTradeAmountsStore$refresh$1", m3645f = "QuickTradeAmountsStore.kt", m3646l = {62}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.QuickTradeAmountsStore$refresh$1 */
    static final class C342661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiQuickTradeAmounts>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342661(String str, UUID uuid, Continuation<? super C342661> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QuickTradeAmountsStore.this.new C342661(this.$accountNumber, this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiQuickTradeAmounts> continuation) {
            return ((C342661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = QuickTradeAmountsStore.this.quickTradeAmountsEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$accountNumber, this.$instrumentId);
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final void refresh(UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Maybe maybeOnErrorComplete = RxFactory.DefaultImpls.rxSingle$default(this, null, new C342661(accountNumber, instrumentId, null), 1, null).toMaybe().onErrorComplete();
        Intrinsics.checkNotNullExpressionValue(maybeOnErrorComplete, "onErrorComplete(...)");
        ScopedSubscriptionKt.subscribeIn(maybeOnErrorComplete, getStoreScope());
    }

    public final Observable<Optional<ApiQuickTradeAmounts>> stream(final UUID instrumentId, final String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable<Optional<ApiQuickTradeAmounts>> observableHide = this.inMemoryQuickTradeAmountsRelay.map(new Function() { // from class: com.robinhood.librobinhood.data.store.QuickTradeAmountsStore.stream.1
            @Override // io.reactivex.functions.Function
            public final Optional<ApiQuickTradeAmounts> apply(LruCache<Tuples2<UUID, String>, ApiQuickTradeAmounts> cache2) {
                Intrinsics.checkNotNullParameter(cache2, "cache");
                return Optional3.asOptional(cache2.get(Tuples4.m3642to(instrumentId, accountNumber)));
            }
        }).hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateInMemoryCache(UUID instrumentId, String accountNumber, ApiQuickTradeAmounts quickTradeAmounts) {
        LruCache<Tuples2<UUID, String>, ApiQuickTradeAmounts> value = this.inMemoryQuickTradeAmountsRelay.getValue();
        Intrinsics.checkNotNull(value);
        LruCache<Tuples2<UUID, String>, ApiQuickTradeAmounts> lruCache = value;
        lruCache.put(Tuples4.m3642to(instrumentId, accountNumber), quickTradeAmounts);
        this.inMemoryQuickTradeAmountsRelay.accept(lruCache);
    }
}
