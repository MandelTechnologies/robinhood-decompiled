package com.robinhood.api.internalassettransfers;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.internalassettransfers.retrofit.InternalAssetTransfersApi;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* compiled from: InternalAssetTransfersModule_ProvideInternalAssetTransfersApiFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001a\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/api/internalassettransfers/InternalAssetTransfersModule_ProvideInternalAssetTransfersApiFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/api/internalassettransfers/retrofit/InternalAssetTransfersApi;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-api-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.internalassettransfers.InternalAssetTransfersModule_ProvideInternalAssetTransfersApiFactory */
/* loaded from: classes20.dex */
public final class C31592xa602d4a8 implements Factory<InternalAssetTransfersApi> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Retrofit> retrofit;

    @JvmStatic
    public static final C31592xa602d4a8 create(Provider<Retrofit> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final InternalAssetTransfersApi provideInternalAssetTransfersApi(Lazy<Retrofit> lazy) {
        return INSTANCE.provideInternalAssetTransfersApi(lazy);
    }

    public C31592xa602d4a8(Provider<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    @Override // javax.inject.Provider
    public InternalAssetTransfersApi get() {
        Companion companion = INSTANCE;
        Lazy<Retrofit> lazy = DoubleCheck.lazy(this.retrofit);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.provideInternalAssetTransfersApi(lazy);
    }

    /* compiled from: InternalAssetTransfersModule_ProvideInternalAssetTransfersApiFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007H\u0007J\u001b\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/api/internalassettransfers/InternalAssetTransfersModule_ProvideInternalAssetTransfersApiFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/internalassettransfers/InternalAssetTransfersModule_ProvideInternalAssetTransfersApiFactory;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideInternalAssetTransfersApi", "Lcom/robinhood/api/internalassettransfers/retrofit/InternalAssetTransfersApi;", "Ldagger/Lazy;", "lib-api-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.api.internalassettransfers.InternalAssetTransfersModule_ProvideInternalAssetTransfersApiFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C31592xa602d4a8 create(Provider<Retrofit> retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            return new C31592xa602d4a8(retrofit);
        }

        @JvmStatic
        public final InternalAssetTransfersApi provideInternalAssetTransfersApi(Lazy<Retrofit> retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object objCheckNotNull = Preconditions.checkNotNull(InternalAssetTransfersModule.INSTANCE.provideInternalAssetTransfersApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (InternalAssetTransfersApi) objCheckNotNull;
        }
    }
}
