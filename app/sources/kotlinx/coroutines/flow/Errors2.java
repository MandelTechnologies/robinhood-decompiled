package kotlinx.coroutines.flow;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Errors;

/* compiled from: Errors.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m3645f = "Errors.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "emit")
/* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1, reason: use source file name */
/* loaded from: classes23.dex */
final class Errors2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Errors.C460912<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Errors2(Errors.C460912<? super T> c460912, Continuation<? super Errors2> continuation) {
        super(continuation);
        this.this$0 = c460912;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
