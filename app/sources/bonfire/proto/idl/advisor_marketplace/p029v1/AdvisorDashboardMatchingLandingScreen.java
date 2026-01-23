package bonfire.proto.idl.advisor_marketplace.p029v1;

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
import rosetta.bonfire.p535v1.ThemedAssetUrl;

/* compiled from: AdvisorDashboardMatchingLandingScreen.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardMatchingLandingScreen;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "deeplink", "animation", "Lrosetta/bonfire/v1/ThemedAssetUrl;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/bonfire/v1/ThemedAssetUrl;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDeeplink", "getAnimation", "()Lrosetta/bonfire/v1/ThemedAssetUrl;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorDashboardMatchingLandingScreen extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorDashboardMatchingLandingScreen> ADAPTER;

    @WireField(adapter = "rosetta.bonfire.v1.ThemedAssetUrl#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ThemedAssetUrl animation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public AdvisorDashboardMatchingLandingScreen() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ AdvisorDashboardMatchingLandingScreen(String str, String str2, String str3, ThemedAssetUrl themedAssetUrl, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : themedAssetUrl, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8742newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final ThemedAssetUrl getAnimation() {
        return this.animation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorDashboardMatchingLandingScreen(String title, String subtitle, String deeplink, ThemedAssetUrl themedAssetUrl, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.deeplink = deeplink;
        this.animation = themedAssetUrl;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8742newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorDashboardMatchingLandingScreen)) {
            return false;
        }
        AdvisorDashboardMatchingLandingScreen advisorDashboardMatchingLandingScreen = (AdvisorDashboardMatchingLandingScreen) other;
        return Intrinsics.areEqual(unknownFields(), advisorDashboardMatchingLandingScreen.unknownFields()) && Intrinsics.areEqual(this.title, advisorDashboardMatchingLandingScreen.title) && Intrinsics.areEqual(this.subtitle, advisorDashboardMatchingLandingScreen.subtitle) && Intrinsics.areEqual(this.deeplink, advisorDashboardMatchingLandingScreen.deeplink) && Intrinsics.areEqual(this.animation, advisorDashboardMatchingLandingScreen.animation);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.deeplink.hashCode()) * 37;
        ThemedAssetUrl themedAssetUrl = this.animation;
        int iHashCode2 = iHashCode + (themedAssetUrl != null ? themedAssetUrl.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        ThemedAssetUrl themedAssetUrl = this.animation;
        if (themedAssetUrl != null) {
            arrayList.add("animation=" + themedAssetUrl);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorDashboardMatchingLandingScreen{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisorDashboardMatchingLandingScreen copy$default(AdvisorDashboardMatchingLandingScreen advisorDashboardMatchingLandingScreen, String str, String str2, String str3, ThemedAssetUrl themedAssetUrl, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisorDashboardMatchingLandingScreen.title;
        }
        if ((i & 2) != 0) {
            str2 = advisorDashboardMatchingLandingScreen.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = advisorDashboardMatchingLandingScreen.deeplink;
        }
        if ((i & 8) != 0) {
            themedAssetUrl = advisorDashboardMatchingLandingScreen.animation;
        }
        if ((i & 16) != 0) {
            byteString = advisorDashboardMatchingLandingScreen.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return advisorDashboardMatchingLandingScreen.copy(str, str2, str4, themedAssetUrl, byteString2);
    }

    public final AdvisorDashboardMatchingLandingScreen copy(String title, String subtitle, String deeplink, ThemedAssetUrl animation, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorDashboardMatchingLandingScreen(title, subtitle, deeplink, animation, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorDashboardMatchingLandingScreen.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorDashboardMatchingLandingScreen>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardMatchingLandingScreen$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorDashboardMatchingLandingScreen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDeeplink());
                }
                return value.getAnimation() != null ? size + ThemedAssetUrl.ADAPTER.encodedSizeWithTag(4, value.getAnimation()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorDashboardMatchingLandingScreen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDeeplink());
                }
                if (value.getAnimation() != null) {
                    ThemedAssetUrl.ADAPTER.encodeWithTag(writer, 4, (int) value.getAnimation());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorDashboardMatchingLandingScreen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAnimation() != null) {
                    ThemedAssetUrl.ADAPTER.encodeWithTag(writer, 4, (int) value.getAnimation());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardMatchingLandingScreen redact(AdvisorDashboardMatchingLandingScreen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedAssetUrl animation = value.getAnimation();
                return AdvisorDashboardMatchingLandingScreen.copy$default(value, null, null, null, animation != null ? ThemedAssetUrl.ADAPTER.redact(animation) : null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardMatchingLandingScreen decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                ThemedAssetUrl themedAssetUrlDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisorDashboardMatchingLandingScreen(strDecode, strDecode3, strDecode2, themedAssetUrlDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        themedAssetUrlDecode = ThemedAssetUrl.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
