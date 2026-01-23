package com.robinhood.android.feature.margin.maintenance.table;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import bonfire.proto.idl.margin.p036v1.MarginTableRowDto;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.margin.hub.MarginHubStore;
import com.robinhood.android.lib.margin.hub.p168db.models.MarginMaintenanceTableView;
import com.robinhood.android.margin.contracts.MarginMaintenanceTableFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MarginMaintenanceTableDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDataState;", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState;", "Lcom/robinhood/android/udf/HasSavedState;", PlaceTypes.STORE, "Lcom/robinhood/android/lib/margin/hub/MarginHubStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/margin/hub/MarginHubStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getStore", "()Lcom/robinhood/android/lib/margin/hub/MarginHubStore;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "init", "Lkotlinx/coroutines/Job;", "refresh", "sortParams", "Lcom/robinhood/android/lib/margin/hub/MarginHubStore$MarginMaintenanceTableSortParams;", "toggleIsExpanded", "toggleKey", "", "Companion", "feature-margin-maintenance-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class MarginMaintenanceTableDuxo extends BaseDuxo<MarginMaintenanceTableDataState, MarginMaintenanceTableState4> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final MarginHubStore store;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final MarginHubStore getStore() {
        return this.store;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginMaintenanceTableDuxo(MarginHubStore store, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new MarginMaintenanceTableDataState(null, null, null, null, 15, null), new MarginMaintenanceTableState3(), duxoBundle);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.store = store;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: MarginMaintenanceTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$onCreate$1", m3645f = "MarginMaintenanceTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$onCreate$1 */
    static final class C168801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C168801(Continuation<? super C168801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginMaintenanceTableDuxo.this.new C168801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarginMaintenanceTableDuxo.this.init();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C168801(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C168812(null));
    }

    /* compiled from: MarginMaintenanceTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$onCreate$2", m3645f = "MarginMaintenanceTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$onCreate$2 */
    static final class C168812 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C168812(Continuation<? super C168812> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginMaintenanceTableDuxo.this.new C168812(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarginMaintenanceTableDuxo.refresh$default(MarginMaintenanceTableDuxo.this, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MarginMaintenanceTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$init$1", m3645f = "MarginMaintenanceTableDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$init$1 */
    static final class C168791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C168791(Continuation<? super C168791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginMaintenanceTableDuxo.this.new C168791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<MarginMaintenanceTableView> flowStreamMarginMaintenanceTable = MarginMaintenanceTableDuxo.this.getStore().streamMarginMaintenanceTable(((MarginMaintenanceTableFragmentKey) MarginMaintenanceTableDuxo.INSTANCE.getArgs((HasSavedState) MarginMaintenanceTableDuxo.this)).getAccountNumber());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarginMaintenanceTableDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamMarginMaintenanceTable, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                MarginMaintenanceTableDuxo.this.applyMutation(new AnonymousClass2(e, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: MarginMaintenanceTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tableView", "Lcom/robinhood/android/lib/margin/hub/db/models/MarginMaintenanceTableView;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$init$1$1", m3645f = "MarginMaintenanceTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$init$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginMaintenanceTableView, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MarginMaintenanceTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MarginMaintenanceTableDuxo marginMaintenanceTableDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = marginMaintenanceTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginMaintenanceTableView marginMaintenanceTableView, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(marginMaintenanceTableView, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MarginMaintenanceTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$init$1$1$1", m3645f = "MarginMaintenanceTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$init$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500851 extends ContinuationImpl7 implements Function2<MarginMaintenanceTableDataState, Continuation<? super MarginMaintenanceTableDataState>, Object> {
                final /* synthetic */ MarginMaintenanceTableView $tableView;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500851(MarginMaintenanceTableView marginMaintenanceTableView, Continuation<? super C500851> continuation) {
                    super(2, continuation);
                    this.$tableView = marginMaintenanceTableView;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500851 c500851 = new C500851(this.$tableView, continuation);
                    c500851.L$0 = obj;
                    return c500851;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarginMaintenanceTableDataState marginMaintenanceTableDataState, Continuation<? super MarginMaintenanceTableDataState> continuation) {
                    return ((C500851) create(marginMaintenanceTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    MarginMaintenanceTableDataState marginMaintenanceTableDataState = (MarginMaintenanceTableDataState) this.L$0;
                    MarginMaintenanceTableView marginMaintenanceTableView = this.$tableView;
                    Map<String, Boolean> mapIsRowExpanded = marginMaintenanceTableDataState.isRowExpanded();
                    if (mapIsRowExpanded == null) {
                        List<MarginTableRowDto> rows = this.$tableView.getRows();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(rows, 10)), 16));
                        Iterator<T> it = rows.iterator();
                        while (it.hasNext()) {
                            Tuples2 tuples2M3642to = Tuples4.m3642to(((MarginTableRowDto) it.next()).getInstrument_id(), boxing.boxBoolean(false));
                            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                        }
                        mapIsRowExpanded = MapsKt.toMap(linkedHashMap);
                    }
                    return MarginMaintenanceTableDataState.copy$default(marginMaintenanceTableDataState, marginMaintenanceTableView, mapIsRowExpanded, null, null, 12, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C500851((MarginMaintenanceTableView) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: MarginMaintenanceTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$init$1$2", m3645f = "MarginMaintenanceTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$init$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MarginMaintenanceTableDataState, Continuation<? super MarginMaintenanceTableDataState>, Object> {
            final /* synthetic */ Exception $error;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$error = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$error, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginMaintenanceTableDataState marginMaintenanceTableDataState, Continuation<? super MarginMaintenanceTableDataState> continuation) {
                return ((AnonymousClass2) create(marginMaintenanceTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginMaintenanceTableDataState.copy$default((MarginMaintenanceTableDataState) this.L$0, null, null, null, this.$error, 7, null);
            }
        }
    }

    public final Job init() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C168791(null), 3, null);
    }

    public static /* synthetic */ Job refresh$default(MarginMaintenanceTableDuxo marginMaintenanceTableDuxo, MarginHubStore.MarginMaintenanceTableSortParams marginMaintenanceTableSortParams, int i, Object obj) {
        if ((i & 1) != 0) {
            marginMaintenanceTableSortParams = null;
        }
        return marginMaintenanceTableDuxo.refresh(marginMaintenanceTableSortParams);
    }

    /* compiled from: MarginMaintenanceTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$refresh$1", m3645f = "MarginMaintenanceTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$refresh$1 */
    static final class C168821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MarginHubStore.MarginMaintenanceTableSortParams $sortParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C168821(MarginHubStore.MarginMaintenanceTableSortParams marginMaintenanceTableSortParams, Continuation<? super C168821> continuation) {
            super(2, continuation);
            this.$sortParams = marginMaintenanceTableSortParams;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginMaintenanceTableDuxo.this.new C168821(this.$sortParams, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MarginHubStore store = MarginMaintenanceTableDuxo.this.getStore();
                    String accountNumber = ((MarginMaintenanceTableFragmentKey) MarginMaintenanceTableDuxo.INSTANCE.getArgs((HasSavedState) MarginMaintenanceTableDuxo.this)).getAccountNumber();
                    MarginHubStore.MarginMaintenanceTableSortParams marginMaintenanceTableSortParams = this.$sortParams;
                    this.label = 1;
                    if (store.refreshMarginMaintenanceTable(accountNumber, marginMaintenanceTableSortParams, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                MarginMaintenanceTableDuxo.this.applyMutation(new AnonymousClass1(e, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: MarginMaintenanceTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$refresh$1$1", m3645f = "MarginMaintenanceTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$refresh$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginMaintenanceTableDataState, Continuation<? super MarginMaintenanceTableDataState>, Object> {
            final /* synthetic */ Exception $error;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Exception exc, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$error = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$error, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginMaintenanceTableDataState marginMaintenanceTableDataState, Continuation<? super MarginMaintenanceTableDataState> continuation) {
                return ((AnonymousClass1) create(marginMaintenanceTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginMaintenanceTableDataState.copy$default((MarginMaintenanceTableDataState) this.L$0, null, null, null, this.$error, 7, null);
            }
        }
    }

    public final Job refresh(MarginHubStore.MarginMaintenanceTableSortParams sortParams) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C168821(sortParams, null), 3, null);
    }

    /* compiled from: MarginMaintenanceTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$toggleIsExpanded$1", m3645f = "MarginMaintenanceTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$toggleIsExpanded$1 */
    static final class C168831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $toggleKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C168831(String str, Continuation<? super C168831> continuation) {
            super(2, continuation);
            this.$toggleKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginMaintenanceTableDuxo.this.new C168831(this.$toggleKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarginMaintenanceTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$toggleIsExpanded$1$1", m3645f = "MarginMaintenanceTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableDuxo$toggleIsExpanded$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginMaintenanceTableDataState, Continuation<? super MarginMaintenanceTableDataState>, Object> {
            final /* synthetic */ String $toggleKey;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$toggleKey = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$toggleKey, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginMaintenanceTableDataState marginMaintenanceTableDataState, Continuation<? super MarginMaintenanceTableDataState> continuation) {
                return ((AnonymousClass1) create(marginMaintenanceTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                LinkedHashMap linkedHashMap;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MarginMaintenanceTableDataState marginMaintenanceTableDataState = (MarginMaintenanceTableDataState) this.L$0;
                Map<String, Boolean> mapIsRowExpanded = marginMaintenanceTableDataState.isRowExpanded();
                if (mapIsRowExpanded != null) {
                    String str = this.$toggleKey;
                    linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapIsRowExpanded.size()));
                    Iterator<T> it = mapIsRowExpanded.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        String str2 = (String) entry.getKey();
                        boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                        boolean z = false;
                        if (Intrinsics.areEqual(str2, str)) {
                            if (!zBooleanValue) {
                                z = true;
                            }
                        } else if (zBooleanValue) {
                        }
                        linkedHashMap.put(key, boxing.boxBoolean(z));
                    }
                } else {
                    linkedHashMap = null;
                }
                return MarginMaintenanceTableDataState.copy$default(marginMaintenanceTableDataState, null, linkedHashMap, null, null, 13, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MarginMaintenanceTableDuxo.this.applyMutation(new AnonymousClass1(this.$toggleKey, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Job toggleIsExpanded(String toggleKey) {
        Intrinsics.checkNotNullParameter(toggleKey, "toggleKey");
        return BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C168831(toggleKey, null), 3, null);
    }

    /* compiled from: MarginMaintenanceTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDuxo;", "Lcom/robinhood/android/margin/contracts/MarginMaintenanceTableFragmentKey;", "<init>", "()V", "feature-margin-maintenance-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarginMaintenanceTableDuxo, MarginMaintenanceTableFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginMaintenanceTableFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (MarginMaintenanceTableFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginMaintenanceTableFragmentKey getArgs(MarginMaintenanceTableDuxo marginMaintenanceTableDuxo) {
            return (MarginMaintenanceTableFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, marginMaintenanceTableDuxo);
        }
    }
}
