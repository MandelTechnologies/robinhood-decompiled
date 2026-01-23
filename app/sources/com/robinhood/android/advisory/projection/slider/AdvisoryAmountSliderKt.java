package com.robinhood.android.advisory.projection.slider;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.util.Money;
import com.robinhood.utils.extensions.ResourceTypes;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryAmountSlider.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aO\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aI\u0010\u001a\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u0017H\u0007¢\u0006\u0004\b \u0010!\u001a$\u0010\"\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060#H\u0082@¢\u0006\u0002\u0010$\u001a\u001f\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00172\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010'\u001a\n\u0010(\u001a\u00020\u001c*\u00020)\u001a\r\u0010*\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010+\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006,²\u0006\n\u0010-\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u0006X\u008a\u0084\u0002"}, m3636d2 = {"lineCountPerItem", "", "AdvisoryAmountSlider", "", "amountList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/util/Money;", "modifier", "Landroidx/compose/ui/Modifier;", "spacing", "Landroidx/compose/ui/unit/Dp;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "onAmountChange", "Lkotlin/Function1;", "AdvisoryAmountSlider-TN_CM5M", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Tick", "type", "Lcom/robinhood/android/advisory/projection/slider/TickType;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "visible", "", "Tick-cf5BqRc", "(Lcom/robinhood/android/advisory/projection/slider/TickType;Landroidx/compose/ui/Modifier;JZLandroidx/compose/runtime/Composer;II)V", "TickSet", "tickValue", "", "showLabel", "isFirstSet", "isLastSet", "TickSet-Q1bl1hc", "(FLandroidx/compose/ui/Modifier;Ljava/lang/String;ZZZLandroidx/compose/runtime/Composer;II)V", "autoAlignToNearestTick", "", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DialEndGradient", "isStart", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toKFormat", "Ljava/math/BigDecimal;", "PreviewAdvisoryAmountSlider", "(Landroidx/compose/runtime/Composer;I)V", "feature-projected-returns_externalDebug", "alreadyAligned", "lastAlignedLineIndex", "currentAmount"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryAmountSliderKt {
    private static final int lineCountPerItem = 5;

    /* compiled from: AdvisoryAmountSlider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TickType.values().length];
            try {
                iArr[TickType.MINOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TickType.MAJOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryAmountSlider_TN_CM5M$lambda$15(ImmutableList immutableList, Modifier modifier, float f, LazyListState lazyListState, Function1 function1, int i, int i2, Composer composer, int i3) {
        m11233AdvisoryAmountSliderTN_CM5M(immutableList, modifier, f, lazyListState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DialEndGradient$lambda$22(boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DialEndGradient(z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAdvisoryAmountSlider$lambda$23(int i, Composer composer, int i2) {
        PreviewAdvisoryAmountSlider(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickSet_Q1bl1hc$lambda$19(float f, Modifier modifier, String str, boolean z, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        m11235TickSetQ1bl1hc(f, modifier, str, z, z2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tick_cf5BqRc$lambda$16(TickType tickType, Modifier modifier, long j, boolean z, int i, int i2, Composer composer, int i3) {
        m11234Tickcf5BqRc(tickType, modifier, j, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0141  */
    /* renamed from: AdvisoryAmountSlider-TN_CM5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11233AdvisoryAmountSliderTN_CM5M(final ImmutableList<Money> amountList, Modifier modifier, float f, LazyListState lazyListState, final Function1<? super Money, Unit> onAmountChange, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float fM7995constructorimpl;
        final LazyListState lazyListStateRememberLazyListState;
        Modifier modifier3;
        HapticFeedback hapticFeedback;
        float fMo5016toPx0680j_4;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        SnapshotIntState2 snapshotIntState2;
        boolean zChanged;
        Object objRememberedValue3;
        SnapshotState4 snapshotState4;
        boolean zChanged2;
        Object objRememberedValue4;
        boolean zChangedInstance;
        Object objRememberedValue5;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        boolean zChanged3;
        Object objRememberedValue7;
        LazyListState lazyListState2;
        final float f2;
        final LazyListState lazyListState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(amountList, "amountList");
        Intrinsics.checkNotNullParameter(onAmountChange, "onAmountChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1299247668);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(amountList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    fM7995constructorimpl = f;
                    i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        lazyListStateRememberLazyListState = lazyListState;
                        int i6 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 2048 : 1024;
                        i3 |= i6;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    i3 |= i6;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onAmountChange) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    f2 = fM7995constructorimpl;
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(10);
                        }
                        if ((i2 & 8) == 0) {
                            i3 &= -7169;
                            modifier3 = modifier4;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        } else {
                            modifier3 = modifier4;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier2;
                    }
                    float f3 = fM7995constructorimpl;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1299247668, i3, -1, "com.robinhood.android.advisory.projection.slider.AdvisoryAmountSlider (AdvisoryAmountSlider.kt:65)");
                    }
                    hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                    fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f3);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(-1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i7 = (i3 & 7168) ^ 3072;
                    zChanged = composerStartRestartGroup.changed(amountList) | ((i7 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$9$lambda$8(lazyListStateRememberLazyListState, amountList);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    snapshotState4 = (SnapshotState4) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Money moneyAdvisoryAmountSlider_TN_CM5M$lambda$10 = AdvisoryAmountSlider_TN_CM5M$lambda$10(snapshotState4);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged2 = ((57344 & i3) != 16384) | composerStartRestartGroup.changed(snapshotState4);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new AdvisoryAmountSliderKt$AdvisoryAmountSlider$1$1(onAmountChange, snapshotState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(moneyAdvisoryAmountSlider_TN_CM5M$lambda$10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = ((i7 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048) | composerStartRestartGroup.changedInstance(amountList);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1(lazyListStateRememberLazyListState, amountList, snapshotState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(amountList, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, i3 & 14);
                    Boolean boolValueOf = Boolean.valueOf(lazyListStateRememberLazyListState.isScrollInProgress());
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance2 = ((i7 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048) | composerStartRestartGroup.changedInstance(amountList);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new AdvisoryAmountSliderKt$AdvisoryAmountSlider$3$1(lazyListStateRememberLazyListState, amountList, snapshotState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged3 = composerStartRestartGroup.changed(fMo5016toPx0680j_4) | ((i7 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048) | composerStartRestartGroup.changedInstance(hapticFeedback);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue7 == companion.getEmpty()) {
                        LazyListState lazyListState4 = lazyListStateRememberLazyListState;
                        objRememberedValue7 = new AdvisoryAmountSliderKt$AdvisoryAmountSlider$4$1(lazyListState4, fMo5016toPx0680j_4, hapticFeedback, snapshotIntState2, null);
                        lazyListState2 = lazyListState4;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        lazyListState2 = lazyListStateRememberLazyListState;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(lazyListState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, (i3 >> 9) & 14);
                    modifier2 = modifier3;
                    BoxWithConstraints.BoxWithConstraints(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(76)), null, false, ComposableLambda3.rememberComposableLambda(2064898954, true, new AdvisoryAmountSliderKt$AdvisoryAmountSlider$5(lazyListState2, amountList, snapshotState4, f3, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f2 = f3;
                    lazyListState3 = lazyListState2;
                }
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$15(amountList, modifier5, f2, lazyListState3, onAmountChange, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            fM7995constructorimpl = f;
            if ((i & 3072) == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    float f32 = fM7995constructorimpl;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                    fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f32);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i72 = (i3 & 7168) ^ 3072;
                    if (i72 <= 2048) {
                        zChanged = composerStartRestartGroup.changed(amountList) | ((i72 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$9$lambda$8(lazyListStateRememberLazyListState, amountList);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            snapshotState4 = (SnapshotState4) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            Money moneyAdvisoryAmountSlider_TN_CM5M$lambda$102 = AdvisoryAmountSlider_TN_CM5M$lambda$10(snapshotState4);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged2 = ((57344 & i3) != 16384) | composerStartRestartGroup.changed(snapshotState4);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue4 = new AdvisoryAmountSliderKt$AdvisoryAmountSlider$1$1(onAmountChange, snapshotState4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(moneyAdvisoryAmountSlider_TN_CM5M$lambda$102, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                if (i72 <= 2048) {
                                    zChangedInstance = ((i72 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048) | composerStartRestartGroup.changedInstance(amountList);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance) {
                                        objRememberedValue5 = new AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1(lazyListStateRememberLazyListState, amountList, snapshotState, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(amountList, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, i3 & 14);
                                        Boolean boolValueOf2 = Boolean.valueOf(lazyListStateRememberLazyListState.isScrollInProgress());
                                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                                        if (i72 <= 2048) {
                                            zChangedInstance2 = ((i72 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048) | composerStartRestartGroup.changedInstance(amountList);
                                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance2) {
                                                objRememberedValue6 = new AdvisoryAmountSliderKt$AdvisoryAmountSlider$3$1(lazyListStateRememberLazyListState, amountList, snapshotState, null);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                                composerStartRestartGroup.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                                if (i72 <= 2048) {
                                                    zChanged3 = composerStartRestartGroup.changed(fMo5016toPx0680j_4) | ((i72 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048) | composerStartRestartGroup.changedInstance(hapticFeedback);
                                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                                    if (zChanged3) {
                                                        LazyListState lazyListState42 = lazyListStateRememberLazyListState;
                                                        objRememberedValue7 = new AdvisoryAmountSliderKt$AdvisoryAmountSlider$4$1(lazyListState42, fMo5016toPx0680j_4, hapticFeedback, snapshotIntState2, null);
                                                        lazyListState2 = lazyListState42;
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        EffectsKt.LaunchedEffect(lazyListState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, (i3 >> 9) & 14);
                                                        modifier2 = modifier3;
                                                        BoxWithConstraints.BoxWithConstraints(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(76)), null, false, ComposableLambda3.rememberComposableLambda(2064898954, true, new AdvisoryAmountSliderKt$AdvisoryAmountSlider$5(lazyListState2, amountList, snapshotState4, f32, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        f2 = f32;
                                                        lazyListState3 = lazyListState2;
                                                    }
                                                } else {
                                                    zChanged3 = composerStartRestartGroup.changed(fMo5016toPx0680j_4) | ((i72 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048) | composerStartRestartGroup.changedInstance(hapticFeedback);
                                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                                    if (zChanged3) {
                                                    }
                                                }
                                            }
                                        } else {
                                            zChangedInstance2 = ((i72 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048) | composerStartRestartGroup.changedInstance(amountList);
                                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance2) {
                                            }
                                        }
                                    }
                                } else {
                                    zChangedInstance = ((i72 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048) | composerStartRestartGroup.changedInstance(amountList);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance) {
                                    }
                                }
                            }
                        }
                    } else {
                        zChanged = composerStartRestartGroup.changed(amountList) | ((i72 <= 2048 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i3 & 3072) == 2048);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                        }
                    }
                }
            }
            final Modifier modifier52 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        fM7995constructorimpl = f;
        if ((i & 3072) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        final Modifier modifier522 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvisoryAmountSlider_TN_CM5M$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Money AdvisoryAmountSlider_TN_CM5M$lambda$9$lambda$8(LazyListState lazyListState, ImmutableList immutableList) {
        Object obj;
        int viewportEndOffset = lazyListState.getLayoutInfo().getViewportEndOffset() / 2;
        Iterator<T> it = lazyListState.getLayoutInfo().getVisibleItemsInfo().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                int iAbs = Math.abs((lazyListItemInfo.getOffset() + (lazyListItemInfo.getSize() / 2)) - viewportEndOffset);
                do {
                    Object next2 = it.next();
                    LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next2;
                    int iAbs2 = Math.abs((lazyListItemInfo2.getOffset() + (lazyListItemInfo2.getSize() / 2)) - viewportEndOffset);
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        int index = ((LazyListItemInfo) obj) != null ? r6.getIndex() - 1 : 0;
        if (index < 0) {
            return (Money) CollectionsKt.first((List) immutableList);
        }
        return index > immutableList.size() + (-1) ? (Money) CollectionsKt.last((List) immutableList) : (Money) immutableList.get(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Money AdvisoryAmountSlider_TN_CM5M$lambda$10(SnapshotState4<Money> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AdvisoryAmountSlider_TN_CM5M$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: Tick-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11234Tickcf5BqRc(final TickType type2, Modifier modifier, long j, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        long jM21427getFg30d7_KjU;
        boolean z2;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        float fM7995constructorimpl;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(type2, "type");
        Composer composerStartRestartGroup = composer.startRestartGroup(350881215);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(type2.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jM21427getFg30d7_KjU = j;
                int i7 = composerStartRestartGroup.changed(jM21427getFg30d7_KjU) ? 256 : 128;
                i3 |= i7;
            } else {
                jM21427getFg30d7_KjU = j;
            }
            i3 |= i7;
        } else {
            jM21427getFg30d7_KjU = j;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier2 = i6 == 0 ? Modifier.INSTANCE : modifier;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    }
                    i4 = i3;
                    if (i8 == 0) {
                        z3 = true;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(350881215, i4, -1, "com.robinhood.android.advisory.projection.slider.Tick (AdvisoryAmountSlider.kt:206)");
                    }
                    i5 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                    if (i5 == 1) {
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(10);
                    } else if (i5 == 2) {
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(14);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(ModifiersKt.isInvisible(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier2, C2002Dp.m7995constructorimpl(1)), fM7995constructorimpl), !z3), jM21427getFg30d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier2 = modifier;
                    i4 = i3;
                }
                z3 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                i5 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                if (i5 == 1) {
                }
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(ModifiersKt.isInvisible(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier2, C2002Dp.m7995constructorimpl(1)), fM7995constructorimpl), !z3), jM21427getFg30d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z2 = z3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
            }
            final long j2 = jM21427getFg30d7_KjU;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                final boolean z4 = z2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryAmountSliderKt.Tick_cf5BqRc$lambda$16(type2, modifier3, j2, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                i4 = i3;
                if (i8 == 0) {
                    z3 = z2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                i5 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                if (i5 == 1) {
                }
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(ModifiersKt.isInvisible(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier2, C2002Dp.m7995constructorimpl(1)), fM7995constructorimpl), !z3), jM21427getFg30d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z2 = z3;
            }
        }
        final long j22 = jM21427getFg30d7_KjU;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013b  */
    /* renamed from: TickSet-Q1bl1hc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11235TickSetQ1bl1hc(final float f, Modifier modifier, String str, boolean z, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        final String str3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final boolean z7;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        final boolean z8;
        final boolean z9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1623144406);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
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
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z4 = z;
                        i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            z5 = z2;
                            i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 == 0) {
                            if ((196608 & i) == 0) {
                                z6 = z3;
                                i3 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
                            }
                            if ((i3 & 74899) != 74898 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                str3 = str2;
                                z7 = z4;
                                z8 = z5;
                                z9 = z6;
                            } else {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                str3 = i4 == 0 ? "" : str2;
                                boolean z10 = i5 == 0 ? true : z4;
                                boolean z11 = i6 == 0 ? false : z5;
                                boolean z12 = i7 == 0 ? false : z6;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1623144406, i3, -1, "com.robinhood.android.advisory.projection.slider.TickSet (AdvisoryAmountSlider.kt:229)");
                                }
                                Alignment.Companion companion = Alignment.INSTANCE;
                                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier4, C2002Dp.m7995constructorimpl(5), 0.0f, 2, null);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
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
                                Modifier modifier5 = modifier4;
                                AnimatedVisibilityKt.AnimatedVisibility(Column6.INSTANCE, z10, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambda3.rememberComposableLambda(1747089188, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$TickSet$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                        invoke(animatedVisibilityScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i9) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1747089188, i9, -1, "com.robinhood.android.advisory.projection.slider.TickSet.<anonymous>.<anonymous> (AdvisoryAmountSlider.kt:239)");
                                        }
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        TextStyle textM = bentoTheme.getTypography(composer2, i10).getTextM();
                                        long jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i10).m21427getFg30d7_KjU();
                                        BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(2), 7, null), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composer2, 817889328, 0, 7544);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1600518 | ((i3 >> 6) & 112), 18);
                                z7 = z10;
                                composerStartRestartGroup = composerStartRestartGroup;
                                Alignment.Vertical bottom = companion.getBottom();
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(f);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, bottom, composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                TickType tickType = TickType.MINOR;
                                m11234Tickcf5BqRc(tickType, null, 0L, !z11, composerStartRestartGroup, 6, 6);
                                m11234Tickcf5BqRc(tickType, null, 0L, !z11, composerStartRestartGroup, 6, 6);
                                m11234Tickcf5BqRc(TickType.MAJOR, null, 0L, false, composerStartRestartGroup, 6, 14);
                                m11234Tickcf5BqRc(tickType, null, 0L, !z12, composerStartRestartGroup, 6, 6);
                                m11234Tickcf5BqRc(tickType, null, 0L, !z12, composerStartRestartGroup, 6, 6);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier5;
                                z8 = z11;
                                z9 = z12;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return AdvisoryAmountSliderKt.TickSet_Q1bl1hc$lambda$19(f, modifier3, str3, z7, z8, z9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 196608;
                        z6 = z3;
                        if ((i3 & 74899) != 74898) {
                            if (i8 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally2 = companion4.getCenterHorizontally();
                            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifier4, C2002Dp.m7995constructorimpl(5), 0.0f, 2, null);
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                                Modifier modifier52 = modifier4;
                                AnimatedVisibilityKt.AnimatedVisibility(Column6.INSTANCE, z10, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambda3.rememberComposableLambda(1747089188, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$TickSet$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                        invoke(animatedVisibilityScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i9) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1747089188, i9, -1, "com.robinhood.android.advisory.projection.slider.TickSet.<anonymous>.<anonymous> (AdvisoryAmountSlider.kt:239)");
                                        }
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        TextStyle textM = bentoTheme.getTypography(composer2, i10).getTextM();
                                        long jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i10).m21427getFg30d7_KjU();
                                        BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(2), 7, null), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composer2, 817889328, 0, 7544);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1600518 | ((i3 >> 6) & 112), 18);
                                z7 = z10;
                                composerStartRestartGroup = composerStartRestartGroup;
                                Alignment.Vertical bottom2 = companion4.getBottom();
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(f);
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, bottom2, composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
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
                                    TickType tickType2 = TickType.MINOR;
                                    m11234Tickcf5BqRc(tickType2, null, 0L, !z11, composerStartRestartGroup, 6, 6);
                                    m11234Tickcf5BqRc(tickType2, null, 0L, !z11, composerStartRestartGroup, 6, 6);
                                    m11234Tickcf5BqRc(TickType.MAJOR, null, 0L, false, composerStartRestartGroup, 6, 14);
                                    m11234Tickcf5BqRc(tickType2, null, 0L, !z12, composerStartRestartGroup, 6, 6);
                                    m11234Tickcf5BqRc(tickType2, null, 0L, !z12, composerStartRestartGroup, 6, 6);
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                    z8 = z11;
                                    z9 = z12;
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z5 = z2;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                    }
                    z6 = z3;
                    if ((i3 & 74899) != 74898) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                z5 = z2;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                z6 = z3;
                if ((i3 & 74899) != 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            z5 = z2;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            z6 = z3;
            if ((i3 & 74899) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z5 = z2;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        z6 = z3;
        if ((i3 & 74899) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object autoAlignToNearestTick(LazyListState lazyListState, List<Money> list, Continuation<? super Unit> continuation) {
        Object obj;
        Object objAnimateScrollToItem;
        int viewportEndOffset = lazyListState.getLayoutInfo().getViewportEndOffset() / 2;
        Iterator<T> it = lazyListState.getLayoutInfo().getVisibleItemsInfo().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                int iAbs = Math.abs((lazyListItemInfo.getOffset() + (lazyListItemInfo.getSize() / 2)) - viewportEndOffset);
                do {
                    Object next2 = it.next();
                    LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next2;
                    int iAbs2 = Math.abs((lazyListItemInfo2.getOffset() + (lazyListItemInfo2.getSize() / 2)) - viewportEndOffset);
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        LazyListItemInfo lazyListItemInfo3 = (LazyListItemInfo) obj;
        return (lazyListItemInfo3 == null || (objAnimateScrollToItem = lazyListState.animateScrollToItem(RangesKt.coerceIn(lazyListItemInfo3.getIndex(), 1, list.size()), (lazyListItemInfo3.getSize() / 2) - viewportEndOffset, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objAnimateScrollToItem;
    }

    public static final void DialEndGradient(final boolean z, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        List listListOf;
        Composer composerStartRestartGroup = composer.startRestartGroup(61367819);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(61367819, i3, -1, "com.robinhood.android.advisory.projection.slider.DialEndGradient (AdvisoryAmountSlider.kt:283)");
            }
            float f = 40;
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(modifier, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f));
            Brush.Companion companion = Brush.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1447015176);
                listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU()), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())});
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1446914984);
                listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU())});
                composerStartRestartGroup.endReplaceGroup();
            }
            BoxKt.Box(Background3.background$default(modifierM5174width3ABfNKs, Brush.Companion.m6676horizontalGradient8A3gB4$default(companion, listListOf, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryAmountSliderKt.DialEndGradient$lambda$22(z, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String toKFormat(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (bigDecimal.compareTo(new BigDecimal(1000)) >= 0) {
            return bigDecimal.divide(new BigDecimal(1000)).setScale(2, RoundingMode.DOWN) + "K";
        }
        String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNull(plainString);
        return plainString;
    }

    public static final void PreviewAdvisoryAmountSlider(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1692811899);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1692811899, i, -1, "com.robinhood.android.advisory.projection.slider.PreviewAdvisoryAmountSlider (AdvisoryAmountSlider.kt:311)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$AdvisoryAmountSliderKt.INSTANCE.m11237getLambda$924641475$feature_projected_returns_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryAmountSliderKt.PreviewAdvisoryAmountSlider$lambda$23(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
