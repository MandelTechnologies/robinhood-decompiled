package com.robinhood.android.directdeposit.p101ui.redirect;

import com.robinhood.models.p355ui.bonfire.rhy.RhsNoaRedirectStatus;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RedirectDirectDepositBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/redirect/RedirectDirectDepositBottomSheetViewState;", "", "rhsNoaRedirectStatus", "Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;", "<init>", "(Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;)V", "expireAtMediumText", "", "getExpireAtMediumText", "()Ljava/lang/String;", "expireAtMediumNoYearText", "getExpireAtMediumNoYearText", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class RedirectDirectDepositBottomSheetViewState {
    public static final int $stable = 8;
    private final RhsNoaRedirectStatus.PromptRedirect rhsNoaRedirectStatus;

    /* renamed from: component1, reason: from getter */
    private final RhsNoaRedirectStatus.PromptRedirect getRhsNoaRedirectStatus() {
        return this.rhsNoaRedirectStatus;
    }

    public static /* synthetic */ RedirectDirectDepositBottomSheetViewState copy$default(RedirectDirectDepositBottomSheetViewState redirectDirectDepositBottomSheetViewState, RhsNoaRedirectStatus.PromptRedirect promptRedirect, int i, Object obj) {
        if ((i & 1) != 0) {
            promptRedirect = redirectDirectDepositBottomSheetViewState.rhsNoaRedirectStatus;
        }
        return redirectDirectDepositBottomSheetViewState.copy(promptRedirect);
    }

    public final RedirectDirectDepositBottomSheetViewState copy(RhsNoaRedirectStatus.PromptRedirect rhsNoaRedirectStatus) {
        Intrinsics.checkNotNullParameter(rhsNoaRedirectStatus, "rhsNoaRedirectStatus");
        return new RedirectDirectDepositBottomSheetViewState(rhsNoaRedirectStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RedirectDirectDepositBottomSheetViewState) && Intrinsics.areEqual(this.rhsNoaRedirectStatus, ((RedirectDirectDepositBottomSheetViewState) other).rhsNoaRedirectStatus);
    }

    public int hashCode() {
        return this.rhsNoaRedirectStatus.hashCode();
    }

    public String toString() {
        return "RedirectDirectDepositBottomSheetViewState(rhsNoaRedirectStatus=" + this.rhsNoaRedirectStatus + ")";
    }

    public RedirectDirectDepositBottomSheetViewState(RhsNoaRedirectStatus.PromptRedirect rhsNoaRedirectStatus) {
        Intrinsics.checkNotNullParameter(rhsNoaRedirectStatus, "rhsNoaRedirectStatus");
        this.rhsNoaRedirectStatus = rhsNoaRedirectStatus;
    }

    public final String getExpireAtMediumText() {
        return LocalDateFormatter.MEDIUM.format(Instants.toLocalDate$default(this.rhsNoaRedirectStatus.getExpireAt(), null, 1, null));
    }

    public final String getExpireAtMediumNoYearText() {
        return LocalDateFormatter.MEDIUM_NO_YEAR.format(Instants.toLocalDate$default(this.rhsNoaRedirectStatus.getExpireAt(), null, 1, null));
    }
}
