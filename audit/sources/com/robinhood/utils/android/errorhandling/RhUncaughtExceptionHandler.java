package com.robinhood.utils.android.errorhandling;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteFullException;
import android.net.Uri;
import android.os.DeadSystemException;
import android.util.Log;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationCompat;
import com.robinhood.Logger;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.MiscMath;
import com.robinhood.utils.notification.NotificationUtils;
import java.io.File;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.HexExtensions;
import kotlin.text.HexFormat;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: RhUncaughtExceptionHandler.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0010\u0012\n\b\u0001\u0012\u00060\u000fj\u0002`\u0010\u0018\u00010\u000eX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0012¨\u0006\""}, m3636d2 = {"Lcom/robinhood/utils/android/errorhandling/RhUncaughtExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "context", "Landroid/content/Context;", "defaultExceptionHandler", "<init>", "(Landroid/content/Context;Ljava/lang/Thread$UncaughtExceptionHandler;)V", "resources", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "filesDir", "Ljava/io/File;", "cursorWindowAllocationExceptionClass", "Ljava/lang/Class;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "getCursorWindowAllocationExceptionClass$annotations", "()V", "uncaughtException", "", "thread", "Ljava/lang/Thread;", "ex", "", "dumpHeapAndSendNotificationForDebugging", "error", "Ljava/lang/OutOfMemoryError;", "sendHeapDumpNotification", "filePath", "", "newNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "Companion", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class RhUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final String CLASS_NAME_CANNOT_DELIVER_BROADCAST_EXCEPTION = "android.app.RemoteServiceException$CannotDeliverBroadcastException";
    private static final String NOTIFICATION_CHANNEL_ID = "oom-dump";
    private static final int NOTIFICATION_ID = 267483;
    private static final String OOM_HELP_LINK = "go/android-oom-dump";
    private static final int PENDING_INTENT_FLAGS = 201326592;
    private final Context context;
    private final Class<? extends RuntimeException> cursorWindowAllocationExceptionClass;
    private final Thread.UncaughtExceptionHandler defaultExceptionHandler;
    private final File filesDir;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex REGEX_UNRESOLVED_ATTRIBUTE_MESSAGE = new Regex("^Failed to resolve attribute at index (\\d+): TypedValue\\{t=0x([0-9A-Fa-f]+)/d=0x([0-9A-Fa-f]+)(?: (\".*\"))?(?: a=(-?\\d+))?(?: r=0x([0-9A-Fa-f]+))?\\}$");
    private static final AtomicBoolean hasDumpedHeap = new AtomicBoolean(false);
    private static final String TAG = RhUncaughtExceptionHandler.class.getSimpleName();

    private final void dumpHeapAndSendNotificationForDebugging(OutOfMemoryError error) {
    }

    private static /* synthetic */ void getCursorWindowAllocationExceptionClass$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RhUncaughtExceptionHandler(Context context, Thread.UncaughtExceptionHandler defaultExceptionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultExceptionHandler, "defaultExceptionHandler");
        this.context = context;
        this.defaultExceptionHandler = defaultExceptionHandler;
        Class cls = null;
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(externalFilesDir, "getFilesDir(...)");
        }
        this.filesDir = externalFilesDir;
        try {
            cls = Class.forName("android.database.CursorWindowAllocationException", true, CursorWindow.class.getClassLoader());
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
        }
        this.cursorWindowAllocationExceptionClass = cls;
    }

    private final Resources getResources() {
        Resources resources = this.context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable ex) {
        MatchResult matchResultMatchEntire;
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(ex, "ex");
        for (Throwable th : Throwables.causes(ex)) {
            if (th instanceof OutOfMemoryError) {
                dumpHeapAndSendNotificationForDebugging((OutOfMemoryError) th);
                th.initCause(new OutOfMemoryError());
                this.defaultExceptionHandler.uncaughtException(thread, th);
                return;
            }
            Class<? extends RuntimeException> cls = this.cursorWindowAllocationExceptionClass;
            if (cls != null && cls.isInstance(th)) {
                RhUncaughtExceptionHandler2 rhUncaughtExceptionHandler2 = new RhUncaughtExceptionHandler2(th.getMessage());
                dumpHeapAndSendNotificationForDebugging(rhUncaughtExceptionHandler2);
                this.defaultExceptionHandler.uncaughtException(thread, rhUncaughtExceptionHandler2);
                return;
            }
            if (th instanceof SQLiteFullException) {
                this.defaultExceptionHandler.uncaughtException(thread, new SQLiteFullException());
                return;
            }
            if (th instanceof DeadSystemException) {
                this.defaultExceptionHandler.uncaughtException(thread, new DeadSystemException());
                return;
            }
            if (th instanceof UnsupportedOperationException) {
                try {
                    String message = th.getMessage();
                    if (message != null && (matchResultMatchEntire = REGEX_UNRESOLVED_ATTRIBUTE_MESSAGE.matchEntire(message)) != null) {
                        MatchResult.Destructured destructured = matchResultMatchEntire.getDestructured();
                        String str = destructured.getMatch().getGroupValues().get(1);
                        String str2 = destructured.getMatch().getGroupValues().get(2);
                        String str3 = destructured.getMatch().getGroupValues().get(3);
                        String str4 = destructured.getMatch().getGroupValues().get(4);
                        String str5 = destructured.getMatch().getGroupValues().get(5);
                        String str6 = destructured.getMatch().getGroupValues().get(6);
                        Integer intUnsignedOrNull = MiscMath.toIntUnsignedOrNull(str3, 16);
                        String resourceNameOrNull = intUnsignedOrNull != null ? com.robinhood.android.common.util.extensions.Resources.getResourceNameOrNull(getResources(), intUnsignedOrNull.intValue()) : null;
                        Integer intUnsignedOrNull2 = MiscMath.toIntUnsignedOrNull(str6, 16);
                        String resourceNameOrNull2 = intUnsignedOrNull2 != null ? com.robinhood.android.common.util.extensions.Resources.getResourceNameOrNull(getResources(), intUnsignedOrNull2.intValue()) : null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to resolve theme attribute");
                        sb.append(": index = ");
                        sb.append(str);
                        sb.append(", type = 0x");
                        sb.append(str2);
                        sb.append(", data = 0x");
                        sb.append(str3);
                        sb.append(" (name = ");
                        sb.append(resourceNameOrNull);
                        sb.append(")");
                        sb.append(", string = ");
                        sb.append(StringsKt.nullIfEmpty(str4));
                        sb.append(", assetCookie = ");
                        sb.append(StringsKt.nullIfEmpty(str5));
                        sb.append(", resId = ");
                        if (intUnsignedOrNull2 == null) {
                            sb.append("null");
                        } else {
                            sb.append("0x");
                            sb.append(HexExtensions.toHexString$default(intUnsignedOrNull2.intValue(), (HexFormat) null, 1, (Object) null));
                            sb.append(" (name = ");
                            sb.append(resourceNameOrNull2);
                            sb.append(")");
                        }
                        String string2 = sb.toString();
                        Logger.INSTANCE.mo1681e(string2, new Object[0]);
                        this.defaultExceptionHandler.uncaughtException(thread, new RhUncaughtExceptionHandler3(string2, ex));
                        return;
                    }
                } catch (Throwable th2) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th2, false, null, 6, null);
                }
            }
            if (Intrinsics.areEqual(th.getClass().getName(), CLASS_NAME_CANNOT_DELIVER_BROADCAST_EXCEPTION)) {
                return;
            }
        }
        this.defaultExceptionHandler.uncaughtException(thread, ex);
    }

    private final void sendHeapDumpNotification(String filePath) {
        String str = "The app crashed with an out-of-memory error. Please report this! Directions can be found at go/android-oom-dump.\n\nThe heap was dumped to " + filePath + ".";
        Log.e(TAG, str);
        Notification notificationBuild = newNotificationBuilder().setWhen(System.currentTimeMillis()).setAutoCancel(true).setSmallIcon(C20690R.drawable.ic_action_rh_logo).setContentIntent(PendingIntent.getActivity(this.context, 0, new Intent("android.intent.action.VIEW", Uri.parse("http://go/android-oom-dump")), PENDING_INTENT_FLAGS)).setContentTitle("Please report OOM!").setContentText("See go/android-oom-dump").setStyle(new NotificationCompat.BigTextStyle().bigText(str)).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        NotificationUtils.notifyIfPossible(ContextSystemServices.getNotificationManager(this.context), NOTIFICATION_ID, notificationBuild);
    }

    private final NotificationCompat.Builder newNotificationBuilder() {
        ContextSystemServices.getNotificationManager(this.context).createNotificationChannel(new NotificationChannelCompat.Builder(NOTIFICATION_CHANNEL_ID, 4).setName("OOM Alerts").build());
        return new NotificationCompat.Builder(this.context, NOTIFICATION_CHANNEL_ID);
    }

    /* compiled from: RhUncaughtExceptionHandler.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/utils/android/errorhandling/RhUncaughtExceptionHandler$Companion;", "", "<init>", "()V", "REGEX_UNRESOLVED_ATTRIBUTE_MESSAGE", "Lkotlin/text/Regex;", "getREGEX_UNRESOLVED_ATTRIBUTE_MESSAGE$annotations", "getREGEX_UNRESOLVED_ATTRIBUTE_MESSAGE", "()Lkotlin/text/Regex;", "CLASS_NAME_CANNOT_DELIVER_BROADCAST_EXCEPTION", "", "hasDumpedHeap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "TAG", "kotlin.jvm.PlatformType", "NOTIFICATION_CHANNEL_ID", "OOM_HELP_LINK", "PENDING_INTENT_FLAGS", "", "NOTIFICATION_ID", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getREGEX_UNRESOLVED_ATTRIBUTE_MESSAGE$annotations() {
        }

        private Companion() {
        }

        public final Regex getREGEX_UNRESOLVED_ATTRIBUTE_MESSAGE() {
            return RhUncaughtExceptionHandler.REGEX_UNRESOLVED_ATTRIBUTE_MESSAGE;
        }
    }
}
