package com.robinhood.android.support.appointments;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.pathfinder.utils.PhoneNumberFormatter;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.appointments.AppointmentsStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: AppointmentsSchedulerDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0085\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerStateProvider;", "stateProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "appointmentsStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileStore", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "phoneNumberFormatter", "Landroid/content/res/Resources;", "resources", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AppointmentsSchedulerDuxo_Factory implements Factory<AppointmentsSchedulerDuxo> {
    private final Provider<AppointmentsStore> appointmentsStore;
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<PhoneNumberFormatter> phoneNumberFormatter;
    private final Provider<ProfileInfoStore> profileStore;
    private final Provider<Resources> resources;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<AppointmentsSchedulerStateProvider> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AppointmentsSchedulerDuxo_Factory create(Provider<AppointmentsSchedulerStateProvider> provider, Provider<Clock> provider2, Provider<AppointmentsStore> provider3, Provider<UserStore> provider4, Provider<ProfileInfoStore> provider5, Provider<PhoneNumberFormatter> provider6, Provider<Resources> provider7, Provider<SavedStateHandle> provider8, Provider<DuxoBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final AppointmentsSchedulerDuxo newInstance(AppointmentsSchedulerStateProvider appointmentsSchedulerStateProvider, Clock clock, AppointmentsStore appointmentsStore, UserStore userStore, ProfileInfoStore profileInfoStore, PhoneNumberFormatter phoneNumberFormatter, Resources resources, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(appointmentsSchedulerStateProvider, clock, appointmentsStore, userStore, profileInfoStore, phoneNumberFormatter, resources, savedStateHandle, duxoBundle);
    }

    public AppointmentsSchedulerDuxo_Factory(Provider<AppointmentsSchedulerStateProvider> stateProvider, Provider<Clock> clock, Provider<AppointmentsStore> appointmentsStore, Provider<UserStore> userStore, Provider<ProfileInfoStore> profileStore, Provider<PhoneNumberFormatter> phoneNumberFormatter, Provider<Resources> resources, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(appointmentsStore, "appointmentsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(profileStore, "profileStore");
        Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stateProvider = stateProvider;
        this.clock = clock;
        this.appointmentsStore = appointmentsStore;
        this.userStore = userStore;
        this.profileStore = profileStore;
        this.phoneNumberFormatter = phoneNumberFormatter;
        this.resources = resources;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AppointmentsSchedulerDuxo get() {
        Companion companion = INSTANCE;
        AppointmentsSchedulerStateProvider appointmentsSchedulerStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(appointmentsSchedulerStateProvider, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        AppointmentsStore appointmentsStore = this.appointmentsStore.get();
        Intrinsics.checkNotNullExpressionValue(appointmentsStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        ProfileInfoStore profileInfoStore = this.profileStore.get();
        Intrinsics.checkNotNullExpressionValue(profileInfoStore, "get(...)");
        PhoneNumberFormatter phoneNumberFormatter = this.phoneNumberFormatter.get();
        Intrinsics.checkNotNullExpressionValue(phoneNumberFormatter, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(appointmentsSchedulerStateProvider, clock, appointmentsStore, userStore, profileInfoStore, phoneNumberFormatter, resources, savedStateHandle, duxoBundle);
    }

    /* compiled from: AppointmentsSchedulerDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008d\u0001\u0010\u0018\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JW\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerStateProvider;", "stateProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "appointmentsStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileStore", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "phoneNumberFormatter", "Landroid/content/res/Resources;", "resources", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo_Factory;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;", "newInstance", "(Lcom/robinhood/android/support/appointments/AppointmentsSchedulerStateProvider;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;Landroid/content/res/Resources;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AppointmentsSchedulerDuxo_Factory create(Provider<AppointmentsSchedulerStateProvider> stateProvider, Provider<Clock> clock, Provider<AppointmentsStore> appointmentsStore, Provider<UserStore> userStore, Provider<ProfileInfoStore> profileStore, Provider<PhoneNumberFormatter> phoneNumberFormatter, Provider<Resources> resources, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(appointmentsStore, "appointmentsStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(profileStore, "profileStore");
            Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AppointmentsSchedulerDuxo_Factory(stateProvider, clock, appointmentsStore, userStore, profileStore, phoneNumberFormatter, resources, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final AppointmentsSchedulerDuxo newInstance(AppointmentsSchedulerStateProvider stateProvider, Clock clock, AppointmentsStore appointmentsStore, UserStore userStore, ProfileInfoStore profileStore, PhoneNumberFormatter phoneNumberFormatter, Resources resources, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(appointmentsStore, "appointmentsStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(profileStore, "profileStore");
            Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AppointmentsSchedulerDuxo(stateProvider, clock, appointmentsStore, userStore, profileStore, phoneNumberFormatter, resources, savedStateHandle, duxoBundle);
        }
    }
}
