package microgram.contracts.money_movement.wire_account_creation.proto.p502v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import microgram.annotation.ManagedServices;

/* compiled from: WireAccountCreationService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/WireAccountCreationService;", "", "Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/DidLinkAccountRequestDto;", "request", "", "DidLinkAccount", "(Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/DidLinkAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram.contracts.money_movement.wire_account_creation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.contracts.money_movement.wire_account_creation.proto.v1.WireAccountCreationService")
/* loaded from: classes14.dex */
public interface WireAccountCreationService {

    /* compiled from: WireAccountCreationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.contracts.money_movement.wire_account_creation.proto.v1.WireAccountCreationService$DefaultImpls", m3645f = "WireAccountCreationService.kt", m3646l = {25}, m3647m = "DidLinkAccount")
    /* renamed from: microgram.contracts.money_movement.wire_account_creation.proto.v1.WireAccountCreationService$DidLinkAccount$1 */
    static final class C467531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C467531(Continuation<? super C467531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.DidLinkAccount(null, null, this);
        }
    }

    Object DidLinkAccount(DidLinkAccountRequestDto didLinkAccountRequestDto, Continuation<? super Unit> continuation);

    /* compiled from: WireAccountCreationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object DidLinkAccount(WireAccountCreationService wireAccountCreationService, Request<DidLinkAccountRequestDto> request, Continuation<? super Response<Unit>> continuation) {
            C467531 c467531;
            if (continuation instanceof C467531) {
                c467531 = (C467531) continuation;
                int i = c467531.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c467531.label = i - Integer.MIN_VALUE;
                } else {
                    c467531 = new C467531(continuation);
                }
            }
            Object obj = c467531.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c467531.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                DidLinkAccountRequestDto data = request.getData();
                c467531.label = 1;
                if (wireAccountCreationService.DidLinkAccount(data, c467531) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new Response(Unit.INSTANCE, null, 2, null);
        }
    }
}
