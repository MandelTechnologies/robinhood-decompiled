package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.content.res.Resources;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.banking.util.AchTransferStringHelper;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EnterDepositScheduleAmountViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÂ\u0003J3\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountViewState;", "", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "showDepositFrequencyButton", "", "isDepositFrequencyButtonClickable", "config", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterAmountArgs;", "<init>", "(Lcom/robinhood/models/db/AchRelationship;ZZLcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterAmountArgs;)V", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getShowDepositFrequencyButton", "()Z", "depositScheduleDescriptionTextValue", "Lcom/robinhood/utils/resource/StringResource;", "getDepositScheduleDescriptionTextValue", "()Lcom/robinhood/utils/resource/StringResource;", "getTransferAccountLabelText", "", "resources", "Landroid/content/res/Resources;", "getAchRelationshipDisplayText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class EnterDepositScheduleAmountViewState {
    public static final int $stable = 8;
    private final AchRelationship achRelationship;
    private final DepositScheduleFlowArgs config;
    private final StringResource depositScheduleDescriptionTextValue;
    private final boolean isDepositFrequencyButtonClickable;
    private final boolean showDepositFrequencyButton;

    /* renamed from: component4, reason: from getter */
    private final DepositScheduleFlowArgs getConfig() {
        return this.config;
    }

    public static /* synthetic */ EnterDepositScheduleAmountViewState copy$default(EnterDepositScheduleAmountViewState enterDepositScheduleAmountViewState, AchRelationship achRelationship, boolean z, boolean z2, DepositScheduleFlowArgs depositScheduleFlowArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            achRelationship = enterDepositScheduleAmountViewState.achRelationship;
        }
        if ((i & 2) != 0) {
            z = enterDepositScheduleAmountViewState.showDepositFrequencyButton;
        }
        if ((i & 4) != 0) {
            z2 = enterDepositScheduleAmountViewState.isDepositFrequencyButtonClickable;
        }
        if ((i & 8) != 0) {
            depositScheduleFlowArgs = enterDepositScheduleAmountViewState.config;
        }
        return enterDepositScheduleAmountViewState.copy(achRelationship, z, z2, depositScheduleFlowArgs);
    }

    /* renamed from: component1, reason: from getter */
    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowDepositFrequencyButton() {
        return this.showDepositFrequencyButton;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDepositFrequencyButtonClickable() {
        return this.isDepositFrequencyButtonClickable;
    }

    public final EnterDepositScheduleAmountViewState copy(AchRelationship achRelationship, boolean showDepositFrequencyButton, boolean isDepositFrequencyButtonClickable, DepositScheduleFlowArgs config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new EnterDepositScheduleAmountViewState(achRelationship, showDepositFrequencyButton, isDepositFrequencyButtonClickable, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterDepositScheduleAmountViewState)) {
            return false;
        }
        EnterDepositScheduleAmountViewState enterDepositScheduleAmountViewState = (EnterDepositScheduleAmountViewState) other;
        return Intrinsics.areEqual(this.achRelationship, enterDepositScheduleAmountViewState.achRelationship) && this.showDepositFrequencyButton == enterDepositScheduleAmountViewState.showDepositFrequencyButton && this.isDepositFrequencyButtonClickable == enterDepositScheduleAmountViewState.isDepositFrequencyButtonClickable && Intrinsics.areEqual(this.config, enterDepositScheduleAmountViewState.config);
    }

    public int hashCode() {
        AchRelationship achRelationship = this.achRelationship;
        return ((((((achRelationship == null ? 0 : achRelationship.hashCode()) * 31) + Boolean.hashCode(this.showDepositFrequencyButton)) * 31) + Boolean.hashCode(this.isDepositFrequencyButtonClickable)) * 31) + this.config.hashCode();
    }

    public String toString() {
        return "EnterDepositScheduleAmountViewState(achRelationship=" + this.achRelationship + ", showDepositFrequencyButton=" + this.showDepositFrequencyButton + ", isDepositFrequencyButtonClickable=" + this.isDepositFrequencyButtonClickable + ", config=" + this.config + ")";
    }

    public EnterDepositScheduleAmountViewState(AchRelationship achRelationship, boolean z, boolean z2, DepositScheduleFlowArgs config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.achRelationship = achRelationship;
        this.showDepositFrequencyButton = z;
        this.isDepositFrequencyButtonClickable = z2;
        this.config = config;
        this.depositScheduleDescriptionTextValue = AchTransferStringHelper.INSTANCE.getDepositScheduleDescription(config.getFrequency(), config.getStartDate());
    }

    public /* synthetic */ EnterDepositScheduleAmountViewState(AchRelationship achRelationship, boolean z, boolean z2, DepositScheduleFlowArgs depositScheduleFlowArgs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : achRelationship, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, depositScheduleFlowArgs);
    }

    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public final boolean getShowDepositFrequencyButton() {
        return this.showDepositFrequencyButton;
    }

    public final boolean isDepositFrequencyButtonClickable() {
        return this.isDepositFrequencyButtonClickable;
    }

    public final StringResource getDepositScheduleDescriptionTextValue() {
        return this.depositScheduleDescriptionTextValue;
    }

    public final String getTransferAccountLabelText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return AchTransferStringHelper.getTransferAccountLabel(resources, TransferDirection.DEPOSIT);
    }

    public final String getAchRelationshipDisplayText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        AchRelationship achRelationship = this.achRelationship;
        if (achRelationship != null) {
            return AchRelationships.getAchRelationshipDisplayName(achRelationship, resources);
        }
        return null;
    }
}
