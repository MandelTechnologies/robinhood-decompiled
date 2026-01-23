package com.robinhood.android.matcha.p177ui.memo;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MemoInputDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/memo/MemoInputDataState;", "", MemoInputActivity.EXTRA_MEMO, "Landroidx/compose/ui/text/input/TextFieldValue;", "username", "", "validationInProgress", "", "validationError", "validationComplete", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;ZZLcom/robinhood/udf/UiEvent;)V", "getMemo", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getUsername", "()Ljava/lang/String;", "getValidationInProgress", "()Z", "getValidationError", "getValidationComplete", "()Lcom/robinhood/udf/UiEvent;", "addEmoji", AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI, "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MemoInputDataState {
    public static final int $stable = 8;
    private final TextFieldValue memo;
    private final String username;
    private final UiEvent<Unit> validationComplete;
    private final boolean validationError;
    private final boolean validationInProgress;

    public static /* synthetic */ MemoInputDataState copy$default(MemoInputDataState memoInputDataState, TextFieldValue textFieldValue, String str, boolean z, boolean z2, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            textFieldValue = memoInputDataState.memo;
        }
        if ((i & 2) != 0) {
            str = memoInputDataState.username;
        }
        if ((i & 4) != 0) {
            z = memoInputDataState.validationInProgress;
        }
        if ((i & 8) != 0) {
            z2 = memoInputDataState.validationError;
        }
        if ((i & 16) != 0) {
            uiEvent = memoInputDataState.validationComplete;
        }
        UiEvent uiEvent2 = uiEvent;
        boolean z3 = z;
        return memoInputDataState.copy(textFieldValue, str, z3, z2, uiEvent2);
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
    public final boolean getValidationInProgress() {
        return this.validationInProgress;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getValidationError() {
        return this.validationError;
    }

    public final UiEvent<Unit> component5() {
        return this.validationComplete;
    }

    public final MemoInputDataState copy(TextFieldValue memo, String username, boolean validationInProgress, boolean validationError, UiEvent<Unit> validationComplete) {
        Intrinsics.checkNotNullParameter(memo, "memo");
        return new MemoInputDataState(memo, username, validationInProgress, validationError, validationComplete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemoInputDataState)) {
            return false;
        }
        MemoInputDataState memoInputDataState = (MemoInputDataState) other;
        return Intrinsics.areEqual(this.memo, memoInputDataState.memo) && Intrinsics.areEqual(this.username, memoInputDataState.username) && this.validationInProgress == memoInputDataState.validationInProgress && this.validationError == memoInputDataState.validationError && Intrinsics.areEqual(this.validationComplete, memoInputDataState.validationComplete);
    }

    public int hashCode() {
        int iHashCode = this.memo.hashCode() * 31;
        String str = this.username;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.validationInProgress)) * 31) + Boolean.hashCode(this.validationError)) * 31;
        UiEvent<Unit> uiEvent = this.validationComplete;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "MemoInputDataState(memo=" + this.memo + ", username=" + this.username + ", validationInProgress=" + this.validationInProgress + ", validationError=" + this.validationError + ", validationComplete=" + this.validationComplete + ")";
    }

    public MemoInputDataState(TextFieldValue memo, String str, boolean z, boolean z2, UiEvent<Unit> uiEvent) {
        Intrinsics.checkNotNullParameter(memo, "memo");
        this.memo = memo;
        this.username = str;
        this.validationInProgress = z;
        this.validationError = z2;
        this.validationComplete = uiEvent;
    }

    public /* synthetic */ MemoInputDataState(TextFieldValue textFieldValue, String str, boolean z, boolean z2, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldValue, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : uiEvent);
    }

    public final TextFieldValue getMemo() {
        return this.memo;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean getValidationInProgress() {
        return this.validationInProgress;
    }

    public final boolean getValidationError() {
        return this.validationError;
    }

    public final UiEvent<Unit> getValidationComplete() {
        return this.validationComplete;
    }

    public final TextFieldValue addEmoji(String emoji) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        String text = this.memo.getText();
        if (StringsKt.isBlank(text)) {
            return new TextFieldValue(emoji, TextRange2.TextRange(emoji.length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
        }
        String str = PlaceholderUtils.XXShortPlaceholderText + emoji;
        String string2 = new StringBuilder(text).insert(TextRange.m7641getEndimpl(this.memo.getSelection()), str).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new TextFieldValue(string2, TextRange2.TextRange(TextRange.m7641getEndimpl(this.memo.getSelection()) + str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }
}
