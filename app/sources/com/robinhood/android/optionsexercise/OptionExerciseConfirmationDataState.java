package com.robinhood.android.optionsexercise;

import com.robinhood.models.api.ApiOptionExerciseChecks;
import com.robinhood.models.p320db.OptionEvent;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p355ui.UiOptionInstrument;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionExerciseConfirmationDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationDataState;", "", "optionEvent", "Lcom/robinhood/models/db/OptionEvent;", "isShortSellingExerciseEnabled", "", "uiOptionInstrument", "Lcom/robinhood/models/ui/UiOptionInstrument;", "equityPosition", "Lcom/robinhood/models/db/Position;", "exerciseChecks", "Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "<init>", "(Lcom/robinhood/models/db/OptionEvent;ZLcom/robinhood/models/ui/UiOptionInstrument;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/api/ApiOptionExerciseChecks;)V", "getOptionEvent", "()Lcom/robinhood/models/db/OptionEvent;", "()Z", "getUiOptionInstrument", "()Lcom/robinhood/models/ui/UiOptionInstrument;", "getEquityPosition", "()Lcom/robinhood/models/db/Position;", "getExerciseChecks", "()Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionExerciseConfirmationDataState {
    public static final int $stable = 8;
    private final Position equityPosition;
    private final ApiOptionExerciseChecks exerciseChecks;
    private final boolean isShortSellingExerciseEnabled;
    private final OptionEvent optionEvent;
    private final UiOptionInstrument uiOptionInstrument;

    public OptionExerciseConfirmationDataState() {
        this(null, false, null, null, null, 31, null);
    }

    public static /* synthetic */ OptionExerciseConfirmationDataState copy$default(OptionExerciseConfirmationDataState optionExerciseConfirmationDataState, OptionEvent optionEvent, boolean z, UiOptionInstrument uiOptionInstrument, Position position, ApiOptionExerciseChecks apiOptionExerciseChecks, int i, Object obj) {
        if ((i & 1) != 0) {
            optionEvent = optionExerciseConfirmationDataState.optionEvent;
        }
        if ((i & 2) != 0) {
            z = optionExerciseConfirmationDataState.isShortSellingExerciseEnabled;
        }
        if ((i & 4) != 0) {
            uiOptionInstrument = optionExerciseConfirmationDataState.uiOptionInstrument;
        }
        if ((i & 8) != 0) {
            position = optionExerciseConfirmationDataState.equityPosition;
        }
        if ((i & 16) != 0) {
            apiOptionExerciseChecks = optionExerciseConfirmationDataState.exerciseChecks;
        }
        ApiOptionExerciseChecks apiOptionExerciseChecks2 = apiOptionExerciseChecks;
        UiOptionInstrument uiOptionInstrument2 = uiOptionInstrument;
        return optionExerciseConfirmationDataState.copy(optionEvent, z, uiOptionInstrument2, position, apiOptionExerciseChecks2);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionEvent getOptionEvent() {
        return this.optionEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsShortSellingExerciseEnabled() {
        return this.isShortSellingExerciseEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final UiOptionInstrument getUiOptionInstrument() {
        return this.uiOptionInstrument;
    }

    /* renamed from: component4, reason: from getter */
    public final Position getEquityPosition() {
        return this.equityPosition;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiOptionExerciseChecks getExerciseChecks() {
        return this.exerciseChecks;
    }

    public final OptionExerciseConfirmationDataState copy(OptionEvent optionEvent, boolean isShortSellingExerciseEnabled, UiOptionInstrument uiOptionInstrument, Position equityPosition, ApiOptionExerciseChecks exerciseChecks) {
        return new OptionExerciseConfirmationDataState(optionEvent, isShortSellingExerciseEnabled, uiOptionInstrument, equityPosition, exerciseChecks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionExerciseConfirmationDataState)) {
            return false;
        }
        OptionExerciseConfirmationDataState optionExerciseConfirmationDataState = (OptionExerciseConfirmationDataState) other;
        return Intrinsics.areEqual(this.optionEvent, optionExerciseConfirmationDataState.optionEvent) && this.isShortSellingExerciseEnabled == optionExerciseConfirmationDataState.isShortSellingExerciseEnabled && Intrinsics.areEqual(this.uiOptionInstrument, optionExerciseConfirmationDataState.uiOptionInstrument) && Intrinsics.areEqual(this.equityPosition, optionExerciseConfirmationDataState.equityPosition) && Intrinsics.areEqual(this.exerciseChecks, optionExerciseConfirmationDataState.exerciseChecks);
    }

    public int hashCode() {
        OptionEvent optionEvent = this.optionEvent;
        int iHashCode = (((optionEvent == null ? 0 : optionEvent.hashCode()) * 31) + Boolean.hashCode(this.isShortSellingExerciseEnabled)) * 31;
        UiOptionInstrument uiOptionInstrument = this.uiOptionInstrument;
        int iHashCode2 = (iHashCode + (uiOptionInstrument == null ? 0 : uiOptionInstrument.hashCode())) * 31;
        Position position = this.equityPosition;
        int iHashCode3 = (iHashCode2 + (position == null ? 0 : position.hashCode())) * 31;
        ApiOptionExerciseChecks apiOptionExerciseChecks = this.exerciseChecks;
        return iHashCode3 + (apiOptionExerciseChecks != null ? apiOptionExerciseChecks.hashCode() : 0);
    }

    public String toString() {
        return "OptionExerciseConfirmationDataState(optionEvent=" + this.optionEvent + ", isShortSellingExerciseEnabled=" + this.isShortSellingExerciseEnabled + ", uiOptionInstrument=" + this.uiOptionInstrument + ", equityPosition=" + this.equityPosition + ", exerciseChecks=" + this.exerciseChecks + ")";
    }

    public OptionExerciseConfirmationDataState(OptionEvent optionEvent, boolean z, UiOptionInstrument uiOptionInstrument, Position position, ApiOptionExerciseChecks apiOptionExerciseChecks) {
        this.optionEvent = optionEvent;
        this.isShortSellingExerciseEnabled = z;
        this.uiOptionInstrument = uiOptionInstrument;
        this.equityPosition = position;
        this.exerciseChecks = apiOptionExerciseChecks;
    }

    public /* synthetic */ OptionExerciseConfirmationDataState(OptionEvent optionEvent, boolean z, UiOptionInstrument uiOptionInstrument, Position position, ApiOptionExerciseChecks apiOptionExerciseChecks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : optionEvent, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : uiOptionInstrument, (i & 8) != 0 ? null : position, (i & 16) != 0 ? null : apiOptionExerciseChecks);
    }

    public final OptionEvent getOptionEvent() {
        return this.optionEvent;
    }

    public final boolean isShortSellingExerciseEnabled() {
        return this.isShortSellingExerciseEnabled;
    }

    public final UiOptionInstrument getUiOptionInstrument() {
        return this.uiOptionInstrument;
    }

    public final Position getEquityPosition() {
        return this.equityPosition;
    }

    public final ApiOptionExerciseChecks getExerciseChecks() {
        return this.exerciseChecks;
    }
}
