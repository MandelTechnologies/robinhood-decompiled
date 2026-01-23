package trivia.p550v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import eoy_giveaway.p456v1.DismissProgramViewRequestDto;
import eoy_giveaway.p456v1.DismissProgramViewResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import microgram.annotation.ManagedServices;

/* compiled from: GoldTriviaClientService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Ltrivia/v1/GoldTriviaClientService;", "", "Leoy_giveaway/v1/DismissProgramViewRequestDto;", "request", "Leoy_giveaway/v1/DismissProgramViewResponseDto;", "DismissProgramView", "(Leoy_giveaway/v1/DismissProgramViewRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/SeekVideoPlaybackRequestDto;", "Ltrivia/v1/SeekVideoPlaybackResponseDto;", "SeekVideoPlayback", "(Ltrivia/v1/SeekVideoPlaybackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/SetTriviaEventReminderRequestDto;", "Ltrivia/v1/SetTriviaEventReminderResponseDto;", "SetTriviaEventReminder", "(Ltrivia/v1/SetTriviaEventReminderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "trivia.v1.GoldTriviaClientService")
/* loaded from: classes28.dex */
public interface GoldTriviaClientService {

    /* compiled from: GoldTriviaClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "trivia.v1.GoldTriviaClientService$DefaultImpls", m3645f = "GoldTriviaClientService.kt", m3646l = {26}, m3647m = "DismissProgramView")
    /* renamed from: trivia.v1.GoldTriviaClientService$DismissProgramView$1 */
    static final class C490381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C490381(Continuation<? super C490381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.DismissProgramView(null, null, this);
        }
    }

    /* compiled from: GoldTriviaClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "trivia.v1.GoldTriviaClientService$DefaultImpls", m3645f = "GoldTriviaClientService.kt", m3646l = {36}, m3647m = "SeekVideoPlayback")
    /* renamed from: trivia.v1.GoldTriviaClientService$SeekVideoPlayback$1 */
    static final class C490391 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C490391(Continuation<? super C490391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.SeekVideoPlayback(null, null, this);
        }
    }

    /* compiled from: GoldTriviaClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "trivia.v1.GoldTriviaClientService$DefaultImpls", m3645f = "GoldTriviaClientService.kt", m3646l = {46}, m3647m = "SetTriviaEventReminder")
    /* renamed from: trivia.v1.GoldTriviaClientService$SetTriviaEventReminder$1 */
    static final class C490401 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C490401(Continuation<? super C490401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.SetTriviaEventReminder(null, null, this);
        }
    }

    Object DismissProgramView(DismissProgramViewRequestDto dismissProgramViewRequestDto, Continuation<? super DismissProgramViewResponseDto> continuation);

    Object SeekVideoPlayback(SeekVideoPlaybackRequestDto seekVideoPlaybackRequestDto, Continuation<? super SeekVideoPlaybackResponseDto> continuation);

    Object SetTriviaEventReminder(SetTriviaEventReminderRequestDto setTriviaEventReminderRequestDto, Continuation<? super SetTriviaEventReminderResponseDto> continuation);

    /* compiled from: GoldTriviaClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object DismissProgramView(GoldTriviaClientService goldTriviaClientService, Request<DismissProgramViewRequestDto> request, Continuation<? super Response<DismissProgramViewResponseDto>> continuation) {
            C490381 c490381;
            if (continuation instanceof C490381) {
                c490381 = (C490381) continuation;
                int i = c490381.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c490381.label = i - Integer.MIN_VALUE;
                } else {
                    c490381 = new C490381(continuation);
                }
            }
            Object objDismissProgramView = c490381.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c490381.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objDismissProgramView);
                DismissProgramViewRequestDto data = request.getData();
                c490381.label = 1;
                objDismissProgramView = goldTriviaClientService.DismissProgramView(data, c490381);
                if (objDismissProgramView == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDismissProgramView);
            }
            return new Response(objDismissProgramView, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object SeekVideoPlayback(GoldTriviaClientService goldTriviaClientService, Request<SeekVideoPlaybackRequestDto> request, Continuation<? super Response<SeekVideoPlaybackResponseDto>> continuation) {
            C490391 c490391;
            if (continuation instanceof C490391) {
                c490391 = (C490391) continuation;
                int i = c490391.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c490391.label = i - Integer.MIN_VALUE;
                } else {
                    c490391 = new C490391(continuation);
                }
            }
            Object objSeekVideoPlayback = c490391.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c490391.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSeekVideoPlayback);
                SeekVideoPlaybackRequestDto data = request.getData();
                c490391.label = 1;
                objSeekVideoPlayback = goldTriviaClientService.SeekVideoPlayback(data, c490391);
                if (objSeekVideoPlayback == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSeekVideoPlayback);
            }
            return new Response(objSeekVideoPlayback, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object SetTriviaEventReminder(GoldTriviaClientService goldTriviaClientService, Request<SetTriviaEventReminderRequestDto> request, Continuation<? super Response<SetTriviaEventReminderResponseDto>> continuation) {
            C490401 c490401;
            if (continuation instanceof C490401) {
                c490401 = (C490401) continuation;
                int i = c490401.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c490401.label = i - Integer.MIN_VALUE;
                } else {
                    c490401 = new C490401(continuation);
                }
            }
            Object objSetTriviaEventReminder = c490401.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c490401.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSetTriviaEventReminder);
                SetTriviaEventReminderRequestDto data = request.getData();
                c490401.label = 1;
                objSetTriviaEventReminder = goldTriviaClientService.SetTriviaEventReminder(data, c490401);
                if (objSetTriviaEventReminder == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSetTriviaEventReminder);
            }
            return new Response(objSetTriviaEventReminder, null, 2, null);
        }
    }
}
