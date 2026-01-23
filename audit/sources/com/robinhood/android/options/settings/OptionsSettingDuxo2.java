package com.robinhood.android.options.settings;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionsSettingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.settings.OptionsSettingDuxo$onResume$accountNumberObs$1", m3645f = "OptionsSettingDuxo.kt", m3646l = {78, 81, 85}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.settings.OptionsSettingDuxo$onResume$accountNumberObs$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsSettingDuxo2 extends ContinuationImpl7 implements Function2<Produce4<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ BrokerageAccountType $accountType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionsSettingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsSettingDuxo2(OptionsSettingDuxo optionsSettingDuxo, BrokerageAccountType brokerageAccountType, Continuation<? super OptionsSettingDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = optionsSettingDuxo;
        this.$accountType = brokerageAccountType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionsSettingDuxo2 optionsSettingDuxo2 = new OptionsSettingDuxo2(this.this$0, this.$accountType, continuation);
        optionsSettingDuxo2.L$0 = obj;
        return optionsSettingDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Produce4<? super String> produce4, Continuation<? super Unit> continuation) {
        return ((OptionsSettingDuxo2) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r1.send(r7, r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r7.collect(r4, r6) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final Produce4 produce4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            produce4 = (Produce4) this.L$0;
            AccountProvider accountProvider = this.this$0.accountProvider;
            BrokerageAccountType brokerageAccountType = this.$accountType;
            this.L$0 = produce4;
            this.label = 1;
            obj = accountProvider.getAccountsByTypeForced(brokerageAccountType, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        produce4 = (Produce4) this.L$0;
        ResultKt.throwOnFailure(obj);
        Account account = (Account) CollectionsKt.firstOrNull((List) obj);
        String accountNumber = account != null ? account.getAccountNumber() : null;
        if (accountNumber == null) {
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamIndividualAccountNumber()), Integer.MAX_VALUE, null, 2, null);
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$onResume$accountNumberObs$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((String) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    Object objSend = produce4.send(str, continuation);
                    return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.label = 3;
        } else {
            this.L$0 = null;
            this.label = 2;
        }
    }
}
