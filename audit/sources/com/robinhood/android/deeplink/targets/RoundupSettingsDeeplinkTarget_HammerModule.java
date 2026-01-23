package com.robinhood.android.deeplink.targets;

import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;

/* compiled from: RoundupSettingsDeeplinkTarget_HammerModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/RoundupSettingsDeeplinkTarget_HammerModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RoundupSettingsDeeplinkTarget_HammerModule {
    public static final int $stable = 0;
    public static final RoundupSettingsDeeplinkTarget_HammerModule INSTANCE = new RoundupSettingsDeeplinkTarget_HammerModule();

    private RoundupSettingsDeeplinkTarget_HammerModule() {
    }

    public final DeeplinkTarget4 provide() {
        return RewardTargets7.INSTANCE;
    }
}
