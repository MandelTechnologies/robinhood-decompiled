package advisory.proto.p008v1;

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

/* compiled from: AdvisoryInsightContentViewModel.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J\u0092\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u00065"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModel;", "Lcom/squareup/wire/Message;", "", "content_markdown", "", "contentful_id", "dashboard_highlight", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlight;", "disclosure_markdown", "audio", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudio;", "asset", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAsset;", "icon", "content_markdown_lines", "", "post_content_cta", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCta;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "Ladvisory/proto/v1/AdvisoryInsightCta;", "top_line_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlight;Ljava/lang/String;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudio;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAsset;Ljava/lang/String;Ljava/util/List;Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCta;Ladvisory/proto/v1/AdvisoryInsightCta;Ljava/lang/String;Lokio/ByteString;)V", "getContent_markdown", "()Ljava/lang/String;", "getContentful_id", "getDashboard_highlight", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlight;", "getDisclosure_markdown", "getAudio", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudio;", "getAsset", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAsset;", "getIcon", "getPost_content_cta", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCta;", "getPrimary_cta", "()Ladvisory/proto/v1/AdvisoryInsightCta;", "getTop_line_text", "getContent_markdown_lines", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AdvisoryInsightContentViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryInsightContentViewModel> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightContentViewModelAsset#ADAPTER", schemaIndex = 5, tag = 6)
    private final AdvisoryInsightContentViewModelAsset asset;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightContentViewModelAudio#ADAPTER", schemaIndex = 4, tag = 5)
    private final AdvisoryInsightContentViewModelAudio audio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contentMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String content_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contentMarkdownLines", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<String> content_markdown_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contentfulId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String contentful_id;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightContentViewModelDashboardHighlight#ADAPTER", jsonName = "dashboardHighlight", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AdvisoryInsightContentViewModelDashboardHighlight dashboard_highlight;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", schemaIndex = 3, tag = 4)
    private final String disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String icon;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightContentViewModelPostContentCta#ADAPTER", jsonName = "postContentCta", schemaIndex = 8, tag = 9)
    private final AdvisoryInsightContentViewModelPostContentCta post_content_cta;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightCta#ADAPTER", jsonName = "primaryCta", schemaIndex = 9, tag = 10)
    private final AdvisoryInsightCta primary_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "topLineText", schemaIndex = 10, tag = 11)
    private final String top_line_text;

    public AdvisoryInsightContentViewModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public /* synthetic */ AdvisoryInsightContentViewModel(String str, String str2, AdvisoryInsightContentViewModelDashboardHighlight advisoryInsightContentViewModelDashboardHighlight, String str3, AdvisoryInsightContentViewModelAudio advisoryInsightContentViewModelAudio, AdvisoryInsightContentViewModelAsset advisoryInsightContentViewModelAsset, String str4, List list, AdvisoryInsightContentViewModelPostContentCta advisoryInsightContentViewModelPostContentCta, AdvisoryInsightCta advisoryInsightCta, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : advisoryInsightContentViewModelDashboardHighlight, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : advisoryInsightContentViewModelAudio, (i & 32) != 0 ? null : advisoryInsightContentViewModelAsset, (i & 64) == 0 ? str4 : "", (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : advisoryInsightContentViewModelPostContentCta, (i & 512) != 0 ? null : advisoryInsightCta, (i & 1024) == 0 ? str5 : null, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4381newBuilder();
    }

    public final String getContent_markdown() {
        return this.content_markdown;
    }

    public final String getContentful_id() {
        return this.contentful_id;
    }

    public final AdvisoryInsightContentViewModelDashboardHighlight getDashboard_highlight() {
        return this.dashboard_highlight;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final AdvisoryInsightContentViewModelAudio getAudio() {
        return this.audio;
    }

    public final AdvisoryInsightContentViewModelAsset getAsset() {
        return this.asset;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final AdvisoryInsightContentViewModelPostContentCta getPost_content_cta() {
        return this.post_content_cta;
    }

    public final AdvisoryInsightCta getPrimary_cta() {
        return this.primary_cta;
    }

    public final String getTop_line_text() {
        return this.top_line_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightContentViewModel(String content_markdown, String contentful_id, AdvisoryInsightContentViewModelDashboardHighlight advisoryInsightContentViewModelDashboardHighlight, String str, AdvisoryInsightContentViewModelAudio advisoryInsightContentViewModelAudio, AdvisoryInsightContentViewModelAsset advisoryInsightContentViewModelAsset, String icon, List<String> content_markdown_lines, AdvisoryInsightContentViewModelPostContentCta advisoryInsightContentViewModelPostContentCta, AdvisoryInsightCta advisoryInsightCta, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(content_markdown, "content_markdown");
        Intrinsics.checkNotNullParameter(contentful_id, "contentful_id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(content_markdown_lines, "content_markdown_lines");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.content_markdown = content_markdown;
        this.contentful_id = contentful_id;
        this.dashboard_highlight = advisoryInsightContentViewModelDashboardHighlight;
        this.disclosure_markdown = str;
        this.audio = advisoryInsightContentViewModelAudio;
        this.asset = advisoryInsightContentViewModelAsset;
        this.icon = icon;
        this.post_content_cta = advisoryInsightContentViewModelPostContentCta;
        this.primary_cta = advisoryInsightCta;
        this.top_line_text = str2;
        this.content_markdown_lines = Internal.immutableCopyOf("content_markdown_lines", content_markdown_lines);
    }

    public final List<String> getContent_markdown_lines() {
        return this.content_markdown_lines;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4381newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightContentViewModel)) {
            return false;
        }
        AdvisoryInsightContentViewModel advisoryInsightContentViewModel = (AdvisoryInsightContentViewModel) other;
        return Intrinsics.areEqual(unknownFields(), advisoryInsightContentViewModel.unknownFields()) && Intrinsics.areEqual(this.content_markdown, advisoryInsightContentViewModel.content_markdown) && Intrinsics.areEqual(this.contentful_id, advisoryInsightContentViewModel.contentful_id) && Intrinsics.areEqual(this.dashboard_highlight, advisoryInsightContentViewModel.dashboard_highlight) && Intrinsics.areEqual(this.disclosure_markdown, advisoryInsightContentViewModel.disclosure_markdown) && Intrinsics.areEqual(this.audio, advisoryInsightContentViewModel.audio) && Intrinsics.areEqual(this.asset, advisoryInsightContentViewModel.asset) && Intrinsics.areEqual(this.icon, advisoryInsightContentViewModel.icon) && Intrinsics.areEqual(this.content_markdown_lines, advisoryInsightContentViewModel.content_markdown_lines) && Intrinsics.areEqual(this.post_content_cta, advisoryInsightContentViewModel.post_content_cta) && Intrinsics.areEqual(this.primary_cta, advisoryInsightContentViewModel.primary_cta) && Intrinsics.areEqual(this.top_line_text, advisoryInsightContentViewModel.top_line_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.content_markdown.hashCode()) * 37) + this.contentful_id.hashCode()) * 37;
        AdvisoryInsightContentViewModelDashboardHighlight advisoryInsightContentViewModelDashboardHighlight = this.dashboard_highlight;
        int iHashCode2 = (iHashCode + (advisoryInsightContentViewModelDashboardHighlight != null ? advisoryInsightContentViewModelDashboardHighlight.hashCode() : 0)) * 37;
        String str = this.disclosure_markdown;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        AdvisoryInsightContentViewModelAudio advisoryInsightContentViewModelAudio = this.audio;
        int iHashCode4 = (iHashCode3 + (advisoryInsightContentViewModelAudio != null ? advisoryInsightContentViewModelAudio.hashCode() : 0)) * 37;
        AdvisoryInsightContentViewModelAsset advisoryInsightContentViewModelAsset = this.asset;
        int iHashCode5 = (((((iHashCode4 + (advisoryInsightContentViewModelAsset != null ? advisoryInsightContentViewModelAsset.hashCode() : 0)) * 37) + this.icon.hashCode()) * 37) + this.content_markdown_lines.hashCode()) * 37;
        AdvisoryInsightContentViewModelPostContentCta advisoryInsightContentViewModelPostContentCta = this.post_content_cta;
        int iHashCode6 = (iHashCode5 + (advisoryInsightContentViewModelPostContentCta != null ? advisoryInsightContentViewModelPostContentCta.hashCode() : 0)) * 37;
        AdvisoryInsightCta advisoryInsightCta = this.primary_cta;
        int iHashCode7 = (iHashCode6 + (advisoryInsightCta != null ? advisoryInsightCta.hashCode() : 0)) * 37;
        String str2 = this.top_line_text;
        int iHashCode8 = iHashCode7 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("content_markdown=" + Internal.sanitize(this.content_markdown));
        arrayList.add("contentful_id=" + Internal.sanitize(this.contentful_id));
        AdvisoryInsightContentViewModelDashboardHighlight advisoryInsightContentViewModelDashboardHighlight = this.dashboard_highlight;
        if (advisoryInsightContentViewModelDashboardHighlight != null) {
            arrayList.add("dashboard_highlight=" + advisoryInsightContentViewModelDashboardHighlight);
        }
        String str = this.disclosure_markdown;
        if (str != null) {
            arrayList.add("disclosure_markdown=" + Internal.sanitize(str));
        }
        AdvisoryInsightContentViewModelAudio advisoryInsightContentViewModelAudio = this.audio;
        if (advisoryInsightContentViewModelAudio != null) {
            arrayList.add("audio=" + advisoryInsightContentViewModelAudio);
        }
        AdvisoryInsightContentViewModelAsset advisoryInsightContentViewModelAsset = this.asset;
        if (advisoryInsightContentViewModelAsset != null) {
            arrayList.add("asset=" + advisoryInsightContentViewModelAsset);
        }
        arrayList.add("icon=" + Internal.sanitize(this.icon));
        if (!this.content_markdown_lines.isEmpty()) {
            arrayList.add("content_markdown_lines=" + Internal.sanitize(this.content_markdown_lines));
        }
        AdvisoryInsightContentViewModelPostContentCta advisoryInsightContentViewModelPostContentCta = this.post_content_cta;
        if (advisoryInsightContentViewModelPostContentCta != null) {
            arrayList.add("post_content_cta=" + advisoryInsightContentViewModelPostContentCta);
        }
        AdvisoryInsightCta advisoryInsightCta = this.primary_cta;
        if (advisoryInsightCta != null) {
            arrayList.add("primary_cta=" + advisoryInsightCta);
        }
        String str2 = this.top_line_text;
        if (str2 != null) {
            arrayList.add("top_line_text=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryInsightContentViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryInsightContentViewModel copy$default(AdvisoryInsightContentViewModel advisoryInsightContentViewModel, String str, String str2, AdvisoryInsightContentViewModelDashboardHighlight advisoryInsightContentViewModelDashboardHighlight, String str3, AdvisoryInsightContentViewModelAudio advisoryInsightContentViewModelAudio, AdvisoryInsightContentViewModelAsset advisoryInsightContentViewModelAsset, String str4, List list, AdvisoryInsightContentViewModelPostContentCta advisoryInsightContentViewModelPostContentCta, AdvisoryInsightCta advisoryInsightCta, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryInsightContentViewModel.content_markdown;
        }
        if ((i & 2) != 0) {
            str2 = advisoryInsightContentViewModel.contentful_id;
        }
        if ((i & 4) != 0) {
            advisoryInsightContentViewModelDashboardHighlight = advisoryInsightContentViewModel.dashboard_highlight;
        }
        if ((i & 8) != 0) {
            str3 = advisoryInsightContentViewModel.disclosure_markdown;
        }
        if ((i & 16) != 0) {
            advisoryInsightContentViewModelAudio = advisoryInsightContentViewModel.audio;
        }
        if ((i & 32) != 0) {
            advisoryInsightContentViewModelAsset = advisoryInsightContentViewModel.asset;
        }
        if ((i & 64) != 0) {
            str4 = advisoryInsightContentViewModel.icon;
        }
        if ((i & 128) != 0) {
            list = advisoryInsightContentViewModel.content_markdown_lines;
        }
        if ((i & 256) != 0) {
            advisoryInsightContentViewModelPostContentCta = advisoryInsightContentViewModel.post_content_cta;
        }
        if ((i & 512) != 0) {
            advisoryInsightCta = advisoryInsightContentViewModel.primary_cta;
        }
        if ((i & 1024) != 0) {
            str5 = advisoryInsightContentViewModel.top_line_text;
        }
        if ((i & 2048) != 0) {
            byteString = advisoryInsightContentViewModel.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        AdvisoryInsightContentViewModelPostContentCta advisoryInsightContentViewModelPostContentCta2 = advisoryInsightContentViewModelPostContentCta;
        AdvisoryInsightCta advisoryInsightCta2 = advisoryInsightCta;
        String str7 = str4;
        List list2 = list;
        AdvisoryInsightContentViewModelAudio advisoryInsightContentViewModelAudio2 = advisoryInsightContentViewModelAudio;
        AdvisoryInsightContentViewModelAsset advisoryInsightContentViewModelAsset2 = advisoryInsightContentViewModelAsset;
        return advisoryInsightContentViewModel.copy(str, str2, advisoryInsightContentViewModelDashboardHighlight, str3, advisoryInsightContentViewModelAudio2, advisoryInsightContentViewModelAsset2, str7, list2, advisoryInsightContentViewModelPostContentCta2, advisoryInsightCta2, str6, byteString2);
    }

    public final AdvisoryInsightContentViewModel copy(String content_markdown, String contentful_id, AdvisoryInsightContentViewModelDashboardHighlight dashboard_highlight, String disclosure_markdown, AdvisoryInsightContentViewModelAudio audio, AdvisoryInsightContentViewModelAsset asset, String icon, List<String> content_markdown_lines, AdvisoryInsightContentViewModelPostContentCta post_content_cta, AdvisoryInsightCta primary_cta, String top_line_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(content_markdown, "content_markdown");
        Intrinsics.checkNotNullParameter(contentful_id, "contentful_id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(content_markdown_lines, "content_markdown_lines");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryInsightContentViewModel(content_markdown, contentful_id, dashboard_highlight, disclosure_markdown, audio, asset, icon, content_markdown_lines, post_content_cta, primary_cta, top_line_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryInsightContentViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryInsightContentViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryInsightContentViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryInsightContentViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContent_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContent_markdown());
                }
                if (!Intrinsics.areEqual(value.getContentful_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContentful_id());
                }
                if (value.getDashboard_highlight() != null) {
                    size += AdvisoryInsightContentViewModelDashboardHighlight.ADAPTER.encodedSizeWithTag(3, value.getDashboard_highlight());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getDisclosure_markdown()) + AdvisoryInsightContentViewModelAudio.ADAPTER.encodedSizeWithTag(5, value.getAudio()) + AdvisoryInsightContentViewModelAsset.ADAPTER.encodedSizeWithTag(6, value.getAsset());
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(7, value.getIcon());
                }
                return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(8, value.getContent_markdown_lines()) + AdvisoryInsightContentViewModelPostContentCta.ADAPTER.encodedSizeWithTag(9, value.getPost_content_cta()) + AdvisoryInsightCta.ADAPTER.encodedSizeWithTag(10, value.getPrimary_cta()) + protoAdapter.encodedSizeWithTag(11, value.getTop_line_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryInsightContentViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContent_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContent_markdown());
                }
                if (!Intrinsics.areEqual(value.getContentful_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContentful_id());
                }
                if (value.getDashboard_highlight() != null) {
                    AdvisoryInsightContentViewModelDashboardHighlight.ADAPTER.encodeWithTag(writer, 3, (int) value.getDashboard_highlight());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDisclosure_markdown());
                AdvisoryInsightContentViewModelAudio.ADAPTER.encodeWithTag(writer, 5, (int) value.getAudio());
                AdvisoryInsightContentViewModelAsset.ADAPTER.encodeWithTag(writer, 6, (int) value.getAsset());
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getIcon());
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 8, (int) value.getContent_markdown_lines());
                AdvisoryInsightContentViewModelPostContentCta.ADAPTER.encodeWithTag(writer, 9, (int) value.getPost_content_cta());
                AdvisoryInsightCta.ADAPTER.encodeWithTag(writer, 10, (int) value.getPrimary_cta());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getTop_line_text());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryInsightContentViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 11, (int) value.getTop_line_text());
                AdvisoryInsightCta.ADAPTER.encodeWithTag(writer, 10, (int) value.getPrimary_cta());
                AdvisoryInsightContentViewModelPostContentCta.ADAPTER.encodeWithTag(writer, 9, (int) value.getPost_content_cta());
                protoAdapter.asRepeated().encodeWithTag(writer, 8, (int) value.getContent_markdown_lines());
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getIcon());
                }
                AdvisoryInsightContentViewModelAsset.ADAPTER.encodeWithTag(writer, 6, (int) value.getAsset());
                AdvisoryInsightContentViewModelAudio.ADAPTER.encodeWithTag(writer, 5, (int) value.getAudio());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDisclosure_markdown());
                if (value.getDashboard_highlight() != null) {
                    AdvisoryInsightContentViewModelDashboardHighlight.ADAPTER.encodeWithTag(writer, 3, (int) value.getDashboard_highlight());
                }
                if (!Intrinsics.areEqual(value.getContentful_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getContentful_id());
                }
                if (Intrinsics.areEqual(value.getContent_markdown(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getContent_markdown());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                AdvisoryInsightContentViewModelDashboardHighlight advisoryInsightContentViewModelDashboardHighlightDecode = null;
                String strDecode3 = null;
                AdvisoryInsightContentViewModelAudio advisoryInsightContentViewModelAudioDecode = null;
                AdvisoryInsightContentViewModelAsset advisoryInsightContentViewModelAssetDecode = null;
                AdvisoryInsightContentViewModelPostContentCta advisoryInsightContentViewModelPostContentCtaDecode = null;
                AdvisoryInsightCta advisoryInsightCtaDecode = null;
                String strDecode4 = null;
                String strDecode5 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                advisoryInsightContentViewModelDashboardHighlightDecode = AdvisoryInsightContentViewModelDashboardHighlight.ADAPTER.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                advisoryInsightContentViewModelAudioDecode = AdvisoryInsightContentViewModelAudio.ADAPTER.decode(reader);
                                break;
                            case 6:
                                advisoryInsightContentViewModelAssetDecode = AdvisoryInsightContentViewModelAsset.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 9:
                                advisoryInsightContentViewModelPostContentCtaDecode = AdvisoryInsightContentViewModelPostContentCta.ADAPTER.decode(reader);
                                break;
                            case 10:
                                advisoryInsightCtaDecode = AdvisoryInsightCta.ADAPTER.decode(reader);
                                break;
                            case 11:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AdvisoryInsightContentViewModel(strDecode, strDecode5, advisoryInsightContentViewModelDashboardHighlightDecode, strDecode3, advisoryInsightContentViewModelAudioDecode, advisoryInsightContentViewModelAssetDecode, strDecode2, arrayList, advisoryInsightContentViewModelPostContentCtaDecode, advisoryInsightCtaDecode, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModel redact(AdvisoryInsightContentViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisoryInsightContentViewModelDashboardHighlight dashboard_highlight = value.getDashboard_highlight();
                AdvisoryInsightContentViewModelDashboardHighlight advisoryInsightContentViewModelDashboardHighlightRedact = dashboard_highlight != null ? AdvisoryInsightContentViewModelDashboardHighlight.ADAPTER.redact(dashboard_highlight) : null;
                AdvisoryInsightContentViewModelAudio audio = value.getAudio();
                AdvisoryInsightContentViewModelAudio advisoryInsightContentViewModelAudioRedact = audio != null ? AdvisoryInsightContentViewModelAudio.ADAPTER.redact(audio) : null;
                AdvisoryInsightContentViewModelAsset asset = value.getAsset();
                AdvisoryInsightContentViewModelAsset advisoryInsightContentViewModelAssetRedact = asset != null ? AdvisoryInsightContentViewModelAsset.ADAPTER.redact(asset) : null;
                AdvisoryInsightContentViewModelPostContentCta post_content_cta = value.getPost_content_cta();
                AdvisoryInsightContentViewModelPostContentCta advisoryInsightContentViewModelPostContentCtaRedact = post_content_cta != null ? AdvisoryInsightContentViewModelPostContentCta.ADAPTER.redact(post_content_cta) : null;
                AdvisoryInsightCta primary_cta = value.getPrimary_cta();
                return AdvisoryInsightContentViewModel.copy$default(value, null, null, advisoryInsightContentViewModelDashboardHighlightRedact, null, advisoryInsightContentViewModelAudioRedact, advisoryInsightContentViewModelAssetRedact, null, null, advisoryInsightContentViewModelPostContentCtaRedact, primary_cta != null ? AdvisoryInsightCta.ADAPTER.redact(primary_cta) : null, null, ByteString.EMPTY, 1227, null);
            }
        };
    }
}
