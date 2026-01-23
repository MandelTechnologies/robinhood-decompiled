package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.RippleKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
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
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.extensions.ModifiersKt;
import com.robinhood.android.equitydetail.p123ui.similarinstruments.SimilarInstrumentsV2Duxo4;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: SimilarInstrumentsV2.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0001¢\u0006\u0002\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001aS\u0010\u0015\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 H\u0003¢\u0006\u0004\b!\u0010\"\u001a0\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H\u0002\u001a \u0010*\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010+\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\r\u0010,\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010-\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010.\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010/\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a6\u00100\u001a\u00020\u00132\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0001\"\u0016\u00102\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b3\u00104\"\u0016\u00105\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b6\u00104\"\u0016\u00107\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b8\u00104¨\u00069²\u0006\n\u0010:\u001a\u00020;X\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020\u001cX\u008a\u008e\u0002"}, m3636d2 = {"SimilarInstrumentsV2", "", "instrumentUuid", "Ljava/util/UUID;", "duxo", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2Duxo;", "(Ljava/util/UUID;Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2Duxo;Landroidx/compose/runtime/Composer;II)V", "SimilarInstrumentsV2Loading", "(Landroidx/compose/runtime/Composer;I)V", "instrumentSymbol", "", "similarInstrumentsUuids", "Lkotlinx/collections/immutable/PersistentList;", "modifier", "Landroidx/compose/ui/Modifier;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "viewStateList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardViewState;", "(Ljava/util/UUID;Ljava/lang/String;Lkotlinx/collections/immutable/PersistentList;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;II)V", "SimilarInstrumentsV2Card", "parentInstrumentUuid", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardDuxo;", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardDuxo;Landroidx/compose/runtime/Composer;II)V", "instrumentSimpleName", "instrumentPercentChangeText", "isInstrumentPercentChangePositive", "", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SimilarInstrumentsV2Ticker", "textColor", "Landroidx/compose/ui/graphics/Color;", "SimilarInstrumentsV2Ticker-RPmYEkk", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)V", "onInstrumentCardClicked", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "handleInstrumentTapAnalytics", "handleSwipeAnalytics", "PreviewSimilarInstrumentsV2", "PreviewSimilarInstrumentsV2Card", "PreviewSimilarInstrumentsV2CardNegative", "PreviewSimilarInstrumentsV2CardLongName", "buildViewState", "instrumentName", "TEST_TAG_DESCRIPTION", "getTEST_TAG_DESCRIPTION$annotations", "()V", "TEST_TAG_CARD", "getTEST_TAG_CARD$annotations", "TEST_TAG_LAZY_ROW", "getTEST_TAG_LAZY_ROW$annotations", "feature-equity-detail_externalDebug", "state", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2ViewState;", "viewState", "forceRefresh"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SimilarInstrumentsV2Kt {
    public static final String TEST_TAG_CARD = "SIMILAR_INSTRUMENTS_CARD";
    public static final String TEST_TAG_DESCRIPTION = "SIMILAR_INSTRUMENTS_DESCRIPTION";
    public static final String TEST_TAG_LAZY_ROW = "SIMILAR_INSTRUMENTS_LAZY_ROW";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSimilarInstrumentsV2$lambda$31(int i, Composer composer, int i2) {
        PreviewSimilarInstrumentsV2(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSimilarInstrumentsV2Card$lambda$32(int i, Composer composer, int i2) {
        PreviewSimilarInstrumentsV2Card(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSimilarInstrumentsV2CardLongName$lambda$34(int i, Composer composer, int i2) {
        PreviewSimilarInstrumentsV2CardLongName(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSimilarInstrumentsV2CardNegative$lambda$33(int i, Composer composer, int i2) {
        PreviewSimilarInstrumentsV2CardNegative(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimilarInstrumentsV2$lambda$13(UUID uuid, String str, ImmutableList3 immutableList3, Modifier modifier, LazyListState lazyListState, ImmutableList immutableList, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        SimilarInstrumentsV2(uuid, str, immutableList3, modifier, lazyListState, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimilarInstrumentsV2$lambda$4(UUID uuid, SimilarInstrumentsV2Duxo similarInstrumentsV2Duxo, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        SimilarInstrumentsV2(uuid, similarInstrumentsV2Duxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimilarInstrumentsV2Card$lambda$18(UUID uuid, UUID uuid2, SimilarInstrumentsV2CardDuxo similarInstrumentsV2CardDuxo, int i, int i2, Composer composer, int i3) {
        SimilarInstrumentsV2Card(uuid, uuid2, similarInstrumentsV2CardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimilarInstrumentsV2Card$lambda$19(UUID uuid, UUID uuid2, String str, String str2, String str3, Boolean bool, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SimilarInstrumentsV2Card(uuid, uuid2, str, str2, str3, bool, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimilarInstrumentsV2Card$lambda$23(UUID uuid, UUID uuid2, String str, String str2, String str3, Boolean bool, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SimilarInstrumentsV2Card(uuid, uuid2, str, str2, str3, bool, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimilarInstrumentsV2Loading$lambda$6(int i, Composer composer, int i2) {
        SimilarInstrumentsV2Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimilarInstrumentsV2Ticker_RPmYEkk$lambda$30(String str, long j, int i, Composer composer, int i2) {
        m13927SimilarInstrumentsV2TickerRPmYEkk(str, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTEST_TAG_CARD$annotations() {
    }

    public static /* synthetic */ void getTEST_TAG_DESCRIPTION$annotations() {
    }

    public static /* synthetic */ void getTEST_TAG_LAZY_ROW$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SimilarInstrumentsV2(final UUID instrumentUuid, final SimilarInstrumentsV2Duxo similarInstrumentsV2Duxo, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer3;
        SimilarInstrumentsV2Duxo4 similarInstrumentsV2Duxo4SimilarInstrumentsV2$lambda$3;
        final UUID uuid;
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        Composer composerStartRestartGroup = composer.startRestartGroup(2095381829);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentUuid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(similarInstrumentsV2Duxo)) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    String str = instrumentUuid + "_SimilarInstrumentsV2";
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SimilarInstrumentsV2Duxo.class), current, str, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2$$inlined$duxo$1.1
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
                    similarInstrumentsV2Duxo = (SimilarInstrumentsV2Duxo) baseDuxo;
                    i3 &= -113;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2095381829, i3, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2 (SimilarInstrumentsV2.kt:82)");
                }
                Unit unit = Unit.INSTANCE;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance = composer2.changedInstance(similarInstrumentsV2Duxo) | composer2.changedInstance(instrumentUuid);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SimilarInstrumentsV2Kt.SimilarInstrumentsV2$lambda$2$lambda$1(similarInstrumentsV2Duxo, instrumentUuid, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                Composer composer4 = composer2;
                LifecycleEffectKt.LifecycleResumeEffect(unit, lifecycleOwner, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer4, 6, 0);
                composer3 = composer4;
                similarInstrumentsV2Duxo4SimilarInstrumentsV2$lambda$3 = SimilarInstrumentsV2$lambda$3(FlowExtKt.collectAsStateWithLifecycle(similarInstrumentsV2Duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7));
                if (!(similarInstrumentsV2Duxo4SimilarInstrumentsV2$lambda$3 instanceof SimilarInstrumentsV2Duxo4.Loading)) {
                    composer3.startReplaceGroup(-677707902);
                    SimilarInstrumentsV2Loading(composer3, 0);
                    composer3.endReplaceGroup();
                    uuid = instrumentUuid;
                } else {
                    if (!(similarInstrumentsV2Duxo4SimilarInstrumentsV2$lambda$3 instanceof SimilarInstrumentsV2Duxo4.Loaded)) {
                        composer3.startReplaceGroup(-677710139);
                        composer3.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer3.startReplaceGroup(-677704689);
                    SimilarInstrumentsV2Duxo4.Loaded loaded = (SimilarInstrumentsV2Duxo4.Loaded) similarInstrumentsV2Duxo4SimilarInstrumentsV2$lambda$3;
                    uuid = instrumentUuid;
                    SimilarInstrumentsV2(uuid, loaded.getSymbol(), loaded.getSimilarInstrumentsUuids(), null, similarInstrumentsV2Duxo.getLazyListState(), null, composer3, i3 & 14, 40);
                    composer3 = composer3;
                    composer3.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            composer2 = composerStartRestartGroup;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Unit unit2 = Unit.INSTANCE;
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            composer2.startReplaceGroup(-1633490746);
            zChangedInstance = composer2.changedInstance(similarInstrumentsV2Duxo) | composer2.changedInstance(instrumentUuid);
            objRememberedValue = composer2.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SimilarInstrumentsV2Kt.SimilarInstrumentsV2$lambda$2$lambda$1(similarInstrumentsV2Duxo, instrumentUuid, (LifecycleResumePauseEffectScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
                composer2.endReplaceGroup();
                Composer composer42 = composer2;
                LifecycleEffectKt.LifecycleResumeEffect(unit2, lifecycleOwner2, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer42, 6, 0);
                composer3 = composer42;
                similarInstrumentsV2Duxo4SimilarInstrumentsV2$lambda$3 = SimilarInstrumentsV2$lambda$3(FlowExtKt.collectAsStateWithLifecycle(similarInstrumentsV2Duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7));
                if (!(similarInstrumentsV2Duxo4SimilarInstrumentsV2$lambda$3 instanceof SimilarInstrumentsV2Duxo4.Loading)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            uuid = instrumentUuid;
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimilarInstrumentsV2Kt.SimilarInstrumentsV2$lambda$4(uuid, similarInstrumentsV2Duxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult SimilarInstrumentsV2$lambda$2$lambda$1(SimilarInstrumentsV2Duxo similarInstrumentsV2Duxo, UUID uuid, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = similarInstrumentsV2Duxo.bind(uuid);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    private static final SimilarInstrumentsV2Duxo4 SimilarInstrumentsV2$lambda$3(SnapshotState4<? extends SimilarInstrumentsV2Duxo4> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final SimilarInstrumentsV2CardViewState SimilarInstrumentsV2Card$lambda$17(SnapshotState4<SimilarInstrumentsV2CardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SimilarInstrumentsV2Ticker_RPmYEkk$lambda$25(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final void SimilarInstrumentsV2Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2060906567);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2060906567, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Loading (SimilarInstrumentsV2.kt:102)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(SizeKt.wrapContentSize$default(companion, null, false, 3, null), BentoProgressIndicator3.f5150M, 0L, composerStartRestartGroup, 54, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimilarInstrumentsV2Kt.SimilarInstrumentsV2Loading$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SimilarInstrumentsV2(final UUID instrumentUuid, final String instrumentSymbol, final ImmutableList3<UUID> similarInstrumentsUuids, Modifier modifier, LazyListState lazyListState, ImmutableList<SimilarInstrumentsV2CardViewState> immutableList, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        LazyListState lazyListState2;
        int i4;
        ImmutableList<SimilarInstrumentsV2CardViewState> immutableList2;
        LazyListState lazyListStateRememberLazyListState;
        int i5;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        EventLogger current;
        final ImmutableList<SimilarInstrumentsV2CardViewState> immutableList3;
        boolean zIsScrollInProgress;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier4;
        final ImmutableList<SimilarInstrumentsV2CardViewState> immutableList4;
        final LazyListState lazyListState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
        Intrinsics.checkNotNullParameter(similarInstrumentsUuids, "similarInstrumentsUuids");
        Composer composerStartRestartGroup = composer.startRestartGroup(-117009968);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentUuid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(instrumentSymbol) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(similarInstrumentsUuids) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    lazyListState2 = lazyListState;
                    int i7 = composerStartRestartGroup.changed(lazyListState2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    lazyListState2 = lazyListState;
                }
                i3 |= i7;
            } else {
                lazyListState2 = lazyListState;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((i & 196608) == 0) {
                    immutableList2 = immutableList;
                    i3 |= composerStartRestartGroup.changedInstance(immutableList2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState2;
                    immutableList4 = immutableList2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 16) == 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -57345;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i4 == 0) {
                            Modifier modifier6 = modifier5;
                            i5 = i3;
                            modifier3 = modifier6;
                            immutableList2 = null;
                        } else {
                            Modifier modifier7 = modifier5;
                            i5 = i3;
                            modifier3 = modifier7;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i5 = i3;
                        modifier3 = modifier2;
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-117009968, i5, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2 (SimilarInstrumentsV2.kt:134)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    String strStringResource = StringResources_androidKt.stringResource(C15314R.string.instrument_detail_similar_instruments_description, new Object[]{instrumentSymbol}, composerStartRestartGroup, 0);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Modifier modifier8 = modifier3;
                    immutableList3 = immutableList2;
                    int i9 = i5;
                    LazyListState lazyListState4 = lazyListStateRememberLazyListState;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM(), 1, null), 0.0f, composerStartRestartGroup, 0, 1), TEST_TAG_DESCRIPTION), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                    zIsScrollInProgress = lazyListState4.isScrollInProgress();
                    Boolean boolValueOf = Boolean.valueOf(zIsScrollInProgress);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = composerStartRestartGroup.changed(zIsScrollInProgress) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(instrumentUuid);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new SimilarInstrumentsV2Kt$SimilarInstrumentsV2$3$1$1(zIsScrollInProgress, current, instrumentUuid, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.nestedScrollableLazyRow(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), lazyListState4), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 5, null), TEST_TAG_LAZY_ROW);
                    PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM());
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(immutableList3) | composerStartRestartGroup.changedInstance(similarInstrumentsUuids) | composerStartRestartGroup.changedInstance(instrumentUuid);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SimilarInstrumentsV2Kt.SimilarInstrumentsV2$lambda$12$lambda$11$lambda$10(immutableList3, similarInstrumentsUuids, instrumentUuid, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LazyDslKt.LazyRow(modifierTestTag, lazyListState4, paddingValuesM5137PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i9 >> 9) & 112) | 196608, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier8;
                    immutableList4 = immutableList3;
                    lazyListState3 = lazyListState4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SimilarInstrumentsV2Kt.SimilarInstrumentsV2$lambda$13(instrumentUuid, instrumentSymbol, similarInstrumentsUuids, modifier4, lazyListState3, immutableList4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            immutableList2 = immutableList;
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    if (i4 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        String strStringResource2 = StringResources_androidKt.stringResource(C15314R.string.instrument_detail_similar_instruments_description, new Object[]{instrumentSymbol}, composerStartRestartGroup, 0);
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i82 = BentoTheme.$stable;
                        Modifier modifier82 = modifier3;
                        immutableList3 = immutableList2;
                        int i92 = i5;
                        LazyListState lazyListState42 = lazyListStateRememberLazyListState;
                        BentoText2.m20747BentoText38GnDrw(strStringResource2, TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(PaddingKt.m5144paddingVpY3zN4$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21593getSmallD9Ej5fM(), 1, null), 0.0f, composerStartRestartGroup, 0, 1), TEST_TAG_DESCRIPTION), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i82).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                        zIsScrollInProgress = lazyListState42.isScrollInProgress();
                        Boolean boolValueOf2 = Boolean.valueOf(zIsScrollInProgress);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChanged = composerStartRestartGroup.changed(zIsScrollInProgress) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(instrumentUuid);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = new SimilarInstrumentsV2Kt$SimilarInstrumentsV2$3$1$1(zIsScrollInProgress, current, instrumentUuid, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                            Modifier modifierTestTag2 = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.nestedScrollableLazyRow(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), lazyListState42), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21590getDefaultD9Ej5fM(), 5, null), TEST_TAG_LAZY_ROW);
                            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default2 = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                            Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21593getSmallD9Ej5fM());
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChangedInstance = composerStartRestartGroup.changedInstance(immutableList3) | composerStartRestartGroup.changedInstance(similarInstrumentsUuids) | composerStartRestartGroup.changedInstance(instrumentUuid);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return SimilarInstrumentsV2Kt.SimilarInstrumentsV2$lambda$12$lambda$11$lambda$10(immutableList3, similarInstrumentsUuids, instrumentUuid, (LazyListScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                LazyDslKt.LazyRow(modifierTestTag2, lazyListState42, paddingValuesM5137PaddingValuesYgX7TsA$default2, false, horizontalOrVerticalM5089spacedBy0680j_42, centerVertically2, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i92 >> 9) & 112) | 196608, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
                                composer2 = composerStartRestartGroup;
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier82;
                                immutableList4 = immutableList3;
                                lazyListState3 = lazyListState42;
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        immutableList2 = immutableList;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimilarInstrumentsV2$lambda$12$lambda$11$lambda$10(final ImmutableList immutableList, final ImmutableList3 immutableList3, final UUID uuid, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        if (immutableList == null) {
            final C15567xeea297ab c15567xeea297ab = new Function1() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2$lambda$12$lambda$11$lambda$10$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(UUID uuid2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((UUID) obj);
                }
            };
            LazyRow.items(immutableList3.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2$lambda$12$lambda$11$lambda$10$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c15567xeea297ab.invoke(immutableList3.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2$lambda$12$lambda$11$lambda$10$$inlined$items$default$4
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
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                    UUID uuid2 = (UUID) immutableList3.get(i);
                    composer.startReplaceGroup(-1895104306);
                    SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card(uuid, uuid2, null, composer, 0, 4);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        } else {
            final C15571xeea297af c15571xeea297af = new Function1() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2$lambda$12$lambda$11$lambda$10$$inlined$items$default$5
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(SimilarInstrumentsV2CardViewState similarInstrumentsV2CardViewState) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((SimilarInstrumentsV2CardViewState) obj);
                }
            };
            LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2$lambda$12$lambda$11$lambda$10$$inlined$items$default$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c15571xeea297af.invoke(immutableList.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2$lambda$12$lambda$11$lambda$10$$inlined$items$default$8
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
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                    SimilarInstrumentsV2CardViewState similarInstrumentsV2CardViewState = (SimilarInstrumentsV2CardViewState) immutableList.get(i);
                    composer.startReplaceGroup(1709156874);
                    SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card(similarInstrumentsV2CardViewState.getParentInstrumentUuid(), similarInstrumentsV2CardViewState.getInstrumentUuid(), similarInstrumentsV2CardViewState.getInstrumentName(), similarInstrumentsV2CardViewState.getInstrumentSymbol(), similarInstrumentsV2CardViewState.getInstrumentPercentChangeText(), similarInstrumentsV2CardViewState.isInstrumentPercentChangePositive(), null, composer, 0, 64);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SimilarInstrumentsV2Card(final UUID parentInstrumentUuid, final UUID instrumentUuid, SimilarInstrumentsV2CardDuxo similarInstrumentsV2CardDuxo, Composer composer, final int i, final int i2) {
        int i3;
        SimilarInstrumentsV2CardDuxo similarInstrumentsV2CardDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        final SimilarInstrumentsV2CardDuxo similarInstrumentsV2CardDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        Intrinsics.checkNotNullParameter(parentInstrumentUuid, "parentInstrumentUuid");
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1734916548);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(parentInstrumentUuid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(instrumentUuid) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                similarInstrumentsV2CardDuxo2 = similarInstrumentsV2CardDuxo;
                int i4 = composerStartRestartGroup.changedInstance(similarInstrumentsV2CardDuxo2) ? 256 : 128;
                i3 |= i4;
            } else {
                similarInstrumentsV2CardDuxo2 = similarInstrumentsV2CardDuxo;
            }
            i3 |= i4;
        } else {
            similarInstrumentsV2CardDuxo2 = similarInstrumentsV2CardDuxo;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    String str = instrumentUuid + "_SimilarInstrumentsV2Card";
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SimilarInstrumentsV2CardDuxo.class), current, str, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2Card$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2Card$$inlined$duxo$1.1
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
                    similarInstrumentsV2CardDuxo2 = (SimilarInstrumentsV2CardDuxo) baseDuxo;
                    i3 &= -897;
                }
                SimilarInstrumentsV2CardDuxo similarInstrumentsV2CardDuxo4 = similarInstrumentsV2CardDuxo2;
                int i5 = i3;
                similarInstrumentsV2CardDuxo3 = similarInstrumentsV2CardDuxo4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1734916548, i5, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Card (SimilarInstrumentsV2.kt:206)");
                }
                Unit unit = Unit.INSTANCE;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(similarInstrumentsV2CardDuxo3) | composerStartRestartGroup.changedInstance(parentInstrumentUuid) | composerStartRestartGroup.changedInstance(instrumentUuid);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card$lambda$16$lambda$15(similarInstrumentsV2CardDuxo3, parentInstrumentUuid, instrumentUuid, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(unit, lifecycleOwner, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, 6, 0);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(similarInstrumentsV2CardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SimilarInstrumentsV2Card(SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle).getParentInstrumentUuid(), SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle).getInstrumentUuid(), SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle).getInstrumentName(), SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle).getInstrumentSymbol(), SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle).getInstrumentPercentChangeText(), SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle).isInstrumentPercentChangePositive(), null, composerStartRestartGroup, 0, 64);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                SimilarInstrumentsV2CardDuxo similarInstrumentsV2CardDuxo42 = similarInstrumentsV2CardDuxo2;
                int i52 = i3;
                similarInstrumentsV2CardDuxo3 = similarInstrumentsV2CardDuxo42;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Unit unit2 = Unit.INSTANCE;
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(similarInstrumentsV2CardDuxo3) | composerStartRestartGroup.changedInstance(parentInstrumentUuid) | composerStartRestartGroup.changedInstance(instrumentUuid);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card$lambda$16$lambda$15(similarInstrumentsV2CardDuxo3, parentInstrumentUuid, instrumentUuid, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(unit2, lifecycleOwner2, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, 6, 0);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(similarInstrumentsV2CardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    SimilarInstrumentsV2Card(SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle2).getParentInstrumentUuid(), SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle2).getInstrumentUuid(), SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle2).getInstrumentName(), SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle2).getInstrumentSymbol(), SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle2).getInstrumentPercentChangeText(), SimilarInstrumentsV2Card$lambda$17(snapshotState4CollectAsStateWithLifecycle2).isInstrumentPercentChangePositive(), null, composerStartRestartGroup, 0, 64);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            similarInstrumentsV2CardDuxo3 = similarInstrumentsV2CardDuxo2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card$lambda$18(parentInstrumentUuid, instrumentUuid, similarInstrumentsV2CardDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult SimilarInstrumentsV2Card$lambda$16$lambda$15(SimilarInstrumentsV2CardDuxo similarInstrumentsV2CardDuxo, UUID uuid, UUID uuid2, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = similarInstrumentsV2CardDuxo.bind(uuid, uuid2);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2Card$lambda$16$lambda$15$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SimilarInstrumentsV2Card(final UUID uuid, final UUID uuid2, final String str, final String str2, final String str3, final Boolean bool, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        long jM21372getBg20d7_KjU;
        final String str4;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Composer composerStartRestartGroup = composer.startRestartGroup(347887893);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(uuid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(uuid2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changed(bool) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(347887893, i3, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Card (SimilarInstrumentsV2.kt:235)");
                }
                if (uuid != null || uuid2 == null || str == null || StringsKt.isBlank(str) || str2 == null || StringsKt.isBlank(str2) || str3 == null || StringsKt.isBlank(str3) || bool == null) {
                    final Modifier modifier5 = modifier3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card$lambda$19(uuid, uuid2, str, str2, str3, bool, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 1, null);
                SimilarInstrumentsV2Constants similarInstrumentsV2Constants = SimilarInstrumentsV2Constants.INSTANCE;
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifierM5144paddingVpY3zN4$default, similarInstrumentsV2Constants.m13921getCARD_WIDTHD9Ej5fM()), similarInstrumentsV2Constants.m13920getCARD_HEIGHTD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default = RippleKt.m5624rippleH2RKhps$default(false, 0.0f, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), 3, null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(uuid) | composerStartRestartGroup.changedInstance(uuid2) | composerStartRestartGroup.changedInstance(current);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card$lambda$22$lambda$21(context, navigator, uuid, uuid2, current);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function0);
                    objRememberedValue2 = function0;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierTestTag = TestTag3.testTag(ClickableKt.m4891clickableO2vRcR0$default(modifierM5156height3ABfNKs, interactionSource3, indicationNodeFactoryM5624rippleH2RKhps$default, false, null, null, (Function0) objRememberedValue2, 28, null), TEST_TAG_CARD);
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(4);
                int i6 = CardDefaults.$stable;
                Modifier modifier6 = modifier3;
                CardElevation cardElevationM5730cardElevationaqJV_2Y = cardDefaults.m5730cardElevationaqJV_2Y(fM7995constructorimpl, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i6 << 18) | 6, 62);
                if (bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay()) {
                    composerStartRestartGroup.startReplaceGroup(173863801);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(173921368);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                str4 = str;
                composer2 = composerStartRestartGroup;
                CardKt.Card(modifierTestTag, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardDefaults.m5729cardColorsro_MJ88(jM21372getBg20d7_KjU, 0L, 0L, 0L, composerStartRestartGroup, i6 << 12, 14), cardElevationM5730cardElevationaqJV_2Y, null, ComposableLambda3.rememberComposableLambda(-915348473, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card.6
                    public final void invoke(Column5 Card, Composer composer3, int i7) {
                        BentoTheme bentoTheme2;
                        int i8;
                        long jM21452getNegative0d7_KjU;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i7 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-915348473, i7, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Card.<anonymous> (SimilarInstrumentsV2.kt:280)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme3.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM());
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        String str5 = str4;
                        Boolean bool2 = bool;
                        String str6 = str2;
                        String str7 = str3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), composer3, 6);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(str5, null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, bentoTheme3.getTypography(composer3, i9).getTextS(), composer3, 817889280, 0, 7550);
                        Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer3, 0);
                        if (bool2.booleanValue()) {
                            composer3.startReplaceGroup(785861995);
                            bentoTheme2 = bentoTheme3;
                            i8 = i9;
                            jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer3, i8).m21456getPositive0d7_KjU();
                            composer3.endReplaceGroup();
                        } else {
                            bentoTheme2 = bentoTheme3;
                            i8 = i9;
                            composer3.startReplaceGroup(785925483);
                            jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer3, i8).m21452getNegative0d7_KjU();
                            composer3.endReplaceGroup();
                        }
                        TextStyle textL = bentoTheme2.getTypography(composer3, i8).getTextL();
                        BentoText2.m20747BentoText38GnDrw(str6, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textL, composer3, 24576, 0, 8170);
                        SimilarInstrumentsV2Kt.m13927SimilarInstrumentsV2TickerRPmYEkk(str7, jM21452getNegative0d7_KjU, composer3, 0);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, 196608, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                str4 = str;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card$lambda$23(uuid, uuid2, str4, str2, str3, bool, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (uuid != null) {
            }
            final Modifier modifier52 = modifier3;
            if (ComposerKt.isTraceInProgress()) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimilarInstrumentsV2Card$lambda$22$lambda$21(Context context, Navigator navigator, UUID uuid, UUID uuid2, EventLogger eventLogger) {
        onInstrumentCardClicked(context, navigator, uuid, uuid2, eventLogger);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SimilarInstrumentsV2Ticker-RPmYEkk, reason: not valid java name */
    public static final void m13927SimilarInstrumentsV2TickerRPmYEkk(String str, long j, Composer composer, final int i) {
        int i2;
        final String str2;
        final long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(558979843);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(558979843, i2, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Ticker (SimilarInstrumentsV2.kt:314)");
            }
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SimilarInstrumentsV2Kt.SimilarInstrumentsV2Ticker_RPmYEkk$lambda$29$lambda$28(lifecycleOwner, snapshotState, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
            str2 = str;
            j2 = j;
            WrappedTickerKt.TickerText(new TickerTextState(str2, j2, TickerTextState.Style.REGULAR_LARGE_BOLD, null, SimilarInstrumentsV2Ticker_RPmYEkk$lambda$25(snapshotState), 8, null), Modifier.INSTANCE, composerStartRestartGroup, TickerTextState.$stable | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str;
            j2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimilarInstrumentsV2Kt.SimilarInstrumentsV2Ticker_RPmYEkk$lambda$30(str2, j2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SimilarInstrumentsV2Ticker_RPmYEkk$lambda$26(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SimilarInstrumentsV2Ticker_RPmYEkk$lambda$29$lambda$28(final LifecycleOwner lifecycleOwner, final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2Ticker$1$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_RESUME) {
                    SimilarInstrumentsV2Kt.SimilarInstrumentsV2Ticker_RPmYEkk$lambda$26(snapshotState, !SimilarInstrumentsV2Kt.SimilarInstrumentsV2Ticker_RPmYEkk$lambda$25(r2));
                }
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$SimilarInstrumentsV2Ticker_RPmYEkk$lambda$29$lambda$28$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    private static final void onInstrumentCardClicked(Context context, Navigator navigator, UUID uuid, UUID uuid2, EventLogger eventLogger) {
        handleInstrumentTapAnalytics(eventLogger, uuid, uuid2);
        Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(uuid2, null, null, InstrumentDetailSource.SIMILAR_INSTRUMENTS, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_STOCK_DETAIL, false, null, false, false, null, null, 4060, null);
    }

    private static final void handleInstrumentTapAnalytics(EventLogger eventLogger, UUID uuid, UUID uuid2) {
        Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Screen screen = new Screen(name, InstrumentDetailSource.HOME_TAB_POSITIONS.getServerValue(), string2, null, 8, null);
        Component.ComponentType componentType = Component.ComponentType.PEOPLE_ALSO_VIEW_SECTION;
        String str = null;
        Component component = new Component(componentType, str, null, 6, null);
        Asset.AssetType assetType = Asset.AssetType.INSTRUMENT;
        String string3 = uuid2.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Context.ProductTag productTag = null;
        int i4 = 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, str2, str3, str4, str5, productTag, i4, null, null, null, null, null, new Asset(string3, assetType, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null), false, 41, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSwipeAnalytics(EventLogger eventLogger, UUID uuid) {
        Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Screen screen = new Screen(name, InstrumentDetailSource.HOME_TAB_POSITIONS.getServerValue(), string2, null, 8, null);
        Component.ComponentType componentType = Component.ComponentType.PEOPLE_ALSO_VIEW_SECTION;
        String str = null;
        Component component = new Component(componentType, str, null, 6, null);
        Asset.AssetType assetType = Asset.AssetType.INSTRUMENT;
        String string3 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        EventLogger.DefaultImpls.logSwipe$default(eventLogger, null, screen, component, null, new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string3, assetType, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null), false, 41, null);
    }

    @DayNightPreview
    private static final void PreviewSimilarInstrumentsV2(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(24700781);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(24700781, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.PreviewSimilarInstrumentsV2 (SimilarInstrumentsV2.kt:420)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE)}, ComposableSingletons$SimilarInstrumentsV2Kt.INSTANCE.m13915getLambda$1748022227$feature_equity_detail_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimilarInstrumentsV2Kt.PreviewSimilarInstrumentsV2$lambda$31(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void PreviewSimilarInstrumentsV2Card(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-958000355);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-958000355, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.PreviewSimilarInstrumentsV2Card (SimilarInstrumentsV2.kt:442)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE)}, ComposableSingletons$SimilarInstrumentsV2Kt.INSTANCE.m13919getLambda$839116835$feature_equity_detail_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimilarInstrumentsV2Kt.PreviewSimilarInstrumentsV2Card$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void PreviewSimilarInstrumentsV2CardNegative(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1364602766);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1364602766, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.PreviewSimilarInstrumentsV2CardNegative (SimilarInstrumentsV2.kt:463)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE)}, ComposableSingletons$SimilarInstrumentsV2Kt.INSTANCE.m13916getLambda$2066803406$feature_equity_detail_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimilarInstrumentsV2Kt.PreviewSimilarInstrumentsV2CardNegative$lambda$33(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void PreviewSimilarInstrumentsV2CardLongName(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(861012836);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(861012836, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.PreviewSimilarInstrumentsV2CardLongName (SimilarInstrumentsV2.kt:484)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE)}, ComposableSingletons$SimilarInstrumentsV2Kt.INSTANCE.getLambda$158812196$feature_equity_detail_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Kt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimilarInstrumentsV2Kt.PreviewSimilarInstrumentsV2CardLongName$lambda$34(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ SimilarInstrumentsV2CardViewState buildViewState$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Nintendo";
        }
        if ((i & 2) != 0) {
            str2 = "NTDOY";
        }
        if ((i & 4) != 0) {
            str3 = "+5.0%";
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return buildViewState(str, str2, str3, z);
    }

    public static final SimilarInstrumentsV2CardViewState buildViewState(String str, String str2, String str3, boolean z) {
        return new SimilarInstrumentsV2CardViewState(UUID.randomUUID(), UUID.randomUUID(), str, str2, str3, Boolean.valueOf(z));
    }
}
