package com.robinhood.shared.security.provisions;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsModule_ProvideNotificationManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/security/provisions/PromptsModule_ProvideNotificationManagerFactory;", "Ldagger/internal/Factory;", "Landroidx/core/app/NotificationManagerCompat;", "applicationContext", "Ljavax/inject/Provider;", "Landroid/content/Context;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-security-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PromptsModule_ProvideNotificationManagerFactory implements Factory<NotificationManagerCompat> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> applicationContext;

    @JvmStatic
    public static final PromptsModule_ProvideNotificationManagerFactory create(Provider<Context> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final NotificationManagerCompat provideNotificationManager(Context context) {
        return INSTANCE.provideNotificationManager(context);
    }

    public PromptsModule_ProvideNotificationManagerFactory(Provider<Context> applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    @Override // javax.inject.Provider
    public NotificationManagerCompat get() {
        Companion companion = INSTANCE;
        Context context = this.applicationContext.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        return companion.provideNotificationManager(context);
    }

    /* compiled from: PromptsModule_ProvideNotificationManagerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/security/provisions/PromptsModule_ProvideNotificationManagerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/security/provisions/PromptsModule_ProvideNotificationManagerFactory;", "applicationContext", "Ljavax/inject/Provider;", "Landroid/content/Context;", "provideNotificationManager", "Landroidx/core/app/NotificationManagerCompat;", "lib-security-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PromptsModule_ProvideNotificationManagerFactory create(Provider<Context> applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            return new PromptsModule_ProvideNotificationManagerFactory(applicationContext);
        }

        @JvmStatic
        public final NotificationManagerCompat provideNotificationManager(Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Object objCheckNotNull = Preconditions.checkNotNull(PromptsModule.INSTANCE.provideNotificationManager(applicationContext), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (NotificationManagerCompat) objCheckNotNull;
        }
    }
}
