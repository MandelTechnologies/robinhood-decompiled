package com.robinhood.android.crypto.tab.p093ui.walletTrending;

import android.content.Context;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.p093ui.walletTrending.CryptoHomeWalletTrendingBottomSheet;
import com.robinhood.android.crypto.tab.p093ui.walletTrending.CryptoHomeWalletTrendingViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.fragment.DialogFragments;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable2;
import com.robinhood.shared.crypto.chips.CryptoChipsEventLoggingState;
import com.robinhood.shared.crypto.chips.CryptoChipsStyle;
import com.robinhood.utils.p409ui.context.BaseContexts;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoHomeWalletTrendingComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a5\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u0016\u001a\u00020\u00138\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001b\u001a\u00020\u00138\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, m3636d2 = {"CryptoHomeWalletTrendingComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDuxo;Landroidx/compose/runtime/Composer;II)V", "MainContent", "tokens", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/chips/CryptoChip;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "headerState", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/WalletTrendingHeaderState;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/navigation/keys/FragmentKey;Lcom/robinhood/android/crypto/tab/ui/walletTrending/WalletTrendingHeaderState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingContent", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "COMPONENT_IDENTIFIER", "", "LOADING_TOKENS", "", "TEST_TAG_WALLET_TRENDING_CHIPS", "getTEST_TAG_WALLET_TRENDING_CHIPS$annotations", "()V", "getTEST_TAG_WALLET_TRENDING_CHIPS", "()Ljava/lang/String;", "TEST_TAG_WALLET_TRENDING_DESCRIPTION_ICON", "getTEST_TAG_WALLET_TRENDING_DESCRIPTION_ICON$annotations", "getTEST_TAG_WALLET_TRENDING_DESCRIPTION_ICON", "feature-crypto-tab_externalDebug", "viewState", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeWalletTrendingComposable {
    private static final String COMPONENT_IDENTIFIER = "wallet_trending";
    private static final int LOADING_TOKENS = 6;
    private static final String TEST_TAG_WALLET_TRENDING_CHIPS = "TEST_TAG_WALLET_TRENDING_CHIPS";
    private static final String TEST_TAG_WALLET_TRENDING_DESCRIPTION_ICON = "TEST_TAG_WALLET_TRENDING_DESCRIPTION_ICON";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeWalletTrendingComposable$lambda$1(Modifier modifier, CryptoHomeWalletTrendingDuxo cryptoHomeWalletTrendingDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeWalletTrendingComposable(modifier, cryptoHomeWalletTrendingDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$10(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingContent(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$9(ImmutableList immutableList, FragmentKey fragmentKey, WalletTrendingHeaderState walletTrendingHeaderState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(immutableList, fragmentKey, walletTrendingHeaderState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTEST_TAG_WALLET_TRENDING_CHIPS$annotations() {
    }

    public static /* synthetic */ void getTEST_TAG_WALLET_TRENDING_DESCRIPTION_ICON$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHomeWalletTrendingComposable(final Modifier modifier, final CryptoHomeWalletTrendingDuxo cryptoHomeWalletTrendingDuxo, Composer composer, final int i, final int i2) {
        int i3;
        CreationExtras defaultViewModelCreationExtras;
        CryptoHomeWalletTrendingViewState cryptoHomeWalletTrendingViewStateCryptoHomeWalletTrendingComposable$lambda$0;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-296145931);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(cryptoHomeWalletTrendingDuxo)) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
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
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeWalletTrendingDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingComposableKt$CryptoHomeWalletTrendingComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingComposableKt$CryptoHomeWalletTrendingComposable$$inlined$duxo$1.1
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
                    cryptoHomeWalletTrendingDuxo = (CryptoHomeWalletTrendingDuxo) baseDuxo;
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-296145931, i5, -1, "com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingComposable (CryptoHomeWalletTrendingComposable.kt:49)");
                }
                cryptoHomeWalletTrendingViewStateCryptoHomeWalletTrendingComposable$lambda$0 = CryptoHomeWalletTrendingComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoHomeWalletTrendingDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(cryptoHomeWalletTrendingViewStateCryptoHomeWalletTrendingComposable$lambda$0 instanceof CryptoHomeWalletTrendingViewState.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(-620306990);
                    LoadingContent(modifier, composerStartRestartGroup, i5 & 14, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier2 = modifier;
                } else {
                    if (!(cryptoHomeWalletTrendingViewStateCryptoHomeWalletTrendingComposable$lambda$0 instanceof CryptoHomeWalletTrendingViewState.Loaded)) {
                        composerStartRestartGroup.startReplaceGroup(-1128390970);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-620186803);
                    CryptoHomeWalletTrendingViewState.Loaded loaded = (CryptoHomeWalletTrendingViewState.Loaded) cryptoHomeWalletTrendingViewStateCryptoHomeWalletTrendingComposable$lambda$0;
                    modifier2 = modifier;
                    MainContent(loaded.getTokens(), loaded.getFragmentKey(), loaded.getHeaderState(), modifier2, composerStartRestartGroup, CryptoChipsComposable.$stable | ((i5 << 9) & 7168), 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
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
                cryptoHomeWalletTrendingViewStateCryptoHomeWalletTrendingComposable$lambda$0 = CryptoHomeWalletTrendingComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoHomeWalletTrendingDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(cryptoHomeWalletTrendingViewStateCryptoHomeWalletTrendingComposable$lambda$0 instanceof CryptoHomeWalletTrendingViewState.Loading)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier = modifier2;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeWalletTrendingComposable.CryptoHomeWalletTrendingComposable$lambda$1(modifier, cryptoHomeWalletTrendingDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void MainContent(final ImmutableList<? extends CryptoChipsComposable> immutableList, final FragmentKey fragmentKey, final WalletTrendingHeaderState walletTrendingHeaderState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Context context;
        final Navigator navigator;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i4;
        int i5;
        String disclosure;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(475052741);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(fragmentKey) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(walletTrendingHeaderState) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(475052741, i3, -1, "com.robinhood.android.crypto.tab.ui.walletTrending.MainContent (CryptoHomeWalletTrendingComposable.kt:74)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                String title = walletTrendingHeaderState.getTitle();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                Composer composer4 = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composer4, i7).m21593getSmallD9Ej5fM()), composer4, 0);
                composer4.startReplaceGroup(221408879);
                if (walletTrendingHeaderState.getDisplayInfoIcon()) {
                    i4 = i3;
                    i5 = 24;
                } else {
                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                    String strStringResource = StringResources_androidKt.stringResource(C13013R.string.crypto_home_wallet_trending_info_icon_content_description, composer4, 0);
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composer4, i7).m21426getFg20d7_KjU();
                    Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(24)), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TOOLTIP, COMPONENT_IDENTIFIER, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), TEST_TAG_WALLET_TRENDING_DESCRIPTION_ICON);
                    composer4.startReplaceGroup(-1633490746);
                    i4 = i3;
                    boolean zChangedInstance2 = ((i3 & 896) == 256) | composer4.changedInstance(context);
                    Object objRememberedValue2 = composer4.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeWalletTrendingComposable.MainContent$lambda$8$lambda$4$lambda$3$lambda$2(walletTrendingHeaderState, context);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    composer4.endReplaceGroup();
                    i5 = 24;
                    BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21426getFg20d7_KjU, modifierTestTag, (Function0) objRememberedValue2, false, composer4, BentoIcon4.Size24.$stable, 32);
                    composer4 = composer4;
                }
                composer4.endReplaceGroup();
                composer4.endNode();
                disclosure = walletTrendingHeaderState.getDisclosure();
                composer4.startReplaceGroup(-973548009);
                if (disclosure == null) {
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer4, i7).m21593getSmallD9Ej5fM()), composer4, 0);
                    Composer composer5 = composer4;
                    BentoText2.m20747BentoText38GnDrw(disclosure, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer4, 6, 1), Color.m6701boximpl(bentoTheme.getColors(composer4, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i7).getTextM(), composer5, 0, 0, 8184);
                    composer4 = composer5;
                    Unit unit = Unit.INSTANCE;
                }
                composer4.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer4, i7).m21590getDefaultD9Ej5fM()), composer4, 0);
                Modifier modifierTestTag2 = TestTag3.testTag(companion3, TEST_TAG_WALLET_TRENDING_CHIPS);
                CryptoChipsStyle cryptoChipsStyle = new CryptoChipsStyle(bentoTheme.getSpacing(composer4, i7).m21593getSmallD9Ej5fM(), C2002Dp.m7995constructorimpl(i5), null);
                Modifier modifier5 = modifier4;
                composer2 = composer4;
                CryptoChipsComposable2.CryptoChipsComposable(immutableList, modifierTestTag2, cryptoChipsStyle, new CryptoChipsEventLoggingState("wallet_trending_"), composer2, CryptoChipsComposable.$stable | 48 | (i4 & 14) | (CryptoChipsStyle.$stable << 6) | (CryptoChipsEventLoggingState.$stable << 9), 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM()), composer2, 0);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.VIEW_ALL, null, new Component(Component.ComponentType.BUTTON, COMPONENT_IDENTIFIER, null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null), 0.0f, composer2, 0, 1);
                String strStringResource2 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_wallet_trending_discover_more_cta, composer2, 0);
                composer2.startReplaceGroup(-1746271574);
                zChangedInstance = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changedInstance(fragmentKey);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeWalletTrendingComposable.MainContent$lambda$8$lambda$7$lambda$6(navigator, context, fragmentKey);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource2, modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, null, false, null, composer2, 0, 120);
                composer3 = composer2;
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoHomeWalletTrendingComposable.MainContent$lambda$9(immutableList, fragmentKey, walletTrendingHeaderState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ3);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    String title2 = walletTrendingHeaderState.getTitle();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(title2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                    Composer composer42 = composerStartRestartGroup;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, bentoTheme2.getSpacing(composer42, i72).m21593getSmallD9Ej5fM()), composer42, 0);
                    composer42.startReplaceGroup(221408879);
                    if (walletTrendingHeaderState.getDisplayInfoIcon()) {
                    }
                    composer42.endReplaceGroup();
                    composer42.endNode();
                    disclosure = walletTrendingHeaderState.getDisclosure();
                    composer42.startReplaceGroup(-973548009);
                    if (disclosure == null) {
                    }
                    composer42.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composer42, i72).m21590getDefaultD9Ej5fM()), composer42, 0);
                    Modifier modifierTestTag22 = TestTag3.testTag(companion32, TEST_TAG_WALLET_TRENDING_CHIPS);
                    CryptoChipsStyle cryptoChipsStyle2 = new CryptoChipsStyle(bentoTheme2.getSpacing(composer42, i72).m21593getSmallD9Ej5fM(), C2002Dp.m7995constructorimpl(i5), null);
                    Modifier modifier52 = modifier4;
                    composer2 = composer42;
                    CryptoChipsComposable2.CryptoChipsComposable(immutableList, modifierTestTag22, cryptoChipsStyle2, new CryptoChipsEventLoggingState("wallet_trending_"), composer2, CryptoChipsComposable.$stable | 48 | (i4 & 14) | (CryptoChipsStyle.$stable << 6) | (CryptoChipsEventLoggingState.$stable << 9), 0);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composer2, i72).m21590getDefaultD9Ej5fM()), composer2, 0);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ22 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(ModifiersKt.autoLogEvents$default(companion32, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.VIEW_ALL, null, new Component(Component.ComponentType.BUTTON, COMPONENT_IDENTIFIER, null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null), 0.0f, composer2, 0, 1);
                    String strStringResource22 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_wallet_trending_discover_more_cta, composer2, 0);
                    composer2.startReplaceGroup(-1746271574);
                    zChangedInstance = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changedInstance(fragmentKey);
                    objRememberedValue = composer2.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeWalletTrendingComposable.MainContent$lambda$8$lambda$7$lambda$6(navigator, context, fragmentKey);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                        composer2.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource22, modifierM21623defaultHorizontalPaddingrAjV9yQ22, null, null, false, null, composer2, 0, 120);
                        composer3 = composer2;
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final CryptoHomeWalletTrendingViewState CryptoHomeWalletTrendingComposable$lambda$0(SnapshotState4<? extends CryptoHomeWalletTrendingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$8$lambda$4$lambda$3$lambda$2(WalletTrendingHeaderState walletTrendingHeaderState, Context context) {
        CryptoHomeWalletTrendingBottomSheet.Companion companion = CryptoHomeWalletTrendingBottomSheet.INSTANCE;
        String title = walletTrendingHeaderState.getTitle();
        String description = walletTrendingHeaderState.getDescription();
        if (description != null) {
            DialogFragment dialogFragment = (DialogFragment) companion.newInstance((Parcelable) new CryptoHomeWalletTrendingBottomSheet.Args(title, description));
            AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
            if (appCompatActivityFindActivityBaseContext != null) {
                FragmentManager supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                DialogFragments.showIfNotFound(dialogFragment, supportFragmentManager, "CryptoHomeWalletTrendingBottomSheet");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$8$lambda$7$lambda$6(Navigator navigator, Context context, FragmentKey fragmentKey) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, fragmentKey, false, false, false, null, false, null, true, false, null, NavigationType.PUSH, 1788, null);
        return Unit.INSTANCE;
    }

    private static final void LoadingContent(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1585920141);
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
                ComposerKt.traceEventStart(1585920141, i3, -1, "com.robinhood.android.crypto.tab.ui.walletTrending.LoadingContent (CryptoHomeWalletTrendingComposable.kt:178)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(13393149, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingComposableKt.LoadingContent.1
                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(13393149, i5, -1, "com.robinhood.android.crypto.tab.ui.walletTrending.LoadingContent.<anonymous> (CryptoHomeWalletTrendingComposable.kt:180)");
                    }
                    Modifier modifier2 = modifier;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier2);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, "----------", "-------", null, null, null, false, false, false, 0L, null, composer2, 3456, 0, 4083);
                    CryptoChipsComposable.Loading[] loadingArr = new CryptoChipsComposable.Loading[6];
                    for (int i6 = 0; i6 < 6; i6++) {
                        loadingArr[i6] = CryptoChipsComposable.Loading.INSTANCE;
                    }
                    CryptoChipsComposable2.CryptoChipsComposable(extensions2.persistentListOf(loadingArr), null, null, null, composer2, CryptoChipsComposable.Loading.$stable, 14);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw("-----------", PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), composer2, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getDisplayCapsuleMedium(), composer2, 6, 0, 8188);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeWalletTrendingComposable.LoadingContent$lambda$10(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String getTEST_TAG_WALLET_TRENDING_CHIPS() {
        return TEST_TAG_WALLET_TRENDING_CHIPS;
    }

    public static final String getTEST_TAG_WALLET_TRENDING_DESCRIPTION_ICON() {
        return TEST_TAG_WALLET_TRENDING_DESCRIPTION_ICON;
    }
}
