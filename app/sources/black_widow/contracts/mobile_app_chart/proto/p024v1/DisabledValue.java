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

/* compiled from: DisabledValue.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/DisabledValue;", "Lcom/squareup/wire/Message;", "", "field_name", "", "error_message", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getField_name", "()Ljava/lang/String;", "getError_message", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class DisabledValue extends Message {

    @JvmField
    public static final ProtoAdapter<DisabledValue> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", schemaIndex = 1, tag = 2)
    private final String error_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fieldName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String field_name;

    public DisabledValue() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8584newBuilder();
    }

    public final String getField_name() {
        return this.field_name;
    }

    public /* synthetic */ DisabledValue(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getError_message() {
        return this.error_message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisabledValue(String field_name, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(field_name, "field_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.field_name = field_name;
        this.error_message = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8584newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DisabledValue)) {
            return false;
        }
        DisabledValue disabledValue = (DisabledValue) other;
        return Intrinsics.areEqual(unknownFields(), disabledValue.unknownFields()) && Intrinsics.areEqual(this.field_name, disabledValue.field_name) && Intrinsics.areEqual(this.error_message, disabledValue.error_message);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.field_name.hashCode()) * 37;
        String str = this.error_message;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("field_name=" + Internal.sanitize(this.field_name));
        String str = this.error_message;
        if (str != null) {
            arrayList.add("error_message=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisabledValue{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DisabledValue copy$default(DisabledValue disabledValue, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disabledValue.field_name;
        }
        if ((i & 2) != 0) {
            str2 = disabledValue.error_message;
        }
        if ((i & 4) != 0) {
            byteString = disabledValue.unknownFields();
        }
        return disabledValue.copy(str, str2, byteString);
    }

    public final DisabledValue copy(String field_name, String error_message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(field_name, "field_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DisabledValue(field_name, error_message, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DisabledValue.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DisabledValue>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.DisabledValue$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DisabledValue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getField_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getField_name());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getError_message());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DisabledValue value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getField_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getField_name());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getError_message());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DisabledValue value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getError_message());
                if (Intrinsics.areEqual(value.getField_name(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getField_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisabledValue redact(DisabledValue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DisabledValue.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DisabledValue decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DisabledValue(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
