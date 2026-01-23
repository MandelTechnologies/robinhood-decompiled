package com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Benefits.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a;\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f\"\u0014\u0010\u0015\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f\"\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f\"\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000f\"\u0014\u0010\u0018\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000f\"\u0014\u0010\u0019\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f\"\u0014\u0010\u001a\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "Benefits", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "icon", "", "stringId", "Lkotlin/Function0;", "content", "BenefitRow", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "BENEFITS_ROOT_TEST_TAG", "Ljava/lang/String;", "BENEFITS_TITLE_TEST_TAG", "BENEFITS_INTERRUPTION_PROTECTION_BENEFIT_TEST_TAG", "BENEFITS_SECURITY_BENEFIT_TEST_TAG", "BENEFITS_RENTAL_COLLISION_BENEFIT_TEST_TAG", "BENEFITS_EXTENDED_WARRANTY_BENEFIT_TEST_TAG", "BENEFITS_RETURN_PROTECTION_BENEFIT_TEST_TAG", "BENEFITS_ZERO_LIABILITY_BENEFIT_TEST_TAG", "BENEFITS_VISA_CONCIERGE_BENEFIT_TEST_TAG", "BENEFITS_TRAVEL_EMERGENCY_BENEFIT_TEST_TAG", "BENEFITS_ROADSIDE_DISPATCH_BENEFIT_TEST_TAG", "BENEFITS_GRADIENT_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.BenefitsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Benefits {
    public static final String BENEFITS_EXTENDED_WARRANTY_BENEFIT_TEST_TAG = "benefits-extended-warranty-benefit-test-tag";
    public static final String BENEFITS_GRADIENT_TEST_TAG = "benefits-gradient-test-tag";
    public static final String BENEFITS_INTERRUPTION_PROTECTION_BENEFIT_TEST_TAG = "benefits-interruption-protection-benefit-test-tag";
    public static final String BENEFITS_RENTAL_COLLISION_BENEFIT_TEST_TAG = "benefits-rental-collision-benefit-test-tag";
    public static final String BENEFITS_RETURN_PROTECTION_BENEFIT_TEST_TAG = "benefits-return-protection-benefit-test-tag";
    public static final String BENEFITS_ROADSIDE_DISPATCH_BENEFIT_TEST_TAG = "benefits-roadside-dispatch-benefit-test-tag";
    public static final String BENEFITS_ROOT_TEST_TAG = "benefits-root-test-tag";
    public static final String BENEFITS_SECURITY_BENEFIT_TEST_TAG = "benefits-security-benefit-test-tag";
    public static final String BENEFITS_TITLE_TEST_TAG = "benefits-title-test-tag";
    public static final String BENEFITS_TRAVEL_EMERGENCY_BENEFIT_TEST_TAG = "benefits-travel-emergency-benefit-test-tag";
    public static final String BENEFITS_VISA_CONCIERGE_BENEFIT_TEST_TAG = "benefits-visa-concierge-benefit-test-tag";
    public static final String BENEFITS_ZERO_LIABILITY_BENEFIT_TEST_TAG = "benefits-zero-liability-benefit-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenefitRow$lambda$2(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Modifier modifier, Function2 function2, int i2, int i3, Composer composer, int i4) {
        BenefitRow(serverToBentoAssetMapper2, i, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Benefits$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Benefits(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void Benefits(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-639366776);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-639366776, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.Benefits (Benefits.kt:34)");
            }
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, BentoColor.INSTANCE.m21139getCCGoldBG0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1292714890, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.BenefitsKt.Benefits.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1292714890, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.Benefits.<anonymous> (Benefits.kt:36)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(modifier4, BentoColor.INSTANCE.m21142getCCGoldBGLight0d7_KjU(), null, 2, null), Benefits.BENEFITS_ROOT_TEST_TAG);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierTestTag);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(88), 1, null), 0.0f, composer3, 6, 1);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer3, i6).m21592getMediumD9Ej5fM()), companion.getStart(), composer3, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_benefits_perks, composer3, 0), TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), 7, null), Benefits.BENEFITS_TITLE_TEST_TAG), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                    Benefits.BenefitRow(ServerToBentoAssetMapper2.INFO_24, C12201R.string.waitlist_intro_trip_protection, TestTag3.testTag(companion3, Benefits.BENEFITS_INTERRUPTION_PROTECTION_BENEFIT_TEST_TAG), Benefits2.INSTANCE.getLambda$110821381$feature_credit_card_externalDebug(), composer3, 3462, 0);
                    Benefits.BenefitRow(ServerToBentoAssetMapper2.WALLET_24, C12201R.string.waitlist_intro_purchase_security, TestTag3.testTag(companion3, Benefits.BENEFITS_SECURITY_BENEFIT_TEST_TAG), null, composer3, 390, 8);
                    Benefits.BenefitRow(ServerToBentoAssetMapper2.TRANSPORT_24, C12201R.string.waitlist_intro_auto, TestTag3.testTag(companion3, Benefits.BENEFITS_RENTAL_COLLISION_BENEFIT_TEST_TAG), null, composer3, 390, 8);
                    Benefits.BenefitRow(ServerToBentoAssetMapper2.CLIPBOARD_24, C12201R.string.waitlist_intro_warranty, TestTag3.testTag(companion3, Benefits.BENEFITS_EXTENDED_WARRANTY_BENEFIT_TEST_TAG), null, composer3, 390, 8);
                    Benefits.BenefitRow(ServerToBentoAssetMapper2.RESEND_24, C12201R.string.waitlist_intro_return_protection, TestTag3.testTag(companion3, Benefits.BENEFITS_RETURN_PROTECTION_BENEFIT_TEST_TAG), null, composer3, 390, 8);
                    Benefits.BenefitRow(ServerToBentoAssetMapper2.ECONOMIC_MOAT_24, C12201R.string.waitlist_intro_zero_liability, TestTag3.testTag(companion3, Benefits.BENEFITS_ZERO_LIABILITY_BENEFIT_TEST_TAG), null, composer3, 390, 8);
                    Benefits.BenefitRow(ServerToBentoAssetMapper2.HOSPITALITY_24, C12201R.string.waitlist_intro_concierge, TestTag3.testTag(companion3, Benefits.BENEFITS_VISA_CONCIERGE_BENEFIT_TEST_TAG), null, composer3, 390, 8);
                    Benefits.BenefitRow(ServerToBentoAssetMapper2.TRIANGLE_ALERT_24, C12201R.string.waitlist_intro_assistance, TestTag3.testTag(companion3, Benefits.BENEFITS_TRAVEL_EMERGENCY_BENEFIT_TEST_TAG), null, composer3, 390, 8);
                    Benefits.BenefitRow(ServerToBentoAssetMapper2.ACCOUNT_SUMMARY_24, C12201R.string.waitlist_intro_roadside_dispatch, TestTag3.testTag(companion3, Benefits.BENEFITS_ROADSIDE_DISPATCH_BENEFIT_TEST_TAG), null, composer3, 390, 8);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer3, i6).m21592getMediumD9Ej5fM()), composer3, 0);
                    composer3.endNode();
                    Gradient2.Gradient(true, TestTag3.testTag(boxScopeInstance.align(companion3, companion.getBottomCenter()), Benefits.BENEFITS_GRADIENT_TEST_TAG), composer3, 6, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 805306368, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.BenefitsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Benefits.Benefits$lambda$0(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BenefitRow(final ServerToBentoAssetMapper2 serverToBentoAssetMapper2, final int i, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-449831918);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(serverToBentoAssetMapper2.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    function22 = function2;
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
                }
                if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function23 = function22;
                } else {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    function23 = i5 == 0 ? null : function22;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-449831918, i4, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.BenefitRow (Benefits.kt:137)");
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    if (function23 == null) {
                        composerStartRestartGroup.startReplaceGroup(206254827);
                        function23.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 9) & 14));
                        composerStartRestartGroup.endReplaceGroup();
                        i6 = 0;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(206298196);
                        i6 = 0;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2), null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 56);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM()), composerStartRestartGroup, i6);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i, composerStartRestartGroup, (i4 >> 3) & 14), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextL(), composerStartRestartGroup, 0, 0, 8190);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.BenefitsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Benefits.BenefitRow$lambda$2(serverToBentoAssetMapper2, i, modifier3, function23, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            function22 = function2;
            if ((i4 & 1171) == 1170) {
                if (i7 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    if (function23 == null) {
                    }
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i82 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21592getMediumD9Ej5fM()), composerStartRestartGroup, i6);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i, composerStartRestartGroup, (i4 >> 3) & 14), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i82).getTextL(), composerStartRestartGroup, 0, 0, 8190);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        function22 = function2;
        if ((i4 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
