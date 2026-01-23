package com.robinhood.shared.crypto.transfer.history;

import com.robinhood.models.serverdriven.experimental.api.HistoryDetailAction;
import com.robinhood.models.serverdriven.experimental.api.NavigationMenuTextButton;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoTransferHistoryDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/history/CryptoTransferHistoryViewState;", "", "isLoading", "", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/HistoryDetailAction;", "mobileMenuItem", "Lcom/robinhood/models/serverdriven/experimental/api/NavigationMenuTextButton;", "<init>", "(ZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/serverdriven/experimental/api/NavigationMenuTextButton;)V", "()Z", "getComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "getMobileMenuItem", "()Lcom/robinhood/models/serverdriven/experimental/api/NavigationMenuTextButton;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferHistoryViewState {
    public static final int $stable = 8;
    private final ImmutableList<UIComponent<HistoryDetailAction>> components;
    private final boolean isLoading;
    private final NavigationMenuTextButton<HistoryDetailAction> mobileMenuItem;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoTransferHistoryViewState copy$default(CryptoTransferHistoryViewState cryptoTransferHistoryViewState, boolean z, ImmutableList immutableList, NavigationMenuTextButton navigationMenuTextButton, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoTransferHistoryViewState.isLoading;
        }
        if ((i & 2) != 0) {
            immutableList = cryptoTransferHistoryViewState.components;
        }
        if ((i & 4) != 0) {
            navigationMenuTextButton = cryptoTransferHistoryViewState.mobileMenuItem;
        }
        return cryptoTransferHistoryViewState.copy(z, immutableList, navigationMenuTextButton);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ImmutableList<UIComponent<HistoryDetailAction>> component2() {
        return this.components;
    }

    public final NavigationMenuTextButton<HistoryDetailAction> component3() {
        return this.mobileMenuItem;
    }

    public final CryptoTransferHistoryViewState copy(boolean isLoading, ImmutableList<? extends UIComponent<? extends HistoryDetailAction>> components, NavigationMenuTextButton<? extends HistoryDetailAction> mobileMenuItem) {
        Intrinsics.checkNotNullParameter(components, "components");
        return new CryptoTransferHistoryViewState(isLoading, components, mobileMenuItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferHistoryViewState)) {
            return false;
        }
        CryptoTransferHistoryViewState cryptoTransferHistoryViewState = (CryptoTransferHistoryViewState) other;
        return this.isLoading == cryptoTransferHistoryViewState.isLoading && Intrinsics.areEqual(this.components, cryptoTransferHistoryViewState.components) && Intrinsics.areEqual(this.mobileMenuItem, cryptoTransferHistoryViewState.mobileMenuItem);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.components.hashCode()) * 31;
        NavigationMenuTextButton<HistoryDetailAction> navigationMenuTextButton = this.mobileMenuItem;
        return iHashCode + (navigationMenuTextButton == null ? 0 : navigationMenuTextButton.hashCode());
    }

    public String toString() {
        return "CryptoTransferHistoryViewState(isLoading=" + this.isLoading + ", components=" + this.components + ", mobileMenuItem=" + this.mobileMenuItem + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoTransferHistoryViewState(boolean z, ImmutableList<? extends UIComponent<? extends HistoryDetailAction>> components, NavigationMenuTextButton<? extends HistoryDetailAction> navigationMenuTextButton) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.isLoading = z;
        this.components = components;
        this.mobileMenuItem = navigationMenuTextButton;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ImmutableList<UIComponent<HistoryDetailAction>> getComponents() {
        return this.components;
    }

    public final NavigationMenuTextButton<HistoryDetailAction> getMobileMenuItem() {
        return this.mobileMenuItem;
    }
}
