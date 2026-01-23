package com.robinhood.android.support.supporthub;

import com.robinhood.models.p355ui.supporthub.AlertBanner;
import com.robinhood.models.p355ui.supporthub.AppointmentCard;
import com.robinhood.models.p355ui.supporthub.AssignedAgent;
import com.robinhood.models.p355ui.supporthub.GetSupport;
import com.robinhood.models.p355ui.supporthub.RecommendedActions;
import com.robinhood.models.p355ui.supporthub.SupportRow;
import com.robinhood.models.p355ui.supporthub.SupportSection;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SupportHubViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003 !\"B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState;", "", "initialLoadingState", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState;", "recommendedActions", "Lcom/robinhood/models/ui/supporthub/RecommendedActions;", "bottomSheetData", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData;", "dialogData", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData;", "<init>", "(Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState;Lcom/robinhood/models/ui/supporthub/RecommendedActions;Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData;Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData;)V", "getInitialLoadingState", "()Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState;", "getRecommendedActions", "()Lcom/robinhood/models/ui/supporthub/RecommendedActions;", "getBottomSheetData", "()Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData;", "getDialogData", "()Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InitialLoadingState", "BottomSheetData", "DialogData", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SupportHubViewState {
    public static final int $stable = 8;
    private final BottomSheetData bottomSheetData;
    private final DialogData dialogData;
    private final InitialLoadingState initialLoadingState;
    private final RecommendedActions recommendedActions;

    public SupportHubViewState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SupportHubViewState copy$default(SupportHubViewState supportHubViewState, InitialLoadingState initialLoadingState, RecommendedActions recommendedActions, BottomSheetData bottomSheetData, DialogData dialogData, int i, Object obj) {
        if ((i & 1) != 0) {
            initialLoadingState = supportHubViewState.initialLoadingState;
        }
        if ((i & 2) != 0) {
            recommendedActions = supportHubViewState.recommendedActions;
        }
        if ((i & 4) != 0) {
            bottomSheetData = supportHubViewState.bottomSheetData;
        }
        if ((i & 8) != 0) {
            dialogData = supportHubViewState.dialogData;
        }
        return supportHubViewState.copy(initialLoadingState, recommendedActions, bottomSheetData, dialogData);
    }

    /* renamed from: component1, reason: from getter */
    public final InitialLoadingState getInitialLoadingState() {
        return this.initialLoadingState;
    }

    /* renamed from: component2, reason: from getter */
    public final RecommendedActions getRecommendedActions() {
        return this.recommendedActions;
    }

    /* renamed from: component3, reason: from getter */
    public final BottomSheetData getBottomSheetData() {
        return this.bottomSheetData;
    }

    /* renamed from: component4, reason: from getter */
    public final DialogData getDialogData() {
        return this.dialogData;
    }

    public final SupportHubViewState copy(InitialLoadingState initialLoadingState, RecommendedActions recommendedActions, BottomSheetData bottomSheetData, DialogData dialogData) {
        Intrinsics.checkNotNullParameter(initialLoadingState, "initialLoadingState");
        Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        return new SupportHubViewState(initialLoadingState, recommendedActions, bottomSheetData, dialogData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportHubViewState)) {
            return false;
        }
        SupportHubViewState supportHubViewState = (SupportHubViewState) other;
        return Intrinsics.areEqual(this.initialLoadingState, supportHubViewState.initialLoadingState) && Intrinsics.areEqual(this.recommendedActions, supportHubViewState.recommendedActions) && Intrinsics.areEqual(this.bottomSheetData, supportHubViewState.bottomSheetData) && Intrinsics.areEqual(this.dialogData, supportHubViewState.dialogData);
    }

    public int hashCode() {
        int iHashCode = this.initialLoadingState.hashCode() * 31;
        RecommendedActions recommendedActions = this.recommendedActions;
        return ((((iHashCode + (recommendedActions == null ? 0 : recommendedActions.hashCode())) * 31) + this.bottomSheetData.hashCode()) * 31) + this.dialogData.hashCode();
    }

    public String toString() {
        return "SupportHubViewState(initialLoadingState=" + this.initialLoadingState + ", recommendedActions=" + this.recommendedActions + ", bottomSheetData=" + this.bottomSheetData + ", dialogData=" + this.dialogData + ")";
    }

    public SupportHubViewState(InitialLoadingState initialLoadingState, RecommendedActions recommendedActions, BottomSheetData bottomSheetData, DialogData dialogData) {
        Intrinsics.checkNotNullParameter(initialLoadingState, "initialLoadingState");
        Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        this.initialLoadingState = initialLoadingState;
        this.recommendedActions = recommendedActions;
        this.bottomSheetData = bottomSheetData;
        this.dialogData = dialogData;
    }

    public /* synthetic */ SupportHubViewState(InitialLoadingState initialLoadingState, RecommendedActions recommendedActions, BottomSheetData bottomSheetData, DialogData dialogData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InitialLoadingState.Uninitialized.INSTANCE : initialLoadingState, (i & 2) != 0 ? null : recommendedActions, (i & 4) != 0 ? BottomSheetData.None.INSTANCE : bottomSheetData, (i & 8) != 0 ? DialogData.None.INSTANCE : dialogData);
    }

    public final InitialLoadingState getInitialLoadingState() {
        return this.initialLoadingState;
    }

    public final RecommendedActions getRecommendedActions() {
        return this.recommendedActions;
    }

    public final BottomSheetData getBottomSheetData() {
        return this.bottomSheetData;
    }

    public final DialogData getDialogData() {
        return this.dialogData;
    }

    /* compiled from: SupportHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState;", "", "Uninitialized", "Updating", "Loaded", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface InitialLoadingState {

        /* compiled from: SupportHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState$Uninitialized;", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Uninitialized implements InitialLoadingState {
            public static final int $stable = 0;
            public static final Uninitialized INSTANCE = new Uninitialized();

            public boolean equals(Object other) {
                return this == other || (other instanceof Uninitialized);
            }

            public int hashCode() {
                return 393369993;
            }

            public String toString() {
                return "Uninitialized";
            }

            private Uninitialized() {
            }
        }

        /* compiled from: SupportHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState$Updating;", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Updating implements InitialLoadingState {
            public static final int $stable = 0;
            public static final Updating INSTANCE = new Updating();

            public boolean equals(Object other) {
                return this == other || (other instanceof Updating);
            }

            public int hashCode() {
                return 1208483736;
            }

            public String toString() {
                return "Updating";
            }

            private Updating() {
            }
        }

        /* compiled from: SupportHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0081\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010 R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState$Loaded;", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$InitialLoadingState;", "title", "", "getSupport", "Lcom/robinhood/models/ui/supporthub/GetSupport;", "getPrioritySupport", "Lcom/robinhood/models/ui/supporthub/SupportSection;", "alertBanners", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/supporthub/AlertBanner;", "sections", "versionName", "isConcierge", "", "hasSeenConciergeOnboarding", "appointment", "Lcom/robinhood/models/ui/supporthub/AppointmentCard;", "assignedAgent", "Lcom/robinhood/models/ui/supporthub/AssignedAgent;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/supporthub/GetSupport;Lcom/robinhood/models/ui/supporthub/SupportSection;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;ZZLcom/robinhood/models/ui/supporthub/AppointmentCard;Lcom/robinhood/models/ui/supporthub/AssignedAgent;)V", "getTitle", "()Ljava/lang/String;", "getGetSupport", "()Lcom/robinhood/models/ui/supporthub/GetSupport;", "getGetPrioritySupport", "()Lcom/robinhood/models/ui/supporthub/SupportSection;", "getAlertBanners", "()Lkotlinx/collections/immutable/ImmutableList;", "getSections", "getVersionName", "()Z", "getHasSeenConciergeOnboarding", "getAppointment", "()Lcom/robinhood/models/ui/supporthub/AppointmentCard;", "getAssignedAgent", "()Lcom/robinhood/models/ui/supporthub/AssignedAgent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements InitialLoadingState {
            public static final int $stable = 8;
            private final ImmutableList<AlertBanner> alertBanners;
            private final AppointmentCard appointment;
            private final AssignedAgent assignedAgent;
            private final SupportSection getPrioritySupport;
            private final GetSupport getSupport;
            private final boolean hasSeenConciergeOnboarding;
            private final boolean isConcierge;
            private final ImmutableList<SupportSection> sections;
            private final String title;
            private final String versionName;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, GetSupport getSupport, SupportSection supportSection, ImmutableList immutableList, ImmutableList immutableList2, String str2, boolean z, boolean z2, AppointmentCard appointmentCard, AssignedAgent assignedAgent, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loaded.title;
                }
                if ((i & 2) != 0) {
                    getSupport = loaded.getSupport;
                }
                if ((i & 4) != 0) {
                    supportSection = loaded.getPrioritySupport;
                }
                if ((i & 8) != 0) {
                    immutableList = loaded.alertBanners;
                }
                if ((i & 16) != 0) {
                    immutableList2 = loaded.sections;
                }
                if ((i & 32) != 0) {
                    str2 = loaded.versionName;
                }
                if ((i & 64) != 0) {
                    z = loaded.isConcierge;
                }
                if ((i & 128) != 0) {
                    z2 = loaded.hasSeenConciergeOnboarding;
                }
                if ((i & 256) != 0) {
                    appointmentCard = loaded.appointment;
                }
                if ((i & 512) != 0) {
                    assignedAgent = loaded.assignedAgent;
                }
                AppointmentCard appointmentCard2 = appointmentCard;
                AssignedAgent assignedAgent2 = assignedAgent;
                boolean z3 = z;
                boolean z4 = z2;
                ImmutableList immutableList3 = immutableList2;
                String str3 = str2;
                return loaded.copy(str, getSupport, supportSection, immutableList, immutableList3, str3, z3, z4, appointmentCard2, assignedAgent2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component10, reason: from getter */
            public final AssignedAgent getAssignedAgent() {
                return this.assignedAgent;
            }

            /* renamed from: component2, reason: from getter */
            public final GetSupport getGetSupport() {
                return this.getSupport;
            }

            /* renamed from: component3, reason: from getter */
            public final SupportSection getGetPrioritySupport() {
                return this.getPrioritySupport;
            }

            public final ImmutableList<AlertBanner> component4() {
                return this.alertBanners;
            }

            public final ImmutableList<SupportSection> component5() {
                return this.sections;
            }

            /* renamed from: component6, reason: from getter */
            public final String getVersionName() {
                return this.versionName;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getIsConcierge() {
                return this.isConcierge;
            }

            /* renamed from: component8, reason: from getter */
            public final boolean getHasSeenConciergeOnboarding() {
                return this.hasSeenConciergeOnboarding;
            }

            /* renamed from: component9, reason: from getter */
            public final AppointmentCard getAppointment() {
                return this.appointment;
            }

            public final Loaded copy(String title, GetSupport getSupport, SupportSection getPrioritySupport, ImmutableList<AlertBanner> alertBanners, ImmutableList<SupportSection> sections, String versionName, boolean isConcierge, boolean hasSeenConciergeOnboarding, AppointmentCard appointment, AssignedAgent assignedAgent) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(alertBanners, "alertBanners");
                Intrinsics.checkNotNullParameter(sections, "sections");
                Intrinsics.checkNotNullParameter(versionName, "versionName");
                return new Loaded(title, getSupport, getPrioritySupport, alertBanners, sections, versionName, isConcierge, hasSeenConciergeOnboarding, appointment, assignedAgent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) other;
                return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.getSupport, loaded.getSupport) && Intrinsics.areEqual(this.getPrioritySupport, loaded.getPrioritySupport) && Intrinsics.areEqual(this.alertBanners, loaded.alertBanners) && Intrinsics.areEqual(this.sections, loaded.sections) && Intrinsics.areEqual(this.versionName, loaded.versionName) && this.isConcierge == loaded.isConcierge && this.hasSeenConciergeOnboarding == loaded.hasSeenConciergeOnboarding && Intrinsics.areEqual(this.appointment, loaded.appointment) && Intrinsics.areEqual(this.assignedAgent, loaded.assignedAgent);
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                GetSupport getSupport = this.getSupport;
                int iHashCode2 = (iHashCode + (getSupport == null ? 0 : getSupport.hashCode())) * 31;
                SupportSection supportSection = this.getPrioritySupport;
                int iHashCode3 = (((((((((((iHashCode2 + (supportSection == null ? 0 : supportSection.hashCode())) * 31) + this.alertBanners.hashCode()) * 31) + this.sections.hashCode()) * 31) + this.versionName.hashCode()) * 31) + Boolean.hashCode(this.isConcierge)) * 31) + Boolean.hashCode(this.hasSeenConciergeOnboarding)) * 31;
                AppointmentCard appointmentCard = this.appointment;
                int iHashCode4 = (iHashCode3 + (appointmentCard == null ? 0 : appointmentCard.hashCode())) * 31;
                AssignedAgent assignedAgent = this.assignedAgent;
                return iHashCode4 + (assignedAgent != null ? assignedAgent.hashCode() : 0);
            }

            public String toString() {
                return "Loaded(title=" + this.title + ", getSupport=" + this.getSupport + ", getPrioritySupport=" + this.getPrioritySupport + ", alertBanners=" + this.alertBanners + ", sections=" + this.sections + ", versionName=" + this.versionName + ", isConcierge=" + this.isConcierge + ", hasSeenConciergeOnboarding=" + this.hasSeenConciergeOnboarding + ", appointment=" + this.appointment + ", assignedAgent=" + this.assignedAgent + ")";
            }

            public Loaded(String title, GetSupport getSupport, SupportSection supportSection, ImmutableList<AlertBanner> alertBanners, ImmutableList<SupportSection> sections, String versionName, boolean z, boolean z2, AppointmentCard appointmentCard, AssignedAgent assignedAgent) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(alertBanners, "alertBanners");
                Intrinsics.checkNotNullParameter(sections, "sections");
                Intrinsics.checkNotNullParameter(versionName, "versionName");
                this.title = title;
                this.getSupport = getSupport;
                this.getPrioritySupport = supportSection;
                this.alertBanners = alertBanners;
                this.sections = sections;
                this.versionName = versionName;
                this.isConcierge = z;
                this.hasSeenConciergeOnboarding = z2;
                this.appointment = appointmentCard;
                this.assignedAgent = assignedAgent;
            }

            public final String getTitle() {
                return this.title;
            }

            public final GetSupport getGetSupport() {
                return this.getSupport;
            }

            public final SupportSection getGetPrioritySupport() {
                return this.getPrioritySupport;
            }

            public final ImmutableList<AlertBanner> getAlertBanners() {
                return this.alertBanners;
            }

            public final ImmutableList<SupportSection> getSections() {
                return this.sections;
            }

            public final String getVersionName() {
                return this.versionName;
            }

            public final boolean isConcierge() {
                return this.isConcierge;
            }

            public final boolean getHasSeenConciergeOnboarding() {
                return this.hasSeenConciergeOnboarding;
            }

            public final AppointmentCard getAppointment() {
                return this.appointment;
            }

            public final AssignedAgent getAssignedAgent() {
                return this.assignedAgent;
            }
        }
    }

    /* compiled from: SupportHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData;", "", "None", "Loading", "Menu", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface BottomSheetData {

        /* compiled from: SupportHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData$None;", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None implements BottomSheetData {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return 1819993221;
            }

            public String toString() {
                return "None";
            }

            private None() {
            }
        }

        /* compiled from: SupportHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData$Loading;", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData;", "title", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements BottomSheetData {
            public static final int $stable = 0;
            private final String subtitle;
            private final String title;

            /* JADX WARN: Multi-variable type inference failed */
            public Loading() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Loading copy$default(Loading loading, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loading.title;
                }
                if ((i & 2) != 0) {
                    str2 = loading.subtitle;
                }
                return loading.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final Loading copy(String title, String subtitle) {
                return new Loading(title, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loading)) {
                    return false;
                }
                Loading loading = (Loading) other;
                return Intrinsics.areEqual(this.title, loading.title) && Intrinsics.areEqual(this.subtitle, loading.subtitle);
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitle;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Loading(title=" + this.title + ", subtitle=" + this.subtitle + ")";
            }

            public Loading(String str, String str2) {
                this.title = str;
                this.subtitle = str2;
            }

            public /* synthetic */ Loading(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }
        }

        /* compiled from: SupportHubViewState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData$Menu;", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$BottomSheetData;", "title", "", "subtitle", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/supporthub/SupportRow;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Menu implements BottomSheetData {
            public static final int $stable = 8;
            private final ImmutableList<SupportRow> rows;
            private final String subtitle;
            private final String title;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Menu copy$default(Menu menu, String str, String str2, ImmutableList immutableList, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = menu.title;
                }
                if ((i & 2) != 0) {
                    str2 = menu.subtitle;
                }
                if ((i & 4) != 0) {
                    immutableList = menu.rows;
                }
                return menu.copy(str, str2, immutableList);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final ImmutableList<SupportRow> component3() {
                return this.rows;
            }

            public final Menu copy(String title, String subtitle, ImmutableList<SupportRow> rows) {
                Intrinsics.checkNotNullParameter(rows, "rows");
                return new Menu(title, subtitle, rows);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Menu)) {
                    return false;
                }
                Menu menu = (Menu) other;
                return Intrinsics.areEqual(this.title, menu.title) && Intrinsics.areEqual(this.subtitle, menu.subtitle) && Intrinsics.areEqual(this.rows, menu.rows);
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitle;
                return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.rows.hashCode();
            }

            public String toString() {
                return "Menu(title=" + this.title + ", subtitle=" + this.subtitle + ", rows=" + this.rows + ")";
            }

            public Menu(String str, String str2, ImmutableList<SupportRow> rows) {
                Intrinsics.checkNotNullParameter(rows, "rows");
                this.title = str;
                this.subtitle = str2;
                this.rows = rows;
            }

            public /* synthetic */ Menu(String str, String str2, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, immutableList);
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final ImmutableList<SupportRow> getRows() {
                return this.rows;
            }
        }
    }

    /* compiled from: SupportHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData;", "", "None", "Error", "Kind", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface DialogData {

        /* compiled from: SupportHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData$None;", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None implements DialogData {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return 1132310423;
            }

            public String toString() {
                return "None";
            }

            private None() {
            }
        }

        /* compiled from: SupportHubViewState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData$Error;", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData;", "cause", "", "kind", "Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData$Kind;", "<init>", "(Ljava/lang/Throwable;Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData$Kind;)V", "getCause", "()Ljava/lang/Throwable;", "getKind", "()Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData$Kind;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements DialogData {
            public static final int $stable = 8;
            private final Throwable cause;
            private final Kind kind;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, Kind kind, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.cause;
                }
                if ((i & 2) != 0) {
                    kind = error.kind;
                }
                return error.copy(th, kind);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            /* renamed from: component2, reason: from getter */
            public final Kind getKind() {
                return this.kind;
            }

            public final Error copy(Throwable cause, Kind kind) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(kind, "kind");
                return new Error(cause, kind);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return Intrinsics.areEqual(this.cause, error.cause) && this.kind == error.kind;
            }

            public int hashCode() {
                return (this.cause.hashCode() * 31) + this.kind.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ", kind=" + this.kind + ")";
            }

            public Error(Throwable cause, Kind kind) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(kind, "kind");
                this.cause = cause;
                this.kind = kind;
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public /* synthetic */ Error(Throwable th, Kind kind, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(th, (i & 2) != 0 ? Kind.GENERIC : kind);
            }

            public final Kind getKind() {
                return this.kind;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SupportHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubViewState$DialogData$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "GENERIC", "CHANNEL_AVAILABILITY", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Kind {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Kind[] $VALUES;
            public static final Kind GENERIC = new Kind("GENERIC", 0);
            public static final Kind CHANNEL_AVAILABILITY = new Kind("CHANNEL_AVAILABILITY", 1);

            private static final /* synthetic */ Kind[] $values() {
                return new Kind[]{GENERIC, CHANNEL_AVAILABILITY};
            }

            public static EnumEntries<Kind> getEntries() {
                return $ENTRIES;
            }

            static {
                Kind[] kindArr$values = $values();
                $VALUES = kindArr$values;
                $ENTRIES = EnumEntries2.enumEntries(kindArr$values);
            }

            private Kind(String str, int i) {
            }

            public static Kind valueOf(String str) {
                return (Kind) Enum.valueOf(Kind.class, str);
            }

            public static Kind[] values() {
                return (Kind[]) $VALUES.clone();
            }
        }
    }
}
