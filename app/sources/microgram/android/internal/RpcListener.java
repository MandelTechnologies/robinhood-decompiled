package microgram.android.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import microgram.RpcMessage;
import microgram.android.MicrogramSource;

/* compiled from: RpcListener.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u000b\fJ&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\n¨\u0006\r"}, m3636d2 = {"Lmicrogram/android/internal/RpcListener;", "", "onRpcEvent", "", "source", "Lmicrogram/android/MicrogramSource;", "direction", "Lmicrogram/android/internal/RpcListener$Direction;", "message", "Lmicrogram/RpcMessage;", "(Lmicrogram/android/MicrogramSource;Lmicrogram/android/internal/RpcListener$Direction;Lmicrogram/RpcMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Direction", "Noop", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface RpcListener {
    Object onRpcEvent(MicrogramSource microgramSource, Direction direction, RpcMessage rpcMessage, Continuation<? super Unit> continuation);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RpcListener.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/android/internal/RpcListener$Direction;", "", "<init>", "(Ljava/lang/String;I)V", "SEND", "RECEIVE", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Direction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction SEND = new Direction("SEND", 0);
        public static final Direction RECEIVE = new Direction("RECEIVE", 1);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{SEND, RECEIVE};
        }

        public static EnumEntries<Direction> getEntries() {
            return $ENTRIES;
        }

        private Direction(String str, int i) {
        }

        static {
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* compiled from: RpcListener.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lmicrogram/android/internal/RpcListener$Noop;", "Lmicrogram/android/internal/RpcListener;", "<init>", "()V", "onRpcEvent", "", "source", "Lmicrogram/android/MicrogramSource;", "direction", "Lmicrogram/android/internal/RpcListener$Direction;", "message", "Lmicrogram/RpcMessage;", "(Lmicrogram/android/MicrogramSource;Lmicrogram/android/internal/RpcListener$Direction;Lmicrogram/RpcMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Noop implements RpcListener {
        public static final Noop INSTANCE = new Noop();

        private Noop() {
        }

        @Override // microgram.android.internal.RpcListener
        public Object onRpcEvent(MicrogramSource microgramSource, Direction direction, RpcMessage rpcMessage, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    }
}
