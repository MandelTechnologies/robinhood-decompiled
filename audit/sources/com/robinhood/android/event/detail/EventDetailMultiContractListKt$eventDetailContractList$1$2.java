package com.robinhood.android.event.detail;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.detail.builders.ContractSelectorRowControlViewState;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EventDetailMultiContractList.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EventDetailMultiContractListKt$eventDetailContractList$1$2 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ ImmutableList<ContractSelectorRowControlViewState> $items;
    final /* synthetic */ Function0<Unit> $onContractItemValueClick;
    final /* synthetic */ Function1<UUID, Unit> $onItemSelected;
    final /* synthetic */ UUID $selectedContractId;

    /* JADX WARN: Multi-variable type inference failed */
    EventDetailMultiContractListKt$eventDetailContractList$1$2(ImmutableList<ContractSelectorRowControlViewState> immutableList, UUID uuid, Function1<? super UUID, Unit> function1, Function0<Unit> function0) {
        this.$items = immutableList;
        this.$selectedContractId = uuid;
        this.$onItemSelected = function1;
        this.$onContractItemValueClick = function0;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 48) == 0) {
            i2 |= composer.changed(i) ? 32 : 16;
        }
        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(628908654, i2, -1, "com.robinhood.android.event.detail.eventDetailContractList.<anonymous>.<anonymous> (EventDetailMultiContractList.kt:77)");
        }
        final ContractSelectorRowControlViewState contractSelectorRowControlViewState = this.$items.get(i);
        boolean zAreEqual = Intrinsics.areEqual(contractSelectorRowControlViewState.getContract().getContractId(), this.$selectedContractId);
        String name = contractSelectorRowControlViewState.getName();
        StringResource subtitle = contractSelectorRowControlViewState.getSubtitle();
        String metadata = contractSelectorRowControlViewState.getMetadata();
        boolean enabled = contractSelectorRowControlViewState.getEnabled();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onItemSelected) | composer.changedInstance(contractSelectorRowControlViewState);
        final Function1<UUID, Unit> function1 = this.$onItemSelected;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$eventDetailContractList$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDetailMultiContractListKt$eventDetailContractList$1$2.invoke$lambda$1$lambda$0(function1, contractSelectorRowControlViewState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EventDetailMultiContractListKt.ContractItem(name, subtitle, metadata, enabled, zAreEqual, (Function0) objRememberedValue, this.$onContractItemValueClick, composer, StringResource.$stable << 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, ContractSelectorRowControlViewState contractSelectorRowControlViewState) {
        function1.invoke(contractSelectorRowControlViewState.getContract().getContractId());
        return Unit.INSTANCE;
    }
}
