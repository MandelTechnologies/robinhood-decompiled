package com.robinhood.android.common.recurring.sourceoffunds.paycheck;

import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositRelationshipRowState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÂ\u0003J)\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/DirectDepositRelationshipRowState;", "", "selectedRowId", "Ljava/util/UUID;", "directDepositRelationship", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "isLoading", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;Z)V", "directDepositRelationshipId", "getDirectDepositRelationshipId", "()Ljava/util/UUID;", "isSelected", "()Z", "areClicksEnabled", "getAreClicksEnabled", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "getSecondaryText", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DirectDepositRelationshipRowState {
    public static final int $stable = 8;
    private final DirectDepositRelationship directDepositRelationship;
    private final boolean isLoading;
    private final UUID selectedRowId;

    /* renamed from: component1, reason: from getter */
    private final UUID getSelectedRowId() {
        return this.selectedRowId;
    }

    /* renamed from: component2, reason: from getter */
    private final DirectDepositRelationship getDirectDepositRelationship() {
        return this.directDepositRelationship;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsLoading() {
        return this.isLoading;
    }

    public static /* synthetic */ DirectDepositRelationshipRowState copy$default(DirectDepositRelationshipRowState directDepositRelationshipRowState, UUID uuid, DirectDepositRelationship directDepositRelationship, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = directDepositRelationshipRowState.selectedRowId;
        }
        if ((i & 2) != 0) {
            directDepositRelationship = directDepositRelationshipRowState.directDepositRelationship;
        }
        if ((i & 4) != 0) {
            z = directDepositRelationshipRowState.isLoading;
        }
        return directDepositRelationshipRowState.copy(uuid, directDepositRelationship, z);
    }

    public final DirectDepositRelationshipRowState copy(UUID selectedRowId, DirectDepositRelationship directDepositRelationship, boolean isLoading) {
        Intrinsics.checkNotNullParameter(directDepositRelationship, "directDepositRelationship");
        return new DirectDepositRelationshipRowState(selectedRowId, directDepositRelationship, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectDepositRelationshipRowState)) {
            return false;
        }
        DirectDepositRelationshipRowState directDepositRelationshipRowState = (DirectDepositRelationshipRowState) other;
        return Intrinsics.areEqual(this.selectedRowId, directDepositRelationshipRowState.selectedRowId) && Intrinsics.areEqual(this.directDepositRelationship, directDepositRelationshipRowState.directDepositRelationship) && this.isLoading == directDepositRelationshipRowState.isLoading;
    }

    public int hashCode() {
        UUID uuid = this.selectedRowId;
        return ((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.directDepositRelationship.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "DirectDepositRelationshipRowState(selectedRowId=" + this.selectedRowId + ", directDepositRelationship=" + this.directDepositRelationship + ", isLoading=" + this.isLoading + ")";
    }

    public DirectDepositRelationshipRowState(UUID uuid, DirectDepositRelationship directDepositRelationship, boolean z) {
        Intrinsics.checkNotNullParameter(directDepositRelationship, "directDepositRelationship");
        this.selectedRowId = uuid;
        this.directDepositRelationship = directDepositRelationship;
        this.isLoading = z;
    }

    public final UUID getDirectDepositRelationshipId() {
        return this.directDepositRelationship.getId();
    }

    public final boolean isSelected() {
        return Intrinsics.areEqual(this.selectedRowId, this.directDepositRelationship.getId());
    }

    public final boolean getAreClicksEnabled() {
        return !this.isLoading;
    }

    public final StringResource getPrimaryText() {
        return StringResource.INSTANCE.invoke(C11595R.string.direct_deposit_row_title_template, this.directDepositRelationship.getOriginatorName());
    }

    public final StringResource getSecondaryText() {
        BigDecimal lastPaycheckAmount = this.directDepositRelationship.getLastPaycheckAmount();
        if (lastPaycheckAmount != null) {
            return StringResource.INSTANCE.invoke(C11595R.string.direct_deposit_row_subtitle_template, lastPaycheckAmount);
        }
        return null;
    }
}
