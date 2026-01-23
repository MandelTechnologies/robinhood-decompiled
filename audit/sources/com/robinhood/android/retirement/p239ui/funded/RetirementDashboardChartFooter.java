package com.robinhood.android.retirement.p239ui.funded;

import com.robinhood.android.retirement.lib.UninvestedSectionState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RetirementDashboardChartFooter.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/ChartFooter;", "", "InvestmentAndTrade", "Uninvested", "Loading", "Lcom/robinhood/android/retirement/ui/funded/ChartFooter$InvestmentAndTrade;", "Lcom/robinhood/android/retirement/ui/funded/ChartFooter$Loading;", "Lcom/robinhood/android/retirement/ui/funded/ChartFooter$Uninvested;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.funded.ChartFooter, reason: use source file name */
/* loaded from: classes5.dex */
public interface RetirementDashboardChartFooter {

    /* compiled from: RetirementDashboardChartFooter.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/ChartFooter$InvestmentAndTrade;", "Lcom/robinhood/android/retirement/ui/funded/ChartFooter;", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lkotlinx/collections/immutable/ImmutableList;)V", "getAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.ui.funded.ChartFooter$InvestmentAndTrade, reason: from toString */
    public static final /* data */ class InvestmentAndTrade implements RetirementDashboardChartFooter {
        public static final int $stable = 8;
        private final String accountNumber;
        private final BrokerageAccountType brokerageAccountType;
        private final ImmutableList<UIComponent<GenericAction>> components;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InvestmentAndTrade copy$default(InvestmentAndTrade investmentAndTrade, String str, BrokerageAccountType brokerageAccountType, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                str = investmentAndTrade.accountNumber;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = investmentAndTrade.brokerageAccountType;
            }
            if ((i & 4) != 0) {
                immutableList = investmentAndTrade.components;
            }
            return investmentAndTrade.copy(str, brokerageAccountType, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final ImmutableList<UIComponent<GenericAction>> component3() {
            return this.components;
        }

        public final InvestmentAndTrade copy(String accountNumber, BrokerageAccountType brokerageAccountType, ImmutableList<? extends UIComponent<? extends GenericAction>> components) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(components, "components");
            return new InvestmentAndTrade(accountNumber, brokerageAccountType, components);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvestmentAndTrade)) {
                return false;
            }
            InvestmentAndTrade investmentAndTrade = (InvestmentAndTrade) other;
            return Intrinsics.areEqual(this.accountNumber, investmentAndTrade.accountNumber) && this.brokerageAccountType == investmentAndTrade.brokerageAccountType && Intrinsics.areEqual(this.components, investmentAndTrade.components);
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.components.hashCode();
        }

        public String toString() {
            return "InvestmentAndTrade(accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", components=" + this.components + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InvestmentAndTrade(String accountNumber, BrokerageAccountType brokerageAccountType, ImmutableList<? extends UIComponent<? extends GenericAction>> components) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(components, "components");
            this.accountNumber = accountNumber;
            this.brokerageAccountType = brokerageAccountType;
            this.components = components;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final ImmutableList<UIComponent<GenericAction>> getComponents() {
            return this.components;
        }
    }

    /* compiled from: RetirementDashboardChartFooter.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/ChartFooter$Uninvested;", "Lcom/robinhood/android/retirement/ui/funded/ChartFooter;", "accountNumber", "", "sectionState", "Lcom/robinhood/android/retirement/lib/UninvestedSectionState;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/retirement/lib/UninvestedSectionState;)V", "getAccountNumber", "()Ljava/lang/String;", "getSectionState", "()Lcom/robinhood/android/retirement/lib/UninvestedSectionState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.ui.funded.ChartFooter$Uninvested, reason: from toString */
    public static final /* data */ class Uninvested implements RetirementDashboardChartFooter {
        public static final int $stable = UninvestedSectionState.$stable;
        private final String accountNumber;
        private final UninvestedSectionState sectionState;

        public static /* synthetic */ Uninvested copy$default(Uninvested uninvested, String str, UninvestedSectionState uninvestedSectionState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uninvested.accountNumber;
            }
            if ((i & 2) != 0) {
                uninvestedSectionState = uninvested.sectionState;
            }
            return uninvested.copy(str, uninvestedSectionState);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UninvestedSectionState getSectionState() {
            return this.sectionState;
        }

        public final Uninvested copy(String accountNumber, UninvestedSectionState sectionState) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(sectionState, "sectionState");
            return new Uninvested(accountNumber, sectionState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Uninvested)) {
                return false;
            }
            Uninvested uninvested = (Uninvested) other;
            return Intrinsics.areEqual(this.accountNumber, uninvested.accountNumber) && Intrinsics.areEqual(this.sectionState, uninvested.sectionState);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.sectionState.hashCode();
        }

        public String toString() {
            return "Uninvested(accountNumber=" + this.accountNumber + ", sectionState=" + this.sectionState + ")";
        }

        public Uninvested(String accountNumber, UninvestedSectionState sectionState) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(sectionState, "sectionState");
            this.accountNumber = accountNumber;
            this.sectionState = sectionState;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UninvestedSectionState getSectionState() {
            return this.sectionState;
        }
    }

    /* compiled from: RetirementDashboardChartFooter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/ChartFooter$Loading;", "Lcom/robinhood/android/retirement/ui/funded/ChartFooter;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.ui.funded.ChartFooter$Loading */
    public static final class Loading implements RetirementDashboardChartFooter {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }
}
