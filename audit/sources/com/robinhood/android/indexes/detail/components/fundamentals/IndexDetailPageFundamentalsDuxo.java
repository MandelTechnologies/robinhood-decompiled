package com.robinhood.android.indexes.detail.components.fundamentals;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.detail.component.fundamentals.DetailPageFundamentalsViewState;
import com.robinhood.android.indexes.api.fundamentals.ApiIndexFundamentalsDetailRequest;
import com.robinhood.android.indexes.detail.IndexDetailPageFragment;
import com.robinhood.android.indexes.models.p159db.IndexFundamentals;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: IndexDetailPageFundamentalsDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/fundamentals/IndexDetailPageFundamentalsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/indexes/detail/components/fundamentals/IndexDetailPageFundamentalsDataState;", "Lcom/robinhood/android/common/detail/component/fundamentals/DetailPageFundamentalsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/fundamentals/IndexDetailPageFundamentalsStateProvider;", "<init>", "(Lcom/robinhood/android/indexes/store/IndexStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/indexes/detail/components/fundamentals/IndexDetailPageFundamentalsStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageFundamentalsDuxo extends BaseDuxo<IndexDetailPageFundamentalsDataState, DetailPageFundamentalsViewState> implements HasSavedState {
    private final IndexStore indexStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexDetailPageFundamentalsDuxo(IndexStore indexStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexDetailPageFundamentalsStateProvider stateProvider) {
        super(new IndexDetailPageFundamentalsDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.indexStore = indexStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: IndexDetailPageFundamentalsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.fundamentals.IndexDetailPageFundamentalsDuxo$onCreate$1", m3645f = "IndexDetailPageFundamentalsDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.fundamentals.IndexDetailPageFundamentalsDuxo$onCreate$1 */
    static final class C188341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188341(Continuation<? super C188341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageFundamentalsDuxo.this.new C188341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<IndexFundamentals> flowStreamIndexFundamentals = IndexDetailPageFundamentalsDuxo.this.indexStore.streamIndexFundamentals(new ApiIndexFundamentalsDetailRequest.ApiIndexFundamentalsDetailRequestById(((IndexDetailPageFragment.Args) IndexDetailPageFundamentalsDuxo.INSTANCE.getArgs((HasSavedState) IndexDetailPageFundamentalsDuxo.this)).getIndexId()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IndexDetailPageFundamentalsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamIndexFundamentals, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageFundamentalsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "fundamentals", "Lcom/robinhood/android/indexes/models/db/IndexFundamentals;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.fundamentals.IndexDetailPageFundamentalsDuxo$onCreate$1$1", m3645f = "IndexDetailPageFundamentalsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.fundamentals.IndexDetailPageFundamentalsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IndexFundamentals, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageFundamentalsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageFundamentalsDuxo indexDetailPageFundamentalsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageFundamentalsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IndexFundamentals indexFundamentals, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(indexFundamentals, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageFundamentalsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/fundamentals/IndexDetailPageFundamentalsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.fundamentals.IndexDetailPageFundamentalsDuxo$onCreate$1$1$1", m3645f = "IndexDetailPageFundamentalsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.fundamentals.IndexDetailPageFundamentalsDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501931 extends ContinuationImpl7 implements Function2<IndexDetailPageFundamentalsDataState, Continuation<? super IndexDetailPageFundamentalsDataState>, Object> {
                final /* synthetic */ IndexFundamentals $fundamentals;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501931(IndexFundamentals indexFundamentals, Continuation<? super C501931> continuation) {
                    super(2, continuation);
                    this.$fundamentals = indexFundamentals;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501931 c501931 = new C501931(this.$fundamentals, continuation);
                    c501931.L$0 = obj;
                    return c501931;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageFundamentalsDataState indexDetailPageFundamentalsDataState, Continuation<? super IndexDetailPageFundamentalsDataState> continuation) {
                    return ((C501931) create(indexDetailPageFundamentalsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((IndexDetailPageFundamentalsDataState) this.L$0).copy(this.$fundamentals);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C501931((IndexFundamentals) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C188341(null));
    }

    /* compiled from: IndexDetailPageFundamentalsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/fundamentals/IndexDetailPageFundamentalsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/indexes/detail/components/fundamentals/IndexDetailPageFundamentalsDuxo;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Args;", "<init>", "()V", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IndexDetailPageFundamentalsDuxo, IndexDetailPageFragment.Args> {
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
        public IndexDetailPageFragment.Args getArgs(IndexDetailPageFundamentalsDuxo indexDetailPageFundamentalsDuxo) {
            return (IndexDetailPageFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, indexDetailPageFundamentalsDuxo);
        }
    }
}
