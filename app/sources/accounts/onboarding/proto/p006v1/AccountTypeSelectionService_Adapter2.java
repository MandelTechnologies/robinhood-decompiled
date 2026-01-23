package accounts.onboarding.proto.p006v1;

import accounts.onboarding.proto.p006v1.AccountTypeSelectionService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountTypeSelectionService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Laccounts/onboarding/proto/v1/GetAvailableAccountTypesResponseDto;", "request", "Laccounts/onboarding/proto/v1/GetAvailableAccountTypesRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "accounts.onboarding.proto.v1.AccountTypeSelectionService_Adapter$GetAvailableAccountTypesEndpoint$call$1", m3645f = "AccountTypeSelectionService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: accounts.onboarding.proto.v1.AccountTypeSelectionService_Adapter$GetAvailableAccountTypesEndpoint$call$1, reason: use source file name */
/* loaded from: classes23.dex */
final class AccountTypeSelectionService_Adapter2 extends ContinuationImpl7 implements Function2<GetAvailableAccountTypesRequestDto, Continuation<? super GetAvailableAccountTypesResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountTypeSelectionService_Adapter.GetAvailableAccountTypesEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountTypeSelectionService_Adapter2(AccountTypeSelectionService_Adapter.GetAvailableAccountTypesEndpoint getAvailableAccountTypesEndpoint, Continuation<? super AccountTypeSelectionService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getAvailableAccountTypesEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountTypeSelectionService_Adapter2 accountTypeSelectionService_Adapter2 = new AccountTypeSelectionService_Adapter2(this.this$0, continuation);
        accountTypeSelectionService_Adapter2.L$0 = obj;
        return accountTypeSelectionService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetAvailableAccountTypesRequestDto getAvailableAccountTypesRequestDto, Continuation<? super GetAvailableAccountTypesResponseDto> continuation) {
        return ((AccountTypeSelectionService_Adapter2) create(getAvailableAccountTypesRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetAvailableAccountTypesRequestDto getAvailableAccountTypesRequestDto = (GetAvailableAccountTypesRequestDto) this.L$0;
        AccountTypeSelectionService accountTypeSelectionService = this.this$0.service;
        this.label = 1;
        Object objGetAvailableAccountTypes = accountTypeSelectionService.GetAvailableAccountTypes(getAvailableAccountTypesRequestDto, this);
        return objGetAvailableAccountTypes == coroutine_suspended ? coroutine_suspended : objGetAvailableAccountTypes;
    }
}
