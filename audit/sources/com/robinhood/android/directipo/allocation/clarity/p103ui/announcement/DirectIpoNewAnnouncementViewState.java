package com.robinhood.android.directipo.allocation.clarity.p103ui.announcement;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.directipo.models.p292db.IpoAnnouncementAllocationStat;
import com.robinhood.directipo.models.p292db.IpoAnnouncementCardHook;
import com.robinhood.models.p320db.bonfire.IpoAccessAnnouncement;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import com.robinhood.rosetta.eventlogging.IpoAccessInstrumentContext;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoNewAnnouncementViewState.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JE\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u00109\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0015HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010/\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementViewState;", "", "ipoAccessAnnouncement", "Lcom/robinhood/models/db/bonfire/IpoAccessAnnouncement;", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "subtitleExpanded", "", "isLoading", "error", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/db/bonfire/IpoAccessAnnouncement;Lcom/robinhood/android/designsystem/style/DayNightOverlay;ZZLcom/robinhood/udf/UiEvent;)V", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getSubtitleExpanded", "()Z", "getError", "()Lcom/robinhood/udf/UiEvent;", "title", "", "getTitle", "()Ljava/lang/String;", "subtitleMarkdown", "getSubtitleMarkdown", "logoImages", "Lcom/robinhood/models/serverdriven/db/ThemedImageSource;", "getLogoImages", "()Lcom/robinhood/models/serverdriven/db/ThemedImageSource;", "allocationStats", "", "Lcom/robinhood/directipo/models/db/IpoAnnouncementAllocationStat;", "getAllocationStats", "()Ljava/util/List;", "footerButton", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "getFooterButton", "()Lcom/robinhood/models/serverdriven/db/GenericButton;", "cardHook", "Lcom/robinhood/directipo/models/db/IpoAnnouncementCardHook;", "getCardHook", "()Lcom/robinhood/directipo/models/db/IpoAnnouncementCardHook;", "disclosureText", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "getDisclosureText", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/IpoAccessInstrumentContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/IpoAccessInstrumentContext;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class DirectIpoNewAnnouncementViewState {
    public static final int $stable = 8;
    private final DayNightOverlay dayNightOverlay;
    private final UiEvent<Throwable> error;
    private final IpoAccessAnnouncement ipoAccessAnnouncement;
    private final boolean isLoading;
    private final boolean subtitleExpanded;

    public DirectIpoNewAnnouncementViewState() {
        this(null, null, false, false, null, 31, null);
    }

    /* renamed from: component1, reason: from getter */
    private final IpoAccessAnnouncement getIpoAccessAnnouncement() {
        return this.ipoAccessAnnouncement;
    }

    public static /* synthetic */ DirectIpoNewAnnouncementViewState copy$default(DirectIpoNewAnnouncementViewState directIpoNewAnnouncementViewState, IpoAccessAnnouncement ipoAccessAnnouncement, DayNightOverlay dayNightOverlay, boolean z, boolean z2, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            ipoAccessAnnouncement = directIpoNewAnnouncementViewState.ipoAccessAnnouncement;
        }
        if ((i & 2) != 0) {
            dayNightOverlay = directIpoNewAnnouncementViewState.dayNightOverlay;
        }
        if ((i & 4) != 0) {
            z = directIpoNewAnnouncementViewState.subtitleExpanded;
        }
        if ((i & 8) != 0) {
            z2 = directIpoNewAnnouncementViewState.isLoading;
        }
        if ((i & 16) != 0) {
            uiEvent = directIpoNewAnnouncementViewState.error;
        }
        UiEvent uiEvent2 = uiEvent;
        boolean z3 = z;
        return directIpoNewAnnouncementViewState.copy(ipoAccessAnnouncement, dayNightOverlay, z3, z2, uiEvent2);
    }

    /* renamed from: component2, reason: from getter */
    public final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSubtitleExpanded() {
        return this.subtitleExpanded;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> component5() {
        return this.error;
    }

    public final DirectIpoNewAnnouncementViewState copy(IpoAccessAnnouncement ipoAccessAnnouncement, DayNightOverlay dayNightOverlay, boolean subtitleExpanded, boolean isLoading, UiEvent<Throwable> error) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        return new DirectIpoNewAnnouncementViewState(ipoAccessAnnouncement, dayNightOverlay, subtitleExpanded, isLoading, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectIpoNewAnnouncementViewState)) {
            return false;
        }
        DirectIpoNewAnnouncementViewState directIpoNewAnnouncementViewState = (DirectIpoNewAnnouncementViewState) other;
        return Intrinsics.areEqual(this.ipoAccessAnnouncement, directIpoNewAnnouncementViewState.ipoAccessAnnouncement) && this.dayNightOverlay == directIpoNewAnnouncementViewState.dayNightOverlay && this.subtitleExpanded == directIpoNewAnnouncementViewState.subtitleExpanded && this.isLoading == directIpoNewAnnouncementViewState.isLoading && Intrinsics.areEqual(this.error, directIpoNewAnnouncementViewState.error);
    }

    public int hashCode() {
        IpoAccessAnnouncement ipoAccessAnnouncement = this.ipoAccessAnnouncement;
        int iHashCode = (((((((ipoAccessAnnouncement == null ? 0 : ipoAccessAnnouncement.hashCode()) * 31) + this.dayNightOverlay.hashCode()) * 31) + Boolean.hashCode(this.subtitleExpanded)) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "DirectIpoNewAnnouncementViewState(ipoAccessAnnouncement=" + this.ipoAccessAnnouncement + ", dayNightOverlay=" + this.dayNightOverlay + ", subtitleExpanded=" + this.subtitleExpanded + ", isLoading=" + this.isLoading + ", error=" + this.error + ")";
    }

    public DirectIpoNewAnnouncementViewState(IpoAccessAnnouncement ipoAccessAnnouncement, DayNightOverlay dayNightOverlay, boolean z, boolean z2, UiEvent<Throwable> uiEvent) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        this.ipoAccessAnnouncement = ipoAccessAnnouncement;
        this.dayNightOverlay = dayNightOverlay;
        this.subtitleExpanded = z;
        this.isLoading = z2;
        this.error = uiEvent;
    }

    public /* synthetic */ DirectIpoNewAnnouncementViewState(IpoAccessAnnouncement ipoAccessAnnouncement, DayNightOverlay dayNightOverlay, boolean z, boolean z2, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ipoAccessAnnouncement, (i & 2) != 0 ? DayNightOverlay.DAY : dayNightOverlay, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : uiEvent);
    }

    public final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    public final boolean getSubtitleExpanded() {
        return this.subtitleExpanded;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final String getTitle() {
        IpoAccessAnnouncement ipoAccessAnnouncement = this.ipoAccessAnnouncement;
        if (ipoAccessAnnouncement != null) {
            return ipoAccessAnnouncement.getTitle();
        }
        return null;
    }

    public final String getSubtitleMarkdown() {
        IpoAccessAnnouncement ipoAccessAnnouncement = this.ipoAccessAnnouncement;
        if (ipoAccessAnnouncement != null) {
            return ipoAccessAnnouncement.getSubtitle();
        }
        return null;
    }

    public final ThemedImageSource getLogoImages() {
        IpoAccessAnnouncement ipoAccessAnnouncement = this.ipoAccessAnnouncement;
        if (ipoAccessAnnouncement != null) {
            return ipoAccessAnnouncement.getLogoImages();
        }
        return null;
    }

    public final List<IpoAnnouncementAllocationStat> getAllocationStats() {
        IpoAccessAnnouncement ipoAccessAnnouncement = this.ipoAccessAnnouncement;
        if (ipoAccessAnnouncement != null) {
            return ipoAccessAnnouncement.getStats();
        }
        return null;
    }

    public final GenericButton getFooterButton() {
        IpoAccessAnnouncement ipoAccessAnnouncement = this.ipoAccessAnnouncement;
        if (ipoAccessAnnouncement != null) {
            return ipoAccessAnnouncement.getFooterButton();
        }
        return null;
    }

    public final IpoAnnouncementCardHook getCardHook() {
        IpoAccessAnnouncement ipoAccessAnnouncement = this.ipoAccessAnnouncement;
        if (ipoAccessAnnouncement != null) {
            return ipoAccessAnnouncement.getCardHook();
        }
        return null;
    }

    public final MarkdownContent getDisclosureText() {
        IpoAccessAnnouncement ipoAccessAnnouncement = this.ipoAccessAnnouncement;
        if (ipoAccessAnnouncement != null) {
            return ipoAccessAnnouncement.getDisclosureMarkdown();
        }
        return null;
    }

    public final IpoAccessInstrumentContext getLoggingContext() {
        IpoAccessAnnouncement ipoAccessAnnouncement = this.ipoAccessAnnouncement;
        if (ipoAccessAnnouncement != null) {
            return ipoAccessAnnouncement.getLoggingContext();
        }
        return null;
    }
}
