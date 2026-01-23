package com.robinhood.networking.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dns;

/* compiled from: RhDns.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/networking/util/RhDns;", "Lokhttp3/Dns;", "<init>", "()V", "lookup", "", "Ljava/net/InetAddress;", "hostname", "", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class RhDns implements Dns {
    public static final RhDns INSTANCE = new RhDns();

    private RhDns() {
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String hostname) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            return Dns.SYSTEM.lookup(hostname);
        } catch (IllegalArgumentException e) {
            throw new UnknownHostException(e.getMessage());
        }
    }
}
