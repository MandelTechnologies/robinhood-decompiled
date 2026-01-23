package com.robinhood.shared.education.p377ui.lessons.standard;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.viewinterop.AndroidViewBinding;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.jakewharton.rxbinding3.view.RxView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.margin.contracts.SlipHub2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.retirement.contracts.RetirementSignUp;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.education.CryptoLearnAndEarnLoggingData;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.crypto.contracts.account.CryptoUpgradeIntentKey;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.FragmentEducationLessonStandardBinding;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonAchromaticDialog;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardFooterParentView;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardFragment;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardHeaderParentView;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardViewState;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys2;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.SurveyManager;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.recyclerview.AdapterDataObservables;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EducationLessonStandardFragment.kt */
@Metadata(m3635d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001WB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016J\u001a\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\r\u0010>\u001a\u000206H\u0017¢\u0006\u0002\u0010?J\b\u0010@\u001a\u000206H\u0016J\b\u0010A\u001a\u00020\u0017H\u0016J\u0010\u0010B\u001a\u0002062\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u0002062\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u000206H\u0016J\b\u0010I\u001a\u000206H\u0016J\b\u0010J\u001a\u000206H\u0016J\b\u0010K\u001a\u000206H\u0016J\b\u0010L\u001a\u000206H\u0016J\u001a\u0010M\u001a\u00020\u00172\u0006\u0010C\u001a\u00020D2\b\u0010N\u001a\u0004\u0018\u00010=H\u0016J\u001a\u0010O\u001a\u00020\u00172\u0006\u0010C\u001a\u00020D2\b\u0010N\u001a\u0004\u0018\u00010=H\u0016J\u0010\u0010P\u001a\u0002062\u0006\u0010Q\u001a\u00020RH\u0002J\u0016\u0010S\u001a\u0002062\f\u0010T\u001a\b\u0012\u0004\u0012\u00020V0UH\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0014\u0010*\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010#R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u0001020201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006X²\u0006\n\u0010Q\u001a\u00020RX\u008a\u0084\u0002²\u0006\u0012\u0010Y\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010ZX\u008a\u008e\u0002²\u0006\u0010\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "Lcom/airbnb/lottie/LottieOnCompositionLoadedListener;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderParentView$HeaderParentCallbacks;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterParentView$FooterParentCallbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "duxo", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardDuxo;", "getDuxo", "()Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenName", "getScreenName", "entityId", "getEntityId", "sectionAdapter", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardSectionPagerAdapter;", "modifiedEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "cryptoUpgradeLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "dismissingByButtonTap", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onStart", "onBackPressed", "onDialogDismissed", "id", "", "onCompositionLoaded", "composition", "Lcom/airbnb/lottie/LottieComposition;", "onHeaderBackBtnPressed", "onBackButtonClicked", "onNextButtonClicked", "onDismissAction", "onFinishWithResultAction", "onPositiveButtonClicked", "passthroughArgs", "onNegativeButtonClicked", "bindViewState", "state", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState;", "bindSectionItems", "items", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection;", "Companion", "feature-education_externalDebug", "genericAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "errorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", ""}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationLessonStandardFragment extends GenericActionHandlingFragment implements AutoLoggableFragment, UiCallbacks.ScreenViewAnalyticable, LottieOnCompositionLoadedListener, EducationLessonStandardHeaderParentView.HeaderParentCallbacks, EducationLessonStandardFooterParentView.FooterParentCallbacks, RhDialogFragment.OnClickListener {
    private final ActivityResultLauncher<Intent> cryptoUpgradeLauncher;
    private boolean dismissingByButtonTap;
    public EventLogger eventLogger;
    private Context modifiedEventContext;
    private final boolean toolbarVisible;
    public SurveyManager3 userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, EducationLessonStandardDuxo.class);
    private final EducationLessonStandardSectionPagerAdapter sectionAdapter = new EducationLessonStandardSectionPagerAdapter();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(EducationLessonStandardFragment educationLessonStandardFragment, int i, Composer composer, int i2) {
        educationLessonStandardFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public EducationLessonStandardFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$cryptoUpgradeLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                String str;
                Intrinsics.checkNotNullParameter(result, "result");
                EventLogger eventLogger = this.this$0.getEventLogger();
                Screen eventScreen = this.this$0.getEventScreen();
                Context context = this.this$0.modifiedEventContext;
                UserInteractionEventData.Action action = UserInteractionEventData.Action.SIGN_UP;
                if (result.getResultCode() == -1) {
                    str = "learn-and-earn-rhc-sign-up-successful";
                } else {
                    str = "learn-and-earn-rhc-sign-up-unsuccessful";
                }
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(null, eventScreen, new Component(null, str, null, 5, null), action, context, null, null, 97, null), false, false, 6, null);
                this.this$0.getDuxo().checkLessonEarnability();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.cryptoUpgradeLauncher = activityResultLauncherRegisterForActivityResult;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EducationLessonStandardDuxo getDuxo() {
        return (EducationLessonStandardDuxo) this.duxo.getValue();
    }

    /* compiled from: EducationLessonStandardFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$ComposeContent$1 */
    static final class C388791 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<EducationLessonStandardViewState> $state$delegate;

        C388791(SnapshotState4<EducationLessonStandardViewState> snapshotState4) {
            this.$state$delegate = snapshotState4;
        }

        private static final GenericAlertContent<GenericAction> invoke$lambda$1(SnapshotState<GenericAlertContent<GenericAction>> snapshotState) {
            return snapshotState.getValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FragmentEducationLessonStandardBinding invoke$lambda$8$lambda$7(final EducationLessonStandardFragment educationLessonStandardFragment, LayoutInflater inflater, ViewGroup parent, boolean z) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(parent, "parent");
            final FragmentEducationLessonStandardBinding fragmentEducationLessonStandardBindingInflate = FragmentEducationLessonStandardBinding.inflate(inflater, parent, z);
            EducationLessonStandardHeaderParentView educationLessonHeader = fragmentEducationLessonStandardBindingInflate.educationLessonHeader;
            Intrinsics.checkNotNullExpressionValue(educationLessonHeader, "educationLessonHeader");
            InsetSides.Companion companion = InsetSides.INSTANCE;
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(educationLessonHeader, companion.m26683getTopXedK2Rk());
            EducationLessonStandardFooterParentView educationLessonFooter = fragmentEducationLessonStandardBindingInflate.educationLessonFooter;
            Intrinsics.checkNotNullExpressionValue(educationLessonFooter, "educationLessonFooter");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(educationLessonFooter, companion.m26679getBottomXedK2Rk());
            ShimmerLoadingView loadingView = fragmentEducationLessonStandardBindingInflate.loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(loadingView, companion.m26684getVerticalXedK2Rk());
            ErrorView errorView = fragmentEducationLessonStandardBindingInflate.errorView;
            Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(errorView, companion.m26684getVerticalXedK2Rk());
            fragmentEducationLessonStandardBindingInflate.educationLessonHeader.addLottieOnCompositionLoadedListener(educationLessonStandardFragment);
            fragmentEducationLessonStandardBindingInflate.educationLessonHeader.setCallbacks(educationLessonStandardFragment);
            ViewPager2 viewPager2 = fragmentEducationLessonStandardBindingInflate.educationLessonSectionViewPager;
            viewPager2.setAdapter(educationLessonStandardFragment.sectionAdapter);
            viewPager2.setUserInputEnabled(false);
            viewPager2.setOffscreenPageLimit(2);
            viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$ComposeContent$1$1$1$1$1$1
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int position) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
                    View view;
                    ViewPager2 educationLessonSectionViewPager = fragmentEducationLessonStandardBindingInflate.educationLessonSectionViewPager;
                    Intrinsics.checkNotNullExpressionValue(educationLessonSectionViewPager, "educationLessonSectionViewPager");
                    View view2 = ViewGroup2.get(educationLessonSectionViewPager, 0);
                    RecyclerView recyclerView = view2 instanceof RecyclerView ? (RecyclerView) view2 : null;
                    if (recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(position)) == null || (view = viewHolderFindViewHolderForAdapterPosition.itemView) == null) {
                        return;
                    }
                    ViewsKt.logAppear$default(view, null, false, 3, null);
                }
            });
            fragmentEducationLessonStandardBindingInflate.educationLessonFooter.setCallbacks(educationLessonStandardFragment);
            fragmentEducationLessonStandardBindingInflate.errorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$ComposeContent$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EducationLessonStandardFragment.C388791.invoke$lambda$8$lambda$7$lambda$6$lambda$4(educationLessonStandardFragment);
                }
            });
            EducationLessonStandardFooterParentView educationLessonFooter2 = fragmentEducationLessonStandardBindingInflate.educationLessonFooter;
            Intrinsics.checkNotNullExpressionValue(educationLessonFooter2, "educationLessonFooter");
            LifecycleHost.DefaultImpls.bind$default(educationLessonStandardFragment, RxView.layoutChanges(educationLessonFooter2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$ComposeContent$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EducationLessonStandardFragment.C388791.invoke$lambda$8$lambda$7$lambda$6$lambda$5(educationLessonStandardFragment, fragmentEducationLessonStandardBindingInflate, (Unit) obj);
                }
            });
            return fragmentEducationLessonStandardBindingInflate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6$lambda$4(EducationLessonStandardFragment educationLessonStandardFragment) {
            educationLessonStandardFragment.getDuxo().refresh(true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6$lambda$5(EducationLessonStandardFragment educationLessonStandardFragment, FragmentEducationLessonStandardBinding fragmentEducationLessonStandardBinding, Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            educationLessonStandardFragment.sectionAdapter.setItemBottomPadding(fragmentEducationLessonStandardBinding.educationLessonFooter.getHeight());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(SnapshotState4 snapshotState4, FragmentEducationLessonStandardBinding AndroidViewBinding) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(AndroidViewBinding, "$this$AndroidViewBinding");
            AndroidViewBinding.educationLessonHeader.bind(EducationLessonStandardFragment.ComposeContent$lambda$2(snapshotState4).getCurrentSectionHeader());
            AndroidViewBinding.educationLessonSectionViewPager.setCurrentItem(EducationLessonStandardFragment.ComposeContent$lambda$2(snapshotState4).getSectionPosition());
            ShimmerLoadingView loadingView = AndroidViewBinding.loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
            loadingView.setVisibility(EducationLessonStandardFragment.ComposeContent$lambda$2(snapshotState4).getShowLoading() ? 0 : 8);
            ErrorView errorView = AndroidViewBinding.errorView;
            Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
            errorView.setVisibility(EducationLessonStandardFragment.ComposeContent$lambda$2(snapshotState4).getShowError() ? 0 : 8);
            ConstraintLayout educationLessonContent = AndroidViewBinding.educationLessonContent;
            Intrinsics.checkNotNullExpressionValue(educationLessonContent, "educationLessonContent");
            educationLessonContent.setVisibility(EducationLessonStandardFragment.ComposeContent$lambda$2(snapshotState4).getShowLesson() ? 0 : 8);
            AndroidViewBinding.educationLessonFooter.bind(EducationLessonStandardFragment.ComposeContent$lambda$2(snapshotState4).getCurrentSectionFooter(), EducationLessonStandardFragment.ComposeContent$lambda$2(snapshotState4).getDayNightOverlay());
            return Unit.INSTANCE;
        }

        private static final ActivityErrorHandler<Object> invoke$lambda$13(Lazy<EducationLessonStandardFragment4> lazy) {
            return lazy.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$ComposeContent$1$errorHandler$2$1$1] */
        public static final EducationLessonStandardFragment4 invoke$lambda$12$lambda$11(final EducationLessonStandardFragment educationLessonStandardFragment) {
            final FragmentActivity fragmentActivityRequireActivity = educationLessonStandardFragment.requireActivity();
            return new ActivityErrorHandler<Object>(fragmentActivityRequireActivity) { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$ComposeContent$1$errorHandler$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(fragmentActivityRequireActivity, false, 0, null, 14, null);
                    Intrinsics.checkNotNull(fragmentActivityRequireActivity);
                }

                @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
                protected void showShortError(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    showLongError(message);
                }

                @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
                protected void showLongError(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                    android.content.Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    RhDialogFragment.Builder theme = companion.create(contextRequireContext).setId(C11048R.id.dialog_id_generic_error).setTitle(C38790R.string.education_lesson_error_dialog_title, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setMessage(message).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
                    FragmentManager parentFragmentManager = this.this$0.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(theme, parentFragmentManager, "error", false, 4, null);
                }
            };
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            CharSequence text;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1796358757, i, -1, "com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment.ComposeContent.<anonymous> (EducationLessonStandardFragment.kt:144)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            UiEvent<EducationLessonStandardViewState.RewardUnavailableDialogState> rewardStateDialogEvent = EducationLessonStandardFragment.ComposeContent$lambda$2(this.$state$delegate).getRewardStateDialogEvent();
            EducationLessonStandardViewState.RewardUnavailableDialogState rewardUnavailableDialogStateConsume = rewardStateDialogEvent != null ? rewardStateDialogEvent.consume() : null;
            UiEvent<Throwable> educationErrorAlertEvent = EducationLessonStandardFragment.ComposeContent$lambda$2(this.$state$delegate).getEducationErrorAlertEvent();
            Throwable thConsume = educationErrorAlertEvent != null ? educationErrorAlertEvent.consume() : null;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(EducationLessonStandardFragment.this);
            final EducationLessonStandardFragment educationLessonStandardFragment = EducationLessonStandardFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function3() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return EducationLessonStandardFragment.C388791.invoke$lambda$8$lambda$7(educationLessonStandardFragment, (LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function3 function3 = (Function3) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$state$delegate);
            final SnapshotState4<EducationLessonStandardViewState> snapshotState4 = this.$state$delegate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EducationLessonStandardFragment.C388791.invoke$lambda$10$lambda$9(snapshotState4, (FragmentEducationLessonStandardBinding) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            AndroidViewBinding.AndroidViewBinding(function3, null, (Function1) objRememberedValue3, composer, 0, 2);
            if (rewardUnavailableDialogStateConsume != null) {
                if (rewardUnavailableDialogStateConsume instanceof EducationLessonStandardViewState.RewardUnavailableDialogState.ClientAlert) {
                    EducationLessonAchromaticDialog.Companion companion2 = EducationLessonAchromaticDialog.INSTANCE;
                    android.content.Context contextRequireContext = EducationLessonStandardFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    EducationLessonStandardViewState.RewardUnavailableDialogState.ClientAlert clientAlert = (EducationLessonStandardViewState.RewardUnavailableDialogState.ClientAlert) rewardUnavailableDialogStateConsume;
                    RhDialogFragment.Builder id = companion2.create(contextRequireContext).setId(clientAlert.getDialogId());
                    StringResource titleText = clientAlert.getTitleText();
                    Resources resources = EducationLessonStandardFragment.this.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    RhDialogFragment.Builder title = id.setTitle(titleText.getText(resources));
                    StringResource messageText = clientAlert.getMessageText();
                    Resources resources2 = EducationLessonStandardFragment.this.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    RhDialogFragment.Builder message = title.setMessage(messageText.getText(resources2));
                    StringResource primaryButtonText = clientAlert.getPrimaryButtonText();
                    Resources resources3 = EducationLessonStandardFragment.this.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                    RhDialogFragment.Builder positiveButton = message.setPositiveButton(primaryButtonText.getText(resources3));
                    StringResource secondaryButtonText = clientAlert.getSecondaryButtonText();
                    if (secondaryButtonText != null) {
                        Resources resources4 = EducationLessonStandardFragment.this.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                        text = secondaryButtonText.getText(resources4);
                    } else {
                        text = null;
                    }
                    RhDialogFragment.Builder negativeButton = positiveButton.setNegativeButton(text);
                    FragmentManager childFragmentManager = EducationLessonStandardFragment.this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "rewardsNotAvailableDialog", false, 4, null);
                } else {
                    if (!(rewardUnavailableDialogStateConsume instanceof EducationLessonStandardViewState.RewardUnavailableDialogState.ServerAlert)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    snapshotState.setValue(((EducationLessonStandardViewState.RewardUnavailableDialogState.ServerAlert) rewardUnavailableDialogStateConsume).getAlertAction().getAlert());
                }
            }
            composer.startReplaceGroup(-275960243);
            if (thConsume != null) {
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(EducationLessonStandardFragment.this);
                final EducationLessonStandardFragment educationLessonStandardFragment2 = EducationLessonStandardFragment.this;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$ComposeContent$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EducationLessonStandardFragment.C388791.invoke$lambda$12$lambda$11(educationLessonStandardFragment2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                AbsErrorHandler.handleError$default(invoke$lambda$13(LazyKt.lazy((Function0) objRememberedValue4)), thConsume, false, 2, null);
            }
            composer.endReplaceGroup();
            GenericAlertContent<GenericAction> genericAlertContentInvoke$lambda$1 = invoke$lambda$1(snapshotState);
            if (genericAlertContentInvoke$lambda$1 != null) {
                final EducationLessonStandardFragment educationLessonStandardFragment3 = EducationLessonStandardFragment.this;
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer.changedInstance(educationLessonStandardFragment3);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new SduiActionHandler() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$ComposeContent$1$3$1$1
                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                        public final boolean mo15941handle(GenericAction action) {
                            Intrinsics.checkNotNullParameter(action, "action");
                            if (action instanceof GenericAction.Deeplink) {
                                educationLessonStandardFragment3.mo15941handle(action);
                                return true;
                            }
                            if (action instanceof GenericAction.Dismiss) {
                                snapshotState.setValue(null);
                                return true;
                            }
                            if (action instanceof GenericAction.InfoAlert) {
                                return true;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue6 = composer.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$ComposeContent$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                sduiAlert.Dialog(genericAlertContentInvoke$lambda$1, sduiActionHandler, null, (Function0) objRememberedValue6, composer, (SduiAlert.$stable << 12) | 3072, 4);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState ComposeContent$lambda$2(SnapshotState4<EducationLessonStandardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return ((EducationLessonFragmentKeys2) INSTANCE.getArgs((Fragment) this)).getSource();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.LEARNING_LESSON_V3, getProfileId(), null, null, 12, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return getEventScreen().getName().name();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getEntityId() {
        return ((EducationLessonFragmentKeys2) INSTANCE.getArgs((Fragment) this)).getContentfulId();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Observable<R> observableFlatMap = AdapterDataObservables.dataEvents(this.sectionAdapter).flatMap(new Function() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment.onViewCreated.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends EducationLessonStandardViewState> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EducationLessonStandardFragment.this.getDuxo().getStates().take(1L);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableFlatMap), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardFragment.onViewCreated$lambda$1(this.f$0, (EducationLessonStandardViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(EducationLessonStandardFragment educationLessonStandardFragment, EducationLessonStandardViewState educationLessonStandardViewState) {
        educationLessonStandardFragment.getDuxo().updateSectionPosition(educationLessonStandardViewState.getSectionPosition());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(93675657);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(93675657, i2, -1, "com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment.ComposeContent (EducationLessonStandardFragment.kt:141)");
            }
            ActionHandlingFragment2.ContentWithDialog(this, ComposableLambda3.rememberComposableLambda(1796358757, true, new C388791(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStatesFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationLessonStandardFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(contextRequireContext).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C388811(getDuxo()));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C388822(this));
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonStandardViewState) it).getLessonSectionItems());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonStandardFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C388834(this));
        Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$onStart$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonStandardViewState) it).getEventLearningLesson());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonStandardFragment$onStart$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardFragment.onStart$lambda$5(this.f$0, (LearningLesson) obj);
            }
        });
        Observable<R> map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$onStart$$inlined$mapNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonStandardViewState) it).getLearnAndEarnLoggingData());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonStandardFragment$onStart$$inlined$mapNotNull$3<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardFragment.onStart$lambda$7(this.f$0, (CryptoLearnAndEarnLoggingData) obj);
            }
        });
        Observable<R> map4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$onStart$$inlined$mapNotNull$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonStandardViewState) it).getTrackingId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonStandardFragment$onStart$$inlined$mapNotNull$4<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableDistinctUntilChanged4 = ObservablesKt.filterIsPresent(map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardFragment.onStart$lambda$9(this.f$0, (String) obj);
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable<R> map5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$onStart$$inlined$mapNotNull$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonStandardViewState) it).getTrackingId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonStandardFragment$onStart$$inlined$mapNotNull$5<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(map5);
        Observable<R> map6 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$onStart$$inlined$mapNotNull$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonStandardViewState) it).getPercentComplete());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonStandardFragment$onStart$$inlined$mapNotNull$6<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        Observable observableDistinctUntilChanged5 = observables.combineLatest(observableFilterIsPresent, ObservablesKt.filterIsPresent(map6)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardFragment.onStart$lambda$12(this.f$0, (Tuples2) obj);
            }
        });
        Observable<R> map7 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$onStart$$inlined$mapNotNull$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonStandardViewState) it).getShowCryptoLearnAndEarnOnboardingEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonStandardFragment$onStart$$inlined$mapNotNull$7<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map7, "map(...)");
        Observable observableDistinctUntilChanged6 = ObservablesKt.filterIsPresent(map7).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged6), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardFragment.onStart$lambda$15(this.f$0, (UiEvent) obj);
            }
        });
    }

    /* compiled from: EducationLessonStandardFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$onStart$1 */
    /* synthetic */ class C388811 extends FunctionReferenceImpl implements Function1<DayNightOverlay, Unit> {
        C388811(Object obj) {
            super(1, obj, EducationLessonStandardDuxo.class, "updateDayNightOverlay", "updateDayNightOverlay(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DayNightOverlay dayNightOverlay) {
            invoke2(dayNightOverlay);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DayNightOverlay p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationLessonStandardDuxo) this.receiver).updateDayNightOverlay(p0);
        }
    }

    /* compiled from: EducationLessonStandardFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$onStart$2 */
    /* synthetic */ class C388822 extends FunctionReferenceImpl implements Function1<EducationLessonStandardViewState, Unit> {
        C388822(Object obj) {
            super(1, obj, EducationLessonStandardFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EducationLessonStandardViewState educationLessonStandardViewState) {
            invoke2(educationLessonStandardViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EducationLessonStandardViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationLessonStandardFragment) this.receiver).bindViewState(p0);
        }
    }

    /* compiled from: EducationLessonStandardFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$onStart$4 */
    /* synthetic */ class C388834 extends FunctionReferenceImpl implements Function1<List<? extends EducationLessonSection>, Unit> {
        C388834(Object obj) {
            super(1, obj, EducationLessonStandardFragment.class, "bindSectionItems", "bindSectionItems(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends EducationLessonSection> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends EducationLessonSection> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationLessonStandardFragment) this.receiver).bindSectionItems(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(EducationLessonStandardFragment educationLessonStandardFragment, LearningLesson learningLesson) {
        educationLessonStandardFragment.sectionAdapter.setLearningLesson(learningLesson);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(EducationLessonStandardFragment educationLessonStandardFragment, CryptoLearnAndEarnLoggingData cryptoLearnAndEarnLoggingData) {
        educationLessonStandardFragment.modifiedEventContext = cryptoLearnAndEarnLoggingData.getEventContext();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(EducationLessonStandardFragment educationLessonStandardFragment, String str) {
        EducationLessonStandardDuxo duxo = educationLessonStandardFragment.getDuxo();
        Intrinsics.checkNotNull(str);
        duxo.setLessonStarted(str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$12(EducationLessonStandardFragment educationLessonStandardFragment, Tuples2 tuples2) {
        educationLessonStandardFragment.getDuxo().updateLessonProgress((String) tuples2.component1(), ((Number) tuples2.component2()).intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$15(EducationLessonStandardFragment educationLessonStandardFragment, UiEvent uiEvent) {
        CryptoLearnAndEarnLoggingData cryptoLearnAndEarnLoggingData = (CryptoLearnAndEarnLoggingData) uiEvent.consume();
        if (cryptoLearnAndEarnLoggingData != null) {
            Navigator navigator = educationLessonStandardFragment.getNavigator();
            android.content.Context contextRequireContext = educationLessonStandardFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.CryptoLearnAndEarnOnboarding(cryptoLearnAndEarnLoggingData), null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Observable<EducationLessonStandardViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardFragment.onBackPressed$lambda$17(this.f$0, (EducationLessonStandardViewState) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackPressed$lambda$17(EducationLessonStandardFragment educationLessonStandardFragment, EducationLessonStandardViewState educationLessonStandardViewState) {
        Context eventContext;
        if (!educationLessonStandardFragment.dismissingByButtonTap) {
            EventLogger eventLogger = educationLessonStandardFragment.getEventLogger();
            Screen eventScreen = educationLessonStandardFragment.getEventScreen();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
            Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
            CryptoLearnAndEarnLoggingData learnAndEarnLoggingData = educationLessonStandardViewState.getLearnAndEarnLoggingData();
            if (learnAndEarnLoggingData == null || (eventContext = learnAndEarnLoggingData.getEventContext()) == null) {
                eventContext = educationLessonStandardViewState.getEventContext();
            }
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, component, null, eventContext, false, 40, null);
        }
        String exitSurveyEvent = educationLessonStandardViewState.getExitSurveyEvent();
        if (exitSurveyEvent != null) {
            SurveyManager.DefaultImpls.setPendingSurvey$default(educationLessonStandardFragment.getUserLeapManager(), exitSurveyEvent, null, 2, null);
        }
        educationLessonStandardFragment.dismissingByButtonTap = false;
        educationLessonStandardFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
    public void onCompositionLoaded(LottieComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        getDuxo().updateLottieCompositionInfo(composition.getDurationFrames());
    }

    @Override // com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardHeaderParentView.HeaderParentCallbacks
    public void onHeaderBackBtnPressed() {
        this.dismissingByButtonTap = true;
        onBackPressed();
    }

    @Override // com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterParentView.FooterParentCallbacks
    public void onBackButtonClicked() {
        getDuxo().previousSection();
    }

    @Override // com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterParentView.FooterParentCallbacks
    public void onNextButtonClicked() {
        getDuxo().nextSection();
    }

    @Override // com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterCtaView.FooterCtaCallbacks
    public void onDismissAction() {
        this.dismissingByButtonTap = true;
        onBackPressed();
    }

    @Override // com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterCtaView.FooterCtaCallbacks
    public void onFinishWithResultAction() {
        Observable<EducationLessonStandardViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardFragment.onFinishWithResultAction$lambda$19(this.f$0, (EducationLessonStandardViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishWithResultAction$lambda$19(EducationLessonStandardFragment educationLessonStandardFragment, EducationLessonStandardViewState educationLessonStandardViewState) {
        String exitSurveyEvent = educationLessonStandardViewState.getExitSurveyEvent();
        if (exitSurveyEvent != null) {
            SurveyManager.DefaultImpls.setPendingSurvey$default(educationLessonStandardFragment.getUserLeapManager(), exitSurveyEvent, null, 2, null);
        }
        educationLessonStandardFragment.requireActivity().setResult(educationLessonStandardViewState.getIsOnCompletionPage() ? -1 : 0);
        educationLessonStandardFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C38790R.id.dialog_education_reward_unavailable_rhc_required) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(null, "no-rhc-account-review-agreement", null, 5, null), null, this.modifiedEventContext, false, 41, null);
            ActivityResultLauncher<Intent> activityResultLauncher = this.cryptoUpgradeLauncher;
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new CryptoUpgradeIntentKey(false, "CRYPTO_LEARN_AND_EARN"), null, false, 12, null));
            return true;
        }
        if (id == C38790R.id.dialog_education_reward_no_ira) {
            Navigator navigator2 = getNavigator();
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new RetirementSignUp(null, null, false, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, false, null, null, 60, null);
            return true;
        }
        if (id == C38790R.id.dialog_education_reward_slip_no_eligible) {
            android.content.Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            SlipHub2.navigateToSlipHub(this, contextRequireContext3, getNavigator(), SlipHub2.SLIP_LEARN_AND_EARN_NOT_ELIGIBLE);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C38790R.id.dialog_education_reward_unavailable_rhc_required) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(null, "no-rhc-account-continue", null, 5, null), null, this.modifiedEventContext, false, 41, null);
        }
        if (id == C38790R.id.dialog_education_reward_slip_no_eligible) {
            requireActivity().finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(EducationLessonStandardViewState state) {
        if (state.getShouldMarkAsComplete() && state.getTrackingId() != null) {
            getDuxo().setLessonCompletion(state.getTrackingId(), true);
        }
        if (state.getShowLesson()) {
            getDuxo().logLessonLoaded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindSectionItems(List<? extends EducationLessonSection> items) {
        this.sectionAdapter.submitList(items);
    }

    /* compiled from: EducationLessonStandardFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFragment;", "Lcom/robinhood/shared/models/contract/EducationLessonStandardFragmentKey;", "<init>", "()V", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EducationLessonStandardFragment, EducationLessonFragmentKeys2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EducationLessonFragmentKeys2 educationLessonFragmentKeys2) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, educationLessonFragmentKeys2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EducationLessonFragmentKeys2 getArgs(EducationLessonStandardFragment educationLessonStandardFragment) {
            return (EducationLessonFragmentKeys2) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, educationLessonStandardFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EducationLessonStandardFragment newInstance(EducationLessonFragmentKeys2 educationLessonFragmentKeys2) {
            return (EducationLessonStandardFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, educationLessonFragmentKeys2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EducationLessonStandardFragment educationLessonStandardFragment, EducationLessonFragmentKeys2 educationLessonFragmentKeys2) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, educationLessonStandardFragment, educationLessonFragmentKeys2);
        }
    }
}
