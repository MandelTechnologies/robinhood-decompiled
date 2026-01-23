package com.robinhood.android.pdfrenderer;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.OkHttpClient;

/* compiled from: PdfRendererStoreImpl_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererStoreImpl_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/pdfrenderer/PdfRendererStoreImpl;", "client", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PdfRendererStoreImpl_Factory implements Factory<PdfRendererStore2> {
    private final Provider<OkHttpClient> client;
    private final Provider<CoroutineDispatcher> ioDispatcher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PdfRendererStoreImpl_Factory create(Provider<OkHttpClient> provider, Provider<CoroutineDispatcher> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final PdfRendererStore2 newInstance(OkHttpClient okHttpClient, CoroutineDispatcher coroutineDispatcher) {
        return INSTANCE.newInstance(okHttpClient, coroutineDispatcher);
    }

    public PdfRendererStoreImpl_Factory(Provider<OkHttpClient> client, Provider<CoroutineDispatcher> ioDispatcher) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.client = client;
        this.ioDispatcher = ioDispatcher;
    }

    @Override // javax.inject.Provider
    public PdfRendererStore2 get() {
        Companion companion = INSTANCE;
        OkHttpClient okHttpClient = this.client.get();
        Intrinsics.checkNotNullExpressionValue(okHttpClient, "get(...)");
        CoroutineDispatcher coroutineDispatcher = this.ioDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher, "get(...)");
        return companion.newInstance(okHttpClient, coroutineDispatcher);
    }

    /* compiled from: PdfRendererStoreImpl_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererStoreImpl_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/pdfrenderer/PdfRendererStoreImpl_Factory;", "client", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "newInstance", "Lcom/robinhood/android/pdfrenderer/PdfRendererStoreImpl;", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PdfRendererStoreImpl_Factory create(Provider<OkHttpClient> client, Provider<CoroutineDispatcher> ioDispatcher) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
            return new PdfRendererStoreImpl_Factory(client, ioDispatcher);
        }

        @JvmStatic
        public final PdfRendererStore2 newInstance(OkHttpClient client, CoroutineDispatcher ioDispatcher) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
            return new PdfRendererStore2(client, ioDispatcher);
        }
    }
}
