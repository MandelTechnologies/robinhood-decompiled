package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateRecurringDepositKey.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003JG\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/UpdateRecurringDepositKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "transferId", "", "amount", "Ljava/math/BigDecimal;", "sourceAccountId", "Ljava/util/UUID;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "entrypoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entrypointLoggingIdentifier", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/UUID;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;)V", "getTransferId", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "getSourceAccountId", "()Ljava/util/UUID;", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getEntrypoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntrypointLoggingIdentifier", "frequencySupported", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class UpdateRecurringDepositKey implements Parcelable, IntentKey {
    public static final Parcelable.Creator<UpdateRecurringDepositKey> CREATOR = new Creator();
    private final BigDecimal amount;
    private final MAXTransferContext.EntryPoint entrypoint;
    private final String entrypointLoggingIdentifier;
    private final ApiCreateTransferRequest2 frequency;
    private final UUID sourceAccountId;
    private final String transferId;

    /* compiled from: UpdateRecurringDepositKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<UpdateRecurringDepositKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateRecurringDepositKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UpdateRecurringDepositKey(parcel.readString(), (BigDecimal) parcel.readSerializable(), (UUID) parcel.readSerializable(), ApiCreateTransferRequest2.valueOf(parcel.readString()), MAXTransferContext.EntryPoint.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateRecurringDepositKey[] newArray(int i) {
            return new UpdateRecurringDepositKey[i];
        }
    }

    public static /* synthetic */ UpdateRecurringDepositKey copy$default(UpdateRecurringDepositKey updateRecurringDepositKey, String str, BigDecimal bigDecimal, UUID uuid, ApiCreateTransferRequest2 apiCreateTransferRequest2, MAXTransferContext.EntryPoint entryPoint, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateRecurringDepositKey.transferId;
        }
        if ((i & 2) != 0) {
            bigDecimal = updateRecurringDepositKey.amount;
        }
        if ((i & 4) != 0) {
            uuid = updateRecurringDepositKey.sourceAccountId;
        }
        if ((i & 8) != 0) {
            apiCreateTransferRequest2 = updateRecurringDepositKey.frequency;
        }
        if ((i & 16) != 0) {
            entryPoint = updateRecurringDepositKey.entrypoint;
        }
        if ((i & 32) != 0) {
            str2 = updateRecurringDepositKey.entrypointLoggingIdentifier;
        }
        MAXTransferContext.EntryPoint entryPoint2 = entryPoint;
        String str3 = str2;
        return updateRecurringDepositKey.copy(str, bigDecimal, uuid, apiCreateTransferRequest2, entryPoint2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getSourceAccountId() {
        return this.sourceAccountId;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    /* renamed from: component5, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntrypoint() {
        return this.entrypoint;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEntrypointLoggingIdentifier() {
        return this.entrypointLoggingIdentifier;
    }

    public final UpdateRecurringDepositKey copy(String transferId, BigDecimal amount, UUID sourceAccountId, ApiCreateTransferRequest2 frequency, MAXTransferContext.EntryPoint entrypoint, String entrypointLoggingIdentifier) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        Intrinsics.checkNotNullParameter(entrypointLoggingIdentifier, "entrypointLoggingIdentifier");
        return new UpdateRecurringDepositKey(transferId, amount, sourceAccountId, frequency, entrypoint, entrypointLoggingIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateRecurringDepositKey)) {
            return false;
        }
        UpdateRecurringDepositKey updateRecurringDepositKey = (UpdateRecurringDepositKey) other;
        return Intrinsics.areEqual(this.transferId, updateRecurringDepositKey.transferId) && Intrinsics.areEqual(this.amount, updateRecurringDepositKey.amount) && Intrinsics.areEqual(this.sourceAccountId, updateRecurringDepositKey.sourceAccountId) && this.frequency == updateRecurringDepositKey.frequency && this.entrypoint == updateRecurringDepositKey.entrypoint && Intrinsics.areEqual(this.entrypointLoggingIdentifier, updateRecurringDepositKey.entrypointLoggingIdentifier);
    }

    public int hashCode() {
        int iHashCode = ((this.transferId.hashCode() * 31) + this.amount.hashCode()) * 31;
        UUID uuid = this.sourceAccountId;
        return ((((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.frequency.hashCode()) * 31) + this.entrypoint.hashCode()) * 31) + this.entrypointLoggingIdentifier.hashCode();
    }

    public String toString() {
        return "UpdateRecurringDepositKey(transferId=" + this.transferId + ", amount=" + this.amount + ", sourceAccountId=" + this.sourceAccountId + ", frequency=" + this.frequency + ", entrypoint=" + this.entrypoint + ", entrypointLoggingIdentifier=" + this.entrypointLoggingIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.transferId);
        dest.writeSerializable(this.amount);
        dest.writeSerializable(this.sourceAccountId);
        dest.writeString(this.frequency.name());
        dest.writeString(this.entrypoint.name());
        dest.writeString(this.entrypointLoggingIdentifier);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public UpdateRecurringDepositKey(String transferId, BigDecimal amount, UUID uuid, ApiCreateTransferRequest2 frequency, MAXTransferContext.EntryPoint entrypoint, String entrypointLoggingIdentifier) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        Intrinsics.checkNotNullParameter(entrypointLoggingIdentifier, "entrypointLoggingIdentifier");
        this.transferId = transferId;
        this.amount = amount;
        this.sourceAccountId = uuid;
        this.frequency = frequency;
        this.entrypoint = entrypoint;
        this.entrypointLoggingIdentifier = entrypointLoggingIdentifier;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UpdateRecurringDepositKey(String str, BigDecimal bigDecimal, UUID uuid, ApiCreateTransferRequest2 apiCreateTransferRequest2, MAXTransferContext.EntryPoint entryPoint, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        BigDecimal bigDecimal2 = (i & 2) != 0 ? BigDecimal.ZERO : bigDecimal;
        UUID uuid2 = (i & 4) != 0 ? null : uuid;
        if ((i & 32) != 0) {
            str2 = entryPoint.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
        }
        this(str, bigDecimal2, uuid2, apiCreateTransferRequest2, entryPoint, str2);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final UUID getSourceAccountId() {
        return this.sourceAccountId;
    }

    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public final MAXTransferContext.EntryPoint getEntrypoint() {
        return this.entrypoint;
    }

    public final String getEntrypointLoggingIdentifier() {
        return this.entrypointLoggingIdentifier;
    }

    public final boolean frequencySupported() {
        return this.frequency != ApiCreateTransferRequest2.ONCE;
    }
}
