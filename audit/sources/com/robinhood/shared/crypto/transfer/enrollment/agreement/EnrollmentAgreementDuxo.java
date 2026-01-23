package com.robinhood.shared.crypto.transfer.enrollment.agreement;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment3;
import com.robinhood.models.api.transfer.CryptoTransferAccountState;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferAccount;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo2;
import com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementFragment;
import com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementViewState;
import com.robinhood.utils.extensions.Throwables;
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

/* compiled from: EnrollmentAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onClickContinue", "skipAgreement", "completeEnrollment", "handleError", "t", "", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EnrollmentAgreementDuxo extends BaseDuxo5<EnrollmentAgreementViewState, EnrollmentAgreementDuxo2> implements HasSavedState {
    private static final String RHC_AGREEMENT_CONTENTFUL_ID = "1NNNEMugYPtNMij68MaIYo";
    private final AppType appType;
    private final CryptoTransfersStore cryptoTransfersStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnrollmentAgreementDuxo(SavedStateHandle savedStateHandle, AppType appType, CryptoTransfersStore cryptoTransfersStore, DuxoBundle duxoBundle) {
        super(new EnrollmentAgreementViewState(appType, EnrollmentAgreementViewState.CryptoAccountState.Loading.INSTANCE, false), duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.appType = appType;
        this.cryptoTransfersStore = cryptoTransfersStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C379481(null));
    }

    /* compiled from: EnrollmentAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$onCreate$1", m3645f = "EnrollmentAgreementDuxo.kt", m3646l = {43, 45, 47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$onCreate$1 */
    static final class C379481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C379481(Continuation<? super C379481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EnrollmentAgreementDuxo.this.new C379481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C379481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        
            if (r7 != r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:28:0x006d, B:30:0x0077, B:35:0x0098, B:32:0x007f, B:34:0x0091, B:13:0x0021, B:25:0x005e, B:14:0x0025, B:20:0x0045, B:22:0x004f, B:17:0x002c), top: B:43:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    EnrollmentAgreementDuxo.this.handleError(th);
                } else {
                    throw th;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EnrollmentAgreementDuxo.this.applyMutation(new AnonymousClass1(null));
                CryptoTransfersStore cryptoTransfersStore = EnrollmentAgreementDuxo.this.cryptoTransfersStore;
                this.label = 1;
                obj = cryptoTransfersStore.getEnrollment(this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoTransferAccount cryptoTransferAccount = (CryptoTransferAccount) obj;
                    if ((cryptoTransferAccount.getAccountState() == CryptoTransferAccountState.ACTIVE || cryptoTransferAccount.getAccountState() == CryptoTransferAccountState.ACTIVE_DEPOSIT_ONLY) && ((EnrollmentAgreementFragment.Args) EnrollmentAgreementDuxo.INSTANCE.getArgs((HasSavedState) EnrollmentAgreementDuxo.this)).getAction() == CryptoTransferAction.SEND) {
                        EnrollmentAgreementDuxo.this.submit(EnrollmentAgreementDuxo2.NavigateToAccountSecurity.INSTANCE);
                    }
                    EnrollmentAgreementDuxo.this.applyMutation(new AnonymousClass2(null));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CryptoTransfersStore cryptoTransfersStore2 = EnrollmentAgreementDuxo.this.cryptoTransfersStore;
                this.label = 3;
                obj = cryptoTransfersStore2.fetchAccount(this);
            }
            if (((ApiCryptoTransferEnrollment) obj).getEnrollment_state() == ApiCryptoTransferEnrollment3.NOT_STARTED) {
                CryptoTransfersStore cryptoTransfersStore3 = EnrollmentAgreementDuxo.this.cryptoTransfersStore;
                this.label = 2;
                if (cryptoTransfersStore3.startEnrollment(this) != coroutine_suspended) {
                    CryptoTransfersStore cryptoTransfersStore22 = EnrollmentAgreementDuxo.this.cryptoTransfersStore;
                    this.label = 3;
                    obj = cryptoTransfersStore22.fetchAccount(this);
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EnrollmentAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$onCreate$1$1", m3645f = "EnrollmentAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EnrollmentAgreementViewState, Continuation<? super EnrollmentAgreementViewState>, Object> {
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
            public final Object invoke(EnrollmentAgreementViewState enrollmentAgreementViewState, Continuation<? super EnrollmentAgreementViewState> continuation) {
                return ((AnonymousClass1) create(enrollmentAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EnrollmentAgreementViewState.copy$default((EnrollmentAgreementViewState) this.L$0, null, EnrollmentAgreementViewState.CryptoAccountState.Loading.INSTANCE, false, 5, null);
            }
        }

        /* compiled from: EnrollmentAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$onCreate$1$2", m3645f = "EnrollmentAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EnrollmentAgreementViewState, Continuation<? super EnrollmentAgreementViewState>, Object> {
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
            public final Object invoke(EnrollmentAgreementViewState enrollmentAgreementViewState, Continuation<? super EnrollmentAgreementViewState> continuation) {
                return ((AnonymousClass2) create(enrollmentAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EnrollmentAgreementViewState.copy$default((EnrollmentAgreementViewState) this.L$0, null, EnrollmentAgreementViewState.CryptoAccountState.HasAccount.INSTANCE, false, 5, null);
            }
        }
    }

    public final void onClickContinue() {
        if (this.appType == AppType.RHC) {
            submit(new EnrollmentAgreementDuxo2.ReviewAgreement(RHC_AGREEMENT_CONTENTFUL_ID));
        } else {
            completeEnrollment();
        }
    }

    public final void skipAgreement() {
        submit(EnrollmentAgreementDuxo2.Skip.INSTANCE);
    }

    /* compiled from: EnrollmentAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$completeEnrollment$1", m3645f = "EnrollmentAgreementDuxo.kt", m3646l = {81}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$completeEnrollment$1 */
    static final class C379461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C379461(Continuation<? super C379461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EnrollmentAgreementDuxo.this.new C379461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C379461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EnrollmentAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$completeEnrollment$1$1", m3645f = "EnrollmentAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$completeEnrollment$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EnrollmentAgreementViewState, Continuation<? super EnrollmentAgreementViewState>, Object> {
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
            public final Object invoke(EnrollmentAgreementViewState enrollmentAgreementViewState, Continuation<? super EnrollmentAgreementViewState> continuation) {
                return ((AnonymousClass1) create(enrollmentAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EnrollmentAgreementViewState.copy$default((EnrollmentAgreementViewState) this.L$0, null, null, true, 3, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EnrollmentAgreementDuxo.this.applyMutation(new AnonymousClass1(null));
                    CryptoTransfersStore cryptoTransfersStore = EnrollmentAgreementDuxo.this.cryptoTransfersStore;
                    ApiCryptoTransferEnrollment.Request request = new ApiCryptoTransferEnrollment.Request(false, 1, null);
                    this.label = 1;
                    obj = cryptoTransfersStore.completeEnrollment(request, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                EnrollmentAgreementDuxo.this.submit(new EnrollmentAgreementDuxo2.Success((ApiCryptoTransferEnrollment) obj));
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    EnrollmentAgreementDuxo.this.handleError(th);
                    EnrollmentAgreementDuxo.this.applyMutation(new AnonymousClass2(null));
                } else {
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EnrollmentAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$completeEnrollment$1$2", m3645f = "EnrollmentAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$completeEnrollment$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EnrollmentAgreementViewState, Continuation<? super EnrollmentAgreementViewState>, Object> {
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
            public final Object invoke(EnrollmentAgreementViewState enrollmentAgreementViewState, Continuation<? super EnrollmentAgreementViewState> continuation) {
                return ((AnonymousClass2) create(enrollmentAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EnrollmentAgreementViewState.copy$default((EnrollmentAgreementViewState) this.L$0, null, null, false, 3, null);
            }
        }
    }

    public final void completeEnrollment() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C379461(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable t) {
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
        ErrorResponse3 errorResponse3 = errorResponseExtractErrorResponse instanceof ErrorResponse3 ? (ErrorResponse3) errorResponseExtractErrorResponse : null;
        if ((errorResponse3 != null ? errorResponse3.getError_code() : null) == ErrorResponse3.ErrorCode.NO_CRYPTO_ACCOUNT) {
            applyMutation(new C379471(errorResponse3, null));
        } else {
            submit(new EnrollmentAgreementDuxo2.Error(t));
        }
    }

    /* compiled from: EnrollmentAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$handleError$1", m3645f = "EnrollmentAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo$handleError$1 */
    static final class C379471 extends ContinuationImpl7 implements Function2<EnrollmentAgreementViewState, Continuation<? super EnrollmentAgreementViewState>, Object> {
        final /* synthetic */ ErrorResponse3 $errorCodedErrorResponse;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C379471(ErrorResponse3 errorResponse3, Continuation<? super C379471> continuation) {
            super(2, continuation);
            this.$errorCodedErrorResponse = errorResponse3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C379471 c379471 = new C379471(this.$errorCodedErrorResponse, continuation);
            c379471.L$0 = obj;
            return c379471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EnrollmentAgreementViewState enrollmentAgreementViewState, Continuation<? super EnrollmentAgreementViewState> continuation) {
            return ((C379471) create(enrollmentAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EnrollmentAgreementViewState.copy$default((EnrollmentAgreementViewState) this.L$0, null, new EnrollmentAgreementViewState.CryptoAccountState.NoAccount(this.$errorCodedErrorResponse.getError_message()), false, 5, null);
        }
    }

    /* compiled from: EnrollmentAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementDuxo;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementFragment$Args;", "<init>", "()V", "RHC_AGREEMENT_CONTENTFUL_ID", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EnrollmentAgreementDuxo, EnrollmentAgreementFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EnrollmentAgreementFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EnrollmentAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EnrollmentAgreementFragment.Args getArgs(EnrollmentAgreementDuxo enrollmentAgreementDuxo) {
            return (EnrollmentAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, enrollmentAgreementDuxo);
        }
    }
}
