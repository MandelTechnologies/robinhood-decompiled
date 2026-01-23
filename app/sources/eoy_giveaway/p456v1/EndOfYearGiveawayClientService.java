package eoy_giveaway.p456v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import microgram.annotation.ManagedServices;

/* compiled from: EndOfYearGiveawayClientService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Leoy_giveaway/v1/EndOfYearGiveawayClientService;", "", "Leoy_giveaway/v1/RunScriptOnCanvasRequestDto;", "request", "Leoy_giveaway/v1/RunScriptOnCanvasResponseDto;", "RunScriptOnCanvas", "(Leoy_giveaway/v1/RunScriptOnCanvasRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Leoy_giveaway/v1/DismissProgramViewRequestDto;", "Leoy_giveaway/v1/DismissProgramViewResponseDto;", "DismissProgramView", "(Leoy_giveaway/v1/DismissProgramViewRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Leoy_giveaway/v1/ShowSystemShareScreenRequestDto;", "Leoy_giveaway/v1/ShowSystemShareScreenResponseDto;", "ShowSystemShareScreen", "(Leoy_giveaway/v1/ShowSystemShareScreenRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "eoy_giveaway.v1.EndOfYearGiveawayClientService")
/* loaded from: classes18.dex */
public interface EndOfYearGiveawayClientService {

    /* compiled from: EndOfYearGiveawayClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "eoy_giveaway.v1.EndOfYearGiveawayClientService$DefaultImpls", m3645f = "EndOfYearGiveawayClientService.kt", m3646l = {34}, m3647m = "DismissProgramView")
    /* renamed from: eoy_giveaway.v1.EndOfYearGiveawayClientService$DismissProgramView$1 */
    static final class C446571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C446571(Continuation<? super C446571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.DismissProgramView(null, null, this);
        }
    }

    /* compiled from: EndOfYearGiveawayClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "eoy_giveaway.v1.EndOfYearGiveawayClientService$DefaultImpls", m3645f = "EndOfYearGiveawayClientService.kt", m3646l = {24}, m3647m = "RunScriptOnCanvas")
    /* renamed from: eoy_giveaway.v1.EndOfYearGiveawayClientService$RunScriptOnCanvas$1 */
    static final class C446581 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C446581(Continuation<? super C446581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.RunScriptOnCanvas(null, null, this);
        }
    }

    /* compiled from: EndOfYearGiveawayClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "eoy_giveaway.v1.EndOfYearGiveawayClientService$DefaultImpls", m3645f = "EndOfYearGiveawayClientService.kt", m3646l = {44}, m3647m = "ShowSystemShareScreen")
    /* renamed from: eoy_giveaway.v1.EndOfYearGiveawayClientService$ShowSystemShareScreen$1 */
    static final class C446591 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C446591(Continuation<? super C446591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ShowSystemShareScreen(null, null, this);
        }
    }

    Object DismissProgramView(DismissProgramViewRequestDto dismissProgramViewRequestDto, Continuation<? super DismissProgramViewResponseDto> continuation);

    Object RunScriptOnCanvas(RunScriptOnCanvasRequestDto runScriptOnCanvasRequestDto, Continuation<? super RunScriptOnCanvasResponseDto> continuation);

    Object ShowSystemShareScreen(ShowSystemShareScreenRequestDto showSystemShareScreenRequestDto, Continuation<? super ShowSystemShareScreenResponseDto> continuation);

    /* compiled from: EndOfYearGiveawayClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object RunScriptOnCanvas(EndOfYearGiveawayClientService endOfYearGiveawayClientService, Request<RunScriptOnCanvasRequestDto> request, Continuation<? super Response<RunScriptOnCanvasResponseDto>> continuation) {
            C446581 c446581;
            if (continuation instanceof C446581) {
                c446581 = (C446581) continuation;
                int i = c446581.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c446581.label = i - Integer.MIN_VALUE;
                } else {
                    c446581 = new C446581(continuation);
                }
            }
            Object objRunScriptOnCanvas = c446581.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c446581.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objRunScriptOnCanvas);
                RunScriptOnCanvasRequestDto data = request.getData();
                c446581.label = 1;
                objRunScriptOnCanvas = endOfYearGiveawayClientService.RunScriptOnCanvas(data, c446581);
                if (objRunScriptOnCanvas == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRunScriptOnCanvas);
            }
            return new Response(objRunScriptOnCanvas, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object DismissProgramView(EndOfYearGiveawayClientService endOfYearGiveawayClientService, Request<DismissProgramViewRequestDto> request, Continuation<? super Response<DismissProgramViewResponseDto>> continuation) {
            C446571 c446571;
            if (continuation instanceof C446571) {
                c446571 = (C446571) continuation;
                int i = c446571.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c446571.label = i - Integer.MIN_VALUE;
                } else {
                    c446571 = new C446571(continuation);
                }
            }
            Object objDismissProgramView = c446571.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c446571.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objDismissProgramView);
                DismissProgramViewRequestDto data = request.getData();
                c446571.label = 1;
                objDismissProgramView = endOfYearGiveawayClientService.DismissProgramView(data, c446571);
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
        public static Object ShowSystemShareScreen(EndOfYearGiveawayClientService endOfYearGiveawayClientService, Request<ShowSystemShareScreenRequestDto> request, Continuation<? super Response<ShowSystemShareScreenResponseDto>> continuation) {
            C446591 c446591;
            if (continuation instanceof C446591) {
                c446591 = (C446591) continuation;
                int i = c446591.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c446591.label = i - Integer.MIN_VALUE;
                } else {
                    c446591 = new C446591(continuation);
                }
            }
            Object objShowSystemShareScreen = c446591.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c446591.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objShowSystemShareScreen);
                ShowSystemShareScreenRequestDto data = request.getData();
                c446591.label = 1;
                objShowSystemShareScreen = endOfYearGiveawayClientService.ShowSystemShareScreen(data, c446591);
                if (objShowSystemShareScreen == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objShowSystemShareScreen);
            }
            return new Response(objShowSystemShareScreen, null, 2, null);
        }
    }
}
