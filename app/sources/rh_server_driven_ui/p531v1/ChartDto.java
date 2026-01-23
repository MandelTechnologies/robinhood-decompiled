package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
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
import rh_server_driven_ui.p531v1.ChartAxisDto;
import rh_server_driven_ui.p531v1.ChartDto;
import rh_server_driven_ui.p531v1.ChartFillDto;
import rh_server_driven_ui.p531v1.ChartLegendItemListDto;
import rh_server_driven_ui.p531v1.LineDto;
import rh_server_driven_ui.p531v1.TextDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: ChartDto.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004@?ABB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008b\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u001bJ\u008f\u0001\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b0\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b:\u00109R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f8F¢\u0006\u0006\u001a\u0004\b=\u00107R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b>\u00109¨\u0006C"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Chart;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/ChartDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/ChartDto$Surrogate;)V", "Lrh_server_driven_ui/v1/TextDto;", "title", "", "weight", "", "Lrh_server_driven_ui/v1/LineDto;", "lines", "Lrh_server_driven_ui/v1/ChartAxisDto;", "x_axis", "y_axis", "", "", "Lrh_server_driven_ui/v1/ChartLegendItemListDto;", "legend_data", "Lrh_server_driven_ui/v1/ChartFillDto;", "fills", "Lrh_server_driven_ui/v1/UIComponentDto;", "overlays", "y_axis_secondary", "(Lrh_server_driven_ui/v1/TextDto;Ljava/lang/Float;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxisDto;Lrh_server_driven_ui/v1/ChartAxisDto;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxisDto;)V", "copy", "(Lrh_server_driven_ui/v1/TextDto;Ljava/lang/Float;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxisDto;Lrh_server_driven_ui/v1/ChartAxisDto;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxisDto;)Lrh_server_driven_ui/v1/ChartDto;", "toProto", "()Lrh_server_driven_ui/v1/Chart;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/ChartDto$Surrogate;", "getTitle", "()Lrh_server_driven_ui/v1/TextDto;", "getWeight", "()Ljava/lang/Float;", "getLines", "()Ljava/util/List;", "getX_axis", "()Lrh_server_driven_ui/v1/ChartAxisDto;", "getY_axis", "getLegend_data", "()Ljava/util/Map;", "getFills", "getY_axis_secondary", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class ChartDto implements Dto3<Chart>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ChartDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ChartDto, Chart>> binaryBase64Serializer$delegate;
    private static final ChartDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ChartDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ChartDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TextDto getTitle() {
        return this.surrogate.getTitle();
    }

    public final Float getWeight() {
        return this.surrogate.getWeight();
    }

    public final List<LineDto> getLines() {
        return this.surrogate.getLines();
    }

    public final ChartAxisDto getX_axis() {
        return this.surrogate.getX_axis();
    }

    public final ChartAxisDto getY_axis() {
        return this.surrogate.getY_axis();
    }

    public final Map<String, ChartLegendItemListDto> getLegend_data() {
        return this.surrogate.getLegend_data();
    }

    public final List<ChartFillDto> getFills() {
        return this.surrogate.getFills();
    }

    public final ChartAxisDto getY_axis_secondary() {
        return this.surrogate.getY_axis_secondary();
    }

    public /* synthetic */ ChartDto(TextDto textDto, Float f, List list, ChartAxisDto chartAxisDto, ChartAxisDto chartAxisDto2, Map map, List list2, List list3, ChartAxisDto chartAxisDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textDto, (i & 2) != 0 ? null : f, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : chartAxisDto, (i & 16) != 0 ? null : chartAxisDto2, (i & 32) != 0 ? MapsKt.emptyMap() : map, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? CollectionsKt.emptyList() : list3, (i & 256) != 0 ? null : chartAxisDto3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartDto(TextDto textDto, Float f, List<LineDto> lines, ChartAxisDto chartAxisDto, ChartAxisDto chartAxisDto2, Map<String, ChartLegendItemListDto> legend_data, List<ChartFillDto> fills, List<UIComponentDto> overlays, ChartAxisDto chartAxisDto3) {
        this(new Surrogate(textDto, f, lines, chartAxisDto, chartAxisDto2, legend_data, fills, overlays, chartAxisDto3));
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(legend_data, "legend_data");
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
    }

    public static /* synthetic */ ChartDto copy$default(ChartDto chartDto, TextDto textDto, Float f, List list, ChartAxisDto chartAxisDto, ChartAxisDto chartAxisDto2, Map map, List list2, List list3, ChartAxisDto chartAxisDto3, int i, Object obj) {
        if ((i & 1) != 0) {
            textDto = chartDto.surrogate.getTitle();
        }
        if ((i & 2) != 0) {
            f = chartDto.surrogate.getWeight();
        }
        if ((i & 4) != 0) {
            list = chartDto.surrogate.getLines();
        }
        if ((i & 8) != 0) {
            chartAxisDto = chartDto.surrogate.getX_axis();
        }
        if ((i & 16) != 0) {
            chartAxisDto2 = chartDto.surrogate.getY_axis();
        }
        if ((i & 32) != 0) {
            map = chartDto.surrogate.getLegend_data();
        }
        if ((i & 64) != 0) {
            list2 = chartDto.surrogate.getFills();
        }
        if ((i & 128) != 0) {
            list3 = chartDto.surrogate.getOverlays();
        }
        if ((i & 256) != 0) {
            chartAxisDto3 = chartDto.surrogate.getY_axis_secondary();
        }
        List list4 = list3;
        ChartAxisDto chartAxisDto4 = chartAxisDto3;
        Map map2 = map;
        List list5 = list2;
        ChartAxisDto chartAxisDto5 = chartAxisDto2;
        List list6 = list;
        return chartDto.copy(textDto, f, list6, chartAxisDto, chartAxisDto5, map2, list5, list4, chartAxisDto4);
    }

    public final ChartDto copy(TextDto title, Float weight, List<LineDto> lines, ChartAxisDto x_axis, ChartAxisDto y_axis, Map<String, ChartLegendItemListDto> legend_data, List<ChartFillDto> fills, List<UIComponentDto> overlays, ChartAxisDto y_axis_secondary) {
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(legend_data, "legend_data");
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        return new ChartDto(new Surrogate(title, weight, lines, x_axis, y_axis, legend_data, fills, overlays, y_axis_secondary));
    }

    @Override // com.robinhood.idl.Dto
    public Chart toProto() {
        TextDto title = this.surrogate.getTitle();
        Text proto = title != null ? title.toProto() : null;
        Float weight = this.surrogate.getWeight();
        List<LineDto> lines = this.surrogate.getLines();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lines, 10));
        Iterator<T> it = lines.iterator();
        while (it.hasNext()) {
            arrayList.add(((LineDto) it.next()).toProto());
        }
        ChartAxisDto x_axis = this.surrogate.getX_axis();
        ChartAxis proto2 = x_axis != null ? x_axis.toProto() : null;
        ChartAxisDto y_axis = this.surrogate.getY_axis();
        ChartAxis proto3 = y_axis != null ? y_axis.toProto() : null;
        Set<Map.Entry<String, ChartLegendItemListDto>> setEntrySet = this.surrogate.getLegend_data().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), ((ChartLegendItemListDto) entry.getValue()).toProto());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        List<ChartFillDto> fills = this.surrogate.getFills();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(fills, 10));
        Iterator<T> it3 = fills.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((ChartFillDto) it3.next()).toProto());
        }
        List<UIComponentDto> overlays = this.surrogate.getOverlays();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(overlays, 10));
        Iterator<T> it4 = overlays.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((UIComponentDto) it4.next()).toProto());
        }
        ChartAxisDto y_axis_secondary = this.surrogate.getY_axis_secondary();
        return new Chart(proto, weight, arrayList, proto2, proto3, linkedHashMap, arrayList2, arrayList3, y_axis_secondary != null ? y_axis_secondary.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[ChartDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ChartDto) && Intrinsics.areEqual(((ChartDto) other).surrogate, this.surrogate);
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
    /* compiled from: ChartDto.kt */
    @Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\"\b\u0083\b\u0018\u0000 M2\u00020\u0001:\u0002NMB\u0098\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0019\b\u0002\u0010\b\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0018\u0010\u0019B\u0093\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R1\u0010\b\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b8\u00104\u001a\u0004\b6\u00107R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b<\u00104\u001a\u0004\b:\u0010;R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\b@\u00104\u001a\u0004\b>\u0010?R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\bB\u00104\u001a\u0004\bA\u0010?R,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010C\u0012\u0004\bF\u00104\u001a\u0004\bD\u0010ER&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00109\u0012\u0004\bH\u00104\u001a\u0004\bG\u0010;R&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00109\u0012\u0004\bJ\u00104\u001a\u0004\bI\u0010;R\"\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010=\u0012\u0004\bL\u00104\u001a\u0004\bK\u0010?¨\u0006O"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartDto$Surrogate;", "", "Lrh_server_driven_ui/v1/TextDto;", "title", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "weight", "", "Lrh_server_driven_ui/v1/LineDto;", "lines", "Lrh_server_driven_ui/v1/ChartAxisDto;", "x_axis", "y_axis", "", "", "Lrh_server_driven_ui/v1/ChartLegendItemListDto;", "legend_data", "Lrh_server_driven_ui/v1/ChartFillDto;", "fills", "Lrh_server_driven_ui/v1/UIComponentDto;", "overlays", "y_axis_secondary", "<init>", "(Lrh_server_driven_ui/v1/TextDto;Ljava/lang/Float;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxisDto;Lrh_server_driven_ui/v1/ChartAxisDto;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxisDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/TextDto;Ljava/lang/Float;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxisDto;Lrh_server_driven_ui/v1/ChartAxisDto;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxisDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ChartDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TextDto;", "getTitle", "()Lrh_server_driven_ui/v1/TextDto;", "getTitle$annotations", "()V", "Ljava/lang/Float;", "getWeight", "()Ljava/lang/Float;", "getWeight$annotations", "Ljava/util/List;", "getLines", "()Ljava/util/List;", "getLines$annotations", "Lrh_server_driven_ui/v1/ChartAxisDto;", "getX_axis", "()Lrh_server_driven_ui/v1/ChartAxisDto;", "getX_axis$annotations", "getY_axis", "getY_axis$annotations", "Ljava/util/Map;", "getLegend_data", "()Ljava/util/Map;", "getLegend_data$annotations", "getFills", "getFills$annotations", "getOverlays", "getOverlays$annotations", "getY_axis_secondary", "getY_axis_secondary$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<ChartFillDto> fills;
        private final Map<String, ChartLegendItemListDto> legend_data;
        private final List<LineDto> lines;
        private final List<UIComponentDto> overlays;
        private final TextDto title;
        private final Float weight;
        private final ChartAxisDto x_axis;
        private final ChartAxisDto y_axis;
        private final ChartAxisDto y_axis_secondary;

        public Surrogate() {
            this((TextDto) null, (Float) null, (List) null, (ChartAxisDto) null, (ChartAxisDto) null, (Map) null, (List) null, (List) null, (ChartAxisDto) null, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(LineDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, ChartLegendItemListDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(ChartFillDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return new ArrayListSerializer(UIComponentDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual((Object) this.weight, (Object) surrogate.weight) && Intrinsics.areEqual(this.lines, surrogate.lines) && Intrinsics.areEqual(this.x_axis, surrogate.x_axis) && Intrinsics.areEqual(this.y_axis, surrogate.y_axis) && Intrinsics.areEqual(this.legend_data, surrogate.legend_data) && Intrinsics.areEqual(this.fills, surrogate.fills) && Intrinsics.areEqual(this.overlays, surrogate.overlays) && Intrinsics.areEqual(this.y_axis_secondary, surrogate.y_axis_secondary);
        }

        public int hashCode() {
            TextDto textDto = this.title;
            int iHashCode = (textDto == null ? 0 : textDto.hashCode()) * 31;
            Float f = this.weight;
            int iHashCode2 = (((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + this.lines.hashCode()) * 31;
            ChartAxisDto chartAxisDto = this.x_axis;
            int iHashCode3 = (iHashCode2 + (chartAxisDto == null ? 0 : chartAxisDto.hashCode())) * 31;
            ChartAxisDto chartAxisDto2 = this.y_axis;
            int iHashCode4 = (((((((iHashCode3 + (chartAxisDto2 == null ? 0 : chartAxisDto2.hashCode())) * 31) + this.legend_data.hashCode()) * 31) + this.fills.hashCode()) * 31) + this.overlays.hashCode()) * 31;
            ChartAxisDto chartAxisDto3 = this.y_axis_secondary;
            return iHashCode4 + (chartAxisDto3 != null ? chartAxisDto3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", weight=" + this.weight + ", lines=" + this.lines + ", x_axis=" + this.x_axis + ", y_axis=" + this.y_axis + ", legend_data=" + this.legend_data + ", fills=" + this.fills + ", overlays=" + this.overlays + ", y_axis_secondary=" + this.y_axis_secondary + ")";
        }

        /* compiled from: ChartDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ChartDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rh_server_driven_ui.v1.ChartDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rh_server_driven_ui.v1.ChartDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rh_server_driven_ui.v1.ChartDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rh_server_driven_ui.v1.ChartDto$Surrogate$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartDto.Surrogate._childSerializers$_anonymous_$2();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, TextDto textDto, Float f, List list, ChartAxisDto chartAxisDto, ChartAxisDto chartAxisDto2, Map map, List list2, List list3, ChartAxisDto chartAxisDto3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = textDto;
            }
            if ((i & 2) == 0) {
                this.weight = null;
            } else {
                this.weight = f;
            }
            if ((i & 4) == 0) {
                this.lines = CollectionsKt.emptyList();
            } else {
                this.lines = list;
            }
            if ((i & 8) == 0) {
                this.x_axis = null;
            } else {
                this.x_axis = chartAxisDto;
            }
            if ((i & 16) == 0) {
                this.y_axis = null;
            } else {
                this.y_axis = chartAxisDto2;
            }
            if ((i & 32) == 0) {
                this.legend_data = MapsKt.emptyMap();
            } else {
                this.legend_data = map;
            }
            if ((i & 64) == 0) {
                this.fills = CollectionsKt.emptyList();
            } else {
                this.fills = list2;
            }
            if ((i & 128) == 0) {
                this.overlays = CollectionsKt.emptyList();
            } else {
                this.overlays = list3;
            }
            if ((i & 256) == 0) {
                this.y_axis_secondary = null;
            } else {
                this.y_axis_secondary = chartAxisDto3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            TextDto textDto = self.title;
            if (textDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, TextDto.Serializer.INSTANCE, textDto);
            }
            Float f = self.weight;
            if (f != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, FloatAsNumberSerializer.INSTANCE, f);
            }
            if (!Intrinsics.areEqual(self.lines, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.lines);
            }
            ChartAxisDto chartAxisDto = self.x_axis;
            if (chartAxisDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ChartAxisDto.Serializer.INSTANCE, chartAxisDto);
            }
            ChartAxisDto chartAxisDto2 = self.y_axis;
            if (chartAxisDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ChartAxisDto.Serializer.INSTANCE, chartAxisDto2);
            }
            if (!Intrinsics.areEqual(self.legend_data, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.legend_data);
            }
            if (!Intrinsics.areEqual(self.fills, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.fills);
            }
            if (!Intrinsics.areEqual(self.overlays, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.overlays);
            }
            ChartAxisDto chartAxisDto3 = self.y_axis_secondary;
            if (chartAxisDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, ChartAxisDto.Serializer.INSTANCE, chartAxisDto3);
            }
        }

        public Surrogate(TextDto textDto, Float f, List<LineDto> lines, ChartAxisDto chartAxisDto, ChartAxisDto chartAxisDto2, Map<String, ChartLegendItemListDto> legend_data, List<ChartFillDto> fills, List<UIComponentDto> overlays, ChartAxisDto chartAxisDto3) {
            Intrinsics.checkNotNullParameter(lines, "lines");
            Intrinsics.checkNotNullParameter(legend_data, "legend_data");
            Intrinsics.checkNotNullParameter(fills, "fills");
            Intrinsics.checkNotNullParameter(overlays, "overlays");
            this.title = textDto;
            this.weight = f;
            this.lines = lines;
            this.x_axis = chartAxisDto;
            this.y_axis = chartAxisDto2;
            this.legend_data = legend_data;
            this.fills = fills;
            this.overlays = overlays;
            this.y_axis_secondary = chartAxisDto3;
        }

        public final TextDto getTitle() {
            return this.title;
        }

        public final Float getWeight() {
            return this.weight;
        }

        public final List<LineDto> getLines() {
            return this.lines;
        }

        public /* synthetic */ Surrogate(TextDto textDto, Float f, List list, ChartAxisDto chartAxisDto, ChartAxisDto chartAxisDto2, Map map, List list2, List list3, ChartAxisDto chartAxisDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : textDto, (i & 2) != 0 ? null : f, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : chartAxisDto, (i & 16) != 0 ? null : chartAxisDto2, (i & 32) != 0 ? MapsKt.emptyMap() : map, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? CollectionsKt.emptyList() : list3, (i & 256) != 0 ? null : chartAxisDto3);
        }

        public final ChartAxisDto getX_axis() {
            return this.x_axis;
        }

        public final ChartAxisDto getY_axis() {
            return this.y_axis;
        }

        public final Map<String, ChartLegendItemListDto> getLegend_data() {
            return this.legend_data;
        }

        public final List<ChartFillDto> getFills() {
            return this.fills;
        }

        public final List<UIComponentDto> getOverlays() {
            return this.overlays;
        }

        public final ChartAxisDto getY_axis_secondary() {
            return this.y_axis_secondary;
        }
    }

    /* compiled from: ChartDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ChartDto;", "Lrh_server_driven_ui/v1/Chart;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ChartDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ChartDto, Chart> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChartDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartDto> getBinaryBase64Serializer() {
            return (KSerializer) ChartDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Chart> getProtoAdapter() {
            return Chart.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartDto getZeroValue() {
            return ChartDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartDto fromProto(Chart proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Text title = proto.getTitle();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TextDto textDtoFromProto = title != null ? TextDto.INSTANCE.fromProto(title) : null;
            Float weight = proto.getWeight();
            List<Line> lines = proto.getLines();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lines, 10));
            Iterator<T> it = lines.iterator();
            while (it.hasNext()) {
                arrayList.add(LineDto.INSTANCE.fromProto((Line) it.next()));
            }
            ChartAxis x_axis = proto.getX_axis();
            ChartAxisDto chartAxisDtoFromProto = x_axis != null ? ChartAxisDto.INSTANCE.fromProto(x_axis) : null;
            ChartAxis y_axis = proto.getY_axis();
            ChartAxisDto chartAxisDtoFromProto2 = y_axis != null ? ChartAxisDto.INSTANCE.fromProto(y_axis) : null;
            Set<Map.Entry<String, ChartLegendItemList>> setEntrySet = proto.getLegend_data().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), ChartLegendItemListDto.INSTANCE.fromProto((ChartLegendItemList) entry.getValue()));
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            List<ChartFill> fills = proto.getFills();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(fills, 10));
            Iterator<T> it3 = fills.iterator();
            while (it3.hasNext()) {
                arrayList2.add(ChartFillDto.INSTANCE.fromProto((ChartFill) it3.next()));
            }
            List<UIComponent> overlays = proto.getOverlays();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(overlays, 10));
            Iterator<T> it4 = overlays.iterator();
            while (it4.hasNext()) {
                arrayList3.add(UIComponentDto.INSTANCE.fromProto((UIComponent) it4.next()));
            }
            ChartAxis y_axis_secondary = proto.getY_axis_secondary();
            return new ChartDto(new Surrogate(textDtoFromProto, weight, arrayList, chartAxisDtoFromProto, chartAxisDtoFromProto2, linkedHashMap, arrayList2, arrayList3, y_axis_secondary != null ? ChartAxisDto.INSTANCE.fromProto(y_axis_secondary) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartDto.binaryBase64Serializer_delegate$lambda$4();
            }
        });
        zeroValue = new ChartDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$4() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ChartDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ChartDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ChartDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Chart", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ChartDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ChartDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ChartDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ChartDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.ChartDto";
        }
    }
}
