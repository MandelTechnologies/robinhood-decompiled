package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* loaded from: classes27.dex */
public final class zzh extends MobileVisionBase implements BarcodeScanner {
    private static final BarcodeScannerOptions zzd = new BarcodeScannerOptions.Builder().build();
    final zzxk zzb;
    private final boolean zze;
    private final BarcodeScannerOptions zzf;
    private int zzg;
    private boolean zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(BarcodeScannerOptions barcodeScannerOptions, zzl zzlVar, Executor executor, zzwp zzwpVar, MlKitContext mlKitContext) {
        super(zzlVar, executor);
        barcodeScannerOptions.zzb();
        this.zzf = barcodeScannerOptions;
        boolean zZzf = zzb.zzf();
        this.zze = zZzf;
        zzrp zzrpVar = new zzrp();
        zzrpVar.zzi(zzb.zzc(barcodeScannerOptions));
        zzrr zzrrVarZzj = zzrpVar.zzj();
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(zZzf ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrrVarZzj);
        zzwpVar.zzd(zzws.zzg(zzrdVar, 1), zzrc.ON_DEVICE_BARCODE_CREATE);
        this.zzb = null;
    }

    private final Task zzf(Task task, final int i, final int i2) {
        return task.onSuccessTask(new SuccessContinuation() { // from class: com.google.mlkit.vision.barcode.internal.zzf
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.zza.zzd(i, i2, (List) obj);
            }
        });
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.zze ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_BARCODE};
    }

    final /* synthetic */ Task zzd(int i, int i2, List list) throws Exception {
        return Tasks.forResult(list);
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    public final Task<List<Barcode>> process(InputImage inputImage) {
        return zzf(super.processBase(inputImage), inputImage.getWidth(), inputImage.getHeight());
    }

    @Override // com.google.mlkit.vision.common.internal.MobileVisionBase, java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    public final synchronized void close() {
        super.close();
    }
}
