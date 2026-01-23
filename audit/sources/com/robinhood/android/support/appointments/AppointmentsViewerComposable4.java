package com.robinhood.android.support.appointments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppointmentsViewerComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerComposableTestTag;", "", "<init>", "(Ljava/lang/String;I)V", "ToolbarCloseButton", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerComposableTestTag, reason: use source file name */
/* loaded from: classes9.dex */
public final class AppointmentsViewerComposable4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppointmentsViewerComposable4[] $VALUES;
    public static final AppointmentsViewerComposable4 ToolbarCloseButton = new AppointmentsViewerComposable4("ToolbarCloseButton", 0);

    private static final /* synthetic */ AppointmentsViewerComposable4[] $values() {
        return new AppointmentsViewerComposable4[]{ToolbarCloseButton};
    }

    public static EnumEntries<AppointmentsViewerComposable4> getEntries() {
        return $ENTRIES;
    }

    private AppointmentsViewerComposable4(String str, int i) {
    }

    static {
        AppointmentsViewerComposable4[] appointmentsViewerComposable4Arr$values = $values();
        $VALUES = appointmentsViewerComposable4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(appointmentsViewerComposable4Arr$values);
    }

    public static AppointmentsViewerComposable4 valueOf(String str) {
        return (AppointmentsViewerComposable4) Enum.valueOf(AppointmentsViewerComposable4.class, str);
    }

    public static AppointmentsViewerComposable4[] values() {
        return (AppointmentsViewerComposable4[]) $VALUES.clone();
    }
}
