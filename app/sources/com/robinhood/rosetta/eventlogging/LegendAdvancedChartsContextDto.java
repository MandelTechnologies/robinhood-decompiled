package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContextDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: LegendAdvancedChartsContextDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006=>?@ABB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u001bJ\u0092\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\tJ\b\u00100\u001a\u00020\u0002H\u0016J\b\u00101\u001a\u00020\tH\u0016J\u0013\u00102\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u000206H\u0016J\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000206H\u0016J\b\u0010<\u001a\u000206H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u0019\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010$R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001d¨\u0006C"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$Surrogate;)V", FuturesAssetHomeChartDuxo.ARG_SELECTED_SPAN, "", "selected_interval", "selected_template", "active_indicators", "", "instrument_id", "trade_amount", "", "auto_send_enabled", "", "indicator_id", "set_id", "indicator_settings", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto;", "chart_settings", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "ref_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;DZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto;Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto;DLjava/lang/String;)V", "getSelected_span", "()Ljava/lang/String;", "getSelected_interval", "getSelected_template", "getActive_indicators", "()Ljava/util/List;", "getInstrument_id", "getTrade_amount", "()D", "getAuto_send_enabled", "()Z", "getIndicator_id", "getSet_id", "getIndicator_settings", "()Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto;", "getChart_settings", "()Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto;", "getPrice", "getRef_id", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "IndicatorSettingsDto", "ChartSettingsDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class LegendAdvancedChartsContextDto implements Dto3<LegendAdvancedChartsContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LegendAdvancedChartsContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LegendAdvancedChartsContextDto, LegendAdvancedChartsContext>> binaryBase64Serializer$delegate;
    private static final LegendAdvancedChartsContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LegendAdvancedChartsContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LegendAdvancedChartsContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getSelected_span() {
        return this.surrogate.getSelected_span();
    }

    public final String getSelected_interval() {
        return this.surrogate.getSelected_interval();
    }

    public final String getSelected_template() {
        return this.surrogate.getSelected_template();
    }

    public final java.util.List<String> getActive_indicators() {
        return this.surrogate.getActive_indicators();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final double getTrade_amount() {
        return this.surrogate.getTrade_amount();
    }

    public final boolean getAuto_send_enabled() {
        return this.surrogate.getAuto_send_enabled();
    }

    public final String getIndicator_id() {
        return this.surrogate.getIndicator_id();
    }

    public final String getSet_id() {
        return this.surrogate.getSet_id();
    }

    public final IndicatorSettingsDto getIndicator_settings() {
        return this.surrogate.getIndicator_settings();
    }

    public final ChartSettingsDto getChart_settings() {
        return this.surrogate.getChart_settings();
    }

    public final double getPrice() {
        return this.surrogate.getPrice();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public /* synthetic */ LegendAdvancedChartsContextDto(String str, String str2, String str3, java.util.List list, String str4, double d, boolean z, String str5, String str6, IndicatorSettingsDto indicatorSettingsDto, ChartSettingsDto chartSettingsDto, double d2, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? false : z, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? null : indicatorSettingsDto, (i & 1024) == 0 ? chartSettingsDto : null, (i & 2048) != 0 ? 0.0d : d2, (i & 4096) != 0 ? "" : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegendAdvancedChartsContextDto(String selected_span, String selected_interval, String selected_template, java.util.List<String> active_indicators, String instrument_id, double d, boolean z, String indicator_id, String set_id, IndicatorSettingsDto indicatorSettingsDto, ChartSettingsDto chartSettingsDto, double d2, String ref_id) {
        this(new Surrogate(selected_span, selected_interval, selected_template, active_indicators, instrument_id, d, z, indicator_id, set_id, indicatorSettingsDto, chartSettingsDto, d2, ref_id));
        Intrinsics.checkNotNullParameter(selected_span, "selected_span");
        Intrinsics.checkNotNullParameter(selected_interval, "selected_interval");
        Intrinsics.checkNotNullParameter(selected_template, "selected_template");
        Intrinsics.checkNotNullParameter(active_indicators, "active_indicators");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(indicator_id, "indicator_id");
        Intrinsics.checkNotNullParameter(set_id, "set_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
    }

    public final LegendAdvancedChartsContextDto copy(String selected_span, String selected_interval, String selected_template, java.util.List<String> active_indicators, String instrument_id, double trade_amount, boolean auto_send_enabled, String indicator_id, String set_id, IndicatorSettingsDto indicator_settings, ChartSettingsDto chart_settings, double price, String ref_id) {
        Intrinsics.checkNotNullParameter(selected_span, "selected_span");
        Intrinsics.checkNotNullParameter(selected_interval, "selected_interval");
        Intrinsics.checkNotNullParameter(selected_template, "selected_template");
        Intrinsics.checkNotNullParameter(active_indicators, "active_indicators");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(indicator_id, "indicator_id");
        Intrinsics.checkNotNullParameter(set_id, "set_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        return new LegendAdvancedChartsContextDto(new Surrogate(selected_span, selected_interval, selected_template, active_indicators, instrument_id, trade_amount, auto_send_enabled, indicator_id, set_id, indicator_settings, chart_settings, price, ref_id));
    }

    @Override // com.robinhood.idl.Dto
    public LegendAdvancedChartsContext toProto() {
        String selected_span = this.surrogate.getSelected_span();
        String selected_interval = this.surrogate.getSelected_interval();
        String selected_template = this.surrogate.getSelected_template();
        java.util.List<String> active_indicators = this.surrogate.getActive_indicators();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(active_indicators, 10));
        Iterator<T> it = active_indicators.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        String instrument_id = this.surrogate.getInstrument_id();
        double trade_amount = this.surrogate.getTrade_amount();
        boolean auto_send_enabled = this.surrogate.getAuto_send_enabled();
        String indicator_id = this.surrogate.getIndicator_id();
        String set_id = this.surrogate.getSet_id();
        IndicatorSettingsDto indicator_settings = this.surrogate.getIndicator_settings();
        LegendAdvancedChartsContext.IndicatorSettings proto = indicator_settings != null ? indicator_settings.toProto() : null;
        ChartSettingsDto chart_settings = this.surrogate.getChart_settings();
        return new LegendAdvancedChartsContext(selected_span, selected_interval, selected_template, arrayList, instrument_id, trade_amount, auto_send_enabled, indicator_id, set_id, proto, chart_settings != null ? chart_settings.toProto() : null, this.surrogate.getPrice(), this.surrogate.getRef_id(), null, 8192, null);
    }

    public String toString() {
        return "[LegendAdvancedChartsContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LegendAdvancedChartsContextDto) && Intrinsics.areEqual(((LegendAdvancedChartsContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: LegendAdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 [2\u00020\u0001:\u0002Z[B±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019B\u009d\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0018\u0010\u001eJ\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u0018\u0010E\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010F\u001a\u00020\u000fHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0018\u0010K\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J³\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0017\b\u0002\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001J\u0013\u0010N\u001a\u00020\u000f2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\u001bHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J%\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0001¢\u0006\u0002\bYR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010 \u001a\u0004\b(\u0010)R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R+\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010 \u001a\u0004\b-\u0010.R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010 \u001a\u0004\b0\u00101R\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010 \u001a\u0004\b3\u0010\"R\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010 \u001a\u0004\b5\u0010\"R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010 \u001a\u0004\b7\u00108R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010 \u001a\u0004\b:\u0010;R+\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010 \u001a\u0004\b=\u0010.R\u001c\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010 \u001a\u0004\b?\u0010\"¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$Surrogate;", "", FuturesAssetHomeChartDuxo.ARG_SELECTED_SPAN, "", "selected_interval", "selected_template", "active_indicators", "", "instrument_id", "trade_amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "auto_send_enabled", "", "indicator_id", "set_id", "indicator_settings", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto;", "chart_settings", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "ref_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;DZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto;Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto;DLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;DZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto;Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto;DLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSelected_span$annotations", "()V", "getSelected_span", "()Ljava/lang/String;", "getSelected_interval$annotations", "getSelected_interval", "getSelected_template$annotations", "getSelected_template", "getActive_indicators$annotations", "getActive_indicators", "()Ljava/util/List;", "getInstrument_id$annotations", "getInstrument_id", "getTrade_amount$annotations", "getTrade_amount", "()D", "getAuto_send_enabled$annotations", "getAuto_send_enabled", "()Z", "getIndicator_id$annotations", "getIndicator_id", "getSet_id$annotations", "getSet_id", "getIndicator_settings$annotations", "getIndicator_settings", "()Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto;", "getChart_settings$annotations", "getChart_settings", "()Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto;", "getPrice$annotations", "getPrice", "getRef_id$annotations", "getRef_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final java.util.List<String> active_indicators;
        private final boolean auto_send_enabled;
        private final ChartSettingsDto chart_settings;
        private final String indicator_id;
        private final IndicatorSettingsDto indicator_settings;
        private final String instrument_id;
        private final double price;
        private final String ref_id;
        private final String selected_interval;
        private final String selected_span;
        private final String selected_template;
        private final String set_id;
        private final double trade_amount;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContextDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LegendAdvancedChartsContextDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (java.util.List) null, (String) null, 0.0d, false, (String) null, (String) null, (IndicatorSettingsDto) null, (ChartSettingsDto) null, 0.0d, (String) null, 8191, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        @SerialName("activeIndicators")
        @JsonAnnotations2(names = {"active_indicators"})
        public static /* synthetic */ void getActive_indicators$annotations() {
        }

        @SerialName("autoSendEnabled")
        @JsonAnnotations2(names = {"auto_send_enabled"})
        public static /* synthetic */ void getAuto_send_enabled$annotations() {
        }

        @SerialName("chartSettings")
        @JsonAnnotations2(names = {"chart_settings"})
        public static /* synthetic */ void getChart_settings$annotations() {
        }

        @SerialName("indicatorId")
        @JsonAnnotations2(names = {"indicator_id"})
        public static /* synthetic */ void getIndicator_id$annotations() {
        }

        @SerialName("indicatorSettings")
        @JsonAnnotations2(names = {"indicator_settings"})
        public static /* synthetic */ void getIndicator_settings$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("selectedInterval")
        @JsonAnnotations2(names = {"selected_interval"})
        public static /* synthetic */ void getSelected_interval$annotations() {
        }

        @SerialName("selectedSpan")
        @JsonAnnotations2(names = {FuturesAssetHomeChartDuxo.ARG_SELECTED_SPAN})
        public static /* synthetic */ void getSelected_span$annotations() {
        }

        @SerialName("selectedTemplate")
        @JsonAnnotations2(names = {"selected_template"})
        public static /* synthetic */ void getSelected_template$annotations() {
        }

        @SerialName("setId")
        @JsonAnnotations2(names = {"set_id"})
        public static /* synthetic */ void getSet_id$annotations() {
        }

        @SerialName("tradeAmount")
        @JsonAnnotations2(names = {"trade_amount"})
        public static /* synthetic */ void getTrade_amount$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getSelected_span() {
            return this.selected_span;
        }

        /* renamed from: component10, reason: from getter */
        public final IndicatorSettingsDto getIndicator_settings() {
            return this.indicator_settings;
        }

        /* renamed from: component11, reason: from getter */
        public final ChartSettingsDto getChart_settings() {
            return this.chart_settings;
        }

        /* renamed from: component12, reason: from getter */
        public final double getPrice() {
            return this.price;
        }

        /* renamed from: component13, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSelected_interval() {
            return this.selected_interval;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSelected_template() {
            return this.selected_template;
        }

        public final java.util.List<String> component4() {
            return this.active_indicators;
        }

        /* renamed from: component5, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component6, reason: from getter */
        public final double getTrade_amount() {
            return this.trade_amount;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getAuto_send_enabled() {
            return this.auto_send_enabled;
        }

        /* renamed from: component8, reason: from getter */
        public final String getIndicator_id() {
            return this.indicator_id;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSet_id() {
            return this.set_id;
        }

        public final Surrogate copy(String selected_span, String selected_interval, String selected_template, java.util.List<String> active_indicators, String instrument_id, double trade_amount, boolean auto_send_enabled, String indicator_id, String set_id, IndicatorSettingsDto indicator_settings, ChartSettingsDto chart_settings, double price, String ref_id) {
            Intrinsics.checkNotNullParameter(selected_span, "selected_span");
            Intrinsics.checkNotNullParameter(selected_interval, "selected_interval");
            Intrinsics.checkNotNullParameter(selected_template, "selected_template");
            Intrinsics.checkNotNullParameter(active_indicators, "active_indicators");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(indicator_id, "indicator_id");
            Intrinsics.checkNotNullParameter(set_id, "set_id");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            return new Surrogate(selected_span, selected_interval, selected_template, active_indicators, instrument_id, trade_amount, auto_send_enabled, indicator_id, set_id, indicator_settings, chart_settings, price, ref_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.selected_span, surrogate.selected_span) && Intrinsics.areEqual(this.selected_interval, surrogate.selected_interval) && Intrinsics.areEqual(this.selected_template, surrogate.selected_template) && Intrinsics.areEqual(this.active_indicators, surrogate.active_indicators) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Double.compare(this.trade_amount, surrogate.trade_amount) == 0 && this.auto_send_enabled == surrogate.auto_send_enabled && Intrinsics.areEqual(this.indicator_id, surrogate.indicator_id) && Intrinsics.areEqual(this.set_id, surrogate.set_id) && Intrinsics.areEqual(this.indicator_settings, surrogate.indicator_settings) && Intrinsics.areEqual(this.chart_settings, surrogate.chart_settings) && Double.compare(this.price, surrogate.price) == 0 && Intrinsics.areEqual(this.ref_id, surrogate.ref_id);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((this.selected_span.hashCode() * 31) + this.selected_interval.hashCode()) * 31) + this.selected_template.hashCode()) * 31) + this.active_indicators.hashCode()) * 31) + this.instrument_id.hashCode()) * 31) + Double.hashCode(this.trade_amount)) * 31) + java.lang.Boolean.hashCode(this.auto_send_enabled)) * 31) + this.indicator_id.hashCode()) * 31) + this.set_id.hashCode()) * 31;
            IndicatorSettingsDto indicatorSettingsDto = this.indicator_settings;
            int iHashCode2 = (iHashCode + (indicatorSettingsDto == null ? 0 : indicatorSettingsDto.hashCode())) * 31;
            ChartSettingsDto chartSettingsDto = this.chart_settings;
            return ((((iHashCode2 + (chartSettingsDto != null ? chartSettingsDto.hashCode() : 0)) * 31) + Double.hashCode(this.price)) * 31) + this.ref_id.hashCode();
        }

        public String toString() {
            return "Surrogate(selected_span=" + this.selected_span + ", selected_interval=" + this.selected_interval + ", selected_template=" + this.selected_template + ", active_indicators=" + this.active_indicators + ", instrument_id=" + this.instrument_id + ", trade_amount=" + this.trade_amount + ", auto_send_enabled=" + this.auto_send_enabled + ", indicator_id=" + this.indicator_id + ", set_id=" + this.set_id + ", indicator_settings=" + this.indicator_settings + ", chart_settings=" + this.chart_settings + ", price=" + this.price + ", ref_id=" + this.ref_id + ")";
        }

        /* compiled from: LegendAdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LegendAdvancedChartsContextDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, java.util.List list, String str4, double d, boolean z, String str5, String str6, IndicatorSettingsDto indicatorSettingsDto, ChartSettingsDto chartSettingsDto, double d2, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.selected_span = "";
            } else {
                this.selected_span = str;
            }
            if ((i & 2) == 0) {
                this.selected_interval = "";
            } else {
                this.selected_interval = str2;
            }
            if ((i & 4) == 0) {
                this.selected_template = "";
            } else {
                this.selected_template = str3;
            }
            if ((i & 8) == 0) {
                this.active_indicators = CollectionsKt.emptyList();
            } else {
                this.active_indicators = list;
            }
            if ((i & 16) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str4;
            }
            if ((i & 32) == 0) {
                this.trade_amount = 0.0d;
            } else {
                this.trade_amount = d;
            }
            if ((i & 64) == 0) {
                this.auto_send_enabled = false;
            } else {
                this.auto_send_enabled = z;
            }
            if ((i & 128) == 0) {
                this.indicator_id = "";
            } else {
                this.indicator_id = str5;
            }
            if ((i & 256) == 0) {
                this.set_id = "";
            } else {
                this.set_id = str6;
            }
            if ((i & 512) == 0) {
                this.indicator_settings = null;
            } else {
                this.indicator_settings = indicatorSettingsDto;
            }
            if ((i & 1024) == 0) {
                this.chart_settings = null;
            } else {
                this.chart_settings = chartSettingsDto;
            }
            if ((i & 2048) == 0) {
                this.price = 0.0d;
            } else {
                this.price = d2;
            }
            if ((i & 4096) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.selected_span, "")) {
                output.encodeStringElement(serialDesc, 0, self.selected_span);
            }
            if (!Intrinsics.areEqual(self.selected_interval, "")) {
                output.encodeStringElement(serialDesc, 1, self.selected_interval);
            }
            if (!Intrinsics.areEqual(self.selected_template, "")) {
                output.encodeStringElement(serialDesc, 2, self.selected_template);
            }
            if (!Intrinsics.areEqual(self.active_indicators, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.active_indicators);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.instrument_id);
            }
            if (Double.compare(self.trade_amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.trade_amount));
            }
            boolean z = self.auto_send_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 6, z);
            }
            if (!Intrinsics.areEqual(self.indicator_id, "")) {
                output.encodeStringElement(serialDesc, 7, self.indicator_id);
            }
            if (!Intrinsics.areEqual(self.set_id, "")) {
                output.encodeStringElement(serialDesc, 8, self.set_id);
            }
            IndicatorSettingsDto indicatorSettingsDto = self.indicator_settings;
            if (indicatorSettingsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, IndicatorSettingsDto.Serializer.INSTANCE, indicatorSettingsDto);
            }
            ChartSettingsDto chartSettingsDto = self.chart_settings;
            if (chartSettingsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, ChartSettingsDto.Serializer.INSTANCE, chartSettingsDto);
            }
            if (Double.compare(self.price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 11, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.price));
            }
            if (Intrinsics.areEqual(self.ref_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 12, self.ref_id);
        }

        public Surrogate(String selected_span, String selected_interval, String selected_template, java.util.List<String> active_indicators, String instrument_id, double d, boolean z, String indicator_id, String set_id, IndicatorSettingsDto indicatorSettingsDto, ChartSettingsDto chartSettingsDto, double d2, String ref_id) {
            Intrinsics.checkNotNullParameter(selected_span, "selected_span");
            Intrinsics.checkNotNullParameter(selected_interval, "selected_interval");
            Intrinsics.checkNotNullParameter(selected_template, "selected_template");
            Intrinsics.checkNotNullParameter(active_indicators, "active_indicators");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(indicator_id, "indicator_id");
            Intrinsics.checkNotNullParameter(set_id, "set_id");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            this.selected_span = selected_span;
            this.selected_interval = selected_interval;
            this.selected_template = selected_template;
            this.active_indicators = active_indicators;
            this.instrument_id = instrument_id;
            this.trade_amount = d;
            this.auto_send_enabled = z;
            this.indicator_id = indicator_id;
            this.set_id = set_id;
            this.indicator_settings = indicatorSettingsDto;
            this.chart_settings = chartSettingsDto;
            this.price = d2;
            this.ref_id = ref_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, java.util.List list, String str4, double d, boolean z, String str5, String str6, IndicatorSettingsDto indicatorSettingsDto, ChartSettingsDto chartSettingsDto, double d2, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? false : z, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? null : indicatorSettingsDto, (i & 1024) == 0 ? chartSettingsDto : null, (i & 2048) != 0 ? 0.0d : d2, (i & 4096) != 0 ? "" : str7);
        }

        public final String getSelected_span() {
            return this.selected_span;
        }

        public final String getSelected_interval() {
            return this.selected_interval;
        }

        public final String getSelected_template() {
            return this.selected_template;
        }

        public final java.util.List<String> getActive_indicators() {
            return this.active_indicators;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final double getTrade_amount() {
            return this.trade_amount;
        }

        public final boolean getAuto_send_enabled() {
            return this.auto_send_enabled;
        }

        public final String getIndicator_id() {
            return this.indicator_id;
        }

        public final String getSet_id() {
            return this.set_id;
        }

        public final IndicatorSettingsDto getIndicator_settings() {
            return this.indicator_settings;
        }

        public final ChartSettingsDto getChart_settings() {
            return this.chart_settings;
        }

        public final double getPrice() {
            return this.price;
        }

        public final String getRef_id() {
            return this.ref_id;
        }
    }

    /* compiled from: LegendAdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LegendAdvancedChartsContextDto, LegendAdvancedChartsContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LegendAdvancedChartsContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LegendAdvancedChartsContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LegendAdvancedChartsContextDto> getBinaryBase64Serializer() {
            return (KSerializer) LegendAdvancedChartsContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LegendAdvancedChartsContext> getProtoAdapter() {
            return LegendAdvancedChartsContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LegendAdvancedChartsContextDto getZeroValue() {
            return LegendAdvancedChartsContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LegendAdvancedChartsContextDto fromProto(LegendAdvancedChartsContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String selected_span = proto.getSelected_span();
            String selected_interval = proto.getSelected_interval();
            String selected_template = proto.getSelected_template();
            java.util.List<String> active_indicators = proto.getActive_indicators();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(active_indicators, 10));
            Iterator<T> it = active_indicators.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            String instrument_id = proto.getInstrument_id();
            double trade_amount = proto.getTrade_amount();
            boolean auto_send_enabled = proto.getAuto_send_enabled();
            String indicator_id = proto.getIndicator_id();
            String set_id = proto.getSet_id();
            LegendAdvancedChartsContext.IndicatorSettings indicator_settings = proto.getIndicator_settings();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IndicatorSettingsDto indicatorSettingsDtoFromProto = indicator_settings != null ? IndicatorSettingsDto.INSTANCE.fromProto(indicator_settings) : null;
            LegendAdvancedChartsContext.ChartSettings chart_settings = proto.getChart_settings();
            return new LegendAdvancedChartsContextDto(new Surrogate(selected_span, selected_interval, selected_template, arrayList, instrument_id, trade_amount, auto_send_enabled, indicator_id, set_id, indicatorSettingsDtoFromProto, chart_settings != null ? ChartSettingsDto.INSTANCE.fromProto(chart_settings) : null, proto.getPrice(), proto.getRef_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LegendAdvancedChartsContextDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new LegendAdvancedChartsContextDto(null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LegendAdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$IndicatorSettings;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto$Surrogate;)V", "parameter_id", "", "line_title", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getParameter_id", "()Ljava/lang/String;", "getLine_title", "getValue", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class IndicatorSettingsDto implements Dto3<LegendAdvancedChartsContext.IndicatorSettings>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<IndicatorSettingsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<IndicatorSettingsDto, LegendAdvancedChartsContext.IndicatorSettings>> binaryBase64Serializer$delegate;
        private static final IndicatorSettingsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ IndicatorSettingsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private IndicatorSettingsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getParameter_id() {
            return this.surrogate.getParameter_id();
        }

        public final String getLine_title() {
            return this.surrogate.getLine_title();
        }

        public final String getValue() {
            return this.surrogate.getValue();
        }

        public /* synthetic */ IndicatorSettingsDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IndicatorSettingsDto(String parameter_id, String line_title, String value) {
            this(new Surrogate(parameter_id, line_title, value));
            Intrinsics.checkNotNullParameter(parameter_id, "parameter_id");
            Intrinsics.checkNotNullParameter(line_title, "line_title");
            Intrinsics.checkNotNullParameter(value, "value");
        }

        public static /* synthetic */ IndicatorSettingsDto copy$default(IndicatorSettingsDto indicatorSettingsDto, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = indicatorSettingsDto.surrogate.getParameter_id();
            }
            if ((i & 2) != 0) {
                str2 = indicatorSettingsDto.surrogate.getLine_title();
            }
            if ((i & 4) != 0) {
                str3 = indicatorSettingsDto.surrogate.getValue();
            }
            return indicatorSettingsDto.copy(str, str2, str3);
        }

        public final IndicatorSettingsDto copy(String parameter_id, String line_title, String value) {
            Intrinsics.checkNotNullParameter(parameter_id, "parameter_id");
            Intrinsics.checkNotNullParameter(line_title, "line_title");
            Intrinsics.checkNotNullParameter(value, "value");
            return new IndicatorSettingsDto(new Surrogate(parameter_id, line_title, value));
        }

        @Override // com.robinhood.idl.Dto
        public LegendAdvancedChartsContext.IndicatorSettings toProto() {
            return new LegendAdvancedChartsContext.IndicatorSettings(this.surrogate.getParameter_id(), this.surrogate.getLine_title(), this.surrogate.getValue(), null, 8, null);
        }

        public String toString() {
            return "[IndicatorSettingsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof IndicatorSettingsDto) && Intrinsics.areEqual(((IndicatorSettingsDto) other).surrogate, this.surrogate);
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
        /* compiled from: LegendAdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002&'B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto$Surrogate;", "", "parameter_id", "", "line_title", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getParameter_id$annotations", "()V", "getParameter_id", "()Ljava/lang/String;", "getLine_title$annotations", "getLine_title", "getValue$annotations", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String line_title;
            private final String parameter_id;
            private final String value;

            public Surrogate() {
                this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = surrogate.parameter_id;
                }
                if ((i & 2) != 0) {
                    str2 = surrogate.line_title;
                }
                if ((i & 4) != 0) {
                    str3 = surrogate.value;
                }
                return surrogate.copy(str, str2, str3);
            }

            @SerialName("lineTitle")
            @JsonAnnotations2(names = {"line_title"})
            public static /* synthetic */ void getLine_title$annotations() {
            }

            @SerialName("parameterId")
            @JsonAnnotations2(names = {"parameter_id"})
            public static /* synthetic */ void getParameter_id$annotations() {
            }

            @SerialName("value")
            @JsonAnnotations2(names = {"value"})
            public static /* synthetic */ void getValue$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getParameter_id() {
                return this.parameter_id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getLine_title() {
                return this.line_title;
            }

            /* renamed from: component3, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final Surrogate copy(String parameter_id, String line_title, String value) {
                Intrinsics.checkNotNullParameter(parameter_id, "parameter_id");
                Intrinsics.checkNotNullParameter(line_title, "line_title");
                Intrinsics.checkNotNullParameter(value, "value");
                return new Surrogate(parameter_id, line_title, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.parameter_id, surrogate.parameter_id) && Intrinsics.areEqual(this.line_title, surrogate.line_title) && Intrinsics.areEqual(this.value, surrogate.value);
            }

            public int hashCode() {
                return (((this.parameter_id.hashCode() * 31) + this.line_title.hashCode()) * 31) + this.value.hashCode();
            }

            public String toString() {
                return "Surrogate(parameter_id=" + this.parameter_id + ", line_title=" + this.line_title + ", value=" + this.value + ")";
            }

            /* compiled from: LegendAdvancedChartsContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return LegendAdvancedChartsContextDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.parameter_id = "";
                } else {
                    this.parameter_id = str;
                }
                if ((i & 2) == 0) {
                    this.line_title = "";
                } else {
                    this.line_title = str2;
                }
                if ((i & 4) == 0) {
                    this.value = "";
                } else {
                    this.value = str3;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.parameter_id, "")) {
                    output.encodeStringElement(serialDesc, 0, self.parameter_id);
                }
                if (!Intrinsics.areEqual(self.line_title, "")) {
                    output.encodeStringElement(serialDesc, 1, self.line_title);
                }
                if (Intrinsics.areEqual(self.value, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 2, self.value);
            }

            public Surrogate(String parameter_id, String line_title, String value) {
                Intrinsics.checkNotNullParameter(parameter_id, "parameter_id");
                Intrinsics.checkNotNullParameter(line_title, "line_title");
                Intrinsics.checkNotNullParameter(value, "value");
                this.parameter_id = parameter_id;
                this.line_title = line_title;
                this.value = value;
            }

            public /* synthetic */ Surrogate(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
            }

            public final String getParameter_id() {
                return this.parameter_id;
            }

            public final String getLine_title() {
                return this.line_title;
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: LegendAdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$IndicatorSettings;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<IndicatorSettingsDto, LegendAdvancedChartsContext.IndicatorSettings> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<IndicatorSettingsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IndicatorSettingsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IndicatorSettingsDto> getBinaryBase64Serializer() {
                return (KSerializer) IndicatorSettingsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<LegendAdvancedChartsContext.IndicatorSettings> getProtoAdapter() {
                return LegendAdvancedChartsContext.IndicatorSettings.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IndicatorSettingsDto getZeroValue() {
                return IndicatorSettingsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IndicatorSettingsDto fromProto(LegendAdvancedChartsContext.IndicatorSettings proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new IndicatorSettingsDto(new Surrogate(proto.getParameter_id(), proto.getLine_title(), proto.getValue()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContextDto$IndicatorSettingsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LegendAdvancedChartsContextDto.IndicatorSettingsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new IndicatorSettingsDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: LegendAdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<IndicatorSettingsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.LegendAdvancedChartsContext.IndicatorSettings", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, IndicatorSettingsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public IndicatorSettingsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new IndicatorSettingsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: LegendAdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$IndicatorSettingsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4188_4)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContextDto$IndicatorSettingsDto";
            }
        }
    }

    /* compiled from: LegendAdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$ChartSettings;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto$Surrogate;)V", "key", "", "value", "state", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getValue", "getState", "()Z", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ChartSettingsDto implements Dto3<LegendAdvancedChartsContext.ChartSettings>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ChartSettingsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ChartSettingsDto, LegendAdvancedChartsContext.ChartSettings>> binaryBase64Serializer$delegate;
        private static final ChartSettingsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ChartSettingsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ChartSettingsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getKey() {
            return this.surrogate.getKey();
        }

        public final String getValue() {
            return this.surrogate.getValue();
        }

        public final boolean getState() {
            return this.surrogate.getState();
        }

        public /* synthetic */ ChartSettingsDto(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChartSettingsDto(String key, String value, boolean z) {
            this(new Surrogate(key, value, z));
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
        }

        public static /* synthetic */ ChartSettingsDto copy$default(ChartSettingsDto chartSettingsDto, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chartSettingsDto.surrogate.getKey();
            }
            if ((i & 2) != 0) {
                str2 = chartSettingsDto.surrogate.getValue();
            }
            if ((i & 4) != 0) {
                z = chartSettingsDto.surrogate.getState();
            }
            return chartSettingsDto.copy(str, str2, z);
        }

        public final ChartSettingsDto copy(String key, String value, boolean state) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return new ChartSettingsDto(new Surrogate(key, value, state));
        }

        @Override // com.robinhood.idl.Dto
        public LegendAdvancedChartsContext.ChartSettings toProto() {
            return new LegendAdvancedChartsContext.ChartSettings(this.surrogate.getKey(), this.surrogate.getValue(), this.surrogate.getState(), null, 8, null);
        }

        public String toString() {
            return "[ChartSettingsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ChartSettingsDto) && Intrinsics.areEqual(((ChartSettingsDto) other).surrogate, this.surrogate);
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
        /* compiled from: LegendAdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002'(B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto$Surrogate;", "", "key", "", "value", "state", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getKey$annotations", "()V", "getKey", "()Ljava/lang/String;", "getValue$annotations", "getValue", "getState$annotations", "getState", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;
            private final boolean state;
            private final String value;

            public Surrogate() {
                this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = surrogate.key;
                }
                if ((i & 2) != 0) {
                    str2 = surrogate.value;
                }
                if ((i & 4) != 0) {
                    z = surrogate.state;
                }
                return surrogate.copy(str, str2, z);
            }

            @SerialName("key")
            @JsonAnnotations2(names = {"key"})
            public static /* synthetic */ void getKey$annotations() {
            }

            @SerialName("state")
            @JsonAnnotations2(names = {"state"})
            public static /* synthetic */ void getState$annotations() {
            }

            @SerialName("value")
            @JsonAnnotations2(names = {"value"})
            public static /* synthetic */ void getValue$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getState() {
                return this.state;
            }

            public final Surrogate copy(String key, String value, boolean state) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                return new Surrogate(key, value, state);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.key, surrogate.key) && Intrinsics.areEqual(this.value, surrogate.value) && this.state == surrogate.state;
            }

            public int hashCode() {
                return (((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + java.lang.Boolean.hashCode(this.state);
            }

            public String toString() {
                return "Surrogate(key=" + this.key + ", value=" + this.value + ", state=" + this.state + ")";
            }

            /* compiled from: LegendAdvancedChartsContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return LegendAdvancedChartsContextDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.key = "";
                } else {
                    this.key = str;
                }
                if ((i & 2) == 0) {
                    this.value = "";
                } else {
                    this.value = str2;
                }
                if ((i & 4) == 0) {
                    this.state = false;
                } else {
                    this.state = z;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.key, "")) {
                    output.encodeStringElement(serialDesc, 0, self.key);
                }
                if (!Intrinsics.areEqual(self.value, "")) {
                    output.encodeStringElement(serialDesc, 1, self.value);
                }
                boolean z = self.state;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 2, z);
                }
            }

            public Surrogate(String key, String value, boolean z) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                this.key = key;
                this.value = value;
                this.state = z;
            }

            public /* synthetic */ Surrogate(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
            }

            public final String getKey() {
                return this.key;
            }

            public final String getValue() {
                return this.value;
            }

            public final boolean getState() {
                return this.state;
            }
        }

        /* compiled from: LegendAdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$ChartSettings;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<ChartSettingsDto, LegendAdvancedChartsContext.ChartSettings> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ChartSettingsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChartSettingsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChartSettingsDto> getBinaryBase64Serializer() {
                return (KSerializer) ChartSettingsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<LegendAdvancedChartsContext.ChartSettings> getProtoAdapter() {
                return LegendAdvancedChartsContext.ChartSettings.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartSettingsDto getZeroValue() {
                return ChartSettingsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartSettingsDto fromProto(LegendAdvancedChartsContext.ChartSettings proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new ChartSettingsDto(new Surrogate(proto.getKey(), proto.getValue(), proto.getState()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContextDto$ChartSettingsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LegendAdvancedChartsContextDto.ChartSettingsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ChartSettingsDto(null, null, false, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: LegendAdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ChartSettingsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.LegendAdvancedChartsContext.ChartSettings", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ChartSettingsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ChartSettingsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ChartSettingsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: LegendAdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$ChartSettingsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContextDto$ChartSettingsDto";
            }
        }
    }

    /* compiled from: LegendAdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LegendAdvancedChartsContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.LegendAdvancedChartsContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LegendAdvancedChartsContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LegendAdvancedChartsContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LegendAdvancedChartsContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LegendAdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContextDto";
        }
    }
}
