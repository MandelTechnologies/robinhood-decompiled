package com.robinhood.android.lib.store.instant;

import com.robinhood.android.lib.api.instant.InstantBonfireApi;
import com.robinhood.android.lib.models.instant.api.ApiInstantDepositCard;
import com.robinhood.android.lib.models.instant.p169db.InstantDepositCard;
import com.robinhood.android.lib.models.instant.p169db.InstantDepositCard2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstantDepositsCardStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/models/instant/db/InstantDepositCard;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.instant.InstantDepositsCardStore$endpoint$1", m3645f = "InstantDepositsCardStore.kt", m3646l = {27}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.store.instant.InstantDepositsCardStore$endpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
final class InstantDepositsCardStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super InstantDepositCard>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InstantDepositsCardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantDepositsCardStore2(InstantDepositsCardStore instantDepositsCardStore, Continuation<? super InstantDepositsCardStore2> continuation) {
        super(2, continuation);
        this.this$0 = instantDepositsCardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstantDepositsCardStore2 instantDepositsCardStore2 = new InstantDepositsCardStore2(this.this$0, continuation);
        instantDepositsCardStore2.L$0 = obj;
        return instantDepositsCardStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super InstantDepositCard> continuation) {
        return ((InstantDepositsCardStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            InstantBonfireApi instantBonfireApi = this.this$0.instantBonfireApi;
            this.label = 1;
            obj = instantBonfireApi.getInstantDepositsCard(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return InstantDepositCard2.toDbModel((ApiInstantDepositCard) obj);
    }
}
