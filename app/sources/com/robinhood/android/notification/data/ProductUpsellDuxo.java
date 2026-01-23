package com.robinhood.android.notification.data;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.notification.Loggable;
import com.robinhood.android.notification.dagger.ProductUpsellManagerFactory;
import com.robinhood.android.notification.data.ProductUpsellViewState;
import com.robinhood.android.productupsell.contracts.ProductUpsellKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Single;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProductUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002*+B;\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0018H\u0081@¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020(2\u0006\u0010$\u001a\u00020\u0018H\u0081@¢\u0006\u0004\b)\u0010&R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/notification/data/ProductUpsellDataState;", "Lcom/robinhood/android/notification/data/ProductUpsellViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "managerFactory", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "stateProvider", "Lcom/robinhood/android/notification/data/ProductUpsellDuxo$NotificationUpsellStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;Lcom/robinhood/android/notification/data/ProductUpsellDuxo$NotificationUpsellStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "upsellKey", "Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "upsellEntryId", "", "manager", "Lcom/robinhood/android/notification/data/ProductUpsellManager;", "getManager", "()Lcom/robinhood/android/notification/data/ProductUpsellManager;", "manager$delegate", "Lkotlin/Lazy;", "hasSeenUpsell", "", "onResume", "", "retrieveInfo", "contentId", "retrieveInfo$feature_product_upsell_externalDebug", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUpsellDetails", "Lcom/robinhood/android/notification/data/ProductUpsellViewData;", "fetchUpsellDetails$feature_product_upsell_externalDebug", "Companion", "NotificationUpsellStateProvider", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ProductUpsellDuxo extends BaseDuxo<ProductUpsellDataState, ProductUpsellViewState> implements HasSavedState {
    private final CoroutineDispatcher dispatcher;
    private boolean hasSeenUpsell;

    /* renamed from: manager$delegate, reason: from kotlin metadata */
    private final Lazy manager;
    private final ProductUpsellManagerFactory managerFactory;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;
    private final String upsellEntryId;
    private final ProductUpsellKey upsellKey;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductUpsellDuxo(StaticContentStore staticContentStore, @DefaultDispatcher CoroutineDispatcher dispatcher, ProductUpsellManagerFactory managerFactory, NotificationUpsellStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ProductUpsellDataState(true, null, false, false, 14, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(managerFactory, "managerFactory");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.staticContentStore = staticContentStore;
        this.dispatcher = dispatcher;
        this.managerFactory = managerFactory;
        this.savedStateHandle = savedStateHandle;
        ProductUpsellKey productUpsellKey = (ProductUpsellKey) INSTANCE.getArgs(getSavedStateHandle());
        this.upsellKey = productUpsellKey;
        this.upsellEntryId = productUpsellKey.getContentfulEntryId();
        this.manager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.notification.data.ProductUpsellDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductUpsellDuxo.manager_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductUpsellManager getManager() {
        return (ProductUpsellManager) this.manager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductUpsellManager manager_delegate$lambda$0(ProductUpsellDuxo productUpsellDuxo) {
        return productUpsellDuxo.managerFactory.create(productUpsellDuxo.upsellKey);
    }

    /* compiled from: ProductUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.notification.data.ProductUpsellDuxo$onResume$1", m3645f = "ProductUpsellDuxo.kt", m3646l = {54, 63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.notification.data.ProductUpsellDuxo$onResume$1 */
    static final class C226011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C226011(Continuation<? super C226011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductUpsellDuxo.this.new C226011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C226011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r5.markUpsellSeen(r4) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            if (r5.retrieveInfo$feature_product_upsell_externalDebug(r1, r4) != r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!ProductUpsellDuxo.this.hasSeenUpsell) {
                    ProductUpsellManager manager = ProductUpsellDuxo.this.getManager();
                    this.label = 1;
                } else {
                    if (!ProductUpsellDuxo.this.getManager().passesAdditionalCriteria()) {
                        ProductUpsellDuxo.this.applyMutation(new AnonymousClass1(null));
                    }
                    ProductUpsellDuxo productUpsellDuxo = ProductUpsellDuxo.this;
                    String str = productUpsellDuxo.upsellEntryId;
                    this.label = 2;
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
            ResultKt.throwOnFailure(obj);
            ProductUpsellDuxo.this.hasSeenUpsell = true;
            if (!ProductUpsellDuxo.this.getManager().passesAdditionalCriteria()) {
            }
            ProductUpsellDuxo productUpsellDuxo2 = ProductUpsellDuxo.this;
            String str2 = productUpsellDuxo2.upsellEntryId;
            this.label = 2;
        }

        /* compiled from: ProductUpsellDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/notification/data/ProductUpsellDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.notification.data.ProductUpsellDuxo$onResume$1$1", m3645f = "ProductUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.notification.data.ProductUpsellDuxo$onResume$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ProductUpsellDataState, Continuation<? super ProductUpsellDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ProductUpsellDataState productUpsellDataState, Continuation<? super ProductUpsellDataState> continuation) {
                return ((AnonymousClass1) create(productUpsellDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ProductUpsellDataState.copy$default((ProductUpsellDataState) this.L$0, false, null, true, false, 11, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C226011(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object retrieveInfo$feature_product_upsell_externalDebug(String str, Continuation<? super Unit> continuation) throws IOException {
        ProductUpsellDuxo$retrieveInfo$1 productUpsellDuxo$retrieveInfo$1;
        if (continuation instanceof ProductUpsellDuxo$retrieveInfo$1) {
            productUpsellDuxo$retrieveInfo$1 = (ProductUpsellDuxo$retrieveInfo$1) continuation;
            int i = productUpsellDuxo$retrieveInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productUpsellDuxo$retrieveInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                productUpsellDuxo$retrieveInfo$1 = new ProductUpsellDuxo$retrieveInfo$1(this, continuation);
            }
        }
        Object settings = productUpsellDuxo$retrieveInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = productUpsellDuxo$retrieveInfo$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(settings);
            CrashReporter.INSTANCE.log("Retrieving info for " + this.upsellKey.getContentfulIdentifier() + " with id " + this.upsellEntryId);
            ProductUpsellManager manager = getManager();
            productUpsellDuxo$retrieveInfo$1.L$0 = str;
            productUpsellDuxo$retrieveInfo$1.label = 1;
            settings = manager.getSettings(productUpsellDuxo$retrieveInfo$1);
            if (settings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) productUpsellDuxo$retrieveInfo$1.L$0;
            ResultKt.throwOnFailure(settings);
        }
        Loggable.debugLog("Current upsell settings: " + settings);
        applyMutation(new ProductUpsellDuxo$retrieveInfo$2(null));
        Single singleTimeout = SinglesKt.retryExponential(RxFactory.DefaultImpls.rxSingle$default(this, null, new ProductUpsellDuxo$retrieveInfo$3(this, str, null), 1, null), 3, new Function1() { // from class: com.robinhood.android.notification.data.ProductUpsellDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ProductUpsellDuxo.retrieveInfo$lambda$1((Throwable) obj));
            }
        }).timeout(5L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(singleTimeout, "timeout(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleTimeout, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.notification.data.ProductUpsellDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductUpsellDuxo.retrieveInfo$lambda$2(this.f$0, (ProductUpsellDataState) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.notification.data.ProductUpsellDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductUpsellDuxo.retrieveInfo$lambda$3(this.f$0, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retrieveInfo$lambda$1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Throwables.isNetworkRelated(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrieveInfo$lambda$2(ProductUpsellDuxo productUpsellDuxo, ProductUpsellDataState productUpsellDataState) {
        productUpsellDuxo.applyMutation(new ProductUpsellDuxo$retrieveInfo$5$1(productUpsellDataState, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrieveInfo$lambda$3(ProductUpsellDuxo productUpsellDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Throwables.isNetworkRelated(it)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 4, null);
        }
        productUpsellDuxo.applyMutation(new ProductUpsellDuxo$retrieveInfo$6$1(null));
        return Unit.INSTANCE;
    }

    public final Object fetchUpsellDetails$feature_product_upsell_externalDebug(String str, Continuation<? super ProductUpsellViewData> continuation) {
        return BuildersKt.withContext(this.dispatcher, new ProductUpsellDuxo$fetchUpsellDetails$2(this, str, null), continuation);
    }

    /* compiled from: ProductUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/notification/data/ProductUpsellDuxo;", "Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "<init>", "()V", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ProductUpsellDuxo, ProductUpsellKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ProductUpsellKey getArgs(SavedStateHandle savedStateHandle) {
            return (ProductUpsellKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ProductUpsellKey getArgs(ProductUpsellDuxo productUpsellDuxo) {
            return (ProductUpsellKey) DuxoCompanion.DefaultImpls.getArgs(this, productUpsellDuxo);
        }
    }

    /* compiled from: ProductUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellDuxo$NotificationUpsellStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/notification/data/ProductUpsellDataState;", "Lcom/robinhood/android/notification/data/ProductUpsellViewState;", "<init>", "()V", "reduce", "dataState", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NotificationUpsellStateProvider implements StateProvider<ProductUpsellDataState, ProductUpsellViewState> {
        public static final int $stable = 0;

        @Override // com.robinhood.android.udf.StateProvider
        public ProductUpsellViewState reduce(ProductUpsellDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getUpsellNotAllowed()) {
                return ProductUpsellViewState.Exit.INSTANCE;
            }
            if (dataState.getError()) {
                return ProductUpsellViewState.Error.INSTANCE;
            }
            if (dataState.getProductUpsell() != null) {
                return new ProductUpsellViewState.ContentReady(dataState.getProductUpsell());
            }
            return ProductUpsellViewState.Loading.INSTANCE;
        }
    }
}
