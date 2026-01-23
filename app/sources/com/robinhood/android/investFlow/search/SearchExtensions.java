package com.robinhood.android.investFlow.search;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.search.SearchResponse;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.store.search.SearchStore3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SearchExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"UnsupportedInstrumentTypesForRetirement", "", "", "getSupportedInstruments", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/store/search/SearchResult$Success;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investFlow.search.SearchExtensionsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SearchExtensions {
    private static final List<String> UnsupportedInstrumentTypesForRetirement = CollectionsKt.listOf((Object[]) new String[]{Instrument.TYPE_LP, Instrument.TYPE_MLP});

    public static final List<Instrument> getSupportedInstruments(SearchStore3.Success success, BrokerageAccountType brokerageAccountType) {
        List<Instrument> instruments;
        Intrinsics.checkNotNullParameter(success, "<this>");
        boolean zIsRetirement = brokerageAccountType != null ? brokerageAccountType.isRetirement() : false;
        List<SearchResponse> responses = success.getResponses();
        ArrayList arrayList = new ArrayList();
        for (Object obj : responses) {
            if (obj instanceof SearchResponse.Instruments) {
                arrayList.add(obj);
            }
        }
        SearchResponse.Instruments instruments2 = (SearchResponse.Instruments) CollectionsKt.firstOrNull((List) arrayList);
        if (instruments2 == null || (instruments = instruments2.getInstruments()) == null) {
            return CollectionsKt.emptyList();
        }
        if (!zIsRetirement) {
            return instruments;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : instruments) {
            if (!UnsupportedInstrumentTypesForRetirement.contains(((Instrument) obj2).getType())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
