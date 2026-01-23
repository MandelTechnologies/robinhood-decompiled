package com.robinhood.android.equityadvancedorder;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvancedOrderNumpadState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadState;", "", "footerTextMarkdown", "Lcom/robinhood/utils/resource/StringResource;", "isKeyboardVisible", "", "showKeyboardDelimiter", "textButtonState", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadButtonState;", "primaryButtonState", "showTwentyFourHourButton", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadButtonState;Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadButtonState;Z)V", "getFooterTextMarkdown", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "getShowKeyboardDelimiter", "getTextButtonState", "()Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadButtonState;", "getPrimaryButtonState", "getShowTwentyFourHourButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityAdvancedOrderNumpadState {
    public static final int $stable = StringResource.$stable;
    private final StringResource footerTextMarkdown;
    private final boolean isKeyboardVisible;
    private final EquityAdvancedOrderNumpadButtonState primaryButtonState;
    private final boolean showKeyboardDelimiter;
    private final boolean showTwentyFourHourButton;
    private final EquityAdvancedOrderNumpadButtonState textButtonState;

    public static /* synthetic */ EquityAdvancedOrderNumpadState copy$default(EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState, StringResource stringResource, boolean z, boolean z2, EquityAdvancedOrderNumpadButtonState equityAdvancedOrderNumpadButtonState, EquityAdvancedOrderNumpadButtonState equityAdvancedOrderNumpadButtonState2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = equityAdvancedOrderNumpadState.footerTextMarkdown;
        }
        if ((i & 2) != 0) {
            z = equityAdvancedOrderNumpadState.isKeyboardVisible;
        }
        if ((i & 4) != 0) {
            z2 = equityAdvancedOrderNumpadState.showKeyboardDelimiter;
        }
        if ((i & 8) != 0) {
            equityAdvancedOrderNumpadButtonState = equityAdvancedOrderNumpadState.textButtonState;
        }
        if ((i & 16) != 0) {
            equityAdvancedOrderNumpadButtonState2 = equityAdvancedOrderNumpadState.primaryButtonState;
        }
        if ((i & 32) != 0) {
            z3 = equityAdvancedOrderNumpadState.showTwentyFourHourButton;
        }
        EquityAdvancedOrderNumpadButtonState equityAdvancedOrderNumpadButtonState3 = equityAdvancedOrderNumpadButtonState2;
        boolean z4 = z3;
        return equityAdvancedOrderNumpadState.copy(stringResource, z, z2, equityAdvancedOrderNumpadButtonState, equityAdvancedOrderNumpadButtonState3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getFooterTextMarkdown() {
        return this.footerTextMarkdown;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsKeyboardVisible() {
        return this.isKeyboardVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowKeyboardDelimiter() {
        return this.showKeyboardDelimiter;
    }

    /* renamed from: component4, reason: from getter */
    public final EquityAdvancedOrderNumpadButtonState getTextButtonState() {
        return this.textButtonState;
    }

    /* renamed from: component5, reason: from getter */
    public final EquityAdvancedOrderNumpadButtonState getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowTwentyFourHourButton() {
        return this.showTwentyFourHourButton;
    }

    public final EquityAdvancedOrderNumpadState copy(StringResource footerTextMarkdown, boolean isKeyboardVisible, boolean showKeyboardDelimiter, EquityAdvancedOrderNumpadButtonState textButtonState, EquityAdvancedOrderNumpadButtonState primaryButtonState, boolean showTwentyFourHourButton) {
        Intrinsics.checkNotNullParameter(textButtonState, "textButtonState");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        return new EquityAdvancedOrderNumpadState(footerTextMarkdown, isKeyboardVisible, showKeyboardDelimiter, textButtonState, primaryButtonState, showTwentyFourHourButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityAdvancedOrderNumpadState)) {
            return false;
        }
        EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState = (EquityAdvancedOrderNumpadState) other;
        return Intrinsics.areEqual(this.footerTextMarkdown, equityAdvancedOrderNumpadState.footerTextMarkdown) && this.isKeyboardVisible == equityAdvancedOrderNumpadState.isKeyboardVisible && this.showKeyboardDelimiter == equityAdvancedOrderNumpadState.showKeyboardDelimiter && Intrinsics.areEqual(this.textButtonState, equityAdvancedOrderNumpadState.textButtonState) && Intrinsics.areEqual(this.primaryButtonState, equityAdvancedOrderNumpadState.primaryButtonState) && this.showTwentyFourHourButton == equityAdvancedOrderNumpadState.showTwentyFourHourButton;
    }

    public int hashCode() {
        StringResource stringResource = this.footerTextMarkdown;
        return ((((((((((stringResource == null ? 0 : stringResource.hashCode()) * 31) + Boolean.hashCode(this.isKeyboardVisible)) * 31) + Boolean.hashCode(this.showKeyboardDelimiter)) * 31) + this.textButtonState.hashCode()) * 31) + this.primaryButtonState.hashCode()) * 31) + Boolean.hashCode(this.showTwentyFourHourButton);
    }

    public String toString() {
        return "EquityAdvancedOrderNumpadState(footerTextMarkdown=" + this.footerTextMarkdown + ", isKeyboardVisible=" + this.isKeyboardVisible + ", showKeyboardDelimiter=" + this.showKeyboardDelimiter + ", textButtonState=" + this.textButtonState + ", primaryButtonState=" + this.primaryButtonState + ", showTwentyFourHourButton=" + this.showTwentyFourHourButton + ")";
    }

    public EquityAdvancedOrderNumpadState(StringResource stringResource, boolean z, boolean z2, EquityAdvancedOrderNumpadButtonState textButtonState, EquityAdvancedOrderNumpadButtonState primaryButtonState, boolean z3) {
        Intrinsics.checkNotNullParameter(textButtonState, "textButtonState");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        this.footerTextMarkdown = stringResource;
        this.isKeyboardVisible = z;
        this.showKeyboardDelimiter = z2;
        this.textButtonState = textButtonState;
        this.primaryButtonState = primaryButtonState;
        this.showTwentyFourHourButton = z3;
    }

    public final StringResource getFooterTextMarkdown() {
        return this.footerTextMarkdown;
    }

    public final boolean isKeyboardVisible() {
        return this.isKeyboardVisible;
    }

    public final boolean getShowKeyboardDelimiter() {
        return this.showKeyboardDelimiter;
    }

    public final EquityAdvancedOrderNumpadButtonState getTextButtonState() {
        return this.textButtonState;
    }

    public final EquityAdvancedOrderNumpadButtonState getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    public final boolean getShowTwentyFourHourButton() {
        return this.showTwentyFourHourButton;
    }
}
