package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.api.ApiMarginSettings;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LeveredMarginSettingsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.margin.LeveredMarginSettingsStore$getEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class LeveredMarginSettingsStore2 extends FunctionReferenceImpl implements Function2<String, Continuation<? super ApiMarginSettings>, Object>, ContinuationImpl6 {
    LeveredMarginSettingsStore2(Object obj) {
        super(2, obj, MarginInvestingApi.class, "getMarginSettings", "getMarginSettings(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiMarginSettings> continuation) {
        return ((MarginInvestingApi) this.receiver).getMarginSettings(str, continuation);
    }
}
