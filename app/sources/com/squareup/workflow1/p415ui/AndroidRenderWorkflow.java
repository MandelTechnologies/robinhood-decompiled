package com.squareup.workflow1.p415ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.RenderWorkflow;
import com.squareup.workflow1.RenderingAndSnapshot;
import com.squareup.workflow1.TreeSnapshot;
import com.squareup.workflow1.Workflow;
import com.squareup.workflow1.WorkflowInterceptor;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AndroidRenderWorkflow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u009c\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2$\b\u0002\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m3636d2 = {"PropsT", "OutputT", "RenderingT", "Lcom/squareup/workflow1/Workflow;", "workflow", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/flow/StateFlow;", "props", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "", "Lcom/squareup/workflow1/WorkflowInterceptor;", "interceptors", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "onOutput", "renderWorkflowIn", "(Lcom/squareup/workflow1/Workflow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/SavedStateHandle;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;", "wf1-core-android"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.AndroidRenderWorkflowKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class AndroidRenderWorkflow {
    public static final <PropsT, OutputT, RenderingT> StateFlow<RenderingT> renderWorkflowIn(Workflow<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, CoroutineScope scope, StateFlow<? extends PropsT> props, SavedStateHandle savedStateHandle, List<? extends WorkflowInterceptor> interceptors, Function2<? super OutputT, ? super Continuation<? super Unit>, ? extends Object> onOutput) {
        PickledTreesnapshot pickledTreesnapshot;
        Workflow<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow2;
        CoroutineScope coroutineScope;
        StateFlow<? extends PropsT> stateFlow;
        List<? extends WorkflowInterceptor> list;
        Function2<? super OutputT, ? super Continuation<? super Unit>, ? extends Object> function2;
        TreeSnapshot snapshot;
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        if (savedStateHandle == null || (pickledTreesnapshot = (PickledTreesnapshot) savedStateHandle.get("com.squareup.workflow1.ui.renderWorkflowIn-snapshot")) == null) {
            workflow2 = workflow;
            coroutineScope = scope;
            stateFlow = props;
            list = interceptors;
            function2 = onOutput;
            snapshot = null;
        } else {
            workflow2 = workflow;
            coroutineScope = scope;
            stateFlow = props;
            list = interceptors;
            function2 = onOutput;
            snapshot = pickledTreesnapshot.getSnapshot();
        }
        StateFlow stateFlowRenderWorkflowIn = RenderWorkflow.renderWorkflowIn(workflow2, coroutineScope, stateFlow, snapshot, list, function2);
        final Flow flowOnEach = FlowKt.onEach(stateFlowRenderWorkflowIn, new C424824(savedStateHandle, null));
        return FlowKt.stateIn(new Flow<RenderingT>() { // from class: com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowOnEach.collect(new C424812(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Collect.kt */
            @Metadata(m3635d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m3636d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
            /* renamed from: com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2 */
            public static final class C424812 implements FlowCollector<RenderingAndSnapshot<? extends RenderingT>> {
                final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;

                @Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2", m3645f = "AndroidRenderWorkflow.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "emit")
                /* renamed from: com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C424812.this.emit(null, this);
                    }
                }

                public C424812(FlowCollector flowCollector) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                        Object rendering = ((RenderingAndSnapshot) obj).getRendering();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(rendering, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, coroutineScope, SharingStarted.INSTANCE.getEagerly(), ((RenderingAndSnapshot) stateFlowRenderWorkflowIn.getValue()).getRendering());
    }

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    /* compiled from: AndroidRenderWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u008a@"}, m3636d2 = {"<anonymous>", "", "PropsT", "OutputT", "RenderingT", "it", "Lcom/squareup/workflow1/RenderingAndSnapshot;"}, m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$4", m3645f = "AndroidRenderWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$4 */
    static final class C424824<RenderingT> extends ContinuationImpl7 implements Function2<RenderingAndSnapshot<? extends RenderingT>, Continuation<? super Unit>, Object> {
        final /* synthetic */ SavedStateHandle $savedStateHandle;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C424824(SavedStateHandle savedStateHandle, Continuation<? super C424824> continuation) {
            super(2, continuation);
            this.$savedStateHandle = savedStateHandle;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C424824 c424824 = new C424824(this.$savedStateHandle, continuation);
            c424824.L$0 = obj;
            return c424824;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RenderingAndSnapshot<? extends RenderingT> renderingAndSnapshot, Continuation<? super Unit> continuation) {
            return ((C424824) create(renderingAndSnapshot, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RenderingAndSnapshot renderingAndSnapshot = (RenderingAndSnapshot) this.L$0;
            SavedStateHandle savedStateHandle = this.$savedStateHandle;
            if (savedStateHandle != null) {
                savedStateHandle.set("com.squareup.workflow1.ui.renderWorkflowIn-snapshot", new PickledTreesnapshot(renderingAndSnapshot.getSnapshot()));
            }
            return Unit.INSTANCE;
        }
    }
}
