package com.stripe.android.core.networking;

import kotlin.Metadata;

/* compiled from: RetryDelaySupplier.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/core/networking/RetryDelaySupplier;", "", "getDelay", "Lkotlin/time/Duration;", "maxRetries", "", "remainingRetries", "getDelay-3nIYWDw", "(II)J", "maxDuration", "maxDuration-5sfh64U", "(I)J", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface RetryDelaySupplier {
    /* renamed from: getDelay-3nIYWDw */
    long mo26845getDelay3nIYWDw(int maxRetries, int remainingRetries);

    /* renamed from: maxDuration-5sfh64U */
    long mo26846maxDuration5sfh64U(int maxRetries);
}
