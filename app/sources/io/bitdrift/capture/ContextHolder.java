package io.bitdrift.capture;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.startup.Initializer;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContextHolder.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\b0\u0007H\u0016¨\u0006\n"}, m3636d2 = {"Lio/bitdrift/capture/ContextHolder;", "Landroidx/startup/Initializer;", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "Companion", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ContextHolder implements Initializer<ContextHolder> {

    @SuppressLint({"StaticFieldLeak"})
    public static volatile Context APP_CONTEXT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public ContextHolder create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Companion companion = INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.setAPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt(applicationContext);
        return this;
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }

    /* compiled from: ContextHolder.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lio/bitdrift/capture/ContextHolder$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "APP_CONTEXT", "Landroid/content/Context;", "getAPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt", "()Landroid/content/Context;", "setAPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt", "(Landroid/content/Context;)V", "getAPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt$annotations", "", "isInitialized", "()Z", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Context getAPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt() {
            Context context = ContextHolder.APP_CONTEXT;
            if (context != null) {
                return context;
            }
            Intrinsics.throwUninitializedPropertyAccessException("APP_CONTEXT");
            return null;
        }

        public final void setAPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt(Context context) {
            Intrinsics.checkNotNullParameter(context, "<set-?>");
            ContextHolder.APP_CONTEXT = context;
        }

        public final boolean isInitialized() {
            return ContextHolder.APP_CONTEXT != null;
        }
    }
}
