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
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionTooltipStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/OptionTooltip;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/OptionTooltipLocationItem;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionTooltipStore$getOptionChainTooltipEndpoint$1", m3645f = "OptionTooltipStore.kt", m3646l = {40}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionTooltipStore$getOptionChainTooltipEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionTooltipStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends ApiOptionTooltip6, ? extends String>, Continuation<? super Optional<? extends OptionTooltip>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionTooltipStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionTooltipStore2(OptionTooltipStore optionTooltipStore, Continuation<? super OptionTooltipStore2> continuation) {
        super(2, continuation);
        this.this$0 = optionTooltipStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionTooltipStore2 optionTooltipStore2 = new OptionTooltipStore2(this.this$0, continuation);
        optionTooltipStore2.L$0 = obj;
        return optionTooltipStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiOptionTooltip6, ? extends String> tuples2, Continuation<? super Optional<? extends OptionTooltip>> continuation) {
        return invoke2((Tuples2<? extends ApiOptionTooltip6, String>) tuples2, (Continuation<? super Optional<OptionTooltip>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends ApiOptionTooltip6, String> tuples2, Continuation<? super Optional<OptionTooltip>> continuation) {
        return ((OptionTooltipStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            ApiOptionTooltip6 apiOptionTooltip6 = (ApiOptionTooltip6) tuples2.component1();
            String str = (String) tuples2.component2();
            OptionsProduct optionsProduct = this.this$0.optionsProductApi;
            String serverValue = apiOptionTooltip6.getServerValue();
            this.label = 1;
            obj = optionsProduct.getOptionChainTooltip(serverValue, str, this);
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
