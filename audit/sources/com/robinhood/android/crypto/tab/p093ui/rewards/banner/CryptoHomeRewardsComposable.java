package com.robinhood.android.crypto.tab.p093ui.rewards.banner;

import android.content.Context;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Size;
import com.robinhood.android.crypto.tab.p093ui.rewards.banner.CryptoHomeRewardsViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rhc.referral.p367ui.RewardCardComposable;
import com.robinhood.rhc.referral.p367ui.RewardCardComposableState;
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

/* compiled from: CryptoHomeRewardsComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\b\u001a\u00020\fX\u008a\u0084\u0002"}, m3636d2 = {"CryptoHomeRewardsComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsDuxo;Landroidx/compose/runtime/Composer;II)V", "Loaded", "viewState", "Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsViewState$Loaded;", "(Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsViewState$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-tab_externalDebug", "Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeRewardsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeRewardsComposable$lambda$1(Modifier modifier, CryptoHomeRewardsDuxo cryptoHomeRewardsDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeRewardsComposable(modifier, cryptoHomeRewardsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeRewardsComposable$lambda$2(Modifier modifier, CryptoHomeRewardsDuxo cryptoHomeRewardsDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeRewardsComposable(modifier, cryptoHomeRewardsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$5(CryptoHomeRewardsViewState.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHomeRewardsComposable(final Modifier modifier, final CryptoHomeRewardsDuxo cryptoHomeRewardsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        CryptoHomeRewardsViewState cryptoHomeRewardsViewStateCryptoHomeRewardsComposable$lambda$0;
        Composer composerStartRestartGroup = composer.startRestartGroup(1419337381);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(cryptoHomeRewardsDuxo)) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeRewardsDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsComposableKt$CryptoHomeRewardsComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsComposableKt$CryptoHomeRewardsComposable$$inlined$duxo$1.1
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
                    cryptoHomeRewardsDuxo = (CryptoHomeRewardsDuxo) baseDuxo;
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1419337381, i5, -1, "com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsComposable (CryptoHomeRewardsComposable.kt:24)");
                }
                cryptoHomeRewardsViewStateCryptoHomeRewardsComposable$lambda$0 = CryptoHomeRewardsComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoHomeRewardsDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (cryptoHomeRewardsViewStateCryptoHomeRewardsComposable$lambda$0 instanceof CryptoHomeRewardsViewState.Loaded) {
                    if (!Intrinsics.areEqual(cryptoHomeRewardsViewStateCryptoHomeRewardsComposable$lambda$0, CryptoHomeRewardsViewState.Loading.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoHomeRewardsComposable.CryptoHomeRewardsComposable$lambda$1(modifier, cryptoHomeRewardsDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Loaded((CryptoHomeRewardsViewState.Loaded) cryptoHomeRewardsViewStateCryptoHomeRewardsComposable$lambda$0, modifier, composerStartRestartGroup, (i5 << 3) & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoHomeRewardsViewStateCryptoHomeRewardsComposable$lambda$0 = CryptoHomeRewardsComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoHomeRewardsDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (cryptoHomeRewardsViewStateCryptoHomeRewardsComposable$lambda$0 instanceof CryptoHomeRewardsViewState.Loaded) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeRewardsComposable.CryptoHomeRewardsComposable$lambda$2(modifier, cryptoHomeRewardsDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Loaded(final CryptoHomeRewardsViewState.Loaded loaded, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Context context;
        final Navigator navigator;
        boolean zChangedInstance;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-129385742);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(-129385742, i3, -1, "com.robinhood.android.crypto.tab.ui.rewards.banner.Loaded (CryptoHomeRewardsComposable.kt:41)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                int i6 = (i3 >> 3) & 14;
                Modifier modifier4 = modifier3;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, composerStartRestartGroup, i6, 2);
                String title = loaded.getTitle();
                String body = loaded.getBody();
                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(loaded.getHeaderImageUrl()).size(Size.ORIGINAL).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                long exos = bentoTheme.getColors(composerStartRestartGroup, i5).getExos();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(loaded);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeRewardsComposable.Loaded$lambda$4$lambda$3(navigator, context, loaded);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                RewardCardComposable.RewardCardComposable(new RewardCardComposableState(title, body, asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, exos, (Function0) objRememberedValue, false, 32, null), new RewardCardComposableState.Action.Icon(new BentoIcon4.Size24(ServerToBentoAssetMapper2.ARROW_RIGHT_24)), modifierM21622defaultHorizontalPaddingWMci_g0, null, Alignment.INSTANCE.getBottomCenter(), composerStartRestartGroup, RewardCardComposableState.$stable | 24576 | (RewardCardComposableState.Action.Icon.$stable << 3), 8);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoHomeRewardsComposable.Loaded$lambda$5(loaded, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            int i62 = (i3 >> 3) & 14;
            Modifier modifier42 = modifier3;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifier42, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, composerStartRestartGroup, i62, 2);
            String title2 = loaded.getTitle();
            String body2 = loaded.getBody();
            AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg2 = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(loaded.getHeaderImageUrl()).size(Size.ORIGINAL).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
            long exos2 = bentoTheme2.getColors(composerStartRestartGroup, i52).getExos();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(loaded);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoHomeRewardsComposable.Loaded$lambda$4$lambda$3(navigator, context, loaded);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                RewardCardComposable.RewardCardComposable(new RewardCardComposableState(title2, body2, asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg2, exos2, (Function0) objRememberedValue, false, 32, null), new RewardCardComposableState.Action.Icon(new BentoIcon4.Size24(ServerToBentoAssetMapper2.ARROW_RIGHT_24)), modifierM21622defaultHorizontalPaddingWMci_g02, null, Alignment.INSTANCE.getBottomCenter(), composerStartRestartGroup, RewardCardComposableState.$stable | 24576 | (RewardCardComposableState.Action.Icon.$stable << 3), 8);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$4$lambda$3(Navigator navigator, Context context, CryptoHomeRewardsViewState.Loaded loaded) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, loaded.getDeepLinkUri(), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    private static final CryptoHomeRewardsViewState CryptoHomeRewardsComposable$lambda$0(SnapshotState4<? extends CryptoHomeRewardsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
