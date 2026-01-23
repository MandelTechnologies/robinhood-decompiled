package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzeu implements zzeq {
    private static Timer zza;
    private final Context zzb;
    private final zzev zzc;
    private final CoroutineScope zzd;
    private final zzek zze;

    public zzeu(Context context, zzev zzevVar, CoroutineScope coroutineScope) {
        this.zzb = context;
        this.zzc = zzevVar;
        this.zzd = coroutineScope;
        zzek zzekVar = null;
        try {
            zzek zzekVar2 = zzek.zzd;
            zzekVar2 = zzekVar2 == null ? new zzek(context, null) : zzekVar2;
            zzek.zzd = zzekVar2;
            zzekVar = zzekVar2;
        } catch (Exception unused) {
        }
        this.zze = zzekVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzek zzekVar;
        zzva zzvaVarZzk;
        int iZzN;
        int i;
        zzek zzekVar2 = this.zze;
        if (zzekVar2 != null) {
            for (List<zzel> list : CollectionsKt.windowed(zzekVar2.zzd(), 20, 20, true)) {
                zzro zzroVarZzi = zzrp.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzel zzelVar : list) {
                    try {
                        zzvaVarZzk = zzva.zzk(zzkj.zzg().zzj(zzelVar.zzc()));
                        iZzN = zzvaVarZzk.zzN();
                        i = iZzN - 1;
                    } catch (Exception unused) {
                        zzek zzekVar3 = this.zze;
                        if (zzekVar3 != null) {
                            zzekVar3.zzf(zzelVar);
                        }
                    }
                    if (iZzN == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        zzroVarZzi.zzp(zzvaVarZzk.zzf());
                    } else if (i == 1) {
                        zzroVarZzi.zzq(zzvaVarZzk.zzg());
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    arrayList.add(zzelVar);
                }
                if (zzroVarZzi.zzd() + zzroVarZzi.zze() != 0) {
                    if (this.zzc.zza(((zzrp) zzroVarZzi.zzj()).zzd()) && (zzekVar = this.zze) != null) {
                        zzekVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzer(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeq
    public final void zza(zzva zzvaVar) {
        BuildersKt__Builders_commonKt.launch$default(this.zzd, null, null, new zzet(this, zzvaVar, null), 3, null);
        zzh();
    }
}
