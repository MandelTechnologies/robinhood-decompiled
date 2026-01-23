package com.robinhood.shared.crypto.transfer.unified;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoSegmentedControl3;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedViewState;
import com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControl;
import com.robinhood.shared.crypto.transfer.util.NavigationType;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TopBarWithSegmentedControl.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aw\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\nX\u008a\u008e\u0002"}, m3636d2 = {"TopAppBarWithSegmentedControl", "", "topBarState", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$TopBarState;", "activeScreen", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$Screen;", "navigationType", "Lcom/robinhood/shared/crypto/transfer/util/NavigationType;", "onTabSelected", "Lkotlin/Function1;", "", "onCloseClick", "Lkotlin/Function0;", "onTipsActionClick", "modifier", "Landroidx/compose/ui/Modifier;", "showActionToggle", "", "onEnterAddressManually", "(Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$TopBarState;Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$Screen;Lcom/robinhood/shared/crypto/transfer/util/NavigationType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "selectedIndex"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TopBarWithSegmentedControl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarWithSegmentedControl$lambda$9(CryptoTransferUnifiedViewState.TopBarState topBarState, CryptoTransferUnifiedViewState.Screen screen, NavigationType navigationType, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, boolean z, Function0 function03, int i, int i2, Composer composer, int i3) {
        TopAppBarWithSegmentedControl(topBarState, screen, navigationType, function1, function0, function02, modifier, z, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopAppBarWithSegmentedControl(final CryptoTransferUnifiedViewState.TopBarState topBarState, final CryptoTransferUnifiedViewState.Screen activeScreen, final NavigationType navigationType, final Function1<? super Integer, Unit> onTabSelected, final Function0<Unit> onCloseClick, final Function0<Unit> onTipsActionClick, Modifier modifier, boolean z, final Function0<Unit> onEnterAddressManually, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z3;
        int i5;
        Modifier modifier3;
        List listEmptyList;
        Composer composer2;
        final boolean z4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(topBarState, "topBarState");
        Intrinsics.checkNotNullParameter(activeScreen, "activeScreen");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onTipsActionClick, "onTipsActionClick");
        Intrinsics.checkNotNullParameter(onEnterAddressManually, "onEnterAddressManually");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1171578420);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(topBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(activeScreen.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(navigationType.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTabSelected) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTipsActionClick) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onEnterAddressManually) ? 67108864 : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                boolean z5 = i4 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1171578420, i3, -1, "com.robinhood.shared.crypto.transfer.unified.TopAppBarWithSegmentedControl (TopBarWithSegmentedControl.kt:48)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(activeScreen.getIndex());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_show_qr_tab_content_description, composerStartRestartGroup, 0);
                z3 = z5;
                final String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_show_qr_tab_hint, composerStartRestartGroup, 0);
                final String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_scan_qr_tab_content_description, composerStartRestartGroup, 0);
                final String strStringResource4 = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_scan_qr_tab_hint, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-605399120);
                if (!z3) {
                    BentoSegmentedControl3.Icon.Size16 size16 = new BentoSegmentedControl3.Icon.Size16(ServerToBentoAssetMapper2.QR_16);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i7 = i3 & 7168;
                    i5 = i3;
                    boolean zChanged = composerStartRestartGroup.changed(strStringResource) | composerStartRestartGroup.changed(strStringResource2) | (i7 == 2048);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    modifier3 = modifier2;
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TopBarWithSegmentedControl.TopAppBarWithSegmentedControl$lambda$5$lambda$4(strStringResource, strStringResource2, onTabSelected, snapshotIntState2, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null);
                    Screen loggingReceiveScreen = topBarState.getLoggingReceiveScreen();
                    Component.ComponentType componentType = Component.ComponentType.SEGMENT;
                    Segment segment = new Segment(size16, null, ModifiersKt.autoLogEvents$default(modifierSemantics$default, new UserInteractionEventDescriptor(null, loggingReceiveScreen, null, null, new Component(componentType, null, null, 6, null), null, 45, null), false, false, false, true, false, null, 110, null), 2, null);
                    BentoSegmentedControl3.Icon.Size16 size162 = new BentoSegmentedControl3.Icon.Size16(ServerToBentoAssetMapper2.MESSAGE_SEND_16);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChanged2 = composerStartRestartGroup.changed(strStringResource3) | composerStartRestartGroup.changed(strStringResource4) | (i7 == 2048);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TopBarWithSegmentedControl.TopAppBarWithSegmentedControl$lambda$8$lambda$7(strStringResource3, strStringResource4, onTabSelected, snapshotIntState2, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    listEmptyList = CollectionsKt.listOf((Object[]) new Segment[]{segment, new Segment(size162, null, ModifiersKt.autoLogEvents$default(SemanticsModifier6.semantics$default(companion2, false, (Function1) objRememberedValue3, 1, null), new UserInteractionEventDescriptor(null, topBarState.getLoggingSendScreen(), null, null, new Component(componentType, null, null, 6, null), null, 45, null), false, false, false, true, false, null, 110, null), 2, null)});
                } else {
                    i5 = i3;
                    modifier3 = modifier2;
                    listEmptyList = CollectionsKt.emptyList();
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1399680263, true, new C384521(listEmptyList, topBarState, onTabSelected, snapshotIntState2), composerStartRestartGroup, 54), modifier5, ComposableLambda3.rememberComposableLambda(-368025779, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt.TopAppBarWithSegmentedControl.2

                    /* compiled from: TopBarWithSegmentedControl.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt$TopAppBarWithSegmentedControl$2$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[NavigationType.values().length];
                            try {
                                iArr[NavigationType.PUSH.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[NavigationType.MODAL.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                        int i9;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i8 & 6) == 0) {
                            i9 = i8 | ((i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2);
                        } else {
                            i9 = i8;
                        }
                        if ((i9 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368025779, i9, -1, "com.robinhood.shared.crypto.transfer.unified.TopAppBarWithSegmentedControl.<anonymous> (TopBarWithSegmentedControl.kt:126)");
                        }
                        if (topBarState.getShouldAlwaysShowBackButton()) {
                            composer3.startReplaceGroup(1195588144);
                            BentoAppBar.m20575BentoBackButtondrOMvmE(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, null, onCloseClick, composer3, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 6);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1195791163);
                            int i10 = WhenMappings.$EnumSwitchMapping$0[navigationType.ordinal()];
                            if (i10 == 1) {
                                composer3.startReplaceGroup(-1485444232);
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onCloseClick, composer3, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                composer3.endReplaceGroup();
                            } else {
                                if (i10 != 2) {
                                    composer3.startReplaceGroup(-1485446201);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(-1485441414);
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, onCloseClick, composer3, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                composer3.endReplaceGroup();
                            }
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1075274990, true, new C384543(topBarState, onEnterAddressManually, onTipsActionClick), composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, ((i5 >> 15) & 112) | 3462, 0, 2032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                z4 = z2;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TopBarWithSegmentedControl.TopAppBarWithSegmentedControl$lambda$9(topBarState, activeScreen, navigationType, onTabSelected, onCloseClick, onTipsActionClick, modifier4, z4, onEnterAddressManually, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
            if (i6 != 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final String strStringResource5 = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_show_qr_tab_content_description, composerStartRestartGroup, 0);
            z3 = z5;
            final String strStringResource22 = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_show_qr_tab_hint, composerStartRestartGroup, 0);
            final String strStringResource32 = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_scan_qr_tab_content_description, composerStartRestartGroup, 0);
            final String strStringResource42 = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_scan_qr_tab_hint, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-605399120);
            if (!z3) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier52 = modifier3;
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1399680263, true, new C384521(listEmptyList, topBarState, onTabSelected, snapshotIntState22), composerStartRestartGroup, 54), modifier52, ComposableLambda3.rememberComposableLambda(-368025779, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt.TopAppBarWithSegmentedControl.2

                /* compiled from: TopBarWithSegmentedControl.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt$TopAppBarWithSegmentedControl$2$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[NavigationType.values().length];
                        try {
                            iArr[NavigationType.PUSH.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[NavigationType.MODAL.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                    int i9;
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i8 & 6) == 0) {
                        i9 = i8 | ((i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2);
                    } else {
                        i9 = i8;
                    }
                    if ((i9 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368025779, i9, -1, "com.robinhood.shared.crypto.transfer.unified.TopAppBarWithSegmentedControl.<anonymous> (TopBarWithSegmentedControl.kt:126)");
                    }
                    if (topBarState.getShouldAlwaysShowBackButton()) {
                        composer3.startReplaceGroup(1195588144);
                        BentoAppBar.m20575BentoBackButtondrOMvmE(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, null, onCloseClick, composer3, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 6);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1195791163);
                        int i10 = WhenMappings.$EnumSwitchMapping$0[navigationType.ordinal()];
                        if (i10 == 1) {
                            composer3.startReplaceGroup(-1485444232);
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onCloseClick, composer3, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                            composer3.endReplaceGroup();
                        } else {
                            if (i10 != 2) {
                                composer3.startReplaceGroup(-1485446201);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-1485441414);
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, onCloseClick, composer3, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                            composer3.endReplaceGroup();
                        }
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1075274990, true, new C384543(topBarState, onEnterAddressManually, onTipsActionClick), composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, ((i5 >> 15) & 112) | 3462, 0, 2032);
            if (ComposerKt.isTraceInProgress()) {
            }
            z4 = z3;
            modifier4 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarWithSegmentedControl$lambda$5$lambda$4(String str, String str2, final Function1 function1, final SnapshotIntState2 snapshotIntState2, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.m7496setRolekuIjeqM(semantics, Role.INSTANCE.m7483getImageo7Vup1c());
        SemanticsPropertiesKt.onClick(semantics, str2, new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(TopBarWithSegmentedControl.TopAppBarWithSegmentedControl$lambda$5$lambda$4$lambda$3(function1, snapshotIntState2));
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TopAppBarWithSegmentedControl$lambda$5$lambda$4$lambda$3(Function1 function1, SnapshotIntState2 snapshotIntState2) {
        if (snapshotIntState2.getIntValue() != 0) {
            function1.invoke(0);
        }
        snapshotIntState2.setIntValue(0);
        return true;
    }

    /* compiled from: TopBarWithSegmentedControl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt$TopAppBarWithSegmentedControl$1 */
    static final class C384521 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<Integer, Unit> $onTabSelected;
        final /* synthetic */ SnapshotIntState2 $selectedIndex$delegate;
        final /* synthetic */ List<Segment> $tabs;
        final /* synthetic */ CryptoTransferUnifiedViewState.TopBarState $topBarState;

        /* JADX WARN: Multi-variable type inference failed */
        C384521(List<Segment> list, CryptoTransferUnifiedViewState.TopBarState topBarState, Function1<? super Integer, Unit> function1, SnapshotIntState2 snapshotIntState2) {
            this.$tabs = list;
            this.$topBarState = topBarState;
            this.$onTabSelected = function1;
            this.$selectedIndex$delegate = snapshotIntState2;
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1399680263, i, -1, "com.robinhood.shared.crypto.transfer.unified.TopAppBarWithSegmentedControl.<anonymous> (TopBarWithSegmentedControl.kt:104)");
            }
            if (!this.$tabs.isEmpty()) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                CryptoTransferUnifiedViewState.TopBarState topBarState = this.$topBarState;
                List<Segment> list = this.$tabs;
                final Function1<Integer, Unit> function1 = this.$onTabSelected;
                final SnapshotIntState2 snapshotIntState2 = this.$selectedIndex$delegate;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer.startReplaceGroup(1959700172);
                if (topBarState.getShouldShowToggle()) {
                    int iTopAppBarWithSegmentedControl$lambda$1 = TopBarWithSegmentedControl.TopAppBarWithSegmentedControl$lambda$1(snapshotIntState2);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt$TopAppBarWithSegmentedControl$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TopBarWithSegmentedControl.C384521.invoke$lambda$2$lambda$1$lambda$0(function1, snapshotIntState2, ((Integer) obj).intValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    composer2 = composer;
                    BentoSegmentedControl2.BentoSegmentedControl(list, iTopAppBarWithSegmentedControl$lambda$1, (Function1) objRememberedValue, SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(120)), false, composer2, 3072, 16);
                } else {
                    composer2 = composer;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, SnapshotIntState2 snapshotIntState2, int i) {
            if (i != TopBarWithSegmentedControl.TopAppBarWithSegmentedControl$lambda$1(snapshotIntState2)) {
                function1.invoke(Integer.valueOf(i));
                TopBarWithSegmentedControl.TopAppBarWithSegmentedControl$lambda$2(snapshotIntState2, i);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TopAppBarWithSegmentedControl$lambda$1(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarWithSegmentedControl$lambda$8$lambda$7(String str, String str2, final Function1 function1, final SnapshotIntState2 snapshotIntState2, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.m7496setRolekuIjeqM(semantics, Role.INSTANCE.m7483getImageo7Vup1c());
        SemanticsPropertiesKt.onClick(semantics, str2, new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(TopBarWithSegmentedControl.TopAppBarWithSegmentedControl$lambda$8$lambda$7$lambda$6(function1, snapshotIntState2));
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TopAppBarWithSegmentedControl$lambda$8$lambda$7$lambda$6(Function1 function1, SnapshotIntState2 snapshotIntState2) {
        if (snapshotIntState2.getIntValue() != 1) {
            function1.invoke(1);
        }
        snapshotIntState2.setIntValue(1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TopAppBarWithSegmentedControl$lambda$2(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* compiled from: TopBarWithSegmentedControl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt$TopAppBarWithSegmentedControl$3 */
    static final class C384543 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onEnterAddressManually;
        final /* synthetic */ Function0<Unit> $onTipsActionClick;
        final /* synthetic */ CryptoTransferUnifiedViewState.TopBarState $topBarState;

        C384543(CryptoTransferUnifiedViewState.TopBarState topBarState, Function0<Unit> function0, Function0<Unit> function02) {
            this.$topBarState = topBarState;
            this.$onEnterAddressManually = function0;
            this.$onTipsActionClick = function02;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1075274990, i, -1, "com.robinhood.shared.crypto.transfer.unified.TopAppBarWithSegmentedControl.<anonymous> (TopBarWithSegmentedControl.kt:139)");
            }
            if (this.$topBarState.getShouldShowEnterManuallyButton()) {
                composer.startReplaceGroup(1651202530);
                String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_qr_send_cta, composer, 0);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$onEnterAddressManually);
                final Function0<Unit> function0 = this.$onEnterAddressManually;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.TopBarWithSegmentedControlKt$TopAppBarWithSegmentedControl$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopBarWithSegmentedControl.C384543.invoke$lambda$1$lambda$0(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, composer, 0, 120);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1651483917);
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), StringResources_androidKt.stringResource(C37934R.string.crypto_transfers_tip_sheet_title, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), this.$onTipsActionClick, false, composer, BentoIcon4.Size24.$stable, 32);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
