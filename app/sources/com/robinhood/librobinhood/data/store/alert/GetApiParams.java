package com.robinhood.librobinhood.data.store.alert;

import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/GetApiParams;", "", "entityId", "Ljava/util/UUID;", "entityType", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "sortingType", "Lcom/robinhood/librobinhood/data/store/alert/SortingType;", "allowMultiple", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;Lcom/robinhood/librobinhood/data/store/alert/SortingType;Z)V", "getEntityId", "()Ljava/util/UUID;", "getEntityType", "()Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "getSortingType", "()Lcom/robinhood/librobinhood/data/store/alert/SortingType;", "getAllowMultiple", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetApiParams {
    private final boolean allowMultiple;
    private final UUID entityId;
    private final ApiAdvancedAlert2 entityType;
    private final SortingType sortingType;

    public static /* synthetic */ GetApiParams copy$default(GetApiParams getApiParams, UUID uuid, ApiAdvancedAlert2 apiAdvancedAlert2, SortingType sortingType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = getApiParams.entityId;
        }
        if ((i & 2) != 0) {
            apiAdvancedAlert2 = getApiParams.entityType;
        }
        if ((i & 4) != 0) {
            sortingType = getApiParams.sortingType;
        }
        if ((i & 8) != 0) {
            z = getApiParams.allowMultiple;
        }
        return getApiParams.copy(uuid, apiAdvancedAlert2, sortingType, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEntityId() {
        return this.entityId;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiAdvancedAlert2 getEntityType() {
        return this.entityType;
    }

    /* renamed from: component3, reason: from getter */
    public final SortingType getSortingType() {
        return this.sortingType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAllowMultiple() {
        return this.allowMultiple;
    }

    public final GetApiParams copy(UUID entityId, ApiAdvancedAlert2 entityType, SortingType sortingType, boolean allowMultiple) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        return new GetApiParams(entityId, entityType, sortingType, allowMultiple);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetApiParams)) {
            return false;
        }
        GetApiParams getApiParams = (GetApiParams) other;
        return Intrinsics.areEqual(this.entityId, getApiParams.entityId) && this.entityType == getApiParams.entityType && this.sortingType == getApiParams.sortingType && this.allowMultiple == getApiParams.allowMultiple;
    }

    public int hashCode() {
        return (((((this.entityId.hashCode() * 31) + this.entityType.hashCode()) * 31) + this.sortingType.hashCode()) * 31) + Boolean.hashCode(this.allowMultiple);
    }

    public String toString() {
        return "GetApiParams(entityId=" + this.entityId + ", entityType=" + this.entityType + ", sortingType=" + this.sortingType + ", allowMultiple=" + this.allowMultiple + ")";
    }

    public GetApiParams(UUID entityId, ApiAdvancedAlert2 entityType, SortingType sortingType, boolean z) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        this.entityId = entityId;
        this.entityType = entityType;
        this.sortingType = sortingType;
        this.allowMultiple = z;
    }

    public final UUID getEntityId() {
        return this.entityId;
    }

    public final ApiAdvancedAlert2 getEntityType() {
        return this.entityType;
    }

    public final SortingType getSortingType() {
        return this.sortingType;
    }

    public final boolean getAllowMultiple() {
        return this.allowMultiple;
    }
}
