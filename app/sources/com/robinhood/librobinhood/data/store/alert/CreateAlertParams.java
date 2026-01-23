package com.robinhood.librobinhood.data.store.alert;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiCreateAdvancedAlertSettingRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/CreateAlertParams;", "", "entityId", "Ljava/util/UUID;", "entityType", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "allowMultiple", "", CarResultComposable2.BODY, "Lcom/robinhood/models/advanced/alert/api/ApiCreateAdvancedAlertSettingRequest;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;ZLcom/robinhood/models/advanced/alert/api/ApiCreateAdvancedAlertSettingRequest;)V", "getEntityId", "()Ljava/util/UUID;", "getEntityType", "()Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "getAllowMultiple", "()Z", "getBody", "()Lcom/robinhood/models/advanced/alert/api/ApiCreateAdvancedAlertSettingRequest;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CreateAlertParams {
    private final boolean allowMultiple;
    private final ApiCreateAdvancedAlertSettingRequest body;
    private final UUID entityId;
    private final ApiAdvancedAlert2 entityType;

    public static /* synthetic */ CreateAlertParams copy$default(CreateAlertParams createAlertParams, UUID uuid, ApiAdvancedAlert2 apiAdvancedAlert2, boolean z, ApiCreateAdvancedAlertSettingRequest apiCreateAdvancedAlertSettingRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = createAlertParams.entityId;
        }
        if ((i & 2) != 0) {
            apiAdvancedAlert2 = createAlertParams.entityType;
        }
        if ((i & 4) != 0) {
            z = createAlertParams.allowMultiple;
        }
        if ((i & 8) != 0) {
            apiCreateAdvancedAlertSettingRequest = createAlertParams.body;
        }
        return createAlertParams.copy(uuid, apiAdvancedAlert2, z, apiCreateAdvancedAlertSettingRequest);
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
    public final boolean getAllowMultiple() {
        return this.allowMultiple;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiCreateAdvancedAlertSettingRequest getBody() {
        return this.body;
    }

    public final CreateAlertParams copy(UUID entityId, ApiAdvancedAlert2 entityType, boolean allowMultiple, ApiCreateAdvancedAlertSettingRequest body) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(body, "body");
        return new CreateAlertParams(entityId, entityType, allowMultiple, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAlertParams)) {
            return false;
        }
        CreateAlertParams createAlertParams = (CreateAlertParams) other;
        return Intrinsics.areEqual(this.entityId, createAlertParams.entityId) && this.entityType == createAlertParams.entityType && this.allowMultiple == createAlertParams.allowMultiple && Intrinsics.areEqual(this.body, createAlertParams.body);
    }

    public int hashCode() {
        return (((((this.entityId.hashCode() * 31) + this.entityType.hashCode()) * 31) + Boolean.hashCode(this.allowMultiple)) * 31) + this.body.hashCode();
    }

    public String toString() {
        return "CreateAlertParams(entityId=" + this.entityId + ", entityType=" + this.entityType + ", allowMultiple=" + this.allowMultiple + ", body=" + this.body + ")";
    }

    public CreateAlertParams(UUID entityId, ApiAdvancedAlert2 entityType, boolean z, ApiCreateAdvancedAlertSettingRequest body) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(body, "body");
        this.entityId = entityId;
        this.entityType = entityType;
        this.allowMultiple = z;
        this.body = body;
    }

    public final UUID getEntityId() {
        return this.entityId;
    }

    public final ApiAdvancedAlert2 getEntityType() {
        return this.entityType;
    }

    public final boolean getAllowMultiple() {
        return this.allowMultiple;
    }

    public final ApiCreateAdvancedAlertSettingRequest getBody() {
        return this.body;
    }
}
