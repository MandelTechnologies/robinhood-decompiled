package com.robinhood.store.shareprefs;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealGameDetailPagePreferences_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/store/shareprefs/RealGameDetailPagePreferences_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/shareprefs/RealGameDetailPagePreferences;", "americanOddsPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RealGameDetailPagePreferences_Factory implements Factory<RealGameDetailPagePreferences> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BooleanPreference> americanOddsPref;

    @JvmStatic
    public static final RealGameDetailPagePreferences_Factory create(Provider<BooleanPreference> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final RealGameDetailPagePreferences newInstance(BooleanPreference booleanPreference) {
        return INSTANCE.newInstance(booleanPreference);
    }

    public RealGameDetailPagePreferences_Factory(Provider<BooleanPreference> americanOddsPref) {
        Intrinsics.checkNotNullParameter(americanOddsPref, "americanOddsPref");
        this.americanOddsPref = americanOddsPref;
    }

    @Override // javax.inject.Provider
    public RealGameDetailPagePreferences get() {
        Companion companion = INSTANCE;
        BooleanPreference booleanPreference = this.americanOddsPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        return companion.newInstance(booleanPreference);
    }

    /* compiled from: RealGameDetailPagePreferences_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/store/shareprefs/RealGameDetailPagePreferences_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/shareprefs/RealGameDetailPagePreferences_Factory;", "americanOddsPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "newInstance", "Lcom/robinhood/store/shareprefs/RealGameDetailPagePreferences;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealGameDetailPagePreferences_Factory create(Provider<BooleanPreference> americanOddsPref) {
            Intrinsics.checkNotNullParameter(americanOddsPref, "americanOddsPref");
            return new RealGameDetailPagePreferences_Factory(americanOddsPref);
        }

        @JvmStatic
        public final RealGameDetailPagePreferences newInstance(BooleanPreference americanOddsPref) {
            Intrinsics.checkNotNullParameter(americanOddsPref, "americanOddsPref");
            return new RealGameDetailPagePreferences(americanOddsPref);
        }
    }
}
