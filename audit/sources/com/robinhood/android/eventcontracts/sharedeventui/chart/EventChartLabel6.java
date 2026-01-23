package com.robinhood.android.eventcontracts.sharedeventui.chart;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EventChartLabel.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001a9\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0011*\u0016\u0010\u0000\"\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0014"}, m3636d2 = {"EventChartLabelData", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartLabelItem;", "EventChartLabel", "", WebsocketGatewayConstants.DATA_KEY, "expectedNumberOfItems", "", "modifier", "Landroidx/compose/ui/Modifier;", "useSmallerFontSize", "", "(Lkotlinx/collections/immutable/ImmutableList;ILandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "ChartLabelItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartLabelItem;ZLandroidx/compose/runtime/Composer;I)V", "EventChartLabelOneLine", "(Landroidx/compose/runtime/Composer;I)V", "EventChartLabelMultiLine", "EventChartLabelLoading", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventChartLabel6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartLabelItem$lambda$2(EventChartLabelItem eventChartLabelItem, boolean z, int i, Composer composer, int i2) {
        ChartLabelItem(eventChartLabelItem, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventChartLabel$lambda$0(ImmutableList immutableList, int i, Modifier modifier, boolean z, int i2, int i3, Composer composer, int i4) {
        EventChartLabel(immutableList, i, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventChartLabelLoading$lambda$5(int i, Composer composer, int i2) {
        EventChartLabelLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventChartLabelMultiLine$lambda$4(int i, Composer composer, int i2) {
        EventChartLabelMultiLine(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventChartLabelOneLine$lambda$3(int i, Composer composer, int i2) {
        EventChartLabelOneLine(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventChartLabel(final ImmutableList<EventChartLabelItem> immutableList, final int i, Modifier modifier, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1291227796);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(immutableList) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    final boolean z4 = i5 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1291227796, i4, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabel (EventChartLabel.kt:44)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    boolean z5 = z4;
                    FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(12)), arrangement.getCenter(), null, 0, 0, ComposableLambda3.rememberComposableLambda(-1033743601, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelKt.EventChartLabel.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer2, Integer num) {
                            invoke(flowRowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(FlowRowScope FlowRow, Composer composer2, int i7) {
                            Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                            if ((i7 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1033743601, i7, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabel.<anonymous> (EventChartLabel.kt:50)");
                            }
                            if (immutableList != null) {
                                composer2.startReplaceGroup(-1340073790);
                                ImmutableList<EventChartLabelItem> immutableList2 = immutableList;
                                boolean z6 = z4;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList2, 10));
                                Iterator<EventChartLabelItem> it = immutableList2.iterator();
                                while (it.hasNext()) {
                                    EventChartLabel6.ChartLabelItem(it.next(), z6, composer2, 0);
                                    arrayList.add(Unit.INSTANCE);
                                }
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1339955339);
                                int i8 = i;
                                boolean z7 = z4;
                                for (int i9 = 0; i9 < i8; i9++) {
                                    EventChartLabel6.ChartLabelItem(null, z7, composer2, 6);
                                }
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573296, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z3 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EventChartLabel6.EventChartLabel$lambda$0(immutableList, i, modifier3, z3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            z2 = z;
            if ((i4 & 1171) != 1170) {
                if (i6 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement arrangement2 = Arrangement.INSTANCE;
                boolean z52 = z4;
                FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), arrangement2.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(12)), arrangement2.getCenter(), null, 0, 0, ComposableLambda3.rememberComposableLambda(-1033743601, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelKt.EventChartLabel.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer2, Integer num) {
                        invoke(flowRowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(FlowRowScope FlowRow, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                        if ((i7 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1033743601, i7, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabel.<anonymous> (EventChartLabel.kt:50)");
                        }
                        if (immutableList != null) {
                            composer2.startReplaceGroup(-1340073790);
                            ImmutableList<EventChartLabelItem> immutableList2 = immutableList;
                            boolean z6 = z4;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList2, 10));
                            Iterator<EventChartLabelItem> it = immutableList2.iterator();
                            while (it.hasNext()) {
                                EventChartLabel6.ChartLabelItem(it.next(), z6, composer2, 0);
                                arrayList.add(Unit.INSTANCE);
                            }
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1339955339);
                            int i8 = i;
                            boolean z7 = z4;
                            for (int i9 = 0; i9 < i8; i9++) {
                                EventChartLabel6.ChartLabelItem(null, z7, composer2, 6);
                            }
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573296, 56);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                z3 = z52;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i4 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartLabelItem(final EventChartLabelItem eventChartLabelItem, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(244887904);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(eventChartLabelItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(244887904, i2, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.ChartLabelItem (EventChartLabel.kt:66)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            DayNightColor color = eventChartLabelItem != null ? eventChartLabelItem.getColor() : null;
            composerStartRestartGroup.startReplaceGroup(1183693409);
            Color colorM6701boximpl = color != null ? Color.m6701boximpl(color.getColor(composerStartRestartGroup, 0)) : null;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1183693031);
            long jM21427getFg30d7_KjU = colorM6701boximpl == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU() : colorM6701boximpl.getValue();
            composerStartRestartGroup.endReplaceGroup();
            boolean z2 = false;
            composer2 = composerStartRestartGroup;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DOT_16), null, jM21427getFg30d7_KjU, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composer2, BentoIcon4.Size16.$stable | 48, 48);
            if (eventChartLabelItem == null) {
                z2 = true;
            }
            LocalShowPlaceholder.Loadable(z2, null, null, ComposableLambda3.rememberComposableLambda(77443308, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelKt$ChartLabelItem$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    String xShortPlaceholderText;
                    TextStyle textM;
                    String value;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(77443308, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.ChartLabelItem.<anonymous>.<anonymous> (EventChartLabel.kt:78)");
                    }
                    EventChartLabelItem eventChartLabelItem2 = eventChartLabelItem;
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    if (eventChartLabelItem2 == null || (xShortPlaceholderText = eventChartLabelItem2.getName()) == null) {
                        xShortPlaceholderText = PlaceholderUtils.getXShortPlaceholderText();
                    }
                    builder.append(xShortPlaceholderText);
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    if (z) {
                        composer3.startReplaceGroup(1408583153);
                        textM = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextS();
                    } else {
                        composer3.startReplaceGroup(1408584209);
                        textM = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM();
                    }
                    composer3.endReplaceGroup();
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, null, null, null, null, null, 0, false, 0, 0, null, null, textM, composer3, 0, 0, 8190);
                    EventChartLabelItem eventChartLabelItem3 = eventChartLabelItem;
                    WrappedTickerKt.m19244TickerTextFNF3uiM(Modifier.INSTANCE, (eventChartLabelItem3 == null || (value = eventChartLabelItem3.getValue()) == null) ? PlaceholderUtils.XXShortPlaceholderText : value, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), z ? TickerTextState.Style.REGULAR_SMALL_BOLD : TickerTextState.Style.REGULAR_MEDIUM_BOLD, composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 3072, 6);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventChartLabel6.ChartLabelItem$lambda$2(eventChartLabelItem, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EventChartLabelOneLine(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1656564830);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1656564830, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelOneLine (EventChartLabel.kt:102)");
            }
            Boolean bool = Boolean.TRUE;
            BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, EventChartLabel.INSTANCE.getLambda$176634714$lib_shared_event_ui_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventChartLabel6.EventChartLabelOneLine$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EventChartLabelMultiLine(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(139356655);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(139356655, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelMultiLine (EventChartLabel.kt:141)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, EventChartLabel.INSTANCE.getLambda$907527079$lib_shared_event_ui_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventChartLabel6.EventChartLabelMultiLine$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EventChartLabelLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1169676128);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169676128, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelLoading (EventChartLabel.kt:180)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, EventChartLabel.INSTANCE.getLambda$663523416$lib_shared_event_ui_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventChartLabel6.EventChartLabelLoading$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
