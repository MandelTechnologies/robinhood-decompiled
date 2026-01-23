package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.model.AdData;
import com.mux.stats.sdk.core.model.ViewData;
import com.mux.stats.sdk.core.util.CurrentTime;
import com.mux.stats.sdk.core.util.Util;
import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class AdTracker extends BaseAdTracker {

    /* renamed from: a */
    private boolean f1056a;

    /* renamed from: b */
    private boolean f1057b;

    /* renamed from: c */
    private int f1058c;

    /* renamed from: d */
    private int f1059d;

    /* renamed from: e */
    private int f1060e;

    /* renamed from: f */
    private int f1061f;

    /* renamed from: g */
    private int f1062g;

    /* renamed from: h */
    private final long f1063h;

    /* renamed from: i */
    private long f1064i;

    /* renamed from: j */
    private long f1065j;

    /* renamed from: k */
    private final CurrentTime f1066k;

    /* renamed from: l */
    private long f1067l;

    /* renamed from: m */
    private long f1068m;

    /* renamed from: n */
    private long f1069n;

    /* renamed from: o */
    private long f1070o;

    /* renamed from: p */
    private boolean f1071p;

    /* renamed from: q */
    private final ArrayList<Long> f1072q;

    /* renamed from: r */
    private boolean f1073r;

    /* renamed from: s */
    private boolean f1074s;

    /* renamed from: t */
    private AdData f1075t;

    public AdTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        this.f1056a = false;
        this.f1057b = false;
        CurrentTime currentTime = new CurrentTime();
        this.f1066k = currentTime;
        this.f1071p = false;
        this.f1072q = new ArrayList<>();
        this.f1073r = true;
        this.f1074s = false;
        this.f1063h = currentTime.now();
    }

    /* renamed from: a */
    private static boolean m1101a(ViewData viewData) throws JSONException {
        Long viewContentPlaybackTime = viewData.getViewContentPlaybackTime();
        return viewContentPlaybackTime == null || viewContentPlaybackTime.longValue() < 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0228  */
    @Override // com.mux.stats.sdk.core.trackers.BaseAdTracker, com.mux.stats.sdk.core.trackers.BaseTracker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) throws JSONException {
        ViewData viewData;
        boolean z;
        boolean z2;
        viewData = playbackEvent.getViewData();
        playbackEvent.getPlayerData();
        if (Util.oneOf(playbackEvent.getType(), "adended", "adbreakend")) {
            if (playbackEvent.getAdData() != null) {
                playbackEvent.getAdData().update(this.f1075t);
            }
            AdData adData = this.f1075t;
            if (adData != null) {
                adData.clear();
                this.f1075t = null;
            }
        } else {
            AdData adData2 = playbackEvent.getAdData();
            if (this.f1075t == null) {
                this.f1075t = new AdData();
            }
            if (adData2 != null && adData2.getMuxDictionary().length() > 0) {
                this.f1075t.update(adData2);
                adData2.update(this.f1075t);
            }
        }
        String type2 = playbackEvent.getType();
        type2.getClass();
        switch (type2) {
            case "adplaying":
                if (m1101a(viewData) && this.f1065j > 0) {
                    long jNow = this.f1066k.now() - this.f1065j;
                    viewData.setViewPrerollLoadTime(Long.valueOf(jNow));
                    viewData.setViewStartupPrerollLoadTime(Long.valueOf(jNow));
                }
                viewData.setViewAdBreakCount(Integer.valueOf(this.f1058c));
                viewData.setViewAdCompleteCount(Integer.valueOf(this.f1059d));
                viewData.setViewAdViewCount(Integer.valueOf(this.f1060e));
                viewData.setViewAdErrorCount(Integer.valueOf(this.f1061f));
                z = this.f1056a;
                if (z) {
                    viewData.setViewPrerollRequested(Boolean.valueOf(z));
                }
                z2 = this.f1057b;
                if (z2) {
                    viewData.setViewPrerollPlayed(Boolean.valueOf(z2));
                }
                viewData.setViewAdWatchTime(Long.valueOf(this.f1067l));
                viewData.setViewPrerollRequestCount(Long.valueOf(this.f1070o));
                viewData.setViewAdPlayCount(Integer.valueOf(this.f1062g));
                break;
            case "adplay":
                if (this.f1071p) {
                    this.f1071p = false;
                } else {
                    this.f1074s = true;
                    if (m1101a(viewData) && !this.f1057b) {
                        this.f1057b = true;
                        long jNow2 = this.f1066k.now();
                        this.f1065j = jNow2;
                        viewData.setViewPrerollRequestTime(Long.valueOf(jNow2 - this.f1064i));
                        viewData.setViewStartupPrerollRequestTime(Long.valueOf(this.f1065j - this.f1063h));
                    }
                    this.f1060e++;
                    this.f1068m = this.f1066k.now();
                    if (this.f1073r) {
                        this.f1073r = false;
                        this.f1062g++;
                    }
                }
                viewData.setViewAdBreakCount(Integer.valueOf(this.f1058c));
                viewData.setViewAdCompleteCount(Integer.valueOf(this.f1059d));
                viewData.setViewAdViewCount(Integer.valueOf(this.f1060e));
                viewData.setViewAdErrorCount(Integer.valueOf(this.f1061f));
                z = this.f1056a;
                if (z) {
                }
                z2 = this.f1057b;
                if (z2) {
                }
                viewData.setViewAdWatchTime(Long.valueOf(this.f1067l));
                viewData.setViewPrerollRequestCount(Long.valueOf(this.f1070o));
                viewData.setViewAdPlayCount(Integer.valueOf(this.f1062g));
                break;
            case "adended":
                this.f1067l += this.f1066k.now() - this.f1068m;
                this.f1059d++;
                this.f1073r = true;
                viewData.setViewAdBreakCount(Integer.valueOf(this.f1058c));
                viewData.setViewAdCompleteCount(Integer.valueOf(this.f1059d));
                viewData.setViewAdViewCount(Integer.valueOf(this.f1060e));
                viewData.setViewAdErrorCount(Integer.valueOf(this.f1061f));
                z = this.f1056a;
                if (z) {
                }
                z2 = this.f1057b;
                if (z2) {
                }
                viewData.setViewAdWatchTime(Long.valueOf(this.f1067l));
                viewData.setViewPrerollRequestCount(Long.valueOf(this.f1070o));
                viewData.setViewAdPlayCount(Integer.valueOf(this.f1062g));
                break;
            case "aderror":
                this.f1061f++;
                this.f1073r = true;
                viewData.setViewAdBreakCount(Integer.valueOf(this.f1058c));
                viewData.setViewAdCompleteCount(Integer.valueOf(this.f1059d));
                viewData.setViewAdViewCount(Integer.valueOf(this.f1060e));
                viewData.setViewAdErrorCount(Integer.valueOf(this.f1061f));
                z = this.f1056a;
                if (z) {
                }
                z2 = this.f1057b;
                if (z2) {
                }
                viewData.setViewAdWatchTime(Long.valueOf(this.f1067l));
                viewData.setViewPrerollRequestCount(Long.valueOf(this.f1070o));
                viewData.setViewAdPlayCount(Integer.valueOf(this.f1062g));
                break;
            case "adpause":
                this.f1071p = true;
                viewData.setViewAdBreakCount(Integer.valueOf(this.f1058c));
                viewData.setViewAdCompleteCount(Integer.valueOf(this.f1059d));
                viewData.setViewAdViewCount(Integer.valueOf(this.f1060e));
                viewData.setViewAdErrorCount(Integer.valueOf(this.f1061f));
                z = this.f1056a;
                if (z) {
                }
                z2 = this.f1057b;
                if (z2) {
                }
                viewData.setViewAdWatchTime(Long.valueOf(this.f1067l));
                viewData.setViewPrerollRequestCount(Long.valueOf(this.f1070o));
                viewData.setViewAdPlayCount(Integer.valueOf(this.f1062g));
                break;
            case "adthirdquartile":
            case "admidpoint":
            case "adfirstquartile":
            case "adbreakend":
                viewData.setViewAdBreakCount(Integer.valueOf(this.f1058c));
                viewData.setViewAdCompleteCount(Integer.valueOf(this.f1059d));
                viewData.setViewAdViewCount(Integer.valueOf(this.f1060e));
                viewData.setViewAdErrorCount(Integer.valueOf(this.f1061f));
                z = this.f1056a;
                if (z) {
                }
                z2 = this.f1057b;
                if (z2) {
                }
                viewData.setViewAdWatchTime(Long.valueOf(this.f1067l));
                viewData.setViewPrerollRequestCount(Long.valueOf(this.f1070o));
                viewData.setViewAdPlayCount(Integer.valueOf(this.f1062g));
                break;
            case "adrequest":
                if (this.f1064i == 0) {
                    this.f1064i = this.f1066k.now();
                }
                if (m1101a(viewData)) {
                    this.f1056a = true;
                    if (!this.f1074s) {
                        this.f1070o++;
                    }
                }
                long j = this.f1069n + 1;
                this.f1069n = j;
                viewData.setViewAdRequestCount(Long.valueOf(j));
                this.f1072q.add(Long.valueOf(this.f1066k.now()));
                viewData.setViewAdBreakCount(Integer.valueOf(this.f1058c));
                viewData.setViewAdCompleteCount(Integer.valueOf(this.f1059d));
                viewData.setViewAdViewCount(Integer.valueOf(this.f1060e));
                viewData.setViewAdErrorCount(Integer.valueOf(this.f1061f));
                z = this.f1056a;
                if (z) {
                }
                z2 = this.f1057b;
                if (z2) {
                }
                viewData.setViewAdWatchTime(Long.valueOf(this.f1067l));
                viewData.setViewPrerollRequestCount(Long.valueOf(this.f1070o));
                viewData.setViewAdPlayCount(Integer.valueOf(this.f1062g));
                break;
            case "adbreakstart":
                this.f1058c++;
                viewData.setViewAdBreakCount(Integer.valueOf(this.f1058c));
                viewData.setViewAdCompleteCount(Integer.valueOf(this.f1059d));
                viewData.setViewAdViewCount(Integer.valueOf(this.f1060e));
                viewData.setViewAdErrorCount(Integer.valueOf(this.f1061f));
                z = this.f1056a;
                if (z) {
                }
                z2 = this.f1057b;
                if (z2) {
                }
                viewData.setViewAdWatchTime(Long.valueOf(this.f1067l));
                viewData.setViewPrerollRequestCount(Long.valueOf(this.f1070o));
                viewData.setViewAdPlayCount(Integer.valueOf(this.f1062g));
                break;
            case "adresponse":
                if (this.f1072q.size() > 0) {
                    viewData.setViewAdRequestTime(Long.valueOf(this.f1066k.now() - this.f1072q.remove(0).longValue()));
                }
                viewData.setViewAdBreakCount(Integer.valueOf(this.f1058c));
                viewData.setViewAdCompleteCount(Integer.valueOf(this.f1059d));
                viewData.setViewAdViewCount(Integer.valueOf(this.f1060e));
                viewData.setViewAdErrorCount(Integer.valueOf(this.f1061f));
                z = this.f1056a;
                if (z) {
                }
                z2 = this.f1057b;
                if (z2) {
                }
                viewData.setViewAdWatchTime(Long.valueOf(this.f1067l));
                viewData.setViewPrerollRequestCount(Long.valueOf(this.f1070o));
                viewData.setViewAdPlayCount(Integer.valueOf(this.f1062g));
                break;
        }
    }
}
