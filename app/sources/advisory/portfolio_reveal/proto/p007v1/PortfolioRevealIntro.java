package advisory.portfolio_reveal.proto.p007v1;

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

/* compiled from: PortfolioRevealIntro.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J`\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealIntro;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "cta_text", "image_dark_url", "image_light_url", "screen_identifier", "video_dark_url", "video_light_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCta_text", "getImage_dark_url", "getImage_light_url", "getScreen_identifier", "getVideo_dark_url", "getVideo_light_url", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class PortfolioRevealIntro extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioRevealIntro> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageDarkUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String image_dark_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageLightUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String image_light_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String screen_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "videoDarkUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String video_dark_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "videoLightUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String video_light_url;

    public PortfolioRevealIntro() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ PortfolioRevealIntro(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4368newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
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

    public final String getVideo_dark_url() {
        return this.video_dark_url;
    }

    public final String getVideo_light_url() {
        return this.video_light_url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioRevealIntro(String title, String subtitle, String cta_text, String image_dark_url, String image_light_url, String screen_identifier, String video_dark_url, String video_light_url, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(image_dark_url, "image_dark_url");
        Intrinsics.checkNotNullParameter(image_light_url, "image_light_url");
        Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
        Intrinsics.checkNotNullParameter(video_dark_url, "video_dark_url");
        Intrinsics.checkNotNullParameter(video_light_url, "video_light_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.cta_text = cta_text;
        this.image_dark_url = image_dark_url;
        this.image_light_url = image_light_url;
        this.screen_identifier = screen_identifier;
        this.video_dark_url = video_dark_url;
        this.video_light_url = video_light_url;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4368newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioRevealIntro)) {
            return false;
        }
        PortfolioRevealIntro portfolioRevealIntro = (PortfolioRevealIntro) other;
        return Intrinsics.areEqual(unknownFields(), portfolioRevealIntro.unknownFields()) && Intrinsics.areEqual(this.title, portfolioRevealIntro.title) && Intrinsics.areEqual(this.subtitle, portfolioRevealIntro.subtitle) && Intrinsics.areEqual(this.cta_text, portfolioRevealIntro.cta_text) && Intrinsics.areEqual(this.image_dark_url, portfolioRevealIntro.image_dark_url) && Intrinsics.areEqual(this.image_light_url, portfolioRevealIntro.image_light_url) && Intrinsics.areEqual(this.screen_identifier, portfolioRevealIntro.screen_identifier) && Intrinsics.areEqual(this.video_dark_url, portfolioRevealIntro.video_dark_url) && Intrinsics.areEqual(this.video_light_url, portfolioRevealIntro.video_light_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.cta_text.hashCode()) * 37) + this.image_dark_url.hashCode()) * 37) + this.image_light_url.hashCode()) * 37) + this.screen_identifier.hashCode()) * 37) + this.video_dark_url.hashCode()) * 37) + this.video_light_url.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        arrayList.add("image_dark_url=" + Internal.sanitize(this.image_dark_url));
        arrayList.add("image_light_url=" + Internal.sanitize(this.image_light_url));
        arrayList.add("screen_identifier=" + Internal.sanitize(this.screen_identifier));
        arrayList.add("video_dark_url=" + Internal.sanitize(this.video_dark_url));
        arrayList.add("video_light_url=" + Internal.sanitize(this.video_light_url));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioRevealIntro{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PortfolioRevealIntro copy$default(PortfolioRevealIntro portfolioRevealIntro, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioRevealIntro.title;
        }
        if ((i & 2) != 0) {
            str2 = portfolioRevealIntro.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = portfolioRevealIntro.cta_text;
        }
        if ((i & 8) != 0) {
            str4 = portfolioRevealIntro.image_dark_url;
        }
        if ((i & 16) != 0) {
            str5 = portfolioRevealIntro.image_light_url;
        }
        if ((i & 32) != 0) {
            str6 = portfolioRevealIntro.screen_identifier;
        }
        if ((i & 64) != 0) {
            str7 = portfolioRevealIntro.video_dark_url;
        }
        if ((i & 128) != 0) {
            str8 = portfolioRevealIntro.video_light_url;
        }
        if ((i & 256) != 0) {
            byteString = portfolioRevealIntro.unknownFields();
        }
        String str9 = str8;
        ByteString byteString2 = byteString;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return portfolioRevealIntro.copy(str, str2, str13, str4, str12, str10, str11, str9, byteString2);
    }

    public final PortfolioRevealIntro copy(String title, String subtitle, String cta_text, String image_dark_url, String image_light_url, String screen_identifier, String video_dark_url, String video_light_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(image_dark_url, "image_dark_url");
        Intrinsics.checkNotNullParameter(image_light_url, "image_light_url");
        Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
        Intrinsics.checkNotNullParameter(video_dark_url, "video_dark_url");
        Intrinsics.checkNotNullParameter(video_light_url, "video_light_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioRevealIntro(title, subtitle, cta_text, image_dark_url, image_light_url, screen_identifier, video_dark_url, video_light_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioRevealIntro.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioRevealIntro>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.portfolio_reveal.proto.v1.PortfolioRevealIntro$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioRevealIntro value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCta_text());
                }
                if (!Intrinsics.areEqual(value.getImage_dark_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getImage_dark_url());
                }
                if (!Intrinsics.areEqual(value.getImage_light_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getImage_light_url());
                }
                if (!Intrinsics.areEqual(value.getScreen_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getScreen_identifier());
                }
                if (!Intrinsics.areEqual(value.getVideo_dark_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getVideo_dark_url());
                }
                return !Intrinsics.areEqual(value.getVideo_light_url(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getVideo_light_url()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioRevealIntro value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCta_text());
                }
                if (!Intrinsics.areEqual(value.getImage_dark_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getImage_dark_url());
                }
                if (!Intrinsics.areEqual(value.getImage_light_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getImage_light_url());
                }
                if (!Intrinsics.areEqual(value.getScreen_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getScreen_identifier());
                }
                if (!Intrinsics.areEqual(value.getVideo_dark_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getVideo_dark_url());
                }
                if (!Intrinsics.areEqual(value.getVideo_light_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getVideo_light_url());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioRevealIntro value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getVideo_light_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getVideo_light_url());
                }
                if (!Intrinsics.areEqual(value.getVideo_dark_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getVideo_dark_url());
                }
                if (!Intrinsics.areEqual(value.getScreen_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getScreen_identifier());
                }
                if (!Intrinsics.areEqual(value.getImage_light_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getImage_light_url());
                }
                if (!Intrinsics.areEqual(value.getImage_dark_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getImage_dark_url());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCta_text());
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
            public PortfolioRevealIntro redact(PortfolioRevealIntro value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PortfolioRevealIntro.copy$default(value, null, null, null, null, null, null, null, null, ByteString.EMPTY, 255, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioRevealIntro decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
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
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PortfolioRevealIntro(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
