package com.withpersona.sdk2.inquiry.internal.cancel;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow;
import com.withpersona.sdk2.inquiry.internal.databinding.Pi2CancelModalBinding;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling3;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles2;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.WindowUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.BottomSheetStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CancelDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\"\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/cancel/CancelDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "binding", "Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2CancelModalBinding;", "getBinding", "()Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2CancelModalBinding;", "setBinding", "(Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2CancelModalBinding;)V", "args", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "getArgs", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "inquiryFragment", "Lcom/withpersona/sdk2/inquiry/internal/InquiryFragment;", "getInquiryFragment", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryFragment;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "", "view", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "isWrappingButtons", "", "Companion", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class CancelDialogFragment extends BottomSheetDialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public Pi2CancelModalBinding binding;

    /* compiled from: CancelDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/cancel/CancelDialogFragment$Companion;", "", "<init>", "()V", "ARGUMENT_CANCEL_OUTPUT", "", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "theme", "", "cancelOutput", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "show$inquiry_internal_release", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void show$inquiry_internal_release(FragmentManager fragmentManager, int theme, InquiryWorkflow.Output.Cancel cancelOutput) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(cancelOutput, "cancelOutput");
            CancelDialogFragment cancelDialogFragment = new CancelDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGUMENT_CANCEL_OUTPUT", cancelOutput);
            cancelDialogFragment.setArguments(bundle);
            cancelDialogFragment.setStyle(0, theme);
            cancelDialogFragment.show(fragmentManager, "cancel_dialog_fragment");
        }
    }

    public final Pi2CancelModalBinding getBinding() {
        Pi2CancelModalBinding pi2CancelModalBinding = this.binding;
        if (pi2CancelModalBinding != null) {
            return pi2CancelModalBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(Pi2CancelModalBinding pi2CancelModalBinding) {
        Intrinsics.checkNotNullParameter(pi2CancelModalBinding, "<set-?>");
        this.binding = pi2CancelModalBinding;
    }

    private final InquiryWorkflow.Output.Cancel getArgs() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (InquiryWorkflow.Output.Cancel) BundleCompat.getParcelable(arguments, "ARGUMENT_CANCEL_OUTPUT", InquiryWorkflow.Output.Cancel.class);
        }
        return null;
    }

    private final InquiryFragment getInquiryFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof InquiryFragment) {
            return (InquiryFragment) parentFragment;
        }
        return null;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.withpersona.sdk2.inquiry.internal.cancel.CancelDialogFragment$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CancelDialogFragment.onCreateDialog$lambda$1$lambda$0(dialogOnCreateDialog, this, dialogInterface);
            }
        });
        return dialogOnCreateDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$1$lambda$0(Dialog dialog, CancelDialogFragment cancelDialogFragment, DialogInterface dialogInterface) {
        ViewGroup viewGroup = (ViewGroup) dialog.findViewById(R$id.design_bottom_sheet);
        viewGroup.setBackgroundResource(R.color.transparent);
        Intrinsics.checkNotNull(viewGroup);
        InquiryWorkflow.Output.Cancel args = cancelDialogFragment.getArgs();
        StepStyles2 styles = args != null ? args.getStyles() : null;
        ConstraintLayout bottomSheetContent = cancelDialogFragment.getBinding().bottomSheetContent;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        BottomSheetStyling2.applyBottomSheetStyles$default(viewGroup, styles, bottomSheetContent, null, 4, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateView(inflater, container, savedInstanceState);
        setBinding(Pi2CancelModalBinding.inflate(inflater, container, false));
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Window window;
        int colorFromAttr$default;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final InquiryWorkflow.Output.Cancel args = getArgs();
        if (args == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            WindowCompat.setDecorFitsSystemWindows(window, false);
            StepStyles2 styles = args.getStyles();
            if (styles == null || (backgroundColorValue = styles.getBackgroundColorValue()) == null) {
                Context context = window.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                colorFromAttr$default = ResTools.getColorFromAttr$default(context, R$attr.colorSurface, null, false, 6, null);
            } else {
                colorFromAttr$default = backgroundColorValue.intValue();
            }
            WindowUtils2.updateUiColor(window, colorFromAttr$default);
        }
        final Pi2CancelModalBinding binding = getBinding();
        String title = args.getTitle();
        if (title != null) {
            binding.hintTitle.setText(title);
        }
        String message = args.getMessage();
        if (message != null) {
            binding.hintMessage.setText(message);
        }
        String cancelButtonText = args.getCancelButtonText();
        if (cancelButtonText != null) {
            binding.closeButton.setText(cancelButtonText);
        }
        String resumeButtonText = args.getResumeButtonText();
        if (resumeButtonText != null) {
            binding.retryButton.setText(resumeButtonText);
        }
        binding.retryButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.internal.cancel.CancelDialogFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f$0.dismiss();
            }
        });
        binding.closeButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.internal.cancel.CancelDialogFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CancelDialogFragment.onViewCreated$lambda$12$lambda$8(this.f$0, args, view2);
            }
        });
        Button closeButton = binding.closeButton;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(closeButton, new Function0() { // from class: com.withpersona.sdk2.inquiry.internal.cancel.CancelDialogFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CancelDialogFragment.onViewCreated$lambda$12$lambda$11(binding, this, args);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$12$lambda$8(CancelDialogFragment cancelDialogFragment, InquiryWorkflow.Output.Cancel cancel, View view) {
        cancelDialogFragment.dismiss();
        InquiryFragment inquiryFragment = cancelDialogFragment.getInquiryFragment();
        if (inquiryFragment != null) {
            inquiryFragment.onCancelClick$inquiry_internal_release(cancel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12$lambda$11(Pi2CancelModalBinding pi2CancelModalBinding, CancelDialogFragment cancelDialogFragment, InquiryWorkflow.Output.Cancel cancel) throws IllegalArgumentException {
        boolean z = true;
        if (pi2CancelModalBinding.closeButton.getLineCount() > 1 || pi2CancelModalBinding.retryButton.getLineCount() > 1) {
            Button closeButton = pi2CancelModalBinding.closeButton;
            Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
            ViewGroup.LayoutParams layoutParams = closeButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = pi2CancelModalBinding.flowLayout.getWidth();
            closeButton.setLayoutParams(layoutParams);
            Button retryButton = pi2CancelModalBinding.retryButton;
            Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
            ViewGroup.LayoutParams layoutParams2 = retryButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = pi2CancelModalBinding.flowLayout.getWidth();
            retryButton.setLayoutParams(layoutParams2);
            pi2CancelModalBinding.flowLayout.setReferencedIds(new int[]{pi2CancelModalBinding.closeButton.getId(), pi2CancelModalBinding.retryButton.getId()});
        } else {
            z = false;
        }
        cancelDialogFragment.applyStyles(cancel.getStyles(), pi2CancelModalBinding, z);
        return Unit.INSTANCE;
    }

    private final void applyStyles(StepStyles2 styles, Pi2CancelModalBinding binding, boolean isWrappingButtons) throws IllegalArgumentException {
        ButtonComponentStyling3 cancelDialogResumeStyleValue;
        ButtonComponentStyling8 cancelDialogCloseStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView hintTitle = binding.hintTitle;
            Intrinsics.checkNotNullExpressionValue(hintTitle, "hintTitle");
            TextStyling2.style$default(hintTitle, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView hintMessage = binding.hintMessage;
            Intrinsics.checkNotNullExpressionValue(hintMessage, "hintMessage");
            TextStyling2.style$default(hintMessage, textStyleValue, null, 2, null);
        }
        if (styles != null && (cancelDialogCloseStyleValue = styles.getCancelDialogCloseStyleValue()) != null) {
            Button closeButton = binding.closeButton;
            Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
            ButtonStyling.style$default(closeButton, cancelDialogCloseStyleValue, false, !isWrappingButtons, 2, null);
        }
        if (styles == null || (cancelDialogResumeStyleValue = styles.getCancelDialogResumeStyleValue()) == null) {
            return;
        }
        Button retryButton = binding.retryButton;
        Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
        ButtonStyling.style$default(retryButton, cancelDialogResumeStyleValue, false, !isWrappingButtons, 2, null);
    }
}
