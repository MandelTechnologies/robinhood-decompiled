package com.plaid.internal;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: com.plaid.internal.Q */
/* loaded from: classes16.dex */
public final class C5939Q<S, E> implements CallAdapter<S, Call<AbstractC6043b4<? extends S, ? extends E>>> {

    /* renamed from: a */
    public final Type f1636a;

    /* renamed from: b */
    public final Converter<ResponseBody, E> f1637b;

    public C5939Q(Type successType, Converter<ResponseBody, E> errorBodyConverter) {
        Intrinsics.checkNotNullParameter(successType, "successType");
        Intrinsics.checkNotNullParameter(errorBodyConverter, "errorBodyConverter");
        this.f1636a = successType;
        this.f1637b = errorBodyConverter;
    }

    @Override // retrofit2.CallAdapter
    public final Object adapt(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new C5965T(call, this.f1637b);
    }

    @Override // retrofit2.CallAdapter
    /* renamed from: responseType */
    public final Type getResponseType() {
        return this.f1636a;
    }
}
