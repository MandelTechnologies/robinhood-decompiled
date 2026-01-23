package com.robinhood.android.common.portfolio.instrument;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo3;
import com.robinhood.android.common.portfolio.unified.StaleCheck;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.instrumentrow.InstrumentRow5;
import com.robinhood.android.instrumentrow.InstrumentRowState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.models.portfolio.InstrumentDetails;
import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.models.serverdriven.experimental.api.InstrumentListItem;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p479j$.time.Instant;

/* compiled from: InstrumentListItemComposable.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0013\u001a\u009f\u0001\u0010\u0014\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00172W\u0010\u0007\u001aS\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0004\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r0\u001b¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00010\u00182\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010 \u001a\u00020\u0001*\u00020\u00152\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u008e\u0002"}, m3636d2 = {"InstrumentListItemComposable", "", "displayType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "instrument", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentListItem;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onClick", "Lkotlin/Function0;", "onDisplayValueClicked", "modifier", "Landroidx/compose/ui/Modifier;", "identifier", "", "accountNumber", "duxo", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentListItemDuxo;", "(Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentListItem;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/common/portfolio/instrument/InstrumentListItemDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadingInstrumentListItem", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lazyInstruments", "Landroidx/compose/foundation/lazy/LazyListScope;", "instruments", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "", "allInstrumentIds", "genericAction", "baseEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "loadingLazyInstruments", "count", "", "feature-lib-portfolio_externalDebug", "viewState", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentItemState;", "isStale", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class InstrumentListItemComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentListItemComposable$lambda$1(InstrumentDisplayType instrumentDisplayType, InstrumentListItem instrumentListItem, Function0 function0, Function0 function02, Modifier modifier, String str, String str2, InstrumentListItemDuxo instrumentListItemDuxo, int i, int i2, Composer composer, int i3) {
        InstrumentListItemComposable(instrumentDisplayType, instrumentListItem, function0, function02, modifier, str, str2, instrumentListItemDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentListItemComposable$lambda$9(InstrumentDisplayType instrumentDisplayType, InstrumentListItem instrumentListItem, Function0 function0, Function0 function02, Modifier modifier, String str, String str2, InstrumentListItemDuxo instrumentListItemDuxo, int i, int i2, Composer composer, int i3) {
        InstrumentListItemComposable(instrumentDisplayType, instrumentListItem, function0, function02, modifier, str, str2, instrumentListItemDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingInstrumentListItem$lambda$10(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingInstrumentListItem(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadingLazyInstruments$lambda$16(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstrumentListItemComposable(final InstrumentDisplayType displayType, final InstrumentListItem<? extends GenericAction> instrument, final Function0<Unit> function0, final Function0<Unit> onDisplayValueClicked, Modifier modifier, String str, String str2, InstrumentListItemDuxo instrumentListItemDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str3;
        int i5;
        String str4;
        InstrumentListItemDuxo instrumentListItemDuxo2;
        Composer composer2;
        String str5;
        final Modifier modifier3;
        int i6;
        final String str6;
        final InstrumentListItemDuxo instrumentListItemDuxo3;
        final String str7;
        Composer composer3;
        InstrumentListItemDuxo3 instrumentListItemDuxo3InstrumentListItemComposable$lambda$0;
        String str8;
        String str9;
        Modifier modifier4;
        InstrumentListItemDuxo instrumentListItemDuxo4;
        final InstrumentListItemDuxo instrumentListItemDuxo5;
        final InstrumentListItem<? extends GenericAction> instrumentListItem;
        boolean zChangedInstance;
        Object objRememberedValue;
        final String str10;
        final String str11;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(onDisplayValueClicked, "onDisplayValueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1817738116);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(displayType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(instrument) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisplayValueClicked) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    str3 = str;
                    i3 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        str4 = str2;
                        i3 |= composerStartRestartGroup.changed(str4) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i2 & 128) == 0) {
                            instrumentListItemDuxo2 = instrumentListItemDuxo;
                            int i8 = composerStartRestartGroup.changedInstance(instrumentListItemDuxo2) ? 8388608 : 4194304;
                            i3 |= i8;
                        } else {
                            instrumentListItemDuxo2 = instrumentListItemDuxo;
                        }
                        i3 |= i8;
                    } else {
                        instrumentListItemDuxo2 = instrumentListItemDuxo;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier6 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            String str12 = "";
                            String str13 = i4 == 0 ? "" : str3;
                            String str14 = i5 == 0 ? "" : str4;
                            if ((i2 & 128) == 0) {
                                String instrument_id = instrument.getInstrument_id();
                                if (!StringsKt.isBlank(str13)) {
                                    str12 = PlaceholderUtils.XXShortPlaceholderText + str13;
                                }
                                String str15 = "Instrument: " + instrument_id + str12;
                                composerStartRestartGroup.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                str5 = str13;
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InstrumentListItemDuxo.class), current, str15, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                composer2 = composerStartRestartGroup;
                                composer2.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$InstrumentListItemComposable$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$InstrumentListItemComposable$$inlined$duxo$1.1
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
                                i3 &= -29360129;
                                instrumentListItemDuxo2 = (InstrumentListItemDuxo) baseDuxo;
                            } else {
                                composer2 = composerStartRestartGroup;
                                str5 = str13;
                            }
                            modifier3 = modifier6;
                            i6 = i3;
                            str6 = str5;
                            instrumentListItemDuxo3 = instrumentListItemDuxo2;
                            str7 = str14;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            i6 = i3;
                            instrumentListItemDuxo3 = instrumentListItemDuxo2;
                            str6 = str3;
                            str7 = str4;
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1817738116, i6, -1, "com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposable (InstrumentListItemComposable.kt:51)");
                        }
                        Composer composer4 = composer2;
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(instrumentListItemDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                        composer3 = composer4;
                        instrumentListItemDuxo3InstrumentListItemComposable$lambda$0 = InstrumentListItemComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (!Intrinsics.areEqual(instrumentListItemDuxo3InstrumentListItemComposable$lambda$0, InstrumentListItemDuxo3.Loading.INSTANCE)) {
                            composer3.startReplaceGroup(1205379242);
                            LoadingInstrumentListItem(modifier3, composer3, (i6 >> 12) & 14, 0);
                            composer3.endReplaceGroup();
                            modifier4 = modifier3;
                            str8 = str6;
                            str9 = str7;
                            instrumentListItemDuxo4 = instrumentListItemDuxo3;
                        } else {
                            if (!(instrumentListItemDuxo3InstrumentListItemComposable$lambda$0 instanceof InstrumentListItemDuxo3.Loaded)) {
                                composer3.startReplaceGroup(1205378966);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-1287816635);
                            InstrumentListItemDuxo3 instrumentListItemDuxo3InstrumentListItemComposable$lambda$02 = InstrumentListItemComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                            Intrinsics.checkNotNull(instrumentListItemDuxo3InstrumentListItemComposable$lambda$02, "null cannot be cast to non-null type com.robinhood.android.common.portfolio.instrument.InstrumentItemState.Loaded");
                            InstrumentListItemDuxo3.Loaded loaded = (InstrumentListItemDuxo3.Loaded) instrumentListItemDuxo3InstrumentListItemComposable$lambda$02;
                            InstrumentDetails3 details = loaded.getDetails();
                            InstrumentDetails instrumentDetails = details instanceof InstrumentDetails ? (InstrumentDetails) details : null;
                            if (instrumentDetails == null) {
                                composer3.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup2 != null) {
                                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return InstrumentListItemComposable.InstrumentListItemComposable$lambda$1(displayType, instrument, function0, onDisplayValueClicked, modifier3, str6, str7, instrumentListItemDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            Modifier modifier7 = modifier3;
                            str8 = str6;
                            Instant receivedAt = ((InstrumentDetails) loaded.getDetails()).getReceivedAt();
                            composer3.startReplaceGroup(5004770);
                            boolean zChanged = composer3.changed(receivedAt);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(StaleCheck.checkIfDataIsStale(((InstrumentDetails) loaded.getDetails()).getReceivedAt())), null, 2, null);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                            composer3.endReplaceGroup();
                            Instant receivedAt2 = ((InstrumentDetails) loaded.getDetails()).getReceivedAt();
                            composer3.startReplaceGroup(-1633490746);
                            boolean zChanged2 = composer3.changed(snapshotState) | composer3.changedInstance(loaded);
                            Object objRememberedValue4 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new InstrumentListItemComposable2(loaded, snapshotState, null);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            composer3.endReplaceGroup();
                            EffectsKt.LaunchedEffect(receivedAt2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer3, 0);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier7, 0.0f, 1, null);
                            composer3.startReplaceGroup(1205403628);
                            Function0<Unit> function0Handling = function0 == null ? SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer3, 0), instrument.getTap_action()) : function0;
                            composer3.endReplaceGroup();
                            str9 = str7;
                            modifier4 = modifier7;
                            instrumentListItemDuxo4 = instrumentListItemDuxo3;
                            InstrumentRow5.InstrumentRow(ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, function0Handling, 7, null), InstrumentRowStates.instrumentRowState(!Intrinsics.areEqual(displayType.getServerValue(), ((InstrumentDetails) loaded.getDetails()).getDisplayType()), false, instrumentDetails.getSubValue(), instrumentDetails.getSubtitle(), instrumentDetails.getTitle(), instrumentDetails.getValue(), null, instrumentDetails.getInstrumentId(), instrumentDetails.getInstrumentType(), str9, InstrumentListItemComposable$lambda$3(snapshotState), null, composer3, ((i6 << 9) & 1879048192) | 48, 0, 2112), null, onDisplayValueClicked, composer3, (InstrumentRowState.$stable << 3) | (i6 & 7168), 4);
                            composer3.endReplaceGroup();
                        }
                        String instrument_id2 = instrument.getInstrument_id();
                        InstrumentDisplayType display_type = instrument.getDisplay_type();
                        composer3.startReplaceGroup(-1633490746);
                        instrumentListItemDuxo5 = instrumentListItemDuxo4;
                        instrumentListItem = instrument;
                        zChangedInstance = composer3.changedInstance(instrumentListItemDuxo5) | composer3.changedInstance(instrumentListItem);
                        objRememberedValue = composer3.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InstrumentListItemComposable.InstrumentListItemComposable$lambda$8$lambda$7(instrumentListItemDuxo5, instrumentListItem, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        LifecycleEffectKt.LifecycleResumeEffect(instrument_id2, display_type, null, (Function1) objRememberedValue, composer3, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str10 = str9;
                        str11 = str8;
                        modifier5 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        instrumentListItem = instrument;
                        instrumentListItemDuxo5 = instrumentListItemDuxo2;
                        str11 = str3;
                        str10 = str4;
                        composer3 = composerStartRestartGroup;
                        modifier5 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final InstrumentListItem<? extends GenericAction> instrumentListItem2 = instrumentListItem;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return InstrumentListItemComposable.InstrumentListItemComposable$lambda$9(displayType, instrumentListItem2, function0, onDisplayValueClicked, modifier5, str11, str10, instrumentListItemDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                str4 = str2;
                if ((i & 12582912) != 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        String str122 = "";
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        modifier3 = modifier6;
                        i6 = i3;
                        str6 = str5;
                        instrumentListItemDuxo3 = instrumentListItemDuxo2;
                        str7 = str14;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Composer composer42 = composer2;
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(instrumentListItemDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                        composer3 = composer42;
                        instrumentListItemDuxo3InstrumentListItemComposable$lambda$0 = InstrumentListItemComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                        if (!Intrinsics.areEqual(instrumentListItemDuxo3InstrumentListItemComposable$lambda$0, InstrumentListItemDuxo3.Loading.INSTANCE)) {
                        }
                        String instrument_id22 = instrument.getInstrument_id();
                        InstrumentDisplayType display_type2 = instrument.getDisplay_type();
                        composer3.startReplaceGroup(-1633490746);
                        instrumentListItemDuxo5 = instrumentListItemDuxo4;
                        instrumentListItem = instrument;
                        zChangedInstance = composer3.changedInstance(instrumentListItemDuxo5) | composer3.changedInstance(instrumentListItem);
                        objRememberedValue = composer3.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InstrumentListItemComposable.InstrumentListItemComposable$lambda$8$lambda$7(instrumentListItemDuxo5, instrumentListItem, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue);
                            composer3.endReplaceGroup();
                            LifecycleEffectKt.LifecycleResumeEffect(instrument_id22, display_type2, null, (Function1) objRememberedValue, composer3, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            str10 = str9;
                            str11 = str8;
                            modifier5 = modifier4;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str3 = str;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            str4 = str2;
            if ((i & 12582912) != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        str3 = str;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        str4 = str2;
        if ((i & 12582912) != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstrumentListItemComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final InstrumentListItemDuxo3 InstrumentListItemComposable$lambda$0(SnapshotState4<? extends InstrumentListItemDuxo3> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean InstrumentListItemComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult InstrumentListItemComposable$lambda$8$lambda$7(InstrumentListItemDuxo instrumentListItemDuxo, InstrumentListItem instrumentListItem, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = instrumentListItemDuxo.bind(com.robinhood.utils.extensions.StringsKt.toUuid(instrumentListItem.getInstrument_id()), instrumentListItem.getInstrument_type(), instrumentListItem.getPolling_rate(), instrumentListItem.getDisplay_type());
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$InstrumentListItemComposable$lambda$8$lambda$7$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    public static final void LoadingInstrumentListItem(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1591958320);
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
                ComposerKt.traceEventStart(-1591958320, i3, -1, "com.robinhood.android.common.portfolio.instrument.LoadingInstrumentListItem (InstrumentListItemComposable.kt:107)");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentListItemComposable.LoadingInstrumentListItem$lambda$10(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ void lazyInstruments$default(LazyListScope lazyListScope, InstrumentDisplayType instrumentDisplayType, ImmutableList immutableList, Function3 function3, Function0 function0, UserInteractionEventDescriptor userInteractionEventDescriptor, Modifier modifier, int i, Object obj) {
        if ((i & 32) != 0) {
            modifier = Modifier.INSTANCE;
        }
        lazyInstruments(lazyListScope, instrumentDisplayType, immutableList, function3, function0, userInteractionEventDescriptor, modifier);
    }

    public static final void lazyInstruments(LazyListScope lazyListScope, final InstrumentDisplayType displayType, final ImmutableList<? extends InstrumentListItem<? extends GenericAction>> instruments, final Function3<? super InstrumentListItem<? extends GenericAction>, ? super List<String>, ? super GenericAction, Unit> onClick, final Function0<Unit> onDisplayValueClicked, final UserInteractionEventDescriptor baseEventDescriptor, final Modifier modifier) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onDisplayValueClicked, "onDisplayValueClicked");
        Intrinsics.checkNotNullParameter(baseEventDescriptor, "baseEventDescriptor");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        final Function1 function1 = new Function1() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentListItemComposable.lazyInstruments$lambda$11((InstrumentListItem) obj);
            }
        };
        final C11516x432c1c8f c11516x432c1c8f = new Function1() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$lazyInstruments$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(InstrumentListItem<? extends GenericAction> instrumentListItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((InstrumentListItem<? extends GenericAction>) obj);
            }
        };
        lazyListScope.items(instruments.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$lazyInstruments$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(instruments.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$lazyInstruments$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c11516x432c1c8f.invoke(instruments.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$lazyInstruments$$inlined$items$default$4
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
                final InstrumentListItem instrumentListItem = (InstrumentListItem) instruments.get(i);
                composer.startReplaceGroup(1068014447);
                Modifier modifier2 = modifier;
                UserInteractionEventDescriptor userInteractionEventDescriptor = baseEventDescriptor;
                Component component = userInteractionEventDescriptor.getComponent();
                Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(modifier2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, component != null ? Component.copy$default(component, null, instrumentListItem.getInstrument_id(), null, 5, null) : null, null, 47, null));
                InstrumentDisplayType instrumentDisplayType = displayType;
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(onClick) | composer.changedInstance(instrumentListItem) | composer.changedInstance(instruments);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function3 function3 = onClick;
                    final ImmutableList immutableList = instruments;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$lazyInstruments$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Function3<InstrumentListItem<? extends GenericAction>, List<String>, GenericAction, Unit> function32 = function3;
                            InstrumentListItem<GenericAction> instrumentListItem2 = instrumentListItem;
                            ImmutableList<InstrumentListItem<GenericAction>> immutableList2 = immutableList;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList2, 10));
                            Iterator<InstrumentListItem<GenericAction>> it = immutableList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next().getInstrument_id());
                            }
                            function32.invoke(instrumentListItem2, arrayList, instrumentListItem.getTap_action());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                InstrumentListItemComposable.InstrumentListItemComposable(instrumentDisplayType, instrumentListItem, (Function0) objRememberedValue, onDisplayValueClicked, modifierLogScreenTransitions, null, null, null, composer, 0, 224);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object lazyInstruments$lambda$11(InstrumentListItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getInstrument_id();
    }

    public static /* synthetic */ void loadingLazyInstruments$default(LazyListScope lazyListScope, Modifier modifier, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        loadingLazyInstruments(lazyListScope, modifier, i);
    }

    public static final void loadingLazyInstruments(LazyListScope lazyListScope, final Modifier modifier, int i) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            listCreateListBuilder.add(String.valueOf(i2));
        }
        final ImmutableList immutableList = extensions2.toImmutableList(CollectionsKt.build(listCreateListBuilder));
        final Function1 function1 = new Function1() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentListItemComposable.loadingLazyInstruments$lambda$16((String) obj);
            }
        };
        final C11520x4d24a83f c11520x4d24a83f = new Function1() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$loadingLazyInstruments$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(String str) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((String) obj);
            }
        };
        lazyListScope.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$loadingLazyInstruments$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i3) {
                return function1.invoke(immutableList.get(i3));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$loadingLazyInstruments$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i3) {
                return c11520x4d24a83f.invoke(immutableList.get(i3));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposableKt$loadingLazyInstruments$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i3, Composer composer, int i4) {
                int i5;
                if ((i4 & 6) == 0) {
                    i5 = (composer.changed(lazyItemScope) ? 4 : 2) | i4;
                } else {
                    i5 = i4;
                }
                if ((i4 & 48) == 0) {
                    i5 |= composer.changed(i3) ? 32 : 16;
                }
                if (!composer.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                composer.startReplaceGroup(1731125518);
                InstrumentListItemComposable.LoadingInstrumentListItem(modifier, composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}
