package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.education.EducationApi;
import com.robinhood.shared.models.api.bonfire.education.lesson.ApiEducationSeries;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EducationLessonsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class EducationLessonsStore$seriesEndpoint$1 extends FunctionReferenceImpl implements Function2<String, Continuation<? super ApiEducationSeries>, Object>, ContinuationImpl6 {
    EducationLessonsStore$seriesEndpoint$1(Object obj) {
        super(2, obj, EducationApi.class, "getEducationSeries", "getEducationSeries(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiEducationSeries> continuation) {
        return ((EducationApi) this.receiver).getEducationSeries(str, continuation);
    }
}
