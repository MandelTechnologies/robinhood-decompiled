package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.CustomOptions;
import com.mux.stats.sdk.core.events.BaseEventListener;
import com.mux.stats.sdk.core.events.EventRateExceedTrackableEvent;
import com.mux.stats.sdk.core.events.IEvent;
import com.mux.stats.sdk.core.events.TrackableEvent;
import com.mux.stats.sdk.core.model.BaseQueryData;
import com.mux.stats.sdk.core.model.SimpleBaseQueryData;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.muxstats.INetworkRequest;
import com.mux.stats.sdk.muxstats.MuxStats;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes27.dex */
public class BeaconBatchTracker extends BaseEventListener implements INetworkRequest.IMuxNetworkRequestsCompletion2 {

    /* renamed from: c */
    private C5732a f1079c;

    /* renamed from: e */
    private ScheduledExecutorService f1081e;

    /* renamed from: h */
    private final CustomOptions f1084h;
    protected long roundTripLastCompletedTimeElapsed;
    protected boolean roundTripLastSucceded;
    protected long roundTripStartTime;
    protected long lastBeaconSentTime = 0;
    protected int failureCount = 0;

    /* renamed from: a */
    private boolean f1077a = true;

    /* renamed from: b */
    private boolean f1078b = false;
    protected ArrayList<TrackableEvent> eventQueue = new ArrayList<>();
    protected ArrayList<TrackableEvent> pendingEventsQueue = new ArrayList<>();
    protected INetworkRequest dispatcher = MuxStats.getHostNetworkApi();

    /* renamed from: d */
    private String f1080d = null;

    /* renamed from: f */
    private final Set<String> f1082f = new HashSet(Arrays.asList("viewstart", "error", "ended", "viewend"));

    /* renamed from: g */
    private boolean f1083g = false;

    /* renamed from: i */
    private long f1085i = 0;

    /* renamed from: j */
    private BaseQueryData f1086j = null;

    /* renamed from: k */
    private final Set<String> f1087k = new HashSet(Arrays.asList("ake", "xid", "xsqno", "psqno", "pphti", "pinid", "percz", "persy", "perbzez", "uti", "mapve", "vid"));

    public BeaconBatchTracker(CustomOptions customOptions) {
        this.f1084h = customOptions;
        this.f1079c = customOptions.isLongBeaconDispatch() ? C5732a.f1138d : C5732a.f1137c;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
        this.f1081e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new Runnable() { // from class: com.mux.stats.sdk.core.trackers.BeaconBatchTracker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1104a();
            }
        }, 0L, 1000L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    private static String m1102a(CustomOptions customOptions, String str) {
        String beaconDomain = customOptions.getBeaconDomain();
        String beaconCollectionDomain = customOptions.getBeaconCollectionDomain();
        return (str == null || str.isEmpty()) ? "inferred.litix.io" : (beaconCollectionDomain == null || beaconCollectionDomain.isEmpty()) ? (beaconDomain == null || beaconDomain.isEmpty()) ? ".litix.io" : beaconDomain : beaconCollectionDomain;
    }

