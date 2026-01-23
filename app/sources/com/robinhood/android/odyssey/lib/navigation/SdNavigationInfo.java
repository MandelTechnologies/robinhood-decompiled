package com.robinhood.android.odyssey.lib.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.odyssey.lib.template.SdBackendMetadata;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SdNavigationInfo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002LMB[\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\rJ\u0014\u0010&\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\fJ$\u0010(\u001a\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010%\u001a\u00020\r2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\u0000J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\rJ\u001a\u0010/\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005J*\u00100\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\r2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u00102\u001a\u00020+J\u000e\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\rJ\b\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u00020\u0003H\u0016J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u001a\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005HÀ\u0003¢\u0006\u0002\b:J \u0010;\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\bHÀ\u0003¢\u0006\u0002\b<J\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0\fHÀ\u0003¢\u0006\u0002\b>J\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0\fHÀ\u0003¢\u0006\u0002\b@Je\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0006\u0010B\u001a\u00020CJ\u0013\u0010D\u001a\u00020+2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020CHÖ\u0001J\u0016\u0010H\u001a\u0002062\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020CR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0011\u0010!\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/navigation/SdNavigationInfo;", "Landroid/os/Parcelable;", "odysseyFlowId", "", "pages", "", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "storedEntities", "", "Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/android/odyssey/lib/navigation/SdNavigationInfo$PageIdToEntityValue;", "visitedPageIds", "", "Ljava/util/UUID;", "updatedPageIds", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "getOdysseyFlowId", "()Ljava/lang/String;", "getPages$feature_lib_odyssey_externalDebug", "()Ljava/util/List;", "getStoredEntities$feature_lib_odyssey_externalDebug", "()Ljava/util/Map;", "getVisitedPageIds$feature_lib_odyssey_externalDebug", "()Ljava/util/Set;", "getUpdatedPageIds$feature_lib_odyssey_externalDebug", "updatedPageEntities", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "getUpdatedPageEntities", "latestEntities", "getLatestEntities$annotations", "()V", "getLatestEntities", "nextPage", "getNextPage", "()Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "removeVisitedPage", "currentPageId", "removeVisitedPages", "pageIdsToRemove", "addNewPages", "newPagesBlock", "shouldSkipUnvisitedPagesInCurrentBlock", "", "clearPages", "clearPreviousPageBlocks", "nextPageId", "withPages", "submitCurrentPageEntities", "newMetadataToValues", "isCheckpoint", "getPage", "pageId", "requireUniquePageIds", "", "toString", "component1", "component2", "component2$feature_lib_odyssey_externalDebug", "component3", "component3$feature_lib_odyssey_externalDebug", "component4", "component4$feature_lib_odyssey_externalDebug", "component5", "component5$feature_lib_odyssey_externalDebug", "copy", "describeContents", "", "equals", "other", "", "hashCode", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "PageIdToEntityValue", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class SdNavigationInfo implements Parcelable {
    private final String odysseyFlowId;
    private final List<List<ApiSdPage>> pages;
    private final Map<SdBackendMetadata, List<PageIdToEntityValue>> storedEntities;
    private final Set<UUID> updatedPageIds;
    private final Set<UUID> visitedPageIds;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SdNavigationInfo> CREATOR = new Creator();

    /* compiled from: SdNavigationInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SdNavigationInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdNavigationInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(SdNavigationInfo.class.getClassLoader()));
                }
                arrayList.add(arrayList2);
            }
            int i5 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                SdBackendMetadata sdBackendMetadataCreateFromParcel = SdBackendMetadata.CREATOR.createFromParcel(parcel);
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList3.add(PageIdToEntityValue.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap.put(sdBackendMetadataCreateFromParcel, arrayList3);
            }
            int i9 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                linkedHashSet.add(parcel.readSerializable());
            }
            int i11 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashSet2.add(parcel.readSerializable());
            }
            return new SdNavigationInfo(string2, arrayList, linkedHashMap, linkedHashSet, linkedHashSet2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdNavigationInfo[] newArray(int i) {
            return new SdNavigationInfo[i];
        }
    }

    public static /* synthetic */ SdNavigationInfo copy$default(SdNavigationInfo sdNavigationInfo, String str, List list, Map map, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdNavigationInfo.odysseyFlowId;
        }
        if ((i & 2) != 0) {
            list = sdNavigationInfo.pages;
        }
        if ((i & 4) != 0) {
            map = sdNavigationInfo.storedEntities;
        }
        if ((i & 8) != 0) {
            set = sdNavigationInfo.visitedPageIds;
        }
        if ((i & 16) != 0) {
            set2 = sdNavigationInfo.updatedPageIds;
        }
        Set set3 = set2;
        Map map2 = map;
        return sdNavigationInfo.copy(str, list, map2, set, set3);
    }

    public static /* synthetic */ void getLatestEntities$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getOdysseyFlowId() {
        return this.odysseyFlowId;
    }

    public final List<List<ApiSdPage>> component2$feature_lib_odyssey_externalDebug() {
        return this.pages;
    }

    public final Map<SdBackendMetadata, List<PageIdToEntityValue>> component3$feature_lib_odyssey_externalDebug() {
        return this.storedEntities;
    }

    public final Set<UUID> component4$feature_lib_odyssey_externalDebug() {
        return this.visitedPageIds;
    }

    public final Set<UUID> component5$feature_lib_odyssey_externalDebug() {
        return this.updatedPageIds;
    }

    public final SdNavigationInfo copy(String odysseyFlowId, List<? extends List<? extends ApiSdPage>> pages, Map<SdBackendMetadata, ? extends List<PageIdToEntityValue>> storedEntities, Set<UUID> visitedPageIds, Set<UUID> updatedPageIds) {
        Intrinsics.checkNotNullParameter(odysseyFlowId, "odysseyFlowId");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(storedEntities, "storedEntities");
        Intrinsics.checkNotNullParameter(visitedPageIds, "visitedPageIds");
        Intrinsics.checkNotNullParameter(updatedPageIds, "updatedPageIds");
        return new SdNavigationInfo(odysseyFlowId, pages, storedEntities, visitedPageIds, updatedPageIds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdNavigationInfo)) {
            return false;
        }
        SdNavigationInfo sdNavigationInfo = (SdNavigationInfo) other;
        return Intrinsics.areEqual(this.odysseyFlowId, sdNavigationInfo.odysseyFlowId) && Intrinsics.areEqual(this.pages, sdNavigationInfo.pages) && Intrinsics.areEqual(this.storedEntities, sdNavigationInfo.storedEntities) && Intrinsics.areEqual(this.visitedPageIds, sdNavigationInfo.visitedPageIds) && Intrinsics.areEqual(this.updatedPageIds, sdNavigationInfo.updatedPageIds);
    }

    public int hashCode() {
        return (((((((this.odysseyFlowId.hashCode() * 31) + this.pages.hashCode()) * 31) + this.storedEntities.hashCode()) * 31) + this.visitedPageIds.hashCode()) * 31) + this.updatedPageIds.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.odysseyFlowId);
        List<List<ApiSdPage>> list = this.pages;
        dest.writeInt(list.size());
        for (List<ApiSdPage> list2 : list) {
            dest.writeInt(list2.size());
            Iterator<ApiSdPage> it = list2.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        Map<SdBackendMetadata, List<PageIdToEntityValue>> map = this.storedEntities;
        dest.writeInt(map.size());
        for (Map.Entry<SdBackendMetadata, List<PageIdToEntityValue>> entry : map.entrySet()) {
            entry.getKey().writeToParcel(dest, flags);
            List<PageIdToEntityValue> value = entry.getValue();
            dest.writeInt(value.size());
            Iterator<PageIdToEntityValue> it2 = value.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        Set<UUID> set = this.visitedPageIds;
        dest.writeInt(set.size());
        Iterator<UUID> it3 = set.iterator();
        while (it3.hasNext()) {
            dest.writeSerializable(it3.next());
        }
        Set<UUID> set2 = this.updatedPageIds;
        dest.writeInt(set2.size());
        Iterator<UUID> it4 = set2.iterator();
        while (it4.hasNext()) {
            dest.writeSerializable(it4.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdNavigationInfo(String odysseyFlowId, List<? extends List<? extends ApiSdPage>> pages, Map<SdBackendMetadata, ? extends List<PageIdToEntityValue>> storedEntities, Set<UUID> visitedPageIds, Set<UUID> updatedPageIds) {
        Intrinsics.checkNotNullParameter(odysseyFlowId, "odysseyFlowId");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(storedEntities, "storedEntities");
        Intrinsics.checkNotNullParameter(visitedPageIds, "visitedPageIds");
        Intrinsics.checkNotNullParameter(updatedPageIds, "updatedPageIds");
        this.odysseyFlowId = odysseyFlowId;
        this.pages = pages;
        this.storedEntities = storedEntities;
        this.visitedPageIds = visitedPageIds;
        this.updatedPageIds = updatedPageIds;
        requireUniquePageIds();
    }

    public final String getOdysseyFlowId() {
        return this.odysseyFlowId;
    }

    public final List<List<ApiSdPage>> getPages$feature_lib_odyssey_externalDebug() {
        return this.pages;
    }

    public final Map<SdBackendMetadata, List<PageIdToEntityValue>> getStoredEntities$feature_lib_odyssey_externalDebug() {
        return this.storedEntities;
    }

    public final Set<UUID> getVisitedPageIds$feature_lib_odyssey_externalDebug() {
        return this.visitedPageIds;
    }

    public final Set<UUID> getUpdatedPageIds$feature_lib_odyssey_externalDebug() {
        return this.updatedPageIds;
    }

    /* compiled from: SdNavigationInfo.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/navigation/SdNavigationInfo$PageIdToEntityValue;", "Landroid/os/Parcelable;", "pageId", "Ljava/util/UUID;", "value", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;)V", "getPageId", "()Ljava/util/UUID;", "getValue", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "toString", "", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PageIdToEntityValue implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PageIdToEntityValue> CREATOR = new Creator();
        private final UUID pageId;
        private final ApiSdTypedValue value;

        /* compiled from: SdNavigationInfo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PageIdToEntityValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PageIdToEntityValue createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PageIdToEntityValue((UUID) parcel.readSerializable(), (ApiSdTypedValue) parcel.readParcelable(PageIdToEntityValue.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PageIdToEntityValue[] newArray(int i) {
                return new PageIdToEntityValue[i];
            }
        }

        public static /* synthetic */ PageIdToEntityValue copy$default(PageIdToEntityValue pageIdToEntityValue, UUID uuid, ApiSdTypedValue apiSdTypedValue, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pageIdToEntityValue.pageId;
            }
            if ((i & 2) != 0) {
                apiSdTypedValue = pageIdToEntityValue.value;
            }
            return pageIdToEntityValue.copy(uuid, apiSdTypedValue);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getPageId() {
            return this.pageId;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiSdTypedValue getValue() {
            return this.value;
        }

        public final PageIdToEntityValue copy(UUID pageId, ApiSdTypedValue value) {
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            Intrinsics.checkNotNullParameter(value, "value");
            return new PageIdToEntityValue(pageId, value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageIdToEntityValue)) {
                return false;
            }
            PageIdToEntityValue pageIdToEntityValue = (PageIdToEntityValue) other;
            return Intrinsics.areEqual(this.pageId, pageIdToEntityValue.pageId) && Intrinsics.areEqual(this.value, pageIdToEntityValue.value);
        }

        public int hashCode() {
            return (this.pageId.hashCode() * 31) + this.value.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.pageId);
            dest.writeParcelable(this.value, flags);
        }

        public PageIdToEntityValue(UUID pageId, ApiSdTypedValue value) {
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            Intrinsics.checkNotNullParameter(value, "value");
            this.pageId = pageId;
            this.value = value;
        }

        public final UUID getPageId() {
            return this.pageId;
        }

        public final ApiSdTypedValue getValue() {
            return this.value;
        }

        public String toString() {
            return "(" + this.pageId + ", " + Reflection.getOrCreateKotlinClass(this.value.getClass()) + ")";
        }
    }

    public final Map<SdBackendMetadata, ApiSdTypedValue> getUpdatedPageEntities() {
        Map<SdBackendMetadata, List<PageIdToEntityValue>> map = this.storedEntities;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<SdBackendMetadata, List<PageIdToEntityValue>> entry : map.entrySet()) {
            List<PageIdToEntityValue> value = entry.getValue();
            if (!(value instanceof Collection) || !value.isEmpty()) {
                Iterator<T> it = value.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (this.updatedPageIds.contains(((PageIdToEntityValue) it.next()).getPageId())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            break;
                        }
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), ((PageIdToEntityValue) CollectionsKt.last((List) entry2.getValue())).getValue());
        }
        return linkedHashMap2;
    }

    public final Map<SdBackendMetadata, ApiSdTypedValue> getLatestEntities() {
        Map<SdBackendMetadata, List<PageIdToEntityValue>> map = this.storedEntities;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((PageIdToEntityValue) CollectionsKt.last((List) entry.getValue())).getValue());
        }
        return linkedHashMap;
    }

    public final ApiSdPage getNextPage() {
        Object next;
        Iterator it = CollectionsKt.flatten(this.pages).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ApiSdPage apiSdPage = (ApiSdPage) next;
            if (!this.visitedPageIds.contains(apiSdPage.getPageId()) && SdNavigationUtil.areAllDependenciesSatisfied(apiSdPage, getLatestEntities())) {
                break;
            }
        }
        ApiSdPage apiSdPage2 = (ApiSdPage) next;
        if (apiSdPage2 != null) {
            return apiSdPage2;
        }
        throw new IllegalArgumentException(("Failed to find next page: " + this).toString());
    }

    public final SdNavigationInfo removeVisitedPage(UUID currentPageId) {
        Intrinsics.checkNotNullParameter(currentPageId, "currentPageId");
        Set setMinus = SetsKt.minus(this.visitedPageIds, currentPageId);
        Set setMinus2 = SetsKt.minus(this.updatedPageIds, currentPageId);
        Map<SdBackendMetadata, List<PageIdToEntityValue>> map = this.storedEntities;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.areEqual(((PageIdToEntityValue) obj).getPageId(), currentPageId)) {
                    arrayList.add(obj);
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!((List) entry2.getValue()).isEmpty()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return copy$default(this, null, null, linkedHashMap2, setMinus, setMinus2, 3, null);
    }

    public final SdNavigationInfo removeVisitedPages(Set<UUID> pageIdsToRemove) {
        Intrinsics.checkNotNullParameter(pageIdsToRemove, "pageIdsToRemove");
        Set<UUID> set = pageIdsToRemove;
        Set setMinus = SetsKt.minus((Set) this.visitedPageIds, (Iterable) set);
        Set setMinus2 = SetsKt.minus((Set) this.updatedPageIds, (Iterable) set);
        Map<SdBackendMetadata, List<PageIdToEntityValue>> map = this.storedEntities;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!pageIdsToRemove.contains(((PageIdToEntityValue) obj).getPageId())) {
                    arrayList.add(obj);
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!((List) entry2.getValue()).isEmpty()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return copy$default(this, null, null, linkedHashMap2, setMinus, setMinus2, 3, null);
    }

    public final SdNavigationInfo addNewPages(List<? extends ApiSdPage> newPagesBlock, UUID currentPageId, boolean shouldSkipUnvisitedPagesInCurrentBlock) {
        int i;
        List<ApiSdPage> listSubList;
        Intrinsics.checkNotNullParameter(newPagesBlock, "newPagesBlock");
        Intrinsics.checkNotNullParameter(currentPageId, "currentPageId");
        if (newPagesBlock.isEmpty()) {
            throw new IllegalStateException(("NewPagesBlock shouldn't be empty: " + this).toString());
        }
        Iterator<List<ApiSdPage>> it = this.pages.iterator();
        int i2 = 0;
        loop0: while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            List<ApiSdPage> next = it.next();
            if (!(next instanceof Collection) || !next.isEmpty()) {
                Iterator<T> it2 = next.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((ApiSdPage) it2.next()).getPageId(), currentPageId)) {
                        break loop0;
                    }
                }
            }
            i2++;
        }
        if (i2 == -1) {
            throw new IllegalStateException(("CurrentPageId " + currentPageId + " must exist in oldPages: " + this).toString());
        }
        List<List<ApiSdPage>> listSubList2 = this.pages.subList(0, i2);
        if (!shouldSkipUnvisitedPagesInCurrentBlock) {
            listSubList = this.pages.get(i2);
        } else {
            Iterator<ApiSdPage> it3 = this.pages.get(i2).iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(it3.next().getPageId(), currentPageId)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            listSubList = this.pages.get(i2).subList(0, i + 1);
        }
        return copy$default(this, null, CollectionsKt.plus((Collection<? extends List<? extends ApiSdPage>>) CollectionsKt.plus((Collection<? extends List<ApiSdPage>>) listSubList2, listSubList), newPagesBlock), null, null, null, 29, null);
    }

    public final SdNavigationInfo clearPages() {
        return new SdNavigationInfo(this.odysseyFlowId, CollectionsKt.emptyList(), this.storedEntities, this.visitedPageIds, this.updatedPageIds);
    }

    public final SdNavigationInfo clearPreviousPageBlocks(UUID nextPageId) {
        Intrinsics.checkNotNullParameter(nextPageId, "nextPageId");
        Iterator<List<ApiSdPage>> it = this.pages.iterator();
        int i = 0;
        loop0: while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            List<ApiSdPage> next = it.next();
            if (!(next instanceof Collection) || !next.isEmpty()) {
                Iterator<T> it2 = next.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((ApiSdPage) it2.next()).getPageId(), nextPageId)) {
                        break loop0;
                    }
                }
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException(("CurrentPageId " + nextPageId + " must exist in oldPages: " + this).toString());
        }
        List<List<ApiSdPage>> list = this.pages;
        return copy$default(this, null, list.subList(i, list.size()), null, null, null, 29, null);
    }

    public final SdNavigationInfo withPages(List<? extends List<? extends ApiSdPage>> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new SdNavigationInfo(this.odysseyFlowId, pages, this.storedEntities, this.visitedPageIds, this.updatedPageIds);
    }

    public final SdNavigationInfo submitCurrentPageEntities(UUID currentPageId, Map<SdBackendMetadata, ? extends ApiSdTypedValue> newMetadataToValues, boolean isCheckpoint) {
        Intrinsics.checkNotNullParameter(currentPageId, "currentPageId");
        Intrinsics.checkNotNullParameter(newMetadataToValues, "newMetadataToValues");
        Map mutableMap = MapsKt.toMutableMap(this.storedEntities);
        for (Map.Entry<SdBackendMetadata, ? extends ApiSdTypedValue> entry : newMetadataToValues.entrySet()) {
            SdBackendMetadata key = entry.getKey();
            ApiSdTypedValue value = entry.getValue();
            List listEmptyList = (List) mutableMap.get(key);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            mutableMap.put(key, CollectionsKt.plus((Collection<? extends PageIdToEntityValue>) listEmptyList, new PageIdToEntityValue(currentPageId, value)));
        }
        return copy$default(this, null, null, mutableMap, SetsKt.plus(this.visitedPageIds, currentPageId), isCheckpoint ? SetsKt.emptySet() : SetsKt.plus(this.updatedPageIds, currentPageId), 3, null);
    }

    public final ApiSdPage getPage(UUID pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Iterator<T> it = this.pages.iterator();
        while (it.hasNext()) {
            List<ApiSdPage> list = (List) it.next();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((ApiSdPage) it2.next()).getPageId(), pageId)) {
                        for (ApiSdPage apiSdPage : list) {
                            if (Intrinsics.areEqual(apiSdPage.getPageId(), pageId)) {
                                return apiSdPage;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final void requireUniquePageIds() {
        List listFlatten = CollectionsKt.flatten(this.pages);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFlatten) {
            if (hashSet.add(((ApiSdPage) obj).getPageId())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == listFlatten.size()) {
            return;
        }
        throw new IllegalStateException(("Pages shouldn't have duplicate pages ids: " + this).toString());
    }

    public String toString() {
        return StringsKt.trimIndent("\n            SdoNavigationInfo(\n            odysseyFlowId = " + this.odysseyFlowId + ",\n            pages = " + SdNavigationUtil.toContentString(this.pages, new Function1() { // from class: com.robinhood.android.odyssey.lib.navigation.SdNavigationInfo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdNavigationInfo.toString$lambda$26(this.f$0, (ApiSdPage) obj);
            }
        }) + ",\n            storedEntities = " + this.storedEntities + ",\n            visitedPageIds = " + this.visitedPageIds + ",\n            revisitedPageIds = " + this.updatedPageIds + "\n            )\n        ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object toString$lambda$26(SdNavigationInfo sdNavigationInfo, ApiSdPage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Tuples4.m3642to(it.getPage_key(), Boolean.valueOf(SdNavigationUtil.areAllDependenciesSatisfied(it, sdNavigationInfo.getLatestEntities())));
    }

    /* compiled from: SdNavigationInfo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/navigation/SdNavigationInfo$Companion;", "", "<init>", "()V", "buildInitialInfo", "Lcom/robinhood/android/odyssey/lib/navigation/SdNavigationInfo;", "odysseyFlowId", "", "initialPages", "", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SdNavigationInfo buildInitialInfo(String odysseyFlowId, List<? extends ApiSdPage> initialPages) {
            Intrinsics.checkNotNullParameter(odysseyFlowId, "odysseyFlowId");
            Intrinsics.checkNotNullParameter(initialPages, "initialPages");
            if (initialPages.isEmpty()) {
                throw new IllegalStateException(("In " + odysseyFlowId + ", initial pages shouldn't be empty.").toString());
            }
            return new SdNavigationInfo(odysseyFlowId, CollectionsKt.listOf(initialPages), MapsKt.emptyMap(), SetsKt.emptySet(), SetsKt.emptySet());
        }
    }
}
