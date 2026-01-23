package com.robinhood.android.creditcard.p091ui.creditapplication.solidGoldDelay;

import com.robinhood.android.creditcard.p091ui.creditapplication.solidGoldDelay.SolidGoldDelayDuxo4;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.ManageSolidGoldOfferResponse;
import com.robinhood.android.models.creditcard.api.graphql.ManageSolidGoldOfferResponse2;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SolidGoldDelayDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.SolidGoldDelayDuxo$claimCashPrize$2", m3645f = "SolidGoldDelayDuxo.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.SolidGoldDelayDuxo$claimCashPrize$2, reason: use source file name */
/* loaded from: classes2.dex */
final class SolidGoldDelayDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    int label;
    final /* synthetic */ SolidGoldDelayDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SolidGoldDelayDuxo3(SolidGoldDelayDuxo solidGoldDelayDuxo, Function0<Unit> function0, Continuation<? super SolidGoldDelayDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = solidGoldDelayDuxo;
        this.$callback = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SolidGoldDelayDuxo3(this.this$0, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SolidGoldDelayDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ManageSolidGoldOfferResponse.Response manageSolidGoldOffer;
        List<ManageSolidGoldOfferResponse2> errors;
        ManageSolidGoldOfferResponse.Response manageSolidGoldOffer2;
        ManageSolidGoldOfferResponse.Response.DataResponse data;
        ManageSolidGoldOfferResponse.Response.DataResponse.CreditApp creditApp;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreditCardStore creditCardStore = this.this$0.creditCardStore;
                this.label = 1;
                obj = creditCardStore.manageSolidGoldOffer(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ManageSolidGoldOfferResponse manageSolidGoldOfferResponse = (ManageSolidGoldOfferResponse) obj;
            if (((manageSolidGoldOfferResponse == null || (manageSolidGoldOffer2 = manageSolidGoldOfferResponse.getManageSolidGoldOffer()) == null || (data = manageSolidGoldOffer2.getData()) == null || (creditApp = data.getCreditApp()) == null) ? null : creditApp.getId()) != null) {
                this.this$0.applyMutation(new C125741(null));
                this.$callback.invoke();
            } else {
                this.this$0.applyMutation(new C125752(null));
                ManageSolidGoldOfferResponse2 manageSolidGoldOfferResponse2 = (manageSolidGoldOfferResponse == null || (manageSolidGoldOffer = manageSolidGoldOfferResponse.getManageSolidGoldOffer()) == null || (errors = manageSolidGoldOffer.getErrors()) == null) ? null : (ManageSolidGoldOfferResponse2) CollectionsKt.getOrNull(errors, 0);
                SolidGoldDelayDuxo solidGoldDelayDuxo = this.this$0;
                if (manageSolidGoldOfferResponse2 == null) {
                    manageSolidGoldOfferResponse2 = ManageSolidGoldOfferResponse2.UNKNOWN_ERROR;
                }
                solidGoldDelayDuxo.submit(new SolidGoldDelayDuxo4.Error(manageSolidGoldOfferResponse2));
            }
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            this.this$0.applyMutation(new C125763(null));
            this.this$0.submit(new SolidGoldDelayDuxo4.Error(ManageSolidGoldOfferResponse2.UNKNOWN_ERROR));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SolidGoldDelayDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.SolidGoldDelayDuxo$claimCashPrize$2$1", m3645f = "SolidGoldDelayDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.SolidGoldDelayDuxo$claimCashPrize$2$1 */
    static final class C125741 extends ContinuationImpl7 implements Function2<SolidGoldDelayViewState, Continuation<? super SolidGoldDelayViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125741(Continuation<? super C125741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125741 c125741 = new C125741(continuation);
            c125741.L$0 = obj;
            return c125741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SolidGoldDelayViewState solidGoldDelayViewState, Continuation<? super SolidGoldDelayViewState> continuation) {
            return ((C125741) create(solidGoldDelayViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((SolidGoldDelayViewState) this.L$0).copy(false);
        }
    }

    /* compiled from: SolidGoldDelayDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.SolidGoldDelayDuxo$claimCashPrize$2$2", m3645f = "SolidGoldDelayDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.SolidGoldDelayDuxo$claimCashPrize$2$2 */
    static final class C125752 extends ContinuationImpl7 implements Function2<SolidGoldDelayViewState, Continuation<? super SolidGoldDelayViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125752(Continuation<? super C125752> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125752 c125752 = new C125752(continuation);
            c125752.L$0 = obj;
            return c125752;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SolidGoldDelayViewState solidGoldDelayViewState, Continuation<? super SolidGoldDelayViewState> continuation) {
            return ((C125752) create(solidGoldDelayViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((SolidGoldDelayViewState) this.L$0).copy(false);
        }
    }

    /* compiled from: SolidGoldDelayDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.SolidGoldDelayDuxo$claimCashPrize$2$3", m3645f = "SolidGoldDelayDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.SolidGoldDelayDuxo$claimCashPrize$2$3 */
    static final class C125763 extends ContinuationImpl7 implements Function2<SolidGoldDelayViewState, Continuation<? super SolidGoldDelayViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125763(Continuation<? super C125763> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125763 c125763 = new C125763(continuation);
            c125763.L$0 = obj;
            return c125763;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SolidGoldDelayViewState solidGoldDelayViewState, Continuation<? super SolidGoldDelayViewState> continuation) {
            return ((C125763) create(solidGoldDelayViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((SolidGoldDelayViewState) this.L$0).copy(false);
        }
    }
}
