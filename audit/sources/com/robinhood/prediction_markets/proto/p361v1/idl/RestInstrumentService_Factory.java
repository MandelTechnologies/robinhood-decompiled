package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestInstrumentService_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/RestInstrumentService_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prediction_markets/proto/v1/idl/RestInstrumentService;", "retrofit", "Ljavax/inject/Provider;", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentServiceRetrofit;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RestInstrumentService_Factory implements Factory<RestInstrumentService> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InstrumentServiceRetrofit> retrofit;

    @JvmStatic
    public static final RestInstrumentService_Factory create(Provider<InstrumentServiceRetrofit> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final RestInstrumentService newInstance(InstrumentServiceRetrofit instrumentServiceRetrofit) {
        return INSTANCE.newInstance(instrumentServiceRetrofit);
    }

    public RestInstrumentService_Factory(Provider<InstrumentServiceRetrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    @Override // javax.inject.Provider
    public RestInstrumentService get() {
        Companion companion = INSTANCE;
        InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit.get();
        Intrinsics.checkNotNullExpressionValue(instrumentServiceRetrofit, "get(...)");
        return companion.newInstance(instrumentServiceRetrofit);
    }

    /* compiled from: RestInstrumentService_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/RestInstrumentService_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/prediction_markets/proto/v1/idl/RestInstrumentService_Factory;", "retrofit", "Ljavax/inject/Provider;", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentServiceRetrofit;", "newInstance", "Lcom/robinhood/prediction_markets/proto/v1/idl/RestInstrumentService;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RestInstrumentService_Factory create(Provider<InstrumentServiceRetrofit> retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            return new RestInstrumentService_Factory(retrofit);
        }

        @JvmStatic
        public final RestInstrumentService newInstance(InstrumentServiceRetrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            return new RestInstrumentService(retrofit);
        }
    }
}
