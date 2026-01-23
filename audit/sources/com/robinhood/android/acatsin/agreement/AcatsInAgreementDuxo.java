package com.robinhood.android.acatsin.agreement;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.acats.p027v1.AcatsService;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementContract;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementViewState;
import com.robinhood.android.acatsin.util.AcatsFlowStep2;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore;
import com.robinhood.models.p355ui.UiSlipAgreementsSection;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: AcatsInAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0018B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "slipAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "acatsService", "Lbonfire/proto/idl/acats/v1/AcatsService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore;Lcom/robinhood/android/agreements/AgreementsStore;Lbonfire/proto/idl/acats/v1/AcatsService;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "loadAgreement", "Lkotlinx/coroutines/Job;", "signAgreement", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInAgreementDuxo extends BaseDuxo5<AcatsInAgreementViewState, AcatsInAgreementEvent> implements HasSavedState {
    private static final String ACATS_AGREEMENT_ID = "acats_in_agreement";
    private final AcatsService acatsService;
    private final AgreementsStore agreementsStore;
    private final SavedStateHandle savedStateHandle;
    private final SlipAgreementsStore slipAgreementsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInAgreementDuxo(SlipAgreementsStore slipAgreementsStore, AgreementsStore agreementsStore, AcatsService acatsService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(AcatsInAgreementViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(slipAgreementsStore, "slipAgreementsStore");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(acatsService, "acatsService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.slipAgreementsStore = slipAgreementsStore;
        this.agreementsStore = agreementsStore;
        this.acatsService = acatsService;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        loadAgreement();
    }

    /* compiled from: AcatsInAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.agreement.AcatsInAgreementDuxo$loadAgreement$1", m3645f = "AcatsInAgreementDuxo.kt", m3646l = {38, 97}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acatsin.agreement.AcatsInAgreementDuxo$loadAgreement$1 */
    static final class C77661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        int label;

        C77661(Continuation<? super C77661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInAgreementDuxo.this.new C77661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            UiAgreementWithContent uiAgreementWithContent;
            UiSlipAgreementsSection uiSlipAgreementsSection;
            int i2;
            UiAgreementWithContent uiAgreementWithContent2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            boolean z = true;
            try {
            } catch (Throwable th) {
                AcatsInAgreementDuxo.this.applyMutation(new AnonymousClass2(th, null));
            }
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                int i4 = ((AcatsInAgreementContract.Key) AcatsInAgreementDuxo.INSTANCE.getArgs((HasSavedState) AcatsInAgreementDuxo.this)).getAcatsFlow() == AcatsFlowStep2.ACATS_IN_CO_OWNER_CONFIRM ? 1 : 0;
                AgreementsStore agreementsStore = AcatsInAgreementDuxo.this.agreementsStore;
                this.I$0 = i4;
                this.label = 1;
                Object agreementWithContent = agreementsStore.getAgreementWithContent(AcatsInAgreementDuxo.ACATS_AGREEMENT_ID, this);
                if (agreementWithContent == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i4;
                obj = agreementWithContent;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.I$0;
                    uiAgreementWithContent2 = (UiAgreementWithContent) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    uiSlipAgreementsSection = (UiSlipAgreementsSection) ((Optional) obj).getOrNull();
                    uiAgreementWithContent = uiAgreementWithContent2;
                    i = i2;
                    AcatsInAgreementDuxo acatsInAgreementDuxo = AcatsInAgreementDuxo.this;
                    if (i == 0) {
                        z = false;
                    }
                    acatsInAgreementDuxo.applyMutation(new AnonymousClass1(acatsInAgreementDuxo, z, uiAgreementWithContent, uiSlipAgreementsSection, null));
                    return Unit.INSTANCE;
                }
                i = this.I$0;
                ResultKt.throwOnFailure(obj);
            }
            UiAgreementWithContent uiAgreementWithContent3 = (UiAgreementWithContent) obj;
            Companion companion = AcatsInAgreementDuxo.INSTANCE;
            if (!((AcatsInAgreementContract.Key) companion.getArgs((HasSavedState) AcatsInAgreementDuxo.this)).isAcatsRetry() && i == 0) {
                Single<Optional<UiSlipAgreementsSection>> slipAgreementsSection = AcatsInAgreementDuxo.this.slipAgreementsStore.getSlipAgreementsSection(((AcatsInAgreementContract.Key) companion.getArgs((HasSavedState) AcatsInAgreementDuxo.this)).getRhsAccountNumber(), ((AcatsInAgreementContract.Key) companion.getArgs((HasSavedState) AcatsInAgreementDuxo.this)).getScreenContext().getSource());
                this.L$0 = uiAgreementWithContent3;
                this.I$0 = i;
                this.label = 2;
                Object objAwait = RxAwait3.await(slipAgreementsSection, this);
                if (objAwait != coroutine_suspended) {
                    i2 = i;
                    uiAgreementWithContent2 = uiAgreementWithContent3;
                    obj = objAwait;
                    uiSlipAgreementsSection = (UiSlipAgreementsSection) ((Optional) obj).getOrNull();
                    uiAgreementWithContent = uiAgreementWithContent2;
                    i = i2;
                    AcatsInAgreementDuxo acatsInAgreementDuxo2 = AcatsInAgreementDuxo.this;
                    if (i == 0) {
                    }
                    acatsInAgreementDuxo2.applyMutation(new AnonymousClass1(acatsInAgreementDuxo2, z, uiAgreementWithContent, uiSlipAgreementsSection, null));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            uiAgreementWithContent = uiAgreementWithContent3;
            uiSlipAgreementsSection = null;
            AcatsInAgreementDuxo acatsInAgreementDuxo22 = AcatsInAgreementDuxo.this;
            if (i == 0) {
            }
            acatsInAgreementDuxo22.applyMutation(new AnonymousClass1(acatsInAgreementDuxo22, z, uiAgreementWithContent, uiSlipAgreementsSection, null));
            return Unit.INSTANCE;
        }

        /* compiled from: AcatsInAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.agreement.AcatsInAgreementDuxo$loadAgreement$1$1", m3645f = "AcatsInAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.agreement.AcatsInAgreementDuxo$loadAgreement$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInAgreementViewState, Continuation<? super AcatsInAgreementViewState>, Object> {
            final /* synthetic */ UiAgreementWithContent $acatsAgreement;
            final /* synthetic */ boolean $isCoOwnerFlow;
            final /* synthetic */ UiSlipAgreementsSection $slipAgreementsSection;
            int label;
            final /* synthetic */ AcatsInAgreementDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsInAgreementDuxo acatsInAgreementDuxo, boolean z, UiAgreementWithContent uiAgreementWithContent, UiSlipAgreementsSection uiSlipAgreementsSection, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsInAgreementDuxo;
                this.$isCoOwnerFlow = z;
                this.$acatsAgreement = uiAgreementWithContent;
                this.$slipAgreementsSection = uiSlipAgreementsSection;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$isCoOwnerFlow, this.$acatsAgreement, this.$slipAgreementsSection, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInAgreementViewState acatsInAgreementViewState, Continuation<? super AcatsInAgreementViewState> continuation) {
                return ((AnonymousClass1) create(acatsInAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new AcatsInAgreementViewState.Loaded(((AcatsInAgreementContract.Key) AcatsInAgreementDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).isAcatsRetry(), this.$isCoOwnerFlow, false, this.$acatsAgreement, this.$slipAgreementsSection, 4, null);
            }
        }

        /* compiled from: AcatsInAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.agreement.AcatsInAgreementDuxo$loadAgreement$1$2", m3645f = "AcatsInAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.agreement.AcatsInAgreementDuxo$loadAgreement$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AcatsInAgreementViewState, Continuation<? super AcatsInAgreementViewState>, Object> {
            final /* synthetic */ Throwable $throwable;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$throwable = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$throwable, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInAgreementViewState acatsInAgreementViewState, Continuation<? super AcatsInAgreementViewState> continuation) {
                return ((AnonymousClass2) create(acatsInAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new AcatsInAgreementViewState.Error(this.$throwable);
            }
        }
    }

    private final Job loadAgreement() {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C77661(null), 3, null);
    }

    public final void signAgreement() {
        withDataState(new Function1() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInAgreementDuxo.signAgreement$lambda$1(this.f$0, (AcatsInAgreementViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit signAgreement$lambda$1(AcatsInAgreementDuxo acatsInAgreementDuxo, AcatsInAgreementViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        AcatsInAgreementViewState.Loaded loaded = state instanceof AcatsInAgreementViewState.Loaded ? (AcatsInAgreementViewState.Loaded) state : null;
        if (loaded != null) {
            acatsInAgreementDuxo.applyMutation(new AcatsInAgreementDuxo2(loaded, null));
            BuildersKt__Builders_commonKt.launch$default(acatsInAgreementDuxo.getLifecycleScope(), null, null, new AcatsInAgreementDuxo3(acatsInAgreementDuxo, loaded, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementDuxo;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract$Key;", "<init>", "()V", "ACATS_AGREEMENT_ID", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInAgreementDuxo, AcatsInAgreementContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInAgreementContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInAgreementContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInAgreementContract.Key getArgs(AcatsInAgreementDuxo acatsInAgreementDuxo) {
            return (AcatsInAgreementContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInAgreementDuxo);
        }
    }
}
