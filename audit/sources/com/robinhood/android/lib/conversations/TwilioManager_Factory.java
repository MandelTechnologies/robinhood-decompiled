package com.robinhood.android.lib.conversations;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TwilioManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/TwilioManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/conversations/TwilioManager;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "twilioClient", "Lcom/robinhood/android/lib/conversations/TwilioClient;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TwilioManager_Factory implements Factory<TwilioManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<LazyMoshi> moshi;
    private final Provider<TwilioClient> twilioClient;

    @JvmStatic
    public static final TwilioManager_Factory create(Provider<LazyMoshi> provider, Provider<TwilioClient> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final TwilioManager newInstance(LazyMoshi lazyMoshi, TwilioClient twilioClient) {
        return INSTANCE.newInstance(lazyMoshi, twilioClient);
    }

    public TwilioManager_Factory(Provider<LazyMoshi> moshi, Provider<TwilioClient> twilioClient) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(twilioClient, "twilioClient");
        this.moshi = moshi;
        this.twilioClient = twilioClient;
    }

    @Override // javax.inject.Provider
    public TwilioManager get() {
        Companion companion = INSTANCE;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        TwilioClient twilioClient = this.twilioClient.get();
        Intrinsics.checkNotNullExpressionValue(twilioClient, "get(...)");
        return companion.newInstance(lazyMoshi, twilioClient);
    }

    /* compiled from: TwilioManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/TwilioManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/conversations/TwilioManager_Factory;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "twilioClient", "Lcom/robinhood/android/lib/conversations/TwilioClient;", "newInstance", "Lcom/robinhood/android/lib/conversations/TwilioManager;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TwilioManager_Factory create(Provider<LazyMoshi> moshi, Provider<TwilioClient> twilioClient) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(twilioClient, "twilioClient");
            return new TwilioManager_Factory(moshi, twilioClient);
        }

        @JvmStatic
        public final TwilioManager newInstance(LazyMoshi moshi, TwilioClient twilioClient) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(twilioClient, "twilioClient");
            return new TwilioManager(moshi, twilioClient);
        }
    }
}
