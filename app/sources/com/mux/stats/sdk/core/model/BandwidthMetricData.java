package com.mux.stats.sdk.core.model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes27.dex */
public class BandwidthMetricData extends BaseQueryData {
    public static final ArrayList<String> keys;

    public static class Rendition {
        public String attrs;
        public long bitrate;
        public String codec;
        public float fps;
        public int height;
        public String name;
        public int width;
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add("qeety");
        arrayList.add("qst");
        arrayList.add("qrpst");
        arrayList.add("qrpen");
        arrayList.add("qlt");
        arrayList.add("qth");
        arrayList.add("qbyld");
        arrayList.add("qty");
        arrayList.add("qrphe");
        arrayList.add("qhn");
        arrayList.add("qmddu");
        arrayList.add("qcule");
        arrayList.add("qmdstti");
        arrayList.add("qviwd");
        arrayList.add("qviht");
        arrayList.add("qer");
        arrayList.add("qur");
        arrayList.add("qerte");
        arrayList.add("qercd");
        arrayList.add("qlbbi");
        arrayList.add("qrfls");
        arrayList.add("qcb");
        arrayList.add("qid");
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
        StringBuilder sb = new StringBuilder("BandwidthMetricData: ");
        String str21 = "";
        if (getRequestEventType() != null) {
            str = "\n    requestEventType: " + getRequestEventType();
        } else {
            str = "";
        }
        sb.append(str);
        if (getRequestStart() != null) {
            str2 = "\n    requestStart: " + getRequestStart();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (getRequestResponseStart() != null) {
            str3 = "\n    requestResponseStart: " + getRequestResponseStart();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (getRequestResponseEnd() != null) {
            str4 = "\n    requestResponseEnd: " + getRequestResponseEnd();
        } else {
            str4 = "";
        }
        sb.append(str4);
        if (getRequestLatency() != null) {
            str5 = "\n    requestResponseLatency: " + getRequestLatency();
        } else {
            str5 = "";
        }
        sb.append(str5);
        if (getRequestThroughput() != null) {
            str6 = "\n    requestResponseThroughput: " + getRequestThroughput();
        } else {
            str6 = "";
        }
        sb.append(str6);
        if (getRequestBytesLoaded() != null) {
            str7 = "\n    requestBytesLoaded: " + getRequestBytesLoaded();
        } else {
            str7 = "";
        }
        sb.append(str7);
        if (getRequestType() != null) {
            str8 = "\n    requestType: " + getRequestType();
        } else {
            str8 = "";
        }
        sb.append(str8);
        if (getRequestResponseHeaders().keySet().size() > 0) {
            str9 = "\n    requestResponseHeaders: " + getRequestResponseHeaders().keySet();
        } else {
            str9 = "";
        }
        sb.append(str9);
        if (getRequestHostName() != null) {
            str10 = "\n    requestHostName: " + getRequestHostName();
        } else {
            str10 = "";
        }
        sb.append(str10);
        if (getRequestMediaDuration() != null) {
            str11 = "\n    requestMediaDuration: " + getRequestMediaDuration();
        } else {
            str11 = "";
        }
        sb.append(str11);
        if (getRequestCurrentLevel() != null) {
            str12 = "\n    requestCurrentLevel: " + getRequestCurrentLevel();
        } else {
            str12 = "";
        }
        sb.append(str12);
        if (getRequestMediaStartTime() != null) {
            str13 = "\n    requestMediaStartTime: " + getRequestMediaStartTime();
        } else {
            str13 = "";
        }
        sb.append(str13);
        if (getRequestVideoWidth() != null) {
            str14 = "\n    requestVideoWidth: " + getRequestVideoWidth();
        } else {
            str14 = "";
        }
        sb.append(str14);
        if (getRequestVideoHeight() != null) {
            str15 = "\n    requestVideoHeight: " + getRequestVideoHeight();
        } else {
            str15 = "";
        }
        sb.append(str15);
        if (getRequestError() != null) {
            str16 = "\n    requestError: " + getRequestError();
        } else {
            str16 = "";
        }
        sb.append(str16);
        if (getRequestErrorText() != null) {
            str17 = "\n    requestErrorText: " + getRequestErrorText();
        } else {
            str17 = "";
        }
        sb.append(str17);
        if (getRequestErrorCode() != null) {
            str18 = "\n    requestErrorCode: " + getRequestErrorCode();
        } else {
            str18 = "";
        }
        sb.append(str18);
        if (getRequestLabeledBitrate() != null) {
            str19 = "\n    requestLabeledBitrate: " + getRequestLabeledBitrate();
        } else {
            str19 = "";
        }
        sb.append(str19);
        if (getRequestRenditionLists() != null) {
            str20 = "\n    requestRenditionLists: " + getRequestRenditionLists();
        } else {
            str20 = "";
        }
        sb.append(str20);
        if (getRequestCancel() != null) {
            str21 = "\n    requestCancel: " + getRequestCancel();
        }
        sb.append(str21);
        return sb.toString();
    }

    public Long getRequestBytesLoaded() throws JSONException {
        String str = get("qbyld");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public String getRequestCancel() {
        return get("qcb");
    }

    public Integer getRequestCurrentLevel() throws JSONException {
        String str = get("qcule");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public String getRequestError() {
        return get("qer");
    }

    public Integer getRequestErrorCode() throws JSONException {
        String str = get("qercd");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public String getRequestErrorText() {
        return get("qerte");
    }

    public String getRequestEventType() {
        return get("qeety");
    }

    public String getRequestHostName() {
        return get("qhn");
    }

    public Integer getRequestLabeledBitrate() throws JSONException {
        String str = get("qlbbi");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Long getRequestLatency() throws JSONException {
        String str = get("qlt");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getRequestMediaDuration() throws JSONException {
        String str = get("qmddu");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getRequestMediaStartTime() throws JSONException {
        String str = get("qmdstti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public List<Rendition> getRequestRenditionLists() throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (this.query.has("qrfls")) {
            JSONArray jSONArray = new JSONObject(this.query.getJSONObject("qrfls").toString()).getJSONArray("media");
            for (int i = 0; jSONArray != null && i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                Rendition rendition = new Rendition();
                rendition.width = jSONObject.getInt("width");
                rendition.height = jSONObject.getInt("height");
                rendition.bitrate = jSONObject.getLong("bitrate");
                rendition.attrs = jSONObject.getString("attrs");
                arrayList.add(rendition);
            }
        }
        return arrayList;
    }

    public Long getRequestResponseEnd() throws JSONException {
        String str = get("qrpen");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Hashtable<String, String> getRequestResponseHeaders() throws JSONException {
        Hashtable<String, String> hashtable = new Hashtable<>();
        JSONObject jSONObject = this.query.getJSONObject("qrphe");
        if (jSONObject != null) {
            JSONArray jSONArrayNames = jSONObject.names();
            for (int i = 0; i < jSONArrayNames.length(); i++) {
                String str = (String) jSONArrayNames.get(i);
                hashtable.put(str, jSONObject.getString(str));
            }
        }
        return hashtable;
    }

    public Long getRequestResponseStart() throws JSONException {
        String str = get("qrpst");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getRequestStart() throws JSONException {
        String str = get("qst");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getRequestThroughput() throws JSONException {
        String str = get("qth");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public String getRequestType() {
        return get("qty");
    }

    public Integer getRequestVideoHeight() throws JSONException {
        String str = get("qviht");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Integer getRequestVideoWidth() throws JSONException {
        String str = get("qviwd");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public void setRequestBytesLoaded(Long l) throws JSONException {
        if (l != null) {
            put("qbyld", l.toString());
        }
    }

    public void setRequestCancel(String str) throws JSONException {
        if (str != null) {
            put("qcb", str);
        }
    }

    public void setRequestCurrentLevel(Integer num) throws JSONException {
        if (num != null) {
            put("qcule", num.toString());
        }
    }

    public void setRequestError(String str) throws JSONException {
        if (str != null) {
            put("qer", str);
        }
    }

    public void setRequestErrorCode(Integer num) throws JSONException {
        if (num != null) {
            put("qercd", num.toString());
        }
    }

    public void setRequestErrorText(String str) throws JSONException {
        if (str != null) {
            put("qerte", str);
        }
    }

    public void setRequestHostName(String str) throws JSONException {
        if (str != null) {
            put("qhn", str);
        }
    }

    public void setRequestId(String str) throws JSONException {
        if (str != null) {
            put("qid", str);
        }
    }

    public void setRequestLabeledBitrate(Integer num) throws JSONException {
        if (num != null) {
            put("qlbbi", num.toString());
        }
    }

    public void setRequestMediaDuration(Long l) throws JSONException {
        if (l != null) {
            put("qmddu", l.toString());
        }
    }

    public void setRequestMediaStartTime(Long l) throws JSONException {
        if (l != null) {
            put("qmdstti", l.toString());
        }
    }

    public void setRequestRenditionLists(List<Rendition> list) throws JSONException {
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            for (Rendition rendition : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", rendition.width);
                jSONObject2.put("height", rendition.height);
                jSONObject2.put("bitrate", rendition.bitrate);
                jSONObject2.put("attrs", rendition.attrs);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("media", jSONArray);
            this.query.put("qrfls", jSONObject);
        }
    }

    public void setRequestResponseEnd(Long l) throws JSONException {
        if (l != null) {
            put("qrpen", l.toString());
        }
    }

    public void setRequestResponseHeaders(Hashtable<String, String> hashtable) throws JSONException {
        if (hashtable != null) {
            JSONObject jSONObject = new JSONObject();
            for (String str : hashtable.keySet()) {
                jSONObject.put(str, hashtable.get(str));
            }
            this.query.put("qrphe", jSONObject);
        }
    }

    public void setRequestResponseStart(Long l) throws JSONException {
        if (l != null) {
            put("qrpst", l.toString());
        }
    }

    public void setRequestType(String str) throws JSONException {
        if (str != null) {
            put("qty", str);
        }
    }

    public void setRequestUrl(String str) throws JSONException {
        if (str != null) {
            put("qur", str);
        }
    }

    public void setRequestVideoHeight(Integer num) throws JSONException {
        if (num != null) {
            put("qviht", num.toString());
        }
    }

    public void setRequestVideoWidth(Integer num) throws JSONException {
        if (num != null) {
            put("qviwd", num.toString());
        }
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }
}
