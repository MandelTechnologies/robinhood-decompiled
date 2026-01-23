package com.robinhood.shared.crypto.transfer.verification.type;

import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse3;
import com.robinhood.models.api.transfer.verification.TransferCategory;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletTypeDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÂ\u0003J+\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeDataState;", "", "loading", "", "checkIfHostedInfo", "Lcom/robinhood/models/api/transfer/verification/NextStepData$CheckIfHosted;", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "<init>", "(ZLcom/robinhood/models/api/transfer/verification/NextStepData$CheckIfHosted;Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;)V", "getLoading", "()Z", "shimmer", "getShimmer", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "decentralizedSubtitle", "getDecentralizedSubtitle", "decentralizedOptionEnabled", "getDecentralizedOptionEnabled", "interfaceEnabled", "getInterfaceEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class WalletTypeDataState {
    private final ApiCryptoVerificationResponse3.CheckIfHosted checkIfHostedInfo;
    private final boolean loading;
    private final VerificationType verificationType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final String maxAmount = Money.format$default(Money3.toMoney(new BigDecimal("1000"), Currencies.EUR), CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), false, null, false, 0, null, false, null, false, false, 1022, null);

    /* compiled from: WalletTypeDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationType.values().length];
            try {
                iArr[VerificationType.WITHDRAWAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationType.DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WalletTypeDataState() {
        this(false, null, null, 7, null);
    }

    /* renamed from: component2, reason: from getter */
    private final ApiCryptoVerificationResponse3.CheckIfHosted getCheckIfHostedInfo() {
        return this.checkIfHostedInfo;
    }

    /* renamed from: component3, reason: from getter */
    private final VerificationType getVerificationType() {
        return this.verificationType;
    }

    public static /* synthetic */ WalletTypeDataState copy$default(WalletTypeDataState walletTypeDataState, boolean z, ApiCryptoVerificationResponse3.CheckIfHosted checkIfHosted, VerificationType verificationType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = walletTypeDataState.loading;
        }
        if ((i & 2) != 0) {
            checkIfHosted = walletTypeDataState.checkIfHostedInfo;
        }
        if ((i & 4) != 0) {
            verificationType = walletTypeDataState.verificationType;
        }
        return walletTypeDataState.copy(z, checkIfHosted, verificationType);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final WalletTypeDataState copy(boolean loading, ApiCryptoVerificationResponse3.CheckIfHosted checkIfHostedInfo, VerificationType verificationType) {
        return new WalletTypeDataState(loading, checkIfHostedInfo, verificationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletTypeDataState)) {
            return false;
        }
        WalletTypeDataState walletTypeDataState = (WalletTypeDataState) other;
        return this.loading == walletTypeDataState.loading && Intrinsics.areEqual(this.checkIfHostedInfo, walletTypeDataState.checkIfHostedInfo) && this.verificationType == walletTypeDataState.verificationType;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        ApiCryptoVerificationResponse3.CheckIfHosted checkIfHosted = this.checkIfHostedInfo;
        int iHashCode2 = (iHashCode + (checkIfHosted == null ? 0 : checkIfHosted.hashCode())) * 31;
        VerificationType verificationType = this.verificationType;
        return iHashCode2 + (verificationType != null ? verificationType.hashCode() : 0);
    }

    public String toString() {
        return "WalletTypeDataState(loading=" + this.loading + ", checkIfHostedInfo=" + this.checkIfHostedInfo + ", verificationType=" + this.verificationType + ")";
    }

    public WalletTypeDataState(boolean z, ApiCryptoVerificationResponse3.CheckIfHosted checkIfHosted, VerificationType verificationType) {
        this.loading = z;
        this.checkIfHostedInfo = checkIfHosted;
        this.verificationType = verificationType;
    }

    public /* synthetic */ WalletTypeDataState(boolean z, ApiCryptoVerificationResponse3.CheckIfHosted checkIfHosted, VerificationType verificationType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : checkIfHosted, (i & 4) != 0 ? null : verificationType);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getShimmer() {
        return this.verificationType == null || this.checkIfHostedInfo == null;
    }

    public final StringResource getTitle() {
        VerificationType verificationType = this.verificationType;
        int i = verificationType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C37934R.string.withdrawal_destination_title, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C37934R.string.deposit_destination_title, new Object[0]);
        }
        return StringResource.INSTANCE.invoke("");
    }

    public final StringResource getDecentralizedSubtitle() {
        ApiCryptoVerificationResponse3.CheckIfHosted checkIfHosted = this.checkIfHostedInfo;
        if ((checkIfHosted != null ? checkIfHosted.getTransferCategory() : null) == TransferCategory.THIRD_PARTY && !Intrinsics.areEqual(this.checkIfHostedInfo.getDecentralizedWalletTypeAllowed(), Boolean.TRUE)) {
            return StringResource.INSTANCE.invoke(C37934R.string.wallet_type_decentralized_disallowed_subtitle, maxAmount);
        }
        return StringResource.INSTANCE.invoke(C37934R.string.wallet_type_decentralized_subtitle, new Object[0]);
    }

    public final boolean getDecentralizedOptionEnabled() {
        if (getInterfaceEnabled()) {
            ApiCryptoVerificationResponse3.CheckIfHosted checkIfHosted = this.checkIfHostedInfo;
            if (checkIfHosted != null ? Intrinsics.areEqual(checkIfHosted.getDecentralizedWalletTypeAllowed(), Boolean.TRUE) : false) {
                return true;
            }
        }
        return false;
    }

    public final boolean getInterfaceEnabled() {
        return !this.loading;
    }

    /* compiled from: WalletTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeDataState$Companion;", "", "<init>", "()V", "maxAmount", "", "getMaxAmount$feature_crypto_transfer_externalDebug", "()Ljava/lang/String;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getMaxAmount$feature_crypto_transfer_externalDebug() {
            return WalletTypeDataState.maxAmount;
        }
    }
}
