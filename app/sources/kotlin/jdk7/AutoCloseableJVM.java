package kotlin.jdk7;

import androidx.lifecycle.viewmodel.internal.ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;

/* compiled from: AutoCloseableJVM.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0004*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006*\u001a\b\u0007\u0010\n\"\u00020\u00002\u00020\u0000B\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t¨\u0006\u000b"}, m3636d2 = {"Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "cause", "", "closeFinally", "(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V", "Lkotlin/SinceKotlin;", "version", "2.0", "AutoCloseable", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
/* renamed from: kotlin.jdk7.AutoCloseableKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class AutoCloseableJVM {
    @SinceKotlin
    @PublishedApi
    public static final void closeFinally(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0.m529m(autoCloseable);
                return;
            }
            try {
                ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0.m529m(autoCloseable);
            } catch (Throwable th2) {
                ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }
}
