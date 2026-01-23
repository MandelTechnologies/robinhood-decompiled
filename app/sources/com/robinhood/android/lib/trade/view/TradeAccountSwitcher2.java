package com.robinhood.android.lib.trade.view;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCta;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherUtils4;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradeAccountSwitcher.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"MinHeight", "Landroidx/compose/ui/unit/Dp;", "F", "shortNameRes", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "getShortNameRes", "(Lcom/robinhood/models/api/BrokerageAccountType;)I", "TradeAccountSwitcher", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState;", "callbacks", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState;Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;Landroidx/compose/runtime/Composer;II)V", "feature-lib-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.trade.view.TradeAccountSwitcherKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class TradeAccountSwitcher2 {
    private static final float MinHeight = C2002Dp.m7995constructorimpl(44);

    /* compiled from: TradeAccountSwitcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.trade.view.TradeAccountSwitcherKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeAccountSwitcher$lambda$8(Modifier modifier, TradeAccountSwitcherState tradeAccountSwitcherState, AccountSwitcherCallbacks3 accountSwitcherCallbacks3, int i, int i2, Composer composer, int i3) {
        TradeAccountSwitcher(modifier, tradeAccountSwitcherState, accountSwitcherCallbacks3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final int getShortNameRes(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case 1:
            case 2:
                return C20649R.string.account_switcher_default_custodial;
            case 3:
            case 4:
                return C20649R.string.account_switcher_default_individual;
            case 5:
                return C20649R.string.account_switcher_default_ira_roth;
            case 6:
                return C20649R.string.account_switcher_default_ira_traditional;
            case 7:
                return C20649R.string.account_switcher_default_joint_tenancy_with_ros;
            case 8:
                return C20649R.string.account_switcher_default_isa_stocks_and_shares;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void TradeAccountSwitcher(Modifier modifier, final TradeAccountSwitcherState state, final AccountSwitcherCallbacks3 callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function0HapticClick;
        final Modifier modifier3;
        Function0<Unit> function0HapticClick2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-994483334);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-994483334, i3, -1, "com.robinhood.android.lib.trade.view.TradeAccountSwitcher (TradeAccountSwitcher.kt:45)");
            }
            final TradeAccountSwitcherState.LoadedState loadedState = state.getLoadedState();
            BrokerageAccountType activeAccountType = state.getActiveAccountType();
            if (loadedState != null) {
                composerStartRestartGroup.startReplaceGroup(31725776);
                String title = loadedState.getTitle();
                TextStyle textM = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM();
                ServerToBentoAssetMapper2 asset = AccountSwitcherExtensions.getAsset(loadedState.getLeadingIcon());
                boolean loading = state.getLoading();
                float f = MinHeight;
                boolean enableAccountSwitching = state.getEnableAccountSwitching();
                if (state.getEnableAccountSwitching()) {
                    composerStartRestartGroup.startReplaceGroup(32149236);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(loadedState) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(state))) | composerStartRestartGroup.changedInstance(callbacks);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.lib.trade.view.TradeAccountSwitcherKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TradeAccountSwitcher2.TradeAccountSwitcher$lambda$1$lambda$0(loadedState, state, callbacks);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function0HapticClick2 = Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(32575486);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.lib.trade.view.TradeAccountSwitcherKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function0HapticClick2 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                }
                AccountSwitcherCta.m15801AccountSwitcherCtaGmEhDVc(title, textM, modifier4, asset, loading, f, enableAccountSwitching, false, function0HapticClick2, composerStartRestartGroup, ((i3 << 6) & 896) | 196608, 128);
                composerStartRestartGroup.endReplaceGroup();
            } else if (activeAccountType != null) {
                composerStartRestartGroup.startReplaceGroup(32710894);
                final AccountSwitcherData accountSwitcherDataFrom$default = AccountSwitcherData.Companion.from$default(AccountSwitcherData.INSTANCE, state.getActiveAccountNumber(), AccountSwitcherUtils4.filterDeactivatedForSwitcher(state.getAllAccounts()), true, state.getFallbackAccountSelectable(), null, 16, null);
                String strStringResource = StringResources_androidKt.stringResource(getShortNameRes(activeAccountType), composerStartRestartGroup, 0);
                TextStyle textM2 = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM();
                ServerToBentoAssetMapper2 defaultIconAsset = AccountDisplayIcons.getDefaultIconAsset(activeAccountType);
                boolean loading2 = state.getLoading();
                float f2 = MinHeight;
                boolean enableAccountSwitching2 = state.getEnableAccountSwitching();
                if (state.getEnableAccountSwitching()) {
                    composerStartRestartGroup.startReplaceGroup(33471665);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(callbacks) | composerStartRestartGroup.changedInstance(accountSwitcherDataFrom$default);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.lib.trade.view.TradeAccountSwitcherKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TradeAccountSwitcher2.TradeAccountSwitcher$lambda$5$lambda$4(callbacks, accountSwitcherDataFrom$default);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function0HapticClick = Haptics.hapticClick((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(33624030);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.lib.trade.view.TradeAccountSwitcherKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    function0HapticClick = (Function0) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                }
                AccountSwitcherCta.m15801AccountSwitcherCtaGmEhDVc(strStringResource, textM2, modifier4, defaultIconAsset, loading2, f2, enableAccountSwitching2, false, function0HapticClick, composerStartRestartGroup, ((i3 << 6) & 896) | 196608, 128);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2079301142);
                BoxKt.Box(ModifiersKt.bentoPillPlaceholder(SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier4, 0.0f, MinHeight, 1, null), true), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.trade.view.TradeAccountSwitcherKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeAccountSwitcher2.TradeAccountSwitcher$lambda$8(modifier3, state, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeAccountSwitcher$lambda$1$lambda$0(TradeAccountSwitcherState.LoadedState loadedState, TradeAccountSwitcherState tradeAccountSwitcherState, AccountSwitcherCallbacks3 accountSwitcherCallbacks3) {
        SurfaceDto surface = loadedState.getSurface();
        if (tradeAccountSwitcherState.getUseSduiAccountSwitcher() && surface != null) {
            accountSwitcherCallbacks3.showSduiAccountSwitcher(surface);
        } else {
            accountSwitcherCallbacks3.onAccountSwitcherCtaClicked(loadedState.getData());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeAccountSwitcher$lambda$5$lambda$4(AccountSwitcherCallbacks3 accountSwitcherCallbacks3, AccountSwitcherData accountSwitcherData) {
        accountSwitcherCallbacks3.onAccountSwitcherCtaClicked(accountSwitcherData);
        return Unit.INSTANCE;
    }
}
