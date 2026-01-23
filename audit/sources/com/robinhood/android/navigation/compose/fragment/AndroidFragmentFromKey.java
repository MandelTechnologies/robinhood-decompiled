package com.robinhood.android.navigation.compose.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
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
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidFragmentFromKey.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"AndroidFragmentFromKey", "", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "modifier", "Landroidx/compose/ui/Modifier;", "arguments", "Landroid/os/Bundle;", "onUpdate", "Lkotlin/Function0;", "(Lcom/robinhood/android/navigation/keys/FragmentKey;Landroidx/fragment/app/FragmentManager;Landroidx/compose/ui/Modifier;Landroid/os/Bundle;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-navigation-compose-fragment_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.navigation.compose.fragment.AndroidFragmentFromKeyKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AndroidFragmentFromKey {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AndroidFragmentFromKey$lambda$9(FragmentKey fragmentKey, FragmentManager fragmentManager, Modifier modifier, Bundle bundle, Function0 function0, int i, int i2, Composer composer, int i3) {
        AndroidFragmentFromKey(fragmentKey, fragmentManager, modifier, bundle, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AndroidFragmentFromKey(final FragmentKey fragmentKey, final FragmentManager fragmentManager, Modifier modifier, Bundle bundle, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Bundle bundle2;
        int i5;
        Function0<Unit> function02;
        int i6;
        Navigator navigator;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final FragmentManager fragmentManager2 = fragmentManager;
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        Intrinsics.checkNotNullParameter(fragmentManager2, "fragmentManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1443575581);
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
            i3 |= composerStartRestartGroup.changedInstance(fragmentManager2) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    bundle2 = bundle;
                    i3 |= composerStartRestartGroup.changedInstance(bundle2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    i6 = i3;
                    if ((i6 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            bundle2 = Bundle.EMPTY;
                        }
                        if (i5 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.navigation.compose.fragment.AndroidFragmentFromKeyKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function02 = (Function0) objRememberedValue2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1443575581, i6, -1, "com.robinhood.android.navigation.compose.fragment.AndroidFragmentFromKey (AndroidFragmentFromKey.kt:46)");
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
                        final SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function02, composerStartRestartGroup, (i6 >> 12) & 14);
                        final int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        Modifier modifier4 = modifier2;
                        AndroidView_androidKt.AndroidView(new Function1() { // from class: com.robinhood.android.navigation.compose.fragment.AndroidFragmentFromKeyKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidFragmentFromKey.AndroidFragmentFromKey$lambda$4(objectRef, context, currentCompositeKeyHash, (Context) obj);
                            }
                        }, modifier4, null, composerStartRestartGroup, (i6 >> 3) & 112, 4);
                        composer2 = composerStartRestartGroup;
                        fragmentManager2 = fragmentManager;
                        EffectsKt.DisposableEffect(fragment, fragmentManager2, new Function1() { // from class: com.robinhood.android.navigation.compose.fragment.AndroidFragmentFromKeyKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidFragmentFromKey.AndroidFragmentFromKey$lambda$8(fragment, fragmentManager, objectRef, snapshotState4RememberUpdatedState, bundle3, currentCompositeKeyHash, (DisposableEffectScope) obj);
                            }
                        }, composer2, i6 & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    }
                    final Bundle bundle4 = bundle2;
                    final Function0<Unit> function03 = function02;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.navigation.compose.fragment.AndroidFragmentFromKeyKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AndroidFragmentFromKey.AndroidFragmentFromKey$lambda$9(fragmentKey, fragmentManager2, modifier3, bundle4, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                i6 = i3;
                if ((i6 & 9363) == 9362) {
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
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
                        final SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function02, composerStartRestartGroup, (i6 >> 12) & 14);
                        final int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        Modifier modifier42 = modifier2;
                        AndroidView_androidKt.AndroidView(new Function1() { // from class: com.robinhood.android.navigation.compose.fragment.AndroidFragmentFromKeyKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidFragmentFromKey.AndroidFragmentFromKey$lambda$4(objectRef2, context2, currentCompositeKeyHash2, (Context) obj);
                            }
                        }, modifier42, null, composerStartRestartGroup, (i6 >> 3) & 112, 4);
                        composer2 = composerStartRestartGroup;
                        fragmentManager2 = fragmentManager;
                        EffectsKt.DisposableEffect(fragment2, fragmentManager2, new Function1() { // from class: com.robinhood.android.navigation.compose.fragment.AndroidFragmentFromKeyKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AndroidFragmentFromKey.AndroidFragmentFromKey$lambda$8(fragment2, fragmentManager, objectRef2, snapshotState4RememberUpdatedState2, bundle32, currentCompositeKeyHash2, (DisposableEffectScope) obj);
                            }
                        }, composer2, i6 & 112);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                    }
                }
                final Bundle bundle42 = bundle2;
                final Function0 function032 = function02;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            bundle2 = bundle;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function02 = function0;
            i6 = i3;
            if ((i6 & 9363) == 9362) {
            }
            final Bundle bundle422 = bundle2;
            final Function0 function0322 = function02;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        bundle2 = bundle;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function02 = function0;
        i6 = i3;
        if ((i6 & 9363) == 9362) {
        }
        final Bundle bundle4222 = bundle2;
        final Function0 function03222 = function02;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, android.view.View, androidx.fragment.app.FragmentContainerView] */
    public static final FragmentContainerView AndroidFragmentFromKey$lambda$4(Ref.ObjectRef objectRef, Context context, int i, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ?? fragmentContainerView = new FragmentContainerView(context);
        objectRef.element = fragmentContainerView;
        fragmentContainerView.setId(i);
        T t = objectRef.element;
        if (t != 0) {
            return (FragmentContainerView) t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("container");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DisposableEffectResult AndroidFragmentFromKey$lambda$8(final Fragment fragment, final FragmentManager fragmentManager, Ref.ObjectRef objectRef, SnapshotState4 snapshotState4, Bundle bundle, int i, DisposableEffectScope DisposableEffect) {
        FragmentContainerView fragmentContainerView;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        fragment.setArguments(bundle);
        FragmentTransaction reorderingAllowed = fragmentManager.beginTransaction().setReorderingAllowed(true);
        T t = objectRef.element;
        FragmentContainerView fragmentContainerView2 = null;
        if (t == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
            fragmentContainerView = null;
        } else {
            fragmentContainerView = (FragmentContainerView) t;
        }
        reorderingAllowed.add(fragmentContainerView, fragment, String.valueOf(i)).commitNow();
        T t2 = objectRef.element;
        if (t2 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
        } else {
            fragmentContainerView2 = (FragmentContainerView) t2;
        }
        fragmentManager.onContainerAvailable(fragmentContainerView2);
        ((Function0) snapshotState4.getValue()).invoke();
        return new DisposableEffectResult() { // from class: com.robinhood.android.navigation.compose.fragment.AndroidFragmentFromKeyKt$AndroidFragmentFromKey$lambda$8$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                if (fragmentManager.isStateSaved()) {
                    return;
                }
                FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                fragmentTransactionBeginTransaction.remove(fragment);
                fragmentTransactionBeginTransaction.commitNow();
            }
        };
    }
}
