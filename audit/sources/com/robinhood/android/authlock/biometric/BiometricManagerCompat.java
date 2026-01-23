package com.robinhood.android.authlock.biometric;

import android.content.Context;
import android.os.Build;
import androidx.biometric.BiometricManager;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BiometricManagerCompat.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/authlock/biometric/BiometricManagerCompat;", "", "canAuthenticate", "Lcom/robinhood/android/authlock/biometric/BiometricManagerCompat$Status;", "Status", "Companion", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface BiometricManagerCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Status canAuthenticate();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BiometricManagerCompat.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/authlock/biometric/BiometricManagerCompat$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR_HARDWARE_UNAVAILABLE", "ERROR_NONE_ENROLLED", "ERROR_NO_HARDWARE", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status ERROR_HARDWARE_UNAVAILABLE = new Status("ERROR_HARDWARE_UNAVAILABLE", 1);
        public static final Status ERROR_NONE_ENROLLED = new Status("ERROR_NONE_ENROLLED", 2);
        public static final Status ERROR_NO_HARDWARE = new Status("ERROR_NO_HARDWARE", 3);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, ERROR_HARDWARE_UNAVAILABLE, ERROR_NONE_ENROLLED, ERROR_NO_HARDWARE};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i) {
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* compiled from: BiometricManagerCompat.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/authlock/biometric/BiometricManagerCompat$Companion;", "", "<init>", "()V", "BLOCKLIST_MODELS", "", "", "from", "Lcom/robinhood/android/authlock/biometric/BiometricManagerCompat;", "context", "Landroid/content/Context;", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Set<String> BLOCKLIST_MODELS = SetsKt.setOf((Object[]) new String[]{"SM-A102U", "SM-A102U1", "SM-A102W", "SM-S102DL", "SM-A102N", "SM-A105M"});

        private Companion() {
        }

        public final BiometricManagerCompat from(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (BLOCKLIST_MODELS.contains(Build.MODEL)) {
                return BiometricManagerCompat3.INSTANCE;
            }
            BiometricManager biometricManagerFrom = BiometricManager.from(context);
            Intrinsics.checkNotNullExpressionValue(biometricManagerFrom, "from(...)");
            return new BiometricManagerCompat2(biometricManagerFrom);
        }
    }
}
