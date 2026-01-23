package com.robinhood.librobinhood.data.store;

import android.content.SharedPreferences;
import com.robinhood.librobinhood.data.store.prefs.LastTimePromptedForSlipUpsell;
import com.robinhood.librobinhood.data.store.prefs.SlipUpsellPromptCount;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipUpsellModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLibSlipModule;", "", "<init>", "()V", "provideLastTimePromptedForSlipUpsell", "Lcom/robinhood/prefs/LongPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideSlipUpsellPromptCount", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.FeatureLibSlipModule, reason: use source file name */
/* loaded from: classes13.dex */
public final class SlipUpsellModule {
    public static final SlipUpsellModule INSTANCE = new SlipUpsellModule();

    private SlipUpsellModule() {
    }

    @LastTimePromptedForSlipUpsell
    public final LongPreference provideLastTimePromptedForSlipUpsell(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "lastTimePromptedForSlipUpsell2", 0L, 4, null);
    }

    @SlipUpsellPromptCount
    public final LongPreference provideSlipUpsellPromptCount(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "slipUpsellPromptCount", 0L, 4, null);
    }
}
