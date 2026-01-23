package com.robinhood.shared.education.p377ui.lessons.cardstack;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.education.CryptoLearnAndEarnLoggingData;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.FragmentEducationLessonCardStackBinding;
import com.robinhood.shared.education.p377ui.lessons.cardstack.EducationLessonCardStackFragment;
import com.robinhood.shared.education.p377ui.lessons.cardstack.EducationLessonCardStackViewState;
import com.robinhood.shared.education.p377ui.quiz.EducationQuizView;
import com.robinhood.shared.education.p377ui.rewards.EducationRewardComposable;
import com.robinhood.shared.education.util.RdsButtons2;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationQuizAnswer;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: EducationLessonCardStackFragment.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 c2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001cB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020DH\u0016J\u001a\u0010E\u001a\u00020?2\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020?H\u0016J\b\u0010K\u001a\u00020:H\u0016J\u0010\u0010L\u001a\u00020?2\u0006\u0010M\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020?2\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010R\u001a\u00020?2\u0006\u0010P\u001a\u00020QH\u0002J\u0018\u0010S\u001a\u00020?2\u0006\u0010T\u001a\u00020Q2\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u00020?2\u0006\u0010X\u001a\u00020<H\u0002J\b\u0010Y\u001a\u00020?H\u0002J\b\u0010Z\u001a\u00020?H\u0002J\b\u0010[\u001a\u00020?H\u0002J\b\u0010\\\u001a\u00020?H\u0002J\b\u0010]\u001a\u00020:H\u0002J\u0012\u0010^\u001a\u00020?2\b\b\u0001\u0010_\u001a\u00020<H\u0002J\u0012\u0010`\u001a\u00020?2\b\u0010a\u001a\u0004\u0018\u00010bH\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010(R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000R\u0016\u00103\u001a\n\u0018\u000104j\u0004\u0018\u0001`5X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\n\u0018\u000104j\u0004\u0018\u0001`5X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/shared/education/ui/quiz/EducationQuizView$Callbacks;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "<init>", "()V", "binding", "Lcom/robinhood/shared/education/databinding/FragmentEducationLessonCardStackBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/FragmentEducationLessonCardStackBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackDuxo;", "getDuxo", "()Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenName", "getScreenName", "sectionAdapter", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackAdapter;", "sectionLayoutManager", "Lcom/robinhood/shared/education/ui/lessons/cardstack/CardStackLayoutManager;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "modifiedEventContext", "learnAndEarnLoggingData", "Lcom/robinhood/education/CryptoLearnAndEarnLoggingData;", "initialCardStackAnimationCompleted", "", "previousTopPosition", "", "isTopCardAnimating", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onBackPressed", "onQuizAnswerTap", "answer", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationQuizAnswer;", "bindViewState", "state", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState;", "bindCompletion", "bindReward", "viewState", "rewardState", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState$ShowRewardState;", "handleTopCardPosition", "position", "animateShowCards", "animateShowNextButton", "animateHideNextButton", "animateShowCompletionCtaButtons", "preventViewAccess", "updateBackgroundColor", "backgroundColor", "updateBackgroundImage", "assetUrl", "Lokhttp3/HttpUrl;", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationLessonCardStackFragment extends BaseFragment implements AutoLoggableFragment, EducationQuizView.Callbacks, UiCallbacks.ScreenViewAnalyticable {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private Context eventContext;
    public EventLogger eventLogger;
    public ImageLoader imageLoader;
    private boolean initialCardStackAnimationCompleted;
    private boolean isTopCardAnimating;
    private CryptoLearnAndEarnLoggingData learnAndEarnLoggingData;
    public Markwon markwon;
    private Context modifiedEventContext;
    private int previousTopPosition;
    private final EducationLessonCardStackAdapter sectionAdapter;
    private CardStackLayoutManager sectionLayoutManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationLessonCardStackFragment.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/FragmentEducationLessonCardStackBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

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

    public EducationLessonCardStackFragment() {
        super(C38790R.layout.fragment_education_lesson_card_stack);
        this.binding = ViewBinding5.viewBinding(this, EducationLessonCardStackFragment4.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, EducationLessonCardStackDuxo.class);
        this.sectionAdapter = new EducationLessonCardStackAdapter(this);
        this.previousTopPosition = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentEducationLessonCardStackBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEducationLessonCardStackBinding) value;
    }

    private final EducationLessonCardStackDuxo getDuxo() {
        return (EducationLessonCardStackDuxo) this.duxo.getValue();
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return ((EducationLessonFragmentKeys) INSTANCE.getArgs((Fragment) this)).getSource();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.LEARNING_LESSON_V3, getProfileId(), null, null, 12, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return getEventScreen().getName().name();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.getToolbar().setNavigationIcon(C20690R.drawable.ic_rds_close_24dp);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentEducationLessonCardStackBinding binding = getBinding();
        FrameLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetSides.Companion companion = InsetSides.INSTANCE;
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, companion.m26679getBottomXedK2Rk());
        ConstraintLayout educationLessonCardStackContent = binding.educationLessonCardStackContent;
        Intrinsics.checkNotNullExpressionValue(educationLessonCardStackContent, "educationLessonCardStackContent");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(educationLessonCardStackContent, companion.m26679getBottomXedK2Rk());
        ConstraintLayout educationLessonCardStackCompletionSection = binding.educationLessonCardStackCompletionSection;
        Intrinsics.checkNotNullExpressionValue(educationLessonCardStackCompletionSection, "educationLessonCardStackCompletionSection");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(educationLessonCardStackCompletionSection, companion.m26679getBottomXedK2Rk());
        binding.cardStackRecyclerView.setAdapter(this.sectionAdapter);
        CardStackLayoutManager cardStackLayoutManager = new CardStackLayoutManager(getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_default));
        this.sectionLayoutManager = cardStackLayoutManager;
        binding.cardStackRecyclerView.setLayoutManager(cardStackLayoutManager);
        CardStackLayoutManager cardStackLayoutManager2 = this.sectionLayoutManager;
        if (cardStackLayoutManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sectionLayoutManager");
            cardStackLayoutManager2 = null;
        }
        Observable<Integer> topItemPositionObservable = cardStackLayoutManager2.getTopItemPositionObservable();
        Intrinsics.checkNotNullExpressionValue(topItemPositionObservable, "<get-topItemPositionObservable>(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(topItemPositionObservable), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackFragment.onViewCreated$lambda$5$lambda$1(this.f$0, (Integer) obj);
            }
        });
        RdsIconButton footerNextButton = binding.footerNextButton;
        Intrinsics.checkNotNullExpressionValue(footerNextButton, "footerNextButton");
        OnClickListeners.onClick(footerNextButton, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonCardStackFragment.onViewCreated$lambda$5$lambda$2(this.f$0);
            }
        });
        RdsIconButton footerNextButton2 = binding.footerNextButton;
        Intrinsics.checkNotNullExpressionValue(footerNextButton2, "footerNextButton");
        ViewsKt.setLoggingConfig(footerNextButton2, new AutoLoggingConfig(false, false, 1, null));
        RdsIconButton footerNextButton3 = binding.footerNextButton;
        Intrinsics.checkNotNullExpressionValue(footerNextButton3, "footerNextButton");
        ViewsKt.eventData$default(footerNextButton3, false, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonCardStackFragment.onViewCreated$lambda$5$lambda$3(this.f$0);
            }
        }, 1, null);
        RdsButton primaryCtaButton = binding.primaryCtaButton;
        Intrinsics.checkNotNullExpressionValue(primaryCtaButton, "primaryCtaButton");
        ViewsKt.setLoggingConfig(primaryCtaButton, new AutoLoggingConfig(false, false));
        RdsButton secondaryCtaButton = binding.secondaryCtaButton;
        Intrinsics.checkNotNullExpressionValue(secondaryCtaButton, "secondaryCtaButton");
        ViewsKt.setLoggingConfig(secondaryCtaButton, new AutoLoggingConfig(false, false));
        binding.errorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonCardStackFragment.onViewCreated$lambda$5$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$1(EducationLessonCardStackFragment educationLessonCardStackFragment, Integer num) {
        Intrinsics.checkNotNull(num);
        educationLessonCardStackFragment.handleTopCardPosition(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$2(EducationLessonCardStackFragment educationLessonCardStackFragment) {
        educationLessonCardStackFragment.getDuxo().nextSection();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$5$lambda$3(EducationLessonCardStackFragment educationLessonCardStackFragment) {
        Component component = new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
        Context context = educationLessonCardStackFragment.modifiedEventContext;
        if (context == null) {
            context = educationLessonCardStackFragment.eventContext;
        }
        return new UserInteractionEventDescriptor(null, null, action, context, component, null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(EducationLessonCardStackFragment educationLessonCardStackFragment) {
        educationLessonCardStackFragment.getDuxo().refresh(true);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(contextRequireContext).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C388561(getDuxo()));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C388572(this));
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonCardStackViewState) it).getBackgroundColor());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C388584(this));
        Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonCardStackViewState) it).getBackgroundImageUrl());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C388596(this));
        Observable<R> map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonCardStackViewState) it).getEventContext());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$3<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackFragment.onStart$lambda$8(this.f$0, (Context) obj);
            }
        });
        Observable<R> map4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonCardStackViewState) it).getLearnAndEarnLoggingData());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$4<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableDistinctUntilChanged4 = ObservablesKt.filterIsPresent(map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackFragment.onStart$lambda$10(this.f$0, (CryptoLearnAndEarnLoggingData) obj);
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable<R> map5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonCardStackViewState) it).getTrackingId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$5<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(map5);
        Observable<R> map6 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EducationLessonCardStackViewState) it).getPercentComplete());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EducationLessonCardStackFragment$onStart$$inlined$mapNotNull$6<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        Observable observableDistinctUntilChanged5 = observables.combineLatest(observableFilterIsPresent, ObservablesKt.filterIsPresent(map6)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackFragment.onStart$lambda$13(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* compiled from: EducationLessonCardStackFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$onStart$1 */
    /* synthetic */ class C388561 extends FunctionReferenceImpl implements Function1<DayNightOverlay, Unit> {
        C388561(Object obj) {
            super(1, obj, EducationLessonCardStackDuxo.class, "updateDayNightOverlay", "updateDayNightOverlay(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DayNightOverlay dayNightOverlay) {
            invoke2(dayNightOverlay);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DayNightOverlay p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationLessonCardStackDuxo) this.receiver).updateDayNightOverlay(p0);
        }
    }

    /* compiled from: EducationLessonCardStackFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$onStart$2 */
    /* synthetic */ class C388572 extends FunctionReferenceImpl implements Function1<EducationLessonCardStackViewState, Unit> {
        C388572(Object obj) {
            super(1, obj, EducationLessonCardStackFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EducationLessonCardStackViewState educationLessonCardStackViewState) throws Resources.NotFoundException {
            invoke2(educationLessonCardStackViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EducationLessonCardStackViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationLessonCardStackFragment) this.receiver).bindViewState(p0);
        }
    }

    /* compiled from: EducationLessonCardStackFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$onStart$4 */
    /* synthetic */ class C388584 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        C388584(Object obj) {
            super(1, obj, EducationLessonCardStackFragment.class, "updateBackgroundColor", "updateBackgroundColor(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((EducationLessonCardStackFragment) this.receiver).updateBackgroundColor(i);
        }
    }

    /* compiled from: EducationLessonCardStackFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$onStart$6 */
    /* synthetic */ class C388596 extends FunctionReferenceImpl implements Function1<HttpUrl, Unit> {
        C388596(Object obj) {
            super(1, obj, EducationLessonCardStackFragment.class, "updateBackgroundImage", "updateBackgroundImage(Lokhttp3/HttpUrl;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HttpUrl httpUrl) {
            invoke2(httpUrl);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HttpUrl httpUrl) {
            ((EducationLessonCardStackFragment) this.receiver).updateBackgroundImage(httpUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$8(EducationLessonCardStackFragment educationLessonCardStackFragment, Context context) {
        educationLessonCardStackFragment.eventContext = context;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$10(EducationLessonCardStackFragment educationLessonCardStackFragment, CryptoLearnAndEarnLoggingData cryptoLearnAndEarnLoggingData) {
        educationLessonCardStackFragment.learnAndEarnLoggingData = cryptoLearnAndEarnLoggingData;
        educationLessonCardStackFragment.modifiedEventContext = cryptoLearnAndEarnLoggingData.getEventContext();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$13(EducationLessonCardStackFragment educationLessonCardStackFragment, Tuples2 tuples2) {
        educationLessonCardStackFragment.getDuxo().updateLessonProgress((String) tuples2.component1(), ((Number) tuples2.component2()).intValue());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        EventLogger eventLogger = getEventLogger();
        Screen eventScreen = getEventScreen();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        Context context = this.modifiedEventContext;
        if (context == null) {
            context = this.eventContext;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, component, null, context, false, 40, null);
        return super.onBackPressed();
    }

    @Override // com.robinhood.shared.education.ui.quiz.EducationQuizView.Callbacks
    public void onQuizAnswerTap(EducationQuizAnswer answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        getDuxo().updateQuizAnswers(answer);
        animateShowNextButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(EducationLessonCardStackViewState state) throws Resources.NotFoundException {
        Toolbar toolbar;
        Drawable navigationIcon;
        Toolbar toolbar2;
        FragmentEducationLessonCardStackBinding binding = getBinding();
        Integer foregroundColor = state.getForegroundColor();
        if (foregroundColor != null) {
            int iIntValue = foregroundColor.intValue();
            RhToolbar rhToolbar = getRhToolbar();
            if (rhToolbar != null && (toolbar2 = rhToolbar.getToolbar()) != null) {
                ScarletManager2.overrideAttribute(toolbar2, R$attr.colorControlNormal, ResourceValue.INSTANCE.getEMPTY());
            }
            RhToolbar rhToolbar2 = getRhToolbar();
            if (rhToolbar2 != null && (toolbar = rhToolbar2.getToolbar()) != null && (navigationIcon = toolbar.getNavigationIcon()) != null) {
                navigationIcon.setTint(iIntValue);
            }
            binding.completionTitle.setTextColor(iIntValue);
            binding.completionMessage.setTextColor(iIntValue);
        }
        ShimmerLoadingView loadingView = binding.loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.getShowLoading() ? 0 : 8);
        ErrorView errorView = binding.errorView;
        Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
        errorView.setVisibility(state.getShowError() ? 0 : 8);
        binding.cardStackRecyclerView.smoothScrollToPosition(state.getSectionPosition());
        EducationLessonCardStackViewState.LessonCompletionState lessonCompletionState = state.getLessonCompletionState();
        if (Intrinsics.areEqual(lessonCompletionState, EducationLessonCardStackViewState.LessonCompletionState.NotComplete.INSTANCE)) {
            ConstraintLayout educationLessonCardStackCompletionSection = binding.educationLessonCardStackCompletionSection;
            Intrinsics.checkNotNullExpressionValue(educationLessonCardStackCompletionSection, "educationLessonCardStackCompletionSection");
            educationLessonCardStackCompletionSection.setVisibility(8);
            ComposeView educationLessonCardStackRewardSection = binding.educationLessonCardStackRewardSection;
            Intrinsics.checkNotNullExpressionValue(educationLessonCardStackRewardSection, "educationLessonCardStackRewardSection");
            educationLessonCardStackRewardSection.setVisibility(8);
        } else if (Intrinsics.areEqual(lessonCompletionState, EducationLessonCardStackViewState.LessonCompletionState.ShowFinalSection.INSTANCE)) {
            bindCompletion(state);
        } else if (lessonCompletionState instanceof EducationLessonCardStackViewState.LessonCompletionState.TryRewardClaim) {
            UiEvent<Unit> claimEvent = ((EducationLessonCardStackViewState.LessonCompletionState.TryRewardClaim) lessonCompletionState).getClaimEvent();
            if ((claimEvent != null ? claimEvent.consume() : null) != null) {
                getDuxo().claimLessonReward();
            }
        } else {
            if (!(lessonCompletionState instanceof EducationLessonCardStackViewState.LessonCompletionState.ShowRewardState)) {
                throw new NoWhenBranchMatchedException();
            }
            bindReward(state, (EducationLessonCardStackViewState.LessonCompletionState.ShowRewardState) lessonCompletionState);
        }
        if (!state.getLessonSectionItems().isEmpty()) {
            this.sectionAdapter.submitList(state.getLessonSectionItems());
        }
        UiEvent<Unit> showNextButtonEvent = state.getShowNextButtonEvent();
        if ((showNextButtonEvent != null ? showNextButtonEvent.consume() : null) != null) {
            animateShowNextButton();
        }
        UiEvent<Unit> hideNextButtonEvent = state.getHideNextButtonEvent();
        if ((hideNextButtonEvent != null ? hideNextButtonEvent.consume() : null) != null) {
            animateHideNextButton();
        }
    }

    private final void bindCompletion(EducationLessonCardStackViewState state) throws Resources.NotFoundException {
        Toolbar toolbar;
        EducationLessonSection.Info completionSection = state.getCompletionSection();
        if (completionSection == null) {
            return;
        }
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null && (toolbar = rhToolbar.getToolbar()) != null) {
            toolbar.setNavigationIcon((Drawable) null);
        }
        final FragmentEducationLessonCardStackBinding binding = getBinding();
        binding.completionTitle.setText(completionSection.getHeader());
        binding.completionMessage.setText(Markwons.toSpanned$default(getMarkwon(), completionSection.getContent(), null, 2, null));
        RdsButton primaryCtaButton = binding.primaryCtaButton;
        Intrinsics.checkNotNullExpressionValue(primaryCtaButton, "primaryCtaButton");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RdsButtons2.bindLessonCta(primaryCtaButton, contextRequireContext, state.getPrimaryCta(), null, null, getNavigator(), state.getEventLearningLesson(), state.getSectionPosition() + 1, state.getLessonSectionItems().size(), new Function0() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonCardStackFragment.bindCompletion$lambda$21$lambda$16(this.f$0);
            }
        }, (1536 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: INVOKE 
              (r7v0 'primaryCtaButton' com.robinhood.android.designsystem.button.RdsButton)
              (r8v0 'contextRequireContext' android.content.Context)
              (wrap:com.robinhood.shared.models.db.bonfire.education.lesson.EducationLesson$CtaButton:0x0048: INVOKE (r36v0 'state' com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState) VIRTUAL call: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState.getPrimaryCta():com.robinhood.shared.models.db.bonfire.education.lesson.EducationLesson$CtaButton A[MD:():com.robinhood.shared.models.db.bonfire.education.lesson.EducationLesson$CtaButton (m), WRAPPED] (LINE:293))
              (null java.lang.Integer)
              (null java.lang.Integer)
              (wrap:com.robinhood.android.navigation.Navigator:0x004c: INVOKE 
              (r35v0 'this' com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment A[IMMUTABLE_TYPE, THIS])
             VIRTUAL call: com.robinhood.android.common.ui.BaseFragment.getNavigator():com.robinhood.android.navigation.Navigator A[MD:():com.robinhood.android.navigation.Navigator (m), WRAPPED] (LINE:296))
              (wrap:com.robinhood.rosetta.eventlogging.LearningLesson:0x0050: INVOKE (r36v0 'state' com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState) VIRTUAL call: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState.getEventLearningLesson():com.robinhood.rosetta.eventlogging.LearningLesson A[MD:():com.robinhood.rosetta.eventlogging.LearningLesson (m), WRAPPED] (LINE:297))
              (wrap:int:0x0061: ARITH (wrap:int:0x005c: INVOKE (r36v0 'state' com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState) VIRTUAL call: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState.getSectionPosition():int A[MD:():int (m), WRAPPED] (LINE:299)) + (1 int) A[WRAPPED] (LINE:299))
              (wrap:int:0x0058: INVOKE 
              (wrap:java.util.List<com.robinhood.shared.models.db.bonfire.education.lesson.EducationLessonSection>:0x0054: INVOKE (r36v0 'state' com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState) VIRTUAL call: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState.getLessonSectionItems():java.util.List A[MD:():java.util.List<com.robinhood.shared.models.db.bonfire.education.lesson.EducationLessonSection> (m), WRAPPED] (LINE:298))
             INTERFACE call: java.util.List.size():int A[MD:():int (c), WRAPPED] (LINE:298))
              (wrap:kotlin.jvm.functions.Function0:0x0065: CONSTRUCTOR 
              (r35v0 'this' com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
             A[MD:(com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment):void (m), WRAPPED] (LINE:291) call: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$$ExternalSyntheticLambda3.<init>(com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment):void type: CONSTRUCTOR)
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0002: ARITH (1536 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:30) call: com.robinhood.shared.education.util.RdsButtonsKt$$ExternalSyntheticLambda2.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000f: ARITH (1536 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:31) call: com.robinhood.shared.education.util.RdsButtonsKt$$ExternalSyntheticLambda3.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
             STATIC call: com.robinhood.shared.education.util.RdsButtonsKt.bindLessonCta(com.robinhood.android.designsystem.button.RdsButton, android.content.Context, com.robinhood.shared.models.db.bonfire.education.lesson.EducationLesson$CtaButton, java.lang.Integer, java.lang.Integer, com.robinhood.android.navigation.Navigator, com.robinhood.rosetta.eventlogging.LearningLesson, int, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void A[MD:(com.robinhood.android.designsystem.button.RdsButton, android.content.Context, com.robinhood.shared.models.db.bonfire.education.lesson.EducationLesson$CtaButton, java.lang.Integer, java.lang.Integer, com.robinhood.android.navigation.Navigator, com.robinhood.rosetta.eventlogging.LearningLesson, int, int, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:20) in method: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment.bindCompletion(com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState):void, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.education.util.RdsButtonsKt$$ExternalSyntheticLambda2, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 19 more
            */
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.education.p377ui.lessons.cardstack.EducationLessonCardStackFragment.bindCompletion(com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindCompletion$lambda$21$lambda$16(EducationLessonCardStackFragment educationLessonCardStackFragment) {
        educationLessonCardStackFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindCompletion$lambda$21$lambda$17(EducationLessonCardStackFragment educationLessonCardStackFragment) {
        educationLessonCardStackFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    private final void bindReward(final EducationLessonCardStackViewState viewState, final EducationLessonCardStackViewState.LessonCompletionState.ShowRewardState rewardState) {
        Toolbar toolbar;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null && (toolbar = rhToolbar.getToolbar()) != null) {
            toolbar.setNavigationIcon((Drawable) null);
        }
        ConstraintLayout educationLessonCardStackContent = getBinding().educationLessonCardStackContent;
        Intrinsics.checkNotNullExpressionValue(educationLessonCardStackContent, "educationLessonCardStackContent");
        educationLessonCardStackContent.setVisibility(8);
        final EducationLessonCardStackViewState.RewardState rewardState2 = rewardState.getRewardState();
        getBinding().educationLessonCardStackRewardSection.setContent(ComposableLambda3.composableLambdaInstance(-447171010, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment.bindReward.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ScarletManager scarletManager;
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-447171010, i, -1, "com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment.bindReward.<anonymous> (EducationLessonCardStackFragment.kt:363)");
                }
                ScarletContextWrapper scarletContextWrapper = EducationLessonCardStackFragment.this.getScarletContextWrapper();
                if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
                    scarletManager = EducationLessonCardStackFragment.this.getScarletManager();
                }
                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(scarletManager), null, ComposableLambda3.rememberComposableLambda(109023600, true, new AnonymousClass1(rewardState2, EducationLessonCardStackFragment.this, rewardState, viewState), composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* compiled from: EducationLessonCardStackFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$bindReward$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ EducationLessonCardStackViewState.RewardState $rewardData;
                final /* synthetic */ EducationLessonCardStackViewState.LessonCompletionState.ShowRewardState $rewardState;
                final /* synthetic */ EducationLessonCardStackViewState $viewState;
                final /* synthetic */ EducationLessonCardStackFragment this$0;

                AnonymousClass1(EducationLessonCardStackViewState.RewardState rewardState, EducationLessonCardStackFragment educationLessonCardStackFragment, EducationLessonCardStackViewState.LessonCompletionState.ShowRewardState showRewardState, EducationLessonCardStackViewState educationLessonCardStackViewState) {
                    this.$rewardData = rewardState;
                    this.this$0 = educationLessonCardStackFragment;
                    this.$rewardState = showRewardState;
                    this.$viewState = educationLessonCardStackViewState;
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
                        ComposerKt.traceEventStart(109023600, i, -1, "com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment.bindReward.<anonymous>.<anonymous> (EducationLessonCardStackFragment.kt:366)");
                    }
                    StringResource titleText = this.$rewardData.getTitleText();
                    int i2 = StringResource.$stable;
                    String string2 = StringResource2.getString(titleText, composer, i2);
                    String string3 = StringResource2.getString(this.$rewardData.getMessageText(), composer, i2);
                    StringResource infoBannerText = this.$rewardData.getInfoBannerText();
                    composer.startReplaceGroup(1692472347);
                    String string4 = infoBannerText == null ? null : StringResource2.getString(infoBannerText, composer, i2);
                    composer.endReplaceGroup();
                    boolean zIsInfoBannerVisible = this.$rewardData.isInfoBannerVisible();
                    boolean zIsTryAgainButtonVisible = this.$rewardData.isTryAgainButtonVisible();
                    EducationLessonCardStackViewState.RewardState.RewardResultCardState rewardResultCardState = this.$rewardData.getRewardResultCardState();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                    final EducationLessonCardStackFragment educationLessonCardStackFragment = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$bindReward$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EducationLessonCardStackFragment.C388551.AnonymousClass1.invoke$lambda$1$lambda$0(educationLessonCardStackFragment);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composer.changedInstance(this.$rewardState) | composer.changedInstance(this.this$0);
                    final EducationLessonCardStackViewState.LessonCompletionState.ShowRewardState showRewardState = this.$rewardState;
                    final EducationLessonCardStackFragment educationLessonCardStackFragment2 = this.this$0;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$bindReward$1$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EducationLessonCardStackFragment.C388551.AnonymousClass1.invoke$lambda$3$lambda$2(showRewardState, educationLessonCardStackFragment2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function02 = (Function0) objRememberedValue2;
                    composer.endReplaceGroup();
                    Integer foregroundColor = this.$viewState.getForegroundColor();
                    Integer backgroundColor = this.$viewState.getBackgroundColor();
                    boolean zIsDayTheme = this.$viewState.isDayTheme();
                    Component rewardLoggingComponent = this.$rewardData.getRewardLoggingComponent();
                    CryptoLearnAndEarnLoggingData cryptoLearnAndEarnLoggingData = this.this$0.learnAndEarnLoggingData;
                    EducationRewardComposable.EducationRewardComposable(string2, string3, string4, zIsInfoBannerVisible, zIsTryAgainButtonVisible, rewardResultCardState, function0, function02, foregroundColor, backgroundColor, zIsDayTheme, new UserInteractionEventDescriptor(null, null, null, cryptoLearnAndEarnLoggingData != null ? cryptoLearnAndEarnLoggingData.getRewardContext() : null, rewardLoggingComponent, null, 39, null), composer, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(EducationLessonCardStackFragment educationLessonCardStackFragment) {
                    Navigator navigator = educationLessonCardStackFragment.getNavigator();
                    android.content.Context contextRequireContext = educationLessonCardStackFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Companion companion = EducationLessonCardStackFragment.INSTANCE;
                    Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new EducationLessonFragmentKeys(((EducationLessonFragmentKeys) companion.getArgs((Fragment) educationLessonCardStackFragment)).getContentfulId(), ((EducationLessonFragmentKeys) companion.getArgs((Fragment) educationLessonCardStackFragment)).getSource()), false, false, false, null, false, null, false, false, null, null, 4092, null);
                    educationLessonCardStackFragment.requireActivity().finish();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$3$lambda$2(EducationLessonCardStackViewState.LessonCompletionState.ShowRewardState showRewardState, EducationLessonCardStackFragment educationLessonCardStackFragment) {
                    String postDoneButtonDeeplink = showRewardState.getRewardState().getPostDoneButtonDeeplink();
                    Uri uri = postDoneButtonDeeplink != null ? Uri.parse(postDoneButtonDeeplink) : null;
                    if (uri != null) {
                        Navigator navigator = educationLessonCardStackFragment.getNavigator();
                        android.content.Context contextRequireContext = educationLessonCardStackFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, null, null, false, null, 60, null);
                    }
                    educationLessonCardStackFragment.requireActivity().finish();
                    return Unit.INSTANCE;
                }
            }
        }));
        ComposeView educationLessonCardStackRewardSection = getBinding().educationLessonCardStackRewardSection;
        Intrinsics.checkNotNullExpressionValue(educationLessonCardStackRewardSection, "educationLessonCardStackRewardSection");
        educationLessonCardStackRewardSection.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleTopCardPosition(int position) {
        View contentView;
        long j;
        CardStackLayoutManager cardStackLayoutManager = this.sectionLayoutManager;
        if (cardStackLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sectionLayoutManager");
            cardStackLayoutManager = null;
        }
        View viewFindViewByPosition = cardStackLayoutManager.findViewByPosition(position);
        if (position != this.previousTopPosition) {
            if (this.initialCardStackAnimationCompleted) {
                j = 0;
            } else {
                animateShowCards();
                this.initialCardStackAnimationCompleted = true;
                j = 800;
            }
            this.isTopCardAnimating = true;
            CardStackCardView cardStackCardView = viewFindViewByPosition instanceof CardStackCardView ? (CardStackCardView) viewFindViewByPosition : null;
            if (cardStackCardView != null) {
                cardStackCardView.animateContentAppear(j, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EducationLessonCardStackFragment.handleTopCardPosition$lambda$22(this.f$0);
                    }
                });
            }
            if (viewFindViewByPosition != 0) {
                ViewsKt.eventData$default(viewFindViewByPosition, false, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EducationLessonCardStackFragment.handleTopCardPosition$lambda$23(this.f$0);
                    }
                }, 1, null);
            }
            if (viewFindViewByPosition != 0) {
                ViewsKt.logAppear$default(viewFindViewByPosition, null, false, 3, null);
            }
        } else if (!this.isTopCardAnimating) {
            getBinding().cardStackRecyclerView.setAlpha(1.0f);
            CardStackCardView cardStackCardView2 = viewFindViewByPosition instanceof CardStackCardView ? (CardStackCardView) viewFindViewByPosition : null;
            if (cardStackCardView2 != null && (contentView = cardStackCardView2.getContentView()) != null) {
                contentView.setVisibility(0);
            }
        }
        this.previousTopPosition = position;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleTopCardPosition$lambda$22(EducationLessonCardStackFragment educationLessonCardStackFragment) {
        educationLessonCardStackFragment.isTopCardAnimating = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor handleTopCardPosition$lambda$23(EducationLessonCardStackFragment educationLessonCardStackFragment) {
        Component component = new Component(Component.ComponentType.LEARNING_SECTION, null, null, 6, null);
        Context context = educationLessonCardStackFragment.modifiedEventContext;
        if (context == null) {
            context = educationLessonCardStackFragment.eventContext;
        }
        return new UserInteractionEventDescriptor(null, null, null, context, component, null, 39, null);
    }

    private final void animateShowCards() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(800L);
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        addLifecycleAwareUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$animateShowCards$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                CardStackRecyclerView cardStackRecyclerView = this.this$0.getBinding().cardStackRecyclerView;
                Object animatedValue = animator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                cardStackRecyclerView.setScaleX(((Float) animatedValue).floatValue());
                CardStackRecyclerView cardStackRecyclerView2 = this.this$0.getBinding().cardStackRecyclerView;
                Object animatedValue2 = animator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                cardStackRecyclerView2.setScaleY(((Float) animatedValue2).floatValue());
            }
        });
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$animateShowCards$lambda$25$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.this$0.getBinding().cardStackRecyclerView.setScaleX(0.0f);
                this.this$0.getBinding().cardStackRecyclerView.setScaleY(0.0f);
            }
        });
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(150L);
        Intrinsics.checkNotNull(valueAnimatorOfFloat2);
        addLifecycleAwareUpdateListener(valueAnimatorOfFloat2, new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$animateShowCards$2$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                CardStackRecyclerView cardStackRecyclerView = this.this$0.getBinding().cardStackRecyclerView;
                Object animatedValue = animator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                cardStackRecyclerView.setAlpha(((Float) animatedValue).floatValue());
            }
        });
        valueAnimatorOfFloat2.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$animateShowCards$lambda$27$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.this$0.getBinding().cardStackRecyclerView.setAlpha(0.0f);
            }
        });
        valueAnimatorOfFloat2.start();
    }

    private final void animateShowNextButton() {
        if (preventViewAccess()) {
            return;
        }
        RdsIconButton rdsIconButton = getBinding().footerNextButton;
        rdsIconButton.setAlpha(0.0f);
        rdsIconButton.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = rdsIconButton.animate();
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorAnimate, "animate(...)");
        bind(viewPropertyAnimatorAnimate).alpha(1.0f).setDuration(200L).setStartDelay(1000L).start();
        Intrinsics.checkNotNull(rdsIconButton);
        ViewsKt.logAppear$default(rdsIconButton, null, false, 3, null);
    }

    private final void animateHideNextButton() {
        if (preventViewAccess()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = getBinding().footerNextButton.animate();
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorAnimate, "animate(...)");
        bind(viewPropertyAnimatorAnimate).alpha(0.0f).setDuration(200L).setStartDelay(0L).withEndAction(new Runnable() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment.animateHideNextButton.1
            @Override // java.lang.Runnable
            public final void run() {
                if (EducationLessonCardStackFragment.this.preventViewAccess()) {
                    return;
                }
                EducationLessonCardStackFragment.this.getBinding().footerNextButton.setVisibility(4);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateShowCompletionCtaButtons() {
        if (preventViewAccess()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        RdsButton rdsButton = getBinding().primaryCtaButton;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(rdsButton, (Property<RdsButton, Float>) property, 0.0f, 1.0f);
        Intrinsics.checkNotNull(objectAnimatorOfFloat);
        bind(objectAnimatorOfFloat);
        Unit unit = Unit.INSTANCE;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getBinding().secondaryCtaButton, (Property<RdsButton, Float>) property, 0.0f, 1.0f);
        Intrinsics.checkNotNull(objectAnimatorOfFloat2);
        bind(objectAnimatorOfFloat2);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        bind(animatorSet);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean preventViewAccess() {
        return !isVisible() || isRemoving() || isDetached() || !isAdded() || getChildFragmentManager().isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBackgroundColor(int backgroundColor) {
        requireActivity().getWindow().setStatusBarColor(backgroundColor);
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            ScarletManager2.overrideAttribute(rhToolbar, R.attr.backgroundTint, ResourceValue.INSTANCE.getEMPTY());
        }
        RhToolbar rhToolbar2 = getRhToolbar();
        if (rhToolbar2 != null) {
            rhToolbar2.setBackgroundTintList(ColorStateList.valueOf(backgroundColor));
        }
        getBinding().getRoot().setBackgroundColor(backgroundColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBackgroundImage(HttpUrl assetUrl) {
        if (assetUrl != null) {
            ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(assetUrl);
            ImageView cardStackBackgroundImg = getBinding().cardStackBackgroundImg;
            Intrinsics.checkNotNullExpressionValue(cardStackBackgroundImg, "cardStackBackgroundImg");
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, cardStackBackgroundImg, null, null, 6, null);
            return;
        }
        getBinding().cardStackBackgroundImg.setImageDrawable(null);
    }

    /* compiled from: EducationLessonCardStackFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/models/contract/EducationLessonCardStackFragmentKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackFragment;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<EducationLessonFragmentKeys>, FragmentWithArgsCompanion<EducationLessonCardStackFragment, EducationLessonFragmentKeys> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EducationLessonFragmentKeys getArgs(EducationLessonCardStackFragment educationLessonCardStackFragment) {
            return (EducationLessonFragmentKeys) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, educationLessonCardStackFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EducationLessonCardStackFragment newInstance(EducationLessonFragmentKeys educationLessonFragmentKeys) {
            return (EducationLessonCardStackFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, educationLessonFragmentKeys);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EducationLessonCardStackFragment educationLessonCardStackFragment, EducationLessonFragmentKeys educationLessonFragmentKeys) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, educationLessonCardStackFragment, educationLessonFragmentKeys);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EducationLessonFragmentKeys key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return EducationLessonCardStackFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
