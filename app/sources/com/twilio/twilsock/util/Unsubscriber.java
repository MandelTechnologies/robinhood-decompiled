package com.twilio.twilsock.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Unsubscriber.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/twilio/twilsock/util/Unsubscriber;", "", "block", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "unsubscribe", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Unsubscriber {
    private final Function0<Unit> block;

    public Unsubscriber(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    public final void unsubscribe() {
        this.block.invoke();
    }
}
