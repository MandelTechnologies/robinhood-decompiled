package com.robinhood.android.lib.p166fx.provider;

import com.robinhood.models.p325fx.api.ApiFxQuote;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Duration;

/* compiled from: FxRatesProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;", "", "j$/time/Duration", "pollingInterval", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "streamFxRate", "(Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "forceFetchFxRate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-fx-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface FxRatesProvider {
    Object forceFetchFxRate(Continuation<? super ApiFxQuote> continuation);

    Flow<ApiFxQuote> streamFxRate(Duration pollingInterval);

    /* compiled from: FxRatesProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Flow streamFxRate$default(FxRatesProvider fxRatesProvider, Duration duration, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: streamFxRate");
            }
            if ((i & 1) != 0) {
                duration = Duration.ofSeconds(10L);
            }
            return fxRatesProvider.streamFxRate(duration);
        }
    }
}
