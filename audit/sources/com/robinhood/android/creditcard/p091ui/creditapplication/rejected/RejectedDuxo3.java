package com.robinhood.android.creditcard.p091ui.creditapplication.rejected;

import com.robinhood.android.creditcard.p091ui.creditapplication.rejected.RejectedDuxo4;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.ClaimSolidGoldCashPrizeResponse;
import com.robinhood.android.models.creditcard.api.graphql.ClaimSolidGoldCashPrizeResponse2;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RejectedDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedDuxo$claimCashPrize$2", m3645f = "RejectedDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedDuxo$claimCashPrize$2, reason: use source file name */
/* loaded from: classes2.dex */
final class RejectedDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RejectedDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RejectedDuxo3(RejectedDuxo rejectedDuxo, Continuation<? super RejectedDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = rejectedDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RejectedDuxo3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RejectedDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ClaimSolidGoldCashPrizeResponse.Response claimSolidGoldCashPrize;
        List<ClaimSolidGoldCashPrizeResponse2> errors;
        ClaimSolidGoldCashPrizeResponse.Response claimSolidGoldCashPrize2;
        ClaimSolidGoldCashPrizeResponse.Response.DataResponse data;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            this.this$0.applyMutation(new C125303(null));
            this.this$0.submit(new RejectedDuxo4.Error(ClaimSolidGoldCashPrizeResponse2.UNKNOWN_ERROR));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.this$0.identityId.get();
            if (str != null) {
                CreditCardStore creditCardStore = this.this$0.creditCardStore;
                this.label = 1;
                obj = creditCardStore.claimSolidGoldCashPrize(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.this$0.applyMutation(new C125314(null));
                this.this$0.submit(new RejectedDuxo4.Error(ClaimSolidGoldCashPrizeResponse2.UNKNOWN_ERROR));
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ClaimSolidGoldCashPrizeResponse claimSolidGoldCashPrizeResponse = (ClaimSolidGoldCashPrizeResponse) obj;
        String redemptionLink = (claimSolidGoldCashPrizeResponse == null || (claimSolidGoldCashPrize2 = claimSolidGoldCashPrizeResponse.getClaimSolidGoldCashPrize()) == null || (data = claimSolidGoldCashPrize2.getData()) == null) ? null : data.getRedemptionLink();
        if (redemptionLink != null) {
            this.this$0.applyMutation(new C125281(null));
            this.this$0.submit(new RejectedDuxo4.ViewLink(redemptionLink));
        } else {
            this.this$0.applyMutation(new C125292(null));
            ClaimSolidGoldCashPrizeResponse2 claimSolidGoldCashPrizeResponse2 = (claimSolidGoldCashPrizeResponse == null || (claimSolidGoldCashPrize = claimSolidGoldCashPrizeResponse.getClaimSolidGoldCashPrize()) == null || (errors = claimSolidGoldCashPrize.getErrors()) == null) ? null : (ClaimSolidGoldCashPrizeResponse2) CollectionsKt.getOrNull(errors, 0);
            RejectedDuxo rejectedDuxo = this.this$0;
            if (claimSolidGoldCashPrizeResponse2 == null) {
                claimSolidGoldCashPrizeResponse2 = ClaimSolidGoldCashPrizeResponse2.UNKNOWN_ERROR;
            }
            rejectedDuxo.submit(new RejectedDuxo4.Error(claimSolidGoldCashPrizeResponse2));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RejectedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedDuxo$claimCashPrize$2$1", m3645f = "RejectedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedDuxo$claimCashPrize$2$1 */
    static final class C125281 extends ContinuationImpl7 implements Function2<RejectedViewState, Continuation<? super RejectedViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125281(Continuation<? super C125281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125281 c125281 = new C125281(continuation);
            c125281.L$0 = obj;
            return c125281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RejectedViewState rejectedViewState, Continuation<? super RejectedViewState> continuation) {
            return ((C125281) create(rejectedViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((RejectedViewState) this.L$0).copy(false);
        }
    }

    /* compiled from: RejectedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedDuxo$claimCashPrize$2$2", m3645f = "RejectedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedDuxo$claimCashPrize$2$2 */
    static final class C125292 extends ContinuationImpl7 implements Function2<RejectedViewState, Continuation<? super RejectedViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125292(Continuation<? super C125292> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125292 c125292 = new C125292(continuation);
            c125292.L$0 = obj;
            return c125292;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RejectedViewState rejectedViewState, Continuation<? super RejectedViewState> continuation) {
            return ((C125292) create(rejectedViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((RejectedViewState) this.L$0).copy(false);
        }
    }

    /* compiled from: RejectedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedDuxo$claimCashPrize$2$3", m3645f = "RejectedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedDuxo$claimCashPrize$2$3 */
    static final class C125303 extends ContinuationImpl7 implements Function2<RejectedViewState, Continuation<? super RejectedViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125303(Continuation<? super C125303> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125303 c125303 = new C125303(continuation);
            c125303.L$0 = obj;
            return c125303;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RejectedViewState rejectedViewState, Continuation<? super RejectedViewState> continuation) {
            return ((C125303) create(rejectedViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((RejectedViewState) this.L$0).copy(false);
        }
    }

    /* compiled from: RejectedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedDuxo$claimCashPrize$2$4", m3645f = "RejectedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedDuxo$claimCashPrize$2$4 */
    static final class C125314 extends ContinuationImpl7 implements Function2<RejectedViewState, Continuation<? super RejectedViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125314(Continuation<? super C125314> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125314 c125314 = new C125314(continuation);
            c125314.L$0 = obj;
            return c125314;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RejectedViewState rejectedViewState, Continuation<? super RejectedViewState> continuation) {
            return ((C125314) create(rejectedViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((RejectedViewState) this.L$0).copy(false);
        }
    }
}
