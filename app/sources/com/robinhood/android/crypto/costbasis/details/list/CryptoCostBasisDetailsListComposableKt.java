package com.robinhood.android.crypto.costbasis.details.list;

import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
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
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
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
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.crypto.contracts.CryptoCostBasisDetailsIntentKey;
import com.robinhood.android.crypto.costbasis.C12782R;
import com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsDestinations;
import com.robinhood.android.crypto.costbasis.details.entry.CostBasisEntryArgs;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListEvent;
import com.robinhood.android.crypto.costbasis.utils.CostBasisErrorDetails;
import com.robinhood.android.crypto.costbasis.utils.CostBasisErrorDialog;
import com.robinhood.android.crypto.costbasis.utils.CostBasisLoggingUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavTransition;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import nummus.p512v1.CostBasisBottomSheetDto;

/* compiled from: CryptoCostBasisDetailsListComposable.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a-\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\u0012\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u0004\u0018\u00010%X\u008a\u008e\u0002²\u0006\f\u0010&\u001a\u0004\u0018\u00010'X\u008a\u008e\u0002²\u0006\f\u0010(\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002"}, m3636d2 = {"CryptoCostBasisDetailsListComposable", "", "args", "Lcom/robinhood/android/crypto/contracts/CryptoCostBasisDetailsIntentKey;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListDuxo;", "(Lcom/robinhood/android/crypto/contracts/CryptoCostBasisDetailsIntentKey;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListDuxo;Landroidx/compose/runtime/Composer;II)V", "CryptoCostBasisDetailsListComposableContent", "state", "Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListViewState;", "onClickAddEntry", "Lkotlin/Function0;", "(Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BreakdownCard", "breakdownCardState", "Lcom/robinhood/android/crypto/costbasis/details/list/BreakdownCardState;", "(Lcom/robinhood/android/crypto/costbasis/details/list/BreakdownCardState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AvailableQuantityBottomSheet", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "sheetData", "Lnummus/v1/CostBasisBottomSheetDto;", "closedQuantity", "", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Lnummus/v1/CostBasisBottomSheetDto;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "CostBasisLotRow", "row", "Lcom/robinhood/android/crypto/costbasis/details/list/CostBasisLotRowData;", "(Lcom/robinhood/android/crypto/costbasis/details/list/CostBasisLotRowData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-cost-basis_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListEvent;", "errorResponse", "Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorDetails;", "savedIsCompleted", "", "bottomSheetData"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoCostBasisDetailsListComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvailableQuantityBottomSheet$lambda$28(RhModalBottomSheet5 rhModalBottomSheet5, CostBasisBottomSheetDto costBasisBottomSheetDto, String str, int i, Composer composer, int i2) {
        AvailableQuantityBottomSheet(rhModalBottomSheet5, costBasisBottomSheetDto, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BreakdownCard$lambda$25(BreakdownCardState breakdownCardState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BreakdownCard(breakdownCardState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CostBasisLotRow$lambda$29(CostBasisLotRowData costBasisLotRowData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CostBasisLotRow(costBasisLotRowData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCostBasisDetailsListComposable$lambda$9(CryptoCostBasisDetailsIntentKey cryptoCostBasisDetailsIntentKey, Modifier modifier, CryptoCostBasisDetailsListDuxo cryptoCostBasisDetailsListDuxo, int i, int i2, Composer composer, int i3) {
        CryptoCostBasisDetailsListComposable(cryptoCostBasisDetailsIntentKey, modifier, cryptoCostBasisDetailsListDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCostBasisDetailsListComposableContent$lambda$14(CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoCostBasisDetailsListComposableContent(cryptoCostBasisDetailsListViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$30(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final CostBasisBottomSheetDto BreakdownCard$lambda$16(SnapshotState<CostBasisBottomSheetDto> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoCostBasisDetailsListViewState CryptoCostBasisDetailsListComposable$lambda$0(SnapshotState4<CryptoCostBasisDetailsListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoCostBasisDetailsListEvent> CryptoCostBasisDetailsListComposable$lambda$1(SnapshotState4<Event<CryptoCostBasisDetailsListEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final CostBasisErrorDetails CryptoCostBasisDetailsListComposable$lambda$3(SnapshotState<CostBasisErrorDetails> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean CryptoCostBasisDetailsListComposableContent$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0420  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoCostBasisDetailsListComposable(final CryptoCostBasisDetailsIntentKey args, Modifier modifier, CryptoCostBasisDetailsListDuxo cryptoCostBasisDetailsListDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoCostBasisDetailsListDuxo cryptoCostBasisDetailsListDuxo2;
        Modifier modifier3;
        int i4;
        CreationExtras defaultViewModelCreationExtras;
        CryptoCostBasisDetailsListDuxo cryptoCostBasisDetailsListDuxo3;
        Event<CryptoCostBasisDetailsListEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        String entryPointIdentifier;
        CostBasisErrorDetails costBasisErrorDetailsCryptoCostBasisDetailsListComposable$lambda$3;
        final Event<CryptoCostBasisDetailsListEvent> eventCryptoCostBasisDetailsListComposable$lambda$1;
        final CryptoCostBasisDetailsListDuxo cryptoCostBasisDetailsListDuxo4;
        final Modifier modifier4;
        EventConsumer<CryptoCostBasisDetailsListEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1664356112);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoCostBasisDetailsListDuxo2 = cryptoCostBasisDetailsListDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoCostBasisDetailsListDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoCostBasisDetailsListDuxo2 = cryptoCostBasisDetailsListDuxo;
                }
                i3 |= i6;
            } else {
                cryptoCostBasisDetailsListDuxo2 = cryptoCostBasisDetailsListDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoCostBasisDetailsListDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$$inlined$duxo$1.1
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
                        CryptoCostBasisDetailsListDuxo cryptoCostBasisDetailsListDuxo5 = (CryptoCostBasisDetailsListDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        cryptoCostBasisDetailsListDuxo3 = cryptoCostBasisDetailsListDuxo5;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1664356112, i4, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposable (CryptoCostBasisDetailsListComposable.kt:93)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoCostBasisDetailsListDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup = composerStartRestartGroup;
                        final StateFlow<Event<CryptoCostBasisDetailsListEvent>> eventFlow = cryptoCostBasisDetailsListDuxo3.getEventFlow();
                        composerStartRestartGroup.startReplaceGroup(-523522313);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Lifecycle.State state = Lifecycle.State.STARTED;
                        CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                        Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$$inlined$collectEventAsStateWithLifecycle$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoCostBasisDetailsListComposable.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                        if ((event != null ? event.getData() : null) instanceof CryptoCostBasisDetailsListEvent) {
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

                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                                Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }
                        };
                        Event<CryptoCostBasisDetailsListEvent> value = eventFlow.getValue();
                        event = value;
                        if (!((event == null ? event.getData() : null) instanceof CryptoCostBasisDetailsListEvent)) {
                            value = null;
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                        Screen screen = new Screen(Screen.Name.CRYPTO_TRANSFER_COST_BASIS_DETAIL, null, null, null, 14, null);
                        CryptoTransferContext cryptoTransferContext = new CryptoTransferContext(null, null, null, 0.0d, null, null, null, null, null, Uuids.toStringOrEmpty(args.getDepositId()), null, null, null, null, 15871, null);
                        entryPointIdentifier = args.getEntryPointIdentifier();
                        if (entryPointIdentifier == null) {
                            entryPointIdentifier = "";
                        }
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -257, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1051715493, true, new C128501(snapshotState4CollectAsStateWithLifecycle, lifecycleAwareNavigator, modifier3), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        costBasisErrorDetailsCryptoCostBasisDetailsListComposable$lambda$3 = CryptoCostBasisDetailsListComposable$lambda$3(snapshotState);
                        if (costBasisErrorDetailsCryptoCostBasisDetailsListComposable$lambda$3 != null) {
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposable$lambda$7$lambda$6$lambda$5(snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            CostBasisErrorDialog.CostBasisErrorDialog(costBasisErrorDetailsCryptoCostBasisDetailsListComposable$lambda$3, (Function0) objRememberedValue3, null, composerStartRestartGroup, StringResource.$stable | 48, 4);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Unit unit = Unit.INSTANCE;
                        }
                        eventCryptoCostBasisDetailsListComposable$lambda$1 = CryptoCostBasisDetailsListComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventCryptoCostBasisDetailsListComposable$lambda$1 != null) {
                            if ((eventCryptoCostBasisDetailsListComposable$lambda$1.getData() instanceof CryptoCostBasisDetailsListEvent) && (eventConsumerInvoke = eventCryptoCostBasisDetailsListComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(eventCryptoCostBasisDetailsListComposable$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m12928invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m12928invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        CryptoCostBasisDetailsListEvent cryptoCostBasisDetailsListEvent = (CryptoCostBasisDetailsListEvent) eventCryptoCostBasisDetailsListComposable$lambda$1.getData();
                                        if (!(cryptoCostBasisDetailsListEvent instanceof CryptoCostBasisDetailsListEvent.Error)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        snapshotState.setValue(((CryptoCostBasisDetailsListEvent.Error) cryptoCostBasisDetailsListEvent).getResponse());
                                    }
                                });
                            }
                            Unit unit2 = Unit.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        cryptoCostBasisDetailsListDuxo4 = cryptoCostBasisDetailsListDuxo3;
                        modifier4 = modifier3;
                    } else {
                        i4 = i3;
                    }
                }
                cryptoCostBasisDetailsListDuxo3 = cryptoCostBasisDetailsListDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoCostBasisDetailsListDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow2 = cryptoCostBasisDetailsListDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoCostBasisDetailsListComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoCostBasisDetailsListEvent) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<CryptoCostBasisDetailsListEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CryptoCostBasisDetailsListEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                LifecycleAwareNavigator lifecycleAwareNavigator2 = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                Screen screen2 = new Screen(Screen.Name.CRYPTO_TRANSFER_COST_BASIS_DETAIL, null, null, null, 14, null);
                CryptoTransferContext cryptoTransferContext2 = new CryptoTransferContext(null, null, null, 0.0d, null, null, null, null, null, Uuids.toStringOrEmpty(args.getDepositId()), null, null, null, null, 15871, null);
                entryPointIdentifier = args.getEntryPointIdentifier();
                if (entryPointIdentifier == null) {
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen2, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContext2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -257, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1051715493, true, new C128501(snapshotState4CollectAsStateWithLifecycle3, lifecycleAwareNavigator2, modifier3), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                costBasisErrorDetailsCryptoCostBasisDetailsListComposable$lambda$3 = CryptoCostBasisDetailsListComposable$lambda$3(snapshotState2);
                if (costBasisErrorDetailsCryptoCostBasisDetailsListComposable$lambda$3 != null) {
                }
                eventCryptoCostBasisDetailsListComposable$lambda$1 = CryptoCostBasisDetailsListComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoCostBasisDetailsListComposable$lambda$1 != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoCostBasisDetailsListDuxo4 = cryptoCostBasisDetailsListDuxo3;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoCostBasisDetailsListDuxo4 = cryptoCostBasisDetailsListDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposable$lambda$9(args, modifier4, cryptoCostBasisDetailsListDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoCostBasisDetailsListComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$1 */
    static final class C128501 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ LifecycleAwareNavigator $composeNavigator;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SnapshotState4<CryptoCostBasisDetailsListViewState> $state$delegate;

        C128501(SnapshotState4<CryptoCostBasisDetailsListViewState> snapshotState4, LifecycleAwareNavigator lifecycleAwareNavigator, Modifier modifier) {
            this.$state$delegate = snapshotState4;
            this.$composeNavigator = lifecycleAwareNavigator;
            this.$modifier = modifier;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1051715493, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposable.<anonymous> (CryptoCostBasisDetailsListComposable.kt:112)");
            }
            CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewStateCryptoCostBasisDetailsListComposable$lambda$0 = CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposable$lambda$0(this.$state$delegate);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$state$delegate) | composer.changed(this.$composeNavigator);
            final SnapshotState4<CryptoCostBasisDetailsListViewState> snapshotState4 = this.$state$delegate;
            final LifecycleAwareNavigator lifecycleAwareNavigator = this.$composeNavigator;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoCostBasisDetailsListComposableKt.C128501.invoke$lambda$2$lambda$1(snapshotState4, lifecycleAwareNavigator);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposableContent(cryptoCostBasisDetailsListViewStateCryptoCostBasisDetailsListComposable$lambda$0, (Function0) objRememberedValue, this.$modifier, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(SnapshotState4 snapshotState4, LifecycleAwareNavigator lifecycleAwareNavigator) throws Resources.NotFoundException {
            CostBasisEntryArgs passthroughArgs = CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposable$lambda$0(snapshotState4).getPassthroughArgs();
            if (passthroughArgs != null) {
                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, CryptoCostBasisDetailsDestinations.INSTANCE, passthroughArgs, NavTransition.SLIDE_VERTICAL, null, false, null, 56, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCostBasisDetailsListComposable$lambda$7$lambda$6$lambda$5(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoCostBasisDetailsListComposableContent(final CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        EventLogger current;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-554893168);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoCostBasisDetailsListViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-554893168, i3, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent (CryptoCostBasisDetailsListComposable.kt:148)");
                }
                OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                final OnBackPressedDispatcher onBackPressedDispatcher = current2 == null ? current2.getOnBackPressedDispatcher() : null;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(cryptoCostBasisDetailsListViewState.isCompleted(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Modifier modifier4 = modifier2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions$default(modifier2, null, 1, null), ComposableLambda3.rememberComposableLambda(-2109068468, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposableContent.1
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
                            ComposerKt.traceEventStart(-2109068468, i5, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous> (CryptoCostBasisDetailsListComposable.kt:157)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$CryptoCostBasisDetailsListComposableKt.INSTANCE.getLambda$1726669375$feature_crypto_cost_basis_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-2022180245, true, new AnonymousClass1(onBackPressedDispatcher), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoCostBasisDetailsListComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ OnBackPressedDispatcher $onBack;

                        AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                            this.$onBack = onBackPressedDispatcher;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                            if (onBackPressedDispatcher != null) {
                                onBackPressedDispatcher.onBackPressed();
                            }
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2022180245, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:160)");
                            }
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$onBack);
                            final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoCostBasisDetailsListComposableKt.C128511.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(581894955, true, new C128522(current, userInteractionEventDescriptor, onBackPressedDispatcher, cryptoCostBasisDetailsListViewState, function02), composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-86420191, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposableContent.3

                    /* compiled from: CryptoCostBasisDetailsListComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ PaddingValues $contentPadding;
                        final /* synthetic */ CryptoCostBasisDetailsListViewState $state;

                        AnonymousClass1(PaddingValues paddingValues, CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState) {
                            this.$contentPadding = paddingValues;
                            this.$state = cryptoCostBasisDetailsListViewState;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-509577551, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:200)");
                            }
                            final android.content.Context context = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, this.$contentPadding), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                            composer.startReplaceGroup(-1746271574);
                            boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changedInstance(navigator) | composer.changedInstance(context);
                            final CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState = this.$state;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoCostBasisDetailsListComposableKt.C128533.AnonymousClass1.invoke$lambda$4$lambda$3(cryptoCostBasisDetailsListViewState, navigator, context, (LazyListScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            LazyDslKt.LazyColumn(modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3(final CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState, final Navigator navigator, final android.content.Context context, LazyListScope LazyColumn) {
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(982646534, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                    invoke(lazyItemScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope item, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(982646534, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:208)");
                                    }
                                    BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(cryptoCostBasisDetailsListViewState.getTitle(), composer, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), 3, null);
                            ComposableSingletons$CryptoCostBasisDetailsListComposableKt composableSingletons$CryptoCostBasisDetailsListComposableKt = ComposableSingletons$CryptoCostBasisDetailsListComposableKt.INSTANCE;
                            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$CryptoCostBasisDetailsListComposableKt.getLambda$213502909$feature_crypto_cost_basis_externalDebug(), 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(435414590, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                                    invoke(lazyItemScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(435414590, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:217)");
                                    }
                                    CharSequence text = StringResources6.getText(cryptoCostBasisDetailsListViewState.getSpannedSubtitle(), composer, StringResource.$stable);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                                    long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                                    final Navigator navigator2 = navigator;
                                    final android.content.Context context2 = context;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$1$1$2$1$1
                                            @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                            public final void onClick(LinkAnnotation link) {
                                                Intrinsics.checkNotNullParameter(link, "link");
                                                Navigators3.showHelpCenterWebViewFragment(navigator2, context2, ((LinkAnnotation.Url) link).getUrl());
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22063annotatedStringResourceV2eopBjH0(text, jM21425getFg0d7_KjU, jM21425getFg0d7_KjU2, (LinkInteractionListener) objRememberedValue, composer, 0, 0), null, null, null, null, null, null, 0, false, 0, 0, null, null, null, composer, 0, 0, 16382);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$CryptoCostBasisDetailsListComposableKt.getLambda$657326271$feature_crypto_cost_basis_externalDebug(), 3, null);
                            final BreakdownCardState breakdownCardState = cryptoCostBasisDetailsListViewState.getBreakdownCardState();
                            if (breakdownCardState != null) {
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1609736619, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$1$1$3$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                        invoke(lazyItemScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1609736619, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:236)");
                                        }
                                        CryptoCostBasisDetailsListComposableKt.BreakdownCard(breakdownCardState, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 3, null);
                            }
                            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$CryptoCostBasisDetailsListComposableKt.getLambda$879237952$feature_crypto_cost_basis_externalDebug(), 3, null);
                            final ImmutableList<CostBasisLotRowData> lots = cryptoCostBasisDetailsListViewState.getLots();
                            final Function1 function1 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoCostBasisDetailsListComposableKt.C128533.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$1((CostBasisLotRowData) obj);
                                }
                            };
                            final C12845x9d27010 c12845x9d27010 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$invoke$lambda$4$lambda$3$$inlined$items$default$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Void invoke(CostBasisLotRowData costBasisLotRowData) {
                                    return null;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke((CostBasisLotRowData) obj);
                                }
                            };
                            LazyColumn.items(lots.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$invoke$lambda$4$lambda$3$$inlined$items$default$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                public final Object invoke(int i) {
                                    return function1.invoke(lots.get(i));
                                }
                            }, new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$invoke$lambda$4$lambda$3$$inlined$items$default$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                public final Object invoke(int i) {
                                    return c12845x9d27010.invoke(lots.get(i));
                                }
                            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$invoke$lambda$4$lambda$3$$inlined$items$default$4
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
                                    CostBasisLotRowData costBasisLotRowData = (CostBasisLotRowData) lots.get(i);
                                    composer.startReplaceGroup(506811467);
                                    CryptoCostBasisDetailsListComposableKt.CostBasisLotRow(costBasisLotRowData, null, composer, 0, 2);
                                    composer.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Object invoke$lambda$4$lambda$3$lambda$1(CostBasisLotRowData it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getId();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues contentPadding, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i5 & 6) == 0) {
                            i5 |= composer2.changed(contentPadding) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-86420191, i5, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous> (CryptoCostBasisDetailsListComposable.kt:199)");
                        }
                        LocalShowPlaceholder.Loadable(cryptoCostBasisDetailsListViewState.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(-509577551, true, new AnonymousClass1(contentPadding, cryptoCostBasisDetailsListViewState), composer2, 54), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306800, 504);
                composerStartRestartGroup = composerStartRestartGroup;
                Boolean boolIsCompleted = cryptoCostBasisDetailsListViewState.isCompleted();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoCostBasisDetailsListViewState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    C12858xf6519a7b c12858xf6519a7b = new C12858xf6519a7b(cryptoCostBasisDetailsListViewState, current, userInteractionEventDescriptor, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(c12858xf6519a7b);
                    objRememberedValue2 = c12858xf6519a7b;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolIsCompleted, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposableContent$lambda$14(cryptoCostBasisDetailsListViewState, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            OnBackPressedDispatcherOwner current22 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            if (current22 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifier42 = modifier2;
            ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions$default(modifier2, null, 1, null), ComposableLambda3.rememberComposableLambda(-2109068468, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposableContent.1
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
                        ComposerKt.traceEventStart(-2109068468, i5, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous> (CryptoCostBasisDetailsListComposable.kt:157)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$CryptoCostBasisDetailsListComposableKt.INSTANCE.getLambda$1726669375$feature_crypto_cost_basis_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-2022180245, true, new AnonymousClass1(onBackPressedDispatcher), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CryptoCostBasisDetailsListComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ OnBackPressedDispatcher $onBack;

                    AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                        this.$onBack = onBackPressedDispatcher;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.onBackPressed();
                        }
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2022180245, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:160)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.$onBack);
                        final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoCostBasisDetailsListComposableKt.C128511.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(581894955, true, new C128522(current, userInteractionEventDescriptor, onBackPressedDispatcher, cryptoCostBasisDetailsListViewState, function02), composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-86420191, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposableContent.3

                /* compiled from: CryptoCostBasisDetailsListComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ PaddingValues $contentPadding;
                    final /* synthetic */ CryptoCostBasisDetailsListViewState $state;

                    AnonymousClass1(PaddingValues paddingValues, CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState) {
                        this.$contentPadding = paddingValues;
                        this.$state = cryptoCostBasisDetailsListViewState;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-509577551, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:200)");
                        }
                        final android.content.Context context = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, this.$contentPadding), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changedInstance(navigator) | composer.changedInstance(context);
                        final CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState = this.$state;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoCostBasisDetailsListComposableKt.C128533.AnonymousClass1.invoke$lambda$4$lambda$3(cryptoCostBasisDetailsListViewState, navigator, context, (LazyListScope) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3(final CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState, final Navigator navigator, final android.content.Context context, LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(982646534, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                invoke(lazyItemScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(982646534, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:208)");
                                }
                                BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(cryptoCostBasisDetailsListViewState.getTitle(), composer, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 3, null);
                        ComposableSingletons$CryptoCostBasisDetailsListComposableKt composableSingletons$CryptoCostBasisDetailsListComposableKt = ComposableSingletons$CryptoCostBasisDetailsListComposableKt.INSTANCE;
                        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$CryptoCostBasisDetailsListComposableKt.getLambda$213502909$feature_crypto_cost_basis_externalDebug(), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(435414590, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$1$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                                invoke(lazyItemScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(435414590, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:217)");
                                }
                                CharSequence text = StringResources6.getText(cryptoCostBasisDetailsListViewState.getSpannedSubtitle(), composer, StringResource.$stable);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                                final Navigator navigator2 = navigator;
                                final android.content.Context context2 = context;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$1$1$2$1$1
                                        @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                        public final void onClick(LinkAnnotation link) {
                                            Intrinsics.checkNotNullParameter(link, "link");
                                            Navigators3.showHelpCenterWebViewFragment(navigator2, context2, ((LinkAnnotation.Url) link).getUrl());
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22063annotatedStringResourceV2eopBjH0(text, jM21425getFg0d7_KjU, jM21425getFg0d7_KjU2, (LinkInteractionListener) objRememberedValue, composer, 0, 0), null, null, null, null, null, null, 0, false, 0, 0, null, null, null, composer, 0, 0, 16382);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$CryptoCostBasisDetailsListComposableKt.getLambda$657326271$feature_crypto_cost_basis_externalDebug(), 3, null);
                        final BreakdownCardState breakdownCardState = cryptoCostBasisDetailsListViewState.getBreakdownCardState();
                        if (breakdownCardState != null) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1609736619, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$1$1$3$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                    invoke(lazyItemScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope item, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1609736619, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:236)");
                                    }
                                    CryptoCostBasisDetailsListComposableKt.BreakdownCard(breakdownCardState, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), 3, null);
                        }
                        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$CryptoCostBasisDetailsListComposableKt.getLambda$879237952$feature_crypto_cost_basis_externalDebug(), 3, null);
                        final List lots = cryptoCostBasisDetailsListViewState.getLots();
                        final Function1 function1 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoCostBasisDetailsListComposableKt.C128533.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$1((CostBasisLotRowData) obj);
                            }
                        };
                        final Function1 c12845x9d27010 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$invoke$lambda$4$lambda$3$$inlined$items$default$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Void invoke(CostBasisLotRowData costBasisLotRowData) {
                                return null;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke((CostBasisLotRowData) obj);
                            }
                        };
                        LazyColumn.items(lots.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$invoke$lambda$4$lambda$3$$inlined$items$default$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            public final Object invoke(int i) {
                                return function1.invoke(lots.get(i));
                            }
                        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$invoke$lambda$4$lambda$3$$inlined$items$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            public final Object invoke(int i) {
                                return c12845x9d27010.invoke(lots.get(i));
                            }
                        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$3$1$invoke$lambda$4$lambda$3$$inlined$items$default$4
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
                                CostBasisLotRowData costBasisLotRowData = (CostBasisLotRowData) lots.get(i);
                                composer.startReplaceGroup(506811467);
                                CryptoCostBasisDetailsListComposableKt.CostBasisLotRow(costBasisLotRowData, null, composer, 0, 2);
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Object invoke$lambda$4$lambda$3$lambda$1(CostBasisLotRowData it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.getId();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues contentPadding, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                    if ((i5 & 6) == 0) {
                        i5 |= composer2.changed(contentPadding) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-86420191, i5, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous> (CryptoCostBasisDetailsListComposable.kt:199)");
                    }
                    LocalShowPlaceholder.Loadable(cryptoCostBasisDetailsListViewState.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(-509577551, true, new AnonymousClass1(contentPadding, cryptoCostBasisDetailsListViewState), composer2, 54), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306800, 504);
            composerStartRestartGroup = composerStartRestartGroup;
            Boolean boolIsCompleted2 = cryptoCostBasisDetailsListViewState.isCompleted();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = composerStartRestartGroup.changedInstance(cryptoCostBasisDetailsListViewState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                C12858xf6519a7b c12858xf6519a7b2 = new C12858xf6519a7b(cryptoCostBasisDetailsListViewState, current, userInteractionEventDescriptor, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(c12858xf6519a7b2);
                objRememberedValue2 = c12858xf6519a7b2;
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolIsCompleted2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoCostBasisDetailsListComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$2 */
    static final class C128522 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UserInteractionEventDescriptor $descriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ OnBackPressedDispatcher $onBack;
        final /* synthetic */ Function0<Unit> $onClickAddEntry;
        final /* synthetic */ CryptoCostBasisDetailsListViewState $state;

        C128522(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, OnBackPressedDispatcher onBackPressedDispatcher, CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState, Function0<Unit> function0) {
            this.$eventLogger = eventLogger;
            this.$descriptor = userInteractionEventDescriptor;
            this.$onBack = onBackPressedDispatcher;
            this.$state = cryptoCostBasisDetailsListViewState;
            this.$onClickAddEntry = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, OnBackPressedDispatcher onBackPressedDispatcher) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(CostBasisLoggingUtils.updateComponent(userInteractionEventDescriptor, Component.ComponentType.BUTTON, "done"), UserInteractionEventData.EventType.TAP), false, false, 6, null);
            if (onBackPressedDispatcher != null) {
                onBackPressedDispatcher.onBackPressed();
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoCostBasisDetailsListComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$2$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ UserInteractionEventDescriptor $descriptor;
            final /* synthetic */ EventLogger $eventLogger;
            final /* synthetic */ Function0<Unit> $onClickAddEntry;
            final /* synthetic */ Function0<Unit> $onDoneClick;
            final /* synthetic */ CryptoCostBasisDetailsListViewState $state;

            AnonymousClass1(CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0<Unit> function0, Function0<Unit> function02) {
                this.$state = cryptoCostBasisDetailsListViewState;
                this.$eventLogger = eventLogger;
                this.$descriptor = userInteractionEventDescriptor;
                this.$onClickAddEntry = function0;
                this.$onDoneClick = function02;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(CostBasisLoggingUtils.updateComponent(userInteractionEventDescriptor, Component.ComponentType.BUTTON, "add_cost_basis"), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                function0.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2061461605, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:174)");
                }
                if (Intrinsics.areEqual(this.$state.isCompleted(), Boolean.FALSE)) {
                    composer.startReplaceGroup(734767056);
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                    String strStringResource = StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_list_add_entry_cta, composer, 0);
                    String strStringResource2 = StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_list_done_cta, composer, 0);
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$descriptor) | composer.changed(this.$onClickAddEntry);
                    final EventLogger eventLogger = this.$eventLogger;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
                    final Function0<Unit> function0 = this.$onClickAddEntry;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoCostBasisDetailsListComposableKt.C128522.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, function0);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, false, null, false, this.$onDoneClick, strStringResource2, false, null, false, composer, 0, 0, 59198);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(735604397);
                    BentoButtonBar2.BentoButtonBar(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, null, this.$onDoneClick, StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_list_done_cta, composer, 0), false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(581894955, i, -1, "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableContent.<anonymous> (CryptoCostBasisDetailsListComposable.kt:165)");
            }
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$descriptor) | composer.changedInstance(this.$onBack);
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
            final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoCostBasisDetailsListComposableKt.C128522.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, onBackPressedDispatcher);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            LocalShowPlaceholder.Loadable(this.$state.isLoading() && this.$state.isCompleted() == null, null, null, ComposableLambda3.rememberComposableLambda(-2061461605, true, new AnonymousClass1(this.$state, this.$eventLogger, this.$descriptor, this.$onClickAddEntry, function0), composer, 54), composer, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BreakdownCard(final BreakdownCardState breakdownCardState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        BentoTheme bentoTheme;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        AnnotatedString.Builder builder;
        int iPushStyle;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final CostBasisBottomSheetDto costBasisBottomSheetDtoBreakdownCard$lambda$16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-880375879);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(breakdownCardState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-880375879, i3, -1, "com.robinhood.android.crypto.costbasis.details.list.BreakdownCard (CryptoCostBasisDetailsListComposable.kt:273)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Background3.m4871backgroundbw27NRU(modifier3, bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                AnnotatedString annotatedString = new AnnotatedString(StringResources6.getTextAsString(breakdownCardState.getDepositDateLabel(), composerStartRestartGroup, StringResource.$stable), null, 2, null);
                builder = new AnnotatedString.Builder(0, 1, null);
                iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                try {
                    builder.append(breakdownCardState.getTotalQuantity());
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, null, null, builder.toAnnotatedString(), null, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextL(), null, null, false, false, 3933, null);
                    int i6 = BentoDataRowState.$stable;
                    BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composerStartRestartGroup, i6, 6);
                    BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_list_eligible_qty_label, composerStartRestartGroup, 0), null, 2, null), null, breakdownCardState.getAvailableQuantityBottomSheet() == null ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16) : null, null, new AnnotatedString(breakdownCardState.getAvailableQuantity(), null, 2, null), null, null, null, null, false, false, 4053, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(breakdownCardState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoCostBasisDetailsListComposableKt.BreakdownCard$lambda$24$lambda$21$lambda$20(breakdownCardState, snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoDataRowKt.BentoDataRow(bentoDataRowState2, null, (Function0) objRememberedValue2, composerStartRestartGroup, i6, 2);
                    costBasisBottomSheetDtoBreakdownCard$lambda$16 = BreakdownCard$lambda$16(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(-1335170750);
                    if (costBasisBottomSheetDtoBreakdownCard$lambda$16 != null) {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoCostBasisDetailsListComposableKt.BreakdownCard$lambda$24$lambda$23$lambda$22(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue3, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2), null, 0L, ComposableLambda3.rememberComposableLambda(-1730528029, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$BreakdownCard$1$4
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                                invoke(rhModalBottomSheet5, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1730528029, i7, -1, "com.robinhood.android.crypto.costbasis.details.list.BreakdownCard.<anonymous>.<anonymous> (CryptoCostBasisDetailsListComposable.kt:316)");
                                }
                                CryptoCostBasisDetailsListComposableKt.AvailableQuantityBottomSheet(RhModalBottomSheet, costBasisBottomSheetDtoBreakdownCard$lambda$16, breakdownCardState.getClosedQuantity(), composer2, (i7 & 14) | RhModalBottomSheet5.$stable);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 54);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoCostBasisDetailsListComposableKt.BreakdownCard$lambda$25(breakdownCardState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            bentoTheme = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Background3.m4871backgroundbw27NRU(modifier3, bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
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
                AnnotatedString annotatedString2 = new AnnotatedString(StringResources6.getTextAsString(breakdownCardState.getDepositDateLabel(), composerStartRestartGroup, StringResource.$stable), null, 2, null);
                builder = new AnnotatedString.Builder(0, 1, null);
                iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                builder.append(breakdownCardState.getTotalQuantity());
                Unit unit2 = Unit.INSTANCE;
                builder.pop(iPushStyle);
                BentoDataRowState bentoDataRowState3 = new BentoDataRowState(null, annotatedString2, null, null, null, builder.toAnnotatedString(), null, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextL(), null, null, false, false, 3933, null);
                int i62 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState3, null, null, composerStartRestartGroup, i62, 6);
                BentoDataRowState bentoDataRowState22 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_list_eligible_qty_label, composerStartRestartGroup, 0), null, 2, null), null, breakdownCardState.getAvailableQuantityBottomSheet() == null ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16) : null, null, new AnnotatedString(breakdownCardState.getAvailableQuantity(), null, 2, null), null, null, null, null, false, false, 4053, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(breakdownCardState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoCostBasisDetailsListComposableKt.BreakdownCard$lambda$24$lambda$21$lambda$20(breakdownCardState, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoDataRowKt.BentoDataRow(bentoDataRowState22, null, (Function0) objRememberedValue2, composerStartRestartGroup, i62, 2);
                    costBasisBottomSheetDtoBreakdownCard$lambda$16 = BreakdownCard$lambda$16(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(-1335170750);
                    if (costBasisBottomSheetDtoBreakdownCard$lambda$16 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
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
    public static final Unit BreakdownCard$lambda$24$lambda$21$lambda$20(BreakdownCardState breakdownCardState, SnapshotState snapshotState) {
        snapshotState.setValue(breakdownCardState.getAvailableQuantityBottomSheet());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BreakdownCard$lambda$24$lambda$23$lambda$22(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AvailableQuantityBottomSheet(final RhModalBottomSheet5 rhModalBottomSheet5, final CostBasisBottomSheetDto costBasisBottomSheetDto, final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2115630431);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(costBasisBottomSheetDto) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2115630431, i2, -1, "com.robinhood.android.crypto.costbasis.details.list.AvailableQuantityBottomSheet (CryptoCostBasisDetailsListComposable.kt:329)");
            }
            String title = costBasisBottomSheetDto.getTitle();
            boolean z = false;
            String strStringResource = StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_list_available_qty_sheet_dismiss_cta, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5))) {
                z = true;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoCostBasisDetailsListComposableKt.AvailableQuantityBottomSheet$lambda$27$lambda$26(rhModalBottomSheet5);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlerts2.AlertContent(null, null, title, null, CollectionsKt.listOf(new BentoAlertButton(strStringResource, (Function0) objRememberedValue)), false, ComposableLambda3.rememberComposableLambda(554314991, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt.AvailableQuantityBottomSheet.2
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(554314991, i3, -1, "com.robinhood.android.crypto.costbasis.details.list.AvailableQuantityBottomSheet.<anonymous> (CryptoCostBasisDetailsListComposable.kt:333)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    CostBasisBottomSheetDto costBasisBottomSheetDto2 = costBasisBottomSheetDto;
                    String str2 = str;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoAlerts2.m20854AlertBodyText5stqomU(costBasisBottomSheetDto2.getBody_markdown(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), composer2, 0, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    composer2.startReplaceGroup(824936898);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    composer2.startReplaceGroup(824938573);
                    int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_list_available_qty_sheet_row_label, composer2, 0));
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        composer2.endReplaceGroup();
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composer2.endReplaceGroup();
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierM5146paddingqDBjuR0$default, new BentoBaseRowState(null, new BentoBaseRowState.Text.Annotated(annotatedString, null, 2, null), null, new BentoBaseRowState.Meta.SingleLine(str2), null, false, false, 117, null), false, false, true, 0L, null, composer2, (BentoBaseRowState.$stable << 3) | 24960, 104);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (BentoAlertButton.$stable << 12) | 1572864, 43);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoCostBasisDetailsListComposableKt.AvailableQuantityBottomSheet$lambda$28(rhModalBottomSheet5, costBasisBottomSheetDto, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvailableQuantityBottomSheet$lambda$27$lambda$26(RhModalBottomSheet5 rhModalBottomSheet5) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CostBasisLotRow(final CostBasisLotRowData costBasisLotRowData, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(878092630);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(costBasisLotRowData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(878092630, i3, -1, "com.robinhood.android.crypto.costbasis.details.list.CostBasisLotRow (CryptoCostBasisDetailsListComposable.kt:372)");
                }
                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, costBasisLotRowData.getAmount(), costBasisLotRowData.getAmountInFiat(), (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(costBasisLotRowData.getDate()), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (DefaultConstructorMarker) null);
                int i5 = ((i3 >> 3) & 14) | 24576 | (BentoBaseRowState.$stable << 3);
                modifier3 = modifier4;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifier3, bentoBaseRowState, false, false, true, 0L, null, composerStartRestartGroup, i5, 108);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoCostBasisDetailsListComposableKt.CostBasisLotRow$lambda$29(costBasisLotRowData, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoBaseRowState bentoBaseRowState2 = new BentoBaseRowState((BentoBaseRowState.Start) null, costBasisLotRowData.getAmount(), costBasisLotRowData.getAmountInFiat(), (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(costBasisLotRowData.getDate()), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (DefaultConstructorMarker) null);
            int i52 = ((i3 >> 3) & 14) | 24576 | (BentoBaseRowState.$stable << 3);
            modifier3 = modifier4;
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifier3, bentoBaseRowState2, false, false, true, 0L, null, composerStartRestartGroup, i52, 108);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @DayNightPreview
    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(877544393);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(877544393, i, -1, "com.robinhood.android.crypto.costbasis.details.list.Preview (CryptoCostBasisDetailsListComposable.kt:403)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), ComposableSingletons$CryptoCostBasisDetailsListComposableKt.INSTANCE.m12924getLambda$770734327$feature_crypto_cost_basis_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoCostBasisDetailsListComposableKt.Preview$lambda$30(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
