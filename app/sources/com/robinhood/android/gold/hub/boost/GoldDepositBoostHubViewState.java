package com.robinhood.android.gold.hub.boost;

import androidx.paging.Pager;
import com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState;
import com.robinhood.android.gold.lib.hub.api.ApiDepositBoostHub;
import com.robinhood.android.gold.lib.hub.api.ApiGoldEarningsCylinderChartSegment;
import com.robinhood.android.gold.lib.hub.api.GoldDepositBoostHubPayoutSection;
import com.robinhood.android.gold.lib.hub.api.GoldEarningsSourceRow;
import com.robinhood.android.gold.lib.hub.api.GoldSegmentedControl;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDepositBoostHubViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState$Error;", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState$Loaded;", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState$Loading;", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldDepositBoostHubViewState {
    public static final int $stable = 0;

    public /* synthetic */ GoldDepositBoostHubViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: GoldDepositBoostHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState$Loading;", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends GoldDepositBoostHubViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1927191048;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private GoldDepositBoostHubViewState() {
    }

    /* compiled from: GoldDepositBoostHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJA\u00103\u001a\u0004\u0018\u0001H4\"\u0004\b\u0000\u001042\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u0001H4062\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u0001H406H\u0002¢\u0006\u0002\u00108J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u001d\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0005HÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J;\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010=\u001a\u00020\u00142\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0019\u0010-\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState$Loaded;", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;", "goldDepositBoost", "Lcom/robinhood/android/gold/lib/hub/api/ApiDepositBoostHub;", "historyPager", "Landroidx/paging/Pager;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$SortKey;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "currentTab", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostTab;", "<init>", "(Lcom/robinhood/android/gold/lib/hub/api/ApiDepositBoostHub;Landroidx/paging/Pager;Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostTab;)V", "getGoldDepositBoost", "()Lcom/robinhood/android/gold/lib/hub/api/ApiDepositBoostHub;", "getHistoryPager", "()Landroidx/paging/Pager;", "getCurrentTab", "()Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostTab;", "showSegmentedControl", "", "getShowSegmentedControl", "()Z", "isOnJointTab", "earningsRowListToShow", "", "Lcom/robinhood/android/gold/lib/hub/api/GoldEarningsSourceRow;", "getEarningsRowListToShow", "()Ljava/util/List;", "chartDataToShow", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsCylinderChartSegment;", "getChartDataToShow", "bannerToShow", "Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getBannerToShow", "()Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "payoutsToShow", "Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;", "getPayoutsToShow", "()Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;", "disclosureMarkdownToShow", "", "getDisclosureMarkdownToShow", "()Ljava/lang/String;", "ctaToShow", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "getCtaToShow", "()Lcom/robinhood/models/serverdriven/experimental/api/Button;", "allPayoutsForCurrTab", "getAllPayoutsForCurrTab", "getTabSpecificValue", "T", "individualValueProvider", "Lkotlin/Function1;", "jointValueProvider", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends GoldDepositBoostHubViewState {
        public static final int $stable = 8;
        private final GoldDepositBoostHubPayoutSection allPayoutsForCurrTab;
        private final InfoBanner<GenericAction> bannerToShow;
        private final List<ApiGoldEarningsCylinderChartSegment> chartDataToShow;
        private final Button<GenericAction> ctaToShow;
        private final GoldDepositBoostTab currentTab;
        private final String disclosureMarkdownToShow;
        private final List<GoldEarningsSourceRow> earningsRowListToShow;
        private final ApiDepositBoostHub goldDepositBoost;
        private final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager;
        private final boolean isOnJointTab;
        private final GoldDepositBoostHubPayoutSection payoutsToShow;
        private final boolean showSegmentedControl;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiDepositBoostHub apiDepositBoostHub, Pager pager, GoldDepositBoostTab goldDepositBoostTab, int i, Object obj) {
            if ((i & 1) != 0) {
                apiDepositBoostHub = loaded.goldDepositBoost;
            }
            if ((i & 2) != 0) {
                pager = loaded.historyPager;
            }
            if ((i & 4) != 0) {
                goldDepositBoostTab = loaded.currentTab;
            }
            return loaded.copy(apiDepositBoostHub, pager, goldDepositBoostTab);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDepositBoostHub getGoldDepositBoost() {
            return this.goldDepositBoost;
        }

        public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> component2() {
            return this.historyPager;
        }

        /* renamed from: component3, reason: from getter */
        public final GoldDepositBoostTab getCurrentTab() {
            return this.currentTab;
        }

        public final Loaded copy(ApiDepositBoostHub goldDepositBoost, Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager, GoldDepositBoostTab currentTab) {
            Intrinsics.checkNotNullParameter(goldDepositBoost, "goldDepositBoost");
            Intrinsics.checkNotNullParameter(currentTab, "currentTab");
            return new Loaded(goldDepositBoost, historyPager, currentTab);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.goldDepositBoost, loaded.goldDepositBoost) && Intrinsics.areEqual(this.historyPager, loaded.historyPager) && this.currentTab == loaded.currentTab;
        }

        public int hashCode() {
            int iHashCode = this.goldDepositBoost.hashCode() * 31;
            Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager = this.historyPager;
            return ((iHashCode + (pager == null ? 0 : pager.hashCode())) * 31) + this.currentTab.hashCode();
        }

        public String toString() {
            return "Loaded(goldDepositBoost=" + this.goldDepositBoost + ", historyPager=" + this.historyPager + ", currentTab=" + this.currentTab + ")";
        }

        public final ApiDepositBoostHub getGoldDepositBoost() {
            return this.goldDepositBoost;
        }

        public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> getHistoryPager() {
            return this.historyPager;
        }

        public /* synthetic */ Loaded(ApiDepositBoostHub apiDepositBoostHub, Pager pager, GoldDepositBoostTab goldDepositBoostTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(apiDepositBoostHub, (i & 2) != 0 ? null : pager, (i & 4) != 0 ? GoldDepositBoostTab.INDIVIDUAL : goldDepositBoostTab);
        }

        public final GoldDepositBoostTab getCurrentTab() {
            return this.currentTab;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(ApiDepositBoostHub goldDepositBoost, Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager, GoldDepositBoostTab currentTab) {
            List<GoldSegmentedControl> segmentedControl;
            super(null);
            Intrinsics.checkNotNullParameter(goldDepositBoost, "goldDepositBoost");
            Intrinsics.checkNotNullParameter(currentTab, "currentTab");
            this.goldDepositBoost = goldDepositBoost;
            this.historyPager = pager;
            this.currentTab = currentTab;
            boolean z = false;
            boolean z2 = (goldDepositBoost.getSegmentedControl() == null || (segmentedControl = goldDepositBoost.getSegmentedControl()) == null || segmentedControl.size() != 2) ? false : true;
            this.showSegmentedControl = z2;
            if (z2 && currentTab == GoldDepositBoostTab.JOINT) {
                z = true;
            }
            this.isOnJointTab = z;
            this.earningsRowListToShow = (List) getTabSpecificValue(new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.earningsRowListToShow$lambda$0((ApiDepositBoostHub) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.earningsRowListToShow$lambda$1((ApiDepositBoostHub) obj);
                }
            });
            this.chartDataToShow = (List) getTabSpecificValue(new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.chartDataToShow$lambda$2((ApiDepositBoostHub) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.chartDataToShow$lambda$3((ApiDepositBoostHub) obj);
                }
            });
            this.bannerToShow = (InfoBanner) getTabSpecificValue(new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.bannerToShow$lambda$4((ApiDepositBoostHub) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.bannerToShow$lambda$5((ApiDepositBoostHub) obj);
                }
            });
            this.payoutsToShow = (GoldDepositBoostHubPayoutSection) getTabSpecificValue(new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.payoutsToShow$lambda$6((ApiDepositBoostHub) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.payoutsToShow$lambda$7((ApiDepositBoostHub) obj);
                }
            });
            this.disclosureMarkdownToShow = (String) getTabSpecificValue(new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.disclosureMarkdownToShow$lambda$8((ApiDepositBoostHub) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.disclosureMarkdownToShow$lambda$9((ApiDepositBoostHub) obj);
                }
            });
            this.ctaToShow = (Button) getTabSpecificValue(new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.ctaToShow$lambda$10((ApiDepositBoostHub) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.ctaToShow$lambda$11((ApiDepositBoostHub) obj);
                }
            });
            this.allPayoutsForCurrTab = (GoldDepositBoostHubPayoutSection) getTabSpecificValue(new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.allPayoutsForCurrTab$lambda$12((ApiDepositBoostHub) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState$Loaded$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldDepositBoostHubViewState.Loaded.allPayoutsForCurrTab$lambda$13((ApiDepositBoostHub) obj);
                }
            });
        }

        public final boolean getShowSegmentedControl() {
            return this.showSegmentedControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List earningsRowListToShow$lambda$0(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getEarningsRowList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List earningsRowListToShow$lambda$1(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getJointAccountEarningsRowList();
        }

        public final List<GoldEarningsSourceRow> getEarningsRowListToShow() {
            return this.earningsRowListToShow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List chartDataToShow$lambda$2(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getChartData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List chartDataToShow$lambda$3(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getJointAccountChartData();
        }

        public final List<ApiGoldEarningsCylinderChartSegment> getChartDataToShow() {
            return this.chartDataToShow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InfoBanner bannerToShow$lambda$4(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getBanner();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InfoBanner bannerToShow$lambda$5(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getJointAccountBanner();
        }

        public final InfoBanner<GenericAction> getBannerToShow() {
            return this.bannerToShow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GoldDepositBoostHubPayoutSection payoutsToShow$lambda$6(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getPayouts();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GoldDepositBoostHubPayoutSection payoutsToShow$lambda$7(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getJointAccountPayouts();
        }

        public final GoldDepositBoostHubPayoutSection getPayoutsToShow() {
            return this.payoutsToShow;
        }

        public final String getDisclosureMarkdownToShow() {
            return this.disclosureMarkdownToShow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disclosureMarkdownToShow$lambda$8(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getDisclosureMarkdown();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disclosureMarkdownToShow$lambda$9(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getJointAccountDisclosureMarkdown();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Button ctaToShow$lambda$10(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getCta();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Button ctaToShow$lambda$11(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getJointAccountCta();
        }

        public final Button<GenericAction> getCtaToShow() {
            return this.ctaToShow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GoldDepositBoostHubPayoutSection allPayoutsForCurrTab$lambda$12(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getAllPayouts();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GoldDepositBoostHubPayoutSection allPayoutsForCurrTab$lambda$13(ApiDepositBoostHub it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getJointAccountAllPayouts();
        }

        public final GoldDepositBoostHubPayoutSection getAllPayoutsForCurrTab() {
            return this.allPayoutsForCurrTab;
        }

        private final <T> T getTabSpecificValue(Function1<? super ApiDepositBoostHub, ? extends T> individualValueProvider, Function1<? super ApiDepositBoostHub, ? extends T> jointValueProvider) {
            ApiDepositBoostHub apiDepositBoostHub = this.goldDepositBoost;
            return this.isOnJointTab ? jointValueProvider.invoke(apiDepositBoostHub) : individualValueProvider.invoke(apiDepositBoostHub);
        }
    }

    /* compiled from: GoldDepositBoostHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState$Error;", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends GoldDepositBoostHubViewState {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
