package com.robinhood.shared.crypto.staking.staking.stakinghub;

import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable3;
import com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubViewState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoStakingHubComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a!\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\f\u001a\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0011\u001a\u00020\u0015X\u008a\u0084\u0002"}, m3636d2 = {CryptoStakingHistoryDetailComposable3.TestTagHistoryDetailLoadingTag, "", "TestTagErrorContentTag", CryptoStakingHubComposable4.TestTagContentTag, "CryptoStakingHubComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadingReviewContent", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewLoadingReviewContent", "(Landroidx/compose/runtime/Composer;I)V", "ErrorContent", "MainContent", "viewState", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState$Content;", "(Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState$Content;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-staking_externalDebug", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingHubComposable4 {
    public static final String TestTagContentTag = "TestTagContentTag";
    public static final String TestTagErrorContentTag = "TestTagErrorContentTag";
    public static final String TestTagLoadingContentTag = "TestTagLoadingReviewContentTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoStakingHubComposable$lambda$1(Modifier modifier, CryptoStakingHubDuxo cryptoStakingHubDuxo, int i, int i2, Composer composer, int i3) {
        CryptoStakingHubComposable(modifier, cryptoStakingHubDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorContent$lambda$4(Modifier modifier, int i, int i2, Composer composer, int i3) {
        ErrorContent(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingReviewContent$lambda$2(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingReviewContent(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$10(CryptoStakingHubViewState.Content content, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(content, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingReviewContent$lambda$3(int i, Composer composer, int i2) {
        PreviewLoadingReviewContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoStakingHubComposable(final Modifier modifier, final CryptoStakingHubDuxo cryptoStakingHubDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1093197715);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(cryptoStakingHubDuxo)) ? 32 : 16;
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoStakingHubDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposableKt$CryptoStakingHubComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposableKt$CryptoStakingHubComposable$$inlined$duxo$1.1
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
                    cryptoStakingHubDuxo = (CryptoStakingHubDuxo) baseDuxo;
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1093197715, i5, -1, "com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposable (CryptoStakingHubComposable.kt:34)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingHubDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier2 = modifier;
                Crossfade.Crossfade(CryptoStakingHubComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle), modifier2, (FiniteAnimationSpec<Float>) null, "CryptoStakingHubComposable", CryptoStakingHubComposable.INSTANCE.getLambda$1757818423$feature_crypto_staking_externalDebug(), composerStartRestartGroup, ((i5 << 3) & 112) | 27648, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier = modifier2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingHubDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier22 = modifier;
                Crossfade.Crossfade(CryptoStakingHubComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2), modifier22, (FiniteAnimationSpec<Float>) null, "CryptoStakingHubComposable", CryptoStakingHubComposable.INSTANCE.getLambda$1757818423$feature_crypto_staking_externalDebug(), composerStartRestartGroup, ((i5 << 3) & 112) | 27648, 4);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier = modifier22;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingHubComposable4.CryptoStakingHubComposable$lambda$1(modifier, cryptoStakingHubDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingReviewContent(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1554248331);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1554248331, i3, -1, "com.robinhood.shared.crypto.staking.staking.stakinghub.LoadingReviewContent (CryptoStakingHubComposable.kt:56)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(modifier, "TestTagLoadingReviewContentTag"), true, false, 1, composerStartRestartGroup, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingHubComposable4.LoadingReviewContent$lambda$2(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLoadingReviewContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1692768664);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1692768664, i, -1, "com.robinhood.shared.crypto.staking.staking.stakinghub.PreviewLoadingReviewContent (CryptoStakingHubComposable.kt:66)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoStakingHubComposable.INSTANCE.getLambda$681451344$feature_crypto_staking_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingHubComposable4.PreviewLoadingReviewContent$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ErrorContent(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-681264991);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-681264991, i3, -1, "com.robinhood.shared.crypto.staking.staking.stakinghub.ErrorContent (CryptoStakingHubComposable.kt:75)");
            }
            ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), "TestTagErrorContentTag"), null, 0, null, null, null, null, false, composerStartRestartGroup, 12582912, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingHubComposable4.ErrorContent$lambda$4(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final CryptoStakingHubViewState CryptoStakingHubComposable$lambda$0(SnapshotState4<? extends CryptoStakingHubViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(final CryptoStakingHubViewState.Content viewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1872656543);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
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
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1872656543, i3, -1, "com.robinhood.shared.crypto.staking.staking.stakinghub.MainContent (CryptoStakingHubComposable.kt:88)");
                }
                float bottom = WindowInsetsKt.asPaddingValues(WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()), composerStartRestartGroup, 0).getBottom();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM();
                Modifier modifierTestTag = TestTag3.testTag(modifier4, TestTagContentTag);
                PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, fM21590getDefaultD9Ej5fM, 0.0f, bottom, 5, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(viewState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoStakingHubComposable4.MainContent$lambda$9$lambda$8$lambda$7(viewState, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                LazyDslKt.LazyColumn(modifierTestTag, null, paddingValuesM5139PaddingValuesa9UjIt4$default, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 490);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingHubComposable4.MainContent$lambda$10(viewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            float bottom2 = WindowInsetsKt.asPaddingValues(WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()), composerStartRestartGroup, 0).getBottom();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            float fM21590getDefaultD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM();
            Modifier modifierTestTag2 = TestTag3.testTag(modifier4, TestTagContentTag);
            PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default2 = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, fM21590getDefaultD9Ej5fM2, 0.0f, bottom2, 5, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(viewState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoStakingHubComposable4.MainContent$lambda$9$lambda$8$lambda$7(viewState, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                LazyDslKt.LazyColumn(modifierTestTag2, null, paddingValuesM5139PaddingValuesa9UjIt4$default2, false, horizontalOrVerticalM5089spacedBy0680j_42, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 490);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$9$lambda$8$lambda$7(CryptoStakingHubViewState.Content content, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List listListOf = CollectionsKt.listOf((Object[]) new ImmutableList[]{content.getHeaderSection(), content.getUpsellSection(), content.getStakedSection(), content.getStakeableSection()});
        ArrayList<ImmutableList> arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (!((ImmutableList) obj).isEmpty()) {
                arrayList.add(obj);
            }
        }
        for (final ImmutableList immutableList : arrayList) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1519860670, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposableKt$MainContent$1$1$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1519860670, i, -1, "com.robinhood.shared.crypto.staking.staking.stakinghub.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoStakingHubComposable.kt:111)");
                    }
                    ImmutableList<UIComponent<GenericAction>> immutableList2 = immutableList;
                    HorizontalPadding horizontalPadding = HorizontalPadding.None;
                    composer.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(immutableList2, GenericAction.class, Modifier.INSTANCE, null, null, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer, 196608, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }
}
