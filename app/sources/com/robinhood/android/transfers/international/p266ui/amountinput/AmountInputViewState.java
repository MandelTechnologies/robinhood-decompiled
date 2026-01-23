package com.robinhood.android.transfers.international.p266ui.amountinput;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AmountInputViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputViewState;", "", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "toolbarSubtitle", "inputViewState", "Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState;", "isContinueButtonEnabled", "", "isContinueButtonLoading", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState;ZZ)V", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getToolbarSubtitle", "getInputViewState", "()Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AmountInputViewState {
    public static final int $stable = StringResource.$stable;
    private final AmountInputViewState3 inputViewState;
    private final boolean isContinueButtonEnabled;
    private final boolean isContinueButtonLoading;
    private final StringResource toolbarSubtitle;
    private final StringResource toolbarTitle;

    public static /* synthetic */ AmountInputViewState copy$default(AmountInputViewState amountInputViewState, StringResource stringResource, StringResource stringResource2, AmountInputViewState3 amountInputViewState3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = amountInputViewState.toolbarTitle;
        }
        if ((i & 2) != 0) {
            stringResource2 = amountInputViewState.toolbarSubtitle;
        }
        if ((i & 4) != 0) {
            amountInputViewState3 = amountInputViewState.inputViewState;
        }
        if ((i & 8) != 0) {
            z = amountInputViewState.isContinueButtonEnabled;
        }
        if ((i & 16) != 0) {
            z2 = amountInputViewState.isContinueButtonLoading;
        }
        boolean z3 = z2;
        AmountInputViewState3 amountInputViewState32 = amountInputViewState3;
        return amountInputViewState.copy(stringResource, stringResource2, amountInputViewState32, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final AmountInputViewState3 getInputViewState() {
        return this.inputViewState;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsContinueButtonLoading() {
        return this.isContinueButtonLoading;
    }

    public final AmountInputViewState copy(StringResource toolbarTitle, StringResource toolbarSubtitle, AmountInputViewState3 inputViewState, boolean isContinueButtonEnabled, boolean isContinueButtonLoading) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(inputViewState, "inputViewState");
        return new AmountInputViewState(toolbarTitle, toolbarSubtitle, inputViewState, isContinueButtonEnabled, isContinueButtonLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountInputViewState)) {
            return false;
        }
        AmountInputViewState amountInputViewState = (AmountInputViewState) other;
        return Intrinsics.areEqual(this.toolbarTitle, amountInputViewState.toolbarTitle) && Intrinsics.areEqual(this.toolbarSubtitle, amountInputViewState.toolbarSubtitle) && Intrinsics.areEqual(this.inputViewState, amountInputViewState.inputViewState) && this.isContinueButtonEnabled == amountInputViewState.isContinueButtonEnabled && this.isContinueButtonLoading == amountInputViewState.isContinueButtonLoading;
    }

    public int hashCode() {
        return (((((((this.toolbarTitle.hashCode() * 31) + this.toolbarSubtitle.hashCode()) * 31) + this.inputViewState.hashCode()) * 31) + Boolean.hashCode(this.isContinueButtonEnabled)) * 31) + Boolean.hashCode(this.isContinueButtonLoading);
    }

    public String toString() {
        return "AmountInputViewState(toolbarTitle=" + this.toolbarTitle + ", toolbarSubtitle=" + this.toolbarSubtitle + ", inputViewState=" + this.inputViewState + ", isContinueButtonEnabled=" + this.isContinueButtonEnabled + ", isContinueButtonLoading=" + this.isContinueButtonLoading + ")";
    }

    public AmountInputViewState(StringResource toolbarTitle, StringResource toolbarSubtitle, AmountInputViewState3 inputViewState, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(inputViewState, "inputViewState");
        this.toolbarTitle = toolbarTitle;
        this.toolbarSubtitle = toolbarSubtitle;
        this.inputViewState = inputViewState;
        this.isContinueButtonEnabled = z;
        this.isContinueButtonLoading = z2;
    }

    public final StringResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final StringResource getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    public final AmountInputViewState3 getInputViewState() {
        return this.inputViewState;
    }

    public final boolean isContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    public final boolean isContinueButtonLoading() {
        return this.isContinueButtonLoading;
    }
}
