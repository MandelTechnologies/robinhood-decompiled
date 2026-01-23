package black_widow.contracts.mobile_app_chart.proto.p024v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
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

/* compiled from: IndicatorParameterValue.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u001dR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "Lcom/squareup/wire/Message;", "", "string_value", "", "number_value", "", "bool_value", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Lokio/ByteString;)V", "getString_value", "()Ljava/lang/String;", "getNumber_value", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBool_value", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Lokio/ByteString;)Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IndicatorParameterValue extends Message {

    @JvmField
    public static final ProtoAdapter<IndicatorParameterValue> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "boolValue", oneofName = "value", schemaIndex = 2, tag = 8)
    private final Boolean bool_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "numberValue", oneofName = "value", schemaIndex = 1, tag = 7)
    private final Double number_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stringValue", oneofName = "value", schemaIndex = 0, tag = 6)
    private final String string_value;

    public IndicatorParameterValue() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8608newBuilder();
    }

    public final String getString_value() {
        return this.string_value;
    }

    public final Double getNumber_value() {
        return this.number_value;
    }

    public final Boolean getBool_value() {
        return this.bool_value;
    }

    public /* synthetic */ IndicatorParameterValue(String str, Double d, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorParameterValue(String str, Double d, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.string_value = str;
        this.number_value = d;
        this.bool_value = bool;
        if (Internal.countNonNull(str, d, bool) > 1) {
            throw new IllegalArgumentException("At most one of string_value, number_value, bool_value may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8608newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IndicatorParameterValue)) {
            return false;
        }
        IndicatorParameterValue indicatorParameterValue = (IndicatorParameterValue) other;
        return Intrinsics.areEqual(unknownFields(), indicatorParameterValue.unknownFields()) && Intrinsics.areEqual(this.string_value, indicatorParameterValue.string_value) && Intrinsics.areEqual(this.number_value, indicatorParameterValue.number_value) && Intrinsics.areEqual(this.bool_value, indicatorParameterValue.bool_value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.string_value;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Double d = this.number_value;
        int iHashCode3 = (iHashCode2 + (d != null ? d.hashCode() : 0)) * 37;
        Boolean bool = this.bool_value;
        int iHashCode4 = iHashCode3 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.string_value;
        if (str != null) {
            arrayList.add("string_value=" + Internal.sanitize(str));
        }
        Double d = this.number_value;
        if (d != null) {
            arrayList.add("number_value=" + d);
        }
        Boolean bool = this.bool_value;
        if (bool != null) {
            arrayList.add("bool_value=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IndicatorParameterValue{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IndicatorParameterValue copy$default(IndicatorParameterValue indicatorParameterValue, String str, Double d, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indicatorParameterValue.string_value;
        }
        if ((i & 2) != 0) {
            d = indicatorParameterValue.number_value;
        }
        if ((i & 4) != 0) {
            bool = indicatorParameterValue.bool_value;
        }
        if ((i & 8) != 0) {
            byteString = indicatorParameterValue.unknownFields();
        }
        return indicatorParameterValue.copy(str, d, bool, byteString);
    }

    public final IndicatorParameterValue copy(String string_value, Double number_value, Boolean bool_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IndicatorParameterValue(string_value, number_value, bool_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndicatorParameterValue.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IndicatorParameterValue>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterValue$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IndicatorParameterValue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getString_value()) + ProtoAdapter.DOUBLE.encodedSizeWithTag(7, value.getNumber_value()) + ProtoAdapter.BOOL.encodedSizeWithTag(8, value.getBool_value());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IndicatorParameterValue value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getString_value());
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) value.getNumber_value());
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) value.getBool_value());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IndicatorParameterValue value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) value.getBool_value());
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) value.getNumber_value());
                ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getString_value());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorParameterValue redact(IndicatorParameterValue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IndicatorParameterValue.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorParameterValue decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                Double dDecode = null;
                Boolean boolDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IndicatorParameterValue(strDecode, dDecode, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 6) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 7) {
                        dDecode = ProtoAdapter.DOUBLE.decode(reader);
                    } else if (iNextTag == 8) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
