package com.squareup.workflow1.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [ChildOutputT] */
/* compiled from: SubtreeManager.kt */
@Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.internal.SubtreeManager$createChildNode$workflowNode$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class SubtreeManager2<ChildOutputT> extends FunctionReferenceImpl implements Function1<ChildOutputT, Object> {
    final /* synthetic */ Ref.ObjectRef<WorkflowChildNode<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> $node;
    final /* synthetic */ SubtreeManager<PropsT, StateT, OutputT> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubtreeManager2(Ref.ObjectRef<WorkflowChildNode<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> objectRef, SubtreeManager<PropsT, StateT, OutputT> subtreeManager) {
        super(1, Intrinsics.Kotlin.class, "acceptChildOutput", "createChildNode$acceptChildOutput(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/squareup/workflow1/internal/SubtreeManager;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        this.$node = objectRef;
        this.this$0 = subtreeManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(ChildOutputT childoutputt) {
        return SubtreeManager.createChildNode$acceptChildOutput(this.$node, this.this$0, childoutputt);
    }
}
