package wormhole.service.p554v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p479j$.time.Instant;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.RealizedGainLossItem;
import wormhole.service.p554v1.RealizedGainLossItemComponentDto;
import wormhole.service.p554v1.RealizedGainLossItemDto;
import wormhole.service.p554v1.UnderlyingTypeDto;

/* compiled from: RealizedGainLossItemDto.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b!\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\bJIKLMNOPB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B»\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0006\u0010\u001eJ¿\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0019\u001a\u00020\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020*H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020*H\u0016¢\u0006\u0004\b3\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010$R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010$R\u0019\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b;\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0019\u0010\u0015\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b@\u0010:R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bB\u0010=R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bC\u0010=R\u0011\u0010\u0019\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bD\u0010$R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bE\u0010=R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bF\u0010=R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006Q"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto;", "Lcom/robinhood/idl/MessageDto;", "Lwormhole/service/v1/RealizedGainLossItem;", "Landroid/os/Parcelable;", "Lwormhole/service/v1/RealizedGainLossItemDto$Surrogate;", "surrogate", "<init>", "(Lwormhole/service/v1/RealizedGainLossItemDto$Surrogate;)V", "", "id", "Lwormhole/service/v1/AssetClassDto;", "asset_class", "symbol", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "close_timestamp", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "Lcom/robinhood/rosetta/common/MoneyDto;", "realized_return", "Lcom/robinhood/idl/IdlDecimal;", "realized_return_percentage", "first_execution_timestamp", "quantity", "open_average_price", "close_average_price", "detail_display_name", "opening_amount", "closing_amount", "Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto;", "order_details", "(Ljava/lang/String;Lwormhole/service/v1/AssetClassDto;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto;)V", "copy", "(Ljava/lang/String;Lwormhole/service/v1/AssetClassDto;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto;)Lwormhole/service/v1/RealizedGainLossItemDto;", "toProto", "()Lwormhole/service/v1/RealizedGainLossItem;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lwormhole/service/v1/RealizedGainLossItemDto$Surrogate;", "getId", "getAsset_class", "()Lwormhole/service/v1/AssetClassDto;", "getSymbol", "getClose_timestamp", "()Lj$/time/Instant;", "getDisplay_name", "getRealized_return", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getRealized_return_percentage", "()Lcom/robinhood/idl/IdlDecimal;", "getFirst_execution_timestamp", "getQuantity", "getOpen_average_price", "getClose_average_price", "getDetail_display_name", "getOpening_amount", "getClosing_amount", "getOrder_details", "()Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto;", "Companion", "Surrogate", "OrderDetailsDto", "EquityOrderDetailsDto", "OptionOrderDetailsDto", "CryptoOrderDetailsDto", "Serializer", "MultibindingModule", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class RealizedGainLossItemDto implements Dto3<RealizedGainLossItem>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RealizedGainLossItemDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RealizedGainLossItemDto, RealizedGainLossItem>> binaryBase64Serializer$delegate;
    private static final RealizedGainLossItemDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RealizedGainLossItemDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RealizedGainLossItemDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final AssetClassDto getAsset_class() {
        return this.surrogate.getAsset_class();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final Instant getClose_timestamp() {
        return this.surrogate.getClose_timestamp();
    }

    public final String getDisplay_name() {
        return this.surrogate.getDisplay_name();
    }

    public final MoneyDto getRealized_return() {
        return this.surrogate.getRealized_return();
    }

    public final IdlDecimal getRealized_return_percentage() {
        return this.surrogate.getRealized_return_percentage();
    }

    public final Instant getFirst_execution_timestamp() {
        return this.surrogate.getFirst_execution_timestamp();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final MoneyDto getOpen_average_price() {
        return this.surrogate.getOpen_average_price();
    }

    public final MoneyDto getClose_average_price() {
        return this.surrogate.getClose_average_price();
    }

    public final String getDetail_display_name() {
        return this.surrogate.getDetail_display_name();
    }

    public final MoneyDto getOpening_amount() {
        return this.surrogate.getOpening_amount();
    }

    public final MoneyDto getClosing_amount() {
        return this.surrogate.getClosing_amount();
    }

    public final OrderDetailsDto getOrder_details() {
        if (this.surrogate.getEquity_order_details() != null) {
            return new OrderDetailsDto.EquityOrderDetails(this.surrogate.getEquity_order_details());
        }
        if (this.surrogate.getOption_order_details() != null) {
            return new OrderDetailsDto.OptionOrderDetails(this.surrogate.getOption_order_details());
        }
        if (this.surrogate.getCrypto_order_details() != null) {
            return new OrderDetailsDto.CryptoOrderDetails(this.surrogate.getCrypto_order_details());
        }
        return null;
    }

    public /* synthetic */ RealizedGainLossItemDto(String str, AssetClassDto assetClassDto, String str2, Instant instant, String str3, MoneyDto moneyDto, IdlDecimal idlDecimal, Instant instant2, IdlDecimal idlDecimal2, MoneyDto moneyDto2, MoneyDto moneyDto3, String str4, MoneyDto moneyDto4, MoneyDto moneyDto5, OrderDetailsDto orderDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AssetClassDto.INSTANCE.getZeroValue() : assetClassDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal, (i & 128) != 0 ? null : instant2, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 512) != 0 ? null : moneyDto2, (i & 1024) != 0 ? null : moneyDto3, (i & 2048) == 0 ? str4 : "", (i & 4096) != 0 ? null : moneyDto4, (i & 8192) != 0 ? null : moneyDto5, (i & 16384) != 0 ? null : orderDetailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RealizedGainLossItemDto(String id, AssetClassDto asset_class, String symbol, Instant instant, String display_name, MoneyDto moneyDto, IdlDecimal realized_return_percentage, Instant instant2, IdlDecimal quantity, MoneyDto moneyDto2, MoneyDto moneyDto3, String detail_display_name, MoneyDto moneyDto4, MoneyDto moneyDto5, OrderDetailsDto orderDetailsDto) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(detail_display_name, "detail_display_name");
        OrderDetailsDto.EquityOrderDetails equityOrderDetails = orderDetailsDto instanceof OrderDetailsDto.EquityOrderDetails ? (OrderDetailsDto.EquityOrderDetails) orderDetailsDto : null;
        EquityOrderDetailsDto value = equityOrderDetails != null ? equityOrderDetails.getValue() : null;
        OrderDetailsDto.OptionOrderDetails optionOrderDetails = orderDetailsDto instanceof OrderDetailsDto.OptionOrderDetails ? (OrderDetailsDto.OptionOrderDetails) orderDetailsDto : null;
        OptionOrderDetailsDto value2 = optionOrderDetails != null ? optionOrderDetails.getValue() : null;
        OrderDetailsDto.CryptoOrderDetails cryptoOrderDetails = orderDetailsDto instanceof OrderDetailsDto.CryptoOrderDetails ? (OrderDetailsDto.CryptoOrderDetails) orderDetailsDto : null;
        this(new Surrogate(id, asset_class, symbol, instant, display_name, moneyDto, realized_return_percentage, instant2, quantity, moneyDto2, moneyDto3, detail_display_name, moneyDto4, moneyDto5, value, value2, cryptoOrderDetails != null ? cryptoOrderDetails.getValue() : null));
    }

    public final RealizedGainLossItemDto copy(String id, AssetClassDto asset_class, String symbol, Instant close_timestamp, String display_name, MoneyDto realized_return, IdlDecimal realized_return_percentage, Instant first_execution_timestamp, IdlDecimal quantity, MoneyDto open_average_price, MoneyDto close_average_price, String detail_display_name, MoneyDto opening_amount, MoneyDto closing_amount, OrderDetailsDto order_details) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(detail_display_name, "detail_display_name");
        OrderDetailsDto.EquityOrderDetails equityOrderDetails = order_details instanceof OrderDetailsDto.EquityOrderDetails ? (OrderDetailsDto.EquityOrderDetails) order_details : null;
        EquityOrderDetailsDto value = equityOrderDetails != null ? equityOrderDetails.getValue() : null;
        OrderDetailsDto.OptionOrderDetails optionOrderDetails = order_details instanceof OrderDetailsDto.OptionOrderDetails ? (OrderDetailsDto.OptionOrderDetails) order_details : null;
        OptionOrderDetailsDto value2 = optionOrderDetails != null ? optionOrderDetails.getValue() : null;
        OrderDetailsDto.CryptoOrderDetails cryptoOrderDetails = order_details instanceof OrderDetailsDto.CryptoOrderDetails ? (OrderDetailsDto.CryptoOrderDetails) order_details : null;
        return new RealizedGainLossItemDto(new Surrogate(id, asset_class, symbol, close_timestamp, display_name, realized_return, realized_return_percentage, first_execution_timestamp, quantity, open_average_price, close_average_price, detail_display_name, opening_amount, closing_amount, value, value2, cryptoOrderDetails != null ? cryptoOrderDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public RealizedGainLossItem toProto() {
        String id = this.surrogate.getId();
        AssetClass assetClass = (AssetClass) this.surrogate.getAsset_class().toProto();
        String symbol = this.surrogate.getSymbol();
        Instant close_timestamp = this.surrogate.getClose_timestamp();
        String display_name = this.surrogate.getDisplay_name();
        MoneyDto realized_return = this.surrogate.getRealized_return();
        Money proto = realized_return != null ? realized_return.toProto() : null;
        String stringValue = this.surrogate.getRealized_return_percentage().getStringValue();
        Instant first_execution_timestamp = this.surrogate.getFirst_execution_timestamp();
        String stringValue2 = this.surrogate.getQuantity().getStringValue();
        MoneyDto open_average_price = this.surrogate.getOpen_average_price();
        Money proto2 = open_average_price != null ? open_average_price.toProto() : null;
        MoneyDto close_average_price = this.surrogate.getClose_average_price();
        Money proto3 = close_average_price != null ? close_average_price.toProto() : null;
        String detail_display_name = this.surrogate.getDetail_display_name();
        MoneyDto opening_amount = this.surrogate.getOpening_amount();
        Money proto4 = opening_amount != null ? opening_amount.toProto() : null;
        MoneyDto closing_amount = this.surrogate.getClosing_amount();
        Money proto5 = closing_amount != null ? closing_amount.toProto() : null;
        EquityOrderDetailsDto equity_order_details = this.surrogate.getEquity_order_details();
        RealizedGainLossItem.EquityOrderDetails proto6 = equity_order_details != null ? equity_order_details.toProto() : null;
        OptionOrderDetailsDto option_order_details = this.surrogate.getOption_order_details();
        RealizedGainLossItem.OptionOrderDetails proto7 = option_order_details != null ? option_order_details.toProto() : null;
        CryptoOrderDetailsDto crypto_order_details = this.surrogate.getCrypto_order_details();
        return new RealizedGainLossItem(id, assetClass, symbol, close_timestamp, display_name, proto, stringValue, first_execution_timestamp, stringValue2, proto2, proto3, detail_display_name, proto4, proto5, proto6, proto7, crypto_order_details != null ? crypto_order_details.toProto() : null, null, 131072, null);
    }

    public String toString() {
        return "[RealizedGainLossItemDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RealizedGainLossItemDto) && Intrinsics.areEqual(((RealizedGainLossItemDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealizedGainLossItemDto.kt */
    @Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b7\b\u0083\b\u0018\u0000 j2\u00020\u0001:\u0002kjB«\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0010¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0011\u0012.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\u0010¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!BÅ\u0001\b\u0010\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b \u0010&J'\u0010/\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u00101R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010<\u0012\u0004\b?\u0010;\u001a\u0004\b=\u0010>R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00108\u0012\u0004\bA\u0010;\u001a\u0004\b@\u00101RF\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010B\u0012\u0004\bE\u0010;\u001a\u0004\bC\u0010DR \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\bG\u0010;\u001a\u0004\bF\u00101R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010H\u0012\u0004\bK\u0010;\u001a\u0004\bI\u0010JR/\u0010\u0012\u001a\u00110\u0010¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010L\u0012\u0004\bO\u0010;\u001a\u0004\bM\u0010NRF\u0010\u0013\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010B\u0012\u0004\bQ\u0010;\u001a\u0004\bP\u0010DR/\u0010\u0014\u001a\u00110\u0010¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010L\u0012\u0004\bS\u0010;\u001a\u0004\bR\u0010NR\"\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010H\u0012\u0004\bU\u0010;\u001a\u0004\bT\u0010JR\"\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010H\u0012\u0004\bW\u0010;\u001a\u0004\bV\u0010JR \u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00108\u0012\u0004\bY\u0010;\u001a\u0004\bX\u00101R\"\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010H\u0012\u0004\b[\u0010;\u001a\u0004\bZ\u0010JR\"\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010H\u0012\u0004\b]\u0010;\u001a\u0004\b\\\u0010JR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010^\u0012\u0004\ba\u0010;\u001a\u0004\b_\u0010`R\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010b\u0012\u0004\be\u0010;\u001a\u0004\bc\u0010dR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010f\u0012\u0004\bi\u0010;\u001a\u0004\bg\u0010h¨\u0006l"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$Surrogate;", "", "", "id", "Lwormhole/service/v1/AssetClassDto;", "asset_class", "symbol", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "close_timestamp", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "Lcom/robinhood/rosetta/common/MoneyDto;", "realized_return", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "realized_return_percentage", "first_execution_timestamp", "quantity", "open_average_price", "close_average_price", "detail_display_name", "opening_amount", "closing_amount", "Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;", "equity_order_details", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;", "option_order_details", "Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;", "crypto_order_details", "<init>", "(Ljava/lang/String;Lwormhole/service/v1/AssetClassDto;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lwormhole/service/v1/AssetClassDto;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wormhole_v1_externalRelease", "(Lwormhole/service/v1/RealizedGainLossItemDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lwormhole/service/v1/AssetClassDto;", "getAsset_class", "()Lwormhole/service/v1/AssetClassDto;", "getAsset_class$annotations", "getSymbol", "getSymbol$annotations", "Lj$/time/Instant;", "getClose_timestamp", "()Lj$/time/Instant;", "getClose_timestamp$annotations", "getDisplay_name", "getDisplay_name$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getRealized_return", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getRealized_return$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getRealized_return_percentage", "()Lcom/robinhood/idl/IdlDecimal;", "getRealized_return_percentage$annotations", "getFirst_execution_timestamp", "getFirst_execution_timestamp$annotations", "getQuantity", "getQuantity$annotations", "getOpen_average_price", "getOpen_average_price$annotations", "getClose_average_price", "getClose_average_price$annotations", "getDetail_display_name", "getDetail_display_name$annotations", "getOpening_amount", "getOpening_amount$annotations", "getClosing_amount", "getClosing_amount$annotations", "Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;", "getEquity_order_details", "()Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;", "getEquity_order_details$annotations", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;", "getOption_order_details", "()Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;", "getOption_order_details$annotations", "Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;", "getCrypto_order_details", "()Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;", "getCrypto_order_details$annotations", "Companion", "$serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AssetClassDto asset_class;
        private final MoneyDto close_average_price;
        private final Instant close_timestamp;
        private final MoneyDto closing_amount;
        private final CryptoOrderDetailsDto crypto_order_details;
        private final String detail_display_name;
        private final String display_name;
        private final EquityOrderDetailsDto equity_order_details;
        private final Instant first_execution_timestamp;
        private final String id;
        private final MoneyDto open_average_price;
        private final MoneyDto opening_amount;
        private final OptionOrderDetailsDto option_order_details;
        private final IdlDecimal quantity;
        private final MoneyDto realized_return;
        private final IdlDecimal realized_return_percentage;
        private final String symbol;

        public Surrogate() {
            this((String) null, (AssetClassDto) null, (String) null, (Instant) null, (String) null, (MoneyDto) null, (IdlDecimal) null, (Instant) null, (IdlDecimal) null, (MoneyDto) null, (MoneyDto) null, (String) null, (MoneyDto) null, (MoneyDto) null, (EquityOrderDetailsDto) null, (OptionOrderDetailsDto) null, (CryptoOrderDetailsDto) null, 131071, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.asset_class == surrogate.asset_class && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.close_timestamp, surrogate.close_timestamp) && Intrinsics.areEqual(this.display_name, surrogate.display_name) && Intrinsics.areEqual(this.realized_return, surrogate.realized_return) && Intrinsics.areEqual(this.realized_return_percentage, surrogate.realized_return_percentage) && Intrinsics.areEqual(this.first_execution_timestamp, surrogate.first_execution_timestamp) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.open_average_price, surrogate.open_average_price) && Intrinsics.areEqual(this.close_average_price, surrogate.close_average_price) && Intrinsics.areEqual(this.detail_display_name, surrogate.detail_display_name) && Intrinsics.areEqual(this.opening_amount, surrogate.opening_amount) && Intrinsics.areEqual(this.closing_amount, surrogate.closing_amount) && Intrinsics.areEqual(this.equity_order_details, surrogate.equity_order_details) && Intrinsics.areEqual(this.option_order_details, surrogate.option_order_details) && Intrinsics.areEqual(this.crypto_order_details, surrogate.crypto_order_details);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.asset_class.hashCode()) * 31) + this.symbol.hashCode()) * 31;
            Instant instant = this.close_timestamp;
            int iHashCode2 = (((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.display_name.hashCode()) * 31;
            MoneyDto moneyDto = this.realized_return;
            int iHashCode3 = (((iHashCode2 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.realized_return_percentage.hashCode()) * 31;
            Instant instant2 = this.first_execution_timestamp;
            int iHashCode4 = (((iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.quantity.hashCode()) * 31;
            MoneyDto moneyDto2 = this.open_average_price;
            int iHashCode5 = (iHashCode4 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.close_average_price;
            int iHashCode6 = (((iHashCode5 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31) + this.detail_display_name.hashCode()) * 31;
            MoneyDto moneyDto4 = this.opening_amount;
            int iHashCode7 = (iHashCode6 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            MoneyDto moneyDto5 = this.closing_amount;
            int iHashCode8 = (iHashCode7 + (moneyDto5 == null ? 0 : moneyDto5.hashCode())) * 31;
            EquityOrderDetailsDto equityOrderDetailsDto = this.equity_order_details;
            int iHashCode9 = (iHashCode8 + (equityOrderDetailsDto == null ? 0 : equityOrderDetailsDto.hashCode())) * 31;
            OptionOrderDetailsDto optionOrderDetailsDto = this.option_order_details;
            int iHashCode10 = (iHashCode9 + (optionOrderDetailsDto == null ? 0 : optionOrderDetailsDto.hashCode())) * 31;
            CryptoOrderDetailsDto cryptoOrderDetailsDto = this.crypto_order_details;
            return iHashCode10 + (cryptoOrderDetailsDto != null ? cryptoOrderDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", asset_class=" + this.asset_class + ", symbol=" + this.symbol + ", close_timestamp=" + this.close_timestamp + ", display_name=" + this.display_name + ", realized_return=" + this.realized_return + ", realized_return_percentage=" + this.realized_return_percentage + ", first_execution_timestamp=" + this.first_execution_timestamp + ", quantity=" + this.quantity + ", open_average_price=" + this.open_average_price + ", close_average_price=" + this.close_average_price + ", detail_display_name=" + this.detail_display_name + ", opening_amount=" + this.opening_amount + ", closing_amount=" + this.closing_amount + ", equity_order_details=" + this.equity_order_details + ", option_order_details=" + this.option_order_details + ", crypto_order_details=" + this.crypto_order_details + ")";
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemDto$Surrogate;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RealizedGainLossItemDto6.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, AssetClassDto assetClassDto, String str2, Instant instant, String str3, MoneyDto moneyDto, IdlDecimal idlDecimal, Instant instant2, IdlDecimal idlDecimal2, MoneyDto moneyDto2, MoneyDto moneyDto3, String str4, MoneyDto moneyDto4, MoneyDto moneyDto5, EquityOrderDetailsDto equityOrderDetailsDto, OptionOrderDetailsDto optionOrderDetailsDto, CryptoOrderDetailsDto cryptoOrderDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.asset_class = AssetClassDto.INSTANCE.getZeroValue();
            } else {
                this.asset_class = assetClassDto;
            }
            if ((i & 4) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str2;
            }
            if ((i & 8) == 0) {
                this.close_timestamp = null;
            } else {
                this.close_timestamp = instant;
            }
            if ((i & 16) == 0) {
                this.display_name = "";
            } else {
                this.display_name = str3;
            }
            if ((i & 32) == 0) {
                this.realized_return = null;
            } else {
                this.realized_return = moneyDto;
            }
            if ((i & 64) == 0) {
                this.realized_return_percentage = new IdlDecimal("");
            } else {
                this.realized_return_percentage = idlDecimal;
            }
            if ((i & 128) == 0) {
                this.first_execution_timestamp = null;
            } else {
                this.first_execution_timestamp = instant2;
            }
            if ((i & 256) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal2;
            }
            if ((i & 512) == 0) {
                this.open_average_price = null;
            } else {
                this.open_average_price = moneyDto2;
            }
            if ((i & 1024) == 0) {
                this.close_average_price = null;
            } else {
                this.close_average_price = moneyDto3;
            }
            if ((i & 2048) == 0) {
                this.detail_display_name = "";
            } else {
                this.detail_display_name = str4;
            }
            if ((i & 4096) == 0) {
                this.opening_amount = null;
            } else {
                this.opening_amount = moneyDto4;
            }
            if ((i & 8192) == 0) {
                this.closing_amount = null;
            } else {
                this.closing_amount = moneyDto5;
            }
            if ((i & 16384) == 0) {
                this.equity_order_details = null;
            } else {
                this.equity_order_details = equityOrderDetailsDto;
            }
            if ((32768 & i) == 0) {
                this.option_order_details = null;
            } else {
                this.option_order_details = optionOrderDetailsDto;
            }
            if ((i & 65536) == 0) {
                this.crypto_order_details = null;
            } else {
                this.crypto_order_details = cryptoOrderDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$wormhole_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (self.asset_class != AssetClassDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, AssetClassDto.Serializer.INSTANCE, self.asset_class);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 2, self.symbol);
            }
            Instant instant = self.close_timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.display_name, "")) {
                output.encodeStringElement(serialDesc, 4, self.display_name);
            }
            MoneyDto moneyDto = self.realized_return;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.realized_return_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.realized_return_percentage);
            }
            Instant instant2 = self.first_execution_timestamp;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            MoneyDto moneyDto2 = self.open_average_price;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.close_average_price;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            if (!Intrinsics.areEqual(self.detail_display_name, "")) {
                output.encodeStringElement(serialDesc, 11, self.detail_display_name);
            }
            MoneyDto moneyDto4 = self.opening_amount;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            MoneyDto moneyDto5 = self.closing_amount;
            if (moneyDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, MoneyDto.Serializer.INSTANCE, moneyDto5);
            }
            EquityOrderDetailsDto equityOrderDetailsDto = self.equity_order_details;
            if (equityOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, EquityOrderDetailsDto.Serializer.INSTANCE, equityOrderDetailsDto);
            }
            OptionOrderDetailsDto optionOrderDetailsDto = self.option_order_details;
            if (optionOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, OptionOrderDetailsDto.Serializer.INSTANCE, optionOrderDetailsDto);
            }
            CryptoOrderDetailsDto cryptoOrderDetailsDto = self.crypto_order_details;
            if (cryptoOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, CryptoOrderDetailsDto.Serializer.INSTANCE, cryptoOrderDetailsDto);
            }
        }

        public Surrogate(String id, AssetClassDto asset_class, String symbol, Instant instant, String display_name, MoneyDto moneyDto, IdlDecimal realized_return_percentage, Instant instant2, IdlDecimal quantity, MoneyDto moneyDto2, MoneyDto moneyDto3, String detail_display_name, MoneyDto moneyDto4, MoneyDto moneyDto5, EquityOrderDetailsDto equityOrderDetailsDto, OptionOrderDetailsDto optionOrderDetailsDto, CryptoOrderDetailsDto cryptoOrderDetailsDto) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(asset_class, "asset_class");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(display_name, "display_name");
            Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(detail_display_name, "detail_display_name");
            this.id = id;
            this.asset_class = asset_class;
            this.symbol = symbol;
            this.close_timestamp = instant;
            this.display_name = display_name;
            this.realized_return = moneyDto;
            this.realized_return_percentage = realized_return_percentage;
            this.first_execution_timestamp = instant2;
            this.quantity = quantity;
            this.open_average_price = moneyDto2;
            this.close_average_price = moneyDto3;
            this.detail_display_name = detail_display_name;
            this.opening_amount = moneyDto4;
            this.closing_amount = moneyDto5;
            this.equity_order_details = equityOrderDetailsDto;
            this.option_order_details = optionOrderDetailsDto;
            this.crypto_order_details = cryptoOrderDetailsDto;
        }

        public /* synthetic */ Surrogate(String str, AssetClassDto assetClassDto, String str2, Instant instant, String str3, MoneyDto moneyDto, IdlDecimal idlDecimal, Instant instant2, IdlDecimal idlDecimal2, MoneyDto moneyDto2, MoneyDto moneyDto3, String str4, MoneyDto moneyDto4, MoneyDto moneyDto5, EquityOrderDetailsDto equityOrderDetailsDto, OptionOrderDetailsDto optionOrderDetailsDto, CryptoOrderDetailsDto cryptoOrderDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AssetClassDto.INSTANCE.getZeroValue() : assetClassDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal, (i & 128) != 0 ? null : instant2, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 512) != 0 ? null : moneyDto2, (i & 1024) != 0 ? null : moneyDto3, (i & 2048) == 0 ? str4 : "", (i & 4096) != 0 ? null : moneyDto4, (i & 8192) != 0 ? null : moneyDto5, (i & 16384) != 0 ? null : equityOrderDetailsDto, (i & 32768) != 0 ? null : optionOrderDetailsDto, (i & 65536) != 0 ? null : cryptoOrderDetailsDto);
        }

        public final String getId() {
            return this.id;
        }

        public final AssetClassDto getAsset_class() {
            return this.asset_class;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final Instant getClose_timestamp() {
            return this.close_timestamp;
        }

        public final String getDisplay_name() {
            return this.display_name;
        }

        public final MoneyDto getRealized_return() {
            return this.realized_return;
        }

        public final IdlDecimal getRealized_return_percentage() {
            return this.realized_return_percentage;
        }

        public final Instant getFirst_execution_timestamp() {
            return this.first_execution_timestamp;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final MoneyDto getOpen_average_price() {
            return this.open_average_price;
        }

        public final MoneyDto getClose_average_price() {
            return this.close_average_price;
        }

        public final String getDetail_display_name() {
            return this.detail_display_name;
        }

        public final MoneyDto getOpening_amount() {
            return this.opening_amount;
        }

        public final MoneyDto getClosing_amount() {
            return this.closing_amount;
        }

        public final EquityOrderDetailsDto getEquity_order_details() {
            return this.equity_order_details;
        }

        public final OptionOrderDetailsDto getOption_order_details() {
            return this.option_order_details;
        }

        public final CryptoOrderDetailsDto getCrypto_order_details() {
            return this.crypto_order_details;
        }
    }

    /* compiled from: RealizedGainLossItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lwormhole/service/v1/RealizedGainLossItemDto;", "Lwormhole/service/v1/RealizedGainLossItem;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwormhole/service/v1/RealizedGainLossItemDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<RealizedGainLossItemDto, RealizedGainLossItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RealizedGainLossItemDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RealizedGainLossItemDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RealizedGainLossItemDto> getBinaryBase64Serializer() {
            return (KSerializer) RealizedGainLossItemDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RealizedGainLossItem> getProtoAdapter() {
            return RealizedGainLossItem.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RealizedGainLossItemDto getZeroValue() {
            return RealizedGainLossItemDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RealizedGainLossItemDto fromProto(RealizedGainLossItem proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            AssetClassDto assetClassDtoFromProto = AssetClassDto.INSTANCE.fromProto(proto.getAsset_class());
            String symbol = proto.getSymbol();
            Instant close_timestamp = proto.getClose_timestamp();
            String display_name = proto.getDisplay_name();
            Money realized_return = proto.getRealized_return();
            MoneyDto moneyDtoFromProto = realized_return != null ? MoneyDto.INSTANCE.fromProto(realized_return) : null;
            IdlDecimal idlDecimal = new IdlDecimal(proto.getRealized_return_percentage());
            Instant first_execution_timestamp = proto.getFirst_execution_timestamp();
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getQuantity());
            Money open_average_price = proto.getOpen_average_price();
            MoneyDto moneyDtoFromProto2 = open_average_price != null ? MoneyDto.INSTANCE.fromProto(open_average_price) : null;
            Money close_average_price = proto.getClose_average_price();
            MoneyDto moneyDtoFromProto3 = close_average_price != null ? MoneyDto.INSTANCE.fromProto(close_average_price) : null;
            String detail_display_name = proto.getDetail_display_name();
            Money opening_amount = proto.getOpening_amount();
            MoneyDto moneyDtoFromProto4 = opening_amount != null ? MoneyDto.INSTANCE.fromProto(opening_amount) : null;
            Money closing_amount = proto.getClosing_amount();
            MoneyDto moneyDtoFromProto5 = closing_amount != null ? MoneyDto.INSTANCE.fromProto(closing_amount) : null;
            RealizedGainLossItem.EquityOrderDetails equity_order_details = proto.getEquity_order_details();
            MoneyDto moneyDto = moneyDtoFromProto;
            EquityOrderDetailsDto equityOrderDetailsDtoFromProto = equity_order_details != null ? EquityOrderDetailsDto.INSTANCE.fromProto(equity_order_details) : null;
            RealizedGainLossItem.OptionOrderDetails option_order_details = proto.getOption_order_details();
            EquityOrderDetailsDto equityOrderDetailsDto = equityOrderDetailsDtoFromProto;
            OptionOrderDetailsDto optionOrderDetailsDtoFromProto = option_order_details != null ? OptionOrderDetailsDto.INSTANCE.fromProto(option_order_details) : null;
            RealizedGainLossItem.CryptoOrderDetails crypto_order_details = proto.getCrypto_order_details();
            return new RealizedGainLossItemDto(new Surrogate(id, assetClassDtoFromProto, symbol, close_timestamp, display_name, moneyDto, idlDecimal, first_execution_timestamp, idlDecimal2, moneyDtoFromProto2, moneyDtoFromProto3, detail_display_name, moneyDtoFromProto4, moneyDtoFromProto5, equityOrderDetailsDto, optionOrderDetailsDtoFromProto, crypto_order_details != null ? CryptoOrderDetailsDto.INSTANCE.fromProto(crypto_order_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: wormhole.service.v1.RealizedGainLossItemDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealizedGainLossItemDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RealizedGainLossItemDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RealizedGainLossItemDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "EquityOrderDetails", "OptionOrderDetails", "CryptoOrderDetails", "Companion", "Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto$CryptoOrderDetails;", "Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto$EquityOrderDetails;", "Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto$OptionOrderDetails;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class OrderDetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ OrderDetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OrderDetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto$EquityOrderDetails;", "Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto;", "Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;", "value", "<init>", "(Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;", "getValue", "()Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EquityOrderDetails extends OrderDetailsDto {
            private final EquityOrderDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EquityOrderDetails) && Intrinsics.areEqual(this.value, ((EquityOrderDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EquityOrderDetails(value=" + this.value + ")";
            }

            public final EquityOrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EquityOrderDetails(EquityOrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto$OptionOrderDetails;", "Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto;", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;", "value", "<init>", "(Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;", "getValue", "()Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OptionOrderDetails extends OrderDetailsDto {
            private final OptionOrderDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OptionOrderDetails) && Intrinsics.areEqual(this.value, ((OptionOrderDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OptionOrderDetails(value=" + this.value + ")";
            }

            public final OptionOrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OptionOrderDetails(OptionOrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto$CryptoOrderDetails;", "Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto;", "Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;", "value", "<init>", "(Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;", "getValue", "()Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes28.dex */
        public static final /* data */ class CryptoOrderDetails extends OrderDetailsDto {
            private final CryptoOrderDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CryptoOrderDetails) && Intrinsics.areEqual(this.value, ((CryptoOrderDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CryptoOrderDetails(value=" + this.value + ")";
            }

            public final CryptoOrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CryptoOrderDetails(CryptoOrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto;", "Lwormhole/service/v1/RealizedGainLossItem;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes28.dex */
        public static final class Companion implements Dto4.Creator<OrderDetailsDto, RealizedGainLossItem> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RealizedGainLossItem> getProtoAdapter() {
                return RealizedGainLossItem.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderDetailsDto fromProto(RealizedGainLossItem proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getEquity_order_details() != null) {
                    return new EquityOrderDetails(EquityOrderDetailsDto.INSTANCE.fromProto(proto.getEquity_order_details()));
                }
                if (proto.getOption_order_details() != null) {
                    return new OptionOrderDetails(OptionOrderDetailsDto.INSTANCE.fromProto(proto.getOption_order_details()));
                }
                if (proto.getCrypto_order_details() != null) {
                    return new CryptoOrderDetails(CryptoOrderDetailsDto.INSTANCE.fromProto(proto.getCrypto_order_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: RealizedGainLossItemDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e¨\u0006$"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lwormhole/service/v1/RealizedGainLossItem$EquityOrderDetails;", "Landroid/os/Parcelable;", "Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto$Surrogate;", "surrogate", "<init>", "(Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto$Surrogate;)V", "", "instrument_id", "(Ljava/lang/String;)V", "toProto", "()Lwormhole/service/v1/RealizedGainLossItem$EquityOrderDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto$Surrogate;", "getInstrument_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EquityOrderDetailsDto implements Dto3<RealizedGainLossItem.EquityOrderDetails>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<EquityOrderDetailsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EquityOrderDetailsDto, RealizedGainLossItem.EquityOrderDetails>> binaryBase64Serializer$delegate;
        private static final EquityOrderDetailsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ EquityOrderDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private EquityOrderDetailsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getInstrument_id() {
            return this.surrogate.getInstrument_id();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EquityOrderDetailsDto(String instrument_id) {
            this(new Surrogate(instrument_id));
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        }

        public /* synthetic */ EquityOrderDetailsDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public RealizedGainLossItem.EquityOrderDetails toProto() {
            return new RealizedGainLossItem.EquityOrderDetails(this.surrogate.getInstrument_id(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[EquityOrderDetailsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof EquityOrderDetailsDto) && Intrinsics.areEqual(((EquityOrderDetailsDto) other).surrogate, this.surrogate);
            }
            return true;
        }

        public int hashCode() {
            return this.surrogate.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto$Surrogate;", "", "", "instrument_id", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wormhole_v1_externalRelease", "(Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInstrument_id", "getInstrument_id$annotations", "()V", "Companion", "$serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String instrument_id;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.instrument_id, ((Surrogate) other).instrument_id);
            }

            public int hashCode() {
                return this.instrument_id.hashCode();
            }

            public String toString() {
                return "Surrogate(instrument_id=" + this.instrument_id + ")";
            }

            /* compiled from: RealizedGainLossItemDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto$Surrogate;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return RealizedGainLossItemDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.instrument_id = "";
                } else {
                    this.instrument_id = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$wormhole_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Intrinsics.areEqual(self.instrument_id, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 0, self.instrument_id);
            }

            public Surrogate(String instrument_id) {
                Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
                this.instrument_id = instrument_id;
            }

            public final String getInstrument_id() {
                return this.instrument_id;
            }

            public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;", "Lwormhole/service/v1/RealizedGainLossItem$EquityOrderDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<EquityOrderDetailsDto, RealizedGainLossItem.EquityOrderDetails> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EquityOrderDetailsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EquityOrderDetailsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EquityOrderDetailsDto> getBinaryBase64Serializer() {
                return (KSerializer) EquityOrderDetailsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RealizedGainLossItem.EquityOrderDetails> getProtoAdapter() {
                return RealizedGainLossItem.EquityOrderDetails.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EquityOrderDetailsDto getZeroValue() {
                return EquityOrderDetailsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EquityOrderDetailsDto fromProto(RealizedGainLossItem.EquityOrderDetails proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new EquityOrderDetailsDto(new Surrogate(proto.getInstrument_id()), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: wormhole.service.v1.RealizedGainLossItemDto$EquityOrderDetailsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealizedGainLossItemDto.EquityOrderDetailsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new EquityOrderDetailsDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes28.dex */
        public static final class Serializer implements KSerializer<EquityOrderDetailsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/wormhole.service.v1.RealizedGainLossItem.EquityOrderDetails", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EquityOrderDetailsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public EquityOrderDetailsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new EquityOrderDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$EquityOrderDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4188_4)
            public final String provideIntoMap() {
                return "wormhole.service.v1.RealizedGainLossItemDto$EquityOrderDetailsDto";
            }
        }
    }

    /* compiled from: RealizedGainLossItemDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005&%'()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006*"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails;", "Landroid/os/Parcelable;", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$Surrogate;", "surrogate", "<init>", "(Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$Surrogate;)V", "", "trade_value_multiplier", "", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto;", "underlyings", "(ILjava/util/List;)V", "toProto", "()Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$Surrogate;", "getTrade_value_multiplier", "getUnderlyings", "()Ljava/util/List;", "Companion", "Surrogate", "UnderlyingDto", "Serializer", "MultibindingModule", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionOrderDetailsDto implements Dto3<RealizedGainLossItem.OptionOrderDetails>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<OptionOrderDetailsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OptionOrderDetailsDto, RealizedGainLossItem.OptionOrderDetails>> binaryBase64Serializer$delegate;
        private static final OptionOrderDetailsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ OptionOrderDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private OptionOrderDetailsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final int getTrade_value_multiplier() {
            return this.surrogate.getTrade_value_multiplier();
        }

        public final List<UnderlyingDto> getUnderlyings() {
            return this.surrogate.getUnderlyings();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OptionOrderDetailsDto(int i, List<UnderlyingDto> underlyings) {
            this(new Surrogate(i, underlyings));
            Intrinsics.checkNotNullParameter(underlyings, "underlyings");
        }

        public /* synthetic */ OptionOrderDetailsDto(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (List<UnderlyingDto>) ((i2 & 2) != 0 ? CollectionsKt.emptyList() : list));
        }

        @Override // com.robinhood.idl.Dto
        public RealizedGainLossItem.OptionOrderDetails toProto() {
            int trade_value_multiplier = this.surrogate.getTrade_value_multiplier();
            List<UnderlyingDto> underlyings = this.surrogate.getUnderlyings();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(underlyings, 10));
            Iterator<T> it = underlyings.iterator();
            while (it.hasNext()) {
                arrayList.add(((UnderlyingDto) it.next()).toProto());
            }
            return new RealizedGainLossItem.OptionOrderDetails(trade_value_multiplier, arrayList, null, 4, null);
        }

        public String toString() {
            return "[OptionOrderDetailsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof OptionOrderDetailsDto) && Intrinsics.areEqual(((OptionOrderDetailsDto) other).surrogate, this.surrogate);
            }
            return true;
        }

        public int hashCode() {
            return this.surrogate.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002+*B0\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bB3\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001dR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(¨\u0006,"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "trade_value_multiplier", "", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto;", "underlyings", "<init>", "(ILjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wormhole_v1_externalRelease", "(Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTrade_value_multiplier", "getTrade_value_multiplier$annotations", "()V", "Ljava/util/List;", "getUnderlyings", "()Ljava/util/List;", "getUnderlyings$annotations", "Companion", "$serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final int trade_value_multiplier;
            private final List<UnderlyingDto> underlyings;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: wormhole.service.v1.RealizedGainLossItemDto$OptionOrderDetailsDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealizedGainLossItemDto.OptionOrderDetailsDto.Surrogate._childSerializers$_anonymous_();
                }
            })};

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this(0, (List) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(UnderlyingDto.Serializer.INSTANCE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.trade_value_multiplier == surrogate.trade_value_multiplier && Intrinsics.areEqual(this.underlyings, surrogate.underlyings);
            }

            public int hashCode() {
                return (Integer.hashCode(this.trade_value_multiplier) * 31) + this.underlyings.hashCode();
            }

            public String toString() {
                return "Surrogate(trade_value_multiplier=" + this.trade_value_multiplier + ", underlyings=" + this.underlyings + ")";
            }

            /* compiled from: RealizedGainLossItemDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$Surrogate;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return RealizedGainLossItemDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
                this.trade_value_multiplier = (i & 1) == 0 ? 0 : i2;
                if ((i & 2) == 0) {
                    this.underlyings = CollectionsKt.emptyList();
                } else {
                    this.underlyings = list;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$wormhole_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                int i = self.trade_value_multiplier;
                if (i != 0) {
                    output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                }
                if (Intrinsics.areEqual(self.underlyings, CollectionsKt.emptyList())) {
                    return;
                }
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.underlyings);
            }

            public Surrogate(int i, List<UnderlyingDto> underlyings) {
                Intrinsics.checkNotNullParameter(underlyings, "underlyings");
                this.trade_value_multiplier = i;
                this.underlyings = underlyings;
            }

            public final int getTrade_value_multiplier() {
                return this.trade_value_multiplier;
            }

            public final List<UnderlyingDto> getUnderlyings() {
                return this.underlyings;
            }

            public /* synthetic */ Surrogate(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
            }
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;", "Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<OptionOrderDetailsDto, RealizedGainLossItem.OptionOrderDetails> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OptionOrderDetailsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OptionOrderDetailsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OptionOrderDetailsDto> getBinaryBase64Serializer() {
                return (KSerializer) OptionOrderDetailsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RealizedGainLossItem.OptionOrderDetails> getProtoAdapter() {
                return RealizedGainLossItem.OptionOrderDetails.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OptionOrderDetailsDto getZeroValue() {
                return OptionOrderDetailsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OptionOrderDetailsDto fromProto(RealizedGainLossItem.OptionOrderDetails proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int trade_value_multiplier = proto.getTrade_value_multiplier();
                List<RealizedGainLossItem.OptionOrderDetails.Underlying> underlyings = proto.getUnderlyings();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(underlyings, 10));
                Iterator<T> it = underlyings.iterator();
                while (it.hasNext()) {
                    arrayList.add(UnderlyingDto.INSTANCE.fromProto((RealizedGainLossItem.OptionOrderDetails.Underlying) it.next()));
                }
                return new OptionOrderDetailsDto(new Surrogate(trade_value_multiplier, arrayList), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: wormhole.service.v1.RealizedGainLossItemDto$OptionOrderDetailsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealizedGainLossItemDto.OptionOrderDetailsDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new OptionOrderDetailsDto(0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0011¨\u0006*"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto;", "Lcom/robinhood/idl/MessageDto;", "Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails$Underlying;", "Landroid/os/Parcelable;", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$Surrogate;", "surrogate", "<init>", "(Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$Surrogate;)V", "", "id", "Lwormhole/service/v1/UnderlyingTypeDto;", "type", "symbol", "(Ljava/lang/String;Lwormhole/service/v1/UnderlyingTypeDto;Ljava/lang/String;)V", "toProto", "()Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails$Underlying;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$Surrogate;", "getId", "getType", "()Lwormhole/service/v1/UnderlyingTypeDto;", "getSymbol", "Companion", "Surrogate", "Serializer", "MultibindingModule", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class UnderlyingDto implements Dto3<RealizedGainLossItem.OptionOrderDetails.Underlying>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<UnderlyingDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<UnderlyingDto, RealizedGainLossItem.OptionOrderDetails.Underlying>> binaryBase64Serializer$delegate;
            private static final UnderlyingDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ UnderlyingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private UnderlyingDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final String getId() {
                return this.surrogate.getId();
            }

            public final UnderlyingTypeDto getType() {
                return this.surrogate.getType();
            }

            public final String getSymbol() {
                return this.surrogate.getSymbol();
            }

            public /* synthetic */ UnderlyingDto(String str, UnderlyingTypeDto underlyingTypeDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? UnderlyingTypeDto.INSTANCE.getZeroValue() : underlyingTypeDto, (i & 4) != 0 ? null : str2);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public UnderlyingDto(String id, UnderlyingTypeDto type2, String str) {
                this(new Surrogate(id, type2, str));
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(type2, "type");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public RealizedGainLossItem.OptionOrderDetails.Underlying toProto() {
                return new RealizedGainLossItem.OptionOrderDetails.Underlying(this.surrogate.getId(), (UnderlyingType) this.surrogate.getType().toProto(), this.surrogate.getSymbol(), null, 8, null);
            }

            public String toString() {
                return "[UnderlyingDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof UnderlyingDto) && Intrinsics.areEqual(((UnderlyingDto) other).surrogate, this.surrogate);
                }
                return true;
            }

            public int hashCode() {
                return this.surrogate.hashCode();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* compiled from: RealizedGainLossItemDto.kt */
            @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010\u0018¨\u0006+"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$Surrogate;", "", "", "id", "Lwormhole/service/v1/UnderlyingTypeDto;", "type", "symbol", "<init>", "(Ljava/lang/String;Lwormhole/service/v1/UnderlyingTypeDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lwormhole/service/v1/UnderlyingTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wormhole_v1_externalRelease", "(Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lwormhole/service/v1/UnderlyingTypeDto;", "getType", "()Lwormhole/service/v1/UnderlyingTypeDto;", "getType$annotations", "getSymbol", "getSymbol$annotations", "Companion", "$serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String id;
                private final String symbol;
                private final UnderlyingTypeDto type;

                public Surrogate() {
                    this((String) null, (UnderlyingTypeDto) null, (String) null, 7, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.id, surrogate.id) && this.type == surrogate.type && Intrinsics.areEqual(this.symbol, surrogate.symbol);
                }

                public int hashCode() {
                    int iHashCode = ((this.id.hashCode() * 31) + this.type.hashCode()) * 31;
                    String str = this.symbol;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "Surrogate(id=" + this.id + ", type=" + this.type + ", symbol=" + this.symbol + ")";
                }

                /* compiled from: RealizedGainLossItemDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$Surrogate;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return RealizedGainLossItemDto5.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, UnderlyingTypeDto underlyingTypeDto, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                    this.id = (i & 1) == 0 ? "" : str;
                    if ((i & 2) == 0) {
                        this.type = UnderlyingTypeDto.INSTANCE.getZeroValue();
                    } else {
                        this.type = underlyingTypeDto;
                    }
                    if ((i & 4) == 0) {
                        this.symbol = null;
                    } else {
                        this.symbol = str2;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$wormhole_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.id, "")) {
                        output.encodeStringElement(serialDesc, 0, self.id);
                    }
                    if (self.type != UnderlyingTypeDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 1, UnderlyingTypeDto.Serializer.INSTANCE, self.type);
                    }
                    String str = self.symbol;
                    if (str != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
                    }
                }

                public Surrogate(String id, UnderlyingTypeDto type2, String str) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(type2, "type");
                    this.id = id;
                    this.type = type2;
                    this.symbol = str;
                }

                public final String getId() {
                    return this.id;
                }

                public /* synthetic */ Surrogate(String str, UnderlyingTypeDto underlyingTypeDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? UnderlyingTypeDto.INSTANCE.getZeroValue() : underlyingTypeDto, (i & 4) != 0 ? null : str2);
                }

                public final UnderlyingTypeDto getType() {
                    return this.type;
                }

                public final String getSymbol() {
                    return this.symbol;
                }
            }

            /* compiled from: RealizedGainLossItemDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto;", "Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails$Underlying;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<UnderlyingDto, RealizedGainLossItem.OptionOrderDetails.Underlying> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<UnderlyingDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<UnderlyingDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<UnderlyingDto> getBinaryBase64Serializer() {
                    return (KSerializer) UnderlyingDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<RealizedGainLossItem.OptionOrderDetails.Underlying> getProtoAdapter() {
                    return RealizedGainLossItem.OptionOrderDetails.Underlying.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public UnderlyingDto getZeroValue() {
                    return UnderlyingDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public UnderlyingDto fromProto(RealizedGainLossItem.OptionOrderDetails.Underlying proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new UnderlyingDto(new Surrogate(proto.getId(), UnderlyingTypeDto.INSTANCE.fromProto(proto.getType()), proto.getSymbol()), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: wormhole.service.v1.RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RealizedGainLossItemDto.OptionOrderDetailsDto.UnderlyingDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new UnderlyingDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: RealizedGainLossItemDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto;", "<init>", "()V", "surrogateSerializer", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<UnderlyingDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/wormhole.service.v1.RealizedGainLossItem.OptionOrderDetails.Underlying", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, UnderlyingDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public UnderlyingDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new UnderlyingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: RealizedGainLossItemDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4188_4)
                public final String provideIntoMap() {
                    return "wormhole.service.v1.RealizedGainLossItemDto$OptionOrderDetailsDto$UnderlyingDto";
                }
            }
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes28.dex */
        public static final class Serializer implements KSerializer<OptionOrderDetailsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/wormhole.service.v1.RealizedGainLossItem.OptionOrderDetails", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OptionOrderDetailsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public OptionOrderDetailsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new OptionOrderDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$OptionOrderDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4188_4)
            public final String provideIntoMap() {
                return "wormhole.service.v1.RealizedGainLossItemDto$OptionOrderDetailsDto";
            }
        }
    }

    /* compiled from: RealizedGainLossItemDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0011¨\u0006*"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lwormhole/service/v1/RealizedGainLossItem$CryptoOrderDetails;", "Landroid/os/Parcelable;", "Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto$Surrogate;", "surrogate", "<init>", "(Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto$Surrogate;)V", "Lwormhole/service/v1/RealizedGainLossItemComponentDto;", "acquired", "transferred", "", "currency_pair_id", "(Lwormhole/service/v1/RealizedGainLossItemComponentDto;Lwormhole/service/v1/RealizedGainLossItemComponentDto;Ljava/lang/String;)V", "toProto", "()Lwormhole/service/v1/RealizedGainLossItem$CryptoOrderDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto$Surrogate;", "getAcquired", "()Lwormhole/service/v1/RealizedGainLossItemComponentDto;", "getTransferred", "getCurrency_pair_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes28.dex */
    public static final class CryptoOrderDetailsDto implements Dto3<RealizedGainLossItem.CryptoOrderDetails>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CryptoOrderDetailsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CryptoOrderDetailsDto, RealizedGainLossItem.CryptoOrderDetails>> binaryBase64Serializer$delegate;
        private static final CryptoOrderDetailsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CryptoOrderDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CryptoOrderDetailsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final RealizedGainLossItemComponentDto getAcquired() {
            return this.surrogate.getAcquired();
        }

        public final RealizedGainLossItemComponentDto getTransferred() {
            return this.surrogate.getTransferred();
        }

        public final String getCurrency_pair_id() {
            return this.surrogate.getCurrency_pair_id();
        }

        public /* synthetic */ CryptoOrderDetailsDto(RealizedGainLossItemComponentDto realizedGainLossItemComponentDto, RealizedGainLossItemComponentDto realizedGainLossItemComponentDto2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : realizedGainLossItemComponentDto, (i & 2) != 0 ? null : realizedGainLossItemComponentDto2, (i & 4) != 0 ? "" : str);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CryptoOrderDetailsDto(RealizedGainLossItemComponentDto realizedGainLossItemComponentDto, RealizedGainLossItemComponentDto realizedGainLossItemComponentDto2, String currency_pair_id) {
            this(new Surrogate(realizedGainLossItemComponentDto, realizedGainLossItemComponentDto2, currency_pair_id));
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        }

        @Override // com.robinhood.idl.Dto
        public RealizedGainLossItem.CryptoOrderDetails toProto() {
            RealizedGainLossItemComponentDto acquired = this.surrogate.getAcquired();
            RealizedGainLossItemComponent proto = acquired != null ? acquired.toProto() : null;
            RealizedGainLossItemComponentDto transferred = this.surrogate.getTransferred();
            return new RealizedGainLossItem.CryptoOrderDetails(proto, transferred != null ? transferred.toProto() : null, this.surrogate.getCurrency_pair_id(), null, 8, null);
        }

        public String toString() {
            return "[CryptoOrderDetailsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CryptoOrderDetailsDto) && Intrinsics.areEqual(((CryptoOrderDetailsDto) other).surrogate, this.surrogate);
            }
            return true;
        }

        public int hashCode() {
            return this.surrogate.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0018¨\u0006+"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto$Surrogate;", "", "Lwormhole/service/v1/RealizedGainLossItemComponentDto;", "acquired", "transferred", "", "currency_pair_id", "<init>", "(Lwormhole/service/v1/RealizedGainLossItemComponentDto;Lwormhole/service/v1/RealizedGainLossItemComponentDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILwormhole/service/v1/RealizedGainLossItemComponentDto;Lwormhole/service/v1/RealizedGainLossItemComponentDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wormhole_v1_externalRelease", "(Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwormhole/service/v1/RealizedGainLossItemComponentDto;", "getAcquired", "()Lwormhole/service/v1/RealizedGainLossItemComponentDto;", "getAcquired$annotations", "()V", "getTransferred", "getTransferred$annotations", "Ljava/lang/String;", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "Companion", "$serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final RealizedGainLossItemComponentDto acquired;
            private final String currency_pair_id;
            private final RealizedGainLossItemComponentDto transferred;

            public Surrogate() {
                this((RealizedGainLossItemComponentDto) null, (RealizedGainLossItemComponentDto) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.acquired, surrogate.acquired) && Intrinsics.areEqual(this.transferred, surrogate.transferred) && Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id);
            }

            public int hashCode() {
                RealizedGainLossItemComponentDto realizedGainLossItemComponentDto = this.acquired;
                int iHashCode = (realizedGainLossItemComponentDto == null ? 0 : realizedGainLossItemComponentDto.hashCode()) * 31;
                RealizedGainLossItemComponentDto realizedGainLossItemComponentDto2 = this.transferred;
                return ((iHashCode + (realizedGainLossItemComponentDto2 != null ? realizedGainLossItemComponentDto2.hashCode() : 0)) * 31) + this.currency_pair_id.hashCode();
            }

            public String toString() {
                return "Surrogate(acquired=" + this.acquired + ", transferred=" + this.transferred + ", currency_pair_id=" + this.currency_pair_id + ")";
            }

            /* compiled from: RealizedGainLossItemDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto$Surrogate;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return RealizedGainLossItemDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, RealizedGainLossItemComponentDto realizedGainLossItemComponentDto, RealizedGainLossItemComponentDto realizedGainLossItemComponentDto2, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.acquired = null;
                } else {
                    this.acquired = realizedGainLossItemComponentDto;
                }
                if ((i & 2) == 0) {
                    this.transferred = null;
                } else {
                    this.transferred = realizedGainLossItemComponentDto2;
                }
                if ((i & 4) == 0) {
                    this.currency_pair_id = "";
                } else {
                    this.currency_pair_id = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$wormhole_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                RealizedGainLossItemComponentDto realizedGainLossItemComponentDto = self.acquired;
                if (realizedGainLossItemComponentDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, RealizedGainLossItemComponentDto.Serializer.INSTANCE, realizedGainLossItemComponentDto);
                }
                RealizedGainLossItemComponentDto realizedGainLossItemComponentDto2 = self.transferred;
                if (realizedGainLossItemComponentDto2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, RealizedGainLossItemComponentDto.Serializer.INSTANCE, realizedGainLossItemComponentDto2);
                }
                if (Intrinsics.areEqual(self.currency_pair_id, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 2, self.currency_pair_id);
            }

            public Surrogate(RealizedGainLossItemComponentDto realizedGainLossItemComponentDto, RealizedGainLossItemComponentDto realizedGainLossItemComponentDto2, String currency_pair_id) {
                Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
                this.acquired = realizedGainLossItemComponentDto;
                this.transferred = realizedGainLossItemComponentDto2;
                this.currency_pair_id = currency_pair_id;
            }

            public final RealizedGainLossItemComponentDto getAcquired() {
                return this.acquired;
            }

            public final RealizedGainLossItemComponentDto getTransferred() {
                return this.transferred;
            }

            public final String getCurrency_pair_id() {
                return this.currency_pair_id;
            }

            public /* synthetic */ Surrogate(RealizedGainLossItemComponentDto realizedGainLossItemComponentDto, RealizedGainLossItemComponentDto realizedGainLossItemComponentDto2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : realizedGainLossItemComponentDto, (i & 2) != 0 ? null : realizedGainLossItemComponentDto2, (i & 4) != 0 ? "" : str);
            }
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;", "Lwormhole/service/v1/RealizedGainLossItem$CryptoOrderDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<CryptoOrderDetailsDto, RealizedGainLossItem.CryptoOrderDetails> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CryptoOrderDetailsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoOrderDetailsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoOrderDetailsDto> getBinaryBase64Serializer() {
                return (KSerializer) CryptoOrderDetailsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RealizedGainLossItem.CryptoOrderDetails> getProtoAdapter() {
                return RealizedGainLossItem.CryptoOrderDetails.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoOrderDetailsDto getZeroValue() {
                return CryptoOrderDetailsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoOrderDetailsDto fromProto(RealizedGainLossItem.CryptoOrderDetails proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                RealizedGainLossItemComponent acquired = proto.getAcquired();
                DefaultConstructorMarker defaultConstructorMarker = null;
                RealizedGainLossItemComponentDto realizedGainLossItemComponentDtoFromProto = acquired != null ? RealizedGainLossItemComponentDto.INSTANCE.fromProto(acquired) : null;
                RealizedGainLossItemComponent transferred = proto.getTransferred();
                return new CryptoOrderDetailsDto(new Surrogate(realizedGainLossItemComponentDtoFromProto, transferred != null ? RealizedGainLossItemComponentDto.INSTANCE.fromProto(transferred) : null, proto.getCurrency_pair_id()), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: wormhole.service.v1.RealizedGainLossItemDto$CryptoOrderDetailsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealizedGainLossItemDto.CryptoOrderDetailsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new CryptoOrderDetailsDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CryptoOrderDetailsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/wormhole.service.v1.RealizedGainLossItem.CryptoOrderDetails", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CryptoOrderDetailsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CryptoOrderDetailsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CryptoOrderDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: RealizedGainLossItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$CryptoOrderDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "wormhole.service.v1.RealizedGainLossItemDto$CryptoOrderDetailsDto";
            }
        }
    }

    /* compiled from: RealizedGainLossItemDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemDto;", "<init>", "()V", "surrogateSerializer", "Lwormhole/service/v1/RealizedGainLossItemDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<RealizedGainLossItemDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/wormhole.service.v1.RealizedGainLossItem", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RealizedGainLossItemDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RealizedGainLossItemDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RealizedGainLossItemDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RealizedGainLossItemDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "wormhole.service.v1.RealizedGainLossItemDto";
        }
    }
}
