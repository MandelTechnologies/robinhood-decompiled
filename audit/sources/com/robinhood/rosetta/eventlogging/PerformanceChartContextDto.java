package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.PerformanceChartContext;
import com.robinhood.rosetta.eventlogging.PerformanceChartContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: PerformanceChartContextDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007+,-./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0012J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\u0013\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$Surrogate;)V", "span_selected", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "selected_chart_View", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;", "chart_type", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "returns_comparison_symbols", "", "has_privacy_enabled", "", "(Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;Ljava/lang/String;Z)V", "getSpan_selected", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "getSelected_chart_View", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;", "getChart_type", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "getReturns_comparison_symbols", "()Ljava/lang/String;", "getHas_privacy_enabled", "()Z", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SpanDto", "ChartViewDto", "ChartTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class PerformanceChartContextDto implements Dto3<PerformanceChartContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PerformanceChartContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PerformanceChartContextDto, PerformanceChartContext>> binaryBase64Serializer$delegate;
    private static final PerformanceChartContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PerformanceChartContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PerformanceChartContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final SpanDto getSpan_selected() {
        return this.surrogate.getSpan_selected();
    }

    public final ChartViewDto getSelected_chart_View() {
        return this.surrogate.getSelected_chart_View();
    }

    public final ChartTypeDto getChart_type() {
        return this.surrogate.getChart_type();
    }

    public final String getReturns_comparison_symbols() {
        return this.surrogate.getReturns_comparison_symbols();
    }

    public final boolean getHas_privacy_enabled() {
        return this.surrogate.getHas_privacy_enabled();
    }

    public /* synthetic */ PerformanceChartContextDto(SpanDto spanDto, ChartViewDto chartViewDto, ChartTypeDto chartTypeDto, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SpanDto.INSTANCE.getZeroValue() : spanDto, (i & 2) != 0 ? ChartViewDto.INSTANCE.getZeroValue() : chartViewDto, (i & 4) != 0 ? ChartTypeDto.INSTANCE.getZeroValue() : chartTypeDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerformanceChartContextDto(SpanDto span_selected, ChartViewDto selected_chart_View, ChartTypeDto chart_type, String returns_comparison_symbols, boolean z) {
        this(new Surrogate(span_selected, selected_chart_View, chart_type, returns_comparison_symbols, z));
        Intrinsics.checkNotNullParameter(span_selected, "span_selected");
        Intrinsics.checkNotNullParameter(selected_chart_View, "selected_chart_View");
        Intrinsics.checkNotNullParameter(chart_type, "chart_type");
        Intrinsics.checkNotNullParameter(returns_comparison_symbols, "returns_comparison_symbols");
    }

    public static /* synthetic */ PerformanceChartContextDto copy$default(PerformanceChartContextDto performanceChartContextDto, SpanDto spanDto, ChartViewDto chartViewDto, ChartTypeDto chartTypeDto, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            spanDto = performanceChartContextDto.surrogate.getSpan_selected();
        }
        if ((i & 2) != 0) {
            chartViewDto = performanceChartContextDto.surrogate.getSelected_chart_View();
        }
        if ((i & 4) != 0) {
            chartTypeDto = performanceChartContextDto.surrogate.getChart_type();
        }
        if ((i & 8) != 0) {
            str = performanceChartContextDto.surrogate.getReturns_comparison_symbols();
        }
        if ((i & 16) != 0) {
            z = performanceChartContextDto.surrogate.getHas_privacy_enabled();
        }
        boolean z2 = z;
        ChartTypeDto chartTypeDto2 = chartTypeDto;
        return performanceChartContextDto.copy(spanDto, chartViewDto, chartTypeDto2, str, z2);
    }

    public final PerformanceChartContextDto copy(SpanDto span_selected, ChartViewDto selected_chart_View, ChartTypeDto chart_type, String returns_comparison_symbols, boolean has_privacy_enabled) {
        Intrinsics.checkNotNullParameter(span_selected, "span_selected");
        Intrinsics.checkNotNullParameter(selected_chart_View, "selected_chart_View");
        Intrinsics.checkNotNullParameter(chart_type, "chart_type");
        Intrinsics.checkNotNullParameter(returns_comparison_symbols, "returns_comparison_symbols");
        return new PerformanceChartContextDto(new Surrogate(span_selected, selected_chart_View, chart_type, returns_comparison_symbols, has_privacy_enabled));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PerformanceChartContext toProto() {
        return new PerformanceChartContext((PerformanceChartContext.Span) this.surrogate.getSpan_selected().toProto(), (PerformanceChartContext.ChartView) this.surrogate.getSelected_chart_View().toProto(), (PerformanceChartContext.ChartType) this.surrogate.getChart_type().toProto(), this.surrogate.getReturns_comparison_symbols(), this.surrogate.getHas_privacy_enabled(), null, 32, null);
    }

    public String toString() {
        return "[PerformanceChartContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PerformanceChartContextDto) && Intrinsics.areEqual(((PerformanceChartContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: PerformanceChartContextDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000256B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rBK\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J;\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000fHÖ\u0001J\t\u0010,\u001a\u00020\tHÖ\u0001J%\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\"¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$Surrogate;", "", "span_selected", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "selected_chart_View", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;", "chart_type", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "returns_comparison_symbols", "", "has_privacy_enabled", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSpan_selected$annotations", "()V", "getSpan_selected", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "getSelected_chart_View$annotations", "getSelected_chart_View", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;", "getChart_type$annotations", "getChart_type", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "getReturns_comparison_symbols$annotations", "getReturns_comparison_symbols", "()Ljava/lang/String;", "getHas_privacy_enabled$annotations", "getHas_privacy_enabled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ChartTypeDto chart_type;
        private final boolean has_privacy_enabled;
        private final String returns_comparison_symbols;
        private final ChartViewDto selected_chart_View;
        private final SpanDto span_selected;

        public Surrogate() {
            this((SpanDto) null, (ChartViewDto) null, (ChartTypeDto) null, (String) null, false, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, SpanDto spanDto, ChartViewDto chartViewDto, ChartTypeDto chartTypeDto, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                spanDto = surrogate.span_selected;
            }
            if ((i & 2) != 0) {
                chartViewDto = surrogate.selected_chart_View;
            }
            if ((i & 4) != 0) {
                chartTypeDto = surrogate.chart_type;
            }
            if ((i & 8) != 0) {
                str = surrogate.returns_comparison_symbols;
            }
            if ((i & 16) != 0) {
                z = surrogate.has_privacy_enabled;
            }
            boolean z2 = z;
            ChartTypeDto chartTypeDto2 = chartTypeDto;
            return surrogate.copy(spanDto, chartViewDto, chartTypeDto2, str, z2);
        }

        @SerialName("chartType")
        @JsonAnnotations2(names = {"chart_type"})
        public static /* synthetic */ void getChart_type$annotations() {
        }

        @SerialName("hasPrivacyEnabled")
        @JsonAnnotations2(names = {"has_privacy_enabled"})
        public static /* synthetic */ void getHas_privacy_enabled$annotations() {
        }

        @SerialName("returnsComparisonSymbols")
        @JsonAnnotations2(names = {"returns_comparison_symbols"})
        public static /* synthetic */ void getReturns_comparison_symbols$annotations() {
        }

        @SerialName("selectedChartView")
        @JsonAnnotations2(names = {"selected_chart_View"})
        public static /* synthetic */ void getSelected_chart_View$annotations() {
        }

        @SerialName("spanSelected")
        @JsonAnnotations2(names = {"span_selected"})
        public static /* synthetic */ void getSpan_selected$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final SpanDto getSpan_selected() {
            return this.span_selected;
        }

        /* renamed from: component2, reason: from getter */
        public final ChartViewDto getSelected_chart_View() {
            return this.selected_chart_View;
        }

        /* renamed from: component3, reason: from getter */
        public final ChartTypeDto getChart_type() {
            return this.chart_type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getReturns_comparison_symbols() {
            return this.returns_comparison_symbols;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHas_privacy_enabled() {
            return this.has_privacy_enabled;
        }

        public final Surrogate copy(SpanDto span_selected, ChartViewDto selected_chart_View, ChartTypeDto chart_type, String returns_comparison_symbols, boolean has_privacy_enabled) {
            Intrinsics.checkNotNullParameter(span_selected, "span_selected");
            Intrinsics.checkNotNullParameter(selected_chart_View, "selected_chart_View");
            Intrinsics.checkNotNullParameter(chart_type, "chart_type");
            Intrinsics.checkNotNullParameter(returns_comparison_symbols, "returns_comparison_symbols");
            return new Surrogate(span_selected, selected_chart_View, chart_type, returns_comparison_symbols, has_privacy_enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.span_selected == surrogate.span_selected && this.selected_chart_View == surrogate.selected_chart_View && this.chart_type == surrogate.chart_type && Intrinsics.areEqual(this.returns_comparison_symbols, surrogate.returns_comparison_symbols) && this.has_privacy_enabled == surrogate.has_privacy_enabled;
        }

        public int hashCode() {
            return (((((((this.span_selected.hashCode() * 31) + this.selected_chart_View.hashCode()) * 31) + this.chart_type.hashCode()) * 31) + this.returns_comparison_symbols.hashCode()) * 31) + java.lang.Boolean.hashCode(this.has_privacy_enabled);
        }

        public String toString() {
            return "Surrogate(span_selected=" + this.span_selected + ", selected_chart_View=" + this.selected_chart_View + ", chart_type=" + this.chart_type + ", returns_comparison_symbols=" + this.returns_comparison_symbols + ", has_privacy_enabled=" + this.has_privacy_enabled + ")";
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PerformanceChartContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SpanDto spanDto, ChartViewDto chartViewDto, ChartTypeDto chartTypeDto, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.span_selected = (i & 1) == 0 ? SpanDto.INSTANCE.getZeroValue() : spanDto;
            if ((i & 2) == 0) {
                this.selected_chart_View = ChartViewDto.INSTANCE.getZeroValue();
            } else {
                this.selected_chart_View = chartViewDto;
            }
            if ((i & 4) == 0) {
                this.chart_type = ChartTypeDto.INSTANCE.getZeroValue();
            } else {
                this.chart_type = chartTypeDto;
            }
            if ((i & 8) == 0) {
                this.returns_comparison_symbols = "";
            } else {
                this.returns_comparison_symbols = str;
            }
            if ((i & 16) == 0) {
                this.has_privacy_enabled = false;
            } else {
                this.has_privacy_enabled = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.span_selected != SpanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, SpanDto.Serializer.INSTANCE, self.span_selected);
            }
            if (self.selected_chart_View != ChartViewDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ChartViewDto.Serializer.INSTANCE, self.selected_chart_View);
            }
            if (self.chart_type != ChartTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ChartTypeDto.Serializer.INSTANCE, self.chart_type);
            }
            if (!Intrinsics.areEqual(self.returns_comparison_symbols, "")) {
                output.encodeStringElement(serialDesc, 3, self.returns_comparison_symbols);
            }
            boolean z = self.has_privacy_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
        }

        public Surrogate(SpanDto span_selected, ChartViewDto selected_chart_View, ChartTypeDto chart_type, String returns_comparison_symbols, boolean z) {
            Intrinsics.checkNotNullParameter(span_selected, "span_selected");
            Intrinsics.checkNotNullParameter(selected_chart_View, "selected_chart_View");
            Intrinsics.checkNotNullParameter(chart_type, "chart_type");
            Intrinsics.checkNotNullParameter(returns_comparison_symbols, "returns_comparison_symbols");
            this.span_selected = span_selected;
            this.selected_chart_View = selected_chart_View;
            this.chart_type = chart_type;
            this.returns_comparison_symbols = returns_comparison_symbols;
            this.has_privacy_enabled = z;
        }

        public final SpanDto getSpan_selected() {
            return this.span_selected;
        }

        public /* synthetic */ Surrogate(SpanDto spanDto, ChartViewDto chartViewDto, ChartTypeDto chartTypeDto, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SpanDto.INSTANCE.getZeroValue() : spanDto, (i & 2) != 0 ? ChartViewDto.INSTANCE.getZeroValue() : chartViewDto, (i & 4) != 0 ? ChartTypeDto.INSTANCE.getZeroValue() : chartTypeDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z);
        }

        public final ChartViewDto getSelected_chart_View() {
            return this.selected_chart_View;
        }

        public final ChartTypeDto getChart_type() {
            return this.chart_type;
        }

        public final String getReturns_comparison_symbols() {
            return this.returns_comparison_symbols;
        }

        public final boolean getHas_privacy_enabled() {
            return this.has_privacy_enabled;
        }
    }

    /* compiled from: PerformanceChartContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PerformanceChartContextDto, PerformanceChartContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PerformanceChartContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerformanceChartContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerformanceChartContextDto> getBinaryBase64Serializer() {
            return (KSerializer) PerformanceChartContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PerformanceChartContext> getProtoAdapter() {
            return PerformanceChartContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerformanceChartContextDto getZeroValue() {
            return PerformanceChartContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerformanceChartContextDto fromProto(PerformanceChartContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PerformanceChartContextDto(new Surrogate(SpanDto.INSTANCE.fromProto(proto.getSpan_selected()), ChartViewDto.INSTANCE.fromProto(proto.getSelected_chart_View()), ChartTypeDto.INSTANCE.fromProto(proto.getChart_type()), proto.getReturns_comparison_symbols(), proto.getHas_privacy_enabled()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceChartContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerformanceChartContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PerformanceChartContextDto(null, null, null, null, false, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceChartContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SPAN_UNSPECIFIED", "LIVE", "ONE_DAY", "ONE_WEEK", "ONE_MONTH", "THREE_MONTHS", DisplaySpans.YTD, "ONE_YEAR", DisplaySpans.ALL, "FOUR_HOUR", "UNKNOWN", "ONE_HOUR", "FIVE_YEARS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SpanDto implements Dto2<PerformanceChartContext.Span>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SpanDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SpanDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SpanDto, PerformanceChartContext.Span>> binaryBase64Serializer$delegate;
        public static final SpanDto SPAN_UNSPECIFIED = new SPAN_UNSPECIFIED("SPAN_UNSPECIFIED", 0);
        public static final SpanDto LIVE = new LIVE("LIVE", 1);
        public static final SpanDto ONE_DAY = new ONE_DAY("ONE_DAY", 2);
        public static final SpanDto ONE_WEEK = new ONE_WEEK("ONE_WEEK", 3);
        public static final SpanDto ONE_MONTH = new ONE_MONTH("ONE_MONTH", 4);
        public static final SpanDto THREE_MONTHS = new THREE_MONTHS("THREE_MONTHS", 5);
        public static final SpanDto YTD = new YTD(DisplaySpans.YTD, 6);
        public static final SpanDto ONE_YEAR = new ONE_YEAR("ONE_YEAR", 7);
        public static final SpanDto ALL = new ALL(DisplaySpans.ALL, 8);
        public static final SpanDto FOUR_HOUR = new FOUR_HOUR("FOUR_HOUR", 9);
        public static final SpanDto UNKNOWN = new UNKNOWN("UNKNOWN", 10);
        public static final SpanDto ONE_HOUR = new ONE_HOUR("ONE_HOUR", 11);
        public static final SpanDto FIVE_YEARS = new FIVE_YEARS("FIVE_YEARS", 12);

        private static final /* synthetic */ SpanDto[] $values() {
            return new SpanDto[]{SPAN_UNSPECIFIED, LIVE, ONE_DAY, ONE_WEEK, ONE_MONTH, THREE_MONTHS, YTD, ONE_YEAR, ALL, FOUR_HOUR, UNKNOWN, ONE_HOUR, FIVE_YEARS};
        }

        public /* synthetic */ SpanDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SpanDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.SPAN_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SPAN_UNSPECIFIED extends SpanDto {
            SPAN_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.SPAN_UNSPECIFIED;
            }
        }

        private SpanDto(String str, int i) {
        }

        static {
            SpanDto[] spanDtoArr$values = $values();
            $VALUES = spanDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(spanDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceChartContextDto$SpanDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerformanceChartContextDto.SpanDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.LIVE", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIVE extends SpanDto {
            LIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.LIVE;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.ONE_DAY", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_DAY extends SpanDto {
            ONE_DAY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.ONE_DAY;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.ONE_WEEK", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_WEEK extends SpanDto {
            ONE_WEEK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.ONE_WEEK;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.ONE_MONTH", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_MONTH extends SpanDto {
            ONE_MONTH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.ONE_MONTH;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.THREE_MONTHS", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class THREE_MONTHS extends SpanDto {
            THREE_MONTHS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.THREE_MONTHS;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.YTD", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class YTD extends SpanDto {
            YTD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.YTD;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.ONE_YEAR", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_YEAR extends SpanDto {
            ONE_YEAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.ONE_YEAR;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.ALL", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ALL extends SpanDto {
            ALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.ALL;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.FOUR_HOUR", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FOUR_HOUR extends SpanDto {
            FOUR_HOUR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.FOUR_HOUR;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.UNKNOWN", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNKNOWN extends SpanDto {
            UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.UNKNOWN;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.ONE_HOUR", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class ONE_HOUR extends SpanDto {
            ONE_HOUR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.ONE_HOUR;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.SpanDto.FIVE_YEARS", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class FIVE_YEARS extends SpanDto {
            FIVE_YEARS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.Span toProto() {
                return PerformanceChartContext.Span.FIVE_YEARS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SpanDto, PerformanceChartContext.Span> {

            /* compiled from: PerformanceChartContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerformanceChartContext.Span.values().length];
                    try {
                        iArr[PerformanceChartContext.Span.SPAN_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.LIVE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.ONE_DAY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.ONE_WEEK.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.ONE_MONTH.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.THREE_MONTHS.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.YTD.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.ONE_YEAR.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.ALL.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.FOUR_HOUR.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.UNKNOWN.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.ONE_HOUR.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[PerformanceChartContext.Span.FIVE_YEARS.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SpanDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SpanDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SpanDto> getBinaryBase64Serializer() {
                return (KSerializer) SpanDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerformanceChartContext.Span> getProtoAdapter() {
                return PerformanceChartContext.Span.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpanDto getZeroValue() {
                return SpanDto.SPAN_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpanDto fromProto(PerformanceChartContext.Span proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return SpanDto.SPAN_UNSPECIFIED;
                    case 2:
                        return SpanDto.LIVE;
                    case 3:
                        return SpanDto.ONE_DAY;
                    case 4:
                        return SpanDto.ONE_WEEK;
                    case 5:
                        return SpanDto.ONE_MONTH;
                    case 6:
                        return SpanDto.THREE_MONTHS;
                    case 7:
                        return SpanDto.YTD;
                    case 8:
                        return SpanDto.ONE_YEAR;
                    case 9:
                        return SpanDto.ALL;
                    case 10:
                        return SpanDto.FOUR_HOUR;
                    case 11:
                        return SpanDto.UNKNOWN;
                    case 12:
                        return SpanDto.ONE_HOUR;
                    case 13:
                        return SpanDto.FIVE_YEARS;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$SpanDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<SpanDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SpanDto, PerformanceChartContext.Span> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerformanceChartContext.Span", SpanDto.getEntries(), SpanDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SpanDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SpanDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SpanDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SpanDto valueOf(String str) {
            return (SpanDto) Enum.valueOf(SpanDto.class, str);
        }

        public static SpanDto[] values() {
            return (SpanDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceChartContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHART_VIEW_UNSPECIFIED", "PERFORMANCE", "CONTRIBUTION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ChartViewDto implements Dto2<PerformanceChartContext.ChartView>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChartViewDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ChartViewDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ChartViewDto, PerformanceChartContext.ChartView>> binaryBase64Serializer$delegate;
        public static final ChartViewDto CHART_VIEW_UNSPECIFIED = new CHART_VIEW_UNSPECIFIED("CHART_VIEW_UNSPECIFIED", 0);
        public static final ChartViewDto PERFORMANCE = new PERFORMANCE("PERFORMANCE", 1);
        public static final ChartViewDto CONTRIBUTION = new CONTRIBUTION("CONTRIBUTION", 2);

        private static final /* synthetic */ ChartViewDto[] $values() {
            return new ChartViewDto[]{CHART_VIEW_UNSPECIFIED, PERFORMANCE, CONTRIBUTION};
        }

        public /* synthetic */ ChartViewDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ChartViewDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.ChartViewDto.CHART_VIEW_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHART_VIEW_UNSPECIFIED extends ChartViewDto {
            CHART_VIEW_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.ChartView toProto() {
                return PerformanceChartContext.ChartView.CHART_VIEW_UNSPECIFIED;
            }
        }

        private ChartViewDto(String str, int i) {
        }

        static {
            ChartViewDto[] chartViewDtoArr$values = $values();
            $VALUES = chartViewDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(chartViewDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceChartContextDto$ChartViewDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerformanceChartContextDto.ChartViewDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.ChartViewDto.PERFORMANCE", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERFORMANCE extends ChartViewDto {
            PERFORMANCE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.ChartView toProto() {
                return PerformanceChartContext.ChartView.PERFORMANCE;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.ChartViewDto.CONTRIBUTION", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTRIBUTION extends ChartViewDto {
            CONTRIBUTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.ChartView toProto() {
                return PerformanceChartContext.ChartView.CONTRIBUTION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ChartViewDto, PerformanceChartContext.ChartView> {

            /* compiled from: PerformanceChartContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerformanceChartContext.ChartView.values().length];
                    try {
                        iArr[PerformanceChartContext.ChartView.CHART_VIEW_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerformanceChartContext.ChartView.PERFORMANCE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerformanceChartContext.ChartView.CONTRIBUTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ChartViewDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChartViewDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChartViewDto> getBinaryBase64Serializer() {
                return (KSerializer) ChartViewDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerformanceChartContext.ChartView> getProtoAdapter() {
                return PerformanceChartContext.ChartView.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartViewDto getZeroValue() {
                return ChartViewDto.CHART_VIEW_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartViewDto fromProto(PerformanceChartContext.ChartView proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ChartViewDto.CHART_VIEW_UNSPECIFIED;
                }
                if (i == 2) {
                    return ChartViewDto.PERFORMANCE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return ChartViewDto.CONTRIBUTION;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartViewDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ChartViewDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ChartViewDto, PerformanceChartContext.ChartView> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerformanceChartContext.ChartView", ChartViewDto.getEntries(), ChartViewDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ChartViewDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ChartViewDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ChartViewDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ChartViewDto valueOf(String str) {
            return (ChartViewDto) Enum.valueOf(ChartViewDto.class, str);
        }

        public static ChartViewDto[] values() {
            return (ChartViewDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceChartContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHART_TYPE_UNSPECIFIED", "EQUITY", "CRYPTO", "OPTIONS", "HISTORICAL_PORTFOLIO", "ADVISORY_INSIGHT", "FUTURES", "EVENT_CONTRACT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ChartTypeDto implements Dto2<PerformanceChartContext.ChartType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChartTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ChartTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ChartTypeDto, PerformanceChartContext.ChartType>> binaryBase64Serializer$delegate;
        public static final ChartTypeDto CHART_TYPE_UNSPECIFIED = new CHART_TYPE_UNSPECIFIED("CHART_TYPE_UNSPECIFIED", 0);
        public static final ChartTypeDto EQUITY = new EQUITY("EQUITY", 1);
        public static final ChartTypeDto CRYPTO = new CRYPTO("CRYPTO", 2);
        public static final ChartTypeDto OPTIONS = new OPTIONS("OPTIONS", 3);
        public static final ChartTypeDto HISTORICAL_PORTFOLIO = new HISTORICAL_PORTFOLIO("HISTORICAL_PORTFOLIO", 4);
        public static final ChartTypeDto ADVISORY_INSIGHT = new ADVISORY_INSIGHT("ADVISORY_INSIGHT", 5);
        public static final ChartTypeDto FUTURES = new FUTURES("FUTURES", 6);
        public static final ChartTypeDto EVENT_CONTRACT = new EVENT_CONTRACT("EVENT_CONTRACT", 7);

        private static final /* synthetic */ ChartTypeDto[] $values() {
            return new ChartTypeDto[]{CHART_TYPE_UNSPECIFIED, EQUITY, CRYPTO, OPTIONS, HISTORICAL_PORTFOLIO, ADVISORY_INSIGHT, FUTURES, EVENT_CONTRACT};
        }

        public /* synthetic */ ChartTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ChartTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.ChartTypeDto.CHART_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHART_TYPE_UNSPECIFIED extends ChartTypeDto {
            CHART_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.ChartType toProto() {
                return PerformanceChartContext.ChartType.CHART_TYPE_UNSPECIFIED;
            }
        }

        private ChartTypeDto(String str, int i) {
        }

        static {
            ChartTypeDto[] chartTypeDtoArr$values = $values();
            $VALUES = chartTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(chartTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceChartContextDto$ChartTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerformanceChartContextDto.ChartTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.ChartTypeDto.EQUITY", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EQUITY extends ChartTypeDto {
            EQUITY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.ChartType toProto() {
                return PerformanceChartContext.ChartType.EQUITY;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.ChartTypeDto.CRYPTO", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO extends ChartTypeDto {
            CRYPTO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.ChartType toProto() {
                return PerformanceChartContext.ChartType.CRYPTO;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.ChartTypeDto.OPTIONS", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS extends ChartTypeDto {
            OPTIONS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.ChartType toProto() {
                return PerformanceChartContext.ChartType.OPTIONS;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.ChartTypeDto.HISTORICAL_PORTFOLIO", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class HISTORICAL_PORTFOLIO extends ChartTypeDto {
            HISTORICAL_PORTFOLIO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.ChartType toProto() {
                return PerformanceChartContext.ChartType.HISTORICAL_PORTFOLIO;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.ChartTypeDto.ADVISORY_INSIGHT", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class ADVISORY_INSIGHT extends ChartTypeDto {
            ADVISORY_INSIGHT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.ChartType toProto() {
                return PerformanceChartContext.ChartType.ADVISORY_INSIGHT;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.ChartTypeDto.FUTURES", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class FUTURES extends ChartTypeDto {
            FUTURES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.ChartType toProto() {
                return PerformanceChartContext.ChartType.FUTURES;
            }
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceChartContextDto.ChartTypeDto.EVENT_CONTRACT", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class EVENT_CONTRACT extends ChartTypeDto {
            EVENT_CONTRACT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceChartContext.ChartType toProto() {
                return PerformanceChartContext.ChartType.EVENT_CONTRACT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ChartTypeDto, PerformanceChartContext.ChartType> {

            /* compiled from: PerformanceChartContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerformanceChartContext.ChartType.values().length];
                    try {
                        iArr[PerformanceChartContext.ChartType.CHART_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerformanceChartContext.ChartType.EQUITY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerformanceChartContext.ChartType.CRYPTO.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PerformanceChartContext.ChartType.OPTIONS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PerformanceChartContext.ChartType.HISTORICAL_PORTFOLIO.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[PerformanceChartContext.ChartType.ADVISORY_INSIGHT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[PerformanceChartContext.ChartType.FUTURES.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[PerformanceChartContext.ChartType.EVENT_CONTRACT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ChartTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChartTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChartTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ChartTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerformanceChartContext.ChartType> getProtoAdapter() {
                return PerformanceChartContext.ChartType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartTypeDto getZeroValue() {
                return ChartTypeDto.CHART_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartTypeDto fromProto(PerformanceChartContext.ChartType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ChartTypeDto.CHART_TYPE_UNSPECIFIED;
                    case 2:
                        return ChartTypeDto.EQUITY;
                    case 3:
                        return ChartTypeDto.CRYPTO;
                    case 4:
                        return ChartTypeDto.OPTIONS;
                    case 5:
                        return ChartTypeDto.HISTORICAL_PORTFOLIO;
                    case 6:
                        return ChartTypeDto.ADVISORY_INSIGHT;
                    case 7:
                        return ChartTypeDto.FUTURES;
                    case 8:
                        return ChartTypeDto.EVENT_CONTRACT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerformanceChartContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$ChartTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ChartTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ChartTypeDto, PerformanceChartContext.ChartType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerformanceChartContext.ChartType", ChartTypeDto.getEntries(), ChartTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ChartTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ChartTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ChartTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ChartTypeDto valueOf(String str) {
            return (ChartTypeDto) Enum.valueOf(ChartTypeDto.class, str);
        }

        public static ChartTypeDto[] values() {
            return (ChartTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PerformanceChartContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PerformanceChartContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerformanceChartContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PerformanceChartContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PerformanceChartContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PerformanceChartContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PerformanceChartContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PerformanceChartContextDto";
        }
    }
}
