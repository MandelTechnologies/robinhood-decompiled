package com.robinhood.android.event.detail.contractselector;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: ContractSelectorButtonWithPosition.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonWithPositionParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "<init>", "()V", "contractId", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "baseState", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonWithPositionParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class ContractSelectorButtonWithPosition3 implements PreviewParameterProvider<ContractSelectorButtonViewState> {
    public static final int $stable = 8;
    private final ContractSelectorButtonViewState baseState;
    private final UUID contractId;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public ContractSelectorButtonWithPosition3() {
        UUID contractId = UUID.randomUUID();
        this.contractId = contractId;
        ContractSelectorButton2 contractSelectorButton2 = ContractSelectorButton2.YES;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke("Yes 94¢");
        StringResource stringResourceInvoke2 = companion.invoke("100");
        StringResource stringResourceInvoke3 = companion.invoke("Buy more 94¢");
        StringResource stringResourceInvoke4 = companion.invoke("Close 6¢");
        Intrinsics.checkNotNullExpressionValue(contractId, "contractId");
        ContractSelectorButtonViewState.Metadata metadata = new ContractSelectorButtonViewState.Metadata(contractId, SideDto.BUY, PositionEffectDto.OPEN);
        Intrinsics.checkNotNullExpressionValue(contractId, "contractId");
        this.baseState = new ContractSelectorButtonViewState(contractSelectorButton2, stringResourceInvoke, new ContractSelectorButtonViewState.PositionState.WithPosition(stringResourceInvoke2, stringResourceInvoke3, stringResourceInvoke4, metadata, new ContractSelectorButtonViewState.Metadata(contractId, SideDto.SELL, PositionEffectDto.CLOSE), null, null, 96, null), "", false, false, 48, null);
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<ContractSelectorButtonViewState> getValues() {
        ContractSelectorButtonViewState contractSelectorButtonViewState = this.baseState;
        return SequencesKt.sequenceOf(contractSelectorButtonViewState, ContractSelectorButtonViewState.copy$default(contractSelectorButtonViewState, ContractSelectorButton2.f4140NO, StringResource.INSTANCE.invoke("No 4¢"), null, null, false, false, 60, null));
    }
}
