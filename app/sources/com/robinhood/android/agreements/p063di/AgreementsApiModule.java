package com.robinhood.android.agreements.p063di;

import com.robinhood.android.agreements.api.AgreementsApi;
import com.robinhood.api.annotation.IdentiRetrofit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: AgreementsApiModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/agreements/di/AgreementsApiModule;", "", "<init>", "()V", "provideAgreementsApi", "Lcom/robinhood/android/agreements/api/AgreementsApi;", "retrofit", "Lretrofit2/Retrofit;", "lib-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AgreementsApiModule {
    public static final AgreementsApiModule INSTANCE = new AgreementsApiModule();

    private AgreementsApiModule() {
    }

    public final AgreementsApi provideAgreementsApi(@IdentiRetrofit Retrofit retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(AgreementsApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (AgreementsApi) objCreate;
    }
}
