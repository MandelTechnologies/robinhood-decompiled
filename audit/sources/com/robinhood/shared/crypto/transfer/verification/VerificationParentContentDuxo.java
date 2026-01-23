package com.robinhood.shared.crypto.transfer.verification;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.duxo.DuxoComposableCompanion;
import com.robinhood.models.api.transfer.ApiCryptoVaspResponse;
import com.robinhood.models.api.transfer.verification.TransferCategory;
import com.robinhood.models.api.transfer.verification.WalletType;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey;
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

/* compiled from: VerificationParentContentDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDataState;", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "update", "", "transferCategory", "Lcom/robinhood/models/api/transfer/verification/TransferCategory;", "walletType", "Lcom/robinhood/models/api/transfer/verification/WalletType;", "firstName", "", "lastName", "dateOfBirth", "vasp", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class VerificationParentContentDuxo extends BaseDuxo<VerificationParentContentDataState, VerificationParentContentViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationParentContentDuxo(DuxoBundle duxoBundle, VerificationParentContentDuxo3 stateProvider, SavedStateHandle savedStateHandle) {
        super(new VerificationParentContentDataState((CryptoTransferVerificationIntentKey) INSTANCE.getArgs(savedStateHandle), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: VerificationParentContentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.VerificationParentContentDuxo$update$1", m3645f = "VerificationParentContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentContentDuxo$update$1 */
    static final class C384961 extends ContinuationImpl7 implements Function2<VerificationParentContentDataState, Continuation<? super VerificationParentContentDataState>, Object> {
        final /* synthetic */ TransferCategory $transferCategory;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C384961(TransferCategory transferCategory, Continuation<? super C384961> continuation) {
            super(2, continuation);
            this.$transferCategory = transferCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C384961 c384961 = new C384961(this.$transferCategory, continuation);
            c384961.L$0 = obj;
            return c384961;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerificationParentContentDataState verificationParentContentDataState, Continuation<? super VerificationParentContentDataState> continuation) {
            return ((C384961) create(verificationParentContentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerificationParentContentDataState.copy$default((VerificationParentContentDataState) this.L$0, null, this.$transferCategory, null, null, null, null, null, 125, null);
        }
    }

    public final void update(TransferCategory transferCategory) {
        Intrinsics.checkNotNullParameter(transferCategory, "transferCategory");
        applyMutation(new C384961(transferCategory, null));
    }

    /* compiled from: VerificationParentContentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.VerificationParentContentDuxo$update$2", m3645f = "VerificationParentContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentContentDuxo$update$2 */
    static final class C384972 extends ContinuationImpl7 implements Function2<VerificationParentContentDataState, Continuation<? super VerificationParentContentDataState>, Object> {
        final /* synthetic */ WalletType $walletType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C384972(WalletType walletType, Continuation<? super C384972> continuation) {
            super(2, continuation);
            this.$walletType = walletType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C384972 c384972 = new C384972(this.$walletType, continuation);
            c384972.L$0 = obj;
            return c384972;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerificationParentContentDataState verificationParentContentDataState, Continuation<? super VerificationParentContentDataState> continuation) {
            return ((C384972) create(verificationParentContentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerificationParentContentDataState.copy$default((VerificationParentContentDataState) this.L$0, null, null, this.$walletType, null, null, null, null, 123, null);
        }
    }

    public final void update(WalletType walletType) {
        Intrinsics.checkNotNullParameter(walletType, "walletType");
        applyMutation(new C384972(walletType, null));
    }

    /* compiled from: VerificationParentContentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.VerificationParentContentDuxo$update$3", m3645f = "VerificationParentContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentContentDuxo$update$3 */
    static final class C384983 extends ContinuationImpl7 implements Function2<VerificationParentContentDataState, Continuation<? super VerificationParentContentDataState>, Object> {
        final /* synthetic */ String $firstName;
        final /* synthetic */ String $lastName;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C384983(String str, String str2, Continuation<? super C384983> continuation) {
            super(2, continuation);
            this.$firstName = str;
            this.$lastName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C384983 c384983 = new C384983(this.$firstName, this.$lastName, continuation);
            c384983.L$0 = obj;
            return c384983;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerificationParentContentDataState verificationParentContentDataState, Continuation<? super VerificationParentContentDataState> continuation) {
            return ((C384983) create(verificationParentContentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerificationParentContentDataState.copy$default((VerificationParentContentDataState) this.L$0, null, null, null, this.$firstName, this.$lastName, null, null, 103, null);
        }
    }

    public final void update(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        applyMutation(new C384983(firstName, lastName, null));
    }

    /* compiled from: VerificationParentContentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.VerificationParentContentDuxo$update$4", m3645f = "VerificationParentContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentContentDuxo$update$4 */
    static final class C384994 extends ContinuationImpl7 implements Function2<VerificationParentContentDataState, Continuation<? super VerificationParentContentDataState>, Object> {
        final /* synthetic */ String $dateOfBirth;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C384994(String str, Continuation<? super C384994> continuation) {
            super(2, continuation);
            this.$dateOfBirth = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C384994 c384994 = new C384994(this.$dateOfBirth, continuation);
            c384994.L$0 = obj;
            return c384994;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerificationParentContentDataState verificationParentContentDataState, Continuation<? super VerificationParentContentDataState> continuation) {
            return ((C384994) create(verificationParentContentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerificationParentContentDataState.copy$default((VerificationParentContentDataState) this.L$0, null, null, null, null, null, this.$dateOfBirth, null, 95, null);
        }
    }

    public final void update(String dateOfBirth) {
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        applyMutation(new C384994(dateOfBirth, null));
    }

    /* compiled from: VerificationParentContentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.VerificationParentContentDuxo$update$5", m3645f = "VerificationParentContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentContentDuxo$update$5 */
    static final class C385005 extends ContinuationImpl7 implements Function2<VerificationParentContentDataState, Continuation<? super VerificationParentContentDataState>, Object> {
        final /* synthetic */ ApiCryptoVaspResponse.Vasp $vasp;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C385005(ApiCryptoVaspResponse.Vasp vasp, Continuation<? super C385005> continuation) {
            super(2, continuation);
            this.$vasp = vasp;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C385005 c385005 = new C385005(this.$vasp, continuation);
            c385005.L$0 = obj;
            return c385005;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerificationParentContentDataState verificationParentContentDataState, Continuation<? super VerificationParentContentDataState> continuation) {
            return ((C385005) create(verificationParentContentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerificationParentContentDataState.copy$default((VerificationParentContentDataState) this.L$0, null, null, null, null, null, null, this.$vasp, 63, null);
        }
    }

    public final void update(ApiCryptoVaspResponse.Vasp vasp) {
        Intrinsics.checkNotNullParameter(vasp, "vasp");
        applyMutation(new C385005(vasp, null));
    }

    /* compiled from: VerificationParentContentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDuxo$Companion;", "Lcom/robinhood/compose/duxo/DuxoComposableCompanion;", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDuxo;", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoComposableCompanion<VerificationParentContentDuxo, CryptoTransferVerificationIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public CryptoTransferVerificationIntentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTransferVerificationIntentKey) DuxoComposableCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public CryptoTransferVerificationIntentKey getArgs(VerificationParentContentDuxo verificationParentContentDuxo) {
            return (CryptoTransferVerificationIntentKey) DuxoComposableCompanion.DefaultImpls.getArgs(this, verificationParentContentDuxo);
        }
    }
}
