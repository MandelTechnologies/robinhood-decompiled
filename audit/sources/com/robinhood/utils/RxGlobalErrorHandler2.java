package com.robinhood.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxGlobalErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/utils/SwallowedThrowable;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.SwallowedThrowable, reason: use source file name */
/* loaded from: classes12.dex */
final class RxGlobalErrorHandler2 extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxGlobalErrorHandler2(Throwable cause) {
        super("Swallowed uncaught error", cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
