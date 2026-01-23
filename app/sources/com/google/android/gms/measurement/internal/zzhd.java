package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzqp;
import com.singular.sdk.internal.Constants;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@23.0.0 */
/* loaded from: classes27.dex */
public final class zzhd {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzhd(zzhh zzhhVar, String str, Bundle bundle) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = new Bundle();
    }

    public final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzhh zzhhVar = this.zza;
        SharedPreferences.Editor editorEdit = zzhhVar.zzd().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constants.RequestParamsKeys.APP_NAME_KEY, str2);
                        zzqp.zza();
                        zzic zzicVar = zzhhVar.zzu;
                        if (zzicVar.zzc().zzp(null, zzfy.zzaQ)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", Constants.RequestParamsKeys.SESSION_ID_KEY);
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                zzicVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", Constants.RequestParamsKeys.SESSION_ID_KEY);
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                zzicVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        this.zza.zzu.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.zzd = bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c A[Catch: NumberFormatException | JSONException -> 0x0124, NumberFormatException | JSONException -> 0x0124, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x0124, blocks: (B:10:0x0027, B:44:0x0093, B:44:0x0093, B:45:0x00a4, B:45:0x00a4, B:47:0x00b5, B:47:0x00b5, B:49:0x00c7, B:49:0x00c7, B:50:0x00d0, B:50:0x00d0, B:51:0x00d4, B:51:0x00d4, B:53:0x00e5, B:53:0x00e5, B:55:0x00f7, B:55:0x00f7, B:56:0x0100, B:56:0x0100, B:57:0x0104, B:57:0x0104, B:58:0x0110, B:58:0x0110, B:59:0x011c, B:59:0x011c), top: B:71:0x0027, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zza() {
        char c;
        if (this.zzd == null) {
            zzhh zzhhVar = this.zza;
            String string2 = zzhhVar.zzd().getString(this.zzb, null);
            if (string2 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string2);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string3 = jSONObject.getString(Constants.RequestParamsKeys.APP_NAME_KEY);
                            String string4 = jSONObject.getString("t");
                            int iHashCode = string4.hashCode();
                            if (iHashCode == 100) {
                                if (string4.equals("d")) {
                                    c = 1;
                                }
                                if (c == 0) {
                                }
                            } else if (iHashCode == 108) {
                                if (string4.equals("l")) {
                                    c = 2;
                                }
                                if (c == 0) {
                                }
                            } else if (iHashCode == 115) {
                                if (string4.equals(Constants.RequestParamsKeys.SESSION_ID_KEY)) {
                                    c = 0;
                                }
                                if (c == 0) {
                                }
                            } else if (iHashCode != 3352) {
                                c = (iHashCode == 3445 && string4.equals("la")) ? (char) 4 : (char) 65535;
                                if (c == 0) {
                                    bundle.putString(string3, jSONObject.getString("v"));
                                } else if (c == 1) {
                                    bundle.putDouble(string3, Double.parseDouble(jSONObject.getString("v")));
                                } else if (c == 2) {
                                    bundle.putLong(string3, Long.parseLong(jSONObject.getString("v")));
                                } else if (c == 3) {
                                    zzqp.zza();
                                    if (zzhhVar.zzu.zzc().zzp(null, zzfy.zzaQ)) {
                                        JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                        int length = jSONArray2.length();
                                        int[] iArr = new int[length];
                                        for (int i2 = 0; i2 < length; i2++) {
                                            iArr[i2] = jSONArray2.optInt(i2);
                                        }
                                        bundle.putIntArray(string3, iArr);
                                    }
                                } else if (c != 4) {
                                    zzhhVar.zzu.zzaV().zzb().zzb("Unrecognized persisted bundle type. Type", string4);
                                } else {
                                    zzqp.zza();
                                    if (zzhhVar.zzu.zzc().zzp(null, zzfy.zzaQ)) {
                                        JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                        int length2 = jSONArray3.length();
                                        long[] jArr = new long[length2];
                                        for (int i3 = 0; i3 < length2; i3++) {
                                            jArr[i3] = jSONArray3.optLong(i3);
                                        }
                                        bundle.putLongArray(string3, jArr);
                                    }
                                }
                            } else {
                                if (string4.equals("ia")) {
                                    c = 3;
                                }
                                if (c == 0) {
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzu.zzaV().zzb().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    this.zza.zzu.zzaV().zzb().zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return new Bundle((Bundle) Preconditions.checkNotNull(this.zzd));
    }
}
