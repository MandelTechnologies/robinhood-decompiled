package com.robinhood.android.educationtour;

import com.robinhood.shared.models.api.bonfire.education.tour.EducationTourSection;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTour;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTourOutro;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EducationTourOverlayViewState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001HBm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\t\u0010;\u001a\u00020\u0003HÂ\u0003J\t\u0010<\u001a\u00020\u0005HÂ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jo\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010D\u001a\u00020\u00032\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0007HÖ\u0001J\t\u0010G\u001a\u00020\nHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0014R\u0011\u0010(\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R\u0013\u0010*\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0018R\u0011\u00103\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0011\u00108\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b9\u00105¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourOverlayViewState;", "", "noSkip", "", "status", "Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status;", "currentSectionIndex", "", "availableElementIds", "", "", "showOutro", "shouldAnimateToNextSection", "showOutroUiEvent", "Lcom/robinhood/udf/UiEvent;", "", "exitEducationTourEvent", "<init>", "(ZLcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status;ILjava/util/Set;ZZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getCurrentSectionIndex", "()I", "getAvailableElementIds", "()Ljava/util/Set;", "getShowOutro", "()Z", "getShouldAnimateToNextSection", "getShowOutroUiEvent", "()Lcom/robinhood/udf/UiEvent;", "getExitEducationTourEvent", "showLoading", "getShowLoading", "showContent", "getShowContent", "showErrorEvent", "getShowErrorEvent", "availableSections", "", "Lcom/robinhood/shared/models/api/bonfire/education/tour/EducationTourSection;", "sectionsSize", "getSectionsSize", "maxSectionIndex", "getMaxSectionIndex", "currentSection", "getCurrentSection", "()Lcom/robinhood/shared/models/api/bonfire/education/tour/EducationTourSection;", "displayedOutro", "Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTourOutro;", "getDisplayedOutro", "()Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTourOutro;", "hasOutro", "getHasOutro", "trackingId", "getTrackingId", "()Ljava/lang/String;", "tourAnalyticsId", "getTourAnalyticsId", "sectionAnalyticsId", "getSectionAnalyticsId", "getAvailableSections", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "Status", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class EducationTourOverlayViewState {
    public static final int $stable = 8;
    private final Set<String> availableElementIds;
    private final List<EducationTourSection> availableSections;
    private final EducationTourSection currentSection;
    private final int currentSectionIndex;
    private final EducationTourOutro displayedOutro;
    private final UiEvent<Unit> exitEducationTourEvent;
    private final int maxSectionIndex;
    private final boolean noSkip;
    private final String sectionAnalyticsId;
    private final int sectionsSize;
    private final boolean shouldAnimateToNextSection;
    private final boolean showContent;
    private final boolean showErrorEvent;
    private final boolean showLoading;
    private final boolean showOutro;
    private final UiEvent<Unit> showOutroUiEvent;
    private final Status status;
    private final String tourAnalyticsId;
    private final String trackingId;

    public EducationTourOverlayViewState() {
        this(false, null, 0, null, false, false, null, null, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    private final boolean getNoSkip() {
        return this.noSkip;
    }

    /* renamed from: component2, reason: from getter */
    private final Status getStatus() {
        return this.status;
    }

    public static /* synthetic */ EducationTourOverlayViewState copy$default(EducationTourOverlayViewState educationTourOverlayViewState, boolean z, Status status, int i, Set set, boolean z2, boolean z3, UiEvent uiEvent, UiEvent uiEvent2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = educationTourOverlayViewState.noSkip;
        }
        if ((i2 & 2) != 0) {
            status = educationTourOverlayViewState.status;
        }
        if ((i2 & 4) != 0) {
            i = educationTourOverlayViewState.currentSectionIndex;
        }
        if ((i2 & 8) != 0) {
            set = educationTourOverlayViewState.availableElementIds;
        }
        if ((i2 & 16) != 0) {
            z2 = educationTourOverlayViewState.showOutro;
        }
        if ((i2 & 32) != 0) {
            z3 = educationTourOverlayViewState.shouldAnimateToNextSection;
        }
        if ((i2 & 64) != 0) {
            uiEvent = educationTourOverlayViewState.showOutroUiEvent;
        }
        if ((i2 & 128) != 0) {
            uiEvent2 = educationTourOverlayViewState.exitEducationTourEvent;
        }
        UiEvent uiEvent3 = uiEvent;
        UiEvent uiEvent4 = uiEvent2;
        boolean z4 = z2;
        boolean z5 = z3;
        return educationTourOverlayViewState.copy(z, status, i, set, z4, z5, uiEvent3, uiEvent4);
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrentSectionIndex() {
        return this.currentSectionIndex;
    }

    public final Set<String> component4() {
        return this.availableElementIds;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowOutro() {
        return this.showOutro;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldAnimateToNextSection() {
        return this.shouldAnimateToNextSection;
    }

    public final UiEvent<Unit> component7() {
        return this.showOutroUiEvent;
    }

    public final UiEvent<Unit> component8() {
        return this.exitEducationTourEvent;
    }

    public final EducationTourOverlayViewState copy(boolean noSkip, Status status, int currentSectionIndex, Set<String> availableElementIds, boolean showOutro, boolean shouldAnimateToNextSection, UiEvent<Unit> showOutroUiEvent, UiEvent<Unit> exitEducationTourEvent) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(availableElementIds, "availableElementIds");
        return new EducationTourOverlayViewState(noSkip, status, currentSectionIndex, availableElementIds, showOutro, shouldAnimateToNextSection, showOutroUiEvent, exitEducationTourEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationTourOverlayViewState)) {
            return false;
        }
        EducationTourOverlayViewState educationTourOverlayViewState = (EducationTourOverlayViewState) other;
        return this.noSkip == educationTourOverlayViewState.noSkip && Intrinsics.areEqual(this.status, educationTourOverlayViewState.status) && this.currentSectionIndex == educationTourOverlayViewState.currentSectionIndex && Intrinsics.areEqual(this.availableElementIds, educationTourOverlayViewState.availableElementIds) && this.showOutro == educationTourOverlayViewState.showOutro && this.shouldAnimateToNextSection == educationTourOverlayViewState.shouldAnimateToNextSection && Intrinsics.areEqual(this.showOutroUiEvent, educationTourOverlayViewState.showOutroUiEvent) && Intrinsics.areEqual(this.exitEducationTourEvent, educationTourOverlayViewState.exitEducationTourEvent);
    }

    public int hashCode() {
        int iHashCode = ((((((((((Boolean.hashCode(this.noSkip) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.currentSectionIndex)) * 31) + this.availableElementIds.hashCode()) * 31) + Boolean.hashCode(this.showOutro)) * 31) + Boolean.hashCode(this.shouldAnimateToNextSection)) * 31;
        UiEvent<Unit> uiEvent = this.showOutroUiEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.exitEducationTourEvent;
        return iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "EducationTourOverlayViewState(noSkip=" + this.noSkip + ", status=" + this.status + ", currentSectionIndex=" + this.currentSectionIndex + ", availableElementIds=" + this.availableElementIds + ", showOutro=" + this.showOutro + ", shouldAnimateToNextSection=" + this.shouldAnimateToNextSection + ", showOutroUiEvent=" + this.showOutroUiEvent + ", exitEducationTourEvent=" + this.exitEducationTourEvent + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EducationTourOverlayViewState(boolean z, Status status, int i, Set<String> availableElementIds, boolean z2, boolean z3, UiEvent<Unit> uiEvent, UiEvent<Unit> uiEvent2) {
        EducationTourOutro outro;
        EducationTour tour;
        EducationTour tour2;
        EducationTour tour3;
        UiEvent<Unit> errorLoadingTourEvent;
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(availableElementIds, "availableElementIds");
        this.noSkip = z;
        this.status = status;
        this.currentSectionIndex = i;
        this.availableElementIds = availableElementIds;
        this.showOutro = z2;
        this.shouldAnimateToNextSection = z3;
        this.showOutroUiEvent = uiEvent;
        this.exitEducationTourEvent = uiEvent2;
        this.showLoading = status instanceof Status.Loading;
        this.showContent = (status instanceof Status.Success) && !z2;
        Status.Failure failure = status instanceof Status.Failure ? (Status.Failure) status : null;
        this.showErrorEvent = ((failure == null || (errorLoadingTourEvent = failure.getErrorLoadingTourEvent()) == null) ? null : errorLoadingTourEvent.consume()) != null || (status instanceof Status.NotEligibleForTour);
        List<EducationTourSection> availableSections = getAvailableSections();
        this.availableSections = availableSections;
        int size = availableSections.size();
        this.sectionsSize = size;
        this.maxSectionIndex = size - 1;
        EducationTourSection educationTourSection = (EducationTourSection) CollectionsKt.getOrNull(availableSections, i);
        this.currentSection = educationTourSection;
        if (z2) {
            Status.Success success = status instanceof Status.Success ? (Status.Success) status : null;
            if (success != null && (tour3 = success.getTour()) != null) {
                outro = tour3.getOutro();
            }
        } else {
            outro = null;
        }
        this.displayedOutro = outro;
        Status.Success success2 = status instanceof Status.Success ? (Status.Success) status : null;
        String trackingId = (success2 == null || (tour2 = success2.getTour()) == null) ? null : tour2.getTrackingId();
        this.trackingId = trackingId == null ? "" : trackingId;
        Status.Success success3 = status instanceof Status.Success ? (Status.Success) status : null;
        String analyticsId = (success3 == null || (tour = success3.getTour()) == null) ? null : tour.getAnalyticsId();
        this.tourAnalyticsId = analyticsId == null ? "" : analyticsId;
        String analyticsId2 = educationTourSection != null ? educationTourSection.getAnalyticsId() : null;
        this.sectionAnalyticsId = analyticsId2 != null ? analyticsId2 : "";
    }

    public /* synthetic */ EducationTourOverlayViewState(boolean z, Status status, int i, Set set, boolean z2, boolean z3, UiEvent uiEvent, UiEvent uiEvent2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? Status.Loading.INSTANCE : status, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new HashSet() : set, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? true : z3, (i2 & 64) != 0 ? null : uiEvent, (i2 & 128) != 0 ? null : uiEvent2);
    }

    public final int getCurrentSectionIndex() {
        return this.currentSectionIndex;
    }

    public final Set<String> getAvailableElementIds() {
        return this.availableElementIds;
    }

    public final boolean getShowOutro() {
        return this.showOutro;
    }

    public final boolean getShouldAnimateToNextSection() {
        return this.shouldAnimateToNextSection;
    }

    public final UiEvent<Unit> getShowOutroUiEvent() {
        return this.showOutroUiEvent;
    }

    public final UiEvent<Unit> getExitEducationTourEvent() {
        return this.exitEducationTourEvent;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getShowContent() {
        return this.showContent;
    }

    public final boolean getShowErrorEvent() {
        return this.showErrorEvent;
    }

    public final int getSectionsSize() {
        return this.sectionsSize;
    }

    public final int getMaxSectionIndex() {
        return this.maxSectionIndex;
    }

    public final EducationTourSection getCurrentSection() {
        return this.currentSection;
    }

    public final EducationTourOutro getDisplayedOutro() {
        return this.displayedOutro;
    }

    public final boolean getHasOutro() {
        EducationTour tour;
        Status status = this.status;
        EducationTourOutro outro = null;
        Status.Success success = status instanceof Status.Success ? (Status.Success) status : null;
        if (success != null && (tour = success.getTour()) != null) {
            outro = tour.getOutro();
        }
        return outro != null;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public final String getTourAnalyticsId() {
        return this.tourAnalyticsId;
    }

    public final String getSectionAnalyticsId() {
        return this.sectionAnalyticsId;
    }

    private final List<EducationTourSection> getAvailableSections() {
        EducationTour tour;
        List<EducationTourSection> sections;
        boolean z;
        Status status = this.status;
        Status.Success success = status instanceof Status.Success ? (Status.Success) status : null;
        if (success == null || (tour = success.getTour()) == null || (sections = tour.getSections()) == null) {
            return CollectionsKt.emptyList();
        }
        if (this.noSkip) {
            return sections;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : sections) {
            EducationTourSection educationTourSection = (EducationTourSection) obj;
            List<String> scrollToElementIds = educationTourSection.getScrollToElementIds();
            boolean z2 = true;
            if ((scrollToElementIds instanceof Collection) && scrollToElementIds.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = scrollToElementIds.iterator();
                while (it.hasNext()) {
                    if (this.availableElementIds.contains((String) it.next())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            List<String> tooltipElementIds = educationTourSection.getTooltipElementIds();
            if ((tooltipElementIds instanceof Collection) && tooltipElementIds.isEmpty()) {
                z2 = false;
            } else {
                Iterator<T> it2 = tooltipElementIds.iterator();
                while (it2.hasNext()) {
                    if (this.availableElementIds.contains((String) it2.next())) {
                        break;
                    }
                }
                z2 = false;
            }
            if (z && z2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* compiled from: EducationTourOverlayViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status;", "", "<init>", "()V", "Loading", "Success", "NotEligibleForTour", "Failure", "Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status$Failure;", "Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status$Loading;", "Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status$NotEligibleForTour;", "Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status$Success;", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Status {
        public static final int $stable = 0;

        public /* synthetic */ Status(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: EducationTourOverlayViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status$Loading;", "Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status;", "<init>", "()V", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends Status {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private Status() {
        }

        /* compiled from: EducationTourOverlayViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status$Success;", "Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status;", "tour", "Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTour;", "<init>", "(Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTour;)V", "getTour", "()Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTour;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Status {
            public static final int $stable = 8;
            private final EducationTour tour;

            public static /* synthetic */ Success copy$default(Success success, EducationTour educationTour, int i, Object obj) {
                if ((i & 1) != 0) {
                    educationTour = success.tour;
                }
                return success.copy(educationTour);
            }

            /* renamed from: component1, reason: from getter */
            public final EducationTour getTour() {
                return this.tour;
            }

            public final Success copy(EducationTour tour) {
                Intrinsics.checkNotNullParameter(tour, "tour");
                return new Success(tour);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.tour, ((Success) other).tour);
            }

            public int hashCode() {
                return this.tour.hashCode();
            }

            public String toString() {
                return "Success(tour=" + this.tour + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(EducationTour tour) {
                super(null);
                Intrinsics.checkNotNullParameter(tour, "tour");
                this.tour = tour;
            }

            public final EducationTour getTour() {
                return this.tour;
            }
        }

        /* compiled from: EducationTourOverlayViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status$NotEligibleForTour;", "Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status;", "<init>", "()V", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NotEligibleForTour extends Status {
            public static final int $stable = 0;
            public static final NotEligibleForTour INSTANCE = new NotEligibleForTour();

            private NotEligibleForTour() {
                super(null);
            }
        }

        /* compiled from: EducationTourOverlayViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status$Failure;", "Lcom/robinhood/android/educationtour/EducationTourOverlayViewState$Status;", "errorLoadingTourEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getErrorLoadingTourEvent", "()Lcom/robinhood/udf/UiEvent;", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Failure extends Status {
            public static final int $stable = 8;
            private final UiEvent<Unit> errorLoadingTourEvent;

            /* JADX WARN: Multi-variable type inference failed */
            public Failure() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public /* synthetic */ Failure(UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : uiEvent);
            }

            public final UiEvent<Unit> getErrorLoadingTourEvent() {
                return this.errorLoadingTourEvent;
            }

            public Failure(UiEvent<Unit> uiEvent) {
                super(null);
                this.errorLoadingTourEvent = uiEvent;
            }
        }
    }
}
