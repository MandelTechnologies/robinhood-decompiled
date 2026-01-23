package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferFundsDeepLink.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B¯\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u00106\u001a\u000207J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000207R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010-\u001a\u0004\b.\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLink;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "fromAccountId", "", "toAccountId", "fromAccountType", "Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "toAccountType", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "direction", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "minDepositAmount", "", "minDepositRate", "promotionName", "promotionType", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "deepLinkMetadata", "Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/bonfire/TransferFrequency;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;Lcom/robinhood/models/api/bonfire/IraContributionType;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;)V", "getAmount", "()Ljava/math/BigDecimal;", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getFromAccountId", "()Ljava/lang/String;", "getToAccountId", "getFromAccountType", "()Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "getToAccountType", "getIraContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "getDirection", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "getMinDepositAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinDepositRate", "getPromotionName", "getPromotionType", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "getDeepLinkMetadata", "()Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TransferFundsDeepLink implements IntentKey, Parcelable {
    public static final Parcelable.Creator<TransferFundsDeepLink> CREATOR = new Creator();
    private final BigDecimal amount;
    private final TransfersDeepLinkMetadata deepLinkMetadata;
    private final TransferDirectionV2 direction;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final String entryPointLoggingIdentifier;
    private final ApiCreateTransferRequest2 frequency;
    private final String fromAccountId;
    private final TransferFundsDeepLinkAccountType fromAccountType;
    private final IraContributionType iraContributionType;
    private final Double minDepositAmount;
    private final Double minDepositRate;
    private final String promotionName;
    private final String promotionType;
    private final String toAccountId;
    private final TransferFundsDeepLinkAccountType toAccountType;

    /* compiled from: TransferFundsDeepLink.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<TransferFundsDeepLink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferFundsDeepLink createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferFundsDeepLink((BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : ApiCreateTransferRequest2.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TransferFundsDeepLinkAccountType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TransferFundsDeepLinkAccountType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : IraContributionType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TransferDirectionV2.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), MAXTransferContext.EntryPoint.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? TransfersDeepLinkMetadata.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferFundsDeepLink[] newArray(int i) {
            return new TransferFundsDeepLink[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.amount);
        ApiCreateTransferRequest2 apiCreateTransferRequest2 = this.frequency;
        if (apiCreateTransferRequest2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(apiCreateTransferRequest2.name());
        }
        dest.writeString(this.fromAccountId);
        dest.writeString(this.toAccountId);
        TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType = this.fromAccountType;
        if (transferFundsDeepLinkAccountType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(transferFundsDeepLinkAccountType.name());
        }
        TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType2 = this.toAccountType;
        if (transferFundsDeepLinkAccountType2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(transferFundsDeepLinkAccountType2.name());
        }
        IraContributionType iraContributionType = this.iraContributionType;
        if (iraContributionType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iraContributionType.name());
        }
        TransferDirectionV2 transferDirectionV2 = this.direction;
        if (transferDirectionV2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(transferDirectionV2.name());
        }
        Double d = this.minDepositAmount;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
        Double d2 = this.minDepositRate;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
        dest.writeString(this.promotionName);
        dest.writeString(this.promotionType);
        dest.writeString(this.entryPoint.name());
        dest.writeString(this.entryPointLoggingIdentifier);
        TransfersDeepLinkMetadata transfersDeepLinkMetadata = this.deepLinkMetadata;
        if (transfersDeepLinkMetadata == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transfersDeepLinkMetadata.writeToParcel(dest, flags);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public TransferFundsDeepLink(BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, String str, String str2, TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType, TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType2, IraContributionType iraContributionType, TransferDirectionV2 transferDirectionV2, Double d, Double d2, String str3, String str4, MAXTransferContext.EntryPoint entryPoint, String str5, TransfersDeepLinkMetadata transfersDeepLinkMetadata) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.amount = bigDecimal;
        this.frequency = apiCreateTransferRequest2;
        this.fromAccountId = str;
        this.toAccountId = str2;
        this.fromAccountType = transferFundsDeepLinkAccountType;
        this.toAccountType = transferFundsDeepLinkAccountType2;
        this.iraContributionType = iraContributionType;
        this.direction = transferDirectionV2;
        this.minDepositAmount = d;
        this.minDepositRate = d2;
        this.promotionName = str3;
        this.promotionType = str4;
        this.entryPoint = entryPoint;
        this.entryPointLoggingIdentifier = str5;
        this.deepLinkMetadata = transfersDeepLinkMetadata;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public final String getFromAccountId() {
        return this.fromAccountId;
    }

    public final String getToAccountId() {
        return this.toAccountId;
    }

    public final TransferFundsDeepLinkAccountType getFromAccountType() {
        return this.fromAccountType;
    }

    public final TransferFundsDeepLinkAccountType getToAccountType() {
        return this.toAccountType;
    }

    public final IraContributionType getIraContributionType() {
        return this.iraContributionType;
    }

    public final TransferDirectionV2 getDirection() {
        return this.direction;
    }

    public final Double getMinDepositAmount() {
        return this.minDepositAmount;
    }

    public final Double getMinDepositRate() {
        return this.minDepositRate;
    }

    public final String getPromotionName() {
        return this.promotionName;
    }

    public final String getPromotionType() {
        return this.promotionType;
    }

    public /* synthetic */ TransferFundsDeepLink(BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, String str, String str2, TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType, TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType2, IraContributionType iraContributionType, TransferDirectionV2 transferDirectionV2, Double d, Double d2, String str3, String str4, MAXTransferContext.EntryPoint entryPoint, String str5, TransfersDeepLinkMetadata transfersDeepLinkMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, apiCreateTransferRequest2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, transferFundsDeepLinkAccountType, transferFundsDeepLinkAccountType2, (i & 64) != 0 ? null : iraContributionType, (i & 128) != 0 ? null : transferDirectionV2, (i & 256) != 0 ? null : d, (i & 512) != 0 ? null : d2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 8192) != 0 ? null : str5, transfersDeepLinkMetadata);
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final String getEntryPointLoggingIdentifier() {
        return this.entryPointLoggingIdentifier;
    }

    public final TransfersDeepLinkMetadata getDeepLinkMetadata() {
        return this.deepLinkMetadata;
    }
}
