package com.robinhood.shared.education.p377ui.lessons.standard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.LearningSection;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.MergeEducationLessonStandardHeaderParentViewBinding;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardHeaderData;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardHeaderData2;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EducationLessonStandardHeaderParentView.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002-.B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%J\u0018\u0010&\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020,H\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderParentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderParentView$HeaderParentCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderParentView$HeaderParentCallbacks;", "setCallbacks", "(Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderParentView$HeaderParentCallbacks;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "binding", "Lcom/robinhood/shared/education/databinding/MergeEducationLessonStandardHeaderParentViewBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/MergeEducationLessonStandardHeaderParentViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "sectionAdapter", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderAdapter;", "previousPosition", "", "onAttachedToWindow", "", "bind", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData;", "addLottieOnCompositionLoadedListener", "listener", "Lcom/airbnb/lottie/LottieOnCompositionLoadedListener;", "bindProgressBarAnimation", "foregroundColorStateList", "Landroid/content/res/ColorStateList;", "bindLessonAnimation", "bindSectionAsset", "bindCompletionAnimation", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData$SectionAsset;", "HeaderParentCallbacks", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationLessonStandardHeaderParentView extends Hammer_EducationLessonStandardHeaderParentView {
    private static final float COMPLETION_SECTION_ASSET_OPACITY = 0.2f;
    private static final float COMPLETION_SECTION_ASSET_SCALE = 0.9f;
    private static final long PROGRESS_BAR_TRANSLATION_DELAY = 350;
    private static final long PROGRESS_BAR_TRANSLATION_DURATION = 350;
    private static final long TRANSITION_ANIMATION_DURATION = 500;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private HeaderParentCallbacks callbacks;
    public ImageLoader imageLoader;
    private int previousPosition;
    private EducationLessonStandardHeaderAdapter sectionAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationLessonStandardHeaderParentView.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/MergeEducationLessonStandardHeaderParentViewBinding;", 0))};
    public static final int $stable = 8;

    /* compiled from: EducationLessonStandardHeaderParentView.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderParentView$HeaderParentCallbacks;", "", "onHeaderBackBtnPressed", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface HeaderParentCallbacks {
        void onHeaderBackBtnPressed();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationLessonStandardHeaderParentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C38790R.layout.merge_education_lesson_standard_header_parent_view, true);
        this.binding = ViewBinding5.viewBinding(this, EducationLessonStandardHeaderParentView2.INSTANCE);
        this.previousPosition = -1;
    }

    public final HeaderParentCallbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(HeaderParentCallbacks headerParentCallbacks) {
        this.callbacks = headerParentCallbacks;
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

    private final MergeEducationLessonStandardHeaderParentViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEducationLessonStandardHeaderParentViewBinding) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageView backBtn = getBinding().backBtn;
        Intrinsics.checkNotNullExpressionValue(backBtn, "backBtn");
        ViewsKt.setLoggingConfig(backBtn, new AutoLoggingConfig(false, false, 1, null));
        ImageView backBtn2 = getBinding().backBtn;
        Intrinsics.checkNotNullExpressionValue(backBtn2, "backBtn");
        OnClickListeners.onClick(backBtn2, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardHeaderParentView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardHeaderParentView.onAttachedToWindow$lambda$0(this.f$0);
            }
        });
        this.sectionAdapter = new EducationLessonStandardHeaderAdapter(getImageLoader());
        ViewPager2 viewPager2 = getBinding().educationLessonHeaderViewPager;
        viewPager2.setAdapter(this.sectionAdapter);
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOffscreenPageLimit(2);
        int i = (Resources.getSystem().getDisplayMetrics().heightPixels * 2) / 5;
        ViewGroup.LayoutParams layoutParams = getBinding().educationLessonHeaderAsset.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.matchConstraintMaxHeight = i;
        getBinding().educationLessonHeaderAsset.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(EducationLessonStandardHeaderParentView educationLessonStandardHeaderParentView) {
        HeaderParentCallbacks headerParentCallbacks = educationLessonStandardHeaderParentView.callbacks;
        if (headerParentCallbacks != null) {
            headerParentCallbacks.onHeaderBackBtnPressed();
        }
        return Unit.INSTANCE;
    }

    public final void bind(final EducationLessonStandardHeaderData data) throws Resources.NotFoundException {
        int themeColor;
        Intrinsics.checkNotNullParameter(data, "data");
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addListener(new Transition.TransitionListener() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardHeaderParentView$bind$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        autoTransition.addListener(new Transition.TransitionListener() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardHeaderParentView$bind$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        autoTransition.excludeChildren(getBinding().getRoot(), true);
        TransitionManager.beginDelayedTransition(this, autoTransition);
        if (data instanceof EducationLessonStandardHeaderData.None) {
            Group educationLessonHeaderContent = getBinding().educationLessonHeaderContent;
            Intrinsics.checkNotNullExpressionValue(educationLessonHeaderContent, "educationLessonHeaderContent");
            educationLessonHeaderContent.setVisibility(8);
            return;
        }
        Group educationLessonHeaderContent2 = getBinding().educationLessonHeaderContent;
        Intrinsics.checkNotNullExpressionValue(educationLessonHeaderContent2, "educationLessonHeaderContent");
        educationLessonHeaderContent2.setVisibility(0);
        LottieAnimationView educationLessonHeaderCompletionAnimation = getBinding().educationLessonHeaderCompletionAnimation;
        Intrinsics.checkNotNullExpressionValue(educationLessonHeaderCompletionAnimation, "educationLessonHeaderCompletionAnimation");
        educationLessonHeaderCompletionAnimation.setVisibility((data instanceof EducationLessonStandardHeaderData.SectionAsset) && ((EducationLessonStandardHeaderData.SectionAsset) data).getIsFinalSection() ? 0 : 8);
        Integer backgroundColor = data.getBackgroundColor();
        if (backgroundColor != null) {
            getBinding().getRoot().setBackgroundColor(backgroundColor.intValue());
        }
        Integer foregroundColor = data.getForegroundColor();
        if (foregroundColor != null) {
            themeColor = foregroundColor.intValue();
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            themeColor = ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1);
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(themeColor);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        getBinding().backBtn.setImageTintList(colorStateListValueOf);
        ImageView backBtn = getBinding().backBtn;
        Intrinsics.checkNotNullExpressionValue(backBtn, "backBtn");
        ViewsKt.eventData$default(backBtn, false, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardHeaderParentView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardHeaderParentView.bind$lambda$4(data);
            }
        }, 1, null);
        if (data.getEventContext().getItem_position() != this.previousPosition) {
            this.previousPosition = data.getEventContext().getItem_position();
            ImageView backBtn2 = getBinding().backBtn;
            Intrinsics.checkNotNullExpressionValue(backBtn2, "backBtn");
            ViewsKt.logAppear$default(backBtn2, null, false, 3, null);
        }
        bindProgressBarAnimation(data, colorStateListValueOf);
        bindLessonAnimation(data);
        post(new Runnable() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardHeaderParentView.bind.4
            @Override // java.lang.Runnable
            public final void run() {
                EducationLessonStandardHeaderParentView.this.bindSectionAsset(data);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$4(EducationLessonStandardHeaderData educationLessonStandardHeaderData) {
        LearningSection learning_section = educationLessonStandardHeaderData.getEventContext().getLearning_section();
        return new UserInteractionEventDescriptor((learning_section != null ? learning_section.getIdentifier() : null) + "-dismiss-button", null, UserInteractionEventData.Action.DISMISS, educationLessonStandardHeaderData.getEventContext(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 34, null);
    }

    public final void addLottieOnCompositionLoadedListener(LottieOnCompositionLoadedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getBinding().educationLessonHeaderAnimation.addLottieOnCompositionLoadedListener(listener);
    }

    private final void bindProgressBarAnimation(EducationLessonStandardHeaderData data, ColorStateList foregroundColorStateList) {
        RdsProgressBar rdsProgressBar = getBinding().educationLessonProgressBar;
        rdsProgressBar.setMax(data.getProgressBarMax());
        rdsProgressBar.setProgress(data.getProgress(), true);
        rdsProgressBar.setProgressTintList(foregroundColorStateList);
        rdsProgressBar.setProgressBackgroundTintList(foregroundColorStateList);
        if (rdsProgressBar.getProgress() == rdsProgressBar.getMax()) {
            rdsProgressBar.animate().translationX(rdsProgressBar.getWidth()).setInterpolator(Interpolators.INSTANCE.getAccelCurveInterpolator()).setStartDelay(350L).setDuration(350L).start();
        }
    }

    private final void bindLessonAnimation(EducationLessonStandardHeaderData data) {
        EducationLessonStandardHeaderAnimationView educationLessonHeaderAnimation = getBinding().educationLessonHeaderAnimation;
        Intrinsics.checkNotNullExpressionValue(educationLessonHeaderAnimation, "educationLessonHeaderAnimation");
        boolean z = data instanceof EducationLessonStandardHeaderData.LessonAnimation;
        educationLessonHeaderAnimation.setVisibility(z ? 0 : 8);
        if (z) {
            getBinding().educationLessonHeaderAnimation.bind((EducationLessonStandardHeaderData.LessonAnimation) data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindSectionAsset(EducationLessonStandardHeaderData data) {
        EducationLessonStandardHeaderAdapter educationLessonStandardHeaderAdapter;
        ViewPager2 viewPager2 = getBinding().educationLessonHeaderViewPager;
        Intrinsics.checkNotNull(viewPager2);
        boolean z = data instanceof EducationLessonStandardHeaderData.SectionAsset;
        viewPager2.setVisibility(z ? 0 : 8);
        if (z) {
            EducationLessonStandardHeaderData.SectionAsset sectionAsset = (EducationLessonStandardHeaderData.SectionAsset) data;
            List<EducationLessonStandardHeaderData2> assetUrls = sectionAsset.getAssetUrls();
            EducationLessonStandardHeaderAdapter educationLessonStandardHeaderAdapter2 = this.sectionAdapter;
            if (!Intrinsics.areEqual(assetUrls, educationLessonStandardHeaderAdapter2 != null ? educationLessonStandardHeaderAdapter2.getCurrentList() : null) && (educationLessonStandardHeaderAdapter = this.sectionAdapter) != null) {
                educationLessonStandardHeaderAdapter.submitList(sectionAsset.getAssetUrls());
            }
            if (!sectionAsset.getIsFinalSection()) {
                viewPager2.setCurrentItem(sectionAsset.getSectionPosition());
                viewPager2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(500L).start();
            } else if (CollectionsKt.lastOrNull((List) sectionAsset.getAssetUrls()) instanceof EducationLessonStandardHeaderData2.Image) {
                viewPager2.animate().alpha(COMPLETION_SECTION_ASSET_OPACITY).scaleX(0.9f).scaleY(0.9f).setDuration(500L).start();
                bindCompletionAnimation(sectionAsset);
            }
        }
    }

    private final void bindCompletionAnimation(EducationLessonStandardHeaderData.SectionAsset data) {
        LottieAnimationView lottieAnimationView = getBinding().educationLessonHeaderCompletionAnimation;
        if (lottieAnimationView.getComposition() != null || data.getCompletionAnimationUrl() == null) {
            return;
        }
        lottieAnimationView.setAnimationFromUrl(data.getCompletionAnimationUrl());
        lottieAnimationView.playAnimation();
    }
}
