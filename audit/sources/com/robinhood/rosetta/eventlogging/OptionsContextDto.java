package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.OptionsContextDto;
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
import rosetta.option.MarketabilityType;
import rosetta.option.MarketabilityTypeDto;
import rosetta.option.StrategyName;
import rosetta.option.StrategyNameDto;

/* compiled from: OptionsContextDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006<=>?@AB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0093\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u001aJ\u0090\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\tJ\b\u0010.\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020\tH\u0016J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000205H\u0016J\b\u0010;\u001a\u000205H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010$R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001c¨\u0006B"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OptionsContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$Surrogate;)V", "option_chain_id", "", "option_order_id", "marketability", "Lrosetta/option/MarketabilityTypeDto;", "option_order_ref_id", "strategy", "Lrosetta/option/StrategyNameDto;", "option_leg_1", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;", "option_leg_2", "option_leg_3", "option_leg_4", "marketability_request_id", "option_order_type", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "source", "additional_context", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/option/MarketabilityTypeDto;Ljava/lang/String;Lrosetta/option/StrategyNameDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;Ljava/lang/String;Ljava/lang/String;)V", "getOption_chain_id", "()Ljava/lang/String;", "getOption_order_id", "getMarketability", "()Lrosetta/option/MarketabilityTypeDto;", "getOption_order_ref_id", "getStrategy", "()Lrosetta/option/StrategyNameDto;", "getOption_leg_1", "()Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;", "getOption_leg_2", "getOption_leg_3", "getOption_leg_4", "getMarketability_request_id", "getOption_order_type", "()Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "getSource", "getAdditional_context", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "OptionLegDto", "OptionOrderTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class OptionsContextDto implements Dto3<OptionsContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionsContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionsContextDto, OptionsContext>> binaryBase64Serializer$delegate;
    private static final OptionsContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionsContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionsContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOption_chain_id() {
        return this.surrogate.getOption_chain_id();
    }

    public final String getOption_order_id() {
        return this.surrogate.getOption_order_id();
    }

    public final MarketabilityTypeDto getMarketability() {
        return this.surrogate.getMarketability();
    }

    public final String getOption_order_ref_id() {
        return this.surrogate.getOption_order_ref_id();
    }

    public final StrategyNameDto getStrategy() {
        return this.surrogate.getStrategy();
    }

    public final OptionLegDto getOption_leg_1() {
        return this.surrogate.getOption_leg_1();
    }

    public final OptionLegDto getOption_leg_2() {
        return this.surrogate.getOption_leg_2();
    }

    public final OptionLegDto getOption_leg_3() {
        return this.surrogate.getOption_leg_3();
    }

    public final OptionLegDto getOption_leg_4() {
        return this.surrogate.getOption_leg_4();
    }

    public final String getMarketability_request_id() {
        return this.surrogate.getMarketability_request_id();
    }

    public final OptionOrderTypeDto getOption_order_type() {
        return this.surrogate.getOption_order_type();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public final String getAdditional_context() {
        return this.surrogate.getAdditional_context();
    }

    public /* synthetic */ OptionsContextDto(String str, String str2, MarketabilityTypeDto marketabilityTypeDto, String str3, StrategyNameDto strategyNameDto, OptionLegDto optionLegDto, OptionLegDto optionLegDto2, OptionLegDto optionLegDto3, OptionLegDto optionLegDto4, String str4, OptionOrderTypeDto optionOrderTypeDto, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? MarketabilityTypeDto.INSTANCE.getZeroValue() : marketabilityTypeDto, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? StrategyNameDto.INSTANCE.getZeroValue() : strategyNameDto, (i & 32) != 0 ? null : optionLegDto, (i & 64) != 0 ? null : optionLegDto2, (i & 128) != 0 ? null : optionLegDto3, (i & 256) == 0 ? optionLegDto4 : null, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? OptionOrderTypeDto.INSTANCE.getZeroValue() : optionOrderTypeDto, (i & 2048) != 0 ? "" : str5, (i & 4096) != 0 ? "" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionsContextDto(String option_chain_id, String option_order_id, MarketabilityTypeDto marketability, String option_order_ref_id, StrategyNameDto strategy, OptionLegDto optionLegDto, OptionLegDto optionLegDto2, OptionLegDto optionLegDto3, OptionLegDto optionLegDto4, String marketability_request_id, OptionOrderTypeDto option_order_type, String source, String additional_context) {
        this(new Surrogate(option_chain_id, option_order_id, marketability, option_order_ref_id, strategy, optionLegDto, optionLegDto2, optionLegDto3, optionLegDto4, marketability_request_id, option_order_type, source, additional_context));
        Intrinsics.checkNotNullParameter(option_chain_id, "option_chain_id");
        Intrinsics.checkNotNullParameter(option_order_id, "option_order_id");
        Intrinsics.checkNotNullParameter(marketability, "marketability");
        Intrinsics.checkNotNullParameter(option_order_ref_id, "option_order_ref_id");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
        Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(additional_context, "additional_context");
    }

    public static /* synthetic */ OptionsContextDto copy$default(OptionsContextDto optionsContextDto, String str, String str2, MarketabilityTypeDto marketabilityTypeDto, String str3, StrategyNameDto strategyNameDto, OptionLegDto optionLegDto, OptionLegDto optionLegDto2, OptionLegDto optionLegDto3, OptionLegDto optionLegDto4, String str4, OptionOrderTypeDto optionOrderTypeDto, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsContextDto.surrogate.getOption_chain_id();
        }
        return optionsContextDto.copy(str, (i & 2) != 0 ? optionsContextDto.surrogate.getOption_order_id() : str2, (i & 4) != 0 ? optionsContextDto.surrogate.getMarketability() : marketabilityTypeDto, (i & 8) != 0 ? optionsContextDto.surrogate.getOption_order_ref_id() : str3, (i & 16) != 0 ? optionsContextDto.surrogate.getStrategy() : strategyNameDto, (i & 32) != 0 ? optionsContextDto.surrogate.getOption_leg_1() : optionLegDto, (i & 64) != 0 ? optionsContextDto.surrogate.getOption_leg_2() : optionLegDto2, (i & 128) != 0 ? optionsContextDto.surrogate.getOption_leg_3() : optionLegDto3, (i & 256) != 0 ? optionsContextDto.surrogate.getOption_leg_4() : optionLegDto4, (i & 512) != 0 ? optionsContextDto.surrogate.getMarketability_request_id() : str4, (i & 1024) != 0 ? optionsContextDto.surrogate.getOption_order_type() : optionOrderTypeDto, (i & 2048) != 0 ? optionsContextDto.surrogate.getSource() : str5, (i & 4096) != 0 ? optionsContextDto.surrogate.getAdditional_context() : str6);
    }

    public final OptionsContextDto copy(String option_chain_id, String option_order_id, MarketabilityTypeDto marketability, String option_order_ref_id, StrategyNameDto strategy, OptionLegDto option_leg_1, OptionLegDto option_leg_2, OptionLegDto option_leg_3, OptionLegDto option_leg_4, String marketability_request_id, OptionOrderTypeDto option_order_type, String source, String additional_context) {
        Intrinsics.checkNotNullParameter(option_chain_id, "option_chain_id");
        Intrinsics.checkNotNullParameter(option_order_id, "option_order_id");
        Intrinsics.checkNotNullParameter(marketability, "marketability");
        Intrinsics.checkNotNullParameter(option_order_ref_id, "option_order_ref_id");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
        Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(additional_context, "additional_context");
        return new OptionsContextDto(new Surrogate(option_chain_id, option_order_id, marketability, option_order_ref_id, strategy, option_leg_1, option_leg_2, option_leg_3, option_leg_4, marketability_request_id, option_order_type, source, additional_context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OptionsContext toProto() {
        String option_chain_id = this.surrogate.getOption_chain_id();
        String option_order_id = this.surrogate.getOption_order_id();
        MarketabilityType marketabilityType = (MarketabilityType) this.surrogate.getMarketability().toProto();
        String option_order_ref_id = this.surrogate.getOption_order_ref_id();
        StrategyName strategyName = (StrategyName) this.surrogate.getStrategy().toProto();
        OptionLegDto option_leg_1 = this.surrogate.getOption_leg_1();
        OptionsContext.OptionLeg proto = option_leg_1 != null ? option_leg_1.toProto() : null;
        OptionLegDto option_leg_2 = this.surrogate.getOption_leg_2();
        OptionsContext.OptionLeg proto2 = option_leg_2 != null ? option_leg_2.toProto() : null;
        OptionLegDto option_leg_3 = this.surrogate.getOption_leg_3();
        OptionsContext.OptionLeg proto3 = option_leg_3 != null ? option_leg_3.toProto() : null;
        OptionLegDto option_leg_4 = this.surrogate.getOption_leg_4();
        return new OptionsContext(option_chain_id, option_order_id, marketabilityType, option_order_ref_id, strategyName, proto, proto2, proto3, option_leg_4 != null ? option_leg_4.toProto() : null, this.surrogate.getMarketability_request_id(), (OptionsContext.OptionOrderType) this.surrogate.getOption_order_type().toProto(), this.surrogate.getSource(), this.surrogate.getAdditional_context(), null, 8192, null);
    }

    public String toString() {
        return "[OptionsContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionsContextDto) && Intrinsics.areEqual(((OptionsContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 W2\u00020\u0001:\u0002VWB\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0014\u0010\u001aJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0011HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u0093\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u0017HÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001J%\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0001¢\u0006\u0002\bUR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010+R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010+R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010+R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001c\u001a\u0004\b3\u0010\u001eR\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001c\u001a\u0004\b5\u00106R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001c\u001a\u0004\b8\u0010\u001eR\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\u001c\u001a\u0004\b:\u0010\u001e¨\u0006X"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$Surrogate;", "", "option_chain_id", "", "option_order_id", "marketability", "Lrosetta/option/MarketabilityTypeDto;", "option_order_ref_id", "strategy", "Lrosetta/option/StrategyNameDto;", "option_leg_1", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;", "option_leg_2", "option_leg_3", "option_leg_4", "marketability_request_id", "option_order_type", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "source", "additional_context", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/option/MarketabilityTypeDto;Ljava/lang/String;Lrosetta/option/StrategyNameDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lrosetta/option/MarketabilityTypeDto;Ljava/lang/String;Lrosetta/option/StrategyNameDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOption_chain_id$annotations", "()V", "getOption_chain_id", "()Ljava/lang/String;", "getOption_order_id$annotations", "getOption_order_id", "getMarketability$annotations", "getMarketability", "()Lrosetta/option/MarketabilityTypeDto;", "getOption_order_ref_id$annotations", "getOption_order_ref_id", "getStrategy$annotations", "getStrategy", "()Lrosetta/option/StrategyNameDto;", "getOption_leg_1$annotations", "getOption_leg_1", "()Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;", "getOption_leg_2$annotations", "getOption_leg_2", "getOption_leg_3$annotations", "getOption_leg_3", "getOption_leg_4$annotations", "getOption_leg_4", "getMarketability_request_id$annotations", "getMarketability_request_id", "getOption_order_type$annotations", "getOption_order_type", "()Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "getSource$annotations", "getSource", "getAdditional_context$annotations", "getAdditional_context", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String additional_context;
        private final MarketabilityTypeDto marketability;
        private final String marketability_request_id;
        private final String option_chain_id;
        private final OptionLegDto option_leg_1;
        private final OptionLegDto option_leg_2;
        private final OptionLegDto option_leg_3;
        private final OptionLegDto option_leg_4;
        private final String option_order_id;
        private final String option_order_ref_id;
        private final OptionOrderTypeDto option_order_type;
        private final String source;
        private final StrategyNameDto strategy;

        public Surrogate() {
            this((String) null, (String) null, (MarketabilityTypeDto) null, (String) null, (StrategyNameDto) null, (OptionLegDto) null, (OptionLegDto) null, (OptionLegDto) null, (OptionLegDto) null, (String) null, (OptionOrderTypeDto) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, MarketabilityTypeDto marketabilityTypeDto, String str3, StrategyNameDto strategyNameDto, OptionLegDto optionLegDto, OptionLegDto optionLegDto2, OptionLegDto optionLegDto3, OptionLegDto optionLegDto4, String str4, OptionOrderTypeDto optionOrderTypeDto, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.option_chain_id;
            }
            return surrogate.copy(str, (i & 2) != 0 ? surrogate.option_order_id : str2, (i & 4) != 0 ? surrogate.marketability : marketabilityTypeDto, (i & 8) != 0 ? surrogate.option_order_ref_id : str3, (i & 16) != 0 ? surrogate.strategy : strategyNameDto, (i & 32) != 0 ? surrogate.option_leg_1 : optionLegDto, (i & 64) != 0 ? surrogate.option_leg_2 : optionLegDto2, (i & 128) != 0 ? surrogate.option_leg_3 : optionLegDto3, (i & 256) != 0 ? surrogate.option_leg_4 : optionLegDto4, (i & 512) != 0 ? surrogate.marketability_request_id : str4, (i & 1024) != 0 ? surrogate.option_order_type : optionOrderTypeDto, (i & 2048) != 0 ? surrogate.source : str5, (i & 4096) != 0 ? surrogate.additional_context : str6);
        }

        @SerialName("additionalContext")
        @JsonAnnotations2(names = {"additional_context"})
        public static /* synthetic */ void getAdditional_context$annotations() {
        }

        @SerialName("marketability")
        @JsonAnnotations2(names = {"marketability"})
        public static /* synthetic */ void getMarketability$annotations() {
        }

        @SerialName("marketabilityRequestId")
        @JsonAnnotations2(names = {"marketability_request_id"})
        public static /* synthetic */ void getMarketability_request_id$annotations() {
        }

        @SerialName("optionChainId")
        @JsonAnnotations2(names = {"option_chain_id"})
        public static /* synthetic */ void getOption_chain_id$annotations() {
        }

        @SerialName("optionLeg1")
        @JsonAnnotations2(names = {"option_leg_1"})
        public static /* synthetic */ void getOption_leg_1$annotations() {
        }

        @SerialName("optionLeg2")
        @JsonAnnotations2(names = {"option_leg_2"})
        public static /* synthetic */ void getOption_leg_2$annotations() {
        }

        @SerialName("optionLeg3")
        @JsonAnnotations2(names = {"option_leg_3"})
        public static /* synthetic */ void getOption_leg_3$annotations() {
        }

        @SerialName("optionLeg4")
        @JsonAnnotations2(names = {"option_leg_4"})
        public static /* synthetic */ void getOption_leg_4$annotations() {
        }

        @SerialName(ReplaceOptionOrderDialogFragment.EXTRA_ORDER_ID)
        @JsonAnnotations2(names = {"option_order_id"})
        public static /* synthetic */ void getOption_order_id$annotations() {
        }

        @SerialName("optionOrderRefId")
        @JsonAnnotations2(names = {"option_order_ref_id"})
        public static /* synthetic */ void getOption_order_ref_id$annotations() {
        }

        @SerialName("optionOrderType")
        @JsonAnnotations2(names = {"option_order_type"})
        public static /* synthetic */ void getOption_order_type$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("strategy")
        @JsonAnnotations2(names = {"strategy"})
        public static /* synthetic */ void getStrategy$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getOption_chain_id() {
            return this.option_chain_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getMarketability_request_id() {
            return this.marketability_request_id;
        }

        /* renamed from: component11, reason: from getter */
        public final OptionOrderTypeDto getOption_order_type() {
            return this.option_order_type;
        }

        /* renamed from: component12, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component13, reason: from getter */
        public final String getAdditional_context() {
            return this.additional_context;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOption_order_id() {
            return this.option_order_id;
        }

        /* renamed from: component3, reason: from getter */
        public final MarketabilityTypeDto getMarketability() {
            return this.marketability;
        }

        /* renamed from: component4, reason: from getter */
        public final String getOption_order_ref_id() {
            return this.option_order_ref_id;
        }

        /* renamed from: component5, reason: from getter */
        public final StrategyNameDto getStrategy() {
            return this.strategy;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionLegDto getOption_leg_1() {
            return this.option_leg_1;
        }

        /* renamed from: component7, reason: from getter */
        public final OptionLegDto getOption_leg_2() {
            return this.option_leg_2;
        }

        /* renamed from: component8, reason: from getter */
        public final OptionLegDto getOption_leg_3() {
            return this.option_leg_3;
        }

        /* renamed from: component9, reason: from getter */
        public final OptionLegDto getOption_leg_4() {
            return this.option_leg_4;
        }

        public final Surrogate copy(String option_chain_id, String option_order_id, MarketabilityTypeDto marketability, String option_order_ref_id, StrategyNameDto strategy, OptionLegDto option_leg_1, OptionLegDto option_leg_2, OptionLegDto option_leg_3, OptionLegDto option_leg_4, String marketability_request_id, OptionOrderTypeDto option_order_type, String source, String additional_context) {
            Intrinsics.checkNotNullParameter(option_chain_id, "option_chain_id");
            Intrinsics.checkNotNullParameter(option_order_id, "option_order_id");
            Intrinsics.checkNotNullParameter(marketability, "marketability");
            Intrinsics.checkNotNullParameter(option_order_ref_id, "option_order_ref_id");
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
            Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(additional_context, "additional_context");
            return new Surrogate(option_chain_id, option_order_id, marketability, option_order_ref_id, strategy, option_leg_1, option_leg_2, option_leg_3, option_leg_4, marketability_request_id, option_order_type, source, additional_context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.option_chain_id, surrogate.option_chain_id) && Intrinsics.areEqual(this.option_order_id, surrogate.option_order_id) && this.marketability == surrogate.marketability && Intrinsics.areEqual(this.option_order_ref_id, surrogate.option_order_ref_id) && this.strategy == surrogate.strategy && Intrinsics.areEqual(this.option_leg_1, surrogate.option_leg_1) && Intrinsics.areEqual(this.option_leg_2, surrogate.option_leg_2) && Intrinsics.areEqual(this.option_leg_3, surrogate.option_leg_3) && Intrinsics.areEqual(this.option_leg_4, surrogate.option_leg_4) && Intrinsics.areEqual(this.marketability_request_id, surrogate.marketability_request_id) && this.option_order_type == surrogate.option_order_type && Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.additional_context, surrogate.additional_context);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.option_chain_id.hashCode() * 31) + this.option_order_id.hashCode()) * 31) + this.marketability.hashCode()) * 31) + this.option_order_ref_id.hashCode()) * 31) + this.strategy.hashCode()) * 31;
            OptionLegDto optionLegDto = this.option_leg_1;
            int iHashCode2 = (iHashCode + (optionLegDto == null ? 0 : optionLegDto.hashCode())) * 31;
            OptionLegDto optionLegDto2 = this.option_leg_2;
            int iHashCode3 = (iHashCode2 + (optionLegDto2 == null ? 0 : optionLegDto2.hashCode())) * 31;
            OptionLegDto optionLegDto3 = this.option_leg_3;
            int iHashCode4 = (iHashCode3 + (optionLegDto3 == null ? 0 : optionLegDto3.hashCode())) * 31;
            OptionLegDto optionLegDto4 = this.option_leg_4;
            return ((((((((iHashCode4 + (optionLegDto4 != null ? optionLegDto4.hashCode() : 0)) * 31) + this.marketability_request_id.hashCode()) * 31) + this.option_order_type.hashCode()) * 31) + this.source.hashCode()) * 31) + this.additional_context.hashCode();
        }

        public String toString() {
            return "Surrogate(option_chain_id=" + this.option_chain_id + ", option_order_id=" + this.option_order_id + ", marketability=" + this.marketability + ", option_order_ref_id=" + this.option_order_ref_id + ", strategy=" + this.strategy + ", option_leg_1=" + this.option_leg_1 + ", option_leg_2=" + this.option_leg_2 + ", option_leg_3=" + this.option_leg_3 + ", option_leg_4=" + this.option_leg_4 + ", marketability_request_id=" + this.marketability_request_id + ", option_order_type=" + this.option_order_type + ", source=" + this.source + ", additional_context=" + this.additional_context + ")";
        }

        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionsContextDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, MarketabilityTypeDto marketabilityTypeDto, String str3, StrategyNameDto strategyNameDto, OptionLegDto optionLegDto, OptionLegDto optionLegDto2, OptionLegDto optionLegDto3, OptionLegDto optionLegDto4, String str4, OptionOrderTypeDto optionOrderTypeDto, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.option_chain_id = "";
            } else {
                this.option_chain_id = str;
            }
            if ((i & 2) == 0) {
                this.option_order_id = "";
            } else {
                this.option_order_id = str2;
            }
            if ((i & 4) == 0) {
                this.marketability = MarketabilityTypeDto.INSTANCE.getZeroValue();
            } else {
                this.marketability = marketabilityTypeDto;
            }
            if ((i & 8) == 0) {
                this.option_order_ref_id = "";
            } else {
                this.option_order_ref_id = str3;
            }
            if ((i & 16) == 0) {
                this.strategy = StrategyNameDto.INSTANCE.getZeroValue();
            } else {
                this.strategy = strategyNameDto;
            }
            if ((i & 32) == 0) {
                this.option_leg_1 = null;
            } else {
                this.option_leg_1 = optionLegDto;
            }
            if ((i & 64) == 0) {
                this.option_leg_2 = null;
            } else {
                this.option_leg_2 = optionLegDto2;
            }
            if ((i & 128) == 0) {
                this.option_leg_3 = null;
            } else {
                this.option_leg_3 = optionLegDto3;
            }
            if ((i & 256) == 0) {
                this.option_leg_4 = null;
            } else {
                this.option_leg_4 = optionLegDto4;
            }
            if ((i & 512) == 0) {
                this.marketability_request_id = "";
            } else {
                this.marketability_request_id = str4;
            }
            if ((i & 1024) == 0) {
                this.option_order_type = OptionOrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.option_order_type = optionOrderTypeDto;
            }
            if ((i & 2048) == 0) {
                this.source = "";
            } else {
                this.source = str5;
            }
            if ((i & 4096) == 0) {
                this.additional_context = "";
            } else {
                this.additional_context = str6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.option_chain_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.option_chain_id);
            }
            if (!Intrinsics.areEqual(self.option_order_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.option_order_id);
            }
            if (self.marketability != MarketabilityTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, MarketabilityTypeDto.Serializer.INSTANCE, self.marketability);
            }
            if (!Intrinsics.areEqual(self.option_order_ref_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.option_order_ref_id);
            }
            if (self.strategy != StrategyNameDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, StrategyNameDto.Serializer.INSTANCE, self.strategy);
            }
            OptionLegDto optionLegDto = self.option_leg_1;
            if (optionLegDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, OptionLegDto.Serializer.INSTANCE, optionLegDto);
            }
            OptionLegDto optionLegDto2 = self.option_leg_2;
            if (optionLegDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, OptionLegDto.Serializer.INSTANCE, optionLegDto2);
            }
            OptionLegDto optionLegDto3 = self.option_leg_3;
            if (optionLegDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, OptionLegDto.Serializer.INSTANCE, optionLegDto3);
            }
            OptionLegDto optionLegDto4 = self.option_leg_4;
            if (optionLegDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, OptionLegDto.Serializer.INSTANCE, optionLegDto4);
            }
            if (!Intrinsics.areEqual(self.marketability_request_id, "")) {
                output.encodeStringElement(serialDesc, 9, self.marketability_request_id);
            }
            if (self.option_order_type != OptionOrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, OptionOrderTypeDto.Serializer.INSTANCE, self.option_order_type);
            }
            if (!Intrinsics.areEqual(self.source, "")) {
                output.encodeStringElement(serialDesc, 11, self.source);
            }
            if (Intrinsics.areEqual(self.additional_context, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 12, self.additional_context);
        }

        public Surrogate(String option_chain_id, String option_order_id, MarketabilityTypeDto marketability, String option_order_ref_id, StrategyNameDto strategy, OptionLegDto optionLegDto, OptionLegDto optionLegDto2, OptionLegDto optionLegDto3, OptionLegDto optionLegDto4, String marketability_request_id, OptionOrderTypeDto option_order_type, String source, String additional_context) {
            Intrinsics.checkNotNullParameter(option_chain_id, "option_chain_id");
            Intrinsics.checkNotNullParameter(option_order_id, "option_order_id");
            Intrinsics.checkNotNullParameter(marketability, "marketability");
            Intrinsics.checkNotNullParameter(option_order_ref_id, "option_order_ref_id");
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
            Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(additional_context, "additional_context");
            this.option_chain_id = option_chain_id;
            this.option_order_id = option_order_id;
            this.marketability = marketability;
            this.option_order_ref_id = option_order_ref_id;
            this.strategy = strategy;
            this.option_leg_1 = optionLegDto;
            this.option_leg_2 = optionLegDto2;
            this.option_leg_3 = optionLegDto3;
            this.option_leg_4 = optionLegDto4;
            this.marketability_request_id = marketability_request_id;
            this.option_order_type = option_order_type;
            this.source = source;
            this.additional_context = additional_context;
        }

        public /* synthetic */ Surrogate(String str, String str2, MarketabilityTypeDto marketabilityTypeDto, String str3, StrategyNameDto strategyNameDto, OptionLegDto optionLegDto, OptionLegDto optionLegDto2, OptionLegDto optionLegDto3, OptionLegDto optionLegDto4, String str4, OptionOrderTypeDto optionOrderTypeDto, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? MarketabilityTypeDto.INSTANCE.getZeroValue() : marketabilityTypeDto, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? StrategyNameDto.INSTANCE.getZeroValue() : strategyNameDto, (i & 32) != 0 ? null : optionLegDto, (i & 64) != 0 ? null : optionLegDto2, (i & 128) != 0 ? null : optionLegDto3, (i & 256) == 0 ? optionLegDto4 : null, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? OptionOrderTypeDto.INSTANCE.getZeroValue() : optionOrderTypeDto, (i & 2048) != 0 ? "" : str5, (i & 4096) != 0 ? "" : str6);
        }

        public final String getOption_chain_id() {
            return this.option_chain_id;
        }

        public final String getOption_order_id() {
            return this.option_order_id;
        }

        public final MarketabilityTypeDto getMarketability() {
            return this.marketability;
        }

        public final String getOption_order_ref_id() {
            return this.option_order_ref_id;
        }

        public final StrategyNameDto getStrategy() {
            return this.strategy;
        }

        public final OptionLegDto getOption_leg_1() {
            return this.option_leg_1;
        }

        public final OptionLegDto getOption_leg_2() {
            return this.option_leg_2;
        }

        public final OptionLegDto getOption_leg_3() {
            return this.option_leg_3;
        }

        public final OptionLegDto getOption_leg_4() {
            return this.option_leg_4;
        }

        public final String getMarketability_request_id() {
            return this.marketability_request_id;
        }

        public final OptionOrderTypeDto getOption_order_type() {
            return this.option_order_type;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getAdditional_context() {
            return this.additional_context;
        }
    }

    /* compiled from: OptionsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto;", "Lcom/robinhood/rosetta/eventlogging/OptionsContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionsContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OptionsContextDto, OptionsContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionsContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionsContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionsContextDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionsContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionsContext> getProtoAdapter() {
            return OptionsContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionsContextDto getZeroValue() {
            return OptionsContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionsContextDto fromProto(OptionsContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String option_chain_id = proto.getOption_chain_id();
            String option_order_id = proto.getOption_order_id();
            MarketabilityTypeDto marketabilityTypeDtoFromProto = MarketabilityTypeDto.INSTANCE.fromProto(proto.getMarketability());
            String option_order_ref_id = proto.getOption_order_ref_id();
            StrategyNameDto strategyNameDtoFromProto = StrategyNameDto.INSTANCE.fromProto(proto.getStrategy());
            OptionsContext.OptionLeg option_leg_1 = proto.getOption_leg_1();
            DefaultConstructorMarker defaultConstructorMarker = null;
            OptionLegDto optionLegDtoFromProto = option_leg_1 != null ? OptionLegDto.INSTANCE.fromProto(option_leg_1) : null;
            OptionsContext.OptionLeg option_leg_2 = proto.getOption_leg_2();
            OptionLegDto optionLegDtoFromProto2 = option_leg_2 != null ? OptionLegDto.INSTANCE.fromProto(option_leg_2) : null;
            OptionsContext.OptionLeg option_leg_3 = proto.getOption_leg_3();
            OptionLegDto optionLegDtoFromProto3 = option_leg_3 != null ? OptionLegDto.INSTANCE.fromProto(option_leg_3) : null;
            OptionsContext.OptionLeg option_leg_4 = proto.getOption_leg_4();
            return new OptionsContextDto(new Surrogate(option_chain_id, option_order_id, marketabilityTypeDtoFromProto, option_order_ref_id, strategyNameDtoFromProto, optionLegDtoFromProto, optionLegDtoFromProto2, optionLegDtoFromProto3, option_leg_4 != null ? OptionLegDto.INSTANCE.fromProto(option_leg_4) : null, proto.getMarketability_request_id(), OptionOrderTypeDto.INSTANCE.fromProto(proto.getOption_order_type()), proto.getSource(), proto.getAdditional_context()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionsContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionsContextDto(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001c\u001d\u001e\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionLeg;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto$Surrogate;)V", "option_instrument_id", "", "(Ljava/lang/String;)V", "getOption_instrument_id", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OptionLegDto implements Dto3<OptionsContext.OptionLeg>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<OptionLegDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OptionLegDto, OptionsContext.OptionLeg>> binaryBase64Serializer$delegate;
        private static final OptionLegDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ OptionLegDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private OptionLegDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getOption_instrument_id() {
            return this.surrogate.getOption_instrument_id();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OptionLegDto(String option_instrument_id) {
            this(new Surrogate(option_instrument_id));
            Intrinsics.checkNotNullParameter(option_instrument_id, "option_instrument_id");
        }

        public /* synthetic */ OptionLegDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public static /* synthetic */ OptionLegDto copy$default(OptionLegDto optionLegDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = optionLegDto.surrogate.getOption_instrument_id();
            }
            return optionLegDto.copy(str);
        }

        public final OptionLegDto copy(String option_instrument_id) {
            Intrinsics.checkNotNullParameter(option_instrument_id, "option_instrument_id");
            return new OptionLegDto(new Surrogate(option_instrument_id));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public OptionsContext.OptionLeg toProto() {
            return new OptionsContext.OptionLeg(this.surrogate.getOption_instrument_id(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[OptionLegDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof OptionLegDto) && Intrinsics.areEqual(((OptionLegDto) other).surrogate, this.surrogate);
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
        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto$Surrogate;", "", "option_instrument_id", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOption_instrument_id$annotations", "()V", "getOption_instrument_id", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String option_instrument_id;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = surrogate.option_instrument_id;
                }
                return surrogate.copy(str);
            }

            @SerialName("optionInstrumentId")
            @JsonAnnotations2(names = {"option_instrument_id"})
            public static /* synthetic */ void getOption_instrument_id$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getOption_instrument_id() {
                return this.option_instrument_id;
            }

            public final Surrogate copy(String option_instrument_id) {
                Intrinsics.checkNotNullParameter(option_instrument_id, "option_instrument_id");
                return new Surrogate(option_instrument_id);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.option_instrument_id, ((Surrogate) other).option_instrument_id);
            }

            public int hashCode() {
                return this.option_instrument_id.hashCode();
            }

            public String toString() {
                return "Surrogate(option_instrument_id=" + this.option_instrument_id + ")";
            }

            /* compiled from: OptionsContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return OptionsContextDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.option_instrument_id = "";
                } else {
                    this.option_instrument_id = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Intrinsics.areEqual(self.option_instrument_id, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 0, self.option_instrument_id);
            }

            public Surrogate(String option_instrument_id) {
                Intrinsics.checkNotNullParameter(option_instrument_id, "option_instrument_id");
                this.option_instrument_id = option_instrument_id;
            }

            public final String getOption_instrument_id() {
                return this.option_instrument_id;
            }

            public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionLeg;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<OptionLegDto, OptionsContext.OptionLeg> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OptionLegDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OptionLegDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OptionLegDto> getBinaryBase64Serializer() {
                return (KSerializer) OptionLegDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OptionsContext.OptionLeg> getProtoAdapter() {
                return OptionsContext.OptionLeg.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OptionLegDto getZeroValue() {
                return OptionLegDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OptionLegDto fromProto(OptionsContext.OptionLeg proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new OptionLegDto(new Surrogate(proto.getOption_instrument_id()), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionsContextDto$OptionLegDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionsContextDto.OptionLegDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new OptionLegDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OptionLegDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OptionsContext.OptionLeg", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OptionLegDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public OptionLegDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new OptionLegDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionLegDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.OptionsContextDto$OptionLegDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "LIMIT", "STOP_LIMIT", "STOP_MARKET", "MARKET", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OptionOrderTypeDto implements Dto2<OptionsContext.OptionOrderType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OptionOrderTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OptionOrderTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OptionOrderTypeDto, OptionsContext.OptionOrderType>> binaryBase64Serializer$delegate;
        public static final OptionOrderTypeDto UNKNOWN = new UNKNOWN("UNKNOWN", 0);
        public static final OptionOrderTypeDto LIMIT = new LIMIT("LIMIT", 1);
        public static final OptionOrderTypeDto STOP_LIMIT = new STOP_LIMIT("STOP_LIMIT", 2);
        public static final OptionOrderTypeDto STOP_MARKET = new STOP_MARKET("STOP_MARKET", 3);
        public static final OptionOrderTypeDto MARKET = new MARKET("MARKET", 4);

        private static final /* synthetic */ OptionOrderTypeDto[] $values() {
            return new OptionOrderTypeDto[]{UNKNOWN, LIMIT, STOP_LIMIT, STOP_MARKET, MARKET};
        }

        public /* synthetic */ OptionOrderTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OptionOrderTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionsContextDto.OptionOrderTypeDto.UNKNOWN", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNKNOWN extends OptionOrderTypeDto {
            UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionsContext.OptionOrderType toProto() {
                return OptionsContext.OptionOrderType.UNKNOWN;
            }
        }

        private OptionOrderTypeDto(String str, int i) {
        }

        static {
            OptionOrderTypeDto[] optionOrderTypeDtoArr$values = $values();
            $VALUES = optionOrderTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(optionOrderTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionsContextDto$OptionOrderTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionsContextDto.OptionOrderTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionsContextDto.OptionOrderTypeDto.LIMIT", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIMIT extends OptionOrderTypeDto {
            LIMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionsContext.OptionOrderType toProto() {
                return OptionsContext.OptionOrderType.LIMIT;
            }
        }

        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionsContextDto.OptionOrderTypeDto.STOP_LIMIT", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STOP_LIMIT extends OptionOrderTypeDto {
            STOP_LIMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionsContext.OptionOrderType toProto() {
                return OptionsContext.OptionOrderType.STOP_LIMIT;
            }
        }

        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionsContextDto.OptionOrderTypeDto.STOP_MARKET", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STOP_MARKET extends OptionOrderTypeDto {
            STOP_MARKET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionsContext.OptionOrderType toProto() {
                return OptionsContext.OptionOrderType.STOP_MARKET;
            }
        }

        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionsContextDto.OptionOrderTypeDto.MARKET", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET extends OptionOrderTypeDto {
            MARKET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionsContext.OptionOrderType toProto() {
                return OptionsContext.OptionOrderType.MARKET;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OptionOrderTypeDto, OptionsContext.OptionOrderType> {

            /* compiled from: OptionsContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OptionsContext.OptionOrderType.values().length];
                    try {
                        iArr[OptionsContext.OptionOrderType.UNKNOWN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OptionsContext.OptionOrderType.LIMIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[OptionsContext.OptionOrderType.STOP_LIMIT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[OptionsContext.OptionOrderType.STOP_MARKET.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[OptionsContext.OptionOrderType.MARKET.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OptionOrderTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OptionOrderTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OptionOrderTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) OptionOrderTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OptionsContext.OptionOrderType> getProtoAdapter() {
                return OptionsContext.OptionOrderType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OptionOrderTypeDto getZeroValue() {
                return OptionOrderTypeDto.UNKNOWN;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OptionOrderTypeDto fromProto(OptionsContext.OptionOrderType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OptionOrderTypeDto.UNKNOWN;
                }
                if (i == 2) {
                    return OptionOrderTypeDto.LIMIT;
                }
                if (i == 3) {
                    return OptionOrderTypeDto.STOP_LIMIT;
                }
                if (i == 4) {
                    return OptionOrderTypeDto.STOP_MARKET;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return OptionOrderTypeDto.MARKET;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: OptionsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$OptionOrderTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OptionOrderTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OptionOrderTypeDto, OptionsContext.OptionOrderType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.OptionsContext.OptionOrderType", OptionOrderTypeDto.getEntries(), OptionOrderTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OptionOrderTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OptionOrderTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OptionOrderTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OptionOrderTypeDto valueOf(String str) {
            return (OptionOrderTypeDto) Enum.valueOf(OptionOrderTypeDto.class, str);
        }

        public static OptionOrderTypeDto[] values() {
            return (OptionOrderTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionsContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OptionsContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OptionsContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionsContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionsContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionsContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.OptionsContextDto";
        }
    }
}
