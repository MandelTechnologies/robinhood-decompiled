package com.robinhood.android.moneymovement.checkoutflow;

import com.robinhood.analytics.EventLogger;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentPreferenceDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$setupMicrogramActions$3$2", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
final class PaymentPreferenceDuxo$setupMicrogramActions$3$2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountId;
    int label;
    final /* synthetic */ PaymentPreferenceDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentPreferenceDuxo$setupMicrogramActions$3$2(PaymentPreferenceDuxo paymentPreferenceDuxo, String str, Continuation<? super PaymentPreferenceDuxo$setupMicrogramActions$3$2> continuation) {
        super(2, continuation);
        this.this$0 = paymentPreferenceDuxo;
        this.$accountId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentPreferenceDuxo$setupMicrogramActions$3$2(this.this$0, this.$accountId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentPreferenceDuxo$setupMicrogramActions$3$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaymentPreferenceDuxo paymentPreferenceDuxo = this.this$0;
        ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(paymentPreferenceDuxo, paymentPreferenceDuxo.transferAccountStore.stream(), (LifecycleEvent) null, 1, (Object) null);
        final String str = this.$accountId;
        final PaymentPreferenceDuxo paymentPreferenceDuxo2 = this.this$0;
        scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$setupMicrogramActions$3$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return PaymentPreferenceDuxo$setupMicrogramActions$3$2.invokeSuspend$lambda$2(str, paymentPreferenceDuxo2, (List) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(String str, PaymentPreferenceDuxo paymentPreferenceDuxo, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TransferAccount transferAccount = (TransferAccount) next;
            if (Intrinsics.areEqual(transferAccount.getAccountId(), str) && !paymentPreferenceDuxo.appearanceSet.contains(transferAccount.getAccountId())) {
                break;
            }
        }
        TransferAccount transferAccount2 = (TransferAccount) next;
        if (transferAccount2 != null) {
            paymentPreferenceDuxo.appearanceSet.add(transferAccount2.getAccountId());
            EventLogger.DefaultImpls.logAppear$default(paymentPreferenceDuxo.eventLogger, null, new Screen(Screen.Name.GOLD_BILLING_PAYMENT_PREFERENCE, null, null, null, 14, null), new Component(Component.ComponentType.ACCOUNT_SELECTOR, transferAccount2.getAccountNumber().subSequence(transferAccount2.getAccountNumber().length() - 4, transferAccount2.getAccountNumber().length()).toString(), null, 4, null), null, null, 25, null);
        }
        return Unit.INSTANCE;
    }
}
