package com.robinhood.store.questionnaire;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.questionnaire.QuestionnaireApi;
import com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "questionnaireApi", "Lcom/robinhood/api/questionnaire/QuestionnaireApi;", "investmentProfileStore", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class QuestionnaireStore_Factory implements Factory<QuestionnaireStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<InvestmentProfileStore> investmentProfileStore;
    private final Provider<QuestionnaireApi> questionnaireApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final QuestionnaireStore_Factory create(Provider<AccountProvider> provider, Provider<QuestionnaireApi> provider2, Provider<InvestmentProfileStore> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final QuestionnaireStore newInstance(AccountProvider accountProvider, QuestionnaireApi questionnaireApi, InvestmentProfileStore investmentProfileStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(accountProvider, questionnaireApi, investmentProfileStore, storeBundle);
    }

    public QuestionnaireStore_Factory(Provider<AccountProvider> accountProvider, Provider<QuestionnaireApi> questionnaireApi, Provider<InvestmentProfileStore> investmentProfileStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(questionnaireApi, "questionnaireApi");
        Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.questionnaireApi = questionnaireApi;
        this.investmentProfileStore = investmentProfileStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public QuestionnaireStore get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        QuestionnaireApi questionnaireApi = this.questionnaireApi.get();
        Intrinsics.checkNotNullExpressionValue(questionnaireApi, "get(...)");
        InvestmentProfileStore investmentProfileStore = this.investmentProfileStore.get();
        Intrinsics.checkNotNullExpressionValue(investmentProfileStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(accountProvider, questionnaireApi, investmentProfileStore, storeBundle);
    }

    /* compiled from: QuestionnaireStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/questionnaire/QuestionnaireStore_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "questionnaireApi", "Lcom/robinhood/api/questionnaire/QuestionnaireApi;", "investmentProfileStore", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final QuestionnaireStore_Factory create(Provider<AccountProvider> accountProvider, Provider<QuestionnaireApi> questionnaireApi, Provider<InvestmentProfileStore> investmentProfileStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(questionnaireApi, "questionnaireApi");
            Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new QuestionnaireStore_Factory(accountProvider, questionnaireApi, investmentProfileStore, storeBundle);
        }

        @JvmStatic
        public final QuestionnaireStore newInstance(AccountProvider accountProvider, QuestionnaireApi questionnaireApi, InvestmentProfileStore investmentProfileStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(questionnaireApi, "questionnaireApi");
            Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new QuestionnaireStore(accountProvider, questionnaireApi, investmentProfileStore, storeBundle);
        }
    }
}
