package com.robinhood.android.common.portfolio.options;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo;
import com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo3;
import com.robinhood.android.common.portfolio.instrument.InstrumentRowStates;
import com.robinhood.android.common.portfolio.unified.StaleCheck;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.instrumentrow.InstrumentRow5;
import com.robinhood.android.instrumentrow.InstrumentRowState;
import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.android.models.portfolio.OptionStrategyDetails;
import com.robinhood.android.options.optionsstring.common.UiOptionStrategyDisplays;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p479j$.time.Instant;

/* compiled from: OptionInstrumentListItemComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002"}, m3636d2 = {"OptionInstrumentListItemComposable", "", "optionCuratedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "displayType", "", "onClick", "Lkotlin/Function0;", "onDisplayValueClicked", "modifier", "Landroidx/compose/ui/Modifier;", "identifier", "accountNumber", "duxo", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentListItemDuxo;", "(Lcom/robinhood/models/db/CuratedListItem;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/common/portfolio/instrument/InstrumentListItemDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadingInstrumentListItem", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-lib-portfolio_externalDebug", "viewState", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentItemState;", "isStale", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.options.OptionInstrumentListItemComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionInstrumentListItemComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingInstrumentListItem$lambda$10(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingInstrumentListItem(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionInstrumentListItemComposable$lambda$1(CuratedListItem curatedListItem, String str, Function0 function0, Function0 function02, Modifier modifier, String str2, String str3, InstrumentListItemDuxo instrumentListItemDuxo, int i, int i2, Composer composer, int i3) {
        OptionInstrumentListItemComposable(curatedListItem, str, function0, function02, modifier, str2, str3, instrumentListItemDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionInstrumentListItemComposable$lambda$9(CuratedListItem curatedListItem, String str, Function0 function0, Function0 function02, Modifier modifier, String str2, String str3, InstrumentListItemDuxo instrumentListItemDuxo, int i, int i2, Composer composer, int i3) {
        OptionInstrumentListItemComposable(curatedListItem, str, function0, function02, modifier, str2, str3, instrumentListItemDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionInstrumentListItemComposable(final CuratedListItem optionCuratedListItem, final String displayType, final Function0<Unit> onClick, final Function0<Unit> onDisplayValueClicked, Modifier modifier, String str, String str2, InstrumentListItemDuxo instrumentListItemDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str3;
        int i5;
        String str4;
        InstrumentListItemDuxo instrumentListItemDuxo2;
        String str5;
        int i6;
        final Modifier modifier3;
        InstrumentListItemDuxo instrumentListItemDuxo3;
        final String str6;
        InstrumentListItemDuxo3 instrumentListItemDuxo3OptionInstrumentListItemComposable$lambda$0;
        String str7;
        int i7;
        boolean z;
        boolean z2;
        Modifier modifier4;
        InstrumentListItemDuxo instrumentListItemDuxo4;
        final String str8;
        final InstrumentListItemDuxo instrumentListItemDuxo5;
        final CuratedListItem curatedListItem;
        int i8;
        boolean z3;
        Object objRememberedValue;
        final String str9;
        final Modifier modifier5;
        final String str10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(optionCuratedListItem, "optionCuratedListItem");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onDisplayValueClicked, "onDisplayValueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-829175628);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(optionCuratedListItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(displayType) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisplayValueClicked) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    str3 = str;
                    i3 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    str4 = str2;
                } else {
                    str4 = str2;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(str4) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        instrumentListItemDuxo2 = instrumentListItemDuxo;
                        int i10 = composerStartRestartGroup.changedInstance(instrumentListItemDuxo2) ? 8388608 : 4194304;
                        i3 |= i10;
                    } else {
                        instrumentListItemDuxo2 = instrumentListItemDuxo;
                    }
                    i3 |= i10;
                } else {
                    instrumentListItemDuxo2 = instrumentListItemDuxo;
                }
                if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    curatedListItem = optionCuratedListItem;
                    str8 = str4;
                    modifier5 = modifier2;
                    instrumentListItemDuxo5 = instrumentListItemDuxo2;
                    str10 = str3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier6 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        String str11 = "";
                        String str12 = i4 == 0 ? "" : str3;
                        if (i5 != 0) {
                            str4 = "";
                        }
                        if ((i2 & 128) == 0) {
                            UUID id = optionCuratedListItem.getId();
                            if (!StringsKt.isBlank(str12)) {
                                str11 = PlaceholderUtils.XXShortPlaceholderText + str12;
                            }
                            String str13 = "OptionInstrument: " + id + str11;
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            str5 = str12;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InstrumentListItemDuxo.class), current, str13, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.portfolio.options.OptionInstrumentListItemComposableKt$OptionInstrumentListItemComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.common.portfolio.options.OptionInstrumentListItemComposableKt$OptionInstrumentListItemComposable$$inlined$duxo$1.1
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
                            instrumentListItemDuxo2 = (InstrumentListItemDuxo) baseDuxo;
                            i3 &= -29360129;
                        } else {
                            str5 = str12;
                        }
                        i6 = i3;
                        modifier3 = modifier6;
                        instrumentListItemDuxo3 = instrumentListItemDuxo2;
                        str6 = str5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        Modifier modifier7 = modifier2;
                        i6 = i3;
                        modifier3 = modifier7;
                        instrumentListItemDuxo3 = instrumentListItemDuxo2;
                        str6 = str3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-829175628, i6, -1, "com.robinhood.android.common.portfolio.options.OptionInstrumentListItemComposable (OptionInstrumentListItemComposable.kt:48)");
                    }
                    int i11 = i6;
                    Composer composer2 = composerStartRestartGroup;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(instrumentListItemDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                    composerStartRestartGroup = composer2;
                    instrumentListItemDuxo3OptionInstrumentListItemComposable$lambda$0 = OptionInstrumentListItemComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (!Intrinsics.areEqual(instrumentListItemDuxo3OptionInstrumentListItemComposable$lambda$0, InstrumentListItemDuxo3.Loading.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(2026157378);
                        LoadingInstrumentListItem(modifier3, composerStartRestartGroup, (i11 >> 12) & 14, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        instrumentListItemDuxo4 = instrumentListItemDuxo3;
                        i7 = i11;
                        modifier4 = modifier3;
                        str7 = str6;
                        z2 = false;
                        str8 = str4;
                        z = true;
                    } else {
                        if (!(instrumentListItemDuxo3OptionInstrumentListItemComposable$lambda$0 instanceof InstrumentListItemDuxo3.Loaded)) {
                            composerStartRestartGroup.startReplaceGroup(2026157474);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1613486663);
                        InstrumentListItemDuxo3 instrumentListItemDuxo3OptionInstrumentListItemComposable$lambda$02 = OptionInstrumentListItemComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        Intrinsics.checkNotNull(instrumentListItemDuxo3OptionInstrumentListItemComposable$lambda$02, "null cannot be cast to non-null type com.robinhood.android.common.portfolio.instrument.InstrumentItemState.Loaded");
                        InstrumentListItemDuxo3.Loaded loaded = (InstrumentListItemDuxo3.Loaded) instrumentListItemDuxo3OptionInstrumentListItemComposable$lambda$02;
                        InstrumentDetails3 details = loaded.getDetails();
                        OptionStrategyDetails optionStrategyDetails = details instanceof OptionStrategyDetails ? (OptionStrategyDetails) details : null;
                        if (optionStrategyDetails == null) {
                            composerStartRestartGroup.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup2 != null) {
                                final String str14 = str4;
                                final InstrumentListItemDuxo instrumentListItemDuxo6 = instrumentListItemDuxo3;
                                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.options.OptionInstrumentListItemComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return OptionInstrumentListItemComposable.OptionInstrumentListItemComposable$lambda$1(optionCuratedListItem, displayType, onClick, onDisplayValueClicked, modifier3, str6, str14, instrumentListItemDuxo6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        InstrumentListItemDuxo instrumentListItemDuxo7 = instrumentListItemDuxo3;
                        Modifier modifier8 = modifier3;
                        str7 = str6;
                        String str15 = str4;
                        Object receivedAt = ((OptionStrategyDetails) loaded.getDetails()).getReceivedAt();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChanged = composerStartRestartGroup.changed(receivedAt);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(StaleCheck.checkIfDataIsStale(((OptionStrategyDetails) loaded.getDetails()).getReceivedAt())), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        Instant receivedAt2 = ((OptionStrategyDetails) loaded.getDetails()).getReceivedAt();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged2 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(loaded);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new OptionInstrumentListItemComposable2(loaded, snapshotState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(receivedAt2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                        Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        i7 = i11;
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier8, 0.0f, 1, null), false, null, null, onClick, 7, null);
                        boolean z4 = !Intrinsics.areEqual(displayType, optionStrategyDetails.getDisplayType());
                        InstrumentDetails3.TextDisplay subValue = optionStrategyDetails.getSubValue();
                        UiOptionStrategyInfo strategyInfo = optionStrategyDetails.getStrategyInfo();
                        Intrinsics.checkNotNull(resources);
                        String string2 = UiOptionStrategyDisplays.getSubtitleString((UiOptionStrategyDisplay) strategyInfo, resources, optionStrategyDetails.getStrategyInfo().getOptionChain().getSettleOnOpen(), false).toString();
                        Color color = Color.FG2;
                        z = true;
                        z2 = false;
                        modifier4 = modifier8;
                        instrumentListItemDuxo4 = instrumentListItemDuxo7;
                        str8 = str15;
                        InstrumentRow5.InstrumentRow(modifierM4893clickableXHw0xAI$default, InstrumentRowStates.instrumentRowState(z4, false, subValue, new InstrumentDetails3.TextDisplay(string2, new ThemedColor(color, color)), optionStrategyDetails.getTitle(), optionStrategyDetails.getValue(), null, optionStrategyDetails.getInstrumentId(), optionStrategyDetails.getInstrumentType(), str15, OptionInstrumentListItemComposable$lambda$3(snapshotState), null, composerStartRestartGroup, ((i7 << 9) & 1879048192) | 48, 0, 2112), null, onDisplayValueClicked, composerStartRestartGroup, (InstrumentRowState.$stable << 3) | (i7 & 7168), 4);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    UUID id2 = optionCuratedListItem.getId();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    instrumentListItemDuxo5 = instrumentListItemDuxo4;
                    curatedListItem = optionCuratedListItem;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(instrumentListItemDuxo5) | composerStartRestartGroup.changedInstance(curatedListItem);
                    i8 = i7 & 112;
                    if (i8 != 32) {
                        z = z2;
                    }
                    z3 = zChangedInstance2 | z;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        str9 = displayType;
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.options.OptionInstrumentListItemComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionInstrumentListItemComposable.OptionInstrumentListItemComposable$lambda$8$lambda$7(instrumentListItemDuxo5, curatedListItem, str9, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        str9 = displayType;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(id2, str9, null, (Function1) objRememberedValue, composerStartRestartGroup, i8, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    str10 = str7;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final CuratedListItem curatedListItem2 = curatedListItem;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.options.OptionInstrumentListItemComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionInstrumentListItemComposable.OptionInstrumentListItemComposable$lambda$9(curatedListItem2, displayType, onClick, onDisplayValueClicked, modifier5, str10, str8, instrumentListItemDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            str3 = str;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 == 0) {
                    }
                    String str112 = "";
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    i6 = i3;
                    modifier3 = modifier6;
                    instrumentListItemDuxo3 = instrumentListItemDuxo2;
                    str6 = str5;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i112 = i6;
                    Composer composer22 = composerStartRestartGroup;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(instrumentListItemDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer22, 0, 7);
                    composerStartRestartGroup = composer22;
                    instrumentListItemDuxo3OptionInstrumentListItemComposable$lambda$0 = OptionInstrumentListItemComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                    if (!Intrinsics.areEqual(instrumentListItemDuxo3OptionInstrumentListItemComposable$lambda$0, InstrumentListItemDuxo3.Loading.INSTANCE)) {
                    }
                    UUID id22 = optionCuratedListItem.getId();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    instrumentListItemDuxo5 = instrumentListItemDuxo4;
                    curatedListItem = optionCuratedListItem;
                    boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(instrumentListItemDuxo5) | composerStartRestartGroup.changedInstance(curatedListItem);
                    i8 = i7 & 112;
                    if (i8 != 32) {
                    }
                    z3 = zChangedInstance22 | z;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z3) {
                        str9 = displayType;
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.options.OptionInstrumentListItemComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionInstrumentListItemComposable.OptionInstrumentListItemComposable$lambda$8$lambda$7(instrumentListItemDuxo5, curatedListItem, str9, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        LifecycleEffectKt.LifecycleResumeEffect(id22, str9, null, (Function1) objRememberedValue, composerStartRestartGroup, i8, 4);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                        str10 = str7;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        str3 = str;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionInstrumentListItemComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final InstrumentListItemDuxo3 OptionInstrumentListItemComposable$lambda$0(SnapshotState4<? extends InstrumentListItemDuxo3> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean OptionInstrumentListItemComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult OptionInstrumentListItemComposable$lambda$8$lambda$7(InstrumentListItemDuxo instrumentListItemDuxo, CuratedListItem curatedListItem, String str, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBindOptions = instrumentListItemDuxo.bindOptions(curatedListItem.getId(), str, curatedListItem);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.common.portfolio.options.OptionInstrumentListItemComposableKt$OptionInstrumentListItemComposable$lambda$8$lambda$7$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBindOptions, null, 1, null);
            }
        };
    }

    public static final void LoadingInstrumentListItem(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1940788842);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1940788842, i3, -1, "com.robinhood.android.common.portfolio.options.LoadingInstrumentListItem (OptionInstrumentListItemComposable.kt:112)");
            }
            InstrumentRow5.LoadingInstrumentRow(modifier, false, composerStartRestartGroup, i3 & 14, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.options.OptionInstrumentListItemComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionInstrumentListItemComposable.LoadingInstrumentListItem$lambda$10(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
