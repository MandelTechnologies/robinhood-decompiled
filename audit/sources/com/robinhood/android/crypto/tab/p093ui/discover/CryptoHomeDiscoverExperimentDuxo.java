package com.robinhood.android.crypto.tab.p093ui.discover;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExploreCategoryStore;
import com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.api.trading.CryptoTradingAssetType;
import com.robinhood.models.api.trading.CryptoTradingOptionsCategory;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreCategories;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoHomeDiscoverExperimentDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002#$B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001c\u0010\u001b\u001a\u00020\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0002J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDataState;", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDuxo$InitArgs;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoExploreCategoryStore", "Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore;", "cryptoTradingOptionsStore", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore;Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "args", "onCreate", "", "onCategoriesLoad", "categoriesResponse", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "onTradingOptionsLoad", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "Lkotlin/Pair;", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;", "selectCategory", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "InitArgs", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeDiscoverExperimentDuxo extends BaseDuxo<CryptoHomeDiscoverExperimentDataState, CryptoHomeDiscoverExperimentViewState> implements HasSavedState, HasArgs<InitArgs> {
    private final InitArgs args;
    private final CryptoExploreCategoryStore cryptoExploreCategoryStore;
    private final CryptoTradingOptionsStore cryptoTradingOptionsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoHomeDiscoverExperimentDuxo(SavedStateHandle savedStateHandle, CryptoExploreCategoryStore cryptoExploreCategoryStore, CryptoTradingOptionsStore cryptoTradingOptionsStore, CryptoHomeDiscoverExperimentStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoExploreCategoryStore, "cryptoExploreCategoryStore");
        Intrinsics.checkNotNullParameter(cryptoTradingOptionsStore, "cryptoTradingOptionsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        int initialCategoryIndex = ((InitArgs) companion.getArgs(savedStateHandle)).getInitialCategoryIndex();
        Map map = null;
        super(new CryptoHomeDiscoverExperimentDataState(map, ((InitArgs) companion.getArgs(savedStateHandle)).getCategoryResponse(), ((InitArgs) companion.getArgs(savedStateHandle)).getOnlyShowPreviewItems(), initialCategoryIndex, 1, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.cryptoExploreCategoryStore = cryptoExploreCategoryStore;
        this.cryptoTradingOptionsStore = cryptoTradingOptionsStore;
        this.args = (InitArgs) getArgs(getSavedStateHandle());
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C131091(null));
    }

    /* compiled from: CryptoHomeDiscoverExperimentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCreate$1", m3645f = "CryptoHomeDiscoverExperimentDuxo.kt", m3646l = {88}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCreate$1 */
    static final class C131091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C131091(Continuation<? super C131091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeDiscoverExperimentDuxo.this.new C131091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C131091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Flow<CryptoExploreCategories> cryptoExploreCategories;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (CryptoHomeDiscoverExperimentDuxo.this.args.getCategoryResponse() != null) {
                    cryptoExploreCategories = FlowKt.flowOf(CryptoHomeDiscoverExperimentDuxo.this.args.getCategoryResponse());
                } else {
                    cryptoExploreCategories = CryptoHomeDiscoverExperimentDuxo.this.cryptoExploreCategoryStore.getCryptoExploreCategories(CryptoTradingAssetType.CRYPTO, CryptoTradingOptionsLocation.DISCOVER_COINS);
                }
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.onEach(FlowKt.distinctUntilChanged(cryptoExploreCategories), new CryptoHomeDiscoverExperimentDuxo3(CryptoHomeDiscoverExperimentDuxo.this)), new C13107x97839260(null, CryptoHomeDiscoverExperimentDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoHomeDiscoverExperimentDuxo.this);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$onCategoriesLoad(CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, CryptoExploreCategories cryptoExploreCategories, Continuation continuation) {
            cryptoHomeDiscoverExperimentDuxo.onCategoriesLoad(cryptoExploreCategories);
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoHomeDiscoverExperimentDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCreate$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements Function2<Tuples2<? extends CryptoTradingOptionsCategory, ? extends CryptoTradingOptions>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass2(Object obj) {
                super(2, obj, CryptoHomeDiscoverExperimentDuxo.class, "onTradingOptionsLoad", "onTradingOptionsLoad(Lkotlin/Pair;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CryptoTradingOptionsCategory, ? extends CryptoTradingOptions> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<CryptoTradingOptionsCategory, CryptoTradingOptions>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<CryptoTradingOptionsCategory, CryptoTradingOptions> tuples2, Continuation<? super Unit> continuation) {
                return C131091.invokeSuspend$onTradingOptionsLoad((CryptoHomeDiscoverExperimentDuxo) this.receiver, tuples2, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$onTradingOptionsLoad(CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, Tuples2 tuples2, Continuation continuation) {
            cryptoHomeDiscoverExperimentDuxo.onTradingOptionsLoad(tuples2);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoHomeDiscoverExperimentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCategoriesLoad$1", m3645f = "CryptoHomeDiscoverExperimentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCategoriesLoad$1 */
    static final class C131081 extends ContinuationImpl7 implements Function2<CryptoHomeDiscoverExperimentDataState, Continuation<? super CryptoHomeDiscoverExperimentDataState>, Object> {
        final /* synthetic */ CryptoExploreCategories $categoriesResponse;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C131081(CryptoExploreCategories cryptoExploreCategories, Continuation<? super C131081> continuation) {
            super(2, continuation);
            this.$categoriesResponse = cryptoExploreCategories;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C131081 c131081 = new C131081(this.$categoriesResponse, continuation);
            c131081.L$0 = obj;
            return c131081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoHomeDiscoverExperimentDataState cryptoHomeDiscoverExperimentDataState, Continuation<? super CryptoHomeDiscoverExperimentDataState> continuation) {
            return ((C131081) create(cryptoHomeDiscoverExperimentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoHomeDiscoverExperimentDataState.copy$default((CryptoHomeDiscoverExperimentDataState) this.L$0, null, this.$categoriesResponse, false, 0, 13, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCategoriesLoad(CryptoExploreCategories categoriesResponse) {
        applyMutation(new C131081(categoriesResponse, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTradingOptionsLoad(Tuples2<CryptoTradingOptionsCategory, CryptoTradingOptions> pair) {
        applyMutation(new C131111(pair.component1(), pair.component2(), null));
    }

    /* compiled from: CryptoHomeDiscoverExperimentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onTradingOptionsLoad$1", m3645f = "CryptoHomeDiscoverExperimentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onTradingOptionsLoad$1 */
    static final class C131111 extends ContinuationImpl7 implements Function2<CryptoHomeDiscoverExperimentDataState, Continuation<? super CryptoHomeDiscoverExperimentDataState>, Object> {
        final /* synthetic */ CryptoTradingOptionsCategory $category;
        final /* synthetic */ CryptoTradingOptions $tradingOptions;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C131111(CryptoTradingOptionsCategory cryptoTradingOptionsCategory, CryptoTradingOptions cryptoTradingOptions, Continuation<? super C131111> continuation) {
            super(2, continuation);
            this.$category = cryptoTradingOptionsCategory;
            this.$tradingOptions = cryptoTradingOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C131111 c131111 = new C131111(this.$category, this.$tradingOptions, continuation);
            c131111.L$0 = obj;
            return c131111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoHomeDiscoverExperimentDataState cryptoHomeDiscoverExperimentDataState, Continuation<? super CryptoHomeDiscoverExperimentDataState> continuation) {
            return ((C131111) create(cryptoHomeDiscoverExperimentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoHomeDiscoverExperimentDataState cryptoHomeDiscoverExperimentDataState = (CryptoHomeDiscoverExperimentDataState) this.L$0;
            return CryptoHomeDiscoverExperimentDataState.copy$default(cryptoHomeDiscoverExperimentDataState, MapsKt.plus(cryptoHomeDiscoverExperimentDataState.getCategoryToOptionsResponse(), Tuples4.m3642to(this.$category, this.$tradingOptions)), null, false, 0, 14, null);
        }
    }

    /* compiled from: CryptoHomeDiscoverExperimentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$selectCategory$1", m3645f = "CryptoHomeDiscoverExperimentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$selectCategory$1 */
    static final class C131121 extends ContinuationImpl7 implements Function2<CryptoHomeDiscoverExperimentDataState, Continuation<? super CryptoHomeDiscoverExperimentDataState>, Object> {
        final /* synthetic */ int $index;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C131121(int i, Continuation<? super C131121> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C131121 c131121 = new C131121(this.$index, continuation);
            c131121.L$0 = obj;
            return c131121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoHomeDiscoverExperimentDataState cryptoHomeDiscoverExperimentDataState, Continuation<? super CryptoHomeDiscoverExperimentDataState> continuation) {
            return ((C131121) create(cryptoHomeDiscoverExperimentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoHomeDiscoverExperimentDataState.copy$default((CryptoHomeDiscoverExperimentDataState) this.L$0, null, null, false, this.$index, 7, null);
        }
    }

    public final void selectCategory(int index) {
        applyMutation(new C131121(index, null));
    }

    /* compiled from: CryptoHomeDiscoverExperimentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0005J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDuxo$InitArgs;", "Landroid/os/Parcelable;", "onlyShowPreviewItems", "", "initialCategoryIndex", "", "categoryResponse", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "<init>", "(ZILcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;)V", "getOnlyShowPreviewItems", "()Z", "getInitialCategoryIndex", "()I", "getCategoryResponse", "()Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final CryptoExploreCategories categoryResponse;
        private final int initialCategoryIndex;
        private final boolean onlyShowPreviewItems;

        /* compiled from: CryptoHomeDiscoverExperimentDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs(parcel.readInt() != 0, parcel.readInt(), (CryptoExploreCategories) parcel.readParcelable(InitArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, boolean z, int i, CryptoExploreCategories cryptoExploreCategories, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = initArgs.onlyShowPreviewItems;
            }
            if ((i2 & 2) != 0) {
                i = initArgs.initialCategoryIndex;
            }
            if ((i2 & 4) != 0) {
                cryptoExploreCategories = initArgs.categoryResponse;
            }
            return initArgs.copy(z, i, cryptoExploreCategories);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getOnlyShowPreviewItems() {
            return this.onlyShowPreviewItems;
        }

        /* renamed from: component2, reason: from getter */
        public final int getInitialCategoryIndex() {
            return this.initialCategoryIndex;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoExploreCategories getCategoryResponse() {
            return this.categoryResponse;
        }

        public final InitArgs copy(boolean onlyShowPreviewItems, int initialCategoryIndex, CryptoExploreCategories categoryResponse) {
            return new InitArgs(onlyShowPreviewItems, initialCategoryIndex, categoryResponse);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitArgs)) {
                return false;
            }
            InitArgs initArgs = (InitArgs) other;
            return this.onlyShowPreviewItems == initArgs.onlyShowPreviewItems && this.initialCategoryIndex == initArgs.initialCategoryIndex && Intrinsics.areEqual(this.categoryResponse, initArgs.categoryResponse);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.onlyShowPreviewItems) * 31) + Integer.hashCode(this.initialCategoryIndex)) * 31;
            CryptoExploreCategories cryptoExploreCategories = this.categoryResponse;
            return iHashCode + (cryptoExploreCategories == null ? 0 : cryptoExploreCategories.hashCode());
        }

        public String toString() {
            return "InitArgs(onlyShowPreviewItems=" + this.onlyShowPreviewItems + ", initialCategoryIndex=" + this.initialCategoryIndex + ", categoryResponse=" + this.categoryResponse + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.onlyShowPreviewItems ? 1 : 0);
            dest.writeInt(this.initialCategoryIndex);
            dest.writeParcelable(this.categoryResponse, flags);
        }

        public InitArgs(boolean z, int i, CryptoExploreCategories cryptoExploreCategories) {
            this.onlyShowPreviewItems = z;
            this.initialCategoryIndex = i;
            this.categoryResponse = cryptoExploreCategories;
        }

        public /* synthetic */ InitArgs(boolean z, int i, CryptoExploreCategories cryptoExploreCategories, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : cryptoExploreCategories);
        }

        public final boolean getOnlyShowPreviewItems() {
            return this.onlyShowPreviewItems;
        }

        public final int getInitialCategoryIndex() {
            return this.initialCategoryIndex;
        }

        public final CryptoExploreCategories getCategoryResponse() {
            return this.categoryResponse;
        }
    }

    /* compiled from: CryptoHomeDiscoverExperimentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDuxo;", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDuxo$InitArgs;", "<init>", "()V", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoHomeDiscoverExperimentDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoHomeDiscoverExperimentDuxo);
        }
    }
}
