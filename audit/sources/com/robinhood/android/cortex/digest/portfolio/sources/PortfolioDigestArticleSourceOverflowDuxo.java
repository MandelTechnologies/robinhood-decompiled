package com.robinhood.android.cortex.digest.portfolio.sources;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations2;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PortfolioDigestArticleSourceOverflowDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/sources/PortfolioDigestArticleSourceOverflowDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/cortex/digest/portfolio/sources/PortfolioDigestArticleSourceOverflowViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestArticleSourceOverflowDest$Args;", "portfolioDigestStore", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PortfolioDigestArticleSourceOverflowDuxo extends BaseDuxo4<PortfolioDigestArticleSourceOverflowViewState> implements HasArgs<PortfolioDigestDestinations2.Args> {
    private final PortfolioDigestStore portfolioDigestStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public PortfolioDigestDestinations2.Args getArgs(SavedStateHandle savedStateHandle) {
        return (PortfolioDigestDestinations2.Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PortfolioDigestArticleSourceOverflowDuxo(PortfolioDigestStore portfolioDigestStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new PortfolioDigestArticleSourceOverflowViewState(null, 1, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(portfolioDigestStore, "portfolioDigestStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.portfolioDigestStore = portfolioDigestStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C121521(null));
    }

    /* compiled from: PortfolioDigestArticleSourceOverflowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowDuxo$onCreate$1", m3645f = "PortfolioDigestArticleSourceOverflowDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowDuxo$onCreate$1 */
    static final class C121521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C121521(Continuation<? super C121521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioDigestArticleSourceOverflowDuxo.this.new C121521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C121521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<ImmutableList<ArticleSource>> flowStreamArticleSources = PortfolioDigestArticleSourceOverflowDuxo.this.portfolioDigestStore.streamArticleSources(((PortfolioDigestDestinations2.Args) PortfolioDigestArticleSourceOverflowDuxo.INSTANCE.getArgs((HasArgs) PortfolioDigestArticleSourceOverflowDuxo.this)).getAccountNumber());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PortfolioDigestArticleSourceOverflowDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamArticleSources, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PortfolioDigestArticleSourceOverflowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cortex/models/ArticleSource;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowDuxo$onCreate$1$1", m3645f = "PortfolioDigestArticleSourceOverflowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ImmutableList<? extends ArticleSource>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PortfolioDigestArticleSourceOverflowDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PortfolioDigestArticleSourceOverflowDuxo portfolioDigestArticleSourceOverflowDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = portfolioDigestArticleSourceOverflowDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ImmutableList<? extends ArticleSource> immutableList, Continuation<? super Unit> continuation) {
                return invoke2((ImmutableList<ArticleSource>) immutableList, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(ImmutableList<ArticleSource> immutableList, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(immutableList, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PortfolioDigestArticleSourceOverflowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/portfolio/sources/PortfolioDigestArticleSourceOverflowViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowDuxo$onCreate$1$1$1", m3645f = "PortfolioDigestArticleSourceOverflowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497181 extends ContinuationImpl7 implements Function2<PortfolioDigestArticleSourceOverflowViewState, Continuation<? super PortfolioDigestArticleSourceOverflowViewState>, Object> {
                final /* synthetic */ ImmutableList<ArticleSource> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497181(ImmutableList<ArticleSource> immutableList, Continuation<? super C497181> continuation) {
                    super(2, continuation);
                    this.$it = immutableList;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497181 c497181 = new C497181(this.$it, continuation);
                    c497181.L$0 = obj;
                    return c497181;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PortfolioDigestArticleSourceOverflowViewState portfolioDigestArticleSourceOverflowViewState, Continuation<? super PortfolioDigestArticleSourceOverflowViewState> continuation) {
                    return ((C497181) create(portfolioDigestArticleSourceOverflowViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PortfolioDigestArticleSourceOverflowViewState portfolioDigestArticleSourceOverflowViewState = (PortfolioDigestArticleSourceOverflowViewState) this.L$0;
                    ImmutableList<ArticleSource> immutableListPersistentListOf = this.$it;
                    if (immutableListPersistentListOf == null) {
                        immutableListPersistentListOf = extensions2.persistentListOf();
                    }
                    return portfolioDigestArticleSourceOverflowViewState.copy(immutableListPersistentListOf);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497181((ImmutableList) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: PortfolioDigestArticleSourceOverflowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/sources/PortfolioDigestArticleSourceOverflowDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/cortex/digest/portfolio/sources/PortfolioDigestArticleSourceOverflowDuxo;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestArticleSourceOverflowDest$Args;", "<init>", "()V", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<PortfolioDigestArticleSourceOverflowDuxo, PortfolioDigestDestinations2.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public PortfolioDigestDestinations2.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PortfolioDigestDestinations2.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public PortfolioDigestDestinations2.Args getArgs(PortfolioDigestArticleSourceOverflowDuxo portfolioDigestArticleSourceOverflowDuxo) {
            return (PortfolioDigestDestinations2.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, portfolioDigestArticleSourceOverflowDuxo);
        }
    }
}
