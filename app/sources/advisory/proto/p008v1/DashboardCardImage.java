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

/* compiled from: DashboardCardImage.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Ladvisory/proto/v1/DashboardCardImage;", "Lcom/squareup/wire/Message;", "", "url_light", "", "url_dark", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getUrl_light", "()Ljava/lang/String;", "getUrl_dark", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class DashboardCardImage extends Message {

    @JvmField
    public static final ProtoAdapter<DashboardCardImage> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "urlDark", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String url_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "urlLight", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String url_light;

    public DashboardCardImage() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ DashboardCardImage(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4415newBuilder();
    }

    public final String getUrl_light() {
        return this.url_light;
    }

    public final String getUrl_dark() {
        return this.url_dark;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardCardImage(String url_light, String url_dark, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(url_light, "url_light");
        Intrinsics.checkNotNullParameter(url_dark, "url_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.url_light = url_light;
        this.url_dark = url_dark;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4415newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DashboardCardImage)) {
            return false;
        }
        DashboardCardImage dashboardCardImage = (DashboardCardImage) other;
        return Intrinsics.areEqual(unknownFields(), dashboardCardImage.unknownFields()) && Intrinsics.areEqual(this.url_light, dashboardCardImage.url_light) && Intrinsics.areEqual(this.url_dark, dashboardCardImage.url_dark);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.url_light.hashCode()) * 37) + this.url_dark.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("url_light=" + Internal.sanitize(this.url_light));
        arrayList.add("url_dark=" + Internal.sanitize(this.url_dark));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DashboardCardImage{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DashboardCardImage copy$default(DashboardCardImage dashboardCardImage, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardCardImage.url_light;
        }
        if ((i & 2) != 0) {
            str2 = dashboardCardImage.url_dark;
        }
        if ((i & 4) != 0) {
            byteString = dashboardCardImage.unknownFields();
        }
        return dashboardCardImage.copy(str, str2, byteString);
    }

    public final DashboardCardImage copy(String url_light, String url_dark, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(url_light, "url_light");
        Intrinsics.checkNotNullParameter(url_dark, "url_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DashboardCardImage(url_light, url_dark, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DashboardCardImage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DashboardCardImage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.DashboardCardImage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DashboardCardImage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUrl_light(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUrl_light());
                }
                return !Intrinsics.areEqual(value.getUrl_dark(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUrl_dark()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DashboardCardImage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUrl_light(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl_light());
                }
                if (!Intrinsics.areEqual(value.getUrl_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUrl_dark());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DashboardCardImage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getUrl_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUrl_dark());
                }
                if (Intrinsics.areEqual(value.getUrl_light(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl_light());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DashboardCardImage redact(DashboardCardImage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DashboardCardImage.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DashboardCardImage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DashboardCardImage(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
