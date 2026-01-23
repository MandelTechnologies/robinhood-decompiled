package com.robinhood.android.microdeposits.p182ui;

import android.content.res.Resources;
import com.robinhood.android.microdeposits.C21805R;
import com.robinhood.librobinhood.data.store.AchRelationshipStore4;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyMicrodepositsDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\t\u0010!\u001a\u00020\u0003HÂ\u0003J\t\u0010\"\u001a\u00020\u0003HÂ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÂ\u0003JK\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u001bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState;", "", "inputOne", "Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState$MicrodepositInput;", "inputTwo", "verificationCompleteEvent", "Lcom/robinhood/udf/UiEvent;", "", "verificationErrorEvent", "", "verificationInProgress", "", "<init>", "(Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState$MicrodepositInput;Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState$MicrodepositInput;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Z)V", "getVerificationCompleteEvent", "()Lcom/robinhood/udf/UiEvent;", "getVerificationErrorEvent", "showProgressBar", "getShowProgressBar", "()Z", "isNumpadLoading", "clearInputFocus", "getClearInputFocus", "inputsEnabled", "getInputsEnabled", "isVerifyButtonEnabled", "getAmountOneErrorText", "", "resources", "Landroid/content/res/Resources;", "getAmountTwoErrorText", "getErrorText", "input", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "MicrodepositInput", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class VerifyMicrodepositsViewState {
    public static final int $stable = 8;
    private final boolean clearInputFocus;
    private final MicrodepositInput inputOne;
    private final MicrodepositInput inputTwo;
    private final boolean inputsEnabled;
    private final boolean isNumpadLoading;
    private final boolean isVerifyButtonEnabled;
    private final boolean showProgressBar;
    private final UiEvent<Unit> verificationCompleteEvent;
    private final UiEvent<Throwable> verificationErrorEvent;
    private final boolean verificationInProgress;

    public VerifyMicrodepositsViewState() {
        this(null, null, null, null, false, 31, null);
    }

    /* renamed from: component1, reason: from getter */
    private final MicrodepositInput getInputOne() {
        return this.inputOne;
    }

    /* renamed from: component2, reason: from getter */
    private final MicrodepositInput getInputTwo() {
        return this.inputTwo;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getVerificationInProgress() {
        return this.verificationInProgress;
    }

    public static /* synthetic */ VerifyMicrodepositsViewState copy$default(VerifyMicrodepositsViewState verifyMicrodepositsViewState, MicrodepositInput microdepositInput, MicrodepositInput microdepositInput2, UiEvent uiEvent, UiEvent uiEvent2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            microdepositInput = verifyMicrodepositsViewState.inputOne;
        }
        if ((i & 2) != 0) {
            microdepositInput2 = verifyMicrodepositsViewState.inputTwo;
        }
        if ((i & 4) != 0) {
            uiEvent = verifyMicrodepositsViewState.verificationCompleteEvent;
        }
        if ((i & 8) != 0) {
            uiEvent2 = verifyMicrodepositsViewState.verificationErrorEvent;
        }
        if ((i & 16) != 0) {
            z = verifyMicrodepositsViewState.verificationInProgress;
        }
        boolean z2 = z;
        UiEvent uiEvent3 = uiEvent;
        return verifyMicrodepositsViewState.copy(microdepositInput, microdepositInput2, uiEvent3, uiEvent2, z2);
    }

    public final UiEvent<Unit> component3() {
        return this.verificationCompleteEvent;
    }

    public final UiEvent<Throwable> component4() {
        return this.verificationErrorEvent;
    }

    public final VerifyMicrodepositsViewState copy(MicrodepositInput inputOne, MicrodepositInput inputTwo, UiEvent<Unit> verificationCompleteEvent, UiEvent<Throwable> verificationErrorEvent, boolean verificationInProgress) {
        Intrinsics.checkNotNullParameter(inputOne, "inputOne");
        Intrinsics.checkNotNullParameter(inputTwo, "inputTwo");
        return new VerifyMicrodepositsViewState(inputOne, inputTwo, verificationCompleteEvent, verificationErrorEvent, verificationInProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyMicrodepositsViewState)) {
            return false;
        }
        VerifyMicrodepositsViewState verifyMicrodepositsViewState = (VerifyMicrodepositsViewState) other;
        return Intrinsics.areEqual(this.inputOne, verifyMicrodepositsViewState.inputOne) && Intrinsics.areEqual(this.inputTwo, verifyMicrodepositsViewState.inputTwo) && Intrinsics.areEqual(this.verificationCompleteEvent, verifyMicrodepositsViewState.verificationCompleteEvent) && Intrinsics.areEqual(this.verificationErrorEvent, verifyMicrodepositsViewState.verificationErrorEvent) && this.verificationInProgress == verifyMicrodepositsViewState.verificationInProgress;
    }

    public int hashCode() {
        int iHashCode = ((this.inputOne.hashCode() * 31) + this.inputTwo.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.verificationCompleteEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.verificationErrorEvent;
        return ((iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0)) * 31) + Boolean.hashCode(this.verificationInProgress);
    }

    public String toString() {
        return "VerifyMicrodepositsViewState(inputOne=" + this.inputOne + ", inputTwo=" + this.inputTwo + ", verificationCompleteEvent=" + this.verificationCompleteEvent + ", verificationErrorEvent=" + this.verificationErrorEvent + ", verificationInProgress=" + this.verificationInProgress + ")";
    }

    public VerifyMicrodepositsViewState(MicrodepositInput inputOne, MicrodepositInput inputTwo, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2, boolean z) {
        Intrinsics.checkNotNullParameter(inputOne, "inputOne");
        Intrinsics.checkNotNullParameter(inputTwo, "inputTwo");
        this.inputOne = inputOne;
        this.inputTwo = inputTwo;
        this.verificationCompleteEvent = uiEvent;
        this.verificationErrorEvent = uiEvent2;
        this.verificationInProgress = z;
        this.showProgressBar = z;
        this.isNumpadLoading = z;
        this.clearInputFocus = z;
        this.inputsEnabled = !z;
        this.isVerifyButtonEnabled = (inputOne instanceof MicrodepositInput.Input) && AchRelationshipStore4.microdepositAmountValid(((MicrodepositInput.Input) inputOne).getAmount()) && (inputTwo instanceof MicrodepositInput.Input) && AchRelationshipStore4.microdepositAmountValid(((MicrodepositInput.Input) inputTwo).getAmount());
    }

    public /* synthetic */ VerifyMicrodepositsViewState(MicrodepositInput microdepositInput, MicrodepositInput microdepositInput2, UiEvent uiEvent, UiEvent uiEvent2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MicrodepositInput.UntouchedInput.INSTANCE : microdepositInput, (i & 2) != 0 ? MicrodepositInput.UntouchedInput.INSTANCE : microdepositInput2, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? null : uiEvent2, (i & 16) != 0 ? false : z);
    }

    public final UiEvent<Unit> getVerificationCompleteEvent() {
        return this.verificationCompleteEvent;
    }

    public final UiEvent<Throwable> getVerificationErrorEvent() {
        return this.verificationErrorEvent;
    }

    /* compiled from: VerifyMicrodepositsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState$MicrodepositInput;", "", "<init>", "()V", "UntouchedInput", "Input", "Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState$MicrodepositInput$Input;", "Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState$MicrodepositInput$UntouchedInput;", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class MicrodepositInput {
        public static final int $stable = 0;

        public /* synthetic */ MicrodepositInput(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: VerifyMicrodepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState$MicrodepositInput$UntouchedInput;", "Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState$MicrodepositInput;", "<init>", "()V", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class UntouchedInput extends MicrodepositInput {
            public static final int $stable = 0;
            public static final UntouchedInput INSTANCE = new UntouchedInput();

            private UntouchedInput() {
                super(null);
            }
        }

        private MicrodepositInput() {
        }

        /* compiled from: VerifyMicrodepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState$MicrodepositInput$Input;", "Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState$MicrodepositInput;", "amount", "", "<init>", "(Ljava/lang/Integer;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState$MicrodepositInput$Input;", "equals", "", "other", "", "hashCode", "toString", "", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Input extends MicrodepositInput {
            public static final int $stable = 0;
            private final Integer amount;

            public static /* synthetic */ Input copy$default(Input input, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = input.amount;
                }
                return input.copy(num);
            }

            /* renamed from: component1, reason: from getter */
            public final Integer getAmount() {
                return this.amount;
            }

            public final Input copy(Integer amount) {
                return new Input(amount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Input) && Intrinsics.areEqual(this.amount, ((Input) other).amount);
            }

            public int hashCode() {
                Integer num = this.amount;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public String toString() {
                return "Input(amount=" + this.amount + ")";
            }

            public Input(Integer num) {
                super(null);
                this.amount = num;
            }

            public final Integer getAmount() {
                return this.amount;
            }
        }
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    /* renamed from: isNumpadLoading, reason: from getter */
    public final boolean getIsNumpadLoading() {
        return this.isNumpadLoading;
    }

    public final boolean getClearInputFocus() {
        return this.clearInputFocus;
    }

    public final boolean getInputsEnabled() {
        return this.inputsEnabled;
    }

    /* renamed from: isVerifyButtonEnabled, reason: from getter */
    public final boolean getIsVerifyButtonEnabled() {
        return this.isVerifyButtonEnabled;
    }

    public final String getAmountOneErrorText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return getErrorText(this.inputOne, resources);
    }

    public final String getAmountTwoErrorText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return getErrorText(this.inputTwo, resources);
    }

    private final String getErrorText(MicrodepositInput input, Resources resources) {
        if (input instanceof MicrodepositInput.UntouchedInput) {
            return null;
        }
        if (!(input instanceof MicrodepositInput.Input)) {
            throw new NoWhenBranchMatchedException();
        }
        if (AchRelationshipStore4.microdepositAmountValid(((MicrodepositInput.Input) input).getAmount())) {
            return null;
        }
        return resources.getString(C21805R.string.iav_custom_verify_microdeposits_error_invalid_amount);
    }
}
