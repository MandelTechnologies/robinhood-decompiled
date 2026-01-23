package com.robinhood.android.optionschain.bottomsheet;

import android.content.Intent;
import android.graphics.Shader;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt;
import com.robinhood.android.optionschain.logging.OptionsContext2;
import com.robinhood.android.optionschain.sbschain.table.BidAskCellDisableType;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.common.compose.multimodebottomsheet.AnchoredDragScope;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeDraggableAnchors;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionChainBottomSheetScaffold.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÝ\u0001\u0010!\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00142,\b\u0002\u0010\u001a\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016j\u0004\u0018\u0001`\u00192\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010%\u001a\u00020\b*\u00020\"2\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b%\u0010&¨\u0006;²\u0006\u0014\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\nX\u008a\u0084\u0002²\u0006\u000e\u0010+\u001a\u00020*8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020*0,8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020*0,8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020*0,8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020*0,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00106\u001a\u0002058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00107\u001a\u0004\u0018\u00010\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00109\u001a\u0004\u0018\u0001088\n@\nX\u008a\u008e\u0002²\u0006\f\u0010:\u001a\u00020\"8\nX\u008a\u0084\u0002"}, m3636d2 = {"", "accountNumber", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "defaultPricingState", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "orderIntentKey", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "onLaunchOrderForm", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "screenName", "", "shouldExpandPnlBottomSheetForL2LongPress", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetScaffoldDuxo;", "duxo", "Landroidx/compose/ui/unit/Dp;", "sheetOverlappingHeight", "Lkotlin/Function0;", "topBar", "Lkotlin/Function3;", "Lcom/robinhood/models/ui/OptionLegBundle;", "Lcom/robinhood/android/optionschain/sbschain/table/BidAskCellDisableType;", "Lcom/robinhood/android/optionschain/sbschain/OnChainTableButtonTapped;", "onWatchlistButtonTapped", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "onBottomSheetStateUpdated", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "OptionChainBottomSheetScaffold-TCVpFMg", "(Ljava/lang/String;Lcom/robinhood/android/common/options/OptionDefaultPricingState;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;Lkotlin/jvm/functions/Function1;Lcom/robinhood/rosetta/eventlogging/Screen$Name;ZLandroidx/compose/ui/Modifier;Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetScaffoldDuxo;FLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "OptionChainBottomSheetScaffold", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "", "nuxDistance", "playNuxAnimation", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetScaffoldEvent;", "event", "", "dragHandleHeight", "Lkotlinx/collections/immutable/ImmutableList;", "sheetValues", "sectionHeight", "errorSheetValues", "errorSectionHeight", "noQuoteSheetValues", "noQuoteSectionHeight", "chartErrorSheetValues", "chartErrorSectionHeight", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetState;", "optionChainBottomSheetState", "currentBottomSheetValue", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetExpandState;", "expandState", "bottomSheetState", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainBottomSheetScaffoldKt {

    /* compiled from: OptionChainBottomSheetScaffold.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainBottomSheetState.values().length];
            try {
                iArr[OptionChainBottomSheetState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainBottomSheetState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionChainBottomSheetState.NO_QUOTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionChainBottomSheetState.CHART_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainBottomSheetScaffold_TCVpFMg$lambda$53(String str, OptionDefaultPricingState optionDefaultPricingState, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, Function1 function1, Screen.Name name, boolean z, Modifier modifier, OptionChainBottomSheetScaffoldDuxo optionChainBottomSheetScaffoldDuxo, float f, Function2 function2, Function3 function3, Function1 function12, Function3 function32, int i, int i2, int i3, Composer composer, int i4) {
        m17158OptionChainBottomSheetScaffoldTCVpFMg(str, optionDefaultPricingState, fromOptionOrderBundle, function1, name, z, modifier, optionChainBottomSheetScaffoldDuxo, f, function2, function3, function12, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0aa1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[RETURN, SYNTHETIC] */
    /* renamed from: OptionChainBottomSheetScaffold-TCVpFMg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17158OptionChainBottomSheetScaffoldTCVpFMg(final String str, final OptionDefaultPricingState optionDefaultPricingState, final OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, final Function1<? super Intent, Unit> onLaunchOrderForm, final Screen.Name screenName, final boolean z, Modifier modifier, OptionChainBottomSheetScaffoldDuxo optionChainBottomSheetScaffoldDuxo, float f, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, Function1<? super MultiModeSheetState2, Unit> function1, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        OptionDefaultPricingState optionDefaultPricingState2;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        int i8;
        Function1<? super MultiModeSheetState2, Unit> function12;
        int i9;
        int i10;
        int i11;
        int i12;
        OptionChainBottomSheetScaffoldDuxo optionChainBottomSheetScaffoldDuxo2;
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> lambda$1339730988$feature_options_chain_externalDebug;
        Modifier modifier3;
        float f2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final Function1<? super MultiModeSheetState2, Unit> function13;
        int i13;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function33;
        int i14;
        final Density density;
        Object objRememberedValue;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        Event<OptionChainBottomSheetScaffoldEvent> event;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Object objRememberedValue2;
        Object objRememberedValue3;
        SnapshotMutationPolicy snapshotMutationPolicy;
        SnapshotState snapshotState;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        final SnapshotState snapshotState2;
        Object objRememberedValue7;
        SnapshotState snapshotState3;
        Object objRememberedValue8;
        Object objRememberedValue9;
        final SnapshotState snapshotState4;
        Object objRememberedValue10;
        SnapshotState snapshotState5;
        Object objRememberedValue11;
        Object objRememberedValue12;
        final SnapshotState snapshotState6;
        Object objRememberedValue13;
        final SnapshotState snapshotState7;
        Object objRememberedValue14;
        Object objRememberedValue15;
        final SnapshotState snapshotState8;
        boolean z2;
        boolean z3;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        Object objRememberedValue16;
        SnapshotMutationPolicy snapshotMutationPolicy2;
        int i15;
        Object objMutableStateOf$default;
        final SnapshotState snapshotState9;
        Object objRememberedValue17;
        final SnapshotState snapshotState10;
        boolean zChanged;
        Object objRememberedValue18;
        final SnapshotState snapshotState11;
        Density density2;
        boolean z4;
        final UserInteractionEventDescriptor userInteractionEventDescriptor2;
        final SnapshotState4 snapshotState42;
        boolean zChanged2;
        Object objRememberedValue19;
        float fMo5016toPx0680j_4;
        boolean zChanged3;
        Object objRememberedValue20;
        CoroutineScope coroutineScope2;
        OptionChainBottomSheetScaffoldDuxo optionChainBottomSheetScaffoldDuxo3;
        final float fMo5016toPx0680j_42;
        final float fMo5016toPx0680j_43;
        final long jM6705copywmQWz5c$default;
        final boolean isDay;
        boolean zChanged4;
        Object objRememberedValue21;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function34;
        final Modifier modifier4;
        final float f3;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function35;
        final OptionChainBottomSheetScaffoldDuxo optionChainBottomSheetScaffoldDuxo4;
        final Function1<? super MultiModeSheetState2, Unit> function14;
        OptionOrderBundle optionOrderBundle;
        ImmutableList<OptionLegBundle> legBundles;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onLaunchOrderForm, "onLaunchOrderForm");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Composer composerStartRestartGroup = composer.startRestartGroup(-739749028);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            optionDefaultPricingState2 = optionDefaultPricingState;
        } else {
            optionDefaultPricingState2 = optionDefaultPricingState;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(optionDefaultPricingState2 == null ? -1 : optionDefaultPricingState.ordinal()) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(fromOptionOrderBundle) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onLaunchOrderForm) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(screenName.ordinal()) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        int i16 = i3 & 64;
        if (i16 != 0) {
            i4 |= 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
        }
        if ((i & 12582912) == 0) {
            i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changedInstance(optionChainBottomSheetScaffoldDuxo)) ? 8388608 : 4194304;
        }
        int i17 = i3 & 256;
        if (i17 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 67108864 : 33554432;
        }
        int i18 = i3 & 512;
        if (i18 != 0) {
            i5 = i18;
            i6 = i4 | 805306368;
        } else {
            if ((i & 805306368) == 0) {
                i5 = i18;
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
            } else {
                i5 = i18;
            }
            i6 = i4;
        }
        int i19 = i3 & 1024;
        if (i19 != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerStartRestartGroup.changedInstance(function3) ? 4 : 2);
        } else {
            i7 = i2;
        }
        int i20 = i3 & 2048;
        if (i20 != 0) {
            i8 = i20;
            i9 = i7 | 48;
            function12 = function1;
        } else {
            if ((i2 & 48) == 0) {
                i8 = i20;
                function12 = function1;
                i7 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            } else {
                i8 = i20;
                function12 = function1;
            }
            i9 = i7;
        }
        int i21 = i3 & 4096;
        if (i21 == 0) {
            if ((i2 & 384) == 0) {
                i9 |= composerStartRestartGroup.changedInstance(function32) ? 256 : 128;
            }
            if ((i6 & 306783379) != 306783378 && (i9 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                optionChainBottomSheetScaffoldDuxo4 = optionChainBottomSheetScaffoldDuxo;
                function34 = function3;
                modifier4 = modifier2;
                function14 = function12;
                composer2 = composerStartRestartGroup;
                f3 = f;
                function23 = function2;
                function35 = function32;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i16 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 128) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i12 = i21;
                        i10 = i19;
                        i11 = i9;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionChainBottomSheetScaffoldDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue22 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold-TCVpFMg$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold-TCVpFMg$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue22, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        optionChainBottomSheetScaffoldDuxo2 = (OptionChainBottomSheetScaffoldDuxo) baseDuxo;
                        i6 &= -29360129;
                    } else {
                        i10 = i19;
                        i11 = i9;
                        i12 = i21;
                        optionChainBottomSheetScaffoldDuxo2 = optionChainBottomSheetScaffoldDuxo;
                    }
                    float fM7995constructorimpl = i17 == 0 ? C2002Dp.m7995constructorimpl(0) : f;
                    Function2<? super Composer, ? super Integer, Unit> function24 = i5 == 0 ? null : function2;
                    Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function36 = i10 == 0 ? null : function3;
                    Function1<? super MultiModeSheetState2, Unit> function15 = i8 == 0 ? null : function1;
                    if (i12 == 0) {
                        modifier3 = modifier5;
                        f2 = fM7995constructorimpl;
                        function22 = function24;
                        function13 = function15;
                        lambda$1339730988$feature_options_chain_externalDebug = ComposableSingletons$OptionChainBottomSheetScaffoldKt.INSTANCE.getLambda$1339730988$feature_options_chain_externalDebug();
                    } else {
                        lambda$1339730988$feature_options_chain_externalDebug = function32;
                        modifier3 = modifier5;
                        f2 = fM7995constructorimpl;
                        function22 = function24;
                        function13 = function15;
                    }
                    i13 = i6;
                    function33 = function36;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 128) != 0) {
                        i6 &= -29360129;
                    }
                    optionChainBottomSheetScaffoldDuxo2 = optionChainBottomSheetScaffoldDuxo;
                    f2 = f;
                    function22 = function2;
                    function33 = function3;
                    function13 = function1;
                    lambda$1339730988$feature_options_chain_externalDebug = function32;
                    modifier3 = modifier2;
                    i11 = i9;
                    i13 = i6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    i14 = i11;
                } else {
                    i14 = i11;
                    ComposerKt.traceEventStart(-739749028, i13, i14, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffold (OptionChainBottomSheetScaffold.kt:69)");
                }
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                final StateFlow<Event<OptionChainBottomSheetScaffoldEvent>> eventFlow = optionChainBottomSheetScaffoldDuxo2.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold-TCVpFMg$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold-TCVpFMg$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold-TCVpFMg$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "OptionChainBottomSheetScaffold.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold-TCVpFMg$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof OptionChainBottomSheetScaffoldEvent) {
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
                Event<OptionChainBottomSheetScaffoldEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof OptionChainBottomSheetScaffoldEvent)) {
                    value = null;
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 != companion.getEmpty()) {
                    snapshotMutationPolicy = null;
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(MultiModeSheetState2.Hidden.INSTANCE), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    snapshotMutationPolicy = null;
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                SnapshotState snapshotState12 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                ImmutableList<Integer> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$8 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$8(snapshotState12);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                int i22 = i13;
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new C24189x4821295(snapshotState12, snapshotState, snapshotIntState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 != companion.getEmpty()) {
                    objRememberedValue6 = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                snapshotState2 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 != companion.getEmpty()) {
                    snapshotState3 = snapshotState12;
                    objRememberedValue7 = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    snapshotState3 = snapshotState12;
                }
                SnapshotState snapshotState13 = (SnapshotState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                ImmutableList<Integer> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$15 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$15(snapshotState13);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new C24190x4821656(snapshotState13, snapshotState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$15, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 != companion.getEmpty()) {
                    objRememberedValue9 = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                snapshotState4 = (SnapshotState) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 != companion.getEmpty()) {
                    snapshotState5 = snapshotState13;
                    objRememberedValue10 = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    snapshotState5 = snapshotState13;
                }
                SnapshotState snapshotState14 = (SnapshotState) objRememberedValue10;
                composerStartRestartGroup.endReplaceGroup();
                ImmutableList<Integer> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$22 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$22(snapshotState14);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new C24191x4821a17(snapshotState14, snapshotState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 != companion.getEmpty()) {
                    objRememberedValue12 = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                snapshotState6 = (SnapshotState) objRememberedValue12;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 != companion.getEmpty()) {
                    snapshotState7 = snapshotState14;
                    objRememberedValue13 = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                } else {
                    snapshotState7 = snapshotState14;
                }
                final SnapshotState snapshotState15 = (SnapshotState) objRememberedValue13;
                composerStartRestartGroup.endReplaceGroup();
                ImmutableList<Integer> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$29 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$29(snapshotState15);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue14 == companion.getEmpty()) {
                    objRememberedValue14 = new C24192x4821dd8(snapshotState15, snapshotState6, snapshotIntState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$29, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue15 == companion.getEmpty()) {
                    objRememberedValue15 = SnapshotState3.mutableStateOf$default(OptionChainBottomSheetState.READY, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                snapshotState8 = (SnapshotState) objRememberedValue15;
                composerStartRestartGroup.endReplaceGroup();
                z2 = fromOptionOrderBundle == null && (optionOrderBundle = fromOptionOrderBundle.getOptionOrderBundle()) != null && (legBundles = optionOrderBundle.getLegBundles()) != null && (legBundles.isEmpty() ^ true);
                z3 = !z2 && z;
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, fromOptionOrderBundle == null ? OptionsContext2.toOptionContext(fromOptionOrderBundle) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.STICKY_BOTTOM_SHEET, "options-order-cart", null, 4, null), null, 37, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue16 != companion.getEmpty()) {
                    snapshotMutationPolicy2 = null;
                    i15 = 2;
                    objMutableStateOf$default = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                } else {
                    snapshotMutationPolicy2 = null;
                    i15 = 2;
                    objMutableStateOf$default = objRememberedValue16;
                }
                snapshotState9 = (SnapshotState) objMutableStateOf$default;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue17 == companion.getEmpty()) {
                    objRememberedValue17 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, i15, snapshotMutationPolicy2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                }
                snapshotState10 = (SnapshotState) objRememberedValue17;
                composerStartRestartGroup.endReplaceGroup();
                OptionChainBottomSheetState optionChainBottomSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$33 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$33(snapshotState8);
                ImmutableList<MultiModeSheetState2> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$5 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(optionChainBottomSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$33.ordinal()) | composerStartRestartGroup.changed(z2) | composerStartRestartGroup.changed(immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$5);
                objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue18 == companion.getEmpty()) {
                    final boolean z5 = z2;
                    snapshotState11 = snapshotState;
                    density2 = density;
                    z4 = z5;
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    objRememberedValue18 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$43$lambda$42(density, z5, snapshotState8, snapshotState11, snapshotState2, snapshotState4, snapshotState6, function13, userInteractionEventDescriptor, current, snapshotState9, snapshotState10);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                } else {
                    z4 = z2;
                    snapshotState11 = snapshotState;
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    density2 = density;
                }
                snapshotState42 = (SnapshotState4) objRememberedValue18;
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr = {Boolean.valueOf(z4), Boolean.valueOf(z3), OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(snapshotState11), OptionChainBottomSheetScaffold_TCVpFMg$lambda$33(snapshotState8)};
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged2 = composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(snapshotState42) | composerStartRestartGroup.changed(z4);
                objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue19 == companion.getEmpty()) {
                    objRememberedValue19 = new C24193x4822199(z3, z4, snapshotState11, snapshotState42, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue19, composerStartRestartGroup, 0);
                MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState = MultiModeBottomSheetScaffoldKt.rememberMultiModeBottomSheetScaffoldState(OptionChainBottomSheetScaffold_TCVpFMg$lambda$44(snapshotState42), null, composerStartRestartGroup, MultiModeSheetState.$stable, 2);
                fMo5016toPx0680j_4 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(30));
                Boolean boolValueOf = Boolean.valueOf(z4);
                ImmutableList<MultiModeSheetState2> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$52 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(snapshotState11);
                Event<OptionChainBottomSheetScaffoldEvent> eventOptionChainBottomSheetScaffold_TCVpFMg$lambda$0 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged3 = composerStartRestartGroup.changed(z4) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(snapshotState42) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changedInstance(optionChainBottomSheetScaffoldDuxo2);
                objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue20 == companion.getEmpty()) {
                    coroutineScope2 = coroutineScope;
                    OptionChainBottomSheetScaffoldDuxo optionChainBottomSheetScaffoldDuxo5 = optionChainBottomSheetScaffoldDuxo2;
                    objRememberedValue20 = new C24194x482255a(z4, snapshotState8, snapshotState4CollectAsStateWithLifecycle, coroutineScope2, fMo5016toPx0680j_4, optionChainBottomSheetScaffoldDuxo5, snapshotState42, null);
                    optionChainBottomSheetScaffoldDuxo3 = optionChainBottomSheetScaffoldDuxo5;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                } else {
                    coroutineScope2 = coroutineScope;
                    optionChainBottomSheetScaffoldDuxo3 = optionChainBottomSheetScaffoldDuxo2;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$52, eventOptionChainBottomSheetScaffold_TCVpFMg$lambda$0, (Function2) objRememberedValue20, composerStartRestartGroup, MultiModeSheetState2.$stable << 3);
                fMo5016toPx0680j_42 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(12));
                fMo5016toPx0680j_43 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(24));
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i23 = BentoTheme.$stable;
                jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i23).m21373getBg30d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                isDay = bentoTheme.getColors(composerStartRestartGroup, i23).getIsDay();
                composerStartRestartGroup.startReplaceGroup(2066015382);
                long jM21371getBg0d7_KjU = !isDay ? bentoTheme.getColors(composerStartRestartGroup, i23).m21371getBg0d7_KjU() : Color2.Color(4279308561L);
                composerStartRestartGroup.endReplaceGroup();
                long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i23).m21425getFg0d7_KjU();
                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i23).m21425getFg0d7_KjU();
                final SnapshotState snapshotState16 = snapshotState3;
                final long j = jM21371getBg0d7_KjU;
                final OptionDefaultPricingState optionDefaultPricingState3 = optionDefaultPricingState2;
                final SnapshotState snapshotState17 = snapshotState5;
                final SnapshotState snapshotState18 = snapshotState11;
                int i24 = i14;
                final CoroutineScope coroutineScope3 = coroutineScope2;
                Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function37 = function33;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-973428367, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 MultiModeBottomSheetScaffold, Composer composer3, int i25) {
                        final OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle2;
                        Intrinsics.checkNotNullParameter(MultiModeBottomSheetScaffold, "$this$MultiModeBottomSheetScaffold");
                        if ((i25 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-973428367, i25, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffold.<anonymous> (OptionChainBottomSheetScaffold.kt:270)");
                        }
                        final String str2 = str;
                        if (str2 != null && (fromOptionOrderBundle2 = fromOptionOrderBundle) != null) {
                            UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                            final OptionDefaultPricingState optionDefaultPricingState4 = optionDefaultPricingState3;
                            final Function1<Intent, Unit> function16 = onLaunchOrderForm;
                            final Screen.Name name = screenName;
                            final long j2 = j;
                            final CoroutineScope coroutineScope4 = coroutineScope3;
                            final SnapshotState4<MultiModeSheetState> snapshotState43 = snapshotState42;
                            final Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function38 = function33;
                            final SnapshotState<OptionChainBottomSheetExpandState> snapshotState19 = snapshotState10;
                            final SnapshotState<MultiModeSheetState2> snapshotState20 = snapshotState9;
                            final SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState21 = snapshotState18;
                            final SnapshotState<ImmutableList<Integer>> snapshotState22 = snapshotState16;
                            final SnapshotState<ImmutableList<Integer>> snapshotState23 = snapshotState17;
                            final SnapshotState<ImmutableList<Integer>> snapshotState24 = snapshotState7;
                            final SnapshotState<ImmutableList<Integer>> snapshotState25 = snapshotState15;
                            final SnapshotState<OptionChainBottomSheetState> snapshotState26 = snapshotState8;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor3, ComposableLambda3.rememberComposableLambda(1674407403, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7.1

                                /* compiled from: OptionChainBottomSheetScaffold.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C503831 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ String $accountNumber;
                                    final /* synthetic */ long $backgroundColor;
                                    final /* synthetic */ SnapshotState4<MultiModeSheetState> $bottomSheetState$delegate;
                                    final /* synthetic */ SnapshotState<ImmutableList<Integer>> $chartErrorSectionHeight$delegate;
                                    final /* synthetic */ SnapshotState<MultiModeSheetState2> $currentBottomSheetValue$delegate;
                                    final /* synthetic */ OptionDefaultPricingState $defaultPricingState;
                                    final /* synthetic */ SnapshotState<ImmutableList<Integer>> $errorSectionHeight$delegate;
                                    final /* synthetic */ SnapshotState<OptionChainBottomSheetExpandState> $expandState$delegate;
                                    final /* synthetic */ SnapshotState<ImmutableList<Integer>> $noQuoteSectionHeight$delegate;
                                    final /* synthetic */ Function1<Intent, Unit> $onLaunchOrderForm;
                                    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onWatchlistButtonTapped;
                                    final /* synthetic */ SnapshotState<OptionChainBottomSheetState> $optionChainBottomSheetState$delegate;
                                    final /* synthetic */ OptionOrderIntentKey.FromOptionOrderBundle $orderIntentKey;
                                    final /* synthetic */ CoroutineScope $scope;
                                    final /* synthetic */ Screen.Name $screenName;
                                    final /* synthetic */ SnapshotState<ImmutableList<Integer>> $sectionHeight$delegate;
                                    final /* synthetic */ SnapshotState<ImmutableList<MultiModeSheetState2>> $sheetValues$delegate;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    C503831(String str, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, OptionDefaultPricingState optionDefaultPricingState, Function1<? super Intent, Unit> function1, Screen.Name name, long j, CoroutineScope coroutineScope, SnapshotState4<MultiModeSheetState> snapshotState4, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, SnapshotState<OptionChainBottomSheetExpandState> snapshotState, SnapshotState<MultiModeSheetState2> snapshotState2, SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState3, SnapshotState<ImmutableList<Integer>> snapshotState5, SnapshotState<ImmutableList<Integer>> snapshotState6, SnapshotState<ImmutableList<Integer>> snapshotState7, SnapshotState<ImmutableList<Integer>> snapshotState8, SnapshotState<OptionChainBottomSheetState> snapshotState9) {
                                        this.$accountNumber = str;
                                        this.$orderIntentKey = fromOptionOrderBundle;
                                        this.$defaultPricingState = optionDefaultPricingState;
                                        this.$onLaunchOrderForm = function1;
                                        this.$screenName = name;
                                        this.$backgroundColor = j;
                                        this.$scope = coroutineScope;
                                        this.$bottomSheetState$delegate = snapshotState4;
                                        this.$onWatchlistButtonTapped = function3;
                                        this.$expandState$delegate = snapshotState;
                                        this.$currentBottomSheetValue$delegate = snapshotState2;
                                        this.$sheetValues$delegate = snapshotState3;
                                        this.$sectionHeight$delegate = snapshotState5;
                                        this.$errorSectionHeight$delegate = snapshotState6;
                                        this.$noQuoteSectionHeight$delegate = snapshotState7;
                                        this.$chartErrorSectionHeight$delegate = snapshotState8;
                                        this.$optionChainBottomSheetState$delegate = snapshotState9;
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
                                            ComposerKt.traceEventStart(1445584291, i, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (OptionChainBottomSheetScaffold.kt:275)");
                                        }
                                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, false, false, null, 125, null);
                                        OptionChainBottomSheetExpandState optionChainBottomSheetExpandStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$39 = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$39(this.$expandState$delegate);
                                        boolean z = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$36(this.$currentBottomSheetValue$delegate) == null || (OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$36(this.$currentBottomSheetValue$delegate) instanceof MultiModeSheetState2.Hidden);
                                        String str = this.$accountNumber;
                                        OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle = this.$orderIntentKey;
                                        OptionDefaultPricingState optionDefaultPricingState = this.$defaultPricingState;
                                        Function1<Intent, Unit> function1 = this.$onLaunchOrderForm;
                                        Screen.Name name = this.$screenName;
                                        long j = this.$backgroundColor;
                                        composer.startReplaceGroup(-1224400529);
                                        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changed(this.$bottomSheetState$delegate);
                                        final CoroutineScope coroutineScope = this.$scope;
                                        final SnapshotState<MultiModeSheetState2> snapshotState = this.$currentBottomSheetValue$delegate;
                                        final SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState2 = this.$sheetValues$delegate;
                                        final SnapshotState4<MultiModeSheetState> snapshotState4 = this.$bottomSheetState$delegate;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0093: CONSTRUCTOR (r3v5 'objRememberedValue' java.lang.Object) = 
                                                  (r13v3 'coroutineScope' kotlinx.coroutines.CoroutineScope A[DONT_INLINE])
                                                  (r14v1 'snapshotState' androidx.compose.runtime.MutableState<com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetValue> A[DONT_INLINE])
                                                  (r15v1 'snapshotState2' androidx.compose.runtime.MutableState<kotlinx.collections.immutable.ImmutableList<com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetValue>> A[DONT_INLINE])
                                                  (r2v8 'snapshotState4' androidx.compose.runtime.State<com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState> A[DONT_INLINE])
                                                 A[MD:(kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.State):void (m)] (LINE:299) call: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7$1$1$$ExternalSyntheticLambda0.<init>(kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.State):void type: CONSTRUCTOR in method: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold.7.1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes11.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 25 more
                                                */
                                            /*
                                                Method dump skipped, instructions count: 364
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.optionschain.bottomsheet.C24196x1c3df00e.AnonymousClass1.C503831.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, ImmutableList heights) {
                                            Intrinsics.checkNotNullParameter(heights, "heights");
                                            snapshotState.setValue(heights);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState, ImmutableList heights) {
                                            Intrinsics.checkNotNullParameter(heights, "heights");
                                            snapshotState.setValue(heights);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$7$lambda$6(SnapshotState snapshotState, ImmutableList heights) {
                                            Intrinsics.checkNotNullParameter(heights, "heights");
                                            snapshotState.setValue(heights);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$9$lambda$8(SnapshotState snapshotState, ImmutableList heights) {
                                            Intrinsics.checkNotNullParameter(heights, "heights");
                                            snapshotState.setValue(heights);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$11$lambda$10(SnapshotState snapshotState, OptionChainBottomSheetState it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            snapshotState.setValue(it);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState4 snapshotState4) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C24197xf76e94cf(snapshotState, snapshotState2, snapshotState4, null), 3, null);
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i26) {
                                        if ((i26 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1674407403, i26, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffold.<anonymous>.<anonymous> (OptionChainBottomSheetScaffold.kt:274)");
                                        }
                                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, BentoTheme4.POSITIVE, ComposableLambda3.rememberComposableLambda(1445584291, true, new C503831(str2, fromOptionOrderBundle2, optionDefaultPricingState4, function16, name, j2, coroutineScope4, snapshotState43, function38, snapshotState19, snapshotState20, snapshotState21, snapshotState22, snapshotState23, snapshotState24, snapshotState25, snapshotState26), composer4, 54), composer4, 113246208, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 48);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged4 = composerStartRestartGroup.changed(isDay) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changed(jM6705copywmQWz5c$default);
                    objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged4 || objRememberedValue21 == companion.getEmpty()) {
                        objRememberedValue21 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$52$lambda$51(isDay, fMo5016toPx0680j_43, fMo5016toPx0680j_42, jM6705copywmQWz5c$default, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                    Modifier modifier6 = modifier3;
                    float f4 = f2;
                    Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function38 = lambda$1339730988$feature_options_chain_externalDebug;
                    MultiModeBottomSheetScaffoldKt.m24809MultiModeBottomSheetScaffoldA036w5U(composableLambdaRememberComposableLambda, modifier6, multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState, 0.0f, null, f4, j, jM21425getFg0d7_KjU2, 0.0f, 0.0f, (Function1) objRememberedValue21, ComposableLambda3.rememberComposableLambda(-2002035287, true, new C24198x1c3df010(snapshotIntState2), composerStartRestartGroup, 54), false, function25, null, jM6725getTransparent0d7_KjU, jM21425getFg0d7_KjU, function38, composerStartRestartGroup, ((i22 >> 15) & 112) | 6 | ((i22 >> 9) & 458752), ((i22 >> 18) & 7168) | 196656 | ((i24 << 15) & 29360128), 21272);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function34 = function37;
                    modifier4 = modifier6;
                    f3 = f4;
                    composer2 = composerStartRestartGroup;
                    function23 = function25;
                    function35 = function38;
                    optionChainBottomSheetScaffoldDuxo4 = optionChainBottomSheetScaffoldDuxo3;
                    function14 = function13;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$53(str, optionDefaultPricingState, fromOptionOrderBundle, onLaunchOrderForm, screenName, z, modifier4, optionChainBottomSheetScaffoldDuxo4, f3, function23, function34, function14, function35, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i9 |= 384;
            if ((i6 & 306783379) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    i13 = i6;
                    function33 = function36;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue;
                    final Flow eventFlow2 = optionChainBottomSheetScaffoldDuxo2.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold-TCVpFMg$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold-TCVpFMg$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold-TCVpFMg$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "OptionChainBottomSheetScaffold.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold-TCVpFMg$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof OptionChainBottomSheetScaffoldEvent) {
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
                    Event<OptionChainBottomSheetScaffoldEvent> value2 = eventFlow2.getValue();
                    event = value2;
                    if (!((event == null ? event.getData() : null) instanceof OptionChainBottomSheetScaffoldEvent)) {
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 != companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState122 = (SnapshotState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList<Integer> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$82 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$8(snapshotState122);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    int i222 = i13;
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$82, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 != companion.getEmpty()) {
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 != companion.getEmpty()) {
                    }
                    SnapshotState snapshotState132 = (SnapshotState) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList<Integer> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$152 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$15(snapshotState132);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$152, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 != companion.getEmpty()) {
                    }
                    snapshotState4 = (SnapshotState) objRememberedValue9;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 != companion.getEmpty()) {
                    }
                    SnapshotState snapshotState142 = (SnapshotState) objRememberedValue10;
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList<Integer> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$222 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$22(snapshotState142);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue12 != companion.getEmpty()) {
                    }
                    snapshotState6 = (SnapshotState) objRememberedValue12;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue13 != companion.getEmpty()) {
                    }
                    final SnapshotState<ImmutableList<Integer>> snapshotState152 = (SnapshotState) objRememberedValue13;
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList<Integer> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$292 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$29(snapshotState152);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue14 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$292, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue15 == companion.getEmpty()) {
                    }
                    snapshotState8 = (SnapshotState) objRememberedValue15;
                    composerStartRestartGroup.endReplaceGroup();
                    if (fromOptionOrderBundle == null) {
                        if (z2) {
                            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                            userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, fromOptionOrderBundle == null ? OptionsContext2.toOptionContext(fromOptionOrderBundle) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.STICKY_BOTTOM_SHEET, "options-order-cart", null, 4, null), null, 37, null);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue16 != companion.getEmpty()) {
                            }
                            snapshotState9 = (SnapshotState) objMutableStateOf$default;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue17 == companion.getEmpty()) {
                            }
                            snapshotState10 = (SnapshotState) objRememberedValue17;
                            composerStartRestartGroup.endReplaceGroup();
                            OptionChainBottomSheetState optionChainBottomSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$332 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$33(snapshotState8);
                            ImmutableList<MultiModeSheetState2> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$53 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(snapshotState);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChanged = composerStartRestartGroup.changed(optionChainBottomSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$332.ordinal()) | composerStartRestartGroup.changed(z2) | composerStartRestartGroup.changed(immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$53);
                            objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                final boolean z52 = z2;
                                snapshotState11 = snapshotState;
                                density2 = density;
                                z4 = z52;
                                userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                                objRememberedValue18 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$43$lambda$42(density, z52, snapshotState8, snapshotState11, snapshotState2, snapshotState4, snapshotState6, function13, userInteractionEventDescriptor, current, snapshotState9, snapshotState10);
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                                snapshotState42 = (SnapshotState4) objRememberedValue18;
                                composerStartRestartGroup.endReplaceGroup();
                                Object[] objArr2 = {Boolean.valueOf(z4), Boolean.valueOf(z3), OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(snapshotState11), OptionChainBottomSheetScaffold_TCVpFMg$lambda$33(snapshotState8)};
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChanged2 = composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(snapshotState42) | composerStartRestartGroup.changed(z4);
                                objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue19 = new C24193x4822199(z3, z4, snapshotState11, snapshotState42, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue19, composerStartRestartGroup, 0);
                                    MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState2 = MultiModeBottomSheetScaffoldKt.rememberMultiModeBottomSheetScaffoldState(OptionChainBottomSheetScaffold_TCVpFMg$lambda$44(snapshotState42), null, composerStartRestartGroup, MultiModeSheetState.$stable, 2);
                                    fMo5016toPx0680j_4 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(30));
                                    Boolean boolValueOf2 = Boolean.valueOf(z4);
                                    ImmutableList<MultiModeSheetState2> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$522 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(snapshotState11);
                                    Event<OptionChainBottomSheetScaffoldEvent> eventOptionChainBottomSheetScaffold_TCVpFMg$lambda$02 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    zChanged3 = composerStartRestartGroup.changed(z4) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(snapshotState42) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changedInstance(optionChainBottomSheetScaffoldDuxo2);
                                    objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged3) {
                                        coroutineScope2 = coroutineScope;
                                        OptionChainBottomSheetScaffoldDuxo optionChainBottomSheetScaffoldDuxo52 = optionChainBottomSheetScaffoldDuxo2;
                                        objRememberedValue20 = new C24194x482255a(z4, snapshotState8, snapshotState4CollectAsStateWithLifecycle, coroutineScope2, fMo5016toPx0680j_4, optionChainBottomSheetScaffoldDuxo52, snapshotState42, null);
                                        optionChainBottomSheetScaffoldDuxo3 = optionChainBottomSheetScaffoldDuxo52;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf2, immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$522, eventOptionChainBottomSheetScaffold_TCVpFMg$lambda$02, (Function2) objRememberedValue20, composerStartRestartGroup, MultiModeSheetState2.$stable << 3);
                                        fMo5016toPx0680j_42 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(12));
                                        fMo5016toPx0680j_43 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(24));
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i232 = BentoTheme.$stable;
                                        jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i232).m21373getBg30d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                                        isDay = bentoTheme2.getColors(composerStartRestartGroup, i232).getIsDay();
                                        composerStartRestartGroup.startReplaceGroup(2066015382);
                                        if (!isDay) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        long jM6725getTransparent0d7_KjU2 = Color.INSTANCE.m6725getTransparent0d7_KjU();
                                        long jM21425getFg0d7_KjU3 = bentoTheme2.getColors(composerStartRestartGroup, i232).m21425getFg0d7_KjU();
                                        long jM21425getFg0d7_KjU22 = bentoTheme2.getColors(composerStartRestartGroup, i232).m21425getFg0d7_KjU();
                                        final SnapshotState<ImmutableList<Integer>> snapshotState162 = snapshotState3;
                                        final long j2 = jM21371getBg0d7_KjU;
                                        final OptionDefaultPricingState optionDefaultPricingState32 = optionDefaultPricingState2;
                                        final SnapshotState<ImmutableList<Integer>> snapshotState172 = snapshotState5;
                                        final SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState182 = snapshotState11;
                                        int i242 = i14;
                                        final CoroutineScope coroutineScope32 = coroutineScope2;
                                        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function372 = function33;
                                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-973428367, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                                invoke(column5, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Column5 MultiModeBottomSheetScaffold, Composer composer3, int i25) {
                                                final OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle2;
                                                Intrinsics.checkNotNullParameter(MultiModeBottomSheetScaffold, "$this$MultiModeBottomSheetScaffold");
                                                if ((i25 & 17) == 16 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-973428367, i25, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffold.<anonymous> (OptionChainBottomSheetScaffold.kt:270)");
                                                }
                                                final String str2 = str;
                                                if (str2 != null && (fromOptionOrderBundle2 = fromOptionOrderBundle) != null) {
                                                    UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                                                    final OptionDefaultPricingState optionDefaultPricingState4 = optionDefaultPricingState32;
                                                    final Function1<? super Intent, Unit> function16 = onLaunchOrderForm;
                                                    final Screen.Name name = screenName;
                                                    final long j22 = j2;
                                                    final CoroutineScope coroutineScope4 = coroutineScope32;
                                                    final SnapshotState4<MultiModeSheetState> snapshotState43 = snapshotState42;
                                                    final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function382 = function33;
                                                    final SnapshotState<OptionChainBottomSheetExpandState> snapshotState19 = snapshotState10;
                                                    final SnapshotState<MultiModeSheetState2> snapshotState20 = snapshotState9;
                                                    final SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState21 = snapshotState182;
                                                    final SnapshotState<ImmutableList<Integer>> snapshotState22 = snapshotState162;
                                                    final SnapshotState<ImmutableList<Integer>> snapshotState23 = snapshotState172;
                                                    final SnapshotState<ImmutableList<Integer>> snapshotState24 = snapshotState7;
                                                    final SnapshotState<ImmutableList<Integer>> snapshotState25 = snapshotState152;
                                                    final SnapshotState<OptionChainBottomSheetState> snapshotState26 = snapshotState8;
                                                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor3, ComposableLambda3.rememberComposableLambda(1674407403, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7.1

                                                        /* compiled from: OptionChainBottomSheetScaffold.kt */
                                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                        @SourceDebugExtension
                                                        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7$1$1, reason: invalid class name and collision with other inner class name */
                                                        static final class C503831 implements Function2<Composer, Integer, Unit> {
                                                            final /* synthetic */ String $accountNumber;
                                                            final /* synthetic */ long $backgroundColor;
                                                            final /* synthetic */ SnapshotState4<MultiModeSheetState> $bottomSheetState$delegate;
                                                            final /* synthetic */ SnapshotState<ImmutableList<Integer>> $chartErrorSectionHeight$delegate;
                                                            final /* synthetic */ SnapshotState<MultiModeSheetState2> $currentBottomSheetValue$delegate;
                                                            final /* synthetic */ OptionDefaultPricingState $defaultPricingState;
                                                            final /* synthetic */ SnapshotState<ImmutableList<Integer>> $errorSectionHeight$delegate;
                                                            final /* synthetic */ SnapshotState<OptionChainBottomSheetExpandState> $expandState$delegate;
                                                            final /* synthetic */ SnapshotState<ImmutableList<Integer>> $noQuoteSectionHeight$delegate;
                                                            final /* synthetic */ Function1<Intent, Unit> $onLaunchOrderForm;
                                                            final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onWatchlistButtonTapped;
                                                            final /* synthetic */ SnapshotState<OptionChainBottomSheetState> $optionChainBottomSheetState$delegate;
                                                            final /* synthetic */ OptionOrderIntentKey.FromOptionOrderBundle $orderIntentKey;
                                                            final /* synthetic */ CoroutineScope $scope;
                                                            final /* synthetic */ Screen.Name $screenName;
                                                            final /* synthetic */ SnapshotState<ImmutableList<Integer>> $sectionHeight$delegate;
                                                            final /* synthetic */ SnapshotState<ImmutableList<MultiModeSheetState2>> $sheetValues$delegate;

                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            C503831(String str, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, OptionDefaultPricingState optionDefaultPricingState, Function1<? super Intent, Unit> function1, Screen.Name name, long j, CoroutineScope coroutineScope, SnapshotState4<MultiModeSheetState> snapshotState4, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, SnapshotState<OptionChainBottomSheetExpandState> snapshotState, SnapshotState<MultiModeSheetState2> snapshotState2, SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState3, SnapshotState<ImmutableList<Integer>> snapshotState5, SnapshotState<ImmutableList<Integer>> snapshotState6, SnapshotState<ImmutableList<Integer>> snapshotState7, SnapshotState<ImmutableList<Integer>> snapshotState8, SnapshotState<OptionChainBottomSheetState> snapshotState9) {
                                                                this.$accountNumber = str;
                                                                this.$orderIntentKey = fromOptionOrderBundle;
                                                                this.$defaultPricingState = optionDefaultPricingState;
                                                                this.$onLaunchOrderForm = function1;
                                                                this.$screenName = name;
                                                                this.$backgroundColor = j;
                                                                this.$scope = coroutineScope;
                                                                this.$bottomSheetState$delegate = snapshotState4;
                                                                this.$onWatchlistButtonTapped = function3;
                                                                this.$expandState$delegate = snapshotState;
                                                                this.$currentBottomSheetValue$delegate = snapshotState2;
                                                                this.$sheetValues$delegate = snapshotState3;
                                                                this.$sectionHeight$delegate = snapshotState5;
                                                                this.$errorSectionHeight$delegate = snapshotState6;
                                                                this.$noQuoteSectionHeight$delegate = snapshotState7;
                                                                this.$chartErrorSectionHeight$delegate = snapshotState8;
                                                                this.$optionChainBottomSheetState$delegate = snapshotState9;
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                                                invoke(composer, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            /*  JADX ERROR: Method code generation error
                                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0093: CONSTRUCTOR (r3v5 'objRememberedValue' java.lang.Object) = 
                                                                  (r13v3 'coroutineScope' kotlinx.coroutines.CoroutineScope A[DONT_INLINE])
                                                                  (r14v1 'snapshotState' androidx.compose.runtime.MutableState<com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetValue> A[DONT_INLINE])
                                                                  (r15v1 'snapshotState2' androidx.compose.runtime.MutableState<kotlinx.collections.immutable.ImmutableList<com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetValue>> A[DONT_INLINE])
                                                                  (r2v8 'snapshotState4' androidx.compose.runtime.State<com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState> A[DONT_INLINE])
                                                                 A[MD:(kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.State):void (m)] (LINE:299) call: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7$1$1$$ExternalSyntheticLambda0.<init>(kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.State):void type: CONSTRUCTOR in method: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold.7.1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes11.dex
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                                	... 20 more
                                                                */
                                                            public final void invoke(androidx.compose.runtime.Composer r24, int r25) {
                                                                /*
                                                                    Method dump skipped, instructions count: 364
                                                                    To view this dump add '--comments-level debug' option
                                                                */
                                                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.optionschain.bottomsheet.C24196x1c3df00e.AnonymousClass1.C503831.invoke(androidx.compose.runtime.Composer, int):void");
                                                            }

                                                            /* JADX INFO: Access modifiers changed from: private */
                                                            public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, ImmutableList heights) {
                                                                Intrinsics.checkNotNullParameter(heights, "heights");
                                                                snapshotState.setValue(heights);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* JADX INFO: Access modifiers changed from: private */
                                                            public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState, ImmutableList heights) {
                                                                Intrinsics.checkNotNullParameter(heights, "heights");
                                                                snapshotState.setValue(heights);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* JADX INFO: Access modifiers changed from: private */
                                                            public static final Unit invoke$lambda$7$lambda$6(SnapshotState snapshotState, ImmutableList heights) {
                                                                Intrinsics.checkNotNullParameter(heights, "heights");
                                                                snapshotState.setValue(heights);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* JADX INFO: Access modifiers changed from: private */
                                                            public static final Unit invoke$lambda$9$lambda$8(SnapshotState snapshotState, ImmutableList heights) {
                                                                Intrinsics.checkNotNullParameter(heights, "heights");
                                                                snapshotState.setValue(heights);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* JADX INFO: Access modifiers changed from: private */
                                                            public static final Unit invoke$lambda$11$lambda$10(SnapshotState snapshotState, OptionChainBottomSheetState it) {
                                                                Intrinsics.checkNotNullParameter(it, "it");
                                                                snapshotState.setValue(it);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* JADX INFO: Access modifiers changed from: private */
                                                            public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState4 snapshotState4) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C24197xf76e94cf(snapshotState, snapshotState2, snapshotState4, null), 3, null);
                                                                return Unit.INSTANCE;
                                                            }
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer4, int i26) {
                                                            if ((i26 & 3) == 2 && composer4.getSkipping()) {
                                                                composer4.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1674407403, i26, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffold.<anonymous>.<anonymous> (OptionChainBottomSheetScaffold.kt:274)");
                                                            }
                                                            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, BentoTheme4.POSITIVE, ComposableLambda3.rememberComposableLambda(1445584291, true, new C503831(str2, fromOptionOrderBundle2, optionDefaultPricingState4, function16, name, j22, coroutineScope4, snapshotState43, function382, snapshotState19, snapshotState20, snapshotState21, snapshotState22, snapshotState23, snapshotState24, snapshotState25, snapshotState26), composer4, 54), composer4, 113246208, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer3, 54), composer3, 48);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54);
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        zChanged4 = composerStartRestartGroup.changed(isDay) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changed(jM6705copywmQWz5c$default);
                                        objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged4) {
                                            objRememberedValue21 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$52$lambda$51(isDay, fMo5016toPx0680j_43, fMo5016toPx0680j_42, jM6705copywmQWz5c$default, (DrawScope) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                                            composerStartRestartGroup.endReplaceGroup();
                                            Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                                            Modifier modifier62 = modifier3;
                                            float f42 = f2;
                                            Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function382 = lambda$1339730988$feature_options_chain_externalDebug;
                                            MultiModeBottomSheetScaffoldKt.m24809MultiModeBottomSheetScaffoldA036w5U(composableLambdaRememberComposableLambda2, modifier62, multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState2, 0.0f, null, f42, j2, jM21425getFg0d7_KjU22, 0.0f, 0.0f, (Function1) objRememberedValue21, ComposableLambda3.rememberComposableLambda(-2002035287, true, new C24198x1c3df010(snapshotIntState22), composerStartRestartGroup, 54), false, function252, null, jM6725getTransparent0d7_KjU2, jM21425getFg0d7_KjU3, function382, composerStartRestartGroup, ((i222 >> 15) & 112) | 6 | ((i222 >> 9) & 458752), ((i222 >> 18) & 7168) | 196656 | ((i242 << 15) & 29360128), 21272);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function34 = function372;
                                            modifier4 = modifier62;
                                            f3 = f42;
                                            composer2 = composerStartRestartGroup;
                                            function23 = function252;
                                            function35 = function382;
                                            optionChainBottomSheetScaffoldDuxo4 = optionChainBottomSheetScaffoldDuxo3;
                                            function14 = function13;
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
        public static final Event<OptionChainBottomSheetScaffoldEvent> OptionChainBottomSheetScaffold_TCVpFMg$lambda$0(SnapshotState4<Event<OptionChainBottomSheetScaffoldEvent>> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImmutableList<MultiModeSheetState2> OptionChainBottomSheetScaffold_TCVpFMg$lambda$12(SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImmutableList<Integer> OptionChainBottomSheetScaffold_TCVpFMg$lambda$15(SnapshotState<ImmutableList<Integer>> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImmutableList<MultiModeSheetState2> OptionChainBottomSheetScaffold_TCVpFMg$lambda$19(SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImmutableList<Integer> OptionChainBottomSheetScaffold_TCVpFMg$lambda$22(SnapshotState<ImmutableList<Integer>> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImmutableList<MultiModeSheetState2> OptionChainBottomSheetScaffold_TCVpFMg$lambda$26(SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImmutableList<Integer> OptionChainBottomSheetScaffold_TCVpFMg$lambda$29(SnapshotState<ImmutableList<Integer>> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionChainBottomSheetState OptionChainBottomSheetScaffold_TCVpFMg$lambda$33(SnapshotState<OptionChainBottomSheetState> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MultiModeSheetState2 OptionChainBottomSheetScaffold_TCVpFMg$lambda$36(SnapshotState<MultiModeSheetState2> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionChainBottomSheetExpandState OptionChainBottomSheetScaffold_TCVpFMg$lambda$39(SnapshotState<OptionChainBottomSheetExpandState> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MultiModeSheetState OptionChainBottomSheetScaffold_TCVpFMg$lambda$44(SnapshotState4<MultiModeSheetState> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImmutableList<MultiModeSheetState2> OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImmutableList<Integer> OptionChainBottomSheetScaffold_TCVpFMg$lambda$8(SnapshotState<ImmutableList<Integer>> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MultiModeSheetState OptionChainBottomSheetScaffold_TCVpFMg$lambda$43$lambda$42(Density density, boolean z, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5, final Function1 function1, final UserInteractionEventDescriptor userInteractionEventDescriptor, final EventLogger eventLogger, final SnapshotState snapshotState6, final SnapshotState snapshotState7) {
            ImmutableList<MultiModeSheetState2> immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$5;
            MultiModeSheetState2 multiModeSheetState2;
            int i = WhenMappings.$EnumSwitchMapping$0[OptionChainBottomSheetScaffold_TCVpFMg$lambda$33(snapshotState).ordinal()];
            if (i == 1) {
                immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$5 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(snapshotState2);
            } else if (i == 2) {
                immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$5 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$12(snapshotState3);
            } else if (i == 3) {
                immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$5 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$19(snapshotState4);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$5 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$26(snapshotState5);
            }
            final ImmutableList<MultiModeSheetState2> immutableList = immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$5;
            if (z && !immutableList.isEmpty()) {
                multiModeSheetState2 = (MultiModeSheetState2) CollectionsKt.first((List) immutableList);
            } else {
                multiModeSheetState2 = MultiModeSheetState2.Hidden.INSTANCE;
            }
            return new MultiModeSheetState(density, multiModeSheetState2, (!z || immutableList.isEmpty()) ? extensions2.persistentListOf(MultiModeSheetState2.Hidden.INSTANCE) : immutableList, new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(OptionChainBottomSheetScaffoldKt.m2316x11002d9b(function1, immutableList, userInteractionEventDescriptor, eventLogger, snapshotState6, snapshotState7, (MultiModeSheetState2) obj));
                }
            }, (Function1) null, 16, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: OptionChainBottomSheetScaffold_TCVpFMg$lambda$43$lambda$42$lambda$41 */
        public static final boolean m2316x11002d9b(Function1 function1, ImmutableList immutableList, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SnapshotState snapshotState, SnapshotState snapshotState2, MultiModeSheetState2 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            snapshotState.setValue(value);
            if (function1 != null) {
                function1.invoke(value);
            }
            snapshotState2.setValue(OptionChainBottomSheetExpandState.INSTANCE.fromMultiModeSheetValueAndIndex(value, immutableList.indexOf(value)));
            OptionChainBottomSheetExpandState optionChainBottomSheetExpandStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$39 = OptionChainBottomSheetScaffold_TCVpFMg$lambda$39(snapshotState2);
            if (optionChainBottomSheetExpandStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$39 == null) {
                return true;
            }
            EventLogger.DefaultImpls.logSwipe$default(eventLogger, optionChainBottomSheetExpandStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$39.getLoggingAction(), userInteractionEventDescriptor.getScreen(), userInteractionEventDescriptor.getComponent(), null, userInteractionEventDescriptor.getContext(), false, 40, null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit OptionChainBottomSheetScaffold_TCVpFMg$lambda$52$lambda$51(boolean z, float f, float f2, long j, DrawScope MultiModeBottomSheetScaffold) {
            Intrinsics.checkNotNullParameter(MultiModeBottomSheetScaffold, "$this$MultiModeBottomSheetScaffold");
            if (z) {
                Canvas canvas = MultiModeBottomSheetScaffold.getDrawContext().getCanvas();
                Paint Paint = AndroidPaint_androidKt.Paint();
                long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(r3)));
                List listListOf = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.0f), Float.valueOf(0.66f), Float.valueOf(1.0f)});
                Color colorM6701boximpl = Color.m6701boximpl(j);
                Color colorM6701boximpl2 = Color.m6701boximpl(j);
                Color.Companion companion = Color.INSTANCE;
                Shader shaderM6831LinearGradientShaderVjE6UOU$default = androidx.compose.p011ui.graphics.Shader.m6831LinearGradientShaderVjE6UOU$default(jM6535constructorimpl, jM6535constructorimpl2, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, colorM6701boximpl2, Color.m6701boximpl(companion.m6725getTransparent0d7_KjU())}), listListOf, 0, 16, null);
                android.graphics.Paint internalPaint = Paint.getInternalPaint();
                internalPaint.setColor(Color2.m6735toArgb8_81llA(companion.m6716getBlack0d7_KjU()));
                internalPaint.setShader(shaderM6831LinearGradientShaderVjE6UOU$default);
                canvas.drawRect(0.0f, -f2, Float.intBitsToFloat((int) (MultiModeBottomSheetScaffold.mo6963getSizeNHjbRc() >> 32)), f, Paint);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionChainBottomSheetScaffold.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/AnchoredDragScope;", "anchors", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "lastVelocity", "", "offset"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$playNuxAnimation$2", m3645f = "OptionChainBottomSheetScaffold.kt", m3646l = {342, 346, 347}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$playNuxAnimation$2 */
        static final class C241992 extends ContinuationImpl7 implements Function5<AnchoredDragScope, MultiModeDraggableAnchors<MultiModeSheetState2>, Float, Float, Continuation<? super Unit>, Object> {
            final /* synthetic */ float $nuxDistance;
            /* synthetic */ float F$0;
            /* synthetic */ float F$1;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C241992(float f, Continuation<? super C241992> continuation) {
                super(5, continuation);
                this.$nuxDistance = f;
            }

            public final Object invoke(AnchoredDragScope anchoredDragScope, MultiModeDraggableAnchors<MultiModeSheetState2> multiModeDraggableAnchors, float f, float f2, Continuation<? super Unit> continuation) {
                C241992 c241992 = new C241992(this.$nuxDistance, continuation);
                c241992.L$0 = anchoredDragScope;
                c241992.L$1 = multiModeDraggableAnchors;
                c241992.F$0 = f;
                c241992.F$1 = f2;
                return c241992.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, MultiModeDraggableAnchors<MultiModeSheetState2> multiModeDraggableAnchors, Float f, Float f2, Continuation<? super Unit> continuation) {
                return invoke(anchoredDragScope, multiModeDraggableAnchors, f.floatValue(), f2.floatValue(), continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
            
                if (androidx.compose.animation.core.SuspendAnimation.animate(r4, r1, r17, r7, r4, r18) != r6) goto L23;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                float f;
                final AnchoredDragScope anchoredDragScope;
                float f2;
                Ref.FloatRef floatRef;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final AnchoredDragScope anchoredDragScope2 = (AnchoredDragScope) this.L$0;
                    MultiModeDraggableAnchors multiModeDraggableAnchors = (MultiModeDraggableAnchors) this.L$1;
                    float f3 = this.F$0;
                    float f4 = this.F$1;
                    float fMaxAnchor = multiModeDraggableAnchors.maxAnchor();
                    float f5 = fMaxAnchor - this.$nuxDistance;
                    final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.element = f4;
                    SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.707f, 200.0f, null, 4, null);
                    Function2 function2 = new Function2() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$playNuxAnimation$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return OptionChainBottomSheetScaffoldKt.C241992.invokeSuspend$lambda$0(anchoredDragScope2, floatRef2, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.L$0 = anchoredDragScope2;
                    this.L$1 = floatRef2;
                    this.F$0 = f3;
                    this.F$1 = fMaxAnchor;
                    this.label = 1;
                    if (SuspendAnimation.animate(f4, f5, f3, springSpecSpring$default, function2, this) != coroutine_suspended) {
                        f = f3;
                        anchoredDragScope = anchoredDragScope2;
                        f2 = fMaxAnchor;
                        floatRef = floatRef2;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    f2 = this.F$1;
                    f = this.F$0;
                    floatRef = (Ref.FloatRef) this.L$1;
                    anchoredDragScope = (AnchoredDragScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    f2 = this.F$1;
                    f = this.F$0;
                    floatRef = (Ref.FloatRef) this.L$1;
                    anchoredDragScope = (AnchoredDragScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    float f6 = f;
                    float f7 = f2;
                    final Ref.FloatRef floatRef3 = floatRef;
                    float f8 = floatRef3.element;
                    SpringSpec springSpecSpring$default2 = AnimationSpecKt.spring$default(0.707f, 200.0f, null, 4, null);
                    Function2 function22 = new Function2() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$playNuxAnimation$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return OptionChainBottomSheetScaffoldKt.C241992.invokeSuspend$lambda$1(anchoredDragScope, floatRef3, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                }
                this.L$0 = anchoredDragScope;
                this.L$1 = floatRef;
                this.F$0 = f;
                this.F$1 = f2;
                this.label = 2;
                if (DelayKt.delay(300L, this) != coroutine_suspended) {
                    float f62 = f;
                    float f72 = f2;
                    final Ref.FloatRef floatRef32 = floatRef;
                    float f82 = floatRef32.element;
                    SpringSpec springSpecSpring$default22 = AnimationSpecKt.spring$default(0.707f, 200.0f, null, 4, null);
                    Function2 function222 = new Function2() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$playNuxAnimation$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return OptionChainBottomSheetScaffoldKt.C241992.invokeSuspend$lambda$1(anchoredDragScope, floatRef32, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                }
                return coroutine_suspended;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef, float f, float f2) {
                anchoredDragScope.dragTo(f, f2);
                floatRef.element = f;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef, float f, float f2) {
                anchoredDragScope.dragTo(f, f2);
                floatRef.element = f;
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object playNuxAnimation(MultiModeSheetState multiModeSheetState, float f, Continuation<? super Unit> continuation) {
            Object objForceDrag = multiModeSheetState.forceDrag(new C241992(f, null), continuation);
            return objForceDrag == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objForceDrag : Unit.INSTANCE;
        }
    }
