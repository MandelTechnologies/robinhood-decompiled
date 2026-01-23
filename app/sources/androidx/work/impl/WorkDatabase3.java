package androidx.work.impl;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* compiled from: WorkDatabase.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"", "PRUNE_THRESHOLD_MILLIS", "J", "work-runtime_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.work.impl.WorkDatabaseKt, reason: use source file name */
/* loaded from: classes.dex */
public final class WorkDatabase3 {

    @JvmField
    public static final long PRUNE_THRESHOLD_MILLIS = TimeUnit.DAYS.toMillis(1);
}
