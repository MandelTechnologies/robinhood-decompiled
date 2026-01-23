package com.withpersona.sdk2.inquiry.device;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.singular.sdk.internal.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: RootedDeviceUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0018\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0003\u001a!\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0005\u001a\u000f\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0005\u001a\u000f\u0010\u0012\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0005\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a\"\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Landroid/content/Context;", "", "isDeviceRooted", "(Landroid/content/Context;)Z", "hasTestKeys", "()Z", "detectRootManagementApps", "detectPotentiallyDangerousApps", "", "", "packages", "isAnyPackageFromListInstalled", "(Landroid/content/Context;Ljava/util/List;)Z", "binName", "doesBinaryExists", "(Ljava/lang/String;)Z", "hasSuspiciousProps", "hasSuspiciousWritablePaths", "doesSuRuntimeExist", "readMount", "()Ljava/util/List;", "readProps", "command", "execCommand", "(Ljava/lang/String;)Ljava/util/List;", "knownRootAppsPackages", "Ljava/util/List;", "knownDangerousAppsPackages", "knownRootCloakingPackages", "binDirectories", "pathsThatShouldNotBeWritable", "isDeviceRootedCachedValue", "Ljava/lang/Boolean;", "device_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.device.RootedDeviceUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class RootedDeviceUtils {
    private static Boolean isDeviceRootedCachedValue;
    private static final List<String> knownRootAppsPackages = CollectionsKt.listOf((Object[]) new String[]{"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"});
    private static final List<String> knownDangerousAppsPackages = CollectionsKt.listOf((Object[]) new String[]{"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"});
    private static final List<String> knownRootCloakingPackages = CollectionsKt.listOf((Object[]) new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"});
    private static final List<String> binDirectories = CollectionsKt.listOf((Object[]) new String[]{"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"});
    private static final List<String> pathsThatShouldNotBeWritable = CollectionsKt.listOf((Object[]) new String[]{"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"});

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isDeviceRooted(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Boolean bool = isDeviceRootedCachedValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            if (detectRootManagementApps(context) || detectPotentiallyDangerousApps(context) || doesBinaryExists("su") || doesBinaryExists("magisk") || hasSuspiciousProps() || hasSuspiciousWritablePaths() || (hasTestKeys() && !EmulatorDeviceUtils.isDeviceEmulator())) {
                z = true;
            } else if (doesSuRuntimeExist()) {
            }
        } catch (Exception unused) {
        }
        isDeviceRootedCachedValue = Boolean.valueOf(z);
        return z;
    }

    private static final boolean hasTestKeys() {
        String str = Build.TAGS;
        String str2 = Build.FINGERPRINT;
        String str3 = Build.PRODUCT;
        String str4 = Build.HARDWARE;
        String str5 = Build.DISPLAY;
        if (str != null) {
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "test-keys", false, 2, (Object) null)) {
                return true;
            }
            Intrinsics.checkNotNull(str2);
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "genric.*test-keys", false, 2, (Object) null)) {
                return true;
            }
            Intrinsics.checkNotNull(str3);
            if (StringsKt.contains$default((CharSequence) str3, (CharSequence) "generic", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str3, (CharSequence) Constants.RequestParamsKeys.SDK_VERSION_KEY, false, 2, (Object) null)) {
                return true;
            }
            Intrinsics.checkNotNull(str4);
            if (StringsKt.contains$default((CharSequence) str4, (CharSequence) "goldfish", false, 2, (Object) null)) {
                return true;
            }
            Intrinsics.checkNotNull(str5);
            if (StringsKt.contains$default((CharSequence) str5, (CharSequence) ".*test-keys", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean detectRootManagementApps(Context context) {
        return isAnyPackageFromListInstalled(context, knownRootAppsPackages);
    }

    private static final boolean detectPotentiallyDangerousApps(Context context) {
        return isAnyPackageFromListInstalled(context, knownDangerousAppsPackages);
    }

    private static final boolean isAnyPackageFromListInstalled(Context context, List<String> list) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        for (String str : list) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                    return true;
                }
                packageManager.getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    private static final boolean doesBinaryExists(String str) {
        Iterator<String> it = binDirectories.iterator();
        while (it.hasNext()) {
            if (new File(it.next(), str).exists()) {
                return true;
            }
        }
        return false;
    }

    private static final boolean hasSuspiciousProps() {
        boolean z = false;
        boolean z2 = true;
        for (String str : readProps()) {
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "[ro.debuggable]", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str, (CharSequence) "[1]", false, 2, (Object) null)) {
                z = true;
            } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "[ro.secure]", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str, (CharSequence) "[0]", false, 2, (Object) null)) {
                z2 = false;
            }
        }
        return z && !z2;
    }

    private static final boolean hasSuspiciousWritablePaths() {
        String str;
        String str2;
        Iterator<String> it = readMount().iterator();
        while (it.hasNext()) {
            List listSplit$default = StringsKt.split$default((CharSequence) it.next(), new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 6) {
                str = (String) listSplit$default.get(2);
                str2 = (String) listSplit$default.get(5);
            } else if (listSplit$default.size() == 4) {
                str = (String) listSplit$default.get(1);
                str2 = (String) listSplit$default.get(3);
            } else {
                continue;
            }
            Iterator<String> it2 = pathsThatShouldNotBeWritable.iterator();
            while (it2.hasNext()) {
                if (StringsKt.equals(str, it2.next(), true)) {
                    int length = str2.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        char cCharAt = str2.charAt(!z ? i : length);
                        boolean z2 = CharsKt.isWhitespace(cCharAt) || cCharAt == '(' || cCharAt == ')';
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    Iterator it3 = StringsKt.split$default((CharSequence) str2.subSequence(i, length + 1).toString(), new String[]{","}, false, 0, 6, (Object) null).iterator();
                    while (it3.hasNext()) {
                        if (StringsKt.equals((String) it3.next(), "rw", true)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static final boolean doesSuRuntimeExist() {
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec((String[]) StringsKt.split$default((CharSequence) "which su", new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null).toArray(new String[0]));
            boolean z = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
            processExec.destroy();
            return z;
        } catch (Exception unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        } catch (Throwable th) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th;
        }
    }

    private static final List<String> readMount() {
        return execCommand("mount");
    }

    private static final List<String> readProps() {
        return execCommand("getprop");
    }

    private static final List<String> execCommand(String str) {
        InputStream inputStream;
        String next;
        try {
            inputStream = Runtime.getRuntime().exec(str).getInputStream();
        } catch (IOException unused) {
            inputStream = null;
        }
        try {
            next = new Scanner(inputStream).useDelimiter("\\A").next();
        } catch (NoSuchElementException unused2) {
            next = "";
        }
        String str2 = next;
        Intrinsics.checkNotNull(str2);
        List listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{"\n"}, false, 0, 6, (Object) null);
        if (!listSplit$default.isEmpty()) {
            ListIterator listIterator = listSplit$default.listIterator(listSplit$default.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    return CollectionsKt.take(listSplit$default, listIterator.nextIndex() + 1);
                }
            }
        }
        return CollectionsKt.emptyList();
    }
}
