package com.robinhood.android.advisory.projection.disclosure;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.contracts.AdvisoryProjectionDisclosureFragmentKey;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.projection.ProjectionDisclosure;
import com.robinhood.store.advisory.AdvisoryProjectionStore;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AdvisoryProjectionDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/advisory/projection/disclosure/ProjectionDisclosureViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "projectionStore", "Lcom/robinhood/store/advisory/AdvisoryProjectionStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/store/advisory/AdvisoryProjectionStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryProjectionDisclosureDuxo extends BaseDuxo4<ProjectionDisclosureViewState> implements HasSavedState {
    private final AdvisoryProjectionStore projectionStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryProjectionDisclosureDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AdvisoryProjectionStore projectionStore) {
        super(new ProjectionDisclosureViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(projectionStore, "projectionStore");
        this.savedStateHandle = savedStateHandle;
        this.projectionStore = projectionStore;
    }

    /* compiled from: AdvisoryProjectionDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureDuxo$onStart$1", m3645f = "AdvisoryProjectionDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureDuxo$onStart$1 */
    static final class C92751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C92751(Continuation<? super C92751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C92751 c92751 = AdvisoryProjectionDisclosureDuxo.this.new C92751(continuation);
            c92751.L$0 = obj;
            return c92751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C92751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvisoryProjectionDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureDuxo$onStart$1$1", m3645f = "AdvisoryProjectionDisclosureDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvisoryProjectionDisclosureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdvisoryProjectionDisclosureDuxo advisoryProjectionDisclosureDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advisoryProjectionDisclosureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                    Flow<ProjectionDisclosure> flowStreamProjectionDisclosure = this.this$0.projectionStore.streamProjectionDisclosure(((AdvisoryProjectionDisclosureFragmentKey) AdvisoryProjectionDisclosureDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber());
                    C496051 c496051 = new C496051(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamProjectionDisclosure, c496051, this) == coroutine_suspended) {
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

            /* compiled from: AdvisoryProjectionDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "projectionDisclosure", "Lcom/robinhood/models/advisory/db/projection/ProjectionDisclosure;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureDuxo$onStart$1$1$1", m3645f = "AdvisoryProjectionDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496051 extends ContinuationImpl7 implements Function2<ProjectionDisclosure, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisoryProjectionDisclosureDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496051(AdvisoryProjectionDisclosureDuxo advisoryProjectionDisclosureDuxo, Continuation<? super C496051> continuation) {
                    super(2, continuation);
                    this.this$0 = advisoryProjectionDisclosureDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496051 c496051 = new C496051(this.this$0, continuation);
                    c496051.L$0 = obj;
                    return c496051;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ProjectionDisclosure projectionDisclosure, Continuation<? super Unit> continuation) {
                    return ((C496051) create(projectionDisclosure, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisoryProjectionDisclosureDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/projection/disclosure/ProjectionDisclosureViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureDuxo$onStart$1$1$1$1", m3645f = "AdvisoryProjectionDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496061 extends ContinuationImpl7 implements Function2<ProjectionDisclosureViewState, Continuation<? super ProjectionDisclosureViewState>, Object> {
                    final /* synthetic */ ProjectionDisclosure $projectionDisclosure;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496061(ProjectionDisclosure projectionDisclosure, Continuation<? super C496061> continuation) {
                        super(2, continuation);
                        this.$projectionDisclosure = projectionDisclosure;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496061 c496061 = new C496061(this.$projectionDisclosure, continuation);
                        c496061.L$0 = obj;
                        return c496061;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ProjectionDisclosureViewState projectionDisclosureViewState, Continuation<? super ProjectionDisclosureViewState> continuation) {
                        return ((C496061) create(projectionDisclosureViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((ProjectionDisclosureViewState) this.L$0).copy(this.$projectionDisclosure.getMarkdownText());
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496061((ProjectionDisclosure) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(AdvisoryProjectionDisclosureDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C92751(null));
    }

    /* compiled from: AdvisoryProjectionDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureDuxo;", "Lcom/robinhood/android/advisory/contracts/AdvisoryProjectionDisclosureFragmentKey;", "<init>", "()V", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvisoryProjectionDisclosureDuxo, AdvisoryProjectionDisclosureFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryProjectionDisclosureFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryProjectionDisclosureFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryProjectionDisclosureFragmentKey getArgs(AdvisoryProjectionDisclosureDuxo advisoryProjectionDisclosureDuxo) {
            return (AdvisoryProjectionDisclosureFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, advisoryProjectionDisclosureDuxo);
        }
    }
}
