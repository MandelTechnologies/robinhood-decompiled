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

/* compiled from: TableInstrumentNameState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableInstrumentNameState;", "Lcom/squareup/wire/Message;", "", "collapse_progress", "", "unknownFields", "Lokio/ByteString;", "<init>", "(FLokio/ByteString;)V", "getCollapse_progress", "()F", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TableInstrumentNameState extends Message {

    @JvmField
    public static final ProtoAdapter<TableInstrumentNameState> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "collapseProgress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final float collapse_progress;

    /* JADX WARN: Multi-variable type inference failed */
    public TableInstrumentNameState() {
        this(0.0f, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29828newBuilder();
    }

    public final float getCollapse_progress() {
        return this.collapse_progress;
    }

    public /* synthetic */ TableInstrumentNameState(float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TableInstrumentNameState(float f, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.collapse_progress = f;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29828newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TableInstrumentNameState)) {
            return false;
        }
        TableInstrumentNameState tableInstrumentNameState = (TableInstrumentNameState) other;
        return Intrinsics.areEqual(unknownFields(), tableInstrumentNameState.unknownFields()) && this.collapse_progress == tableInstrumentNameState.collapse_progress;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + Float.hashCode(this.collapse_progress);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("collapse_progress=" + this.collapse_progress);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TableInstrumentNameState{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TableInstrumentNameState copy$default(TableInstrumentNameState tableInstrumentNameState, float f, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            f = tableInstrumentNameState.collapse_progress;
        }
        if ((i & 2) != 0) {
            byteString = tableInstrumentNameState.unknownFields();
        }
        return tableInstrumentNameState.copy(f, byteString);
    }

    public final TableInstrumentNameState copy(float collapse_progress, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TableInstrumentNameState(collapse_progress, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TableInstrumentNameState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TableInstrumentNameState>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.TableInstrumentNameState$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TableInstrumentNameState value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return !Float.valueOf(value.getCollapse_progress()).equals(Float.valueOf(0.0f)) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getCollapse_progress())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TableInstrumentNameState value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Float.valueOf(value.getCollapse_progress()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getCollapse_progress()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TableInstrumentNameState value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (Float.valueOf(value.getCollapse_progress()).equals(Float.valueOf(0.0f))) {
                    return;
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getCollapse_progress()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TableInstrumentNameState redact(TableInstrumentNameState value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TableInstrumentNameState.copy$default(value, 0.0f, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TableInstrumentNameState decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                float fFloatValue = 0.0f;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TableInstrumentNameState(fFloatValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
