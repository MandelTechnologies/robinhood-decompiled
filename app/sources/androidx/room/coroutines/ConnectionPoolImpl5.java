package androidx.room.coroutines;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConnectionPoolImpl.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.room.coroutines.Pool", m3645f = "ConnectionPoolImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m3647m = "acquireWithTimeout-KLykuaI")
/* renamed from: androidx.room.coroutines.Pool$acquireWithTimeout$1, reason: use source file name */
/* loaded from: classes4.dex */
final class ConnectionPoolImpl5 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConnectionPoolImpl4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectionPoolImpl5(ConnectionPoolImpl4 connectionPoolImpl4, Continuation<? super ConnectionPoolImpl5> continuation) {
        super(continuation);
        this.this$0 = connectionPoolImpl4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8347acquireWithTimeoutKLykuaI(0L, null, this);
    }
}
