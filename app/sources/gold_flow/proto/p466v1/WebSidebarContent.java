package gold_flow.proto.p466v1;

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

/* compiled from: WebSidebarContent.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0095\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010&\u001a\u00020\u0002H\u0017J\u0013\u0010'\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020\nH\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\u0099\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010-R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0010\u0010$¨\u0006/"}, m3636d2 = {"Lgold_flow/proto/v1/WebSidebarContent;", "Lcom/squareup/wire/Message;", "", "title", "", "info_tag", "Lgold_flow/proto/v1/GoldValuePropsInfoTag;", "subtitle_markdown", "footer_image_url", "footer_image_width", "", "footer_image_height", "background_color", "web_logo_name", "web_logo_color", "title_color", "is_full_bleed", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTag;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getInfo_tag", "()Lgold_flow/proto/v1/GoldValuePropsInfoTag;", "getSubtitle_markdown", "getFooter_image_url", "getFooter_image_width", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFooter_image_height", "getBackground_color", "getWeb_logo_name", "getWeb_logo_color", "getTitle_color", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTag;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)Lgold_flow/proto/v1/WebSidebarContent;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class WebSidebarContent extends Message {

    @JvmField
    public static final ProtoAdapter<WebSidebarContent> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "backgroundColor", schemaIndex = 6, tag = 7)
    private final String background_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "footerImageHeight", schemaIndex = 5, tag = 6)
    private final Integer footer_image_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "footerImageUrl", schemaIndex = 3, tag = 4)
    private final String footer_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "footerImageWidth", schemaIndex = 4, tag = 5)
    private final Integer footer_image_width;

    @WireField(adapter = "gold_flow.proto.v1.GoldValuePropsInfoTag#ADAPTER", jsonName = "infoTag", schemaIndex = 1, tag = 2)
    private final GoldValuePropsInfoTag info_tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isFullBleed", schemaIndex = 10, tag = 11)
    private final Boolean is_full_bleed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", schemaIndex = 2, tag = 3)
    private final String subtitle_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "titleColor", schemaIndex = 9, tag = 10)
    private final String title_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webLogoColor", schemaIndex = 8, tag = 9)
    private final String web_logo_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webLogoName", schemaIndex = 7, tag = 8)
    private final String web_logo_name;

    public WebSidebarContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28224newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final GoldValuePropsInfoTag getInfo_tag() {
        return this.info_tag;
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final String getFooter_image_url() {
        return this.footer_image_url;
    }

    public final Integer getFooter_image_width() {
        return this.footer_image_width;
    }

    public final Integer getFooter_image_height() {
        return this.footer_image_height;
    }

    public final String getBackground_color() {
        return this.background_color;
    }

    public final String getWeb_logo_name() {
        return this.web_logo_name;
    }

    public final String getWeb_logo_color() {
        return this.web_logo_color;
    }

    public final String getTitle_color() {
        return this.title_color;
    }

    /* renamed from: is_full_bleed, reason: from getter */
    public final Boolean getIs_full_bleed() {
        return this.is_full_bleed;
    }

    public /* synthetic */ WebSidebarContent(String str, GoldValuePropsInfoTag goldValuePropsInfoTag, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : goldValuePropsInfoTag, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSidebarContent(String str, GoldValuePropsInfoTag goldValuePropsInfoTag, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.info_tag = goldValuePropsInfoTag;
        this.subtitle_markdown = str2;
        this.footer_image_url = str3;
        this.footer_image_width = num;
        this.footer_image_height = num2;
        this.background_color = str4;
        this.web_logo_name = str5;
        this.web_logo_color = str6;
        this.title_color = str7;
        this.is_full_bleed = bool;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28224newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WebSidebarContent)) {
            return false;
        }
        WebSidebarContent webSidebarContent = (WebSidebarContent) other;
        return Intrinsics.areEqual(unknownFields(), webSidebarContent.unknownFields()) && Intrinsics.areEqual(this.title, webSidebarContent.title) && Intrinsics.areEqual(this.info_tag, webSidebarContent.info_tag) && Intrinsics.areEqual(this.subtitle_markdown, webSidebarContent.subtitle_markdown) && Intrinsics.areEqual(this.footer_image_url, webSidebarContent.footer_image_url) && Intrinsics.areEqual(this.footer_image_width, webSidebarContent.footer_image_width) && Intrinsics.areEqual(this.footer_image_height, webSidebarContent.footer_image_height) && Intrinsics.areEqual(this.background_color, webSidebarContent.background_color) && Intrinsics.areEqual(this.web_logo_name, webSidebarContent.web_logo_name) && Intrinsics.areEqual(this.web_logo_color, webSidebarContent.web_logo_color) && Intrinsics.areEqual(this.title_color, webSidebarContent.title_color) && Intrinsics.areEqual(this.is_full_bleed, webSidebarContent.is_full_bleed);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        GoldValuePropsInfoTag goldValuePropsInfoTag = this.info_tag;
        int iHashCode3 = (iHashCode2 + (goldValuePropsInfoTag != null ? goldValuePropsInfoTag.hashCode() : 0)) * 37;
        String str2 = this.subtitle_markdown;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.footer_image_url;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num = this.footer_image_width;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.footer_image_height;
        int iHashCode7 = (iHashCode6 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str4 = this.background_color;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.web_logo_name;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.web_logo_color;
        int iHashCode10 = (iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.title_color;
        int iHashCode11 = (iHashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Boolean bool = this.is_full_bleed;
        int iHashCode12 = iHashCode11 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        GoldValuePropsInfoTag goldValuePropsInfoTag = this.info_tag;
        if (goldValuePropsInfoTag != null) {
            arrayList.add("info_tag=" + goldValuePropsInfoTag);
        }
        String str2 = this.subtitle_markdown;
        if (str2 != null) {
            arrayList.add("subtitle_markdown=" + Internal.sanitize(str2));
        }
        String str3 = this.footer_image_url;
        if (str3 != null) {
            arrayList.add("footer_image_url=" + Internal.sanitize(str3));
        }
        Integer num = this.footer_image_width;
        if (num != null) {
            arrayList.add("footer_image_width=" + num);
        }
        Integer num2 = this.footer_image_height;
        if (num2 != null) {
            arrayList.add("footer_image_height=" + num2);
        }
        String str4 = this.background_color;
        if (str4 != null) {
            arrayList.add("background_color=" + Internal.sanitize(str4));
        }
        String str5 = this.web_logo_name;
        if (str5 != null) {
            arrayList.add("web_logo_name=" + Internal.sanitize(str5));
        }
        String str6 = this.web_logo_color;
        if (str6 != null) {
            arrayList.add("web_logo_color=" + Internal.sanitize(str6));
        }
        String str7 = this.title_color;
        if (str7 != null) {
            arrayList.add("title_color=" + Internal.sanitize(str7));
        }
        Boolean bool = this.is_full_bleed;
        if (bool != null) {
            arrayList.add("is_full_bleed=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WebSidebarContent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ WebSidebarContent copy$default(WebSidebarContent webSidebarContent, String str, GoldValuePropsInfoTag goldValuePropsInfoTag, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webSidebarContent.title;
        }
        if ((i & 2) != 0) {
            goldValuePropsInfoTag = webSidebarContent.info_tag;
        }
        if ((i & 4) != 0) {
            str2 = webSidebarContent.subtitle_markdown;
        }
        if ((i & 8) != 0) {
            str3 = webSidebarContent.footer_image_url;
        }
        if ((i & 16) != 0) {
            num = webSidebarContent.footer_image_width;
        }
        if ((i & 32) != 0) {
            num2 = webSidebarContent.footer_image_height;
        }
        if ((i & 64) != 0) {
            str4 = webSidebarContent.background_color;
        }
        if ((i & 128) != 0) {
            str5 = webSidebarContent.web_logo_name;
        }
        if ((i & 256) != 0) {
            str6 = webSidebarContent.web_logo_color;
        }
        if ((i & 512) != 0) {
            str7 = webSidebarContent.title_color;
        }
        if ((i & 1024) != 0) {
            bool = webSidebarContent.is_full_bleed;
        }
        if ((i & 2048) != 0) {
            byteString = webSidebarContent.unknownFields();
        }
        Boolean bool2 = bool;
        ByteString byteString2 = byteString;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        Integer num3 = num;
        Integer num4 = num2;
        return webSidebarContent.copy(str, goldValuePropsInfoTag, str2, str3, num3, num4, str10, str11, str8, str9, bool2, byteString2);
    }

    public final WebSidebarContent copy(String title, GoldValuePropsInfoTag info_tag, String subtitle_markdown, String footer_image_url, Integer footer_image_width, Integer footer_image_height, String background_color, String web_logo_name, String web_logo_color, String title_color, Boolean is_full_bleed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WebSidebarContent(title, info_tag, subtitle_markdown, footer_image_url, footer_image_width, footer_image_height, background_color, web_logo_name, web_logo_color, title_color, is_full_bleed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WebSidebarContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WebSidebarContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.WebSidebarContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WebSidebarContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getTitle()) + GoldValuePropsInfoTag.ADAPTER.encodedSizeWithTag(2, value.getInfo_tag()) + protoAdapter.encodedSizeWithTag(3, value.getSubtitle_markdown()) + protoAdapter.encodedSizeWithTag(4, value.getFooter_image_url());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, value.getFooter_image_width()) + protoAdapter2.encodedSizeWithTag(6, value.getFooter_image_height()) + protoAdapter.encodedSizeWithTag(7, value.getBackground_color()) + protoAdapter.encodedSizeWithTag(8, value.getWeb_logo_name()) + protoAdapter.encodedSizeWithTag(9, value.getWeb_logo_color()) + protoAdapter.encodedSizeWithTag(10, value.getTitle_color()) + ProtoAdapter.BOOL.encodedSizeWithTag(11, value.getIs_full_bleed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WebSidebarContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                GoldValuePropsInfoTag.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_tag());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSubtitle_markdown());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getFooter_image_url());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getFooter_image_width());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getFooter_image_height());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getBackground_color());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getWeb_logo_name());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getWeb_logo_color());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getTitle_color());
                ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) value.getIs_full_bleed());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WebSidebarContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) value.getIs_full_bleed());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getTitle_color());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getWeb_logo_color());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getWeb_logo_name());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getBackground_color());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getFooter_image_height());
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getFooter_image_width());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getFooter_image_url());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSubtitle_markdown());
                GoldValuePropsInfoTag.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_tag());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WebSidebarContent redact(WebSidebarContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GoldValuePropsInfoTag info_tag = value.getInfo_tag();
                return WebSidebarContent.copy$default(value, null, info_tag != null ? GoldValuePropsInfoTag.ADAPTER.redact(info_tag) : null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 2045, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WebSidebarContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                GoldValuePropsInfoTag goldValuePropsInfoTagDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                Integer numDecode = null;
                Integer numDecode2 = null;
                String strDecode4 = null;
                String strDecode5 = null;
                String strDecode6 = null;
                String strDecode7 = null;
                Boolean boolDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                goldValuePropsInfoTagDecode = GoldValuePropsInfoTag.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 6:
                                numDecode2 = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new WebSidebarContent(strDecode, goldValuePropsInfoTagDecode, strDecode2, strDecode3, numDecode, numDecode2, strDecode4, strDecode5, strDecode6, strDecode7, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
