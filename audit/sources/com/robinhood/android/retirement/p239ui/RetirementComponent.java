package com.robinhood.android.retirement.p239ui;

import com.robinhood.android.assethomes.AssetHomeTopAppBar;
import com.robinhood.android.models.retirement.api.analytics.RecommendationsState;
import com.robinhood.android.models.retirement.api.analytics.RetirementAccountState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.retirement.RecommendationsState2;
import com.robinhood.rosetta.converters.retirement.RetirementAccountState2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RecsRetirementContext;
import com.robinhood.rosetta.eventlogging.RetirementContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementComponent.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0017B1\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementComponent;", "", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "getAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "Settings", "Search", "Inbox", "SummaryCard", "ContributionCta", "FindInvestment", "Lcom/robinhood/android/retirement/ui/RetirementComponent$ContributionCta;", "Lcom/robinhood/android/retirement/ui/RetirementComponent$FindInvestment;", "Lcom/robinhood/android/retirement/ui/RetirementComponent$Inbox;", "Lcom/robinhood/android/retirement/ui/RetirementComponent$Search;", "Lcom/robinhood/android/retirement/ui/RetirementComponent$Settings;", "Lcom/robinhood/android/retirement/ui/RetirementComponent$SummaryCard;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class RetirementComponent {
    public static final int $stable = 8;
    private final UserInteractionEventData.Action action;
    private final Component component;
    private final Context context;

    public /* synthetic */ RetirementComponent(Component component, UserInteractionEventData.Action action, Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(component, action, context);
    }

    private RetirementComponent(Component component, UserInteractionEventData.Action action, Context context) {
        this.component = component;
        this.action = action;
        this.context = context;
    }

    public final Component getComponent() {
        return this.component;
    }

    public /* synthetic */ RetirementComponent(Component component, UserInteractionEventData.Action action, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(component, (i & 2) != 0 ? UserInteractionEventData.Action.ACTION_UNSPECIFIED : action, (i & 4) != 0 ? null : context, null);
    }

    public final UserInteractionEventData.Action getAction() {
        return this.action;
    }

    public final Context getContext() {
        return this.context;
    }

    /* compiled from: RetirementComponent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementComponent$Settings;", "Lcom/robinhood/android/retirement/ui/RetirementComponent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Settings extends RetirementComponent {
        public static final Settings INSTANCE = new Settings();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof Settings);
        }

        public int hashCode() {
            return -1000181626;
        }

        public String toString() {
            return "Settings";
        }

        private Settings() {
            Component component = new Component(Component.ComponentType.BUTTON, "top_nav-settings", null, 4, null);
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_SETTINGS;
            super(component, action, null, 4, null);
        }
    }

    /* compiled from: RetirementComponent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementComponent$Search;", "Lcom/robinhood/android/retirement/ui/RetirementComponent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Search extends RetirementComponent {
        public static final Search INSTANCE = new Search();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof Search);
        }

        public int hashCode() {
            return 418502347;
        }

        public String toString() {
            return "Search";
        }

        private Search() {
            Component component = new Component(Component.ComponentType.BUTTON, AssetHomeTopAppBar.SEARCH_IDENTIFIER, null, 4, null);
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_SEARCH;
            super(component, action, null, 4, null);
        }
    }

    /* compiled from: RetirementComponent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementComponent$Inbox;", "Lcom/robinhood/android/retirement/ui/RetirementComponent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Inbox extends RetirementComponent {
        public static final Inbox INSTANCE = new Inbox();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof Inbox);
        }

        public int hashCode() {
            return 697270531;
        }

        public String toString() {
            return "Inbox";
        }

        private Inbox() {
            Component component = new Component(Component.ComponentType.BUTTON, "top_nav-inbox", null, 4, null);
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_INBOX;
            super(component, action, null, 4, null);
        }
    }

    /* compiled from: RetirementComponent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementComponent$SummaryCard;", "Lcom/robinhood/android/retirement/ui/RetirementComponent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SummaryCard extends RetirementComponent {
        public static final SummaryCard INSTANCE = new SummaryCard();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof SummaryCard);
        }

        public int hashCode() {
            return 1000284307;
        }

        public String toString() {
            return "SummaryCard";
        }

        private SummaryCard() {
            Component component = new Component(Component.ComponentType.BUTTON, "contribution_summary_card", null, 4, null);
            UserInteractionEventData.Action action = null;
            super(component, action, null, 6, null);
        }
    }

    /* compiled from: RetirementComponent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementComponent$ContributionCta;", "Lcom/robinhood/android/retirement/ui/RetirementComponent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContributionCta extends RetirementComponent {
        public static final ContributionCta INSTANCE = new ContributionCta();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof ContributionCta);
        }

        public int hashCode() {
            return 2106872349;
        }

        public String toString() {
            return "ContributionCta";
        }

        private ContributionCta() {
            Component component = new Component(Component.ComponentType.BUTTON, "contribution_cta", null, 4, null);
            UserInteractionEventData.Action action = null;
            super(component, action, null, 6, null);
        }
    }

    /* compiled from: RetirementComponent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementComponent$FindInvestment;", "Lcom/robinhood/android/retirement/ui/RetirementComponent;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "accountState", "Lcom/robinhood/android/models/retirement/api/analytics/RetirementAccountState;", "recsState", "Lcom/robinhood/android/models/retirement/api/analytics/RecommendationsState;", "identifier", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/models/retirement/api/analytics/RetirementAccountState;Lcom/robinhood/android/models/retirement/api/analytics/RecommendationsState;Ljava/lang/String;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getAccountState", "()Lcom/robinhood/android/models/retirement/api/analytics/RetirementAccountState;", "getRecsState", "()Lcom/robinhood/android/models/retirement/api/analytics/RecommendationsState;", "getIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FindInvestment extends RetirementComponent {
        public static final int $stable = 8;
        private final RetirementAccountState accountState;
        private final BrokerageAccountType accountType;
        private final String identifier;
        private final RecommendationsState recsState;

        public static /* synthetic */ FindInvestment copy$default(FindInvestment findInvestment, BrokerageAccountType brokerageAccountType, RetirementAccountState retirementAccountState, RecommendationsState recommendationsState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = findInvestment.accountType;
            }
            if ((i & 2) != 0) {
                retirementAccountState = findInvestment.accountState;
            }
            if ((i & 4) != 0) {
                recommendationsState = findInvestment.recsState;
            }
            if ((i & 8) != 0) {
                str = findInvestment.identifier;
            }
            return findInvestment.copy(brokerageAccountType, retirementAccountState, recommendationsState, str);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component2, reason: from getter */
        public final RetirementAccountState getAccountState() {
            return this.accountState;
        }

        /* renamed from: component3, reason: from getter */
        public final RecommendationsState getRecsState() {
            return this.recsState;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final FindInvestment copy(BrokerageAccountType accountType, RetirementAccountState accountState, RecommendationsState recsState, String identifier) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(accountState, "accountState");
            Intrinsics.checkNotNullParameter(recsState, "recsState");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new FindInvestment(accountType, accountState, recsState, identifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FindInvestment)) {
                return false;
            }
            FindInvestment findInvestment = (FindInvestment) other;
            return this.accountType == findInvestment.accountType && this.accountState == findInvestment.accountState && this.recsState == findInvestment.recsState && Intrinsics.areEqual(this.identifier, findInvestment.identifier);
        }

        public int hashCode() {
            return (((((this.accountType.hashCode() * 31) + this.accountState.hashCode()) * 31) + this.recsState.hashCode()) * 31) + this.identifier.hashCode();
        }

        public String toString() {
            return "FindInvestment(accountType=" + this.accountType + ", accountState=" + this.accountState + ", recsState=" + this.recsState + ", identifier=" + this.identifier + ")";
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final RetirementAccountState getAccountState() {
            return this.accountState;
        }

        public final RecommendationsState getRecsState() {
            return this.recsState;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FindInvestment(BrokerageAccountType accountType, RetirementAccountState accountState, RecommendationsState recsState, String identifier) {
            super(new Component(Component.ComponentType.BUTTON, identifier, null, 4, null), UserInteractionEventData.Action.FIND_INVESTMENT, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RecsRetirementContext("organic", "", accountType.getServerValue(), RecommendationsState2.toProtoBuf(recsState), null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RetirementContext(accountType.getServerValue(), RetirementAccountState2.toProtoBuf(accountState), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -134217729, -32769, -1, -1, 16383, null), null);
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(accountState, "accountState");
            Intrinsics.checkNotNullParameter(recsState, "recsState");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.accountType = accountType;
            this.accountState = accountState;
            this.recsState = recsState;
            this.identifier = identifier;
        }
    }
}
