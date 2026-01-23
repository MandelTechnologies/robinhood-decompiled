package com.robinhood.android.event.detail.attestation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.ApiPreviousAgreement;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.event.detail.attestation.EventAttestationDuxo3;
import com.robinhood.android.eventcontracts.contracts.EventAttestationFragmentKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EventAttestationDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001cB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/event/detail/attestation/EventAttestationDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/event/detail/attestation/EventAttestationDataState;", "Lcom/robinhood/android/event/detail/attestation/EventAttestationViewState;", "Lcom/robinhood/android/event/detail/attestation/EventAttestationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "refreshAgreement", "fetchAgreement", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAgreeClicked", "agreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "signAgreements", "(Lcom/robinhood/android/agreements/models/UiAgreementWithContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventAttestationDuxo extends BaseDuxo3<EventAttestationDataState, EventAttestationDuxo5, EventAttestationDuxo3> implements HasSavedState {
    private final AgreementsStore agreementsStore;
    private final FuturesAccountStore futuresAccountStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EventAttestationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.attestation.EventAttestationDuxo", m3645f = "EventAttestationDuxo.kt", m3646l = {52}, m3647m = "fetchAgreement")
    /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationDuxo$fetchAgreement$1 */
    static final class C160961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C160961(Continuation<? super C160961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventAttestationDuxo.this.fetchAgreement(this);
        }
    }

    /* compiled from: EventAttestationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.attestation.EventAttestationDuxo", m3645f = "EventAttestationDuxo.kt", m3646l = {86, 88, 101}, m3647m = "signAgreements")
    /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationDuxo$signAgreements$1 */
    static final class C161031 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C161031(Continuation<? super C161031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventAttestationDuxo.this.signAgreements(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventAttestationDuxo(AgreementsStore agreementsStore, FuturesAccountStore futuresAccountStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new EventAttestationDataState(null, false, 3, null), EventAttestationDuxo4.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.agreementsStore = agreementsStore;
        this.futuresAccountStore = futuresAccountStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C161011(null));
    }

    /* compiled from: EventAttestationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.attestation.EventAttestationDuxo$onCreate$1", m3645f = "EventAttestationDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationDuxo$onCreate$1 */
    static final class C161011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C161011(Continuation<? super C161011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventAttestationDuxo.this.new C161011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C161011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventAttestationDuxo eventAttestationDuxo = EventAttestationDuxo.this;
                this.label = 1;
                if (eventAttestationDuxo.fetchAgreement(this) == coroutine_suspended) {
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

    /* compiled from: EventAttestationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.attestation.EventAttestationDuxo$refreshAgreement$1", m3645f = "EventAttestationDuxo.kt", m3646l = {42}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationDuxo$refreshAgreement$1 */
    static final class C161021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C161021(Continuation<? super C161021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventAttestationDuxo.this.new C161021(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C161021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventAttestationDuxo eventAttestationDuxo = EventAttestationDuxo.this;
                this.label = 1;
                if (eventAttestationDuxo.fetchAgreement(this) == coroutine_suspended) {
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

    public final void refreshAgreement() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C161021(null), 3, null);
    }

    /* compiled from: EventAttestationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/attestation/EventAttestationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.attestation.EventAttestationDuxo$fetchAgreement$2", m3645f = "EventAttestationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationDuxo$fetchAgreement$2 */
    static final class C160972 extends ContinuationImpl7 implements Function2<EventAttestationDataState, Continuation<? super EventAttestationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C160972(Continuation<? super C160972> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C160972 c160972 = new C160972(continuation);
            c160972.L$0 = obj;
            return c160972;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventAttestationDataState eventAttestationDataState, Continuation<? super EventAttestationDataState> continuation) {
            return ((C160972) create(eventAttestationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventAttestationDataState.copy$default((EventAttestationDataState) this.L$0, null, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAgreement(Continuation<? super Unit> continuation) {
        C160961 c160961;
        if (continuation instanceof C160961) {
            c160961 = (C160961) continuation;
            int i = c160961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c160961.label = i - Integer.MIN_VALUE;
            } else {
                c160961 = new C160961(continuation);
            }
        }
        Object agreementWithContent = c160961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c160961.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(agreementWithContent);
                applyMutation(new C160972(null));
                AgreementsStore agreementsStore = this.agreementsStore;
                String attestationType = ((EventAttestationFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAttestationType();
                c160961.label = 1;
                agreementWithContent = agreementsStore.getAgreementWithContent(attestationType, c160961);
                if (agreementWithContent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(agreementWithContent);
            }
            applyMutation(new C160983((UiAgreementWithContent) agreementWithContent, null));
        } catch (Exception e) {
            if (!Throwables.isNetworkRelated(e)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new RuntimeException("Non-network error on fetching event attestation agreement " + ((EventAttestationFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAttestationType(), e), false, null, 6, null);
            }
            applyMutation(new C160994(e, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EventAttestationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/attestation/EventAttestationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.attestation.EventAttestationDuxo$fetchAgreement$3", m3645f = "EventAttestationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationDuxo$fetchAgreement$3 */
    static final class C160983 extends ContinuationImpl7 implements Function2<EventAttestationDataState, Continuation<? super EventAttestationDataState>, Object> {
        final /* synthetic */ UiAgreementWithContent $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C160983(UiAgreementWithContent uiAgreementWithContent, Continuation<? super C160983> continuation) {
            super(2, continuation);
            this.$result = uiAgreementWithContent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C160983 c160983 = new C160983(this.$result, continuation);
            c160983.L$0 = obj;
            return c160983;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventAttestationDataState eventAttestationDataState, Continuation<? super EventAttestationDataState> continuation) {
            return ((C160983) create(eventAttestationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EventAttestationDataState eventAttestationDataState = (EventAttestationDataState) this.L$0;
            Result.Companion companion = Result.INSTANCE;
            return EventAttestationDataState.copy$default(eventAttestationDataState, Result.m28549boximpl(Result.m28550constructorimpl(this.$result)), false, 2, null);
        }
    }

    /* compiled from: EventAttestationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/attestation/EventAttestationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.attestation.EventAttestationDuxo$fetchAgreement$4", m3645f = "EventAttestationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationDuxo$fetchAgreement$4 */
    static final class C160994 extends ContinuationImpl7 implements Function2<EventAttestationDataState, Continuation<? super EventAttestationDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f4139$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C160994(Exception exc, Continuation<? super C160994> continuation) {
            super(2, continuation);
            this.f4139$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C160994 c160994 = new C160994(this.f4139$e, continuation);
            c160994.L$0 = obj;
            return c160994;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventAttestationDataState eventAttestationDataState, Continuation<? super EventAttestationDataState> continuation) {
            return ((C160994) create(eventAttestationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EventAttestationDataState eventAttestationDataState = (EventAttestationDataState) this.L$0;
            Result.Companion companion = Result.INSTANCE;
            return EventAttestationDataState.copy$default(eventAttestationDataState, Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(this.f4139$e))), false, 2, null);
        }
    }

    /* compiled from: EventAttestationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.attestation.EventAttestationDuxo$onAgreeClicked$1", m3645f = "EventAttestationDuxo.kt", m3646l = {76}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationDuxo$onAgreeClicked$1 */
    static final class C161001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiAgreementWithContent $agreement;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C161001(UiAgreementWithContent uiAgreementWithContent, Continuation<? super C161001> continuation) {
            super(2, continuation);
            this.$agreement = uiAgreementWithContent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventAttestationDuxo.this.new C161001(this.$agreement, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C161001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EventAttestationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/attestation/EventAttestationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.attestation.EventAttestationDuxo$onAgreeClicked$1$1", m3645f = "EventAttestationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationDuxo$onAgreeClicked$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventAttestationDataState, Continuation<? super EventAttestationDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EventAttestationDataState eventAttestationDataState, Continuation<? super EventAttestationDataState> continuation) {
                return ((AnonymousClass1) create(eventAttestationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EventAttestationDataState.copy$default((EventAttestationDataState) this.L$0, null, true, 1, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventAttestationDuxo.this.applyMutation(new AnonymousClass1(null));
                EventAttestationDuxo eventAttestationDuxo = EventAttestationDuxo.this;
                UiAgreementWithContent uiAgreementWithContent = this.$agreement;
                this.label = 1;
                if (eventAttestationDuxo.signAgreements(uiAgreementWithContent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EventAttestationDuxo.this.applyMutation(new AnonymousClass2(null));
            return Unit.INSTANCE;
        }

        /* compiled from: EventAttestationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/attestation/EventAttestationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.attestation.EventAttestationDuxo$onAgreeClicked$1$2", m3645f = "EventAttestationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationDuxo$onAgreeClicked$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EventAttestationDataState, Continuation<? super EventAttestationDataState>, Object> {
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
            public final Object invoke(EventAttestationDataState eventAttestationDataState, Continuation<? super EventAttestationDataState> continuation) {
                return ((AnonymousClass2) create(eventAttestationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EventAttestationDataState.copy$default((EventAttestationDataState) this.L$0, null, false, 1, null);
            }
        }
    }

    public final void onAgreeClicked(UiAgreementWithContent agreement) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C161001(agreement, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r11.signEventAttestationIfNecessary(r12, r5) != r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object signAgreements(UiAgreementWithContent uiAgreementWithContent, Continuation<? super Unit> continuation) {
        C161031 c161031;
        if (continuation instanceof C161031) {
            c161031 = (C161031) continuation;
            int i = c161031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c161031.label = i - Integer.MIN_VALUE;
            } else {
                c161031 = new C161031(continuation);
            }
        }
        C161031 c1610312 = c161031;
        Object objCheckAgreement = c1610312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1610312.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objCheckAgreement);
                    AgreementsStore agreementsStore = this.agreementsStore;
                    String attestationType = ((EventAttestationFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAttestationType();
                    c1610312.L$0 = uiAgreementWithContent;
                    c1610312.label = 1;
                    objCheckAgreement = agreementsStore.checkAgreement(attestationType, c1610312);
                    if (objCheckAgreement == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    uiAgreementWithContent = (UiAgreementWithContent) c1610312.L$0;
                    ResultKt.throwOnFailure(objCheckAgreement);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(objCheckAgreement);
                        submit(EventAttestationDuxo3.Complete.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(objCheckAgreement);
                    FuturesAccountStore futuresAccountStore = this.futuresAccountStore;
                    String attestationType2 = ((EventAttestationFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAttestationType();
                    c1610312.L$0 = null;
                    c1610312.label = 3;
                }
                if (((ApiPreviousAgreement) objCheckAgreement).getSigned_at() == null) {
                    AgreementsStore agreementsStore2 = this.agreementsStore;
                    c1610312.L$0 = null;
                    c1610312.label = 2;
                    if (AgreementsStore.signAgreement$default(agreementsStore2, uiAgreementWithContent, null, null, c1610312, 6, null) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                FuturesAccountStore futuresAccountStore2 = this.futuresAccountStore;
                String attestationType22 = ((EventAttestationFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAttestationType();
                c1610312.L$0 = null;
                c1610312.label = 3;
            } catch (Exception e) {
                if (!Throwables.isNetworkRelated(e)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new RuntimeException("Non-network error on signing event attestation agreement on AgreementApi", e), false, null, 6, null);
                }
                submit(new EventAttestationDuxo3.Error(e));
                return Unit.INSTANCE;
            }
        } catch (Exception e2) {
            if (!Throwables.isNetworkRelated(e2)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new RuntimeException("Non-network error on signing event attestation agreement on Ceres", e2), false, null, 6, null);
            }
            submit(new EventAttestationDuxo3.Error(e2));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EventAttestationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/detail/attestation/EventAttestationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/event/detail/attestation/EventAttestationDuxo;", "Lcom/robinhood/android/eventcontracts/contracts/EventAttestationFragmentKey;", "<init>", "()V", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EventAttestationDuxo, EventAttestationFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventAttestationFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (EventAttestationFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventAttestationFragmentKey getArgs(EventAttestationDuxo eventAttestationDuxo) {
            return (EventAttestationFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, eventAttestationDuxo);
        }
    }
}
