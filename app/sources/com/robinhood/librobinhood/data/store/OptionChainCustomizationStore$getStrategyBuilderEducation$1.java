package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.models.api.chainsettings.ApiChainCustomizationEducation;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionChainCustomizationStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OptionChainCustomizationStore$getStrategyBuilderEducation$1 extends FunctionReferenceImpl implements Function2<String, Continuation<? super ApiChainCustomizationEducation>, Object>, ContinuationImpl6 {
    OptionChainCustomizationStore$getStrategyBuilderEducation$1(Object obj) {
        super(2, obj, OptionsProduct.class, "getStrategyBuilderCustomizationEducation", "getStrategyBuilderCustomizationEducation(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiChainCustomizationEducation> continuation) {
        return ((OptionsProduct) this.receiver).getStrategyBuilderCustomizationEducation(str, continuation);
    }
}
