package com.robinhood.android.optionschain.chainsettings.education;

import com.robinhood.android.options.contracts.OptionChainCustomizationEducationLaunchMode;
import com.robinhood.models.p320db.EducationItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionChainCustomizationEducationViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003JD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationViewState;", "", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;", "selectedCategoryIndex", "", "educationCategories", "Lkotlinx/collections/immutable/ImmutableList;", "", "educationItems", "Lcom/robinhood/models/db/EducationItem;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;Ljava/lang/Integer;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;", "getSelectedCategoryIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEducationCategories", "()Lkotlinx/collections/immutable/ImmutableList;", "getEducationItems", "component1", "component2", "component3", "component4", "copy", "(Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;Ljava/lang/Integer;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationViewState;", "equals", "", "other", "hashCode", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainCustomizationEducationViewState {
    public static final int $stable = 8;
    private final ImmutableList<String> educationCategories;
    private final ImmutableList<EducationItem> educationItems;
    private final OptionChainCustomizationEducationLaunchMode launchMode;
    private final Integer selectedCategoryIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionChainCustomizationEducationViewState copy$default(OptionChainCustomizationEducationViewState optionChainCustomizationEducationViewState, OptionChainCustomizationEducationLaunchMode optionChainCustomizationEducationLaunchMode, Integer num, ImmutableList immutableList, ImmutableList immutableList2, int i, Object obj) {
        if ((i & 1) != 0) {
            optionChainCustomizationEducationLaunchMode = optionChainCustomizationEducationViewState.launchMode;
        }
        if ((i & 2) != 0) {
            num = optionChainCustomizationEducationViewState.selectedCategoryIndex;
        }
        if ((i & 4) != 0) {
            immutableList = optionChainCustomizationEducationViewState.educationCategories;
        }
        if ((i & 8) != 0) {
            immutableList2 = optionChainCustomizationEducationViewState.educationItems;
        }
        return optionChainCustomizationEducationViewState.copy(optionChainCustomizationEducationLaunchMode, num, immutableList, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionChainCustomizationEducationLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    public final ImmutableList<String> component3() {
        return this.educationCategories;
    }

    public final ImmutableList<EducationItem> component4() {
        return this.educationItems;
    }

    public final OptionChainCustomizationEducationViewState copy(OptionChainCustomizationEducationLaunchMode launchMode, Integer selectedCategoryIndex, ImmutableList<String> educationCategories, ImmutableList<EducationItem> educationItems) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(educationCategories, "educationCategories");
        Intrinsics.checkNotNullParameter(educationItems, "educationItems");
        return new OptionChainCustomizationEducationViewState(launchMode, selectedCategoryIndex, educationCategories, educationItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainCustomizationEducationViewState)) {
            return false;
        }
        OptionChainCustomizationEducationViewState optionChainCustomizationEducationViewState = (OptionChainCustomizationEducationViewState) other;
        return Intrinsics.areEqual(this.launchMode, optionChainCustomizationEducationViewState.launchMode) && Intrinsics.areEqual(this.selectedCategoryIndex, optionChainCustomizationEducationViewState.selectedCategoryIndex) && Intrinsics.areEqual(this.educationCategories, optionChainCustomizationEducationViewState.educationCategories) && Intrinsics.areEqual(this.educationItems, optionChainCustomizationEducationViewState.educationItems);
    }

    public int hashCode() {
        int iHashCode = this.launchMode.hashCode() * 31;
        Integer num = this.selectedCategoryIndex;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.educationCategories.hashCode()) * 31) + this.educationItems.hashCode();
    }

    public String toString() {
        return "OptionChainCustomizationEducationViewState(launchMode=" + this.launchMode + ", selectedCategoryIndex=" + this.selectedCategoryIndex + ", educationCategories=" + this.educationCategories + ", educationItems=" + this.educationItems + ")";
    }

    public OptionChainCustomizationEducationViewState(OptionChainCustomizationEducationLaunchMode launchMode, Integer num, ImmutableList<String> educationCategories, ImmutableList<EducationItem> educationItems) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(educationCategories, "educationCategories");
        Intrinsics.checkNotNullParameter(educationItems, "educationItems");
        this.launchMode = launchMode;
        this.selectedCategoryIndex = num;
        this.educationCategories = educationCategories;
        this.educationItems = educationItems;
    }

    public final OptionChainCustomizationEducationLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final Integer getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    public final ImmutableList<String> getEducationCategories() {
        return this.educationCategories;
    }

    public final ImmutableList<EducationItem> getEducationItems() {
        return this.educationItems;
    }
}
