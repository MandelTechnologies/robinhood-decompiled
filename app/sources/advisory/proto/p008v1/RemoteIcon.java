package advisory.proto.p008v1;

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

/* compiled from: RemoteIcon.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Ladvisory/proto/v1/RemoteIcon;", "Lcom/squareup/wire/Message;", "", "light_url", "", "dark_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLight_url", "()Ljava/lang/String;", "getDark_url", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class RemoteIcon extends Message {

    @JvmField
    public static final ProtoAdapter<RemoteIcon> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "darkUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String dark_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lightUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String light_url;

    public RemoteIcon() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ RemoteIcon(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4530newBuilder();
    }

    public final String getLight_url() {
        return this.light_url;
    }

    public final String getDark_url() {
        return this.dark_url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteIcon(String light_url, String dark_url, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(light_url, "light_url");
        Intrinsics.checkNotNullParameter(dark_url, "dark_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.light_url = light_url;
        this.dark_url = dark_url;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4530newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RemoteIcon)) {
            return false;
        }
        RemoteIcon remoteIcon = (RemoteIcon) other;
        return Intrinsics.areEqual(unknownFields(), remoteIcon.unknownFields()) && Intrinsics.areEqual(this.light_url, remoteIcon.light_url) && Intrinsics.areEqual(this.dark_url, remoteIcon.dark_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.light_url.hashCode()) * 37) + this.dark_url.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("light_url=" + Internal.sanitize(this.light_url));
        arrayList.add("dark_url=" + Internal.sanitize(this.dark_url));
        return CollectionsKt.joinToString$default(arrayList, ", ", "RemoteIcon{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RemoteIcon copy$default(RemoteIcon remoteIcon, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteIcon.light_url;
        }
        if ((i & 2) != 0) {
            str2 = remoteIcon.dark_url;
        }
        if ((i & 4) != 0) {
            byteString = remoteIcon.unknownFields();
        }
        return remoteIcon.copy(str, str2, byteString);
    }

    public final RemoteIcon copy(String light_url, String dark_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(light_url, "light_url");
        Intrinsics.checkNotNullParameter(dark_url, "dark_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RemoteIcon(light_url, dark_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RemoteIcon.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RemoteIcon>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.RemoteIcon$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RemoteIcon value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLight_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLight_url());
                }
                return !Intrinsics.areEqual(value.getDark_url(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDark_url()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RemoteIcon value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLight_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLight_url());
                }
                if (!Intrinsics.areEqual(value.getDark_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDark_url());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RemoteIcon value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDark_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDark_url());
                }
                if (Intrinsics.areEqual(value.getLight_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLight_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RemoteIcon redact(RemoteIcon value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RemoteIcon.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RemoteIcon decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RemoteIcon(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
