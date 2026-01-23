package com.robinhood.android.retirement.lib.promo;

import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;

/* compiled from: RetirementPromoDeeplinkTarget_HammerModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/lib/promo/RetirementPromoDeeplinkTarget_HammerModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "lib-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementPromoDeeplinkTarget_HammerModule {
    public static final int $stable = 0;
    public static final RetirementPromoDeeplinkTarget_HammerModule INSTANCE = new RetirementPromoDeeplinkTarget_HammerModule();

    private RetirementPromoDeeplinkTarget_HammerModule() {
    }

    public final DeeplinkTarget4 provide() {
        return RetirementPromoDeeplinkTarget.INSTANCE;
    }
}
