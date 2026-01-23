package com.robinhood.shared.crypto.transfer.enrollment.checklist;

import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment3;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Event;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EnrollmentChecklistV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Duxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2DataState;", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2ViewState;", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Event;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2StateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2StateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "getLatestEnrollment", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleNetworkError", "t", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EnrollmentChecklistV2Duxo extends BaseDuxo3<EnrollmentChecklistV2DataState, EnrollmentChecklistV2ViewState, EnrollmentChecklistV2Event> {
    public static final int $stable = 8;
    private final CryptoTransfersStore cryptoTransfersStore;
    private final SuvMigrationManager suvMigrationManager;

    /* compiled from: EnrollmentChecklistV2Duxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Duxo", m3645f = "EnrollmentChecklistV2Duxo.kt", m3646l = {70, 73, 76}, m3647m = "getLatestEnrollment")
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Duxo$getLatestEnrollment$1 */
    static final class C379541 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C379541(Continuation<? super C379541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EnrollmentChecklistV2Duxo.this.getLatestEnrollment(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnrollmentChecklistV2Duxo(CryptoTransfersStore cryptoTransfersStore, SuvMigrationManager suvMigrationManager, AppType appType, EnrollmentChecklistV2StateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new EnrollmentChecklistV2DataState(appType, null, null, false, 14, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.suvMigrationManager = suvMigrationManager;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C379551(null));
    }

    /* compiled from: EnrollmentChecklistV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Duxo$onCreate$1", m3645f = "EnrollmentChecklistV2Duxo.kt", m3646l = {44, 50}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Duxo$onCreate$1 */
    static final class C379551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C379551(Continuation<? super C379551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EnrollmentChecklistV2Duxo.this.new C379551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C379551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ApiCryptoTransferEnrollment apiCryptoTransferEnrollment;
            boolean zBooleanValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    EnrollmentChecklistV2Duxo.this.handleNetworkError(th);
                } else {
                    throw th;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EnrollmentChecklistV2Duxo enrollmentChecklistV2Duxo = EnrollmentChecklistV2Duxo.this;
                this.label = 1;
                obj = enrollmentChecklistV2Duxo.getLatestEnrollment(this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiCryptoTransferEnrollment = (ApiCryptoTransferEnrollment) this.L$0;
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                EnrollmentChecklistV2Duxo.this.applyMutation(new AnonymousClass1(apiCryptoTransferEnrollment, zBooleanValue, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ApiCryptoTransferEnrollment apiCryptoTransferEnrollment2 = (ApiCryptoTransferEnrollment) obj;
            if (apiCryptoTransferEnrollment2.canFinalizeEnrollment()) {
                EnrollmentChecklistV2Duxo.this.submit(new EnrollmentChecklistV2Event.Navigate(apiCryptoTransferEnrollment2));
            }
            UUID suv_workflow_id = apiCryptoTransferEnrollment2.getSuv_workflow_id();
            if (suv_workflow_id != null) {
                SuvMigrationManager suvMigrationManager = EnrollmentChecklistV2Duxo.this.suvMigrationManager;
                this.L$0 = apiCryptoTransferEnrollment2;
                this.label = 2;
                Object objIsMigrated = suvMigrationManager.isMigrated(suv_workflow_id, this);
                if (objIsMigrated != coroutine_suspended) {
                    apiCryptoTransferEnrollment = apiCryptoTransferEnrollment2;
                    obj = objIsMigrated;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    EnrollmentChecklistV2Duxo.this.applyMutation(new AnonymousClass1(apiCryptoTransferEnrollment, zBooleanValue, null));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            apiCryptoTransferEnrollment = apiCryptoTransferEnrollment2;
            zBooleanValue = false;
            EnrollmentChecklistV2Duxo.this.applyMutation(new AnonymousClass1(apiCryptoTransferEnrollment, zBooleanValue, null));
            return Unit.INSTANCE;
        }

        /* compiled from: EnrollmentChecklistV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Duxo$onCreate$1$1", m3645f = "EnrollmentChecklistV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Duxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EnrollmentChecklistV2DataState, Continuation<? super EnrollmentChecklistV2DataState>, Object> {
            final /* synthetic */ ApiCryptoTransferEnrollment $enrollment;
            final /* synthetic */ boolean $suvIsMigrated;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiCryptoTransferEnrollment apiCryptoTransferEnrollment, boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$enrollment = apiCryptoTransferEnrollment;
                this.$suvIsMigrated = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$enrollment, this.$suvIsMigrated, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EnrollmentChecklistV2DataState enrollmentChecklistV2DataState, Continuation<? super EnrollmentChecklistV2DataState> continuation) {
                return ((AnonymousClass1) create(enrollmentChecklistV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EnrollmentChecklistV2DataState enrollmentChecklistV2DataState = (EnrollmentChecklistV2DataState) this.L$0;
                ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.$enrollment;
                return EnrollmentChecklistV2DataState.copy$default(enrollmentChecklistV2DataState, null, apiCryptoTransferEnrollment, apiCryptoTransferEnrollment.getSuv_workflow_id(), this.$suvIsMigrated, 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLatestEnrollment(Continuation<? super ApiCryptoTransferEnrollment> continuation) {
        C379541 c379541;
        if (continuation instanceof C379541) {
            c379541 = (C379541) continuation;
            int i = c379541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c379541.label = i - Integer.MIN_VALUE;
            } else {
                c379541 = new C379541(continuation);
            }
        }
        Object enrollment = c379541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c379541.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(enrollment);
            CryptoTransfersStore cryptoTransfersStore = this.cryptoTransfersStore;
            c379541.label = 1;
            enrollment = cryptoTransfersStore.getEnrollment(c379541);
            if (enrollment != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(enrollment);
                return enrollment;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(enrollment);
            return enrollment;
        }
        ResultKt.throwOnFailure(enrollment);
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = (ApiCryptoTransferEnrollment) enrollment;
        if (apiCryptoTransferEnrollment.getEnrollment_state() == ApiCryptoTransferEnrollment3.NOT_STARTED) {
            CryptoTransfersStore cryptoTransfersStore2 = this.cryptoTransfersStore;
            c379541.label = 2;
            Object objStartEnrollment = cryptoTransfersStore2.startEnrollment(c379541);
            if (objStartEnrollment != coroutine_suspended) {
                return objStartEnrollment;
            }
        } else {
            boolean zCanFinalizeEnrollment = apiCryptoTransferEnrollment.canFinalizeEnrollment();
            Object obj = apiCryptoTransferEnrollment;
            if (zCanFinalizeEnrollment) {
                CryptoTransfersStore cryptoTransfersStore3 = this.cryptoTransfersStore;
                ApiCryptoTransferEnrollment.Request request = new ApiCryptoTransferEnrollment.Request(true);
                c379541.label = 3;
                Object objCompleteEnrollment = cryptoTransfersStore3.completeEnrollment(request, c379541);
                obj = objCompleteEnrollment;
                if (objCompleteEnrollment == coroutine_suspended) {
                }
            }
            return obj;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNetworkError(Throwable t) {
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
        ErrorResponse3 errorResponse3 = errorResponseExtractErrorResponse instanceof ErrorResponse3 ? (ErrorResponse3) errorResponseExtractErrorResponse : null;
        submit(new EnrollmentChecklistV2Event.Error(t, (errorResponse3 != null ? errorResponse3.getError_code() : null) == ErrorResponse3.ErrorCode.NO_CRYPTO_ACCOUNT ? StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_enrollment_create_account_error, new Object[0]) : null));
    }
}
