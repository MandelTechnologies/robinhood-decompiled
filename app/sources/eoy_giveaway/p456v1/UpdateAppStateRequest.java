package eoy_giveaway.p456v1;

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

/* compiled from: UpdateAppStateRequest.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\u0002H\u0017J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\t¨\u0006\u0014"}, m3636d2 = {"Leoy_giveaway/v1/UpdateAppStateRequest;", "Lcom/squareup/wire/Message;", "", "is_in_foreground", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLokio/ByteString;)V", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class UpdateAppStateRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateAppStateRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isInForeground", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_in_foreground;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateAppStateRequest() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27987newBuilder();
    }

    /* renamed from: is_in_foreground, reason: from getter */
    public final boolean getIs_in_foreground() {
        return this.is_in_foreground;
    }

    public /* synthetic */ UpdateAppStateRequest(boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAppStateRequest(boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_in_foreground = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27987newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateAppStateRequest)) {
            return false;
        }
        UpdateAppStateRequest updateAppStateRequest = (UpdateAppStateRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateAppStateRequest.unknownFields()) && this.is_in_foreground == updateAppStateRequest.is_in_foreground;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_in_foreground);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_in_foreground=" + this.is_in_foreground);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateAppStateRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateAppStateRequest copy$default(UpdateAppStateRequest updateAppStateRequest, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updateAppStateRequest.is_in_foreground;
        }
        if ((i & 2) != 0) {
            byteString = updateAppStateRequest.unknownFields();
        }
        return updateAppStateRequest.copy(z, byteString);
    }

    public final UpdateAppStateRequest copy(boolean is_in_foreground, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateAppStateRequest(is_in_foreground, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateAppStateRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateAppStateRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: eoy_giveaway.v1.UpdateAppStateRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateAppStateRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getIs_in_foreground() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_in_foreground())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateAppStateRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_in_foreground()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_in_foreground()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateAppStateRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_in_foreground()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_in_foreground()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateAppStateRequest redact(UpdateAppStateRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateAppStateRequest.copy$default(value, false, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateAppStateRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateAppStateRequest(zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
