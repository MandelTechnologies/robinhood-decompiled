package com.plaid.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.plaid.internal.core.crashreporting.internal.models.Breadcrumb;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashContext;
import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import com.plaid.internal.core.crashreporting.internal.models.DebugImage;
import com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface;
import com.plaid.internal.core.crashreporting.internal.models.ExceptionInterface;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* renamed from: com.plaid.internal.a0 */
/* loaded from: classes16.dex */
public final class C6029a0 {

    /* renamed from: a */
    public final Context f1887a;

    /* renamed from: b */
    public final CrashApiOptions f1888b;

    /* renamed from: c */
    public final InterfaceC6001X f1889c;

    /* renamed from: d */
    public final InterfaceC5847G0 f1890d;

    /* renamed from: e */
    public final C7234v6<Breadcrumb> f1891e;

    /* renamed from: f */
    public UUID f1892f;

    /* renamed from: g */
    public final Lazy f1893g;

    public C6029a0(Context application, CrashApiOptions crashApiOptions, InterfaceC6001X crashEnvironmentProvider) {
        C5860H4 deviceInfo = C5860H4.f1365a;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(crashApiOptions, "crashApiOptions");
        Intrinsics.checkNotNullParameter(crashEnvironmentProvider, "crashEnvironmentProvider");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.f1887a = application;
        this.f1888b = crashApiOptions;
        this.f1889c = crashEnvironmentProvider;
        this.f1890d = deviceInfo;
        this.f1891e = new C7234v6<>();
        this.f1893g = LazyKt.lazy(new C6019Z(this));
    }

    /* renamed from: a */
    public final Crash m1364a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f1892f = uuidRandomUUID;
        Intrinsics.checkNotNull(uuidRandomUUID);
        String string2 = uuidRandomUUID.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String strReplace$default = StringsKt.replace$default(string2, "-", "", false, 4, (Object) null);
        String str = ((SimpleDateFormat) this.f1893g.getValue()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String message = throwable.getMessage();
        CrashLogLevel crashLogLevel = CrashLogLevel.ERROR;
        String release = this.f1888b.getRelease();
        String strMo1349a = this.f1889c.mo1349a();
        ExceptionInterface exceptionInterface = new ExceptionInterface(throwable);
        DebugMetaInterface debugMetaInterface = new DebugMetaInterface();
        debugMetaInterface.getDebugImages().add(new DebugImage(new String[]{"06bc072f-037e-5671-9ae9-1e7593a75683"}[0], null, 2, null));
        return m1363a(new Crash(strReplace$default, message, str, crashLogLevel, null, null, null, null, null, null, null, release, null, strMo1349a, null, null, null, exceptionInterface, debugMetaInterface, 120816, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Crash m1363a(Crash crash) {
        String str;
        String strValueOf;
        String strValueOf2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        crash.getBreadcrumbs$crash_reporting_release().clear();
        crash.getBreadcrumbs$crash_reporting_release().addAll(this.f1891e.m1625a());
        crash.getContexts$crash_reporting_release().clear();
        Map<String, CrashContext> contexts$crash_reporting_release = crash.getContexts$crash_reporting_release();
        UUID uuid = this.f1892f;
        Context application = this.f1887a;
        Intrinsics.checkNotNullParameter(application, "application");
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                strValueOf = String.valueOf(packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                e = e;
                strValueOf = null;
            }
            try {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                strValueOf2 = String.valueOf(applicationInfo != null ? applicationInfo.loadLabel(application.getPackageManager()) : null);
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                e.printStackTrace();
                strValueOf2 = null;
                if (str != null) {
                }
                if (strValueOf != null) {
                }
                if (strValueOf2 != null) {
                }
                if (linkedHashMap3.isEmpty()) {
                }
                contexts$crash_reporting_release.put("app", new CrashContext(0, uuid, null, null, linkedHashMap3 == null ? MapsKt.toMutableMap(linkedHashMap3) : null, 13, null));
                Map<String, CrashContext> contexts$crash_reporting_release2 = crash.getContexts$crash_reporting_release();
                UUID uuid2 = this.f1892f;
                InterfaceC5847G0 build = this.f1890d;
                Intrinsics.checkNotNullParameter(build, "build");
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", build.getId());
                linkedHashMap.put("manufacturer", build.mo1200a());
                linkedHashMap.put("model", build.mo1201b());
                linkedHashMap.put("name", build.mo1206g());
                linkedHashMap.put("type", build.mo1203d());
                linkedHashMap.put("version", build.mo1204e());
                if (linkedHashMap.isEmpty()) {
                }
                contexts$crash_reporting_release2.put("device", new CrashContext(0, uuid2, null, null, linkedHashMap == null ? MapsKt.toMutableMap(linkedHashMap) : null, 13, null));
                Map<String, CrashContext> contexts$crash_reporting_release3 = crash.getContexts$crash_reporting_release();
                UUID uuid3 = this.f1892f;
                InterfaceC5847G0 build2 = this.f1890d;
                Intrinsics.checkNotNullParameter(build2, "build");
                linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("name", build2.mo1202c());
                linkedHashMap2.put("version", C6048c.m1378a(build2));
                if (linkedHashMap2.isEmpty()) {
                }
                contexts$crash_reporting_release3.put("os", new CrashContext(0, uuid3, null, null, linkedHashMap2 != null ? MapsKt.toMutableMap(linkedHashMap2) : null, 13, null));
                return crash;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            str = null;
            strValueOf = null;
        }
        if (str != null) {
            linkedHashMap3.put("version", str);
        }
        if (strValueOf != null) {
            linkedHashMap3.put("build", strValueOf);
        }
        if (strValueOf2 != null) {
            linkedHashMap3.put("name", strValueOf2);
        }
        if (linkedHashMap3.isEmpty()) {
            linkedHashMap3 = null;
        }
        contexts$crash_reporting_release.put("app", new CrashContext(0, uuid, null, null, linkedHashMap3 == null ? MapsKt.toMutableMap(linkedHashMap3) : null, 13, null));
        Map<String, CrashContext> contexts$crash_reporting_release22 = crash.getContexts$crash_reporting_release();
        UUID uuid22 = this.f1892f;
        InterfaceC5847G0 build3 = this.f1890d;
        Intrinsics.checkNotNullParameter(build3, "build");
        linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", build3.getId());
        linkedHashMap.put("manufacturer", build3.mo1200a());
        linkedHashMap.put("model", build3.mo1201b());
        linkedHashMap.put("name", build3.mo1206g());
        linkedHashMap.put("type", build3.mo1203d());
        linkedHashMap.put("version", build3.mo1204e());
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        contexts$crash_reporting_release22.put("device", new CrashContext(0, uuid22, null, null, linkedHashMap == null ? MapsKt.toMutableMap(linkedHashMap) : null, 13, null));
        Map<String, CrashContext> contexts$crash_reporting_release32 = crash.getContexts$crash_reporting_release();
        UUID uuid32 = this.f1892f;
        InterfaceC5847G0 build22 = this.f1890d;
        Intrinsics.checkNotNullParameter(build22, "build");
        linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("name", build22.mo1202c());
        linkedHashMap2.put("version", C6048c.m1378a(build22));
        if (linkedHashMap2.isEmpty()) {
            linkedHashMap2 = null;
        }
        contexts$crash_reporting_release32.put("os", new CrashContext(0, uuid32, null, null, linkedHashMap2 != null ? MapsKt.toMutableMap(linkedHashMap2) : null, 13, null));
        return crash;
    }
}
