package com.truelayer.payments.core.logger;

import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: Logger.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0001H\u0002¨\u0006\u0005"}, m3636d2 = {"getMethodStackTrace", "Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "intoLogTag", "", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.logger.LoggerKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class Logger5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement getMethodStackTrace() {
        Object fail;
        Object stackTraceElement;
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNull(stackTrace);
            int i = -1;
            int length = stackTrace.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    String className = stackTrace[length].getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                    if (StringsKt.contains$default((CharSequence) className, (CharSequence) "core.logger.Log", false, 2, (Object) null)) {
                        i = length;
                        break;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
            }
            fail = new Ok(stackTrace[i + 1]);
        } catch (Throwable th) {
            fail = new Fail(th);
        }
        if (fail instanceof Ok) {
            stackTraceElement = ((Ok) fail).getValue();
        } else {
            if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            stackTraceElement = new StackTraceElement("UnknownClass", "UnknownMethod", "UnknownFile", 0);
        }
        return (StackTraceElement) stackTraceElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String intoLogTag(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) className, '.', 0, false, 6, (Object) null);
        String className2 = stackTraceElement.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
        String strReplace = new Regex("(\\$+)").replace(new Regex("lambda-\\d+").replace(new Regex("(\\$\\d+)").replace(StringsKt.removeRange(className2, 0, iLastIndexOf$default + 1).toString(), ""), ""), "::");
        String className3 = stackTraceElement.getClassName();
        Intrinsics.checkNotNullExpressionValue(className3, "getClassName(...)");
        if (!StringsKt.endsWith$default(className3, "Kt", false, 2, (Object) null)) {
            return strReplace;
        }
        return strReplace + "::" + stackTraceElement.getMethodName();
    }
}
