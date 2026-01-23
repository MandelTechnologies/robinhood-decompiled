package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.camera.BarcodeInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RawExtraction.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"to", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "Lcom/withpersona/sdk2/camera/BarcodeInfo;", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.RawExtractionKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class RawExtraction2 {
    /* renamed from: to */
    public static final RawExtraction m3221to(BarcodeInfo barcodeInfo) {
        Intrinsics.checkNotNullParameter(barcodeInfo, "<this>");
        if (barcodeInfo instanceof BarcodeInfo.MrzBarcodeInfo) {
            return new RawExtraction("mrz", ((BarcodeInfo.MrzBarcodeInfo) barcodeInfo).getExtractionRawPayload());
        }
        if (!(barcodeInfo instanceof BarcodeInfo.Pdf417BarcodeInfo)) {
            throw new NoWhenBranchMatchedException();
        }
        return new RawExtraction("pdf417", ((BarcodeInfo.Pdf417BarcodeInfo) barcodeInfo).getExtractionRawPayload());
    }
}
