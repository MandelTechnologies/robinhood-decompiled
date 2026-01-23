package com.robinhood.shared.crypto.p375ui.settings;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.shared.crypto.p375ui.C38572R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferAllowlistToggle.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"CryptoTransferAllowlistToggle", "", "checked", "", "enabled", "loading", "onToggleValueChanged", "Lkotlin/Function1;", "infoBannerContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "(ZZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.settings.CryptoTransferAllowlistToggleKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferAllowlistToggle {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferAllowlistToggle$lambda$2(boolean z, boolean z2, boolean z3, Function1 function1, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTransferAllowlistToggle(z, z2, z3, function1, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferAllowlistToggle(final boolean z, final boolean z2, final boolean z3, final Function1<? super Boolean, Unit> onToggleValueChanged, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i5;
        long jM21427getFg30d7_KjU;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onToggleValueChanged, "onToggleValueChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-810654177);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onToggleValueChanged) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-810654177, i4, -1, "com.robinhood.shared.crypto.ui.settings.CryptoTransferAllowlistToggle (CryptoTransferAllowlistToggle.kt:25)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                int i8 = 0;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C38572R.string.crypto_settings_page_allowlisting_section_title_v2, composerStartRestartGroup, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup.startReplaceGroup(-824779341);
                if (str != null) {
                    i5 = i7;
                } else {
                    i5 = i7;
                    i8 = 0;
                    BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1), str, new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24), null, null, null, bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU(), composerStartRestartGroup, (BentoIcon4.Size24.$stable << 6) | 3072, 48);
                }
                composerStartRestartGroup.endReplaceGroup();
                String strStringResource = StringResources_androidKt.stringResource(C38572R.string.crypto_settings_page_allowlisting_section_subtitle_v2, composerStartRestartGroup, i8);
                int i9 = C38572R.string.crypto_settings_page_allowlisting_section_description;
                if (!z2) {
                    composerStartRestartGroup.startReplaceGroup(202512300);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(202594636);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                modifier3 = modifier4;
                BentoToggleRow3.BentoToggleRow(new BentoToggleRowState(null, strStringResource, new BentoToggleRowState.Text.Annotated(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i9, jM21427getFg30d7_KjU, 0L, (LinkInteractionListener) null, composerStartRestartGroup, 0, 12)), z2, z, null, null, z3, false, true, 353, null), onToggleValueChanged, null, composerStartRestartGroup, BentoToggleRowState.$stable | ((i4 >> 6) & 112), 4);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.settings.CryptoTransferAllowlistToggleKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferAllowlistToggle.CryptoTransferAllowlistToggle$lambda$2(z, z2, z3, onToggleValueChanged, str, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        i4 = i3;
        if ((74899 & i4) == 74898) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                int i82 = 0;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C38572R.string.crypto_settings_page_allowlisting_section_title_v2, composerStartRestartGroup, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup.startReplaceGroup(-824779341);
                if (str != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                String strStringResource2 = StringResources_androidKt.stringResource(C38572R.string.crypto_settings_page_allowlisting_section_subtitle_v2, composerStartRestartGroup, i82);
                int i92 = C38572R.string.crypto_settings_page_allowlisting_section_description;
                if (!z2) {
                }
                modifier3 = modifier4;
                BentoToggleRow3.BentoToggleRow(new BentoToggleRowState(null, strStringResource2, new BentoToggleRowState.Text.Annotated(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i92, jM21427getFg30d7_KjU, 0L, (LinkInteractionListener) null, composerStartRestartGroup, 0, 12)), z2, z, null, null, z3, false, true, 353, null), onToggleValueChanged, null, composerStartRestartGroup, BentoToggleRowState.$stable | ((i4 >> 6) & 112), 4);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
