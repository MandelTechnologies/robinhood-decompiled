package com.robinhood.android.crypto.costbasis.hub;

import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;

/* compiled from: CryptoCostBasisHubDeeplinkTarget_HammerModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDeeplinkTarget_HammerModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoCostBasisHubDeeplinkTarget_HammerModule {
    public static final int $stable = 0;
    public static final CryptoCostBasisHubDeeplinkTarget_HammerModule INSTANCE = new CryptoCostBasisHubDeeplinkTarget_HammerModule();

    private CryptoCostBasisHubDeeplinkTarget_HammerModule() {
    }

    public final DeeplinkTarget3<?> provide() {
        return CryptoCostBasisHubDeeplinkTarget.INSTANCE;
    }
}
