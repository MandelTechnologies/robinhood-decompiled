package bonfire.proto.idl.copilot.p032v1;

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

/* compiled from: FeedbackReason.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/FeedbackReason;", "Lcom/squareup/wire/Message;", "", "display_title", "", "selected", "", "enum_value", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZILokio/ByteString;)V", "getDisplay_title", "()Ljava/lang/String;", "getSelected", "()Z", "getEnum_value", "()I", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class FeedbackReason extends Message {

    @JvmField
    public static final ProtoAdapter<FeedbackReason> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String display_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "enumValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int enum_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean selected;

    public FeedbackReason() {
        this(null, false, 0, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8857newBuilder();
    }

    public final String getDisplay_title() {
        return this.display_title;
    }

    public /* synthetic */ FeedbackReason(String str, boolean z, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getEnum_value() {
        return this.enum_value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackReason(String display_title, boolean z, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(display_title, "display_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.display_title = display_title;
        this.selected = z;
        this.enum_value = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8857newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeedbackReason)) {
            return false;
        }
        FeedbackReason feedbackReason = (FeedbackReason) other;
        return Intrinsics.areEqual(unknownFields(), feedbackReason.unknownFields()) && Intrinsics.areEqual(this.display_title, feedbackReason.display_title) && this.selected == feedbackReason.selected && this.enum_value == feedbackReason.enum_value;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.display_title.hashCode()) * 37) + Boolean.hashCode(this.selected)) * 37) + Integer.hashCode(this.enum_value);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("display_title=" + Internal.sanitize(this.display_title));
        arrayList.add("selected=" + this.selected);
        arrayList.add("enum_value=" + this.enum_value);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeedbackReason{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FeedbackReason copy$default(FeedbackReason feedbackReason, String str, boolean z, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedbackReason.display_title;
        }
        if ((i2 & 2) != 0) {
            z = feedbackReason.selected;
        }
        if ((i2 & 4) != 0) {
            i = feedbackReason.enum_value;
        }
        if ((i2 & 8) != 0) {
            byteString = feedbackReason.unknownFields();
        }
        return feedbackReason.copy(str, z, i, byteString);
    }

    public final FeedbackReason copy(String display_title, boolean selected, int enum_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(display_title, "display_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeedbackReason(display_title, selected, enum_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeedbackReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeedbackReason>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.FeedbackReason$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeedbackReason value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDisplay_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDisplay_title());
                }
                if (value.getSelected()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getSelected()));
                }
                return value.getEnum_value() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getEnum_value())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeedbackReason value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDisplay_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDisplay_title());
                }
                if (value.getSelected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getSelected()));
                }
                if (value.getEnum_value() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getEnum_value()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeedbackReason value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEnum_value() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getEnum_value()));
                }
                if (value.getSelected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getSelected()));
                }
                if (Intrinsics.areEqual(value.getDisplay_title(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDisplay_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeedbackReason redact(FeedbackReason value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FeedbackReason.copy$default(value, null, false, 0, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FeedbackReason decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FeedbackReason(strDecode, zBooleanValue, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
