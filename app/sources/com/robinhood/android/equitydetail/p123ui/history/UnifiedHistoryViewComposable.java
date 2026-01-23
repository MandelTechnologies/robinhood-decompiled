package com.robinhood.android.equitydetail.p123ui.history;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
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
import androidx.compose.runtime.SnapshotStateKt;
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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.HistoryRow4;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.history.UnifiedHistoryViewV2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.Job;

/* compiled from: UnifiedHistoryViewComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \u001aC\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016X\u008a\u0084\u0002"}, m3636d2 = {"HistoryRowTestTag", "", "getHistoryRowTestTag$annotations", "()V", "UnifiedHistoryViewComposable", "", "instrumentId", "Ljava/util/UUID;", "accountNumber", "historyType", "Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryType;", "callbacks", "Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryViewV2$Callbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryComposableDuxo;", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryType;Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryViewV2$Callbacks;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryComposableDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-equity-detail_externalDebug", "viewState", "Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryViewState;", "historyIds", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class UnifiedHistoryViewComposable {
    public static final String HistoryRowTestTag = "stock_detail_history_row";

    /* compiled from: UnifiedHistoryViewComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UnifiedHistoryType.values().length];
            try {
                iArr[UnifiedHistoryType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnifiedHistoryType.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedHistoryViewComposable$lambda$14(UUID uuid, String str, UnifiedHistoryType unifiedHistoryType, UnifiedHistoryViewV2.Callbacks callbacks, Modifier modifier, UnifiedHistoryComposableDuxo unifiedHistoryComposableDuxo, int i, int i2, Composer composer, int i3) {
        UnifiedHistoryViewComposable(uuid, str, unifiedHistoryType, callbacks, modifier, unifiedHistoryComposableDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getHistoryRowTestTag$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnifiedHistoryViewComposable(final UUID instrumentId, final String accountNumber, final UnifiedHistoryType historyType, final UnifiedHistoryViewV2.Callbacks callbacks, Modifier modifier, UnifiedHistoryComposableDuxo unifiedHistoryComposableDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        UnifiedHistoryComposableDuxo unifiedHistoryComposableDuxo2;
        int i4;
        int i5;
        Modifier modifier3;
        final UnifiedHistoryComposableDuxo unifiedHistoryComposableDuxo3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        boolean zChanged;
        Object objRememberedValue;
        int i6;
        int i7;
        int i8;
        Object objRememberedValue2;
        int i9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(historyType, "historyType");
        Composer composerStartRestartGroup = composer.startRestartGroup(1041072212);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(accountNumber) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(historyType.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 2048 : 1024;
        }
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    unifiedHistoryComposableDuxo2 = unifiedHistoryComposableDuxo;
                    int i11 = composerStartRestartGroup.changedInstance(unifiedHistoryComposableDuxo2) ? 131072 : 65536;
                    i3 |= i11;
                } else {
                    unifiedHistoryComposableDuxo2 = unifiedHistoryComposableDuxo;
                }
                i3 |= i11;
            } else {
                unifiedHistoryComposableDuxo2 = unifiedHistoryComposableDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        String str = instrumentId + "-" + accountNumber + "-" + historyType;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(UnifiedHistoryComposableDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt$UnifiedHistoryViewComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt$UnifiedHistoryViewComposable$$inlined$duxo$1.1
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
                        UnifiedHistoryComposableDuxo unifiedHistoryComposableDuxo4 = (UnifiedHistoryComposableDuxo) baseDuxo;
                        i5 = i3 & (-458753);
                        modifier3 = modifier4;
                        unifiedHistoryComposableDuxo3 = unifiedHistoryComposableDuxo4;
                    } else {
                        i4 = 0;
                        i5 = i3;
                        modifier3 = modifier4;
                        unifiedHistoryComposableDuxo3 = unifiedHistoryComposableDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    unifiedHistoryComposableDuxo3 = unifiedHistoryComposableDuxo2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1041072212, i5, -1, "com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposable (UnifiedHistoryViewComposable.kt:39)");
                }
                int i12 = i5;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(unifiedHistoryComposableDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object historyEvents = UnifiedHistoryViewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHistoryEvents();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(historyEvents);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UnifiedHistoryViewComposable.UnifiedHistoryViewComposable$lambda$3$lambda$2(snapshotState4CollectAsStateWithLifecycle);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startMovableGroup(-256964001, UnifiedHistoryViewComposable$lambda$4((SnapshotState4) objRememberedValue));
                if (UnifiedHistoryViewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHistoryEvents().isEmpty()) {
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i4);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i13 = BentoTheme.$stable;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i13).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i13).m21593getSmallD9Ej5fM(), 5, null), 0.0f, composerStartRestartGroup, 0, 1);
                    int i14 = WhenMappings.$EnumSwitchMapping$0[historyType.ordinal()];
                    if (i14 == 1) {
                        i9 = C15314R.string.instrument_detail_history_label;
                    } else {
                        if (i14 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i9 = C15314R.string.instrument_detail_upcoming_activity_label;
                    }
                    String strStringResource = StringResources_androidKt.stringResource(i9, composerStartRestartGroup, 0);
                    TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i13).getDisplayCapsuleMedium();
                    Composer composer2 = composerStartRestartGroup;
                    i7 = 1;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8188);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.startReplaceGroup(-1375887573);
                    for (StatefulHistoryEvent<HistoryEvent> statefulHistoryEvent : UnifiedHistoryViewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHistoryEvents()) {
                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, HistoryRowTestTag);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return UnifiedHistoryViewComposable.m1980xd4f45ff1((SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer3 = composerStartRestartGroup;
                        HistoryRow4.HistoryRow(statefulHistoryEvent, SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue4, 1, null), false, false, null, null, composer3, 0, 60);
                        composerStartRestartGroup = composer3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1375876987);
                    if (UnifiedHistoryViewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDisplayShowAll()) {
                        Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM());
                        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_show_all, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object[] objArr = (i12 & 7168) == 2048 || ((i12 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objArr != false || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UnifiedHistoryViewComposable.UnifiedHistoryViewComposable$lambda$10$lambda$9$lambda$8(callbacks);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer4 = composerStartRestartGroup;
                        i6 = 0;
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue5, strStringResource2, modifierM5142padding3ABfNKs, null, null, false, null, composer4, 0, 120);
                        composerStartRestartGroup = composer4;
                    } else {
                        i6 = 0;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                } else {
                    i6 = i4;
                    i7 = 1;
                }
                composerStartRestartGroup.endMovableGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                i8 = (composerStartRestartGroup.changedInstance(unifiedHistoryComposableDuxo3) ? 1 : 0) | (composerStartRestartGroup.changedInstance(instrumentId) ? 1 : 0) | ((i12 & 112) != 32 ? i7 : i6) | ((i12 & 896) != 256 ? i7 : i6);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i8 == 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return UnifiedHistoryViewComposable.UnifiedHistoryViewComposable$lambda$13$lambda$12(unifiedHistoryComposableDuxo3, instrumentId, accountNumber, historyType, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = modifier3;
                unifiedHistoryComposableDuxo2 = unifiedHistoryComposableDuxo3;
                LifecycleEffectKt.LifecycleResumeEffect(instrumentId, accountNumber, historyType, null, (Function1) objRememberedValue2, composerStartRestartGroup, i12 & 1022, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final Modifier modifier5 = modifier2;
            final UnifiedHistoryComposableDuxo unifiedHistoryComposableDuxo5 = unifiedHistoryComposableDuxo2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UnifiedHistoryViewComposable.UnifiedHistoryViewComposable$lambda$14(instrumentId, accountNumber, historyType, callbacks, modifier5, unifiedHistoryComposableDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i122 = i5;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(unifiedHistoryComposableDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object historyEvents2 = UnifiedHistoryViewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHistoryEvents();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(historyEvents2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UnifiedHistoryViewComposable.UnifiedHistoryViewComposable$lambda$3$lambda$2(snapshotState4CollectAsStateWithLifecycle);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startMovableGroup(-256964001, UnifiedHistoryViewComposable$lambda$4((SnapshotState4) objRememberedValue));
                    if (UnifiedHistoryViewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHistoryEvents().isEmpty()) {
                    }
                    composerStartRestartGroup.endMovableGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    i8 = (composerStartRestartGroup.changedInstance(unifiedHistoryComposableDuxo3) ? 1 : 0) | (composerStartRestartGroup.changedInstance(instrumentId) ? 1 : 0) | ((i122 & 112) != 32 ? i7 : i6) | ((i122 & 896) != 256 ? i7 : i6);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (i8 == 0) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return UnifiedHistoryViewComposable.UnifiedHistoryViewComposable$lambda$13$lambda$12(unifiedHistoryComposableDuxo3, instrumentId, accountNumber, historyType, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        modifier2 = modifier3;
                        unifiedHistoryComposableDuxo2 = unifiedHistoryComposableDuxo3;
                        LifecycleEffectKt.LifecycleResumeEffect(instrumentId, accountNumber, historyType, null, (Function1) objRememberedValue2, composerStartRestartGroup, i122 & 1022, 8);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        final Modifier modifier52 = modifier2;
        final UnifiedHistoryComposableDuxo unifiedHistoryComposableDuxo52 = unifiedHistoryComposableDuxo2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List UnifiedHistoryViewComposable$lambda$3$lambda$2(SnapshotState4 snapshotState4) {
        ImmutableList<StatefulHistoryEvent<HistoryEvent>> historyEvents = UnifiedHistoryViewComposable$lambda$0(snapshotState4).getHistoryEvents();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(historyEvents, 10));
        Iterator<StatefulHistoryEvent<HistoryEvent>> it = historyEvents.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getHistoryEvent().getId());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnifiedHistoryViewComposable$lambda$10$lambda$7$lambda$6$lambda$5 */
    public static final Unit m1980xd4f45ff1(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedHistoryViewComposable$lambda$10$lambda$9$lambda$8(UnifiedHistoryViewV2.Callbacks callbacks) {
        if (callbacks != null) {
            callbacks.onRecentHistoryShowAllClicked();
        }
        return Unit.INSTANCE;
    }

    private static final UnifiedHistoryViewState UnifiedHistoryViewComposable$lambda$0(SnapshotState4<UnifiedHistoryViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult UnifiedHistoryViewComposable$lambda$13$lambda$12(UnifiedHistoryComposableDuxo unifiedHistoryComposableDuxo, UUID uuid, String str, UnifiedHistoryType unifiedHistoryType, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = unifiedHistoryComposableDuxo.bind(uuid, str, unifiedHistoryType);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewComposableKt$UnifiedHistoryViewComposable$lambda$13$lambda$12$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    private static final List<UUID> UnifiedHistoryViewComposable$lambda$4(SnapshotState4<? extends List<UUID>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
