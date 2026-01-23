package com.robinhood.android.optionsexercise;

import com.robinhood.models.p320db.OptionEvent;
import com.robinhood.models.p355ui.UiOptionInstrument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionExerciseConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationViewState;", "", "optionEvent", "Lcom/robinhood/models/db/OptionEvent;", "uiOptionInstrument", "Lcom/robinhood/models/ui/UiOptionInstrument;", "totalValueRowState", "Lcom/robinhood/android/optionsexercise/TotalValueRowState;", "<init>", "(Lcom/robinhood/models/db/OptionEvent;Lcom/robinhood/models/ui/UiOptionInstrument;Lcom/robinhood/android/optionsexercise/TotalValueRowState;)V", "getOptionEvent", "()Lcom/robinhood/models/db/OptionEvent;", "getUiOptionInstrument", "()Lcom/robinhood/models/ui/UiOptionInstrument;", "getTotalValueRowState", "()Lcom/robinhood/android/optionsexercise/TotalValueRowState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionExerciseConfirmationViewState {
    public static final int $stable = 8;
    private final OptionEvent optionEvent;
    private final TotalValueRowState totalValueRowState;
    private final UiOptionInstrument uiOptionInstrument;

    public static /* synthetic */ OptionExerciseConfirmationViewState copy$default(OptionExerciseConfirmationViewState optionExerciseConfirmationViewState, OptionEvent optionEvent, UiOptionInstrument uiOptionInstrument, TotalValueRowState totalValueRowState, int i, Object obj) {
        if ((i & 1) != 0) {
            optionEvent = optionExerciseConfirmationViewState.optionEvent;
        }
        if ((i & 2) != 0) {
            uiOptionInstrument = optionExerciseConfirmationViewState.uiOptionInstrument;
        }
        if ((i & 4) != 0) {
            totalValueRowState = optionExerciseConfirmationViewState.totalValueRowState;
        }
        return optionExerciseConfirmationViewState.copy(optionEvent, uiOptionInstrument, totalValueRowState);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionEvent getOptionEvent() {
        return this.optionEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final UiOptionInstrument getUiOptionInstrument() {
        return this.uiOptionInstrument;
    }

    /* renamed from: component3, reason: from getter */
    public final TotalValueRowState getTotalValueRowState() {
        return this.totalValueRowState;
    }

    public final OptionExerciseConfirmationViewState copy(OptionEvent optionEvent, UiOptionInstrument uiOptionInstrument, TotalValueRowState totalValueRowState) {
        return new OptionExerciseConfirmationViewState(optionEvent, uiOptionInstrument, totalValueRowState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionExerciseConfirmationViewState)) {
            return false;
        }
        OptionExerciseConfirmationViewState optionExerciseConfirmationViewState = (OptionExerciseConfirmationViewState) other;
        return Intrinsics.areEqual(this.optionEvent, optionExerciseConfirmationViewState.optionEvent) && Intrinsics.areEqual(this.uiOptionInstrument, optionExerciseConfirmationViewState.uiOptionInstrument) && Intrinsics.areEqual(this.totalValueRowState, optionExerciseConfirmationViewState.totalValueRowState);
    }

    public int hashCode() {
        OptionEvent optionEvent = this.optionEvent;
        int iHashCode = (optionEvent == null ? 0 : optionEvent.hashCode()) * 31;
        UiOptionInstrument uiOptionInstrument = this.uiOptionInstrument;
        int iHashCode2 = (iHashCode + (uiOptionInstrument == null ? 0 : uiOptionInstrument.hashCode())) * 31;
        TotalValueRowState totalValueRowState = this.totalValueRowState;
        return iHashCode2 + (totalValueRowState != null ? totalValueRowState.hashCode() : 0);
    }

    public String toString() {
        return "OptionExerciseConfirmationViewState(optionEvent=" + this.optionEvent + ", uiOptionInstrument=" + this.uiOptionInstrument + ", totalValueRowState=" + this.totalValueRowState + ")";
    }

    public OptionExerciseConfirmationViewState(OptionEvent optionEvent, UiOptionInstrument uiOptionInstrument, TotalValueRowState totalValueRowState) {
        this.optionEvent = optionEvent;
        this.uiOptionInstrument = uiOptionInstrument;
        this.totalValueRowState = totalValueRowState;
    }

    public final OptionEvent getOptionEvent() {
        return this.optionEvent;
    }

    public final UiOptionInstrument getUiOptionInstrument() {
        return this.uiOptionInstrument;
    }

    public final TotalValueRowState getTotalValueRowState() {
        return this.totalValueRowState;
    }
}
