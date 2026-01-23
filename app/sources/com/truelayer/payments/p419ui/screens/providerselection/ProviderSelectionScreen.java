package com.truelayer.payments.p419ui.screens.providerselection;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import com.truelayer.payments.core.domain.experience.scheme.SchemeSelectionSelect;
import com.truelayer.payments.core.domain.payments.Beneficiary;
import com.truelayer.payments.core.domain.payments.MandateConstraints;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentMethod;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.p419ui.models.Country;
import com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData;
import com.truelayer.payments.p419ui.screens.confirmation.MandateConfirmationViewData;
import com.truelayer.payments.p419ui.screens.confirmation.PaymentConfirmationViewData;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Standard2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: ProviderSelectionScreen.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "", "BranchSelection", "Confirmation", "CountrySelection", "Error", "Init", "Priming", "ProviderSelection", "Result", "SchemeSelection", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$BranchSelection;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$Confirmation;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$CountrySelection;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$Error;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$Init;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$Priming;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$ProviderSelection;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$Result;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$SchemeSelection;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ProviderSelectionScreen {

    /* compiled from: ProviderSelectionScreen.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$Init;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "()V", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Init implements ProviderSelectionScreen {
        public static final int $stable = 0;
        public static final Init INSTANCE = new Init();

        private Init() {
        }
    }

    /* compiled from: ProviderSelectionScreen.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$Error;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "error", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "(Lcom/truelayer/payments/core/domain/errors/CoreError;)V", "getError", "()Lcom/truelayer/payments/core/domain/errors/CoreError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Error implements ProviderSelectionScreen {
        public static final int $stable = 8;
        private final CoreError error;

        public static /* synthetic */ Error copy$default(Error error, CoreError coreError, int i, Object obj) {
            if ((i & 1) != 0) {
                coreError = error.error;
            }
            return error.copy(coreError);
        }

        /* renamed from: component1, reason: from getter */
        public final CoreError getError() {
            return this.error;
        }

        public final Error copy(CoreError error) {
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

        public Error(CoreError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final CoreError getError() {
            return this.error;
        }
    }

    /* compiled from: ProviderSelectionScreen.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$Result;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "result", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "(Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;)V", "getResult", "()Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Result implements ProviderSelectionScreen {
        public static final int $stable = 8;
        private final ProviderSelectionResult result;

        public static /* synthetic */ Result copy$default(Result result, ProviderSelectionResult providerSelectionResult, int i, Object obj) {
            if ((i & 1) != 0) {
                providerSelectionResult = result.result;
            }
            return result.copy(providerSelectionResult);
        }

        /* renamed from: component1, reason: from getter */
        public final ProviderSelectionResult getResult() {
            return this.result;
        }

        public final Result copy(ProviderSelectionResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Result(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && Intrinsics.areEqual(this.result, ((Result) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Result(result=" + this.result + ")";
        }

        public Result(ProviderSelectionResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public final ProviderSelectionResult getResult() {
            return this.result;
        }
    }

    /* compiled from: ProviderSelectionScreen.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00120\u0010\n\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J3\u0010!\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u0085\u0001\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t22\b\u0002\u0010\n\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u000eHÖ\u0001J\t\u0010)\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R;\u0010\n\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$ProviderSelection;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "providers", "", "Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "recommendedProviders", "currentCountry", "Lcom/truelayer/payments/ui/models/Country;", "hasMoreThanOneCountryAvailable", "", "sortAndFilter", "Lkotlin/reflect/KFunction4;", "", "maxNumberOfRecentProvidersOnScreen", "", "hideBranchesWhenEmptyQuery", "(Ljava/util/List;Ljava/util/List;Lcom/truelayer/payments/ui/models/Country;ZLkotlin/reflect/KFunction;IZ)V", "getCurrentCountry", "()Lcom/truelayer/payments/ui/models/Country;", "getHasMoreThanOneCountryAvailable", "()Z", "getHideBranchesWhenEmptyQuery", "getMaxNumberOfRecentProvidersOnScreen", "()I", "getProviders", "()Ljava/util/List;", "getRecommendedProviders", "getSortAndFilter", "()Lkotlin/reflect/KFunction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ProviderSelection implements ProviderSelectionScreen {
        public static final int $stable = 8;
        private final Country currentCountry;
        private final boolean hasMoreThanOneCountryAvailable;
        private final boolean hideBranchesWhenEmptyQuery;
        private final int maxNumberOfRecentProvidersOnScreen;
        private final List<PaymentProviderViewData> providers;
        private final List<PaymentProviderViewData> recommendedProviders;
        private final KFunction<List<PaymentProviderViewData>> sortAndFilter;

        public static /* synthetic */ ProviderSelection copy$default(ProviderSelection providerSelection, List list, List list2, Country country, boolean z, KFunction kFunction, int i, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = providerSelection.providers;
            }
            if ((i2 & 2) != 0) {
                list2 = providerSelection.recommendedProviders;
            }
            if ((i2 & 4) != 0) {
                country = providerSelection.currentCountry;
            }
            if ((i2 & 8) != 0) {
                z = providerSelection.hasMoreThanOneCountryAvailable;
            }
            if ((i2 & 16) != 0) {
                kFunction = providerSelection.sortAndFilter;
            }
            if ((i2 & 32) != 0) {
                i = providerSelection.maxNumberOfRecentProvidersOnScreen;
            }
            if ((i2 & 64) != 0) {
                z2 = providerSelection.hideBranchesWhenEmptyQuery;
            }
            int i3 = i;
            boolean z3 = z2;
            KFunction kFunction2 = kFunction;
            Country country2 = country;
            return providerSelection.copy(list, list2, country2, z, kFunction2, i3, z3);
        }

        public final List<PaymentProviderViewData> component1() {
            return this.providers;
        }

        public final List<PaymentProviderViewData> component2() {
            return this.recommendedProviders;
        }

        /* renamed from: component3, reason: from getter */
        public final Country getCurrentCountry() {
            return this.currentCountry;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasMoreThanOneCountryAvailable() {
            return this.hasMoreThanOneCountryAvailable;
        }

        public final KFunction<List<PaymentProviderViewData>> component5() {
            return this.sortAndFilter;
        }

        /* renamed from: component6, reason: from getter */
        public final int getMaxNumberOfRecentProvidersOnScreen() {
            return this.maxNumberOfRecentProvidersOnScreen;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getHideBranchesWhenEmptyQuery() {
            return this.hideBranchesWhenEmptyQuery;
        }

        public final ProviderSelection copy(List<PaymentProviderViewData> providers, List<PaymentProviderViewData> recommendedProviders, Country currentCountry, boolean hasMoreThanOneCountryAvailable, KFunction<? extends List<PaymentProviderViewData>> sortAndFilter, int maxNumberOfRecentProvidersOnScreen, boolean hideBranchesWhenEmptyQuery) {
            Intrinsics.checkNotNullParameter(providers, "providers");
            Intrinsics.checkNotNullParameter(recommendedProviders, "recommendedProviders");
            Intrinsics.checkNotNullParameter(currentCountry, "currentCountry");
            Intrinsics.checkNotNullParameter(sortAndFilter, "sortAndFilter");
            return new ProviderSelection(providers, recommendedProviders, currentCountry, hasMoreThanOneCountryAvailable, sortAndFilter, maxNumberOfRecentProvidersOnScreen, hideBranchesWhenEmptyQuery);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProviderSelection)) {
                return false;
            }
            ProviderSelection providerSelection = (ProviderSelection) other;
            return Intrinsics.areEqual(this.providers, providerSelection.providers) && Intrinsics.areEqual(this.recommendedProviders, providerSelection.recommendedProviders) && Intrinsics.areEqual(this.currentCountry, providerSelection.currentCountry) && this.hasMoreThanOneCountryAvailable == providerSelection.hasMoreThanOneCountryAvailable && Intrinsics.areEqual(this.sortAndFilter, providerSelection.sortAndFilter) && this.maxNumberOfRecentProvidersOnScreen == providerSelection.maxNumberOfRecentProvidersOnScreen && this.hideBranchesWhenEmptyQuery == providerSelection.hideBranchesWhenEmptyQuery;
        }

        public int hashCode() {
            return (((((((((((this.providers.hashCode() * 31) + this.recommendedProviders.hashCode()) * 31) + this.currentCountry.hashCode()) * 31) + Boolean.hashCode(this.hasMoreThanOneCountryAvailable)) * 31) + this.sortAndFilter.hashCode()) * 31) + Integer.hashCode(this.maxNumberOfRecentProvidersOnScreen)) * 31) + Boolean.hashCode(this.hideBranchesWhenEmptyQuery);
        }

        public String toString() {
            return "ProviderSelection(providers=" + this.providers + ", recommendedProviders=" + this.recommendedProviders + ", currentCountry=" + this.currentCountry + ", hasMoreThanOneCountryAvailable=" + this.hasMoreThanOneCountryAvailable + ", sortAndFilter=" + this.sortAndFilter + ", maxNumberOfRecentProvidersOnScreen=" + this.maxNumberOfRecentProvidersOnScreen + ", hideBranchesWhenEmptyQuery=" + this.hideBranchesWhenEmptyQuery + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ProviderSelection(List<PaymentProviderViewData> providers, List<PaymentProviderViewData> recommendedProviders, Country currentCountry, boolean z, KFunction<? extends List<PaymentProviderViewData>> sortAndFilter, int i, boolean z2) {
            Intrinsics.checkNotNullParameter(providers, "providers");
            Intrinsics.checkNotNullParameter(recommendedProviders, "recommendedProviders");
            Intrinsics.checkNotNullParameter(currentCountry, "currentCountry");
            Intrinsics.checkNotNullParameter(sortAndFilter, "sortAndFilter");
            this.providers = providers;
            this.recommendedProviders = recommendedProviders;
            this.currentCountry = currentCountry;
            this.hasMoreThanOneCountryAvailable = z;
            this.sortAndFilter = sortAndFilter;
            this.maxNumberOfRecentProvidersOnScreen = i;
            this.hideBranchesWhenEmptyQuery = z2;
        }

        public /* synthetic */ ProviderSelection(List list, List list2, Country country, boolean z, KFunction kFunction, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, list2, country, z, kFunction, (i2 & 32) != 0 ? 3 : i, (i2 & 64) != 0 ? true : z2);
        }

        public final List<PaymentProviderViewData> getProviders() {
            return this.providers;
        }

        public final List<PaymentProviderViewData> getRecommendedProviders() {
            return this.recommendedProviders;
        }

        public final Country getCurrentCountry() {
            return this.currentCountry;
        }

        public final boolean getHasMoreThanOneCountryAvailable() {
            return this.hasMoreThanOneCountryAvailable;
        }

        public final KFunction<List<PaymentProviderViewData>> getSortAndFilter() {
            return this.sortAndFilter;
        }

        public final int getMaxNumberOfRecentProvidersOnScreen() {
            return this.maxNumberOfRecentProvidersOnScreen;
        }

        public final boolean getHideBranchesWhenEmptyQuery() {
            return this.hideBranchesWhenEmptyQuery;
        }
    }

    /* compiled from: ProviderSelectionScreen.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00120\u0010\u0005\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J3\u0010\u0010\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003JM\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u000322\b\u0002\u0010\u0005\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR;\u0010\u0005\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$BranchSelection;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "providers", "", "Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "sortAndFilter", "Lkotlin/reflect/KFunction4;", "Lcom/truelayer/payments/ui/models/Country;", "", "", "(Ljava/util/List;Lkotlin/reflect/KFunction;)V", "getProviders", "()Ljava/util/List;", "getSortAndFilter", "()Lkotlin/reflect/KFunction;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class BranchSelection implements ProviderSelectionScreen {
        public static final int $stable = 8;
        private final List<PaymentProviderViewData> providers;
        private final KFunction<List<PaymentProviderViewData>> sortAndFilter;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BranchSelection copy$default(BranchSelection branchSelection, List list, KFunction kFunction, int i, Object obj) {
            if ((i & 1) != 0) {
                list = branchSelection.providers;
            }
            if ((i & 2) != 0) {
                kFunction = branchSelection.sortAndFilter;
            }
            return branchSelection.copy(list, kFunction);
        }

        public final List<PaymentProviderViewData> component1() {
            return this.providers;
        }

        public final KFunction<List<PaymentProviderViewData>> component2() {
            return this.sortAndFilter;
        }

        public final BranchSelection copy(List<PaymentProviderViewData> providers, KFunction<? extends List<PaymentProviderViewData>> sortAndFilter) {
            Intrinsics.checkNotNullParameter(providers, "providers");
            Intrinsics.checkNotNullParameter(sortAndFilter, "sortAndFilter");
            return new BranchSelection(providers, sortAndFilter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BranchSelection)) {
                return false;
            }
            BranchSelection branchSelection = (BranchSelection) other;
            return Intrinsics.areEqual(this.providers, branchSelection.providers) && Intrinsics.areEqual(this.sortAndFilter, branchSelection.sortAndFilter);
        }

        public int hashCode() {
            return (this.providers.hashCode() * 31) + this.sortAndFilter.hashCode();
        }

        public String toString() {
            return "BranchSelection(providers=" + this.providers + ", sortAndFilter=" + this.sortAndFilter + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BranchSelection(List<PaymentProviderViewData> providers, KFunction<? extends List<PaymentProviderViewData>> sortAndFilter) {
            Intrinsics.checkNotNullParameter(providers, "providers");
            Intrinsics.checkNotNullParameter(sortAndFilter, "sortAndFilter");
            this.providers = providers;
            this.sortAndFilter = sortAndFilter;
        }

        public final List<PaymentProviderViewData> getProviders() {
            return this.providers;
        }

        public final KFunction<List<PaymentProviderViewData>> getSortAndFilter() {
            return this.sortAndFilter;
        }
    }

    /* compiled from: ProviderSelectionScreen.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$SchemeSelection;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "schemeSelection", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelectionSelect;", "(Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelectionSelect;)V", "getSchemeSelection", "()Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelectionSelect;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SchemeSelection implements ProviderSelectionScreen {
        public static final int $stable = 8;
        private final SchemeSelectionSelect schemeSelection;

        public static /* synthetic */ SchemeSelection copy$default(SchemeSelection schemeSelection, SchemeSelectionSelect schemeSelectionSelect, int i, Object obj) {
            if ((i & 1) != 0) {
                schemeSelectionSelect = schemeSelection.schemeSelection;
            }
            return schemeSelection.copy(schemeSelectionSelect);
        }

        /* renamed from: component1, reason: from getter */
        public final SchemeSelectionSelect getSchemeSelection() {
            return this.schemeSelection;
        }

        public final SchemeSelection copy(SchemeSelectionSelect schemeSelection) {
            Intrinsics.checkNotNullParameter(schemeSelection, "schemeSelection");
            return new SchemeSelection(schemeSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SchemeSelection) && Intrinsics.areEqual(this.schemeSelection, ((SchemeSelection) other).schemeSelection);
        }

        public int hashCode() {
            return this.schemeSelection.hashCode();
        }

        public String toString() {
            return "SchemeSelection(schemeSelection=" + this.schemeSelection + ")";
        }

        public SchemeSelection(SchemeSelectionSelect schemeSelection) {
            Intrinsics.checkNotNullParameter(schemeSelection, "schemeSelection");
            this.schemeSelection = schemeSelection;
        }

        public final SchemeSelectionSelect getSchemeSelection() {
            return this.schemeSelection;
        }
    }

    /* compiled from: ProviderSelectionScreen.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012$\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0007¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J'\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0007HÆ\u0003JM\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042&\b\u0002\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR/\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$CountrySelection;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "countries", "", "Lcom/truelayer/payments/ui/models/Country;", "selectedCountry", "sortAndFilter", "Lkotlin/reflect/KFunction2;", "", "(Ljava/util/List;Lcom/truelayer/payments/ui/models/Country;Lkotlin/reflect/KFunction;)V", "getCountries", "()Ljava/util/List;", "getSelectedCountry", "()Lcom/truelayer/payments/ui/models/Country;", "getSortAndFilter", "()Lkotlin/reflect/KFunction;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class CountrySelection implements ProviderSelectionScreen {
        public static final int $stable = 8;
        private final List<Country> countries;
        private final Country selectedCountry;
        private final KFunction<List<Country>> sortAndFilter;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CountrySelection copy$default(CountrySelection countrySelection, List list, Country country, KFunction kFunction, int i, Object obj) {
            if ((i & 1) != 0) {
                list = countrySelection.countries;
            }
            if ((i & 2) != 0) {
                country = countrySelection.selectedCountry;
            }
            if ((i & 4) != 0) {
                kFunction = countrySelection.sortAndFilter;
            }
            return countrySelection.copy(list, country, kFunction);
        }

        public final List<Country> component1() {
            return this.countries;
        }

        /* renamed from: component2, reason: from getter */
        public final Country getSelectedCountry() {
            return this.selectedCountry;
        }

        public final KFunction<List<Country>> component3() {
            return this.sortAndFilter;
        }

        public final CountrySelection copy(List<Country> countries, Country selectedCountry, KFunction<? extends List<Country>> sortAndFilter) {
            Intrinsics.checkNotNullParameter(countries, "countries");
            Intrinsics.checkNotNullParameter(sortAndFilter, "sortAndFilter");
            return new CountrySelection(countries, selectedCountry, sortAndFilter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountrySelection)) {
                return false;
            }
            CountrySelection countrySelection = (CountrySelection) other;
            return Intrinsics.areEqual(this.countries, countrySelection.countries) && Intrinsics.areEqual(this.selectedCountry, countrySelection.selectedCountry) && Intrinsics.areEqual(this.sortAndFilter, countrySelection.sortAndFilter);
        }

        public int hashCode() {
            int iHashCode = this.countries.hashCode() * 31;
            Country country = this.selectedCountry;
            return ((iHashCode + (country == null ? 0 : country.hashCode())) * 31) + this.sortAndFilter.hashCode();
        }

        public String toString() {
            return "CountrySelection(countries=" + this.countries + ", selectedCountry=" + this.selectedCountry + ", sortAndFilter=" + this.sortAndFilter + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CountrySelection(List<Country> countries, Country country, KFunction<? extends List<Country>> sortAndFilter) {
            Intrinsics.checkNotNullParameter(countries, "countries");
            Intrinsics.checkNotNullParameter(sortAndFilter, "sortAndFilter");
            this.countries = countries;
            this.selectedCountry = country;
            this.sortAndFilter = sortAndFilter;
        }

        public final List<Country> getCountries() {
            return this.countries;
        }

        public final Country getSelectedCountry() {
            return this.selectedCountry;
        }

        public final KFunction<List<Country>> getSortAndFilter() {
            return this.sortAndFilter;
        }
    }

    /* compiled from: ProviderSelectionScreen.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$Priming;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "selectedProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "priming", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data;", "(Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data;)V", "getPriming", "()Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data;", "getSelectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Priming implements ProviderSelectionScreen {
        public static final int $stable = 8;
        private final UserPriming.Data priming;
        private final PaymentProvider selectedProvider;

        public static /* synthetic */ Priming copy$default(Priming priming, PaymentProvider paymentProvider, UserPriming.Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentProvider = priming.selectedProvider;
            }
            if ((i & 2) != 0) {
                data = priming.priming;
            }
            return priming.copy(paymentProvider, data);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentProvider getSelectedProvider() {
            return this.selectedProvider;
        }

        /* renamed from: component2, reason: from getter */
        public final UserPriming.Data getPriming() {
            return this.priming;
        }

        public final Priming copy(PaymentProvider selectedProvider, UserPriming.Data priming) {
            Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
            Intrinsics.checkNotNullParameter(priming, "priming");
            return new Priming(selectedProvider, priming);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Priming)) {
                return false;
            }
            Priming priming = (Priming) other;
            return Intrinsics.areEqual(this.selectedProvider, priming.selectedProvider) && Intrinsics.areEqual(this.priming, priming.priming);
        }

        public int hashCode() {
            return (this.selectedProvider.hashCode() * 31) + this.priming.hashCode();
        }

        public String toString() {
            return "Priming(selectedProvider=" + this.selectedProvider + ", priming=" + this.priming + ")";
        }

        public Priming(PaymentProvider selectedProvider, UserPriming.Data priming) {
            Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
            Intrinsics.checkNotNullParameter(priming, "priming");
            this.selectedProvider = selectedProvider;
            this.priming = priming;
        }

        public final PaymentProvider getSelectedProvider() {
            return this.selectedProvider;
        }

        public final UserPriming.Data getPriming() {
            return this.priming;
        }
    }

    /* compiled from: ProviderSelectionScreen.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$Confirmation;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "confirmationViewData", "Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;", "(Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;)V", "getConfirmationViewData", "()Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Confirmation implements ProviderSelectionScreen {
        private final ConfirmationViewData confirmationViewData;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public static /* synthetic */ Confirmation copy$default(Confirmation confirmation, ConfirmationViewData confirmationViewData, int i, Object obj) {
            if ((i & 1) != 0) {
                confirmationViewData = confirmation.confirmationViewData;
            }
            return confirmation.copy(confirmationViewData);
        }

        /* renamed from: component1, reason: from getter */
        public final ConfirmationViewData getConfirmationViewData() {
            return this.confirmationViewData;
        }

        public final Confirmation copy(ConfirmationViewData confirmationViewData) {
            Intrinsics.checkNotNullParameter(confirmationViewData, "confirmationViewData");
            return new Confirmation(confirmationViewData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Confirmation) && Intrinsics.areEqual(this.confirmationViewData, ((Confirmation) other).confirmationViewData);
        }

        public int hashCode() {
            return this.confirmationViewData.hashCode();
        }

        public String toString() {
            return "Confirmation(confirmationViewData=" + this.confirmationViewData + ")";
        }

        public Confirmation(ConfirmationViewData confirmationViewData) {
            Intrinsics.checkNotNullParameter(confirmationViewData, "confirmationViewData");
            this.confirmationViewData = confirmationViewData;
        }

        public final ConfirmationViewData getConfirmationViewData() {
            return this.confirmationViewData;
        }

        /* compiled from: ProviderSelectionScreen.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J2\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\u0014"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$Confirmation$Companion;", "", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "provider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "createMandateConfirmationViewData", "Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;", "paymentMethod", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod$Mandate;", "createPaymentConfirmationViewData", "Lcom/truelayer/payments/ui/screens/confirmation/PaymentConfirmationViewData;", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod$BankTransfer;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ProviderSelectionScreen create(PaymentProvider provider, MerchantConfig merchantConfig, Legals legals, Payment payment) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(payment, "payment");
                PaymentMethod paymentMethod = payment.getPaymentMethod();
                if (paymentMethod instanceof PaymentMethod.BankTransfer) {
                    return new Confirmation(createPaymentConfirmationViewData(provider, merchantConfig, payment, (PaymentMethod.BankTransfer) paymentMethod, legals));
                }
                if (paymentMethod instanceof PaymentMethod.Mandate) {
                    return new Confirmation(createMandateConfirmationViewData(provider, merchantConfig, payment, (PaymentMethod.Mandate) paymentMethod, legals));
                }
                if (!(paymentMethod instanceof PaymentMethod.PaymentOfMandate)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new Standard2("An operation is not implemented: Fix this problem somehow");
            }

            private final MandateConfirmationViewData createMandateConfirmationViewData(PaymentProvider provider, MerchantConfig merchantConfig, Payment payment, PaymentMethod.Mandate paymentMethod, Legals legals) {
                ConfirmationViewData.PaymentUseCase paymentUseCase;
                String id = provider.getId();
                String displayName = provider.getDisplayName();
                String iconUri = provider.getIconUri();
                String extendedIcon = provider.getExtendedIcon();
                String countryCode = provider.getCountryCode();
                String name = merchantConfig.getName();
                URL logoUri = merchantConfig.getLogoUri();
                boolean regulated = merchantConfig.getRegulated();
                Currency currency = payment.getCurrency();
                MandateConstraints constraints = paymentMethod.getConstraints();
                Beneficiary beneficiary = paymentMethod.getBeneficiary();
                String paymentReference = payment.getPaymentReference();
                boolean zIsAvailable = provider.isAvailable();
                boolean zIsProviderSelected = payment.isProviderSelected();
                if (payment.isSignupPlus()) {
                    paymentUseCase = ConfirmationViewData.PaymentUseCase.SignUpPlus;
                } else {
                    paymentUseCase = ConfirmationViewData.PaymentUseCase.SinglePayment;
                }
                return new MandateConfirmationViewData(id, displayName, iconUri, extendedIcon, countryCode, name, logoUri, currency, legals, zIsAvailable, zIsProviderSelected, regulated, paymentUseCase, constraints, beneficiary, paymentReference);
            }

            private final PaymentConfirmationViewData createPaymentConfirmationViewData(PaymentProvider provider, MerchantConfig merchantConfig, Payment payment, PaymentMethod.BankTransfer paymentMethod, Legals legals) {
                ConfirmationViewData.PaymentUseCase paymentUseCase;
                String id = provider.getId();
                String displayName = provider.getDisplayName();
                String iconUri = provider.getIconUri();
                String extendedIcon = provider.getExtendedIcon();
                String countryCode = provider.getCountryCode();
                String name = merchantConfig.getName();
                URL logoUri = merchantConfig.getLogoUri();
                boolean regulated = merchantConfig.getRegulated();
                Currency currency = payment.getCurrency();
                long amountInMinor = paymentMethod.getAmountInMinor();
                boolean zIsAvailable = provider.isAvailable();
                boolean zIsProviderSelected = payment.isProviderSelected();
                if (payment.isSignupPlus()) {
                    paymentUseCase = ConfirmationViewData.PaymentUseCase.SignUpPlus;
                } else {
                    paymentUseCase = ConfirmationViewData.PaymentUseCase.SinglePayment;
                }
                return new PaymentConfirmationViewData(id, displayName, iconUri, extendedIcon, countryCode, name, logoUri, currency, legals, zIsAvailable, zIsProviderSelected, regulated, paymentUseCase, amountInMinor);
            }
        }
    }
}
