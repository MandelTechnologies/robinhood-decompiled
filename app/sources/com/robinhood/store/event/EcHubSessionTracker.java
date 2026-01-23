package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.dao.EcHubObjectsSessionUpdateRecordDao;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubObjectsSessionUpdateRecord;
import com.robinhood.models.card.p311db.Card;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: EcHubSessionTracker.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0017\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b \u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m3636d2 = {"Lcom/robinhood/store/event/EcHubSessionTracker;", "", "Lcom/robinhood/android/models/event/db/dao/EcHubObjectsSessionUpdateRecordDao;", "ecHubObjectsSessionUpdateRecordDao", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/android/models/event/db/dao/EcHubObjectsSessionUpdateRecordDao;Lj$/time/Clock;)V", "", "trackHubSessionStart", "()V", "", "refId", "j$/time/Instant", "lastUpdatedAt", "updateRecordUpdatedTimestamp$lib_store_event_externalDebug", "(Ljava/lang/String;Lj$/time/Instant;)V", "updateRecordUpdatedTimestamp", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubObjectsSessionUpdateRecord;", "records", "updateRecordUpdatedTimestamps$lib_store_event_externalDebug", "(Ljava/util/List;)V", "updateRecordUpdatedTimestamps", "Lkotlinx/coroutines/flow/Flow;", "", "streamIsRecordUpdatedWithinSession$lib_store_event_externalDebug", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "streamIsRecordUpdatedWithinSession", "isRecordUpdatedWithinSession$lib_store_event_externalDebug", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isRecordUpdatedWithinSession", "isRecordStale$lib_store_event_externalDebug", "isRecordStale", "Lcom/robinhood/android/models/event/db/dao/EcHubObjectsSessionUpdateRecordDao;", "Lj$/time/Clock;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "latestSessionStartTimestamp", "Lkotlinx/coroutines/flow/MutableStateFlow;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class EcHubSessionTracker {
    private final Clock clock;
    private final EcHubObjectsSessionUpdateRecordDao ecHubObjectsSessionUpdateRecordDao;
    private final StateFlow2<Instant> latestSessionStartTimestamp;

    public EcHubSessionTracker(EcHubObjectsSessionUpdateRecordDao ecHubObjectsSessionUpdateRecordDao, Clock clock) {
        Intrinsics.checkNotNullParameter(ecHubObjectsSessionUpdateRecordDao, "ecHubObjectsSessionUpdateRecordDao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.ecHubObjectsSessionUpdateRecordDao = ecHubObjectsSessionUpdateRecordDao;
        this.clock = clock;
        this.latestSessionStartTimestamp = StateFlow4.MutableStateFlow(clock.instant());
    }

    public final void trackHubSessionStart() {
        Instant value;
        Instant instant;
        StateFlow2<Instant> stateFlow2 = this.latestSessionStartTimestamp;
        do {
            value = stateFlow2.getValue();
            instant = this.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        } while (!stateFlow2.compareAndSet(value, instant));
    }

    public final void updateRecordUpdatedTimestamp$lib_store_event_externalDebug(String refId, Instant lastUpdatedAt) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(lastUpdatedAt, "lastUpdatedAt");
        this.ecHubObjectsSessionUpdateRecordDao.insert((EcHubObjectsSessionUpdateRecordDao) new EcHubObjectsSessionUpdateRecord(refId, lastUpdatedAt));
    }

    public final void updateRecordUpdatedTimestamps$lib_store_event_externalDebug(List<EcHubObjectsSessionUpdateRecord> records) {
        Intrinsics.checkNotNullParameter(records, "records");
        this.ecHubObjectsSessionUpdateRecordDao.insert((Iterable) records);
    }

    public final Flow<Boolean> streamIsRecordUpdatedWithinSession$lib_store_event_externalDebug(String refId) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        return FlowKt.filterNotNull(this.ecHubObjectsSessionUpdateRecordDao.streamIsRecordUpdatedWithinSession(refId, this.latestSessionStartTimestamp.getValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isRecordUpdatedWithinSession$lib_store_event_externalDebug(String str, Continuation<? super Boolean> continuation) {
        EcHubSessionTracker3 ecHubSessionTracker3;
        if (continuation instanceof EcHubSessionTracker3) {
            ecHubSessionTracker3 = (EcHubSessionTracker3) continuation;
            int i = ecHubSessionTracker3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecHubSessionTracker3.label = i - Integer.MIN_VALUE;
            } else {
                ecHubSessionTracker3 = new EcHubSessionTracker3(this, continuation);
            }
        }
        Object objFirstOrNull = ecHubSessionTracker3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ecHubSessionTracker3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow<Boolean> flowStreamIsRecordUpdatedWithinSession$lib_store_event_externalDebug = streamIsRecordUpdatedWithinSession$lib_store_event_externalDebug(str);
            ecHubSessionTracker3.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamIsRecordUpdatedWithinSession$lib_store_event_externalDebug, ecHubSessionTracker3);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        Boolean bool = (Boolean) objFirstOrNull;
        return boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isRecordStale$lib_store_event_externalDebug(String str, Continuation<? super Boolean> continuation) {
        EcHubSessionTracker2 ecHubSessionTracker2;
        if (continuation instanceof EcHubSessionTracker2) {
            ecHubSessionTracker2 = (EcHubSessionTracker2) continuation;
            int i = ecHubSessionTracker2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecHubSessionTracker2.label = i - Integer.MIN_VALUE;
            } else {
                ecHubSessionTracker2 = new EcHubSessionTracker2(this, continuation);
            }
        }
        Object objIsRecordUpdatedWithinSession$lib_store_event_externalDebug = ecHubSessionTracker2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ecHubSessionTracker2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsRecordUpdatedWithinSession$lib_store_event_externalDebug);
            ecHubSessionTracker2.label = 1;
            objIsRecordUpdatedWithinSession$lib_store_event_externalDebug = isRecordUpdatedWithinSession$lib_store_event_externalDebug(str, ecHubSessionTracker2);
            if (objIsRecordUpdatedWithinSession$lib_store_event_externalDebug == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objIsRecordUpdatedWithinSession$lib_store_event_externalDebug);
        }
        return boxing.boxBoolean(!((Boolean) objIsRecordUpdatedWithinSession$lib_store_event_externalDebug).booleanValue());
    }
}
