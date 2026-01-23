package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.models.api.OptionSeenContext;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionChainCustomizationDiscoveryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/OptionSeenContext;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore$recordOptionUserContextSeen$1", m3645f = "OptionChainCustomizationDiscoveryStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore$recordOptionUserContextSeen$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionChainCustomizationDiscoveryStore8 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionSeenContext, ? extends String>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionChainCustomizationDiscoveryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainCustomizationDiscoveryStore8(OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, Continuation<? super OptionChainCustomizationDiscoveryStore8> continuation) {
        super(2, continuation);
        this.this$0 = optionChainCustomizationDiscoveryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionChainCustomizationDiscoveryStore8 optionChainCustomizationDiscoveryStore8 = new OptionChainCustomizationDiscoveryStore8(this.this$0, continuation);
        optionChainCustomizationDiscoveryStore8.L$0 = obj;
        return optionChainCustomizationDiscoveryStore8;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionSeenContext, ? extends String> tuples2, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<? extends OptionSeenContext, String>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends OptionSeenContext, String> tuples2, Continuation<? super Unit> continuation) {
        return ((OptionChainCustomizationDiscoveryStore8) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            OptionSeenContext optionSeenContext = (OptionSeenContext) tuples2.component1();
            String str = (String) tuples2.component2();
            OptionsProduct optionsProduct = this.this$0.optionsProductApi;
            String serverValue = optionSeenContext.getServerValue();
            this.label = 1;
            if (optionsProduct.postOptionUserContextSeen(serverValue, str, this) == coroutine_suspended) {
                return coroutine_suspended;
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
