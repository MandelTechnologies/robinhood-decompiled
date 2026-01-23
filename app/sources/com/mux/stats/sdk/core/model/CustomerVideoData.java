package com.mux.stats.sdk.core.model;

import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class CustomerVideoData extends BaseQueryData {
    public static final ArrayList<String> keys;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add("vdn");
        arrayList.add("vctty");
        arrayList.add("vdu");
        arrayList.add("vecva");
        arrayList.add("vid");
        arrayList.add("visli");
        arrayList.add("vlacd");
        arrayList.add("vpd");
        arrayList.add("vsr");
        arrayList.add("vsmty");
        arrayList.add("vtt");
        arrayList.add("vvaid");
        arrayList.add("vvanm");
        arrayList.add("vsour");
        arrayList.add("viep");
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
        StringBuilder sb = new StringBuilder("CustomerVideoData: ");
        String str14 = "";
        if (getVideoCdn() != null) {
            str = "\n    videoCdn: " + getVideoCdn();
        } else {
            str = "";
        }
        sb.append(str);
        if (getVideoContentType() != null) {
            str2 = "\n    videoContentType: " + getVideoContentType();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (getVideoDuration() != null) {
            str3 = "\n    videoDuration: " + getVideoDuration();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (getVideoEncodingVariant() != null) {
            str4 = "\n    videoEncodingVariant: " + getVideoEncodingVariant();
        } else {
            str4 = "";
        }
        sb.append(str4);
        if (getVideoIsLive() != null) {
            str5 = "\n    videoIsLive: " + getVideoIsLive();
        } else {
            str5 = "";
        }
        sb.append(str5);
        if (getVideoLanguageCode() != null) {
            str6 = "\n    videoLanguageCode: " + getVideoLanguageCode();
        } else {
            str6 = "";
        }
        sb.append(str6);
        if (getVideoProducer() != null) {
            str7 = "\n    videoProducer: " + getVideoProducer();
        } else {
            str7 = "";
        }
        sb.append(str7);
        if (getVideoSeries() != null) {
            str8 = "\n    videoSeries: " + getVideoSeries();
        } else {
            str8 = "";
        }
        sb.append(str8);
        if (getVideoStreamType() != null) {
            str9 = "\n    videoStreamType: " + getVideoStreamType();
        } else {
            str9 = "";
        }
        sb.append(str9);
        if (getVideoTitle() != null) {
            str10 = "\n    videoTitle: " + getVideoTitle();
        } else {
            str10 = "";
        }
        sb.append(str10);
        if (getVideoVariantId() != null) {
            str11 = "\n    videoVariantId: " + getVideoVariantId();
        } else {
            str11 = "";
        }
        sb.append(str11);
        if (getVideoVariantName() != null) {
            str12 = "\n    videoVariantName: " + getVideoVariantName();
        } else {
            str12 = "";
        }
        sb.append(str12);
        if (getVideoSourceUrl() != null) {
            str13 = "\n    videoSourceUrl: " + getVideoSourceUrl();
        } else {
            str13 = "";
        }
        sb.append(str13);
        if (getVideoExperiments() != null) {
            str14 = "\n    videoExperiments: " + getVideoExperiments();
        }
        sb.append(str14);
        return sb.toString();
    }

    public String getVideoCdn() {
        return get("vdn");
    }

    public String getVideoContentType() {
        return get("vctty");
    }

    public Long getVideoDuration() throws JSONException {
        String str = get("vdu");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public String getVideoEncodingVariant() {
        return get("vecva");
    }

    public String getVideoExperiments() {
        return get("viep");
    }

    public Boolean getVideoIsLive() throws JSONException {
        String str = get("visli");
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public String getVideoLanguageCode() {
        return get("vlacd");
    }

    public String getVideoProducer() {
        return get("vpd");
    }

    public String getVideoSeries() {
        return get("vsr");
    }

    public String getVideoSourceUrl() {
        return get("vsour");
    }

    public String getVideoStreamType() {
        return get("vsmty");
    }

    public String getVideoTitle() {
        return get("vtt");
    }

    public String getVideoVariantId() {
        return get("vvaid");
    }

    public String getVideoVariantName() {
        return get("vvanm");
    }

    public void setVideoId(String str) throws JSONException {
        if (str != null) {
            put("vid", str);
        }
    }

    public void setVideoSourceUrl(String str) throws JSONException {
        if (str != null) {
            put("vsour", str);
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
