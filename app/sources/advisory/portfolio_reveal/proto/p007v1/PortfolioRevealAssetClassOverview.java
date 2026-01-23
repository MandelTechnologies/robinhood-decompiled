package advisory.portfolio_reveal.proto.p007v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PortfolioRevealAssetClassOverview.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\\\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverview;", "Lcom/squareup/wire/Message;", "", "title", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "asset_class_rows", "", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRow;", "cta_text", "image_dark_url", "image_light_url", "screen_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDisclosure", "getCta_text", "getImage_dark_url", "getImage_light_url", "getScreen_identifier", "getAsset_class_rows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class PortfolioRevealAssetClassOverview extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioRevealAssetClassOverview> ADAPTER;

    @WireField(adapter = "advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassRow#ADAPTER", jsonName = "assetClassRows", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<PortfolioRevealAssetClassRow> asset_class_rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String disclosure;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageDarkUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String image_dark_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageLightUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String image_light_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String screen_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public PortfolioRevealAssetClassOverview() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ PortfolioRevealAssetClassOverview(String str, String str2, List list, String str3, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4363newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final String getCta_text() {
        return this.cta_text;
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
    public PortfolioRevealAssetClassOverview(String title, String disclosure, List<PortfolioRevealAssetClassRow> asset_class_rows, String cta_text, String image_dark_url, String image_light_url, String screen_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(asset_class_rows, "asset_class_rows");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(image_dark_url, "image_dark_url");
        Intrinsics.checkNotNullParameter(image_light_url, "image_light_url");
        Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.disclosure = disclosure;
        this.cta_text = cta_text;
        this.image_dark_url = image_dark_url;
        this.image_light_url = image_light_url;
        this.screen_identifier = screen_identifier;
        this.asset_class_rows = Internal.immutableCopyOf("asset_class_rows", asset_class_rows);
    }

    public final List<PortfolioRevealAssetClassRow> getAsset_class_rows() {
        return this.asset_class_rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4363newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioRevealAssetClassOverview)) {
            return false;
        }
        PortfolioRevealAssetClassOverview portfolioRevealAssetClassOverview = (PortfolioRevealAssetClassOverview) other;
        return Intrinsics.areEqual(unknownFields(), portfolioRevealAssetClassOverview.unknownFields()) && Intrinsics.areEqual(this.title, portfolioRevealAssetClassOverview.title) && Intrinsics.areEqual(this.disclosure, portfolioRevealAssetClassOverview.disclosure) && Intrinsics.areEqual(this.asset_class_rows, portfolioRevealAssetClassOverview.asset_class_rows) && Intrinsics.areEqual(this.cta_text, portfolioRevealAssetClassOverview.cta_text) && Intrinsics.areEqual(this.image_dark_url, portfolioRevealAssetClassOverview.image_dark_url) && Intrinsics.areEqual(this.image_light_url, portfolioRevealAssetClassOverview.image_light_url) && Intrinsics.areEqual(this.screen_identifier, portfolioRevealAssetClassOverview.screen_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.disclosure.hashCode()) * 37) + this.asset_class_rows.hashCode()) * 37) + this.cta_text.hashCode()) * 37) + this.image_dark_url.hashCode()) * 37) + this.image_light_url.hashCode()) * 37) + this.screen_identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("disclosure=" + Internal.sanitize(this.disclosure));
        if (!this.asset_class_rows.isEmpty()) {
            arrayList.add("asset_class_rows=" + this.asset_class_rows);
        }
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        arrayList.add("image_dark_url=" + Internal.sanitize(this.image_dark_url));
        arrayList.add("image_light_url=" + Internal.sanitize(this.image_light_url));
        arrayList.add("screen_identifier=" + Internal.sanitize(this.screen_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioRevealAssetClassOverview{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PortfolioRevealAssetClassOverview copy$default(PortfolioRevealAssetClassOverview portfolioRevealAssetClassOverview, String str, String str2, List list, String str3, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioRevealAssetClassOverview.title;
        }
        if ((i & 2) != 0) {
            str2 = portfolioRevealAssetClassOverview.disclosure;
        }
        if ((i & 4) != 0) {
            list = portfolioRevealAssetClassOverview.asset_class_rows;
        }
        if ((i & 8) != 0) {
            str3 = portfolioRevealAssetClassOverview.cta_text;
        }
        if ((i & 16) != 0) {
            str4 = portfolioRevealAssetClassOverview.image_dark_url;
        }
        if ((i & 32) != 0) {
            str5 = portfolioRevealAssetClassOverview.image_light_url;
        }
        if ((i & 64) != 0) {
            str6 = portfolioRevealAssetClassOverview.screen_identifier;
        }
        if ((i & 128) != 0) {
            byteString = portfolioRevealAssetClassOverview.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str4;
        String str9 = str5;
        return portfolioRevealAssetClassOverview.copy(str, str2, list, str3, str8, str9, str7, byteString2);
    }

    public final PortfolioRevealAssetClassOverview copy(String title, String disclosure, List<PortfolioRevealAssetClassRow> asset_class_rows, String cta_text, String image_dark_url, String image_light_url, String screen_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(asset_class_rows, "asset_class_rows");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(image_dark_url, "image_dark_url");
        Intrinsics.checkNotNullParameter(image_light_url, "image_light_url");
        Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioRevealAssetClassOverview(title, disclosure, asset_class_rows, cta_text, image_dark_url, image_light_url, screen_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioRevealAssetClassOverview.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioRevealAssetClassOverview>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassOverview$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioRevealAssetClassOverview value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDisclosure());
                }
                int iEncodedSizeWithTag = size + PortfolioRevealAssetClassRow.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getAsset_class_rows());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCta_text());
                }
                if (!Intrinsics.areEqual(value.getImage_dark_url(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getImage_dark_url());
                }
                if (!Intrinsics.areEqual(value.getImage_light_url(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getImage_light_url());
                }
                return !Intrinsics.areEqual(value.getScreen_identifier(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getScreen_identifier()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioRevealAssetClassOverview value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisclosure());
                }
                PortfolioRevealAssetClassRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAsset_class_rows());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_text());
                }
                if (!Intrinsics.areEqual(value.getImage_dark_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getImage_dark_url());
                }
                if (!Intrinsics.areEqual(value.getImage_light_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getImage_light_url());
                }
                if (!Intrinsics.areEqual(value.getScreen_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getScreen_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioRevealAssetClassOverview value) throws IOException {
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
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_text());
                }
                PortfolioRevealAssetClassRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAsset_class_rows());
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisclosure());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioRevealAssetClassOverview decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                arrayList.add(PortfolioRevealAssetClassRow.ADAPTER.decode(reader));
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PortfolioRevealAssetClassOverview(strDecode, strDecode2, arrayList, strDecode3, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioRevealAssetClassOverview redact(PortfolioRevealAssetClassOverview value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PortfolioRevealAssetClassOverview.copy$default(value, null, null, Internal.m26823redactElements(value.getAsset_class_rows(), PortfolioRevealAssetClassRow.ADAPTER), null, null, null, null, ByteString.EMPTY, 123, null);
            }
        };
    }
}
