package com.robinhood.android.lib.accountswitcher;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
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
import com.robinhood.android.lib.accountswitcher.AccountSelectionList;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorData;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorRowData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountSelectionList.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a-\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0001¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"AccountsColumnTestTag", "", "AccountSelectionList", "", "state", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;", "callbacks", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "AccountSelectionRow", "row", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorRowData;", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorRowData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-account-switcher_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountSelectionListKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AccountSelectionList {
    public static final String AccountsColumnTestTag = "account_selector_accounts_column";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectionList$lambda$3$lambda$2(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionList$lambda$4(AccountSelectorData accountSelectorData, AccountSelectorCallbacks accountSelectorCallbacks, Modifier modifier, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        AccountSelectionList(accountSelectorData, accountSelectorCallbacks, modifier, paddingValues, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionRow$lambda$7(AccountSelectorRowData accountSelectorRowData, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        AccountSelectionRow(accountSelectorRowData, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
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
    public static final void AccountSelectionList(final AccountSelectorData state, final AccountSelectorCallbacks callbacks, Modifier modifier, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
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
        Composer composerStartRestartGroup = composer.startRestartGroup(-2011302241);
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
                        ComposerKt.traceEventStart(-2011302241, i3, -1, "com.robinhood.android.lib.accountswitcher.AccountSelectionList (AccountSelectionList.kt:29)");
                    }
                    ImmutableList<AccountSelectorRowData> rows = state.getRows();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountSelectionListKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountSelectionList.AccountSelectionList$lambda$1$lambda$0((AccountSelectorRowData) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountSelectionListKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(AccountSelectionList.AccountSelectionList$lambda$3$lambda$2(((Integer) obj).intValue()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AccountList.AccountList(rows, function1, (Function1) objRememberedValue2, paddingValuesM5135PaddingValues0680j_4, modifierFillMaxSize$default, null, ComposableLambda3.rememberComposableLambda(-630801908, true, new C201863(callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 7168) | 1573296, 32);
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
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountSelectionListKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountSelectionList.AccountSelectionList$lambda$4(state, callbacks, modifier3, paddingValues3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                ImmutableList<AccountSelectorRowData> rows2 = state.getRows();
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
                AccountList.AccountList(rows2, function12, (Function1) objRememberedValue2, paddingValuesM5135PaddingValues0680j_4, modifierFillMaxSize$default2, null, ComposableLambda3.rememberComposableLambda(-630801908, true, new C201863(callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 7168) | 1573296, 32);
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
    public static final Object AccountSelectionList$lambda$1$lambda$0(AccountSelectorRowData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAccountId();
    }

    /* compiled from: AccountSelectionList.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSelectionListKt$AccountSelectionList$3 */
    static final class C201863 implements Function4<LazyItemScope, AccountSelectorRowData, Composer, Integer, Unit> {
        final /* synthetic */ AccountSelectorCallbacks $callbacks;

        C201863(AccountSelectorCallbacks accountSelectorCallbacks) {
            this.$callbacks = accountSelectorCallbacks;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, AccountSelectorRowData accountSelectorRowData, Composer composer, Integer num) {
            invoke(lazyItemScope, accountSelectorRowData, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope AccountList, final AccountSelectorRowData row, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AccountList, "$this$AccountList");
            Intrinsics.checkNotNullParameter(row, "row");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-630801908, i, -1, "com.robinhood.android.lib.accountswitcher.AccountSelectionList.<anonymous> (AccountSelectionList.kt:37)");
            }
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$callbacks) | composer.changedInstance(row);
            final AccountSelectorCallbacks accountSelectorCallbacks = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.lib.accountswitcher.AccountSelectionListKt$AccountSelectionList$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountSelectionList.C201863.invoke$lambda$1$lambda$0(accountSelectorCallbacks, row);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AccountSelectionList.AccountSelectionRow(row, null, (Function0) objRememberedValue, composer, (i >> 3) & 14, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AccountSelectorCallbacks accountSelectorCallbacks, AccountSelectorRowData accountSelectorRowData) {
            accountSelectorCallbacks.onAccountSelected(accountSelectorRowData.getAccountId());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectionRow(final AccountSelectorRowData row, Modifier modifier, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ServerToBentoAssetMapper2 endIcon24;
        BentoBaseRowState.Meta.Icon icon;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1650154842);
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
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1650154842, i3, -1, "com.robinhood.android.lib.accountswitcher.AccountSelectionRow (AccountSelectionList.kt:51)");
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), AccountSwitcherUtils2.toLoggingDescriptor(row)), true, false, false, true, false, null, 108, null);
                Modifier modifier5 = modifier4;
                StringResource primaryText = row.getPrimaryText();
                int i5 = StringResource.$stable;
                BentoBaseRowState.Text.Plain plain = new BentoBaseRowState.Text.Plain(StringResources6.getTextAsString(primaryText, composerStartRestartGroup, i5));
                StringResource secondaryText = row.getSecondaryText();
                composerStartRestartGroup.startReplaceGroup(-955852064);
                BentoBaseRowState.Text.Plain plain2 = secondaryText != null ? null : new BentoBaseRowState.Text.Plain(StringResources6.getTextAsString(secondaryText, composerStartRestartGroup, i5));
                composerStartRestartGroup.endReplaceGroup();
                BentoBaseRowState.Start.Icon icon2 = new BentoBaseRowState.Start.Icon(row.getAccountIcon24(), null, null, 6, null);
                endIcon24 = row.getEndIcon24();
                composerStartRestartGroup.startReplaceGroup(-955846681);
                if (endIcon24 != null) {
                    icon = null;
                } else {
                    StringResource endIconContentDescription = row.getEndIconContentDescription();
                    composerStartRestartGroup.startReplaceGroup(-955841481);
                    String textAsString = endIconContentDescription != null ? StringResources6.getTextAsString(endIconContentDescription, composerStartRestartGroup, i5) : null;
                    composerStartRestartGroup.endReplaceGroup();
                    if (textAsString == null) {
                        textAsString = "";
                    }
                    icon = new BentoBaseRowState.Meta.Icon(endIcon24, textAsString, (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierAutoLogEvents$default, new BentoBaseRowState(icon2, plain, plain2, icon, null, row.getEnabled(), false, 80, null), false, false, false, 0L, onClick, composerStartRestartGroup, (BentoBaseRowState.$stable << 3) | ((i3 << 12) & 3670016), 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountSelectionListKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSelectionList.AccountSelectionRow$lambda$7(row, modifier3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), AccountSwitcherUtils2.toLoggingDescriptor(row)), true, false, false, true, false, null, 108, null);
            Modifier modifier52 = modifier4;
            StringResource primaryText2 = row.getPrimaryText();
            int i52 = StringResource.$stable;
            BentoBaseRowState.Text.Plain plain3 = new BentoBaseRowState.Text.Plain(StringResources6.getTextAsString(primaryText2, composerStartRestartGroup, i52));
            StringResource secondaryText2 = row.getSecondaryText();
            composerStartRestartGroup.startReplaceGroup(-955852064);
            if (secondaryText2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowState.Start.Icon icon22 = new BentoBaseRowState.Start.Icon(row.getAccountIcon24(), null, null, 6, null);
            endIcon24 = row.getEndIcon24();
            composerStartRestartGroup.startReplaceGroup(-955846681);
            if (endIcon24 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierAutoLogEvents$default2, new BentoBaseRowState(icon22, plain3, plain2, icon, null, row.getEnabled(), false, 80, null), false, false, false, 0L, onClick, composerStartRestartGroup, (BentoBaseRowState.$stable << 3) | ((i3 << 12) & 3670016), 60);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
