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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: IndicatorValidationInfo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J@\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorValidationInfo;", "Lcom/squareup/wire/Message;", "", "parameter_id_value", "", "message", "prevents_calculation", "", "disabled_values", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/DisabledValue;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lokio/ByteString;)V", "getParameter_id_value", "()Ljava/lang/String;", "getMessage", "getPrevents_calculation", "()Z", "getDisabled_values", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IndicatorValidationInfo extends Message {

    @JvmField
    public static final ProtoAdapter<IndicatorValidationInfo> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.DisabledValue#ADAPTER", jsonName = "disabledValues", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<DisabledValue> disabled_values;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "parameterIdValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 5)
    private final String parameter_id_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "preventsCalculation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean prevents_calculation;

    public IndicatorValidationInfo() {
        this(null, null, false, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8615newBuilder();
    }

    public final String getParameter_id_value() {
        return this.parameter_id_value;
    }

    public /* synthetic */ IndicatorValidationInfo(String str, String str2, boolean z, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getPrevents_calculation() {
        return this.prevents_calculation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorValidationInfo(String parameter_id_value, String str, boolean z, List<DisabledValue> disabled_values, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(parameter_id_value, "parameter_id_value");
        Intrinsics.checkNotNullParameter(disabled_values, "disabled_values");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.parameter_id_value = parameter_id_value;
        this.message = str;
        this.prevents_calculation = z;
        this.disabled_values = Internal.immutableCopyOf("disabled_values", disabled_values);
    }

    public final List<DisabledValue> getDisabled_values() {
        return this.disabled_values;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8615newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IndicatorValidationInfo)) {
            return false;
        }
        IndicatorValidationInfo indicatorValidationInfo = (IndicatorValidationInfo) other;
        return Intrinsics.areEqual(unknownFields(), indicatorValidationInfo.unknownFields()) && Intrinsics.areEqual(this.parameter_id_value, indicatorValidationInfo.parameter_id_value) && Intrinsics.areEqual(this.message, indicatorValidationInfo.message) && this.prevents_calculation == indicatorValidationInfo.prevents_calculation && Intrinsics.areEqual(this.disabled_values, indicatorValidationInfo.disabled_values);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.parameter_id_value.hashCode()) * 37;
        String str = this.message;
        int iHashCode2 = ((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.prevents_calculation)) * 37) + this.disabled_values.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("parameter_id_value=" + Internal.sanitize(this.parameter_id_value));
        String str = this.message;
        if (str != null) {
            arrayList.add("message=" + Internal.sanitize(str));
        }
        arrayList.add("prevents_calculation=" + this.prevents_calculation);
        if (!this.disabled_values.isEmpty()) {
            arrayList.add("disabled_values=" + this.disabled_values);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IndicatorValidationInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IndicatorValidationInfo copy$default(IndicatorValidationInfo indicatorValidationInfo, String str, String str2, boolean z, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indicatorValidationInfo.parameter_id_value;
        }
        if ((i & 2) != 0) {
            str2 = indicatorValidationInfo.message;
        }
        if ((i & 4) != 0) {
            z = indicatorValidationInfo.prevents_calculation;
        }
        if ((i & 8) != 0) {
            list = indicatorValidationInfo.disabled_values;
        }
        if ((i & 16) != 0) {
            byteString = indicatorValidationInfo.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z2 = z;
        return indicatorValidationInfo.copy(str, str2, z2, list, byteString2);
    }

    public final IndicatorValidationInfo copy(String parameter_id_value, String message, boolean prevents_calculation, List<DisabledValue> disabled_values, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(parameter_id_value, "parameter_id_value");
        Intrinsics.checkNotNullParameter(disabled_values, "disabled_values");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IndicatorValidationInfo(parameter_id_value, message, prevents_calculation, disabled_values, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndicatorValidationInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IndicatorValidationInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorValidationInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IndicatorValidationInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getParameter_id_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getParameter_id_value());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMessage());
                if (value.getPrevents_calculation()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getPrevents_calculation()));
                }
                return iEncodedSizeWithTag + DisabledValue.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getDisabled_values());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IndicatorValidationInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getParameter_id_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getParameter_id_value());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage());
                if (value.getPrevents_calculation()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getPrevents_calculation()));
                }
                DisabledValue.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getDisabled_values());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IndicatorValidationInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                DisabledValue.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getDisabled_values());
                if (value.getPrevents_calculation()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getPrevents_calculation()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getMessage());
                if (Intrinsics.areEqual(value.getParameter_id_value(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 5, (int) value.getParameter_id_value());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorValidationInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IndicatorValidationInfo(strDecode, strDecode2, zBooleanValue, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 4) {
                        arrayList.add(DisabledValue.ADAPTER.decode(reader));
                    } else if (iNextTag == 5) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorValidationInfo redact(IndicatorValidationInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IndicatorValidationInfo.copy$default(value, null, null, false, Internal.m26823redactElements(value.getDisabled_values(), DisabledValue.ADAPTER), ByteString.EMPTY, 7, null);
            }
        };
    }
}
