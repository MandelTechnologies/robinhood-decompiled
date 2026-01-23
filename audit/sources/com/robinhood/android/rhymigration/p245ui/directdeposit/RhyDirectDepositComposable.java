package com.robinhood.android.rhymigration.p245ui.directdeposit;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: RhyDirectDepositComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009a\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062K\u0010\b\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"CmSunsetFundingComposable", "", "routingNumber", "", "accountNumber", "hasExistingDd", "", "fromMigrationFlow", "copyToClipboard", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "text", AnnotatedPrivateKey.LABEL, "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "haptic", "sendDetails", "Lkotlin/Function0;", "continueButtonClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-rhy-migration_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyDirectDepositComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CmSunsetFundingComposable$lambda$10(String str, String str2, Boolean bool, Boolean bool2, Function3 function3, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        CmSunsetFundingComposable(str, str2, bool, bool2, function3, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CmSunsetFundingComposable(final String routingNumber, final String accountNumber, final Boolean bool, Boolean bool2, final Function3<? super String, ? super String, ? super HapticFeedback, Unit> copyToClipboard, final Function0<Unit> sendDetails, Function0<Unit> continueButtonClick, Composer composer, final int i) {
        int i2;
        String strStringResource;
        String strStringResource2;
        int i3;
        Painter painterPainterResource;
        final Function0<Unit> function0;
        final Boolean bool3;
        String strStringResource3;
        Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(copyToClipboard, "copyToClipboard");
        Intrinsics.checkNotNullParameter(sendDetails, "sendDetails");
        Intrinsics.checkNotNullParameter(continueButtonClick, "continueButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-592275410);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(routingNumber) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(accountNumber) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(bool) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(bool2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(copyToClipboard) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendDetails) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(continueButtonClick) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = continueButtonClick;
            bool3 = bool2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-592275410, i2, -1, "com.robinhood.android.rhymigration.ui.directdeposit.CmSunsetFundingComposable (RhyDirectDepositComposable.kt:38)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            final HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            Modifier modifierWeight$default = Column5.weight$default(column6, ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            int i4 = i2;
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Modifier modifierAlign = column6.align(companion, companion2.getCenterHorizontally());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifierAlign, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Boolean bool4 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool4)) {
                composerStartRestartGroup.startReplaceGroup(-968872718);
                strStringResource = StringResources_androidKt.stringResource(C27577R.string.rhy_dd_title_existing, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-968781609);
                strStringResource = StringResources_androidKt.stringResource(C27577R.string.rhy_dd_title_new, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str = strStringResource;
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(str, modifierM5144paddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8124);
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion, companion2.getCenterHorizontally()), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            if (Intrinsics.areEqual(bool, bool4)) {
                composerStartRestartGroup.startReplaceGroup(-968265645);
                strStringResource2 = StringResources_androidKt.stringResource(C27577R.string.rhy_dd_body_existing, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-968175528);
                strStringResource2 = StringResources_androidKt.stringResource(C27577R.string.rhy_dd_body_new, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM5144paddingVpY3zN4$default2, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8124);
            if (Intrinsics.areEqual(bool, bool4)) {
                composerStartRestartGroup.startReplaceGroup(-967933139);
                ImageKt.Image(PainterResources_androidKt.painterResource(C27577R.drawable.rhy_migration_direct_deposit, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27577R.string.direct_deposit, composerStartRestartGroup, 0), column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), companion2.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 120);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-967510020);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), companion2.getCenterHorizontally()), 0.0f, 1, null);
                if (bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay()) {
                    composerStartRestartGroup.startReplaceGroup(-967227145);
                    i3 = 0;
                    painterPainterResource = PainterResources_androidKt.painterResource(C27577R.drawable.rhy_migration_direct_deposit_new, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    i3 = 0;
                    composerStartRestartGroup.startReplaceGroup(-967108911);
                    painterPainterResource = PainterResources_androidKt.painterResource(C27577R.drawable.rhy_migration_direct_deposit_new_night, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                ImageKt.Image(painterPainterResource, StringResources_androidKt.stringResource(C27577R.string.direct_deposit, composerStartRestartGroup, i3), modifierFillMaxWidth$default, (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24576, 104);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            UserInteractionEventData.Action action = UserInteractionEventData.Action.COPY;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
            String strStringResource4 = StringResources_androidKt.stringResource(C27577R.string.rhy_dd_routing, composerStartRestartGroup, 0);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.COPY_16;
            BentoSettingsRows.EndElement.Icon icon = new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper2, null, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i6 = i4 & 57344;
            boolean zChangedInstance = (i6 == 16384) | ((i4 & 14) == 4) | composerStartRestartGroup.changedInstance(hapticFeedback);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyDirectDepositComposable.CmSunsetFundingComposable$lambda$9$lambda$6$lambda$1$lambda$0(copyToClipboard, routingNumber, hapticFeedback);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i7 = BentoSettingsRows.EndElement.Icon.$stable;
            BentoSettingsRowKt.BentoSettingsRow(modifierAutoLogEvents$default, strStringResource4, routingNumber, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) icon, false, false, (Function0<Unit>) objRememberedValue, composerStartRestartGroup, ((i4 << 6) & 896) | (i7 << 12), 104);
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, action, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
            String strStringResource5 = StringResources_androidKt.stringResource(C27577R.string.rhy_dd_account, composerStartRestartGroup, 0);
            BentoSettingsRows.EndElement.Icon icon2 = new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper2, null, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = (i6 == 16384) | ((i4 & 112) == 32) | composerStartRestartGroup.changedInstance(hapticFeedback);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyDirectDepositComposable.CmSunsetFundingComposable$lambda$9$lambda$6$lambda$3$lambda$2(copyToClipboard, accountNumber, hapticFeedback);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoSettingsRowKt.BentoSettingsRow(modifierAutoLogEvents$default2, strStringResource5, accountNumber, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) icon2, false, false, (Function0<Unit>) objRememberedValue2, composerStartRestartGroup, ((i4 << 3) & 896) | (i7 << 12), 104);
            Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion, companion2.getCenterHorizontally()), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.SEND, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
            String strStringResource6 = StringResources_androidKt.stringResource(C27577R.string.rhy_dd_email_info, composerStartRestartGroup, 0);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i4 & 458752) == 131072;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyDirectDepositComposable.CmSunsetFundingComposable$lambda$9$lambda$6$lambda$5$lambda$4(sendDetails);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTextWithLink.m20753BentoTextWithSubstringLinkXkG1Q0A(strStringResource6, "Email yourself the numbers", (Function0) objRememberedValue3, modifierAutoLogEvents$default3, jM21425getFg0d7_KjU, 0L, textM, 0, composerStartRestartGroup, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            composerStartRestartGroup.endNode();
            Modifier modifierAutoLogEvents$default4 = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = (i4 & 3670016) == 1048576;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                function0 = continueButtonClick;
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyDirectDepositComposable.CmSunsetFundingComposable$lambda$9$lambda$8$lambda$7(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                function0 = continueButtonClick;
            }
            Function0 function02 = (Function0) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            bool3 = bool2;
            if (Intrinsics.areEqual(bool3, bool4)) {
                composerStartRestartGroup.startReplaceGroup(1230386105);
                strStringResource3 = StringResources_androidKt.stringResource(C27577R.string.rhy_continue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1230460381);
                strStringResource3 = StringResources_androidKt.stringResource(C27577R.string.rhy_done, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default4, null, null, false, null, null, function02, strStringResource3, false, null, false, null, null, false, null, false, composerStartRestartGroup, 0, 0, 65342);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyDirectDepositComposable.CmSunsetFundingComposable$lambda$10(routingNumber, accountNumber, bool, bool3, copyToClipboard, sendDetails, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CmSunsetFundingComposable$lambda$9$lambda$6$lambda$1$lambda$0(Function3 function3, String str, HapticFeedback hapticFeedback) {
        function3.invoke(str, "", hapticFeedback);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CmSunsetFundingComposable$lambda$9$lambda$6$lambda$3$lambda$2(Function3 function3, String str, HapticFeedback hapticFeedback) {
        function3.invoke(str, "", hapticFeedback);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CmSunsetFundingComposable$lambda$9$lambda$6$lambda$5$lambda$4(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CmSunsetFundingComposable$lambda$9$lambda$8$lambda$7(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
