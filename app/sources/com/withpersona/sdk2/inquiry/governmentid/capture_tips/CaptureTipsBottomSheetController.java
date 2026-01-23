package com.withpersona.sdk2.inquiry.governmentid.capture_tips;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.squareup.workflow1.p415ui.BackPressHandler;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCaptureTipsBinding;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.resources.R$raw;
import com.withpersona.sdk2.inquiry.shared.p422ui.BottomSheetUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.BottomSheetStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ImageStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.RemoteImageUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CaptureTipsBottomSheetController.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\u0011J\b\u0010\u0019\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsBottomSheetController;", "", "contentView", "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "binding", "Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidCaptureTipsBinding;", "value", "", "isShowing", "setShowing", "(Z)V", "setup", "currentAssetIllustrationView", "Landroid/view/View;", "show", "", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "viewModel", "Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsViewModel;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "updateBackPressedHandler", "setupIfNeeded", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class CaptureTipsBottomSheetController {
    private Pi2GovernmentidCaptureTipsBinding binding;
    private final ViewGroup contentView;
    private View currentAssetIllustrationView;
    private boolean isShowing;
    private boolean setup;

    /* compiled from: CaptureTipsBottomSheetController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdConfig.Side.values().length];
            try {
                iArr[IdConfig.Side.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.Side.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.Side.BarcodePdf417.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CaptureTipsBottomSheetController(ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
    }

    private final void setShowing(boolean z) {
        this.isShowing = z;
        updateBackPressedHandler();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void show(StepStyles.GovernmentIdStepStyle styles, CaptureTipsViewModel viewModel, NextStep.GovernmentId.AssetConfig.CapturePage assetConfig) {
        RemoteImage idFrontHelpModalPictograph;
        int i;
        StyleElements.SizeSet modalPaddingValue;
        Double dp;
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle;
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonComponentStyling8 base2;
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        final Pi2GovernmentidCaptureTipsBinding pi2GovernmentidCaptureTipsBindingInflate = this.binding;
        if (pi2GovernmentidCaptureTipsBindingInflate == null) {
            pi2GovernmentidCaptureTipsBindingInflate = Pi2GovernmentidCaptureTipsBinding.inflate(LayoutInflater.from(this.contentView.getContext()), this.contentView, true);
            Intrinsics.checkNotNullExpressionValue(pi2GovernmentidCaptureTipsBindingInflate, "inflate(...)");
        }
        this.binding = pi2GovernmentidCaptureTipsBindingInflate;
        setupIfNeeded();
        setShowing(true);
        TextView title = pi2GovernmentidCaptureTipsBindingInflate.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        ExtensionsKt.setMarkdown(title, viewModel.getTitle());
        TextView prompt = pi2GovernmentidCaptureTipsBindingInflate.prompt;
        Intrinsics.checkNotNullExpressionValue(prompt, "prompt");
        ExtensionsKt.setMarkdown(prompt, viewModel.getPrompt());
        TextView tips = pi2GovernmentidCaptureTipsBindingInflate.tips;
        Intrinsics.checkNotNullExpressionValue(tips, "tips");
        ExtensionsKt.setMarkdown(tips, viewModel.getTips());
        pi2GovernmentidCaptureTipsBindingInflate.captureButton.setText(viewModel.getButtonText());
        final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(pi2GovernmentidCaptureTipsBindingInflate.bottomSheet);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        if (styles != null && (titleStyle = styles.getTitleStyle()) != null && (base5 = titleStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            TextView title2 = pi2GovernmentidCaptureTipsBindingInflate.title;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            TextStyling2.style$default(title2, base6, null, 2, null);
        }
        if (styles != null && (textStyle = styles.getTextStyle()) != null && (base3 = textStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextView prompt2 = pi2GovernmentidCaptureTipsBindingInflate.prompt;
            Intrinsics.checkNotNullExpressionValue(prompt2, "prompt");
            TextStyling2.style$default(prompt2, base4, null, 2, null);
            TextView tips2 = pi2GovernmentidCaptureTipsBindingInflate.tips;
            Intrinsics.checkNotNullExpressionValue(tips2, "tips");
            TextStyling2.style$default(tips2, base4, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyle = styles.getButtonPrimaryStyle()) != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            Button captureButton = pi2GovernmentidCaptureTipsBindingInflate.captureButton;
            Intrinsics.checkNotNullExpressionValue(captureButton, "captureButton");
            ButtonStyling.style$default(captureButton, base2, false, false, 6, null);
        }
        LinearLayout bottomSheetContent = pi2GovernmentidCaptureTipsBindingInflate.bottomSheetContent;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        BottomSheetStyling2.applyBottomSheetStyles$default(bottomSheetContent, styles, null, null, 6, null);
        if (styles != null && (modalPaddingValue = styles.getModalPaddingValue()) != null) {
            Button captureButton2 = pi2GovernmentidCaptureTipsBindingInflate.captureButton;
            Intrinsics.checkNotNullExpressionValue(captureButton2, "captureButton");
            ViewGroup.LayoutParams layoutParams = captureButton2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                StyleElements.Size top = modalPaddingValue.getTop();
                if (top != null && (dp = top.getDp()) != null) {
                    marginLayoutParams.topMargin = (int) com.withpersona.sdk2.inquiry.shared.ExtensionsKt.getDpToPx(dp.doubleValue());
                }
                captureButton2.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        IdConfig.Side side = viewModel.getSide();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[side.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    idFrontHelpModalPictograph = assetConfig != null ? assetConfig.getIdFrontHelpModalPictograph() : null;
                } else if (assetConfig != null) {
                    idFrontHelpModalPictograph = assetConfig.getBarcodeHelpModalPictograph();
                }
            } else if (assetConfig != null) {
                idFrontHelpModalPictograph = assetConfig.getIdBackHelpModalPictograph();
            }
        } else if (assetConfig != null) {
            idFrontHelpModalPictograph = assetConfig.getIdFrontHelpModalPictograph();
        }
        if (idFrontHelpModalPictograph != null) {
            if (this.currentAssetIllustrationView == null) {
                ConstraintLayout illustrationContainer = pi2GovernmentidCaptureTipsBindingInflate.illustrationContainer;
                Intrinsics.checkNotNullExpressionValue(illustrationContainer, "illustrationContainer");
                this.currentAssetIllustrationView = RemoteImageUtils.renderToContainer$default(idFrontHelpModalPictograph, illustrationContainer, false, 2, null);
                pi2GovernmentidCaptureTipsBindingInflate.illustration.setVisibility(8);
            }
        } else {
            int i3 = iArr[viewModel.getSide().ordinal()];
            if (i3 == 1) {
                i = R$raw.pi2_capture_tips_front_lottie;
            } else if (i3 == 2) {
                i = R$raw.pi2_capture_tips_back_lottie;
            } else if (i3 == 3) {
                i = R$raw.pi2_capture_tips_barcode_lottie;
            } else {
                i = R$raw.pi2_capture_tips_front_lottie;
            }
            pi2GovernmentidCaptureTipsBindingInflate.illustration.setAnimation(i);
            int i4 = iArr[viewModel.getSide().ordinal()];
            if (i4 == 2) {
                ThemeableLottieAnimationView illustration = pi2GovernmentidCaptureTipsBindingInflate.illustration;
                Intrinsics.checkNotNullExpressionValue(illustration, "illustration");
                ImageStyling.replaceColors(illustration, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, new String[]{"#000000", "#190051"}, new String[]{"#AA84FF"}, new String[0]);
            } else if (i4 == 3) {
                ThemeableLottieAnimationView illustration2 = pi2GovernmentidCaptureTipsBindingInflate.illustration;
                Intrinsics.checkNotNullExpressionValue(illustration2, "illustration");
                ImageStyling.replaceColors(illustration2, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, new String[]{"#190051"}, new String[]{"#AA84FF", "#AA85FF"}, new String[0]);
            } else {
                ThemeableLottieAnimationView illustration3 = pi2GovernmentidCaptureTipsBindingInflate.illustration;
                Intrinsics.checkNotNullExpressionValue(illustration3, "illustration");
                ImageStyling.replaceColors(illustration3, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, new String[]{"#000000"}, new String[]{"#8751FF"}, new String[0]);
            }
        }
        Space bottomInset = pi2GovernmentidCaptureTipsBindingInflate.bottomInset;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        InsetsUtils.onInsetsChanged(bottomInset, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsBottomSheetController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureTipsBottomSheetController.show$lambda$7(pi2GovernmentidCaptureTipsBindingInflate, (WindowInsetsCompat) obj);
            }
        });
        pi2GovernmentidCaptureTipsBindingInflate.getRoot().postDelayed(new Runnable() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsBottomSheetController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                bottomSheetBehaviorFrom.setState(3);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit show$lambda$7(Pi2GovernmentidCaptureTipsBinding pi2GovernmentidCaptureTipsBinding, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space bottomInset = pi2GovernmentidCaptureTipsBinding.bottomInset;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        ViewGroup.LayoutParams layoutParams = bottomInset.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = insetsIgnoringVisibility.bottom;
            bottomInset.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void updateBackPressedHandler() {
        final Pi2GovernmentidCaptureTipsBinding pi2GovernmentidCaptureTipsBinding = this.binding;
        if (pi2GovernmentidCaptureTipsBinding == null) {
            return;
        }
        if (this.isShowing) {
            FrameLayout root = pi2GovernmentidCaptureTipsBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            BackPressHandler.setBackPressedHandler(root, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsBottomSheetController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CaptureTipsBottomSheetController.updateBackPressedHandler$lambda$9(pi2GovernmentidCaptureTipsBinding);
                }
            });
        } else {
            FrameLayout root2 = pi2GovernmentidCaptureTipsBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            BackPressHandler.setBackPressedHandler(root2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateBackPressedHandler$lambda$9(Pi2GovernmentidCaptureTipsBinding pi2GovernmentidCaptureTipsBinding) {
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(pi2GovernmentidCaptureTipsBinding.bottomSheet);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        bottomSheetBehaviorFrom.setState(5);
        FrameLayout root = pi2GovernmentidCaptureTipsBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BackPressHandler.setBackPressedHandler(root, null);
        return Unit.INSTANCE;
    }

    private final void setupIfNeeded() {
        Pi2GovernmentidCaptureTipsBinding pi2GovernmentidCaptureTipsBinding = this.binding;
        if (pi2GovernmentidCaptureTipsBinding == null || this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(pi2GovernmentidCaptureTipsBinding.bottomSheet);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsBottomSheetController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CaptureTipsBottomSheetController.setupIfNeeded$lambda$10(this.f$0);
            }
        };
        FrameLayout bottomSheet = pi2GovernmentidCaptureTipsBinding.bottomSheet;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        BottomSheetUtils.setup(bottomSheetBehaviorFrom, function0, bottomSheet, pi2GovernmentidCaptureTipsBinding.bottomSheetContent, pi2GovernmentidCaptureTipsBinding.shadow);
        pi2GovernmentidCaptureTipsBinding.shadow.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsBottomSheetController$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bottomSheetBehaviorFrom.setState(5);
            }
        });
        pi2GovernmentidCaptureTipsBinding.captureButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsBottomSheetController$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bottomSheetBehaviorFrom.setState(5);
            }
        });
        bottomSheetBehaviorFrom.setUpdateImportantForAccessibilityOnSiblings(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupIfNeeded$lambda$10(CaptureTipsBottomSheetController captureTipsBottomSheetController) {
        captureTipsBottomSheetController.setShowing(false);
        return Unit.INSTANCE;
    }
}
