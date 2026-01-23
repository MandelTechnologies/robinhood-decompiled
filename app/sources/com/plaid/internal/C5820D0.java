package com.plaid.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.singular.sdk.internal.Constants;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.plaid.internal.D0 */
/* loaded from: classes16.dex */
public final class C5820D0 {

    /* renamed from: a */
    public final Context f1315a;

    public C5820D0(Context context) {
        this.f1315a = context;
    }

    /* renamed from: a */
    public final C5811C0 m1170a(C5811C0 c5811c0) throws JSONException {
        String networkOperator;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.RequestParamsKeys.SDK_VERSION_KEY, 20901);
        jSONObject.put("accept", "json");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("device", jSONObject2);
        jSONObject2.put("os", "and");
        jSONObject2.put("ver", "" + Build.VERSION.SDK_INT);
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (!str2.startsWith(str)) {
            str2 = str + PlaceholderUtils.XXShortPlaceholderText + str2;
        }
        jSONObject2.put("model", str2);
        try {
            networkOperator = ((TelephonyManager) this.f1315a.getSystemService("phone")).getNetworkOperator();
        } catch (Exception unused) {
        }
        String[] strArr = !TextUtils.isEmpty(networkOperator) ? new String[]{networkOperator.substring(0, 3), networkOperator.substring(3)} : new String[0];
        if (strArr.length == 2) {
            jSONObject2.put("mcc", strArr[0]);
            jSONObject2.put("mnc", strArr[1]);
        }
        jSONObject2.put("ip", c5811c0.f1289a);
        if (c5811c0.f1290b != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("msg", C7059d7.m1492a(c5811c0.f1290b.getMessage()));
            Exception exc = c5811c0.f1290b;
            if (exc instanceof C7191r) {
                C7191r c7191r = (C7191r) exc;
                EnumC5954R6 enumC5954R6 = c7191r.f3144a;
                if (enumC5954R6 != null) {
                    jSONObject3.put("st", enumC5954R6.getCode());
                }
                if (c7191r.m1577a() != null) {
                    jSONObject3.put("er", c7191r.m1577a().getCode());
                }
            }
            jSONObject.put("error", jSONObject3);
        }
        return new C5811C0(c5811c0.f1289a, c5811c0.f1290b, Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 10));
    }
}
