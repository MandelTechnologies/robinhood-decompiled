package com.robinhood.shared.ticker.internal;

import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextStyle;
import com.robinhood.shared.ticker.internal.ColumnDataResult;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ColumnDataBuilder.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\f\n\u0000\u001aJ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000eH\u0000¨\u0006\u0010"}, m3636d2 = {"buildColumnDataList", "Lcom/robinhood/shared/ticker/internal/ColumnDataResult;", "animationState", "Lcom/robinhood/shared/ticker/internal/TickerTextAnimationState;", "separators", "", "Lcom/robinhood/shared/ticker/internal/SeparatorRenderInfo;", "progress", "", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "charWidthCache", "", "", "lib-ticker-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.ticker.internal.ColumnDataBuilderKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ColumnDataBuilder {
    public static final ColumnDataResult buildColumnDataList(TickerTextAnimationState animationState, List<SeparatorRenderInfo> separators, float f, TextMeasurer textMeasurer, TextStyle textStyle, Map<Character, Float> map) {
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(animationState, "animationState");
        Intrinsics.checkNotNullParameter(separators, "separators");
        TextMeasurer textMeasurer2 = textMeasurer;
        Intrinsics.checkNotNullParameter(textMeasurer2, "textMeasurer");
        TextStyle style = textStyle;
        Intrinsics.checkNotNullParameter(style, "style");
        Map<Character, Float> charWidthCache = map;
        Intrinsics.checkNotNullParameter(charWidthCache, "charWidthCache");
        List<SeparatorRenderInfo> list = separators;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer numValueOf = Integer.valueOf(((SeparatorRenderInfo) obj).getInsertBeforeColumnIndex());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList<ColumnSnapshotWithWidth> arrayList2 = new ArrayList();
        int columnsToRender = animationState.getColumnsToRender();
        for (int i = 0; i < columnsToRender; i++) {
            List list2 = (List) linkedHashMap.get(Integer.valueOf(i));
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    buildColumnDataList$addSnapshot(f, arrayList2, charWidthCache, textMeasurer2, style, ((SeparatorRenderInfo) it.next()).toColumnSnapshot());
                    textMeasurer2 = textMeasurer;
                    style = textStyle;
                    charWidthCache = map;
                }
            }
            textMeasurer2 = textMeasurer;
            style = textStyle;
            charWidthCache = map;
            buildColumnDataList$addSnapshot(f, arrayList2, charWidthCache, textMeasurer2, style, animationState.getColumnSnapshot(i));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (((SeparatorRenderInfo) obj2).getInsertBeforeColumnIndex() >= columnsToRender) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            buildColumnDataList$addSnapshot(f, arrayList2, map, textMeasurer, textStyle, ((SeparatorRenderInfo) it2.next()).toColumnSnapshot());
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (ColumnSnapshotWithWidth columnSnapshotWithWidth : arrayList2) {
            TickerColumnSnapshot snapshot = columnSnapshotWithWidth.getSnapshot();
            float currentWidth = columnSnapshotWithWidth.getCurrentWidth();
            float previousWidth = columnSnapshotWithWidth.getPreviousWidth();
            if (snapshot.isEntering()) {
                f2 = f5;
                f3 = f2;
                f5 += currentWidth;
            } else if (snapshot.isExiting()) {
                f2 = f4;
                f3 = f2;
                f4 = previousWidth + f4;
            } else {
                f2 = f4;
                f3 = f5;
                f4 = previousWidth + f4;
                f5 += currentWidth;
            }
            arrayList4.add(new ColumnDataResult.ColumnData(snapshot, currentWidth, f2, f3, snapshot.currentCharOffset(f), snapshot.previousCharOffset(f), snapshot.currentCharAlpha(f), snapshot.previousCharAlpha(f)));
        }
        return new ColumnDataResult(arrayList4, f4, f5);
    }

    private static final float buildColumnDataList$measureCharWidth(Map<Character, Float> map, TextMeasurer textMeasurer, TextStyle textStyle, char c) {
        Float f = map.get(Character.valueOf(c));
        return f != null ? f.floatValue() : (int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, String.valueOf(c), textStyle, 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() >> 32);
    }

    private static final void buildColumnDataList$addSnapshot(float f, List<ColumnSnapshotWithWidth> list, Map<Character, Float> map, TextMeasurer textMeasurer, TextStyle textStyle, TickerColumnSnapshot tickerColumnSnapshot) {
        if (tickerColumnSnapshot == null || !tickerColumnSnapshot.shouldRender(f)) {
            return;
        }
        float fBuildColumnDataList$measureCharWidth = buildColumnDataList$measureCharWidth(map, textMeasurer, textStyle, tickerColumnSnapshot.getCurrentChar());
        Character previousChar = tickerColumnSnapshot.getPreviousChar();
        list.add(new ColumnSnapshotWithWidth(tickerColumnSnapshot, fBuildColumnDataList$measureCharWidth, previousChar != null ? buildColumnDataList$measureCharWidth(map, textMeasurer, textStyle, previousChar.charValue()) : fBuildColumnDataList$measureCharWidth));
    }
}