    /* renamed from: a */
    private static Hashtable<String, String> m1103a(String str) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        if (MuxStats.getHostDevice().getDeviceId() != null) {
            hashtable.put("x-litix-shard-id", MuxStats.getHostDevice().getDeviceId());
        }
        if (str != null) {
            hashtable.put("x-litix-env-key", str);
        }
        return hashtable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m1104a() {
        this.f1081e.execute(new Runnable() { // from class: com.mux.stats.sdk.core.trackers.BeaconBatchTracker$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1107b();
            }
        });
    }

    /* renamed from: a */
    private void m1105a(boolean z) {
        BeaconBatchTracker beaconBatchTracker;
        Throwable th;
        int size = this.eventQueue.size();
        if (!z) {
            size = Math.min(size, this.f1079c.f1140b);
        }
        if (size != 0) {
            MuxLogger.m1117d("MuxStatsEventQueue", "attempt to send " + size + " events, total queue size " + this.eventQueue.size());
            if ((this.f1077a || z) && this.dispatcher != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < size; i++) {
                        try {
                            if (this.eventQueue.isEmpty()) {
                                break;
                            }
                            TrackableEvent trackableEventRemove = this.eventQueue.remove(0);
                            this.pendingEventsQueue.add(trackableEventRemove);
                            String eventType = trackableEventRemove.getEventType();
                            sb.append(eventType + ", ");
                            JSONObject muxDictionary = trackableEventRemove.getQuery().getMuxDictionary();
                            muxDictionary.put(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, eventType);
                            JSONArray jSONArrayNames = muxDictionary.names();
                            MuxLogger.m1117d("MuxStatsEventQueue", this.f1078b ? "    sending " + eventType + "\n" + trackableEventRemove.getDebugString() : "    sending " + eventType + " with " + jSONArrayNames.length() + " dims");
                            for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                                String string2 = jSONArrayNames.getString(i2);
                                if (string2.equals("ake") && this.f1080d == null) {
                                    this.f1080d = muxDictionary.getString(string2);
                                }
                            }
                            jSONArray.put(muxDictionary);
                        } catch (Throwable th2) {
                            th = th2;
                            beaconBatchTracker = this;
                            MuxLogger.exception(th, "MuxStatsEventQueue", "Error sending Beacon Queue");
                            beaconBatchTracker.f1077a = true;
                        }
                    }
                    jSONObject.put("events", jSONArray);
                    JSONObject jSONObject2 = new JSONObject();
                    if (this.roundTripLastSucceded) {
                        jSONObject2.put("rtt_ms", this.roundTripLastCompletedTimeElapsed);
                    }
                    jSONObject2.put("transmission_timestamp", System.currentTimeMillis());
                    jSONObject.put("metadata", jSONObject2);
                    if (z) {
                        MuxLogger.m1117d("MuxStatsEventQueue", "flush " + size + " events to batch handler");
                    } else {
                        MuxLogger.m1117d("MuxStatsEventQueue", "submit " + size + " events to batch handler");
                    }
                    MuxLogger.m1117d("MuxStatsEventQueue", "    [" + ((Object) sb) + "]");
                    this.f1077a = false;
                    this.roundTripStartTime = System.currentTimeMillis();
                    beaconBatchTracker = this;
                    try {
                        this.dispatcher.postWithCompletion(m1102a(this.f1084h, this.f1080d), this.f1080d, jSONObject.toString(), m1103a(this.f1080d), beaconBatchTracker);
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        MuxLogger.exception(th, "MuxStatsEventQueue", "Error sending Beacon Queue");
                        beaconBatchTracker.f1077a = true;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    beaconBatchTracker = this;
                }
            }
        }
    }

    /* renamed from: a */
    private synchronized boolean m1106a(TrackableEvent trackableEvent) {
        try {
            if (this.eventQueue.size() < 3600) {
                if (trackableEvent != null) {
                    this.eventQueue.add(trackableEvent);
                }
                if (System.currentTimeMillis() - this.lastBeaconSentTime > getNextBeaconTimeInterval()) {
                    m1105a(false);
                    this.lastBeaconSentTime = System.currentTimeMillis();
                }
                return this.eventQueue.size() <= 3600;
            }
            MuxLogger.m1117d("MuxStatsEventQueue", "Event not queued, ratelimited: " + this.f1083g + ",queue size: " + this.eventQueue.size() + ", queue limit: 3600");
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m1107b() {
        m1106a((TrackableEvent) null);
    }

    public void flush() {
        m1105a(true);
    }

    protected long getNextBeaconTimeInterval() {
        return this.failureCount == 0 ? this.f1079c.f1139a : (long) (((Math.pow(2.0d, r0 - 1) * Math.random()) + 1.0d) * this.f1079c.f1139a);
    }

    @Override // com.mux.stats.sdk.core.events.IEventListener
    public void handle(IEvent iEvent) throws JSONException {
        TrackableEvent trackableEvent = (TrackableEvent) iEvent;
        if (this.f1083g) {
            MuxLogger.m1117d("MuxStatsEventQueue", "Event not handled, ratelimited: " + this.f1083g + ",queue size: " + this.eventQueue.size() + ", queue limit: 3600");
            return;
        }
        BaseQueryData query = trackableEvent.getQuery();
        String eventType = trackableEvent.getEventType();
        if (eventType.equals("viewstart") || eventType.equals("viewend") || this.f1086j == null || System.currentTimeMillis() - this.f1085i >= 600000) {
            SimpleBaseQueryData simpleBaseQueryData = new SimpleBaseQueryData();
            this.f1086j = simpleBaseQueryData;
            simpleBaseQueryData.update(query);
            if (eventType.equals("viewend")) {
                this.f1086j = null;
            }
        } else {
            JSONObject muxDictionary = trackableEvent.getQuery().getMuxDictionary();
            SimpleBaseQueryData simpleBaseQueryData2 = new SimpleBaseQueryData();
            for (String str : muxDictionary.keySet()) {
                if (BaseQueryData.isKeyJsonObject(str)) {
                    simpleBaseQueryData2.put(str, muxDictionary.getJSONObject(str));
                } else {
                    String string2 = muxDictionary.getString(str);
                    if (this.f1086j.get(str) == null || !string2.equals(this.f1086j.get(str)) || this.f1087k.contains(str) || str.equalsIgnoreCase(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY) || str.startsWith("q") || str.startsWith("d")) {
                        simpleBaseQueryData2.put(str, string2);
                        this.f1086j.put(str, string2);
                    }
                }
            }
            query.replace(simpleBaseQueryData2.getMuxDictionary());
        }
        this.f1085i = System.currentTimeMillis();
        this.f1083g = !m1106a(trackableEvent);
        if (this.f1082f.contains(trackableEvent.getEventType()) || this.f1083g) {
            if (this.f1083g) {
                this.eventQueue.add(new EventRateExceedTrackableEvent(trackableEvent));
            }
            flush();
        }
    }

    @Override // com.mux.stats.sdk.muxstats.INetworkRequest.IMuxNetworkRequestsCompletion2
    public void onComplete(boolean z, Map<String, List<String>> map) {
        List<String> list;
        MuxLogger.m1117d("MuxStatsEventQueue", "last batch handler result " + z);
        this.f1077a = true;
        if (z) {
            this.roundTripLastCompletedTimeElapsed = System.currentTimeMillis() - this.roundTripStartTime;
            this.roundTripLastSucceded = true;
            this.failureCount = 0;
            if (map != null && (list = map.get("x-litix-io-beacon-flush-ms")) != null && !list.isEmpty()) {
                try {
                    this.f1079c = C5732a.m1113a(Integer.parseInt(list.get(0)));
                } catch (NumberFormatException unused) {
                }
            }
        } else if (this.eventQueue.size() + this.pendingEventsQueue.size() < 3600) {
            this.eventQueue.addAll(0, this.pendingEventsQueue);
            this.failureCount++;
        } else {
            this.roundTripLastSucceded = false;
            this.failureCount = 0;
            MuxLogger.m1117d("MuxStatsEventQueue", "event queue too large, dropping events failed to send !!!");
        }
        this.pendingEventsQueue.clear();
    }

    public void release() {
        ScheduledExecutorService scheduledExecutorService = this.f1081e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f1081e = null;
        }
    }

    public void setVerboseMode(boolean z) {
        this.f1078b = z;
    }
}
