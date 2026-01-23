package com.robinhood.android.lib.accountswitcher;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.lib.accountswitcher.AccountToggleList;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks2;
import com.robinhood.shared.account.contracts.switcher.AccountToggleData;
import com.robinhood.shared.account.contracts.switcher.AccountToggleRowData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountToggleList.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"AccountToggleList", "", "state", "Lcom/robinhood/shared/account/contracts/switcher/AccountToggleData;", "callbacks", "Lcom/robinhood/shared/account/contracts/switcher/AccountToggleCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lcom/robinhood/shared/account/contracts/switcher/AccountToggleData;Lcom/robinhood/shared/account/contracts/switcher/AccountToggleCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "ToggleAccountRow", "row", "Lcom/robinhood/shared/account/contracts/switcher/AccountToggleRowData;", "onClick", "Lkotlin/Function1;", "", "(Lcom/robinhood/shared/account/contracts/switcher/AccountToggleRowData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lib-account-switcher_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountToggleListKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AccountToggleList {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountToggleList$lambda$3$lambda$2(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountToggleList$lambda$4(AccountToggleData accountToggleData, AccountSelectorCallbacks2 accountSelectorCallbacks2, Modifier modifier, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        AccountToggleList(accountToggleData, accountSelectorCallbacks2, modifier, paddingValues, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleAccountRow$lambda$6(AccountToggleRowData accountToggleRowData, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        ToggleAccountRow(accountToggleRowData, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountToggleList(final AccountToggleData state, final AccountSelectorCallbacks2 callbacks, Modifier modifier, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        PaddingValues paddingValues2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final Modifier modifier3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1662928483);
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
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    PaddingValues paddingValuesM5135PaddingValues0680j_4 = i4 == 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1662928483, i3, -1, "com.robinhood.android.lib.accountswitcher.AccountToggleList (AccountToggleList.kt:27)");
                    }
                    ImmutableList<AccountToggleRowData> rows = state.getRows();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountToggleListKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountToggleList.AccountToggleList$lambda$1$lambda$0((AccountToggleRowData) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountToggleListKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(AccountToggleList.AccountToggleList$lambda$3$lambda$2(((Integer) obj).intValue()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AccountList.AccountList(rows, function1, (Function1) objRememberedValue2, paddingValuesM5135PaddingValues0680j_4, modifierFillMaxSize$default, null, ComposableLambda3.rememberComposableLambda(-858815995, true, new C201973(callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 7168) | 1573296, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    paddingValues3 = paddingValues2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountToggleListKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountToggleList.AccountToggleList$lambda$4(state, callbacks, modifier3, paddingValues3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            paddingValues2 = paddingValues;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ImmutableList<AccountToggleRowData> rows2 = state.getRows();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                Function1 function12 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                AccountList.AccountList(rows2, function12, (Function1) objRememberedValue2, paddingValuesM5135PaddingValues0680j_4, modifierFillMaxSize$default2, null, ComposableLambda3.rememberComposableLambda(-858815995, true, new C201973(callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 7168) | 1573296, 32);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AccountToggleList$lambda$1$lambda$0(AccountToggleRowData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAccountId();
    }

    /* compiled from: AccountToggleList.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountToggleListKt$AccountToggleList$3 */
    static final class C201973 implements Function4<LazyItemScope, AccountToggleRowData, Composer, Integer, Unit> {
        final /* synthetic */ AccountSelectorCallbacks2 $callbacks;

        C201973(AccountSelectorCallbacks2 accountSelectorCallbacks2) {
            this.$callbacks = accountSelectorCallbacks2;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, AccountToggleRowData accountToggleRowData, Composer composer, Integer num) {
            invoke(lazyItemScope, accountToggleRowData, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope AccountList, final AccountToggleRowData row, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AccountList, "$this$AccountList");
            Intrinsics.checkNotNullParameter(row, "row");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-858815995, i, -1, "com.robinhood.android.lib.accountswitcher.AccountToggleList.<anonymous> (AccountToggleList.kt:35)");
            }
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$callbacks) | composer.changedInstance(row);
            final AccountSelectorCallbacks2 accountSelectorCallbacks2 = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountToggleListKt$AccountToggleList$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountToggleList.C201973.invoke$lambda$1$lambda$0(accountSelectorCallbacks2, row, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AccountToggleList.ToggleAccountRow(row, null, (Function1) objRememberedValue, composer, (i >> 3) & 14, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AccountSelectorCallbacks2 accountSelectorCallbacks2, AccountToggleRowData accountToggleRowData, boolean z) {
            accountSelectorCallbacks2.onAccountToggled(accountToggleRowData.getAccountId(), z);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ToggleAccountRow(final AccountToggleRowData row, Modifier modifier, final Function1<? super Boolean, Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-268401132);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(row) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-268401132, i3, -1, "com.robinhood.android.lib.accountswitcher.ToggleAccountRow (AccountToggleList.kt:52)");
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), AccountSwitcherUtils2.toLoggingDescriptor(row)), true, false, false, true, false, null, 108, null);
                StringResource primaryText = row.getPrimaryText();
                int i5 = StringResource.$stable;
                String textAsString = StringResources6.getTextAsString(primaryText, composerStartRestartGroup, i5);
                StringResource secondaryText = row.getSecondaryText();
                composerStartRestartGroup.startReplaceGroup(-235431984);
                BentoToggleRowState.Text.Plain plain = secondaryText != null ? null : new BentoToggleRowState.Text.Plain(StringResources6.getTextAsString(secondaryText, composerStartRestartGroup, i5));
                composerStartRestartGroup.endReplaceGroup();
                BentoToggleRow3.BentoToggleRow(new BentoToggleRowState(new BentoToggleRowState.Start.Icon(row.getAccountIcon24(), null, 2, null), textAsString, plain, false, row.getChecked(), null, null, row.getLoading(), false, false, 872, null), onClick, modifierAutoLogEvents$default, composerStartRestartGroup, BentoToggleRowState.$stable | ((i3 >> 3) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountToggleListKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountToggleList.ToggleAccountRow$lambda$6(row, modifier3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) != 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), AccountSwitcherUtils2.toLoggingDescriptor(row)), true, false, false, true, false, null, 108, null);
            StringResource primaryText2 = row.getPrimaryText();
            int i52 = StringResource.$stable;
            String textAsString2 = StringResources6.getTextAsString(primaryText2, composerStartRestartGroup, i52);
            StringResource secondaryText2 = row.getSecondaryText();
            composerStartRestartGroup.startReplaceGroup(-235431984);
            if (secondaryText2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoToggleRow3.BentoToggleRow(new BentoToggleRowState(new BentoToggleRowState.Start.Icon(row.getAccountIcon24(), null, 2, null), textAsString2, plain, false, row.getChecked(), null, null, row.getLoading(), false, false, 872, null), onClick, modifierAutoLogEvents$default2, composerStartRestartGroup, BentoToggleRowState.$stable | ((i3 >> 3) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
