package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconButton2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.assethomes.AssetHomeTopAppBar;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyTopAppBar5;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: RhyTopAppBar.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aS\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"RhyTopBarSearchTag", "", "RhyTopBarInboxTag", "RhyTopBarInboxBadgeTag", "RhyTopBarPrimaryTextTag", "RhyTopBarSecondaryTextTag", "RhyTopAppBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "topBarScrollState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "primaryText", "secondaryText", "callbacks", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/RhyTopAppBarCallbacks;", "shouldShowInboxBadge", "", "isCriticalBadge", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/TopBarScrollState;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/cash/rhy/tab/v2/ui/RhyTopAppBarCallbacks;ZZLandroidx/compose/runtime/Composer;II)V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyTopAppBar5 {
    public static final String RhyTopBarInboxBadgeTag = "rhy_top_bar_inbox_badge";
    public static final String RhyTopBarInboxTag = "rhy_top_bar_inbox";
    public static final String RhyTopBarPrimaryTextTag = "rhy_top_bar_primary_text";
    public static final String RhyTopBarSearchTag = "rhy_top_bar_search";
    public static final String RhyTopBarSecondaryTextTag = "rhy_top_bar_secondary_text";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyTopAppBar$lambda$0(Modifier modifier, TopBarScrollState topBarScrollState, String str, String str2, RhyTopAppBar4 rhyTopAppBar4, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        RhyTopAppBar(modifier, topBarScrollState, str, str2, rhyTopAppBar4, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhyTopAppBar(Modifier modifier, final TopBarScrollState topBarScrollState, String str, String str2, final RhyTopAppBar4 callbacks, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        int i4;
        String str4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        final boolean z5;
        Composer composer2;
        final String str5;
        final String str6;
        final boolean z6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-962785706);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                str3 = str;
                i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str4 = str2;
                    i3 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        z3 = z;
                        i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            z4 = z2;
                            i3 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                        }
                        if ((i3 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            String str7 = i8 == 0 ? null : str3;
                            String str8 = i4 == 0 ? str4 : null;
                            final boolean z7 = i5 == 0 ? false : z3;
                            z5 = i6 == 0 ? z4 : false;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-962785706, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBar (RhyTopAppBar.kt:55)");
                            }
                            Modifier modifier5 = modifier4;
                            boolean z8 = z7;
                            composer2 = composerStartRestartGroup;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1414032183, true, new C103761(topBarScrollState, str7, str8), composerStartRestartGroup, 54), modifier5, null, ComposableLambda3.rememberComposableLambda(-1636359308, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt.RhyTopAppBar.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                    invoke(row5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer3, int i9) {
                                    final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                                    final SnapshotState snapshotState;
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i9 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1636359308, i9, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBar.<anonymous> (RhyTopAppBar.kt:79)");
                                    }
                                    Object obj = callbacks;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer3.changedInstance(obj);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RhyTopAppBar6(obj);
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    IconButton2.IconButton((Function0) ((KFunction) objRememberedValue), ModifiersKt.autoLogEvents$default(TestTag3.testTag(companion, RhyTopAppBar5.RhyTopBarSearchTag), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RHY_SPENDING_HOME, null, null, null, 14, null), UserInteractionEventData.Action.VIEW_SEARCH, null, new Component(Component.ComponentType.BUTTON, AssetHomeTopAppBar.SEARCH_IDENTIFIER, null, 4, null), null, 41, null), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), false, null, RhyTopAppBar.INSTANCE.getLambda$1139649368$feature_cash_rhy_tab_externalDebug(), composer3, 24576, 12);
                                    final boolean z9 = z7;
                                    final boolean z10 = z5;
                                    final RhyTopAppBar4 rhyTopAppBar4 = callbacks;
                                    composer3.startReplaceGroup(-1003410150);
                                    composer3.startReplaceGroup(212064437);
                                    composer3.endReplaceGroup();
                                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    Composer.Companion companion2 = Composer.INSTANCE;
                                    if (objRememberedValue2 == companion2.getEmpty()) {
                                        objRememberedValue2 = new Measurer2(density);
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    final Measurer2 measurer2 = (Measurer2) objRememberedValue2;
                                    Object objRememberedValue3 = composer3.rememberedValue();
                                    if (objRememberedValue3 == companion2.getEmpty()) {
                                        objRememberedValue3 = new ConstraintLayoutScope();
                                        composer3.updateRememberedValue(objRememberedValue3);
                                    }
                                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue3;
                                    Object objRememberedValue4 = composer3.rememberedValue();
                                    if (objRememberedValue4 == companion2.getEmpty()) {
                                        objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                        composer3.updateRememberedValue(objRememberedValue4);
                                    }
                                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue4;
                                    Object objRememberedValue5 = composer3.rememberedValue();
                                    if (objRememberedValue5 == companion2.getEmpty()) {
                                        objRememberedValue5 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                        composer3.updateRememberedValue(objRememberedValue5);
                                    }
                                    final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue5;
                                    Object objRememberedValue6 = composer3.rememberedValue();
                                    if (objRememberedValue6 == companion2.getEmpty()) {
                                        objRememberedValue6 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                        composer3.updateRememberedValue(objRememberedValue6);
                                    }
                                    final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue6;
                                    boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                                    final int i10 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                    boolean zChanged = zChangedInstance2 | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                                    Object objRememberedValue7 = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue7 == companion2.getEmpty()) {
                                        objRememberedValue7 = new MeasurePolicy() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$invoke$$inlined$ConstraintLayout$2
                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                                return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i11);
                                            }

                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                                return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i11);
                                            }

                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                            public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                                return super.minIntrinsicHeight(intrinsicMeasureScope, list, i11);
                                            }

                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                            public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                                return super.minIntrinsicWidth(intrinsicMeasureScope, list, i11);
                                            }

                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                            /* renamed from: measure-3p2s80s */
                                            public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                snapshotState3.getValue();
                                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i10);
                                                snapshotState2.getValue();
                                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                                final Measurer2 measurer22 = measurer2;
                                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$invoke$$inlined$ConstraintLayout$2.1
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
                                        composer3.updateRememberedValue(objRememberedValue7);
                                    } else {
                                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                        snapshotState = snapshotState2;
                                    }
                                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue7;
                                    Object objRememberedValue8 = composer3.rememberedValue();
                                    if (objRememberedValue8 == companion2.getEmpty()) {
                                        objRememberedValue8 = new Function0<Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$invoke$$inlined$ConstraintLayout$3
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
                                        composer3.updateRememberedValue(objRememberedValue8);
                                    }
                                    final Function0 function0 = (Function0) objRememberedValue8;
                                    boolean zChangedInstance3 = composer3.changedInstance(measurer2);
                                    Object objRememberedValue9 = composer3.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue9 == companion2.getEmpty()) {
                                        objRememberedValue9 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$invoke$$inlined$ConstraintLayout$4
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
                                        composer3.updateRememberedValue(objRememberedValue9);
                                    }
                                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(companion, false, (Function1) objRememberedValue9, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$invoke$$inlined$ConstraintLayout$5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i11) {
                                            if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1200550679, i11, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                            }
                                            snapshotState3.setValue(Unit.INSTANCE);
                                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                            constraintLayoutScope.reset();
                                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                            composer4.startReplaceGroup(-1783285810);
                                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            composer4.startReplaceGroup(1849434622);
                                            Object objRememberedValue10 = composer4.rememberedValue();
                                            Composer.Companion companion4 = Composer.INSTANCE;
                                            if (objRememberedValue10 == companion4.getEmpty()) {
                                                objRememberedValue10 = RhyTopAppBar7.INSTANCE;
                                                composer4.updateRememberedValue(objRememberedValue10);
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10);
                                            Alignment.Companion companion5 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs);
                                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceGroup(5004770);
                                            boolean zChangedInstance4 = composer4.changedInstance(rhyTopAppBar4);
                                            Object objRememberedValue11 = composer4.rememberedValue();
                                            if (zChangedInstance4 || objRememberedValue11 == companion4.getEmpty()) {
                                                objRememberedValue11 = new RhyTopAppBar8(rhyTopAppBar4);
                                                composer4.updateRememberedValue(objRememberedValue11);
                                            }
                                            composer4.endReplaceGroup();
                                            IconButton2.IconButton((Function0) ((KFunction) objRememberedValue11), ModifiersKt.autoLogEvents$default(TestTag3.testTag(companion3, RhyTopAppBar5.RhyTopBarInboxTag), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RHY_SPENDING_HOME, null, null, null, 14, null), UserInteractionEventData.Action.VIEW_SEARCH, null, new Component(Component.ComponentType.BUTTON, "top_nav-inbox", null, 4, null), null, 41, null), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), false, null, RhyTopAppBar.INSTANCE.m11705getLambda$467768933$feature_cash_rhy_tab_externalDebug(), composer4, 24576, 12);
                                            Composer composer5 = composer4;
                                            composer5.endNode();
                                            composer5.startReplaceGroup(1882176516);
                                            if (z9) {
                                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(z10 ? 5 : 8);
                                                Modifier modifierTestTag = TestTag3.testTag(companion3, RhyTopAppBar5.RhyTopBarInboxBadgeTag);
                                                composer5.startReplaceGroup(-1633490746);
                                                boolean zChanged2 = composer5.changed(constraintLayoutBaseScope4Component1) | composer5.changed(fM7995constructorimpl);
                                                Object objRememberedValue12 = composer5.rememberedValue();
                                                if (zChanged2 || objRememberedValue12 == companion4.getEmpty()) {
                                                    objRememberedValue12 = new RhyTopAppBar9(constraintLayoutBaseScope4Component1, fM7995constructorimpl);
                                                    composer5.updateRememberedValue(objRememberedValue12);
                                                }
                                                composer5.endReplaceGroup();
                                                Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(modifierTestTag, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue12);
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, modifierConstrainAs2);
                                                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                                if (composer5.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor2);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                                                if (z10) {
                                                    composer5.startReplaceGroup(1622136904);
                                                    float f = 20;
                                                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C11048R.drawable.svg_ic_critical_badge), null, null, null, 0, null, composer5, 0, 62), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                                                    composer5 = composer4;
                                                    composer5.endReplaceGroup();
                                                } else {
                                                    composer5.startReplaceGroup(1622553172);
                                                    float f2 = 14;
                                                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C11048R.drawable.tab_badge), null, null, null, 0, null, composer5, 0, 62), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f2)), C2002Dp.m7995constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                                                    composer5 = composer4;
                                                    composer5.endReplaceGroup();
                                                }
                                                composer5.endNode();
                                            }
                                            composer5.endReplaceGroup();
                                            composer5.endReplaceGroup();
                                            if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                                EffectsKt.SideEffect(function0, composer5, 6);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), measurePolicy, composer3, 48, 0);
                                    composer3.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer2, ((i3 << 3) & 112) | 3078, 0, 1972);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            String str9 = str7;
                            str5 = str8;
                            str6 = str9;
                            z6 = z8;
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            str6 = str3;
                            str5 = str4;
                            z6 = z3;
                            z5 = z4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return RhyTopAppBar5.RhyTopAppBar$lambda$0(modifier3, topBarScrollState, str6, str5, callbacks, z6, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    z4 = z2;
                    if ((i3 & 599187) != 599186) {
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifier52 = modifier4;
                        boolean z82 = z7;
                        composer2 = composerStartRestartGroup;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1414032183, true, new C103761(topBarScrollState, str7, str8), composerStartRestartGroup, 54), modifier52, null, ComposableLambda3.rememberComposableLambda(-1636359308, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt.RhyTopAppBar.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                invoke(row5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer3, int i9) {
                                final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                                final SnapshotState snapshotState;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i9 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1636359308, i9, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBar.<anonymous> (RhyTopAppBar.kt:79)");
                                }
                                Object obj = callbacks;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer3.changedInstance(obj);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RhyTopAppBar6(obj);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                Modifier.Companion companion = Modifier.INSTANCE;
                                IconButton2.IconButton((Function0) ((KFunction) objRememberedValue), ModifiersKt.autoLogEvents$default(TestTag3.testTag(companion, RhyTopAppBar5.RhyTopBarSearchTag), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RHY_SPENDING_HOME, null, null, null, 14, null), UserInteractionEventData.Action.VIEW_SEARCH, null, new Component(Component.ComponentType.BUTTON, AssetHomeTopAppBar.SEARCH_IDENTIFIER, null, 4, null), null, 41, null), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), false, null, RhyTopAppBar.INSTANCE.getLambda$1139649368$feature_cash_rhy_tab_externalDebug(), composer3, 24576, 12);
                                final boolean z9 = z7;
                                final boolean z10 = z5;
                                final RhyTopAppBar4 rhyTopAppBar4 = callbacks;
                                composer3.startReplaceGroup(-1003410150);
                                composer3.startReplaceGroup(212064437);
                                composer3.endReplaceGroup();
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                Object objRememberedValue2 = composer3.rememberedValue();
                                Composer.Companion companion2 = Composer.INSTANCE;
                                if (objRememberedValue2 == companion2.getEmpty()) {
                                    objRememberedValue2 = new Measurer2(density);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                final Measurer2 measurer2 = (Measurer2) objRememberedValue2;
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (objRememberedValue3 == companion2.getEmpty()) {
                                    objRememberedValue3 = new ConstraintLayoutScope();
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue3;
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (objRememberedValue4 == companion2.getEmpty()) {
                                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue4;
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (objRememberedValue5 == companion2.getEmpty()) {
                                    objRememberedValue5 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue5;
                                Object objRememberedValue6 = composer3.rememberedValue();
                                if (objRememberedValue6 == companion2.getEmpty()) {
                                    objRememberedValue6 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                    composer3.updateRememberedValue(objRememberedValue6);
                                }
                                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue6;
                                boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                                final int i10 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                boolean zChanged = zChangedInstance2 | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                                Object objRememberedValue7 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue7 == companion2.getEmpty()) {
                                    objRememberedValue7 = new MeasurePolicy() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$invoke$$inlined$ConstraintLayout$2
                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i11);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i11);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i11);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i11);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        /* renamed from: measure-3p2s80s */
                                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                            final Map linkedHashMap = new LinkedHashMap();
                                            snapshotState3.getValue();
                                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i10);
                                            snapshotState2.getValue();
                                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                            final Measurer2 measurer22 = measurer2;
                                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$invoke$$inlined$ConstraintLayout$2.1
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
                                    composer3.updateRememberedValue(objRememberedValue7);
                                } else {
                                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                    snapshotState = snapshotState2;
                                }
                                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue7;
                                Object objRememberedValue8 = composer3.rememberedValue();
                                if (objRememberedValue8 == companion2.getEmpty()) {
                                    objRememberedValue8 = new Function0<Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$invoke$$inlined$ConstraintLayout$3
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
                                    composer3.updateRememberedValue(objRememberedValue8);
                                }
                                final Function0 function0 = (Function0) objRememberedValue8;
                                boolean zChangedInstance3 = composer3.changedInstance(measurer2);
                                Object objRememberedValue9 = composer3.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue9 == companion2.getEmpty()) {
                                    objRememberedValue9 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$invoke$$inlined$ConstraintLayout$4
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
                                    composer3.updateRememberedValue(objRememberedValue9);
                                }
                                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(companion, false, (Function1) objRememberedValue9, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$invoke$$inlined$ConstraintLayout$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1200550679, i11, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                        }
                                        snapshotState3.setValue(Unit.INSTANCE);
                                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                        constraintLayoutScope.reset();
                                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                        composer4.startReplaceGroup(-1783285810);
                                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        composer4.startReplaceGroup(1849434622);
                                        Object objRememberedValue10 = composer4.rememberedValue();
                                        Composer.Companion companion4 = Composer.INSTANCE;
                                        if (objRememberedValue10 == companion4.getEmpty()) {
                                            objRememberedValue10 = RhyTopAppBar7.INSTANCE;
                                            composer4.updateRememberedValue(objRememberedValue10);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10);
                                        Alignment.Companion companion5 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs);
                                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChangedInstance4 = composer4.changedInstance(rhyTopAppBar4);
                                        Object objRememberedValue11 = composer4.rememberedValue();
                                        if (zChangedInstance4 || objRememberedValue11 == companion4.getEmpty()) {
                                            objRememberedValue11 = new RhyTopAppBar8(rhyTopAppBar4);
                                            composer4.updateRememberedValue(objRememberedValue11);
                                        }
                                        composer4.endReplaceGroup();
                                        IconButton2.IconButton((Function0) ((KFunction) objRememberedValue11), ModifiersKt.autoLogEvents$default(TestTag3.testTag(companion3, RhyTopAppBar5.RhyTopBarInboxTag), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RHY_SPENDING_HOME, null, null, null, 14, null), UserInteractionEventData.Action.VIEW_SEARCH, null, new Component(Component.ComponentType.BUTTON, "top_nav-inbox", null, 4, null), null, 41, null), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), false, null, RhyTopAppBar.INSTANCE.m11705getLambda$467768933$feature_cash_rhy_tab_externalDebug(), composer4, 24576, 12);
                                        Composer composer5 = composer4;
                                        composer5.endNode();
                                        composer5.startReplaceGroup(1882176516);
                                        if (z9) {
                                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(z10 ? 5 : 8);
                                            Modifier modifierTestTag = TestTag3.testTag(companion3, RhyTopAppBar5.RhyTopBarInboxBadgeTag);
                                            composer5.startReplaceGroup(-1633490746);
                                            boolean zChanged2 = composer5.changed(constraintLayoutBaseScope4Component1) | composer5.changed(fM7995constructorimpl);
                                            Object objRememberedValue12 = composer5.rememberedValue();
                                            if (zChanged2 || objRememberedValue12 == companion4.getEmpty()) {
                                                objRememberedValue12 = new RhyTopAppBar9(constraintLayoutBaseScope4Component1, fM7995constructorimpl);
                                                composer5.updateRememberedValue(objRememberedValue12);
                                            }
                                            composer5.endReplaceGroup();
                                            Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(modifierTestTag, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue12);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, modifierConstrainAs2);
                                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                            if (composer5.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor2);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                                            if (z10) {
                                                composer5.startReplaceGroup(1622136904);
                                                float f = 20;
                                                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C11048R.drawable.svg_ic_critical_badge), null, null, null, 0, null, composer5, 0, 62), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                                                composer5 = composer4;
                                                composer5.endReplaceGroup();
                                            } else {
                                                composer5.startReplaceGroup(1622553172);
                                                float f2 = 14;
                                                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C11048R.drawable.tab_badge), null, null, null, 0, null, composer5, 0, 62), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f2)), C2002Dp.m7995constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                                                composer5 = composer4;
                                                composer5.endReplaceGroup();
                                            }
                                            composer5.endNode();
                                        }
                                        composer5.endReplaceGroup();
                                        composer5.endReplaceGroup();
                                        if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                            EffectsKt.SideEffect(function0, composer5, 6);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), measurePolicy, composer3, 48, 0);
                                composer3.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer2, ((i3 << 3) & 112) | 3078, 0, 1972);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        String str92 = str7;
                        str5 = str8;
                        str6 = str92;
                        z6 = z82;
                        modifier3 = modifier52;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z3 = z;
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                z4 = z2;
                if ((i3 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str4 = str2;
            if ((i2 & 16) != 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            z4 = z2;
            if ((i3 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str3 = str;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str4 = str2;
        if ((i2 & 16) != 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        z4 = z2;
        if ((i3 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: RhyTopAppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$1 */
    static final class C103761 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $primaryText;
        final /* synthetic */ String $secondaryText;
        final /* synthetic */ TopBarScrollState $topBarScrollState;

        C103761(TopBarScrollState topBarScrollState, String str, String str2) {
            this.$topBarScrollState = topBarScrollState;
            this.$primaryText = str;
            this.$secondaryText = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTraversalGroup(semantics, true);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1414032183, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBar.<anonymous> (RhyTopAppBar.kt:59)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAlpha = Alpha.alpha(companion, this.$topBarScrollState.getOpacity());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyTopAppBar5.C103761.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierAlpha, false, (Function1) objRememberedValue, 1, null);
            String strStringResource = this.$primaryText;
            String str = this.$secondaryText;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierSemantics$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, RhyTopAppBar5.RhyTopBarPrimaryTextTag);
            composer.startReplaceGroup(-489624711);
            if (strStringResource == null) {
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_overview_title, composer, 0);
            }
            composer.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextL(), composer, 48, 0, 8188);
            composer.startReplaceGroup(-489619140);
            if (str != null) {
                BentoText2.m20747BentoText38GnDrw(str, TestTag3.testTag(companion, RhyTopAppBar5.RhyTopBarSecondaryTextTag), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 48, 0, 8184);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
