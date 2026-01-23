package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.DashboardWidgetContext;
import com.robinhood.rosetta.eventlogging.DashboardWidgetContextDto;
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

/* compiled from: DashboardWidgetContextDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$Surrogate;)V", "sorting_key", "", "sorting_order", "chart_customization", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;)V", "getSorting_key", "()Ljava/lang/String;", "getSorting_order", "getChart_customization", "()Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ChartCustomizationDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class DashboardWidgetContextDto implements Dto3<DashboardWidgetContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DashboardWidgetContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DashboardWidgetContextDto, DashboardWidgetContext>> binaryBase64Serializer$delegate;
    private static final DashboardWidgetContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DashboardWidgetContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DashboardWidgetContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getSorting_key() {
        return this.surrogate.getSorting_key();
    }

    public final String getSorting_order() {
        return this.surrogate.getSorting_order();
    }

    public final ChartCustomizationDto getChart_customization() {
        return this.surrogate.getChart_customization();
    }

    public /* synthetic */ DashboardWidgetContextDto(String str, String str2, ChartCustomizationDto chartCustomizationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ChartCustomizationDto.INSTANCE.getZeroValue() : chartCustomizationDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DashboardWidgetContextDto(String sorting_key, String sorting_order, ChartCustomizationDto chart_customization) {
        this(new Surrogate(sorting_key, sorting_order, chart_customization));
        Intrinsics.checkNotNullParameter(sorting_key, "sorting_key");
        Intrinsics.checkNotNullParameter(sorting_order, "sorting_order");
        Intrinsics.checkNotNullParameter(chart_customization, "chart_customization");
    }

    public static /* synthetic */ DashboardWidgetContextDto copy$default(DashboardWidgetContextDto dashboardWidgetContextDto, String str, String str2, ChartCustomizationDto chartCustomizationDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardWidgetContextDto.surrogate.getSorting_key();
        }
        if ((i & 2) != 0) {
            str2 = dashboardWidgetContextDto.surrogate.getSorting_order();
        }
        if ((i & 4) != 0) {
            chartCustomizationDto = dashboardWidgetContextDto.surrogate.getChart_customization();
        }
        return dashboardWidgetContextDto.copy(str, str2, chartCustomizationDto);
    }

    public final DashboardWidgetContextDto copy(String sorting_key, String sorting_order, ChartCustomizationDto chart_customization) {
        Intrinsics.checkNotNullParameter(sorting_key, "sorting_key");
        Intrinsics.checkNotNullParameter(sorting_order, "sorting_order");
        Intrinsics.checkNotNullParameter(chart_customization, "chart_customization");
        return new DashboardWidgetContextDto(new Surrogate(sorting_key, sorting_order, chart_customization));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public DashboardWidgetContext toProto() {
        return new DashboardWidgetContext(this.surrogate.getSorting_key(), this.surrogate.getSorting_order(), (DashboardWidgetContext.ChartCustomization) this.surrogate.getChart_customization().toProto(), null, 8, null);
    }

    public String toString() {
        return "[DashboardWidgetContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DashboardWidgetContextDto) && Intrinsics.areEqual(((DashboardWidgetContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: DashboardWidgetContextDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$Surrogate;", "", "sorting_key", "", "sorting_order", "chart_customization", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSorting_key$annotations", "()V", "getSorting_key", "()Ljava/lang/String;", "getSorting_order$annotations", "getSorting_order", "getChart_customization$annotations", "getChart_customization", "()Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ChartCustomizationDto chart_customization;
        private final String sorting_key;
        private final String sorting_order;

        public Surrogate() {
            this((String) null, (String) null, (ChartCustomizationDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, ChartCustomizationDto chartCustomizationDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.sorting_key;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.sorting_order;
            }
            if ((i & 4) != 0) {
                chartCustomizationDto = surrogate.chart_customization;
            }
            return surrogate.copy(str, str2, chartCustomizationDto);
        }

        @SerialName("chartCustomization")
        @JsonAnnotations2(names = {"chart_customization"})
        public static /* synthetic */ void getChart_customization$annotations() {
        }

        @SerialName("sortingKey")
        @JsonAnnotations2(names = {"sorting_key"})
        public static /* synthetic */ void getSorting_key$annotations() {
        }

        @SerialName("sortingOrder")
        @JsonAnnotations2(names = {"sorting_order"})
        public static /* synthetic */ void getSorting_order$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getSorting_key() {
            return this.sorting_key;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSorting_order() {
            return this.sorting_order;
        }

        /* renamed from: component3, reason: from getter */
        public final ChartCustomizationDto getChart_customization() {
            return this.chart_customization;
        }

        public final Surrogate copy(String sorting_key, String sorting_order, ChartCustomizationDto chart_customization) {
            Intrinsics.checkNotNullParameter(sorting_key, "sorting_key");
            Intrinsics.checkNotNullParameter(sorting_order, "sorting_order");
            Intrinsics.checkNotNullParameter(chart_customization, "chart_customization");
            return new Surrogate(sorting_key, sorting_order, chart_customization);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.sorting_key, surrogate.sorting_key) && Intrinsics.areEqual(this.sorting_order, surrogate.sorting_order) && this.chart_customization == surrogate.chart_customization;
        }

        public int hashCode() {
            return (((this.sorting_key.hashCode() * 31) + this.sorting_order.hashCode()) * 31) + this.chart_customization.hashCode();
        }

        public String toString() {
            return "Surrogate(sorting_key=" + this.sorting_key + ", sorting_order=" + this.sorting_order + ", chart_customization=" + this.chart_customization + ")";
        }

        /* compiled from: DashboardWidgetContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DashboardWidgetContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, ChartCustomizationDto chartCustomizationDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.sorting_key = "";
            } else {
                this.sorting_key = str;
            }
            if ((i & 2) == 0) {
                this.sorting_order = "";
            } else {
                this.sorting_order = str2;
            }
            if ((i & 4) == 0) {
                this.chart_customization = ChartCustomizationDto.INSTANCE.getZeroValue();
            } else {
                this.chart_customization = chartCustomizationDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.sorting_key, "")) {
                output.encodeStringElement(serialDesc, 0, self.sorting_key);
            }
            if (!Intrinsics.areEqual(self.sorting_order, "")) {
                output.encodeStringElement(serialDesc, 1, self.sorting_order);
            }
            if (self.chart_customization != ChartCustomizationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ChartCustomizationDto.Serializer.INSTANCE, self.chart_customization);
            }
        }

        public Surrogate(String sorting_key, String sorting_order, ChartCustomizationDto chart_customization) {
            Intrinsics.checkNotNullParameter(sorting_key, "sorting_key");
            Intrinsics.checkNotNullParameter(sorting_order, "sorting_order");
            Intrinsics.checkNotNullParameter(chart_customization, "chart_customization");
            this.sorting_key = sorting_key;
            this.sorting_order = sorting_order;
            this.chart_customization = chart_customization;
        }

        public /* synthetic */ Surrogate(String str, String str2, ChartCustomizationDto chartCustomizationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ChartCustomizationDto.INSTANCE.getZeroValue() : chartCustomizationDto);
        }

        public final String getSorting_key() {
            return this.sorting_key;
        }

        public final String getSorting_order() {
            return this.sorting_order;
        }

        public final ChartCustomizationDto getChart_customization() {
            return this.chart_customization;
        }
    }

    /* compiled from: DashboardWidgetContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto;", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<DashboardWidgetContextDto, DashboardWidgetContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DashboardWidgetContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DashboardWidgetContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DashboardWidgetContextDto> getBinaryBase64Serializer() {
            return (KSerializer) DashboardWidgetContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DashboardWidgetContext> getProtoAdapter() {
            return DashboardWidgetContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DashboardWidgetContextDto getZeroValue() {
            return DashboardWidgetContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DashboardWidgetContextDto fromProto(DashboardWidgetContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new DashboardWidgetContextDto(new Surrogate(proto.getSorting_key(), proto.getSorting_order(), ChartCustomizationDto.INSTANCE.fromProto(proto.getChart_customization())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DashboardWidgetContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DashboardWidgetContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DashboardWidgetContextDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DashboardWidgetContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", EducationTourScreenNames.UNSPECIFIED_SCREEN, "LINE_CHART", "ADVANCED_CHART", "CONTRIBUTION_CHART", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ChartCustomizationDto implements Dto2<DashboardWidgetContext.ChartCustomization>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChartCustomizationDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ChartCustomizationDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ChartCustomizationDto, DashboardWidgetContext.ChartCustomization>> binaryBase64Serializer$delegate;
        public static final ChartCustomizationDto UNSPECIFIED = new UNSPECIFIED(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0);
        public static final ChartCustomizationDto LINE_CHART = new LINE_CHART("LINE_CHART", 1);
        public static final ChartCustomizationDto ADVANCED_CHART = new ADVANCED_CHART("ADVANCED_CHART", 2);
        public static final ChartCustomizationDto CONTRIBUTION_CHART = new CONTRIBUTION_CHART("CONTRIBUTION_CHART", 3);

        private static final /* synthetic */ ChartCustomizationDto[] $values() {
            return new ChartCustomizationDto[]{UNSPECIFIED, LINE_CHART, ADVANCED_CHART, CONTRIBUTION_CHART};
        }

        public /* synthetic */ ChartCustomizationDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ChartCustomizationDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ChartCustomizationDto(String str, int i) {
        }

        /* compiled from: DashboardWidgetContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DashboardWidgetContextDto.ChartCustomizationDto.UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSPECIFIED extends ChartCustomizationDto {
            UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DashboardWidgetContext.ChartCustomization toProto() {
                return DashboardWidgetContext.ChartCustomization.UNSPECIFIED;
            }
        }

        static {
            ChartCustomizationDto[] chartCustomizationDtoArr$values = $values();
            $VALUES = chartCustomizationDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(chartCustomizationDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DashboardWidgetContextDto$ChartCustomizationDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DashboardWidgetContextDto.ChartCustomizationDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: DashboardWidgetContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DashboardWidgetContextDto.ChartCustomizationDto.LINE_CHART", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LINE_CHART extends ChartCustomizationDto {
            LINE_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DashboardWidgetContext.ChartCustomization toProto() {
                return DashboardWidgetContext.ChartCustomization.LINE_CHART;
            }
        }

        /* compiled from: DashboardWidgetContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DashboardWidgetContextDto.ChartCustomizationDto.ADVANCED_CHART", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ADVANCED_CHART extends ChartCustomizationDto {
            ADVANCED_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DashboardWidgetContext.ChartCustomization toProto() {
                return DashboardWidgetContext.ChartCustomization.ADVANCED_CHART;
            }
        }

        /* compiled from: DashboardWidgetContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DashboardWidgetContextDto.ChartCustomizationDto.CONTRIBUTION_CHART", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTRIBUTION_CHART extends ChartCustomizationDto {
            CONTRIBUTION_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DashboardWidgetContext.ChartCustomization toProto() {
                return DashboardWidgetContext.ChartCustomization.CONTRIBUTION_CHART;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DashboardWidgetContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ChartCustomizationDto, DashboardWidgetContext.ChartCustomization> {

            /* compiled from: DashboardWidgetContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DashboardWidgetContext.ChartCustomization.values().length];
                    try {
                        iArr[DashboardWidgetContext.ChartCustomization.UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DashboardWidgetContext.ChartCustomization.LINE_CHART.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DashboardWidgetContext.ChartCustomization.ADVANCED_CHART.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[DashboardWidgetContext.ChartCustomization.CONTRIBUTION_CHART.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ChartCustomizationDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChartCustomizationDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChartCustomizationDto> getBinaryBase64Serializer() {
                return (KSerializer) ChartCustomizationDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DashboardWidgetContext.ChartCustomization> getProtoAdapter() {
                return DashboardWidgetContext.ChartCustomization.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartCustomizationDto getZeroValue() {
                return ChartCustomizationDto.UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartCustomizationDto fromProto(DashboardWidgetContext.ChartCustomization proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ChartCustomizationDto.UNSPECIFIED;
                }
                if (i == 2) {
                    return ChartCustomizationDto.LINE_CHART;
                }
                if (i == 3) {
                    return ChartCustomizationDto.ADVANCED_CHART;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return ChartCustomizationDto.CONTRIBUTION_CHART;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DashboardWidgetContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$ChartCustomizationDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ChartCustomizationDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ChartCustomizationDto, DashboardWidgetContext.ChartCustomization> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DashboardWidgetContext.ChartCustomization", ChartCustomizationDto.getEntries(), ChartCustomizationDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ChartCustomizationDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ChartCustomizationDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ChartCustomizationDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ChartCustomizationDto valueOf(String str) {
            return (ChartCustomizationDto) Enum.valueOf(ChartCustomizationDto.class, str);
        }

        public static ChartCustomizationDto[] values() {
            return (ChartCustomizationDto[]) $VALUES.clone();
        }
    }

    /* compiled from: DashboardWidgetContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<DashboardWidgetContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DashboardWidgetContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DashboardWidgetContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DashboardWidgetContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DashboardWidgetContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DashboardWidgetContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.DashboardWidgetContextDto";
        }
    }
}
