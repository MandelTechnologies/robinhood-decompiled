package eoy_giveaway.p456v1;

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

/* compiled from: ShowSystemShareScreenRequest.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J*\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Leoy_giveaway/v1/ShowSystemShareScreenRequest;", "Lcom/squareup/wire/Message;", "", "contents", "", "", "include_canvas_image", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;ZLokio/ByteString;)V", "getInclude_canvas_image", "()Z", "getContents", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ShowSystemShareScreenRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ShowSystemShareScreenRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> contents;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "includeCanvasImage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean include_canvas_image;

    public ShowSystemShareScreenRequest() {
        this(null, false, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27985newBuilder();
    }

    public /* synthetic */ ShowSystemShareScreenRequest(List list, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getInclude_canvas_image() {
        return this.include_canvas_image;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowSystemShareScreenRequest(List<String> contents, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.include_canvas_image = z;
        this.contents = Internal.immutableCopyOf("contents", contents);
    }

    public final List<String> getContents() {
        return this.contents;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27985newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ShowSystemShareScreenRequest)) {
            return false;
        }
        ShowSystemShareScreenRequest showSystemShareScreenRequest = (ShowSystemShareScreenRequest) other;
        return Intrinsics.areEqual(unknownFields(), showSystemShareScreenRequest.unknownFields()) && Intrinsics.areEqual(this.contents, showSystemShareScreenRequest.contents) && this.include_canvas_image == showSystemShareScreenRequest.include_canvas_image;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.contents.hashCode()) * 37) + Boolean.hashCode(this.include_canvas_image);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.contents.isEmpty()) {
            arrayList.add("contents=" + Internal.sanitize(this.contents));
        }
        arrayList.add("include_canvas_image=" + this.include_canvas_image);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShowSystemShareScreenRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShowSystemShareScreenRequest copy$default(ShowSystemShareScreenRequest showSystemShareScreenRequest, List list, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = showSystemShareScreenRequest.contents;
        }
        if ((i & 2) != 0) {
            z = showSystemShareScreenRequest.include_canvas_image;
        }
        if ((i & 4) != 0) {
            byteString = showSystemShareScreenRequest.unknownFields();
        }
        return showSystemShareScreenRequest.copy(list, z, byteString);
    }

    public final ShowSystemShareScreenRequest copy(List<String> contents, boolean include_canvas_image, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ShowSystemShareScreenRequest(contents, include_canvas_image, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ShowSystemShareScreenRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ShowSystemShareScreenRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: eoy_giveaway.v1.ShowSystemShareScreenRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ShowSystemShareScreenRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.getContents());
                return value.getInclude_canvas_image() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getInclude_canvas_image())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ShowSystemShareScreenRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getContents());
                if (value.getInclude_canvas_image()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getInclude_canvas_image()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ShowSystemShareScreenRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInclude_canvas_image()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getInclude_canvas_image()));
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getContents());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ShowSystemShareScreenRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ShowSystemShareScreenRequest(arrayList, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ShowSystemShareScreenRequest redact(ShowSystemShareScreenRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ShowSystemShareScreenRequest.copy$default(value, null, false, ByteString.EMPTY, 3, null);
            }
        };
    }
}
