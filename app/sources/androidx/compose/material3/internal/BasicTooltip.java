package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;

/* compiled from: BasicTooltip.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Landroidx/compose/material3/internal/BasicTooltipDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/MutatorMutex;", "GlobalMutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "getGlobalMutatorMutex", "()Landroidx/compose/foundation/MutatorMutex;", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.compose.material3.internal.BasicTooltipDefaults, reason: use source file name */
/* loaded from: classes4.dex */
public final class BasicTooltip {
    public static final BasicTooltip INSTANCE = new BasicTooltip();
    private static final MutatorMutex GlobalMutatorMutex = new MutatorMutex();

    private BasicTooltip() {
    }

    public final MutatorMutex getGlobalMutatorMutex() {
        return GlobalMutatorMutex;
    }
}
