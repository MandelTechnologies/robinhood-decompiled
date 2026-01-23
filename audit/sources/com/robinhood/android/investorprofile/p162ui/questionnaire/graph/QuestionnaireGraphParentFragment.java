package com.robinhood.android.investorprofile.p162ui.questionnaire.graph;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.BackEventCompat;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.ContextualQuestionInfo;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionFragmentCallbacks;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionableFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireLoggingInfo;
import com.robinhood.android.investorprofile.p162ui.questionnaire.UtilKt;
import com.robinhood.android.investorprofile.p162ui.questionnaire.completed.CryptoScamCompletedFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.completed.QuestionnaireCompletedFragment;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.questionnaire.p220ui.UiGraphRedirect;
import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireProgressBarData;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireQuestion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: QuestionnaireGraphParentFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 A2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001AB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020)H\u0016J\b\u0010-\u001a\u00020)H\u0016J\u0018\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0012H\u0016J\b\u00102\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020)2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020)H\u0016J\u0018\u00107\u001a\u00020)2\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020:H\u0016J\u001a\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u0002052\b\b\u0002\u0010=\u001a\u00020#H\u0002J\u0012\u0010>\u001a\b\u0012\u0004\u0012\u0002050?*\u00020@H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/QuestionnaireGraphParentFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/BaseQuestionnaireParentFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo$Answers;", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "<init>", "()V", "redirectManager", "Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/RedirectManager;", "getRedirectManager", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/RedirectManager;", "redirectManager$delegate", "Lkotlin/properties/ReadWriteProperty;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "isBlocking", "", "()Z", "skipSplashScreen", "getSkipSplashScreen", "skipCompletedScreen", "getSkipCompletedScreen", "showProgressBar", "getShowProgressBar", "progressBarData", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", "getProgressBarData", "()Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "getLoggingInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "initialLongestPath", "", "getInitialLongestPath", "()I", "initialLongestPath$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onBackStackChanged", "onBackStackChangeCommitted", "fragment", "Landroidx/fragment/app/Fragment;", "pop", "createInitialQuestionFragment", "updateProgressBar", "currentQuestionId", "", "showCompletedFragment", "onQuestionAnswered", "contextualInfo", "answer", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "getLongestPath", "questionId", "pathSoFar", "possibleRedirects", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class QuestionnaireGraphParentFragment extends BaseQuestionnaireParentFragment implements QuestionFragmentCallbacks<ContextualQuestionInfo.Answers>, FragmentManager.OnBackStackChangedListener {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionnaireGraphParentFragment.class, "redirectManager", "getRedirectManager()Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/RedirectManager;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: redirectManager$delegate, reason: from kotlin metadata */
    private final Interfaces3 redirectManager = (Interfaces3) BindSavedState2.savedParcelable(this, new RedirectManager(null, null, 3, null)).provideDelegate(this, $$delegatedProperties[0]);

    /* renamed from: initialLongestPath$delegate, reason: from kotlin metadata */
    private final Lazy initialLongestPath = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.graph.QuestionnaireGraphParentFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(QuestionnaireGraphParentFragment.initialLongestPath_delegate$lambda$0(this.f$0));
        }
    });

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public BrokerageAccountType getBrokerageAccountType() {
        return null;
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
        super.onBackStackChangeCancelled();
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(BackEventCompat backEventCompat) {
        super.onBackStackChangeProgressed(backEventCompat);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* bridge */ /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
        super.onBackStackChangeStarted(fragment, z);
    }

    private final RedirectManager getRedirectManager() {
        return (RedirectManager) this.redirectManager.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public boolean isBlocking() {
        return ((QuestionnaireGraphArgs) INSTANCE.getArgs((Fragment) this)).isBlocking();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public boolean getSkipSplashScreen() {
        return ((QuestionnaireGraphArgs) INSTANCE.getArgs((Fragment) this)).getSkipSplashScreen();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public boolean getSkipCompletedScreen() {
        return ((QuestionnaireGraphArgs) INSTANCE.getArgs((Fragment) this)).getSkipCompletedScreen();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public boolean getShowProgressBar() {
        return ((QuestionnaireGraphArgs) INSTANCE.getArgs((Fragment) this)).getShowProgressBar();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public QuestionnaireProgressBarData getProgressBarData() {
        return ((QuestionnaireGraphArgs) INSTANCE.getArgs((Fragment) this)).getProgressBarData();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public QuestionnaireLoggingInfo getLoggingInfo() {
        return ((QuestionnaireGraphArgs) INSTANCE.getArgs((Fragment) this)).getLoggingInfo();
    }

    private final int getInitialLongestPath() {
        return ((Number) this.initialLongestPath.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int initialLongestPath_delegate$lambda$0(QuestionnaireGraphParentFragment questionnaireGraphParentFragment) {
        return questionnaireGraphParentFragment.getLongestPath(((QuestionnaireGraphArgs) INSTANCE.getArgs((Fragment) questionnaireGraphParentFragment)).getGraphRoot(), 0);
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getChildFragmentManager().addOnBackStackChangedListener(this);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getChildFragmentManager().removeOnBackStackChangedListener(this);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public void onBackStackChanged() {
        UiQuestionnaireQuestion.Supported question;
        UUID id;
        ActivityResultCaller currentFragment = getCurrentFragment();
        QuestionableFragment questionableFragment = currentFragment instanceof QuestionableFragment ? (QuestionableFragment) currentFragment : null;
        if (questionableFragment == null || (question = questionableFragment.getQuestion()) == null || (id = question.getId()) == null) {
            return;
        }
        String string2 = id.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        updateProgressBar(string2);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public void onBackStackChangeCommitted(Fragment fragment, boolean pop) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        super.onBackStackChangeCommitted(fragment, pop);
        if (pop && fragment.isRemoving()) {
            getRedirectManager().onBack();
        }
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public Fragment createInitialQuestionFragment() {
        Companion companion = INSTANCE;
        UiQuestionnaireQuestion.Supported supported = ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getGraph().get(((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getGraphRoot());
        if (supported == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        UiQuestionnaireQuestion.Supported supported2 = supported;
        String string2 = supported2.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        updateProgressBar(string2);
        return UtilKt.createFragmentForQuestion$default(((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getAccountNumber(), ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getAccountDisplayName(), ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getContext(), new ContextualQuestionInfo.Answers(CollectionsKt.emptyList()), supported2, ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getLoggingInfo(), ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getSelectedQuestion(), false, false, 384, null);
    }

    private final void updateProgressBar(String currentQuestionId) {
        if (getShowProgressBar()) {
            updateProgressBar(((getInitialLongestPath() - getLongestPath(currentQuestionId, 0)) + 1) / getInitialLongestPath());
        }
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public void showCompletedFragment() {
        if (Intrinsics.areEqual(((QuestionnaireGraphArgs) INSTANCE.getArgs((Fragment) this)).getContext(), QuestionnaireContexts.CRYPTO_SCAM)) {
            replaceFragment(CryptoScamCompletedFragment.INSTANCE.newInstance());
        } else {
            replaceFragment(QuestionnaireCompletedFragment.INSTANCE.newInstance((Parcelable) getLoggingInfo()));
        }
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionFragmentCallbacks
    public void onQuestionAnswered(ContextualQuestionInfo.Answers contextualInfo, QuestionnaireAnswer answer) {
        Intrinsics.checkNotNullParameter(contextualInfo, "contextualInfo");
        Intrinsics.checkNotNullParameter(answer, "answer");
        ContextualQuestionInfo.Answers answersReduce = contextualInfo.reduce(answer);
        RedirectManager redirectManager = getRedirectManager();
        Companion companion = INSTANCE;
        Map<String, UiQuestionnaireQuestion.Supported> graph = ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getGraph();
        QuestionnaireQuestion selectedQuestion = ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getSelectedQuestion();
        UiQuestionnaireQuestion.Supported nextQuestion = redirectManager.getNextQuestion(graph, answer, (selectedQuestion != null ? selectedQuestion.getQuestionId() : null) == null);
        if (nextQuestion != null) {
            replaceFragment(UtilKt.createFragmentForQuestion$default(((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getAccountNumber(), ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getAccountDisplayName(), ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getContext(), answersReduce, nextQuestion, ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getLoggingInfo(), ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getSelectedQuestion(), false, false, 384, null));
        } else {
            submitData(((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getContext(), ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getAccountNumber(), ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getApplicationId(), ((QuestionnaireGraphArgs) companion.getArgs((Fragment) this)).getReferenceKey(), answersReduce.getAnswers());
        }
    }

    static /* synthetic */ int getLongestPath$default(QuestionnaireGraphParentFragment questionnaireGraphParentFragment, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return questionnaireGraphParentFragment.getLongestPath(str, i);
    }

    private final int getLongestPath(String questionId, int pathSoFar) {
        Integer num;
        UiQuestionnaireQuestion.Supported supported = ((QuestionnaireGraphArgs) INSTANCE.getArgs((Fragment) this)).getGraph().get(questionId);
        if (supported != null) {
            Iterator<T> it = possibleRedirects(supported.getContent()).iterator();
            if (it.hasNext()) {
                int i = pathSoFar + 1;
                Integer numValueOf = Integer.valueOf(getLongestPath((String) it.next(), i));
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(getLongestPath((String) it.next(), i));
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return pathSoFar;
    }

    private final List<String> possibleRedirects(UiQuestionContent uiQuestionContent) {
        if (uiQuestionContent instanceof UiQuestionContent.IntegerContent) {
            UiGraphRedirect graphDefaultRedirect = ((UiQuestionContent.IntegerContent) uiQuestionContent).getGraphDefaultRedirect();
            return CollectionsKt.listOfNotNull(graphDefaultRedirect != null ? graphDefaultRedirect.getRedirect() : null);
        }
        if (uiQuestionContent instanceof UiQuestionContent.MultipleChoiceContent) {
            List<UiQuestionContent.MultipleChoiceContent.Answer> answerChoices = ((UiQuestionContent.MultipleChoiceContent) uiQuestionContent).getAnswerChoices();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = answerChoices.iterator();
            while (it.hasNext()) {
                UiGraphRedirect graphRedirect = ((UiQuestionContent.MultipleChoiceContent.Answer) it.next()).getGraphRedirect();
                String redirect = graphRedirect != null ? graphRedirect.getRedirect() : null;
                if (redirect != null) {
                    arrayList.add(redirect);
                }
            }
            return CollectionsKt.distinct(arrayList);
        }
        if (uiQuestionContent instanceof UiQuestionContent.MultipleResponseContent) {
            List<UiQuestionContent.MultipleResponseContent.Answer> answerChoices2 = ((UiQuestionContent.MultipleResponseContent) uiQuestionContent).getAnswerChoices();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = answerChoices2.iterator();
            while (it2.hasNext()) {
                UiGraphRedirect graphRedirect2 = ((UiQuestionContent.MultipleResponseContent.Answer) it2.next()).getGraphRedirect();
                String redirect2 = graphRedirect2 != null ? graphRedirect2.getRedirect() : null;
                if (redirect2 != null) {
                    arrayList2.add(redirect2);
                }
            }
            return CollectionsKt.distinct(arrayList2);
        }
        if (uiQuestionContent instanceof UiQuestionContent.OptionalIntegerContent) {
            UiQuestionContent.OptionalIntegerContent optionalIntegerContent = (UiQuestionContent.OptionalIntegerContent) uiQuestionContent;
            UiGraphRedirect checkedGraphRedirect = optionalIntegerContent.getCheckedGraphRedirect();
            String redirect3 = checkedGraphRedirect != null ? checkedGraphRedirect.getRedirect() : null;
            UiGraphRedirect uncheckedGraphRedirect = optionalIntegerContent.getUncheckedGraphRedirect();
            return CollectionsKt.distinct(CollectionsKt.listOfNotNull((Object[]) new String[]{redirect3, uncheckedGraphRedirect != null ? uncheckedGraphRedirect.getRedirect() : null}));
        }
        if (uiQuestionContent instanceof UiQuestionContent.StringContent) {
            UiGraphRedirect graphDefaultRedirect2 = ((UiQuestionContent.StringContent) uiQuestionContent).getGraphDefaultRedirect();
            return CollectionsKt.listOfNotNull(graphDefaultRedirect2 != null ? graphDefaultRedirect2.getRedirect() : null);
        }
        if (!(uiQuestionContent instanceof UiQuestionContent.HybridContent)) {
            if (Intrinsics.areEqual(uiQuestionContent, UiQuestionContent.Unsupported.INSTANCE)) {
                return CollectionsKt.emptyList();
            }
            throw new NoWhenBranchMatchedException();
        }
        UiQuestionContent.HybridContent hybridContent = (UiQuestionContent.HybridContent) uiQuestionContent;
        UiGraphRedirect graphDefaultRedirect3 = hybridContent.getGraphDefaultRedirect();
        List listListOfNotNull = CollectionsKt.listOfNotNull(graphDefaultRedirect3 != null ? graphDefaultRedirect3.getRedirect() : null);
        List<UiQuestionContent.HybridContent.Answer> answerChoices3 = hybridContent.getAnswerChoices();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = answerChoices3.iterator();
        while (it3.hasNext()) {
            UiGraphRedirect graphRedirect3 = ((UiQuestionContent.HybridContent.Answer) it3.next()).getGraphRedirect();
            String redirect4 = graphRedirect3 != null ? graphRedirect3.getRedirect() : null;
            if (redirect4 != null) {
                arrayList3.add(redirect4);
            }
        }
        return CollectionsKt.distinct(CollectionsKt.flatten(CollectionsKt.listOf((Object[]) new List[]{listListOfNotNull, arrayList3})));
    }

    /* compiled from: QuestionnaireGraphParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/QuestionnaireGraphParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/QuestionnaireGraphParentFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/QuestionnaireGraphArgs;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<QuestionnaireGraphParentFragment, QuestionnaireGraphArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public QuestionnaireGraphArgs getArgs(QuestionnaireGraphParentFragment questionnaireGraphParentFragment) {
            return (QuestionnaireGraphArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, questionnaireGraphParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public QuestionnaireGraphParentFragment newInstance(QuestionnaireGraphArgs questionnaireGraphArgs) {
            return (QuestionnaireGraphParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, questionnaireGraphArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(QuestionnaireGraphParentFragment questionnaireGraphParentFragment, QuestionnaireGraphArgs questionnaireGraphArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, questionnaireGraphParentFragment, questionnaireGraphArgs);
        }
    }
}
