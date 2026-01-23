package com.robinhood.shared.crypto.transfer.verification.type;

import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.transfer.ApiCryptoTransferHistoryDetailResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse3;
import com.robinhood.models.api.transfer.verification.ApiCryptoWithdrawalVerificationRequest;
import com.robinhood.models.api.transfer.verification.WalletType;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.shared.crypto.transfer.verification.VerificationType2;
import com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo3;
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

/* compiled from: WalletTypeDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeDataState;", "Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeViewState;", "Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeStateProvider;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeStateProvider;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;)V", "updateInfo", "", "checkIfHostedInfo", "Lcom/robinhood/models/api/transfer/verification/NextStepData$CheckIfHosted;", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "submit", "verificationId", "Ljava/util/UUID;", "walletType", "Lcom/robinhood/models/api/transfer/verification/WalletType;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class WalletTypeDuxo extends BaseDuxo3<WalletTypeDataState, WalletTypeViewState, WalletTypeDuxo3> {
    public static final int $stable = 8;
    private final CryptoTransfersStore cryptoTransfersStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletTypeDuxo(DuxoBundle duxoBundle, WalletTypeDuxo4 stateProvider, CryptoTransfersStore cryptoTransfersStore) {
        super(new WalletTypeDataState(false, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        this.cryptoTransfersStore = cryptoTransfersStore;
    }

    /* compiled from: WalletTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo$updateInfo$1", m3645f = "WalletTypeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo$updateInfo$1 */
    static final class C385661 extends ContinuationImpl7 implements Function2<WalletTypeDataState, Continuation<? super WalletTypeDataState>, Object> {
        final /* synthetic */ ApiCryptoVerificationResponse3.CheckIfHosted $checkIfHostedInfo;
        final /* synthetic */ VerificationType $verificationType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C385661(ApiCryptoVerificationResponse3.CheckIfHosted checkIfHosted, VerificationType verificationType, Continuation<? super C385661> continuation) {
            super(2, continuation);
            this.$checkIfHostedInfo = checkIfHosted;
            this.$verificationType = verificationType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C385661 c385661 = new C385661(this.$checkIfHostedInfo, this.$verificationType, continuation);
            c385661.L$0 = obj;
            return c385661;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WalletTypeDataState walletTypeDataState, Continuation<? super WalletTypeDataState> continuation) {
            return ((C385661) create(walletTypeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WalletTypeDataState.copy$default((WalletTypeDataState) this.L$0, false, this.$checkIfHostedInfo, this.$verificationType, 1, null);
        }
    }

    public final void updateInfo(ApiCryptoVerificationResponse3.CheckIfHosted checkIfHostedInfo, VerificationType verificationType) {
        Intrinsics.checkNotNullParameter(checkIfHostedInfo, "checkIfHostedInfo");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        applyMutation(new C385661(checkIfHostedInfo, verificationType, null));
    }

    /* compiled from: WalletTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo$submit$1", m3645f = "WalletTypeDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo$submit$1 */
    static final class C385651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $verificationId;
        final /* synthetic */ VerificationType $verificationType;
        final /* synthetic */ WalletType $walletType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C385651(VerificationType verificationType, UUID uuid, WalletType walletType, Continuation<? super C385651> continuation) {
            super(2, continuation);
            this.$verificationType = verificationType;
            this.$verificationId = uuid;
            this.$walletType = walletType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WalletTypeDuxo.this.new C385651(this.$verificationType, this.$verificationId, this.$walletType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C385651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    WalletTypeDuxo.this.applyMutation(new AnonymousClass1(null));
                    CryptoTransfersStore cryptoTransfersStore = WalletTypeDuxo.this.cryptoTransfersStore;
                    ApiCryptoTransferHistoryDetailResponse.Type serverType = VerificationType2.getServerType(this.$verificationType);
                    UUID uuid = this.$verificationId;
                    ApiCryptoWithdrawalVerificationRequest apiCryptoWithdrawalVerificationRequest = new ApiCryptoWithdrawalVerificationRequest(null, this.$walletType, null, null, null, 29, null);
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
                WalletTypeDuxo.this.submit(new WalletTypeDuxo3.Success((ApiCryptoVerificationResponse) obj));
                WalletTypeDuxo.this.applyMutation(new AnonymousClass2(null));
            } catch (Exception e) {
                if (Throwables.isNetworkRelated(e)) {
                    WalletTypeDuxo.this.applyMutation(new AnonymousClass3(null));
                    WalletTypeDuxo.this.submit(new WalletTypeDuxo3.Error(e));
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: WalletTypeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo$submit$1$1", m3645f = "WalletTypeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo$submit$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<WalletTypeDataState, Continuation<? super WalletTypeDataState>, Object> {
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
            public final Object invoke(WalletTypeDataState walletTypeDataState, Continuation<? super WalletTypeDataState> continuation) {
                return ((AnonymousClass1) create(walletTypeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return WalletTypeDataState.copy$default((WalletTypeDataState) this.L$0, true, null, null, 6, null);
            }
        }

        /* compiled from: WalletTypeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo$submit$1$2", m3645f = "WalletTypeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo$submit$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<WalletTypeDataState, Continuation<? super WalletTypeDataState>, Object> {
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
            public final Object invoke(WalletTypeDataState walletTypeDataState, Continuation<? super WalletTypeDataState> continuation) {
                return ((AnonymousClass2) create(walletTypeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return WalletTypeDataState.copy$default((WalletTypeDataState) this.L$0, false, null, null, 6, null);
            }
        }

        /* compiled from: WalletTypeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo$submit$1$3", m3645f = "WalletTypeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo$submit$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<WalletTypeDataState, Continuation<? super WalletTypeDataState>, Object> {
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
            public final Object invoke(WalletTypeDataState walletTypeDataState, Continuation<? super WalletTypeDataState> continuation) {
                return ((AnonymousClass3) create(walletTypeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return WalletTypeDataState.copy$default((WalletTypeDataState) this.L$0, false, null, null, 6, null);
            }
        }
    }

    public final void submit(UUID verificationId, VerificationType verificationType, WalletType walletType) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        Intrinsics.checkNotNullParameter(walletType, "walletType");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C385651(verificationType, verificationId, walletType, null), 3, null);
    }
}
