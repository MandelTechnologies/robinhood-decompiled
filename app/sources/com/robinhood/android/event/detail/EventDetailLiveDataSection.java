package com.robinhood.android.event.detail;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
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
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.detail.EventDetailLiveDataSectionViewState;
import com.robinhood.android.eventcontracts.sharedeventui.C16594R;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.resource.StringResource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventDetailLiveDataSection.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u000b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\f"}, m3636d2 = {"LiveDataComponentMinHeight", "Landroidx/compose/ui/unit/Dp;", "F", "EventDetailLiveDataSection", "", "state", "Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EventDetailLiveDataSectionPreview", "(Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;Landroidx/compose/runtime/Composer;I)V", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailLiveDataSection {
    private static final float LiveDataComponentMinHeight = C2002Dp.m7995constructorimpl(70);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailLiveDataSection$lambda$10(EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventDetailLiveDataSection(eventDetailLiveDataSectionViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailLiveDataSectionPreview$lambda$11(EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, int i, Composer composer, int i2) {
        EventDetailLiveDataSectionPreview(eventDetailLiveDataSectionViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailLiveDataSection$lambda$2$lambda$1$lambda$0(long j, long j2, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m6950drawLine1RTmtNc$default(drawBehind, Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(j), Color.m6701boximpl(j2)}), 0.0f, 0.0f, 0, 14, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1)), 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventDetailLiveDataSection(final EventDetailLiveDataSectionViewState state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        final int i4;
        boolean zChanged;
        Object objRememberedValue6;
        final SnapshotState snapshotState3;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(740800292);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(740800292, i3, -1, "com.robinhood.android.event.detail.EventDetailLiveDataSection (EventDetailLiveDataSection.kt:61)");
                }
                final long color = state.getLeftContractColor().getColor(composerStartRestartGroup, 0);
                final long color2 = state.getRightContractColor().getColor(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1055471371);
                Modifier modifierBackground$default = Background3.background$default(SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), LiveDataComponentMinHeight, 0.0f, 2, null), Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(color, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(color2, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                if (state.getShowGradientLine()) {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composerStartRestartGroup.changed(color) | composerStartRestartGroup.changed(color2);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function1() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EventDetailLiveDataSection.EventDetailLiveDataSection$lambda$2$lambda$1$lambda$0(color, color2, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierBackground$default = DrawModifierKt.drawBehind(modifierBackground$default, (Function1) objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierBackground$default, C2002Dp.m7995constructorimpl(14), C2002Dp.m7995constructorimpl(10));
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Measurer2(density);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                measurer2 = (Measurer2) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotState2 = (SnapshotState) objRememberedValue5;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            snapshotState2.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$$inlined$ConstraintLayout$2.1
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
                    snapshotState3 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    snapshotState3 = snapshotState;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$$inlined$ConstraintLayout$3
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
                            snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl.setKnownDirty(true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                final Function0 function0 = (Function0) objRememberedValue7;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$$inlined$ConstraintLayout$4
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
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5143paddingVpY3zN4, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        String text;
                        String text2;
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState2.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        composer2.startReplaceGroup(-736558339);
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM();
                        float fM21594getXlargeD9Ej5fM = bentoTheme.getSpacing(composer2, i7).m21594getXlargeD9Ej5fM();
                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, 0.0f, 2, null);
                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, 0.0f, 2, null);
                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope2.createGuidelineFromStart(0.25f);
                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope2.createGuidelineFromEnd(0.25f);
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.DOT_12;
                        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                        String strStringResource = StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer2, 0);
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composer2.startReplaceGroup(-1746271574);
                        boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component2) | composer2.changed(fM21593getSmallD9Ej5fM) | composer2.changed(state);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new EventDetailLiveDataSection2(constraintLayoutBaseScope4Component2, fM21593getSmallD9Ej5fM, state);
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10);
                        int i8 = BentoIcon4.Size12.$stable;
                        BentoIcon2.m20644BentoIconFU0evQE(size12, strStringResource, jM21425getFg0d7_KjU, modifierConstrainAs, null, false, composer2, i8, 48);
                        EventDetailLiveDataSectionViewState.ContractViewState leftContractState = state.getLeftContractState();
                        String str = (leftContractState == null || (text2 = leftContractState.getText()) == null) ? "" : text2;
                        long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                        TickerTextState.Style style = TickerTextState.Style.DISPLAY_MEDIUM;
                        composer2.startReplaceGroup(-1746271574);
                        boolean zChanged4 = composer2.changed(verticalAnchorM8138createStartBarrier3ABfNKs$default) | composer2.changed(fM21594getXlargeD9Ej5fM) | composer2.changed(state);
                        Object objRememberedValue11 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new EventDetailLiveDataSection3(verticalAnchorM8138createStartBarrier3ABfNKs$default, fM21594getXlargeD9Ej5fM, state);
                            composer2.updateRememberedValue(objRememberedValue11);
                        }
                        composer2.endReplaceGroup();
                        WrappedTickerKt.m19244TickerTextFNF3uiM(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue11), str, jM21425getFg0d7_KjU2, style, composer2, 3072);
                        StringResource primaryText = state.getPrimaryText();
                        int i9 = StringResource.$stable;
                        String text3 = StringUtil2.getText(primaryText, composer2, i9);
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                        TextStyle textM = bentoTheme.getTypography(composer2, i7).getTextM();
                        FontWeight bold = FontWeight.INSTANCE.getBold();
                        composer2.startReplaceGroup(-1746271574);
                        boolean zChanged5 = composer2.changed(constraintLayoutBaseScope4Component4) | composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(verticalAnchorCreateGuidelineFromEnd);
                        Object objRememberedValue12 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new EventDetailLiveDataSection4(constraintLayoutBaseScope4Component4, verticalAnchorCreateGuidelineFromStart, verticalAnchorCreateGuidelineFromEnd);
                            composer2.updateRememberedValue(objRememberedValue12);
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(text3, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12), null, null, bold, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textM, composer2, 24576, 0, 8108);
                        StringResource secondaryText = state.getSecondaryText();
                        composer2.startReplaceGroup(530501590);
                        String text4 = secondaryText == null ? null : StringUtil2.getText(secondaryText, composer2, i9);
                        composer2.endReplaceGroup();
                        String str2 = text4 == null ? "" : text4;
                        int iM7919getCentere0LSkKk2 = companion3.m7919getCentere0LSkKk();
                        TextStyle textS = bentoTheme.getTypography(composer2, i7).getTextS();
                        composer2.startReplaceGroup(-1224400529);
                        boolean zChanged6 = composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(verticalAnchorCreateGuidelineFromEnd) | composer2.changed(state);
                        Object objRememberedValue13 = composer2.rememberedValue();
                        if (zChanged6 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new EventDetailLiveDataSection5(constraintLayoutBaseScope4Component3, verticalAnchorCreateGuidelineFromStart, verticalAnchorCreateGuidelineFromEnd, state);
                            composer2.updateRememberedValue(objRememberedValue13);
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(str2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue13), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8124);
                        EventDetailLiveDataSectionViewState.ContractViewState rightContractState = state.getRightContractState();
                        String str3 = (rightContractState == null || (text = rightContractState.getText()) == null) ? "" : text;
                        long jM21425getFg0d7_KjU3 = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                        composer2.startReplaceGroup(-1746271574);
                        boolean zChanged7 = composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(fM21594getXlargeD9Ej5fM) | composer2.changed(state);
                        Object objRememberedValue14 = composer2.rememberedValue();
                        if (zChanged7 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue14 = new EventDetailLiveDataSection6(verticalAnchorM8137createEndBarrier3ABfNKs$default, fM21594getXlargeD9Ej5fM, state);
                            composer2.updateRememberedValue(objRememberedValue14);
                        }
                        composer2.endReplaceGroup();
                        WrappedTickerKt.m19244TickerTextFNF3uiM(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue14), str3, jM21425getFg0d7_KjU3, style, composer2, 3072);
                        BentoIcon4.Size12 size122 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                        String strStringResource2 = StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer2, 0);
                        long jM21425getFg0d7_KjU4 = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                        composer2.startReplaceGroup(-1746271574);
                        boolean zChanged8 = composer2.changed(constraintLayoutBaseScope4Component5) | composer2.changed(fM21593getSmallD9Ej5fM) | composer2.changed(state);
                        Object objRememberedValue15 = composer2.rememberedValue();
                        if (zChanged8 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue15 = new EventDetailLiveDataSection7(constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM, state);
                            composer2.updateRememberedValue(objRememberedValue15);
                        }
                        composer2.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size122, strStringResource2, jM21425getFg0d7_KjU4, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue15), null, false, composer2, i8, 48);
                        composer2.endReplaceGroup();
                        if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                            EffectsKt.SideEffect(function0, composer2, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventDetailLiveDataSection.EventDetailLiveDataSection$lambda$10(state, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final long color3 = state.getLeftContractColor().getColor(composerStartRestartGroup, 0);
            final long color22 = state.getRightContractColor().getColor(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1055471371);
            Modifier modifierBackground$default2 = Background3.background$default(SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), LiveDataComponentMinHeight, 0.0f, 2, null), Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(color3, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(color22, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            if (state.getShowGradientLine()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierBackground$default2, C2002Dp.m7995constructorimpl(14), C2002Dp.m7995constructorimpl(10));
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            measurer2 = (Measurer2) objRememberedValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue3;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue5;
            boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
            i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            zChanged = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                        final Map linkedHashMap = new LinkedHashMap();
                        snapshotState2.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                        snapshotState.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$$inlined$ConstraintLayout$2.1
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
                snapshotState3 = snapshotState;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                }
                final Function0 function02 = (Function0) objRememberedValue7;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$$inlined$ConstraintLayout$4
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
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5143paddingVpY3zN42, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            String text;
                            String text2;
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState2.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                            constraintLayoutScope2.reset();
                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                            composer2.startReplaceGroup(-736558339);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM();
                            float fM21594getXlargeD9Ej5fM = bentoTheme.getSpacing(composer2, i7).m21594getXlargeD9Ej5fM();
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope22, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, 0.0f, 2, null);
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope22, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, 0.0f, 2, null);
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope22.createGuidelineFromStart(0.25f);
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope22.createGuidelineFromEnd(0.25f);
                            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.DOT_12;
                            BentoIcon4.Size12 size12 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                            String strStringResource = StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer2, 0);
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component2) | composer2.changed(fM21593getSmallD9Ej5fM) | composer2.changed(state);
                            Object objRememberedValue10 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue10 = new EventDetailLiveDataSection2(constraintLayoutBaseScope4Component2, fM21593getSmallD9Ej5fM, state);
                                composer2.updateRememberedValue(objRememberedValue10);
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10);
                            int i8 = BentoIcon4.Size12.$stable;
                            BentoIcon2.m20644BentoIconFU0evQE(size12, strStringResource, jM21425getFg0d7_KjU, modifierConstrainAs, null, false, composer2, i8, 48);
                            EventDetailLiveDataSectionViewState.ContractViewState leftContractState = state.getLeftContractState();
                            String str = (leftContractState == null || (text2 = leftContractState.getText()) == null) ? "" : text2;
                            long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                            TickerTextState.Style style = TickerTextState.Style.DISPLAY_MEDIUM;
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChanged4 = composer2.changed(verticalAnchorM8138createStartBarrier3ABfNKs$default) | composer2.changed(fM21594getXlargeD9Ej5fM) | composer2.changed(state);
                            Object objRememberedValue11 = composer2.rememberedValue();
                            if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue11 = new EventDetailLiveDataSection3(verticalAnchorM8138createStartBarrier3ABfNKs$default, fM21594getXlargeD9Ej5fM, state);
                                composer2.updateRememberedValue(objRememberedValue11);
                            }
                            composer2.endReplaceGroup();
                            WrappedTickerKt.m19244TickerTextFNF3uiM(constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue11), str, jM21425getFg0d7_KjU2, style, composer2, 3072);
                            StringResource primaryText = state.getPrimaryText();
                            int i9 = StringResource.$stable;
                            String text3 = StringUtil2.getText(primaryText, composer2, i9);
                            TextAlign.Companion companion3 = TextAlign.INSTANCE;
                            int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                            TextStyle textM = bentoTheme.getTypography(composer2, i7).getTextM();
                            FontWeight bold = FontWeight.INSTANCE.getBold();
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChanged5 = composer2.changed(constraintLayoutBaseScope4Component4) | composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(verticalAnchorCreateGuidelineFromEnd);
                            Object objRememberedValue12 = composer2.rememberedValue();
                            if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue12 = new EventDetailLiveDataSection4(constraintLayoutBaseScope4Component4, verticalAnchorCreateGuidelineFromStart, verticalAnchorCreateGuidelineFromEnd);
                                composer2.updateRememberedValue(objRememberedValue12);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(text3, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12), null, null, bold, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textM, composer2, 24576, 0, 8108);
                            StringResource secondaryText = state.getSecondaryText();
                            composer2.startReplaceGroup(530501590);
                            String text4 = secondaryText == null ? null : StringUtil2.getText(secondaryText, composer2, i9);
                            composer2.endReplaceGroup();
                            String str2 = text4 == null ? "" : text4;
                            int iM7919getCentere0LSkKk2 = companion3.m7919getCentere0LSkKk();
                            TextStyle textS = bentoTheme.getTypography(composer2, i7).getTextS();
                            composer2.startReplaceGroup(-1224400529);
                            boolean zChanged6 = composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(verticalAnchorCreateGuidelineFromEnd) | composer2.changed(state);
                            Object objRememberedValue13 = composer2.rememberedValue();
                            if (zChanged6 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue13 = new EventDetailLiveDataSection5(constraintLayoutBaseScope4Component3, verticalAnchorCreateGuidelineFromStart, verticalAnchorCreateGuidelineFromEnd, state);
                                composer2.updateRememberedValue(objRememberedValue13);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(str2, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue13), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8124);
                            EventDetailLiveDataSectionViewState.ContractViewState rightContractState = state.getRightContractState();
                            String str3 = (rightContractState == null || (text = rightContractState.getText()) == null) ? "" : text;
                            long jM21425getFg0d7_KjU3 = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChanged7 = composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(fM21594getXlargeD9Ej5fM) | composer2.changed(state);
                            Object objRememberedValue14 = composer2.rememberedValue();
                            if (zChanged7 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue14 = new EventDetailLiveDataSection6(verticalAnchorM8137createEndBarrier3ABfNKs$default, fM21594getXlargeD9Ej5fM, state);
                                composer2.updateRememberedValue(objRememberedValue14);
                            }
                            composer2.endReplaceGroup();
                            WrappedTickerKt.m19244TickerTextFNF3uiM(constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue14), str3, jM21425getFg0d7_KjU3, style, composer2, 3072);
                            BentoIcon4.Size12 size122 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                            String strStringResource2 = StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer2, 0);
                            long jM21425getFg0d7_KjU4 = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChanged8 = composer2.changed(constraintLayoutBaseScope4Component5) | composer2.changed(fM21593getSmallD9Ej5fM) | composer2.changed(state);
                            Object objRememberedValue15 = composer2.rememberedValue();
                            if (zChanged8 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue15 = new EventDetailLiveDataSection7(constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM, state);
                                composer2.updateRememberedValue(objRememberedValue15);
                            }
                            composer2.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size122, strStringResource2, jM21425getFg0d7_KjU4, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue15), null, false, composer2, i8, 48);
                            composer2.endReplaceGroup();
                            if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function02, composer2, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void EventDetailLiveDataSectionPreview(final EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(361759999);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(eventDetailLiveDataSectionViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(361759999, i2, -1, "com.robinhood.android.event.detail.EventDetailLiveDataSectionPreview (EventDetailLiveDataSection.kt:254)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2129314375, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt.EventDetailLiveDataSectionPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2129314375, i3, -1, "com.robinhood.android.event.detail.EventDetailLiveDataSectionPreview.<anonymous> (EventDetailLiveDataSection.kt:256)");
                    }
                    EventDetailLiveDataSection.EventDetailLiveDataSection(eventDetailLiveDataSectionViewState, null, composer2, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailLiveDataSection.EventDetailLiveDataSectionPreview$lambda$11(eventDetailLiveDataSectionViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
