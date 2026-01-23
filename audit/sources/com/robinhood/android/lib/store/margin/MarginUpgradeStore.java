package com.robinhood.android.lib.store.margin;

import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.BrokebackMarginApi;
import com.robinhood.models.api.MarginUpgrade;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginUpgradeStore.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginUpgradeStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "brokebackMarginApi", "Lcom/robinhood/models/api/BrokebackMarginApi;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/models/api/BrokebackMarginApi;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/store/StoreBundle;)V", "upgradeToInstant", "Lio/reactivex/Single;", "Lcom/robinhood/models/api/MarginUpgrade;", "accountNumberUrl", "", "pollMarginUpgrade", "currentMarginUpgrade", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginUpgradeStore extends Store {
    private final AccountProvider accountProvider;
    private final BrokebackMarginApi brokebackMarginApi;
    private final TraderPortfolioStore portfolioStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginUpgradeStore(AccountProvider accountProvider, BrokebackMarginApi brokebackMarginApi, TraderPortfolioStore portfolioStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(brokebackMarginApi, "brokebackMarginApi");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.brokebackMarginApi = brokebackMarginApi;
        this.portfolioStore = portfolioStore;
    }

    /* compiled from: MarginUpgradeStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/MarginUpgrade;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginUpgradeStore$upgradeToInstant$1", m3645f = "MarginUpgradeStore.kt", m3646l = {26, 27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.store.margin.MarginUpgradeStore$upgradeToInstant$1 */
    static final class C206081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MarginUpgrade>, Object> {
        final /* synthetic */ String $accountNumberUrl;
        Object L$0;
        int label;
        final /* synthetic */ MarginUpgradeStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C206081(String str, MarginUpgradeStore marginUpgradeStore, Continuation<? super C206081> continuation) {
            super(2, continuation);
            this.$accountNumberUrl = str;
            this.this$0 = marginUpgradeStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C206081(this.$accountNumberUrl, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MarginUpgrade> continuation) {
            return ((C206081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (r5 == r0) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String url;
            Account.Companion companion;
            Object objUpgradeToMargin;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                url = this.$accountNumberUrl;
                if (url == null) {
                    companion = Account.INSTANCE;
                    AccountProvider accountProvider = this.this$0.accountProvider;
                    this.L$0 = companion;
                    this.label = 1;
                    obj = accountProvider.getIndividualAccountNumberForced(this);
                } else {
                    BrokebackMarginApi brokebackMarginApi = this.this$0.brokebackMarginApi;
                    MarginUpgrade.Request instant = MarginUpgrade.Request.INSTANCE.toInstant(url);
                    this.L$0 = null;
                    this.label = 2;
                    objUpgradeToMargin = brokebackMarginApi.upgradeToMargin(instant, this);
                    if (objUpgradeToMargin != coroutine_suspended) {
                        return objUpgradeToMargin;
                    }
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            companion = (Account.Companion) this.L$0;
            ResultKt.throwOnFailure(obj);
            url = companion.getUrl((String) obj);
            BrokebackMarginApi brokebackMarginApi2 = this.this$0.brokebackMarginApi;
            MarginUpgrade.Request instant2 = MarginUpgrade.Request.INSTANCE.toInstant(url);
            this.L$0 = null;
            this.label = 2;
            objUpgradeToMargin = brokebackMarginApi2.upgradeToMargin(instant2, this);
            if (objUpgradeToMargin != coroutine_suspended) {
                return coroutine_suspended;
            }
        }
    }

    public final Single<MarginUpgrade> upgradeToInstant(String accountNumberUrl) {
        Single<MarginUpgrade> singleDoOnSuccess = RxFactory.DefaultImpls.rxSingle$default(this, null, new C206081(accountNumberUrl, this, null), 1, null).flatMap(new Function() { // from class: com.robinhood.android.lib.store.margin.MarginUpgradeStore.upgradeToInstant.2
            @Override // io.reactivex.functions.Function
            public final Single<MarginUpgrade> apply(MarginUpgrade p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return MarginUpgradeStore.this.pollMarginUpgrade(p0);
            }
        }).doOnSuccess(new Consumer() { // from class: com.robinhood.android.lib.store.margin.MarginUpgradeStore.upgradeToInstant.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(MarginUpgrade marginUpgrade) {
                MarginUpgradeStore.this.accountProvider.refresh(true);
                MarginUpgradeStore.this.portfolioStore.refreshIndividualAccountPortfolio(true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
        return singleDoOnSuccess;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<MarginUpgrade> pollMarginUpgrade(final MarginUpgrade currentMarginUpgrade) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable<R> observableSwitchMapSingle = Observable.interval(2L, timeUnit).take(8L, timeUnit).switchMapSingle(new Function() { // from class: com.robinhood.android.lib.store.margin.MarginUpgradeStore.pollMarginUpgrade.1

            /* compiled from: MarginUpgradeStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/MarginUpgrade;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginUpgradeStore$pollMarginUpgrade$1$1", m3645f = "MarginUpgradeStore.kt", m3646l = {41}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.lib.store.margin.MarginUpgradeStore$pollMarginUpgrade$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MarginUpgrade>, Object> {
                final /* synthetic */ MarginUpgrade $currentMarginUpgrade;
                int label;
                final /* synthetic */ MarginUpgradeStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MarginUpgradeStore marginUpgradeStore, MarginUpgrade marginUpgrade, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = marginUpgradeStore;
                    this.$currentMarginUpgrade = marginUpgrade;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$currentMarginUpgrade, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MarginUpgrade> continuation) {
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
                    BrokebackMarginApi brokebackMarginApi = this.this$0.brokebackMarginApi;
                    String id = this.$currentMarginUpgrade.getId();
                    Intrinsics.checkNotNull(id);
                    this.label = 1;
                    Object marginUpgrade = brokebackMarginApi.getMarginUpgrade(id, this);
                    return marginUpgrade == coroutine_suspended ? coroutine_suspended : marginUpgrade;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends MarginUpgrade> apply(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MarginUpgradeStore marginUpgradeStore = MarginUpgradeStore.this;
                return RxFactory.DefaultImpls.rxSingle$default(marginUpgradeStore, null, new AnonymousClass1(marginUpgradeStore, currentMarginUpgrade, null), 1, null);
            }
        });
        final C206062 c206062 = new PropertyReference1Impl() { // from class: com.robinhood.android.lib.store.margin.MarginUpgradeStore.pollMarginUpgrade.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((MarginUpgrade) obj).isApproved());
            }
        };
        Single<MarginUpgrade> singleOnErrorReturn = observableSwitchMapSingle.takeUntil((Predicate<? super R>) new Predicate(c206062) { // from class: com.robinhood.android.lib.store.margin.MarginUpgradeStore$sam$io_reactivex_functions_Predicate$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c206062, "function");
                this.function = c206062;
            }

            @Override // io.reactivex.functions.Predicate
            public final /* synthetic */ boolean test(Object obj) {
                return ((Boolean) this.function.invoke(obj)).booleanValue();
            }
        }).last(currentMarginUpgrade).onErrorReturn(new Function() { // from class: com.robinhood.android.lib.store.margin.MarginUpgradeStore.pollMarginUpgrade.3
            @Override // io.reactivex.functions.Function
            public final MarginUpgrade apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return currentMarginUpgrade;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "onErrorReturn(...)");
        return singleOnErrorReturn;
    }
}
