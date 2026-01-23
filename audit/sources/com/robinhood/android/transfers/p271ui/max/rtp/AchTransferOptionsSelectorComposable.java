package com.robinhood.android.transfers.p271ui.max.rtp;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
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
import androidx.compose.runtime.internal.ComposableLambda3;
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
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
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

/* compiled from: AchTransferOptionsSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001ac\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001a\u0010\u001b\"\u000e\u0010\u001c\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, m3636d2 = {"AchTransferOptionsSelectorComposable", "", "achTransferOptionsSelectorBundle", "Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorBundle;", "onAchTransferOptionChanged", "Lkotlin/Function1;", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorDuxo;", "(Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorBundle;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorDuxo;Landroidx/compose/runtime/Composer;II)V", "AchTransferOptionComposable", "isEnabled", "", "isSelected", "identifier", "", "onClick", "Lkotlin/Function0;", "title", "titleColor", "Landroidx/compose/ui/graphics/Color;", "titleIcon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "subtitle", "AchTransferOptionComposable-Ccamzx0", "(ZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;JLcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AchTransferOptionSelectorTag", "TitleIconTag", "feature-transfers_externalRelease", "viewState", "Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AchTransferOptionsSelectorComposable {
    public static final String AchTransferOptionSelectorTag = "AchTransferOptionSelector";
    public static final String TitleIconTag = "TitleIcon";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AchTransferOptionComposable_Ccamzx0$lambda$4(boolean z, boolean z2, String str, Function0 function0, String str2, long j, BentoIcon4 bentoIcon4, String str3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m19919AchTransferOptionComposableCcamzx0(z, z2, str, function0, str2, j, bentoIcon4, str3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AchTransferOptionsSelectorComposable$lambda$2$lambda$1(AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle, Function1 function1, Modifier modifier, AchTransferOptionsSelectorDuxo achTransferOptionsSelectorDuxo, int i, int i2, Composer composer, int i3) {
        AchTransferOptionsSelectorComposable(achTransferOptionsSelectorBundle, function1, modifier, achTransferOptionsSelectorDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AchTransferOptionsSelectorComposable$lambda$3(AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle, Function1 function1, Modifier modifier, AchTransferOptionsSelectorDuxo achTransferOptionsSelectorDuxo, int i, int i2, Composer composer, int i3) {
        AchTransferOptionsSelectorComposable(achTransferOptionsSelectorBundle, function1, modifier, achTransferOptionsSelectorDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AchTransferOptionsSelectorComposable(final AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle, final Function1<? super AchTransferOption, Unit> onAchTransferOptionChanged, Modifier modifier, AchTransferOptionsSelectorDuxo achTransferOptionsSelectorDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer2;
        final AchTransferOptionsSelectorDuxo achTransferOptionsSelectorDuxo2;
        int i4;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Composer composer3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i5;
        AchTransferOptionsSelectorDuxo achTransferOptionsSelectorDuxo3 = achTransferOptionsSelectorDuxo;
        Intrinsics.checkNotNullParameter(achTransferOptionsSelectorBundle, "achTransferOptionsSelectorBundle");
        Intrinsics.checkNotNullParameter(onAchTransferOptionChanged, "onAchTransferOptionChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(1686993212);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(achTransferOptionsSelectorBundle) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAchTransferOptionChanged) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) != 0) {
                    i5 = 1024;
                    i3 |= i5;
                } else {
                    if ((i & 4096) == 0 ? composerStartRestartGroup.changed(achTransferOptionsSelectorDuxo3) : composerStartRestartGroup.changedInstance(achTransferOptionsSelectorDuxo3)) {
                        i5 = 2048;
                    }
                    i3 |= i5;
                }
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AchTransferOptionsSelectorDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$AchTransferOptionsSelectorComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$AchTransferOptionsSelectorComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                        composer2.endReplaceGroup();
                        achTransferOptionsSelectorDuxo3 = (AchTransferOptionsSelectorDuxo) baseDuxo;
                        i3 &= -7169;
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    int i7 = i3;
                    achTransferOptionsSelectorDuxo2 = achTransferOptionsSelectorDuxo3;
                    i4 = i7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    int i8 = i3;
                    achTransferOptionsSelectorDuxo2 = achTransferOptionsSelectorDuxo3;
                    i4 = i8;
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1686993212, i4, -1, "com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposable (AchTransferOptionsSelectorComposable.kt:46)");
                }
                achTransferOptionsSelectorDuxo2.updateBundle(achTransferOptionsSelectorBundle);
                Composer composer4 = composer2;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(achTransferOptionsSelectorDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                onAchTransferOptionChanged.invoke(AchTransferOptionsSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAchTransferOption());
                AchTransferOptionsSelectorViewState achTransferOptionsSelectorViewStateAchTransferOptionsSelectorComposable$lambda$0 = AchTransferOptionsSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (AchTransferOptionsSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isVisible()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier5 = modifier3;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AchTransferOptionsSelectorComposable.AchTransferOptionsSelectorComposable$lambda$2$lambda$1(achTransferOptionsSelectorBundle, onAchTransferOptionChanged, modifier5, achTransferOptionsSelectorDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1176722357, true, new AchTransferOptionsSelectorComposable3(modifier3, achTransferOptionsSelectorViewStateAchTransferOptionsSelectorComposable$lambda$0, achTransferOptionsSelectorDuxo2), composer3, 54), composer3, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                achTransferOptionsSelectorDuxo2 = achTransferOptionsSelectorDuxo3;
                modifier4 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AchTransferOptionsSelectorComposable.AchTransferOptionsSelectorComposable$lambda$3(achTransferOptionsSelectorBundle, onAchTransferOptionChanged, modifier4, achTransferOptionsSelectorDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i6 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                int i72 = i3;
                achTransferOptionsSelectorDuxo2 = achTransferOptionsSelectorDuxo3;
                i4 = i72;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                achTransferOptionsSelectorDuxo2.updateBundle(achTransferOptionsSelectorBundle);
                Composer composer42 = composer2;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(achTransferOptionsSelectorDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer3 = composer42;
                onAchTransferOptionChanged.invoke(AchTransferOptionsSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAchTransferOption());
                AchTransferOptionsSelectorViewState achTransferOptionsSelectorViewStateAchTransferOptionsSelectorComposable$lambda$02 = AchTransferOptionsSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (AchTransferOptionsSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isVisible()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final AchTransferOptionsSelectorViewState AchTransferOptionsSelectorComposable$lambda$0(SnapshotState4<AchTransferOptionsSelectorViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* renamed from: AchTransferOptionComposable-Ccamzx0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m19919AchTransferOptionComposableCcamzx0(final boolean z, final boolean z2, final String identifier, final Function0<Unit> onClick, final String title, final long j, final BentoIcon4 bentoIcon4, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2042357829);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(identifier) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(title) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else {
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(bentoIcon4) : composerStartRestartGroup.changedInstance(bentoIcon4) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else {
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
                    }
                    i4 = i2 & 256;
                    if (i4 != 0) {
                        if ((100663296 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                        }
                        if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            if (i4 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2042357829, i3, -1, "com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionComposable (AchTransferOptionsSelectorComposable.kt:121)");
                            }
                            Modifier modifier4 = modifier2;
                            modifier3 = modifier4;
                            composer2 = composerStartRestartGroup;
                            CardKt.m5548CardFjzlyU(TestTag3.testTag(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, z, null, null, onClick, 6, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ACH_TRANSFER_OPTION_CARD, identifier, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), identifier), null, 0L, 0L, null, 0.0f, ComposableLambda3.rememberComposableLambda(-1076865762, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$AchTransferOptionComposable$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i5) {
                                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1076865762, i5, -1, "com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionComposable.<anonymous> (AchTransferOptionsSelectorComposable.kt:142)");
                                    }
                                    final boolean z3 = z;
                                    final String str2 = str;
                                    final boolean z4 = z2;
                                    final BentoIcon4 bentoIcon42 = bentoIcon4;
                                    final long j2 = j;
                                    final String str3 = title;
                                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1838087748, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$AchTransferOptionComposable$1.1
                                        public final void invoke(Composer composer4, int i6) {
                                            long jM21373getBg30d7_KjU;
                                            boolean z5;
                                            Modifier.Companion companion;
                                            String str4;
                                            int i7;
                                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1838087748, i6, -1, "com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionComposable.<anonymous>.<anonymous> (AchTransferOptionsSelectorComposable.kt:143)");
                                            }
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            if (z3) {
                                                composer4.startReplaceGroup(-1170763234);
                                                jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU();
                                            } else {
                                                composer4.startReplaceGroup(-1170762401);
                                                jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21373getBg30d7_KjU();
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, jM21373getBg30d7_KjU, null, 2, null);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i8 = BentoTheme.$stable;
                                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM4872backgroundbw27NRU$default, bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM());
                                            String str5 = str2;
                                            boolean z6 = z4;
                                            BentoIcon4 bentoIcon43 = bentoIcon42;
                                            long j3 = j2;
                                            String str6 = str3;
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.Vertical top = arrangement.getTop();
                                            Alignment.Companion companion3 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer4, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5142padding3ABfNKs);
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer4, 0);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, companion2);
                                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                            Row6 row6 = Row6.INSTANCE;
                                            composer4.startReplaceGroup(-17745519);
                                            if (bentoIcon43 != null) {
                                                str4 = str6;
                                                companion = companion2;
                                                z5 = z6;
                                                BentoIcon2.m20644BentoIconFU0evQE(bentoIcon43, "instant icon", j3, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i8).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), AchTransferOptionsSelectorComposable.TitleIconTag), null, false, composer4, BentoIcon4.$stable | 48, 48);
                                            } else {
                                                z5 = z6;
                                                companion = companion2;
                                                str4 = str6;
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier.Companion companion5 = companion;
                                            BentoText2.m20747BentoText38GnDrw(str4, null, Color.m6701boximpl(j3), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i8).getTextS(), composer4, 0, 0, 8186);
                                            composer4.endNode();
                                            composer4.startReplaceGroup(-894658515);
                                            if (str5 != null) {
                                                i7 = i8;
                                                BentoText2.m20747BentoText38GnDrw(str5, null, Color.m6701boximpl(bentoTheme.getColors(composer4, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i8).getTextS(), composer4, 0, 0, 8186);
                                            } else {
                                                i7 = i8;
                                            }
                                            composer4.endReplaceGroup();
                                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CHECKMARK_16), "selected ach option", bentoTheme.getColors(composer4, i7).m21425getFg0d7_KjU(), Alpha.alpha(column6.align(companion5, companion3.getEnd()), z5 ? 1.0f : 0.0f), null, false, composer4, BentoIcon4.Size16.$stable | 48, 48);
                                            composer4.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composer2, 1572864, 62);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier5 = modifier3;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AchTransferOptionsSelectorComposable.AchTransferOptionComposable_Ccamzx0$lambda$4(z, z2, identifier, onClick, title, j, bentoIcon4, str, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    modifier2 = modifier;
                    if ((i3 & 38347923) != 38347922) {
                        if (i4 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifier42 = modifier2;
                        modifier3 = modifier42;
                        composer2 = composerStartRestartGroup;
                        CardKt.m5548CardFjzlyU(TestTag3.testTag(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier42, z, null, null, onClick, 6, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ACH_TRANSFER_OPTION_CARD, identifier, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), identifier), null, 0L, 0L, null, 0.0f, ComposableLambda3.rememberComposableLambda(-1076865762, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$AchTransferOptionComposable$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i5) {
                                if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1076865762, i5, -1, "com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionComposable.<anonymous> (AchTransferOptionsSelectorComposable.kt:142)");
                                }
                                final boolean z3 = z;
                                final String str2 = str;
                                final boolean z4 = z2;
                                final BentoIcon4 bentoIcon42 = bentoIcon4;
                                final long j2 = j;
                                final String str3 = title;
                                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1838087748, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$AchTransferOptionComposable$1.1
                                    public final void invoke(Composer composer4, int i6) {
                                        long jM21373getBg30d7_KjU;
                                        boolean z5;
                                        Modifier.Companion companion;
                                        String str4;
                                        int i7;
                                        if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1838087748, i6, -1, "com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionComposable.<anonymous>.<anonymous> (AchTransferOptionsSelectorComposable.kt:143)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        if (z3) {
                                            composer4.startReplaceGroup(-1170763234);
                                            jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU();
                                        } else {
                                            composer4.startReplaceGroup(-1170762401);
                                            jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21373getBg30d7_KjU();
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, jM21373getBg30d7_KjU, null, 2, null);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i8 = BentoTheme.$stable;
                                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM4872backgroundbw27NRU$default, bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM());
                                        String str5 = str2;
                                        boolean z6 = z4;
                                        BentoIcon4 bentoIcon43 = bentoIcon42;
                                        long j3 = j2;
                                        String str6 = str3;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Vertical top = arrangement.getTop();
                                        Alignment.Companion companion3 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer4, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5142padding3ABfNKs);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer4, 0);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, companion2);
                                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        composer4.startReplaceGroup(-17745519);
                                        if (bentoIcon43 != null) {
                                            str4 = str6;
                                            companion = companion2;
                                            z5 = z6;
                                            BentoIcon2.m20644BentoIconFU0evQE(bentoIcon43, "instant icon", j3, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i8).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), AchTransferOptionsSelectorComposable.TitleIconTag), null, false, composer4, BentoIcon4.$stable | 48, 48);
                                        } else {
                                            z5 = z6;
                                            companion = companion2;
                                            str4 = str6;
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier.Companion companion5 = companion;
                                        BentoText2.m20747BentoText38GnDrw(str4, null, Color.m6701boximpl(j3), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i8).getTextS(), composer4, 0, 0, 8186);
                                        composer4.endNode();
                                        composer4.startReplaceGroup(-894658515);
                                        if (str5 != null) {
                                            i7 = i8;
                                            BentoText2.m20747BentoText38GnDrw(str5, null, Color.m6701boximpl(bentoTheme.getColors(composer4, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i8).getTextS(), composer4, 0, 0, 8186);
                                        } else {
                                            i7 = i8;
                                        }
                                        composer4.endReplaceGroup();
                                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CHECKMARK_16), "selected ach option", bentoTheme.getColors(composer4, i7).m21425getFg0d7_KjU(), Alpha.alpha(column6.align(companion5, companion3.getEnd()), z5 ? 1.0f : 0.0f), null, false, composer4, BentoIcon4.Size16.$stable | 48, 48);
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, 1572864, 62);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i4 = i2 & 256;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                if ((i3 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i4 = i2 & 256;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((i3 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i4 = i2 & 256;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
