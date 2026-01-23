package com.robinhood.android.acatsin.partials.option;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.util.Money;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: AcatsInPartialOptionAssetViewState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0082\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010\u001aJ\u0010\u0010.\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b\u000b\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010&R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u0010(R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\b\u0014\u0010*R\u0014\u0010E\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010*R\u0014\u0010F\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010*R\u0011\u0010H\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bG\u0010*R\u0011\u0010I\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bI\u0010*R\u0013\u0010M\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetViewState;", "", "Ljava/util/UUID;", "instrumentId", "", "symbol", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "assetToModify", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "direction", "", "isAllContracts", "", "numContracts", "Lcom/robinhood/models/db/OptionContractType;", "optionType", "j$/time/LocalDate", "expirationDate", "Lcom/robinhood/models/util/Money;", "strikePrice", "isButtonLoading", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionContractType;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;Z)V", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "component4", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "component5", "()Ljava/lang/Boolean;", "component6", "()Ljava/lang/Integer;", "component7", "()Lcom/robinhood/models/db/OptionContractType;", "component8", "()Lj$/time/LocalDate;", "component9", "()Lcom/robinhood/models/util/Money;", "component10", "()Z", "copy", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionContractType;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;Z)Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetViewState;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getInstrumentId", "Ljava/lang/String;", "getSymbol", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "getAssetToModify", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "getDirection", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getNumContracts", "Lcom/robinhood/models/db/OptionContractType;", "getOptionType", "Lj$/time/LocalDate;", "getExpirationDate", "Lcom/robinhood/models/util/Money;", "getStrikePrice", "Z", "isValidAllContractsInput", "isValidNumericalContractsInput", "getShouldShowContractsRow", "shouldShowContractsRow", "isValidInput", "Lcom/robinhood/android/acatsin/partials/option/UnvalidatedOptionContract;", "getUnvalidatedOptionContract", "()Lcom/robinhood/android/acatsin/partials/option/UnvalidatedOptionContract;", "unvalidatedOptionContract", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInPartialOptionAssetViewState {
    public static final int $stable = 8;
    private final UiAcatsAsset.OptionAsset assetToModify;
    private final ApiAcatsTransfer.Asset.Direction direction;
    private final LocalDate expirationDate;
    private final UUID instrumentId;
    private final Boolean isAllContracts;
    private final boolean isButtonLoading;
    private final Integer numContracts;
    private final OptionContractType optionType;
    private final Money strikePrice;
    private final String symbol;

    public static /* synthetic */ AcatsInPartialOptionAssetViewState copy$default(AcatsInPartialOptionAssetViewState acatsInPartialOptionAssetViewState, UUID uuid, String str, UiAcatsAsset.OptionAsset optionAsset, ApiAcatsTransfer.Asset.Direction direction, Boolean bool, Integer num, OptionContractType optionContractType, LocalDate localDate, Money money, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = acatsInPartialOptionAssetViewState.instrumentId;
        }
        if ((i & 2) != 0) {
            str = acatsInPartialOptionAssetViewState.symbol;
        }
        if ((i & 4) != 0) {
            optionAsset = acatsInPartialOptionAssetViewState.assetToModify;
        }
        if ((i & 8) != 0) {
            direction = acatsInPartialOptionAssetViewState.direction;
        }
        if ((i & 16) != 0) {
            bool = acatsInPartialOptionAssetViewState.isAllContracts;
        }
        if ((i & 32) != 0) {
            num = acatsInPartialOptionAssetViewState.numContracts;
        }
        if ((i & 64) != 0) {
            optionContractType = acatsInPartialOptionAssetViewState.optionType;
        }
        if ((i & 128) != 0) {
            localDate = acatsInPartialOptionAssetViewState.expirationDate;
        }
        if ((i & 256) != 0) {
            money = acatsInPartialOptionAssetViewState.strikePrice;
        }
        if ((i & 512) != 0) {
            z = acatsInPartialOptionAssetViewState.isButtonLoading;
        }
        Money money2 = money;
        boolean z2 = z;
        OptionContractType optionContractType2 = optionContractType;
        LocalDate localDate2 = localDate;
        Boolean bool2 = bool;
        Integer num2 = num;
        return acatsInPartialOptionAssetViewState.copy(uuid, str, optionAsset, direction, bool2, num2, optionContractType2, localDate2, money2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsButtonLoading() {
        return this.isButtonLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final UiAcatsAsset.OptionAsset getAssetToModify() {
        return this.assetToModify;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiAcatsTransfer.Asset.Direction getDirection() {
        return this.direction;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsAllContracts() {
        return this.isAllContracts;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getNumContracts() {
        return this.numContracts;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionContractType getOptionType() {
        return this.optionType;
    }

    /* renamed from: component8, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component9, reason: from getter */
    public final Money getStrikePrice() {
        return this.strikePrice;
    }

    public final AcatsInPartialOptionAssetViewState copy(UUID instrumentId, String symbol, UiAcatsAsset.OptionAsset assetToModify, ApiAcatsTransfer.Asset.Direction direction, Boolean isAllContracts, Integer numContracts, OptionContractType optionType, LocalDate expirationDate, Money strikePrice, boolean isButtonLoading) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new AcatsInPartialOptionAssetViewState(instrumentId, symbol, assetToModify, direction, isAllContracts, numContracts, optionType, expirationDate, strikePrice, isButtonLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInPartialOptionAssetViewState)) {
            return false;
        }
        AcatsInPartialOptionAssetViewState acatsInPartialOptionAssetViewState = (AcatsInPartialOptionAssetViewState) other;
        return Intrinsics.areEqual(this.instrumentId, acatsInPartialOptionAssetViewState.instrumentId) && Intrinsics.areEqual(this.symbol, acatsInPartialOptionAssetViewState.symbol) && Intrinsics.areEqual(this.assetToModify, acatsInPartialOptionAssetViewState.assetToModify) && this.direction == acatsInPartialOptionAssetViewState.direction && Intrinsics.areEqual(this.isAllContracts, acatsInPartialOptionAssetViewState.isAllContracts) && Intrinsics.areEqual(this.numContracts, acatsInPartialOptionAssetViewState.numContracts) && this.optionType == acatsInPartialOptionAssetViewState.optionType && Intrinsics.areEqual(this.expirationDate, acatsInPartialOptionAssetViewState.expirationDate) && Intrinsics.areEqual(this.strikePrice, acatsInPartialOptionAssetViewState.strikePrice) && this.isButtonLoading == acatsInPartialOptionAssetViewState.isButtonLoading;
    }

    public int hashCode() {
        int iHashCode = ((this.instrumentId.hashCode() * 31) + this.symbol.hashCode()) * 31;
        UiAcatsAsset.OptionAsset optionAsset = this.assetToModify;
        int iHashCode2 = (iHashCode + (optionAsset == null ? 0 : optionAsset.hashCode())) * 31;
        ApiAcatsTransfer.Asset.Direction direction = this.direction;
        int iHashCode3 = (iHashCode2 + (direction == null ? 0 : direction.hashCode())) * 31;
        Boolean bool = this.isAllContracts;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.numContracts;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        OptionContractType optionContractType = this.optionType;
        int iHashCode6 = (iHashCode5 + (optionContractType == null ? 0 : optionContractType.hashCode())) * 31;
        LocalDate localDate = this.expirationDate;
        int iHashCode7 = (iHashCode6 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Money money = this.strikePrice;
        return ((iHashCode7 + (money != null ? money.hashCode() : 0)) * 31) + Boolean.hashCode(this.isButtonLoading);
    }

    public String toString() {
        return "AcatsInPartialOptionAssetViewState(instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ", assetToModify=" + this.assetToModify + ", direction=" + this.direction + ", isAllContracts=" + this.isAllContracts + ", numContracts=" + this.numContracts + ", optionType=" + this.optionType + ", expirationDate=" + this.expirationDate + ", strikePrice=" + this.strikePrice + ", isButtonLoading=" + this.isButtonLoading + ")";
    }

    public AcatsInPartialOptionAssetViewState(UUID instrumentId, String symbol, UiAcatsAsset.OptionAsset optionAsset, ApiAcatsTransfer.Asset.Direction direction, Boolean bool, Integer num, OptionContractType optionContractType, LocalDate localDate, Money money, boolean z) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.instrumentId = instrumentId;
        this.symbol = symbol;
        this.assetToModify = optionAsset;
        this.direction = direction;
        this.isAllContracts = bool;
        this.numContracts = num;
        this.optionType = optionContractType;
        this.expirationDate = localDate;
        this.strikePrice = money;
        this.isButtonLoading = z;
    }

    public /* synthetic */ AcatsInPartialOptionAssetViewState(UUID uuid, String str, UiAcatsAsset.OptionAsset optionAsset, ApiAcatsTransfer.Asset.Direction direction, Boolean bool, Integer num, OptionContractType optionContractType, LocalDate localDate, Money money, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, optionAsset, direction, bool, num, optionContractType, localDate, money, (i & 512) != 0 ? false : z);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final UiAcatsAsset.OptionAsset getAssetToModify() {
        return this.assetToModify;
    }

    public final ApiAcatsTransfer.Asset.Direction getDirection() {
        return this.direction;
    }

    public final Boolean isAllContracts() {
        return this.isAllContracts;
    }

    public final Integer getNumContracts() {
        return this.numContracts;
    }

    public final OptionContractType getOptionType() {
        return this.optionType;
    }

    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public final Money getStrikePrice() {
        return this.strikePrice;
    }

    public final boolean isButtonLoading() {
        return this.isButtonLoading;
    }

    public final boolean getShouldShowContractsRow() {
        return Intrinsics.areEqual(this.isAllContracts, Boolean.FALSE);
    }

    private final boolean isValidAllContractsInput() {
        return (this.direction == null || !Intrinsics.areEqual(this.isAllContracts, Boolean.TRUE) || this.optionType == null || this.expirationDate == null || this.strikePrice == null) ? false : true;
    }

    private final boolean isValidNumericalContractsInput() {
        return (this.direction == null || !Intrinsics.areEqual(this.isAllContracts, Boolean.FALSE) || this.numContracts == null || this.expirationDate == null || this.strikePrice == null) ? false : true;
    }

    public final boolean isValidInput() {
        return isValidAllContractsInput() || isValidNumericalContractsInput();
    }

    public final UnvalidatedOptionContract getUnvalidatedOptionContract() {
        if (this.direction == null || this.isAllContracts == null || this.optionType == null || this.strikePrice == null || this.expirationDate == null) {
            return null;
        }
        return new UnvalidatedOptionContract(this.instrumentId, this.symbol, this.direction, this.numContracts, this.optionType, this.strikePrice, this.expirationDate);
    }
}
