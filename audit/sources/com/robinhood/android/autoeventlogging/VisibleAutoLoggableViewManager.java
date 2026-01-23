package com.robinhood.android.autoeventlogging;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.jakewharton.rxrelay2.PublishRelay;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;

/* compiled from: VisibleAutoLoggableViewManager.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B`\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\n\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\b\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\b\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/VisibleAutoLoggableViewManager;", "KeyT", "", "ValueT", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "itemCount", "Lkotlin/Function0;", "", "getItem", "Lkotlin/Function1;", "keySelector", "Lkotlin/ExtensionFunctionType;", "logOnce", "", "dispatchEventToDescendants", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "itemAppearanceRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "kotlin.jvm.PlatformType", "itemAppearances", "Lio/reactivex/Observable;", "getItemAppearances", "()Lio/reactivex/Observable;", "itemToVisibleTimeMap", "", "visiblePositionRange", "Lkotlin/Pair;", "getVisiblePositionRange", "()Lkotlin/Pair;", "update", "", "clear", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class VisibleAutoLoggableViewManager<KeyT, ValueT> {
    private final boolean dispatchEventToDescendants;
    private final Function1<Integer, ValueT> getItem;
    private final PublishRelay<ValueT> itemAppearanceRelay;
    private final Observable<ValueT> itemAppearances;
    private final Function0<Integer> itemCount;
    private final Map<KeyT, Integer> itemToVisibleTimeMap;
    private final Function1<ValueT, KeyT> keySelector;
    private final RecyclerView.LayoutManager layoutManager;
    private final boolean logOnce;

    /* JADX WARN: Multi-variable type inference failed */
    public VisibleAutoLoggableViewManager(RecyclerView.LayoutManager layoutManager, Function0<Integer> itemCount, Function1<? super Integer, ? extends ValueT> getItem, Function1<? super ValueT, ? extends KeyT> keySelector, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(itemCount, "itemCount");
        Intrinsics.checkNotNullParameter(getItem, "getItem");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.layoutManager = layoutManager;
        this.itemCount = itemCount;
        this.getItem = getItem;
        this.keySelector = keySelector;
        this.logOnce = z;
        this.dispatchEventToDescendants = z2;
        if (!(layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof StaggeredGridLayoutManager)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        PublishRelay<ValueT> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.itemAppearanceRelay = publishRelayCreate;
        Observable<ValueT> observableHide = publishRelayCreate.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.itemAppearances = observableHide;
        this.itemToVisibleTimeMap = new LinkedHashMap();
    }

    public /* synthetic */ VisibleAutoLoggableViewManager(RecyclerView.LayoutManager layoutManager, Function0 function0, Function1 function1, Function1 function12, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutManager, function0, function1, function12, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public final Observable<ValueT> getItemAppearances() {
        return this.itemAppearances;
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
        Map map = MapsKt.toMap(SequencesKt.mapNotNull(CollectionsKt.asSequence(new PrimitiveRanges2(iIntValue, RangesKt.coerceAtMost(iIntValue2, this.itemCount.invoke().intValue() - 1))), new Function1() { // from class: com.robinhood.android.autoeventlogging.VisibleAutoLoggableViewManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VisibleAutoLoggableViewManager.update$lambda$1(this.f$0, ((Integer) obj).intValue());
            }
        }));
        Map mapMinus = MapsKt.minus((Map) this.itemToVisibleTimeMap, (Iterable) map.keySet());
        Map mapMinus2 = MapsKt.minus(map, (Iterable) this.itemToVisibleTimeMap.keySet());
        CollectionsKt.removeAll(this.itemToVisibleTimeMap.keySet(), mapMinus.keySet());
        for (Map.Entry entry : mapMinus2.entrySet()) {
            int iIntValue3 = ((Number) entry.getValue()).intValue();
            ValueT valuetInvoke = this.getItem.invoke(Integer.valueOf(iIntValue3));
            if (valuetInvoke != null) {
                this.itemAppearanceRelay.accept(valuetInvoke);
            }
            this.itemToVisibleTimeMap.put(entry.getKey(), Integer.valueOf(iIntValue3));
        }
        Iterator it = mapMinus2.values().iterator();
        while (it.hasNext()) {
            View viewFindViewByPosition = this.layoutManager.findViewByPosition(((Number) it.next()).intValue());
            if (viewFindViewByPosition != null) {
                ViewsKt.logAppear(viewFindViewByPosition, Boolean.valueOf(this.logOnce), this.dispatchEventToDescendants);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 update$lambda$1(VisibleAutoLoggableViewManager visibleAutoLoggableViewManager, int i) {
        ValueT valuetInvoke = visibleAutoLoggableViewManager.getItem.invoke(Integer.valueOf(i));
        if (valuetInvoke != null) {
            return Tuples4.m3642to(visibleAutoLoggableViewManager.keySelector.invoke(valuetInvoke), Integer.valueOf(i));
        }
        return null;
    }

    public final void clear() {
        this.itemToVisibleTimeMap.clear();
    }
}
