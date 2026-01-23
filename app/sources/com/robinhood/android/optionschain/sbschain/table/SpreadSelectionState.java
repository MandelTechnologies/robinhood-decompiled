package com.robinhood.android.optionschain.sbschain.table;

import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundleWithRowIndex;
import com.robinhood.models.p320db.OptionContractType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionSideBySideChainTableViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003JA\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "", "callRowIndexRange", "Lkotlin/ranges/IntRange;", "putRowIndexRange", "callLegsWithRowIndex", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundleWithRowIndex;", "putLegsWithRowIndex", "<init>", "(Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getRowIndexRange", "contractType", "Lcom/robinhood/models/db/OptionContractType;", "getLegsWithRowIndex", "hasSpreadSelected", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SpreadSelectionState {
    public static final int $stable = 8;
    private final ImmutableList<OptionLegBundleWithRowIndex> callLegsWithRowIndex;
    private final PrimitiveRanges2 callRowIndexRange;
    private final ImmutableList<OptionLegBundleWithRowIndex> putLegsWithRowIndex;
    private final PrimitiveRanges2 putRowIndexRange;

    /* compiled from: OptionSideBySideChainTableViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final PrimitiveRanges2 getCallRowIndexRange() {
        return this.callRowIndexRange;
    }

    /* renamed from: component2, reason: from getter */
    private final PrimitiveRanges2 getPutRowIndexRange() {
        return this.putRowIndexRange;
    }

    private final ImmutableList<OptionLegBundleWithRowIndex> component3() {
        return this.callLegsWithRowIndex;
    }

    private final ImmutableList<OptionLegBundleWithRowIndex> component4() {
        return this.putLegsWithRowIndex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpreadSelectionState copy$default(SpreadSelectionState spreadSelectionState, PrimitiveRanges2 primitiveRanges2, PrimitiveRanges2 primitiveRanges22, ImmutableList immutableList, ImmutableList immutableList2, int i, Object obj) {
        if ((i & 1) != 0) {
            primitiveRanges2 = spreadSelectionState.callRowIndexRange;
        }
        if ((i & 2) != 0) {
            primitiveRanges22 = spreadSelectionState.putRowIndexRange;
        }
        if ((i & 4) != 0) {
            immutableList = spreadSelectionState.callLegsWithRowIndex;
        }
        if ((i & 8) != 0) {
            immutableList2 = spreadSelectionState.putLegsWithRowIndex;
        }
        return spreadSelectionState.copy(primitiveRanges2, primitiveRanges22, immutableList, immutableList2);
    }

    public final SpreadSelectionState copy(PrimitiveRanges2 callRowIndexRange, PrimitiveRanges2 putRowIndexRange, ImmutableList<OptionLegBundleWithRowIndex> callLegsWithRowIndex, ImmutableList<OptionLegBundleWithRowIndex> putLegsWithRowIndex) {
        Intrinsics.checkNotNullParameter(callLegsWithRowIndex, "callLegsWithRowIndex");
        Intrinsics.checkNotNullParameter(putLegsWithRowIndex, "putLegsWithRowIndex");
        return new SpreadSelectionState(callRowIndexRange, putRowIndexRange, callLegsWithRowIndex, putLegsWithRowIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpreadSelectionState)) {
            return false;
        }
        SpreadSelectionState spreadSelectionState = (SpreadSelectionState) other;
        return Intrinsics.areEqual(this.callRowIndexRange, spreadSelectionState.callRowIndexRange) && Intrinsics.areEqual(this.putRowIndexRange, spreadSelectionState.putRowIndexRange) && Intrinsics.areEqual(this.callLegsWithRowIndex, spreadSelectionState.callLegsWithRowIndex) && Intrinsics.areEqual(this.putLegsWithRowIndex, spreadSelectionState.putLegsWithRowIndex);
    }

    public int hashCode() {
        PrimitiveRanges2 primitiveRanges2 = this.callRowIndexRange;
        int iHashCode = (primitiveRanges2 == null ? 0 : primitiveRanges2.hashCode()) * 31;
        PrimitiveRanges2 primitiveRanges22 = this.putRowIndexRange;
        return ((((iHashCode + (primitiveRanges22 != null ? primitiveRanges22.hashCode() : 0)) * 31) + this.callLegsWithRowIndex.hashCode()) * 31) + this.putLegsWithRowIndex.hashCode();
    }

    public String toString() {
        return "SpreadSelectionState(callRowIndexRange=" + this.callRowIndexRange + ", putRowIndexRange=" + this.putRowIndexRange + ", callLegsWithRowIndex=" + this.callLegsWithRowIndex + ", putLegsWithRowIndex=" + this.putLegsWithRowIndex + ")";
    }

    public SpreadSelectionState(PrimitiveRanges2 primitiveRanges2, PrimitiveRanges2 primitiveRanges22, ImmutableList<OptionLegBundleWithRowIndex> callLegsWithRowIndex, ImmutableList<OptionLegBundleWithRowIndex> putLegsWithRowIndex) {
        Intrinsics.checkNotNullParameter(callLegsWithRowIndex, "callLegsWithRowIndex");
        Intrinsics.checkNotNullParameter(putLegsWithRowIndex, "putLegsWithRowIndex");
        this.callRowIndexRange = primitiveRanges2;
        this.putRowIndexRange = primitiveRanges22;
        this.callLegsWithRowIndex = callLegsWithRowIndex;
        this.putLegsWithRowIndex = putLegsWithRowIndex;
    }

    public final PrimitiveRanges2 getRowIndexRange(OptionContractType contractType) {
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        int i = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
        if (i == 1) {
            return this.callRowIndexRange;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.putRowIndexRange;
    }

    public final ImmutableList<OptionLegBundleWithRowIndex> getLegsWithRowIndex(OptionContractType contractType) {
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        int i = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
        if (i == 1) {
            return this.callLegsWithRowIndex;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.putLegsWithRowIndex;
    }

    public final boolean hasSpreadSelected() {
        return (this.callRowIndexRange == null && this.putRowIndexRange == null) ? false : true;
    }
}
