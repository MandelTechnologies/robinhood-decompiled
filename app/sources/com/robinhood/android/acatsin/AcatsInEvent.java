package com.robinhood.android.acatsin;

import com.robinhood.android.acatsin.borrowingfee.UiShortPositionFeeData;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.models.api.bonfire.AcatsTransferHubBottomSheetDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AcatsInEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInEvent;", "", "<init>", "()V", "FlowNavigationEvent", "FlowCompleteEvent", "MatchRateSelectionEvent", "OpenPromoFlow", "ShowFailedTransferBottomSheet", "ShowBorrowingFeeBottomSheet", "Lcom/robinhood/android/acatsin/AcatsInEvent$FlowCompleteEvent;", "Lcom/robinhood/android/acatsin/AcatsInEvent$FlowNavigationEvent;", "Lcom/robinhood/android/acatsin/AcatsInEvent$MatchRateSelectionEvent;", "Lcom/robinhood/android/acatsin/AcatsInEvent$OpenPromoFlow;", "Lcom/robinhood/android/acatsin/AcatsInEvent$ShowBorrowingFeeBottomSheet;", "Lcom/robinhood/android/acatsin/AcatsInEvent$ShowFailedTransferBottomSheet;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsInEvent {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AcatsInEvent() {
    }

    /* compiled from: AcatsInEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInEvent$FlowNavigationEvent;", "Lcom/robinhood/android/acatsin/AcatsInEvent;", "flowStep", "Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "dataState", "Lcom/robinhood/android/acatsin/AcatsInDataState;", "shouldPromptForLockScreen", "", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsFlowStep;Lcom/robinhood/android/acatsin/AcatsInDataState;Z)V", "getFlowStep", "()Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "getDataState", "()Lcom/robinhood/android/acatsin/AcatsInDataState;", "getShouldPromptForLockScreen", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FlowNavigationEvent extends AcatsInEvent {
        public static final int $stable = 8;
        private final AcatsInDataState dataState;
        private final AcatsFlowStep flowStep;
        private final boolean shouldPromptForLockScreen;

        public static /* synthetic */ FlowNavigationEvent copy$default(FlowNavigationEvent flowNavigationEvent, AcatsFlowStep acatsFlowStep, AcatsInDataState acatsInDataState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsFlowStep = flowNavigationEvent.flowStep;
            }
            if ((i & 2) != 0) {
                acatsInDataState = flowNavigationEvent.dataState;
            }
            if ((i & 4) != 0) {
                z = flowNavigationEvent.shouldPromptForLockScreen;
            }
            return flowNavigationEvent.copy(acatsFlowStep, acatsInDataState, z);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsFlowStep getFlowStep() {
            return this.flowStep;
        }

        /* renamed from: component2, reason: from getter */
        public final AcatsInDataState getDataState() {
            return this.dataState;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldPromptForLockScreen() {
            return this.shouldPromptForLockScreen;
        }

        public final FlowNavigationEvent copy(AcatsFlowStep flowStep, AcatsInDataState dataState, boolean shouldPromptForLockScreen) {
            Intrinsics.checkNotNullParameter(flowStep, "flowStep");
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            return new FlowNavigationEvent(flowStep, dataState, shouldPromptForLockScreen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlowNavigationEvent)) {
                return false;
            }
            FlowNavigationEvent flowNavigationEvent = (FlowNavigationEvent) other;
            return this.flowStep == flowNavigationEvent.flowStep && Intrinsics.areEqual(this.dataState, flowNavigationEvent.dataState) && this.shouldPromptForLockScreen == flowNavigationEvent.shouldPromptForLockScreen;
        }

        public int hashCode() {
            return (((this.flowStep.hashCode() * 31) + this.dataState.hashCode()) * 31) + Boolean.hashCode(this.shouldPromptForLockScreen);
        }

        public String toString() {
            return "FlowNavigationEvent(flowStep=" + this.flowStep + ", dataState=" + this.dataState + ", shouldPromptForLockScreen=" + this.shouldPromptForLockScreen + ")";
        }

        public final AcatsFlowStep getFlowStep() {
            return this.flowStep;
        }

        public final AcatsInDataState getDataState() {
            return this.dataState;
        }

        public final boolean getShouldPromptForLockScreen() {
            return this.shouldPromptForLockScreen;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlowNavigationEvent(AcatsFlowStep flowStep, AcatsInDataState dataState, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(flowStep, "flowStep");
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            this.flowStep = flowStep;
            this.dataState = dataState;
            this.shouldPromptForLockScreen = z;
        }
    }

    /* compiled from: AcatsInEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInEvent$FlowCompleteEvent;", "Lcom/robinhood/android/acatsin/AcatsInEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FlowCompleteEvent extends AcatsInEvent {
        public static final int $stable = 0;
        public static final FlowCompleteEvent INSTANCE = new FlowCompleteEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof FlowCompleteEvent);
        }

        public int hashCode() {
            return 681180987;
        }

        public String toString() {
            return "FlowCompleteEvent";
        }

        private FlowCompleteEvent() {
            super(null);
        }
    }

    /* compiled from: AcatsInEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInEvent$MatchRateSelectionEvent;", "Lcom/robinhood/android/acatsin/AcatsInEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MatchRateSelectionEvent extends AcatsInEvent {
        public static final int $stable = 0;
        public static final MatchRateSelectionEvent INSTANCE = new MatchRateSelectionEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof MatchRateSelectionEvent);
        }

        public int hashCode() {
            return 1910260475;
        }

        public String toString() {
            return "MatchRateSelectionEvent";
        }

        private MatchRateSelectionEvent() {
            super(null);
        }
    }

    /* compiled from: AcatsInEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInEvent$OpenPromoFlow;", "Lcom/robinhood/android/acatsin/AcatsInEvent;", "deeplink", "", "shouldFinishActivity", "", "<init>", "(Ljava/lang/String;Z)V", "getDeeplink", "()Ljava/lang/String;", "getShouldFinishActivity", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenPromoFlow extends AcatsInEvent {
        public static final int $stable = 0;
        private final String deeplink;
        private final boolean shouldFinishActivity;

        public static /* synthetic */ OpenPromoFlow copy$default(OpenPromoFlow openPromoFlow, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openPromoFlow.deeplink;
            }
            if ((i & 2) != 0) {
                z = openPromoFlow.shouldFinishActivity;
            }
            return openPromoFlow.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldFinishActivity() {
            return this.shouldFinishActivity;
        }

        public final OpenPromoFlow copy(String deeplink, boolean shouldFinishActivity) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new OpenPromoFlow(deeplink, shouldFinishActivity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenPromoFlow)) {
                return false;
            }
            OpenPromoFlow openPromoFlow = (OpenPromoFlow) other;
            return Intrinsics.areEqual(this.deeplink, openPromoFlow.deeplink) && this.shouldFinishActivity == openPromoFlow.shouldFinishActivity;
        }

        public int hashCode() {
            return (this.deeplink.hashCode() * 31) + Boolean.hashCode(this.shouldFinishActivity);
        }

        public String toString() {
            return "OpenPromoFlow(deeplink=" + this.deeplink + ", shouldFinishActivity=" + this.shouldFinishActivity + ")";
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final boolean getShouldFinishActivity() {
            return this.shouldFinishActivity;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenPromoFlow(String deeplink, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
            this.shouldFinishActivity = z;
        }
    }

    /* compiled from: AcatsInEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInEvent$ShowFailedTransferBottomSheet;", "Lcom/robinhood/android/acatsin/AcatsInEvent;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/api/bonfire/AcatsTransferHubBottomSheetDetails;", "<init>", "(Lcom/robinhood/models/api/bonfire/AcatsTransferHubBottomSheetDetails;)V", "getDetails", "()Lcom/robinhood/models/api/bonfire/AcatsTransferHubBottomSheetDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFailedTransferBottomSheet extends AcatsInEvent {
        public static final int $stable = 8;
        private final AcatsTransferHubBottomSheetDetails details;

        public static /* synthetic */ ShowFailedTransferBottomSheet copy$default(ShowFailedTransferBottomSheet showFailedTransferBottomSheet, AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsTransferHubBottomSheetDetails = showFailedTransferBottomSheet.details;
            }
            return showFailedTransferBottomSheet.copy(acatsTransferHubBottomSheetDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsTransferHubBottomSheetDetails getDetails() {
            return this.details;
        }

        public final ShowFailedTransferBottomSheet copy(AcatsTransferHubBottomSheetDetails details) {
            Intrinsics.checkNotNullParameter(details, "details");
            return new ShowFailedTransferBottomSheet(details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowFailedTransferBottomSheet) && Intrinsics.areEqual(this.details, ((ShowFailedTransferBottomSheet) other).details);
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        public String toString() {
            return "ShowFailedTransferBottomSheet(details=" + this.details + ")";
        }

        public final AcatsTransferHubBottomSheetDetails getDetails() {
            return this.details;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFailedTransferBottomSheet(AcatsTransferHubBottomSheetDetails details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }
    }

    /* compiled from: AcatsInEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInEvent$ShowBorrowingFeeBottomSheet;", "Lcom/robinhood/android/acatsin/AcatsInEvent;", "shortPositionsWithFees", "", "Lcom/robinhood/android/acatsin/borrowingfee/UiShortPositionFeeData;", "<init>", "(Ljava/util/List;)V", "getShortPositionsWithFees", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowBorrowingFeeBottomSheet extends AcatsInEvent {
        public static final int $stable = 8;
        private final List<UiShortPositionFeeData> shortPositionsWithFees;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowBorrowingFeeBottomSheet copy$default(ShowBorrowingFeeBottomSheet showBorrowingFeeBottomSheet, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = showBorrowingFeeBottomSheet.shortPositionsWithFees;
            }
            return showBorrowingFeeBottomSheet.copy(list);
        }

        public final List<UiShortPositionFeeData> component1() {
            return this.shortPositionsWithFees;
        }

        public final ShowBorrowingFeeBottomSheet copy(List<UiShortPositionFeeData> shortPositionsWithFees) {
            Intrinsics.checkNotNullParameter(shortPositionsWithFees, "shortPositionsWithFees");
            return new ShowBorrowingFeeBottomSheet(shortPositionsWithFees);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowBorrowingFeeBottomSheet) && Intrinsics.areEqual(this.shortPositionsWithFees, ((ShowBorrowingFeeBottomSheet) other).shortPositionsWithFees);
        }

        public int hashCode() {
            return this.shortPositionsWithFees.hashCode();
        }

        public String toString() {
            return "ShowBorrowingFeeBottomSheet(shortPositionsWithFees=" + this.shortPositionsWithFees + ")";
        }

        public final List<UiShortPositionFeeData> getShortPositionsWithFees() {
            return this.shortPositionsWithFees;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowBorrowingFeeBottomSheet(List<UiShortPositionFeeData> shortPositionsWithFees) {
            super(null);
            Intrinsics.checkNotNullParameter(shortPositionsWithFees, "shortPositionsWithFees");
            this.shortPositionsWithFees = shortPositionsWithFees;
        }
    }
}
