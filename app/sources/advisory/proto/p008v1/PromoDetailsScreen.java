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

/* compiled from: PromoDetailsScreen.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0007H\u0016Jn\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, m3636d2 = {"Ladvisory/proto/v1/PromoDetailsScreen;", "Lcom/squareup/wire/Message;", "", "video", "Ladvisory/proto/v1/PromoDetailsAsset;", "image", "title", "", "description", "disclosure_markdown", "cta_title", "cta_deeplink", "is_user_gold_member", "", "background", "Ladvisory/proto/v1/PromoDetailsScreenBackground;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/PromoDetailsAsset;Ladvisory/proto/v1/PromoDetailsAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLadvisory/proto/v1/PromoDetailsScreenBackground;Lokio/ByteString;)V", "getVideo", "()Ladvisory/proto/v1/PromoDetailsAsset;", "getImage", "getTitle", "()Ljava/lang/String;", "getDescription", "getDisclosure_markdown", "getCta_title", "getCta_deeplink", "()Z", "getBackground", "()Ladvisory/proto/v1/PromoDetailsScreenBackground;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PromoDetailsScreen extends Message {

    @JvmField
    public static final ProtoAdapter<PromoDetailsScreen> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.PromoDetailsScreenBackground#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final PromoDetailsScreenBackground background;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaDeeplink", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String cta_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String cta_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String disclosure_markdown;

    @WireField(adapter = "advisory.proto.v1.PromoDetailsAsset#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PromoDetailsAsset image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isUserGoldMember", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean is_user_gold_member;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String title;

    @WireField(adapter = "advisory.proto.v1.PromoDetailsAsset#ADAPTER", schemaIndex = 0, tag = 1)
    private final PromoDetailsAsset video;

    public PromoDetailsScreen() {
        this(null, null, null, null, null, null, null, false, null, null, 1023, null);
    }

    public /* synthetic */ PromoDetailsScreen(PromoDetailsAsset promoDetailsAsset, PromoDetailsAsset promoDetailsAsset2, String str, String str2, String str3, String str4, String str5, boolean z, PromoDetailsScreenBackground promoDetailsScreenBackground, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : promoDetailsAsset, (i & 2) != 0 ? null : promoDetailsAsset2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? false : z, (i & 256) != 0 ? PromoDetailsScreenBackground.BACKGROUND_UNSPECIFIED : promoDetailsScreenBackground, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4526newBuilder();
    }

    public final PromoDetailsAsset getVideo() {
        return this.video;
    }

    public final PromoDetailsAsset getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final String getCta_title() {
        return this.cta_title;
    }

    public final String getCta_deeplink() {
        return this.cta_deeplink;
    }

    /* renamed from: is_user_gold_member, reason: from getter */
    public final boolean getIs_user_gold_member() {
        return this.is_user_gold_member;
    }

    public final PromoDetailsScreenBackground getBackground() {
        return this.background;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoDetailsScreen(PromoDetailsAsset promoDetailsAsset, PromoDetailsAsset promoDetailsAsset2, String title, String description, String disclosure_markdown, String cta_title, String cta_deeplink, boolean z, PromoDetailsScreenBackground background, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(cta_title, "cta_title");
        Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.video = promoDetailsAsset;
        this.image = promoDetailsAsset2;
        this.title = title;
        this.description = description;
        this.disclosure_markdown = disclosure_markdown;
        this.cta_title = cta_title;
        this.cta_deeplink = cta_deeplink;
        this.is_user_gold_member = z;
        this.background = background;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4526newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PromoDetailsScreen)) {
            return false;
        }
        PromoDetailsScreen promoDetailsScreen = (PromoDetailsScreen) other;
        return Intrinsics.areEqual(unknownFields(), promoDetailsScreen.unknownFields()) && Intrinsics.areEqual(this.video, promoDetailsScreen.video) && Intrinsics.areEqual(this.image, promoDetailsScreen.image) && Intrinsics.areEqual(this.title, promoDetailsScreen.title) && Intrinsics.areEqual(this.description, promoDetailsScreen.description) && Intrinsics.areEqual(this.disclosure_markdown, promoDetailsScreen.disclosure_markdown) && Intrinsics.areEqual(this.cta_title, promoDetailsScreen.cta_title) && Intrinsics.areEqual(this.cta_deeplink, promoDetailsScreen.cta_deeplink) && this.is_user_gold_member == promoDetailsScreen.is_user_gold_member && this.background == promoDetailsScreen.background;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PromoDetailsAsset promoDetailsAsset = this.video;
        int iHashCode2 = (iHashCode + (promoDetailsAsset != null ? promoDetailsAsset.hashCode() : 0)) * 37;
        PromoDetailsAsset promoDetailsAsset2 = this.image;
        int iHashCode3 = ((((((((((((((iHashCode2 + (promoDetailsAsset2 != null ? promoDetailsAsset2.hashCode() : 0)) * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37) + this.disclosure_markdown.hashCode()) * 37) + this.cta_title.hashCode()) * 37) + this.cta_deeplink.hashCode()) * 37) + Boolean.hashCode(this.is_user_gold_member)) * 37) + this.background.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PromoDetailsAsset promoDetailsAsset = this.video;
        if (promoDetailsAsset != null) {
            arrayList.add("video=" + promoDetailsAsset);
        }
        PromoDetailsAsset promoDetailsAsset2 = this.image;
        if (promoDetailsAsset2 != null) {
            arrayList.add("image=" + promoDetailsAsset2);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("disclosure_markdown=" + Internal.sanitize(this.disclosure_markdown));
        arrayList.add("cta_title=" + Internal.sanitize(this.cta_title));
        arrayList.add("cta_deeplink=" + Internal.sanitize(this.cta_deeplink));
        arrayList.add("is_user_gold_member=" + this.is_user_gold_member);
        arrayList.add("background=" + this.background);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PromoDetailsScreen{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PromoDetailsScreen copy$default(PromoDetailsScreen promoDetailsScreen, PromoDetailsAsset promoDetailsAsset, PromoDetailsAsset promoDetailsAsset2, String str, String str2, String str3, String str4, String str5, boolean z, PromoDetailsScreenBackground promoDetailsScreenBackground, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            promoDetailsAsset = promoDetailsScreen.video;
        }
        if ((i & 2) != 0) {
            promoDetailsAsset2 = promoDetailsScreen.image;
        }
        if ((i & 4) != 0) {
            str = promoDetailsScreen.title;
        }
        if ((i & 8) != 0) {
            str2 = promoDetailsScreen.description;
        }
        if ((i & 16) != 0) {
            str3 = promoDetailsScreen.disclosure_markdown;
        }
        if ((i & 32) != 0) {
            str4 = promoDetailsScreen.cta_title;
        }
        if ((i & 64) != 0) {
            str5 = promoDetailsScreen.cta_deeplink;
        }
        if ((i & 128) != 0) {
            z = promoDetailsScreen.is_user_gold_member;
        }
        if ((i & 256) != 0) {
            promoDetailsScreenBackground = promoDetailsScreen.background;
        }
        if ((i & 512) != 0) {
            byteString = promoDetailsScreen.unknownFields();
        }
        PromoDetailsScreenBackground promoDetailsScreenBackground2 = promoDetailsScreenBackground;
        ByteString byteString2 = byteString;
        String str6 = str5;
        boolean z2 = z;
        String str7 = str3;
        String str8 = str4;
        return promoDetailsScreen.copy(promoDetailsAsset, promoDetailsAsset2, str, str2, str7, str8, str6, z2, promoDetailsScreenBackground2, byteString2);
    }

    public final PromoDetailsScreen copy(PromoDetailsAsset video, PromoDetailsAsset image, String title, String description, String disclosure_markdown, String cta_title, String cta_deeplink, boolean is_user_gold_member, PromoDetailsScreenBackground background, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(cta_title, "cta_title");
        Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PromoDetailsScreen(video, image, title, description, disclosure_markdown, cta_title, cta_deeplink, is_user_gold_member, background, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PromoDetailsScreen.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PromoDetailsScreen>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.PromoDetailsScreen$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PromoDetailsScreen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<PromoDetailsAsset> protoAdapter = PromoDetailsAsset.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getVideo());
                if (value.getImage() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(2, value.getImage());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDisclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getCta_title(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getCta_title());
                }
                if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getCta_deeplink());
                }
                if (value.getIs_user_gold_member()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getIs_user_gold_member()));
                }
                return value.getBackground() != PromoDetailsScreenBackground.BACKGROUND_UNSPECIFIED ? iEncodedSizeWithTag + PromoDetailsScreenBackground.ADAPTER.encodedSizeWithTag(9, value.getBackground()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PromoDetailsScreen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<PromoDetailsAsset> protoAdapter = PromoDetailsAsset.ADAPTER;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getVideo());
                if (value.getImage() != null) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getImage());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getCta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCta_title());
                }
                if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCta_deeplink());
                }
                if (value.getIs_user_gold_member()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_user_gold_member()));
                }
                if (value.getBackground() != PromoDetailsScreenBackground.BACKGROUND_UNSPECIFIED) {
                    PromoDetailsScreenBackground.ADAPTER.encodeWithTag(writer, 9, (int) value.getBackground());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PromoDetailsScreen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBackground() != PromoDetailsScreenBackground.BACKGROUND_UNSPECIFIED) {
                    PromoDetailsScreenBackground.ADAPTER.encodeWithTag(writer, 9, (int) value.getBackground());
                }
                if (value.getIs_user_gold_member()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_user_gold_member()));
                }
                if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCta_deeplink());
                }
                if (!Intrinsics.areEqual(value.getCta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCta_title());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (value.getImage() != null) {
                    PromoDetailsAsset.ADAPTER.encodeWithTag(writer, 2, (int) value.getImage());
                }
                PromoDetailsAsset.ADAPTER.encodeWithTag(writer, 1, (int) value.getVideo());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PromoDetailsScreen decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PromoDetailsScreenBackground promoDetailsScreenBackgroundDecode = PromoDetailsScreenBackground.BACKGROUND_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                boolean zBooleanValue = false;
                PromoDetailsAsset promoDetailsAssetDecode = null;
                PromoDetailsAsset promoDetailsAssetDecode2 = null;
                while (true) {
                    PromoDetailsScreenBackground promoDetailsScreenBackground = promoDetailsScreenBackgroundDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    promoDetailsAssetDecode = PromoDetailsAsset.ADAPTER.decode(reader);
                                    break;
                                case 2:
                                    promoDetailsAssetDecode2 = PromoDetailsAsset.ADAPTER.decode(reader);
                                    break;
                                case 3:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 8:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 9:
                                    try {
                                        promoDetailsScreenBackgroundDecode = PromoDetailsScreenBackground.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new PromoDetailsScreen(promoDetailsAssetDecode, promoDetailsAssetDecode2, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, zBooleanValue, promoDetailsScreenBackground, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PromoDetailsScreen redact(PromoDetailsScreen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PromoDetailsAsset video = value.getVideo();
                PromoDetailsAsset promoDetailsAssetRedact = video != null ? PromoDetailsAsset.ADAPTER.redact(video) : null;
                PromoDetailsAsset image = value.getImage();
                return PromoDetailsScreen.copy$default(value, promoDetailsAssetRedact, image != null ? PromoDetailsAsset.ADAPTER.redact(image) : null, null, null, null, null, null, false, null, ByteString.EMPTY, 508, null);
            }
        };
    }
}
