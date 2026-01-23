package com.robinhood.android.common.portfolio.pnl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
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
import androidx.compose.runtime.internal.ComposableLambda3;
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
import com.robinhood.android.common.portfolio.C11511R;
import com.robinhood.android.common.portfolio.pnl.PnlHubSectionEvent;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.contracts.PnlHubContract;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.portfolio.pnlhub.models.C25781R;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
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
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;

/* compiled from: PnlHubSectionComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001aU\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0001¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\u0012\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002"}, m3636d2 = {"PNL_HUB_SECTION_SUBTITLE", "", "PnlHubSectionComposable", "", "source", "accountNumber", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo;Landroidx/compose/runtime/Composer;II)V", "PnlHubSection", "viewState", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionEvent;", "onNowIncludesCryptoTooltipAppear", "Lkotlin/Function0;", "onNavigate", "(Ljava/lang/String;Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionViewState;Lcom/robinhood/android/udf/event/Event;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-lib-portfolio_externalDebug", "eventState", "showNowIncludesCryptoTooltip", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PnlHubSectionComposable5 {
    public static final String PNL_HUB_SECTION_SUBTITLE = "PnlHubSubtitle";

    /* compiled from: PnlHubSectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubSection$lambda$10(String str, PnlHubSectionViewState pnlHubSectionViewState, Event event, Function0 function0, Modifier modifier, Function0 function02, int i, int i2, Composer composer, int i3) {
        PnlHubSection(str, pnlHubSectionViewState, event, function0, modifier, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubSection$lambda$24(String str, PnlHubSectionViewState pnlHubSectionViewState, Event event, Function0 function0, Modifier modifier, Function0 function02, int i, int i2, Composer composer, int i3) {
        PnlHubSection(str, pnlHubSectionViewState, event, function0, modifier, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubSectionComposable$lambda$7(String str, String str2, Modifier modifier, PnlHubSectionDuxo pnlHubSectionDuxo, int i, int i2, Composer composer, int i3) {
        PnlHubSectionComposable(str, str2, modifier, pnlHubSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlHubSectionComposable(final String source, final String accountNumber, Modifier modifier, PnlHubSectionDuxo pnlHubSectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PnlHubSectionDuxo pnlHubSectionDuxo2;
        int i4;
        boolean z;
        int i5;
        final PnlHubSectionDuxo pnlHubSectionDuxo3;
        Modifier modifier3;
        boolean zChangedInstance;
        Object objRememberedValue;
        PnlHubSectionDuxo pnlHubSectionDuxo4;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        final Modifier modifier4;
        final PnlHubSectionDuxo pnlHubSectionDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1324791738);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(source) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(accountNumber) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    pnlHubSectionDuxo2 = pnlHubSectionDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(pnlHubSectionDuxo2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    pnlHubSectionDuxo2 = pnlHubSectionDuxo;
                }
                i3 |= i7;
            } else {
                pnlHubSectionDuxo2 = pnlHubSectionDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        String str = "PnlHubSectionComposable_" + accountNumber;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                        z = false;
                        i4 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PnlHubSectionDuxo.class), current, str, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$PnlHubSectionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$PnlHubSectionComposable$$inlined$duxo$1.1
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
                        pnlHubSectionDuxo2 = (PnlHubSectionDuxo) baseDuxo;
                        i3 &= -7169;
                    } else {
                        i4 = -1633490746;
                        z = false;
                    }
                    i5 = i3;
                    pnlHubSectionDuxo3 = pnlHubSectionDuxo2;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = -1633490746;
                    pnlHubSectionDuxo3 = pnlHubSectionDuxo2;
                    modifier3 = modifier2;
                    z = false;
                    i5 = i3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1324791738, i5, -1, "com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposable (PnlHubSectionComposable.kt:56)");
                }
                composerStartRestartGroup.startReplaceGroup(i4);
                zChangedInstance = composerStartRestartGroup.changedInstance(pnlHubSectionDuxo3) | ((i5 & 112) != 32 ? true : z);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PnlHubSectionComposable5.PnlHubSectionComposable$lambda$2$lambda$1(pnlHubSectionDuxo3, accountNumber, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(accountNumber, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, (i5 >> 3) & 14, 2);
                pnlHubSectionDuxo4 = pnlHubSectionDuxo3;
                int i8 = i5;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(pnlHubSectionDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(pnlHubSectionDuxo4.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(pnlHubSectionDuxo4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new PnlHubSectionComposable8(pnlHubSectionDuxo4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                KFunction kFunction = (KFunction) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                PnlHubSectionViewState pnlHubSectionViewStatePnlHubSectionComposable$lambda$3 = PnlHubSectionComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle);
                Event<PnlHubSectionEvent> eventPnlHubSectionComposable$lambda$4 = PnlHubSectionComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle2);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(pnlHubSectionDuxo4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new PnlHubSectionComposable9(pnlHubSectionDuxo4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier6 = modifier3;
                PnlHubSection(source, pnlHubSectionViewStatePnlHubSectionComposable$lambda$3, eventPnlHubSectionComposable$lambda$4, (Function0) ((KFunction) objRememberedValue3), modifier6, (Function0) kFunction, composerStartRestartGroup, ((i8 << 6) & 57344) | (i8 & 14), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
                pnlHubSectionDuxo5 = pnlHubSectionDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                pnlHubSectionDuxo5 = pnlHubSectionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PnlHubSectionComposable5.PnlHubSectionComposable$lambda$7(source, accountNumber, modifier4, pnlHubSectionDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                i5 = i3;
                pnlHubSectionDuxo3 = pnlHubSectionDuxo2;
                modifier3 = modifier5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(i4);
                zChangedInstance = composerStartRestartGroup.changedInstance(pnlHubSectionDuxo3) | ((i5 & 112) != 32 ? true : z);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PnlHubSectionComposable5.PnlHubSectionComposable$lambda$2$lambda$1(pnlHubSectionDuxo3, accountNumber, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(accountNumber, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, (i5 >> 3) & 14, 2);
                    pnlHubSectionDuxo4 = pnlHubSectionDuxo3;
                    int i82 = i5;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(pnlHubSectionDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(pnlHubSectionDuxo4.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(pnlHubSectionDuxo4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new PnlHubSectionComposable8(pnlHubSectionDuxo4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        KFunction kFunction2 = (KFunction) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        PnlHubSectionViewState pnlHubSectionViewStatePnlHubSectionComposable$lambda$32 = PnlHubSectionComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle3);
                        Event<PnlHubSectionEvent> eventPnlHubSectionComposable$lambda$42 = PnlHubSectionComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle22);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(pnlHubSectionDuxo4);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance3) {
                            objRememberedValue3 = new PnlHubSectionComposable9(pnlHubSectionDuxo4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier62 = modifier3;
                            PnlHubSection(source, pnlHubSectionViewStatePnlHubSectionComposable$lambda$32, eventPnlHubSectionComposable$lambda$42, (Function0) ((KFunction) objRememberedValue3), modifier62, (Function0) kFunction2, composerStartRestartGroup, ((i82 << 6) & 57344) | (i82 & 14), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier62;
                            pnlHubSectionDuxo5 = pnlHubSectionDuxo4;
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
    public static final LifecyclePauseOrDisposeEffectResult PnlHubSectionComposable$lambda$2$lambda$1(PnlHubSectionDuxo pnlHubSectionDuxo, String str, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final CompletableJob completableJobBind$feature_lib_portfolio_externalDebug = pnlHubSectionDuxo.bind$feature_lib_portfolio_externalDebug(str);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$PnlHubSectionComposable$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(completableJobBind$feature_lib_portfolio_externalDebug, null, 1, null);
            }
        };
    }

    private static final boolean PnlHubSection$lambda$12(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final PnlHubSectionViewState PnlHubSectionComposable$lambda$3(SnapshotState4<PnlHubSectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<PnlHubSectionEvent> PnlHubSectionComposable$lambda$4(SnapshotState4<Event<PnlHubSectionEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ff  */
    @SuppressLint({"UnusedTargetStateInContentKeyLambda"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlHubSection(final String source, final PnlHubSectionViewState pnlHubSectionViewState, final Event<PnlHubSectionEvent> event, final Function0<Unit> onNowIncludesCryptoTooltipAppear, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        Modifier modifier3;
        Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function0<Unit> function04;
        final SnapshotState snapshotState;
        String strStringResource;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        String strStringResource2;
        Modifier.Companion companion;
        boolean z;
        Composer composer2;
        final Function0<Unit> function05;
        final Modifier modifier4;
        Modifier modifierM26519popupTooltipBgaGok8;
        Composer composer3;
        EventConsumer<PnlHubSectionEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        final PnlHubSectionViewState viewState = pnlHubSectionViewState;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onNowIncludesCryptoTooltipAppear, "onNowIncludesCryptoTooltipAppear");
        Composer composerStartRestartGroup = composer.startRestartGroup(1804982286);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(source) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(event) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNowIncludesCryptoTooltipAppear) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                    function05 = function02;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function03 = (Function0) objRememberedValue;
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1804982286, i3, -1, "com.robinhood.android.common.portfolio.pnl.PnlHubSection (PnlHubSectionComposable.kt:86)");
                    }
                    if (viewState.isVisible() || viewState.getRealizedPnl() == null) {
                        final Function0<Unit> function06 = function03;
                        final Modifier modifier5 = modifier3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PnlHubSectionComposable5.PnlHubSection$lambda$10(source, pnlHubSectionViewState, event, onNowIncludesCryptoTooltipAppear, modifier5, function06, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    if (event != null) {
                        if ((event.getData() instanceof PnlHubSectionEvent.ShowNowIncludesCryptoTooltip) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$PnlHubSection$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m12320invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m12320invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    PnlHubSectionComposable5.PnlHubSection$lambda$13(snapshotState2, true);
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.REALIZED_GAIN_LOSS_SECTION, null, null, 6, null), null, 47, null), true, false, false, true, false, null, 108, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Modifier modifier6 = modifier3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = ((458752 & i3) == 131072) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(viewState) | ((i3 & 14) == 4);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == companion2.getEmpty()) {
                        function04 = function03;
                        snapshotState = snapshotState2;
                        Function0 function07 = new Function0() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PnlHubSectionComposable5.PnlHubSection$lambda$23$lambda$16$lambda$15(function04, navigator, context, pnlHubSectionViewState, source, snapshotState);
                            }
                        };
                        viewState = pnlHubSectionViewState;
                        composerStartRestartGroup.updateRememberedValue(function07);
                        objRememberedValue3 = function07;
                    } else {
                        function04 = function03;
                        snapshotState = snapshotState2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion5, false, null, null, (Function0) objRememberedValue3, 7, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierM4893clickableXHw0xAI$default, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierWeight$default = Row5.weight$default(row6, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Function0<Unit> function08 = function04;
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                    Modifier modifierWeight = row6.weight(companion5, 1.0f, false);
                    int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                    if (viewState.getPnlUpdatesEnabled()) {
                        composerStartRestartGroup.startReplaceGroup(74564504);
                        strStringResource = StringResources_androidKt.stringResource(C25781R.string.closed_pnl_hub_title, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(74681343);
                        strStringResource = StringResources_androidKt.stringResource(C25781R.string.pnl_hub_title, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierWeight, null, null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall(), composerStartRestartGroup, 817889280, 0, 7548);
                    Composer composer4 = composerStartRestartGroup;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion5, bentoTheme.getSpacing(composer4, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                    int i7 = WhenMappings.$EnumSwitchMapping$0[((LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection())).ordinal()];
                    if (i7 == 1) {
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_RIGHT_16;
                    } else {
                        if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_LEFT_16;
                    }
                    BentoIcon4.Size16 size16 = new BentoIcon4.Size16(serverToBentoAssetMapper2);
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composer4, i6).m21426getFg20d7_KjU();
                    if (viewState.getPnlUpdatesEnabled()) {
                        composer4.startReplaceGroup(75571384);
                        strStringResource2 = StringResources_androidKt.stringResource(C25781R.string.closed_pnl_hub_title, composer4, 0);
                        composer4.endReplaceGroup();
                    } else {
                        composer4.startReplaceGroup(75688223);
                        strStringResource2 = StringResources_androidKt.stringResource(C25781R.string.pnl_hub_title, composer4, 0);
                        composer4.endReplaceGroup();
                    }
                    BentoIcon2.m20644BentoIconFU0evQE(size16, strStringResource2, jM21426getFg20d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composer4, BentoIcon4.Size16.$stable, 48);
                    composer4.endNode();
                    composer4.startReplaceGroup(-641095025);
                    if (viewState.getShowNewTag()) {
                        companion = companion5;
                        InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(StringResources_androidKt.stringResource(C11511R.string.pnl_new_label, composer4, 0), PaddingKt.m5146paddingqDBjuR0$default(companion5, bentoTheme.getSpacing(composer4, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, false, null, null, composer4, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    } else {
                        companion = companion5;
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    composer4.startReplaceGroup(1847743326);
                    if (viewState.getSubtitle() != null) {
                        composer4.startReplaceGroup(1847748857);
                        Modifier modifierTestTag = TestTag3.testTag(companion, PNL_HUB_SECTION_SUBTITLE);
                        if (PnlHubSection$lambda$12(snapshotState)) {
                            PopupPositioning popupPositioning = PopupPositioning.BELOW;
                            Boolean bool = Boolean.TRUE;
                            composer4.startReplaceGroup(5004770);
                            Object objRememberedValue4 = composer4.rememberedValue();
                            if (objRememberedValue4 == companion2.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PnlHubSectionComposable5.PnlHubSection$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19(snapshotState);
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue4);
                            }
                            composer4.endReplaceGroup();
                            z = true;
                            composer3 = composer4;
                            modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(modifierTestTag, (16232 & 1) != 0 ? Boolean.TRUE : bool, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            } : (Function0) objRememberedValue4, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            } : onNowIncludesCryptoTooltipAppear, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : popupPositioning, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, PnlHubSectionComposable.INSTANCE.getLambda$2053543234$feature_lib_portfolio_externalDebug());
                        } else {
                            modifierM26519popupTooltipBgaGok8 = modifierTestTag;
                            z = true;
                            composer3 = composer4;
                        }
                        Modifier modifier7 = modifierM26519popupTooltipBgaGok8;
                        composer3.endReplaceGroup();
                        Composer composer5 = composer3;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(viewState.getSubtitle().intValue(), composer3, 0), modifier7, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer5, 0, 0, 8184);
                        composer4 = composer5;
                    } else {
                        z = true;
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    PnlHubSectionComposable pnlHubSectionComposable = PnlHubSectionComposable.INSTANCE;
                    composer2 = composer4;
                    BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, pnlHubSectionComposable.m12315getLambda$101310085$feature_lib_portfolio_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-442988999, z, new PnlHubSectionComposable6(viewState), composer4, 54), null, false, false, false, null, composer2, 199680, 0, 2007);
                    BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, pnlHubSectionComposable.getLambda$18864868$feature_lib_portfolio_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1917056990, z, new PnlHubSectionComposable7(viewState), composer2, 54), null, false, false, false, null, composer2, 199680, 0, 2007);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function05 = function08;
                    modifier4 = modifier6;
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PnlHubSectionComposable5.PnlHubSection$lambda$24(source, viewState, event, onNowIncludesCryptoTooltipAppear, modifier4, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function02 = function0;
            if ((74899 & i3) == 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (viewState.isVisible()) {
                }
                final Function0 function062 = function03;
                final Modifier modifier52 = modifier3;
                if (ComposerKt.isTraceInProgress()) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PnlHubSection$lambda$13(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubSection$lambda$23$lambda$16$lambda$15(Function0 function0, Navigator navigator, Context context, PnlHubSectionViewState pnlHubSectionViewState, String str, SnapshotState snapshotState) {
        PnlHubSection$lambda$13(snapshotState, false);
        function0.invoke();
        Navigator.DefaultImpls.showFragment$default(navigator, context, new PnlHubContract.Key.AccountNumberKey(pnlHubSectionViewState.getAccountNumber(), str, pnlHubSectionViewState.getSupportedAssetTypes(), null, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubSection$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19(SnapshotState snapshotState) {
        PnlHubSection$lambda$13(snapshotState, false);
        return Unit.INSTANCE;
    }
}
