package com.robinhood.android.optionschain.sbschain.table.gestures;

import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DragTarget.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B'\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "", "dragStartRowIndex", "", "xOffset", "legBundlesWithRowIndex", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundleWithRowIndex;", "<init>", "(IILkotlinx/collections/immutable/ImmutableList;)V", "getDragStartRowIndex", "()I", "getXOffset", "getLegBundlesWithRowIndex", "()Lkotlinx/collections/immutable/ImmutableList;", "getContractType", "Lcom/robinhood/models/db/OptionContractType;", "OptionLegDragTarget", "OptionSpreadDragTarget", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget$OptionLegDragTarget;", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget$OptionSpreadDragTarget;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class DragTarget {
    public static final int $stable = 8;
    private final int dragStartRowIndex;
    private final ImmutableList<OptionLegBundleWithRowIndex> legBundlesWithRowIndex;
    private final int xOffset;

    public /* synthetic */ DragTarget(int i, int i2, ImmutableList immutableList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, immutableList);
    }

    private DragTarget(int i, int i2, ImmutableList<OptionLegBundleWithRowIndex> immutableList) {
        this.dragStartRowIndex = i;
        this.xOffset = i2;
        this.legBundlesWithRowIndex = immutableList;
    }

    public int getDragStartRowIndex() {
        return this.dragStartRowIndex;
    }

    public int getXOffset() {
        return this.xOffset;
    }

    public ImmutableList<OptionLegBundleWithRowIndex> getLegBundlesWithRowIndex() {
        return this.legBundlesWithRowIndex;
    }

    public final OptionContractType getContractType() {
        OptionLegBundle legBundle;
        OptionConfigurationBundle optionConfigurationBundle;
        OptionLegBundleWithRowIndex optionLegBundleWithRowIndex = (OptionLegBundleWithRowIndex) CollectionsKt.firstOrNull((List) getLegBundlesWithRowIndex());
        if (optionLegBundleWithRowIndex == null || (legBundle = optionLegBundleWithRowIndex.getLegBundle()) == null || (optionConfigurationBundle = legBundle.getOptionConfigurationBundle()) == null) {
            return null;
        }
        return optionConfigurationBundle.getOptionContractType();
    }

    /* compiled from: DragTarget.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget$OptionLegDragTarget;", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "dragStartRowIndex", "", "xOffset", "legBundlesWithRowIndex", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundleWithRowIndex;", "<init>", "(IILkotlinx/collections/immutable/ImmutableList;)V", "getDragStartRowIndex", "()I", "getXOffset", "getLegBundlesWithRowIndex", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionLegDragTarget extends DragTarget {
        public static final int $stable = 8;
        private final int dragStartRowIndex;
        private final ImmutableList<OptionLegBundleWithRowIndex> legBundlesWithRowIndex;
        private final int xOffset;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OptionLegDragTarget copy$default(OptionLegDragTarget optionLegDragTarget, int i, int i2, ImmutableList immutableList, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = optionLegDragTarget.dragStartRowIndex;
            }
            if ((i3 & 2) != 0) {
                i2 = optionLegDragTarget.xOffset;
            }
            if ((i3 & 4) != 0) {
                immutableList = optionLegDragTarget.legBundlesWithRowIndex;
            }
            return optionLegDragTarget.copy(i, i2, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDragStartRowIndex() {
            return this.dragStartRowIndex;
        }

        /* renamed from: component2, reason: from getter */
        public final int getXOffset() {
            return this.xOffset;
        }

        public final ImmutableList<OptionLegBundleWithRowIndex> component3() {
            return this.legBundlesWithRowIndex;
        }

        public final OptionLegDragTarget copy(int dragStartRowIndex, int xOffset, ImmutableList<OptionLegBundleWithRowIndex> legBundlesWithRowIndex) {
            Intrinsics.checkNotNullParameter(legBundlesWithRowIndex, "legBundlesWithRowIndex");
            return new OptionLegDragTarget(dragStartRowIndex, xOffset, legBundlesWithRowIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionLegDragTarget)) {
                return false;
            }
            OptionLegDragTarget optionLegDragTarget = (OptionLegDragTarget) other;
            return this.dragStartRowIndex == optionLegDragTarget.dragStartRowIndex && this.xOffset == optionLegDragTarget.xOffset && Intrinsics.areEqual(this.legBundlesWithRowIndex, optionLegDragTarget.legBundlesWithRowIndex);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.dragStartRowIndex) * 31) + Integer.hashCode(this.xOffset)) * 31) + this.legBundlesWithRowIndex.hashCode();
        }

        public String toString() {
            return "OptionLegDragTarget(dragStartRowIndex=" + this.dragStartRowIndex + ", xOffset=" + this.xOffset + ", legBundlesWithRowIndex=" + this.legBundlesWithRowIndex + ")";
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget
        public int getDragStartRowIndex() {
            return this.dragStartRowIndex;
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget
        public int getXOffset() {
            return this.xOffset;
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget
        public ImmutableList<OptionLegBundleWithRowIndex> getLegBundlesWithRowIndex() {
            return this.legBundlesWithRowIndex;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionLegDragTarget(int i, int i2, ImmutableList<OptionLegBundleWithRowIndex> legBundlesWithRowIndex) {
            super(i, i2, legBundlesWithRowIndex, null);
            Intrinsics.checkNotNullParameter(legBundlesWithRowIndex, "legBundlesWithRowIndex");
            this.dragStartRowIndex = i;
            this.xOffset = i2;
            this.legBundlesWithRowIndex = legBundlesWithRowIndex;
        }
    }

    /* compiled from: DragTarget.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget$OptionSpreadDragTarget;", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "dragStartRowIndex", "", "xOffset", "legBundlesWithRowIndex", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundleWithRowIndex;", "<init>", "(IILkotlinx/collections/immutable/ImmutableList;)V", "getDragStartRowIndex", "()I", "getXOffset", "getLegBundlesWithRowIndex", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionSpreadDragTarget extends DragTarget {
        public static final int $stable = 8;
        private final int dragStartRowIndex;
        private final ImmutableList<OptionLegBundleWithRowIndex> legBundlesWithRowIndex;
        private final int xOffset;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OptionSpreadDragTarget copy$default(OptionSpreadDragTarget optionSpreadDragTarget, int i, int i2, ImmutableList immutableList, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = optionSpreadDragTarget.dragStartRowIndex;
            }
            if ((i3 & 2) != 0) {
                i2 = optionSpreadDragTarget.xOffset;
            }
            if ((i3 & 4) != 0) {
                immutableList = optionSpreadDragTarget.legBundlesWithRowIndex;
            }
            return optionSpreadDragTarget.copy(i, i2, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDragStartRowIndex() {
            return this.dragStartRowIndex;
        }

        /* renamed from: component2, reason: from getter */
        public final int getXOffset() {
            return this.xOffset;
        }

        public final ImmutableList<OptionLegBundleWithRowIndex> component3() {
            return this.legBundlesWithRowIndex;
        }

        public final OptionSpreadDragTarget copy(int dragStartRowIndex, int xOffset, ImmutableList<OptionLegBundleWithRowIndex> legBundlesWithRowIndex) {
            Intrinsics.checkNotNullParameter(legBundlesWithRowIndex, "legBundlesWithRowIndex");
            return new OptionSpreadDragTarget(dragStartRowIndex, xOffset, legBundlesWithRowIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionSpreadDragTarget)) {
                return false;
            }
            OptionSpreadDragTarget optionSpreadDragTarget = (OptionSpreadDragTarget) other;
            return this.dragStartRowIndex == optionSpreadDragTarget.dragStartRowIndex && this.xOffset == optionSpreadDragTarget.xOffset && Intrinsics.areEqual(this.legBundlesWithRowIndex, optionSpreadDragTarget.legBundlesWithRowIndex);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.dragStartRowIndex) * 31) + Integer.hashCode(this.xOffset)) * 31) + this.legBundlesWithRowIndex.hashCode();
        }

        public String toString() {
            return "OptionSpreadDragTarget(dragStartRowIndex=" + this.dragStartRowIndex + ", xOffset=" + this.xOffset + ", legBundlesWithRowIndex=" + this.legBundlesWithRowIndex + ")";
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget
        public int getDragStartRowIndex() {
            return this.dragStartRowIndex;
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget
        public int getXOffset() {
            return this.xOffset;
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget
        public ImmutableList<OptionLegBundleWithRowIndex> getLegBundlesWithRowIndex() {
            return this.legBundlesWithRowIndex;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionSpreadDragTarget(int i, int i2, ImmutableList<OptionLegBundleWithRowIndex> legBundlesWithRowIndex) {
            super(i, i2, legBundlesWithRowIndex, null);
            Intrinsics.checkNotNullParameter(legBundlesWithRowIndex, "legBundlesWithRowIndex");
            this.dragStartRowIndex = i;
            this.xOffset = i2;
            this.legBundlesWithRowIndex = legBundlesWithRowIndex;
        }
    }
}
