package com.robinhood.android.investorprofile.p162ui.profile;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionUpgradeStore;
import com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore;
import com.robinhood.store.questionnaire.QuestionnaireStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.OnboardingService;

/* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "investmentProfileStore", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "questionnaireStore", "Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "optionUpgradeStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradeStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "onboardingService", "Loptions_product/service/OnboardingService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InvestmentProfileSettingsBonfireIdentiDuxo_Factory implements Factory<InvestmentProfileSettingsBonfireIdentiDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InvestmentProfileStore> investmentProfileStore;
    private final Provider<OnboardingService> onboardingService;
    private final Provider<OptionUpgradeStore> optionUpgradeStore;
    private final Provider<QuestionnaireStore> questionnaireStore;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InvestmentProfileSettingsBonfireIdentiDuxo_Factory create(Provider<AccountProvider> provider, Provider<InvestmentProfileStore> provider2, Provider<QuestionnaireStore> provider3, Provider<OptionUpgradeStore> provider4, Provider<ExperimentsStore> provider5, Provider<OnboardingService> provider6, Provider<DuxoBundle> provider7, Provider<SavedStateHandle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final InvestmentProfileSettingsBonfireIdentiDuxo newInstance(AccountProvider accountProvider, InvestmentProfileStore investmentProfileStore, QuestionnaireStore questionnaireStore, OptionUpgradeStore optionUpgradeStore, ExperimentsStore experimentsStore, OnboardingService onboardingService, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, investmentProfileStore, questionnaireStore, optionUpgradeStore, experimentsStore, onboardingService, duxoBundle, savedStateHandle);
    }

    public InvestmentProfileSettingsBonfireIdentiDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<InvestmentProfileStore> investmentProfileStore, Provider<QuestionnaireStore> questionnaireStore, Provider<OptionUpgradeStore> optionUpgradeStore, Provider<ExperimentsStore> experimentsStore, Provider<OnboardingService> onboardingService, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
        Intrinsics.checkNotNullParameter(questionnaireStore, "questionnaireStore");
        Intrinsics.checkNotNullParameter(optionUpgradeStore, "optionUpgradeStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(onboardingService, "onboardingService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.investmentProfileStore = investmentProfileStore;
        this.questionnaireStore = questionnaireStore;
        this.optionUpgradeStore = optionUpgradeStore;
        this.experimentsStore = experimentsStore;
        this.onboardingService = onboardingService;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public InvestmentProfileSettingsBonfireIdentiDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        InvestmentProfileStore investmentProfileStore = this.investmentProfileStore.get();
        Intrinsics.checkNotNullExpressionValue(investmentProfileStore, "get(...)");
        QuestionnaireStore questionnaireStore = this.questionnaireStore.get();
        Intrinsics.checkNotNullExpressionValue(questionnaireStore, "get(...)");
        OptionUpgradeStore optionUpgradeStore = this.optionUpgradeStore.get();
        Intrinsics.checkNotNullExpressionValue(optionUpgradeStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        OnboardingService onboardingService = this.onboardingService.get();
        Intrinsics.checkNotNullExpressionValue(onboardingService, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, investmentProfileStore, questionnaireStore, optionUpgradeStore, experimentsStore, onboardingService, duxoBundle, savedStateHandle);
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "investmentProfileStore", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "questionnaireStore", "Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "optionUpgradeStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradeStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "onboardingService", "Loptions_product/service/OnboardingService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiDuxo;", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestmentProfileSettingsBonfireIdentiDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<InvestmentProfileStore> investmentProfileStore, Provider<QuestionnaireStore> questionnaireStore, Provider<OptionUpgradeStore> optionUpgradeStore, Provider<ExperimentsStore> experimentsStore, Provider<OnboardingService> onboardingService, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
            Intrinsics.checkNotNullParameter(questionnaireStore, "questionnaireStore");
            Intrinsics.checkNotNullParameter(optionUpgradeStore, "optionUpgradeStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(onboardingService, "onboardingService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new InvestmentProfileSettingsBonfireIdentiDuxo_Factory(accountProvider, investmentProfileStore, questionnaireStore, optionUpgradeStore, experimentsStore, onboardingService, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final InvestmentProfileSettingsBonfireIdentiDuxo newInstance(AccountProvider accountProvider, InvestmentProfileStore investmentProfileStore, QuestionnaireStore questionnaireStore, OptionUpgradeStore optionUpgradeStore, ExperimentsStore experimentsStore, OnboardingService onboardingService, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
            Intrinsics.checkNotNullParameter(questionnaireStore, "questionnaireStore");
            Intrinsics.checkNotNullParameter(optionUpgradeStore, "optionUpgradeStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(onboardingService, "onboardingService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new InvestmentProfileSettingsBonfireIdentiDuxo(accountProvider, investmentProfileStore, questionnaireStore, optionUpgradeStore, experimentsStore, onboardingService, duxoBundle, savedStateHandle);
        }
    }
}
