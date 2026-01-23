package com.robinhood.android.investorprofile.refresh;

import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.lifecycle.MainTabActivityListener;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore;
import com.robinhood.models.api.identi.ApiInvestmentProfileRefresh;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: InvestorProfileRefreshManager.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/refresh/InvestorProfileRefreshManager;", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "lastRefreshPref", "Lcom/robinhood/prefs/LongPreference;", "investmentProfileStore", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "<init>", "(Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;)V", "onMainTabActivityResumed", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "checkInvestorProfileRefreshStatus", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestorProfileRefreshManager implements MainTabActivityListener {
    private static final int DAYS_UNTIL_REFRESH = 1;
    private final InvestmentProfileStore investmentProfileStore;
    private final LongPreference lastRefreshPref;
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.util.lifecycle.MainTabActivityListener
    public void onMainTabActivityCreated(BaseActivity baseActivity) {
        MainTabActivityListener.DefaultImpls.onMainTabActivityCreated(this, baseActivity);
    }

    public InvestorProfileRefreshManager(@InvestorProfileLastRefreshPref LongPreference lastRefreshPref, InvestmentProfileStore investmentProfileStore) {
        Intrinsics.checkNotNullParameter(lastRefreshPref, "lastRefreshPref");
        Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
        this.lastRefreshPref = lastRefreshPref;
        this.investmentProfileStore = investmentProfileStore;
    }

    @Override // com.robinhood.android.common.util.lifecycle.MainTabActivityListener
    public void onMainTabActivityResumed(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        checkInvestorProfileRefreshStatus(activity);
    }

    private final void checkInvestorProfileRefreshStatus(BaseActivity activity) {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.lastRefreshPref.get());
        Intrinsics.checkNotNull(instantOfEpochSecond);
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        Duration durationBetween = Duration.between(instantOfEpochSecond, instantNow);
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        if (durationBetween.toDays() >= 1) {
            activity.getLifecycleScope().launchWhenResumed(new C196641(activity, null));
        }
    }

    /* compiled from: InvestorProfileRefreshManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.refresh.InvestorProfileRefreshManager$checkInvestorProfileRefreshStatus$1", m3645f = "InvestorProfileRefreshManager.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.refresh.InvestorProfileRefreshManager$checkInvestorProfileRefreshStatus$1 */
    static final class C196641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseActivity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C196641(BaseActivity baseActivity, Continuation<? super C196641> continuation) {
            super(2, continuation);
            this.$activity = baseActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestorProfileRefreshManager.this.new C196641(this.$activity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C196641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objCheckForRefresh;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    InvestmentProfileStore investmentProfileStore = InvestorProfileRefreshManager.this.investmentProfileStore;
                    this.label = 1;
                    objCheckForRefresh = investmentProfileStore.checkForRefresh(this);
                    if (objCheckForRefresh == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objCheckForRefresh = obj;
                }
                if (!((ApiInvestmentProfileRefresh) objCheckForRefresh).getNeedsRefresh()) {
                    InvestorProfileRefreshManager.this.lastRefreshPref.set(Instant.now().getEpochSecond());
                } else {
                    Navigator.DefaultImpls.startActivity$default(this.$activity.getNavigator(), this.$activity, new Questionnaire(true, QuestionnaireContexts.AML_REFRESH, null, null, null, null, false, false, false, false, false, null, null, true, false, false, false, false, null, null, 1040376, null), null, false, null, null, 60, null);
                }
            } catch (Throwable th) {
                if (!Throwables.isConnectivityException(th)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                }
            }
            return Unit.INSTANCE;
        }
    }
}
