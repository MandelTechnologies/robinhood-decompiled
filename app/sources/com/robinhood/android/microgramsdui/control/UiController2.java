package com.robinhood.android.microgramsdui.control;

import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.microgramsdui.control.UiController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.Deferred;

/* compiled from: UiController.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.UiController$Companion", m3645f = "UiController.kt", m3646l = {136, 136}, m3647m = "uiController")
/* renamed from: com.robinhood.android.microgramsdui.control.UiController$Companion$uiController$2, reason: use source file name */
/* loaded from: classes8.dex */
final class UiController2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UiController.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UiController2(UiController.Companion companion, Continuation<? super UiController2> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.uiController((Deferred<MicrogramManager2>) null, this);
    }
}
