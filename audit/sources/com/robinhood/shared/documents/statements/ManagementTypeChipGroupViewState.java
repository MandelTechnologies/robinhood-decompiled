package com.robinhood.shared.documents.statements;

import com.robinhood.models.api.ManagementType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentsViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/ManagementTypeChipGroupViewState;", "", "currentManagementType", "Lcom/robinhood/models/api/ManagementType;", "shouldShowManagementTypeChipGroup", "", "selfDirectedChipText", "Lcom/robinhood/utils/resource/StringResource;", "managedChipText", "<init>", "(Lcom/robinhood/models/api/ManagementType;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getCurrentManagementType", "()Lcom/robinhood/models/api/ManagementType;", "getShouldShowManagementTypeChipGroup", "()Z", "getSelfDirectedChipText", "()Lcom/robinhood/utils/resource/StringResource;", "getManagedChipText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ManagementTypeChipGroupViewState {
    public static final int $stable = StringResource.$stable;
    private final ManagementType currentManagementType;
    private final StringResource managedChipText;
    private final StringResource selfDirectedChipText;
    private final boolean shouldShowManagementTypeChipGroup;

    public ManagementTypeChipGroupViewState() {
        this(null, false, null, null, 15, null);
    }

    public static /* synthetic */ ManagementTypeChipGroupViewState copy$default(ManagementTypeChipGroupViewState managementTypeChipGroupViewState, ManagementType managementType, boolean z, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            managementType = managementTypeChipGroupViewState.currentManagementType;
        }
        if ((i & 2) != 0) {
            z = managementTypeChipGroupViewState.shouldShowManagementTypeChipGroup;
        }
        if ((i & 4) != 0) {
            stringResource = managementTypeChipGroupViewState.selfDirectedChipText;
        }
        if ((i & 8) != 0) {
            stringResource2 = managementTypeChipGroupViewState.managedChipText;
        }
        return managementTypeChipGroupViewState.copy(managementType, z, stringResource, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final ManagementType getCurrentManagementType() {
        return this.currentManagementType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowManagementTypeChipGroup() {
        return this.shouldShowManagementTypeChipGroup;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSelfDirectedChipText() {
        return this.selfDirectedChipText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getManagedChipText() {
        return this.managedChipText;
    }

    public final ManagementTypeChipGroupViewState copy(ManagementType currentManagementType, boolean shouldShowManagementTypeChipGroup, StringResource selfDirectedChipText, StringResource managedChipText) {
        Intrinsics.checkNotNullParameter(currentManagementType, "currentManagementType");
        Intrinsics.checkNotNullParameter(selfDirectedChipText, "selfDirectedChipText");
        Intrinsics.checkNotNullParameter(managedChipText, "managedChipText");
        return new ManagementTypeChipGroupViewState(currentManagementType, shouldShowManagementTypeChipGroup, selfDirectedChipText, managedChipText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagementTypeChipGroupViewState)) {
            return false;
        }
        ManagementTypeChipGroupViewState managementTypeChipGroupViewState = (ManagementTypeChipGroupViewState) other;
        return this.currentManagementType == managementTypeChipGroupViewState.currentManagementType && this.shouldShowManagementTypeChipGroup == managementTypeChipGroupViewState.shouldShowManagementTypeChipGroup && Intrinsics.areEqual(this.selfDirectedChipText, managementTypeChipGroupViewState.selfDirectedChipText) && Intrinsics.areEqual(this.managedChipText, managementTypeChipGroupViewState.managedChipText);
    }

    public int hashCode() {
        return (((((this.currentManagementType.hashCode() * 31) + Boolean.hashCode(this.shouldShowManagementTypeChipGroup)) * 31) + this.selfDirectedChipText.hashCode()) * 31) + this.managedChipText.hashCode();
    }

    public String toString() {
        return "ManagementTypeChipGroupViewState(currentManagementType=" + this.currentManagementType + ", shouldShowManagementTypeChipGroup=" + this.shouldShowManagementTypeChipGroup + ", selfDirectedChipText=" + this.selfDirectedChipText + ", managedChipText=" + this.managedChipText + ")";
    }

    public ManagementTypeChipGroupViewState(ManagementType currentManagementType, boolean z, StringResource selfDirectedChipText, StringResource managedChipText) {
        Intrinsics.checkNotNullParameter(currentManagementType, "currentManagementType");
        Intrinsics.checkNotNullParameter(selfDirectedChipText, "selfDirectedChipText");
        Intrinsics.checkNotNullParameter(managedChipText, "managedChipText");
        this.currentManagementType = currentManagementType;
        this.shouldShowManagementTypeChipGroup = z;
        this.selfDirectedChipText = selfDirectedChipText;
        this.managedChipText = managedChipText;
    }

    public /* synthetic */ ManagementTypeChipGroupViewState(ManagementType managementType, boolean z, StringResource stringResource, StringResource stringResource2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ManagementType.SELF_DIRECTED : managementType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? StringResource.INSTANCE.invoke("") : stringResource, (i & 8) != 0 ? StringResource.INSTANCE.invoke("") : stringResource2);
    }

    public final ManagementType getCurrentManagementType() {
        return this.currentManagementType;
    }

    public final boolean getShouldShowManagementTypeChipGroup() {
        return this.shouldShowManagementTypeChipGroup;
    }

    public final StringResource getSelfDirectedChipText() {
        return this.selfDirectedChipText;
    }

    public final StringResource getManagedChipText() {
        return this.managedChipText;
    }
}
