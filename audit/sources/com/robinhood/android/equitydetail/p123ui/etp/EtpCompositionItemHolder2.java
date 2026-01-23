package com.robinhood.android.equitydetail.p123ui.etp;

import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemHolder;
import com.robinhood.models.p320db.bonfire.etp.EtpHolding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtpCompositionItemHolder.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toUiModel", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$Holding$UiEtpHolding;", "Lcom/robinhood/models/db/bonfire/etp/EtpHolding;", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionItemHolderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EtpCompositionItemHolder2 {
    public static final EtpCompositionItemHolder.Holding.UiEtpHolding toUiModel(EtpHolding etpHolding) {
        Intrinsics.checkNotNullParameter(etpHolding, "<this>");
        return new EtpCompositionItemHolder.Holding.UiEtpHolding(etpHolding.getName(), etpHolding.getInstrumentId(), etpHolding.getSymbol(), etpHolding.getWeight(), etpHolding.getSector(), etpHolding.getDescription(), etpHolding.getColor());
    }
}
