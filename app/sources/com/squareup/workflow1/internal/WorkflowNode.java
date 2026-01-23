package com.squareup.workflow1.internal;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.TreeSnapshot;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowIdentifier;
import com.squareup.workflow1.WorkflowInterceptor;
import com.squareup.workflow1.WorkflowInterceptor5;
import com.squareup.workflow1.WorkflowOutput;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.InlineLinkedList;
import com.squareup.workflow1.internal.RealRenderContext;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.selects.SelectBuilder;

/* compiled from: WorkflowNode.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0081\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J3\u00108\u001a\u0004\u0018\u0001H9\"\b\b\u0004\u00109*\u00020\u00132\u0018\u0010:\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001fH\u0002¢\u0006\u0002\u0010;J\u0018\u0010<\u001a\u00020=2\u0010\b\u0002\u0010>\u001a\n\u0018\u00010?j\u0004\u0018\u0001`@JA\u0010A\u001a\u0002042\u0006\u0010B\u001a\u00020+2'\u0010C\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0E\u0012\u0006\u0012\u0004\u0018\u00010\u00130D¢\u0006\u0002\bFH\u0002ø\u0001\u0000¢\u0006\u0002\u0010GJ1\u0010H\u001a\u00028\u00032\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b2\u0006\u0010I\u001a\u00028\u0000¢\u0006\u0002\u0010JJ5\u0010K\u001a\u00028\u00032\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b2\u0006\u0010L\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010JJA\u0010M\u001a\u00020=2\u0006\u0010B\u001a\u00020+2'\u0010C\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0E\u0012\u0006\u0012\u0004\u0018\u00010\u00130D¢\u0006\u0002\bFH\u0016ø\u0001\u0000¢\u0006\u0002\u0010NJ\u001e\u0010\r\u001a\u00020\u000e2\u0016\u0010\n\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bJ\"\u0010O\u001a\u00020=\"\u0004\b\u0004\u001092\u0014\u0010P\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H9\u0018\u00010R0QJ\b\u0010S\u001a\u00020+H\u0016J5\u0010T\u001a\u00020=2\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b2\u0006\u0010U\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010VR\u0014\u0010\u001a\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00028\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020403X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u00028\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R \u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u000207X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, m3636d2 = {"Lcom/squareup/workflow1/internal/WorkflowNode;", "PropsT", "StateT", "OutputT", "RenderingT", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/squareup/workflow1/internal/RealRenderContext$SideEffectRunner;", "Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;", "id", "Lcom/squareup/workflow1/internal/WorkflowNodeId;", "workflow", "Lcom/squareup/workflow1/StatefulWorkflow;", "initialProps", "snapshot", "Lcom/squareup/workflow1/TreeSnapshot;", "baseContext", "Lkotlin/coroutines/CoroutineContext;", "emitOutputToParent", "Lkotlin/Function1;", "", "parent", "interceptor", "Lcom/squareup/workflow1/WorkflowInterceptor;", "idCounter", "Lcom/squareup/workflow1/internal/IdCounter;", "(Lcom/squareup/workflow1/internal/WorkflowNodeId;Lcom/squareup/workflow1/StatefulWorkflow;Ljava/lang/Object;Lcom/squareup/workflow1/TreeSnapshot;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;Lcom/squareup/workflow1/WorkflowInterceptor;Lcom/squareup/workflow1/internal/IdCounter;)V", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "eventActionsChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/squareup/workflow1/WorkflowAction;", "getId", "()Lcom/squareup/workflow1/internal/WorkflowNodeId;", "identifier", "Lcom/squareup/workflow1/WorkflowIdentifier;", "getIdentifier", "()Lcom/squareup/workflow1/WorkflowIdentifier;", "lastProps", "Ljava/lang/Object;", "getParent", "()Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;", "renderKey", "", "getRenderKey", "()Ljava/lang/String;", "sessionId", "", "getSessionId", "()J", "sideEffects", "Lcom/squareup/workflow1/internal/ActiveStagingList;", "Lcom/squareup/workflow1/internal/SideEffectNode;", "state", "subtreeManager", "Lcom/squareup/workflow1/internal/SubtreeManager;", "applyAction", "T", "action", "(Lcom/squareup/workflow1/WorkflowAction;)Ljava/lang/Object;", "cancel", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "createSideEffectNode", "key", "sideEffect", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/squareup/workflow1/internal/SideEffectNode;", "render", "input", "(Lcom/squareup/workflow1/StatefulWorkflow;Ljava/lang/Object;)Ljava/lang/Object;", "renderWithStateType", "props", "runningSideEffect", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "tick", "selector", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lcom/squareup/workflow1/WorkflowOutput;", "toString", "updatePropsAndState", "newProps", "(Lcom/squareup/workflow1/StatefulWorkflow;Ljava/lang/Object;)V", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WorkflowNode<PropsT, StateT, OutputT, RenderingT> implements CoroutineScope, RealRenderContext.SideEffectRunner, WorkflowInterceptor.WorkflowSession {
    private final CoroutineContext coroutineContext;
    private final Function1<OutputT, Object> emitOutputToParent;
    private final Channel<WorkflowAction<PropsT, StateT, OutputT>> eventActionsChannel;
    private final WorkflowNodeId id;
    private final WorkflowInterceptor interceptor;
    private PropsT lastProps;
    private final WorkflowInterceptor.WorkflowSession parent;
    private final long sessionId;
    private final ActiveStagingList<SideEffectNode> sideEffects;
    private StateT state;
    private final SubtreeManager<PropsT, StateT, OutputT> subtreeManager;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkflowNode(WorkflowNodeId id, StatefulWorkflow<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT propst, TreeSnapshot treeSnapshot, CoroutineContext baseContext, Function1<? super OutputT, ? extends Object> emitOutputToParent, WorkflowInterceptor.WorkflowSession workflowSession, WorkflowInterceptor interceptor, IdCounter idCounter) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(emitOutputToParent, "emitOutputToParent");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.id = id;
        this.emitOutputToParent = emitOutputToParent;
        this.parent = workflowSession;
        this.interceptor = interceptor;
        this.coroutineContext = baseContext.plus(JobKt.Job((Job) baseContext.get(Job.INSTANCE))).plus(new CoroutineName(id.toString()));
        this.sessionId = idCounter == null ? 0L : idCounter.createId();
        this.subtreeManager = new SubtreeManager<>(treeSnapshot == null ? null : treeSnapshot.getChildTreeSnapshots$wf1_workflow_runtime(), getCoroutineContext(), new WorkflowNode2(this), this, interceptor, idCounter);
        this.sideEffects = new ActiveStagingList<>();
        this.lastProps = propst;
        this.eventActionsChannel = Channel4.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        interceptor.onSessionStarted(this, this);
        this.state = (StateT) WorkflowInterceptor5.intercept(interceptor, workflow, this).initialState(propst, treeSnapshot != null ? treeSnapshot.getWorkflowSnapshot$wf1_workflow_runtime() : null);
    }

    public final WorkflowNodeId getId() {
        return this.id;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WorkflowNode(com.squareup.workflow1.internal.WorkflowNodeId r13, com.squareup.workflow1.StatefulWorkflow r14, java.lang.Object r15, com.squareup.workflow1.TreeSnapshot r16, kotlin.coroutines.CoroutineContext r17, kotlin.jvm.functions.Function1 r18, com.squareup.workflow1.WorkflowInterceptor.WorkflowSession r19, com.squareup.workflow1.WorkflowInterceptor r20, com.squareup.workflow1.internal.IdCounter r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 32
            if (r1 == 0) goto La
            com.squareup.workflow1.internal.WorkflowNode$1 r1 = new kotlin.jvm.functions.Function1<OutputT, com.squareup.workflow1.WorkflowOutput<? extends OutputT>>() { // from class: com.squareup.workflow1.internal.WorkflowNode.1
                static {
                    /*
                        com.squareup.workflow1.internal.WorkflowNode$1 r0 = new com.squareup.workflow1.internal.WorkflowNode$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.squareup.workflow1.internal.WorkflowNode$1) com.squareup.workflow1.internal.WorkflowNode.1.INSTANCE com.squareup.workflow1.internal.WorkflowNode$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.squareup.workflow1.internal.WorkflowNode.C424791.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.squareup.workflow1.internal.WorkflowNode.C424791.<init>():void");
                }

                @Override // kotlin.jvm.functions.Function1
                public final com.squareup.workflow1.WorkflowOutput<OutputT> invoke(OutputT r2) {
                    /*
                        r1 = this;
                        com.squareup.workflow1.WorkflowOutput r0 = new com.squareup.workflow1.WorkflowOutput
                        r0.<init>(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.squareup.workflow1.internal.WorkflowNode.C424791.invoke(java.lang.Object):com.squareup.workflow1.WorkflowOutput");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.squareup.workflow1.WorkflowOutput r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.squareup.workflow1.internal.WorkflowNode.C424791.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r8 = r1
            goto Lc
        La:
            r8 = r18
        Lc:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L13
            r9 = r2
            goto L15
        L13:
            r9 = r19
        L15:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L1d
            com.squareup.workflow1.NoopWorkflowInterceptor r1 = com.squareup.workflow1.WorkflowInterceptor4.INSTANCE
            r10 = r1
            goto L1f
        L1d:
            r10 = r20
        L1f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L2d
            r11 = r2
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2 = r12
            goto L37
        L2d:
            r11 = r21
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
        L37:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.workflow1.internal.WorkflowNode.<init>(com.squareup.workflow1.internal.WorkflowNodeId, com.squareup.workflow1.StatefulWorkflow, java.lang.Object, com.squareup.workflow1.TreeSnapshot, kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function1, com.squareup.workflow1.WorkflowInterceptor$WorkflowSession, com.squareup.workflow1.WorkflowInterceptor, com.squareup.workflow1.internal.IdCounter, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public WorkflowInterceptor.WorkflowSession getParent() {
        return this.parent;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public WorkflowIdentifier getIdentifier() {
        return this.id.getIdentifier();
    }

    public String getRenderKey() {
        return this.id.getName();
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public String toString() {
        return "WorkflowInstance(identifier=" + getIdentifier() + ", renderKey=" + getRenderKey() + ", instanceId=" + getSessionId() + ", parent=" + ((Object) (getParent() == null ? null : "WorkflowInstance(…)")) + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RenderingT render(StatefulWorkflow<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> workflow, PropsT input) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        return renderWithStateType(workflow, input);
    }

    public final TreeSnapshot snapshot(StatefulWorkflow<?, ?, ?, ?> workflow) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        final Map<WorkflowNodeId, TreeSnapshot> mapCreateChildSnapshots = this.subtreeManager.createChildSnapshots();
        return new TreeSnapshot(WorkflowInterceptor5.intercept(this.interceptor, workflow, this).snapshotState(this.state), new Function0<Map<WorkflowNodeId, ? extends TreeSnapshot>>() { // from class: com.squareup.workflow1.internal.WorkflowNode.snapshot.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<WorkflowNodeId, ? extends TreeSnapshot> invoke() {
                return mapCreateChildSnapshots;
            }
        });
    }

    @Override // com.squareup.workflow1.internal.RealRenderContext.SideEffectRunner
    public void runningSideEffect(String key, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> sideEffect) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        for (InlineLinkedList.InlineListNode head = ((ActiveStagingList) this.sideEffects).staging.getHead(); head != null; head = head.getNextListNode()) {
            if (Intrinsics.areEqual(key, ((SideEffectNode) head).getKey())) {
                throw new IllegalArgumentException(("Expected side effect keys to be unique: \"" + key + '\"').toString());
            }
        }
        ActiveStagingList<SideEffectNode> activeStagingList = this.sideEffects;
        InlineLinkedList inlineLinkedList = ((ActiveStagingList) activeStagingList).active;
        InlineLinkedList.InlineListNode head2 = inlineLinkedList.getHead();
        InlineLinkedList.InlineListNode inlineListNodeCreateSideEffectNode = null;
        InlineLinkedList.InlineListNode inlineListNode = null;
        while (true) {
            if (head2 == null) {
                break;
            }
            if (Intrinsics.areEqual(key, ((SideEffectNode) head2).getKey())) {
                if (inlineListNode == null) {
                    inlineLinkedList.setHead(head2.getNextListNode());
                } else {
                    inlineListNode.setNextListNode(head2.getNextListNode());
                }
                if (Intrinsics.areEqual(inlineLinkedList.getTail(), head2)) {
                    inlineLinkedList.setTail(inlineListNode);
                }
                head2.setNextListNode(null);
                inlineListNodeCreateSideEffectNode = head2;
            } else {
                inlineListNode = head2;
                head2 = head2.getNextListNode();
            }
        }
        if (inlineListNodeCreateSideEffectNode == null) {
            inlineListNodeCreateSideEffectNode = createSideEffectNode(key, sideEffect);
        }
        ((ActiveStagingList) activeStagingList).staging.plusAssign(inlineListNodeCreateSideEffectNode);
    }

    public final <T> void tick(SelectBuilder<? super WorkflowOutput<? extends T>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.subtreeManager.tickChildren(selector);
        selector.invoke(this.eventActionsChannel.getOnReceive(), new WorkflowNode3(this, null));
    }

    public static /* synthetic */ void cancel$default(WorkflowNode workflowNode, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        workflowNode.cancel(cancellationException);
    }

    public final void cancel(CancellationException cause) {
        JobKt.cancel(getCoroutineContext(), cause);
    }

    private final RenderingT renderWithStateType(StatefulWorkflow<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT props) {
        updatePropsAndState(workflow, props);
        RealRenderContext realRenderContext = new RealRenderContext(this.subtreeManager, this, this.eventActionsChannel);
        RenderingT renderingt = (RenderingT) WorkflowInterceptor5.intercept(this.interceptor, workflow, this).render(props, this.state, Workflows.RenderContext(realRenderContext, workflow));
        realRenderContext.freeze();
        this.subtreeManager.commitRenderedChildren();
        for (InlineLinkedList.InlineListNode head = ((ActiveStagingList) this.sideEffects).staging.getHead(); head != null; head = head.getNextListNode()) {
            ((SideEffectNode) head).getJob().start();
        }
        ActiveStagingList<SideEffectNode> activeStagingList = this.sideEffects;
        for (InlineLinkedList.InlineListNode head2 = ((ActiveStagingList) activeStagingList).active.getHead(); head2 != null; head2 = head2.getNextListNode()) {
            Job.DefaultImpls.cancel$default(((SideEffectNode) head2).getJob(), null, 1, null);
        }
        InlineLinkedList inlineLinkedList = ((ActiveStagingList) activeStagingList).active;
        ((ActiveStagingList) activeStagingList).active = ((ActiveStagingList) activeStagingList).staging;
        ((ActiveStagingList) activeStagingList).staging = inlineLinkedList;
        ((ActiveStagingList) activeStagingList).staging.clear();
        return renderingt;
    }

    private final void updatePropsAndState(StatefulWorkflow<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT newProps) {
        if (!Intrinsics.areEqual(newProps, this.lastProps)) {
            this.state = (StateT) WorkflowInterceptor5.intercept(this.interceptor, workflow, this).onPropsChanged(this.lastProps, newProps, this.state);
        }
        this.lastProps = newProps;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T applyAction(WorkflowAction<? super PropsT, StateT, ? extends OutputT> action) {
        Tuples2 tuples2ApplyTo = Workflows.applyTo(action, this.lastProps, this.state);
        StateT statet = (StateT) tuples2ApplyTo.component1();
        WorkflowOutput workflowOutput = (WorkflowOutput) tuples2ApplyTo.component2();
        this.state = statet;
        if (workflowOutput == null) {
            return null;
        }
        return (T) this.emitOutputToParent.invoke(workflowOutput.getValue());
    }

    private final SideEffectNode createSideEffectNode(String key, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> sideEffect) {
        return new SideEffectNode(key, BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.plus(this, new CoroutineName("sideEffect[" + key + "] for " + this.id)), null, CoroutineStart.LAZY, sideEffect, 1, null));
    }
}
