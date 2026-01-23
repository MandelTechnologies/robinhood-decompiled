package com.robinhood.android.advisory.onboarding.retirement.recommendation.results;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.models.advisory.api.ClientActionComponent;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.Year;

/* compiled from: AccountRecommendationResultsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState;", "", "Loading", "Failure", "Ineligible", "Eligible", "AccountTypeOption", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$Eligible;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$Failure;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$Ineligible;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$Loading;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AccountRecommendationResultsViewState {

    /* compiled from: AccountRecommendationResultsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$Loading;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AccountRecommendationResultsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1306238432;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AccountRecommendationResultsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$Failure;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure implements AccountRecommendationResultsViewState {
        public static final int $stable = 0;
        public static final Failure INSTANCE = new Failure();

        public boolean equals(Object other) {
            return this == other || (other instanceof Failure);
        }

        public int hashCode() {
            return 1565504110;
        }

        public String toString() {
            return "Failure";
        }

        private Failure() {
        }
    }

    /* compiled from: AccountRecommendationResultsViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$Ineligible;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState;", "loggingIdentifier", "", "content", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/models/advisory/api/ClientActionComponent;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/advisory/api/ClientActionComponent;)V", "getLoggingIdentifier", "()Ljava/lang/String;", "getContent", "()Lkotlinx/collections/immutable/ImmutableList;", "getCta", "()Lcom/robinhood/models/advisory/api/ClientActionComponent;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ineligible implements AccountRecommendationResultsViewState {
        public static final int $stable = 8;
        private final ImmutableList<UIComponent<GenericAction>> content;
        private final ClientActionComponent cta;
        private final String loggingIdentifier;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ineligible copy$default(Ineligible ineligible, String str, ImmutableList immutableList, ClientActionComponent clientActionComponent, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ineligible.loggingIdentifier;
            }
            if ((i & 2) != 0) {
                immutableList = ineligible.content;
            }
            if ((i & 4) != 0) {
                clientActionComponent = ineligible.cta;
            }
            return ineligible.copy(str, immutableList, clientActionComponent);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final ImmutableList<UIComponent<GenericAction>> component2() {
            return this.content;
        }

        /* renamed from: component3, reason: from getter */
        public final ClientActionComponent getCta() {
            return this.cta;
        }

        public final Ineligible copy(String loggingIdentifier, ImmutableList<? extends UIComponent<? extends GenericAction>> content, ClientActionComponent cta) {
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(cta, "cta");
            return new Ineligible(loggingIdentifier, content, cta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ineligible)) {
                return false;
            }
            Ineligible ineligible = (Ineligible) other;
            return Intrinsics.areEqual(this.loggingIdentifier, ineligible.loggingIdentifier) && Intrinsics.areEqual(this.content, ineligible.content) && Intrinsics.areEqual(this.cta, ineligible.cta);
        }

        public int hashCode() {
            return (((this.loggingIdentifier.hashCode() * 31) + this.content.hashCode()) * 31) + this.cta.hashCode();
        }

        public String toString() {
            return "Ineligible(loggingIdentifier=" + this.loggingIdentifier + ", content=" + this.content + ", cta=" + this.cta + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Ineligible(String loggingIdentifier, ImmutableList<? extends UIComponent<? extends GenericAction>> content, ClientActionComponent cta) {
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(cta, "cta");
            this.loggingIdentifier = loggingIdentifier;
            this.content = content;
            this.cta = cta;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final ImmutableList<UIComponent<GenericAction>> getContent() {
            return this.content;
        }

        public final ClientActionComponent getCta() {
            return this.cta;
        }
    }

    /* compiled from: AccountRecommendationResultsViewState.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJt\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0014J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0014R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0016R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0019R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b1\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u0010\u001e¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$Eligible;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState;", "", "loggingIdentifier", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "header", Footer.f10637type, "Lcom/robinhood/models/advisory/api/ClientActionComponent;", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$AccountTypeOption;", "options", "Lcom/robinhood/models/api/BrokerageAccountType;", "recommendedOption", "j$/time/Year", "taxYear", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/advisory/api/ClientActionComponent;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/api/BrokerageAccountType;Lj$/time/Year;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/collections/immutable/ImmutableList;", "component3", "component4", "()Lcom/robinhood/models/advisory/api/ClientActionComponent;", "component5", "component6", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component7", "()Lj$/time/Year;", "copy", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/advisory/api/ClientActionComponent;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/api/BrokerageAccountType;Lj$/time/Year;)Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$Eligible;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLoggingIdentifier", "Lkotlinx/collections/immutable/ImmutableList;", "getHeader", "getFooter", "Lcom/robinhood/models/advisory/api/ClientActionComponent;", "getCta", "getOptions", "Lcom/robinhood/models/api/BrokerageAccountType;", "getRecommendedOption", "Lj$/time/Year;", "getTaxYear", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Eligible implements AccountRecommendationResultsViewState {
        public static final int $stable = 8;
        private final ClientActionComponent cta;
        private final ImmutableList<UIComponent<GenericAction>> footer;
        private final ImmutableList<UIComponent<GenericAction>> header;
        private final String loggingIdentifier;
        private final ImmutableList<AccountTypeOption> options;
        private final BrokerageAccountType recommendedOption;
        private final Year taxYear;

        public static /* synthetic */ Eligible copy$default(Eligible eligible, String str, ImmutableList immutableList, ImmutableList immutableList2, ClientActionComponent clientActionComponent, ImmutableList immutableList3, BrokerageAccountType brokerageAccountType, Year year, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eligible.loggingIdentifier;
            }
            if ((i & 2) != 0) {
                immutableList = eligible.header;
            }
            if ((i & 4) != 0) {
                immutableList2 = eligible.footer;
            }
            if ((i & 8) != 0) {
                clientActionComponent = eligible.cta;
            }
            if ((i & 16) != 0) {
                immutableList3 = eligible.options;
            }
            if ((i & 32) != 0) {
                brokerageAccountType = eligible.recommendedOption;
            }
            if ((i & 64) != 0) {
                year = eligible.taxYear;
            }
            BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
            Year year2 = year;
            ImmutableList immutableList4 = immutableList3;
            ImmutableList immutableList5 = immutableList2;
            return eligible.copy(str, immutableList, immutableList5, clientActionComponent, immutableList4, brokerageAccountType2, year2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final ImmutableList<UIComponent<GenericAction>> component2() {
            return this.header;
        }

        public final ImmutableList<UIComponent<GenericAction>> component3() {
            return this.footer;
        }

        /* renamed from: component4, reason: from getter */
        public final ClientActionComponent getCta() {
            return this.cta;
        }

        public final ImmutableList<AccountTypeOption> component5() {
            return this.options;
        }

        /* renamed from: component6, reason: from getter */
        public final BrokerageAccountType getRecommendedOption() {
            return this.recommendedOption;
        }

        /* renamed from: component7, reason: from getter */
        public final Year getTaxYear() {
            return this.taxYear;
        }

        public final Eligible copy(String loggingIdentifier, ImmutableList<? extends UIComponent<? extends GenericAction>> header, ImmutableList<? extends UIComponent<? extends GenericAction>> footer, ClientActionComponent cta, ImmutableList<AccountTypeOption> options, BrokerageAccountType recommendedOption, Year taxYear) {
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(cta, "cta");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(recommendedOption, "recommendedOption");
            Intrinsics.checkNotNullParameter(taxYear, "taxYear");
            return new Eligible(loggingIdentifier, header, footer, cta, options, recommendedOption, taxYear);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Eligible)) {
                return false;
            }
            Eligible eligible = (Eligible) other;
            return Intrinsics.areEqual(this.loggingIdentifier, eligible.loggingIdentifier) && Intrinsics.areEqual(this.header, eligible.header) && Intrinsics.areEqual(this.footer, eligible.footer) && Intrinsics.areEqual(this.cta, eligible.cta) && Intrinsics.areEqual(this.options, eligible.options) && this.recommendedOption == eligible.recommendedOption && Intrinsics.areEqual(this.taxYear, eligible.taxYear);
        }

        public int hashCode() {
            return (((((((((((this.loggingIdentifier.hashCode() * 31) + this.header.hashCode()) * 31) + this.footer.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.options.hashCode()) * 31) + this.recommendedOption.hashCode()) * 31) + this.taxYear.hashCode();
        }

        public String toString() {
            return "Eligible(loggingIdentifier=" + this.loggingIdentifier + ", header=" + this.header + ", footer=" + this.footer + ", cta=" + this.cta + ", options=" + this.options + ", recommendedOption=" + this.recommendedOption + ", taxYear=" + this.taxYear + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Eligible(String loggingIdentifier, ImmutableList<? extends UIComponent<? extends GenericAction>> header, ImmutableList<? extends UIComponent<? extends GenericAction>> footer, ClientActionComponent cta, ImmutableList<AccountTypeOption> options, BrokerageAccountType recommendedOption, Year taxYear) {
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(cta, "cta");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(recommendedOption, "recommendedOption");
            Intrinsics.checkNotNullParameter(taxYear, "taxYear");
            this.loggingIdentifier = loggingIdentifier;
            this.header = header;
            this.footer = footer;
            this.cta = cta;
            this.options = options;
            this.recommendedOption = recommendedOption;
            this.taxYear = taxYear;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final ImmutableList<UIComponent<GenericAction>> getHeader() {
            return this.header;
        }

        public final ImmutableList<UIComponent<GenericAction>> getFooter() {
            return this.footer;
        }

        public final ClientActionComponent getCta() {
            return this.cta;
        }

        public final ImmutableList<AccountTypeOption> getOptions() {
            return this.options;
        }

        public final BrokerageAccountType getRecommendedOption() {
            return this.recommendedOption;
        }

        public final Year getTaxYear() {
            return this.taxYear;
        }
    }

    /* compiled from: AccountRecommendationResultsViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$AccountTypeOption;", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "title", "", "valueProps", "", "recommendationLabel", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getTitle", "()Ljava/lang/String;", "getValueProps", "()Ljava/util/List;", "getRecommendationLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountTypeOption {
        public static final int $stable = 8;
        private final BrokerageAccountType accountType;
        private final String recommendationLabel;
        private final String title;
        private final List<String> valueProps;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AccountTypeOption copy$default(AccountTypeOption accountTypeOption, BrokerageAccountType brokerageAccountType, String str, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = accountTypeOption.accountType;
            }
            if ((i & 2) != 0) {
                str = accountTypeOption.title;
            }
            if ((i & 4) != 0) {
                list = accountTypeOption.valueProps;
            }
            if ((i & 8) != 0) {
                str2 = accountTypeOption.recommendationLabel;
            }
            return accountTypeOption.copy(brokerageAccountType, str, list, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<String> component3() {
            return this.valueProps;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRecommendationLabel() {
            return this.recommendationLabel;
        }

        public final AccountTypeOption copy(BrokerageAccountType accountType, String title, List<String> valueProps, String recommendationLabel) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            return new AccountTypeOption(accountType, title, valueProps, recommendationLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountTypeOption)) {
                return false;
            }
            AccountTypeOption accountTypeOption = (AccountTypeOption) other;
            return this.accountType == accountTypeOption.accountType && Intrinsics.areEqual(this.title, accountTypeOption.title) && Intrinsics.areEqual(this.valueProps, accountTypeOption.valueProps) && Intrinsics.areEqual(this.recommendationLabel, accountTypeOption.recommendationLabel);
        }

        public int hashCode() {
            int iHashCode = ((((this.accountType.hashCode() * 31) + this.title.hashCode()) * 31) + this.valueProps.hashCode()) * 31;
            String str = this.recommendationLabel;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AccountTypeOption(accountType=" + this.accountType + ", title=" + this.title + ", valueProps=" + this.valueProps + ", recommendationLabel=" + this.recommendationLabel + ")";
        }

        public AccountTypeOption(BrokerageAccountType accountType, String title, List<String> valueProps, String str) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            this.accountType = accountType;
            this.title = title;
            this.valueProps = valueProps;
            this.recommendationLabel = str;
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<String> getValueProps() {
            return this.valueProps;
        }

        public final String getRecommendationLabel() {
            return this.recommendationLabel;
        }
    }
}
