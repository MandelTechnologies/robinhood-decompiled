package com.robinhood.android.equitydetail.p123ui.disclosure;

import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.bonfire.InstrumentDisclosure;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.UUID;
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
import kotlinx.coroutines.Job;

/* compiled from: InstrumentDetailDisclosureComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"InstrumentDetailDisclosureComposable", "", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "onOpenLink", "Lkotlin/Function1;", "Landroid/net/Uri;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equitydetail/ui/disclosure/InstrumentDetailDisclosureDuxo;", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equitydetail/ui/disclosure/InstrumentDetailDisclosureDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-equity-detail_externalDebug", "viewState", "Lcom/robinhood/android/equitydetail/ui/disclosure/InstrumentDetailDisclosureViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class InstrumentDetailDisclosureComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentDetailDisclosureComposable$lambda$7(UUID uuid, String str, Function1 function1, Modifier modifier, InstrumentDetailDisclosureDuxo instrumentDetailDisclosureDuxo, int i, int i2, Composer composer, int i3) {
        InstrumentDetailDisclosureComposable(uuid, str, function1, modifier, instrumentDetailDisclosureDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bc  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstrumentDetailDisclosureComposable(final UUID instrumentId, final String accountNumber, final Function1<? super Uri, Unit> onOpenLink, Modifier modifier, InstrumentDetailDisclosureDuxo instrumentDetailDisclosureDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        InstrumentDetailDisclosureDuxo instrumentDetailDisclosureDuxo2;
        Composer composer2;
        ?? r9;
        final InstrumentDetailDisclosureDuxo instrumentDetailDisclosureDuxo3;
        Modifier modifier3;
        Composer composer3;
        boolean zChangedInstance;
        Object objRememberedValue;
        InstrumentDisclosure instrumentDisclosure;
        Modifier modifier4;
        InstrumentDetailDisclosureDuxo instrumentDetailDisclosureDuxo4;
        final InstrumentDetailDisclosureDuxo instrumentDetailDisclosureDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(onOpenLink, "onOpenLink");
        Composer composerStartRestartGroup = composer.startRestartGroup(567496128);
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
            i3 |= composerStartRestartGroup.changedInstance(onOpenLink) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    instrumentDetailDisclosureDuxo2 = instrumentDetailDisclosureDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(instrumentDetailDisclosureDuxo2) ? 16384 : 8192;
                    i3 |= i5;
                } else {
                    instrumentDetailDisclosureDuxo2 = instrumentDetailDisclosureDuxo;
                }
                i3 |= i5;
            } else {
                instrumentDetailDisclosureDuxo2 = instrumentDetailDisclosureDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        String str = instrumentId + "-" + accountNumber;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        r9 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InstrumentDetailDisclosureDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureComposableKt$InstrumentDetailDisclosureComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureComposableKt$InstrumentDetailDisclosureComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                        composer2.endReplaceGroup();
                        i3 &= -57345;
                        modifier3 = modifier5;
                        instrumentDetailDisclosureDuxo3 = (InstrumentDetailDisclosureDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        r9 = 0;
                        instrumentDetailDisclosureDuxo3 = instrumentDetailDisclosureDuxo2;
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    instrumentDetailDisclosureDuxo3 = instrumentDetailDisclosureDuxo2;
                    composer2 = composerStartRestartGroup;
                    r9 = 0;
                    modifier3 = modifier2;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(567496128, i3, -1, "com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureComposable (InstrumentDetailDisclosureComposable.kt:29)");
                }
                Composer composer4 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(instrumentDetailDisclosureDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                composer3.startReplaceGroup(-1746271574);
                zChangedInstance = composer3.changedInstance(instrumentDetailDisclosureDuxo3) | composer3.changedInstance(instrumentId) | ((i3 & 112) != 32 ? true : r9);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InstrumentDetailDisclosureComposable.InstrumentDetailDisclosureComposable$lambda$3$lambda$2(instrumentDetailDisclosureDuxo3, instrumentId, accountNumber, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                int i6 = i3;
                LifecycleEffectKt.LifecycleResumeEffect(instrumentId, accountNumber, null, (Function1) objRememberedValue, composer3, i6 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                instrumentDisclosure = InstrumentDetailDisclosureComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInstrumentDisclosure();
                if (instrumentDisclosure != null) {
                    modifier4 = modifier3;
                    instrumentDetailDisclosureDuxo4 = instrumentDetailDisclosureDuxo3;
                } else {
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifier3, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM());
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, r9);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, r9);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composer3.startReplaceGroup(-780549572);
                    for (RichText richText : instrumentDisclosure.getPreviewList()) {
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Composer composer5 = composer3;
                        GenericRichTextWithAccessibleLinks.m13865GenericRichTextWithAccessibleLinksZVMq8gA(richText, onOpenLink, bentoTheme2.getTypography(composer3, i8).getTextS(), null, bentoTheme2.getColors(composer3, i8).m21426getFg20d7_KjU(), 0L, 0, composer5, (i6 >> 3) & 112, 104);
                        composer3 = composer5;
                        instrumentDetailDisclosureDuxo3 = instrumentDetailDisclosureDuxo3;
                        modifier3 = modifier3;
                    }
                    modifier4 = modifier3;
                    instrumentDetailDisclosureDuxo4 = instrumentDetailDisclosureDuxo3;
                    composer3.endReplaceGroup();
                    composer3.endNode();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                instrumentDetailDisclosureDuxo5 = instrumentDetailDisclosureDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                instrumentDetailDisclosureDuxo5 = instrumentDetailDisclosureDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier6 = modifier4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstrumentDetailDisclosureComposable.InstrumentDetailDisclosureComposable$lambda$7(instrumentId, accountNumber, onOpenLink, modifier6, instrumentDetailDisclosureDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i4 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(instrumentDetailDisclosureDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer3 = composer42;
                composer3.startReplaceGroup(-1746271574);
                zChangedInstance = composer3.changedInstance(instrumentDetailDisclosureDuxo3) | composer3.changedInstance(instrumentId) | ((i3 & 112) != 32 ? true : r9);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InstrumentDetailDisclosureComposable.InstrumentDetailDisclosureComposable$lambda$3$lambda$2(instrumentDetailDisclosureDuxo3, instrumentId, accountNumber, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                    composer3.endReplaceGroup();
                    int i62 = i3;
                    LifecycleEffectKt.LifecycleResumeEffect(instrumentId, accountNumber, null, (Function1) objRememberedValue, composer3, i62 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                    instrumentDisclosure = InstrumentDetailDisclosureComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getInstrumentDisclosure();
                    if (instrumentDisclosure != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    instrumentDetailDisclosureDuxo5 = instrumentDetailDisclosureDuxo4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult InstrumentDetailDisclosureComposable$lambda$3$lambda$2(InstrumentDetailDisclosureDuxo instrumentDetailDisclosureDuxo, UUID uuid, String str, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = instrumentDetailDisclosureDuxo.bind(uuid, str);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureComposableKt$InstrumentDetailDisclosureComposable$lambda$3$lambda$2$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    private static final InstrumentDetailDisclosureViewState InstrumentDetailDisclosureComposable$lambda$0(SnapshotState4<InstrumentDetailDisclosureViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
