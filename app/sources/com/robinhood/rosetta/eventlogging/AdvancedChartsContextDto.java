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
import com.robinhood.rosetta.eventlogging.AdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.AdvancedChartsContextDto;
import com.robinhood.rosetta.eventlogging.BooleanDto;
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

/* compiled from: AdvancedChartsContextDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006()*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$Surrogate;)V", "span_selected", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "chart_type", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;", "extended_hours_enabled", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "technical_indicators", "", "(Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;)V", "getSpan_selected", "()Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "getChart_type", "()Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;", "getExtended_hours_enabled", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getTechnical_indicators", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SpanDto", "ChartTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class AdvancedChartsContextDto implements Dto3<AdvancedChartsContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvancedChartsContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvancedChartsContextDto, AdvancedChartsContext>> binaryBase64Serializer$delegate;
    private static final AdvancedChartsContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvancedChartsContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvancedChartsContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final SpanDto getSpan_selected() {
        return this.surrogate.getSpan_selected();
    }

    public final ChartTypeDto getChart_type() {
        return this.surrogate.getChart_type();
    }

    public final BooleanDto getExtended_hours_enabled() {
        return this.surrogate.getExtended_hours_enabled();
    }

    public final String getTechnical_indicators() {
        return this.surrogate.getTechnical_indicators();
    }

    public /* synthetic */ AdvancedChartsContextDto(SpanDto spanDto, ChartTypeDto chartTypeDto, BooleanDto booleanDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SpanDto.INSTANCE.getZeroValue() : spanDto, (i & 2) != 0 ? ChartTypeDto.INSTANCE.getZeroValue() : chartTypeDto, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 8) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvancedChartsContextDto(SpanDto span_selected, ChartTypeDto chart_type, BooleanDto extended_hours_enabled, String technical_indicators) {
        this(new Surrogate(span_selected, chart_type, extended_hours_enabled, technical_indicators));
        Intrinsics.checkNotNullParameter(span_selected, "span_selected");
        Intrinsics.checkNotNullParameter(chart_type, "chart_type");
        Intrinsics.checkNotNullParameter(extended_hours_enabled, "extended_hours_enabled");
        Intrinsics.checkNotNullParameter(technical_indicators, "technical_indicators");
    }

    public static /* synthetic */ AdvancedChartsContextDto copy$default(AdvancedChartsContextDto advancedChartsContextDto, SpanDto spanDto, ChartTypeDto chartTypeDto, BooleanDto booleanDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            spanDto = advancedChartsContextDto.surrogate.getSpan_selected();
        }
        if ((i & 2) != 0) {
            chartTypeDto = advancedChartsContextDto.surrogate.getChart_type();
        }
        if ((i & 4) != 0) {
            booleanDto = advancedChartsContextDto.surrogate.getExtended_hours_enabled();
        }
        if ((i & 8) != 0) {
            str = advancedChartsContextDto.surrogate.getTechnical_indicators();
        }
        return advancedChartsContextDto.copy(spanDto, chartTypeDto, booleanDto, str);
    }

    public final AdvancedChartsContextDto copy(SpanDto span_selected, ChartTypeDto chart_type, BooleanDto extended_hours_enabled, String technical_indicators) {
        Intrinsics.checkNotNullParameter(span_selected, "span_selected");
        Intrinsics.checkNotNullParameter(chart_type, "chart_type");
        Intrinsics.checkNotNullParameter(extended_hours_enabled, "extended_hours_enabled");
        Intrinsics.checkNotNullParameter(technical_indicators, "technical_indicators");
        return new AdvancedChartsContextDto(new Surrogate(span_selected, chart_type, extended_hours_enabled, technical_indicators));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AdvancedChartsContext toProto() {
        return new AdvancedChartsContext((AdvancedChartsContext.Span) this.surrogate.getSpan_selected().toProto(), (AdvancedChartsContext.ChartType) this.surrogate.getChart_type().toProto(), (Boolean) this.surrogate.getExtended_hours_enabled().toProto(), this.surrogate.getTechnical_indicators(), null, 16, null);
    }

    public String toString() {
        return "[AdvancedChartsContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvancedChartsContextDto) && Intrinsics.areEqual(((AdvancedChartsContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J1\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$Surrogate;", "", "span_selected", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "chart_type", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;", "extended_hours_enabled", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "technical_indicators", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSpan_selected$annotations", "()V", "getSpan_selected", "()Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "getChart_type$annotations", "getChart_type", "()Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;", "getExtended_hours_enabled$annotations", "getExtended_hours_enabled", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getTechnical_indicators$annotations", "getTechnical_indicators", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ChartTypeDto chart_type;
        private final BooleanDto extended_hours_enabled;
        private final SpanDto span_selected;
        private final String technical_indicators;

        public Surrogate() {
            this((SpanDto) null, (ChartTypeDto) null, (BooleanDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, SpanDto spanDto, ChartTypeDto chartTypeDto, BooleanDto booleanDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                spanDto = surrogate.span_selected;
            }
            if ((i & 2) != 0) {
                chartTypeDto = surrogate.chart_type;
            }
            if ((i & 4) != 0) {
                booleanDto = surrogate.extended_hours_enabled;
            }
            if ((i & 8) != 0) {
                str = surrogate.technical_indicators;
            }
            return surrogate.copy(spanDto, chartTypeDto, booleanDto, str);
        }

        @SerialName("chartType")
        @JsonAnnotations2(names = {"chart_type"})
        public static /* synthetic */ void getChart_type$annotations() {
        }

        @SerialName("extendedHoursEnabled")
        @JsonAnnotations2(names = {"extended_hours_enabled"})
        public static /* synthetic */ void getExtended_hours_enabled$annotations() {
        }

        @SerialName("spanSelected")
        @JsonAnnotations2(names = {"span_selected"})
        public static /* synthetic */ void getSpan_selected$annotations() {
        }

        @SerialName("technicalIndicators")
        @JsonAnnotations2(names = {"technical_indicators"})
        public static /* synthetic */ void getTechnical_indicators$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final SpanDto getSpan_selected() {
            return this.span_selected;
        }

        /* renamed from: component2, reason: from getter */
        public final ChartTypeDto getChart_type() {
            return this.chart_type;
        }

        /* renamed from: component3, reason: from getter */
        public final BooleanDto getExtended_hours_enabled() {
            return this.extended_hours_enabled;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTechnical_indicators() {
            return this.technical_indicators;
        }

        public final Surrogate copy(SpanDto span_selected, ChartTypeDto chart_type, BooleanDto extended_hours_enabled, String technical_indicators) {
            Intrinsics.checkNotNullParameter(span_selected, "span_selected");
            Intrinsics.checkNotNullParameter(chart_type, "chart_type");
            Intrinsics.checkNotNullParameter(extended_hours_enabled, "extended_hours_enabled");
            Intrinsics.checkNotNullParameter(technical_indicators, "technical_indicators");
            return new Surrogate(span_selected, chart_type, extended_hours_enabled, technical_indicators);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.span_selected == surrogate.span_selected && this.chart_type == surrogate.chart_type && this.extended_hours_enabled == surrogate.extended_hours_enabled && Intrinsics.areEqual(this.technical_indicators, surrogate.technical_indicators);
        }

        public int hashCode() {
            return (((((this.span_selected.hashCode() * 31) + this.chart_type.hashCode()) * 31) + this.extended_hours_enabled.hashCode()) * 31) + this.technical_indicators.hashCode();
        }

        public String toString() {
            return "Surrogate(span_selected=" + this.span_selected + ", chart_type=" + this.chart_type + ", extended_hours_enabled=" + this.extended_hours_enabled + ", technical_indicators=" + this.technical_indicators + ")";
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvancedChartsContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SpanDto spanDto, ChartTypeDto chartTypeDto, BooleanDto booleanDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.span_selected = (i & 1) == 0 ? SpanDto.INSTANCE.getZeroValue() : spanDto;
            if ((i & 2) == 0) {
                this.chart_type = ChartTypeDto.INSTANCE.getZeroValue();
            } else {
                this.chart_type = chartTypeDto;
            }
            if ((i & 4) == 0) {
                this.extended_hours_enabled = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.extended_hours_enabled = booleanDto;
            }
            if ((i & 8) == 0) {
                this.technical_indicators = "";
            } else {
                this.technical_indicators = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.span_selected != SpanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, SpanDto.Serializer.INSTANCE, self.span_selected);
            }
            if (self.chart_type != ChartTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ChartTypeDto.Serializer.INSTANCE, self.chart_type);
            }
            if (self.extended_hours_enabled != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, BooleanDto.Serializer.INSTANCE, self.extended_hours_enabled);
            }
            if (Intrinsics.areEqual(self.technical_indicators, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.technical_indicators);
        }

        public Surrogate(SpanDto span_selected, ChartTypeDto chart_type, BooleanDto extended_hours_enabled, String technical_indicators) {
            Intrinsics.checkNotNullParameter(span_selected, "span_selected");
            Intrinsics.checkNotNullParameter(chart_type, "chart_type");
            Intrinsics.checkNotNullParameter(extended_hours_enabled, "extended_hours_enabled");
            Intrinsics.checkNotNullParameter(technical_indicators, "technical_indicators");
            this.span_selected = span_selected;
            this.chart_type = chart_type;
            this.extended_hours_enabled = extended_hours_enabled;
            this.technical_indicators = technical_indicators;
        }

        public final SpanDto getSpan_selected() {
            return this.span_selected;
        }

        public /* synthetic */ Surrogate(SpanDto spanDto, ChartTypeDto chartTypeDto, BooleanDto booleanDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SpanDto.INSTANCE.getZeroValue() : spanDto, (i & 2) != 0 ? ChartTypeDto.INSTANCE.getZeroValue() : chartTypeDto, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 8) != 0 ? "" : str);
        }

        public final ChartTypeDto getChart_type() {
            return this.chart_type;
        }

        public final BooleanDto getExtended_hours_enabled() {
            return this.extended_hours_enabled;
        }

        public final String getTechnical_indicators() {
            return this.technical_indicators;
        }
    }

    /* compiled from: AdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<AdvancedChartsContextDto, AdvancedChartsContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvancedChartsContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvancedChartsContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvancedChartsContextDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvancedChartsContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvancedChartsContext> getProtoAdapter() {
            return AdvancedChartsContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvancedChartsContextDto getZeroValue() {
            return AdvancedChartsContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvancedChartsContextDto fromProto(AdvancedChartsContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new AdvancedChartsContextDto(new Surrogate(SpanDto.INSTANCE.fromProto(proto.getSpan_selected()), ChartTypeDto.INSTANCE.fromProto(proto.getChart_type()), BooleanDto.INSTANCE.fromProto(proto.getExtended_hours_enabled()), proto.getTechnical_indicators()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AdvancedChartsContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedChartsContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvancedChartsContextDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ONE_DAY", "ONE_WEEK", "ONE_MONTH", "THREE_MONTHS", "ONE_YEAR", "FIVE_YEAR", "ONE_HOUR", "FOUR_HOUR", "YEAR_TO_DATE", DisplaySpans.ALL, "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SpanDto implements Dto2<AdvancedChartsContext.Span>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SpanDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SpanDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SpanDto, AdvancedChartsContext.Span>> binaryBase64Serializer$delegate;
        public static final SpanDto ONE_DAY = new ONE_DAY("ONE_DAY", 0);
        public static final SpanDto ONE_WEEK = new ONE_WEEK("ONE_WEEK", 1);
        public static final SpanDto ONE_MONTH = new ONE_MONTH("ONE_MONTH", 2);
        public static final SpanDto THREE_MONTHS = new THREE_MONTHS("THREE_MONTHS", 3);
        public static final SpanDto ONE_YEAR = new ONE_YEAR("ONE_YEAR", 4);
        public static final SpanDto FIVE_YEAR = new FIVE_YEAR("FIVE_YEAR", 5);
        public static final SpanDto ONE_HOUR = new ONE_HOUR("ONE_HOUR", 6);
        public static final SpanDto FOUR_HOUR = new FOUR_HOUR("FOUR_HOUR", 7);
        public static final SpanDto YEAR_TO_DATE = new YEAR_TO_DATE("YEAR_TO_DATE", 8);
        public static final SpanDto ALL = new ALL(DisplaySpans.ALL, 9);

        private static final /* synthetic */ SpanDto[] $values() {
            return new SpanDto[]{ONE_DAY, ONE_WEEK, ONE_MONTH, THREE_MONTHS, ONE_YEAR, FIVE_YEAR, ONE_HOUR, FOUR_HOUR, YEAR_TO_DATE, ALL};
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

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.SpanDto.ONE_DAY", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_DAY extends SpanDto {
            ONE_DAY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.Span toProto() {
                return AdvancedChartsContext.Span.ONE_DAY;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AdvancedChartsContextDto$SpanDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvancedChartsContextDto.SpanDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.SpanDto.ONE_WEEK", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_WEEK extends SpanDto {
            ONE_WEEK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.Span toProto() {
                return AdvancedChartsContext.Span.ONE_WEEK;
            }
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.SpanDto.ONE_MONTH", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_MONTH extends SpanDto {
            ONE_MONTH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.Span toProto() {
                return AdvancedChartsContext.Span.ONE_MONTH;
            }
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.SpanDto.THREE_MONTHS", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class THREE_MONTHS extends SpanDto {
            THREE_MONTHS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.Span toProto() {
                return AdvancedChartsContext.Span.THREE_MONTHS;
            }
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.SpanDto.ONE_YEAR", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_YEAR extends SpanDto {
            ONE_YEAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.Span toProto() {
                return AdvancedChartsContext.Span.ONE_YEAR;
            }
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.SpanDto.FIVE_YEAR", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIVE_YEAR extends SpanDto {
            FIVE_YEAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.Span toProto() {
                return AdvancedChartsContext.Span.FIVE_YEAR;
            }
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.SpanDto.ONE_HOUR", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_HOUR extends SpanDto {
            ONE_HOUR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.Span toProto() {
                return AdvancedChartsContext.Span.ONE_HOUR;
            }
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.SpanDto.FOUR_HOUR", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FOUR_HOUR extends SpanDto {
            FOUR_HOUR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.Span toProto() {
                return AdvancedChartsContext.Span.FOUR_HOUR;
            }
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.SpanDto.YEAR_TO_DATE", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class YEAR_TO_DATE extends SpanDto {
            YEAR_TO_DATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.Span toProto() {
                return AdvancedChartsContext.Span.YEAR_TO_DATE;
            }
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.SpanDto.ALL", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ALL extends SpanDto {
            ALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.Span toProto() {
                return AdvancedChartsContext.Span.ALL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SpanDto, AdvancedChartsContext.Span> {

            /* compiled from: AdvancedChartsContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AdvancedChartsContext.Span.values().length];
                    try {
                        iArr[AdvancedChartsContext.Span.ONE_DAY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AdvancedChartsContext.Span.ONE_WEEK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AdvancedChartsContext.Span.ONE_MONTH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AdvancedChartsContext.Span.THREE_MONTHS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AdvancedChartsContext.Span.ONE_YEAR.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[AdvancedChartsContext.Span.FIVE_YEAR.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[AdvancedChartsContext.Span.ONE_HOUR.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[AdvancedChartsContext.Span.FOUR_HOUR.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[AdvancedChartsContext.Span.YEAR_TO_DATE.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[AdvancedChartsContext.Span.ALL.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
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
            public ProtoAdapter<AdvancedChartsContext.Span> getProtoAdapter() {
                return AdvancedChartsContext.Span.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpanDto getZeroValue() {
                return SpanDto.ONE_DAY;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpanDto fromProto(AdvancedChartsContext.Span proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return SpanDto.ONE_DAY;
                    case 2:
                        return SpanDto.ONE_WEEK;
                    case 3:
                        return SpanDto.ONE_MONTH;
                    case 4:
                        return SpanDto.THREE_MONTHS;
                    case 5:
                        return SpanDto.ONE_YEAR;
                    case 6:
                        return SpanDto.FIVE_YEAR;
                    case 7:
                        return SpanDto.ONE_HOUR;
                    case 8:
                        return SpanDto.FOUR_HOUR;
                    case 9:
                        return SpanDto.YEAR_TO_DATE;
                    case 10:
                        return SpanDto.ALL;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$SpanDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<SpanDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SpanDto, AdvancedChartsContext.Span> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.AdvancedChartsContext.Span", SpanDto.getEntries(), SpanDto.INSTANCE.getZeroValue());

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
    /* compiled from: AdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$ChartType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "LINE", "CANDLESTICK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ChartTypeDto implements Dto2<AdvancedChartsContext.ChartType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChartTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ChartTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ChartTypeDto, AdvancedChartsContext.ChartType>> binaryBase64Serializer$delegate;
        public static final ChartTypeDto LINE = new LINE("LINE", 0);
        public static final ChartTypeDto CANDLESTICK = new CANDLESTICK("CANDLESTICK", 1);

        private static final /* synthetic */ ChartTypeDto[] $values() {
            return new ChartTypeDto[]{LINE, CANDLESTICK};
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

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.ChartTypeDto.LINE", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$ChartType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LINE extends ChartTypeDto {
            LINE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.ChartType toProto() {
                return AdvancedChartsContext.ChartType.LINE;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AdvancedChartsContextDto$ChartTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvancedChartsContextDto.ChartTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AdvancedChartsContextDto.ChartTypeDto.CANDLESTICK", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$ChartType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANDLESTICK extends ChartTypeDto {
            CANDLESTICK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AdvancedChartsContext.ChartType toProto() {
                return AdvancedChartsContext.ChartType.CANDLESTICK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$ChartType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ChartTypeDto, AdvancedChartsContext.ChartType> {

            /* compiled from: AdvancedChartsContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AdvancedChartsContext.ChartType.values().length];
                    try {
                        iArr[AdvancedChartsContext.ChartType.LINE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AdvancedChartsContext.ChartType.CANDLESTICK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
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
            public ProtoAdapter<AdvancedChartsContext.ChartType> getProtoAdapter() {
                return AdvancedChartsContext.ChartType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartTypeDto getZeroValue() {
                return ChartTypeDto.LINE;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartTypeDto fromProto(AdvancedChartsContext.ChartType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ChartTypeDto.LINE;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return ChartTypeDto.CANDLESTICK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AdvancedChartsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$ChartTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ChartTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ChartTypeDto, AdvancedChartsContext.ChartType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.AdvancedChartsContext.ChartType", ChartTypeDto.getEntries(), ChartTypeDto.INSTANCE.getZeroValue());

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

    /* compiled from: AdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<AdvancedChartsContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.AdvancedChartsContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvancedChartsContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvancedChartsContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvancedChartsContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvancedChartsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.AdvancedChartsContextDto";
        }
    }
}
