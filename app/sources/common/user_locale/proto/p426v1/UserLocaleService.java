package common.user_locale.proto.p426v1;

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

/* compiled from: UserLocaleService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcommon/user_locale/proto/v1/UserLocaleService;", "", "Lcommon/user_locale/proto/v1/GetUserLocaleRequestDto;", "request", "Lcommon/user_locale/proto/v1/GetUserLocaleResponseDto;", "GetUserLocale", "(Lcommon/user_locale/proto/v1/GetUserLocaleRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common.user_locale.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "common.user_locale.proto.v1.UserLocaleService")
/* loaded from: classes18.dex */
public interface UserLocaleService {

    /* compiled from: UserLocaleService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "common.user_locale.proto.v1.UserLocaleService$DefaultImpls", m3645f = "UserLocaleService.kt", m3646l = {21}, m3647m = "GetUserLocale")
    /* renamed from: common.user_locale.proto.v1.UserLocaleService$GetUserLocale$1 */
    static final class C438061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C438061(Continuation<? super C438061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetUserLocale(null, null, this);
        }
    }

    Object GetUserLocale(GetUserLocaleRequestDto getUserLocaleRequestDto, Continuation<? super GetUserLocaleResponseDto> continuation);

    /* compiled from: UserLocaleService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetUserLocale(UserLocaleService userLocaleService, Request<GetUserLocaleRequestDto> request, Continuation<? super Response<GetUserLocaleResponseDto>> continuation) {
            C438061 c438061;
            if (continuation instanceof C438061) {
                c438061 = (C438061) continuation;
                int i = c438061.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c438061.label = i - Integer.MIN_VALUE;
                } else {
                    c438061 = new C438061(continuation);
                }
            }
            Object objGetUserLocale = c438061.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c438061.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetUserLocale);
                GetUserLocaleRequestDto data = request.getData();
                c438061.label = 1;
                objGetUserLocale = userLocaleService.GetUserLocale(data, c438061);
                if (objGetUserLocale == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetUserLocale);
            }
            return new Response(objGetUserLocale, null, 2, null);
        }
    }
}
