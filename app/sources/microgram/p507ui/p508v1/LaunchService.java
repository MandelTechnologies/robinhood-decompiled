package microgram.p507ui.p508v1;

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

/* compiled from: LaunchService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/ui/v1/LaunchService;", "", "Lmicrogram/ui/v1/LaunchRouterRequestDto;", "request", "Lmicrogram/ui/v1/LaunchRouterResponseDto;", "LaunchRouter", "(Lmicrogram/ui/v1/LaunchRouterRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/ui/v1/PresentBottomSheetRequestDto;", "Lmicrogram/ui/v1/PresentBottomSheetResponseDto;", "PresentBottomSheet", "(Lmicrogram/ui/v1/PresentBottomSheetRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/ui/v1/PresentAlertRequestDto;", "Lmicrogram/ui/v1/PresentAlertResponseDto;", "PresentAlert", "(Lmicrogram/ui/v1/PresentAlertRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.ui.v1.LaunchService")
/* loaded from: classes14.dex */
public interface LaunchService {

    /* compiled from: LaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.ui.v1.LaunchService$DefaultImpls", m3645f = "LaunchService.kt", m3646l = {24}, m3647m = "LaunchRouter")
    /* renamed from: microgram.ui.v1.LaunchService$LaunchRouter$1 */
    static final class C469061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C469061(Continuation<? super C469061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.LaunchRouter(null, null, this);
        }
    }

    /* compiled from: LaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.ui.v1.LaunchService$DefaultImpls", m3645f = "LaunchService.kt", m3646l = {44}, m3647m = "PresentAlert")
    /* renamed from: microgram.ui.v1.LaunchService$PresentAlert$1 */
    static final class C469071 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C469071(Continuation<? super C469071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.PresentAlert(null, null, this);
        }
    }

    /* compiled from: LaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.ui.v1.LaunchService$DefaultImpls", m3645f = "LaunchService.kt", m3646l = {34}, m3647m = "PresentBottomSheet")
    /* renamed from: microgram.ui.v1.LaunchService$PresentBottomSheet$1 */
    static final class C469081 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C469081(Continuation<? super C469081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.PresentBottomSheet(null, null, this);
        }
    }

    Object LaunchRouter(LaunchRouterRequestDto launchRouterRequestDto, Continuation<? super LaunchRouterResponseDto> continuation);

    Object PresentAlert(PresentAlertRequestDto presentAlertRequestDto, Continuation<? super PresentAlertResponseDto> continuation);

    Object PresentBottomSheet(PresentBottomSheetRequestDto presentBottomSheetRequestDto, Continuation<? super PresentBottomSheetResponseDto> continuation);

    /* compiled from: LaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object LaunchRouter(LaunchService launchService, Request<LaunchRouterRequestDto> request, Continuation<? super Response<LaunchRouterResponseDto>> continuation) {
            C469061 c469061;
            if (continuation instanceof C469061) {
                c469061 = (C469061) continuation;
                int i = c469061.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c469061.label = i - Integer.MIN_VALUE;
                } else {
                    c469061 = new C469061(continuation);
                }
            }
            Object objLaunchRouter = c469061.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c469061.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objLaunchRouter);
                LaunchRouterRequestDto data = request.getData();
                c469061.label = 1;
                objLaunchRouter = launchService.LaunchRouter(data, c469061);
                if (objLaunchRouter == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objLaunchRouter);
            }
            return new Response(objLaunchRouter, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object PresentBottomSheet(LaunchService launchService, Request<PresentBottomSheetRequestDto> request, Continuation<? super Response<PresentBottomSheetResponseDto>> continuation) {
            C469081 c469081;
            if (continuation instanceof C469081) {
                c469081 = (C469081) continuation;
                int i = c469081.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c469081.label = i - Integer.MIN_VALUE;
                } else {
                    c469081 = new C469081(continuation);
                }
            }
            Object objPresentBottomSheet = c469081.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c469081.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPresentBottomSheet);
                PresentBottomSheetRequestDto data = request.getData();
                c469081.label = 1;
                objPresentBottomSheet = launchService.PresentBottomSheet(data, c469081);
                if (objPresentBottomSheet == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPresentBottomSheet);
            }
            return new Response(objPresentBottomSheet, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object PresentAlert(LaunchService launchService, Request<PresentAlertRequestDto> request, Continuation<? super Response<PresentAlertResponseDto>> continuation) {
            C469071 c469071;
            if (continuation instanceof C469071) {
                c469071 = (C469071) continuation;
                int i = c469071.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c469071.label = i - Integer.MIN_VALUE;
                } else {
                    c469071 = new C469071(continuation);
                }
            }
            Object objPresentAlert = c469071.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c469071.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPresentAlert);
                PresentAlertRequestDto data = request.getData();
                c469071.label = 1;
                objPresentAlert = launchService.PresentAlert(data, c469071);
                if (objPresentAlert == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPresentAlert);
            }
            return new Response(objPresentAlert, null, 2, null);
        }
    }
}
