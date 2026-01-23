package com.robinhood.android.indexes.detail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.equities.contracts.PnlHubContract2;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: IndexDetailPageDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/IndexDetailPageDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageDataState;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "bind", "Lkotlinx/coroutines/Job;", "indexId", "Ljava/util/UUID;", "onTradeBarHeightUpdated", "", "newHeight", "", "onPageDirectionUpdated", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageDuxo extends BaseDuxo<IndexDetailPageDataState, IndexDetailPageViewState> implements HasSavedState {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private final IndexStore indexStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexDetailPageDuxo(ExperimentsStore experimentsStore, AccountProvider accountProvider, IndexStore indexStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new IndexDetailPageDataState(null, 0, false, null, null, null, 63, null), new IndexDetailPageStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.experimentsStore = experimentsStore;
        this.accountProvider = accountProvider;
        this.indexStore = indexStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: IndexDetailPageDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.IndexDetailPageDuxo$bind$1", m3645f = "IndexDetailPageDuxo.kt", m3646l = {46}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageDuxo$bind$1 */
    static final class C188001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $indexId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188001(UUID uuid, Continuation<? super C188001> continuation) {
            super(2, continuation);
            this.$indexId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageDuxo.this.new C188001(this.$indexId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable observableDistinctUntilChanged = ExperimentsProvider.DefaultImpls.streamState$default(IndexDetailPageDuxo.this.experimentsStore, new Experiment[]{PnlHubContract2.INSTANCE}, false, null, 6, null).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                Flow flowCombine = FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(IndexDetailPageDuxo.this.accountProvider.getIndividualAccountForced()), Integer.MAX_VALUE, null, 2, null), IndexDetailPageDuxo.this.indexStore.streamIndex(this.$indexId), new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(IndexDetailPageDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/IndexDetailPageDataState;", "pnlUpdatesEnabled", "", "kotlin.jvm.PlatformType", "account", "Lcom/robinhood/models/db/Account;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.IndexDetailPageDuxo$bind$1$1", m3645f = "IndexDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function4<Boolean, Account, Index, Continuation<? super IndexDetailPageDataState>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(4, continuation);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Boolean bool, Account account, Index index, Continuation<? super IndexDetailPageDataState> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = bool;
                anonymousClass1.L$1 = account;
                anonymousClass1.L$2 = index;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Boolean bool = (Boolean) this.L$0;
                Account account = (Account) this.L$1;
                Index index = (Index) this.L$2;
                Intrinsics.checkNotNull(bool);
                return new IndexDetailPageDataState(null, 0, bool.booleanValue(), account.getAccountNumber(), index.getId(), index.getSymbol(), 3, null);
            }
        }

        /* compiled from: IndexDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/indexes/detail/IndexDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.IndexDetailPageDuxo$bind$1$2", m3645f = "IndexDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<IndexDetailPageDataState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(IndexDetailPageDuxo indexDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IndexDetailPageDataState indexDetailPageDataState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(indexDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/IndexDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.IndexDetailPageDuxo$bind$1$2$1", m3645f = "IndexDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IndexDetailPageDataState, Continuation<? super IndexDetailPageDataState>, Object> {
                final /* synthetic */ IndexDetailPageDataState $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(IndexDetailPageDataState indexDetailPageDataState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = indexDetailPageDataState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageDataState indexDetailPageDataState, Continuation<? super IndexDetailPageDataState> continuation) {
                    return ((AnonymousClass1) create(indexDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageDataState.copy$default((IndexDetailPageDataState) this.L$0, null, 0, this.$it.getPnlUpdatesEnabled(), this.$it.getAccountNumber(), this.$it.getInstrumentId(), this.$it.getSymbol(), 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((IndexDetailPageDataState) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job bind(UUID indexId) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        return getLifecycleScope().launchWhenCreated(new C188001(indexId, null));
    }

    /* compiled from: IndexDetailPageDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/IndexDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.IndexDetailPageDuxo$onTradeBarHeightUpdated$1", m3645f = "IndexDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageDuxo$onTradeBarHeightUpdated$1 */
    static final class C188021 extends ContinuationImpl7 implements Function2<IndexDetailPageDataState, Continuation<? super IndexDetailPageDataState>, Object> {
        final /* synthetic */ int $newHeight;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188021(int i, Continuation<? super C188021> continuation) {
            super(2, continuation);
            this.$newHeight = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C188021 c188021 = new C188021(this.$newHeight, continuation);
            c188021.L$0 = obj;
            return c188021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IndexDetailPageDataState indexDetailPageDataState, Continuation<? super IndexDetailPageDataState> continuation) {
            return ((C188021) create(indexDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IndexDetailPageDataState.copy$default((IndexDetailPageDataState) this.L$0, null, this.$newHeight, false, null, null, null, 61, null);
        }
    }

    public final void onTradeBarHeightUpdated(int newHeight) {
        applyMutation(new C188021(newHeight, null));
    }

    /* compiled from: IndexDetailPageDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/IndexDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.IndexDetailPageDuxo$onPageDirectionUpdated$1", m3645f = "IndexDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageDuxo$onPageDirectionUpdated$1 */
    static final class C188011 extends ContinuationImpl7 implements Function2<IndexDetailPageDataState, Continuation<? super IndexDetailPageDataState>, Object> {
        final /* synthetic */ Direction $direction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188011(Direction direction, Continuation<? super C188011> continuation) {
            super(2, continuation);
            this.$direction = direction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C188011 c188011 = new C188011(this.$direction, continuation);
            c188011.L$0 = obj;
            return c188011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IndexDetailPageDataState indexDetailPageDataState, Continuation<? super IndexDetailPageDataState> continuation) {
            return ((C188011) create(indexDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IndexDetailPageDataState.copy$default((IndexDetailPageDataState) this.L$0, this.$direction, 0, false, null, null, null, 62, null);
        }
    }

    public final void onPageDirectionUpdated(Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        applyMutation(new C188011(direction, null));
    }
}
