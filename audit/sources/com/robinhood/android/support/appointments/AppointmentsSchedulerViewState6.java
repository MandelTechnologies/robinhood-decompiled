package com.robinhood.android.support.appointments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppointmentsSchedulerViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/SubScreen;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DatetimePicker", "NotesWriter", "Review", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.appointments.SubScreen, reason: use source file name */
/* loaded from: classes9.dex */
public final class AppointmentsSchedulerViewState6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppointmentsSchedulerViewState6[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AppointmentsSchedulerViewState6 DatetimePicker = new AppointmentsSchedulerViewState6("DatetimePicker", 0, 0);
    public static final AppointmentsSchedulerViewState6 NotesWriter = new AppointmentsSchedulerViewState6("NotesWriter", 1, 1);
    public static final AppointmentsSchedulerViewState6 Review = new AppointmentsSchedulerViewState6("Review", 2, 2);
    private final int value;

    private static final /* synthetic */ AppointmentsSchedulerViewState6[] $values() {
        return new AppointmentsSchedulerViewState6[]{DatetimePicker, NotesWriter, Review};
    }

    public static EnumEntries<AppointmentsSchedulerViewState6> getEntries() {
        return $ENTRIES;
    }

    private AppointmentsSchedulerViewState6(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        AppointmentsSchedulerViewState6[] appointmentsSchedulerViewState6Arr$values = $values();
        $VALUES = appointmentsSchedulerViewState6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(appointmentsSchedulerViewState6Arr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: AppointmentsSchedulerViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/SubScreen$Companion;", "", "<init>", "()V", "fromInt", "Lcom/robinhood/android/support/appointments/SubScreen;", "value", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.support.appointments.SubScreen$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AppointmentsSchedulerViewState6 fromInt(int value) {
            for (AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6 : AppointmentsSchedulerViewState6.getEntries()) {
                if (appointmentsSchedulerViewState6.getValue() == value) {
                    return appointmentsSchedulerViewState6;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    public static AppointmentsSchedulerViewState6 valueOf(String str) {
        return (AppointmentsSchedulerViewState6) Enum.valueOf(AppointmentsSchedulerViewState6.class, str);
    }

    public static AppointmentsSchedulerViewState6[] values() {
        return (AppointmentsSchedulerViewState6[]) $VALUES.clone();
    }
}
