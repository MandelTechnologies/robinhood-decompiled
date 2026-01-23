package com.robinhood.android.optionschain.sbschain.logging;

import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: OptionSideBySideChainLogger.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0017¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/logging/SbsChainLegsContext;", "", "Ljava/util/UUID;", "instrument_id", "j$/time/LocalDate", GovernmentIdNfcScan.expirationDateName, "Ljava/math/BigDecimal;", "strike_price", "Lcom/robinhood/models/db/OptionContractType;", "type", "Lcom/robinhood/models/db/OrderSide;", "side", "<init>", "(Ljava/util/UUID;Lj$/time/LocalDate;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionContractType;Lcom/robinhood/models/db/OrderSide;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lj$/time/LocalDate;", "component3", "()Ljava/math/BigDecimal;", "component4", "()Lcom/robinhood/models/db/OptionContractType;", "component5", "()Lcom/robinhood/models/db/OrderSide;", "copy", "(Ljava/util/UUID;Lj$/time/LocalDate;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionContractType;Lcom/robinhood/models/db/OrderSide;)Lcom/robinhood/android/optionschain/sbschain/logging/SbsChainLegsContext;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getInstrument_id", "Lj$/time/LocalDate;", "getExpiration_date", "Ljava/math/BigDecimal;", "getStrike_price", "Lcom/robinhood/models/db/OptionContractType;", "getType", "Lcom/robinhood/models/db/OrderSide;", "getSide", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SbsChainLegsContext {
    private final LocalDate expiration_date;
    private final UUID instrument_id;
    private final OrderSide side;
    private final BigDecimal strike_price;
    private final OptionContractType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ SbsChainLegsContext copy$default(SbsChainLegsContext sbsChainLegsContext, UUID uuid, LocalDate localDate, BigDecimal bigDecimal, OptionContractType optionContractType, OrderSide orderSide, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = sbsChainLegsContext.instrument_id;
        }
        if ((i & 2) != 0) {
            localDate = sbsChainLegsContext.expiration_date;
        }
        if ((i & 4) != 0) {
            bigDecimal = sbsChainLegsContext.strike_price;
        }
        if ((i & 8) != 0) {
            optionContractType = sbsChainLegsContext.type;
        }
        if ((i & 16) != 0) {
            orderSide = sbsChainLegsContext.side;
        }
        OrderSide orderSide2 = orderSide;
        BigDecimal bigDecimal2 = bigDecimal;
        return sbsChainLegsContext.copy(uuid, localDate, bigDecimal2, optionContractType, orderSide2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrument_id() {
        return this.instrument_id;
    }

    /* renamed from: component2, reason: from getter */
    public final LocalDate getExpiration_date() {
        return this.expiration_date;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getStrike_price() {
        return this.strike_price;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionContractType getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final OrderSide getSide() {
        return this.side;
    }

    public final SbsChainLegsContext copy(UUID instrument_id, LocalDate expiration_date, BigDecimal strike_price, OptionContractType type2, OrderSide side) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(expiration_date, "expiration_date");
        Intrinsics.checkNotNullParameter(strike_price, "strike_price");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(side, "side");
        return new SbsChainLegsContext(instrument_id, expiration_date, strike_price, type2, side);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SbsChainLegsContext)) {
            return false;
        }
        SbsChainLegsContext sbsChainLegsContext = (SbsChainLegsContext) other;
        return Intrinsics.areEqual(this.instrument_id, sbsChainLegsContext.instrument_id) && Intrinsics.areEqual(this.expiration_date, sbsChainLegsContext.expiration_date) && Intrinsics.areEqual(this.strike_price, sbsChainLegsContext.strike_price) && this.type == sbsChainLegsContext.type && this.side == sbsChainLegsContext.side;
    }

    public int hashCode() {
        return (((((((this.instrument_id.hashCode() * 31) + this.expiration_date.hashCode()) * 31) + this.strike_price.hashCode()) * 31) + this.type.hashCode()) * 31) + this.side.hashCode();
    }

    public String toString() {
        return "SbsChainLegsContext(instrument_id=" + this.instrument_id + ", expiration_date=" + this.expiration_date + ", strike_price=" + this.strike_price + ", type=" + this.type + ", side=" + this.side + ")";
    }

    public SbsChainLegsContext(UUID instrument_id, LocalDate expiration_date, BigDecimal strike_price, OptionContractType type2, OrderSide side) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(expiration_date, "expiration_date");
        Intrinsics.checkNotNullParameter(strike_price, "strike_price");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(side, "side");
        this.instrument_id = instrument_id;
        this.expiration_date = expiration_date;
        this.strike_price = strike_price;
        this.type = type2;
        this.side = side;
    }

    public final UUID getInstrument_id() {
        return this.instrument_id;
    }

    public final LocalDate getExpiration_date() {
        return this.expiration_date;
    }

    public final BigDecimal getStrike_price() {
        return this.strike_price;
    }

    public final OptionContractType getType() {
        return this.type;
    }

    public final OrderSide getSide() {
        return this.side;
    }

    /* compiled from: OptionSideBySideChainLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/logging/SbsChainLegsContext$Companion;", "", "<init>", "()V", "toLoggingContext", "Lcom/robinhood/android/optionschain/sbschain/logging/SbsChainLegsContext;", "Lcom/robinhood/models/ui/OptionLegBundle;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SbsChainLegsContext toLoggingContext(OptionLegBundle optionLegBundle) {
            Intrinsics.checkNotNullParameter(optionLegBundle, "<this>");
            OptionInstrument optionInstrument = optionLegBundle.getOptionInstrument();
            return new SbsChainLegsContext(optionInstrument.getId(), optionInstrument.getExpirationDate(), optionInstrument.getStrikePrice(), optionLegBundle.getOptionConfigurationBundle().getOptionContractType(), optionLegBundle.getOptionConfigurationBundle().getOptionSide());
        }
    }
}
