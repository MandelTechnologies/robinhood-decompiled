package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import black_widow.contracts.mobile_app_chart.proto.p024v1.DifferenceCloudDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorLineDisplayTypeDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorLineDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.LineColorDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: IndicatorLineDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004JIKLB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B©\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010!\u001a\u00020\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u0011\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\u0006\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b:\u0010+R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010;R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b<\u0010;R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bA\u0010;R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bB\u0010;R\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010CR\u0011\u0010!\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010CR\u0013\u0010#\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00118F¢\u0006\u0006\u001a\u0004\bF\u0010@R\u0013\u0010&\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLine;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto$Surrogate;)V", "", "title", "", "is_hidden_in_legend", "is_linked_data_series", "hide_thickness_selector", "id", "", "thickness", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "colors", "visible", "label_visible", "offset", "z_index", "symbol_mapping", "support_opacity", "show_y_axis_marker", "is_editable", "is_main_linked_data_series", "is_primary_line", "upper_data_series", "lower_data_series", "enable_hit_test", "is_plot_hidden", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayTypeDto;", "line_display_type", "line_display_type_options", "Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;", "difference_cloud", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayTypeDto;Ljava/util/List;Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;)V", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLine;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto$Surrogate;", "getTitle", "()Ljava/lang/Boolean;", "getHide_thickness_selector", "getThickness", "()Ljava/lang/Integer;", "getColors", "()Ljava/util/List;", "getVisible", "getSupport_opacity", "()Z", "getLine_display_type", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayTypeDto;", "getLine_display_type_options", "getDifference_cloud", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class IndicatorLineDto implements Dto3<IndicatorLine>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IndicatorLineDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IndicatorLineDto, IndicatorLine>> binaryBase64Serializer$delegate;
    private static final IndicatorLineDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IndicatorLineDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IndicatorLineDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final Boolean is_linked_data_series() {
        return this.surrogate.getIs_linked_data_series();
    }

    public final Boolean getHide_thickness_selector() {
        return this.surrogate.getHide_thickness_selector();
    }

    public final Integer getThickness() {
        return this.surrogate.getThickness();
    }

    public final List<LineColorDto> getColors() {
        return this.surrogate.getColors();
    }

    public final Boolean getVisible() {
        return this.surrogate.getVisible();
    }

    public final Boolean getSupport_opacity() {
        return this.surrogate.getSupport_opacity();
    }

    public final boolean is_editable() {
        return this.surrogate.getIs_editable();
    }

    public final boolean is_plot_hidden() {
        return this.surrogate.getIs_plot_hidden();
    }

    public final IndicatorLineDisplayTypeDto getLine_display_type() {
        return this.surrogate.getLine_display_type();
    }

    public final List<IndicatorLineDisplayTypeDto> getLine_display_type_options() {
        return this.surrogate.getLine_display_type_options();
    }

    public final DifferenceCloudDto getDifference_cloud() {
        return this.surrogate.getDifference_cloud();
    }

    public /* synthetic */ IndicatorLineDto(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, Integer num, List list, Boolean bool4, Boolean bool5, Integer num2, Integer num3, String str3, Boolean bool6, boolean z, boolean z2, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, boolean z3, IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto, List list2, DifferenceCloudDto differenceCloudDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? null : bool5, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : bool6, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? false : z2, (i & 32768) != 0 ? null : bool7, (i & 65536) != 0 ? null : bool8, (i & 131072) != 0 ? null : bool9, (i & 262144) != 0 ? null : bool10, (i & 524288) != 0 ? null : bool11, (i & 1048576) == 0 ? z3 : false, (i & 2097152) != 0 ? null : indicatorLineDisplayTypeDto, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list2, (i & 8388608) != 0 ? null : differenceCloudDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndicatorLineDto(String title, Boolean bool, Boolean bool2, Boolean bool3, String str, Integer num, List<LineColorDto> colors, Boolean bool4, Boolean bool5, Integer num2, Integer num3, String str2, Boolean bool6, boolean z, boolean z2, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, boolean z3, IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto, List<IndicatorLineDisplayTypeDto> line_display_type_options, DifferenceCloudDto differenceCloudDto) {
        this(new Surrogate(title, bool, bool2, bool3, str, num, colors, bool4, bool5, num2, num3, str2, bool6, z, z2, bool7, bool8, bool9, bool10, bool11, z3, indicatorLineDisplayTypeDto, line_display_type_options, differenceCloudDto));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(line_display_type_options, "line_display_type_options");
    }

    @Override // com.robinhood.idl.Dto
    public IndicatorLine toProto() {
        String title = this.surrogate.getTitle();
        Boolean is_hidden_in_legend = this.surrogate.getIs_hidden_in_legend();
        Boolean is_linked_data_series = this.surrogate.getIs_linked_data_series();
        Boolean hide_thickness_selector = this.surrogate.getHide_thickness_selector();
        String id = this.surrogate.getId();
        Integer thickness = this.surrogate.getThickness();
        List<LineColorDto> colors = this.surrogate.getColors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(colors, 10));
        Iterator<T> it = colors.iterator();
        while (it.hasNext()) {
            arrayList.add(((LineColorDto) it.next()).toProto());
        }
        Boolean visible = this.surrogate.getVisible();
        Boolean label_visible = this.surrogate.getLabel_visible();
        Integer offset = this.surrogate.getOffset();
        Integer z_index = this.surrogate.getZ_index();
        String symbol_mapping = this.surrogate.getSymbol_mapping();
        Boolean support_opacity = this.surrogate.getSupport_opacity();
        boolean show_y_axis_marker = this.surrogate.getShow_y_axis_marker();
        boolean is_editable = this.surrogate.getIs_editable();
        Boolean is_main_linked_data_series = this.surrogate.getIs_main_linked_data_series();
        Boolean is_primary_line = this.surrogate.getIs_primary_line();
        Boolean upper_data_series = this.surrogate.getUpper_data_series();
        Boolean lower_data_series = this.surrogate.getLower_data_series();
        Boolean enable_hit_test = this.surrogate.getEnable_hit_test();
        boolean is_plot_hidden = this.surrogate.getIs_plot_hidden();
        IndicatorLineDisplayTypeDto line_display_type = this.surrogate.getLine_display_type();
        IndicatorLineDisplayType proto = line_display_type != null ? line_display_type.toProto() : null;
        List<IndicatorLineDisplayTypeDto> line_display_type_options = this.surrogate.getLine_display_type_options();
        IndicatorLineDisplayType indicatorLineDisplayType = proto;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(line_display_type_options, 10));
        Iterator<T> it2 = line_display_type_options.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((IndicatorLineDisplayTypeDto) it2.next()).toProto());
        }
        DifferenceCloudDto difference_cloud = this.surrogate.getDifference_cloud();
        return new IndicatorLine(title, is_hidden_in_legend, is_linked_data_series, hide_thickness_selector, id, thickness, arrayList, visible, label_visible, offset, z_index, symbol_mapping, support_opacity, show_y_axis_marker, is_editable, is_main_linked_data_series, is_primary_line, upper_data_series, lower_data_series, enable_hit_test, is_plot_hidden, indicatorLineDisplayType, arrayList2, difference_cloud != null ? difference_cloud.toProto() : null, null, 16777216, null);
    }

    public String toString() {
        return "[IndicatorLineDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IndicatorLineDto) && Intrinsics.areEqual(((IndicatorLineDto) other).surrogate, this.surrogate);
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
    /* compiled from: IndicatorLineDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bE\b\u0083\b\u0018\u0000 r2\u00020\u0001:\u0002srBÔ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0019\b\u0002\u0010\r\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0019\b\u0002\u0010\u0013\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0019\b\u0002\u0010\u0014\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%B\u0091\u0002\b\u0010\u0012\u0006\u0010&\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000e\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u00104R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010>\u0012\u0004\b@\u0010=\u001a\u0004\b\u0005\u0010?R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010>\u0012\u0004\bA\u0010=\u001a\u0004\b\u0006\u0010?R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\bC\u0010=\u001a\u0004\bB\u0010?R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\bE\u0010=\u001a\u0004\bD\u00104R1\u0010\r\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010F\u0012\u0004\bI\u0010=\u001a\u0004\bG\u0010HR&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010J\u0012\u0004\bM\u0010=\u001a\u0004\bK\u0010LR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010>\u0012\u0004\bO\u0010=\u001a\u0004\bN\u0010?R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010>\u0012\u0004\bQ\u0010=\u001a\u0004\bP\u0010?R1\u0010\u0013\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010F\u0012\u0004\bS\u0010=\u001a\u0004\bR\u0010HR1\u0010\u0014\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010F\u0012\u0004\bU\u0010=\u001a\u0004\bT\u0010HR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010:\u0012\u0004\bW\u0010=\u001a\u0004\bV\u00104R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010>\u0012\u0004\bY\u0010=\u001a\u0004\bX\u0010?R \u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010Z\u0012\u0004\b]\u0010=\u001a\u0004\b[\u0010\\R \u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010Z\u0012\u0004\b^\u0010=\u001a\u0004\b\u0018\u0010\\R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010>\u0012\u0004\b_\u0010=\u001a\u0004\b\u0019\u0010?R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010>\u0012\u0004\b`\u0010=\u001a\u0004\b\u001a\u0010?R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010>\u0012\u0004\bb\u0010=\u001a\u0004\ba\u0010?R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010>\u0012\u0004\bd\u0010=\u001a\u0004\bc\u0010?R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010>\u0012\u0004\bf\u0010=\u001a\u0004\be\u0010?R \u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010Z\u0012\u0004\bg\u0010=\u001a\u0004\b\u001e\u0010\\R\"\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010h\u0012\u0004\bk\u0010=\u001a\u0004\bi\u0010jR&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010J\u0012\u0004\bm\u0010=\u001a\u0004\bl\u0010LR\"\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010n\u0012\u0004\bq\u0010=\u001a\u0004\bo\u0010p¨\u0006t"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto$Surrogate;", "", "", "title", "", "is_hidden_in_legend", "is_linked_data_series", "hide_thickness_selector", "id", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "thickness", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "colors", "visible", "label_visible", "offset", "z_index", "symbol_mapping", "support_opacity", "show_y_axis_marker", "is_editable", "is_main_linked_data_series", "is_primary_line", "upper_data_series", "lower_data_series", "enable_hit_test", "is_plot_hidden", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayTypeDto;", "line_display_type", "line_display_type_options", "Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;", "difference_cloud", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayTypeDto;Ljava/util/List;Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayTypeDto;Ljava/util/List;Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "is_hidden_in_legend$annotations", "is_linked_data_series$annotations", "getHide_thickness_selector", "getHide_thickness_selector$annotations", "getId", "getId$annotations", "Ljava/lang/Integer;", "getThickness", "()Ljava/lang/Integer;", "getThickness$annotations", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "getColors$annotations", "getVisible", "getVisible$annotations", "getLabel_visible", "getLabel_visible$annotations", "getOffset", "getOffset$annotations", "getZ_index", "getZ_index$annotations", "getSymbol_mapping", "getSymbol_mapping$annotations", "getSupport_opacity", "getSupport_opacity$annotations", "Z", "getShow_y_axis_marker", "()Z", "getShow_y_axis_marker$annotations", "is_editable$annotations", "is_main_linked_data_series$annotations", "is_primary_line$annotations", "getUpper_data_series", "getUpper_data_series$annotations", "getLower_data_series", "getLower_data_series$annotations", "getEnable_hit_test", "getEnable_hit_test$annotations", "is_plot_hidden$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayTypeDto;", "getLine_display_type", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayTypeDto;", "getLine_display_type$annotations", "getLine_display_type_options", "getLine_display_type_options$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;", "getDifference_cloud", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;", "getDifference_cloud$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<LineColorDto> colors;
        private final DifferenceCloudDto difference_cloud;
        private final Boolean enable_hit_test;
        private final Boolean hide_thickness_selector;
        private final String id;
        private final boolean is_editable;
        private final Boolean is_hidden_in_legend;
        private final Boolean is_linked_data_series;
        private final Boolean is_main_linked_data_series;
        private final boolean is_plot_hidden;
        private final Boolean is_primary_line;
        private final Boolean label_visible;
        private final IndicatorLineDisplayTypeDto line_display_type;
        private final List<IndicatorLineDisplayTypeDto> line_display_type_options;
        private final Boolean lower_data_series;
        private final Integer offset;
        private final boolean show_y_axis_marker;
        private final Boolean support_opacity;
        private final String symbol_mapping;
        private final Integer thickness;
        private final String title;
        private final Boolean upper_data_series;
        private final Boolean visible;
        private final Integer z_index;

        public Surrogate() {
            this((String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (Integer) null, (List) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, false, false, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, false, (IndicatorLineDisplayTypeDto) null, (List) null, (DifferenceCloudDto) null, 16777215, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(LineColorDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(IndicatorLineDisplayTypeDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.is_hidden_in_legend, surrogate.is_hidden_in_legend) && Intrinsics.areEqual(this.is_linked_data_series, surrogate.is_linked_data_series) && Intrinsics.areEqual(this.hide_thickness_selector, surrogate.hide_thickness_selector) && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.thickness, surrogate.thickness) && Intrinsics.areEqual(this.colors, surrogate.colors) && Intrinsics.areEqual(this.visible, surrogate.visible) && Intrinsics.areEqual(this.label_visible, surrogate.label_visible) && Intrinsics.areEqual(this.offset, surrogate.offset) && Intrinsics.areEqual(this.z_index, surrogate.z_index) && Intrinsics.areEqual(this.symbol_mapping, surrogate.symbol_mapping) && Intrinsics.areEqual(this.support_opacity, surrogate.support_opacity) && this.show_y_axis_marker == surrogate.show_y_axis_marker && this.is_editable == surrogate.is_editable && Intrinsics.areEqual(this.is_main_linked_data_series, surrogate.is_main_linked_data_series) && Intrinsics.areEqual(this.is_primary_line, surrogate.is_primary_line) && Intrinsics.areEqual(this.upper_data_series, surrogate.upper_data_series) && Intrinsics.areEqual(this.lower_data_series, surrogate.lower_data_series) && Intrinsics.areEqual(this.enable_hit_test, surrogate.enable_hit_test) && this.is_plot_hidden == surrogate.is_plot_hidden && Intrinsics.areEqual(this.line_display_type, surrogate.line_display_type) && Intrinsics.areEqual(this.line_display_type_options, surrogate.line_display_type_options) && Intrinsics.areEqual(this.difference_cloud, surrogate.difference_cloud);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Boolean bool = this.is_hidden_in_legend;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.is_linked_data_series;
            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.hide_thickness_selector;
            int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.id;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.thickness;
            int iHashCode6 = (((iHashCode5 + (num == null ? 0 : num.hashCode())) * 31) + this.colors.hashCode()) * 31;
            Boolean bool4 = this.visible;
            int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.label_visible;
            int iHashCode8 = (iHashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Integer num2 = this.offset;
            int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.z_index;
            int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str2 = this.symbol_mapping;
            int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool6 = this.support_opacity;
            int iHashCode12 = (((((iHashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31) + Boolean.hashCode(this.show_y_axis_marker)) * 31) + Boolean.hashCode(this.is_editable)) * 31;
            Boolean bool7 = this.is_main_linked_data_series;
            int iHashCode13 = (iHashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.is_primary_line;
            int iHashCode14 = (iHashCode13 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.upper_data_series;
            int iHashCode15 = (iHashCode14 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.lower_data_series;
            int iHashCode16 = (iHashCode15 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.enable_hit_test;
            int iHashCode17 = (((iHashCode16 + (bool11 == null ? 0 : bool11.hashCode())) * 31) + Boolean.hashCode(this.is_plot_hidden)) * 31;
            IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto = this.line_display_type;
            int iHashCode18 = (((iHashCode17 + (indicatorLineDisplayTypeDto == null ? 0 : indicatorLineDisplayTypeDto.hashCode())) * 31) + this.line_display_type_options.hashCode()) * 31;
            DifferenceCloudDto differenceCloudDto = this.difference_cloud;
            return iHashCode18 + (differenceCloudDto != null ? differenceCloudDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", is_hidden_in_legend=" + this.is_hidden_in_legend + ", is_linked_data_series=" + this.is_linked_data_series + ", hide_thickness_selector=" + this.hide_thickness_selector + ", id=" + this.id + ", thickness=" + this.thickness + ", colors=" + this.colors + ", visible=" + this.visible + ", label_visible=" + this.label_visible + ", offset=" + this.offset + ", z_index=" + this.z_index + ", symbol_mapping=" + this.symbol_mapping + ", support_opacity=" + this.support_opacity + ", show_y_axis_marker=" + this.show_y_axis_marker + ", is_editable=" + this.is_editable + ", is_main_linked_data_series=" + this.is_main_linked_data_series + ", is_primary_line=" + this.is_primary_line + ", upper_data_series=" + this.upper_data_series + ", lower_data_series=" + this.lower_data_series + ", enable_hit_test=" + this.enable_hit_test + ", is_plot_hidden=" + this.is_plot_hidden + ", line_display_type=" + this.line_display_type + ", line_display_type_options=" + this.line_display_type_options + ", difference_cloud=" + this.difference_cloud + ")";
        }

        /* compiled from: IndicatorLineDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IndicatorLineDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorLineDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndicatorLineDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorLineDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndicatorLineDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, Integer num, List list, Boolean bool4, Boolean bool5, Integer num2, Integer num3, String str3, Boolean bool6, boolean z, boolean z2, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, boolean z3, IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto, List list2, DifferenceCloudDto differenceCloudDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.title = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.is_hidden_in_legend = null;
            } else {
                this.is_hidden_in_legend = bool;
            }
            if ((i & 4) == 0) {
                this.is_linked_data_series = null;
            } else {
                this.is_linked_data_series = bool2;
            }
            if ((i & 8) == 0) {
                this.hide_thickness_selector = null;
            } else {
                this.hide_thickness_selector = bool3;
            }
            if ((i & 16) == 0) {
                this.id = null;
            } else {
                this.id = str2;
            }
            if ((i & 32) == 0) {
                this.thickness = null;
            } else {
                this.thickness = num;
            }
            if ((i & 64) == 0) {
                this.colors = CollectionsKt.emptyList();
            } else {
                this.colors = list;
            }
            if ((i & 128) == 0) {
                this.visible = null;
            } else {
                this.visible = bool4;
            }
            if ((i & 256) == 0) {
                this.label_visible = null;
            } else {
                this.label_visible = bool5;
            }
            if ((i & 512) == 0) {
                this.offset = null;
            } else {
                this.offset = num2;
            }
            if ((i & 1024) == 0) {
                this.z_index = null;
            } else {
                this.z_index = num3;
            }
            if ((i & 2048) == 0) {
                this.symbol_mapping = null;
            } else {
                this.symbol_mapping = str3;
            }
            if ((i & 4096) == 0) {
                this.support_opacity = null;
            } else {
                this.support_opacity = bool6;
            }
            if ((i & 8192) == 0) {
                this.show_y_axis_marker = false;
            } else {
                this.show_y_axis_marker = z;
            }
            if ((i & 16384) == 0) {
                this.is_editable = false;
            } else {
                this.is_editable = z2;
            }
            if ((32768 & i) == 0) {
                this.is_main_linked_data_series = null;
            } else {
                this.is_main_linked_data_series = bool7;
            }
            if ((65536 & i) == 0) {
                this.is_primary_line = null;
            } else {
                this.is_primary_line = bool8;
            }
            if ((131072 & i) == 0) {
                this.upper_data_series = null;
            } else {
                this.upper_data_series = bool9;
            }
            if ((262144 & i) == 0) {
                this.lower_data_series = null;
            } else {
                this.lower_data_series = bool10;
            }
            if ((524288 & i) == 0) {
                this.enable_hit_test = null;
            } else {
                this.enable_hit_test = bool11;
            }
            if ((1048576 & i) == 0) {
                this.is_plot_hidden = false;
            } else {
                this.is_plot_hidden = z3;
            }
            if ((2097152 & i) == 0) {
                this.line_display_type = null;
            } else {
                this.line_display_type = indicatorLineDisplayTypeDto;
            }
            this.line_display_type_options = (4194304 & i) == 0 ? CollectionsKt.emptyList() : list2;
            if ((i & 8388608) == 0) {
                this.difference_cloud = null;
            } else {
                this.difference_cloud = differenceCloudDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            Boolean bool = self.is_hidden_in_legend;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, bool);
            }
            Boolean bool2 = self.is_linked_data_series;
            if (bool2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, bool2);
            }
            Boolean bool3 = self.hide_thickness_selector;
            if (bool3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, bool3);
            }
            String str = self.id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            Integer num = self.thickness;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            if (!Intrinsics.areEqual(self.colors, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.colors);
            }
            Boolean bool4 = self.visible;
            if (bool4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, bool4);
            }
            Boolean bool5 = self.label_visible;
            if (bool5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, bool5);
            }
            Integer num2 = self.offset;
            if (num2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, SignedIntAsNumberSerializer.INSTANCE, num2);
            }
            Integer num3 = self.z_index;
            if (num3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, SignedIntAsNumberSerializer.INSTANCE, num3);
            }
            String str2 = self.symbol_mapping;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str2);
            }
            Boolean bool6 = self.support_opacity;
            if (bool6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, BooleanSerializer.INSTANCE, bool6);
            }
            boolean z = self.show_y_axis_marker;
            if (z) {
                output.encodeBooleanElement(serialDesc, 13, z);
            }
            boolean z2 = self.is_editable;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 14, z2);
            }
            Boolean bool7 = self.is_main_linked_data_series;
            if (bool7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, BooleanSerializer.INSTANCE, bool7);
            }
            Boolean bool8 = self.is_primary_line;
            if (bool8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, BooleanSerializer.INSTANCE, bool8);
            }
            Boolean bool9 = self.upper_data_series;
            if (bool9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, BooleanSerializer.INSTANCE, bool9);
            }
            Boolean bool10 = self.lower_data_series;
            if (bool10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, BooleanSerializer.INSTANCE, bool10);
            }
            Boolean bool11 = self.enable_hit_test;
            if (bool11 != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, BooleanSerializer.INSTANCE, bool11);
            }
            boolean z3 = self.is_plot_hidden;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 20, z3);
            }
            IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto = self.line_display_type;
            if (indicatorLineDisplayTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, IndicatorLineDisplayTypeDto.Serializer.INSTANCE, indicatorLineDisplayTypeDto);
            }
            if (!Intrinsics.areEqual(self.line_display_type_options, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 22, lazyArr[22].getValue(), self.line_display_type_options);
            }
            DifferenceCloudDto differenceCloudDto = self.difference_cloud;
            if (differenceCloudDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, DifferenceCloudDto.Serializer.INSTANCE, differenceCloudDto);
            }
        }

        public Surrogate(String title, Boolean bool, Boolean bool2, Boolean bool3, String str, Integer num, List<LineColorDto> colors, Boolean bool4, Boolean bool5, Integer num2, Integer num3, String str2, Boolean bool6, boolean z, boolean z2, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, boolean z3, IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto, List<IndicatorLineDisplayTypeDto> line_display_type_options, DifferenceCloudDto differenceCloudDto) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(colors, "colors");
            Intrinsics.checkNotNullParameter(line_display_type_options, "line_display_type_options");
            this.title = title;
            this.is_hidden_in_legend = bool;
            this.is_linked_data_series = bool2;
            this.hide_thickness_selector = bool3;
            this.id = str;
            this.thickness = num;
            this.colors = colors;
            this.visible = bool4;
            this.label_visible = bool5;
            this.offset = num2;
            this.z_index = num3;
            this.symbol_mapping = str2;
            this.support_opacity = bool6;
            this.show_y_axis_marker = z;
            this.is_editable = z2;
            this.is_main_linked_data_series = bool7;
            this.is_primary_line = bool8;
            this.upper_data_series = bool9;
            this.lower_data_series = bool10;
            this.enable_hit_test = bool11;
            this.is_plot_hidden = z3;
            this.line_display_type = indicatorLineDisplayTypeDto;
            this.line_display_type_options = line_display_type_options;
            this.difference_cloud = differenceCloudDto;
        }

        public final String getTitle() {
            return this.title;
        }

        public /* synthetic */ Surrogate(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, Integer num, List list, Boolean bool4, Boolean bool5, Integer num2, Integer num3, String str3, Boolean bool6, boolean z, boolean z2, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, boolean z3, IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto, List list2, DifferenceCloudDto differenceCloudDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? null : bool5, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : bool6, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? false : z2, (i & 32768) != 0 ? null : bool7, (i & 65536) != 0 ? null : bool8, (i & 131072) != 0 ? null : bool9, (i & 262144) != 0 ? null : bool10, (i & 524288) != 0 ? null : bool11, (i & 1048576) == 0 ? z3 : false, (i & 2097152) != 0 ? null : indicatorLineDisplayTypeDto, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list2, (i & 8388608) != 0 ? null : differenceCloudDto);
        }

        /* renamed from: is_hidden_in_legend, reason: from getter */
        public final Boolean getIs_hidden_in_legend() {
            return this.is_hidden_in_legend;
        }

        /* renamed from: is_linked_data_series, reason: from getter */
        public final Boolean getIs_linked_data_series() {
            return this.is_linked_data_series;
        }

        public final Boolean getHide_thickness_selector() {
            return this.hide_thickness_selector;
        }

        public final String getId() {
            return this.id;
        }

        public final Integer getThickness() {
            return this.thickness;
        }

        public final List<LineColorDto> getColors() {
            return this.colors;
        }

        public final Boolean getVisible() {
            return this.visible;
        }

        public final Boolean getLabel_visible() {
            return this.label_visible;
        }

        public final Integer getOffset() {
            return this.offset;
        }

        public final Integer getZ_index() {
            return this.z_index;
        }

        public final String getSymbol_mapping() {
            return this.symbol_mapping;
        }

        public final Boolean getSupport_opacity() {
            return this.support_opacity;
        }

        public final boolean getShow_y_axis_marker() {
            return this.show_y_axis_marker;
        }

        /* renamed from: is_editable, reason: from getter */
        public final boolean getIs_editable() {
            return this.is_editable;
        }

        /* renamed from: is_main_linked_data_series, reason: from getter */
        public final Boolean getIs_main_linked_data_series() {
            return this.is_main_linked_data_series;
        }

        /* renamed from: is_primary_line, reason: from getter */
        public final Boolean getIs_primary_line() {
            return this.is_primary_line;
        }

        public final Boolean getUpper_data_series() {
            return this.upper_data_series;
        }

        public final Boolean getLower_data_series() {
            return this.lower_data_series;
        }

        public final Boolean getEnable_hit_test() {
            return this.enable_hit_test;
        }

        /* renamed from: is_plot_hidden, reason: from getter */
        public final boolean getIs_plot_hidden() {
            return this.is_plot_hidden;
        }

        public final IndicatorLineDisplayTypeDto getLine_display_type() {
            return this.line_display_type;
        }

        public final List<IndicatorLineDisplayTypeDto> getLine_display_type_options() {
            return this.line_display_type_options;
        }

        public final DifferenceCloudDto getDifference_cloud() {
            return this.difference_cloud;
        }
    }

    /* compiled from: IndicatorLineDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLine;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IndicatorLineDto, IndicatorLine> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IndicatorLineDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndicatorLineDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndicatorLineDto> getBinaryBase64Serializer() {
            return (KSerializer) IndicatorLineDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IndicatorLine> getProtoAdapter() {
            return IndicatorLine.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndicatorLineDto getZeroValue() {
            return IndicatorLineDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndicatorLineDto fromProto(IndicatorLine proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            Boolean is_hidden_in_legend = proto.getIs_hidden_in_legend();
            Boolean is_linked_data_series = proto.getIs_linked_data_series();
            Boolean hide_thickness_selector = proto.getHide_thickness_selector();
            String id = proto.getId();
            Integer thickness = proto.getThickness();
            List<LineColor> colors = proto.getColors();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(colors, 10));
            Iterator<T> it = colors.iterator();
            while (it.hasNext()) {
                arrayList.add(LineColorDto.INSTANCE.fromProto((LineColor) it.next()));
            }
            Boolean visible = proto.getVisible();
            Boolean label_visible = proto.getLabel_visible();
            Integer offset = proto.getOffset();
            Integer z_index = proto.getZ_index();
            String symbol_mapping = proto.getSymbol_mapping();
            Boolean support_opacity = proto.getSupport_opacity();
            boolean show_y_axis_marker = proto.getShow_y_axis_marker();
            boolean is_editable = proto.getIs_editable();
            Boolean is_main_linked_data_series = proto.getIs_main_linked_data_series();
            Boolean is_primary_line = proto.getIs_primary_line();
            Boolean upper_data_series = proto.getUpper_data_series();
            Boolean lower_data_series = proto.getLower_data_series();
            Boolean enable_hit_test = proto.getEnable_hit_test();
            boolean is_plot_hidden = proto.getIs_plot_hidden();
            IndicatorLineDisplayType line_display_type = proto.getLine_display_type();
            IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDtoFromProto = line_display_type != null ? IndicatorLineDisplayTypeDto.INSTANCE.fromProto(line_display_type) : null;
            List<IndicatorLineDisplayType> line_display_type_options = proto.getLine_display_type_options();
            IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto = indicatorLineDisplayTypeDtoFromProto;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(line_display_type_options, 10));
            for (Iterator it2 = line_display_type_options.iterator(); it2.hasNext(); it2 = it2) {
                arrayList2.add(IndicatorLineDisplayTypeDto.INSTANCE.fromProto((IndicatorLineDisplayType) it2.next()));
            }
            DifferenceCloud difference_cloud = proto.getDifference_cloud();
            return new IndicatorLineDto(new Surrogate(title, is_hidden_in_legend, is_linked_data_series, hide_thickness_selector, id, thickness, arrayList, visible, label_visible, offset, z_index, symbol_mapping, support_opacity, show_y_axis_marker, is_editable, is_main_linked_data_series, is_primary_line, upper_data_series, lower_data_series, enable_hit_test, is_plot_hidden, indicatorLineDisplayTypeDto, arrayList2, difference_cloud != null ? DifferenceCloudDto.INSTANCE.fromProto(difference_cloud) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorLineDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndicatorLineDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new IndicatorLineDto(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, null, null, null, 16777215, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IndicatorLineDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IndicatorLineDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.IndicatorLine", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IndicatorLineDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IndicatorLineDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IndicatorLineDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IndicatorLineDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorLineDto";
        }
    }
}
