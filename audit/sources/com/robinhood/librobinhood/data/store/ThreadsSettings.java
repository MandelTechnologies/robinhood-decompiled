package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ThreadNotificationSettingsStore.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006J\u0018\u0010\u0015\u001a\u00020\u00002\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\tJ\u0016\u0010\u0017\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0006\u0010\u0013\u001a\u00020\u0004J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u0019\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0003HÂ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0018\u00010\tHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ThreadsSettings;", "", "threadIdToThreadSettingsIdMap", "", "", "threadSettingsIdToSettingsItemMap", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "Lcom/robinhood/librobinhood/data/store/ThreadSettingsItem;", "mutedThreadSettings", "", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "getMutedThreadSettings", "()Ljava/util/List;", "copyAndUpdateThreadSettingsStatus", "threadSettingsId", "isMuted", "", "copyAndUpdateSettingsWithThreadId", "threadId", "threadSettingsItem", "copyAndUpdateMutedThreadSettings", "updatedMutedThreadSettingItems", "getThreadSettings", "getThreadSettingsWithThreadId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-notifications_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final /* data */ class ThreadsSettings {
    private final List<ApiNotificationThreadSettingsItem> mutedThreadSettings;
    private final Map<String, String> threadIdToThreadSettingsIdMap;
    private final Map<String, ApiNotificationThreadSettingsItem> threadSettingsIdToSettingsItemMap;

    public ThreadsSettings() {
        this(null, null, null, 7, null);
    }

    private final Map<String, String> component1() {
        return this.threadIdToThreadSettingsIdMap;
    }

    private final Map<String, ApiNotificationThreadSettingsItem> component2() {
        return this.threadSettingsIdToSettingsItemMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThreadsSettings copy$default(ThreadsSettings threadsSettings, Map map, Map map2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = threadsSettings.threadIdToThreadSettingsIdMap;
        }
        if ((i & 2) != 0) {
            map2 = threadsSettings.threadSettingsIdToSettingsItemMap;
        }
        if ((i & 4) != 0) {
            list = threadsSettings.mutedThreadSettings;
        }
        return threadsSettings.copy(map, map2, list);
    }

    public final List<ApiNotificationThreadSettingsItem> component3() {
        return this.mutedThreadSettings;
    }

    public final ThreadsSettings copy(Map<String, String> threadIdToThreadSettingsIdMap, Map<String, ApiNotificationThreadSettingsItem> threadSettingsIdToSettingsItemMap, List<ApiNotificationThreadSettingsItem> mutedThreadSettings) {
        Intrinsics.checkNotNullParameter(threadIdToThreadSettingsIdMap, "threadIdToThreadSettingsIdMap");
        Intrinsics.checkNotNullParameter(threadSettingsIdToSettingsItemMap, "threadSettingsIdToSettingsItemMap");
        return new ThreadsSettings(threadIdToThreadSettingsIdMap, threadSettingsIdToSettingsItemMap, mutedThreadSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadsSettings)) {
            return false;
        }
        ThreadsSettings threadsSettings = (ThreadsSettings) other;
        return Intrinsics.areEqual(this.threadIdToThreadSettingsIdMap, threadsSettings.threadIdToThreadSettingsIdMap) && Intrinsics.areEqual(this.threadSettingsIdToSettingsItemMap, threadsSettings.threadSettingsIdToSettingsItemMap) && Intrinsics.areEqual(this.mutedThreadSettings, threadsSettings.mutedThreadSettings);
    }

    public int hashCode() {
        int iHashCode = ((this.threadIdToThreadSettingsIdMap.hashCode() * 31) + this.threadSettingsIdToSettingsItemMap.hashCode()) * 31;
        List<ApiNotificationThreadSettingsItem> list = this.mutedThreadSettings;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "ThreadsSettings(threadIdToThreadSettingsIdMap=" + this.threadIdToThreadSettingsIdMap + ", threadSettingsIdToSettingsItemMap=" + this.threadSettingsIdToSettingsItemMap + ", mutedThreadSettings=" + this.mutedThreadSettings + ")";
    }

    public ThreadsSettings(Map<String, String> threadIdToThreadSettingsIdMap, Map<String, ApiNotificationThreadSettingsItem> threadSettingsIdToSettingsItemMap, List<ApiNotificationThreadSettingsItem> list) {
        Intrinsics.checkNotNullParameter(threadIdToThreadSettingsIdMap, "threadIdToThreadSettingsIdMap");
        Intrinsics.checkNotNullParameter(threadSettingsIdToSettingsItemMap, "threadSettingsIdToSettingsItemMap");
        this.threadIdToThreadSettingsIdMap = threadIdToThreadSettingsIdMap;
        this.threadSettingsIdToSettingsItemMap = threadSettingsIdToSettingsItemMap;
        this.mutedThreadSettings = list;
    }

    public /* synthetic */ ThreadsSettings(Map map, Map map2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HashMap() : map, (i & 2) != 0 ? new HashMap() : map2, (i & 4) != 0 ? null : list);
    }

    public final List<ApiNotificationThreadSettingsItem> getMutedThreadSettings() {
        return this.mutedThreadSettings;
    }

    public final ThreadsSettings copyAndUpdateThreadSettingsStatus(String threadSettingsId, boolean isMuted) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(threadSettingsId, "threadSettingsId");
        ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItemChangeMuteStatus = ((ApiNotificationThreadSettingsItem) MapsKt.getValue(this.threadSettingsIdToSettingsItemMap, threadSettingsId)).changeMuteStatus(isMuted);
        Map mapPlus = MapsKt.plus(this.threadSettingsIdToSettingsItemMap, Tuples4.m3642to(threadSettingsId, apiNotificationThreadSettingsItemChangeMuteStatus));
        List<ApiNotificationThreadSettingsItem> list = this.mutedThreadSettings;
        if (list != null) {
            List<ApiNotificationThreadSettingsItem> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem : list2) {
                if (Intrinsics.areEqual(apiNotificationThreadSettingsItem.getId(), threadSettingsId)) {
                    apiNotificationThreadSettingsItem = apiNotificationThreadSettingsItemChangeMuteStatus;
                }
                arrayList.add(apiNotificationThreadSettingsItem);
            }
        } else {
            arrayList = null;
        }
        return copy$default(this, null, mapPlus, arrayList, 1, null);
    }

    public final ThreadsSettings copyAndUpdateSettingsWithThreadId(String threadId, ApiNotificationThreadSettingsItem threadSettingsItem) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Intrinsics.checkNotNullParameter(threadSettingsItem, "threadSettingsItem");
        Map mutableMap = MapsKt.toMutableMap(this.threadIdToThreadSettingsIdMap);
        mutableMap.put(threadId, threadSettingsItem.getId());
        Map mutableMap2 = MapsKt.toMutableMap(this.threadSettingsIdToSettingsItemMap);
        mutableMap2.put(threadSettingsItem.getId(), threadSettingsItem);
        Unit unit = Unit.INSTANCE;
        return copy$default(this, mutableMap, mutableMap2, null, 4, null);
    }

    public final ThreadsSettings copyAndUpdateMutedThreadSettings(List<ApiNotificationThreadSettingsItem> updatedMutedThreadSettingItems) {
        Intrinsics.checkNotNullParameter(updatedMutedThreadSettingItems, "updatedMutedThreadSettingItems");
        Map mutableMap = MapsKt.toMutableMap(this.threadSettingsIdToSettingsItemMap);
        for (ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem : updatedMutedThreadSettingItems) {
            mutableMap.put(apiNotificationThreadSettingsItem.getId(), apiNotificationThreadSettingsItem);
        }
        return copy$default(this, null, mutableMap, updatedMutedThreadSettingItems, 1, null);
    }

    public final ApiNotificationThreadSettingsItem getThreadSettings(String threadSettingsId) {
        Intrinsics.checkNotNullParameter(threadSettingsId, "threadSettingsId");
        return this.threadSettingsIdToSettingsItemMap.get(threadSettingsId);
    }

    public final ApiNotificationThreadSettingsItem getThreadSettingsWithThreadId(String threadId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        String str = this.threadIdToThreadSettingsIdMap.get(threadId);
        if (str == null) {
            return null;
        }
        return this.threadSettingsIdToSettingsItemMap.get(str);
    }
}
