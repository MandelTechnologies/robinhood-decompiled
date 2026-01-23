package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.accountcenter.AccountCenterApi;
import com.robinhood.android.models.accountcenter.api.ApiAccountCenterPage;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.accountcenter.p301db.dao.AccountCenterPageDao;
import com.robinhood.models.accountcenter.p301db.entity.AccountCenterPage;
import com.robinhood.models.accountcenter.p301db.entity.AccountCenterPage2;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: AccountCenterStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountCenterStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "bonfireApi", "Lcom/robinhood/android/api/accountcenter/AccountCenterApi;", "accountCenterPageDao", "Lcom/robinhood/models/accountcenter/db/dao/AccountCenterPageDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/api/accountcenter/AccountCenterApi;Lcom/robinhood/models/accountcenter/db/dao/AccountCenterPageDao;)V", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "Lretrofit2/Response;", "Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterPage;", "query", "Lcom/robinhood/android/moria/db/Query;", "backendPollAccountCenterPage", "Lio/reactivex/Observable;", "displayCurrency", "lib-store-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AccountCenterStore extends Store {
    private final AccountCenterPageDao accountCenterPageDao;
    private final AccountCenterApi bonfireApi;
    private final Endpoint<DisplayCurrency, Response<ApiAccountCenterPage>> getEndpoint;
    private final Query<DisplayCurrency, ApiAccountCenterPage> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCenterStore(StoreBundle storeBundle, AccountCenterApi bonfireApi, AccountCenterPageDao accountCenterPageDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(accountCenterPageDao, "accountCenterPageDao");
        this.bonfireApi = bonfireApi;
        this.accountCenterPageDao = accountCenterPageDao;
        this.getEndpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new AccountCenterStore2(this, null), getLogoutKillswitch(), new AccountCenterStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "pollAccountCenterPage", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountCenterStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterStore.query$lambda$0(this.f$0, (DisplayCurrency) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountCenterStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterStore.query$lambda$2(this.f$0, (DisplayCurrency) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(AccountCenterStore accountCenterStore, DisplayCurrency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Endpoint<DisplayCurrency, Response<ApiAccountCenterPage>> endpoint = accountCenterStore.getEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, currency, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$2(AccountCenterStore accountCenterStore, DisplayCurrency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        final Flow flowFilterNotNull = FlowKt.filterNotNull(accountCenterStore.accountCenterPageDao.get(currency));
        return new Flow<ApiAccountCenterPage>() { // from class: com.robinhood.librobinhood.data.store.AccountCenterStore$query$lambda$2$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AccountCenterStore$query$lambda$2$$inlined$map$1$2 */
            public static final class C334872<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountCenterStore$query$lambda$2$$inlined$map$1$2", m3645f = "AccountCenterStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AccountCenterStore$query$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C334872.this.emit(null, this);
                    }
                }

                public C334872(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        ApiAccountCenterPage apiModel = AccountCenterPage2.toApiModel((AccountCenterPage) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(apiModel, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ApiAccountCenterPage> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new C334872(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Observable<ApiAccountCenterPage> backendPollAccountCenterPage(DisplayCurrency displayCurrency) {
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        return asObservable(this.query.asFlow(displayCurrency));
    }
}
