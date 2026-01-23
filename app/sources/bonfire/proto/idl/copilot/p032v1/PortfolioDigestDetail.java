package bonfire.proto.idl.copilot.p032v1;

import com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt;
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
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: PortfolioDigestDetail.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0091\u0001\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u0097\u0001\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010$R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b)\u0010$R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b\f\u0010+R\"\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b2\u00101R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b7\u00108R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010;R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b<\u0010;¨\u0006>"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetail;", "Lcom/squareup/wire/Message;", "", "", "Lrh_server_driven_ui/v1/UIComponent;", "content_list", "Lbonfire/proto/idl/copilot/v1/ArticleSource;", "article_sources", "", "disclosure_markdown", "navigation_title", "", "is_positive", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "next_generation_at", "pre_header_content", "title_content", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimation;", PortfolioDigestDetailComposableKt.TAG_LOTTIE_ANIMATION, "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChart;", "chart", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Instant;Lrh_server_driven_ui/v1/UIComponent;Lrh_server_driven_ui/v1/UIComponent;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimation;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChart;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Instant;Lrh_server_driven_ui/v1/UIComponent;Lrh_server_driven_ui/v1/UIComponent;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimation;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChart;Lokio/ByteString;)Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetail;", "Ljava/lang/String;", "getDisclosure_markdown", "getNavigation_title", "Z", "()Z", "Lj$/time/Instant;", "getNext_generation_at", "()Lj$/time/Instant;", "Lrh_server_driven_ui/v1/UIComponent;", "getPre_header_content", "()Lrh_server_driven_ui/v1/UIComponent;", "getTitle_content", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimation;", "getLottie_animation", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimation;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChart;", "getChart", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChart;", "Ljava/util/List;", "getContent_list", "()Ljava/util/List;", "getArticle_sources", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PortfolioDigestDetail extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioDigestDetail> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.ArticleSource#ADAPTER", jsonName = "articleSources", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<ArticleSource> article_sources;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.PortfolioDigestDetailChart#ADAPTER", oneofName = "header_content", schemaIndex = 9, tag = 52)
    private final PortfolioDigestDetailChart chart;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = "contentList", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<UIComponent> content_list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPositive", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_positive;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.PortfolioDigestDetailLottieAnimation#ADAPTER", jsonName = "lottieAnimation", oneofName = "header_content", schemaIndex = 8, tag = 51)
    private final PortfolioDigestDetailLottieAnimation lottie_animation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "navigationTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String navigation_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "nextGenerationAt", schemaIndex = 5, tag = 6)
    private final Instant next_generation_at;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = "preHeaderContent", schemaIndex = 6, tag = 7)
    private final UIComponent pre_header_content;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = "titleContent", schemaIndex = 7, tag = 8)
    private final UIComponent title_content;

    public PortfolioDigestDetail() {
        this(null, null, null, null, false, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8877newBuilder();
    }

    public /* synthetic */ PortfolioDigestDetail(List list, List list2, String str, String str2, boolean z, Instant instant, UIComponent uIComponent, UIComponent uIComponent2, PortfolioDigestDetailLottieAnimation portfolioDigestDetailLottieAnimation, PortfolioDigestDetailChart portfolioDigestDetailChart, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : uIComponent, (i & 128) != 0 ? null : uIComponent2, (i & 256) != 0 ? null : portfolioDigestDetailLottieAnimation, (i & 512) != 0 ? null : portfolioDigestDetailChart, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final String getNavigation_title() {
        return this.navigation_title;
    }

    /* renamed from: is_positive, reason: from getter */
    public final boolean getIs_positive() {
        return this.is_positive;
    }

    public final Instant getNext_generation_at() {
        return this.next_generation_at;
    }

    public final UIComponent getPre_header_content() {
        return this.pre_header_content;
    }

    public final UIComponent getTitle_content() {
        return this.title_content;
    }

    public final PortfolioDigestDetailLottieAnimation getLottie_animation() {
        return this.lottie_animation;
    }

    public final PortfolioDigestDetailChart getChart() {
        return this.chart;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioDigestDetail(List<UIComponent> content_list, List<ArticleSource> article_sources, String disclosure_markdown, String navigation_title, boolean z, Instant instant, UIComponent uIComponent, UIComponent uIComponent2, PortfolioDigestDetailLottieAnimation portfolioDigestDetailLottieAnimation, PortfolioDigestDetailChart portfolioDigestDetailChart, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(content_list, "content_list");
        Intrinsics.checkNotNullParameter(article_sources, "article_sources");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(navigation_title, "navigation_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.disclosure_markdown = disclosure_markdown;
        this.navigation_title = navigation_title;
        this.is_positive = z;
        this.next_generation_at = instant;
        this.pre_header_content = uIComponent;
        this.title_content = uIComponent2;
        this.lottie_animation = portfolioDigestDetailLottieAnimation;
        this.chart = portfolioDigestDetailChart;
        this.content_list = Internal.immutableCopyOf("content_list", content_list);
        this.article_sources = Internal.immutableCopyOf("article_sources", article_sources);
        if (Internal.countNonNull(portfolioDigestDetailLottieAnimation, portfolioDigestDetailChart) > 1) {
            throw new IllegalArgumentException("At most one of lottie_animation, chart may be non-null");
        }
    }

    public final List<UIComponent> getContent_list() {
        return this.content_list;
    }

    public final List<ArticleSource> getArticle_sources() {
        return this.article_sources;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8877newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioDigestDetail)) {
            return false;
        }
        PortfolioDigestDetail portfolioDigestDetail = (PortfolioDigestDetail) other;
        return Intrinsics.areEqual(unknownFields(), portfolioDigestDetail.unknownFields()) && Intrinsics.areEqual(this.content_list, portfolioDigestDetail.content_list) && Intrinsics.areEqual(this.article_sources, portfolioDigestDetail.article_sources) && Intrinsics.areEqual(this.disclosure_markdown, portfolioDigestDetail.disclosure_markdown) && Intrinsics.areEqual(this.navigation_title, portfolioDigestDetail.navigation_title) && this.is_positive == portfolioDigestDetail.is_positive && Intrinsics.areEqual(this.next_generation_at, portfolioDigestDetail.next_generation_at) && Intrinsics.areEqual(this.pre_header_content, portfolioDigestDetail.pre_header_content) && Intrinsics.areEqual(this.title_content, portfolioDigestDetail.title_content) && Intrinsics.areEqual(this.lottie_animation, portfolioDigestDetail.lottie_animation) && Intrinsics.areEqual(this.chart, portfolioDigestDetail.chart);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.content_list.hashCode()) * 37) + this.article_sources.hashCode()) * 37) + this.disclosure_markdown.hashCode()) * 37) + this.navigation_title.hashCode()) * 37) + Boolean.hashCode(this.is_positive)) * 37;
        Instant instant = this.next_generation_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        UIComponent uIComponent = this.pre_header_content;
        int iHashCode3 = (iHashCode2 + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37;
        UIComponent uIComponent2 = this.title_content;
        int iHashCode4 = (iHashCode3 + (uIComponent2 != null ? uIComponent2.hashCode() : 0)) * 37;
        PortfolioDigestDetailLottieAnimation portfolioDigestDetailLottieAnimation = this.lottie_animation;
        int iHashCode5 = (iHashCode4 + (portfolioDigestDetailLottieAnimation != null ? portfolioDigestDetailLottieAnimation.hashCode() : 0)) * 37;
        PortfolioDigestDetailChart portfolioDigestDetailChart = this.chart;
        int iHashCode6 = iHashCode5 + (portfolioDigestDetailChart != null ? portfolioDigestDetailChart.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.content_list.isEmpty()) {
            arrayList.add("content_list=" + this.content_list);
        }
        if (!this.article_sources.isEmpty()) {
            arrayList.add("article_sources=" + this.article_sources);
        }
        arrayList.add("disclosure_markdown=" + Internal.sanitize(this.disclosure_markdown));
        arrayList.add("navigation_title=" + Internal.sanitize(this.navigation_title));
        arrayList.add("is_positive=" + this.is_positive);
        Instant instant = this.next_generation_at;
        if (instant != null) {
            arrayList.add("next_generation_at=" + instant);
        }
        UIComponent uIComponent = this.pre_header_content;
        if (uIComponent != null) {
            arrayList.add("pre_header_content=" + uIComponent);
        }
        UIComponent uIComponent2 = this.title_content;
        if (uIComponent2 != null) {
            arrayList.add("title_content=" + uIComponent2);
        }
        PortfolioDigestDetailLottieAnimation portfolioDigestDetailLottieAnimation = this.lottie_animation;
        if (portfolioDigestDetailLottieAnimation != null) {
            arrayList.add("lottie_animation=" + portfolioDigestDetailLottieAnimation);
        }
        PortfolioDigestDetailChart portfolioDigestDetailChart = this.chart;
        if (portfolioDigestDetailChart != null) {
            arrayList.add("chart=" + portfolioDigestDetailChart);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioDigestDetail{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PortfolioDigestDetail copy$default(PortfolioDigestDetail portfolioDigestDetail, List list, List list2, String str, String str2, boolean z, Instant instant, UIComponent uIComponent, UIComponent uIComponent2, PortfolioDigestDetailLottieAnimation portfolioDigestDetailLottieAnimation, PortfolioDigestDetailChart portfolioDigestDetailChart, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = portfolioDigestDetail.content_list;
        }
        if ((i & 2) != 0) {
            list2 = portfolioDigestDetail.article_sources;
        }
        if ((i & 4) != 0) {
            str = portfolioDigestDetail.disclosure_markdown;
        }
        if ((i & 8) != 0) {
            str2 = portfolioDigestDetail.navigation_title;
        }
        if ((i & 16) != 0) {
            z = portfolioDigestDetail.is_positive;
        }
        if ((i & 32) != 0) {
            instant = portfolioDigestDetail.next_generation_at;
        }
        if ((i & 64) != 0) {
            uIComponent = portfolioDigestDetail.pre_header_content;
        }
        if ((i & 128) != 0) {
            uIComponent2 = portfolioDigestDetail.title_content;
        }
        if ((i & 256) != 0) {
            portfolioDigestDetailLottieAnimation = portfolioDigestDetail.lottie_animation;
        }
        if ((i & 512) != 0) {
            portfolioDigestDetailChart = portfolioDigestDetail.chart;
        }
        if ((i & 1024) != 0) {
            byteString = portfolioDigestDetail.unknownFields();
        }
        PortfolioDigestDetailChart portfolioDigestDetailChart2 = portfolioDigestDetailChart;
        ByteString byteString2 = byteString;
        UIComponent uIComponent3 = uIComponent2;
        PortfolioDigestDetailLottieAnimation portfolioDigestDetailLottieAnimation2 = portfolioDigestDetailLottieAnimation;
        Instant instant2 = instant;
        UIComponent uIComponent4 = uIComponent;
        boolean z2 = z;
        String str3 = str;
        return portfolioDigestDetail.copy(list, list2, str3, str2, z2, instant2, uIComponent4, uIComponent3, portfolioDigestDetailLottieAnimation2, portfolioDigestDetailChart2, byteString2);
    }

    public final PortfolioDigestDetail copy(List<UIComponent> content_list, List<ArticleSource> article_sources, String disclosure_markdown, String navigation_title, boolean is_positive, Instant next_generation_at, UIComponent pre_header_content, UIComponent title_content, PortfolioDigestDetailLottieAnimation lottie_animation, PortfolioDigestDetailChart chart, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(content_list, "content_list");
        Intrinsics.checkNotNullParameter(article_sources, "article_sources");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(navigation_title, "navigation_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioDigestDetail(content_list, article_sources, disclosure_markdown, navigation_title, is_positive, next_generation_at, pre_header_content, title_content, lottie_animation, chart, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioDigestDetail.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioDigestDetail>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.PortfolioDigestDetail$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioDigestDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getContent_list()) + ArticleSource.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getArticle_sources());
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDisclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getNavigation_title(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getNavigation_title());
                }
                if (value.getIs_positive()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_positive()));
                }
                return iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getNext_generation_at()) + protoAdapter.encodedSizeWithTag(7, value.getPre_header_content()) + protoAdapter.encodedSizeWithTag(8, value.getTitle_content()) + PortfolioDigestDetailLottieAnimation.ADAPTER.encodedSizeWithTag(51, value.getLottie_animation()) + PortfolioDigestDetailChart.ADAPTER.encodedSizeWithTag(52, value.getChart());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioDigestDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getContent_list());
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getArticle_sources());
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getNavigation_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getNavigation_title());
                }
                if (value.getIs_positive()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_positive()));
                }
                ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getNext_generation_at());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getPre_header_content());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getTitle_content());
                PortfolioDigestDetailLottieAnimation.ADAPTER.encodeWithTag(writer, 51, (int) value.getLottie_animation());
                PortfolioDigestDetailChart.ADAPTER.encodeWithTag(writer, 52, (int) value.getChart());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioDigestDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PortfolioDigestDetailChart.ADAPTER.encodeWithTag(writer, 52, (int) value.getChart());
                PortfolioDigestDetailLottieAnimation.ADAPTER.encodeWithTag(writer, 51, (int) value.getLottie_animation());
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getTitle_content());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getPre_header_content());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getNext_generation_at());
                if (value.getIs_positive()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_positive()));
                }
                if (!Intrinsics.areEqual(value.getNavigation_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getNavigation_title());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisclosure_markdown());
                }
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getArticle_sources());
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getContent_list());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigestDetail decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                UIComponent uIComponentDecode = null;
                UIComponent uIComponentDecode2 = null;
                PortfolioDigestDetailLottieAnimation portfolioDigestDetailLottieAnimationDecode = null;
                PortfolioDigestDetailChart portfolioDigestDetailChartDecode = null;
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PortfolioDigestDetail(arrayList, arrayList2, strDecode, strDecode2, zBooleanValue, instantDecode, uIComponentDecode, uIComponentDecode2, portfolioDigestDetailLottieAnimationDecode, portfolioDigestDetailChartDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 51) {
                        portfolioDigestDetailLottieAnimationDecode = PortfolioDigestDetailLottieAnimation.ADAPTER.decode(reader);
                    } else if (iNextTag != 52) {
                        switch (iNextTag) {
                            case 1:
                                arrayList.add(UIComponent.ADAPTER.decode(reader));
                                break;
                            case 2:
                                arrayList2.add(ArticleSource.ADAPTER.decode(reader));
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 7:
                                uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                                break;
                            case 8:
                                uIComponentDecode2 = UIComponent.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        portfolioDigestDetailChartDecode = PortfolioDigestDetailChart.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigestDetail redact(PortfolioDigestDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<UIComponent> content_list = value.getContent_list();
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(content_list, protoAdapter);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getArticle_sources(), ArticleSource.ADAPTER);
                Instant next_generation_at = value.getNext_generation_at();
                Instant instantRedact = next_generation_at != null ? ProtoAdapter.INSTANT.redact(next_generation_at) : null;
                UIComponent pre_header_content = value.getPre_header_content();
                UIComponent uIComponentRedact = pre_header_content != null ? protoAdapter.redact(pre_header_content) : null;
                UIComponent title_content = value.getTitle_content();
                UIComponent uIComponentRedact2 = title_content != null ? protoAdapter.redact(title_content) : null;
                PortfolioDigestDetailLottieAnimation lottie_animation = value.getLottie_animation();
                PortfolioDigestDetailLottieAnimation portfolioDigestDetailLottieAnimationRedact = lottie_animation != null ? PortfolioDigestDetailLottieAnimation.ADAPTER.redact(lottie_animation) : null;
                PortfolioDigestDetailChart chart = value.getChart();
                return PortfolioDigestDetail.copy$default(value, listM26823redactElements, listM26823redactElements2, null, null, false, instantRedact, uIComponentRedact, uIComponentRedact2, portfolioDigestDetailLottieAnimationRedact, chart != null ? PortfolioDigestDetailChart.ADAPTER.redact(chart) : null, ByteString.EMPTY, 28, null);
            }
        };
    }
}
