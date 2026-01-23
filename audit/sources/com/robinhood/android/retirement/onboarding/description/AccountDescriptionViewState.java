package com.robinhood.android.retirement.onboarding.description;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.Text;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountDescriptionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00052\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState;", "", "Loading", "Failure", "Loaded", "Companion", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState$Failure;", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState$Loaded;", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState$Loading;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface AccountDescriptionViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: AccountDescriptionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState$Loading;", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AccountDescriptionViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 986146471;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AccountDescriptionViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState$Failure;", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure implements AccountDescriptionViewState {
        public static final int $stable = 8;
        private final Throwable cause;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.cause;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final Failure copy(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Failure(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.cause, ((Failure) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "Failure(cause=" + this.cause + ")";
        }

        public Failure(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public final Throwable getCause() {
            return this.cause;
        }
    }

    /* compiled from: AccountDescriptionViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState$Loaded;", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState;", "viewModel", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$AccountDescriptionViewModel;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$AccountDescriptionViewModel;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getViewModel", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$AccountDescriptionViewModel;", "getDisclosure", "()Ljava/lang/String;", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AccountDescriptionViewState {
        public static final int $stable = 8;
        private final BrokerageAccountType accountType;
        private final String disclosure;
        private final ApiRetirementSignUpFlow.AccountDescriptionViewModel viewModel;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiRetirementSignUpFlow.AccountDescriptionViewModel accountDescriptionViewModel, String str, BrokerageAccountType brokerageAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                accountDescriptionViewModel = loaded.viewModel;
            }
            if ((i & 2) != 0) {
                str = loaded.disclosure;
            }
            if ((i & 4) != 0) {
                brokerageAccountType = loaded.accountType;
            }
            return loaded.copy(accountDescriptionViewModel, str, brokerageAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementSignUpFlow.AccountDescriptionViewModel getViewModel() {
            return this.viewModel;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component3, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final Loaded copy(ApiRetirementSignUpFlow.AccountDescriptionViewModel viewModel, String disclosure, BrokerageAccountType accountType) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new Loaded(viewModel, disclosure, accountType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.viewModel, loaded.viewModel) && Intrinsics.areEqual(this.disclosure, loaded.disclosure) && this.accountType == loaded.accountType;
        }

        public int hashCode() {
            return (((this.viewModel.hashCode() * 31) + this.disclosure.hashCode()) * 31) + this.accountType.hashCode();
        }

        public String toString() {
            return "Loaded(viewModel=" + this.viewModel + ", disclosure=" + this.disclosure + ", accountType=" + this.accountType + ")";
        }

        public Loaded(ApiRetirementSignUpFlow.AccountDescriptionViewModel viewModel, String disclosure, BrokerageAccountType accountType) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.viewModel = viewModel;
            this.disclosure = disclosure;
            this.accountType = accountType;
        }

        public final ApiRetirementSignUpFlow.AccountDescriptionViewModel getViewModel() {
            return this.viewModel;
        }

        public final String getDisclosure() {
            return this.disclosure;
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }
    }

    /* compiled from: AccountDescriptionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState$Loaded;", "getLoadingMock", "()Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState$Loaded;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Loaded loadingMock;

        private Companion() {
        }

        public final Loaded getLoadingMock() {
            return loadingMock;
        }

        static {
            Text text = new Text(new PlainText("----- ----"), null, null, null, null, 30, null);
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(new ApiRetirementSignUpFlow.AccountDescriptionValueProp("---- -----------", "----------- --- ---- ------------ -- ------------- --- -- --------------", Pictogram.RETIREMENT));
            }
            loadingMock = new Loaded(new ApiRetirementSignUpFlow.AccountDescriptionViewModel("---------- ---", "---- ---------- ------------- --- ---- ----------- --- ---- -------------", text, arrayList, ""), "----- ----- ------ ---- ----------- -- ----------- --- --- --- -- ---------- -------", BrokerageAccountType.IRA_TRADITIONAL);
        }
    }
}
