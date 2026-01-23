package com.robinhood.android.matcha.p177ui.memo;

import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MemoInputViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/memo/MemoInputViewState;", "", MemoInputActivity.EXTRA_MEMO, "Landroidx/compose/ui/text/input/TextFieldValue;", "username", "", "isDoneButtonEnabled", "", "isDoneButtonLoading", "showValidationError", "validationComplete", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;ZZZLcom/robinhood/udf/UiEvent;)V", "getMemo", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getUsername", "()Ljava/lang/String;", "()Z", "getShowValidationError", "getValidationComplete", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MemoInputViewState {
    public static final int $stable = 8;
    private final boolean isDoneButtonEnabled;
    private final boolean isDoneButtonLoading;
    private final TextFieldValue memo;
    private final boolean showValidationError;
    private final String username;
    private final UiEvent<Unit> validationComplete;

    public static /* synthetic */ MemoInputViewState copy$default(MemoInputViewState memoInputViewState, TextFieldValue textFieldValue, String str, boolean z, boolean z2, boolean z3, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            textFieldValue = memoInputViewState.memo;
        }
        if ((i & 2) != 0) {
            str = memoInputViewState.username;
        }
        if ((i & 4) != 0) {
            z = memoInputViewState.isDoneButtonEnabled;
        }
        if ((i & 8) != 0) {
            z2 = memoInputViewState.isDoneButtonLoading;
        }
        if ((i & 16) != 0) {
            z3 = memoInputViewState.showValidationError;
        }
        if ((i & 32) != 0) {
            uiEvent = memoInputViewState.validationComplete;
        }
        boolean z4 = z3;
        UiEvent uiEvent2 = uiEvent;
        return memoInputViewState.copy(textFieldValue, str, z, z2, z4, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextFieldValue getMemo() {
        return this.memo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDoneButtonEnabled() {
        return this.isDoneButtonEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDoneButtonLoading() {
        return this.isDoneButtonLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowValidationError() {
        return this.showValidationError;
    }

    public final UiEvent<Unit> component6() {
        return this.validationComplete;
    }

    public final MemoInputViewState copy(TextFieldValue memo, String username, boolean isDoneButtonEnabled, boolean isDoneButtonLoading, boolean showValidationError, UiEvent<Unit> validationComplete) {
        Intrinsics.checkNotNullParameter(memo, "memo");
        return new MemoInputViewState(memo, username, isDoneButtonEnabled, isDoneButtonLoading, showValidationError, validationComplete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemoInputViewState)) {
            return false;
        }
        MemoInputViewState memoInputViewState = (MemoInputViewState) other;
        return Intrinsics.areEqual(this.memo, memoInputViewState.memo) && Intrinsics.areEqual(this.username, memoInputViewState.username) && this.isDoneButtonEnabled == memoInputViewState.isDoneButtonEnabled && this.isDoneButtonLoading == memoInputViewState.isDoneButtonLoading && this.showValidationError == memoInputViewState.showValidationError && Intrinsics.areEqual(this.validationComplete, memoInputViewState.validationComplete);
    }

    public int hashCode() {
        int iHashCode = this.memo.hashCode() * 31;
        String str = this.username;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isDoneButtonEnabled)) * 31) + Boolean.hashCode(this.isDoneButtonLoading)) * 31) + Boolean.hashCode(this.showValidationError)) * 31;
        UiEvent<Unit> uiEvent = this.validationComplete;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "MemoInputViewState(memo=" + this.memo + ", username=" + this.username + ", isDoneButtonEnabled=" + this.isDoneButtonEnabled + ", isDoneButtonLoading=" + this.isDoneButtonLoading + ", showValidationError=" + this.showValidationError + ", validationComplete=" + this.validationComplete + ")";
    }

    public MemoInputViewState(TextFieldValue memo, String str, boolean z, boolean z2, boolean z3, UiEvent<Unit> uiEvent) {
        Intrinsics.checkNotNullParameter(memo, "memo");
        this.memo = memo;
        this.username = str;
        this.isDoneButtonEnabled = z;
        this.isDoneButtonLoading = z2;
        this.showValidationError = z3;
        this.validationComplete = uiEvent;
    }

    public final TextFieldValue getMemo() {
        return this.memo;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean isDoneButtonEnabled() {
        return this.isDoneButtonEnabled;
    }

    public final boolean isDoneButtonLoading() {
        return this.isDoneButtonLoading;
    }

    public final boolean getShowValidationError() {
        return this.showValidationError;
    }

    public final UiEvent<Unit> getValidationComplete() {
        return this.validationComplete;
    }
}
