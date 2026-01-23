package com.robinhood.android.lib.conversations;

import com.twilio.util.ErrorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ChatException.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ChatException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "cause", "", "<init>", "(Lcom/twilio/util/ErrorInfo;Ljava/lang/Throwable;)V", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ChatException extends Exception {
    public /* synthetic */ ChatException(ErrorInfo errorInfo, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorInfo, (i & 2) != 0 ? null : th);
    }

    public ChatException(ErrorInfo errorInfo, Throwable th) {
        super(String.valueOf(errorInfo), th);
    }
}
