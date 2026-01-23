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
import yoda.service.insight.AssetType;

/* compiled from: AdvisoryInsightContentViewModelAsset.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010'\u001a\u00020\u0002H\u0017J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020/H\u0016Jn\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00062"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAsset;", "Lcom/squareup/wire/Message;", "", "asset_type", "Lyoda/service/insight/AssetType;", "contentful_image_details", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImage;", "contentful_video_details", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideo;", "performance_chart_no_highlight_details", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight;", "performance_chart_date_range_highlight_details", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlight;", "performance_chart_single_date_highlight_details", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlight;", "two_bar_chart_comparison_details", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparison;", "returns_breakdown_details", "Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdown;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lyoda/service/insight/AssetType;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImage;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideo;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlight;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlight;Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparison;Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdown;Lokio/ByteString;)V", "getAsset_type", "()Lyoda/service/insight/AssetType;", "getContentful_image_details", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImage;", "getContentful_video_details", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideo;", "getPerformance_chart_no_highlight_details", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight;", "getPerformance_chart_date_range_highlight_details", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlight;", "getPerformance_chart_single_date_highlight_details", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlight;", "getTwo_bar_chart_comparison_details", "()Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparison;", "getReturns_breakdown_details", "()Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdown;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AdvisoryInsightContentViewModelAsset extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryInsightContentViewModelAsset> ADAPTER;

    @WireField(adapter = "yoda.service.insight.AssetType#ADAPTER", jsonName = "assetType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AssetType asset_type;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightContentViewModelAssetImage#ADAPTER", jsonName = "contentfulImageDetails", oneofName = "asset", schemaIndex = 1, tag = 2)
    private final AdvisoryInsightContentViewModelAssetImage contentful_image_details;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightContentViewModelAssetVideo#ADAPTER", jsonName = "contentfulVideoDetails", oneofName = "asset", schemaIndex = 2, tag = 3)
    private final AdvisoryInsightContentViewModelAssetVideo contentful_video_details;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlight#ADAPTER", jsonName = "performanceChartDateRangeHighlightDetails", oneofName = "asset", schemaIndex = 4, tag = 5)
    private final C0231x32a3a379 performance_chart_date_range_highlight_details;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight#ADAPTER", jsonName = "performanceChartNoHighlightDetails", oneofName = "asset", schemaIndex = 3, tag = 4)
    private final AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight performance_chart_no_highlight_details;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlight#ADAPTER", jsonName = "performanceChartSingleDateHighlightDetails", oneofName = "asset", schemaIndex = 5, tag = 6)
    private final C0243x67b4ff8a performance_chart_single_date_highlight_details;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightReturnsBreakdown#ADAPTER", jsonName = "returnsBreakdownDetails", oneofName = "asset", schemaIndex = 7, tag = 8)
    private final AdvisoryInsightReturnsBreakdown returns_breakdown_details;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightTwoBarChartComparison#ADAPTER", jsonName = "twoBarChartComparisonDetails", oneofName = "asset", schemaIndex = 6, tag = 7)
    private final AdvisoryInsightTwoBarChartComparison two_bar_chart_comparison_details;

    public AdvisoryInsightContentViewModelAsset() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4382newBuilder();
    }

    public final AssetType getAsset_type() {
        return this.asset_type;
    }

    public /* synthetic */ AdvisoryInsightContentViewModelAsset(AssetType assetType, AdvisoryInsightContentViewModelAssetImage advisoryInsightContentViewModelAssetImage, AdvisoryInsightContentViewModelAssetVideo advisoryInsightContentViewModelAssetVideo, AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight advisoryInsightContentViewModelAssetPerformanceChartNoHighlight, C0231x32a3a379 c0231x32a3a379, C0243x67b4ff8a c0243x67b4ff8a, AdvisoryInsightTwoBarChartComparison advisoryInsightTwoBarChartComparison, AdvisoryInsightReturnsBreakdown advisoryInsightReturnsBreakdown, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AssetType.ASSET_TYPE_UNSPECIFIED : assetType, (i & 2) != 0 ? null : advisoryInsightContentViewModelAssetImage, (i & 4) != 0 ? null : advisoryInsightContentViewModelAssetVideo, (i & 8) != 0 ? null : advisoryInsightContentViewModelAssetPerformanceChartNoHighlight, (i & 16) != 0 ? null : c0231x32a3a379, (i & 32) != 0 ? null : c0243x67b4ff8a, (i & 64) != 0 ? null : advisoryInsightTwoBarChartComparison, (i & 128) != 0 ? null : advisoryInsightReturnsBreakdown, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AdvisoryInsightContentViewModelAssetImage getContentful_image_details() {
        return this.contentful_image_details;
    }

    public final AdvisoryInsightContentViewModelAssetVideo getContentful_video_details() {
        return this.contentful_video_details;
    }

    public final AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight getPerformance_chart_no_highlight_details() {
        return this.performance_chart_no_highlight_details;
    }

    public final C0231x32a3a379 getPerformance_chart_date_range_highlight_details() {
        return this.performance_chart_date_range_highlight_details;
    }

    public final C0243x67b4ff8a getPerformance_chart_single_date_highlight_details() {
        return this.performance_chart_single_date_highlight_details;
    }

    public final AdvisoryInsightTwoBarChartComparison getTwo_bar_chart_comparison_details() {
        return this.two_bar_chart_comparison_details;
    }

    public final AdvisoryInsightReturnsBreakdown getReturns_breakdown_details() {
        return this.returns_breakdown_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightContentViewModelAsset(AssetType asset_type, AdvisoryInsightContentViewModelAssetImage advisoryInsightContentViewModelAssetImage, AdvisoryInsightContentViewModelAssetVideo advisoryInsightContentViewModelAssetVideo, AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight advisoryInsightContentViewModelAssetPerformanceChartNoHighlight, C0231x32a3a379 c0231x32a3a379, C0243x67b4ff8a c0243x67b4ff8a, AdvisoryInsightTwoBarChartComparison advisoryInsightTwoBarChartComparison, AdvisoryInsightReturnsBreakdown advisoryInsightReturnsBreakdown, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_type = asset_type;
        this.contentful_image_details = advisoryInsightContentViewModelAssetImage;
        this.contentful_video_details = advisoryInsightContentViewModelAssetVideo;
        this.performance_chart_no_highlight_details = advisoryInsightContentViewModelAssetPerformanceChartNoHighlight;
        this.performance_chart_date_range_highlight_details = c0231x32a3a379;
        this.performance_chart_single_date_highlight_details = c0243x67b4ff8a;
        this.two_bar_chart_comparison_details = advisoryInsightTwoBarChartComparison;
        this.returns_breakdown_details = advisoryInsightReturnsBreakdown;
        if (Internal.countNonNull(advisoryInsightContentViewModelAssetImage, advisoryInsightContentViewModelAssetVideo, advisoryInsightContentViewModelAssetPerformanceChartNoHighlight, c0231x32a3a379, c0243x67b4ff8a, advisoryInsightTwoBarChartComparison, advisoryInsightReturnsBreakdown) > 1) {
            throw new IllegalArgumentException("At most one of contentful_image_details, contentful_video_details, performance_chart_no_highlight_details, performance_chart_date_range_highlight_details, performance_chart_single_date_highlight_details, two_bar_chart_comparison_details, returns_breakdown_details may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4382newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightContentViewModelAsset)) {
            return false;
        }
        AdvisoryInsightContentViewModelAsset advisoryInsightContentViewModelAsset = (AdvisoryInsightContentViewModelAsset) other;
        return Intrinsics.areEqual(unknownFields(), advisoryInsightContentViewModelAsset.unknownFields()) && this.asset_type == advisoryInsightContentViewModelAsset.asset_type && Intrinsics.areEqual(this.contentful_image_details, advisoryInsightContentViewModelAsset.contentful_image_details) && Intrinsics.areEqual(this.contentful_video_details, advisoryInsightContentViewModelAsset.contentful_video_details) && Intrinsics.areEqual(this.performance_chart_no_highlight_details, advisoryInsightContentViewModelAsset.performance_chart_no_highlight_details) && Intrinsics.areEqual(this.performance_chart_date_range_highlight_details, advisoryInsightContentViewModelAsset.performance_chart_date_range_highlight_details) && Intrinsics.areEqual(this.performance_chart_single_date_highlight_details, advisoryInsightContentViewModelAsset.performance_chart_single_date_highlight_details) && Intrinsics.areEqual(this.two_bar_chart_comparison_details, advisoryInsightContentViewModelAsset.two_bar_chart_comparison_details) && Intrinsics.areEqual(this.returns_breakdown_details, advisoryInsightContentViewModelAsset.returns_breakdown_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.asset_type.hashCode()) * 37;
        AdvisoryInsightContentViewModelAssetImage advisoryInsightContentViewModelAssetImage = this.contentful_image_details;
        int iHashCode2 = (iHashCode + (advisoryInsightContentViewModelAssetImage != null ? advisoryInsightContentViewModelAssetImage.hashCode() : 0)) * 37;
        AdvisoryInsightContentViewModelAssetVideo advisoryInsightContentViewModelAssetVideo = this.contentful_video_details;
        int iHashCode3 = (iHashCode2 + (advisoryInsightContentViewModelAssetVideo != null ? advisoryInsightContentViewModelAssetVideo.hashCode() : 0)) * 37;
        AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight advisoryInsightContentViewModelAssetPerformanceChartNoHighlight = this.performance_chart_no_highlight_details;
        int iHashCode4 = (iHashCode3 + (advisoryInsightContentViewModelAssetPerformanceChartNoHighlight != null ? advisoryInsightContentViewModelAssetPerformanceChartNoHighlight.hashCode() : 0)) * 37;
        C0231x32a3a379 c0231x32a3a379 = this.performance_chart_date_range_highlight_details;
        int iHashCode5 = (iHashCode4 + (c0231x32a3a379 != null ? c0231x32a3a379.hashCode() : 0)) * 37;
        C0243x67b4ff8a c0243x67b4ff8a = this.performance_chart_single_date_highlight_details;
        int iHashCode6 = (iHashCode5 + (c0243x67b4ff8a != null ? c0243x67b4ff8a.hashCode() : 0)) * 37;
        AdvisoryInsightTwoBarChartComparison advisoryInsightTwoBarChartComparison = this.two_bar_chart_comparison_details;
        int iHashCode7 = (iHashCode6 + (advisoryInsightTwoBarChartComparison != null ? advisoryInsightTwoBarChartComparison.hashCode() : 0)) * 37;
        AdvisoryInsightReturnsBreakdown advisoryInsightReturnsBreakdown = this.returns_breakdown_details;
        int iHashCode8 = iHashCode7 + (advisoryInsightReturnsBreakdown != null ? advisoryInsightReturnsBreakdown.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("asset_type=" + this.asset_type);
        AdvisoryInsightContentViewModelAssetImage advisoryInsightContentViewModelAssetImage = this.contentful_image_details;
        if (advisoryInsightContentViewModelAssetImage != null) {
            arrayList.add("contentful_image_details=" + advisoryInsightContentViewModelAssetImage);
        }
        AdvisoryInsightContentViewModelAssetVideo advisoryInsightContentViewModelAssetVideo = this.contentful_video_details;
        if (advisoryInsightContentViewModelAssetVideo != null) {
            arrayList.add("contentful_video_details=" + advisoryInsightContentViewModelAssetVideo);
        }
        AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight advisoryInsightContentViewModelAssetPerformanceChartNoHighlight = this.performance_chart_no_highlight_details;
        if (advisoryInsightContentViewModelAssetPerformanceChartNoHighlight != null) {
            arrayList.add("performance_chart_no_highlight_details=" + advisoryInsightContentViewModelAssetPerformanceChartNoHighlight);
        }
        C0231x32a3a379 c0231x32a3a379 = this.performance_chart_date_range_highlight_details;
        if (c0231x32a3a379 != null) {
            arrayList.add("performance_chart_date_range_highlight_details=" + c0231x32a3a379);
        }
        C0243x67b4ff8a c0243x67b4ff8a = this.performance_chart_single_date_highlight_details;
        if (c0243x67b4ff8a != null) {
            arrayList.add("performance_chart_single_date_highlight_details=" + c0243x67b4ff8a);
        }
        AdvisoryInsightTwoBarChartComparison advisoryInsightTwoBarChartComparison = this.two_bar_chart_comparison_details;
        if (advisoryInsightTwoBarChartComparison != null) {
            arrayList.add("two_bar_chart_comparison_details=" + advisoryInsightTwoBarChartComparison);
        }
        AdvisoryInsightReturnsBreakdown advisoryInsightReturnsBreakdown = this.returns_breakdown_details;
        if (advisoryInsightReturnsBreakdown != null) {
            arrayList.add("returns_breakdown_details=" + advisoryInsightReturnsBreakdown);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryInsightContentViewModelAsset{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryInsightContentViewModelAsset copy$default(AdvisoryInsightContentViewModelAsset advisoryInsightContentViewModelAsset, AssetType assetType, AdvisoryInsightContentViewModelAssetImage advisoryInsightContentViewModelAssetImage, AdvisoryInsightContentViewModelAssetVideo advisoryInsightContentViewModelAssetVideo, AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight advisoryInsightContentViewModelAssetPerformanceChartNoHighlight, C0231x32a3a379 c0231x32a3a379, C0243x67b4ff8a c0243x67b4ff8a, AdvisoryInsightTwoBarChartComparison advisoryInsightTwoBarChartComparison, AdvisoryInsightReturnsBreakdown advisoryInsightReturnsBreakdown, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            assetType = advisoryInsightContentViewModelAsset.asset_type;
        }
        if ((i & 2) != 0) {
            advisoryInsightContentViewModelAssetImage = advisoryInsightContentViewModelAsset.contentful_image_details;
        }
        if ((i & 4) != 0) {
            advisoryInsightContentViewModelAssetVideo = advisoryInsightContentViewModelAsset.contentful_video_details;
        }
        if ((i & 8) != 0) {
            advisoryInsightContentViewModelAssetPerformanceChartNoHighlight = advisoryInsightContentViewModelAsset.performance_chart_no_highlight_details;
        }
        if ((i & 16) != 0) {
            c0231x32a3a379 = advisoryInsightContentViewModelAsset.performance_chart_date_range_highlight_details;
        }
        if ((i & 32) != 0) {
            c0243x67b4ff8a = advisoryInsightContentViewModelAsset.performance_chart_single_date_highlight_details;
        }
        if ((i & 64) != 0) {
            advisoryInsightTwoBarChartComparison = advisoryInsightContentViewModelAsset.two_bar_chart_comparison_details;
        }
        if ((i & 128) != 0) {
            advisoryInsightReturnsBreakdown = advisoryInsightContentViewModelAsset.returns_breakdown_details;
        }
        if ((i & 256) != 0) {
            byteString = advisoryInsightContentViewModelAsset.unknownFields();
        }
        AdvisoryInsightReturnsBreakdown advisoryInsightReturnsBreakdown2 = advisoryInsightReturnsBreakdown;
        ByteString byteString2 = byteString;
        C0243x67b4ff8a c0243x67b4ff8a2 = c0243x67b4ff8a;
        AdvisoryInsightTwoBarChartComparison advisoryInsightTwoBarChartComparison2 = advisoryInsightTwoBarChartComparison;
        C0231x32a3a379 c0231x32a3a3792 = c0231x32a3a379;
        AdvisoryInsightContentViewModelAssetVideo advisoryInsightContentViewModelAssetVideo2 = advisoryInsightContentViewModelAssetVideo;
        return advisoryInsightContentViewModelAsset.copy(assetType, advisoryInsightContentViewModelAssetImage, advisoryInsightContentViewModelAssetVideo2, advisoryInsightContentViewModelAssetPerformanceChartNoHighlight, c0231x32a3a3792, c0243x67b4ff8a2, advisoryInsightTwoBarChartComparison2, advisoryInsightReturnsBreakdown2, byteString2);
    }

    public final AdvisoryInsightContentViewModelAsset copy(AssetType asset_type, AdvisoryInsightContentViewModelAssetImage contentful_image_details, AdvisoryInsightContentViewModelAssetVideo contentful_video_details, AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight performance_chart_no_highlight_details, C0231x32a3a379 performance_chart_date_range_highlight_details, C0243x67b4ff8a performance_chart_single_date_highlight_details, AdvisoryInsightTwoBarChartComparison two_bar_chart_comparison_details, AdvisoryInsightReturnsBreakdown returns_breakdown_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryInsightContentViewModelAsset(asset_type, contentful_image_details, contentful_video_details, performance_chart_no_highlight_details, performance_chart_date_range_highlight_details, performance_chart_single_date_highlight_details, two_bar_chart_comparison_details, returns_breakdown_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryInsightContentViewModelAsset.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryInsightContentViewModelAsset>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryInsightContentViewModelAsset$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryInsightContentViewModelAsset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAsset_type() != AssetType.ASSET_TYPE_UNSPECIFIED) {
                    size += AssetType.ADAPTER.encodedSizeWithTag(1, value.getAsset_type());
                }
                return size + AdvisoryInsightContentViewModelAssetImage.ADAPTER.encodedSizeWithTag(2, value.getContentful_image_details()) + AdvisoryInsightContentViewModelAssetVideo.ADAPTER.encodedSizeWithTag(3, value.getContentful_video_details()) + AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight.ADAPTER.encodedSizeWithTag(4, value.getPerformance_chart_no_highlight_details()) + C0231x32a3a379.ADAPTER.encodedSizeWithTag(5, value.getPerformance_chart_date_range_highlight_details()) + C0243x67b4ff8a.ADAPTER.encodedSizeWithTag(6, value.getPerformance_chart_single_date_highlight_details()) + AdvisoryInsightTwoBarChartComparison.ADAPTER.encodedSizeWithTag(7, value.getTwo_bar_chart_comparison_details()) + AdvisoryInsightReturnsBreakdown.ADAPTER.encodedSizeWithTag(8, value.getReturns_breakdown_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryInsightContentViewModelAsset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAsset_type() != AssetType.ASSET_TYPE_UNSPECIFIED) {
                    AssetType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset_type());
                }
                AdvisoryInsightContentViewModelAssetImage.ADAPTER.encodeWithTag(writer, 2, (int) value.getContentful_image_details());
                AdvisoryInsightContentViewModelAssetVideo.ADAPTER.encodeWithTag(writer, 3, (int) value.getContentful_video_details());
                AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight.ADAPTER.encodeWithTag(writer, 4, (int) value.getPerformance_chart_no_highlight_details());
                C0231x32a3a379.ADAPTER.encodeWithTag(writer, 5, (int) value.getPerformance_chart_date_range_highlight_details());
                C0243x67b4ff8a.ADAPTER.encodeWithTag(writer, 6, (int) value.getPerformance_chart_single_date_highlight_details());
                AdvisoryInsightTwoBarChartComparison.ADAPTER.encodeWithTag(writer, 7, (int) value.getTwo_bar_chart_comparison_details());
                AdvisoryInsightReturnsBreakdown.ADAPTER.encodeWithTag(writer, 8, (int) value.getReturns_breakdown_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryInsightContentViewModelAsset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AdvisoryInsightReturnsBreakdown.ADAPTER.encodeWithTag(writer, 8, (int) value.getReturns_breakdown_details());
                AdvisoryInsightTwoBarChartComparison.ADAPTER.encodeWithTag(writer, 7, (int) value.getTwo_bar_chart_comparison_details());
                C0243x67b4ff8a.ADAPTER.encodeWithTag(writer, 6, (int) value.getPerformance_chart_single_date_highlight_details());
                C0231x32a3a379.ADAPTER.encodeWithTag(writer, 5, (int) value.getPerformance_chart_date_range_highlight_details());
                AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight.ADAPTER.encodeWithTag(writer, 4, (int) value.getPerformance_chart_no_highlight_details());
                AdvisoryInsightContentViewModelAssetVideo.ADAPTER.encodeWithTag(writer, 3, (int) value.getContentful_video_details());
                AdvisoryInsightContentViewModelAssetImage.ADAPTER.encodeWithTag(writer, 2, (int) value.getContentful_image_details());
                if (value.getAsset_type() != AssetType.ASSET_TYPE_UNSPECIFIED) {
                    AssetType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModelAsset decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AssetType assetTypeDecode = AssetType.ASSET_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                AdvisoryInsightContentViewModelAssetImage advisoryInsightContentViewModelAssetImageDecode = null;
                AdvisoryInsightContentViewModelAssetVideo advisoryInsightContentViewModelAssetVideoDecode = null;
                AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight advisoryInsightContentViewModelAssetPerformanceChartNoHighlightDecode = null;
                C0231x32a3a379 c0231x32a3a379Decode = null;
                C0243x67b4ff8a c0243x67b4ff8aDecode = null;
                AdvisoryInsightTwoBarChartComparison advisoryInsightTwoBarChartComparisonDecode = null;
                AdvisoryInsightReturnsBreakdown advisoryInsightReturnsBreakdownDecode = null;
                while (true) {
                    AssetType assetType = assetTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        assetTypeDecode = AssetType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    advisoryInsightContentViewModelAssetImageDecode = AdvisoryInsightContentViewModelAssetImage.ADAPTER.decode(reader);
                                    break;
                                case 3:
                                    advisoryInsightContentViewModelAssetVideoDecode = AdvisoryInsightContentViewModelAssetVideo.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    advisoryInsightContentViewModelAssetPerformanceChartNoHighlightDecode = AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    c0231x32a3a379Decode = C0231x32a3a379.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    c0243x67b4ff8aDecode = C0243x67b4ff8a.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    advisoryInsightTwoBarChartComparisonDecode = AdvisoryInsightTwoBarChartComparison.ADAPTER.decode(reader);
                                    break;
                                case 8:
                                    advisoryInsightReturnsBreakdownDecode = AdvisoryInsightReturnsBreakdown.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new AdvisoryInsightContentViewModelAsset(assetType, advisoryInsightContentViewModelAssetImageDecode, advisoryInsightContentViewModelAssetVideoDecode, advisoryInsightContentViewModelAssetPerformanceChartNoHighlightDecode, c0231x32a3a379Decode, c0243x67b4ff8aDecode, advisoryInsightTwoBarChartComparisonDecode, advisoryInsightReturnsBreakdownDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModelAsset redact(AdvisoryInsightContentViewModelAsset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisoryInsightContentViewModelAssetImage contentful_image_details = value.getContentful_image_details();
                AdvisoryInsightContentViewModelAssetImage advisoryInsightContentViewModelAssetImageRedact = contentful_image_details != null ? AdvisoryInsightContentViewModelAssetImage.ADAPTER.redact(contentful_image_details) : null;
                AdvisoryInsightContentViewModelAssetVideo contentful_video_details = value.getContentful_video_details();
                AdvisoryInsightContentViewModelAssetVideo advisoryInsightContentViewModelAssetVideoRedact = contentful_video_details != null ? AdvisoryInsightContentViewModelAssetVideo.ADAPTER.redact(contentful_video_details) : null;
                AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight performance_chart_no_highlight_details = value.getPerformance_chart_no_highlight_details();
                AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight advisoryInsightContentViewModelAssetPerformanceChartNoHighlightRedact = performance_chart_no_highlight_details != null ? AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight.ADAPTER.redact(performance_chart_no_highlight_details) : null;
                C0231x32a3a379 performance_chart_date_range_highlight_details = value.getPerformance_chart_date_range_highlight_details();
                C0231x32a3a379 c0231x32a3a379Redact = performance_chart_date_range_highlight_details != null ? C0231x32a3a379.ADAPTER.redact(performance_chart_date_range_highlight_details) : null;
                C0243x67b4ff8a performance_chart_single_date_highlight_details = value.getPerformance_chart_single_date_highlight_details();
                C0243x67b4ff8a c0243x67b4ff8aRedact = performance_chart_single_date_highlight_details != null ? C0243x67b4ff8a.ADAPTER.redact(performance_chart_single_date_highlight_details) : null;
                AdvisoryInsightTwoBarChartComparison two_bar_chart_comparison_details = value.getTwo_bar_chart_comparison_details();
                AdvisoryInsightTwoBarChartComparison advisoryInsightTwoBarChartComparisonRedact = two_bar_chart_comparison_details != null ? AdvisoryInsightTwoBarChartComparison.ADAPTER.redact(two_bar_chart_comparison_details) : null;
                AdvisoryInsightReturnsBreakdown returns_breakdown_details = value.getReturns_breakdown_details();
                return AdvisoryInsightContentViewModelAsset.copy$default(value, null, advisoryInsightContentViewModelAssetImageRedact, advisoryInsightContentViewModelAssetVideoRedact, advisoryInsightContentViewModelAssetPerformanceChartNoHighlightRedact, c0231x32a3a379Redact, c0243x67b4ff8aRedact, advisoryInsightTwoBarChartComparisonRedact, returns_breakdown_details != null ? AdvisoryInsightReturnsBreakdown.ADAPTER.redact(returns_breakdown_details) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
