package com.robinhood.android.doc.p109ui.docorigin;

import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Util.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a,\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u000b"}, m3636d2 = {"allCountriesExcept", "", "Lcom/robinhood/iso/countrycode/CountryCode;", "exclude", "highlight", "resolveTargetCountry", "userLocality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "defaultCountryCode", "", "excluded", "feature-doc-upload_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UtilKt {
    public static final List<CountryCode> allCountriesExcept(List<? extends CountryCode> exclude, CountryCode countryCode) {
        Object next;
        Intrinsics.checkNotNullParameter(exclude, "exclude");
        List<InternationalInfo> internationalInfos = InternationalInfo.INSTANCE.getInternationalInfos();
        ArrayList arrayList = new ArrayList();
        for (Object obj : internationalInfos) {
            if (!exclude.contains(((InternationalInfo) obj).getCountryCode())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InternationalInfo) it.next()).getCountryCode());
        }
        List<CountryCode> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.robinhood.android.doc.ui.docorigin.UtilKt$allCountriesExcept$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(CountryCode.getDisplayCountry$default((CountryCode) t, null, 1, null), CountryCode.getDisplayCountry$default((CountryCode) t2, null, 1, null));
            }
        }));
        Iterator<T> it2 = mutableList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.areEqual((CountryCode) next, countryCode)) {
                break;
            }
        }
        CountryCode countryCode2 = (CountryCode) next;
        if (countryCode2 != null) {
            mutableList.remove(countryCode2);
            mutableList.add(0, countryCode2);
        }
        return mutableList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.robinhood.iso.countrycode.CountryCode] */
    public static final CountryCode resolveTargetCountry(CountryCode.Supported supported, String str, List<? extends CountryCode> excluded) {
        ?? instance;
        Intrinsics.checkNotNullParameter(excluded, "excluded");
        if (str != null && (instance = CountryCode.INSTANCE.parseInstance(str)) != 0) {
            supported = instance;
        }
        if (CollectionsKt.contains(excluded, supported)) {
            return null;
        }
        return supported;
    }
}
