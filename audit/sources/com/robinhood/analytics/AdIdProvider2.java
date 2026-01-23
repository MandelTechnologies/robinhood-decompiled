package com.robinhood.analytics;

import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdIdProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0014\b\u0004\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, m3636d2 = {"AdIdProvider", "Lcom/robinhood/analytics/AdIdProvider;", "block", "Lkotlin/Function0;", "Lio/reactivex/Observable;", "", "lib-analytics_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.AdIdProviderKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AdIdProvider2 {
    public static final AdIdProvider AdIdProvider(final Function0<? extends Observable<String>> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new AdIdProvider() { // from class: com.robinhood.analytics.AdIdProviderKt.AdIdProvider.1
            @Override // com.robinhood.analytics.AdIdProvider
            public Observable<String> getAdId() {
                return block.invoke();
            }
        };
    }
}
