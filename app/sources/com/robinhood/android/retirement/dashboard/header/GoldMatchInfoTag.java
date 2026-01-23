package com.robinhood.android.retirement.dashboard.header;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.investment.model.GoldHeaderPillData;
import com.robinhood.android.gold.investment.p150ui.GoldHeaderPillButton;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.responsive.SpaceBetweenOrStack;
import com.robinhood.android.retirement.contracts.RetirementGoldPromo;
import com.robinhood.android.retirement.contracts.RetirementMatchHub;
import com.robinhood.android.retirement.dashboard.C26985R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagDefaults;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldMatchInfoTag.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u000f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"", "matchRate", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "PartnershipMatchInfoTag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "matchRateBreakdown", "MatchInfoTag", "(Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "activeMatchBreakdown", "content", "ContainerWithMatchInfoTag", "(Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "lib-retirement-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.dashboard.header.GoldMatchInfoTagKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class GoldMatchInfoTag {

    /* compiled from: GoldMatchInfoTag.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.dashboard.header.GoldMatchInfoTagKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiRetirementMatchResponse3.values().length];
            try {
                iArr[ApiRetirementMatchResponse3.GOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiRetirementMatchResponse3.PARTNERSHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiRetirementMatchResponse3.BASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiRetirementMatchResponse3.UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContainerWithMatchInfoTag$lambda$7(MatchRateBreakdown matchRateBreakdown, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        ContainerWithMatchInfoTag(matchRateBreakdown, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchInfoTag$lambda$6(MatchRateBreakdown matchRateBreakdown, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        MatchInfoTag(matchRateBreakdown, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PartnershipMatchInfoTag$lambda$0(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        PartnershipMatchInfoTag(str, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PartnershipMatchInfoTag(final String matchRate, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(matchRate, "matchRate");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2098679940);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(matchRate) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2098679940, i3, -1, "com.robinhood.android.retirement.dashboard.header.PartnershipMatchInfoTag (GoldMatchInfoTag.kt:35)");
                }
                InfoTagDefaults infoTagDefaults = InfoTagDefaults.INSTANCE;
                Modifier modifierClip = Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults.m20818getShapeRadiusD9Ej5fM()));
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme.getColors(composerStartRestartGroup, i5).getPrime(), null, 2, null), false, null, null, onClick, 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "partner_offer_match_pill", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), infoTagDefaults.m20816getInternalPaddingEndD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM());
                String strStringResource = StringResources_androidKt.stringResource(C26985R.string.retirement_partnership_match_rate, new Object[]{matchRate}, composerStartRestartGroup, 0);
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5143paddingVpY3zN4, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getJet()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8168);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.header.GoldMatchInfoTagKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldMatchInfoTag.PartnershipMatchInfoTag$lambda$0(matchRate, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            InfoTagDefaults infoTagDefaults2 = InfoTagDefaults.INSTANCE;
            Modifier modifierClip2 = Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults2.m20818getShapeRadiusD9Ej5fM()));
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(Background3.m4872backgroundbw27NRU$default(modifierClip2, bentoTheme2.getColors(composerStartRestartGroup, i52).getPrime(), null, 2, null), false, null, null, onClick, 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "partner_offer_match_pill", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), infoTagDefaults2.m20816getInternalPaddingEndD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM());
            String strStringResource2 = StringResources_androidKt.stringResource(C26985R.string.retirement_partnership_match_rate, new Object[]{matchRate}, composerStartRestartGroup, 0);
            TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM5143paddingVpY3zN42, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).getJet()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS2, composer2, 24576, 0, 8168);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchInfoTag(final MatchRateBreakdown matchRateBreakdown, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(matchRateBreakdown, "matchRateBreakdown");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1578175843);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(matchRateBreakdown) ? 4 : 2) | i;
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
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1578175843, i3, -1, "com.robinhood.android.retirement.dashboard.header.MatchInfoTag (GoldMatchInfoTag.kt:71)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                String str = Formats.getWholeNumberWithPercentageSuffixFormat().format(matchRateBreakdown.getAchTransferPercentage());
                i4 = WhenMappings.$EnumSwitchMapping$0[matchRateBreakdown.getBreakdownType().ordinal()];
                if (i4 != 1) {
                    modifier3 = modifier4;
                    composerStartRestartGroup.startReplaceGroup(1570881308);
                    GoldHeaderPillData goldHeaderPillData = new GoldHeaderPillData(StringResources_androidKt.stringResource(C26985R.string.gated_gold_retirement_gold_match_rate, new Object[]{str}, composerStartRestartGroup, 0), "retirement-tab-gold-pill", null, null, 8, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.dashboard.header.GoldMatchInfoTagKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GoldMatchInfoTag.MatchInfoTag$lambda$3$lambda$2(navigator, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    GoldHeaderPillButton.m15057GoldHeaderPillButtonfWhpE4E(goldHeaderPillData, modifier3, null, 0L, false, (Function0) objRememberedValue, composerStartRestartGroup, GoldHeaderPillData.$stable | (i3 & 112), 28);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 2) {
                    composerStartRestartGroup.startReplaceGroup(1571532339);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.retirement.dashboard.header.GoldMatchInfoTagKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GoldMatchInfoTag.MatchInfoTag$lambda$5$lambda$4(navigator, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    PartnershipMatchInfoTag(str, (Function0) objRememberedValue2, modifier5, composerStartRestartGroup, (i3 << 3) & 896, 0);
                    modifier3 = modifier5;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i4 != 3 && i4 != 4) {
                        composerStartRestartGroup.startReplaceGroup(-503517473);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1572070871);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.header.GoldMatchInfoTagKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldMatchInfoTag.MatchInfoTag$lambda$6(matchRateBreakdown, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String str2 = Formats.getWholeNumberWithPercentageSuffixFormat().format(matchRateBreakdown.getAchTransferPercentage());
            i4 = WhenMappings.$EnumSwitchMapping$0[matchRateBreakdown.getBreakdownType().ordinal()];
            if (i4 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchInfoTag$lambda$3$lambda$2(Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new RetirementGoldPromo(null, 1, null), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchInfoTag$lambda$5$lambda$4(Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new RetirementMatchHub("retirement-dashboard-match-pill"), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    public static final void ContainerWithMatchInfoTag(final MatchRateBreakdown matchRateBreakdown, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(977777799);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(matchRateBreakdown) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(977777799, i3, -1, "com.robinhood.android.retirement.dashboard.header.ContainerWithMatchInfoTag (GoldMatchInfoTag.kt:130)");
            }
            SpaceBetweenOrStack.m18095SpaceBetweenOrStackDzVHIIc(modifier3, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), false, ComposableLambda3.rememberComposableLambda(1446889308, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.dashboard.header.GoldMatchInfoTagKt.ContainerWithMatchInfoTag.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) throws Resources.NotFoundException {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1446889308, i5, -1, "com.robinhood.android.retirement.dashboard.header.ContainerWithMatchInfoTag.<anonymous> (GoldMatchInfoTag.kt:135)");
                    }
                    content.invoke(composer2, 0);
                    MatchRateBreakdown matchRateBreakdown2 = matchRateBreakdown;
                    if (matchRateBreakdown2 != null) {
                        GoldMatchInfoTag.MatchInfoTag(matchRateBreakdown2, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), composer2, 0, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.header.GoldMatchInfoTagKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldMatchInfoTag.ContainerWithMatchInfoTag$lambda$7(matchRateBreakdown, modifier2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
