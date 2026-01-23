package com.truelayer.payments.p419ui;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.p419ui.TrueLayerUI;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TrueLayerUI.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.TrueLayerUI$Companion", m3645f = "TrueLayerUI.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "getMandateStatus")
/* renamed from: com.truelayer.payments.ui.TrueLayerUI$Companion$getMandateStatus$1, reason: use source file name */
/* loaded from: classes12.dex */
final class TrueLayerUI4 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrueLayerUI.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrueLayerUI4(TrueLayerUI.Companion companion, Continuation<? super TrueLayerUI4> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getMandateStatus(null, null, null, this);
    }
}
