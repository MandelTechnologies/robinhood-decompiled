package com.squareup.workflow1.p415ui.modal;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import com.squareup.workflow1.p415ui.BuilderViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.ViewShowRendering;
import com.squareup.workflow1.p415ui.container.R$id;
import com.squareup.workflow1.p415ui.modal.AlertScreen;
import com.squareup.workflow1.p415ui.modal.ModalContainer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: AlertContainer.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014J\f\u0010\u0014\u001a\u00020\b*\u00020\u0015H\u0002R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/AlertContainer;", "Lcom/squareup/workflow1/ui/modal/ModalContainer;", "Lcom/squareup/workflow1/ui/modal/AlertScreen;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "defStyleRes", "dialogThemeResId", "(Landroid/content/Context;Landroid/util/AttributeSet;III)V", "buildDialog", "Lcom/squareup/workflow1/ui/modal/ModalContainer$DialogRef;", "initialModalRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "updateDialog", "", "dialogRef", "toId", "Lcom/squareup/workflow1/ui/modal/AlertScreen$Button;", "AlertContainerViewFactory", "Companion", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AlertContainer extends ModalContainer<AlertScreen> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int dialogThemeResId;

    /* compiled from: AlertContainer.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertScreen.Button.values().length];
            iArr[AlertScreen.Button.POSITIVE.ordinal()] = 1;
            iArr[AlertScreen.Button.NEGATIVE.ordinal()] = 2;
            iArr[AlertScreen.Button.NEUTRAL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AlertContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : attributeSet, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AlertContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dialogThemeResId = i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.squareup.workflow1.p415ui.modal.ModalContainer
    public ModalContainer.DialogRef<AlertScreen> buildDialog(AlertScreen initialModalRendering, ViewEnvironment initialViewEnvironment) {
        Intrinsics.checkNotNullParameter(initialModalRendering, "initialModalRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext(), this.dialogThemeResId).create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "Builder(context, dialogThemeResId)\n      .create()");
        ModalContainer.DialogRef<AlertScreen> dialogRef = new ModalContainer.DialogRef<>(initialModalRendering, initialViewEnvironment, alertDialogCreate, null, 8, null);
        updateDialog(dialogRef);
        return dialogRef;
    }

    @Override // com.squareup.workflow1.p415ui.modal.ModalContainer
    protected void updateDialog(ModalContainer.DialogRef<AlertScreen> dialogRef) {
        Unit unit;
        Button button;
        Intrinsics.checkNotNullParameter(dialogRef, "dialogRef");
        AlertDialog alertDialog = (AlertDialog) dialogRef.getDialog();
        final AlertScreen modalRendering = dialogRef.getModalRendering();
        int i = 0;
        if (modalRendering.getCancelable()) {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.squareup.workflow1.ui.modal.AlertContainer$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    AlertContainer.m26832updateDialog$lambda0(modalRendering, dialogInterface);
                }
            });
            alertDialog.setCancelable(true);
        } else {
            alertDialog.setCancelable(false);
        }
        AlertScreen.Button[] buttonArrValues = AlertScreen.Button.values();
        int length = buttonArrValues.length;
        while (i < length) {
            final AlertScreen.Button button2 = buttonArrValues[i];
            i++;
            String str = modalRendering.getButtons().get(button2);
            if (str == null) {
                unit = null;
            } else {
                alertDialog.setButton(toId(button2), str, new DialogInterface.OnClickListener() { // from class: com.squareup.workflow1.ui.modal.AlertContainer$$ExternalSyntheticLambda1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        AlertContainer.m26833updateDialog$lambda2$lambda1(modalRendering, button2, dialogInterface, i2);
                    }
                });
                unit = Unit.INSTANCE;
            }
            if (unit == null && (button = alertDialog.getButton(toId(button2))) != null) {
                button.setVisibility(4);
            }
        }
        alertDialog.setMessage(modalRendering.getMessage());
        alertDialog.setTitle(modalRendering.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateDialog$lambda-0, reason: not valid java name */
    public static final void m26832updateDialog$lambda0(AlertScreen rendering, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(rendering, "$rendering");
        rendering.getOnEvent().invoke(AlertScreen.Event.Canceled.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateDialog$lambda-2$lambda-1, reason: not valid java name */
    public static final void m26833updateDialog$lambda2$lambda1(AlertScreen rendering, AlertScreen.Button button, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(rendering, "$rendering");
        Intrinsics.checkNotNullParameter(button, "$button");
        rendering.getOnEvent().invoke(new AlertScreen.Event.ButtonClicked(button));
    }

    private final int toId(AlertScreen.Button button) {
        int i = WhenMappings.$EnumSwitchMapping$0[button.ordinal()];
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return -2;
        }
        if (i == 3) {
            return -3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: AlertContainer.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J1\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/AlertContainer$AlertContainerViewFactory;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/squareup/workflow1/ui/modal/AlertContainerScreen;", "dialogThemeResId", "", "(I)V", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    private static final class AlertContainerViewFactory implements ViewFactory<AlertContainerScreen<?>> {
        private final /* synthetic */ BuilderViewFactory<AlertContainerScreen<?>> $$delegate_0;
        private final int dialogThemeResId;

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(AlertContainerScreen<?> initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super AlertContainerScreen<?>> getType() {
            return this.$$delegate_0.getType();
        }

        public AlertContainerViewFactory(final int i) {
            this.dialogThemeResId = i;
            this.$$delegate_0 = new BuilderViewFactory<>(Reflection.getOrCreateKotlinClass(AlertContainerScreen.class), new Function4<AlertContainerScreen<?>, ViewEnvironment, Context, ViewGroup, View>() { // from class: com.squareup.workflow1.ui.modal.AlertContainer.AlertContainerViewFactory.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final View invoke(AlertContainerScreen<?> initialRendering, ViewEnvironment initialEnv, Context context, ViewGroup viewGroup) {
                    Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
                    Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
                    Intrinsics.checkNotNullParameter(context, "context");
                    AlertContainer alertContainer = new AlertContainer(context, null, 0, 0, i, 14, null);
                    alertContainer.setId(R$id.workflow_alert_container);
                    alertContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    ViewShowRendering.bindShowRendering(alertContainer, initialRendering, initialEnv, new AlertContainer2(alertContainer));
                    return alertContainer;
                }
            });
        }

        public /* synthetic */ AlertContainerViewFactory(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }

    /* compiled from: AlertContainer.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/AlertContainer$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/squareup/workflow1/ui/modal/AlertContainerScreen;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "buildView", "(Lcom/squareup/workflow1/ui/modal/AlertContainerScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "type", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Companion implements ViewFactory<AlertContainerScreen<?>> {
        private final /* synthetic */ AlertContainerViewFactory $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(AlertContainerScreen<?> initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super AlertContainerScreen<?>> getType() {
            return this.$$delegate_0.getType();
        }

        private Companion() {
            this.$$delegate_0 = new AlertContainerViewFactory(0, 1, null);
        }
    }
}
