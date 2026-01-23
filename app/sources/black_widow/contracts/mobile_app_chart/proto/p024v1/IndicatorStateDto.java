package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import black_widow.contracts.mobile_app_chart.proto.p024v1.CustomIndicatorSectionDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorLineDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorTooltipDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorValidationInfoDto;
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

/* compiled from: IndicatorStateDto.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004ONPQB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B¯\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u000e¢\u0006\u0004\b\u0006\u0010)J³\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u000e¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u000100H\u0096\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020!H\u0016¢\u0006\u0004\b4\u00105J\u001f\u0010:\u001a\u0002092\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020!H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020!H\u0016¢\u0006\u0004\b<\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u0010/R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bA\u0010@R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bD\u0010/R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bE\u0010/R\u0011\u0010\u0014\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bF\u0010@R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bG\u0010/R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e8F¢\u0006\u0006\u001a\u0004\bH\u0010CR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e8F¢\u0006\u0006\u001a\u0004\bI\u0010CR\u0013\u0010$\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bJ\u0010/R\u0013\u0010&\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u000e8F¢\u0006\u0006\u001a\u0004\bM\u0010C¨\u0006R"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorState;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto$Surrogate;)V", "", "uuid", "", "minimized", "visible", "is_minimized_managed_by_user", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorValidationInfoDto;", "validation_info", "id", "title", "description", "overlaying", "categories", "abbreviation", "is_single_plot", "is_envelope", "recalculate_on_x_scale_change", "should_cycle_length", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;", "parameters", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto;", "lines", "search_terms", "show_only_abbreviation", "", "ht_id", "disabled_hover_values", "paren_params_label", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltipDto;", "tooltip", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CustomIndicatorSectionDto;", "additional_sections", "(Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltipDto;Ljava/util/List;)V", "copy", "(Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltipDto;Ljava/util/List;)Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorState;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto$Surrogate;", "getUuid", "getMinimized", "()Z", "getVisible", "getValidation_info", "()Ljava/util/List;", "getId", "getTitle", "getOverlaying", "getAbbreviation", "getParameters", "getLines", "getParen_params_label", "getTooltip", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltipDto;", "getAdditional_sections", "Companion", "Surrogate", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class IndicatorStateDto implements Dto3<IndicatorState>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IndicatorStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IndicatorStateDto, IndicatorState>> binaryBase64Serializer$delegate;
    private static final IndicatorStateDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IndicatorStateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IndicatorStateDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getUuid() {
        return this.surrogate.getUuid();
    }

    public final boolean getMinimized() {
        return this.surrogate.getMinimized();
    }

    public final boolean getVisible() {
        return this.surrogate.getVisible();
    }

    public final List<IndicatorValidationInfoDto> getValidation_info() {
        return this.surrogate.getValidation_info();
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final boolean getOverlaying() {
        return this.surrogate.getOverlaying();
    }

    public final String getAbbreviation() {
        return this.surrogate.getAbbreviation();
    }

    public final List<IndicatorParameterDto> getParameters() {
        return this.surrogate.getParameters();
    }

    public final List<IndicatorLineDto> getLines() {
        return this.surrogate.getLines();
    }

    public final String getParen_params_label() {
        return this.surrogate.getParen_params_label();
    }

    public final IndicatorTooltipDto getTooltip() {
        return this.surrogate.getTooltip();
    }

    public final List<CustomIndicatorSectionDto> getAdditional_sections() {
        return this.surrogate.getAdditional_sections();
    }

    public /* synthetic */ IndicatorStateDto(String str, boolean z, boolean z2, Boolean bool, List list, String str2, String str3, String str4, boolean z3, String str5, String str6, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List list2, List list3, List list4, Boolean bool6, Integer num, Boolean bool7, String str7, IndicatorTooltipDto indicatorTooltipDto, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? z3 : false, (i & 512) == 0 ? str5 : "", (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : bool4, (i & 16384) != 0 ? null : bool5, (i & 32768) != 0 ? CollectionsKt.emptyList() : list2, (i & 65536) != 0 ? CollectionsKt.emptyList() : list3, (i & 131072) != 0 ? CollectionsKt.emptyList() : list4, (i & 262144) != 0 ? null : bool6, (i & 524288) != 0 ? null : num, (i & 1048576) != 0 ? null : bool7, (i & 2097152) != 0 ? null : str7, (i & 4194304) != 0 ? null : indicatorTooltipDto, (i & 8388608) != 0 ? CollectionsKt.emptyList() : list5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndicatorStateDto(String uuid, boolean z, boolean z2, Boolean bool, List<IndicatorValidationInfoDto> validation_info, String id, String title, String str, boolean z3, String categories, String str2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List<IndicatorParameterDto> parameters, List<IndicatorLineDto> lines, List<String> search_terms, Boolean bool6, Integer num, Boolean bool7, String str3, IndicatorTooltipDto indicatorTooltipDto, List<CustomIndicatorSectionDto> additional_sections) {
        this(new Surrogate(uuid, z, z2, bool, validation_info, id, title, str, z3, categories, str2, bool2, bool3, bool4, bool5, parameters, lines, search_terms, bool6, num, bool7, str3, indicatorTooltipDto, additional_sections));
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(validation_info, "validation_info");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(search_terms, "search_terms");
        Intrinsics.checkNotNullParameter(additional_sections, "additional_sections");
    }

    public static /* synthetic */ IndicatorStateDto copy$default(IndicatorStateDto indicatorStateDto, String str, boolean z, boolean z2, Boolean bool, List list, String str2, String str3, String str4, boolean z3, String str5, String str6, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List list2, List list3, List list4, Boolean bool6, Integer num, Boolean bool7, String str7, IndicatorTooltipDto indicatorTooltipDto, List list5, int i, Object obj) {
        List additional_sections;
        IndicatorTooltipDto indicatorTooltipDto2;
        String uuid = (i & 1) != 0 ? indicatorStateDto.surrogate.getUuid() : str;
        boolean minimized = (i & 2) != 0 ? indicatorStateDto.surrogate.getMinimized() : z;
        boolean visible = (i & 4) != 0 ? indicatorStateDto.surrogate.getVisible() : z2;
        Boolean is_minimized_managed_by_user = (i & 8) != 0 ? indicatorStateDto.surrogate.getIs_minimized_managed_by_user() : bool;
        List validation_info = (i & 16) != 0 ? indicatorStateDto.surrogate.getValidation_info() : list;
        String id = (i & 32) != 0 ? indicatorStateDto.surrogate.getId() : str2;
        String title = (i & 64) != 0 ? indicatorStateDto.surrogate.getTitle() : str3;
        String description = (i & 128) != 0 ? indicatorStateDto.surrogate.getDescription() : str4;
        boolean overlaying = (i & 256) != 0 ? indicatorStateDto.surrogate.getOverlaying() : z3;
        String categories = (i & 512) != 0 ? indicatorStateDto.surrogate.getCategories() : str5;
        String abbreviation = (i & 1024) != 0 ? indicatorStateDto.surrogate.getAbbreviation() : str6;
        Boolean is_single_plot = (i & 2048) != 0 ? indicatorStateDto.surrogate.getIs_single_plot() : bool2;
        Boolean is_envelope = (i & 4096) != 0 ? indicatorStateDto.surrogate.getIs_envelope() : bool3;
        Boolean recalculate_on_x_scale_change = (i & 8192) != 0 ? indicatorStateDto.surrogate.getRecalculate_on_x_scale_change() : bool4;
        String str8 = uuid;
        Boolean should_cycle_length = (i & 16384) != 0 ? indicatorStateDto.surrogate.getShould_cycle_length() : bool5;
        List parameters = (i & 32768) != 0 ? indicatorStateDto.surrogate.getParameters() : list2;
        List lines = (i & 65536) != 0 ? indicatorStateDto.surrogate.getLines() : list3;
        List search_terms = (i & 131072) != 0 ? indicatorStateDto.surrogate.getSearch_terms() : list4;
        Boolean show_only_abbreviation = (i & 262144) != 0 ? indicatorStateDto.surrogate.getShow_only_abbreviation() : bool6;
        Integer ht_id = (i & 524288) != 0 ? indicatorStateDto.surrogate.getHt_id() : num;
        Boolean disabled_hover_values = (i & 1048576) != 0 ? indicatorStateDto.surrogate.getDisabled_hover_values() : bool7;
        String paren_params_label = (i & 2097152) != 0 ? indicatorStateDto.surrogate.getParen_params_label() : str7;
        IndicatorTooltipDto tooltip = (i & 4194304) != 0 ? indicatorStateDto.surrogate.getTooltip() : indicatorTooltipDto;
        if ((i & 8388608) != 0) {
            indicatorTooltipDto2 = tooltip;
            additional_sections = indicatorStateDto.surrogate.getAdditional_sections();
        } else {
            additional_sections = list5;
            indicatorTooltipDto2 = tooltip;
        }
        return indicatorStateDto.copy(str8, minimized, visible, is_minimized_managed_by_user, validation_info, id, title, description, overlaying, categories, abbreviation, is_single_plot, is_envelope, recalculate_on_x_scale_change, should_cycle_length, parameters, lines, search_terms, show_only_abbreviation, ht_id, disabled_hover_values, paren_params_label, indicatorTooltipDto2, additional_sections);
    }

    public final IndicatorStateDto copy(String uuid, boolean minimized, boolean visible, Boolean is_minimized_managed_by_user, List<IndicatorValidationInfoDto> validation_info, String id, String title, String description, boolean overlaying, String categories, String abbreviation, Boolean is_single_plot, Boolean is_envelope, Boolean recalculate_on_x_scale_change, Boolean should_cycle_length, List<IndicatorParameterDto> parameters, List<IndicatorLineDto> lines, List<String> search_terms, Boolean show_only_abbreviation, Integer ht_id, Boolean disabled_hover_values, String paren_params_label, IndicatorTooltipDto tooltip, List<CustomIndicatorSectionDto> additional_sections) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(validation_info, "validation_info");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(search_terms, "search_terms");
        Intrinsics.checkNotNullParameter(additional_sections, "additional_sections");
        return new IndicatorStateDto(new Surrogate(uuid, minimized, visible, is_minimized_managed_by_user, validation_info, id, title, description, overlaying, categories, abbreviation, is_single_plot, is_envelope, recalculate_on_x_scale_change, should_cycle_length, parameters, lines, search_terms, show_only_abbreviation, ht_id, disabled_hover_values, paren_params_label, tooltip, additional_sections));
    }

    @Override // com.robinhood.idl.Dto
    public IndicatorState toProto() {
        String uuid = this.surrogate.getUuid();
        boolean minimized = this.surrogate.getMinimized();
        boolean visible = this.surrogate.getVisible();
        Boolean is_minimized_managed_by_user = this.surrogate.getIs_minimized_managed_by_user();
        List<IndicatorValidationInfoDto> validation_info = this.surrogate.getValidation_info();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(validation_info, 10));
        Iterator<T> it = validation_info.iterator();
        while (it.hasNext()) {
            arrayList.add(((IndicatorValidationInfoDto) it.next()).toProto());
        }
        String id = this.surrogate.getId();
        String title = this.surrogate.getTitle();
        String description = this.surrogate.getDescription();
        boolean overlaying = this.surrogate.getOverlaying();
        String categories = this.surrogate.getCategories();
        String abbreviation = this.surrogate.getAbbreviation();
        Boolean is_single_plot = this.surrogate.getIs_single_plot();
        Boolean is_envelope = this.surrogate.getIs_envelope();
        Boolean recalculate_on_x_scale_change = this.surrogate.getRecalculate_on_x_scale_change();
        Boolean should_cycle_length = this.surrogate.getShould_cycle_length();
        List<IndicatorParameterDto> parameters = this.surrogate.getParameters();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters, 10));
        Iterator<T> it2 = parameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((IndicatorParameterDto) it2.next()).toProto());
        }
        List<IndicatorLineDto> lines = this.surrogate.getLines();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(lines, 10));
        Iterator<T> it3 = lines.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((IndicatorLineDto) it3.next()).toProto());
        }
        List<String> search_terms = this.surrogate.getSearch_terms();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(search_terms, 10));
        Iterator<T> it4 = search_terms.iterator();
        while (it4.hasNext()) {
            arrayList4.add((String) it4.next());
        }
        Boolean show_only_abbreviation = this.surrogate.getShow_only_abbreviation();
        Integer ht_id = this.surrogate.getHt_id();
        Boolean disabled_hover_values = this.surrogate.getDisabled_hover_values();
        String paren_params_label = this.surrogate.getParen_params_label();
        IndicatorTooltipDto tooltip = this.surrogate.getTooltip();
        IndicatorTooltip proto = tooltip != null ? tooltip.toProto() : null;
        List<CustomIndicatorSectionDto> additional_sections = this.surrogate.getAdditional_sections();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(additional_sections, 10));
        Iterator<T> it5 = additional_sections.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((CustomIndicatorSectionDto) it5.next()).toProto());
        }
        return new IndicatorState(uuid, minimized, visible, is_minimized_managed_by_user, arrayList, id, title, description, overlaying, categories, abbreviation, is_single_plot, is_envelope, recalculate_on_x_scale_change, should_cycle_length, arrayList2, arrayList3, arrayList4, show_only_abbreviation, ht_id, disabled_hover_values, paren_params_label, proto, arrayList5, null, 16777216, null);
    }

    public String toString() {
        return "[IndicatorStateDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IndicatorStateDto) && Intrinsics.areEqual(((IndicatorStateDto) other).surrogate, this.surrogate);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IndicatorStateDto.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bF\b\u0083\b\u0018\u0000 u2\u00020\u0001:\u0002vuB¼\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0019\b\u0002\u0010\u001f\u001a\u0013\u0018\u00010\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\t0\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\b¢\u0006\u0004\b&\u0010'B£\u0002\b\u0010\u0012\u0006\u0010(\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\b\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\b\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u00106R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010@\u0012\u0004\bC\u0010?\u001a\u0004\bA\u0010BR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010@\u0012\u0004\bE\u0010?\u001a\u0004\bD\u0010BR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010F\u0012\u0004\bH\u0010?\u001a\u0004\b\u0007\u0010GR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010I\u0012\u0004\bL\u0010?\u001a\u0004\bJ\u0010KR \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\bN\u0010?\u001a\u0004\bM\u00106R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010<\u0012\u0004\bP\u0010?\u001a\u0004\bO\u00106R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\bR\u0010?\u001a\u0004\bQ\u00106R \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010@\u0012\u0004\bT\u0010?\u001a\u0004\bS\u0010BR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010<\u0012\u0004\bV\u0010?\u001a\u0004\bU\u00106R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010<\u0012\u0004\bX\u0010?\u001a\u0004\bW\u00106R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010F\u0012\u0004\bY\u0010?\u001a\u0004\b\u0011\u0010GR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010F\u0012\u0004\bZ\u0010?\u001a\u0004\b\u0012\u0010GR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010F\u0012\u0004\b\\\u0010?\u001a\u0004\b[\u0010GR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010F\u0012\u0004\b^\u0010?\u001a\u0004\b]\u0010GR&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010I\u0012\u0004\b`\u0010?\u001a\u0004\b_\u0010KR&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010I\u0012\u0004\bb\u0010?\u001a\u0004\ba\u0010KR&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010I\u0012\u0004\bd\u0010?\u001a\u0004\bc\u0010KR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010F\u0012\u0004\bf\u0010?\u001a\u0004\be\u0010GR1\u0010\u001f\u001a\u0013\u0018\u00010\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\t0\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010g\u0012\u0004\bj\u0010?\u001a\u0004\bh\u0010iR\"\u0010 \u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010F\u0012\u0004\bl\u0010?\u001a\u0004\bk\u0010GR\"\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010<\u0012\u0004\bn\u0010?\u001a\u0004\bm\u00106R\"\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010o\u0012\u0004\br\u0010?\u001a\u0004\bp\u0010qR&\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010I\u0012\u0004\bt\u0010?\u001a\u0004\bs\u0010K¨\u0006w"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto$Surrogate;", "", "", "uuid", "", "minimized", "visible", "is_minimized_managed_by_user", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorValidationInfoDto;", "validation_info", "id", "title", "description", "overlaying", "categories", "abbreviation", "is_single_plot", "is_envelope", "recalculate_on_x_scale_change", "should_cycle_length", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;", "parameters", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto;", "lines", "search_terms", "show_only_abbreviation", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "ht_id", "disabled_hover_values", "paren_params_label", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltipDto;", "tooltip", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CustomIndicatorSectionDto;", "additional_sections", "<init>", "(Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltipDto;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltipDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "getUuid$annotations", "()V", "Z", "getMinimized", "()Z", "getMinimized$annotations", "getVisible", "getVisible$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "is_minimized_managed_by_user$annotations", "Ljava/util/List;", "getValidation_info", "()Ljava/util/List;", "getValidation_info$annotations", "getId", "getId$annotations", "getTitle", "getTitle$annotations", "getDescription", "getDescription$annotations", "getOverlaying", "getOverlaying$annotations", "getCategories", "getCategories$annotations", "getAbbreviation", "getAbbreviation$annotations", "is_single_plot$annotations", "is_envelope$annotations", "getRecalculate_on_x_scale_change", "getRecalculate_on_x_scale_change$annotations", "getShould_cycle_length", "getShould_cycle_length$annotations", "getParameters", "getParameters$annotations", "getLines", "getLines$annotations", "getSearch_terms", "getSearch_terms$annotations", "getShow_only_abbreviation", "getShow_only_abbreviation$annotations", "Ljava/lang/Integer;", "getHt_id", "()Ljava/lang/Integer;", "getHt_id$annotations", "getDisabled_hover_values", "getDisabled_hover_values$annotations", "getParen_params_label", "getParen_params_label$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltipDto;", "getTooltip", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTooltipDto;", "getTooltip$annotations", "getAdditional_sections", "getAdditional_sections$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String abbreviation;
        private final List<CustomIndicatorSectionDto> additional_sections;
        private final String categories;
        private final String description;
        private final Boolean disabled_hover_values;
        private final Integer ht_id;
        private final String id;
        private final Boolean is_envelope;
        private final Boolean is_minimized_managed_by_user;
        private final Boolean is_single_plot;
        private final List<IndicatorLineDto> lines;
        private final boolean minimized;
        private final boolean overlaying;
        private final List<IndicatorParameterDto> parameters;
        private final String paren_params_label;
        private final Boolean recalculate_on_x_scale_change;
        private final List<String> search_terms;
        private final Boolean should_cycle_length;
        private final Boolean show_only_abbreviation;
        private final String title;
        private final IndicatorTooltipDto tooltip;
        private final String uuid;
        private final List<IndicatorValidationInfoDto> validation_info;
        private final boolean visible;

        public Surrogate() {
            this((String) null, false, false, (Boolean) null, (List) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (List) null, (List) null, (List) null, (Boolean) null, (Integer) null, (Boolean) null, (String) null, (IndicatorTooltipDto) null, (List) null, 16777215, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(IndicatorValidationInfoDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(IndicatorParameterDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(IndicatorLineDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
            return new ArrayListSerializer(CustomIndicatorSectionDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.uuid, surrogate.uuid) && this.minimized == surrogate.minimized && this.visible == surrogate.visible && Intrinsics.areEqual(this.is_minimized_managed_by_user, surrogate.is_minimized_managed_by_user) && Intrinsics.areEqual(this.validation_info, surrogate.validation_info) && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && this.overlaying == surrogate.overlaying && Intrinsics.areEqual(this.categories, surrogate.categories) && Intrinsics.areEqual(this.abbreviation, surrogate.abbreviation) && Intrinsics.areEqual(this.is_single_plot, surrogate.is_single_plot) && Intrinsics.areEqual(this.is_envelope, surrogate.is_envelope) && Intrinsics.areEqual(this.recalculate_on_x_scale_change, surrogate.recalculate_on_x_scale_change) && Intrinsics.areEqual(this.should_cycle_length, surrogate.should_cycle_length) && Intrinsics.areEqual(this.parameters, surrogate.parameters) && Intrinsics.areEqual(this.lines, surrogate.lines) && Intrinsics.areEqual(this.search_terms, surrogate.search_terms) && Intrinsics.areEqual(this.show_only_abbreviation, surrogate.show_only_abbreviation) && Intrinsics.areEqual(this.ht_id, surrogate.ht_id) && Intrinsics.areEqual(this.disabled_hover_values, surrogate.disabled_hover_values) && Intrinsics.areEqual(this.paren_params_label, surrogate.paren_params_label) && Intrinsics.areEqual(this.tooltip, surrogate.tooltip) && Intrinsics.areEqual(this.additional_sections, surrogate.additional_sections);
        }

        public int hashCode() {
            int iHashCode = ((((this.uuid.hashCode() * 31) + Boolean.hashCode(this.minimized)) * 31) + Boolean.hashCode(this.visible)) * 31;
            Boolean bool = this.is_minimized_managed_by_user;
            int iHashCode2 = (((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.validation_info.hashCode()) * 31) + this.id.hashCode()) * 31) + this.title.hashCode()) * 31;
            String str = this.description;
            int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.overlaying)) * 31) + this.categories.hashCode()) * 31;
            String str2 = this.abbreviation;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool2 = this.is_single_plot;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.is_envelope;
            int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.recalculate_on_x_scale_change;
            int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.should_cycle_length;
            int iHashCode8 = (((((((iHashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31) + this.parameters.hashCode()) * 31) + this.lines.hashCode()) * 31) + this.search_terms.hashCode()) * 31;
            Boolean bool6 = this.show_only_abbreviation;
            int iHashCode9 = (iHashCode8 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Integer num = this.ht_id;
            int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool7 = this.disabled_hover_values;
            int iHashCode11 = (iHashCode10 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            String str3 = this.paren_params_label;
            int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            IndicatorTooltipDto indicatorTooltipDto = this.tooltip;
            return ((iHashCode12 + (indicatorTooltipDto != null ? indicatorTooltipDto.hashCode() : 0)) * 31) + this.additional_sections.hashCode();
        }

        public String toString() {
            return "Surrogate(uuid=" + this.uuid + ", minimized=" + this.minimized + ", visible=" + this.visible + ", is_minimized_managed_by_user=" + this.is_minimized_managed_by_user + ", validation_info=" + this.validation_info + ", id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", overlaying=" + this.overlaying + ", categories=" + this.categories + ", abbreviation=" + this.abbreviation + ", is_single_plot=" + this.is_single_plot + ", is_envelope=" + this.is_envelope + ", recalculate_on_x_scale_change=" + this.recalculate_on_x_scale_change + ", should_cycle_length=" + this.should_cycle_length + ", parameters=" + this.parameters + ", lines=" + this.lines + ", search_terms=" + this.search_terms + ", show_only_abbreviation=" + this.show_only_abbreviation + ", ht_id=" + this.ht_id + ", disabled_hover_values=" + this.disabled_hover_values + ", paren_params_label=" + this.paren_params_label + ", tooltip=" + this.tooltip + ", additional_sections=" + this.additional_sections + ")";
        }

        /* compiled from: IndicatorStateDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IndicatorStateDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndicatorStateDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndicatorStateDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndicatorStateDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto$Surrogate$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndicatorStateDto.Surrogate._childSerializers$_anonymous_$2();
                }
            }), null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto$Surrogate$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndicatorStateDto.Surrogate._childSerializers$_anonymous_$3();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, String str, boolean z, boolean z2, Boolean bool, List list, String str2, String str3, String str4, boolean z3, String str5, String str6, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List list2, List list3, List list4, Boolean bool6, Integer num, Boolean bool7, String str7, IndicatorTooltipDto indicatorTooltipDto, List list5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.uuid = "";
            } else {
                this.uuid = str;
            }
            if ((i & 2) == 0) {
                this.minimized = false;
            } else {
                this.minimized = z;
            }
            if ((i & 4) == 0) {
                this.visible = false;
            } else {
                this.visible = z2;
            }
            if ((i & 8) == 0) {
                this.is_minimized_managed_by_user = null;
            } else {
                this.is_minimized_managed_by_user = bool;
            }
            if ((i & 16) == 0) {
                this.validation_info = CollectionsKt.emptyList();
            } else {
                this.validation_info = list;
            }
            if ((i & 32) == 0) {
                this.id = "";
            } else {
                this.id = str2;
            }
            if ((i & 64) == 0) {
                this.title = "";
            } else {
                this.title = str3;
            }
            if ((i & 128) == 0) {
                this.description = null;
            } else {
                this.description = str4;
            }
            if ((i & 256) == 0) {
                this.overlaying = false;
            } else {
                this.overlaying = z3;
            }
            if ((i & 512) == 0) {
                this.categories = "";
            } else {
                this.categories = str5;
            }
            if ((i & 1024) == 0) {
                this.abbreviation = null;
            } else {
                this.abbreviation = str6;
            }
            if ((i & 2048) == 0) {
                this.is_single_plot = null;
            } else {
                this.is_single_plot = bool2;
            }
            if ((i & 4096) == 0) {
                this.is_envelope = null;
            } else {
                this.is_envelope = bool3;
            }
            if ((i & 8192) == 0) {
                this.recalculate_on_x_scale_change = null;
            } else {
                this.recalculate_on_x_scale_change = bool4;
            }
            if ((i & 16384) == 0) {
                this.should_cycle_length = null;
            } else {
                this.should_cycle_length = bool5;
            }
            this.parameters = (32768 & i) == 0 ? CollectionsKt.emptyList() : list2;
            this.lines = (65536 & i) == 0 ? CollectionsKt.emptyList() : list3;
            this.search_terms = (131072 & i) == 0 ? CollectionsKt.emptyList() : list4;
            if ((262144 & i) == 0) {
                this.show_only_abbreviation = null;
            } else {
                this.show_only_abbreviation = bool6;
            }
            if ((524288 & i) == 0) {
                this.ht_id = null;
            } else {
                this.ht_id = num;
            }
            if ((1048576 & i) == 0) {
                this.disabled_hover_values = null;
            } else {
                this.disabled_hover_values = bool7;
            }
            if ((2097152 & i) == 0) {
                this.paren_params_label = null;
            } else {
                this.paren_params_label = str7;
            }
            if ((4194304 & i) == 0) {
                this.tooltip = null;
            } else {
                this.tooltip = indicatorTooltipDto;
            }
            this.additional_sections = (i & 8388608) == 0 ? CollectionsKt.emptyList() : list5;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.uuid, "")) {
                output.encodeStringElement(serialDesc, 0, self.uuid);
            }
            boolean z = self.minimized;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            boolean z2 = self.visible;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 2, z2);
            }
            Boolean bool = self.is_minimized_managed_by_user;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, bool);
            }
            if (!Intrinsics.areEqual(self.validation_info, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.validation_info);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 5, self.id);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 6, self.title);
            }
            String str = self.description;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str);
            }
            boolean z3 = self.overlaying;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 8, z3);
            }
            if (!Intrinsics.areEqual(self.categories, "")) {
                output.encodeStringElement(serialDesc, 9, self.categories);
            }
            String str2 = self.abbreviation;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, str2);
            }
            Boolean bool2 = self.is_single_plot;
            if (bool2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, BooleanSerializer.INSTANCE, bool2);
            }
            Boolean bool3 = self.is_envelope;
            if (bool3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, BooleanSerializer.INSTANCE, bool3);
            }
            Boolean bool4 = self.recalculate_on_x_scale_change;
            if (bool4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, BooleanSerializer.INSTANCE, bool4);
            }
            Boolean bool5 = self.should_cycle_length;
            if (bool5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, BooleanSerializer.INSTANCE, bool5);
            }
            if (!Intrinsics.areEqual(self.parameters, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 15, lazyArr[15].getValue(), self.parameters);
            }
            if (!Intrinsics.areEqual(self.lines, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 16, lazyArr[16].getValue(), self.lines);
            }
            if (!Intrinsics.areEqual(self.search_terms, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 17, lazyArr[17].getValue(), self.search_terms);
            }
            Boolean bool6 = self.show_only_abbreviation;
            if (bool6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, BooleanSerializer.INSTANCE, bool6);
            }
            Integer num = self.ht_id;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            Boolean bool7 = self.disabled_hover_values;
            if (bool7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, BooleanSerializer.INSTANCE, bool7);
            }
            String str3 = self.paren_params_label;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, StringSerializer.INSTANCE, str3);
            }
            IndicatorTooltipDto indicatorTooltipDto = self.tooltip;
            if (indicatorTooltipDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, IndicatorTooltipDto.Serializer.INSTANCE, indicatorTooltipDto);
            }
            if (Intrinsics.areEqual(self.additional_sections, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 23, lazyArr[23].getValue(), self.additional_sections);
        }

        public Surrogate(String uuid, boolean z, boolean z2, Boolean bool, List<IndicatorValidationInfoDto> validation_info, String id, String title, String str, boolean z3, String categories, String str2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List<IndicatorParameterDto> parameters, List<IndicatorLineDto> lines, List<String> search_terms, Boolean bool6, Integer num, Boolean bool7, String str3, IndicatorTooltipDto indicatorTooltipDto, List<CustomIndicatorSectionDto> additional_sections) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(validation_info, "validation_info");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(categories, "categories");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(lines, "lines");
            Intrinsics.checkNotNullParameter(search_terms, "search_terms");
            Intrinsics.checkNotNullParameter(additional_sections, "additional_sections");
            this.uuid = uuid;
            this.minimized = z;
            this.visible = z2;
            this.is_minimized_managed_by_user = bool;
            this.validation_info = validation_info;
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
            this.parameters = parameters;
            this.lines = lines;
            this.search_terms = search_terms;
            this.show_only_abbreviation = bool6;
            this.ht_id = num;
            this.disabled_hover_values = bool7;
            this.paren_params_label = str3;
            this.tooltip = indicatorTooltipDto;
            this.additional_sections = additional_sections;
        }

        public /* synthetic */ Surrogate(String str, boolean z, boolean z2, Boolean bool, List list, String str2, String str3, String str4, boolean z3, String str5, String str6, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List list2, List list3, List list4, Boolean bool6, Integer num, Boolean bool7, String str7, IndicatorTooltipDto indicatorTooltipDto, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? z3 : false, (i & 512) == 0 ? str5 : "", (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : bool4, (i & 16384) != 0 ? null : bool5, (i & 32768) != 0 ? CollectionsKt.emptyList() : list2, (i & 65536) != 0 ? CollectionsKt.emptyList() : list3, (i & 131072) != 0 ? CollectionsKt.emptyList() : list4, (i & 262144) != 0 ? null : bool6, (i & 524288) != 0 ? null : num, (i & 1048576) != 0 ? null : bool7, (i & 2097152) != 0 ? null : str7, (i & 4194304) != 0 ? null : indicatorTooltipDto, (i & 8388608) != 0 ? CollectionsKt.emptyList() : list5);
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

        public final List<IndicatorValidationInfoDto> getValidation_info() {
            return this.validation_info;
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

        public final List<IndicatorParameterDto> getParameters() {
            return this.parameters;
        }

        public final List<IndicatorLineDto> getLines() {
            return this.lines;
        }

        public final List<String> getSearch_terms() {
            return this.search_terms;
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

        public final IndicatorTooltipDto getTooltip() {
            return this.tooltip;
        }

        public final List<CustomIndicatorSectionDto> getAdditional_sections() {
            return this.additional_sections;
        }
    }

    /* compiled from: IndicatorStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IndicatorStateDto, IndicatorState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IndicatorStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndicatorStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndicatorStateDto> getBinaryBase64Serializer() {
            return (KSerializer) IndicatorStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IndicatorState> getProtoAdapter() {
            return IndicatorState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndicatorStateDto getZeroValue() {
            return IndicatorStateDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndicatorStateDto fromProto(IndicatorState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String uuid = proto.getUuid();
            boolean minimized = proto.getMinimized();
            boolean visible = proto.getVisible();
            Boolean boolIs_minimized_managed_by_user = proto.getIs_minimized_managed_by_user();
            List<IndicatorValidationInfo> validation_info = proto.getValidation_info();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(validation_info, 10));
            Iterator<T> it = validation_info.iterator();
            while (it.hasNext()) {
                arrayList.add(IndicatorValidationInfoDto.INSTANCE.fromProto((IndicatorValidationInfo) it.next()));
            }
            String id = proto.getId();
            String title = proto.getTitle();
            String description = proto.getDescription();
            boolean overlaying = proto.getOverlaying();
            String categories = proto.getCategories();
            String abbreviation = proto.getAbbreviation();
            Boolean boolIs_single_plot = proto.getIs_single_plot();
            Boolean boolIs_envelope = proto.getIs_envelope();
            Boolean recalculate_on_x_scale_change = proto.getRecalculate_on_x_scale_change();
            Boolean should_cycle_length = proto.getShould_cycle_length();
            List<IndicatorParameter> parameters = proto.getParameters();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters, 10));
            Iterator<T> it2 = parameters.iterator();
            while (it2.hasNext()) {
                arrayList2.add(IndicatorParameterDto.INSTANCE.fromProto((IndicatorParameter) it2.next()));
            }
            List<IndicatorLine> lines = proto.getLines();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(lines, 10));
            Iterator<T> it3 = lines.iterator();
            while (it3.hasNext()) {
                arrayList3.add(IndicatorLineDto.INSTANCE.fromProto((IndicatorLine) it3.next()));
            }
            List<String> search_terms = proto.getSearch_terms();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(search_terms, 10));
            Iterator<T> it4 = search_terms.iterator();
            while (it4.hasNext()) {
                arrayList4.add((String) it4.next());
            }
            Boolean show_only_abbreviation = proto.getShow_only_abbreviation();
            Integer ht_id = proto.getHt_id();
            Boolean disabled_hover_values = proto.getDisabled_hover_values();
            String paren_params_label = proto.getParen_params_label();
            IndicatorTooltip tooltip = proto.getTooltip();
            IndicatorTooltipDto indicatorTooltipDtoFromProto = tooltip != null ? IndicatorTooltipDto.INSTANCE.fromProto(tooltip) : null;
            List<CustomIndicatorSection> additional_sections = proto.getAdditional_sections();
            IndicatorTooltipDto indicatorTooltipDto = indicatorTooltipDtoFromProto;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(additional_sections, 10));
            for (Iterator it5 = additional_sections.iterator(); it5.hasNext(); it5 = it5) {
                arrayList5.add(CustomIndicatorSectionDto.INSTANCE.fromProto((CustomIndicatorSection) it5.next()));
            }
            return new IndicatorStateDto(new Surrogate(uuid, minimized, visible, boolIs_minimized_managed_by_user, arrayList, id, title, description, overlaying, categories, abbreviation, boolIs_single_plot, boolIs_envelope, recalculate_on_x_scale_change, should_cycle_length, arrayList2, arrayList3, arrayList4, show_only_abbreviation, ht_id, disabled_hover_values, paren_params_label, indicatorTooltipDto, arrayList5), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndicatorStateDto.binaryBase64Serializer_delegate$lambda$5();
            }
        });
        zeroValue = new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$5() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IndicatorStateDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IndicatorStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.IndicatorState", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IndicatorStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IndicatorStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IndicatorStateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IndicatorStateDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto";
        }
    }
}
