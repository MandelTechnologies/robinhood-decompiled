package com.robinhood.android.advisory.portfolio.restrictstocks;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.RestrictStocksFragmentKey;
import com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksEvent;
import com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass3;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioAsset;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioRegion;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSubAssetClassCategory;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.models.advisory.p304db.portfolio.RestrictedAsset;
import com.robinhood.models.advisory.p304db.portfolio.RestrictedStocksResponse;
import com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore;
import com.robinhood.store.advisory.RestrictStocksStore;
import com.robinhood.utils.extensions.Uuids;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RestrictStocksDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001eB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDataState;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksViewState;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "restrictStocksStore", "Lcom/robinhood/store/advisory/RestrictStocksStore;", "managedPortfolioStore", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/store/advisory/RestrictStocksStore;Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "updateSearchQuery", "query", "", "updateRestrictedAsset", "assetId", "assetName", "isRestricted", "", "Companion", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RestrictStocksDuxo extends BaseDuxo3<RestrictStocksDataState, RestrictStocksViewState, RestrictStocksEvent> implements HasSavedState {
    private final AdvisoryPortfolioBreakdownStore managedPortfolioStore;
    private final RestrictStocksStore restrictStocksStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictStocksDuxo(DuxoBundle duxoBundle, RestrictStocksStateProvider stateProvider, SavedStateHandle savedStateHandle, RestrictStocksStore restrictStocksStore, AdvisoryPortfolioBreakdownStore managedPortfolioStore) {
        super(new RestrictStocksDataState(null, null, null, null, null, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(restrictStocksStore, "restrictStocksStore");
        Intrinsics.checkNotNullParameter(managedPortfolioStore, "managedPortfolioStore");
        this.savedStateHandle = savedStateHandle;
        this.restrictStocksStore = restrictStocksStore;
        this.managedPortfolioStore = managedPortfolioStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C91831(((RestrictStocksFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber(), null));
    }

    /* compiled from: RestrictStocksDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1", m3645f = "RestrictStocksDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1 */
    static final class C91831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C91831(String str, Continuation<? super C91831> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C91831 c91831 = RestrictStocksDuxo.this.new C91831(this.$accountNumber, continuation);
            c91831.L$0 = obj;
            return c91831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C91831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(RestrictStocksDuxo.this, this.$accountNumber, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(RestrictStocksDuxo.this, this.$accountNumber, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(RestrictStocksDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: RestrictStocksDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$1", m3645f = "RestrictStocksDuxo.kt", m3646l = {56}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ RestrictStocksDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RestrictStocksDuxo restrictStocksDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = restrictStocksDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Set of = SetsKt.setOf((Object[]) new AssetClass3[]{AssetClass3.CASH, AssetClass3.OTHER, AssetClass3.UNSPECIFIED});
                    final Flow<ManagedPortfolioSummary> flowStreamManagedPortfolio = this.this$0.managedPortfolioStore.streamManagedPortfolio(this.$accountNumber);
                    Flow<List<? extends ManagedPortfolioAsset>> flow = new Flow<List<? extends ManagedPortfolioAsset>>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$1$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$1$invokeSuspend$$inlined$map$1$2 */
                        public static final class C91802<T> implements FlowCollector {
                            final /* synthetic */ Set $excludedRegions$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "RestrictStocksDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C91802.this.emit(null, this);
                                }
                            }

                            public C91802(FlowCollector flowCollector, Set set) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$excludedRegions$inlined = set;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    List<ManagedPortfolioRegion> regions = ((ManagedPortfolioSummary) obj).getRegions();
                                    ArrayList arrayList = new ArrayList();
                                    for (T t : regions) {
                                        if (!this.$excludedRegions$inlined.contains(((ManagedPortfolioRegion) t).getRegion())) {
                                            arrayList.add(t);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<T> it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        CollectionsKt.addAll(arrayList2, ((ManagedPortfolioRegion) it.next()).getSubAssetClassCategories());
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator<T> it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        CollectionsKt.addAll(arrayList3, ((ManagedPortfolioSubAssetClassCategory) it2.next()).getAssets());
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (T t2 : arrayList3) {
                                        if (((ManagedPortfolioAsset) t2).isRestrictable()) {
                                            arrayList4.add(t2);
                                        }
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(arrayList4, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends ManagedPortfolioAsset>> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamManagedPortfolio.collect(new C91802(flowCollector, of), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: RestrictStocksDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "managedPortfolioAssets", "", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioAsset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$1$2", m3645f = "RestrictStocksDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends ManagedPortfolioAsset>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ RestrictStocksDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(RestrictStocksDuxo restrictStocksDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = restrictStocksDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends ManagedPortfolioAsset> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<ManagedPortfolioAsset>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<ManagedPortfolioAsset> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: RestrictStocksDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$1$2$1", m3645f = "RestrictStocksDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C495951 extends ContinuationImpl7 implements Function2<RestrictStocksDataState, Continuation<? super RestrictStocksDataState>, Object> {
                    final /* synthetic */ List<ManagedPortfolioAsset> $managedPortfolioAssets;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495951(List<ManagedPortfolioAsset> list, Continuation<? super C495951> continuation) {
                        super(2, continuation);
                        this.$managedPortfolioAssets = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495951 c495951 = new C495951(this.$managedPortfolioAssets, continuation);
                        c495951.L$0 = obj;
                        return c495951;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(RestrictStocksDataState restrictStocksDataState, Continuation<? super RestrictStocksDataState> continuation) {
                        return ((C495951) create(restrictStocksDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return RestrictStocksDataState.copy$default((RestrictStocksDataState) this.L$0, null, null, this.$managedPortfolioAssets, null, null, 27, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495951((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: RestrictStocksDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$2", m3645f = "RestrictStocksDuxo.kt", m3646l = {64}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ RestrictStocksDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RestrictStocksDuxo restrictStocksDuxo, String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = restrictStocksDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: RestrictStocksDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/advisory/db/portfolio/RestrictedStocksResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$2$1", m3645f = "RestrictStocksDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RestrictedStocksResponse, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ RestrictStocksDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(RestrictStocksDuxo restrictStocksDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = restrictStocksDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RestrictedStocksResponse restrictedStocksResponse, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(restrictedStocksResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: RestrictStocksDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$2$1$1", m3645f = "RestrictStocksDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495961 extends ContinuationImpl7 implements Function2<RestrictStocksDataState, Continuation<? super RestrictStocksDataState>, Object> {
                    final /* synthetic */ RestrictedStocksResponse $response;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495961(RestrictedStocksResponse restrictedStocksResponse, Continuation<? super C495961> continuation) {
                        super(2, continuation);
                        this.$response = restrictedStocksResponse;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495961 c495961 = new C495961(this.$response, continuation);
                        c495961.L$0 = obj;
                        return c495961;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(RestrictStocksDataState restrictStocksDataState, Continuation<? super RestrictStocksDataState> continuation) {
                        return ((C495961) create(restrictStocksDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return RestrictStocksDataState.copy$default((RestrictStocksDataState) this.L$0, this.$response, null, null, null, null, 30, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495961((RestrictedStocksResponse) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<RestrictedStocksResponse> flowStreamRestrictedStocks = this.this$0.restrictStocksStore.streamRestrictedStocks(this.$accountNumber);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamRestrictedStocks, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: RestrictStocksDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3", m3645f = "RestrictStocksDuxo.kt", m3646l = {78}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RestrictStocksDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(RestrictStocksDuxo restrictStocksDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = restrictStocksDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<RestrictStocksViewState> stateFlow = this.this$0.getStateFlow();
                    final Flow<Object> flow = new Flow<Object>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$invokeSuspend$$inlined$filterIsInstance$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$invokeSuspend$$inlined$filterIsInstance$1$2", m3645f = "RestrictStocksDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (obj instanceof RestrictStocksViewState.Loaded) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2 */
                        public static final class C91822<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2", m3645f = "RestrictStocksDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C91822.this.emit(null, this);
                                }
                            }

                            public C91822(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    String searchQuery = ((RestrictStocksViewState.Loaded) obj).getSearchQuery();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(searchQuery, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C91822(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: RestrictStocksDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "query", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$2", m3645f = "RestrictStocksDuxo.kt", m3646l = {80}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ RestrictStocksDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(RestrictStocksDuxo restrictStocksDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = restrictStocksDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        String str = (String) this.L$0;
                        if (str.length() == 0) {
                            return Unit.INSTANCE;
                        }
                        RestrictStocksStore restrictStocksStore = this.this$0.restrictStocksStore;
                        this.label = 1;
                        obj = restrictStocksStore.searchRestrictableStocks(str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.this$0.applyMutation(new AnonymousClass1((List) obj, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: RestrictStocksDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$2$1", m3645f = "RestrictStocksDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$onStart$1$3$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RestrictStocksDataState, Continuation<? super RestrictStocksDataState>, Object> {
                    final /* synthetic */ List<RestrictedAsset> $assets;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<RestrictedAsset> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$assets = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$assets, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(RestrictStocksDataState restrictStocksDataState, Continuation<? super RestrictStocksDataState> continuation) {
                        return ((AnonymousClass1) create(restrictStocksDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return RestrictStocksDataState.copy$default((RestrictStocksDataState) this.L$0, null, this.$assets, null, null, null, 29, null);
                    }
                }
            }
        }
    }

    /* compiled from: RestrictStocksDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$updateSearchQuery$1", m3645f = "RestrictStocksDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$updateSearchQuery$1 */
    static final class C91851 extends ContinuationImpl7 implements Function2<RestrictStocksDataState, Continuation<? super RestrictStocksDataState>, Object> {
        final /* synthetic */ String $query;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C91851(String str, Continuation<? super C91851> continuation) {
            super(2, continuation);
            this.$query = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C91851 c91851 = new C91851(this.$query, continuation);
            c91851.L$0 = obj;
            return c91851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RestrictStocksDataState restrictStocksDataState, Continuation<? super RestrictStocksDataState> continuation) {
            return ((C91851) create(restrictStocksDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RestrictStocksDataState.copy$default((RestrictStocksDataState) this.L$0, null, null, null, this.$query, null, 23, null);
        }
    }

    public final void updateSearchQuery(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        applyMutation(new C91851(query, null));
    }

    public final void updateRestrictedAsset(final String assetId, String assetName, boolean isRestricted) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        withDataState(new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RestrictStocksDuxo.updateRestrictedAsset$lambda$1(booleanRef, booleanRef2, assetId, (RestrictStocksDataState) obj);
            }
        });
        if (booleanRef.element) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C91842(assetId, isRestricted, assetName, booleanRef2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateRestrictedAsset$lambda$1(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, String str, RestrictStocksDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        String strIsUpdatingAssetId = ds.isUpdatingAssetId();
        boolean z = true;
        if (strIsUpdatingAssetId != null && strIsUpdatingAssetId.length() != 0) {
            booleanRef.element = true;
        }
        List<ManagedPortfolioAsset> managedPortfolioAssets = ds.getManagedPortfolioAssets();
        if ((managedPortfolioAssets instanceof Collection) && managedPortfolioAssets.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = managedPortfolioAssets.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(Uuids.safeToString(((ManagedPortfolioAsset) it.next()).getId()), str)) {
                    break;
                }
            }
            z = false;
        }
        booleanRef2.element = z;
        return Unit.INSTANCE;
    }

    /* compiled from: RestrictStocksDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$updateRestrictedAsset$2", m3645f = "RestrictStocksDuxo.kt", m3646l = {120, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$updateRestrictedAsset$2 */
    static final class C91842 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $assetId;
        final /* synthetic */ String $assetName;
        final /* synthetic */ Ref.BooleanRef $isAssetInPortfolio;
        final /* synthetic */ boolean $isRestricted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C91842(String str, boolean z, String str2, Ref.BooleanRef booleanRef, Continuation<? super C91842> continuation) {
            super(2, continuation);
            this.$assetId = str;
            this.$isRestricted = z;
            this.$assetName = str2;
            this.$isAssetInPortfolio = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RestrictStocksDuxo.this.new C91842(this.$assetId, this.$isRestricted, this.$assetName, this.$isAssetInPortfolio, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C91842) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        
            if (r8.updateRestrictedStocks(r1, r3, r5, r7) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            RestrictStocksDuxo restrictStocksDuxo;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (Exception unused) {
                    RestrictStocksDuxo.this.submit(new RestrictStocksEvent.RestrictionError(this.$isRestricted, this.$assetId, this.$assetName));
                    restrictStocksDuxo = RestrictStocksDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RestrictStocksDuxo.this.applyMutation(new AnonymousClass1(this.$assetId, null));
                    this.label = 1;
                    if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.$isRestricted) {
                        RestrictStocksDuxo.this.submit(new RestrictStocksEvent.RestrictionSuccess(this.$assetId, this.$assetName, this.$isAssetInPortfolio.element));
                    }
                    restrictStocksDuxo = RestrictStocksDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                    restrictStocksDuxo.applyMutation(anonymousClass2);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                RestrictStocksStore restrictStocksStore = RestrictStocksDuxo.this.restrictStocksStore;
                String accountNumber = ((RestrictStocksFragmentKey) RestrictStocksDuxo.INSTANCE.getArgs((HasSavedState) RestrictStocksDuxo.this)).getAccountNumber();
                String str = this.$assetId;
                boolean z = this.$isRestricted;
                this.label = 2;
            } catch (Throwable th) {
                RestrictStocksDuxo.this.applyMutation(new AnonymousClass2(null));
                throw th;
            }
        }

        /* compiled from: RestrictStocksDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$updateRestrictedAsset$2$1", m3645f = "RestrictStocksDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$updateRestrictedAsset$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RestrictStocksDataState, Continuation<? super RestrictStocksDataState>, Object> {
            final /* synthetic */ String $assetId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$assetId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$assetId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RestrictStocksDataState restrictStocksDataState, Continuation<? super RestrictStocksDataState> continuation) {
                return ((AnonymousClass1) create(restrictStocksDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RestrictStocksDataState.copy$default((RestrictStocksDataState) this.L$0, null, null, null, null, this.$assetId, 15, null);
            }
        }

        /* compiled from: RestrictStocksDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$updateRestrictedAsset$2$2", m3645f = "RestrictStocksDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksDuxo$updateRestrictedAsset$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<RestrictStocksDataState, Continuation<? super RestrictStocksDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RestrictStocksDataState restrictStocksDataState, Continuation<? super RestrictStocksDataState> continuation) {
                return ((AnonymousClass2) create(restrictStocksDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RestrictStocksDataState.copy$default((RestrictStocksDataState) this.L$0, null, null, null, null, null, 15, null);
            }
        }
    }

    /* compiled from: RestrictStocksDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDuxo;", "Lcom/robinhood/android/advisory/contracts/RestrictStocksFragmentKey;", "<init>", "()V", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RestrictStocksDuxo, RestrictStocksFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RestrictStocksFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (RestrictStocksFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RestrictStocksFragmentKey getArgs(RestrictStocksDuxo restrictStocksDuxo) {
            return (RestrictStocksFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, restrictStocksDuxo);
        }
    }
}
