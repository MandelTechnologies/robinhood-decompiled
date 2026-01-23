package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaSearchContent;
import com.robinhood.android.models.matcha.api.ApiSearchContactMethod;
import com.robinhood.android.models.matcha.api.ApiSearchResult;
import com.robinhood.android.models.matcha.api.ApiSearchUserItem;
import com.robinhood.android.models.matcha.api.ApiSearchUsersResponse;
import com.robinhood.android.models.matcha.api.SearchContentType;
import com.robinhood.android.store.matcha.MatchaSearchStore;
import com.robinhood.models.p320db.matcha.MatchaSearchUser2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: MatchaSearchStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toSearchResponse", "Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;", "Lcom/robinhood/android/models/matcha/api/ApiSearchUsersResponse;", "lib-store-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.store.matcha.MatchaSearchStoreKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class MatchaSearchStore6 {
    public static final MatchaSearchStore.SearchResponse toSearchResponse(ApiSearchUsersResponse apiSearchUsersResponse) {
        Intrinsics.checkNotNullParameter(apiSearchUsersResponse, "<this>");
        List<ApiSearchResult> results = apiSearchUsersResponse.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApiSearchResult) it.next()).getContent());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(((ApiMatchaSearchContent) obj).getContent_type(), obj);
        }
        Object obj2 = linkedHashMap.get(SearchContentType.USERS);
        ApiMatchaSearchContent.UserContent userContent = obj2 instanceof ApiMatchaSearchContent.UserContent ? (ApiMatchaSearchContent.UserContent) obj2 : null;
        Object obj3 = linkedHashMap.get(SearchContentType.CONNECTIONS);
        ApiMatchaSearchContent.UserContent userContent2 = obj3 instanceof ApiMatchaSearchContent.UserContent ? (ApiMatchaSearchContent.UserContent) obj3 : null;
        Object obj4 = linkedHashMap.get(SearchContentType.CONTACT_METHODS);
        ApiMatchaSearchContent.ContactMethodContent contactMethodContent = obj4 instanceof ApiMatchaSearchContent.ContactMethodContent ? (ApiMatchaSearchContent.ContactMethodContent) obj4 : null;
        List<ApiSearchUserItem> data = userContent2 != null ? userContent2.getData() : null;
        if (data == null) {
            data = CollectionsKt.emptyList();
        }
        List<ApiSearchUserItem> data2 = userContent != null ? userContent.getData() : null;
        if (data2 == null) {
            data2 = CollectionsKt.emptyList();
        }
        List<ApiSearchContactMethod> data3 = contactMethodContent != null ? contactMethodContent.getData() : null;
        if (data3 == null) {
            data3 = CollectionsKt.emptyList();
        }
        List<ApiSearchUserItem> list = data;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(MatchaSearchUser2.toDbModel(((ApiSearchUserItem) it2.next()).getItem()));
        }
        List<ApiSearchUserItem> list2 = data2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(MatchaSearchUser2.toDbModel(((ApiSearchUserItem) it3.next()).getItem()));
        }
        List<ApiSearchContactMethod> list3 = data3;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((ApiSearchContactMethod) it4.next()).getItem().getContact_method());
        }
        return new MatchaSearchStore.SearchResponse(arrayList2, arrayList3, arrayList4);
    }
}
