package com.robinhood.shared.user.lib.deeplink.targets;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidDefaultDeeplinkTarget_HammerModule_ProvideFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/user/lib/deeplink/targets/AndroidDefaultDeeplinkTarget_HammerModule_ProvideFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AndroidDefaultDeeplinkTarget_HammerModule_ProvideFactory implements Factory<DeeplinkTarget4> {
    public static final AndroidDefaultDeeplinkTarget_HammerModule_ProvideFactory INSTANCE = new AndroidDefaultDeeplinkTarget_HammerModule_ProvideFactory();

    private AndroidDefaultDeeplinkTarget_HammerModule_ProvideFactory() {
    }

    @Override // javax.inject.Provider
    public DeeplinkTarget4 get() {
        return provide();
    }

    @JvmStatic
    public static final AndroidDefaultDeeplinkTarget_HammerModule_ProvideFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final DeeplinkTarget4 provide() {
        Object objCheckNotNull = Preconditions.checkNotNull(AndroidDefaultDeeplinkTarget_HammerModule.INSTANCE.provide(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (DeeplinkTarget4) objCheckNotNull;
    }
}
