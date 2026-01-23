package com.robinhood.android.transfers.p271ui.p272v2.logging;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2DataState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferFrequencyBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"logFrequencySelection", "", "Lcom/robinhood/analytics/EventLogger;", "maxTransferContext", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.logging.TransferFrequencyBottomSheetFragmentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferFrequencyBottomSheetFragment {
    public static final void logFrequencySelection(EventLogger eventLogger, MAXTransferContext maxTransferContext) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(maxTransferContext, "maxTransferContext");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, CreateTransferV2DataState.INSTANCE.getScreen$feature_transfers_externalRelease(), new Component(Component.ComponentType.ROW, "edit_frequency", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maxTransferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 41, null);
    }
}
