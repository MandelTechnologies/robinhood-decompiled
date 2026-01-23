package com.truelayer.payments.core.utils;

import com.truelayer.payments.core.TrueLayerCore;
import com.truelayer.payments.core.domain.configuration.HttpConnectionConfiguration2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebugUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0086\bø\u0001\u0000\u001a\u001a\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0005"}, m3636d2 = {"debugOnly", "", "block", "Lkotlin/Function0;", "httpLoggingEnabledOnly", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.core.utils.DebugUtilsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class DebugUtils3 {
    public static final void debugOnly(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
    }

    public static final void httpLoggingEnabledOnly(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
            block.invoke();
        }
    }
}
