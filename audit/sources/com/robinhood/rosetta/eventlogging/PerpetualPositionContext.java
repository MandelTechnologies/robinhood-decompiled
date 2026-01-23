package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.PerpetualPositionContext;
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

/* compiled from: PerpetualPositionContext.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004CDEFBÙ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010;\u001a\u00020\u0002H\u0017J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\b\u0010@\u001a\u00020\u000bH\u0016J\b\u0010A\u001a\u00020\u0004H\u0016JØ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0016\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0016\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0016\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0016\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0016\u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0016\u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0016\u0010\u0015\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0016\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0016\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0016\u0010\u0018\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0016\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"¨\u0006G"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext;", "Lcom/squareup/wire/Message;", "", "position_id", "", "perpetual_contract_id", "side", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$PerpetualPositionSide;", "margin_mode", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$MarginMode;", "leverage", "", "quantity", "", "entry_price", "position_size", "initial_margin", "initial_margin_ratio", "maintenance_margin", "maintenance_margin_ratio", "unsettled_pnl", "pnl", "pnl_percentage", "estimated_liquidation_price", "total_allocated_margin", "open_position_quote_currency", "liquidation_risk", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk;", "fx_quote", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$PerpetualPositionSide;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$MarginMode;IDDDDDDDDDDDDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk;Ljava/lang/String;Lokio/ByteString;)V", "getPosition_id", "()Ljava/lang/String;", "getPerpetual_contract_id", "getSide", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$PerpetualPositionSide;", "getMargin_mode", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$MarginMode;", "getLeverage", "()I", "getQuantity", "()D", "getEntry_price", "getPosition_size", "getInitial_margin", "getInitial_margin_ratio", "getMaintenance_margin", "getMaintenance_margin_ratio", "getUnsettled_pnl", "getPnl", "getPnl_percentage", "getEstimated_liquidation_price", "getTotal_allocated_margin", "getOpen_position_quote_currency", "getLiquidation_risk", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk;", "getFx_quote", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "PerpetualPositionSide", "MarginMode", "LiquidationRisk", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PerpetualPositionContext extends Message {

    @JvmField
    public static final ProtoAdapter<PerpetualPositionContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "entryPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double entry_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "estimatedLiquidationPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final double estimated_liquidation_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fxQuote", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 21)
    private final String fx_quote;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "initialMargin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final double initial_margin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "initialMarginRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final double initial_margin_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int leverage;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualPositionContext$LiquidationRisk#ADAPTER", jsonName = "liquidationRisk", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 20)
    private final LiquidationRisk liquidation_risk;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "maintenanceMargin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final double maintenance_margin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "maintenanceMarginRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final double maintenance_margin_ratio;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualPositionContext$MarginMode#ADAPTER", jsonName = "marginMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final MarginMode margin_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "openPositionQuoteCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 19)
    private final String open_position_quote_currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "perpetualContractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String perpetual_contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final double pnl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "pnlPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final double pnl_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "positionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String position_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "positionSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final double position_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double quantity;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualPositionContext$PerpetualPositionSide#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PerpetualPositionSide side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalAllocatedMargin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final double total_allocated_margin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "unsettledPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final double unsettled_pnl;

    public PerpetualPositionContext() {
        this(null, null, null, null, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, null, 2097151, null);
    }

    public /* synthetic */ PerpetualPositionContext(String str, String str2, PerpetualPositionSide perpetualPositionSide, MarginMode marginMode, int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, String str3, LiquidationRisk liquidationRisk, String str4, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? PerpetualPositionSide.POSITION_SIDE_UNSPECIFIED : perpetualPositionSide, (i2 & 8) != 0 ? MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? 0.0d : d, (i2 & 64) != 0 ? 0.0d : d2, (i2 & 128) != 0 ? 0.0d : d3, (i2 & 256) != 0 ? 0.0d : d4, (i2 & 512) != 0 ? 0.0d : d5, (i2 & 1024) != 0 ? 0.0d : d6, (i2 & 2048) != 0 ? 0.0d : d7, (i2 & 4096) != 0 ? 0.0d : d8, (i2 & 8192) != 0 ? 0.0d : d9, (i2 & 16384) != 0 ? 0.0d : d10, (32768 & i2) != 0 ? 0.0d : d11, (65536 & i2) == 0 ? d12 : 0.0d, (131072 & i2) != 0 ? "" : str3, (i2 & 262144) != 0 ? LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED : liquidationRisk, (i2 & 524288) == 0 ? str4 : "", (i2 & 1048576) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24493newBuilder();
    }

    public final String getPosition_id() {
        return this.position_id;
    }

    public final String getPerpetual_contract_id() {
        return this.perpetual_contract_id;
    }

    public final PerpetualPositionSide getSide() {
        return this.side;
    }

    public final MarginMode getMargin_mode() {
        return this.margin_mode;
    }

    public final int getLeverage() {
        return this.leverage;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public final double getEntry_price() {
        return this.entry_price;
    }

    public final double getPosition_size() {
        return this.position_size;
    }

    public final double getInitial_margin() {
        return this.initial_margin;
    }

    public final double getInitial_margin_ratio() {
        return this.initial_margin_ratio;
    }

    public final double getMaintenance_margin() {
        return this.maintenance_margin;
    }

    public final double getMaintenance_margin_ratio() {
        return this.maintenance_margin_ratio;
    }

    public final double getUnsettled_pnl() {
        return this.unsettled_pnl;
    }

    public final double getPnl() {
        return this.pnl;
    }

    public final double getPnl_percentage() {
        return this.pnl_percentage;
    }

    public final double getEstimated_liquidation_price() {
        return this.estimated_liquidation_price;
    }

    public final double getTotal_allocated_margin() {
        return this.total_allocated_margin;
    }

    public final String getOpen_position_quote_currency() {
        return this.open_position_quote_currency;
    }

    public final LiquidationRisk getLiquidation_risk() {
        return this.liquidation_risk;
    }

    public final String getFx_quote() {
        return this.fx_quote;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualPositionContext(String position_id, String perpetual_contract_id, PerpetualPositionSide side, MarginMode margin_mode, int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, String open_position_quote_currency, LiquidationRisk liquidation_risk, String fx_quote, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(position_id, "position_id");
        Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(open_position_quote_currency, "open_position_quote_currency");
        Intrinsics.checkNotNullParameter(liquidation_risk, "liquidation_risk");
        Intrinsics.checkNotNullParameter(fx_quote, "fx_quote");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.position_id = position_id;
        this.perpetual_contract_id = perpetual_contract_id;
        this.side = side;
        this.margin_mode = margin_mode;
        this.leverage = i;
        this.quantity = d;
        this.entry_price = d2;
        this.position_size = d3;
        this.initial_margin = d4;
        this.initial_margin_ratio = d5;
        this.maintenance_margin = d6;
        this.maintenance_margin_ratio = d7;
        this.unsettled_pnl = d8;
        this.pnl = d9;
        this.pnl_percentage = d10;
        this.estimated_liquidation_price = d11;
        this.total_allocated_margin = d12;
        this.open_position_quote_currency = open_position_quote_currency;
        this.liquidation_risk = liquidation_risk;
        this.fx_quote = fx_quote;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24493newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerpetualPositionContext)) {
            return false;
        }
        PerpetualPositionContext perpetualPositionContext = (PerpetualPositionContext) other;
        return Intrinsics.areEqual(unknownFields(), perpetualPositionContext.unknownFields()) && Intrinsics.areEqual(this.position_id, perpetualPositionContext.position_id) && Intrinsics.areEqual(this.perpetual_contract_id, perpetualPositionContext.perpetual_contract_id) && this.side == perpetualPositionContext.side && this.margin_mode == perpetualPositionContext.margin_mode && this.leverage == perpetualPositionContext.leverage && this.quantity == perpetualPositionContext.quantity && this.entry_price == perpetualPositionContext.entry_price && this.position_size == perpetualPositionContext.position_size && this.initial_margin == perpetualPositionContext.initial_margin && this.initial_margin_ratio == perpetualPositionContext.initial_margin_ratio && this.maintenance_margin == perpetualPositionContext.maintenance_margin && this.maintenance_margin_ratio == perpetualPositionContext.maintenance_margin_ratio && this.unsettled_pnl == perpetualPositionContext.unsettled_pnl && this.pnl == perpetualPositionContext.pnl && this.pnl_percentage == perpetualPositionContext.pnl_percentage && this.estimated_liquidation_price == perpetualPositionContext.estimated_liquidation_price && this.total_allocated_margin == perpetualPositionContext.total_allocated_margin && Intrinsics.areEqual(this.open_position_quote_currency, perpetualPositionContext.open_position_quote_currency) && this.liquidation_risk == perpetualPositionContext.liquidation_risk && Intrinsics.areEqual(this.fx_quote, perpetualPositionContext.fx_quote);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.position_id.hashCode()) * 37) + this.perpetual_contract_id.hashCode()) * 37) + this.side.hashCode()) * 37) + this.margin_mode.hashCode()) * 37) + Integer.hashCode(this.leverage)) * 37) + Double.hashCode(this.quantity)) * 37) + Double.hashCode(this.entry_price)) * 37) + Double.hashCode(this.position_size)) * 37) + Double.hashCode(this.initial_margin)) * 37) + Double.hashCode(this.initial_margin_ratio)) * 37) + Double.hashCode(this.maintenance_margin)) * 37) + Double.hashCode(this.maintenance_margin_ratio)) * 37) + Double.hashCode(this.unsettled_pnl)) * 37) + Double.hashCode(this.pnl)) * 37) + Double.hashCode(this.pnl_percentage)) * 37) + Double.hashCode(this.estimated_liquidation_price)) * 37) + Double.hashCode(this.total_allocated_margin)) * 37) + this.open_position_quote_currency.hashCode()) * 37) + this.liquidation_risk.hashCode()) * 37) + this.fx_quote.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("position_id=" + Internal.sanitize(this.position_id));
        arrayList.add("perpetual_contract_id=" + Internal.sanitize(this.perpetual_contract_id));
        arrayList.add("side=" + this.side);
        arrayList.add("margin_mode=" + this.margin_mode);
        arrayList.add("leverage=" + this.leverage);
        arrayList.add("quantity=" + this.quantity);
        arrayList.add("entry_price=" + this.entry_price);
        arrayList.add("position_size=" + this.position_size);
        arrayList.add("initial_margin=" + this.initial_margin);
        arrayList.add("initial_margin_ratio=" + this.initial_margin_ratio);
        arrayList.add("maintenance_margin=" + this.maintenance_margin);
        arrayList.add("maintenance_margin_ratio=" + this.maintenance_margin_ratio);
        arrayList.add("unsettled_pnl=" + this.unsettled_pnl);
        arrayList.add("pnl=" + this.pnl);
        arrayList.add("pnl_percentage=" + this.pnl_percentage);
        arrayList.add("estimated_liquidation_price=" + this.estimated_liquidation_price);
        arrayList.add("total_allocated_margin=" + this.total_allocated_margin);
        arrayList.add("open_position_quote_currency=" + Internal.sanitize(this.open_position_quote_currency));
        arrayList.add("liquidation_risk=" + this.liquidation_risk);
        arrayList.add("fx_quote=" + Internal.sanitize(this.fx_quote));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerpetualPositionContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PerpetualPositionContext copy$default(PerpetualPositionContext perpetualPositionContext, String str, String str2, PerpetualPositionSide perpetualPositionSide, MarginMode marginMode, int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, String str3, LiquidationRisk liquidationRisk, String str4, ByteString byteString, int i2, Object obj) {
        String str5 = (i2 & 1) != 0 ? perpetualPositionContext.position_id : str;
        String str6 = (i2 & 2) != 0 ? perpetualPositionContext.perpetual_contract_id : str2;
        return perpetualPositionContext.copy(str5, str6, (i2 & 4) != 0 ? perpetualPositionContext.side : perpetualPositionSide, (i2 & 8) != 0 ? perpetualPositionContext.margin_mode : marginMode, (i2 & 16) != 0 ? perpetualPositionContext.leverage : i, (i2 & 32) != 0 ? perpetualPositionContext.quantity : d, (i2 & 64) != 0 ? perpetualPositionContext.entry_price : d2, (i2 & 128) != 0 ? perpetualPositionContext.position_size : d3, (i2 & 256) != 0 ? perpetualPositionContext.initial_margin : d4, (i2 & 512) != 0 ? perpetualPositionContext.initial_margin_ratio : d5, (i2 & 1024) != 0 ? perpetualPositionContext.maintenance_margin : d6, (i2 & 2048) != 0 ? perpetualPositionContext.maintenance_margin_ratio : d7, (i2 & 4096) != 0 ? perpetualPositionContext.unsettled_pnl : d8, (i2 & 8192) != 0 ? perpetualPositionContext.pnl : d9, (i2 & 16384) != 0 ? perpetualPositionContext.pnl_percentage : d10, (i2 & 32768) != 0 ? perpetualPositionContext.estimated_liquidation_price : d11, (i2 & 65536) != 0 ? perpetualPositionContext.total_allocated_margin : d12, (i2 & 131072) != 0 ? perpetualPositionContext.open_position_quote_currency : str3, (i2 & 262144) != 0 ? perpetualPositionContext.liquidation_risk : liquidationRisk, (i2 & 524288) != 0 ? perpetualPositionContext.fx_quote : str4, (i2 & 1048576) != 0 ? perpetualPositionContext.unknownFields() : byteString);
    }

    public final PerpetualPositionContext copy(String position_id, String perpetual_contract_id, PerpetualPositionSide side, MarginMode margin_mode, int leverage, double quantity, double entry_price, double position_size, double initial_margin, double initial_margin_ratio, double maintenance_margin, double maintenance_margin_ratio, double unsettled_pnl, double pnl, double pnl_percentage, double estimated_liquidation_price, double total_allocated_margin, String open_position_quote_currency, LiquidationRisk liquidation_risk, String fx_quote, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(position_id, "position_id");
        Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(open_position_quote_currency, "open_position_quote_currency");
        Intrinsics.checkNotNullParameter(liquidation_risk, "liquidation_risk");
        Intrinsics.checkNotNullParameter(fx_quote, "fx_quote");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PerpetualPositionContext(position_id, perpetual_contract_id, side, margin_mode, leverage, quantity, entry_price, position_size, initial_margin, initial_margin_ratio, maintenance_margin, maintenance_margin_ratio, unsettled_pnl, pnl, pnl_percentage, estimated_liquidation_price, total_allocated_margin, open_position_quote_currency, liquidation_risk, fx_quote, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerpetualPositionContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PerpetualPositionContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerpetualPositionContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PerpetualPositionContext value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPosition_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPosition_id());
                }
                if (!Intrinsics.areEqual(value.getPerpetual_contract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPerpetual_contract_id());
                }
                if (value.getSide() != PerpetualPositionContext.PerpetualPositionSide.POSITION_SIDE_UNSPECIFIED) {
                    size += PerpetualPositionContext.PerpetualPositionSide.ADAPTER.encodedSizeWithTag(3, value.getSide());
                }
                if (value.getMargin_mode() != PerpetualPositionContext.MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    size += PerpetualPositionContext.MarginMode.ADAPTER.encodedSizeWithTag(4, value.getMargin_mode());
                }
                if (value.getLeverage() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getLeverage()));
                }
                if (!Double.valueOf(value.getQuantity()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getQuantity()));
                }
                if (!Double.valueOf(value.getEntry_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getEntry_price()));
                }
                if (!Double.valueOf(value.getPosition_size()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(8, Double.valueOf(value.getPosition_size()));
                }
                if (!Double.valueOf(value.getInitial_margin()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(9, Double.valueOf(value.getInitial_margin()));
                }
                if (!Double.valueOf(value.getInitial_margin_ratio()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(10, Double.valueOf(value.getInitial_margin_ratio()));
                }
                if (!Double.valueOf(value.getMaintenance_margin()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(11, Double.valueOf(value.getMaintenance_margin()));
                }
                if (!Double.valueOf(value.getMaintenance_margin_ratio()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(12, Double.valueOf(value.getMaintenance_margin_ratio()));
                }
                if (!Double.valueOf(value.getUnsettled_pnl()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(13, Double.valueOf(value.getUnsettled_pnl()));
                }
                if (!Double.valueOf(value.getPnl()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(14, Double.valueOf(value.getPnl()));
                }
                if (!Double.valueOf(value.getPnl_percentage()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(15, Double.valueOf(value.getPnl_percentage()));
                }
                if (!Double.valueOf(value.getEstimated_liquidation_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(16, Double.valueOf(value.getEstimated_liquidation_price()));
                }
                if (!Double.valueOf(value.getTotal_allocated_margin()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(17, Double.valueOf(value.getTotal_allocated_margin()));
                }
                if (!Intrinsics.areEqual(value.getOpen_position_quote_currency(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(19, value.getOpen_position_quote_currency());
                }
                if (value.getLiquidation_risk() != PerpetualPositionContext.LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED) {
                    size += PerpetualPositionContext.LiquidationRisk.ADAPTER.encodedSizeWithTag(20, value.getLiquidation_risk());
                }
                return !Intrinsics.areEqual(value.getFx_quote(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(21, value.getFx_quote()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PerpetualPositionContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPosition_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPosition_id());
                }
                if (!Intrinsics.areEqual(value.getPerpetual_contract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPerpetual_contract_id());
                }
                if (value.getSide() != PerpetualPositionContext.PerpetualPositionSide.POSITION_SIDE_UNSPECIFIED) {
                    PerpetualPositionContext.PerpetualPositionSide.ADAPTER.encodeWithTag(writer, 3, (int) value.getSide());
                }
                if (value.getMargin_mode() != PerpetualPositionContext.MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    PerpetualPositionContext.MarginMode.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_mode());
                }
                if (value.getLeverage() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getLeverage()));
                }
                if (!Double.valueOf(value.getQuantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getQuantity()));
                }
                if (!Double.valueOf(value.getEntry_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getEntry_price()));
                }
                if (!Double.valueOf(value.getPosition_size()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getPosition_size()));
                }
                if (!Double.valueOf(value.getInitial_margin()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getInitial_margin()));
                }
                if (!Double.valueOf(value.getInitial_margin_ratio()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) Double.valueOf(value.getInitial_margin_ratio()));
                }
                if (!Double.valueOf(value.getMaintenance_margin()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 11, (int) Double.valueOf(value.getMaintenance_margin()));
                }
                if (!Double.valueOf(value.getMaintenance_margin_ratio()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, (int) Double.valueOf(value.getMaintenance_margin_ratio()));
                }
                if (!Double.valueOf(value.getUnsettled_pnl()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getUnsettled_pnl()));
                }
                if (!Double.valueOf(value.getPnl()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 14, (int) Double.valueOf(value.getPnl()));
                }
                if (!Double.valueOf(value.getPnl_percentage()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 15, (int) Double.valueOf(value.getPnl_percentage()));
                }
                if (!Double.valueOf(value.getEstimated_liquidation_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, (int) Double.valueOf(value.getEstimated_liquidation_price()));
                }
                if (!Double.valueOf(value.getTotal_allocated_margin()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 17, (int) Double.valueOf(value.getTotal_allocated_margin()));
                }
                if (!Intrinsics.areEqual(value.getOpen_position_quote_currency(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getOpen_position_quote_currency());
                }
                if (value.getLiquidation_risk() != PerpetualPositionContext.LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED) {
                    PerpetualPositionContext.LiquidationRisk.ADAPTER.encodeWithTag(writer, 20, (int) value.getLiquidation_risk());
                }
                if (!Intrinsics.areEqual(value.getFx_quote(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getFx_quote());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PerpetualPositionContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFx_quote(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getFx_quote());
                }
                if (value.getLiquidation_risk() != PerpetualPositionContext.LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED) {
                    PerpetualPositionContext.LiquidationRisk.ADAPTER.encodeWithTag(writer, 20, (int) value.getLiquidation_risk());
                }
                if (!Intrinsics.areEqual(value.getOpen_position_quote_currency(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getOpen_position_quote_currency());
                }
                if (!Double.valueOf(value.getTotal_allocated_margin()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 17, (int) Double.valueOf(value.getTotal_allocated_margin()));
                }
                if (!Double.valueOf(value.getEstimated_liquidation_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, (int) Double.valueOf(value.getEstimated_liquidation_price()));
                }
                if (!Double.valueOf(value.getPnl_percentage()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 15, (int) Double.valueOf(value.getPnl_percentage()));
                }
                if (!Double.valueOf(value.getPnl()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 14, (int) Double.valueOf(value.getPnl()));
                }
                if (!Double.valueOf(value.getUnsettled_pnl()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getUnsettled_pnl()));
                }
                if (!Double.valueOf(value.getMaintenance_margin_ratio()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, (int) Double.valueOf(value.getMaintenance_margin_ratio()));
                }
                if (!Double.valueOf(value.getMaintenance_margin()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 11, (int) Double.valueOf(value.getMaintenance_margin()));
                }
                if (!Double.valueOf(value.getInitial_margin_ratio()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) Double.valueOf(value.getInitial_margin_ratio()));
                }
                if (!Double.valueOf(value.getInitial_margin()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getInitial_margin()));
                }
                if (!Double.valueOf(value.getPosition_size()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getPosition_size()));
                }
                if (!Double.valueOf(value.getEntry_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getEntry_price()));
                }
                if (!Double.valueOf(value.getQuantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getQuantity()));
                }
                if (value.getLeverage() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getLeverage()));
                }
                if (value.getMargin_mode() != PerpetualPositionContext.MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    PerpetualPositionContext.MarginMode.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_mode());
                }
                if (value.getSide() != PerpetualPositionContext.PerpetualPositionSide.POSITION_SIDE_UNSPECIFIED) {
                    PerpetualPositionContext.PerpetualPositionSide.ADAPTER.encodeWithTag(writer, 3, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getPerpetual_contract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPerpetual_contract_id());
                }
                if (Intrinsics.areEqual(value.getPosition_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPosition_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PerpetualPositionContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PerpetualPositionContext.PerpetualPositionSide perpetualPositionSideDecode = PerpetualPositionContext.PerpetualPositionSide.POSITION_SIDE_UNSPECIFIED;
                PerpetualPositionContext.MarginMode marginMode = PerpetualPositionContext.MarginMode.MARGIN_MODE_UNSPECIFIED;
                PerpetualPositionContext.LiquidationRisk liquidationRisk = PerpetualPositionContext.LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                double dDoubleValue5 = 0.0d;
                double dDoubleValue6 = 0.0d;
                double dDoubleValue7 = 0.0d;
                double dDoubleValue8 = 0.0d;
                double dDoubleValue9 = 0.0d;
                double dDoubleValue10 = 0.0d;
                double dDoubleValue11 = 0.0d;
                double dDoubleValue12 = 0.0d;
                PerpetualPositionContext.LiquidationRisk liquidationRiskDecode = liquidationRisk;
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                PerpetualPositionContext.MarginMode marginModeDecode = marginMode;
                while (true) {
                    PerpetualPositionContext.PerpetualPositionSide perpetualPositionSide = perpetualPositionSideDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    try {
                                        perpetualPositionSideDecode = PerpetualPositionContext.PerpetualPositionSide.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        marginModeDecode = PerpetualPositionContext.MarginMode.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 6:
                                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 7:
                                    dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 8:
                                    dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 9:
                                    dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 10:
                                    dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 11:
                                    dDoubleValue6 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 12:
                                    dDoubleValue7 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 13:
                                    dDoubleValue8 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 14:
                                    dDoubleValue9 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 15:
                                    dDoubleValue10 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 16:
                                    dDoubleValue11 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 17:
                                    dDoubleValue12 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 18:
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                                case 19:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 20:
                                    try {
                                        liquidationRiskDecode = PerpetualPositionContext.LiquidationRisk.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 21:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                            }
                        } else {
                            return new PerpetualPositionContext(strDecode2, strDecode3, perpetualPositionSide, marginModeDecode, iIntValue, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, dDoubleValue8, dDoubleValue9, dDoubleValue10, dDoubleValue11, dDoubleValue12, strDecode4, liquidationRiskDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerpetualPositionContext redact(PerpetualPositionContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PerpetualPositionContext.copy$default(value, null, null, null, null, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, ByteString.EMPTY, 1048575, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualPositionContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$PerpetualPositionSide;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "POSITION_SIDE_UNSPECIFIED", "LONG", "SHORT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PerpetualPositionSide implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PerpetualPositionSide[] $VALUES;

        @JvmField
        public static final ProtoAdapter<PerpetualPositionSide> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PerpetualPositionSide LONG;
        public static final PerpetualPositionSide POSITION_SIDE_UNSPECIFIED;
        public static final PerpetualPositionSide SHORT;
        private final int value;

        private static final /* synthetic */ PerpetualPositionSide[] $values() {
            return new PerpetualPositionSide[]{POSITION_SIDE_UNSPECIFIED, LONG, SHORT};
        }

        @JvmStatic
        public static final PerpetualPositionSide fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<PerpetualPositionSide> getEntries() {
            return $ENTRIES;
        }

        private PerpetualPositionSide(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final PerpetualPositionSide perpetualPositionSide = new PerpetualPositionSide("POSITION_SIDE_UNSPECIFIED", 0, 0);
            POSITION_SIDE_UNSPECIFIED = perpetualPositionSide;
            LONG = new PerpetualPositionSide("LONG", 1, 1);
            SHORT = new PerpetualPositionSide("SHORT", 2, 2);
            PerpetualPositionSide[] perpetualPositionSideArr$values = $values();
            $VALUES = perpetualPositionSideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(perpetualPositionSideArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerpetualPositionSide.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<PerpetualPositionSide>(orCreateKotlinClass, syntax, perpetualPositionSide) { // from class: com.robinhood.rosetta.eventlogging.PerpetualPositionContext$PerpetualPositionSide$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerpetualPositionContext.PerpetualPositionSide fromValue(int value) {
                    return PerpetualPositionContext.PerpetualPositionSide.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerpetualPositionContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$PerpetualPositionSide$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$PerpetualPositionSide;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final PerpetualPositionSide fromValue(int value) {
                if (value == 0) {
                    return PerpetualPositionSide.POSITION_SIDE_UNSPECIFIED;
                }
                if (value == 1) {
                    return PerpetualPositionSide.LONG;
                }
                if (value != 2) {
                    return null;
                }
                return PerpetualPositionSide.SHORT;
            }
        }

        public static PerpetualPositionSide valueOf(String str) {
            return (PerpetualPositionSide) Enum.valueOf(PerpetualPositionSide.class, str);
        }

        public static PerpetualPositionSide[] values() {
            return (PerpetualPositionSide[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualPositionContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$MarginMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MARGIN_MODE_UNSPECIFIED", "ISOLATED", "CROSS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MarginMode implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MarginMode[] $VALUES;

        @JvmField
        public static final ProtoAdapter<MarginMode> ADAPTER;
        public static final MarginMode CROSS;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final MarginMode ISOLATED;
        public static final MarginMode MARGIN_MODE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ MarginMode[] $values() {
            return new MarginMode[]{MARGIN_MODE_UNSPECIFIED, ISOLATED, CROSS};
        }

        @JvmStatic
        public static final MarginMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<MarginMode> getEntries() {
            return $ENTRIES;
        }

        private MarginMode(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final MarginMode marginMode = new MarginMode("MARGIN_MODE_UNSPECIFIED", 0, 0);
            MARGIN_MODE_UNSPECIFIED = marginMode;
            ISOLATED = new MarginMode("ISOLATED", 1, 1);
            CROSS = new MarginMode("CROSS", 2, 2);
            MarginMode[] marginModeArr$values = $values();
            $VALUES = marginModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(marginModeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginMode.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<MarginMode>(orCreateKotlinClass, syntax, marginMode) { // from class: com.robinhood.rosetta.eventlogging.PerpetualPositionContext$MarginMode$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerpetualPositionContext.MarginMode fromValue(int value) {
                    return PerpetualPositionContext.MarginMode.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerpetualPositionContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$MarginMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$MarginMode;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final MarginMode fromValue(int value) {
                if (value == 0) {
                    return MarginMode.MARGIN_MODE_UNSPECIFIED;
                }
                if (value == 1) {
                    return MarginMode.ISOLATED;
                }
                if (value != 2) {
                    return null;
                }
                return MarginMode.CROSS;
            }
        }

        public static MarginMode valueOf(String str) {
            return (MarginMode) Enum.valueOf(MarginMode.class, str);
        }

        public static MarginMode[] values() {
            return (MarginMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualPositionContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LIQUIDATION_RISK_UNSPECIFIED", "NO_RISK", "AT_RISK", "HIGH_RISK", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LiquidationRisk implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LiquidationRisk[] $VALUES;

        @JvmField
        public static final ProtoAdapter<LiquidationRisk> ADAPTER;
        public static final LiquidationRisk AT_RISK;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final LiquidationRisk HIGH_RISK;
        public static final LiquidationRisk LIQUIDATION_RISK_UNSPECIFIED;
        public static final LiquidationRisk NO_RISK;
        private final int value;

        private static final /* synthetic */ LiquidationRisk[] $values() {
            return new LiquidationRisk[]{LIQUIDATION_RISK_UNSPECIFIED, NO_RISK, AT_RISK, HIGH_RISK};
        }

        @JvmStatic
        public static final LiquidationRisk fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<LiquidationRisk> getEntries() {
            return $ENTRIES;
        }

        private LiquidationRisk(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final LiquidationRisk liquidationRisk = new LiquidationRisk("LIQUIDATION_RISK_UNSPECIFIED", 0, 0);
            LIQUIDATION_RISK_UNSPECIFIED = liquidationRisk;
            NO_RISK = new LiquidationRisk("NO_RISK", 1, 1);
            AT_RISK = new LiquidationRisk("AT_RISK", 2, 2);
            HIGH_RISK = new LiquidationRisk("HIGH_RISK", 3, 3);
            LiquidationRisk[] liquidationRiskArr$values = $values();
            $VALUES = liquidationRiskArr$values;
            $ENTRIES = EnumEntries2.enumEntries(liquidationRiskArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LiquidationRisk.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<LiquidationRisk>(orCreateKotlinClass, syntax, liquidationRisk) { // from class: com.robinhood.rosetta.eventlogging.PerpetualPositionContext$LiquidationRisk$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerpetualPositionContext.LiquidationRisk fromValue(int value) {
                    return PerpetualPositionContext.LiquidationRisk.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerpetualPositionContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final LiquidationRisk fromValue(int value) {
                if (value == 0) {
                    return LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED;
                }
                if (value == 1) {
                    return LiquidationRisk.NO_RISK;
                }
                if (value == 2) {
                    return LiquidationRisk.AT_RISK;
                }
                if (value != 3) {
                    return null;
                }
                return LiquidationRisk.HIGH_RISK;
            }
        }

        public static LiquidationRisk valueOf(String str) {
            return (LiquidationRisk) Enum.valueOf(LiquidationRisk.class, str);
        }

        public static LiquidationRisk[] values() {
            return (LiquidationRisk[]) $VALUES.clone();
        }
    }
}
