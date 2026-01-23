package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.event.gamedetail.builders.BuildChartSideLegend;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: BuildChartSideLegend.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\b"}, m3636d2 = {"buildChartSideLegend", "", "", "yOffsets", "", "itemHeight", "containerHeight", "extraTopPadding", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.builders.BuildChartSideLegendKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildChartSideLegend {
    public static final List<Integer> buildChartSideLegend(List<Float> yOffsets, int i, int i2, int i3) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(yOffsets, "yOffsets");
        if (i2 <= 0 || i3 <= 0 || yOffsets.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<Float> list = yOffsets;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new ItemInfo(i4, MathKt.roundToInt(((1.0f - ((Number) obj).floatValue()) * (i2 - i3)) - (i / 2.0f)) + i3));
            i4 = i5;
        }
        ArrayList<List> arrayList2 = new ArrayList();
        for (ItemInfo itemInfo : CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.event.gamedetail.builders.BuildChartSideLegendKt$buildChartSideLegend$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((BuildChartSideLegend.ItemInfo) t).getIntendedPosition()), Integer.valueOf(((BuildChartSideLegend.ItemInfo) t2).getIntendedPosition()));
            }
        })) {
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (itemInfo.getIntendedPosition() < ((ItemInfo) CollectionsKt.last((List) objPrevious)).getIntendedPosition() + i) {
                    break;
                }
            }
            List list2 = (List) objPrevious;
            if (list2 != null) {
                list2.add(itemInfo);
            } else {
                arrayList2.add(CollectionsKt.mutableListOf(itemInfo));
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (List list3 : arrayList2) {
            if (list3.size() == 1) {
                ItemInfo itemInfo2 = (ItemInfo) list3.get(0);
                iArr[itemInfo2.getIndex()] = RangesKt.coerceIn(itemInfo2.getIntendedPosition(), 0, i2 - i);
            } else {
                int size = list3.size() * i;
                List list4 = list3;
                Iterator it = list4.iterator();
                int intendedPosition = 0;
                while (it.hasNext()) {
                    intendedPosition += ((ItemInfo) it.next()).getIntendedPosition() + (i / 2);
                }
                int iCoerceIn = RangesKt.coerceIn((intendedPosition / list3.size()) - (size / 2), 0, i2 - size);
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    iArr[((ItemInfo) it2.next()).getIndex()] = iCoerceIn;
                    iCoerceIn += i;
                }
            }
        }
        return ArraysKt.toList(iArr);
    }

    /* compiled from: BuildChartSideLegend.kt */
    @Metadata(m3635d1 = {"\u0000!\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\"\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"com/robinhood/android/event/gamedetail/builders/BuildChartSideLegendKt$buildChartSideLegend$ItemInfo", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "intendedPosition", "<init>", "(II)V", "getIndex", "()I", "getIntendedPosition", "component1", "component2", "copy", "(II)Lcom/robinhood/android/event/gamedetail/builders/BuildChartSideLegendKt$buildChartSideLegend$ItemInfo;", "equals", "", "other", "hashCode", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.gamedetail.builders.BuildChartSideLegendKt$buildChartSideLegend$ItemInfo, reason: from toString */
    public static final /* data */ class ItemInfo {
        private final int index;
        private final int intendedPosition;

        public static /* synthetic */ ItemInfo copy$default(ItemInfo itemInfo, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = itemInfo.index;
            }
            if ((i3 & 2) != 0) {
                i2 = itemInfo.intendedPosition;
            }
            return itemInfo.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIntendedPosition() {
            return this.intendedPosition;
        }

        public final ItemInfo copy(int index, int intendedPosition) {
            return new ItemInfo(index, intendedPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemInfo)) {
                return false;
            }
            ItemInfo itemInfo = (ItemInfo) other;
            return this.index == itemInfo.index && this.intendedPosition == itemInfo.intendedPosition;
        }

        public int hashCode() {
            return (Integer.hashCode(this.index) * 31) + Integer.hashCode(this.intendedPosition);
        }

        public String toString() {
            return "ItemInfo(index=" + this.index + ", intendedPosition=" + this.intendedPosition + ")";
        }

        public ItemInfo(int i, int i2) {
            this.index = i;
            this.intendedPosition = i2;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getIntendedPosition() {
            return this.intendedPosition;
        }
    }
}
