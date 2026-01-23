package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.edit;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
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
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.redesigninvesting.investingmonitor.C26507R;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.edit.InvestingMonitorEditTabsBottomSheet3;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import com.robinhood.utils.compose.reorderable.ReorderableListState;
import com.robinhood.utils.compose.reorderable.ReorderableListStateKt;
import com.robinhood.utils.extensions.StringsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.Job;

/* compiled from: InvestingMonitorEditTabsBottomSheet.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"InvestingMonitorEditTabsBottomSheet", "", "tabs", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/db/CuratedList;", "onTabsReordered", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/Job;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/PersistentList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CuratedListItem", "curatedList", "isDragging", "", "(Lcom/robinhood/models/db/CuratedList;ZLandroidx/compose/runtime/Composer;I)V", "feature-investing-monitor_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorEditTabsBottomSheet3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListItem$lambda$6(CuratedList curatedList, boolean z, int i, Composer composer, int i2) {
        CuratedListItem(curatedList, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorEditTabsBottomSheet$lambda$4(ImmutableList3 immutableList3, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestingMonitorEditTabsBottomSheet(immutableList3, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestingMonitorEditTabsBottomSheet(final ImmutableList3<CuratedList> tabs, final Function1<? super List<CuratedList>, ? extends Job> onTabsReordered, final Function0<Unit> onDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z;
        Object objRememberedValue;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(onTabsReordered, "onTabsReordered");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1955948028);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(tabs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTabsReordered) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1955948028, i4, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheet (InvestingMonitorEditTabsBottomSheet.kt:50)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i4 & 112) != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InvestingMonitorEditTabsBottomSheet3.InvestingMonitorEditTabsBottomSheet$lambda$1$lambda$0(onTabsReordered, (List) obj, (Duration) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                final ReorderableListState reorderableListStateM26636rememberReorderableListStateKVH2U2I = ReorderableListStateKt.m26636rememberReorderableListStateKVH2U2I(tabs, (Function2) objRememberedValue, Duration.INSTANCE.m28767getZEROUwyO8pc(), null, null, composerStartRestartGroup, i4 & 14, 24);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(InvestingMonitorEditTabsBottomSheet3.InvestingMonitorEditTabsBottomSheet$lambda$3$lambda$2((SheetValue) obj));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue2, composerStartRestartGroup, 54, 0), null, 0L, ComposableLambda3.rememberComposableLambda(-1514247267, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt.InvestingMonitorEditTabsBottomSheet.1

                    /* compiled from: InvestingMonitorEditTabsBottomSheet.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt$InvestingMonitorEditTabsBottomSheet$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function0<Unit> $onDismiss;
                        final /* synthetic */ ReorderableListState<CuratedList> $reorderListState;

                        AnonymousClass1(Modifier modifier, ReorderableListState<CuratedList> reorderableListState, Function0<Unit> function0) {
                            this.$modifier = modifier;
                            this.$reorderListState = reorderableListState;
                            this.$onDismiss = function0;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(169154280, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheet.<anonymous>.<anonymous> (InvestingMonitorEditTabsBottomSheet.kt:71)");
                            }
                            Modifier modifier = this.$modifier;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            final ReorderableListState<CuratedList> reorderableListState = this.$reorderListState;
                            Function0<Unit> function0 = this.$onDismiss;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String strStringResource = StringResources_androidKt.stringResource(C26507R.string.investing_monitor_edit_tabs_title, composer, 0);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            InvestingMonitorActionsBottomSheetTitle.Title(strStringResource, PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 7, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer, 0, 0);
                            Modifier modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(companion2, NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer, 0, 1), null, 2, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(reorderableListState);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt$InvestingMonitorEditTabsBottomSheet$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return InvestingMonitorEditTabsBottomSheet3.C265451.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1(reorderableListState, (ReorderableLazyListScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            ReorderableLazyColumnKt.ReorderableLazyColumn(modifierNestedScroll$default, null, null, false, null, null, null, false, (Function1) objRememberedValue, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                            BentoButtons.Type type2 = BentoButtons.Type.Primary;
                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C26507R.string.investing_monitor_done, composer, 0), SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion2, BentoButtonBar2.BentoButtonBarTestTagPrimaryButton), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), null, type2, false, false, null, null, null, null, false, null, composer, 1597440, 0, 8104);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2$lambda$1(ReorderableListState reorderableListState, ReorderableLazyListScope ReorderableLazyColumn) {
                            Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
                            ReorderableListStateKt.reorderableItems$default(ReorderableLazyColumn, reorderableListState, "monitor-tab", new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt$InvestingMonitorEditTabsBottomSheet$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return InvestingMonitorEditTabsBottomSheet3.C265451.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1$lambda$0(((Integer) obj).intValue(), (CuratedList) obj2);
                                }
                            }, null, false, false, InvestingMonitorEditTabsBottomSheet.INSTANCE.getLambda$1096342229$feature_investing_monitor_externalDebug(), 56, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final String invoke$lambda$3$lambda$2$lambda$1$lambda$0(int i, CuratedList item) {
                            Intrinsics.checkNotNullParameter(item, "item");
                            String string2 = item.getId().toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            return string2;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                        invoke(rhModalBottomSheet5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i6 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1514247267, i6, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheet.<anonymous> (InvestingMonitorEditTabsBottomSheet.kt:70)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(169154280, true, new AnonymousClass1(modifier4, reorderableListStateM26636rememberReorderableListStateKVH2U2I, onDismiss), composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 6) & 14) | 1572864, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestingMonitorEditTabsBottomSheet3.InvestingMonitorEditTabsBottomSheet$lambda$4(tabs, onTabsReordered, onDismiss, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i4 & 112) != 32) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestingMonitorEditTabsBottomSheet3.InvestingMonitorEditTabsBottomSheet$lambda$1$lambda$0(onTabsReordered, (List) obj, (Duration) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                final ReorderableListState<CuratedList> reorderableListStateM26636rememberReorderableListStateKVH2U2I2 = ReorderableListStateKt.m26636rememberReorderableListStateKVH2U2I(tabs, (Function2) objRememberedValue, Duration.INSTANCE.m28767getZEROUwyO8pc(), null, null, composerStartRestartGroup, i4 & 14, 24);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue2, composerStartRestartGroup, 54, 0), null, 0L, ComposableLambda3.rememberComposableLambda(-1514247267, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt.InvestingMonitorEditTabsBottomSheet.1

                    /* compiled from: InvestingMonitorEditTabsBottomSheet.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt$InvestingMonitorEditTabsBottomSheet$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function0<Unit> $onDismiss;
                        final /* synthetic */ ReorderableListState<CuratedList> $reorderListState;

                        AnonymousClass1(Modifier modifier, ReorderableListState<CuratedList> reorderableListState, Function0<Unit> function0) {
                            this.$modifier = modifier;
                            this.$reorderListState = reorderableListState;
                            this.$onDismiss = function0;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(169154280, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheet.<anonymous>.<anonymous> (InvestingMonitorEditTabsBottomSheet.kt:71)");
                            }
                            Modifier modifier = this.$modifier;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            final ReorderableListState reorderableListState = this.$reorderListState;
                            Function0<Unit> function0 = this.$onDismiss;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String strStringResource = StringResources_androidKt.stringResource(C26507R.string.investing_monitor_edit_tabs_title, composer, 0);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            InvestingMonitorActionsBottomSheetTitle.Title(strStringResource, PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 7, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer, 0, 0);
                            Modifier modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(companion2, NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer, 0, 1), null, 2, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(reorderableListState);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt$InvestingMonitorEditTabsBottomSheet$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return InvestingMonitorEditTabsBottomSheet3.C265451.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1(reorderableListState, (ReorderableLazyListScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            ReorderableLazyColumnKt.ReorderableLazyColumn(modifierNestedScroll$default, null, null, false, null, null, null, false, (Function1) objRememberedValue, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                            BentoButtons.Type type2 = BentoButtons.Type.Primary;
                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C26507R.string.investing_monitor_done, composer, 0), SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion2, BentoButtonBar2.BentoButtonBarTestTagPrimaryButton), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), null, type2, false, false, null, null, null, null, false, null, composer, 1597440, 0, 8104);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2$lambda$1(ReorderableListState reorderableListState, ReorderableLazyListScope ReorderableLazyColumn) {
                            Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
                            ReorderableListStateKt.reorderableItems$default(ReorderableLazyColumn, reorderableListState, "monitor-tab", new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt$InvestingMonitorEditTabsBottomSheet$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return InvestingMonitorEditTabsBottomSheet3.C265451.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1$lambda$0(((Integer) obj).intValue(), (CuratedList) obj2);
                                }
                            }, null, false, false, InvestingMonitorEditTabsBottomSheet.INSTANCE.getLambda$1096342229$feature_investing_monitor_externalDebug(), 56, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final String invoke$lambda$3$lambda$2$lambda$1$lambda$0(int i, CuratedList item) {
                            Intrinsics.checkNotNullParameter(item, "item");
                            String string2 = item.getId().toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            return string2;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                        invoke(rhModalBottomSheet5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i6 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1514247267, i6, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheet.<anonymous> (InvestingMonitorEditTabsBottomSheet.kt:70)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(169154280, true, new AnonymousClass1(modifier4, reorderableListStateM26636rememberReorderableListStateKVH2U2I2, onDismiss), composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 6) & 14) | 1572864, 54);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job InvestingMonitorEditTabsBottomSheet$lambda$1$lambda$0(Function1 function1, List newTabs, Duration duration) {
        Intrinsics.checkNotNullParameter(newTabs, "newTabs");
        return (Job) function1.invoke(newTabs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InvestingMonitorEditTabsBottomSheet$lambda$3$lambda$2(SheetValue newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        return newState != SheetValue.Hidden;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CuratedListItem(final CuratedList curatedList, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifierM4872backgroundbw27NRU$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(1774844575);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(curatedList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1774844575, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.CuratedListItem (InvestingMonitorEditTabsBottomSheet.kt:124)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-947465879);
                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-947402422);
                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(10));
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.DRAG_24), null, bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 56);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            String strTruncateWithEllipses = StringsKt.truncateWithEllipses(curatedList.getDisplayName(), 25);
            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strTruncateWithEllipses, modifierFillMaxWidth$default2, Color.m6701boximpl(jM21425getFg0d7_KjU), null, z ? companion3.getBold() : companion3.getNormal(), null, null, 0, false, 1, 0, null, 0, textM, composerStartRestartGroup, 805306416, 0, 7656);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorEditTabsBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorEditTabsBottomSheet3.CuratedListItem$lambda$6(curatedList, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
