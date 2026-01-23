package yoda.service.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
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
import yoda.service.dashboard.ProjectedValuesDto;
import yoda.service.dashboard.YearlyProjectedValuesDto;

/* compiled from: ProjectedValuesDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b&\u0010%R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b(\u0010%¨\u0006-"}, m3636d2 = {"Lyoda/service/dashboard/ProjectedValuesDto;", "Lcom/robinhood/idl/MessageDto;", "Lyoda/service/dashboard/ProjectedValues;", "Landroid/os/Parcelable;", "Lyoda/service/dashboard/ProjectedValuesDto$Surrogate;", "surrogate", "<init>", "(Lyoda/service/dashboard/ProjectedValuesDto$Surrogate;)V", "", "Lyoda/service/dashboard/YearlyProjectedValuesDto;", "percentile_5", "median", "percentile_95", "net_deposits", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toProto", "()Lyoda/service/dashboard/ProjectedValues;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lyoda/service/dashboard/ProjectedValuesDto$Surrogate;", "getPercentile_5", "()Ljava/util/List;", "getMedian", "getPercentile_95", "getNet_deposits", "Companion", "Surrogate", "Serializer", "MultibindingModule", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class ProjectedValuesDto implements Dto3<ProjectedValues>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ProjectedValuesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ProjectedValuesDto, ProjectedValues>> binaryBase64Serializer$delegate;
    private static final ProjectedValuesDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ProjectedValuesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ProjectedValuesDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<YearlyProjectedValuesDto> getPercentile_5() {
        return this.surrogate.getPercentile_5();
    }

    public final List<YearlyProjectedValuesDto> getMedian() {
        return this.surrogate.getMedian();
    }

    public final List<YearlyProjectedValuesDto> getPercentile_95() {
        return this.surrogate.getPercentile_95();
    }

    public final List<YearlyProjectedValuesDto> getNet_deposits() {
        return this.surrogate.getNet_deposits();
    }

    public /* synthetic */ ProjectedValuesDto(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt.emptyList() : list4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProjectedValuesDto(List<YearlyProjectedValuesDto> percentile_5, List<YearlyProjectedValuesDto> median, List<YearlyProjectedValuesDto> percentile_95, List<YearlyProjectedValuesDto> net_deposits) {
        this(new Surrogate(percentile_5, median, percentile_95, net_deposits));
        Intrinsics.checkNotNullParameter(percentile_5, "percentile_5");
        Intrinsics.checkNotNullParameter(median, "median");
        Intrinsics.checkNotNullParameter(percentile_95, "percentile_95");
        Intrinsics.checkNotNullParameter(net_deposits, "net_deposits");
    }

    @Override // com.robinhood.idl.Dto
    public ProjectedValues toProto() {
        List<YearlyProjectedValuesDto> percentile_5 = this.surrogate.getPercentile_5();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(percentile_5, 10));
        Iterator<T> it = percentile_5.iterator();
        while (it.hasNext()) {
            arrayList.add(((YearlyProjectedValuesDto) it.next()).toProto());
        }
        List<YearlyProjectedValuesDto> median = this.surrogate.getMedian();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(median, 10));
        Iterator<T> it2 = median.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((YearlyProjectedValuesDto) it2.next()).toProto());
        }
        List<YearlyProjectedValuesDto> percentile_95 = this.surrogate.getPercentile_95();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(percentile_95, 10));
        Iterator<T> it3 = percentile_95.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((YearlyProjectedValuesDto) it3.next()).toProto());
        }
        List<YearlyProjectedValuesDto> net_deposits = this.surrogate.getNet_deposits();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(net_deposits, 10));
        Iterator<T> it4 = net_deposits.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((YearlyProjectedValuesDto) it4.next()).toProto());
        }
        return new ProjectedValues(arrayList, arrayList2, arrayList3, arrayList4, null, 16, null);
    }

    public String toString() {
        return "[ProjectedValuesDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ProjectedValuesDto) && Intrinsics.areEqual(((ProjectedValuesDto) other).surrogate, this.surrogate);
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
    /* compiled from: ProjectedValuesDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tB[\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010#R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010#¨\u0006."}, m3636d2 = {"Lyoda/service/dashboard/ProjectedValuesDto$Surrogate;", "", "", "Lyoda/service/dashboard/YearlyProjectedValuesDto;", "percentile_5", "median", "percentile_95", "net_deposits", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$yoda_v1_dashboard_externalRelease", "(Lyoda/service/dashboard/ProjectedValuesDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPercentile_5", "()Ljava/util/List;", "getPercentile_5$annotations", "()V", "getMedian", "getMedian$annotations", "getPercentile_95", "getPercentile_95$annotations", "getNet_deposits", "getNet_deposits$annotations", "Companion", "$serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<YearlyProjectedValuesDto> median;
        private final List<YearlyProjectedValuesDto> net_deposits;
        private final List<YearlyProjectedValuesDto> percentile_5;
        private final List<YearlyProjectedValuesDto> percentile_95;

        public Surrogate() {
            this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(YearlyProjectedValuesDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(YearlyProjectedValuesDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(YearlyProjectedValuesDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return new ArrayListSerializer(YearlyProjectedValuesDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.percentile_5, surrogate.percentile_5) && Intrinsics.areEqual(this.median, surrogate.median) && Intrinsics.areEqual(this.percentile_95, surrogate.percentile_95) && Intrinsics.areEqual(this.net_deposits, surrogate.net_deposits);
        }

        public int hashCode() {
            return (((((this.percentile_5.hashCode() * 31) + this.median.hashCode()) * 31) + this.percentile_95.hashCode()) * 31) + this.net_deposits.hashCode();
        }

        public String toString() {
            return "Surrogate(percentile_5=" + this.percentile_5 + ", median=" + this.median + ", percentile_95=" + this.percentile_95 + ", net_deposits=" + this.net_deposits + ")";
        }

        /* compiled from: ProjectedValuesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lyoda/service/dashboard/ProjectedValuesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/ProjectedValuesDto$Surrogate;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ProjectedValuesDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: yoda.service.dashboard.ProjectedValuesDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProjectedValuesDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: yoda.service.dashboard.ProjectedValuesDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProjectedValuesDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: yoda.service.dashboard.ProjectedValuesDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProjectedValuesDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: yoda.service.dashboard.ProjectedValuesDto$Surrogate$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProjectedValuesDto.Surrogate._childSerializers$_anonymous_$2();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
            this.percentile_5 = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.median = CollectionsKt.emptyList();
            } else {
                this.median = list2;
            }
            if ((i & 4) == 0) {
                this.percentile_95 = CollectionsKt.emptyList();
            } else {
                this.percentile_95 = list3;
            }
            if ((i & 8) == 0) {
                this.net_deposits = CollectionsKt.emptyList();
            } else {
                this.net_deposits = list4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$yoda_v1_dashboard_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.percentile_5, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.percentile_5);
            }
            if (!Intrinsics.areEqual(self.median, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.median);
            }
            if (!Intrinsics.areEqual(self.percentile_95, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.percentile_95);
            }
            if (Intrinsics.areEqual(self.net_deposits, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.net_deposits);
        }

        public Surrogate(List<YearlyProjectedValuesDto> percentile_5, List<YearlyProjectedValuesDto> median, List<YearlyProjectedValuesDto> percentile_95, List<YearlyProjectedValuesDto> net_deposits) {
            Intrinsics.checkNotNullParameter(percentile_5, "percentile_5");
            Intrinsics.checkNotNullParameter(median, "median");
            Intrinsics.checkNotNullParameter(percentile_95, "percentile_95");
            Intrinsics.checkNotNullParameter(net_deposits, "net_deposits");
            this.percentile_5 = percentile_5;
            this.median = median;
            this.percentile_95 = percentile_95;
            this.net_deposits = net_deposits;
        }

        public final List<YearlyProjectedValuesDto> getPercentile_5() {
            return this.percentile_5;
        }

        public /* synthetic */ Surrogate(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt.emptyList() : list4);
        }

        public final List<YearlyProjectedValuesDto> getMedian() {
            return this.median;
        }

        public final List<YearlyProjectedValuesDto> getPercentile_95() {
            return this.percentile_95;
        }

        public final List<YearlyProjectedValuesDto> getNet_deposits() {
            return this.net_deposits;
        }
    }

    /* compiled from: ProjectedValuesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/dashboard/ProjectedValuesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lyoda/service/dashboard/ProjectedValuesDto;", "Lyoda/service/dashboard/ProjectedValues;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lyoda/service/dashboard/ProjectedValuesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ProjectedValuesDto, ProjectedValues> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ProjectedValuesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ProjectedValuesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ProjectedValuesDto> getBinaryBase64Serializer() {
            return (KSerializer) ProjectedValuesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ProjectedValues> getProtoAdapter() {
            return ProjectedValues.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProjectedValuesDto getZeroValue() {
            return ProjectedValuesDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProjectedValuesDto fromProto(ProjectedValues proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<YearlyProjectedValues> percentile_5 = proto.getPercentile_5();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(percentile_5, 10));
            Iterator<T> it = percentile_5.iterator();
            while (it.hasNext()) {
                arrayList.add(YearlyProjectedValuesDto.INSTANCE.fromProto((YearlyProjectedValues) it.next()));
            }
            List<YearlyProjectedValues> median = proto.getMedian();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(median, 10));
            Iterator<T> it2 = median.iterator();
            while (it2.hasNext()) {
                arrayList2.add(YearlyProjectedValuesDto.INSTANCE.fromProto((YearlyProjectedValues) it2.next()));
            }
            List<YearlyProjectedValues> percentile_95 = proto.getPercentile_95();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(percentile_95, 10));
            Iterator<T> it3 = percentile_95.iterator();
            while (it3.hasNext()) {
                arrayList3.add(YearlyProjectedValuesDto.INSTANCE.fromProto((YearlyProjectedValues) it3.next()));
            }
            List<YearlyProjectedValues> net_deposits = proto.getNet_deposits();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(net_deposits, 10));
            Iterator<T> it4 = net_deposits.iterator();
            while (it4.hasNext()) {
                arrayList4.add(YearlyProjectedValuesDto.INSTANCE.fromProto((YearlyProjectedValues) it4.next()));
            }
            return new ProjectedValuesDto(new Surrogate(arrayList, arrayList2, arrayList3, arrayList4), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: yoda.service.dashboard.ProjectedValuesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProjectedValuesDto.binaryBase64Serializer_delegate$lambda$4();
            }
        });
        zeroValue = new ProjectedValuesDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$4() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ProjectedValuesDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lyoda/service/dashboard/ProjectedValuesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/ProjectedValuesDto;", "<init>", "()V", "surrogateSerializer", "Lyoda/service/dashboard/ProjectedValuesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes28.dex */
    public static final class Serializer implements KSerializer<ProjectedValuesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/yoda.service.dashboard.ProjectedValues", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ProjectedValuesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ProjectedValuesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ProjectedValuesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ProjectedValuesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lyoda/service/dashboard/ProjectedValuesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "yoda.service.dashboard.ProjectedValuesDto";
        }
    }
}
