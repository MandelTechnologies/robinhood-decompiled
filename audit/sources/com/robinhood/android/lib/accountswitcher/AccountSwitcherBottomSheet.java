package com.robinhood.android.lib.accountswitcher;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.converters.brokerage.ManagementTypes2;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherDeeplinkCta;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import rosetta.account.ManagementType;

/* compiled from: AccountSwitcherBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001aA\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a5\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u008e\u0002"}, m3636d2 = {"RefreshBannerTestTag", "", "AccountSwitcherModalBottomSheet", "", "state", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "onActionTaken", "Lkotlin/Function1;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction;", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "activeAccountContext", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "getActiveAccountContext", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;)Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "AccountSwitcherBottomSheetContent", "callbacks", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherCallbacks;", "onDismissClicked", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherCallbacks;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DeeplinkCtaButton", "deeplinkCta", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherDeeplinkCta;", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherDeeplinkCta;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-account-switcher_externalDebug", "loading", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AccountSwitcherBottomSheet {
    public static final String RefreshBannerTestTag = "account_switcher_refresh_banner";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcherBottomSheetContent$lambda$5(AccountSwitcherData accountSwitcherData, AccountSwitcherCallbacks accountSwitcherCallbacks, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        AccountSwitcherBottomSheetContent(accountSwitcherData, accountSwitcherCallbacks, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcherModalBottomSheet$lambda$3(AccountSwitcherData accountSwitcherData, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSwitcherModalBottomSheet(accountSwitcherData, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeeplinkCtaButton$lambda$11(AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DeeplinkCtaButton(accountSwitcherDeeplinkCta, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSwitcherModalBottomSheet(final AccountSwitcherData state, final Function1<? super AccountSwitcherBottomSheet5, Unit> onActionTaken, final Function0<Unit> onDismissRequest, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        final SheetState sheetStateRememberModalBottomSheetState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onActionTaken, "onActionTaken");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-522052332);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onActionTaken) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-522052332, i3, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherModalBottomSheet (AccountSwitcherBottomSheet.kt:82)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSwitcherBottomSheet.AccountSwitcherModalBottomSheet$lambda$2$lambda$1(coroutineScope, sheetStateRememberModalBottomSheetState, onDismissRequest);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                final Modifier modifier4 = modifier2;
                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-35023434, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt.AccountSwitcherModalBottomSheet.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-35023434, i5, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherModalBottomSheet.<anonymous> (AccountSwitcherBottomSheet.kt:96)");
                        }
                        Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(modifier4);
                        long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                        Shape rectangleShape = RectangleShape2.getRectangleShape();
                        Function0<Unit> function02 = onDismissRequest;
                        SheetState sheetState = sheetStateRememberModalBottomSheetState;
                        final AccountSwitcherData accountSwitcherData = state;
                        final Function0<Unit> function03 = function0;
                        final Function1<AccountSwitcherBottomSheet5, Unit> function1 = onActionTaken;
                        ModalBottomSheetKt.m5886ModalBottomSheetdYc4hso(function02, modifierStatusBarsPadding, sheetState, 0.0f, rectangleShape, jM21371getBg0d7_KjU, 0L, 0.0f, 0L, null, null, null, ComposableLambda3.rememberComposableLambda(-1075008839, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt.AccountSwitcherModalBottomSheet.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                invoke(column5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Column5 ModalBottomSheet, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                                if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1075008839, i6, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherModalBottomSheet.<anonymous>.<anonymous> (AccountSwitcherBottomSheet.kt:104)");
                                }
                                final Function1<AccountSwitcherBottomSheet5, Unit> function12 = function1;
                                final Function0<Unit> function04 = function03;
                                AccountSwitcherBottomSheet.AccountSwitcherBottomSheetContent(accountSwitcherData, new AccountSwitcherCallbacks() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt.AccountSwitcherModalBottomSheet.1.1.1
                                    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                                    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
                                        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                                        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                                        function12.invoke(new AccountSwitcherBottomSheet5.AccountSelected(accountNumber, brokerageAccountType));
                                        function04.invoke();
                                    }

                                    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                                    public void onAllAccountsSelected() {
                                        function12.invoke(AccountSwitcherBottomSheet5.AllAccountsSelected.INSTANCE);
                                        function04.invoke();
                                    }

                                    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                                    public void onRefreshAccountsClicked() {
                                        function12.invoke(AccountSwitcherBottomSheet5.Refresh.INSTANCE);
                                        function04.invoke();
                                    }

                                    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                                    public void onPendingApplicationClicked(String applicationId, BrokerageAccountType brokerageAccountType) {
                                        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                                        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                                        function12.invoke(new AccountSwitcherBottomSheet5.ApplicationSelected(applicationId, brokerageAccountType));
                                        function04.invoke();
                                    }
                                }, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), function03, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805330944, 384, 3528);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSwitcherBottomSheet.AccountSwitcherModalBottomSheet$lambda$3(state, onActionTaken, onDismissRequest, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountSwitcherBottomSheet.AccountSwitcherModalBottomSheet$lambda$2$lambda$1(coroutineScope, sheetStateRememberModalBottomSheetState, onDismissRequest);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                final Function0<Unit> function02 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                final Modifier modifier42 = modifier2;
                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-35023434, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt.AccountSwitcherModalBottomSheet.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-35023434, i5, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherModalBottomSheet.<anonymous> (AccountSwitcherBottomSheet.kt:96)");
                        }
                        Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(modifier42);
                        long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                        Shape rectangleShape = RectangleShape2.getRectangleShape();
                        Function0<Unit> function022 = onDismissRequest;
                        SheetState sheetState = sheetStateRememberModalBottomSheetState;
                        final AccountSwitcherData accountSwitcherData = state;
                        final Function0<Unit> function03 = function02;
                        final Function1<? super AccountSwitcherBottomSheet5, Unit> function1 = onActionTaken;
                        ModalBottomSheetKt.m5886ModalBottomSheetdYc4hso(function022, modifierStatusBarsPadding, sheetState, 0.0f, rectangleShape, jM21371getBg0d7_KjU, 0L, 0.0f, 0L, null, null, null, ComposableLambda3.rememberComposableLambda(-1075008839, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt.AccountSwitcherModalBottomSheet.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                invoke(column5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Column5 ModalBottomSheet, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                                if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1075008839, i6, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherModalBottomSheet.<anonymous>.<anonymous> (AccountSwitcherBottomSheet.kt:104)");
                                }
                                final Function1<? super AccountSwitcherBottomSheet5, Unit> function12 = function1;
                                final Function0<Unit> function04 = function03;
                                AccountSwitcherBottomSheet.AccountSwitcherBottomSheetContent(accountSwitcherData, new AccountSwitcherCallbacks() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt.AccountSwitcherModalBottomSheet.1.1.1
                                    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                                    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
                                        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                                        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                                        function12.invoke(new AccountSwitcherBottomSheet5.AccountSelected(accountNumber, brokerageAccountType));
                                        function04.invoke();
                                    }

                                    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                                    public void onAllAccountsSelected() {
                                        function12.invoke(AccountSwitcherBottomSheet5.AllAccountsSelected.INSTANCE);
                                        function04.invoke();
                                    }

                                    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                                    public void onRefreshAccountsClicked() {
                                        function12.invoke(AccountSwitcherBottomSheet5.Refresh.INSTANCE);
                                        function04.invoke();
                                    }

                                    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                                    public void onPendingApplicationClicked(String applicationId, BrokerageAccountType brokerageAccountType) {
                                        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                                        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                                        function12.invoke(new AccountSwitcherBottomSheet5.ApplicationSelected(applicationId, brokerageAccountType));
                                        function04.invoke();
                                    }
                                }, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), function03, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805330944, 384, 3528);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean DeeplinkCtaButton$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcherModalBottomSheet$lambda$2$lambda$1(CoroutineScope coroutineScope, SheetState sheetState, final Function0 function0) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AccountSwitcherBottomSheet3(sheetState, null), 3, null).invokeOnCompletion(new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSwitcherBottomSheet.AccountSwitcherModalBottomSheet$lambda$2$lambda$1$lambda$0(function0, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcherModalBottomSheet$lambda$2$lambda$1$lambda$0(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final BrokerageAccountContext getActiveAccountContext(AccountSwitcherData accountSwitcherData) {
        Object obj;
        rosetta.account.BrokerageAccountType protobuf;
        ManagementType protobuf2;
        com.robinhood.models.api.ManagementType managementType;
        BrokerageAccountType brokerageAccountType;
        Intrinsics.checkNotNullParameter(accountSwitcherData, "<this>");
        Iterator<T> it = accountSwitcherData.getRows().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String id = ((AccountSwitcherRowData) next).getId();
            AccountSwitcherData.ActiveSelection activeSelection = accountSwitcherData.getActiveSelection();
            AccountSwitcherData.ActiveSelection.AccountRow accountRow = activeSelection instanceof AccountSwitcherData.ActiveSelection.AccountRow ? (AccountSwitcherData.ActiveSelection.AccountRow) activeSelection : null;
            if (Intrinsics.areEqual(id, accountRow != null ? accountRow.getAccountNumber() : null)) {
                obj = next;
                break;
            }
        }
        AccountSwitcherRowData accountSwitcherRowData = (AccountSwitcherRowData) obj;
        if (accountSwitcherRowData == null || (brokerageAccountType = accountSwitcherRowData.getBrokerageAccountType()) == null || (protobuf = BrokerageAccountTypes3.toProtobuf(brokerageAccountType)) == null) {
            protobuf = rosetta.account.BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
        }
        rosetta.account.BrokerageAccountType brokerageAccountType2 = protobuf;
        if (accountSwitcherRowData == null || (managementType = accountSwitcherRowData.getManagementType()) == null || (protobuf2 = ManagementTypes2.toProtobuf(managementType)) == null) {
            protobuf2 = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
        }
        return new BrokerageAccountContext(brokerageAccountType2, null, protobuf2, null, false, false, null, null, null, null, 1018, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSwitcherBottomSheetContent(final AccountSwitcherData state, final AccountSwitcherCallbacks callbacks, Modifier modifier, final Function0<Unit> onDismissClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2096336903);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDismissClicked) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2096336903, i3, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetContent (AccountSwitcherBottomSheet.kt:171)");
                }
                Screen eventScreen = state.getEventScreen();
                Screen eventScreen2 = state.getEventScreen();
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(eventScreen2 == null ? eventScreen2.getIdentifier() : null, eventScreen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, getActiveAccountContext(state), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), new Component(Component.ComponentType.ACCOUNT_SWITCHER_BOTTOM_SHEET, null, null, 6, null), null, 36, null), ComposableLambda3.rememberComposableLambda(-1735803932, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt.AccountSwitcherBottomSheetContent.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1735803932, i5, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetContent.<anonymous> (AccountSwitcherBottomSheet.kt:184)");
                        }
                        final Modifier modifier4 = modifier3;
                        final AccountSwitcherData accountSwitcherData = state;
                        final AccountSwitcherCallbacks accountSwitcherCallbacks = callbacks;
                        final Function0<Unit> function0 = onDismissClicked;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1595983225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt.AccountSwitcherBottomSheetContent.1.1
                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1595983225, i6, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetContent.<anonymous>.<anonymous> (AccountSwitcherBottomSheet.kt:185)");
                                }
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, null, true, false, false, false, false, null, 125, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                AccountSwitcherData accountSwitcherData2 = accountSwitcherData;
                                AccountSwitcherCallbacks accountSwitcherCallbacks2 = accountSwitcherCallbacks;
                                Function0<Unit> function02 = function0;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAutoLogEvents$default);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer3.startReplaceGroup(1268281787);
                                if (accountSwitcherData2.getShowRefresh()) {
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i7 = BentoTheme.$stable;
                                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), AccountSwitcherBottomSheet.RefreshBannerTestTag);
                                    String strStringResource = StringResources_androidKt.stringResource(C20198R.string.account_switcher_bottom_sheet_info_banner_text, composer3, 0);
                                    String strStringResource2 = StringResources_androidKt.stringResource(C20198R.string.account_switcher_bottom_sheet_info_banner_cta_text, composer3, 0);
                                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer3.changedInstance(accountSwitcherCallbacks2);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new AccountSwitcherBottomSheet2(accountSwitcherCallbacks2);
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    composer3.endReplaceGroup();
                                    BentoInfoBanner2.BentoPinnedInfoBanner(modifierTestTag, strStringResource, size24, strStringResource2, (Function0) ((KFunction) objRememberedValue), composer3, BentoIcon4.Size24.$stable << 6, 0);
                                }
                                composer3.endReplaceGroup();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                AccountSwitcher5.AccountSwitcher(accountSwitcherData2, accountSwitcherCallbacks2, column6.weight(companion2, 1.0f, false), null, composer3, 0, 8);
                                AccountSwitcherDeeplinkCta deeplinkCta = accountSwitcherData2.getDeeplinkCta();
                                composer3.startReplaceGroup(1268318222);
                                if (deeplinkCta != null) {
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i8 = BentoTheme.$stable;
                                    AccountSwitcherBottomSheet.DeeplinkCtaButton(deeplinkCta, com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion2, bentoTheme2.getSpacing(composer3, i8).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM()), composer3, 0, 0);
                                }
                                composer3.endReplaceGroup();
                                String dismissButtonText = accountSwitcherData2.getDismissButtonText();
                                composer3.startReplaceGroup(1268330896);
                                if (dismissButtonText == null) {
                                    dismissButtonText = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer3, 0);
                                }
                                String str = dismissButtonText;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1268337463);
                                float fM7995constructorimpl = deeplinkCta != null ? C2002Dp.m7995constructorimpl(0) : BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                                composer3.endReplaceGroup();
                                BentoButtonKt.BentoButton(new BentoButtonState(str, (BentoButtons.Icon.Size16) null, deeplinkCta != null ? BentoButtons.Type.Secondary : BentoButtons.Type.Primary, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2042, (DefaultConstructorMarker) null), function02, com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion2, fM7995constructorimpl, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), (String) null, composer3, BentoButtonState.$stable, 8);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSwitcherBottomSheet.AccountSwitcherBottomSheetContent$lambda$5(state, callbacks, modifier4, onDismissClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Screen eventScreen3 = state.getEventScreen();
            Screen eventScreen22 = state.getEventScreen();
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(eventScreen22 == null ? eventScreen22.getIdentifier() : null, eventScreen3, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, getActiveAccountContext(state), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), new Component(Component.ComponentType.ACCOUNT_SWITCHER_BOTTOM_SHEET, null, null, 6, null), null, 36, null), ComposableLambda3.rememberComposableLambda(-1735803932, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt.AccountSwitcherBottomSheetContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1735803932, i5, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetContent.<anonymous> (AccountSwitcherBottomSheet.kt:184)");
                    }
                    final Modifier modifier42 = modifier3;
                    final AccountSwitcherData accountSwitcherData = state;
                    final AccountSwitcherCallbacks accountSwitcherCallbacks = callbacks;
                    final Function0<Unit> function0 = onDismissClicked;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1595983225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt.AccountSwitcherBottomSheetContent.1.1
                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1595983225, i6, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetContent.<anonymous>.<anonymous> (AccountSwitcherBottomSheet.kt:185)");
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier42, null, true, false, false, false, false, null, 125, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            AccountSwitcherData accountSwitcherData2 = accountSwitcherData;
                            AccountSwitcherCallbacks accountSwitcherCallbacks2 = accountSwitcherCallbacks;
                            Function0<Unit> function02 = function0;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAutoLogEvents$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer3.startReplaceGroup(1268281787);
                            if (accountSwitcherData2.getShowRefresh()) {
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), AccountSwitcherBottomSheet.RefreshBannerTestTag);
                                String strStringResource = StringResources_androidKt.stringResource(C20198R.string.account_switcher_bottom_sheet_info_banner_text, composer3, 0);
                                String strStringResource2 = StringResources_androidKt.stringResource(C20198R.string.account_switcher_bottom_sheet_info_banner_cta_text, composer3, 0);
                                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer3.changedInstance(accountSwitcherCallbacks2);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new AccountSwitcherBottomSheet2(accountSwitcherCallbacks2);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                BentoInfoBanner2.BentoPinnedInfoBanner(modifierTestTag, strStringResource, size24, strStringResource2, (Function0) ((KFunction) objRememberedValue), composer3, BentoIcon4.Size24.$stable << 6, 0);
                            }
                            composer3.endReplaceGroup();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            AccountSwitcher5.AccountSwitcher(accountSwitcherData2, accountSwitcherCallbacks2, column6.weight(companion2, 1.0f, false), null, composer3, 0, 8);
                            AccountSwitcherDeeplinkCta deeplinkCta = accountSwitcherData2.getDeeplinkCta();
                            composer3.startReplaceGroup(1268318222);
                            if (deeplinkCta != null) {
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                AccountSwitcherBottomSheet.DeeplinkCtaButton(deeplinkCta, com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion2, bentoTheme2.getSpacing(composer3, i8).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM()), composer3, 0, 0);
                            }
                            composer3.endReplaceGroup();
                            String dismissButtonText = accountSwitcherData2.getDismissButtonText();
                            composer3.startReplaceGroup(1268330896);
                            if (dismissButtonText == null) {
                                dismissButtonText = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer3, 0);
                            }
                            String str = dismissButtonText;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1268337463);
                            float fM7995constructorimpl = deeplinkCta != null ? C2002Dp.m7995constructorimpl(0) : BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                            composer3.endReplaceGroup();
                            BentoButtonKt.BentoButton(new BentoButtonState(str, (BentoButtons.Icon.Size16) null, deeplinkCta != null ? BentoButtons.Type.Secondary : BentoButtons.Type.Primary, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2042, (DefaultConstructorMarker) null), function02, com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion2, fM7995constructorimpl, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), (String) null, composer3, BentoButtonState.$stable, 8);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeeplinkCtaButton(final AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        final Navigator navigator;
        final android.content.Context context;
        boolean zChangedInstance;
        Object objRememberedValue3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2022854958);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(accountSwitcherDeeplinkCta) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2022854958, i3, -1, "com.robinhood.android.lib.accountswitcher.DeeplinkCtaButton (AccountSwitcherBottomSheet.kt:245)");
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier3, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, accountSwitcherDeeplinkCta.getLoggingIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                Modifier modifier4 = modifier3;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                String primaryText = accountSwitcherDeeplinkCta.getPrimaryText();
                boolean zDeeplinkCtaButton$lambda$7 = DeeplinkCtaButton$lambda$7(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(accountSwitcherDeeplinkCta);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSwitcherBottomSheet.DeeplinkCtaButton$lambda$10$lambda$9(coroutineScope, navigator, context, accountSwitcherDeeplinkCta, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function0);
                    objRememberedValue3 = function0;
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, primaryText, modifierAutoLogEvents$default, null, null, false, zDeeplinkCtaButton$lambda$7, null, null, null, null, false, null, composer2, 0, 0, 8120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSwitcherBottomSheet.DeeplinkCtaButton$lambda$11(accountSwitcherDeeplinkCta, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier3, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, accountSwitcherDeeplinkCta.getLoggingIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            Modifier modifier42 = modifier3;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String primaryText2 = accountSwitcherDeeplinkCta.getPrimaryText();
            boolean zDeeplinkCtaButton$lambda$72 = DeeplinkCtaButton$lambda$7(snapshotState);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(accountSwitcherDeeplinkCta);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                Function0 function02 = new Function0() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountSwitcherBottomSheet.DeeplinkCtaButton$lambda$10$lambda$9(coroutineScope, navigator, context, accountSwitcherDeeplinkCta, snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function02);
                objRememberedValue3 = function02;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, primaryText2, modifierAutoLogEvents$default2, null, null, false, zDeeplinkCtaButton$lambda$72, null, null, null, null, false, null, composer2, 0, 0, 8120);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DeeplinkCtaButton$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeeplinkCtaButton$lambda$10$lambda$9(CoroutineScope coroutineScope, Navigator navigator, android.content.Context context, AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta, SnapshotState snapshotState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AccountSwitcherBottomSheet4(navigator, context, accountSwitcherDeeplinkCta, snapshotState, null), 3, null);
        return Unit.INSTANCE;
    }
}
