package com.robinhood.android.safetylabels.p247ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.safetylabels.C27803R;
import com.robinhood.android.safetylabels.databinding.MergeSafetyLabelSlidesViewBinding;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.SafetyLabelLesson;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.models.p387db.bonfire.education.safetylabels.SafetyLabelsLessonSection;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: SafetyLabelsSlidesView.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010&\u001a\u00020'H\u0014J\u0018\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,J\u0012\u0010-\u001a\u00020'2\b\u0010.\u001a\u0004\u0018\u00010\u001dH\u0002J\u001e\u0010/\u001a\u00020'*\u0002002\b\u00101\u001a\u0004\u0018\u00010\u001d2\u0006\u00102\u001a\u00020\u001bH\u0002J\u0018\u00103\u001a\u00020'2\u0006\u00104\u001a\u0002002\u0006\u00105\u001a\u000200H\u0002J\u001a\u00106\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0016\u00107\u001a\u00020'*\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsSlidesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/safetylabels/databinding/MergeSafetyLabelSlidesViewBinding;", "getBinding", "()Lcom/robinhood/android/safetylabels/databinding/MergeSafetyLabelSlidesViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "isAnimation", "", "dayFirstAssetUrl", "Lokhttp3/HttpUrl;", "nightFirstAssetUrl", "daySecondAssetUrl", "nightSecondAssetUrl", "firstAssetUrl", "getFirstAssetUrl", "()Lokhttp3/HttpUrl;", "secondAssetUrl", "getSecondAssetUrl", "onAttachedToWindow", "", "bind", "state", "Lcom/robinhood/shared/models/db/bonfire/education/safetylabels/SafetyLabelsLessonSection$SlidesContent;", "safetyLabelLesson", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelLesson;", "updateImage", MarkdownText4.TagImageUrl, "updateAnimation", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieUrl", "isVisible", "updateAnimationSelection", "selectedView", "deselectedView", "setupLabelClickListeners", "updateLabel", "Lcom/robinhood/android/designsystem/text/RhTextView;", "labelText", "", "Companion", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SafetyLabelsSlidesView extends Hammer_SafetyLabelsSlidesView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private HttpUrl dayFirstAssetUrl;
    private HttpUrl daySecondAssetUrl;
    public EventLogger eventLogger;
    public ImageLoader imageLoader;
    private boolean isAnimation;
    private HttpUrl nightFirstAssetUrl;
    private HttpUrl nightSecondAssetUrl;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SafetyLabelsSlidesView.class, "binding", "getBinding()Lcom/robinhood/android/safetylabels/databinding/MergeSafetyLabelSlidesViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyLabelsSlidesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C27803R.layout.merge_safety_label_slides_view, true);
        this.binding = ViewBinding5.viewBinding(this, SafetyLabelsSlidesView2.INSTANCE);
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

    private final MergeSafetyLabelSlidesViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeSafetyLabelSlidesViewBinding) value;
    }

    private final HttpUrl getFirstAssetUrl() {
        HttpUrl httpUrl;
        return (DayNightChanges.isDay(ScarletManager2.getScarletManager(this)) || (httpUrl = this.nightFirstAssetUrl) == null) ? this.dayFirstAssetUrl : httpUrl;
    }

    private final HttpUrl getSecondAssetUrl() {
        HttpUrl httpUrl;
        return (DayNightChanges.isDay(ScarletManager2.getScarletManager(this)) || (httpUrl = this.nightSecondAssetUrl) == null) ? this.daySecondAssetUrl : httpUrl;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewDisposerKt.bindTo$default(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.safetylabels.ui.SafetyLabelsSlidesView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SafetyLabelsSlidesView.onAttachedToWindow$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(SafetyLabelsSlidesView safetyLabelsSlidesView, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MergeSafetyLabelSlidesViewBinding binding = safetyLabelsSlidesView.getBinding();
        if (safetyLabelsSlidesView.isAnimation) {
            LottieAnimationView firstSlideAnimation = binding.firstSlideAnimation;
            Intrinsics.checkNotNullExpressionValue(firstSlideAnimation, "firstSlideAnimation");
            HttpUrl firstAssetUrl = safetyLabelsSlidesView.getFirstAssetUrl();
            LottieAnimationView firstSlideAnimation2 = binding.firstSlideAnimation;
            Intrinsics.checkNotNullExpressionValue(firstSlideAnimation2, "firstSlideAnimation");
            safetyLabelsSlidesView.updateAnimation(firstSlideAnimation, firstAssetUrl, firstSlideAnimation2.getVisibility() == 0);
            LottieAnimationView secondSlideAnimation = binding.secondSlideAnimation;
            Intrinsics.checkNotNullExpressionValue(secondSlideAnimation, "secondSlideAnimation");
            HttpUrl secondAssetUrl = safetyLabelsSlidesView.getSecondAssetUrl();
            LottieAnimationView secondSlideAnimation2 = binding.secondSlideAnimation;
            Intrinsics.checkNotNullExpressionValue(secondSlideAnimation2, "secondSlideAnimation");
            safetyLabelsSlidesView.updateAnimation(secondSlideAnimation, secondAssetUrl, secondSlideAnimation2.getVisibility() == 0);
        } else {
            safetyLabelsSlidesView.updateImage(safetyLabelsSlidesView.getFirstAssetUrl());
        }
        return Unit.INSTANCE;
    }

    public final void bind(SafetyLabelsLessonSection.SlidesContent state, SafetyLabelLesson safetyLabelLesson) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.isAnimation = state.isAnimation();
        this.dayFirstAssetUrl = state.getDayFirstAssetUrl();
        this.nightFirstAssetUrl = state.getNightFirstAssetUrl();
        this.daySecondAssetUrl = state.getDaySecondAssetUrl();
        this.nightSecondAssetUrl = state.getNightSecondAssetUrl();
        MergeSafetyLabelSlidesViewBinding binding = getBinding();
        RhTextView titleTxt = binding.titleTxt;
        Intrinsics.checkNotNullExpressionValue(titleTxt, "titleTxt");
        boolean z = true;
        titleTxt.setVisibility(state.getTitle() != null ? 0 : 8);
        binding.titleTxt.setText(state.getTitle());
        Group assetBorderGroup = binding.assetBorderGroup;
        Intrinsics.checkNotNullExpressionValue(assetBorderGroup, "assetBorderGroup");
        assetBorderGroup.setVisibility(state.isAnimation() ? 0 : 8);
        if (state.isAnimation()) {
            ImageView slideImg = binding.slideImg;
            Intrinsics.checkNotNullExpressionValue(slideImg, "slideImg");
            slideImg.setVisibility(8);
            LottieAnimationView firstSlideAnimation = binding.firstSlideAnimation;
            Intrinsics.checkNotNullExpressionValue(firstSlideAnimation, "firstSlideAnimation");
            HttpUrl firstAssetUrl = getFirstAssetUrl();
            if (!state.isLeftLabelSelectedInitially() && state.getSecondLabel() != null) {
                z = false;
            }
            updateAnimation(firstSlideAnimation, firstAssetUrl, z);
            LottieAnimationView secondSlideAnimation = binding.secondSlideAnimation;
            Intrinsics.checkNotNullExpressionValue(secondSlideAnimation, "secondSlideAnimation");
            updateAnimation(secondSlideAnimation, getSecondAssetUrl(), state.isRightLabelSelectedInitially());
        } else {
            ImageView slideImg2 = binding.slideImg;
            Intrinsics.checkNotNullExpressionValue(slideImg2, "slideImg");
            slideImg2.setVisibility(0);
            LottieAnimationView firstSlideAnimation2 = binding.firstSlideAnimation;
            Intrinsics.checkNotNullExpressionValue(firstSlideAnimation2, "firstSlideAnimation");
            firstSlideAnimation2.setVisibility(8);
            LottieAnimationView secondSlideAnimation2 = binding.secondSlideAnimation;
            Intrinsics.checkNotNullExpressionValue(secondSlideAnimation2, "secondSlideAnimation");
            secondSlideAnimation2.setVisibility(8);
            updateImage(getFirstAssetUrl());
        }
        binding.firstLabel.setSelected(state.isLeftLabelSelectedInitially());
        binding.secondLabel.setSelected(state.isRightLabelSelectedInitially());
        RhTextView firstLabel = binding.firstLabel;
        Intrinsics.checkNotNullExpressionValue(firstLabel, "firstLabel");
        updateLabel(firstLabel, state.getFirstLabel());
        RhTextView secondLabel = binding.secondLabel;
        Intrinsics.checkNotNullExpressionValue(secondLabel, "secondLabel");
        updateLabel(secondLabel, state.getSecondLabel());
        setupLabelClickListeners(state, safetyLabelLesson);
    }

    private final void updateImage(HttpUrl imageUrl) {
        if (imageUrl == null) {
            return;
        }
        ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(imageUrl);
        ImageView slideImg = getBinding().slideImg;
        Intrinsics.checkNotNullExpressionValue(slideImg, "slideImg");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, slideImg, null, null, 6, null);
    }

    private final void updateAnimation(final LottieAnimationView lottieAnimationView, HttpUrl httpUrl, boolean z) {
        lottieAnimationView.removeAllLottieOnCompositionLoadedListener();
        lottieAnimationView.setVisibility(z ? 0 : 8);
        if (httpUrl == null) {
            return;
        }
        lottieAnimationView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: com.robinhood.android.safetylabels.ui.SafetyLabelsSlidesView.updateAnimation.1
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                lottieAnimationView.resumeAnimation();
            }
        });
        lottieAnimationView.setAnimationFromUrl(httpUrl.getUrl());
    }

    private final void updateAnimationSelection(LottieAnimationView selectedView, LottieAnimationView deselectedView) {
        if (!selectedView.isAnimating()) {
            selectedView.setFrame(deselectedView.getFrame());
            selectedView.resumeAnimation();
            deselectedView.pauseAnimation();
        }
        selectedView.setVisibility(0);
        deselectedView.setVisibility(8);
    }

    private final void setupLabelClickListeners(final SafetyLabelsLessonSection.SlidesContent state, final SafetyLabelLesson safetyLabelLesson) {
        final MergeSafetyLabelSlidesViewBinding binding = getBinding();
        RhTextView firstLabel = binding.firstLabel;
        Intrinsics.checkNotNullExpressionValue(firstLabel, "firstLabel");
        OnClickListeners.onClick(firstLabel, new Function0() { // from class: com.robinhood.android.safetylabels.ui.SafetyLabelsSlidesView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SafetyLabelsSlidesView.setupLabelClickListeners$lambda$5$lambda$3(state, binding, this, safetyLabelLesson);
            }
        });
        RhTextView secondLabel = binding.secondLabel;
        Intrinsics.checkNotNullExpressionValue(secondLabel, "secondLabel");
        OnClickListeners.onClick(secondLabel, new Function0() { // from class: com.robinhood.android.safetylabels.ui.SafetyLabelsSlidesView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SafetyLabelsSlidesView.setupLabelClickListeners$lambda$5$lambda$4(state, binding, this, safetyLabelLesson);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit setupLabelClickListeners$lambda$5$lambda$3(SafetyLabelsLessonSection.SlidesContent slidesContent, MergeSafetyLabelSlidesViewBinding mergeSafetyLabelSlidesViewBinding, SafetyLabelsSlidesView safetyLabelsSlidesView, SafetyLabelLesson safetyLabelLesson) {
        SafetyLabelsSlidesView safetyLabelsSlidesView2;
        if (slidesContent.isAnimation()) {
            LottieAnimationView firstSlideAnimation = mergeSafetyLabelSlidesViewBinding.firstSlideAnimation;
            Intrinsics.checkNotNullExpressionValue(firstSlideAnimation, "firstSlideAnimation");
            if (firstSlideAnimation.getVisibility() == 0) {
                safetyLabelsSlidesView2 = safetyLabelsSlidesView;
            } else {
                LottieAnimationView firstSlideAnimation2 = mergeSafetyLabelSlidesViewBinding.firstSlideAnimation;
                Intrinsics.checkNotNullExpressionValue(firstSlideAnimation2, "firstSlideAnimation");
                LottieAnimationView secondSlideAnimation = mergeSafetyLabelSlidesViewBinding.secondSlideAnimation;
                Intrinsics.checkNotNullExpressionValue(secondSlideAnimation, "secondSlideAnimation");
                safetyLabelsSlidesView2 = safetyLabelsSlidesView;
                safetyLabelsSlidesView2.updateAnimationSelection(firstSlideAnimation2, secondSlideAnimation);
            }
        }
        mergeSafetyLabelSlidesViewBinding.firstLabel.setSelected(true);
        mergeSafetyLabelSlidesViewBinding.secondLabel.setSelected(false);
        EventLogger.DefaultImpls.logTap$default(safetyLabelsSlidesView2.getEventLogger(), UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.SAFETY_LABEL_LESSON, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(1, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, safetyLabelLesson, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -3, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit setupLabelClickListeners$lambda$5$lambda$4(SafetyLabelsLessonSection.SlidesContent slidesContent, MergeSafetyLabelSlidesViewBinding mergeSafetyLabelSlidesViewBinding, SafetyLabelsSlidesView safetyLabelsSlidesView, SafetyLabelLesson safetyLabelLesson) {
        SafetyLabelsSlidesView safetyLabelsSlidesView2;
        if (slidesContent.isAnimation()) {
            LottieAnimationView secondSlideAnimation = mergeSafetyLabelSlidesViewBinding.secondSlideAnimation;
            Intrinsics.checkNotNullExpressionValue(secondSlideAnimation, "secondSlideAnimation");
            if (secondSlideAnimation.getVisibility() == 0) {
                safetyLabelsSlidesView2 = safetyLabelsSlidesView;
            } else {
                LottieAnimationView secondSlideAnimation2 = mergeSafetyLabelSlidesViewBinding.secondSlideAnimation;
                Intrinsics.checkNotNullExpressionValue(secondSlideAnimation2, "secondSlideAnimation");
                LottieAnimationView firstSlideAnimation = mergeSafetyLabelSlidesViewBinding.firstSlideAnimation;
                Intrinsics.checkNotNullExpressionValue(firstSlideAnimation, "firstSlideAnimation");
                safetyLabelsSlidesView2 = safetyLabelsSlidesView;
                safetyLabelsSlidesView2.updateAnimationSelection(secondSlideAnimation2, firstSlideAnimation);
            }
        }
        mergeSafetyLabelSlidesViewBinding.secondLabel.setSelected(true);
        mergeSafetyLabelSlidesViewBinding.firstLabel.setSelected(false);
        EventLogger.DefaultImpls.logTap$default(safetyLabelsSlidesView2.getEventLogger(), UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.SAFETY_LABEL_LESSON, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(2, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, safetyLabelLesson, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -3, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    /* compiled from: SafetyLabelsSlidesView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsSlidesView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsSlidesView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SafetyLabelsSlidesView> {
        private final /* synthetic */ Inflater<SafetyLabelsSlidesView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SafetyLabelsSlidesView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SafetyLabelsSlidesView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27803R.layout.include_safety_label_slides_view);
        }
    }

    private final void updateLabel(RhTextView rhTextView, String str) {
        rhTextView.setVisibility(str != null ? 0 : 8);
        rhTextView.setText(str);
    }
}
