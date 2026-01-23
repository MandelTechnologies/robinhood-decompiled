package kotlinx.datetime;

import kotlin.Metadata;

/* compiled from: Clock.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"kotlinx/datetime/Clock$System", "", "<init>", "()V", "Lkotlinx/datetime/Instant;", "now", "()Lkotlinx/datetime/Instant;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.Clock$System, reason: use source file name */
/* loaded from: classes14.dex */
public final class Clock2 {
    public static final Clock2 INSTANCE = new Clock2();

    private Clock2() {
    }

    public Instant now() {
        return Instant.INSTANCE.now();
    }
}
