package com.robinhood.transfers.suggestions.pills.contracts;

import com.robinhood.android.options.comboorders.detail.TestTags;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: DynamicPillSelectionManagedService.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillSelectionManagedService;", "", TestTags.LOADED, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pillSelected", "currency", "", "amount", "availablePillAmounts", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "mg.dynamicpillsselection")
/* loaded from: classes12.dex */
public interface DynamicPillSelectionManagedService {
    Object loaded(Continuation<? super Unit> continuation);

    Object pillSelected(String str, String str2, List<String> list, Continuation<? super Unit> continuation);
}
