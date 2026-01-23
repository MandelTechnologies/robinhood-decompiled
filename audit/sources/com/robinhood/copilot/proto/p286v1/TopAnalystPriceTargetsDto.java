package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.AnalystPriceTargetDto;
import com.robinhood.copilot.proto.p286v1.TopAnalystPriceTargetsDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: TopAnalystPriceTargetsDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0006\u0010\u000fJ@\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\tH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006)"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargets;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto$Surrogate;", "<init>", "(Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto$Surrogate;)V", "total_analysts", "", "highest", "", "Lcom/robinhood/copilot/proto/v1/AnalystPriceTargetDto;", "median", "lowest", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTotal_analysts", "()I", "getHighest", "()Ljava/util/List;", "getMedian", "getLowest", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class TopAnalystPriceTargetsDto implements Dto3<TopAnalystPriceTargets>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TopAnalystPriceTargetsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TopAnalystPriceTargetsDto, TopAnalystPriceTargets>> binaryBase64Serializer$delegate;
    private static final TopAnalystPriceTargetsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TopAnalystPriceTargetsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TopAnalystPriceTargetsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getTotal_analysts() {
        return this.surrogate.getTotal_analysts();
    }

    public final List<AnalystPriceTargetDto> getHighest() {
        return this.surrogate.getHighest();
    }

    public final List<AnalystPriceTargetDto> getMedian() {
        return this.surrogate.getMedian();
    }

    public final List<AnalystPriceTargetDto> getLowest() {
        return this.surrogate.getLowest();
    }

    public /* synthetic */ TopAnalystPriceTargetsDto(int i, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopAnalystPriceTargetsDto(int i, List<AnalystPriceTargetDto> highest, List<AnalystPriceTargetDto> median, List<AnalystPriceTargetDto> lowest) {
        this(new Surrogate(i, highest, median, lowest));
        Intrinsics.checkNotNullParameter(highest, "highest");
        Intrinsics.checkNotNullParameter(median, "median");
        Intrinsics.checkNotNullParameter(lowest, "lowest");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopAnalystPriceTargetsDto copy$default(TopAnalystPriceTargetsDto topAnalystPriceTargetsDto, int i, List list, List list2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = topAnalystPriceTargetsDto.surrogate.getTotal_analysts();
        }
        if ((i2 & 2) != 0) {
            list = topAnalystPriceTargetsDto.surrogate.getHighest();
        }
        if ((i2 & 4) != 0) {
            list2 = topAnalystPriceTargetsDto.surrogate.getMedian();
        }
        if ((i2 & 8) != 0) {
            list3 = topAnalystPriceTargetsDto.surrogate.getLowest();
        }
        return topAnalystPriceTargetsDto.copy(i, list, list2, list3);
    }

    public final TopAnalystPriceTargetsDto copy(int total_analysts, List<AnalystPriceTargetDto> highest, List<AnalystPriceTargetDto> median, List<AnalystPriceTargetDto> lowest) {
        Intrinsics.checkNotNullParameter(highest, "highest");
        Intrinsics.checkNotNullParameter(median, "median");
        Intrinsics.checkNotNullParameter(lowest, "lowest");
        return new TopAnalystPriceTargetsDto(new Surrogate(total_analysts, highest, median, lowest));
    }

    @Override // com.robinhood.idl.Dto
    public TopAnalystPriceTargets toProto() {
        int total_analysts = this.surrogate.getTotal_analysts();
        List<AnalystPriceTargetDto> highest = this.surrogate.getHighest();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(highest, 10));
        Iterator<T> it = highest.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnalystPriceTargetDto) it.next()).toProto());
        }
        List<AnalystPriceTargetDto> median = this.surrogate.getMedian();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(median, 10));
        Iterator<T> it2 = median.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AnalystPriceTargetDto) it2.next()).toProto());
        }
        List<AnalystPriceTargetDto> lowest = this.surrogate.getLowest();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(lowest, 10));
        Iterator<T> it3 = lowest.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((AnalystPriceTargetDto) it3.next()).toProto());
        }
        return new TopAnalystPriceTargets(total_analysts, arrayList, arrayList2, arrayList3, null, 16, null);
    }

    public String toString() {
        return "[TopAnalystPriceTargetsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TopAnalystPriceTargetsDto) && Intrinsics.areEqual(((TopAnalystPriceTargetsDto) other).surrogate, this.surrogate);
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
    /* compiled from: TopAnalystPriceTargetsDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201BP\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0011J\u0018\u0010\u001d\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JR\u0010!\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0018R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0018¨\u00062"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto$Surrogate;", "", "total_analysts", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "highest", "", "Lcom/robinhood/copilot/proto/v1/AnalystPriceTargetDto;", "median", "lowest", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTotal_analysts$annotations", "()V", "getTotal_analysts", "()I", "getHighest$annotations", "getHighest", "()Ljava/util/List;", "getMedian$annotations", "getMedian", "getLowest$annotations", "getLowest", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$copilot_service_v1_externalRelease", "$serializer", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<AnalystPriceTargetDto> highest;
        private final List<AnalystPriceTargetDto> lowest;
        private final List<AnalystPriceTargetDto> median;
        private final int total_analysts;

        public Surrogate() {
            this(0, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AnalystPriceTargetDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(AnalystPriceTargetDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(AnalystPriceTargetDto.Serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, List list, List list2, List list3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = surrogate.total_analysts;
            }
            if ((i2 & 2) != 0) {
                list = surrogate.highest;
            }
            if ((i2 & 4) != 0) {
                list2 = surrogate.median;
            }
            if ((i2 & 8) != 0) {
                list3 = surrogate.lowest;
            }
            return surrogate.copy(i, list, list2, list3);
        }

        @SerialName("highest")
        @JsonAnnotations2(names = {"highest"})
        public static /* synthetic */ void getHighest$annotations() {
        }

        @SerialName("lowest")
        @JsonAnnotations2(names = {"lowest"})
        public static /* synthetic */ void getLowest$annotations() {
        }

        @SerialName("median")
        @JsonAnnotations2(names = {"median"})
        public static /* synthetic */ void getMedian$annotations() {
        }

        @SerialName("totalAnalysts")
        @JsonAnnotations2(names = {"total_analysts"})
        public static /* synthetic */ void getTotal_analysts$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotal_analysts() {
            return this.total_analysts;
        }

        public final List<AnalystPriceTargetDto> component2() {
            return this.highest;
        }

        public final List<AnalystPriceTargetDto> component3() {
            return this.median;
        }

        public final List<AnalystPriceTargetDto> component4() {
            return this.lowest;
        }

        public final Surrogate copy(int total_analysts, List<AnalystPriceTargetDto> highest, List<AnalystPriceTargetDto> median, List<AnalystPriceTargetDto> lowest) {
            Intrinsics.checkNotNullParameter(highest, "highest");
            Intrinsics.checkNotNullParameter(median, "median");
            Intrinsics.checkNotNullParameter(lowest, "lowest");
            return new Surrogate(total_analysts, highest, median, lowest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.total_analysts == surrogate.total_analysts && Intrinsics.areEqual(this.highest, surrogate.highest) && Intrinsics.areEqual(this.median, surrogate.median) && Intrinsics.areEqual(this.lowest, surrogate.lowest);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.total_analysts) * 31) + this.highest.hashCode()) * 31) + this.median.hashCode()) * 31) + this.lowest.hashCode();
        }

        public String toString() {
            return "Surrogate(total_analysts=" + this.total_analysts + ", highest=" + this.highest + ", median=" + this.median + ", lowest=" + this.lowest + ")";
        }

        /* compiled from: TopAnalystPriceTargetsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TopAnalystPriceTargetsDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.TopAnalystPriceTargetsDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TopAnalystPriceTargetsDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.TopAnalystPriceTargetsDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TopAnalystPriceTargetsDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.TopAnalystPriceTargetsDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TopAnalystPriceTargetsDto.Surrogate._childSerializers$_anonymous_$1();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, int i2, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
            this.total_analysts = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.highest = CollectionsKt.emptyList();
            } else {
                this.highest = list;
            }
            if ((i & 4) == 0) {
                this.median = CollectionsKt.emptyList();
            } else {
                this.median = list2;
            }
            if ((i & 8) == 0) {
                this.lowest = CollectionsKt.emptyList();
            } else {
                this.lowest = list3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i = self.total_analysts;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.highest, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.highest);
            }
            if (!Intrinsics.areEqual(self.median, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.median);
            }
            if (Intrinsics.areEqual(self.lowest, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.lowest);
        }

        public Surrogate(int i, List<AnalystPriceTargetDto> highest, List<AnalystPriceTargetDto> median, List<AnalystPriceTargetDto> lowest) {
            Intrinsics.checkNotNullParameter(highest, "highest");
            Intrinsics.checkNotNullParameter(median, "median");
            Intrinsics.checkNotNullParameter(lowest, "lowest");
            this.total_analysts = i;
            this.highest = highest;
            this.median = median;
            this.lowest = lowest;
        }

        public final int getTotal_analysts() {
            return this.total_analysts;
        }

        public final List<AnalystPriceTargetDto> getHighest() {
            return this.highest;
        }

        public /* synthetic */ Surrogate(int i, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list3);
        }

        public final List<AnalystPriceTargetDto> getMedian() {
            return this.median;
        }

        public final List<AnalystPriceTargetDto> getLowest() {
            return this.lowest;
        }
    }

    /* compiled from: TopAnalystPriceTargetsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;", "Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargets;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TopAnalystPriceTargetsDto, TopAnalystPriceTargets> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TopAnalystPriceTargetsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TopAnalystPriceTargetsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TopAnalystPriceTargetsDto> getBinaryBase64Serializer() {
            return (KSerializer) TopAnalystPriceTargetsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TopAnalystPriceTargets> getProtoAdapter() {
            return TopAnalystPriceTargets.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TopAnalystPriceTargetsDto getZeroValue() {
            return TopAnalystPriceTargetsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TopAnalystPriceTargetsDto fromProto(TopAnalystPriceTargets proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int total_analysts = proto.getTotal_analysts();
            List<AnalystPriceTarget> highest = proto.getHighest();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(highest, 10));
            Iterator<T> it = highest.iterator();
            while (it.hasNext()) {
                arrayList.add(AnalystPriceTargetDto.INSTANCE.fromProto((AnalystPriceTarget) it.next()));
            }
            List<AnalystPriceTarget> median = proto.getMedian();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(median, 10));
            Iterator<T> it2 = median.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AnalystPriceTargetDto.INSTANCE.fromProto((AnalystPriceTarget) it2.next()));
            }
            List<AnalystPriceTarget> lowest = proto.getLowest();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(lowest, 10));
            Iterator<T> it3 = lowest.iterator();
            while (it3.hasNext()) {
                arrayList3.add(AnalystPriceTargetDto.INSTANCE.fromProto((AnalystPriceTarget) it3.next()));
            }
            return new TopAnalystPriceTargetsDto(new Surrogate(total_analysts, arrayList, arrayList2, arrayList3), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.TopAnalystPriceTargetsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TopAnalystPriceTargetsDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new TopAnalystPriceTargetsDto(0, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TopAnalystPriceTargetsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TopAnalystPriceTargetsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.TopAnalystPriceTargets", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TopAnalystPriceTargetsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TopAnalystPriceTargetsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TopAnalystPriceTargetsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TopAnalystPriceTargetsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.TopAnalystPriceTargetsDto";
        }
    }
}
