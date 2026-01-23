package com.robinhood.android.equities.equityproxyvoting;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo;
import com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingViewState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.p320db.ProxyCommunication;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: EquityProxyVotingRow.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"EquityProxyVotingRow", "", "instrumentId", "Ljava/util/UUID;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingDuxo;", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingDuxo;Landroidx/compose/runtime/Composer;II)V", "ProxyVoteRow", "state", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState$Loaded;", "onRowClicked", "Lkotlin/Function0;", "(Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState$Loaded;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewProxyVoteRow", "previewState", "Lcom/robinhood/android/equities/equityproxyvoting/PreviewStates;", "(Lcom/robinhood/android/equities/equityproxyvoting/PreviewStates;Landroidx/compose/runtime/Composer;I)V", "lib-equity-proxy-voting_externalDebug", "viewState", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityProxyVotingRow4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityProxyVotingRow$lambda$4(UUID uuid, Screen screen, Modifier modifier, EquityProxyVotingDuxo equityProxyVotingDuxo, int i, int i2, Composer composer, int i3) {
        EquityProxyVotingRow(uuid, screen, modifier, equityProxyVotingDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewProxyVoteRow$lambda$9(PreviewStates previewStates, int i, Composer composer, int i2) {
        PreviewProxyVoteRow(previewStates, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProxyVoteRow$lambda$8(EquityProxyVotingViewState.Loaded loaded, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProxyVoteRow(loaded, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityProxyVotingRow(final UUID instrumentId, final Screen screen, Modifier modifier, EquityProxyVotingDuxo equityProxyVotingDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Screen screen2;
        int i4;
        Modifier modifier2;
        EquityProxyVotingDuxo equityProxyVotingDuxo2;
        Modifier modifier3;
        int i5;
        final EquityProxyVotingDuxo equityProxyVotingDuxo3;
        final EquityProxyVotingViewState equityProxyVotingViewStateEquityProxyVotingRow$lambda$0;
        Modifier modifier4;
        final EquityProxyVotingDuxo equityProxyVotingDuxo4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-814972531);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                screen2 = screen;
                i3 |= composerStartRestartGroup.changedInstance(screen2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        equityProxyVotingDuxo2 = equityProxyVotingDuxo;
                        int i6 = composerStartRestartGroup.changedInstance(equityProxyVotingDuxo2) ? 2048 : 1024;
                        i3 |= i6;
                    } else {
                        equityProxyVotingDuxo2 = equityProxyVotingDuxo;
                    }
                    i3 |= i6;
                } else {
                    equityProxyVotingDuxo2 = equityProxyVotingDuxo;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    equityProxyVotingDuxo4 = equityProxyVotingDuxo2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) == 0) {
                            String str = "EquityProxyVotingDuxo: " + instrumentId;
                            EquityProxyVotingDuxo.Args args = new EquityProxyVotingDuxo.Args(instrumentId);
                            composerStartRestartGroup.startReplaceGroup(2050738472);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EquityProxyVotingDuxo.class), current, str, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$EquityProxyVotingRow$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$EquityProxyVotingRow$$inlined$duxo$1.1
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
                            EquityProxyVotingDuxo equityProxyVotingDuxo5 = (EquityProxyVotingDuxo) baseDuxo;
                            i5 = i3 & (-7169);
                            equityProxyVotingDuxo3 = equityProxyVotingDuxo5;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-814972531, i5, -1, "com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRow (EquityProxyVotingRow.kt:51)");
                        }
                        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Composer composer2 = composerStartRestartGroup;
                        equityProxyVotingViewStateEquityProxyVotingRow$lambda$0 = EquityProxyVotingRow$lambda$0(FlowExtKt.collectAsStateWithLifecycle(equityProxyVotingDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7));
                        if (Intrinsics.areEqual(equityProxyVotingViewStateEquityProxyVotingRow$lambda$0, EquityProxyVotingViewState.Gone.INSTANCE)) {
                            modifier4 = modifier3;
                            composerStartRestartGroup = composer2;
                        } else {
                            if (!(equityProxyVotingViewStateEquityProxyVotingRow$lambda$0 instanceof EquityProxyVotingViewState.Loaded)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            EquityProxyVotingViewState.Loaded loaded = (EquityProxyVotingViewState.Loaded) equityProxyVotingViewStateEquityProxyVotingRow$lambda$0;
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged = composer2.changed(loaded);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                Component component = new Component(Component.ComponentType.PROXY_VOTE_SECTION, loaded.getLoggingComponentIdentifier(), null, 4, null);
                                Asset.AssetType assetType = Asset.AssetType.INSTRUMENT;
                                String string2 = instrumentId.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                objRememberedValue2 = new UserInteractionEventDescriptor(null, screen2, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, assetType, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null), component, null, 37, null);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            Modifier modifier6 = modifier3;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier6, (UserInteractionEventDescriptor) objRememberedValue2, true, false, false, true, false, null, 108, null);
                            modifier4 = modifier6;
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChangedInstance2 = composer2.changedInstance(equityProxyVotingDuxo3) | composer2.changedInstance(context) | composer2.changedInstance(equityProxyVotingViewStateEquityProxyVotingRow$lambda$0);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return EquityProxyVotingRow4.EquityProxyVotingRow$lambda$3$lambda$2(equityProxyVotingDuxo3, context, equityProxyVotingViewStateEquityProxyVotingRow$lambda$0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            composerStartRestartGroup = composer2;
                            ProxyVoteRow(loaded, (Function0) objRememberedValue3, modifierAutoLogEvents$default, composerStartRestartGroup, StringResource.$stable, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        equityProxyVotingDuxo4 = equityProxyVotingDuxo3;
                        modifier5 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier2;
                    }
                    i5 = i3;
                    equityProxyVotingDuxo3 = equityProxyVotingDuxo2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Composer composer22 = composerStartRestartGroup;
                    equityProxyVotingViewStateEquityProxyVotingRow$lambda$0 = EquityProxyVotingRow$lambda$0(FlowExtKt.collectAsStateWithLifecycle(equityProxyVotingDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer22, 0, 7));
                    if (Intrinsics.areEqual(equityProxyVotingViewStateEquityProxyVotingRow$lambda$0, EquityProxyVotingViewState.Gone.INSTANCE)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    equityProxyVotingDuxo4 = equityProxyVotingDuxo3;
                    modifier5 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EquityProxyVotingRow4.EquityProxyVotingRow$lambda$4(instrumentId, screen, modifier5, equityProxyVotingDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) == 0) {
                        i5 = i3;
                        equityProxyVotingDuxo3 = equityProxyVotingDuxo2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Context context22 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Composer composer222 = composerStartRestartGroup;
                    equityProxyVotingViewStateEquityProxyVotingRow$lambda$0 = EquityProxyVotingRow$lambda$0(FlowExtKt.collectAsStateWithLifecycle(equityProxyVotingDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer222, 0, 7));
                    if (Intrinsics.areEqual(equityProxyVotingViewStateEquityProxyVotingRow$lambda$0, EquityProxyVotingViewState.Gone.INSTANCE)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    equityProxyVotingDuxo4 = equityProxyVotingDuxo3;
                    modifier5 = modifier4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        screen2 = screen;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final EquityProxyVotingViewState EquityProxyVotingRow$lambda$0(SnapshotState4<? extends EquityProxyVotingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityProxyVotingRow$lambda$3$lambda$2(EquityProxyVotingDuxo equityProxyVotingDuxo, Context context, EquityProxyVotingViewState equityProxyVotingViewState) {
        equityProxyVotingDuxo.voteUrlOpened();
        WebUtils.viewUrl(context, ((EquityProxyVotingViewState.Loaded) equityProxyVotingViewState).getVoteUrl(), C20690R.attr.colorBackground1);
        return Unit.INSTANCE;
    }

    /* compiled from: EquityProxyVotingRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$PreviewProxyVoteRow$1 */
    static final class C146651 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PreviewStates $previewState;

        C146651(PreviewStates previewStates) {
            this.$previewState = previewStates;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2104618329, i, -1, "com.robinhood.android.equities.equityproxyvoting.PreviewProxyVoteRow.<anonymous> (EquityProxyVotingRow.kt:227)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            PreviewStates previewStates = this.$previewState;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(previewStates.getVoteStatus().name(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
            StringResource title = previewStates.getTitle();
            StringResource.Companion companion3 = StringResource.INSTANCE;
            EquityProxyVotingViewState.Loaded loaded = new EquityProxyVotingViewState.Loaded(title, companion3.invoke("Sept 12 11:59 PM ET"), previewStates.getVoteStatus(), false, "");
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$PreviewProxyVoteRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            int i2 = StringResource.$stable;
            EquityProxyVotingRow4.ProxyVoteRow(loaded, (Function0) objRememberedValue, null, composer, i2 | 48, 4);
            EquityProxyVotingViewState.Loaded loaded2 = new EquityProxyVotingViewState.Loaded(previewStates.getTitle(), companion3.invoke("Sept 12 11:59 PM ET"), previewStates.getVoteStatus(), true, "");
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$PreviewProxyVoteRow$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EquityProxyVotingRow4.ProxyVoteRow(loaded2, (Function0) objRememberedValue2, null, composer, i2 | 48, 4);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProxyVoteRow(final EquityProxyVotingViewState.Loaded state, final Function0<Unit> onRowClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2056673195);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRowClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2056673195, i3, -1, "com.robinhood.android.equities.equityproxyvoting.ProxyVoteRow (EquityProxyVotingRow.kt:101)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 112) == 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityProxyVotingRow4.ProxyVoteRow$lambda$7$lambda$6$lambda$5(onRowClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null);
                EquityProxyVotingRow equityProxyVotingRow = EquityProxyVotingRow.INSTANCE;
                Function2<Composer, Integer, Unit> function2M13535getLambda$1423103865$lib_equity_proxy_voting_externalDebug = equityProxyVotingRow.m13535getLambda$1423103865$lib_equity_proxy_voting_externalDebug();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1783563576, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$ProxyVoteRow$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1783563576, i5, -1, "com.robinhood.android.equities.equityproxyvoting.ProxyVoteRow.<anonymous>.<anonymous> (EquityProxyVotingRow.kt:120)");
                        }
                        BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(state.getTitle(), composer2, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8190);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-2144023287, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$ProxyVoteRow$1$3

                    /* compiled from: EquityProxyVotingRow.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$ProxyVoteRow$1$3$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[ProxyCommunication.VoteStatus.values().length];
                            try {
                                iArr[ProxyCommunication.VoteStatus.WITHDRAWN.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[ProxyCommunication.VoteStatus.LEGAL_PROXY.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[ProxyCommunication.VoteStatus.VIEWED.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[ProxyCommunication.VoteStatus.NOT_VIEWED.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[ProxyCommunication.VoteStatus.VOTE_TRANSMISSION.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[ProxyCommunication.VoteStatus.ONLINE.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        AnnotatedString.Builder builder;
                        int iPushStyle;
                        AnnotatedString annotatedString;
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2144023287, i5, -1, "com.robinhood.android.equities.equityproxyvoting.ProxyVoteRow.<anonymous>.<anonymous> (EquityProxyVotingRow.kt:126)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        TextStyle textS = bentoTheme.getTypography(composer2, i6).getTextS();
                        if (state.getVoteEnded()) {
                            composer2.startReplaceGroup(-2138934562);
                            EquityProxyVotingViewState.Loaded loaded = state;
                            builder = new AnnotatedString.Builder(0, 1, null);
                            composer2.startReplaceGroup(1177930439);
                            iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                            try {
                                builder.append(StringResources_androidKt.stringResource(C14667R.string.proxy_communication_voting_ended_subtitle, new Object[]{StringResources6.getTextAsString(loaded.getDateString(), composer2, StringResource.$stable)}, composer2, 0));
                                Unit unit = Unit.INSTANCE;
                                builder.pop(iPushStyle);
                                composer2.endReplaceGroup();
                                annotatedString = builder.toAnnotatedString();
                                composer2.endReplaceGroup();
                            } finally {
                            }
                        } else {
                            composer2.startReplaceGroup(-2138331829);
                            switch (WhenMappings.$EnumSwitchMapping$0[state.getVoteStatus().ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    composer2.startReplaceGroup(-2138020217);
                                    EquityProxyVotingViewState.Loaded loaded2 = state;
                                    builder = new AnnotatedString.Builder(0, 1, null);
                                    composer2.startReplaceGroup(1177958801);
                                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i6).m21368getAccent0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                                    try {
                                        builder.append(StringResources_androidKt.stringResource(C14667R.string.proxy_communication_not_voted_subtitle_prefix, composer2, 0));
                                        Unit unit2 = Unit.INSTANCE;
                                        builder.pop(iPushStyle);
                                        composer2.endReplaceGroup();
                                        composer2.startReplaceGroup(1177973437);
                                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                        try {
                                            builder.append(StringResources_androidKt.stringResource(C14667R.string.proxy_communication_subtitle_suffix, new Object[]{StringResources6.getTextAsString(loaded2.getDateString(), composer2, StringResource.$stable)}, composer2, 0));
                                            builder.pop(iPushStyle);
                                            composer2.endReplaceGroup();
                                            annotatedString = builder.toAnnotatedString();
                                            composer2.endReplaceGroup();
                                            break;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                case 5:
                                case 6:
                                    composer2.startReplaceGroup(-2136872597);
                                    EquityProxyVotingViewState.Loaded loaded3 = state;
                                    builder = new AnnotatedString.Builder(0, 1, null);
                                    composer2.startReplaceGroup(1177995821);
                                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i6).m21368getAccent0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                                    try {
                                        builder.append(StringResources_androidKt.stringResource(C14667R.string.proxy_communication_subtitle_voted_prefix, composer2, 0));
                                        Unit unit3 = Unit.INSTANCE;
                                        builder.pop(iPushStyle);
                                        composer2.endReplaceGroup();
                                        composer2.startReplaceGroup(1178010333);
                                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                        try {
                                            builder.append(StringResources_androidKt.stringResource(C14667R.string.proxy_communication_subtitle_suffix, new Object[]{StringResources6.getTextAsString(loaded3.getDateString(), composer2, StringResource.$stable)}, composer2, 0));
                                            builder.pop(iPushStyle);
                                            composer2.endReplaceGroup();
                                            annotatedString = builder.toAnnotatedString();
                                            composer2.endReplaceGroup();
                                            break;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                default:
                                    composer2.startReplaceGroup(1177948327);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                            }
                            composer2.endReplaceGroup();
                        }
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, null, null, null, null, null, 0, false, 0, 0, null, null, textS, composer2, 0, 0, 8190);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                Function2<Composer, Integer, Unit> lambda$1430024587$lib_equity_proxy_voting_externalDebug = equityProxyVotingRow.getLambda$1430024587$lib_equity_proxy_voting_externalDebug();
                modifier3 = modifier4;
                BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default, null, function2M13535getLambda$1423103865$lib_equity_proxy_voting_externalDebug, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, lambda$1430024587$lib_equity_proxy_voting_externalDebug, false, false, false, null, composerStartRestartGroup, 14183808, 0, 1826);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityProxyVotingRow4.ProxyVoteRow$lambda$8(state, onRowClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion22, 0.0f, composerStartRestartGroup, 6, 1), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 112) == 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityProxyVotingRow4.ProxyVoteRow$lambda$7$lambda$6$lambda$5(onRowClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(companion22, false, null, null, (Function0) objRememberedValue, 7, null);
                    EquityProxyVotingRow equityProxyVotingRow2 = EquityProxyVotingRow.INSTANCE;
                    Function2<Composer, Integer, Unit> function2M13535getLambda$1423103865$lib_equity_proxy_voting_externalDebug2 = equityProxyVotingRow2.m13535getLambda$1423103865$lib_equity_proxy_voting_externalDebug();
                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-1783563576, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$ProxyVoteRow$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1783563576, i5, -1, "com.robinhood.android.equities.equityproxyvoting.ProxyVoteRow.<anonymous>.<anonymous> (EquityProxyVotingRow.kt:120)");
                            }
                            BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(state.getTitle(), composer2, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8190);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(-2144023287, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$ProxyVoteRow$1$3

                        /* compiled from: EquityProxyVotingRow.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$ProxyVoteRow$1$3$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[ProxyCommunication.VoteStatus.values().length];
                                try {
                                    iArr[ProxyCommunication.VoteStatus.WITHDRAWN.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[ProxyCommunication.VoteStatus.LEGAL_PROXY.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[ProxyCommunication.VoteStatus.VIEWED.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                try {
                                    iArr[ProxyCommunication.VoteStatus.NOT_VIEWED.ordinal()] = 4;
                                } catch (NoSuchFieldError unused4) {
                                }
                                try {
                                    iArr[ProxyCommunication.VoteStatus.VOTE_TRANSMISSION.ordinal()] = 5;
                                } catch (NoSuchFieldError unused5) {
                                }
                                try {
                                    iArr[ProxyCommunication.VoteStatus.ONLINE.ordinal()] = 6;
                                } catch (NoSuchFieldError unused6) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            AnnotatedString.Builder builder;
                            int iPushStyle;
                            AnnotatedString annotatedString;
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2144023287, i5, -1, "com.robinhood.android.equities.equityproxyvoting.ProxyVoteRow.<anonymous>.<anonymous> (EquityProxyVotingRow.kt:126)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            TextStyle textS = bentoTheme.getTypography(composer2, i6).getTextS();
                            if (state.getVoteEnded()) {
                                composer2.startReplaceGroup(-2138934562);
                                EquityProxyVotingViewState.Loaded loaded = state;
                                builder = new AnnotatedString.Builder(0, 1, null);
                                composer2.startReplaceGroup(1177930439);
                                iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                try {
                                    builder.append(StringResources_androidKt.stringResource(C14667R.string.proxy_communication_voting_ended_subtitle, new Object[]{StringResources6.getTextAsString(loaded.getDateString(), composer2, StringResource.$stable)}, composer2, 0));
                                    Unit unit = Unit.INSTANCE;
                                    builder.pop(iPushStyle);
                                    composer2.endReplaceGroup();
                                    annotatedString = builder.toAnnotatedString();
                                    composer2.endReplaceGroup();
                                } finally {
                                }
                            } else {
                                composer2.startReplaceGroup(-2138331829);
                                switch (WhenMappings.$EnumSwitchMapping$0[state.getVoteStatus().ordinal()]) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                        composer2.startReplaceGroup(-2138020217);
                                        EquityProxyVotingViewState.Loaded loaded2 = state;
                                        builder = new AnnotatedString.Builder(0, 1, null);
                                        composer2.startReplaceGroup(1177958801);
                                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i6).m21368getAccent0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                                        try {
                                            builder.append(StringResources_androidKt.stringResource(C14667R.string.proxy_communication_not_voted_subtitle_prefix, composer2, 0));
                                            Unit unit2 = Unit.INSTANCE;
                                            builder.pop(iPushStyle);
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(1177973437);
                                            iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                            try {
                                                builder.append(StringResources_androidKt.stringResource(C14667R.string.proxy_communication_subtitle_suffix, new Object[]{StringResources6.getTextAsString(loaded2.getDateString(), composer2, StringResource.$stable)}, composer2, 0));
                                                builder.pop(iPushStyle);
                                                composer2.endReplaceGroup();
                                                annotatedString = builder.toAnnotatedString();
                                                composer2.endReplaceGroup();
                                                break;
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    case 5:
                                    case 6:
                                        composer2.startReplaceGroup(-2136872597);
                                        EquityProxyVotingViewState.Loaded loaded3 = state;
                                        builder = new AnnotatedString.Builder(0, 1, null);
                                        composer2.startReplaceGroup(1177995821);
                                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i6).m21368getAccent0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                                        try {
                                            builder.append(StringResources_androidKt.stringResource(C14667R.string.proxy_communication_subtitle_voted_prefix, composer2, 0));
                                            Unit unit3 = Unit.INSTANCE;
                                            builder.pop(iPushStyle);
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(1178010333);
                                            iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                            try {
                                                builder.append(StringResources_androidKt.stringResource(C14667R.string.proxy_communication_subtitle_suffix, new Object[]{StringResources6.getTextAsString(loaded3.getDateString(), composer2, StringResource.$stable)}, composer2, 0));
                                                builder.pop(iPushStyle);
                                                composer2.endReplaceGroup();
                                                annotatedString = builder.toAnnotatedString();
                                                composer2.endReplaceGroup();
                                                break;
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    default:
                                        composer2.startReplaceGroup(1177948327);
                                        composer2.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                }
                                composer2.endReplaceGroup();
                            }
                            BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, null, null, null, null, null, 0, false, 0, 0, null, null, textS, composer2, 0, 0, 8190);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    Function2<Composer, Integer, Unit> lambda$1430024587$lib_equity_proxy_voting_externalDebug2 = equityProxyVotingRow2.getLambda$1430024587$lib_equity_proxy_voting_externalDebug();
                    modifier3 = modifier4;
                    BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default2, null, function2M13535getLambda$1423103865$lib_equity_proxy_voting_externalDebug2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda22, null, lambda$1430024587$lib_equity_proxy_voting_externalDebug2, false, false, false, null, composerStartRestartGroup, 14183808, 0, 1826);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProxyVoteRow$lambda$7$lambda$6$lambda$5(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void PreviewProxyVoteRow(final PreviewStates previewStates, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1548743697);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(previewStates) : composerStartRestartGroup.changedInstance(previewStates) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548743697, i2, -1, "com.robinhood.android.equities.equityproxyvoting.PreviewProxyVoteRow (EquityProxyVotingRow.kt:225)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2104618329, true, new C146651(previewStates), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityProxyVotingRow4.PreviewProxyVoteRow$lambda$9(previewStates, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
