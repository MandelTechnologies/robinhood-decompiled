package com.robinhood.store.isa;

import bonfire.proto.idl.windsor.p041v1.GetContributionAllowanceV2RequestDto;
import bonfire.proto.idl.windsor.p041v1.GetContributionAllowanceV2ResponseDto;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: IsaContributionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto;", "response", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2ResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.isa.IsaContributionStore$endpoint$2", m3645f = "IsaContributionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.isa.IsaContributionStore$endpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class IsaContributionStore3 extends ContinuationImpl7 implements Function3<GetContributionAllowanceV2RequestDto, GetContributionAllowanceV2ResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ IsaContributionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IsaContributionStore3(IsaContributionStore isaContributionStore, Continuation<? super IsaContributionStore3> continuation) {
        super(3, continuation);
        this.this$0 = isaContributionStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(GetContributionAllowanceV2RequestDto getContributionAllowanceV2RequestDto, GetContributionAllowanceV2ResponseDto getContributionAllowanceV2ResponseDto, Continuation<? super Unit> continuation) {
        IsaContributionStore3 isaContributionStore3 = new IsaContributionStore3(this.this$0, continuation);
        isaContributionStore3.L$0 = getContributionAllowanceV2RequestDto;
        isaContributionStore3.L$1 = getContributionAllowanceV2ResponseDto;
        return isaContributionStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GetContributionAllowanceV2RequestDto getContributionAllowanceV2RequestDto = (GetContributionAllowanceV2RequestDto) this.L$0;
            this.this$0.contributionDao.insert(IsaContributions4.toDbModel((GetContributionAllowanceV2ResponseDto) this.L$1, getContributionAllowanceV2RequestDto.getAccount_number()));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
