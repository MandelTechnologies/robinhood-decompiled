package com.robinhood.android.taxcenter.previousdocuments;

import com.robinhood.android.taxcenter.C29236R;
import com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PreviousTaxDocumentsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsDataState;", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState;", "<init>", "()V", "reduce", "dataState", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsStateProvider, reason: use source file name */
/* loaded from: classes9.dex */
public final class PreviousTaxDocumentsViewState2 implements StateProvider<PreviousTaxDocumentsDataState, PreviousTaxDocumentsViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.udf.StateProvider
    public PreviousTaxDocumentsViewState reduce(PreviousTaxDocumentsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Map<String, List<UIComponent<GenericAction>>> mapComponent1 = dataState.component1();
        String selectedYear = dataState.getSelectedYear();
        PreviousTaxDocumentsViewState.DocumentList documentList = null;
        Object[] objArr = 0;
        if (mapComponent1 == null) {
            return new PreviousTaxDocumentsViewState.Loading(documentList, 1, objArr == true ? 1 : 0);
        }
        if (mapComponent1.isEmpty()) {
            return PreviousTaxDocumentsViewState.Empty.INSTANCE;
        }
        List listSortedDescending = CollectionsKt.sortedDescending(mapComponent1.keySet());
        if (!CollectionsKt.contains(listSortedDescending, selectedYear)) {
            selectedYear = null;
        }
        if (selectedYear == null) {
            selectedYear = (String) CollectionsKt.first(listSortedDescending);
        }
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C29236R.string.active_tax_year, selectedYear);
        List<UIComponent<GenericAction>> listEmptyList = mapComponent1.get(selectedYear);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new PreviousTaxDocumentsViewState.DocumentList(stringResourceInvoke, selectedYear, listSortedDescending, listEmptyList);
    }
}
