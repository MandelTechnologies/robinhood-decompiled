package com.robinhood.android.advisory.projection;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.android.advisory.projection.frequency.SimulateDepositFrequency2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DepositCta.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\n"}, m3636d2 = {"OptionalDepositCta", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/advisory/projection/DepositCtaData;", "frequency", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/projection/DepositCtaData;Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DepositCta", "feature-projected-returns_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.DepositCtaKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DepositCta2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DepositCta$lambda$5(DepositCtaData depositCtaData, SimulateDepositFrequency simulateDepositFrequency, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DepositCta(depositCtaData, simulateDepositFrequency, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionalDepositCta$lambda$2(DepositCtaData depositCtaData, SimulateDepositFrequency simulateDepositFrequency, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionalDepositCta(depositCtaData, simulateDepositFrequency, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionalDepositCta(final DepositCtaData depositCtaData, final SimulateDepositFrequency frequency, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1818780241);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(depositCtaData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(frequency.ordinal()) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-1818780241, i3, -1, "com.robinhood.android.advisory.projection.OptionalDepositCta (DepositCta.kt:49)");
                }
                if (depositCtaData == null) {
                    composerStartRestartGroup.startReplaceGroup(2025423345);
                    modifier3 = modifier4;
                    DepositCta(depositCtaData, frequency, modifier3, composerStartRestartGroup, i3 & 1022, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    composerStartRestartGroup.startReplaceGroup(2025564767);
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                    String strStringResource = StringResources_androidKt.stringResource(C9264R.string.projection_screen_cta_one_time_deposit_text, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.projection.DepositCtaKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 6, 0, 8184);
                    composerStartRestartGroup.endReplaceGroup();
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
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.DepositCtaKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DepositCta2.OptionalDepositCta$lambda$2(depositCtaData, frequency, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (depositCtaData == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DepositCta(final DepositCtaData data, final SimulateDepositFrequency frequency, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Navigator navigator;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Composer composerStartRestartGroup = composer.startRestartGroup(-909136081);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(frequency.ordinal()) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-909136081, i3, -1, "com.robinhood.android.advisory.projection.DepositCta (DepositCta.kt:74)");
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                boolean zIsRetirement = data.getBrokerageAccountType().isRetirement();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), AdvisoryProjectionScreen.TagProjectionCtaButton), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.PRIMARY_CTA, null, new Component(Component.ComponentType.BUTTON, "deposit_money", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                String strStringResource = StringResources_androidKt.stringResource((zIsRetirement || !SimulateDepositFrequency2.isRecurring(frequency)) ? (zIsRetirement || SimulateDepositFrequency2.isRecurring(frequency)) ? (zIsRetirement && SimulateDepositFrequency2.isRecurring(frequency)) ? C9264R.string.projection_screen_cta_recurring_deposit_text : C9264R.string.projection_screen_cta_one_time_deposit_text : C9264R.string.projection_screen_cta_one_time_contribution_text : C9264R.string.projection_screen_cta_recurring_contribution_text, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.projection.DepositCtaKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DepositCta2.DepositCta$lambda$4$lambda$3(navigator, context, data, frequency);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierAutoLogEvents$default, null, type2, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.DepositCtaKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DepositCta2.DepositCta$lambda$5(data, frequency, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean zIsRetirement2 = data.getBrokerageAccountType().isRetirement();
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(TestTag3.testTag(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), AdvisoryProjectionScreen.TagProjectionCtaButton), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.PRIMARY_CTA, null, new Component(Component.ComponentType.BUTTON, "deposit_money", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
            BentoButtons.Type type22 = BentoButtons.Type.Primary;
            if (zIsRetirement2) {
                if (zIsRetirement2) {
                    if (zIsRetirement2) {
                        String strStringResource2 = StringResources_androidKt.stringResource((zIsRetirement2 || !SimulateDepositFrequency2.isRecurring(frequency)) ? (zIsRetirement2 || SimulateDepositFrequency2.isRecurring(frequency)) ? (zIsRetirement2 && SimulateDepositFrequency2.isRecurring(frequency)) ? C9264R.string.projection_screen_cta_recurring_deposit_text : C9264R.string.projection_screen_cta_one_time_deposit_text : C9264R.string.projection_screen_cta_one_time_contribution_text : C9264R.string.projection_screen_cta_recurring_contribution_text, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 112) != 32);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.projection.DepositCtaKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DepositCta2.DepositCta$lambda$4$lambda$3(navigator, context, data, frequency);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier4;
                            composer2 = composerStartRestartGroup;
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierAutoLogEvents$default2, null, type22, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DepositCta$lambda$4$lambda$3(Navigator navigator, Context context, DepositCtaData depositCtaData, SimulateDepositFrequency simulateDepositFrequency) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, depositCtaData.getIntent(simulateDepositFrequency), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }
}
