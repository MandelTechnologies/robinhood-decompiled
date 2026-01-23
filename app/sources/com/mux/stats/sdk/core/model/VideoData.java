package com.mux.stats.sdk.core.model;

import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class VideoData extends BaseQueryData {
    public static final ArrayList<String> keys;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add("vpour");
        arrayList.add("vsobi");
        arrayList.add("vsofp");
        arrayList.add("vsodm");
        arrayList.add("vsodu");
        arrayList.add("vsoht");
        arrayList.add("vsohonm");
        arrayList.add("vsoisli");
        arrayList.add("vsomity");
        arrayList.add("vsour");
        arrayList.add("vsowd");
        arrayList.add("vhb");
        arrayList.add("vpthb");
        arrayList.add("vpttgdu");
        arrayList.add("vtgdu");
        arrayList.add("vtt");
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
        StringBuilder sb = new StringBuilder("VideoData: ");
        String str16 = "";
        if (getVideoPosterUrl() != null) {
            str = "\n    videoPosterUrl: " + getVideoPosterUrl();
        } else {
            str = "";
        }
        sb.append(str);
        if (getVideoSourceAdvertisedBitrate() != null) {
            str2 = "\n    videoSourceAdvertisedBitrate: " + getVideoSourceAdvertisedBitrate();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (getVideoSourceAdvertisedFramerate() != null) {
            str3 = "\n    videoSourceAdvertisedFramerate: " + getVideoSourceAdvertisedFramerate();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (getVideoSourceDomain() != null) {
            str4 = "\n    videoSourceDomain: " + getVideoSourceDomain();
        } else {
            str4 = "";
        }
        sb.append(str4);
        if (getVideoSourceDuration() != null) {
            str5 = "\n    videoSourceDuration: " + getVideoSourceDuration();
        } else {
            str5 = "";
        }
        sb.append(str5);
        if (getVideoSourceHeight() != null) {
            str6 = "\n    videoSourceHeight: " + getVideoSourceHeight();
        } else {
            str6 = "";
        }
        sb.append(str6);
        if (getVideoSourceHostName() != null) {
            str7 = "\n    videoSourceHostName: " + getVideoSourceHostName();
        } else {
            str7 = "";
        }
        sb.append(str7);
        if (getVideoSourceIsLive() != null) {
            str8 = "\n    videoSourceIsLive: " + getVideoSourceIsLive();
        } else {
            str8 = "";
        }
        sb.append(str8);
        if (getVideoSourceMimeType() != null) {
            str9 = "\n    videoSourceMimeType: " + getVideoSourceMimeType();
        } else {
            str9 = "";
        }
        sb.append(str9);
        if (getVideoSourceUrl() != null) {
            str10 = "\n    videoSourceUrl: " + getVideoSourceUrl();
        } else {
            str10 = "";
        }
        sb.append(str10);
        if (getVideoSourceWidth() != null) {
            str11 = "\n    videoSourceWidth: " + getVideoSourceWidth();
        } else {
            str11 = "";
        }
        sb.append(str11);
        if (getVideoHoldback() != null) {
            str12 = "\n    videoHoldback: " + getVideoHoldback();
        } else {
            str12 = "";
        }
        sb.append(str12);
        if (getVideoPartHoldback() != null) {
            str13 = "\n    videoPartHoldback: " + getVideoPartHoldback();
        } else {
            str13 = "";
        }
        sb.append(str13);
        if (getVideoPartTargetDuration() != null) {
            str14 = "\n    videoPartTargetDuration: " + getVideoPartTargetDuration();
        } else {
            str14 = "";
        }
        sb.append(str14);
        if (getVideoTargetDuration() != null) {
            str15 = "\n    videoTargetDuration: " + getVideoTargetDuration();
        } else {
            str15 = "";
        }
        sb.append(str15);
        if (getVideoSourceCodec() != null) {
            str16 = "\n    videoSourceCodec: " + getVideoSourceCodec();
        }
        sb.append(str16);
        return sb.toString();
    }

    public Long getVideoHoldback() throws JSONException {
        String str = get("vhb");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getVideoPartHoldback() throws JSONException {
        String str = get("vpthb");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getVideoPartTargetDuration() throws JSONException {
        String str = get("vpttgdu");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public String getVideoPosterUrl() {
        return get("vpour");
    }

    public Integer getVideoSourceAdvertisedBitrate() throws JSONException {
        String str = get("vsobi");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Float getVideoSourceAdvertisedFramerate() throws JSONException {
        String str = get("vsofp");
        if (str == null) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(str));
    }

    public String getVideoSourceCodec() {
        return get("vsocc");
    }

    public String getVideoSourceDomain() {
        return get("vsodm");
    }

    public Long getVideoSourceDuration() throws JSONException {
        String str = get("vsodu");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Integer getVideoSourceHeight() throws JSONException {
        String str = get("vsoht");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public String getVideoSourceHostName() {
        return get("vsohonm");
    }

    public String getVideoSourceIsLive() {
        return get("vsoisli");
    }

    public String getVideoSourceMimeType() {
        return get("vsomity");
    }

    public String getVideoSourceUrl() {
        return get("vsour");
    }

    public Integer getVideoSourceWidth() throws JSONException {
        String str = get("vsowd");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Long getVideoTargetDuration() throws JSONException {
        String str = get("vtgdu");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public void setVideoHoldback(Long l) throws JSONException {
        if (l != null) {
            put("vhb", l.toString());
        }
    }

    public void setVideoPartHoldback(Long l) throws JSONException {
        if (l != null) {
            put("vpthb", l.toString());
        }
    }

    public void setVideoPartTargetDuration(Long l) throws JSONException {
        if (l != null) {
            put("vpttgdu", l.toString());
        }
    }

    public void setVideoPosterUrl(String str) throws JSONException {
        if (str != null) {
            put("vpour", str);
        }
    }

    public void setVideoSourceAdvertisedBitrate(Integer num) throws JSONException {
        if (num != null) {
            put("vsobi", num.toString());
        }
    }

    public void setVideoSourceAdvertisedFramerate(Float f) throws JSONException {
        if (f != null) {
            put("vsofp", f.toString());
        }
    }

    public void setVideoSourceCodec(String str) throws JSONException {
        if (str != null) {
            put("vsocc", str);
        }
    }

    public void setVideoSourceDomain(String str) throws JSONException {
        if (str != null) {
            put("vsodm", str);
        }
    }

    public void setVideoSourceDuration(Long l) throws JSONException {
        if (l != null) {
            put("vsodu", l.toString());
        }
    }

    public void setVideoSourceHeight(Integer num) throws JSONException {
        if (num != null) {
            put("vsoht", num.toString());
        }
    }

    public void setVideoSourceMimeType(String str) throws JSONException {
        if (str != null) {
            put("vsomity", str);
        }
    }

    public void setVideoSourceUrl(String str) throws JSONException {
        if (str != null) {
            put("vsour", str);
        }
    }

    public void setVideoSourceWidth(Integer num) throws JSONException {
        if (num != null) {
            put("vsowd", num.toString());
        }
    }

    public void setVideoTargetDuration(Long l) throws JSONException {
        if (l != null) {
            put("vtgdu", l.toString());
        }
    }

    public void setVideoTitle(String str) throws JSONException {
        if (str != null) {
            put("vtt", str);
        }
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }
}
