package com.robinhood.android.event.detail;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.detail.builders.ContractSelectorRowControlViewState;
import com.robinhood.android.ticker.DefaultTickerTextProvider;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EventDetailMultiContractList.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001az\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0000\u001aS\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010#\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010$\u001a\r\u0010%\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010$\"\u0010\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010 \"\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"eventDetailContractList", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/detail/builders/ContractSelectorRowControlViewState;", "numVisibleItems", "", "onExpandNumVisibleItems", "Lkotlin/Function0;", "selectedContractId", "Ljava/util/UUID;", "onItemSelected", "Lkotlin/ParameterName;", "name", "contractId", "onContractItemValueClick", "ContractItem", "contractName", "", "contractSubTitle", "Lcom/robinhood/utils/resource/StringResource;", "contractMetadata", "isEnabled", "", "isSelected", "onMetadataClick", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TrailingMetaTextRowFillMinWidth", "Landroidx/compose/ui/unit/Dp;", "F", "TrailingMetaTextContainerShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "PreviewEventDetailMultiContractList", "(Landroidx/compose/runtime/Composer;I)V", "PreviewEventDetailMultiContractListLoading", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventDetailMultiContractListKt {
    private static final float TrailingMetaTextRowFillMinWidth = C2002Dp.m7995constructorimpl(88);
    private static final RoundedCornerShape TrailingMetaTextContainerShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(6));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractItem$lambda$10(String str, StringResource stringResource, String str2, boolean z, boolean z2, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ContractItem(str, stringResource, str2, z, z2, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewEventDetailMultiContractList$lambda$11(int i, Composer composer, int i2) {
        PreviewEventDetailMultiContractList(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewEventDetailMultiContractListLoading$lambda$12(int i, Composer composer, int i2) {
        PreviewEventDetailMultiContractListLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Function1<LazyListScope, Unit> eventDetailContractList(final ImmutableList<ContractSelectorRowControlViewState> immutableList, final int i, final Function0<Unit> onExpandNumVisibleItems, final UUID uuid, final Function1<? super UUID, Unit> onItemSelected, final Function0<Unit> onContractItemValueClick) {
        Intrinsics.checkNotNullParameter(onExpandNumVisibleItems, "onExpandNumVisibleItems");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        Intrinsics.checkNotNullParameter(onContractItemValueClick, "onContractItemValueClick");
        return new Function1() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventDetailMultiContractListKt.eventDetailContractList$lambda$1(immutableList, i, uuid, onItemSelected, onContractItemValueClick, onExpandNumVisibleItems, (LazyListScope) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eventDetailContractList$lambda$1(final ImmutableList immutableList, int i, UUID uuid, Function1 function1, Function0 function0, Function0 function02, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        ComposableSingletons$EventDetailMultiContractListKt composableSingletons$EventDetailMultiContractListKt = ComposableSingletons$EventDetailMultiContractListKt.INSTANCE;
        LazyListScope.item$default(lazyListScope, null, null, composableSingletons$EventDetailMultiContractListKt.getLambda$1387346$feature_event_detail_externalDebug(), 3, null);
        if (immutableList != null) {
            LazyListScope.items$default(lazyListScope, RangesKt.coerceAtMost(i, immutableList.size()), new Function1() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EventDetailMultiContractListKt.eventDetailContractList$lambda$1$lambda$0(immutableList, ((Integer) obj).intValue());
                }
            }, null, ComposableLambda3.composableLambdaInstance(628908654, true, new EventDetailMultiContractListKt$eventDetailContractList$1$2(immutableList, uuid, function1, function0)), 4, null);
            if (immutableList.size() > i) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1896009884, true, new EventDetailMultiContractListKt$eventDetailContractList$1$3(immutableList, i, function02)), 3, null);
            }
        } else {
            LazyListScope.items$default(lazyListScope, i, null, null, composableSingletons$EventDetailMultiContractListKt.getLambda$1538812741$feature_event_detail_externalDebug(), 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object eventDetailContractList$lambda$1$lambda$0(ImmutableList immutableList, int i) {
        return ((ContractSelectorRowControlViewState) immutableList.get(i)).getContract().getContractId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ContractItem(final String str, final StringResource stringResource, final String str2, final boolean z, final boolean z2, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        String str3;
        int i2;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final SnapshotState snapshotState;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(617207251);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(617207251, i2, -1, "com.robinhood.android.event.detail.ContractItem (EventDetailMultiContractList.kt:147)");
            }
            composerStartRestartGroup.startReplaceGroup(430693254);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(80)), 0.0f, 1, null);
            if (z2) {
                modifierFillMaxWidth$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), null, 2, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            int iM7479getButtono7Vup1c = Role.INSTANCE.m7479getButtono7Vup1c();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4891clickableO2vRcR0$default(modifierFillMaxWidth$default, (InteractionSource3) objRememberedValue, null, z, null, Role.m7472boximpl(iM7479getButtono7Vup1c), function0, 8, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue6;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
            final int i3 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            boolean zChanged = zChangedInstance | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new MeasurePolicy() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$ContractItem$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        snapshotState3.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i3);
                        snapshotState2.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$ContractItem$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                snapshotState = snapshotState2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                snapshotState = snapshotState2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function0<Unit>() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$ContractItem$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            final Function0 function03 = (Function0) objRememberedValue8;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$ContractItem$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierM5144paddingVpY3zN4$default, false, (Function1) objRememberedValue9, 1, null);
            final String str4 = str3;
            composer2 = composerStartRestartGroup;
            LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$ContractItem$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    long jM21427getFg30d7_KjU;
                    Modifier.Companion companion2;
                    ConstraintLayoutScope constraintLayoutScope2;
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                    BentoTheme bentoTheme;
                    int i5;
                    BentoTheme bentoTheme2;
                    int i6;
                    long jM21427getFg30d7_KjU2;
                    long jM21373getBg30d7_KjU;
                    BentoTheme bentoTheme3;
                    int i7;
                    long jM21427getFg30d7_KjU3;
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i4, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    snapshotState3.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                    composer3.startReplaceGroup(-1568407039);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                    ConstraintLayoutBaseScope3.Companion companion3 = ConstraintLayoutBaseScope3.INSTANCE;
                    constraintLayoutScope3.createVerticalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2}, companion3.getPacked());
                    constraintLayoutScope3.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component3}, companion3.getSpreadInside());
                    TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                    int iM7959getEllipsisgIe3tQ8 = companion4.m7959getEllipsisgIe3tQ8();
                    if (z) {
                        composer3.startReplaceGroup(1611983582);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                    } else {
                        composer3.startReplaceGroup(1611984415);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                    }
                    composer3.endReplaceGroup();
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, 0.0f, bentoTheme4.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component3) | composer3.changed(constraintLayoutBaseScope4Component2);
                    Object objRememberedValue10 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new EventDetailMultiContractListKt$ContractItem$3$1$1(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component2);
                        composer3.updateRememberedValue(objRememberedValue10);
                    }
                    composer3.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(str4, constraintLayoutScope3.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, null, composer3, 817889280, 0, 15736);
                    composer3.startReplaceGroup(1611998680);
                    StringResource stringResource2 = stringResource;
                    if (stringResource2 != null) {
                        String string2 = StringResources6.getText(stringResource2, composer3, StringResource.$stable).toString();
                        if (z) {
                            composer3.startReplaceGroup(360035951);
                            bentoTheme3 = bentoTheme4;
                            i7 = i8;
                            jM21427getFg30d7_KjU3 = bentoTheme3.getColors(composer3, i7).m21426getFg20d7_KjU();
                        } else {
                            bentoTheme3 = bentoTheme4;
                            i7 = i8;
                            composer3.startReplaceGroup(360036815);
                            jM21427getFg30d7_KjU3 = bentoTheme3.getColors(composer3, i7).m21427getFg30d7_KjU();
                        }
                        composer3.endReplaceGroup();
                        TextStyle textS = bentoTheme3.getTypography(composer3, i7).getTextS();
                        int iM7959getEllipsisgIe3tQ82 = companion4.m7959getEllipsisgIe3tQ8();
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component1);
                        Object objRememberedValue11 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new EventDetailMultiContractListKt$ContractItem$3$2$1$1(constraintLayoutBaseScope4Component1);
                            composer3.updateRememberedValue(objRememberedValue11);
                        }
                        composer3.endReplaceGroup();
                        companion2 = companion5;
                        constraintLayoutScope2 = constraintLayoutScope3;
                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                        bentoTheme = bentoTheme3;
                        i5 = i7;
                        BentoText2.m20747BentoText38GnDrw(string2, constraintLayoutScope3.constrainAs(companion5, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue11), Color.m6701boximpl(jM21427getFg30d7_KjU3), null, null, null, null, iM7959getEllipsisgIe3tQ82, false, 1, 0, null, 0, textS, composer3, 817889280, 0, 7544);
                    } else {
                        companion2 = companion5;
                        constraintLayoutScope2 = constraintLayoutScope3;
                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                        bentoTheme = bentoTheme4;
                        i5 = i8;
                    }
                    composer3.endReplaceGroup();
                    DefaultTickerTextProvider defaultTickerTextProvider = DefaultTickerTextProvider.INSTANCE;
                    if (z) {
                        composer3.startReplaceGroup(1612019006);
                        bentoTheme2 = bentoTheme;
                        i6 = i5;
                        jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composer3, i6).m21425getFg0d7_KjU();
                    } else {
                        bentoTheme2 = bentoTheme;
                        i6 = i5;
                        composer3.startReplaceGroup(1612019839);
                        jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composer3, i6).m21427getFg30d7_KjU();
                    }
                    composer3.endReplaceGroup();
                    long j = jM21427getFg30d7_KjU2;
                    TickerTextState.Style style = TickerTextState.Style.REGULAR_MEDIUM;
                    Modifier.Companion companion6 = companion2;
                    Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(companion6, EventDetailMultiContractListKt.TrailingMetaTextRowFillMinWidth, 0.0f, 2, null);
                    if (!z) {
                        composer3.startReplaceGroup(-1566760351);
                        jM21373getBg30d7_KjU = bentoTheme2.getColors(composer3, i6).m21373getBg30d7_KjU();
                        composer3.endReplaceGroup();
                    } else if (z2) {
                        composer3.startReplaceGroup(-1566670110);
                        jM21373getBg30d7_KjU = bentoTheme2.getColors(composer3, i6).m21371getBg0d7_KjU();
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1566596671);
                        jM21373getBg30d7_KjU = bentoTheme2.getColors(composer3, i6).m21373getBg30d7_KjU();
                        composer3.endReplaceGroup();
                    }
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(Background3.m4871backgroundbw27NRU(modifierM5176widthInVpY3zN4$default, jM21373getBg30d7_KjU, EventDetailMultiContractListKt.TrailingMetaTextContainerShape), EventDetailMultiContractListKt.TrailingMetaTextContainerShape), false, null, Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c()), function02, 3, null), bentoTheme2.getSpacing(composer3, i6).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composer3, i6).m21593getSmallD9Ej5fM());
                    composer3.startReplaceGroup(5004770);
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
                    boolean zChanged4 = composer3.changed(constraintLayoutBaseScope42);
                    Object objRememberedValue12 = composer3.rememberedValue();
                    if (zChanged4 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new EventDetailMultiContractListKt$ContractItem$3$3$1(constraintLayoutBaseScope42);
                        composer3.updateRememberedValue(objRememberedValue12);
                    }
                    composer3.endReplaceGroup();
                    ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                    defaultTickerTextProvider.mo19237TickerTextFNF3uiM(constraintLayoutScope4.constrainAs(modifierM5143paddingVpY3zN4, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12), str2, j, style, composer3, (DefaultTickerTextProvider.$stable << 12) | 3072);
                    Color colorM21927getDividerColorQN2ZGVo = ((Styles) composer3.consume(Styles2.getLocalStyles())).getRow(composer3, 0).getColors().m21927getDividerColorQN2ZGVo();
                    composer3.startReplaceGroup(1612054560);
                    long jM21373getBg30d7_KjU2 = colorM21927getDividerColorQN2ZGVo == null ? bentoTheme2.getColors(composer3, i6).m21373getBg30d7_KjU() : colorM21927getDividerColorQN2ZGVo.getValue();
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(1849434622);
                    Object objRememberedValue13 = composer3.rememberedValue();
                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = EventDetailMultiContractListKt$ContractItem$3$4$1.INSTANCE;
                        composer3.updateRememberedValue(objRememberedValue13);
                    }
                    composer3.endReplaceGroup();
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(constraintLayoutScope4.constrainAs(companion6, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue13), jM21373getBg30d7_KjU2, 0.0f, composer3, 0, 4);
                    composer3.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function03, composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailMultiContractListKt.ContractItem$lambda$10(str, stringResource, str2, z, z2, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewEventDetailMultiContractList(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-688131765);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-688131765, i, -1, "com.robinhood.android.event.detail.PreviewEventDetailMultiContractList (EventDetailMultiContractList.kt:240)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableSingletons$EventDetailMultiContractListKt.INSTANCE.m14097getLambda$1210729213$feature_event_detail_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailMultiContractListKt.PreviewEventDetailMultiContractList$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewEventDetailMultiContractListLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1360105143);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1360105143, i, -1, "com.robinhood.android.event.detail.PreviewEventDetailMultiContractListLoading (EventDetailMultiContractList.kt:325)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableSingletons$EventDetailMultiContractListKt.INSTANCE.m14098getLambda$1299864577$feature_event_detail_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailMultiContractListKt.PreviewEventDetailMultiContractListLoading$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
