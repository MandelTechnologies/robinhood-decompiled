package advisory.portfolio_reveal.proto.p007v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
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

/* compiled from: PortfolioRevealInfoPage.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JX\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealInfoPage;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "asset_text", "image_dark_url", "image_light_url", "screen_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDisclosure", "getAsset_text", "getImage_dark_url", "getImage_light_url", "getScreen_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class PortfolioRevealInfoPage extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioRevealInfoPage> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String asset_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String disclosure;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageDarkUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String image_dark_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageLightUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String image_light_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String screen_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public PortfolioRevealInfoPage() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ PortfolioRevealInfoPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4367newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final String getAsset_text() {
        return this.asset_text;
    }

    public final String getImage_dark_url() {
        return this.image_dark_url;
    }

    public final String getImage_light_url() {
        return this.image_light_url;
    }

    public final String getScreen_identifier() {
        return this.screen_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioRevealInfoPage(String title, String subtitle, String str, String asset_text, String image_dark_url, String image_light_url, String screen_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(asset_text, "asset_text");
        Intrinsics.checkNotNullParameter(image_dark_url, "image_dark_url");
        Intrinsics.checkNotNullParameter(image_light_url, "image_light_url");
        Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.disclosure = str;
        this.asset_text = asset_text;
        this.image_dark_url = image_dark_url;
        this.image_light_url = image_light_url;
        this.screen_identifier = screen_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4367newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioRevealInfoPage)) {
            return false;
        }
        PortfolioRevealInfoPage portfolioRevealInfoPage = (PortfolioRevealInfoPage) other;
        return Intrinsics.areEqual(unknownFields(), portfolioRevealInfoPage.unknownFields()) && Intrinsics.areEqual(this.title, portfolioRevealInfoPage.title) && Intrinsics.areEqual(this.subtitle, portfolioRevealInfoPage.subtitle) && Intrinsics.areEqual(this.disclosure, portfolioRevealInfoPage.disclosure) && Intrinsics.areEqual(this.asset_text, portfolioRevealInfoPage.asset_text) && Intrinsics.areEqual(this.image_dark_url, portfolioRevealInfoPage.image_dark_url) && Intrinsics.areEqual(this.image_light_url, portfolioRevealInfoPage.image_light_url) && Intrinsics.areEqual(this.screen_identifier, portfolioRevealInfoPage.screen_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37;
        String str = this.disclosure;
        int iHashCode2 = ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.asset_text.hashCode()) * 37) + this.image_dark_url.hashCode()) * 37) + this.image_light_url.hashCode()) * 37) + this.screen_identifier.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        String str = this.disclosure;
        if (str != null) {
            arrayList.add("disclosure=" + Internal.sanitize(str));
        }
        arrayList.add("asset_text=" + Internal.sanitize(this.asset_text));
        arrayList.add("image_dark_url=" + Internal.sanitize(this.image_dark_url));
        arrayList.add("image_light_url=" + Internal.sanitize(this.image_light_url));
        arrayList.add("screen_identifier=" + Internal.sanitize(this.screen_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioRevealInfoPage{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PortfolioRevealInfoPage copy$default(PortfolioRevealInfoPage portfolioRevealInfoPage, String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioRevealInfoPage.title;
        }
        if ((i & 2) != 0) {
            str2 = portfolioRevealInfoPage.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = portfolioRevealInfoPage.disclosure;
        }
        if ((i & 8) != 0) {
            str4 = portfolioRevealInfoPage.asset_text;
        }
        if ((i & 16) != 0) {
            str5 = portfolioRevealInfoPage.image_dark_url;
        }
        if ((i & 32) != 0) {
            str6 = portfolioRevealInfoPage.image_light_url;
        }
        if ((i & 64) != 0) {
            str7 = portfolioRevealInfoPage.screen_identifier;
        }
        if ((i & 128) != 0) {
            byteString = portfolioRevealInfoPage.unknownFields();
        }
        String str8 = str7;
        ByteString byteString2 = byteString;
        String str9 = str5;
        String str10 = str6;
        return portfolioRevealInfoPage.copy(str, str2, str3, str4, str9, str10, str8, byteString2);
    }

    public final PortfolioRevealInfoPage copy(String title, String subtitle, String disclosure, String asset_text, String image_dark_url, String image_light_url, String screen_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(asset_text, "asset_text");
        Intrinsics.checkNotNullParameter(image_dark_url, "image_dark_url");
        Intrinsics.checkNotNullParameter(image_light_url, "image_light_url");
        Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioRevealInfoPage(title, subtitle, disclosure, asset_text, image_dark_url, image_light_url, screen_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioRevealInfoPage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioRevealInfoPage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.portfolio_reveal.proto.v1.PortfolioRevealInfoPage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioRevealInfoPage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getDisclosure());
                if (!Intrinsics.areEqual(value.getAsset_text(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getAsset_text());
                }
                if (!Intrinsics.areEqual(value.getImage_dark_url(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getImage_dark_url());
                }
                if (!Intrinsics.areEqual(value.getImage_light_url(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(6, value.getImage_light_url());
                }
                return !Intrinsics.areEqual(value.getScreen_identifier(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(7, value.getScreen_identifier()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioRevealInfoPage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDisclosure());
                if (!Intrinsics.areEqual(value.getAsset_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getAsset_text());
                }
                if (!Intrinsics.areEqual(value.getImage_dark_url(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getImage_dark_url());
                }
                if (!Intrinsics.areEqual(value.getImage_light_url(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getImage_light_url());
                }
                if (!Intrinsics.areEqual(value.getScreen_identifier(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getScreen_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioRevealInfoPage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getScreen_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getScreen_identifier());
                }
                if (!Intrinsics.areEqual(value.getImage_light_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getImage_light_url());
                }
                if (!Intrinsics.areEqual(value.getImage_dark_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getImage_dark_url());
                }
                if (!Intrinsics.areEqual(value.getAsset_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAsset_text());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDisclosure());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioRevealInfoPage redact(PortfolioRevealInfoPage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PortfolioRevealInfoPage.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioRevealInfoPage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = null;
                String strDecode7 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
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
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PortfolioRevealInfoPage(strDecode, strDecode7, strDecode6, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
