package com.robinhood.shared.recurring.p392ui.edit;

import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RecurringSettingsEditComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/edit/RecurringSettingsEditState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "primaryButtonText", "primaryButtonType", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "secondaryButtonText", "buttonsLoading", "", "buttonsVisible", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/compose/bento/component/BentoButtons$Type;Lcom/robinhood/utils/resource/StringResource;ZZ)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getPrimaryButtonText", "getPrimaryButtonType", "()Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "getSecondaryButtonText", "getButtonsLoading", "()Z", "getButtonsVisible", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RecurringSettingsEditState {
    public static final int $stable;
    private final boolean buttonsLoading;
    private final boolean buttonsVisible;
    private final StringResource primaryButtonText;
    private final BentoButtons.Type primaryButtonType;
    private final ImmutableList<CryptoOrderReviewRowState> rows;
    private final StringResource secondaryButtonText;
    private final StringResource title;

    static {
        int i = StringResource.$stable;
        $stable = i | CryptoOrderReviewRowState.$stable | i;
    }

    public static /* synthetic */ RecurringSettingsEditState copy$default(RecurringSettingsEditState recurringSettingsEditState, StringResource stringResource, ImmutableList immutableList, StringResource stringResource2, BentoButtons.Type type2, StringResource stringResource3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = recurringSettingsEditState.title;
        }
        if ((i & 2) != 0) {
            immutableList = recurringSettingsEditState.rows;
        }
        if ((i & 4) != 0) {
            stringResource2 = recurringSettingsEditState.primaryButtonText;
        }
        if ((i & 8) != 0) {
            type2 = recurringSettingsEditState.primaryButtonType;
        }
        if ((i & 16) != 0) {
            stringResource3 = recurringSettingsEditState.secondaryButtonText;
        }
        if ((i & 32) != 0) {
            z = recurringSettingsEditState.buttonsLoading;
        }
        if ((i & 64) != 0) {
            z2 = recurringSettingsEditState.buttonsVisible;
        }
        boolean z3 = z;
        boolean z4 = z2;
        StringResource stringResource4 = stringResource3;
        StringResource stringResource5 = stringResource2;
        return recurringSettingsEditState.copy(stringResource, immutableList, stringResource5, type2, stringResource4, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    public final ImmutableList<CryptoOrderReviewRowState> component2() {
        return this.rows;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component4, reason: from getter */
    public final BentoButtons.Type getPrimaryButtonType() {
        return this.primaryButtonType;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getButtonsLoading() {
        return this.buttonsLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getButtonsVisible() {
        return this.buttonsVisible;
    }

    public final RecurringSettingsEditState copy(StringResource title, ImmutableList<CryptoOrderReviewRowState> rows, StringResource primaryButtonText, BentoButtons.Type primaryButtonType, StringResource secondaryButtonText, boolean buttonsLoading, boolean buttonsVisible) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(primaryButtonType, "primaryButtonType");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        return new RecurringSettingsEditState(title, rows, primaryButtonText, primaryButtonType, secondaryButtonText, buttonsLoading, buttonsVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringSettingsEditState)) {
            return false;
        }
        RecurringSettingsEditState recurringSettingsEditState = (RecurringSettingsEditState) other;
        return Intrinsics.areEqual(this.title, recurringSettingsEditState.title) && Intrinsics.areEqual(this.rows, recurringSettingsEditState.rows) && Intrinsics.areEqual(this.primaryButtonText, recurringSettingsEditState.primaryButtonText) && this.primaryButtonType == recurringSettingsEditState.primaryButtonType && Intrinsics.areEqual(this.secondaryButtonText, recurringSettingsEditState.secondaryButtonText) && this.buttonsLoading == recurringSettingsEditState.buttonsLoading && this.buttonsVisible == recurringSettingsEditState.buttonsVisible;
    }

    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + this.rows.hashCode()) * 31) + this.primaryButtonText.hashCode()) * 31) + this.primaryButtonType.hashCode()) * 31) + this.secondaryButtonText.hashCode()) * 31) + Boolean.hashCode(this.buttonsLoading)) * 31) + Boolean.hashCode(this.buttonsVisible);
    }

    public String toString() {
        return "RecurringSettingsEditState(title=" + this.title + ", rows=" + this.rows + ", primaryButtonText=" + this.primaryButtonText + ", primaryButtonType=" + this.primaryButtonType + ", secondaryButtonText=" + this.secondaryButtonText + ", buttonsLoading=" + this.buttonsLoading + ", buttonsVisible=" + this.buttonsVisible + ")";
    }

    public RecurringSettingsEditState(StringResource title, ImmutableList<CryptoOrderReviewRowState> rows, StringResource primaryButtonText, BentoButtons.Type primaryButtonType, StringResource secondaryButtonText, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(primaryButtonType, "primaryButtonType");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.title = title;
        this.rows = rows;
        this.primaryButtonText = primaryButtonText;
        this.primaryButtonType = primaryButtonType;
        this.secondaryButtonText = secondaryButtonText;
        this.buttonsLoading = z;
        this.buttonsVisible = z2;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final ImmutableList<CryptoOrderReviewRowState> getRows() {
        return this.rows;
    }

    public final StringResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public /* synthetic */ RecurringSettingsEditState(StringResource stringResource, ImmutableList immutableList, StringResource stringResource2, BentoButtons.Type type2, StringResource stringResource3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, immutableList, stringResource2, (i & 8) != 0 ? BentoButtons.Type.Secondary : type2, stringResource3, z, z2);
    }

    public final BentoButtons.Type getPrimaryButtonType() {
        return this.primaryButtonType;
    }

    public final StringResource getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final boolean getButtonsLoading() {
        return this.buttonsLoading;
    }

    public final boolean getButtonsVisible() {
        return this.buttonsVisible;
    }
}
