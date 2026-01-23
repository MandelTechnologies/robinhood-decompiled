package com.robinhood.android.indexes.detail.components.topbaraction;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.detail.component.topbaraction.DetailPageAddToWatchlistActionViewState;
import com.robinhood.android.indexes.detail.IndexDetailPageFragment;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: IndexDetailPageAddToWatchlistActionDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/topbaraction/IndexDetailPageAddToWatchlistActionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/indexes/detail/components/topbaraction/IndexDetailPageAddToWatchlistActionDataState;", "Lcom/robinhood/android/common/detail/component/topbaraction/DetailPageAddToWatchlistActionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "listItemIdToUserListStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/topbaraction/IndexDetailPageAddToWatchlistActionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;Lcom/robinhood/android/indexes/detail/components/topbaraction/IndexDetailPageAddToWatchlistActionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageAddToWatchlistActionDuxo extends BaseDuxo<IndexDetailPageAddToWatchlistActionDataState, DetailPageAddToWatchlistActionViewState> implements HasSavedState {
    private final IndexStore indexStore;
    private final ListItemIdToUserListIdsStore listItemIdToUserListStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexDetailPageAddToWatchlistActionDuxo(SavedStateHandle savedStateHandle, IndexStore indexStore, ListItemIdToUserListIdsStore listItemIdToUserListStore, IndexDetailPageAddToWatchlistActionStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new IndexDetailPageAddToWatchlistActionDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(listItemIdToUserListStore, "listItemIdToUserListStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.indexStore = indexStore;
        this.listItemIdToUserListStore = listItemIdToUserListStore;
    }

    /* compiled from: IndexDetailPageAddToWatchlistActionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$1", m3645f = "IndexDetailPageAddToWatchlistActionDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$1 */
    static final class C188591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188591(Continuation<? super C188591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageAddToWatchlistActionDuxo.this.new C188591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Index> flowStreamIndex = IndexDetailPageAddToWatchlistActionDuxo.this.indexStore.streamIndex(((IndexDetailPageFragment.Args) IndexDetailPageAddToWatchlistActionDuxo.INSTANCE.getArgs((HasSavedState) IndexDetailPageAddToWatchlistActionDuxo.this)).getIndexId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IndexDetailPageAddToWatchlistActionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamIndex, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageAddToWatchlistActionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$1$1", m3645f = "IndexDetailPageAddToWatchlistActionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Index, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageAddToWatchlistActionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageAddToWatchlistActionDuxo indexDetailPageAddToWatchlistActionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageAddToWatchlistActionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Index index, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(index, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageAddToWatchlistActionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/topbaraction/IndexDetailPageAddToWatchlistActionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$1$1$1", m3645f = "IndexDetailPageAddToWatchlistActionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502051 extends ContinuationImpl7 implements Function2<IndexDetailPageAddToWatchlistActionDataState, Continuation<? super IndexDetailPageAddToWatchlistActionDataState>, Object> {
                final /* synthetic */ Index $index;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502051(Index index, Continuation<? super C502051> continuation) {
                    super(2, continuation);
                    this.$index = index;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502051 c502051 = new C502051(this.$index, continuation);
                    c502051.L$0 = obj;
                    return c502051;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageAddToWatchlistActionDataState indexDetailPageAddToWatchlistActionDataState, Continuation<? super IndexDetailPageAddToWatchlistActionDataState> continuation) {
                    return ((C502051) create(indexDetailPageAddToWatchlistActionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageAddToWatchlistActionDataState.copy$default((IndexDetailPageAddToWatchlistActionDataState) this.L$0, this.$index, null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502051((Index) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C188591(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C188602(null));
    }

    /* compiled from: IndexDetailPageAddToWatchlistActionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$2", m3645f = "IndexDetailPageAddToWatchlistActionDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$2 */
    static final class C188602 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188602(Continuation<? super C188602> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageAddToWatchlistActionDuxo.this.new C188602(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188602) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(IndexDetailPageAddToWatchlistActionDuxo.this.listItemIdToUserListStore.stream(((IndexDetailPageFragment.Args) IndexDetailPageAddToWatchlistActionDuxo.INSTANCE.getArgs((HasSavedState) IndexDetailPageAddToWatchlistActionDuxo.this)).getIndexId())), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IndexDetailPageAddToWatchlistActionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageAddToWatchlistActionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uuidList", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$2$1", m3645f = "IndexDetailPageAddToWatchlistActionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageAddToWatchlistActionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageAddToWatchlistActionDuxo indexDetailPageAddToWatchlistActionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageAddToWatchlistActionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Continuation<? super Unit> continuation) {
                return invoke2((List<UUID>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UUID> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageAddToWatchlistActionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/topbaraction/IndexDetailPageAddToWatchlistActionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$2$1$1", m3645f = "IndexDetailPageAddToWatchlistActionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502061 extends ContinuationImpl7 implements Function2<IndexDetailPageAddToWatchlistActionDataState, Continuation<? super IndexDetailPageAddToWatchlistActionDataState>, Object> {
                final /* synthetic */ List<UUID> $uuidList;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502061(List<UUID> list, Continuation<? super C502061> continuation) {
                    super(2, continuation);
                    this.$uuidList = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502061 c502061 = new C502061(this.$uuidList, continuation);
                    c502061.L$0 = obj;
                    return c502061;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageAddToWatchlistActionDataState indexDetailPageAddToWatchlistActionDataState, Continuation<? super IndexDetailPageAddToWatchlistActionDataState> continuation) {
                    return ((C502061) create(indexDetailPageAddToWatchlistActionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageAddToWatchlistActionDataState.copy$default((IndexDetailPageAddToWatchlistActionDataState) this.L$0, null, this.$uuidList, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502061((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexDetailPageAddToWatchlistActionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/topbaraction/IndexDetailPageAddToWatchlistActionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/indexes/detail/components/topbaraction/IndexDetailPageAddToWatchlistActionDuxo;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Args;", "<init>", "()V", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IndexDetailPageAddToWatchlistActionDuxo, IndexDetailPageFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndexDetailPageFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (IndexDetailPageFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndexDetailPageFragment.Args getArgs(IndexDetailPageAddToWatchlistActionDuxo indexDetailPageAddToWatchlistActionDuxo) {
            return (IndexDetailPageFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, indexDetailPageAddToWatchlistActionDuxo);
        }
    }
}
