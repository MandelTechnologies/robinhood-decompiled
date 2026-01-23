package com.robinhood.android.gold.lib.rejoin.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.gold.lib.rejoin.api.ApiGoldRejoinFlow;
import com.robinhood.android.gold.lib.rejoin.api.ApiGoldRejoinFlowQueryParams;
import com.robinhood.android.gold.lib.rejoin.api.GoldRejoinApi;
import com.robinhood.android.gold.lib.rejoin.api.GoldRejoinRequest;
import com.robinhood.android.gold.lib.rejoin.api.GoldRejoinResponse;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: GoldRejoinStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/rejoin/store/GoldRejoinStore;", "Lcom/robinhood/store/Store;", "goldRejoinApi", "Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinApi;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinApi;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/store/StoreBundle;)V", "goldRejoinFlowRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/gold/lib/rejoin/api/ApiGoldRejoinFlow;", "kotlin.jvm.PlatformType", "goldRejoinFlowEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/gold/lib/rejoin/api/ApiGoldRejoinFlowQueryParams;", "getGoldRejoinFlow", "source", "", "feature", "forceRefresh", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejoin", "Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinResponse;", "request", "Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinRequest;", "(Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-gold-rejoin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldRejoinStore extends Store {
    private final AccountProvider accountProvider;
    private final GoldRejoinApi goldRejoinApi;
    private final Endpoint<ApiGoldRejoinFlowQueryParams, ApiGoldRejoinFlow> goldRejoinFlowEndpoint;
    private final BehaviorRelay<ApiGoldRejoinFlow> goldRejoinFlowRelay;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final TraderPortfolioStore portfolioStore;

    /* compiled from: GoldRejoinStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.lib.rejoin.store.GoldRejoinStore", m3645f = "GoldRejoinStore.kt", m3646l = {48, 62}, m3647m = "getGoldRejoinFlow")
    /* renamed from: com.robinhood.android.gold.lib.rejoin.store.GoldRejoinStore$getGoldRejoinFlow$1 */
    static final class C178301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C178301(Continuation<? super C178301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoldRejoinStore.this.getGoldRejoinFlow(null, null, false, this);
        }
    }

    /* compiled from: GoldRejoinStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.lib.rejoin.store.GoldRejoinStore", m3645f = "GoldRejoinStore.kt", m3646l = {54}, m3647m = "rejoin")
    /* renamed from: com.robinhood.android.gold.lib.rejoin.store.GoldRejoinStore$rejoin$1 */
    static final class C178311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C178311(Continuation<? super C178311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoldRejoinStore.this.rejoin(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldRejoinStore(GoldRejoinApi goldRejoinApi, AccountProvider accountProvider, TraderPortfolioStore portfolioStore, MarginSubscriptionStore marginSubscriptionStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(goldRejoinApi, "goldRejoinApi");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.goldRejoinApi = goldRejoinApi;
        this.accountProvider = accountProvider;
        this.portfolioStore = portfolioStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        BehaviorRelay<ApiGoldRejoinFlow> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.goldRejoinFlowRelay = behaviorRelayCreate;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        GoldRejoinStore2 goldRejoinStore2 = new GoldRejoinStore2(behaviorRelayCreate);
        this.goldRejoinFlowEndpoint = Endpoint.Companion.create$default(companion, new GoldRejoinStore3(this, null), getLogoutKillswitch(), goldRejoinStore2, storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object goldRejoinFlowEndpoint$accept(BehaviorRelay behaviorRelay, ApiGoldRejoinFlow apiGoldRejoinFlow, Continuation continuation) {
        behaviorRelay.accept(apiGoldRejoinFlow);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object getGoldRejoinFlow$default(GoldRejoinStore goldRejoinStore, String str, String str2, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return goldRejoinStore.getGoldRejoinFlow(str, str2, z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r15 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getGoldRejoinFlow(String str, String str2, boolean z, Continuation<? super ApiGoldRejoinFlow> continuation) {
        C178301 c178301;
        if (continuation instanceof C178301) {
            c178301 = (C178301) continuation;
            int i = c178301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c178301.label = i - Integer.MIN_VALUE;
            } else {
                c178301 = new C178301(continuation);
            }
        }
        Object objAwaitFirst = c178301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c178301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Job jobRefresh$default = Endpoint.DefaultImpls.refresh$default(this.goldRejoinFlowEndpoint, new ApiGoldRejoinFlowQueryParams(str, str2), z, null, 4, null);
            if (z) {
                c178301.label = 1;
                if (jobRefresh$default.join(c178301) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwaitFirst);
                Intrinsics.checkNotNullExpressionValue(objAwaitFirst, "awaitFirst(...)");
                return objAwaitFirst;
            }
            ResultKt.throwOnFailure(objAwaitFirst);
        }
        BehaviorRelay<ApiGoldRejoinFlow> behaviorRelay = this.goldRejoinFlowRelay;
        c178301.label = 2;
        objAwaitFirst = RxAwait3.awaitFirst(behaviorRelay, c178301);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rejoin(GoldRejoinRequest goldRejoinRequest, Continuation<? super GoldRejoinResponse> continuation) {
        C178311 c178311;
        if (continuation instanceof C178311) {
            c178311 = (C178311) continuation;
            int i = c178311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c178311.label = i - Integer.MIN_VALUE;
            } else {
                c178311 = new C178311(continuation);
            }
        }
        Object objRejoin = c178311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c178311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRejoin);
            GoldRejoinApi goldRejoinApi = this.goldRejoinApi;
            c178311.label = 1;
            objRejoin = goldRejoinApi.rejoin(goldRejoinRequest, c178311);
            if (objRejoin == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRejoin);
        }
        GoldRejoinResponse goldRejoinResponse = (GoldRejoinResponse) objRejoin;
        this.accountProvider.refresh(true);
        this.portfolioStore.refreshIndividualAccountPortfolio(true);
        this.marginSubscriptionStore.refreshCurrentMarginSubscription(true);
        return goldRejoinResponse;
    }
}
