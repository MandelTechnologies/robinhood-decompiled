package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.option.MarketabilityType;
import rosetta.option.StrategyName;

/* compiled from: OptionsContext.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003456B\u009b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J\u009a\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContext;", "Lcom/squareup/wire/Message;", "", "option_chain_id", "", "option_order_id", "marketability", "Lrosetta/option/MarketabilityType;", "option_order_ref_id", "strategy", "Lrosetta/option/StrategyName;", "option_leg_1", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionLeg;", "option_leg_2", "option_leg_3", "option_leg_4", "marketability_request_id", "option_order_type", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "source", "additional_context", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/option/MarketabilityType;Ljava/lang/String;Lrosetta/option/StrategyName;Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionLeg;Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionLeg;Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionLeg;Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionLeg;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getOption_chain_id", "()Ljava/lang/String;", "getOption_order_id", "getMarketability", "()Lrosetta/option/MarketabilityType;", "getOption_order_ref_id", "getStrategy", "()Lrosetta/option/StrategyName;", "getOption_leg_1", "()Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionLeg;", "getOption_leg_2", "getOption_leg_3", "getOption_leg_4", "getMarketability_request_id", "getOption_order_type", "()Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "getSource", "getAdditional_context", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "OptionLeg", "OptionOrderType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionsContext extends Message {

    @JvmField
    public static final ProtoAdapter<OptionsContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "additionalContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String additional_context;

    @WireField(adapter = "rosetta.option.MarketabilityType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final MarketabilityType marketability;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "marketabilityRequestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String marketability_request_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "optionChainId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String option_chain_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionsContext$OptionLeg#ADAPTER", jsonName = "optionLeg1", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final OptionLeg option_leg_1;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionsContext$OptionLeg#ADAPTER", jsonName = "optionLeg2", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final OptionLeg option_leg_2;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionsContext$OptionLeg#ADAPTER", jsonName = "optionLeg3", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final OptionLeg option_leg_3;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionsContext$OptionLeg#ADAPTER", jsonName = "optionLeg4", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final OptionLeg option_leg_4;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = ReplaceOptionOrderDialogFragment.EXTRA_ORDER_ID, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String option_order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "optionOrderRefId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String option_order_ref_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionsContext$OptionOrderType#ADAPTER", jsonName = "optionOrderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final OptionOrderType option_order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String source;

    @WireField(adapter = "rosetta.option.StrategyName#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final StrategyName strategy;

    public OptionsContext() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public /* synthetic */ OptionsContext(String str, String str2, MarketabilityType marketabilityType, String str3, StrategyName strategyName, OptionLeg optionLeg, OptionLeg optionLeg2, OptionLeg optionLeg3, OptionLeg optionLeg4, String str4, OptionOrderType optionOrderType, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? MarketabilityType.MARKETABILITY_UNSPECIFIED : marketabilityType, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? StrategyName.STRATEGY_NAME_UNSPECIFIED : strategyName, (i & 32) != 0 ? null : optionLeg, (i & 64) != 0 ? null : optionLeg2, (i & 128) != 0 ? null : optionLeg3, (i & 256) == 0 ? optionLeg4 : null, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? OptionOrderType.UNKNOWN : optionOrderType, (i & 2048) != 0 ? "" : str5, (i & 4096) == 0 ? str6 : "", (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24445newBuilder();
    }

    public final String getOption_chain_id() {
        return this.option_chain_id;
    }

    public final String getOption_order_id() {
        return this.option_order_id;
    }

    public final MarketabilityType getMarketability() {
        return this.marketability;
    }

    public final String getOption_order_ref_id() {
        return this.option_order_ref_id;
    }

    public final StrategyName getStrategy() {
        return this.strategy;
    }

    public final OptionLeg getOption_leg_1() {
        return this.option_leg_1;
    }

    public final OptionLeg getOption_leg_2() {
        return this.option_leg_2;
    }

    public final OptionLeg getOption_leg_3() {
        return this.option_leg_3;
    }

    public final OptionLeg getOption_leg_4() {
        return this.option_leg_4;
    }

    public final String getMarketability_request_id() {
        return this.marketability_request_id;
    }

    public final OptionOrderType getOption_order_type() {
        return this.option_order_type;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getAdditional_context() {
        return this.additional_context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsContext(String option_chain_id, String option_order_id, MarketabilityType marketability, String option_order_ref_id, StrategyName strategy, OptionLeg optionLeg, OptionLeg optionLeg2, OptionLeg optionLeg3, OptionLeg optionLeg4, String marketability_request_id, OptionOrderType option_order_type, String source, String additional_context, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(option_chain_id, "option_chain_id");
        Intrinsics.checkNotNullParameter(option_order_id, "option_order_id");
        Intrinsics.checkNotNullParameter(marketability, "marketability");
        Intrinsics.checkNotNullParameter(option_order_ref_id, "option_order_ref_id");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
        Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(additional_context, "additional_context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.option_chain_id = option_chain_id;
        this.option_order_id = option_order_id;
        this.marketability = marketability;
        this.option_order_ref_id = option_order_ref_id;
        this.strategy = strategy;
        this.option_leg_1 = optionLeg;
        this.option_leg_2 = optionLeg2;
        this.option_leg_3 = optionLeg3;
        this.option_leg_4 = optionLeg4;
        this.marketability_request_id = marketability_request_id;
        this.option_order_type = option_order_type;
        this.source = source;
        this.additional_context = additional_context;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24445newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionsContext)) {
            return false;
        }
        OptionsContext optionsContext = (OptionsContext) other;
        return Intrinsics.areEqual(unknownFields(), optionsContext.unknownFields()) && Intrinsics.areEqual(this.option_chain_id, optionsContext.option_chain_id) && Intrinsics.areEqual(this.option_order_id, optionsContext.option_order_id) && this.marketability == optionsContext.marketability && Intrinsics.areEqual(this.option_order_ref_id, optionsContext.option_order_ref_id) && this.strategy == optionsContext.strategy && Intrinsics.areEqual(this.option_leg_1, optionsContext.option_leg_1) && Intrinsics.areEqual(this.option_leg_2, optionsContext.option_leg_2) && Intrinsics.areEqual(this.option_leg_3, optionsContext.option_leg_3) && Intrinsics.areEqual(this.option_leg_4, optionsContext.option_leg_4) && Intrinsics.areEqual(this.marketability_request_id, optionsContext.marketability_request_id) && this.option_order_type == optionsContext.option_order_type && Intrinsics.areEqual(this.source, optionsContext.source) && Intrinsics.areEqual(this.additional_context, optionsContext.additional_context);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.option_chain_id.hashCode()) * 37) + this.option_order_id.hashCode()) * 37) + this.marketability.hashCode()) * 37) + this.option_order_ref_id.hashCode()) * 37) + this.strategy.hashCode()) * 37;
        OptionLeg optionLeg = this.option_leg_1;
        int iHashCode2 = (iHashCode + (optionLeg != null ? optionLeg.hashCode() : 0)) * 37;
        OptionLeg optionLeg2 = this.option_leg_2;
        int iHashCode3 = (iHashCode2 + (optionLeg2 != null ? optionLeg2.hashCode() : 0)) * 37;
        OptionLeg optionLeg3 = this.option_leg_3;
        int iHashCode4 = (iHashCode3 + (optionLeg3 != null ? optionLeg3.hashCode() : 0)) * 37;
        OptionLeg optionLeg4 = this.option_leg_4;
        int iHashCode5 = ((((((((iHashCode4 + (optionLeg4 != null ? optionLeg4.hashCode() : 0)) * 37) + this.marketability_request_id.hashCode()) * 37) + this.option_order_type.hashCode()) * 37) + this.source.hashCode()) * 37) + this.additional_context.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("option_chain_id=" + Internal.sanitize(this.option_chain_id));
        arrayList.add("option_order_id=" + Internal.sanitize(this.option_order_id));
        arrayList.add("marketability=" + this.marketability);
        arrayList.add("option_order_ref_id=" + Internal.sanitize(this.option_order_ref_id));
        arrayList.add("strategy=" + this.strategy);
        OptionLeg optionLeg = this.option_leg_1;
        if (optionLeg != null) {
            arrayList.add("option_leg_1=" + optionLeg);
        }
        OptionLeg optionLeg2 = this.option_leg_2;
        if (optionLeg2 != null) {
            arrayList.add("option_leg_2=" + optionLeg2);
        }
        OptionLeg optionLeg3 = this.option_leg_3;
        if (optionLeg3 != null) {
            arrayList.add("option_leg_3=" + optionLeg3);
        }
        OptionLeg optionLeg4 = this.option_leg_4;
        if (optionLeg4 != null) {
            arrayList.add("option_leg_4=" + optionLeg4);
        }
        arrayList.add("marketability_request_id=" + Internal.sanitize(this.marketability_request_id));
        arrayList.add("option_order_type=" + this.option_order_type);
        arrayList.add("source=" + Internal.sanitize(this.source));
        arrayList.add("additional_context=" + Internal.sanitize(this.additional_context));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionsContext{", "}", 0, null, null, 56, null);
    }

    public final OptionsContext copy(String option_chain_id, String option_order_id, MarketabilityType marketability, String option_order_ref_id, StrategyName strategy, OptionLeg option_leg_1, OptionLeg option_leg_2, OptionLeg option_leg_3, OptionLeg option_leg_4, String marketability_request_id, OptionOrderType option_order_type, String source, String additional_context, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(option_chain_id, "option_chain_id");
        Intrinsics.checkNotNullParameter(option_order_id, "option_order_id");
        Intrinsics.checkNotNullParameter(marketability, "marketability");
        Intrinsics.checkNotNullParameter(option_order_ref_id, "option_order_ref_id");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
        Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(additional_context, "additional_context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionsContext(option_chain_id, option_order_id, marketability, option_order_ref_id, strategy, option_leg_1, option_leg_2, option_leg_3, option_leg_4, marketability_request_id, option_order_type, source, additional_context, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionsContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionsContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionsContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOption_chain_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOption_chain_id());
                }
                if (!Intrinsics.areEqual(value.getOption_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOption_order_id());
                }
                if (value.getMarketability() != MarketabilityType.MARKETABILITY_UNSPECIFIED) {
                    size += MarketabilityType.ADAPTER.encodedSizeWithTag(3, value.getMarketability());
                }
                if (!Intrinsics.areEqual(value.getOption_order_ref_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOption_order_ref_id());
                }
                if (value.getStrategy() != StrategyName.STRATEGY_NAME_UNSPECIFIED) {
                    size += StrategyName.ADAPTER.encodedSizeWithTag(5, value.getStrategy());
                }
                if (value.getOption_leg_1() != null) {
                    size += OptionsContext.OptionLeg.ADAPTER.encodedSizeWithTag(6, value.getOption_leg_1());
                }
                if (value.getOption_leg_2() != null) {
                    size += OptionsContext.OptionLeg.ADAPTER.encodedSizeWithTag(7, value.getOption_leg_2());
                }
                if (value.getOption_leg_3() != null) {
                    size += OptionsContext.OptionLeg.ADAPTER.encodedSizeWithTag(8, value.getOption_leg_3());
                }
                if (value.getOption_leg_4() != null) {
                    size += OptionsContext.OptionLeg.ADAPTER.encodedSizeWithTag(9, value.getOption_leg_4());
                }
                if (!Intrinsics.areEqual(value.getMarketability_request_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getMarketability_request_id());
                }
                if (value.getOption_order_type() != OptionsContext.OptionOrderType.UNKNOWN) {
                    size += OptionsContext.OptionOrderType.ADAPTER.encodedSizeWithTag(11, value.getOption_order_type());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getSource());
                }
                return !Intrinsics.areEqual(value.getAdditional_context(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(13, value.getAdditional_context()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOption_chain_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOption_chain_id());
                }
                if (!Intrinsics.areEqual(value.getOption_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOption_order_id());
                }
                if (value.getMarketability() != MarketabilityType.MARKETABILITY_UNSPECIFIED) {
                    MarketabilityType.ADAPTER.encodeWithTag(writer, 3, (int) value.getMarketability());
                }
                if (!Intrinsics.areEqual(value.getOption_order_ref_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOption_order_ref_id());
                }
                if (value.getStrategy() != StrategyName.STRATEGY_NAME_UNSPECIFIED) {
                    StrategyName.ADAPTER.encodeWithTag(writer, 5, (int) value.getStrategy());
                }
                if (value.getOption_leg_1() != null) {
                    OptionsContext.OptionLeg.ADAPTER.encodeWithTag(writer, 6, (int) value.getOption_leg_1());
                }
                if (value.getOption_leg_2() != null) {
                    OptionsContext.OptionLeg.ADAPTER.encodeWithTag(writer, 7, (int) value.getOption_leg_2());
                }
                if (value.getOption_leg_3() != null) {
                    OptionsContext.OptionLeg.ADAPTER.encodeWithTag(writer, 8, (int) value.getOption_leg_3());
                }
                if (value.getOption_leg_4() != null) {
                    OptionsContext.OptionLeg.ADAPTER.encodeWithTag(writer, 9, (int) value.getOption_leg_4());
                }
                if (!Intrinsics.areEqual(value.getMarketability_request_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getMarketability_request_id());
                }
                if (value.getOption_order_type() != OptionsContext.OptionOrderType.UNKNOWN) {
                    OptionsContext.OptionOrderType.ADAPTER.encodeWithTag(writer, 11, (int) value.getOption_order_type());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getAdditional_context(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getAdditional_context());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAdditional_context(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getAdditional_context());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSource());
                }
                if (value.getOption_order_type() != OptionsContext.OptionOrderType.UNKNOWN) {
                    OptionsContext.OptionOrderType.ADAPTER.encodeWithTag(writer, 11, (int) value.getOption_order_type());
                }
                if (!Intrinsics.areEqual(value.getMarketability_request_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getMarketability_request_id());
                }
                if (value.getOption_leg_4() != null) {
                    OptionsContext.OptionLeg.ADAPTER.encodeWithTag(writer, 9, (int) value.getOption_leg_4());
                }
                if (value.getOption_leg_3() != null) {
                    OptionsContext.OptionLeg.ADAPTER.encodeWithTag(writer, 8, (int) value.getOption_leg_3());
                }
                if (value.getOption_leg_2() != null) {
                    OptionsContext.OptionLeg.ADAPTER.encodeWithTag(writer, 7, (int) value.getOption_leg_2());
                }
                if (value.getOption_leg_1() != null) {
                    OptionsContext.OptionLeg.ADAPTER.encodeWithTag(writer, 6, (int) value.getOption_leg_1());
                }
                if (value.getStrategy() != StrategyName.STRATEGY_NAME_UNSPECIFIED) {
                    StrategyName.ADAPTER.encodeWithTag(writer, 5, (int) value.getStrategy());
                }
                if (!Intrinsics.areEqual(value.getOption_order_ref_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOption_order_ref_id());
                }
                if (value.getMarketability() != MarketabilityType.MARKETABILITY_UNSPECIFIED) {
                    MarketabilityType.ADAPTER.encodeWithTag(writer, 3, (int) value.getMarketability());
                }
                if (!Intrinsics.areEqual(value.getOption_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOption_order_id());
                }
                if (Intrinsics.areEqual(value.getOption_chain_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOption_chain_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionsContext decode(ProtoReader reader) throws IOException {
                StrategyName strategyName;
                OptionsContext.OptionOrderType optionOrderType;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                MarketabilityType marketabilityType = MarketabilityType.MARKETABILITY_UNSPECIFIED;
                StrategyName strategyName2 = StrategyName.STRATEGY_NAME_UNSPECIFIED;
                OptionsContext.OptionOrderType optionOrderType2 = OptionsContext.OptionOrderType.UNKNOWN;
                long jBeginMessage = reader.beginMessage();
                MarketabilityType marketabilityTypeDecode = marketabilityType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                OptionsContext.OptionLeg optionLegDecode = null;
                OptionsContext.OptionLeg optionLegDecode2 = null;
                OptionsContext.OptionLeg optionLegDecode3 = null;
                OptionsContext.OptionLeg optionLegDecode4 = null;
                OptionsContext.OptionOrderType optionOrderTypeDecode = optionOrderType2;
                String strDecode6 = strDecode5;
                StrategyName strategyNameDecode = strategyName2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strategyName = strategyNameDecode;
                                optionOrderType = optionOrderTypeDecode;
                                str = strDecode6;
                                try {
                                    marketabilityTypeDecode = MarketabilityType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                strategyNameDecode = strategyName;
                                strDecode6 = str;
                                optionOrderTypeDecode = optionOrderType;
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strategyName = strategyNameDecode;
                                optionOrderType = optionOrderTypeDecode;
                                str = strDecode6;
                                try {
                                    strategyNameDecode = StrategyName.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode6 = str;
                                optionOrderTypeDecode = optionOrderType;
                                break;
                            case 6:
                                optionLegDecode = OptionsContext.OptionLeg.ADAPTER.decode(reader);
                                break;
                            case 7:
                                optionLegDecode2 = OptionsContext.OptionLeg.ADAPTER.decode(reader);
                                break;
                            case 8:
                                optionLegDecode3 = OptionsContext.OptionLeg.ADAPTER.decode(reader);
                                break;
                            case 9:
                                optionLegDecode4 = OptionsContext.OptionLeg.ADAPTER.decode(reader);
                                break;
                            case 10:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                try {
                                    optionOrderTypeDecode = OptionsContext.OptionOrderType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    strategyName = strategyNameDecode;
                                    optionOrderType = optionOrderTypeDecode;
                                    str = strDecode6;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 12:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                strategyName = strategyNameDecode;
                                optionOrderType = optionOrderTypeDecode;
                                str = strDecode6;
                                strategyNameDecode = strategyName;
                                strDecode6 = str;
                                optionOrderTypeDecode = optionOrderType;
                                break;
                        }
                    } else {
                        return new OptionsContext(strDecode6, strDecode, marketabilityTypeDecode, strDecode2, strategyNameDecode, optionLegDecode, optionLegDecode2, optionLegDecode3, optionLegDecode4, strDecode3, optionOrderTypeDecode, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionsContext redact(OptionsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                OptionsContext.OptionLeg option_leg_1 = value.getOption_leg_1();
                OptionsContext.OptionLeg optionLegRedact = option_leg_1 != null ? OptionsContext.OptionLeg.ADAPTER.redact(option_leg_1) : null;
                OptionsContext.OptionLeg option_leg_2 = value.getOption_leg_2();
                OptionsContext.OptionLeg optionLegRedact2 = option_leg_2 != null ? OptionsContext.OptionLeg.ADAPTER.redact(option_leg_2) : null;
                OptionsContext.OptionLeg option_leg_3 = value.getOption_leg_3();
                OptionsContext.OptionLeg optionLegRedact3 = option_leg_3 != null ? OptionsContext.OptionLeg.ADAPTER.redact(option_leg_3) : null;
                OptionsContext.OptionLeg option_leg_4 = value.getOption_leg_4();
                return value.copy((7711 & 1) != 0 ? value.option_chain_id : null, (7711 & 2) != 0 ? value.option_order_id : null, (7711 & 4) != 0 ? value.marketability : null, (7711 & 8) != 0 ? value.option_order_ref_id : null, (7711 & 16) != 0 ? value.strategy : null, (7711 & 32) != 0 ? value.option_leg_1 : optionLegRedact, (7711 & 64) != 0 ? value.option_leg_2 : optionLegRedact2, (7711 & 128) != 0 ? value.option_leg_3 : optionLegRedact3, (7711 & 256) != 0 ? value.option_leg_4 : option_leg_4 != null ? OptionsContext.OptionLeg.ADAPTER.redact(option_leg_4) : null, (7711 & 512) != 0 ? value.marketability_request_id : null, (7711 & 1024) != 0 ? value.option_order_type : null, (7711 & 2048) != 0 ? value.source : null, (7711 & 4096) != 0 ? value.additional_context : null, (7711 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* compiled from: OptionsContext.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionLeg;", "Lcom/squareup/wire/Message;", "", "option_instrument_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getOption_instrument_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionLeg extends Message {

        @JvmField
        public static final ProtoAdapter<OptionLeg> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "optionInstrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String option_instrument_id;

        /* JADX WARN: Multi-variable type inference failed */
        public OptionLeg() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24446newBuilder();
        }

        public final String getOption_instrument_id() {
            return this.option_instrument_id;
        }

        public /* synthetic */ OptionLeg(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionLeg(String option_instrument_id, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(option_instrument_id, "option_instrument_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.option_instrument_id = option_instrument_id;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24446newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OptionLeg)) {
                return false;
            }
            OptionLeg optionLeg = (OptionLeg) other;
            return Intrinsics.areEqual(unknownFields(), optionLeg.unknownFields()) && Intrinsics.areEqual(this.option_instrument_id, optionLeg.option_instrument_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.option_instrument_id.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("option_instrument_id=" + Internal.sanitize(this.option_instrument_id));
            return CollectionsKt.joinToString$default(arrayList, ", ", "OptionLeg{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ OptionLeg copy$default(OptionLeg optionLeg, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = optionLeg.option_instrument_id;
            }
            if ((i & 2) != 0) {
                byteString = optionLeg.unknownFields();
            }
            return optionLeg.copy(str, byteString);
        }

        public final OptionLeg copy(String option_instrument_id, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(option_instrument_id, "option_instrument_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new OptionLeg(option_instrument_id, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionLeg.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<OptionLeg>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionsContext$OptionLeg$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public OptionsContext.OptionLeg decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new OptionsContext.OptionLeg(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(OptionsContext.OptionLeg value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Intrinsics.areEqual(value.getOption_instrument_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOption_instrument_id()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, OptionsContext.OptionLeg value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getOption_instrument_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOption_instrument_id());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, OptionsContext.OptionLeg value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Intrinsics.areEqual(value.getOption_instrument_id(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOption_instrument_id());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public OptionsContext.OptionLeg redact(OptionsContext.OptionLeg value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return OptionsContext.OptionLeg.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionsContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "LIMIT", "STOP_LIMIT", "STOP_MARKET", "MARKET", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionOrderType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OptionOrderType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OptionOrderType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OptionOrderType LIMIT;
        public static final OptionOrderType MARKET;
        public static final OptionOrderType STOP_LIMIT;
        public static final OptionOrderType STOP_MARKET;
        public static final OptionOrderType UNKNOWN;
        private final int value;

        private static final /* synthetic */ OptionOrderType[] $values() {
            return new OptionOrderType[]{UNKNOWN, LIMIT, STOP_LIMIT, STOP_MARKET, MARKET};
        }

        @JvmStatic
        public static final OptionOrderType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OptionOrderType> getEntries() {
            return $ENTRIES;
        }

        private OptionOrderType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OptionOrderType optionOrderType = new OptionOrderType("UNKNOWN", 0, 0);
            UNKNOWN = optionOrderType;
            LIMIT = new OptionOrderType("LIMIT", 1, 1);
            STOP_LIMIT = new OptionOrderType("STOP_LIMIT", 2, 2);
            STOP_MARKET = new OptionOrderType("STOP_MARKET", 3, 3);
            MARKET = new OptionOrderType("MARKET", 4, 4);
            OptionOrderType[] optionOrderTypeArr$values = $values();
            $VALUES = optionOrderTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(optionOrderTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionOrderType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OptionOrderType>(orCreateKotlinClass, syntax, optionOrderType) { // from class: com.robinhood.rosetta.eventlogging.OptionsContext$OptionOrderType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public OptionsContext.OptionOrderType fromValue(int value) {
                    return OptionsContext.OptionOrderType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: OptionsContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OptionOrderType fromValue(int value) {
                if (value == 0) {
                    return OptionOrderType.UNKNOWN;
                }
                if (value == 1) {
                    return OptionOrderType.LIMIT;
                }
                if (value == 2) {
                    return OptionOrderType.STOP_LIMIT;
                }
                if (value == 3) {
                    return OptionOrderType.STOP_MARKET;
                }
                if (value != 4) {
                    return null;
                }
                return OptionOrderType.MARKET;
            }
        }

        public static OptionOrderType valueOf(String str) {
            return (OptionOrderType) Enum.valueOf(OptionOrderType.class, str);
        }

        public static OptionOrderType[] values() {
            return (OptionOrderType[]) $VALUES.clone();
        }
    }
}
