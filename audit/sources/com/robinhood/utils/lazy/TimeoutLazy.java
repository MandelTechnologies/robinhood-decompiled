package com.robinhood.utils.lazy;

import kotlin.Metadata;
import p479j$.time.Duration;

/* compiled from: TimeoutLazy.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/lazy/TimeoutLazy;", "T", "", "j$/time/Duration", "getTimeout", "()Lj$/time/Duration;", "timeout", "getValue", "()Ljava/lang/Object;", "value", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface TimeoutLazy<T> {
    Duration getTimeout();

    T getValue();
}
