package com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.contracts.CryptoFeeTierIntentKey;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposable3;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionViewState;
import com.robinhood.utils.resource.StringResource;
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
import kotlin.text.StringsKt;

/* compiled from: CryptoFeeDefinitionComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aA\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\"\u0010\u0010\u0016\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"CryptoFeeDefinitionComposable", "", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadedContent", "state", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState$Loaded;", "onSecondaryButtonClick", "Lkotlin/Function1;", "", "(Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState$Loaded;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LoadingContent", "showBannerLoading", "", "(ZLandroidx/compose/runtime/Composer;I)V", "PreviewLoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "BannerTextTag", "feature-trade-crypto_externalDebug", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoFeeDefinitionComposable3 {
    public static final String BannerTextTag = "CryptoFeeDefinitionComposable.bannerText";

    /* compiled from: CryptoFeeDefinitionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure.values().length];
            try {
                iArr[CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure.VOLUME_TIERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure.FIXED_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeDefinitionComposable$lambda$3(Function0 function0, Modifier modifier, CryptoFeeDefinitionDuxo cryptoFeeDefinitionDuxo, int i, int i2, Composer composer, int i3) {
        CryptoFeeDefinitionComposable(function0, modifier, cryptoFeeDefinitionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$7(CryptoFeeDefinitionViewState.Loaded loaded, Function0 function0, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        LoadedContent(loaded, function0, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$8(boolean z, int i, Composer composer, int i2) {
        LoadingContent(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingContent$lambda$9(int i, Composer composer, int i2) {
        PreviewLoadingContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoFeeDefinitionComposable(final Function0<Unit> onDismiss, Modifier modifier, CryptoFeeDefinitionDuxo cryptoFeeDefinitionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoFeeDefinitionDuxo cryptoFeeDefinitionDuxo2;
        int i4;
        int i5;
        final Modifier modifier3;
        CryptoFeeDefinitionDuxo cryptoFeeDefinitionDuxo3;
        final CryptoFeeDefinitionViewState cryptoFeeDefinitionViewStateCryptoFeeDefinitionComposable$lambda$0;
        final CryptoFeeDefinitionDuxo cryptoFeeDefinitionDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1863277867);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDismiss) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoFeeDefinitionDuxo2 = cryptoFeeDefinitionDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(cryptoFeeDefinitionDuxo2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    cryptoFeeDefinitionDuxo2 = cryptoFeeDefinitionDuxo;
                }
                i3 |= i7;
            } else {
                cryptoFeeDefinitionDuxo2 = cryptoFeeDefinitionDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoFeeDefinitionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$CryptoFeeDefinitionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$CryptoFeeDefinitionComposable$$inlined$duxo$1.1
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
                        cryptoFeeDefinitionDuxo2 = (CryptoFeeDefinitionDuxo) baseDuxo;
                        i3 &= -897;
                    } else {
                        i4 = 0;
                    }
                    Modifier modifier5 = modifier4;
                    i5 = i3;
                    modifier3 = modifier5;
                    cryptoFeeDefinitionDuxo3 = cryptoFeeDefinitionDuxo2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    cryptoFeeDefinitionDuxo3 = cryptoFeeDefinitionDuxo2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1863277867, i5, -1, "com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposable (CryptoFeeDefinitionComposable.kt:37)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                cryptoFeeDefinitionViewStateCryptoFeeDefinitionComposable$lambda$0 = CryptoFeeDefinitionComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoFeeDefinitionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(cryptoFeeDefinitionViewStateCryptoFeeDefinitionComposable$lambda$0 instanceof CryptoFeeDefinitionViewState.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(391345136);
                    LoadingContent(((CryptoFeeDefinitionViewState.Loading) cryptoFeeDefinitionViewStateCryptoFeeDefinitionComposable$lambda$0).getShowBannerLoading(), composerStartRestartGroup, i4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(cryptoFeeDefinitionViewStateCryptoFeeDefinitionComposable$lambda$0 instanceof CryptoFeeDefinitionViewState.Loaded)) {
                        composerStartRestartGroup.startReplaceGroup(391343532);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-753067107);
                    CryptoFeeDefinitionViewState.Loaded loaded = (CryptoFeeDefinitionViewState.Loaded) cryptoFeeDefinitionViewStateCryptoFeeDefinitionComposable$lambda$0;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChanged = composerStartRestartGroup.changed(cryptoFeeDefinitionViewStateCryptoFeeDefinitionComposable$lambda$0) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoFeeDefinitionComposable3.CryptoFeeDefinitionComposable$lambda$2$lambda$1(cryptoFeeDefinitionViewStateCryptoFeeDefinitionComposable$lambda$0, navigator, context, (String) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i8 = i5 << 3;
                    LoadedContent(loaded, onDismiss, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, StringResource.$stable | (i8 & 112) | (i8 & 896), 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoFeeDefinitionDuxo4 = cryptoFeeDefinitionDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                cryptoFeeDefinitionDuxo4 = cryptoFeeDefinitionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoFeeDefinitionComposable3.CryptoFeeDefinitionComposable$lambda$3(onDismiss, modifier3, cryptoFeeDefinitionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                Modifier modifier52 = modifier4;
                i5 = i3;
                modifier3 = modifier52;
                cryptoFeeDefinitionDuxo3 = cryptoFeeDefinitionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                cryptoFeeDefinitionViewStateCryptoFeeDefinitionComposable$lambda$0 = CryptoFeeDefinitionComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoFeeDefinitionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(cryptoFeeDefinitionViewStateCryptoFeeDefinitionComposable$lambda$0 instanceof CryptoFeeDefinitionViewState.Loading)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoFeeDefinitionDuxo4 = cryptoFeeDefinitionDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeDefinitionComposable$lambda$2$lambda$1(CryptoFeeDefinitionViewState cryptoFeeDefinitionViewState, Navigator navigator, Context context, String learnMoreUrl) {
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        int i = WhenMappings.$EnumSwitchMapping$0[((CryptoFeeDefinitionViewState.Loaded) cryptoFeeDefinitionViewState).getFeeStructure().ordinal()];
        if (i == 1) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoFeeTierIntentKey(CryptoFeeTierIntentKey.LaunchType.MODAL, null, 2, null), null, false, null, null, 60, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Navigators3.showHelpCenterWebViewFragment(navigator, context, learnMoreUrl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedContent(final CryptoFeeDefinitionViewState.Loaded loaded, final Function0<Unit> function0, Modifier modifier, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final String string2;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function1<? super String, Unit> function12 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(145411202);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(loaded) : composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(145411202, i3, -1, "com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.LoadedContent (CryptoFeeDefinitionComposable.kt:77)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall();
                    String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_definition_title, composerStartRestartGroup, 0);
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 48, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                    StringResource bodyText = loaded.getBodyText();
                    int i6 = StringResource.$stable;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(bodyText, composerStartRestartGroup, i6), modifierFillMaxWidth$default2, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 48, 0, 8124);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-847752223);
                    if (loaded.getBannerText() != null) {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                        BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(TestTag3.testTag(companion2, BannerTextTag), StringResource2.getString(loaded.getBannerText(), composer2, i6), null, null, null, null, bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i5).m21373getBg30d7_KjU(), composer2, 3078, 52);
                        composer2 = composer2;
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                    string2 = StringResource2.getString(loaded.getLearnMoreUrl(), composer2, i6);
                    String string3 = StringResource2.getString(loaded.getPrimaryCtaText(), composer2, i6);
                    String strStringResource2 = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_definition_learn_more, composer2, 0);
                    composer2.startReplaceGroup(-1633490746);
                    zChanged = composer2.changed(string2) | ((i3 & 7168) != 2048);
                    objRememberedValue = composer2.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        function12 = function1;
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoFeeDefinitionComposable3.LoadedContent$lambda$6$lambda$5$lambda$4(function12, string2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        function12 = function1;
                    }
                    composer2.endReplaceGroup();
                    Composer composer4 = composer2;
                    BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, string3, false, null, false, (Function0) objRememberedValue, strStringResource2, false, null, false, composer4, (i3 << 15) & 3670016, 0, 59199);
                    composer3 = composer4;
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
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoFeeDefinitionComposable3.LoadedContent$lambda$7(loaded, function0, modifier3, function12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 1171) != 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifier52 = modifier4;
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), null, 2, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                    TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall();
                    String strStringResource3 = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_definition_title, composerStartRestartGroup, 0);
                    TextAlign.Companion companion32 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource3, modifierFillMaxWidth$default3, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, 48, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                    TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM();
                    StringResource bodyText2 = loaded.getBodyText();
                    int i62 = StringResource.$stable;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(bodyText2, composerStartRestartGroup, i62), modifierFillMaxWidth$default22, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM2, composerStartRestartGroup, 48, 0, 8124);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-847752223);
                    if (loaded.getBannerText() != null) {
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composer2, i52).m21590getDefaultD9Ej5fM()), composer2, 0);
                    string2 = StringResource2.getString(loaded.getLearnMoreUrl(), composer2, i62);
                    String string32 = StringResource2.getString(loaded.getPrimaryCtaText(), composer2, i62);
                    String strStringResource22 = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_definition_learn_more, composer2, 0);
                    composer2.startReplaceGroup(-1633490746);
                    zChanged = composer2.changed(string2) | ((i3 & 7168) != 2048);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChanged) {
                        function12 = function1;
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoFeeDefinitionComposable3.LoadedContent$lambda$6$lambda$5$lambda$4(function12, string2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                        composer2.endReplaceGroup();
                        Composer composer42 = composer2;
                        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, string32, false, null, false, (Function0) objRememberedValue, strStringResource22, false, null, false, composer42, (i3 << 15) & 3670016, 0, 59199);
                        composer3 = composer42;
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final CryptoFeeDefinitionViewState CryptoFeeDefinitionComposable$lambda$0(SnapshotState4<? extends CryptoFeeDefinitionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$6$lambda$5$lambda$4(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoFeeDefinitionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$LoadingContent$1 */
    static final class C401801 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $showBannerLoading;

        C401801(boolean z) {
            this.$showBannerLoading = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1502402656, i, -1, "com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.LoadingContent.<anonymous> (CryptoFeeDefinitionComposable.kt:121)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            StringResource.Companion companion2 = StringResource.INSTANCE;
            CryptoFeeDefinitionViewState.Loaded loaded = new CryptoFeeDefinitionViewState.Loaded(companion2.invoke(StringsKt.repeat("---- --------- -------- -------\n", 3)), this.$showBannerLoading ? companion2.invoke("---- --------- -------- -------\n") : null, companion2.invoke("---- ---------"), companion2.invoke(""), CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure.VOLUME_TIERED);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$LoadingContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$LoadingContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoFeeDefinitionComposable3.C401801.invoke$lambda$3$lambda$2((String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CryptoFeeDefinitionComposable3.LoadedContent(loaded, function0, companion, (Function1) objRememberedValue2, composer, StringResource.$stable | 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingContent(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(115283760);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(115283760, i2, -1, "com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.LoadingContent (CryptoFeeDefinitionComposable.kt:119)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-1502402656, true, new C401801(z), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeDefinitionComposable3.LoadingContent$lambda$8(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLoadingContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-470236554);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-470236554, i, -1, "com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.PreviewLoadingContent (CryptoFeeDefinitionComposable.kt:142)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoFeeDefinitionComposable.INSTANCE.m25820getLambda$507048002$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeDefinitionComposable3.PreviewLoadingContent$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
