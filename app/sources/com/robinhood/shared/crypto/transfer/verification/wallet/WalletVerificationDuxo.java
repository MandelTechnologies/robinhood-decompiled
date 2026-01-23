package com.robinhood.shared.crypto.transfer.verification.wallet;

import android.net.Uri;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.transfer.ApiCryptoTransferHistoryDetailResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoWithdrawalVerificationRequest;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.shared.crypto.transfer.verification.VerificationType2;
import com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationDuxo2;
import com.robinhood.shared.lib.crypto.transfer.CatPayIntentKeyGenerator;
import com.robinhood.targetbackend.TargetBackend;
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

/* compiled from: WalletVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/targetbackend/TargetBackend;)V", "bind", "verificationId", "Ljava/util/UUID;", "isDay", "", "submit", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class WalletVerificationDuxo extends BaseDuxo5<Unit, WalletVerificationDuxo2> {
    public static final int $stable = 8;
    private final CryptoTransfersStore cryptoTransfersStore;
    private final TargetBackend targetBackend;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletVerificationDuxo(DuxoBundle duxoBundle, CryptoTransfersStore cryptoTransfersStore, TargetBackend targetBackend) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.targetBackend = targetBackend;
    }

    public final void bind(UUID verificationId, boolean isDay) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Uri uriBuild = new Uri.Builder().appendQueryParameter("variant", "travelrule").appendQueryParameter("addressOwnershipId", verificationId.toString()).appendQueryParameter("locale", CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale().toString()).appendQueryParameter("theme", isDay ? "light" : "dark").build();
        TargetBackend targetBackend = this.targetBackend;
        Intrinsics.checkNotNull(uriBuild);
        submit(new WalletVerificationDuxo2.Load(CatPayIntentKeyGenerator.generateCatPayIntentKey(targetBackend, uriBuild)));
    }

    /* compiled from: WalletVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationDuxo$submit$1", m3645f = "WalletVerificationDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationDuxo$submit$1 */
    static final class C385711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $verificationId;
        final /* synthetic */ VerificationType $verificationType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C385711(VerificationType verificationType, UUID uuid, Continuation<? super C385711> continuation) {
            super(2, continuation);
            this.$verificationType = verificationType;
            this.$verificationId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WalletVerificationDuxo.this.new C385711(this.$verificationType, this.$verificationId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C385711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoTransfersStore cryptoTransfersStore = WalletVerificationDuxo.this.cryptoTransfersStore;
                    ApiCryptoTransferHistoryDetailResponse.Type serverType = VerificationType2.getServerType(this.$verificationType);
                    UUID uuid = this.$verificationId;
                    ApiCryptoWithdrawalVerificationRequest apiCryptoWithdrawalVerificationRequest = new ApiCryptoWithdrawalVerificationRequest(null, null, null, null, null, 31, null);
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
                WalletVerificationDuxo.this.submit(new WalletVerificationDuxo2.Success((ApiCryptoVerificationResponse) obj));
            } catch (Exception e) {
                if (Throwables.isNetworkRelated(e)) {
                    WalletVerificationDuxo.this.submit(new WalletVerificationDuxo2.Error(e));
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void submit(UUID verificationId, VerificationType verificationType) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C385711(verificationType, verificationId, null), 3, null);
    }
}
