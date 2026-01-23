package com.robinhood.android.equitydetail.p123ui.statistics;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.bidask.BidAsk;
import com.robinhood.android.compose.bidask.BidAskDetails2;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRow;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.responsive.WindowSize;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.Job;
import okhttp3.HttpUrl;

/* compiled from: StatisticsSection.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0010\"\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"StatisticsSection", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "onBidAskClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionDuxo;", "(Lcom/robinhood/models/db/Instrument;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionDuxo;Landroidx/compose/runtime/Composer;II)V", "StatisticsSectionComposable", "state", "Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionViewState;", "columnWidth", "", "(Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionViewState;ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "COLUMN_SPACING", "Landroidx/compose/ui/unit/Dp;", "F", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.statistics.StatisticsSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class StatisticsSection {
    private static final float COLUMN_SPACING = C2002Dp.m7995constructorimpl(22);

    /* compiled from: StatisticsSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.statistics.StatisticsSectionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WindowSize.values().length];
            try {
                iArr[WindowSize.Compact.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WindowSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WindowSize.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatisticsSection$lambda$4(Instrument instrument, Function0 function0, Modifier modifier, StatisticsSectionDuxo statisticsSectionDuxo, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        StatisticsSection(instrument, function0, modifier, statisticsSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatisticsSectionComposable$lambda$11(StatisticsSectionViewState statisticsSectionViewState, int i, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) throws Resources.NotFoundException {
        StatisticsSectionComposable(statisticsSectionViewState, i, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StatisticsSection(final Instrument instrument, final Function0<Unit> onBidAskClicked, Modifier modifier, StatisticsSectionDuxo statisticsSectionDuxo, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        StatisticsSectionDuxo statisticsSectionDuxo2;
        int i4;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        final StatisticsSectionDuxo statisticsSectionDuxo3;
        int i5;
        final int i6;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier4;
        final StatisticsSectionDuxo statisticsSectionDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(onBidAskClicked, "onBidAskClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(717398189);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrument) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBidAskClicked) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    statisticsSectionDuxo2 = statisticsSectionDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(statisticsSectionDuxo2) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    statisticsSectionDuxo2 = statisticsSectionDuxo;
                }
                i3 |= i8;
            } else {
                statisticsSectionDuxo2 = statisticsSectionDuxo;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    modifier3 = modifier2;
                } else {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        String str = instrument.getId() + "_StatisticsSection";
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(StatisticsSectionDuxo.class), current, str, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equitydetail.ui.statistics.StatisticsSectionKt$StatisticsSection$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equitydetail.ui.statistics.StatisticsSectionKt$StatisticsSection$$inlined$duxo$1.1
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
                        i4 &= -7169;
                        statisticsSectionDuxo3 = (StatisticsSectionDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(717398189, i4, -1, "com.robinhood.android.equitydetail.ui.statistics.StatisticsSection (StatisticsSection.kt:53)");
                    }
                    i5 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6).ordinal()];
                    if (i5 == 1) {
                        i6 = 2;
                    } else {
                        if (i5 != 2 && i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i6 = 3;
                    }
                    UUID id = instrument.getId();
                    Integer numValueOf = Integer.valueOf(i6);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(statisticsSectionDuxo3) | composerStartRestartGroup.changedInstance(instrument) | composerStartRestartGroup.changed(i6);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.statistics.StatisticsSectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return StatisticsSection.StatisticsSection$lambda$2$lambda$1(statisticsSectionDuxo3, instrument, i6, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(id, numValueOf, lifecycleOwner, (Function1) objRememberedValue, composerStartRestartGroup, 0, 0);
                    Composer composer2 = composerStartRestartGroup;
                    Modifier modifier5 = modifier3;
                    StatisticsSectionComposable(StatisticsSection$lambda$3(FlowExtKt.collectAsStateWithLifecycle(statisticsSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), i6, onBidAskClicked, modifier5, composer2, (i4 << 3) & 8064, 0);
                    composerStartRestartGroup = composer2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    statisticsSectionDuxo4 = statisticsSectionDuxo3;
                }
                statisticsSectionDuxo3 = statisticsSectionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                i5 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6).ordinal()];
                if (i5 == 1) {
                }
                UUID id2 = instrument.getId();
                Integer numValueOf2 = Integer.valueOf(i6);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(statisticsSectionDuxo3) | composerStartRestartGroup.changedInstance(instrument) | composerStartRestartGroup.changed(i6);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.statistics.StatisticsSectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return StatisticsSection.StatisticsSection$lambda$2$lambda$1(statisticsSectionDuxo3, instrument, i6, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(id2, numValueOf2, lifecycleOwner2, (Function1) objRememberedValue, composerStartRestartGroup, 0, 0);
                    Composer composer22 = composerStartRestartGroup;
                    Modifier modifier52 = modifier3;
                    StatisticsSectionComposable(StatisticsSection$lambda$3(FlowExtKt.collectAsStateWithLifecycle(statisticsSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), i6, onBidAskClicked, modifier52, composer22, (i4 << 3) & 8064, 0);
                    composerStartRestartGroup = composer22;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    statisticsSectionDuxo4 = statisticsSectionDuxo3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                statisticsSectionDuxo4 = statisticsSectionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.statistics.StatisticsSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StatisticsSection.StatisticsSection$lambda$4(instrument, onBidAskClicked, modifier4, statisticsSectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i7 == 0) {
                }
                if ((i2 & 8) == 0) {
                    statisticsSectionDuxo3 = statisticsSectionDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                i5 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6).ordinal()];
                if (i5 == 1) {
                }
                UUID id22 = instrument.getId();
                Integer numValueOf22 = Integer.valueOf(i6);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(statisticsSectionDuxo3) | composerStartRestartGroup.changedInstance(instrument) | composerStartRestartGroup.changed(i6);
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
    public static final LifecyclePauseOrDisposeEffectResult StatisticsSection$lambda$2$lambda$1(StatisticsSectionDuxo statisticsSectionDuxo, Instrument instrument, int i, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = statisticsSectionDuxo.bind(instrument, i);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equitydetail.ui.statistics.StatisticsSectionKt$StatisticsSection$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StatisticsSectionComposable(final StatisticsSectionViewState state, final int i, final Function0<Unit> onBidAskClicked, Modifier modifier, Composer composer, final int i2, final int i3) throws Resources.NotFoundException {
        int i4;
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Context context;
        int i6;
        int i7;
        BentoTheme bentoTheme;
        int i8;
        C2002Dp c2002Dp;
        int i9;
        ImmutableList<SdpDataRow3> dataRows;
        String grossExpenseRatioBannerContent;
        int i10;
        final HttpUrl prospectusUrl;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onBidAskClicked, "onBidAskClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-613713290);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onBidAskClicked) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-613713290, i4, -1, "com.robinhood.android.equitydetail.ui.statistics.StatisticsSectionComposable (StatisticsSection.kt:83)");
                    }
                    Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i11 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme2.getColors(composerStartRestartGroup, i11).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), 5, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15314R.string.instrument_detail_statistics_label, composerStartRestartGroup, 0), TestTag3.testTag(companion3, "title"), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i11).getDisplayCapsuleMedium(), composerStartRestartGroup, 48, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(1227896590);
                    if (state.getHasGoldL2UpsellImprovements()) {
                        context = context2;
                        i6 = i4;
                        i7 = i11;
                        bentoTheme = bentoTheme2;
                    } else {
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                        i7 = i11;
                        context = context2;
                        i6 = i4;
                        bentoTheme = bentoTheme2;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composerStartRestartGroup, i7).m21427getFg30d7_KjU(), ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(TestTag3.testTag(companion3, StatisticsSection2.STATS_CARET), state.isInGoldRegionGate(), null, null, onBidAskClicked, 6, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, null, null, 14, null), null, null, new Component(Component.ComponentType.STATS_SECTION, "gold_l2_stats_section_caret", null, 4, null), null, 45, null), false, false, false, true, false, null, 110, null), null, false, composerStartRestartGroup, 48 | BentoIcon4.Size24.$stable, 48);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(412202043);
                    if (state.getShowBidAskDetails()) {
                        i8 = i7;
                        c2002Dp = null;
                        i9 = 1;
                    } else {
                        i8 = i7;
                        c2002Dp = null;
                        BidAskDetails2.m12533BidAskDetailsIColEu4(state.getBidAsk(), ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(TestTag3.testTag(companion3, StatisticsSection2.BID_ASK), state.isInGoldRegionGate(), null, null, onBidAskClicked, 6, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, null, null, 14, null), null, null, new Component(Component.ComponentType.SECTION_HEADER, "gold_l2_bid_ask_detail", null, 4, null), null, 45, null), false, false, false, true, false, null, 110, null), true, C2002Dp.m7993boximpl(COLUMN_SPACING), composerStartRestartGroup, BidAsk.$stable | 3456, 0);
                        i9 = 1;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 1, null), StatisticsSection2.DIVIDER), bentoTheme.getColors(composerStartRestartGroup, i8).m21427getFg30d7_KjU(), C2002Dp.m7995constructorimpl((float) 0.5d), composerStartRestartGroup, 384, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    dataRows = state.getDataRows();
                    composerStartRestartGroup.startReplaceGroup(412242324);
                    if (dataRows != null) {
                        SdpDataRow.m13861EvenlyWeightedSdpDataGridoilTxCY(TestTag3.testTag(companion3, StatisticsSection2.DATA_GRID), dataRows, i, state.isInBidAskSdpStatsExperiment() ? C2002Dp.m7993boximpl(COLUMN_SPACING) : c2002Dp, null, composerStartRestartGroup, ((i6 << 3) & 896) | 6, 16);
                        composerStartRestartGroup = composerStartRestartGroup;
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    grossExpenseRatioBannerContent = state.getGrossExpenseRatioBannerContent();
                    composerStartRestartGroup.startReplaceGroup(412253807);
                    if (grossExpenseRatioBannerContent != null) {
                        i10 = i8;
                    } else {
                        Composer composer2 = composerStartRestartGroup;
                        i10 = i8;
                        BentoMarkdownText2.BentoMarkdownText(grossExpenseRatioBannerContent, androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(Background3.m4871backgroundbw27NRU(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, i9, c2002Dp), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), i9, c2002Dp), bentoTheme.getColors(composerStartRestartGroup, i8).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoInfoBanner.INSTANCE.m20647getCornerRadiusD9Ej5fM())), bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM()), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i8).getTextS(), 0, bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU(), false, composer2, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 24);
                        composerStartRestartGroup = composer2;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    prospectusUrl = state.getProspectusUrl();
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    composerStartRestartGroup.startReplaceGroup(412282703);
                    if (prospectusUrl != null) {
                        Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.VIEW_PROSPECTUS, null, null, null, 59, null), false, false, false, true, false, null, 110, null), StatisticsSection2.PROSPECTUS_BUTTON);
                        String strStringResource = StringResources_androidKt.stringResource(C15314R.string.instrument_detail_statistics_prospectus_link, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(prospectusUrl);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.statistics.StatisticsSectionKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return StatisticsSection.StatisticsSectionComposable$lambda$10$lambda$9$lambda$8(context, prospectusUrl);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierTestTag, null, null, false, null, composerStartRestartGroup, 0, 120);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.statistics.StatisticsSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return StatisticsSection.StatisticsSectionComposable$lambda$11(state, i, onBidAskClicked, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            modifier2 = modifier;
            if ((i4 & 1171) == 1170) {
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Context context22 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i112 = BentoTheme.$stable;
                Modifier modifier52 = modifier4;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme22.getColors(composerStartRestartGroup, i112).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i112).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i112).m21590getDefaultD9Ej5fM(), 5, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15314R.string.instrument_detail_statistics_label, composerStartRestartGroup, 0), TestTag3.testTag(companion32, "title"), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composerStartRestartGroup, i112).getDisplayCapsuleMedium(), composerStartRestartGroup, 48, 0, 8188);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(1227896590);
                        if (state.getHasGoldL2UpsellImprovements()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(412202043);
                        if (state.getShowBidAskDetails()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        dataRows = state.getDataRows();
                        composerStartRestartGroup.startReplaceGroup(412242324);
                        if (dataRows != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        grossExpenseRatioBannerContent = state.getGrossExpenseRatioBannerContent();
                        composerStartRestartGroup.startReplaceGroup(412253807);
                        if (grossExpenseRatioBannerContent != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        prospectusUrl = state.getProspectusUrl();
                        UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        composerStartRestartGroup.startReplaceGroup(412282703);
                        if (prospectusUrl != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i4 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final StatisticsSectionViewState StatisticsSection$lambda$3(SnapshotState4<StatisticsSectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatisticsSectionComposable$lambda$10$lambda$9$lambda$8(Context context, HttpUrl httpUrl) {
        WebUtils.viewUrl$default(WebUtils.INSTANCE, context, httpUrl, 0, 4, null);
        return Unit.INSTANCE;
    }
}
