package com.squareup.workflow1.p415ui;

import android.view.View;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0002\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00028\u00008 X¡\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00028\u0000`\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/squareup/workflow1/ui/WorkflowViewState;", "", "RenderingT", "<init>", "()V", "getShowing", "()Ljava/lang/Object;", "getShowing$annotations", "showing", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "getEnvironment", "()Lcom/squareup/workflow1/ui/ViewEnvironment;", "environment", "Lkotlin/Function2;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "getShowRendering", "()Lkotlin/jvm/functions/Function2;", "showRendering", "New", "Started", "Lcom/squareup/workflow1/ui/WorkflowViewState$New;", "Lcom/squareup/workflow1/ui/WorkflowViewState$Started;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
@PublishedApi
/* loaded from: classes12.dex */
public abstract class WorkflowViewState<RenderingT> {
    public /* synthetic */ WorkflowViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ViewEnvironment getEnvironment();

    public abstract Function2<RenderingT, ViewEnvironment, Unit> getShowRendering();

    public abstract RenderingT getShowing();

    private WorkflowViewState() {
    }

    /* compiled from: WorkflowViewState.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003BQ\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052$\b\u0002\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00028\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m3636d2 = {"Lcom/squareup/workflow1/ui/WorkflowViewState$New;", "", "RenderingT", "Lcom/squareup/workflow1/ui/WorkflowViewState;", "showing", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "environment", "Lkotlin/Function2;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "showRendering", "Lkotlin/Function1;", "Landroid/view/View;", "starter", "<init>", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "copy", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lcom/squareup/workflow1/ui/WorkflowViewState$New;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getShowing$wf1_core_android", "()Ljava/lang/Object;", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "getEnvironment", "()Lcom/squareup/workflow1/ui/ViewEnvironment;", "Lkotlin/jvm/functions/Function2;", "getShowRendering", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "getStarter", "()Lkotlin/jvm/functions/Function1;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final /* data */ class New<RenderingT> extends WorkflowViewState<RenderingT> {
        private final ViewEnvironment environment;
        private final Function2<RenderingT, ViewEnvironment, Unit> showRendering;
        private final RenderingT showing;
        private final Function1<View, Unit> starter;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ New copy$default(New r0, Object obj, ViewEnvironment viewEnvironment, Function2 function2, Function1 function1, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = r0.getShowing();
            }
            if ((i & 2) != 0) {
                viewEnvironment = r0.getEnvironment();
            }
            if ((i & 4) != 0) {
                function2 = r0.getShowRendering();
            }
            if ((i & 8) != 0) {
                function1 = r0.starter;
            }
            return r0.copy(obj, viewEnvironment, function2, function1);
        }

        public final New<RenderingT> copy(RenderingT showing, ViewEnvironment environment, Function2<? super RenderingT, ? super ViewEnvironment, Unit> showRendering, Function1<? super View, Unit> starter) {
            Intrinsics.checkNotNullParameter(showing, "showing");
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(showRendering, "showRendering");
            Intrinsics.checkNotNullParameter(starter, "starter");
            return new New<>(showing, environment, showRendering, starter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof New)) {
                return false;
            }
            New r5 = (New) other;
            return Intrinsics.areEqual(getShowing(), r5.getShowing()) && Intrinsics.areEqual(getEnvironment(), r5.getEnvironment()) && Intrinsics.areEqual(getShowRendering(), r5.getShowRendering()) && Intrinsics.areEqual(this.starter, r5.starter);
        }

        public int hashCode() {
            return (((((getShowing().hashCode() * 31) + getEnvironment().hashCode()) * 31) + getShowRendering().hashCode()) * 31) + this.starter.hashCode();
        }

        public String toString() {
            return "New(showing=" + getShowing() + ", environment=" + getEnvironment() + ", showRendering=" + getShowRendering() + ", starter=" + this.starter + ')';
        }

        @Override // com.squareup.workflow1.p415ui.WorkflowViewState
        /* renamed from: getShowing$wf1_core_android, reason: merged with bridge method [inline-methods] */
        public RenderingT getShowing() {
            return this.showing;
        }

        @Override // com.squareup.workflow1.p415ui.WorkflowViewState
        public ViewEnvironment getEnvironment() {
            return this.environment;
        }

        @Override // com.squareup.workflow1.p415ui.WorkflowViewState
        public Function2<RenderingT, ViewEnvironment, Unit> getShowRendering() {
            return this.showRendering;
        }

        public /* synthetic */ New(Object obj, ViewEnvironment viewEnvironment, Function2 function2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, viewEnvironment, function2, (i & 8) != 0 ? new Function1<View, Unit>() { // from class: com.squareup.workflow1.ui.WorkflowViewState.New.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    WorkflowViewState<?> workflowViewStateOrNull = WorkflowViewState2.getWorkflowViewStateOrNull(view);
                    Object showing = workflowViewStateOrNull == null ? null : workflowViewStateOrNull.getShowing();
                    Object obj2 = showing != null ? showing : null;
                    Intrinsics.checkNotNull(obj2);
                    ViewEnvironment environment = ViewShowRendering.getEnvironment(view);
                    Intrinsics.checkNotNull(environment);
                    ViewShowRendering.showRendering(view, obj2, environment);
                }
            } : function1);
        }

        public final Function1<View, Unit> getStarter() {
            return this.starter;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public New(RenderingT showing, ViewEnvironment environment, Function2<? super RenderingT, ? super ViewEnvironment, Unit> showRendering, Function1<? super View, Unit> starter) {
            super(null);
            Intrinsics.checkNotNullParameter(showing, "showing");
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(showRendering, "showRendering");
            Intrinsics.checkNotNullParameter(starter, "starter");
            this.showing = showing;
            this.environment = environment;
            this.showRendering = showRendering;
            this.starter = starter;
        }
    }

    /* compiled from: WorkflowViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B;\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00028\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/squareup/workflow1/ui/WorkflowViewState$Started;", "", "RenderingT", "Lcom/squareup/workflow1/ui/WorkflowViewState;", "showing", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "environment", "Lkotlin/Function2;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "showRendering", "<init>", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;Lkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getShowing$wf1_core_android", "()Ljava/lang/Object;", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "getEnvironment", "()Lcom/squareup/workflow1/ui/ViewEnvironment;", "Lkotlin/jvm/functions/Function2;", "getShowRendering", "()Lkotlin/jvm/functions/Function2;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final /* data */ class Started<RenderingT> extends WorkflowViewState<RenderingT> {
        private final ViewEnvironment environment;
        private final Function2<RenderingT, ViewEnvironment, Unit> showRendering;
        private final RenderingT showing;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Started)) {
                return false;
            }
            Started started = (Started) other;
            return Intrinsics.areEqual(getShowing(), started.getShowing()) && Intrinsics.areEqual(getEnvironment(), started.getEnvironment()) && Intrinsics.areEqual(getShowRendering(), started.getShowRendering());
        }

        public int hashCode() {
            return (((getShowing().hashCode() * 31) + getEnvironment().hashCode()) * 31) + getShowRendering().hashCode();
        }

        public String toString() {
            return "Started(showing=" + getShowing() + ", environment=" + getEnvironment() + ", showRendering=" + getShowRendering() + ')';
        }

        @Override // com.squareup.workflow1.p415ui.WorkflowViewState
        /* renamed from: getShowing$wf1_core_android, reason: merged with bridge method [inline-methods] */
        public RenderingT getShowing() {
            return this.showing;
        }

        @Override // com.squareup.workflow1.p415ui.WorkflowViewState
        public ViewEnvironment getEnvironment() {
            return this.environment;
        }

        @Override // com.squareup.workflow1.p415ui.WorkflowViewState
        public Function2<RenderingT, ViewEnvironment, Unit> getShowRendering() {
            return this.showRendering;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Started(RenderingT showing, ViewEnvironment environment, Function2<? super RenderingT, ? super ViewEnvironment, Unit> showRendering) {
            super(null);
            Intrinsics.checkNotNullParameter(showing, "showing");
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(showRendering, "showRendering");
            this.showing = showing;
            this.environment = environment;
            this.showRendering = showRendering;
        }
    }
}
