package com.robinhood.android.doc.serverdriven.regionselector;

import com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SddrRegionSelectorStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorDataState;", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorViewState;", "<init>", "()V", "reduce", "dataState", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SddrRegionSelectorStateProvider implements StateProvider<SddrRegionSelectorDataState, SddrRegionSelectorViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SddrRegionSelectorViewState reduce(SddrRegionSelectorDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.isLoading()) {
            return SddrRegionSelectorViewState.Loading.INSTANCE;
        }
        String string2 = StringsKt.trim(dataState.getSearchQuery()).toString();
        List<CountryCode> options = dataState.getOptions();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = options.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.contains((CharSequence) CountryCode.getDisplayCountry$default((CountryCode) next, null, 1, null), (CharSequence) string2, true)) {
                arrayList.add(next);
            }
        }
        return new SddrRegionSelectorViewState.Loaded(CollectionsKt.contains(arrayList, dataState.getSelected()) ? dataState.getSelected() : null, arrayList);
    }
}
