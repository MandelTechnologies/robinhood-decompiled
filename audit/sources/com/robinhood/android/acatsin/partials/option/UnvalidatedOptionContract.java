package com.robinhood.android.acatsin.partials.option;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.models.api.bonfire.ApiAcatsOptionValidationRequest;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.util.Money;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: UnvalidatedOptionContract.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/UnvalidatedOptionContract;", "", "Ljava/util/UUID;", "instrumentId", "", "symbol", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "direction", "", "numContracts", "Lcom/robinhood/models/db/OptionContractType;", "optionType", "Lcom/robinhood/models/util/Money;", "strikePrice", "j$/time/LocalDate", "expirationDate", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionContractType;Lcom/robinhood/models/util/Money;Lj$/time/LocalDate;)V", "Lcom/robinhood/models/api/bonfire/ApiAcatsOptionValidationRequest;", "toValidationRequest", "()Lcom/robinhood/models/api/bonfire/ApiAcatsOptionValidationRequest;", "optionId", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "constructValidatedOption", "(Ljava/util/UUID;)Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "Ljava/lang/String;", "getSymbol", "()Ljava/lang/String;", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "getDirection", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "Ljava/lang/Integer;", "getNumContracts", "()Ljava/lang/Integer;", "Lcom/robinhood/models/db/OptionContractType;", "getOptionType", "()Lcom/robinhood/models/db/OptionContractType;", "Lcom/robinhood/models/util/Money;", "getStrikePrice", "()Lcom/robinhood/models/util/Money;", "Lj$/time/LocalDate;", "getExpirationDate", "()Lj$/time/LocalDate;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class UnvalidatedOptionContract {
    public static final int $stable = 8;
    private final ApiAcatsTransfer.Asset.Direction direction;
    private final LocalDate expirationDate;
    private final UUID instrumentId;
    private final Integer numContracts;
    private final OptionContractType optionType;
    private final Money strikePrice;
    private final String symbol;

    public UnvalidatedOptionContract(UUID instrumentId, String symbol, ApiAcatsTransfer.Asset.Direction direction, Integer num, OptionContractType optionType, Money strikePrice, LocalDate expirationDate) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.instrumentId = instrumentId;
        this.symbol = symbol;
        this.direction = direction;
        this.numContracts = num;
        this.optionType = optionType;
        this.strikePrice = strikePrice;
        this.expirationDate = expirationDate;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final ApiAcatsTransfer.Asset.Direction getDirection() {
        return this.direction;
    }

    public final Integer getNumContracts() {
        return this.numContracts;
    }

    public final OptionContractType getOptionType() {
        return this.optionType;
    }

    public final Money getStrikePrice() {
        return this.strikePrice;
    }

    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public final ApiAcatsOptionValidationRequest toValidationRequest() {
        return new ApiAcatsOptionValidationRequest(this.instrumentId, this.optionType, this.expirationDate, this.strikePrice.getDecimalValue());
    }

    public final UiAcatsAsset.OptionAsset constructValidatedOption(UUID optionId) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        return new UiAcatsAsset.OptionAsset(optionId, this.instrumentId, this.symbol, this.direction, this.numContracts, this.optionType, this.strikePrice, this.expirationDate);
    }
}
