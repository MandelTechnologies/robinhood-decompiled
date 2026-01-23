package com.mux.stats.sdk.core.events;

import com.mux.stats.sdk.core.model.AdData;
import com.mux.stats.sdk.core.model.BandwidthMetricData;
import com.mux.stats.sdk.core.model.BaseQueryData;
import com.mux.stats.sdk.core.model.CustomData;
import com.mux.stats.sdk.core.model.CustomerPlayerData;
import com.mux.stats.sdk.core.model.CustomerVideoData;
import com.mux.stats.sdk.core.model.CustomerViewData;
import com.mux.stats.sdk.core.model.CustomerViewerData;
import com.mux.stats.sdk.core.model.EnvironmentData;
import com.mux.stats.sdk.core.model.PlayerData;
import com.mux.stats.sdk.core.model.VideoData;
import com.mux.stats.sdk.core.model.ViewData;
import com.mux.stats.sdk.core.model.ViewerData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes27.dex */
public class TrackableEvent extends BaseEvent {

    /* renamed from: a */
    private final String f1022a;

    /* renamed from: b */
    private final BaseQueryData f1023b = new BaseQueryData() { // from class: com.mux.stats.sdk.core.events.TrackableEvent.1
        @Override // com.mux.stats.sdk.core.model.BaseQueryData
        public final void sync() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = new JSONObject();
            JSONObject jSONObject6 = new JSONObject();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = new JSONObject();
            JSONObject jSONObject9 = new JSONObject();
            JSONObject jSONObject10 = new JSONObject();
            JSONObject jSONObject11 = new JSONObject();
            JSONObject jSONObject12 = new JSONObject();
            JSONArray jSONArrayKeys = keys();
            int i = 0;
            while (i < jSONArrayKeys.length()) {
                String string2 = jSONArrayKeys.getString(i);
                JSONArray jSONArray = jSONArrayKeys;
                if (ViewData.keys.contains(string2)) {
                    jSONObject.put(string2, this.query.get(string2));
                }
                if (VideoData.keys.contains(string2)) {
                    jSONObject2.put(string2, this.query.get(string2));
                }
                if (CustomerVideoData.keys.contains(string2)) {
                    jSONObject3.put(string2, this.query.get(string2));
                }
                if (PlayerData.keys.contains(string2)) {
                    jSONObject4.put(string2, this.query.get(string2));
                }
                if (CustomerPlayerData.keys.contains(string2)) {
                    jSONObject5.put(string2, this.query.get(string2));
                }
                if (EnvironmentData.keys.contains(string2)) {
                    jSONObject6.put(string2, this.query.get(string2));
                }
                if (ViewerData.keys.contains(string2)) {
                    jSONObject7.put(string2, this.query.get(string2));
                }
                if (BandwidthMetricData.keys.contains(string2)) {
                    jSONObject8.put(string2, this.query.get(string2));
                }
                if (CustomerViewData.keys.contains(string2)) {
                    jSONObject9.put(string2, this.query.get(string2));
                }
                if (CustomData.keys.contains(string2)) {
                    jSONObject11.put(string2, this.query.get(string2));
                }
                if (CustomerViewerData.keys.contains(string2)) {
                    jSONObject10.put(string2, this.query.get(string2));
                }
                if (AdData.keys.contains(string2)) {
                    jSONObject12.put(string2, this.query.get(string2));
                }
                i++;
                jSONArrayKeys = jSONArray;
            }
            if (TrackableEvent.this.f1024c != null) {
                TrackableEvent.this.f1024c.replace(jSONObject);
            }
            if (TrackableEvent.this.f1025d != null) {
                TrackableEvent.this.f1025d.replace(jSONObject2);
            }
            if (TrackableEvent.this.f1026e != null) {
                TrackableEvent.this.f1026e.replace(jSONObject3);
            }
            if (TrackableEvent.this.f1027f != null) {
                TrackableEvent.this.f1027f.replace(jSONObject4);
            }
            if (TrackableEvent.this.f1028g != null) {
                TrackableEvent.this.f1028g.replace(jSONObject5);
            }
            if (TrackableEvent.this.f1029h != null) {
                TrackableEvent.this.f1029h.replace(jSONObject6);
            }
            if (TrackableEvent.this.f1030i != null) {
                TrackableEvent.this.f1030i.replace(jSONObject7);
            }
            if (TrackableEvent.this.f1031j != null) {
                TrackableEvent.this.f1031j.replace(jSONObject8);
            }
            if (TrackableEvent.this.f1032k != null) {
                TrackableEvent.this.f1032k.replace(jSONObject9);
            }
            if (TrackableEvent.this.f1033l != null) {
                TrackableEvent.this.f1033l.replace(jSONObject9);
            }
            if (TrackableEvent.this.f1034m != null) {
                TrackableEvent.this.f1034m.replace(jSONObject12);
            }
            if (TrackableEvent.this.f1035n != null) {
                TrackableEvent.this.f1035n.replace(jSONObject11);
            }
        }
    };

    /* renamed from: c */
    private ViewData f1024c;

    /* renamed from: d */
    private VideoData f1025d;

    /* renamed from: e */
    private CustomerVideoData f1026e;

    /* renamed from: f */
    private PlayerData f1027f;

    /* renamed from: g */
    private CustomerPlayerData f1028g;

    /* renamed from: h */
    private EnvironmentData f1029h;

    /* renamed from: i */
    private ViewerData f1030i;

    /* renamed from: j */
    private BandwidthMetricData f1031j;

    /* renamed from: k */
    private CustomerViewData f1032k;

    /* renamed from: l */
    private CustomerViewerData f1033l;

    /* renamed from: m */
    private AdData f1034m;

    /* renamed from: n */
    private CustomData f1035n;

    public TrackableEvent(String str) {
        this.f1022a = str;
    }

    /* renamed from: a */
    private void m1089a(BaseQueryData baseQueryData) {
        this.f1023b.update(baseQueryData);
    }

    public String getDebugString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        StringBuilder sb = new StringBuilder("TrackableEvent: ");
        String str12 = "";
        if (this.f1023b != null) {
            str = "\n  " + this.f1023b.getDebugString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f1024c != null) {
            str2 = "\n  " + this.f1024c.getDebugString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.f1025d != null) {
            str3 = "\n  " + this.f1025d.getDebugString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (this.f1026e != null) {
            str4 = "\n  " + this.f1026e.getDebugString();
        } else {
            str4 = "";
        }
        sb.append(str4);
        if (this.f1027f != null) {
            str5 = "\n  " + this.f1027f.getDebugString();
        } else {
            str5 = "";
        }
        sb.append(str5);
        if (this.f1028g != null) {
            str6 = "\n  " + this.f1028g.getDebugString();
        } else {
            str6 = "";
        }
        sb.append(str6);
        if (this.f1032k != null) {
            str7 = "\n  " + this.f1032k.getDebugString();
        } else {
            str7 = "";
        }
        sb.append(str7);
        if (this.f1033l != null) {
            str8 = "\n  " + this.f1033l.getDebugString();
        } else {
            str8 = "";
        }
        sb.append(str8);
        if (this.f1029h != null) {
            str9 = "\n  " + this.f1029h.getDebugString();
        } else {
            str9 = "";
        }
        sb.append(str9);
        if (this.f1031j != null) {
            str10 = "\n  " + this.f1031j.getDebugString();
        } else {
            str10 = "";
        }
        sb.append(str10);
        if (this.f1034m != null) {
            str11 = "\n  " + this.f1034m.getDebugString();
        } else {
            str11 = "";
        }
        sb.append(str11);
        if (this.f1035n != null) {
            str12 = "\n  " + this.f1035n.getDebugString();
        }
        sb.append(str12);
        return sb.toString();
    }

    public String getEventType() {
        return this.f1022a;
    }

    public PlayerData getPlayerData() {
        PlayerData playerData = new PlayerData();
        playerData.update(this.f1027f);
        return playerData;
    }

    public BaseQueryData getQuery() {
        return this.f1023b;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public String getType() {
        return "TrackableEvent";
    }

    public ViewData getViewData() {
        ViewData viewData = new ViewData();
        viewData.update(this.f1024c);
        return viewData;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public boolean isTrackable() {
        return true;
    }

    public void setAdData(AdData adData) {
        AdData adData2 = new AdData();
        adData2.update(adData);
        m1089a(adData2);
        this.f1034m = adData2;
    }

    public void setBandwidthMetricData(BandwidthMetricData bandwidthMetricData) {
        BandwidthMetricData bandwidthMetricData2 = new BandwidthMetricData();
        bandwidthMetricData2.update(bandwidthMetricData);
        m1089a(bandwidthMetricData2);
        this.f1031j = bandwidthMetricData2;
    }

    public void setCustomData(CustomData customData) {
        CustomData customData2 = new CustomData();
        customData2.update(customData);
        m1089a(customData2);
        this.f1035n = customData2;
    }

    public void setCustomerPlayerData(CustomerPlayerData customerPlayerData) {
        CustomerPlayerData customerPlayerData2 = new CustomerPlayerData();
        customerPlayerData2.update(customerPlayerData);
        m1089a(customerPlayerData2);
        this.f1028g = customerPlayerData2;
    }

    public void setCustomerVideoData(CustomerVideoData customerVideoData) {
        CustomerVideoData customerVideoData2 = new CustomerVideoData();
        customerVideoData2.update(customerVideoData);
        m1089a(customerVideoData2);
        this.f1026e = customerVideoData2;
    }

    public void setCustomerViewData(CustomerViewData customerViewData) {
        CustomerViewData customerViewData2 = new CustomerViewData();
        customerViewData2.update(customerViewData);
        m1089a(customerViewData2);
        this.f1032k = customerViewData2;
    }

    public void setCustomerViewerData(CustomerViewerData customerViewerData) {
        CustomerViewerData customerViewerData2 = new CustomerViewerData();
        customerViewerData2.update(customerViewerData);
        m1089a(customerViewerData2);
        this.f1033l = customerViewerData2;
    }

    public void setEnvironmentData(EnvironmentData environmentData) {
        EnvironmentData environmentData2 = new EnvironmentData();
        environmentData2.update(environmentData);
        m1089a(environmentData);
        this.f1029h = environmentData2;
    }

    public void setPlayerData(PlayerData playerData) {
        PlayerData playerData2 = new PlayerData();
        playerData2.update(playerData);
        m1089a(playerData2);
        this.f1027f = playerData2;
    }

    public void setVideoData(VideoData videoData) {
        VideoData videoData2 = new VideoData();
        videoData2.update(videoData);
        m1089a(videoData2);
        this.f1025d = videoData2;
    }

    public void setViewData(ViewData viewData) {
        ViewData viewData2 = new ViewData();
        viewData2.update(viewData);
        m1089a(viewData2);
        this.f1024c = viewData2;
    }

    public void setViewerData(ViewerData viewerData) {
        ViewerData viewerData2 = new ViewerData();
        viewerData2.update(viewerData);
        m1089a(viewerData2);
        this.f1030i = viewerData2;
    }

    public String toString() {
        return "TrackableEvent<" + this.f1022a + ", " + this.f1023b.toString() + ">";
    }
}
