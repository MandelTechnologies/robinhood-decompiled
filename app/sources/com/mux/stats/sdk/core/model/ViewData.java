package com.mux.stats.sdk.core.model;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes27.dex */
public class ViewData extends BaseQueryData {
    public static final ArrayList<String> keys;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add("xrqco");
        arrayList.add("xrqfbco");
        arrayList.add("xrqcbco");
        arrayList.add("xadbrco");
        arrayList.add("xadcpco");
        arrayList.add("xaderco");
        arrayList.add("xadvwco");
        arrayList.add("xadplco");
        arrayList.add("xadvwwati");
        arrayList.add("xadrqco");
        arrayList.add("xadrqti");
        arrayList.add("xplrqco");
        arrayList.add("xpladid");
        arrayList.add("xplcrid");
        arrayList.add("xplrd");
        arrayList.add("xplpf");
        arrayList.add("xplrqti");
        arrayList.add("xsuplrqti");
        arrayList.add("xplloti");
        arrayList.add("xsuplloti");
        arrayList.add("xpladtahn");
        arrayList.add("xpladtadm");
        arrayList.add("xpladashn");
        arrayList.add("xpladasdm");
        arrayList.add("xen");
        arrayList.add("xid");
        arrayList.add("xmadope");
        arrayList.add("xmaskti");
        arrayList.add("xmauppe");
        arrayList.add("xmltitofiad");
        arrayList.add("xpevd");
        arrayList.add("xreco");
        arrayList.add("xredu");
        arrayList.add("xrefq");
        arrayList.add("xrepe");
        arrayList.add("xskco");
        arrayList.add("xskdu");
        arrayList.add("xsqno");
        arrayList.add("xst");
        arrayList.add("xtitofifr");
        arrayList.add("xtitopl");
        arrayList.add("xctpbti");
        arrayList.add("xtlctpbti");
        arrayList.add("xtldg");
        arrayList.add("xtlug");
        arrayList.add("xwtreco");
        arrayList.add("xwtredu");
        arrayList.add("xwati");
        arrayList.add("uti");
        arrayList.add("xmmrqth");
        arrayList.add("xavrqth");
        arrayList.add("xmarqlt");
        arrayList.add("xavrqlt");
        arrayList.add("xdvor");
        arrayList.add("xdrfrco");
        arrayList.add("xpgch");
        arrayList.add("xmaphps");
        arrayList.add("xdrty");
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
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
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        StringBuilder sb = new StringBuilder("viewData: ");
        String str54 = "";
        if (getViewRequestCount() != null) {
            str = "\n    viewRequestCount: " + getViewRequestCount();
        } else {
            str = "";
        }
        sb.append(str);
        if (getViewAdBreakCount() != null) {
            str2 = "\n    viewAdBreakCount: " + getViewAdBreakCount();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (getViewAdCompleteCount() != null) {
            str3 = "\n    viewAdCompleteCount: " + getViewAdCompleteCount();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (getViewAdErrorCount() != null) {
            str4 = "\n    viewAdErrorCount: " + getViewAdErrorCount();
        } else {
            str4 = "";
        }
        sb.append(str4);
        if (getViewAdViewCount() != null) {
            str5 = "\n    viewAdViewCount: " + getViewAdViewCount();
        } else {
            str5 = "";
        }
        sb.append(str5);
        if (getViewAdPlayCount() != null) {
            str6 = "\n    viewAdPlayCount: " + getViewAdPlayCount();
        } else {
            str6 = "";
        }
        sb.append(str6);
        if (getViewAdWatchTime() != null) {
            str7 = "\n    viewAdWatchTime: " + getViewAdWatchTime();
        } else {
            str7 = "";
        }
        sb.append(str7);
        if (getViewAdRequestCount() != null) {
            str8 = "\n    viewAdRequestCount: " + getViewAdRequestCount();
        } else {
            str8 = "";
        }
        sb.append(str8);
        if (getViewAdRequestTime() != null) {
            str9 = "\n    viewAdRequestTime: " + getViewAdRequestTime();
        } else {
            str9 = "";
        }
        sb.append(str9);
        if (getViewPrerollRequestCount() != null) {
            str10 = "\n    viewPrerollRequestCount: " + getViewPrerollRequestCount();
        } else {
            str10 = "";
        }
        sb.append(str10);
        if (getViewEnd() != null) {
            str11 = "\n    viewEnd: " + getViewEnd();
        } else {
            str11 = "";
        }
        sb.append(str11);
        if (getViewId() != null) {
            str12 = "\n    viewId: " + getViewId();
        } else {
            str12 = "";
        }
        sb.append(str12);
        if (getViewMaxDownscalePercentage() != null) {
            str13 = "\n    viewMaxDownscalePercentage: " + getViewMaxDownscalePercentage();
        } else {
            str13 = "";
        }
        sb.append(str13);
        if (getViewMaxSeekTime() != null) {
            str14 = "\n    viewMaxSeekTime: " + getViewMaxSeekTime();
        } else {
            str14 = "";
        }
        sb.append(str14);
        if (getViewMaxUpscalePercentage() != null) {
            str15 = "\n    viewMaxUpscalePercentage: " + getViewMaxUpscalePercentage();
        } else {
            str15 = "";
        }
        sb.append(str15);
        if (getViewMidrollTimeToFirstAd() != null) {
            str16 = "\n    viewMidrollTimeToFirstAd: " + getViewMidrollTimeToFirstAd();
        } else {
            str16 = "";
        }
        sb.append(str16);
        if (getViewPercentageViewed() != null) {
            str17 = "\n    viewPercentageViewed: " + getViewPercentageViewed();
        } else {
            str17 = "";
        }
        sb.append(str17);
        if (getViewRebufferCount() != null) {
            str18 = "\n    viewRebufferCount: " + getViewRebufferCount();
        } else {
            str18 = "";
        }
        sb.append(str18);
        if (getViewRebufferDuration() != null) {
            str19 = "\n    viewRebufferDuration: " + getViewRebufferDuration();
        } else {
            str19 = "";
        }
        sb.append(str19);
        if (getViewRebufferFrequency() != null) {
            str20 = "\n    viewRebufferFrequency: " + getViewRebufferFrequency();
        } else {
            str20 = "";
        }
        sb.append(str20);
        if (getViewRebufferPercentage() != null) {
            str21 = "\n    viewRebufferPercentage: " + getViewRebufferPercentage();
        } else {
            str21 = "";
        }
        sb.append(str21);
        if (getViewSeekCount() != null) {
            str22 = "\n    viewSeekCount: " + getViewSeekCount();
        } else {
            str22 = "";
        }
        sb.append(str22);
        if (getViewSeekDuration() != null) {
            str23 = "\n    viewSeekDuration: " + getViewSeekDuration();
        } else {
            str23 = "";
        }
        sb.append(str23);
        if (getViewSequenceNumber() != null) {
            str24 = "\n    viewSequenceNumber: " + getViewSequenceNumber();
        } else {
            str24 = "";
        }
        sb.append(str24);
        if (getViewStart() != null) {
            str25 = "\n    viewStart: " + getViewStart();
        } else {
            str25 = "";
        }
        sb.append(str25);
        if (getViewTimeToFirstFrame() != null) {
            str26 = "\n    viewTimeToFirstFrame: " + getViewTimeToFirstFrame();
        } else {
            str26 = "";
        }
        sb.append(str26);
        if (getViewTimeToPreroll() != null) {
            str27 = "\n    viewTimeToPreroll: " + getViewTimeToPreroll();
        } else {
            str27 = "";
        }
        sb.append(str27);
        if (getViewTotalContentPlaybackTime() != null) {
            str28 = "\n    viewTotalContentPlaybackTime: " + getViewTotalContentPlaybackTime();
        } else {
            str28 = "";
        }
        sb.append(str28);
        if (getViewTotalDownscaling() != null) {
            str29 = "\n    viewTotalDownscaling: " + getViewTotalDownscaling();
        } else {
            str29 = "";
        }
        sb.append(str29);
        if (getViewTotalUpscaling() != null) {
            str30 = "\n    viewTotalUpscaling: " + getViewTotalUpscaling();
        } else {
            str30 = "";
        }
        sb.append(str30);
        if (getViewWaitingRebufferCount() != null) {
            str31 = "\n    viewWaitingRebufferCount: " + getViewWaitingRebufferCount();
        } else {
            str31 = "";
        }
        sb.append(str31);
        if (getViewWaitingRebufferDuration() != null) {
            str32 = "\n    viewWaitingRebufferDuration: " + getViewWaitingRebufferDuration();
        } else {
            str32 = "";
        }
        sb.append(str32);
        if (getViewWatchTime() != null) {
            str33 = "\n    viewWatchTime: " + getViewWatchTime();
        } else {
            str33 = "";
        }
        sb.append(str33);
        if (getViewerTime() != null) {
            str34 = "\n    viewerTime: " + getViewerTime();
        } else {
            str34 = "";
        }
        sb.append(str34);
        if (getViewMinRequestThroughput() != null) {
            str35 = "\n    viewMinRequestThroughput: " + getViewMinRequestThroughput();
        } else {
            str35 = "";
        }
        sb.append(str35);
        if (getViewAverageRequestThroughput() != null) {
            str36 = "\n    viewAverageRequestThroughput: " + getViewAverageRequestThroughput();
        } else {
            str36 = "";
        }
        sb.append(str36);
        if (getViewMaxRequestLatency() != null) {
            str37 = "\n    viewMaxRequestLatency: " + getViewMaxRequestLatency();
        } else {
            str37 = "";
        }
        sb.append(str37);
        if (getViewAverageRequestLatency() != null) {
            str38 = "\n    viewAverageRequestLatency: " + getViewAverageRequestLatency();
        } else {
            str38 = "";
        }
        sb.append(str38);
        if (getViewPrerollAdId() != null) {
            str39 = "\n    viewPrerollAdId: " + getViewPrerollAdId();
        } else {
            str39 = "";
        }
        sb.append(str39);
        if (getViewPrerollCreativeId() != null) {
            str40 = "\n    viewPrerollCreativeId: " + getViewPrerollCreativeId();
        } else {
            str40 = "";
        }
        sb.append(str40);
        if (getViewPrerollRequested() != null) {
            str41 = "\n    viewPrerollRequested: " + getViewPrerollRequested();
        } else {
            str41 = "";
        }
        sb.append(str41);
        if (getViewPrerollPlayed() != null) {
            str42 = "\n    viewPrerollPlayed: " + getViewPrerollPlayed();
        } else {
            str42 = "";
        }
        sb.append(str42);
        if (getViewPrerollRequestTime() != null) {
            str43 = "\n    viewPrerollRequestTime: " + getViewPrerollRequestTime();
        } else {
            str43 = "";
        }
        sb.append(str43);
        if (getViewStartupPrerollRequestTime() != null) {
            str44 = "\n    viewStartupPrerollRequestTime: " + getViewStartupPrerollRequestTime();
        } else {
            str44 = "";
        }
        sb.append(str44);
        if (getViewPrerollLoadTime() != null) {
            str45 = "\n    viewPrerollLoadTime: " + getViewPrerollLoadTime();
        } else {
            str45 = "";
        }
        sb.append(str45);
        if (getViewStartupPrerollLoadTime() != null) {
            str46 = "\n    viewStartupPrerollLoadTime: " + getViewStartupPrerollLoadTime();
        } else {
            str46 = "";
        }
        sb.append(str46);
        if (getPrerollAdTagHostname() != null) {
            str47 = "\n    prerollAdTagHostname: " + getPrerollAdTagHostname();
        } else {
            str47 = "";
        }
        sb.append(str47);
        if (getViewPrerollAdTagDomain() != null) {
            str48 = "\n    viewPrerollAdTagDomain: " + getViewPrerollAdTagDomain();
        } else {
            str48 = "";
        }
        sb.append(str48);
        if (getPrerollAdAssetHostname() != null) {
            str49 = "\n    prerollAdAssetHostname: " + getPrerollAdAssetHostname();
        } else {
            str49 = "";
        }
        sb.append(str49);
        if (getViewPrerollAdAssetDomain() != null) {
            str50 = "\n    viewPrerollAdAssetDomain: " + getViewPrerollAdAssetDomain();
        } else {
            str50 = "";
        }
        sb.append(str50);
        if (getViewMaxPlayheadPosition() != null) {
            str51 = "\n    viewMaxPlayheadPosition: " + getViewMaxPlayheadPosition();
        } else {
            str51 = "";
        }
        sb.append(str51);
        if (getViewDroppedFrames() != null) {
            str52 = "\n    viewDroppedFrames: " + getViewDroppedFrames();
        } else {
            str52 = "";
        }
        sb.append(str52);
        if (getViewOrientationData() == null) {
            str53 = "";
        } else {
            str53 = "\n    " + getViewOrientationData().getDebugString();
        }
        sb.append(str53);
        if (getViewProgramChanged() != null) {
            str54 = "\n    isProgramChange: " + getViewProgramChanged();
        }
        sb.append(str54);
        return sb.toString();
    }

    public String getPrerollAdAssetHostname() {
        return get("xpladashn");
    }

    public String getPrerollAdTagHostname() {
        return get("xpladtahn");
    }

    public Integer getViewAdBreakCount() throws JSONException {
        String str = get("xadbrco");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Integer getViewAdCompleteCount() throws JSONException {
        String str = get("xadcpco");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Integer getViewAdErrorCount() throws JSONException {
        String str = get("xaderco");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Integer getViewAdPlayCount() throws JSONException {
        String str = get("xadplco");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Long getViewAdRequestCount() throws JSONException {
        String str = get("xadrqco");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewAdRequestTime() throws JSONException {
        String str = get("xadrqti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Integer getViewAdViewCount() throws JSONException {
        String str = get("xadvwco");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Long getViewAdWatchTime() throws JSONException {
        String str = get("xadvwwati");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Double getViewAverageRequestLatency() throws JSONException {
        String str = get("xavrqlt");
        if (str == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    public Long getViewAverageRequestThroughput() throws JSONException {
        String str = get("xavrqth");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewContentPlaybackTime() throws JSONException {
        String str = get("xctpbti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewDroppedFrames() throws JSONException {
        String str = get("xdrfrco");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewEnd() throws JSONException {
        String str = get("xen");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public String getViewId() {
        return get("xid");
    }

    public Double getViewMaxDownscalePercentage() throws JSONException {
        String str = get("xmadope");
        if (str == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    public Long getViewMaxPlayheadPosition() throws JSONException {
        String str = get("xmaphps");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Double getViewMaxRequestLatency() throws JSONException {
        String str = get("xmarqlt");
        if (str == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    public Long getViewMaxSeekTime() throws JSONException {
        String str = get("xmaskti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Double getViewMaxUpscalePercentage() throws JSONException {
        String str = get("xmauppe");
        if (str == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    public Long getViewMidrollTimeToFirstAd() throws JSONException {
        String str = get("xmltitofiad");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewMinRequestThroughput() throws JSONException {
        String str = get("xmmrqth");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public ViewDeviceOrientationData getViewOrientationData() throws JSONException {
        String str = get("xdvor");
        if (str == null) {
            return null;
        }
        try {
            return new ViewDeviceOrientationData(new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public Integer getViewPercentageViewed() throws JSONException {
        String str = get("xpevd");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public String getViewPrerollAdAssetDomain() {
        return get("xpladasdm");
    }

    public String getViewPrerollAdId() {
        return get("xpladid");
    }

    public String getViewPrerollAdTagDomain() {
        return get("xpladtadm");
    }

    public String getViewPrerollCreativeId() {
        return get("xplcrid");
    }

    public Long getViewPrerollLoadTime() throws JSONException {
        String str = get("xplloti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Boolean getViewPrerollPlayed() throws JSONException {
        String str = get("xplpf");
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public Long getViewPrerollRequestCount() throws JSONException {
        String str = get("xplrqco");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewPrerollRequestTime() throws JSONException {
        String str = get("xplrqti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Boolean getViewPrerollRequested() throws JSONException {
        String str = get("xplrd");
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public Boolean getViewProgramChanged() throws JSONException {
        String str = get("xpgch");
        return Boolean.valueOf(str != null && Boolean.parseBoolean(str));
    }

    public Integer getViewRebufferCount() throws JSONException {
        String str = get("xreco");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Long getViewRebufferDuration() throws JSONException {
        String str = get("xredu");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Double getViewRebufferFrequency() throws JSONException {
        String str = get("xrefq");
        if (str == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    public Double getViewRebufferPercentage() throws JSONException {
        String str = get("xrepe");
        if (str == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    public Long getViewRequestCount() throws JSONException {
        String str = get("xrqco");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Integer getViewSeekCount() throws JSONException {
        String str = get("xskco");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Long getViewSeekDuration() throws JSONException {
        String str = get("xskdu");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Integer getViewSequenceNumber() throws JSONException {
        String str = get("xsqno");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Long getViewStart() throws JSONException {
        String str = get("xst");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewStartupPrerollLoadTime() throws JSONException {
        String str = get("xsuplloti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewStartupPrerollRequestTime() throws JSONException {
        String str = get("xsuplrqti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewTimeToFirstFrame() throws JSONException {
        String str = get("xtitofifr");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewTimeToPreroll() throws JSONException {
        String str = get("xtitopl");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewTotalContentPlaybackTime() throws JSONException {
        String str = get("xtlctpbti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Double getViewTotalDownscaling() throws JSONException {
        String str = get("xtldg");
        if (str == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    public Double getViewTotalUpscaling() throws JSONException {
        String str = get("xtlug");
        if (str == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    public Integer getViewWaitingRebufferCount() throws JSONException {
        String str = get("xwtreco");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Long getViewWaitingRebufferDuration() throws JSONException {
        String str = get("xwtredu");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewWatchTime() throws JSONException {
        String str = get("xwati");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getViewerTime() throws JSONException {
        String str = get("uti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public void setViewAdBreakCount(Integer num) throws JSONException {
        if (num != null) {
            put("xadbrco", num.toString());
        }
    }

    public void setViewAdCompleteCount(Integer num) throws JSONException {
        if (num != null) {
            put("xadcpco", num.toString());
        }
    }

    public void setViewAdErrorCount(Integer num) throws JSONException {
        if (num != null) {
            put("xaderco", num.toString());
        }
    }

    public void setViewAdPlayCount(Integer num) throws JSONException {
        if (num != null) {
            put("xadplco", num.toString());
        }
    }

    public void setViewAdRequestCount(Long l) throws JSONException {
        if (l != null) {
            put("xadrqco", l.toString());
        }
    }

    public void setViewAdRequestTime(Long l) throws JSONException {
        if (l != null) {
            put("xadrqti", l.toString());
        }
    }

    public void setViewAdViewCount(Integer num) throws JSONException {
        if (num != null) {
            put("xadvwco", num.toString());
        }
    }

    public void setViewAdWatchTime(Long l) throws JSONException {
        if (l != null) {
            put("xadvwwati", l.toString());
        }
    }

    public void setViewAverageRequestLatency(Double d) throws JSONException {
        if (d != null) {
            put("xavrqlt", d.toString());
        }
    }

    public void setViewAverageRequestThroughput(Long l) throws JSONException {
        if (l != null) {
            put("xavrqth", l.toString());
        }
    }

    public void setViewContentPlaybackTime(Long l) throws JSONException {
        if (l != null) {
            put("xctpbti", l.toString());
        }
    }

    public void setViewDroppedFrames(Long l) throws JSONException {
        if (l != null) {
            put("xdrfrco", l.toString());
        }
    }

    public void setViewId(String str) throws JSONException {
        if (str != null) {
            put("xid", str);
        }
    }

    public void setViewMaxDownscalePercentage(Double d) throws JSONException {
        if (d != null) {
            put("xmadope", d.toString());
        }
    }

    public void setViewMaxPlayheadPosition(Long l) throws JSONException {
        if (l != null) {
            put("xmaphps", l.toString());
        }
    }

    public void setViewMaxRequestLatency(Double d) throws JSONException {
        if (d != null) {
            put("xmarqlt", d.toString());
        }
    }

    public void setViewMaxSeekTime(Long l) throws JSONException {
        if (l != null) {
            put("xmaskti", l.toString());
        }
    }

    public void setViewMaxUpscalePercentage(Double d) throws JSONException {
        if (d != null) {
            put("xmauppe", d.toString());
        }
    }

    public void setViewMinRequestThroughput(Long l) throws JSONException {
        if (l != null) {
            put("xmmrqth", l.toString());
        }
    }

    public void setViewOrientationData(ViewDeviceOrientationData viewDeviceOrientationData) throws JSONException {
        if (viewDeviceOrientationData != null) {
            put("xdvor", viewDeviceOrientationData.toJsonString());
        }
    }

    public void setViewPrerollLoadTime(Long l) throws JSONException {
        if (l != null) {
            put("xplloti", l.toString());
        }
    }

    public void setViewPrerollPlayed(Boolean bool) throws JSONException {
        if (bool != null) {
            put("xplpf", bool.toString());
        }
    }

    public void setViewPrerollRequestCount(Long l) throws JSONException {
        if (l != null) {
            put("xplrqco", l.toString());
        }
    }

    public void setViewPrerollRequestTime(Long l) throws JSONException {
        if (l != null) {
            put("xplrqti", l.toString());
        }
    }

    public void setViewPrerollRequested(Boolean bool) throws JSONException {
        if (bool != null) {
            put("xplrd", bool.toString());
        }
    }

    public void setViewRebufferCount(Integer num) throws JSONException {
        if (num != null) {
            put("xreco", num.toString());
        }
    }

    public void setViewRebufferDuration(Long l) throws JSONException {
        if (l != null) {
            put("xredu", l.toString());
        }
    }

    public void setViewRebufferFrequency(Double d) throws JSONException {
        if (d != null) {
            put("xrefq", d.toString());
        }
    }

    public void setViewRebufferPercentage(Double d) throws JSONException {
        if (d != null) {
            put("xrepe", d.toString());
        }
    }

    public void setViewRequestCanceledCount(Long l) throws JSONException {
        if (l != null) {
            put("xrqcbco", l.toString());
        }
    }

    public void setViewRequestCount(Long l) throws JSONException {
        if (l != null) {
            put("xrqco", l.toString());
        }
    }

    public void setViewRequestFailedCount(Long l) throws JSONException {
        if (l != null) {
            put("xrqfbco", l.toString());
        }
    }

    public void setViewSeekCount(Integer num) throws JSONException {
        if (num != null) {
            put("xskco", num.toString());
        }
    }

    public void setViewSeekDuration(Long l) throws JSONException {
        if (l != null) {
            put("xskdu", l.toString());
        }
    }

    public void setViewSequenceNumber(Integer num) throws JSONException {
        if (num != null) {
            put("xsqno", num.toString());
        }
    }

    public void setViewStartupPrerollLoadTime(Long l) throws JSONException {
        if (l != null) {
            put("xsuplloti", l.toString());
        }
    }

    public void setViewStartupPrerollRequestTime(Long l) throws JSONException {
        if (l != null) {
            put("xsuplrqti", l.toString());
        }
    }

    public void setViewTimeToFirstFrame(Long l) throws JSONException {
        if (l != null) {
            put("xtitofifr", l.toString());
        }
    }

    public void setViewTotalContentPlaybackTime(Long l) throws JSONException {
        if (l != null) {
            put("xtlctpbti", l.toString());
        }
    }

    public void setViewTotalDownscaling(Double d) throws JSONException {
        if (d != null) {
            put("xtldg", d.toString());
        }
    }

    public void setViewTotalUpscaling(Double d) throws JSONException {
        if (d != null) {
            put("xtlug", d.toString());
        }
    }

    public void setViewWatchTime(Long l) throws JSONException {
        if (l != null) {
            put("xwati", l.toString());
        }
    }

    public void setViewerTime(Long l) throws JSONException {
        if (l != null) {
            put("uti", l.toString());
        }
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }
}
