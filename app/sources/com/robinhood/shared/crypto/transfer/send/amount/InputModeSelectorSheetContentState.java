package com.robinhood.shared.crypto.transfer.send.amount;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputModeSelectorSheetContent.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/InputModeSelectorSheetContentState;", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/shared/app/type/AppType;)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "quoteRowLeadingIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getQuoteRowLeadingIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "quoteRowPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "getQuoteRowPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "quoteRowSecondaryText", "getQuoteRowSecondaryText", "assetRowPrimaryText", "getAssetRowPrimaryText", "assetRowSecondaryText", "getAssetRowSecondaryText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InputModeSelectorSheetContentState {
    public static final int $stable = 8;
    private final AppType appType;
    private final UiCurrencyPair uiCurrencyPair;

    /* renamed from: component2, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    public static /* synthetic */ InputModeSelectorSheetContentState copy$default(InputModeSelectorSheetContentState inputModeSelectorSheetContentState, UiCurrencyPair uiCurrencyPair, AppType appType, int i, Object obj) {
        if ((i & 1) != 0) {
            uiCurrencyPair = inputModeSelectorSheetContentState.uiCurrencyPair;
        }
        if ((i & 2) != 0) {
            appType = inputModeSelectorSheetContentState.appType;
        }
        return inputModeSelectorSheetContentState.copy(uiCurrencyPair, appType);
    }

    /* renamed from: component1, reason: from getter */
    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    public final InputModeSelectorSheetContentState copy(UiCurrencyPair uiCurrencyPair, AppType appType) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new InputModeSelectorSheetContentState(uiCurrencyPair, appType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputModeSelectorSheetContentState)) {
            return false;
        }
        InputModeSelectorSheetContentState inputModeSelectorSheetContentState = (InputModeSelectorSheetContentState) other;
        return Intrinsics.areEqual(this.uiCurrencyPair, inputModeSelectorSheetContentState.uiCurrencyPair) && this.appType == inputModeSelectorSheetContentState.appType;
    }

    public int hashCode() {
        return (this.uiCurrencyPair.hashCode() * 31) + this.appType.hashCode();
    }

    public String toString() {
        return "InputModeSelectorSheetContentState(uiCurrencyPair=" + this.uiCurrencyPair + ", appType=" + this.appType + ")";
    }

    public InputModeSelectorSheetContentState(UiCurrencyPair uiCurrencyPair, AppType appType) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.uiCurrencyPair = uiCurrencyPair;
        this.appType = appType;
    }

    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    public final ServerToBentoAssetMapper2 getQuoteRowLeadingIcon() {
        if (this.appType == AppType.RHC) {
            return ServerToBentoAssetMapper2.EURO_SIGN_24;
        }
        return ServerToBentoAssetMapper2.DOLLAR_SIGN_24;
    }

    public final StringResource getQuoteRowPrimaryText() {
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_input_mode_selector_primary_text, this.uiCurrencyPair.getQuoteCurrency().getCode());
    }

    public final StringResource getQuoteRowSecondaryText() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.appType == AppType.RHC) {
            i = C37934R.string.crypto_input_mode_selector_quote_currency_secondary_text_rhc;
        } else {
            i = C37934R.string.crypto_input_mode_selector_quote_currency_secondary_text;
        }
        return companion.invoke(i, this.uiCurrencyPair.getDisplaySymbol());
    }

    public final StringResource getAssetRowPrimaryText() {
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_input_mode_selector_primary_text, this.uiCurrencyPair.getDisplaySymbol());
    }

    public final StringResource getAssetRowSecondaryText() {
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_input_mode_selector_asset_currency_secondary_text, this.uiCurrencyPair.getDisplaySymbol());
    }
}
