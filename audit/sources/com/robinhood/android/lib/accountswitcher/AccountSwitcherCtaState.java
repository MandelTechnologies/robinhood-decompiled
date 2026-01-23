package com.robinhood.android.lib.accountswitcher;

import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherCta.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003JX\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u00020\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaState;", "", "title", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "leadingIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "loading", "", "minHeight", "Landroidx/compose/ui/unit/Dp;", "enableAccountSwitching", "showBadge", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getLeadingIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getLoading", "()Z", "getMinHeight-D9Ej5fM", "()F", "F", "getEnableAccountSwitching", "getShowBadge", "component1", "component2", "component3", "component4", "component5", "component5-D9Ej5fM", "component6", "component7", "copy", "copy-3xixttE", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZFZZ)Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaState;", "equals", "other", "hashCode", "", "toString", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AccountSwitcherCtaState {
    public static final int $stable = 0;
    private final boolean enableAccountSwitching;
    private final ServerToBentoAssetMapper2 leadingIcon;
    private final boolean loading;
    private final float minHeight;
    private final boolean showBadge;
    private final TextStyle textStyle;
    private final String title;

    public /* synthetic */ AccountSwitcherCtaState(String str, TextStyle textStyle, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, float f, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, serverToBentoAssetMapper2, z, f, z2, z3);
    }

    /* renamed from: copy-3xixttE$default, reason: not valid java name */
    public static /* synthetic */ AccountSwitcherCtaState m15802copy3xixttE$default(AccountSwitcherCtaState accountSwitcherCtaState, String str, TextStyle textStyle, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, float f, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountSwitcherCtaState.title;
        }
        if ((i & 2) != 0) {
            textStyle = accountSwitcherCtaState.textStyle;
        }
        if ((i & 4) != 0) {
            serverToBentoAssetMapper2 = accountSwitcherCtaState.leadingIcon;
        }
        if ((i & 8) != 0) {
            z = accountSwitcherCtaState.loading;
        }
        if ((i & 16) != 0) {
            f = accountSwitcherCtaState.minHeight;
        }
        if ((i & 32) != 0) {
            z2 = accountSwitcherCtaState.enableAccountSwitching;
        }
        if ((i & 64) != 0) {
            z3 = accountSwitcherCtaState.showBadge;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        float f2 = f;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
        return accountSwitcherCtaState.m15804copy3xixttE(str, textStyle, serverToBentoAssetMapper22, z, f2, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextStyle getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final ServerToBentoAssetMapper2 getLeadingIcon() {
        return this.leadingIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnableAccountSwitching() {
        return this.enableAccountSwitching;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowBadge() {
        return this.showBadge;
    }

    /* renamed from: copy-3xixttE, reason: not valid java name */
    public final AccountSwitcherCtaState m15804copy3xixttE(String title, TextStyle textStyle, ServerToBentoAssetMapper2 leadingIcon, boolean loading, float minHeight, boolean enableAccountSwitching, boolean showBadge) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        return new AccountSwitcherCtaState(title, textStyle, leadingIcon, loading, minHeight, enableAccountSwitching, showBadge, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSwitcherCtaState)) {
            return false;
        }
        AccountSwitcherCtaState accountSwitcherCtaState = (AccountSwitcherCtaState) other;
        return Intrinsics.areEqual(this.title, accountSwitcherCtaState.title) && Intrinsics.areEqual(this.textStyle, accountSwitcherCtaState.textStyle) && this.leadingIcon == accountSwitcherCtaState.leadingIcon && this.loading == accountSwitcherCtaState.loading && C2002Dp.m7997equalsimpl0(this.minHeight, accountSwitcherCtaState.minHeight) && this.enableAccountSwitching == accountSwitcherCtaState.enableAccountSwitching && this.showBadge == accountSwitcherCtaState.showBadge;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.textStyle.hashCode()) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.leadingIcon;
        return ((((((((iHashCode + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31) + Boolean.hashCode(this.loading)) * 31) + C2002Dp.m7998hashCodeimpl(this.minHeight)) * 31) + Boolean.hashCode(this.enableAccountSwitching)) * 31) + Boolean.hashCode(this.showBadge);
    }

    public String toString() {
        return "AccountSwitcherCtaState(title=" + this.title + ", textStyle=" + this.textStyle + ", leadingIcon=" + this.leadingIcon + ", loading=" + this.loading + ", minHeight=" + C2002Dp.m7999toStringimpl(this.minHeight) + ", enableAccountSwitching=" + this.enableAccountSwitching + ", showBadge=" + this.showBadge + ")";
    }

    private AccountSwitcherCtaState(String title, TextStyle textStyle, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, float f, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        this.title = title;
        this.textStyle = textStyle;
        this.leadingIcon = serverToBentoAssetMapper2;
        this.loading = z;
        this.minHeight = f;
        this.enableAccountSwitching = z2;
        this.showBadge = z3;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TextStyle getTextStyle() {
        return this.textStyle;
    }

    public final ServerToBentoAssetMapper2 getLeadingIcon() {
        return this.leadingIcon;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public /* synthetic */ AccountSwitcherCtaState(String str, TextStyle textStyle, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, float f, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, serverToBentoAssetMapper2, z, (i & 16) != 0 ? C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM() : f, z2, z3, null);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m15805getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    public final boolean getEnableAccountSwitching() {
        return this.enableAccountSwitching;
    }

    public final boolean getShowBadge() {
        return this.showBadge;
    }
}
