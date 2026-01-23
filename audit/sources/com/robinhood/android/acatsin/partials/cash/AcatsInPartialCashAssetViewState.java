package com.robinhood.android.acatsin.partials.cash;

import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPartialCashAssetViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003JF\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u001cHÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0006\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\fR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b&\u0010\"¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetViewState;", "", "isMarginSupported", "", "cashType", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;", "isEntireBalance", "amountEntered", "Lcom/robinhood/models/util/Money;", "isMarginInvestingEnabled", "<init>", "(ZLcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;Ljava/lang/Boolean;Lcom/robinhood/models/util/Money;Z)V", "()Z", "getCashType", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAmountEntered", "()Lcom/robinhood/models/util/Money;", "shouldShowInput", "getShouldShowInput", "canContinue", "getCanContinue", "assetEntered", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "getAssetEntered", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "marginDialogId", "", "getMarginDialogId", "()I", "marginDialogTitle", "Lcom/robinhood/utils/resource/StringResource;", "getMarginDialogTitle", "()Lcom/robinhood/utils/resource/StringResource;", "marginDialogDescription", "getMarginDialogDescription", "marginDialogPrimaryButton", "getMarginDialogPrimaryButton", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;Ljava/lang/Boolean;Lcom/robinhood/models/util/Money;Z)Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetViewState;", "equals", "other", "hashCode", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInPartialCashAssetViewState {
    public static final int $stable = 8;
    private final Money amountEntered;
    private final boolean canContinue;
    private final UiAcatsAsset.CashAsset.CashType cashType;
    private final Boolean isEntireBalance;
    private final boolean isMarginInvestingEnabled;
    private final boolean isMarginSupported;
    private final boolean shouldShowInput;

    public static /* synthetic */ AcatsInPartialCashAssetViewState copy$default(AcatsInPartialCashAssetViewState acatsInPartialCashAssetViewState, boolean z, UiAcatsAsset.CashAsset.CashType cashType, Boolean bool, Money money, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = acatsInPartialCashAssetViewState.isMarginSupported;
        }
        if ((i & 2) != 0) {
            cashType = acatsInPartialCashAssetViewState.cashType;
        }
        if ((i & 4) != 0) {
            bool = acatsInPartialCashAssetViewState.isEntireBalance;
        }
        if ((i & 8) != 0) {
            money = acatsInPartialCashAssetViewState.amountEntered;
        }
        if ((i & 16) != 0) {
            z2 = acatsInPartialCashAssetViewState.isMarginInvestingEnabled;
        }
        boolean z3 = z2;
        Boolean bool2 = bool;
        return acatsInPartialCashAssetViewState.copy(z, cashType, bool2, money, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsMarginSupported() {
        return this.isMarginSupported;
    }

    /* renamed from: component2, reason: from getter */
    public final UiAcatsAsset.CashAsset.CashType getCashType() {
        return this.cashType;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsEntireBalance() {
        return this.isEntireBalance;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getAmountEntered() {
        return this.amountEntered;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsMarginInvestingEnabled() {
        return this.isMarginInvestingEnabled;
    }

    public final AcatsInPartialCashAssetViewState copy(boolean isMarginSupported, UiAcatsAsset.CashAsset.CashType cashType, Boolean isEntireBalance, Money amountEntered, boolean isMarginInvestingEnabled) {
        return new AcatsInPartialCashAssetViewState(isMarginSupported, cashType, isEntireBalance, amountEntered, isMarginInvestingEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInPartialCashAssetViewState)) {
            return false;
        }
        AcatsInPartialCashAssetViewState acatsInPartialCashAssetViewState = (AcatsInPartialCashAssetViewState) other;
        return this.isMarginSupported == acatsInPartialCashAssetViewState.isMarginSupported && this.cashType == acatsInPartialCashAssetViewState.cashType && Intrinsics.areEqual(this.isEntireBalance, acatsInPartialCashAssetViewState.isEntireBalance) && Intrinsics.areEqual(this.amountEntered, acatsInPartialCashAssetViewState.amountEntered) && this.isMarginInvestingEnabled == acatsInPartialCashAssetViewState.isMarginInvestingEnabled;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isMarginSupported) * 31;
        UiAcatsAsset.CashAsset.CashType cashType = this.cashType;
        int iHashCode2 = (iHashCode + (cashType == null ? 0 : cashType.hashCode())) * 31;
        Boolean bool = this.isEntireBalance;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Money money = this.amountEntered;
        return ((iHashCode3 + (money != null ? money.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMarginInvestingEnabled);
    }

    public String toString() {
        return "AcatsInPartialCashAssetViewState(isMarginSupported=" + this.isMarginSupported + ", cashType=" + this.cashType + ", isEntireBalance=" + this.isEntireBalance + ", amountEntered=" + this.amountEntered + ", isMarginInvestingEnabled=" + this.isMarginInvestingEnabled + ")";
    }

    public AcatsInPartialCashAssetViewState(boolean z, UiAcatsAsset.CashAsset.CashType cashType, Boolean bool, Money money, boolean z2) {
        this.isMarginSupported = z;
        this.cashType = cashType;
        this.isEntireBalance = bool;
        this.amountEntered = money;
        this.isMarginInvestingEnabled = z2;
        Boolean bool2 = Boolean.FALSE;
        this.shouldShowInput = Intrinsics.areEqual(bool, bool2);
        this.canContinue = (cashType != null && Intrinsics.areEqual(bool, Boolean.TRUE)) || !(cashType == null || !Intrinsics.areEqual(bool, bool2) || money == null);
    }

    public /* synthetic */ AcatsInPartialCashAssetViewState(boolean z, UiAcatsAsset.CashAsset.CashType cashType, Boolean bool, Money money, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : cashType, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : money, (i & 16) != 0 ? false : z2);
    }

    public final boolean isMarginSupported() {
        return this.isMarginSupported;
    }

    public final UiAcatsAsset.CashAsset.CashType getCashType() {
        return this.cashType;
    }

    public final Boolean isEntireBalance() {
        return this.isEntireBalance;
    }

    public final Money getAmountEntered() {
        return this.amountEntered;
    }

    public final boolean isMarginInvestingEnabled() {
        return this.isMarginInvestingEnabled;
    }

    public final boolean getShouldShowInput() {
        return this.shouldShowInput;
    }

    public final boolean getCanContinue() {
        return this.canContinue;
    }

    public final UiAcatsAsset.CashAsset getAssetEntered() {
        Boolean bool;
        if (this.cashType == null || (bool = this.isEntireBalance) == null) {
            return null;
        }
        return new UiAcatsAsset.CashAsset(bool.booleanValue() ? null : this.amountEntered, this.cashType, this.isMarginSupported);
    }

    public final int getMarginDialogId() {
        return C7686R.id.dialog_id_margin_not_enabled;
    }

    public final StringResource getMarginDialogTitle() {
        return StringResource.INSTANCE.invoke(C7686R.string.acats_in_enable_margin_title, new Object[0]);
    }

    public final StringResource getMarginDialogDescription() {
        return StringResource.INSTANCE.invoke(C7686R.string.acats_in_enable_margin_message, new Object[0]);
    }

    public final StringResource getMarginDialogPrimaryButton() {
        return StringResource.INSTANCE.invoke(C7686R.string.acats_in_enable_margin_enable_button, new Object[0]);
    }
}
