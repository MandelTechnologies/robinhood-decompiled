package com.plaid.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

@SourceDebugExtension
/* renamed from: com.plaid.internal.S */
/* loaded from: classes16.dex */
public final class C5956S extends CallAdapter.Factory {
    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.areEqual(Call.class, CallAdapter.Factory.getRawType(returnType))) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>");
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) returnType);
        if (!Intrinsics.areEqual(CallAdapter.Factory.getRawType(parameterUpperBound), AbstractC6043b4.class)) {
            return null;
        }
        if (!(parameterUpperBound instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>");
        }
        ParameterizedType parameterizedType = (ParameterizedType) parameterUpperBound;
        Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, parameterizedType);
        Converter converterNextResponseBodyConverter = retrofit.nextResponseBodyConverter(null, CallAdapter.Factory.getParameterUpperBound(1, parameterizedType), annotations);
        Intrinsics.checkNotNull(parameterUpperBound2);
        Intrinsics.checkNotNull(converterNextResponseBodyConverter);
        return new C5939Q(parameterUpperBound2, converterNextResponseBodyConverter);
    }
}
