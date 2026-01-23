package com.stripe.android.core.networking;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: ExponentialBackoffRetryDelaySupplier.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0017¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "()V", "incrementDuration", "Lkotlin/time/Duration;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getDelay", "maxRetries", "", "remainingRetries", "getDelay-3nIYWDw", "(II)J", "maxDuration", "maxDuration-5sfh64U", "(I)J", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ExponentialBackoffRetryDelaySupplier implements RetryDelaySupplier {
    private static final Companion Companion = new Companion(null);
    private final long incrementDuration;

    public /* synthetic */ ExponentialBackoffRetryDelaySupplier(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private ExponentialBackoffRetryDelaySupplier(long j) {
        this.incrementDuration = j;
    }

    public ExponentialBackoffRetryDelaySupplier() {
        this(Duration3.toDuration(2L, DurationUnitJvm.SECONDS), null);
    }

    @Override // com.stripe.android.core.networking.RetryDelaySupplier
    /* renamed from: maxDuration-5sfh64U, reason: not valid java name */
    public long mo26846maxDuration5sfh64U(int maxRetries) {
        Duration.Companion companion = Duration.INSTANCE;
        long duration = Duration3.toDuration(0, DurationUnitJvm.SECONDS);
        for (int i = maxRetries; i > 0; i--) {
            duration = Duration.m28755plusLRDsOJo(duration, mo26845getDelay3nIYWDw(maxRetries, i));
        }
        return duration;
    }

    @Override // com.stripe.android.core.networking.RetryDelaySupplier
    /* renamed from: getDelay-3nIYWDw, reason: not valid java name */
    public long mo26845getDelay3nIYWDw(int maxRetries, int remainingRetries) {
        int iCoerceIn = (maxRetries - RangesKt.coerceIn(remainingRetries, 1, maxRetries)) + 1;
        long j = this.incrementDuration;
        DurationUnitJvm durationUnitJvm = DurationUnitJvm.SECONDS;
        return Duration3.toDuration(Math.pow(Duration.m28758toDoubleimpl(j, durationUnitJvm), iCoerceIn), durationUnitJvm);
    }

    /* compiled from: ExponentialBackoffRetryDelaySupplier.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier$Companion;", "", "()V", "DEFAULT_INCREMENT_SECONDS", "", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
