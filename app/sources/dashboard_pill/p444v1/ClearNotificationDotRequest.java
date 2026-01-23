package dashboard_pill.p444v1;

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

/* compiled from: ClearNotificationDotRequest.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Ldashboard_pill/v1/ClearNotificationDotRequest;", "Lcom/squareup/wire/Message;", "", "badge_identifier", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getBadge_identifier", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "dashboard_pill.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ClearNotificationDotRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ClearNotificationDotRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "badgeIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String badge_identifier;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearNotificationDotRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27925newBuilder();
    }

    public final String getBadge_identifier() {
        return this.badge_identifier;
    }

    public /* synthetic */ ClearNotificationDotRequest(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearNotificationDotRequest(String badge_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(badge_identifier, "badge_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.badge_identifier = badge_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27925newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClearNotificationDotRequest)) {
            return false;
        }
        ClearNotificationDotRequest clearNotificationDotRequest = (ClearNotificationDotRequest) other;
        return Intrinsics.areEqual(unknownFields(), clearNotificationDotRequest.unknownFields()) && Intrinsics.areEqual(this.badge_identifier, clearNotificationDotRequest.badge_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.badge_identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("badge_identifier=" + Internal.sanitize(this.badge_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClearNotificationDotRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClearNotificationDotRequest copy$default(ClearNotificationDotRequest clearNotificationDotRequest, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clearNotificationDotRequest.badge_identifier;
        }
        if ((i & 2) != 0) {
            byteString = clearNotificationDotRequest.unknownFields();
        }
        return clearNotificationDotRequest.copy(str, byteString);
    }

    public final ClearNotificationDotRequest copy(String badge_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(badge_identifier, "badge_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClearNotificationDotRequest(badge_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClearNotificationDotRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClearNotificationDotRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: dashboard_pill.v1.ClearNotificationDotRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClearNotificationDotRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return !Intrinsics.areEqual(value.getBadge_identifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBadge_identifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClearNotificationDotRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBadge_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBadge_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClearNotificationDotRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (Intrinsics.areEqual(value.getBadge_identifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBadge_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClearNotificationDotRequest redact(ClearNotificationDotRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ClearNotificationDotRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClearNotificationDotRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ClearNotificationDotRequest(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
