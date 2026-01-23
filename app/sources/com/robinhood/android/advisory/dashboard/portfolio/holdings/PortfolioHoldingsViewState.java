package com.robinhood.android.advisory.dashboard.portfolio.holdings;

import com.robinhood.android.autoeventlogging.LoggableViewState;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PortfolioHoldingsViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsViewState;", "Lcom/robinhood/android/autoeventlogging/LoggableViewState;", "showTotalValueToggle", "", "getShowTotalValueToggle", "()Z", "viewMode", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/ViewMode;", "getViewMode", "()Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/ViewMode;", "Loading", "Loaded", "Companion", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsViewState$Loaded;", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsViewState$Loading;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface PortfolioHoldingsViewState extends LoggableViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean getShowTotalValueToggle();

    PortfolioHoldings3 getViewMode();

    /* compiled from: PortfolioHoldingsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsViewState$Loading;", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsViewState;", "<init>", "()V", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "showTotalValueToggle", "", "getShowTotalValueToggle", "()Z", "viewMode", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/ViewMode;", "getViewMode", "()Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/ViewMode;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements PortfolioHoldingsViewState {
        public static final int $stable = 0;
        private static final boolean showTotalValueToggle = false;
        public static final Loading INSTANCE = new Loading();
        private static final PortfolioHoldings3 viewMode = PortfolioHoldings3.PERCENT;

        private Loading() {
        }

        @Override // com.robinhood.android.autoeventlogging.LoggableViewState
        public LoggableViewState2 loadedState() {
            return new LoggableViewState2.Loading("PORTFOLIO_HOLDINGS_VIEW_READY");
        }

        @Override // com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsViewState
        public boolean getShowTotalValueToggle() {
            return showTotalValueToggle;
        }

        @Override // com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsViewState
        public PortfolioHoldings3 getViewMode() {
            return viewMode;
        }
    }

    /* compiled from: PortfolioHoldingsViewState.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003Ja\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsViewState$Loaded;", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsViewState;", "showTotalValueToggle", "", "viewMode", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/ViewMode;", "holdingRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/HoldingRowData;", "canNavigateToDrillDown", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "accountConfigStyle", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/AccountConfigStyle;", "<init>", "(ZLcom/robinhood/android/advisory/dashboard/portfolio/holdings/ViewMode;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/AccountConfigStyle;)V", "getShowTotalValueToggle", "()Z", "getViewMode", "()Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/ViewMode;", "getHoldingRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getCanNavigateToDrillDown", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getDisclosure", "()Ljava/lang/String;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getAccountConfigStyle", "()Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/AccountConfigStyle;", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements PortfolioHoldingsViewState {
        public static final int $stable = 8;
        private final PortfolioHoldingsViewState2 accountConfigStyle;
        private final BrokerageAccountType brokerageAccountType;
        private final boolean canNavigateToDrillDown;
        private final String disclosure;
        private final Context eventContext;
        private final ImmutableList<HoldingRowData> holdingRows;
        private final boolean showTotalValueToggle;
        private final PortfolioHoldings3 viewMode;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, boolean z, PortfolioHoldings3 portfolioHoldings3, ImmutableList immutableList, boolean z2, BrokerageAccountType brokerageAccountType, String str, Context context, PortfolioHoldingsViewState2 portfolioHoldingsViewState2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loaded.showTotalValueToggle;
            }
            if ((i & 2) != 0) {
                portfolioHoldings3 = loaded.viewMode;
            }
            if ((i & 4) != 0) {
                immutableList = loaded.holdingRows;
            }
            if ((i & 8) != 0) {
                z2 = loaded.canNavigateToDrillDown;
            }
            if ((i & 16) != 0) {
                brokerageAccountType = loaded.brokerageAccountType;
            }
            if ((i & 32) != 0) {
                str = loaded.disclosure;
            }
            if ((i & 64) != 0) {
                context = loaded.eventContext;
            }
            if ((i & 128) != 0) {
                portfolioHoldingsViewState2 = loaded.accountConfigStyle;
            }
            Context context2 = context;
            PortfolioHoldingsViewState2 portfolioHoldingsViewState22 = portfolioHoldingsViewState2;
            BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
            String str2 = str;
            return loaded.copy(z, portfolioHoldings3, immutableList, z2, brokerageAccountType2, str2, context2, portfolioHoldingsViewState22);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowTotalValueToggle() {
            return this.showTotalValueToggle;
        }

        /* renamed from: component2, reason: from getter */
        public final PortfolioHoldings3 getViewMode() {
            return this.viewMode;
        }

        public final ImmutableList<HoldingRowData> component3() {
            return this.holdingRows;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getCanNavigateToDrillDown() {
            return this.canNavigateToDrillDown;
        }

        /* renamed from: component5, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component7, reason: from getter */
        public final Context getEventContext() {
            return this.eventContext;
        }

        /* renamed from: component8, reason: from getter */
        public final PortfolioHoldingsViewState2 getAccountConfigStyle() {
            return this.accountConfigStyle;
        }

        public final Loaded copy(boolean showTotalValueToggle, PortfolioHoldings3 viewMode, ImmutableList<HoldingRowData> holdingRows, boolean canNavigateToDrillDown, BrokerageAccountType brokerageAccountType, String disclosure, Context eventContext, PortfolioHoldingsViewState2 accountConfigStyle) {
            Intrinsics.checkNotNullParameter(viewMode, "viewMode");
            Intrinsics.checkNotNullParameter(holdingRows, "holdingRows");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            Intrinsics.checkNotNullParameter(accountConfigStyle, "accountConfigStyle");
            return new Loaded(showTotalValueToggle, viewMode, holdingRows, canNavigateToDrillDown, brokerageAccountType, disclosure, eventContext, accountConfigStyle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.showTotalValueToggle == loaded.showTotalValueToggle && this.viewMode == loaded.viewMode && Intrinsics.areEqual(this.holdingRows, loaded.holdingRows) && this.canNavigateToDrillDown == loaded.canNavigateToDrillDown && this.brokerageAccountType == loaded.brokerageAccountType && Intrinsics.areEqual(this.disclosure, loaded.disclosure) && Intrinsics.areEqual(this.eventContext, loaded.eventContext) && this.accountConfigStyle == loaded.accountConfigStyle;
        }

        public int hashCode() {
            int iHashCode = ((((((((Boolean.hashCode(this.showTotalValueToggle) * 31) + this.viewMode.hashCode()) * 31) + this.holdingRows.hashCode()) * 31) + Boolean.hashCode(this.canNavigateToDrillDown)) * 31) + this.brokerageAccountType.hashCode()) * 31;
            String str = this.disclosure;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.eventContext.hashCode()) * 31) + this.accountConfigStyle.hashCode();
        }

        public String toString() {
            return "Loaded(showTotalValueToggle=" + this.showTotalValueToggle + ", viewMode=" + this.viewMode + ", holdingRows=" + this.holdingRows + ", canNavigateToDrillDown=" + this.canNavigateToDrillDown + ", brokerageAccountType=" + this.brokerageAccountType + ", disclosure=" + this.disclosure + ", eventContext=" + this.eventContext + ", accountConfigStyle=" + this.accountConfigStyle + ")";
        }

        public Loaded(boolean z, PortfolioHoldings3 viewMode, ImmutableList<HoldingRowData> holdingRows, boolean z2, BrokerageAccountType brokerageAccountType, String str, Context eventContext, PortfolioHoldingsViewState2 accountConfigStyle) {
            Intrinsics.checkNotNullParameter(viewMode, "viewMode");
            Intrinsics.checkNotNullParameter(holdingRows, "holdingRows");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            Intrinsics.checkNotNullParameter(accountConfigStyle, "accountConfigStyle");
            this.showTotalValueToggle = z;
            this.viewMode = viewMode;
            this.holdingRows = holdingRows;
            this.canNavigateToDrillDown = z2;
            this.brokerageAccountType = brokerageAccountType;
            this.disclosure = str;
            this.eventContext = eventContext;
            this.accountConfigStyle = accountConfigStyle;
        }

        @Override // com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsViewState
        public boolean getShowTotalValueToggle() {
            return this.showTotalValueToggle;
        }

        @Override // com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsViewState
        public PortfolioHoldings3 getViewMode() {
            return this.viewMode;
        }

        public final ImmutableList<HoldingRowData> getHoldingRows() {
            return this.holdingRows;
        }

        public final boolean getCanNavigateToDrillDown() {
            return this.canNavigateToDrillDown;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final String getDisclosure() {
            return this.disclosure;
        }

        public final Context getEventContext() {
            return this.eventContext;
        }

        public final PortfolioHoldingsViewState2 getAccountConfigStyle() {
            return this.accountConfigStyle;
        }

        @Override // com.robinhood.android.autoeventlogging.LoggableViewState
        public LoggableViewState2 loadedState() {
            return new LoggableViewState2.Completed("PORTFOLIO_HOLDINGS_VIEW_READY", null, 2, null);
        }
    }

    /* compiled from: PortfolioHoldingsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsViewState$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String IDENTIFIER = "PORTFOLIO_HOLDINGS_VIEW_READY";

        private Companion() {
        }
    }
}
