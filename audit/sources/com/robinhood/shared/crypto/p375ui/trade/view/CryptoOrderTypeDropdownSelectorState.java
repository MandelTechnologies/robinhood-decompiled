package com.robinhood.shared.crypto.p375ui.trade.view;

import com.robinhood.models.api.CryptoOrderType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoOrderTypeDropdownSelector.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeDropdownSelectorState;", "", "types", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/CryptoOrderType;", "selectedType", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/api/CryptoOrderType;)V", "getTypes", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedType", "()Lcom/robinhood/models/api/CryptoOrderType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoOrderTypeDropdownSelectorState {
    public static final int $stable = 0;
    private final CryptoOrderType selectedType;
    private final ImmutableList<CryptoOrderType> types;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoOrderTypeDropdownSelectorState copy$default(CryptoOrderTypeDropdownSelectorState cryptoOrderTypeDropdownSelectorState, ImmutableList immutableList, CryptoOrderType cryptoOrderType, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = cryptoOrderTypeDropdownSelectorState.types;
        }
        if ((i & 2) != 0) {
            cryptoOrderType = cryptoOrderTypeDropdownSelectorState.selectedType;
        }
        return cryptoOrderTypeDropdownSelectorState.copy(immutableList, cryptoOrderType);
    }

    public final ImmutableList<CryptoOrderType> component1() {
        return this.types;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoOrderType getSelectedType() {
        return this.selectedType;
    }

    public final CryptoOrderTypeDropdownSelectorState copy(ImmutableList<? extends CryptoOrderType> types, CryptoOrderType selectedType) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        return new CryptoOrderTypeDropdownSelectorState(types, selectedType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderTypeDropdownSelectorState)) {
            return false;
        }
        CryptoOrderTypeDropdownSelectorState cryptoOrderTypeDropdownSelectorState = (CryptoOrderTypeDropdownSelectorState) other;
        return Intrinsics.areEqual(this.types, cryptoOrderTypeDropdownSelectorState.types) && this.selectedType == cryptoOrderTypeDropdownSelectorState.selectedType;
    }

    public int hashCode() {
        return (this.types.hashCode() * 31) + this.selectedType.hashCode();
    }

    public String toString() {
        return "CryptoOrderTypeDropdownSelectorState(types=" + this.types + ", selectedType=" + this.selectedType + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoOrderTypeDropdownSelectorState(ImmutableList<? extends CryptoOrderType> types, CryptoOrderType selectedType) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        this.types = types;
        this.selectedType = selectedType;
    }

    public final ImmutableList<CryptoOrderType> getTypes() {
        return this.types;
    }

    public final CryptoOrderType getSelectedType() {
        return this.selectedType;
    }
}
