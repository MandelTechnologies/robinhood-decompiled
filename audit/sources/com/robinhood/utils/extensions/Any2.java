package com.robinhood.utils.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Any.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\u001b\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0002*\u0004\u0018\u00010\u0002H\u0086\b¨\u0006\u0007"}, m3636d2 = {"toOutput", "", "", "checkNotNull", "", "assertIsInstance", "T", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.AnyKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Any2 {
    public static final String toOutput(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static final void checkNotNull(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Object cannot be null");
        }
    }

    public static final /* synthetic */ <T> void assertIsInstance(Object obj) {
        Intrinsics.reifiedOperationMarker(3, "T");
        if (obj != null) {
            return;
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        throw new IllegalArgumentException((obj + " must implement " + Object.class.getName()).toString());
    }
}
