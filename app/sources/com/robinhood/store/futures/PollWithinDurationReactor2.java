package com.robinhood.store.futures;

import kotlin.Metadata;
import p479j$.time.Duration;

/* compiled from: PollWithinDurationReactor.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0014\u0010\u0005\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/store/futures/ParamsWithDuration;", "P", "", "getParams", "()Ljava/lang/Object;", "params", "j$/time/Duration", "getDuration", "()Lj$/time/Duration;", "duration", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.futures.ParamsWithDuration, reason: use source file name */
/* loaded from: classes12.dex */
public interface PollWithinDurationReactor2<P> {
    Duration getDuration();

    P getParams();
}
