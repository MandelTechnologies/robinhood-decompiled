package com.robinhood.android.data.store.portfolio;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.PortfolioDao;
import com.robinhood.models.p320db.Portfolio2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.base.PortfolioStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p479j$.time.Clock;
import p479j$.time.Instant;
import rosetta.portfolio.p541v1.GetAccountValueResponseDto;
import rosetta.portfolio.p541v1.Portfolio;

/* compiled from: TraderPortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u0011H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0016¢\u0006\u0004\b!\u0010\u001fJ\u001b\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00120\u0011H\u0016¢\u0006\u0004\b#\u0010\u001fJ\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u0015J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R&\u0010-\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00120+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/base/PortfolioStore;", "Lrosetta/portfolio/v1/Portfolio;", "portfolioService", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/PortfolioDao;", "dao", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lrosetta/portfolio/v1/Portfolio;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/PortfolioDao;Lcom/robinhood/android/lib/account/AccountProvider;Lj$/time/Clock;)V", "", "accountNumber", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Portfolio;", "getPortfolioOptional", "(Ljava/lang/String;)Lio/reactivex/Observable;", "", "force", "Lkotlinx/coroutines/Job;", "refreshPortfolio", "(Ljava/lang/String;Z)Lkotlinx/coroutines/Job;", "getPortfolio", "getPortfolioForcedOrNull", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIndividualAccountPortfolio", "()Lio/reactivex/Observable;", "getIndividualAccountPortfolioForced", "getIndividualAccountPortfolioOptional", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "pollIndividualAccountPortfolio", "pollAccountPortfolio", "refreshIndividualAccountPortfolio", "(Z)Lkotlinx/coroutines/Job;", "Lrosetta/portfolio/v1/Portfolio;", "Lcom/robinhood/models/dao/PortfolioDao;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lj$/time/Clock;", "Lcom/robinhood/android/moria/network/Endpoint;", "", "individualAccountPortfolioEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "portfolioEndpoint", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TraderPortfolioStore extends Store implements PortfolioStore {
    private final AccountProvider accountProvider;
    private final Clock clock;
    private final PortfolioDao dao;
    private final Endpoint<Unit, Optional<GetAccountValueResponseDto>> individualAccountPortfolioEndpoint;
    private final Endpoint<String, GetAccountValueResponseDto> portfolioEndpoint;
    private final Portfolio portfolioService;

    /* compiled from: TraderPortfolioStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.data.store.portfolio.TraderPortfolioStore", m3645f = "TraderPortfolioStore.kt", m3646l = {95}, m3647m = "getPortfolioForcedOrNull")
    /* renamed from: com.robinhood.android.data.store.portfolio.TraderPortfolioStore$getPortfolioForcedOrNull$1 */
    /* loaded from: classes2.dex */
    static final class C138681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C138681(Continuation<? super C138681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraderPortfolioStore.this.getPortfolioForcedOrNull(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderPortfolioStore(Portfolio portfolioService, StoreBundle storeBundle, PortfolioDao dao, AccountProvider accountProvider, Clock clock) {
        super(storeBundle, com.robinhood.models.p320db.Portfolio.INSTANCE);
        Intrinsics.checkNotNullParameter(portfolioService, "portfolioService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.portfolioService = portfolioService;
        this.dao = dao;
        this.accountProvider = accountProvider;
        this.clock = clock;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.individualAccountPortfolioEndpoint = Endpoint.Companion.create$default(companion, new TraderPortfolioStore2(this, null), getLogoutKillswitch(), new TraderPortfolioStore4(this, null), storeBundle.getClock(), null, 16, null);
        this.portfolioEndpoint = Endpoint.Companion.create$default(companion, new TraderPortfolioStore5(this, null), getLogoutKillswitch(), new TraderPortfolioStore6(this, null), storeBundle.getClock(), null, 16, null);
    }

    @Override // com.robinhood.store.base.PortfolioStore
    public Job refreshPortfolio(String accountNumber, boolean force) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.refresh$default(this.portfolioEndpoint, accountNumber, force, null, 4, null);
    }

    @Override // com.robinhood.store.base.PortfolioStore
    public Observable<com.robinhood.models.p320db.Portfolio> getPortfolio(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return ObservablesKt.filterIsPresent(getPortfolioOptional(accountNumber));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.store.base.PortfolioStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPortfolioForcedOrNull(String str, Continuation<? super com.robinhood.models.p320db.Portfolio> continuation) {
        C138681 c138681;
        if (continuation instanceof C138681) {
            c138681 = (C138681) continuation;
            int i = c138681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c138681.label = i - Integer.MIN_VALUE;
            } else {
                c138681 = new C138681(continuation);
            }
        }
        C138681 c1386812 = c138681;
        Object objForceFetch$default = c1386812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1386812.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objForceFetch$default);
                Endpoint<String, GetAccountValueResponseDto> endpoint = this.portfolioEndpoint;
                c1386812.label = 1;
                objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, c1386812, 2, null);
                if (objForceFetch$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objForceFetch$default);
            }
            Instant instant = this.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            return Portfolio2.toDbModel((GetAccountValueResponseDto) objForceFetch$default, instant);
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Optional<com.robinhood.models.p320db.Portfolio>> getPortfolioOptional(String accountNumber) {
        return ObservablesKt.mapFirstOptional(asObservable(takeWhileLoggedIn(this.dao.getPortfolio(accountNumber))));
    }

    @Override // com.robinhood.store.base.PortfolioStore
    public Observable<com.robinhood.models.p320db.Portfolio> getIndividualAccountPortfolio() {
        return ObservablesKt.filterIsPresent(getIndividualAccountPortfolioOptional());
    }

    /* compiled from: TraderPortfolioStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.data.store.portfolio.TraderPortfolioStore$getIndividualAccountPortfolioForced$1", m3645f = "TraderPortfolioStore.kt", m3646l = {116}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.data.store.portfolio.TraderPortfolioStore$getIndividualAccountPortfolioForced$1 */
    /* loaded from: classes2.dex */
    static final class C138651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends GetAccountValueResponseDto>>, Object> {
        int label;

        C138651(Continuation<? super C138651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderPortfolioStore.this.new C138651(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends GetAccountValueResponseDto>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<GetAccountValueResponseDto>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<GetAccountValueResponseDto>> continuation) {
            return ((C138651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = TraderPortfolioStore.this.individualAccountPortfolioEndpoint;
            this.label = 1;
            Object objForceFetch$default = Endpoint8.forceFetch$default(endpoint, null, this, 1, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    @Override // com.robinhood.store.base.PortfolioStore
    public Observable<com.robinhood.models.p320db.Portfolio> getIndividualAccountPortfolioForced() {
        Observable<com.robinhood.models.p320db.Portfolio> observableSwitchMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C138651(null), 1, null).toObservable().switchMap(new Function() { // from class: com.robinhood.android.data.store.portfolio.TraderPortfolioStore.getIndividualAccountPortfolioForced.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends com.robinhood.models.p320db.Portfolio> apply(Optional<GetAccountValueResponseDto> it) {
                com.robinhood.models.p320db.Portfolio dbModel;
                Intrinsics.checkNotNullParameter(it, "it");
                GetAccountValueResponseDto orNull = it.getOrNull();
                if (orNull != null) {
                    Instant instant = TraderPortfolioStore.this.clock.instant();
                    Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                    dbModel = Portfolio2.toDbModel(orNull, instant);
                } else {
                    dbModel = null;
                }
                if (dbModel != null) {
                    return Observable.just(dbModel).concatWith(TraderPortfolioStore.this.getIndividualAccountPortfolio());
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    @Override // com.robinhood.store.base.PortfolioStore
    public Observable<Optional<com.robinhood.models.p320db.Portfolio>> getIndividualAccountPortfolioOptional() {
        Observable observableSwitchMap = this.accountProvider.streamIndividualAccountNumberOptional().switchMap(new Function() { // from class: com.robinhood.android.data.store.portfolio.TraderPortfolioStore.getIndividualAccountPortfolioOptional.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<com.robinhood.models.p320db.Portfolio>> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (strComponent1 != null) {
                    return TraderPortfolioStore.this.getPortfolioOptional(strComponent1);
                }
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    @Override // com.robinhood.store.base.PortfolioStore
    public Observable<Optional<GetAccountValueResponseDto>> pollIndividualAccountPortfolio() {
        return asObservable(Endpoint8.poll$default(this.individualAccountPortfolioEndpoint, null, null, 3, null));
    }

    @Override // com.robinhood.store.base.PortfolioStore
    public Observable<GetAccountValueResponseDto> pollAccountPortfolio(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return asObservable(Endpoint.DefaultImpls.poll$default(this.portfolioEndpoint, accountNumber, null, null, 6, null));
    }

    @Override // com.robinhood.store.base.PortfolioStore
    public Job refreshIndividualAccountPortfolio(boolean force) {
        return Endpoint8.refresh$default(this.individualAccountPortfolioEndpoint, force, null, 2, null);
    }
}
