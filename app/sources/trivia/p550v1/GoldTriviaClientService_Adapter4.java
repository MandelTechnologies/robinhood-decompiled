package trivia.p550v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import trivia.p550v1.GoldTriviaClientService_Adapter;

/* compiled from: GoldTriviaClientService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Ltrivia/v1/SetTriviaEventReminderResponseDto;", "request", "Ltrivia/v1/SetTriviaEventReminderRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "trivia.v1.GoldTriviaClientService_Adapter$SetTriviaEventReminderEndpoint$call$1", m3645f = "GoldTriviaClientService_Adapter.kt", m3646l = {95}, m3647m = "invokeSuspend")
/* renamed from: trivia.v1.GoldTriviaClientService_Adapter$SetTriviaEventReminderEndpoint$call$1, reason: use source file name */
/* loaded from: classes28.dex */
final class GoldTriviaClientService_Adapter4 extends ContinuationImpl7 implements Function2<SetTriviaEventReminderRequestDto, Continuation<? super SetTriviaEventReminderResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldTriviaClientService_Adapter.SetTriviaEventReminderEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldTriviaClientService_Adapter4(GoldTriviaClientService_Adapter.SetTriviaEventReminderEndpoint setTriviaEventReminderEndpoint, Continuation<? super GoldTriviaClientService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = setTriviaEventReminderEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldTriviaClientService_Adapter4 goldTriviaClientService_Adapter4 = new GoldTriviaClientService_Adapter4(this.this$0, continuation);
        goldTriviaClientService_Adapter4.L$0 = obj;
        return goldTriviaClientService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SetTriviaEventReminderRequestDto setTriviaEventReminderRequestDto, Continuation<? super SetTriviaEventReminderResponseDto> continuation) {
        return ((GoldTriviaClientService_Adapter4) create(setTriviaEventReminderRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        SetTriviaEventReminderRequestDto setTriviaEventReminderRequestDto = (SetTriviaEventReminderRequestDto) this.L$0;
        GoldTriviaClientService goldTriviaClientService = this.this$0.service;
        this.label = 1;
        Object objSetTriviaEventReminder = goldTriviaClientService.SetTriviaEventReminder(setTriviaEventReminderRequestDto, this);
        return objSetTriviaEventReminder == coroutine_suspended ? coroutine_suspended : objSetTriviaEventReminder;
    }
}
