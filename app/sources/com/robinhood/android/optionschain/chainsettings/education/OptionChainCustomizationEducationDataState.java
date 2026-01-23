package com.robinhood.android.optionschain.chainsettings.education;

import com.robinhood.android.options.contracts.OptionChainCustomizationEducationLaunchMode;
import com.robinhood.models.p320db.OptionChainCustomizationEducation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainCustomizationEducationDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationDataState;", "", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;", "selectedCategoryIndex", "", "customizationEducation", "Lcom/robinhood/models/db/OptionChainCustomizationEducation;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionChainCustomizationEducation;)V", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;", "getSelectedCategoryIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCustomizationEducation", "()Lcom/robinhood/models/db/OptionChainCustomizationEducation;", "component1", "component2", "component3", "copy", "(Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionChainCustomizationEducation;)Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationDataState;", "equals", "", "other", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainCustomizationEducationDataState {
    public static final int $stable = 8;
    private final OptionChainCustomizationEducation customizationEducation;
    private final OptionChainCustomizationEducationLaunchMode launchMode;
    private final Integer selectedCategoryIndex;

    public static /* synthetic */ OptionChainCustomizationEducationDataState copy$default(OptionChainCustomizationEducationDataState optionChainCustomizationEducationDataState, OptionChainCustomizationEducationLaunchMode optionChainCustomizationEducationLaunchMode, Integer num, OptionChainCustomizationEducation optionChainCustomizationEducation, int i, Object obj) {
        if ((i & 1) != 0) {
            optionChainCustomizationEducationLaunchMode = optionChainCustomizationEducationDataState.launchMode;
        }
        if ((i & 2) != 0) {
            num = optionChainCustomizationEducationDataState.selectedCategoryIndex;
        }
        if ((i & 4) != 0) {
            optionChainCustomizationEducation = optionChainCustomizationEducationDataState.customizationEducation;
        }
        return optionChainCustomizationEducationDataState.copy(optionChainCustomizationEducationLaunchMode, num, optionChainCustomizationEducation);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionChainCustomizationEducationLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionChainCustomizationEducation getCustomizationEducation() {
        return this.customizationEducation;
    }

    public final OptionChainCustomizationEducationDataState copy(OptionChainCustomizationEducationLaunchMode launchMode, Integer selectedCategoryIndex, OptionChainCustomizationEducation customizationEducation) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        return new OptionChainCustomizationEducationDataState(launchMode, selectedCategoryIndex, customizationEducation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainCustomizationEducationDataState)) {
            return false;
        }
        OptionChainCustomizationEducationDataState optionChainCustomizationEducationDataState = (OptionChainCustomizationEducationDataState) other;
        return Intrinsics.areEqual(this.launchMode, optionChainCustomizationEducationDataState.launchMode) && Intrinsics.areEqual(this.selectedCategoryIndex, optionChainCustomizationEducationDataState.selectedCategoryIndex) && Intrinsics.areEqual(this.customizationEducation, optionChainCustomizationEducationDataState.customizationEducation);
    }

    public int hashCode() {
        int iHashCode = this.launchMode.hashCode() * 31;
        Integer num = this.selectedCategoryIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        OptionChainCustomizationEducation optionChainCustomizationEducation = this.customizationEducation;
        return iHashCode2 + (optionChainCustomizationEducation != null ? optionChainCustomizationEducation.hashCode() : 0);
    }

    public String toString() {
        return "OptionChainCustomizationEducationDataState(launchMode=" + this.launchMode + ", selectedCategoryIndex=" + this.selectedCategoryIndex + ", customizationEducation=" + this.customizationEducation + ")";
    }

    public OptionChainCustomizationEducationDataState(OptionChainCustomizationEducationLaunchMode launchMode, Integer num, OptionChainCustomizationEducation optionChainCustomizationEducation) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.launchMode = launchMode;
        this.selectedCategoryIndex = num;
        this.customizationEducation = optionChainCustomizationEducation;
    }

    public /* synthetic */ OptionChainCustomizationEducationDataState(OptionChainCustomizationEducationLaunchMode optionChainCustomizationEducationLaunchMode, Integer num, OptionChainCustomizationEducation optionChainCustomizationEducation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(optionChainCustomizationEducationLaunchMode, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : optionChainCustomizationEducation);
    }

    public final OptionChainCustomizationEducationLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final Integer getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    public final OptionChainCustomizationEducation getCustomizationEducation() {
        return this.customizationEducation;
    }
}
