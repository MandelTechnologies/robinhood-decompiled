package com.robinhood.android.cash.rewards.p074ui.overview.p075v2;

import android.content.res.Resources;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.models.api.pluto.ApiRoundupEnrollment;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOverviewSettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u001cJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÂ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÂ\u0003JQ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewSettingsViewState;", "", "assetSymbol", "", "pauseRoundupSuccessUiEvent", "Lcom/robinhood/udf/UiEvent;", "", "pauseRoundupErrorUiEvent", "", "roundupEnrollmentState", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;", "pendingRoundupAmount", "Lcom/robinhood/models/util/Money;", "<init>", "(Ljava/lang/String;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;Lcom/robinhood/models/util/Money;)V", "getAssetSymbol", "()Ljava/lang/String;", "getPauseRoundupErrorUiEvent", "()Lcom/robinhood/udf/UiEvent;", "isAssetSelectionRowEnabled", "", "()Z", "isRoundupToggleOn", "pendingRoundupAmountText", "getPendingRoundupAmountText", "pauseRoundupDialogMessage", "", "res", "Landroid/content/res/Resources;", "pauseRoundupSuccessWithDialogMessageUiEvent", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsOverviewSettingsViewState {
    public static final int $stable = 8;
    private final String assetSymbol;
    private final UiEvent<Throwable> pauseRoundupErrorUiEvent;
    private final UiEvent<Unit> pauseRoundupSuccessUiEvent;
    private final Money pendingRoundupAmount;
    private final ApiRoundupEnrollment.State roundupEnrollmentState;

    public RewardsOverviewSettingsViewState() {
        this(null, null, null, null, null, 31, null);
    }

    private final UiEvent<Unit> component2() {
        return this.pauseRoundupSuccessUiEvent;
    }

    /* renamed from: component4, reason: from getter */
    private final ApiRoundupEnrollment.State getRoundupEnrollmentState() {
        return this.roundupEnrollmentState;
    }

    /* renamed from: component5, reason: from getter */
    private final Money getPendingRoundupAmount() {
        return this.pendingRoundupAmount;
    }

    public static /* synthetic */ RewardsOverviewSettingsViewState copy$default(RewardsOverviewSettingsViewState rewardsOverviewSettingsViewState, String str, UiEvent uiEvent, UiEvent uiEvent2, ApiRoundupEnrollment.State state, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsOverviewSettingsViewState.assetSymbol;
        }
        if ((i & 2) != 0) {
            uiEvent = rewardsOverviewSettingsViewState.pauseRoundupSuccessUiEvent;
        }
        if ((i & 4) != 0) {
            uiEvent2 = rewardsOverviewSettingsViewState.pauseRoundupErrorUiEvent;
        }
        if ((i & 8) != 0) {
            state = rewardsOverviewSettingsViewState.roundupEnrollmentState;
        }
        if ((i & 16) != 0) {
            money = rewardsOverviewSettingsViewState.pendingRoundupAmount;
        }
        Money money2 = money;
        UiEvent uiEvent3 = uiEvent2;
        return rewardsOverviewSettingsViewState.copy(str, uiEvent, uiEvent3, state, money2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final UiEvent<Throwable> component3() {
        return this.pauseRoundupErrorUiEvent;
    }

    public final RewardsOverviewSettingsViewState copy(String assetSymbol, UiEvent<Unit> pauseRoundupSuccessUiEvent, UiEvent<Throwable> pauseRoundupErrorUiEvent, ApiRoundupEnrollment.State roundupEnrollmentState, Money pendingRoundupAmount) {
        return new RewardsOverviewSettingsViewState(assetSymbol, pauseRoundupSuccessUiEvent, pauseRoundupErrorUiEvent, roundupEnrollmentState, pendingRoundupAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsOverviewSettingsViewState)) {
            return false;
        }
        RewardsOverviewSettingsViewState rewardsOverviewSettingsViewState = (RewardsOverviewSettingsViewState) other;
        return Intrinsics.areEqual(this.assetSymbol, rewardsOverviewSettingsViewState.assetSymbol) && Intrinsics.areEqual(this.pauseRoundupSuccessUiEvent, rewardsOverviewSettingsViewState.pauseRoundupSuccessUiEvent) && Intrinsics.areEqual(this.pauseRoundupErrorUiEvent, rewardsOverviewSettingsViewState.pauseRoundupErrorUiEvent) && this.roundupEnrollmentState == rewardsOverviewSettingsViewState.roundupEnrollmentState && Intrinsics.areEqual(this.pendingRoundupAmount, rewardsOverviewSettingsViewState.pendingRoundupAmount);
    }

    public int hashCode() {
        String str = this.assetSymbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.pauseRoundupSuccessUiEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.pauseRoundupErrorUiEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        ApiRoundupEnrollment.State state = this.roundupEnrollmentState;
        int iHashCode4 = (iHashCode3 + (state == null ? 0 : state.hashCode())) * 31;
        Money money = this.pendingRoundupAmount;
        return iHashCode4 + (money != null ? money.hashCode() : 0);
    }

    public String toString() {
        return "RewardsOverviewSettingsViewState(assetSymbol=" + this.assetSymbol + ", pauseRoundupSuccessUiEvent=" + this.pauseRoundupSuccessUiEvent + ", pauseRoundupErrorUiEvent=" + this.pauseRoundupErrorUiEvent + ", roundupEnrollmentState=" + this.roundupEnrollmentState + ", pendingRoundupAmount=" + this.pendingRoundupAmount + ")";
    }

    public RewardsOverviewSettingsViewState(String str, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2, ApiRoundupEnrollment.State state, Money money) {
        this.assetSymbol = str;
        this.pauseRoundupSuccessUiEvent = uiEvent;
        this.pauseRoundupErrorUiEvent = uiEvent2;
        this.roundupEnrollmentState = state;
        this.pendingRoundupAmount = money;
    }

    public /* synthetic */ RewardsOverviewSettingsViewState(String str, UiEvent uiEvent, UiEvent uiEvent2, ApiRoundupEnrollment.State state, Money money, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : uiEvent2, (i & 8) != 0 ? null : state, (i & 16) != 0 ? null : money);
    }

    public final String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final UiEvent<Throwable> getPauseRoundupErrorUiEvent() {
        return this.pauseRoundupErrorUiEvent;
    }

    public final boolean isAssetSelectionRowEnabled() {
        return this.roundupEnrollmentState == ApiRoundupEnrollment.State.ACTIVE;
    }

    public final boolean isRoundupToggleOn() {
        return this.roundupEnrollmentState == ApiRoundupEnrollment.State.ACTIVE;
    }

    public final String getPendingRoundupAmountText() {
        Money money = this.pendingRoundupAmount;
        if (money != null) {
            return Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        return null;
    }

    public final CharSequence pauseRoundupDialogMessage(Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        Money money = this.pendingRoundupAmount;
        if (money != null && money.isPositive()) {
            String string2 = res.getString(C10176R.string.pause_roundups_dialog_message, getPendingRoundupAmountText());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return HtmlCompat.fromHtml$default(string2, 0, 2, null);
        }
        String string3 = res.getString(C10176R.string.pause_zero_roundups_dialog_message);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public final UiEvent<CharSequence> pauseRoundupSuccessWithDialogMessageUiEvent(Resources res) throws Resources.NotFoundException {
        Object string2;
        Intrinsics.checkNotNullParameter(res, "res");
        UiEvent<Unit> uiEvent = this.pauseRoundupSuccessUiEvent;
        if ((uiEvent != null ? uiEvent.consume() : null) == null) {
            return null;
        }
        Money money = this.pendingRoundupAmount;
        if (money != null && money.isPositive()) {
            String string3 = res.getString(C10176R.string.pause_roundups_success_dialog_message, getPendingRoundupAmountText());
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            string2 = HtmlCompat.fromHtml$default(string3, 0, 2, null);
        } else {
            string2 = res.getString(C10176R.string.pause_zero_roundups_success_dialog_message);
            Intrinsics.checkNotNull(string2);
        }
        return new UiEvent<>(string2);
    }
}
