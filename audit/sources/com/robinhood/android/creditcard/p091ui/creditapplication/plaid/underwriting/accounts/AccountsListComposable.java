package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts.AccountsListComposable;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.Account;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountsListComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"AccountsList", "", "accounts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/creditcard/api/plaid/underwriting/Account;", "showAddAccount", "", "onAccountSelected", "Lkotlin/Function1;", "onAddAccountClicked", "Lkotlin/Function0;", "onBackPress", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AccountsListComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountsList$lambda$1(ImmutableList immutableList, boolean z, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountsList(immutableList, z, function1, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountsList(final ImmutableList<Account> accounts2, final boolean z, final Function1<? super Account, Unit> onAccountSelected, final Function0<Unit> onAddAccountClicked, final Function0<Unit> onBackPress, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        int i5;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(onAccountSelected, "onAccountSelected");
        Intrinsics.checkNotNullParameter(onAddAccountClicked, "onAddAccountClicked");
        Intrinsics.checkNotNullParameter(onBackPress, "onBackPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(888698365);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(accounts2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onAccountSelected) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onAddAccountClicked) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onBackPress) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                i5 = i3;
                if ((74899 & i5) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(888698365, i5, -1, "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsList (AccountsListComposable.kt:29)");
                    }
                    EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new AccountsListComposable2(null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                    Modifier modifier4 = modifier2;
                    CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_ADDITIONAL_INFORMATION, null, null, null, 14, null), modifier4, null, null, onBackPress, null, null, null, null, null, true, false, ComposableLambda3.rememberComposableLambda(66759881, true, new C125042(accounts2, current, onAccountSelected, z2, onAddAccountClicked), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 12) & 112) | (57344 & i5), 390, 3052);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountsListComposable.AccountsList$lambda$1(accounts2, z, onAccountSelected, onAddAccountClicked, onBackPress, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            i5 = i3;
            if ((74899 & i5) != 74898) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                Modifier modifier42 = modifier2;
                CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_ADDITIONAL_INFORMATION, null, null, null, 14, null), modifier42, null, null, onBackPress, null, null, null, null, null, true, false, ComposableLambda3.rememberComposableLambda(66759881, true, new C125042(accounts2, current2, onAccountSelected, z2, onAddAccountClicked), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 12) & 112) | (57344 & i5), 390, 3052);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((74899 & i5) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: AccountsListComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt$AccountsList$2 */
    static final class C125042 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<Account> $accounts;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Function1<Account, Unit> $onAccountSelected;
        final /* synthetic */ Function0<Unit> $onAddAccountClicked;
        final /* synthetic */ boolean $showAddAccount;

        /* JADX WARN: Multi-variable type inference failed */
        C125042(ImmutableList<Account> immutableList, EventLogger eventLogger, Function1<? super Account, Unit> function1, boolean z, Function0<Unit> function0) {
            this.$accounts = immutableList;
            this.$eventLogger = eventLogger;
            this.$onAccountSelected = function1;
            this.$showAddAccount = z;
            this.$onAddAccountClicked = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(66759881, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsList.<anonymous> (AccountsListComposable.kt:40)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$accounts) | composer.changedInstance(this.$eventLogger) | composer.changed(this.$onAccountSelected) | composer.changed(this.$showAddAccount) | composer.changed(this.$onAddAccountClicked);
            final ImmutableList<Account> immutableList = this.$accounts;
            final boolean z = this.$showAddAccount;
            final EventLogger eventLogger = this.$eventLogger;
            final Function1<Account, Unit> function1 = this.$onAccountSelected;
            final Function0<Unit> function0 = this.$onAddAccountClicked;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt$AccountsList$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountsListComposable.C125042.invoke$lambda$3$lambda$2(immutableList, z, eventLogger, function1, function0, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierPadding, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(final ImmutableList immutableList, boolean z, final EventLogger eventLogger, final Function1 function1, Function0 function0, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, "AccountsListComposable-header", null, AccountsListComposable6.INSTANCE.getLambda$1447768532$feature_credit_card_externalDebug(), 2, null);
            final AccountsListComposable3 accountsListComposable3 = new PropertyReference1Impl() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt$AccountsList$2$1$1$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                public Object get(Object obj) {
                    return ((Account) obj).getId();
                }
            };
            final C12500x4279e9f2 c12500x4279e9f2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt$AccountsList$2$invoke$lambda$3$lambda$2$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Account account) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((Account) obj);
                }
            };
            LazyColumn.items(immutableList.size(), accountsListComposable3 != null ? new Function1<Integer, Object>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt$AccountsList$2$invoke$lambda$3$lambda$2$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return accountsListComposable3.invoke(immutableList.get(i));
                }
            } : null, new Function1<Integer, Object>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt$AccountsList$2$invoke$lambda$3$lambda$2$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c12500x4279e9f2.invoke(immutableList.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt$AccountsList$2$invoke$lambda$3$lambda$2$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    Account account = (Account) immutableList.get(i);
                    composer.startReplaceGroup(1011560774);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer.changedInstance(eventLogger) | composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final EventLogger eventLogger2 = eventLogger;
                        final Function1 function12 = function1;
                        objRememberedValue = new Function1<Account, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt$AccountsList$2$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Account account2) {
                                invoke2(account2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Account it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Screen ccScreen = loggingUtils.getCcScreen();
                                Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                                EventLogger.DefaultImpls.logTap$default(eventLogger2, UserInteractionEventData.Action.SELECT_ACCOUNT, ccScreen, component, null, null, false, 56, null);
                                function12.invoke(it);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    AccountListItemComposable.Account(account, (Function1) objRememberedValue, null, composer, 0, 4);
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            if (z) {
                LazyListScope.item$default(LazyColumn, "AccountsListComposable-add-account", null, ComposableLambda3.composableLambdaInstance(1349963161, true, new AccountsListComposable5(eventLogger, function0)), 2, null);
            }
            return Unit.INSTANCE;
        }
    }
}
