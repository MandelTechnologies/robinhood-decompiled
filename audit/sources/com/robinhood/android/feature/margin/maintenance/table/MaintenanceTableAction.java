package com.robinhood.android.feature.margin.maintenance.table;

import com.robinhood.android.generic.table.GenericTableAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginMaintenanceTableState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/maintenance/table/MaintenanceTableAction;", "Lcom/robinhood/android/generic/table/GenericTableAction;", "action", "Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;", "<init>", "(Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;)V", "getAction", "()Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-maintenance-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MaintenanceTableAction implements GenericTableAction {
    public static final int $stable = 8;
    private final bonfire.proto.idl.margin.p036v1.MaintenanceTableAction action;

    public static /* synthetic */ MaintenanceTableAction copy$default(MaintenanceTableAction maintenanceTableAction, bonfire.proto.idl.margin.p036v1.MaintenanceTableAction maintenanceTableAction2, int i, Object obj) {
        if ((i & 1) != 0) {
            maintenanceTableAction2 = maintenanceTableAction.action;
        }
        return maintenanceTableAction.copy(maintenanceTableAction2);
    }

    /* renamed from: component1, reason: from getter */
    public final bonfire.proto.idl.margin.p036v1.MaintenanceTableAction getAction() {
        return this.action;
    }

    public final MaintenanceTableAction copy(bonfire.proto.idl.margin.p036v1.MaintenanceTableAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new MaintenanceTableAction(action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MaintenanceTableAction) && Intrinsics.areEqual(this.action, ((MaintenanceTableAction) other).action);
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        return "MaintenanceTableAction(action=" + this.action + ")";
    }

    public MaintenanceTableAction(bonfire.proto.idl.margin.p036v1.MaintenanceTableAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
    }

    public final bonfire.proto.idl.margin.p036v1.MaintenanceTableAction getAction() {
        return this.action;
    }
}
