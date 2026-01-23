package com.robinhood.android.event.gamedetail.components;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ContractRowHeader.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ContractRowHeaderState;", "", "primaryEntityTitle", "", "contractOptionTitles", "Lkotlinx/collections/immutable/ImmutableList;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getPrimaryEntityTitle", "()Ljava/lang/String;", "getContractOptionTitles", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContractRowHeaderState {
    public static final int $stable = 0;
    private final ImmutableList<String> contractOptionTitles;
    private final String primaryEntityTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContractRowHeaderState copy$default(ContractRowHeaderState contractRowHeaderState, String str, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractRowHeaderState.primaryEntityTitle;
        }
        if ((i & 2) != 0) {
            immutableList = contractRowHeaderState.contractOptionTitles;
        }
        return contractRowHeaderState.copy(str, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrimaryEntityTitle() {
        return this.primaryEntityTitle;
    }

    public final ImmutableList<String> component2() {
        return this.contractOptionTitles;
    }

    public final ContractRowHeaderState copy(String primaryEntityTitle, ImmutableList<String> contractOptionTitles) {
        Intrinsics.checkNotNullParameter(primaryEntityTitle, "primaryEntityTitle");
        Intrinsics.checkNotNullParameter(contractOptionTitles, "contractOptionTitles");
        return new ContractRowHeaderState(primaryEntityTitle, contractOptionTitles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractRowHeaderState)) {
            return false;
        }
        ContractRowHeaderState contractRowHeaderState = (ContractRowHeaderState) other;
        return Intrinsics.areEqual(this.primaryEntityTitle, contractRowHeaderState.primaryEntityTitle) && Intrinsics.areEqual(this.contractOptionTitles, contractRowHeaderState.contractOptionTitles);
    }

    public int hashCode() {
        return (this.primaryEntityTitle.hashCode() * 31) + this.contractOptionTitles.hashCode();
    }

    public String toString() {
        return "ContractRowHeaderState(primaryEntityTitle=" + this.primaryEntityTitle + ", contractOptionTitles=" + this.contractOptionTitles + ")";
    }

    public ContractRowHeaderState(String primaryEntityTitle, ImmutableList<String> contractOptionTitles) {
        Intrinsics.checkNotNullParameter(primaryEntityTitle, "primaryEntityTitle");
        Intrinsics.checkNotNullParameter(contractOptionTitles, "contractOptionTitles");
        this.primaryEntityTitle = primaryEntityTitle;
        this.contractOptionTitles = contractOptionTitles;
    }

    public final String getPrimaryEntityTitle() {
        return this.primaryEntityTitle;
    }

    public final ImmutableList<String> getContractOptionTitles() {
        return this.contractOptionTitles;
    }
}
