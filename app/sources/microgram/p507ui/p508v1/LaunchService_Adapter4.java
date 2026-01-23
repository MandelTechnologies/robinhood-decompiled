package microgram.p507ui.p508v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.p507ui.p508v1.LaunchService_Adapter;

/* compiled from: LaunchService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/ui/v1/PresentBottomSheetResponseDto;", "request", "Lmicrogram/ui/v1/PresentBottomSheetRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.ui.v1.LaunchService_Adapter$PresentBottomSheetEndpoint$call$1", m3645f = "LaunchService_Adapter.kt", m3646l = {84}, m3647m = "invokeSuspend")
/* renamed from: microgram.ui.v1.LaunchService_Adapter$PresentBottomSheetEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class LaunchService_Adapter4 extends ContinuationImpl7 implements Function2<PresentBottomSheetRequestDto, Continuation<? super PresentBottomSheetResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LaunchService_Adapter.PresentBottomSheetEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LaunchService_Adapter4(LaunchService_Adapter.PresentBottomSheetEndpoint presentBottomSheetEndpoint, Continuation<? super LaunchService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = presentBottomSheetEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LaunchService_Adapter4 launchService_Adapter4 = new LaunchService_Adapter4(this.this$0, continuation);
        launchService_Adapter4.L$0 = obj;
        return launchService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PresentBottomSheetRequestDto presentBottomSheetRequestDto, Continuation<? super PresentBottomSheetResponseDto> continuation) {
        return ((LaunchService_Adapter4) create(presentBottomSheetRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PresentBottomSheetRequestDto presentBottomSheetRequestDto = (PresentBottomSheetRequestDto) this.L$0;
        LaunchService launchService = this.this$0.service;
        this.label = 1;
        Object objPresentBottomSheet = launchService.PresentBottomSheet(presentBottomSheetRequestDto, this);
        return objPresentBottomSheet == coroutine_suspended ? coroutine_suspended : objPresentBottomSheet;
    }
}
