package com.robinhood.android.optionsstrategybuilder;

import com.robinhood.librobinhood.data.store.OptionTooltipStore;
import com.robinhood.models.p320db.OptionTooltip;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionStrategyBuilderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onResume$2$1", m3645f = "OptionStrategyBuilderDuxo.kt", m3646l = {478}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onResume$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionStrategyBuilderDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ String $strategyId;
    int label;
    final /* synthetic */ OptionStrategyBuilderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionStrategyBuilderDuxo4(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, String str, String str2, Continuation<? super OptionStrategyBuilderDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = optionStrategyBuilderDuxo;
        this.$strategyId = str;
        this.$accountNumber = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionStrategyBuilderDuxo4(this.this$0, this.$strategyId, this.$accountNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionStrategyBuilderDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OptionTooltipStore optionTooltipStore = this.this$0.optionTooltipStore;
            String str = this.$strategyId;
            String str2 = this.$accountNumber;
            this.label = 1;
            obj = optionTooltipStore.getOptionStrategyBuilderNavBarSettingsTooltip(str, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        final OptionTooltip optionTooltip = (OptionTooltip) obj;
        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onResume$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return OptionStrategyBuilderDuxo4.invokeSuspend$lambda$0(optionTooltip, (OptionStrategyBuilderViewState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState invokeSuspend$lambda$0(OptionTooltip optionTooltip, OptionStrategyBuilderViewState optionStrategyBuilderViewState) {
        return OptionStrategyBuilderViewState.copy$default(optionStrategyBuilderViewState, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionTooltip, null, null, false, 31457279, null);
    }
}
