package com.robinhood.utils.extensions;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Lists.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a0\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\bø\u0001\u0000\u001a0\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\bø\u0001\u0000\u001a\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\t*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0003\u001a\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a8\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000f0\u0005\u001a&\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0011j\b\u0012\u0004\u0012\u0002H\u0002`\u0012\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a`\u0010\u0013\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00032\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000326\u0010\u0015\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000f0\u0016\u001a,\u0010\u001b\u001a\u00020\r\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\r0\u0005\u001a%\u0010\u001d\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u001e\u001a\u0002H\u0002¢\u0006\u0002\u0010\u001f\u001a%\u0010 \u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u001e\u001a\u0002H\u0002¢\u0006\u0002\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, m3636d2 = {"forEachByIndex", "", "T", "", "action", "Lkotlin/Function1;", "forEachReversed", "firstOptional", "Lcom/robinhood/utils/Optional;", "", "asUnmodifiable", "truncateAroundTarget", "bufferPerSide", "", "predicate", "", "toArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "equalsBy", "other", "check", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "left", "right", "hashCodeBy", "hash", "getItemAfter", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Ljava/util/List;Ljava/lang/Object;)Ljava/lang/Object;", "getItemBefore", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.ListsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Lists4 {
    public static final <T> void forEachByIndex(List<? extends T> list, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            action.invoke(list.get(i));
        }
    }

    public static final <T> void forEachReversed(List<? extends T> list, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            action.invoke(list.get(size));
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Optional<T> firstOptional(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return Optional.INSTANCE.m2972of(CollectionsKt.firstOrNull((List) list));
    }

    public static final <T> List<T> asUnmodifiable(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(list);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final <T> ArrayList<T> toArrayList(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList<T> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }

    public static final <T> boolean equalsBy(List<? extends T> list, List<? extends T> list2, Function2<? super T, ? super T, Boolean> check) {
        Intrinsics.checkNotNullParameter(check, "check");
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (!check.invoke(it.next(), list2.get(i)).booleanValue()) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public static final <T> int hashCodeBy(List<? extends T> list, Function1<? super T, Integer> hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        int iIntValue = 0;
        if (list == null) {
            return 0;
        }
        Iterator<? extends T> it = list.iterator();
        while (it.hasNext()) {
            iIntValue = (iIntValue * 31) + hash.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    public static final <T> T getItemAfter(List<? extends T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int iIndexOf = list.indexOf(t);
        if (iIndexOf < 0) {
            throw new IllegalStateException("Index of item not found");
        }
        return (T) CollectionsKt.getOrNull(list, iIndexOf + 1);
    }

    public static final <T> T getItemBefore(List<? extends T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int iIndexOf = list.indexOf(t);
        if (iIndexOf < 0) {
            throw new IllegalStateException("Index of item not found");
        }
        return (T) CollectionsKt.getOrNull(list, iIndexOf - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> truncateAroundTarget(List<? extends T> list, int i, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (predicate.invoke((Object) it.next()).booleanValue()) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return list.subList(0, Math.min(i * 2, list.size()));
        }
        int iMax = Math.max(0, i2 - i);
        int iMin = Math.min(i2 + i + 1, list.size());
        return (iMax == 0 && iMin == list.size()) ? list : list.subList(iMax, iMin);
    }
}
