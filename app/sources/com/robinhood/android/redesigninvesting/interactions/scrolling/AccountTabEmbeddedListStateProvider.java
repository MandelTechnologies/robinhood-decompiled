package com.robinhood.android.redesigninvesting.interactions.scrolling;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountTabEmbeddedListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u000428\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001ae\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u001028\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001ag\u0010\u0011\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u001028\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseFragment;", "fragment", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "accountTabArgs", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "listState", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scrollConnection", "", "content", "AccountTabEmbeddedLazyListStateProvider", "(Lcom/robinhood/android/common/ui/BaseFragment;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/ScrollState;", "AccountTabEmbeddedListStateProvider", "(Lcom/robinhood/android/common/ui/BaseFragment;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/redesigninvesting/interactions/scrolling/AccountTabScrollInteraction;", "scrollInteraction", "(Lcom/robinhood/android/redesigninvesting/interactions/scrolling/AccountTabScrollInteraction;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "lib-interactions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountTabEmbeddedListStateProvider {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTabEmbeddedLazyListStateProvider$lambda$0(BaseFragment baseFragment, AccountSelectorTabArgs accountSelectorTabArgs, LazyListState lazyListState, Function4 function4, int i, int i2, Composer composer, int i3) {
        AccountTabEmbeddedLazyListStateProvider(baseFragment, accountSelectorTabArgs, lazyListState, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTabEmbeddedLazyListStateProvider$lambda$1(BaseFragment baseFragment, AccountSelectorTabArgs accountSelectorTabArgs, LazyListState lazyListState, Function4 function4, int i, int i2, Composer composer, int i3) {
        AccountTabEmbeddedLazyListStateProvider(baseFragment, accountSelectorTabArgs, lazyListState, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTabEmbeddedLazyListStateProvider$lambda$5(BaseFragment baseFragment, AccountSelectorTabArgs accountSelectorTabArgs, LazyListState lazyListState, Function4 function4, int i, int i2, Composer composer, int i3) {
        AccountTabEmbeddedLazyListStateProvider(baseFragment, accountSelectorTabArgs, lazyListState, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTabEmbeddedListStateProvider$lambda$12(AccountTabScrollInteractions accountTabScrollInteractions, AccountSelectorTabArgs accountSelectorTabArgs, ScrollState scrollState, Function4 function4, int i, int i2, Composer composer, int i3) {
        AccountTabEmbeddedListStateProvider(accountTabScrollInteractions, accountSelectorTabArgs, scrollState, (Function4<? super ScrollState, ? super NestedScrollModifier, ? super Composer, ? super Integer, Unit>) function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTabEmbeddedListStateProvider$lambda$6(BaseFragment baseFragment, AccountSelectorTabArgs accountSelectorTabArgs, ScrollState scrollState, Function4 function4, int i, int i2, Composer composer, int i3) {
        AccountTabEmbeddedListStateProvider(baseFragment, accountSelectorTabArgs, scrollState, (Function4<? super ScrollState, ? super NestedScrollModifier, ? super Composer, ? super Integer, Unit>) function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTabEmbeddedListStateProvider$lambda$7(AccountTabScrollInteractions accountTabScrollInteractions, AccountSelectorTabArgs accountSelectorTabArgs, ScrollState scrollState, Function4 function4, int i, int i2, Composer composer, int i3) {
        AccountTabEmbeddedListStateProvider(accountTabScrollInteractions, accountSelectorTabArgs, scrollState, (Function4<? super ScrollState, ? super NestedScrollModifier, ? super Composer, ? super Integer, Unit>) function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTabEmbeddedListStateProvider$lambda$8(AccountTabScrollInteractions accountTabScrollInteractions, AccountSelectorTabArgs accountSelectorTabArgs, ScrollState scrollState, Function4 function4, int i, int i2, Composer composer, int i3) {
        AccountTabEmbeddedListStateProvider(accountTabScrollInteractions, accountSelectorTabArgs, scrollState, (Function4<? super ScrollState, ? super NestedScrollModifier, ? super Composer, ? super Integer, Unit>) function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountTabEmbeddedLazyListStateProvider(final BaseFragment fragment, final AccountSelectorTabArgs accountSelectorTabArgs, LazyListState lazyListState, final Function4<? super LazyListState, ? super NestedScrollModifier, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        final LazyListState lazyListState2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String id;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-713808763);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(fragment) : composerStartRestartGroup.changedInstance(fragment) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(accountSelectorTabArgs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i4 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 256 : 128;
                i3 |= i4;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i4;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            lazyListState2 = lazyListStateRememberLazyListState;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                }
                LazyListState lazyListState3 = lazyListStateRememberLazyListState;
                int i5 = i3;
                lazyListState2 = lazyListState3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-713808763, i5, -1, "com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedLazyListStateProvider (AccountTabEmbeddedListStateProvider.kt:19)");
                }
                final AccountTabScrollInteractions accountTabScrollInteractionsFindScrollInteraction = AccountTabScrollInteractions2.findScrollInteraction(fragment);
                final NestedScrollModifier nestedScrollModifier = (NestedScrollModifier) composerStartRestartGroup.consume(LocalAccountTabScrollConnection.getLocalAccountTabScrollConnection());
                boolean z = true;
                CompositionLocal3.CompositionLocalProvider(LocalAccountTabScrollInteraction.getLocalAccountTabScrollInteraction().provides(accountTabScrollInteractionsFindScrollInteraction), ComposableLambda3.rememberComposableLambda(-611124923, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt.AccountTabEmbeddedLazyListStateProvider.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-611124923, i6, -1, "com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedLazyListStateProvider.<anonymous> (AccountTabEmbeddedListStateProvider.kt:25)");
                        }
                        content.invoke(lazyListState2, nestedScrollModifier, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (accountSelectorTabArgs != null || (id = accountSelectorTabArgs.getId()) == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AccountTabEmbeddedListStateProvider.AccountTabEmbeddedLazyListStateProvider$lambda$0(fragment, accountSelectorTabArgs, lazyListState2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if (accountTabScrollInteractionsFindScrollInteraction == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AccountTabEmbeddedListStateProvider.AccountTabEmbeddedLazyListStateProvider$lambda$1(fragment, accountSelectorTabArgs, lazyListState2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(accountTabScrollInteractionsFindScrollInteraction);
                if ((((i5 & 896) ^ 384) <= 256 || !composerStartRestartGroup.changed(lazyListState2)) && (i5 & 384) != 256) {
                    z = false;
                }
                boolean zChanged = zChangedInstance | z | composerStartRestartGroup.changed(id);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountTabEmbeddedListStateProvider.AccountTabEmbeddedLazyListStateProvider$lambda$4$lambda$3(accountTabScrollInteractionsFindScrollInteraction, lazyListState2, id, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(id, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                LazyListState lazyListState32 = lazyListStateRememberLazyListState;
                int i52 = i3;
                lazyListState2 = lazyListState32;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final AccountTabScrollInteractions accountTabScrollInteractionsFindScrollInteraction2 = AccountTabScrollInteractions2.findScrollInteraction(fragment);
                final NestedScrollModifier nestedScrollModifier2 = (NestedScrollModifier) composerStartRestartGroup.consume(LocalAccountTabScrollConnection.getLocalAccountTabScrollConnection());
                boolean z2 = true;
                CompositionLocal3.CompositionLocalProvider(LocalAccountTabScrollInteraction.getLocalAccountTabScrollInteraction().provides(accountTabScrollInteractionsFindScrollInteraction2), ComposableLambda3.rememberComposableLambda(-611124923, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt.AccountTabEmbeddedLazyListStateProvider.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-611124923, i6, -1, "com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedLazyListStateProvider.<anonymous> (AccountTabEmbeddedListStateProvider.kt:25)");
                        }
                        content.invoke(lazyListState2, nestedScrollModifier2, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (accountSelectorTabArgs != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountTabEmbeddedListStateProvider.AccountTabEmbeddedLazyListStateProvider$lambda$5(fragment, accountSelectorTabArgs, lazyListState2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult AccountTabEmbeddedLazyListStateProvider$lambda$4$lambda$3(final AccountTabScrollInteractions accountTabScrollInteractions, LazyListState lazyListState, final String str, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        accountTabScrollInteractions.onLazyListStateCreated(lazyListState, str);
        return new DisposableEffectResult() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$AccountTabEmbeddedLazyListStateProvider$lambda$4$lambda$3$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                accountTabScrollInteractions.onLazyListStateDestroyed(str);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountTabEmbeddedListStateProvider(final BaseFragment fragment, AccountSelectorTabArgs accountSelectorTabArgs, ScrollState scrollState, Function4<? super ScrollState, ? super NestedScrollModifier, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final AccountSelectorTabArgs accountSelectorTabArgs2;
        final Function4<? super ScrollState, ? super NestedScrollModifier, ? super Composer, ? super Integer, Unit> function4;
        final ScrollState scrollState2;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(345903134);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(fragment) : composerStartRestartGroup.changedInstance(fragment) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(accountSelectorTabArgs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(scrollState)) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                ScrollState scrollState3 = scrollState;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                AccountTabEmbeddedListStateProvider(AccountTabScrollInteractions2.findScrollInteraction(fragment), accountSelectorTabArgs, scrollState3, content, composerStartRestartGroup, i3 & 8176, 0);
                accountSelectorTabArgs2 = accountSelectorTabArgs;
                function4 = content;
                if (ComposerKt.isTraceInProgress()) {
                }
                scrollState2 = scrollState3;
            } else {
                if ((i2 & 4) != 0) {
                    scrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i3 &= -897;
                }
                ScrollState scrollState32 = scrollState;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(345903134, i3, -1, "com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProvider (AccountTabEmbeddedListStateProvider.kt:46)");
                }
                AccountTabEmbeddedListStateProvider(AccountTabScrollInteractions2.findScrollInteraction(fragment), accountSelectorTabArgs, scrollState32, content, composerStartRestartGroup, i3 & 8176, 0);
                accountSelectorTabArgs2 = accountSelectorTabArgs;
                function4 = content;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scrollState2 = scrollState32;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function4 = content;
            scrollState2 = scrollState;
            accountSelectorTabArgs2 = accountSelectorTabArgs;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountTabEmbeddedListStateProvider.AccountTabEmbeddedListStateProvider$lambda$6(fragment, accountSelectorTabArgs2, scrollState2, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountTabEmbeddedListStateProvider(final AccountTabScrollInteractions accountTabScrollInteractions, final AccountSelectorTabArgs accountSelectorTabArgs, ScrollState scrollState, final Function4<? super ScrollState, ? super NestedScrollModifier, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        ScrollState scrollStateRememberScrollState;
        final ScrollState scrollState2;
        final NestedScrollModifier nestedScrollModifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String id;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(158019370);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(accountTabScrollInteractions) : composerStartRestartGroup.changedInstance(accountTabScrollInteractions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(accountSelectorTabArgs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                scrollStateRememberScrollState = scrollState;
                int i4 = composerStartRestartGroup.changed(scrollStateRememberScrollState) ? 256 : 128;
                i3 |= i4;
            } else {
                scrollStateRememberScrollState = scrollState;
            }
            i3 |= i4;
        } else {
            scrollStateRememberScrollState = scrollState;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            scrollState2 = scrollStateRememberScrollState;
        } else {
            composerStartRestartGroup.startDefaults();
            boolean z = true;
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i3 &= -897;
                }
                ScrollState scrollState3 = scrollStateRememberScrollState;
                int i5 = i3;
                scrollState2 = scrollState3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(158019370, i5, -1, "com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProvider (AccountTabEmbeddedListStateProvider.kt:63)");
                }
                nestedScrollModifier = (NestedScrollModifier) composerStartRestartGroup.consume(LocalAccountTabScrollConnection.getLocalAccountTabScrollConnection());
                if (nestedScrollModifier == null) {
                    nestedScrollModifier = new NestedScrollModifier() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$AccountTabEmbeddedListStateProvider$tabScrollConnection$1
                        @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                        /* renamed from: onPostFling-RZ2iAVY */
                        public /* bridge */ /* synthetic */ Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
                            return super.mo5023onPostFlingRZ2iAVY(j, j2, continuation);
                        }

                        @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                        /* renamed from: onPostScroll-DzOQY0M */
                        public /* bridge */ /* synthetic */ long mo5024onPostScrollDzOQY0M(long j, long j2, int i6) {
                            return super.mo5024onPostScrollDzOQY0M(j, j2, i6);
                        }

                        @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                        /* renamed from: onPreFling-QWom1Mo */
                        public /* bridge */ /* synthetic */ Object mo5609onPreFlingQWom1Mo(long j, Continuation continuation) {
                            return super.mo5609onPreFlingQWom1Mo(j, continuation);
                        }

                        @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                        /* renamed from: onPreScroll-OzD1aCk */
                        public /* bridge */ /* synthetic */ long mo5298onPreScrollOzD1aCk(long j, int i6) {
                            return super.mo5298onPreScrollOzD1aCk(j, i6);
                        }
                    };
                }
                CompositionLocal3.CompositionLocalProvider(LocalAccountTabScrollInteraction.getLocalAccountTabScrollInteraction().provides(accountTabScrollInteractions), ComposableLambda3.rememberComposableLambda(231715434, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt.AccountTabEmbeddedListStateProvider.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(231715434, i6, -1, "com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProvider.<anonymous> (AccountTabEmbeddedListStateProvider.kt:68)");
                        }
                        content.invoke(scrollState2, nestedScrollModifier, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (accountSelectorTabArgs != null || (id = accountSelectorTabArgs.getId()) == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AccountTabEmbeddedListStateProvider.AccountTabEmbeddedListStateProvider$lambda$7(accountTabScrollInteractions, accountSelectorTabArgs, scrollState2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if (accountTabScrollInteractions == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AccountTabEmbeddedListStateProvider.AccountTabEmbeddedListStateProvider$lambda$8(accountTabScrollInteractions, accountSelectorTabArgs, scrollState2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean z2 = (i5 & 14) == 4 || ((i5 & 8) != 0 && composerStartRestartGroup.changedInstance(accountTabScrollInteractions));
                if ((((i5 & 896) ^ 384) <= 256 || !composerStartRestartGroup.changed(scrollState2)) && (i5 & 384) != 256) {
                    z = false;
                }
                boolean zChanged = z2 | z | composerStartRestartGroup.changed(id);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountTabEmbeddedListStateProvider.AccountTabEmbeddedListStateProvider$lambda$11$lambda$10(accountTabScrollInteractions, scrollState2, id, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(id, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                ScrollState scrollState32 = scrollStateRememberScrollState;
                int i52 = i3;
                scrollState2 = scrollState32;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                nestedScrollModifier = (NestedScrollModifier) composerStartRestartGroup.consume(LocalAccountTabScrollConnection.getLocalAccountTabScrollConnection());
                if (nestedScrollModifier == null) {
                }
                CompositionLocal3.CompositionLocalProvider(LocalAccountTabScrollInteraction.getLocalAccountTabScrollInteraction().provides(accountTabScrollInteractions), ComposableLambda3.rememberComposableLambda(231715434, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt.AccountTabEmbeddedListStateProvider.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(231715434, i6, -1, "com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProvider.<anonymous> (AccountTabEmbeddedListStateProvider.kt:68)");
                        }
                        content.invoke(scrollState2, nestedScrollModifier, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (accountSelectorTabArgs != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountTabEmbeddedListStateProvider.AccountTabEmbeddedListStateProvider$lambda$12(accountTabScrollInteractions, accountSelectorTabArgs, scrollState2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult AccountTabEmbeddedListStateProvider$lambda$11$lambda$10(final AccountTabScrollInteractions accountTabScrollInteractions, ScrollState scrollState, final String str, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        accountTabScrollInteractions.onVerticalListStateCreated(scrollState, str);
        return new DisposableEffectResult() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProviderKt$AccountTabEmbeddedListStateProvider$lambda$11$lambda$10$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                accountTabScrollInteractions.onVerticalListStateDestroyed(str);
            }
        };
    }
}
