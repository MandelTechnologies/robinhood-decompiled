package com.withpersona.sdk2.inquiry.sandbox;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R$style;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.sandbox.databinding.Pi2SandboxOptionsDialogBinding;
import com.withpersona.sdk2.inquiry.sandbox.databinding.Pi2SandboxOverlayBinding;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.R$drawable;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: SandboxScreenRunner.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/sandbox/SandboxScreenRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/sandbox/SandboxScreen;", "binding", "Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;", "<init>", "(Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;)V", "optionsDialog", "Landroid/app/Dialog;", "showRendering", "", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "showOptionsDialogIfNeeded", "context", "Landroid/content/Context;", "Companion", "sandbox_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class SandboxScreenRunner implements LayoutRunner<SandboxScreen<?>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Pi2SandboxOverlayBinding binding;
    private Dialog optionsDialog;

    public SandboxScreenRunner(Pi2SandboxOverlayBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final SandboxScreen<?> rendering, ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final Pi2SandboxOverlayBinding pi2SandboxOverlayBinding = this.binding;
        final Context context = pi2SandboxOverlayBinding.getRoot().getContext();
        pi2SandboxOverlayBinding.floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SandboxScreenRunner.showRendering$lambda$4$lambda$0(rendering, pi2SandboxOverlayBinding, view);
            }
        });
        pi2SandboxOverlayBinding.floatingActionButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return SandboxScreenRunner.showRendering$lambda$4$lambda$1(this.f$0, rendering, context, view);
            }
        });
        FloatingActionButton floatingActionButton = pi2SandboxOverlayBinding.floatingActionButton;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        InsetsUtils.onInsetsChanged(floatingActionButton, new Function1() { // from class: com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SandboxScreenRunner.showRendering$lambda$4$lambda$3(this.f$0, (WindowInsetsCompat) obj);
            }
        });
        pi2SandboxOverlayBinding.childStub.update(rendering.getMainScreen(), viewEnvironment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$4$lambda$0(SandboxScreen sandboxScreen, Pi2SandboxOverlayBinding pi2SandboxOverlayBinding, View view) {
        sandboxScreen.getOnFabClick().invoke();
        Toast.makeText(pi2SandboxOverlayBinding.floatingActionButton.getRootView().getContext(), "Setting the debug flag to: " + SandboxFlags.INSTANCE.toKey(sandboxScreen.getGetCurrentForcedStatus().invoke()), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showRendering$lambda$4$lambda$1(SandboxScreenRunner sandboxScreenRunner, SandboxScreen sandboxScreen, Context context, View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNull(context);
        sandboxScreenRunner.showOptionsDialogIfNeeded(sandboxScreen, context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$4$lambda$3(SandboxScreenRunner sandboxScreenRunner, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullExpressionValue(insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars()), "getInsetsIgnoringVisibility(...)");
        FloatingActionButton floatingActionButton = sandboxScreenRunner.binding.floatingActionButton;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
        if (layoutParams != null) {
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) (r6.bottom + ExtensionsKt.getPxToDp(16.0d));
            floatingActionButton.setLayoutParams(layoutParams2);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }

    private final void showOptionsDialogIfNeeded(final SandboxScreen<?> rendering, Context context) throws Resources.NotFoundException {
        if (this.optionsDialog != null) {
            return;
        }
        final Dialog dialog = new Dialog(context, R$style.Theme_Material3_DayNight_Dialog_Alert);
        Pi2SandboxOptionsDialogBinding pi2SandboxOptionsDialogBindingInflate = Pi2SandboxOptionsDialogBinding.inflate(LayoutInflater.from(dialog.getContext()));
        Intrinsics.checkNotNullExpressionValue(pi2SandboxOptionsDialogBindingInflate, "inflate(...)");
        dialog.setContentView(pi2SandboxOptionsDialogBindingInflate.getRoot());
        pi2SandboxOptionsDialogBindingInflate.toolbar.setTitle("Sandbox options");
        pi2SandboxOptionsDialogBindingInflate.toolbar.setNavigationIcon(R$drawable.pi2_shared_close_icon);
        pi2SandboxOptionsDialogBindingInflate.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.dismiss();
            }
        });
        pi2SandboxOptionsDialogBindingInflate.govIdNfcSwitch.setChecked(rendering.getSimulateGovIdNfc());
        pi2SandboxOptionsDialogBindingInflate.govIdNfcSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner$$ExternalSyntheticLambda4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SandboxScreenRunner.showOptionsDialogIfNeeded$lambda$9$lambda$7$lambda$6(rendering, compoundButton, z);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.optionsDialog = null;
            }
        });
        this.optionsDialog = dialog;
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showOptionsDialogIfNeeded$lambda$9$lambda$7$lambda$6(SandboxScreen sandboxScreen, CompoundButton compoundButton, boolean z) {
        sandboxScreen.getOnSimulateGovIdNfcChanged().invoke(Boolean.valueOf(z));
    }

    /* compiled from: SandboxScreenRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001e\u0010\u000e\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/sandbox/SandboxScreenRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/sandbox/SandboxScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "sandbox_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<SandboxScreen<?>> {
        private final /* synthetic */ ViewFactory<SandboxScreen<?>> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(SandboxScreen<?> initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super SandboxScreen<?>> getType() {
            return this.$$delegate_0.getType();
        }

        /* compiled from: SandboxScreenRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner$Companion$1 */
        /* synthetic */ class C437091 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2SandboxOverlayBinding> {
            public static final C437091 INSTANCE = new C437091();

            C437091() {
                super(3, Pi2SandboxOverlayBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;", 0);
            }

            public final Pi2SandboxOverlayBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Pi2SandboxOverlayBinding.inflate(p0, viewGroup, z);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Pi2SandboxOverlayBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return invoke(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(SandboxScreen.class), C437091.INSTANCE, C437102.INSTANCE);
        }

        /* compiled from: SandboxScreenRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner$Companion$2 */
        /* synthetic */ class C437102 extends FunctionReferenceImpl implements Function1<Pi2SandboxOverlayBinding, SandboxScreenRunner> {
            public static final C437102 INSTANCE = new C437102();

            C437102() {
                super(1, SandboxScreenRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SandboxScreenRunner invoke(Pi2SandboxOverlayBinding p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new SandboxScreenRunner(p0);
            }
        }
    }
}
