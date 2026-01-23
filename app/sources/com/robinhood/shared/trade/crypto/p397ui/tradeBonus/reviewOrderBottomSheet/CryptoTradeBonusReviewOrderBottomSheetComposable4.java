package com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetViewState;
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

/* compiled from: CryptoTradeBonusReviewOrderBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a;\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010\r\u001a)\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\"\u0016\u0010\u0018\u001a\u00020\u00198\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, m3636d2 = {"CryptoTradeBonusReviewOrderBottomSheetComposable", "", "onDismissTapped", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadedContent", "state", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetViewState$Loaded;", "onLearnMoreTapped", "(Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetViewState$Loaded;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DataRow", "row", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetViewState$Loaded$DataRow;", "isBonusRow", "", "showDivider", "(Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetViewState$Loaded$DataRow;ZZLandroidx/compose/runtime/Composer;II)V", "LoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "PreviewLoadingContent", "POG_TEST_TAG", "", "getPOG_TEST_TAG$annotations", "()V", "feature-trade-crypto_externalDebug", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTradeBonusReviewOrderBottomSheetComposable4 {
    public static final String POG_TEST_TAG = "crypto_trade_bonus_review_order_composable_pog_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTradeBonusReviewOrderBottomSheetComposable$lambda$3(Function0 function0, Modifier modifier, CryptoTradeBonusReviewOrderBottomSheetDuxo cryptoTradeBonusReviewOrderBottomSheetDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTradeBonusReviewOrderBottomSheetComposable(function0, modifier, cryptoTradeBonusReviewOrderBottomSheetDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataRow$lambda$7(CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded.DataRow dataRow, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        DataRow(dataRow, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$5(CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded loaded, Function0 function0, Modifier modifier, Function0 function02, int i, int i2, Composer composer, int i3) {
        LoadedContent(loaded, function0, modifier, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$8(int i, Composer composer, int i2) {
        LoadingContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingContent$lambda$9(int i, Composer composer, int i2) {
        PreviewLoadingContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPOG_TEST_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTradeBonusReviewOrderBottomSheetComposable(final Function0<Unit> onDismissTapped, Modifier modifier, CryptoTradeBonusReviewOrderBottomSheetDuxo cryptoTradeBonusReviewOrderBottomSheetDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTradeBonusReviewOrderBottomSheetDuxo cryptoTradeBonusReviewOrderBottomSheetDuxo2;
        int i4;
        int i5;
        int i6;
        final Modifier modifier3;
        CryptoTradeBonusReviewOrderBottomSheetDuxo cryptoTradeBonusReviewOrderBottomSheetDuxo3;
        CryptoTradeBonusReviewOrderBottomSheetViewState cryptoTradeBonusReviewOrderBottomSheetViewStateCryptoTradeBonusReviewOrderBottomSheetComposable$lambda$0;
        final CryptoTradeBonusReviewOrderBottomSheetDuxo cryptoTradeBonusReviewOrderBottomSheetDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissTapped, "onDismissTapped");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1276456427);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDismissTapped) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoTradeBonusReviewOrderBottomSheetDuxo2 = cryptoTradeBonusReviewOrderBottomSheetDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(cryptoTradeBonusReviewOrderBottomSheetDuxo2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    cryptoTradeBonusReviewOrderBottomSheetDuxo2 = cryptoTradeBonusReviewOrderBottomSheetDuxo;
                }
                i3 |= i8;
            } else {
                cryptoTradeBonusReviewOrderBottomSheetDuxo2 = cryptoTradeBonusReviewOrderBottomSheetDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                        i4 = -1633490746;
                        i5 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTradeBonusReviewOrderBottomSheetDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetComposableKt$CryptoTradeBonusReviewOrderBottomSheetComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetComposableKt$CryptoTradeBonusReviewOrderBottomSheetComposable$$inlined$duxo$1.1
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
                        cryptoTradeBonusReviewOrderBottomSheetDuxo2 = (CryptoTradeBonusReviewOrderBottomSheetDuxo) baseDuxo;
                        i3 &= -897;
                    } else {
                        i4 = -1633490746;
                        i5 = 0;
                    }
                    Modifier modifier5 = modifier4;
                    i6 = i3;
                    modifier3 = modifier5;
                    cryptoTradeBonusReviewOrderBottomSheetDuxo3 = cryptoTradeBonusReviewOrderBottomSheetDuxo2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i6 = i3;
                    modifier3 = modifier2;
                    cryptoTradeBonusReviewOrderBottomSheetDuxo3 = cryptoTradeBonusReviewOrderBottomSheetDuxo2;
                    i4 = -1633490746;
                    i5 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1276456427, i6, -1, "com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetComposable (CryptoTradeBonusReviewOrderBottomSheetComposable.kt:43)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                cryptoTradeBonusReviewOrderBottomSheetViewStateCryptoTradeBonusReviewOrderBottomSheetComposable$lambda$0 = CryptoTradeBonusReviewOrderBottomSheetComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoTradeBonusReviewOrderBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(cryptoTradeBonusReviewOrderBottomSheetViewStateCryptoTradeBonusReviewOrderBottomSheetComposable$lambda$0 instanceof CryptoTradeBonusReviewOrderBottomSheetViewState.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(1686034021);
                    LoadingContent(composerStartRestartGroup, i5);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(cryptoTradeBonusReviewOrderBottomSheetViewStateCryptoTradeBonusReviewOrderBottomSheetComposable$lambda$0 instanceof CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded)) {
                        composerStartRestartGroup.startReplaceGroup(1686032167);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1686036377);
                    CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded loaded = (CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded) cryptoTradeBonusReviewOrderBottomSheetViewStateCryptoTradeBonusReviewOrderBottomSheetComposable$lambda$0;
                    composerStartRestartGroup.startReplaceGroup(i4);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTradeBonusReviewOrderBottomSheetComposable4.m2935x8dde5e46(navigator, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LoadedContent(loaded, (Function0) objRememberedValue2, modifier3, onDismissTapped, composerStartRestartGroup, StringResource.$stable | ((i6 << 3) & 896) | ((i6 << 9) & 7168), 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoTradeBonusReviewOrderBottomSheetDuxo4 = cryptoTradeBonusReviewOrderBottomSheetDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                cryptoTradeBonusReviewOrderBottomSheetDuxo4 = cryptoTradeBonusReviewOrderBottomSheetDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTradeBonusReviewOrderBottomSheetComposable4.CryptoTradeBonusReviewOrderBottomSheetComposable$lambda$3(onDismissTapped, modifier3, cryptoTradeBonusReviewOrderBottomSheetDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i7 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                Modifier modifier52 = modifier4;
                i6 = i3;
                modifier3 = modifier52;
                cryptoTradeBonusReviewOrderBottomSheetDuxo3 = cryptoTradeBonusReviewOrderBottomSheetDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                cryptoTradeBonusReviewOrderBottomSheetViewStateCryptoTradeBonusReviewOrderBottomSheetComposable$lambda$0 = CryptoTradeBonusReviewOrderBottomSheetComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoTradeBonusReviewOrderBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(cryptoTradeBonusReviewOrderBottomSheetViewStateCryptoTradeBonusReviewOrderBottomSheetComposable$lambda$0 instanceof CryptoTradeBonusReviewOrderBottomSheetViewState.Loading)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoTradeBonusReviewOrderBottomSheetDuxo4 = cryptoTradeBonusReviewOrderBottomSheetDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTradeBonusReviewOrderBottomSheetComposable$lambda$2$lambda$1 */
    public static final Unit m2935x8dde5e46(Navigator navigator, Context context) {
        String string2 = context.getString(C40095R.string.crypto_trade_bonus_support_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, context, string2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedContent(final CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded loaded, final Function0<Unit> function0, Modifier modifier, final Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1384398679);
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
                function03 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i2 & 8) == 0) {
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1384398679, i3, -1, "com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.LoadedContent (CryptoTradeBonusReviewOrderBottomSheetComposable.kt:72)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Modifier modifier5 = modifier4;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
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
                        int i6 = i3;
                        BentoPogKt.m20684BentoPictogramPogRhg8lNc(ServerToBentoAssetMapper3.CRYPTO_GIFT.getResourceId(), TestTag3.testTag(companion2, POG_TEST_TAG), false, BentoPogSize.Hero, null, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU()), composerStartRestartGroup, 3120, 52);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.crypto_trade_bonus_bottom_sheet_title, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(StringResources_androidKt.stringResource(C40095R.string.crypto_trade_bonus_bottom_sheet_review_order_text, new Object[]{loaded.getBonusCurrencyCode()}, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C40095R.string.crypto_trade_bonus_bottom_sheet_learn_more_cta, composerStartRestartGroup, 0), function03, null, jM21425getFg0d7_KjU, 0L, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), composerStartRestartGroup, (i6 << 3) & 896, 40);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded.DataRow amountWithoutBonusRow = loaded.getAmountWithoutBonusRow();
                        int i7 = StringResource.$stable;
                        DataRow(amountWithoutBonusRow, false, false, composerStartRestartGroup, i7, 6);
                        DataRow(loaded.getBonusRow(), true, false, composerStartRestartGroup, i7 | 48, 4);
                        DataRow(loaded.getAmountWithBonusRow(), false, false, composerStartRestartGroup, i7 | 384, 2);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C40095R.string.crypto_trade_bonus_bottom_sheet_dismiss_cta, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i6 >> 9) & 14) | 384, 0, 8184);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
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
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoTradeBonusReviewOrderBottomSheetComposable4.LoadedContent$lambda$5(loaded, function0, modifier3, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                if ((i3 & 1171) == 1170) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifier52 = modifier4;
                    Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM());
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        int i62 = i3;
                        BentoPogKt.m20684BentoPictogramPogRhg8lNc(ServerToBentoAssetMapper3.CRYPTO_GIFT.getResourceId(), TestTag3.testTag(companion22, POG_TEST_TAG), false, BentoPogSize.Hero, null, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU()), composerStartRestartGroup, 3120, 52);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.crypto_trade_bonus_bottom_sheet_title, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(StringResources_androidKt.stringResource(C40095R.string.crypto_trade_bonus_bottom_sheet_review_order_text, new Object[]{loaded.getBonusCurrencyCode()}, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C40095R.string.crypto_trade_bonus_bottom_sheet_learn_more_cta, composerStartRestartGroup, 0), function03, null, jM21425getFg0d7_KjU2, 0L, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), composerStartRestartGroup, (i62 << 3) & 896, 40);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded.DataRow amountWithoutBonusRow2 = loaded.getAmountWithoutBonusRow();
                        int i72 = StringResource.$stable;
                        DataRow(amountWithoutBonusRow2, false, false, composerStartRestartGroup, i72, 6);
                        DataRow(loaded.getBonusRow(), true, false, composerStartRestartGroup, i72 | 48, 4);
                        DataRow(loaded.getAmountWithBonusRow(), false, false, composerStartRestartGroup, i72 | 384, 2);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C40095R.string.crypto_trade_bonus_bottom_sheet_dismiss_cta, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i62 >> 9) & 14) | 384, 0, 8184);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 8) == 0) {
            }
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function03 = function0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final CryptoTradeBonusReviewOrderBottomSheetViewState CryptoTradeBonusReviewOrderBottomSheetComposable$lambda$0(SnapshotState4<? extends CryptoTradeBonusReviewOrderBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void DataRow(final CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded.DataRow dataRow, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        long jM21426getFg20d7_KjU;
        boolean z7;
        long jM21426getFg20d7_KjU2;
        Composer composer2;
        final boolean z8;
        final boolean z9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-823582909);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(dataRow) : composerStartRestartGroup.changedInstance(dataRow) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    z5 = i5 == 0 ? false : z3;
                    z6 = i4 == 0 ? true : z4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-823582909, i3, -1, "com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.DataRow (CryptoTradeBonusReviewOrderBottomSheetComposable.kt:120)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    if (z5) {
                        composerStartRestartGroup.startReplaceGroup(1125606722);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1125605889);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    FontWeight bold = !z5 ? FontWeight.INSTANCE.getBold() : null;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                    StringResource startText = dataRow.getStartText();
                    int i7 = StringResource.$stable;
                    z7 = z5;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(startText, composerStartRestartGroup, i7), null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 0, 0, 8170);
                    Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    if (z7) {
                        composerStartRestartGroup.startReplaceGroup(1125617090);
                        jM21426getFg20d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1125616257);
                        jM21426getFg20d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(dataRow.getEndText(), composerStartRestartGroup, i7), null, Color.m6701boximpl(jM21426getFg20d7_KjU2), null, !z7 ? FontWeight.INSTANCE.getBold() : null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8170);
                    composerStartRestartGroup.endNode();
                    if (z6) {
                        Divider2.m5581DivideroMI9zvI(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU(), 0.0f, 0.0f, composerStartRestartGroup, 6, 12);
                    }
                    composer2 = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z8 = z7;
                    z9 = z6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z8 = z3;
                    z9 = z4;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoTradeBonusReviewOrderBottomSheetComposable4.DataRow$lambda$7(dataRow, z8, z9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z4 = z2;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    if (z5) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (!z5) {
                    }
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM();
                    StringResource startText2 = dataRow.getStartText();
                    int i72 = StringResource.$stable;
                    z7 = z5;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(startText2, composerStartRestartGroup, i72), null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textM2, composerStartRestartGroup, 0, 0, 8170);
                    Spacer2.Spacer(Row5.weight$default(row62, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    if (z7) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (!z7) {
                    }
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(dataRow.getEndText(), composerStartRestartGroup, i72), null, Color.m6701boximpl(jM21426getFg20d7_KjU2), null, !z7 ? FontWeight.INSTANCE.getBold() : null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 0, 0, 8170);
                    composerStartRestartGroup.endNode();
                    if (z6) {
                    }
                    composer2 = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z8 = z7;
                    z9 = z6;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z4 = z2;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2031860872);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031860872, i, -1, "com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.LoadingContent (CryptoTradeBonusReviewOrderBottomSheetComposable.kt:149)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, CryptoTradeBonusReviewOrderBottomSheetComposable.INSTANCE.m26048getLambda$1728891656$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTradeBonusReviewOrderBottomSheetComposable4.LoadingContent$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLoadingContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-38784172);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-38784172, i, -1, "com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.PreviewLoadingContent (CryptoTradeBonusReviewOrderBottomSheetComposable.kt:161)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoTradeBonusReviewOrderBottomSheetComposable.INSTANCE.getLambda$1763957004$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTradeBonusReviewOrderBottomSheetComposable4.PreviewLoadingContent$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
