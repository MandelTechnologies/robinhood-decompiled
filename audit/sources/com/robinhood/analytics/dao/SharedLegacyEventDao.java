package com.robinhood.analytics.dao;

import com.robinhood.analytics.models.LegacyEvent;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: SharedLegacyEventDao.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0097@¢\u0006\u0004\b\u0007\u0010\fJ.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\nH§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rH§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "", "<init>", "()V", "Lcom/robinhood/analytics/models/LegacyEvent;", "event", "", "insert", "(Lcom/robinhood/analytics/models/LegacyEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "j$/time/Instant", "timestamp", "(Ljava/lang/String;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "minTimestamp", "Ljava/util/UUID;", "afterId", "", "get", "(ILj$/time/Instant;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ids", AnalyticsStrings.BUTTON_LIST_DELETE, "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "before", "deleteOldItems", "(Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class SharedLegacyEventDao {
    public abstract Object delete(Set<UUID> set, Continuation<? super Integer> continuation);

    public abstract Object deleteAll(Continuation<? super Integer> continuation);

    public abstract Object deleteOldItems(Instant instant, Continuation<? super Integer> continuation);

    public abstract Object get(int i, Instant instant, UUID uuid, Continuation<? super List<LegacyEvent>> continuation);

    public abstract Object insert(LegacyEvent legacyEvent, Continuation<? super Unit> continuation);

    public Object insert(String str, Instant instant, Continuation<? super Unit> continuation) {
        return insert$suspendImpl(this, str, instant, continuation);
    }

    static /* synthetic */ Object insert$suspendImpl(SharedLegacyEventDao sharedLegacyEventDao, String str, Instant instant, Continuation<? super Unit> continuation) {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        Object objInsert = sharedLegacyEventDao.insert(new LegacyEvent(uuidRandomUUID, str, instant), continuation);
        return objInsert == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsert : Unit.INSTANCE;
    }
}
