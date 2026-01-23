package com.robinhood.android.indexes.detail.components.relatedlist;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListViewState;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.indexes.detail.IndexDetailPageFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.shared.store.lists.store.CuratedListRelatedIndustriesStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
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
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: IndexDetailPageRelatedListDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListDataState;", "Lcom/robinhood/android/common/detail/component/relatedlist/DetailPageRelatedListViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "curatedListRelatedIndustriesStore", "Lcom/robinhood/shared/store/lists/store/CuratedListRelatedIndustriesStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListStateProvider;", "<init>", "(Lcom/robinhood/shared/store/lists/store/CuratedListRelatedIndustriesStore;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageRelatedListDuxo extends BaseDuxo<IndexDetailPageRelatedListDataState, DetailPageRelatedListViewState> implements HasSavedState {
    private final CuratedListRelatedIndustriesStore curatedListRelatedIndustriesStore;
    private final CuratedListStore curatedListStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexDetailPageRelatedListDuxo(CuratedListRelatedIndustriesStore curatedListRelatedIndustriesStore, CuratedListStore curatedListStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexDetailPageRelatedListStateProvider stateProvider) {
        super(new IndexDetailPageRelatedListDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(curatedListRelatedIndustriesStore, "curatedListRelatedIndustriesStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.curatedListRelatedIndustriesStore = curatedListRelatedIndustriesStore;
        this.curatedListStore = curatedListStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: IndexDetailPageRelatedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1", m3645f = "IndexDetailPageRelatedListDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1 */
    static final class C188571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188571(Continuation<? super C188571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageRelatedListDuxo.this.new C188571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UUID indexId = ((IndexDetailPageFragment.Args) IndexDetailPageRelatedListDuxo.INSTANCE.getArgs((HasSavedState) IndexDetailPageRelatedListDuxo.this)).getIndexId();
                IndexDetailPageRelatedListDuxo.this.curatedListRelatedIndustriesStore.refreshListItems(indexId);
                Flow flowTransformLatest = FlowKt.transformLatest(IndexDetailPageRelatedListDuxo.this.curatedListRelatedIndustriesStore.streamCuratedListRelatedIndustries(indexId), new C18855x44e46891(null, IndexDetailPageRelatedListDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(IndexDetailPageRelatedListDuxo.this, null);
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

        /* compiled from: IndexDetailPageRelatedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "filteredLists", "", "Lcom/robinhood/android/common/ui/CuratedListChipItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$2", m3645f = "IndexDetailPageRelatedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends CuratedListChipItem>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageRelatedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(IndexDetailPageRelatedListDuxo indexDetailPageRelatedListDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageRelatedListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends CuratedListChipItem> list, Continuation<? super Unit> continuation) {
                return invoke2((List<CuratedListChipItem>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<CuratedListChipItem> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageRelatedListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$2$1", m3645f = "IndexDetailPageRelatedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IndexDetailPageRelatedListDataState, Continuation<? super IndexDetailPageRelatedListDataState>, Object> {
                final /* synthetic */ List<CuratedListChipItem> $filteredLists;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<CuratedListChipItem> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$filteredLists = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$filteredLists, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageRelatedListDataState indexDetailPageRelatedListDataState, Continuation<? super IndexDetailPageRelatedListDataState> continuation) {
                    return ((AnonymousClass1) create(indexDetailPageRelatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageRelatedListDataState.copy$default((IndexDetailPageRelatedListDataState) this.L$0, null, extensions2.toImmutableList(this.$filteredLists), 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C188571(null));
    }

    /* compiled from: IndexDetailPageRelatedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListDuxo;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Args;", "<init>", "()V", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IndexDetailPageRelatedListDuxo, IndexDetailPageFragment.Args> {
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
        public IndexDetailPageFragment.Args getArgs(IndexDetailPageRelatedListDuxo indexDetailPageRelatedListDuxo) {
            return (IndexDetailPageFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, indexDetailPageRelatedListDuxo);
        }
    }
}
