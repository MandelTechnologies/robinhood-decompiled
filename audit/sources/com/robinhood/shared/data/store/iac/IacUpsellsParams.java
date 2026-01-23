package com.robinhood.shared.data.store.iac;

import com.robinhood.models.p355ui.IacUpsellLocation;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacUpsellStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019J`\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/data/store/iac/IacUpsellsParams;", "", "location", "Lcom/robinhood/models/ui/IacUpsellLocation;", "instrumentId", "Ljava/util/UUID;", "orderId", "depositId", "accountNumber", "", "entryPoint", "notificationStatus", "", "<init>", "(Lcom/robinhood/models/ui/IacUpsellLocation;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getLocation", "()Lcom/robinhood/models/ui/IacUpsellLocation;", "getInstrumentId", "()Ljava/util/UUID;", "getOrderId", "getDepositId", "getAccountNumber", "()Ljava/lang/String;", "getEntryPoint", "getNotificationStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/models/ui/IacUpsellLocation;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/shared/data/store/iac/IacUpsellsParams;", "equals", "other", "hashCode", "", "toString", "lib-store-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class IacUpsellsParams {
    private final String accountNumber;
    private final UUID depositId;
    private final String entryPoint;
    private final UUID instrumentId;
    private final IacUpsellLocation location;
    private final Boolean notificationStatus;
    private final UUID orderId;

    public static /* synthetic */ IacUpsellsParams copy$default(IacUpsellsParams iacUpsellsParams, IacUpsellLocation iacUpsellLocation, UUID uuid, UUID uuid2, UUID uuid3, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            iacUpsellLocation = iacUpsellsParams.location;
        }
        if ((i & 2) != 0) {
            uuid = iacUpsellsParams.instrumentId;
        }
        if ((i & 4) != 0) {
            uuid2 = iacUpsellsParams.orderId;
        }
        if ((i & 8) != 0) {
            uuid3 = iacUpsellsParams.depositId;
        }
        if ((i & 16) != 0) {
            str = iacUpsellsParams.accountNumber;
        }
        if ((i & 32) != 0) {
            str2 = iacUpsellsParams.entryPoint;
        }
        if ((i & 64) != 0) {
            bool = iacUpsellsParams.notificationStatus;
        }
        String str3 = str2;
        Boolean bool2 = bool;
        String str4 = str;
        UUID uuid4 = uuid2;
        return iacUpsellsParams.copy(iacUpsellLocation, uuid, uuid4, uuid3, str4, str3, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final IacUpsellLocation getLocation() {
        return this.location;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getDepositId() {
        return this.depositId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getNotificationStatus() {
        return this.notificationStatus;
    }

    public final IacUpsellsParams copy(IacUpsellLocation location, UUID instrumentId, UUID orderId, UUID depositId, String accountNumber, String entryPoint, Boolean notificationStatus) {
        Intrinsics.checkNotNullParameter(location, "location");
        return new IacUpsellsParams(location, instrumentId, orderId, depositId, accountNumber, entryPoint, notificationStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacUpsellsParams)) {
            return false;
        }
        IacUpsellsParams iacUpsellsParams = (IacUpsellsParams) other;
        return this.location == iacUpsellsParams.location && Intrinsics.areEqual(this.instrumentId, iacUpsellsParams.instrumentId) && Intrinsics.areEqual(this.orderId, iacUpsellsParams.orderId) && Intrinsics.areEqual(this.depositId, iacUpsellsParams.depositId) && Intrinsics.areEqual(this.accountNumber, iacUpsellsParams.accountNumber) && Intrinsics.areEqual(this.entryPoint, iacUpsellsParams.entryPoint) && Intrinsics.areEqual(this.notificationStatus, iacUpsellsParams.notificationStatus);
    }

    public int hashCode() {
        int iHashCode = this.location.hashCode() * 31;
        UUID uuid = this.instrumentId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.orderId;
        int iHashCode3 = (iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        UUID uuid3 = this.depositId;
        int iHashCode4 = (iHashCode3 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
        String str = this.accountNumber;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entryPoint;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.notificationStatus;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "IacUpsellsParams(location=" + this.location + ", instrumentId=" + this.instrumentId + ", orderId=" + this.orderId + ", depositId=" + this.depositId + ", accountNumber=" + this.accountNumber + ", entryPoint=" + this.entryPoint + ", notificationStatus=" + this.notificationStatus + ")";
    }

    public IacUpsellsParams(IacUpsellLocation location, UUID uuid, UUID uuid2, UUID uuid3, String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.location = location;
        this.instrumentId = uuid;
        this.orderId = uuid2;
        this.depositId = uuid3;
        this.accountNumber = str;
        this.entryPoint = str2;
        this.notificationStatus = bool;
    }

    public final IacUpsellLocation getLocation() {
        return this.location;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final UUID getDepositId() {
        return this.depositId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final Boolean getNotificationStatus() {
        return this.notificationStatus;
    }
}
