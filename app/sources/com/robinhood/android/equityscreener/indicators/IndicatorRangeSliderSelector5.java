package com.robinhood.android.equityscreener.indicators;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.lib.formats.DefaultNumberFormatter;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.models.serverdriven.experimental.api.SliderAlgorithm;
import com.robinhood.models.serverdriven.experimental.api.SliderValueTruncationMode;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IndicatorRangeSliderSelector.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b*\u00020\u0014H\u0000¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\b*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\bH\u0000\u001a\u0014\u0010\u0018\u001a\u00020\b*\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002\u001a\u0011\u0010\u001d\u001a\u0004\u0018\u00010\b*\u00020\u0014¢\u0006\u0002\u0010\u0015\"\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e²\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010\bX\u008a\u008e\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010\bX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\bX\u008a\u0084\u0002²\u0006\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\bX\u008a\u008e\u0002"}, m3636d2 = {"IndicatorRangeSliderSelector", "", "modifier", "Landroidx/compose/ui/Modifier;", "type", "Lcom/robinhood/android/equityscreener/indicators/DataType;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "sliderAlgorithm", "Lcom/robinhood/models/serverdriven/experimental/api/SliderAlgorithm;", "selectedLow", "selectedHigh", "steps", "truncation", "Lcom/robinhood/models/serverdriven/experimental/api/SliderValueTruncationMode;", "onRangeChanged", "Lkotlin/Function2;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equityscreener/indicators/DataType;Lkotlin/ranges/ClosedFloatingPointRange;Lcom/robinhood/models/serverdriven/experimental/api/SliderAlgorithm;Ljava/lang/Float;Ljava/lang/Float;FLcom/robinhood/models/serverdriven/experimental/api/SliderValueTruncationMode;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "valTextToFloat", "", "(Ljava/lang/String;)Ljava/lang/Float;", "scaleAndNormalize", "scale", "normalizeToSteps", "numberFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getNumberFormatter", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "tryToFloatOrNull", "feature-equity-screener_externalDebug", "currentMin", "currentMax", "finishedRange", "Lcom/robinhood/android/equityscreener/indicators/FinishedRange;", "definedMin", "definedMax", "offset", "absoluteRange", "minValText", "maxValText", "sliderMin", "sliderMax"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class IndicatorRangeSliderSelector5 {
    private static final NumberFormatter numberFormatter;

    /* compiled from: IndicatorRangeSliderSelector.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SliderAlgorithm.values().length];
            try {
                iArr[SliderAlgorithm.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SliderAlgorithm.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SliderAlgorithm.LOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorRangeSliderSelector$lambda$56(Modifier modifier, IndicatorRangeSliderSelector indicatorRangeSliderSelector, Ranges3 ranges3, SliderAlgorithm sliderAlgorithm, Float f, Float f2, float f3, SliderValueTruncationMode sliderValueTruncationMode, Function2 function2, int i, int i2, Composer composer, int i3) {
        IndicatorRangeSliderSelector(modifier, indicatorRangeSliderSelector, ranges3, sliderAlgorithm, f, f2, f3, sliderValueTruncationMode, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IndicatorRangeSliderSelector(final Modifier modifier, final IndicatorRangeSliderSelector type2, final Ranges3<Float> range, final SliderAlgorithm sliderAlgorithm, Float f, Float f2, float f3, final SliderValueTruncationMode sliderValueTruncationMode, final Function2<? super Float, ? super Float, Unit> onRangeChanged, Composer composer, final int i, final int i2) {
        int i3;
        Float f4;
        int i4;
        final Float f5;
        int i5;
        int i6;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        InteractionSource3 interactionSource3;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i7;
        Object objMutableStateOf$default;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final SnapshotState snapshotState2;
        Object objRememberedValue5;
        boolean zChanged;
        Object objRememberedValue6;
        boolean zChanged2;
        Object objRememberedValue7;
        boolean z;
        SnapshotFloatState2 snapshotFloatState2;
        final SnapshotState4 snapshotState4;
        boolean zChanged3;
        Object objRememberedValue8;
        SnapshotFloatState2 snapshotFloatState22;
        boolean zChanged4;
        Object objRememberedValue9;
        SnapshotState4 snapshotState42;
        boolean zChanged5;
        Object objRememberedValue10;
        SnapshotState4 snapshotState43;
        SnapshotState snapshotState3;
        boolean zChanged6;
        SnapshotState snapshotState5;
        int i8;
        Object objMutableStateOf$default2;
        int i9;
        RangeSlider rangeSlider;
        boolean z2;
        Object objRememberedValue11;
        boolean zChangedInstance;
        Object objRememberedValue12;
        final float f6;
        final SnapshotState snapshotState6;
        Composer composer2;
        final SnapshotFloatState2 snapshotFloatState23;
        final SnapshotFloatState2 snapshotFloatState24;
        final SnapshotState4 snapshotState44;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companion2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Modifier modifierM5142padding3ABfNKs;
        int i10;
        int i11;
        int i12;
        boolean zChanged7;
        Object objRememberedValue13;
        float f7;
        Modifier.Companion companion3;
        Modifier modifier2;
        int i13;
        int i14;
        int i15;
        final SnapshotState snapshotState7;
        final SnapshotFloatState2 snapshotFloatState25;
        final SnapshotState snapshotState8;
        final float f8;
        final SnapshotState snapshotState9;
        final SnapshotFloatState2 snapshotFloatState26;
        KeyboardOptions.Companion companion4;
        boolean zChanged8;
        Object objRememberedValue14;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        final float f9;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        float f10;
        Modifier modifierM5142padding3ABfNKs2;
        final SnapshotState snapshotState10;
        boolean zChanged9;
        Object objRememberedValue15;
        float f11;
        KeyboardOptions.Companion companion5;
        Modifier modifier3;
        SnapshotState4 snapshotState45;
        final float f12;
        boolean zChanged10;
        Object objRememberedValue16;
        boolean zChanged11;
        Object objRememberedValue17;
        final SnapshotFloatState2 snapshotFloatState27;
        boolean zChanged12;
        Object objRememberedValue18;
        final SnapshotFloatState2 snapshotFloatState28;
        float f13;
        boolean zChanged13;
        Object objRememberedValue19;
        int i16;
        float f14;
        int i17;
        IndicatorRangeSliderSelector indicatorRangeSliderSelector;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        SliderValueTruncationMode sliderValueTruncationMode2;
        final float f15;
        final Float f16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(sliderAlgorithm, "sliderAlgorithm");
        Intrinsics.checkNotNullParameter(onRangeChanged, "onRangeChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1771507208);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(type2.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(range) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(sliderAlgorithm.ordinal()) ? 2048 : 1024;
        }
        int i18 = i2 & 16;
        if (i18 == 0) {
            if ((i & 24576) == 0) {
                f4 = f;
                i3 |= composerStartRestartGroup.changed(f4) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
                f5 = f2;
            } else {
                f5 = f2;
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changed(f5) ? 131072 : 65536;
                }
            }
            i5 = i2 & 64;
            int i19 = i3;
            if (i5 == 0) {
                i19 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i19 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i19 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i19 |= composerStartRestartGroup.changed(sliderValueTruncationMode == null ? -1 : sliderValueTruncationMode.ordinal()) ? 8388608 : 4194304;
            }
            if ((i2 & 256) == 0) {
                i19 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i19 |= composerStartRestartGroup.changedInstance(onRangeChanged) ? 67108864 : 33554432;
            }
            i6 = i19;
            if ((i6 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                Float f17 = i18 == 0 ? null : f4;
                Float f18 = i4 == 0 ? null : f5;
                final float f19 = i5 == 0 ? 10.0f : f3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1771507208, i6, -1, "com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelector (IndicatorRangeSliderSelector.kt:56)");
                }
                final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(12);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new IndicatorRangeSliderSelector2(type2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                IndicatorRangeSliderSelector2 indicatorRangeSliderSelector2 = (IndicatorRangeSliderSelector2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 != companion.getEmpty()) {
                    interactionSource3 = interactionSource32;
                    snapshotMutationPolicy = null;
                    i7 = 2;
                    objMutableStateOf$default = SnapshotState3.mutableStateOf$default(f17, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                } else {
                    interactionSource3 = interactionSource32;
                    snapshotMutationPolicy = null;
                    i7 = 2;
                    objMutableStateOf$default = objRememberedValue3;
                }
                snapshotState = (SnapshotState) objMutableStateOf$default;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                Float f20 = f17;
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(f18, snapshotMutationPolicy, i7, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotState2 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(new FinishedRange((f20 == null || f20.floatValue() <= range.getStart().floatValue()) ? null : f20, (f18 == null || f18.floatValue() >= range.getEndInclusive().floatValue()) ? null : f18), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                    objRememberedValue5 = snapshotStateMutableStateOf$default;
                }
                final SnapshotState snapshotState11 = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Float fIndicatorRangeSliderSelector$lambda$3 = IndicatorRangeSliderSelector$lambda$3(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i20 = i6 & 896;
                Float f21 = f18;
                zChanged = composerStartRestartGroup.changed(fIndicatorRangeSliderSelector$lambda$3) | (i20 != 256);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                    Float fIndicatorRangeSliderSelector$lambda$32 = IndicatorRangeSliderSelector$lambda$3(snapshotState);
                    objRememberedValue6 = SnapshotFloatState3.mutableFloatStateOf(fIndicatorRangeSliderSelector$lambda$32 == null ? fIndicatorRangeSliderSelector$lambda$32.floatValue() : range.getStart().floatValue());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                SnapshotFloatState2 snapshotFloatState29 = (SnapshotFloatState2) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                Float fIndicatorRangeSliderSelector$lambda$6 = IndicatorRangeSliderSelector$lambda$6(snapshotState2);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(fIndicatorRangeSliderSelector$lambda$6) | (i20 != 256);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue7 == companion.getEmpty()) {
                    Float fIndicatorRangeSliderSelector$lambda$62 = IndicatorRangeSliderSelector$lambda$6(snapshotState2);
                    objRememberedValue7 = SnapshotFloatState3.mutableFloatStateOf(fIndicatorRangeSliderSelector$lambda$62 == null ? fIndicatorRangeSliderSelector$lambda$62.floatValue() : range.getEndInclusive().floatValue());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                SnapshotFloatState2 snapshotFloatState210 = (SnapshotFloatState2) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = i20 != 256;
                Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                if (z) {
                    snapshotFloatState2 = snapshotFloatState210;
                    if (objRememberedValue20 == companion.getEmpty()) {
                    }
                    snapshotState4 = (SnapshotState4) objRememberedValue20;
                    composerStartRestartGroup.endReplaceGroup();
                    float floatValue = snapshotFloatState29.getFloatValue();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged3 = composerStartRestartGroup.changed(floatValue) | (i20 == 256);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue8 == companion.getEmpty()) {
                        snapshotFloatState22 = snapshotFloatState29;
                        SnapshotState snapshotStateMutableStateOf$default2 = SnapshotState3.mutableStateOf$default(RangesKt.rangeTo(range.getStart().floatValue() + IndicatorRangeSliderSelector$lambda$19(snapshotState4), range.getEndInclusive().floatValue() + IndicatorRangeSliderSelector$lambda$19(snapshotState4)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default2);
                        objRememberedValue8 = snapshotStateMutableStateOf$default2;
                    } else {
                        snapshotFloatState22 = snapshotFloatState29;
                    }
                    SnapshotState snapshotState12 = (SnapshotState) objRememberedValue8;
                    composerStartRestartGroup.endReplaceGroup();
                    float fFloatValue = range.getStart().floatValue();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged4 = composerStartRestartGroup.changed(fFloatValue);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged4 || objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IndicatorRangeSliderSelector5.IndicatorRangeSliderSelector$lambda$24$lambda$23(range, type2, sliderValueTruncationMode, f19);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    snapshotState42 = (SnapshotState4) objRememberedValue9;
                    composerStartRestartGroup.endReplaceGroup();
                    float floatValue2 = snapshotFloatState22.getFloatValue();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged5 = composerStartRestartGroup.changed(floatValue2);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged5 || objRememberedValue10 == companion.getEmpty()) {
                        snapshotState43 = snapshotState42;
                        SnapshotState snapshotStateMutableStateOf$default3 = SnapshotState3.mutableStateOf$default(IndicatorRangeSliderSelector$formatted(snapshotFloatState22.getFloatValue(), type2, sliderValueTruncationMode, f19), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default3);
                        objRememberedValue10 = snapshotStateMutableStateOf$default3;
                    } else {
                        snapshotState43 = snapshotState42;
                    }
                    snapshotState3 = (SnapshotState) objRememberedValue10;
                    composerStartRestartGroup.endReplaceGroup();
                    float floatValue3 = snapshotFloatState2.getFloatValue();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged6 = composerStartRestartGroup.changed(floatValue3);
                    Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged6 || objRememberedValue21 == companion.getEmpty()) {
                        snapshotState5 = snapshotState3;
                        i8 = 2;
                        objMutableStateOf$default2 = SnapshotState3.mutableStateOf$default(IndicatorRangeSliderSelector$formatted(snapshotFloatState2.getFloatValue(), type2, sliderValueTruncationMode, f19), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default2);
                    } else {
                        objMutableStateOf$default2 = objRememberedValue21;
                        snapshotState5 = snapshotState3;
                        i8 = 2;
                    }
                    SnapshotState snapshotState13 = (SnapshotState) objMutableStateOf$default2;
                    composerStartRestartGroup.endReplaceGroup();
                    i9 = WhenMappings.$EnumSwitchMapping$0[sliderAlgorithm.ordinal()];
                    if (i9 != 1 || i9 == i8) {
                        rangeSlider = RangeSlider.LINEAR;
                    } else {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rangeSlider = RangeSlider.LOG;
                    }
                    RangeSlider rangeSlider2 = rangeSlider;
                    FinishedRange finishedRangeIndicatorRangeSliderSelector$lambda$11 = IndicatorRangeSliderSelector$lambda$11(snapshotState11);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z2 = (i6 & 234881024) != 67108864;
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new IndicatorRangeSliderSelector6(onRangeChanged, snapshotState11, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(finishedRangeIndicatorRangeSliderSelector$lambda$11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(focusManager);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue12 == companion.getEmpty()) {
                        objRememberedValue12 = new Function0() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IndicatorRangeSliderSelector5.IndicatorRangeSliderSelector$lambda$34$lambda$33(focusManager);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    f6 = f19;
                    snapshotState6 = snapshotState5;
                    composer2 = composerStartRestartGroup;
                    snapshotFloatState23 = snapshotFloatState2;
                    snapshotFloatState24 = snapshotFloatState22;
                    snapshotState44 = snapshotState43;
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier, interactionSource3, null, false, null, null, (Function0) objRememberedValue12, 28, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion6.getStart(), composer2, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4891clickableO2vRcR0$default);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion7.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion7.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion7.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion6.getTop(), composer2, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion2);
                    Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion7.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierWeight$default = Row5.weight$default(row6, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor3);
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, fM7995constructorimpl);
                    composer2.startReplaceGroup(-1224400529);
                    i10 = i6 & 112;
                    i11 = i6 & 29360128;
                    i12 = i6 & 3670016;
                    zChanged7 = composer2.changed(snapshotState6) | (i10 != 32) | (i11 != 8388608) | (i12 != 1048576) | composer2.changed(snapshotFloatState24) | (i20 != 256) | composer2.changed(snapshotFloatState23);
                    objRememberedValue13 = composer2.rememberedValue();
                    if (!zChanged7 || objRememberedValue13 == companion.getEmpty()) {
                        f7 = fM7995constructorimpl;
                        companion3 = companion2;
                        modifier2 = modifierM5142padding3ABfNKs;
                        i13 = i10;
                        i14 = i11;
                        i15 = -1224400529;
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return IndicatorRangeSliderSelector5.m1987xced0e997(snapshotState6, snapshotFloatState24, type2, sliderValueTruncationMode, f6, range, snapshotState, snapshotState2, snapshotFloatState23, snapshotState11, (FocusState) obj);
                            }
                        };
                        snapshotState7 = snapshotState2;
                        snapshotFloatState25 = snapshotFloatState24;
                        snapshotState8 = snapshotState6;
                        f8 = f6;
                        snapshotState9 = snapshotState;
                        snapshotFloatState26 = snapshotFloatState23;
                        composer2.updateRememberedValue(function1);
                        objRememberedValue13 = function1;
                    } else {
                        companion3 = companion2;
                        f7 = fM7995constructorimpl;
                        modifier2 = modifierM5142padding3ABfNKs;
                        i13 = i10;
                        snapshotFloatState26 = snapshotFloatState23;
                        i14 = i11;
                        f8 = f6;
                        snapshotFloatState25 = snapshotFloatState24;
                        i15 = -1224400529;
                        snapshotState8 = snapshotState6;
                        snapshotState9 = snapshotState;
                        snapshotState7 = snapshotState2;
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifier2, (Function1) objRememberedValue13);
                    companion4 = KeyboardOptions.INSTANCE;
                    KeyboardOptions keyboardOptions = companion4.getDefault();
                    KeyboardType.Companion companion8 = KeyboardType.INSTANCE;
                    int iM7779getDecimalPjHm6EE = companion8.m7779getDecimalPjHm6EE();
                    ImeAction.Companion companion9 = ImeAction.INSTANCE;
                    KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default = KeyboardOptions.m5353copyINvB4aQ$default(keyboardOptions, 0, null, iM7779getDecimalPjHm6EE, companion9.m7749getNexteUduSuo(), null, null, null, 115, null);
                    String strIndicatorRangeSliderSelector$lambda$27 = IndicatorRangeSliderSelector$lambda$27(snapshotState8);
                    composer2.startReplaceGroup(i15);
                    zChanged8 = composer2.changed(snapshotState8) | (i20 != 256) | composer2.changed(snapshotFloatState26) | composer2.changed(snapshotFloatState25) | composer2.changed(snapshotState44) | (i12 != 1048576);
                    objRememberedValue14 = composer2.rememberedValue();
                    if (!zChanged8 || objRememberedValue14 == companion.getEmpty()) {
                        Function1 function12 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return IndicatorRangeSliderSelector5.m1988xf89a4f1b(f8, snapshotState8, snapshotState44, range, snapshotState9, snapshotState7, snapshotFloatState26, snapshotFloatState25, snapshotState11, (String) obj);
                            }
                        };
                        composer2.updateRememberedValue(function12);
                        objRememberedValue14 = function12;
                    }
                    composer2.endReplaceGroup();
                    BentoTextInput4.BentoTextInput(strIndicatorRangeSliderSelector$lambda$27, (Function1) objRememberedValue14, modifierOnFocusChanged, null, null, null, null, null, null, null, keyboardOptionsM5353copyINvB4aQ$default, null, indicatorRangeSliderSelector2, false, false, composer2, 0, 384, 27640);
                    composer2.endNode();
                    Modifier.Companion companion10 = companion3;
                    Modifier modifierWeight$default2 = Row5.weight$default(row6, SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                    currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default2);
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor4);
                    }
                    composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                    f9 = f8;
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                    setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                    f10 = f7;
                    modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(companion10, f10);
                    composer2.startReplaceGroup(-1224400529);
                    snapshotState10 = snapshotState13;
                    zChanged9 = (i13 != 32) | composer2.changed(snapshotState10) | (i14 != 8388608) | (i12 != 1048576) | composer2.changed(snapshotFloatState26) | (i20 != 256) | composer2.changed(snapshotFloatState25);
                    objRememberedValue15 = composer2.rememberedValue();
                    if (!zChanged9 || objRememberedValue15 == companion.getEmpty()) {
                        final SnapshotFloatState2 snapshotFloatState211 = snapshotFloatState25;
                        f11 = f10;
                        companion5 = companion4;
                        modifier3 = modifierM5142padding3ABfNKs2;
                        snapshotState45 = snapshotState44;
                        final SnapshotState snapshotState14 = snapshotState7;
                        final SnapshotFloatState2 snapshotFloatState212 = snapshotFloatState26;
                        final SnapshotState snapshotState15 = snapshotState9;
                        Function1 function13 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return IndicatorRangeSliderSelector5.m1989x35940065(snapshotState10, snapshotFloatState212, type2, sliderValueTruncationMode, f9, range, snapshotState15, snapshotState14, snapshotFloatState211, snapshotState11, (FocusState) obj);
                            }
                        };
                        snapshotState10 = snapshotState10;
                        f12 = f9;
                        snapshotState9 = snapshotState15;
                        snapshotFloatState26 = snapshotFloatState212;
                        snapshotState7 = snapshotState14;
                        snapshotFloatState25 = snapshotFloatState211;
                        composer2.updateRememberedValue(function13);
                        objRememberedValue15 = function13;
                    } else {
                        f11 = f10;
                        companion5 = companion4;
                        modifier3 = modifierM5142padding3ABfNKs2;
                        snapshotState45 = snapshotState44;
                        f12 = f9;
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifier3, (Function1) objRememberedValue15);
                    KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default2 = KeyboardOptions.m5353copyINvB4aQ$default(companion5.getDefault(), 0, null, companion8.m7779getDecimalPjHm6EE(), companion9.m7751getPreviouseUduSuo(), null, null, null, 115, null);
                    String strIndicatorRangeSliderSelector$lambda$30 = IndicatorRangeSliderSelector$lambda$30(snapshotState10);
                    composer2.startReplaceGroup(-1224400529);
                    zChanged10 = composer2.changed(snapshotState10) | (i20 != 256) | composer2.changed(snapshotFloatState26) | composer2.changed(snapshotFloatState25) | composer2.changed(snapshotState45) | (i12 != 1048576);
                    objRememberedValue16 = composer2.rememberedValue();
                    if (!zChanged10 || objRememberedValue16 == companion.getEmpty()) {
                        final SnapshotState4 snapshotState46 = snapshotState45;
                        Function1 function14 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return IndicatorRangeSliderSelector5.m1990x5f5d65e9(f12, snapshotState10, snapshotState46, range, snapshotState9, snapshotState7, snapshotFloatState26, snapshotFloatState25, snapshotState11, (String) obj);
                            }
                        };
                        composer2.updateRememberedValue(function14);
                        objRememberedValue16 = function14;
                    }
                    composer2.endReplaceGroup();
                    BentoTextInput4.BentoTextInput(strIndicatorRangeSliderSelector$lambda$30, (Function1) objRememberedValue16, modifierOnFocusChanged2, null, null, null, null, null, null, null, keyboardOptionsM5353copyINvB4aQ$default2, null, indicatorRangeSliderSelector2, false, false, composer2, 0, 384, 27640);
                    composer2.endNode();
                    composer2.endNode();
                    float floatValue4 = snapshotFloatState25.getFloatValue();
                    composer2.startReplaceGroup(-1633490746);
                    zChanged11 = composer2.changed(floatValue4) | (i20 != 256);
                    objRememberedValue17 = composer2.rememberedValue();
                    if (!zChanged11 || objRememberedValue17 == companion.getEmpty()) {
                        objRememberedValue17 = SnapshotFloatState3.mutableFloatStateOf(snapshotFloatState25.getFloatValue() + IndicatorRangeSliderSelector$lambda$19(snapshotState4));
                        composer2.updateRememberedValue(objRememberedValue17);
                    }
                    snapshotFloatState27 = (SnapshotFloatState2) objRememberedValue17;
                    composer2.endReplaceGroup();
                    float floatValue5 = snapshotFloatState26.getFloatValue();
                    composer2.startReplaceGroup(-1633490746);
                    zChanged12 = composer2.changed(floatValue5) | (i20 != 256);
                    objRememberedValue18 = composer2.rememberedValue();
                    if (!zChanged12 || objRememberedValue18 == companion.getEmpty()) {
                        objRememberedValue18 = SnapshotFloatState3.mutableFloatStateOf(snapshotFloatState26.getFloatValue() + IndicatorRangeSliderSelector$lambda$19(snapshotState4));
                        composer2.updateRememberedValue(objRememberedValue18);
                    }
                    snapshotFloatState28 = (SnapshotFloatState2) objRememberedValue18;
                    composer2.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                    f13 = f11;
                    Modifier modifierM5142padding3ABfNKs3 = PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, f13);
                    float floatValue6 = snapshotFloatState27.getFloatValue();
                    float floatValue7 = snapshotFloatState28.getFloatValue();
                    Ranges3<Float> ranges3IndicatorRangeSliderSelector$lambda$21 = IndicatorRangeSliderSelector$lambda$21(snapshotState12);
                    composer2.startReplaceGroup(-1224400529);
                    zChanged13 = (i12 != 1048576) | (i20 != 256) | composer2.changed(snapshotFloatState26) | composer2.changed(snapshotFloatState25) | composer2.changed(snapshotState4) | composer2.changed(snapshotFloatState27) | composer2.changed(snapshotFloatState28);
                    objRememberedValue19 = composer2.rememberedValue();
                    if (!zChanged13 || objRememberedValue19 == companion.getEmpty()) {
                        final SnapshotState snapshotState16 = snapshotState9;
                        final SnapshotState snapshotState17 = snapshotState7;
                        final SnapshotFloatState2 snapshotFloatState213 = snapshotFloatState26;
                        final SnapshotFloatState2 snapshotFloatState214 = snapshotFloatState25;
                        i16 = i12;
                        f14 = f13;
                        i17 = 1;
                        indicatorRangeSliderSelector = type2;
                        Function2 function2 = new Function2() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IndicatorRangeSliderSelector5.IndicatorRangeSliderSelector$lambda$55$lambda$53$lambda$52(f12, snapshotState4, range, snapshotState16, snapshotState17, snapshotFloatState213, snapshotFloatState214, snapshotState11, snapshotFloatState27, snapshotFloatState28, ((Boolean) obj).booleanValue(), (Ranges3) obj2);
                            }
                        };
                        composer2.updateRememberedValue(function2);
                        objRememberedValue19 = function2;
                    } else {
                        indicatorRangeSliderSelector = type2;
                        f14 = f13;
                        i16 = i12;
                        i17 = 1;
                    }
                    composer2.endReplaceGroup();
                    RangeSlider2.RangeSlider(modifierM5142padding3ABfNKs3, ranges3IndicatorRangeSliderSelector$lambda$21, floatValue6, floatValue7, rangeSlider2, false, f12, (Function2) objRememberedValue19, composer2, i16 | 6, 32);
                    Modifier modifierM5142padding3ABfNKs4 = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(companion10, 0.0f, i17, null), f14);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion6.getTop(), composer2, 6);
                    currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs4);
                    Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor5);
                    }
                    composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                    setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion7.getSetModifier());
                    sliderValueTruncationMode2 = sliderValueTruncationMode;
                    BentoText2.m20747BentoText38GnDrw(IndicatorRangeSliderSelector$formatted(range.getStart().floatValue(), indicatorRangeSliderSelector, sliderValueTruncationMode2, f12), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                    BentoText2.m20747BentoText38GnDrw(IndicatorRangeSliderSelector$formatted(range.getEndInclusive().floatValue(), indicatorRangeSliderSelector, sliderValueTruncationMode2, f12), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f12;
                    f16 = f20;
                    f5 = f21;
                } else {
                    snapshotFloatState2 = snapshotFloatState210;
                }
                objRememberedValue20 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(IndicatorRangeSliderSelector5.IndicatorRangeSliderSelector$lambda$18$lambda$17(range));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                snapshotState4 = (SnapshotState4) objRememberedValue20;
                composerStartRestartGroup.endReplaceGroup();
                float floatValue8 = snapshotFloatState29.getFloatValue();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged3 = composerStartRestartGroup.changed(floatValue8) | (i20 == 256);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    snapshotFloatState22 = snapshotFloatState29;
                    SnapshotState snapshotStateMutableStateOf$default22 = SnapshotState3.mutableStateOf$default(RangesKt.rangeTo(range.getStart().floatValue() + IndicatorRangeSliderSelector$lambda$19(snapshotState4), range.getEndInclusive().floatValue() + IndicatorRangeSliderSelector$lambda$19(snapshotState4)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default22);
                    objRememberedValue8 = snapshotStateMutableStateOf$default22;
                    SnapshotState snapshotState122 = (SnapshotState) objRememberedValue8;
                    composerStartRestartGroup.endReplaceGroup();
                    float fFloatValue2 = range.getStart().floatValue();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged4 = composerStartRestartGroup.changed(fFloatValue2);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged4) {
                        objRememberedValue9 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IndicatorRangeSliderSelector5.IndicatorRangeSliderSelector$lambda$24$lambda$23(range, type2, sliderValueTruncationMode, f19);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        snapshotState42 = (SnapshotState4) objRememberedValue9;
                        composerStartRestartGroup.endReplaceGroup();
                        float floatValue22 = snapshotFloatState22.getFloatValue();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged5 = composerStartRestartGroup.changed(floatValue22);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (zChanged5) {
                            snapshotState43 = snapshotState42;
                            SnapshotState snapshotStateMutableStateOf$default32 = SnapshotState3.mutableStateOf$default(IndicatorRangeSliderSelector$formatted(snapshotFloatState22.getFloatValue(), type2, sliderValueTruncationMode, f19), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default32);
                            objRememberedValue10 = snapshotStateMutableStateOf$default32;
                            snapshotState3 = (SnapshotState) objRememberedValue10;
                            composerStartRestartGroup.endReplaceGroup();
                            float floatValue32 = snapshotFloatState2.getFloatValue();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged6 = composerStartRestartGroup.changed(floatValue32);
                            Object objRememberedValue212 = composerStartRestartGroup.rememberedValue();
                            if (zChanged6) {
                                snapshotState5 = snapshotState3;
                                i8 = 2;
                                objMutableStateOf$default2 = SnapshotState3.mutableStateOf$default(IndicatorRangeSliderSelector$formatted(snapshotFloatState2.getFloatValue(), type2, sliderValueTruncationMode, f19), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default2);
                                SnapshotState snapshotState132 = (SnapshotState) objMutableStateOf$default2;
                                composerStartRestartGroup.endReplaceGroup();
                                i9 = WhenMappings.$EnumSwitchMapping$0[sliderAlgorithm.ordinal()];
                                if (i9 != 1) {
                                    rangeSlider = RangeSlider.LINEAR;
                                    RangeSlider rangeSlider22 = rangeSlider;
                                    FinishedRange finishedRangeIndicatorRangeSliderSelector$lambda$112 = IndicatorRangeSliderSelector$lambda$11(snapshotState11);
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    if ((i6 & 234881024) != 67108864) {
                                    }
                                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                    if (!z2) {
                                        objRememberedValue11 = new IndicatorRangeSliderSelector6(onRangeChanged, snapshotState11, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(finishedRangeIndicatorRangeSliderSelector$lambda$112, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        zChangedInstance = composerStartRestartGroup.changedInstance(focusManager);
                                        objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance) {
                                            objRememberedValue12 = new Function0() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return IndicatorRangeSliderSelector5.IndicatorRangeSliderSelector$lambda$34$lambda$33(focusManager);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                            composerStartRestartGroup.endReplaceGroup();
                                            f6 = f19;
                                            snapshotState6 = snapshotState5;
                                            composer2 = composerStartRestartGroup;
                                            snapshotFloatState23 = snapshotFloatState2;
                                            snapshotFloatState24 = snapshotFloatState22;
                                            snapshotState44 = snapshotState43;
                                            Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifier, interactionSource3, null, false, null, null, (Function0) objRememberedValue12, 28, null);
                                            Arrangement arrangement2 = Arrangement.INSTANCE;
                                            Arrangement.Vertical top2 = arrangement2.getTop();
                                            Alignment.Companion companion62 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion62.getStart(), composer2, 0);
                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer2, modifierM4891clickableO2vRcR0$default2);
                                            ComposeUiNode.Companion companion72 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor6 = companion72.getConstructor();
                                            if (composer2.getApplier() == null) {
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                            }
                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion72.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap6, companion72.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = companion72.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl.getInserting()) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier6, companion72.getSetModifier());
                                                Column6 column62 = Column6.INSTANCE;
                                                companion2 = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion62.getTop(), composer2, 0);
                                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, companion2);
                                                Function0<ComposeUiNode> constructor22 = companion72.getConstructor();
                                                if (composer2.getApplier() == null) {
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                }
                                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion72.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion72.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash2 = companion72.getSetCompositeKeyHash();
                                                if (!composerM6388constructorimpl2.getInserting()) {
                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion72.getSetModifier());
                                                    Row6 row62 = Row6.INSTANCE;
                                                    Modifier modifierWeight$default3 = Row5.weight$default(row62, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion62.getTopStart(), false);
                                                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default3);
                                                    Function0<ComposeUiNode> constructor32 = companion72.getConstructor();
                                                    if (composer2.getApplier() == null) {
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                    }
                                                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, companion72.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion72.getSetResolvedCompositionLocals());
                                                    setCompositeKeyHash3 = companion72.getSetCompositeKeyHash();
                                                    if (!composerM6388constructorimpl3.getInserting()) {
                                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion72.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                        modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, fM7995constructorimpl);
                                                        composer2.startReplaceGroup(-1224400529);
                                                        i10 = i6 & 112;
                                                        i11 = i6 & 29360128;
                                                        i12 = i6 & 3670016;
                                                        zChanged7 = composer2.changed(snapshotState6) | (i10 != 32) | (i11 != 8388608) | (i12 != 1048576) | composer2.changed(snapshotFloatState24) | (i20 != 256) | composer2.changed(snapshotFloatState23);
                                                        objRememberedValue13 = composer2.rememberedValue();
                                                        if (zChanged7) {
                                                            f7 = fM7995constructorimpl;
                                                            companion3 = companion2;
                                                            modifier2 = modifierM5142padding3ABfNKs;
                                                            i13 = i10;
                                                            i14 = i11;
                                                            i15 = -1224400529;
                                                            Function1 function15 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda3
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    return IndicatorRangeSliderSelector5.m1987xced0e997(snapshotState6, snapshotFloatState24, type2, sliderValueTruncationMode, f6, range, snapshotState, snapshotState2, snapshotFloatState23, snapshotState11, (FocusState) obj);
                                                                }
                                                            };
                                                            snapshotState7 = snapshotState2;
                                                            snapshotFloatState25 = snapshotFloatState24;
                                                            snapshotState8 = snapshotState6;
                                                            f8 = f6;
                                                            snapshotState9 = snapshotState;
                                                            snapshotFloatState26 = snapshotFloatState23;
                                                            composer2.updateRememberedValue(function15);
                                                            objRememberedValue13 = function15;
                                                            composer2.endReplaceGroup();
                                                            Modifier modifierOnFocusChanged3 = FocusChangedModifier2.onFocusChanged(modifier2, (Function1) objRememberedValue13);
                                                            companion4 = KeyboardOptions.INSTANCE;
                                                            KeyboardOptions keyboardOptions2 = companion4.getDefault();
                                                            KeyboardType.Companion companion82 = KeyboardType.INSTANCE;
                                                            int iM7779getDecimalPjHm6EE2 = companion82.m7779getDecimalPjHm6EE();
                                                            ImeAction.Companion companion92 = ImeAction.INSTANCE;
                                                            KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default3 = KeyboardOptions.m5353copyINvB4aQ$default(keyboardOptions2, 0, null, iM7779getDecimalPjHm6EE2, companion92.m7749getNexteUduSuo(), null, null, null, 115, null);
                                                            String strIndicatorRangeSliderSelector$lambda$272 = IndicatorRangeSliderSelector$lambda$27(snapshotState8);
                                                            composer2.startReplaceGroup(i15);
                                                            zChanged8 = composer2.changed(snapshotState8) | (i20 != 256) | composer2.changed(snapshotFloatState26) | composer2.changed(snapshotFloatState25) | composer2.changed(snapshotState44) | (i12 != 1048576);
                                                            objRememberedValue14 = composer2.rememberedValue();
                                                            if (!zChanged8) {
                                                                Function1 function122 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda4
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        return IndicatorRangeSliderSelector5.m1988xf89a4f1b(f8, snapshotState8, snapshotState44, range, snapshotState9, snapshotState7, snapshotFloatState26, snapshotFloatState25, snapshotState11, (String) obj);
                                                                    }
                                                                };
                                                                composer2.updateRememberedValue(function122);
                                                                objRememberedValue14 = function122;
                                                                composer2.endReplaceGroup();
                                                                BentoTextInput4.BentoTextInput(strIndicatorRangeSliderSelector$lambda$272, (Function1) objRememberedValue14, modifierOnFocusChanged3, null, null, null, null, null, null, null, keyboardOptionsM5353copyINvB4aQ$default3, null, indicatorRangeSliderSelector2, false, false, composer2, 0, 384, 27640);
                                                                composer2.endNode();
                                                                Modifier.Companion companion102 = companion3;
                                                                Modifier modifierWeight$default22 = Row5.weight$default(row62, SizeKt.fillMaxWidth$default(companion102, 0.0f, 1, null), 1.0f, false, 2, null);
                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion62.getTopStart(), false);
                                                                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                                CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default22);
                                                                Function0<ComposeUiNode> constructor42 = companion72.getConstructor();
                                                                if (composer2.getApplier() == null) {
                                                                }
                                                                composer2.startReusableNode();
                                                                if (composer2.getInserting()) {
                                                                }
                                                                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                                                                f9 = f8;
                                                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy22, companion72.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion72.getSetResolvedCompositionLocals());
                                                                setCompositeKeyHash4 = companion72.getSetCompositeKeyHash();
                                                                if (!composerM6388constructorimpl4.getInserting()) {
                                                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion72.getSetModifier());
                                                                    f10 = f7;
                                                                    modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(companion102, f10);
                                                                    composer2.startReplaceGroup(-1224400529);
                                                                    snapshotState10 = snapshotState132;
                                                                    zChanged9 = (i13 != 32) | composer2.changed(snapshotState10) | (i14 != 8388608) | (i12 != 1048576) | composer2.changed(snapshotFloatState26) | (i20 != 256) | composer2.changed(snapshotFloatState25);
                                                                    objRememberedValue15 = composer2.rememberedValue();
                                                                    if (zChanged9) {
                                                                        final SnapshotFloatState2 snapshotFloatState2112 = snapshotFloatState25;
                                                                        f11 = f10;
                                                                        companion5 = companion4;
                                                                        modifier3 = modifierM5142padding3ABfNKs2;
                                                                        snapshotState45 = snapshotState44;
                                                                        final SnapshotState snapshotState142 = snapshotState7;
                                                                        final SnapshotFloatState2 snapshotFloatState2122 = snapshotFloatState26;
                                                                        final SnapshotState snapshotState152 = snapshotState9;
                                                                        Function1 function132 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda5
                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Object invoke(Object obj) {
                                                                                return IndicatorRangeSliderSelector5.m1989x35940065(snapshotState10, snapshotFloatState2122, type2, sliderValueTruncationMode, f9, range, snapshotState152, snapshotState142, snapshotFloatState2112, snapshotState11, (FocusState) obj);
                                                                            }
                                                                        };
                                                                        snapshotState10 = snapshotState10;
                                                                        f12 = f9;
                                                                        snapshotState9 = snapshotState152;
                                                                        snapshotFloatState26 = snapshotFloatState2122;
                                                                        snapshotState7 = snapshotState142;
                                                                        snapshotFloatState25 = snapshotFloatState2112;
                                                                        composer2.updateRememberedValue(function132);
                                                                        objRememberedValue15 = function132;
                                                                        composer2.endReplaceGroup();
                                                                        Modifier modifierOnFocusChanged22 = FocusChangedModifier2.onFocusChanged(modifier3, (Function1) objRememberedValue15);
                                                                        KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default22 = KeyboardOptions.m5353copyINvB4aQ$default(companion5.getDefault(), 0, null, companion82.m7779getDecimalPjHm6EE(), companion92.m7751getPreviouseUduSuo(), null, null, null, 115, null);
                                                                        String strIndicatorRangeSliderSelector$lambda$302 = IndicatorRangeSliderSelector$lambda$30(snapshotState10);
                                                                        composer2.startReplaceGroup(-1224400529);
                                                                        zChanged10 = composer2.changed(snapshotState10) | (i20 != 256) | composer2.changed(snapshotFloatState26) | composer2.changed(snapshotFloatState25) | composer2.changed(snapshotState45) | (i12 != 1048576);
                                                                        objRememberedValue16 = composer2.rememberedValue();
                                                                        if (!zChanged10) {
                                                                            final SnapshotState4 snapshotState462 = snapshotState45;
                                                                            Function1 function142 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda6
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj) {
                                                                                    return IndicatorRangeSliderSelector5.m1990x5f5d65e9(f12, snapshotState10, snapshotState462, range, snapshotState9, snapshotState7, snapshotFloatState26, snapshotFloatState25, snapshotState11, (String) obj);
                                                                                }
                                                                            };
                                                                            composer2.updateRememberedValue(function142);
                                                                            objRememberedValue16 = function142;
                                                                            composer2.endReplaceGroup();
                                                                            BentoTextInput4.BentoTextInput(strIndicatorRangeSliderSelector$lambda$302, (Function1) objRememberedValue16, modifierOnFocusChanged22, null, null, null, null, null, null, null, keyboardOptionsM5353copyINvB4aQ$default22, null, indicatorRangeSliderSelector2, false, false, composer2, 0, 384, 27640);
                                                                            composer2.endNode();
                                                                            composer2.endNode();
                                                                            float floatValue42 = snapshotFloatState25.getFloatValue();
                                                                            composer2.startReplaceGroup(-1633490746);
                                                                            zChanged11 = composer2.changed(floatValue42) | (i20 != 256);
                                                                            objRememberedValue17 = composer2.rememberedValue();
                                                                            if (!zChanged11) {
                                                                                objRememberedValue17 = SnapshotFloatState3.mutableFloatStateOf(snapshotFloatState25.getFloatValue() + IndicatorRangeSliderSelector$lambda$19(snapshotState4));
                                                                                composer2.updateRememberedValue(objRememberedValue17);
                                                                                snapshotFloatState27 = (SnapshotFloatState2) objRememberedValue17;
                                                                                composer2.endReplaceGroup();
                                                                                float floatValue52 = snapshotFloatState26.getFloatValue();
                                                                                composer2.startReplaceGroup(-1633490746);
                                                                                zChanged12 = composer2.changed(floatValue52) | (i20 != 256);
                                                                                objRememberedValue18 = composer2.rememberedValue();
                                                                                if (!zChanged12) {
                                                                                    objRememberedValue18 = SnapshotFloatState3.mutableFloatStateOf(snapshotFloatState26.getFloatValue() + IndicatorRangeSliderSelector$lambda$19(snapshotState4));
                                                                                    composer2.updateRememberedValue(objRememberedValue18);
                                                                                    snapshotFloatState28 = (SnapshotFloatState2) objRememberedValue18;
                                                                                    composer2.endReplaceGroup();
                                                                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion102, 0.0f, 1, null);
                                                                                    f13 = f11;
                                                                                    Modifier modifierM5142padding3ABfNKs32 = PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default2, f13);
                                                                                    float floatValue62 = snapshotFloatState27.getFloatValue();
                                                                                    float floatValue72 = snapshotFloatState28.getFloatValue();
                                                                                    Ranges3<Float> ranges3IndicatorRangeSliderSelector$lambda$212 = IndicatorRangeSliderSelector$lambda$21(snapshotState122);
                                                                                    composer2.startReplaceGroup(-1224400529);
                                                                                    zChanged13 = (i12 != 1048576) | (i20 != 256) | composer2.changed(snapshotFloatState26) | composer2.changed(snapshotFloatState25) | composer2.changed(snapshotState4) | composer2.changed(snapshotFloatState27) | composer2.changed(snapshotFloatState28);
                                                                                    objRememberedValue19 = composer2.rememberedValue();
                                                                                    if (zChanged13) {
                                                                                        final SnapshotState snapshotState162 = snapshotState9;
                                                                                        final SnapshotState snapshotState172 = snapshotState7;
                                                                                        final SnapshotFloatState2 snapshotFloatState2132 = snapshotFloatState26;
                                                                                        final SnapshotFloatState2 snapshotFloatState2142 = snapshotFloatState25;
                                                                                        i16 = i12;
                                                                                        f14 = f13;
                                                                                        i17 = 1;
                                                                                        indicatorRangeSliderSelector = type2;
                                                                                        Function2 function22 = new Function2() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda7
                                                                                            @Override // kotlin.jvm.functions.Function2
                                                                                            public final Object invoke(Object obj, Object obj2) {
                                                                                                return IndicatorRangeSliderSelector5.IndicatorRangeSliderSelector$lambda$55$lambda$53$lambda$52(f12, snapshotState4, range, snapshotState162, snapshotState172, snapshotFloatState2132, snapshotFloatState2142, snapshotState11, snapshotFloatState27, snapshotFloatState28, ((Boolean) obj).booleanValue(), (Ranges3) obj2);
                                                                                            }
                                                                                        };
                                                                                        composer2.updateRememberedValue(function22);
                                                                                        objRememberedValue19 = function22;
                                                                                        composer2.endReplaceGroup();
                                                                                        RangeSlider2.RangeSlider(modifierM5142padding3ABfNKs32, ranges3IndicatorRangeSliderSelector$lambda$212, floatValue62, floatValue72, rangeSlider22, false, f12, (Function2) objRememberedValue19, composer2, i16 | 6, 32);
                                                                                        Modifier modifierM5142padding3ABfNKs42 = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(companion102, 0.0f, i17, null), f14);
                                                                                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion62.getTop(), composer2, 6);
                                                                                        currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                                                        CompositionLocalMap currentCompositionLocalMap52 = composer2.getCurrentCompositionLocalMap();
                                                                                        Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs42);
                                                                                        Function0<ComposeUiNode> constructor52 = companion72.getConstructor();
                                                                                        if (composer2.getApplier() == null) {
                                                                                        }
                                                                                        composer2.startReusableNode();
                                                                                        if (composer2.getInserting()) {
                                                                                        }
                                                                                        composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                                                                                        Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy22, companion72.getSetMeasurePolicy());
                                                                                        Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion72.getSetResolvedCompositionLocals());
                                                                                        setCompositeKeyHash5 = companion72.getSetCompositeKeyHash();
                                                                                        if (!composerM6388constructorimpl5.getInserting()) {
                                                                                            composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                                                            composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                                                            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion72.getSetModifier());
                                                                                            sliderValueTruncationMode2 = sliderValueTruncationMode;
                                                                                            BentoText2.m20747BentoText38GnDrw(IndicatorRangeSliderSelector$formatted(range.getStart().floatValue(), indicatorRangeSliderSelector, sliderValueTruncationMode2, f12), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                                                                                            BentoText2.m20747BentoText38GnDrw(IndicatorRangeSliderSelector$formatted(range.getEndInclusive().floatValue(), indicatorRangeSliderSelector, sliderValueTruncationMode2, f12), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                                                                                            composer2.endNode();
                                                                                            composer2.endNode();
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                            }
                                                                                            f15 = f12;
                                                                                            f16 = f20;
                                                                                            f5 = f21;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f15 = f3;
                composer2 = composerStartRestartGroup;
                f16 = f4;
                indicatorRangeSliderSelector = type2;
                sliderValueTruncationMode2 = sliderValueTruncationMode;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final SliderValueTruncationMode sliderValueTruncationMode3 = sliderValueTruncationMode2;
                final IndicatorRangeSliderSelector indicatorRangeSliderSelector3 = indicatorRangeSliderSelector;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IndicatorRangeSliderSelector5.IndicatorRangeSliderSelector$lambda$56(modifier, indicatorRangeSliderSelector3, range, sliderAlgorithm, f16, f5, f15, sliderValueTruncationMode3, onRangeChanged, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        f4 = f;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        int i192 = i3;
        if (i5 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i6 = i192;
        if ((i6 & 38347923) == 38347922) {
            if (i18 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(12);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            IndicatorRangeSliderSelector2 indicatorRangeSliderSelector22 = (IndicatorRangeSliderSelector2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            InteractionSource3 interactionSource322 = (InteractionSource3) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 != companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objMutableStateOf$default;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Float f202 = f17;
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            final SnapshotState snapshotState112 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            Float fIndicatorRangeSliderSelector$lambda$33 = IndicatorRangeSliderSelector$lambda$3(snapshotState);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i202 = i6 & 896;
            Float f212 = f18;
            zChanged = composerStartRestartGroup.changed(fIndicatorRangeSliderSelector$lambda$33) | (i202 != 256);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                Float fIndicatorRangeSliderSelector$lambda$322 = IndicatorRangeSliderSelector$lambda$3(snapshotState);
                objRememberedValue6 = SnapshotFloatState3.mutableFloatStateOf(fIndicatorRangeSliderSelector$lambda$322 == null ? fIndicatorRangeSliderSelector$lambda$322.floatValue() : range.getStart().floatValue());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                SnapshotFloatState2 snapshotFloatState292 = (SnapshotFloatState2) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                Float fIndicatorRangeSliderSelector$lambda$63 = IndicatorRangeSliderSelector$lambda$6(snapshotState2);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(fIndicatorRangeSliderSelector$lambda$63) | (i202 != 256);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    Float fIndicatorRangeSliderSelector$lambda$622 = IndicatorRangeSliderSelector$lambda$6(snapshotState2);
                    objRememberedValue7 = SnapshotFloatState3.mutableFloatStateOf(fIndicatorRangeSliderSelector$lambda$622 == null ? fIndicatorRangeSliderSelector$lambda$622.floatValue() : range.getEndInclusive().floatValue());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    SnapshotFloatState2 snapshotFloatState2102 = (SnapshotFloatState2) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if (i202 != 256) {
                    }
                    Object objRememberedValue202 = composerStartRestartGroup.rememberedValue();
                    if (z) {
                    }
                    objRememberedValue202 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelectorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(IndicatorRangeSliderSelector5.IndicatorRangeSliderSelector$lambda$18$lambda$17(range));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue202);
                    snapshotState4 = (SnapshotState4) objRememberedValue202;
                    composerStartRestartGroup.endReplaceGroup();
                    float floatValue82 = snapshotFloatState292.getFloatValue();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged3 = composerStartRestartGroup.changed(floatValue82) | (i202 == 256);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final String IndicatorRangeSliderSelector$formatted(float f, IndicatorRangeSliderSelector indicatorRangeSliderSelector, SliderValueTruncationMode sliderValueTruncationMode, float f2) {
        return UtilsKt.truncateValue(new BigDecimal(String.valueOf(f)), indicatorRangeSliderSelector.getFormatter(), sliderValueTruncationMode, 1, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float IndicatorRangeSliderSelector$lambda$18$lambda$17(Ranges3 ranges3) {
        if (((Number) ranges3.getStart()).floatValue() < 0.0f) {
            return Math.abs(((Number) ranges3.getStart()).floatValue());
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinishedRange IndicatorRangeSliderSelector$lambda$11(SnapshotState<FinishedRange> snapshotState) {
        return snapshotState.getValue();
    }

    private static final float IndicatorRangeSliderSelector$lambda$19(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final Ranges3<Float> IndicatorRangeSliderSelector$lambda$21(SnapshotState<Ranges3<Float>> snapshotState) {
        return snapshotState.getValue();
    }

    private static final String IndicatorRangeSliderSelector$lambda$25(SnapshotState4<String> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final String IndicatorRangeSliderSelector$lambda$27(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final Float IndicatorRangeSliderSelector$lambda$3(SnapshotState<Float> snapshotState) {
        return snapshotState.getValue();
    }

    private static final String IndicatorRangeSliderSelector$lambda$30(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final Float IndicatorRangeSliderSelector$lambda$6(SnapshotState<Float> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String IndicatorRangeSliderSelector$lambda$24$lambda$23(Ranges3 ranges3, IndicatorRangeSliderSelector indicatorRangeSliderSelector, SliderValueTruncationMode sliderValueTruncationMode, float f) throws IOException {
        String strIndicatorRangeSliderSelector$formatted = IndicatorRangeSliderSelector$formatted(((Number) ranges3.getStart()).floatValue(), indicatorRangeSliderSelector, sliderValueTruncationMode, f);
        StringBuilder sb = new StringBuilder();
        int length = strIndicatorRangeSliderSelector$formatted.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strIndicatorRangeSliderSelector$formatted.charAt(i);
            if (Character.isLetter(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    static /* synthetic */ void IndicatorRangeSliderSelector$updateRange$default(Ranges3 ranges3, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, SnapshotState snapshotState3, Float f, Float f2, boolean z, int i, Object obj) {
        IndicatorRangeSliderSelector$updateRange(ranges3, snapshotState, snapshotState2, snapshotFloatState2, snapshotFloatState22, snapshotState3, (i & 64) != 0 ? IndicatorRangeSliderSelector$lambda$3(snapshotState) : f, (i & 128) != 0 ? IndicatorRangeSliderSelector$lambda$6(snapshotState2) : f2, (i & 256) != 0 ? true : z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IndicatorRangeSliderSelector$updateRange(Ranges3<Float> ranges3, SnapshotState<Float> snapshotState, SnapshotState<Float> snapshotState2, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, SnapshotState<FinishedRange> snapshotState3, Float f, Float f2, boolean z) {
        if (Intrinsics.areEqual(f, ranges3.getStart().floatValue()) || f == null) {
            f = null;
        } else if (!RangesKt.rangeTo(ranges3.getStart().floatValue(), snapshotFloatState2.getFloatValue()).contains(f)) {
            if (RangesKt.rangeTo(snapshotFloatState2.getFloatValue(), Float.MAX_VALUE).contains(f)) {
                f = Float.valueOf(snapshotFloatState2.getFloatValue());
            }
        }
        snapshotState.setValue(f);
        if (Intrinsics.areEqual(f2, ranges3.getEndInclusive().floatValue()) || f2 == null) {
            f2 = null;
        } else if (!RangesKt.rangeTo(snapshotFloatState22.getFloatValue(), ranges3.getEndInclusive().floatValue()).contains(f2)) {
            if (RangesKt.rangeTo(Float.MIN_VALUE, snapshotFloatState22.getFloatValue()).contains(f2)) {
                f2 = Float.valueOf(snapshotFloatState22.getFloatValue());
            }
        }
        snapshotState2.setValue(f2);
        if (z) {
            snapshotState3.setValue(new FinishedRange(IndicatorRangeSliderSelector$lambda$3(snapshotState), IndicatorRangeSliderSelector$lambda$6(snapshotState2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorRangeSliderSelector$lambda$34$lambda$33(FocusManager focusManager) {
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IndicatorRangeSliderSelector$lambda$55$lambda$45$lambda$39$lambda$36$lambda$35 */
    public static final Unit m1987xced0e997(SnapshotState snapshotState, SnapshotFloatState2 snapshotFloatState2, IndicatorRangeSliderSelector indicatorRangeSliderSelector, SliderValueTruncationMode sliderValueTruncationMode, float f, Ranges3 ranges3, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotFloatState2 snapshotFloatState22, SnapshotState snapshotState4, FocusState focus) throws IOException {
        Intrinsics.checkNotNullParameter(focus, "focus");
        Float fValTextToFloat = valTextToFloat(IndicatorRangeSliderSelector$lambda$27(snapshotState));
        if (!focus.getHasFocus() && fValTextToFloat == null) {
            snapshotState.setValue(IndicatorRangeSliderSelector$formatted(snapshotFloatState2.getFloatValue(), indicatorRangeSliderSelector, sliderValueTruncationMode, f));
            IndicatorRangeSliderSelector$updateRange$default(ranges3, snapshotState2, snapshotState3, snapshotFloatState22, snapshotFloatState2, snapshotState4, Float.valueOf(snapshotFloatState2.getFloatValue()), null, false, 384, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IndicatorRangeSliderSelector$lambda$55$lambda$45$lambda$39$lambda$38$lambda$37 */
    public static final Unit m1988xf89a4f1b(float f, SnapshotState snapshotState, SnapshotState4 snapshotState4, Ranges3 ranges3, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, SnapshotState snapshotState5, String valueChange) throws IOException {
        Intrinsics.checkNotNullParameter(valueChange, "valueChange");
        snapshotState.setValue(valueChange);
        Float fValTextToFloat = valTextToFloat(valueChange);
        if (fValTextToFloat != null) {
            IndicatorRangeSliderSelector$updateRange$default(ranges3, snapshotState2, snapshotState3, snapshotFloatState2, snapshotFloatState22, snapshotState5, Float.valueOf(scaleAndNormalize(fValTextToFloat.floatValue(), IndicatorRangeSliderSelector$lambda$25(snapshotState4), f)), null, false, 384, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IndicatorRangeSliderSelector$lambda$55$lambda$45$lambda$44$lambda$41$lambda$40 */
    public static final Unit m1989x35940065(SnapshotState snapshotState, SnapshotFloatState2 snapshotFloatState2, IndicatorRangeSliderSelector indicatorRangeSliderSelector, SliderValueTruncationMode sliderValueTruncationMode, float f, Ranges3 ranges3, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotFloatState2 snapshotFloatState22, SnapshotState snapshotState4, FocusState focus) throws IOException {
        Intrinsics.checkNotNullParameter(focus, "focus");
        Float fValTextToFloat = valTextToFloat(IndicatorRangeSliderSelector$lambda$30(snapshotState));
        if (!focus.getHasFocus() && fValTextToFloat == null) {
            snapshotState.setValue(IndicatorRangeSliderSelector$formatted(snapshotFloatState2.getFloatValue(), indicatorRangeSliderSelector, sliderValueTruncationMode, f));
            IndicatorRangeSliderSelector$updateRange$default(ranges3, snapshotState2, snapshotState3, snapshotFloatState2, snapshotFloatState22, snapshotState4, null, Float.valueOf(snapshotFloatState2.getFloatValue()), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IndicatorRangeSliderSelector$lambda$55$lambda$45$lambda$44$lambda$43$lambda$42 */
    public static final Unit m1990x5f5d65e9(float f, SnapshotState snapshotState, SnapshotState4 snapshotState4, Ranges3 ranges3, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, SnapshotState snapshotState5, String valueChange) throws IOException {
        Intrinsics.checkNotNullParameter(valueChange, "valueChange");
        snapshotState.setValue(valueChange);
        Float fValTextToFloat = valTextToFloat(valueChange);
        if (fValTextToFloat != null) {
            IndicatorRangeSliderSelector$updateRange$default(ranges3, snapshotState2, snapshotState3, snapshotFloatState2, snapshotFloatState22, snapshotState5, null, Float.valueOf(scaleAndNormalize(fValTextToFloat.floatValue(), IndicatorRangeSliderSelector$lambda$25(snapshotState4), f)), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit IndicatorRangeSliderSelector$lambda$55$lambda$53$lambda$52(float f, SnapshotState4 snapshotState4, Ranges3 ranges3, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, SnapshotState snapshotState3, SnapshotFloatState2 snapshotFloatState23, SnapshotFloatState2 snapshotFloatState24, boolean z, Ranges3 range) {
        Intrinsics.checkNotNullParameter(range, "range");
        IndicatorRangeSliderSelector$updateRange(ranges3, snapshotState, snapshotState2, snapshotFloatState2, snapshotFloatState22, snapshotState3, Float.valueOf(normalizeToSteps(((Number) range.getStart()).floatValue() - IndicatorRangeSliderSelector$lambda$19(snapshotState4), f)), Float.valueOf(normalizeToSteps(((Number) range.getEndInclusive()).floatValue() - IndicatorRangeSliderSelector$lambda$19(snapshotState4), f)), z);
        snapshotFloatState23.setFloatValue(((Number) range.getStart()).floatValue());
        snapshotFloatState24.setFloatValue(((Number) range.getEndInclusive()).floatValue());
        return Unit.INSTANCE;
    }

    public static final float scaleAndNormalize(float f, String scale, float f2) {
        int i;
        Intrinsics.checkNotNullParameter(scale, "scale");
        if (!Intrinsics.areEqual(scale, "B")) {
            i = Intrinsics.areEqual(scale, "M") ? InvestFlowConstants.MAX_ONE_TIME_AMOUNT : 1000000000;
            return normalizeToSteps(f, f2);
        }
        f *= i;
        return normalizeToSteps(f, f2);
    }

    private static final float normalizeToSteps(float f, float f2) {
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(new BigDecimal(String.valueOf(f2)));
        int iScale = bigDecimalM822m.scale();
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f));
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        BigDecimal scale = bigDecimal.setScale(iScale, roundingMode);
        Intrinsics.checkNotNull(scale);
        Intrinsics.checkNotNull(bigDecimalM822m);
        BigDecimal bigDecimalRemainder = scale.remainder(bigDecimalM822m);
        Intrinsics.checkNotNullExpressionValue(bigDecimalRemainder, "remainder(...)");
        if (bigDecimalRemainder.compareTo(bigDecimalM822m.divide(new BigDecimal(2), iScale, roundingMode)) <= 0) {
            BigDecimal bigDecimalSubtract = scale.subtract(bigDecimalRemainder);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            return bigDecimalSubtract.floatValue();
        }
        BigDecimal bigDecimalSubtract2 = bigDecimalM822m.subtract(bigDecimalRemainder);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        BigDecimal bigDecimalAdd = scale.add(bigDecimalSubtract2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd.floatValue();
    }

    public static final NumberFormatter getNumberFormatter() {
        return numberFormatter;
    }

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(0);
        numberInstance.setMaximumFractionDigits(1);
        Intrinsics.checkNotNullExpressionValue(numberInstance, "apply(...)");
        numberFormatter = new DefaultNumberFormatter(numberInstance);
    }

    public static final Float tryToFloatOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.toFloatOrNull(new Regex("[,|$|\\s]*").replace(str, ""));
    }

    public static final Float valTextToFloat(String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt) || cCharAt == '.' || cCharAt == '-') {
                sb.append(cCharAt);
            }
        }
        return tryToFloatOrNull(sb.toString());
    }
}
