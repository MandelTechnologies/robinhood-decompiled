package com.robinhood.utils.extensions;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Uuids.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"toStringOrEmpty", "", "Ljava/util/UUID;", "UUID_0", "safeToString", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.UuidsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Uuids {
    private static final UUID UUID_0 = new UUID(0, 0);

    public static final String toStringOrEmpty(UUID uuid) {
        String string2 = uuid != null ? uuid.toString() : null;
        return string2 == null ? "" : string2;
    }

    public static final String safeToString(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        if (Intrinsics.areEqual(uuid, UUID_0)) {
            return "00000000-0000-0000-0000-000000000000";
        }
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
