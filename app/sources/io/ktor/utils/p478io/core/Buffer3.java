package io.ktor.utils.p478io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Buffer.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lio/ktor/utils/io/core/InsufficientSpaceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", "name", "", "size", "availableSpace", "(Ljava/lang/String;II)V", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.core.InsufficientSpaceException, reason: use source file name */
/* loaded from: classes14.dex */
public final class Buffer3 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Buffer3(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Buffer3(String name, int i, int i2) {
        this("Not enough free space to write " + name + " of " + i + " bytes, available " + i2 + " bytes.");
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
