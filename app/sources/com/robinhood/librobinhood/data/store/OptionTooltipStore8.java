package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.models.api.ApiOptionTooltip;
import com.robinhood.models.api.ApiOptionTooltip6;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p320db.OptionTooltip2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionTooltipStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/OptionTooltip;", "<destruct>", "Lkotlin/Triple;", "", "Lcom/robinhood/models/api/OptionTooltipLocationItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionTooltipStore$getOptionStrategyBuilderTooltipEndpoint$1", m3645f = "OptionTooltipStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionTooltipStore$getOptionStrategyBuilderTooltipEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionTooltipStore8 extends ContinuationImpl7 implements Function2<Tuples3<? extends String, ? extends ApiOptionTooltip6, ? extends String>, Continuation<? super Optional<? extends OptionTooltip>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionTooltipStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionTooltipStore8(OptionTooltipStore optionTooltipStore, Continuation<? super OptionTooltipStore8> continuation) {
        super(2, continuation);
        this.this$0 = optionTooltipStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionTooltipStore8 optionTooltipStore8 = new OptionTooltipStore8(this.this$0, continuation);
        optionTooltipStore8.L$0 = obj;
        return optionTooltipStore8;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends String, ? extends ApiOptionTooltip6, ? extends String> tuples3, Continuation<? super Optional<? extends OptionTooltip>> continuation) {
        return invoke2((Tuples3<String, ? extends ApiOptionTooltip6, String>) tuples3, (Continuation<? super Optional<OptionTooltip>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples3<String, ? extends ApiOptionTooltip6, String> tuples3, Continuation<? super Optional<OptionTooltip>> continuation) {
        return ((OptionTooltipStore8) create(tuples3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples3 tuples3 = (Tuples3) this.L$0;
            String str = (String) tuples3.component1();
            ApiOptionTooltip6 apiOptionTooltip6 = (ApiOptionTooltip6) tuples3.component2();
            String str2 = (String) tuples3.component3();
            OptionsProduct optionsProduct = this.this$0.optionsProductApi;
            String serverValue = apiOptionTooltip6.getServerValue();
            this.label = 1;
            obj = optionsProduct.getOptionStrategyBuilderTooltip(str, serverValue, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Optional3.asOptional(OptionTooltip2.toDbModel((ApiOptionTooltip) obj));
    }
}
