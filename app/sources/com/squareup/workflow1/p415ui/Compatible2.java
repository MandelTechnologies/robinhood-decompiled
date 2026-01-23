package com.squareup.workflow1.p415ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: Compatible.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, m3636d2 = {"compatible", "", "me", "", "you", "wf1-core-common"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.CompatibleKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Compatible2 {
    public static final boolean compatible(Object me2, Object you) {
        Intrinsics.checkNotNullParameter(me2, "me");
        Intrinsics.checkNotNullParameter(you, "you");
        if (!Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(me2.getClass()), Reflection.getOrCreateKotlinClass(you.getClass()))) {
            return false;
        }
        if (me2 instanceof Compatible) {
            return Intrinsics.areEqual(((Compatible) me2).getCompatibilityKey(), ((Compatible) you).getCompatibilityKey());
        }
        return true;
    }
}
