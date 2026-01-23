package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeSource.kt */
@SinceKotlin
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "other", "Lkotlin/time/Duration;", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "minus", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@WasExperimental
/* renamed from: kotlin.time.ComparableTimeMark, reason: use source file name */
/* loaded from: classes14.dex */
public interface TimeSource2 extends TimeSource3, Comparable<TimeSource2> {
    /* renamed from: minus-UwyO8pc */
    long mo28723minusUwyO8pc(TimeSource2 other);

    /* compiled from: TimeSource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlin.time.ComparableTimeMark$DefaultImpls */
    public static final class DefaultImpls {
        public static int compareTo(TimeSource2 timeSource2, TimeSource2 other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Duration.m28727compareToLRDsOJo(timeSource2.mo28723minusUwyO8pc(other), Duration.INSTANCE.m28767getZEROUwyO8pc());
        }
    }
}
