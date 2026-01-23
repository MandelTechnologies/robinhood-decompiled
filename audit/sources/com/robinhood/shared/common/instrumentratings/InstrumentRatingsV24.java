package com.robinhood.shared.common.instrumentratings;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Duxo4;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingDialog;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposable;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposableState;
import com.robinhood.shared.equities.models.instrumentdetails.api.RatingType;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: InstrumentRatingsV2.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000b\u001a\b\u0010\f\u001a\u00020\nH\u0001\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u008e\u0002"}, m3636d2 = {"InstrumentRatingsV2", "", "instrumentUuid", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2Duxo;", "(Ljava/util/UUID;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2Duxo;Landroidx/compose/runtime/Composer;II)V", "state", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;", "(Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "buildState", "InstrumentRatingsV2Preview", "(Landroidx/compose/runtime/Composer;I)V", "lib-instrument-ratings_externalDebug", "viewState", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2ViewState;", "dialogContent", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$AnalystRating;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt, reason: use source file name */
/* loaded from: classes26.dex */
public final class InstrumentRatingsV24 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRatingsV2$lambda$14(AnalystRatingsComposableState analystRatingsComposableState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InstrumentRatingsV2(analystRatingsComposableState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRatingsV2$lambda$4(UUID uuid, Modifier modifier, InstrumentRatingsV2Duxo instrumentRatingsV2Duxo, int i, int i2, Composer composer, int i3) {
        InstrumentRatingsV2(uuid, modifier, instrumentRatingsV2Duxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRatingsV2$lambda$5(UUID uuid, Modifier modifier, InstrumentRatingsV2Duxo instrumentRatingsV2Duxo, int i, int i2, Composer composer, int i3) {
        InstrumentRatingsV2(uuid, modifier, instrumentRatingsV2Duxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRatingsV2Preview$lambda$15(int i, Composer composer, int i2) {
        InstrumentRatingsV2Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstrumentRatingsV2(final UUID instrumentUuid, Modifier modifier, InstrumentRatingsV2Duxo instrumentRatingsV2Duxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        InstrumentRatingsV2Duxo instrumentRatingsV2Duxo2;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        int i4;
        final Modifier modifier4;
        final InstrumentRatingsV2Duxo instrumentRatingsV2Duxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        InstrumentRatingsV2Duxo4 instrumentRatingsV2Duxo4InstrumentRatingsV2$lambda$3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        Composer composerStartRestartGroup = composer.startRestartGroup(649699431);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentUuid) ? 4 : 2) | i;
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
                    instrumentRatingsV2Duxo2 = instrumentRatingsV2Duxo;
                    int i6 = composerStartRestartGroup.changedInstance(instrumentRatingsV2Duxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    instrumentRatingsV2Duxo2 = instrumentRatingsV2Duxo;
                }
                i3 |= i6;
            } else {
                instrumentRatingsV2Duxo2 = instrumentRatingsV2Duxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        String str = instrumentUuid + "_InstrumentRatingsV2";
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InstrumentRatingsV2Duxo.class), current, str, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt$InstrumentRatingsV2$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt$InstrumentRatingsV2$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        InstrumentRatingsV2Duxo instrumentRatingsV2Duxo4 = (InstrumentRatingsV2Duxo) baseDuxo;
                        i4 = i3 & (-897);
                        modifier4 = modifier3;
                        instrumentRatingsV2Duxo3 = instrumentRatingsV2Duxo4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(649699431, i4, -1, "com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2 (InstrumentRatingsV2.kt:34)");
                    }
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(instrumentRatingsV2Duxo3) | composerStartRestartGroup.changedInstance(instrumentUuid);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return InstrumentRatingsV24.InstrumentRatingsV2$lambda$2$lambda$1(instrumentRatingsV2Duxo3, instrumentUuid, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(unit, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, 6, 2);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(instrumentRatingsV2Duxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    instrumentRatingsV2Duxo4InstrumentRatingsV2$lambda$3 = InstrumentRatingsV2$lambda$3(snapshotState4CollectAsStateWithLifecycle);
                    if (!(instrumentRatingsV2Duxo4InstrumentRatingsV2$lambda$3 instanceof InstrumentRatingsV2Duxo4.Loading)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup2 != null) {
                            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return InstrumentRatingsV24.InstrumentRatingsV2$lambda$4(instrumentUuid, modifier4, instrumentRatingsV2Duxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!(instrumentRatingsV2Duxo4InstrumentRatingsV2$lambda$3 instanceof InstrumentRatingsV2Duxo4.Loaded)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InstrumentRatingsV2(((InstrumentRatingsV2Duxo4.Loaded) instrumentRatingsV2Duxo4InstrumentRatingsV2$lambda$3).getRatingsComposableState(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, AnalystRatingsComposableState.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                modifier4 = modifier3;
                instrumentRatingsV2Duxo3 = instrumentRatingsV2Duxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(instrumentRatingsV2Duxo3) | composerStartRestartGroup.changedInstance(instrumentUuid);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InstrumentRatingsV24.InstrumentRatingsV2$lambda$2$lambda$1(instrumentRatingsV2Duxo3, instrumentUuid, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(unit2, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, 6, 2);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(instrumentRatingsV2Duxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    instrumentRatingsV2Duxo4InstrumentRatingsV2$lambda$3 = InstrumentRatingsV2$lambda$3(snapshotState4CollectAsStateWithLifecycle2);
                    if (!(instrumentRatingsV2Duxo4InstrumentRatingsV2$lambda$3 instanceof InstrumentRatingsV2Duxo4.Loading)) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                instrumentRatingsV2Duxo3 = instrumentRatingsV2Duxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstrumentRatingsV24.InstrumentRatingsV2$lambda$5(instrumentUuid, modifier4, instrumentRatingsV2Duxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                    modifier4 = modifier3;
                    instrumentRatingsV2Duxo3 = instrumentRatingsV2Duxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Unit unit22 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(instrumentRatingsV2Duxo3) | composerStartRestartGroup.changedInstance(instrumentUuid);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult InstrumentRatingsV2$lambda$2$lambda$1(InstrumentRatingsV2Duxo instrumentRatingsV2Duxo, UUID uuid, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = instrumentRatingsV2Duxo.bind(uuid);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt$InstrumentRatingsV2$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    public static final void InstrumentRatingsV2(AnalystRatingsComposableState state, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final AnalystRatingsComposableState analystRatingsComposableState;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1899122931);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            analystRatingsComposableState = state;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1899122931, i3, -1, "com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2 (InstrumentRatingsV2.kt:60)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InstrumentRatingsV24.InstrumentRatingsV2$lambda$10$lambda$9(snapshotState, (AnalystRatingsComposableState.AnalystRating) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            analystRatingsComposableState = state;
            AnalystRatingsComposable.AnalystRatingsComposable(analystRatingsComposableState, (Function1) objRememberedValue2, modifier2, composerStartRestartGroup, AnalystRatingsComposableState.$stable | 48 | (i3 & 14) | ((i3 << 3) & 896), 0);
            AnalystRatingsComposableState.AnalystRating analystRatingInstrumentRatingsV2$lambda$7 = InstrumentRatingsV2$lambda$7(snapshotState);
            if (analystRatingInstrumentRatingsV2$lambda$7 != null) {
                StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C11048R.string.general_label_close, new Object[0]);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InstrumentRatingsV24.InstrumentRatingsV2$lambda$13$lambda$12$lambda$11(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnalystRatingDialog.AnalystRatingDialog(analystRatingInstrumentRatingsV2$lambda$7, stringResourceInvoke, (Function0) objRememberedValue3, composerStartRestartGroup, AnalystRatingsComposableState.AnalystRating.$stable | 384 | (StringResource.$stable << 3));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentRatingsV24.InstrumentRatingsV2$lambda$14(analystRatingsComposableState, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRatingsV2$lambda$10$lambda$9(SnapshotState snapshotState, AnalystRatingsComposableState.AnalystRating rating) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        snapshotState.setValue(rating);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRatingsV2$lambda$13$lambda$12$lambda$11(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    public static final AnalystRatingsComposableState buildState() {
        StringResource.Companion companion = StringResource.INSTANCE;
        return new AnalystRatingsComposableState(companion.invoke(C37466R.string.instrument_ratings_rating_show_more, new Object[0]), new AnalystRatingsComposableState.RatingSummary("70%", 0.7f, companion.invoke("Buy"), "70%", 0.1f, companion.invoke("Hold"), "10%", 0.2f, companion.invoke("Sell"), "20%"), extensions2.toImmutableList(CollectionsKt.listOf((Object[]) new AnalystRatingsComposableState.AnalystRating[]{new AnalystRatingsComposableState.AnalystRating(companion.invoke("Bulls say"), companion.invoke("Published on Nov 1, 2024"), companion.invoke("Morningstar"), companion.invoke("\"Apple has a stellar balance sheet and sends great amounts of cash flow back to shareholders.\n\nWe like Apple's move to in-house chip development, which we think has accelerated its product development and increased it differentiation.\""), RatingType.BUY), new AnalystRatingsComposableState.AnalystRating(companion.invoke("Bears say"), companion.invoke("Published on Nov 1, 2024"), companion.invoke("Morningstar"), companion.invoke("\"Apple has a stellar balance sheet and sends great amounts of cash flow back to shareholders.\n\nWe don't like Apple's move to in-house chip development, which we think has accelerated its product development and increased it differentiation.\""), RatingType.SELL)})));
    }

    private static final InstrumentRatingsV2Duxo4 InstrumentRatingsV2$lambda$3(SnapshotState4<? extends InstrumentRatingsV2Duxo4> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final AnalystRatingsComposableState.AnalystRating InstrumentRatingsV2$lambda$7(SnapshotState<AnalystRatingsComposableState.AnalystRating> snapshotState) {
        return snapshotState.getValue();
    }

    @DayNightPreview
    private static final void InstrumentRatingsV2Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(254957486);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(254957486, i, -1, "com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Preview (InstrumentRatingsV2.kt:124)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), InstrumentRatingsV2.INSTANCE.getLambda$2090285806$lib_instrument_ratings_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Kt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentRatingsV24.InstrumentRatingsV2Preview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
