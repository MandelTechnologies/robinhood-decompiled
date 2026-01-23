package com.robinhood.android.optionschain.sbschain.table.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionLegBundlesToReplace.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundlesToReplace;", "", "legBundlesToAdd", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundleWithRowIndex;", "legBundlesToRemove", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getLegBundlesToAdd", "()Lkotlinx/collections/immutable/ImmutableList;", "getLegBundlesToRemove", "shouldPerformReplace", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionLegBundlesToReplace {
    private final ImmutableList<OptionLegBundleWithRowIndex> legBundlesToAdd;
    private final ImmutableList<OptionLegBundleWithRowIndex> legBundlesToRemove;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final OptionLegBundlesToReplace EMPTY = new OptionLegBundlesToReplace(extensions2.persistentListOf(), extensions2.persistentListOf());

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionLegBundlesToReplace copy$default(OptionLegBundlesToReplace optionLegBundlesToReplace, ImmutableList immutableList, ImmutableList immutableList2, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = optionLegBundlesToReplace.legBundlesToAdd;
        }
        if ((i & 2) != 0) {
            immutableList2 = optionLegBundlesToReplace.legBundlesToRemove;
        }
        return optionLegBundlesToReplace.copy(immutableList, immutableList2);
    }

    public final ImmutableList<OptionLegBundleWithRowIndex> component1() {
        return this.legBundlesToAdd;
    }

    public final ImmutableList<OptionLegBundleWithRowIndex> component2() {
        return this.legBundlesToRemove;
    }

    public final OptionLegBundlesToReplace copy(ImmutableList<OptionLegBundleWithRowIndex> legBundlesToAdd, ImmutableList<OptionLegBundleWithRowIndex> legBundlesToRemove) {
        Intrinsics.checkNotNullParameter(legBundlesToAdd, "legBundlesToAdd");
        Intrinsics.checkNotNullParameter(legBundlesToRemove, "legBundlesToRemove");
        return new OptionLegBundlesToReplace(legBundlesToAdd, legBundlesToRemove);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionLegBundlesToReplace)) {
            return false;
        }
        OptionLegBundlesToReplace optionLegBundlesToReplace = (OptionLegBundlesToReplace) other;
        return Intrinsics.areEqual(this.legBundlesToAdd, optionLegBundlesToReplace.legBundlesToAdd) && Intrinsics.areEqual(this.legBundlesToRemove, optionLegBundlesToReplace.legBundlesToRemove);
    }

    public int hashCode() {
        return (this.legBundlesToAdd.hashCode() * 31) + this.legBundlesToRemove.hashCode();
    }

    public String toString() {
        return "OptionLegBundlesToReplace(legBundlesToAdd=" + this.legBundlesToAdd + ", legBundlesToRemove=" + this.legBundlesToRemove + ")";
    }

    public OptionLegBundlesToReplace(ImmutableList<OptionLegBundleWithRowIndex> legBundlesToAdd, ImmutableList<OptionLegBundleWithRowIndex> legBundlesToRemove) {
        Intrinsics.checkNotNullParameter(legBundlesToAdd, "legBundlesToAdd");
        Intrinsics.checkNotNullParameter(legBundlesToRemove, "legBundlesToRemove");
        this.legBundlesToAdd = legBundlesToAdd;
        this.legBundlesToRemove = legBundlesToRemove;
    }

    public final ImmutableList<OptionLegBundleWithRowIndex> getLegBundlesToAdd() {
        return this.legBundlesToAdd;
    }

    public final ImmutableList<OptionLegBundleWithRowIndex> getLegBundlesToRemove() {
        return this.legBundlesToRemove;
    }

    public final boolean shouldPerformReplace() {
        return (this.legBundlesToAdd.isEmpty() && this.legBundlesToRemove.isEmpty()) ? false : true;
    }

    /* compiled from: OptionLegBundlesToReplace.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundlesToReplace$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundlesToReplace;", "getEMPTY", "()Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundlesToReplace;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionLegBundlesToReplace getEMPTY() {
            return OptionLegBundlesToReplace.EMPTY;
        }
    }
}
