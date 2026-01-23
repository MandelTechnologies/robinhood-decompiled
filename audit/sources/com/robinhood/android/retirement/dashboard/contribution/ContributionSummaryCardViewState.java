package com.robinhood.android.retirement.dashboard.contribution;

import com.robinhood.android.models.retirement.p194db.RetirementCombinedSummaryCardViewModel;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.advisory.p304db.onboarding.RecsForRetirementStrategiesUpsellViewModel;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ContributionSummaryCardViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState;", "", "Loading", "Loaded", "Row", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Loaded;", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Loading;", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface ContributionSummaryCardViewState {

    /* compiled from: ContributionSummaryCardViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Loading;", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements ContributionSummaryCardViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 976232151;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: ContributionSummaryCardViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Loaded;", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState;", "accountNumber", "", "viewModel", "Lcom/robinhood/android/models/retirement/db/RetirementCombinedSummaryCardViewModel;", "useManagedAccountLayout", "", "advisoryGoldValuePropsTitle", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Row;", "strategiesUpsellBanner", "Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel$Banner;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/retirement/db/RetirementCombinedSummaryCardViewModel;ZLjava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel$Banner;)V", "getAccountNumber", "()Ljava/lang/String;", "getViewModel", "()Lcom/robinhood/android/models/retirement/db/RetirementCombinedSummaryCardViewModel;", "getUseManagedAccountLayout", "()Z", "getAdvisoryGoldValuePropsTitle", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getStrategiesUpsellBanner", "()Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel$Banner;", "useHeaderWithGoldValueProps", "getUseHeaderWithGoldValueProps", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements ContributionSummaryCardViewState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final String advisoryGoldValuePropsTitle;
        private final ImmutableList<Row> rows;
        private final RecsForRetirementStrategiesUpsellViewModel.Banner strategiesUpsellBanner;
        private final boolean useManagedAccountLayout;
        private final RetirementCombinedSummaryCardViewModel viewModel;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, RetirementCombinedSummaryCardViewModel retirementCombinedSummaryCardViewModel, boolean z, String str2, ImmutableList immutableList, RecsForRetirementStrategiesUpsellViewModel.Banner banner, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.accountNumber;
            }
            if ((i & 2) != 0) {
                retirementCombinedSummaryCardViewModel = loaded.viewModel;
            }
            if ((i & 4) != 0) {
                z = loaded.useManagedAccountLayout;
            }
            if ((i & 8) != 0) {
                str2 = loaded.advisoryGoldValuePropsTitle;
            }
            if ((i & 16) != 0) {
                immutableList = loaded.rows;
            }
            if ((i & 32) != 0) {
                banner = loaded.strategiesUpsellBanner;
            }
            ImmutableList immutableList2 = immutableList;
            RecsForRetirementStrategiesUpsellViewModel.Banner banner2 = banner;
            return loaded.copy(str, retirementCombinedSummaryCardViewModel, z, str2, immutableList2, banner2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final RetirementCombinedSummaryCardViewModel getViewModel() {
            return this.viewModel;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getUseManagedAccountLayout() {
            return this.useManagedAccountLayout;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAdvisoryGoldValuePropsTitle() {
            return this.advisoryGoldValuePropsTitle;
        }

        public final ImmutableList<Row> component5() {
            return this.rows;
        }

        /* renamed from: component6, reason: from getter */
        public final RecsForRetirementStrategiesUpsellViewModel.Banner getStrategiesUpsellBanner() {
            return this.strategiesUpsellBanner;
        }

        public final Loaded copy(String accountNumber, RetirementCombinedSummaryCardViewModel viewModel, boolean useManagedAccountLayout, String advisoryGoldValuePropsTitle, ImmutableList<Row> rows, RecsForRetirementStrategiesUpsellViewModel.Banner strategiesUpsellBanner) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new Loaded(accountNumber, viewModel, useManagedAccountLayout, advisoryGoldValuePropsTitle, rows, strategiesUpsellBanner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.accountNumber, loaded.accountNumber) && Intrinsics.areEqual(this.viewModel, loaded.viewModel) && this.useManagedAccountLayout == loaded.useManagedAccountLayout && Intrinsics.areEqual(this.advisoryGoldValuePropsTitle, loaded.advisoryGoldValuePropsTitle) && Intrinsics.areEqual(this.rows, loaded.rows) && Intrinsics.areEqual(this.strategiesUpsellBanner, loaded.strategiesUpsellBanner);
        }

        public int hashCode() {
            int iHashCode = ((((this.accountNumber.hashCode() * 31) + this.viewModel.hashCode()) * 31) + Boolean.hashCode(this.useManagedAccountLayout)) * 31;
            String str = this.advisoryGoldValuePropsTitle;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.rows.hashCode()) * 31;
            RecsForRetirementStrategiesUpsellViewModel.Banner banner = this.strategiesUpsellBanner;
            return iHashCode2 + (banner != null ? banner.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(accountNumber=" + this.accountNumber + ", viewModel=" + this.viewModel + ", useManagedAccountLayout=" + this.useManagedAccountLayout + ", advisoryGoldValuePropsTitle=" + this.advisoryGoldValuePropsTitle + ", rows=" + this.rows + ", strategiesUpsellBanner=" + this.strategiesUpsellBanner + ")";
        }

        public Loaded(String accountNumber, RetirementCombinedSummaryCardViewModel viewModel, boolean z, String str, ImmutableList<Row> rows, RecsForRetirementStrategiesUpsellViewModel.Banner banner) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.accountNumber = accountNumber;
            this.viewModel = viewModel;
            this.useManagedAccountLayout = z;
            this.advisoryGoldValuePropsTitle = str;
            this.rows = rows;
            this.strategiesUpsellBanner = banner;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final RetirementCombinedSummaryCardViewModel getViewModel() {
            return this.viewModel;
        }

        public final boolean getUseManagedAccountLayout() {
            return this.useManagedAccountLayout;
        }

        public final String getAdvisoryGoldValuePropsTitle() {
            return this.advisoryGoldValuePropsTitle;
        }

        public final ImmutableList<Row> getRows() {
            return this.rows;
        }

        public final RecsForRetirementStrategiesUpsellViewModel.Banner getStrategiesUpsellBanner() {
            return this.strategiesUpsellBanner;
        }

        public final boolean getUseHeaderWithGoldValueProps() {
            return this.useManagedAccountLayout && this.advisoryGoldValuePropsTitle != null;
        }
    }

    /* compiled from: ContributionSummaryCardViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Row;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "value", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/models/retirement/db/RetirementCombinedSummaryCardViewModel$Item;", "(Lcom/robinhood/android/models/retirement/db/RetirementCombinedSummaryCardViewModel$Item;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Row {
        public static final int $stable = StringResource.$stable;
        private final StringResource label;
        private final StringResource value;

        public static /* synthetic */ Row copy$default(Row row, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = row.label;
            }
            if ((i & 2) != 0) {
                stringResource2 = row.value;
            }
            return row.copy(stringResource, stringResource2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getValue() {
            return this.value;
        }

        public final Row copy(StringResource label, StringResource value) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Row(label, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.label, row.label) && Intrinsics.areEqual(this.value, row.value);
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Row(label=" + this.label + ", value=" + this.value + ")";
        }

        public Row(StringResource label, StringResource value) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.label = label;
            this.value = value;
        }

        public final StringResource getLabel() {
            return this.label;
        }

        public final StringResource getValue() {
            return this.value;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Row(RetirementCombinedSummaryCardViewModel.Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            StringResource.Companion companion = StringResource.INSTANCE;
            this(companion.invoke(item.getLabel()), companion.invoke(item.getValue()));
        }
    }
}
