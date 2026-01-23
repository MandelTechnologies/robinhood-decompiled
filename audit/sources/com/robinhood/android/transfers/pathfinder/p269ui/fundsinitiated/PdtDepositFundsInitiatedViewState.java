package com.robinhood.android.transfers.pathfinder.p269ui.fundsinitiated;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;

/* compiled from: PdtDepositFundsInitiatedViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState;", "", "state", "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State;", "isSendingContinue", "", "sendContinueErrorEvent", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "", "<init>", "(Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State;ZLcom/robinhood/compose/duxo/ComposeUiEvent;)V", "getState", "()Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State;", "()Z", "getSendContinueErrorEvent", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "State", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PdtDepositFundsInitiatedViewState {
    public static final int $stable = ComposeUiEvent.$stable;
    private final boolean isSendingContinue;
    private final ComposeUiEvent<Throwable> sendContinueErrorEvent;
    private final State state;

    public PdtDepositFundsInitiatedViewState() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PdtDepositFundsInitiatedViewState copy$default(PdtDepositFundsInitiatedViewState pdtDepositFundsInitiatedViewState, State state, boolean z, ComposeUiEvent composeUiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            state = pdtDepositFundsInitiatedViewState.state;
        }
        if ((i & 2) != 0) {
            z = pdtDepositFundsInitiatedViewState.isSendingContinue;
        }
        if ((i & 4) != 0) {
            composeUiEvent = pdtDepositFundsInitiatedViewState.sendContinueErrorEvent;
        }
        return pdtDepositFundsInitiatedViewState.copy(state, z, composeUiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final State getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSendingContinue() {
        return this.isSendingContinue;
    }

    public final ComposeUiEvent<Throwable> component3() {
        return this.sendContinueErrorEvent;
    }

    public final PdtDepositFundsInitiatedViewState copy(State state, boolean isSendingContinue, ComposeUiEvent<Throwable> sendContinueErrorEvent) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new PdtDepositFundsInitiatedViewState(state, isSendingContinue, sendContinueErrorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdtDepositFundsInitiatedViewState)) {
            return false;
        }
        PdtDepositFundsInitiatedViewState pdtDepositFundsInitiatedViewState = (PdtDepositFundsInitiatedViewState) other;
        return Intrinsics.areEqual(this.state, pdtDepositFundsInitiatedViewState.state) && this.isSendingContinue == pdtDepositFundsInitiatedViewState.isSendingContinue && Intrinsics.areEqual(this.sendContinueErrorEvent, pdtDepositFundsInitiatedViewState.sendContinueErrorEvent);
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + Boolean.hashCode(this.isSendingContinue)) * 31;
        ComposeUiEvent<Throwable> composeUiEvent = this.sendContinueErrorEvent;
        return iHashCode + (composeUiEvent == null ? 0 : composeUiEvent.hashCode());
    }

    public String toString() {
        return "PdtDepositFundsInitiatedViewState(state=" + this.state + ", isSendingContinue=" + this.isSendingContinue + ", sendContinueErrorEvent=" + this.sendContinueErrorEvent + ")";
    }

    public PdtDepositFundsInitiatedViewState(State state, boolean z, ComposeUiEvent<Throwable> composeUiEvent) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.isSendingContinue = z;
        this.sendContinueErrorEvent = composeUiEvent;
    }

    public /* synthetic */ PdtDepositFundsInitiatedViewState(State state, boolean z, ComposeUiEvent composeUiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? State.Loading.INSTANCE : state, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : composeUiEvent);
    }

    public final State getState() {
        return this.state;
    }

    public final boolean isSendingContinue() {
        return this.isSendingContinue;
    }

    public final ComposeUiEvent<Throwable> getSendContinueErrorEvent() {
        return this.sendContinueErrorEvent;
    }

    /* compiled from: PdtDepositFundsInitiatedViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State;", "", "<init>", "()V", "Loading", "Success", "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State$Loading;", "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State$Success;", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private State() {
        }

        /* compiled from: PdtDepositFundsInitiatedViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State$Loading;", "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State;", "<init>", "()V", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends State {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        /* compiled from: PdtDepositFundsInitiatedViewState.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State$Success;", "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State;", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "<init>", "(Lcom/robinhood/transfers/models/db/AchTransfer;Lcom/robinhood/models/db/AchRelationship;)V", "accountDisplayText", "Lcom/robinhood/utils/resource/StringResource;", "getAccountDisplayText", "()Lcom/robinhood/utils/resource/StringResource;", "amount", "Lcom/robinhood/models/util/Money;", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTimeline1Metadata", "", "resources", "Landroid/content/res/Resources;", "timeline1Timestamp", "getTimeline1Timestamp", "timeline2Timestamp", "getTimeline2Timestamp", "timeline2Status", "Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "getTimeline2Status", "()Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Success extends State {
            public static final int $stable = 8;
            private final StringResource accountDisplayText;
            private final AchRelationship achRelationship;
            private final AchTransfer achTransfer;
            private final Money amount;
            private final StringResource timeline1Timestamp;
            private final Timeline.Status timeline2Status;
            private final StringResource timeline2Timestamp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(AchTransfer achTransfer, AchRelationship achRelationship) {
                super(null);
                Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
                Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
                this.achTransfer = achTransfer;
                this.achRelationship = achRelationship;
                this.accountDisplayText = AchRelationships.getAchRelationshipDisplayNameResource(achRelationship);
                this.amount = achTransfer.getAmount();
                StringResource.Companion companion = StringResource.INSTANCE;
                Instant initiatedAt = achTransfer.getInitiatedAt();
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                LocalDate localDate = Instants.toLocalDate(initiatedAt, zoneIdSystemDefault);
                LocalDateFormatter localDateFormatter = LocalDateFormatter.MEDIUM_WITH_OPTIONAL_YEAR;
                this.timeline1Timestamp = companion.invoke(localDateFormatter.format((LocalDateFormatter) localDate));
                this.timeline2Timestamp = companion.invoke(localDateFormatter.format((LocalDateFormatter) achTransfer.getExpectedLandingDate()));
                this.timeline2Status = achTransfer.isSuccess() ? Timeline.Status.COMPLETE : Timeline.Status.INCOMPLETE;
            }

            public final StringResource getAccountDisplayText() {
                return this.accountDisplayText;
            }

            public final Money getAmount() {
                return this.amount;
            }

            public final String getTimeline1Metadata(Resources resources) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                Instant initiatedAt = this.achTransfer.getInitiatedAt();
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                return LocalDates4.formatRecent(Instants.toLocalDate(initiatedAt, zoneIdSystemDefault), resources, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false);
            }

            public final StringResource getTimeline1Timestamp() {
                return this.timeline1Timestamp;
            }

            public final StringResource getTimeline2Timestamp() {
                return this.timeline2Timestamp;
            }

            public final Timeline.Status getTimeline2Status() {
                return this.timeline2Status;
            }
        }
    }
}
