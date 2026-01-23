package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiOptionEvent;
import com.robinhood.models.api.ApiOptionExerciseRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionExerciseStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionExerciseStore$submitOptionExercise$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class OptionExerciseStore6 extends FunctionReferenceImpl implements Function2<ApiOptionExerciseRequest, Continuation<? super ApiOptionEvent>, Object>, ContinuationImpl6 {
    OptionExerciseStore6(Object obj) {
        super(2, obj, OptionsApi.class, "submitOptionExercise", "submitOptionExercise(Lcom/robinhood/models/api/ApiOptionExerciseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionExerciseRequest apiOptionExerciseRequest, Continuation<? super ApiOptionEvent> continuation) {
        return ((OptionsApi) this.receiver).submitOptionExercise(apiOptionExerciseRequest, continuation);
    }
}
