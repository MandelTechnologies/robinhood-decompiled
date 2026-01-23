package com.robinhood.android.dashboard.lib.header.brokerage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.dashboard.lib.PlaceholderDashboard5;
import com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeader;
import com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponent;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheet;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheet5;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCta;
import com.robinhood.android.responsive.SpaceBetweenOrStack;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.home.HomeAccountSwitcher;
import com.robinhood.models.home.api.ApiHomeAccountSwitcher;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: BrokerageAccountHeader.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aS\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a!\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u008e\u0002"}, m3636d2 = {"NoHeaderTestTag", "", "AccountSwitcherTestTag", "BrokerageAccountSwitcherHeader", "", "title", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "onActionTaken", "Lkotlin/Function1;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction;", "showBadge", "", "modifier", "Landroidx/compose/ui/Modifier;", "onClickCallback", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BrokerageAccountHeader", "duxo", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDuxo;Landroidx/compose/runtime/Composer;II)V", "findBaseActivity", "Lcom/robinhood/android/common/ui/BaseActivity;", "Landroid/content/Context;", "lib-account-home_externalDebug", "showingAccountSwitcher", "viewState", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderViewState;", "showAccountSwitcherTooltip"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class BrokerageAccountHeader {
    public static final String AccountSwitcherTestTag = "brokerage_dashboard_account_switcher";
    public static final String NoHeaderTestTag = "brokerage_dashboard_no_header";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageAccountHeader$lambda$19(Modifier modifier, DashboardHeaderDuxo dashboardHeaderDuxo, int i, int i2, Composer composer, int i3) {
        BrokerageAccountHeader(modifier, dashboardHeaderDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageAccountSwitcherHeader$lambda$9(String str, AccountSwitcherData accountSwitcherData, Function1 function1, boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        BrokerageAccountSwitcherHeader(str, accountSwitcherData, function1, z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BrokerageAccountSwitcherHeader(final String str, final AccountSwitcherData accountSwitcherData, final Function1<? super AccountSwitcherBottomSheet5, Unit> function1, final boolean z, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        AccountSwitcherData accountSwitcherData2;
        Function1<? super AccountSwitcherBottomSheet5, Unit> function12;
        boolean z2;
        int i4;
        Modifier modifier2;
        int i5;
        Function0<Unit> function02;
        final Modifier modifier3;
        final Function0<Unit> function03;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean z3;
        Object objRememberedValue2;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1930658146);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                accountSwitcherData2 = accountSwitcherData;
                i3 |= composerStartRestartGroup.changedInstance(accountSwitcherData2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                }
                i4 = i2 & 16;
                if (i4 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    i5 = i2 & 32;
                    if (i5 != 0) {
                        if ((196608 & i) == 0) {
                            function02 = function0;
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                        }
                        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            function04 = function02;
                        } else {
                            modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                function03 = (Function0) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function03 = function02;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1930658146, i3, -1, "com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountSwitcherHeader (BrokerageAccountHeader.kt:48)");
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            TextStyle displayCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleLarge();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            z3 = (458752 & i3) != 131072;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z3 || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return BrokerageAccountHeader.BrokerageAccountSwitcherHeader$lambda$6$lambda$5(function03, snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Function0<Unit> function05 = function03;
                            AccountSwitcherCta.m15801AccountSwitcherCtaGmEhDVc(str2, displayCapsuleLarge, TestTag3.testTag(modifier3, AccountSwitcherTestTag), null, false, 0.0f, false, z2, Haptics.hapticClick((Function0) objRememberedValue2, composerStartRestartGroup, 0), composerStartRestartGroup, (i3 & 14) | 24576 | ((i3 << 12) & 29360128), 104);
                            composerStartRestartGroup = composerStartRestartGroup;
                            if (BrokerageAccountSwitcherHeader$lambda$3(snapshotState)) {
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return BrokerageAccountHeader.BrokerageAccountSwitcherHeader$lambda$8$lambda$7(snapshotState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                int i6 = i3 >> 3;
                                AccountSwitcherBottomSheet.AccountSwitcherModalBottomSheet(accountSwitcherData2, function12, (Function0) objRememberedValue4, null, composerStartRestartGroup, (i6 & 14) | 384 | (i6 & 112), 8);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function04 = function05;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BrokerageAccountHeader.BrokerageAccountSwitcherHeader$lambda$9(str, accountSwitcherData, function1, z, modifier3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function02 = function0;
                    if ((74899 & i3) == 74898) {
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        TextStyle displayCapsuleLarge2 = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleLarge();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        if ((458752 & i3) != 131072) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z3) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BrokerageAccountHeader.BrokerageAccountSwitcherHeader$lambda$6$lambda$5(function03, snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            Function0<Unit> function052 = function03;
                            AccountSwitcherCta.m15801AccountSwitcherCtaGmEhDVc(str2, displayCapsuleLarge2, TestTag3.testTag(modifier3, AccountSwitcherTestTag), null, false, 0.0f, false, z2, Haptics.hapticClick((Function0) objRememberedValue2, composerStartRestartGroup, 0), composerStartRestartGroup, (i3 & 14) | 24576 | ((i3 << 12) & 29360128), 104);
                            composerStartRestartGroup = composerStartRestartGroup;
                            if (BrokerageAccountSwitcherHeader$lambda$3(snapshotState)) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function04 = function052;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                i5 = i2 & 32;
                if (i5 != 0) {
                }
                function02 = function0;
                if ((74899 & i3) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function12 = function1;
            if ((i2 & 8) != 0) {
            }
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function02 = function0;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        accountSwitcherData2 = accountSwitcherData;
        if ((i2 & 4) == 0) {
        }
        function12 = function1;
        if ((i2 & 8) != 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function02 = function0;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void BrokerageAccountSwitcherHeader$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageAccountSwitcherHeader$lambda$6$lambda$5(Function0 function0, SnapshotState snapshotState) {
        function0.invoke();
        BrokerageAccountSwitcherHeader$lambda$4(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageAccountSwitcherHeader$lambda$8$lambda$7(SnapshotState snapshotState) {
        BrokerageAccountSwitcherHeader$lambda$4(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BrokerageAccountHeader(Modifier modifier, DashboardHeaderDuxo dashboardHeaderDuxo, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        DashboardHeaderDuxo dashboardHeaderDuxo2;
        final Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        final DashboardHeaderDuxo dashboardHeaderDuxo3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Composer composerStartRestartGroup = composer.startRestartGroup(-490539096);
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
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                dashboardHeaderDuxo2 = dashboardHeaderDuxo;
                int i5 = composerStartRestartGroup.changedInstance(dashboardHeaderDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                dashboardHeaderDuxo2 = dashboardHeaderDuxo;
            }
            i3 |= i5;
        } else {
            dashboardHeaderDuxo2 = dashboardHeaderDuxo;
        }
        int i6 = i3;
        if ((i6 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DashboardHeaderDuxo.class), current, "brokerage_dashboard_header", factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 384, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$BrokerageAccountHeader$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$BrokerageAccountHeader$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i6 &= -113;
                    dashboardHeaderDuxo3 = (DashboardHeaderDuxo) baseDuxo;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-490539096, i6, -1, "com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeader (BrokerageAccountHeader.kt:82)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dashboardHeaderDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                if (!BrokerageAccountHeader$lambda$10(snapshotState4CollectAsStateWithLifecycle).getAccountsLoading()) {
                    composerStartRestartGroup.startReplaceGroup(2123768496);
                    PlaceholderDashboard5.PlaceholderAccountHeader(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (!BrokerageAccountHeader$lambda$10(snapshotState4CollectAsStateWithLifecycle).getShowHeader()) {
                    composerStartRestartGroup.startReplaceGroup(2123850863);
                    Spacer2.Spacer(ModifiersKt.performanceIndicator(TestTag3.testTag(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1)), NoHeaderTestTag), BrokerageAccountHeader$lambda$10(snapshotState4CollectAsStateWithLifecycle).loadedState()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2124272897);
                    String text = StringUtil2.getText(BrokerageAccountHeader$lambda$10(snapshotState4CollectAsStateWithLifecycle).getTitle(), composerStartRestartGroup, StringResource.$stable);
                    Object[] objArr = {BrokerageAccountHeader$lambda$10(snapshotState4CollectAsStateWithLifecycle).getTooltip()};
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BrokerageAccountHeader.BrokerageAccountHeader$lambda$12$lambda$11(snapshotState4CollectAsStateWithLifecycle);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                    Object[] objArr2 = {BrokerageAccountHeader$lambda$10(snapshotState4CollectAsStateWithLifecycle).getBadge()};
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BrokerageAccountHeader.BrokerageAccountHeader$lambda$16$lambda$15(snapshotState4CollectAsStateWithLifecycle);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 6);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    SpaceBetweenOrStack.m18095SpaceBetweenOrStackDzVHIIc(ModifiersKt.performanceIndicator(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 10, null), BrokerageAccountHeader$lambda$10(snapshotState4CollectAsStateWithLifecycle).loadedState()), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), false, ComposableLambda3.rememberComposableLambda(238430863, true, new C137421(dashboardHeaderDuxo3, text, snapshotState2, snapshotState4CollectAsStateWithLifecycle, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 4);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            dashboardHeaderDuxo3 = dashboardHeaderDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dashboardHeaderDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            if (!BrokerageAccountHeader$lambda$10(snapshotState4CollectAsStateWithLifecycle).getAccountsLoading()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            dashboardHeaderDuxo3 = dashboardHeaderDuxo2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrokerageAccountHeader.BrokerageAccountHeader$lambda$19(modifier3, dashboardHeaderDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DashboardHeaderViewState BrokerageAccountHeader$lambda$10(SnapshotState4<DashboardHeaderViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BrokerageAccountHeader$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BrokerageAccountHeader$lambda$17(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean BrokerageAccountSwitcherHeader$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BrokerageAccountHeader$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState BrokerageAccountHeader$lambda$12$lambda$11(SnapshotState4 snapshotState4) {
        return SnapshotState3.mutableStateOf$default(Boolean.valueOf(BrokerageAccountHeader$lambda$10(snapshotState4).getTooltip() != null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BrokerageAccountHeader$lambda$18(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState BrokerageAccountHeader$lambda$16$lambda$15(SnapshotState4 snapshotState4) {
        return SnapshotState3.mutableStateOf$default(Boolean.valueOf(BrokerageAccountHeader$lambda$10(snapshotState4).getBadge() != null), null, 2, null);
    }

    /* compiled from: BrokerageAccountHeader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$BrokerageAccountHeader$1 */
    static final class C137421 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ DashboardHeaderDuxo $duxo;
        final /* synthetic */ SnapshotState<Boolean> $showAccountSwitcherTooltip$delegate;
        final /* synthetic */ SnapshotState<Boolean> $showBadge$delegate;
        final /* synthetic */ String $title;
        final /* synthetic */ SnapshotState4<DashboardHeaderViewState> $viewState$delegate;

        /* compiled from: BrokerageAccountHeader.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$BrokerageAccountHeader$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiHomeAccountSwitcher.AccountSwitcherTooltipInteractionType.values().length];
                try {
                    iArr[ApiHomeAccountSwitcher.AccountSwitcherTooltipInteractionType.DISMISSED_OR_OPENED_ACCOUNT_SWITCHER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiHomeAccountSwitcher.AccountSwitcherTooltipInteractionType.OPENED_ACCOUNT_SWITCHER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C137421(DashboardHeaderDuxo dashboardHeaderDuxo, String str, SnapshotState<Boolean> snapshotState, SnapshotState4<DashboardHeaderViewState> snapshotState4, SnapshotState<Boolean> snapshotState2) {
            this.$duxo = dashboardHeaderDuxo;
            this.$title = str;
            this.$showBadge$delegate = snapshotState;
            this.$viewState$delegate = snapshotState4;
            this.$showAccountSwitcherTooltip$delegate = snapshotState2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(SnapshotState snapshotState, SnapshotState4 snapshotState4, DashboardHeaderDuxo dashboardHeaderDuxo, SnapshotState snapshotState2) {
            BrokerageAccountHeader.BrokerageAccountHeader$lambda$18(snapshotState, false);
            HomeAccountSwitcher.AccountSwitcherBadgeInfo badge = BrokerageAccountHeader.BrokerageAccountHeader$lambda$10(snapshotState4).getBadge();
            if (badge != null) {
                dashboardHeaderDuxo.markBadgeInteraction(badge.getInteractionPrefId());
            }
            HomeAccountSwitcher.AccountSwitcherTooltipInfo tooltip = BrokerageAccountHeader.BrokerageAccountHeader$lambda$10(snapshotState4).getTooltip();
            if (tooltip != null) {
                BrokerageAccountHeader.BrokerageAccountHeader$lambda$14(snapshotState2, false);
                int i = WhenMappings.$EnumSwitchMapping$0[tooltip.getInteractionType().ordinal()];
                if (i != 1 && i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dashboardHeaderDuxo.markTooltipInteraction(tooltip.getInteractionPrefId());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$2$lambda$1(HomeAccountSwitcher.AccountSwitcherTooltipInfo accountSwitcherTooltipInfo, DashboardHeaderDuxo dashboardHeaderDuxo, SnapshotState snapshotState) {
            BrokerageAccountHeader.BrokerageAccountHeader$lambda$14(snapshotState, false);
            int i = WhenMappings.$EnumSwitchMapping$0[accountSwitcherTooltipInfo.getInteractionType().ordinal()];
            if (i == 1) {
                dashboardHeaderDuxo.markTooltipInteraction(accountSwitcherTooltipInfo.getInteractionPrefId());
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(DashboardHeaderDuxo dashboardHeaderDuxo, HomeAccountSwitcher.AccountSwitcherTooltipInfo accountSwitcherTooltipInfo, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            dashboardHeaderDuxo.markTooltipImpression(accountSwitcherTooltipInfo.getImpressionsPrefId());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.runtime.Composer] */
        /* JADX WARN: Type inference failed for: r3v14, types: [androidx.compose.ui.Modifier] */
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(238430863, i, -1, "com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeader.<anonymous> (BrokerageAccountHeader.kt:115)");
            }
            AccountSwitcherData accountSwitcherData = BrokerageAccountHeader.BrokerageAccountHeader$lambda$10(this.$viewState$delegate).getAccountSwitcherData();
            if (accountSwitcherData != null) {
                composer.startReplaceGroup(-781868123);
                DashboardHeaderDuxo dashboardHeaderDuxo = this.$duxo;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(dashboardHeaderDuxo);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new BrokerageAccountHeader2(dashboardHeaderDuxo);
                    composer.updateRememberedValue(objRememberedValue);
                }
                KFunction kFunction = (KFunction) objRememberedValue;
                composer.endReplaceGroup();
                boolean zBrokerageAccountHeader$lambda$17 = BrokerageAccountHeader.BrokerageAccountHeader$lambda$17(this.$showBadge$delegate);
                composer.startReplaceGroup(1498841662);
                Modifier.Companion companion = Modifier.INSTANCE;
                Intrinsics.checkNotNull(companion, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                final HomeAccountSwitcher.AccountSwitcherTooltipInfo tooltip = BrokerageAccountHeader.BrokerageAccountHeader$lambda$10(this.$viewState$delegate).getTooltip();
                final SnapshotState<Boolean> snapshotState = this.$showAccountSwitcherTooltip$delegate;
                final DashboardHeaderDuxo dashboardHeaderDuxo2 = this.$duxo;
                if (tooltip != null) {
                    String text = tooltip.getText();
                    boolean zBrokerageAccountHeader$lambda$13 = BrokerageAccountHeader.BrokerageAccountHeader$lambda$13(snapshotState);
                    composer.startReplaceGroup(-1746271574);
                    boolean zChanged = composer.changed(snapshotState) | composer.changedInstance(tooltip) | composer.changedInstance(dashboardHeaderDuxo2);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$BrokerageAccountHeader$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BrokerageAccountHeader.C137421.invoke$lambda$5$lambda$2$lambda$1(tooltip, dashboardHeaderDuxo2, snapshotState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composer.endReplaceGroup();
                    Boolean boolValueOf = Boolean.valueOf(zBrokerageAccountHeader$lambda$13);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composer.changedInstance(dashboardHeaderDuxo2) | composer.changedInstance(tooltip);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$BrokerageAccountHeader$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BrokerageAccountHeader.C137421.invoke$lambda$5$lambda$4$lambda$3(dashboardHeaderDuxo2, tooltip, (View) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    ?? r3 = com.robinhood.tooltips.ModifiersKt.tooltip$default(companion, text, null, new TooltipData.Behavior(1, function0, null, boolValueOf, (Function1) objRememberedValue3, null, null, 100, null), null, true, 10, null);
                    if (r3 != 0) {
                        companion = r3;
                    }
                }
                composer.endReplaceGroup();
                String str = this.$title;
                Function1 function1 = (Function1) kFunction;
                composer.startReplaceGroup(-1224400529);
                boolean zChanged2 = composer.changed(this.$showBadge$delegate) | composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo) | composer.changed(this.$showAccountSwitcherTooltip$delegate);
                final SnapshotState<Boolean> snapshotState2 = this.$showBadge$delegate;
                final SnapshotState4<DashboardHeaderViewState> snapshotState4 = this.$viewState$delegate;
                final DashboardHeaderDuxo dashboardHeaderDuxo3 = this.$duxo;
                final SnapshotState<Boolean> snapshotState3 = this.$showAccountSwitcherTooltip$delegate;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$BrokerageAccountHeader$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BrokerageAccountHeader.C137421.invoke$lambda$9$lambda$8(snapshotState2, snapshotState4, dashboardHeaderDuxo3, snapshotState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                BrokerageAccountHeader.BrokerageAccountSwitcherHeader(str, accountSwitcherData, function1, zBrokerageAccountHeader$lambda$17, companion, (Function0) objRememberedValue4, composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-779194900);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer, i2).getDisplayCapsuleLarge();
                BentoText2.m20747BentoText38GnDrw(this.$title, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 0, 0, 8188);
                composer.endReplaceGroup();
            }
            HomeDashboardType activeDashboardType = BrokerageAccountHeader.BrokerageAccountHeader$lambda$10(this.$viewState$delegate).getActiveDashboardType();
            if (activeDashboardType != null) {
                UpsellPillComponent.UpsellPillComponent(activeDashboardType, null, BrokerageAccountHeader.BrokerageAccountHeader$lambda$10(this.$viewState$delegate).getShowPillInNuxVariant(), null, composer, 0, 10);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final BaseActivity findBaseActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof BaseActivity) {
                return (BaseActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        return null;
    }
}
