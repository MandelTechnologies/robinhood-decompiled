package com.robinhood.android.support.appointments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppointmentsSchedulerComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerComposableTestTag;", "", "<init>", "(Ljava/lang/String;I)V", "ToolbarCloseButton", "ToolbarBackButton", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableTestTag, reason: use source file name */
/* loaded from: classes9.dex */
public final class AppointmentsSchedulerComposable2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppointmentsSchedulerComposable2[] $VALUES;
    public static final AppointmentsSchedulerComposable2 ToolbarCloseButton = new AppointmentsSchedulerComposable2("ToolbarCloseButton", 0);
    public static final AppointmentsSchedulerComposable2 ToolbarBackButton = new AppointmentsSchedulerComposable2("ToolbarBackButton", 1);

    private static final /* synthetic */ AppointmentsSchedulerComposable2[] $values() {
        return new AppointmentsSchedulerComposable2[]{ToolbarCloseButton, ToolbarBackButton};
    }

    public static EnumEntries<AppointmentsSchedulerComposable2> getEntries() {
        return $ENTRIES;
    }

    private AppointmentsSchedulerComposable2(String str, int i) {
    }

    static {
        AppointmentsSchedulerComposable2[] appointmentsSchedulerComposable2Arr$values = $values();
        $VALUES = appointmentsSchedulerComposable2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(appointmentsSchedulerComposable2Arr$values);
    }

    public static AppointmentsSchedulerComposable2 valueOf(String str) {
        return (AppointmentsSchedulerComposable2) Enum.valueOf(AppointmentsSchedulerComposable2.class, str);
    }

    public static AppointmentsSchedulerComposable2[] values() {
        return (AppointmentsSchedulerComposable2[]) $VALUES.clone();
    }
}
