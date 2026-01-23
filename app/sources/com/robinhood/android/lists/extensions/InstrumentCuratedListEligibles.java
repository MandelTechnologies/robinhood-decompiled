package com.robinhood.android.lists.extensions;

import com.robinhood.android.common.views.InstrumentRowView;
import com.robinhood.models.p355ui.InstrumentCuratedListEligible;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentCuratedListEligibles.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toInstrumentRowViewData", "Lcom/robinhood/android/common/views/InstrumentRowView$Data;", "Lcom/robinhood/models/ui/InstrumentCuratedListEligible;", "feature-lists_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.extensions.InstrumentCuratedListEligiblesKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class InstrumentCuratedListEligibles {
    public static final InstrumentRowView.Data toInstrumentRowViewData(InstrumentCuratedListEligible instrumentCuratedListEligible) {
        Intrinsics.checkNotNullParameter(instrumentCuratedListEligible, "<this>");
        return new InstrumentRowView.Data(instrumentCuratedListEligible.getCuratedListItem().getId(), instrumentCuratedListEligible.getCuratedListItem().getDisplayName(), instrumentCuratedListEligible.getCuratedListItem().getDisplaySymbol(), instrumentCuratedListEligible.getPosition(), instrumentCuratedListEligible.getOptionsContractCount());
    }
}
