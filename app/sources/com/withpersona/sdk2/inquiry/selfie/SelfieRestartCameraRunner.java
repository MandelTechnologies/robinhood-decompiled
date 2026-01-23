package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieCameraRestartBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: SelfieRestartCameraRunner.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieRestartCameraRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$RestartCameraScreen;", "binding", "Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieCameraRestartBinding;", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieCameraRestartBinding;)V", "showRendering", "", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "Companion", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SelfieRestartCameraRunner implements LayoutRunner<SelfieWorkflow.Screen.RestartCameraScreen> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Pi2SelfieCameraRestartBinding binding;

    public SelfieRestartCameraRunner(Pi2SelfieCameraRestartBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(SelfieWorkflow.Screen.RestartCameraScreen rendering, ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        rendering.getRendered().invoke();
    }

    /* compiled from: SelfieRestartCameraRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieRestartCameraRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$RestartCameraScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<SelfieWorkflow.Screen.RestartCameraScreen> {
        private final /* synthetic */ ViewFactory<SelfieWorkflow.Screen.RestartCameraScreen> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(SelfieWorkflow.Screen.RestartCameraScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super SelfieWorkflow.Screen.RestartCameraScreen> getType() {
            return this.$$delegate_0.getType();
        }

        /* compiled from: SelfieRestartCameraRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieRestartCameraRunner$Companion$1 */
        /* synthetic */ class C437271 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2SelfieCameraRestartBinding> {
            public static final C437271 INSTANCE = new C437271();

            C437271() {
                super(3, Pi2SelfieCameraRestartBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieCameraRestartBinding;", 0);
            }

            public final Pi2SelfieCameraRestartBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Pi2SelfieCameraRestartBinding.inflate(p0, viewGroup, z);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Pi2SelfieCameraRestartBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return invoke(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(SelfieWorkflow.Screen.RestartCameraScreen.class), C437271.INSTANCE, C437282.INSTANCE);
        }

        /* compiled from: SelfieRestartCameraRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieRestartCameraRunner$Companion$2 */
        /* synthetic */ class C437282 extends FunctionReferenceImpl implements Function1<Pi2SelfieCameraRestartBinding, SelfieRestartCameraRunner> {
            public static final C437282 INSTANCE = new C437282();

            C437282() {
                super(1, SelfieRestartCameraRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieCameraRestartBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SelfieRestartCameraRunner invoke(Pi2SelfieCameraRestartBinding p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new SelfieRestartCameraRunner(p0);
            }
        }
    }
}
