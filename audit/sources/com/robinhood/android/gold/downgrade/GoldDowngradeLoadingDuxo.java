package com.robinhood.android.gold.downgrade;

import com.robinhood.android.lib.margin.api.InterestRateModels;
import com.robinhood.android.lib.margin.api.InterestRatesApi;
import com.robinhood.android.lib.margin.api.MarginInterestRateChoice;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.GoldValuePropsStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.models.api.bonfire.ApiGoldValuePropsDowngrade;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesAndroid;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: GoldDowngradeLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingState;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "interestRatesApi", "Lcom/robinhood/android/lib/margin/api/InterestRatesApi;", "goldValuePropsStore", "Lcom/robinhood/librobinhood/data/store/GoldValuePropsStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "<init>", "(Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/android/lib/margin/api/InterestRatesApi;Lcom/robinhood/librobinhood/data/store/GoldValuePropsStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;)V", "onStart", "", "Companion", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldDowngradeLoadingDuxo extends OldBaseDuxo<GoldDowngradeLoadingState> {
    private static final String CONFIRMATION_CONTENTFUL_ID = "3mGqfdGjnMGEufxXd1RHLt";
    private final GoldValuePropsStore goldValuePropsStore;
    private final InterestRatesApi interestRatesApi;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final StaticContentStore staticContentStore;
    private final SweepsInterestStore sweepsInterestStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoldDowngradeLoadingDuxo(MarginSubscriptionStore marginSubscriptionStore, StaticContentStore staticContentStore, InterestRatesApi interestRatesApi, GoldValuePropsStore goldValuePropsStore, SweepsInterestStore sweepsInterestStore) {
        super(new GoldDowngradeLoadingState(null, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(interestRatesApi, "interestRatesApi");
        Intrinsics.checkNotNullParameter(goldValuePropsStore, "goldValuePropsStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.staticContentStore = staticContentStore;
        this.interestRatesApi = interestRatesApi;
        this.goldValuePropsStore = goldValuePropsStore;
        this.sweepsInterestStore = sweepsInterestStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new C177421(null), 1, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldDowngradeLoadingDuxo.onStart$lambda$1(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldDowngradeLoadingDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: GoldDowngradeLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.downgrade.GoldDowngradeLoadingDuxo$onStart$1", m3645f = "GoldDowngradeLoadingDuxo.kt", m3646l = {35, 91, 46, 51, 58}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingDuxo$onStart$1 */
    static final class C177421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends GoldDowngradeContext>>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        C177421(Continuation<? super C177421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C177421 c177421 = GoldDowngradeLoadingDuxo.this.new C177421(continuation);
            c177421.L$0 = obj;
            return c177421;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends GoldDowngradeContext>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<GoldDowngradeContext>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<GoldDowngradeContext>> continuation) {
            return ((C177421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object downgradeValueProps;
            ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade;
            Deferred deferredAsync$default;
            Object objAwaitFirst;
            CoroutineScope coroutineScope2;
            Object choices;
            Deferred deferred;
            BigDecimal bigDecimal;
            Object objAwait;
            BigDecimal bigDecimal2;
            BigDecimal bigDecimal3;
            Deferred deferred2;
            ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade2;
            MarginSubscription marginSubscription;
            Object objAwait2;
            BigDecimal bigDecimal4;
            BigDecimal bigDecimal5;
            MarginSubscription marginSubscription2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            GoldDowngradeContext goldDowngradeContext = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                GoldValuePropsStore goldValuePropsStore = GoldDowngradeLoadingDuxo.this.goldValuePropsStore;
                this.L$0 = coroutineScope;
                this.label = 1;
                downgradeValueProps = goldValuePropsStore.getDowngradeValueProps(this);
                if (downgradeValueProps != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    deferredAsync$default = (Deferred) this.L$2;
                    ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade3 = (ApiGoldValuePropsDowngrade) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    apiGoldValuePropsDowngrade = apiGoldValuePropsDowngrade3;
                    objAwaitFirst = obj;
                    BigDecimal goldInterestRate = ((SweepsInterest) objAwaitFirst).getGoldInterestRate();
                    InterestRatesApi interestRatesApi = GoldDowngradeLoadingDuxo.this.interestRatesApi;
                    this.L$0 = coroutineScope2;
                    this.L$1 = apiGoldValuePropsDowngrade;
                    this.L$2 = deferredAsync$default;
                    this.L$3 = goldInterestRate;
                    this.label = 3;
                    choices = interestRatesApi.getChoices(this);
                    if (choices != coroutine_suspended) {
                        deferred = deferredAsync$default;
                        bigDecimal = goldInterestRate;
                        CoroutineScope coroutineScope3 = coroutineScope2;
                        MarginInterestRateChoice gold2 = InterestRateModels.toRates((List) choices).getGold();
                        if (gold2 == null) {
                        }
                        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new GoldDowngradeLoadingDuxo3(GoldDowngradeLoadingDuxo.this, null), 3, null);
                        this.L$0 = apiGoldValuePropsDowngrade;
                        this.L$1 = deferred;
                        this.L$2 = bigDecimal;
                        this.L$3 = interestRate;
                        this.label = 4;
                        objAwait = deferredAsync$default2.await(this);
                        if (objAwait != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 3) {
                    bigDecimal = (BigDecimal) this.L$3;
                    Deferred deferred3 = (Deferred) this.L$2;
                    ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade4 = (ApiGoldValuePropsDowngrade) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    apiGoldValuePropsDowngrade = apiGoldValuePropsDowngrade4;
                    deferred = deferred3;
                    choices = obj;
                    CoroutineScope coroutineScope32 = coroutineScope2;
                    MarginInterestRateChoice gold22 = InterestRateModels.toRates((List) choices).getGold();
                    BigDecimal interestRate = gold22 == null ? gold22.getInterestRate() : null;
                    Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new GoldDowngradeLoadingDuxo3(GoldDowngradeLoadingDuxo.this, null), 3, null);
                    this.L$0 = apiGoldValuePropsDowngrade;
                    this.L$1 = deferred;
                    this.L$2 = bigDecimal;
                    this.L$3 = interestRate;
                    this.label = 4;
                    objAwait = deferredAsync$default22.await(this);
                    if (objAwait != coroutine_suspended) {
                        BigDecimal bigDecimal6 = interestRate;
                        bigDecimal2 = bigDecimal;
                        bigDecimal3 = bigDecimal6;
                        deferred2 = deferred;
                        apiGoldValuePropsDowngrade2 = apiGoldValuePropsDowngrade;
                        marginSubscription = (MarginSubscription) objAwait;
                        if (marginSubscription != null) {
                        }
                        return Optional3.asOptional(goldDowngradeContext);
                    }
                    return coroutine_suspended;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade5 = (ApiGoldValuePropsDowngrade) this.L$3;
                    MarginSubscription marginSubscription3 = (MarginSubscription) this.L$2;
                    BigDecimal bigDecimal7 = (BigDecimal) this.L$1;
                    BigDecimal bigDecimal8 = (BigDecimal) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    apiGoldValuePropsDowngrade2 = apiGoldValuePropsDowngrade5;
                    marginSubscription2 = marginSubscription3;
                    bigDecimal4 = bigDecimal7;
                    bigDecimal5 = bigDecimal8;
                    objAwait2 = obj;
                    goldDowngradeContext = new GoldDowngradeContext(marginSubscription2, apiGoldValuePropsDowngrade2, (OtherMarkdown) objAwait2, bigDecimal5, bigDecimal4);
                    return Optional3.asOptional(goldDowngradeContext);
                }
                bigDecimal3 = (BigDecimal) this.L$3;
                BigDecimal bigDecimal9 = (BigDecimal) this.L$2;
                Deferred deferred4 = (Deferred) this.L$1;
                apiGoldValuePropsDowngrade2 = (ApiGoldValuePropsDowngrade) this.L$0;
                ResultKt.throwOnFailure(obj);
                deferred2 = deferred4;
                bigDecimal2 = bigDecimal9;
                objAwait = obj;
                marginSubscription = (MarginSubscription) objAwait;
                if (marginSubscription != null) {
                    this.L$0 = bigDecimal2;
                    this.L$1 = bigDecimal3;
                    this.L$2 = marginSubscription;
                    this.L$3 = apiGoldValuePropsDowngrade2;
                    this.label = 5;
                    objAwait2 = deferred2.await(this);
                    if (objAwait2 != coroutine_suspended) {
                        bigDecimal4 = bigDecimal3;
                        bigDecimal5 = bigDecimal2;
                        marginSubscription2 = marginSubscription;
                        goldDowngradeContext = new GoldDowngradeContext(marginSubscription2, apiGoldValuePropsDowngrade2, (OtherMarkdown) objAwait2, bigDecimal5, bigDecimal4);
                    }
                    return coroutine_suspended;
                }
                return Optional3.asOptional(goldDowngradeContext);
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            downgradeValueProps = obj;
            CoroutineScope coroutineScope4 = coroutineScope;
            apiGoldValuePropsDowngrade = (ApiGoldValuePropsDowngrade) downgradeValueProps;
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope4, null, null, new GoldDowngradeLoadingDuxo2(GoldDowngradeLoadingDuxo.this, null), 3, null);
            SweepsInterestStore.refreshNoAccountNumber$default(GoldDowngradeLoadingDuxo.this.sweepsInterestStore, false, 1, null);
            Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(GoldDowngradeLoadingDuxo.this.sweepsInterestStore.streamNoAccountNumber());
            this.L$0 = coroutineScope4;
            this.L$1 = apiGoldValuePropsDowngrade;
            this.L$2 = deferredAsync$default;
            this.label = 2;
            objAwaitFirst = RxAwait3.awaitFirst(observableFilterIsPresent, this);
            if (objAwaitFirst != coroutine_suspended) {
                coroutineScope2 = coroutineScope4;
                BigDecimal goldInterestRate2 = ((SweepsInterest) objAwaitFirst).getGoldInterestRate();
                InterestRatesApi interestRatesApi2 = GoldDowngradeLoadingDuxo.this.interestRatesApi;
                this.L$0 = coroutineScope2;
                this.L$1 = apiGoldValuePropsDowngrade;
                this.L$2 = deferredAsync$default;
                this.L$3 = goldInterestRate2;
                this.label = 3;
                choices = interestRatesApi2.getChoices(this);
                if (choices != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(GoldDowngradeLoadingDuxo goldDowngradeLoadingDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final GoldDowngradeContext goldDowngradeContext = (GoldDowngradeContext) optional.component1();
        goldDowngradeLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldDowngradeLoadingDuxo.onStart$lambda$1$lambda$0(goldDowngradeContext, (GoldDowngradeLoadingState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldDowngradeLoadingState onStart$lambda$1$lambda$0(GoldDowngradeContext goldDowngradeContext, GoldDowngradeLoadingState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (goldDowngradeContext == null) {
            return GoldDowngradeLoadingState.copy$default(applyMutation, null, new UiEvent(Unit.INSTANCE), null, 5, null);
        }
        return GoldDowngradeLoadingState.copy$default(applyMutation, goldDowngradeContext, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(GoldDowngradeLoadingDuxo goldDowngradeLoadingDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        goldDowngradeLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldDowngradeLoadingDuxo.onStart$lambda$3$lambda$2(t, (GoldDowngradeLoadingState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldDowngradeLoadingState onStart$lambda$3$lambda$2(Throwable th, GoldDowngradeLoadingState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return GoldDowngradeLoadingState.copy$default(applyMutation, null, null, new UiEvent(th), 3, null);
    }
}
