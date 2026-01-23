package com.withpersona.sdk2.inquiry.p424ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling3;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.p424ui.databinding.Pi2SignatureBottomSheetBinding;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.p422ui.BottomSheetUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.BottomSheetStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SignatureBottomSheetController.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005Jb\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!28\u0010\"\u001a4\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0012J\u0006\u0010#\u001a\u00020\u0010J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0002J\u001a\u0010'\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\r\u0010\u000e*\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000RB\u0010\u0011\u001a6\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/SignatureBottomSheetController;", "", "contentView", "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "lazyBinding", "Lkotlin/Lazy;", "Lcom/withpersona/sdk2/inquiry/ui/databinding/Pi2SignatureBottomSheetBinding;", "Lkotlin/jvm/internal/EnhancedNullability;", "binding", "getBinding$delegate", "(Lcom/withpersona/sdk2/inquiry/ui/SignatureBottomSheetController;)Ljava/lang/Object;", "getBinding", "()Lcom/withpersona/sdk2/inquiry/ui/databinding/Pi2SignatureBottomSheetBinding;", "setup", "", "currentOnCompleteListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "cancelled", "Landroid/graphics/Bitmap;", "result", "", "show", "component", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "stepStyles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "onComplete", "close", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "setupIfNeeded", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SignatureBottomSheetController {
    private final ViewGroup contentView;
    private Function2<? super Boolean, ? super Bitmap, Unit> currentOnCompleteListener;
    private final Lazy<Pi2SignatureBottomSheetBinding> lazyBinding;
    private boolean setup;

    public SignatureBottomSheetController(ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.SignatureBottomSheetController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SignatureBottomSheetController.lazyBinding$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pi2SignatureBottomSheetBinding lazyBinding$lambda$0(SignatureBottomSheetController signatureBottomSheetController) {
        return Pi2SignatureBottomSheetBinding.inflate(LayoutInflater.from(signatureBottomSheetController.contentView.getContext()), signatureBottomSheetController.contentView, true);
    }

    private final Pi2SignatureBottomSheetBinding getBinding() {
        return this.lazyBinding.getValue();
    }

    public final void show(ESignatureComponent component, ESignature config, StepStyles.UiStepStyle stepStyles, ViewEnvironment viewEnvironment, Function2<? super Boolean, ? super Bitmap, Unit> onComplete) {
        String dialogText;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        setupIfNeeded(stepStyles, viewEnvironment);
        this.currentOnCompleteListener = onComplete;
        getBinding().signatureCanvas.clearCanvas();
        TextView textView = getBinding().signatureLabel;
        ESignature.Attributes attributes = config.getAttributes();
        textView.setText(attributes != null ? attributes.getDialogTitle() : null);
        TextView textView2 = getBinding().signatureDescription;
        ESignature.Attributes attributes2 = config.getAttributes();
        if (attributes2 == null || (dialogText = attributes2.getDialogText()) == null) {
            dialogText = "";
        }
        textView2.setText(dialogText);
        ESignature.ESignatureComponentStyle styles = config.getStyles();
        if (styles != null) {
            applyStyles(styles);
        }
        getBinding().getRoot().postDelayed(new Runnable() { // from class: com.withpersona.sdk2.inquiry.ui.SignatureBottomSheetController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SignatureBottomSheetController.show$lambda$2(this.f$0);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(SignatureBottomSheetController signatureBottomSheetController) {
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(signatureBottomSheetController.getBinding().bottomSheet);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        bottomSheetBehaviorFrom.setState(3);
    }

    public final boolean close() {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(getBinding().bottomSheet);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        if (bottomSheetBehaviorFrom.getState() == 5) {
            return false;
        }
        bottomSheetBehaviorFrom.setState(5);
        return true;
    }

    private final void applyStyles(ESignature.ESignatureComponentStyle styles) throws IllegalArgumentException {
        TextBasedComponentStyle dialogTitleStyle = styles.getDialogTitleStyle();
        if (dialogTitleStyle != null) {
            TextView signatureLabel = getBinding().signatureLabel;
            Intrinsics.checkNotNullExpressionValue(signatureLabel, "signatureLabel");
            TextStyling2.style$default(signatureLabel, dialogTitleStyle, null, 2, null);
        }
        TextBasedComponentStyle dialogTextStyle = styles.getDialogTextStyle();
        if (dialogTextStyle != null) {
            TextView signatureDescription = getBinding().signatureDescription;
            Intrinsics.checkNotNullExpressionValue(signatureDescription, "signatureDescription");
            TextStyling2.style$default(signatureDescription, dialogTextStyle, null, 2, null);
        }
        Integer baseBackgroundColorValue = styles.getInputTextStyle().getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            getBinding().signatureCanvas.setCardBackgroundColor(baseBackgroundColorValue.intValue());
        }
        Double borderRadiusValue = styles.getInputTextStyle().getBorderRadiusValue();
        if (borderRadiusValue != null) {
            getBinding().signatureCanvas.setRadius((float) Math.ceil(ExtensionsKt.getDpToPx(borderRadiusValue.doubleValue())));
        }
        Double borderWidthValue = styles.getInputTextStyle().getBorderWidthValue();
        if (borderWidthValue != null) {
            getBinding().signatureCanvas.setStrokeWidth((int) Math.ceil(ExtensionsKt.getDpToPx(borderWidthValue.doubleValue())));
        }
        Integer baseBorderColorValue = styles.getInputTextStyle().getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            getBinding().signatureCanvas.setStrokeColor(baseBorderColorValue.intValue());
        }
        ButtonComponentStyling8 submitButtonStyle = styles.getSubmitButtonStyle();
        if (submitButtonStyle != null) {
            Button saveButton = getBinding().saveButton;
            Intrinsics.checkNotNullExpressionValue(saveButton, "saveButton");
            ButtonStyling.style$default(saveButton, submitButtonStyle, false, false, 6, null);
        }
        ButtonComponentStyling3 clearSignatureButtonStyle = styles.getClearSignatureButtonStyle();
        if (clearSignatureButtonStyle != null) {
            Button clearButton = getBinding().clearButton;
            Intrinsics.checkNotNullExpressionValue(clearButton, "clearButton");
            ButtonStyling.style$default(clearButton, clearSignatureButtonStyle, false, false, 6, null);
        }
    }

    private final void setupIfNeeded(StepStyles.UiStepStyle stepStyles, ViewEnvironment viewEnvironment) {
        if (this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(getBinding().bottomSheet);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.SignatureBottomSheetController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SignatureBottomSheetController.setupIfNeeded$lambda$11(this.f$0);
            }
        };
        FrameLayout bottomSheet = getBinding().bottomSheet;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        BottomSheetUtils.setup(bottomSheetBehaviorFrom, function0, bottomSheet, getBinding().signatureSheet, getBinding().shadow);
        bottomSheetBehaviorFrom.setDraggable(false);
        getBinding().closeSignatureSheetButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.SignatureBottomSheetController$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bottomSheetBehaviorFrom.setState(5);
            }
        });
        getBinding().clearButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.SignatureBottomSheetController$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignatureBottomSheetController.setupIfNeeded$lambda$13(this.f$0, view);
            }
        });
        getBinding().saveButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.SignatureBottomSheetController$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignatureBottomSheetController.setupIfNeeded$lambda$14(this.f$0, bottomSheetBehaviorFrom, view);
            }
        });
        ConstraintLayout signatureSheet = getBinding().signatureSheet;
        Intrinsics.checkNotNullExpressionValue(signatureSheet, "signatureSheet");
        BottomSheetStyling2.applyBottomSheetStyles$default(signatureSheet, stepStyles, null, new Rect(0, (int) ExtensionsKt.getDpToPx(12.0d), 0, 0), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupIfNeeded$lambda$11(SignatureBottomSheetController signatureBottomSheetController) {
        Function2<? super Boolean, ? super Bitmap, Unit> function2 = signatureBottomSheetController.currentOnCompleteListener;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
        signatureBottomSheetController.currentOnCompleteListener = null;
        signatureBottomSheetController.getBinding().signatureCanvas.clearCanvas();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupIfNeeded$lambda$13(SignatureBottomSheetController signatureBottomSheetController, View view) {
        signatureBottomSheetController.getBinding().signatureCanvas.clearCanvas();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupIfNeeded$lambda$14(SignatureBottomSheetController signatureBottomSheetController, BottomSheetBehavior bottomSheetBehavior, View view) {
        Function2<? super Boolean, ? super Bitmap, Unit> function2 = signatureBottomSheetController.currentOnCompleteListener;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, signatureBottomSheetController.getBinding().signatureCanvas.generateSignatureBitmap());
        }
        signatureBottomSheetController.currentOnCompleteListener = null;
        bottomSheetBehavior.setState(5);
    }
}
