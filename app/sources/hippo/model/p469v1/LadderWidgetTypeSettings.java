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

/* compiled from: LadderWidgetTypeSettings.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016JL\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, m3636d2 = {"Lhippo/model/v1/LadderWidgetTypeSettings;", "Lcom/squareup/wire/Message;", "", "auto_send_trading_enabled", "", "time_in_force", "Lhippo/model/v1/EquityTimeInForce;", "trading_session", "Lhippo/model/v1/EquityTradingSession;", "crypto_time_in_force", "Lhippo/model/v1/CryptoTimeInForce;", "futures_time_in_force", "Lhippo/model/v1/FuturesTimeInForce;", "crypto_amount_type", "Lhippo/model/v1/CryptoAmountType;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLhippo/model/v1/EquityTimeInForce;Lhippo/model/v1/EquityTradingSession;Lhippo/model/v1/CryptoTimeInForce;Lhippo/model/v1/FuturesTimeInForce;Lhippo/model/v1/CryptoAmountType;Lokio/ByteString;)V", "getAuto_send_trading_enabled", "()Z", "getTime_in_force", "()Lhippo/model/v1/EquityTimeInForce;", "getTrading_session", "()Lhippo/model/v1/EquityTradingSession;", "getCrypto_time_in_force", "()Lhippo/model/v1/CryptoTimeInForce;", "getFutures_time_in_force", "()Lhippo/model/v1/FuturesTimeInForce;", "getCrypto_amount_type", "()Lhippo/model/v1/CryptoAmountType;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class LadderWidgetTypeSettings extends Message {

    @JvmField
    public static final ProtoAdapter<LadderWidgetTypeSettings> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSendTradingEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean auto_send_trading_enabled;

    @WireField(adapter = "hippo.model.v1.CryptoAmountType#ADAPTER", jsonName = "cryptoAmountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final CryptoAmountType crypto_amount_type;

    @WireField(adapter = "hippo.model.v1.CryptoTimeInForce#ADAPTER", jsonName = "cryptoTimeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CryptoTimeInForce crypto_time_in_force;

    @WireField(adapter = "hippo.model.v1.FuturesTimeInForce#ADAPTER", jsonName = "futuresTimeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final FuturesTimeInForce futures_time_in_force;

    @WireField(adapter = "hippo.model.v1.EquityTimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EquityTimeInForce time_in_force;

    @WireField(adapter = "hippo.model.v1.EquityTradingSession#ADAPTER", jsonName = "tradingSession", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final EquityTradingSession trading_session;

    public LadderWidgetTypeSettings() {
        this(false, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28248newBuilder();
    }

    public final boolean getAuto_send_trading_enabled() {
        return this.auto_send_trading_enabled;
    }

    public final EquityTimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public /* synthetic */ LadderWidgetTypeSettings(boolean z, EquityTimeInForce equityTimeInForce, EquityTradingSession equityTradingSession, CryptoTimeInForce cryptoTimeInForce, FuturesTimeInForce futuresTimeInForce, CryptoAmountType cryptoAmountType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED : equityTimeInForce, (i & 4) != 0 ? EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED : equityTradingSession, (i & 8) != 0 ? CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED : cryptoTimeInForce, (i & 16) != 0 ? FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED : futuresTimeInForce, (i & 32) != 0 ? CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED : cryptoAmountType, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final EquityTradingSession getTrading_session() {
        return this.trading_session;
    }

    public final CryptoTimeInForce getCrypto_time_in_force() {
        return this.crypto_time_in_force;
    }

    public final FuturesTimeInForce getFutures_time_in_force() {
        return this.futures_time_in_force;
    }

    public final CryptoAmountType getCrypto_amount_type() {
        return this.crypto_amount_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LadderWidgetTypeSettings(boolean z, EquityTimeInForce time_in_force, EquityTradingSession trading_session, CryptoTimeInForce crypto_time_in_force, FuturesTimeInForce futures_time_in_force, CryptoAmountType crypto_amount_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(trading_session, "trading_session");
        Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
        Intrinsics.checkNotNullParameter(futures_time_in_force, "futures_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_amount_type, "crypto_amount_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.auto_send_trading_enabled = z;
        this.time_in_force = time_in_force;
        this.trading_session = trading_session;
        this.crypto_time_in_force = crypto_time_in_force;
        this.futures_time_in_force = futures_time_in_force;
        this.crypto_amount_type = crypto_amount_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28248newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LadderWidgetTypeSettings)) {
            return false;
        }
        LadderWidgetTypeSettings ladderWidgetTypeSettings = (LadderWidgetTypeSettings) other;
        return Intrinsics.areEqual(unknownFields(), ladderWidgetTypeSettings.unknownFields()) && this.auto_send_trading_enabled == ladderWidgetTypeSettings.auto_send_trading_enabled && this.time_in_force == ladderWidgetTypeSettings.time_in_force && this.trading_session == ladderWidgetTypeSettings.trading_session && this.crypto_time_in_force == ladderWidgetTypeSettings.crypto_time_in_force && this.futures_time_in_force == ladderWidgetTypeSettings.futures_time_in_force && this.crypto_amount_type == ladderWidgetTypeSettings.crypto_amount_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.auto_send_trading_enabled)) * 37) + this.time_in_force.hashCode()) * 37) + this.trading_session.hashCode()) * 37) + this.crypto_time_in_force.hashCode()) * 37) + this.futures_time_in_force.hashCode()) * 37) + this.crypto_amount_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("auto_send_trading_enabled=" + this.auto_send_trading_enabled);
        arrayList.add("time_in_force=" + this.time_in_force);
        arrayList.add("trading_session=" + this.trading_session);
        arrayList.add("crypto_time_in_force=" + this.crypto_time_in_force);
        arrayList.add("futures_time_in_force=" + this.futures_time_in_force);
        arrayList.add("crypto_amount_type=" + this.crypto_amount_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "LadderWidgetTypeSettings{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LadderWidgetTypeSettings copy$default(LadderWidgetTypeSettings ladderWidgetTypeSettings, boolean z, EquityTimeInForce equityTimeInForce, EquityTradingSession equityTradingSession, CryptoTimeInForce cryptoTimeInForce, FuturesTimeInForce futuresTimeInForce, CryptoAmountType cryptoAmountType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ladderWidgetTypeSettings.auto_send_trading_enabled;
        }
        if ((i & 2) != 0) {
            equityTimeInForce = ladderWidgetTypeSettings.time_in_force;
        }
        if ((i & 4) != 0) {
            equityTradingSession = ladderWidgetTypeSettings.trading_session;
        }
        if ((i & 8) != 0) {
            cryptoTimeInForce = ladderWidgetTypeSettings.crypto_time_in_force;
        }
        if ((i & 16) != 0) {
            futuresTimeInForce = ladderWidgetTypeSettings.futures_time_in_force;
        }
        if ((i & 32) != 0) {
            cryptoAmountType = ladderWidgetTypeSettings.crypto_amount_type;
        }
        if ((i & 64) != 0) {
            byteString = ladderWidgetTypeSettings.unknownFields();
        }
        CryptoAmountType cryptoAmountType2 = cryptoAmountType;
        ByteString byteString2 = byteString;
        FuturesTimeInForce futuresTimeInForce2 = futuresTimeInForce;
        EquityTradingSession equityTradingSession2 = equityTradingSession;
        return ladderWidgetTypeSettings.copy(z, equityTimeInForce, equityTradingSession2, cryptoTimeInForce, futuresTimeInForce2, cryptoAmountType2, byteString2);
    }

    public final LadderWidgetTypeSettings copy(boolean auto_send_trading_enabled, EquityTimeInForce time_in_force, EquityTradingSession trading_session, CryptoTimeInForce crypto_time_in_force, FuturesTimeInForce futures_time_in_force, CryptoAmountType crypto_amount_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(trading_session, "trading_session");
        Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
        Intrinsics.checkNotNullParameter(futures_time_in_force, "futures_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_amount_type, "crypto_amount_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LadderWidgetTypeSettings(auto_send_trading_enabled, time_in_force, trading_session, crypto_time_in_force, futures_time_in_force, crypto_amount_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LadderWidgetTypeSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LadderWidgetTypeSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.LadderWidgetTypeSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LadderWidgetTypeSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAuto_send_trading_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getAuto_send_trading_enabled()));
                }
                if (value.getTime_in_force() != EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED) {
                    size += EquityTimeInForce.ADAPTER.encodedSizeWithTag(2, value.getTime_in_force());
                }
                if (value.getTrading_session() != EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED) {
                    size += EquityTradingSession.ADAPTER.encodedSizeWithTag(3, value.getTrading_session());
                }
                if (value.getCrypto_time_in_force() != CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED) {
                    size += CryptoTimeInForce.ADAPTER.encodedSizeWithTag(4, value.getCrypto_time_in_force());
                }
                if (value.getFutures_time_in_force() != FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED) {
                    size += FuturesTimeInForce.ADAPTER.encodedSizeWithTag(5, value.getFutures_time_in_force());
                }
                return value.getCrypto_amount_type() != CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED ? size + CryptoAmountType.ADAPTER.encodedSizeWithTag(6, value.getCrypto_amount_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LadderWidgetTypeSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAuto_send_trading_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getAuto_send_trading_enabled()));
                }
                if (value.getTime_in_force() != EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED) {
                    EquityTimeInForce.ADAPTER.encodeWithTag(writer, 2, (int) value.getTime_in_force());
                }
                if (value.getTrading_session() != EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 3, (int) value.getTrading_session());
                }
                if (value.getCrypto_time_in_force() != CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED) {
                    CryptoTimeInForce.ADAPTER.encodeWithTag(writer, 4, (int) value.getCrypto_time_in_force());
                }
                if (value.getFutures_time_in_force() != FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED) {
                    FuturesTimeInForce.ADAPTER.encodeWithTag(writer, 5, (int) value.getFutures_time_in_force());
                }
                if (value.getCrypto_amount_type() != CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED) {
                    CryptoAmountType.ADAPTER.encodeWithTag(writer, 6, (int) value.getCrypto_amount_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LadderWidgetTypeSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCrypto_amount_type() != CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED) {
                    CryptoAmountType.ADAPTER.encodeWithTag(writer, 6, (int) value.getCrypto_amount_type());
                }
                if (value.getFutures_time_in_force() != FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED) {
                    FuturesTimeInForce.ADAPTER.encodeWithTag(writer, 5, (int) value.getFutures_time_in_force());
                }
                if (value.getCrypto_time_in_force() != CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED) {
                    CryptoTimeInForce.ADAPTER.encodeWithTag(writer, 4, (int) value.getCrypto_time_in_force());
                }
                if (value.getTrading_session() != EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 3, (int) value.getTrading_session());
                }
                if (value.getTime_in_force() != EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED) {
                    EquityTimeInForce.ADAPTER.encodeWithTag(writer, 2, (int) value.getTime_in_force());
                }
                if (value.getAuto_send_trading_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getAuto_send_trading_enabled()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LadderWidgetTypeSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EquityTimeInForce equityTimeInForceDecode = EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED;
                EquityTradingSession equityTradingSession = EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED;
                CryptoTimeInForce cryptoTimeInForce = CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED;
                FuturesTimeInForce futuresTimeInForce = FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED;
                CryptoAmountType cryptoAmountType = CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                CryptoAmountType cryptoAmountTypeDecode = cryptoAmountType;
                FuturesTimeInForce futuresTimeInForceDecode = futuresTimeInForce;
                CryptoTimeInForce cryptoTimeInForceDecode = cryptoTimeInForce;
                EquityTradingSession equityTradingSessionDecode = equityTradingSession;
                while (true) {
                    EquityTimeInForce equityTimeInForce = equityTimeInForceDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 2:
                                    try {
                                        equityTimeInForceDecode = EquityTimeInForce.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        equityTradingSessionDecode = EquityTradingSession.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        cryptoTimeInForceDecode = CryptoTimeInForce.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        futuresTimeInForceDecode = FuturesTimeInForce.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                case 6:
                                    try {
                                        cryptoAmountTypeDecode = CryptoAmountType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new LadderWidgetTypeSettings(zBooleanValue, equityTimeInForce, equityTradingSessionDecode, cryptoTimeInForceDecode, futuresTimeInForceDecode, cryptoAmountTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LadderWidgetTypeSettings redact(LadderWidgetTypeSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LadderWidgetTypeSettings.copy$default(value, false, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
