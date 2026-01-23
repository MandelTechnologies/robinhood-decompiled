package com.robinhood.android.crypto.tab.p093ui.power;

import android.content.Context;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.Divider5;
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
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.common.contracts.MicrogramRouterTabFragmentKey;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CryptoBuyingPowerComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"CryptoBuyingPowerComposable", "", "hideBuyingPowerDivider", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerDuxo;", "(ZLandroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerDuxo;Landroidx/compose/runtime/Composer;II)V", "BUYING_POWER_ROW_TEST_TAG", "", "feature-crypto-tab_externalDebug", "viewState", "Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoBuyingPowerComposable3 {
    public static final String BUYING_POWER_ROW_TEST_TAG = "buying_power_row_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoBuyingPowerComposable$lambda$10(boolean z, Modifier modifier, CryptoBuyingPowerDuxo cryptoBuyingPowerDuxo, int i, int i2, Composer composer, int i3) {
        CryptoBuyingPowerComposable(z, modifier, cryptoBuyingPowerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoBuyingPowerComposable(final boolean z, Modifier modifier, CryptoBuyingPowerDuxo cryptoBuyingPowerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoBuyingPowerDuxo cryptoBuyingPowerDuxo2;
        Modifier modifier3;
        int i4;
        final CryptoBuyingPowerDuxo cryptoBuyingPowerDuxo3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final CryptoBuyingPowerDuxo cryptoBuyingPowerDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(800130078);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoBuyingPowerDuxo2 = cryptoBuyingPowerDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoBuyingPowerDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoBuyingPowerDuxo2 = cryptoBuyingPowerDuxo;
                }
                i3 |= i6;
            } else {
                cryptoBuyingPowerDuxo2 = cryptoBuyingPowerDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoBuyingPowerDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerComposableKt$CryptoBuyingPowerComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerComposableKt$CryptoBuyingPowerComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        CryptoBuyingPowerDuxo cryptoBuyingPowerDuxo5 = (CryptoBuyingPowerDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        cryptoBuyingPowerDuxo3 = cryptoBuyingPowerDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(800130078, i4, -1, "com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerComposable (CryptoBuyingPowerComposable.kt:34)");
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoBuyingPowerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifier5 = modifier3;
                    Divider5.m5851HorizontalDivider9IZ8Weo(modifierFillMaxWidth$default, 0.0f, bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU(), composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceGroup(-641728986);
                    Modifier modifierTestTag = TestTag3.testTag(companion3, BUYING_POWER_ROW_TEST_TAG);
                    if (CryptoBuyingPowerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getBuyingPowerRowClickable()) {
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoBuyingPowerComposable3.CryptoBuyingPowerComposable$lambda$9$lambda$3$lambda$2$lambda$1(navigator, context);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifierTestTag = ClickableKt.m4893clickableXHw0xAI$default(modifierTestTag, false, null, null, (Function0) objRememberedValue4, 7, null);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
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
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13013R.string.crypto_home_header_buying_power, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composer2, 0, 0, 8186);
                    Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composer2, 0);
                    Modifier modifierBentoPillPlaceholder = ModifiersKt.bentoPillPlaceholder(companion3, CryptoBuyingPowerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isPlaceHolderVisible());
                    Boolean boolValueOf = Boolean.valueOf(CryptoBuyingPowerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowBuyingPowerTooltip());
                    composer2.startReplaceGroup(5004770);
                    zChangedInstance = composer2.changedInstance(cryptoBuyingPowerDuxo3);
                    objRememberedValue = composer2.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoBuyingPowerComposable3.CryptoBuyingPowerComposable$lambda$9$lambda$8$lambda$5$lambda$4(cryptoBuyingPowerDuxo3);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    zChangedInstance2 = composer2.changedInstance(cryptoBuyingPowerDuxo3);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoBuyingPowerComposable3.CryptoBuyingPowerComposable$lambda$9$lambda$8$lambda$7$lambda$6(cryptoBuyingPowerDuxo3);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(CryptoBuyingPowerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getBuyingPowerFormatted(), PopupTooltipKt.m26519popupTooltipBgaGok8(modifierBentoPillPlaceholder, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    } : function0, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    } : (Function0) objRememberedValue2, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : PopupPositioning.ABOVE, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, CryptoBuyingPowerComposable.INSTANCE.m13044getLambda$1272161802$feature_crypto_tab_externalDebug()), Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 0, 0, 8184);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(-641667275);
                    if (!z) {
                        Divider5.m5851HorizontalDivider9IZ8Weo(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU(), composerStartRestartGroup, 0, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    cryptoBuyingPowerDuxo4 = cryptoBuyingPowerDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                cryptoBuyingPowerDuxo3 = cryptoBuyingPowerDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoBuyingPowerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                if (composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    Modifier modifier52 = modifier3;
                    Divider5.m5851HorizontalDivider9IZ8Weo(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getColors(composerStartRestartGroup, i72).m21372getBg20d7_KjU(), composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceGroup(-641728986);
                    Modifier modifierTestTag2 = TestTag3.testTag(companion32, BUYING_POWER_ROW_TEST_TAG);
                    if (CryptoBuyingPowerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getBuyingPowerRowClickable()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifierTestTag2, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs2);
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
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13013R.string.crypto_home_header_buying_power, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), composer2, 0, 0, 8186);
                        Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composer2, 0);
                        Modifier modifierBentoPillPlaceholder2 = ModifiersKt.bentoPillPlaceholder(companion32, CryptoBuyingPowerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isPlaceHolderVisible());
                        Boolean boolValueOf2 = Boolean.valueOf(CryptoBuyingPowerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowBuyingPowerTooltip());
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance = composer2.changedInstance(cryptoBuyingPowerDuxo3);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoBuyingPowerComposable3.CryptoBuyingPowerComposable$lambda$9$lambda$8$lambda$5$lambda$4(cryptoBuyingPowerDuxo3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                            Function0 function02 = (Function0) objRememberedValue;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(5004770);
                            zChangedInstance2 = composer2.changedInstance(cryptoBuyingPowerDuxo3);
                            objRememberedValue2 = composer2.rememberedValue();
                            if (!zChangedInstance2) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoBuyingPowerComposable3.CryptoBuyingPowerComposable$lambda$9$lambda$8$lambda$7$lambda$6(cryptoBuyingPowerDuxo3);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(CryptoBuyingPowerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getBuyingPowerFormatted(), PopupTooltipKt.m26519popupTooltipBgaGok8(modifierBentoPillPlaceholder2, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf2, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                } : function02, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                } : (Function0) objRememberedValue2, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : PopupPositioning.ABOVE, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, CryptoBuyingPowerComposable.INSTANCE.m13044getLambda$1272161802$feature_crypto_tab_externalDebug()), Color.m6701boximpl(bentoTheme2.getColors(composer2, i72).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i72).getTextM(), composer2, 0, 0, 8184);
                                composerStartRestartGroup = composer2;
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.startReplaceGroup(-641667275);
                                if (!z) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                cryptoBuyingPowerDuxo4 = cryptoBuyingPowerDuxo3;
                                modifier4 = modifier52;
                            }
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoBuyingPowerDuxo4 = cryptoBuyingPowerDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoBuyingPowerComposable3.CryptoBuyingPowerComposable$lambda$10(z, modifier4, cryptoBuyingPowerDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                    i4 = i3;
                    cryptoBuyingPowerDuxo3 = cryptoBuyingPowerDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoBuyingPowerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Navigator navigator22 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context22 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Arrangement arrangement22 = Arrangement.INSTANCE;
                Arrangement.Vertical top22 = arrangement22.getTop();
                Alignment.Companion companion42 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(top22, companion42.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor32 = companion222.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy22, companion222.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap32, companion222.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion222.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoBuyingPowerComposable$lambda$9$lambda$3$lambda$2$lambda$1(Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new MicrogramRouterTabFragmentKey(new RemoteMicrogramApplication("app-rhc-buying-power-breakdown", null, 2, null), "robinhood-global://app_rhc_buying_power_breakdown", null, null, null, null, 60, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoBuyingPowerComposable$lambda$9$lambda$8$lambda$5$lambda$4(CryptoBuyingPowerDuxo cryptoBuyingPowerDuxo) {
        cryptoBuyingPowerDuxo.markEuBuyingPowerTooltipSeen();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoBuyingPowerComposable$lambda$9$lambda$8$lambda$7$lambda$6(CryptoBuyingPowerDuxo cryptoBuyingPowerDuxo) {
        cryptoBuyingPowerDuxo.markEuBuyingPowerTooltipSeen();
        return Unit.INSTANCE;
    }

    private static final CryptoBuyingPowerViewState CryptoBuyingPowerComposable$lambda$0(SnapshotState4<CryptoBuyingPowerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
