package hippo.model.p469v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: OrderFormSettings.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016JV\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, m3636d2 = {"Lhippo/model/v1/OrderFormSettings;", "Lcom/squareup/wire/Message;", "", "equity_time_in_force_long_order", "Lhippo/model/v1/EquityTimeInForce;", "equity_trading_session_long_order", "Lhippo/model/v1/EquityTradingSession;", "equity_time_in_force_short_order", "equity_trading_session_short_order", "futures_time_in_force", "Lhippo/model/v1/FuturesTimeInForce;", "crypto_time_in_force", "Lhippo/model/v1/CryptoTimeInForce;", "crypto_amount_type", "Lhippo/model/v1/CryptoAmountType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lhippo/model/v1/EquityTimeInForce;Lhippo/model/v1/EquityTradingSession;Lhippo/model/v1/EquityTimeInForce;Lhippo/model/v1/EquityTradingSession;Lhippo/model/v1/FuturesTimeInForce;Lhippo/model/v1/CryptoTimeInForce;Lhippo/model/v1/CryptoAmountType;Lokio/ByteString;)V", "getEquity_time_in_force_long_order", "()Lhippo/model/v1/EquityTimeInForce;", "getEquity_trading_session_long_order", "()Lhippo/model/v1/EquityTradingSession;", "getEquity_time_in_force_short_order", "getEquity_trading_session_short_order", "getFutures_time_in_force", "()Lhippo/model/v1/FuturesTimeInForce;", "getCrypto_time_in_force", "()Lhippo/model/v1/CryptoTimeInForce;", "getCrypto_amount_type", "()Lhippo/model/v1/CryptoAmountType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class OrderFormSettings extends Message {

    @JvmField
    public static final ProtoAdapter<OrderFormSettings> ADAPTER;

    @WireField(adapter = "hippo.model.v1.CryptoAmountType#ADAPTER", jsonName = "cryptoAmountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final CryptoAmountType crypto_amount_type;

    @WireField(adapter = "hippo.model.v1.CryptoTimeInForce#ADAPTER", jsonName = "cryptoTimeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final CryptoTimeInForce crypto_time_in_force;

    @WireField(adapter = "hippo.model.v1.EquityTimeInForce#ADAPTER", jsonName = "equityTimeInForceLongOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EquityTimeInForce equity_time_in_force_long_order;

    @WireField(adapter = "hippo.model.v1.EquityTimeInForce#ADAPTER", jsonName = "equityTimeInForceShortOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final EquityTimeInForce equity_time_in_force_short_order;

    @WireField(adapter = "hippo.model.v1.EquityTradingSession#ADAPTER", jsonName = "equityTradingSessionLongOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EquityTradingSession equity_trading_session_long_order;

    @WireField(adapter = "hippo.model.v1.EquityTradingSession#ADAPTER", jsonName = "equityTradingSessionShortOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final EquityTradingSession equity_trading_session_short_order;

    @WireField(adapter = "hippo.model.v1.FuturesTimeInForce#ADAPTER", jsonName = "futuresTimeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final FuturesTimeInForce futures_time_in_force;

    public OrderFormSettings() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28254newBuilder();
    }

    public final EquityTimeInForce getEquity_time_in_force_long_order() {
        return this.equity_time_in_force_long_order;
    }

    public /* synthetic */ OrderFormSettings(EquityTimeInForce equityTimeInForce, EquityTradingSession equityTradingSession, EquityTimeInForce equityTimeInForce2, EquityTradingSession equityTradingSession2, FuturesTimeInForce futuresTimeInForce, CryptoTimeInForce cryptoTimeInForce, CryptoAmountType cryptoAmountType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED : equityTimeInForce, (i & 2) != 0 ? EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED : equityTradingSession, (i & 4) != 0 ? EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED : equityTimeInForce2, (i & 8) != 0 ? EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED : equityTradingSession2, (i & 16) != 0 ? FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED : futuresTimeInForce, (i & 32) != 0 ? CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED : cryptoTimeInForce, (i & 64) != 0 ? CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED : cryptoAmountType, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final EquityTradingSession getEquity_trading_session_long_order() {
        return this.equity_trading_session_long_order;
    }

    public final EquityTimeInForce getEquity_time_in_force_short_order() {
        return this.equity_time_in_force_short_order;
    }

    public final EquityTradingSession getEquity_trading_session_short_order() {
        return this.equity_trading_session_short_order;
    }

    public final FuturesTimeInForce getFutures_time_in_force() {
        return this.futures_time_in_force;
    }

    public final CryptoTimeInForce getCrypto_time_in_force() {
        return this.crypto_time_in_force;
    }

    public final CryptoAmountType getCrypto_amount_type() {
        return this.crypto_amount_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFormSettings(EquityTimeInForce equity_time_in_force_long_order, EquityTradingSession equity_trading_session_long_order, EquityTimeInForce equity_time_in_force_short_order, EquityTradingSession equity_trading_session_short_order, FuturesTimeInForce futures_time_in_force, CryptoTimeInForce crypto_time_in_force, CryptoAmountType crypto_amount_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(equity_time_in_force_long_order, "equity_time_in_force_long_order");
        Intrinsics.checkNotNullParameter(equity_trading_session_long_order, "equity_trading_session_long_order");
        Intrinsics.checkNotNullParameter(equity_time_in_force_short_order, "equity_time_in_force_short_order");
        Intrinsics.checkNotNullParameter(equity_trading_session_short_order, "equity_trading_session_short_order");
        Intrinsics.checkNotNullParameter(futures_time_in_force, "futures_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_amount_type, "crypto_amount_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.equity_time_in_force_long_order = equity_time_in_force_long_order;
        this.equity_trading_session_long_order = equity_trading_session_long_order;
        this.equity_time_in_force_short_order = equity_time_in_force_short_order;
        this.equity_trading_session_short_order = equity_trading_session_short_order;
        this.futures_time_in_force = futures_time_in_force;
        this.crypto_time_in_force = crypto_time_in_force;
        this.crypto_amount_type = crypto_amount_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28254newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderFormSettings)) {
            return false;
        }
        OrderFormSettings orderFormSettings = (OrderFormSettings) other;
        return Intrinsics.areEqual(unknownFields(), orderFormSettings.unknownFields()) && this.equity_time_in_force_long_order == orderFormSettings.equity_time_in_force_long_order && this.equity_trading_session_long_order == orderFormSettings.equity_trading_session_long_order && this.equity_time_in_force_short_order == orderFormSettings.equity_time_in_force_short_order && this.equity_trading_session_short_order == orderFormSettings.equity_trading_session_short_order && this.futures_time_in_force == orderFormSettings.futures_time_in_force && this.crypto_time_in_force == orderFormSettings.crypto_time_in_force && this.crypto_amount_type == orderFormSettings.crypto_amount_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.equity_time_in_force_long_order.hashCode()) * 37) + this.equity_trading_session_long_order.hashCode()) * 37) + this.equity_time_in_force_short_order.hashCode()) * 37) + this.equity_trading_session_short_order.hashCode()) * 37) + this.futures_time_in_force.hashCode()) * 37) + this.crypto_time_in_force.hashCode()) * 37) + this.crypto_amount_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("equity_time_in_force_long_order=" + this.equity_time_in_force_long_order);
        arrayList.add("equity_trading_session_long_order=" + this.equity_trading_session_long_order);
        arrayList.add("equity_time_in_force_short_order=" + this.equity_time_in_force_short_order);
        arrayList.add("equity_trading_session_short_order=" + this.equity_trading_session_short_order);
        arrayList.add("futures_time_in_force=" + this.futures_time_in_force);
        arrayList.add("crypto_time_in_force=" + this.crypto_time_in_force);
        arrayList.add("crypto_amount_type=" + this.crypto_amount_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderFormSettings{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderFormSettings copy$default(OrderFormSettings orderFormSettings, EquityTimeInForce equityTimeInForce, EquityTradingSession equityTradingSession, EquityTimeInForce equityTimeInForce2, EquityTradingSession equityTradingSession2, FuturesTimeInForce futuresTimeInForce, CryptoTimeInForce cryptoTimeInForce, CryptoAmountType cryptoAmountType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            equityTimeInForce = orderFormSettings.equity_time_in_force_long_order;
        }
        if ((i & 2) != 0) {
            equityTradingSession = orderFormSettings.equity_trading_session_long_order;
        }
        if ((i & 4) != 0) {
            equityTimeInForce2 = orderFormSettings.equity_time_in_force_short_order;
        }
        if ((i & 8) != 0) {
            equityTradingSession2 = orderFormSettings.equity_trading_session_short_order;
        }
        if ((i & 16) != 0) {
            futuresTimeInForce = orderFormSettings.futures_time_in_force;
        }
        if ((i & 32) != 0) {
            cryptoTimeInForce = orderFormSettings.crypto_time_in_force;
        }
        if ((i & 64) != 0) {
            cryptoAmountType = orderFormSettings.crypto_amount_type;
        }
        if ((i & 128) != 0) {
            byteString = orderFormSettings.unknownFields();
        }
        CryptoAmountType cryptoAmountType2 = cryptoAmountType;
        ByteString byteString2 = byteString;
        FuturesTimeInForce futuresTimeInForce2 = futuresTimeInForce;
        CryptoTimeInForce cryptoTimeInForce2 = cryptoTimeInForce;
        return orderFormSettings.copy(equityTimeInForce, equityTradingSession, equityTimeInForce2, equityTradingSession2, futuresTimeInForce2, cryptoTimeInForce2, cryptoAmountType2, byteString2);
    }

    public final OrderFormSettings copy(EquityTimeInForce equity_time_in_force_long_order, EquityTradingSession equity_trading_session_long_order, EquityTimeInForce equity_time_in_force_short_order, EquityTradingSession equity_trading_session_short_order, FuturesTimeInForce futures_time_in_force, CryptoTimeInForce crypto_time_in_force, CryptoAmountType crypto_amount_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(equity_time_in_force_long_order, "equity_time_in_force_long_order");
        Intrinsics.checkNotNullParameter(equity_trading_session_long_order, "equity_trading_session_long_order");
        Intrinsics.checkNotNullParameter(equity_time_in_force_short_order, "equity_time_in_force_short_order");
        Intrinsics.checkNotNullParameter(equity_trading_session_short_order, "equity_trading_session_short_order");
        Intrinsics.checkNotNullParameter(futures_time_in_force, "futures_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_amount_type, "crypto_amount_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderFormSettings(equity_time_in_force_long_order, equity_trading_session_long_order, equity_time_in_force_short_order, equity_trading_session_short_order, futures_time_in_force, crypto_time_in_force, crypto_amount_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderFormSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderFormSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.OrderFormSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderFormSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                EquityTimeInForce equity_time_in_force_long_order = value.getEquity_time_in_force_long_order();
                EquityTimeInForce equityTimeInForce = EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED;
                if (equity_time_in_force_long_order != equityTimeInForce) {
                    size += EquityTimeInForce.ADAPTER.encodedSizeWithTag(1, value.getEquity_time_in_force_long_order());
                }
                EquityTradingSession equity_trading_session_long_order = value.getEquity_trading_session_long_order();
                EquityTradingSession equityTradingSession = EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED;
                if (equity_trading_session_long_order != equityTradingSession) {
                    size += EquityTradingSession.ADAPTER.encodedSizeWithTag(2, value.getEquity_trading_session_long_order());
                }
                if (value.getEquity_time_in_force_short_order() != equityTimeInForce) {
                    size += EquityTimeInForce.ADAPTER.encodedSizeWithTag(3, value.getEquity_time_in_force_short_order());
                }
                if (value.getEquity_trading_session_short_order() != equityTradingSession) {
                    size += EquityTradingSession.ADAPTER.encodedSizeWithTag(4, value.getEquity_trading_session_short_order());
                }
                if (value.getFutures_time_in_force() != FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED) {
                    size += FuturesTimeInForce.ADAPTER.encodedSizeWithTag(5, value.getFutures_time_in_force());
                }
                if (value.getCrypto_time_in_force() != CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED) {
                    size += CryptoTimeInForce.ADAPTER.encodedSizeWithTag(6, value.getCrypto_time_in_force());
                }
                return value.getCrypto_amount_type() != CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED ? size + CryptoAmountType.ADAPTER.encodedSizeWithTag(7, value.getCrypto_amount_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderFormSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                EquityTimeInForce equity_time_in_force_long_order = value.getEquity_time_in_force_long_order();
                EquityTimeInForce equityTimeInForce = EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED;
                if (equity_time_in_force_long_order != equityTimeInForce) {
                    EquityTimeInForce.ADAPTER.encodeWithTag(writer, 1, (int) value.getEquity_time_in_force_long_order());
                }
                EquityTradingSession equity_trading_session_long_order = value.getEquity_trading_session_long_order();
                EquityTradingSession equityTradingSession = EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED;
                if (equity_trading_session_long_order != equityTradingSession) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 2, (int) value.getEquity_trading_session_long_order());
                }
                if (value.getEquity_time_in_force_short_order() != equityTimeInForce) {
                    EquityTimeInForce.ADAPTER.encodeWithTag(writer, 3, (int) value.getEquity_time_in_force_short_order());
                }
                if (value.getEquity_trading_session_short_order() != equityTradingSession) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 4, (int) value.getEquity_trading_session_short_order());
                }
                if (value.getFutures_time_in_force() != FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED) {
                    FuturesTimeInForce.ADAPTER.encodeWithTag(writer, 5, (int) value.getFutures_time_in_force());
                }
                if (value.getCrypto_time_in_force() != CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED) {
                    CryptoTimeInForce.ADAPTER.encodeWithTag(writer, 6, (int) value.getCrypto_time_in_force());
                }
                if (value.getCrypto_amount_type() != CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED) {
                    CryptoAmountType.ADAPTER.encodeWithTag(writer, 7, (int) value.getCrypto_amount_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderFormSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCrypto_amount_type() != CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED) {
                    CryptoAmountType.ADAPTER.encodeWithTag(writer, 7, (int) value.getCrypto_amount_type());
                }
                if (value.getCrypto_time_in_force() != CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED) {
                    CryptoTimeInForce.ADAPTER.encodeWithTag(writer, 6, (int) value.getCrypto_time_in_force());
                }
                if (value.getFutures_time_in_force() != FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED) {
                    FuturesTimeInForce.ADAPTER.encodeWithTag(writer, 5, (int) value.getFutures_time_in_force());
                }
                EquityTradingSession equity_trading_session_short_order = value.getEquity_trading_session_short_order();
                EquityTradingSession equityTradingSession = EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED;
                if (equity_trading_session_short_order != equityTradingSession) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 4, (int) value.getEquity_trading_session_short_order());
                }
                EquityTimeInForce equity_time_in_force_short_order = value.getEquity_time_in_force_short_order();
                EquityTimeInForce equityTimeInForce = EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED;
                if (equity_time_in_force_short_order != equityTimeInForce) {
                    EquityTimeInForce.ADAPTER.encodeWithTag(writer, 3, (int) value.getEquity_time_in_force_short_order());
                }
                if (value.getEquity_trading_session_long_order() != equityTradingSession) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 2, (int) value.getEquity_trading_session_long_order());
                }
                if (value.getEquity_time_in_force_long_order() != equityTimeInForce) {
                    EquityTimeInForce.ADAPTER.encodeWithTag(writer, 1, (int) value.getEquity_time_in_force_long_order());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderFormSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EquityTimeInForce equityTimeInForce = EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED;
                EquityTradingSession equityTradingSession = EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED;
                FuturesTimeInForce futuresTimeInForce = FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED;
                CryptoTimeInForce cryptoTimeInForce = CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED;
                CryptoAmountType cryptoAmountType = CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                FuturesTimeInForce futuresTimeInForceDecode = futuresTimeInForce;
                CryptoTimeInForce cryptoTimeInForceDecode = cryptoTimeInForce;
                CryptoAmountType cryptoAmountTypeDecode = cryptoAmountType;
                EquityTimeInForce equityTimeInForceDecode = equityTimeInForce;
                EquityTradingSession equityTradingSessionDecode = equityTradingSession;
                EquityTradingSession equityTradingSessionDecode2 = equityTradingSessionDecode;
                EquityTimeInForce equityTimeInForceDecode2 = equityTimeInForceDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    equityTimeInForceDecode2 = EquityTimeInForce.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                try {
                                    equityTradingSessionDecode = EquityTradingSession.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 3:
                                try {
                                    equityTimeInForceDecode = EquityTimeInForce.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 4:
                                try {
                                    equityTradingSessionDecode2 = EquityTradingSession.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 5:
                                try {
                                    futuresTimeInForceDecode = FuturesTimeInForce.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 6:
                                try {
                                    cryptoTimeInForceDecode = CryptoTimeInForce.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                    break;
                                }
                            case 7:
                                try {
                                    cryptoAmountTypeDecode = CryptoAmountType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new OrderFormSettings(equityTimeInForceDecode2, equityTradingSessionDecode, equityTimeInForceDecode, equityTradingSessionDecode2, futuresTimeInForceDecode, cryptoTimeInForceDecode, cryptoAmountTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderFormSettings redact(OrderFormSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OrderFormSettings.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        };
    }
}
