package com.robinhood.android.equitydetail.p123ui.position;

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
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRow4;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRow;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRowType;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.Job;

/* compiled from: PositionSection.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0001¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004¨\u0006\u0017²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002"}, m3636d2 = {"POSITION_HEADER_TEST_TAG", "", "positionsEmptyTestTag", "getPositionsEmptyTestTag$annotations", "()V", "PositionSection", "", "accountNumber", "instrumentId", "Ljava/util/UUID;", "positionSectionDuxo", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDuxo;", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDuxo;Landroidx/compose/runtime/Composer;II)V", "PositionsEmpty", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PositionSectionComposable", "viewState", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionViewState;", "onTooltipAppear", "Lkotlin/Function0;", "(Lcom/robinhood/android/equitydetail/ui/position/PositionSectionViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-equity-detail_externalDebug", "showTooltip", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PositionSectionKt {
    private static final String POSITION_HEADER_TEST_TAG = "%s:id/position_header";
    public static final String positionsEmptyTestTag = "PositionEmpty";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionSection$lambda$6(String str, UUID uuid, PositionSectionDuxo positionSectionDuxo, int i, int i2, Composer composer, int i3) {
        PositionSection(str, uuid, positionSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionSectionComposable$lambda$14(PositionSectionViewState positionSectionViewState, Function0 function0, int i, Composer composer, int i2) {
        PositionSectionComposable(positionSectionViewState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionsEmpty$lambda$7(Modifier modifier, int i, int i2, Composer composer, int i3) {
        PositionsEmpty(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPositionsEmptyTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PositionSection(final String accountNumber, final UUID instrumentId, PositionSectionDuxo positionSectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        PositionSectionDuxo positionSectionDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        boolean z;
        final PositionSectionDuxo positionSectionDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final PositionSectionDuxo positionSectionDuxo4;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-254529645);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(instrumentId) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                positionSectionDuxo2 = positionSectionDuxo;
                int i4 = composerStartRestartGroup.changedInstance(positionSectionDuxo2) ? 256 : 128;
                i3 |= i4;
            } else {
                positionSectionDuxo2 = positionSectionDuxo;
            }
            i3 |= i4;
        } else {
            positionSectionDuxo2 = positionSectionDuxo;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    String str = accountNumber + "_" + instrumentId + "_PositionSection";
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
                    z = false;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PositionSectionDuxo.class), current, str, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$PositionSection$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$PositionSection$$inlined$duxo$1.1
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
                    positionSectionDuxo2 = (PositionSectionDuxo) baseDuxo;
                    i3 &= -897;
                }
                positionSectionDuxo3 = positionSectionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-254529645, i3, -1, "com.robinhood.android.equitydetail.ui.position.PositionSection (PositionSection.kt:53)");
                }
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(positionSectionDuxo3) | ((i3 & 14) == 4 ? true : z) | composerStartRestartGroup.changedInstance(instrumentId);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PositionSectionKt.PositionSection$lambda$2$lambda$1(positionSectionDuxo3, accountNumber, instrumentId, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                boolean z2 = z;
                LifecycleEffectKt.LifecycleResumeEffect(accountNumber, instrumentId, lifecycleOwner, (Function1) objRememberedValue, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                PositionSectionViewState positionSectionViewStatePositionSection$lambda$3 = PositionSection$lambda$3(FlowExtKt.collectAsStateWithLifecycle(positionSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(positionSectionDuxo3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PositionSectionKt.PositionSection$lambda$5$lambda$4(positionSectionDuxo3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                PositionSectionComposable(positionSectionViewStatePositionSection$lambda$3, (Function0) objRememberedValue2, composerStartRestartGroup, z2 ? 1 : 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                positionSectionDuxo4 = positionSectionDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    positionSectionDuxo3 = positionSectionDuxo2;
                    z = false;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(positionSectionDuxo3) | ((i3 & 14) == 4 ? true : z) | composerStartRestartGroup.changedInstance(instrumentId);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PositionSectionKt.PositionSection$lambda$2$lambda$1(positionSectionDuxo3, accountNumber, instrumentId, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z22 = z;
                        LifecycleEffectKt.LifecycleResumeEffect(accountNumber, instrumentId, lifecycleOwner2, (Function1) objRememberedValue, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                        PositionSectionViewState positionSectionViewStatePositionSection$lambda$32 = PositionSection$lambda$3(FlowExtKt.collectAsStateWithLifecycle(positionSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(positionSectionDuxo3);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PositionSectionKt.PositionSection$lambda$5$lambda$4(positionSectionDuxo3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            PositionSectionComposable(positionSectionViewStatePositionSection$lambda$32, (Function0) objRememberedValue2, composerStartRestartGroup, z22 ? 1 : 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            positionSectionDuxo4 = positionSectionDuxo3;
                        }
                    }
                }
            }
            z = false;
            positionSectionDuxo3 = positionSectionDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(positionSectionDuxo3) | ((i3 & 14) == 4 ? true : z) | composerStartRestartGroup.changedInstance(instrumentId);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            positionSectionDuxo4 = positionSectionDuxo2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PositionSectionKt.PositionSection$lambda$6(accountNumber, instrumentId, positionSectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult PositionSection$lambda$2$lambda$1(PositionSectionDuxo positionSectionDuxo, String str, UUID uuid, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = positionSectionDuxo.bind(str, uuid);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$PositionSection$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionSection$lambda$5$lambda$4(PositionSectionDuxo positionSectionDuxo) {
        positionSectionDuxo.disableAverageCostTooltip();
        return Unit.INSTANCE;
    }

    private static final void PositionsEmpty(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1546483635);
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
                ComposerKt.traceEventStart(-1546483635, i3, -1, "com.robinhood.android.equitydetail.ui.position.PositionsEmpty (PositionSection.kt:78)");
            }
            Spacer2.Spacer(TestTag3.testTag(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(modifier, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null), null, false, 3, null), positionsEmptyTestTag), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PositionSectionKt.PositionsEmpty$lambda$7(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final PositionSectionViewState PositionSection$lambda$3(SnapshotState4<PositionSectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean PositionSectionComposable$lambda$9(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue();
    }

    public static final void PositionSectionComposable(final PositionSectionViewState viewState, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> onTooltipAppear = function0;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onTooltipAppear, "onTooltipAppear");
        Composer composerStartRestartGroup = composer.startRestartGroup(1297156168);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTooltipAppear) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1297156168, i2, -1, "com.robinhood.android.equitydetail.ui.position.PositionSectionComposable (PositionSection.kt:93)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(viewState.getShowAverageCostTooltip(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (viewState.getDataRows() == null) {
                composerStartRestartGroup.startReplaceGroup(1758981018);
                PositionsEmpty(null, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1759091254);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), null, 2, null), null, false, 3, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 5, null), 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1);
                String str = String.format(POSITION_HEADER_TEST_TAG, Arrays.copyOf(new Object[]{context.getPackageName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                Modifier modifierTestTag = TestTag3.testTag(modifierM21623defaultHorizontalPaddingrAjV9yQ, str);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PositionSectionKt.PositionSectionComposable$lambda$13$lambda$12$lambda$11((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15314R.string.instrument_detail_positions_label, composerStartRestartGroup, 0), SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue2, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                Screen screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                SdpDataRow.m13861EvenlyWeightedSdpDataGridoilTxCY(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1), viewState.getDataRows(), 0, null, extensions2.persistentMapOf(Tuples4.m3642to(SdpDataRowType.PositionAverageCostV2, new PositionSectionKt$PositionSectionComposable$1$2(screen, function0, snapshotState))), composerStartRestartGroup, 0, 12);
                onTooltipAppear = function0;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                UnifiedAccountV2 unifiedAccountV2 = viewState.getUnifiedAccountV2();
                InfoBannerComponent.InfoBannerComponent(unifiedAccountV2 != null ? unifiedAccountV2.getAccountNumber() : null, IacInfoBannerLocation.INFO_BANNER_STOCK_DETAIL_PAGE_BELOW_POSITION_SECTION, modifierM5146paddingqDBjuR0$default, viewState.getInstrumentId(), null, null, null, null, null, null, null, null, null, composerStartRestartGroup, 48, 0, 8176);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(945546334);
                if (viewState.getInstrumentId() != null) {
                    EquityProxyVotingRow4.EquityProxyVotingRow(viewState.getInstrumentId(), screen, null, null, composerStartRestartGroup, 0, 12);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PositionSectionKt.PositionSectionComposable$lambda$14(viewState, onTooltipAppear, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionSectionComposable$lambda$13$lambda$12$lambda$11(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }
}
