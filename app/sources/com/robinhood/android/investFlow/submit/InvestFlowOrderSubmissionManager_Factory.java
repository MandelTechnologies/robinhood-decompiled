package com.robinhood.android.investFlow.submit;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore;
import com.robinhood.userleap.SurveyManager3;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InvestFlowOrderSubmissionManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "investFlowStore", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InvestFlowOrderSubmissionManager_Factory implements Factory<InvestFlowOrderSubmissionManager> {
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<InvestFlowStore> investFlowStore;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InvestFlowOrderSubmissionManager_Factory create(Provider<CoroutineScope> provider, Provider<InvestFlowStore> provider2, Provider<SurveyManager3> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final InvestFlowOrderSubmissionManager newInstance(CoroutineScope coroutineScope, InvestFlowStore investFlowStore, SurveyManager3 surveyManager3) {
        return INSTANCE.newInstance(coroutineScope, investFlowStore, surveyManager3);
    }

    public InvestFlowOrderSubmissionManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<InvestFlowStore> investFlowStore, Provider<SurveyManager3> userLeapManager) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(investFlowStore, "investFlowStore");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        this.coroutineScope = coroutineScope;
        this.investFlowStore = investFlowStore;
        this.userLeapManager = userLeapManager;
    }

    @Override // javax.inject.Provider
    public InvestFlowOrderSubmissionManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        InvestFlowStore investFlowStore = this.investFlowStore.get();
        Intrinsics.checkNotNullExpressionValue(investFlowStore, "get(...)");
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        return companion.newInstance(coroutineScope, investFlowStore, surveyManager3);
    }

    /* compiled from: InvestFlowOrderSubmissionManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "investFlowStore", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "newInstance", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestFlowOrderSubmissionManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<InvestFlowStore> investFlowStore, Provider<SurveyManager3> userLeapManager) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(investFlowStore, "investFlowStore");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            return new InvestFlowOrderSubmissionManager_Factory(coroutineScope, investFlowStore, userLeapManager);
        }

        @JvmStatic
        public final InvestFlowOrderSubmissionManager newInstance(CoroutineScope coroutineScope, InvestFlowStore investFlowStore, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(investFlowStore, "investFlowStore");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            return new InvestFlowOrderSubmissionManager(coroutineScope, investFlowStore, userLeapManager);
        }
    }
}
