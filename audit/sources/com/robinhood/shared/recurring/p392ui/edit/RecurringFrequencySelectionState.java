package com.robinhood.shared.recurring.p392ui.edit;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.compose.bento.component.BentoButtonBarState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.LocalDate;

/* compiled from: RecurringFrequencySelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001HBy\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010 J\u009a\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0019R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b\u000b\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010$R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bB\u0010$R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bC\u0010$R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\bD\u0010 R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010)R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\bG\u0010 ¨\u0006I"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/edit/RecurringFrequencySelectionState;", "", "Lcom/robinhood/utils/resource/StringResource;", "appBarTitle", "title", "subtitle", "nextExecutionDate", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/recurring/ui/edit/RecurringFrequencySelectionState$FrequencyOption;", "frequencyOptions", "", "isLoading", "Lcom/robinhood/compose/bento/component/BentoButtonBarState;", "buttonBarState", "j$/time/LocalDate", "currentSelectedDate", "minSelectableDate", "maxSelectableDate", "disableToday", "Lcom/robinhood/android/navigation/NavigationType;", "navigationType", "weekendEnabled", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/compose/bento/component/BentoButtonBarState;Lj$/time/LocalDate;Lj$/time/LocalDate;Lj$/time/LocalDate;ZLcom/robinhood/android/navigation/NavigationType;Z)V", "component1", "()Lcom/robinhood/utils/resource/StringResource;", "component2", "component3", "component4", "component5", "()Lkotlinx/collections/immutable/ImmutableList;", "component6", "()Z", "component7", "()Lcom/robinhood/compose/bento/component/BentoButtonBarState;", "component8", "()Lj$/time/LocalDate;", "component9", "component10", "component11", "component12", "()Lcom/robinhood/android/navigation/NavigationType;", "component13", "copy", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/compose/bento/component/BentoButtonBarState;Lj$/time/LocalDate;Lj$/time/LocalDate;Lj$/time/LocalDate;ZLcom/robinhood/android/navigation/NavigationType;Z)Lcom/robinhood/shared/recurring/ui/edit/RecurringFrequencySelectionState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/utils/resource/StringResource;", "getAppBarTitle", "getTitle", "getSubtitle", "getNextExecutionDate", "Lkotlinx/collections/immutable/ImmutableList;", "getFrequencyOptions", "Z", "Lcom/robinhood/compose/bento/component/BentoButtonBarState;", "getButtonBarState", "Lj$/time/LocalDate;", "getCurrentSelectedDate", "getMinSelectableDate", "getMaxSelectableDate", "getDisableToday", "Lcom/robinhood/android/navigation/NavigationType;", "getNavigationType", "getWeekendEnabled", "FrequencyOption", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RecurringFrequencySelectionState {
    public static final int $stable = 8;
    private final StringResource appBarTitle;
    private final BentoButtonBarState buttonBarState;
    private final LocalDate currentSelectedDate;
    private final boolean disableToday;
    private final ImmutableList<FrequencyOption> frequencyOptions;
    private final boolean isLoading;
    private final LocalDate maxSelectableDate;
    private final LocalDate minSelectableDate;
    private final NavigationType navigationType;
    private final StringResource nextExecutionDate;
    private final StringResource subtitle;
    private final StringResource title;
    private final boolean weekendEnabled;

    public static /* synthetic */ RecurringFrequencySelectionState copy$default(RecurringFrequencySelectionState recurringFrequencySelectionState, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, ImmutableList immutableList, boolean z, BentoButtonBarState bentoButtonBarState, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, boolean z2, NavigationType navigationType, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = recurringFrequencySelectionState.appBarTitle;
        }
        return recurringFrequencySelectionState.copy(stringResource, (i & 2) != 0 ? recurringFrequencySelectionState.title : stringResource2, (i & 4) != 0 ? recurringFrequencySelectionState.subtitle : stringResource3, (i & 8) != 0 ? recurringFrequencySelectionState.nextExecutionDate : stringResource4, (i & 16) != 0 ? recurringFrequencySelectionState.frequencyOptions : immutableList, (i & 32) != 0 ? recurringFrequencySelectionState.isLoading : z, (i & 64) != 0 ? recurringFrequencySelectionState.buttonBarState : bentoButtonBarState, (i & 128) != 0 ? recurringFrequencySelectionState.currentSelectedDate : localDate, (i & 256) != 0 ? recurringFrequencySelectionState.minSelectableDate : localDate2, (i & 512) != 0 ? recurringFrequencySelectionState.maxSelectableDate : localDate3, (i & 1024) != 0 ? recurringFrequencySelectionState.disableToday : z2, (i & 2048) != 0 ? recurringFrequencySelectionState.navigationType : navigationType, (i & 4096) != 0 ? recurringFrequencySelectionState.weekendEnabled : z3);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getAppBarTitle() {
        return this.appBarTitle;
    }

    /* renamed from: component10, reason: from getter */
    public final LocalDate getMaxSelectableDate() {
        return this.maxSelectableDate;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getDisableToday() {
        return this.disableToday;
    }

    /* renamed from: component12, reason: from getter */
    public final NavigationType getNavigationType() {
        return this.navigationType;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getWeekendEnabled() {
        return this.weekendEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getNextExecutionDate() {
        return this.nextExecutionDate;
    }

    public final ImmutableList<FrequencyOption> component5() {
        return this.frequencyOptions;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final BentoButtonBarState getButtonBarState() {
        return this.buttonBarState;
    }

    /* renamed from: component8, reason: from getter */
    public final LocalDate getCurrentSelectedDate() {
        return this.currentSelectedDate;
    }

    /* renamed from: component9, reason: from getter */
    public final LocalDate getMinSelectableDate() {
        return this.minSelectableDate;
    }

    public final RecurringFrequencySelectionState copy(StringResource appBarTitle, StringResource title, StringResource subtitle, StringResource nextExecutionDate, ImmutableList<FrequencyOption> frequencyOptions, boolean isLoading, BentoButtonBarState buttonBarState, LocalDate currentSelectedDate, LocalDate minSelectableDate, LocalDate maxSelectableDate, boolean disableToday, NavigationType navigationType, boolean weekendEnabled) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(nextExecutionDate, "nextExecutionDate");
        Intrinsics.checkNotNullParameter(frequencyOptions, "frequencyOptions");
        Intrinsics.checkNotNullParameter(buttonBarState, "buttonBarState");
        Intrinsics.checkNotNullParameter(currentSelectedDate, "currentSelectedDate");
        Intrinsics.checkNotNullParameter(minSelectableDate, "minSelectableDate");
        Intrinsics.checkNotNullParameter(maxSelectableDate, "maxSelectableDate");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        return new RecurringFrequencySelectionState(appBarTitle, title, subtitle, nextExecutionDate, frequencyOptions, isLoading, buttonBarState, currentSelectedDate, minSelectableDate, maxSelectableDate, disableToday, navigationType, weekendEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringFrequencySelectionState)) {
            return false;
        }
        RecurringFrequencySelectionState recurringFrequencySelectionState = (RecurringFrequencySelectionState) other;
        return Intrinsics.areEqual(this.appBarTitle, recurringFrequencySelectionState.appBarTitle) && Intrinsics.areEqual(this.title, recurringFrequencySelectionState.title) && Intrinsics.areEqual(this.subtitle, recurringFrequencySelectionState.subtitle) && Intrinsics.areEqual(this.nextExecutionDate, recurringFrequencySelectionState.nextExecutionDate) && Intrinsics.areEqual(this.frequencyOptions, recurringFrequencySelectionState.frequencyOptions) && this.isLoading == recurringFrequencySelectionState.isLoading && Intrinsics.areEqual(this.buttonBarState, recurringFrequencySelectionState.buttonBarState) && Intrinsics.areEqual(this.currentSelectedDate, recurringFrequencySelectionState.currentSelectedDate) && Intrinsics.areEqual(this.minSelectableDate, recurringFrequencySelectionState.minSelectableDate) && Intrinsics.areEqual(this.maxSelectableDate, recurringFrequencySelectionState.maxSelectableDate) && this.disableToday == recurringFrequencySelectionState.disableToday && this.navigationType == recurringFrequencySelectionState.navigationType && this.weekendEnabled == recurringFrequencySelectionState.weekendEnabled;
    }

    public int hashCode() {
        StringResource stringResource = this.appBarTitle;
        return ((((((((((((((((((((((((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.nextExecutionDate.hashCode()) * 31) + this.frequencyOptions.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.buttonBarState.hashCode()) * 31) + this.currentSelectedDate.hashCode()) * 31) + this.minSelectableDate.hashCode()) * 31) + this.maxSelectableDate.hashCode()) * 31) + Boolean.hashCode(this.disableToday)) * 31) + this.navigationType.hashCode()) * 31) + Boolean.hashCode(this.weekendEnabled);
    }

    public String toString() {
        return "RecurringFrequencySelectionState(appBarTitle=" + this.appBarTitle + ", title=" + this.title + ", subtitle=" + this.subtitle + ", nextExecutionDate=" + this.nextExecutionDate + ", frequencyOptions=" + this.frequencyOptions + ", isLoading=" + this.isLoading + ", buttonBarState=" + this.buttonBarState + ", currentSelectedDate=" + this.currentSelectedDate + ", minSelectableDate=" + this.minSelectableDate + ", maxSelectableDate=" + this.maxSelectableDate + ", disableToday=" + this.disableToday + ", navigationType=" + this.navigationType + ", weekendEnabled=" + this.weekendEnabled + ")";
    }

    public RecurringFrequencySelectionState(StringResource stringResource, StringResource title, StringResource subtitle, StringResource nextExecutionDate, ImmutableList<FrequencyOption> frequencyOptions, boolean z, BentoButtonBarState buttonBarState, LocalDate currentSelectedDate, LocalDate minSelectableDate, LocalDate maxSelectableDate, boolean z2, NavigationType navigationType, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(nextExecutionDate, "nextExecutionDate");
        Intrinsics.checkNotNullParameter(frequencyOptions, "frequencyOptions");
        Intrinsics.checkNotNullParameter(buttonBarState, "buttonBarState");
        Intrinsics.checkNotNullParameter(currentSelectedDate, "currentSelectedDate");
        Intrinsics.checkNotNullParameter(minSelectableDate, "minSelectableDate");
        Intrinsics.checkNotNullParameter(maxSelectableDate, "maxSelectableDate");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        this.appBarTitle = stringResource;
        this.title = title;
        this.subtitle = subtitle;
        this.nextExecutionDate = nextExecutionDate;
        this.frequencyOptions = frequencyOptions;
        this.isLoading = z;
        this.buttonBarState = buttonBarState;
        this.currentSelectedDate = currentSelectedDate;
        this.minSelectableDate = minSelectableDate;
        this.maxSelectableDate = maxSelectableDate;
        this.disableToday = z2;
        this.navigationType = navigationType;
        this.weekendEnabled = z3;
    }

    public /* synthetic */ RecurringFrequencySelectionState(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, ImmutableList immutableList, boolean z, BentoButtonBarState bentoButtonBarState, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, boolean z2, NavigationType navigationType, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, stringResource2, stringResource3, stringResource4, immutableList, (i & 32) != 0 ? false : z, bentoButtonBarState, localDate, localDate2, localDate3, z2, navigationType, z3);
    }

    public final StringResource getAppBarTitle() {
        return this.appBarTitle;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final StringResource getNextExecutionDate() {
        return this.nextExecutionDate;
    }

    public final ImmutableList<FrequencyOption> getFrequencyOptions() {
        return this.frequencyOptions;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final BentoButtonBarState getButtonBarState() {
        return this.buttonBarState;
    }

    public final LocalDate getCurrentSelectedDate() {
        return this.currentSelectedDate;
    }

    public final LocalDate getMinSelectableDate() {
        return this.minSelectableDate;
    }

    public final LocalDate getMaxSelectableDate() {
        return this.maxSelectableDate;
    }

    public final boolean getDisableToday() {
        return this.disableToday;
    }

    public final NavigationType getNavigationType() {
        return this.navigationType;
    }

    public final boolean getWeekendEnabled() {
        return this.weekendEnabled;
    }

    /* compiled from: RecurringFrequencySelectionComposable.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/edit/RecurringFrequencySelectionState$FrequencyOption;", "", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "selectionRow", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState;", "<init>", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState;)V", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getSelectionRow", "()Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FrequencyOption {
        public static final int $stable = BentoSelectionRowState.$stable;
        private final ApiInvestmentSchedule.Frequency frequency;
        private final BentoSelectionRowState selectionRow;

        public static /* synthetic */ FrequencyOption copy$default(FrequencyOption frequencyOption, ApiInvestmentSchedule.Frequency frequency, BentoSelectionRowState bentoSelectionRowState, int i, Object obj) {
            if ((i & 1) != 0) {
                frequency = frequencyOption.frequency;
            }
            if ((i & 2) != 0) {
                bentoSelectionRowState = frequencyOption.selectionRow;
            }
            return frequencyOption.copy(frequency, bentoSelectionRowState);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        /* renamed from: component2, reason: from getter */
        public final BentoSelectionRowState getSelectionRow() {
            return this.selectionRow;
        }

        public final FrequencyOption copy(ApiInvestmentSchedule.Frequency frequency, BentoSelectionRowState selectionRow) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(selectionRow, "selectionRow");
            return new FrequencyOption(frequency, selectionRow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FrequencyOption)) {
                return false;
            }
            FrequencyOption frequencyOption = (FrequencyOption) other;
            return this.frequency == frequencyOption.frequency && Intrinsics.areEqual(this.selectionRow, frequencyOption.selectionRow);
        }

        public int hashCode() {
            return (this.frequency.hashCode() * 31) + this.selectionRow.hashCode();
        }

        public String toString() {
            return "FrequencyOption(frequency=" + this.frequency + ", selectionRow=" + this.selectionRow + ")";
        }

        public FrequencyOption(ApiInvestmentSchedule.Frequency frequency, BentoSelectionRowState selectionRow) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(selectionRow, "selectionRow");
            this.frequency = frequency;
            this.selectionRow = selectionRow;
        }

        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public final BentoSelectionRowState getSelectionRow() {
            return this.selectionRow;
        }
    }
}
