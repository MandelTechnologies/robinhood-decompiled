package com.mayakapps.rwmutex;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: ReadWriteMutex.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m3636d2 = {"Lcom/mayakapps/rwmutex/ReadWriteMutex;", "", "Lkotlinx/coroutines/sync/Mutex;", "getReadMutex", "()Lkotlinx/coroutines/sync/Mutex;", "readMutex", "getWriteMutex", "writeMutex", "State", "rwmutex"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public interface ReadWriteMutex {

    /* compiled from: ReadWriteMutex.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0006"}, m3636d2 = {"Lcom/mayakapps/rwmutex/ReadWriteMutex$State;", "", "", "activeAccessors", "constructor-impl", "(I)I", "rwmutex"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @JvmInline
    public static final class State {
        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m9460constructorimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m9461toStringimpl(int i) {
            return "State(activeAccessors=" + i + ')';
        }
    }

    Mutex getReadMutex();

    Mutex getWriteMutex();
}
