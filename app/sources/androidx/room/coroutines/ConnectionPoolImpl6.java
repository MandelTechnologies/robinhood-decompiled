package androidx.room.coroutines;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConnectionPoolImpl.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", m3645f = "ConnectionPoolImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: androidx.room.coroutines.Pool$acquireWithTimeout$2, reason: use source file name */
/* loaded from: classes4.dex */
final class ConnectionPoolImpl6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<ConnectionPoolImpl3> $connection;
    Object L$0;
    int label;
    final /* synthetic */ ConnectionPoolImpl4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectionPoolImpl6(Ref.ObjectRef<ConnectionPoolImpl3> objectRef, ConnectionPoolImpl4 connectionPoolImpl4, Continuation<? super ConnectionPoolImpl6> continuation) {
        super(2, continuation);
        this.$connection = objectRef;
        this.this$0 = connectionPoolImpl4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConnectionPoolImpl6(this.$connection, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConnectionPoolImpl6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef<ConnectionPoolImpl3> objectRef;
        T t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef<ConnectionPoolImpl3> objectRef2 = this.$connection;
            ConnectionPoolImpl4 connectionPoolImpl4 = this.this$0;
            this.L$0 = objectRef2;
            this.label = 1;
            Object objAcquire = connectionPoolImpl4.acquire(this);
            if (objAcquire == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            t = objAcquire;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            t = obj;
        }
        objectRef.element = t;
        return Unit.INSTANCE;
    }
}
