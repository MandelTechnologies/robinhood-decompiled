package com.robinhood.crypto.perpetuals.store;

import com.robinhood.crypto.models.perpetuals.p288db.PerpetualButtons2;
import contracts.perpetuals.proto.p433v1.GetButtonsResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerpetualsButtonsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsButtonsStore$endpoint$2", m3645f = "PerpetualsButtonsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsButtonsStore$endpoint$2, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualsButtonsStore3 extends ContinuationImpl7 implements Function2<GetButtonsResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerpetualsButtonsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualsButtonsStore3(PerpetualsButtonsStore perpetualsButtonsStore, Continuation<? super PerpetualsButtonsStore3> continuation) {
        super(2, continuation);
        this.this$0 = perpetualsButtonsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerpetualsButtonsStore3 perpetualsButtonsStore3 = new PerpetualsButtonsStore3(this.this$0, continuation);
        perpetualsButtonsStore3.L$0 = obj;
        return perpetualsButtonsStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetButtonsResponseDto getButtonsResponseDto, Continuation<? super Unit> continuation) {
        return ((PerpetualsButtonsStore3) create(getButtonsResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.getDao().insert(PerpetualButtons2.toDbModel((GetButtonsResponseDto) this.L$0));
        return Unit.INSTANCE;
    }
}
