package com.mux.stats.sdk.core.model;

import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class PlayerData extends BaseQueryData {
    public static final ArrayList<String> keys;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add("wloti");
        arrayList.add("wur");
        arrayList.add("pauon");
        arrayList.add("percd");
        arrayList.add("perme");
        arrayList.add("pht");
        arrayList.add("pinid");
        arrayList.add("pisfs");
        arrayList.add("pispa");
        arrayList.add("placd");
        arrayList.add("ploti");
        arrayList.add("pmxpinm");
        arrayList.add("pmxpive");
        arrayList.add("pphti");
        arrayList.add("ppron");
        arrayList.add("psqno");
        arrayList.add("pswnm");
        arrayList.add("pswve");
        arrayList.add("psuti");
        arrayList.add("pvwco");
        arrayList.add("pwd");
        arrayList.add("ppgti");
        arrayList.add("pmfnepgti");
        arrayList.add("percz");
        arrayList.add("persy");
        arrayList.add("perbzez");
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
        StringBuilder sb = new StringBuilder("PlayerData: ");
        String str25 = "";
        if (getPageLoadTime() != null) {
            str = "\n    pageLoadTime: " + getPageLoadTime();
        } else {
            str = "";
        }
        sb.append(str);
        if (getPageUrl() != null) {
            str2 = "\n    pageUrl: " + getPageUrl();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (getPlayerAutoplayOn() != null) {
            str3 = "\n    getPlayerAutoplayOn: " + getPlayerAutoplayOn();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (getPlayerErrorCode() != null) {
            str4 = "\n    playerErrorCode: " + getPlayerErrorCode();
        } else {
            str4 = "";
        }
        sb.append(str4);
        if (getPlayerErrorMessage() != null) {
            str5 = "\n    playerErrorMessage: " + getPlayerErrorMessage();
        } else {
            str5 = "";
        }
        sb.append(str5);
        if (getPlayerHeight() != null) {
            str6 = "\n    playerHeight: " + getPlayerHeight();
        } else {
            str6 = "";
        }
        sb.append(str6);
        if (getPlayerInstanceId() != null) {
            str7 = "\n    playerInstanceId: " + getPlayerInstanceId();
        } else {
            str7 = "";
        }
        sb.append(str7);
        if (getPlayerIsFullscreen() != null) {
            str8 = "\n    playerFullScreen: " + getPlayerIsFullscreen();
        } else {
            str8 = "";
        }
        sb.append(str8);
        if (getPlayerIsPaused() != null) {
            str9 = "\n    playerIsPaused: " + getPlayerIsPaused();
        } else {
            str9 = "";
        }
        sb.append(str9);
        if (getPlayerLanguageCode() != null) {
            str10 = "\n    playerLayoutCode: " + getPlayerLanguageCode();
        } else {
            str10 = "";
        }
        sb.append(str10);
        if (getPlayerLoadTime() != null) {
            str11 = "\n    playerLoadTime: " + getPlayerLoadTime();
        } else {
            str11 = "";
        }
        sb.append(str11);
        if (getPlayerMuxPluginName() != null) {
            str12 = "\n    playerMuxPluginName: " + getPlayerMuxPluginName();
        } else {
            str12 = "";
        }
        sb.append(str12);
        if (getPlayerMuxPluginVersion() != null) {
            str13 = "\n    playerMuxPluginVersion: " + getPlayerMuxPluginVersion();
        } else {
            str13 = "";
        }
        sb.append(str13);
        if (getPlayerPlayheadTime() != null) {
            str14 = "\n    playerPlayheadTime: " + getPlayerPlayheadTime();
        } else {
            str14 = "";
        }
        sb.append(str14);
        if (getPlayerPreloadOn() != null) {
            str15 = "\n    playerPreloadOn: " + getPlayerPreloadOn();
        } else {
            str15 = "";
        }
        sb.append(str15);
        if (getPlayerSequenceNumber() != null) {
            str16 = "\n    playerSequenceNumber: " + getPlayerSequenceNumber();
        } else {
            str16 = "";
        }
        sb.append(str16);
        if (getPlayerSoftwareName() != null) {
            str17 = "\n    playerSoftwareName: " + getPlayerSoftwareName();
        } else {
            str17 = "";
        }
        sb.append(str17);
        if (getPlayerSoftwareVersion() != null) {
            str18 = "\n    playerSoftwareVersion: " + getPlayerSoftwareVersion();
        } else {
            str18 = "";
        }
        sb.append(str18);
        if (getPlayerStartupTime() != null) {
            str19 = "\n    playerStartupTime: " + getPlayerStartupTime();
        } else {
            str19 = "";
        }
        sb.append(str19);
        if (getPlayerViewCount() != null) {
            str20 = "\n    playerViewCount: " + getPlayerViewCount();
        } else {
            str20 = "";
        }
        sb.append(str20);
        if (getPlayerWidth() != null) {
            str21 = "\n    playerWidth: " + getPlayerWidth();
        } else {
            str21 = "";
        }
        sb.append(str21);
        if (getPlayerProgramTime() != null) {
            str22 = "\n    playerProgramTime: " + getPlayerProgramTime();
        } else {
            str22 = "";
        }
        sb.append(str22);
        if (getPlayerManifestNewestProgramTime() != null) {
            str23 = "\n    playerManifestNewestProgramTime: " + getPlayerManifestNewestProgramTime();
        } else {
            str23 = "";
        }
        sb.append(str23);
        if (getPlayerErrorSeverity() != null) {
            str24 = "\n    playerErrorSeverity: " + getPlayerErrorSeverity();
        } else {
            str24 = "";
        }
        sb.append(str24);
        if (getPlayerErrorContext() != null) {
            str25 = "\n    playerErrorContext: " + getPlayerErrorContext();
        }
        sb.append(str25);
        return sb.toString();
    }

    public Long getPageLoadTime() throws JSONException {
        String str = get("wloti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public String getPageUrl() {
        return get("wur");
    }

    public String getPlayerAutoplayOn() {
        return get("pauon");
    }

    public String getPlayerErrorBusinessException() {
        return get("perbzez");
    }

    public String getPlayerErrorCode() {
        return get("percd");
    }

    public String getPlayerErrorContext() {
        return get("percz");
    }

    public String getPlayerErrorMessage() {
        return get("perme");
    }

    public String getPlayerErrorSeverity() {
        return get("persy");
    }

    public Integer getPlayerHeight() throws JSONException {
        String str = get("pht");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public String getPlayerInstanceId() {
        return get("pinid");
    }

    public String getPlayerIsFullscreen() {
        return get("pisfs");
    }

    public Boolean getPlayerIsPaused() throws JSONException {
        String str = get("pispa");
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public String getPlayerLanguageCode() {
        return get("placd");
    }

    public Long getPlayerLoadTime() throws JSONException {
        String str = get("ploti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Long getPlayerManifestNewestProgramTime() throws JSONException {
        String str = get("pmfnepgti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public String getPlayerMuxPluginName() {
        return get("pmxpinm");
    }

    public String getPlayerMuxPluginVersion() {
        return get("pmxpive");
    }

    public Long getPlayerPlayheadTime() throws JSONException {
        String str = get("pphti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public String getPlayerPreloadOn() {
        return get("ppron");
    }

    public Long getPlayerProgramTime() throws JSONException {
        String str = get("ppgti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Integer getPlayerSequenceNumber() throws JSONException {
        String str = get("psqno");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public String getPlayerSoftwareName() {
        return get("pswnm");
    }

    public String getPlayerSoftwareVersion() {
        return get("pswve");
    }

    public Long getPlayerStartupTime() throws JSONException {
        String str = get("psuti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public Integer getPlayerViewCount() throws JSONException {
        String str = get("pvwco");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Integer getPlayerWidth() throws JSONException {
        String str = get("pwd");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public void setPlayerErrorBusinessException(String str) throws JSONException {
        if (str != null) {
            super.put("perbzez", str);
        }
    }

    public void setPlayerErrorCode(String str) throws JSONException {
        put("percd", str);
    }

    public void setPlayerErrorContext(String str) throws JSONException {
        if (str != null) {
            super.put("percz", str);
        }
    }

    public void setPlayerErrorMessage(String str) throws JSONException {
        put("perme", str);
    }

    public void setPlayerErrorSeverity(String str) throws JSONException {
        if (str != null) {
            super.put("persy", str);
        }
    }

    public void setPlayerHeight(Integer num) throws JSONException {
        if (num != null) {
            put("pht", num.toString());
        }
    }

    public void setPlayerInstanceId(String str) throws JSONException {
        if (str != null) {
            put("pinid", str);
        }
    }

    public void setPlayerIsFullscreen(String str) throws JSONException {
        if (str != null) {
            put("pisfs", str);
        }
    }

    public void setPlayerIsPaused(Boolean bool) throws JSONException {
        if (bool != null) {
            put("pispa", bool.toString());
        }
    }

    public void setPlayerManifestNewestProgramTime(Long l) throws JSONException {
        if (l != null) {
            put("pmfnepgti", l.toString());
        }
    }

    public void setPlayerMuxPluginName(String str) throws JSONException {
        if (str != null) {
            put("pmxpinm", str);
        }
    }

    public void setPlayerMuxPluginVersion(String str) throws JSONException {
        if (str != null) {
            put("pmxpive", str);
        }
    }

    public void setPlayerPlayheadTime(Long l) throws JSONException {
        if (l != null) {
            put("pphti", l.toString());
        }
    }

    public void setPlayerProgramTime(Long l) throws JSONException {
        if (l != null) {
            put("ppgti", l.toString());
        }
    }

    public void setPlayerSequenceNumber(Integer num) throws JSONException {
        if (num != null) {
            put("psqno", num.toString());
        }
    }

    public void setPlayerSoftwareName(String str) throws JSONException {
        if (str != null) {
            put("pswnm", str);
        }
    }

    public void setPlayerSoftwareVersion(String str) throws JSONException {
        if (str != null) {
            put("pswve", str);
        }
    }

    public void setPlayerWidth(Integer num) throws JSONException {
        if (num != null) {
            put("pwd", num.toString());
        }
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }
}
