package com.robinhood.android.common.util;

import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: VisibleItemsManager.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0002+,BL\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\n\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\b\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\b\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00018\u00018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0001 \u0011*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00130\u00130\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u001f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/common/util/VisibleItemsManager;", "KeyT", "", "ValueT", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "itemCount", "Lkotlin/Function0;", "", "getItem", "Lkotlin/Function1;", "keySelector", "Lkotlin/ExtensionFunctionType;", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "itemAppearanceRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "kotlin.jvm.PlatformType", "itemDisappearanceRelay", "Lcom/robinhood/android/common/util/VisibleItemsManager$Data;", "itemToVisibleTimeMap", "", "callbacks", "Lcom/robinhood/android/common/util/VisibleItemsManager$Callbacks;", "getCallbacks$annotations", "()V", "getCallbacks", "()Lcom/robinhood/android/common/util/VisibleItemsManager$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/common/util/VisibleItemsManager$Callbacks;)V", "itemAppearances", "Lio/reactivex/Observable;", "getItemAppearances", "()Lio/reactivex/Observable;", "itemDisappearances", "getItemDisappearances", "visiblePositionRange", "Lkotlin/Pair;", "getVisiblePositionRange", "()Lkotlin/Pair;", "update", "", "clear", "Callbacks", "Data", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class VisibleItemsManager<KeyT, ValueT> {
    public static final int $stable = 8;
    private Callbacks<ValueT> callbacks;
    private final Function1<Integer, ValueT> getItem;
    private final PublishRelay<ValueT> itemAppearanceRelay;
    private final Observable<ValueT> itemAppearances;
    private final Function0<Integer> itemCount;
    private final PublishRelay<Data<ValueT>> itemDisappearanceRelay;
    private final Observable<Data<ValueT>> itemDisappearances;
    private final Map<KeyT, Data<ValueT>> itemToVisibleTimeMap;
    private final Function1<ValueT, KeyT> keySelector;
    private final RecyclerView.LayoutManager layoutManager;

    /* compiled from: VisibleItemsManager.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0002H&¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/util/VisibleItemsManager$Callbacks;", "T", "", "onItemAppeared", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Ljava/lang/Object;)V", "onItemDisappeared", "durationVisible", "", "(Ljava/lang/Object;J)V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks<T> {
        void onItemAppeared(T item);

        void onItemDisappeared(T item, long durationVisible);
    }

    @Deprecated
    public static /* synthetic */ void getCallbacks$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VisibleItemsManager(RecyclerView.LayoutManager layoutManager, Function0<Integer> itemCount, Function1<? super Integer, ? extends ValueT> getItem, Function1<? super ValueT, ? extends KeyT> keySelector) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(itemCount, "itemCount");
        Intrinsics.checkNotNullParameter(getItem, "getItem");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.layoutManager = layoutManager;
        this.itemCount = itemCount;
        this.getItem = getItem;
        this.keySelector = keySelector;
        PublishRelay<ValueT> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.itemAppearanceRelay = publishRelayCreate;
        PublishRelay<Data<ValueT>> publishRelayCreate2 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate2, "create(...)");
        this.itemDisappearanceRelay = publishRelayCreate2;
        if (!(layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof StaggeredGridLayoutManager)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.itemToVisibleTimeMap = new LinkedHashMap();
        Observable<ValueT> observableHide = publishRelayCreate.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.itemAppearances = observableHide;
        Observable<Data<ValueT>> observableHide2 = publishRelayCreate2.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide2, "hide(...)");
        this.itemDisappearances = observableHide2;
    }

    public final Callbacks<ValueT> getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks<ValueT> callbacks) {
        this.callbacks = callbacks;
    }

    public final Observable<ValueT> getItemAppearances() {
        return this.itemAppearances;
    }

    public final Observable<Data<ValueT>> getItemDisappearances() {
        return this.itemDisappearances;
    }

    private final Tuples2<Integer, Integer> getVisiblePositionRange() {
        int iIntValue;
        int iIntValue2;
        RecyclerView.LayoutManager layoutManager = this.layoutManager;
        if (layoutManager instanceof LinearLayoutManager) {
            iIntValue = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            iIntValue2 = ((LinearLayoutManager) this.layoutManager).findLastVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] iArrFindFirstVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(null);
            Intrinsics.checkNotNullExpressionValue(iArrFindFirstVisibleItemPositions, "findFirstVisibleItemPositions(...)");
            Integer numMinOrNull = ArraysKt.minOrNull(iArrFindFirstVisibleItemPositions);
            Intrinsics.checkNotNull(numMinOrNull);
            iIntValue = numMinOrNull.intValue();
            int[] iArrFindLastVisibleItemPositions = ((StaggeredGridLayoutManager) this.layoutManager).findLastVisibleItemPositions(null);
            Intrinsics.checkNotNullExpressionValue(iArrFindLastVisibleItemPositions, "findLastVisibleItemPositions(...)");
            Integer numMaxOrNull = ArraysKt.maxOrNull(iArrFindLastVisibleItemPositions);
            Intrinsics.checkNotNull(numMaxOrNull);
            iIntValue2 = numMaxOrNull.intValue();
        } else {
            throw new IllegalArgumentException("Only supports LinearLayoutManager or StaggeredGridLayoutManager");
        }
        return Tuples4.m3642to(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }

    public final void update() {
        Tuples2<Integer, Integer> visiblePositionRange = getVisiblePositionRange();
        int iIntValue = visiblePositionRange.getFirst().intValue();
        int iIntValue2 = visiblePositionRange.getSecond().intValue();
        if (iIntValue == -1 || iIntValue2 == -1) {
            return;
        }
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(iIntValue, RangesKt.coerceAtMost(iIntValue2, this.itemCount.invoke().intValue() - 1));
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = primitiveRanges2.iterator();
        while (it.hasNext()) {
            ValueT valuetInvoke = this.getItem.invoke(Integer.valueOf(((PrimitiveIterators6) it).nextInt()));
            if (valuetInvoke != null) {
                arrayList.add(valuetInvoke);
            }
        }
        Function1<ValueT, KeyT> function1 = this.keySelector;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(function1.invoke(obj), obj);
        }
        Map mapMinus = MapsKt.minus((Map) this.itemToVisibleTimeMap, (Iterable) linkedHashMap.keySet());
        Map mapMinus2 = MapsKt.minus((Map) linkedHashMap, (Iterable) this.itemToVisibleTimeMap.keySet());
        CollectionsKt.removeAll(this.itemToVisibleTimeMap.keySet(), mapMinus.keySet());
        for (Map.Entry entry : mapMinus2.entrySet()) {
            this.itemToVisibleTimeMap.put(entry.getKey(), new Data(entry.getValue(), SystemClock.elapsedRealtime()));
        }
        for (Map.Entry entry2 : mapMinus2.entrySet()) {
            Callbacks<ValueT> callbacks = this.callbacks;
            if (callbacks != null) {
                callbacks.onItemAppeared(entry2.getValue());
            }
            this.itemAppearanceRelay.accept(entry2.getValue());
        }
        Iterator it2 = mapMinus.entrySet().iterator();
        while (it2.hasNext()) {
            Data<ValueT> data = (Data) ((Map.Entry) it2.next()).getValue();
            Callbacks<ValueT> callbacks2 = this.callbacks;
            if (callbacks2 != null) {
                callbacks2.onItemDisappeared(data.getItem(), data.getDurationVisible());
            }
            this.itemDisappearanceRelay.accept(data);
        }
    }

    public final void clear() {
        Callbacks<ValueT> callbacks = this.callbacks;
        if (callbacks != null) {
            Iterator<Map.Entry<KeyT, Data<ValueT>>> it = this.itemToVisibleTimeMap.entrySet().iterator();
            while (it.hasNext()) {
                Data<ValueT> value = it.next().getValue();
                callbacks.onItemDisappeared(value.getItem(), value.getDurationVisible());
            }
        }
        Iterator<Map.Entry<KeyT, Data<ValueT>>> it2 = this.itemToVisibleTimeMap.entrySet().iterator();
        while (it2.hasNext()) {
            this.itemDisappearanceRelay.accept(it2.next().getValue());
        }
        this.itemToVisibleTimeMap.clear();
    }

    /* compiled from: VisibleItemsManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0003\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/util/VisibleItemsManager$Data;", "T", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "timeAppeared", "", "<init>", "(Ljava/lang/Object;J)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "durationVisible", "getDurationVisible", "()J", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Data<T> {
        public static final int $stable = 0;
        private final T item;
        private final long timeAppeared;

        public Data(T t, long j) {
            this.item = t;
            this.timeAppeared = j;
        }

        public final T getItem() {
            return this.item;
        }

        public final long getDurationVisible() {
            return SystemClock.elapsedRealtime() - this.timeAppeared;
        }
    }
}
