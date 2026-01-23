package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes27.dex */
public final class zza {
    private final zze zza;

    public zza(zze zzeVar) {
        this.zza = zzeVar;
    }

    public static final int zzc(AssetManager assetManager, File file) {
        int iIntValue = ((Integer) zzbk.zzd(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        Log.d("SplitCompat", "addAssetPath completed with " + iIntValue);
        return iIntValue;
    }

    public final synchronized void zza(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzc(assets, (File) it.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[Catch: all -> 0x0038, Exception -> 0x003a, LOOP:0: B:14:0x0022->B:16:0x0028, LOOP_END, TryCatch #2 {Exception -> 0x003a, blocks: (B:13:0x0019, B:14:0x0022, B:16:0x0028, B:21:0x003c), top: B:43:0x0019, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041 A[Catch: all -> 0x000c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:4:0x0005, B:23:0x0041, B:35:0x0059, B:36:0x005c, B:29:0x0050, B:12:0x0012, B:13:0x0019, B:14:0x0022, B:16:0x0028, B:21:0x003c, B:27:0x0047), top: B:39:0x0001, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized boolean zzb(Context context, Set set) {
        StrictMode.ThreadPolicy threadPolicy;
        Iterator it;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
        } catch (Exception e) {
            e = e;
            threadPolicy = null;
        }
        try {
            StrictMode.allowThreadDiskReads();
            StrictMode.allowThreadDiskWrites();
        } catch (Exception e2) {
            e = e2;
            Log.i("SplitCompat", "Unable to set up strict mode.", e);
            try {
                HashSet hashSet = new HashSet();
                it = set.iterator();
                while (it.hasNext()) {
                }
                zza(context, hashSet);
                if (threadPolicy != null) {
                }
                return true;
            } catch (Exception e3) {
                Log.e("SplitCompat", "Error installing additional splits", e3);
                if (threadPolicy == null) {
                    return false;
                }
                StrictMode.setThreadPolicy(threadPolicy);
                return false;
            }
        }
        try {
            HashSet hashSet2 = new HashSet();
            it = set.iterator();
            while (it.hasNext()) {
                hashSet2.add(this.zza.zzg((String) it.next()));
            }
            zza(context, hashSet2);
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            throw th;
        }
        return true;
    }
}
