package bonfire.proto.idl.portfolio.p037v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.portfolio.p037v1.PositionChartDirectionDto;
import bonfire.proto.idl.portfolio.p037v1.PositionChartDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.StructSerializer;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.PerformanceChartAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PositionChartDto.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040/12B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0016\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u0003\u0018\u00010\t0\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u0003\u0018\u00010\t0\b¢\u0006\u0004\b\u0006\u0010\u000fJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0013J!\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u0003\u0018\u00010\t0\b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u0003\u0018\u00010\t0\b8F¢\u0006\u0006\u001a\u0004\b.\u0010+¨\u00063"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionChartDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/portfolio/v1/PositionChart;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/portfolio/v1/PositionChartDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/portfolio/v1/PositionChartDto$Surrogate;)V", "", "", "", "chart_lines", "Lbonfire/proto/idl/portfolio/v1/PositionChartDirectionDto;", "page_direction", "overlays", "(Ljava/util/List;Lbonfire/proto/idl/portfolio/v1/PositionChartDirectionDto;Ljava/util/List;)V", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "(Lcom/squareup/moshi/Moshi;)Ljava/util/List;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/PerformanceChartAction;", "toProto", "()Lbonfire/proto/idl/portfolio/v1/PositionChart;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/portfolio/v1/PositionChartDto$Surrogate;", "getChart_lines", "()Ljava/util/List;", "getPage_direction", "()Lbonfire/proto/idl/portfolio/v1/PositionChartDirectionDto;", "getOverlays", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class PositionChartDto implements Dto3<PositionChart>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PositionChartDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PositionChartDto, PositionChart>> binaryBase64Serializer$delegate;
    private static final PositionChartDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PositionChartDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<Line> chart_lines(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        List<Line> list = (List) _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Line.class)))).fromJsonValue(CollectionsKt.filterNotNull(getChart_lines()));
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<UIComponent<PerformanceChartAction>> overlays(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        List<UIComponent<PerformanceChartAction>> list = (List) _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(List.class, companion.invariant(Reflection.typeOf(UIComponent.class, companion.invariant(Reflection.typeOf(PerformanceChartAction.class)))))).fromJsonValue(CollectionsKt.filterNotNull(getOverlays()));
        return list == null ? CollectionsKt.emptyList() : list;
    }

    private PositionChartDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<Map<String, ?>> getChart_lines() {
        return this.surrogate.getChart_lines();
    }

    public final PositionChartDirectionDto getPage_direction() {
        return this.surrogate.getPage_direction();
    }

    public final List<Map<String, ?>> getOverlays() {
        return this.surrogate.getOverlays();
    }

    public /* synthetic */ PositionChartDto(List list, PositionChartDirectionDto positionChartDirectionDto, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? PositionChartDirectionDto.INSTANCE.getZeroValue() : positionChartDirectionDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PositionChartDto(List<? extends Map<String, ?>> chart_lines, PositionChartDirectionDto page_direction, List<? extends Map<String, ?>> overlays) {
        this(new Surrogate(chart_lines, page_direction, overlays));
        Intrinsics.checkNotNullParameter(chart_lines, "chart_lines");
        Intrinsics.checkNotNullParameter(page_direction, "page_direction");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PositionChart toProto() {
        List<Map<String, Object>> chart_lines = this.surrogate.getChart_lines();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(chart_lines, 10));
        Iterator<T> it = chart_lines.iterator();
        while (it.hasNext()) {
            arrayList.add((Map) it.next());
        }
        PositionChartDirection positionChartDirection = (PositionChartDirection) this.surrogate.getPage_direction().toProto();
        List<Map<String, Object>> overlays = this.surrogate.getOverlays();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(overlays, 10));
        Iterator<T> it2 = overlays.iterator();
        while (it2.hasNext()) {
            arrayList2.add((Map) it2.next());
        }
        return new PositionChart(arrayList, positionChartDirection, arrayList2, null, 8, null);
    }

    public String toString() {
        return "[PositionChartDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PositionChartDto) && Intrinsics.areEqual(((PositionChartDto) other).surrogate, this.surrogate);
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
    /* compiled from: PositionChartDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/Bo\u0012-\b\u0002\u0010\b\u001a'\u0012#\u0012!\u0012\u0004\u0012\u00020\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0018\u00010\u00030\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012-\b\u0002\u0010\u000b\u001a'\u0012#\u0012!\u0012\u0004\u0012\u00020\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0018\u00010\u00030\u0002¢\u0006\u0004\b\f\u0010\rBe\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u001e\u0010\b\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#RE\u0010\b\u001a'\u0012#\u0012!\u0012\u0004\u0012\u00020\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0018\u00010\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+RE\u0010\u000b\u001a'\u0012#\u0012!\u0012\u0004\u0012\u00020\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0018\u00010\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010$\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010&¨\u00061"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionChartDto$Surrogate;", "", "", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/StructSerializer;", "chart_lines", "Lbonfire/proto/idl/portfolio/v1/PositionChartDirectionDto;", "page_direction", "overlays", "<init>", "(Ljava/util/List;Lbonfire/proto/idl/portfolio/v1/PositionChartDirectionDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lbonfire/proto/idl/portfolio/v1/PositionChartDirectionDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_portfolio_v1_externalRelease", "(Lbonfire/proto/idl/portfolio/v1/PositionChartDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChart_lines", "()Ljava/util/List;", "getChart_lines$annotations", "()V", "Lbonfire/proto/idl/portfolio/v1/PositionChartDirectionDto;", "getPage_direction", "()Lbonfire/proto/idl/portfolio/v1/PositionChartDirectionDto;", "getPage_direction$annotations", "getOverlays", "getOverlays$annotations", "Companion", "$serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<Map<String, Object>> chart_lines;
        private final List<Map<String, Object>> overlays;
        private final PositionChartDirectionDto page_direction;

        public Surrogate() {
            this((List) null, (PositionChartDirectionDto) null, (List) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(BuiltinSerializers.getNullable(new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(BuiltinSerializers.getNullable(new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE))));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.chart_lines, surrogate.chart_lines) && this.page_direction == surrogate.page_direction && Intrinsics.areEqual(this.overlays, surrogate.overlays);
        }

        public int hashCode() {
            return (((this.chart_lines.hashCode() * 31) + this.page_direction.hashCode()) * 31) + this.overlays.hashCode();
        }

        public String toString() {
            return "Surrogate(chart_lines=" + this.chart_lines + ", page_direction=" + this.page_direction + ", overlays=" + this.overlays + ")";
        }

        /* compiled from: PositionChartDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionChartDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/PositionChartDto$Surrogate;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PositionChartDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionChartDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionChartDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionChartDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionChartDto.Surrogate._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, List list, PositionChartDirectionDto positionChartDirectionDto, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            this.chart_lines = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.page_direction = PositionChartDirectionDto.INSTANCE.getZeroValue();
            } else {
                this.page_direction = positionChartDirectionDto;
            }
            if ((i & 4) == 0) {
                this.overlays = CollectionsKt.emptyList();
            } else {
                this.overlays = list2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_portfolio_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.chart_lines, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.chart_lines);
            }
            if (self.page_direction != PositionChartDirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, PositionChartDirectionDto.Serializer.INSTANCE, self.page_direction);
            }
            if (Intrinsics.areEqual(self.overlays, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.overlays);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(List<? extends Map<String, ? extends Object>> chart_lines, PositionChartDirectionDto page_direction, List<? extends Map<String, ? extends Object>> overlays) {
            Intrinsics.checkNotNullParameter(chart_lines, "chart_lines");
            Intrinsics.checkNotNullParameter(page_direction, "page_direction");
            Intrinsics.checkNotNullParameter(overlays, "overlays");
            this.chart_lines = chart_lines;
            this.page_direction = page_direction;
            this.overlays = overlays;
        }

        public final List<Map<String, Object>> getChart_lines() {
            return this.chart_lines;
        }

        public /* synthetic */ Surrogate(List list, PositionChartDirectionDto positionChartDirectionDto, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? PositionChartDirectionDto.INSTANCE.getZeroValue() : positionChartDirectionDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
        }

        public final PositionChartDirectionDto getPage_direction() {
            return this.page_direction;
        }

        public final List<Map<String, Object>> getOverlays() {
            return this.overlays;
        }
    }

    /* compiled from: PositionChartDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionChartDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/portfolio/v1/PositionChartDto;", "Lbonfire/proto/idl/portfolio/v1/PositionChart;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/portfolio/v1/PositionChartDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PositionChartDto, PositionChart> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PositionChartDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionChartDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionChartDto> getBinaryBase64Serializer() {
            return (KSerializer) PositionChartDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PositionChart> getProtoAdapter() {
            return PositionChart.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionChartDto getZeroValue() {
            return PositionChartDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionChartDto fromProto(PositionChart proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<Map<String, ?>> chart_lines = proto.getChart_lines();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(chart_lines, 10));
            Iterator<T> it = chart_lines.iterator();
            while (it.hasNext()) {
                arrayList.add((Map) it.next());
            }
            PositionChartDirectionDto positionChartDirectionDtoFromProto = PositionChartDirectionDto.INSTANCE.fromProto(proto.getPage_direction());
            List<Map<String, ?>> overlays = proto.getOverlays();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(overlays, 10));
            Iterator<T> it2 = overlays.iterator();
            while (it2.hasNext()) {
                arrayList2.add((Map) it2.next());
            }
            return new PositionChartDto(new Surrogate(arrayList, positionChartDirectionDtoFromProto, arrayList2), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionChartDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionChartDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new PositionChartDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PositionChartDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionChartDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/PositionChartDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/portfolio/v1/PositionChartDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PositionChartDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.portfolio.v1.PositionChart", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PositionChartDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PositionChartDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PositionChartDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PositionChartDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionChartDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.portfolio.v1.PositionChartDto";
        }
    }
}
