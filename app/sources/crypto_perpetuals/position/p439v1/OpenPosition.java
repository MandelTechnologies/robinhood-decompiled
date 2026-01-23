package crypto_perpetuals.position.p439v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.FXQuote;
import crypto_perpetuals.common.p435v1.MarginMode;
import crypto_perpetuals.common.p435v1.Money;
import crypto_perpetuals.common.p435v1.Side;
import crypto_perpetuals.currency.p437v1.Currency;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: OpenPosition.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b6\u0018\u0000 j2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001jBÑ\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\u0010\b\u0002\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0017¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100H\u0096\u0002¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0003H\u0016¢\u0006\u0004\b8\u00109J×\u0002\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0010\b\u0002\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'2\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u00109R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b>\u00109R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\bE\u00109R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bF\u00109R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bG\u00109R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bK\u00109R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bL\u00109R\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bM\u00109R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bN\u00109R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\bO\u00109R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bP\u0010JR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bQ\u0010JR\u001a\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\bR\u00109R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\bS\u00109R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010<\u001a\u0004\bW\u00109R\u001a\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010<\u001a\u0004\bX\u00109R\u001a\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010<\u001a\u0004\bY\u00109R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010H\u001a\u0004\bZ\u0010JR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010!\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010^\u001a\u0004\b_\u0010`R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010T\u001a\u0004\ba\u0010VR\u001c\u0010#\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010H\u001a\u0004\bb\u0010JR\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010c\u001a\u0004\bd\u0010eR\"\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010)\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010<\u001a\u0004\bi\u00109¨\u0006k"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/OpenPosition;", "Lcom/squareup/wire/Message;", "", "", "id", "contract_id", "Lcrypto_perpetuals/common/v1/Side;", "side", "Lcrypto_perpetuals/common/v1/MarginMode;", "margin_mode", "leverage", "quantity", "entry_price", "Lcrypto_perpetuals/common/v1/Money;", "pnl_settled", "initial_margin", "initial_margin_ratio", "maintenance_margin", "maintenance_margin_ratio", "estimated_liquidation_price", "pnl_realized", "pnl_unrealized", "pnl_percentage", "collateral_reserved", "Lcrypto_perpetuals/currency/v1/Currency;", "collateral_currency", "total_allocated_margin", "position_size", "mark_price", "pnl", "Lcrypto_perpetuals/position/v1/EstimatedClosingFees;", "estimated_closing_fees", "Lcrypto_perpetuals/position/v1/LiquidationRisk;", "liquidation_risk", "quote_currency", "pnl_unsettled", "Lcrypto_perpetuals/common/v1/FXQuote;", "fx_quote", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "implied_leverage", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Side;Lcrypto_perpetuals/common/v1/MarginMode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/currency/v1/Currency;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/position/v1/EstimatedClosingFees;Lcrypto_perpetuals/position/v1/LiquidationRisk;Lcrypto_perpetuals/currency/v1/Currency;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/FXQuote;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Side;Lcrypto_perpetuals/common/v1/MarginMode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/currency/v1/Currency;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/position/v1/EstimatedClosingFees;Lcrypto_perpetuals/position/v1/LiquidationRisk;Lcrypto_perpetuals/currency/v1/Currency;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/FXQuote;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)Lcrypto_perpetuals/position/v1/OpenPosition;", "Ljava/lang/String;", "getId", "getContract_id", "Lcrypto_perpetuals/common/v1/Side;", "getSide", "()Lcrypto_perpetuals/common/v1/Side;", "Lcrypto_perpetuals/common/v1/MarginMode;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginMode;", "getLeverage", "getQuantity", "getEntry_price", "Lcrypto_perpetuals/common/v1/Money;", "getPnl_settled", "()Lcrypto_perpetuals/common/v1/Money;", "getInitial_margin", "getInitial_margin_ratio", "getMaintenance_margin", "getMaintenance_margin_ratio", "getEstimated_liquidation_price", "getPnl_realized", "getPnl_unrealized", "getPnl_percentage", "getCollateral_reserved", "Lcrypto_perpetuals/currency/v1/Currency;", "getCollateral_currency", "()Lcrypto_perpetuals/currency/v1/Currency;", "getTotal_allocated_margin", "getPosition_size", "getMark_price", "getPnl", "Lcrypto_perpetuals/position/v1/EstimatedClosingFees;", "getEstimated_closing_fees", "()Lcrypto_perpetuals/position/v1/EstimatedClosingFees;", "Lcrypto_perpetuals/position/v1/LiquidationRisk;", "getLiquidation_risk", "()Lcrypto_perpetuals/position/v1/LiquidationRisk;", "getQuote_currency", "getPnl_unsettled", "Lcrypto_perpetuals/common/v1/FXQuote;", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuote;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getImplied_leverage", "Companion", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OpenPosition extends Message {

    @JvmField
    public static final ProtoAdapter<OpenPosition> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.currency.v1.Currency#ADAPTER", jsonName = "collateralCurrency", schemaIndex = 17, tag = 18)
    private final Currency collateral_currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "collateralReserved", schemaIndex = 16, tag = 17)
    private final String collateral_reserved;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 28)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entryPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String entry_price;

    @WireField(adapter = "crypto_perpetuals.position.v1.EstimatedClosingFees#ADAPTER", jsonName = "estimatedClosingFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final EstimatedClosingFees estimated_closing_fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedLiquidationPrice", schemaIndex = 12, tag = 13)
    private final String estimated_liquidation_price;

    @WireField(adapter = "crypto_perpetuals.common.v1.FXQuote#ADAPTER", jsonName = "fxQuote", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 27)
    private final FXQuote fx_quote;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "impliedLeverage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 29)
    private final String implied_leverage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "initialMargin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String initial_margin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "initialMarginRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String initial_margin_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String leverage;

    @WireField(adapter = "crypto_perpetuals.position.v1.LiquidationRisk#ADAPTER", jsonName = "liquidationRisk", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final LiquidationRisk liquidation_risk;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maintenanceMargin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String maintenance_margin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maintenanceMarginRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String maintenance_margin_ratio;

    @WireField(adapter = "crypto_perpetuals.common.v1.MarginMode#ADAPTER", jsonName = "marginMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final MarginMode margin_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "markPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final String mark_price;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final Money pnl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pnlPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String pnl_percentage;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "pnlRealized", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final Money pnl_realized;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "pnlSettled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Money pnl_settled;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "pnlUnrealized", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final Money pnl_unrealized;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "pnlUnsettled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final Money pnl_unsettled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "positionSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final String position_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String quantity;

    @WireField(adapter = "crypto_perpetuals.currency.v1.Currency#ADAPTER", jsonName = "quoteCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final Currency quote_currency;

    @WireField(adapter = "crypto_perpetuals.common.v1.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Side side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalAllocatedMargin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String total_allocated_margin;

    public OpenPosition() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    public /* synthetic */ OpenPosition(String str, String str2, Side side, MarginMode marginMode, String str3, String str4, String str5, Money money, String str6, String str7, String str8, String str9, String str10, Money money2, Money money3, String str11, String str12, Currency currency, String str13, String str14, String str15, Money money4, EstimatedClosingFees estimatedClosingFees, LiquidationRisk liquidationRisk, Currency currency2, Money money5, FXQuote fXQuote, Instant instant, String str16, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 8) != 0 ? MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? null : money, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : money2, (i & 16384) != 0 ? null : money3, (i & 32768) != 0 ? "" : str11, (i & 65536) != 0 ? null : str12, (i & 131072) != 0 ? null : currency, (i & 262144) != 0 ? "" : str13, (i & 524288) != 0 ? "" : str14, (i & 1048576) != 0 ? "" : str15, (i & 2097152) != 0 ? null : money4, (i & 4194304) != 0 ? null : estimatedClosingFees, (i & 8388608) != 0 ? LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED : liquidationRisk, (i & 16777216) != 0 ? null : currency2, (i & 33554432) != 0 ? null : money5, (i & 67108864) != 0 ? null : fXQuote, (i & 134217728) != 0 ? null : instant, (i & 268435456) == 0 ? str16 : "", (i & 536870912) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27860newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final Side getSide() {
        return this.side;
    }

    public final MarginMode getMargin_mode() {
        return this.margin_mode;
    }

    public final String getLeverage() {
        return this.leverage;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getEntry_price() {
        return this.entry_price;
    }

    public final Money getPnl_settled() {
        return this.pnl_settled;
    }

    public final String getInitial_margin() {
        return this.initial_margin;
    }

    public final String getInitial_margin_ratio() {
        return this.initial_margin_ratio;
    }

    public final String getMaintenance_margin() {
        return this.maintenance_margin;
    }

    public final String getMaintenance_margin_ratio() {
        return this.maintenance_margin_ratio;
    }

    public final String getEstimated_liquidation_price() {
        return this.estimated_liquidation_price;
    }

    public final Money getPnl_realized() {
        return this.pnl_realized;
    }

    public final Money getPnl_unrealized() {
        return this.pnl_unrealized;
    }

    public final String getPnl_percentage() {
        return this.pnl_percentage;
    }

    public final String getCollateral_reserved() {
        return this.collateral_reserved;
    }

    public final Currency getCollateral_currency() {
        return this.collateral_currency;
    }

    public final String getTotal_allocated_margin() {
        return this.total_allocated_margin;
    }

    public final String getPosition_size() {
        return this.position_size;
    }

    public final String getMark_price() {
        return this.mark_price;
    }

    public final Money getPnl() {
        return this.pnl;
    }

    public final EstimatedClosingFees getEstimated_closing_fees() {
        return this.estimated_closing_fees;
    }

    public final LiquidationRisk getLiquidation_risk() {
        return this.liquidation_risk;
    }

    public final Currency getQuote_currency() {
        return this.quote_currency;
    }

    public final Money getPnl_unsettled() {
        return this.pnl_unsettled;
    }

    public final FXQuote getFx_quote() {
        return this.fx_quote;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final String getImplied_leverage() {
        return this.implied_leverage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPosition(String id, String contract_id, Side side, MarginMode margin_mode, String leverage, String quantity, String entry_price, Money money, String initial_margin, String initial_margin_ratio, String maintenance_margin, String maintenance_margin_ratio, String str, Money money2, Money money3, String pnl_percentage, String str2, Currency currency, String total_allocated_margin, String position_size, String mark_price, Money money4, EstimatedClosingFees estimatedClosingFees, LiquidationRisk liquidation_risk, Currency currency2, Money money5, FXQuote fXQuote, Instant instant, String implied_leverage, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(entry_price, "entry_price");
        Intrinsics.checkNotNullParameter(initial_margin, "initial_margin");
        Intrinsics.checkNotNullParameter(initial_margin_ratio, "initial_margin_ratio");
        Intrinsics.checkNotNullParameter(maintenance_margin, "maintenance_margin");
        Intrinsics.checkNotNullParameter(maintenance_margin_ratio, "maintenance_margin_ratio");
        Intrinsics.checkNotNullParameter(pnl_percentage, "pnl_percentage");
        Intrinsics.checkNotNullParameter(total_allocated_margin, "total_allocated_margin");
        Intrinsics.checkNotNullParameter(position_size, "position_size");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(liquidation_risk, "liquidation_risk");
        Intrinsics.checkNotNullParameter(implied_leverage, "implied_leverage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.contract_id = contract_id;
        this.side = side;
        this.margin_mode = margin_mode;
        this.leverage = leverage;
        this.quantity = quantity;
        this.entry_price = entry_price;
        this.pnl_settled = money;
        this.initial_margin = initial_margin;
        this.initial_margin_ratio = initial_margin_ratio;
        this.maintenance_margin = maintenance_margin;
        this.maintenance_margin_ratio = maintenance_margin_ratio;
        this.estimated_liquidation_price = str;
        this.pnl_realized = money2;
        this.pnl_unrealized = money3;
        this.pnl_percentage = pnl_percentage;
        this.collateral_reserved = str2;
        this.collateral_currency = currency;
        this.total_allocated_margin = total_allocated_margin;
        this.position_size = position_size;
        this.mark_price = mark_price;
        this.pnl = money4;
        this.estimated_closing_fees = estimatedClosingFees;
        this.liquidation_risk = liquidation_risk;
        this.quote_currency = currency2;
        this.pnl_unsettled = money5;
        this.fx_quote = fXQuote;
        this.created_at = instant;
        this.implied_leverage = implied_leverage;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27860newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OpenPosition)) {
            return false;
        }
        OpenPosition openPosition = (OpenPosition) other;
        return Intrinsics.areEqual(unknownFields(), openPosition.unknownFields()) && Intrinsics.areEqual(this.id, openPosition.id) && Intrinsics.areEqual(this.contract_id, openPosition.contract_id) && this.side == openPosition.side && this.margin_mode == openPosition.margin_mode && Intrinsics.areEqual(this.leverage, openPosition.leverage) && Intrinsics.areEqual(this.quantity, openPosition.quantity) && Intrinsics.areEqual(this.entry_price, openPosition.entry_price) && Intrinsics.areEqual(this.pnl_settled, openPosition.pnl_settled) && Intrinsics.areEqual(this.initial_margin, openPosition.initial_margin) && Intrinsics.areEqual(this.initial_margin_ratio, openPosition.initial_margin_ratio) && Intrinsics.areEqual(this.maintenance_margin, openPosition.maintenance_margin) && Intrinsics.areEqual(this.maintenance_margin_ratio, openPosition.maintenance_margin_ratio) && Intrinsics.areEqual(this.estimated_liquidation_price, openPosition.estimated_liquidation_price) && Intrinsics.areEqual(this.pnl_realized, openPosition.pnl_realized) && Intrinsics.areEqual(this.pnl_unrealized, openPosition.pnl_unrealized) && Intrinsics.areEqual(this.pnl_percentage, openPosition.pnl_percentage) && Intrinsics.areEqual(this.collateral_reserved, openPosition.collateral_reserved) && Intrinsics.areEqual(this.collateral_currency, openPosition.collateral_currency) && Intrinsics.areEqual(this.total_allocated_margin, openPosition.total_allocated_margin) && Intrinsics.areEqual(this.position_size, openPosition.position_size) && Intrinsics.areEqual(this.mark_price, openPosition.mark_price) && Intrinsics.areEqual(this.pnl, openPosition.pnl) && Intrinsics.areEqual(this.estimated_closing_fees, openPosition.estimated_closing_fees) && this.liquidation_risk == openPosition.liquidation_risk && Intrinsics.areEqual(this.quote_currency, openPosition.quote_currency) && Intrinsics.areEqual(this.pnl_unsettled, openPosition.pnl_unsettled) && Intrinsics.areEqual(this.fx_quote, openPosition.fx_quote) && Intrinsics.areEqual(this.created_at, openPosition.created_at) && Intrinsics.areEqual(this.implied_leverage, openPosition.implied_leverage);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.contract_id.hashCode()) * 37) + this.side.hashCode()) * 37) + this.margin_mode.hashCode()) * 37) + this.leverage.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.entry_price.hashCode()) * 37;
        Money money = this.pnl_settled;
        int iHashCode2 = (((((((((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.initial_margin.hashCode()) * 37) + this.initial_margin_ratio.hashCode()) * 37) + this.maintenance_margin.hashCode()) * 37) + this.maintenance_margin_ratio.hashCode()) * 37;
        String str = this.estimated_liquidation_price;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Money money2 = this.pnl_realized;
        int iHashCode4 = (iHashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.pnl_unrealized;
        int iHashCode5 = (((iHashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37) + this.pnl_percentage.hashCode()) * 37;
        String str2 = this.collateral_reserved;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Currency currency = this.collateral_currency;
        int iHashCode7 = (((((((iHashCode6 + (currency != null ? currency.hashCode() : 0)) * 37) + this.total_allocated_margin.hashCode()) * 37) + this.position_size.hashCode()) * 37) + this.mark_price.hashCode()) * 37;
        Money money4 = this.pnl;
        int iHashCode8 = (iHashCode7 + (money4 != null ? money4.hashCode() : 0)) * 37;
        EstimatedClosingFees estimatedClosingFees = this.estimated_closing_fees;
        int iHashCode9 = (((iHashCode8 + (estimatedClosingFees != null ? estimatedClosingFees.hashCode() : 0)) * 37) + this.liquidation_risk.hashCode()) * 37;
        Currency currency2 = this.quote_currency;
        int iHashCode10 = (iHashCode9 + (currency2 != null ? currency2.hashCode() : 0)) * 37;
        Money money5 = this.pnl_unsettled;
        int iHashCode11 = (iHashCode10 + (money5 != null ? money5.hashCode() : 0)) * 37;
        FXQuote fXQuote = this.fx_quote;
        int iHashCode12 = (iHashCode11 + (fXQuote != null ? fXQuote.hashCode() : 0)) * 37;
        Instant instant = this.created_at;
        int iHashCode13 = ((iHashCode12 + (instant != null ? instant.hashCode() : 0)) * 37) + this.implied_leverage.hashCode();
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("side=" + this.side);
        arrayList.add("margin_mode=" + this.margin_mode);
        arrayList.add("leverage=" + Internal.sanitize(this.leverage));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("entry_price=" + Internal.sanitize(this.entry_price));
        Money money = this.pnl_settled;
        if (money != null) {
            arrayList.add("pnl_settled=" + money);
        }
        arrayList.add("initial_margin=" + Internal.sanitize(this.initial_margin));
        arrayList.add("initial_margin_ratio=" + Internal.sanitize(this.initial_margin_ratio));
        arrayList.add("maintenance_margin=" + Internal.sanitize(this.maintenance_margin));
        arrayList.add("maintenance_margin_ratio=" + Internal.sanitize(this.maintenance_margin_ratio));
        String str = this.estimated_liquidation_price;
        if (str != null) {
            arrayList.add("estimated_liquidation_price=" + Internal.sanitize(str));
        }
        Money money2 = this.pnl_realized;
        if (money2 != null) {
            arrayList.add("pnl_realized=" + money2);
        }
        Money money3 = this.pnl_unrealized;
        if (money3 != null) {
            arrayList.add("pnl_unrealized=" + money3);
        }
        arrayList.add("pnl_percentage=" + Internal.sanitize(this.pnl_percentage));
        String str2 = this.collateral_reserved;
        if (str2 != null) {
            arrayList.add("collateral_reserved=" + Internal.sanitize(str2));
        }
        Currency currency = this.collateral_currency;
        if (currency != null) {
            arrayList.add("collateral_currency=" + currency);
        }
        arrayList.add("total_allocated_margin=" + Internal.sanitize(this.total_allocated_margin));
        arrayList.add("position_size=" + Internal.sanitize(this.position_size));
        arrayList.add("mark_price=" + Internal.sanitize(this.mark_price));
        Money money4 = this.pnl;
        if (money4 != null) {
            arrayList.add("pnl=" + money4);
        }
        EstimatedClosingFees estimatedClosingFees = this.estimated_closing_fees;
        if (estimatedClosingFees != null) {
            arrayList.add("estimated_closing_fees=" + estimatedClosingFees);
        }
        arrayList.add("liquidation_risk=" + this.liquidation_risk);
        Currency currency2 = this.quote_currency;
        if (currency2 != null) {
            arrayList.add("quote_currency=" + currency2);
        }
        Money money5 = this.pnl_unsettled;
        if (money5 != null) {
            arrayList.add("pnl_unsettled=" + money5);
        }
        FXQuote fXQuote = this.fx_quote;
        if (fXQuote != null) {
            arrayList.add("fx_quote=" + fXQuote);
        }
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        arrayList.add("implied_leverage=" + Internal.sanitize(this.implied_leverage));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpenPosition{", "}", 0, null, null, 56, null);
    }

    public final OpenPosition copy(String id, String contract_id, Side side, MarginMode margin_mode, String leverage, String quantity, String entry_price, Money pnl_settled, String initial_margin, String initial_margin_ratio, String maintenance_margin, String maintenance_margin_ratio, String estimated_liquidation_price, Money pnl_realized, Money pnl_unrealized, String pnl_percentage, String collateral_reserved, Currency collateral_currency, String total_allocated_margin, String position_size, String mark_price, Money pnl, EstimatedClosingFees estimated_closing_fees, LiquidationRisk liquidation_risk, Currency quote_currency, Money pnl_unsettled, FXQuote fx_quote, Instant created_at, String implied_leverage, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(entry_price, "entry_price");
        Intrinsics.checkNotNullParameter(initial_margin, "initial_margin");
        Intrinsics.checkNotNullParameter(initial_margin_ratio, "initial_margin_ratio");
        Intrinsics.checkNotNullParameter(maintenance_margin, "maintenance_margin");
        Intrinsics.checkNotNullParameter(maintenance_margin_ratio, "maintenance_margin_ratio");
        Intrinsics.checkNotNullParameter(pnl_percentage, "pnl_percentage");
        Intrinsics.checkNotNullParameter(total_allocated_margin, "total_allocated_margin");
        Intrinsics.checkNotNullParameter(position_size, "position_size");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(liquidation_risk, "liquidation_risk");
        Intrinsics.checkNotNullParameter(implied_leverage, "implied_leverage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OpenPosition(id, contract_id, side, margin_mode, leverage, quantity, entry_price, pnl_settled, initial_margin, initial_margin_ratio, maintenance_margin, maintenance_margin_ratio, estimated_liquidation_price, pnl_realized, pnl_unrealized, pnl_percentage, collateral_reserved, collateral_currency, total_allocated_margin, position_size, mark_price, pnl, estimated_closing_fees, liquidation_risk, quote_currency, pnl_unsettled, fx_quote, created_at, implied_leverage, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OpenPosition.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OpenPosition>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.position.v1.OpenPosition$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OpenPosition value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContract_id());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(3, value.getSide());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    size += MarginMode.ADAPTER.encodedSizeWithTag(4, value.getMargin_mode());
                }
                if (!Intrinsics.areEqual(value.getLeverage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLeverage());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getEntry_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getEntry_price());
                }
                if (value.getPnl_settled() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(8, value.getPnl_settled());
                }
                if (!Intrinsics.areEqual(value.getInitial_margin(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getInitial_margin());
                }
                if (!Intrinsics.areEqual(value.getInitial_margin_ratio(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getInitial_margin_ratio());
                }
                if (!Intrinsics.areEqual(value.getMaintenance_margin(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getMaintenance_margin());
                }
                if (!Intrinsics.areEqual(value.getMaintenance_margin_ratio(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getMaintenance_margin_ratio());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(13, value.getEstimated_liquidation_price());
                if (value.getPnl_realized() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(14, value.getPnl_realized());
                }
                if (value.getPnl_unrealized() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(15, value.getPnl_unrealized());
                }
                if (!Intrinsics.areEqual(value.getPnl_percentage(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(16, value.getPnl_percentage());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(17, value.getCollateral_reserved());
                ProtoAdapter<Currency> protoAdapter2 = Currency.ADAPTER;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(18, value.getCollateral_currency());
                if (!Intrinsics.areEqual(value.getTotal_allocated_margin(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(19, value.getTotal_allocated_margin());
                }
                if (!Intrinsics.areEqual(value.getPosition_size(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(20, value.getPosition_size());
                }
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(21, value.getMark_price());
                }
                if (value.getPnl() != null) {
                    iEncodedSizeWithTag3 += Money.ADAPTER.encodedSizeWithTag(22, value.getPnl());
                }
                if (value.getEstimated_closing_fees() != null) {
                    iEncodedSizeWithTag3 += EstimatedClosingFees.ADAPTER.encodedSizeWithTag(23, value.getEstimated_closing_fees());
                }
                if (value.getLiquidation_risk() != LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED) {
                    iEncodedSizeWithTag3 += LiquidationRisk.ADAPTER.encodedSizeWithTag(24, value.getLiquidation_risk());
                }
                if (value.getQuote_currency() != null) {
                    iEncodedSizeWithTag3 += protoAdapter2.encodedSizeWithTag(25, value.getQuote_currency());
                }
                if (value.getPnl_unsettled() != null) {
                    iEncodedSizeWithTag3 += Money.ADAPTER.encodedSizeWithTag(26, value.getPnl_unsettled());
                }
                if (value.getFx_quote() != null) {
                    iEncodedSizeWithTag3 += FXQuote.ADAPTER.encodedSizeWithTag(27, value.getFx_quote());
                }
                if (value.getCreated_at() != null) {
                    iEncodedSizeWithTag3 += ProtoAdapter.INSTANT.encodedSizeWithTag(28, value.getCreated_at());
                }
                return !Intrinsics.areEqual(value.getImplied_leverage(), "") ? iEncodedSizeWithTag3 + protoAdapter.encodedSizeWithTag(29, value.getImplied_leverage()) : iEncodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OpenPosition value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_id());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 3, (int) value.getSide());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_mode());
                }
                if (!Intrinsics.areEqual(value.getLeverage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLeverage());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getEntry_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getEntry_price());
                }
                if (value.getPnl_settled() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getPnl_settled());
                }
                if (!Intrinsics.areEqual(value.getInitial_margin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getInitial_margin());
                }
                if (!Intrinsics.areEqual(value.getInitial_margin_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getInitial_margin_ratio());
                }
                if (!Intrinsics.areEqual(value.getMaintenance_margin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getMaintenance_margin());
                }
                if (!Intrinsics.areEqual(value.getMaintenance_margin_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getMaintenance_margin_ratio());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 13, (int) value.getEstimated_liquidation_price());
                if (value.getPnl_realized() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 14, (int) value.getPnl_realized());
                }
                if (value.getPnl_unrealized() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 15, (int) value.getPnl_unrealized());
                }
                if (!Intrinsics.areEqual(value.getPnl_percentage(), "")) {
                    protoAdapter.encodeWithTag(writer, 16, (int) value.getPnl_percentage());
                }
                protoAdapter.encodeWithTag(writer, 17, (int) value.getCollateral_reserved());
                ProtoAdapter<Currency> protoAdapter2 = Currency.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 18, (int) value.getCollateral_currency());
                if (!Intrinsics.areEqual(value.getTotal_allocated_margin(), "")) {
                    protoAdapter.encodeWithTag(writer, 19, (int) value.getTotal_allocated_margin());
                }
                if (!Intrinsics.areEqual(value.getPosition_size(), "")) {
                    protoAdapter.encodeWithTag(writer, 20, (int) value.getPosition_size());
                }
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 21, (int) value.getMark_price());
                }
                if (value.getPnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 22, (int) value.getPnl());
                }
                if (value.getEstimated_closing_fees() != null) {
                    EstimatedClosingFees.ADAPTER.encodeWithTag(writer, 23, (int) value.getEstimated_closing_fees());
                }
                if (value.getLiquidation_risk() != LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED) {
                    LiquidationRisk.ADAPTER.encodeWithTag(writer, 24, (int) value.getLiquidation_risk());
                }
                if (value.getQuote_currency() != null) {
                    protoAdapter2.encodeWithTag(writer, 25, (int) value.getQuote_currency());
                }
                if (value.getPnl_unsettled() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 26, (int) value.getPnl_unsettled());
                }
                if (value.getFx_quote() != null) {
                    FXQuote.ADAPTER.encodeWithTag(writer, 27, (int) value.getFx_quote());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 28, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getImplied_leverage(), "")) {
                    protoAdapter.encodeWithTag(writer, 29, (int) value.getImplied_leverage());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OpenPosition value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getImplied_leverage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 29, (int) value.getImplied_leverage());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 28, (int) value.getCreated_at());
                }
                if (value.getFx_quote() != null) {
                    FXQuote.ADAPTER.encodeWithTag(writer, 27, (int) value.getFx_quote());
                }
                if (value.getPnl_unsettled() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 26, (int) value.getPnl_unsettled());
                }
                if (value.getQuote_currency() != null) {
                    Currency.ADAPTER.encodeWithTag(writer, 25, (int) value.getQuote_currency());
                }
                if (value.getLiquidation_risk() != LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED) {
                    LiquidationRisk.ADAPTER.encodeWithTag(writer, 24, (int) value.getLiquidation_risk());
                }
                if (value.getEstimated_closing_fees() != null) {
                    EstimatedClosingFees.ADAPTER.encodeWithTag(writer, 23, (int) value.getEstimated_closing_fees());
                }
                if (value.getPnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 22, (int) value.getPnl());
                }
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getMark_price());
                }
                if (!Intrinsics.areEqual(value.getPosition_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getPosition_size());
                }
                if (!Intrinsics.areEqual(value.getTotal_allocated_margin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getTotal_allocated_margin());
                }
                Currency.ADAPTER.encodeWithTag(writer, 18, (int) value.getCollateral_currency());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 17, (int) value.getCollateral_reserved());
                if (!Intrinsics.areEqual(value.getPnl_percentage(), "")) {
                    protoAdapter.encodeWithTag(writer, 16, (int) value.getPnl_percentage());
                }
                if (value.getPnl_unrealized() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 15, (int) value.getPnl_unrealized());
                }
                if (value.getPnl_realized() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 14, (int) value.getPnl_realized());
                }
                protoAdapter.encodeWithTag(writer, 13, (int) value.getEstimated_liquidation_price());
                if (!Intrinsics.areEqual(value.getMaintenance_margin_ratio(), "")) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getMaintenance_margin_ratio());
                }
                if (!Intrinsics.areEqual(value.getMaintenance_margin(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getMaintenance_margin());
                }
                if (!Intrinsics.areEqual(value.getInitial_margin_ratio(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getInitial_margin_ratio());
                }
                if (!Intrinsics.areEqual(value.getInitial_margin(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getInitial_margin());
                }
                if (value.getPnl_settled() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getPnl_settled());
                }
                if (!Intrinsics.areEqual(value.getEntry_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getEntry_price());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getLeverage(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getLeverage());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_mode());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 3, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getContract_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OpenPosition decode(ProtoReader reader) throws IOException {
                MarginMode marginMode;
                LiquidationRisk liquidationRisk;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Side side = Side.SIDE_UNSPECIFIED;
                MarginMode marginMode2 = MarginMode.MARGIN_MODE_UNSPECIFIED;
                LiquidationRisk liquidationRisk2 = LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Side sideDecode = side;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                Money moneyDecode = null;
                String strDecode14 = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                String strDecode15 = null;
                Currency currencyDecode = null;
                Money moneyDecode4 = null;
                EstimatedClosingFees estimatedClosingFeesDecode = null;
                Currency currencyDecode2 = null;
                Money moneyDecode5 = null;
                FXQuote fXQuoteDecode = null;
                Instant instantDecode = null;
                LiquidationRisk liquidationRiskDecode = liquidationRisk2;
                String strDecode16 = strDecode13;
                MarginMode marginModeDecode = marginMode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode16 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                marginMode = marginModeDecode;
                                liquidationRisk = liquidationRiskDecode;
                                str = strDecode16;
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                marginModeDecode = marginMode;
                                strDecode16 = str;
                                liquidationRiskDecode = liquidationRisk;
                                break;
                            case 4:
                                marginMode = marginModeDecode;
                                liquidationRisk = liquidationRiskDecode;
                                str = strDecode16;
                                try {
                                    marginModeDecode = MarginMode.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode16 = str;
                                liquidationRiskDecode = liquidationRisk;
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 15:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 16:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 17:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 18:
                                currencyDecode = Currency.ADAPTER.decode(reader);
                                break;
                            case 19:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 20:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 21:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 22:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            case 23:
                                estimatedClosingFeesDecode = EstimatedClosingFees.ADAPTER.decode(reader);
                                break;
                            case 24:
                                try {
                                    liquidationRiskDecode = LiquidationRisk.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    marginMode = marginModeDecode;
                                    liquidationRisk = liquidationRiskDecode;
                                    str = strDecode16;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 25:
                                currencyDecode2 = Currency.ADAPTER.decode(reader);
                                break;
                            case 26:
                                moneyDecode5 = Money.ADAPTER.decode(reader);
                                break;
                            case 27:
                                fXQuoteDecode = FXQuote.ADAPTER.decode(reader);
                                break;
                            case 28:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 29:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                marginMode = marginModeDecode;
                                liquidationRisk = liquidationRiskDecode;
                                str = strDecode16;
                                marginModeDecode = marginMode;
                                strDecode16 = str;
                                liquidationRiskDecode = liquidationRisk;
                                break;
                        }
                    } else {
                        return new OpenPosition(strDecode16, strDecode, sideDecode, marginModeDecode, strDecode2, strDecode3, strDecode4, moneyDecode, strDecode5, strDecode6, strDecode7, strDecode8, strDecode14, moneyDecode2, moneyDecode3, strDecode9, strDecode15, currencyDecode, strDecode10, strDecode11, strDecode12, moneyDecode4, estimatedClosingFeesDecode, liquidationRiskDecode, currencyDecode2, moneyDecode5, fXQuoteDecode, instantDecode, strDecode13, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OpenPosition redact(OpenPosition value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money pnl_settled = value.getPnl_settled();
                Money moneyRedact = pnl_settled != null ? Money.ADAPTER.redact(pnl_settled) : null;
                Money pnl_realized = value.getPnl_realized();
                Money moneyRedact2 = pnl_realized != null ? Money.ADAPTER.redact(pnl_realized) : null;
                Money pnl_unrealized = value.getPnl_unrealized();
                Money moneyRedact3 = pnl_unrealized != null ? Money.ADAPTER.redact(pnl_unrealized) : null;
                Currency collateral_currency = value.getCollateral_currency();
                Currency currencyRedact = collateral_currency != null ? Currency.ADAPTER.redact(collateral_currency) : null;
                Money pnl = value.getPnl();
                Money moneyRedact4 = pnl != null ? Money.ADAPTER.redact(pnl) : null;
                EstimatedClosingFees estimated_closing_fees = value.getEstimated_closing_fees();
                EstimatedClosingFees estimatedClosingFeesRedact = estimated_closing_fees != null ? EstimatedClosingFees.ADAPTER.redact(estimated_closing_fees) : null;
                Currency quote_currency = value.getQuote_currency();
                Currency currencyRedact2 = quote_currency != null ? Currency.ADAPTER.redact(quote_currency) : null;
                Money pnl_unsettled = value.getPnl_unsettled();
                Money moneyRedact5 = pnl_unsettled != null ? Money.ADAPTER.redact(pnl_unsettled) : null;
                FXQuote fx_quote = value.getFx_quote();
                FXQuote fXQuoteRedact = fx_quote != null ? FXQuote.ADAPTER.redact(fx_quote) : null;
                Instant created_at = value.getCreated_at();
                return value.copy((278765439 & 1) != 0 ? value.id : null, (278765439 & 2) != 0 ? value.contract_id : null, (278765439 & 4) != 0 ? value.side : null, (278765439 & 8) != 0 ? value.margin_mode : null, (278765439 & 16) != 0 ? value.leverage : null, (278765439 & 32) != 0 ? value.quantity : null, (278765439 & 64) != 0 ? value.entry_price : null, (278765439 & 128) != 0 ? value.pnl_settled : moneyRedact, (278765439 & 256) != 0 ? value.initial_margin : null, (278765439 & 512) != 0 ? value.initial_margin_ratio : null, (278765439 & 1024) != 0 ? value.maintenance_margin : null, (278765439 & 2048) != 0 ? value.maintenance_margin_ratio : null, (278765439 & 4096) != 0 ? value.estimated_liquidation_price : null, (278765439 & 8192) != 0 ? value.pnl_realized : moneyRedact2, (278765439 & 16384) != 0 ? value.pnl_unrealized : moneyRedact3, (278765439 & 32768) != 0 ? value.pnl_percentage : null, (278765439 & 65536) != 0 ? value.collateral_reserved : null, (278765439 & 131072) != 0 ? value.collateral_currency : currencyRedact, (278765439 & 262144) != 0 ? value.total_allocated_margin : null, (278765439 & 524288) != 0 ? value.position_size : null, (278765439 & 1048576) != 0 ? value.mark_price : null, (278765439 & 2097152) != 0 ? value.pnl : moneyRedact4, (278765439 & 4194304) != 0 ? value.estimated_closing_fees : estimatedClosingFeesRedact, (278765439 & 8388608) != 0 ? value.liquidation_risk : null, (278765439 & 16777216) != 0 ? value.quote_currency : currencyRedact2, (278765439 & 33554432) != 0 ? value.pnl_unsettled : moneyRedact5, (278765439 & 67108864) != 0 ? value.fx_quote : fXQuoteRedact, (278765439 & 134217728) != 0 ? value.created_at : created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, (278765439 & 268435456) != 0 ? value.implied_leverage : null, (278765439 & 536870912) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
