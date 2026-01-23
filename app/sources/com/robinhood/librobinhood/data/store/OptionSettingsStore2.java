package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiOptionSettings;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionSettingsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionSettingsStore$getOptionSettings$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class OptionSettingsStore2 extends FunctionReferenceImpl implements Function2<String, Continuation<? super ApiOptionSettings>, Object>, ContinuationImpl6 {
    OptionSettingsStore2(Object obj) {
        super(2, obj, OptionsApi.class, "getOptionSettings", "getOptionSettings(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiOptionSettings> continuation) {
        return ((OptionsApi) this.receiver).getOptionSettings(str, continuation);
    }
}
