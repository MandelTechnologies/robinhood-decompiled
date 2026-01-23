package com.robinhood.shared.support.supportchat.util;

import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.mediaservice.RedirectImageLoader;
import com.robinhood.targetbackend.Endpoint;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatImageLoadHelper_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/support/supportchat/util/ChatImageLoadHelper_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/support/supportchat/util/ChatImageLoadHelper;", "endpoint", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/Endpoint;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "redirectImageLoader", "Lcom/robinhood/android/mediaservice/RedirectImageLoader;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-support-chat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ChatImageLoadHelper_Factory implements Factory<ChatImageLoadHelper> {
    private final Provider<BitmapStore> bitmapStore;
    private final Provider<Endpoint> endpoint;
    private final Provider<RedirectImageLoader> redirectImageLoader;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ChatImageLoadHelper_Factory create(Provider<Endpoint> provider, Provider<BitmapStore> provider2, Provider<RedirectImageLoader> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final ChatImageLoadHelper newInstance(Endpoint endpoint, BitmapStore bitmapStore, RedirectImageLoader redirectImageLoader) {
        return INSTANCE.newInstance(endpoint, bitmapStore, redirectImageLoader);
    }

    public ChatImageLoadHelper_Factory(Provider<Endpoint> endpoint, Provider<BitmapStore> bitmapStore, Provider<RedirectImageLoader> redirectImageLoader) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(redirectImageLoader, "redirectImageLoader");
        this.endpoint = endpoint;
        this.bitmapStore = bitmapStore;
        this.redirectImageLoader = redirectImageLoader;
    }

    @Override // javax.inject.Provider
    public ChatImageLoadHelper get() {
        Companion companion = INSTANCE;
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        BitmapStore bitmapStore = this.bitmapStore.get();
        Intrinsics.checkNotNullExpressionValue(bitmapStore, "get(...)");
        RedirectImageLoader redirectImageLoader = this.redirectImageLoader.get();
        Intrinsics.checkNotNullExpressionValue(redirectImageLoader, "get(...)");
        return companion.newInstance(endpoint, bitmapStore, redirectImageLoader);
    }

    /* compiled from: ChatImageLoadHelper_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/support/supportchat/util/ChatImageLoadHelper_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/support/supportchat/util/ChatImageLoadHelper_Factory;", "endpoint", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/Endpoint;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "redirectImageLoader", "Lcom/robinhood/android/mediaservice/RedirectImageLoader;", "newInstance", "Lcom/robinhood/shared/support/supportchat/util/ChatImageLoadHelper;", "lib-support-chat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ChatImageLoadHelper_Factory create(Provider<Endpoint> endpoint, Provider<BitmapStore> bitmapStore, Provider<RedirectImageLoader> redirectImageLoader) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(redirectImageLoader, "redirectImageLoader");
            return new ChatImageLoadHelper_Factory(endpoint, bitmapStore, redirectImageLoader);
        }

        @JvmStatic
        public final ChatImageLoadHelper newInstance(Endpoint endpoint, BitmapStore bitmapStore, RedirectImageLoader redirectImageLoader) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(redirectImageLoader, "redirectImageLoader");
            return new ChatImageLoadHelper(endpoint, bitmapStore, redirectImageLoader);
        }
    }
}
