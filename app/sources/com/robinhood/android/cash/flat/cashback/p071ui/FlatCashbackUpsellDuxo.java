package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDataState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.MerchantOfferStore;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.UUID;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FlatCashbackUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellDuxo;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDuxo;", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellViewState;", "stateProvider", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "realProductMarketingStore", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "merchantOfferStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "<init>", "(Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;)V", "loadContent", "", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FlatCashbackUpsellDuxo extends BaseFlatCashbackDuxo<MerchantOfferV2, FlatCashbackUpsellViewState> {
    public static final int $stable = 8;
    private final MerchantOfferStore merchantOfferStore;
    private final RealProductMarketingStore realProductMarketingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlatCashbackUpsellDuxo(FlatCashbackUpsellStateProvider stateProvider, DuxoBundle duxoBundle, RealProductMarketingStore realProductMarketingStore, MerchantOfferStore merchantOfferStore) {
        super(realProductMarketingStore, stateProvider, duxoBundle, new BaseFlatCashbackDataState(null, null, null, 7, null));
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
        Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
        this.realProductMarketingStore = realProductMarketingStore;
        this.merchantOfferStore = merchantOfferStore;
    }

    /* compiled from: FlatCashbackUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellDuxo$loadContent$1", m3645f = "FlatCashbackUpsellDuxo.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellDuxo$loadContent$1 */
    static final class C100821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductMarketingContent>, Object> {
        int label;

        C100821(Continuation<? super C100821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FlatCashbackUpsellDuxo.this.new C100821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductMarketingContent> continuation) {
            return ((C100821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RealProductMarketingStore realProductMarketingStore = FlatCashbackUpsellDuxo.this.realProductMarketingStore;
            this.label = 1;
            Object objLoad$default = ContentStore.DefaultImpls.load$default(realProductMarketingStore, BaseFlatCashbackDuxo.CONTENTFUL_ID, null, this, 2, null);
            return objLoad$default == coroutine_suspended ? coroutine_suspended : objLoad$default;
        }
    }

    @Override // com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDuxo
    public void loadContent() {
        this.merchantOfferStore.refresh(true);
        Observable observableFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C100821(null), 1, null).toObservable().doOnNext(new Consumer() { // from class: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellDuxo.loadContent.2

            /* compiled from: FlatCashbackUpsellDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDataState;", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellDuxo$loadContent$2$1", m3645f = "FlatCashbackUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellDuxo$loadContent$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BaseFlatCashbackDataState<MerchantOfferV2>, Continuation<? super BaseFlatCashbackDataState<MerchantOfferV2>>, Object> {
                final /* synthetic */ ProductMarketingContent $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ProductMarketingContent productMarketingContent, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = productMarketingContent;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BaseFlatCashbackDataState<MerchantOfferV2> baseFlatCashbackDataState, Continuation<? super BaseFlatCashbackDataState<MerchantOfferV2>> continuation) {
                    return ((AnonymousClass1) create(baseFlatCashbackDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return BaseFlatCashbackDataState.copy$default((BaseFlatCashbackDataState) this.L$0, this.$it, null, null, 6, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(ProductMarketingContent productMarketingContent) {
                FlatCashbackUpsellDuxo.this.applyMutation(new AnonymousClass1(productMarketingContent, null));
            }
        }).map(new Function() { // from class: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellDuxo.loadContent.3
            @Override // io.reactivex.functions.Function
            public final ProductMarketingContent.Feature apply(ProductMarketingContent content) {
                Intrinsics.checkNotNullParameter(content, "content");
                for (ProductMarketingContent.Feature feature : content.getFeatures()) {
                    if (Intrinsics.areEqual(feature.getIdentifier(), "associated-offer-id")) {
                        return feature;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }).flatMap(new Function() { // from class: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellDuxo.loadContent.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MerchantOfferV2> apply(ProductMarketingContent.Feature it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MerchantOfferStore merchantOfferStore = FlatCashbackUpsellDuxo.this.merchantOfferStore;
                UUID uuidFromString = UUID.fromString(it.getDescription().toString());
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                return merchantOfferStore.streamByGlobalOfferId(uuidFromString);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlatCashbackUpsellDuxo.loadContent$lambda$0(this.f$0, (MerchantOfferV2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlatCashbackUpsellDuxo.loadContent$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContent$lambda$0(FlatCashbackUpsellDuxo flatCashbackUpsellDuxo, MerchantOfferV2 merchantOfferV2) {
        flatCashbackUpsellDuxo.applyMutation(new FlatCashbackUpsellDuxo2(merchantOfferV2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContent$lambda$1(FlatCashbackUpsellDuxo flatCashbackUpsellDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        flatCashbackUpsellDuxo.applyMutation(new FlatCashbackUpsellDuxo3(it, null));
        return Unit.INSTANCE;
    }
}
