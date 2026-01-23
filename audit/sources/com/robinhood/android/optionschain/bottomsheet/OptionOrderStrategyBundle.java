package com.robinhood.android.optionschain.bottomsheet;

import com.robinhood.models.api.ApiOptionOrderStrategies;
import com.robinhood.models.p355ui.OptionLegBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionChainBottomSheetDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionOrderStrategyBundle;", "", "legBundles", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/OptionLegBundle;", "optionOrderStrategies", "Lcom/robinhood/models/api/ApiOptionOrderStrategies;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/api/ApiOptionOrderStrategies;)V", "getLegBundles", "()Lkotlinx/collections/immutable/ImmutableList;", "getOptionOrderStrategies", "()Lcom/robinhood/models/api/ApiOptionOrderStrategies;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOrderStrategyBundle {
    public static final int $stable = 8;
    private final ImmutableList<OptionLegBundle> legBundles;
    private final ApiOptionOrderStrategies optionOrderStrategies;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionOrderStrategyBundle copy$default(OptionOrderStrategyBundle optionOrderStrategyBundle, ImmutableList immutableList, ApiOptionOrderStrategies apiOptionOrderStrategies, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = optionOrderStrategyBundle.legBundles;
        }
        if ((i & 2) != 0) {
            apiOptionOrderStrategies = optionOrderStrategyBundle.optionOrderStrategies;
        }
        return optionOrderStrategyBundle.copy(immutableList, apiOptionOrderStrategies);
    }

    public final ImmutableList<OptionLegBundle> component1() {
        return this.legBundles;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiOptionOrderStrategies getOptionOrderStrategies() {
        return this.optionOrderStrategies;
    }

    public final OptionOrderStrategyBundle copy(ImmutableList<OptionLegBundle> legBundles, ApiOptionOrderStrategies optionOrderStrategies) {
        Intrinsics.checkNotNullParameter(optionOrderStrategies, "optionOrderStrategies");
        return new OptionOrderStrategyBundle(legBundles, optionOrderStrategies);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderStrategyBundle)) {
            return false;
        }
        OptionOrderStrategyBundle optionOrderStrategyBundle = (OptionOrderStrategyBundle) other;
        return Intrinsics.areEqual(this.legBundles, optionOrderStrategyBundle.legBundles) && Intrinsics.areEqual(this.optionOrderStrategies, optionOrderStrategyBundle.optionOrderStrategies);
    }

    public int hashCode() {
        ImmutableList<OptionLegBundle> immutableList = this.legBundles;
        return ((immutableList == null ? 0 : immutableList.hashCode()) * 31) + this.optionOrderStrategies.hashCode();
    }

    public String toString() {
        return "OptionOrderStrategyBundle(legBundles=" + this.legBundles + ", optionOrderStrategies=" + this.optionOrderStrategies + ")";
    }

    public OptionOrderStrategyBundle(ImmutableList<OptionLegBundle> immutableList, ApiOptionOrderStrategies optionOrderStrategies) {
        Intrinsics.checkNotNullParameter(optionOrderStrategies, "optionOrderStrategies");
        this.legBundles = immutableList;
        this.optionOrderStrategies = optionOrderStrategies;
    }

    public final ImmutableList<OptionLegBundle> getLegBundles() {
        return this.legBundles;
    }

    public final ApiOptionOrderStrategies getOptionOrderStrategies() {
        return this.optionOrderStrategies;
    }
}
