package com.robinhood.android.internalassettransfers.accountselection.accountlist;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.futures.contracts.FuturesAssetHomeFragmentKey;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.accountselection.UiEligibleAccounts2;
import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreen;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheet;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import internal_asset_transfers.proto.p475v1.IATIneligibilityReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: AccountSelectionListScreen.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a[\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u00020\u0001*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002"}, m3636d2 = {"AccountSelectionListScreen", "", "Landroidx/compose/foundation/layout/ColumnScope;", "selectionType", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "accountSelectionOptions", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$Args$AccountSelectionOption;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "onAccountSelected", "Lkotlin/Function1;", "", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OpenFuturesPositionsIneligibilityModal", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "onCtaCloseFuturePositions", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-internal-asset-transfers_externalDebug", "accountIneligibilityReason", "Linternal_asset_transfers/proto/v1/IATIneligibilityReason;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AccountSelectionListScreen {

    /* compiled from: AccountSelectionListScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountSelectionListFragment.AccountSelectionType.values().length];
            try {
                iArr[AccountSelectionListFragment.AccountSelectionType.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountSelectionListFragment.AccountSelectionType.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionListScreen$lambda$9(Column5 column5, AccountSelectionListFragment.AccountSelectionType accountSelectionType, ImmutableList3 immutableList3, Screen screen, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSelectionListScreen(column5, accountSelectionType, immutableList3, screen, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpenFuturesPositionsIneligibilityModal$lambda$12(RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0, int i, Composer composer, int i2) {
        OpenFuturesPositionsIneligibilityModal(rhModalBottomSheet5, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectionListScreen(final Column5 column5, final AccountSelectionListFragment.AccountSelectionType selectionType, final ImmutableList3<AccountSelectionListFragment.Args.AccountSelectionOption> accountSelectionOptions, final Screen screen, final Function1<? super String, Unit> onAccountSelected, final Function0<Unit> onDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        String strStringResource;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(column5, "<this>");
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(accountSelectionOptions, "accountSelectionOptions");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(onAccountSelected, "onAccountSelected");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1566683303);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(column5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(selectionType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(accountSelectionOptions) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 2048 : 1024;
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAccountSelected) ? 16384 : 8192;
        }
        if ((i2 & 16) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 131072 : 65536;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1566683303, i3, -1, "com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreen (AccountSelectionListScreen.kt:49)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(accountSelectionOptions);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Object obj = objRememberedValue2;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accountSelectionOptions, 10));
                        for (AccountSelectionListFragment.Args.AccountSelectionOption accountSelectionOption : accountSelectionOptions) {
                            arrayList.add(UiEligibleAccounts2.toAccountSwitcherRowData(accountSelectionOption.getAccount(), accountSelectionOption.isEligible(), accountSelectionOption.getIneligibilityReason()));
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    }
                    List list = (List) obj;
                    composerStartRestartGroup.endReplaceGroup();
                    int i5 = WhenMappings.$EnumSwitchMapping$0[selectionType.ordinal()];
                    if (i5 == 1) {
                        composerStartRestartGroup.startReplaceGroup(-1950834061);
                        strStringResource = StringResources_androidKt.stringResource(C18977R.string.select_from_account, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i5 != 2) {
                            composerStartRestartGroup.startReplaceGroup(-1950836129);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1950831183);
                        strStringResource = StringResources_androidKt.stringResource(C18977R.string.select_to_account, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    int i6 = i3;
                    Modifier modifier5 = modifier4;
                    AccountSwitcherBottomSheet.AccountSwitcherBottomSheetContent(new AccountSwitcherData(list, "", false, null, null, null, strStringResource, 60, null), new AccountSwitcherCallbacks() { // from class: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreenKt.AccountSelectionListScreen.1
                        @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                        public void onRefreshAccountsClicked() {
                        }

                        @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                        public void onAllAccountsSelected() {
                            AccountSwitcherCallbacks.DefaultImpls.onAllAccountsSelected(this);
                        }

                        @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                        public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
                            AccountSwitcherCallbacks.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
                        }

                        @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
                        public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
                            AccountSelectionListFragment.Args.AccountSelectionOption next;
                            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                            Iterator<AccountSelectionListFragment.Args.AccountSelectionOption> it = accountSelectionOptions.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                } else {
                                    next = it.next();
                                    if (Intrinsics.areEqual(next.getAccount().getRhsAccountNumber(), accountNumber)) {
                                        break;
                                    }
                                }
                            }
                            AccountSelectionListFragment.Args.AccountSelectionOption accountSelectionOption2 = next;
                            if (accountSelectionOption2 == null) {
                                return;
                            }
                            if (!accountSelectionOption2.isEligible() && accountSelectionOption2.getIneligibilityReason() == IATIneligibilityReason.REASON_OPEN_FUTURES_POSITION) {
                                AccountSelectionListScreen.AccountSelectionListScreen$lambda$2(snapshotState, accountSelectionOption2.getIneligibilityReason());
                            } else {
                                onAccountSelected.invoke(accountNumber);
                            }
                        }
                    }, modifier5, onDismiss, composerStartRestartGroup, ((i6 >> 12) & 896) | ((i6 >> 6) & 7168), 0);
                    composerStartRestartGroup.startReplaceGroup(-1950796819);
                    if (AccountSelectionListScreen$lambda$1(snapshotState) == IATIneligibilityReason.REASON_OPEN_FUTURES_POSITION) {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountSelectionListScreen.AccountSelectionListScreen$lambda$6$lambda$5(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue3, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1826138381, true, new C190273(navigator, context, screen), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierAlign = column5.align(PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getCenterHorizontally());
                    String strStringResource2 = StringResources_androidKt.stringResource(C18977R.string.learn_more_about_transferring_assets, composerStartRestartGroup, 0);
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountSelectionListScreen.AccountSelectionListScreen$lambda$8$lambda$7(context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue4, strStringResource2, modifierAlign, null, null, false, Color.m6701boximpl(jM21426getFg20d7_KjU), composerStartRestartGroup, 0, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return AccountSelectionListScreen.AccountSelectionListScreen$lambda$9(column5, selectionType, accountSelectionOptions, screen, onAccountSelected, onDismiss, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(accountSelectionOptions);
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final IATIneligibilityReason AccountSelectionListScreen$lambda$1(SnapshotState<IATIneligibilityReason> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: AccountSelectionListScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreenKt$AccountSelectionListScreen$3 */
    static final class C190273 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Screen $screen;

        C190273(Navigator navigator, Context context, Screen screen) {
            this.$navigator = navigator;
            this.$context = context;
            this.$screen = screen;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1826138381, i, -1, "com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreen.<anonymous> (AccountSelectionListScreen.kt:100)");
            }
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$screen);
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final Screen screen = this.$screen;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreenKt$AccountSelectionListScreen$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountSelectionListScreen.C190273.invoke$lambda$1$lambda$0(navigator, context, screen);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AccountSelectionListScreen.OpenFuturesPositionsIneligibilityModal(RhModalBottomSheet, (Function0) objRememberedValue, composer, (i & 14) | RhModalBottomSheet5.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, Screen screen) {
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new FuturesAssetHomeFragmentKey(null, screen, 1, null), false, false, false, false, null, false, null, null, 1020, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionListScreen$lambda$6$lambda$5(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectionListScreen$lambda$2(SnapshotState<IATIneligibilityReason> snapshotState, IATIneligibilityReason iATIneligibilityReason) {
        snapshotState.setValue(iATIneligibilityReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionListScreen$lambda$8$lambda$7(Context context) {
        WebUtils.viewUrl$default(context, C18977R.string.internal_asset_transfer_help_center_url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OpenFuturesPositionsIneligibilityModal(final RhModalBottomSheet5 rhModalBottomSheet5, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(921747564);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(921747564, i2, -1, "com.robinhood.android.internalassettransfers.accountselection.accountlist.OpenFuturesPositionsIneligibilityModal (AccountSelectionListScreen.kt:135)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C18977R.string.f4216x54ebb2e2, composerStartRestartGroup, 0);
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8126);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C18977R.string.f4215x452c774e, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 0, 0, 8124);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 1, null), 0.0f, 1, null);
            BentoButtonState bentoButtonState = new BentoButtonState(StringResources_androidKt.stringResource(C18977R.string.f4214x4337ad1a, composerStartRestartGroup, 0), (BentoButtons.Icon.Size16) null, BentoButtons.Type.Primary, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2042, (DefaultConstructorMarker) null);
            int i4 = BentoButtonState.$stable;
            boolean z = false;
            int i5 = i2;
            BentoButtonKt.BentoButton(bentoButtonState, function0, modifierFillMaxWidth$default, (String) null, composerStartRestartGroup, (i2 & 112) | i4, 8);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoButtonState bentoButtonState2 = new BentoButtonState(StringResources_androidKt.stringResource(C18977R.string.f4213x3e6d15ee, composerStartRestartGroup, 0), (BentoButtons.Icon.Size16) null, BentoButtons.Type.Secondary, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2042, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i5 & 14) == 4 || ((i5 & 8) != 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5))) {
                z = true;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AccountSelectionListScreen2(rhModalBottomSheet5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.BentoButton(bentoButtonState2, (Function0<Unit>) objRememberedValue, modifierFillMaxWidth$default2, (String) null, composerStartRestartGroup, i4 | 384, 8);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectionListScreen.OpenFuturesPositionsIneligibilityModal$lambda$12(rhModalBottomSheet5, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
