package com.squareup.workflow1;

import com.squareup.workflow1.WorkflowAction;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkflowAction.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062-\u0010\b\u001a)\u0012\u001a\u0012\u00180\nR\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f\u001ac\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00072-\u0010\b\u001a)\u0012\u001a\u0012\u00180\nR\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f\u001aW\u0010\r\u001a\u0016\u0012\u0004\u0012\u0002H\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u000f0\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00012\u0006\u0010\u0010\u001a\u0002H\u00022\u0006\u0010\u0011\u001a\u0002H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"action", "Lcom/squareup/workflow1/WorkflowAction;", "PropsT", "StateT", "OutputT", "name", "Lkotlin/Function0;", "", "apply", "Lkotlin/Function1;", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "", "Lkotlin/ExtensionFunctionType;", "applyTo", "Lkotlin/Pair;", "Lcom/squareup/workflow1/WorkflowOutput;", "props", "state", "(Lcom/squareup/workflow1/WorkflowAction;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "wf1-workflow-core"}, m3637k = 5, m3638mv = {1, 6, 0}, m3640xi = 48, m3641xs = "com/squareup/workflow1/Workflows")
/* renamed from: com.squareup.workflow1.Workflows__WorkflowActionKt, reason: use source file name */
/* loaded from: classes12.dex */
public final /* synthetic */ class WorkflowAction4 {
    public static /* synthetic */ WorkflowAction action$default(String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return Workflows.action(str, function1);
    }

    public static final <PropsT, StateT, OutputT> WorkflowAction<PropsT, StateT, OutputT> action(final String name, Function1<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater, Unit> apply) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(apply, "apply");
        return Workflows.action(new Function0<String>() { // from class: com.squareup.workflow1.Workflows__WorkflowActionKt.action.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return name;
            }
        }, apply);
    }

    public static final <PropsT, StateT, OutputT> WorkflowAction<PropsT, StateT, OutputT> action(final Function0<String> name, final Function1<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater, Unit> apply) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(apply, "apply");
        return new WorkflowAction<PropsT, StateT, OutputT>() { // from class: com.squareup.workflow1.Workflows__WorkflowActionKt.action.2
            @Override // com.squareup.workflow1.WorkflowAction
            public void apply(WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater updater) {
                Intrinsics.checkNotNullParameter(updater, "<this>");
                apply.invoke(updater);
            }

            public String toString() {
                return "WorkflowAction(" + name.invoke() + ")@" + hashCode();
            }
        };
    }

    public static final <PropsT, StateT, OutputT> Tuples2<StateT, WorkflowOutput<OutputT>> applyTo(WorkflowAction<? super PropsT, StateT, ? extends OutputT> workflowAction, PropsT propst, StateT statet) {
        Intrinsics.checkNotNullParameter(workflowAction, "<this>");
        WorkflowAction<? super Object, StateT, ? extends Object>.Updater updater = new WorkflowAction.Updater(workflowAction, propst, statet);
        workflowAction.apply(updater);
        return new Tuples2<>(updater.getState(), updater.getMaybeOutput$wf1_workflow_core());
    }
}
