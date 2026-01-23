package com.withpersona.sdk2.inquiry.governmentid;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.transition.AutoTransition;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeClipBounds;
import androidx.transition.ChangeImageTransform;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewBinding;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling3;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.R$color;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.SnackBarState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.RemoteImageUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* compiled from: GovernmentIdReviewRunner.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0002J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdReviewRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$ReviewScreen;", "binding", "Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewBinding;", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewBinding;)V", "constraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "currentOverlayAssetView", "Landroid/view/View;", "isProcessing", "", "showRendering", "", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "setProcessing", "layoutActionButtons", "preferredAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "originalCallTimestamp", "", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)Lkotlin/Unit;", "ensureNoButtonOverlap", "Companion", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class GovernmentIdReviewRunner implements LayoutRunner<GovernmentIdScreen2.ReviewScreen> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Pi2GovernmentidReviewBinding binding;
    private final ConstraintSet constraintSet;
    private View currentOverlayAssetView;
    private boolean isProcessing;

    public GovernmentIdReviewRunner(Pi2GovernmentidReviewBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.constraintSet = new ConstraintSet();
        CoordinatorLayout cameraScreenContent = binding.cameraScreenContent;
        Intrinsics.checkNotNullExpressionValue(cameraScreenContent, "cameraScreenContent");
        InsetsUtils.applyInsetsAsPadding$default(cameraScreenContent, false, false, false, false, 15, null);
        ThemeableLottieAnimationView themeableLottieAnimationView = binding.overlayIcon;
        int color = Color.parseColor("#43957D");
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView.addColorReplacement(color, ResTools.getColorFromAttr$default(context, R$attr.colorPrimary, null, false, 6, null));
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final GovernmentIdScreen2.ReviewScreen rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding = this.binding;
        if (!pi2GovernmentidReviewBinding.animationsPlayed.isChecked()) {
            pi2GovernmentidReviewBinding.animationsPlayed.setChecked(true);
            pi2GovernmentidReviewBinding.getRoot().post(new Runnable() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdReviewRunner$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GovernmentIdReviewRunner.showRendering$lambda$11$lambda$1(pi2GovernmentidReviewBinding);
                }
            });
        } else {
            pi2GovernmentidReviewBinding.overlayIcon.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdReviewRunner$$ExternalSyntheticLambda1
                @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
                public final void onCompositionLoaded(LottieComposition lottieComposition) {
                    GovernmentIdReviewRunner.showRendering$lambda$11$lambda$2(pi2GovernmentidReviewBinding, lottieComposition);
                }
            });
        }
        Object tag = pi2GovernmentidReviewBinding.reviewImage.getTag(R$id.pi2_last_image_path);
        if (!Intrinsics.areEqual(tag instanceof String ? (String) tag : null, rendering.getImagePath())) {
            ImageView reviewImage = pi2GovernmentidReviewBinding.reviewImage;
            Intrinsics.checkNotNullExpressionValue(reviewImage, "reviewImage");
            ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(reviewImage, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdReviewRunner$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdReviewRunner.showRendering$lambda$11$lambda$4(pi2GovernmentidReviewBinding, rendering);
                }
            });
        }
        pi2GovernmentidReviewBinding.overlayText.setText(rendering.getMessage());
        pi2GovernmentidReviewBinding.disclaimerIcon.setVisibility(StringsKt.isBlank(rendering.getDisclaimer()) ? 8 : 0);
        pi2GovernmentidReviewBinding.disclaimer.setVisibility(StringsKt.isBlank(rendering.getDisclaimer()) ? 8 : 0);
        pi2GovernmentidReviewBinding.disclaimer.setText(rendering.getDisclaimer());
        pi2GovernmentidReviewBinding.acceptButton.setText(rendering.getAcceptText());
        pi2GovernmentidReviewBinding.retryButton.setText(rendering.getRetryText());
        pi2GovernmentidReviewBinding.title.setText(rendering.getConfirmCaptureTitle());
        TextView textView = pi2GovernmentidReviewBinding.title;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setVisibility(text.length() == 0 ? 8 : 0);
        Context context = pi2GovernmentidReviewBinding.getRoot().getContext();
        View view = pi2GovernmentidReviewBinding.overlay;
        Intrinsics.checkNotNull(context);
        view.setBackground(IdFrameHelper.createIdFrameWithAttributes(context, com.withpersona.sdk2.inquiry.resources.R$attr.personaIdFrameReviewStyle));
        if (ResTools.boolFromAttr$default(context, com.withpersona.sdk2.inquiry.resources.R$attr.personaIdFrameCenterText, null, false, false, 14, null)) {
            pi2GovernmentidReviewBinding.overlayText.setGravity(17);
            TextView overlayText = pi2GovernmentidReviewBinding.overlayText;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            ViewGroup.LayoutParams layoutParams = overlayText.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                overlayText.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, com.withpersona.sdk2.inquiry.resources.R$attr.personaLockImage, null, false, 6, null);
        if (numResourceIdFromAttr$default != null) {
            pi2GovernmentidReviewBinding.disclaimerIcon.setImageResource(numResourceIdFromAttr$default.intValue());
        }
        OverlayAssets overlayAssetsIdFrameAssetsFor = IdFrameHelper.idFrameAssetsFor(context, rendering.getOverlay());
        pi2GovernmentidReviewBinding.overlayGuide.setImageResource(overlayAssetsIdFrameAssetsFor.getGuideDrawable());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        RemoteImage asset = assetConfig != null ? AssetConfigUtils.getAsset(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null;
        if (asset != null) {
            if (this.currentOverlayAssetView == null) {
                ConstraintLayout overlayIconContainer = pi2GovernmentidReviewBinding.overlayIconContainer;
                Intrinsics.checkNotNullExpressionValue(overlayIconContainer, "overlayIconContainer");
                this.currentOverlayAssetView = RemoteImageUtils.renderToContainer$default(asset, overlayIconContainer, false, 2, null);
                pi2GovernmentidReviewBinding.overlayIcon.setVisibility(8);
            }
        } else {
            pi2GovernmentidReviewBinding.overlayIcon.setAnimation(overlayAssetsIdFrameAssetsFor.getHintAnimation());
        }
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdReviewRunner$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdReviewRunner.showRendering$lambda$11$lambda$6(rendering);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdReviewRunner$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdReviewRunner.showRendering$lambda$11$lambda$7(rendering);
            }
        };
        Pi2NavigationBar navigationBar = pi2GovernmentidReviewBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        FrameLayout root = pi2GovernmentidReviewBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        pi2GovernmentidReviewBinding.acceptButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdReviewRunner$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GovernmentIdReviewRunner.showRendering$lambda$11$lambda$8(rendering, view2);
            }
        });
        pi2GovernmentidReviewBinding.retryButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdReviewRunner$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GovernmentIdReviewRunner.showRendering$lambda$11$lambda$9(rendering, view2);
            }
        });
        pi2GovernmentidReviewBinding.acceptButton.setEnabled(rendering.getIsEnabled());
        pi2GovernmentidReviewBinding.retryButton.setEnabled(rendering.getIsEnabled());
        if (rendering.getIsAutoClassifying()) {
            setProcessing(true);
        } else {
            setProcessing(false);
        }
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        if (styles != null) {
            applyStyles(styles);
            SystemUiControllerUtils.updateSystemUiColor(viewEnvironment, ContextCompat.getColor(this.binding.getRoot().getContext(), R$color.blackScreenStatusBarColor));
        }
        layoutActionButtons$default(this, rendering.getReviewCaptureButtonsAxis(), 0L, 2, null);
        CoordinatorLayout cameraScreenContent = this.binding.cameraScreenContent;
        Intrinsics.checkNotNullExpressionValue(cameraScreenContent, "cameraScreenContent");
        SnackBarState.renderErrorSnackbarIfNeeded$default(cameraScreenContent, rendering.getError(), rendering.getOnErrorDismissed(), null, 0, 0, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$11$lambda$1(Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(pi2GovernmentidReviewBinding.flashScreen, "alpha", 0.9f, 0.0f).setDuration(500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
        pi2GovernmentidReviewBinding.getRoot().setHapticFeedbackEnabled(true);
        pi2GovernmentidReviewBinding.getRoot().performHapticFeedback(1, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$11$lambda$2(Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding, LottieComposition lottieComposition) {
        pi2GovernmentidReviewBinding.overlayIcon.setProgress(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$11$lambda$4(Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding, GovernmentIdScreen2.ReviewScreen reviewScreen) {
        int iCoerceAtMost = RangesKt.coerceAtMost(pi2GovernmentidReviewBinding.reviewImage.getMeasuredWidth(), 2000);
        if (iCoerceAtMost > 0) {
            pi2GovernmentidReviewBinding.reviewImage.setTag(R$id.pi2_last_image_path, reviewScreen.getImagePath());
            ImageView reviewImage = pi2GovernmentidReviewBinding.reviewImage;
            Intrinsics.checkNotNullExpressionValue(reviewImage, "reviewImage");
            File file = new File(reviewScreen.getImagePath());
            ImageLoader imageLoader = reviewScreen.getImageLoader();
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(reviewImage.getContext()).data(file).target(reviewImage);
            builderTarget.size(iCoerceAtMost, iCoerceAtMost);
            builderTarget.memoryCacheKey(reviewScreen.getImagePath());
            imageLoader.enqueue(builderTarget.build());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$11$lambda$6(GovernmentIdScreen2.ReviewScreen reviewScreen) {
        reviewScreen.getRetryImage().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$11$lambda$7(GovernmentIdScreen2.ReviewScreen reviewScreen) {
        reviewScreen.getClose().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$11$lambda$8(GovernmentIdScreen2.ReviewScreen reviewScreen, View view) {
        reviewScreen.getAcceptImage().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$11$lambda$9(GovernmentIdScreen2.ReviewScreen reviewScreen, View view) {
        reviewScreen.getRetryImage().invoke();
    }

    private final void setProcessing(boolean isProcessing) {
        if (this.isProcessing == isProcessing) {
            return;
        }
        this.isProcessing = isProcessing;
        Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding = this.binding;
        TransitionSet duration = new TransitionSet().addTransition(new Fade(3)).addTransition(new ChangeBounds()).addTransition(new ChangeClipBounds()).addTransition(new ChangeImageTransform()).setOrdering(0).setDuration(300L);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        TransitionManager.beginDelayedTransition(pi2GovernmentidReviewBinding.getRoot(), duration);
        if (isProcessing) {
            pi2GovernmentidReviewBinding.processing.setVisibility(0);
            pi2GovernmentidReviewBinding.disclaimerView.setVisibility(4);
            pi2GovernmentidReviewBinding.acceptButton.setVisibility(4);
            pi2GovernmentidReviewBinding.retryButton.setVisibility(4);
            pi2GovernmentidReviewBinding.overlayHint.setVisibility(4);
            return;
        }
        pi2GovernmentidReviewBinding.processing.setVisibility(4);
        pi2GovernmentidReviewBinding.disclaimerView.setVisibility(0);
        pi2GovernmentidReviewBinding.acceptButton.setVisibility(0);
        pi2GovernmentidReviewBinding.retryButton.setVisibility(0);
        pi2GovernmentidReviewBinding.overlayHint.setVisibility(0);
    }

    static /* synthetic */ void layoutActionButtons$default(GovernmentIdReviewRunner governmentIdReviewRunner, StyleElements.Axis axis, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        governmentIdReviewRunner.layoutActionButtons(axis, j);
    }

    private final void layoutActionButtons(final StyleElements.Axis preferredAxis, final long originalCallTimestamp) {
        final Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding = this.binding;
        Button acceptButton = pi2GovernmentidReviewBinding.acceptButton;
        Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
        ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(acceptButton, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdReviewRunner$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdReviewRunner.layoutActionButtons$lambda$17$lambda$16(pi2GovernmentidReviewBinding, originalCallTimestamp, this, preferredAxis);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit layoutActionButtons$lambda$17$lambda$16(Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding, long j, final GovernmentIdReviewRunner governmentIdReviewRunner, StyleElements.Axis axis) {
        boolean z = (pi2GovernmentidReviewBinding.acceptButton.getLineCount() == 0 || pi2GovernmentidReviewBinding.retryButton.getLineCount() == 0) ? false : true;
        boolean z2 = System.currentTimeMillis() - j > 300;
        if (!z && !z2) {
            governmentIdReviewRunner.layoutActionButtons(axis, j);
            return Unit.INSTANCE;
        }
        if (z && (pi2GovernmentidReviewBinding.acceptButton.getLineCount() > 1 || pi2GovernmentidReviewBinding.retryButton.getLineCount() > 1 || axis == StyleElements.Axis.VERTICAL)) {
            Button acceptButton = pi2GovernmentidReviewBinding.acceptButton;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            ViewGroup.LayoutParams layoutParams = acceptButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = pi2GovernmentidReviewBinding.flowLayout.getWidth();
            acceptButton.setLayoutParams(layoutParams);
            Button retryButton = pi2GovernmentidReviewBinding.retryButton;
            Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
            ViewGroup.LayoutParams layoutParams2 = retryButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = pi2GovernmentidReviewBinding.flowLayout.getWidth();
            retryButton.setLayoutParams(layoutParams2);
            pi2GovernmentidReviewBinding.flowLayout.setReferencedIds(new int[]{pi2GovernmentidReviewBinding.acceptButton.getId(), pi2GovernmentidReviewBinding.retryButton.getId()});
            governmentIdReviewRunner.binding.navigationBar.setAccessibilityTraversalAfter(R$id.retry_button);
        }
        OneShotPreDrawListener.add(pi2GovernmentidReviewBinding.acceptButton, new Runnable() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdReviewRunner$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                this.f$0.ensureNoButtonOverlap();
            }
        });
        return Unit.INSTANCE;
    }

    private final Unit applyStyles(StepStyles.GovernmentIdStepStyle styles) throws IllegalArgumentException {
        int iIntValue;
        StyleElements.FontWeight fontWeightValue;
        StepStyles.StepTextBasedComponentStyleContainer base;
        TextBasedComponentStyle base2;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding = this.binding;
        float dpToPx = (float) ExtensionsKt.getDpToPx(8.0d);
        int dpToPx2 = (int) ExtensionsKt.getDpToPx(3.0d);
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextStyling2.style$default(title, titleStyleValue, null, 2, null);
            this.binding.title.setTextColor(-1);
        }
        TextBasedComponentStyle governmentIdCaptureHintTextStyle = styles.getGovernmentIdCaptureHintTextStyle();
        if (governmentIdCaptureHintTextStyle != null) {
            TextView overlayText = this.binding.overlayText;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            TextStyling2.style(overlayText, governmentIdCaptureHintTextStyle, SetsKt.setOf(TextStyling.LineHeight));
        }
        Integer governmentIdReviewImageBoxBorderColorValue = styles.getGovernmentIdReviewImageBoxBorderColorValue();
        if (governmentIdReviewImageBoxBorderColorValue != null) {
            iIntValue = governmentIdReviewImageBoxBorderColorValue.intValue();
            pi2GovernmentidReviewBinding.progressBar.setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{iIntValue}));
        } else {
            iIntValue = -1;
        }
        TextView disclaimer = this.binding.disclaimer;
        Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = styles.getTextStyle();
        String fontNameValue = (textStyle == null || (base3 = textStyle.getBase()) == null || (base4 = base3.getBase()) == null) ? null : base4.getFontNameValue();
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2 = styles.getTextStyle();
        if (textStyle2 == null || (base = textStyle2.getBase()) == null || (base2 = base.getBase()) == null || (fontWeightValue = base2.getFontWeightValue()) == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        TextStyling2.setTypeface$default(disclaimer, fontNameValue, fontWeightValue, null, 4, null);
        Double governmentIdReviewImageBoxBorderRadiusValue = styles.getGovernmentIdReviewImageBoxBorderRadiusValue();
        if (governmentIdReviewImageBoxBorderRadiusValue != null) {
            dpToPx = (float) ExtensionsKt.getDpToPx(governmentIdReviewImageBoxBorderRadiusValue.doubleValue());
        }
        Double governmentIdReviewImageBoxBorderWidthValue = styles.getGovernmentIdReviewImageBoxBorderWidthValue();
        if (governmentIdReviewImageBoxBorderWidthValue != null) {
            dpToPx2 = (int) Math.ceil(ExtensionsKt.getDpToPx(governmentIdReviewImageBoxBorderWidthValue.doubleValue()));
        }
        pi2GovernmentidReviewBinding.spotlightView.setRadius(dpToPx2 + dpToPx);
        View view = pi2GovernmentidReviewBinding.overlay;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dpToPx);
        gradientDrawable.setStroke(dpToPx2, iIntValue);
        view.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout = pi2GovernmentidReviewBinding.overlayHint;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, dpToPx, dpToPx, dpToPx, dpToPx});
        constraintLayout.setBackground(new InsetDrawable((Drawable) gradientDrawable2, (int) ExtensionsKt.getDpToPx(6.0d)));
        ButtonComponentStyling8 submitPhotoButtonStyleValue = styles.getSubmitPhotoButtonStyleValue();
        if (submitPhotoButtonStyleValue != null) {
            Button acceptButton = pi2GovernmentidReviewBinding.acceptButton;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            ButtonStyling.style$default(acceptButton, submitPhotoButtonStyleValue, false, false, 2, null);
        }
        ButtonComponentStyling3 retakePhotoButtonStyleValue = styles.getRetakePhotoButtonStyleValue();
        if (retakePhotoButtonStyleValue != null) {
            Button retryButton = pi2GovernmentidReviewBinding.retryButton;
            Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
            ButtonStyling.style$default(retryButton, retakePhotoButtonStyleValue, false, false, 2, null);
        }
        Integer captureHintIconStrokeColor = styles.getCaptureHintIconStrokeColor();
        if (captureHintIconStrokeColor != null) {
            this.binding.overlayIcon.addColorReplacement(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
        }
        Integer captureHintIconFillColor = styles.getCaptureHintIconFillColor();
        if (captureHintIconFillColor != null) {
            this.binding.overlayIcon.addColorReplacement(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue == null) {
            return null;
        }
        this.binding.navigationBar.setControlsColor(capturePageHeaderIconColorValue.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureNoButtonOverlap() throws Resources.NotFoundException {
        Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding = this.binding;
        if (pi2GovernmentidReviewBinding.acceptButton.getTop() < pi2GovernmentidReviewBinding.disclaimerView.getBottom() + pi2GovernmentidReviewBinding.getRoot().getContext().getResources().getDimensionPixelOffset(R$dimen.pi2_governmentid_buttons_min_margin)) {
            this.constraintSet.clone(pi2GovernmentidReviewBinding.getRoot().getContext(), R$layout.pi2_governmentid_review_low_space);
            TransitionManager.beginDelayedTransition(this.binding.cameraScreenContent, new AutoTransition());
            this.constraintSet.applyTo(this.binding.cameraView);
        }
    }

    /* compiled from: GovernmentIdReviewRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdReviewRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$ReviewScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<GovernmentIdScreen2.ReviewScreen> {
        private final /* synthetic */ ViewFactory<GovernmentIdScreen2.ReviewScreen> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(GovernmentIdScreen2.ReviewScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super GovernmentIdScreen2.ReviewScreen> getType() {
            return this.$$delegate_0.getType();
        }

        /* compiled from: GovernmentIdReviewRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdReviewRunner$Companion$1 */
        /* synthetic */ class C435871 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2GovernmentidReviewBinding> {
            public static final C435871 INSTANCE = new C435871();

            C435871() {
                super(3, Pi2GovernmentidReviewBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewBinding;", 0);
            }

            public final Pi2GovernmentidReviewBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Pi2GovernmentidReviewBinding.inflate(p0, viewGroup, z);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Pi2GovernmentidReviewBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return invoke(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(GovernmentIdScreen2.ReviewScreen.class), C435871.INSTANCE, C435882.INSTANCE);
        }

        /* compiled from: GovernmentIdReviewRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdReviewRunner$Companion$2 */
        /* synthetic */ class C435882 extends FunctionReferenceImpl implements Function1<Pi2GovernmentidReviewBinding, GovernmentIdReviewRunner> {
            public static final C435882 INSTANCE = new C435882();

            C435882() {
                super(1, GovernmentIdReviewRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final GovernmentIdReviewRunner invoke(Pi2GovernmentidReviewBinding p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new GovernmentIdReviewRunner(p0);
            }
        }
    }
}
