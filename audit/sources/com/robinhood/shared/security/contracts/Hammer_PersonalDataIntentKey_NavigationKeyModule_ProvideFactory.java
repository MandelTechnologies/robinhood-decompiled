package com.robinhood.shared.security.contracts;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_PersonalDataIntentKey_NavigationKeyModule_ProvideFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/Hammer_PersonalDataIntentKey_NavigationKeyModule_ProvideFactory;", "Ldagger/internal/Factory;", "", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Hammer_PersonalDataIntentKey_NavigationKeyModule_ProvideFactory implements Factory<String> {
    public static final Hammer_PersonalDataIntentKey_NavigationKeyModule_ProvideFactory INSTANCE = new Hammer_PersonalDataIntentKey_NavigationKeyModule_ProvideFactory();

    private Hammer_PersonalDataIntentKey_NavigationKeyModule_ProvideFactory() {
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    @JvmStatic
    public static final Hammer_PersonalDataIntentKey_NavigationKeyModule_ProvideFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final String provide() {
        Object objCheckNotNull = Preconditions.checkNotNull(Hammer_PersonalDataIntentKey_NavigationKeyModule.INSTANCE.provide(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (String) objCheckNotNull;
    }
}
