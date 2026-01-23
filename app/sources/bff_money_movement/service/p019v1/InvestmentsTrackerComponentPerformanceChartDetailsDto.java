package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentPerformanceChartDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentPerformanceGraphDataDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerRuleMarkDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerScrubPointDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: InvestmentsTrackerComponentPerformanceChartDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u00061"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetails;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto$Surrogate;)V", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphDataDto;", "primary_graph_data", "", "Lbff_money_movement/service/v1/InvestmentsTrackerScrubPointDto;", "scrub_points", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto;", "rule_marks", "dynamic_graph_data", "", "span", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphDataDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto$Surrogate;", "getPrimary_graph_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphDataDto;", "getScrub_points", "()Ljava/util/List;", "getRule_marks", "getDynamic_graph_data", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentPerformanceChartDetailsDto implements Dto3<InvestmentsTrackerComponentPerformanceChartDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerComponentPerformanceChartDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerComponentPerformanceChartDetailsDto, InvestmentsTrackerComponentPerformanceChartDetails>> binaryBase64Serializer$delegate;
    private static final InvestmentsTrackerComponentPerformanceChartDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestmentsTrackerComponentPerformanceChartDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerComponentPerformanceChartDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final InvestmentsTrackerComponentPerformanceGraphDataDto getPrimary_graph_data() {
        return this.surrogate.getPrimary_graph_data();
    }

    public final List<InvestmentsTrackerScrubPointDto> getScrub_points() {
        return this.surrogate.getScrub_points();
    }

    public final List<InvestmentsTrackerRuleMarkDto> getRule_marks() {
        return this.surrogate.getRule_marks();
    }

    public final List<InvestmentsTrackerComponentPerformanceGraphDataDto> getDynamic_graph_data() {
        return this.surrogate.getDynamic_graph_data();
    }

    public /* synthetic */ InvestmentsTrackerComponentPerformanceChartDetailsDto(InvestmentsTrackerComponentPerformanceGraphDataDto investmentsTrackerComponentPerformanceGraphDataDto, List list, List list2, List list3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investmentsTrackerComponentPerformanceGraphDataDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentPerformanceChartDetailsDto(InvestmentsTrackerComponentPerformanceGraphDataDto investmentsTrackerComponentPerformanceGraphDataDto, List<InvestmentsTrackerScrubPointDto> scrub_points, List<InvestmentsTrackerRuleMarkDto> rule_marks, List<InvestmentsTrackerComponentPerformanceGraphDataDto> dynamic_graph_data, String span) {
        this(new Surrogate(investmentsTrackerComponentPerformanceGraphDataDto, scrub_points, rule_marks, dynamic_graph_data, span));
        Intrinsics.checkNotNullParameter(scrub_points, "scrub_points");
        Intrinsics.checkNotNullParameter(rule_marks, "rule_marks");
        Intrinsics.checkNotNullParameter(dynamic_graph_data, "dynamic_graph_data");
        Intrinsics.checkNotNullParameter(span, "span");
    }

    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerComponentPerformanceChartDetails toProto() {
        InvestmentsTrackerComponentPerformanceGraphDataDto primary_graph_data = this.surrogate.getPrimary_graph_data();
        InvestmentsTrackerComponentPerformanceGraphData proto = primary_graph_data != null ? primary_graph_data.toProto() : null;
        List<InvestmentsTrackerScrubPointDto> scrub_points = this.surrogate.getScrub_points();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(scrub_points, 10));
        Iterator<T> it = scrub_points.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestmentsTrackerScrubPointDto) it.next()).toProto());
        }
        List<InvestmentsTrackerRuleMarkDto> rule_marks = this.surrogate.getRule_marks();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(rule_marks, 10));
        Iterator<T> it2 = rule_marks.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InvestmentsTrackerRuleMarkDto) it2.next()).toProto());
        }
        List<InvestmentsTrackerComponentPerformanceGraphDataDto> dynamic_graph_data = this.surrogate.getDynamic_graph_data();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dynamic_graph_data, 10));
        Iterator<T> it3 = dynamic_graph_data.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((InvestmentsTrackerComponentPerformanceGraphDataDto) it3.next()).toProto());
        }
        return new InvestmentsTrackerComponentPerformanceChartDetails(proto, arrayList, arrayList2, arrayList3, this.surrogate.getSpan(), null, 32, null);
    }

    public String toString() {
        return "[InvestmentsTrackerComponentPerformanceChartDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestmentsTrackerComponentPerformanceChartDetailsDto) && Intrinsics.areEqual(((InvestmentsTrackerComponentPerformanceChartDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerComponentPerformanceChartDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010+R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010+R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b3\u0010(\u001a\u0004\b2\u0010\u001d¨\u00066"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto$Surrogate;", "", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphDataDto;", "primary_graph_data", "", "Lbff_money_movement/service/v1/InvestmentsTrackerScrubPointDto;", "scrub_points", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto;", "rule_marks", "dynamic_graph_data", "", "span", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphDataDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphDataDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphDataDto;", "getPrimary_graph_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphDataDto;", "getPrimary_graph_data$annotations", "()V", "Ljava/util/List;", "getScrub_points", "()Ljava/util/List;", "getScrub_points$annotations", "getRule_marks", "getRule_marks$annotations", "getDynamic_graph_data", "getDynamic_graph_data$annotations", "Ljava/lang/String;", "getSpan", "getSpan$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<InvestmentsTrackerComponentPerformanceGraphDataDto> dynamic_graph_data;
        private final InvestmentsTrackerComponentPerformanceGraphDataDto primary_graph_data;
        private final List<InvestmentsTrackerRuleMarkDto> rule_marks;
        private final List<InvestmentsTrackerScrubPointDto> scrub_points;
        private final String span;

        public Surrogate() {
            this((InvestmentsTrackerComponentPerformanceGraphDataDto) null, (List) null, (List) null, (List) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(InvestmentsTrackerScrubPointDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(InvestmentsTrackerRuleMarkDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(InvestmentsTrackerComponentPerformanceGraphDataDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.primary_graph_data, surrogate.primary_graph_data) && Intrinsics.areEqual(this.scrub_points, surrogate.scrub_points) && Intrinsics.areEqual(this.rule_marks, surrogate.rule_marks) && Intrinsics.areEqual(this.dynamic_graph_data, surrogate.dynamic_graph_data) && Intrinsics.areEqual(this.span, surrogate.span);
        }

        public int hashCode() {
            InvestmentsTrackerComponentPerformanceGraphDataDto investmentsTrackerComponentPerformanceGraphDataDto = this.primary_graph_data;
            return ((((((((investmentsTrackerComponentPerformanceGraphDataDto == null ? 0 : investmentsTrackerComponentPerformanceGraphDataDto.hashCode()) * 31) + this.scrub_points.hashCode()) * 31) + this.rule_marks.hashCode()) * 31) + this.dynamic_graph_data.hashCode()) * 31) + this.span.hashCode();
        }

        public String toString() {
            return "Surrogate(primary_graph_data=" + this.primary_graph_data + ", scrub_points=" + this.scrub_points + ", rule_marks=" + this.rule_marks + ", dynamic_graph_data=" + this.dynamic_graph_data + ", span=" + this.span + ")";
        }

        /* compiled from: InvestmentsTrackerComponentPerformanceChartDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerComponentPerformanceChartDetailsDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentPerformanceChartDetailsDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestmentsTrackerComponentPerformanceChartDetailsDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentPerformanceChartDetailsDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestmentsTrackerComponentPerformanceChartDetailsDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentPerformanceChartDetailsDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestmentsTrackerComponentPerformanceChartDetailsDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, InvestmentsTrackerComponentPerformanceGraphDataDto investmentsTrackerComponentPerformanceGraphDataDto, List list, List list2, List list3, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.primary_graph_data = (i & 1) == 0 ? null : investmentsTrackerComponentPerformanceGraphDataDto;
            if ((i & 2) == 0) {
                this.scrub_points = CollectionsKt.emptyList();
            } else {
                this.scrub_points = list;
            }
            if ((i & 4) == 0) {
                this.rule_marks = CollectionsKt.emptyList();
            } else {
                this.rule_marks = list2;
            }
            if ((i & 8) == 0) {
                this.dynamic_graph_data = CollectionsKt.emptyList();
            } else {
                this.dynamic_graph_data = list3;
            }
            if ((i & 16) == 0) {
                this.span = "";
            } else {
                this.span = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            InvestmentsTrackerComponentPerformanceGraphDataDto investmentsTrackerComponentPerformanceGraphDataDto = self.primary_graph_data;
            if (investmentsTrackerComponentPerformanceGraphDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, InvestmentsTrackerComponentPerformanceGraphDataDto.Serializer.INSTANCE, investmentsTrackerComponentPerformanceGraphDataDto);
            }
            if (!Intrinsics.areEqual(self.scrub_points, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.scrub_points);
            }
            if (!Intrinsics.areEqual(self.rule_marks, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.rule_marks);
            }
            if (!Intrinsics.areEqual(self.dynamic_graph_data, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.dynamic_graph_data);
            }
            if (Intrinsics.areEqual(self.span, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.span);
        }

        public Surrogate(InvestmentsTrackerComponentPerformanceGraphDataDto investmentsTrackerComponentPerformanceGraphDataDto, List<InvestmentsTrackerScrubPointDto> scrub_points, List<InvestmentsTrackerRuleMarkDto> rule_marks, List<InvestmentsTrackerComponentPerformanceGraphDataDto> dynamic_graph_data, String span) {
            Intrinsics.checkNotNullParameter(scrub_points, "scrub_points");
            Intrinsics.checkNotNullParameter(rule_marks, "rule_marks");
            Intrinsics.checkNotNullParameter(dynamic_graph_data, "dynamic_graph_data");
            Intrinsics.checkNotNullParameter(span, "span");
            this.primary_graph_data = investmentsTrackerComponentPerformanceGraphDataDto;
            this.scrub_points = scrub_points;
            this.rule_marks = rule_marks;
            this.dynamic_graph_data = dynamic_graph_data;
            this.span = span;
        }

        public final InvestmentsTrackerComponentPerformanceGraphDataDto getPrimary_graph_data() {
            return this.primary_graph_data;
        }

        public final List<InvestmentsTrackerScrubPointDto> getScrub_points() {
            return this.scrub_points;
        }

        public /* synthetic */ Surrogate(InvestmentsTrackerComponentPerformanceGraphDataDto investmentsTrackerComponentPerformanceGraphDataDto, List list, List list2, List list3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : investmentsTrackerComponentPerformanceGraphDataDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? "" : str);
        }

        public final List<InvestmentsTrackerRuleMarkDto> getRule_marks() {
            return this.rule_marks;
        }

        public final List<InvestmentsTrackerComponentPerformanceGraphDataDto> getDynamic_graph_data() {
            return this.dynamic_graph_data;
        }

        public final String getSpan() {
            return this.span;
        }
    }

    /* compiled from: InvestmentsTrackerComponentPerformanceChartDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InvestmentsTrackerComponentPerformanceChartDetailsDto, InvestmentsTrackerComponentPerformanceChartDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestmentsTrackerComponentPerformanceChartDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentPerformanceChartDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentPerformanceChartDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerComponentPerformanceChartDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerComponentPerformanceChartDetails> getProtoAdapter() {
            return InvestmentsTrackerComponentPerformanceChartDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentPerformanceChartDetailsDto getZeroValue() {
            return InvestmentsTrackerComponentPerformanceChartDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentPerformanceChartDetailsDto fromProto(InvestmentsTrackerComponentPerformanceChartDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            InvestmentsTrackerComponentPerformanceGraphData primary_graph_data = proto.getPrimary_graph_data();
            DefaultConstructorMarker defaultConstructorMarker = null;
            InvestmentsTrackerComponentPerformanceGraphDataDto investmentsTrackerComponentPerformanceGraphDataDtoFromProto = primary_graph_data != null ? InvestmentsTrackerComponentPerformanceGraphDataDto.INSTANCE.fromProto(primary_graph_data) : null;
            List<InvestmentsTrackerScrubPoint> scrub_points = proto.getScrub_points();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(scrub_points, 10));
            Iterator<T> it = scrub_points.iterator();
            while (it.hasNext()) {
                arrayList.add(InvestmentsTrackerScrubPointDto.INSTANCE.fromProto((InvestmentsTrackerScrubPoint) it.next()));
            }
            List<InvestmentsTrackerRuleMark> rule_marks = proto.getRule_marks();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(rule_marks, 10));
            Iterator<T> it2 = rule_marks.iterator();
            while (it2.hasNext()) {
                arrayList2.add(InvestmentsTrackerRuleMarkDto.INSTANCE.fromProto((InvestmentsTrackerRuleMark) it2.next()));
            }
            List<InvestmentsTrackerComponentPerformanceGraphData> dynamic_graph_data = proto.getDynamic_graph_data();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dynamic_graph_data, 10));
            Iterator<T> it3 = dynamic_graph_data.iterator();
            while (it3.hasNext()) {
                arrayList3.add(InvestmentsTrackerComponentPerformanceGraphDataDto.INSTANCE.fromProto((InvestmentsTrackerComponentPerformanceGraphData) it3.next()));
            }
            return new InvestmentsTrackerComponentPerformanceChartDetailsDto(new Surrogate(investmentsTrackerComponentPerformanceGraphDataDtoFromProto, arrayList, arrayList2, arrayList3, proto.getSpan()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentPerformanceChartDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerComponentPerformanceChartDetailsDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new InvestmentsTrackerComponentPerformanceChartDetailsDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerComponentPerformanceChartDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerComponentPerformanceChartDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerComponentPerformanceChartDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerComponentPerformanceChartDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerComponentPerformanceChartDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestmentsTrackerComponentPerformanceChartDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestmentsTrackerComponentPerformanceChartDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerComponentPerformanceChartDetailsDto";
        }
    }
}
