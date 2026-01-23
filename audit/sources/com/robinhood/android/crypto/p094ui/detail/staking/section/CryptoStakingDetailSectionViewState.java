package com.robinhood.android.crypto.p094ui.detail.staking.section;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoStakingDetailSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/staking/section/CryptoStakingDetailSectionViewState;", "", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoStakingDetailSectionViewState {
    public static final int $stable = 8;
    private final ImmutableList<UIComponent<GenericAction>> components;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoStakingDetailSectionViewState copy$default(CryptoStakingDetailSectionViewState cryptoStakingDetailSectionViewState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = cryptoStakingDetailSectionViewState.components;
        }
        return cryptoStakingDetailSectionViewState.copy(immutableList);
    }

    public final ImmutableList<UIComponent<GenericAction>> component1() {
        return this.components;
    }

    public final CryptoStakingDetailSectionViewState copy(ImmutableList<? extends UIComponent<? extends GenericAction>> components) {
        Intrinsics.checkNotNullParameter(components, "components");
        return new CryptoStakingDetailSectionViewState(components);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoStakingDetailSectionViewState) && Intrinsics.areEqual(this.components, ((CryptoStakingDetailSectionViewState) other).components);
    }

    public int hashCode() {
        return this.components.hashCode();
    }

    public String toString() {
        return "CryptoStakingDetailSectionViewState(components=" + this.components + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoStakingDetailSectionViewState(ImmutableList<? extends UIComponent<? extends GenericAction>> components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.components = components;
    }

    public final ImmutableList<UIComponent<GenericAction>> getComponents() {
        return this.components;
    }
}
