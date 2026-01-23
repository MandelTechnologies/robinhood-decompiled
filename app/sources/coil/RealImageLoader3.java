package coil;

import coil.request.ImageRequest;
import coil.request.ImageResult;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RealImageLoader.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcoil/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "coil.RealImageLoader$execute$2$job$1", m3645f = "RealImageLoader.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
/* renamed from: coil.RealImageLoader$execute$2$job$1, reason: use source file name */
/* loaded from: classes.dex */
final class RealImageLoader3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
    final /* synthetic */ ImageRequest $request;
    int label;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader3(RealImageLoader realImageLoader, ImageRequest imageRequest, Continuation<? super RealImageLoader3> continuation) {
        super(2, continuation);
        this.this$0 = realImageLoader;
        this.$request = imageRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealImageLoader3(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageResult> continuation) {
        return ((RealImageLoader3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        RealImageLoader realImageLoader = this.this$0;
        ImageRequest imageRequest = this.$request;
        this.label = 1;
        Object objExecuteMain = realImageLoader.executeMain(imageRequest, 1, this);
        return objExecuteMain == coroutine_suspended ? coroutine_suspended : objExecuteMain;
    }
}
