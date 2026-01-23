package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.robinhood.utils.extensions.ResourceTypes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.resources.R$attr;
import com.withpersona.sdk2.inquiry.selfie.R$drawable;
import com.withpersona.sdk2.inquiry.selfie.R$raw;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2OldSelfieOverlayBinding;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.RemoteImageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OldSelfieOverlayView.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001EB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010*\u001a\u00020%2\u0006\u0010 \u001a\u00020!J\u000e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-J*\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020)2\b\b\u0002\u00100\u001a\u0002012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$J\u0012\u00103\u001a\u0002012\b\u00104\u001a\u0004\u0018\u000105H\u0016J&\u00106\u001a\u00020%*\u00020\u000b2\b\b\u0001\u00107\u001a\u00020\u00072\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0002J\u001c\u00108\u001a\u00020%*\u00020\u000b2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0002J\u0016\u00109\u001a\u00020:*\u00020!2\b\b\u0002\u0010;\u001a\u00020<H\u0002J\u0016\u0010=\u001a\u00020:*\u00020!2\b\b\u0002\u0010;\u001a\u00020<H\u0002J\u0016\u0010>\u001a\u00020%*\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010A\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010B\u001a\u000201J\u0014\u0010C\u001a\u00020%2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020%0$R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u0010\u0010\u0015\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2OldSelfieOverlayBinding;", "drawableLeft", "Landroid/graphics/drawable/Drawable;", "getDrawableLeft", "()Landroid/graphics/drawable/Drawable;", "drawableLeft$delegate", "Lkotlin/Lazy;", "drawableRight", "getDrawableRight", "drawableRight$delegate", "leftPoseAnimation", "rightPoseAnimation", "leftPoseImage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getLeftPoseImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "setLeftPoseImage", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "rightPoseImage", "getRightPoseImage", "setRightPoseImage", "previewView", "Landroid/view/View;", "oneShotOnCompositionLoadedListeners", "", "Lkotlin/Function0;", "", "oneShotOnAnimationCompleteListeners", "remoteImageView", "currentViewState", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$ViewState;", "setPreviewView", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "setState", "viewState", "showProgress", "", "onAnimationEnd", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "switchAnimation", "rawRes", "playBlinkAnimation", "animateHide", "Landroid/view/ViewPropertyAnimator;", "duration", "", "animateShow", "switchImageDrawable", "Landroid/widget/ImageView;", ResourceTypes.DRAWABLE, "useSelfieCaptureHintAnimations", "isPreviewClosed", "closePreview", "onComplete", "ViewState", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class OldSelfieOverlayView extends ConstraintLayout {
    private final Pi2OldSelfieOverlayBinding binding;
    private ViewState currentViewState;

    /* renamed from: drawableLeft$delegate, reason: from kotlin metadata */
    private final Lazy drawableLeft;

    /* renamed from: drawableRight$delegate, reason: from kotlin metadata */
    private final Lazy drawableRight;
    private final int leftPoseAnimation;
    private RemoteImage leftPoseImage;
    private final List<Function0<Unit>> oneShotOnAnimationCompleteListeners;
    private final List<Function0<Unit>> oneShotOnCompositionLoadedListeners;
    private View previewView;
    private View remoteImageView;
    private final int rightPoseAnimation;
    private RemoteImage rightPoseImage;

    /* compiled from: OldSelfieOverlayView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewState.values().length];
            try {
                iArr[ViewState.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewState.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewState.CENTER_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewState.LOOK_LEFT_HINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ViewState.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ViewState.LOOK_LEFT_COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ViewState.LOOK_RIGHT_HINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ViewState.LOOK_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ViewState.LOOK_RIGHT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ViewState.FINALIZING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ViewState.COMPLETE_WITH_CAPTURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ViewState.COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OldSelfieOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    public /* synthetic */ OldSelfieOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OldSelfieOverlayView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Pi2OldSelfieOverlayBinding pi2OldSelfieOverlayBindingInflate = Pi2OldSelfieOverlayBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(pi2OldSelfieOverlayBindingInflate, "inflate(...)");
        this.binding = pi2OldSelfieOverlayBindingInflate;
        this.drawableLeft = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.drawableLeft_delegate$lambda$0(context);
            }
        });
        this.drawableRight = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.drawableRight_delegate$lambda$1(context);
            }
        });
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, R$attr.personaSelfieLookLeftLottieRaw, null, false, 6, null);
        this.leftPoseAnimation = numResourceIdFromAttr$default != null ? numResourceIdFromAttr$default.intValue() : R$raw.pi2_selfie_left_pose;
        Integer numResourceIdFromAttr$default2 = ResTools.resourceIdFromAttr$default(context, R$attr.personaSelfieLookLeftLottieRaw, null, false, 6, null);
        this.rightPoseAnimation = numResourceIdFromAttr$default2 != null ? numResourceIdFromAttr$default2.intValue() : R$raw.pi2_selfie_right_pose;
        this.oneShotOnCompositionLoadedListeners = new ArrayList();
        this.oneShotOnAnimationCompleteListeners = new ArrayList();
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2OldSelfieOverlayBindingInflate.hintAnimation;
        themeableLottieAnimationView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda2
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                OldSelfieOverlayView.$r8$lambda$AdMhEWM81iHXZ1JsFXsG0y4Qjo4(this.f$0, lottieComposition);
            }
        });
        themeableLottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                List list = CollectionsKt.toList(this.this$0.oneShotOnAnimationCompleteListeners);
                this.this$0.oneShotOnAnimationCompleteListeners.clear();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
            }
        });
        int color = Color.parseColor("#022050");
        Context context2 = pi2OldSelfieOverlayBindingInflate.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        themeableLottieAnimationView.addColorReplacement(color, ResTools.getColorFromAttr$default(context2, com.google.android.material.R$attr.colorPrimaryVariant, null, false, 6, null));
        int color2 = Color.parseColor("#AA85FF");
        Context context3 = pi2OldSelfieOverlayBindingInflate.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        themeableLottieAnimationView.addColorReplacement(color2, ResTools.getColorFromAttr$default(context3, com.google.android.material.R$attr.colorSecondary, null, false, 6, null));
        int color3 = Color.parseColor("#280087");
        Context context4 = pi2OldSelfieOverlayBindingInflate.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        themeableLottieAnimationView.addColorReplacement(color3, ResTools.getColorFromAttr$default(context4, com.google.android.material.R$attr.colorPrimaryVariant, null, false, 6, null));
        int color4 = Color.parseColor("#8552FF");
        Context context5 = pi2OldSelfieOverlayBindingInflate.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        themeableLottieAnimationView.addColorReplacement(color4, ResTools.getColorFromAttr$default(context5, com.google.android.material.R$attr.colorSecondary, null, false, 6, null));
        Context context6 = pi2OldSelfieOverlayBindingInflate.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        int colorFromAttr$default = ResTools.getColorFromAttr$default(context6, com.google.android.material.R$attr.colorSecondary, null, false, 6, null);
        Context context7 = pi2OldSelfieOverlayBindingInflate.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        themeableLottieAnimationView.addColorReplacement(Color.parseColor("#DBCCFF"), ColorUtils.blendARGB(colorFromAttr$default, ResTools.getColorFromAttr$default(context7, com.google.android.material.R$attr.colorSurface, null, false, 6, null), 0.66f));
    }

    private final Drawable getDrawableLeft() {
        return (Drawable) this.drawableLeft.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable drawableLeft_delegate$lambda$0(Context context) {
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, R$attr.personaSelfieLookLeftDrawable, null, false, 6, null);
        if (numResourceIdFromAttr$default != null) {
            return ContextCompat.getDrawable(context, numResourceIdFromAttr$default.intValue());
        }
        return ContextCompat.getDrawable(context, R$drawable.pi2_ic_selfie_left);
    }

    private final Drawable getDrawableRight() {
        return (Drawable) this.drawableRight.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable drawableRight_delegate$lambda$1(Context context) {
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, R$attr.personaSelfieLookRightDrawable, null, false, 6, null);
        if (numResourceIdFromAttr$default != null) {
            return ContextCompat.getDrawable(context, numResourceIdFromAttr$default.intValue());
        }
        return ContextCompat.getDrawable(context, R$drawable.pi2_ic_selfie_right);
    }

    public final RemoteImage getLeftPoseImage() {
        return this.leftPoseImage;
    }

    public final void setLeftPoseImage(RemoteImage remoteImage) {
        this.leftPoseImage = remoteImage;
    }

    public final RemoteImage getRightPoseImage() {
        return this.rightPoseImage;
    }

    public final void setRightPoseImage(RemoteImage remoteImage) {
        this.rightPoseImage = remoteImage;
    }

    public static void $r8$lambda$AdMhEWM81iHXZ1JsFXsG0y4Qjo4(OldSelfieOverlayView oldSelfieOverlayView, LottieComposition lottieComposition) {
        List list = CollectionsKt.toList(oldSelfieOverlayView.oneShotOnCompositionLoadedListeners);
        oldSelfieOverlayView.oneShotOnCompositionLoadedListeners.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    public final void setPreviewView(View previewView) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        this.previewView = previewView;
    }

    public final void applyStyles(StepStyles.SelfieStepStyle styles) {
        Intrinsics.checkNotNullParameter(styles, "styles");
        Integer selfieCaptureFeedBoxBorderColorValue = styles.getSelfieCaptureFeedBoxBorderColorValue();
        if (selfieCaptureFeedBoxBorderColorValue != null) {
            this.binding.progressArc.setStrokeColor(selfieCaptureFeedBoxBorderColorValue.intValue());
        }
        Double selfieCaptureFeedBoxBorderWidthValue = styles.getSelfieCaptureFeedBoxBorderWidthValue();
        if (selfieCaptureFeedBoxBorderWidthValue != null) {
            this.binding.progressArc.setStrokeWidth((float) ExtensionsKt.getDpToPx(selfieCaptureFeedBoxBorderWidthValue.doubleValue()));
        }
        Integer selfieCaptureIconStrokeColor = styles.getSelfieCaptureIconStrokeColor();
        if (selfieCaptureIconStrokeColor != null) {
            int iIntValue = selfieCaptureIconStrokeColor.intValue();
            this.binding.hintAnimation.addColorReplacement(Color.parseColor("#022050"), iIntValue);
            this.binding.hintAnimation.addColorReplacement(Color.parseColor("#280087"), iIntValue);
        }
        Integer selfieCaptureIconFillColor = styles.getSelfieCaptureIconFillColor();
        if (selfieCaptureIconFillColor != null) {
            int iIntValue2 = selfieCaptureIconFillColor.intValue();
            this.binding.hintAnimation.addColorReplacement(Color.parseColor("#AA85FF"), iIntValue2);
            this.binding.hintAnimation.addColorReplacement(Color.parseColor("#8552FF"), iIntValue2);
        }
        Integer selfieCaptureIconBackgroundFillColor = styles.getSelfieCaptureIconBackgroundFillColor();
        if (selfieCaptureIconBackgroundFillColor != null) {
            this.binding.hintAnimation.addColorReplacement(Color.parseColor("#DBCCFF"), selfieCaptureIconBackgroundFillColor.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setState$default(OldSelfieOverlayView oldSelfieOverlayView, ViewState viewState, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        oldSelfieOverlayView.setState(viewState, z, (Function0<Unit>) function0);
    }

    public final void setState(ViewState viewState, boolean showProgress, final Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (this.currentViewState == viewState) {
            return;
        }
        this.currentViewState = viewState;
        removeView(this.remoteImageView);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zUseSelfieCaptureHintAnimations = useSelfieCaptureHintAnimations(context);
        Pi2OldSelfieOverlayBinding pi2OldSelfieOverlayBinding = this.binding;
        if (showProgress) {
            pi2OldSelfieOverlayBinding.progressArc.setVisibility(0);
        } else {
            pi2OldSelfieOverlayBinding.progressArc.setVisibility(8);
        }
        switch (WhenMappings.$EnumSwitchMapping$0[viewState.ordinal()]) {
            case 1:
                pi2OldSelfieOverlayBinding.circleMask.open();
                pi2OldSelfieOverlayBinding.progressArc.setProgress(0.0f, onAnimationEnd);
                return;
            case 2:
                Pi2CircleMaskView.close$default(pi2OldSelfieOverlayBinding.circleMask, false, null, 3, null);
                pi2OldSelfieOverlayBinding.progressArc.setProgress(0.0f, onAnimationEnd);
                return;
            case 3:
                Pi2CircleMaskView.close$default(pi2OldSelfieOverlayBinding.circleMask, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(pi2OldSelfieOverlayBinding.progressArc, 0.0f, null, 2, null);
                playBlinkAnimation(this.binding, onAnimationEnd);
                return;
            case 4:
                Pi2CircleMaskView.close$default(pi2OldSelfieOverlayBinding.circleMask, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(pi2OldSelfieOverlayBinding.progressArc, 0.0f, null, 2, null);
                if (zUseSelfieCaptureHintAnimations) {
                    switchAnimation(this.binding, this.leftPoseAnimation, onAnimationEnd);
                    return;
                } else {
                    if (onAnimationEnd != null) {
                        onAnimationEnd.invoke();
                        return;
                    }
                    return;
                }
            case 5:
                Pi2CircleMaskView.close$default(pi2OldSelfieOverlayBinding.circleMask, false, null, 3, null);
                pi2OldSelfieOverlayBinding.progressArc.setProgress(0.0f, onAnimationEnd);
                if (zUseSelfieCaptureHintAnimations) {
                    return;
                }
                RemoteImage remoteImage = this.leftPoseImage;
                if (remoteImage != null) {
                    this.remoteImageView = RemoteImageUtils.renderToContainer(remoteImage, this, true);
                    return;
                }
                pi2OldSelfieOverlayBinding.imageOverlayView.setVisibility(0);
                ImageView hintImage = pi2OldSelfieOverlayBinding.hintImage;
                Intrinsics.checkNotNullExpressionValue(hintImage, "hintImage");
                switchImageDrawable(hintImage, getDrawableLeft());
                return;
            case 6:
                Pi2CircleMaskView.close$default(pi2OldSelfieOverlayBinding.circleMask, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(pi2OldSelfieOverlayBinding.progressArc, 50.0f, null, 2, null);
                playBlinkAnimation(this.binding, onAnimationEnd);
                return;
            case 7:
                Pi2CircleMaskView.close$default(pi2OldSelfieOverlayBinding.circleMask, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(pi2OldSelfieOverlayBinding.progressArc, 50.0f, null, 2, null);
                if (zUseSelfieCaptureHintAnimations) {
                    switchAnimation(this.binding, this.rightPoseAnimation, onAnimationEnd);
                    return;
                } else {
                    if (onAnimationEnd != null) {
                        onAnimationEnd.invoke();
                        return;
                    }
                    return;
                }
            case 8:
                Pi2CircleMaskView.close$default(pi2OldSelfieOverlayBinding.circleMask, false, null, 3, null);
                pi2OldSelfieOverlayBinding.progressArc.setProgress(50.0f, onAnimationEnd);
                if (zUseSelfieCaptureHintAnimations) {
                    return;
                }
                RemoteImage remoteImage2 = this.rightPoseImage;
                if (remoteImage2 != null) {
                    this.remoteImageView = RemoteImageUtils.renderToContainer(remoteImage2, this, true);
                    return;
                }
                pi2OldSelfieOverlayBinding.imageOverlayView.setVisibility(0);
                ImageView hintImage2 = pi2OldSelfieOverlayBinding.hintImage;
                Intrinsics.checkNotNullExpressionValue(hintImage2, "hintImage");
                switchImageDrawable(hintImage2, getDrawableRight());
                return;
            case 9:
                Pi2CircleMaskView.close$default(pi2OldSelfieOverlayBinding.circleMask, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(pi2OldSelfieOverlayBinding.progressArc, 100.0f, null, 2, null);
                playBlinkAnimation(this.binding, onAnimationEnd);
                return;
            case 10:
                Pi2CircleMaskView.close$default(pi2OldSelfieOverlayBinding.circleMask, false, null, 3, null);
                pi2OldSelfieOverlayBinding.progressArc.setIndeterminate();
                return;
            case 11:
                Pi2CircleMaskView.close$default(pi2OldSelfieOverlayBinding.circleMask, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(pi2OldSelfieOverlayBinding.progressArc, 100.0f, null, 2, null);
                playBlinkAnimation(this.binding, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OldSelfieOverlayView.setState$lambda$12$lambda$10(this.f$0, onAnimationEnd);
                    }
                });
                return;
            case 12:
                Pi2CircleMaskView.close$default(pi2OldSelfieOverlayBinding.circleMask, false, null, 3, null);
                pi2OldSelfieOverlayBinding.progressArc.setProgress(100.0f, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OldSelfieOverlayView.setState$lambda$12$lambda$11(this.f$0, onAnimationEnd);
                    }
                });
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$12$lambda$10(OldSelfieOverlayView oldSelfieOverlayView, Function0 function0) {
        oldSelfieOverlayView.switchAnimation(oldSelfieOverlayView.binding, R$raw.pi2_selfie_capture_success, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$12$lambda$11(OldSelfieOverlayView oldSelfieOverlayView, Function0 function0) {
        oldSelfieOverlayView.switchAnimation(oldSelfieOverlayView.binding, R$raw.pi2_selfie_capture_success, function0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OldSelfieOverlayView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$ViewState;", "", "<init>", "(Ljava/lang/String;I)V", "CLEAR", "CENTER", "CENTER_COMPLETE", "LOOK_LEFT_HINT", "LOOK_LEFT", "LOOK_LEFT_COMPLETE", "LOOK_RIGHT_HINT", "LOOK_RIGHT", "LOOK_RIGHT_COMPLETE", "FINALIZING", "COMPLETE_WITH_CAPTURE", "COMPLETE", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ViewState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewState[] $VALUES;
        public static final ViewState CLEAR = new ViewState("CLEAR", 0);
        public static final ViewState CENTER = new ViewState("CENTER", 1);
        public static final ViewState CENTER_COMPLETE = new ViewState("CENTER_COMPLETE", 2);
        public static final ViewState LOOK_LEFT_HINT = new ViewState("LOOK_LEFT_HINT", 3);
        public static final ViewState LOOK_LEFT = new ViewState("LOOK_LEFT", 4);
        public static final ViewState LOOK_LEFT_COMPLETE = new ViewState("LOOK_LEFT_COMPLETE", 5);
        public static final ViewState LOOK_RIGHT_HINT = new ViewState("LOOK_RIGHT_HINT", 6);
        public static final ViewState LOOK_RIGHT = new ViewState("LOOK_RIGHT", 7);
        public static final ViewState LOOK_RIGHT_COMPLETE = new ViewState("LOOK_RIGHT_COMPLETE", 8);
        public static final ViewState FINALIZING = new ViewState("FINALIZING", 9);
        public static final ViewState COMPLETE_WITH_CAPTURE = new ViewState("COMPLETE_WITH_CAPTURE", 10);
        public static final ViewState COMPLETE = new ViewState("COMPLETE", 11);

        private static final /* synthetic */ ViewState[] $values() {
            return new ViewState[]{CLEAR, CENTER, CENTER_COMPLETE, LOOK_LEFT_HINT, LOOK_LEFT, LOOK_LEFT_COMPLETE, LOOK_RIGHT_HINT, LOOK_RIGHT, LOOK_RIGHT_COMPLETE, FINALIZING, COMPLETE_WITH_CAPTURE, COMPLETE};
        }

        public static EnumEntries<ViewState> getEntries() {
            return $ENTRIES;
        }

        private ViewState(String str, int i) {
        }

        static {
            ViewState[] viewStateArr$values = $values();
            $VALUES = viewStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewStateArr$values);
        }

        public static ViewState valueOf(String str) {
            return (ViewState) Enum.valueOf(ViewState.class, str);
        }

        public static ViewState[] values() {
            return (ViewState[]) $VALUES.clone();
        }
    }

    private final void switchAnimation(final Pi2OldSelfieOverlayBinding pi2OldSelfieOverlayBinding, int i, final Function0<Unit> function0) {
        this.oneShotOnCompositionLoadedListeners.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.switchAnimation$lambda$16(pi2OldSelfieOverlayBinding, this, function0);
            }
        });
        pi2OldSelfieOverlayBinding.hintAnimation.setAnimation(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit switchAnimation$lambda$16(final Pi2OldSelfieOverlayBinding pi2OldSelfieOverlayBinding, final OldSelfieOverlayView oldSelfieOverlayView, final Function0 function0) {
        pi2OldSelfieOverlayBinding.hintAnimation.setFrame(0);
        ThemeableLottieAnimationView hintAnimation = pi2OldSelfieOverlayBinding.hintAnimation;
        Intrinsics.checkNotNullExpressionValue(hintAnimation, "hintAnimation");
        animateShow$default(oldSelfieOverlayView, hintAnimation, 0L, 1, null).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.switchAnimation$lambda$16$lambda$15(this.f$0, pi2OldSelfieOverlayBinding, function0);
            }
        });
        View hintOverlayView = pi2OldSelfieOverlayBinding.hintOverlayView;
        Intrinsics.checkNotNullExpressionValue(hintOverlayView, "hintOverlayView");
        animateShow$default(oldSelfieOverlayView, hintOverlayView, 0L, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void switchAnimation$lambda$16$lambda$15(final OldSelfieOverlayView oldSelfieOverlayView, final Pi2OldSelfieOverlayBinding pi2OldSelfieOverlayBinding, final Function0 function0) {
        oldSelfieOverlayView.oneShotOnAnimationCompleteListeners.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.switchAnimation$lambda$16$lambda$15$lambda$14(this.f$0, pi2OldSelfieOverlayBinding, function0);
            }
        });
        pi2OldSelfieOverlayBinding.hintAnimation.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit switchAnimation$lambda$16$lambda$15$lambda$14(OldSelfieOverlayView oldSelfieOverlayView, Pi2OldSelfieOverlayBinding pi2OldSelfieOverlayBinding, final Function0 function0) {
        ThemeableLottieAnimationView hintAnimation = pi2OldSelfieOverlayBinding.hintAnimation;
        Intrinsics.checkNotNullExpressionValue(hintAnimation, "hintAnimation");
        animateHide$default(oldSelfieOverlayView, hintAnimation, 0L, 1, null).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.switchAnimation$lambda$16$lambda$15$lambda$14$lambda$13(function0);
            }
        });
        View hintOverlayView = pi2OldSelfieOverlayBinding.hintOverlayView;
        Intrinsics.checkNotNullExpressionValue(hintOverlayView, "hintOverlayView");
        animateHide$default(oldSelfieOverlayView, hintOverlayView, 0L, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void switchAnimation$lambda$16$lambda$15$lambda$14$lambda$13(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void playBlinkAnimation(final Pi2OldSelfieOverlayBinding pi2OldSelfieOverlayBinding, final Function0<Unit> function0) {
        View blindsView = pi2OldSelfieOverlayBinding.blindsView;
        Intrinsics.checkNotNullExpressionValue(blindsView, "blindsView");
        animateShow(blindsView, 80L).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.playBlinkAnimation$lambda$18(this.f$0, pi2OldSelfieOverlayBinding, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playBlinkAnimation$lambda$18(OldSelfieOverlayView oldSelfieOverlayView, Pi2OldSelfieOverlayBinding pi2OldSelfieOverlayBinding, final Function0 function0) {
        View blindsView = pi2OldSelfieOverlayBinding.blindsView;
        Intrinsics.checkNotNullExpressionValue(blindsView, "blindsView");
        oldSelfieOverlayView.animateHide(blindsView, 80L).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.playBlinkAnimation$lambda$18$lambda$17(function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playBlinkAnimation$lambda$18$lambda$17(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    static /* synthetic */ ViewPropertyAnimator animateHide$default(OldSelfieOverlayView oldSelfieOverlayView, View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 200;
        }
        return oldSelfieOverlayView.animateHide(view, j);
    }

    private final ViewPropertyAnimator animateHide(final View view, long j) {
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().alpha(0.0f).setDuration(j).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(4);
            }
        });
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorWithEndAction, "withEndAction(...)");
        return viewPropertyAnimatorWithEndAction;
    }

    static /* synthetic */ ViewPropertyAnimator animateShow$default(OldSelfieOverlayView oldSelfieOverlayView, View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 200;
        }
        return oldSelfieOverlayView.animateShow(view, j);
    }

    private final ViewPropertyAnimator animateShow(View view, long j) {
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(j);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        return duration;
    }

    private final void switchImageDrawable(final ImageView imageView, Drawable drawable) {
        if (Intrinsics.areEqual(imageView.getDrawable(), drawable)) {
            return;
        }
        if (drawable == null) {
            animateHide$default(this, imageView, 0L, 1, null).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    imageView.setImageDrawable(null);
                }
            });
            return;
        }
        imageView.setImageDrawable(drawable);
        imageView.setAlpha(0.0f);
        animateShow$default(this, imageView, 0L, 1, null);
    }

    private final boolean useSelfieCaptureHintAnimations(Context context) {
        return (ResTools.resourceIdFromAttr$default(context, R$attr.personaSelfieLookLeftDrawable, null, false, 6, null) == null || ResTools.resourceIdFromAttr$default(context, R$attr.personaSelfieLookRightDrawable, null, false, 6, null) == null) && this.leftPoseImage == null && this.rightPoseImage == null;
    }

    public final boolean isPreviewClosed() {
        return this.binding.circleMask.isClosed();
    }

    public final void closePreview(Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Pi2CircleMaskView.close$default(this.binding.circleMask, false, onComplete, 1, null);
    }
}
