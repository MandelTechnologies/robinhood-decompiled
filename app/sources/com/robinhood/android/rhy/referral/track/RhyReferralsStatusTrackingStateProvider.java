package com.robinhood.android.rhy.referral.track;

import com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyReferralsStatusTrackingStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingDataState;", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState;", "<init>", "()V", "reduce", "dataState", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyReferralsStatusTrackingStateProvider implements StateProvider<RhyReferralsStatusTrackingDataState, RhyReferralsStatusTrackingViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public RhyReferralsStatusTrackingViewState reduce(RhyReferralsStatusTrackingDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<RhyReferralAttribution> attributionList = dataState.getAttributionList();
        if (attributionList == null) {
            return RhyReferralsStatusTrackingViewState.Loading.INSTANCE;
        }
        List<RhyReferralAttribution> list = attributionList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((RhyReferralAttribution) obj).isCompleted()) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((RhyReferralAttribution) obj2).getId())) {
                arrayList2.add(obj2);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingStateProvider$reduce$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((RhyReferralAttribution) t).getCreatedAt(), ((RhyReferralAttribution) t2).getCreatedAt());
            }
        });
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (((RhyReferralAttribution) obj3).isCompleted()) {
                arrayList3.add(obj3);
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList3) {
            if (hashSet2.add(((RhyReferralAttribution) obj4).getId())) {
                arrayList4.add(obj4);
            }
        }
        return new RhyReferralsStatusTrackingViewState.Loaded(listSortedWith, CollectionsKt.sortedWith(arrayList4, new Comparator() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingStateProvider$reduce$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((RhyReferralAttribution) t).getCreatedAt(), ((RhyReferralAttribution) t2).getCreatedAt());
            }
        }), dataState.getShowRemindRequestDialog());
    }
}
