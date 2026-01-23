package advisory.proto.p008v1;

import advisory.proto.p008v1.AdvisoryInsightContentViewModelAssetImageDto;
import advisory.proto.p008v1.AdvisoryInsightContentViewModelAssetVideoDto;
import advisory.proto.p008v1.AdvisoryInsightReturnsBreakdownDto;
import advisory.proto.p008v1.AdvisoryInsightTwoBarChartComparisonDto;
import advisory.proto.p008v1.C0233xf0cd8ba6;
import advisory.proto.p008v1.C0238x2c643f20;
import advisory.proto.p008v1.C0245x7ff669f5;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yoda.service.insight.AssetType;
import yoda.service.insight.AssetTypeDto;

/* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAsset;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$Surrogate;)V", "Lyoda/service/insight/AssetTypeDto;", "asset_type", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;", "asset", "(Lyoda/service/insight/AssetTypeDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;)V", "toProto", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAsset;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$Surrogate;", "getAsset", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;", "Companion", "Surrogate", "AssetDto", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class AdvisoryInsightContentViewModelAssetDto implements Dto3<AdvisoryInsightContentViewModelAsset>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisoryInsightContentViewModelAssetDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisoryInsightContentViewModelAssetDto, AdvisoryInsightContentViewModelAsset>> binaryBase64Serializer$delegate;
    private static final AdvisoryInsightContentViewModelAssetDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisoryInsightContentViewModelAssetDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisoryInsightContentViewModelAssetDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AssetDto getAsset() {
        if (this.surrogate.getContentful_image_details() != null) {
            return new AssetDto.ContentfulImageDetails(this.surrogate.getContentful_image_details());
        }
        if (this.surrogate.getContentful_video_details() != null) {
            return new AssetDto.ContentfulVideoDetails(this.surrogate.getContentful_video_details());
        }
        if (this.surrogate.getPerformance_chart_no_highlight_details() != null) {
            return new AssetDto.PerformanceChartNoHighlightDetails(this.surrogate.getPerformance_chart_no_highlight_details());
        }
        if (this.surrogate.getPerformance_chart_date_range_highlight_details() != null) {
            return new AssetDto.PerformanceChartDateRangeHighlightDetails(this.surrogate.getPerformance_chart_date_range_highlight_details());
        }
        if (this.surrogate.getPerformance_chart_single_date_highlight_details() != null) {
            return new AssetDto.PerformanceChartSingleDateHighlightDetails(this.surrogate.getPerformance_chart_single_date_highlight_details());
        }
        if (this.surrogate.getTwo_bar_chart_comparison_details() != null) {
            return new AssetDto.TwoBarChartComparisonDetails(this.surrogate.getTwo_bar_chart_comparison_details());
        }
        if (this.surrogate.getReturns_breakdown_details() != null) {
            return new AssetDto.ReturnsBreakdownDetails(this.surrogate.getReturns_breakdown_details());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdvisoryInsightContentViewModelAssetDto(AssetTypeDto asset_type, AssetDto assetDto) {
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        AssetDto.ContentfulImageDetails contentfulImageDetails = assetDto instanceof AssetDto.ContentfulImageDetails ? (AssetDto.ContentfulImageDetails) assetDto : null;
        AdvisoryInsightContentViewModelAssetImageDto value = contentfulImageDetails != null ? contentfulImageDetails.getValue() : null;
        AssetDto.ContentfulVideoDetails contentfulVideoDetails = assetDto instanceof AssetDto.ContentfulVideoDetails ? (AssetDto.ContentfulVideoDetails) assetDto : null;
        AdvisoryInsightContentViewModelAssetVideoDto value2 = contentfulVideoDetails != null ? contentfulVideoDetails.getValue() : null;
        AssetDto.PerformanceChartNoHighlightDetails performanceChartNoHighlightDetails = assetDto instanceof AssetDto.PerformanceChartNoHighlightDetails ? (AssetDto.PerformanceChartNoHighlightDetails) assetDto : null;
        C0238x2c643f20 value3 = performanceChartNoHighlightDetails != null ? performanceChartNoHighlightDetails.getValue() : null;
        AssetDto.PerformanceChartDateRangeHighlightDetails performanceChartDateRangeHighlightDetails = assetDto instanceof AssetDto.PerformanceChartDateRangeHighlightDetails ? (AssetDto.PerformanceChartDateRangeHighlightDetails) assetDto : null;
        C0233xf0cd8ba6 value4 = performanceChartDateRangeHighlightDetails != null ? performanceChartDateRangeHighlightDetails.getValue() : null;
        AssetDto.PerformanceChartSingleDateHighlightDetails performanceChartSingleDateHighlightDetails = assetDto instanceof AssetDto.PerformanceChartSingleDateHighlightDetails ? (AssetDto.PerformanceChartSingleDateHighlightDetails) assetDto : null;
        C0245x7ff669f5 value5 = performanceChartSingleDateHighlightDetails != null ? performanceChartSingleDateHighlightDetails.getValue() : null;
        AssetDto.TwoBarChartComparisonDetails twoBarChartComparisonDetails = assetDto instanceof AssetDto.TwoBarChartComparisonDetails ? (AssetDto.TwoBarChartComparisonDetails) assetDto : null;
        AdvisoryInsightTwoBarChartComparisonDto value6 = twoBarChartComparisonDetails != null ? twoBarChartComparisonDetails.getValue() : null;
        AssetDto.ReturnsBreakdownDetails returnsBreakdownDetails = assetDto instanceof AssetDto.ReturnsBreakdownDetails ? (AssetDto.ReturnsBreakdownDetails) assetDto : null;
        this(new Surrogate(asset_type, value, value2, value3, value4, value5, value6, returnsBreakdownDetails != null ? returnsBreakdownDetails.getValue() : null));
    }

    public /* synthetic */ AdvisoryInsightContentViewModelAssetDto(AssetTypeDto assetTypeDto, AssetDto assetDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AssetTypeDto.INSTANCE.getZeroValue() : assetTypeDto, (i & 2) != 0 ? null : assetDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AdvisoryInsightContentViewModelAsset toProto() {
        AssetType assetType = (AssetType) this.surrogate.getAsset_type().toProto();
        AdvisoryInsightContentViewModelAssetImageDto contentful_image_details = this.surrogate.getContentful_image_details();
        AdvisoryInsightContentViewModelAssetImage proto = contentful_image_details != null ? contentful_image_details.toProto() : null;
        AdvisoryInsightContentViewModelAssetVideoDto contentful_video_details = this.surrogate.getContentful_video_details();
        AdvisoryInsightContentViewModelAssetVideo proto2 = contentful_video_details != null ? contentful_video_details.toProto() : null;
        C0238x2c643f20 performance_chart_no_highlight_details = this.surrogate.getPerformance_chart_no_highlight_details();
        AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight proto3 = performance_chart_no_highlight_details != null ? performance_chart_no_highlight_details.toProto() : null;
        C0233xf0cd8ba6 performance_chart_date_range_highlight_details = this.surrogate.getPerformance_chart_date_range_highlight_details();
        C0231x32a3a379 proto4 = performance_chart_date_range_highlight_details != null ? performance_chart_date_range_highlight_details.toProto() : null;
        C0245x7ff669f5 performance_chart_single_date_highlight_details = this.surrogate.getPerformance_chart_single_date_highlight_details();
        C0243x67b4ff8a proto5 = performance_chart_single_date_highlight_details != null ? performance_chart_single_date_highlight_details.toProto() : null;
        AdvisoryInsightTwoBarChartComparisonDto two_bar_chart_comparison_details = this.surrogate.getTwo_bar_chart_comparison_details();
        AdvisoryInsightTwoBarChartComparison proto6 = two_bar_chart_comparison_details != null ? two_bar_chart_comparison_details.toProto() : null;
        AdvisoryInsightReturnsBreakdownDto returns_breakdown_details = this.surrogate.getReturns_breakdown_details();
        return new AdvisoryInsightContentViewModelAsset(assetType, proto, proto2, proto3, proto4, proto5, proto6, returns_breakdown_details != null ? returns_breakdown_details.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[AdvisoryInsightContentViewModelAssetDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisoryInsightContentViewModelAssetDto) && Intrinsics.areEqual(((AdvisoryInsightContentViewModelAssetDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b&\b\u0083\b\u0018\u0000 L2\u00020\u0001:\u0002MLBe\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bk\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b7\u0010/\u001a\u0004\b5\u00106R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b;\u0010/\u001a\u0004\b9\u0010:R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\b?\u0010/\u001a\u0004\b=\u0010>R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bC\u0010/\u001a\u0004\bA\u0010BR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010D\u0012\u0004\bG\u0010/\u001a\u0004\bE\u0010FR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010H\u0012\u0004\bK\u0010/\u001a\u0004\bI\u0010J¨\u0006N"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$Surrogate;", "", "Lyoda/service/insight/AssetTypeDto;", "asset_type", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImageDto;", "contentful_image_details", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideoDto;", "contentful_video_details", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlightDto;", "performance_chart_no_highlight_details", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlightDto;", "performance_chart_date_range_highlight_details", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlightDto;", "performance_chart_single_date_highlight_details", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;", "two_bar_chart_comparison_details", "Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdownDto;", "returns_breakdown_details", "<init>", "(Lyoda/service/insight/AssetTypeDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImageDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideoDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlightDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlightDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlightDto;Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdownDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILyoda/service/insight/AssetTypeDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImageDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideoDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlightDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlightDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlightDto;Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdownDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lyoda/service/insight/AssetTypeDto;", "getAsset_type", "()Lyoda/service/insight/AssetTypeDto;", "getAsset_type$annotations", "()V", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImageDto;", "getContentful_image_details", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImageDto;", "getContentful_image_details$annotations", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideoDto;", "getContentful_video_details", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideoDto;", "getContentful_video_details$annotations", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlightDto;", "getPerformance_chart_no_highlight_details", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlightDto;", "getPerformance_chart_no_highlight_details$annotations", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlightDto;", "getPerformance_chart_date_range_highlight_details", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlightDto;", "getPerformance_chart_date_range_highlight_details$annotations", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlightDto;", "getPerformance_chart_single_date_highlight_details", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlightDto;", "getPerformance_chart_single_date_highlight_details$annotations", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;", "getTwo_bar_chart_comparison_details", "()Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;", "getTwo_bar_chart_comparison_details$annotations", "Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdownDto;", "getReturns_breakdown_details", "()Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdownDto;", "getReturns_breakdown_details$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AssetTypeDto asset_type;
        private final AdvisoryInsightContentViewModelAssetImageDto contentful_image_details;
        private final AdvisoryInsightContentViewModelAssetVideoDto contentful_video_details;
        private final C0233xf0cd8ba6 performance_chart_date_range_highlight_details;
        private final C0238x2c643f20 performance_chart_no_highlight_details;
        private final C0245x7ff669f5 performance_chart_single_date_highlight_details;
        private final AdvisoryInsightReturnsBreakdownDto returns_breakdown_details;
        private final AdvisoryInsightTwoBarChartComparisonDto two_bar_chart_comparison_details;

        public Surrogate() {
            this((AssetTypeDto) null, (AdvisoryInsightContentViewModelAssetImageDto) null, (AdvisoryInsightContentViewModelAssetVideoDto) null, (C0238x2c643f20) null, (C0233xf0cd8ba6) null, (C0245x7ff669f5) null, (AdvisoryInsightTwoBarChartComparisonDto) null, (AdvisoryInsightReturnsBreakdownDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.asset_type == surrogate.asset_type && Intrinsics.areEqual(this.contentful_image_details, surrogate.contentful_image_details) && Intrinsics.areEqual(this.contentful_video_details, surrogate.contentful_video_details) && Intrinsics.areEqual(this.performance_chart_no_highlight_details, surrogate.performance_chart_no_highlight_details) && Intrinsics.areEqual(this.performance_chart_date_range_highlight_details, surrogate.performance_chart_date_range_highlight_details) && Intrinsics.areEqual(this.performance_chart_single_date_highlight_details, surrogate.performance_chart_single_date_highlight_details) && Intrinsics.areEqual(this.two_bar_chart_comparison_details, surrogate.two_bar_chart_comparison_details) && Intrinsics.areEqual(this.returns_breakdown_details, surrogate.returns_breakdown_details);
        }

        public int hashCode() {
            int iHashCode = this.asset_type.hashCode() * 31;
            AdvisoryInsightContentViewModelAssetImageDto advisoryInsightContentViewModelAssetImageDto = this.contentful_image_details;
            int iHashCode2 = (iHashCode + (advisoryInsightContentViewModelAssetImageDto == null ? 0 : advisoryInsightContentViewModelAssetImageDto.hashCode())) * 31;
            AdvisoryInsightContentViewModelAssetVideoDto advisoryInsightContentViewModelAssetVideoDto = this.contentful_video_details;
            int iHashCode3 = (iHashCode2 + (advisoryInsightContentViewModelAssetVideoDto == null ? 0 : advisoryInsightContentViewModelAssetVideoDto.hashCode())) * 31;
            C0238x2c643f20 c0238x2c643f20 = this.performance_chart_no_highlight_details;
            int iHashCode4 = (iHashCode3 + (c0238x2c643f20 == null ? 0 : c0238x2c643f20.hashCode())) * 31;
            C0233xf0cd8ba6 c0233xf0cd8ba6 = this.performance_chart_date_range_highlight_details;
            int iHashCode5 = (iHashCode4 + (c0233xf0cd8ba6 == null ? 0 : c0233xf0cd8ba6.hashCode())) * 31;
            C0245x7ff669f5 c0245x7ff669f5 = this.performance_chart_single_date_highlight_details;
            int iHashCode6 = (iHashCode5 + (c0245x7ff669f5 == null ? 0 : c0245x7ff669f5.hashCode())) * 31;
            AdvisoryInsightTwoBarChartComparisonDto advisoryInsightTwoBarChartComparisonDto = this.two_bar_chart_comparison_details;
            int iHashCode7 = (iHashCode6 + (advisoryInsightTwoBarChartComparisonDto == null ? 0 : advisoryInsightTwoBarChartComparisonDto.hashCode())) * 31;
            AdvisoryInsightReturnsBreakdownDto advisoryInsightReturnsBreakdownDto = this.returns_breakdown_details;
            return iHashCode7 + (advisoryInsightReturnsBreakdownDto != null ? advisoryInsightReturnsBreakdownDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(asset_type=" + this.asset_type + ", contentful_image_details=" + this.contentful_image_details + ", contentful_video_details=" + this.contentful_video_details + ", performance_chart_no_highlight_details=" + this.performance_chart_no_highlight_details + ", performance_chart_date_range_highlight_details=" + this.performance_chart_date_range_highlight_details + ", performance_chart_single_date_highlight_details=" + this.performance_chart_single_date_highlight_details + ", two_bar_chart_comparison_details=" + this.two_bar_chart_comparison_details + ", returns_breakdown_details=" + this.returns_breakdown_details + ")";
        }

        /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisoryInsightContentViewModelAssetDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AssetTypeDto assetTypeDto, AdvisoryInsightContentViewModelAssetImageDto advisoryInsightContentViewModelAssetImageDto, AdvisoryInsightContentViewModelAssetVideoDto advisoryInsightContentViewModelAssetVideoDto, C0238x2c643f20 c0238x2c643f20, C0233xf0cd8ba6 c0233xf0cd8ba6, C0245x7ff669f5 c0245x7ff669f5, AdvisoryInsightTwoBarChartComparisonDto advisoryInsightTwoBarChartComparisonDto, AdvisoryInsightReturnsBreakdownDto advisoryInsightReturnsBreakdownDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.asset_type = (i & 1) == 0 ? AssetTypeDto.INSTANCE.getZeroValue() : assetTypeDto;
            if ((i & 2) == 0) {
                this.contentful_image_details = null;
            } else {
                this.contentful_image_details = advisoryInsightContentViewModelAssetImageDto;
            }
            if ((i & 4) == 0) {
                this.contentful_video_details = null;
            } else {
                this.contentful_video_details = advisoryInsightContentViewModelAssetVideoDto;
            }
            if ((i & 8) == 0) {
                this.performance_chart_no_highlight_details = null;
            } else {
                this.performance_chart_no_highlight_details = c0238x2c643f20;
            }
            if ((i & 16) == 0) {
                this.performance_chart_date_range_highlight_details = null;
            } else {
                this.performance_chart_date_range_highlight_details = c0233xf0cd8ba6;
            }
            if ((i & 32) == 0) {
                this.performance_chart_single_date_highlight_details = null;
            } else {
                this.performance_chart_single_date_highlight_details = c0245x7ff669f5;
            }
            if ((i & 64) == 0) {
                this.two_bar_chart_comparison_details = null;
            } else {
                this.two_bar_chart_comparison_details = advisoryInsightTwoBarChartComparisonDto;
            }
            if ((i & 128) == 0) {
                this.returns_breakdown_details = null;
            } else {
                this.returns_breakdown_details = advisoryInsightReturnsBreakdownDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.asset_type != AssetTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, AssetTypeDto.Serializer.INSTANCE, self.asset_type);
            }
            AdvisoryInsightContentViewModelAssetImageDto advisoryInsightContentViewModelAssetImageDto = self.contentful_image_details;
            if (advisoryInsightContentViewModelAssetImageDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, AdvisoryInsightContentViewModelAssetImageDto.Serializer.INSTANCE, advisoryInsightContentViewModelAssetImageDto);
            }
            AdvisoryInsightContentViewModelAssetVideoDto advisoryInsightContentViewModelAssetVideoDto = self.contentful_video_details;
            if (advisoryInsightContentViewModelAssetVideoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, AdvisoryInsightContentViewModelAssetVideoDto.Serializer.INSTANCE, advisoryInsightContentViewModelAssetVideoDto);
            }
            C0238x2c643f20 c0238x2c643f20 = self.performance_chart_no_highlight_details;
            if (c0238x2c643f20 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, C0238x2c643f20.Serializer.INSTANCE, c0238x2c643f20);
            }
            C0233xf0cd8ba6 c0233xf0cd8ba6 = self.performance_chart_date_range_highlight_details;
            if (c0233xf0cd8ba6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, C0233xf0cd8ba6.Serializer.INSTANCE, c0233xf0cd8ba6);
            }
            C0245x7ff669f5 c0245x7ff669f5 = self.performance_chart_single_date_highlight_details;
            if (c0245x7ff669f5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, C0245x7ff669f5.Serializer.INSTANCE, c0245x7ff669f5);
            }
            AdvisoryInsightTwoBarChartComparisonDto advisoryInsightTwoBarChartComparisonDto = self.two_bar_chart_comparison_details;
            if (advisoryInsightTwoBarChartComparisonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, AdvisoryInsightTwoBarChartComparisonDto.Serializer.INSTANCE, advisoryInsightTwoBarChartComparisonDto);
            }
            AdvisoryInsightReturnsBreakdownDto advisoryInsightReturnsBreakdownDto = self.returns_breakdown_details;
            if (advisoryInsightReturnsBreakdownDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, AdvisoryInsightReturnsBreakdownDto.Serializer.INSTANCE, advisoryInsightReturnsBreakdownDto);
            }
        }

        public Surrogate(AssetTypeDto asset_type, AdvisoryInsightContentViewModelAssetImageDto advisoryInsightContentViewModelAssetImageDto, AdvisoryInsightContentViewModelAssetVideoDto advisoryInsightContentViewModelAssetVideoDto, C0238x2c643f20 c0238x2c643f20, C0233xf0cd8ba6 c0233xf0cd8ba6, C0245x7ff669f5 c0245x7ff669f5, AdvisoryInsightTwoBarChartComparisonDto advisoryInsightTwoBarChartComparisonDto, AdvisoryInsightReturnsBreakdownDto advisoryInsightReturnsBreakdownDto) {
            Intrinsics.checkNotNullParameter(asset_type, "asset_type");
            this.asset_type = asset_type;
            this.contentful_image_details = advisoryInsightContentViewModelAssetImageDto;
            this.contentful_video_details = advisoryInsightContentViewModelAssetVideoDto;
            this.performance_chart_no_highlight_details = c0238x2c643f20;
            this.performance_chart_date_range_highlight_details = c0233xf0cd8ba6;
            this.performance_chart_single_date_highlight_details = c0245x7ff669f5;
            this.two_bar_chart_comparison_details = advisoryInsightTwoBarChartComparisonDto;
            this.returns_breakdown_details = advisoryInsightReturnsBreakdownDto;
        }

        public final AssetTypeDto getAsset_type() {
            return this.asset_type;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(yoda.service.insight.AssetTypeDto r2, advisory.proto.p008v1.AdvisoryInsightContentViewModelAssetImageDto r3, advisory.proto.p008v1.AdvisoryInsightContentViewModelAssetVideoDto r4, advisory.proto.p008v1.C0238x2c643f20 r5, advisory.proto.p008v1.C0233xf0cd8ba6 r6, advisory.proto.p008v1.C0245x7ff669f5 r7, advisory.proto.p008v1.AdvisoryInsightTwoBarChartComparisonDto r8, advisory.proto.p008v1.AdvisoryInsightReturnsBreakdownDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto La
                yoda.service.insight.AssetTypeDto$Companion r2 = yoda.service.insight.AssetTypeDto.INSTANCE
                yoda.service.insight.AssetTypeDto r2 = r2.getZeroValue()
            La:
                r11 = r10 & 2
                r0 = 0
                if (r11 == 0) goto L10
                r3 = r0
            L10:
                r11 = r10 & 4
                if (r11 == 0) goto L15
                r4 = r0
            L15:
                r11 = r10 & 8
                if (r11 == 0) goto L1a
                r5 = r0
            L1a:
                r11 = r10 & 16
                if (r11 == 0) goto L1f
                r6 = r0
            L1f:
                r11 = r10 & 32
                if (r11 == 0) goto L24
                r7 = r0
            L24:
                r11 = r10 & 64
                if (r11 == 0) goto L29
                r8 = r0
            L29:
                r10 = r10 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L37
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L40
            L37:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L40:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: advisory.proto.p008v1.AdvisoryInsightContentViewModelAssetDto.Surrogate.<init>(yoda.service.insight.AssetTypeDto, advisory.proto.v1.AdvisoryInsightContentViewModelAssetImageDto, advisory.proto.v1.AdvisoryInsightContentViewModelAssetVideoDto, advisory.proto.v1.AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlightDto, advisory.proto.v1.AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlightDto, advisory.proto.v1.AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlightDto, advisory.proto.v1.AdvisoryInsightTwoBarChartComparisonDto, advisory.proto.v1.AdvisoryInsightReturnsBreakdownDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final AdvisoryInsightContentViewModelAssetImageDto getContentful_image_details() {
            return this.contentful_image_details;
        }

        public final AdvisoryInsightContentViewModelAssetVideoDto getContentful_video_details() {
            return this.contentful_video_details;
        }

        public final C0238x2c643f20 getPerformance_chart_no_highlight_details() {
            return this.performance_chart_no_highlight_details;
        }

        public final C0233xf0cd8ba6 getPerformance_chart_date_range_highlight_details() {
            return this.performance_chart_date_range_highlight_details;
        }

        public final C0245x7ff669f5 getPerformance_chart_single_date_highlight_details() {
            return this.performance_chart_single_date_highlight_details;
        }

        public final AdvisoryInsightTwoBarChartComparisonDto getTwo_bar_chart_comparison_details() {
            return this.two_bar_chart_comparison_details;
        }

        public final AdvisoryInsightReturnsBreakdownDto getReturns_breakdown_details() {
            return this.returns_breakdown_details;
        }
    }

    /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAsset;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisoryInsightContentViewModelAssetDto, AdvisoryInsightContentViewModelAsset> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisoryInsightContentViewModelAssetDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightContentViewModelAssetDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightContentViewModelAssetDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisoryInsightContentViewModelAssetDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisoryInsightContentViewModelAsset> getProtoAdapter() {
            return AdvisoryInsightContentViewModelAsset.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightContentViewModelAssetDto getZeroValue() {
            return AdvisoryInsightContentViewModelAssetDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightContentViewModelAssetDto fromProto(AdvisoryInsightContentViewModelAsset proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            AssetTypeDto assetTypeDtoFromProto = AssetTypeDto.INSTANCE.fromProto(proto.getAsset_type());
            AdvisoryInsightContentViewModelAssetImage contentful_image_details = proto.getContentful_image_details();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AdvisoryInsightContentViewModelAssetImageDto advisoryInsightContentViewModelAssetImageDtoFromProto = contentful_image_details != null ? AdvisoryInsightContentViewModelAssetImageDto.INSTANCE.fromProto(contentful_image_details) : null;
            AdvisoryInsightContentViewModelAssetVideo contentful_video_details = proto.getContentful_video_details();
            AdvisoryInsightContentViewModelAssetVideoDto advisoryInsightContentViewModelAssetVideoDtoFromProto = contentful_video_details != null ? AdvisoryInsightContentViewModelAssetVideoDto.INSTANCE.fromProto(contentful_video_details) : null;
            AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight performance_chart_no_highlight_details = proto.getPerformance_chart_no_highlight_details();
            C0238x2c643f20 c0238x2c643f20FromProto = performance_chart_no_highlight_details != null ? C0238x2c643f20.INSTANCE.fromProto(performance_chart_no_highlight_details) : null;
            C0231x32a3a379 performance_chart_date_range_highlight_details = proto.getPerformance_chart_date_range_highlight_details();
            C0233xf0cd8ba6 c0233xf0cd8ba6FromProto = performance_chart_date_range_highlight_details != null ? C0233xf0cd8ba6.INSTANCE.fromProto(performance_chart_date_range_highlight_details) : null;
            C0243x67b4ff8a performance_chart_single_date_highlight_details = proto.getPerformance_chart_single_date_highlight_details();
            C0245x7ff669f5 c0245x7ff669f5FromProto = performance_chart_single_date_highlight_details != null ? C0245x7ff669f5.INSTANCE.fromProto(performance_chart_single_date_highlight_details) : null;
            AdvisoryInsightTwoBarChartComparison two_bar_chart_comparison_details = proto.getTwo_bar_chart_comparison_details();
            AdvisoryInsightTwoBarChartComparisonDto advisoryInsightTwoBarChartComparisonDtoFromProto = two_bar_chart_comparison_details != null ? AdvisoryInsightTwoBarChartComparisonDto.INSTANCE.fromProto(two_bar_chart_comparison_details) : null;
            AdvisoryInsightReturnsBreakdown returns_breakdown_details = proto.getReturns_breakdown_details();
            return new AdvisoryInsightContentViewModelAssetDto(new Surrogate(assetTypeDtoFromProto, advisoryInsightContentViewModelAssetImageDtoFromProto, advisoryInsightContentViewModelAssetVideoDtoFromProto, c0238x2c643f20FromProto, c0233xf0cd8ba6FromProto, c0245x7ff669f5FromProto, advisoryInsightTwoBarChartComparisonDtoFromProto, returns_breakdown_details != null ? AdvisoryInsightReturnsBreakdownDto.INSTANCE.fromProto(returns_breakdown_details) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.AdvisoryInsightContentViewModelAssetDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisoryInsightContentViewModelAssetDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvisoryInsightContentViewModelAssetDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "ContentfulImageDetails", "ContentfulVideoDetails", "PerformanceChartNoHighlightDetails", "PerformanceChartDateRangeHighlightDetails", "PerformanceChartSingleDateHighlightDetails", "TwoBarChartComparisonDetails", "ReturnsBreakdownDetails", "Companion", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$ContentfulImageDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$ContentfulVideoDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$PerformanceChartDateRangeHighlightDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$PerformanceChartNoHighlightDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$PerformanceChartSingleDateHighlightDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$ReturnsBreakdownDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$TwoBarChartComparisonDetails;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class AssetDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ AssetDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AssetDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$ContentfulImageDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImageDto;", "value", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImageDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImageDto;", "getValue", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetImageDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes23.dex */
        public static final /* data */ class ContentfulImageDetails extends AssetDto {
            private final AdvisoryInsightContentViewModelAssetImageDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ContentfulImageDetails) && Intrinsics.areEqual(this.value, ((ContentfulImageDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ContentfulImageDetails(value=" + this.value + ")";
            }

            public final AdvisoryInsightContentViewModelAssetImageDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ContentfulImageDetails(AdvisoryInsightContentViewModelAssetImageDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$ContentfulVideoDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideoDto;", "value", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideoDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideoDto;", "getValue", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetVideoDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes23.dex */
        public static final /* data */ class ContentfulVideoDetails extends AssetDto {
            private final AdvisoryInsightContentViewModelAssetVideoDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ContentfulVideoDetails) && Intrinsics.areEqual(this.value, ((ContentfulVideoDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ContentfulVideoDetails(value=" + this.value + ")";
            }

            public final AdvisoryInsightContentViewModelAssetVideoDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ContentfulVideoDetails(AdvisoryInsightContentViewModelAssetVideoDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$PerformanceChartNoHighlightDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlightDto;", "value", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlightDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlightDto;", "getValue", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlightDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes23.dex */
        public static final /* data */ class PerformanceChartNoHighlightDetails extends AssetDto {
            private final C0238x2c643f20 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PerformanceChartNoHighlightDetails) && Intrinsics.areEqual(this.value, ((PerformanceChartNoHighlightDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PerformanceChartNoHighlightDetails(value=" + this.value + ")";
            }

            public final C0238x2c643f20 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformanceChartNoHighlightDetails(C0238x2c643f20 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$PerformanceChartDateRangeHighlightDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlightDto;", "value", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlightDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlightDto;", "getValue", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartDateRangeHighlightDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes23.dex */
        public static final /* data */ class PerformanceChartDateRangeHighlightDetails extends AssetDto {
            private final C0233xf0cd8ba6 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PerformanceChartDateRangeHighlightDetails) && Intrinsics.areEqual(this.value, ((PerformanceChartDateRangeHighlightDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PerformanceChartDateRangeHighlightDetails(value=" + this.value + ")";
            }

            public final C0233xf0cd8ba6 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformanceChartDateRangeHighlightDetails(C0233xf0cd8ba6 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$PerformanceChartSingleDateHighlightDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlightDto;", "value", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlightDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlightDto;", "getValue", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartSingleDateHighlightDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes23.dex */
        public static final /* data */ class PerformanceChartSingleDateHighlightDetails extends AssetDto {
            private final C0245x7ff669f5 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PerformanceChartSingleDateHighlightDetails) && Intrinsics.areEqual(this.value, ((PerformanceChartSingleDateHighlightDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PerformanceChartSingleDateHighlightDetails(value=" + this.value + ")";
            }

            public final C0245x7ff669f5 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformanceChartSingleDateHighlightDetails(C0245x7ff669f5 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$TwoBarChartComparisonDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;", "value", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;", "getValue", "()Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes23.dex */
        public static final /* data */ class TwoBarChartComparisonDetails extends AssetDto {
            private final AdvisoryInsightTwoBarChartComparisonDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TwoBarChartComparisonDetails) && Intrinsics.areEqual(this.value, ((TwoBarChartComparisonDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TwoBarChartComparisonDetails(value=" + this.value + ")";
            }

            public final AdvisoryInsightTwoBarChartComparisonDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TwoBarChartComparisonDetails(AdvisoryInsightTwoBarChartComparisonDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$ReturnsBreakdownDetails;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;", "Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdownDto;", "value", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdownDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdownDto;", "getValue", "()Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdownDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes23.dex */
        public static final /* data */ class ReturnsBreakdownDetails extends AssetDto {
            private final AdvisoryInsightReturnsBreakdownDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReturnsBreakdownDetails) && Intrinsics.areEqual(this.value, ((ReturnsBreakdownDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ReturnsBreakdownDetails(value=" + this.value + ")";
            }

            public final AdvisoryInsightReturnsBreakdownDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReturnsBreakdownDetails(AdvisoryInsightReturnsBreakdownDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$AssetDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAsset;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes23.dex */
        public static final class Companion implements Dto4.Creator<AssetDto, AdvisoryInsightContentViewModelAsset> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AdvisoryInsightContentViewModelAsset> getProtoAdapter() {
                return AdvisoryInsightContentViewModelAsset.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AssetDto fromProto(AdvisoryInsightContentViewModelAsset proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getContentful_image_details() != null) {
                    return new ContentfulImageDetails(AdvisoryInsightContentViewModelAssetImageDto.INSTANCE.fromProto(proto.getContentful_image_details()));
                }
                if (proto.getContentful_video_details() != null) {
                    return new ContentfulVideoDetails(AdvisoryInsightContentViewModelAssetVideoDto.INSTANCE.fromProto(proto.getContentful_video_details()));
                }
                if (proto.getPerformance_chart_no_highlight_details() != null) {
                    return new PerformanceChartNoHighlightDetails(C0238x2c643f20.INSTANCE.fromProto(proto.getPerformance_chart_no_highlight_details()));
                }
                if (proto.getPerformance_chart_date_range_highlight_details() != null) {
                    return new PerformanceChartDateRangeHighlightDetails(C0233xf0cd8ba6.INSTANCE.fromProto(proto.getPerformance_chart_date_range_highlight_details()));
                }
                if (proto.getPerformance_chart_single_date_highlight_details() != null) {
                    return new PerformanceChartSingleDateHighlightDetails(C0245x7ff669f5.INSTANCE.fromProto(proto.getPerformance_chart_single_date_highlight_details()));
                }
                if (proto.getTwo_bar_chart_comparison_details() != null) {
                    return new TwoBarChartComparisonDetails(AdvisoryInsightTwoBarChartComparisonDto.INSTANCE.fromProto(proto.getTwo_bar_chart_comparison_details()));
                }
                if (proto.getReturns_breakdown_details() != null) {
                    return new ReturnsBreakdownDetails(AdvisoryInsightReturnsBreakdownDto.INSTANCE.fromProto(proto.getReturns_breakdown_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public static final class Serializer implements KSerializer<AdvisoryInsightContentViewModelAssetDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.AdvisoryInsightContentViewModelAsset", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisoryInsightContentViewModelAssetDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisoryInsightContentViewModelAssetDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisoryInsightContentViewModelAssetDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: AdvisoryInsightContentViewModelAssetDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "advisory.proto.v1.AdvisoryInsightContentViewModelAssetDto";
        }
    }
}
