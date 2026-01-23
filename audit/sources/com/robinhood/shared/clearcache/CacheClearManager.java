package com.robinhood.shared.clearcache;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: CacheClearManager.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/clearcache/CacheClearManager;", "", "clearCachesAndRestart", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-clear-cache_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface CacheClearManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Object clearCachesAndRestart(Continuation<? super Unit> continuation);

    /* compiled from: CacheClearManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/clearcache/CacheClearManager$Companion;", "", "<init>", "()V", "Noop", "Lcom/robinhood/shared/clearcache/CacheClearManager;", "getNoop", "()Lcom/robinhood/shared/clearcache/CacheClearManager;", "lib-clear-cache_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CacheClearManager Noop = new CacheClearManager() { // from class: com.robinhood.shared.clearcache.CacheClearManager$Companion$Noop$1
            @Override // com.robinhood.shared.clearcache.CacheClearManager
            public Object clearCachesAndRestart(Continuation<? super Unit> continuation) {
                return Unit.INSTANCE;
            }
        };

        private Companion() {
        }

        public final CacheClearManager getNoop() {
            return Noop;
        }
    }
}
