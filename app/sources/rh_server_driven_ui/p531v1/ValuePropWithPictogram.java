package rh_server_driven_ui.p531v1;

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

/* compiled from: ValuePropWithPictogram.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropWithPictogram;", "Lcom/squareup/wire/Message;", "", "content", "Lrh_server_driven_ui/v1/ValuePropContent;", "pictogram", "Lrh_server_driven_ui/v1/Pictogram;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ValuePropContent;Lrh_server_driven_ui/v1/Pictogram;Lokio/ByteString;)V", "getContent", "()Lrh_server_driven_ui/v1/ValuePropContent;", "getPictogram", "()Lrh_server_driven_ui/v1/Pictogram;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ValuePropWithPictogram extends Message {

    @JvmField
    public static final ProtoAdapter<ValuePropWithPictogram> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ValuePropContent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ValuePropContent content;

    @WireField(adapter = "rh_server_driven_ui.v1.Pictogram#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Pictogram pictogram;

    public ValuePropWithPictogram() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29867newBuilder();
    }

    public final ValuePropContent getContent() {
        return this.content;
    }

    public final Pictogram getPictogram() {
        return this.pictogram;
    }

    public /* synthetic */ ValuePropWithPictogram(ValuePropContent valuePropContent, Pictogram pictogram, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : valuePropContent, (i & 2) != 0 ? Pictogram.PICTOGRAM_UNSPECIFIED : pictogram, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValuePropWithPictogram(ValuePropContent valuePropContent, Pictogram pictogram, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(pictogram, "pictogram");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.content = valuePropContent;
        this.pictogram = pictogram;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29867newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValuePropWithPictogram)) {
            return false;
        }
        ValuePropWithPictogram valuePropWithPictogram = (ValuePropWithPictogram) other;
        return Intrinsics.areEqual(unknownFields(), valuePropWithPictogram.unknownFields()) && Intrinsics.areEqual(this.content, valuePropWithPictogram.content) && this.pictogram == valuePropWithPictogram.pictogram;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ValuePropContent valuePropContent = this.content;
        int iHashCode2 = ((iHashCode + (valuePropContent != null ? valuePropContent.hashCode() : 0)) * 37) + this.pictogram.hashCode();
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
        arrayList.add("pictogram=" + this.pictogram);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValuePropWithPictogram{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValuePropWithPictogram copy$default(ValuePropWithPictogram valuePropWithPictogram, ValuePropContent valuePropContent, Pictogram pictogram, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            valuePropContent = valuePropWithPictogram.content;
        }
        if ((i & 2) != 0) {
            pictogram = valuePropWithPictogram.pictogram;
        }
        if ((i & 4) != 0) {
            byteString = valuePropWithPictogram.unknownFields();
        }
        return valuePropWithPictogram.copy(valuePropContent, pictogram, byteString);
    }

    public final ValuePropWithPictogram copy(ValuePropContent content, Pictogram pictogram, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(pictogram, "pictogram");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValuePropWithPictogram(content, pictogram, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValuePropWithPictogram.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValuePropWithPictogram>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ValuePropWithPictogram$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValuePropWithPictogram value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getContent() != null) {
                    size += ValuePropContent.ADAPTER.encodedSizeWithTag(1, value.getContent());
                }
                return value.getPictogram() != Pictogram.PICTOGRAM_UNSPECIFIED ? size + Pictogram.ADAPTER.encodedSizeWithTag(2, value.getPictogram()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValuePropWithPictogram value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getContent() != null) {
                    ValuePropContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                }
                if (value.getPictogram() != Pictogram.PICTOGRAM_UNSPECIFIED) {
                    Pictogram.ADAPTER.encodeWithTag(writer, 2, (int) value.getPictogram());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValuePropWithPictogram value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPictogram() != Pictogram.PICTOGRAM_UNSPECIFIED) {
                    Pictogram.ADAPTER.encodeWithTag(writer, 2, (int) value.getPictogram());
                }
                if (value.getContent() != null) {
                    ValuePropContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValuePropWithPictogram decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Pictogram pictogramDecode = Pictogram.PICTOGRAM_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ValuePropContent valuePropContentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValuePropWithPictogram(valuePropContentDecode, pictogramDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        valuePropContentDecode = ValuePropContent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            pictogramDecode = Pictogram.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValuePropWithPictogram redact(ValuePropWithPictogram value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ValuePropContent content = value.getContent();
                return ValuePropWithPictogram.copy$default(value, content != null ? ValuePropContent.ADAPTER.redact(content) : null, null, ByteString.EMPTY, 2, null);
            }
        };
    }
}
