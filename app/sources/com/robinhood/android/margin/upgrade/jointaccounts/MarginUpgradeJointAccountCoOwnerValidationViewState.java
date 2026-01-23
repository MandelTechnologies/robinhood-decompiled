package com.robinhood.android.margin.upgrade.jointaccounts;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.margin.upgrade.C21137R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeJointAccountCoOwnerValidationViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState;", "", "state", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State;", "isSendingEmailToCoOwner", "", "<init>", "(Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State;Z)V", "getState", "()Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "State", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginUpgradeJointAccountCoOwnerValidationViewState {
    public static final int $stable = 0;
    private final boolean isSendingEmailToCoOwner;
    private final State state;

    public static /* synthetic */ MarginUpgradeJointAccountCoOwnerValidationViewState copy$default(MarginUpgradeJointAccountCoOwnerValidationViewState marginUpgradeJointAccountCoOwnerValidationViewState, State state, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            state = marginUpgradeJointAccountCoOwnerValidationViewState.state;
        }
        if ((i & 2) != 0) {
            z = marginUpgradeJointAccountCoOwnerValidationViewState.isSendingEmailToCoOwner;
        }
        return marginUpgradeJointAccountCoOwnerValidationViewState.copy(state, z);
    }

    /* renamed from: component1, reason: from getter */
    public final State getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSendingEmailToCoOwner() {
        return this.isSendingEmailToCoOwner;
    }

    public final MarginUpgradeJointAccountCoOwnerValidationViewState copy(State state, boolean isSendingEmailToCoOwner) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new MarginUpgradeJointAccountCoOwnerValidationViewState(state, isSendingEmailToCoOwner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginUpgradeJointAccountCoOwnerValidationViewState)) {
            return false;
        }
        MarginUpgradeJointAccountCoOwnerValidationViewState marginUpgradeJointAccountCoOwnerValidationViewState = (MarginUpgradeJointAccountCoOwnerValidationViewState) other;
        return Intrinsics.areEqual(this.state, marginUpgradeJointAccountCoOwnerValidationViewState.state) && this.isSendingEmailToCoOwner == marginUpgradeJointAccountCoOwnerValidationViewState.isSendingEmailToCoOwner;
    }

    public int hashCode() {
        return (this.state.hashCode() * 31) + Boolean.hashCode(this.isSendingEmailToCoOwner);
    }

    public String toString() {
        return "MarginUpgradeJointAccountCoOwnerValidationViewState(state=" + this.state + ", isSendingEmailToCoOwner=" + this.isSendingEmailToCoOwner + ")";
    }

    public MarginUpgradeJointAccountCoOwnerValidationViewState(State state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.isSendingEmailToCoOwner = z;
    }

    public /* synthetic */ MarginUpgradeJointAccountCoOwnerValidationViewState(State state, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(state, (i & 2) != 0 ? false : z);
    }

    public final State getState() {
        return this.state;
    }

    public final boolean isSendingEmailToCoOwner() {
        return this.isSendingEmailToCoOwner;
    }

    /* compiled from: MarginUpgradeJointAccountCoOwnerValidationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State;", "", "<init>", "()V", "Loading", "CoOwnerInvestorActionRequired", "EmailSentToCoOwner", "ErrorSendingEmail", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State$CoOwnerInvestorActionRequired;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State$EmailSentToCoOwner;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State$ErrorSendingEmail;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State$Loading;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private State() {
        }

        /* compiled from: MarginUpgradeJointAccountCoOwnerValidationViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State$Loading;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading extends State {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -1985365070;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
                super(null);
            }
        }

        /* compiled from: MarginUpgradeJointAccountCoOwnerValidationViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State$CoOwnerInvestorActionRequired;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State;", "coOwnerFirstName", "", "<init>", "(Ljava/lang/String;)V", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "description", "getDescription", "primaryCta", "getPrimaryCta", "secondaryCta", "getSecondaryCta", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CoOwnerInvestorActionRequired extends State {
            public static final int $stable = StringResource.$stable;
            private final String coOwnerFirstName;
            private final StringResource description;
            private final StringResource primaryCta;
            private final StringResource secondaryCta;
            private final StringResource title;

            /* renamed from: component1, reason: from getter */
            private final String getCoOwnerFirstName() {
                return this.coOwnerFirstName;
            }

            public static /* synthetic */ CoOwnerInvestorActionRequired copy$default(CoOwnerInvestorActionRequired coOwnerInvestorActionRequired, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = coOwnerInvestorActionRequired.coOwnerFirstName;
                }
                return coOwnerInvestorActionRequired.copy(str);
            }

            public final CoOwnerInvestorActionRequired copy(String coOwnerFirstName) {
                Intrinsics.checkNotNullParameter(coOwnerFirstName, "coOwnerFirstName");
                return new CoOwnerInvestorActionRequired(coOwnerFirstName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CoOwnerInvestorActionRequired) && Intrinsics.areEqual(this.coOwnerFirstName, ((CoOwnerInvestorActionRequired) other).coOwnerFirstName);
            }

            public int hashCode() {
                return this.coOwnerFirstName.hashCode();
            }

            public String toString() {
                return "CoOwnerInvestorActionRequired(coOwnerFirstName=" + this.coOwnerFirstName + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CoOwnerInvestorActionRequired(String coOwnerFirstName) {
                super(null);
                Intrinsics.checkNotNullParameter(coOwnerFirstName, "coOwnerFirstName");
                this.coOwnerFirstName = coOwnerFirstName;
                StringResource.Companion companion = StringResource.INSTANCE;
                this.title = companion.invoke(C21137R.string.margin_upgrade_joint_account_co_owner_ip_action_required_title, coOwnerFirstName);
                this.description = companion.invoke(C21137R.string.f4535xab330f31, coOwnerFirstName);
                this.primaryCta = companion.invoke(C21137R.string.f4536xde4c7988, new Object[0]);
                this.secondaryCta = companion.invoke(C11048R.string.general_label_not_now, new Object[0]);
            }

            public final StringResource getTitle() {
                return this.title;
            }

            public final StringResource getDescription() {
                return this.description;
            }

            public final StringResource getPrimaryCta() {
                return this.primaryCta;
            }

            public final StringResource getSecondaryCta() {
                return this.secondaryCta;
            }
        }

        /* compiled from: MarginUpgradeJointAccountCoOwnerValidationViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State$EmailSentToCoOwner;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State;", "<init>", "()V", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "description", "getDescription", "primaryCta", "getPrimaryCta", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EmailSentToCoOwner extends State {
            public static final int $stable = StringResource.$stable;
            private final StringResource description;
            private final StringResource primaryCta;
            private final StringResource title;

            public EmailSentToCoOwner() {
                super(null);
                StringResource.Companion companion = StringResource.INSTANCE;
                this.title = companion.invoke(C21137R.string.margin_upgrade_joint_account_co_owner_email_sent_title, new Object[0]);
                this.description = companion.invoke(C21137R.string.margin_upgrade_joint_account_co_owner_email_sent_description, new Object[0]);
                this.primaryCta = companion.invoke(C11048R.string.general_label_done, new Object[0]);
            }

            public final StringResource getTitle() {
                return this.title;
            }

            public final StringResource getDescription() {
                return this.description;
            }

            public final StringResource getPrimaryCta() {
                return this.primaryCta;
            }
        }

        /* compiled from: MarginUpgradeJointAccountCoOwnerValidationViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State$ErrorSendingEmail;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ErrorSendingEmail extends State {
            public static final int $stable = 0;
            public static final ErrorSendingEmail INSTANCE = new ErrorSendingEmail();

            public boolean equals(Object other) {
                return this == other || (other instanceof ErrorSendingEmail);
            }

            public int hashCode() {
                return 1368736128;
            }

            public String toString() {
                return "ErrorSendingEmail";
            }

            private ErrorSendingEmail() {
                super(null);
            }
        }
    }
}
