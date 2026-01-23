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

/* compiled from: DottedLineType.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lrh_server_driven_ui/v1/DottedLineType;", "Lcom/squareup/wire/Message;", "", "dash_gap", "", "unknownFields", "Lokio/ByteString;", "<init>", "(FLokio/ByteString;)V", "getDash_gap", "()F", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class DottedLineType extends Message {

    @JvmField
    public static final ProtoAdapter<DottedLineType> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "dashGap", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final float dash_gap;

    /* JADX WARN: Multi-variable type inference failed */
    public DottedLineType() {
        this(0.0f, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29737newBuilder();
    }

    public final float getDash_gap() {
        return this.dash_gap;
    }

    public /* synthetic */ DottedLineType(float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DottedLineType(float f, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.dash_gap = f;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29737newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DottedLineType)) {
            return false;
        }
        DottedLineType dottedLineType = (DottedLineType) other;
        return Intrinsics.areEqual(unknownFields(), dottedLineType.unknownFields()) && this.dash_gap == dottedLineType.dash_gap;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + Float.hashCode(this.dash_gap);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("dash_gap=" + this.dash_gap);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DottedLineType{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DottedLineType copy$default(DottedLineType dottedLineType, float f, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dottedLineType.dash_gap;
        }
        if ((i & 2) != 0) {
            byteString = dottedLineType.unknownFields();
        }
        return dottedLineType.copy(f, byteString);
    }

    public final DottedLineType copy(float dash_gap, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DottedLineType(dash_gap, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DottedLineType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DottedLineType>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.DottedLineType$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DottedLineType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return !Float.valueOf(value.getDash_gap()).equals(Float.valueOf(0.0f)) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getDash_gap())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DottedLineType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Float.valueOf(value.getDash_gap()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getDash_gap()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DottedLineType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (Float.valueOf(value.getDash_gap()).equals(Float.valueOf(0.0f))) {
                    return;
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getDash_gap()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DottedLineType redact(DottedLineType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DottedLineType.copy$default(value, 0.0f, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DottedLineType decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                float fFloatValue = 0.0f;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DottedLineType(fFloatValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
