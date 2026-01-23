package com.robinhood.utils.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Enums.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u0002H\u0001\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u0001H\u0086\b¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"next", "T", "", "(Ljava/lang/Enum;)Ljava/lang/Enum;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.EnumsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Enums {
    public static final /* synthetic */ <T extends Enum<T>> T next(T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.reifiedOperationMarker(5, "T");
        return (T) new Enum[0][(t.ordinal() + 1) % 0];
    }
}
