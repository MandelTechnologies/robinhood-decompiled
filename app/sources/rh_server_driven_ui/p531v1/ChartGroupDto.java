package rh_server_driven_ui.p531v1;

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
import rh_server_driven_ui.p531v1.ChartGroupDto;
import rh_server_driven_ui.p531v1.ChartLegendItemListDto;
import rh_server_driven_ui.p531v1.DisplaySpanDto;

/* compiled from: ChartGroupDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043245B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B]\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u0015Ja\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00066"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartGroupDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ChartGroup;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/ChartGroupDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/ChartGroupDto$Surrogate;)V", "", "Lrh_server_driven_ui/v1/ChartDto;", "charts", "Lrh_server_driven_ui/v1/DisplaySpanDto;", "display_span", "Lrh_server_driven_ui/v1/ChartAxisDto;", "x_axis", "y_axis", "", "", "Lrh_server_driven_ui/v1/ChartLegendItemListDto;", "legend_data", "y_axis_secondary", "(Ljava/util/List;Lrh_server_driven_ui/v1/DisplaySpanDto;Lrh_server_driven_ui/v1/ChartAxisDto;Lrh_server_driven_ui/v1/ChartAxisDto;Ljava/util/Map;Lrh_server_driven_ui/v1/ChartAxisDto;)V", "copy", "(Ljava/util/List;Lrh_server_driven_ui/v1/DisplaySpanDto;Lrh_server_driven_ui/v1/ChartAxisDto;Lrh_server_driven_ui/v1/ChartAxisDto;Ljava/util/Map;Lrh_server_driven_ui/v1/ChartAxisDto;)Lrh_server_driven_ui/v1/ChartGroupDto;", "toProto", "()Lrh_server_driven_ui/v1/ChartGroup;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/ChartGroupDto$Surrogate;", "getCharts", "()Ljava/util/List;", "getX_axis", "()Lrh_server_driven_ui/v1/ChartAxisDto;", "getLegend_data", "()Ljava/util/Map;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class ChartGroupDto implements Dto3<ChartGroup>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ChartGroupDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ChartGroupDto, ChartGroup>> binaryBase64Serializer$delegate;
    private static final ChartGroupDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ChartGroupDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ChartGroupDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<ChartDto> getCharts() {
        return this.surrogate.getCharts();
    }

    public final ChartAxisDto getX_axis() {
        return this.surrogate.getX_axis();
    }

    public final Map<String, ChartLegendItemListDto> getLegend_data() {
        return this.surrogate.getLegend_data();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ChartGroupDto(java.util.List r2, rh_server_driven_ui.p531v1.DisplaySpanDto r3, rh_server_driven_ui.p531v1.ChartAxisDto r4, rh_server_driven_ui.p531v1.ChartAxisDto r5, java.util.Map r6, rh_server_driven_ui.p531v1.ChartAxisDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r9 = r8 & 2
            if (r9 == 0) goto L12
            rh_server_driven_ui.v1.DisplaySpanDto$Companion r3 = rh_server_driven_ui.p531v1.DisplaySpanDto.INSTANCE
            rh_server_driven_ui.v1.DisplaySpanDto r3 = r3.getZeroValue()
        L12:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L18
            r4 = r0
        L18:
            r9 = r8 & 8
            if (r9 == 0) goto L1d
            r5 = r0
        L1d:
            r9 = r8 & 16
            if (r9 == 0) goto L25
            java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()
        L25:
            r8 = r8 & 32
            if (r8 == 0) goto L31
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L38
        L31:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L38:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.ChartGroupDto.<init>(java.util.List, rh_server_driven_ui.v1.DisplaySpanDto, rh_server_driven_ui.v1.ChartAxisDto, rh_server_driven_ui.v1.ChartAxisDto, java.util.Map, rh_server_driven_ui.v1.ChartAxisDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartGroupDto(List<ChartDto> charts, DisplaySpanDto display_span, ChartAxisDto chartAxisDto, ChartAxisDto chartAxisDto2, Map<String, ChartLegendItemListDto> legend_data, ChartAxisDto chartAxisDto3) {
        this(new Surrogate(charts, display_span, chartAxisDto, chartAxisDto2, legend_data, chartAxisDto3));
        Intrinsics.checkNotNullParameter(charts, "charts");
        Intrinsics.checkNotNullParameter(display_span, "display_span");
        Intrinsics.checkNotNullParameter(legend_data, "legend_data");
    }

    public static /* synthetic */ ChartGroupDto copy$default(ChartGroupDto chartGroupDto, List list, DisplaySpanDto displaySpanDto, ChartAxisDto chartAxisDto, ChartAxisDto chartAxisDto2, Map map, ChartAxisDto chartAxisDto3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chartGroupDto.surrogate.getCharts();
        }
        if ((i & 2) != 0) {
            displaySpanDto = chartGroupDto.surrogate.getDisplay_span();
        }
        if ((i & 4) != 0) {
            chartAxisDto = chartGroupDto.surrogate.getX_axis();
        }
        if ((i & 8) != 0) {
            chartAxisDto2 = chartGroupDto.surrogate.getY_axis();
        }
        if ((i & 16) != 0) {
            map = chartGroupDto.surrogate.getLegend_data();
        }
        if ((i & 32) != 0) {
            chartAxisDto3 = chartGroupDto.surrogate.getY_axis_secondary();
        }
        Map map2 = map;
        ChartAxisDto chartAxisDto4 = chartAxisDto3;
        return chartGroupDto.copy(list, displaySpanDto, chartAxisDto, chartAxisDto2, map2, chartAxisDto4);
    }

    public final ChartGroupDto copy(List<ChartDto> charts, DisplaySpanDto display_span, ChartAxisDto x_axis, ChartAxisDto y_axis, Map<String, ChartLegendItemListDto> legend_data, ChartAxisDto y_axis_secondary) {
        Intrinsics.checkNotNullParameter(charts, "charts");
        Intrinsics.checkNotNullParameter(display_span, "display_span");
        Intrinsics.checkNotNullParameter(legend_data, "legend_data");
        return new ChartGroupDto(new Surrogate(charts, display_span, x_axis, y_axis, legend_data, y_axis_secondary));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ChartGroup toProto() {
        List<ChartDto> charts = this.surrogate.getCharts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts, 10));
        Iterator<T> it = charts.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChartDto) it.next()).toProto());
        }
        DisplaySpan displaySpan = (DisplaySpan) this.surrogate.getDisplay_span().toProto();
        ChartAxisDto x_axis = this.surrogate.getX_axis();
        ChartAxis proto = x_axis != null ? x_axis.toProto() : null;
        ChartAxisDto y_axis = this.surrogate.getY_axis();
        ChartAxis proto2 = y_axis != null ? y_axis.toProto() : null;
        Set<Map.Entry<String, ChartLegendItemListDto>> setEntrySet = this.surrogate.getLegend_data().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), ((ChartLegendItemListDto) entry.getValue()).toProto());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        ChartAxisDto y_axis_secondary = this.surrogate.getY_axis_secondary();
        return new ChartGroup(arrayList, displaySpan, proto, proto2, linkedHashMap, y_axis_secondary != null ? y_axis_secondary.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[ChartGroupDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ChartGroupDto) && Intrinsics.areEqual(((ChartGroupDto) other).surrogate, this.surrogate);
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
    /* compiled from: ChartGroupDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002=<B[\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010Bi\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b3\u0010+\u001a\u0004\b1\u00102R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b5\u0010+\u001a\u0004\b4\u00102R,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\b9\u0010+\u001a\u0004\b7\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00100\u0012\u0004\b;\u0010+\u001a\u0004\b:\u00102¨\u0006>"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartGroupDto$Surrogate;", "", "", "Lrh_server_driven_ui/v1/ChartDto;", "charts", "Lrh_server_driven_ui/v1/DisplaySpanDto;", "display_span", "Lrh_server_driven_ui/v1/ChartAxisDto;", "x_axis", "y_axis", "", "", "Lrh_server_driven_ui/v1/ChartLegendItemListDto;", "legend_data", "y_axis_secondary", "<init>", "(Ljava/util/List;Lrh_server_driven_ui/v1/DisplaySpanDto;Lrh_server_driven_ui/v1/ChartAxisDto;Lrh_server_driven_ui/v1/ChartAxisDto;Ljava/util/Map;Lrh_server_driven_ui/v1/ChartAxisDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lrh_server_driven_ui/v1/DisplaySpanDto;Lrh_server_driven_ui/v1/ChartAxisDto;Lrh_server_driven_ui/v1/ChartAxisDto;Ljava/util/Map;Lrh_server_driven_ui/v1/ChartAxisDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ChartGroupDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCharts", "()Ljava/util/List;", "getCharts$annotations", "()V", "Lrh_server_driven_ui/v1/DisplaySpanDto;", "getDisplay_span", "()Lrh_server_driven_ui/v1/DisplaySpanDto;", "getDisplay_span$annotations", "Lrh_server_driven_ui/v1/ChartAxisDto;", "getX_axis", "()Lrh_server_driven_ui/v1/ChartAxisDto;", "getX_axis$annotations", "getY_axis", "getY_axis$annotations", "Ljava/util/Map;", "getLegend_data", "()Ljava/util/Map;", "getLegend_data$annotations", "getY_axis_secondary", "getY_axis_secondary$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<ChartDto> charts;
        private final DisplaySpanDto display_span;
        private final Map<String, ChartLegendItemListDto> legend_data;
        private final ChartAxisDto x_axis;
        private final ChartAxisDto y_axis;
        private final ChartAxisDto y_axis_secondary;

        public Surrogate() {
            this((List) null, (DisplaySpanDto) null, (ChartAxisDto) null, (ChartAxisDto) null, (Map) null, (ChartAxisDto) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ChartDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, ChartLegendItemListDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.charts, surrogate.charts) && this.display_span == surrogate.display_span && Intrinsics.areEqual(this.x_axis, surrogate.x_axis) && Intrinsics.areEqual(this.y_axis, surrogate.y_axis) && Intrinsics.areEqual(this.legend_data, surrogate.legend_data) && Intrinsics.areEqual(this.y_axis_secondary, surrogate.y_axis_secondary);
        }

        public int hashCode() {
            int iHashCode = ((this.charts.hashCode() * 31) + this.display_span.hashCode()) * 31;
            ChartAxisDto chartAxisDto = this.x_axis;
            int iHashCode2 = (iHashCode + (chartAxisDto == null ? 0 : chartAxisDto.hashCode())) * 31;
            ChartAxisDto chartAxisDto2 = this.y_axis;
            int iHashCode3 = (((iHashCode2 + (chartAxisDto2 == null ? 0 : chartAxisDto2.hashCode())) * 31) + this.legend_data.hashCode()) * 31;
            ChartAxisDto chartAxisDto3 = this.y_axis_secondary;
            return iHashCode3 + (chartAxisDto3 != null ? chartAxisDto3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(charts=" + this.charts + ", display_span=" + this.display_span + ", x_axis=" + this.x_axis + ", y_axis=" + this.y_axis + ", legend_data=" + this.legend_data + ", y_axis_secondary=" + this.y_axis_secondary + ")";
        }

        /* compiled from: ChartGroupDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartGroupDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartGroupDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ChartGroupDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rh_server_driven_ui.v1.ChartGroupDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartGroupDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rh_server_driven_ui.v1.ChartGroupDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartGroupDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, List list, DisplaySpanDto displaySpanDto, ChartAxisDto chartAxisDto, ChartAxisDto chartAxisDto2, Map map, ChartAxisDto chartAxisDto3, SerializationConstructorMarker serializationConstructorMarker) {
            this.charts = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.display_span = DisplaySpanDto.INSTANCE.getZeroValue();
            } else {
                this.display_span = displaySpanDto;
            }
            if ((i & 4) == 0) {
                this.x_axis = null;
            } else {
                this.x_axis = chartAxisDto;
            }
            if ((i & 8) == 0) {
                this.y_axis = null;
            } else {
                this.y_axis = chartAxisDto2;
            }
            if ((i & 16) == 0) {
                this.legend_data = MapsKt.emptyMap();
            } else {
                this.legend_data = map;
            }
            if ((i & 32) == 0) {
                this.y_axis_secondary = null;
            } else {
                this.y_axis_secondary = chartAxisDto3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.charts, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.charts);
            }
            if (self.display_span != DisplaySpanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, DisplaySpanDto.Serializer.INSTANCE, self.display_span);
            }
            ChartAxisDto chartAxisDto = self.x_axis;
            if (chartAxisDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ChartAxisDto.Serializer.INSTANCE, chartAxisDto);
            }
            ChartAxisDto chartAxisDto2 = self.y_axis;
            if (chartAxisDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ChartAxisDto.Serializer.INSTANCE, chartAxisDto2);
            }
            if (!Intrinsics.areEqual(self.legend_data, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.legend_data);
            }
            ChartAxisDto chartAxisDto3 = self.y_axis_secondary;
            if (chartAxisDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ChartAxisDto.Serializer.INSTANCE, chartAxisDto3);
            }
        }

        public Surrogate(List<ChartDto> charts, DisplaySpanDto display_span, ChartAxisDto chartAxisDto, ChartAxisDto chartAxisDto2, Map<String, ChartLegendItemListDto> legend_data, ChartAxisDto chartAxisDto3) {
            Intrinsics.checkNotNullParameter(charts, "charts");
            Intrinsics.checkNotNullParameter(display_span, "display_span");
            Intrinsics.checkNotNullParameter(legend_data, "legend_data");
            this.charts = charts;
            this.display_span = display_span;
            this.x_axis = chartAxisDto;
            this.y_axis = chartAxisDto2;
            this.legend_data = legend_data;
            this.y_axis_secondary = chartAxisDto3;
        }

        public final List<ChartDto> getCharts() {
            return this.charts;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.util.List r2, rh_server_driven_ui.p531v1.DisplaySpanDto r3, rh_server_driven_ui.p531v1.ChartAxisDto r4, rh_server_driven_ui.p531v1.ChartAxisDto r5, java.util.Map r6, rh_server_driven_ui.p531v1.ChartAxisDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r9 = r8 & 2
                if (r9 == 0) goto L12
                rh_server_driven_ui.v1.DisplaySpanDto$Companion r3 = rh_server_driven_ui.p531v1.DisplaySpanDto.INSTANCE
                rh_server_driven_ui.v1.DisplaySpanDto r3 = r3.getZeroValue()
            L12:
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L18
                r4 = r0
            L18:
                r9 = r8 & 8
                if (r9 == 0) goto L1d
                r5 = r0
            L1d:
                r9 = r8 & 16
                if (r9 == 0) goto L25
                java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()
            L25:
                r8 = r8 & 32
                if (r8 == 0) goto L31
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L38
            L31:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L38:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.ChartGroupDto.Surrogate.<init>(java.util.List, rh_server_driven_ui.v1.DisplaySpanDto, rh_server_driven_ui.v1.ChartAxisDto, rh_server_driven_ui.v1.ChartAxisDto, java.util.Map, rh_server_driven_ui.v1.ChartAxisDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final DisplaySpanDto getDisplay_span() {
            return this.display_span;
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

        public final ChartAxisDto getY_axis_secondary() {
            return this.y_axis_secondary;
        }
    }

    /* compiled from: ChartGroupDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartGroupDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ChartGroupDto;", "Lrh_server_driven_ui/v1/ChartGroup;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ChartGroupDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ChartGroupDto, ChartGroup> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChartGroupDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartGroupDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartGroupDto> getBinaryBase64Serializer() {
            return (KSerializer) ChartGroupDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ChartGroup> getProtoAdapter() {
            return ChartGroup.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartGroupDto getZeroValue() {
            return ChartGroupDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartGroupDto fromProto(ChartGroup proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<Chart> charts = proto.getCharts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts, 10));
            Iterator<T> it = charts.iterator();
            while (it.hasNext()) {
                arrayList.add(ChartDto.INSTANCE.fromProto((Chart) it.next()));
            }
            DisplaySpanDto displaySpanDtoFromProto = DisplaySpanDto.INSTANCE.fromProto(proto.getDisplay_span());
            ChartAxis x_axis = proto.getX_axis();
            DefaultConstructorMarker defaultConstructorMarker = null;
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
            ChartAxis y_axis_secondary = proto.getY_axis_secondary();
            return new ChartGroupDto(new Surrogate(arrayList, displaySpanDtoFromProto, chartAxisDtoFromProto, chartAxisDtoFromProto2, linkedHashMap, y_axis_secondary != null ? ChartAxisDto.INSTANCE.fromProto(y_axis_secondary) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartGroupDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartGroupDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new ChartGroupDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ChartGroupDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartGroupDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartGroupDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ChartGroupDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ChartGroupDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ChartGroup", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ChartGroupDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ChartGroupDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ChartGroupDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ChartGroupDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartGroupDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.ChartGroupDto";
        }
    }
}
