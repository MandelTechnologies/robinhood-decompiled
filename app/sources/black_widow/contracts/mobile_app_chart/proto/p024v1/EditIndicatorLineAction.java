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

/* compiled from: EditIndicatorLineAction.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/EditIndicatorLineAction;", "Lcom/squareup/wire/Message;", "", "line_title", "", "line_value", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValue;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValue;Lokio/ByteString;)V", "getLine_title", "()Ljava/lang/String;", "getLine_value", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValue;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class EditIndicatorLineAction extends Message {

    @JvmField
    public static final ProtoAdapter<EditIndicatorLineAction> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lineTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String line_title;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.LineValue#ADAPTER", jsonName = "lineValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final LineValue line_value;

    public EditIndicatorLineAction() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8585newBuilder();
    }

    public final String getLine_title() {
        return this.line_title;
    }

    public /* synthetic */ EditIndicatorLineAction(String str, LineValue lineValue, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : lineValue, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final LineValue getLine_value() {
        return this.line_value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditIndicatorLineAction(String line_title, LineValue lineValue, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(line_title, "line_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.line_title = line_title;
        this.line_value = lineValue;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8585newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EditIndicatorLineAction)) {
            return false;
        }
        EditIndicatorLineAction editIndicatorLineAction = (EditIndicatorLineAction) other;
        return Intrinsics.areEqual(unknownFields(), editIndicatorLineAction.unknownFields()) && Intrinsics.areEqual(this.line_title, editIndicatorLineAction.line_title) && Intrinsics.areEqual(this.line_value, editIndicatorLineAction.line_value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.line_title.hashCode()) * 37;
        LineValue lineValue = this.line_value;
        int iHashCode2 = iHashCode + (lineValue != null ? lineValue.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("line_title=" + Internal.sanitize(this.line_title));
        LineValue lineValue = this.line_value;
        if (lineValue != null) {
            arrayList.add("line_value=" + lineValue);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EditIndicatorLineAction{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EditIndicatorLineAction copy$default(EditIndicatorLineAction editIndicatorLineAction, String str, LineValue lineValue, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editIndicatorLineAction.line_title;
        }
        if ((i & 2) != 0) {
            lineValue = editIndicatorLineAction.line_value;
        }
        if ((i & 4) != 0) {
            byteString = editIndicatorLineAction.unknownFields();
        }
        return editIndicatorLineAction.copy(str, lineValue, byteString);
    }

    public final EditIndicatorLineAction copy(String line_title, LineValue line_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(line_title, "line_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EditIndicatorLineAction(line_title, line_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EditIndicatorLineAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EditIndicatorLineAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.EditIndicatorLineAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EditIndicatorLineAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLine_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLine_title());
                }
                return value.getLine_value() != null ? size + LineValue.ADAPTER.encodedSizeWithTag(3, value.getLine_value()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EditIndicatorLineAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLine_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLine_title());
                }
                if (value.getLine_value() != null) {
                    LineValue.ADAPTER.encodeWithTag(writer, 3, (int) value.getLine_value());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EditIndicatorLineAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLine_value() != null) {
                    LineValue.ADAPTER.encodeWithTag(writer, 3, (int) value.getLine_value());
                }
                if (Intrinsics.areEqual(value.getLine_title(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLine_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EditIndicatorLineAction redact(EditIndicatorLineAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                LineValue line_value = value.getLine_value();
                return EditIndicatorLineAction.copy$default(value, null, line_value != null ? LineValue.ADAPTER.redact(line_value) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EditIndicatorLineAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                LineValue lineValueDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EditIndicatorLineAction(strDecode, lineValueDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        lineValueDecode = LineValue.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
