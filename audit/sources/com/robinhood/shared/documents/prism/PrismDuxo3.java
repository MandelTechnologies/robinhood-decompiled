package com.robinhood.shared.documents.prism;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PrismDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo", m3645f = "PrismDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "validatePhoto$feature_prism_externalDebug")
/* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$validatePhoto$1, reason: use source file name */
/* loaded from: classes6.dex */
final class PrismDuxo3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PrismDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrismDuxo3(PrismDuxo prismDuxo, Continuation<? super PrismDuxo3> continuation) {
        super(continuation);
        this.this$0 = prismDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.validatePhoto$feature_prism_externalDebug(null, this);
    }
}
