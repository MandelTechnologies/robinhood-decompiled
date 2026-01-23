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
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: DashboardCardCta.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J2\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Ladvisory/proto/v1/DashboardCardCta;", "Lcom/squareup/wire/Message;", "", "title", "", "url", "foreground_color", "Lrh_server_driven_ui/v1/ThemedColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "getForeground_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class DashboardCardCta extends Message {

    @JvmField
    public static final ProtoAdapter<DashboardCardCta> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "foregroundColor", schemaIndex = 2, tag = 3)
    private final ThemedColor foreground_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String url;

    public DashboardCardCta() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4412newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ DashboardCardCta(String str, String str2, ThemedColor themedColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : themedColor, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getUrl() {
        return this.url;
    }

    public final ThemedColor getForeground_color() {
        return this.foreground_color;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardCardCta(String title, String str, ThemedColor themedColor, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.url = str;
        this.foreground_color = themedColor;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4412newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DashboardCardCta)) {
            return false;
        }
        DashboardCardCta dashboardCardCta = (DashboardCardCta) other;
        return Intrinsics.areEqual(unknownFields(), dashboardCardCta.unknownFields()) && Intrinsics.areEqual(this.title, dashboardCardCta.title) && Intrinsics.areEqual(this.url, dashboardCardCta.url) && Intrinsics.areEqual(this.foreground_color, dashboardCardCta.foreground_color);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        ThemedColor themedColor = this.foreground_color;
        int iHashCode3 = iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        String str = this.url;
        if (str != null) {
            arrayList.add("url=" + Internal.sanitize(str));
        }
        ThemedColor themedColor = this.foreground_color;
        if (themedColor != null) {
            arrayList.add("foreground_color=" + themedColor);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DashboardCardCta{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DashboardCardCta copy$default(DashboardCardCta dashboardCardCta, String str, String str2, ThemedColor themedColor, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardCardCta.title;
        }
        if ((i & 2) != 0) {
            str2 = dashboardCardCta.url;
        }
        if ((i & 4) != 0) {
            themedColor = dashboardCardCta.foreground_color;
        }
        if ((i & 8) != 0) {
            byteString = dashboardCardCta.unknownFields();
        }
        return dashboardCardCta.copy(str, str2, themedColor, byteString);
    }

    public final DashboardCardCta copy(String title, String url, ThemedColor foreground_color, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DashboardCardCta(title, url, foreground_color, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DashboardCardCta.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DashboardCardCta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.DashboardCardCta$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DashboardCardCta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUrl()) + ThemedColor.ADAPTER.encodedSizeWithTag(3, value.getForeground_color());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DashboardCardCta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUrl());
                ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getForeground_color());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DashboardCardCta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getForeground_color());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getUrl());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DashboardCardCta redact(DashboardCardCta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor foreground_color = value.getForeground_color();
                return DashboardCardCta.copy$default(value, null, null, foreground_color != null ? ThemedColor.ADAPTER.redact(foreground_color) : null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DashboardCardCta decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                ThemedColor themedColorDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DashboardCardCta(strDecode, strDecode2, themedColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
