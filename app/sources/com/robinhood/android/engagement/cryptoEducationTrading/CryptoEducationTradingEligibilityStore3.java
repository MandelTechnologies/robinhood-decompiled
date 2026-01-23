package com.robinhood.android.engagement.cryptoEducationTrading;

import com.robinhood.android.engagement.cryptoEducationTrading.model.CryptoEducationEligibilityResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: CryptoEducationTradingEligibilityStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/engagement/cryptoEducationTrading/model/CryptoEducationEligibilityResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.engagement.cryptoEducationTrading.CryptoEducationTradingEligibilityStore$getCryptoEducationSeriesId$2", m3645f = "CryptoEducationTradingEligibilityStore.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.engagement.cryptoEducationTrading.CryptoEducationTradingEligibilityStore$getCryptoEducationSeriesId$2, reason: use source file name */
/* loaded from: classes7.dex */
final class CryptoEducationTradingEligibilityStore3 extends ContinuationImpl7 implements Function2<CryptoEducationEligibilityResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoEducationTradingEligibilityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoEducationTradingEligibilityStore3(CryptoEducationTradingEligibilityStore cryptoEducationTradingEligibilityStore, Continuation<? super CryptoEducationTradingEligibilityStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoEducationTradingEligibilityStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoEducationTradingEligibilityStore3 cryptoEducationTradingEligibilityStore3 = new CryptoEducationTradingEligibilityStore3(this.this$0, continuation);
        cryptoEducationTradingEligibilityStore3.L$0 = obj;
        return cryptoEducationTradingEligibilityStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoEducationEligibilityResponse cryptoEducationEligibilityResponse, Continuation<? super Unit> continuation) {
        return ((CryptoEducationTradingEligibilityStore3) create(cryptoEducationEligibilityResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoEducationEligibilityResponse cryptoEducationEligibilityResponse = (CryptoEducationEligibilityResponse) this.L$0;
            SharedFlow2 sharedFlow2 = this.this$0.cryptoEducationSeriesId;
            String lessonSeriesId = cryptoEducationEligibilityResponse.getLessonSeriesId();
            this.label = 1;
            if (sharedFlow2.emit(lessonSeriesId, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
