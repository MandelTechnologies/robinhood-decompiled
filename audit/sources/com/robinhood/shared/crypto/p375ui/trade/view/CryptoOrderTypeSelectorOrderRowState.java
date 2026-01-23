package com.robinhood.shared.crypto.p375ui.trade.view;

import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTypeSelectorRow.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeSelectorOrderRowState;", "", "iconDrawableRes", "", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "showNewPill", "", "includeBottomDivider", "isEnabled", "iconTintOverride", "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "<init>", "(ILcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZZZLcom/robinhood/models/serverdriven/experimental/api/Color;)V", "getIconDrawableRes", "()I", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "getShowNewPill", "()Z", "getIncludeBottomDivider", "getIconTintOverride", "()Lcom/robinhood/models/serverdriven/experimental/api/Color;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoOrderTypeSelectorOrderRowState {
    public static final int $stable = StringResource.$stable;
    private final int iconDrawableRes;
    private final Color iconTintOverride;
    private final boolean includeBottomDivider;
    private final boolean isEnabled;
    private final StringResource primaryText;
    private final StringResource secondaryText;
    private final boolean showNewPill;

    public static /* synthetic */ CryptoOrderTypeSelectorOrderRowState copy$default(CryptoOrderTypeSelectorOrderRowState cryptoOrderTypeSelectorOrderRowState, int i, StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, boolean z3, Color color, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cryptoOrderTypeSelectorOrderRowState.iconDrawableRes;
        }
        if ((i2 & 2) != 0) {
            stringResource = cryptoOrderTypeSelectorOrderRowState.primaryText;
        }
        if ((i2 & 4) != 0) {
            stringResource2 = cryptoOrderTypeSelectorOrderRowState.secondaryText;
        }
        if ((i2 & 8) != 0) {
            z = cryptoOrderTypeSelectorOrderRowState.showNewPill;
        }
        if ((i2 & 16) != 0) {
            z2 = cryptoOrderTypeSelectorOrderRowState.includeBottomDivider;
        }
        if ((i2 & 32) != 0) {
            z3 = cryptoOrderTypeSelectorOrderRowState.isEnabled;
        }
        if ((i2 & 64) != 0) {
            color = cryptoOrderTypeSelectorOrderRowState.iconTintOverride;
        }
        boolean z4 = z3;
        Color color2 = color;
        boolean z5 = z2;
        StringResource stringResource3 = stringResource2;
        return cryptoOrderTypeSelectorOrderRowState.copy(i, stringResource, stringResource3, z, z5, z4, color2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIconDrawableRes() {
        return this.iconDrawableRes;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowNewPill() {
        return this.showNewPill;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIncludeBottomDivider() {
        return this.includeBottomDivider;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final Color getIconTintOverride() {
        return this.iconTintOverride;
    }

    public final CryptoOrderTypeSelectorOrderRowState copy(int iconDrawableRes, StringResource primaryText, StringResource secondaryText, boolean showNewPill, boolean includeBottomDivider, boolean isEnabled, Color iconTintOverride) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        return new CryptoOrderTypeSelectorOrderRowState(iconDrawableRes, primaryText, secondaryText, showNewPill, includeBottomDivider, isEnabled, iconTintOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderTypeSelectorOrderRowState)) {
            return false;
        }
        CryptoOrderTypeSelectorOrderRowState cryptoOrderTypeSelectorOrderRowState = (CryptoOrderTypeSelectorOrderRowState) other;
        return this.iconDrawableRes == cryptoOrderTypeSelectorOrderRowState.iconDrawableRes && Intrinsics.areEqual(this.primaryText, cryptoOrderTypeSelectorOrderRowState.primaryText) && Intrinsics.areEqual(this.secondaryText, cryptoOrderTypeSelectorOrderRowState.secondaryText) && this.showNewPill == cryptoOrderTypeSelectorOrderRowState.showNewPill && this.includeBottomDivider == cryptoOrderTypeSelectorOrderRowState.includeBottomDivider && this.isEnabled == cryptoOrderTypeSelectorOrderRowState.isEnabled && this.iconTintOverride == cryptoOrderTypeSelectorOrderRowState.iconTintOverride;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.iconDrawableRes) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + Boolean.hashCode(this.showNewPill)) * 31) + Boolean.hashCode(this.includeBottomDivider)) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        Color color = this.iconTintOverride;
        return iHashCode + (color == null ? 0 : color.hashCode());
    }

    public String toString() {
        return "CryptoOrderTypeSelectorOrderRowState(iconDrawableRes=" + this.iconDrawableRes + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", showNewPill=" + this.showNewPill + ", includeBottomDivider=" + this.includeBottomDivider + ", isEnabled=" + this.isEnabled + ", iconTintOverride=" + this.iconTintOverride + ")";
    }

    public CryptoOrderTypeSelectorOrderRowState(int i, StringResource primaryText, StringResource secondaryText, boolean z, boolean z2, boolean z3, Color color) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        this.iconDrawableRes = i;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.showNewPill = z;
        this.includeBottomDivider = z2;
        this.isEnabled = z3;
        this.iconTintOverride = color;
    }

    public /* synthetic */ CryptoOrderTypeSelectorOrderRowState(int i, StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, boolean z3, Color color, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, stringResource, stringResource2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? true : z3, (i2 & 64) != 0 ? null : color);
    }

    public final int getIconDrawableRes() {
        return this.iconDrawableRes;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final boolean getShowNewPill() {
        return this.showNewPill;
    }

    public final boolean getIncludeBottomDivider() {
        return this.includeBottomDivider;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final Color getIconTintOverride() {
        return this.iconTintOverride;
    }
}
