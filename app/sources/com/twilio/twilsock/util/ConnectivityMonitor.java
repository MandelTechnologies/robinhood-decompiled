package com.twilio.twilsock.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: ConnectivityMonitor.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m3636d2 = {"Lcom/twilio/twilsock/util/ConnectivityMonitor;", "", "isNetworkAvailable", "", "()Z", "onChanged", "Lkotlin/Function0;", "", "getOnChanged", "()Lkotlin/jvm/functions/Function0;", "setOnChanged", "(Lkotlin/jvm/functions/Function0;)V", "start", "stop", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ConnectivityMonitor {
    Function0<Unit> getOnChanged();

    boolean isNetworkAvailable();

    void setOnChanged(Function0<Unit> function0);

    void start();

    void stop();
}
