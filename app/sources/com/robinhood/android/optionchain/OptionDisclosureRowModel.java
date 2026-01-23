package com.robinhood.android.optionchain;

import kotlin.Metadata;

/* compiled from: OptionChainDisclosureView.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/optionchain/OptionDisclosureRowModel;", "", "isOnboardingDisclosure", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OptionDisclosureRowModel {
    public static final int $stable = 0;
    private final boolean isOnboardingDisclosure;

    public static /* synthetic */ OptionDisclosureRowModel copy$default(OptionDisclosureRowModel optionDisclosureRowModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = optionDisclosureRowModel.isOnboardingDisclosure;
        }
        return optionDisclosureRowModel.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsOnboardingDisclosure() {
        return this.isOnboardingDisclosure;
    }

    public final OptionDisclosureRowModel copy(boolean isOnboardingDisclosure) {
        return new OptionDisclosureRowModel(isOnboardingDisclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OptionDisclosureRowModel) && this.isOnboardingDisclosure == ((OptionDisclosureRowModel) other).isOnboardingDisclosure;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOnboardingDisclosure);
    }

    public String toString() {
        return "OptionDisclosureRowModel(isOnboardingDisclosure=" + this.isOnboardingDisclosure + ")";
    }

    public OptionDisclosureRowModel(boolean z) {
        this.isOnboardingDisclosure = z;
    }

    public final boolean isOnboardingDisclosure() {
        return this.isOnboardingDisclosure;
    }
}
