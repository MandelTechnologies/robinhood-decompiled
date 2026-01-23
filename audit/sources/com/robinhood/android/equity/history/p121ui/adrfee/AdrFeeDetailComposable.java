package com.robinhood.android.equity.history.p121ui.adrfee;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.equity.history.C15093R;
import com.robinhood.android.equity.history.p121ui.adrfee.AdrFeeDetailComposable;
import com.robinhood.android.equity.history.p121ui.adrfee.AdrFeeDetailEvent;
import com.robinhood.android.equity.history.p121ui.adrfee.AdrFeeDetailViewState;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowKt;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.ApiAdrFee;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AdrFeeDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u001d\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0003¢\u0006\u0002\u0010)\u001a-\u0010*\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010+\u001a+\u0010,\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010-\"\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u0017X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0013\"\u0014\u0010\u0019\u001a\u00020\u0017X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0013\"\u001a\u0010\u001b\u001a\u00020\u001cX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010 \u001a\u00020\u0017X\u0080D¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010#¨\u0006.²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002²\u0006\u0012\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100X\u008a\u0084\u0002²\u0006\u0012\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u000100X\u008a\u0084\u0002"}, m3636d2 = {"AdrFeeDetailComposable", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "onBackPressed", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo;", "(Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/scarlet/ScarletManager;Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo;Landroidx/compose/runtime/Composer;II)V", "PlaceholderFeeViewState", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState$FeeViewState;", "getPlaceholderFeeViewState$annotations", "()V", "getPlaceholderFeeViewState", "()Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState$FeeViewState;", "PlaceholderInstrumentName", "", "getPlaceholderInstrumentName$annotations", "PlaceholderInstrumentSymbol", "getPlaceholderInstrumentSymbol$annotations", "PlaceHolderAccountDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "getPlaceHolderAccountDisplayName$annotations", "getPlaceHolderAccountDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "PlaceholderDisclosureMarkdown", "getPlaceholderDisclosureMarkdown$annotations", "getPlaceholderDisclosureMarkdown", "()Ljava/lang/String;", "AdrFeeDetailContent", "viewState", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "HandleEvents", "(Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo;Landroidx/compose/runtime/Composer;II)V", "AdrFeeDetailTopAppBar", "(Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo;Landroidx/compose/runtime/Composer;I)V", "feature-equity-history_externalDebug", "fetchResponseErrorEvent", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailEvent$FetchResponseError;", "navigateTransferDetailFragmentEvent", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailEvent$NavigateToInstrumentDetailFragment;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AdrFeeDetailComposable {
    public static final String PlaceholderInstrumentName = "Apple Inc. Common Stock";
    public static final String PlaceholderInstrumentSymbol = "AAPL";
    private static final AdrFeeDetailViewState.FeeViewState PlaceholderFeeViewState = new AdrFeeDetailViewState.FeeViewState("Mar 18, 2024", "Feb 26, 2024", "$0.60", "20", "$0.03", ApiAdrFee.State.PAID, null, 64, null);
    private static final StringResource PlaceHolderAccountDisplayName = StringResource.INSTANCE.invoke(C8179R.string.account_individual_title, new Object[0]);
    private static final String PlaceholderDisclosureMarkdown = "American Depository Receipts (ADRs) represent shares of non-U.S. based companies. Banks issue ADRs to facilitate trading on U.S. exchanges. Some banks require investors to pay periodic service fees, typically $0.01 to $0.03 per share.\nLearn More";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdrFeeDetailComposable$lambda$0(Navigator navigator, ScarletManager scarletManager, ActivityErrorHandler activityErrorHandler, Function0 function0, Modifier modifier, AdrFeeDetailDuxo adrFeeDetailDuxo, int i, int i2, Composer composer, int i3) {
        AdrFeeDetailComposable(navigator, scarletManager, activityErrorHandler, function0, modifier, adrFeeDetailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdrFeeDetailContent$lambda$4(AdrFeeDetailViewState adrFeeDetailViewState, PaddingValues paddingValues, int i, Composer composer, int i2) throws Resources.NotFoundException {
        AdrFeeDetailContent(adrFeeDetailViewState, paddingValues, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdrFeeDetailTopAppBar$lambda$10(AdrFeeDetailViewState adrFeeDetailViewState, Function0 function0, AdrFeeDetailDuxo adrFeeDetailDuxo, int i, Composer composer, int i2) {
        AdrFeeDetailTopAppBar(adrFeeDetailViewState, function0, adrFeeDetailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HandleEvents$lambda$9(ActivityErrorHandler activityErrorHandler, Navigator navigator, AdrFeeDetailDuxo adrFeeDetailDuxo, int i, int i2, Composer composer, int i3) {
        HandleEvents(activityErrorHandler, navigator, adrFeeDetailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPlaceHolderAccountDisplayName$annotations() {
    }

    public static /* synthetic */ void getPlaceholderDisclosureMarkdown$annotations() {
    }

    public static /* synthetic */ void getPlaceholderFeeViewState$annotations() {
    }

    public static /* synthetic */ void getPlaceholderInstrumentName$annotations() {
    }

    public static /* synthetic */ void getPlaceholderInstrumentSymbol$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdrFeeDetailComposable(final Navigator navigator, final ScarletManager scarletManager, final ActivityErrorHandler activityErrorHandler, final Function0<Unit> onBackPressed, Modifier modifier, AdrFeeDetailDuxo adrFeeDetailDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        AdrFeeDetailDuxo adrFeeDetailDuxo2;
        Composer composer2;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final AdrFeeDetailDuxo adrFeeDetailDuxo3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scarletManager, "scarletManager");
        Intrinsics.checkNotNullParameter(activityErrorHandler, "activityErrorHandler");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(951196134);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(scarletManager) : composerStartRestartGroup.changedInstance(scarletManager) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(activityErrorHandler) : composerStartRestartGroup.changedInstance(activityErrorHandler) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    adrFeeDetailDuxo2 = adrFeeDetailDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(adrFeeDetailDuxo2) ? 131072 : 65536;
                    i3 |= i5;
                } else {
                    adrFeeDetailDuxo2 = adrFeeDetailDuxo;
                }
                i3 |= i5;
            } else {
                adrFeeDetailDuxo2 = adrFeeDetailDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
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
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AdrFeeDetailDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$AdrFeeDetailComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$AdrFeeDetailComposable$$inlined$duxo$1.1
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
                        i3 &= -458753;
                        modifier3 = modifier4;
                        adrFeeDetailDuxo2 = (AdrFeeDetailDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier4;
                    }
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(951196134, i3, -1, "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposable (AdrFeeDetailComposable.kt:56)");
                }
                AdrFeeDetailDuxo adrFeeDetailDuxo4 = adrFeeDetailDuxo2;
                HandleEvents(activityErrorHandler, navigator, adrFeeDetailDuxo4, composer2, ActivityErrorHandler.$stable | ((i3 >> 6) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 896), 0);
                Composer composer4 = composer2;
                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(scarletManager), ScarletComposeInterop.themesForCompose(scarletManager), ComposableLambda3.rememberComposableLambda(1802284696, true, new C151011(adrFeeDetailDuxo4, modifier3, onBackPressed), composer2, 54), composer4, 384, 0);
                composer3 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                adrFeeDetailDuxo3 = adrFeeDetailDuxo4;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                adrFeeDetailDuxo3 = adrFeeDetailDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdrFeeDetailComposable.AdrFeeDetailComposable$lambda$0(navigator, scarletManager, activityErrorHandler, onBackPressed, modifier2, adrFeeDetailDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if ((i & 1) == 0) {
                if (i4 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                AdrFeeDetailDuxo adrFeeDetailDuxo42 = adrFeeDetailDuxo2;
                HandleEvents(activityErrorHandler, navigator, adrFeeDetailDuxo42, composer2, ActivityErrorHandler.$stable | ((i3 >> 6) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 896), 0);
                Composer composer42 = composer2;
                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(scarletManager), ScarletComposeInterop.themesForCompose(scarletManager), ComposableLambda3.rememberComposableLambda(1802284696, true, new C151011(adrFeeDetailDuxo42, modifier3, onBackPressed), composer2, 54), composer42, 384, 0);
                composer3 = composer42;
                if (ComposerKt.isTraceInProgress()) {
                }
                adrFeeDetailDuxo3 = adrFeeDetailDuxo42;
                modifier2 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: AdrFeeDetailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$AdrFeeDetailComposable$1 */
    static final class C151011 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AdrFeeDetailDuxo $duxo;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onBackPressed;

        C151011(AdrFeeDetailDuxo adrFeeDetailDuxo, Modifier modifier, Function0<Unit> function0) {
            this.$duxo = adrFeeDetailDuxo;
            this.$modifier = modifier;
            this.$onBackPressed = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$3$lambda$2(final SystemUiController systemUiController, final long j, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
            return new DisposableEffectResult() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$AdrFeeDetailComposable$1$invoke$lambda$3$lambda$2$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
                }
            };
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1802284696, i, -1, "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposable.<anonymous> (AdrFeeDetailComposable.kt:67)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(this.$duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
            final SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer, 0, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            final long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
            Color colorM6701boximpl = Color.m6701boximpl(jM21371getBg0d7_KjU);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(systemUiControllerRememberSystemUiController) | composer.changed(jM21371getBg0d7_KjU);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$AdrFeeDetailComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdrFeeDetailComposable.C151011.invoke$lambda$3$lambda$2(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(colorM6701boximpl, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            long jM21371getBg0d7_KjU2 = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            Modifier modifier = this.$modifier;
            final Function0<Unit> function0 = this.$onBackPressed;
            final AdrFeeDetailDuxo adrFeeDetailDuxo = this.$duxo;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier, ComposableLambda3.rememberComposableLambda(-1973867428, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt.AdrFeeDetailComposable.1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1973867428, i3, -1, "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposable.<anonymous>.<anonymous> (AdrFeeDetailComposable.kt:82)");
                    }
                    AdrFeeDetailComposable.AdrFeeDetailTopAppBar(C151011.invoke$lambda$0(snapshotState4CollectAsStateWithLifecycle), function0, adrFeeDetailDuxo, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-901117977, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt.AdrFeeDetailComposable.1.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer2, int i3) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i3 & 6) == 0) {
                        i3 |= composer2.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-901117977, i3, -1, "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposable.<anonymous>.<anonymous> (AdrFeeDetailComposable.kt:90)");
                    }
                    AdrFeeDetailComposable.AdrFeeDetailContent(C151011.invoke$lambda$0(snapshotState4CollectAsStateWithLifecycle), paddingValues, composer2, (i3 << 3) & 112);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 805306416, 316);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AdrFeeDetailViewState invoke$lambda$0(SnapshotState4<AdrFeeDetailViewState> snapshotState4) {
            return snapshotState4.getValue();
        }
    }

    private static final Event<AdrFeeDetailEvent.FetchResponseError> HandleEvents$lambda$5(SnapshotState4<Event<AdrFeeDetailEvent.FetchResponseError>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AdrFeeDetailEvent.NavigateToInstrumentDetailFragment> HandleEvents$lambda$7(SnapshotState4<Event<AdrFeeDetailEvent.NavigateToInstrumentDetailFragment>> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final AdrFeeDetailViewState.FeeViewState getPlaceholderFeeViewState() {
        return PlaceholderFeeViewState;
    }

    public static final StringResource getPlaceHolderAccountDisplayName() {
        return PlaceHolderAccountDisplayName;
    }

    public static final String getPlaceholderDisclosureMarkdown() {
        return PlaceholderDisclosureMarkdown;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdrFeeDetailContent(final AdrFeeDetailViewState adrFeeDetailViewState, final PaddingValues paddingValues, Composer composer, final int i) throws Resources.NotFoundException {
        String strStringResource;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(483194933);
        int i3 = (i & 6) == 0 ? i | ((i & 8) == 0 ? composerStartRestartGroup.changed(adrFeeDetailViewState) : composerStartRestartGroup.changedInstance(adrFeeDetailViewState) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(483194933, i3, -1, "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailContent (AdrFeeDetailComposable.kt:128)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(companion, paddingValues), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strStringResource2 = StringResources_androidKt.stringResource(C15093R.string.adr_fee_detail_title, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource2, TestTag3.testTag(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), adrFeeDetailViewState.getFeeViewState() == null, null, 2, null), AdrFeeDetailComposable4.ADR_FEE_TITLE), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion3.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8120);
            String instrumentName = adrFeeDetailViewState.getInstrumentName();
            if (instrumentName == null) {
                instrumentName = PlaceholderInstrumentName;
            }
            BentoText2.m20747BentoText38GnDrw(instrumentName, TestTag3.testTag(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), adrFeeDetailViewState.getInstrumentName() == null, null, 2, null), AdrFeeDetailComposable4.INSTRUMENT_NAME), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8120);
            StringResource accountDisplayName = adrFeeDetailViewState.getAccountDisplayName();
            if (accountDisplayName != null) {
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                CharSequence text = accountDisplayName.getText(resources);
                if (text == null) {
                    StringResource stringResource = PlaceHolderAccountDisplayName;
                    Resources resources2 = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    text = stringResource.getText(resources2);
                }
                BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C15093R.string.account_used_title, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(text.toString(), null, 2, null), null, null, null, null, adrFeeDetailViewState.getAccountDisplayName() == null, adrFeeDetailViewState.getAccountDisplayName() == null, 989, null);
                Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), AdrFeeDetailComposable4.ACCOUNT_ROW);
                int i5 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState, modifierTestTag, null, composerStartRestartGroup, i5, 4);
                AdrFeeDetailViewState.FeeViewState feeViewState = adrFeeDetailViewState.getFeeViewState();
                if (feeViewState == null) {
                    feeViewState = PlaceholderFeeViewState;
                }
                AdrFeeDetailViewState.FeeViewState feeViewState2 = feeViewState;
                Timeline.Status status = Timeline.Status.COMPLETE;
                BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(status, Timeline.Position.TOP, StringResources_androidKt.stringResource(C15093R.string.adr_fee_detail_record_date_label, composerStartRestartGroup, 0), TestTag3.testTag(companion, AdrFeeDetailComposable4.RECORD_DATE_ROW), feeViewState2.getRecordDate(), StringResources_androidKt.stringResource(C15093R.string.adr_fee_detail_timeline_status_confirmed, composerStartRestartGroup, 0), null, null, null, null, false, null, null, false, false, 0, false, 0, adrFeeDetailViewState.getFeeViewState() == null, adrFeeDetailViewState.getFeeViewState() == null, adrFeeDetailViewState.getFeeViewState() == null, composerStartRestartGroup, 3126, 0, 0, 262080);
                ApiAdrFee.State state = feeViewState2.getState();
                ApiAdrFee.State state2 = ApiAdrFee.State.PAID;
                if (state != state2) {
                    status = Timeline.Status.INCOMPLETE;
                }
                Timeline.Position position = Timeline.Position.BOTTOM;
                String strStringResource3 = StringResources_androidKt.stringResource(C15093R.string.adr_fee_detail_process_date_label, composerStartRestartGroup, 0);
                if (feeViewState2.getState() == state2) {
                    composerStartRestartGroup.startReplaceGroup(1396526267);
                    strStringResource = StringResources_androidKt.stringResource(C15093R.string.adr_fee_detail_timeline_status_paid, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1396667224);
                    strStringResource = StringResources_androidKt.stringResource(C15093R.string.adr_fee_detail_timeline_status_pending, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(status, position, strStringResource3, TestTag3.testTag(companion, AdrFeeDetailComposable4.PROCESS_DATE_ROW), feeViewState2.getPaidAt(), strStringResource, null, null, null, null, false, null, null, false, false, 0, false, 0, adrFeeDetailViewState.getFeeViewState() == null, adrFeeDetailViewState.getFeeViewState() == null, adrFeeDetailViewState.getFeeViewState() == null, composerStartRestartGroup, 3120, 0, 0, 262080);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C15093R.string.adr_fee_detail_num_of_shares_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(feeViewState2.getPosition(), null, 2, null), null, null, null, null, adrFeeDetailViewState.getFeeViewState() == null, adrFeeDetailViewState.getFeeViewState() == null, 989, null), TestTag3.testTag(companion, AdrFeeDetailComposable4.POSITION_ROW), null, composerStartRestartGroup, i5 | 48, 4);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C15093R.string.adr_fee_detail_amount_per_share_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(feeViewState2.getRate(), null, 2, null), null, null, null, null, adrFeeDetailViewState.getFeeViewState() == null, adrFeeDetailViewState.getFeeViewState() == null, 989, null), TestTag3.testTag(companion, AdrFeeDetailComposable4.RATE_ROW), null, composerStartRestartGroup, i5 | 48, 4);
                ImmutableList<AdrFeeDetailViewState.SalesTaxItem> salesTaxes = feeViewState2.getSalesTaxes();
                composerStartRestartGroup.startReplaceGroup(737838879);
                if (salesTaxes == null) {
                    i2 = 1;
                } else {
                    for (AdrFeeDetailViewState.SalesTaxItem salesTaxItem : salesTaxes) {
                        composerStartRestartGroup.startReplaceGroup(737839768);
                        if (salesTaxItem.getAmount().compareTo(BigDecimal.ZERO) > 0) {
                            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(salesTaxItem.getDisplayName(), null, 2, null), null, null, null, new AnnotatedString(Money.format$default(Money3.toMoney$default(salesTaxItem.getAmount(), null, 1, null), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, BentoDataRowState.$stable, 6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    i2 = 1;
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C15093R.string.adr_fee_detail_total_amount_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(feeViewState2.getAmount(), null, 2, null), null, null, null, null, adrFeeDetailViewState.getFeeViewState() == null ? i2 : 0, adrFeeDetailViewState.getFeeViewState() == null ? i2 : 0, 989, null);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoDataRowKt.BentoDataRow(bentoDataRowState2, TestTag3.testTag(companion4, AdrFeeDetailComposable4.AMOUNT_ROW), null, composerStartRestartGroup, BentoDataRowState.$stable | 48, 4);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierTestTag2 = TestTag3.testTag(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), i2, null), adrFeeDetailViewState.getDisclosureMarkdown() == null ? i2 : 0, null, 2, null), AdrFeeDetailComposable4.DISCLOSURE);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String disclosureMarkdown = adrFeeDetailViewState.getDisclosureMarkdown();
                if (disclosureMarkdown == null) {
                    disclosureMarkdown = PlaceholderDisclosureMarkdown;
                }
                BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextS(), 0, bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdrFeeDetailComposable.AdrFeeDetailContent$lambda$4(adrFeeDetailViewState, paddingValues, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void HandleEvents(final ActivityErrorHandler activityErrorHandler, final Navigator navigator, AdrFeeDetailDuxo adrFeeDetailDuxo, Composer composer, final int i, final int i2) {
        int i3;
        AdrFeeDetailDuxo adrFeeDetailDuxo2;
        final AdrFeeDetailDuxo adrFeeDetailDuxo3;
        final Context context;
        Event<AdrFeeDetailEvent> event;
        final Event<AdrFeeDetailEvent.FetchResponseError> eventHandleEvents$lambda$5;
        final Event<AdrFeeDetailEvent.NavigateToInstrumentDetailFragment> eventHandleEvents$lambda$7;
        EventConsumer<AdrFeeDetailEvent.NavigateToInstrumentDetailFragment> eventConsumerInvoke;
        EventConsumer<AdrFeeDetailEvent.FetchResponseError> eventConsumerInvoke2;
        Composer composerStartRestartGroup = composer.startRestartGroup(764583508);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(activityErrorHandler) : composerStartRestartGroup.changedInstance(activityErrorHandler) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                adrFeeDetailDuxo2 = adrFeeDetailDuxo;
                int i4 = composerStartRestartGroup.changedInstance(adrFeeDetailDuxo2) ? 256 : 128;
                i3 |= i4;
            } else {
                adrFeeDetailDuxo2 = adrFeeDetailDuxo;
            }
            i3 |= i4;
        } else {
            adrFeeDetailDuxo2 = adrFeeDetailDuxo;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            adrFeeDetailDuxo3 = adrFeeDetailDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AdrFeeDetailDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$duxo$1.1
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
                    adrFeeDetailDuxo2 = (AdrFeeDetailDuxo) baseDuxo;
                    i3 &= -897;
                }
                AdrFeeDetailDuxo adrFeeDetailDuxo4 = adrFeeDetailDuxo2;
                int i5 = i3;
                adrFeeDetailDuxo3 = adrFeeDetailDuxo4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(764583508, i5, -1, "com.robinhood.android.equity.history.ui.adrfee.HandleEvents (AdrFeeDetailComposable.kt:276)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final StateFlow<Event<AdrFeeDetailEvent>> eventFlow = adrFeeDetailDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "AdrFeeDetailComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof AdrFeeDetailEvent.FetchResponseError) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                Event<AdrFeeDetailEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof AdrFeeDetailEvent.FetchResponseError)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventHandleEvents$lambda$5 = HandleEvents$lambda$5(snapshotState4CollectAsStateWithLifecycle);
                if (eventHandleEvents$lambda$5 != null && (eventHandleEvents$lambda$5.getData() instanceof AdrFeeDetailEvent.FetchResponseError) && (eventConsumerInvoke2 = eventHandleEvents$lambda$5.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventHandleEvents$lambda$5, new Function1() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m13712invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13712invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(activityErrorHandler, ((AdrFeeDetailEvent.FetchResponseError) eventHandleEvents$lambda$5.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                final StateFlow<Event<AdrFeeDetailEvent>> eventFlow2 = adrFeeDetailDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2", m3645f = "AdrFeeDetailComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof AdrFeeDetailEvent.NavigateToInstrumentDetailFragment) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                Event<AdrFeeDetailEvent> value2 = eventFlow2.getValue();
                Event<AdrFeeDetailEvent> event2 = value2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow2, (event2 == null ? event2.getData() : null) instanceof AdrFeeDetailEvent.NavigateToInstrumentDetailFragment ? value2 : null, lifecycleOwner2.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventHandleEvents$lambda$7 = HandleEvents$lambda$7(snapshotState4CollectAsStateWithLifecycle2);
                if (eventHandleEvents$lambda$7 != null && (eventHandleEvents$lambda$7.getData() instanceof AdrFeeDetailEvent.NavigateToInstrumentDetailFragment) && (eventConsumerInvoke = eventHandleEvents$lambda$7.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventHandleEvents$lambda$7, new Function1() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m13713invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13713invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AdrFeeDetailEvent.NavigateToInstrumentDetailFragment navigateToInstrumentDetailFragment = (AdrFeeDetailEvent.NavigateToInstrumentDetailFragment) eventHandleEvents$lambda$7.getData();
                            Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(navigateToInstrumentDetailFragment.getInstrumentSymbol(), InstrumentDetailSource.HISTORY_DETAIL, navigateToInstrumentDetailFragment.getAccountNumber()), false, false, false, null, false, null, false, false, null, null, 4092, null);
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                AdrFeeDetailDuxo adrFeeDetailDuxo42 = adrFeeDetailDuxo2;
                int i52 = i3;
                adrFeeDetailDuxo3 = adrFeeDetailDuxo42;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Flow eventFlow3 = adrFeeDetailDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner3 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow3 = new Flow<Event<?>>() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow3.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "AdrFeeDetailComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof AdrFeeDetailEvent.FetchResponseError) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                Event<AdrFeeDetailEvent> value3 = eventFlow3.getValue();
                event = value3;
                if (!((event == null ? event.getData() : null) instanceof AdrFeeDetailEvent.FetchResponseError)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(flow3, value3, lifecycleOwner3.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventHandleEvents$lambda$5 = HandleEvents$lambda$5(snapshotState4CollectAsStateWithLifecycle3);
                if (eventHandleEvents$lambda$5 != null) {
                    eventConsumerInvoke2.consume(eventHandleEvents$lambda$5, new Function1() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m13712invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13712invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(activityErrorHandler, ((AdrFeeDetailEvent.FetchResponseError) eventHandleEvents$lambda$5.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                final Flow eventFlow22 = adrFeeDetailDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow22.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2", m3645f = "AdrFeeDetailComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof AdrFeeDetailEvent.NavigateToInstrumentDetailFragment) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                Event<AdrFeeDetailEvent> value22 = eventFlow22.getValue();
                Event<AdrFeeDetailEvent> event22 = value22;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow22, (event22 == null ? event22.getData() : null) instanceof AdrFeeDetailEvent.NavigateToInstrumentDetailFragment ? value22 : null, lifecycleOwner22.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventHandleEvents$lambda$7 = HandleEvents$lambda$7(snapshotState4CollectAsStateWithLifecycle22);
                if (eventHandleEvents$lambda$7 != null) {
                    eventConsumerInvoke.consume(eventHandleEvents$lambda$7, new Function1() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$HandleEvents$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m13713invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13713invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AdrFeeDetailEvent.NavigateToInstrumentDetailFragment navigateToInstrumentDetailFragment = (AdrFeeDetailEvent.NavigateToInstrumentDetailFragment) eventHandleEvents$lambda$7.getData();
                            Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(navigateToInstrumentDetailFragment.getInstrumentSymbol(), InstrumentDetailSource.HISTORY_DETAIL, navigateToInstrumentDetailFragment.getAccountNumber()), false, false, false, null, false, null, false, false, null, null, 4092, null);
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdrFeeDetailComposable.HandleEvents$lambda$9(activityErrorHandler, navigator, adrFeeDetailDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdrFeeDetailTopAppBar(final AdrFeeDetailViewState adrFeeDetailViewState, final Function0<Unit> function0, final AdrFeeDetailDuxo adrFeeDetailDuxo, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(672952760);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(adrFeeDetailViewState) : composerStartRestartGroup.changedInstance(adrFeeDetailViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(adrFeeDetailDuxo) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(672952760, i2, -1, "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailTopAppBar (AdrFeeDetailComposable.kt:303)");
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(AdrFeeDetailComposable2.INSTANCE.m13715getLambda$1091670171$feature_equity_history_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-843776583, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt.AdrFeeDetailTopAppBar.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-843776583, i3, -1, "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailTopAppBar.<anonymous> (AdrFeeDetailComposable.kt:308)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "back_button"), false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i3 << 12) & 57344), 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-298507814, true, new C151032(adrFeeDetailDuxo, adrFeeDetailViewState), composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdrFeeDetailComposable.AdrFeeDetailTopAppBar$lambda$10(adrFeeDetailViewState, function0, adrFeeDetailDuxo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AdrFeeDetailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$AdrFeeDetailTopAppBar$2 */
    static final class C151032 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ AdrFeeDetailDuxo $duxo;
        final /* synthetic */ AdrFeeDetailViewState $viewState;

        C151032(AdrFeeDetailDuxo adrFeeDetailDuxo, AdrFeeDetailViewState adrFeeDetailViewState) {
            this.$duxo = adrFeeDetailDuxo;
            this.$viewState = adrFeeDetailViewState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-298507814, i, -1, "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailTopAppBar.<anonymous> (AdrFeeDetailComposable.kt:314)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$duxo);
            final AdrFeeDetailDuxo adrFeeDetailDuxo = this.$duxo;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailComposableKt$AdrFeeDetailTopAppBar$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdrFeeDetailComposable.C151032.invoke$lambda$1$lambda$0(adrFeeDetailDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.bentoPlaceholder$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), this.$viewState.getInstrumentSymbol() == null, null, 2, null), AdrFeeDetailComposable4.VIEW_INSTRUMENT_BUTTON);
            FontWeight bold = FontWeight.INSTANCE.getBold();
            int i2 = C15093R.string.adr_fee_detail_menu_item_title_view_symbol;
            String instrumentSymbol = this.$viewState.getInstrumentSymbol();
            if (instrumentSymbol == null) {
                instrumentSymbol = "AAPL";
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i2, new Object[]{instrumentSymbol}, composer, 0), modifierTestTag, null, null, bold, null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16364);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AdrFeeDetailDuxo adrFeeDetailDuxo) {
            adrFeeDetailDuxo.onViewInstrumentButtonClicked();
            return Unit.INSTANCE;
        }
    }
}
