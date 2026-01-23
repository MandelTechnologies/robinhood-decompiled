package com.robinhood.android.cash.merchantrewards.p073ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.P2pUpsellExperiment;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Supervisor3;

/* compiled from: MerchantRewardsWelcomeFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDataState;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentViewState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDataStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDataStateProvider;)V", "onCreate", "", "getContentfulResources", "Companion", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MerchantRewardsWelcomeFragmentDuxo extends BaseDuxo<MerchantRewardsWelcomeFragmentDataState, MerchantRewardsWelcomeFragmentViewState> {
    public static final String WELCOME_SCREEN_CONTENTFUL = "2uu3RiAhFnwMiJBMFjJFPj";
    private final ExperimentsStore experimentsStore;
    private final MinervaAccountStore minervaAccountStore;
    private final RhyAccountStore rhyAccountStore;
    private final StaticContentStore staticContentStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantRewardsWelcomeFragmentDuxo(ExperimentsStore experimentsStore, RhyAccountStore rhyAccountStore, MinervaAccountStore minervaAccountStore, StaticContentStore staticContentStore, DuxoBundle duxoBundle, MerchantRewardsWelcomeFragmentDataStateProvider stateProvider) {
        super(new MerchantRewardsWelcomeFragmentDataState(null, null, null, null, null, null, 63, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.experimentsStore = experimentsStore;
        this.rhyAccountStore = rhyAccountStore;
        this.minervaAccountStore = minervaAccountStore;
        this.staticContentStore = staticContentStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{P2pUpsellExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsWelcomeFragmentDuxo.onCreate$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(this.rhyAccountStore.streamSpendingAccount()).doOnNext(new Consumer() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo.onCreate.2

            /* compiled from: MerchantRewardsWelcomeFragmentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$onCreate$2$1", m3645f = "MerchantRewardsWelcomeFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$onCreate$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MerchantRewardsWelcomeFragmentDataState, Continuation<? super MerchantRewardsWelcomeFragmentDataState>, Object> {
                final /* synthetic */ RhyAccount $spendingAccount;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(RhyAccount rhyAccount, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$spendingAccount = rhyAccount;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$spendingAccount, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MerchantRewardsWelcomeFragmentDataState merchantRewardsWelcomeFragmentDataState, Continuation<? super MerchantRewardsWelcomeFragmentDataState> continuation) {
                    return ((AnonymousClass1) create(merchantRewardsWelcomeFragmentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MerchantRewardsWelcomeFragmentDataState.copy$default((MerchantRewardsWelcomeFragmentDataState) this.L$0, this.$spendingAccount, null, null, null, null, null, 62, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(RhyAccount rhyAccount) {
                MerchantRewardsWelcomeFragmentDuxo.this.applyMutation(new AnonymousClass1(rhyAccount, null));
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<MinervaAccount>> apply(RhyAccount spendingAccount) {
                Intrinsics.checkNotNullParameter(spendingAccount, "spendingAccount");
                return MerchantRewardsWelcomeFragmentDuxo.this.minervaAccountStore.streamRhyMinervaAccountOptional(spendingAccount.getId());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsWelcomeFragmentDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
        getContentfulResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(MerchantRewardsWelcomeFragmentDuxo merchantRewardsWelcomeFragmentDuxo, boolean z) {
        merchantRewardsWelcomeFragmentDuxo.applyMutation(new MerchantRewardsWelcomeFragmentDuxo5(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(MerchantRewardsWelcomeFragmentDuxo merchantRewardsWelcomeFragmentDuxo, Optional optional) {
        merchantRewardsWelcomeFragmentDuxo.applyMutation(new MerchantRewardsWelcomeFragmentDuxo6((MinervaAccount) optional.getOrNull(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: MerchantRewardsWelcomeFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing;", "", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$getContentfulResources$1", m3645f = "MerchantRewardsWelcomeFragmentDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$getContentfulResources$1 */
    static final class C101711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends ProductMarketing, ? extends List<? extends ProductMarketing.Feature>>>, Object> {
        int label;

        C101711(Continuation<? super C101711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MerchantRewardsWelcomeFragmentDuxo.this.new C101711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends ProductMarketing, ? extends List<? extends ProductMarketing.Feature>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Tuples2<ProductMarketing, ? extends List<ProductMarketing.Feature>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<ProductMarketing, ? extends List<ProductMarketing.Feature>>> continuation) {
            return ((C101711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MerchantRewardsWelcomeFragmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing;", "", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$getContentfulResources$1$1", m3645f = "MerchantRewardsWelcomeFragmentDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, 75}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$getContentfulResources$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends ProductMarketing, ? extends List<? extends ProductMarketing.Feature>>>, Object> {
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            final /* synthetic */ MerchantRewardsWelcomeFragmentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MerchantRewardsWelcomeFragmentDuxo merchantRewardsWelcomeFragmentDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = merchantRewardsWelcomeFragmentDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends ProductMarketing, ? extends List<? extends ProductMarketing.Feature>>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Tuples2<ProductMarketing, ? extends List<ProductMarketing.Feature>>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<ProductMarketing, ? extends List<ProductMarketing.Feature>>> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
            
                if (r11 == r0) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009a -> B:20:0x009b). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AnonymousClass1 anonymousClass1;
                Iterator it;
                Collection collection;
                MerchantRewardsWelcomeFragmentDuxo merchantRewardsWelcomeFragmentDuxo;
                ProductMarketing productMarketing;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StaticContentStore staticContentStore = this.this$0.staticContentStore;
                    this.label = 1;
                    anonymousClass1 = this;
                    obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, MerchantRewardsWelcomeFragmentDuxo.WELCOME_SCREEN_CONTENTFUL, null, anonymousClass1, 2, null);
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection = (Collection) this.L$4;
                    productMarketing = (ProductMarketing) this.L$3;
                    it = (Iterator) this.L$2;
                    Collection collection2 = (Collection) this.L$1;
                    merchantRewardsWelcomeFragmentDuxo = (MerchantRewardsWelcomeFragmentDuxo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                    collection.add((ProductMarketing.Feature) ((EntryResource) obj).getValue());
                    collection = collection2;
                    if (it.hasNext()) {
                        ResourceLink resourceLink = (ResourceLink) it.next();
                        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                        MerchantRewardsWelcomeFragmentDuxo2 merchantRewardsWelcomeFragmentDuxo2 = new MerchantRewardsWelcomeFragmentDuxo2(merchantRewardsWelcomeFragmentDuxo, resourceLink, null);
                        anonymousClass1.L$0 = merchantRewardsWelcomeFragmentDuxo;
                        anonymousClass1.L$1 = collection;
                        anonymousClass1.L$2 = it;
                        anonymousClass1.L$3 = productMarketing;
                        anonymousClass1.L$4 = collection;
                        anonymousClass1.label = 2;
                        obj = BuildersKt.withContext(coroutineDispatcher, merchantRewardsWelcomeFragmentDuxo2, this);
                        if (obj != coroutine_suspended) {
                            collection2 = collection;
                            collection.add((ProductMarketing.Feature) ((EntryResource) obj).getValue());
                            collection = collection2;
                            if (it.hasNext()) {
                                return Tuples4.m3642to(productMarketing, (List) collection);
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                ProductMarketing productMarketing2 = (ProductMarketing) ((EntryResource) obj).getValue();
                List<ResourceLink<EntryResource<ProductMarketing.Feature>>> features = productMarketing2.getFeatures();
                MerchantRewardsWelcomeFragmentDuxo merchantRewardsWelcomeFragmentDuxo3 = anonymousClass1.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
                it = features.iterator();
                collection = arrayList;
                merchantRewardsWelcomeFragmentDuxo = merchantRewardsWelcomeFragmentDuxo3;
                productMarketing = productMarketing2;
                if (it.hasNext()) {
                }
            }
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(MerchantRewardsWelcomeFragmentDuxo.this, null);
            this.label = 1;
            Object objSupervisorScope = Supervisor3.supervisorScope(anonymousClass1, this);
            return objSupervisorScope == coroutine_suspended ? coroutine_suspended : objSupervisorScope;
        }
    }

    private final void getContentfulResources() {
        Observable observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C101711(null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable observableTimeout = ObservablesKt.retryExponential(ObservableDelay2.minTimeInFlight(observable, 500L, timeUnit), 3, new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MerchantRewardsWelcomeFragmentDuxo.getContentfulResources$lambda$2((Throwable) obj));
            }
        }).timeout(5000L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(observableTimeout, "timeout(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableTimeout, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsWelcomeFragmentDuxo.getContentfulResources$lambda$3(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsWelcomeFragmentDuxo.getContentfulResources$lambda$4(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getContentfulResources$lambda$2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Throwables.isNetworkRelated(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getContentfulResources$lambda$3(MerchantRewardsWelcomeFragmentDuxo merchantRewardsWelcomeFragmentDuxo, Tuples2 tuples2) {
        merchantRewardsWelcomeFragmentDuxo.applyMutation(new MerchantRewardsWelcomeFragmentDuxo3(tuples2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getContentfulResources$lambda$4(MerchantRewardsWelcomeFragmentDuxo merchantRewardsWelcomeFragmentDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Throwables.isNetworkRelated(it)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 4, null);
        }
        merchantRewardsWelcomeFragmentDuxo.applyMutation(new MerchantRewardsWelcomeFragmentDuxo4(null));
        return Unit.INSTANCE;
    }
}
