package com.robinhood.android.dashboard.lib.buyingpower;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.dashboard.lib.C13691R;
import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerViewState;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.margin.contracts.BuyingPowerHubIntentKey;
import com.robinhood.android.margin.contracts.CheckBuyingPowerDeficitIntentKey;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.models.p320db.MarginHealth;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.tooltips.ModifiersKt;
import com.robinhood.tooltips.TooltipData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PortfolioBuyingPower.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a'\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u000e\u0010\t\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002"}, m3636d2 = {"BuyingPowerMetaTextTestTag", "", "getBuyingPowerMetaTextTestTag$annotations", "()V", "getBuyingPowerMetaTextTestTag", "()Ljava/lang/String;", "BuyingPowerAlertTestTag", "getBuyingPowerAlertTestTag$annotations", "getBuyingPowerAlertTestTag", "BuyingPowerTooltipTag", "MarginHubOnboardingTooltipId", "IntentKeyEntryPoint", "TOOLTIP_OFFSET_Y", "", "TOOLTIP_DISPLAY_TIME", "", "PortfolioBuyingPower", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState$Loaded;", "callbacks", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState$Loaded;Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerCallbacks;Landroidx/compose/runtime/Composer;II)V", "lib-account-home_externalDebug", "subtitlePositionInWindow", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioBuyingPower5 {
    private static final String BuyingPowerAlertTestTag = "buying_power_alert";
    private static final String BuyingPowerMetaTextTestTag = "buying_power_meta_text";
    public static final String BuyingPowerTooltipTag = "margin-hub-onboarding-tool-tip";
    public static final String IntentKeyEntryPoint = "watchlist";
    public static final String MarginHubOnboardingTooltipId = "MARGIN_HUB_ONBOARDING";
    public static final long TOOLTIP_DISPLAY_TIME = 10000;
    public static final float TOOLTIP_OFFSET_Y = -48.0f;

    /* compiled from: PortfolioBuyingPower.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PortfolioBuyingPowerNavigationDestinationProvider2.values().length];
            try {
                iArr[PortfolioBuyingPowerNavigationDestinationProvider2.CHECK_BUYING_POWER_DEFICIT_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PortfolioBuyingPowerNavigationDestinationProvider2.BUYING_POWER_HUB_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioBuyingPower$lambda$11(Modifier modifier, PortfolioBuyingPowerViewState.Loaded loaded, PortfolioBuyingPower4 portfolioBuyingPower4, int i, int i2, Composer composer, int i3) {
        PortfolioBuyingPower(modifier, loaded, portfolioBuyingPower4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getBuyingPowerAlertTestTag$annotations() {
    }

    public static /* synthetic */ void getBuyingPowerMetaTextTestTag$annotations() {
    }

    public static final String getBuyingPowerMetaTextTestTag() {
        return BuyingPowerMetaTextTestTag;
    }

    public static final String getBuyingPowerAlertTestTag() {
        return BuyingPowerAlertTestTag;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0217  */
    @SuppressLint({"UnusedTargetStateInContentKeyLambda"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioBuyingPower(Modifier modifier, final PortfolioBuyingPowerViewState.Loaded state, final PortfolioBuyingPower4 callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str;
        final BuyingPowerAlert2 buyingPowerAlert2;
        BuyingPowerAlert2 buyingPowerAlert22;
        boolean z;
        String str2;
        AnimationTargetState animationTargetState;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean z2;
        Integer num;
        SnapshotState snapshotState2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-201569945);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-201569945, i3, -1, "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower (PortfolioBuyingPower.kt:77)");
            }
            Money buyingPower = state.getBuyingPower();
            MarginHealth.MarginHealthState marginHealthState = state.getMarginHealthState();
            String marginHubTooltip = state.getMarginHubTooltip();
            boolean hasAccountDeficit = state.getHasAccountDeficit();
            composerStartRestartGroup.startReplaceGroup(-435174203);
            String strStringResource = hasAccountDeficit ? StringResources_androidKt.stringResource(C13691R.string.portfolio_buying_power_negative_value, composerStartRestartGroup, 0) : state.getPrivacyEnabled() ? "****" : Money.format$default(buyingPower, null, false, null, false, 0, 2, false, null, false, false, 991, null);
            composerStartRestartGroup.endReplaceGroup();
            AnimationTargetState animationTargetState2 = new AnimationTargetState(strStringResource, state.getPrivacyEnabled(), state.getBuyingPower().getCurrency());
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final Screen screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
            Integer buyingPowerSubtitleId = state.getBuyingPowerSubtitleId();
            if (hasAccountDeficit) {
                buyingPowerAlert22 = BuyingPowerAlert2.ACCOUNT_DEFICIT;
            } else if (marginHealthState == MarginHealth.MarginHealthState.RISKY) {
                buyingPowerAlert22 = BuyingPowerAlert2.MARGIN_HEALTH;
            } else {
                str = marginHubTooltip;
                buyingPowerAlert2 = null;
                composerStartRestartGroup.startReplaceGroup(-435141740);
                if (str != null) {
                    z = hasAccountDeficit;
                    animationTargetState = animationTargetState2;
                    str2 = str;
                    modifier3 = null;
                } else {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    TooltipData.Layout layout = new TooltipData.Layout(RdsTooltipView.NibDirection.DOWN, -48.0f, null, null, 12, null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    z = hasAccountDeficit;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks)));
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PortfolioBuyingPower5.PortfolioBuyingPower$lambda$4$lambda$1$lambda$0(current, screen, callbacks);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function0 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PortfolioBuyingPower5.PortfolioBuyingPower$lambda$4$lambda$3$lambda$2(current, screen, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    str2 = str;
                    animationTargetState = animationTargetState2;
                    modifier3 = ModifiersKt.tooltip$default(companion2, str2, layout, new TooltipData.Behavior(1, function0, null, null, (Function1) objRememberedValue4, null, 10000L, 44, null), BuyingPowerTooltipTag, false, 16, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (modifier3 == null) {
                    modifier3 = Modifier.INSTANCE;
                }
                Modifier modifier5 = modifier3;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(str2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    z2 = z;
                    num = buyingPowerSubtitleId;
                    final String str3 = str2;
                    snapshotState2 = snapshotState;
                    Object obj = new Function0() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PortfolioBuyingPower5.PortfolioBuyingPower$lambda$9$lambda$8(state, navigator, context, str3, callbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                    objRememberedValue2 = obj;
                } else {
                    snapshotState2 = snapshotState;
                    num = buyingPowerSubtitleId;
                    z2 = z;
                }
                composerStartRestartGroup.endReplaceGroup();
                Integer num2 = num;
                SnapshotState snapshotState3 = snapshotState2;
                modifier2 = modifier4;
                Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue2, 7, null), LoggingUtils3.updateWithBuyingPowerData((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), marginHealthState, z2), true, false, false, true, false, null, 108, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, PortfolioBuyingPower2.INSTANCE.getLambda$295175956$lib_account_home_externalDebug(), ComposableLambda3.rememberComposableLambda(1247007795, true, new PortfolioBuyingPower6(num2, snapshotState3), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-2096127662, true, new PortfolioBuyingPower7(animationTargetState, modifier5), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1144295823, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$PortfolioBuyingPower$2$3
                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1144295823, i5, -1, "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower.<anonymous>.<anonymous> (PortfolioBuyingPower.kt:195)");
                        }
                        BuyingPowerAlert2 buyingPowerAlert23 = buyingPowerAlert2;
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion4);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceGroup(1132065101);
                        if (buyingPowerAlert23 != null) {
                            BuyingPowerAlert.BuyingPowerAlert(TestTag3.testTag(companion4, PortfolioBuyingPower5.getBuyingPowerAlertTestTag()), buyingPowerAlert23, composer3, 6);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num3) {
                        invoke(composer3, num3.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), false, false, false, null, composer2, 14380032, 0, 1799);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            buyingPowerAlert2 = buyingPowerAlert22;
            str = marginHubTooltip;
            composerStartRestartGroup.startReplaceGroup(-435141740);
            if (str != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (modifier3 == null) {
            }
            Modifier modifier52 = modifier3;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            if ((i3 & 896) != 256) {
                zChangedInstance = ((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(str2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    z2 = z;
                    num = buyingPowerSubtitleId;
                    final String str32 = str2;
                    snapshotState2 = snapshotState;
                    Object obj2 = new Function0() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PortfolioBuyingPower5.PortfolioBuyingPower$lambda$9$lambda$8(state, navigator, context, str32, callbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                    composerStartRestartGroup.endReplaceGroup();
                    Integer num22 = num;
                    SnapshotState snapshotState32 = snapshotState2;
                    modifier2 = modifier4;
                    Modifier modifierAutoLogEvents$default2 = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue2, 7, null), LoggingUtils3.updateWithBuyingPowerData((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), marginHealthState, z2), true, false, false, true, false, null, 108, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        composer2 = composerStartRestartGroup;
                        BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, PortfolioBuyingPower2.INSTANCE.getLambda$295175956$lib_account_home_externalDebug(), ComposableLambda3.rememberComposableLambda(1247007795, true, new PortfolioBuyingPower6(num22, snapshotState32), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-2096127662, true, new PortfolioBuyingPower7(animationTargetState, modifier52), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1144295823, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$PortfolioBuyingPower$2$3
                            public final void invoke(Composer composer3, int i5) {
                                if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1144295823, i5, -1, "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower.<anonymous>.<anonymous> (PortfolioBuyingPower.kt:195)");
                                }
                                BuyingPowerAlert2 buyingPowerAlert23 = buyingPowerAlert2;
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer3, companion4);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor22 = companion5.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor22);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion5.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceGroup(1132065101);
                                if (buyingPowerAlert23 != null) {
                                    BuyingPowerAlert.BuyingPowerAlert(TestTag3.testTag(companion4, PortfolioBuyingPower5.getBuyingPowerAlertTestTag()), buyingPowerAlert23, composer3, 6);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num3) {
                                invoke(composer3, num3.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54), false, false, false, null, composer2, 14380032, 0, 1799);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        final Modifier modifier6 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return PortfolioBuyingPower5.PortfolioBuyingPower$lambda$11(modifier6, state, callbacks, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long PortfolioBuyingPower$lambda$6(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioBuyingPower$lambda$4$lambda$3$lambda$2(EventLogger eventLogger, Screen screen, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LoggingUtils3.logTooltipViewed(eventLogger, screen);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioBuyingPower$lambda$4$lambda$1$lambda$0(EventLogger eventLogger, Screen screen, PortfolioBuyingPower4 portfolioBuyingPower4) {
        LoggingUtils3.logTooltipClicked(eventLogger, screen);
        portfolioBuyingPower4.markTooltipSeen();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioBuyingPower$lambda$7(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioBuyingPower$lambda$9$lambda$8(PortfolioBuyingPowerViewState.Loaded loaded, Navigator navigator, Context context, String str, PortfolioBuyingPower4 portfolioBuyingPower4) {
        IntentKey buyingPowerHubIntentKey;
        int i = WhenMappings.$EnumSwitchMapping$0[loaded.getNavigationDestination().ordinal()];
        if (i == 1) {
            buyingPowerHubIntentKey = CheckBuyingPowerDeficitIntentKey.INSTANCE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            buyingPowerHubIntentKey = new BuyingPowerHubIntentKey(loaded.getAccountNumber(), IntentKeyEntryPoint, null, 4, null);
        }
        Navigator.DefaultImpls.startActivity$default(navigator, context, buyingPowerHubIntentKey, null, false, null, null, 60, null);
        if (str != null) {
            portfolioBuyingPower4.markTooltipSeen();
        }
        return Unit.INSTANCE;
    }
}
