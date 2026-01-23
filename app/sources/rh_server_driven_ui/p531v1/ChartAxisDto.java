package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import rh_server_driven_ui.p531v1.ChartAxis;
import rh_server_driven_ui.p531v1.ChartAxisDto;
import rh_server_driven_ui.p531v1.ChartAxisLabelDto;
import rh_server_driven_ui.p531v1.ChartAxisRangeDto;
import rh_server_driven_ui.p531v1.DisplayTextDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: ChartAxisDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b,-./0123B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B]\b\u0016\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0004\b\u0006\u0010\u0014JZ\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u000fJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b¨\u00064"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ChartAxis;", "Landroid/os/Parcelable;", "surrogate", "Lrh_server_driven_ui/v1/ChartAxisDto$Surrogate;", "<init>", "(Lrh_server_driven_ui/v1/ChartAxisDto$Surrogate;)V", "labels", "", "Lrh_server_driven_ui/v1/ChartAxisLabelDto;", "range", "Lrh_server_driven_ui/v1/ChartAxisRangeDto;", "effective_range", "scrubbing_labels", "", "", "Lrh_server_driven_ui/v1/DisplayTextDto;", "cursor_data", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto;", "(Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxisRangeDto;Lrh_server_driven_ui/v1/ChartAxisRangeDto;Ljava/util/Map;Ljava/util/Map;)V", "getLabels", "()Ljava/util/List;", "getRange", "()Lrh_server_driven_ui/v1/ChartAxisRangeDto;", "getEffective_range", "getScrubbing_labels", "()Ljava/util/Map;", "getCursor_data", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ChartAxisCursorDataDto", "ComponentCursorDataDto", "AxisCursorDataListDto", "AxisCursorDataDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class ChartAxisDto implements Dto3<ChartAxis>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ChartAxisDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ChartAxisDto, ChartAxis>> binaryBase64Serializer$delegate;
    private static final ChartAxisDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ChartAxisDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ChartAxisDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<ChartAxisLabelDto> getLabels() {
        return this.surrogate.getLabels();
    }

    public final ChartAxisRangeDto getRange() {
        return this.surrogate.getRange();
    }

    public final ChartAxisRangeDto getEffective_range() {
        return this.surrogate.getEffective_range();
    }

    public final Map<String, DisplayTextDto> getScrubbing_labels() {
        return this.surrogate.getScrubbing_labels();
    }

    public final Map<String, ChartAxisCursorDataDto> getCursor_data() {
        return this.surrogate.getCursor_data();
    }

    public /* synthetic */ ChartAxisDto(List list, ChartAxisRangeDto chartAxisRangeDto, ChartAxisRangeDto chartAxisRangeDto2, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : chartAxisRangeDto, (i & 4) != 0 ? null : chartAxisRangeDto2, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? MapsKt.emptyMap() : map2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartAxisDto(List<ChartAxisLabelDto> labels, ChartAxisRangeDto chartAxisRangeDto, ChartAxisRangeDto chartAxisRangeDto2, Map<String, DisplayTextDto> scrubbing_labels, Map<String, ChartAxisCursorDataDto> cursor_data) {
        this(new Surrogate(labels, chartAxisRangeDto, chartAxisRangeDto2, scrubbing_labels, cursor_data));
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(scrubbing_labels, "scrubbing_labels");
        Intrinsics.checkNotNullParameter(cursor_data, "cursor_data");
    }

    public static /* synthetic */ ChartAxisDto copy$default(ChartAxisDto chartAxisDto, List list, ChartAxisRangeDto chartAxisRangeDto, ChartAxisRangeDto chartAxisRangeDto2, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chartAxisDto.surrogate.getLabels();
        }
        if ((i & 2) != 0) {
            chartAxisRangeDto = chartAxisDto.surrogate.getRange();
        }
        if ((i & 4) != 0) {
            chartAxisRangeDto2 = chartAxisDto.surrogate.getEffective_range();
        }
        if ((i & 8) != 0) {
            map = chartAxisDto.surrogate.getScrubbing_labels();
        }
        if ((i & 16) != 0) {
            map2 = chartAxisDto.surrogate.getCursor_data();
        }
        Map map3 = map2;
        ChartAxisRangeDto chartAxisRangeDto3 = chartAxisRangeDto2;
        return chartAxisDto.copy(list, chartAxisRangeDto, chartAxisRangeDto3, map, map3);
    }

    public final ChartAxisDto copy(List<ChartAxisLabelDto> labels, ChartAxisRangeDto range, ChartAxisRangeDto effective_range, Map<String, DisplayTextDto> scrubbing_labels, Map<String, ChartAxisCursorDataDto> cursor_data) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(scrubbing_labels, "scrubbing_labels");
        Intrinsics.checkNotNullParameter(cursor_data, "cursor_data");
        return new ChartAxisDto(new Surrogate(labels, range, effective_range, scrubbing_labels, cursor_data));
    }

    @Override // com.robinhood.idl.Dto
    public ChartAxis toProto() {
        List<ChartAxisLabelDto> labels = this.surrogate.getLabels();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels, 10));
        Iterator<T> it = labels.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChartAxisLabelDto) it.next()).toProto());
        }
        ChartAxisRangeDto range = this.surrogate.getRange();
        ChartAxisRange proto = range != null ? range.toProto() : null;
        ChartAxisRangeDto effective_range = this.surrogate.getEffective_range();
        ChartAxisRange proto2 = effective_range != null ? effective_range.toProto() : null;
        Set<Map.Entry<String, DisplayTextDto>> setEntrySet = this.surrogate.getScrubbing_labels().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), ((DisplayTextDto) entry.getValue()).toProto());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        Set<Map.Entry<String, ChartAxisCursorDataDto>> setEntrySet2 = this.surrogate.getCursor_data().entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet2, 10)), 16));
        Iterator<T> it3 = setEntrySet2.iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            Tuples2 tuples2M3642to2 = Tuples4.m3642to((String) entry2.getKey(), ((ChartAxisCursorDataDto) entry2.getValue()).toProto());
            linkedHashMap2.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
        }
        return new ChartAxis(arrayList, proto, proto2, linkedHashMap, linkedHashMap2, null, 32, null);
    }

    public String toString() {
        return "[ChartAxisDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ChartAxisDto) && Intrinsics.areEqual(((ChartAxisDto) other).surrogate, this.surrogate);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChartAxisDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287B[\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010-R,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b4\u0010*\u001a\u0004\b2\u00103R,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00101\u0012\u0004\b6\u0010*\u001a\u0004\b5\u00103¨\u00069"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$Surrogate;", "", "", "Lrh_server_driven_ui/v1/ChartAxisLabelDto;", "labels", "Lrh_server_driven_ui/v1/ChartAxisRangeDto;", "range", "effective_range", "", "", "Lrh_server_driven_ui/v1/DisplayTextDto;", "scrubbing_labels", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto;", "cursor_data", "<init>", "(Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxisRangeDto;Lrh_server_driven_ui/v1/ChartAxisRangeDto;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lrh_server_driven_ui/v1/ChartAxisRangeDto;Lrh_server_driven_ui/v1/ChartAxisRangeDto;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ChartAxisDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLabels", "()Ljava/util/List;", "getLabels$annotations", "()V", "Lrh_server_driven_ui/v1/ChartAxisRangeDto;", "getRange", "()Lrh_server_driven_ui/v1/ChartAxisRangeDto;", "getRange$annotations", "getEffective_range", "getEffective_range$annotations", "Ljava/util/Map;", "getScrubbing_labels", "()Ljava/util/Map;", "getScrubbing_labels$annotations", "getCursor_data", "getCursor_data$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, ChartAxisCursorDataDto> cursor_data;
        private final ChartAxisRangeDto effective_range;
        private final List<ChartAxisLabelDto> labels;
        private final ChartAxisRangeDto range;
        private final Map<String, DisplayTextDto> scrubbing_labels;

        public Surrogate() {
            this((List) null, (ChartAxisRangeDto) null, (ChartAxisRangeDto) null, (Map) null, (Map) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ChartAxisLabelDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, DisplayTextDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, ChartAxisCursorDataDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.labels, surrogate.labels) && Intrinsics.areEqual(this.range, surrogate.range) && Intrinsics.areEqual(this.effective_range, surrogate.effective_range) && Intrinsics.areEqual(this.scrubbing_labels, surrogate.scrubbing_labels) && Intrinsics.areEqual(this.cursor_data, surrogate.cursor_data);
        }

        public int hashCode() {
            int iHashCode = this.labels.hashCode() * 31;
            ChartAxisRangeDto chartAxisRangeDto = this.range;
            int iHashCode2 = (iHashCode + (chartAxisRangeDto == null ? 0 : chartAxisRangeDto.hashCode())) * 31;
            ChartAxisRangeDto chartAxisRangeDto2 = this.effective_range;
            return ((((iHashCode2 + (chartAxisRangeDto2 != null ? chartAxisRangeDto2.hashCode() : 0)) * 31) + this.scrubbing_labels.hashCode()) * 31) + this.cursor_data.hashCode();
        }

        public String toString() {
            return "Surrogate(labels=" + this.labels + ", range=" + this.range + ", effective_range=" + this.effective_range + ", scrubbing_labels=" + this.scrubbing_labels + ", cursor_data=" + this.cursor_data + ")";
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ChartAxisDto6.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rh_server_driven_ui.v1.ChartAxisDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartAxisDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rh_server_driven_ui.v1.ChartAxisDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartAxisDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rh_server_driven_ui.v1.ChartAxisDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartAxisDto.Surrogate._childSerializers$_anonymous_$1();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, List list, ChartAxisRangeDto chartAxisRangeDto, ChartAxisRangeDto chartAxisRangeDto2, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
            this.labels = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.range = null;
            } else {
                this.range = chartAxisRangeDto;
            }
            if ((i & 4) == 0) {
                this.effective_range = null;
            } else {
                this.effective_range = chartAxisRangeDto2;
            }
            if ((i & 8) == 0) {
                this.scrubbing_labels = MapsKt.emptyMap();
            } else {
                this.scrubbing_labels = map;
            }
            if ((i & 16) == 0) {
                this.cursor_data = MapsKt.emptyMap();
            } else {
                this.cursor_data = map2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.labels, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.labels);
            }
            ChartAxisRangeDto chartAxisRangeDto = self.range;
            if (chartAxisRangeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ChartAxisRangeDto.Serializer.INSTANCE, chartAxisRangeDto);
            }
            ChartAxisRangeDto chartAxisRangeDto2 = self.effective_range;
            if (chartAxisRangeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ChartAxisRangeDto.Serializer.INSTANCE, chartAxisRangeDto2);
            }
            if (!Intrinsics.areEqual(self.scrubbing_labels, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.scrubbing_labels);
            }
            if (Intrinsics.areEqual(self.cursor_data, MapsKt.emptyMap())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.cursor_data);
        }

        public Surrogate(List<ChartAxisLabelDto> labels, ChartAxisRangeDto chartAxisRangeDto, ChartAxisRangeDto chartAxisRangeDto2, Map<String, DisplayTextDto> scrubbing_labels, Map<String, ChartAxisCursorDataDto> cursor_data) {
            Intrinsics.checkNotNullParameter(labels, "labels");
            Intrinsics.checkNotNullParameter(scrubbing_labels, "scrubbing_labels");
            Intrinsics.checkNotNullParameter(cursor_data, "cursor_data");
            this.labels = labels;
            this.range = chartAxisRangeDto;
            this.effective_range = chartAxisRangeDto2;
            this.scrubbing_labels = scrubbing_labels;
            this.cursor_data = cursor_data;
        }

        public final List<ChartAxisLabelDto> getLabels() {
            return this.labels;
        }

        public /* synthetic */ Surrogate(List list, ChartAxisRangeDto chartAxisRangeDto, ChartAxisRangeDto chartAxisRangeDto2, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : chartAxisRangeDto, (i & 4) != 0 ? null : chartAxisRangeDto2, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? MapsKt.emptyMap() : map2);
        }

        public final ChartAxisRangeDto getRange() {
            return this.range;
        }

        public final ChartAxisRangeDto getEffective_range() {
            return this.effective_range;
        }

        public final Map<String, DisplayTextDto> getScrubbing_labels() {
            return this.scrubbing_labels;
        }

        public final Map<String, ChartAxisCursorDataDto> getCursor_data() {
            return this.cursor_data;
        }
    }

    /* compiled from: ChartAxisDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ChartAxisDto;", "Lrh_server_driven_ui/v1/ChartAxis;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ChartAxisDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ChartAxisDto, ChartAxis> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChartAxisDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartAxisDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartAxisDto> getBinaryBase64Serializer() {
            return (KSerializer) ChartAxisDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ChartAxis> getProtoAdapter() {
            return ChartAxis.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartAxisDto getZeroValue() {
            return ChartAxisDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartAxisDto fromProto(ChartAxis proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<ChartAxisLabel> labels = proto.getLabels();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels, 10));
            Iterator<T> it = labels.iterator();
            while (it.hasNext()) {
                arrayList.add(ChartAxisLabelDto.INSTANCE.fromProto((ChartAxisLabel) it.next()));
            }
            ChartAxisRange range = proto.getRange();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ChartAxisRangeDto chartAxisRangeDtoFromProto = range != null ? ChartAxisRangeDto.INSTANCE.fromProto(range) : null;
            ChartAxisRange effective_range = proto.getEffective_range();
            ChartAxisRangeDto chartAxisRangeDtoFromProto2 = effective_range != null ? ChartAxisRangeDto.INSTANCE.fromProto(effective_range) : null;
            Set<Map.Entry<String, DisplayText>> setEntrySet = proto.getScrubbing_labels().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), DisplayTextDto.INSTANCE.fromProto((DisplayText) entry.getValue()));
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            Set<Map.Entry<String, ChartAxis.ChartAxisCursorData>> setEntrySet2 = proto.getCursor_data().entrySet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet2, 10)), 16));
            Iterator<T> it3 = setEntrySet2.iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                Tuples2 tuples2M3642to2 = Tuples4.m3642to((String) entry2.getKey(), ChartAxisCursorDataDto.INSTANCE.fromProto((ChartAxis.ChartAxisCursorData) entry2.getValue()));
                linkedHashMap2.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
            }
            return new ChartAxisDto(new Surrogate(arrayList, chartAxisRangeDtoFromProto, chartAxisRangeDtoFromProto2, linkedHashMap, linkedHashMap2), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartAxisDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartAxisDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new ChartAxisDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ChartAxisDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ChartAxis$ChartAxisCursorData;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$Surrogate;)V", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto;", "concrete", "(Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto;)V", "toProto", "()Lrh_server_driven_ui/v1/ChartAxis$ChartAxisCursorData;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$Surrogate;", "getConcrete", "()Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto;", "Companion", "Surrogate", "ConcreteDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ChartAxisCursorDataDto implements Dto3<ChartAxis.ChartAxisCursorData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ChartAxisCursorDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ChartAxisCursorDataDto, ChartAxis.ChartAxisCursorData>> binaryBase64Serializer$delegate;
        private static final ChartAxisCursorDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ChartAxisCursorDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ChartAxisCursorDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final ConcreteDto getConcrete() {
            if (this.surrogate.getComponent_cursor_data() != null) {
                return new ConcreteDto.ComponentCursorData(this.surrogate.getComponent_cursor_data());
            }
            if (this.surrogate.getAxis_cursor_data() != null) {
                return new ConcreteDto.AxisCursorData(this.surrogate.getAxis_cursor_data());
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ChartAxisCursorDataDto(ConcreteDto concreteDto) {
            ConcreteDto.ComponentCursorData componentCursorData = concreteDto instanceof ConcreteDto.ComponentCursorData ? (ConcreteDto.ComponentCursorData) concreteDto : null;
            ComponentCursorDataDto value = componentCursorData != null ? componentCursorData.getValue() : null;
            ConcreteDto.AxisCursorData axisCursorData = concreteDto instanceof ConcreteDto.AxisCursorData ? (ConcreteDto.AxisCursorData) concreteDto : null;
            this(new Surrogate(value, axisCursorData != null ? axisCursorData.getValue() : null));
        }

        public /* synthetic */ ChartAxisCursorDataDto(ConcreteDto concreteDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : concreteDto);
        }

        @Override // com.robinhood.idl.Dto
        public ChartAxis.ChartAxisCursorData toProto() {
            ComponentCursorDataDto component_cursor_data = this.surrogate.getComponent_cursor_data();
            ChartAxis.ComponentCursorData proto = component_cursor_data != null ? component_cursor_data.toProto() : null;
            AxisCursorDataListDto axis_cursor_data = this.surrogate.getAxis_cursor_data();
            return new ChartAxis.ChartAxisCursorData(proto, axis_cursor_data != null ? axis_cursor_data.toProto() : null, null, 4, null);
        }

        public String toString() {
            return "[ChartAxisCursorDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ChartAxisCursorDataDto) && Intrinsics.areEqual(((ChartAxisCursorDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$Surrogate;", "", "Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;", "component_cursor_data", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;", "axis_cursor_data", "<init>", "(Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;", "getComponent_cursor_data", "()Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;", "getComponent_cursor_data$annotations", "()V", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;", "getAxis_cursor_data", "()Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;", "getAxis_cursor_data$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final AxisCursorDataListDto axis_cursor_data;
            private final ComponentCursorDataDto component_cursor_data;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((ComponentCursorDataDto) null, (AxisCursorDataListDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.component_cursor_data, surrogate.component_cursor_data) && Intrinsics.areEqual(this.axis_cursor_data, surrogate.axis_cursor_data);
            }

            public int hashCode() {
                ComponentCursorDataDto componentCursorDataDto = this.component_cursor_data;
                int iHashCode = (componentCursorDataDto == null ? 0 : componentCursorDataDto.hashCode()) * 31;
                AxisCursorDataListDto axisCursorDataListDto = this.axis_cursor_data;
                return iHashCode + (axisCursorDataListDto != null ? axisCursorDataListDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(component_cursor_data=" + this.component_cursor_data + ", axis_cursor_data=" + this.axis_cursor_data + ")";
            }

            /* compiled from: ChartAxisDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return ChartAxisDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, ComponentCursorDataDto componentCursorDataDto, AxisCursorDataListDto axisCursorDataListDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.component_cursor_data = null;
                } else {
                    this.component_cursor_data = componentCursorDataDto;
                }
                if ((i & 2) == 0) {
                    this.axis_cursor_data = null;
                } else {
                    this.axis_cursor_data = axisCursorDataListDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                ComponentCursorDataDto componentCursorDataDto = self.component_cursor_data;
                if (componentCursorDataDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, ComponentCursorDataDto.Serializer.INSTANCE, componentCursorDataDto);
                }
                AxisCursorDataListDto axisCursorDataListDto = self.axis_cursor_data;
                if (axisCursorDataListDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, AxisCursorDataListDto.Serializer.INSTANCE, axisCursorDataListDto);
                }
            }

            public Surrogate(ComponentCursorDataDto componentCursorDataDto, AxisCursorDataListDto axisCursorDataListDto) {
                this.component_cursor_data = componentCursorDataDto;
                this.axis_cursor_data = axisCursorDataListDto;
            }

            public /* synthetic */ Surrogate(ComponentCursorDataDto componentCursorDataDto, AxisCursorDataListDto axisCursorDataListDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : componentCursorDataDto, (i & 2) != 0 ? null : axisCursorDataListDto);
            }

            public final ComponentCursorDataDto getComponent_cursor_data() {
                return this.component_cursor_data;
            }

            public final AxisCursorDataListDto getAxis_cursor_data() {
                return this.axis_cursor_data;
            }
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto;", "Lrh_server_driven_ui/v1/ChartAxis$ChartAxisCursorData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ChartAxisCursorDataDto, ChartAxis.ChartAxisCursorData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ChartAxisCursorDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChartAxisCursorDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChartAxisCursorDataDto> getBinaryBase64Serializer() {
                return (KSerializer) ChartAxisCursorDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ChartAxis.ChartAxisCursorData> getProtoAdapter() {
                return ChartAxis.ChartAxisCursorData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartAxisCursorDataDto getZeroValue() {
                return ChartAxisCursorDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChartAxisCursorDataDto fromProto(ChartAxis.ChartAxisCursorData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                ChartAxis.ComponentCursorData component_cursor_data = proto.getComponent_cursor_data();
                DefaultConstructorMarker defaultConstructorMarker = null;
                ComponentCursorDataDto componentCursorDataDtoFromProto = component_cursor_data != null ? ComponentCursorDataDto.INSTANCE.fromProto(component_cursor_data) : null;
                ChartAxis.AxisCursorDataList axis_cursor_data = proto.getAxis_cursor_data();
                return new ChartAxisCursorDataDto(new Surrogate(componentCursorDataDtoFromProto, axis_cursor_data != null ? AxisCursorDataListDto.INSTANCE.fromProto(axis_cursor_data) : null), defaultConstructorMarker);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartAxisDto$ChartAxisCursorDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartAxisDto.ChartAxisCursorDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ChartAxisCursorDataDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "ComponentCursorData", "AxisCursorData", "Companion", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto$AxisCursorData;", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto$ComponentCursorData;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        public static abstract class ConcreteDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ ConcreteDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ConcreteDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: ChartAxisDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto$ComponentCursorData;", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;", "getValue", "()Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ComponentCursorData extends ConcreteDto {
                private final ComponentCursorDataDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ComponentCursorData) && Intrinsics.areEqual(this.value, ((ComponentCursorData) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ComponentCursorData(value=" + this.value + ")";
                }

                public final ComponentCursorDataDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ComponentCursorData(ComponentCursorDataDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: ChartAxisDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto$AxisCursorData;", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;", "getValue", "()Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class AxisCursorData extends ConcreteDto {
                private final AxisCursorDataListDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof AxisCursorData) && Intrinsics.areEqual(this.value, ((AxisCursorData) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "AxisCursorData(value=" + this.value + ")";
                }

                public final AxisCursorDataListDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AxisCursorData(AxisCursorDataListDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: ChartAxisDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ChartAxis$ChartAxisCursorData;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto4.Creator<ConcreteDto, ChartAxis.ChartAxisCursorData> {
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
                public ProtoAdapter<ChartAxis.ChartAxisCursorData> getProtoAdapter() {
                    return ChartAxis.ChartAxisCursorData.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ConcreteDto fromProto(ChartAxis.ChartAxisCursorData proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getComponent_cursor_data() != null) {
                        return new ComponentCursorData(ComponentCursorDataDto.INSTANCE.fromProto(proto.getComponent_cursor_data()));
                    }
                    if (proto.getAxis_cursor_data() != null) {
                        return new AxisCursorData(AxisCursorDataListDto.INSTANCE.fromProto(proto.getAxis_cursor_data()));
                    }
                    return null;
                }
            }
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ChartAxisCursorDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ChartAxis.ChartAxisCursorData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ChartAxisCursorDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ChartAxisCursorDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ChartAxisCursorDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ChartAxisCursorDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.ChartAxisDto$ChartAxisCursorDataDto";
            }
        }
    }

    /* compiled from: ChartAxisDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006$"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ChartAxis$ComponentCursorData;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto$Surrogate;)V", "Lrh_server_driven_ui/v1/UIComponentDto;", "component", "(Lrh_server_driven_ui/v1/UIComponentDto;)V", "toProto", "()Lrh_server_driven_ui/v1/ChartAxis$ComponentCursorData;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ComponentCursorDataDto implements Dto3<ChartAxis.ComponentCursorData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ComponentCursorDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ComponentCursorDataDto, ChartAxis.ComponentCursorData>> binaryBase64Serializer$delegate;
        private static final ComponentCursorDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ComponentCursorDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ComponentCursorDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public ComponentCursorDataDto(UIComponentDto uIComponentDto) {
            this(new Surrogate(uIComponentDto));
        }

        public /* synthetic */ ComponentCursorDataDto(UIComponentDto uIComponentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uIComponentDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public ChartAxis.ComponentCursorData toProto() {
            UIComponentDto component = this.surrogate.getComponent();
            return new ChartAxis.ComponentCursorData(component != null ? component.toProto() : null, null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[ComponentCursorDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ComponentCursorDataDto) && Intrinsics.areEqual(((ComponentCursorDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto$Surrogate;", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "component", "<init>", "(Lrh_server_driven_ui/v1/UIComponentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/UIComponentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/UIComponentDto;", "getComponent", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getComponent$annotations", "()V", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final UIComponentDto component;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((UIComponentDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.component, ((Surrogate) other).component);
            }

            public int hashCode() {
                UIComponentDto uIComponentDto = this.component;
                if (uIComponentDto == null) {
                    return 0;
                }
                return uIComponentDto.hashCode();
            }

            public String toString() {
                return "Surrogate(component=" + this.component + ")";
            }

            /* compiled from: ChartAxisDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return ChartAxisDto5.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, UIComponentDto uIComponentDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.component = null;
                } else {
                    this.component = uIComponentDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                UIComponentDto uIComponentDto = self.component;
                if (uIComponentDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, UIComponentDto.Serializer.INSTANCE, uIComponentDto);
                }
            }

            public Surrogate(UIComponentDto uIComponentDto) {
                this.component = uIComponentDto;
            }

            public /* synthetic */ Surrogate(UIComponentDto uIComponentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : uIComponentDto);
            }

            public final UIComponentDto getComponent() {
                return this.component;
            }
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;", "Lrh_server_driven_ui/v1/ChartAxis$ComponentCursorData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ComponentCursorDataDto, ChartAxis.ComponentCursorData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ComponentCursorDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ComponentCursorDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ComponentCursorDataDto> getBinaryBase64Serializer() {
                return (KSerializer) ComponentCursorDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ChartAxis.ComponentCursorData> getProtoAdapter() {
                return ChartAxis.ComponentCursorData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ComponentCursorDataDto getZeroValue() {
                return ComponentCursorDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ComponentCursorDataDto fromProto(ChartAxis.ComponentCursorData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                UIComponent component = proto.getComponent();
                return new ComponentCursorDataDto(new Surrogate(component != null ? UIComponentDto.INSTANCE.fromProto(component) : null), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartAxisDto$ComponentCursorDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartAxisDto.ComponentCursorDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ComponentCursorDataDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ComponentCursorDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ChartAxis.ComponentCursorData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ComponentCursorDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ComponentCursorDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ComponentCursorDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$ComponentCursorDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.ChartAxisDto$ComponentCursorDataDto";
            }
        }
    }

    /* compiled from: ChartAxisDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ChartAxis$AxisCursorDataList;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto$Surrogate;)V", "Lrh_server_driven_ui/v1/DisplayTextDto;", "title", "", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto;", WebsocketGatewayConstants.DATA_KEY, "(Lrh_server_driven_ui/v1/DisplayTextDto;Ljava/util/List;)V", "toProto", "()Lrh_server_driven_ui/v1/ChartAxis$AxisCursorDataList;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto$Surrogate;", "getTitle", "()Lrh_server_driven_ui/v1/DisplayTextDto;", "getData", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AxisCursorDataListDto implements Dto3<ChartAxis.AxisCursorDataList>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<AxisCursorDataListDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AxisCursorDataListDto, ChartAxis.AxisCursorDataList>> binaryBase64Serializer$delegate;
        private static final AxisCursorDataListDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ AxisCursorDataListDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AxisCursorDataListDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final DisplayTextDto getTitle() {
            return this.surrogate.getTitle();
        }

        public final List<AxisCursorDataDto> getData() {
            return this.surrogate.getData();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AxisCursorDataListDto(DisplayTextDto displayTextDto, List<AxisCursorDataDto> data) {
            this(new Surrogate(displayTextDto, data));
            Intrinsics.checkNotNullParameter(data, "data");
        }

        public /* synthetic */ AxisCursorDataListDto(DisplayTextDto displayTextDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : displayTextDto, (List<AxisCursorDataDto>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list));
        }

        @Override // com.robinhood.idl.Dto
        public ChartAxis.AxisCursorDataList toProto() {
            DisplayTextDto title = this.surrogate.getTitle();
            DisplayText proto = title != null ? title.toProto() : null;
            List<AxisCursorDataDto> data = this.surrogate.getData();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(((AxisCursorDataDto) it.next()).toProto());
            }
            return new ChartAxis.AxisCursorDataList(proto, arrayList, null, 4, null);
        }

        public String toString() {
            return "[AxisCursorDataListDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof AxisCursorDataListDto) && Intrinsics.areEqual(((AxisCursorDataListDto) other).surrogate, this.surrogate);
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
        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'¨\u0006+"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto$Surrogate;", "", "Lrh_server_driven_ui/v1/DisplayTextDto;", "title", "", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto;", WebsocketGatewayConstants.DATA_KEY, "<init>", "(Lrh_server_driven_ui/v1/DisplayTextDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/DisplayTextDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/DisplayTextDto;", "getTitle", "()Lrh_server_driven_ui/v1/DisplayTextDto;", "getTitle$annotations", "()V", "Ljava/util/List;", "getData", "()Ljava/util/List;", "getData$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final List<AxisCursorDataDto> data;
            private final DisplayTextDto title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: rh_server_driven_ui.v1.ChartAxisDto$AxisCursorDataListDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartAxisDto.AxisCursorDataListDto.Surrogate._childSerializers$_anonymous_();
                }
            })};

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((DisplayTextDto) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(AxisCursorDataDto.Serializer.INSTANCE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.data, surrogate.data);
            }

            public int hashCode() {
                DisplayTextDto displayTextDto = this.title;
                return ((displayTextDto == null ? 0 : displayTextDto.hashCode()) * 31) + this.data.hashCode();
            }

            public String toString() {
                return "Surrogate(title=" + this.title + ", data=" + this.data + ")";
            }

            /* compiled from: ChartAxisDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return ChartAxisDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, DisplayTextDto displayTextDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
                this.title = (i & 1) == 0 ? null : displayTextDto;
                if ((i & 2) == 0) {
                    this.data = CollectionsKt.emptyList();
                } else {
                    this.data = list;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                DisplayTextDto displayTextDto = self.title;
                if (displayTextDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, DisplayTextDto.Serializer.INSTANCE, displayTextDto);
                }
                if (Intrinsics.areEqual(self.data, CollectionsKt.emptyList())) {
                    return;
                }
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.data);
            }

            public Surrogate(DisplayTextDto displayTextDto, List<AxisCursorDataDto> data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.title = displayTextDto;
                this.data = data;
            }

            public final DisplayTextDto getTitle() {
                return this.title;
            }

            public final List<AxisCursorDataDto> getData() {
                return this.data;
            }

            public /* synthetic */ Surrogate(DisplayTextDto displayTextDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : displayTextDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
            }
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;", "Lrh_server_driven_ui/v1/ChartAxis$AxisCursorDataList;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<AxisCursorDataListDto, ChartAxis.AxisCursorDataList> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AxisCursorDataListDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AxisCursorDataListDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AxisCursorDataListDto> getBinaryBase64Serializer() {
                return (KSerializer) AxisCursorDataListDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ChartAxis.AxisCursorDataList> getProtoAdapter() {
                return ChartAxis.AxisCursorDataList.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AxisCursorDataListDto getZeroValue() {
                return AxisCursorDataListDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AxisCursorDataListDto fromProto(ChartAxis.AxisCursorDataList proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                DisplayText title = proto.getTitle();
                DefaultConstructorMarker defaultConstructorMarker = null;
                DisplayTextDto displayTextDtoFromProto = title != null ? DisplayTextDto.INSTANCE.fromProto(title) : null;
                List<ChartAxis.AxisCursorData> data = proto.getData();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
                Iterator<T> it = data.iterator();
                while (it.hasNext()) {
                    arrayList.add(AxisCursorDataDto.INSTANCE.fromProto((ChartAxis.AxisCursorData) it.next()));
                }
                return new AxisCursorDataListDto(new Surrogate(displayTextDtoFromProto, arrayList), defaultConstructorMarker);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartAxisDto$AxisCursorDataListDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartAxisDto.AxisCursorDataListDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new AxisCursorDataListDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<AxisCursorDataListDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ChartAxis.AxisCursorDataList", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AxisCursorDataListDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public AxisCursorDataListDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new AxisCursorDataListDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataListDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.ChartAxisDto$AxisCursorDataListDto";
            }
        }
    }

    /* compiled from: ChartAxisDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ChartAxis$AxisCursorData;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto$Surrogate;)V", "", "id", "Lrh_server_driven_ui/v1/DisplayTextDto;", WebsocketGatewayConstants.DATA_KEY, "(Ljava/lang/String;Lrh_server_driven_ui/v1/DisplayTextDto;)V", "toProto", "()Lrh_server_driven_ui/v1/ChartAxis$AxisCursorData;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto$Surrogate;", "getData", "()Lrh_server_driven_ui/v1/DisplayTextDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AxisCursorDataDto implements Dto3<ChartAxis.AxisCursorData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<AxisCursorDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AxisCursorDataDto, ChartAxis.AxisCursorData>> binaryBase64Serializer$delegate;
        private static final AxisCursorDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ AxisCursorDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AxisCursorDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final DisplayTextDto getData() {
            return this.surrogate.getData();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AxisCursorDataDto(String id, DisplayTextDto displayTextDto) {
            this(new Surrogate(id, displayTextDto));
            Intrinsics.checkNotNullParameter(id, "id");
        }

        public /* synthetic */ AxisCursorDataDto(String str, DisplayTextDto displayTextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : displayTextDto);
        }

        @Override // com.robinhood.idl.Dto
        public ChartAxis.AxisCursorData toProto() {
            String id = this.surrogate.getId();
            DisplayTextDto data = this.surrogate.getData();
            return new ChartAxis.AxisCursorData(id, data != null ? data.toProto() : null, null, 4, null);
        }

        public String toString() {
            return "[AxisCursorDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof AxisCursorDataDto) && Intrinsics.areEqual(((AxisCursorDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006("}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto$Surrogate;", "", "", "id", "Lrh_server_driven_ui/v1/DisplayTextDto;", WebsocketGatewayConstants.DATA_KEY, "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/DisplayTextDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/DisplayTextDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lrh_server_driven_ui/v1/DisplayTextDto;", "getData", "()Lrh_server_driven_ui/v1/DisplayTextDto;", "getData$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DisplayTextDto data;
            private final String id;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, (DisplayTextDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.data, surrogate.data);
            }

            public int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                DisplayTextDto displayTextDto = this.data;
                return iHashCode + (displayTextDto == null ? 0 : displayTextDto.hashCode());
            }

            public String toString() {
                return "Surrogate(id=" + this.id + ", data=" + this.data + ")";
            }

            /* compiled from: ChartAxisDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return ChartAxisDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, DisplayTextDto displayTextDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.id = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.data = null;
                } else {
                    this.data = displayTextDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.id, "")) {
                    output.encodeStringElement(serialDesc, 0, self.id);
                }
                DisplayTextDto displayTextDto = self.data;
                if (displayTextDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, DisplayTextDto.Serializer.INSTANCE, displayTextDto);
                }
            }

            public Surrogate(String id, DisplayTextDto displayTextDto) {
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
                this.data = displayTextDto;
            }

            public final String getId() {
                return this.id;
            }

            public /* synthetic */ Surrogate(String str, DisplayTextDto displayTextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : displayTextDto);
            }

            public final DisplayTextDto getData() {
                return this.data;
            }
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto;", "Lrh_server_driven_ui/v1/ChartAxis$AxisCursorData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<AxisCursorDataDto, ChartAxis.AxisCursorData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AxisCursorDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AxisCursorDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AxisCursorDataDto> getBinaryBase64Serializer() {
                return (KSerializer) AxisCursorDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ChartAxis.AxisCursorData> getProtoAdapter() {
                return ChartAxis.AxisCursorData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AxisCursorDataDto getZeroValue() {
                return AxisCursorDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AxisCursorDataDto fromProto(ChartAxis.AxisCursorData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String id = proto.getId();
                DisplayText data = proto.getData();
                return new AxisCursorDataDto(new Surrogate(id, data != null ? DisplayTextDto.INSTANCE.fromProto(data) : null), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartAxisDto$AxisCursorDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartAxisDto.AxisCursorDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new AxisCursorDataDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<AxisCursorDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ChartAxis.AxisCursorData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AxisCursorDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public AxisCursorDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new AxisCursorDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: ChartAxisDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$AxisCursorDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.ChartAxisDto$AxisCursorDataDto";
            }
        }
    }

    /* compiled from: ChartAxisDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ChartAxisDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ChartAxisDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ChartAxis", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ChartAxisDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ChartAxisDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ChartAxisDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ChartAxisDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.ChartAxisDto";
        }
    }
}
