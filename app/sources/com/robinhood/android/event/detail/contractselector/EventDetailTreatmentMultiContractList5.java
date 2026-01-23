package com.robinhood.android.event.detail.contractselector;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.detail.builders.ContractSelectorRowTreatmentViewState;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.Instant;

/* compiled from: EventDetailTreatmentMultiContractList.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001an\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\u0002\b\u00102\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/detail/builders/ContractSelectorRowTreatmentViewState;", "contractRows", "", "numVisibleItems", "Lkotlin/Function2;", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "", "onTradeClicked", "Lkotlin/Function0;", "onViewAllClick", "Landroidx/compose/runtime/State;", "j$/time/Instant", "now", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "eventDetailTreatmentMultiContractList", "(Lkotlinx/collections/immutable/ImmutableList;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.contractselector.EventDetailTreatmentMultiContractListKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailTreatmentMultiContractList5 {
    public static final Function1<LazyListScope, Unit> eventDetailTreatmentMultiContractList(final ImmutableList<ContractSelectorRowTreatmentViewState> immutableList, final int i, final Function2<? super ContractSelectorButtonViewState, ? super Integer, Unit> onTradeClicked, final Function0<Unit> onViewAllClick, final SnapshotState4<Instant> now) {
        Intrinsics.checkNotNullParameter(onTradeClicked, "onTradeClicked");
        Intrinsics.checkNotNullParameter(onViewAllClick, "onViewAllClick");
        Intrinsics.checkNotNullParameter(now, "now");
        return new Function1() { // from class: com.robinhood.android.event.detail.contractselector.EventDetailTreatmentMultiContractListKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventDetailTreatmentMultiContractList5.eventDetailTreatmentMultiContractList$lambda$1(immutableList, i, onTradeClicked, now, onViewAllClick, (LazyListScope) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eventDetailTreatmentMultiContractList$lambda$1(ImmutableList immutableList, int i, final Function2 function2, final SnapshotState4 snapshotState4, Function0 function0, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        EventDetailTreatmentMultiContractList eventDetailTreatmentMultiContractList = EventDetailTreatmentMultiContractList.INSTANCE;
        LazyListScope.item$default(lazyListScope, null, null, eventDetailTreatmentMultiContractList.m14135getLambda$1469429309$feature_event_detail_externalDebug(), 3, null);
        if (immutableList != null) {
            int size = immutableList.size();
            final List listTake = CollectionsKt.take(immutableList, i);
            final C16145x80232c76 c16145x80232c76 = new Function1() { // from class: com.robinhood.android.event.detail.contractselector.EventDetailTreatmentMultiContractListKt$eventDetailTreatmentMultiContractList$lambda$1$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewState) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ContractSelectorRowTreatmentViewState) obj);
                }
            };
            lazyListScope.items(listTake.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.event.detail.contractselector.EventDetailTreatmentMultiContractListKt$eventDetailTreatmentMultiContractList$lambda$1$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return c16145x80232c76.invoke(listTake.get(i2));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.EventDetailTreatmentMultiContractListKt$eventDetailTreatmentMultiContractList$lambda$1$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                    int i4;
                    if ((i3 & 6) == 0) {
                        i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
                    } else {
                        i4 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i4 |= composer.changed(i2) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewState = (ContractSelectorRowTreatmentViewState) listTake.get(i2);
                    composer.startReplaceGroup(779514626);
                    ContractSelectorRow.ContractSelectorRow(contractSelectorRowTreatmentViewState, function2, snapshotState4, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer, 0, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            if (size > i) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-788890823, true, new EventDetailTreatmentMultiContractList6(size, function0)), 3, null);
            }
        } else {
            LazyListScope.items$default(lazyListScope, 3, null, null, eventDetailTreatmentMultiContractList.m14134getLambda$1108620432$feature_event_detail_externalDebug(), 6, null);
        }
        return Unit.INSTANCE;
    }
}
