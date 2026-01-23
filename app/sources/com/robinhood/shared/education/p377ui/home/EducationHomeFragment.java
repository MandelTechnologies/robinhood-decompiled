package com.robinhood.shared.education.p377ui.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EducationHome;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.education.EducationLessonPreviews;
import com.robinhood.shared.education.p377ui.home.EducationHomeFragment;
import com.robinhood.shared.education.p377ui.home.EducationHomeViewState;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSource;
import com.robinhood.userleap.SurveyManager;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: EducationHomeFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020*H\u0016J\r\u0010.\u001a\u00020*H\u0017¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020&H\u0016J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u000203H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00067²\u0006\n\u00108\u001a\u000209X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/home/EducationHomeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/education/ui/home/EducationHomeDuxo;", "getDuxo", "()Lcom/robinhood/shared/education/ui/home/EducationHomeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "eventEducationHome", "Lcom/robinhood/rosetta/eventlogging/EducationHome;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "onLessonCardClick", "lessonPreview", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "navigateToLesson", "lesson", "Companion", "feature-education_externalDebug", "state", "Lcom/robinhood/shared/education/ui/home/EducationHomeViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationHomeFragment extends GenericComposeFragment implements AutoLoggableFragment {
    private EducationHome eventEducationHome;
    public EventLogger eventLogger;
    public SurveyManager3 userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, EducationHomeDuxo.class);
    private final Screen eventScreen = new Screen(Screen.Name.EDUCATION_HOME, null, null, null, 14, null);
    private final String screenName = getEventScreen().getName().name();
    private final boolean useDesignSystemToolbar = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(EducationHomeFragment educationHomeFragment, int i, Composer composer, int i2) {
        educationHomeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final EducationHomeDuxo getDuxo() {
        return (EducationHomeDuxo) this.duxo.getValue();
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.eventEducationHome, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -257, -1, -1, -1, -1, 16383, null), null, null, 109, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationHomeViewState ComposeContent$lambda$0(SnapshotState4<EducationHomeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(contextRequireContext).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C388291(getDuxo()));
        Observable<EducationHomeViewState> states = getDuxo().getStates();
        final C388302 c388302 = new PropertyReference1Impl() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragment.onStart.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((EducationHomeViewState) obj).getLessons();
            }
        };
        Observable observableDistinctUntilChanged = states.map(new Function(c388302) { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c388302, "function");
                this.function = c388302;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C388313(getDuxo()));
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragment$onStart$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationHomeViewState) it).getLessonsTrackingIds());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationHomeFragment$onStart$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C388325(getDuxo()));
    }

    /* compiled from: EducationHomeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.home.EducationHomeFragment$onStart$1 */
    /* synthetic */ class C388291 extends FunctionReferenceImpl implements Function1<DayNightOverlay, Unit> {
        C388291(Object obj) {
            super(1, obj, EducationHomeDuxo.class, "updateDayNightOverlay", "updateDayNightOverlay(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DayNightOverlay dayNightOverlay) {
            invoke2(dayNightOverlay);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DayNightOverlay p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationHomeDuxo) this.receiver).updateDayNightOverlay(p0);
        }
    }

    /* compiled from: EducationHomeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.home.EducationHomeFragment$onStart$3 */
    /* synthetic */ class C388313 extends FunctionReferenceImpl implements Function1<List<? extends EducationLessonPreview>, Unit> {
        C388313(Object obj) {
            super(1, obj, EducationHomeDuxo.class, "markEducationLessonsAppeared", "markEducationLessonsAppeared(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends EducationLessonPreview> list) {
            invoke2((List<EducationLessonPreview>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<EducationLessonPreview> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationHomeDuxo) this.receiver).markEducationLessonsAppeared(p0);
        }
    }

    /* compiled from: EducationHomeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.home.EducationHomeFragment$onStart$5 */
    /* synthetic */ class C388325 extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
        C388325(Object obj) {
            super(1, obj, EducationHomeDuxo.class, "loadUserProgress", "loadUserProgress(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationHomeDuxo) this.receiver).loadUserProgress(p0);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1771739068);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1771739068, i2, -1, "com.robinhood.shared.education.ui.home.EducationHomeFragment.ComposeContent (EducationHomeFragment.kt:119)");
            }
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new EducationHomeViewState(null, null, null, false, 15, null), composerStartRestartGroup, 0);
            this.eventEducationHome = new EducationHome(ComposeContent$lambda$0(snapshotState4SubscribeAsState).getEducationHomeIdentifier(), ComposeContent$lambda$0(snapshotState4SubscribeAsState).getTitle(), ((LegacyFragmentKey.EducationHome) INSTANCE.getArgs((Fragment) this)).getSource(), null, 8, null);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.eventEducationHome, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -257, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1547813521, true, new C388281(snapshotState4SubscribeAsState), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationHomeFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: EducationHomeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.education.ui.home.EducationHomeFragment$ComposeContent$1 */
    static final class C388281 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<EducationHomeViewState> $state$delegate;

        C388281(SnapshotState4<EducationHomeViewState> snapshotState4) {
            this.$state$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1547813521, i, -1, "com.robinhood.shared.education.ui.home.EducationHomeFragment.ComposeContent.<anonymous> (EducationHomeFragment.kt:134)");
            }
            EducationHomeViewState.Status status = EducationHomeFragment.ComposeContent$lambda$0(this.$state$delegate).getStatus();
            if (status instanceof EducationHomeViewState.Status.Loading) {
                composer.startReplaceGroup(-1390105898);
                final EducationHomeFragment educationHomeFragment = EducationHomeFragment.this;
                LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(2127259495, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragment.ComposeContent.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2127259495, i2, -1, "com.robinhood.shared.education.ui.home.EducationHomeFragment.ComposeContent.<anonymous>.<anonymous> (EducationHomeFragment.kt:136)");
                        }
                        EducationHomeViewState loadingMock$feature_education_externalDebug = EducationHomeViewState.INSTANCE.getLoadingMock$feature_education_externalDebug();
                        EducationHomeFragment educationHomeFragment2 = educationHomeFragment;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(educationHomeFragment2);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new EducationHomeFragment$ComposeContent$1$1$1$1(educationHomeFragment2);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                        EducationHomeFragment educationHomeFragment3 = educationHomeFragment;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(educationHomeFragment3);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new EducationHomeFragment$ComposeContent$1$1$2$1(educationHomeFragment3);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EducationHomeFragmentKt.HomeContent(loadingMock$feature_education_externalDebug, function1, (Function0) objRememberedValue2, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 3078, 6);
                composer.endReplaceGroup();
            } else if (status instanceof EducationHomeViewState.Status.Failure) {
                composer.startReplaceGroup(-1390094612);
                EducationHomeFragment educationHomeFragment2 = EducationHomeFragment.this;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(educationHomeFragment2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new EducationHomeFragment$ComposeContent$1$2$1(educationHomeFragment2);
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(EducationHomeFragment.this);
                final EducationHomeFragment educationHomeFragment3 = EducationHomeFragment.this;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragment$ComposeContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EducationHomeFragment.C388281.invoke$lambda$2$lambda$1(educationHomeFragment3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                EducationHomeFragmentKt.ErrorScreen(function0, (Function0) objRememberedValue2, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (!(status instanceof EducationHomeViewState.Status.Success)) {
                    composer.startReplaceGroup(-1390107962);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1390087578);
                EducationHomeViewState educationHomeViewStateComposeContent$lambda$0 = EducationHomeFragment.ComposeContent$lambda$0(this.$state$delegate);
                EducationHomeFragment educationHomeFragment4 = EducationHomeFragment.this;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(educationHomeFragment4);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new EducationHomeFragment$ComposeContent$1$4$1(educationHomeFragment4);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                Function1 function1 = (Function1) ((KFunction) objRememberedValue3);
                EducationHomeFragment educationHomeFragment5 = EducationHomeFragment.this;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composer.changedInstance(educationHomeFragment5);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new EducationHomeFragment$ComposeContent$1$5$1(educationHomeFragment5);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                EducationHomeFragmentKt.HomeContent(educationHomeViewStateComposeContent$lambda$0, function1, (Function0) objRememberedValue4, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(EducationHomeFragment educationHomeFragment) {
            educationHomeFragment.getDuxo().refresh(true);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.BACK, getEventScreen(), new Component(Component.ComponentType.BACK_BUTTON, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.eventEducationHome, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -257, -1, -1, -1, -1, 16383, null), false, 40, null);
        Observable<EducationHomeViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationHomeFragment.onBackPressed$lambda$3(this.f$0, (EducationHomeViewState) obj);
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackPressed$lambda$3(EducationHomeFragment educationHomeFragment, EducationHomeViewState educationHomeViewState) {
        String exitSurveyEvent = educationHomeViewState.getExitSurveyEvent();
        if (exitSurveyEvent != null) {
            SurveyManager.DefaultImpls.setPendingSurvey$default(educationHomeFragment.getUserLeapManager(), exitSurveyEvent, null, 2, null);
        }
        educationHomeFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLessonCardClick(EducationLessonPreview lessonPreview) {
        navigateToLesson(lessonPreview);
        getDuxo().setHasViewedLesson(true);
    }

    private final void navigateToLesson(EducationLessonPreview lesson) {
        FragmentKey fragmentKeyOrNull = EducationLessonPreviews.toFragmentKeyOrNull(lesson, EducationSource.EDUCATION_SOURCE_EDUCATION_HOME);
        if (fragmentKeyOrNull != null) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, fragmentKeyOrNull, false, false, false, null, false, null, false, false, null, null, 4084, null);
        }
    }

    /* compiled from: EducationHomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/home/EducationHomeFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/education/ui/home/EducationHomeFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EducationHome;", "<init>", "()V", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EducationHomeFragment, LegacyFragmentKey.EducationHome> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.EducationHome educationHome) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, educationHome);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.EducationHome getArgs(EducationHomeFragment educationHomeFragment) {
            return (LegacyFragmentKey.EducationHome) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, educationHomeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EducationHomeFragment newInstance(LegacyFragmentKey.EducationHome educationHome) {
            return (EducationHomeFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, educationHome);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EducationHomeFragment educationHomeFragment, LegacyFragmentKey.EducationHome educationHome) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, educationHomeFragment, educationHome);
        }
    }
}
