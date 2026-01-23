package com.robinhood.shared.data.store.iac;

import com.robinhood.models.p320db.IacInfoBannerLocation;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacInfoBannerStore.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010!\u001a\u0004\u0018\u00010\u0006J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0091\u0001\u0010-\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00064"}, m3636d2 = {"Lcom/robinhood/shared/data/store/iac/IacInfoBannersBatchParams;", "", "locations", "", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "instrumentId", "Ljava/util/UUID;", "currencyPairId", "perpetualContractId", "optionChainId", "listId", "eventId", "futuresContractId", "optionStrategyCode", "", "accountNumber", "orderId", "<init>", "(Ljava/util/List;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getLocations", "()Ljava/util/List;", "getInstrumentId", "()Ljava/util/UUID;", "getCurrencyPairId", "getPerpetualContractId", "getOptionChainId", "getListId", "getEventId", "getFuturesContractId", "getOptionStrategyCode", "()Ljava/lang/String;", "getAccountNumber", "getOrderId", "getLocationId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class IacInfoBannersBatchParams {
    private final String accountNumber;
    private final UUID currencyPairId;
    private final UUID eventId;
    private final UUID futuresContractId;
    private final UUID instrumentId;
    private final UUID listId;
    private final List<IacInfoBannerLocation> locations;
    private final UUID optionChainId;
    private final String optionStrategyCode;
    private final UUID orderId;
    private final UUID perpetualContractId;

    public static /* synthetic */ IacInfoBannersBatchParams copy$default(IacInfoBannersBatchParams iacInfoBannersBatchParams, List list, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, UUID uuid5, UUID uuid6, UUID uuid7, String str, String str2, UUID uuid8, int i, Object obj) {
        if ((i & 1) != 0) {
            list = iacInfoBannersBatchParams.locations;
        }
        if ((i & 2) != 0) {
            uuid = iacInfoBannersBatchParams.instrumentId;
        }
        if ((i & 4) != 0) {
            uuid2 = iacInfoBannersBatchParams.currencyPairId;
        }
        if ((i & 8) != 0) {
            uuid3 = iacInfoBannersBatchParams.perpetualContractId;
        }
        if ((i & 16) != 0) {
            uuid4 = iacInfoBannersBatchParams.optionChainId;
        }
        if ((i & 32) != 0) {
            uuid5 = iacInfoBannersBatchParams.listId;
        }
        if ((i & 64) != 0) {
            uuid6 = iacInfoBannersBatchParams.eventId;
        }
        if ((i & 128) != 0) {
            uuid7 = iacInfoBannersBatchParams.futuresContractId;
        }
        if ((i & 256) != 0) {
            str = iacInfoBannersBatchParams.optionStrategyCode;
        }
        if ((i & 512) != 0) {
            str2 = iacInfoBannersBatchParams.accountNumber;
        }
        if ((i & 1024) != 0) {
            uuid8 = iacInfoBannersBatchParams.orderId;
        }
        String str3 = str2;
        UUID uuid9 = uuid8;
        UUID uuid10 = uuid7;
        String str4 = str;
        UUID uuid11 = uuid5;
        UUID uuid12 = uuid6;
        UUID uuid13 = uuid4;
        UUID uuid14 = uuid2;
        return iacInfoBannersBatchParams.copy(list, uuid, uuid14, uuid3, uuid13, uuid11, uuid12, uuid10, str4, str3, uuid9);
    }

    public final List<IacInfoBannerLocation> component1() {
        return this.locations;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component11, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getPerpetualContractId() {
        return this.perpetualContractId;
    }

    /* renamed from: component5, reason: from getter */
    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    /* renamed from: component6, reason: from getter */
    public final UUID getListId() {
        return this.listId;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component8, reason: from getter */
    public final UUID getFuturesContractId() {
        return this.futuresContractId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOptionStrategyCode() {
        return this.optionStrategyCode;
    }

    public final IacInfoBannersBatchParams copy(List<? extends IacInfoBannerLocation> locations, UUID instrumentId, UUID currencyPairId, UUID perpetualContractId, UUID optionChainId, UUID listId, UUID eventId, UUID futuresContractId, String optionStrategyCode, String accountNumber, UUID orderId) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        return new IacInfoBannersBatchParams(locations, instrumentId, currencyPairId, perpetualContractId, optionChainId, listId, eventId, futuresContractId, optionStrategyCode, accountNumber, orderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacInfoBannersBatchParams)) {
            return false;
        }
        IacInfoBannersBatchParams iacInfoBannersBatchParams = (IacInfoBannersBatchParams) other;
        return Intrinsics.areEqual(this.locations, iacInfoBannersBatchParams.locations) && Intrinsics.areEqual(this.instrumentId, iacInfoBannersBatchParams.instrumentId) && Intrinsics.areEqual(this.currencyPairId, iacInfoBannersBatchParams.currencyPairId) && Intrinsics.areEqual(this.perpetualContractId, iacInfoBannersBatchParams.perpetualContractId) && Intrinsics.areEqual(this.optionChainId, iacInfoBannersBatchParams.optionChainId) && Intrinsics.areEqual(this.listId, iacInfoBannersBatchParams.listId) && Intrinsics.areEqual(this.eventId, iacInfoBannersBatchParams.eventId) && Intrinsics.areEqual(this.futuresContractId, iacInfoBannersBatchParams.futuresContractId) && Intrinsics.areEqual(this.optionStrategyCode, iacInfoBannersBatchParams.optionStrategyCode) && Intrinsics.areEqual(this.accountNumber, iacInfoBannersBatchParams.accountNumber) && Intrinsics.areEqual(this.orderId, iacInfoBannersBatchParams.orderId);
    }

    public int hashCode() {
        int iHashCode = this.locations.hashCode() * 31;
        UUID uuid = this.instrumentId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.currencyPairId;
        int iHashCode3 = (iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        UUID uuid3 = this.perpetualContractId;
        int iHashCode4 = (iHashCode3 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
        UUID uuid4 = this.optionChainId;
        int iHashCode5 = (iHashCode4 + (uuid4 == null ? 0 : uuid4.hashCode())) * 31;
        UUID uuid5 = this.listId;
        int iHashCode6 = (iHashCode5 + (uuid5 == null ? 0 : uuid5.hashCode())) * 31;
        UUID uuid6 = this.eventId;
        int iHashCode7 = (iHashCode6 + (uuid6 == null ? 0 : uuid6.hashCode())) * 31;
        UUID uuid7 = this.futuresContractId;
        int iHashCode8 = (iHashCode7 + (uuid7 == null ? 0 : uuid7.hashCode())) * 31;
        String str = this.optionStrategyCode;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accountNumber;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UUID uuid8 = this.orderId;
        return iHashCode10 + (uuid8 != null ? uuid8.hashCode() : 0);
    }

    public String toString() {
        return "IacInfoBannersBatchParams(locations=" + this.locations + ", instrumentId=" + this.instrumentId + ", currencyPairId=" + this.currencyPairId + ", perpetualContractId=" + this.perpetualContractId + ", optionChainId=" + this.optionChainId + ", listId=" + this.listId + ", eventId=" + this.eventId + ", futuresContractId=" + this.futuresContractId + ", optionStrategyCode=" + this.optionStrategyCode + ", accountNumber=" + this.accountNumber + ", orderId=" + this.orderId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IacInfoBannersBatchParams(List<? extends IacInfoBannerLocation> locations, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, UUID uuid5, UUID uuid6, UUID uuid7, String str, String str2, UUID uuid8) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.locations = locations;
        this.instrumentId = uuid;
        this.currencyPairId = uuid2;
        this.perpetualContractId = uuid3;
        this.optionChainId = uuid4;
        this.listId = uuid5;
        this.eventId = uuid6;
        this.futuresContractId = uuid7;
        this.optionStrategyCode = str;
        this.accountNumber = str2;
        this.orderId = uuid8;
    }

    public /* synthetic */ IacInfoBannersBatchParams(List list, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, UUID uuid5, UUID uuid6, UUID uuid7, String str, String str2, UUID uuid8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : uuid2, (i & 8) != 0 ? null : uuid3, (i & 16) != 0 ? null : uuid4, (i & 32) != 0 ? null : uuid5, (i & 64) != 0 ? null : uuid6, (i & 128) != 0 ? null : uuid7, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : uuid8);
    }

    public final List<IacInfoBannerLocation> getLocations() {
        return this.locations;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final UUID getPerpetualContractId() {
        return this.perpetualContractId;
    }

    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    public final UUID getListId() {
        return this.listId;
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final UUID getFuturesContractId() {
        return this.futuresContractId;
    }

    public final String getOptionStrategyCode() {
        return this.optionStrategyCode;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final UUID getLocationId() {
        UUID uuid = this.instrumentId;
        if (uuid != null) {
            return uuid;
        }
        UUID uuid2 = this.currencyPairId;
        if (uuid2 != null) {
            return uuid2;
        }
        UUID uuid3 = this.perpetualContractId;
        if (uuid3 != null) {
            return uuid3;
        }
        UUID uuid4 = this.optionChainId;
        if (uuid4 != null) {
            return uuid4;
        }
        UUID uuid5 = this.listId;
        if (uuid5 != null) {
            return uuid5;
        }
        UUID uuid6 = this.eventId;
        if (uuid6 != null) {
            return uuid6;
        }
        UUID uuid7 = this.futuresContractId;
        return uuid7 == null ? this.orderId : uuid7;
    }
}
