package p479j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: j$.time.zone.h */
/* loaded from: classes29.dex */
public final class C45815h {

    /* renamed from: b */
    public static final CopyOnWriteArrayList f6998b;

    /* renamed from: c */
    public static final ConcurrentMap f6999c;

    /* renamed from: d */
    public static volatile Set f7000d;

    /* renamed from: a */
    public final Set f7001a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f6998b = copyOnWriteArrayList;
        f6999c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C45814g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* renamed from: a */
    public static ZoneRules m3632a(String str) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f6999c;
        C45815h c45815h = (C45815h) concurrentHashMap.get(str);
        if (c45815h == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new C45813f("No time-zone data files registered");
            }
            throw new C45813f("Unknown time-zone ID: ".concat(str));
        }
        if (c45815h.f7001a.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new C45813f("Not a built-in time zone: ".concat(str));
    }

    /* renamed from: b */
    public static void m3633b(C45815h c45815h) {
        Objects.requireNonNull(c45815h, "provider");
        synchronized (C45815h.class) {
            try {
                for (String str : c45815h.f7001a) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((C45815h) ((ConcurrentHashMap) f6999c).putIfAbsent(str, c45815h)) != null) {
                        throw new C45813f("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + c45815h);
                    }
                }
                f7000d = Collections.unmodifiableSet(new HashSet(((ConcurrentHashMap) f6999c).keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        f6998b.add(c45815h);
    }

    public C45815h() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f7001a = Collections.unmodifiableSet(linkedHashSet);
    }
}
