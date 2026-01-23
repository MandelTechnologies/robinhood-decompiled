package com.robinhood.android.directdeposit.p101ui.prefilled.partial.input;

import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.models.p355ui.DirectDepositAmount;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreFilledFormAmountInputState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J/\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/partial/input/PreFilledFormAmountInputState;", "", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "Lcom/robinhood/models/ui/DirectDepositAmount$PartialPaycheck;", "inputCharArray", "", "continueClickEvent", "Lcom/robinhood/udf/UiEvent;", "<init>", "(Lcom/robinhood/models/ui/DirectDepositAmount$PartialPaycheck;[CLcom/robinhood/udf/UiEvent;)V", "(Lcom/robinhood/models/ui/DirectDepositAmount$PartialPaycheck;)V", "getDepositAmount", "()Lcom/robinhood/models/ui/DirectDepositAmount$PartialPaycheck;", "getInputCharArray", "()[C", "getContinueClickEvent", "()Lcom/robinhood/udf/UiEvent;", "isContinueButtonEnabled", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class PreFilledFormAmountInputState {
    public static final int $stable = 8;
    private final UiEvent<DirectDepositAmount.PartialPaycheck> continueClickEvent;
    private final DirectDepositAmount.PartialPaycheck depositAmount;
    private final char[] inputCharArray;
    private final boolean isContinueButtonEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreFilledFormAmountInputState copy$default(PreFilledFormAmountInputState preFilledFormAmountInputState, DirectDepositAmount.PartialPaycheck partialPaycheck, char[] cArr, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            partialPaycheck = preFilledFormAmountInputState.depositAmount;
        }
        if ((i & 2) != 0) {
            cArr = preFilledFormAmountInputState.inputCharArray;
        }
        if ((i & 4) != 0) {
            uiEvent = preFilledFormAmountInputState.continueClickEvent;
        }
        return preFilledFormAmountInputState.copy(partialPaycheck, cArr, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final DirectDepositAmount.PartialPaycheck getDepositAmount() {
        return this.depositAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final char[] getInputCharArray() {
        return this.inputCharArray;
    }

    public final UiEvent<DirectDepositAmount.PartialPaycheck> component3() {
        return this.continueClickEvent;
    }

    public final PreFilledFormAmountInputState copy(DirectDepositAmount.PartialPaycheck depositAmount, char[] inputCharArray, UiEvent<DirectDepositAmount.PartialPaycheck> continueClickEvent) {
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        Intrinsics.checkNotNullParameter(inputCharArray, "inputCharArray");
        return new PreFilledFormAmountInputState(depositAmount, inputCharArray, continueClickEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreFilledFormAmountInputState)) {
            return false;
        }
        PreFilledFormAmountInputState preFilledFormAmountInputState = (PreFilledFormAmountInputState) other;
        return Intrinsics.areEqual(this.depositAmount, preFilledFormAmountInputState.depositAmount) && Intrinsics.areEqual(this.inputCharArray, preFilledFormAmountInputState.inputCharArray) && Intrinsics.areEqual(this.continueClickEvent, preFilledFormAmountInputState.continueClickEvent);
    }

    public int hashCode() {
        int iHashCode = ((this.depositAmount.hashCode() * 31) + Arrays.hashCode(this.inputCharArray)) * 31;
        UiEvent<DirectDepositAmount.PartialPaycheck> uiEvent = this.continueClickEvent;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "PreFilledFormAmountInputState(depositAmount=" + this.depositAmount + ", inputCharArray=" + Arrays.toString(this.inputCharArray) + ", continueClickEvent=" + this.continueClickEvent + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PreFilledFormAmountInputState(DirectDepositAmount.PartialPaycheck depositAmount, char[] inputCharArray, UiEvent<DirectDepositAmount.PartialPaycheck> uiEvent) {
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        Intrinsics.checkNotNullParameter(inputCharArray, "inputCharArray");
        this.depositAmount = depositAmount;
        this.inputCharArray = inputCharArray;
        this.continueClickEvent = uiEvent;
        boolean z = false;
        if (depositAmount instanceof DirectDepositAmount.PartialPaycheck.Dollars) {
            if (!Intrinsics.areEqual(((DirectDepositAmount.PartialPaycheck.Dollars) depositAmount).getAmount(), BigDecimal.ZERO)) {
                z = true;
            }
        } else {
            if (!(depositAmount instanceof DirectDepositAmount.PartialPaycheck.Percent)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((DirectDepositAmount.PartialPaycheck.Percent) depositAmount).getPercent() != 0) {
            }
        }
        this.isContinueButtonEnabled = z;
    }

    public /* synthetic */ PreFilledFormAmountInputState(DirectDepositAmount.PartialPaycheck partialPaycheck, char[] cArr, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(partialPaycheck, cArr, (i & 4) != 0 ? null : uiEvent);
    }

    public final DirectDepositAmount.PartialPaycheck getDepositAmount() {
        return this.depositAmount;
    }

    public final char[] getInputCharArray() {
        return this.inputCharArray;
    }

    public final UiEvent<DirectDepositAmount.PartialPaycheck> getContinueClickEvent() {
        return this.continueClickEvent;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreFilledFormAmountInputState(DirectDepositAmount.PartialPaycheck depositAmount) {
        this(depositAmount, PreFilledFormAmountInputState2.toFormattedCharArray(depositAmount), null, 4, null);
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
    }

    /* renamed from: isContinueButtonEnabled, reason: from getter */
    public final boolean getIsContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }
}
