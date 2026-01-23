package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.api.onboarding.investmentprofilesettings.InvestmentProfileApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.investorprofile.InvestorProfileApi;
import com.robinhood.api.questionnaire.QuestionnaireApi;
import com.robinhood.models.dao.bonfire.QuestionnaireCompletedDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentProfileStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "investorProfileApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/investorprofile/InvestorProfileApi;", "investmentProfileApi", "Lcom/robinhood/android/api/onboarding/investmentprofilesettings/InvestmentProfileApi;", "questionnaireApi", "Lcom/robinhood/api/questionnaire/QuestionnaireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "questionnaireCompletedDao", "Lcom/robinhood/models/dao/bonfire/QuestionnaireCompletedDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InvestmentProfileStore_Factory implements Factory<InvestmentProfileStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InvestmentProfileApi> investmentProfileApi;
    private final Provider<InvestorProfileApi> investorProfileApi;
    private final Provider<QuestionnaireApi> questionnaireApi;
    private final Provider<QuestionnaireCompletedDao> questionnaireCompletedDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final InvestmentProfileStore_Factory create(Provider<InvestorProfileApi> provider, Provider<InvestmentProfileApi> provider2, Provider<QuestionnaireApi> provider3, Provider<StoreBundle> provider4, Provider<QuestionnaireCompletedDao> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final InvestmentProfileStore newInstance(InvestorProfileApi investorProfileApi, InvestmentProfileApi investmentProfileApi, QuestionnaireApi questionnaireApi, StoreBundle storeBundle, QuestionnaireCompletedDao questionnaireCompletedDao) {
        return INSTANCE.newInstance(investorProfileApi, investmentProfileApi, questionnaireApi, storeBundle, questionnaireCompletedDao);
    }

    public InvestmentProfileStore_Factory(Provider<InvestorProfileApi> investorProfileApi, Provider<InvestmentProfileApi> investmentProfileApi, Provider<QuestionnaireApi> questionnaireApi, Provider<StoreBundle> storeBundle, Provider<QuestionnaireCompletedDao> questionnaireCompletedDao) {
        Intrinsics.checkNotNullParameter(investorProfileApi, "investorProfileApi");
        Intrinsics.checkNotNullParameter(investmentProfileApi, "investmentProfileApi");
        Intrinsics.checkNotNullParameter(questionnaireApi, "questionnaireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(questionnaireCompletedDao, "questionnaireCompletedDao");
        this.investorProfileApi = investorProfileApi;
        this.investmentProfileApi = investmentProfileApi;
        this.questionnaireApi = questionnaireApi;
        this.storeBundle = storeBundle;
        this.questionnaireCompletedDao = questionnaireCompletedDao;
    }

    @Override // javax.inject.Provider
    public InvestmentProfileStore get() {
        Companion companion = INSTANCE;
        InvestorProfileApi investorProfileApi = this.investorProfileApi.get();
        Intrinsics.checkNotNullExpressionValue(investorProfileApi, "get(...)");
        InvestmentProfileApi investmentProfileApi = this.investmentProfileApi.get();
        Intrinsics.checkNotNullExpressionValue(investmentProfileApi, "get(...)");
        QuestionnaireApi questionnaireApi = this.questionnaireApi.get();
        Intrinsics.checkNotNullExpressionValue(questionnaireApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        QuestionnaireCompletedDao questionnaireCompletedDao = this.questionnaireCompletedDao.get();
        Intrinsics.checkNotNullExpressionValue(questionnaireCompletedDao, "get(...)");
        return companion.newInstance(investorProfileApi, investmentProfileApi, questionnaireApi, storeBundle, questionnaireCompletedDao);
    }

    /* compiled from: InvestmentProfileStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore_Factory;", "investorProfileApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/investorprofile/InvestorProfileApi;", "investmentProfileApi", "Lcom/robinhood/android/api/onboarding/investmentprofilesettings/InvestmentProfileApi;", "questionnaireApi", "Lcom/robinhood/api/questionnaire/QuestionnaireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "questionnaireCompletedDao", "Lcom/robinhood/models/dao/bonfire/QuestionnaireCompletedDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestmentProfileStore_Factory create(Provider<InvestorProfileApi> investorProfileApi, Provider<InvestmentProfileApi> investmentProfileApi, Provider<QuestionnaireApi> questionnaireApi, Provider<StoreBundle> storeBundle, Provider<QuestionnaireCompletedDao> questionnaireCompletedDao) {
            Intrinsics.checkNotNullParameter(investorProfileApi, "investorProfileApi");
            Intrinsics.checkNotNullParameter(investmentProfileApi, "investmentProfileApi");
            Intrinsics.checkNotNullParameter(questionnaireApi, "questionnaireApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(questionnaireCompletedDao, "questionnaireCompletedDao");
            return new InvestmentProfileStore_Factory(investorProfileApi, investmentProfileApi, questionnaireApi, storeBundle, questionnaireCompletedDao);
        }

        @JvmStatic
        public final InvestmentProfileStore newInstance(InvestorProfileApi investorProfileApi, InvestmentProfileApi investmentProfileApi, QuestionnaireApi questionnaireApi, StoreBundle storeBundle, QuestionnaireCompletedDao questionnaireCompletedDao) {
            Intrinsics.checkNotNullParameter(investorProfileApi, "investorProfileApi");
            Intrinsics.checkNotNullParameter(investmentProfileApi, "investmentProfileApi");
            Intrinsics.checkNotNullParameter(questionnaireApi, "questionnaireApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(questionnaireCompletedDao, "questionnaireCompletedDao");
            return new InvestmentProfileStore(investorProfileApi, investmentProfileApi, questionnaireApi, storeBundle, questionnaireCompletedDao);
        }
    }
}
