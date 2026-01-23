package com.squareup.workflow1.p415ui.modal;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import com.squareup.workflow1.p415ui.BackButtonScreen;
import com.squareup.workflow1.p415ui.BackPressHandler;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewRegistry;
import com.squareup.workflow1.p415ui.ViewRegistry2;
import com.squareup.workflow1.p415ui.ViewShowRendering;
import com.squareup.workflow1.p415ui.modal.ModalContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModalViewContainer.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/ModalViewContainer;", "Lcom/squareup/workflow1/ui/modal/ModalContainer;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "Landroid/app/Dialog;", "buildDialogForView", "(Landroid/view/View;)Landroid/app/Dialog;", "initialModalRendering", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/modal/ModalContainer$DialogRef;", "buildDialog", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;)Lcom/squareup/workflow1/ui/modal/ModalContainer$DialogRef;", "dialogRef", "", "updateDialog", "(Lcom/squareup/workflow1/ui/modal/ModalContainer$DialogRef;)V", "Companion", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public class ModalViewContainer extends ModalContainer<Object> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModalViewContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public Dialog buildDialogForView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = new Dialog(getContext());
        dialog.setCancelable(false);
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setLayout(-2, -2);
        Window window2 = dialog.getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setBackgroundDrawable(null);
        return dialog;
    }

    @Override // com.squareup.workflow1.p415ui.modal.ModalContainer
    protected final ModalContainer.DialogRef<Object> buildDialog(Object initialModalRendering, ViewEnvironment initialViewEnvironment) {
        Intrinsics.checkNotNullParameter(initialModalRendering, "initialModalRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        BackButtonScreen backButtonScreen = new BackButtonScreen(initialModalRendering, false, new Function0<Unit>() { // from class: com.squareup.workflow1.ui.modal.ModalViewContainer$buildDialog$wrappedRendering$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }, 2, null);
        ViewRegistry viewRegistry = (ViewRegistry) initialViewEnvironment.get(ViewRegistry.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        final View viewBuildView$default = ViewRegistry2.buildView$default(viewRegistry, backButtonScreen, initialViewEnvironment, context, this, null, 16, null);
        ViewShowRendering.start(viewBuildView$default);
        Dialog dialogBuildDialogForView = buildDialogForView(viewBuildView$default);
        dialogBuildDialogForView.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.squareup.workflow1.ui.modal.ModalViewContainer$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return ModalViewContainer.m26835buildDialog$lambda4$lambda3(viewBuildView$default, dialogInterface, i, keyEvent);
            }
        });
        return new ModalContainer.DialogRef<>(initialModalRendering, initialViewEnvironment, dialogBuildDialogForView, viewBuildView$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: buildDialog$lambda-4$lambda-3, reason: not valid java name */
    public static final boolean m26835buildDialog$lambda4$lambda3(View view, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "$view");
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerOnBackPressedDispatcherOwnerOrNull = BackPressHandler.onBackPressedDispatcherOwnerOrNull(context);
        if (onBackPressedDispatcherOwnerOnBackPressedDispatcherOwnerOrNull != null && (onBackPressedDispatcher = onBackPressedDispatcherOwnerOnBackPressedDispatcherOwnerOrNull.getOnBackPressedDispatcher()) != null && onBackPressedDispatcher.getHasEnabledCallbacks()) {
            onBackPressedDispatcher.onBackPressed();
        }
        return true;
    }

    @Override // com.squareup.workflow1.p415ui.modal.ModalContainer
    protected void updateDialog(ModalContainer.DialogRef<Object> dialogRef) {
        Intrinsics.checkNotNullParameter(dialogRef, "dialogRef");
        BackButtonScreen backButtonScreen = new BackButtonScreen(dialogRef.getModalRendering(), false, new Function0<Unit>() { // from class: com.squareup.workflow1.ui.modal.ModalViewContainer$updateDialog$1$wrappedRendering$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }, 2, null);
        Object extra = dialogRef.getExtra();
        if (extra == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        ViewShowRendering.showRendering((View) extra, backButtonScreen, dialogRef.getViewEnvironment());
    }
}
