package microgram.android.http;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import microgram.networking.HttpRequest;

/* compiled from: RealHttpService.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.android.http.RealHttpService$onRequest$2$2$1$1", m3645f = "RealHttpService.kt", m3646l = {82}, m3647m = "invokeSuspend")
/* renamed from: microgram.android.http.RealHttpService$onRequest$2$2$1$1, reason: use source file name */
/* loaded from: classes14.dex */
final class RealHttpService3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HttpRequest $requestModel;
    int label;
    final /* synthetic */ RealHttpService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealHttpService3(RealHttpService realHttpService, HttpRequest httpRequest, Continuation<? super RealHttpService3> continuation) {
        super(2, continuation);
        this.this$0 = realHttpService;
        this.$requestModel = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealHttpService3(this.this$0, this.$requestModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RealHttpService3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RealHttpService realHttpService = this.this$0;
            String id = this.$requestModel.getId();
            this.label = 1;
            if (realHttpService.cancel(id, this) == coroutine_suspended) {
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
