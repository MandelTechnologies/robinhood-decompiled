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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: UpdateProgramViewVisibilityRequest.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\r¨\u0006\u0017"}, m3636d2 = {"Leoy_giveaway/v1/UpdateProgramViewVisibilityRequest;", "Lcom/squareup/wire/Message;", "", "view_id", "", "is_visible", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLokio/ByteString;)V", "getView_id", "()Ljava/lang/String;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class UpdateProgramViewVisibilityRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateProgramViewVisibilityRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isVisible", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_visible;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "viewId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String view_id;

    public UpdateProgramViewVisibilityRequest() {
        this(null, false, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27990newBuilder();
    }

    public final String getView_id() {
        return this.view_id;
    }

    public /* synthetic */ UpdateProgramViewVisibilityRequest(String str, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_visible, reason: from getter */
    public final boolean getIs_visible() {
        return this.is_visible;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateProgramViewVisibilityRequest(String view_id, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(view_id, "view_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.view_id = view_id;
        this.is_visible = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27990newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateProgramViewVisibilityRequest)) {
            return false;
        }
        UpdateProgramViewVisibilityRequest updateProgramViewVisibilityRequest = (UpdateProgramViewVisibilityRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateProgramViewVisibilityRequest.unknownFields()) && Intrinsics.areEqual(this.view_id, updateProgramViewVisibilityRequest.view_id) && this.is_visible == updateProgramViewVisibilityRequest.is_visible;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.view_id.hashCode()) * 37) + Boolean.hashCode(this.is_visible);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("view_id=" + Internal.sanitize(this.view_id));
        arrayList.add("is_visible=" + this.is_visible);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateProgramViewVisibilityRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateProgramViewVisibilityRequest copy$default(UpdateProgramViewVisibilityRequest updateProgramViewVisibilityRequest, String str, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateProgramViewVisibilityRequest.view_id;
        }
        if ((i & 2) != 0) {
            z = updateProgramViewVisibilityRequest.is_visible;
        }
        if ((i & 4) != 0) {
            byteString = updateProgramViewVisibilityRequest.unknownFields();
        }
        return updateProgramViewVisibilityRequest.copy(str, z, byteString);
    }

    public final UpdateProgramViewVisibilityRequest copy(String view_id, boolean is_visible, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(view_id, "view_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateProgramViewVisibilityRequest(view_id, is_visible, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateProgramViewVisibilityRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateProgramViewVisibilityRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: eoy_giveaway.v1.UpdateProgramViewVisibilityRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateProgramViewVisibilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getView_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getView_id());
                }
                return value.getIs_visible() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_visible())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateProgramViewVisibilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getView_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getView_id());
                }
                if (value.getIs_visible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_visible()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateProgramViewVisibilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_visible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_visible()));
                }
                if (Intrinsics.areEqual(value.getView_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getView_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateProgramViewVisibilityRequest redact(UpdateProgramViewVisibilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateProgramViewVisibilityRequest.copy$default(value, null, false, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateProgramViewVisibilityRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateProgramViewVisibilityRequest(strDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
