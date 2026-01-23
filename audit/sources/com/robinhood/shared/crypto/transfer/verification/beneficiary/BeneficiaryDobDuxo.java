package com.robinhood.shared.crypto.transfer.verification.beneficiary;

import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.transfer.ApiCryptoTransferHistoryDetailResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoWithdrawalVerificationRequest;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.shared.crypto.transfer.verification.VerificationType2;
import com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobDuxo2;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BeneficiaryDobDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/BeneficiaryDobDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/BeneficiaryDobViewState;", "Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/BeneficiaryDobEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;)V", "submit", "", "verificationId", "Ljava/util/UUID;", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "firstName", "", "lastName", "dob", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class BeneficiaryDobDuxo extends BaseDuxo5<BeneficiaryDobViewState, BeneficiaryDobDuxo2> {
    public static final int $stable = 8;
    private final CryptoTransfersStore cryptoTransfersStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryDobDuxo(DuxoBundle duxoBundle, CryptoTransfersStore cryptoTransfersStore) {
        super(new BeneficiaryDobViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        this.cryptoTransfersStore = cryptoTransfersStore;
    }

    /* compiled from: BeneficiaryDobDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobDuxo$submit$1", m3645f = "BeneficiaryDobDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobDuxo$submit$1 */
    static final class C385091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $dob;
        final /* synthetic */ String $firstName;
        final /* synthetic */ String $lastName;
        final /* synthetic */ UUID $verificationId;
        final /* synthetic */ VerificationType $verificationType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C385091(VerificationType verificationType, UUID uuid, String str, String str2, String str3, Continuation<? super C385091> continuation) {
            super(2, continuation);
            this.$verificationType = verificationType;
            this.$verificationId = uuid;
            this.$firstName = str;
            this.$lastName = str2;
            this.$dob = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryDobDuxo.this.new C385091(this.$verificationType, this.$verificationId, this.$firstName, this.$lastName, this.$dob, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C385091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BeneficiaryDobDuxo.this.applyMutation(new AnonymousClass1(null));
                    CryptoTransfersStore cryptoTransfersStore = BeneficiaryDobDuxo.this.cryptoTransfersStore;
                    ApiCryptoTransferHistoryDetailResponse.Type serverType = VerificationType2.getServerType(this.$verificationType);
                    UUID uuid = this.$verificationId;
                    ApiCryptoWithdrawalVerificationRequest apiCryptoWithdrawalVerificationRequest = new ApiCryptoWithdrawalVerificationRequest(null, null, new ApiCryptoWithdrawalVerificationRequest.BeneficiaryDetails(this.$firstName, this.$lastName, this.$dob), null, null, 27, null);
                    this.label = 1;
                    obj = cryptoTransfersStore.updateVerification(serverType, uuid, apiCryptoWithdrawalVerificationRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BeneficiaryDobDuxo.this.submit(new BeneficiaryDobDuxo2.Success((ApiCryptoVerificationResponse) obj));
                BeneficiaryDobDuxo.this.applyMutation(new AnonymousClass2(null));
            } catch (Exception e) {
                if (Throwables.isNetworkRelated(e)) {
                    BeneficiaryDobDuxo.this.applyMutation(new AnonymousClass3(null));
                    BeneficiaryDobDuxo.this.submit(new BeneficiaryDobDuxo2.Error(e));
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: BeneficiaryDobDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/BeneficiaryDobViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobDuxo$submit$1$1", m3645f = "BeneficiaryDobDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobDuxo$submit$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BeneficiaryDobViewState, Continuation<? super BeneficiaryDobViewState>, Object> {
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
            public final Object invoke(BeneficiaryDobViewState beneficiaryDobViewState, Continuation<? super BeneficiaryDobViewState> continuation) {
                return ((AnonymousClass1) create(beneficiaryDobViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((BeneficiaryDobViewState) this.L$0).copy(true);
            }
        }

        /* compiled from: BeneficiaryDobDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/BeneficiaryDobViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobDuxo$submit$1$2", m3645f = "BeneficiaryDobDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobDuxo$submit$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<BeneficiaryDobViewState, Continuation<? super BeneficiaryDobViewState>, Object> {
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
            public final Object invoke(BeneficiaryDobViewState beneficiaryDobViewState, Continuation<? super BeneficiaryDobViewState> continuation) {
                return ((AnonymousClass2) create(beneficiaryDobViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((BeneficiaryDobViewState) this.L$0).copy(false);
            }
        }

        /* compiled from: BeneficiaryDobDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/BeneficiaryDobViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobDuxo$submit$1$3", m3645f = "BeneficiaryDobDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobDuxo$submit$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<BeneficiaryDobViewState, Continuation<? super BeneficiaryDobViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiaryDobViewState beneficiaryDobViewState, Continuation<? super BeneficiaryDobViewState> continuation) {
                return ((AnonymousClass3) create(beneficiaryDobViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((BeneficiaryDobViewState) this.L$0).copy(false);
            }
        }
    }

    public final void submit(UUID verificationId, VerificationType verificationType, String firstName, String lastName, String dob) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(dob, "dob");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C385091(verificationType, verificationId, firstName, lastName, dob, null), 3, null);
    }
}
