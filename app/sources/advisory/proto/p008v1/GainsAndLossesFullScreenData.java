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

/* compiled from: GainsAndLossesFullScreenData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Ladvisory/proto/v1/GainsAndLossesFullScreenData;", "Lcom/squareup/wire/Message;", "", "navigation_title", "", "screen_title", "screen_subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getNavigation_title", "()Ljava/lang/String;", "getScreen_title", "getScreen_subtitle", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GainsAndLossesFullScreenData extends Message {

    @JvmField
    public static final ProtoAdapter<GainsAndLossesFullScreenData> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "navigationTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String navigation_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenSubtitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String screen_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String screen_title;

    public GainsAndLossesFullScreenData() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ GainsAndLossesFullScreenData(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4421newBuilder();
    }

    public final String getNavigation_title() {
        return this.navigation_title;
    }

    public final String getScreen_title() {
        return this.screen_title;
    }

    public final String getScreen_subtitle() {
        return this.screen_subtitle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GainsAndLossesFullScreenData(String navigation_title, String screen_title, String screen_subtitle, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(navigation_title, "navigation_title");
        Intrinsics.checkNotNullParameter(screen_title, "screen_title");
        Intrinsics.checkNotNullParameter(screen_subtitle, "screen_subtitle");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.navigation_title = navigation_title;
        this.screen_title = screen_title;
        this.screen_subtitle = screen_subtitle;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4421newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GainsAndLossesFullScreenData)) {
            return false;
        }
        GainsAndLossesFullScreenData gainsAndLossesFullScreenData = (GainsAndLossesFullScreenData) other;
        return Intrinsics.areEqual(unknownFields(), gainsAndLossesFullScreenData.unknownFields()) && Intrinsics.areEqual(this.navigation_title, gainsAndLossesFullScreenData.navigation_title) && Intrinsics.areEqual(this.screen_title, gainsAndLossesFullScreenData.screen_title) && Intrinsics.areEqual(this.screen_subtitle, gainsAndLossesFullScreenData.screen_subtitle);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.navigation_title.hashCode()) * 37) + this.screen_title.hashCode()) * 37) + this.screen_subtitle.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("navigation_title=" + Internal.sanitize(this.navigation_title));
        arrayList.add("screen_title=" + Internal.sanitize(this.screen_title));
        arrayList.add("screen_subtitle=" + Internal.sanitize(this.screen_subtitle));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GainsAndLossesFullScreenData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GainsAndLossesFullScreenData copy$default(GainsAndLossesFullScreenData gainsAndLossesFullScreenData, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gainsAndLossesFullScreenData.navigation_title;
        }
        if ((i & 2) != 0) {
            str2 = gainsAndLossesFullScreenData.screen_title;
        }
        if ((i & 4) != 0) {
            str3 = gainsAndLossesFullScreenData.screen_subtitle;
        }
        if ((i & 8) != 0) {
            byteString = gainsAndLossesFullScreenData.unknownFields();
        }
        return gainsAndLossesFullScreenData.copy(str, str2, str3, byteString);
    }

    public final GainsAndLossesFullScreenData copy(String navigation_title, String screen_title, String screen_subtitle, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(navigation_title, "navigation_title");
        Intrinsics.checkNotNullParameter(screen_title, "screen_title");
        Intrinsics.checkNotNullParameter(screen_subtitle, "screen_subtitle");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GainsAndLossesFullScreenData(navigation_title, screen_title, screen_subtitle, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GainsAndLossesFullScreenData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GainsAndLossesFullScreenData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GainsAndLossesFullScreenData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GainsAndLossesFullScreenData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getNavigation_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getNavigation_title());
                }
                if (!Intrinsics.areEqual(value.getScreen_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getScreen_title());
                }
                return !Intrinsics.areEqual(value.getScreen_subtitle(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getScreen_subtitle()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GainsAndLossesFullScreenData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getNavigation_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNavigation_title());
                }
                if (!Intrinsics.areEqual(value.getScreen_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getScreen_title());
                }
                if (!Intrinsics.areEqual(value.getScreen_subtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScreen_subtitle());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GainsAndLossesFullScreenData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getScreen_subtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScreen_subtitle());
                }
                if (!Intrinsics.areEqual(value.getScreen_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getScreen_title());
                }
                if (Intrinsics.areEqual(value.getNavigation_title(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNavigation_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GainsAndLossesFullScreenData redact(GainsAndLossesFullScreenData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GainsAndLossesFullScreenData.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GainsAndLossesFullScreenData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GainsAndLossesFullScreenData(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
