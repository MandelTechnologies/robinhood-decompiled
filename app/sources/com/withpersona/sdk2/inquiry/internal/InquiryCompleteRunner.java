package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.LayoutRunnerViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: InquiryCompleteRunner.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryCompleteRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen$InquiryCompleteScreen;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "rendering", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "viewEnvironment", "", "showRendering", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen$InquiryCompleteScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Companion", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class InquiryCompleteRunner implements LayoutRunner<InquiryWorkflow.Screen.InquiryCompleteScreen> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final View view;

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(InquiryWorkflow.Screen.InquiryCompleteScreen rendering, ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
    }

    public InquiryCompleteRunner(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* compiled from: InquiryCompleteRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryCompleteRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen$InquiryCompleteScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<InquiryWorkflow.Screen.InquiryCompleteScreen> {
        private final /* synthetic */ ViewFactory<InquiryWorkflow.Screen.InquiryCompleteScreen> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(InquiryWorkflow.Screen.InquiryCompleteScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super InquiryWorkflow.Screen.InquiryCompleteScreen> getType() {
            return this.$$delegate_0.getType();
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new LayoutRunnerViewFactory(Reflection.getOrCreateKotlinClass(InquiryWorkflow.Screen.InquiryCompleteScreen.class), R$layout.pi2_inquiry_complete, C436121.INSTANCE);
        }

        /* compiled from: InquiryCompleteRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryCompleteRunner$Companion$1 */
        /* synthetic */ class C436121 extends FunctionReferenceImpl implements Function1<View, InquiryCompleteRunner> {
            public static final C436121 INSTANCE = new C436121();

            C436121() {
                super(1, InquiryCompleteRunner.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InquiryCompleteRunner invoke(View p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new InquiryCompleteRunner(p0);
            }
        }
    }
}
