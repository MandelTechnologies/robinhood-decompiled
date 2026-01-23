package com.robinhood.android.history.p153ui.acats;

import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.acatsin.util.AcatsInScreenContext2;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;

/* compiled from: AcatsDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0004"}, m3636d2 = {"toLoggingContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.acats.AcatsDetailDuxoKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AcatsDetailDuxo5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Context toLoggingContext(AcatsTransfer acatsTransfer) {
        if (acatsTransfer == null) {
            return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null);
        }
        return new AcatsInScreenContext("acats_history_detail", false, false, null, null, AcatsInScreenContext2.toLoggingRejectReason(acatsTransfer.getRejectReasonEnum()), false, acatsTransfer.getContraDtccNumber(), false, 344, null).toEventContext();
    }
}
