package com.robinhood.shared.crypto.p375ui.feeTiers;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoFeeTierStatusContext;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummary;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoFeeTierSummaryComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001aC\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"CryptoFeeTierSummaryComposable", "", "feeTierSummary", "Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;", "(Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;Landroidx/compose/runtime/Composer;I)V", "CurrentAndNextFeeTiers", "hasNextTierState", "Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$HasNextTier;", "(Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$HasNextTier;Landroidx/compose/runtime/Composer;I)V", "FeeTierBlock", "Landroidx/compose/foundation/layout/RowScope;", "isCurrentTier", "", "title", "", "feeRateText", "tradingVolumeText", "tradingVolumeDescriptionText", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/foundation/layout/RowScope;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LowestFeeTierBlock", "feeTierStatusContext", "Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;Landroidx/compose/runtime/Composer;I)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.feeTiers.CryptoFeeTierSummaryComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoFeeTierSummaryComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierSummaryComposable$lambda$0(CryptoFeeTierSummary cryptoFeeTierSummary, int i, Composer composer, int i2) {
        CryptoFeeTierSummaryComposable(cryptoFeeTierSummary, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CurrentAndNextFeeTiers$lambda$2(CryptoFeeTierSummary.HasNextTier hasNextTier, int i, Composer composer, int i2) {
        CurrentAndNextFeeTiers(hasNextTier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeeTierBlock$lambda$4(Row5 row5, boolean z, String str, String str2, String str3, String str4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FeeTierBlock(row5, z, str, str2, str3, str4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LowestFeeTierBlock$lambda$9(String str, CryptoFeeTierStatusContext cryptoFeeTierStatusContext, int i, Composer composer, int i2) {
        LowestFeeTierBlock(str, cryptoFeeTierStatusContext, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$10(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CryptoFeeTierSummaryComposable(final CryptoFeeTierSummary feeTierSummary, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(feeTierSummary, "feeTierSummary");
        Composer composerStartRestartGroup = composer.startRestartGroup(1115081709);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(feeTierSummary) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1115081709, i2, -1, "com.robinhood.shared.crypto.ui.feeTiers.CryptoFeeTierSummaryComposable (CryptoFeeTierSummaryComposable.kt:39)");
            }
            if (feeTierSummary instanceof CryptoFeeTierSummary.HasNextTier) {
                composerStartRestartGroup.startReplaceGroup(2146671494);
                CurrentAndNextFeeTiers((CryptoFeeTierSummary.HasNextTier) feeTierSummary, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(feeTierSummary instanceof CryptoFeeTierSummary.LowestFee)) {
                    composerStartRestartGroup.startReplaceGroup(2146669153);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(2146675316);
                CryptoFeeTierSummary.LowestFee lowestFee = (CryptoFeeTierSummary.LowestFee) feeTierSummary;
                LowestFeeTierBlock(lowestFee.getFeeRateText(), lowestFee.getFeeTierStatusContext(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.feeTiers.CryptoFeeTierSummaryComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeTierSummaryComposable3.CryptoFeeTierSummaryComposable$lambda$0(feeTierSummary, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CurrentAndNextFeeTiers(final CryptoFeeTierSummary.HasNextTier hasNextTier, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1479423023);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(hasNextTier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1479423023, i2, -1, "com.robinhood.shared.crypto.ui.feeTiers.CurrentAndNextFeeTiers (CryptoFeeTierSummaryComposable.kt:55)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            CryptoFeeTierSummary.HasNextTier.FeeTier currentFeTier = hasNextTier.getCurrentFeTier();
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType = Component.ComponentType.ROW;
            Modifier modifierAutomationTestTag = AutomationTestTagModifierExt.automationTestTag(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, hasNextTier.getFeeTierStatusContext(), null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16367, null), new Component(componentType, "current_tier", null, 4, null), null, 39, null), true, false, false, false, false, null, 108, null), "current_tier");
            String strStringResource = StringResources_androidKt.stringResource(C38572R.string.crypto_home_tab_fee_tier_status_current_fee_tier_title, composerStartRestartGroup, 0);
            String feeRateText = currentFeTier.getFeeRateText();
            String tradingVolumeText = currentFeTier.getTradingVolumeText();
            StringResource tradingVolumeDescriptionText = currentFeTier.getTradingVolumeDescriptionText();
            int i3 = StringResource.$stable;
            FeeTierBlock(row6, true, strStringResource, feeRateText, tradingVolumeText, StringResources6.getTextAsString(tradingVolumeDescriptionText, composerStartRestartGroup, i3), modifierAutomationTestTag, composerStartRestartGroup, 54, 0);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            CryptoFeeTierSummary.HasNextTier.FeeTier nextFeeTier = hasNextTier.getNextFeeTier();
            FeeTierBlock(row6, false, StringResources_androidKt.stringResource(C38572R.string.crypto_home_tab_fee_tier_status_next_fee_tier_title, composerStartRestartGroup, 0), nextFeeTier.getFeeRateText(), nextFeeTier.getTradingVolumeText(), StringResources6.getTextAsString(nextFeeTier.getTradingVolumeDescriptionText(), composerStartRestartGroup, i3), AutomationTestTagModifierExt.automationTestTag(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, hasNextTier.getFeeTierStatusContext(), null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16367, null), new Component(componentType, "next_tier", null, 4, null), null, 39, null), true, false, false, false, false, null, 108, null), "next_tier"), composerStartRestartGroup, 54, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.feeTiers.CryptoFeeTierSummaryComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeTierSummaryComposable3.CurrentAndNextFeeTiers$lambda$2(hasNextTier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FeeTierBlock(final Row5 row5, final boolean z, final String str, final String str2, final String str3, final String str4, Modifier modifier, Composer composer, final int i, final int i2) {
        Row5 row52;
        int i3;
        String str5;
        String str6;
        String str7;
        String str8;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        long jM21426getFg20d7_KjU;
        long jM21426getFg20d7_KjU2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-444226440);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
            row52 = row5;
        } else {
            row52 = row5;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(row52) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                str5 = str;
                i3 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
            }
            if ((i2 & 4) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str6 = str2;
                    i3 |= composerStartRestartGroup.changed(str6) ? 2048 : 1024;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str7 = str3;
                        i3 |= composerStartRestartGroup.changed(str7) ? 16384 : 8192;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 196608;
                    } else {
                        if ((i & 196608) == 0) {
                            str8 = str4;
                            i3 |= composerStartRestartGroup.changed(str8) ? 131072 : 65536;
                        }
                        i4 = i2 & 32;
                        if (i4 == 0) {
                            if ((1572864 & i) == 0) {
                                modifier2 = modifier;
                                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                            }
                            if ((599187 & i3) != 599186 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                            } else {
                                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-444226440, i3, -1, "com.robinhood.shared.crypto.ui.feeTiers.FeeTierBlock (CryptoFeeTierSummaryComposable.kt:111)");
                                }
                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i5 = BentoTheme.$stable;
                                Modifier modifier5 = modifier4;
                                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Row5.weight$default(row52, BorderKt.m4876borderxT4_qwU(modifier4, fM7995constructorimpl, bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM())), 1.0f, false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
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
                                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                                if (!z) {
                                    composerStartRestartGroup.startReplaceGroup(-81166996);
                                    jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-81109429);
                                    jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                BentoText2.m20747BentoText38GnDrw(str5, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, (i3 >> 6) & 14, 0, 8186);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                                if (!z) {
                                    composerStartRestartGroup.startReplaceGroup(-80822772);
                                    jM21426getFg20d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-80765205);
                                    jM21426getFg20d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                composer2 = composerStartRestartGroup;
                                BentoText2.m20747BentoText38GnDrw(str6, null, Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, (i3 >> 9) & 14, 0, 8186);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                                BentoText2.m20747BentoText38GnDrw(str7, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, (i3 >> 12) & 14, 0, 8186);
                                BentoText2.m20747BentoText38GnDrw(str8, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, (i3 >> 15) & 14, 0, 8186);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier5;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.feeTiers.CryptoFeeTierSummaryComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return CryptoFeeTierSummaryComposable3.FeeTierBlock$lambda$4(row5, z, str, str2, str3, str4, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 1572864;
                        modifier2 = modifier;
                        if ((599187 & i3) != 599186) {
                            if (i4 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i52 = BentoTheme.$stable;
                            Modifier modifier52 = modifier4;
                            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(Row5.weight$default(row52, BorderKt.m4876borderxT4_qwU(modifier4, fM7995constructorimpl2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM())), 1.0f, false, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM());
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
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
                                TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                                if (!z) {
                                }
                                BentoText2.m20747BentoText38GnDrw(str5, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composerStartRestartGroup, (i3 >> 6) & 14, 0, 8186);
                                Modifier.Companion companion22 = Modifier.INSTANCE;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                                if (!z) {
                                }
                                composer2 = composerStartRestartGroup;
                                BentoText2.m20747BentoText38GnDrw(str6, null, Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composer2, (i3 >> 9) & 14, 0, 8186);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composer2, i52).m21590getDefaultD9Ej5fM()), composer2, 0);
                                BentoText2.m20747BentoText38GnDrw(str7, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextS(), composer2, (i3 >> 12) & 14, 0, 8186);
                                BentoText2.m20747BentoText38GnDrw(str8, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextS(), composer2, (i3 >> 15) & 14, 0, 8186);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    str8 = str4;
                    i4 = i2 & 32;
                    if (i4 == 0) {
                    }
                    modifier2 = modifier;
                    if ((599187 & i3) != 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                str7 = str3;
                if ((i2 & 16) == 0) {
                }
                str8 = str4;
                i4 = i2 & 32;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                if ((599187 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str6 = str2;
            if ((i2 & 8) != 0) {
            }
            str7 = str3;
            if ((i2 & 16) == 0) {
            }
            str8 = str4;
            i4 = i2 & 32;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((599187 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str5 = str;
        if ((i2 & 4) == 0) {
        }
        str6 = str2;
        if ((i2 & 8) != 0) {
        }
        str7 = str3;
        if ((i2 & 16) == 0) {
        }
        str8 = str4;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void LowestFeeTierBlock(String str, final CryptoFeeTierStatusContext cryptoFeeTierStatusContext, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(795528718);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(cryptoFeeTierStatusContext) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(795528718, i2, -1, "com.robinhood.shared.crypto.ui.feeTiers.LowestFeeTierBlock (CryptoFeeTierSummaryComposable.kt:159)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            int i4 = i2;
            Modifier modifierAutomationTestTag = AutomationTestTagModifierExt.automationTestTag(ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(BorderKt.m4876borderxT4_qwU(companion, fM7995constructorimpl, bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM())), 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoFeeTierStatusContext, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16367, null), new Component(Component.ComponentType.ROW, "current_tier", null, 4, null), null, 39, null), true, false, false, false, false, null, 108, null), "lowest_fee");
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutomationTestTag);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            str2 = str;
            BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, i4 & 14, 0, 8190);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1291825849);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(StringResources_androidKt.stringResource(C38572R.string.crypto_home_tab_fee_tier_status_lowest_current_tier, composerStartRestartGroup, 0));
            composerStartRestartGroup.startReplaceGroup(1291830419);
            int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append("  ∙  ");
                builder.append(StringResources_androidKt.stringResource(C38572R.string.crypto_home_tab_fee_tier_status_lowest_fee, composerStartRestartGroup, 0));
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, null, null, null, null, null, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, 16382);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composer2, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(C38572R.drawable.fee_tier_illo, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), 0, 2, null), composer2, 48, 60);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.feeTiers.CryptoFeeTierSummaryComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeTierSummaryComposable3.LowestFeeTierBlock$lambda$9(str2, cryptoFeeTierStatusContext, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1027658510);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1027658510, i, -1, "com.robinhood.shared.crypto.ui.feeTiers.Preview (CryptoFeeTierSummaryComposable.kt:211)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoFeeTierSummaryComposable.INSTANCE.m25225getLambda$982506410$lib_crypto_ui_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.feeTiers.CryptoFeeTierSummaryComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeTierSummaryComposable3.Preview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
