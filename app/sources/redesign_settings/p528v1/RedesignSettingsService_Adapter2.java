package redesign_settings.p528v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import redesign_settings.p528v1.RedesignSettingsService_Adapter;

/* compiled from: RedesignSettingsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lredesign_settings/v1/GetHighlightSettingsResponseDto;", "request", "Lredesign_settings/v1/GetHighlightSettingsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "redesign_settings.v1.RedesignSettingsService_Adapter$GetHighlightSettingsEndpoint$call$1", m3645f = "RedesignSettingsService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: redesign_settings.v1.RedesignSettingsService_Adapter$GetHighlightSettingsEndpoint$call$1, reason: use source file name */
/* loaded from: classes25.dex */
final class RedesignSettingsService_Adapter2 extends ContinuationImpl7 implements Function2<GetHighlightSettingsRequestDto, Continuation<? super GetHighlightSettingsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RedesignSettingsService_Adapter.GetHighlightSettingsEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedesignSettingsService_Adapter2(RedesignSettingsService_Adapter.GetHighlightSettingsEndpoint getHighlightSettingsEndpoint, Continuation<? super RedesignSettingsService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getHighlightSettingsEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RedesignSettingsService_Adapter2 redesignSettingsService_Adapter2 = new RedesignSettingsService_Adapter2(this.this$0, continuation);
        redesignSettingsService_Adapter2.L$0 = obj;
        return redesignSettingsService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetHighlightSettingsRequestDto getHighlightSettingsRequestDto, Continuation<? super GetHighlightSettingsResponseDto> continuation) {
        return ((RedesignSettingsService_Adapter2) create(getHighlightSettingsRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetHighlightSettingsRequestDto getHighlightSettingsRequestDto = (GetHighlightSettingsRequestDto) this.L$0;
        RedesignSettingsService redesignSettingsService = this.this$0.service;
        this.label = 1;
        Object objGetHighlightSettings = redesignSettingsService.GetHighlightSettings(getHighlightSettingsRequestDto, this);
        return objGetHighlightSettings == coroutine_suspended ? coroutine_suspended : objGetHighlightSettings;
    }
}
