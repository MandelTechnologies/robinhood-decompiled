package io.sentry.android.timber;

import com.singular.sdk.internal.Constants;
import io.sentry.Breadcrumb;
import io.sentry.IHub;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.protocol.Message;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: SentryTimberTree.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J,\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J/\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016J9\u0010\u0014\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001bJ/\u0010\u001c\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001c\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016J9\u0010\u001c\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J/\u0010 \u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u0012\u0010 \u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016J9\u0010 \u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001bJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002J7\u0010%\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010&J,\u0010%\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0014J\u001a\u0010%\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016JA\u0010%\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010'JA\u0010(\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0002\u0010'J\n\u0010)\u001a\u0004\u0018\u00010\nH\u0002J/\u0010*\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u0012\u0010*\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016J9\u0010*\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001bJ/\u0010+\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u0012\u0010+\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016J9\u0010+\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001bJ/\u0010,\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u0012\u0010,\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016J9\u0010,\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lio/sentry/android/timber/SentryTimberTree;", "Ltimber/log/Timber$Tree;", "hub", "Lio/sentry/IHub;", "minEventLevel", "Lio/sentry/SentryLevel;", "minBreadcrumbLevel", "(Lio/sentry/IHub;Lio/sentry/SentryLevel;Lio/sentry/SentryLevel;)V", "pendingTag", "Ljava/lang/ThreadLocal;", "", "addBreadcrumb", "", "sentryLevel", "msg", "Lio/sentry/protocol/Message;", "throwable", "", "captureEvent", "tag", "d", "message", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "t", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "getSentryLevel", "priority", "", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "isLoggable", "", "level", "minLevel", "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "logWithSentry", "retrieveTag", "v", "w", "wtf", "sentry-android-timber_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class SentryTimberTree extends Timber.Tree {
    private final IHub hub;
    private final SentryLevel minBreadcrumbLevel;
    private final SentryLevel minEventLevel;
    private final ThreadLocal<String> pendingTag;

    public SentryTimberTree(IHub hub, SentryLevel minEventLevel, SentryLevel minBreadcrumbLevel) {
        Intrinsics.checkNotNullParameter(hub, "hub");
        Intrinsics.checkNotNullParameter(minEventLevel, "minEventLevel");
        Intrinsics.checkNotNullParameter(minBreadcrumbLevel, "minBreadcrumbLevel");
        this.hub = hub;
        this.minEventLevel = minEventLevel;
        this.minBreadcrumbLevel = minBreadcrumbLevel;
        this.pendingTag = new ThreadLocal<>();
    }

    private final String retrieveTag() {
        String str = this.pendingTag.get();
        if (str != null) {
            this.pendingTag.remove();
        }
        return str;
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: v */
    public void mo3359v(String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.mo3359v(message, Arrays.copyOf(args, args.length));
        logWithSentry(2, null, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: v */
    public void mo3361v(Throwable t, String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.mo3361v(t, message, Arrays.copyOf(args, args.length));
        logWithSentry(2, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: v */
    public void mo3360v(Throwable t) {
        super.mo3360v(t);
        logWithSentry(2, t, null, new Object[0]);
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: d */
    public void mo3350d(String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.mo3350d(message, Arrays.copyOf(args, args.length));
        logWithSentry(3, null, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: d */
    public void mo3352d(Throwable t, String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.mo3352d(t, message, Arrays.copyOf(args, args.length));
        logWithSentry(3, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: d */
    public void mo3351d(Throwable t) {
        super.mo3351d(t);
        logWithSentry(3, t, null, new Object[0]);
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: i */
    public void mo3356i(String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.mo3350d(message, Arrays.copyOf(args, args.length));
        logWithSentry(4, null, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: i */
    public void mo3358i(Throwable t, String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.mo3358i(t, message, Arrays.copyOf(args, args.length));
        logWithSentry(4, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: i */
    public void mo3357i(Throwable t) {
        super.mo3357i(t);
        logWithSentry(4, t, null, new Object[0]);
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: w */
    public void mo3362w(String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.mo3362w(message, Arrays.copyOf(args, args.length));
        logWithSentry(5, null, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: w */
    public void mo3364w(Throwable t, String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.mo3364w(t, message, Arrays.copyOf(args, args.length));
        logWithSentry(5, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: w */
    public void mo3363w(Throwable t) {
        super.mo3363w(t);
        logWithSentry(5, t, null, new Object[0]);
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: e */
    public void mo3353e(String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.mo3353e(message, Arrays.copyOf(args, args.length));
        logWithSentry(6, null, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: e */
    public void mo3355e(Throwable t, String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.mo3355e(t, message, Arrays.copyOf(args, args.length));
        logWithSentry(6, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    /* renamed from: e */
    public void mo3354e(Throwable t) {
        super.mo3354e(t);
        logWithSentry(6, t, null, new Object[0]);
    }

    @Override // timber.log.Timber.Tree
    public void wtf(String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.wtf(message, Arrays.copyOf(args, args.length));
        logWithSentry(7, null, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    public void wtf(Throwable t, String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.wtf(t, message, Arrays.copyOf(args, args.length));
        logWithSentry(7, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    public void wtf(Throwable t) {
        super.wtf(t);
        logWithSentry(7, t, null, new Object[0]);
    }

    @Override // timber.log.Timber.Tree
    public void log(int priority, String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.log(priority, message, Arrays.copyOf(args, args.length));
        logWithSentry(priority, null, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    public void log(int priority, Throwable t, String message, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.log(priority, t, message, Arrays.copyOf(args, args.length));
        logWithSentry(priority, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // timber.log.Timber.Tree
    public void log(int priority, Throwable t) {
        super.log(priority, t);
        logWithSentry(priority, t, null, new Object[0]);
    }

    @Override // timber.log.Timber.Tree
    protected void log(int priority, String tag, String message, Throwable t) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.pendingTag.set(tag);
    }

    private final void logWithSentry(int priority, Throwable throwable, String message, Object... args) {
        String strRetrieveTag = retrieveTag();
        if ((message == null || message.length() == 0) && throwable == null) {
            return;
        }
        SentryLevel sentryLevel = getSentryLevel(priority);
        Message message2 = new Message();
        message2.setMessage(message);
        if (message != null && message.length() != 0) {
            if (!(args.length == 0)) {
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
                message2.setFormatted(str);
            }
        }
        ArrayList arrayList = new ArrayList(args.length);
        for (Object obj : args) {
            arrayList.add(String.valueOf(obj));
        }
        message2.setParams(arrayList);
        captureEvent(sentryLevel, strRetrieveTag, message2, throwable);
        addBreadcrumb(sentryLevel, message2, throwable);
    }

    private final boolean isLoggable(SentryLevel level, SentryLevel minLevel) {
        return level.ordinal() >= minLevel.ordinal();
    }

    private final void captureEvent(SentryLevel sentryLevel, String tag, Message msg, Throwable throwable) {
        if (isLoggable(sentryLevel, this.minEventLevel)) {
            SentryEvent sentryEvent = new SentryEvent();
            sentryEvent.setLevel(sentryLevel);
            if (throwable != null) {
                sentryEvent.setThrowable(throwable);
            }
            if (tag != null) {
                sentryEvent.setTag("TimberTag", tag);
            }
            sentryEvent.setMessage(msg);
            sentryEvent.setLogger("Timber");
            this.hub.captureEvent(sentryEvent);
        }
    }

    private final void addBreadcrumb(SentryLevel sentryLevel, Message msg, Throwable throwable) {
        if (isLoggable(sentryLevel, this.minBreadcrumbLevel)) {
            Breadcrumb breadcrumbError = null;
            String message = throwable != null ? throwable.getMessage() : null;
            if (msg.getMessage() != null) {
                breadcrumbError = new Breadcrumb();
                breadcrumbError.setLevel(sentryLevel);
                breadcrumbError.setCategory("Timber");
                String formatted = msg.getFormatted();
                if (formatted == null) {
                    formatted = msg.getMessage();
                }
                breadcrumbError.setMessage(formatted);
            } else if (message != null) {
                breadcrumbError = Breadcrumb.error(message);
                breadcrumbError.setCategory("exception");
            }
            if (breadcrumbError != null) {
                this.hub.addBreadcrumb(breadcrumbError);
            }
        }
    }

    private final SentryLevel getSentryLevel(int priority) {
        switch (priority) {
            case 2:
                return SentryLevel.DEBUG;
            case 3:
                return SentryLevel.DEBUG;
            case 4:
                return SentryLevel.INFO;
            case 5:
                return SentryLevel.WARNING;
            case 6:
                return SentryLevel.ERROR;
            case 7:
                return SentryLevel.FATAL;
            default:
                return SentryLevel.DEBUG;
        }
    }
}
