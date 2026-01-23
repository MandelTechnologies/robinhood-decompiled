package com.robinhood.tooltips;

import com.robinhood.tooltips.TooltipManagerViewState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TooltipManagerDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aV\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010\u0004\u001a\u0002H\u00022\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0006¢\u0006\u0002\b\u0007¢\u0006\u0002\u0010\b\u001aP\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\u00012\u0006\u0010\u0004\u001a\u0002H\u00022\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006¢\u0006\u0002\b\u0007¢\u0006\u0002\u0010\b¨\u0006\f"}, m3636d2 = {"update", "", "K", "V", "key", "mutator", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "updateData", "Lcom/robinhood/tooltips/TooltipManagerViewState$Tooltip;", "Lcom/robinhood/tooltips/TooltipData;", "lib-design-system-tooltips_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.tooltips.TooltipManagerDuxoKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TooltipManagerDuxo3 {
    public static final <K, V> Map<K, V> update(Map<K, ? extends V> map, K k, Function1<? super V, ? extends V> mutator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        Map<K, V> mutableMap = MapsKt.toMutableMap(map);
        V v = mutableMap.get(k);
        V vInvoke = v != null ? mutator.invoke(v) : null;
        if (vInvoke == null) {
            mutableMap.remove(k);
            return mutableMap;
        }
        mutableMap.put(k, vInvoke);
        return mutableMap;
    }

    public static final <K> Map<K, TooltipManagerViewState.Tooltip> updateData(Map<K, TooltipManagerViewState.Tooltip> map, K k, final Function1<? super TooltipData, TooltipData> mutator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        return update(map, k, new Function1() { // from class: com.robinhood.tooltips.TooltipManagerDuxoKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TooltipManagerDuxo3.updateData$lambda$2(mutator, (TooltipManagerViewState.Tooltip) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipManagerViewState.Tooltip updateData$lambda$2(Function1 function1, TooltipManagerViewState.Tooltip update) {
        Intrinsics.checkNotNullParameter(update, "$this$update");
        TooltipData tooltipData = (TooltipData) function1.invoke(update.getData());
        if (tooltipData != null) {
            return TooltipManagerViewState.Tooltip.copy$default(update, null, tooltipData, 1, null);
        }
        return null;
    }
}
