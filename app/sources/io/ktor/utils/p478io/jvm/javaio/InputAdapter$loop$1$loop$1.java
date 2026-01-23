package io.ktor.utils.p478io.jvm.javaio;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Blocking.kt */
@Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1", m3645f = "Blocking.kt", m3646l = {EnumC7081g.f2781x2ba65ba3, 38}, m3647m = "loop")
/* loaded from: classes14.dex */
final class InputAdapter$loop$1$loop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InputAdapter$loop$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputAdapter$loop$1$loop$1(InputAdapter$loop$1 inputAdapter$loop$1, Continuation<? super InputAdapter$loop$1$loop$1> continuation) {
        super(continuation);
        this.this$0 = inputAdapter$loop$1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loop(this);
    }
}
