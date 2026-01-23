package io.reactivex.internal.util;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes21.dex */
public final class ExceptionHelper {
    public static final Throwable TERMINATED = new Termination();

    public static RuntimeException wrapOrThrow(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        return new RuntimeException(th);
    }

    public static <T> boolean addThrowable(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == TERMINATED) {
                return false;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(atomicReference, th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    public static <T> Throwable terminate(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = TERMINATED;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static String timeoutMessage(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + PlaceholderUtils.XXShortPlaceholderText + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    static final class Termination extends Throwable {
        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }

        Termination() {
            super("No further exceptions");
        }
    }
}
