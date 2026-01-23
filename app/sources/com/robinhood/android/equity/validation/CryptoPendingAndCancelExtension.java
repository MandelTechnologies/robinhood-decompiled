package com.robinhood.android.equity.validation;

import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;

/* compiled from: CryptoPendingAndCancelExtension.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0006H\u0086@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"cancelPendingCryptoOrders", "", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "minTimeInFlight", "", "markLoading", "Lkotlin/Function1;", "", "submitEvent", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent;", "(Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-equity-validation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.validation.CryptoPendingAndCancelExtensionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CryptoPendingAndCancelExtension {

    /* compiled from: CryptoPendingAndCancelExtension.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.CryptoPendingAndCancelExtensionKt", m3645f = "CryptoPendingAndCancelExtension.kt", m3646l = {17}, m3647m = "cancelPendingCryptoOrders")
    /* renamed from: com.robinhood.android.equity.validation.CryptoPendingAndCancelExtensionKt$cancelPendingCryptoOrders$1 */
    static final class C151281 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C151281(Continuation<? super C151281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoPendingAndCancelExtension.cancelPendingCryptoOrders(null, 0L, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object cancelPendingCryptoOrders(EquityOrderCheckValidator equityOrderCheckValidator, long j, Function1<? super Boolean, Unit> function1, Function1<? super EquityOrderEvent, Unit> function12, Continuation<? super Unit> continuation) {
        C151281 c151281;
        if (continuation instanceof C151281) {
            c151281 = (C151281) continuation;
            int i = c151281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c151281.label = i - Integer.MIN_VALUE;
            } else {
                c151281 = new C151281(continuation);
            }
        }
        Object obj = c151281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c151281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            function1.invoke(boxing.boxBoolean(true));
            C151292 c151292 = new C151292(equityOrderCheckValidator, j, function12, null);
            c151281.L$0 = function1;
            c151281.label = 1;
            if (CoroutineScope2.coroutineScope(c151292, c151281) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) c151281.L$0;
            ResultKt.throwOnFailure(obj);
        }
        function1.invoke(boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object cancelPendingCryptoOrders$default(EquityOrderCheckValidator equityOrderCheckValidator, long j, Function1 function1, Function1 function12, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        return cancelPendingCryptoOrders(equityOrderCheckValidator, j, function1, function12, continuation);
    }

    /* compiled from: CryptoPendingAndCancelExtension.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.CryptoPendingAndCancelExtensionKt$cancelPendingCryptoOrders$2", m3645f = "CryptoPendingAndCancelExtension.kt", m3646l = {19, 20}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equity.validation.CryptoPendingAndCancelExtensionKt$cancelPendingCryptoOrders$2 */
    static final class C151292 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $minTimeInFlight;
        final /* synthetic */ Function1<EquityOrderEvent, Unit> $submitEvent;
        final /* synthetic */ EquityOrderCheckValidator $this_cancelPendingCryptoOrders;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C151292(EquityOrderCheckValidator equityOrderCheckValidator, long j, Function1<? super EquityOrderEvent, Unit> function1, Continuation<? super C151292> continuation) {
            super(2, continuation);
            this.$this_cancelPendingCryptoOrders = equityOrderCheckValidator;
            this.$minTimeInFlight = j;
            this.$submitEvent = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151292 c151292 = new C151292(this.$this_cancelPendingCryptoOrders, this.$minTimeInFlight, this.$submitEvent, continuation);
            c151292.L$0 = obj;
            return c151292;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151292) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Job jobLaunch$default;
            Object objM13719cancelPendingCryptoOrdersIoAF18A;
            Object obj2;
            Throwable thM28553exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                jobLaunch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new CryptoPendingAndCancelExtension2(this.$minTimeInFlight, null), 3, null);
                EquityOrderCheckValidator equityOrderCheckValidator = this.$this_cancelPendingCryptoOrders;
                this.L$0 = jobLaunch$default;
                this.label = 1;
                objM13719cancelPendingCryptoOrdersIoAF18A = equityOrderCheckValidator.m13719cancelPendingCryptoOrdersIoAF18A(this);
                if (objM13719cancelPendingCryptoOrdersIoAF18A != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                Function1<EquityOrderEvent, Unit> function1 = this.$submitEvent;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
                if (thM28553exceptionOrNullimpl != null) {
                    StringResource stringResource = (StringResource) obj2;
                    if (stringResource != null) {
                        function1.invoke(new EquityOrderEvent.CancelPendingCryptoOrderEvent(stringResource, null));
                    }
                } else if (Throwables.isNetworkRelated(thM28553exceptionOrNullimpl)) {
                    function1.invoke(new EquityOrderEvent.CancelPendingCryptoOrderEvent(null, thM28553exceptionOrNullimpl));
                } else {
                    throw thM28553exceptionOrNullimpl;
                }
                return Unit.INSTANCE;
            }
            jobLaunch$default = (Job) this.L$0;
            ResultKt.throwOnFailure(obj);
            objM13719cancelPendingCryptoOrdersIoAF18A = ((Result) obj).getValue();
            this.L$0 = objM13719cancelPendingCryptoOrdersIoAF18A;
            this.label = 2;
            if (jobLaunch$default.join(this) != coroutine_suspended) {
                obj2 = objM13719cancelPendingCryptoOrdersIoAF18A;
                Function1<EquityOrderEvent, Unit> function12 = this.$submitEvent;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
                if (thM28553exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }
}
