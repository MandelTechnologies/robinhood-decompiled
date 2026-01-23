package com.robinhood.android.advisory.tlh.summary;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.advisory.tlh.Components2;
import com.robinhood.android.advisory.tlh.DestinationsKt;
import com.robinhood.android.advisory.tlh.gnl.GainsAndLossesDashboardSection;
import com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreen;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoToast2;
import com.robinhood.compose.bento.component.BentoToast3;
import com.robinhood.compose.bento.component.BentoToast4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TaxLossHarvestingDashboardScreen.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001aE\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"TaxLossHarvestDashboardScreen", "", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onInternalNavigate", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "duxo", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-tax-loss-harvesting_externalDebug", "viewState", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState;", "pendingCta", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$Cta;", "showYearSelectionBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class TaxLossHarvestingDashboardScreen {

    /* compiled from: TaxLossHarvestingDashboardScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaxLossHarvestDashboard.CtaAction.values().length];
            try {
                iArr[TaxLossHarvestDashboard.CtaAction.ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxLossHarvestDashboard.CtaAction.DISABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaxLossHarvestDashboard.CtaAction.OPEN_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestDashboardScreen$lambda$14(Function0 function0, Modifier modifier, Function1 function1, TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo, int i, int i2, Composer composer, int i3) {
        TaxLossHarvestDashboardScreen(function0, modifier, function1, taxLossHarvestDashboardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestDashboardScreen$lambda$1$lambda$0(ComposableDestination it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLossHarvestDashboardScreen(final Function0<Unit> onBackClicked, Modifier modifier, Function1<? super ComposableDestination, Unit> function1, TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super ComposableDestination, Unit> function12;
        TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo2;
        int i5;
        Modifier modifier3;
        Function1<? super ComposableDestination, Unit> function13;
        Composer composer2;
        int i6;
        int i7;
        final Function1<? super ComposableDestination, Unit> function14;
        final TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo3;
        Composer composer3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        BentoToast2 current;
        final UriHandler uriHandler;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        boolean zChanged;
        Object objRememberedValue4;
        Composer composer4;
        final Modifier modifier4;
        final Function1<? super ComposableDestination, Unit> function15;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(28393364);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        taxLossHarvestDashboardDuxo2 = taxLossHarvestDashboardDuxo;
                        int i9 = composerStartRestartGroup.changedInstance(taxLossHarvestDashboardDuxo2) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        taxLossHarvestDashboardDuxo2 = taxLossHarvestDashboardDuxo;
                    }
                    i3 |= i9;
                } else {
                    taxLossHarvestDashboardDuxo2 = taxLossHarvestDashboardDuxo;
                }
                i5 = i3;
                if ((i5 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer4 = composerStartRestartGroup;
                    function15 = function12;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$1$lambda$0((ComposableDestination) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function13 = (Function1) objRememberedValue5;
                        } else {
                            function13 = function12;
                        }
                        if ((i2 & 8) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current2 == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            composer2 = composerStartRestartGroup;
                            i6 = 0;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(TaxLossHarvestDashboardDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer2, 0);
                            composer2.endReplaceGroup();
                            int i10 = i5 & (-7169);
                            taxLossHarvestDashboardDuxo3 = (TaxLossHarvestDashboardDuxo) baseDuxo;
                            i7 = i10;
                            function14 = function13;
                        } else {
                            composer2 = composerStartRestartGroup;
                            i6 = 0;
                            i7 = i5;
                            function14 = function13;
                            taxLossHarvestDashboardDuxo3 = taxLossHarvestDashboardDuxo2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i5 &= -7169;
                        }
                        modifier3 = modifier2;
                        i6 = 0;
                        i7 = i5;
                        function14 = function12;
                        taxLossHarvestDashboardDuxo3 = taxLossHarvestDashboardDuxo2;
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(28393364, i7, -1, "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardScreen (TaxLossHarvestingDashboardScreen.kt:69)");
                    }
                    ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(i6, composer2, i6, 1);
                    int i11 = i7;
                    composer3 = composer2;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(taxLossHarvestDashboardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                    current = BentoToast4.getLocalBentoToastHost().getCurrent(composer3, BentoToast3.$stable);
                    uriHandler = (UriHandler) composer3.consume(CompositionLocalsKt.getLocalUriHandler());
                    composer3.startReplaceGroup(1849434622);
                    objRememberedValue = composer3.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(1849434622);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i11 & 896) != 256) | composer3.changedInstance(taxLossHarvestDashboardDuxo3) | composer3.changedInstance(uriHandler);
                    objRememberedValue3 = composer3.rememberedValue();
                    if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$12$lambda$11(snapshotState, taxLossHarvestDashboardDuxo3, function14, uriHandler, (TaxLossHarvestDashboard.Cta) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function16 = (Function1) objRememberedValue3;
                    composer3.endReplaceGroup();
                    String updateEnrollmentToastText = TaxLossHarvestDashboardScreen$lambda$2(snapshotState4CollectAsStateWithLifecycle).getUpdateEnrollmentToastText();
                    composer3.startReplaceGroup(-1633490746);
                    zChanged = composer3.changed(snapshotState4CollectAsStateWithLifecycle) | composer3.changedInstance(current);
                    objRememberedValue4 = composer3.rememberedValue();
                    if (!zChanged || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TaxLossHarvestingDashboardScreen2(snapshotState4CollectAsStateWithLifecycle, current, null);
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.LaunchedEffect(updateEnrollmentToastText, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer3, 0);
                    taxLossHarvestDashboardDuxo2 = taxLossHarvestDashboardDuxo3;
                    composer4 = composer3;
                    Modifier modifier5 = modifier3;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_DASHBOARD, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1122973951, true, new C94853(modifier5, onBackClicked, snapshotState4CollectAsStateWithLifecycle, snapshotState2, scrollStateRememberScrollState, function16, snapshotState, taxLossHarvestDashboardDuxo2, function14, uriHandler), composer4, 54), composer4, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    function15 = function14;
                }
                final TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo4 = taxLossHarvestDashboardDuxo2;
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$14(onBackClicked, modifier4, function15, taxLossHarvestDashboardDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function12 = function1;
            if ((i & 3072) == 0) {
            }
            i5 = i3;
            if ((i5 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(i6, composer2, i6, 1);
                    int i112 = i7;
                    composer3 = composer2;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(taxLossHarvestDashboardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                    current = BentoToast4.getLocalBentoToastHost().getCurrent(composer3, BentoToast3.$stable);
                    uriHandler = (UriHandler) composer3.consume(CompositionLocalsKt.getLocalUriHandler());
                    composer3.startReplaceGroup(1849434622);
                    objRememberedValue = composer3.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(1849434622);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState22 = (SnapshotState) objRememberedValue2;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i112 & 896) != 256) | composer3.changedInstance(taxLossHarvestDashboardDuxo3) | composer3.changedInstance(uriHandler);
                    objRememberedValue3 = composer3.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$12$lambda$11(snapshotState, taxLossHarvestDashboardDuxo3, function14, uriHandler, (TaxLossHarvestDashboard.Cta) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                        Function1 function162 = (Function1) objRememberedValue3;
                        composer3.endReplaceGroup();
                        String updateEnrollmentToastText2 = TaxLossHarvestDashboardScreen$lambda$2(snapshotState4CollectAsStateWithLifecycle).getUpdateEnrollmentToastText();
                        composer3.startReplaceGroup(-1633490746);
                        zChanged = composer3.changed(snapshotState4CollectAsStateWithLifecycle) | composer3.changedInstance(current);
                        objRememberedValue4 = composer3.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue4 = new TaxLossHarvestingDashboardScreen2(snapshotState4CollectAsStateWithLifecycle, current, null);
                            composer3.updateRememberedValue(objRememberedValue4);
                            composer3.endReplaceGroup();
                            EffectsKt.LaunchedEffect(updateEnrollmentToastText2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer3, 0);
                            taxLossHarvestDashboardDuxo2 = taxLossHarvestDashboardDuxo3;
                            composer4 = composer3;
                            Modifier modifier52 = modifier3;
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_DASHBOARD, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1122973951, true, new C94853(modifier52, onBackClicked, snapshotState4CollectAsStateWithLifecycle, snapshotState22, scrollStateRememberScrollState2, function162, snapshotState, taxLossHarvestDashboardDuxo2, function14, uriHandler), composer4, 54), composer4, 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier52;
                            function15 = function14;
                        }
                    }
                }
            }
            final TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo42 = taxLossHarvestDashboardDuxo2;
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((i & 3072) == 0) {
        }
        i5 = i3;
        if ((i5 & 1171) == 1170) {
        }
        final TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo422 = taxLossHarvestDashboardDuxo2;
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TaxLossHarvestDashboardScreen$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TaxLossHarvestDashboardScreen$performCtaAction(TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo, Function1<? super ComposableDestination, Unit> function1, UriHandler uriHandler, TaxLossHarvestDashboard.Cta cta) {
        String actionUrl;
        Object objM28550constructorimpl;
        int i = WhenMappings.$EnumSwitchMapping$0[cta.getAction().ordinal()];
        if (i == 1) {
            taxLossHarvestDashboardDuxo.updateEnrollment(true);
            return;
        }
        if (i == 2) {
            taxLossHarvestDashboardDuxo.updateEnrollment(false);
            return;
        }
        if (i == 3 && (actionUrl = cta.getActionUrl()) != null) {
            ComposableDestination taxLossHarvestDestinationFromRoute = DestinationsKt.getTaxLossHarvestDestinationFromRoute(actionUrl);
            if (taxLossHarvestDestinationFromRoute != null) {
                function1.invoke(taxLossHarvestDestinationFromRoute);
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                uriHandler.openUri(actionUrl);
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            Result.m28549boximpl(objM28550constructorimpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxLossHarvestDashboardViewState TaxLossHarvestDashboardScreen$lambda$2(SnapshotState4<TaxLossHarvestDashboardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxLossHarvestDashboard.Cta TaxLossHarvestDashboardScreen$lambda$4(SnapshotState<TaxLossHarvestDashboard.Cta> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TaxLossHarvestDashboardScreen$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: TaxLossHarvestingDashboardScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3 */
    static final class C94853 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TaxLossHarvestDashboardDuxo $duxo;
        final /* synthetic */ Function1<TaxLossHarvestDashboard.Cta, Unit> $handleCtaAction;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onBackClicked;
        final /* synthetic */ Function1<ComposableDestination, Unit> $onInternalNavigate;
        final /* synthetic */ SnapshotState<TaxLossHarvestDashboard.Cta> $pendingCta$delegate;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ SnapshotState<Boolean> $showYearSelectionBottomSheet$delegate;
        final /* synthetic */ UriHandler $uriHandler;
        final /* synthetic */ SnapshotState4<TaxLossHarvestDashboardViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C94853(Modifier modifier, Function0<Unit> function0, SnapshotState4<TaxLossHarvestDashboardViewState> snapshotState4, SnapshotState<Boolean> snapshotState, ScrollState scrollState, Function1<? super TaxLossHarvestDashboard.Cta, Unit> function1, SnapshotState<TaxLossHarvestDashboard.Cta> snapshotState2, TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo, Function1<? super ComposableDestination, Unit> function12, UriHandler uriHandler) {
            this.$modifier = modifier;
            this.$onBackClicked = function0;
            this.$viewState$delegate = snapshotState4;
            this.$showYearSelectionBottomSheet$delegate = snapshotState;
            this.$scrollState = scrollState;
            this.$handleCtaAction = function1;
            this.$pendingCta$delegate = snapshotState2;
            this.$duxo = taxLossHarvestDashboardDuxo;
            this.$onInternalNavigate = function12;
            this.$uriHandler = uriHandler;
        }

        /* compiled from: TaxLossHarvestingDashboardScreen.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
            final /* synthetic */ Function1<TaxLossHarvestDashboard.Cta, Unit> $handleCtaAction;
            final /* synthetic */ ScrollState $scrollState;
            final /* synthetic */ SnapshotState4<TaxLossHarvestDashboardViewState> $viewState$delegate;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(ScrollState scrollState, Function1<? super TaxLossHarvestDashboard.Cta, Unit> function1, SnapshotState4<TaxLossHarvestDashboardViewState> snapshotState4) {
                this.$scrollState = scrollState;
                this.$handleCtaAction = function1;
                this.$viewState$delegate = snapshotState4;
            }

            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                int i2;
                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                if ((i & 6) == 0) {
                    i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1421615606, i2, -1, "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardScreen.<anonymous>.<anonymous> (TaxLossHarvestingDashboardScreen.kt:159)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
                ScrollState scrollState = this.$scrollState;
                final Function1<TaxLossHarvestDashboard.Cta, Unit> function1 = this.$handleCtaAction;
                SnapshotState4<TaxLossHarvestDashboardViewState> snapshotState4 = this.$viewState$delegate;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                TaxLossHarvestingSummaryScreen3.TaxLossHarvestDashboardComposable(TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$2(snapshotState4), function1, null, composer, 0, 4);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21591getLargeD9Ej5fM()), composer, 0);
                GainsAndLossesDashboardSection.GainsAndLossesDashboardSection(null, TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$2(snapshotState4).getGainsAndLossHeader(), TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$2(snapshotState4).getActiveYear(), null, composer, 0, 9);
                composer.endNode();
                final TaxLossHarvestDashboard.Cta cta = TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$2(snapshotState4).getCta();
                composer.startReplaceGroup(394399527);
                if (cta != null) {
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    String loggingIdentifier = cta.getLoggingIdentifier();
                    if (loggingIdentifier == null) {
                        loggingIdentifier = "";
                    }
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, loggingIdentifier, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
                    String title = cta.getTitle();
                    BentoButtons.Type type2 = cta.isPrimary() ? BentoButtons.Type.Primary : BentoButtons.Type.Secondary;
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function1) | composer.changedInstance(cta);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TaxLossHarvestingDashboardScreen.C94853.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2$lambda$1(function1, cta);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, title, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, type2, false, false, null, null, null, null, false, null, composer, 0, 0, 8168);
                }
                composer.endReplaceGroup();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                invoke(paddingValues, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(Function1 function1, TaxLossHarvestDashboard.Cta cta) {
                function1.invoke(cta);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: TaxLossHarvestingDashboardScreen.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function3<Row5, Composer, Integer, Unit> {
            final /* synthetic */ SnapshotState<Boolean> $showYearSelectionBottomSheet$delegate;
            final /* synthetic */ SnapshotState4<TaxLossHarvestDashboardViewState> $viewState$delegate;

            AnonymousClass1(SnapshotState4<TaxLossHarvestDashboardViewState> snapshotState4, SnapshotState<Boolean> snapshotState) {
                this.$viewState$delegate = snapshotState4;
                this.$showYearSelectionBottomSheet$delegate = snapshotState;
            }

            public final void invoke(Row5 TaxLossHarvestingScaffold, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(TaxLossHarvestingScaffold, "$this$TaxLossHarvestingScaffold");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1393779238, i, -1, "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardScreen.<anonymous>.<anonymous> (TaxLossHarvestingDashboardScreen.kt:128)");
                }
                String activeYear = TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$2(this.$viewState$delegate).getActiveYear();
                if (TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$2(this.$viewState$delegate).getAvailableYears().size() > 1 && activeYear != null) {
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM());
                    Modifier modifierClip = Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()));
                    composer.startReplaceGroup(5004770);
                    final SnapshotState<Boolean> snapshotState = this.$showYearSelectionBottomSheet$delegate;
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TaxLossHarvestingDashboardScreen.C94853.AnonymousClass1.invoke$lambda$1$lambda$0(snapshotState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue, 7, null), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(activeYear, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16366);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size12.$stable | 48, 56);
                    composer.endNode();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                invoke(row5, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$8(snapshotState, true);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
            TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$5(snapshotState, null);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1122973951, i, -1, "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardScreen.<anonymous> (TaxLossHarvestingDashboardScreen.kt:124)");
            }
            Components2.TaxLossHarvestingScaffold(this.$onBackClicked, ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null), false, false, null, ComposableLambda3.rememberComposableLambda(-1393779238, true, new AnonymousClass1(this.$viewState$delegate, this.$showYearSelectionBottomSheet$delegate), composer, 54), ComposableLambda3.rememberComposableLambda(1421615606, true, new AnonymousClass2(this.$scrollState, this.$handleCtaAction, this.$viewState$delegate), composer, 54), composer, 1769472, 28);
            TaxLossHarvestDashboard.Cta ctaTaxLossHarvestDashboardScreen$lambda$4 = TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$4(this.$pendingCta$delegate);
            TaxLossHarvestDashboard.ActionModal actionModal = ctaTaxLossHarvestDashboardScreen$lambda$4 != null ? ctaTaxLossHarvestDashboardScreen$lambda$4.getActionModal() : null;
            composer.startReplaceGroup(1141295886);
            if (actionModal != null) {
                final SnapshotState<TaxLossHarvestDashboard.Cta> snapshotState = this.$pendingCta$delegate;
                TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo = this.$duxo;
                Function1<ComposableDestination, Unit> function1 = this.$onInternalNavigate;
                UriHandler uriHandler = this.$uriHandler;
                composer.startReplaceGroup(5004770);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaxLossHarvestingDashboardScreen.C94853.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(815506324, true, new TaxLossHarvestingDashboardScreen3(actionModal, taxLossHarvestDashboardDuxo, function1, uriHandler, snapshotState), composer, 54), composer, 1572870, 62);
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            if (TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$7(this.$showYearSelectionBottomSheet$delegate)) {
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState2 = this.$showYearSelectionBottomSheet$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaxLossHarvestingDashboardScreen.C94853.invoke$lambda$4$lambda$3(snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(37880395, true, new AnonymousClass5(this.$viewState$delegate, this.$duxo, this.$showYearSelectionBottomSheet$delegate), composer, 54), composer, 1572870, 62);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState) {
            TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$8(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* compiled from: TaxLossHarvestingDashboardScreen.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$5, reason: invalid class name */
        static final class AnonymousClass5 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
            final /* synthetic */ TaxLossHarvestDashboardDuxo $duxo;
            final /* synthetic */ SnapshotState<Boolean> $showYearSelectionBottomSheet$delegate;
            final /* synthetic */ SnapshotState4<TaxLossHarvestDashboardViewState> $viewState$delegate;

            AnonymousClass5(SnapshotState4<TaxLossHarvestDashboardViewState> snapshotState4, TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo, SnapshotState<Boolean> snapshotState) {
                this.$viewState$delegate = snapshotState4;
                this.$duxo = taxLossHarvestDashboardDuxo;
                this.$showYearSelectionBottomSheet$delegate = snapshotState;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                invoke(rhModalBottomSheet5, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(37880395, i, -1, "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardScreen.<anonymous>.<anonymous> (TaxLossHarvestingDashboardScreen.kt:258)");
                }
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.m5173sizeInqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(300), 7, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer, 6, 0);
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo);
                final SnapshotState4<TaxLossHarvestDashboardViewState> snapshotState4 = this.$viewState$delegate;
                final TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo = this.$duxo;
                final SnapshotState<Boolean> snapshotState = this.$showYearSelectionBottomSheet$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$5$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TaxLossHarvestingDashboardScreen.C94853.AnonymousClass5.invoke$lambda$4$lambda$3(snapshotState4, taxLossHarvestDashboardDuxo, snapshotState, (LazyListScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$4$lambda$3(final SnapshotState4 snapshotState4, final TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo, final SnapshotState snapshotState, LazyListScope LazyColumn) {
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                final ImmutableList<String> availableYears = TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$2(snapshotState4).getAvailableYears();
                final C9480x3eae80d9 c9480x3eae80d9 = new Function1() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$5$invoke$lambda$4$lambda$3$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(String str) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((String) obj);
                    }
                };
                LazyColumn.items(availableYears.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$5$invoke$lambda$4$lambda$3$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c9480x3eae80d9.invoke(availableYears.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$5$invoke$lambda$4$lambda$3$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                        int i3;
                        long value;
                        if ((i2 & 6) == 0) {
                            i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        final String str = (String) availableYears.get(i);
                        composer.startReplaceGroup(-1758178515);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer.changedInstance(taxLossHarvestDashboardDuxo) | composer.changed(str);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo2 = taxLossHarvestDashboardDuxo;
                            final SnapshotState snapshotState2 = snapshotState;
                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$5$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    taxLossHarvestDashboardDuxo2.onYearSelected(str);
                                    TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$8(snapshotState2, false);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxSize$default, false, null, null, (Function0) objRememberedValue, 7, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        Color colorM6701boximpl = Color.m6701boximpl(bentoTheme.getColors(composer, i4).m21373getBg30d7_KjU());
                        colorM6701boximpl.getValue();
                        Color color = Intrinsics.areEqual(str, TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$2(snapshotState4).getActiveYear()) ? colorM6701boximpl : null;
                        composer.startReplaceGroup(-2134913104);
                        if (color != null) {
                            value = color.getValue();
                        } else {
                            value = bentoTheme.getColors(composer, i4).m21371getBg0d7_KjU();
                        }
                        composer.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5142padding3ABfNKs(Background3.m4871backgroundbw27NRU(modifierM4893clickableXHw0xAI$default, value, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4))), bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i4).getTextL(), composer, 0, 0, 8124);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestDashboardScreen$lambda$12$lambda$11(SnapshotState snapshotState, TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo, Function1 function1, UriHandler uriHandler, TaxLossHarvestDashboard.Cta cta) {
        Intrinsics.checkNotNullParameter(cta, "cta");
        if (cta.getActionModal() == null) {
            TaxLossHarvestDashboardScreen$performCtaAction(taxLossHarvestDashboardDuxo, function1, uriHandler, cta);
        } else {
            snapshotState.setValue(cta);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TaxLossHarvestDashboardScreen$lambda$5(SnapshotState<TaxLossHarvestDashboard.Cta> snapshotState, TaxLossHarvestDashboard.Cta cta) {
        snapshotState.setValue(cta);
    }
}
