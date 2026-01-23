package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.options.comboorders.detail.TestTags;
import com.robinhood.transfers.suggestions.pills.contracts.DynamicPillSelectionManagedService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DynamicPillSelectionManagedServiceImpl.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0019\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u001aJ,\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0002\u0010\u001dRg\u0010\u0004\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/DynamicPillSelectionManagedServiceImpl;", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillSelectionManagedService;", "<init>", "()V", "callback", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "currency", "amount", "", "Ljava/math/BigDecimal;", "selections", "", "getCallback", "()Lkotlin/jvm/functions/Function3;", "setCallback", "(Lkotlin/jvm/functions/Function3;)V", "loadedCallback", "Lkotlin/Function0;", "getLoadedCallback", "()Lkotlin/jvm/functions/Function0;", "setLoadedCallback", "(Lkotlin/jvm/functions/Function0;)V", TestTags.LOADED, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pillSelected", "availablePillAmounts", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DynamicPillSelectionManagedServiceImpl implements DynamicPillSelectionManagedService {
    public static final int $stable = 8;
    private Function3<? super String, ? super String, ? super List<? extends BigDecimal>, Unit> callback;
    private Function0<Unit> loadedCallback;

    public final Function3<String, String, List<? extends BigDecimal>, Unit> getCallback() {
        return this.callback;
    }

    public final void setCallback(Function3<? super String, ? super String, ? super List<? extends BigDecimal>, Unit> function3) {
        this.callback = function3;
    }

    public final Function0<Unit> getLoadedCallback() {
        return this.loadedCallback;
    }

    public final void setLoadedCallback(Function0<Unit> function0) {
        this.loadedCallback = function0;
    }

    @Override // com.robinhood.transfers.suggestions.pills.contracts.DynamicPillSelectionManagedService
    public Object loaded(Continuation<? super Unit> continuation) {
        Function0<Unit> function0 = this.loadedCallback;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.suggestions.pills.contracts.DynamicPillSelectionManagedService
    public Object pillSelected(String str, String str2, List<String> list, Continuation<? super Unit> continuation) {
        Function3<? super String, ? super String, ? super List<? extends BigDecimal>, Unit> function3 = this.callback;
        if (function3 != null) {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new BigDecimal((String) it.next()));
            }
            function3.invoke(str, str2, arrayList);
        }
        return Unit.INSTANCE;
    }
}
