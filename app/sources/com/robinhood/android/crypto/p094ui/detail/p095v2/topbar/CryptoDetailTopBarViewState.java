package com.robinhood.android.crypto.p094ui.detail.p095v2.topbar;

import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoDetailTopBarDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarViewState;", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "title", "", "subtitle", "showBackButton", "", "topBarActions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/collections/immutable/ImmutableList;)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getShowBackButton", "()Z", "getTopBarActions", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailTopBarViewState {
    public static final int $stable = 8;
    private final UiCurrencyPair currencyPair;
    private final boolean showBackButton;
    private final String subtitle;
    private final String title;
    private final ImmutableList<CryptoDetailTopBarAction> topBarActions;

    public static /* synthetic */ CryptoDetailTopBarViewState copy$default(CryptoDetailTopBarViewState cryptoDetailTopBarViewState, UiCurrencyPair uiCurrencyPair, String str, String str2, boolean z, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            uiCurrencyPair = cryptoDetailTopBarViewState.currencyPair;
        }
        if ((i & 2) != 0) {
            str = cryptoDetailTopBarViewState.title;
        }
        if ((i & 4) != 0) {
            str2 = cryptoDetailTopBarViewState.subtitle;
        }
        if ((i & 8) != 0) {
            z = cryptoDetailTopBarViewState.showBackButton;
        }
        if ((i & 16) != 0) {
            immutableList = cryptoDetailTopBarViewState.topBarActions;
        }
        ImmutableList immutableList2 = immutableList;
        String str3 = str2;
        return cryptoDetailTopBarViewState.copy(uiCurrencyPair, str, str3, z, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final ImmutableList<CryptoDetailTopBarAction> component5() {
        return this.topBarActions;
    }

    public final CryptoDetailTopBarViewState copy(UiCurrencyPair currencyPair, String title, String subtitle, boolean showBackButton, ImmutableList<? extends CryptoDetailTopBarAction> topBarActions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(topBarActions, "topBarActions");
        return new CryptoDetailTopBarViewState(currencyPair, title, subtitle, showBackButton, topBarActions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailTopBarViewState)) {
            return false;
        }
        CryptoDetailTopBarViewState cryptoDetailTopBarViewState = (CryptoDetailTopBarViewState) other;
        return Intrinsics.areEqual(this.currencyPair, cryptoDetailTopBarViewState.currencyPair) && Intrinsics.areEqual(this.title, cryptoDetailTopBarViewState.title) && Intrinsics.areEqual(this.subtitle, cryptoDetailTopBarViewState.subtitle) && this.showBackButton == cryptoDetailTopBarViewState.showBackButton && Intrinsics.areEqual(this.topBarActions, cryptoDetailTopBarViewState.topBarActions);
    }

    public int hashCode() {
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        return ((((((((uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.showBackButton)) * 31) + this.topBarActions.hashCode();
    }

    public String toString() {
        return "CryptoDetailTopBarViewState(currencyPair=" + this.currencyPair + ", title=" + this.title + ", subtitle=" + this.subtitle + ", showBackButton=" + this.showBackButton + ", topBarActions=" + this.topBarActions + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoDetailTopBarViewState(UiCurrencyPair uiCurrencyPair, String title, String subtitle, boolean z, ImmutableList<? extends CryptoDetailTopBarAction> topBarActions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(topBarActions, "topBarActions");
        this.currencyPair = uiCurrencyPair;
        this.title = title;
        this.subtitle = subtitle;
        this.showBackButton = z;
        this.topBarActions = topBarActions;
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final ImmutableList<CryptoDetailTopBarAction> getTopBarActions() {
        return this.topBarActions;
    }
}
