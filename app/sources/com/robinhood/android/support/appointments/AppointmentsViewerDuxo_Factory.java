package com.robinhood.android.support.appointments;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.pathfinder.utils.PhoneNumberFormatter;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.appointments.AppointmentsStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: AppointmentsViewerDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "appointmentsStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileStore", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "phoneNumberFormatter", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AppointmentsViewerDuxo_Factory implements Factory<AppointmentsViewerDuxo> {
    private final Provider<AppointmentsStore> appointmentsStore;
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<PhoneNumberFormatter> phoneNumberFormatter;
    private final Provider<ProfileInfoStore> profileStore;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AppointmentsViewerDuxo_Factory create(Provider<AppointmentsStore> provider, Provider<ProfileInfoStore> provider2, Provider<PhoneNumberFormatter> provider3, Provider<Clock> provider4, Provider<SavedStateHandle> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final AppointmentsViewerDuxo newInstance(AppointmentsStore appointmentsStore, ProfileInfoStore profileInfoStore, PhoneNumberFormatter phoneNumberFormatter, Clock clock, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(appointmentsStore, profileInfoStore, phoneNumberFormatter, clock, savedStateHandle, duxoBundle);
    }

    public AppointmentsViewerDuxo_Factory(Provider<AppointmentsStore> appointmentsStore, Provider<ProfileInfoStore> profileStore, Provider<PhoneNumberFormatter> phoneNumberFormatter, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(appointmentsStore, "appointmentsStore");
        Intrinsics.checkNotNullParameter(profileStore, "profileStore");
        Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.appointmentsStore = appointmentsStore;
        this.profileStore = profileStore;
        this.phoneNumberFormatter = phoneNumberFormatter;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AppointmentsViewerDuxo get() {
        Companion companion = INSTANCE;
        AppointmentsStore appointmentsStore = this.appointmentsStore.get();
        Intrinsics.checkNotNullExpressionValue(appointmentsStore, "get(...)");
        ProfileInfoStore profileInfoStore = this.profileStore.get();
        Intrinsics.checkNotNullExpressionValue(profileInfoStore, "get(...)");
        PhoneNumberFormatter phoneNumberFormatter = this.phoneNumberFormatter.get();
        Intrinsics.checkNotNullExpressionValue(phoneNumberFormatter, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(appointmentsStore, profileInfoStore, phoneNumberFormatter, clock, savedStateHandle, duxoBundle);
    }

    /* compiled from: AppointmentsViewerDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "appointmentsStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileStore", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "phoneNumberFormatter", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo_Factory;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AppointmentsViewerDuxo_Factory create(Provider<AppointmentsStore> appointmentsStore, Provider<ProfileInfoStore> profileStore, Provider<PhoneNumberFormatter> phoneNumberFormatter, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(appointmentsStore, "appointmentsStore");
            Intrinsics.checkNotNullParameter(profileStore, "profileStore");
            Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AppointmentsViewerDuxo_Factory(appointmentsStore, profileStore, phoneNumberFormatter, clock, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final AppointmentsViewerDuxo newInstance(AppointmentsStore appointmentsStore, ProfileInfoStore profileStore, PhoneNumberFormatter phoneNumberFormatter, Clock clock, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(appointmentsStore, "appointmentsStore");
            Intrinsics.checkNotNullParameter(profileStore, "profileStore");
            Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AppointmentsViewerDuxo(appointmentsStore, profileStore, phoneNumberFormatter, clock, savedStateHandle, duxoBundle);
        }
    }
}
