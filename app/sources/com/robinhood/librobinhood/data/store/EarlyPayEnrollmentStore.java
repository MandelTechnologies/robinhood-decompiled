package com.robinhood.librobinhood.data.store;

import android.annotation.SuppressLint;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.rhy.RhyTabCarouselStore;
import com.robinhood.models.api.bonfire.ApiEarlyPayEnrollment;
import com.robinhood.models.dao.EarlyPayEnrollmentDao;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EarlyPayEnrollmentStore.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100 2\u0006\u0010!\u001a\u00020\"J\u0012\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\"H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R&\u0010\u0015\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u00100\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00100\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyTabCarouselStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyTabCarouselStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/EarlyPayEnrollmentDao;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/rhy/RhyTabCarouselStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/EarlyPayEnrollmentDao;)V", "saveAction", "Lkotlin/Function2;", "Lcom/robinhood/models/api/bonfire/ApiEarlyPayEnrollment;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/jvm/functions/Function2;", "getEnrollment", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "", "postEnrollment", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/bonfire/ApiEarlyPayEnrollment$Request;", "streamEnrollment", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/EarlyPayEnrollment;", "updateEnrollment", "Lio/reactivex/Single;", "enrolled", "", "refresh", "force", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class EarlyPayEnrollmentStore extends Store {
    private final TransfersBonfireApi bonfireApi;
    private final EarlyPayEnrollmentDao dao;
    private final Endpoint<Tuples2<String, String>, ApiEarlyPayEnrollment> getEnrollment;
    private final PostEndpoint<ApiEarlyPayEnrollment.Request, ApiEarlyPayEnrollment> postEnrollment;
    private final RhyAccountStore rhyAccountStore;
    private final RhyTabCarouselStore rhyTabCarouselStore;
    private final Function2<ApiEarlyPayEnrollment, Continuation<? super Unit>, Object> saveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarlyPayEnrollmentStore(TransfersBonfireApi bonfireApi, RhyAccountStore rhyAccountStore, RhyTabCarouselStore rhyTabCarouselStore, StoreBundle storeBundle, EarlyPayEnrollmentDao dao) {
        super(storeBundle, EarlyPayEnrollment.INSTANCE);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rhyTabCarouselStore, "rhyTabCarouselStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.bonfireApi = bonfireApi;
        this.rhyAccountStore = rhyAccountStore;
        this.rhyTabCarouselStore = rhyTabCarouselStore;
        this.dao = dao;
        EarlyPayEnrollmentStore4 earlyPayEnrollmentStore4 = new EarlyPayEnrollmentStore4(this, null);
        this.saveAction = earlyPayEnrollmentStore4;
        this.getEnrollment = Endpoint.INSTANCE.create(new EarlyPayEnrollmentStore2(this, null), getLogoutKillswitch(), earlyPayEnrollmentStore4, storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getFIFTEEN_MINUTES(), storeBundle.getClock()));
        this.postEnrollment = PostEndpoint.INSTANCE.create(new EarlyPayEnrollmentStore3(bonfireApi), earlyPayEnrollmentStore4);
    }

    public final Observable<EarlyPayEnrollment> streamEnrollment() {
        return asObservable(FlowKt.distinctUntilChanged(FlowKt.filterNotNull(EarlyPayEnrollmentDao.DefaultImpls.getEarlyPayEnrollment$default(this.dao, null, 1, null))));
    }

    public final Single<ApiEarlyPayEnrollment> updateEnrollment(final boolean enrolled) {
        Single<ApiEarlyPayEnrollment> singleFlatMap = ObservablesKt.filterIsPresent(this.rhyAccountStore.streamSpendingAccount()).firstOrError().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore.updateEnrollment.1

            /* compiled from: EarlyPayEnrollmentStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiEarlyPayEnrollment;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore$updateEnrollment$1$1", m3645f = "EarlyPayEnrollmentStore.kt", m3646l = {70}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore$updateEnrollment$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiEarlyPayEnrollment>, Object> {
                final /* synthetic */ RhyAccount $account;
                final /* synthetic */ boolean $enrolled;
                int label;
                final /* synthetic */ EarlyPayEnrollmentStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EarlyPayEnrollmentStore earlyPayEnrollmentStore, RhyAccount rhyAccount, boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = earlyPayEnrollmentStore;
                    this.$account = rhyAccount;
                    this.$enrolled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$account, this.$enrolled, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiEarlyPayEnrollment> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    PostEndpoint postEndpoint = this.this$0.postEnrollment;
                    String string2 = this.$account.getId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    ApiEarlyPayEnrollment.Request request = new ApiEarlyPayEnrollment.Request(string2, "rhy", this.$enrolled ? ApiEarlyPayEnrollment.State.ENROLLED : ApiEarlyPayEnrollment.State.NOT_ENROLLED);
                    this.label = 1;
                    Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, request, null, this, 2, null);
                    return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends ApiEarlyPayEnrollment> apply(RhyAccount account) {
                Intrinsics.checkNotNullParameter(account, "account");
                EarlyPayEnrollmentStore earlyPayEnrollmentStore = EarlyPayEnrollmentStore.this;
                Single singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(earlyPayEnrollmentStore, null, new AnonymousClass1(earlyPayEnrollmentStore, account, enrolled, null), 1, null);
                final EarlyPayEnrollmentStore earlyPayEnrollmentStore2 = EarlyPayEnrollmentStore.this;
                return singleRxSingle$default.doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore.updateEnrollment.1.2
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(ApiEarlyPayEnrollment apiEarlyPayEnrollment) {
                        earlyPayEnrollmentStore2.rhyTabCarouselStore.refresh(true);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public static /* synthetic */ void refresh$default(EarlyPayEnrollmentStore earlyPayEnrollmentStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        earlyPayEnrollmentStore.refresh(z);
    }

    @SuppressLint({"CheckResult"})
    public final void refresh(final boolean force) {
        this.rhyAccountStore.refresh(force);
        Observable observableTake = ObservablesKt.filterIsPresent(this.rhyAccountStore.streamSpendingAccount()).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        ScopedSubscriptionKt.subscribeIn(observableTake, getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentStore.refresh$lambda$0(this.f$0, force, (RhyAccount) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refresh$lambda$0(EarlyPayEnrollmentStore earlyPayEnrollmentStore, boolean z, RhyAccount rhyAccount) {
        Endpoint.DefaultImpls.refresh$default(earlyPayEnrollmentStore.getEnrollment, Tuples4.m3642to(rhyAccount.getId().toString(), "rhy"), z, null, 4, null);
        return Unit.INSTANCE;
    }
}
