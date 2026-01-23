package com.robinhood.android.crypto.tab.p093ui.feeTiers;

import android.content.Context;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
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
import com.robinhood.android.crypto.tab.p093ui.feeTiers.CryptoHomeAboutFeeTiersBottomSheet;
import com.robinhood.android.crypto.tab.p093ui.feeTiers.CryptoHomeFeeTierStatusViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.fragment.DialogFragments;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.CryptoFeeTierIntentKey;
import com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummary;
import com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummaryComposable3;
import com.robinhood.shared.crypto.p375ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBanner;
import com.robinhood.utils.p409ui.context.BaseContexts;
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

/* compiled from: CryptoHomeFeeTierStatusComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\"\u0016\u0010\u000f\u001a\u00020\u00108\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\b\u001a\u00020\u0014X\u008a\u0084\u0002"}, m3636d2 = {"CryptoHomeFeeTierStatusComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusDuxo;Landroidx/compose/runtime/Composer;II)V", "CryptoFeeTierStatusContent", "viewState", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusViewState$Show;", "(Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusViewState$Show;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoHomeFeeTierStatusPreview", "previewState", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/PreviewState;", "(Lcom/robinhood/android/crypto/tab/ui/feeTiers/PreviewState;Landroidx/compose/runtime/Composer;I)V", CryptoHomeFeeTierStatusComposable.SHOW_FEE_TIER_STATUS_TAG, "", "getSHOW_FEE_TIER_STATUS_TAG$annotations", "()V", "feature-crypto-tab_externalDebug", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeFeeTierStatusComposable {
    public static final String SHOW_FEE_TIER_STATUS_TAG = "SHOW_FEE_TIER_STATUS_TAG";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierStatusContent$lambda$7(CryptoHomeFeeTierStatusViewState.Show show, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoFeeTierStatusContent(show, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeFeeTierStatusComposable$lambda$1(Modifier modifier, CryptoHomeFeeTierStatusDuxo cryptoHomeFeeTierStatusDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeFeeTierStatusComposable(modifier, cryptoHomeFeeTierStatusDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeFeeTierStatusPreview$lambda$8(PreviewState previewState, int i, Composer composer, int i2) {
        CryptoHomeFeeTierStatusPreview(previewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getSHOW_FEE_TIER_STATUS_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHomeFeeTierStatusComposable(final Modifier modifier, final CryptoHomeFeeTierStatusDuxo cryptoHomeFeeTierStatusDuxo, Composer composer, final int i, final int i2) {
        int i3;
        CryptoHomeFeeTierStatusViewState cryptoHomeFeeTierStatusViewStateCryptoHomeFeeTierStatusComposable$lambda$0;
        Composer composerStartRestartGroup = composer.startRestartGroup(796890660);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(cryptoHomeFeeTierStatusDuxo)) ? 32 : 16;
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeFeeTierStatusDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt$CryptoHomeFeeTierStatusComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt$CryptoHomeFeeTierStatusComposable$$inlined$duxo$1.1
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
                    cryptoHomeFeeTierStatusDuxo = (CryptoHomeFeeTierStatusDuxo) baseDuxo;
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(796890660, i5, -1, "com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposable (CryptoHomeFeeTierStatusComposable.kt:45)");
                }
                cryptoHomeFeeTierStatusViewStateCryptoHomeFeeTierStatusComposable$lambda$0 = CryptoHomeFeeTierStatusComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoHomeFeeTierStatusDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(cryptoHomeFeeTierStatusViewStateCryptoHomeFeeTierStatusComposable$lambda$0 instanceof CryptoHomeFeeTierStatusViewState.Show)) {
                    CryptoFeeTierStatusContent((CryptoHomeFeeTierStatusViewState.Show) cryptoHomeFeeTierStatusViewStateCryptoHomeFeeTierStatusComposable$lambda$0, TestTag3.testTag(modifier, SHOW_FEE_TIER_STATUS_TAG), composerStartRestartGroup, CryptoFeeTierSummary.$stable | StringResource.$stable, 0);
                } else if (!(cryptoHomeFeeTierStatusViewStateCryptoHomeFeeTierStatusComposable$lambda$0 instanceof CryptoHomeFeeTierStatusViewState.Hide)) {
                    throw new NoWhenBranchMatchedException();
                }
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
                cryptoHomeFeeTierStatusViewStateCryptoHomeFeeTierStatusComposable$lambda$0 = CryptoHomeFeeTierStatusComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoHomeFeeTierStatusDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(cryptoHomeFeeTierStatusViewStateCryptoHomeFeeTierStatusComposable$lambda$0 instanceof CryptoHomeFeeTierStatusViewState.Show)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeFeeTierStatusComposable.CryptoHomeFeeTierStatusComposable$lambda$1(modifier, cryptoHomeFeeTierStatusDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoFeeTierStatusContent(final CryptoHomeFeeTierStatusViewState.Show show, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        final Navigator navigator;
        final Context context;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1671788524);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(show) : composerStartRestartGroup.changedInstance(show) ? 4 : 2) | i;
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
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1671788524, i3, -1, "com.robinhood.android.crypto.tab.ui.feeTiers.CryptoFeeTierStatusContent (CryptoHomeFeeTierStatusComposable.kt:62)");
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Modifier modifierAutomationTestTag = AutomationTestTagModifierExt.automationTestTag(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TOOLTIP, "your_fee_tier", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), "fee_tier_status_section_title");
                String strStringResource = StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_fee_tier_status_section_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoTextWithTrailingIconState bentoTextWithTrailingIconState = new BentoTextWithTrailingIconState(strStringResource, new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), null, bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), null, null, null, null, null, 0, false, 0, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), false, C2002Dp.m7993boximpl(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), null, false, 221168, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(show))) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeFeeTierStatusComposable.CryptoFeeTierStatusContent$lambda$6$lambda$3$lambda$2(show, userInteractionEventDescriptor, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(bentoTextWithTrailingIconState, modifierAutomationTestTag, null, (Function0) objRememberedValue, composerStartRestartGroup, BentoTextWithTrailingIconState.$stable, 4);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                CryptoFeeTierExpirationWarningBanner.CryptoFeeTierExpirationWarningBanner(show.getExpirationWarningBannerText(), PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 7, null), null, composerStartRestartGroup, StringResource.$stable, 4);
                CryptoFeeTierSummaryComposable3.CryptoFeeTierSummaryComposable(show.getFeeTierSummary(), composerStartRestartGroup, CryptoFeeTierSummary.$stable);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierAutomationTestTag2 = AutomationTestTagModifierExt.automationTestTag(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "manage_fee_tiers", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), "manage_fee_tiers");
                String strStringResource2 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_fee_tier_status_manage_fee_tiers_cta, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeFeeTierStatusComposable.CryptoFeeTierStatusContent$lambda$6$lambda$5$lambda$4(navigator, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, strStringResource2, modifierAutomationTestTag2, null, null, false, null, composerStartRestartGroup, 0, 120);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoHomeFeeTierStatusComposable.CryptoFeeTierStatusContent$lambda$7(show, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
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
                Modifier modifierAutomationTestTag3 = AutomationTestTagModifierExt.automationTestTag(ModifiersKt.autoLogEvents$default(companion22, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TOOLTIP, "your_fee_tier", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), "fee_tier_status_section_title");
                String strStringResource3 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_fee_tier_status_section_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                BentoTextWithTrailingIconState bentoTextWithTrailingIconState2 = new BentoTextWithTrailingIconState(strStringResource3, new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), null, bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), null, null, null, null, null, 0, false, 0, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), false, C2002Dp.m7993boximpl(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), null, false, 221168, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                if ((i3 & 14) != 4) {
                    zChangedInstance = ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(show))) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeFeeTierStatusComposable.CryptoFeeTierStatusContent$lambda$6$lambda$3$lambda$2(show, userInteractionEventDescriptor, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(bentoTextWithTrailingIconState2, modifierAutomationTestTag3, null, (Function0) objRememberedValue, composerStartRestartGroup, BentoTextWithTrailingIconState.$stable, 4);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        CryptoFeeTierExpirationWarningBanner.CryptoFeeTierExpirationWarningBanner(show.getExpirationWarningBannerText(), PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 7, null), null, composerStartRestartGroup, StringResource.$stable, 4);
                        CryptoFeeTierSummaryComposable3.CryptoFeeTierSummaryComposable(show.getFeeTierSummary(), composerStartRestartGroup, CryptoFeeTierSummary.$stable);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        Modifier modifierAutomationTestTag22 = AutomationTestTagModifierExt.automationTestTag(ModifiersKt.autoLogEvents$default(companion22, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "manage_fee_tiers", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), "manage_fee_tiers");
                        String strStringResource22 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_fee_tier_status_manage_fee_tiers_cta, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoHomeFeeTierStatusComposable.CryptoFeeTierStatusContent$lambda$6$lambda$5$lambda$4(navigator, context);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, strStringResource22, modifierAutomationTestTag22, null, null, false, null, composerStartRestartGroup, 0, 120);
                            composer2 = composerStartRestartGroup;
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final CryptoHomeFeeTierStatusViewState CryptoHomeFeeTierStatusComposable$lambda$0(SnapshotState4<? extends CryptoHomeFeeTierStatusViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierStatusContent$lambda$6$lambda$3$lambda$2(CryptoHomeFeeTierStatusViewState.Show show, UserInteractionEventDescriptor userInteractionEventDescriptor, Context context) {
        CryptoHomeAboutFeeTiersBottomSheet.Companion companion = CryptoHomeAboutFeeTiersBottomSheet.INSTANCE;
        int evaluationPeriodDays = show.getEvaluationPeriodDays();
        Screen screen = userInteractionEventDescriptor.getScreen();
        if (screen != null) {
            DialogFragment dialogFragment = (DialogFragment) companion.newInstance((Parcelable) new CryptoHomeAboutFeeTiersBottomSheet.Args(evaluationPeriodDays, screen));
            AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
            if (appCompatActivityFindActivityBaseContext != null) {
                FragmentManager supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                DialogFragments.showIfNotFound(dialogFragment, supportFragmentManager, "CryptoHomeAboutFeeTiersBottomSheet");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierStatusContent$lambda$6$lambda$5$lambda$4(Navigator navigator, Context context) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoFeeTierIntentKey(CryptoFeeTierIntentKey.LaunchType.PUSH, null, 2, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    public static final void CryptoHomeFeeTierStatusPreview(final PreviewState previewState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(previewState, "previewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1974657821);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(previewState) : composerStartRestartGroup.changedInstance(previewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1974657821, i2, -1, "com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusPreview (CryptoHomeFeeTierStatusComposable.kt:139)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), ComposableLambda3.rememberComposableLambda(2049427421, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt.CryptoHomeFeeTierStatusPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2049427421, i3, -1, "com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusPreview.<anonymous> (CryptoHomeFeeTierStatusComposable.kt:143)");
                    }
                    final PreviewState previewState2 = previewState;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-815176811, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt.CryptoHomeFeeTierStatusPreview.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-815176811, i4, -1, "com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusPreview.<anonymous>.<anonymous> (CryptoHomeFeeTierStatusComposable.kt:144)");
                            }
                            CryptoHomeFeeTierStatusComposable.CryptoFeeTierStatusContent(new CryptoHomeFeeTierStatusViewState.Show(previewState2.getFeeTierSummary(), previewState2.getExpirationBannerText(), 30), null, composer3, CryptoFeeTierSummary.$stable | StringResource.$stable, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeFeeTierStatusComposable.CryptoHomeFeeTierStatusPreview$lambda$8(previewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
