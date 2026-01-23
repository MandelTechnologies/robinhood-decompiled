package com.robinhood.android.futures.history.p142ui.settlement;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.futures.history.p142ui.settlement.FuturesCashSettlementDetailDuxo4;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: FuturesCashSettlementDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/settlement/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.ui.settlement.ViewStateParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesCashSettlementDetailFragment4 implements PreviewParameterProvider<FuturesCashSettlementDetailDuxo4> {
    private final Sequence<FuturesCashSettlementDetailDuxo4> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public FuturesCashSettlementDetailFragment4() {
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke("Limit buy");
        StringResource stringResourceInvoke2 = companion.invoke("CME Micro E-mini S&P 500");
        StringResource stringResourceInvoke3 = companion.invoke("View /BFFF2510");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.values = SequencesKt.sequenceOf(FuturesCashSettlementDetailDuxo4.Loading.INSTANCE, new FuturesCashSettlementDetailDuxo4.Loaded(stringResourceInvoke, stringResourceInvoke2, new FuturesExecutionToolbarCta(stringResourceInvoke3, uuidRandomUUID), "10:23", "$0.54", Constants.SdidMigrationStatusCodes.ALREADY_SDID, companion.invoke("Something"), "$55.00", "$2.00", "$1.00", "$3.00", Tuples4.m3642to(companion.invoke("Cost"), "$55.00")));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<FuturesCashSettlementDetailDuxo4> getValues() {
        return this.values;
    }
}
