package io.branch.referral;

import android.content.Context;
import android.net.TrafficStats;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes21.dex */
class UniversalResourceAnalyser {
    private static UniversalResourceAnalyser instance;
    private static JSONObject skipURLFormats;
    private final JSONObject DEFAULT_SKIP_URL_LIST;
    private final ArrayList<String> acceptURLFormats;

    public static UniversalResourceAnalyser getInstance(Context context) {
        if (instance == null) {
            instance = new UniversalResourceAnalyser(context);
        }
        return instance;
    }

    private UniversalResourceAnalyser(Context context) {
        JSONObject jSONObject = new JSONObject();
        this.DEFAULT_SKIP_URL_LIST = jSONObject;
        try {
            jSONObject.putOpt("version", 0);
            JSONArray jSONArray = new JSONArray();
            jSONObject.putOpt("uri_skip_list", jSONArray);
            jSONArray.put("^fb\\d+:");
            jSONArray.put("^li\\d+:");
            jSONArray.put("^pdk\\d+:");
            jSONArray.put("^twitterkit-.*:");
            jSONArray.put("^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth");
            jSONArray.put("^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b");
            jSONArray.put("^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b");
        } catch (JSONException unused) {
        }
        skipURLFormats = retrieveSkipURLFormats(context);
        this.acceptURLFormats = new ArrayList<>();
    }

    private JSONObject retrieveSkipURLFormats(Context context) {
        PrefHelper prefHelper = PrefHelper.getInstance(context);
        JSONObject jSONObject = new JSONObject();
        String string2 = prefHelper.getString("skip_url_format_key");
        if (TextUtils.isEmpty(string2) || "bnc_no_value".equals(string2)) {
            return this.DEFAULT_SKIP_URL_LIST;
        }
        try {
            return new JSONObject(string2);
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    void checkAndUpdateSkipURLFormats(Context context) {
        try {
            new UrlSkipListUpdateTask(context).executeTask(new Void[0]);
        } catch (Throwable unused) {
        }
    }

    String getStrippedURL(String str) {
        String string2;
        try {
            JSONArray jSONArrayOptJSONArray = skipURLFormats.optJSONArray("uri_skip_list");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    try {
                        string2 = jSONArrayOptJSONArray.getString(i);
                    } catch (JSONException unused) {
                    }
                    if (Pattern.compile(string2).matcher(str).find()) {
                        break;
                    }
                }
                string2 = null;
            } else {
                string2 = null;
            }
            if (string2 == null) {
                if (this.acceptURLFormats.size() <= 0) {
                    return str;
                }
                Iterator<String> it = this.acceptURLFormats.iterator();
                while (it.hasNext()) {
                    if (str.matches(it.next())) {
                        return str;
                    }
                }
            }
            return string2;
        } catch (Exception unused2) {
            return str;
        }
    }

    private static class UrlSkipListUpdateTask extends BranchAsyncTask<Void, Void, JSONObject> {
        private final int TIME_OUT;
        private final PrefHelper prefHelper;

        private UrlSkipListUpdateTask(Context context) {
            this.TIME_OUT = 1500;
            this.prefHelper = PrefHelper.getInstance(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public JSONObject doInBackground(Void... voidArr) {
            TrafficStats.setThreadStatsTag(0);
            JSONObject jSONObject = new JSONObject();
            HttpsURLConnection httpsURLConnection = null;
            try {
                HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL("%sdk/uriskiplist_v#.json".replace("%", PrefHelper.getCDNBaseUrl()).replace("#", Integer.toString(UniversalResourceAnalyser.skipURLFormats.optInt("version") + 1))).openConnection();
                try {
                    httpsURLConnection2.setConnectTimeout(1500);
                    httpsURLConnection2.setReadTimeout(1500);
                    if (httpsURLConnection2.getResponseCode() == 200 && httpsURLConnection2.getInputStream() != null) {
                        jSONObject = new JSONObject(new BufferedReader(new InputStreamReader(httpsURLConnection2.getInputStream())).readLine());
                    }
                    httpsURLConnection2.disconnect();
                    return jSONObject;
                } catch (Throwable unused) {
                    httpsURLConnection = httpsURLConnection2;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    return jSONObject;
                }
            } catch (Throwable unused2) {
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(JSONObject jSONObject) {
            super.onPostExecute((UrlSkipListUpdateTask) jSONObject);
            if (jSONObject.optInt("version") > UniversalResourceAnalyser.skipURLFormats.optInt("version")) {
                JSONObject unused = UniversalResourceAnalyser.skipURLFormats = jSONObject;
                this.prefHelper.setString("skip_url_format_key", UniversalResourceAnalyser.skipURLFormats.toString());
            }
        }
    }
}
