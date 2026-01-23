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

/* compiled from: IndicatorState.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 M2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MB·\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\n\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\n\u0012\b\b\u0002\u0010$\u001a\u00020%¢\u0006\u0004\b&\u0010'J\b\u0010E\u001a\u00020\u0002H\u0017J\u0013\u0010F\u001a\u00020\u00062\b\u0010G\u001a\u0004\u0018\u00010HH\u0096\u0002J\b\u0010I\u001a\u00020\u001dH\u0016J\b\u0010J\u001a\u00020\u0004H\u0016J»\u0002\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\n2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\n2\b\b\u0002\u0010$\u001a\u00020%¢\u0006\u0002\u0010LR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b\b\u0010-R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b\u0012\u0010-R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b\u0013\u0010-R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b5\u0010-R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b6\u0010-R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b7\u0010-R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b;\u0010-R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010@R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010@¨\u0006N"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorState;", "Lcom/squareup/wire/Message;", "", "uuid", "", "minimized", "", "visible", "is_minimized_managed_by_user", "validation_info", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorValidationInfo;", "id", "title", "description", "overlaying", "categories", "abbreviation", "is_single_plot", "is_envelope", "recalculate_on_x_scale_change", "should_cycle_length", "parameters", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameter;", "lines", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLine;", "search_terms", "show_only_abbreviation", "ht_id", "", "disabled_hover_values", "paren_params_label", "tooltip", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltip;", "additional_sections", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CustomIndicatorSection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltip;Ljava/util/List;Lokio/ByteString;)V", "getUuid", "()Ljava/lang/String;", "getMinimized", "()Z", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "getTitle", "getDescription", "getOverlaying", "getCategories", "getAbbreviation", "getRecalculate_on_x_scale_change", "getShould_cycle_length", "getShow_only_abbreviation", "getHt_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisabled_hover_values", "getParen_params_label", "getTooltip", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltip;", "getValidation_info", "()Ljava/util/List;", "getParameters", "getLines", "getSearch_terms", "getAdditional_sections", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltip;Ljava/util/List;Lokio/ByteString;)Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorState;", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IndicatorState extends Message {

    @JvmField
    public static final ProtoAdapter<IndicatorState> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    private final String abbreviation;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.CustomIndicatorSection#ADAPTER", jsonName = "additionalSections", label = WireField.Label.REPEATED, schemaIndex = 23, tag = 25)
    private final List<CustomIndicatorSection> additional_sections;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String categories;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disabledHoverValues", schemaIndex = 20, tag = 22)
    private final Boolean disabled_hover_values;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "htId", schemaIndex = 19, tag = 21)
    private final Integer ht_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEnvelope", schemaIndex = 12, tag = 13)
    private final Boolean is_envelope;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isMinimizedManagedByUser", schemaIndex = 3, tag = 4)
    private final Boolean is_minimized_managed_by_user;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSinglePlot", schemaIndex = 11, tag = 12)
    private final Boolean is_single_plot;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorLine#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 16, tag = 17)
    private final List<IndicatorLine> lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean minimized;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final boolean overlaying;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameter#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 15, tag = 16)
    private final List<IndicatorParameter> parameters;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "parenParamsLabel", schemaIndex = 21, tag = 23)
    private final String paren_params_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "recalculateOnXScaleChange", schemaIndex = 13, tag = 14)
    private final Boolean recalculate_on_x_scale_change;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "searchTerms", label = WireField.Label.REPEATED, schemaIndex = 17, tag = 18)
    private final List<String> search_terms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldCycleLength", schemaIndex = 14, tag = 15)
    private final Boolean should_cycle_length;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showOnlyAbbreviation", schemaIndex = 18, tag = 19)
    private final Boolean show_only_abbreviation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String title;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorTooltip#ADAPTER", schemaIndex = 22, tag = 24)
    private final IndicatorTooltip tooltip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String uuid;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorValidationInfo#ADAPTER", jsonName = "validationInfo", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<IndicatorValidationInfo> validation_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean visible;

    public IndicatorState() {
        this(null, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    public /* synthetic */ IndicatorState(String str, boolean z, boolean z2, Boolean bool, List list, String str2, String str3, String str4, boolean z3, String str5, String str6, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List list2, List list3, List list4, Boolean bool6, Integer num, Boolean bool7, String str7, IndicatorTooltip indicatorTooltip, List list5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? z3 : false, (i & 512) == 0 ? str5 : "", (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : bool4, (i & 16384) != 0 ? null : bool5, (i & 32768) != 0 ? CollectionsKt.emptyList() : list2, (i & 65536) != 0 ? CollectionsKt.emptyList() : list3, (i & 131072) != 0 ? CollectionsKt.emptyList() : list4, (i & 262144) != 0 ? null : bool6, (i & 524288) != 0 ? null : num, (i & 1048576) != 0 ? null : bool7, (i & 2097152) != 0 ? null : str7, (i & 4194304) != 0 ? null : indicatorTooltip, (i & 8388608) != 0 ? CollectionsKt.emptyList() : list5, (i & 16777216) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8609newBuilder();
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final boolean getMinimized() {
        return this.minimized;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    /* renamed from: is_minimized_managed_by_user, reason: from getter */
    public final Boolean getIs_minimized_managed_by_user() {
        return this.is_minimized_managed_by_user;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getOverlaying() {
        return this.overlaying;
    }

    public final String getCategories() {
        return this.categories;
    }

    public final String getAbbreviation() {
        return this.abbreviation;
    }

    /* renamed from: is_single_plot, reason: from getter */
    public final Boolean getIs_single_plot() {
        return this.is_single_plot;
    }

    /* renamed from: is_envelope, reason: from getter */
    public final Boolean getIs_envelope() {
        return this.is_envelope;
    }

    public final Boolean getRecalculate_on_x_scale_change() {
        return this.recalculate_on_x_scale_change;
    }

    public final Boolean getShould_cycle_length() {
        return this.should_cycle_length;
    }

    public final Boolean getShow_only_abbreviation() {
        return this.show_only_abbreviation;
    }

    public final Integer getHt_id() {
        return this.ht_id;
    }

    public final Boolean getDisabled_hover_values() {
        return this.disabled_hover_values;
    }

    public final String getParen_params_label() {
        return this.paren_params_label;
    }

    public final IndicatorTooltip getTooltip() {
        return this.tooltip;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorState(String uuid, boolean z, boolean z2, Boolean bool, List<IndicatorValidationInfo> validation_info, String id, String title, String str, boolean z3, String categories, String str2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List<IndicatorParameter> parameters, List<IndicatorLine> lines, List<String> search_terms, Boolean bool6, Integer num, Boolean bool7, String str3, IndicatorTooltip indicatorTooltip, List<CustomIndicatorSection> additional_sections, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(validation_info, "validation_info");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(search_terms, "search_terms");
        Intrinsics.checkNotNullParameter(additional_sections, "additional_sections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.uuid = uuid;
        this.minimized = z;
        this.visible = z2;
        this.is_minimized_managed_by_user = bool;
        this.id = id;
        this.title = title;
        this.description = str;
        this.overlaying = z3;
        this.categories = categories;
        this.abbreviation = str2;
        this.is_single_plot = bool2;
        this.is_envelope = bool3;
        this.recalculate_on_x_scale_change = bool4;
        this.should_cycle_length = bool5;
        this.show_only_abbreviation = bool6;
        this.ht_id = num;
        this.disabled_hover_values = bool7;
        this.paren_params_label = str3;
        this.tooltip = indicatorTooltip;
        this.validation_info = Internal.immutableCopyOf("validation_info", validation_info);
        this.parameters = Internal.immutableCopyOf("parameters", parameters);
        this.lines = Internal.immutableCopyOf("lines", lines);
        this.search_terms = Internal.immutableCopyOf("search_terms", search_terms);
        this.additional_sections = Internal.immutableCopyOf("additional_sections", additional_sections);
    }

    public final List<IndicatorValidationInfo> getValidation_info() {
        return this.validation_info;
    }

    public final List<IndicatorParameter> getParameters() {
        return this.parameters;
    }

    public final List<IndicatorLine> getLines() {
        return this.lines;
    }

    public final List<String> getSearch_terms() {
        return this.search_terms;
    }

    public final List<CustomIndicatorSection> getAdditional_sections() {
        return this.additional_sections;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8609newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IndicatorState)) {
            return false;
        }
        IndicatorState indicatorState = (IndicatorState) other;
        return Intrinsics.areEqual(unknownFields(), indicatorState.unknownFields()) && Intrinsics.areEqual(this.uuid, indicatorState.uuid) && this.minimized == indicatorState.minimized && this.visible == indicatorState.visible && Intrinsics.areEqual(this.is_minimized_managed_by_user, indicatorState.is_minimized_managed_by_user) && Intrinsics.areEqual(this.validation_info, indicatorState.validation_info) && Intrinsics.areEqual(this.id, indicatorState.id) && Intrinsics.areEqual(this.title, indicatorState.title) && Intrinsics.areEqual(this.description, indicatorState.description) && this.overlaying == indicatorState.overlaying && Intrinsics.areEqual(this.categories, indicatorState.categories) && Intrinsics.areEqual(this.abbreviation, indicatorState.abbreviation) && Intrinsics.areEqual(this.is_single_plot, indicatorState.is_single_plot) && Intrinsics.areEqual(this.is_envelope, indicatorState.is_envelope) && Intrinsics.areEqual(this.recalculate_on_x_scale_change, indicatorState.recalculate_on_x_scale_change) && Intrinsics.areEqual(this.should_cycle_length, indicatorState.should_cycle_length) && Intrinsics.areEqual(this.parameters, indicatorState.parameters) && Intrinsics.areEqual(this.lines, indicatorState.lines) && Intrinsics.areEqual(this.search_terms, indicatorState.search_terms) && Intrinsics.areEqual(this.show_only_abbreviation, indicatorState.show_only_abbreviation) && Intrinsics.areEqual(this.ht_id, indicatorState.ht_id) && Intrinsics.areEqual(this.disabled_hover_values, indicatorState.disabled_hover_values) && Intrinsics.areEqual(this.paren_params_label, indicatorState.paren_params_label) && Intrinsics.areEqual(this.tooltip, indicatorState.tooltip) && Intrinsics.areEqual(this.additional_sections, indicatorState.additional_sections);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.uuid.hashCode()) * 37) + Boolean.hashCode(this.minimized)) * 37) + Boolean.hashCode(this.visible)) * 37;
        Boolean bool = this.is_minimized_managed_by_user;
        int iHashCode2 = (((((((iHashCode + (bool != null ? bool.hashCode() : 0)) * 37) + this.validation_info.hashCode()) * 37) + this.id.hashCode()) * 37) + this.title.hashCode()) * 37;
        String str = this.description;
        int iHashCode3 = (((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.overlaying)) * 37) + this.categories.hashCode()) * 37;
        String str2 = this.abbreviation;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_single_plot;
        int iHashCode5 = (iHashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_envelope;
        int iHashCode6 = (iHashCode5 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.recalculate_on_x_scale_change;
        int iHashCode7 = (iHashCode6 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.should_cycle_length;
        int iHashCode8 = (((((((iHashCode7 + (bool5 != null ? bool5.hashCode() : 0)) * 37) + this.parameters.hashCode()) * 37) + this.lines.hashCode()) * 37) + this.search_terms.hashCode()) * 37;
        Boolean bool6 = this.show_only_abbreviation;
        int iHashCode9 = (iHashCode8 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Integer num = this.ht_id;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 37;
        Boolean bool7 = this.disabled_hover_values;
        int iHashCode11 = (iHashCode10 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        String str3 = this.paren_params_label;
        int iHashCode12 = (iHashCode11 + (str3 != null ? str3.hashCode() : 0)) * 37;
        IndicatorTooltip indicatorTooltip = this.tooltip;
        int iHashCode13 = ((iHashCode12 + (indicatorTooltip != null ? indicatorTooltip.hashCode() : 0)) * 37) + this.additional_sections.hashCode();
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("uuid=" + Internal.sanitize(this.uuid));
        arrayList.add("minimized=" + this.minimized);
        arrayList.add("visible=" + this.visible);
        Boolean bool = this.is_minimized_managed_by_user;
        if (bool != null) {
            arrayList.add("is_minimized_managed_by_user=" + bool);
        }
        if (!this.validation_info.isEmpty()) {
            arrayList.add("validation_info=" + this.validation_info);
        }
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("title=" + Internal.sanitize(this.title));
        String str = this.description;
        if (str != null) {
            arrayList.add("description=" + Internal.sanitize(str));
        }
        arrayList.add("overlaying=" + this.overlaying);
        arrayList.add("categories=" + Internal.sanitize(this.categories));
        String str2 = this.abbreviation;
        if (str2 != null) {
            arrayList.add("abbreviation=" + Internal.sanitize(str2));
        }
        Boolean bool2 = this.is_single_plot;
        if (bool2 != null) {
            arrayList.add("is_single_plot=" + bool2);
        }
        Boolean bool3 = this.is_envelope;
        if (bool3 != null) {
            arrayList.add("is_envelope=" + bool3);
        }
        Boolean bool4 = this.recalculate_on_x_scale_change;
        if (bool4 != null) {
            arrayList.add("recalculate_on_x_scale_change=" + bool4);
        }
        Boolean bool5 = this.should_cycle_length;
        if (bool5 != null) {
            arrayList.add("should_cycle_length=" + bool5);
        }
        if (!this.parameters.isEmpty()) {
            arrayList.add("parameters=" + this.parameters);
        }
        if (!this.lines.isEmpty()) {
            arrayList.add("lines=" + this.lines);
        }
        if (!this.search_terms.isEmpty()) {
            arrayList.add("search_terms=" + Internal.sanitize(this.search_terms));
        }
        Boolean bool6 = this.show_only_abbreviation;
        if (bool6 != null) {
            arrayList.add("show_only_abbreviation=" + bool6);
        }
        Integer num = this.ht_id;
        if (num != null) {
            arrayList.add("ht_id=" + num);
        }
        Boolean bool7 = this.disabled_hover_values;
        if (bool7 != null) {
            arrayList.add("disabled_hover_values=" + bool7);
        }
        String str3 = this.paren_params_label;
        if (str3 != null) {
            arrayList.add("paren_params_label=" + Internal.sanitize(str3));
        }
        IndicatorTooltip indicatorTooltip = this.tooltip;
        if (indicatorTooltip != null) {
            arrayList.add("tooltip=" + indicatorTooltip);
        }
        if (!this.additional_sections.isEmpty()) {
            arrayList.add("additional_sections=" + this.additional_sections);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IndicatorState{", "}", 0, null, null, 56, null);
    }

    public final IndicatorState copy(String uuid, boolean minimized, boolean visible, Boolean is_minimized_managed_by_user, List<IndicatorValidationInfo> validation_info, String id, String title, String description, boolean overlaying, String categories, String abbreviation, Boolean is_single_plot, Boolean is_envelope, Boolean recalculate_on_x_scale_change, Boolean should_cycle_length, List<IndicatorParameter> parameters, List<IndicatorLine> lines, List<String> search_terms, Boolean show_only_abbreviation, Integer ht_id, Boolean disabled_hover_values, String paren_params_label, IndicatorTooltip tooltip, List<CustomIndicatorSection> additional_sections, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(validation_info, "validation_info");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(search_terms, "search_terms");
        Intrinsics.checkNotNullParameter(additional_sections, "additional_sections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IndicatorState(uuid, minimized, visible, is_minimized_managed_by_user, validation_info, id, title, description, overlaying, categories, abbreviation, is_single_plot, is_envelope, recalculate_on_x_scale_change, should_cycle_length, parameters, lines, search_terms, show_only_abbreviation, ht_id, disabled_hover_values, paren_params_label, tooltip, additional_sections, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndicatorState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IndicatorState>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorState$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IndicatorState value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUuid());
                }
                if (value.getMinimized()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getMinimized()));
                }
                if (value.getVisible()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getVisible()));
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getIs_minimized_managed_by_user()) + IndicatorValidationInfo.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getValidation_info());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getId());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getTitle());
                }
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(8, value.getDescription());
                if (value.getOverlaying()) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(9, Boolean.valueOf(value.getOverlaying()));
                }
                if (!Intrinsics.areEqual(value.getCategories(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter2.encodedSizeWithTag(10, value.getCategories());
                }
                return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(11, value.getAbbreviation()) + protoAdapter.encodedSizeWithTag(12, value.getIs_single_plot()) + protoAdapter.encodedSizeWithTag(13, value.getIs_envelope()) + protoAdapter.encodedSizeWithTag(14, value.getRecalculate_on_x_scale_change()) + protoAdapter.encodedSizeWithTag(15, value.getShould_cycle_length()) + IndicatorParameter.ADAPTER.asRepeated().encodedSizeWithTag(16, value.getParameters()) + IndicatorLine.ADAPTER.asRepeated().encodedSizeWithTag(17, value.getLines()) + protoAdapter2.asRepeated().encodedSizeWithTag(18, value.getSearch_terms()) + protoAdapter.encodedSizeWithTag(19, value.getShow_only_abbreviation()) + ProtoAdapter.INT32.encodedSizeWithTag(21, value.getHt_id()) + protoAdapter.encodedSizeWithTag(22, value.getDisabled_hover_values()) + protoAdapter2.encodedSizeWithTag(23, value.getParen_params_label()) + IndicatorTooltip.ADAPTER.encodedSizeWithTag(24, value.getTooltip()) + CustomIndicatorSection.ADAPTER.asRepeated().encodedSizeWithTag(25, value.getAdditional_sections());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IndicatorState value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUuid());
                }
                if (value.getMinimized()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getMinimized()));
                }
                if (value.getVisible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getVisible()));
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getIs_minimized_managed_by_user());
                IndicatorValidationInfo.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getValidation_info());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getTitle());
                }
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getDescription());
                if (value.getOverlaying()) {
                    protoAdapter.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getOverlaying()));
                }
                if (!Intrinsics.areEqual(value.getCategories(), "")) {
                    protoAdapter2.encodeWithTag(writer, 10, (int) value.getCategories());
                }
                protoAdapter2.encodeWithTag(writer, 11, (int) value.getAbbreviation());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getIs_single_plot());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getIs_envelope());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getRecalculate_on_x_scale_change());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getShould_cycle_length());
                IndicatorParameter.ADAPTER.asRepeated().encodeWithTag(writer, 16, (int) value.getParameters());
                IndicatorLine.ADAPTER.asRepeated().encodeWithTag(writer, 17, (int) value.getLines());
                protoAdapter2.asRepeated().encodeWithTag(writer, 18, (int) value.getSearch_terms());
                protoAdapter.encodeWithTag(writer, 19, (int) value.getShow_only_abbreviation());
                ProtoAdapter.INT32.encodeWithTag(writer, 21, (int) value.getHt_id());
                protoAdapter.encodeWithTag(writer, 22, (int) value.getDisabled_hover_values());
                protoAdapter2.encodeWithTag(writer, 23, (int) value.getParen_params_label());
                IndicatorTooltip.ADAPTER.encodeWithTag(writer, 24, (int) value.getTooltip());
                CustomIndicatorSection.ADAPTER.asRepeated().encodeWithTag(writer, 25, (int) value.getAdditional_sections());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IndicatorState value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CustomIndicatorSection.ADAPTER.asRepeated().encodeWithTag(writer, 25, (int) value.getAdditional_sections());
                IndicatorTooltip.ADAPTER.encodeWithTag(writer, 24, (int) value.getTooltip());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 23, (int) value.getParen_params_label());
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 22, (int) value.getDisabled_hover_values());
                ProtoAdapter.INT32.encodeWithTag(writer, 21, (int) value.getHt_id());
                protoAdapter2.encodeWithTag(writer, 19, (int) value.getShow_only_abbreviation());
                protoAdapter.asRepeated().encodeWithTag(writer, 18, (int) value.getSearch_terms());
                IndicatorLine.ADAPTER.asRepeated().encodeWithTag(writer, 17, (int) value.getLines());
                IndicatorParameter.ADAPTER.asRepeated().encodeWithTag(writer, 16, (int) value.getParameters());
                protoAdapter2.encodeWithTag(writer, 15, (int) value.getShould_cycle_length());
                protoAdapter2.encodeWithTag(writer, 14, (int) value.getRecalculate_on_x_scale_change());
                protoAdapter2.encodeWithTag(writer, 13, (int) value.getIs_envelope());
                protoAdapter2.encodeWithTag(writer, 12, (int) value.getIs_single_plot());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getAbbreviation());
                if (!Intrinsics.areEqual(value.getCategories(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getCategories());
                }
                if (value.getOverlaying()) {
                    protoAdapter2.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getOverlaying()));
                }
                protoAdapter.encodeWithTag(writer, 8, (int) value.getDescription());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getId());
                }
                IndicatorValidationInfo.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getValidation_info());
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getIs_minimized_managed_by_user());
                if (value.getVisible()) {
                    protoAdapter2.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getVisible()));
                }
                if (value.getMinimized()) {
                    protoAdapter2.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getMinimized()));
                }
                if (Intrinsics.areEqual(value.getUuid(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getUuid());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorState decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                Boolean boolDecode = null;
                String strDecode3 = null;
                String strDecode4 = null;
                Boolean boolDecode2 = null;
                Boolean boolDecode3 = null;
                Boolean boolDecode4 = null;
                Boolean boolDecode5 = null;
                Boolean boolDecode6 = null;
                Integer numDecode = null;
                Boolean boolDecode7 = null;
                String strDecode5 = null;
                IndicatorTooltip indicatorTooltipDecode = null;
                String strDecode6 = strDecode2;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode6;
                    if (iNextTag == -1) {
                        return new IndicatorState(strDecode2, zBooleanValue, zBooleanValue2, boolDecode, arrayList, str, strDecode7, strDecode3, zBooleanValue3, strDecode, strDecode4, boolDecode2, boolDecode3, boolDecode4, boolDecode5, arrayList2, arrayList3, arrayList4, boolDecode6, numDecode, boolDecode7, strDecode5, indicatorTooltipDecode, arrayList5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 3:
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 4:
                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 5:
                            arrayList.add(IndicatorValidationInfo.ADAPTER.decode(reader));
                            break;
                        case 6:
                            strDecode6 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 7:
                            strDecode7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 10:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 11:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 12:
                            boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 13:
                            boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 14:
                            boolDecode4 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 15:
                            boolDecode5 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 16:
                            arrayList2.add(IndicatorParameter.ADAPTER.decode(reader));
                            break;
                        case 17:
                            arrayList3.add(IndicatorLine.ADAPTER.decode(reader));
                            break;
                        case 18:
                            arrayList4.add(ProtoAdapter.STRING.decode(reader));
                            break;
                        case 19:
                            boolDecode6 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 20:
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                        case 21:
                            numDecode = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 22:
                            boolDecode7 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 23:
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 24:
                            indicatorTooltipDecode = IndicatorTooltip.ADAPTER.decode(reader);
                            break;
                        case 25:
                            arrayList5.add(CustomIndicatorSection.ADAPTER.decode(reader));
                            break;
                    }
                    strDecode6 = str;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorState redact(IndicatorState value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getValidation_info(), IndicatorValidationInfo.ADAPTER);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getParameters(), IndicatorParameter.ADAPTER);
                List listM26823redactElements3 = Internal.m26823redactElements(value.getLines(), IndicatorLine.ADAPTER);
                IndicatorTooltip tooltip = value.getTooltip();
                return value.copy((4095983 & 1) != 0 ? value.uuid : null, (4095983 & 2) != 0 ? value.minimized : false, (4095983 & 4) != 0 ? value.visible : false, (4095983 & 8) != 0 ? value.is_minimized_managed_by_user : null, (4095983 & 16) != 0 ? value.validation_info : listM26823redactElements, (4095983 & 32) != 0 ? value.id : null, (4095983 & 64) != 0 ? value.title : null, (4095983 & 128) != 0 ? value.description : null, (4095983 & 256) != 0 ? value.overlaying : false, (4095983 & 512) != 0 ? value.categories : null, (4095983 & 1024) != 0 ? value.abbreviation : null, (4095983 & 2048) != 0 ? value.is_single_plot : null, (4095983 & 4096) != 0 ? value.is_envelope : null, (4095983 & 8192) != 0 ? value.recalculate_on_x_scale_change : null, (4095983 & 16384) != 0 ? value.should_cycle_length : null, (4095983 & 32768) != 0 ? value.parameters : listM26823redactElements2, (4095983 & 65536) != 0 ? value.lines : listM26823redactElements3, (4095983 & 131072) != 0 ? value.search_terms : null, (4095983 & 262144) != 0 ? value.show_only_abbreviation : null, (4095983 & 524288) != 0 ? value.ht_id : null, (4095983 & 1048576) != 0 ? value.disabled_hover_values : null, (4095983 & 2097152) != 0 ? value.paren_params_label : null, (4095983 & 4194304) != 0 ? value.tooltip : tooltip != null ? IndicatorTooltip.ADAPTER.redact(tooltip) : null, (4095983 & 8388608) != 0 ? value.additional_sections : Internal.m26823redactElements(value.getAdditional_sections(), CustomIndicatorSection.ADAPTER), (4095983 & 16777216) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
