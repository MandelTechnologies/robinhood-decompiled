package com.squareup.workflow1.internal;

import com.squareup.workflow1.TreeSnapshot;
import com.squareup.workflow1.Workflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowInterceptor;
import com.squareup.workflow1.WorkflowOutput;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.InlineLinkedList;
import com.squareup.workflow1.internal.RealRenderContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.selects.SelectBuilder;

/* compiled from: SubtreeManager.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004Bm\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012&\u0010\u000b\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0019\u001a\u00020\u001aJ\u008d\u0001\u0010\u001b\u001a \u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0018\"\u0004\b\u0003\u0010\u001c\"\u0004\b\u0004\u0010\u001d\"\u0004\b\u0005\u0010\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001e0 2\u0006\u0010!\u001a\u0002H\u001c2\u0006\u0010\"\u001a\u00020#2$\u0010$\u001a \u0012\u0004\u0012\u0002H\u001d\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r0\fH\u0002¢\u0006\u0002\u0010%J\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006Jo\u0010'\u001a\u0002H\u001e\"\u0004\b\u0003\u0010\u001c\"\u0004\b\u0004\u0010\u001d\"\u0004\b\u0005\u0010\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001e0 2\u0006\u0010(\u001a\u0002H\u001c2\u0006\u0010\"\u001a\u00020#2$\u0010$\u001a \u0012\u0004\u0012\u0002H\u001d\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r0\fH\u0016¢\u0006\u0002\u0010)J\"\u0010*\u001a\u00020\u001a\"\u0004\b\u0003\u0010+2\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H+\u0018\u00010.0-R(\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00180\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000b\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/squareup/workflow1/internal/SubtreeManager;", "PropsT", "StateT", "OutputT", "Lcom/squareup/workflow1/internal/RealRenderContext$Renderer;", "snapshotCache", "", "Lcom/squareup/workflow1/internal/WorkflowNodeId;", "Lcom/squareup/workflow1/TreeSnapshot;", "contextForChildren", "Lkotlin/coroutines/CoroutineContext;", "emitActionToParent", "Lkotlin/Function1;", "Lcom/squareup/workflow1/WorkflowAction;", "", "workflowSession", "Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;", "interceptor", "Lcom/squareup/workflow1/WorkflowInterceptor;", "idCounter", "Lcom/squareup/workflow1/internal/IdCounter;", "(Ljava/util/Map;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;Lcom/squareup/workflow1/WorkflowInterceptor;Lcom/squareup/workflow1/internal/IdCounter;)V", "children", "Lcom/squareup/workflow1/internal/ActiveStagingList;", "Lcom/squareup/workflow1/internal/WorkflowChildNode;", "commitRenderedChildren", "", "createChildNode", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "child", "Lcom/squareup/workflow1/Workflow;", "initialProps", "key", "", "handler", "(Lcom/squareup/workflow1/Workflow;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/squareup/workflow1/internal/WorkflowChildNode;", "createChildSnapshots", "render", "props", "(Lcom/squareup/workflow1/Workflow;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tickChildren", "T", "selector", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lcom/squareup/workflow1/WorkflowOutput;", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SubtreeManager<PropsT, StateT, OutputT> implements RealRenderContext.Renderer<PropsT, StateT, OutputT> {
    private ActiveStagingList<WorkflowChildNode<?, ?, ?, ?, ?>> children;
    private final CoroutineContext contextForChildren;
    private final Function1<WorkflowAction<? super PropsT, StateT, ? extends OutputT>, Object> emitActionToParent;
    private final IdCounter idCounter;
    private final WorkflowInterceptor interceptor;
    private Map<WorkflowNodeId, TreeSnapshot> snapshotCache;
    private final WorkflowInterceptor.WorkflowSession workflowSession;

    /* JADX WARN: Multi-variable type inference failed */
    public SubtreeManager(Map<WorkflowNodeId, TreeSnapshot> map, CoroutineContext contextForChildren, Function1<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>, ? extends Object> emitActionToParent, WorkflowInterceptor.WorkflowSession workflowSession, WorkflowInterceptor interceptor, IdCounter idCounter) {
        Intrinsics.checkNotNullParameter(contextForChildren, "contextForChildren");
        Intrinsics.checkNotNullParameter(emitActionToParent, "emitActionToParent");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.snapshotCache = map;
        this.contextForChildren = contextForChildren;
        this.emitActionToParent = emitActionToParent;
        this.workflowSession = workflowSession;
        this.interceptor = interceptor;
        this.idCounter = idCounter;
        this.children = new ActiveStagingList<>();
    }

    public final void commitRenderedChildren() {
        ActiveStagingList<WorkflowChildNode<?, ?, ?, ?, ?>> activeStagingList = this.children;
        for (InlineLinkedList.InlineListNode head = ((ActiveStagingList) activeStagingList).active.getHead(); head != null; head = head.getNextListNode()) {
            WorkflowNode.cancel$default(((WorkflowChildNode) head).getWorkflowNode(), null, 1, null);
        }
        InlineLinkedList inlineLinkedList = ((ActiveStagingList) activeStagingList).active;
        ((ActiveStagingList) activeStagingList).active = ((ActiveStagingList) activeStagingList).staging;
        ((ActiveStagingList) activeStagingList).staging = inlineLinkedList;
        ((ActiveStagingList) activeStagingList).staging.clear();
        this.snapshotCache = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1<? super ChildOutputT, ? extends com.squareup.workflow1.WorkflowAction<? super PropsT, StateT, ? extends OutputT>>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.workflow1.internal.InlineLinkedList$InlineListNode] */
    @Override // com.squareup.workflow1.internal.RealRenderContext.Renderer
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT render(Workflow<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, Function1<? super ChildOutputT, ? extends WorkflowAction<? super PropsT, StateT, ? extends OutputT>> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        for (InlineLinkedList.InlineListNode head = ((ActiveStagingList) this.children).staging.getHead(); head != null; head = head.getNextListNode()) {
            if (((WorkflowChildNode) head).matches(child, key)) {
                throw new IllegalArgumentException(("Expected keys to be unique for " + Workflows.getIdentifier(child) + ": key=\"" + key + '\"').toString());
            }
        }
        ActiveStagingList<WorkflowChildNode<?, ?, ?, ?, ?>> activeStagingList = this.children;
        InlineLinkedList inlineLinkedList = ((ActiveStagingList) activeStagingList).active;
        WorkflowChildNode workflowChildNodeCreateChildNode = null;
        WorkflowChildNode workflowChildNode = null;
        WorkflowChildNode nextListNode = inlineLinkedList.getHead();
        while (true) {
            if (nextListNode == null) {
                break;
            }
            if (nextListNode.matches(child, key)) {
                if (workflowChildNode == null) {
                    inlineLinkedList.setHead(nextListNode.getNextListNode());
                } else {
                    workflowChildNode.setNextListNode((WorkflowChildNode) nextListNode.getNextListNode());
                }
                if (Intrinsics.areEqual(inlineLinkedList.getTail(), nextListNode)) {
                    inlineLinkedList.setTail(workflowChildNode);
                }
                nextListNode.setNextListNode((WorkflowChildNode) null);
                workflowChildNodeCreateChildNode = nextListNode;
            } else {
                workflowChildNode = nextListNode;
                nextListNode = nextListNode.getNextListNode();
            }
        }
        if (workflowChildNodeCreateChildNode == null) {
            workflowChildNodeCreateChildNode = createChildNode(child, props, key, handler);
        }
        ((ActiveStagingList) activeStagingList).staging.plusAssign(workflowChildNodeCreateChildNode);
        WorkflowChildNode workflowChildNode2 = workflowChildNodeCreateChildNode;
        workflowChildNode2.setHandler(handler);
        return (ChildRenderingT) workflowChildNode2.render(child.asStatefulWorkflow(), props);
    }

    public final <T> void tickChildren(SelectBuilder<? super WorkflowOutput<? extends T>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        for (InlineLinkedList.InlineListNode head = ((ActiveStagingList) this.children).active.getHead(); head != null; head = head.getNextListNode()) {
            ((WorkflowChildNode) head).getWorkflowNode().tick(selector);
        }
    }

    public final Map<WorkflowNodeId, TreeSnapshot> createChildSnapshots() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InlineLinkedList.InlineListNode head = ((ActiveStagingList) this.children).active.getHead(); head != null; head = head.getNextListNode()) {
            WorkflowChildNode workflowChildNode = (WorkflowChildNode) head;
            linkedHashMap.put(workflowChildNode.getId(), workflowChildNode.getWorkflowNode().snapshot(workflowChildNode.getWorkflow().asStatefulWorkflow()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [T, com.squareup.workflow1.internal.WorkflowChildNode, com.squareup.workflow1.internal.WorkflowChildNode<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>] */
    private final <ChildPropsT, ChildOutputT, ChildRenderingT> WorkflowChildNode<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> createChildNode(Workflow<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT initialProps, String key, Function1<? super ChildOutputT, ? extends WorkflowAction<? super PropsT, StateT, ? extends OutputT>> handler) {
        WorkflowNodeId workflowNodeIdM3157id = WorkflowNodeId2.m3157id(child, key);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Map<WorkflowNodeId, TreeSnapshot> map = this.snapshotCache;
        ?? r12 = (WorkflowChildNode<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>) new WorkflowChildNode(child, handler, new WorkflowNode(workflowNodeIdM3157id, child.asStatefulWorkflow(), initialProps, map == null ? null : map.get(workflowNodeIdM3157id), this.contextForChildren, new SubtreeManager2(objectRef, this), this.workflowSession, this.interceptor, this.idCounter));
        objectRef.element = r12;
        return r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <ChildOutputT, PropsT, StateT, OutputT, ChildPropsT> Object createChildNode$acceptChildOutput(Ref.ObjectRef<WorkflowChildNode<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> objectRef, SubtreeManager<PropsT, StateT, OutputT> subtreeManager, ChildOutputT childoutputt) {
        WorkflowChildNode<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> workflowChildNode;
        WorkflowChildNode<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> workflowChildNode2 = objectRef.element;
        if (workflowChildNode2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("node");
            workflowChildNode = null;
        } else {
            workflowChildNode = workflowChildNode2;
        }
        return ((SubtreeManager) subtreeManager).emitActionToParent.invoke(workflowChildNode.acceptChildOutput(childoutputt));
    }
}
