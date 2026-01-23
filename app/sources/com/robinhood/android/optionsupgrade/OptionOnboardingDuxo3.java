package com.robinhood.android.optionsupgrade;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.options.contracts.OptionOnboarding2;
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
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1$accountFlow$1", m3645f = "OptionOnboardingDuxo.kt", m3646l = {123, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1$accountFlow$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingDuxo3 extends ContinuationImpl7 implements Function2<FlowCollector<? super Account>, Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionOnboarding2 $accountInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionOnboardingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOnboardingDuxo3(OptionOnboardingDuxo optionOnboardingDuxo, OptionOnboarding2 optionOnboarding2, Continuation<? super OptionOnboardingDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = optionOnboardingDuxo;
        this.$accountInfo = optionOnboarding2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOnboardingDuxo3 optionOnboardingDuxo3 = new OptionOnboardingDuxo3(this.this$0, this.$accountInfo, continuation);
        optionOnboardingDuxo3.L$0 = obj;
        return optionOnboardingDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Account> flowCollector, Continuation<? super Unit> continuation) {
        return ((OptionOnboardingDuxo3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            AccountProvider accountProvider = this.this$0.accountProvider;
            BrokerageAccountType accountType = ((OptionOnboarding2.AccountType) this.$accountInfo).getAccountType();
            this.L$0 = flowCollector;
            this.label = 1;
            obj = accountProvider.getAccountsByTypeForced(accountType, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        Object objFirst = CollectionsKt.first((List<? extends Object>) obj);
        this.L$0 = null;
        this.label = 2;
    }
}
