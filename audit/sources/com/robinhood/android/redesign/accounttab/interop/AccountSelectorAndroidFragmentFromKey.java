package com.robinhood.android.redesign.accounttab.interop;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSelectorAndroidFragmentFromKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ah\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"AccountSelectorAndroidFragmentFromKey", "", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "fragmentId", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "modifier", "Landroidx/compose/ui/Modifier;", "arguments", "Landroid/os/Bundle;", "maxLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "onUpdate", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "Lkotlin/ParameterName;", "name", "fragment", "(Lcom/robinhood/android/navigation/keys/FragmentKey;Ljava/lang/String;Landroidx/fragment/app/FragmentManager;Landroidx/compose/ui/Modifier;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lib-account-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSelectorAndroidFragmentFromKey {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorAndroidFragmentFromKey$lambda$15(FragmentKey fragmentKey, String str, FragmentManager fragmentManager, Modifier modifier, Bundle bundle, Lifecycle.State state, Function1 function1, int i, int i2, Composer composer, int i3) {
        AccountSelectorAndroidFragmentFromKey(fragmentKey, str, fragmentManager, modifier, bundle, state, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorAndroidFragmentFromKey$lambda$1$lambda$0(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectorAndroidFragmentFromKey(final FragmentKey fragmentKey, String str, FragmentManager fragmentManager, Modifier modifier, Bundle bundle, Lifecycle.State state, Function1<? super Fragment, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Bundle bundle2;
        int i5;
        int i6;
        Function1<? super Fragment, Unit> function12;
        Navigator navigator;
        boolean zChanged;
        Object objRememberedValue;
        final Lifecycle.State state2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final Lifecycle.State state3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String fragmentId = str;
        final FragmentManager fragmentManager2 = fragmentManager;
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        Intrinsics.checkNotNullParameter(fragmentId, "fragmentId");
        Intrinsics.checkNotNullParameter(fragmentManager2, "fragmentManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1763512284);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(fragmentKey) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(fragmentId) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(fragmentManager2) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    bundle2 = bundle;
                    i3 |= composerStartRestartGroup.changedInstance(bundle2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changed(state == null ? -1 : state.ordinal()) ? 131072 : 65536;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    function12 = function1;
                } else {
                    function12 = function1;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                    }
                }
                if ((i3 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    state3 = state;
                } else {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        bundle2 = Bundle.EMPTY;
                    }
                    Lifecycle.State state4 = i5 == 0 ? Lifecycle.State.RESUMED : state;
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AccountSelectorAndroidFragmentFromKey.AccountSelectorAndroidFragmentFromKey$lambda$1$lambda$0((Fragment) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function12 = (Function1) objRememberedValue3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1763512284, i3, -1, "com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKey (AccountSelectorAndroidFragmentFromKey.kt:69)");
                    }
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(fragmentKey);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = Navigator.DefaultImpls.createFragment$default(navigator, fragmentKey, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final Fragment fragment = (Fragment) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    final Bundle bundle3 = new Bundle(bundle2);
                    bundle3.putParcelable("rh_navigation_args", fragmentKey);
                    bundle3.putBoolean("rh_fragment_is_hosted_in_compose", true);
                    final SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function12, composerStartRestartGroup, (i3 >> 18) & 14);
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    state2 = state4;
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    int i8 = i3;
                    Modifier modifier3 = modifier2;
                    AndroidView_androidKt.AndroidView(new Function1() { // from class: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountSelectorAndroidFragmentFromKey.AccountSelectorAndroidFragmentFromKey$lambda$5(objectRef, context, fragmentId, (Context) obj);
                        }
                    }, modifier3, null, composerStartRestartGroup, (i8 >> 6) & 112, 4);
                    fragmentManager2 = fragmentManager;
                    fragmentId = str;
                    EffectsKt.DisposableEffect(fragmentId, fragment, fragmentManager2, new Function1() { // from class: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountSelectorAndroidFragmentFromKey.AccountSelectorAndroidFragmentFromKey$lambda$11(objectRef, fragmentManager2, fragmentId, state2, fragment, snapshotState4RememberUpdatedState, bundle3, (DisposableEffectScope) obj);
                        }
                    }, composerStartRestartGroup, ((i8 >> 3) & 14) | (i8 & 896));
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(fragmentManager2) | ((i8 & 112) != 32) | ((458752 & i8) == 131072);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountSelectorAndroidFragmentFromKey.AccountSelectorAndroidFragmentFromKey$lambda$14$lambda$13(fragmentManager2, fragmentId, state2, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(state2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, (i8 >> 15) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = composerStartRestartGroup;
                    state3 = state2;
                    modifier2 = modifier3;
                }
                final Function1<? super Fragment, Unit> function13 = function12;
                final Bundle bundle4 = bundle2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final FragmentManager fragmentManager3 = fragmentManager2;
                    final Modifier modifier4 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountSelectorAndroidFragmentFromKey.AccountSelectorAndroidFragmentFromKey$lambda$15(fragmentKey, fragmentId, fragmentManager3, modifier4, bundle4, state3, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            bundle2 = bundle;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if ((i3 & 599187) == 599186) {
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(fragmentKey);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = Navigator.DefaultImpls.createFragment$default(navigator, fragmentKey, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    final Fragment fragment2 = (Fragment) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    final Bundle bundle32 = new Bundle(bundle2);
                    bundle32.putParcelable("rh_navigation_args", fragmentKey);
                    bundle32.putBoolean("rh_fragment_is_hosted_in_compose", true);
                    final SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function12, composerStartRestartGroup, (i3 >> 18) & 14);
                    final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    state2 = state4;
                    final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    int i82 = i3;
                    Modifier modifier32 = modifier2;
                    AndroidView_androidKt.AndroidView(new Function1() { // from class: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountSelectorAndroidFragmentFromKey.AccountSelectorAndroidFragmentFromKey$lambda$5(objectRef2, context2, fragmentId, (Context) obj);
                        }
                    }, modifier32, null, composerStartRestartGroup, (i82 >> 6) & 112, 4);
                    fragmentManager2 = fragmentManager;
                    fragmentId = str;
                    EffectsKt.DisposableEffect(fragmentId, fragment2, fragmentManager2, new Function1() { // from class: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountSelectorAndroidFragmentFromKey.AccountSelectorAndroidFragmentFromKey$lambda$11(objectRef2, fragmentManager2, fragmentId, state2, fragment2, snapshotState4RememberUpdatedState2, bundle32, (DisposableEffectScope) obj);
                        }
                    }, composerStartRestartGroup, ((i82 >> 3) & 14) | (i82 & 896));
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(fragmentManager2) | ((i82 & 112) != 32) | ((458752 & i82) == 131072);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountSelectorAndroidFragmentFromKey.AccountSelectorAndroidFragmentFromKey$lambda$14$lambda$13(fragmentManager2, fragmentId, state2, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(state2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, (i82 >> 15) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        state3 = state2;
                        modifier2 = modifier32;
                    }
                }
            }
            final Function1 function132 = function12;
            final Bundle bundle42 = bundle2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        bundle2 = bundle;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        final Function1 function1322 = function12;
        final Bundle bundle422 = bundle2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, android.view.View, androidx.fragment.app.FragmentContainerView] */
    public static final FragmentContainerView AccountSelectorAndroidFragmentFromKey$lambda$5(Ref.ObjectRef objectRef, Context context, String str, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ?? fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(str.hashCode());
        objectRef.element = fragmentContainerView;
        return fragmentContainerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.fragment.app.Fragment] */
    public static final DisposableEffectResult AccountSelectorAndroidFragmentFromKey$lambda$11(Ref.ObjectRef objectRef, final FragmentManager fragmentManager, final String str, Lifecycle.State state, Fragment fragment, SnapshotState4 snapshotState4, Bundle bundle, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        FragmentContainerView fragmentContainerView = (FragmentContainerView) objectRef.element;
        if (fragmentContainerView == null) {
            return new DisposableEffectResult() { // from class: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt$AccountSelectorAndroidFragmentFromKey$lambda$11$$inlined$onDispose$2
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ?? FindFragmentByTag = fragmentManager.findFragmentByTag(str);
        objectRef2.element = FindFragmentByTag;
        if (FindFragmentByTag != 0) {
            fragmentManager.beginTransaction().setReorderingAllowed(true).show((Fragment) objectRef2.element).setMaxLifecycle((Fragment) objectRef2.element, state).commitNowAllowingStateLoss();
        } else {
            fragment.setArguments(bundle);
            fragmentManager.beginTransaction().setReorderingAllowed(true).add(fragmentContainerView, fragment, str).setMaxLifecycle(fragment, Lifecycle.State.CREATED).commitNowAllowingStateLoss();
            objectRef2.element = fragment;
        }
        ((Function1) snapshotState4.getValue()).invoke(objectRef2.element);
        fragmentManager.onContainerAvailable(fragmentContainerView);
        return new DisposableEffectResult() { // from class: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt$AccountSelectorAndroidFragmentFromKey$lambda$11$$inlined$onDispose$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                if (!AccountSelectorAndroidFragmentFromKey2.INSTANCE.contains(str)) {
                    FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                    fragmentTransactionBeginTransaction.remove((Fragment) objectRef2.element);
                    fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                }
                if (fragmentManager.isStateSaved()) {
                    return;
                }
                FragmentTransaction fragmentTransactionBeginTransaction2 = fragmentManager.beginTransaction();
                fragmentTransactionBeginTransaction2.remove((Fragment) objectRef2.element);
                fragmentTransactionBeginTransaction2.commitNowAllowingStateLoss();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult AccountSelectorAndroidFragmentFromKey$lambda$14$lambda$13(FragmentManager fragmentManager, String str, Lifecycle.State state, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag != null) {
            if (state.isAtLeast(Lifecycle.State.RESUMED)) {
                AccountSelectorAndroidFragmentFromKey2.INSTANCE.add(str);
            }
            fragmentManager.beginTransaction().setMaxLifecycle(fragmentFindFragmentByTag, state).commitNowAllowingStateLoss();
        }
        return new DisposableEffectResult() { // from class: com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKeyKt$AccountSelectorAndroidFragmentFromKey$lambda$14$lambda$13$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }
}
