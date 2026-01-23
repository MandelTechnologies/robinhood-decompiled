package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import black_widow.contracts.mobile_app_chart.proto.p024v1.CancelOrderDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ColorPickerColorsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EditOrderEventDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.HapticDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.NotifyChartLoadedDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.NotifyFatalErrorDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OpenOptionsChainEventDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.PriceRowHiddenDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.PriceRowShownDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.RefreshAuthStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ReloadAppDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetActiveIndicatorTemplateIdDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetAddedIndicatorsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetAvailableTimeSpansDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartSettingsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorTemplatesDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIntervalDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIntervalsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetMobileAppChartInitializedDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetMobileAppChartReadyDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetQuoteDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetScrubModeDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetTimeSpanDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.StartEditOrderDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.StartSellPositionDragDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SubmitOrderEventDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.YAxisLongPressEventDto;
import com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo5;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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

/* compiled from: MobileBlackWidowChartMessageDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessage;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$Surrogate;)V", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", WebsocketGatewayConstants.DATA_KEY, "(Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;)V", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessage;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$Surrogate;", "getData", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Companion", "Surrogate", "DataDto", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class MobileBlackWidowChartMessageDto implements Dto3<MobileBlackWidowChartMessage>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MobileBlackWidowChartMessageDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MobileBlackWidowChartMessageDto, MobileBlackWidowChartMessage>> binaryBase64Serializer$delegate;
    private static final MobileBlackWidowChartMessageDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MobileBlackWidowChartMessageDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MobileBlackWidowChartMessageDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DataDto getData() {
        if (this.surrogate.getNotify_chart_loaded() != null) {
            return new DataDto.NotifyChartLoaded(this.surrogate.getNotify_chart_loaded());
        }
        if (this.surrogate.getSet_available_time_spans() != null) {
            return new DataDto.SetAvailableTimeSpans(this.surrogate.getSet_available_time_spans());
        }
        if (this.surrogate.getSet_time_span() != null) {
            return new DataDto.SetTimeSpan(this.surrogate.getSet_time_span());
        }
        if (this.surrogate.getSet_quote() != null) {
            return new DataDto.SetQuote(this.surrogate.getSet_quote());
        }
        if (this.surrogate.getSet_scrub_mode() != null) {
            return new DataDto.SetScrubMode(this.surrogate.getSet_scrub_mode());
        }
        if (this.surrogate.getSet_intervals() != null) {
            return new DataDto.SetIntervals(this.surrogate.getSet_intervals());
        }
        if (this.surrogate.getSet_chart_settings() != null) {
            return new DataDto.SetChartSettings(this.surrogate.getSet_chart_settings());
        }
        if (this.surrogate.getSet_interval() != null) {
            return new DataDto.SetInterval(this.surrogate.getSet_interval());
        }
        if (this.surrogate.getSet_mobile_app_chart_initialized() != null) {
            return new DataDto.SetMobileAppChartInitialized(this.surrogate.getSet_mobile_app_chart_initialized());
        }
        if (this.surrogate.getSet_mobile_app_chart_ready() != null) {
            return new DataDto.SetMobileAppChartReady(this.surrogate.getSet_mobile_app_chart_ready());
        }
        if (this.surrogate.getSet_indicators() != null) {
            return new DataDto.SetIndicators(this.surrogate.getSet_indicators());
        }
        if (this.surrogate.getSet_added_indicators() != null) {
            return new DataDto.SetAddedIndicators(this.surrogate.getSet_added_indicators());
        }
        if (this.surrogate.getSet_indicator_templates() != null) {
            return new DataDto.SetIndicatorTemplates(this.surrogate.getSet_indicator_templates());
        }
        if (this.surrogate.getRefresh_auth_state() != null) {
            return new DataDto.RefreshAuthState(this.surrogate.getRefresh_auth_state());
        }
        if (this.surrogate.getSet_color_picker_colors() != null) {
            return new DataDto.SetColorPickerColors(this.surrogate.getSet_color_picker_colors());
        }
        if (this.surrogate.getSet_active_indicator_template_id() != null) {
            return new DataDto.SetActiveIndicatorTemplateId(this.surrogate.getSet_active_indicator_template_id());
        }
        if (this.surrogate.getSubmit_order() != null) {
            return new DataDto.SubmitOrder(this.surrogate.getSubmit_order());
        }
        if (this.surrogate.getEdit_order() != null) {
            return new DataDto.EditOrder(this.surrogate.getEdit_order());
        }
        if (this.surrogate.getPrice_row_shown() != null) {
            return new DataDto.PriceRowShown(this.surrogate.getPrice_row_shown());
        }
        if (this.surrogate.getPrice_row_hidden() != null) {
            return new DataDto.PriceRowHidden(this.surrogate.getPrice_row_hidden());
        }
        if (this.surrogate.getStart_edit_order() != null) {
            return new DataDto.StartEditOrder(this.surrogate.getStart_edit_order());
        }
        if (this.surrogate.getY_axis_long_press_event() != null) {
            return new DataDto.YAxisLongPressEvent(this.surrogate.getY_axis_long_press_event());
        }
        if (this.surrogate.getNotify_fatal_error() != null) {
            return new DataDto.NotifyFatalError(this.surrogate.getNotify_fatal_error());
        }
        if (this.surrogate.getReload_app() != null) {
            return new DataDto.ReloadApp(this.surrogate.getReload_app());
        }
        if (this.surrogate.getOpen_options_chain_event() != null) {
            return new DataDto.OpenOptionsChainEvent(this.surrogate.getOpen_options_chain_event());
        }
        if (this.surrogate.getCancel_order() != null) {
            return new DataDto.CancelOrder(this.surrogate.getCancel_order());
        }
        if (this.surrogate.getPerform_haptic() != null) {
            return new DataDto.PerformHaptic(this.surrogate.getPerform_haptic());
        }
        if (this.surrogate.getStart_sell_position_drag() != null) {
            return new DataDto.StartSellPositionDrag(this.surrogate.getStart_sell_position_drag());
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public MobileBlackWidowChartMessageDto(black_widow.contracts.mobile_app_chart.proto.v1.MobileBlackWidowChartMessageDto.DataDto r32) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: black_widow.contracts.mobile_app_chart.proto.p024v1.MobileBlackWidowChartMessageDto.<init>(black_widow.contracts.mobile_app_chart.proto.v1.MobileBlackWidowChartMessageDto$DataDto):void");
    }

    public /* synthetic */ MobileBlackWidowChartMessageDto(DataDto dataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dataDto);
    }

    @Override // com.robinhood.idl.Dto
    public MobileBlackWidowChartMessage toProto() {
        NotifyChartLoadedDto notify_chart_loaded = this.surrogate.getNotify_chart_loaded();
        NotifyChartLoaded proto = notify_chart_loaded != null ? notify_chart_loaded.toProto() : null;
        SetAvailableTimeSpansDto set_available_time_spans = this.surrogate.getSet_available_time_spans();
        SetAvailableTimeSpans proto2 = set_available_time_spans != null ? set_available_time_spans.toProto() : null;
        SetTimeSpanDto set_time_span = this.surrogate.getSet_time_span();
        SetTimeSpan proto3 = set_time_span != null ? set_time_span.toProto() : null;
        SetQuoteDto set_quote = this.surrogate.getSet_quote();
        SetQuote proto4 = set_quote != null ? set_quote.toProto() : null;
        SetScrubModeDto set_scrub_mode = this.surrogate.getSet_scrub_mode();
        SetScrubMode proto5 = set_scrub_mode != null ? set_scrub_mode.toProto() : null;
        SetIntervalsDto set_intervals = this.surrogate.getSet_intervals();
        SetIntervals proto6 = set_intervals != null ? set_intervals.toProto() : null;
        SetChartSettingsDto set_chart_settings = this.surrogate.getSet_chart_settings();
        SetChartSettings proto7 = set_chart_settings != null ? set_chart_settings.toProto() : null;
        SetIntervalDto set_interval = this.surrogate.getSet_interval();
        SetInterval proto8 = set_interval != null ? set_interval.toProto() : null;
        SetMobileAppChartInitializedDto set_mobile_app_chart_initialized = this.surrogate.getSet_mobile_app_chart_initialized();
        SetMobileAppChartInitialized proto9 = set_mobile_app_chart_initialized != null ? set_mobile_app_chart_initialized.toProto() : null;
        SetMobileAppChartReadyDto set_mobile_app_chart_ready = this.surrogate.getSet_mobile_app_chart_ready();
        SetMobileAppChartReady proto10 = set_mobile_app_chart_ready != null ? set_mobile_app_chart_ready.toProto() : null;
        SetIndicatorsDto set_indicators = this.surrogate.getSet_indicators();
        SetIndicators proto11 = set_indicators != null ? set_indicators.toProto() : null;
        SetAddedIndicatorsDto set_added_indicators = this.surrogate.getSet_added_indicators();
        SetAddedIndicators proto12 = set_added_indicators != null ? set_added_indicators.toProto() : null;
        SetIndicatorTemplatesDto set_indicator_templates = this.surrogate.getSet_indicator_templates();
        SetIndicatorTemplates proto13 = set_indicator_templates != null ? set_indicator_templates.toProto() : null;
        RefreshAuthStateDto refresh_auth_state = this.surrogate.getRefresh_auth_state();
        RefreshAuthState proto14 = refresh_auth_state != null ? refresh_auth_state.toProto() : null;
        ColorPickerColorsDto set_color_picker_colors = this.surrogate.getSet_color_picker_colors();
        ColorPickerColors proto15 = set_color_picker_colors != null ? set_color_picker_colors.toProto() : null;
        SetActiveIndicatorTemplateIdDto set_active_indicator_template_id = this.surrogate.getSet_active_indicator_template_id();
        SetActiveIndicatorTemplateId proto16 = set_active_indicator_template_id != null ? set_active_indicator_template_id.toProto() : null;
        SubmitOrderEventDto submit_order = this.surrogate.getSubmit_order();
        SubmitOrderEvent proto17 = submit_order != null ? submit_order.toProto() : null;
        EditOrderEventDto edit_order = this.surrogate.getEdit_order();
        EditOrderEvent proto18 = edit_order != null ? edit_order.toProto() : null;
        PriceRowShownDto price_row_shown = this.surrogate.getPrice_row_shown();
        PriceRowShown proto19 = price_row_shown != null ? price_row_shown.toProto() : null;
        PriceRowHiddenDto price_row_hidden = this.surrogate.getPrice_row_hidden();
        PriceRowHidden proto20 = price_row_hidden != null ? price_row_hidden.toProto() : null;
        StartEditOrderDto start_edit_order = this.surrogate.getStart_edit_order();
        StartEditOrder proto21 = start_edit_order != null ? start_edit_order.toProto() : null;
        YAxisLongPressEventDto y_axis_long_press_event = this.surrogate.getY_axis_long_press_event();
        YAxisLongPressEvent proto22 = y_axis_long_press_event != null ? y_axis_long_press_event.toProto() : null;
        NotifyFatalErrorDto notify_fatal_error = this.surrogate.getNotify_fatal_error();
        NotifyFatalError proto23 = notify_fatal_error != null ? notify_fatal_error.toProto() : null;
        ReloadAppDto reload_app = this.surrogate.getReload_app();
        ReloadApp proto24 = reload_app != null ? reload_app.toProto() : null;
        OpenOptionsChainEventDto open_options_chain_event = this.surrogate.getOpen_options_chain_event();
        OpenOptionsChainEvent proto25 = open_options_chain_event != null ? open_options_chain_event.toProto() : null;
        CancelOrderDto cancel_order = this.surrogate.getCancel_order();
        CancelOrder proto26 = cancel_order != null ? cancel_order.toProto() : null;
        HapticDto perform_haptic = this.surrogate.getPerform_haptic();
        Haptic proto27 = perform_haptic != null ? perform_haptic.toProto() : null;
        StartSellPositionDragDto start_sell_position_drag = this.surrogate.getStart_sell_position_drag();
        return new MobileBlackWidowChartMessage(proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, proto16, proto17, proto18, proto19, proto20, proto21, proto22, proto23, proto24, proto25, proto26, proto27, start_sell_position_drag != null ? start_sell_position_drag.toProto() : null, null, 268435456, null);
    }

    public String toString() {
        return "[MobileBlackWidowChartMessageDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MobileBlackWidowChartMessageDto) && Intrinsics.areEqual(((MobileBlackWidowChartMessageDto) other).surrogate, this.surrogate);
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
    /* compiled from: MobileBlackWidowChartMessageDto.kt */
    @Metadata(m3635d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\bv\b\u0083\b\u0018\u0000 Ä\u00012\u00020\u0001:\u0004Å\u0001Ä\u0001B×\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;B³\u0002\b\u0010\u0012\u0006\u0010=\u001a\u00020<\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b:\u0010@J'\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010K\u001a\u00020JHÖ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020<HÖ\u0001¢\u0006\u0004\bM\u0010NJ\u001a\u0010Q\u001a\u00020P2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bQ\u0010RR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010S\u0012\u0004\bV\u0010W\u001a\u0004\bT\u0010UR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010X\u0012\u0004\b[\u0010W\u001a\u0004\bY\u0010ZR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\\\u0012\u0004\b_\u0010W\u001a\u0004\b]\u0010^R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010`\u0012\u0004\bc\u0010W\u001a\u0004\ba\u0010bR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010d\u0012\u0004\bg\u0010W\u001a\u0004\be\u0010fR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010h\u0012\u0004\bk\u0010W\u001a\u0004\bi\u0010jR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010l\u0012\u0004\bo\u0010W\u001a\u0004\bm\u0010nR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010p\u0012\u0004\bs\u0010W\u001a\u0004\bq\u0010rR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010t\u0012\u0004\bw\u0010W\u001a\u0004\bu\u0010vR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010x\u0012\u0004\b{\u0010W\u001a\u0004\by\u0010zR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010|\u0012\u0004\b\u007f\u0010W\u001a\u0004\b}\u0010~R&\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0019\u0010\u0080\u0001\u0012\u0005\b\u0083\u0001\u0010W\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001b\u0010\u0084\u0001\u0012\u0005\b\u0087\u0001\u0010W\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R&\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001d\u0010\u0088\u0001\u0012\u0005\b\u008b\u0001\u0010W\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R&\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001f\u0010\u008c\u0001\u0012\u0005\b\u008f\u0001\u0010W\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b!\u0010\u0090\u0001\u0012\u0005\b\u0093\u0001\u0010W\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R&\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b#\u0010\u0094\u0001\u0012\u0005\b\u0097\u0001\u0010W\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R&\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b%\u0010\u0098\u0001\u0012\u0005\b\u009b\u0001\u0010W\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b'\u0010\u009c\u0001\u0012\u0005\b\u009f\u0001\u0010W\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R&\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b)\u0010 \u0001\u0012\u0005\b£\u0001\u0010W\u001a\u0006\b¡\u0001\u0010¢\u0001R&\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b+\u0010¤\u0001\u0012\u0005\b§\u0001\u0010W\u001a\u0006\b¥\u0001\u0010¦\u0001R&\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b-\u0010¨\u0001\u0012\u0005\b«\u0001\u0010W\u001a\u0006\b©\u0001\u0010ª\u0001R&\u0010/\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b/\u0010¬\u0001\u0012\u0005\b¯\u0001\u0010W\u001a\u0006\b\u00ad\u0001\u0010®\u0001R&\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b1\u0010°\u0001\u0012\u0005\b³\u0001\u0010W\u001a\u0006\b±\u0001\u0010²\u0001R&\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b3\u0010´\u0001\u0012\u0005\b·\u0001\u0010W\u001a\u0006\bµ\u0001\u0010¶\u0001R&\u00105\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b5\u0010¸\u0001\u0012\u0005\b»\u0001\u0010W\u001a\u0006\b¹\u0001\u0010º\u0001R&\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b7\u0010¼\u0001\u0012\u0005\b¿\u0001\u0010W\u001a\u0006\b½\u0001\u0010¾\u0001R&\u00109\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b9\u0010À\u0001\u0012\u0005\bÃ\u0001\u0010W\u001a\u0006\bÁ\u0001\u0010Â\u0001¨\u0006Æ\u0001"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$Surrogate;", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoadedDto;", "notify_chart_loaded", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpansDto;", "set_available_time_spans", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpanDto;", "set_time_span", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuoteDto;", "set_quote", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubModeDto;", "set_scrub_mode", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalsDto;", "set_intervals", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;", "set_chart_settings", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalDto;", "set_interval", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitializedDto;", "set_mobile_app_chart_initialized", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReadyDto;", "set_mobile_app_chart_ready", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;", "set_indicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicatorsDto;", "set_added_indicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplatesDto;", "set_indicator_templates", "Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthStateDto;", "refresh_auth_state", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColorsDto;", "set_color_picker_colors", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateIdDto;", "set_active_indicator_template_id", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEventDto;", "submit_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEventDto;", "edit_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShownDto;", "price_row_shown", "Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHiddenDto;", "price_row_hidden", "Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrderDto;", "start_edit_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEventDto;", "y_axis_long_press_event", "Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalErrorDto;", "notify_fatal_error", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadAppDto;", "reload_app", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEventDto;", "open_options_chain_event", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrderDto;", "cancel_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;", "perform_haptic", "Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDragDto;", "start_sell_position_drag", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoadedDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpansDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpanDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuoteDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubModeDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalsDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitializedDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReadyDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicatorsDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplatesDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthStateDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColorsDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateIdDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEventDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEventDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShownDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHiddenDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrderDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEventDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalErrorDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadAppDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEventDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrderDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDragDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoadedDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpansDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpanDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuoteDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubModeDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalsDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitializedDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReadyDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicatorsDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplatesDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthStateDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColorsDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateIdDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEventDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEventDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShownDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHiddenDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrderDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEventDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalErrorDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadAppDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEventDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrderDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDragDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoadedDto;", "getNotify_chart_loaded", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoadedDto;", "getNotify_chart_loaded$annotations", "()V", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpansDto;", "getSet_available_time_spans", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpansDto;", "getSet_available_time_spans$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpanDto;", "getSet_time_span", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpanDto;", "getSet_time_span$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuoteDto;", "getSet_quote", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuoteDto;", "getSet_quote$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubModeDto;", "getSet_scrub_mode", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubModeDto;", "getSet_scrub_mode$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalsDto;", "getSet_intervals", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalsDto;", "getSet_intervals$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;", "getSet_chart_settings", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;", "getSet_chart_settings$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalDto;", "getSet_interval", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalDto;", "getSet_interval$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitializedDto;", "getSet_mobile_app_chart_initialized", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitializedDto;", "getSet_mobile_app_chart_initialized$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReadyDto;", "getSet_mobile_app_chart_ready", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReadyDto;", "getSet_mobile_app_chart_ready$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;", "getSet_indicators", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;", "getSet_indicators$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicatorsDto;", "getSet_added_indicators", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicatorsDto;", "getSet_added_indicators$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplatesDto;", "getSet_indicator_templates", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplatesDto;", "getSet_indicator_templates$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthStateDto;", "getRefresh_auth_state", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthStateDto;", "getRefresh_auth_state$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColorsDto;", "getSet_color_picker_colors", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColorsDto;", "getSet_color_picker_colors$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateIdDto;", "getSet_active_indicator_template_id", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateIdDto;", "getSet_active_indicator_template_id$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEventDto;", "getSubmit_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEventDto;", "getSubmit_order$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEventDto;", "getEdit_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEventDto;", "getEdit_order$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShownDto;", "getPrice_row_shown", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShownDto;", "getPrice_row_shown$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHiddenDto;", "getPrice_row_hidden", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHiddenDto;", "getPrice_row_hidden$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrderDto;", "getStart_edit_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrderDto;", "getStart_edit_order$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEventDto;", "getY_axis_long_press_event", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEventDto;", "getY_axis_long_press_event$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalErrorDto;", "getNotify_fatal_error", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalErrorDto;", "getNotify_fatal_error$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadAppDto;", "getReload_app", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadAppDto;", "getReload_app$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEventDto;", "getOpen_options_chain_event", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEventDto;", "getOpen_options_chain_event$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrderDto;", "getCancel_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrderDto;", "getCancel_order$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;", "getPerform_haptic", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;", "getPerform_haptic$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDragDto;", "getStart_sell_position_drag", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDragDto;", "getStart_sell_position_drag$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CancelOrderDto cancel_order;
        private final EditOrderEventDto edit_order;
        private final NotifyChartLoadedDto notify_chart_loaded;
        private final NotifyFatalErrorDto notify_fatal_error;
        private final OpenOptionsChainEventDto open_options_chain_event;
        private final HapticDto perform_haptic;
        private final PriceRowHiddenDto price_row_hidden;
        private final PriceRowShownDto price_row_shown;
        private final RefreshAuthStateDto refresh_auth_state;
        private final ReloadAppDto reload_app;
        private final SetActiveIndicatorTemplateIdDto set_active_indicator_template_id;
        private final SetAddedIndicatorsDto set_added_indicators;
        private final SetAvailableTimeSpansDto set_available_time_spans;
        private final SetChartSettingsDto set_chart_settings;
        private final ColorPickerColorsDto set_color_picker_colors;
        private final SetIndicatorTemplatesDto set_indicator_templates;
        private final SetIndicatorsDto set_indicators;
        private final SetIntervalDto set_interval;
        private final SetIntervalsDto set_intervals;
        private final SetMobileAppChartInitializedDto set_mobile_app_chart_initialized;
        private final SetMobileAppChartReadyDto set_mobile_app_chart_ready;
        private final SetQuoteDto set_quote;
        private final SetScrubModeDto set_scrub_mode;
        private final SetTimeSpanDto set_time_span;
        private final StartEditOrderDto start_edit_order;
        private final StartSellPositionDragDto start_sell_position_drag;
        private final SubmitOrderEventDto submit_order;
        private final YAxisLongPressEventDto y_axis_long_press_event;

        public Surrogate() {
            this((NotifyChartLoadedDto) null, (SetAvailableTimeSpansDto) null, (SetTimeSpanDto) null, (SetQuoteDto) null, (SetScrubModeDto) null, (SetIntervalsDto) null, (SetChartSettingsDto) null, (SetIntervalDto) null, (SetMobileAppChartInitializedDto) null, (SetMobileAppChartReadyDto) null, (SetIndicatorsDto) null, (SetAddedIndicatorsDto) null, (SetIndicatorTemplatesDto) null, (RefreshAuthStateDto) null, (ColorPickerColorsDto) null, (SetActiveIndicatorTemplateIdDto) null, (SubmitOrderEventDto) null, (EditOrderEventDto) null, (PriceRowShownDto) null, (PriceRowHiddenDto) null, (StartEditOrderDto) null, (YAxisLongPressEventDto) null, (NotifyFatalErrorDto) null, (ReloadAppDto) null, (OpenOptionsChainEventDto) null, (CancelOrderDto) null, (HapticDto) null, (StartSellPositionDragDto) null, 268435455, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.notify_chart_loaded, surrogate.notify_chart_loaded) && Intrinsics.areEqual(this.set_available_time_spans, surrogate.set_available_time_spans) && Intrinsics.areEqual(this.set_time_span, surrogate.set_time_span) && Intrinsics.areEqual(this.set_quote, surrogate.set_quote) && Intrinsics.areEqual(this.set_scrub_mode, surrogate.set_scrub_mode) && Intrinsics.areEqual(this.set_intervals, surrogate.set_intervals) && Intrinsics.areEqual(this.set_chart_settings, surrogate.set_chart_settings) && Intrinsics.areEqual(this.set_interval, surrogate.set_interval) && Intrinsics.areEqual(this.set_mobile_app_chart_initialized, surrogate.set_mobile_app_chart_initialized) && Intrinsics.areEqual(this.set_mobile_app_chart_ready, surrogate.set_mobile_app_chart_ready) && Intrinsics.areEqual(this.set_indicators, surrogate.set_indicators) && Intrinsics.areEqual(this.set_added_indicators, surrogate.set_added_indicators) && Intrinsics.areEqual(this.set_indicator_templates, surrogate.set_indicator_templates) && Intrinsics.areEqual(this.refresh_auth_state, surrogate.refresh_auth_state) && Intrinsics.areEqual(this.set_color_picker_colors, surrogate.set_color_picker_colors) && Intrinsics.areEqual(this.set_active_indicator_template_id, surrogate.set_active_indicator_template_id) && Intrinsics.areEqual(this.submit_order, surrogate.submit_order) && Intrinsics.areEqual(this.edit_order, surrogate.edit_order) && Intrinsics.areEqual(this.price_row_shown, surrogate.price_row_shown) && Intrinsics.areEqual(this.price_row_hidden, surrogate.price_row_hidden) && Intrinsics.areEqual(this.start_edit_order, surrogate.start_edit_order) && Intrinsics.areEqual(this.y_axis_long_press_event, surrogate.y_axis_long_press_event) && Intrinsics.areEqual(this.notify_fatal_error, surrogate.notify_fatal_error) && Intrinsics.areEqual(this.reload_app, surrogate.reload_app) && Intrinsics.areEqual(this.open_options_chain_event, surrogate.open_options_chain_event) && Intrinsics.areEqual(this.cancel_order, surrogate.cancel_order) && Intrinsics.areEqual(this.perform_haptic, surrogate.perform_haptic) && Intrinsics.areEqual(this.start_sell_position_drag, surrogate.start_sell_position_drag);
        }

        public int hashCode() {
            NotifyChartLoadedDto notifyChartLoadedDto = this.notify_chart_loaded;
            int iHashCode = (notifyChartLoadedDto == null ? 0 : notifyChartLoadedDto.hashCode()) * 31;
            SetAvailableTimeSpansDto setAvailableTimeSpansDto = this.set_available_time_spans;
            int iHashCode2 = (iHashCode + (setAvailableTimeSpansDto == null ? 0 : setAvailableTimeSpansDto.hashCode())) * 31;
            SetTimeSpanDto setTimeSpanDto = this.set_time_span;
            int iHashCode3 = (iHashCode2 + (setTimeSpanDto == null ? 0 : setTimeSpanDto.hashCode())) * 31;
            SetQuoteDto setQuoteDto = this.set_quote;
            int iHashCode4 = (iHashCode3 + (setQuoteDto == null ? 0 : setQuoteDto.hashCode())) * 31;
            SetScrubModeDto setScrubModeDto = this.set_scrub_mode;
            int iHashCode5 = (iHashCode4 + (setScrubModeDto == null ? 0 : setScrubModeDto.hashCode())) * 31;
            SetIntervalsDto setIntervalsDto = this.set_intervals;
            int iHashCode6 = (iHashCode5 + (setIntervalsDto == null ? 0 : setIntervalsDto.hashCode())) * 31;
            SetChartSettingsDto setChartSettingsDto = this.set_chart_settings;
            int iHashCode7 = (iHashCode6 + (setChartSettingsDto == null ? 0 : setChartSettingsDto.hashCode())) * 31;
            SetIntervalDto setIntervalDto = this.set_interval;
            int iHashCode8 = (iHashCode7 + (setIntervalDto == null ? 0 : setIntervalDto.hashCode())) * 31;
            SetMobileAppChartInitializedDto setMobileAppChartInitializedDto = this.set_mobile_app_chart_initialized;
            int iHashCode9 = (iHashCode8 + (setMobileAppChartInitializedDto == null ? 0 : setMobileAppChartInitializedDto.hashCode())) * 31;
            SetMobileAppChartReadyDto setMobileAppChartReadyDto = this.set_mobile_app_chart_ready;
            int iHashCode10 = (iHashCode9 + (setMobileAppChartReadyDto == null ? 0 : setMobileAppChartReadyDto.hashCode())) * 31;
            SetIndicatorsDto setIndicatorsDto = this.set_indicators;
            int iHashCode11 = (iHashCode10 + (setIndicatorsDto == null ? 0 : setIndicatorsDto.hashCode())) * 31;
            SetAddedIndicatorsDto setAddedIndicatorsDto = this.set_added_indicators;
            int iHashCode12 = (iHashCode11 + (setAddedIndicatorsDto == null ? 0 : setAddedIndicatorsDto.hashCode())) * 31;
            SetIndicatorTemplatesDto setIndicatorTemplatesDto = this.set_indicator_templates;
            int iHashCode13 = (iHashCode12 + (setIndicatorTemplatesDto == null ? 0 : setIndicatorTemplatesDto.hashCode())) * 31;
            RefreshAuthStateDto refreshAuthStateDto = this.refresh_auth_state;
            int iHashCode14 = (iHashCode13 + (refreshAuthStateDto == null ? 0 : refreshAuthStateDto.hashCode())) * 31;
            ColorPickerColorsDto colorPickerColorsDto = this.set_color_picker_colors;
            int iHashCode15 = (iHashCode14 + (colorPickerColorsDto == null ? 0 : colorPickerColorsDto.hashCode())) * 31;
            SetActiveIndicatorTemplateIdDto setActiveIndicatorTemplateIdDto = this.set_active_indicator_template_id;
            int iHashCode16 = (iHashCode15 + (setActiveIndicatorTemplateIdDto == null ? 0 : setActiveIndicatorTemplateIdDto.hashCode())) * 31;
            SubmitOrderEventDto submitOrderEventDto = this.submit_order;
            int iHashCode17 = (iHashCode16 + (submitOrderEventDto == null ? 0 : submitOrderEventDto.hashCode())) * 31;
            EditOrderEventDto editOrderEventDto = this.edit_order;
            int iHashCode18 = (iHashCode17 + (editOrderEventDto == null ? 0 : editOrderEventDto.hashCode())) * 31;
            PriceRowShownDto priceRowShownDto = this.price_row_shown;
            int iHashCode19 = (iHashCode18 + (priceRowShownDto == null ? 0 : priceRowShownDto.hashCode())) * 31;
            PriceRowHiddenDto priceRowHiddenDto = this.price_row_hidden;
            int iHashCode20 = (iHashCode19 + (priceRowHiddenDto == null ? 0 : priceRowHiddenDto.hashCode())) * 31;
            StartEditOrderDto startEditOrderDto = this.start_edit_order;
            int iHashCode21 = (iHashCode20 + (startEditOrderDto == null ? 0 : startEditOrderDto.hashCode())) * 31;
            YAxisLongPressEventDto yAxisLongPressEventDto = this.y_axis_long_press_event;
            int iHashCode22 = (iHashCode21 + (yAxisLongPressEventDto == null ? 0 : yAxisLongPressEventDto.hashCode())) * 31;
            NotifyFatalErrorDto notifyFatalErrorDto = this.notify_fatal_error;
            int iHashCode23 = (iHashCode22 + (notifyFatalErrorDto == null ? 0 : notifyFatalErrorDto.hashCode())) * 31;
            ReloadAppDto reloadAppDto = this.reload_app;
            int iHashCode24 = (iHashCode23 + (reloadAppDto == null ? 0 : reloadAppDto.hashCode())) * 31;
            OpenOptionsChainEventDto openOptionsChainEventDto = this.open_options_chain_event;
            int iHashCode25 = (iHashCode24 + (openOptionsChainEventDto == null ? 0 : openOptionsChainEventDto.hashCode())) * 31;
            CancelOrderDto cancelOrderDto = this.cancel_order;
            int iHashCode26 = (iHashCode25 + (cancelOrderDto == null ? 0 : cancelOrderDto.hashCode())) * 31;
            HapticDto hapticDto = this.perform_haptic;
            int iHashCode27 = (iHashCode26 + (hapticDto == null ? 0 : hapticDto.hashCode())) * 31;
            StartSellPositionDragDto startSellPositionDragDto = this.start_sell_position_drag;
            return iHashCode27 + (startSellPositionDragDto != null ? startSellPositionDragDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(notify_chart_loaded=" + this.notify_chart_loaded + ", set_available_time_spans=" + this.set_available_time_spans + ", set_time_span=" + this.set_time_span + ", set_quote=" + this.set_quote + ", set_scrub_mode=" + this.set_scrub_mode + ", set_intervals=" + this.set_intervals + ", set_chart_settings=" + this.set_chart_settings + ", set_interval=" + this.set_interval + ", set_mobile_app_chart_initialized=" + this.set_mobile_app_chart_initialized + ", set_mobile_app_chart_ready=" + this.set_mobile_app_chart_ready + ", set_indicators=" + this.set_indicators + ", set_added_indicators=" + this.set_added_indicators + ", set_indicator_templates=" + this.set_indicator_templates + ", refresh_auth_state=" + this.refresh_auth_state + ", set_color_picker_colors=" + this.set_color_picker_colors + ", set_active_indicator_template_id=" + this.set_active_indicator_template_id + ", submit_order=" + this.submit_order + ", edit_order=" + this.edit_order + ", price_row_shown=" + this.price_row_shown + ", price_row_hidden=" + this.price_row_hidden + ", start_edit_order=" + this.start_edit_order + ", y_axis_long_press_event=" + this.y_axis_long_press_event + ", notify_fatal_error=" + this.notify_fatal_error + ", reload_app=" + this.reload_app + ", open_options_chain_event=" + this.open_options_chain_event + ", cancel_order=" + this.cancel_order + ", perform_haptic=" + this.perform_haptic + ", start_sell_position_drag=" + this.start_sell_position_drag + ")";
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MobileBlackWidowChartMessageDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, NotifyChartLoadedDto notifyChartLoadedDto, SetAvailableTimeSpansDto setAvailableTimeSpansDto, SetTimeSpanDto setTimeSpanDto, SetQuoteDto setQuoteDto, SetScrubModeDto setScrubModeDto, SetIntervalsDto setIntervalsDto, SetChartSettingsDto setChartSettingsDto, SetIntervalDto setIntervalDto, SetMobileAppChartInitializedDto setMobileAppChartInitializedDto, SetMobileAppChartReadyDto setMobileAppChartReadyDto, SetIndicatorsDto setIndicatorsDto, SetAddedIndicatorsDto setAddedIndicatorsDto, SetIndicatorTemplatesDto setIndicatorTemplatesDto, RefreshAuthStateDto refreshAuthStateDto, ColorPickerColorsDto colorPickerColorsDto, SetActiveIndicatorTemplateIdDto setActiveIndicatorTemplateIdDto, SubmitOrderEventDto submitOrderEventDto, EditOrderEventDto editOrderEventDto, PriceRowShownDto priceRowShownDto, PriceRowHiddenDto priceRowHiddenDto, StartEditOrderDto startEditOrderDto, YAxisLongPressEventDto yAxisLongPressEventDto, NotifyFatalErrorDto notifyFatalErrorDto, ReloadAppDto reloadAppDto, OpenOptionsChainEventDto openOptionsChainEventDto, CancelOrderDto cancelOrderDto, HapticDto hapticDto, StartSellPositionDragDto startSellPositionDragDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.notify_chart_loaded = null;
            } else {
                this.notify_chart_loaded = notifyChartLoadedDto;
            }
            if ((i & 2) == 0) {
                this.set_available_time_spans = null;
            } else {
                this.set_available_time_spans = setAvailableTimeSpansDto;
            }
            if ((i & 4) == 0) {
                this.set_time_span = null;
            } else {
                this.set_time_span = setTimeSpanDto;
            }
            if ((i & 8) == 0) {
                this.set_quote = null;
            } else {
                this.set_quote = setQuoteDto;
            }
            if ((i & 16) == 0) {
                this.set_scrub_mode = null;
            } else {
                this.set_scrub_mode = setScrubModeDto;
            }
            if ((i & 32) == 0) {
                this.set_intervals = null;
            } else {
                this.set_intervals = setIntervalsDto;
            }
            if ((i & 64) == 0) {
                this.set_chart_settings = null;
            } else {
                this.set_chart_settings = setChartSettingsDto;
            }
            if ((i & 128) == 0) {
                this.set_interval = null;
            } else {
                this.set_interval = setIntervalDto;
            }
            if ((i & 256) == 0) {
                this.set_mobile_app_chart_initialized = null;
            } else {
                this.set_mobile_app_chart_initialized = setMobileAppChartInitializedDto;
            }
            if ((i & 512) == 0) {
                this.set_mobile_app_chart_ready = null;
            } else {
                this.set_mobile_app_chart_ready = setMobileAppChartReadyDto;
            }
            if ((i & 1024) == 0) {
                this.set_indicators = null;
            } else {
                this.set_indicators = setIndicatorsDto;
            }
            if ((i & 2048) == 0) {
                this.set_added_indicators = null;
            } else {
                this.set_added_indicators = setAddedIndicatorsDto;
            }
            if ((i & 4096) == 0) {
                this.set_indicator_templates = null;
            } else {
                this.set_indicator_templates = setIndicatorTemplatesDto;
            }
            if ((i & 8192) == 0) {
                this.refresh_auth_state = null;
            } else {
                this.refresh_auth_state = refreshAuthStateDto;
            }
            if ((i & 16384) == 0) {
                this.set_color_picker_colors = null;
            } else {
                this.set_color_picker_colors = colorPickerColorsDto;
            }
            if ((32768 & i) == 0) {
                this.set_active_indicator_template_id = null;
            } else {
                this.set_active_indicator_template_id = setActiveIndicatorTemplateIdDto;
            }
            if ((65536 & i) == 0) {
                this.submit_order = null;
            } else {
                this.submit_order = submitOrderEventDto;
            }
            if ((131072 & i) == 0) {
                this.edit_order = null;
            } else {
                this.edit_order = editOrderEventDto;
            }
            if ((262144 & i) == 0) {
                this.price_row_shown = null;
            } else {
                this.price_row_shown = priceRowShownDto;
            }
            if ((524288 & i) == 0) {
                this.price_row_hidden = null;
            } else {
                this.price_row_hidden = priceRowHiddenDto;
            }
            if ((1048576 & i) == 0) {
                this.start_edit_order = null;
            } else {
                this.start_edit_order = startEditOrderDto;
            }
            if ((2097152 & i) == 0) {
                this.y_axis_long_press_event = null;
            } else {
                this.y_axis_long_press_event = yAxisLongPressEventDto;
            }
            if ((4194304 & i) == 0) {
                this.notify_fatal_error = null;
            } else {
                this.notify_fatal_error = notifyFatalErrorDto;
            }
            if ((8388608 & i) == 0) {
                this.reload_app = null;
            } else {
                this.reload_app = reloadAppDto;
            }
            if ((16777216 & i) == 0) {
                this.open_options_chain_event = null;
            } else {
                this.open_options_chain_event = openOptionsChainEventDto;
            }
            if ((33554432 & i) == 0) {
                this.cancel_order = null;
            } else {
                this.cancel_order = cancelOrderDto;
            }
            if ((67108864 & i) == 0) {
                this.perform_haptic = null;
            } else {
                this.perform_haptic = hapticDto;
            }
            if ((i & 134217728) == 0) {
                this.start_sell_position_drag = null;
            } else {
                this.start_sell_position_drag = startSellPositionDragDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            NotifyChartLoadedDto notifyChartLoadedDto = self.notify_chart_loaded;
            if (notifyChartLoadedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, NotifyChartLoadedDto.Serializer.INSTANCE, notifyChartLoadedDto);
            }
            SetAvailableTimeSpansDto setAvailableTimeSpansDto = self.set_available_time_spans;
            if (setAvailableTimeSpansDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, SetAvailableTimeSpansDto.Serializer.INSTANCE, setAvailableTimeSpansDto);
            }
            SetTimeSpanDto setTimeSpanDto = self.set_time_span;
            if (setTimeSpanDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, SetTimeSpanDto.Serializer.INSTANCE, setTimeSpanDto);
            }
            SetQuoteDto setQuoteDto = self.set_quote;
            if (setQuoteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SetQuoteDto.Serializer.INSTANCE, setQuoteDto);
            }
            SetScrubModeDto setScrubModeDto = self.set_scrub_mode;
            if (setScrubModeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, SetScrubModeDto.Serializer.INSTANCE, setScrubModeDto);
            }
            SetIntervalsDto setIntervalsDto = self.set_intervals;
            if (setIntervalsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, SetIntervalsDto.Serializer.INSTANCE, setIntervalsDto);
            }
            SetChartSettingsDto setChartSettingsDto = self.set_chart_settings;
            if (setChartSettingsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, SetChartSettingsDto.Serializer.INSTANCE, setChartSettingsDto);
            }
            SetIntervalDto setIntervalDto = self.set_interval;
            if (setIntervalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, SetIntervalDto.Serializer.INSTANCE, setIntervalDto);
            }
            SetMobileAppChartInitializedDto setMobileAppChartInitializedDto = self.set_mobile_app_chart_initialized;
            if (setMobileAppChartInitializedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, SetMobileAppChartInitializedDto.Serializer.INSTANCE, setMobileAppChartInitializedDto);
            }
            SetMobileAppChartReadyDto setMobileAppChartReadyDto = self.set_mobile_app_chart_ready;
            if (setMobileAppChartReadyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, SetMobileAppChartReadyDto.Serializer.INSTANCE, setMobileAppChartReadyDto);
            }
            SetIndicatorsDto setIndicatorsDto = self.set_indicators;
            if (setIndicatorsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, SetIndicatorsDto.Serializer.INSTANCE, setIndicatorsDto);
            }
            SetAddedIndicatorsDto setAddedIndicatorsDto = self.set_added_indicators;
            if (setAddedIndicatorsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, SetAddedIndicatorsDto.Serializer.INSTANCE, setAddedIndicatorsDto);
            }
            SetIndicatorTemplatesDto setIndicatorTemplatesDto = self.set_indicator_templates;
            if (setIndicatorTemplatesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, SetIndicatorTemplatesDto.Serializer.INSTANCE, setIndicatorTemplatesDto);
            }
            RefreshAuthStateDto refreshAuthStateDto = self.refresh_auth_state;
            if (refreshAuthStateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, RefreshAuthStateDto.Serializer.INSTANCE, refreshAuthStateDto);
            }
            ColorPickerColorsDto colorPickerColorsDto = self.set_color_picker_colors;
            if (colorPickerColorsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, ColorPickerColorsDto.Serializer.INSTANCE, colorPickerColorsDto);
            }
            SetActiveIndicatorTemplateIdDto setActiveIndicatorTemplateIdDto = self.set_active_indicator_template_id;
            if (setActiveIndicatorTemplateIdDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, SetActiveIndicatorTemplateIdDto.Serializer.INSTANCE, setActiveIndicatorTemplateIdDto);
            }
            SubmitOrderEventDto submitOrderEventDto = self.submit_order;
            if (submitOrderEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, SubmitOrderEventDto.Serializer.INSTANCE, submitOrderEventDto);
            }
            EditOrderEventDto editOrderEventDto = self.edit_order;
            if (editOrderEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, EditOrderEventDto.Serializer.INSTANCE, editOrderEventDto);
            }
            PriceRowShownDto priceRowShownDto = self.price_row_shown;
            if (priceRowShownDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, PriceRowShownDto.Serializer.INSTANCE, priceRowShownDto);
            }
            PriceRowHiddenDto priceRowHiddenDto = self.price_row_hidden;
            if (priceRowHiddenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, PriceRowHiddenDto.Serializer.INSTANCE, priceRowHiddenDto);
            }
            StartEditOrderDto startEditOrderDto = self.start_edit_order;
            if (startEditOrderDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, StartEditOrderDto.Serializer.INSTANCE, startEditOrderDto);
            }
            YAxisLongPressEventDto yAxisLongPressEventDto = self.y_axis_long_press_event;
            if (yAxisLongPressEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, YAxisLongPressEventDto.Serializer.INSTANCE, yAxisLongPressEventDto);
            }
            NotifyFatalErrorDto notifyFatalErrorDto = self.notify_fatal_error;
            if (notifyFatalErrorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, NotifyFatalErrorDto.Serializer.INSTANCE, notifyFatalErrorDto);
            }
            ReloadAppDto reloadAppDto = self.reload_app;
            if (reloadAppDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, ReloadAppDto.Serializer.INSTANCE, reloadAppDto);
            }
            OpenOptionsChainEventDto openOptionsChainEventDto = self.open_options_chain_event;
            if (openOptionsChainEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, OpenOptionsChainEventDto.Serializer.INSTANCE, openOptionsChainEventDto);
            }
            CancelOrderDto cancelOrderDto = self.cancel_order;
            if (cancelOrderDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, CancelOrderDto.Serializer.INSTANCE, cancelOrderDto);
            }
            HapticDto hapticDto = self.perform_haptic;
            if (hapticDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, HapticDto.Serializer.INSTANCE, hapticDto);
            }
            StartSellPositionDragDto startSellPositionDragDto = self.start_sell_position_drag;
            if (startSellPositionDragDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, StartSellPositionDragDto.Serializer.INSTANCE, startSellPositionDragDto);
            }
        }

        public Surrogate(NotifyChartLoadedDto notifyChartLoadedDto, SetAvailableTimeSpansDto setAvailableTimeSpansDto, SetTimeSpanDto setTimeSpanDto, SetQuoteDto setQuoteDto, SetScrubModeDto setScrubModeDto, SetIntervalsDto setIntervalsDto, SetChartSettingsDto setChartSettingsDto, SetIntervalDto setIntervalDto, SetMobileAppChartInitializedDto setMobileAppChartInitializedDto, SetMobileAppChartReadyDto setMobileAppChartReadyDto, SetIndicatorsDto setIndicatorsDto, SetAddedIndicatorsDto setAddedIndicatorsDto, SetIndicatorTemplatesDto setIndicatorTemplatesDto, RefreshAuthStateDto refreshAuthStateDto, ColorPickerColorsDto colorPickerColorsDto, SetActiveIndicatorTemplateIdDto setActiveIndicatorTemplateIdDto, SubmitOrderEventDto submitOrderEventDto, EditOrderEventDto editOrderEventDto, PriceRowShownDto priceRowShownDto, PriceRowHiddenDto priceRowHiddenDto, StartEditOrderDto startEditOrderDto, YAxisLongPressEventDto yAxisLongPressEventDto, NotifyFatalErrorDto notifyFatalErrorDto, ReloadAppDto reloadAppDto, OpenOptionsChainEventDto openOptionsChainEventDto, CancelOrderDto cancelOrderDto, HapticDto hapticDto, StartSellPositionDragDto startSellPositionDragDto) {
            this.notify_chart_loaded = notifyChartLoadedDto;
            this.set_available_time_spans = setAvailableTimeSpansDto;
            this.set_time_span = setTimeSpanDto;
            this.set_quote = setQuoteDto;
            this.set_scrub_mode = setScrubModeDto;
            this.set_intervals = setIntervalsDto;
            this.set_chart_settings = setChartSettingsDto;
            this.set_interval = setIntervalDto;
            this.set_mobile_app_chart_initialized = setMobileAppChartInitializedDto;
            this.set_mobile_app_chart_ready = setMobileAppChartReadyDto;
            this.set_indicators = setIndicatorsDto;
            this.set_added_indicators = setAddedIndicatorsDto;
            this.set_indicator_templates = setIndicatorTemplatesDto;
            this.refresh_auth_state = refreshAuthStateDto;
            this.set_color_picker_colors = colorPickerColorsDto;
            this.set_active_indicator_template_id = setActiveIndicatorTemplateIdDto;
            this.submit_order = submitOrderEventDto;
            this.edit_order = editOrderEventDto;
            this.price_row_shown = priceRowShownDto;
            this.price_row_hidden = priceRowHiddenDto;
            this.start_edit_order = startEditOrderDto;
            this.y_axis_long_press_event = yAxisLongPressEventDto;
            this.notify_fatal_error = notifyFatalErrorDto;
            this.reload_app = reloadAppDto;
            this.open_options_chain_event = openOptionsChainEventDto;
            this.cancel_order = cancelOrderDto;
            this.perform_haptic = hapticDto;
            this.start_sell_position_drag = startSellPositionDragDto;
        }

        public /* synthetic */ Surrogate(NotifyChartLoadedDto notifyChartLoadedDto, SetAvailableTimeSpansDto setAvailableTimeSpansDto, SetTimeSpanDto setTimeSpanDto, SetQuoteDto setQuoteDto, SetScrubModeDto setScrubModeDto, SetIntervalsDto setIntervalsDto, SetChartSettingsDto setChartSettingsDto, SetIntervalDto setIntervalDto, SetMobileAppChartInitializedDto setMobileAppChartInitializedDto, SetMobileAppChartReadyDto setMobileAppChartReadyDto, SetIndicatorsDto setIndicatorsDto, SetAddedIndicatorsDto setAddedIndicatorsDto, SetIndicatorTemplatesDto setIndicatorTemplatesDto, RefreshAuthStateDto refreshAuthStateDto, ColorPickerColorsDto colorPickerColorsDto, SetActiveIndicatorTemplateIdDto setActiveIndicatorTemplateIdDto, SubmitOrderEventDto submitOrderEventDto, EditOrderEventDto editOrderEventDto, PriceRowShownDto priceRowShownDto, PriceRowHiddenDto priceRowHiddenDto, StartEditOrderDto startEditOrderDto, YAxisLongPressEventDto yAxisLongPressEventDto, NotifyFatalErrorDto notifyFatalErrorDto, ReloadAppDto reloadAppDto, OpenOptionsChainEventDto openOptionsChainEventDto, CancelOrderDto cancelOrderDto, HapticDto hapticDto, StartSellPositionDragDto startSellPositionDragDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : notifyChartLoadedDto, (i & 2) != 0 ? null : setAvailableTimeSpansDto, (i & 4) != 0 ? null : setTimeSpanDto, (i & 8) != 0 ? null : setQuoteDto, (i & 16) != 0 ? null : setScrubModeDto, (i & 32) != 0 ? null : setIntervalsDto, (i & 64) != 0 ? null : setChartSettingsDto, (i & 128) != 0 ? null : setIntervalDto, (i & 256) != 0 ? null : setMobileAppChartInitializedDto, (i & 512) != 0 ? null : setMobileAppChartReadyDto, (i & 1024) != 0 ? null : setIndicatorsDto, (i & 2048) != 0 ? null : setAddedIndicatorsDto, (i & 4096) != 0 ? null : setIndicatorTemplatesDto, (i & 8192) != 0 ? null : refreshAuthStateDto, (i & 16384) != 0 ? null : colorPickerColorsDto, (i & 32768) != 0 ? null : setActiveIndicatorTemplateIdDto, (i & 65536) != 0 ? null : submitOrderEventDto, (i & 131072) != 0 ? null : editOrderEventDto, (i & 262144) != 0 ? null : priceRowShownDto, (i & 524288) != 0 ? null : priceRowHiddenDto, (i & 1048576) != 0 ? null : startEditOrderDto, (i & 2097152) != 0 ? null : yAxisLongPressEventDto, (i & 4194304) != 0 ? null : notifyFatalErrorDto, (i & 8388608) != 0 ? null : reloadAppDto, (i & 16777216) != 0 ? null : openOptionsChainEventDto, (i & 33554432) != 0 ? null : cancelOrderDto, (i & 67108864) != 0 ? null : hapticDto, (i & 134217728) != 0 ? null : startSellPositionDragDto);
        }

        public final NotifyChartLoadedDto getNotify_chart_loaded() {
            return this.notify_chart_loaded;
        }

        public final SetAvailableTimeSpansDto getSet_available_time_spans() {
            return this.set_available_time_spans;
        }

        public final SetTimeSpanDto getSet_time_span() {
            return this.set_time_span;
        }

        public final SetQuoteDto getSet_quote() {
            return this.set_quote;
        }

        public final SetScrubModeDto getSet_scrub_mode() {
            return this.set_scrub_mode;
        }

        public final SetIntervalsDto getSet_intervals() {
            return this.set_intervals;
        }

        public final SetChartSettingsDto getSet_chart_settings() {
            return this.set_chart_settings;
        }

        public final SetIntervalDto getSet_interval() {
            return this.set_interval;
        }

        public final SetMobileAppChartInitializedDto getSet_mobile_app_chart_initialized() {
            return this.set_mobile_app_chart_initialized;
        }

        public final SetMobileAppChartReadyDto getSet_mobile_app_chart_ready() {
            return this.set_mobile_app_chart_ready;
        }

        public final SetIndicatorsDto getSet_indicators() {
            return this.set_indicators;
        }

        public final SetAddedIndicatorsDto getSet_added_indicators() {
            return this.set_added_indicators;
        }

        public final SetIndicatorTemplatesDto getSet_indicator_templates() {
            return this.set_indicator_templates;
        }

        public final RefreshAuthStateDto getRefresh_auth_state() {
            return this.refresh_auth_state;
        }

        public final ColorPickerColorsDto getSet_color_picker_colors() {
            return this.set_color_picker_colors;
        }

        public final SetActiveIndicatorTemplateIdDto getSet_active_indicator_template_id() {
            return this.set_active_indicator_template_id;
        }

        public final SubmitOrderEventDto getSubmit_order() {
            return this.submit_order;
        }

        public final EditOrderEventDto getEdit_order() {
            return this.edit_order;
        }

        public final PriceRowShownDto getPrice_row_shown() {
            return this.price_row_shown;
        }

        public final PriceRowHiddenDto getPrice_row_hidden() {
            return this.price_row_hidden;
        }

        public final StartEditOrderDto getStart_edit_order() {
            return this.start_edit_order;
        }

        public final YAxisLongPressEventDto getY_axis_long_press_event() {
            return this.y_axis_long_press_event;
        }

        public final NotifyFatalErrorDto getNotify_fatal_error() {
            return this.notify_fatal_error;
        }

        public final ReloadAppDto getReload_app() {
            return this.reload_app;
        }

        public final OpenOptionsChainEventDto getOpen_options_chain_event() {
            return this.open_options_chain_event;
        }

        public final CancelOrderDto getCancel_order() {
            return this.cancel_order;
        }

        public final HapticDto getPerform_haptic() {
            return this.perform_haptic;
        }

        public final StartSellPositionDragDto getStart_sell_position_drag() {
            return this.start_sell_position_drag;
        }
    }

    /* compiled from: MobileBlackWidowChartMessageDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessage;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MobileBlackWidowChartMessageDto, MobileBlackWidowChartMessage> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MobileBlackWidowChartMessageDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MobileBlackWidowChartMessageDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MobileBlackWidowChartMessageDto> getBinaryBase64Serializer() {
            return (KSerializer) MobileBlackWidowChartMessageDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MobileBlackWidowChartMessage> getProtoAdapter() {
            return MobileBlackWidowChartMessage.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MobileBlackWidowChartMessageDto getZeroValue() {
            return MobileBlackWidowChartMessageDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MobileBlackWidowChartMessageDto fromProto(MobileBlackWidowChartMessage proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            NotifyChartLoaded notify_chart_loaded = proto.getNotify_chart_loaded();
            DefaultConstructorMarker defaultConstructorMarker = null;
            NotifyChartLoadedDto notifyChartLoadedDtoFromProto = notify_chart_loaded != null ? NotifyChartLoadedDto.INSTANCE.fromProto(notify_chart_loaded) : null;
            SetAvailableTimeSpans set_available_time_spans = proto.getSet_available_time_spans();
            SetAvailableTimeSpansDto setAvailableTimeSpansDtoFromProto = set_available_time_spans != null ? SetAvailableTimeSpansDto.INSTANCE.fromProto(set_available_time_spans) : null;
            SetTimeSpan set_time_span = proto.getSet_time_span();
            SetTimeSpanDto setTimeSpanDtoFromProto = set_time_span != null ? SetTimeSpanDto.INSTANCE.fromProto(set_time_span) : null;
            SetQuote set_quote = proto.getSet_quote();
            SetQuoteDto setQuoteDtoFromProto = set_quote != null ? SetQuoteDto.INSTANCE.fromProto(set_quote) : null;
            SetScrubMode set_scrub_mode = proto.getSet_scrub_mode();
            SetScrubModeDto setScrubModeDtoFromProto = set_scrub_mode != null ? SetScrubModeDto.INSTANCE.fromProto(set_scrub_mode) : null;
            SetIntervals set_intervals = proto.getSet_intervals();
            SetIntervalsDto setIntervalsDtoFromProto = set_intervals != null ? SetIntervalsDto.INSTANCE.fromProto(set_intervals) : null;
            SetChartSettings set_chart_settings = proto.getSet_chart_settings();
            SetChartSettingsDto setChartSettingsDtoFromProto = set_chart_settings != null ? SetChartSettingsDto.INSTANCE.fromProto(set_chart_settings) : null;
            SetInterval set_interval = proto.getSet_interval();
            SetIntervalDto setIntervalDtoFromProto = set_interval != null ? SetIntervalDto.INSTANCE.fromProto(set_interval) : null;
            SetMobileAppChartInitialized set_mobile_app_chart_initialized = proto.getSet_mobile_app_chart_initialized();
            SetMobileAppChartInitializedDto setMobileAppChartInitializedDtoFromProto = set_mobile_app_chart_initialized != null ? SetMobileAppChartInitializedDto.INSTANCE.fromProto(set_mobile_app_chart_initialized) : null;
            SetMobileAppChartReady set_mobile_app_chart_ready = proto.getSet_mobile_app_chart_ready();
            SetMobileAppChartReadyDto setMobileAppChartReadyDtoFromProto = set_mobile_app_chart_ready != null ? SetMobileAppChartReadyDto.INSTANCE.fromProto(set_mobile_app_chart_ready) : null;
            SetIndicators set_indicators = proto.getSet_indicators();
            SetIndicatorsDto setIndicatorsDtoFromProto = set_indicators != null ? SetIndicatorsDto.INSTANCE.fromProto(set_indicators) : null;
            SetAddedIndicators set_added_indicators = proto.getSet_added_indicators();
            SetAddedIndicatorsDto setAddedIndicatorsDtoFromProto = set_added_indicators != null ? SetAddedIndicatorsDto.INSTANCE.fromProto(set_added_indicators) : null;
            SetIndicatorTemplates set_indicator_templates = proto.getSet_indicator_templates();
            SetIndicatorTemplatesDto setIndicatorTemplatesDtoFromProto = set_indicator_templates != null ? SetIndicatorTemplatesDto.INSTANCE.fromProto(set_indicator_templates) : null;
            RefreshAuthState refresh_auth_state = proto.getRefresh_auth_state();
            RefreshAuthStateDto refreshAuthStateDtoFromProto = refresh_auth_state != null ? RefreshAuthStateDto.INSTANCE.fromProto(refresh_auth_state) : null;
            ColorPickerColors set_color_picker_colors = proto.getSet_color_picker_colors();
            ColorPickerColorsDto colorPickerColorsDtoFromProto = set_color_picker_colors != null ? ColorPickerColorsDto.INSTANCE.fromProto(set_color_picker_colors) : null;
            SetActiveIndicatorTemplateId set_active_indicator_template_id = proto.getSet_active_indicator_template_id();
            SetActiveIndicatorTemplateIdDto setActiveIndicatorTemplateIdDtoFromProto = set_active_indicator_template_id != null ? SetActiveIndicatorTemplateIdDto.INSTANCE.fromProto(set_active_indicator_template_id) : null;
            SubmitOrderEvent submit_order = proto.getSubmit_order();
            SubmitOrderEventDto submitOrderEventDtoFromProto = submit_order != null ? SubmitOrderEventDto.INSTANCE.fromProto(submit_order) : null;
            EditOrderEvent edit_order = proto.getEdit_order();
            EditOrderEventDto editOrderEventDtoFromProto = edit_order != null ? EditOrderEventDto.INSTANCE.fromProto(edit_order) : null;
            PriceRowShown price_row_shown = proto.getPrice_row_shown();
            PriceRowShownDto priceRowShownDtoFromProto = price_row_shown != null ? PriceRowShownDto.INSTANCE.fromProto(price_row_shown) : null;
            PriceRowHidden price_row_hidden = proto.getPrice_row_hidden();
            PriceRowHiddenDto priceRowHiddenDtoFromProto = price_row_hidden != null ? PriceRowHiddenDto.INSTANCE.fromProto(price_row_hidden) : null;
            StartEditOrder start_edit_order = proto.getStart_edit_order();
            StartEditOrderDto startEditOrderDtoFromProto = start_edit_order != null ? StartEditOrderDto.INSTANCE.fromProto(start_edit_order) : null;
            YAxisLongPressEvent y_axis_long_press_event = proto.getY_axis_long_press_event();
            YAxisLongPressEventDto yAxisLongPressEventDtoFromProto = y_axis_long_press_event != null ? YAxisLongPressEventDto.INSTANCE.fromProto(y_axis_long_press_event) : null;
            NotifyFatalError notify_fatal_error = proto.getNotify_fatal_error();
            NotifyFatalErrorDto notifyFatalErrorDtoFromProto = notify_fatal_error != null ? NotifyFatalErrorDto.INSTANCE.fromProto(notify_fatal_error) : null;
            ReloadApp reload_app = proto.getReload_app();
            ReloadAppDto reloadAppDtoFromProto = reload_app != null ? ReloadAppDto.INSTANCE.fromProto(reload_app) : null;
            OpenOptionsChainEvent open_options_chain_event = proto.getOpen_options_chain_event();
            OpenOptionsChainEventDto openOptionsChainEventDtoFromProto = open_options_chain_event != null ? OpenOptionsChainEventDto.INSTANCE.fromProto(open_options_chain_event) : null;
            CancelOrder cancel_order = proto.getCancel_order();
            CancelOrderDto cancelOrderDtoFromProto = cancel_order != null ? CancelOrderDto.INSTANCE.fromProto(cancel_order) : null;
            Haptic perform_haptic = proto.getPerform_haptic();
            HapticDto hapticDtoFromProto = perform_haptic != null ? HapticDto.INSTANCE.fromProto(perform_haptic) : null;
            StartSellPositionDrag start_sell_position_drag = proto.getStart_sell_position_drag();
            return new MobileBlackWidowChartMessageDto(new Surrogate(notifyChartLoadedDtoFromProto, setAvailableTimeSpansDtoFromProto, setTimeSpanDtoFromProto, setQuoteDtoFromProto, setScrubModeDtoFromProto, setIntervalsDtoFromProto, setChartSettingsDtoFromProto, setIntervalDtoFromProto, setMobileAppChartInitializedDtoFromProto, setMobileAppChartReadyDtoFromProto, setIndicatorsDtoFromProto, setAddedIndicatorsDtoFromProto, setIndicatorTemplatesDtoFromProto, refreshAuthStateDtoFromProto, colorPickerColorsDtoFromProto, setActiveIndicatorTemplateIdDtoFromProto, submitOrderEventDtoFromProto, editOrderEventDtoFromProto, priceRowShownDtoFromProto, priceRowHiddenDtoFromProto, startEditOrderDtoFromProto, yAxisLongPressEventDtoFromProto, notifyFatalErrorDtoFromProto, reloadAppDtoFromProto, openOptionsChainEventDtoFromProto, cancelOrderDtoFromProto, hapticDtoFromProto, start_sell_position_drag != null ? StartSellPositionDragDto.INSTANCE.fromProto(start_sell_position_drag) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.MobileBlackWidowChartMessageDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileBlackWidowChartMessageDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MobileBlackWidowChartMessageDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MobileBlackWidowChartMessageDto.kt */
    @Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000  2\u00020\u0001:\u001d\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001c!\"#$%&'()*+,-./0123456789:;<¨\u0006="}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "NotifyChartLoaded", "SetAvailableTimeSpans", "SetTimeSpan", "SetQuote", "SetScrubMode", "SetIntervals", "SetChartSettings", "SetInterval", "SetMobileAppChartInitialized", "SetMobileAppChartReady", "SetIndicators", "SetAddedIndicators", "SetIndicatorTemplates", "RefreshAuthState", "SetColorPickerColors", "SetActiveIndicatorTemplateId", "SubmitOrder", EquityAdvanceChartOrderDuxo5.EDIT_ORDER, "PriceRowShown", "PriceRowHidden", "StartEditOrder", "YAxisLongPressEvent", "NotifyFatalError", "ReloadApp", "OpenOptionsChainEvent", "CancelOrder", "PerformHaptic", "StartSellPositionDrag", "Companion", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$CancelOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$EditOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$NotifyChartLoaded;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$NotifyFatalError;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$OpenOptionsChainEvent;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$PerformHaptic;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$PriceRowHidden;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$PriceRowShown;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$RefreshAuthState;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$ReloadApp;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetActiveIndicatorTemplateId;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetAddedIndicators;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetAvailableTimeSpans;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetChartSettings;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetColorPickerColors;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetIndicatorTemplates;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetIndicators;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetInterval;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetIntervals;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetMobileAppChartInitialized;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetMobileAppChartReady;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetQuote;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetScrubMode;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetTimeSpan;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$StartEditOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$StartSellPositionDrag;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SubmitOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$YAxisLongPressEvent;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DataDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DataDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DataDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$NotifyChartLoaded;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoadedDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoadedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoadedDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoadedDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NotifyChartLoaded extends DataDto {
            private final NotifyChartLoadedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NotifyChartLoaded) && Intrinsics.areEqual(this.value, ((NotifyChartLoaded) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NotifyChartLoaded(value=" + this.value + ")";
            }

            public final NotifyChartLoadedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NotifyChartLoaded(NotifyChartLoadedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetAvailableTimeSpans;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpansDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpansDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpansDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpansDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetAvailableTimeSpans extends DataDto {
            private final SetAvailableTimeSpansDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetAvailableTimeSpans) && Intrinsics.areEqual(this.value, ((SetAvailableTimeSpans) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetAvailableTimeSpans(value=" + this.value + ")";
            }

            public final SetAvailableTimeSpansDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetAvailableTimeSpans(SetAvailableTimeSpansDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetTimeSpan;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpanDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpanDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpanDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpanDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetTimeSpan extends DataDto {
            private final SetTimeSpanDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetTimeSpan) && Intrinsics.areEqual(this.value, ((SetTimeSpan) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetTimeSpan(value=" + this.value + ")";
            }

            public final SetTimeSpanDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetTimeSpan(SetTimeSpanDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetQuote;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuoteDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuoteDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuoteDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuoteDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetQuote extends DataDto {
            private final SetQuoteDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetQuote) && Intrinsics.areEqual(this.value, ((SetQuote) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetQuote(value=" + this.value + ")";
            }

            public final SetQuoteDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetQuote(SetQuoteDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetScrubMode;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubModeDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubModeDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubModeDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubModeDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetScrubMode extends DataDto {
            private final SetScrubModeDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetScrubMode) && Intrinsics.areEqual(this.value, ((SetScrubMode) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetScrubMode(value=" + this.value + ")";
            }

            public final SetScrubModeDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetScrubMode(SetScrubModeDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetIntervals;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalsDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalsDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalsDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetIntervals extends DataDto {
            private final SetIntervalsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetIntervals) && Intrinsics.areEqual(this.value, ((SetIntervals) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetIntervals(value=" + this.value + ")";
            }

            public final SetIntervalsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetIntervals(SetIntervalsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetChartSettings;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetChartSettings extends DataDto {
            private final SetChartSettingsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetChartSettings) && Intrinsics.areEqual(this.value, ((SetChartSettings) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetChartSettings(value=" + this.value + ")";
            }

            public final SetChartSettingsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetChartSettings(SetChartSettingsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetInterval;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervalDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetInterval extends DataDto {
            private final SetIntervalDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetInterval) && Intrinsics.areEqual(this.value, ((SetInterval) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetInterval(value=" + this.value + ")";
            }

            public final SetIntervalDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetInterval(SetIntervalDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetMobileAppChartInitialized;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitializedDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitializedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitializedDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitializedDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetMobileAppChartInitialized extends DataDto {
            private final SetMobileAppChartInitializedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetMobileAppChartInitialized) && Intrinsics.areEqual(this.value, ((SetMobileAppChartInitialized) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetMobileAppChartInitialized(value=" + this.value + ")";
            }

            public final SetMobileAppChartInitializedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetMobileAppChartInitialized(SetMobileAppChartInitializedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetMobileAppChartReady;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReadyDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReadyDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReadyDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReadyDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetMobileAppChartReady extends DataDto {
            private final SetMobileAppChartReadyDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetMobileAppChartReady) && Intrinsics.areEqual(this.value, ((SetMobileAppChartReady) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetMobileAppChartReady(value=" + this.value + ")";
            }

            public final SetMobileAppChartReadyDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetMobileAppChartReady(SetMobileAppChartReadyDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetIndicators;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetIndicators extends DataDto {
            private final SetIndicatorsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetIndicators) && Intrinsics.areEqual(this.value, ((SetIndicators) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetIndicators(value=" + this.value + ")";
            }

            public final SetIndicatorsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetIndicators(SetIndicatorsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetAddedIndicators;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicatorsDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicatorsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicatorsDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicatorsDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetAddedIndicators extends DataDto {
            private final SetAddedIndicatorsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetAddedIndicators) && Intrinsics.areEqual(this.value, ((SetAddedIndicators) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetAddedIndicators(value=" + this.value + ")";
            }

            public final SetAddedIndicatorsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetAddedIndicators(SetAddedIndicatorsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetIndicatorTemplates;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplatesDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplatesDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplatesDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplatesDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetIndicatorTemplates extends DataDto {
            private final SetIndicatorTemplatesDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetIndicatorTemplates) && Intrinsics.areEqual(this.value, ((SetIndicatorTemplates) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetIndicatorTemplates(value=" + this.value + ")";
            }

            public final SetIndicatorTemplatesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetIndicatorTemplates(SetIndicatorTemplatesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$RefreshAuthState;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthStateDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthStateDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthStateDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthStateDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RefreshAuthState extends DataDto {
            private final RefreshAuthStateDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RefreshAuthState) && Intrinsics.areEqual(this.value, ((RefreshAuthState) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RefreshAuthState(value=" + this.value + ")";
            }

            public final RefreshAuthStateDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshAuthState(RefreshAuthStateDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetColorPickerColors;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColorsDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColorsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColorsDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColorsDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetColorPickerColors extends DataDto {
            private final ColorPickerColorsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetColorPickerColors) && Intrinsics.areEqual(this.value, ((SetColorPickerColors) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetColorPickerColors(value=" + this.value + ")";
            }

            public final ColorPickerColorsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetColorPickerColors(ColorPickerColorsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SetActiveIndicatorTemplateId;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateIdDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateIdDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateIdDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateIdDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetActiveIndicatorTemplateId extends DataDto {
            private final SetActiveIndicatorTemplateIdDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetActiveIndicatorTemplateId) && Intrinsics.areEqual(this.value, ((SetActiveIndicatorTemplateId) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SetActiveIndicatorTemplateId(value=" + this.value + ")";
            }

            public final SetActiveIndicatorTemplateIdDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetActiveIndicatorTemplateId(SetActiveIndicatorTemplateIdDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$SubmitOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEventDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEventDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEventDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEventDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SubmitOrder extends DataDto {
            private final SubmitOrderEventDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubmitOrder) && Intrinsics.areEqual(this.value, ((SubmitOrder) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SubmitOrder(value=" + this.value + ")";
            }

            public final SubmitOrderEventDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubmitOrder(SubmitOrderEventDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$EditOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEventDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEventDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEventDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEventDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EditOrder extends DataDto {
            private final EditOrderEventDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EditOrder) && Intrinsics.areEqual(this.value, ((EditOrder) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EditOrder(value=" + this.value + ")";
            }

            public final EditOrderEventDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EditOrder(EditOrderEventDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$PriceRowShown;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShownDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShownDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShownDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShownDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PriceRowShown extends DataDto {
            private final PriceRowShownDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PriceRowShown) && Intrinsics.areEqual(this.value, ((PriceRowShown) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PriceRowShown(value=" + this.value + ")";
            }

            public final PriceRowShownDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PriceRowShown(PriceRowShownDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$PriceRowHidden;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHiddenDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHiddenDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHiddenDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHiddenDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PriceRowHidden extends DataDto {
            private final PriceRowHiddenDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PriceRowHidden) && Intrinsics.areEqual(this.value, ((PriceRowHidden) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PriceRowHidden(value=" + this.value + ")";
            }

            public final PriceRowHiddenDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PriceRowHidden(PriceRowHiddenDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$StartEditOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrderDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrderDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrderDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrderDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StartEditOrder extends DataDto {
            private final StartEditOrderDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StartEditOrder) && Intrinsics.areEqual(this.value, ((StartEditOrder) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "StartEditOrder(value=" + this.value + ")";
            }

            public final StartEditOrderDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartEditOrder(StartEditOrderDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$YAxisLongPressEvent;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEventDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEventDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEventDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEventDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class YAxisLongPressEvent extends DataDto {
            private final YAxisLongPressEventDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof YAxisLongPressEvent) && Intrinsics.areEqual(this.value, ((YAxisLongPressEvent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "YAxisLongPressEvent(value=" + this.value + ")";
            }

            public final YAxisLongPressEventDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public YAxisLongPressEvent(YAxisLongPressEventDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$NotifyFatalError;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalErrorDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalErrorDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalErrorDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalErrorDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NotifyFatalError extends DataDto {
            private final NotifyFatalErrorDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NotifyFatalError) && Intrinsics.areEqual(this.value, ((NotifyFatalError) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NotifyFatalError(value=" + this.value + ")";
            }

            public final NotifyFatalErrorDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NotifyFatalError(NotifyFatalErrorDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$ReloadApp;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadAppDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadAppDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadAppDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadAppDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReloadApp extends DataDto {
            private final ReloadAppDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReloadApp) && Intrinsics.areEqual(this.value, ((ReloadApp) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ReloadApp(value=" + this.value + ")";
            }

            public final ReloadAppDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReloadApp(ReloadAppDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$OpenOptionsChainEvent;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEventDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEventDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEventDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEventDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OpenOptionsChainEvent extends DataDto {
            private final OpenOptionsChainEventDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenOptionsChainEvent) && Intrinsics.areEqual(this.value, ((OpenOptionsChainEvent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OpenOptionsChainEvent(value=" + this.value + ")";
            }

            public final OpenOptionsChainEventDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenOptionsChainEvent(OpenOptionsChainEventDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$CancelOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrderDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrderDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrderDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrderDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CancelOrder extends DataDto {
            private final CancelOrderDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CancelOrder) && Intrinsics.areEqual(this.value, ((CancelOrder) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CancelOrder(value=" + this.value + ")";
            }

            public final CancelOrderDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CancelOrder(CancelOrderDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$PerformHaptic;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PerformHaptic extends DataDto {
            private final HapticDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PerformHaptic) && Intrinsics.areEqual(this.value, ((PerformHaptic) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PerformHaptic(value=" + this.value + ")";
            }

            public final HapticDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformHaptic(HapticDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$StartSellPositionDrag;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDragDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDragDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDragDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDragDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StartSellPositionDrag extends DataDto {
            private final StartSellPositionDragDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StartSellPositionDrag) && Intrinsics.areEqual(this.value, ((StartSellPositionDrag) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "StartSellPositionDrag(value=" + this.value + ")";
            }

            public final StartSellPositionDragDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartSellPositionDrag(StartSellPositionDragDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MobileBlackWidowChartMessageDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessage;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DataDto, MobileBlackWidowChartMessage> {
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
            public ProtoAdapter<MobileBlackWidowChartMessage> getProtoAdapter() {
                return MobileBlackWidowChartMessage.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DataDto fromProto(MobileBlackWidowChartMessage proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getNotify_chart_loaded() != null) {
                    return new NotifyChartLoaded(NotifyChartLoadedDto.INSTANCE.fromProto(proto.getNotify_chart_loaded()));
                }
                if (proto.getSet_available_time_spans() != null) {
                    return new SetAvailableTimeSpans(SetAvailableTimeSpansDto.INSTANCE.fromProto(proto.getSet_available_time_spans()));
                }
                if (proto.getSet_time_span() != null) {
                    return new SetTimeSpan(SetTimeSpanDto.INSTANCE.fromProto(proto.getSet_time_span()));
                }
                if (proto.getSet_quote() != null) {
                    return new SetQuote(SetQuoteDto.INSTANCE.fromProto(proto.getSet_quote()));
                }
                if (proto.getSet_scrub_mode() != null) {
                    return new SetScrubMode(SetScrubModeDto.INSTANCE.fromProto(proto.getSet_scrub_mode()));
                }
                if (proto.getSet_intervals() != null) {
                    return new SetIntervals(SetIntervalsDto.INSTANCE.fromProto(proto.getSet_intervals()));
                }
                if (proto.getSet_chart_settings() != null) {
                    return new SetChartSettings(SetChartSettingsDto.INSTANCE.fromProto(proto.getSet_chart_settings()));
                }
                if (proto.getSet_interval() != null) {
                    return new SetInterval(SetIntervalDto.INSTANCE.fromProto(proto.getSet_interval()));
                }
                if (proto.getSet_mobile_app_chart_initialized() != null) {
                    return new SetMobileAppChartInitialized(SetMobileAppChartInitializedDto.INSTANCE.fromProto(proto.getSet_mobile_app_chart_initialized()));
                }
                if (proto.getSet_mobile_app_chart_ready() != null) {
                    return new SetMobileAppChartReady(SetMobileAppChartReadyDto.INSTANCE.fromProto(proto.getSet_mobile_app_chart_ready()));
                }
                if (proto.getSet_indicators() != null) {
                    return new SetIndicators(SetIndicatorsDto.INSTANCE.fromProto(proto.getSet_indicators()));
                }
                if (proto.getSet_added_indicators() != null) {
                    return new SetAddedIndicators(SetAddedIndicatorsDto.INSTANCE.fromProto(proto.getSet_added_indicators()));
                }
                if (proto.getSet_indicator_templates() != null) {
                    return new SetIndicatorTemplates(SetIndicatorTemplatesDto.INSTANCE.fromProto(proto.getSet_indicator_templates()));
                }
                if (proto.getRefresh_auth_state() != null) {
                    return new RefreshAuthState(RefreshAuthStateDto.INSTANCE.fromProto(proto.getRefresh_auth_state()));
                }
                if (proto.getSet_color_picker_colors() != null) {
                    return new SetColorPickerColors(ColorPickerColorsDto.INSTANCE.fromProto(proto.getSet_color_picker_colors()));
                }
                if (proto.getSet_active_indicator_template_id() != null) {
                    return new SetActiveIndicatorTemplateId(SetActiveIndicatorTemplateIdDto.INSTANCE.fromProto(proto.getSet_active_indicator_template_id()));
                }
                if (proto.getSubmit_order() != null) {
                    return new SubmitOrder(SubmitOrderEventDto.INSTANCE.fromProto(proto.getSubmit_order()));
                }
                if (proto.getEdit_order() != null) {
                    return new EditOrder(EditOrderEventDto.INSTANCE.fromProto(proto.getEdit_order()));
                }
                if (proto.getPrice_row_shown() != null) {
                    return new PriceRowShown(PriceRowShownDto.INSTANCE.fromProto(proto.getPrice_row_shown()));
                }
                if (proto.getPrice_row_hidden() != null) {
                    return new PriceRowHidden(PriceRowHiddenDto.INSTANCE.fromProto(proto.getPrice_row_hidden()));
                }
                if (proto.getStart_edit_order() != null) {
                    return new StartEditOrder(StartEditOrderDto.INSTANCE.fromProto(proto.getStart_edit_order()));
                }
                if (proto.getY_axis_long_press_event() != null) {
                    return new YAxisLongPressEvent(YAxisLongPressEventDto.INSTANCE.fromProto(proto.getY_axis_long_press_event()));
                }
                if (proto.getNotify_fatal_error() != null) {
                    return new NotifyFatalError(NotifyFatalErrorDto.INSTANCE.fromProto(proto.getNotify_fatal_error()));
                }
                if (proto.getReload_app() != null) {
                    return new ReloadApp(ReloadAppDto.INSTANCE.fromProto(proto.getReload_app()));
                }
                if (proto.getOpen_options_chain_event() != null) {
                    return new OpenOptionsChainEvent(OpenOptionsChainEventDto.INSTANCE.fromProto(proto.getOpen_options_chain_event()));
                }
                if (proto.getCancel_order() != null) {
                    return new CancelOrder(CancelOrderDto.INSTANCE.fromProto(proto.getCancel_order()));
                }
                if (proto.getPerform_haptic() != null) {
                    return new PerformHaptic(HapticDto.INSTANCE.fromProto(proto.getPerform_haptic()));
                }
                if (proto.getStart_sell_position_drag() != null) {
                    return new StartSellPositionDrag(StartSellPositionDragDto.INSTANCE.fromProto(proto.getStart_sell_position_drag()));
                }
                return null;
            }
        }
    }

    /* compiled from: MobileBlackWidowChartMessageDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MobileBlackWidowChartMessageDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.MobileBlackWidowChartMessage", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MobileBlackWidowChartMessageDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MobileBlackWidowChartMessageDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MobileBlackWidowChartMessageDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MobileBlackWidowChartMessageDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.MobileBlackWidowChartMessageDto";
        }
    }
}
