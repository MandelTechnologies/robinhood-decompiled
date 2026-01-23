package com.robinhood.android.support.appointments;

import com.robinhood.android.navigation.Navigation;
import com.robinhood.android.navigation.NavigationResolver;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Hammer_AppointmentsConfirmationFragment_Companion_NavigationResolverModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/Hammer_AppointmentsConfirmationFragment_Companion_NavigationResolverModule;", "", "<init>", "()V", "getter", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "provide_AppointmentsConfirmationFragmentKey_Cancelled", "provide_AppointmentsConfirmationFragmentKey_Rescheduled", "provide_AppointmentsConfirmationFragmentKey_Scheduled", "provide_AppointmentsConfirmationFragmentKey_ScheduledRedirectToView", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.appointments.Hammer_AppointmentsConfirmationFragment_Companion_NavigationResolverModule */
/* loaded from: classes9.dex */
public final class C28870x1df123e6 {
    public static final int $stable = 0;
    public static final C28870x1df123e6 INSTANCE = new C28870x1df123e6();
    private static final Function0<NavigationResolver> getter = NavigationResolver.INSTANCE.lazyGetter("com.robinhood.android.support.appointments.AppointmentsConfirmationFragment", "Companion");

    private C28870x1df123e6() {
    }

    @Navigation
    public final Function0<NavigationResolver> provide_AppointmentsConfirmationFragmentKey_Cancelled() {
        return getter;
    }

    @Navigation
    public final Function0<NavigationResolver> provide_AppointmentsConfirmationFragmentKey_Rescheduled() {
        return getter;
    }

    @Navigation
    public final Function0<NavigationResolver> provide_AppointmentsConfirmationFragmentKey_Scheduled() {
        return getter;
    }

    @Navigation
    /* renamed from: provide_AppointmentsConfirmationFragmentKey_ScheduledRedirectToView */
    public final Function0<NavigationResolver> m2478x855349d2() {
        return getter;
    }
}
