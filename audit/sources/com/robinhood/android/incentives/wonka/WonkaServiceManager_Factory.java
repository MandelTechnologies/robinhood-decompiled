package com.robinhood.android.incentives.wonka;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringToLongMapPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: WonkaServiceManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/incentives/wonka/WonkaServiceManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Landroid/content/Context;", "context", "Lcom/robinhood/prefs/StringToLongMapPreference;", "assetRetentionPromotionSeenPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "sweepsInterestStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepEnrollmentStore", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "Ljavax/inject/Provider;", "Companion", "lib-wonka_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class WonkaServiceManager_Factory implements Factory<WonkaServiceManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<StringToLongMapPreference> assetRetentionPromotionSeenPref;
    private final Provider<Clock> clock;
    private final Provider<Context> context;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<Navigator> navigator;
    private final Provider<SweepEnrollmentStore> sweepEnrollmentStore;
    private final Provider<SweepsInterestStore> sweepsInterestStore;

    @JvmStatic
    public static final WonkaServiceManager_Factory create(Provider<MicrogramManager> provider, Provider<Navigator> provider2, Provider<Context> provider3, Provider<StringToLongMapPreference> provider4, Provider<Clock> provider5, Provider<SweepsInterestStore> provider6, Provider<SweepEnrollmentStore> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final WonkaServiceManager newInstance(MicrogramManager microgramManager, Navigator navigator, Context context, StringToLongMapPreference stringToLongMapPreference, Clock clock, SweepsInterestStore sweepsInterestStore, SweepEnrollmentStore sweepEnrollmentStore) {
        return INSTANCE.newInstance(microgramManager, navigator, context, stringToLongMapPreference, clock, sweepsInterestStore, sweepEnrollmentStore);
    }

    public WonkaServiceManager_Factory(Provider<MicrogramManager> microgramManager, Provider<Navigator> navigator, Provider<Context> context, Provider<StringToLongMapPreference> assetRetentionPromotionSeenPref, Provider<Clock> clock, Provider<SweepsInterestStore> sweepsInterestStore, Provider<SweepEnrollmentStore> sweepEnrollmentStore) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetRetentionPromotionSeenPref, "assetRetentionPromotionSeenPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        this.microgramManager = microgramManager;
        this.navigator = navigator;
        this.context = context;
        this.assetRetentionPromotionSeenPref = assetRetentionPromotionSeenPref;
        this.clock = clock;
        this.sweepsInterestStore = sweepsInterestStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
    }

    @Override // javax.inject.Provider
    public WonkaServiceManager get() {
        Companion companion = INSTANCE;
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        StringToLongMapPreference stringToLongMapPreference = this.assetRetentionPromotionSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        SweepsInterestStore sweepsInterestStore = this.sweepsInterestStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsInterestStore, "get(...)");
        SweepEnrollmentStore sweepEnrollmentStore = this.sweepEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepEnrollmentStore, "get(...)");
        return companion.newInstance(microgramManager, navigator, context, stringToLongMapPreference, clock, sweepsInterestStore, sweepEnrollmentStore);
    }

    /* compiled from: WonkaServiceManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/incentives/wonka/WonkaServiceManager_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Landroid/content/Context;", "context", "Lcom/robinhood/prefs/StringToLongMapPreference;", "assetRetentionPromotionSeenPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "sweepsInterestStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepEnrollmentStore", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/incentives/wonka/WonkaServiceManager_Factory;", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "newInstance", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lcom/robinhood/prefs/StringToLongMapPreference;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;)Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "lib-wonka_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WonkaServiceManager_Factory create(Provider<MicrogramManager> microgramManager, Provider<Navigator> navigator, Provider<Context> context, Provider<StringToLongMapPreference> assetRetentionPromotionSeenPref, Provider<Clock> clock, Provider<SweepsInterestStore> sweepsInterestStore, Provider<SweepEnrollmentStore> sweepEnrollmentStore) {
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(assetRetentionPromotionSeenPref, "assetRetentionPromotionSeenPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            return new WonkaServiceManager_Factory(microgramManager, navigator, context, assetRetentionPromotionSeenPref, clock, sweepsInterestStore, sweepEnrollmentStore);
        }

        @JvmStatic
        public final WonkaServiceManager newInstance(MicrogramManager microgramManager, Navigator navigator, Context context, StringToLongMapPreference assetRetentionPromotionSeenPref, Clock clock, SweepsInterestStore sweepsInterestStore, SweepEnrollmentStore sweepEnrollmentStore) {
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(assetRetentionPromotionSeenPref, "assetRetentionPromotionSeenPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            return new WonkaServiceManager(microgramManager, navigator, context, assetRetentionPromotionSeenPref, clock, sweepsInterestStore, sweepEnrollmentStore);
        }
    }
}
