package com.robinhood.android.recommendations.retirement.p223ui.intro;

import com.robinhood.recommendations.retirement.models.p364ui.UiRecsRetirementIntro;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecsRetirementIntroViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/intro/RecsRetirementIntroViewState;", "", "intro", "Lcom/robinhood/recommendations/retirement/models/ui/UiRecsRetirementIntro;", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/recommendations/retirement/models/ui/UiRecsRetirementIntro;Lcom/robinhood/udf/UiEvent;)V", "getIntro", "()Lcom/robinhood/recommendations/retirement/models/ui/UiRecsRetirementIntro;", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecsRetirementIntroViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> errorEvent;
    private final UiRecsRetirementIntro intro;

    /* JADX WARN: Multi-variable type inference failed */
    public RecsRetirementIntroViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecsRetirementIntroViewState copy$default(RecsRetirementIntroViewState recsRetirementIntroViewState, UiRecsRetirementIntro uiRecsRetirementIntro, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            uiRecsRetirementIntro = recsRetirementIntroViewState.intro;
        }
        if ((i & 2) != 0) {
            uiEvent = recsRetirementIntroViewState.errorEvent;
        }
        return recsRetirementIntroViewState.copy(uiRecsRetirementIntro, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final UiRecsRetirementIntro getIntro() {
        return this.intro;
    }

    public final UiEvent<Throwable> component2() {
        return this.errorEvent;
    }

    public final RecsRetirementIntroViewState copy(UiRecsRetirementIntro intro, UiEvent<Throwable> errorEvent) {
        return new RecsRetirementIntroViewState(intro, errorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecsRetirementIntroViewState)) {
            return false;
        }
        RecsRetirementIntroViewState recsRetirementIntroViewState = (RecsRetirementIntroViewState) other;
        return Intrinsics.areEqual(this.intro, recsRetirementIntroViewState.intro) && Intrinsics.areEqual(this.errorEvent, recsRetirementIntroViewState.errorEvent);
    }

    public int hashCode() {
        UiRecsRetirementIntro uiRecsRetirementIntro = this.intro;
        int iHashCode = (uiRecsRetirementIntro == null ? 0 : uiRecsRetirementIntro.hashCode()) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "RecsRetirementIntroViewState(intro=" + this.intro + ", errorEvent=" + this.errorEvent + ")";
    }

    public RecsRetirementIntroViewState(UiRecsRetirementIntro uiRecsRetirementIntro, UiEvent<Throwable> uiEvent) {
        this.intro = uiRecsRetirementIntro;
        this.errorEvent = uiEvent;
    }

    public /* synthetic */ RecsRetirementIntroViewState(UiRecsRetirementIntro uiRecsRetirementIntro, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiRecsRetirementIntro, (i & 2) != 0 ? null : uiEvent);
    }

    public final UiRecsRetirementIntro getIntro() {
        return this.intro;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }
}
