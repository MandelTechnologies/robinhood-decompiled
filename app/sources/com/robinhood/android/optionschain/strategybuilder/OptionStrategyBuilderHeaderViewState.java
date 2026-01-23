package com.robinhood.android.optionschain.strategybuilder;

import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionChains;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionStrategyBuilderHeaderDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderHeaderViewState;", "", "uiOptionChains", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionChain;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/indexes/models/db/IndexValue;)V", "getUiOptionChains", "()Lkotlinx/collections/immutable/ImmutableList;", "getIndexValue", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "apiIndexValueDetailRequest", "Lcom/robinhood/android/indexes/models/api/ApiIndexValueDetailRequest$ApiIndexValueRequestById;", "getApiIndexValueDetailRequest", "()Lcom/robinhood/android/indexes/models/api/ApiIndexValueDetailRequest$ApiIndexValueRequestById;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionStrategyBuilderHeaderViewState {
    public static final int $stable = 8;
    private final IndexValue indexValue;
    private final ImmutableList<UiOptionChain> uiOptionChains;

    /* JADX WARN: Multi-variable type inference failed */
    public OptionStrategyBuilderHeaderViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionStrategyBuilderHeaderViewState copy$default(OptionStrategyBuilderHeaderViewState optionStrategyBuilderHeaderViewState, ImmutableList immutableList, IndexValue indexValue, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = optionStrategyBuilderHeaderViewState.uiOptionChains;
        }
        if ((i & 2) != 0) {
            indexValue = optionStrategyBuilderHeaderViewState.indexValue;
        }
        return optionStrategyBuilderHeaderViewState.copy(immutableList, indexValue);
    }

    public final ImmutableList<UiOptionChain> component1() {
        return this.uiOptionChains;
    }

    /* renamed from: component2, reason: from getter */
    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    public final OptionStrategyBuilderHeaderViewState copy(ImmutableList<UiOptionChain> uiOptionChains, IndexValue indexValue) {
        return new OptionStrategyBuilderHeaderViewState(uiOptionChains, indexValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionStrategyBuilderHeaderViewState)) {
            return false;
        }
        OptionStrategyBuilderHeaderViewState optionStrategyBuilderHeaderViewState = (OptionStrategyBuilderHeaderViewState) other;
        return Intrinsics.areEqual(this.uiOptionChains, optionStrategyBuilderHeaderViewState.uiOptionChains) && Intrinsics.areEqual(this.indexValue, optionStrategyBuilderHeaderViewState.indexValue);
    }

    public int hashCode() {
        ImmutableList<UiOptionChain> immutableList = this.uiOptionChains;
        int iHashCode = (immutableList == null ? 0 : immutableList.hashCode()) * 31;
        IndexValue indexValue = this.indexValue;
        return iHashCode + (indexValue != null ? indexValue.hashCode() : 0);
    }

    public String toString() {
        return "OptionStrategyBuilderHeaderViewState(uiOptionChains=" + this.uiOptionChains + ", indexValue=" + this.indexValue + ")";
    }

    public OptionStrategyBuilderHeaderViewState(ImmutableList<UiOptionChain> immutableList, IndexValue indexValue) {
        this.uiOptionChains = immutableList;
        this.indexValue = indexValue;
    }

    public /* synthetic */ OptionStrategyBuilderHeaderViewState(ImmutableList immutableList, IndexValue indexValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : immutableList, (i & 2) != 0 ? null : indexValue);
    }

    public final ImmutableList<UiOptionChain> getUiOptionChains() {
        return this.uiOptionChains;
    }

    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    public final ApiIndexValueDetailRequest.ApiIndexValueRequestById getApiIndexValueDetailRequest() {
        ImmutableList<UiOptionChain> immutableList;
        UUID indexUnderlyingId;
        ImmutableList<UiOptionChain> immutableList2 = this.uiOptionChains;
        if ((immutableList2 != null ? UiOptionChains.getUnderlyingType(immutableList2) : null) == OptionChain.UnderlyingType.EQUITY || (immutableList = this.uiOptionChains) == null || (indexUnderlyingId = UiOptionChains.getIndexUnderlyingId(immutableList)) == null) {
            return null;
        }
        return new ApiIndexValueDetailRequest.ApiIndexValueRequestById(indexUnderlyingId);
    }
}
