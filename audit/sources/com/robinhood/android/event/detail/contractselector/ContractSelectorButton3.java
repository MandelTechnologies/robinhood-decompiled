package com.robinhood.android.event.detail.contractselector;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: ContractSelectorButton.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "<init>", "()V", "yesButtonBaseState", "noButtonBaseState", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonPreviewParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class ContractSelectorButton3 implements PreviewParameterProvider<ContractSelectorButtonViewState> {
    private final ContractSelectorButtonViewState noButtonBaseState;
    private final ContractSelectorButtonViewState yesButtonBaseState;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public ContractSelectorButton3() {
        ContractSelectorButton2 contractSelectorButton2 = ContractSelectorButton2.YES;
        StringResource.Companion companion = StringResource.INSTANCE;
        this.yesButtonBaseState = new ContractSelectorButtonViewState(contractSelectorButton2, companion.invoke("Yes 94¢"), new ContractSelectorButtonViewState.PositionState.WithoutPosition(null), "", false, false, 48, null);
        this.noButtonBaseState = new ContractSelectorButtonViewState(ContractSelectorButton2.f4140NO, companion.invoke("No 6¢"), new ContractSelectorButtonViewState.PositionState.WithoutPosition(null), "", false, false, 48, null);
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<ContractSelectorButtonViewState> getValues() {
        ContractSelectorButtonViewState contractSelectorButtonViewState = this.yesButtonBaseState;
        ContractSelectorButtonViewState contractSelectorButtonViewState2 = this.noButtonBaseState;
        StringResource.Companion companion = StringResource.INSTANCE;
        return SequencesKt.sequenceOf(contractSelectorButtonViewState, contractSelectorButtonViewState2, ContractSelectorButtonViewState.copy$default(contractSelectorButtonViewState, null, companion.invoke("Yes 6¢"), null, null, false, false, 61, null), ContractSelectorButtonViewState.copy$default(this.noButtonBaseState, null, companion.invoke("No 94¢"), null, null, false, false, 61, null), ContractSelectorButtonViewState.copy$default(this.yesButtonBaseState, null, companion.invoke("6¢"), null, null, false, false, 61, null), ContractSelectorButtonViewState.copy$default(this.noButtonBaseState, null, companion.invoke("6¢"), null, null, false, false, 61, null));
    }
}
