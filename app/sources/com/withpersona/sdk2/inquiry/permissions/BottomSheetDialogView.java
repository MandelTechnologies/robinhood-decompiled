package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R$attr;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.squareup.workflow1.p415ui.AndroidViewRendering;
import com.squareup.workflow1.p415ui.BackPressHandler;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling3;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles2;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2RequestPermissionRationaleBinding;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.p422ui.BottomSheetUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.BottomSheetStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BottomSheetDialogView.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\"\u0010\u001a\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/BottomSheetDialogView;", "Lcom/squareup/workflow1/ui/AndroidViewRendering;", "titleText", "", "messageText", "positiveButtonText", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "onPositiveButtonClick", "Lkotlin/Function0;", "", "negativeButtonText", "onNegativeButtonClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "viewFactory", "Lcom/squareup/workflow1/ui/ViewFactory;", "getViewFactory", "()Lcom/squareup/workflow1/ui/ViewFactory;", "initialize", "binding", "Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2RequestPermissionRationaleBinding;", "showRendering", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "applyStyles", "isWrappingButtons", "", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class BottomSheetDialogView implements AndroidViewRendering<BottomSheetDialogView> {
    private final String messageText;
    private final String negativeButtonText;
    private final Function0<Unit> onNegativeButtonClick;
    private final Function0<Unit> onPositiveButtonClick;
    private final String positiveButtonText;
    private final StepStyles2 styles;
    private final String titleText;
    private final ViewFactory<BottomSheetDialogView> viewFactory;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$5$lambda$3(View view) {
    }

    public BottomSheetDialogView(String titleText, String messageText, String positiveButtonText, StepStyles2 stepStyles2, Function0<Unit> onPositiveButtonClick, String negativeButtonText, Function0<Unit> onNegativeButtonClick) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(onPositiveButtonClick, "onPositiveButtonClick");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        Intrinsics.checkNotNullParameter(onNegativeButtonClick, "onNegativeButtonClick");
        this.titleText = titleText;
        this.messageText = messageText;
        this.positiveButtonText = positiveButtonText;
        this.styles = stepStyles2;
        this.onPositiveButtonClick = onPositiveButtonClick;
        this.negativeButtonText = negativeButtonText;
        this.onNegativeButtonClick = onNegativeButtonClick;
        LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
        this.viewFactory = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(BottomSheetDialogView.class), BottomSheetDialogView3.INSTANCE, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomSheetDialogView.viewFactory$lambda$1(this.f$0, (Pi2RequestPermissionRationaleBinding) obj);
            }
        });
    }

    @Override // com.squareup.workflow1.p415ui.AndroidViewRendering
    public ViewFactory<BottomSheetDialogView> getViewFactory() {
        return this.viewFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutRunner viewFactory$lambda$1(final BottomSheetDialogView bottomSheetDialogView, final Pi2RequestPermissionRationaleBinding it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bottomSheetDialogView.initialize(it);
        return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$$ExternalSyntheticLambda1
            @Override // com.squareup.workflow1.p415ui.LayoutRunner
            public final void showRendering(Object obj, ViewEnvironment viewEnvironment) {
                BottomSheetDialogView.viewFactory$lambda$1$lambda$0(this.f$0, it, (BottomSheetDialogView) obj, viewEnvironment);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void viewFactory$lambda$1$lambda$0(BottomSheetDialogView bottomSheetDialogView, Pi2RequestPermissionRationaleBinding pi2RequestPermissionRationaleBinding, BottomSheetDialogView rendering, ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNull(pi2RequestPermissionRationaleBinding);
        bottomSheetDialogView.showRendering(pi2RequestPermissionRationaleBinding, rendering, viewEnvironment);
    }

    private final void initialize(Pi2RequestPermissionRationaleBinding binding) {
        int colorFromAttr$default;
        Integer backgroundColorValue;
        final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(binding.bottomSheet);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDialogView.initialize$lambda$5$lambda$2(this.f$0);
            }
        };
        FrameLayout bottomSheet = binding.bottomSheet;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        BottomSheetUtils.setup(bottomSheetBehaviorFrom, function0, bottomSheet, null, binding.tintScreen);
        binding.getRoot().addOnAttachStateChangeListener(new BottomSheetDialogView2(bottomSheetBehaviorFrom));
        binding.bottomSheet.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetDialogView.initialize$lambda$5$lambda$3(view);
            }
        });
        binding.tintScreen.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bottomSheetBehaviorFrom.setState(5);
            }
        });
        StepStyles2 stepStyles2 = this.styles;
        if (stepStyles2 == null || (backgroundColorValue = stepStyles2.getBackgroundColorValue()) == null) {
            Context context = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            colorFromAttr$default = ResTools.getColorFromAttr$default(context, R$attr.colorSurface, null, false, 6, null);
        } else {
            colorFromAttr$default = backgroundColorValue.intValue();
        }
        binding.getRoot().setTag(com.withpersona.sdk2.inquiry.modal.R$id.pi2_background_color_hint, Integer.valueOf(colorFromAttr$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$5$lambda$2(BottomSheetDialogView bottomSheetDialogView) {
        bottomSheetDialogView.onNegativeButtonClick.invoke();
        return Unit.INSTANCE;
    }

    private final void showRendering(final Pi2RequestPermissionRationaleBinding binding, final BottomSheetDialogView rendering, ViewEnvironment viewEnvironment) {
        if (this.titleText.length() > 0) {
            TextView title = binding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            ExtensionsKt.setMarkdown(title, this.titleText);
        } else {
            binding.title.setVisibility(8);
        }
        TextView message = binding.message;
        Intrinsics.checkNotNullExpressionValue(message, "message");
        ExtensionsKt.setMarkdown(message, this.messageText);
        binding.positiveButton.setText(rendering.positiveButtonText);
        binding.positiveButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetDialogView.showRendering$lambda$12$lambda$6(this.f$0, view);
            }
        });
        binding.negativeButton.setText(rendering.negativeButtonText);
        binding.negativeButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetDialogView.showRendering$lambda$12$lambda$7(this.f$0, view);
            }
        });
        FrameLayout bottomSheet = binding.bottomSheet;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        BackPressHandler.setBackPressedHandler(bottomSheet, new Function0() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDialogView.showRendering$lambda$12$lambda$8(this.f$0);
            }
        });
        Button negativeButton = binding.negativeButton;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(negativeButton, new Function0() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDialogView.showRendering$lambda$12$lambda$11(binding, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$12$lambda$6(BottomSheetDialogView bottomSheetDialogView, View view) {
        bottomSheetDialogView.onPositiveButtonClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$12$lambda$7(BottomSheetDialogView bottomSheetDialogView, View view) {
        bottomSheetDialogView.onNegativeButtonClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$12$lambda$8(BottomSheetDialogView bottomSheetDialogView) {
        bottomSheetDialogView.onNegativeButtonClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$12$lambda$11(Pi2RequestPermissionRationaleBinding pi2RequestPermissionRationaleBinding, BottomSheetDialogView bottomSheetDialogView) throws IllegalArgumentException {
        boolean z = true;
        if (pi2RequestPermissionRationaleBinding.negativeButton.getLineCount() > 1 || pi2RequestPermissionRationaleBinding.positiveButton.getLineCount() > 1) {
            Button negativeButton = pi2RequestPermissionRationaleBinding.negativeButton;
            Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
            ViewGroup.LayoutParams layoutParams = negativeButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = pi2RequestPermissionRationaleBinding.flowLayout.getWidth();
            negativeButton.setLayoutParams(layoutParams);
            Button positiveButton = pi2RequestPermissionRationaleBinding.positiveButton;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            ViewGroup.LayoutParams layoutParams2 = positiveButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = pi2RequestPermissionRationaleBinding.flowLayout.getWidth();
            positiveButton.setLayoutParams(layoutParams2);
            pi2RequestPermissionRationaleBinding.flowLayout.setReferencedIds(new int[]{pi2RequestPermissionRationaleBinding.positiveButton.getId(), pi2RequestPermissionRationaleBinding.negativeButton.getId()});
        } else {
            z = false;
        }
        bottomSheetDialogView.applyStyles(bottomSheetDialogView.styles, pi2RequestPermissionRationaleBinding, z);
        return Unit.INSTANCE;
    }

    private final void applyStyles(StepStyles2 styles, Pi2RequestPermissionRationaleBinding binding, boolean isWrappingButtons) throws IllegalArgumentException {
        ButtonComponentStyling3 buttonSecondaryStyleValue;
        ButtonComponentStyling8 buttonPrimaryStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        FrameLayout bottomSheet = binding.bottomSheet;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        ConstraintLayout bottomSheetContent = binding.bottomSheetContent;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        BottomSheetStyling2.applyBottomSheetStyles$default(bottomSheet, styles, bottomSheetContent, null, 4, null);
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = binding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextStyling2.style$default(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView message = binding.message;
            Intrinsics.checkNotNullExpressionValue(message, "message");
            TextStyling2.style$default(message, textStyleValue, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            Button positiveButton = binding.positiveButton;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            ButtonStyling.style$default(positiveButton, buttonPrimaryStyleValue, false, !isWrappingButtons, 2, null);
        }
        if (styles == null || (buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue()) == null) {
            return;
        }
        Button negativeButton = binding.negativeButton;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        ButtonStyling.style$default(negativeButton, buttonSecondaryStyleValue, false, !isWrappingButtons, 2, null);
    }
}
