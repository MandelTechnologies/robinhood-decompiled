package rh_server_driven_ui.p531v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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

/* compiled from: ValuePropWithNumber.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropWithNumber;", "Lcom/squareup/wire/Message;", "", "content", "Lrh_server_driven_ui/v1/ValuePropContent;", InquiryField.FloatField.TYPE2, "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ValuePropContent;ILokio/ByteString;)V", "getContent", "()Lrh_server_driven_ui/v1/ValuePropContent;", "getNumber", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ValuePropWithNumber extends Message {

    @JvmField
    public static final ProtoAdapter<ValuePropWithNumber> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ValuePropContent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ValuePropContent content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int number;

    public ValuePropWithNumber() {
        this(null, 0, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29866newBuilder();
    }

    public final ValuePropContent getContent() {
        return this.content;
    }

    public final int getNumber() {
        return this.number;
    }

    public /* synthetic */ ValuePropWithNumber(ValuePropContent valuePropContent, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : valuePropContent, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValuePropWithNumber(ValuePropContent valuePropContent, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.content = valuePropContent;
        this.number = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29866newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValuePropWithNumber)) {
            return false;
        }
        ValuePropWithNumber valuePropWithNumber = (ValuePropWithNumber) other;
        return Intrinsics.areEqual(unknownFields(), valuePropWithNumber.unknownFields()) && Intrinsics.areEqual(this.content, valuePropWithNumber.content) && this.number == valuePropWithNumber.number;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ValuePropContent valuePropContent = this.content;
        int iHashCode2 = ((iHashCode + (valuePropContent != null ? valuePropContent.hashCode() : 0)) * 37) + Integer.hashCode(this.number);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ValuePropContent valuePropContent = this.content;
        if (valuePropContent != null) {
            arrayList.add("content=" + valuePropContent);
        }
        arrayList.add("number=" + this.number);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValuePropWithNumber{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValuePropWithNumber copy$default(ValuePropWithNumber valuePropWithNumber, ValuePropContent valuePropContent, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            valuePropContent = valuePropWithNumber.content;
        }
        if ((i2 & 2) != 0) {
            i = valuePropWithNumber.number;
        }
        if ((i2 & 4) != 0) {
            byteString = valuePropWithNumber.unknownFields();
        }
        return valuePropWithNumber.copy(valuePropContent, i, byteString);
    }

    public final ValuePropWithNumber copy(ValuePropContent content, int number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValuePropWithNumber(content, number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValuePropWithNumber.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValuePropWithNumber>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ValuePropWithNumber$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValuePropWithNumber value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getContent() != null) {
                    size += ValuePropContent.ADAPTER.encodedSizeWithTag(1, value.getContent());
                }
                return value.getNumber() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getNumber())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValuePropWithNumber value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getContent() != null) {
                    ValuePropContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                }
                if (value.getNumber() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getNumber()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValuePropWithNumber value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNumber() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getNumber()));
                }
                if (value.getContent() != null) {
                    ValuePropContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValuePropWithNumber redact(ValuePropWithNumber value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ValuePropContent content = value.getContent();
                return ValuePropWithNumber.copy$default(value, content != null ? ValuePropContent.ADAPTER.redact(content) : null, 0, ByteString.EMPTY, 2, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValuePropWithNumber decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ValuePropContent valuePropContentDecode = null;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValuePropWithNumber(valuePropContentDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        valuePropContentDecode = ValuePropContent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
