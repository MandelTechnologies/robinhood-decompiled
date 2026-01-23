package com.mux.stats.sdk.core.events;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes27.dex */
public class EventBus implements IEventDispatcher {

    /* renamed from: a */
    private int f1008a = 0;

    /* renamed from: b */
    private ConcurrentHashMap<Integer, IEventListener> f1009b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private HashSet<Integer> f1010c = new HashSet<>();

    public void addListener(IEventListener iEventListener) {
        iEventListener.setId(this.f1008a);
        ConcurrentHashMap<Integer, IEventListener> concurrentHashMap = this.f1009b;
        int i = this.f1008a;
        this.f1008a = i + 1;
        concurrentHashMap.put(Integer.valueOf(i), iEventListener);
    }

    @Override // com.mux.stats.sdk.core.events.IEventDispatcher
    public void dispatch(IEvent iEvent) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f1008a; i++) {
            IEventListener iEventListener = this.f1009b.get(Integer.valueOf(i));
            if (iEventListener != null) {
                iEventListener.handle(iEvent);
                int id = iEventListener.getId();
                if (this.f1010c.contains(Integer.valueOf(id))) {
                    arrayList.add(Integer.valueOf(id));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.intValue();
            this.f1009b.remove(num);
        }
    }

    public void removeAllListeners() {
        this.f1009b = new ConcurrentHashMap<>();
        this.f1010c = new HashSet<>();
    }
}
