package com.stripe.android.stripe3ds2.init;

import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SecurityCheck.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "", "warning", "Lcom/stripe/android/stripe3ds2/init/Warning;", "(Lcom/stripe/android/stripe3ds2/init/Warning;)V", "getWarning", "()Lcom/stripe/android/stripe3ds2/init/Warning;", "check", "", "DebuggerAttached", "Emulator", "RootedCheck", "Tampered", "UnsupportedOS", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public abstract class SecurityCheck {
    private final Warning warning;

    public /* synthetic */ SecurityCheck(Warning warning, DefaultConstructorMarker defaultConstructorMarker) {
        this(warning);
    }

    /* renamed from: check */
    public abstract boolean getIsDebuggerConnected();

    private SecurityCheck(Warning warning) {
        this.warning = warning;
    }

    public final Warning getWarning() {
        return this.warning;
    }

    /* compiled from: SecurityCheck.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "()V", "check", "", "findSuBinary", "findSuperuserApk", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class RootedCheck extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        private static final List<String> BINARY_PATHS = CollectionsKt.listOf((Object[]) new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"});
        private static final Warning WARNING = new Warning("SW01", "The device is jailbroken.", Warning.Severity.HIGH);

        public RootedCheck() {
            super(WARNING, null);
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        /* renamed from: check */
        public boolean getIsDebuggerConnected() {
            return findSuBinary() || findSuperuserApk();
        }

        private final boolean findSuBinary() {
            List<String> list = BINARY_PATHS;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (new File(((String) it.next()) + "su").exists()) {
                    return true;
                }
            }
            return false;
        }

        private final boolean findSuperuserApk() {
            return new File(Environment.getRootDirectory().toString() + "/Superuser").isDirectory();
        }

        /* compiled from: SecurityCheck.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck$Companion;", "", "()V", "BINARY_PATHS", "", "", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SecurityCheck.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "()V", "check", "", "hasValidFields", "hasValidMethods", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Tampered extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        private static final Warning WARNING = new Warning("SW02", "The integrity of the SDK has been tampered.", Warning.Severity.HIGH);

        public Tampered() {
            super(WARNING, null);
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        /* renamed from: check */
        public boolean getIsDebuggerConnected() {
            return (hasValidFields() && hasValidMethods()) ? false : true;
        }

        private final boolean hasValidFields() {
            Field[] declaredFields = StripeThreeDs2ServiceImpl.class.getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (!field.isSynthetic()) {
                    arrayList.add(field);
                }
            }
            return arrayList.size() == 8;
        }

        private final boolean hasValidMethods() throws SecurityException {
            Method[] declaredMethods = StripeThreeDs2ServiceImpl.class.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                if (!method.isSynthetic()) {
                    arrayList.add(method);
                }
            }
            return arrayList.size() == 5;
        }

        /* compiled from: SecurityCheck.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered$Companion;", "", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SecurityCheck.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "()V", "isEmulator", "", "()Z", "check", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Emulator extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        private static final Warning WARNING = new Warning("SW02", "An emulator is being used to run the App.", Warning.Severity.HIGH);

        public Emulator() {
            super(WARNING, null);
        }

        private final boolean isEmulator() {
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (StringsKt.startsWith$default(FINGERPRINT, "generic", false, 2, (Object) null)) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (StringsKt.startsWith$default(FINGERPRINT, "unknown", false, 2, (Object) null)) {
                return true;
            }
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Emulator", false, 2, (Object) null)) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "google_sdk", false, 2, (Object) null)) {
                return true;
            }
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            if (StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null)) {
                return true;
            }
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            if (StringsKt.startsWith$default(BRAND, "generic", false, 2, (Object) null)) {
                String DEVICE = Build.DEVICE;
                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                if (StringsKt.startsWith$default(DEVICE, "generic", false, 2, (Object) null)) {
                    return true;
                }
            }
            return Intrinsics.areEqual("google_sdk", Build.PRODUCT);
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        /* renamed from: check */
        public boolean getIsDebuggerConnected() {
            return isEmulator();
        }

        /* compiled from: SecurityCheck.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator$Companion;", "", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SecurityCheck.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\u0003\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "", "isDebuggerConnected", "<init>", "(Z)V", "check", "()Z", "Z", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DebuggerAttached extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        private static final Warning WARNING = new Warning("SW04", "A debugger is attached to the App.", Warning.Severity.MEDIUM);
        private final boolean isDebuggerConnected;

        public /* synthetic */ DebuggerAttached(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Debug.isDebuggerConnected() : z);
        }

        public DebuggerAttached(boolean z) {
            super(WARNING, null);
            this.isDebuggerConnected = z;
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        /* renamed from: check, reason: from getter */
        public boolean getIsDebuggerConnected() {
            return this.isDebuggerConnected;
        }

        /* compiled from: SecurityCheck.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached$Companion;", "", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SecurityCheck.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "()V", "check", "", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class UnsupportedOS extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        private static final Warning WARNING = new Warning("SW05", "The OS or the OS version is not supported.", Warning.Severity.HIGH);

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        /* renamed from: check */
        public boolean getIsDebuggerConnected() {
            return false;
        }

        public UnsupportedOS() {
            super(WARNING, null);
        }

        /* compiled from: SecurityCheck.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS$Companion;", "", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
