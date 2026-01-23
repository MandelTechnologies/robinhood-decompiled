package com.squareup.workflow1;

import com.squareup.workflow1.StatefulWorkflow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StatefulWorkflow.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a{\u0010\t\u001a\u001e0\bR\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u008c\u0001\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2-\u0010\u0012\u001a)\u0012\u001a\u0012\u00180\u000eR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0090\u0001\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152-\u0010\u0012\u001a)\u0012\u001a\u0012\u00180\u000eR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "Lcom/squareup/workflow1/BaseRenderContext;", "baseContext", "Lcom/squareup/workflow1/StatefulWorkflow;", "workflow", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "RenderContext", "(Lcom/squareup/workflow1/BaseRenderContext;Lcom/squareup/workflow1/StatefulWorkflow;)Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "", "name", "Lkotlin/Function1;", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "Lcom/squareup/workflow1/WorkflowAction;", "", "Lkotlin/ExtensionFunctionType;", "update", "action", "(Lcom/squareup/workflow1/StatefulWorkflow;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/squareup/workflow1/WorkflowAction;", "Lkotlin/Function0;", "(Lcom/squareup/workflow1/StatefulWorkflow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lcom/squareup/workflow1/WorkflowAction;", "wf1-workflow-core"}, m3637k = 5, m3638mv = {1, 6, 0}, m3640xi = 48, m3641xs = "com/squareup/workflow1/Workflows")
/* renamed from: com.squareup.workflow1.Workflows__StatefulWorkflowKt, reason: use source file name */
/* loaded from: classes12.dex */
public final /* synthetic */ class StatefulWorkflow2 {
    public static final <PropsT, StateT, OutputT, RenderingT> StatefulWorkflow<PropsT, StateT, OutputT, RenderingT>.RenderContext RenderContext(BaseRenderContext<? extends PropsT, StateT, ? super OutputT> baseContext, StatefulWorkflow<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        StatefulWorkflow<PropsT, StateT, OutputT, RenderingT>.RenderContext renderContext = baseContext instanceof StatefulWorkflow.RenderContext ? (StatefulWorkflow.RenderContext) baseContext : null;
        return renderContext == null ? new StatefulWorkflow.RenderContext(workflow, baseContext) : renderContext;
    }

    public static /* synthetic */ WorkflowAction action$default(StatefulWorkflow statefulWorkflow, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return Workflows.action(statefulWorkflow, str, function1);
    }

    public static final <PropsT, StateT, OutputT, RenderingT> WorkflowAction<PropsT, StateT, OutputT> action(StatefulWorkflow<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> statefulWorkflow, final String name, Function1<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater, Unit> update) {
        Intrinsics.checkNotNullParameter(statefulWorkflow, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(update, "update");
        return Workflows.action(statefulWorkflow, new Function0<String>() { // from class: com.squareup.workflow1.Workflows__StatefulWorkflowKt.action.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return name;
            }
        }, update);
    }

    public static final <PropsT, StateT, OutputT, RenderingT> WorkflowAction<PropsT, StateT, OutputT> action(final StatefulWorkflow<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> statefulWorkflow, final Function0<String> name, final Function1<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater, Unit> update) {
        Intrinsics.checkNotNullParameter(statefulWorkflow, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(update, "update");
        return new WorkflowAction<PropsT, StateT, OutputT>() { // from class: com.squareup.workflow1.Workflows__StatefulWorkflowKt.action.2
            @Override // com.squareup.workflow1.WorkflowAction
            public void apply(WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater updater) {
                Intrinsics.checkNotNullParameter(updater, "<this>");
                update.invoke(updater);
            }

            public String toString() {
                return "action(" + name.invoke() + ")-" + statefulWorkflow;
            }
        };
    }
}
