package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.EducationToursEntryCountPref;
import com.robinhood.prefs.annotation.EducationToursEntryFirstShownTimestampPref;
import com.robinhood.prefs.annotation.HiddenEducationToursPref;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTour;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTourResult;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.rxkotlin.Observables;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: AssetDetailEducationTourStore.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u001cJ$\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011J,\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020\u001cJ\u0016\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u001cJ\u000e\u0010&\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0011J\u000e\u0010'\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00130\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160\u00130\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/AssetDetailEducationTourStore;", "Lcom/robinhood/store/Store;", "educationTourStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;", "hiddenEducationToursPref", "Lcom/robinhood/prefs/StringPreference;", "entryPointCountPref", "entryPointFirstShownTimestampPref", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/store/StoreBundle;)V", "stringSetAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "stringIntMapAdapter", "", "", "stringLongMapAdapter", "", "refreshEducationTour", "", "screen", "screenUniqueId", "force", "", "streamEducationTourIfNotHidden", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTourResult;", "streamEducationTour", "obeyClientRestrictions", "setEducationTourShouldHide", "trackingId", "shouldHide", "setEntryPointFirstShown", "incrementEntryPointSeenCount", "Companion", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AssetDetailEducationTourStore extends Store {
    public static final int MAX_DAYS_TO_SHOW = 5;
    public static final int MAX_ENTRY_POINT_IMPRESSIONS = 10;
    private final EducationTourStore educationTourStore;
    private final StringPreference entryPointCountPref;
    private final StringPreference entryPointFirstShownTimestampPref;
    private final StringPreference hiddenEducationToursPref;
    private final JsonAdapter<Map<String, Integer>> stringIntMapAdapter;
    private final JsonAdapter<Map<String, Long>> stringLongMapAdapter;
    private final JsonAdapter<Set<String>> stringSetAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetDetailEducationTourStore(EducationTourStore educationTourStore, @HiddenEducationToursPref StringPreference hiddenEducationToursPref, @EducationToursEntryCountPref StringPreference entryPointCountPref, @EducationToursEntryFirstShownTimestampPref StringPreference entryPointFirstShownTimestampPref, LazyMoshi moshi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(educationTourStore, "educationTourStore");
        Intrinsics.checkNotNullParameter(hiddenEducationToursPref, "hiddenEducationToursPref");
        Intrinsics.checkNotNullParameter(entryPointCountPref, "entryPointCountPref");
        Intrinsics.checkNotNullParameter(entryPointFirstShownTimestampPref, "entryPointFirstShownTimestampPref");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.educationTourStore = educationTourStore;
        this.hiddenEducationToursPref = hiddenEducationToursPref;
        this.entryPointCountPref = entryPointCountPref;
        this.entryPointFirstShownTimestampPref = entryPointFirstShownTimestampPref;
        Types types = Types.INSTANCE;
        this.stringSetAdapter = moshi.adapter(new TypeToken<Set<? extends String>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.AssetDetailEducationTourStore$special$$inlined$getAdapter$1
        }.getType());
        this.stringIntMapAdapter = moshi.adapter(new TypeToken<Map<String, ? extends Integer>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.AssetDetailEducationTourStore$special$$inlined$getAdapter$2
        }.getType());
        this.stringLongMapAdapter = moshi.adapter(new TypeToken<Map<String, ? extends Long>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.AssetDetailEducationTourStore$special$$inlined$getAdapter$3
        }.getType());
    }

    public final void refreshEducationTour(String screen, String screenUniqueId, boolean force) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        ScopedSubscriptionKt.subscribeIn(Completables.ignoreNetworkExceptions(this.educationTourStore.refreshEducationTour(screen, screenUniqueId, force)), getStoreScope());
    }

    public final Observable<Optional<EducationTourResult>> streamEducationTourIfNotHidden(String screen, String screenUniqueId) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(this.educationTourStore.streamEducationTour(screen, screenUniqueId), this.hiddenEducationToursPref.changes(), this.entryPointCountPref.changes(), this.entryPointFirstShownTimestampPref.changes(), new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.librobinhood.data.store.bonfire.AssetDetailEducationTourStore$streamEducationTourIfNotHidden$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
            @Override // io.reactivex.functions.Function4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                String id;
                Set setEmptySet;
                Map mapEmptyMap;
                Map mapEmptyMap2;
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Optional optional = (Optional) t4;
                Optional optional2 = (Optional) t3;
                Optional optional3 = (Optional) t2;
                EducationTourResult educationTourResult = (EducationTourResult) t1;
                EducationTour tour = educationTourResult.getTour();
                if (tour == null || (id = tour.getTrackingId()) == null) {
                    EducationTour tour2 = educationTourResult.getTour();
                    id = tour2 != null ? tour2.getId() : null;
                }
                String str = (String) optional3.getOrNull();
                if (str == null || (setEmptySet = (Set) this.this$0.stringSetAdapter.fromJson(str)) == null) {
                    setEmptySet = SetsKt.emptySet();
                }
                if (!CollectionsKt.contains(setEmptySet, id)) {
                    String str2 = (String) optional2.getOrNull();
                    if (str2 == null || (mapEmptyMap = (Map) this.this$0.stringIntMapAdapter.fromJson(str2)) == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    Integer num = (Integer) mapEmptyMap.get(id);
                    boolean z = (num != null ? num.intValue() : 0) > 10;
                    String str3 = (String) optional.getOrNull();
                    if (str3 == null || (mapEmptyMap2 = (Map) this.this$0.stringLongMapAdapter.fromJson(str3)) == null) {
                        mapEmptyMap2 = MapsKt.emptyMap();
                    }
                    Long l = (Long) mapEmptyMap2.get(id);
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(l != null ? l.longValue() : 0L);
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                    if (!((z && ((Durations.since(instantOfEpochMilli).toDays() > 5L ? 1 : (Durations.since(instantOfEpochMilli).toDays() == 5L ? 0 : -1)) > 0)) ? false : true)) {
                        educationTourResult = null;
                    }
                }
                return (R) Optional3.asOptional(educationTourResult);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        Observable<Optional<EducationTourResult>> observableTakeUntil = observableCombineLatest.takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    public final Observable<Optional<EducationTourResult>> streamEducationTour(String screen, String screenUniqueId, boolean obeyClientRestrictions) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (obeyClientRestrictions) {
            return streamEducationTourIfNotHidden(screen, screenUniqueId);
        }
        if (obeyClientRestrictions) {
            throw new NoWhenBranchMatchedException();
        }
        Observable map = this.educationTourStore.streamEducationTour(screen, screenUniqueId).takeUntil(getLogoutKillswitch().getKillswitchObservable()).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.AssetDetailEducationTourStore.streamEducationTour.1
            @Override // io.reactivex.functions.Function
            public final Optional<EducationTourResult> apply(EducationTourResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it);
            }
        });
        Intrinsics.checkNotNull(map);
        return map;
    }

    public final void setEducationTourShouldHide(String trackingId, boolean shouldHide) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        this.educationTourStore.setEducationTourShouldHide(trackingId, shouldHide);
    }

    public final void setEntryPointFirstShown(String trackingId) {
        Map<String, Long> linkedHashMap;
        Map<String, Long> mapFromJson;
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        String str = this.entryPointFirstShownTimestampPref.get();
        if (str == null || (mapFromJson = this.stringLongMapAdapter.fromJson(str)) == null || (linkedHashMap = MapsKt.toMutableMap(mapFromJson)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        if (linkedHashMap.get(trackingId) == null) {
            linkedHashMap.put(trackingId, Long.valueOf(System.currentTimeMillis()));
            this.entryPointFirstShownTimestampPref.set(this.stringLongMapAdapter.toJson(linkedHashMap));
        }
    }

    public final void incrementEntryPointSeenCount(String trackingId) {
        Map<String, Integer> linkedHashMap;
        Map<String, Integer> mapFromJson;
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        String str = this.entryPointCountPref.get();
        if (str == null || (mapFromJson = this.stringIntMapAdapter.fromJson(str)) == null || (linkedHashMap = MapsKt.toMutableMap(mapFromJson)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap.put(trackingId, Integer.valueOf(linkedHashMap.getOrDefault(trackingId, 0).intValue() + 1));
        this.entryPointCountPref.set(this.stringIntMapAdapter.toJson(linkedHashMap));
    }
}
