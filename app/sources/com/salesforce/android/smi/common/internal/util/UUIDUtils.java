package com.salesforce.android.smi.common.internal.util;

import java.util.UUID;
import kotlin.Metadata;

/* compiled from: UUIDUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/common/internal/util/UUIDUtils;", "", "<init>", "()V", "fromStringOrNull", "Ljava/util/UUID;", "uuidStr", "", "common_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class UUIDUtils {
    public static final UUIDUtils INSTANCE = new UUIDUtils();

    private UUIDUtils() {
    }

    public final UUID fromStringOrNull(String uuidStr) {
        if (uuidStr == null) {
            return null;
        }
        try {
            return UUID.fromString(uuidStr);
        } catch (Exception unused) {
            return null;
        }
    }
}
