package gold_flow.proto.p466v1;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.truelayer.payments.p419ui.utils.TestTags;
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

/* compiled from: StreamValuePropsPromoContentResponse.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 G2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GBá\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\b\u0010>\u001a\u00020\u0002H\u0017J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0096\u0002J\b\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020\u0004H\u0016Jà\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006H"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsPromoContentResponse;", "Lcom/squareup/wire/Message;", "", "asset_path", "", "info_tag", "Lgold_flow/proto/v1/GoldValuePropsInfoTag;", "title", "subtitle_markdown", "value_props", "", "Lgold_flow/proto/v1/ValueProp;", "plan_selection_section", "Lgold_flow/proto/v1/GoldPromoPlanSelectionSection;", "gold_free_days", "additional_value_props", "Lgold_flow/proto/v1/GoldPromoAdditionalValueProps;", "disclosure_markdown", "cta_disclosure_markdown", AccountOverviewOptionsSettingCard4.CTA, "Lgold_flow/proto/v1/Cta;", "logging_identifier", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "header_lottie_animation", "Lgold_flow/proto/v1/GoldLottieAnimation;", "plan_section", "Lgold_flow/proto/v1/GoldPromoPlanSection;", TestTags.INFO_BANNER, "Lgold_flow/proto/v1/GoldPromoInfoBanner;", "web_sidebar_content", "Lgold_flow/proto/v1/WebSidebarContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTag;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgold_flow/proto/v1/GoldPromoPlanSelectionSection;Ljava/lang/String;Lgold_flow/proto/v1/GoldPromoAdditionalValueProps;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Lgold_flow/proto/v1/GoldLottieAnimation;Lgold_flow/proto/v1/GoldPromoPlanSection;Lgold_flow/proto/v1/GoldPromoInfoBanner;Lgold_flow/proto/v1/WebSidebarContent;Lokio/ByteString;)V", "getAsset_path", "()Ljava/lang/String;", "getInfo_tag", "()Lgold_flow/proto/v1/GoldValuePropsInfoTag;", "getTitle", "getSubtitle_markdown", "getPlan_selection_section", "()Lgold_flow/proto/v1/GoldPromoPlanSelectionSection;", "getGold_free_days", "getAdditional_value_props", "()Lgold_flow/proto/v1/GoldPromoAdditionalValueProps;", "getDisclosure_markdown", "getCta_disclosure_markdown", "getCta", "()Lgold_flow/proto/v1/Cta;", "getLogging_identifier", "getSecondary_cta", "getHeader_lottie_animation", "()Lgold_flow/proto/v1/GoldLottieAnimation;", "getPlan_section", "()Lgold_flow/proto/v1/GoldPromoPlanSection;", "getInfo_banner", "()Lgold_flow/proto/v1/GoldPromoInfoBanner;", "getWeb_sidebar_content", "()Lgold_flow/proto/v1/WebSidebarContent;", "getValue_props", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamValuePropsPromoContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamValuePropsPromoContentResponse> ADAPTER;

    @WireField(adapter = "gold_flow.proto.v1.GoldPromoAdditionalValueProps#ADAPTER", jsonName = "additionalValueProps", schemaIndex = 7, tag = 8)
    private final GoldPromoAdditionalValueProps additional_value_props;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetPath", schemaIndex = 0, tag = 1)
    private final String asset_path;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", schemaIndex = 10, tag = 11)
    private final Cta cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaDisclosureMarkdown", schemaIndex = 9, tag = 10)
    private final String cta_disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", schemaIndex = 8, tag = 9)
    private final String disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "goldFreeDays", schemaIndex = 6, tag = 7)
    private final String gold_free_days;

    @WireField(adapter = "gold_flow.proto.v1.GoldLottieAnimation#ADAPTER", jsonName = "headerLottieAnimation", schemaIndex = 13, tag = 14)
    private final GoldLottieAnimation header_lottie_animation;

    @WireField(adapter = "gold_flow.proto.v1.GoldPromoInfoBanner#ADAPTER", jsonName = "infoBanner", schemaIndex = 15, tag = 16)
    private final GoldPromoInfoBanner info_banner;

    @WireField(adapter = "gold_flow.proto.v1.GoldValuePropsInfoTag#ADAPTER", jsonName = "infoTag", schemaIndex = 1, tag = 2)
    private final GoldValuePropsInfoTag info_tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 11, tag = 12)
    private final String logging_identifier;

    @WireField(adapter = "gold_flow.proto.v1.GoldPromoPlanSection#ADAPTER", jsonName = "planSection", schemaIndex = 14, tag = 15)
    private final GoldPromoPlanSection plan_section;

    @WireField(adapter = "gold_flow.proto.v1.GoldPromoPlanSelectionSection#ADAPTER", jsonName = "planSelectionSection", schemaIndex = 5, tag = 6)
    private final GoldPromoPlanSelectionSection plan_selection_section;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", jsonName = "secondaryCta", schemaIndex = 12, tag = 13)
    private final Cta secondary_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", schemaIndex = 3, tag = 4)
    private final String subtitle_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String title;

    @WireField(adapter = "gold_flow.proto.v1.ValueProp#ADAPTER", jsonName = "valueProps", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<ValueProp> value_props;

    @WireField(adapter = "gold_flow.proto.v1.WebSidebarContent#ADAPTER", jsonName = "webSidebarContent", schemaIndex = 16, tag = 17)
    private final WebSidebarContent web_sidebar_content;

    public StreamValuePropsPromoContentResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28222newBuilder();
    }

    public final String getAsset_path() {
        return this.asset_path;
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

    public /* synthetic */ StreamValuePropsPromoContentResponse(String str, GoldValuePropsInfoTag goldValuePropsInfoTag, String str2, String str3, List list, GoldPromoPlanSelectionSection goldPromoPlanSelectionSection, String str4, GoldPromoAdditionalValueProps goldPromoAdditionalValueProps, String str5, String str6, Cta cta, String str7, Cta cta2, GoldLottieAnimation goldLottieAnimation, GoldPromoPlanSection goldPromoPlanSection, GoldPromoInfoBanner goldPromoInfoBanner, WebSidebarContent webSidebarContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : goldValuePropsInfoTag, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : goldPromoPlanSelectionSection, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : goldPromoAdditionalValueProps, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : cta, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : cta2, (i & 8192) != 0 ? null : goldLottieAnimation, (i & 16384) != 0 ? null : goldPromoPlanSection, (i & 32768) != 0 ? null : goldPromoInfoBanner, (i & 65536) != 0 ? null : webSidebarContent, (i & 131072) != 0 ? ByteString.EMPTY : byteString);
    }

    public final GoldPromoPlanSelectionSection getPlan_selection_section() {
        return this.plan_selection_section;
    }

    public final String getGold_free_days() {
        return this.gold_free_days;
    }

    public final GoldPromoAdditionalValueProps getAdditional_value_props() {
        return this.additional_value_props;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final String getCta_disclosure_markdown() {
        return this.cta_disclosure_markdown;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final Cta getSecondary_cta() {
        return this.secondary_cta;
    }

    public final GoldLottieAnimation getHeader_lottie_animation() {
        return this.header_lottie_animation;
    }

    public final GoldPromoPlanSection getPlan_section() {
        return this.plan_section;
    }

    public final GoldPromoInfoBanner getInfo_banner() {
        return this.info_banner;
    }

    public final WebSidebarContent getWeb_sidebar_content() {
        return this.web_sidebar_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamValuePropsPromoContentResponse(String str, GoldValuePropsInfoTag goldValuePropsInfoTag, String str2, String str3, List<ValueProp> value_props, GoldPromoPlanSelectionSection goldPromoPlanSelectionSection, String str4, GoldPromoAdditionalValueProps goldPromoAdditionalValueProps, String str5, String str6, Cta cta, String str7, Cta cta2, GoldLottieAnimation goldLottieAnimation, GoldPromoPlanSection goldPromoPlanSection, GoldPromoInfoBanner goldPromoInfoBanner, WebSidebarContent webSidebarContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(value_props, "value_props");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_path = str;
        this.info_tag = goldValuePropsInfoTag;
        this.title = str2;
        this.subtitle_markdown = str3;
        this.plan_selection_section = goldPromoPlanSelectionSection;
        this.gold_free_days = str4;
        this.additional_value_props = goldPromoAdditionalValueProps;
        this.disclosure_markdown = str5;
        this.cta_disclosure_markdown = str6;
        this.cta = cta;
        this.logging_identifier = str7;
        this.secondary_cta = cta2;
        this.header_lottie_animation = goldLottieAnimation;
        this.plan_section = goldPromoPlanSection;
        this.info_banner = goldPromoInfoBanner;
        this.web_sidebar_content = webSidebarContent;
        this.value_props = Internal.immutableCopyOf("value_props", value_props);
    }

    public final List<ValueProp> getValue_props() {
        return this.value_props;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28222newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamValuePropsPromoContentResponse)) {
            return false;
        }
        StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse = (StreamValuePropsPromoContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamValuePropsPromoContentResponse.unknownFields()) && Intrinsics.areEqual(this.asset_path, streamValuePropsPromoContentResponse.asset_path) && Intrinsics.areEqual(this.info_tag, streamValuePropsPromoContentResponse.info_tag) && Intrinsics.areEqual(this.title, streamValuePropsPromoContentResponse.title) && Intrinsics.areEqual(this.subtitle_markdown, streamValuePropsPromoContentResponse.subtitle_markdown) && Intrinsics.areEqual(this.value_props, streamValuePropsPromoContentResponse.value_props) && Intrinsics.areEqual(this.plan_selection_section, streamValuePropsPromoContentResponse.plan_selection_section) && Intrinsics.areEqual(this.gold_free_days, streamValuePropsPromoContentResponse.gold_free_days) && Intrinsics.areEqual(this.additional_value_props, streamValuePropsPromoContentResponse.additional_value_props) && Intrinsics.areEqual(this.disclosure_markdown, streamValuePropsPromoContentResponse.disclosure_markdown) && Intrinsics.areEqual(this.cta_disclosure_markdown, streamValuePropsPromoContentResponse.cta_disclosure_markdown) && Intrinsics.areEqual(this.cta, streamValuePropsPromoContentResponse.cta) && Intrinsics.areEqual(this.logging_identifier, streamValuePropsPromoContentResponse.logging_identifier) && Intrinsics.areEqual(this.secondary_cta, streamValuePropsPromoContentResponse.secondary_cta) && Intrinsics.areEqual(this.header_lottie_animation, streamValuePropsPromoContentResponse.header_lottie_animation) && Intrinsics.areEqual(this.plan_section, streamValuePropsPromoContentResponse.plan_section) && Intrinsics.areEqual(this.info_banner, streamValuePropsPromoContentResponse.info_banner) && Intrinsics.areEqual(this.web_sidebar_content, streamValuePropsPromoContentResponse.web_sidebar_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.asset_path;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        GoldValuePropsInfoTag goldValuePropsInfoTag = this.info_tag;
        int iHashCode3 = (iHashCode2 + (goldValuePropsInfoTag != null ? goldValuePropsInfoTag.hashCode() : 0)) * 37;
        String str2 = this.title;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.subtitle_markdown;
        int iHashCode5 = (((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.value_props.hashCode()) * 37;
        GoldPromoPlanSelectionSection goldPromoPlanSelectionSection = this.plan_selection_section;
        int iHashCode6 = (iHashCode5 + (goldPromoPlanSelectionSection != null ? goldPromoPlanSelectionSection.hashCode() : 0)) * 37;
        String str4 = this.gold_free_days;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        GoldPromoAdditionalValueProps goldPromoAdditionalValueProps = this.additional_value_props;
        int iHashCode8 = (iHashCode7 + (goldPromoAdditionalValueProps != null ? goldPromoAdditionalValueProps.hashCode() : 0)) * 37;
        String str5 = this.disclosure_markdown;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.cta_disclosure_markdown;
        int iHashCode10 = (iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Cta cta = this.cta;
        int iHashCode11 = (iHashCode10 + (cta != null ? cta.hashCode() : 0)) * 37;
        String str7 = this.logging_identifier;
        int iHashCode12 = (iHashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Cta cta2 = this.secondary_cta;
        int iHashCode13 = (iHashCode12 + (cta2 != null ? cta2.hashCode() : 0)) * 37;
        GoldLottieAnimation goldLottieAnimation = this.header_lottie_animation;
        int iHashCode14 = (iHashCode13 + (goldLottieAnimation != null ? goldLottieAnimation.hashCode() : 0)) * 37;
        GoldPromoPlanSection goldPromoPlanSection = this.plan_section;
        int iHashCode15 = (iHashCode14 + (goldPromoPlanSection != null ? goldPromoPlanSection.hashCode() : 0)) * 37;
        GoldPromoInfoBanner goldPromoInfoBanner = this.info_banner;
        int iHashCode16 = (iHashCode15 + (goldPromoInfoBanner != null ? goldPromoInfoBanner.hashCode() : 0)) * 37;
        WebSidebarContent webSidebarContent = this.web_sidebar_content;
        int iHashCode17 = iHashCode16 + (webSidebarContent != null ? webSidebarContent.hashCode() : 0);
        this.hashCode = iHashCode17;
        return iHashCode17;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset_path;
        if (str != null) {
            arrayList.add("asset_path=" + Internal.sanitize(str));
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
        GoldPromoPlanSelectionSection goldPromoPlanSelectionSection = this.plan_selection_section;
        if (goldPromoPlanSelectionSection != null) {
            arrayList.add("plan_selection_section=" + goldPromoPlanSelectionSection);
        }
        String str4 = this.gold_free_days;
        if (str4 != null) {
            arrayList.add("gold_free_days=" + Internal.sanitize(str4));
        }
        GoldPromoAdditionalValueProps goldPromoAdditionalValueProps = this.additional_value_props;
        if (goldPromoAdditionalValueProps != null) {
            arrayList.add("additional_value_props=" + goldPromoAdditionalValueProps);
        }
        String str5 = this.disclosure_markdown;
        if (str5 != null) {
            arrayList.add("disclosure_markdown=" + Internal.sanitize(str5));
        }
        String str6 = this.cta_disclosure_markdown;
        if (str6 != null) {
            arrayList.add("cta_disclosure_markdown=" + Internal.sanitize(str6));
        }
        Cta cta = this.cta;
        if (cta != null) {
            arrayList.add("cta=" + cta);
        }
        String str7 = this.logging_identifier;
        if (str7 != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str7));
        }
        Cta cta2 = this.secondary_cta;
        if (cta2 != null) {
            arrayList.add("secondary_cta=" + cta2);
        }
        GoldLottieAnimation goldLottieAnimation = this.header_lottie_animation;
        if (goldLottieAnimation != null) {
            arrayList.add("header_lottie_animation=" + goldLottieAnimation);
        }
        GoldPromoPlanSection goldPromoPlanSection = this.plan_section;
        if (goldPromoPlanSection != null) {
            arrayList.add("plan_section=" + goldPromoPlanSection);
        }
        GoldPromoInfoBanner goldPromoInfoBanner = this.info_banner;
        if (goldPromoInfoBanner != null) {
            arrayList.add("info_banner=" + goldPromoInfoBanner);
        }
        WebSidebarContent webSidebarContent = this.web_sidebar_content;
        if (webSidebarContent != null) {
            arrayList.add("web_sidebar_content=" + webSidebarContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamValuePropsPromoContentResponse{", "}", 0, null, null, 56, null);
    }

    public final StreamValuePropsPromoContentResponse copy(String asset_path, GoldValuePropsInfoTag info_tag, String title, String subtitle_markdown, List<ValueProp> value_props, GoldPromoPlanSelectionSection plan_selection_section, String gold_free_days, GoldPromoAdditionalValueProps additional_value_props, String disclosure_markdown, String cta_disclosure_markdown, Cta cta, String logging_identifier, Cta secondary_cta, GoldLottieAnimation header_lottie_animation, GoldPromoPlanSection plan_section, GoldPromoInfoBanner info_banner, WebSidebarContent web_sidebar_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(value_props, "value_props");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamValuePropsPromoContentResponse(asset_path, info_tag, title, subtitle_markdown, value_props, plan_selection_section, gold_free_days, additional_value_props, disclosure_markdown, cta_disclosure_markdown, cta, logging_identifier, secondary_cta, header_lottie_animation, plan_section, info_banner, web_sidebar_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamValuePropsPromoContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamValuePropsPromoContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamValuePropsPromoContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamValuePropsPromoContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getAsset_path()) + GoldValuePropsInfoTag.ADAPTER.encodedSizeWithTag(2, value.getInfo_tag()) + protoAdapter.encodedSizeWithTag(3, value.getTitle()) + protoAdapter.encodedSizeWithTag(4, value.getSubtitle_markdown()) + ValueProp.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getValue_props()) + GoldPromoPlanSelectionSection.ADAPTER.encodedSizeWithTag(6, value.getPlan_selection_section()) + protoAdapter.encodedSizeWithTag(7, value.getGold_free_days()) + GoldPromoAdditionalValueProps.ADAPTER.encodedSizeWithTag(8, value.getAdditional_value_props()) + protoAdapter.encodedSizeWithTag(9, value.getDisclosure_markdown()) + protoAdapter.encodedSizeWithTag(10, value.getCta_disclosure_markdown());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(11, value.getCta()) + protoAdapter.encodedSizeWithTag(12, value.getLogging_identifier()) + protoAdapter2.encodedSizeWithTag(13, value.getSecondary_cta()) + GoldLottieAnimation.ADAPTER.encodedSizeWithTag(14, value.getHeader_lottie_animation()) + GoldPromoPlanSection.ADAPTER.encodedSizeWithTag(15, value.getPlan_section()) + GoldPromoInfoBanner.ADAPTER.encodedSizeWithTag(16, value.getInfo_banner()) + WebSidebarContent.ADAPTER.encodedSizeWithTag(17, value.getWeb_sidebar_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamValuePropsPromoContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAsset_path());
                GoldValuePropsInfoTag.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_tag());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getSubtitle_markdown());
                ValueProp.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getValue_props());
                GoldPromoPlanSelectionSection.ADAPTER.encodeWithTag(writer, 6, (int) value.getPlan_selection_section());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getGold_free_days());
                GoldPromoAdditionalValueProps.ADAPTER.encodeWithTag(writer, 8, (int) value.getAdditional_value_props());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getDisclosure_markdown());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getCta_disclosure_markdown());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 11, (int) value.getCta());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getLogging_identifier());
                protoAdapter2.encodeWithTag(writer, 13, (int) value.getSecondary_cta());
                GoldLottieAnimation.ADAPTER.encodeWithTag(writer, 14, (int) value.getHeader_lottie_animation());
                GoldPromoPlanSection.ADAPTER.encodeWithTag(writer, 15, (int) value.getPlan_section());
                GoldPromoInfoBanner.ADAPTER.encodeWithTag(writer, 16, (int) value.getInfo_banner());
                WebSidebarContent.ADAPTER.encodeWithTag(writer, 17, (int) value.getWeb_sidebar_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamValuePropsPromoContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                WebSidebarContent.ADAPTER.encodeWithTag(writer, 17, (int) value.getWeb_sidebar_content());
                GoldPromoInfoBanner.ADAPTER.encodeWithTag(writer, 16, (int) value.getInfo_banner());
                GoldPromoPlanSection.ADAPTER.encodeWithTag(writer, 15, (int) value.getPlan_section());
                GoldLottieAnimation.ADAPTER.encodeWithTag(writer, 14, (int) value.getHeader_lottie_animation());
                ProtoAdapter<Cta> protoAdapter = Cta.ADAPTER;
                protoAdapter.encodeWithTag(writer, 13, (int) value.getSecondary_cta());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 12, (int) value.getLogging_identifier());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getCta());
                protoAdapter2.encodeWithTag(writer, 10, (int) value.getCta_disclosure_markdown());
                protoAdapter2.encodeWithTag(writer, 9, (int) value.getDisclosure_markdown());
                GoldPromoAdditionalValueProps.ADAPTER.encodeWithTag(writer, 8, (int) value.getAdditional_value_props());
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getGold_free_days());
                GoldPromoPlanSelectionSection.ADAPTER.encodeWithTag(writer, 6, (int) value.getPlan_selection_section());
                ValueProp.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getValue_props());
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getSubtitle_markdown());
                protoAdapter2.encodeWithTag(writer, 3, (int) value.getTitle());
                GoldValuePropsInfoTag.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_tag());
                protoAdapter2.encodeWithTag(writer, 1, (int) value.getAsset_path());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamValuePropsPromoContentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                GoldValuePropsInfoTag goldValuePropsInfoTagDecode = null;
                String strDecode = null;
                String strDecode2 = null;
                GoldPromoPlanSelectionSection goldPromoPlanSelectionSectionDecode = null;
                String strDecode3 = null;
                GoldPromoAdditionalValueProps goldPromoAdditionalValuePropsDecode = null;
                String strDecode4 = null;
                String strDecode5 = null;
                Cta ctaDecode = null;
                String strDecode6 = null;
                Cta ctaDecode2 = null;
                GoldLottieAnimation goldLottieAnimationDecode = null;
                GoldPromoPlanSection goldPromoPlanSectionDecode = null;
                GoldPromoInfoBanner goldPromoInfoBannerDecode = null;
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
                                goldPromoPlanSelectionSectionDecode = GoldPromoPlanSelectionSection.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                goldPromoAdditionalValuePropsDecode = GoldPromoAdditionalValueProps.ADAPTER.decode(reader);
                                break;
                            case 9:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                ctaDecode = Cta.ADAPTER.decode(reader);
                                break;
                            case 12:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                ctaDecode2 = Cta.ADAPTER.decode(reader);
                                break;
                            case 14:
                                goldLottieAnimationDecode = GoldLottieAnimation.ADAPTER.decode(reader);
                                break;
                            case 15:
                                goldPromoPlanSectionDecode = GoldPromoPlanSection.ADAPTER.decode(reader);
                                break;
                            case 16:
                                goldPromoInfoBannerDecode = GoldPromoInfoBanner.ADAPTER.decode(reader);
                                break;
                            case 17:
                                webSidebarContentDecode = WebSidebarContent.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        goldValuePropsInfoTagDecode = goldValuePropsInfoTag;
                    } else {
                        return new StreamValuePropsPromoContentResponse(strDecode7, goldValuePropsInfoTag, strDecode, strDecode2, arrayList, goldPromoPlanSelectionSectionDecode, strDecode3, goldPromoAdditionalValuePropsDecode, strDecode4, strDecode5, ctaDecode, strDecode6, ctaDecode2, goldLottieAnimationDecode, goldPromoPlanSectionDecode, goldPromoInfoBannerDecode, webSidebarContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamValuePropsPromoContentResponse redact(StreamValuePropsPromoContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GoldValuePropsInfoTag info_tag = value.getInfo_tag();
                GoldValuePropsInfoTag goldValuePropsInfoTagRedact = info_tag != null ? GoldValuePropsInfoTag.ADAPTER.redact(info_tag) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getValue_props(), ValueProp.ADAPTER);
                GoldPromoPlanSelectionSection plan_selection_section = value.getPlan_selection_section();
                GoldPromoPlanSelectionSection goldPromoPlanSelectionSectionRedact = plan_selection_section != null ? GoldPromoPlanSelectionSection.ADAPTER.redact(plan_selection_section) : null;
                GoldPromoAdditionalValueProps additional_value_props = value.getAdditional_value_props();
                GoldPromoAdditionalValueProps goldPromoAdditionalValuePropsRedact = additional_value_props != null ? GoldPromoAdditionalValueProps.ADAPTER.redact(additional_value_props) : null;
                Cta cta = value.getCta();
                Cta ctaRedact = cta != null ? Cta.ADAPTER.redact(cta) : null;
                Cta secondary_cta = value.getSecondary_cta();
                Cta ctaRedact2 = secondary_cta != null ? Cta.ADAPTER.redact(secondary_cta) : null;
                GoldLottieAnimation header_lottie_animation = value.getHeader_lottie_animation();
                GoldLottieAnimation goldLottieAnimationRedact = header_lottie_animation != null ? GoldLottieAnimation.ADAPTER.redact(header_lottie_animation) : null;
                GoldPromoPlanSection plan_section = value.getPlan_section();
                GoldPromoPlanSection goldPromoPlanSectionRedact = plan_section != null ? GoldPromoPlanSection.ADAPTER.redact(plan_section) : null;
                GoldPromoInfoBanner info_banner = value.getInfo_banner();
                GoldPromoInfoBanner goldPromoInfoBannerRedact = info_banner != null ? GoldPromoInfoBanner.ADAPTER.redact(info_banner) : null;
                WebSidebarContent web_sidebar_content = value.getWeb_sidebar_content();
                return value.copy((2893 & 1) != 0 ? value.asset_path : null, (2893 & 2) != 0 ? value.info_tag : goldValuePropsInfoTagRedact, (2893 & 4) != 0 ? value.title : null, (2893 & 8) != 0 ? value.subtitle_markdown : null, (2893 & 16) != 0 ? value.value_props : listM26823redactElements, (2893 & 32) != 0 ? value.plan_selection_section : goldPromoPlanSelectionSectionRedact, (2893 & 64) != 0 ? value.gold_free_days : null, (2893 & 128) != 0 ? value.additional_value_props : goldPromoAdditionalValuePropsRedact, (2893 & 256) != 0 ? value.disclosure_markdown : null, (2893 & 512) != 0 ? value.cta_disclosure_markdown : null, (2893 & 1024) != 0 ? value.cta : ctaRedact, (2893 & 2048) != 0 ? value.logging_identifier : null, (2893 & 4096) != 0 ? value.secondary_cta : ctaRedact2, (2893 & 8192) != 0 ? value.header_lottie_animation : goldLottieAnimationRedact, (2893 & 16384) != 0 ? value.plan_section : goldPromoPlanSectionRedact, (2893 & 32768) != 0 ? value.info_banner : goldPromoInfoBannerRedact, (2893 & 65536) != 0 ? value.web_sidebar_content : web_sidebar_content != null ? WebSidebarContent.ADAPTER.redact(web_sidebar_content) : null, (2893 & 131072) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
