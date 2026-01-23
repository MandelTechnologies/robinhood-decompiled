package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.p320db.AchRelationship;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import retrofit2.Response;

/* compiled from: AutomaticDepositStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiAutomaticDeposit;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AutomaticDepositStore$createAutomaticDeposit$apiAutomaticDeposit$1", m3645f = "AutomaticDepositStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AutomaticDepositStore$createAutomaticDeposit$apiAutomaticDeposit$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AutomaticDepositStore2 extends ContinuationImpl7 implements Function1<Continuation<? super Response<ApiAutomaticDeposit>>, Object> {
    final /* synthetic */ UUID $achRhId;
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ ApiAutomaticDeposit.Frequency $frequency;
    int label;
    final /* synthetic */ AutomaticDepositStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutomaticDepositStore2(AutomaticDepositStore automaticDepositStore, UUID uuid, BigDecimal bigDecimal, ApiAutomaticDeposit.Frequency frequency, Continuation<? super AutomaticDepositStore2> continuation) {
        super(1, continuation);
        this.this$0 = automaticDepositStore;
        this.$achRhId = uuid;
        this.$amount = bigDecimal;
        this.$frequency = frequency;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AutomaticDepositStore2(this.this$0, this.$achRhId, this.$amount, this.$frequency, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Response<ApiAutomaticDeposit>> continuation) {
        return ((AutomaticDepositStore2) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        Cashier cashier = this.this$0.cashier;
        ApiAutomaticDeposit.Request request = new ApiAutomaticDeposit.Request(AchRelationship.INSTANCE.getUrl(this.$achRhId), this.$amount, this.$frequency);
        this.label = 1;
        Object objAddAutomaticDeposit = cashier.addAutomaticDeposit(request, this);
        return objAddAutomaticDeposit == coroutine_suspended ? coroutine_suspended : objAddAutomaticDeposit;
    }
}
