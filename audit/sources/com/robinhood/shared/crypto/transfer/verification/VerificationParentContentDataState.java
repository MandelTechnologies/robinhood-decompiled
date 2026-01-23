package com.robinhood.shared.crypto.transfer.verification;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.options.comboorders.detail.TestTags;
import com.robinhood.models.api.transfer.ApiCryptoVaspResponse;
import com.robinhood.models.api.transfer.verification.TransferCategory;
import com.robinhood.models.api.transfer.verification.WalletType;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationParentContentDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÂ\u0003J[\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDataState;", "", "args", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey;", "transferCategory", "Lcom/robinhood/models/api/transfer/verification/TransferCategory;", "walletType", "Lcom/robinhood/models/api/transfer/verification/WalletType;", "firstName", "", "lastName", "dateOfBirth", "vasp", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey;Lcom/robinhood/models/api/transfer/verification/TransferCategory;Lcom/robinhood/models/api/transfer/verification/WalletType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;)V", "getArgs", "()Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey;", "verificationId", "Ljava/util/UUID;", "getVerificationId", "()Ljava/util/UUID;", "transferId", "getTransferId", TestTags.LOADED, "", "getLoaded", "()Z", "type", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "getType", "()Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;", "getLoggingContext", "()Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class VerificationParentContentDataState {
    public static final int $stable = 8;
    private final CryptoTransferVerificationIntentKey args;
    private final String dateOfBirth;
    private final String firstName;
    private final String lastName;
    private final TransferCategory transferCategory;
    private final ApiCryptoVaspResponse.Vasp vasp;
    private final WalletType walletType;

    /* renamed from: component2, reason: from getter */
    private final TransferCategory getTransferCategory() {
        return this.transferCategory;
    }

    /* renamed from: component3, reason: from getter */
    private final WalletType getWalletType() {
        return this.walletType;
    }

    /* renamed from: component4, reason: from getter */
    private final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component5, reason: from getter */
    private final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component6, reason: from getter */
    private final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* renamed from: component7, reason: from getter */
    private final ApiCryptoVaspResponse.Vasp getVasp() {
        return this.vasp;
    }

    public static /* synthetic */ VerificationParentContentDataState copy$default(VerificationParentContentDataState verificationParentContentDataState, CryptoTransferVerificationIntentKey cryptoTransferVerificationIntentKey, TransferCategory transferCategory, WalletType walletType, String str, String str2, String str3, ApiCryptoVaspResponse.Vasp vasp, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoTransferVerificationIntentKey = verificationParentContentDataState.args;
        }
        if ((i & 2) != 0) {
            transferCategory = verificationParentContentDataState.transferCategory;
        }
        if ((i & 4) != 0) {
            walletType = verificationParentContentDataState.walletType;
        }
        if ((i & 8) != 0) {
            str = verificationParentContentDataState.firstName;
        }
        if ((i & 16) != 0) {
            str2 = verificationParentContentDataState.lastName;
        }
        if ((i & 32) != 0) {
            str3 = verificationParentContentDataState.dateOfBirth;
        }
        if ((i & 64) != 0) {
            vasp = verificationParentContentDataState.vasp;
        }
        String str4 = str3;
        ApiCryptoVaspResponse.Vasp vasp2 = vasp;
        String str5 = str2;
        WalletType walletType2 = walletType;
        return verificationParentContentDataState.copy(cryptoTransferVerificationIntentKey, transferCategory, walletType2, str, str5, str4, vasp2);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoTransferVerificationIntentKey getArgs() {
        return this.args;
    }

    public final VerificationParentContentDataState copy(CryptoTransferVerificationIntentKey args, TransferCategory transferCategory, WalletType walletType, String firstName, String lastName, String dateOfBirth, ApiCryptoVaspResponse.Vasp vasp) {
        Intrinsics.checkNotNullParameter(args, "args");
        return new VerificationParentContentDataState(args, transferCategory, walletType, firstName, lastName, dateOfBirth, vasp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationParentContentDataState)) {
            return false;
        }
        VerificationParentContentDataState verificationParentContentDataState = (VerificationParentContentDataState) other;
        return Intrinsics.areEqual(this.args, verificationParentContentDataState.args) && this.transferCategory == verificationParentContentDataState.transferCategory && this.walletType == verificationParentContentDataState.walletType && Intrinsics.areEqual(this.firstName, verificationParentContentDataState.firstName) && Intrinsics.areEqual(this.lastName, verificationParentContentDataState.lastName) && Intrinsics.areEqual(this.dateOfBirth, verificationParentContentDataState.dateOfBirth) && Intrinsics.areEqual(this.vasp, verificationParentContentDataState.vasp);
    }

    public int hashCode() {
        int iHashCode = this.args.hashCode() * 31;
        TransferCategory transferCategory = this.transferCategory;
        int iHashCode2 = (iHashCode + (transferCategory == null ? 0 : transferCategory.hashCode())) * 31;
        WalletType walletType = this.walletType;
        int iHashCode3 = (iHashCode2 + (walletType == null ? 0 : walletType.hashCode())) * 31;
        String str = this.firstName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dateOfBirth;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ApiCryptoVaspResponse.Vasp vasp = this.vasp;
        return iHashCode6 + (vasp != null ? vasp.hashCode() : 0);
    }

    public String toString() {
        return "VerificationParentContentDataState(args=" + this.args + ", transferCategory=" + this.transferCategory + ", walletType=" + this.walletType + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ", vasp=" + this.vasp + ")";
    }

    public VerificationParentContentDataState(CryptoTransferVerificationIntentKey args, TransferCategory transferCategory, WalletType walletType, String str, String str2, String str3, ApiCryptoVaspResponse.Vasp vasp) {
        Intrinsics.checkNotNullParameter(args, "args");
        this.args = args;
        this.transferCategory = transferCategory;
        this.walletType = walletType;
        this.firstName = str;
        this.lastName = str2;
        this.dateOfBirth = str3;
        this.vasp = vasp;
    }

    public /* synthetic */ VerificationParentContentDataState(CryptoTransferVerificationIntentKey cryptoTransferVerificationIntentKey, TransferCategory transferCategory, WalletType walletType, String str, String str2, String str3, ApiCryptoVaspResponse.Vasp vasp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoTransferVerificationIntentKey, (i & 2) != 0 ? null : transferCategory, (i & 4) != 0 ? null : walletType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : vasp);
    }

    public final CryptoTransferVerificationIntentKey getArgs() {
        return this.args;
    }

    public final UUID getVerificationId() {
        return this.args.getVerificationId();
    }

    public final UUID getTransferId() {
        CryptoTransferVerificationIntentKey cryptoTransferVerificationIntentKey = this.args;
        CryptoTransferVerificationIntentKey.Deeplink deeplink = cryptoTransferVerificationIntentKey instanceof CryptoTransferVerificationIntentKey.Deeplink ? (CryptoTransferVerificationIntentKey.Deeplink) cryptoTransferVerificationIntentKey : null;
        if (deeplink != null) {
            return deeplink.getTransferId();
        }
        return null;
    }

    public final boolean getLoaded() {
        CryptoTransferVerificationIntentKey cryptoTransferVerificationIntentKey = this.args;
        if ((cryptoTransferVerificationIntentKey instanceof CryptoTransferVerificationIntentKey.Deeplink) || (cryptoTransferVerificationIntentKey instanceof CryptoTransferVerificationIntentKey.Withdrawal)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final VerificationType getType() {
        CryptoTransferVerificationIntentKey cryptoTransferVerificationIntentKey = this.args;
        if (cryptoTransferVerificationIntentKey instanceof CryptoTransferVerificationIntentKey.Deeplink) {
            return VerificationType.DEPOSIT;
        }
        if (cryptoTransferVerificationIntentKey instanceof CryptoTransferVerificationIntentKey.Withdrawal) {
            return VerificationType.WITHDRAWAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final CryptoTransferVerificationIntentKey.LoggingContext getLoggingContext() {
        return this.args.getLoggingContext();
    }
}
