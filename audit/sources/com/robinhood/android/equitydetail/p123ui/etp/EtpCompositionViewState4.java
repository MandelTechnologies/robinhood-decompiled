package com.robinhood.android.equitydetail.p123ui.etp;

import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.bonfire.etp.EtpSector;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtpCompositionViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0003*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"etpCompositionDataTypeManager", "", "Ljava/util/UUID;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;", "getEtpCompositionDataTypeManager", "()Ljava/util/Map;", "initialDataType", "Lcom/robinhood/models/db/EtpDetails;", "getInitialDataType", "(Lcom/robinhood/models/db/EtpDetails;)Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;", "unclassifiedSector", "Lcom/robinhood/models/db/bonfire/etp/EtpSector;", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionViewStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EtpCompositionViewState4 {
    private static final Map<UUID, EtpCompositionViewState2> etpCompositionDataTypeManager = new LinkedHashMap();
    private static final EtpSector unclassifiedSector = new EtpSector(EtpSector.UNCATEGORIZED, 0.0f, "", new ThemedColor("bg3", "fg2"));

    public static final Map<UUID, EtpCompositionViewState2> getEtpCompositionDataTypeManager() {
        return etpCompositionDataTypeManager;
    }

    public static final EtpCompositionViewState2 getInitialDataType(EtpDetails etpDetails) {
        Intrinsics.checkNotNullParameter(etpDetails, "<this>");
        return etpCompositionDataTypeManager.getOrDefault(etpDetails.getInstrumentId(), !etpDetails.getSectors().isEmpty() ? EtpCompositionViewState2.SECTORS : EtpCompositionViewState2.HOLDINGS);
    }
}
