package com.robinhood.android.eventcontracts.contentful.explainer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.futures.contracts.FuturesEventExplainerFragmentKey;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.Result;
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

/* compiled from: EventExplainerDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contentful/explainer/EventExplainerDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/eventcontracts/contentful/explainer/EventExplainerDuxoDataState;", "Lcom/robinhood/android/udf/HasSavedState;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-event-contracts-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventExplainerDuxo extends BaseDuxo4<EventExplainerDuxoDataState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventExplainerDuxo(StaticContentStore staticContentStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new EventExplainerDuxoDataState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.staticContentStore = staticContentStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C165021(null));
    }

    /* compiled from: EventExplainerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.contentful.explainer.EventExplainerDuxo$onCreate$1", m3645f = "EventExplainerDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.eventcontracts.contentful.explainer.EventExplainerDuxo$onCreate$1 */
    static final class C165021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C165021(Continuation<? super C165021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventExplainerDuxo.this.new C165021(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C165021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            C165021 c165021;
            StaticContentStore staticContentStore;
            String contentfulId;
            Throwable th;
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventExplainerDuxo eventExplainerDuxo = EventExplainerDuxo.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    staticContentStore = eventExplainerDuxo.staticContentStore;
                    contentfulId = ((FuturesEventExplainerFragmentKey) EventExplainerDuxo.INSTANCE.getArgs((HasSavedState) eventExplainerDuxo)).getContentfulId();
                    this.label = 1;
                    c165021 = this;
                } catch (Throwable th2) {
                    th = th2;
                    c165021 = this;
                    th = th;
                    Throwables.rethrowIfNotNetworkRelated(th);
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    EventExplainerDuxo.this.applyMutation(new AnonymousClass1(objM28550constructorimpl, null));
                    return Unit.INSTANCE;
                }
                try {
                    obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, contentfulId, null, c165021, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    Throwables.rethrowIfNotNetworkRelated(th);
                    Result.Companion companion22 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    EventExplainerDuxo.this.applyMutation(new AnonymousClass1(objM28550constructorimpl, null));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c165021 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c165021 = this;
                    Throwables.rethrowIfNotNetworkRelated(th);
                    Result.Companion companion222 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    EventExplainerDuxo.this.applyMutation(new AnonymousClass1(objM28550constructorimpl, null));
                    return Unit.INSTANCE;
                }
            }
            objM28550constructorimpl = Result.m28550constructorimpl((OtherMarkdown) ((EntryResource) obj).getValue());
            EventExplainerDuxo.this.applyMutation(new AnonymousClass1(objM28550constructorimpl, null));
            return Unit.INSTANCE;
        }

        /* compiled from: EventExplainerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/contentful/explainer/EventExplainerDuxoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.contentful.explainer.EventExplainerDuxo$onCreate$1$1", m3645f = "EventExplainerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.eventcontracts.contentful.explainer.EventExplainerDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventExplainerDuxoDataState, Continuation<? super EventExplainerDuxoDataState>, Object> {
            final /* synthetic */ Object $result;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Object obj, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$result = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EventExplainerDuxoDataState eventExplainerDuxoDataState, Continuation<? super EventExplainerDuxoDataState> continuation) {
                return ((AnonymousClass1) create(eventExplainerDuxoDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((EventExplainerDuxoDataState) this.L$0).copy(Result.m28549boximpl(this.$result));
            }
        }
    }

    /* compiled from: EventExplainerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contentful/explainer/EventExplainerDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/eventcontracts/contentful/explainer/EventExplainerDuxo;", "Lcom/robinhood/android/futures/contracts/FuturesEventExplainerFragmentKey;", "<init>", "()V", "feature-event-contracts-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EventExplainerDuxo, FuturesEventExplainerFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesEventExplainerFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (FuturesEventExplainerFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesEventExplainerFragmentKey getArgs(EventExplainerDuxo eventExplainerDuxo) {
            return (FuturesEventExplainerFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, eventExplainerDuxo);
        }
    }
}
