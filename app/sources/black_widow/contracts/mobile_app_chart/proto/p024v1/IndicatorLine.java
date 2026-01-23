package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: IndicatorLine.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001IB±\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\r\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020#¢\u0006\u0004\b$\u0010%J\b\u0010A\u001a\u00020\u0002H\u0017J\u0013\u0010B\u001a\u00020\u00062\b\u0010C\u001a\u0004\u0018\u00010DH\u0096\u0002J\b\u0010E\u001a\u00020\u000bH\u0016J\b\u0010F\u001a\u00020\u0004H\u0016Jµ\u0002\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#¢\u0006\u0002\u0010HR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0005\u0010(R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0007\u0010(R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b/\u0010(R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b0\u0010(R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b1\u0010-R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b2\u0010-R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b4\u0010(R\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\u0016\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00106R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0017\u0010(R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0018\u0010(R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b7\u0010(R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b8\u0010(R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b9\u0010(R\u0016\u0010\u001c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u00106R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?¨\u0006J"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLine;", "Lcom/squareup/wire/Message;", "", "title", "", "is_hidden_in_legend", "", "is_linked_data_series", "hide_thickness_selector", "id", "thickness", "", "colors", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColor;", "visible", "label_visible", "offset", "z_index", "symbol_mapping", "support_opacity", "show_y_axis_marker", "is_editable", "is_main_linked_data_series", "is_primary_line", "upper_data_series", "lower_data_series", "enable_hit_test", "is_plot_hidden", "line_display_type", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayType;", "line_display_type_options", "difference_cloud", "Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloud;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayType;Ljava/util/List;Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloud;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHide_thickness_selector", "getId", "getThickness", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVisible", "getLabel_visible", "getOffset", "getZ_index", "getSymbol_mapping", "getSupport_opacity", "getShow_y_axis_marker", "()Z", "getUpper_data_series", "getLower_data_series", "getEnable_hit_test", "getLine_display_type", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayType;", "getDifference_cloud", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloud;", "getColors", "()Ljava/util/List;", "getLine_display_type_options", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayType;Ljava/util/List;Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloud;Lokio/ByteString;)Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLine;", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IndicatorLine extends Message {

    @JvmField
    public static final ProtoAdapter<IndicatorLine> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.LineColor#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 11)
    private final List<LineColor> colors;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.DifferenceCloud#ADAPTER", jsonName = "differenceCloud", schemaIndex = 23, tag = 29)
    private final DifferenceCloud difference_cloud;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "enableHitTest", schemaIndex = 19, tag = 25)
    private final Boolean enable_hit_test;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hideThicknessSelector", schemaIndex = 3, tag = 8)
    private final Boolean hide_thickness_selector;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 9)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEditable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 19)
    private final boolean is_editable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isHiddenInLegend", schemaIndex = 1, tag = 3)
    private final Boolean is_hidden_in_legend;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLinkedDataSeries", schemaIndex = 2, tag = 4)
    private final Boolean is_linked_data_series;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isMainLinkedDataSeries", schemaIndex = 15, tag = 21)
    private final Boolean is_main_linked_data_series;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPlotHidden", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 26)
    private final boolean is_plot_hidden;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPrimaryLine", schemaIndex = 16, tag = 22)
    private final Boolean is_primary_line;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "labelVisible", schemaIndex = 8, tag = 13)
    private final Boolean label_visible;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorLineDisplayType#ADAPTER", jsonName = "lineDisplayType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 27)
    private final IndicatorLineDisplayType line_display_type;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorLineDisplayType#ADAPTER", jsonName = "lineDisplayTypeOptions", label = WireField.Label.REPEATED, schemaIndex = 22, tag = 28)
    private final List<IndicatorLineDisplayType> line_display_type_options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "lowerDataSeries", schemaIndex = 18, tag = 24)
    private final Boolean lower_data_series;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 9, tag = 14)
    private final Integer offset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showYAxisMarker", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 18)
    private final boolean show_y_axis_marker;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportOpacity", schemaIndex = 12, tag = 17)
    private final Boolean support_opacity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "symbolMapping", schemaIndex = 11, tag = 16)
    private final String symbol_mapping;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 5, tag = 10)
    private final Integer thickness;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "upperDataSeries", schemaIndex = 17, tag = 23)
    private final Boolean upper_data_series;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 12)
    private final Boolean visible;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "zIndex", schemaIndex = 10, tag = 15)
    private final Integer z_index;

    public IndicatorLine() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, null, null, null, null, 33554431, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8602newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ IndicatorLine(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, Integer num, List list, Boolean bool4, Boolean bool5, Integer num2, Integer num3, String str3, Boolean bool6, boolean z, boolean z2, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, boolean z3, IndicatorLineDisplayType indicatorLineDisplayType, List list2, DifferenceCloud differenceCloud, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? null : bool5, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : bool6, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? false : z2, (i & 32768) != 0 ? null : bool7, (i & 65536) != 0 ? null : bool8, (i & 131072) != 0 ? null : bool9, (i & 262144) != 0 ? null : bool10, (i & 524288) != 0 ? null : bool11, (i & 1048576) == 0 ? z3 : false, (i & 2097152) != 0 ? null : indicatorLineDisplayType, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list2, (i & 8388608) != 0 ? null : differenceCloud, (i & 16777216) != 0 ? ByteString.EMPTY : byteString);
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

    public final IndicatorLineDisplayType getLine_display_type() {
        return this.line_display_type;
    }

    public final DifferenceCloud getDifference_cloud() {
        return this.difference_cloud;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLine(String title, Boolean bool, Boolean bool2, Boolean bool3, String str, Integer num, List<LineColor> colors, Boolean bool4, Boolean bool5, Integer num2, Integer num3, String str2, Boolean bool6, boolean z, boolean z2, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, boolean z3, IndicatorLineDisplayType indicatorLineDisplayType, List<IndicatorLineDisplayType> line_display_type_options, DifferenceCloud differenceCloud, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(line_display_type_options, "line_display_type_options");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.is_hidden_in_legend = bool;
        this.is_linked_data_series = bool2;
        this.hide_thickness_selector = bool3;
        this.id = str;
        this.thickness = num;
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
        this.line_display_type = indicatorLineDisplayType;
        this.difference_cloud = differenceCloud;
        this.colors = Internal.immutableCopyOf("colors", colors);
        this.line_display_type_options = Internal.immutableCopyOf("line_display_type_options", line_display_type_options);
    }

    public final List<LineColor> getColors() {
        return this.colors;
    }

    public final List<IndicatorLineDisplayType> getLine_display_type_options() {
        return this.line_display_type_options;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8602newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IndicatorLine)) {
            return false;
        }
        IndicatorLine indicatorLine = (IndicatorLine) other;
        return Intrinsics.areEqual(unknownFields(), indicatorLine.unknownFields()) && Intrinsics.areEqual(this.title, indicatorLine.title) && Intrinsics.areEqual(this.is_hidden_in_legend, indicatorLine.is_hidden_in_legend) && Intrinsics.areEqual(this.is_linked_data_series, indicatorLine.is_linked_data_series) && Intrinsics.areEqual(this.hide_thickness_selector, indicatorLine.hide_thickness_selector) && Intrinsics.areEqual(this.id, indicatorLine.id) && Intrinsics.areEqual(this.thickness, indicatorLine.thickness) && Intrinsics.areEqual(this.colors, indicatorLine.colors) && Intrinsics.areEqual(this.visible, indicatorLine.visible) && Intrinsics.areEqual(this.label_visible, indicatorLine.label_visible) && Intrinsics.areEqual(this.offset, indicatorLine.offset) && Intrinsics.areEqual(this.z_index, indicatorLine.z_index) && Intrinsics.areEqual(this.symbol_mapping, indicatorLine.symbol_mapping) && Intrinsics.areEqual(this.support_opacity, indicatorLine.support_opacity) && this.show_y_axis_marker == indicatorLine.show_y_axis_marker && this.is_editable == indicatorLine.is_editable && Intrinsics.areEqual(this.is_main_linked_data_series, indicatorLine.is_main_linked_data_series) && Intrinsics.areEqual(this.is_primary_line, indicatorLine.is_primary_line) && Intrinsics.areEqual(this.upper_data_series, indicatorLine.upper_data_series) && Intrinsics.areEqual(this.lower_data_series, indicatorLine.lower_data_series) && Intrinsics.areEqual(this.enable_hit_test, indicatorLine.enable_hit_test) && this.is_plot_hidden == indicatorLine.is_plot_hidden && Intrinsics.areEqual(this.line_display_type, indicatorLine.line_display_type) && Intrinsics.areEqual(this.line_display_type_options, indicatorLine.line_display_type_options) && Intrinsics.areEqual(this.difference_cloud, indicatorLine.difference_cloud);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        Boolean bool = this.is_hidden_in_legend;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_linked_data_series;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.hide_thickness_selector;
        int iHashCode4 = (iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        String str = this.id;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.thickness;
        int iHashCode6 = (((iHashCode5 + (num != null ? num.hashCode() : 0)) * 37) + this.colors.hashCode()) * 37;
        Boolean bool4 = this.visible;
        int iHashCode7 = (iHashCode6 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.label_visible;
        int iHashCode8 = (iHashCode7 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Integer num2 = this.offset;
        int iHashCode9 = (iHashCode8 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.z_index;
        int iHashCode10 = (iHashCode9 + (num3 != null ? num3.hashCode() : 0)) * 37;
        String str2 = this.symbol_mapping;
        int iHashCode11 = (iHashCode10 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool6 = this.support_opacity;
        int iHashCode12 = (((((iHashCode11 + (bool6 != null ? bool6.hashCode() : 0)) * 37) + Boolean.hashCode(this.show_y_axis_marker)) * 37) + Boolean.hashCode(this.is_editable)) * 37;
        Boolean bool7 = this.is_main_linked_data_series;
        int iHashCode13 = (iHashCode12 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        Boolean bool8 = this.is_primary_line;
        int iHashCode14 = (iHashCode13 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
        Boolean bool9 = this.upper_data_series;
        int iHashCode15 = (iHashCode14 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
        Boolean bool10 = this.lower_data_series;
        int iHashCode16 = (iHashCode15 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
        Boolean bool11 = this.enable_hit_test;
        int iHashCode17 = (((iHashCode16 + (bool11 != null ? bool11.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_plot_hidden)) * 37;
        IndicatorLineDisplayType indicatorLineDisplayType = this.line_display_type;
        int iHashCode18 = (((iHashCode17 + (indicatorLineDisplayType != null ? indicatorLineDisplayType.hashCode() : 0)) * 37) + this.line_display_type_options.hashCode()) * 37;
        DifferenceCloud differenceCloud = this.difference_cloud;
        int iHashCode19 = iHashCode18 + (differenceCloud != null ? differenceCloud.hashCode() : 0);
        this.hashCode = iHashCode19;
        return iHashCode19;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        Boolean bool = this.is_hidden_in_legend;
        if (bool != null) {
            arrayList.add("is_hidden_in_legend=" + bool);
        }
        Boolean bool2 = this.is_linked_data_series;
        if (bool2 != null) {
            arrayList.add("is_linked_data_series=" + bool2);
        }
        Boolean bool3 = this.hide_thickness_selector;
        if (bool3 != null) {
            arrayList.add("hide_thickness_selector=" + bool3);
        }
        String str = this.id;
        if (str != null) {
            arrayList.add("id=" + Internal.sanitize(str));
        }
        Integer num = this.thickness;
        if (num != null) {
            arrayList.add("thickness=" + num);
        }
        if (!this.colors.isEmpty()) {
            arrayList.add("colors=" + this.colors);
        }
        Boolean bool4 = this.visible;
        if (bool4 != null) {
            arrayList.add("visible=" + bool4);
        }
        Boolean bool5 = this.label_visible;
        if (bool5 != null) {
            arrayList.add("label_visible=" + bool5);
        }
        Integer num2 = this.offset;
        if (num2 != null) {
            arrayList.add("offset=" + num2);
        }
        Integer num3 = this.z_index;
        if (num3 != null) {
            arrayList.add("z_index=" + num3);
        }
        String str2 = this.symbol_mapping;
        if (str2 != null) {
            arrayList.add("symbol_mapping=" + Internal.sanitize(str2));
        }
        Boolean bool6 = this.support_opacity;
        if (bool6 != null) {
            arrayList.add("support_opacity=" + bool6);
        }
        arrayList.add("show_y_axis_marker=" + this.show_y_axis_marker);
        arrayList.add("is_editable=" + this.is_editable);
        Boolean bool7 = this.is_main_linked_data_series;
        if (bool7 != null) {
            arrayList.add("is_main_linked_data_series=" + bool7);
        }
        Boolean bool8 = this.is_primary_line;
        if (bool8 != null) {
            arrayList.add("is_primary_line=" + bool8);
        }
        Boolean bool9 = this.upper_data_series;
        if (bool9 != null) {
            arrayList.add("upper_data_series=" + bool9);
        }
        Boolean bool10 = this.lower_data_series;
        if (bool10 != null) {
            arrayList.add("lower_data_series=" + bool10);
        }
        Boolean bool11 = this.enable_hit_test;
        if (bool11 != null) {
            arrayList.add("enable_hit_test=" + bool11);
        }
        arrayList.add("is_plot_hidden=" + this.is_plot_hidden);
        IndicatorLineDisplayType indicatorLineDisplayType = this.line_display_type;
        if (indicatorLineDisplayType != null) {
            arrayList.add("line_display_type=" + indicatorLineDisplayType);
        }
        if (!this.line_display_type_options.isEmpty()) {
            arrayList.add("line_display_type_options=" + this.line_display_type_options);
        }
        DifferenceCloud differenceCloud = this.difference_cloud;
        if (differenceCloud != null) {
            arrayList.add("difference_cloud=" + differenceCloud);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IndicatorLine{", "}", 0, null, null, 56, null);
    }

    public final IndicatorLine copy(String title, Boolean is_hidden_in_legend, Boolean is_linked_data_series, Boolean hide_thickness_selector, String id, Integer thickness, List<LineColor> colors, Boolean visible, Boolean label_visible, Integer offset, Integer z_index, String symbol_mapping, Boolean support_opacity, boolean show_y_axis_marker, boolean is_editable, Boolean is_main_linked_data_series, Boolean is_primary_line, Boolean upper_data_series, Boolean lower_data_series, Boolean enable_hit_test, boolean is_plot_hidden, IndicatorLineDisplayType line_display_type, List<IndicatorLineDisplayType> line_display_type_options, DifferenceCloud difference_cloud, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(line_display_type_options, "line_display_type_options");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IndicatorLine(title, is_hidden_in_legend, is_linked_data_series, hide_thickness_selector, id, thickness, colors, visible, label_visible, offset, z_index, symbol_mapping, support_opacity, show_y_axis_marker, is_editable, is_main_linked_data_series, is_primary_line, upper_data_series, lower_data_series, enable_hit_test, is_plot_hidden, line_display_type, line_display_type_options, difference_cloud, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndicatorLine.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IndicatorLine>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorLine$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IndicatorLine value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getIs_hidden_in_legend()) + protoAdapter.encodedSizeWithTag(4, value.getIs_linked_data_series()) + protoAdapter.encodedSizeWithTag(8, value.getHide_thickness_selector());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(9, value.getId());
                ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(10, value.getThickness()) + LineColor.ADAPTER.asRepeated().encodedSizeWithTag(11, value.getColors()) + protoAdapter.encodedSizeWithTag(12, value.getVisible()) + protoAdapter.encodedSizeWithTag(13, value.getLabel_visible()) + protoAdapter3.encodedSizeWithTag(14, value.getOffset()) + protoAdapter3.encodedSizeWithTag(15, value.getZ_index()) + protoAdapter2.encodedSizeWithTag(16, value.getSymbol_mapping()) + protoAdapter.encodedSizeWithTag(17, value.getSupport_opacity());
                if (value.getShow_y_axis_marker()) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(18, Boolean.valueOf(value.getShow_y_axis_marker()));
                }
                if (value.getIs_editable()) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(19, Boolean.valueOf(value.getIs_editable()));
                }
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter.encodedSizeWithTag(21, value.getIs_main_linked_data_series()) + protoAdapter.encodedSizeWithTag(22, value.getIs_primary_line()) + protoAdapter.encodedSizeWithTag(23, value.getUpper_data_series()) + protoAdapter.encodedSizeWithTag(24, value.getLower_data_series()) + protoAdapter.encodedSizeWithTag(25, value.getEnable_hit_test());
                if (value.getIs_plot_hidden()) {
                    iEncodedSizeWithTag4 += protoAdapter.encodedSizeWithTag(26, Boolean.valueOf(value.getIs_plot_hidden()));
                }
                if (value.getLine_display_type() != null) {
                    iEncodedSizeWithTag4 += IndicatorLineDisplayType.ADAPTER.encodedSizeWithTag(27, value.getLine_display_type());
                }
                return iEncodedSizeWithTag4 + IndicatorLineDisplayType.ADAPTER.asRepeated().encodedSizeWithTag(28, value.getLine_display_type_options()) + DifferenceCloud.ADAPTER.encodedSizeWithTag(29, value.getDifference_cloud());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IndicatorLine value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getIs_hidden_in_legend());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getIs_linked_data_series());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getHide_thickness_selector());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 9, (int) value.getId());
                ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 10, (int) value.getThickness());
                LineColor.ADAPTER.asRepeated().encodeWithTag(writer, 11, (int) value.getColors());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getVisible());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getLabel_visible());
                protoAdapter3.encodeWithTag(writer, 14, (int) value.getOffset());
                protoAdapter3.encodeWithTag(writer, 15, (int) value.getZ_index());
                protoAdapter2.encodeWithTag(writer, 16, (int) value.getSymbol_mapping());
                protoAdapter.encodeWithTag(writer, 17, (int) value.getSupport_opacity());
                if (value.getShow_y_axis_marker()) {
                    protoAdapter.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getShow_y_axis_marker()));
                }
                if (value.getIs_editable()) {
                    protoAdapter.encodeWithTag(writer, 19, (int) Boolean.valueOf(value.getIs_editable()));
                }
                protoAdapter.encodeWithTag(writer, 21, (int) value.getIs_main_linked_data_series());
                protoAdapter.encodeWithTag(writer, 22, (int) value.getIs_primary_line());
                protoAdapter.encodeWithTag(writer, 23, (int) value.getUpper_data_series());
                protoAdapter.encodeWithTag(writer, 24, (int) value.getLower_data_series());
                protoAdapter.encodeWithTag(writer, 25, (int) value.getEnable_hit_test());
                if (value.getIs_plot_hidden()) {
                    protoAdapter.encodeWithTag(writer, 26, (int) Boolean.valueOf(value.getIs_plot_hidden()));
                }
                if (value.getLine_display_type() != null) {
                    IndicatorLineDisplayType.ADAPTER.encodeWithTag(writer, 27, (int) value.getLine_display_type());
                }
                IndicatorLineDisplayType.ADAPTER.asRepeated().encodeWithTag(writer, 28, (int) value.getLine_display_type_options());
                DifferenceCloud.ADAPTER.encodeWithTag(writer, 29, (int) value.getDifference_cloud());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IndicatorLine value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                DifferenceCloud.ADAPTER.encodeWithTag(writer, 29, (int) value.getDifference_cloud());
                ProtoAdapter<IndicatorLineDisplayType> protoAdapter = IndicatorLineDisplayType.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 28, (int) value.getLine_display_type_options());
                if (value.getLine_display_type() != null) {
                    protoAdapter.encodeWithTag(writer, 27, (int) value.getLine_display_type());
                }
                if (value.getIs_plot_hidden()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 26, (int) Boolean.valueOf(value.getIs_plot_hidden()));
                }
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 25, (int) value.getEnable_hit_test());
                protoAdapter2.encodeWithTag(writer, 24, (int) value.getLower_data_series());
                protoAdapter2.encodeWithTag(writer, 23, (int) value.getUpper_data_series());
                protoAdapter2.encodeWithTag(writer, 22, (int) value.getIs_primary_line());
                protoAdapter2.encodeWithTag(writer, 21, (int) value.getIs_main_linked_data_series());
                if (value.getIs_editable()) {
                    protoAdapter2.encodeWithTag(writer, 19, (int) Boolean.valueOf(value.getIs_editable()));
                }
                if (value.getShow_y_axis_marker()) {
                    protoAdapter2.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getShow_y_axis_marker()));
                }
                protoAdapter2.encodeWithTag(writer, 17, (int) value.getSupport_opacity());
                ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 16, (int) value.getSymbol_mapping());
                ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
                protoAdapter4.encodeWithTag(writer, 15, (int) value.getZ_index());
                protoAdapter4.encodeWithTag(writer, 14, (int) value.getOffset());
                protoAdapter2.encodeWithTag(writer, 13, (int) value.getLabel_visible());
                protoAdapter2.encodeWithTag(writer, 12, (int) value.getVisible());
                LineColor.ADAPTER.asRepeated().encodeWithTag(writer, 11, (int) value.getColors());
                protoAdapter4.encodeWithTag(writer, 10, (int) value.getThickness());
                protoAdapter3.encodeWithTag(writer, 9, (int) value.getId());
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getHide_thickness_selector());
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getIs_linked_data_series());
                protoAdapter2.encodeWithTag(writer, 3, (int) value.getIs_hidden_in_legend());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter3.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorLine decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Boolean boolDecode = null;
                String strDecode = "";
                Boolean boolDecode2 = null;
                String strDecode2 = null;
                Integer numDecode = null;
                Boolean boolDecode3 = null;
                Boolean boolDecode4 = null;
                Integer numDecode2 = null;
                Integer numDecode3 = null;
                String strDecode3 = null;
                Boolean boolDecode5 = null;
                Boolean boolDecode6 = null;
                Boolean boolDecode7 = null;
                Boolean boolDecode8 = null;
                Boolean boolDecode9 = null;
                Boolean boolDecode10 = null;
                IndicatorLineDisplayType indicatorLineDisplayTypeDecode = null;
                DifferenceCloud differenceCloudDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                Boolean boolDecode11 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    Boolean bool = boolDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                            case 5:
                            case 6:
                            case 7:
                            case 20:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 3:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                continue;
                            case 4:
                                boolDecode11 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 8:
                                boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 9:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 11:
                                arrayList.add(LineColor.ADAPTER.decode(reader));
                                break;
                            case 12:
                                boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 13:
                                boolDecode4 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 14:
                                numDecode2 = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 15:
                                numDecode3 = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 16:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 17:
                                boolDecode5 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 18:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 19:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 21:
                                boolDecode6 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 22:
                                boolDecode7 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 23:
                                boolDecode8 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 24:
                                boolDecode9 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 25:
                                boolDecode10 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 26:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 27:
                                indicatorLineDisplayTypeDecode = IndicatorLineDisplayType.ADAPTER.decode(reader);
                                break;
                            case 28:
                                arrayList2.add(IndicatorLineDisplayType.ADAPTER.decode(reader));
                                break;
                            case 29:
                                differenceCloudDecode = DifferenceCloud.ADAPTER.decode(reader);
                                break;
                        }
                        boolDecode = bool;
                    } else {
                        return new IndicatorLine(strDecode, bool, boolDecode11, boolDecode2, strDecode2, numDecode, arrayList, boolDecode3, boolDecode4, numDecode2, numDecode3, strDecode3, boolDecode5, zBooleanValue, zBooleanValue2, boolDecode6, boolDecode7, boolDecode8, boolDecode9, boolDecode10, zBooleanValue3, indicatorLineDisplayTypeDecode, arrayList2, differenceCloudDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorLine redact(IndicatorLine value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getColors(), LineColor.ADAPTER);
                IndicatorLineDisplayType line_display_type = value.getLine_display_type();
                IndicatorLineDisplayType indicatorLineDisplayTypeRedact = line_display_type != null ? IndicatorLineDisplayType.ADAPTER.redact(line_display_type) : null;
                List listM26823redactElements2 = Internal.m26823redactElements(value.getLine_display_type_options(), IndicatorLineDisplayType.ADAPTER);
                DifferenceCloud difference_cloud = value.getDifference_cloud();
                return value.copy((2097087 & 1) != 0 ? value.title : null, (2097087 & 2) != 0 ? value.is_hidden_in_legend : null, (2097087 & 4) != 0 ? value.is_linked_data_series : null, (2097087 & 8) != 0 ? value.hide_thickness_selector : null, (2097087 & 16) != 0 ? value.id : null, (2097087 & 32) != 0 ? value.thickness : null, (2097087 & 64) != 0 ? value.colors : listM26823redactElements, (2097087 & 128) != 0 ? value.visible : null, (2097087 & 256) != 0 ? value.label_visible : null, (2097087 & 512) != 0 ? value.offset : null, (2097087 & 1024) != 0 ? value.z_index : null, (2097087 & 2048) != 0 ? value.symbol_mapping : null, (2097087 & 4096) != 0 ? value.support_opacity : null, (2097087 & 8192) != 0 ? value.show_y_axis_marker : false, (2097087 & 16384) != 0 ? value.is_editable : false, (2097087 & 32768) != 0 ? value.is_main_linked_data_series : null, (2097087 & 65536) != 0 ? value.is_primary_line : null, (2097087 & 131072) != 0 ? value.upper_data_series : null, (2097087 & 262144) != 0 ? value.lower_data_series : null, (2097087 & 524288) != 0 ? value.enable_hit_test : null, (2097087 & 1048576) != 0 ? value.is_plot_hidden : false, (2097087 & 2097152) != 0 ? value.line_display_type : indicatorLineDisplayTypeRedact, (2097087 & 4194304) != 0 ? value.line_display_type_options : listM26823redactElements2, (2097087 & 8388608) != 0 ? value.difference_cloud : difference_cloud != null ? DifferenceCloud.ADAPTER.redact(difference_cloud) : null, (2097087 & 16777216) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
