package com.robinhood.shared.education.p377ui.overview;

import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSeries;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationOverviewViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/education/ui/overview/EducationOverviewViewState;", "", "educationSeries", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSeries;", "failure", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSeries;Lcom/robinhood/udf/UiEvent;)V", "getFailure", "()Lcom/robinhood/udf/UiEvent;", "isLoading", "", "()Z", "title", "", "getTitle", "()Ljava/lang/CharSequence;", "lessons", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "getLessons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EducationOverviewViewState {
    public static final int $stable = 8;
    private final EducationSeries educationSeries;
    private final UiEvent<Unit> failure;
    private final boolean isLoading;
    private final List<EducationLessonPreview> lessons;
    private final CharSequence title;

    /* JADX WARN: Multi-variable type inference failed */
    public EducationOverviewViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final EducationSeries getEducationSeries() {
        return this.educationSeries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EducationOverviewViewState copy$default(EducationOverviewViewState educationOverviewViewState, EducationSeries educationSeries, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            educationSeries = educationOverviewViewState.educationSeries;
        }
        if ((i & 2) != 0) {
            uiEvent = educationOverviewViewState.failure;
        }
        return educationOverviewViewState.copy(educationSeries, uiEvent);
    }

    public final UiEvent<Unit> component2() {
        return this.failure;
    }

    public final EducationOverviewViewState copy(EducationSeries educationSeries, UiEvent<Unit> failure) {
        return new EducationOverviewViewState(educationSeries, failure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationOverviewViewState)) {
            return false;
        }
        EducationOverviewViewState educationOverviewViewState = (EducationOverviewViewState) other;
        return Intrinsics.areEqual(this.educationSeries, educationOverviewViewState.educationSeries) && Intrinsics.areEqual(this.failure, educationOverviewViewState.failure);
    }

    public int hashCode() {
        EducationSeries educationSeries = this.educationSeries;
        int iHashCode = (educationSeries == null ? 0 : educationSeries.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.failure;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "EducationOverviewViewState(educationSeries=" + this.educationSeries + ", failure=" + this.failure + ")";
    }

    public EducationOverviewViewState(EducationSeries educationSeries, UiEvent<Unit> uiEvent) {
        this.educationSeries = educationSeries;
        this.failure = uiEvent;
        this.isLoading = educationSeries == null;
        this.title = educationSeries != null ? educationSeries.getTitle() : null;
        this.lessons = educationSeries != null ? educationSeries.getLessons() : null;
    }

    public /* synthetic */ EducationOverviewViewState(EducationSeries educationSeries, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : educationSeries, (i & 2) != 0 ? null : uiEvent);
    }

    public final UiEvent<Unit> getFailure() {
        return this.failure;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final List<EducationLessonPreview> getLessons() {
        return this.lessons;
    }
}
