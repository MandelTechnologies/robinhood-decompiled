package hippo.model.p469v1;

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

/* compiled from: EquityOrderFormSettings.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lhippo/model/v1/EquityOrderFormSettings;", "Lcom/squareup/wire/Message;", "", "equity_last_selected_session", "Lhippo/model/v1/EquityTradingSession;", "equity_quantity_type", "Lhippo/model/v1/EquityQuantityType;", "equity_trail_type_unit", "Lhippo/model/v1/EquityTrailType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lhippo/model/v1/EquityTradingSession;Lhippo/model/v1/EquityQuantityType;Lhippo/model/v1/EquityTrailType;Lokio/ByteString;)V", "getEquity_last_selected_session", "()Lhippo/model/v1/EquityTradingSession;", "getEquity_quantity_type", "()Lhippo/model/v1/EquityQuantityType;", "getEquity_trail_type_unit", "()Lhippo/model/v1/EquityTrailType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EquityOrderFormSettings extends Message {

    @JvmField
    public static final ProtoAdapter<EquityOrderFormSettings> ADAPTER;

    @WireField(adapter = "hippo.model.v1.EquityTradingSession#ADAPTER", jsonName = "equityLastSelectedSession", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EquityTradingSession equity_last_selected_session;

    @WireField(adapter = "hippo.model.v1.EquityQuantityType#ADAPTER", jsonName = "equityQuantityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EquityQuantityType equity_quantity_type;

    @WireField(adapter = "hippo.model.v1.EquityTrailType#ADAPTER", jsonName = "equityTrailTypeUnit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final EquityTrailType equity_trail_type_unit;

    public EquityOrderFormSettings() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28243newBuilder();
    }

    public final EquityTradingSession getEquity_last_selected_session() {
        return this.equity_last_selected_session;
    }

    public /* synthetic */ EquityOrderFormSettings(EquityTradingSession equityTradingSession, EquityQuantityType equityQuantityType, EquityTrailType equityTrailType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED : equityTradingSession, (i & 2) != 0 ? EquityQuantityType.EQUITY_QUANTITY_TYPE_UNSPECIFIED : equityQuantityType, (i & 4) != 0 ? EquityTrailType.EQUITY_TRAIL_TYPE_UNSPECIFIED : equityTrailType, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final EquityQuantityType getEquity_quantity_type() {
        return this.equity_quantity_type;
    }

    public final EquityTrailType getEquity_trail_type_unit() {
        return this.equity_trail_type_unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderFormSettings(EquityTradingSession equity_last_selected_session, EquityQuantityType equity_quantity_type, EquityTrailType equity_trail_type_unit, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(equity_last_selected_session, "equity_last_selected_session");
        Intrinsics.checkNotNullParameter(equity_quantity_type, "equity_quantity_type");
        Intrinsics.checkNotNullParameter(equity_trail_type_unit, "equity_trail_type_unit");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.equity_last_selected_session = equity_last_selected_session;
        this.equity_quantity_type = equity_quantity_type;
        this.equity_trail_type_unit = equity_trail_type_unit;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28243newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EquityOrderFormSettings)) {
            return false;
        }
        EquityOrderFormSettings equityOrderFormSettings = (EquityOrderFormSettings) other;
        return Intrinsics.areEqual(unknownFields(), equityOrderFormSettings.unknownFields()) && this.equity_last_selected_session == equityOrderFormSettings.equity_last_selected_session && this.equity_quantity_type == equityOrderFormSettings.equity_quantity_type && this.equity_trail_type_unit == equityOrderFormSettings.equity_trail_type_unit;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.equity_last_selected_session.hashCode()) * 37) + this.equity_quantity_type.hashCode()) * 37) + this.equity_trail_type_unit.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("equity_last_selected_session=" + this.equity_last_selected_session);
        arrayList.add("equity_quantity_type=" + this.equity_quantity_type);
        arrayList.add("equity_trail_type_unit=" + this.equity_trail_type_unit);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EquityOrderFormSettings{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EquityOrderFormSettings copy$default(EquityOrderFormSettings equityOrderFormSettings, EquityTradingSession equityTradingSession, EquityQuantityType equityQuantityType, EquityTrailType equityTrailType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            equityTradingSession = equityOrderFormSettings.equity_last_selected_session;
        }
        if ((i & 2) != 0) {
            equityQuantityType = equityOrderFormSettings.equity_quantity_type;
        }
        if ((i & 4) != 0) {
            equityTrailType = equityOrderFormSettings.equity_trail_type_unit;
        }
        if ((i & 8) != 0) {
            byteString = equityOrderFormSettings.unknownFields();
        }
        return equityOrderFormSettings.copy(equityTradingSession, equityQuantityType, equityTrailType, byteString);
    }

    public final EquityOrderFormSettings copy(EquityTradingSession equity_last_selected_session, EquityQuantityType equity_quantity_type, EquityTrailType equity_trail_type_unit, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(equity_last_selected_session, "equity_last_selected_session");
        Intrinsics.checkNotNullParameter(equity_quantity_type, "equity_quantity_type");
        Intrinsics.checkNotNullParameter(equity_trail_type_unit, "equity_trail_type_unit");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EquityOrderFormSettings(equity_last_selected_session, equity_quantity_type, equity_trail_type_unit, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquityOrderFormSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EquityOrderFormSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.EquityOrderFormSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EquityOrderFormSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEquity_last_selected_session() != EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED) {
                    size += EquityTradingSession.ADAPTER.encodedSizeWithTag(1, value.getEquity_last_selected_session());
                }
                if (value.getEquity_quantity_type() != EquityQuantityType.EQUITY_QUANTITY_TYPE_UNSPECIFIED) {
                    size += EquityQuantityType.ADAPTER.encodedSizeWithTag(2, value.getEquity_quantity_type());
                }
                return value.getEquity_trail_type_unit() != EquityTrailType.EQUITY_TRAIL_TYPE_UNSPECIFIED ? size + EquityTrailType.ADAPTER.encodedSizeWithTag(3, value.getEquity_trail_type_unit()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EquityOrderFormSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEquity_last_selected_session() != EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 1, (int) value.getEquity_last_selected_session());
                }
                if (value.getEquity_quantity_type() != EquityQuantityType.EQUITY_QUANTITY_TYPE_UNSPECIFIED) {
                    EquityQuantityType.ADAPTER.encodeWithTag(writer, 2, (int) value.getEquity_quantity_type());
                }
                if (value.getEquity_trail_type_unit() != EquityTrailType.EQUITY_TRAIL_TYPE_UNSPECIFIED) {
                    EquityTrailType.ADAPTER.encodeWithTag(writer, 3, (int) value.getEquity_trail_type_unit());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EquityOrderFormSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEquity_trail_type_unit() != EquityTrailType.EQUITY_TRAIL_TYPE_UNSPECIFIED) {
                    EquityTrailType.ADAPTER.encodeWithTag(writer, 3, (int) value.getEquity_trail_type_unit());
                }
                if (value.getEquity_quantity_type() != EquityQuantityType.EQUITY_QUANTITY_TYPE_UNSPECIFIED) {
                    EquityQuantityType.ADAPTER.encodeWithTag(writer, 2, (int) value.getEquity_quantity_type());
                }
                if (value.getEquity_last_selected_session() != EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 1, (int) value.getEquity_last_selected_session());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EquityOrderFormSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EquityTradingSession equityTradingSessionDecode = EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED;
                EquityQuantityType equityQuantityTypeDecode = EquityQuantityType.EQUITY_QUANTITY_TYPE_UNSPECIFIED;
                EquityTrailType equityTrailTypeDecode = EquityTrailType.EQUITY_TRAIL_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EquityOrderFormSettings(equityTradingSessionDecode, equityQuantityTypeDecode, equityTrailTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            equityTradingSessionDecode = EquityTradingSession.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            equityQuantityTypeDecode = EquityQuantityType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            equityTrailTypeDecode = EquityTrailType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EquityOrderFormSettings redact(EquityOrderFormSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EquityOrderFormSettings.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
