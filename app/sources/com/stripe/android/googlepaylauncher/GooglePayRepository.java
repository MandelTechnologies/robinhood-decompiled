package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.GooglePayAvailabilityClient;
import com.stripe.android.googlepaylauncher.GooglePayAvailabilityClient2;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: GooglePayRepository.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "", "Lkotlinx/coroutines/flow/Flow;", "", "isReady", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface GooglePayRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Flow<Boolean> isReady();

    /* compiled from: GooglePayRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;", "", "<init>", "()V", "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;", "defaultFactory", "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;", "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;", "googlePayAvailabilityClientFactory", "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;", "getGooglePayAvailabilityClientFactory", "()Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;", "setGooglePayAvailabilityClientFactory", "(Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;)V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final GooglePayAvailabilityClient2.Factory defaultFactory;
        private static volatile GooglePayAvailabilityClient.Factory googlePayAvailabilityClientFactory;

        private Companion() {
        }

        static {
            GooglePayAvailabilityClient2.Factory factory = new GooglePayAvailabilityClient2.Factory();
            defaultFactory = factory;
            googlePayAvailabilityClientFactory = factory;
        }

        public final GooglePayAvailabilityClient.Factory getGooglePayAvailabilityClientFactory() {
            return googlePayAvailabilityClientFactory;
        }
    }
}
