package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.GetPortfolioDigestsChartParamsInternalResponseDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: GetPortfolioDigestsChartParamsInternalResponseDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u0006\u0010\u000fJA\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b*\u0010)¨\u0006/"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponse;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$Surrogate;)V", "", "", "benchmark_ids", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "chart_starting_ts", "chart_ending_ts", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;)V", "copy", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$Surrogate;", "getBenchmark_ids", "()Ljava/util/List;", "getChart_starting_ts", "()Lj$/time/Instant;", "getChart_ending_ts", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class GetPortfolioDigestsChartParamsInternalResponseDto implements Dto3<GetPortfolioDigestsChartParamsInternalResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetPortfolioDigestsChartParamsInternalResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetPortfolioDigestsChartParamsInternalResponseDto, GetPortfolioDigestsChartParamsInternalResponse>> binaryBase64Serializer$delegate;
    private static final GetPortfolioDigestsChartParamsInternalResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetPortfolioDigestsChartParamsInternalResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetPortfolioDigestsChartParamsInternalResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<String> getBenchmark_ids() {
        return this.surrogate.getBenchmark_ids();
    }

    public final Instant getChart_starting_ts() {
        return this.surrogate.getChart_starting_ts();
    }

    public final Instant getChart_ending_ts() {
        return this.surrogate.getChart_ending_ts();
    }

    public /* synthetic */ GetPortfolioDigestsChartParamsInternalResponseDto(List list, Instant instant, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPortfolioDigestsChartParamsInternalResponseDto(List<String> benchmark_ids, Instant instant, Instant instant2) {
        this(new Surrogate(benchmark_ids, instant, instant2));
        Intrinsics.checkNotNullParameter(benchmark_ids, "benchmark_ids");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPortfolioDigestsChartParamsInternalResponseDto copy$default(GetPortfolioDigestsChartParamsInternalResponseDto getPortfolioDigestsChartParamsInternalResponseDto, List list, Instant instant, Instant instant2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getPortfolioDigestsChartParamsInternalResponseDto.surrogate.getBenchmark_ids();
        }
        if ((i & 2) != 0) {
            instant = getPortfolioDigestsChartParamsInternalResponseDto.surrogate.getChart_starting_ts();
        }
        if ((i & 4) != 0) {
            instant2 = getPortfolioDigestsChartParamsInternalResponseDto.surrogate.getChart_ending_ts();
        }
        return getPortfolioDigestsChartParamsInternalResponseDto.copy(list, instant, instant2);
    }

    public final GetPortfolioDigestsChartParamsInternalResponseDto copy(List<String> benchmark_ids, Instant chart_starting_ts, Instant chart_ending_ts) {
        Intrinsics.checkNotNullParameter(benchmark_ids, "benchmark_ids");
        return new GetPortfolioDigestsChartParamsInternalResponseDto(new Surrogate(benchmark_ids, chart_starting_ts, chart_ending_ts));
    }

    @Override // com.robinhood.idl.Dto
    public GetPortfolioDigestsChartParamsInternalResponse toProto() {
        List<String> benchmark_ids = this.surrogate.getBenchmark_ids();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(benchmark_ids, 10));
        Iterator<T> it = benchmark_ids.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new GetPortfolioDigestsChartParamsInternalResponse(arrayList, this.surrogate.getChart_starting_ts(), this.surrogate.getChart_ending_ts(), null, 8, null);
    }

    public String toString() {
        return "[GetPortfolioDigestsChartParamsInternalResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetPortfolioDigestsChartParamsInternalResponseDto) && Intrinsics.areEqual(((GetPortfolioDigestsChartParamsInternalResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetPortfolioDigestsChartParamsInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254Bw\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\u0004\b\f\u0010\rB?\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ6\u0010 \u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0080\u0001\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001dRF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001fRF\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001f¨\u00066"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$Surrogate;", "", "", "", "benchmark_ids", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "chart_starting_ts", "chart_ending_ts", "<init>", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lj$/time/Instant;", "component3", "copy", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$Surrogate;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBenchmark_ids", "getBenchmark_ids$annotations", "()V", "Lj$/time/Instant;", "getChart_starting_ts", "getChart_starting_ts$annotations", "getChart_ending_ts", "getChart_ending_ts$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<String> benchmark_ids;
        private final Instant chart_ending_ts;
        private final Instant chart_starting_ts;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.copilot.proto.v1.GetPortfolioDigestsChartParamsInternalResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetPortfolioDigestsChartParamsInternalResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((List) null, (Instant) null, (Instant) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, List list, Instant instant, Instant instant2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = surrogate.benchmark_ids;
            }
            if ((i & 2) != 0) {
                instant = surrogate.chart_starting_ts;
            }
            if ((i & 4) != 0) {
                instant2 = surrogate.chart_ending_ts;
            }
            return surrogate.copy(list, instant, instant2);
        }

        @SerialName("benchmarkIds")
        @JsonAnnotations2(names = {"benchmark_ids"})
        public static /* synthetic */ void getBenchmark_ids$annotations() {
        }

        @SerialName("chartEndingTs")
        @JsonAnnotations2(names = {"chart_ending_ts"})
        public static /* synthetic */ void getChart_ending_ts$annotations() {
        }

        @SerialName("chartStartingTs")
        @JsonAnnotations2(names = {"chart_starting_ts"})
        public static /* synthetic */ void getChart_starting_ts$annotations() {
        }

        public final List<String> component1() {
            return this.benchmark_ids;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getChart_starting_ts() {
            return this.chart_starting_ts;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getChart_ending_ts() {
            return this.chart_ending_ts;
        }

        public final Surrogate copy(List<String> benchmark_ids, Instant chart_starting_ts, Instant chart_ending_ts) {
            Intrinsics.checkNotNullParameter(benchmark_ids, "benchmark_ids");
            return new Surrogate(benchmark_ids, chart_starting_ts, chart_ending_ts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.benchmark_ids, surrogate.benchmark_ids) && Intrinsics.areEqual(this.chart_starting_ts, surrogate.chart_starting_ts) && Intrinsics.areEqual(this.chart_ending_ts, surrogate.chart_ending_ts);
        }

        public int hashCode() {
            int iHashCode = this.benchmark_ids.hashCode() * 31;
            Instant instant = this.chart_starting_ts;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.chart_ending_ts;
            return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(benchmark_ids=" + this.benchmark_ids + ", chart_starting_ts=" + this.chart_starting_ts + ", chart_ending_ts=" + this.chart_ending_ts + ")";
        }

        /* compiled from: GetPortfolioDigestsChartParamsInternalResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetPortfolioDigestsChartParamsInternalResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, Instant instant, Instant instant2, SerializationConstructorMarker serializationConstructorMarker) {
            this.benchmark_ids = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.chart_starting_ts = null;
            } else {
                this.chart_starting_ts = instant;
            }
            if ((i & 4) == 0) {
                this.chart_ending_ts = null;
            } else {
                this.chart_ending_ts = instant2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.benchmark_ids, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.benchmark_ids);
            }
            Instant instant = self.chart_starting_ts;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.chart_ending_ts;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant2);
            }
        }

        public Surrogate(List<String> benchmark_ids, Instant instant, Instant instant2) {
            Intrinsics.checkNotNullParameter(benchmark_ids, "benchmark_ids");
            this.benchmark_ids = benchmark_ids;
            this.chart_starting_ts = instant;
            this.chart_ending_ts = instant2;
        }

        public final List<String> getBenchmark_ids() {
            return this.benchmark_ids;
        }

        public /* synthetic */ Surrogate(List list, Instant instant, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2);
        }

        public final Instant getChart_starting_ts() {
            return this.chart_starting_ts;
        }

        public final Instant getChart_ending_ts() {
            return this.chart_ending_ts;
        }
    }

    /* compiled from: GetPortfolioDigestsChartParamsInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetPortfolioDigestsChartParamsInternalResponseDto, GetPortfolioDigestsChartParamsInternalResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetPortfolioDigestsChartParamsInternalResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetPortfolioDigestsChartParamsInternalResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetPortfolioDigestsChartParamsInternalResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetPortfolioDigestsChartParamsInternalResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetPortfolioDigestsChartParamsInternalResponse> getProtoAdapter() {
            return GetPortfolioDigestsChartParamsInternalResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetPortfolioDigestsChartParamsInternalResponseDto getZeroValue() {
            return GetPortfolioDigestsChartParamsInternalResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetPortfolioDigestsChartParamsInternalResponseDto fromProto(GetPortfolioDigestsChartParamsInternalResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<String> benchmark_ids = proto.getBenchmark_ids();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(benchmark_ids, 10));
            Iterator<T> it = benchmark_ids.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new GetPortfolioDigestsChartParamsInternalResponseDto(new Surrogate(arrayList, proto.getChart_starting_ts(), proto.getChart_ending_ts()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.GetPortfolioDigestsChartParamsInternalResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetPortfolioDigestsChartParamsInternalResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetPortfolioDigestsChartParamsInternalResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetPortfolioDigestsChartParamsInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetPortfolioDigestsChartParamsInternalResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.GetPortfolioDigestsChartParamsInternalResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetPortfolioDigestsChartParamsInternalResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetPortfolioDigestsChartParamsInternalResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetPortfolioDigestsChartParamsInternalResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetPortfolioDigestsChartParamsInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.GetPortfolioDigestsChartParamsInternalResponseDto";
        }
    }
}
