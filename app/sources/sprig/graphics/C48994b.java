package sprig.graphics;

import com.singular.sdk.internal.Constants;
import com.userleap.EventListener;
import com.userleap.EventName;
import com.userleap.SprigEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fR2\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Lsprig/c/b;", "", "Lcom/userleap/EventName;", "event", "", "Lcom/userleap/EventListener;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "listener", "", "b", "Lcom/userleap/SprigEvent;", "", "(Lcom/userleap/SprigEvent;)Lkotlin/Unit;", "", "Ljava/util/Map;", "getListeners", "()Ljava/util/Map;", "getListeners$annotations", "()V", "listeners", "", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "registeredEvents", "<init>", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.c.b */
/* loaded from: classes28.dex */
public final class C48994b {

    /* renamed from: a */
    public static final C48994b f8232a = new C48994b();

    /* renamed from: b, reason: from kotlin metadata */
    private static final Map<EventName, Set<EventListener>> listeners;

    /* renamed from: c, reason: from kotlin metadata */
    private static final Set<EventName> registeredEvents;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        listeners = linkedHashMap;
        registeredEvents = linkedHashMap.keySet();
    }

    private C48994b() {
    }

    /* renamed from: a */
    public final Set<EventName> m4033a() {
        return registeredEvents;
    }

    /* renamed from: b */
    public final int m4035b(EventName event, EventListener listener) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.put(event, SetsKt.minus(m4031a(event), listener));
        return m4031a(event).size();
    }

    /* renamed from: a */
    private final Set<EventListener> m4031a(EventName event) {
        Set<EventListener> set = listeners.get(event);
        return set == null ? new LinkedHashSet() : set;
    }

    /* renamed from: a */
    public final int m4032a(EventName event, EventListener listener) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.put(event, SetsKt.plus(m4031a(event), listener));
        return m4031a(event).size();
    }

    /* renamed from: a */
    public final Unit m4034a(SprigEvent event) {
        Iterator<EventListener> it;
        Intrinsics.checkNotNullParameter(event, "event");
        Set<EventListener> set = listeners.get(event.getName());
        if (set == null || (it = set.iterator()) == null) {
            return null;
        }
        while (it.hasNext()) {
            it.next().onEvent(event);
        }
        return Unit.INSTANCE;
    }
}
