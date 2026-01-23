package com.robinhood.store.supportchat;

import com.robinhood.android.lib.conversations.ChatException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatExceptions.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"isChatException", "", "", "(Ljava/lang/Throwable;)Z", "lib-store-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.supportchat.ChatExceptionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ChatExceptions {
    public static final boolean isChatException(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return th instanceof ChatException;
    }
}
