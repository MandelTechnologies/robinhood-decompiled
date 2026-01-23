package com.robinhood.store.shareprefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EcPrefModule.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/store/shareprefs/EcPrefModule;", "", "bindEventOrderFormPreferences", "Lcom/robinhood/store/shareprefs/EventOrderFormPreferences;", "impl", "Lcom/robinhood/store/shareprefs/RealEventOrderFormPreferences;", "bindGameDetailPagePreferences", "Lcom/robinhood/store/shareprefs/GameDetailPagePreferences;", "Lcom/robinhood/store/shareprefs/RealGameDetailPagePreferences;", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface EcPrefModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    EventOrderFormPreferences bindEventOrderFormPreferences(RealEventOrderFormPreferences impl);

    GameDetailPagePreferences bindGameDetailPagePreferences(RealGameDetailPagePreferences impl);

    /* compiled from: EcPrefModule.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/store/shareprefs/EcPrefModule$Companion;", "", "<init>", "()V", "provideUserLastUsedEcOrderTypePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/store/shareprefs/LastUsedEcOrderType;", "prefs", "Landroid/content/SharedPreferences;", "provideEventOrderFormLastUsedTimeInForcePref", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "provideEventAmericanOddsPref", "Lcom/robinhood/prefs/BooleanPreference;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @UserLastUsedEcOrderTypePref
        public final EnumPreference<UserLastUsedEcOrderTypePref2> provideUserLastUsedEcOrderTypePref(@UserPrefs SharedPreferences prefs) {
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            return new EnumPreference<>(UserLastUsedEcOrderTypePref2.class, prefs, "UserLastUsedEcOrderTypePref", UserLastUsedEcOrderTypePref2.UNKNOWN, null, 16, null);
        }

        @LastUsedTimeInForcePrefs
        public final EnumPreference<OrderFormTimeInForce> provideEventOrderFormLastUsedTimeInForcePref(@UserPrefs SharedPreferences prefs) {
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            return new EnumPreference<>(OrderFormTimeInForce.class, prefs, "EventOrderFormLastUsedTimeInForcePref", OrderFormTimeInForce.UNSPECIFIED, null, 16, null);
        }

        @AmericanOddsPreference
        public final BooleanPreference provideEventAmericanOddsPref(@UserPrefs SharedPreferences prefs) {
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            return new BooleanPreference(prefs, "EventAmericanOddsPref", false, null, 8, null);
        }
    }
}
