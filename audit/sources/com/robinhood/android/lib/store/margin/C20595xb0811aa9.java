package com.robinhood.android.lib.store.margin;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.Account;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$flowIfNotManaged$$inlined$flatMapLatest$1", m3645f = "MarginSubscriptionFeeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$flowIfNotManaged$$inlined$flatMapLatest$1 */
/* loaded from: classes8.dex */
public final class C20595xb0811aa9<T> extends ContinuationImpl7 implements Function3<FlowCollector<? super T>, List<? extends Account>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0 $block$inlined;
    final /* synthetic */ Object $defaultValue$inlined;
    final /* synthetic */ Set $supportedAccountNumbers$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20595xb0811aa9(Continuation continuation, Function0 function0, Object obj, Set set) {
        super(3, continuation);
        this.$block$inlined = function0;
        this.$defaultValue$inlined = obj;
        this.$supportedAccountNumbers$inlined = set;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super T> flowCollector, List<? extends Account> list, Continuation<? super Unit> continuation) {
        C20595xb0811aa9 c20595xb0811aa9 = new C20595xb0811aa9(continuation, this.$block$inlined, this.$defaultValue$inlined, this.$supportedAccountNumbers$inlined);
        c20595xb0811aa9.L$0 = flowCollector;
        c20595xb0811aa9.L$1 = list;
        return c20595xb0811aa9.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Flow flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List<Account> list = (List) this.L$1;
            if ((list instanceof Collection) && list.isEmpty()) {
                flowFlowOf = FlowKt.flowOf(this.$defaultValue$inlined);
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
                }
            } else {
                for (Account account : list) {
                    if (this.$supportedAccountNumbers$inlined.contains(account.getAccountNumber()) && !account.isManaged()) {
                        flowFlowOf = (Flow) this.$block$inlined.invoke();
                        break;
                    }
                }
                flowFlowOf = FlowKt.flowOf(this.$defaultValue$inlined);
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
