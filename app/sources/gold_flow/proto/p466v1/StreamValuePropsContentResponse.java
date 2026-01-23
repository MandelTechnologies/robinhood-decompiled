package gold_flow.proto.p466v1;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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

/* compiled from: StreamValuePropsContentResponse.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B±\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010.\u001a\u00020\u0002H\u0017J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u0004H\u0016J°\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u00068"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsContentResponse;", "Lcom/squareup/wire/Message;", "", "image_path", "", "info_tag", "Lgold_flow/proto/v1/GoldValuePropsInfoTag;", "title", "subtitle_markdown", "value_props", "", "Lgold_flow/proto/v1/ValueProp;", "gold_monthly_cost", "gold_free_days", "learn_more_cta", "Lgold_flow/proto/v1/Cta;", "disclosure_markdown", AccountOverviewOptionsSettingCard4.CTA, "plan_selection_section", "Lgold_flow/proto/v1/GoldPlanSelectionSection;", "cta_disclosure_markdown", "web_sidebar_content", "Lgold_flow/proto/v1/WebSidebarContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTag;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Lgold_flow/proto/v1/GoldPlanSelectionSection;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContent;Lokio/ByteString;)V", "getImage_path", "()Ljava/lang/String;", "getInfo_tag", "()Lgold_flow/proto/v1/GoldValuePropsInfoTag;", "getTitle", "getSubtitle_markdown", "getGold_monthly_cost", "getGold_free_days", "getLearn_more_cta", "()Lgold_flow/proto/v1/Cta;", "getDisclosure_markdown", "getCta", "getPlan_selection_section", "()Lgold_flow/proto/v1/GoldPlanSelectionSection;", "getCta_disclosure_markdown", "getWeb_sidebar_content", "()Lgold_flow/proto/v1/WebSidebarContent;", "getValue_props", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamValuePropsContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamValuePropsContentResponse> ADAPTER;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", schemaIndex = 9, tag = 11)
    private final Cta cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaDisclosureMarkdown", schemaIndex = 11, tag = 13)
    private final String cta_disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", schemaIndex = 8, tag = 10)
    private final String disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "goldFreeDays", schemaIndex = 6, tag = 7)
    private final String gold_free_days;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "goldMonthlyCost", schemaIndex = 5, tag = 6)
    private final String gold_monthly_cost;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imagePath", schemaIndex = 0, tag = 1)
    private final String image_path;

    @WireField(adapter = "gold_flow.proto.v1.GoldValuePropsInfoTag#ADAPTER", jsonName = "infoTag", schemaIndex = 1, tag = 2)
    private final GoldValuePropsInfoTag info_tag;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", jsonName = "learnMoreCta", schemaIndex = 7, tag = 8)
    private final Cta learn_more_cta;

    @WireField(adapter = "gold_flow.proto.v1.GoldPlanSelectionSection#ADAPTER", jsonName = "planSelectionSection", schemaIndex = 10, tag = 12)
    private final GoldPlanSelectionSection plan_selection_section;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", schemaIndex = 3, tag = 4)
    private final String subtitle_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String title;

    @WireField(adapter = "gold_flow.proto.v1.ValueProp#ADAPTER", jsonName = "valueProps", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<ValueProp> value_props;

    @WireField(adapter = "gold_flow.proto.v1.WebSidebarContent#ADAPTER", jsonName = "webSidebarContent", schemaIndex = 12, tag = 14)
    private final WebSidebarContent web_sidebar_content;

    public StreamValuePropsContentResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28218newBuilder();
    }

    public final String getImage_path() {
        return this.image_path;
    }

    public final GoldValuePropsInfoTag getInfo_tag() {
        return this.info_tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public /* synthetic */ StreamValuePropsContentResponse(String str, GoldValuePropsInfoTag goldValuePropsInfoTag, String str2, String str3, List list, String str4, String str5, Cta cta, String str6, Cta cta2, GoldPlanSelectionSection goldPlanSelectionSection, String str7, WebSidebarContent webSidebarContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : goldValuePropsInfoTag, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : cta, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : cta2, (i & 1024) != 0 ? null : goldPlanSelectionSection, (i & 2048) != 0 ? null : str7, (i & 4096) == 0 ? webSidebarContent : null, (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getGold_monthly_cost() {
        return this.gold_monthly_cost;
    }

    public final String getGold_free_days() {
        return this.gold_free_days;
    }

    public final Cta getLearn_more_cta() {
        return this.learn_more_cta;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final GoldPlanSelectionSection getPlan_selection_section() {
        return this.plan_selection_section;
    }

    public final String getCta_disclosure_markdown() {
        return this.cta_disclosure_markdown;
    }

    public final WebSidebarContent getWeb_sidebar_content() {
        return this.web_sidebar_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamValuePropsContentResponse(String str, GoldValuePropsInfoTag goldValuePropsInfoTag, String str2, String str3, List<ValueProp> value_props, String str4, String str5, Cta cta, String str6, Cta cta2, GoldPlanSelectionSection goldPlanSelectionSection, String str7, WebSidebarContent webSidebarContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(value_props, "value_props");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.image_path = str;
        this.info_tag = goldValuePropsInfoTag;
        this.title = str2;
        this.subtitle_markdown = str3;
        this.gold_monthly_cost = str4;
        this.gold_free_days = str5;
        this.learn_more_cta = cta;
        this.disclosure_markdown = str6;
        this.cta = cta2;
        this.plan_selection_section = goldPlanSelectionSection;
        this.cta_disclosure_markdown = str7;
        this.web_sidebar_content = webSidebarContent;
        this.value_props = Internal.immutableCopyOf("value_props", value_props);
    }

    public final List<ValueProp> getValue_props() {
        return this.value_props;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28218newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamValuePropsContentResponse)) {
            return false;
        }
        StreamValuePropsContentResponse streamValuePropsContentResponse = (StreamValuePropsContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamValuePropsContentResponse.unknownFields()) && Intrinsics.areEqual(this.image_path, streamValuePropsContentResponse.image_path) && Intrinsics.areEqual(this.info_tag, streamValuePropsContentResponse.info_tag) && Intrinsics.areEqual(this.title, streamValuePropsContentResponse.title) && Intrinsics.areEqual(this.subtitle_markdown, streamValuePropsContentResponse.subtitle_markdown) && Intrinsics.areEqual(this.value_props, streamValuePropsContentResponse.value_props) && Intrinsics.areEqual(this.gold_monthly_cost, streamValuePropsContentResponse.gold_monthly_cost) && Intrinsics.areEqual(this.gold_free_days, streamValuePropsContentResponse.gold_free_days) && Intrinsics.areEqual(this.learn_more_cta, streamValuePropsContentResponse.learn_more_cta) && Intrinsics.areEqual(this.disclosure_markdown, streamValuePropsContentResponse.disclosure_markdown) && Intrinsics.areEqual(this.cta, streamValuePropsContentResponse.cta) && Intrinsics.areEqual(this.plan_selection_section, streamValuePropsContentResponse.plan_selection_section) && Intrinsics.areEqual(this.cta_disclosure_markdown, streamValuePropsContentResponse.cta_disclosure_markdown) && Intrinsics.areEqual(this.web_sidebar_content, streamValuePropsContentResponse.web_sidebar_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.image_path;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        GoldValuePropsInfoTag goldValuePropsInfoTag = this.info_tag;
        int iHashCode3 = (iHashCode2 + (goldValuePropsInfoTag != null ? goldValuePropsInfoTag.hashCode() : 0)) * 37;
        String str2 = this.title;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.subtitle_markdown;
        int iHashCode5 = (((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.value_props.hashCode()) * 37;
        String str4 = this.gold_monthly_cost;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.gold_free_days;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Cta cta = this.learn_more_cta;
        int iHashCode8 = (iHashCode7 + (cta != null ? cta.hashCode() : 0)) * 37;
        String str6 = this.disclosure_markdown;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Cta cta2 = this.cta;
        int iHashCode10 = (iHashCode9 + (cta2 != null ? cta2.hashCode() : 0)) * 37;
        GoldPlanSelectionSection goldPlanSelectionSection = this.plan_selection_section;
        int iHashCode11 = (iHashCode10 + (goldPlanSelectionSection != null ? goldPlanSelectionSection.hashCode() : 0)) * 37;
        String str7 = this.cta_disclosure_markdown;
        int iHashCode12 = (iHashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        WebSidebarContent webSidebarContent = this.web_sidebar_content;
        int iHashCode13 = iHashCode12 + (webSidebarContent != null ? webSidebarContent.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.image_path;
        if (str != null) {
            arrayList.add("image_path=" + Internal.sanitize(str));
        }
        GoldValuePropsInfoTag goldValuePropsInfoTag = this.info_tag;
        if (goldValuePropsInfoTag != null) {
            arrayList.add("info_tag=" + goldValuePropsInfoTag);
        }
        String str2 = this.title;
        if (str2 != null) {
            arrayList.add("title=" + Internal.sanitize(str2));
        }
        String str3 = this.subtitle_markdown;
        if (str3 != null) {
            arrayList.add("subtitle_markdown=" + Internal.sanitize(str3));
        }
        if (!this.value_props.isEmpty()) {
            arrayList.add("value_props=" + this.value_props);
        }
        String str4 = this.gold_monthly_cost;
        if (str4 != null) {
            arrayList.add("gold_monthly_cost=" + Internal.sanitize(str4));
        }
        String str5 = this.gold_free_days;
        if (str5 != null) {
            arrayList.add("gold_free_days=" + Internal.sanitize(str5));
        }
        Cta cta = this.learn_more_cta;
        if (cta != null) {
            arrayList.add("learn_more_cta=" + cta);
        }
        String str6 = this.disclosure_markdown;
        if (str6 != null) {
            arrayList.add("disclosure_markdown=" + Internal.sanitize(str6));
        }
        Cta cta2 = this.cta;
        if (cta2 != null) {
            arrayList.add("cta=" + cta2);
        }
        GoldPlanSelectionSection goldPlanSelectionSection = this.plan_selection_section;
        if (goldPlanSelectionSection != null) {
            arrayList.add("plan_selection_section=" + goldPlanSelectionSection);
        }
        String str7 = this.cta_disclosure_markdown;
        if (str7 != null) {
            arrayList.add("cta_disclosure_markdown=" + Internal.sanitize(str7));
        }
        WebSidebarContent webSidebarContent = this.web_sidebar_content;
        if (webSidebarContent != null) {
            arrayList.add("web_sidebar_content=" + webSidebarContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamValuePropsContentResponse{", "}", 0, null, null, 56, null);
    }

    public final StreamValuePropsContentResponse copy(String image_path, GoldValuePropsInfoTag info_tag, String title, String subtitle_markdown, List<ValueProp> value_props, String gold_monthly_cost, String gold_free_days, Cta learn_more_cta, String disclosure_markdown, Cta cta, GoldPlanSelectionSection plan_selection_section, String cta_disclosure_markdown, WebSidebarContent web_sidebar_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(value_props, "value_props");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamValuePropsContentResponse(image_path, info_tag, title, subtitle_markdown, value_props, gold_monthly_cost, gold_free_days, learn_more_cta, disclosure_markdown, cta, plan_selection_section, cta_disclosure_markdown, web_sidebar_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamValuePropsContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamValuePropsContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamValuePropsContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamValuePropsContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getImage_path()) + GoldValuePropsInfoTag.ADAPTER.encodedSizeWithTag(2, value.getInfo_tag()) + protoAdapter.encodedSizeWithTag(3, value.getTitle()) + protoAdapter.encodedSizeWithTag(4, value.getSubtitle_markdown()) + ValueProp.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getValue_props()) + protoAdapter.encodedSizeWithTag(6, value.getGold_monthly_cost()) + protoAdapter.encodedSizeWithTag(7, value.getGold_free_days());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(8, value.getLearn_more_cta()) + protoAdapter.encodedSizeWithTag(10, value.getDisclosure_markdown()) + protoAdapter2.encodedSizeWithTag(11, value.getCta()) + GoldPlanSelectionSection.ADAPTER.encodedSizeWithTag(12, value.getPlan_selection_section()) + protoAdapter.encodedSizeWithTag(13, value.getCta_disclosure_markdown()) + WebSidebarContent.ADAPTER.encodedSizeWithTag(14, value.getWeb_sidebar_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamValuePropsContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getImage_path());
                GoldValuePropsInfoTag.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_tag());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getSubtitle_markdown());
                ValueProp.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getValue_props());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getGold_monthly_cost());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getGold_free_days());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getLearn_more_cta());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getDisclosure_markdown());
                protoAdapter2.encodeWithTag(writer, 11, (int) value.getCta());
                GoldPlanSelectionSection.ADAPTER.encodeWithTag(writer, 12, (int) value.getPlan_selection_section());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getCta_disclosure_markdown());
                WebSidebarContent.ADAPTER.encodeWithTag(writer, 14, (int) value.getWeb_sidebar_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamValuePropsContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                WebSidebarContent.ADAPTER.encodeWithTag(writer, 14, (int) value.getWeb_sidebar_content());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 13, (int) value.getCta_disclosure_markdown());
                GoldPlanSelectionSection.ADAPTER.encodeWithTag(writer, 12, (int) value.getPlan_selection_section());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 11, (int) value.getCta());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getDisclosure_markdown());
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getLearn_more_cta());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getGold_free_days());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getGold_monthly_cost());
                ValueProp.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getValue_props());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getSubtitle_markdown());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTitle());
                GoldValuePropsInfoTag.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_tag());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getImage_path());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamValuePropsContentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                GoldValuePropsInfoTag goldValuePropsInfoTagDecode = null;
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                Cta ctaDecode = null;
                String strDecode5 = null;
                Cta ctaDecode2 = null;
                GoldPlanSelectionSection goldPlanSelectionSectionDecode = null;
                String strDecode6 = null;
                WebSidebarContent webSidebarContentDecode = null;
                String strDecode7 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    GoldValuePropsInfoTag goldValuePropsInfoTag = goldValuePropsInfoTagDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                goldValuePropsInfoTagDecode = GoldValuePropsInfoTag.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                arrayList.add(ValueProp.ADAPTER.decode(reader));
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                ctaDecode = Cta.ADAPTER.decode(reader);
                                break;
                            case 9:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                ctaDecode2 = Cta.ADAPTER.decode(reader);
                                break;
                            case 12:
                                goldPlanSelectionSectionDecode = GoldPlanSelectionSection.ADAPTER.decode(reader);
                                break;
                            case 13:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                webSidebarContentDecode = WebSidebarContent.ADAPTER.decode(reader);
                                break;
                        }
                        goldValuePropsInfoTagDecode = goldValuePropsInfoTag;
                    } else {
                        return new StreamValuePropsContentResponse(strDecode7, goldValuePropsInfoTag, strDecode, strDecode2, arrayList, strDecode3, strDecode4, ctaDecode, strDecode5, ctaDecode2, goldPlanSelectionSectionDecode, strDecode6, webSidebarContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamValuePropsContentResponse redact(StreamValuePropsContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GoldValuePropsInfoTag info_tag = value.getInfo_tag();
                GoldValuePropsInfoTag goldValuePropsInfoTagRedact = info_tag != null ? GoldValuePropsInfoTag.ADAPTER.redact(info_tag) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getValue_props(), ValueProp.ADAPTER);
                Cta learn_more_cta = value.getLearn_more_cta();
                Cta ctaRedact = learn_more_cta != null ? Cta.ADAPTER.redact(learn_more_cta) : null;
                Cta cta = value.getCta();
                Cta ctaRedact2 = cta != null ? Cta.ADAPTER.redact(cta) : null;
                GoldPlanSelectionSection plan_selection_section = value.getPlan_selection_section();
                GoldPlanSelectionSection goldPlanSelectionSectionRedact = plan_selection_section != null ? GoldPlanSelectionSection.ADAPTER.redact(plan_selection_section) : null;
                WebSidebarContent web_sidebar_content = value.getWeb_sidebar_content();
                return value.copy((2413 & 1) != 0 ? value.image_path : null, (2413 & 2) != 0 ? value.info_tag : goldValuePropsInfoTagRedact, (2413 & 4) != 0 ? value.title : null, (2413 & 8) != 0 ? value.subtitle_markdown : null, (2413 & 16) != 0 ? value.value_props : listM26823redactElements, (2413 & 32) != 0 ? value.gold_monthly_cost : null, (2413 & 64) != 0 ? value.gold_free_days : null, (2413 & 128) != 0 ? value.learn_more_cta : ctaRedact, (2413 & 256) != 0 ? value.disclosure_markdown : null, (2413 & 512) != 0 ? value.cta : ctaRedact2, (2413 & 1024) != 0 ? value.plan_selection_section : goldPlanSelectionSectionRedact, (2413 & 2048) != 0 ? value.cta_disclosure_markdown : null, (2413 & 4096) != 0 ? value.web_sidebar_content : web_sidebar_content != null ? WebSidebarContent.ADAPTER.redact(web_sidebar_content) : null, (2413 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
