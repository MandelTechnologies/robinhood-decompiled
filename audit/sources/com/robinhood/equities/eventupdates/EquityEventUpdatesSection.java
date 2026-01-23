package com.robinhood.equities.eventupdates;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.equities.contracts.EquityEventUpdatesKey;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.arsenal.proto.p281v1.idl.EquityEventUpdateDto;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.equities.eventupdates.EquityEventUpdatesSectionDuxo5;
import java.util.Iterator;
import java.util.UUID;
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
import kotlinx.coroutines.Job;
import p479j$.time.ZoneId;

/* compiled from: EquityEventUpdatesSection.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, m3636d2 = {"Ljava/util/UUID;", "instrumentId", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesSectionDuxo;", "duxo", "j$/time/ZoneId", "zoneId", "", "EquityEventUpdatesSection", "(Ljava/util/UUID;Landroidx/compose/ui/Modifier;Lcom/robinhood/equities/eventupdates/EquityEventUpdatesSectionDuxo;Lj$/time/ZoneId;Landroidx/compose/runtime/Composer;II)V", "EquityEventUpdatesHeader", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState;", "viewState", "lib-equity-event-updates_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class EquityEventUpdatesSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityEventUpdatesHeader$lambda$11(Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityEventUpdatesHeader(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityEventUpdatesSection$lambda$10(UUID uuid, Modifier modifier, EquityEventUpdatesSectionDuxo equityEventUpdatesSectionDuxo, ZoneId zoneId, int i, int i2, Composer composer, int i3) {
        EquityEventUpdatesSection(uuid, modifier, equityEventUpdatesSectionDuxo, zoneId, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityEventUpdatesSection$lambda$9$lambda$4(UUID uuid, Modifier modifier, EquityEventUpdatesSectionDuxo equityEventUpdatesSectionDuxo, ZoneId zoneId, int i, int i2, Composer composer, int i3) {
        EquityEventUpdatesSection(uuid, modifier, equityEventUpdatesSectionDuxo, zoneId, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityEventUpdatesSection(final UUID instrumentId, Modifier modifier, EquityEventUpdatesSectionDuxo equityEventUpdatesSectionDuxo, ZoneId zoneId, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        EquityEventUpdatesSectionDuxo equityEventUpdatesSectionDuxo2;
        ZoneId zoneId2;
        int i4;
        int i5;
        ZoneId zoneIdSystemDefault;
        int i6;
        Modifier modifier3;
        final EquityEventUpdatesSectionDuxo equityEventUpdatesSectionDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final UUID uuid;
        ZoneId zoneId3;
        final EquityEventUpdatesSectionDuxo equityEventUpdatesSectionDuxo4;
        final Modifier modifier4;
        final ZoneId zoneId4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1326647801);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentId) ? 4 : 2) | i;
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
                    equityEventUpdatesSectionDuxo2 = equityEventUpdatesSectionDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(equityEventUpdatesSectionDuxo2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    equityEventUpdatesSectionDuxo2 = equityEventUpdatesSectionDuxo;
                }
                i3 |= i8;
            } else {
                equityEventUpdatesSectionDuxo2 = equityEventUpdatesSectionDuxo;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    zoneId2 = zoneId;
                    int i9 = composerStartRestartGroup.changedInstance(zoneId2) ? 2048 : 1024;
                    i3 |= i9;
                } else {
                    zoneId2 = zoneId;
                }
                i3 |= i9;
            } else {
                zoneId2 = zoneId;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        String str = instrumentId + "_EquityEventUpdates";
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i5 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EquityEventUpdatesSectionDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionKt$EquityEventUpdatesSection$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionKt$EquityEventUpdatesSection$$inlined$duxo$1.1
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
                        EquityEventUpdatesSectionDuxo equityEventUpdatesSectionDuxo5 = (EquityEventUpdatesSectionDuxo) baseDuxo;
                        i3 &= -897;
                        i4 = -1633490746;
                        equityEventUpdatesSectionDuxo2 = equityEventUpdatesSectionDuxo5;
                    } else {
                        i4 = -1633490746;
                        i5 = 0;
                    }
                    if ((i2 & 8) == 0) {
                        i6 = i3 & (-7169);
                        modifier3 = modifier5;
                        zoneIdSystemDefault = ZoneId.systemDefault();
                    } else {
                        zoneIdSystemDefault = zoneId;
                        i6 = i3;
                        modifier3 = modifier5;
                    }
                    equityEventUpdatesSectionDuxo3 = equityEventUpdatesSectionDuxo2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                    equityEventUpdatesSectionDuxo3 = equityEventUpdatesSectionDuxo2;
                    zoneIdSystemDefault = zoneId2;
                    i4 = -1633490746;
                    i5 = 0;
                    i6 = i3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1326647801, i6, -1, "com.robinhood.equities.eventupdates.EquityEventUpdatesSection (EquityEventUpdatesSection.kt:34)");
                }
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(i4);
                zChangedInstance = composerStartRestartGroup.changedInstance(equityEventUpdatesSectionDuxo3) | composerStartRestartGroup.changedInstance(instrumentId);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EquityEventUpdatesSection.EquityEventUpdatesSection$lambda$2$lambda$1(equityEventUpdatesSectionDuxo3, instrumentId, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(instrumentId, lifecycleOwner, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i6 & 14, 0);
                final EquityEventUpdatesSectionDuxo equityEventUpdatesSectionDuxo6 = equityEventUpdatesSectionDuxo3;
                int i10 = i6;
                int i11 = i5;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(equityEventUpdatesSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i11);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i11);
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
                composerStartRestartGroup.startReplaceGroup(-930954043);
                if (!(EquityEventUpdatesSection$lambda$3(snapshotState4CollectAsStateWithLifecycle) instanceof EquityEventUpdatesSectionDuxo5.Empty)) {
                    composerStartRestartGroup.endToMarker(currentMarker);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier6 = modifier3;
                        final ZoneId zoneId5 = zoneIdSystemDefault;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EquityEventUpdatesSection.EquityEventUpdatesSection$lambda$9$lambda$4(instrumentId, modifier6, equityEventUpdatesSectionDuxo6, zoneId5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                uuid = instrumentId;
                ZoneId zoneId6 = zoneIdSystemDefault;
                EquityEventUpdatesHeader(null, composerStartRestartGroup, i11, 1);
                EquityEventUpdatesSectionDuxo5 equityEventUpdatesSectionDuxo5EquityEventUpdatesSection$lambda$3 = EquityEventUpdatesSection$lambda$3(snapshotState4CollectAsStateWithLifecycle);
                if (Intrinsics.areEqual(equityEventUpdatesSectionDuxo5EquityEventUpdatesSection$lambda$3, EquityEventUpdatesSectionDuxo5.Loading.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(-930789248);
                    for (int i12 = i11; i12 < 3; i12++) {
                        EquityEventUpdateRow.EquityEventUpdatePlaceholderRow(null, composerStartRestartGroup, i11, 1);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    zoneId3 = zoneId6;
                } else if (equityEventUpdatesSectionDuxo5EquityEventUpdatesSection$lambda$3 instanceof EquityEventUpdatesSectionDuxo5.Loaded) {
                    composerStartRestartGroup.startReplaceGroup(-930574015);
                    composerStartRestartGroup.startReplaceGroup(1771097008);
                    EquityEventUpdatesSectionDuxo5.Loaded loaded = (EquityEventUpdatesSectionDuxo5.Loaded) equityEventUpdatesSectionDuxo5EquityEventUpdatesSection$lambda$3;
                    Iterator<EquityEventUpdateDto> it = loaded.getUpdates().iterator();
                    while (it.hasNext()) {
                        int i13 = ((i10 >> 6) & 112) | 384;
                        Composer composer2 = composerStartRestartGroup;
                        ZoneId zoneId7 = zoneId6;
                        EquityEventUpdateRow.EquityEventUpdateRow(it.next(), zoneId7, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, i13, 0);
                        i11 = i11;
                        composerStartRestartGroup = composer2;
                        zoneId6 = zoneId7;
                    }
                    zoneId3 = zoneId6;
                    Composer composer3 = composerStartRestartGroup;
                    int i14 = i11;
                    composer3.endReplaceGroup();
                    if (loaded.getShowMore()) {
                        final Navigator navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                        final Context context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        String strStringResource = StringResources_androidKt.stringResource(C33104R.string.equity_event_updates_more, composer3, i14);
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        composer3.startReplaceGroup(-1746271574);
                        boolean zChangedInstance3 = composer3.changedInstance(navigator) | composer3.changedInstance(context) | composer3.changedInstance(uuid);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EquityEventUpdatesSection.EquityEventUpdatesSection$lambda$9$lambda$8$lambda$7(navigator, context, uuid);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceGroup();
                        composerStartRestartGroup = composer3;
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue3, strStringResource, modifierM5146paddingqDBjuR0$default, null, null, false, null, composerStartRestartGroup, 0, 120);
                    } else {
                        composerStartRestartGroup = composer3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    zoneId3 = zoneId6;
                    if (!Intrinsics.areEqual(equityEventUpdatesSectionDuxo5EquityEventUpdatesSection$lambda$3, EquityEventUpdatesSectionDuxo5.Empty.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(1771088510);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-929504701);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                equityEventUpdatesSectionDuxo4 = equityEventUpdatesSectionDuxo6;
                modifier4 = modifier3;
                zoneId4 = zoneId3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                uuid = instrumentId;
                modifier4 = modifier2;
                equityEventUpdatesSectionDuxo4 = equityEventUpdatesSectionDuxo2;
                zoneId4 = zoneId2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final UUID uuid2 = uuid;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityEventUpdatesSection.EquityEventUpdatesSection$lambda$10(uuid2, modifier4, equityEventUpdatesSectionDuxo4, zoneId4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                equityEventUpdatesSectionDuxo3 = equityEventUpdatesSectionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(i4);
                zChangedInstance = composerStartRestartGroup.changedInstance(equityEventUpdatesSectionDuxo3) | composerStartRestartGroup.changedInstance(instrumentId);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EquityEventUpdatesSection.EquityEventUpdatesSection$lambda$2$lambda$1(equityEventUpdatesSectionDuxo3, instrumentId, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(instrumentId, lifecycleOwner2, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i6 & 14, 0);
                    final EquityEventUpdatesSectionDuxo equityEventUpdatesSectionDuxo62 = equityEventUpdatesSectionDuxo3;
                    int i102 = i6;
                    int i112 = i5;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(equityEventUpdatesSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i112);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i112);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-930954043);
                        if (!(EquityEventUpdatesSection$lambda$3(snapshotState4CollectAsStateWithLifecycle) instanceof EquityEventUpdatesSectionDuxo5.Empty)) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult EquityEventUpdatesSection$lambda$2$lambda$1(EquityEventUpdatesSectionDuxo equityEventUpdatesSectionDuxo, UUID uuid, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = equityEventUpdatesSectionDuxo.bind(uuid);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionKt$EquityEventUpdatesSection$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityEventUpdatesSection$lambda$9$lambda$8$lambda$7(Navigator navigator, Context context, UUID uuid) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new EquityEventUpdatesKey(uuid), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    private static final EquityEventUpdatesSectionDuxo5 EquityEventUpdatesSection$lambda$3(SnapshotState4<? extends EquityEventUpdatesSectionDuxo5> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final void EquityEventUpdatesHeader(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-309675075);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-309675075, i3, -1, "com.robinhood.equities.eventupdates.EquityEventUpdatesHeader (EquityEventUpdatesSection.kt:91)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C33104R.string.equity_event_updates_title, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityEventUpdatesSection.EquityEventUpdatesHeader$lambda$11(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
