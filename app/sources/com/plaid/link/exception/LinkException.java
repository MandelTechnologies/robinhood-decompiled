package com.plaid.link.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/plaid/link/exception/LinkException;", "", "message", "", "(Ljava/lang/String;)V", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class LinkException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
