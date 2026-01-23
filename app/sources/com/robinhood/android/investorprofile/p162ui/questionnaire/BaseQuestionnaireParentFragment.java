package com.robinhood.android.investorprofile.p162ui.questionnaire;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.databinding.FragmentBaseQuestionnaireParentBinding;
import com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.completed.QuestionnaireCompletedCallbacks;
import com.robinhood.android.investorprofile.p162ui.questionnaire.splash.QuestionnaireSplashCallbacks;
import com.robinhood.android.investorprofile.p162ui.questionnaire.splash.QuestionnaireSplashFragment;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.questionnaire.api.ApiQuestionAnswer;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitRequest;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitResponse;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireProgressBarData;
import com.robinhood.store.questionnaire.QuestionnaireStore;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: BaseQuestionnaireParentFragment.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001TB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u000e\u00106\u001a\u0002032\u0006\u00107\u001a\u000208J\b\u00109\u001a\u00020:H&J\b\u0010;\u001a\u000203H&J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u0002030=H\u0016J\u0012\u0010>\u001a\u0002032\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010A\u001a\u000203H\u0016J\u0010\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020\u0013H\u0016J\u0006\u0010F\u001a\u000203J\u0006\u0010G\u001a\u000203J<\u0010H\u001a\u0002032\u0006\u0010C\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010K\u001a\u0004\u0018\u00010I2\b\u0010L\u001a\u0004\u0018\u00010I2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NH\u0004J \u0010P\u001a\u0002032\b\u0010Q\u001a\u0004\u0018\u00010R2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020O0NH\u0004R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0012\u0010\u0017\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0012\u0010\u0019\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u0004\u0018\u00010 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b+\u0010,R\u0012\u0010.\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/BaseQuestionnaireParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashCallbacks;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/completed/QuestionnaireCompletedCallbacks;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "questionnaireStore", "Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "getQuestionnaireStore", "()Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "setQuestionnaireStore", "(Lcom/robinhood/store/questionnaire/QuestionnaireStore;)V", "isBlocking", "", "()Z", "skipSplashScreen", "getSkipSplashScreen", "skipCompletedScreen", "getSkipCompletedScreen", "showProgressBar", "getShowProgressBar", "progressBarData", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", "getProgressBarData", "()Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "binding", "Lcom/robinhood/android/investorprofile/databinding/FragmentBaseQuestionnaireParentBinding;", "getBinding", "()Lcom/robinhood/android/investorprofile/databinding/FragmentBaseQuestionnaireParentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/investorprofile/ui/questionnaire/BaseQuestionnaireParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/BaseQuestionnaireParentFragment$Callbacks;", "callbacks$delegate", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "getLoggingInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "updateProgressBar", "fraction", "", "createInitialQuestionFragment", "Landroidx/fragment/app/Fragment;", "showCompletedFragment", "doAfterSubmit", "Lio/reactivex/Single;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onAttach", "context", "Landroid/content/Context;", "onBackPressed", "onSplashScreenContinueClicked", "onQuestionnaireFlowCompleted", "submitData", "", "accountNumber", "applicationId", "referenceKey", "answers", "", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "onCompleteFlow", "response", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitResponse;", "questionAnswers", "Callbacks", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class BaseQuestionnaireParentFragment extends BaseFragment implements QuestionnaireSplashCallbacks, QuestionnaireCompletedCallbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseQuestionnaireParentFragment.class, "binding", "getBinding()Lcom/robinhood/android/investorprofile/databinding/FragmentBaseQuestionnaireParentBinding;", 0)), Reflection.property1(new PropertyReference1Impl(BaseQuestionnaireParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investorprofile/ui/questionnaire/BaseQuestionnaireParentFragment$Callbacks;", 0))};
    public static final int $stable = 8;
    public AccountProvider accountProvider;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public QuestionnaireStore questionnaireStore;

    /* compiled from: BaseQuestionnaireParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/BaseQuestionnaireParentFragment$Callbacks;", "", "onAccountNotCreated", "", "onQuestionnaireFlowCompleted", "response", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitResponse;", "questionAnswers", "", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "onQuestionnaireFlowAborted", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountNotCreated();

        void onQuestionnaireFlowAborted();

        void onQuestionnaireFlowCompleted(ApiQuestionnaireSubmitResponse response, List<? extends QuestionnaireAnswer> questionAnswers);
    }

    public abstract Fragment createInitialQuestionFragment();

    public abstract BrokerageAccountType getBrokerageAccountType();

    public abstract QuestionnaireLoggingInfo getLoggingInfo();

    public abstract QuestionnaireProgressBarData getProgressBarData();

    public abstract boolean getShowProgressBar();

    public abstract boolean getSkipCompletedScreen();

    public abstract boolean getSkipSplashScreen();

    public abstract boolean isBlocking();

    public abstract void showCompletedFragment();

    public BaseQuestionnaireParentFragment() {
        super(C19641R.layout.fragment_base_questionnaire_parent);
        this.binding = ViewBinding5.viewBinding(this, BaseQuestionnaireParentFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.BaseQuestionnaireParentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof BaseQuestionnaireParentFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final QuestionnaireStore getQuestionnaireStore() {
        QuestionnaireStore questionnaireStore = this.questionnaireStore;
        if (questionnaireStore != null) {
            return questionnaireStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("questionnaireStore");
        return null;
    }

    public final void setQuestionnaireStore(QuestionnaireStore questionnaireStore) {
        Intrinsics.checkNotNullParameter(questionnaireStore, "<set-?>");
        this.questionnaireStore = questionnaireStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentBaseQuestionnaireParentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBaseQuestionnaireParentBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (getShowProgressBar()) {
            QuestionnaireProgressBarData progressBarData = getProgressBarData();
            if (progressBarData != null) {
                toolbar.setTitle(progressBarData.getToolbarTitleRes());
            }
            RdsSegmentedProgressBar progressBar = toolbar.getProgressBar();
            progressBar.setVisibility(0);
            QuestionnaireProgressBarData progressBarData2 = getProgressBarData();
            progressBar.setNumSegments(progressBarData2 != null ? progressBarData2.getSegments() : 1);
        }
    }

    public final void updateProgressBar(float fraction) {
        if (getShowProgressBar()) {
            QuestionnaireProgressBarData progressBarData = getProgressBarData();
            RhToolbar rhToolbar = getRhToolbar();
            Intrinsics.checkNotNull(rhToolbar);
            RdsSegmentedProgressBar progressBar = rhToolbar.getProgressBar();
            progressBar.setVisibility(0);
            progressBar.setNumSegments(progressBarData != null ? progressBarData.getSegments() : 1);
            if (progressBarData != null) {
                RhToolbar rhToolbar2 = getRhToolbar();
                if (rhToolbar2 != null) {
                    rhToolbar2.setTitle(progressBarData.getToolbarTitleRes());
                }
                progressBar.setProgress(progressBarData.getSegmentIdx(), fraction, true);
                return;
            }
            progressBar.setProgressByAbsolutePosition(fraction, true);
        }
    }

    public Single<Unit> doAfterSubmit() {
        Single<Unit> singleJust = Single.just(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
        return singleJust;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            if (getSkipSplashScreen()) {
                setFragment(C19641R.id.fragment_container, createInitialQuestionFragment());
            } else {
                setFragment(C19641R.id.fragment_container, QuestionnaireSplashFragment.INSTANCE.newInstance((Parcelable) new QuestionnaireSplashFragment.Args(isBlocking(), getLoggingInfo(), getBrokerageAccountType())));
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getAccountProvider().refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getAccountProvider().streamIndividualAccountOptional()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.BaseQuestionnaireParentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseQuestionnaireParentFragment.onResume$lambda$3(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(BaseQuestionnaireParentFragment baseQuestionnaireParentFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        if (((Account) optional.component1()) == null) {
            baseQuestionnaireParentFragment.getCallbacks().onAccountNotCreated();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((context + " must implement " + Callbacks.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (super.onBackPressed()) {
            return true;
        }
        getCallbacks().onQuestionnaireFlowAborted();
        return true;
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.splash.QuestionnaireSplashCallbacks
    public final void onSplashScreenContinueClicked() {
        replaceFragment(createInitialQuestionFragment());
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.completed.QuestionnaireCompletedCallbacks
    public final void onQuestionnaireFlowCompleted() {
        getCallbacks().onQuestionnaireFlowCompleted(null, CollectionsKt.emptyList());
    }

    protected final void submitData(String context, String accountNumber, String applicationId, String referenceKey, final List<? extends QuestionnaireAnswer> answers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(answers, "answers");
        List<? extends QuestionnaireAnswer> list = answers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (QuestionnaireAnswer questionnaireAnswer : list) {
            arrayList.add(new ApiQuestionAnswer(questionnaireAnswer.getQuestion().getId(), questionnaireAnswer.toApiContent()));
        }
        ApiQuestionnaireSubmitRequest apiQuestionnaireSubmitRequest = new ApiQuestionnaireSubmitRequest(context, accountNumber, applicationId, referenceKey, arrayList);
        IdlingResourceCounters2.setBusy(IdlingResourceType.QUESTIONNAIRE_QUESTIONS_SUBMITTING, true);
        getBinding().loadingView.show();
        RhToolbar rhToolbar = requireBaseActivity().getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.getProgressBar().setVisibility(8);
        Single<R> singleFlatMap = getQuestionnaireStore().submitAnswers(apiQuestionnaireSubmitRequest).flatMap(new Function() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.BaseQuestionnaireParentFragment.submitData.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends ApiQuestionnaireSubmitResponse> apply(ApiQuestionnaireSubmitResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return BaseQuestionnaireParentFragment.this.doAfterSubmit().ignoreElement().onErrorComplete().andThen(Single.just(it));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        Single singleDoAfterTerminate = SinglesAndroid.observeOnMainThread(SingleDelay2.minTimeInFlight$default(singleFlatMap, 1000L, null, 2, null)).doAfterTerminate(new Action() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.BaseQuestionnaireParentFragment.submitData.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                BaseQuestionnaireParentFragment.this.getBinding().loadingView.hide();
                RhToolbar rhToolbar2 = BaseQuestionnaireParentFragment.this.requireBaseActivity().getRhToolbar();
                Intrinsics.checkNotNull(rhToolbar2);
                rhToolbar2.getProgressBar().setVisibility(BaseQuestionnaireParentFragment.this.getShowProgressBar() ? 0 : 8);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoAfterTerminate, "doAfterTerminate(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoAfterTerminate, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.BaseQuestionnaireParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseQuestionnaireParentFragment.submitData$lambda$5(this.f$0, answers, (ApiQuestionnaireSubmitResponse) obj);
            }
        }, getActivityErrorHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitData$lambda$5(BaseQuestionnaireParentFragment baseQuestionnaireParentFragment, List list, ApiQuestionnaireSubmitResponse apiQuestionnaireSubmitResponse) {
        baseQuestionnaireParentFragment.onCompleteFlow(apiQuestionnaireSubmitResponse, list);
        IdlingResourceCounters2.setBusy(IdlingResourceType.QUESTIONNAIRE_QUESTIONS_SUBMITTING, false);
        return Unit.INSTANCE;
    }

    protected final void onCompleteFlow(ApiQuestionnaireSubmitResponse response, List<? extends QuestionnaireAnswer> questionAnswers) {
        Intrinsics.checkNotNullParameter(questionAnswers, "questionAnswers");
        if (getSkipCompletedScreen()) {
            getCallbacks().onQuestionnaireFlowCompleted(response, questionAnswers);
        } else {
            showCompletedFragment();
        }
    }
}
