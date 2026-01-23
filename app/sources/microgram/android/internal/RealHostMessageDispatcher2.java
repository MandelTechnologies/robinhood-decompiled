package microgram.android.internal;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import microgram.Message;

/* compiled from: RealHostMessageDispatcher.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/CompletableDeferred;", "Lmicrogram/Message;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.android.internal.RealHostMessageDispatcher$sendMessageWithReply$3$2", m3645f = "RealHostMessageDispatcher.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: microgram.android.internal.RealHostMessageDispatcher$sendMessageWithReply$3$2, reason: use source file name */
/* loaded from: classes14.dex */
final class RealHostMessageDispatcher2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CompletableDeferred<Message>>, Object> {
    final /* synthetic */ String $messageId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RealHostMessageDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealHostMessageDispatcher2(RealHostMessageDispatcher realHostMessageDispatcher, String str, Continuation<? super RealHostMessageDispatcher2> continuation) {
        super(2, continuation);
        this.this$0 = realHostMessageDispatcher;
        this.$messageId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealHostMessageDispatcher2(this.this$0, this.$messageId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CompletableDeferred<Message>> continuation) {
        return ((RealHostMessageDispatcher2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        RealHostMessageDispatcher realHostMessageDispatcher;
        Mutex mutex;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.this$0.lock;
            realHostMessageDispatcher = this.this$0;
            String str2 = this.$messageId;
            this.L$0 = mutex2;
            this.L$1 = realHostMessageDispatcher;
            this.L$2 = str2;
            this.label = 1;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            str = str2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$2;
            realHostMessageDispatcher = (RealHostMessageDispatcher) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            return (CompletableDeferred) realHostMessageDispatcher.replies.remove(str);
        } finally {
            mutex.unlock(null);
        }
    }
}
