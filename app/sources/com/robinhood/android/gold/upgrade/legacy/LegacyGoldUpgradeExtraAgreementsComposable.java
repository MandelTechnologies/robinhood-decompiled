package com.robinhood.android.gold.upgrade.legacy;

import android.text.Spanned;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: LegacyGoldUpgradeExtraAgreementsComposable.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052M\u0010\n\u001aI\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a*\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\fX\u008a\u008e\u0002"}, m3636d2 = {"GoldUpgradeExtraAgreementsComposable", "", "agreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements;", "onClickFullAgreement", "Lkotlin/Function1;", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "Lkotlin/ParameterName;", "name", "agreement", "onClickCta", "Lkotlin/Function3;", "", "isSweepChecked", "isSlipChecked", "Ljava/util/UUID;", "selectedPlanId", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsDuxo;", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsDuxo;Landroidx/compose/runtime/Composer;II)V", "makeDisclaimer", "", "dynamicDisclaimerMarkdowns", "", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeExtraAgreementsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeExtraAgreementsComposable$lambda$12(ApiGoldUpgradeFlow.ApiGoldExtraAgreements apiGoldExtraAgreements, Function1 function1, Function3 function3, Modifier modifier, LegacyGoldUpgradeExtraAgreementsDuxo legacyGoldUpgradeExtraAgreementsDuxo, int i, int i2, Composer composer, int i3) {
        GoldUpgradeExtraAgreementsComposable(apiGoldExtraAgreements, function1, function3, modifier, legacyGoldUpgradeExtraAgreementsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUpgradeExtraAgreementsComposable(final ApiGoldUpgradeFlow.ApiGoldExtraAgreements agreements, final Function1<? super ApiGoldSweepAgreement, Unit> onClickFullAgreement, final Function3<? super Boolean, ? super Boolean, ? super UUID, Unit> onClickCta, Modifier modifier, LegacyGoldUpgradeExtraAgreementsDuxo legacyGoldUpgradeExtraAgreementsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LegacyGoldUpgradeExtraAgreementsDuxo legacyGoldUpgradeExtraAgreementsDuxo2;
        int i4;
        Modifier modifier3;
        LegacyGoldUpgradeExtraAgreementsDuxo legacyGoldUpgradeExtraAgreementsDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        int i5;
        Object objRememberedValue3;
        final LegacyGoldUpgradeExtraAgreementsDuxo legacyGoldUpgradeExtraAgreementsDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Intrinsics.checkNotNullParameter(onClickFullAgreement, "onClickFullAgreement");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(1033233074);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(agreements) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickFullAgreement) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickCta) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    legacyGoldUpgradeExtraAgreementsDuxo2 = legacyGoldUpgradeExtraAgreementsDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(legacyGoldUpgradeExtraAgreementsDuxo2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    legacyGoldUpgradeExtraAgreementsDuxo2 = legacyGoldUpgradeExtraAgreementsDuxo;
                }
                i3 |= i7;
            } else {
                legacyGoldUpgradeExtraAgreementsDuxo2 = legacyGoldUpgradeExtraAgreementsDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LegacyGoldUpgradeExtraAgreementsDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 &= -57345;
                        modifier3 = modifier4;
                        legacyGoldUpgradeExtraAgreementsDuxo3 = (LegacyGoldUpgradeExtraAgreementsDuxo) baseDuxo;
                    } else {
                        i4 = 0;
                        modifier3 = modifier4;
                        legacyGoldUpgradeExtraAgreementsDuxo3 = legacyGoldUpgradeExtraAgreementsDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                    legacyGoldUpgradeExtraAgreementsDuxo3 = legacyGoldUpgradeExtraAgreementsDuxo2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1033233074, i3, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeExtraAgreementsComposable (LegacyGoldUpgradeExtraAgreementsComposable.kt:42)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(legacyGoldUpgradeExtraAgreementsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object[] objArr = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(agreements);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$2$lambda$1(agreements);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                Object[] objArr2 = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(agreements);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$6$lambda$5(agreements);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                Spanned spannedRememberMarkdown = Markdown3.rememberMarkdown(agreements.getGoldDescriptionMarkdown(), composerStartRestartGroup, i4);
                String goldDescriptionCta = agreements.getGoldDescriptionCta();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                i5 = ((i3 & 112) != 32 ? 1 : i4) | (composerStartRestartGroup.changedInstance(agreements) ? 1 : 0);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (i5 == 0 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeExtraAgreementsComposable.m2053xd8afa4c5(onClickFullAgreement, agreements);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Spanned spannedRememberDescription = LegacyGoldUpgradeAgreementsComposable.rememberDescription(spannedRememberMarkdown, goldDescriptionCta, (Function0) objRememberedValue3, composerStartRestartGroup, i4);
                modifier2 = modifier3;
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier2, false, ComposableLambda3.rememberComposableLambda(1996543432, true, new LegacyGoldUpgradeExtraAgreementsComposable2(agreements, onClickCta, snapshotState, snapshotState2, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(94618043, true, new LegacyGoldUpgradeExtraAgreementsComposable3(agreements, spannedRememberDescription, onClickFullAgreement, snapshotState, snapshotState2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                legacyGoldUpgradeExtraAgreementsDuxo4 = legacyGoldUpgradeExtraAgreementsDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                legacyGoldUpgradeExtraAgreementsDuxo4 = legacyGoldUpgradeExtraAgreementsDuxo2;
            }
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$12(agreements, onClickFullAgreement, onClickCta, modifier5, legacyGoldUpgradeExtraAgreementsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(legacyGoldUpgradeExtraAgreementsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object[] objArr3 = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(agreements);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$2$lambda$1(agreements);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                    Object[] objArr22 = new Object[i4];
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(agreements);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$6$lambda$5(agreements);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState snapshotState22 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                        Spanned spannedRememberMarkdown2 = Markdown3.rememberMarkdown(agreements.getGoldDescriptionMarkdown(), composerStartRestartGroup, i4);
                        String goldDescriptionCta2 = agreements.getGoldDescriptionCta();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        i5 = ((i3 & 112) != 32 ? 1 : i4) | (composerStartRestartGroup.changedInstance(agreements) ? 1 : 0);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (i5 == 0) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LegacyGoldUpgradeExtraAgreementsComposable.m2053xd8afa4c5(onClickFullAgreement, agreements);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            Spanned spannedRememberDescription2 = LegacyGoldUpgradeAgreementsComposable.rememberDescription(spannedRememberMarkdown2, goldDescriptionCta2, (Function0) objRememberedValue3, composerStartRestartGroup, i4);
                            modifier2 = modifier3;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier2, false, ComposableLambda3.rememberComposableLambda(1996543432, true, new LegacyGoldUpgradeExtraAgreementsComposable2(agreements, onClickCta, snapshotState3, snapshotState22, snapshotState4CollectAsStateWithLifecycle2), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(94618043, true, new LegacyGoldUpgradeExtraAgreementsComposable3(agreements, spannedRememberDescription2, onClickFullAgreement, snapshotState3, snapshotState22), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 3456, 2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            legacyGoldUpgradeExtraAgreementsDuxo4 = legacyGoldUpgradeExtraAgreementsDuxo3;
                        }
                    }
                }
            }
        }
        final Modifier modifier52 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$2$lambda$1(ApiGoldUpgradeFlow.ApiGoldExtraAgreements apiGoldExtraAgreements) {
        return SnapshotState3.mutableStateOf$default(Boolean.valueOf(apiGoldExtraAgreements.getGoldSweepConfig() != null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$6$lambda$5(ApiGoldUpgradeFlow.ApiGoldExtraAgreements apiGoldExtraAgreements) {
        ApiGoldUpgradeFlow.ApiGoldExtraAgreements.ApiGoldSlipConfig goldSlipConfig = apiGoldExtraAgreements.getGoldSlipConfig();
        return SnapshotState3.mutableStateOf$default(Boolean.valueOf(goldSlipConfig != null ? goldSlipConfig.getCheckedByDefault() : false), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$10$lambda$9 */
    public static final Unit m2053xd8afa4c5(Function1 function1, ApiGoldUpgradeFlow.ApiGoldExtraAgreements apiGoldExtraAgreements) {
        function1.invoke(apiGoldExtraAgreements.getGoldFullAgreement());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyGoldUpgradeExtraAgreementsViewState GoldUpgradeExtraAgreementsComposable$lambda$0(SnapshotState4<LegacyGoldUpgradeExtraAgreementsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    public static final String makeDisclaimer(boolean z, boolean z2, Map<String, String> dynamicDisclaimerMarkdowns) {
        Intrinsics.checkNotNullParameter(dynamicDisclaimerMarkdowns, "dynamicDisclaimerMarkdowns");
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("sweep");
        }
        if (z2) {
            arrayList.add("slip");
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        String str = dynamicDisclaimerMarkdowns.get(strJoinToString$default);
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(("No disclaimer found for key " + strJoinToString$default).toString());
    }
}
