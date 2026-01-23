package com.robinhood.android.mcw.mcwquickconversion;

import com.robinhood.android.lib.store.mcw.McwStore;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.mcw.mcwquickconversion.models.QuickConversionDataState;
import com.robinhood.android.mcw.mcwquickconversion.models.QuickConversionEvent;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QuickConversionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwquickconversion.QuickConversionDuxo$convertCurrency$1$1", m3645f = "QuickConversionDuxo.kt", m3646l = {100}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.mcw.mcwquickconversion.QuickConversionDuxo$convertCurrency$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class QuickConversionDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QuickConversionDataState $ds;
    int label;
    final /* synthetic */ QuickConversionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuickConversionDuxo2(QuickConversionDuxo quickConversionDuxo, QuickConversionDataState quickConversionDataState, Continuation<? super QuickConversionDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = quickConversionDuxo;
        this.$ds = quickConversionDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuickConversionDuxo2(this.this$0, this.$ds, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((QuickConversionDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: QuickConversionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/mcwquickconversion/models/QuickConversionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwquickconversion.QuickConversionDuxo$convertCurrency$1$1$1", m3645f = "QuickConversionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.mcwquickconversion.QuickConversionDuxo$convertCurrency$1$1$1 */
    static final class C217851 extends ContinuationImpl7 implements Function2<QuickConversionDataState, Continuation<? super QuickConversionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C217851(Continuation<? super C217851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217851 c217851 = new C217851(continuation);
            c217851.L$0 = obj;
            return c217851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(QuickConversionDataState quickConversionDataState, Continuation<? super QuickConversionDataState> continuation) {
            return ((C217851) create(quickConversionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return QuickConversionDataState.copy$default((QuickConversionDataState) this.L$0, null, null, true, null, 11, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        QuickConversionDuxo quickConversionDuxo;
        C217862 c217862;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C217851(null));
                McwStore mcwStore = this.this$0.mcwStore;
                String accountNumber = ((QuickConversionKey) QuickConversionDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getAccountNumber();
                Currency sourceCurrency = this.$ds.getKey().getSourceCurrency();
                BigDecimal decimalValue = this.$ds.getKey().getAmountNeeded().getDecimalValue();
                this.label = 1;
                if (mcwStore.performQuickConversion(accountNumber, sourceCurrency, decimalValue, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.submit(new QuickConversionEvent.Completed(this.$ds.getKey().getCurrentBuyingPower().plus(this.$ds.getKey().getAmountNeeded())));
            quickConversionDuxo = this.this$0;
            c217862 = new C217862(null);
        } catch (Throwable th) {
            try {
                if (!Throwables.isNetworkRelated(th)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                }
                this.this$0.submit(new QuickConversionEvent.Error(th));
                quickConversionDuxo = this.this$0;
                c217862 = new C217862(null);
            } catch (Throwable th2) {
                this.this$0.applyMutation(new C217862(null));
                throw th2;
            }
        }
        quickConversionDuxo.applyMutation(c217862);
        return Unit.INSTANCE;
    }

    /* compiled from: QuickConversionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/mcwquickconversion/models/QuickConversionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwquickconversion.QuickConversionDuxo$convertCurrency$1$1$2", m3645f = "QuickConversionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.mcwquickconversion.QuickConversionDuxo$convertCurrency$1$1$2 */
    static final class C217862 extends ContinuationImpl7 implements Function2<QuickConversionDataState, Continuation<? super QuickConversionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C217862(Continuation<? super C217862> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217862 c217862 = new C217862(continuation);
            c217862.L$0 = obj;
            return c217862;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(QuickConversionDataState quickConversionDataState, Continuation<? super QuickConversionDataState> continuation) {
            return ((C217862) create(quickConversionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return QuickConversionDataState.copy$default((QuickConversionDataState) this.L$0, null, null, false, null, 11, null);
        }
    }
}
