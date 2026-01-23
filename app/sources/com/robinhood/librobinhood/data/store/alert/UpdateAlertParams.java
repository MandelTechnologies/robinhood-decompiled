package com.robinhood.librobinhood.data.store.alert;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiUpdateAdvancedAlertSettingRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertStore.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/UpdateAlertParams;", "", "entityId", "Ljava/util/UUID;", "entityType", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "sortingType", "Lcom/robinhood/librobinhood/data/store/alert/SortingType;", "allowMultiple", "", CarResultComposable2.BODY, "Lcom/robinhood/models/advanced/alert/api/ApiUpdateAdvancedAlertSettingRequest;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;Lcom/robinhood/librobinhood/data/store/alert/SortingType;ZLcom/robinhood/models/advanced/alert/api/ApiUpdateAdvancedAlertSettingRequest;)V", "getEntityId", "()Ljava/util/UUID;", "getEntityType", "()Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "getSortingType", "()Lcom/robinhood/librobinhood/data/store/alert/SortingType;", "getAllowMultiple", "()Z", "getBody", "()Lcom/robinhood/models/advanced/alert/api/ApiUpdateAdvancedAlertSettingRequest;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UpdateAlertParams {
    private final boolean allowMultiple;
    private final ApiUpdateAdvancedAlertSettingRequest body;
    private final UUID entityId;
    private final ApiAdvancedAlert2 entityType;
    private final SortingType sortingType;

    public static /* synthetic */ UpdateAlertParams copy$default(UpdateAlertParams updateAlertParams, UUID uuid, ApiAdvancedAlert2 apiAdvancedAlert2, SortingType sortingType, boolean z, ApiUpdateAdvancedAlertSettingRequest apiUpdateAdvancedAlertSettingRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = updateAlertParams.entityId;
        }
        if ((i & 2) != 0) {
            apiAdvancedAlert2 = updateAlertParams.entityType;
        }
        if ((i & 4) != 0) {
            sortingType = updateAlertParams.sortingType;
        }
        if ((i & 8) != 0) {
            z = updateAlertParams.allowMultiple;
        }
        if ((i & 16) != 0) {
            apiUpdateAdvancedAlertSettingRequest = updateAlertParams.body;
        }
        ApiUpdateAdvancedAlertSettingRequest apiUpdateAdvancedAlertSettingRequest2 = apiUpdateAdvancedAlertSettingRequest;
        SortingType sortingType2 = sortingType;
        return updateAlertParams.copy(uuid, apiAdvancedAlert2, sortingType2, z, apiUpdateAdvancedAlertSettingRequest2);
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

    /* renamed from: component5, reason: from getter */
    public final ApiUpdateAdvancedAlertSettingRequest getBody() {
        return this.body;
    }

    public final UpdateAlertParams copy(UUID entityId, ApiAdvancedAlert2 entityType, SortingType sortingType, boolean allowMultiple, ApiUpdateAdvancedAlertSettingRequest body) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(body, "body");
        return new UpdateAlertParams(entityId, entityType, sortingType, allowMultiple, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateAlertParams)) {
            return false;
        }
        UpdateAlertParams updateAlertParams = (UpdateAlertParams) other;
        return Intrinsics.areEqual(this.entityId, updateAlertParams.entityId) && this.entityType == updateAlertParams.entityType && this.sortingType == updateAlertParams.sortingType && this.allowMultiple == updateAlertParams.allowMultiple && Intrinsics.areEqual(this.body, updateAlertParams.body);
    }

    public int hashCode() {
        return (((((((this.entityId.hashCode() * 31) + this.entityType.hashCode()) * 31) + this.sortingType.hashCode()) * 31) + Boolean.hashCode(this.allowMultiple)) * 31) + this.body.hashCode();
    }

    public String toString() {
        return "UpdateAlertParams(entityId=" + this.entityId + ", entityType=" + this.entityType + ", sortingType=" + this.sortingType + ", allowMultiple=" + this.allowMultiple + ", body=" + this.body + ")";
    }

    public UpdateAlertParams(UUID entityId, ApiAdvancedAlert2 entityType, SortingType sortingType, boolean z, ApiUpdateAdvancedAlertSettingRequest body) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(body, "body");
        this.entityId = entityId;
        this.entityType = entityType;
        this.sortingType = sortingType;
        this.allowMultiple = z;
        this.body = body;
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

    public final ApiUpdateAdvancedAlertSettingRequest getBody() {
        return this.body;
    }
}
