package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.acats.api.AcatsApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.acats.p299db.bonfire.AcatsAccountContents;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount2;
import com.robinhood.models.api.bonfire.ApiAcatsWelcomeContents;
import com.robinhood.models.api.bonfire.ApiAvailableAccount;
import com.robinhood.models.api.bonfire.ApiAvailableDestinationsResponse;
import com.robinhood.models.api.bonfire.ApiSearchBrokeragesResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: AcatsBrokerageStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\u000e\u0010\u0015\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010\u001eJ\u001e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0 \u0012\u0004\u0012\u00020!0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "Lcom/robinhood/store/Store;", "acatsApi", "Lcom/robinhood/android/acats/api/AcatsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/acats/api/AcatsApi;Lcom/robinhood/store/StoreBundle;)V", "welcomeContentsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsWelcomeContents;", "getWelcomeContents", "Lio/reactivex/Single;", "availableDestinationsEndpoint", "Lcom/robinhood/models/api/bonfire/ApiAvailableDestinationsResponse;", "getAvailableAccounts", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "getAvailableDestinationsPage", "getAvailableDestinations", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshAvailableDestinations", "Lio/reactivex/Completable;", "accountContentsEndpoint", "", "Lcom/robinhood/models/acats/db/bonfire/AcatsAccountContents;", "getAccountContents", "accountNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "brokerageSearchEndpoint", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/ApiSearchBrokeragesResponse;", "searchBrokerages", "query", "rhsAccountNumber", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AcatsBrokerageStore extends Store {
    private final AcatsApi acatsApi;
    private final Endpoint<String, AcatsAccountContents> accountContentsEndpoint;
    private final Endpoint<Unit, ApiAvailableDestinationsResponse> availableDestinationsEndpoint;
    private final Endpoint<Tuples2<String, String>, ApiSearchBrokeragesResponse> brokerageSearchEndpoint;
    private final Endpoint<Unit, ApiAcatsWelcomeContents> welcomeContentsEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsBrokerageStore(AcatsApi acatsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(acatsApi, "acatsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.acatsApi = acatsApi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.welcomeContentsEndpoint = Endpoint.Companion.create$default(companion, new AcatsBrokerageStore8(this, null), getLogoutKillswitch(), new AcatsBrokerageStore9(null), storeBundle.getClock(), null, 16, null);
        AcatsBrokerageStore4 acatsBrokerageStore4 = new AcatsBrokerageStore4(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        AcatsBrokerageStore5 acatsBrokerageStore5 = new AcatsBrokerageStore5(null);
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        this.availableDestinationsEndpoint = companion.create(acatsBrokerageStore4, logoutKillswitch, acatsBrokerageStore5, clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
        AcatsBrokerageStore2 acatsBrokerageStore2 = new AcatsBrokerageStore2(this, null);
        LogoutKillswitch logoutKillswitch2 = getLogoutKillswitch();
        AcatsBrokerageStore3 acatsBrokerageStore3 = new AcatsBrokerageStore3(null);
        Clock clock2 = storeBundle.getClock();
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        this.accountContentsEndpoint = companion.create(acatsBrokerageStore2, logoutKillswitch2, acatsBrokerageStore3, clock2, new DefaultStaleDecider(durationOfHours, storeBundle.getClock()));
        this.brokerageSearchEndpoint = Endpoint.Companion.create$default(companion, new AcatsBrokerageStore6(this, null), getLogoutKillswitch(), new AcatsBrokerageStore7(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: AcatsBrokerageStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiAcatsWelcomeContents;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore$getWelcomeContents$1", m3645f = "AcatsBrokerageStore.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore$getWelcomeContents$1 */
    static final class C344611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiAcatsWelcomeContents>, Object> {
        int label;

        C344611(Continuation<? super C344611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsBrokerageStore.this.new C344611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiAcatsWelcomeContents> continuation) {
            return ((C344611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = AcatsBrokerageStore.this.welcomeContentsEndpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiAcatsWelcomeContents> getWelcomeContents() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344611(null), 1, null);
    }

    /* compiled from: AcatsBrokerageStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore$getAvailableAccounts$1", m3645f = "AcatsBrokerageStore.kt", m3646l = {47, 49}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore$getAvailableAccounts$1 */
    static final class C344591 extends ContinuationImpl7 implements Function2<Produce4<? super List<? extends AvailableAccount>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C344591(Continuation<? super C344591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C344591 c344591 = AcatsBrokerageStore.this.new C344591(continuation);
            c344591.L$0 = obj;
            return c344591;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Produce4<? super List<? extends AvailableAccount>> produce4, Continuation<? super Unit> continuation) {
            return invoke2((Produce4<? super List<AvailableAccount>>) produce4, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Produce4<? super List<AvailableAccount>> produce4, Continuation<? super Unit> continuation) {
            return ((C344591) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        
            if (r1.send(r3, r10) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            C344591 c344591;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                Endpoint endpoint = AcatsBrokerageStore.this.availableDestinationsEndpoint;
                Unit unit = Unit.INSTANCE;
                this.L$0 = produce4;
                this.label = 1;
                c344591 = this;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, c344591, 2, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            c344591 = this;
            List<ApiAvailableAccount> available_accounts = ((ApiAvailableDestinationsResponse) obj).getAvailable_accounts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_accounts, 10));
            Iterator<T> it = available_accounts.iterator();
            while (it.hasNext()) {
                arrayList.add(AvailableAccount2.toDbModel((ApiAvailableAccount) it.next()));
            }
            c344591.L$0 = null;
            c344591.label = 2;
        }
    }

    public final Observable<List<AvailableAccount>> getAvailableAccounts() {
        return RxFactory.DefaultImpls.rxObservable$default(this, null, new C344591(null), 1, null);
    }

    /* compiled from: AcatsBrokerageStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/models/api/bonfire/ApiAvailableDestinationsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore$getAvailableDestinationsPage$1", m3645f = "AcatsBrokerageStore.kt", m3646l = {53, 53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore$getAvailableDestinationsPage$1 */
    static final class C344601 extends ContinuationImpl7 implements Function2<Produce4<? super ApiAvailableDestinationsResponse>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C344601(Continuation<? super C344601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C344601 c344601 = AcatsBrokerageStore.this.new C344601(continuation);
            c344601.L$0 = obj;
            return c344601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super ApiAvailableDestinationsResponse> produce4, Continuation<? super Unit> continuation) {
            return ((C344601) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r1.send(r11, r10) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            C344601 c344601;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                Endpoint endpoint = AcatsBrokerageStore.this.availableDestinationsEndpoint;
                Unit unit = Unit.INSTANCE;
                this.L$0 = produce4;
                this.label = 1;
                c344601 = this;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, c344601, 2, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            c344601 = this;
            c344601.L$0 = null;
            c344601.label = 2;
        }
    }

    public final Observable<ApiAvailableDestinationsResponse> getAvailableDestinationsPage() {
        return RxFactory.DefaultImpls.rxObservable$default(this, null, new C344601(null), 1, null);
    }

    public final Object getAvailableDestinations(Continuation<? super ApiAvailableDestinationsResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.availableDestinationsEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    /* compiled from: AcatsBrokerageStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore$refreshAvailableDestinations$1", m3645f = "AcatsBrokerageStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore$refreshAvailableDestinations$1 */
    static final class C344621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C344621(Continuation<? super C344621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsBrokerageStore.this.new C344621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = AcatsBrokerageStore.this.availableDestinationsEndpoint;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Completable refreshAvailableDestinations() {
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344621(null), 1, null);
    }

    public final Object getAccountContents(String str, Continuation<? super AcatsAccountContents> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.accountContentsEndpoint, str, null, continuation, 2, null);
    }

    public final Object searchBrokerages(String str, String str2, Continuation<? super ApiSearchBrokeragesResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.brokerageSearchEndpoint, new Tuples2(str, str2), null, continuation, 2, null);
    }
}
