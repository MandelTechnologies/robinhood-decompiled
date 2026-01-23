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

/* compiled from: EditIndicatorParameterAction.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/EditIndicatorParameterAction;", "Lcom/squareup/wire/Message;", "", "parameter_id_value", "", "value", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;Lokio/ByteString;)V", "getParameter_id_value", "()Ljava/lang/String;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class EditIndicatorParameterAction extends Message {

    @JvmField
    public static final ProtoAdapter<EditIndicatorParameterAction> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "parameterIdValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 3)
    private final String parameter_id_value;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterValue#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final IndicatorParameterValue value;

    public EditIndicatorParameterAction() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8586newBuilder();
    }

    public final String getParameter_id_value() {
        return this.parameter_id_value;
    }

    public /* synthetic */ EditIndicatorParameterAction(String str, IndicatorParameterValue indicatorParameterValue, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : indicatorParameterValue, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final IndicatorParameterValue getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditIndicatorParameterAction(String parameter_id_value, IndicatorParameterValue indicatorParameterValue, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(parameter_id_value, "parameter_id_value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.parameter_id_value = parameter_id_value;
        this.value = indicatorParameterValue;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8586newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EditIndicatorParameterAction)) {
            return false;
        }
        EditIndicatorParameterAction editIndicatorParameterAction = (EditIndicatorParameterAction) other;
        return Intrinsics.areEqual(unknownFields(), editIndicatorParameterAction.unknownFields()) && Intrinsics.areEqual(this.parameter_id_value, editIndicatorParameterAction.parameter_id_value) && Intrinsics.areEqual(this.value, editIndicatorParameterAction.value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.parameter_id_value.hashCode()) * 37;
        IndicatorParameterValue indicatorParameterValue = this.value;
        int iHashCode2 = iHashCode + (indicatorParameterValue != null ? indicatorParameterValue.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("parameter_id_value=" + Internal.sanitize(this.parameter_id_value));
        IndicatorParameterValue indicatorParameterValue = this.value;
        if (indicatorParameterValue != null) {
            arrayList.add("value=" + indicatorParameterValue);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EditIndicatorParameterAction{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EditIndicatorParameterAction copy$default(EditIndicatorParameterAction editIndicatorParameterAction, String str, IndicatorParameterValue indicatorParameterValue, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editIndicatorParameterAction.parameter_id_value;
        }
        if ((i & 2) != 0) {
            indicatorParameterValue = editIndicatorParameterAction.value;
        }
        if ((i & 4) != 0) {
            byteString = editIndicatorParameterAction.unknownFields();
        }
        return editIndicatorParameterAction.copy(str, indicatorParameterValue, byteString);
    }

    public final EditIndicatorParameterAction copy(String parameter_id_value, IndicatorParameterValue value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(parameter_id_value, "parameter_id_value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EditIndicatorParameterAction(parameter_id_value, value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EditIndicatorParameterAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EditIndicatorParameterAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.EditIndicatorParameterAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EditIndicatorParameterAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getParameter_id_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getParameter_id_value());
                }
                return value.getValue() != null ? size + IndicatorParameterValue.ADAPTER.encodedSizeWithTag(2, value.getValue()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EditIndicatorParameterAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getParameter_id_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getParameter_id_value());
                }
                if (value.getValue() != null) {
                    IndicatorParameterValue.ADAPTER.encodeWithTag(writer, 2, (int) value.getValue());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EditIndicatorParameterAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getValue() != null) {
                    IndicatorParameterValue.ADAPTER.encodeWithTag(writer, 2, (int) value.getValue());
                }
                if (Intrinsics.areEqual(value.getParameter_id_value(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getParameter_id_value());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EditIndicatorParameterAction redact(EditIndicatorParameterAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IndicatorParameterValue value2 = value.getValue();
                return EditIndicatorParameterAction.copy$default(value, null, value2 != null ? IndicatorParameterValue.ADAPTER.redact(value2) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EditIndicatorParameterAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                IndicatorParameterValue indicatorParameterValueDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EditIndicatorParameterAction(strDecode, indicatorParameterValueDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 2) {
                        indicatorParameterValueDecode = IndicatorParameterValue.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
