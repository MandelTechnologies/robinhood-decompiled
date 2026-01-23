package com.robinhood.android.optionschain.sbschain.datepicker;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabPosition;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.material3.TabRowKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePicker3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainExpDatePicker.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"OptionSideBySideChainExpDatePicker", "", "adjustedExpirationDateStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "currentIndex", "", "onPageIndexUpdated", "Lkotlin/Function1;", "(Lkotlinx/collections/immutable/ImmutableList;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "RemoveMinTabWidth", "(Landroidx/compose/runtime/Composer;I)V", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePickerKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainExpDatePicker3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainExpDatePicker$lambda$0(ImmutableList immutableList, int i, Function1 function1, int i2, Composer composer, int i3) {
        OptionSideBySideChainExpDatePicker(immutableList, i, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RemoveMinTabWidth$lambda$2(int i, Composer composer, int i2) {
        RemoveMinTabWidth(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionSideBySideChainExpDatePicker(final ImmutableList<OptionChainExpirationDateState> immutableList, int i, final Function1<? super Integer, Unit> onPageIndexUpdated, Composer composer, final int i2) {
        int i3;
        final int i4 = i;
        Intrinsics.checkNotNullParameter(onPageIndexUpdated, "onPageIndexUpdated");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1452493118);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPageIndexUpdated) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1452493118, i3, -1, "com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePicker (OptionSideBySideChainExpDatePicker.kt:24)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            i4 = i;
            TabRowKt.m5991ScrollableTabRowsKfQg0A(i4, null, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), C2002Dp.m7995constructorimpl(0), ComposableLambda3.rememberComposableLambda(-1954755678, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePickerKt.OptionSideBySideChainExpDatePicker.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                    invoke((List<TabPosition>) list, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(List<TabPosition> tabPositions, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1954755678, i6, -1, "com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePicker.<anonymous> (OptionSideBySideChainExpDatePicker.kt:33)");
                    }
                    TabPosition tabPosition = (TabPosition) CollectionsKt.getOrNull(tabPositions, i4);
                    if (tabPosition != null) {
                        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                        tabRowDefaults.m5988SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPosition), C2002Dp.m7995constructorimpl(2), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21368getAccent0d7_KjU(), composer2, (TabRowDefaults.$stable << 9) | 48, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), OptionSideBySideChainExpDatePicker.INSTANCE.m17237getLambda$3473887$feature_options_chain_externalDebug(), ComposableLambda3.rememberComposableLambda(1281588642, true, new C244732(immutableList, i4, onPageIndexUpdated), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 14376960, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePickerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainExpDatePicker3.OptionSideBySideChainExpDatePicker$lambda$0(immutableList, i4, onPageIndexUpdated, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OptionSideBySideChainExpDatePicker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePickerKt$OptionSideBySideChainExpDatePicker$2 */
    static final class C244732 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<OptionChainExpirationDateState> $adjustedExpirationDateStates;
        final /* synthetic */ int $currentIndex;
        final /* synthetic */ Function1<Integer, Unit> $onPageIndexUpdated;

        /* JADX WARN: Multi-variable type inference failed */
        C244732(ImmutableList<OptionChainExpirationDateState> immutableList, int i, Function1<? super Integer, Unit> function1) {
            this.$adjustedExpirationDateStates = immutableList;
            this.$currentIndex = i;
            this.$onPageIndexUpdated = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1281588642, i, -1, "com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePicker.<anonymous> (OptionSideBySideChainExpDatePicker.kt:43)");
            }
            ImmutableList<OptionChainExpirationDateState> immutableList = this.$adjustedExpirationDateStates;
            if (immutableList != null) {
                final int i2 = this.$currentIndex;
                final Function1<Integer, Unit> function1 = this.$onPageIndexUpdated;
                final int i3 = 0;
                for (OptionChainExpirationDateState optionChainExpirationDateState : immutableList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final OptionChainExpirationDateState optionChainExpirationDateState2 = optionChainExpirationDateState;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(16), C2002Dp.m7995constructorimpl(14));
                    boolean z = i2 == i3;
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged = composer2.changed(function1) | composer2.changed(i3);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePickerKt$OptionSideBySideChainExpDatePicker$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionSideBySideChainExpDatePicker3.C244732.invoke$lambda$2$lambda$1$lambda$0(function1, i3);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    TabKt.m5981TabbogVsAg(z, (Function0) objRememberedValue, modifierM5143paddingVpY3zN4, false, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(966243013, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePickerKt$OptionSideBySideChainExpDatePicker$2$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(column5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 Tab, Composer composer3, int i5) throws Resources.NotFoundException {
                            long jM21425getFg0d7_KjU;
                            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                            if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(966243013, i5, -1, "com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePicker.<anonymous>.<anonymous>.<anonymous> (OptionSideBySideChainExpDatePicker.kt:51)");
                            }
                            Resources resources = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            String expirationStringMedium = DateStrings2.getExpirationStringMedium(resources, optionChainExpirationDateState2.getExpirationDate(), optionChainExpirationDateState2.getUiOptionChain().getOptionChain().getSettleOnOpen());
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer3, i6).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                            if (i2 == i3) {
                                composer3.startReplaceGroup(475309741);
                                jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i6).m21368getAccent0d7_KjU();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(475394929);
                                jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(expirationStringMedium, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textStyleM7655copyp1EtxEg$default, composer3, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 12583296, 120);
                    composer2 = composer;
                    i3 = i4;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, int i) {
            function1.invoke(Integer.valueOf(i));
            return Unit.INSTANCE;
        }
    }

    private static final void RemoveMinTabWidth(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-116894253);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-116894253, i, -1, "com.robinhood.android.optionschain.sbschain.datepicker.RemoveMinTabWidth (OptionSideBySideChainExpDatePicker.kt:76)");
            }
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OptionSideBySideChainExpDatePicker5(null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePickerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainExpDatePicker3.RemoveMinTabWidth$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
