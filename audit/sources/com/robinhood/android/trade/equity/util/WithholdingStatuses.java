package com.robinhood.android.trade.equity.util;

import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WithholdingStatuses.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"getWithholdingWarningString", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "mlpExperimentMember", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.util.WithholdingStatusesKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class WithholdingStatuses {
    public static final StringResource getWithholdingWarningString(WithholdingStatus withholdingStatus, boolean z, Instrument instrument) {
        if (!z) {
            return StringResource.INSTANCE.invoke(C29365R.string.order_create_warning_label, new Object[0]);
        }
        if (withholdingStatus != null && withholdingStatus.getTaxWithholdingStatus() == 6) {
            return StringResource.INSTANCE.invoke(C29365R.string.order_create_warning_label, new Object[0]);
        }
        if (withholdingStatus != null && withholdingStatus.isWithheld()) {
            if (Intrinsics.areEqual(instrument != null ? instrument.getType() : null, Instrument.TYPE_MLP)) {
                return StringResource.INSTANCE.invoke(C29365R.string.order_create_warning_label_nra, new Object[0]);
            }
        }
        return StringResource.INSTANCE.invoke(C29365R.string.order_create_warning_label_fallback, new Object[0]);
    }
}
