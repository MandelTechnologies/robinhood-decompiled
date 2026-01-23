package com.robinhood.android.common.options.upgrade;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsExperienceViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/OptionsExperienceViewState;", "", "onSubmitFinished", "Lcom/robinhood/udf/UiEvent;", "", "error", "", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getOnSubmitFinished", "()Lcom/robinhood/udf/UiEvent;", "getError", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OptionsExperienceViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> error;
    private final UiEvent<Unit> onSubmitFinished;

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsExperienceViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsExperienceViewState copy$default(OptionsExperienceViewState optionsExperienceViewState, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = optionsExperienceViewState.onSubmitFinished;
        }
        if ((i & 2) != 0) {
            uiEvent2 = optionsExperienceViewState.error;
        }
        return optionsExperienceViewState.copy(uiEvent, uiEvent2);
    }

    public final UiEvent<Unit> component1() {
        return this.onSubmitFinished;
    }

    public final UiEvent<Throwable> component2() {
        return this.error;
    }

    public final OptionsExperienceViewState copy(UiEvent<Unit> onSubmitFinished, UiEvent<Throwable> error) {
        return new OptionsExperienceViewState(onSubmitFinished, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsExperienceViewState)) {
            return false;
        }
        OptionsExperienceViewState optionsExperienceViewState = (OptionsExperienceViewState) other;
        return Intrinsics.areEqual(this.onSubmitFinished, optionsExperienceViewState.onSubmitFinished) && Intrinsics.areEqual(this.error, optionsExperienceViewState.error);
    }

    public int hashCode() {
        UiEvent<Unit> uiEvent = this.onSubmitFinished;
        int iHashCode = (uiEvent == null ? 0 : uiEvent.hashCode()) * 31;
        UiEvent<Throwable> uiEvent2 = this.error;
        return iHashCode + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "OptionsExperienceViewState(onSubmitFinished=" + this.onSubmitFinished + ", error=" + this.error + ")";
    }

    public OptionsExperienceViewState(UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2) {
        this.onSubmitFinished = uiEvent;
        this.error = uiEvent2;
    }

    public /* synthetic */ OptionsExperienceViewState(UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent, (i & 2) != 0 ? null : uiEvent2);
    }

    public final UiEvent<Unit> getOnSubmitFinished() {
        return this.onSubmitFinished;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }
}
