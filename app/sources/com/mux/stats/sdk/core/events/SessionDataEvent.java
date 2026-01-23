package com.mux.stats.sdk.core.events;

import com.mux.stats.sdk.core.model.BaseQueryData;
import com.mux.stats.sdk.core.model.CustomData;
import com.mux.stats.sdk.core.model.CustomerPlayerData;
import com.mux.stats.sdk.core.model.CustomerVideoData;
import com.mux.stats.sdk.core.model.CustomerViewData;
import com.mux.stats.sdk.core.model.CustomerViewerData;
import com.mux.stats.sdk.core.model.SessionTag;
import com.mux.stats.sdk.core.model.VideoData;
import com.mux.stats.sdk.core.model.ViewData;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.core.util.SessionDataKeys;
import com.mux.stats.sdk.core.util.Util;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class SessionDataEvent extends BaseEvent {

    /* renamed from: a */
    private ViewData f1015a;

    /* renamed from: b */
    private VideoData f1016b;

    /* renamed from: c */
    private CustomerVideoData f1017c;

    /* renamed from: d */
    private CustomerPlayerData f1018d;

    /* renamed from: e */
    private CustomerViewData f1019e;

    /* renamed from: f */
    private CustomerViewerData f1020f;

    /* renamed from: g */
    private CustomData f1021g;

    public SessionDataEvent() {
    }

    public SessionDataEvent(List<SessionTag> list) throws JSONException {
        this();
        setSessionData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ CustomData m1081a() throws Exception {
        return new CustomData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ CustomerViewerData m1082b() throws Exception {
        return new CustomerViewerData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ CustomerViewData m1083c() throws Exception {
        return new CustomerViewData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ CustomerPlayerData m1084d() throws Exception {
        return new CustomerPlayerData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ CustomerVideoData m1085e() throws Exception {
        return new CustomerVideoData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ VideoData m1086f() throws Exception {
        return new VideoData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ ViewData m1087g() throws Exception {
        return new ViewData();
    }

    public CustomData getCustomData() {
        return this.f1021g;
    }

    public CustomerPlayerData getCustomerPlayerData() {
        return this.f1018d;
    }

    public CustomerVideoData getCustomerVideoData() {
        return this.f1017c;
    }

    public CustomerViewData getCustomerViewData() {
        return this.f1019e;
    }

    public CustomerViewerData getCustomerViewerData() {
        return this.f1020f;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public String getType() {
        return "SessionDataEvent";
    }

    public VideoData getVideoData() {
        return this.f1016b;
    }

    public ViewData getViewData() {
        return this.f1015a;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public boolean isData() {
        return true;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public boolean isSessionData() {
        return true;
    }

    public void setSessionData(List<SessionTag> list) throws JSONException {
        this.f1015a = null;
        this.f1016b = null;
        this.f1018d = null;
        this.f1019e = null;
        this.f1017c = null;
        this.f1021g = null;
        if (list != null) {
            updateSessionData(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateSessionData(List<SessionTag> list) throws JSONException {
        ViewData viewData;
        if (list != null) {
            for (SessionTag sessionTag : list) {
                Class<? extends BaseQueryData> clsType = SessionDataKeys.type(sessionTag.key);
                MuxLogger.m1118w("SessionDataEvent", "Data key is " + sessionTag.key + " Data is " + sessionTag);
                if (clsType == null) {
                    MuxLogger.m1118w("SessionDataEvent", "Unknown experiment value ignored: " + sessionTag.key);
                } else {
                    MuxLogger.m1117d("SessionDataEvent", "Obtained class " + clsType.getSimpleName());
                    if (clsType.equals(ViewData.class)) {
                        ViewData viewData2 = (ViewData) Util.lazyGet(this.f1015a, new Callable() { // from class: com.mux.stats.sdk.core.events.SessionDataEvent$$ExternalSyntheticLambda0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return SessionDataEvent.m1087g();
                            }
                        });
                        this.f1015a = viewData2;
                        viewData = viewData2;
                    } else if (clsType.equals(VideoData.class)) {
                        VideoData videoData = (VideoData) Util.lazyGet(this.f1016b, new Callable() { // from class: com.mux.stats.sdk.core.events.SessionDataEvent$$ExternalSyntheticLambda1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return SessionDataEvent.m1086f();
                            }
                        });
                        this.f1016b = videoData;
                        viewData = videoData;
                    } else if (clsType.equals(CustomerVideoData.class)) {
                        CustomerVideoData customerVideoData = (CustomerVideoData) Util.lazyGet(this.f1017c, new Callable() { // from class: com.mux.stats.sdk.core.events.SessionDataEvent$$ExternalSyntheticLambda2
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return SessionDataEvent.m1085e();
                            }
                        });
                        this.f1017c = customerVideoData;
                        viewData = customerVideoData;
                    } else if (clsType.equals(CustomerPlayerData.class)) {
                        CustomerPlayerData customerPlayerData = (CustomerPlayerData) Util.lazyGet(this.f1018d, new Callable() { // from class: com.mux.stats.sdk.core.events.SessionDataEvent$$ExternalSyntheticLambda3
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return SessionDataEvent.m1084d();
                            }
                        });
                        this.f1018d = customerPlayerData;
                        viewData = customerPlayerData;
                    } else if (clsType.equals(CustomerViewData.class)) {
                        CustomerViewData customerViewData = (CustomerViewData) Util.lazyGet(this.f1019e, new Callable() { // from class: com.mux.stats.sdk.core.events.SessionDataEvent$$ExternalSyntheticLambda4
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return SessionDataEvent.m1083c();
                            }
                        });
                        this.f1019e = customerViewData;
                        viewData = customerViewData;
                    } else if (clsType.equals(CustomerViewerData.class)) {
                        CustomerViewerData customerViewerData = (CustomerViewerData) Util.lazyGet(this.f1020f, new Callable() { // from class: com.mux.stats.sdk.core.events.SessionDataEvent$$ExternalSyntheticLambda5
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return SessionDataEvent.m1082b();
                            }
                        });
                        this.f1020f = customerViewerData;
                        viewData = customerViewerData;
                    } else if (clsType.equals(CustomData.class)) {
                        CustomData customData = (CustomData) Util.lazyGet(this.f1021g, new Callable() { // from class: com.mux.stats.sdk.core.events.SessionDataEvent$$ExternalSyntheticLambda6
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return SessionDataEvent.m1081a();
                            }
                        });
                        this.f1021g = customData;
                        viewData = customData;
                    } else {
                        MuxLogger.m1117d("SessionDataEvent", "Unknown session data with key [" + sessionTag.key + "] was ignored");
                    }
                    viewData.put(SessionDataKeys.shortCode(sessionTag.key), sessionTag.value);
                }
            }
        }
    }
}
