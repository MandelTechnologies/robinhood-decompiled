package microgram.android.inject;

import android.content.Context;
import com.robinhood.android.tracing.RhTrace6;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.internal.guest.GuestRuntime;
import microgram.android.internal.guest.webview.MicrogramWebViewClient;

/* compiled from: MicrogramRuntimeModule_ProvideGuestRuntimeFactoryFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideGuestRuntimeFactoryFactory;", "Ldagger/internal/Factory;", "Lmicrogram/android/internal/guest/GuestRuntime$Factory;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MicrogramRuntimeModule_ProvideGuestRuntimeFactoryFactory implements Factory<GuestRuntime.Factory> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final GuestRuntime.Factory provideGuestRuntimeFactory(Context context, MicrogramWebViewClient microgramWebViewClient, RhTrace6 rhTrace6) {
        return INSTANCE.provideGuestRuntimeFactory(context, microgramWebViewClient, rhTrace6);
    }

    /* compiled from: MicrogramRuntimeModule_ProvideGuestRuntimeFactoryFactory.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideGuestRuntimeFactoryFactory$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lmicrogram/android/internal/guest/webview/MicrogramWebViewClient;", "client", "Lcom/robinhood/android/tracing/TrackTrace;", "instanceTrace", "Lmicrogram/android/internal/guest/GuestRuntime$Factory;", "provideGuestRuntimeFactory", "(Landroid/content/Context;Lmicrogram/android/internal/guest/webview/MicrogramWebViewClient;Lcom/robinhood/android/tracing/TrackTrace;)Lmicrogram/android/internal/guest/GuestRuntime$Factory;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GuestRuntime.Factory provideGuestRuntimeFactory(Context context, MicrogramWebViewClient client, RhTrace6 instanceTrace) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
            Object objCheckNotNull = Preconditions.checkNotNull(MicrogramRuntimeModule.INSTANCE.provideGuestRuntimeFactory(context, client, instanceTrace), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (GuestRuntime.Factory) objCheckNotNull;
        }
    }
}
