package com.squareup.workflow1;

import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.WorkflowInterceptor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WorkflowInterceptor.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0005B;\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\r2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJq\u0010\u001a\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0011\"\u0004\b\u0005\u0010\u00122\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00132\u0006\u0010\u0015\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00020\u00162$\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJC\u0010\"\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162'\u0010!\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001c¢\u0006\u0002\b H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R,\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m3636d2 = {"Lcom/squareup/workflow1/InterceptedRenderContext;", "P", "S", "O", "Lcom/squareup/workflow1/BaseRenderContext;", "Lcom/squareup/workflow1/Sink;", "Lcom/squareup/workflow1/WorkflowAction;", "baseRenderContext", "Lcom/squareup/workflow1/WorkflowInterceptor$RenderContextInterceptor;", "interceptor", "<init>", "(Lcom/squareup/workflow1/BaseRenderContext;Lcom/squareup/workflow1/WorkflowInterceptor$RenderContextInterceptor;)V", "value", "", "send", "(Lcom/squareup/workflow1/WorkflowAction;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lcom/squareup/workflow1/Workflow;", "child", "props", "", "key", "Lkotlin/Function1;", "handler", "renderChild", "(Lcom/squareup/workflow1/Workflow;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "sideEffect", "runningSideEffect", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/squareup/workflow1/BaseRenderContext;", "Lcom/squareup/workflow1/WorkflowInterceptor$RenderContextInterceptor;", "getActionSink", "()Lcom/squareup/workflow1/Sink;", "actionSink", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.InterceptedRenderContext, reason: use source file name */
/* loaded from: classes12.dex */
final class WorkflowInterceptor2<P, S, O> implements BaseRenderContext<P, S, O>, Sink<WorkflowAction<? super P, S, ? extends O>> {
    private final BaseRenderContext<P, S, O> baseRenderContext;
    private final WorkflowInterceptor.RenderContextInterceptor<P, S, O> interceptor;

    @Override // com.squareup.workflow1.BaseRenderContext
    public Sink<WorkflowAction<? super P, S, ? extends O>> getActionSink() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkflowInterceptor2(BaseRenderContext<? extends P, S, ? super O> baseRenderContext, WorkflowInterceptor.RenderContextInterceptor<P, S, O> interceptor) {
        Intrinsics.checkNotNullParameter(baseRenderContext, "baseRenderContext");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.baseRenderContext = baseRenderContext;
        this.interceptor = interceptor;
    }

    @Override // com.squareup.workflow1.Sink
    public void send(WorkflowAction<? super P, S, ? extends O> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.interceptor.onActionSent(value, new Function1<WorkflowAction<? super P, S, ? extends O>, Unit>(this) { // from class: com.squareup.workflow1.InterceptedRenderContext.send.1
            final /* synthetic */ WorkflowInterceptor2<P, S, O> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((WorkflowAction) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(WorkflowAction<? super P, S, ? extends O> interceptedAction) {
                Intrinsics.checkNotNullParameter(interceptedAction, "interceptedAction");
                ((WorkflowInterceptor2) this.this$0).baseRenderContext.getActionSink().send(interceptedAction);
            }
        });
    }

    @Override // com.squareup.workflow1.BaseRenderContext
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT renderChild(Workflow<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, Function1<? super ChildOutputT, ? extends WorkflowAction<? super P, S, ? extends O>> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        return (ChildRenderingT) this.interceptor.onRenderChild(child, props, key, handler, new Function4<Workflow<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT>, ChildPropsT, String, Function1<? super ChildOutputT, ? extends WorkflowAction<? super P, S, ? extends O>>, ChildRenderingT>(this) { // from class: com.squareup.workflow1.InterceptedRenderContext.renderChild.1
            final /* synthetic */ WorkflowInterceptor2<P, S, O> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, String str, Object obj3) {
                return invoke((Workflow<? super Workflow<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT>, ? extends ChildOutputT, ? extends ChildRenderingT>) obj, (Workflow<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT>) obj2, str, (Function1) obj3);
            }

            public final ChildRenderingT invoke(Workflow<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> iChild, ChildPropsT childpropst, String iKey, Function1<? super ChildOutputT, ? extends WorkflowAction<? super P, S, ? extends O>> iHandler) {
                Intrinsics.checkNotNullParameter(iChild, "iChild");
                Intrinsics.checkNotNullParameter(iKey, "iKey");
                Intrinsics.checkNotNullParameter(iHandler, "iHandler");
                return (ChildRenderingT) ((WorkflowInterceptor2) this.this$0).baseRenderContext.renderChild(iChild, childpropst, iKey, iHandler);
            }
        });
    }

    @Override // com.squareup.workflow1.BaseRenderContext
    public void runningSideEffect(String key, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> sideEffect) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        this.interceptor.onRunningSideEffect(key, new WorkflowInterceptor3(sideEffect, this, null), new Function2<String, Function1<? super Continuation<? super Unit>, ? extends Object>, Unit>(this) { // from class: com.squareup.workflow1.InterceptedRenderContext.runningSideEffect.1
            final /* synthetic */ WorkflowInterceptor2<P, S, O> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.this$0 = this;
            }

            /* compiled from: WorkflowInterceptor.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "P", "S", "O", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$1$1", m3645f = "WorkflowInterceptor.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1<Continuation<? super Unit>, Object> $iSideEffect;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$iSideEffect = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$iSideEffect, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function1<Continuation<? super Unit>, Object> function1 = this.$iSideEffect;
                        this.label = 1;
                        if (function1.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
                invoke2(str, function1);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String iKey, Function1<? super Continuation<? super Unit>, ? extends Object> iSideEffect) {
                Intrinsics.checkNotNullParameter(iKey, "iKey");
                Intrinsics.checkNotNullParameter(iSideEffect, "iSideEffect");
                ((WorkflowInterceptor2) this.this$0).baseRenderContext.runningSideEffect(iKey, new AnonymousClass1(iSideEffect, null));
            }
        });
    }
}
