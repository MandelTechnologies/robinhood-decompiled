package com.robinhood.android.optionschain.bottomsheet;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionEditLegRatioFragmentKey;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.info.OptionsSimulatedReturnInfoFooterComposable;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.SelectedLegItem;
import com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo;
import com.robinhood.android.optionschain.sbschain.table.BidAskCellDisableType;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainBottomSheetComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001aÃ\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00182,\b\u0002\u0010\u0019\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aj\u0004\u0018\u0001`\u001d2\u001c\b\u0002\u0010\u001e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u001c\b\u0002\u0010!\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u001c\b\u0002\u0010\"\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u001c\b\u0002\u0010#\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0007¢\u0006\u0004\b&\u0010'\u001a§\u0001\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00182,\b\u0002\u0010\u0019\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aj\u0004\u0018\u0001`\u001dH\u0003¢\u0006\u0002\u00101\u001a\u0017\u00102\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u00103\u001a9\u00104\u001a\u00020\u0001*\u0002052\u000e\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u001f2\u0006\u00108\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u00109¨\u0006:²\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010>\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020 X\u008a\u008e\u0002²\u0006\f\u0010B\u001a\u0004\u0018\u00010CX\u008a\u008e\u0002"}, m3636d2 = {"OptionChainBottomSheetComponent", "", "accountNumber", "", "optionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "defaultPricingState", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "expandState", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetExpandState;", "isBottomSheetHiddenOrNull", "", "onLaunchOrderForm", "Lkotlin/Function1;", "Landroid/content/Intent;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDuxo;", "onHeaderTapped", "Lkotlin/Function0;", "onWatchlistButtonTapped", "Lkotlin/Function3;", "Lcom/robinhood/models/ui/OptionLegBundle;", "Lcom/robinhood/android/optionschain/sbschain/table/BidAskCellDisableType;", "Lcom/robinhood/android/optionschain/sbschain/OnChainTableButtonTapped;", "onSectionHeightsChanged", "Lkotlinx/collections/immutable/ImmutableList;", "", "onErrorSectionHeightsChanged", "onNoQuoteSectionHeightChanged", "onChartErrorSectionHeightChanged", "onStateChanged", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetState;", "OptionChainBottomSheetComponent-7uKoTdw", "(Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;Lcom/robinhood/android/common/options/OptionDefaultPricingState;Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetExpandState;ZLkotlin/jvm/functions/Function1;Lcom/robinhood/rosetta/eventlogging/Screen$Name;JLandroidx/compose/ui/Modifier;Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDuxo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "OptionChainBottomSheetHeader", "addedToWatchlist", "isFullyExpanded", "showTooManyLegsError", "showWatchlistButton", "strategyTitle", "Lcom/robinhood/utils/resource/StringResource;", "strategySubtitle", "singleLegBundle", "(ZZZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/ui/OptionLegBundle;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "OptionChainBottomErrorSection", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OptionChainBottomSheetContractSection", "Landroidx/compose/foundation/layout/ColumnScope;", "legItems", "Lcom/robinhood/android/optionschain/SelectedLegItem;", "showEditRatio", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlinx/collections/immutable/ImmutableList;ZZLcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;Landroidx/compose/runtime/Composer;I)V", "feature-options-chain_externalDebug", "viewState", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetViewState;", "headerHeight", "pnlHeight", "errorHeight", "noQuoteHeight", "chartErrorHeight", "chartErrorState", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainBottomSheetComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainBottomErrorSection$lambda$51(Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionChainBottomErrorSection(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainBottomSheetComponent_7uKoTdw$lambda$42(String str, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, OptionDefaultPricingState optionDefaultPricingState, OptionChainBottomSheetExpandState optionChainBottomSheetExpandState, boolean z, Function1 function1, Screen.Name name, long j, Modifier modifier, OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Function0 function0, Function3 function3, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i, int i2, int i3, Composer composer, int i4) {
        m17154OptionChainBottomSheetComponent7uKoTdw(str, fromOptionOrderBundle, optionDefaultPricingState, optionChainBottomSheetExpandState, z, function1, name, j, modifier, optionChainBottomSheetDuxo, function0, function3, function12, function13, function14, function15, function16, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainBottomSheetContractSection$lambda$58(Column5 column5, ImmutableList immutableList, boolean z, boolean z2, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, int i, Composer composer, int i2) {
        OptionChainBottomSheetContractSection(column5, immutableList, z, z2, fromOptionOrderBundle, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainBottomSheetHeader$lambda$50(boolean z, boolean z2, boolean z3, boolean z4, StringResource stringResource, StringResource stringResource2, OptionLegBundle optionLegBundle, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, Function1 function1, Function0 function0, Function3 function3, int i, int i2, int i3, Composer composer, int i4) throws Resources.NotFoundException {
        OptionChainBottomSheetHeader(z, z2, z3, z4, stringResource, stringResource2, optionLegBundle, fromOptionOrderBundle, function1, function0, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    private static final OptionChainBottomSheetViewState OptionChainBottomSheetComponent_7uKoTdw$lambda$0(SnapshotState4<OptionChainBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final OptionsSimulatedReturnErrorState OptionChainBottomSheetComponent_7uKoTdw$lambda$18(SnapshotState<OptionsSimulatedReturnErrorState> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0d2c  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:489:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123  */
    /* renamed from: OptionChainBottomSheetComponent-7uKoTdw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17154OptionChainBottomSheetComponent7uKoTdw(final String accountNumber, OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey, final OptionDefaultPricingState optionDefaultPricingState, final OptionChainBottomSheetExpandState optionChainBottomSheetExpandState, final boolean z, Function1<? super Intent, Unit> onLaunchOrderForm, final Screen.Name screenName, final long j, Modifier modifier, OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Function0<Unit> function0, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, Function1<? super ImmutableList<Integer>, Unit> function1, Function1<? super ImmutableList<Integer>, Unit> function12, Function1<? super ImmutableList<Integer>, Unit> function13, Function1<? super ImmutableList<Integer>, Unit> function14, Function1<? super OptionChainBottomSheetState, Unit> function15, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        OptionChainBottomSheetDuxo optionChainBottomSheetDuxo2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function32;
        OptionChainBottomSheetDuxo optionChainBottomSheetDuxo3;
        Function1<? super ImmutableList<Integer>, Unit> function16;
        Function1<? super ImmutableList<Integer>, Unit> function17;
        Function1<? super OptionChainBottomSheetState, Unit> function18;
        int i18;
        Function1<? super ImmutableList<Integer>, Unit> function19;
        Function1<? super ImmutableList<Integer>, Unit> function110;
        Function0<Unit> function02;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        int i19;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Modifier modifier4;
        int i20;
        boolean z2;
        boolean zChangedInstance;
        boolean z3;
        boolean zChangedInstance2;
        Object objRememberedValue7;
        boolean zChanged;
        Object objRememberedValue8;
        boolean zChanged2;
        Object objRememberedValue9;
        boolean zChanged3;
        Object objRememberedValue10;
        boolean zChanged4;
        Object objRememberedValue11;
        Function1<? super ImmutableList<Integer>, Unit> function111;
        boolean zChanged5;
        Object objRememberedValue12;
        Function1<? super OptionChainBottomSheetState, Unit> function112;
        Object obj;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue13;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Function1<? super Intent, Unit> function113;
        SnapshotState4 snapshotState4;
        final SnapshotState snapshotState;
        Modifier.Companion companion2;
        BentoTheme bentoTheme;
        int i21;
        int i22;
        OptionChainBottomSheetDuxo optionChainBottomSheetDuxo4;
        OptionChainBottomSheetExpandState optionChainBottomSheetExpandState2;
        final OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle;
        String string2;
        final OptionChainBottomSheetDuxo optionChainBottomSheetDuxo5;
        final Function0<Unit> function03;
        Composer composer2;
        final Function1<? super ImmutableList<Integer>, Unit> function114;
        final Function1<? super ImmutableList<Integer>, Unit> function115;
        final Function1<? super ImmutableList<Integer>, Unit> function116;
        final Function1<? super ImmutableList<Integer>, Unit> function117;
        final Modifier modifier5;
        final Function1<? super OptionChainBottomSheetState, Unit> function118;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(optionOrderIntentKey, "optionOrderIntentKey");
        Intrinsics.checkNotNullParameter(onLaunchOrderForm, "onLaunchOrderForm");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Composer composerStartRestartGroup = composer.startRestartGroup(590975961);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(optionOrderIntentKey) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(optionDefaultPricingState == null ? -1 : optionDefaultPricingState.ordinal()) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(optionChainBottomSheetExpandState != null ? optionChainBottomSheetExpandState.ordinal() : -1) ? 2048 : 1024;
        }
        if ((i3 & 16) == 0) {
            if ((i & 24576) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onLaunchOrderForm) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(screenName.ordinal()) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changed(j) ? 8388608 : 4194304;
            }
            i5 = i3 & 256;
            if (i5 == 0) {
                i4 |= 100663296;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                }
            }
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    optionChainBottomSheetDuxo2 = optionChainBottomSheetDuxo;
                    int i23 = composerStartRestartGroup.changedInstance(optionChainBottomSheetDuxo2) ? 536870912 : 268435456;
                    i4 |= i23;
                } else {
                    optionChainBottomSheetDuxo2 = optionChainBottomSheetDuxo;
                }
                i4 |= i23;
            } else {
                optionChainBottomSheetDuxo2 = optionChainBottomSheetDuxo;
            }
            i6 = i3 & 1024;
            if (i6 == 0) {
                i7 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i7 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
            } else {
                i7 = i2;
            }
            i8 = i3 & 2048;
            if (i8 == 0) {
                i7 |= 48;
                i9 = i8;
            } else if ((i2 & 48) == 0) {
                i9 = i8;
                i7 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
            } else {
                i9 = i8;
            }
            int i24 = i7;
            i10 = i3 & 4096;
            if (i10 == 0) {
                i11 = i24 | 384;
            } else if ((i2 & 384) == 0) {
                i11 = i24 | (composerStartRestartGroup.changedInstance(function1) ? 256 : 128);
            } else {
                i11 = i24;
            }
            i12 = i3 & 8192;
            if (i12 == 0) {
                i13 = i11 | 3072;
            } else {
                int i25 = i11;
                if ((i2 & 3072) == 0) {
                    i25 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                i13 = i25;
            }
            i14 = i3 & 16384;
            if (i14 == 0) {
                i15 = i13 | 24576;
            } else {
                int i26 = i13;
                if ((i2 & 24576) == 0) {
                    i15 = i26 | (composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192);
                } else {
                    i15 = i26;
                }
            }
            i16 = i3 & 32768;
            if (i16 == 0) {
                i15 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i15 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
            }
            i17 = i3 & 65536;
            if (i17 == 0) {
                i15 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i15 |= composerStartRestartGroup.changedInstance(function15) ? 1048576 : 524288;
            }
            int i27 = i15;
            if ((i4 & 306783379) != 306783378 && (599187 & i27) == 599186 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                function113 = onLaunchOrderForm;
                function03 = function0;
                function116 = function13;
                function117 = function14;
                function118 = function15;
                fromOptionOrderBundle = optionOrderIntentKey;
                composer2 = composerStartRestartGroup;
                modifier5 = modifier2;
                optionChainBottomSheetDuxo5 = optionChainBottomSheetDuxo2;
                function33 = function3;
                function114 = function1;
                function115 = function12;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier6 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 512) == 0) {
                        String str = "bottom-sheet-" + accountNumber;
                        OptionChainBottomSheetDuxo.InitArgs initArgs = new OptionChainBottomSheetDuxo.InitArgs(accountNumber, screenName);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionChainBottomSheetDuxo.class), current, str, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue14 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$OptionChainBottomSheetComponent-7uKoTdw$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$OptionChainBottomSheetComponent-7uKoTdw$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue14, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 &= -1879048193;
                        optionChainBottomSheetDuxo2 = (OptionChainBottomSheetDuxo) baseDuxo;
                    }
                    Function0<Unit> function04 = i6 == 0 ? null : function0;
                    Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function34 = i9 == 0 ? null : function3;
                    Function1<? super ImmutableList<Integer>, Unit> function119 = i10 == 0 ? null : function1;
                    Function1<? super ImmutableList<Integer>, Unit> function120 = i12 == 0 ? null : function12;
                    Function1<? super ImmutableList<Integer>, Unit> function121 = i14 == 0 ? null : function13;
                    Function1<? super ImmutableList<Integer>, Unit> function122 = i16 == 0 ? null : function14;
                    Function1<? super ImmutableList<Integer>, Unit> function123 = function120;
                    function32 = function34;
                    optionChainBottomSheetDuxo3 = optionChainBottomSheetDuxo2;
                    function16 = function121;
                    function17 = function123;
                    if (i17 == 0) {
                        i18 = i4;
                        function19 = function119;
                        function110 = function122;
                        function18 = null;
                    } else {
                        function18 = function15;
                        i18 = i4;
                        function19 = function119;
                        function110 = function122;
                    }
                    function02 = function04;
                    modifier3 = modifier6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                    }
                    function02 = function0;
                    function32 = function3;
                    function110 = function14;
                    function18 = function15;
                    i18 = i4;
                    modifier3 = modifier2;
                    optionChainBottomSheetDuxo3 = optionChainBottomSheetDuxo2;
                    function19 = function1;
                    function17 = function12;
                    function16 = function13;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(590975961, i18, i27, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponent (OptionChainBottomSheetComponent.kt:106)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(optionChainBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    i19 = 0;
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i19 = 0;
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(i19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotIntState3.mutableIntStateOf(i19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final SnapshotIntState2 snapshotIntState23 = (SnapshotIntState2) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotIntState3.mutableIntStateOf(i19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                final SnapshotIntState2 snapshotIntState24 = (SnapshotIntState2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotIntState3.mutableIntStateOf(i19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                final SnapshotIntState2 snapshotIntState25 = (SnapshotIntState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(992276530);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i28 = BentoTheme.$stable;
                int iMo5016toPx0680j_4 = (int) density.mo5016toPx0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i28).m21593getSmallD9Ej5fM());
                composerStartRestartGroup.endReplaceGroup();
                ImmutableList3 immutableList3PersistentListOf = (snapshotIntState2.getIntValue() != 0 || snapshotIntState22.getIntValue() == 0) ? extensions2.persistentListOf() : extensions2.persistentListOf(Integer.valueOf(snapshotIntState2.getIntValue() + iMo5016toPx0680j_4), Integer.valueOf(snapshotIntState2.getIntValue() + snapshotIntState22.getIntValue()));
                ImmutableList3 immutableList3PersistentListOf2 = (snapshotIntState2.getIntValue() != 0 || snapshotIntState23.getIntValue() == 0) ? extensions2.persistentListOf() : extensions2.persistentListOf(Integer.valueOf(snapshotIntState2.getIntValue() + snapshotIntState23.getIntValue()));
                ImmutableList3 immutableList3PersistentListOf3 = (snapshotIntState2.getIntValue() != 0 || snapshotIntState24.getIntValue() == 0) ? extensions2.persistentListOf() : extensions2.persistentListOf(Integer.valueOf(snapshotIntState2.getIntValue() + snapshotIntState24.getIntValue()));
                Function0<Unit> function05 = function02;
                Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function35 = function32;
                ImmutableList3 immutableList3PersistentListOf4 = (snapshotIntState2.getIntValue() != 0 || snapshotIntState25.getIntValue() == 0) ? extensions2.persistentListOf() : extensions2.persistentListOf(Integer.valueOf(snapshotIntState2.getIntValue() + snapshotIntState25.getIntValue()));
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 != companion.getEmpty()) {
                    modifier4 = modifier3;
                    SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                    objRememberedValue6 = snapshotStateMutableStateOf$default;
                } else {
                    modifier4 = modifier3;
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                OptionChainBottomSheetState optionChainBottomSheetState = !OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowTooManyLegsError() ? OptionChainBottomSheetState.ERROR : OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getNoQuoteFallbackContent() != null ? OptionChainBottomSheetState.NO_QUOTE : OptionChainBottomSheetComponent_7uKoTdw$lambda$18(snapshotState2) != null ? OptionChainBottomSheetState.CHART_ERROR : OptionChainBottomSheetState.READY;
                if (optionChainBottomSheetExpandState == null && optionChainBottomSheetExpandState.isFullyExpanded()) {
                    z2 = true;
                    i20 = -1633490746;
                } else {
                    i20 = -1633490746;
                    z2 = false;
                }
                composerStartRestartGroup.startReplaceGroup(i20);
                zChangedInstance = composerStartRestartGroup.changedInstance(optionChainBottomSheetDuxo3) | composerStartRestartGroup.changedInstance(optionOrderIntentKey);
                Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    z3 = z2;
                    if (objRememberedValue15 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(optionOrderIntentKey, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composerStartRestartGroup, (i18 >> 3) & 14);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance2 = ((i18 & 896) == 256) | composerStartRestartGroup.changedInstance(optionChainBottomSheetDuxo3);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new C24144x43ecff2a(optionChainBottomSheetDuxo3, optionDefaultPricingState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i29 = i18 >> 6;
                    EffectsKt.LaunchedEffect(optionDefaultPricingState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, i29 & 14);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = ((i27 & 896) != 256) | composerStartRestartGroup.changed(immutableList3PersistentListOf);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new C24145x43ed02eb(function19, immutableList3PersistentListOf, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(immutableList3PersistentListOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged2 = ((i27 & 7168) != 2048) | composerStartRestartGroup.changed(immutableList3PersistentListOf2);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new C24146x43ed06ac(function17, immutableList3PersistentListOf2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(immutableList3PersistentListOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged3 = ((i27 & 57344) != 16384) | composerStartRestartGroup.changed(immutableList3PersistentListOf3);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged3 || objRememberedValue10 == companion.getEmpty()) {
                        objRememberedValue10 = new C24147x43ed0a6d(function16, immutableList3PersistentListOf3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(immutableList3PersistentListOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged4 = ((i27 & 458752) != 131072) | composerStartRestartGroup.changed(immutableList3PersistentListOf4);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged4 || objRememberedValue11 == companion.getEmpty()) {
                        function111 = function110;
                        objRememberedValue11 = new C24148x43ed0e2e(function111, immutableList3PersistentListOf4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    } else {
                        function111 = function110;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(immutableList3PersistentListOf4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged5 = ((3670016 & i27) != 1048576) | composerStartRestartGroup.changed(optionChainBottomSheetState.ordinal());
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged5 || objRememberedValue12 == companion.getEmpty()) {
                        function112 = function18;
                        obj = null;
                        objRememberedValue12 = new C24149x43ed11ef(function112, optionChainBottomSheetState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    } else {
                        function112 = function18;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(optionChainBottomSheetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composerStartRestartGroup, 0);
                    Modifier modifier7 = modifier4;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier7, 0.0f, 1, obj);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue13 == companion.getEmpty()) {
                        objRememberedValue13 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionChainBottomSheetComponentKt.m2309xf121230e(snapshotIntState2, (IntSize) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(companion5, (Function1) objRememberedValue13);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    Function1<? super ImmutableList<Integer>, Unit> function124 = function111;
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    boolean addedToWatchlist = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAddedToWatchlist();
                    boolean showTooManyLegsError = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowTooManyLegsError();
                    boolean showWatchlistButton = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowWatchlistButton();
                    OptionLegBundle singleLegBundle = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSingleLegBundle();
                    StringResource strategyTitle = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getStrategyTitle();
                    StringResource strategySubtitle = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getStrategySubtitle();
                    int i30 = StringResource.$stable;
                    int i31 = i18 << 9;
                    int i32 = i18;
                    OptionChainBottomSheetDuxo optionChainBottomSheetDuxo6 = optionChainBottomSheetDuxo3;
                    Function1<? super ImmutableList<Integer>, Unit> function125 = function19;
                    Function1<? super OptionChainBottomSheetState, Unit> function126 = function112;
                    Function1<? super ImmutableList<Integer>, Unit> function127 = function17;
                    Function1<? super ImmutableList<Integer>, Unit> function128 = function16;
                    boolean z4 = z3;
                    OptionChainBottomSheetHeader(addedToWatchlist, z4, showTooManyLegsError, showWatchlistButton, strategyTitle, strategySubtitle, singleLegBundle, optionOrderIntentKey, onLaunchOrderForm, function05, function35, composerStartRestartGroup, (i30 << 12) | (i30 << 15) | ((i18 << 18) & 29360128) | (i31 & 234881024) | ((i27 << 27) & 1879048192), (i27 >> 3) & 14, 0);
                    function113 = onLaunchOrderForm;
                    composerStartRestartGroup.endNode();
                    if (OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowTooManyLegsError()) {
                        composerStartRestartGroup.startReplaceGroup(-1067064336);
                        Modifier modifierWeight$default = Column5.weight$default(column6, ScrollKt.verticalScroll$default(companion5, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChanged6 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                        Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                        if (zChanged6 || objRememberedValue16 == companion.getEmpty()) {
                            objRememberedValue16 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionChainBottomSheetComponentKt.m2311xd5ec7740(snapshotState4CollectAsStateWithLifecycle, snapshotIntState22, snapshotIntState24, snapshotState2, snapshotIntState25, (IntSize) obj2);
                                }
                            };
                            snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            snapshotState = snapshotState2;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                        } else {
                            snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            snapshotState = snapshotState2;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnSizeChanged2 = OnRemeasuredModifier2.onSizeChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue16);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged2);
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
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                        OptionChainBottomSheetSimulatedReturnSection4 simulatedReturnSectionState = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4).getSimulatedReturnSectionState();
                        if (OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4).getNoQuoteFallbackContent() != null) {
                            composerStartRestartGroup.startReplaceGroup(1797290645);
                            bentoTheme = bentoTheme2;
                            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion5, bentoTheme.getSpacing(composerStartRestartGroup, i28).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i28).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i28).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i28).m21594getXlargeD9Ej5fM());
                            StringResource noQuoteFallbackContent = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4).getNoQuoteFallbackContent();
                            if (noQuoteFallbackContent != null) {
                                Resources resources = context.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                CharSequence text = noQuoteFallbackContent.getText(resources);
                                if (text == null || (string2 = text.toString()) == null) {
                                    string2 = "";
                                }
                                Composer composer3 = composerStartRestartGroup;
                                companion2 = companion5;
                                BentoText2.m20747BentoText38GnDrw(string2, modifierM5145paddingqDBjuR0, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i28).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i28).getTextS(), composer3, 0, 0, 8120);
                                composerStartRestartGroup = composer3;
                                composerStartRestartGroup.endReplaceGroup();
                                i21 = i28;
                                i22 = i32;
                                optionChainBottomSheetDuxo4 = optionChainBottomSheetDuxo6;
                            }
                        } else {
                            companion2 = companion5;
                            bentoTheme = bentoTheme2;
                            i21 = i28;
                            if (simulatedReturnSectionState != null) {
                                composerStartRestartGroup.startReplaceGroup(1798062328);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue17 == companion.getEmpty()) {
                                    objRememberedValue17 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return OptionChainBottomSheetComponentKt.m2312x4eb70e41(snapshotState, (OptionsSimulatedReturnErrorState) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                OptionChainBottomSheetSimulatedReturnSection5.m17169OptionChainBottomSheetSimulatedReturnSectionfWhpE4E(simulatedReturnSectionState, z4, z, j, (Function1) objRememberedValue17, null, composerStartRestartGroup, (i29 & 896) | 24576 | ((i32 >> 12) & 7168), 32);
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                optionChainBottomSheetDuxo4 = optionChainBottomSheetDuxo6;
                                i22 = i32;
                                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(optionChainBottomSheetDuxo4) | ((i22 & 7168) == 2048);
                                Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue18 == companion.getEmpty()) {
                                    optionChainBottomSheetExpandState2 = optionChainBottomSheetExpandState;
                                    objRememberedValue18 = new C24150xfe44ee9c(optionChainBottomSheetDuxo4, optionChainBottomSheetExpandState2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                                } else {
                                    optionChainBottomSheetExpandState2 = optionChainBottomSheetExpandState;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(optionChainBottomSheetExpandState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue18, composerStartRestartGroup, (i22 >> 9) & 14);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                i22 = i32;
                                optionChainBottomSheetDuxo4 = optionChainBottomSheetDuxo6;
                                composerStartRestartGroup.startReplaceGroup(1798672563);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                        }
                        composerStartRestartGroup.endNode();
                        OptionChainBottomSheetContractSection(column6, OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4).getLegItems(), OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4).getShowEditRatio(), z4, optionOrderIntentKey, composerStartRestartGroup, 6 | (i31 & 57344));
                        fromOptionOrderBundle = optionOrderIntentKey;
                        Modifier.Companion companion6 = companion2;
                        OptionsSimulatedReturnInfoFooterComposable.OptionsSimulatedReturnInfoFooterComposable(PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i21).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i21).m21590getDefaultD9Ej5fM()), false, composerStartRestartGroup, 0, 2);
                        composerStartRestartGroup.endNode();
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i21).m21592getMediumD9Ej5fM()), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "options-order-cart-footer-cta", null, 4, null), new ComponentHierarchy(userInteractionEventDescriptor.getComponent(), null, null, null, null, 30, null), 15, null), false, false, false, true, false, null, 110, null);
                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(navigator) | ((i22 & 458752) == 131072) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(fromOptionOrderBundle);
                        Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue19 == companion.getEmpty()) {
                            objRememberedValue19 = new Function0() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OptionChainBottomSheetComponentKt.m2313x595ed7e5(function113, navigator, context, fromOptionOrderBundle);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer4 = composerStartRestartGroup;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue19, strStringResource, modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer4, 0, 0, 8184);
                        composerStartRestartGroup = composer4;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1067447279);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue20 == companion.getEmpty()) {
                            objRememberedValue20 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionChainBottomSheetComponentKt.m2310xe691e53e(snapshotIntState23, (IntSize) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        OptionChainBottomErrorSection(OnRemeasuredModifier2.onSizeChanged(modifierFillMaxWidth$default2, (Function1) objRememberedValue20), composerStartRestartGroup, 6, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        fromOptionOrderBundle = optionOrderIntentKey;
                        optionChainBottomSheetDuxo4 = optionChainBottomSheetDuxo6;
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    optionChainBottomSheetDuxo5 = optionChainBottomSheetDuxo4;
                    function03 = function05;
                    composer2 = composerStartRestartGroup;
                    function114 = function125;
                    function115 = function127;
                    function116 = function128;
                    function117 = function124;
                    modifier5 = modifier7;
                    function118 = function126;
                    function33 = function35;
                } else {
                    z3 = z2;
                }
                objRememberedValue15 = new C24143x43ecfb69(optionChainBottomSheetDuxo3, optionOrderIntentKey, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(optionOrderIntentKey, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composerStartRestartGroup, (i18 >> 3) & 14);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = ((i18 & 896) == 256) | composerStartRestartGroup.changedInstance(optionChainBottomSheetDuxo3);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    objRememberedValue7 = new C24144x43ecff2a(optionChainBottomSheetDuxo3, optionDefaultPricingState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    composerStartRestartGroup.endReplaceGroup();
                    int i292 = i18 >> 6;
                    EffectsKt.LaunchedEffect(optionDefaultPricingState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, i292 & 14);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = ((i27 & 896) != 256) | composerStartRestartGroup.changed(immutableList3PersistentListOf);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue8 = new C24145x43ed02eb(function19, immutableList3PersistentListOf, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(immutableList3PersistentListOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged2 = ((i27 & 7168) != 2048) | composerStartRestartGroup.changed(immutableList3PersistentListOf2);
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue9 = new C24146x43ed06ac(function17, immutableList3PersistentListOf2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(immutableList3PersistentListOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged3 = ((i27 & 57344) != 16384) | composerStartRestartGroup.changed(immutableList3PersistentListOf3);
                            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged3) {
                                objRememberedValue10 = new C24147x43ed0a6d(function16, immutableList3PersistentListOf3, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(immutableList3PersistentListOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                zChanged4 = ((i27 & 458752) != 131072) | composerStartRestartGroup.changed(immutableList3PersistentListOf4);
                                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                if (zChanged4) {
                                    function111 = function110;
                                    objRememberedValue11 = new C24148x43ed0e2e(function111, immutableList3PersistentListOf4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(immutableList3PersistentListOf4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    zChanged5 = ((3670016 & i27) != 1048576) | composerStartRestartGroup.changed(optionChainBottomSheetState.ordinal());
                                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged5) {
                                        function112 = function18;
                                        obj = null;
                                        objRememberedValue12 = new C24149x43ed11ef(function112, optionChainBottomSheetState, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(optionChainBottomSheetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composerStartRestartGroup, 0);
                                        Modifier modifier72 = modifier4;
                                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier72, 0.0f, 1, obj);
                                        Arrangement arrangement2 = Arrangement.INSTANCE;
                                        Arrangement.Vertical top2 = arrangement2.getTop();
                                        Alignment.Companion companion32 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                                        ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor5 = companion42.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion42.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion42.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting()) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion42.getSetModifier());
                                            Column6 column62 = Column6.INSTANCE;
                                            Modifier.Companion companion52 = Modifier.INSTANCE;
                                            composerStartRestartGroup.startReplaceGroup(5004770);
                                            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue13 == companion.getEmpty()) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            Modifier modifierOnSizeChanged3 = OnRemeasuredModifier2.onSizeChanged(companion52, (Function1) objRememberedValue13);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopStart(), false);
                                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged3);
                                            Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Function1<? super ImmutableList<Integer>, Unit> function1242 = function111;
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy3, companion42.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl2.getInserting()) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                boolean addedToWatchlist2 = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAddedToWatchlist();
                                                boolean showTooManyLegsError2 = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowTooManyLegsError();
                                                boolean showWatchlistButton2 = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowWatchlistButton();
                                                OptionLegBundle singleLegBundle2 = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSingleLegBundle();
                                                StringResource strategyTitle2 = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getStrategyTitle();
                                                StringResource strategySubtitle2 = OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getStrategySubtitle();
                                                int i302 = StringResource.$stable;
                                                int i312 = i18 << 9;
                                                int i322 = i18;
                                                OptionChainBottomSheetDuxo optionChainBottomSheetDuxo62 = optionChainBottomSheetDuxo3;
                                                Function1<? super ImmutableList<Integer>, Unit> function1252 = function19;
                                                Function1<? super OptionChainBottomSheetState, Unit> function1262 = function112;
                                                Function1<? super ImmutableList<Integer>, Unit> function1272 = function17;
                                                Function1<? super ImmutableList<Integer>, Unit> function1282 = function16;
                                                boolean z42 = z3;
                                                OptionChainBottomSheetHeader(addedToWatchlist2, z42, showTooManyLegsError2, showWatchlistButton2, strategyTitle2, strategySubtitle2, singleLegBundle2, optionOrderIntentKey, onLaunchOrderForm, function05, function35, composerStartRestartGroup, (i302 << 12) | (i302 << 15) | ((i18 << 18) & 29360128) | (i312 & 234881024) | ((i27 << 27) & 1879048192), (i27 >> 3) & 14, 0);
                                                function113 = onLaunchOrderForm;
                                                composerStartRestartGroup.endNode();
                                                if (OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowTooManyLegsError()) {
                                                }
                                                composerStartRestartGroup.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                optionChainBottomSheetDuxo5 = optionChainBottomSheetDuxo4;
                                                function03 = function05;
                                                composer2 = composerStartRestartGroup;
                                                function114 = function1252;
                                                function115 = function1272;
                                                function116 = function1282;
                                                function117 = function1242;
                                                modifier5 = modifier72;
                                                function118 = function1262;
                                                function33 = function35;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle2 = fromOptionOrderBundle;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return OptionChainBottomSheetComponentKt.OptionChainBottomSheetComponent_7uKoTdw$lambda$42(accountNumber, fromOptionOrderBundle2, optionDefaultPricingState, optionChainBottomSheetExpandState, z, function113, screenName, j, modifier5, optionChainBottomSheetDuxo5, function03, function33, function114, function115, function116, function117, function118, i, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 24576;
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        i5 = i3 & 256;
        if (i5 == 0) {
        }
        if ((i & 805306368) != 0) {
        }
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        i8 = i3 & 2048;
        if (i8 == 0) {
        }
        int i242 = i7;
        i10 = i3 & 4096;
        if (i10 == 0) {
        }
        i12 = i3 & 8192;
        if (i12 == 0) {
        }
        i14 = i3 & 16384;
        if (i14 == 0) {
        }
        i16 = i3 & 32768;
        if (i16 == 0) {
        }
        i17 = i3 & 65536;
        if (i17 == 0) {
        }
        int i272 = i15;
        if ((i4 & 306783379) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if (i6 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                Function1<? super ImmutableList<Integer>, Unit> function1232 = function120;
                function32 = function34;
                optionChainBottomSheetDuxo3 = optionChainBottomSheetDuxo2;
                function16 = function121;
                function17 = function1232;
                if (i17 == 0) {
                }
                function02 = function04;
                modifier3 = modifier6;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(optionChainBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                }
                final SnapshotIntState2 snapshotIntState26 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                final SnapshotIntState2 snapshotIntState232 = (SnapshotIntState2) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                final SnapshotIntState2 snapshotIntState242 = (SnapshotIntState2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                final SnapshotIntState2 snapshotIntState252 = (SnapshotIntState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(992276530);
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i282 = BentoTheme.$stable;
                int iMo5016toPx0680j_42 = (int) density2.mo5016toPx0680j_4(bentoTheme22.getSpacing(composerStartRestartGroup, i282).m21593getSmallD9Ej5fM());
                composerStartRestartGroup.endReplaceGroup();
                if (snapshotIntState26.getIntValue() != 0) {
                    if (snapshotIntState26.getIntValue() != 0) {
                        if (snapshotIntState26.getIntValue() != 0) {
                            ImmutableList3 immutableList3PersistentListOf32 = (snapshotIntState26.getIntValue() != 0 || snapshotIntState242.getIntValue() == 0) ? extensions2.persistentListOf() : extensions2.persistentListOf(Integer.valueOf(snapshotIntState26.getIntValue() + snapshotIntState242.getIntValue()));
                            if (snapshotIntState26.getIntValue() != 0) {
                                Function0<Unit> function052 = function02;
                                Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function352 = function32;
                                ImmutableList3 immutableList3PersistentListOf42 = (snapshotIntState26.getIntValue() != 0 || snapshotIntState252.getIntValue() == 0) ? extensions2.persistentListOf() : extensions2.persistentListOf(Integer.valueOf(snapshotIntState26.getIntValue() + snapshotIntState252.getIntValue()));
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue6 != companion.getEmpty()) {
                                }
                                final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue6;
                                composerStartRestartGroup.endReplaceGroup();
                                if (!OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getShowTooManyLegsError()) {
                                }
                                if (optionChainBottomSheetExpandState == null) {
                                    i20 = -1633490746;
                                    z2 = false;
                                    composerStartRestartGroup.startReplaceGroup(i20);
                                    zChangedInstance = composerStartRestartGroup.changedInstance(optionChainBottomSheetDuxo3) | composerStartRestartGroup.changedInstance(optionOrderIntentKey);
                                    Object objRememberedValue152 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance) {
                                    }
                                    objRememberedValue152 = new C24143x43ecfb69(optionChainBottomSheetDuxo3, optionOrderIntentKey, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue152);
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(optionOrderIntentKey, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue152, composerStartRestartGroup, (i18 >> 3) & 14);
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    zChangedInstance2 = ((i18 & 896) == 256) | composerStartRestartGroup.changedInstance(optionChainBottomSheetDuxo3);
                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetComponent_7uKoTdw$lambda$41$lambda$28$lambda$27 */
    public static final Unit m2309xf121230e(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetComponent_7uKoTdw$lambda$41$lambda$31$lambda$30 */
    public static final Unit m2310xe691e53e(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetComponent_7uKoTdw$lambda$41$lambda$38$lambda$33$lambda$32 */
    public static final Unit m2311xd5ec7740(SnapshotState4 snapshotState4, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, SnapshotState snapshotState, SnapshotIntState2 snapshotIntState23, IntSize intSize) {
        if (OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4).getNoQuoteFallbackContent() == null && snapshotIntState2.getIntValue() <= 0) {
            snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        }
        if (OptionChainBottomSheetComponent_7uKoTdw$lambda$0(snapshotState4).getNoQuoteFallbackContent() != null && snapshotIntState22.getIntValue() <= 0) {
            snapshotIntState22.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        }
        if (OptionChainBottomSheetComponent_7uKoTdw$lambda$18(snapshotState) != null && snapshotIntState23.getIntValue() <= 0) {
            snapshotIntState23.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetComponent_7uKoTdw$lambda$41$lambda$38$lambda$37$lambda$35$lambda$34 */
    public static final Unit m2312x4eb70e41(SnapshotState snapshotState, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState) {
        snapshotState.setValue(optionsSimulatedReturnErrorState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetComponent_7uKoTdw$lambda$41$lambda$40$lambda$39 */
    public static final Unit m2313x595ed7e5(Function1 function1, Navigator navigator, Context context, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle) {
        function1.invoke(Navigator.DefaultImpls.createIntent$default(navigator, context, fromOptionOrderBundle, null, false, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void OptionChainBottomSheetHeader(final boolean z, final boolean z2, final boolean z3, final boolean z4, final StringResource stringResource, final StringResource stringResource2, final OptionLegBundle optionLegBundle, final OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, final Function1<? super Intent, Unit> function1, Function0<Unit> function0, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, Composer composer, final int i, final int i2, final int i3) throws Resources.NotFoundException {
        int i4;
        OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle2;
        int i5;
        int i6;
        int i7;
        int i8;
        final Function0<Unit> function02;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        String string2;
        CharSequence text;
        HeaderButtonMode headerButtonMode;
        Composer composer2;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function32;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1991229417);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                i4 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else {
                if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(optionLegBundle) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else {
                    if ((i & 12582912) == 0) {
                        fromOptionOrderBundle2 = fromOptionOrderBundle;
                        i4 |= composerStartRestartGroup.changedInstance(fromOptionOrderBundle2) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                        }
                        i5 = i3 & 512;
                        if (i5 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
                        }
                        i6 = i3 & 1024;
                        if (i6 != 0) {
                            i8 = i2 | 6;
                        } else {
                            if ((i2 & 6) != 0) {
                                i7 = i2;
                                if ((i4 & 306783379) != 306783378 && (i7 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function03 = function0;
                                    function32 = function3;
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    function02 = i5 == 0 ? null : function0;
                                    Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function33 = i6 == 0 ? null : function3;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1991229417, i4, i7, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetHeader (OptionChainBottomSheetComponent.kt:316)");
                                    }
                                    Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    Resources resources = context.getResources();
                                    Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                                    userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                    Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function34 = function33;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    int i9 = i4;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i10 = BentoTheme.$stable;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM(), 2, null);
                                    boolean z5 = function02 == null;
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                                    zChangedInstance = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current) | ((i9 & 1879048192) != 536870912);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return OptionChainBottomSheetComponentKt.OptionChainBottomSheetHeader$lambda$45$lambda$44(userInteractionEventDescriptor, current, function02);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5146paddingqDBjuR0$default, interactionSource3, null, z5, null, null, (Function0) objRememberedValue2, 24, null);
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                    Function0<Unit> function04 = function02;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceBetween, companion3.getCenterVertically(), composerStartRestartGroup, 54);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor2);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    if (stringResource == null) {
                                        Intrinsics.checkNotNull(resources);
                                        CharSequence text2 = stringResource.getText(resources);
                                        if (text2 == null || (string2 = text2.toString()) == null) {
                                            string2 = "";
                                        }
                                        BentoText2.m20747BentoText38GnDrw(string2, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i10).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                                        if (stringResource2 != null) {
                                            Intrinsics.checkNotNull(resources);
                                            text = stringResource2.getText(resources);
                                        } else {
                                            text = null;
                                        }
                                        BentoText2.m20747BentoText38GnDrw(String.valueOf(text), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i10).getTextS(), composerStartRestartGroup, 0, 0, 8190);
                                        composerStartRestartGroup.endNode();
                                        if (!z2) {
                                            headerButtonMode = HeaderButtonMode.CONTINUE;
                                        } else if (z4) {
                                            headerButtonMode = HeaderButtonMode.WATCHLIST;
                                        } else {
                                            headerButtonMode = HeaderButtonMode.NONE;
                                        }
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue3 == companion.getEmpty()) {
                                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return OptionChainBottomSheetComponentKt.OptionChainBottomSheetHeader$lambda$49$lambda$48$lambda$47((AnimatedContentTransitionScope) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        AnimatedContentKt.AnimatedContent(headerButtonMode, null, (Function1) objRememberedValue3, companion3.getCenterEnd(), null, null, ComposableLambda3.rememberComposableLambda(-1267589032, true, new C24151xe9229399(userInteractionEventDescriptor, z3, function1, navigator, context, fromOptionOrderBundle2, z, function34, optionLegBundle), composerStartRestartGroup, 54), composerStartRestartGroup, 1576320, 50);
                                        composer2 = composerStartRestartGroup;
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function32 = function34;
                                        function03 = function04;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return OptionChainBottomSheetComponentKt.OptionChainBottomSheetHeader$lambda$50(z, z2, z3, z4, stringResource, stringResource2, optionLegBundle, fromOptionOrderBundle, function1, function03, function32, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i8 = i2 | (composerStartRestartGroup.changedInstance(function3) ? 4 : 2);
                        }
                        i7 = i8;
                        if ((i4 & 306783379) != 306783378) {
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            Resources resources2 = context2.getResources();
                            Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function342 = function33;
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            int i92 = i4;
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i102 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21593getSmallD9Ej5fM(), 2, null);
                            if (function02 == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChangedInstance = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current) | ((i92 & 1879048192) != 536870912);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionChainBottomSheetComponentKt.OptionChainBottomSheetHeader$lambda$45$lambda$44(userInteractionEventDescriptor, current, function02);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifierM5146paddingqDBjuR0$default2, interactionSource32, null, z5, null, null, (Function0) objRememberedValue2, 24, null);
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical spaceBetween2 = arrangement2.getSpaceBetween();
                                Alignment.Companion companion32 = Alignment.INSTANCE;
                                Function0<Unit> function042 = function02;
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(spaceBetween2, companion32.getCenterVertically(), composerStartRestartGroup, 54);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default2);
                                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion42.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion42.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion42.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion42.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion32.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion22);
                                    Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl2.getInserting()) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                                        Column6 column62 = Column6.INSTANCE;
                                        if (stringResource == null) {
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i5 = i3 & 512;
                    if (i5 != 0) {
                    }
                    i6 = i3 & 1024;
                    if (i6 != 0) {
                    }
                    i7 = i8;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                fromOptionOrderBundle2 = fromOptionOrderBundle;
                if ((i3 & 256) == 0) {
                }
                i5 = i3 & 512;
                if (i5 != 0) {
                }
                i6 = i3 & 1024;
                if (i6 != 0) {
                }
                i7 = i8;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 128) != 0) {
            }
            fromOptionOrderBundle2 = fromOptionOrderBundle;
            if ((i3 & 256) == 0) {
            }
            i5 = i3 & 512;
            if (i5 != 0) {
            }
            i6 = i3 & 1024;
            if (i6 != 0) {
            }
            i7 = i8;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        fromOptionOrderBundle2 = fromOptionOrderBundle;
        if ((i3 & 256) == 0) {
        }
        i5 = i3 & 512;
        if (i5 != 0) {
        }
        i6 = i3 & 1024;
        if (i6 != 0) {
        }
        i7 = i8;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainBottomSheetHeader$lambda$45$lambda$44(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, userInteractionEventDescriptor.getAction(), userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.SECTION_HEADER, null, null, 6, null), new ComponentHierarchy(userInteractionEventDescriptor.getComponent(), null, null, null, null, 30, null), userInteractionEventDescriptor.getContext(), false, 32, null);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform OptionChainBottomSheetHeader$lambda$49$lambda$48$lambda$47(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return new ContentTransform(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(200, 100, null, 4, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null), 0.0f, null, 4, null);
    }

    private static final void OptionChainBottomErrorSection(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(727879677);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(727879677, i3, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomErrorSection (OptionChainBottomSheetComponent.kt:448)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.option_chain_bottom_sheet_too_many_legs, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainBottomSheetComponentKt.OptionChainBottomErrorSection$lambda$51(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void OptionChainBottomSheetContractSection(final Column5 column5, ImmutableList<SelectedLegItem> immutableList, final boolean z, final boolean z2, final OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, Composer composer, final int i) {
        Modifier.Companion companion;
        ImmutableList<SelectedLegItem> immutableList2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-373928026);
        int i2 = (i & 48) == 0 ? (composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(fromOptionOrderBundle) ? 16384 : 8192;
        }
        if ((i2 & 9361) == 9360 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            immutableList2 = immutableList;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-373928026, i2, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetContractSection (OptionChainBottomSheetComponent.kt:468)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Resources resources = context.getResources();
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            composerStartRestartGroup.startReplaceGroup(1432432143);
            if (!z2) {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM());
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C24135R.string.option_chain_bottom_sheet_pnl_contracts, composerStartRestartGroup, 0);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            Object obj = null;
            Resources resources2 = resources;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 24576, 0, 8174);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(328443405);
            if (z) {
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "edit-ratio", null, 4, null), new ComponentHierarchy(userInteractionEventDescriptor.getComponent(), null, null, null, null, 30, null), 15, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(fromOptionOrderBundle) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionChainBottomSheetComponentKt.m2314x2e544610(fromOptionOrderBundle, navigator, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                companion = companion2;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.option_chain_bottom_sheet_pnl_edit_ratio, composerStartRestartGroup, 0), ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null), userInteractionEventDescriptorCopy$default, false, false, false, true, false, null, 110, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU()), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 24576, 0, 8168);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                companion = companion2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            float f = 0.0f;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
            if (immutableList == null) {
                immutableList2 = immutableList;
            } else {
                immutableList2 = immutableList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList2, 10));
                for (final SelectedLegItem selectedLegItem : immutableList2) {
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType = Component.ComponentType.ROW;
                    String string2 = selectedLegItem.getOptionLegBundle().getOptionInstrument().getId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, 1, obj), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(componentType, string2, null, 4, null), new ComponentHierarchy(userInteractionEventDescriptor2.getComponent(), null, null, null, null, 30, null), 15, null), false, false, false, true, false, null, 110, null);
                    Intrinsics.checkNotNull(resources2);
                    Resources resources3 = resources2;
                    String titleString = selectedLegItem.getTitleString(resources3);
                    String subtitleString = selectedLegItem.getSubtitleString(resources3);
                    resources2 = resources3;
                    String priceText = selectedLegItem.getPriceText();
                    if (priceText == null) {
                        priceText = "—";
                    }
                    BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(priceText);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(selectedLegItem) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionChainBottomSheetComponentKt.m2315x12cd3ed9(selectedLegItem, navigator, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, titleString, subtitleString, null, singleLine, null, false, false, false, 0L, (Function0) objRememberedValue2, composer2, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 2002);
                    composerStartRestartGroup = composer2;
                    arrayList.add(Unit.INSTANCE);
                    f = f;
                    obj = null;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ImmutableList<SelectedLegItem> immutableList3 = immutableList2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return OptionChainBottomSheetComponentKt.OptionChainBottomSheetContractSection$lambda$58(column5, immutableList3, z, z2, fromOptionOrderBundle, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetContractSection$lambda$54$lambda$53$lambda$52 */
    public static final Unit m2314x2e544610(OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new OptionEditLegRatioFragmentKey(fromOptionOrderBundle), false, false, false, null, false, null, true, false, null, null, 3716, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetContractSection$lambda$57$lambda$56$lambda$55 */
    public static final Unit m2315x12cd3ed9(SelectedLegItem selectedLegItem, Navigator navigator, Context context) {
        if (selectedLegItem.getPriceText() != null) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, selectedLegItem.getFragmentKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        return Unit.INSTANCE;
    }
}
