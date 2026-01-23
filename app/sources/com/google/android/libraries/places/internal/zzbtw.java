package com.google.android.libraries.places.internal;

import com.adjust.sdk.Constants;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
final class zzbtw {
    private static final zzbwf zza;
    private static final zzbtt[] zzb;
    private static final Map zzc;

    static {
        zzbwe zzbweVar = zzbwf.zza;
        zza = zzbwe.zza(":");
        zzbtt zzbttVar = new zzbtt(zzbtt.zze, zzbwe.zza(""));
        zzbwf zzbwfVar = zzbtt.zzb;
        zzbtt zzbttVar2 = new zzbtt(zzbwfVar, zzbwe.zza("GET"));
        zzbtt zzbttVar3 = new zzbtt(zzbwfVar, zzbwe.zza("POST"));
        zzbwf zzbwfVar2 = zzbtt.zzc;
        zzbtt zzbttVar4 = new zzbtt(zzbwfVar2, zzbwe.zza("/"));
        zzbtt zzbttVar5 = new zzbtt(zzbwfVar2, zzbwe.zza("/index.html"));
        zzbwf zzbwfVar3 = zzbtt.zzd;
        zzbtt zzbttVar6 = new zzbtt(zzbwfVar3, zzbwe.zza("http"));
        zzbtt zzbttVar7 = new zzbtt(zzbwfVar3, zzbwe.zza(Constants.SCHEME));
        zzbwf zzbwfVar4 = zzbtt.zza;
        zzb = new zzbtt[]{zzbttVar, zzbttVar2, zzbttVar3, zzbttVar4, zzbttVar5, zzbttVar6, zzbttVar7, new zzbtt(zzbwfVar4, zzbwe.zza("200")), new zzbtt(zzbwfVar4, zzbwe.zza("204")), new zzbtt(zzbwfVar4, zzbwe.zza("206")), new zzbtt(zzbwfVar4, zzbwe.zza("304")), new zzbtt(zzbwfVar4, zzbwe.zza("400")), new zzbtt(zzbwfVar4, zzbwe.zza("404")), new zzbtt(zzbwfVar4, zzbwe.zza("500")), new zzbtt("accept-charset", ""), new zzbtt("accept-encoding", "gzip, deflate"), new zzbtt("accept-language", ""), new zzbtt("accept-ranges", ""), new zzbtt("accept", ""), new zzbtt("access-control-allow-origin", ""), new zzbtt("age", ""), new zzbtt("allow", ""), new zzbtt("authorization", ""), new zzbtt("cache-control", ""), new zzbtt("content-disposition", ""), new zzbtt("content-encoding", ""), new zzbtt("content-language", ""), new zzbtt("content-length", ""), new zzbtt("content-location", ""), new zzbtt("content-range", ""), new zzbtt("content-type", ""), new zzbtt("cookie", ""), new zzbtt(InquiryField.DateField.TYPE, ""), new zzbtt("etag", ""), new zzbtt("expect", ""), new zzbtt("expires", ""), new zzbtt("from", ""), new zzbtt("host", ""), new zzbtt("if-match", ""), new zzbtt("if-modified-since", ""), new zzbtt("if-none-match", ""), new zzbtt("if-range", ""), new zzbtt("if-unmodified-since", ""), new zzbtt("last-modified", ""), new zzbtt("link", ""), new zzbtt("location", ""), new zzbtt("max-forwards", ""), new zzbtt("proxy-authenticate", ""), new zzbtt("proxy-authorization", ""), new zzbtt("range", ""), new zzbtt("referer", ""), new zzbtt("refresh", ""), new zzbtt("retry-after", ""), new zzbtt("server", ""), new zzbtt("set-cookie", ""), new zzbtt("strict-transport-security", ""), new zzbtt("transfer-encoding", ""), new zzbtt("user-agent", ""), new zzbtt("vary", ""), new zzbtt("via", ""), new zzbtt("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        int i = 0;
        while (true) {
            zzbtt[] zzbttVarArr = zzb;
            int length = zzbttVarArr.length;
            if (i >= 61) {
                zzc = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(zzbttVarArr[i].zzh)) {
                    linkedHashMap.put(zzbttVarArr[i].zzh, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    static /* bridge */ /* synthetic */ zzbwf zzc(zzbwf zzbwfVar) throws IOException {
        int iZzc = zzbwfVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            byte bZza = zzbwfVar.zza(i);
            if (bZza >= 65 && bZza <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(zzbwfVar.zzf()));
            }
        }
        return zzbwfVar;
    }
}
