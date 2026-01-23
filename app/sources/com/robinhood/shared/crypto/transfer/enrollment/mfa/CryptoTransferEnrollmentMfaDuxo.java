package com.robinhood.shared.crypto.transfer.enrollment.mfa;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment2;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferEnrollmentMfaFragmentKey;
import com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaEvent;
import com.robinhood.utils.extensions.Throwables;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferEnrollmentMfaDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001fB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u0019J\u0017\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0002\b\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaDataState;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaViewState;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "hasContinueButtonClicked", "", "getHasContinueButtonClicked", "()Z", "onCreate", "", "onClickContinue", "navigate", "mfa", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment$TrustMfa;", "navigate$feature_crypto_transfer_externalDebug", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferEnrollmentMfaDuxo extends BaseDuxo3<CryptoTransferEnrollmentMfaDataState, CryptoTransferEnrollmentMfaViewState, CryptoTransferEnrollmentMfaEvent> implements HasSavedState {
    private static final String CONTINUE_BUTTON_CLICK_SAVED_ARG_KEY = "hasClickedContinueButton";
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
    public CryptoTransferEnrollmentMfaDuxo(CryptoTransfersStore cryptoTransfersStore, SavedStateHandle savedStateHandle, AppType appType, CryptoTransferEnrollmentMfaStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoTransferEnrollmentMfaDataState(appType, null, true), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.savedStateHandle = savedStateHandle;
    }

    private final boolean getHasContinueButtonClicked() {
        Boolean bool = (Boolean) getSavedStateHandle().get(CONTINUE_BUTTON_CLICK_SAVED_ARG_KEY);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C379741(null));
    }

    /* compiled from: CryptoTransferEnrollmentMfaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaDuxo$onCreate$1", m3645f = "CryptoTransferEnrollmentMfaDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaDuxo$onCreate$1 */
    static final class C379741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C379741(Continuation<? super C379741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransferEnrollmentMfaDuxo.this.new C379741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C379741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoTransferEnrollmentMfaDuxo.this.applyMutation(new AnonymousClass1(null));
                    CryptoTransfersStore cryptoTransfersStore = CryptoTransferEnrollmentMfaDuxo.this.cryptoTransfersStore;
                    this.label = 1;
                    obj = cryptoTransfersStore.getEnrollment(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = (ApiCryptoTransferEnrollment) obj;
                CryptoTransferEnrollmentMfaDuxo.this.applyMutation(new AnonymousClass2(apiCryptoTransferEnrollment, null));
                CryptoTransferEnrollmentMfaDuxo.this.navigate$feature_crypto_transfer_externalDebug(apiCryptoTransferEnrollment.getMfa());
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    CryptoTransferEnrollmentMfaDuxo.this.submit(new CryptoTransferEnrollmentMfaEvent.Error(th));
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoTransferEnrollmentMfaDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaDuxo$onCreate$1$1", m3645f = "CryptoTransferEnrollmentMfaDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTransferEnrollmentMfaDataState, Continuation<? super CryptoTransferEnrollmentMfaDataState>, Object> {
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
            public final Object invoke(CryptoTransferEnrollmentMfaDataState cryptoTransferEnrollmentMfaDataState, Continuation<? super CryptoTransferEnrollmentMfaDataState> continuation) {
                return ((AnonymousClass1) create(cryptoTransferEnrollmentMfaDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoTransferEnrollmentMfaDataState.copy$default((CryptoTransferEnrollmentMfaDataState) this.L$0, null, null, true, 3, null);
            }
        }

        /* compiled from: CryptoTransferEnrollmentMfaDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaDuxo$onCreate$1$2", m3645f = "CryptoTransferEnrollmentMfaDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoTransferEnrollmentMfaDataState, Continuation<? super CryptoTransferEnrollmentMfaDataState>, Object> {
            final /* synthetic */ ApiCryptoTransferEnrollment $enrollment;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ApiCryptoTransferEnrollment apiCryptoTransferEnrollment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$enrollment = apiCryptoTransferEnrollment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$enrollment, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoTransferEnrollmentMfaDataState cryptoTransferEnrollmentMfaDataState, Continuation<? super CryptoTransferEnrollmentMfaDataState> continuation) {
                return ((AnonymousClass2) create(cryptoTransferEnrollmentMfaDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoTransferEnrollmentMfaDataState.copy$default((CryptoTransferEnrollmentMfaDataState) this.L$0, null, this.$enrollment, false, 1, null);
            }
        }
    }

    public final void onClickContinue() {
        getSavedStateHandle().set(CONTINUE_BUTTON_CLICK_SAVED_ARG_KEY, Boolean.TRUE);
        withDataState(new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferEnrollmentMfaDuxo.onClickContinue$lambda$1(this.f$0, (CryptoTransferEnrollmentMfaDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClickContinue$lambda$1(CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo, CryptoTransferEnrollmentMfaDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ApiCryptoTransferEnrollment enrollment = dataState.getEnrollment();
        if (enrollment != null) {
            cryptoTransferEnrollmentMfaDuxo.navigate$feature_crypto_transfer_externalDebug(enrollment.getMfa());
        }
        return Unit.INSTANCE;
    }

    public final void navigate$feature_crypto_transfer_externalDebug(ApiCryptoTransferEnrollment.TrustMfa mfa) {
        CryptoTransferEnrollmentMfaEvent cryptoTransferEnrollmentMfaEvent;
        if (getHasContinueButtonClicked()) {
            if (ApiCryptoTransferEnrollment2.isCompleted(mfa)) {
                cryptoTransferEnrollmentMfaEvent = CryptoTransferEnrollmentMfaEvent.Navigate.Enroll.INSTANCE;
            } else if (!TrustMfas.isPhoneVerified(mfa)) {
                cryptoTransferEnrollmentMfaEvent = CryptoTransferEnrollmentMfaEvent.Navigate.Phone.INSTANCE;
            } else if (!TrustMfas.isEmailVerified(mfa)) {
                cryptoTransferEnrollmentMfaEvent = CryptoTransferEnrollmentMfaEvent.Navigate.Email.INSTANCE;
            } else {
                cryptoTransferEnrollmentMfaEvent = CryptoTransferEnrollmentMfaEvent.Navigate.Enroll.INSTANCE;
            }
            submit(cryptoTransferEnrollmentMfaEvent);
        }
    }

    /* compiled from: CryptoTransferEnrollmentMfaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaDuxo;", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferEnrollmentMfaFragmentKey;", "<init>", "()V", "CONTINUE_BUTTON_CLICK_SAVED_ARG_KEY", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTransferEnrollmentMfaDuxo, CryptoTransferEnrollmentMfaFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferEnrollmentMfaFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTransferEnrollmentMfaFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferEnrollmentMfaFragmentKey getArgs(CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo) {
            return (CryptoTransferEnrollmentMfaFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTransferEnrollmentMfaDuxo);
        }
    }
}
