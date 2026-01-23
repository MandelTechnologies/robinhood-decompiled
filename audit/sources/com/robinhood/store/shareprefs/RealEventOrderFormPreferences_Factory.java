package com.robinhood.store.shareprefs;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.EnumPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealEventOrderFormPreferences_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB9\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\u0017\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\u00070\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/store/shareprefs/RealEventOrderFormPreferences_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/shareprefs/RealEventOrderFormPreferences;", "lastUsedEcOrderTypePref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/store/shareprefs/LastUsedEcOrderType;", "Lkotlin/jvm/JvmSuppressWildcards;", "lastUsedTimeInForcePref", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RealEventOrderFormPreferences_Factory implements Factory<RealEventOrderFormPreferences> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EnumPreference<UserLastUsedEcOrderTypePref2>> lastUsedEcOrderTypePref;
    private final Provider<EnumPreference<OrderFormTimeInForce>> lastUsedTimeInForcePref;

    @JvmStatic
    public static final RealEventOrderFormPreferences_Factory create(Provider<EnumPreference<UserLastUsedEcOrderTypePref2>> provider, Provider<EnumPreference<OrderFormTimeInForce>> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final RealEventOrderFormPreferences newInstance(EnumPreference<UserLastUsedEcOrderTypePref2> enumPreference, EnumPreference<OrderFormTimeInForce> enumPreference2) {
        return INSTANCE.newInstance(enumPreference, enumPreference2);
    }

    public RealEventOrderFormPreferences_Factory(Provider<EnumPreference<UserLastUsedEcOrderTypePref2>> lastUsedEcOrderTypePref, Provider<EnumPreference<OrderFormTimeInForce>> lastUsedTimeInForcePref) {
        Intrinsics.checkNotNullParameter(lastUsedEcOrderTypePref, "lastUsedEcOrderTypePref");
        Intrinsics.checkNotNullParameter(lastUsedTimeInForcePref, "lastUsedTimeInForcePref");
        this.lastUsedEcOrderTypePref = lastUsedEcOrderTypePref;
        this.lastUsedTimeInForcePref = lastUsedTimeInForcePref;
    }

    @Override // javax.inject.Provider
    public RealEventOrderFormPreferences get() {
        Companion companion = INSTANCE;
        EnumPreference<UserLastUsedEcOrderTypePref2> enumPreference = this.lastUsedEcOrderTypePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        EnumPreference<OrderFormTimeInForce> enumPreference2 = this.lastUsedTimeInForcePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference2, "get(...)");
        return companion.newInstance(enumPreference, enumPreference2);
    }

    /* compiled from: RealEventOrderFormPreferences_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\b\n0\u0007H\u0007J.\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\b\nH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/store/shareprefs/RealEventOrderFormPreferences_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/shareprefs/RealEventOrderFormPreferences_Factory;", "lastUsedEcOrderTypePref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/store/shareprefs/LastUsedEcOrderType;", "Lkotlin/jvm/JvmSuppressWildcards;", "lastUsedTimeInForcePref", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "newInstance", "Lcom/robinhood/store/shareprefs/RealEventOrderFormPreferences;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealEventOrderFormPreferences_Factory create(Provider<EnumPreference<UserLastUsedEcOrderTypePref2>> lastUsedEcOrderTypePref, Provider<EnumPreference<OrderFormTimeInForce>> lastUsedTimeInForcePref) {
            Intrinsics.checkNotNullParameter(lastUsedEcOrderTypePref, "lastUsedEcOrderTypePref");
            Intrinsics.checkNotNullParameter(lastUsedTimeInForcePref, "lastUsedTimeInForcePref");
            return new RealEventOrderFormPreferences_Factory(lastUsedEcOrderTypePref, lastUsedTimeInForcePref);
        }

        @JvmStatic
        public final RealEventOrderFormPreferences newInstance(EnumPreference<UserLastUsedEcOrderTypePref2> lastUsedEcOrderTypePref, EnumPreference<OrderFormTimeInForce> lastUsedTimeInForcePref) {
            Intrinsics.checkNotNullParameter(lastUsedEcOrderTypePref, "lastUsedEcOrderTypePref");
            Intrinsics.checkNotNullParameter(lastUsedTimeInForcePref, "lastUsedTimeInForcePref");
            return new RealEventOrderFormPreferences(lastUsedEcOrderTypePref, lastUsedTimeInForcePref);
        }
    }
}
