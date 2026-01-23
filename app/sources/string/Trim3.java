package string;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Trim.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lstring/TrimMode;", "", "()V", "BothEnds", "End", "Start", "Lstring/TrimMode$BothEnds;", "Lstring/TrimMode$End;", "Lstring/TrimMode$Start;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: string.TrimMode, reason: use source file name */
/* loaded from: classes28.dex */
abstract class Trim3 {
    public /* synthetic */ Trim3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: Trim.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lstring/TrimMode$Start;", "Lstring/TrimMode;", "()V", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: string.TrimMode$Start */
    public static final class Start extends Trim3 {
        public static final Start INSTANCE = new Start();

        private Start() {
            super(null);
        }
    }

    private Trim3() {
    }

    /* compiled from: Trim.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lstring/TrimMode$End;", "Lstring/TrimMode;", "()V", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: string.TrimMode$End */
    public static final class End extends Trim3 {
        public static final End INSTANCE = new End();

        private End() {
            super(null);
        }
    }

    /* compiled from: Trim.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lstring/TrimMode$BothEnds;", "Lstring/TrimMode;", "()V", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: string.TrimMode$BothEnds */
    public static final class BothEnds extends Trim3 {
        public static final BothEnds INSTANCE = new BothEnds();

        private BothEnds() {
            super(null);
        }
    }
}
