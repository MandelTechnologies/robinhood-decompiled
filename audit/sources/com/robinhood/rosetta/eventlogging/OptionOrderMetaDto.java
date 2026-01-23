package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.UnsignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.OptionOrderCheckDataDto;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.rosetta.eventlogging.OptionOrderMetaDto;
import com.robinhood.rosetta.eventlogging.OptionRelatedOrderDataDto;
import com.robinhood.rosetta.eventlogging.OptionsOrderTypeDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.option.MarketabilityType;
import rosetta.option.MarketabilityTypeDto;
import rosetta.order.DefaultPriceSetting;
import rosetta.order.DefaultPriceSettingDto;
import rosetta.order.State;
import rosetta.order.StateDto;

/* compiled from: OptionOrderMetaDto.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 g2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005fghijB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B¯\u0002\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010$\u001a\u00020\t\u0012\b\b\u0002\u0010%\u001a\u00020\t\u0012\b\b\u0002\u0010&\u001a\u00020\t\u0012\b\b\u0002\u0010'\u001a\u00020\t\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\b\b\u0002\u0010+\u001a\u00020,\u0012\b\b\u0002\u0010-\u001a\u00020\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/¢\u0006\u0004\b\u0006\u00100J¬\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/J\b\u0010Y\u001a\u00020\u0002H\u0016J\b\u0010Z\u001a\u00020\tH\u0016J\u0013\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^H\u0096\u0002J\b\u0010_\u001a\u00020\u0014H\u0016J\u0018\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020\u0014H\u0016J\b\u0010e\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b3\u00102R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u00102R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b7\u00102R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b8\u00102R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010:R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b=\u00102R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b>\u00102R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b?\u00102R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b@\u00102R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bE\u0010DR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bH\u00102R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010#\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bK\u00102R\u0011\u0010$\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bL\u00102R\u0011\u0010%\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bM\u00102R\u0011\u0010&\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bN\u00102R\u0011\u0010'\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bO\u00102R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010*\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bR\u00102R\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010-\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bU\u00102R\u0013\u0010.\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006k"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$Surrogate;)V", BidAskDetails3.BID_PRICE, "", BidAskDetails3.ASK_PRICE, "entered_price", "source", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "chain_symbol", "existing_order_id", "has_position", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "is_watching", "num_legs", "", "adjusted_mark_price", "adjusted_mark_price_round_down", "adjusted_mark_price_min_tick", "adjusted_mark_price_round_down_min_tick", "marketability", "Lrosetta/option/MarketabilityTypeDto;", "prev_order_state", "Lrosetta/order/StateDto;", "current_order_state", "default_price_setting", "Lrosetta/order/DefaultPriceSettingDto;", "marketability_request_id", "order_check_data", "Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto;", "strategy_code", "tmp_round_experiment_no_round_price", "tmp_round_experiment_mark_round_price", "tmp_round_experiment_min_tick_round_price", "tmp_round_experiment_mark_and_min_tick_round_price", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountTypeDto;", "previous_quantity", "option_order_type", "Lcom/robinhood/rosetta/eventlogging/OptionsOrderTypeDto;", "chain_type", "related_order_data", "Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderDataDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/option/MarketabilityTypeDto;Lrosetta/order/StateDto;Lrosetta/order/StateDto;Lrosetta/order/DefaultPriceSettingDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionsOrderTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderDataDto;)V", "getBid_price", "()Ljava/lang/String;", "getAsk_price", "getEntered_price", "getSource", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "getChain_symbol", "getExisting_order_id", "getHas_position", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getNum_legs", "()I", "getAdjusted_mark_price", "getAdjusted_mark_price_round_down", "getAdjusted_mark_price_min_tick", "getAdjusted_mark_price_round_down_min_tick", "getMarketability", "()Lrosetta/option/MarketabilityTypeDto;", "getPrev_order_state", "()Lrosetta/order/StateDto;", "getCurrent_order_state", "getDefault_price_setting", "()Lrosetta/order/DefaultPriceSettingDto;", "getMarketability_request_id", "getOrder_check_data", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto;", "getStrategy_code", "getTmp_round_experiment_no_round_price", "getTmp_round_experiment_mark_round_price", "getTmp_round_experiment_min_tick_round_price", "getTmp_round_experiment_mark_and_min_tick_round_price", "getAccount_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getPrevious_quantity", "getOption_order_type", "()Lcom/robinhood/rosetta/eventlogging/OptionsOrderTypeDto;", "getChain_type", "getRelated_order_data", "()Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderDataDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SourceDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class OptionOrderMetaDto implements Dto3<OptionOrderMeta>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionOrderMetaDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionOrderMetaDto, OptionOrderMeta>> binaryBase64Serializer$delegate;
    private static final OptionOrderMetaDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionOrderMetaDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionOrderMetaDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getBid_price() {
        return this.surrogate.getBid_price();
    }

    public final String getAsk_price() {
        return this.surrogate.getAsk_price();
    }

    public final String getEntered_price() {
        return this.surrogate.getEntered_price();
    }

    public final SourceDto getSource() {
        return this.surrogate.getSource();
    }

    public final String getChain_symbol() {
        return this.surrogate.getChain_symbol();
    }

    public final String getExisting_order_id() {
        return this.surrogate.getExisting_order_id();
    }

    public final BooleanDto getHas_position() {
        return this.surrogate.getHas_position();
    }

    public final BooleanDto is_watching() {
        return this.surrogate.is_watching();
    }

    public final int getNum_legs() {
        return this.surrogate.getNum_legs();
    }

    public final String getAdjusted_mark_price() {
        return this.surrogate.getAdjusted_mark_price();
    }

    public final String getAdjusted_mark_price_round_down() {
        return this.surrogate.getAdjusted_mark_price_round_down();
    }

    public final String getAdjusted_mark_price_min_tick() {
        return this.surrogate.getAdjusted_mark_price_min_tick();
    }

    public final String getAdjusted_mark_price_round_down_min_tick() {
        return this.surrogate.getAdjusted_mark_price_round_down_min_tick();
    }

    public final MarketabilityTypeDto getMarketability() {
        return this.surrogate.getMarketability();
    }

    public final StateDto getPrev_order_state() {
        return this.surrogate.getPrev_order_state();
    }

    public final StateDto getCurrent_order_state() {
        return this.surrogate.getCurrent_order_state();
    }

    public final DefaultPriceSettingDto getDefault_price_setting() {
        return this.surrogate.getDefault_price_setting();
    }

    public final String getMarketability_request_id() {
        return this.surrogate.getMarketability_request_id();
    }

    public final OptionOrderCheckDataDto getOrder_check_data() {
        return this.surrogate.getOrder_check_data();
    }

    public final String getStrategy_code() {
        return this.surrogate.getStrategy_code();
    }

    public final String getTmp_round_experiment_no_round_price() {
        return this.surrogate.getTmp_round_experiment_no_round_price();
    }

    public final String getTmp_round_experiment_mark_round_price() {
        return this.surrogate.getTmp_round_experiment_mark_round_price();
    }

    public final String getTmp_round_experiment_min_tick_round_price() {
        return this.surrogate.getTmp_round_experiment_min_tick_round_price();
    }

    public final String getTmp_round_experiment_mark_and_min_tick_round_price() {
        return this.surrogate.getTmp_round_experiment_mark_and_min_tick_round_price();
    }

    public final BrokerageAccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final String getPrevious_quantity() {
        return this.surrogate.getPrevious_quantity();
    }

    public final OptionsOrderTypeDto getOption_order_type() {
        return this.surrogate.getOption_order_type();
    }

    public final String getChain_type() {
        return this.surrogate.getChain_type();
    }

    public final OptionRelatedOrderDataDto getRelated_order_data() {
        return this.surrogate.getRelated_order_data();
    }

    public /* synthetic */ OptionOrderMetaDto(String str, String str2, String str3, SourceDto sourceDto, String str4, String str5, BooleanDto booleanDto, BooleanDto booleanDto2, int i, String str6, String str7, String str8, String str9, MarketabilityTypeDto marketabilityTypeDto, StateDto stateDto, StateDto stateDto2, DefaultPriceSettingDto defaultPriceSettingDto, String str10, OptionOrderCheckDataDto optionOrderCheckDataDto, String str11, String str12, String str13, String str14, String str15, BrokerageAccountTypeDto brokerageAccountTypeDto, String str16, OptionsOrderTypeDto optionsOrderTypeDto, String str17, OptionRelatedOrderDataDto optionRelatedOrderDataDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i2 & 128) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? "" : str7, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) != 0 ? "" : str9, (i2 & 8192) != 0 ? MarketabilityTypeDto.INSTANCE.getZeroValue() : marketabilityTypeDto, (i2 & 16384) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i2 & 32768) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto2, (i2 & 65536) != 0 ? DefaultPriceSettingDto.INSTANCE.getZeroValue() : defaultPriceSettingDto, (i2 & 131072) != 0 ? "" : str10, (i2 & 262144) != 0 ? null : optionOrderCheckDataDto, (i2 & 524288) != 0 ? "" : str11, (i2 & 1048576) != 0 ? "" : str12, (i2 & 2097152) != 0 ? "" : str13, (i2 & 4194304) != 0 ? "" : str14, (i2 & 8388608) != 0 ? "" : str15, (i2 & 16777216) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i2 & 33554432) != 0 ? "" : str16, (i2 & 67108864) != 0 ? OptionsOrderTypeDto.INSTANCE.getZeroValue() : optionsOrderTypeDto, (i2 & 134217728) == 0 ? str17 : "", (i2 & 268435456) != 0 ? null : optionRelatedOrderDataDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionOrderMetaDto(String bid_price, String ask_price, String entered_price, SourceDto source, String chain_symbol, String existing_order_id, BooleanDto has_position, BooleanDto is_watching, int i, String adjusted_mark_price, String adjusted_mark_price_round_down, String adjusted_mark_price_min_tick, String adjusted_mark_price_round_down_min_tick, MarketabilityTypeDto marketability, StateDto prev_order_state, StateDto current_order_state, DefaultPriceSettingDto default_price_setting, String marketability_request_id, OptionOrderCheckDataDto optionOrderCheckDataDto, String strategy_code, String tmp_round_experiment_no_round_price, String tmp_round_experiment_mark_round_price, String tmp_round_experiment_min_tick_round_price, String tmp_round_experiment_mark_and_min_tick_round_price, BrokerageAccountTypeDto account_type, String previous_quantity, OptionsOrderTypeDto option_order_type, String chain_type, OptionRelatedOrderDataDto optionRelatedOrderDataDto) {
        this(new Surrogate(bid_price, ask_price, entered_price, source, chain_symbol, existing_order_id, has_position, is_watching, i, adjusted_mark_price, adjusted_mark_price_round_down, adjusted_mark_price_min_tick, adjusted_mark_price_round_down_min_tick, marketability, prev_order_state, current_order_state, default_price_setting, marketability_request_id, optionOrderCheckDataDto, strategy_code, tmp_round_experiment_no_round_price, tmp_round_experiment_mark_round_price, tmp_round_experiment_min_tick_round_price, tmp_round_experiment_mark_and_min_tick_round_price, account_type, previous_quantity, option_order_type, chain_type, optionRelatedOrderDataDto));
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(entered_price, "entered_price");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
        Intrinsics.checkNotNullParameter(has_position, "has_position");
        Intrinsics.checkNotNullParameter(is_watching, "is_watching");
        Intrinsics.checkNotNullParameter(adjusted_mark_price, "adjusted_mark_price");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down, "adjusted_mark_price_round_down");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_min_tick, "adjusted_mark_price_min_tick");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down_min_tick, "adjusted_mark_price_round_down_min_tick");
        Intrinsics.checkNotNullParameter(marketability, "marketability");
        Intrinsics.checkNotNullParameter(prev_order_state, "prev_order_state");
        Intrinsics.checkNotNullParameter(current_order_state, "current_order_state");
        Intrinsics.checkNotNullParameter(default_price_setting, "default_price_setting");
        Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
        Intrinsics.checkNotNullParameter(strategy_code, "strategy_code");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_no_round_price, "tmp_round_experiment_no_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_round_price, "tmp_round_experiment_mark_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_min_tick_round_price, "tmp_round_experiment_min_tick_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_and_min_tick_round_price, "tmp_round_experiment_mark_and_min_tick_round_price");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(previous_quantity, "previous_quantity");
        Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
        Intrinsics.checkNotNullParameter(chain_type, "chain_type");
    }

    public static /* synthetic */ OptionOrderMetaDto copy$default(OptionOrderMetaDto optionOrderMetaDto, String str, String str2, String str3, SourceDto sourceDto, String str4, String str5, BooleanDto booleanDto, BooleanDto booleanDto2, int i, String str6, String str7, String str8, String str9, MarketabilityTypeDto marketabilityTypeDto, StateDto stateDto, StateDto stateDto2, DefaultPriceSettingDto defaultPriceSettingDto, String str10, OptionOrderCheckDataDto optionOrderCheckDataDto, String str11, String str12, String str13, String str14, String str15, BrokerageAccountTypeDto brokerageAccountTypeDto, String str16, OptionsOrderTypeDto optionsOrderTypeDto, String str17, OptionRelatedOrderDataDto optionRelatedOrderDataDto, int i2, Object obj) {
        OptionRelatedOrderDataDto related_order_data;
        String str18;
        String bid_price = (i2 & 1) != 0 ? optionOrderMetaDto.surrogate.getBid_price() : str;
        String ask_price = (i2 & 2) != 0 ? optionOrderMetaDto.surrogate.getAsk_price() : str2;
        String entered_price = (i2 & 4) != 0 ? optionOrderMetaDto.surrogate.getEntered_price() : str3;
        SourceDto source = (i2 & 8) != 0 ? optionOrderMetaDto.surrogate.getSource() : sourceDto;
        String chain_symbol = (i2 & 16) != 0 ? optionOrderMetaDto.surrogate.getChain_symbol() : str4;
        String existing_order_id = (i2 & 32) != 0 ? optionOrderMetaDto.surrogate.getExisting_order_id() : str5;
        BooleanDto has_position = (i2 & 64) != 0 ? optionOrderMetaDto.surrogate.getHas_position() : booleanDto;
        BooleanDto booleanDtoIs_watching = (i2 & 128) != 0 ? optionOrderMetaDto.surrogate.is_watching() : booleanDto2;
        int num_legs = (i2 & 256) != 0 ? optionOrderMetaDto.surrogate.getNum_legs() : i;
        String adjusted_mark_price = (i2 & 512) != 0 ? optionOrderMetaDto.surrogate.getAdjusted_mark_price() : str6;
        String adjusted_mark_price_round_down = (i2 & 1024) != 0 ? optionOrderMetaDto.surrogate.getAdjusted_mark_price_round_down() : str7;
        String adjusted_mark_price_min_tick = (i2 & 2048) != 0 ? optionOrderMetaDto.surrogate.getAdjusted_mark_price_min_tick() : str8;
        String adjusted_mark_price_round_down_min_tick = (i2 & 4096) != 0 ? optionOrderMetaDto.surrogate.getAdjusted_mark_price_round_down_min_tick() : str9;
        MarketabilityTypeDto marketability = (i2 & 8192) != 0 ? optionOrderMetaDto.surrogate.getMarketability() : marketabilityTypeDto;
        String str19 = bid_price;
        StateDto prev_order_state = (i2 & 16384) != 0 ? optionOrderMetaDto.surrogate.getPrev_order_state() : stateDto;
        StateDto current_order_state = (i2 & 32768) != 0 ? optionOrderMetaDto.surrogate.getCurrent_order_state() : stateDto2;
        DefaultPriceSettingDto default_price_setting = (i2 & 65536) != 0 ? optionOrderMetaDto.surrogate.getDefault_price_setting() : defaultPriceSettingDto;
        String marketability_request_id = (i2 & 131072) != 0 ? optionOrderMetaDto.surrogate.getMarketability_request_id() : str10;
        OptionOrderCheckDataDto order_check_data = (i2 & 262144) != 0 ? optionOrderMetaDto.surrogate.getOrder_check_data() : optionOrderCheckDataDto;
        String strategy_code = (i2 & 524288) != 0 ? optionOrderMetaDto.surrogate.getStrategy_code() : str11;
        String tmp_round_experiment_no_round_price = (i2 & 1048576) != 0 ? optionOrderMetaDto.surrogate.getTmp_round_experiment_no_round_price() : str12;
        String tmp_round_experiment_mark_round_price = (i2 & 2097152) != 0 ? optionOrderMetaDto.surrogate.getTmp_round_experiment_mark_round_price() : str13;
        String tmp_round_experiment_min_tick_round_price = (i2 & 4194304) != 0 ? optionOrderMetaDto.surrogate.getTmp_round_experiment_min_tick_round_price() : str14;
        String tmp_round_experiment_mark_and_min_tick_round_price = (i2 & 8388608) != 0 ? optionOrderMetaDto.surrogate.getTmp_round_experiment_mark_and_min_tick_round_price() : str15;
        BrokerageAccountTypeDto account_type = (i2 & 16777216) != 0 ? optionOrderMetaDto.surrogate.getAccount_type() : brokerageAccountTypeDto;
        String previous_quantity = (i2 & 33554432) != 0 ? optionOrderMetaDto.surrogate.getPrevious_quantity() : str16;
        OptionsOrderTypeDto option_order_type = (i2 & 67108864) != 0 ? optionOrderMetaDto.surrogate.getOption_order_type() : optionsOrderTypeDto;
        String chain_type = (i2 & 134217728) != 0 ? optionOrderMetaDto.surrogate.getChain_type() : str17;
        if ((i2 & 268435456) != 0) {
            str18 = chain_type;
            related_order_data = optionOrderMetaDto.surrogate.getRelated_order_data();
        } else {
            related_order_data = optionRelatedOrderDataDto;
            str18 = chain_type;
        }
        return optionOrderMetaDto.copy(str19, ask_price, entered_price, source, chain_symbol, existing_order_id, has_position, booleanDtoIs_watching, num_legs, adjusted_mark_price, adjusted_mark_price_round_down, adjusted_mark_price_min_tick, adjusted_mark_price_round_down_min_tick, marketability, prev_order_state, current_order_state, default_price_setting, marketability_request_id, order_check_data, strategy_code, tmp_round_experiment_no_round_price, tmp_round_experiment_mark_round_price, tmp_round_experiment_min_tick_round_price, tmp_round_experiment_mark_and_min_tick_round_price, account_type, previous_quantity, option_order_type, str18, related_order_data);
    }

    public final OptionOrderMetaDto copy(String bid_price, String ask_price, String entered_price, SourceDto source, String chain_symbol, String existing_order_id, BooleanDto has_position, BooleanDto is_watching, int num_legs, String adjusted_mark_price, String adjusted_mark_price_round_down, String adjusted_mark_price_min_tick, String adjusted_mark_price_round_down_min_tick, MarketabilityTypeDto marketability, StateDto prev_order_state, StateDto current_order_state, DefaultPriceSettingDto default_price_setting, String marketability_request_id, OptionOrderCheckDataDto order_check_data, String strategy_code, String tmp_round_experiment_no_round_price, String tmp_round_experiment_mark_round_price, String tmp_round_experiment_min_tick_round_price, String tmp_round_experiment_mark_and_min_tick_round_price, BrokerageAccountTypeDto account_type, String previous_quantity, OptionsOrderTypeDto option_order_type, String chain_type, OptionRelatedOrderDataDto related_order_data) {
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(entered_price, "entered_price");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
        Intrinsics.checkNotNullParameter(has_position, "has_position");
        Intrinsics.checkNotNullParameter(is_watching, "is_watching");
        Intrinsics.checkNotNullParameter(adjusted_mark_price, "adjusted_mark_price");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down, "adjusted_mark_price_round_down");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_min_tick, "adjusted_mark_price_min_tick");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down_min_tick, "adjusted_mark_price_round_down_min_tick");
        Intrinsics.checkNotNullParameter(marketability, "marketability");
        Intrinsics.checkNotNullParameter(prev_order_state, "prev_order_state");
        Intrinsics.checkNotNullParameter(current_order_state, "current_order_state");
        Intrinsics.checkNotNullParameter(default_price_setting, "default_price_setting");
        Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
        Intrinsics.checkNotNullParameter(strategy_code, "strategy_code");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_no_round_price, "tmp_round_experiment_no_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_round_price, "tmp_round_experiment_mark_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_min_tick_round_price, "tmp_round_experiment_min_tick_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_and_min_tick_round_price, "tmp_round_experiment_mark_and_min_tick_round_price");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(previous_quantity, "previous_quantity");
        Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
        Intrinsics.checkNotNullParameter(chain_type, "chain_type");
        return new OptionOrderMetaDto(new Surrogate(bid_price, ask_price, entered_price, source, chain_symbol, existing_order_id, has_position, is_watching, num_legs, adjusted_mark_price, adjusted_mark_price_round_down, adjusted_mark_price_min_tick, adjusted_mark_price_round_down_min_tick, marketability, prev_order_state, current_order_state, default_price_setting, marketability_request_id, order_check_data, strategy_code, tmp_round_experiment_no_round_price, tmp_round_experiment_mark_round_price, tmp_round_experiment_min_tick_round_price, tmp_round_experiment_mark_and_min_tick_round_price, account_type, previous_quantity, option_order_type, chain_type, related_order_data));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OptionOrderMeta toProto() {
        String bid_price = this.surrogate.getBid_price();
        String ask_price = this.surrogate.getAsk_price();
        String entered_price = this.surrogate.getEntered_price();
        OptionOrderMeta.Source source = (OptionOrderMeta.Source) this.surrogate.getSource().toProto();
        String chain_symbol = this.surrogate.getChain_symbol();
        String existing_order_id = this.surrogate.getExisting_order_id();
        Boolean r8 = (Boolean) this.surrogate.getHas_position().toProto();
        Boolean r9 = (Boolean) this.surrogate.is_watching().toProto();
        int num_legs = this.surrogate.getNum_legs();
        String adjusted_mark_price = this.surrogate.getAdjusted_mark_price();
        String adjusted_mark_price_round_down = this.surrogate.getAdjusted_mark_price_round_down();
        String adjusted_mark_price_min_tick = this.surrogate.getAdjusted_mark_price_min_tick();
        String adjusted_mark_price_round_down_min_tick = this.surrogate.getAdjusted_mark_price_round_down_min_tick();
        MarketabilityType marketabilityType = (MarketabilityType) this.surrogate.getMarketability().toProto();
        State state = (State) this.surrogate.getPrev_order_state().toProto();
        State state2 = (State) this.surrogate.getCurrent_order_state().toProto();
        DefaultPriceSetting defaultPriceSetting = (DefaultPriceSetting) this.surrogate.getDefault_price_setting().toProto();
        String marketability_request_id = this.surrogate.getMarketability_request_id();
        OptionOrderCheckDataDto order_check_data = this.surrogate.getOrder_check_data();
        OptionOrderCheckData proto = order_check_data != null ? order_check_data.toProto() : null;
        String strategy_code = this.surrogate.getStrategy_code();
        String tmp_round_experiment_no_round_price = this.surrogate.getTmp_round_experiment_no_round_price();
        String tmp_round_experiment_mark_round_price = this.surrogate.getTmp_round_experiment_mark_round_price();
        String tmp_round_experiment_min_tick_round_price = this.surrogate.getTmp_round_experiment_min_tick_round_price();
        String tmp_round_experiment_mark_and_min_tick_round_price = this.surrogate.getTmp_round_experiment_mark_and_min_tick_round_price();
        BrokerageAccountType brokerageAccountType = (BrokerageAccountType) this.surrogate.getAccount_type().toProto();
        String previous_quantity = this.surrogate.getPrevious_quantity();
        OptionsOrderType optionsOrderType = (OptionsOrderType) this.surrogate.getOption_order_type().toProto();
        String chain_type = this.surrogate.getChain_type();
        OptionRelatedOrderDataDto related_order_data = this.surrogate.getRelated_order_data();
        return new OptionOrderMeta(bid_price, ask_price, entered_price, source, chain_symbol, existing_order_id, r8, r9, num_legs, adjusted_mark_price, adjusted_mark_price_round_down, adjusted_mark_price_min_tick, adjusted_mark_price_round_down_min_tick, marketabilityType, state, state2, defaultPriceSetting, marketability_request_id, proto, strategy_code, tmp_round_experiment_no_round_price, tmp_round_experiment_mark_round_price, tmp_round_experiment_min_tick_round_price, tmp_round_experiment_mark_and_min_tick_round_price, brokerageAccountType, previous_quantity, optionsOrderType, chain_type, related_order_data != null ? related_order_data.toProto() : null, null, 536870912, null);
    }

    public String toString() {
        return "[OptionOrderMetaDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionOrderMetaDto) && Intrinsics.areEqual(((OptionOrderMetaDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\be\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ¤\u00012\u00020\u0001:\u0004£\u0001¤\u0001B¼\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010'\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.B»\u0002\b\u0010\u0012\u0006\u0010/\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010,\u0012\b\u00100\u001a\u0004\u0018\u000101¢\u0006\u0004\b-\u00102J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u0007HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u000bHÆ\u0003J\t\u0010\u007f\u001a\u00020\u000bHÆ\u0003J\u0019\u0010\u0080\u0001\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u001cHÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020&HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020)HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J¿\u0002\u0010\u0095\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0017\b\u0002\u0010\r\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,HÆ\u0001J\u0016\u0010\u0096\u0001\u001a\u00030\u0097\u00012\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u000eHÖ\u0001J\n\u0010\u009a\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010\u009b\u0001\u001a\u00030\u009c\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u00002\b\u0010\u009e\u0001\u001a\u00030\u009f\u00012\b\u0010 \u0001\u001a\u00030¡\u0001H\u0001¢\u0006\u0003\b¢\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u00104\u001a\u0004\b8\u00106R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u00104\u001a\u0004\b:\u00106R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u00104\u001a\u0004\b<\u0010=R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u00104\u001a\u0004\b?\u00106R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u00104\u001a\u0004\bA\u00106R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u00104\u001a\u0004\bC\u0010DR\u001c\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u00104\u001a\u0004\b\f\u0010DR+\u0010\r\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u00104\u001a\u0004\bG\u0010HR\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u00104\u001a\u0004\bJ\u00106R\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u00104\u001a\u0004\bL\u00106R\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u00104\u001a\u0004\bN\u00106R\u001c\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u00104\u001a\u0004\bP\u00106R\u001c\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u00104\u001a\u0004\bR\u0010SR\u001c\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u00104\u001a\u0004\bU\u0010VR\u001c\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u00104\u001a\u0004\bX\u0010VR\u001c\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u00104\u001a\u0004\bZ\u0010[R\u001c\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u00104\u001a\u0004\b]\u00106R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b^\u00104\u001a\u0004\b_\u0010`R\u001c\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\ba\u00104\u001a\u0004\bb\u00106R\u001c\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bc\u00104\u001a\u0004\bd\u00106R\u001c\u0010\"\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\be\u00104\u001a\u0004\bf\u00106R\u001c\u0010#\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bg\u00104\u001a\u0004\bh\u00106R\u001c\u0010$\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bi\u00104\u001a\u0004\bj\u00106R\u001c\u0010%\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bk\u00104\u001a\u0004\bl\u0010mR\u001c\u0010'\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bn\u00104\u001a\u0004\bo\u00106R\u001c\u0010(\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bp\u00104\u001a\u0004\bq\u0010rR\u001c\u0010*\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bs\u00104\u001a\u0004\bt\u00106R\u001e\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u00104\u001a\u0004\bv\u0010w¨\u0006¥\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$Surrogate;", "", BidAskDetails3.BID_PRICE, "", BidAskDetails3.ASK_PRICE, "entered_price", "source", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "chain_symbol", "existing_order_id", "has_position", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "is_watching", "num_legs", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/UInt32Serializer;", "adjusted_mark_price", "adjusted_mark_price_round_down", "adjusted_mark_price_min_tick", "adjusted_mark_price_round_down_min_tick", "marketability", "Lrosetta/option/MarketabilityTypeDto;", "prev_order_state", "Lrosetta/order/StateDto;", "current_order_state", "default_price_setting", "Lrosetta/order/DefaultPriceSettingDto;", "marketability_request_id", "order_check_data", "Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto;", "strategy_code", "tmp_round_experiment_no_round_price", "tmp_round_experiment_mark_round_price", "tmp_round_experiment_min_tick_round_price", "tmp_round_experiment_mark_and_min_tick_round_price", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountTypeDto;", "previous_quantity", "option_order_type", "Lcom/robinhood/rosetta/eventlogging/OptionsOrderTypeDto;", "chain_type", "related_order_data", "Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderDataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/option/MarketabilityTypeDto;Lrosetta/order/StateDto;Lrosetta/order/StateDto;Lrosetta/order/DefaultPriceSettingDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionsOrderTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderDataDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/option/MarketabilityTypeDto;Lrosetta/order/StateDto;Lrosetta/order/StateDto;Lrosetta/order/DefaultPriceSettingDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionsOrderTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBid_price$annotations", "()V", "getBid_price", "()Ljava/lang/String;", "getAsk_price$annotations", "getAsk_price", "getEntered_price$annotations", "getEntered_price", "getSource$annotations", "getSource", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "getChain_symbol$annotations", "getChain_symbol", "getExisting_order_id$annotations", "getExisting_order_id", "getHas_position$annotations", "getHas_position", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "is_watching$annotations", "getNum_legs$annotations", "getNum_legs", "()I", "getAdjusted_mark_price$annotations", "getAdjusted_mark_price", "getAdjusted_mark_price_round_down$annotations", "getAdjusted_mark_price_round_down", "getAdjusted_mark_price_min_tick$annotations", "getAdjusted_mark_price_min_tick", "getAdjusted_mark_price_round_down_min_tick$annotations", "getAdjusted_mark_price_round_down_min_tick", "getMarketability$annotations", "getMarketability", "()Lrosetta/option/MarketabilityTypeDto;", "getPrev_order_state$annotations", "getPrev_order_state", "()Lrosetta/order/StateDto;", "getCurrent_order_state$annotations", "getCurrent_order_state", "getDefault_price_setting$annotations", "getDefault_price_setting", "()Lrosetta/order/DefaultPriceSettingDto;", "getMarketability_request_id$annotations", "getMarketability_request_id", "getOrder_check_data$annotations", "getOrder_check_data", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto;", "getStrategy_code$annotations", "getStrategy_code", "getTmp_round_experiment_no_round_price$annotations", "getTmp_round_experiment_no_round_price", "getTmp_round_experiment_mark_round_price$annotations", "getTmp_round_experiment_mark_round_price", "getTmp_round_experiment_min_tick_round_price$annotations", "getTmp_round_experiment_min_tick_round_price", "getTmp_round_experiment_mark_and_min_tick_round_price$annotations", "getTmp_round_experiment_mark_and_min_tick_round_price", "getAccount_type$annotations", "getAccount_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getPrevious_quantity$annotations", "getPrevious_quantity", "getOption_order_type$annotations", "getOption_order_type", "()Lcom/robinhood/rosetta/eventlogging/OptionsOrderTypeDto;", "getChain_type$annotations", "getChain_type", "getRelated_order_data$annotations", "getRelated_order_data", "()Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderDataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BrokerageAccountTypeDto account_type;
        private final String adjusted_mark_price;
        private final String adjusted_mark_price_min_tick;
        private final String adjusted_mark_price_round_down;
        private final String adjusted_mark_price_round_down_min_tick;
        private final String ask_price;
        private final String bid_price;
        private final String chain_symbol;
        private final String chain_type;
        private final StateDto current_order_state;
        private final DefaultPriceSettingDto default_price_setting;
        private final String entered_price;
        private final String existing_order_id;
        private final BooleanDto has_position;
        private final BooleanDto is_watching;
        private final MarketabilityTypeDto marketability;
        private final String marketability_request_id;
        private final int num_legs;
        private final OptionsOrderTypeDto option_order_type;
        private final OptionOrderCheckDataDto order_check_data;
        private final StateDto prev_order_state;
        private final String previous_quantity;
        private final OptionRelatedOrderDataDto related_order_data;
        private final SourceDto source;
        private final String strategy_code;
        private final String tmp_round_experiment_mark_and_min_tick_round_price;
        private final String tmp_round_experiment_mark_round_price;
        private final String tmp_round_experiment_min_tick_round_price;
        private final String tmp_round_experiment_no_round_price;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (SourceDto) null, (String) null, (String) null, (BooleanDto) null, (BooleanDto) null, 0, (String) null, (String) null, (String) null, (String) null, (MarketabilityTypeDto) null, (StateDto) null, (StateDto) null, (DefaultPriceSettingDto) null, (String) null, (OptionOrderCheckDataDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BrokerageAccountTypeDto) null, (String) null, (OptionsOrderTypeDto) null, (String) null, (OptionRelatedOrderDataDto) null, 536870911, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, SourceDto sourceDto, String str4, String str5, BooleanDto booleanDto, BooleanDto booleanDto2, int i, String str6, String str7, String str8, String str9, MarketabilityTypeDto marketabilityTypeDto, StateDto stateDto, StateDto stateDto2, DefaultPriceSettingDto defaultPriceSettingDto, String str10, OptionOrderCheckDataDto optionOrderCheckDataDto, String str11, String str12, String str13, String str14, String str15, BrokerageAccountTypeDto brokerageAccountTypeDto, String str16, OptionsOrderTypeDto optionsOrderTypeDto, String str17, OptionRelatedOrderDataDto optionRelatedOrderDataDto, int i2, Object obj) {
            OptionRelatedOrderDataDto optionRelatedOrderDataDto2;
            String str18;
            String str19 = (i2 & 1) != 0 ? surrogate.bid_price : str;
            String str20 = (i2 & 2) != 0 ? surrogate.ask_price : str2;
            String str21 = (i2 & 4) != 0 ? surrogate.entered_price : str3;
            SourceDto sourceDto2 = (i2 & 8) != 0 ? surrogate.source : sourceDto;
            String str22 = (i2 & 16) != 0 ? surrogate.chain_symbol : str4;
            String str23 = (i2 & 32) != 0 ? surrogate.existing_order_id : str5;
            BooleanDto booleanDto3 = (i2 & 64) != 0 ? surrogate.has_position : booleanDto;
            BooleanDto booleanDto4 = (i2 & 128) != 0 ? surrogate.is_watching : booleanDto2;
            int i3 = (i2 & 256) != 0 ? surrogate.num_legs : i;
            String str24 = (i2 & 512) != 0 ? surrogate.adjusted_mark_price : str6;
            String str25 = (i2 & 1024) != 0 ? surrogate.adjusted_mark_price_round_down : str7;
            String str26 = (i2 & 2048) != 0 ? surrogate.adjusted_mark_price_min_tick : str8;
            String str27 = (i2 & 4096) != 0 ? surrogate.adjusted_mark_price_round_down_min_tick : str9;
            MarketabilityTypeDto marketabilityTypeDto2 = (i2 & 8192) != 0 ? surrogate.marketability : marketabilityTypeDto;
            String str28 = str19;
            StateDto stateDto3 = (i2 & 16384) != 0 ? surrogate.prev_order_state : stateDto;
            StateDto stateDto4 = (i2 & 32768) != 0 ? surrogate.current_order_state : stateDto2;
            DefaultPriceSettingDto defaultPriceSettingDto2 = (i2 & 65536) != 0 ? surrogate.default_price_setting : defaultPriceSettingDto;
            String str29 = (i2 & 131072) != 0 ? surrogate.marketability_request_id : str10;
            OptionOrderCheckDataDto optionOrderCheckDataDto2 = (i2 & 262144) != 0 ? surrogate.order_check_data : optionOrderCheckDataDto;
            String str30 = (i2 & 524288) != 0 ? surrogate.strategy_code : str11;
            String str31 = (i2 & 1048576) != 0 ? surrogate.tmp_round_experiment_no_round_price : str12;
            String str32 = (i2 & 2097152) != 0 ? surrogate.tmp_round_experiment_mark_round_price : str13;
            String str33 = (i2 & 4194304) != 0 ? surrogate.tmp_round_experiment_min_tick_round_price : str14;
            String str34 = (i2 & 8388608) != 0 ? surrogate.tmp_round_experiment_mark_and_min_tick_round_price : str15;
            BrokerageAccountTypeDto brokerageAccountTypeDto2 = (i2 & 16777216) != 0 ? surrogate.account_type : brokerageAccountTypeDto;
            String str35 = (i2 & 33554432) != 0 ? surrogate.previous_quantity : str16;
            OptionsOrderTypeDto optionsOrderTypeDto2 = (i2 & 67108864) != 0 ? surrogate.option_order_type : optionsOrderTypeDto;
            String str36 = (i2 & 134217728) != 0 ? surrogate.chain_type : str17;
            if ((i2 & 268435456) != 0) {
                str18 = str36;
                optionRelatedOrderDataDto2 = surrogate.related_order_data;
            } else {
                optionRelatedOrderDataDto2 = optionRelatedOrderDataDto;
                str18 = str36;
            }
            return surrogate.copy(str28, str20, str21, sourceDto2, str22, str23, booleanDto3, booleanDto4, i3, str24, str25, str26, str27, marketabilityTypeDto2, stateDto3, stateDto4, defaultPriceSettingDto2, str29, optionOrderCheckDataDto2, str30, str31, str32, str33, str34, brokerageAccountTypeDto2, str35, optionsOrderTypeDto2, str18, optionRelatedOrderDataDto2);
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("adjustedMarkPrice")
        @JsonAnnotations2(names = {"adjusted_mark_price"})
        public static /* synthetic */ void getAdjusted_mark_price$annotations() {
        }

        @SerialName("adjustedMarkPriceMinTick")
        @JsonAnnotations2(names = {"adjusted_mark_price_min_tick"})
        public static /* synthetic */ void getAdjusted_mark_price_min_tick$annotations() {
        }

        @SerialName("adjustedMarkPriceRoundDown")
        @JsonAnnotations2(names = {"adjusted_mark_price_round_down"})
        public static /* synthetic */ void getAdjusted_mark_price_round_down$annotations() {
        }

        @SerialName("adjustedMarkPriceRoundDownMinTick")
        @JsonAnnotations2(names = {"adjusted_mark_price_round_down_min_tick"})
        public static /* synthetic */ void getAdjusted_mark_price_round_down_min_tick$annotations() {
        }

        @SerialName("askPrice")
        @JsonAnnotations2(names = {BidAskDetails3.ASK_PRICE})
        public static /* synthetic */ void getAsk_price$annotations() {
        }

        @SerialName("bidPrice")
        @JsonAnnotations2(names = {BidAskDetails3.BID_PRICE})
        public static /* synthetic */ void getBid_price$annotations() {
        }

        @SerialName("chainSymbol")
        @JsonAnnotations2(names = {"chain_symbol"})
        public static /* synthetic */ void getChain_symbol$annotations() {
        }

        @SerialName("chainType")
        @JsonAnnotations2(names = {"chain_type"})
        public static /* synthetic */ void getChain_type$annotations() {
        }

        @SerialName("currentOrderState")
        @JsonAnnotations2(names = {"current_order_state"})
        public static /* synthetic */ void getCurrent_order_state$annotations() {
        }

        @SerialName("defaultPriceSetting")
        @JsonAnnotations2(names = {"default_price_setting"})
        public static /* synthetic */ void getDefault_price_setting$annotations() {
        }

        @SerialName("enteredPrice")
        @JsonAnnotations2(names = {"entered_price"})
        public static /* synthetic */ void getEntered_price$annotations() {
        }

        @SerialName("existingOrderId")
        @JsonAnnotations2(names = {"existing_order_id"})
        public static /* synthetic */ void getExisting_order_id$annotations() {
        }

        @SerialName("hasPosition")
        @JsonAnnotations2(names = {"has_position"})
        public static /* synthetic */ void getHas_position$annotations() {
        }

        @SerialName("marketability")
        @JsonAnnotations2(names = {"marketability"})
        public static /* synthetic */ void getMarketability$annotations() {
        }

        @SerialName("marketabilityRequestId")
        @JsonAnnotations2(names = {"marketability_request_id"})
        public static /* synthetic */ void getMarketability_request_id$annotations() {
        }

        @SerialName("numLegs")
        @JsonAnnotations2(names = {"num_legs"})
        public static /* synthetic */ void getNum_legs$annotations() {
        }

        @SerialName("optionOrderType")
        @JsonAnnotations2(names = {"option_order_type"})
        public static /* synthetic */ void getOption_order_type$annotations() {
        }

        @SerialName("orderCheckData")
        @JsonAnnotations2(names = {"order_check_data"})
        public static /* synthetic */ void getOrder_check_data$annotations() {
        }

        @SerialName("prevOrderState")
        @JsonAnnotations2(names = {"prev_order_state"})
        public static /* synthetic */ void getPrev_order_state$annotations() {
        }

        @SerialName("previousQuantity")
        @JsonAnnotations2(names = {"previous_quantity"})
        public static /* synthetic */ void getPrevious_quantity$annotations() {
        }

        @SerialName("relatedOrderData")
        @JsonAnnotations2(names = {"related_order_data"})
        public static /* synthetic */ void getRelated_order_data$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("strategyCode")
        @JsonAnnotations2(names = {"strategy_code"})
        public static /* synthetic */ void getStrategy_code$annotations() {
        }

        @SerialName("tmpRoundExperimentMarkAndMinTickRoundPrice")
        @JsonAnnotations2(names = {"tmp_round_experiment_mark_and_min_tick_round_price"})
        /* renamed from: getTmp_round_experiment_mark_and_min_tick_round_price$annotations */
        public static /* synthetic */ void m2747x3997870a() {
        }

        @SerialName("tmpRoundExperimentMarkRoundPrice")
        @JsonAnnotations2(names = {"tmp_round_experiment_mark_round_price"})
        public static /* synthetic */ void getTmp_round_experiment_mark_round_price$annotations() {
        }

        @SerialName("tmpRoundExperimentMinTickRoundPrice")
        @JsonAnnotations2(names = {"tmp_round_experiment_min_tick_round_price"})
        public static /* synthetic */ void getTmp_round_experiment_min_tick_round_price$annotations() {
        }

        @SerialName("tmpRoundExperimentNoRoundPrice")
        @JsonAnnotations2(names = {"tmp_round_experiment_no_round_price"})
        public static /* synthetic */ void getTmp_round_experiment_no_round_price$annotations() {
        }

        @SerialName("isWatching")
        @JsonAnnotations2(names = {"is_watching"})
        public static /* synthetic */ void is_watching$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getBid_price() {
            return this.bid_price;
        }

        /* renamed from: component10, reason: from getter */
        public final String getAdjusted_mark_price() {
            return this.adjusted_mark_price;
        }

        /* renamed from: component11, reason: from getter */
        public final String getAdjusted_mark_price_round_down() {
            return this.adjusted_mark_price_round_down;
        }

        /* renamed from: component12, reason: from getter */
        public final String getAdjusted_mark_price_min_tick() {
            return this.adjusted_mark_price_min_tick;
        }

        /* renamed from: component13, reason: from getter */
        public final String getAdjusted_mark_price_round_down_min_tick() {
            return this.adjusted_mark_price_round_down_min_tick;
        }

        /* renamed from: component14, reason: from getter */
        public final MarketabilityTypeDto getMarketability() {
            return this.marketability;
        }

        /* renamed from: component15, reason: from getter */
        public final StateDto getPrev_order_state() {
            return this.prev_order_state;
        }

        /* renamed from: component16, reason: from getter */
        public final StateDto getCurrent_order_state() {
            return this.current_order_state;
        }

        /* renamed from: component17, reason: from getter */
        public final DefaultPriceSettingDto getDefault_price_setting() {
            return this.default_price_setting;
        }

        /* renamed from: component18, reason: from getter */
        public final String getMarketability_request_id() {
            return this.marketability_request_id;
        }

        /* renamed from: component19, reason: from getter */
        public final OptionOrderCheckDataDto getOrder_check_data() {
            return this.order_check_data;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAsk_price() {
            return this.ask_price;
        }

        /* renamed from: component20, reason: from getter */
        public final String getStrategy_code() {
            return this.strategy_code;
        }

        /* renamed from: component21, reason: from getter */
        public final String getTmp_round_experiment_no_round_price() {
            return this.tmp_round_experiment_no_round_price;
        }

        /* renamed from: component22, reason: from getter */
        public final String getTmp_round_experiment_mark_round_price() {
            return this.tmp_round_experiment_mark_round_price;
        }

        /* renamed from: component23, reason: from getter */
        public final String getTmp_round_experiment_min_tick_round_price() {
            return this.tmp_round_experiment_min_tick_round_price;
        }

        /* renamed from: component24, reason: from getter */
        public final String getTmp_round_experiment_mark_and_min_tick_round_price() {
            return this.tmp_round_experiment_mark_and_min_tick_round_price;
        }

        /* renamed from: component25, reason: from getter */
        public final BrokerageAccountTypeDto getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component26, reason: from getter */
        public final String getPrevious_quantity() {
            return this.previous_quantity;
        }

        /* renamed from: component27, reason: from getter */
        public final OptionsOrderTypeDto getOption_order_type() {
            return this.option_order_type;
        }

        /* renamed from: component28, reason: from getter */
        public final String getChain_type() {
            return this.chain_type;
        }

        /* renamed from: component29, reason: from getter */
        public final OptionRelatedOrderDataDto getRelated_order_data() {
            return this.related_order_data;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEntered_price() {
            return this.entered_price;
        }

        /* renamed from: component4, reason: from getter */
        public final SourceDto getSource() {
            return this.source;
        }

        /* renamed from: component5, reason: from getter */
        public final String getChain_symbol() {
            return this.chain_symbol;
        }

        /* renamed from: component6, reason: from getter */
        public final String getExisting_order_id() {
            return this.existing_order_id;
        }

        /* renamed from: component7, reason: from getter */
        public final BooleanDto getHas_position() {
            return this.has_position;
        }

        /* renamed from: component8, reason: from getter */
        public final BooleanDto getIs_watching() {
            return this.is_watching;
        }

        /* renamed from: component9, reason: from getter */
        public final int getNum_legs() {
            return this.num_legs;
        }

        public final Surrogate copy(String bid_price, String ask_price, String entered_price, SourceDto source, String chain_symbol, String existing_order_id, BooleanDto has_position, BooleanDto is_watching, int num_legs, String adjusted_mark_price, String adjusted_mark_price_round_down, String adjusted_mark_price_min_tick, String adjusted_mark_price_round_down_min_tick, MarketabilityTypeDto marketability, StateDto prev_order_state, StateDto current_order_state, DefaultPriceSettingDto default_price_setting, String marketability_request_id, OptionOrderCheckDataDto order_check_data, String strategy_code, String tmp_round_experiment_no_round_price, String tmp_round_experiment_mark_round_price, String tmp_round_experiment_min_tick_round_price, String tmp_round_experiment_mark_and_min_tick_round_price, BrokerageAccountTypeDto account_type, String previous_quantity, OptionsOrderTypeDto option_order_type, String chain_type, OptionRelatedOrderDataDto related_order_data) {
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(entered_price, "entered_price");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
            Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
            Intrinsics.checkNotNullParameter(has_position, "has_position");
            Intrinsics.checkNotNullParameter(is_watching, "is_watching");
            Intrinsics.checkNotNullParameter(adjusted_mark_price, "adjusted_mark_price");
            Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down, "adjusted_mark_price_round_down");
            Intrinsics.checkNotNullParameter(adjusted_mark_price_min_tick, "adjusted_mark_price_min_tick");
            Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down_min_tick, "adjusted_mark_price_round_down_min_tick");
            Intrinsics.checkNotNullParameter(marketability, "marketability");
            Intrinsics.checkNotNullParameter(prev_order_state, "prev_order_state");
            Intrinsics.checkNotNullParameter(current_order_state, "current_order_state");
            Intrinsics.checkNotNullParameter(default_price_setting, "default_price_setting");
            Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
            Intrinsics.checkNotNullParameter(strategy_code, "strategy_code");
            Intrinsics.checkNotNullParameter(tmp_round_experiment_no_round_price, "tmp_round_experiment_no_round_price");
            Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_round_price, "tmp_round_experiment_mark_round_price");
            Intrinsics.checkNotNullParameter(tmp_round_experiment_min_tick_round_price, "tmp_round_experiment_min_tick_round_price");
            Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_and_min_tick_round_price, "tmp_round_experiment_mark_and_min_tick_round_price");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(previous_quantity, "previous_quantity");
            Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
            Intrinsics.checkNotNullParameter(chain_type, "chain_type");
            return new Surrogate(bid_price, ask_price, entered_price, source, chain_symbol, existing_order_id, has_position, is_watching, num_legs, adjusted_mark_price, adjusted_mark_price_round_down, adjusted_mark_price_min_tick, adjusted_mark_price_round_down_min_tick, marketability, prev_order_state, current_order_state, default_price_setting, marketability_request_id, order_check_data, strategy_code, tmp_round_experiment_no_round_price, tmp_round_experiment_mark_round_price, tmp_round_experiment_min_tick_round_price, tmp_round_experiment_mark_and_min_tick_round_price, account_type, previous_quantity, option_order_type, chain_type, related_order_data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.bid_price, surrogate.bid_price) && Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.entered_price, surrogate.entered_price) && this.source == surrogate.source && Intrinsics.areEqual(this.chain_symbol, surrogate.chain_symbol) && Intrinsics.areEqual(this.existing_order_id, surrogate.existing_order_id) && this.has_position == surrogate.has_position && this.is_watching == surrogate.is_watching && this.num_legs == surrogate.num_legs && Intrinsics.areEqual(this.adjusted_mark_price, surrogate.adjusted_mark_price) && Intrinsics.areEqual(this.adjusted_mark_price_round_down, surrogate.adjusted_mark_price_round_down) && Intrinsics.areEqual(this.adjusted_mark_price_min_tick, surrogate.adjusted_mark_price_min_tick) && Intrinsics.areEqual(this.adjusted_mark_price_round_down_min_tick, surrogate.adjusted_mark_price_round_down_min_tick) && this.marketability == surrogate.marketability && this.prev_order_state == surrogate.prev_order_state && this.current_order_state == surrogate.current_order_state && this.default_price_setting == surrogate.default_price_setting && Intrinsics.areEqual(this.marketability_request_id, surrogate.marketability_request_id) && Intrinsics.areEqual(this.order_check_data, surrogate.order_check_data) && Intrinsics.areEqual(this.strategy_code, surrogate.strategy_code) && Intrinsics.areEqual(this.tmp_round_experiment_no_round_price, surrogate.tmp_round_experiment_no_round_price) && Intrinsics.areEqual(this.tmp_round_experiment_mark_round_price, surrogate.tmp_round_experiment_mark_round_price) && Intrinsics.areEqual(this.tmp_round_experiment_min_tick_round_price, surrogate.tmp_round_experiment_min_tick_round_price) && Intrinsics.areEqual(this.tmp_round_experiment_mark_and_min_tick_round_price, surrogate.tmp_round_experiment_mark_and_min_tick_round_price) && this.account_type == surrogate.account_type && Intrinsics.areEqual(this.previous_quantity, surrogate.previous_quantity) && this.option_order_type == surrogate.option_order_type && Intrinsics.areEqual(this.chain_type, surrogate.chain_type) && Intrinsics.areEqual(this.related_order_data, surrogate.related_order_data);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((((((((((((((this.bid_price.hashCode() * 31) + this.ask_price.hashCode()) * 31) + this.entered_price.hashCode()) * 31) + this.source.hashCode()) * 31) + this.chain_symbol.hashCode()) * 31) + this.existing_order_id.hashCode()) * 31) + this.has_position.hashCode()) * 31) + this.is_watching.hashCode()) * 31) + Integer.hashCode(this.num_legs)) * 31) + this.adjusted_mark_price.hashCode()) * 31) + this.adjusted_mark_price_round_down.hashCode()) * 31) + this.adjusted_mark_price_min_tick.hashCode()) * 31) + this.adjusted_mark_price_round_down_min_tick.hashCode()) * 31) + this.marketability.hashCode()) * 31) + this.prev_order_state.hashCode()) * 31) + this.current_order_state.hashCode()) * 31) + this.default_price_setting.hashCode()) * 31) + this.marketability_request_id.hashCode()) * 31;
            OptionOrderCheckDataDto optionOrderCheckDataDto = this.order_check_data;
            int iHashCode2 = (((((((((((((((((((iHashCode + (optionOrderCheckDataDto == null ? 0 : optionOrderCheckDataDto.hashCode())) * 31) + this.strategy_code.hashCode()) * 31) + this.tmp_round_experiment_no_round_price.hashCode()) * 31) + this.tmp_round_experiment_mark_round_price.hashCode()) * 31) + this.tmp_round_experiment_min_tick_round_price.hashCode()) * 31) + this.tmp_round_experiment_mark_and_min_tick_round_price.hashCode()) * 31) + this.account_type.hashCode()) * 31) + this.previous_quantity.hashCode()) * 31) + this.option_order_type.hashCode()) * 31) + this.chain_type.hashCode()) * 31;
            OptionRelatedOrderDataDto optionRelatedOrderDataDto = this.related_order_data;
            return iHashCode2 + (optionRelatedOrderDataDto != null ? optionRelatedOrderDataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(bid_price=" + this.bid_price + ", ask_price=" + this.ask_price + ", entered_price=" + this.entered_price + ", source=" + this.source + ", chain_symbol=" + this.chain_symbol + ", existing_order_id=" + this.existing_order_id + ", has_position=" + this.has_position + ", is_watching=" + this.is_watching + ", num_legs=" + this.num_legs + ", adjusted_mark_price=" + this.adjusted_mark_price + ", adjusted_mark_price_round_down=" + this.adjusted_mark_price_round_down + ", adjusted_mark_price_min_tick=" + this.adjusted_mark_price_min_tick + ", adjusted_mark_price_round_down_min_tick=" + this.adjusted_mark_price_round_down_min_tick + ", marketability=" + this.marketability + ", prev_order_state=" + this.prev_order_state + ", current_order_state=" + this.current_order_state + ", default_price_setting=" + this.default_price_setting + ", marketability_request_id=" + this.marketability_request_id + ", order_check_data=" + this.order_check_data + ", strategy_code=" + this.strategy_code + ", tmp_round_experiment_no_round_price=" + this.tmp_round_experiment_no_round_price + ", tmp_round_experiment_mark_round_price=" + this.tmp_round_experiment_mark_round_price + ", tmp_round_experiment_min_tick_round_price=" + this.tmp_round_experiment_min_tick_round_price + ", tmp_round_experiment_mark_and_min_tick_round_price=" + this.tmp_round_experiment_mark_and_min_tick_round_price + ", account_type=" + this.account_type + ", previous_quantity=" + this.previous_quantity + ", option_order_type=" + this.option_order_type + ", chain_type=" + this.chain_type + ", related_order_data=" + this.related_order_data + ")";
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionOrderMetaDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, SourceDto sourceDto, String str4, String str5, BooleanDto booleanDto, BooleanDto booleanDto2, int i2, String str6, String str7, String str8, String str9, MarketabilityTypeDto marketabilityTypeDto, StateDto stateDto, StateDto stateDto2, DefaultPriceSettingDto defaultPriceSettingDto, String str10, OptionOrderCheckDataDto optionOrderCheckDataDto, String str11, String str12, String str13, String str14, String str15, BrokerageAccountTypeDto brokerageAccountTypeDto, String str16, OptionsOrderTypeDto optionsOrderTypeDto, String str17, OptionRelatedOrderDataDto optionRelatedOrderDataDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.bid_price = "";
            } else {
                this.bid_price = str;
            }
            if ((i & 2) == 0) {
                this.ask_price = "";
            } else {
                this.ask_price = str2;
            }
            if ((i & 4) == 0) {
                this.entered_price = "";
            } else {
                this.entered_price = str3;
            }
            if ((i & 8) == 0) {
                this.source = SourceDto.INSTANCE.getZeroValue();
            } else {
                this.source = sourceDto;
            }
            if ((i & 16) == 0) {
                this.chain_symbol = "";
            } else {
                this.chain_symbol = str4;
            }
            if ((i & 32) == 0) {
                this.existing_order_id = "";
            } else {
                this.existing_order_id = str5;
            }
            if ((i & 64) == 0) {
                this.has_position = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.has_position = booleanDto;
            }
            if ((i & 128) == 0) {
                this.is_watching = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.is_watching = booleanDto2;
            }
            if ((i & 256) == 0) {
                this.num_legs = 0;
            } else {
                this.num_legs = i2;
            }
            if ((i & 512) == 0) {
                this.adjusted_mark_price = "";
            } else {
                this.adjusted_mark_price = str6;
            }
            if ((i & 1024) == 0) {
                this.adjusted_mark_price_round_down = "";
            } else {
                this.adjusted_mark_price_round_down = str7;
            }
            if ((i & 2048) == 0) {
                this.adjusted_mark_price_min_tick = "";
            } else {
                this.adjusted_mark_price_min_tick = str8;
            }
            if ((i & 4096) == 0) {
                this.adjusted_mark_price_round_down_min_tick = "";
            } else {
                this.adjusted_mark_price_round_down_min_tick = str9;
            }
            this.marketability = (i & 8192) == 0 ? MarketabilityTypeDto.INSTANCE.getZeroValue() : marketabilityTypeDto;
            this.prev_order_state = (i & 16384) == 0 ? StateDto.INSTANCE.getZeroValue() : stateDto;
            this.current_order_state = (32768 & i) == 0 ? StateDto.INSTANCE.getZeroValue() : stateDto2;
            this.default_price_setting = (65536 & i) == 0 ? DefaultPriceSettingDto.INSTANCE.getZeroValue() : defaultPriceSettingDto;
            if ((131072 & i) == 0) {
                this.marketability_request_id = "";
            } else {
                this.marketability_request_id = str10;
            }
            if ((262144 & i) == 0) {
                this.order_check_data = null;
            } else {
                this.order_check_data = optionOrderCheckDataDto;
            }
            if ((524288 & i) == 0) {
                this.strategy_code = "";
            } else {
                this.strategy_code = str11;
            }
            if ((1048576 & i) == 0) {
                this.tmp_round_experiment_no_round_price = "";
            } else {
                this.tmp_round_experiment_no_round_price = str12;
            }
            if ((2097152 & i) == 0) {
                this.tmp_round_experiment_mark_round_price = "";
            } else {
                this.tmp_round_experiment_mark_round_price = str13;
            }
            if ((4194304 & i) == 0) {
                this.tmp_round_experiment_min_tick_round_price = "";
            } else {
                this.tmp_round_experiment_min_tick_round_price = str14;
            }
            if ((8388608 & i) == 0) {
                this.tmp_round_experiment_mark_and_min_tick_round_price = "";
            } else {
                this.tmp_round_experiment_mark_and_min_tick_round_price = str15;
            }
            this.account_type = (16777216 & i) == 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto;
            if ((33554432 & i) == 0) {
                this.previous_quantity = "";
            } else {
                this.previous_quantity = str16;
            }
            this.option_order_type = (67108864 & i) == 0 ? OptionsOrderTypeDto.INSTANCE.getZeroValue() : optionsOrderTypeDto;
            if ((134217728 & i) == 0) {
                this.chain_type = "";
            } else {
                this.chain_type = str17;
            }
            if ((i & 268435456) == 0) {
                this.related_order_data = null;
            } else {
                this.related_order_data = optionRelatedOrderDataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.bid_price, "")) {
                output.encodeStringElement(serialDesc, 0, self.bid_price);
            }
            if (!Intrinsics.areEqual(self.ask_price, "")) {
                output.encodeStringElement(serialDesc, 1, self.ask_price);
            }
            if (!Intrinsics.areEqual(self.entered_price, "")) {
                output.encodeStringElement(serialDesc, 2, self.entered_price);
            }
            if (self.source != SourceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, SourceDto.Serializer.INSTANCE, self.source);
            }
            if (!Intrinsics.areEqual(self.chain_symbol, "")) {
                output.encodeStringElement(serialDesc, 4, self.chain_symbol);
            }
            if (!Intrinsics.areEqual(self.existing_order_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.existing_order_id);
            }
            BooleanDto booleanDto = self.has_position;
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            if (booleanDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, BooleanDto.Serializer.INSTANCE, self.has_position);
            }
            if (self.is_watching != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, BooleanDto.Serializer.INSTANCE, self.is_watching);
            }
            int i = self.num_legs;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 8, UnsignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.adjusted_mark_price, "")) {
                output.encodeStringElement(serialDesc, 9, self.adjusted_mark_price);
            }
            if (!Intrinsics.areEqual(self.adjusted_mark_price_round_down, "")) {
                output.encodeStringElement(serialDesc, 10, self.adjusted_mark_price_round_down);
            }
            if (!Intrinsics.areEqual(self.adjusted_mark_price_min_tick, "")) {
                output.encodeStringElement(serialDesc, 11, self.adjusted_mark_price_min_tick);
            }
            if (!Intrinsics.areEqual(self.adjusted_mark_price_round_down_min_tick, "")) {
                output.encodeStringElement(serialDesc, 12, self.adjusted_mark_price_round_down_min_tick);
            }
            if (self.marketability != MarketabilityTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 13, MarketabilityTypeDto.Serializer.INSTANCE, self.marketability);
            }
            StateDto stateDto = self.prev_order_state;
            StateDto.Companion companion2 = StateDto.INSTANCE;
            if (stateDto != companion2.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 14, StateDto.Serializer.INSTANCE, self.prev_order_state);
            }
            if (self.current_order_state != companion2.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 15, StateDto.Serializer.INSTANCE, self.current_order_state);
            }
            if (self.default_price_setting != DefaultPriceSettingDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 16, DefaultPriceSettingDto.Serializer.INSTANCE, self.default_price_setting);
            }
            if (!Intrinsics.areEqual(self.marketability_request_id, "")) {
                output.encodeStringElement(serialDesc, 17, self.marketability_request_id);
            }
            OptionOrderCheckDataDto optionOrderCheckDataDto = self.order_check_data;
            if (optionOrderCheckDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, OptionOrderCheckDataDto.Serializer.INSTANCE, optionOrderCheckDataDto);
            }
            if (!Intrinsics.areEqual(self.strategy_code, "")) {
                output.encodeStringElement(serialDesc, 19, self.strategy_code);
            }
            if (!Intrinsics.areEqual(self.tmp_round_experiment_no_round_price, "")) {
                output.encodeStringElement(serialDesc, 20, self.tmp_round_experiment_no_round_price);
            }
            if (!Intrinsics.areEqual(self.tmp_round_experiment_mark_round_price, "")) {
                output.encodeStringElement(serialDesc, 21, self.tmp_round_experiment_mark_round_price);
            }
            if (!Intrinsics.areEqual(self.tmp_round_experiment_min_tick_round_price, "")) {
                output.encodeStringElement(serialDesc, 22, self.tmp_round_experiment_min_tick_round_price);
            }
            if (!Intrinsics.areEqual(self.tmp_round_experiment_mark_and_min_tick_round_price, "")) {
                output.encodeStringElement(serialDesc, 23, self.tmp_round_experiment_mark_and_min_tick_round_price);
            }
            if (self.account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 24, BrokerageAccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
            if (!Intrinsics.areEqual(self.previous_quantity, "")) {
                output.encodeStringElement(serialDesc, 25, self.previous_quantity);
            }
            if (self.option_order_type != OptionsOrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 26, OptionsOrderTypeDto.Serializer.INSTANCE, self.option_order_type);
            }
            if (!Intrinsics.areEqual(self.chain_type, "")) {
                output.encodeStringElement(serialDesc, 27, self.chain_type);
            }
            OptionRelatedOrderDataDto optionRelatedOrderDataDto = self.related_order_data;
            if (optionRelatedOrderDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, OptionRelatedOrderDataDto.Serializer.INSTANCE, optionRelatedOrderDataDto);
            }
        }

        public Surrogate(String bid_price, String ask_price, String entered_price, SourceDto source, String chain_symbol, String existing_order_id, BooleanDto has_position, BooleanDto is_watching, int i, String adjusted_mark_price, String adjusted_mark_price_round_down, String adjusted_mark_price_min_tick, String adjusted_mark_price_round_down_min_tick, MarketabilityTypeDto marketability, StateDto prev_order_state, StateDto current_order_state, DefaultPriceSettingDto default_price_setting, String marketability_request_id, OptionOrderCheckDataDto optionOrderCheckDataDto, String strategy_code, String tmp_round_experiment_no_round_price, String tmp_round_experiment_mark_round_price, String tmp_round_experiment_min_tick_round_price, String tmp_round_experiment_mark_and_min_tick_round_price, BrokerageAccountTypeDto account_type, String previous_quantity, OptionsOrderTypeDto option_order_type, String chain_type, OptionRelatedOrderDataDto optionRelatedOrderDataDto) {
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(entered_price, "entered_price");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
            Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
            Intrinsics.checkNotNullParameter(has_position, "has_position");
            Intrinsics.checkNotNullParameter(is_watching, "is_watching");
            Intrinsics.checkNotNullParameter(adjusted_mark_price, "adjusted_mark_price");
            Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down, "adjusted_mark_price_round_down");
            Intrinsics.checkNotNullParameter(adjusted_mark_price_min_tick, "adjusted_mark_price_min_tick");
            Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down_min_tick, "adjusted_mark_price_round_down_min_tick");
            Intrinsics.checkNotNullParameter(marketability, "marketability");
            Intrinsics.checkNotNullParameter(prev_order_state, "prev_order_state");
            Intrinsics.checkNotNullParameter(current_order_state, "current_order_state");
            Intrinsics.checkNotNullParameter(default_price_setting, "default_price_setting");
            Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
            Intrinsics.checkNotNullParameter(strategy_code, "strategy_code");
            Intrinsics.checkNotNullParameter(tmp_round_experiment_no_round_price, "tmp_round_experiment_no_round_price");
            Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_round_price, "tmp_round_experiment_mark_round_price");
            Intrinsics.checkNotNullParameter(tmp_round_experiment_min_tick_round_price, "tmp_round_experiment_min_tick_round_price");
            Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_and_min_tick_round_price, "tmp_round_experiment_mark_and_min_tick_round_price");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(previous_quantity, "previous_quantity");
            Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
            Intrinsics.checkNotNullParameter(chain_type, "chain_type");
            this.bid_price = bid_price;
            this.ask_price = ask_price;
            this.entered_price = entered_price;
            this.source = source;
            this.chain_symbol = chain_symbol;
            this.existing_order_id = existing_order_id;
            this.has_position = has_position;
            this.is_watching = is_watching;
            this.num_legs = i;
            this.adjusted_mark_price = adjusted_mark_price;
            this.adjusted_mark_price_round_down = adjusted_mark_price_round_down;
            this.adjusted_mark_price_min_tick = adjusted_mark_price_min_tick;
            this.adjusted_mark_price_round_down_min_tick = adjusted_mark_price_round_down_min_tick;
            this.marketability = marketability;
            this.prev_order_state = prev_order_state;
            this.current_order_state = current_order_state;
            this.default_price_setting = default_price_setting;
            this.marketability_request_id = marketability_request_id;
            this.order_check_data = optionOrderCheckDataDto;
            this.strategy_code = strategy_code;
            this.tmp_round_experiment_no_round_price = tmp_round_experiment_no_round_price;
            this.tmp_round_experiment_mark_round_price = tmp_round_experiment_mark_round_price;
            this.tmp_round_experiment_min_tick_round_price = tmp_round_experiment_min_tick_round_price;
            this.tmp_round_experiment_mark_and_min_tick_round_price = tmp_round_experiment_mark_and_min_tick_round_price;
            this.account_type = account_type;
            this.previous_quantity = previous_quantity;
            this.option_order_type = option_order_type;
            this.chain_type = chain_type;
            this.related_order_data = optionRelatedOrderDataDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, SourceDto sourceDto, String str4, String str5, BooleanDto booleanDto, BooleanDto booleanDto2, int i, String str6, String str7, String str8, String str9, MarketabilityTypeDto marketabilityTypeDto, StateDto stateDto, StateDto stateDto2, DefaultPriceSettingDto defaultPriceSettingDto, String str10, OptionOrderCheckDataDto optionOrderCheckDataDto, String str11, String str12, String str13, String str14, String str15, BrokerageAccountTypeDto brokerageAccountTypeDto, String str16, OptionsOrderTypeDto optionsOrderTypeDto, String str17, OptionRelatedOrderDataDto optionRelatedOrderDataDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i2 & 128) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? "" : str7, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) != 0 ? "" : str9, (i2 & 8192) != 0 ? MarketabilityTypeDto.INSTANCE.getZeroValue() : marketabilityTypeDto, (i2 & 16384) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i2 & 32768) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto2, (i2 & 65536) != 0 ? DefaultPriceSettingDto.INSTANCE.getZeroValue() : defaultPriceSettingDto, (i2 & 131072) != 0 ? "" : str10, (i2 & 262144) != 0 ? null : optionOrderCheckDataDto, (i2 & 524288) != 0 ? "" : str11, (i2 & 1048576) != 0 ? "" : str12, (i2 & 2097152) != 0 ? "" : str13, (i2 & 4194304) != 0 ? "" : str14, (i2 & 8388608) != 0 ? "" : str15, (i2 & 16777216) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i2 & 33554432) != 0 ? "" : str16, (i2 & 67108864) != 0 ? OptionsOrderTypeDto.INSTANCE.getZeroValue() : optionsOrderTypeDto, (i2 & 134217728) == 0 ? str17 : "", (i2 & 268435456) != 0 ? null : optionRelatedOrderDataDto);
        }

        public final String getBid_price() {
            return this.bid_price;
        }

        public final String getAsk_price() {
            return this.ask_price;
        }

        public final String getEntered_price() {
            return this.entered_price;
        }

        public final SourceDto getSource() {
            return this.source;
        }

        public final String getChain_symbol() {
            return this.chain_symbol;
        }

        public final String getExisting_order_id() {
            return this.existing_order_id;
        }

        public final BooleanDto getHas_position() {
            return this.has_position;
        }

        public final BooleanDto is_watching() {
            return this.is_watching;
        }

        public final int getNum_legs() {
            return this.num_legs;
        }

        public final String getAdjusted_mark_price() {
            return this.adjusted_mark_price;
        }

        public final String getAdjusted_mark_price_round_down() {
            return this.adjusted_mark_price_round_down;
        }

        public final String getAdjusted_mark_price_min_tick() {
            return this.adjusted_mark_price_min_tick;
        }

        public final String getAdjusted_mark_price_round_down_min_tick() {
            return this.adjusted_mark_price_round_down_min_tick;
        }

        public final MarketabilityTypeDto getMarketability() {
            return this.marketability;
        }

        public final StateDto getPrev_order_state() {
            return this.prev_order_state;
        }

        public final StateDto getCurrent_order_state() {
            return this.current_order_state;
        }

        public final DefaultPriceSettingDto getDefault_price_setting() {
            return this.default_price_setting;
        }

        public final String getMarketability_request_id() {
            return this.marketability_request_id;
        }

        public final OptionOrderCheckDataDto getOrder_check_data() {
            return this.order_check_data;
        }

        public final String getStrategy_code() {
            return this.strategy_code;
        }

        public final String getTmp_round_experiment_no_round_price() {
            return this.tmp_round_experiment_no_round_price;
        }

        public final String getTmp_round_experiment_mark_round_price() {
            return this.tmp_round_experiment_mark_round_price;
        }

        public final String getTmp_round_experiment_min_tick_round_price() {
            return this.tmp_round_experiment_min_tick_round_price;
        }

        public final String getTmp_round_experiment_mark_and_min_tick_round_price() {
            return this.tmp_round_experiment_mark_and_min_tick_round_price;
        }

        public final BrokerageAccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public final String getPrevious_quantity() {
            return this.previous_quantity;
        }

        public final OptionsOrderTypeDto getOption_order_type() {
            return this.option_order_type;
        }

        public final String getChain_type() {
            return this.chain_type;
        }

        public final OptionRelatedOrderDataDto getRelated_order_data() {
            return this.related_order_data;
        }
    }

    /* compiled from: OptionOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OptionOrderMetaDto, OptionOrderMeta> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionOrderMetaDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderMetaDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderMetaDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionOrderMetaDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionOrderMeta> getProtoAdapter() {
            return OptionOrderMeta.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderMetaDto getZeroValue() {
            return OptionOrderMetaDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderMetaDto fromProto(OptionOrderMeta proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String bid_price = proto.getBid_price();
            String ask_price = proto.getAsk_price();
            String entered_price = proto.getEntered_price();
            SourceDto sourceDtoFromProto = SourceDto.INSTANCE.fromProto(proto.getSource());
            String chain_symbol = proto.getChain_symbol();
            String existing_order_id = proto.getExisting_order_id();
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            BooleanDto booleanDtoFromProto = companion.fromProto(proto.getHas_position());
            BooleanDto booleanDtoFromProto2 = companion.fromProto(proto.getIs_watching());
            int num_legs = proto.getNum_legs();
            String adjusted_mark_price = proto.getAdjusted_mark_price();
            String adjusted_mark_price_round_down = proto.getAdjusted_mark_price_round_down();
            String adjusted_mark_price_min_tick = proto.getAdjusted_mark_price_min_tick();
            String adjusted_mark_price_round_down_min_tick = proto.getAdjusted_mark_price_round_down_min_tick();
            MarketabilityTypeDto marketabilityTypeDtoFromProto = MarketabilityTypeDto.INSTANCE.fromProto(proto.getMarketability());
            StateDto.Companion companion2 = StateDto.INSTANCE;
            StateDto stateDtoFromProto = companion2.fromProto(proto.getPrev_order_state());
            StateDto stateDtoFromProto2 = companion2.fromProto(proto.getCurrent_order_state());
            DefaultPriceSettingDto defaultPriceSettingDtoFromProto = DefaultPriceSettingDto.INSTANCE.fromProto(proto.getDefault_price_setting());
            String marketability_request_id = proto.getMarketability_request_id();
            OptionOrderCheckData order_check_data = proto.getOrder_check_data();
            OptionOrderCheckDataDto optionOrderCheckDataDtoFromProto = order_check_data != null ? OptionOrderCheckDataDto.INSTANCE.fromProto(order_check_data) : null;
            String strategy_code = proto.getStrategy_code();
            String tmp_round_experiment_no_round_price = proto.getTmp_round_experiment_no_round_price();
            String tmp_round_experiment_mark_round_price = proto.getTmp_round_experiment_mark_round_price();
            String tmp_round_experiment_min_tick_round_price = proto.getTmp_round_experiment_min_tick_round_price();
            String tmp_round_experiment_mark_and_min_tick_round_price = proto.getTmp_round_experiment_mark_and_min_tick_round_price();
            OptionOrderCheckDataDto optionOrderCheckDataDto = optionOrderCheckDataDtoFromProto;
            BrokerageAccountTypeDto brokerageAccountTypeDtoFromProto = BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getAccount_type());
            String previous_quantity = proto.getPrevious_quantity();
            OptionsOrderTypeDto optionsOrderTypeDtoFromProto = OptionsOrderTypeDto.INSTANCE.fromProto(proto.getOption_order_type());
            String chain_type = proto.getChain_type();
            OptionRelatedOrderData related_order_data = proto.getRelated_order_data();
            return new OptionOrderMetaDto(new Surrogate(bid_price, ask_price, entered_price, sourceDtoFromProto, chain_symbol, existing_order_id, booleanDtoFromProto, booleanDtoFromProto2, num_legs, adjusted_mark_price, adjusted_mark_price_round_down, adjusted_mark_price_min_tick, adjusted_mark_price_round_down_min_tick, marketabilityTypeDtoFromProto, stateDtoFromProto, stateDtoFromProto2, defaultPriceSettingDtoFromProto, marketability_request_id, optionOrderCheckDataDto, strategy_code, tmp_round_experiment_no_round_price, tmp_round_experiment_mark_round_price, tmp_round_experiment_min_tick_round_price, tmp_round_experiment_mark_and_min_tick_round_price, brokerageAccountTypeDtoFromProto, previous_quantity, optionsOrderTypeDtoFromProto, chain_type, related_order_data != null ? OptionRelatedOrderDataDto.INSTANCE.fromProto(related_order_data) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionOrderMetaDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderMetaDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionOrderMetaDto(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE_UNSPECIFIED", "SOURCE_OPTION_CHAIN", "SOURCE_INSTRUMENT_DETAIL", "SOURCE_AGGREGATE_POSITION", "SOURCE_STRATEGY_DETAIL", "SOURCE_ORDER_DETAIL", "SOURCE_ACTIVITY_ITEM", "SOURCE_STRATEGY_ROLL", "SOURCE_STRATEGY_CHAIN", "SOURCE_SIMULATED_RETURNS", "SOURCE_HOME_TAB", "SOURCE_ASSET_HOME", "SOURCE_RETIREMENT_HOME", "SOURCE_ORDER_FORM_FLYOVER", "SOURCE_SOCIAL_POST", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SourceDto implements Dto2<OptionOrderMeta.Source>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SourceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SourceDto, OptionOrderMeta.Source>> binaryBase64Serializer$delegate;
        public static final SourceDto SOURCE_UNSPECIFIED = new SOURCE_UNSPECIFIED("SOURCE_UNSPECIFIED", 0);
        public static final SourceDto SOURCE_OPTION_CHAIN = new SOURCE_OPTION_CHAIN("SOURCE_OPTION_CHAIN", 1);
        public static final SourceDto SOURCE_INSTRUMENT_DETAIL = new SOURCE_INSTRUMENT_DETAIL("SOURCE_INSTRUMENT_DETAIL", 2);
        public static final SourceDto SOURCE_AGGREGATE_POSITION = new SOURCE_AGGREGATE_POSITION("SOURCE_AGGREGATE_POSITION", 3);
        public static final SourceDto SOURCE_STRATEGY_DETAIL = new SOURCE_STRATEGY_DETAIL("SOURCE_STRATEGY_DETAIL", 4);
        public static final SourceDto SOURCE_ORDER_DETAIL = new SOURCE_ORDER_DETAIL("SOURCE_ORDER_DETAIL", 5);
        public static final SourceDto SOURCE_ACTIVITY_ITEM = new SOURCE_ACTIVITY_ITEM("SOURCE_ACTIVITY_ITEM", 6);
        public static final SourceDto SOURCE_STRATEGY_ROLL = new SOURCE_STRATEGY_ROLL("SOURCE_STRATEGY_ROLL", 7);
        public static final SourceDto SOURCE_STRATEGY_CHAIN = new SOURCE_STRATEGY_CHAIN("SOURCE_STRATEGY_CHAIN", 8);
        public static final SourceDto SOURCE_SIMULATED_RETURNS = new SOURCE_SIMULATED_RETURNS("SOURCE_SIMULATED_RETURNS", 9);
        public static final SourceDto SOURCE_HOME_TAB = new SOURCE_HOME_TAB("SOURCE_HOME_TAB", 10);
        public static final SourceDto SOURCE_ASSET_HOME = new SOURCE_ASSET_HOME("SOURCE_ASSET_HOME", 11);
        public static final SourceDto SOURCE_RETIREMENT_HOME = new SOURCE_RETIREMENT_HOME("SOURCE_RETIREMENT_HOME", 12);
        public static final SourceDto SOURCE_ORDER_FORM_FLYOVER = new SOURCE_ORDER_FORM_FLYOVER("SOURCE_ORDER_FORM_FLYOVER", 13);
        public static final SourceDto SOURCE_SOCIAL_POST = new SOURCE_SOCIAL_POST("SOURCE_SOCIAL_POST", 14);

        private static final /* synthetic */ SourceDto[] $values() {
            return new SourceDto[]{SOURCE_UNSPECIFIED, SOURCE_OPTION_CHAIN, SOURCE_INSTRUMENT_DETAIL, SOURCE_AGGREGATE_POSITION, SOURCE_STRATEGY_DETAIL, SOURCE_ORDER_DETAIL, SOURCE_ACTIVITY_ITEM, SOURCE_STRATEGY_ROLL, SOURCE_STRATEGY_CHAIN, SOURCE_SIMULATED_RETURNS, SOURCE_HOME_TAB, SOURCE_ASSET_HOME, SOURCE_RETIREMENT_HOME, SOURCE_ORDER_FORM_FLYOVER, SOURCE_SOCIAL_POST};
        }

        public /* synthetic */ SourceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SourceDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_UNSPECIFIED extends SourceDto {
            SOURCE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_UNSPECIFIED;
            }
        }

        private SourceDto(String str, int i) {
        }

        static {
            SourceDto[] sourceDtoArr$values = $values();
            $VALUES = sourceDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionOrderMetaDto$SourceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionOrderMetaDto.SourceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_OPTION_CHAIN", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_OPTION_CHAIN extends SourceDto {
            SOURCE_OPTION_CHAIN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_OPTION_CHAIN;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_INSTRUMENT_DETAIL", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_INSTRUMENT_DETAIL extends SourceDto {
            SOURCE_INSTRUMENT_DETAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_INSTRUMENT_DETAIL;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_AGGREGATE_POSITION", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_AGGREGATE_POSITION extends SourceDto {
            SOURCE_AGGREGATE_POSITION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_AGGREGATE_POSITION;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_STRATEGY_DETAIL", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_STRATEGY_DETAIL extends SourceDto {
            SOURCE_STRATEGY_DETAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_STRATEGY_DETAIL;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_ORDER_DETAIL", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_ORDER_DETAIL extends SourceDto {
            SOURCE_ORDER_DETAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_ORDER_DETAIL;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_ACTIVITY_ITEM", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_ACTIVITY_ITEM extends SourceDto {
            SOURCE_ACTIVITY_ITEM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_ACTIVITY_ITEM;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_STRATEGY_ROLL", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_STRATEGY_ROLL extends SourceDto {
            SOURCE_STRATEGY_ROLL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_STRATEGY_ROLL;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_STRATEGY_CHAIN", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_STRATEGY_CHAIN extends SourceDto {
            SOURCE_STRATEGY_CHAIN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_STRATEGY_CHAIN;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_SIMULATED_RETURNS", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_SIMULATED_RETURNS extends SourceDto {
            SOURCE_SIMULATED_RETURNS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_SIMULATED_RETURNS;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_HOME_TAB", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_HOME_TAB extends SourceDto {
            SOURCE_HOME_TAB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_HOME_TAB;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_ASSET_HOME", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_ASSET_HOME extends SourceDto {
            SOURCE_ASSET_HOME(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_ASSET_HOME;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_RETIREMENT_HOME", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_RETIREMENT_HOME extends SourceDto {
            SOURCE_RETIREMENT_HOME(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_RETIREMENT_HOME;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_ORDER_FORM_FLYOVER", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_ORDER_FORM_FLYOVER extends SourceDto {
            SOURCE_ORDER_FORM_FLYOVER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_ORDER_FORM_FLYOVER;
            }
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionOrderMetaDto.SourceDto.SOURCE_SOCIAL_POST", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class SOURCE_SOCIAL_POST extends SourceDto {
            SOURCE_SOCIAL_POST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionOrderMeta.Source toProto() {
                return OptionOrderMeta.Source.SOURCE_SOCIAL_POST;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SourceDto, OptionOrderMeta.Source> {

            /* compiled from: OptionOrderMetaDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OptionOrderMeta.Source.values().length];
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_OPTION_CHAIN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_INSTRUMENT_DETAIL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_AGGREGATE_POSITION.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_STRATEGY_DETAIL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_ORDER_DETAIL.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_ACTIVITY_ITEM.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_STRATEGY_ROLL.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_STRATEGY_CHAIN.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_SIMULATED_RETURNS.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_HOME_TAB.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_ASSET_HOME.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_RETIREMENT_HOME.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_ORDER_FORM_FLYOVER.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[OptionOrderMeta.Source.SOURCE_SOCIAL_POST.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SourceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceDto> getBinaryBase64Serializer() {
                return (KSerializer) SourceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OptionOrderMeta.Source> getProtoAdapter() {
                return OptionOrderMeta.Source.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceDto getZeroValue() {
                return SourceDto.SOURCE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceDto fromProto(OptionOrderMeta.Source proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return SourceDto.SOURCE_UNSPECIFIED;
                    case 2:
                        return SourceDto.SOURCE_OPTION_CHAIN;
                    case 3:
                        return SourceDto.SOURCE_INSTRUMENT_DETAIL;
                    case 4:
                        return SourceDto.SOURCE_AGGREGATE_POSITION;
                    case 5:
                        return SourceDto.SOURCE_STRATEGY_DETAIL;
                    case 6:
                        return SourceDto.SOURCE_ORDER_DETAIL;
                    case 7:
                        return SourceDto.SOURCE_ACTIVITY_ITEM;
                    case 8:
                        return SourceDto.SOURCE_STRATEGY_ROLL;
                    case 9:
                        return SourceDto.SOURCE_STRATEGY_CHAIN;
                    case 10:
                        return SourceDto.SOURCE_SIMULATED_RETURNS;
                    case 11:
                        return SourceDto.SOURCE_HOME_TAB;
                    case 12:
                        return SourceDto.SOURCE_ASSET_HOME;
                    case 13:
                        return SourceDto.SOURCE_RETIREMENT_HOME;
                    case 14:
                        return SourceDto.SOURCE_ORDER_FORM_FLYOVER;
                    case 15:
                        return SourceDto.SOURCE_SOCIAL_POST;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: OptionOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<SourceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SourceDto, OptionOrderMeta.Source> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.OptionOrderMeta.Source", SourceDto.getEntries(), SourceDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SourceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SourceDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SourceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SourceDto valueOf(String str) {
            return (SourceDto) Enum.valueOf(SourceDto.class, str);
        }

        public static SourceDto[] values() {
            return (SourceDto[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OptionOrderMetaDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OptionOrderMeta", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionOrderMetaDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionOrderMetaDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionOrderMetaDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.OptionOrderMetaDto";
        }
    }
}
