package com.robinhood.android.futures.assethome.sections;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.futures.assethome.C16973R;
import com.robinhood.android.futures.assethome.sections.NetReturnsBottomSheet4;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NetReturnsBottomSheet.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0007¢\u0006\u0002\u0010\f\u001aG\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"EMPTY_PLACEHOLDER", "", "NetReturnsBottomSheet", "", "viewState", "Lcom/robinhood/android/futures/assethome/sections/NetReturnsBottomSheetViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "onDismiss", "Lkotlin/Function0;", "(Lcom/robinhood/android/futures/assethome/sections/NetReturnsBottomSheetViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "NetReturnsBottomSheetContent", "netReturns", "Lcom/robinhood/utils/resource/StringResource;", "currentSpanPnlTitle", "currentSpanPnlValue", "commissionsValue", "exchangeFeesValue", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewNetReturnBottomSheetLoading", "(Landroidx/compose/runtime/Composer;I)V", "PreviewNetReturnBottomSheetLoaded", "feature-futures-asset-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.assethome.sections.NetReturnsBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class NetReturnsBottomSheet4 {
    private static final String EMPTY_PLACEHOLDER = "--------";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetReturnsBottomSheet$lambda$0(NetReturnsBottomSheetViewState netReturnsBottomSheetViewState, Modifier modifier, SheetState sheetState, Function0 function0, int i, int i2, Composer composer, int i3) {
        NetReturnsBottomSheet(netReturnsBottomSheetViewState, modifier, sheetState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetReturnsBottomSheetContent$lambda$2(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NetReturnsBottomSheetContent(stringResource, stringResource2, stringResource3, stringResource4, stringResource5, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewNetReturnBottomSheetLoaded$lambda$4(int i, Composer composer, int i2) {
        PreviewNetReturnBottomSheetLoaded(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewNetReturnBottomSheetLoading$lambda$3(int i, Composer composer, int i2) {
        PreviewNetReturnBottomSheetLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NetReturnsBottomSheet(final NetReturnsBottomSheetViewState viewState, Modifier modifier, SheetState sheetState, final Function0<Unit> onDismiss, Composer composer, final int i, final int i2) {
        int i3;
        final SheetState sheetState2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(2015321690);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(sheetState)) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                sheetState2 = sheetState;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier3 = modifier;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier3, false, sheetState2, null, 0L, ComposableLambda3.rememberComposableLambda(1673363553, true, new C169981(viewState, onDismiss), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 1572864 | (i3 & 112) | ((i3 << 3) & 7168), 52);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            } else {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                    i3 &= -897;
                }
                sheetState2 = sheetState;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2015321690, i3, -1, "com.robinhood.android.futures.assethome.sections.NetReturnsBottomSheet (NetReturnsBottomSheet.kt:38)");
                }
                Modifier modifier32 = modifier;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier32, false, sheetState2, null, 0L, ComposableLambda3.rememberComposableLambda(1673363553, true, new C169981(viewState, onDismiss), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 1572864 | (i3 & 112) | ((i3 << 3) & 7168), 52);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier32;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            sheetState2 = sheetState;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.sections.NetReturnsBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetReturnsBottomSheet4.NetReturnsBottomSheet$lambda$0(viewState, modifier2, sheetState2, onDismiss, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: NetReturnsBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.assethome.sections.NetReturnsBottomSheetKt$NetReturnsBottomSheet$1 */
    static final class C169981 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ NetReturnsBottomSheetViewState $viewState;

        C169981(NetReturnsBottomSheetViewState netReturnsBottomSheetViewState, Function0<Unit> function0) {
            this.$viewState = netReturnsBottomSheetViewState;
            this.$onDismiss = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0) {
            rhModalBottomSheet5.hideBottomSheet(function0);
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1673363553, i2, -1, "com.robinhood.android.futures.assethome.sections.NetReturnsBottomSheet.<anonymous> (NetReturnsBottomSheet.kt:44)");
            }
            NetReturnsBottomSheetViewState netReturnsBottomSheetViewState = this.$viewState;
            final Function0<Unit> function0 = this.$onDismiss;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            StringResource netReturnValue = netReturnsBottomSheetViewState.getNetReturnValue();
            StringResource currentSpanPnlTitle = netReturnsBottomSheetViewState.getCurrentSpanPnlTitle();
            StringResource currentSpanPnlValue = netReturnsBottomSheetViewState.getCurrentSpanPnlValue();
            StringResource commissionsValue = netReturnsBottomSheetViewState.getCommissionsValue();
            StringResource exchangeFeesValue = netReturnsBottomSheetViewState.getExchangeFeesValue();
            int i3 = StringResource.$stable;
            NetReturnsBottomSheet4.NetReturnsBottomSheetContent(netReturnValue, currentSpanPnlTitle, currentSpanPnlValue, commissionsValue, exchangeFeesValue, null, composer, (i3 << 3) | i3 | (i3 << 6) | (i3 << 9) | (i3 << 12), 32);
            String strStringResource = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_got_it_button_label, composer, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), 0.0f, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function0) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && composer.changedInstance(RhModalBottomSheet)));
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.assethome.sections.NetReturnsBottomSheetKt$NetReturnsBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NetReturnsBottomSheet4.C169981.invoke$lambda$2$lambda$1$lambda$0(RhModalBottomSheet, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierFillMaxWidth$default, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NetReturnsBottomSheetContent(final StringResource stringResource, final StringResource stringResource2, final StringResource stringResource3, final StringResource stringResource4, final StringResource stringResource5, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String string2;
        String string3;
        String string4;
        StringResource stringResource6;
        String string5;
        StringResource stringResource7;
        String string6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(597885506);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(stringResource3) : composerStartRestartGroup.changedInstance(stringResource3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(stringResource4) : composerStartRestartGroup.changedInstance(stringResource4) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(stringResource5) : composerStartRestartGroup.changedInstance(stringResource5) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(597885506, i3, -1, "com.robinhood.android.futures.assethome.sections.NetReturnsBottomSheetContent (NetReturnsBottomSheet.kt:72)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Modifier modifier5 = modifier4;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_net_returns_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                TextStyle displayCapsuleLarge = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleLarge();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                int i6 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge, composerStartRestartGroup, 0, 0, 8184);
                Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), stringResource != null, null, 2, null);
                composerStartRestartGroup.startReplaceGroup(1699149015);
                string2 = stringResource != null ? null : StringResource2.getString(stringResource, composerStartRestartGroup, StringResource.$stable | (i6 & 14));
                composerStartRestartGroup.endReplaceGroup();
                if (string2 == null) {
                    string2 = EMPTY_PLACEHOLDER;
                }
                BentoText2.m20747BentoText38GnDrw(string2, modifierBentoPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_net_returns_subtitle, composerStartRestartGroup, 0), PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                int i7 = StringResource.$stable;
                AnnotatedString annotatedString = new AnnotatedString(StringResource2.getString(stringResource2, composerStartRestartGroup, i7 | ((i6 >> 3) & 14)), null, 2, null);
                Color colorM6701boximpl = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU());
                composerStartRestartGroup.startReplaceGroup(1699174807);
                string3 = stringResource3 != null ? null : StringResource2.getString(stringResource3, composerStartRestartGroup, i7 | ((i6 >> 6) & 14));
                composerStartRestartGroup.endReplaceGroup();
                if (string3 == null) {
                    string3 = EMPTY_PLACEHOLDER;
                }
                BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, colorM6701boximpl, null, null, new AnnotatedString(string3, null, 2, null), null, null, null, null, false, stringResource3 != null, 2009, null);
                int i8 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState, null, null, null, null, composerStartRestartGroup, i8, 30);
                AnnotatedString annotatedString2 = new AnnotatedString(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_commissions_label, composerStartRestartGroup, 0), null, 2, null);
                Color colorM6701boximpl2 = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU());
                composerStartRestartGroup.startReplaceGroup(1699190103);
                string4 = stringResource4 != null ? null : StringResource2.getString(stringResource4, composerStartRestartGroup, i7 | ((i6 >> 9) & 14));
                composerStartRestartGroup.endReplaceGroup();
                if (string4 == null) {
                    string4 = EMPTY_PLACEHOLDER;
                }
                BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString2, colorM6701boximpl2, null, null, new AnnotatedString(string4, null, 2, null), null, null, null, null, false, stringResource4 != null, 2009, null), null, null, null, null, composerStartRestartGroup, i8, 30);
                AnnotatedString annotatedString3 = new AnnotatedString(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_exchange_fees_label, composerStartRestartGroup, 0), null, 2, null);
                Color colorM6701boximpl3 = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU());
                composerStartRestartGroup.startReplaceGroup(1699205399);
                if (stringResource5 != null) {
                    stringResource6 = stringResource5;
                    string5 = null;
                } else {
                    stringResource6 = stringResource5;
                    string5 = StringResource2.getString(stringResource6, composerStartRestartGroup, i7 | ((i6 >> 12) & 14));
                }
                composerStartRestartGroup.endReplaceGroup();
                if (string5 == null) {
                    string5 = EMPTY_PLACEHOLDER;
                }
                BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString3, colorM6701boximpl3, null, null, new AnnotatedString(string5, null, 2, null), null, null, null, null, false, stringResource6 != null, 2009, null), null, null, null, null, composerStartRestartGroup, i8, 30);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                AnnotatedString annotatedString4 = new AnnotatedString(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_net_return_label, composerStartRestartGroup, 0), null, 2, null);
                Color colorM6701boximpl4 = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU());
                composerStartRestartGroup.startReplaceGroup(1699225751);
                if (stringResource != null) {
                    stringResource7 = stringResource;
                    string6 = null;
                } else {
                    stringResource7 = stringResource;
                    string6 = StringResource2.getString(stringResource7, composerStartRestartGroup, i7 | (i6 & 14));
                }
                composerStartRestartGroup.endReplaceGroup();
                if (string6 == null) {
                    string6 = EMPTY_PLACEHOLDER;
                }
                BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString4, colorM6701boximpl4, null, null, new AnnotatedString(string6, null, 2, null), null, null, null, null, false, stringResource7 != null, 2009, null), null, null, null, null, composerStartRestartGroup, i8, 30);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_disclaimer, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.sections.NetReturnsBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NetReturnsBottomSheet4.NetReturnsBottomSheetContent$lambda$2(stringResource, stringResource2, stringResource3, stringResource4, stringResource5, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Modifier modifier52 = modifier4;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String strStringResource2 = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_net_returns_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                TextStyle displayCapsuleLarge2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleLarge();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                int i62 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 8, null), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge2, composerStartRestartGroup, 0, 0, 8184);
                Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(PaddingKt.m5144paddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), stringResource != null, null, 2, null);
                composerStartRestartGroup.startReplaceGroup(1699149015);
                if (stringResource != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (string2 == null) {
                }
                BentoText2.m20747BentoText38GnDrw(string2, modifierBentoPlaceholder$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_net_returns_subtitle, composerStartRestartGroup, 0), PaddingKt.m5143paddingVpY3zN4(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                int i72 = StringResource.$stable;
                AnnotatedString annotatedString5 = new AnnotatedString(StringResource2.getString(stringResource2, composerStartRestartGroup, i72 | ((i62 >> 3) & 14)), null, 2, null);
                Color colorM6701boximpl5 = Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU());
                composerStartRestartGroup.startReplaceGroup(1699174807);
                if (stringResource3 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (string3 == null) {
                }
                BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, annotatedString5, colorM6701boximpl5, null, null, new AnnotatedString(string3, null, 2, null), null, null, null, null, false, stringResource3 != null, 2009, null);
                int i82 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState2, null, null, null, null, composerStartRestartGroup, i82, 30);
                AnnotatedString annotatedString22 = new AnnotatedString(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_commissions_label, composerStartRestartGroup, 0), null, 2, null);
                Color colorM6701boximpl22 = Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU());
                composerStartRestartGroup.startReplaceGroup(1699190103);
                if (stringResource4 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (string4 == null) {
                }
                BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString22, colorM6701boximpl22, null, null, new AnnotatedString(string4, null, 2, null), null, null, null, null, false, stringResource4 != null, 2009, null), null, null, null, null, composerStartRestartGroup, i82, 30);
                AnnotatedString annotatedString32 = new AnnotatedString(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_exchange_fees_label, composerStartRestartGroup, 0), null, 2, null);
                Color colorM6701boximpl32 = Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU());
                composerStartRestartGroup.startReplaceGroup(1699205399);
                if (stringResource5 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (string5 == null) {
                }
                BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString32, colorM6701boximpl32, null, null, new AnnotatedString(string5, null, 2, null), null, null, null, null, false, stringResource6 != null, 2009, null), null, null, null, null, composerStartRestartGroup, i82, 30);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                AnnotatedString annotatedString42 = new AnnotatedString(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_net_return_label, composerStartRestartGroup, 0), null, 2, null);
                Color colorM6701boximpl42 = Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU());
                composerStartRestartGroup.startReplaceGroup(1699225751);
                if (stringResource != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (string6 == null) {
                }
                BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString42, colorM6701boximpl42, null, null, new AnnotatedString(string6, null, 2, null), null, null, null, null, false, stringResource7 != null, 2009, null), null, null, null, null, composerStartRestartGroup, i82, 30);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_bottom_sheet_disclaimer, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PreviewNetReturnBottomSheetLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1733188474);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1733188474, i, -1, "com.robinhood.android.futures.assethome.sections.PreviewNetReturnBottomSheetLoading (NetReturnsBottomSheet.kt:169)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, NetReturnsBottomSheet.INSTANCE.getLambda$400457010$feature_futures_asset_home_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.sections.NetReturnsBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetReturnsBottomSheet4.PreviewNetReturnBottomSheetLoading$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewNetReturnBottomSheetLoaded(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-771214737);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-771214737, i, -1, "com.robinhood.android.futures.assethome.sections.PreviewNetReturnBottomSheetLoaded (NetReturnsBottomSheet.kt:188)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, NetReturnsBottomSheet.INSTANCE.getLambda$848361911$feature_futures_asset_home_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.sections.NetReturnsBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetReturnsBottomSheet4.PreviewNetReturnBottomSheetLoaded$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
