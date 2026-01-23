package com.robinhood.android.remoteconfig;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.remoteconfig.RemoteConfigHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteConfigHelperModule_BindRemoteConfigHelperFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/remoteconfig/RemoteConfigHelperModule_BindRemoteConfigHelperFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/utils/remoteconfig/RemoteConfigHelper;", "module", "Lcom/robinhood/android/remoteconfig/RemoteConfigHelperModule;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "remoteConfigStalePref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/android/remoteconfig/RemoteConfigHelperModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-remoteconfig_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RemoteConfigHelperModule_BindRemoteConfigHelperFactory implements Factory<RemoteConfigHelper> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> context;
    private final RemoteConfigHelperModule module;
    private final Provider<BooleanPreference> remoteConfigStalePref;

    @JvmStatic
    public static final RemoteConfigHelper bindRemoteConfigHelper(RemoteConfigHelperModule remoteConfigHelperModule, Context context, BooleanPreference booleanPreference) {
        return INSTANCE.bindRemoteConfigHelper(remoteConfigHelperModule, context, booleanPreference);
    }

    @JvmStatic
    public static final RemoteConfigHelperModule_BindRemoteConfigHelperFactory create(RemoteConfigHelperModule remoteConfigHelperModule, Provider<Context> provider, Provider<BooleanPreference> provider2) {
        return INSTANCE.create(remoteConfigHelperModule, provider, provider2);
    }

    public RemoteConfigHelperModule_BindRemoteConfigHelperFactory(RemoteConfigHelperModule module, Provider<Context> context, Provider<BooleanPreference> remoteConfigStalePref) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteConfigStalePref, "remoteConfigStalePref");
        this.module = module;
        this.context = context;
        this.remoteConfigStalePref = remoteConfigStalePref;
    }

    @Override // javax.inject.Provider
    public RemoteConfigHelper get() {
        Companion companion = INSTANCE;
        RemoteConfigHelperModule remoteConfigHelperModule = this.module;
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        BooleanPreference booleanPreference = this.remoteConfigStalePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        return companion.bindRemoteConfigHelper(remoteConfigHelperModule, context, booleanPreference);
    }

    /* compiled from: RemoteConfigHelperModule_BindRemoteConfigHelperFactory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/remoteconfig/RemoteConfigHelperModule_BindRemoteConfigHelperFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/remoteconfig/RemoteConfigHelperModule_BindRemoteConfigHelperFactory;", "module", "Lcom/robinhood/android/remoteconfig/RemoteConfigHelperModule;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "remoteConfigStalePref", "Lcom/robinhood/prefs/BooleanPreference;", "bindRemoteConfigHelper", "Lcom/robinhood/utils/remoteconfig/RemoteConfigHelper;", "lib-remoteconfig_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RemoteConfigHelperModule_BindRemoteConfigHelperFactory create(RemoteConfigHelperModule module, Provider<Context> context, Provider<BooleanPreference> remoteConfigStalePref) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(remoteConfigStalePref, "remoteConfigStalePref");
            return new RemoteConfigHelperModule_BindRemoteConfigHelperFactory(module, context, remoteConfigStalePref);
        }

        @JvmStatic
        public final RemoteConfigHelper bindRemoteConfigHelper(RemoteConfigHelperModule module, Context context, BooleanPreference remoteConfigStalePref) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(remoteConfigStalePref, "remoteConfigStalePref");
            Object objCheckNotNull = Preconditions.checkNotNull(module.bindRemoteConfigHelper(context, remoteConfigStalePref), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (RemoteConfigHelper) objCheckNotNull;
        }
    }
}
