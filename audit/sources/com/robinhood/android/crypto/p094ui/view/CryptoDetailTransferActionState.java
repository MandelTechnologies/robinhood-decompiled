package com.robinhood.android.crypto.p094ui.view;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.p347db.BannerComponent;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoDetailTransferActionsComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007HÆ\u0003J_\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001f\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;", "", "currencyPairId", "Ljava/util/UUID;", "transferBanner", "Lcom/robinhood/models/serverdriven/db/BannerComponent;", "transferBannerV2", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "transferButtons", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "transferButtonsV2", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/db/BannerComponent;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getTransferBanner", "()Lcom/robinhood/models/serverdriven/db/BannerComponent;", "getTransferBannerV2", "()Lkotlinx/collections/immutable/ImmutableList;", "getTransferButtons", "getTransferButtonsV2", "isVisible", "", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailTransferActionState {
    public static final int $stable = 8;
    private final UUID currencyPairId;
    private final boolean isVisible;
    private final BannerComponent transferBanner;
    private final ImmutableList<UIComponent<GenericAction>> transferBannerV2;
    private final ImmutableList<GenericButton> transferButtons;
    private final ImmutableList<UIComponent<GenericAction>> transferButtonsV2;

    public static /* synthetic */ CryptoDetailTransferActionState copy$default(CryptoDetailTransferActionState cryptoDetailTransferActionState, UUID uuid, BannerComponent bannerComponent, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoDetailTransferActionState.currencyPairId;
        }
        if ((i & 2) != 0) {
            bannerComponent = cryptoDetailTransferActionState.transferBanner;
        }
        if ((i & 4) != 0) {
            immutableList = cryptoDetailTransferActionState.transferBannerV2;
        }
        if ((i & 8) != 0) {
            immutableList2 = cryptoDetailTransferActionState.transferButtons;
        }
        if ((i & 16) != 0) {
            immutableList3 = cryptoDetailTransferActionState.transferButtonsV2;
        }
        ImmutableList immutableList4 = immutableList3;
        ImmutableList immutableList5 = immutableList;
        return cryptoDetailTransferActionState.copy(uuid, bannerComponent, immutableList5, immutableList2, immutableList4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final BannerComponent getTransferBanner() {
        return this.transferBanner;
    }

    public final ImmutableList<UIComponent<GenericAction>> component3() {
        return this.transferBannerV2;
    }

    public final ImmutableList<GenericButton> component4() {
        return this.transferButtons;
    }

    public final ImmutableList<UIComponent<GenericAction>> component5() {
        return this.transferButtonsV2;
    }

    public final CryptoDetailTransferActionState copy(UUID currencyPairId, BannerComponent transferBanner, ImmutableList<? extends UIComponent<? extends GenericAction>> transferBannerV2, ImmutableList<GenericButton> transferButtons, ImmutableList<? extends UIComponent<? extends GenericAction>> transferButtonsV2) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(transferButtons, "transferButtons");
        return new CryptoDetailTransferActionState(currencyPairId, transferBanner, transferBannerV2, transferButtons, transferButtonsV2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailTransferActionState)) {
            return false;
        }
        CryptoDetailTransferActionState cryptoDetailTransferActionState = (CryptoDetailTransferActionState) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoDetailTransferActionState.currencyPairId) && Intrinsics.areEqual(this.transferBanner, cryptoDetailTransferActionState.transferBanner) && Intrinsics.areEqual(this.transferBannerV2, cryptoDetailTransferActionState.transferBannerV2) && Intrinsics.areEqual(this.transferButtons, cryptoDetailTransferActionState.transferButtons) && Intrinsics.areEqual(this.transferButtonsV2, cryptoDetailTransferActionState.transferButtonsV2);
    }

    public int hashCode() {
        int iHashCode = this.currencyPairId.hashCode() * 31;
        BannerComponent bannerComponent = this.transferBanner;
        int iHashCode2 = (iHashCode + (bannerComponent == null ? 0 : bannerComponent.hashCode())) * 31;
        ImmutableList<UIComponent<GenericAction>> immutableList = this.transferBannerV2;
        int iHashCode3 = (((iHashCode2 + (immutableList == null ? 0 : immutableList.hashCode())) * 31) + this.transferButtons.hashCode()) * 31;
        ImmutableList<UIComponent<GenericAction>> immutableList2 = this.transferButtonsV2;
        return iHashCode3 + (immutableList2 != null ? immutableList2.hashCode() : 0);
    }

    public String toString() {
        return "CryptoDetailTransferActionState(currencyPairId=" + this.currencyPairId + ", transferBanner=" + this.transferBanner + ", transferBannerV2=" + this.transferBannerV2 + ", transferButtons=" + this.transferButtons + ", transferButtonsV2=" + this.transferButtonsV2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoDetailTransferActionState(UUID currencyPairId, BannerComponent bannerComponent, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, ImmutableList<GenericButton> transferButtons, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList2) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(transferButtons, "transferButtons");
        this.currencyPairId = currencyPairId;
        this.transferBanner = bannerComponent;
        this.transferBannerV2 = immutableList;
        this.transferButtons = transferButtons;
        this.transferButtonsV2 = immutableList2;
        this.isVisible = (bannerComponent == null && (immutableList == 0 || immutableList.isEmpty()) && transferButtons.isEmpty() && (immutableList2 == 0 || immutableList2.isEmpty())) ? false : true;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final BannerComponent getTransferBanner() {
        return this.transferBanner;
    }

    public final ImmutableList<UIComponent<GenericAction>> getTransferBannerV2() {
        return this.transferBannerV2;
    }

    public final ImmutableList<GenericButton> getTransferButtons() {
        return this.transferButtons;
    }

    public final ImmutableList<UIComponent<GenericAction>> getTransferButtonsV2() {
        return this.transferButtonsV2;
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }
}
