package com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.agreements;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore;
import com.robinhood.userleap.SurveyManager3;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionAndAgreementDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementDuxo;", "contributionsMatchRateSelectionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ContributionAndAgreementDuxo_Factory implements Factory<ContributionAndAgreementDuxo> {
    private final Provider<RetirementTransfersMatchRateSelectionStore> contributionsMatchRateSelectionStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ContributionAndAgreementDuxo_Factory create(Provider<RetirementTransfersMatchRateSelectionStore> provider, Provider<TransfersBonfireApi> provider2, Provider<EventLogger> provider3, Provider<SurveyManager3> provider4, Provider<DuxoBundle> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final ContributionAndAgreementDuxo newInstance(RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore, TransfersBonfireApi transfersBonfireApi, EventLogger eventLogger, SurveyManager3 surveyManager3, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(retirementTransfersMatchRateSelectionStore, transfersBonfireApi, eventLogger, surveyManager3, duxoBundle, savedStateHandle);
    }

    public ContributionAndAgreementDuxo_Factory(Provider<RetirementTransfersMatchRateSelectionStore> contributionsMatchRateSelectionStore, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<EventLogger> eventLogger, Provider<SurveyManager3> userLeapManager, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(contributionsMatchRateSelectionStore, "contributionsMatchRateSelectionStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.contributionsMatchRateSelectionStore = contributionsMatchRateSelectionStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.eventLogger = eventLogger;
        this.userLeapManager = userLeapManager;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public ContributionAndAgreementDuxo get() {
        Companion companion = INSTANCE;
        RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore = this.contributionsMatchRateSelectionStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementTransfersMatchRateSelectionStore, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(retirementTransfersMatchRateSelectionStore, transfersBonfireApi, eventLogger, surveyManager3, duxoBundle, savedStateHandle);
    }

    /* compiled from: ContributionAndAgreementDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementDuxo_Factory;", "contributionsMatchRateSelectionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementDuxo;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ContributionAndAgreementDuxo_Factory create(Provider<RetirementTransfersMatchRateSelectionStore> contributionsMatchRateSelectionStore, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<EventLogger> eventLogger, Provider<SurveyManager3> userLeapManager, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(contributionsMatchRateSelectionStore, "contributionsMatchRateSelectionStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ContributionAndAgreementDuxo_Factory(contributionsMatchRateSelectionStore, transfersBonfireApi, eventLogger, userLeapManager, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final ContributionAndAgreementDuxo newInstance(RetirementTransfersMatchRateSelectionStore contributionsMatchRateSelectionStore, TransfersBonfireApi transfersBonfireApi, EventLogger eventLogger, SurveyManager3 userLeapManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(contributionsMatchRateSelectionStore, "contributionsMatchRateSelectionStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ContributionAndAgreementDuxo(contributionsMatchRateSelectionStore, transfersBonfireApi, eventLogger, userLeapManager, duxoBundle, savedStateHandle);
        }
    }
}
