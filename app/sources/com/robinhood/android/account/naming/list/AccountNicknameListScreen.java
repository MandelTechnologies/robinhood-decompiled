package com.robinhood.android.account.naming.list;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.lib.accountswitcher.AccountSelectionList;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNicknameListScreen.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0001¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"BackButtonTestTag", "", "AccountNicknameListScreen", "", "accountSelectorData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;", "callbacks", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "onBackClick", "Lkotlin/Function0;", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorCallbacks;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-account-naming_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.naming.list.AccountNicknameListScreenKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountNicknameListScreen {
    public static final String BackButtonTestTag = "AccountNicknameListScreenBackButton";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountNicknameListScreen$lambda$0(AccountSelectorData accountSelectorData, AccountSelectorCallbacks accountSelectorCallbacks, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        AccountNicknameListScreen(accountSelectorData, accountSelectorCallbacks, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountNicknameListScreen(final AccountSelectorData accountSelectorData, final AccountSelectorCallbacks callbacks, Modifier modifier, final Function0<Unit> onBackClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountSelectorData, "accountSelectorData");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1509502266);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(accountSelectorData) ? 4 : 2) | i;
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
                i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1509502266, i3, -1, "com.robinhood.android.account.naming.list.AccountNicknameListScreen (AccountNicknameListScreen.kt:27)");
                }
                int i5 = ((i3 >> 6) & 14) | 805306800;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(745834742, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.naming.list.AccountNicknameListScreenKt.AccountNicknameListScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(745834742, i6, -1, "com.robinhood.android.account.naming.list.AccountNicknameListScreen.<anonymous> (AccountNicknameListScreen.kt:31)");
                        }
                        Function2<Composer, Integer, Unit> function2M10792getLambda$1349461207$feature_account_naming_externalDebug = AccountNicknameListScreen2.INSTANCE.m10792getLambda$1349461207$feature_account_naming_externalDebug();
                        final Function0<Unit> function0 = onBackClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M10792getLambda$1349461207$feature_account_naming_externalDebug, null, ComposableLambda3.rememberComposableLambda(1092110421, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.naming.list.AccountNicknameListScreenKt.AccountNicknameListScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1092110421, i7, -1, "com.robinhood.android.account.naming.list.AccountNicknameListScreen.<anonymous>.<anonymous> (AccountNicknameListScreen.kt:39)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, AccountNicknameListScreen.BackButtonTestTag), false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), AccountNicknameListScreen2.INSTANCE.m10793getLambda$1438441195$feature_account_naming_externalDebug(), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-188734069, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.naming.list.AccountNicknameListScreenKt.AccountNicknameListScreen.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-188734069, i6, -1, "com.robinhood.android.account.naming.list.AccountNicknameListScreen.<anonymous> (AccountNicknameListScreen.kt:57)");
                        }
                        AccountSelectionList.AccountSelectionList(accountSelectorData, callbacks, PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, composer3, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i5, 504);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.naming.list.AccountNicknameListScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountNicknameListScreen.AccountNicknameListScreen$lambda$0(accountSelectorData, callbacks, modifier3, onBackClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            int i52 = ((i3 >> 6) & 14) | 805306800;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(745834742, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.naming.list.AccountNicknameListScreenKt.AccountNicknameListScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(745834742, i6, -1, "com.robinhood.android.account.naming.list.AccountNicknameListScreen.<anonymous> (AccountNicknameListScreen.kt:31)");
                    }
                    Function2<Composer, Integer, Unit> function2M10792getLambda$1349461207$feature_account_naming_externalDebug = AccountNicknameListScreen2.INSTANCE.m10792getLambda$1349461207$feature_account_naming_externalDebug();
                    final Function0<Unit> function0 = onBackClick;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M10792getLambda$1349461207$feature_account_naming_externalDebug, null, ComposableLambda3.rememberComposableLambda(1092110421, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.naming.list.AccountNicknameListScreenKt.AccountNicknameListScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1092110421, i7, -1, "com.robinhood.android.account.naming.list.AccountNicknameListScreen.<anonymous>.<anonymous> (AccountNicknameListScreen.kt:39)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, AccountNicknameListScreen.BackButtonTestTag), false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), AccountNicknameListScreen2.INSTANCE.m10793getLambda$1438441195$feature_account_naming_externalDebug(), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-188734069, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.naming.list.AccountNicknameListScreenKt.AccountNicknameListScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-188734069, i6, -1, "com.robinhood.android.account.naming.list.AccountNicknameListScreen.<anonymous> (AccountNicknameListScreen.kt:57)");
                    }
                    AccountSelectionList.AccountSelectionList(accountSelectorData, callbacks, PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, composer3, 0, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i52, 504);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
