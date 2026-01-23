package com.stripe.android.core.networking;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: LinearRetryDelaySupplier.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0017¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "()V", "delay", "Lkotlin/time/Duration;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getDelay", "maxRetries", "", "remainingRetries", "getDelay-3nIYWDw", "(II)J", "maxDuration", "maxDuration-5sfh64U", "(I)J", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LinearRetryDelaySupplier implements RetryDelaySupplier {
    private static final Companion Companion = new Companion(null);
    private final long delay;

    public /* synthetic */ LinearRetryDelaySupplier(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private LinearRetryDelaySupplier(long j) {
        this.delay = j;
    }

    public LinearRetryDelaySupplier() {
        this(Duration3.toDuration(3L, DurationUnitJvm.SECONDS), null);
    }

    @Override // com.stripe.android.core.networking.RetryDelaySupplier
    /* renamed from: maxDuration-5sfh64U */
    public long mo26846maxDuration5sfh64U(int maxRetries) {
        return Duration.m28757timesUwyO8pc(this.delay, maxRetries);
    }

    @Override // com.stripe.android.core.networking.RetryDelaySupplier
    /* renamed from: getDelay-3nIYWDw */
    public long mo26845getDelay3nIYWDw(int maxRetries, int remainingRetries) {
        return this.delay;
    }

    /* compiled from: LinearRetryDelaySupplier.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/core/networking/LinearRetryDelaySupplier$Companion;", "", "()V", "DEFAULT_DELAY", "", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
