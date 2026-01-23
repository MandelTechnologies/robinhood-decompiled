package com.robinhood.android.common.margin.p083ui.withdrawal;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.margin.p083ui.MarginSpendingProduct;
import com.robinhood.android.common.margin.p083ui.withdrawal.MarginWithdrawalPromptFragment;
import com.robinhood.android.common.margin.p083ui.withdrawal.MarginWithdrawalPromptViewState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginWithdrawalPromptDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0002J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "productMarketingFeatureStore", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/staticcontent/store/ContentStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "streamProduct", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "loadFeature", "Lio/reactivex/Single;", SingularAttributionManager.PRODUCT_PARAM_KEY, "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MarginWithdrawalPromptDuxo extends OldBaseDuxo<MarginWithdrawalPromptViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final ContentStore<ProductMarketingContent.Feature> productMarketingFeatureStore;
    private final RegionGateProvider regionGateProvider;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarginWithdrawalPromptDuxo(AccountProvider accountProvider, RhyAccountStore rhyAccountStore, ContentStore<ProductMarketingContent.Feature> productMarketingFeatureStore, RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle) {
        super(MarginWithdrawalPromptViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(productMarketingFeatureStore, "productMarketingFeatureStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.rhyAccountStore = rhyAccountStore;
        this.productMarketingFeatureStore = productMarketingFeatureStore;
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable observableDistinctUntilChanged = streamProduct().switchMapSingle(new Function() { // from class: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends MarginWithdrawalPromptViewState.Success> apply(Optional<? extends MarginSpendingProduct> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                final MarginSpendingProduct marginSpendingProductComponent1 = optional.component1();
                return MarginWithdrawalPromptDuxo.this.loadFeature(marginSpendingProductComponent1).map(new Function() { // from class: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptDuxo.onCreate.1.1
                    @Override // io.reactivex.functions.Function
                    public final MarginWithdrawalPromptViewState.Success apply(ProductMarketingContent.Feature feature) {
                        Intrinsics.checkNotNullParameter(feature, "feature");
                        return new MarginWithdrawalPromptViewState.Success(marginSpendingProductComponent1, feature);
                    }
                });
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWithdrawalPromptDuxo.onCreate$lambda$1(this.f$0, (MarginWithdrawalPromptViewState.Success) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWithdrawalPromptDuxo.onCreate$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(MarginWithdrawalPromptDuxo marginWithdrawalPromptDuxo, final MarginWithdrawalPromptViewState.Success success) {
        marginWithdrawalPromptDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWithdrawalPromptDuxo.onCreate$lambda$1$lambda$0(success, (MarginWithdrawalPromptViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginWithdrawalPromptViewState onCreate$lambda$1$lambda$0(MarginWithdrawalPromptViewState.Success success, MarginWithdrawalPromptViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(success);
        return success;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(MarginWithdrawalPromptDuxo marginWithdrawalPromptDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        marginWithdrawalPromptDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWithdrawalPromptDuxo.onCreate$lambda$3$lambda$2(t, (MarginWithdrawalPromptViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginWithdrawalPromptViewState onCreate$lambda$3$lambda$2(Throwable th, MarginWithdrawalPromptViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new MarginWithdrawalPromptViewState.Failure(th);
    }

    private final Observable<Optional<MarginSpendingProduct>> streamProduct() {
        Observable<Optional<MarginSpendingProduct>> observableJust;
        MarginSpendingProduct marginSpendingProduct = ((MarginWithdrawalPromptFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getMarginSpendingProduct();
        return (marginSpendingProduct == null || (observableJust = Observable.just(Optional3.asOptional(marginSpendingProduct))) == null) ? MarginSpendingProduct.INSTANCE.fromAccounts(this.accountProvider, this.rhyAccountStore, this.regionGateProvider) : observableJust;
    }

    /* compiled from: MarginWithdrawalPromptDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptDuxo$loadFeature$1", m3645f = "MarginWithdrawalPromptDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptDuxo$loadFeature$1 */
    static final class C112501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductMarketingContent.Feature>, Object> {
        final /* synthetic */ MarginSpendingProduct $product;
        int label;
        final /* synthetic */ MarginWithdrawalPromptDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112501(MarginSpendingProduct marginSpendingProduct, MarginWithdrawalPromptDuxo marginWithdrawalPromptDuxo, Continuation<? super C112501> continuation) {
            super(2, continuation);
            this.$product = marginSpendingProduct;
            this.this$0 = marginWithdrawalPromptDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C112501(this.$product, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductMarketingContent.Feature> continuation) {
            return ((C112501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String str;
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
            if (this.$product == MarginSpendingProduct.RHY) {
                str = MarginWithdrawalPromptDuxo2.RHY_CONTENTFUL_ID;
            } else {
                str = MarginWithdrawalPromptDuxo2.CASH_MANAGEMENT_CONTENTFUL_ID;
            }
            String str2 = str;
            ContentStore contentStore = this.this$0.productMarketingFeatureStore;
            this.label = 1;
            Object objLoad$default = ContentStore.DefaultImpls.load$default(contentStore, str2, null, this, 2, null);
            return objLoad$default == coroutine_suspended ? coroutine_suspended : objLoad$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<ProductMarketingContent.Feature> loadFeature(MarginSpendingProduct product) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C112501(product, this, null), 1, null);
    }

    /* compiled from: MarginWithdrawalPromptDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptDuxo;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment$Args;", "<init>", "()V", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarginWithdrawalPromptDuxo, MarginWithdrawalPromptFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginWithdrawalPromptFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MarginWithdrawalPromptFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginWithdrawalPromptFragment.Args getArgs(MarginWithdrawalPromptDuxo marginWithdrawalPromptDuxo) {
            return (MarginWithdrawalPromptFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, marginWithdrawalPromptDuxo);
        }
    }
}
