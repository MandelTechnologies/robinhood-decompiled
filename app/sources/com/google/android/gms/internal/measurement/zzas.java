package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-measurement@@23.0.0 */
/* loaded from: classes27.dex */
public final class zzas implements Iterable, zzao {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzar(this);
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    final /* synthetic */ String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123, types: [int] */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, java.lang.String] */
    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c;
        int i;
        String strZzc;
        int i2;
        int i3;
        boolean z;
        zzg zzgVar2;
        int iZzi;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                if (str.equals(str4)) {
                    c = 2;
                    break;
                } else {
                    c = 65535;
                    break;
                }
            case -1776922004:
                str5 = "charAt";
                str6 = "toString";
                if (str.equals(str6)) {
                    c = 14;
                    str4 = str2;
                    break;
                } else {
                    str4 = str2;
                    c = 65535;
                    break;
                }
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c = '\f';
                    str4 = str2;
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str6 = "toString";
                c = 65535;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    str6 = "toString";
                    c = 0;
                    break;
                }
                str4 = str2;
                str6 = "toString";
                c = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    c = 1;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = '\r';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case -906336856:
                if (str.equals("search")) {
                    c = 7;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c = 11;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 4;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = 15;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c = 16;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 103668165:
                if (str.equals("match")) {
                    c = 5;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = '\b';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 109648666:
                if (str.equals("split")) {
                    c = '\t';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c = '\n';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c = 6;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    c = 3;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
        }
        String str7 = str5;
        switch (c) {
            case 0:
                zzh.zzc(str7, 1, list);
                int iZzi2 = !list.isEmpty() ? (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) : 0;
                String str8 = this.zza;
                return (iZzi2 < 0 || iZzi2 >= str8.length()) ? zzao.zzm : new zzas(String.valueOf(str8.charAt(iZzi2)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.zza);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    sb.append(zzgVar.zza((zzao) list.get(i4)).zzc());
                }
                return new zzas(sb.toString());
            case 2:
                zzh.zza(str4, 1, list);
                String str9 = this.zza;
                zzao zzaoVarZza = zzgVar.zza((zzao) list.get(0));
                if ("length".equals(zzaoVarZza.zzc())) {
                    return zzao.zzk;
                }
                double dDoubleValue = zzaoVarZza.zzd().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str9.length()) ? zzao.zzl : zzao.zzk;
            case 3:
                zzh.zzc("indexOf", 2, list);
                return new zzah(Double.valueOf(this.zza.indexOf(list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined", (int) zzh.zzi(list.size() >= 2 ? zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() : 0.0d))));
            case 4:
                zzh.zzc("lastIndexOf", 2, list);
                String str10 = this.zza;
                String strZzc2 = list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined";
                return new zzah(Double.valueOf(str10.lastIndexOf(strZzc2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zzi(r1)))));
            case 5:
                zzh.zzc("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                return matcher.find() ? new zzae(Arrays.asList(new zzas(matcher.group()))) : zzao.zzg;
            case 6:
                zzh.zzc("replace", 2, list);
                zzao zzaoVarZza2 = zzao.zzf;
                if (!list.isEmpty()) {
                    strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                    if (list.size() > 1) {
                        zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
                    }
                }
                String str11 = strZzc;
                String str12 = this.zza;
                int iIndexOf = str12.indexOf(str11);
                if (iIndexOf < 0) {
                    return this;
                }
                if (zzaoVarZza2 instanceof zzai) {
                    i2 = 0;
                    zzaoVarZza2 = ((zzai) zzaoVarZza2).zza(zzgVar, Arrays.asList(new zzas(str11), new zzah(Double.valueOf(iIndexOf)), this));
                } else {
                    i2 = 0;
                }
                String strSubstring = str12.substring(i2, iIndexOf);
                String strZzc3 = zzaoVarZza2.zzc();
                String strSubstring2 = str12.substring(iIndexOf + str11.length());
                StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc3).length() + String.valueOf(strSubstring2).length());
                sb2.append(strSubstring);
                sb2.append(strZzc3);
                sb2.append(strSubstring2);
                return new zzas(sb2.toString());
            case 7:
                zzh.zzc("search", 1, list);
                return Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza).find() ? new zzah(Double.valueOf(r0.start())) : new zzah(Double.valueOf(-1.0d));
            case '\b':
                zzh.zzc("slice", 2, list);
                String str13 = this.zza;
                double dZzi = zzh.zzi(!list.isEmpty() ? zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() : 0.0d);
                double dMax = dZzi < 0.0d ? Math.max(str13.length() + dZzi, 0.0d) : Math.min(dZzi, str13.length());
                double dZzi2 = zzh.zzi(list.size() > 1 ? zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() : str13.length());
                int i5 = (int) dMax;
                return new zzas(str13.substring(i5, Math.max(0, ((int) (dZzi2 < 0.0d ? Math.max(str13.length() + dZzi2, 0.0d) : Math.min(dZzi2, str13.length()))) - i5) + i5));
            case '\t':
                zzh.zzc("split", 2, list);
                String str14 = this.zza;
                if (str14.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzc4 = zzgVar.zza((zzao) list.get(0)).zzc();
                    long jZzh = list.size() > 1 ? zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) : 2147483647L;
                    if (jZzh == 0) {
                        return new zzae();
                    }
                    String[] strArrSplit = str14.split(Pattern.quote(strZzc4), ((int) jZzh) + 1);
                    int length = strArrSplit.length;
                    if (!strZzc4.isEmpty() || length <= 0) {
                        i3 = length;
                        z = false;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i3 = length - 1;
                        if (!strArrSplit[i3].isEmpty()) {
                            i3 = length;
                        }
                        z = zIsEmpty;
                    }
                    if (length > jZzh) {
                        i3--;
                    }
                    for (?? r1 = z; r1 < i3; r1++) {
                        arrayList.add(new zzas(strArrSplit[r1]));
                    }
                }
                return new zzae(arrayList);
            case '\n':
                zzh.zzc("substring", 2, list);
                String str15 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZzi = 0;
                } else {
                    zzgVar2 = zzgVar;
                    iZzi = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(0)).zzd().doubleValue());
                }
                int iZzi3 = list.size() > 1 ? (int) zzh.zzi(zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue()) : str15.length();
                int iMin = Math.min(Math.max(iZzi, 0), str15.length());
                int iMin2 = Math.min(Math.max(iZzi3, 0), str15.length());
                return new zzas(str15.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                zzh.zza("toLocaleUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase());
            case '\f':
                zzh.zza("toLocaleLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase());
            case '\r':
                zzh.zza("toLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.zza(str6, 0, list);
                return this;
            case 15:
                zzh.zza("toUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zza("toUpperCase", 0, list);
                return new zzas(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaq(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.zza);
    }
}
