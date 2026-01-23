package com.robinhood.android.screener;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableScreenerItemsViewModel2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuoteProviderModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/screener/QuoteProviderModule;", "", "<init>", "()V", "provideQuoteProvider", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/QuoteProvider;", "provider", "Lcom/robinhood/android/screener/SduiQuoteProvider;", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class QuoteProviderModule {
    public static final int $stable = 0;
    public static final QuoteProviderModule INSTANCE = new QuoteProviderModule();

    public final SduiPollableScreenerItemsViewModel2 provideQuoteProvider(SduiQuoteProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider;
    }

    private QuoteProviderModule() {
    }
}
