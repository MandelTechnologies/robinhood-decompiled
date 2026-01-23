package com.robinhood.android.common.p088ui;

import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.reflect.Classes2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ViewBinding.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/IllegalLifecycleStateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "callingClass", "Ljava/lang/Class;", "event", "Lcom/robinhood/disposer/LifecycleEvent;", "description", "", "<init>", "(Ljava/lang/Class;Lcom/robinhood/disposer/LifecycleEvent;Ljava/lang/String;)V", "getCallingClass", "()Ljava/lang/Class;", "getEvent", "()Lcom/robinhood/disposer/LifecycleEvent;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.ui.IllegalLifecycleStateException, reason: use source file name */
/* loaded from: classes2.dex */
public final class ViewBinding4 extends IllegalStateException {
    public static final int $stable = 8;
    private final Class<?> callingClass;
    private final LifecycleEvent event;

    public final Class<?> getCallingClass() {
        return this.callingClass;
    }

    public final LifecycleEvent getEvent() {
        return this.event;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewBinding4(Class<?> callingClass, LifecycleEvent lifecycleEvent, String description) {
        StackTraceElement stackTraceElement;
        StackTraceElement stackTraceElement2;
        super(callingClass.getName() + ": " + description + " [event = " + lifecycleEvent + "]");
        Intrinsics.checkNotNullParameter(callingClass, "callingClass");
        Intrinsics.checkNotNullParameter(description, "description");
        this.callingClass = callingClass;
        this.event = lifecycleEvent;
        StackTraceElement[] stackTrace = getStackTrace();
        String strGuessFilename = Classes2.guessFilename(callingClass);
        Intrinsics.checkNotNull(stackTrace);
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTrace[i];
            if (Intrinsics.areEqual(stackTraceElement.getFileName(), strGuessFilename)) {
                break;
            } else {
                i++;
            }
        }
        int lineNumber = stackTraceElement != null ? stackTraceElement.getLineNumber() : 1;
        int length2 = stackTrace.length + 1;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            if (i2 == 0) {
                stackTraceElement2 = new StackTraceElement(this.callingClass.getName(), "$blamedCaller", strGuessFilename, lineNumber);
            } else {
                stackTraceElement2 = stackTrace[i2 - 1];
            }
            stackTraceElementArr[i2] = stackTraceElement2;
        }
        setStackTrace(stackTraceElementArr);
    }
}
