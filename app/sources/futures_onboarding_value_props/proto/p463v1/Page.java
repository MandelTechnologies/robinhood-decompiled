package futures_onboarding_value_props.proto.p463v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: Page.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JT\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/Page;", "Lcom/squareup/wire/Message;", "", "title_markdown", "", "subtitle_markdown", "disclaimer_markdown", "lottie_info", "Lfutures_onboarding_value_props/proto/v1/LottieInfo;", "image_info", "Lfutures_onboarding_value_props/proto/v1/ImageInfo;", "theme", "Lfutures_onboarding_value_props/proto/v1/Theme;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfutures_onboarding_value_props/proto/v1/LottieInfo;Lfutures_onboarding_value_props/proto/v1/ImageInfo;Lfutures_onboarding_value_props/proto/v1/Theme;Lokio/ByteString;)V", "getTitle_markdown", "()Ljava/lang/String;", "getSubtitle_markdown", "getDisclaimer_markdown", "getLottie_info", "()Lfutures_onboarding_value_props/proto/v1/LottieInfo;", "getImage_info", "()Lfutures_onboarding_value_props/proto/v1/ImageInfo;", "getTheme", "()Lfutures_onboarding_value_props/proto/v1/Theme;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Page extends Message {

    @JvmField
    public static final ProtoAdapter<Page> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclaimerMarkdown", schemaIndex = 2, tag = 3)
    private final String disclaimer_markdown;

    @WireField(adapter = "futures_onboarding_value_props.proto.v1.ImageInfo#ADAPTER", jsonName = "imageInfo", schemaIndex = 4, tag = 5)
    private final ImageInfo image_info;

    @WireField(adapter = "futures_onboarding_value_props.proto.v1.LottieInfo#ADAPTER", jsonName = "lottieInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final LottieInfo lottie_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle_markdown;

    @WireField(adapter = "futures_onboarding_value_props.proto.v1.Theme#ADAPTER", schemaIndex = 5, tag = 6)
    private final Theme theme;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "titleMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title_markdown;

    public Page() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ Page(String str, String str2, String str3, LottieInfo lottieInfo, ImageInfo imageInfo, Theme theme, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : lottieInfo, (i & 16) != 0 ? null : imageInfo, (i & 32) != 0 ? null : theme, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28116newBuilder();
    }

    public final String getTitle_markdown() {
        return this.title_markdown;
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final String getDisclaimer_markdown() {
        return this.disclaimer_markdown;
    }

    public final LottieInfo getLottie_info() {
        return this.lottie_info;
    }

    public final ImageInfo getImage_info() {
        return this.image_info;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Page(String title_markdown, String subtitle_markdown, String str, LottieInfo lottieInfo, ImageInfo imageInfo, Theme theme, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title_markdown, "title_markdown");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title_markdown = title_markdown;
        this.subtitle_markdown = subtitle_markdown;
        this.disclaimer_markdown = str;
        this.lottie_info = lottieInfo;
        this.image_info = imageInfo;
        this.theme = theme;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28116newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Page)) {
            return false;
        }
        Page page = (Page) other;
        return Intrinsics.areEqual(unknownFields(), page.unknownFields()) && Intrinsics.areEqual(this.title_markdown, page.title_markdown) && Intrinsics.areEqual(this.subtitle_markdown, page.subtitle_markdown) && Intrinsics.areEqual(this.disclaimer_markdown, page.disclaimer_markdown) && Intrinsics.areEqual(this.lottie_info, page.lottie_info) && Intrinsics.areEqual(this.image_info, page.image_info) && this.theme == page.theme;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title_markdown.hashCode()) * 37) + this.subtitle_markdown.hashCode()) * 37;
        String str = this.disclaimer_markdown;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        LottieInfo lottieInfo = this.lottie_info;
        int iHashCode3 = (iHashCode2 + (lottieInfo != null ? lottieInfo.hashCode() : 0)) * 37;
        ImageInfo imageInfo = this.image_info;
        int iHashCode4 = (iHashCode3 + (imageInfo != null ? imageInfo.hashCode() : 0)) * 37;
        Theme theme = this.theme;
        int iHashCode5 = iHashCode4 + (theme != null ? theme.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title_markdown=" + Internal.sanitize(this.title_markdown));
        arrayList.add("subtitle_markdown=" + Internal.sanitize(this.subtitle_markdown));
        String str = this.disclaimer_markdown;
        if (str != null) {
            arrayList.add("disclaimer_markdown=" + Internal.sanitize(str));
        }
        LottieInfo lottieInfo = this.lottie_info;
        if (lottieInfo != null) {
            arrayList.add("lottie_info=" + lottieInfo);
        }
        ImageInfo imageInfo = this.image_info;
        if (imageInfo != null) {
            arrayList.add("image_info=" + imageInfo);
        }
        Theme theme = this.theme;
        if (theme != null) {
            arrayList.add("theme=" + theme);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Page{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Page copy$default(Page page, String str, String str2, String str3, LottieInfo lottieInfo, ImageInfo imageInfo, Theme theme, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = page.title_markdown;
        }
        if ((i & 2) != 0) {
            str2 = page.subtitle_markdown;
        }
        if ((i & 4) != 0) {
            str3 = page.disclaimer_markdown;
        }
        if ((i & 8) != 0) {
            lottieInfo = page.lottie_info;
        }
        if ((i & 16) != 0) {
            imageInfo = page.image_info;
        }
        if ((i & 32) != 0) {
            theme = page.theme;
        }
        if ((i & 64) != 0) {
            byteString = page.unknownFields();
        }
        Theme theme2 = theme;
        ByteString byteString2 = byteString;
        ImageInfo imageInfo2 = imageInfo;
        String str4 = str3;
        return page.copy(str, str2, str4, lottieInfo, imageInfo2, theme2, byteString2);
    }

    public final Page copy(String title_markdown, String subtitle_markdown, String disclaimer_markdown, LottieInfo lottie_info, ImageInfo image_info, Theme theme, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title_markdown, "title_markdown");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Page(title_markdown, subtitle_markdown, disclaimer_markdown, lottie_info, image_info, theme, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Page.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Page>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: futures_onboarding_value_props.proto.v1.Page$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Page value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle_markdown());
                }
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle_markdown());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDisclaimer_markdown());
                if (value.getLottie_info() != null) {
                    iEncodedSizeWithTag += LottieInfo.ADAPTER.encodedSizeWithTag(4, value.getLottie_info());
                }
                return iEncodedSizeWithTag + ImageInfo.ADAPTER.encodedSizeWithTag(5, value.getImage_info()) + Theme.ADAPTER.encodedSizeWithTag(6, value.getTheme());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Page value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle_markdown());
                }
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisclaimer_markdown());
                if (value.getLottie_info() != null) {
                    LottieInfo.ADAPTER.encodeWithTag(writer, 4, (int) value.getLottie_info());
                }
                ImageInfo.ADAPTER.encodeWithTag(writer, 5, (int) value.getImage_info());
                Theme.ADAPTER.encodeWithTag(writer, 6, (int) value.getTheme());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Page value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Theme.ADAPTER.encodeWithTag(writer, 6, (int) value.getTheme());
                ImageInfo.ADAPTER.encodeWithTag(writer, 5, (int) value.getImage_info());
                if (value.getLottie_info() != null) {
                    LottieInfo.ADAPTER.encodeWithTag(writer, 4, (int) value.getLottie_info());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDisclaimer_markdown());
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                }
                if (Intrinsics.areEqual(value.getTitle_markdown(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle_markdown());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Page redact(Page value) {
                Intrinsics.checkNotNullParameter(value, "value");
                LottieInfo lottie_info = value.getLottie_info();
                LottieInfo lottieInfoRedact = lottie_info != null ? LottieInfo.ADAPTER.redact(lottie_info) : null;
                ImageInfo image_info = value.getImage_info();
                return Page.copy$default(value, null, null, null, lottieInfoRedact, image_info != null ? ImageInfo.ADAPTER.redact(image_info) : null, null, ByteString.EMPTY, 39, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Page decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                LottieInfo lottieInfoDecode = null;
                ImageInfo imageInfoDecode = null;
                Theme themeDecode = null;
                String strDecode3 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                lottieInfoDecode = LottieInfo.ADAPTER.decode(reader);
                                break;
                            case 5:
                                imageInfoDecode = ImageInfo.ADAPTER.decode(reader);
                                break;
                            case 6:
                                try {
                                    themeDecode = Theme.ADAPTER.decode(reader);
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
                        return new Page(strDecode3, strDecode, strDecode2, lottieInfoDecode, imageInfoDecode, themeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
